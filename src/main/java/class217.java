import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class217 extends class34 {

    @OriginalMember(owner = "client!rs", name = "F", descriptor = "I")
    private int field3080 = 2048;

    @OriginalMember(owner = "client!rs", name = "J", descriptor = "I")
    private int field3083 = 10;

    @OriginalMember(owner = "client!rs", name = "E", descriptor = "I")
    private int field3079 = 0;

    @OriginalMember(owner = "client!rs", name = "C", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!rs", name = "D", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!rs", name = "I", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!rs", name = "L", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!rs", name = "N", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!rs", name = "G", descriptor = "[I")
    private int[] field3081;

    @OriginalMember(owner = "client!rs", name = "K", descriptor = "[I")
    private int[] field3084;

    @OriginalMember(owner = "client!rs", name = "M", descriptor = "[[I")
    public static int[][] field3086;

    static {
        new class157("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IB)[I", line = 3)
    public final int[] method64(int arg0, byte arg1) {
        ++field3087;
        int[] var3 = super.field537.method1780(arg0, (byte) 94);
        int var4 = -43 % (arg1 / 50);
        if (super.field537.field4191) {
            int var5 = class284.field3856[arg0];
            if (~this.field3079 == -1) {
                short var6 = 0;
                for (int var7 = 0; ~this.field3083 < ~var7; ++var7) {
                    if (~this.field3081[var7] >= ~var5 && ~this.field3081[var7 + 1] < ~var5) {
                        if (~var5 > ~this.field3084[var7]) {
                            var6 = 4096;
                        }
                        break;
                    }
                }
                class57.method370(var3, 0, class383.field5502, var6);
            } else {
                for (int var8 = 0; ~class383.field5502 < ~var8; ++var8) {
                    int var9 = 0;
                    short var10 = 0;
                    int var11 = class91.field1463[var8];
                    int var12 = this.field3079;
                    if (var12 != 1) {
                        if (~var12 != -3) {
                            if (~var12 == -4) {
                                var9 = (-var5 + var11 >> 1) + 2048;
                            }
                        } else {
                            var9 = (var5 + -4096 + var11 >> 1) + 2048;
                        }
                    } else {
                        var9 = var11;
                    }
                    for (int var13 = 0; this.field3083 > var13; ++var13) {
                        if (var9 >= this.field3081[var13] && ~this.field3081[var13 - -1] < ~var9) {
                            if (this.field3084[var13] > var9) {
                                var10 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var8] = var10;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(Z)V", line = 117)
    public static void method1364(boolean arg0) {
        if (arg0) {
            field3086 = null;
        }
        field3086 = null;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(III)V", line = 127)
    public static final void method1365(int arg0, int arg1, int arg2) {
        ++field3078;
        class314 var3 = class177.method1213(false, 5, arg0);
        var3.method1808(-7412);
        var3.field4253 = arg2;
        if (arg1 != 4096) {
            field3086 = null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V", line = 148)
    public class217() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lsv;II)V", line = 153)
    public final void method69(class319 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field3079 = arg0.method1869(-90);
                }
            } else {
                this.field3080 = arg0.method1844(-112);
            }
        } else {
            this.field3083 = arg0.method1869(-82);
        }
        ++field3085;
        if (arg1 <= 16) {
            this.method69((class319) null, 25, -112);
        }
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(B)V", line = 196)
    public final void method146(byte arg0) {
        ++field3082;
        this.method1366((byte) 99);
        if (arg0 > -84) {
            this.field3083 = 83;
        }
    }

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "(B)V", line = 211)
    private final void method1366(byte arg0) {
        ++field3077;
        int var2 = -74 / ((arg0 - -50) / 62);
        this.field3084 = new int[this.field3083 + 1];
        int var3 = 0;
        this.field3081 = new int[this.field3083 + 1];
        int var4 = 4096 / this.field3083;
        int var5 = this.field3080 * var4 >> 12;
        for (int var6 = 0; this.field3083 > var6; ++var6) {
            this.field3081[var6] = var3;
            this.field3084[var6] = var3 - -var5;
            var3 += var4;
        }
        this.field3081[this.field3083] = 4096;
        this.field3084[this.field3083] = this.field3084[0] + 4096;
    }
}
