import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class426 extends class646 {

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "I")
    private int field6082 = 2048;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    private int field6080 = 0;

    @OriginalMember(owner = "client!ug", name = "T", descriptor = "I")
    private int field6091 = 10;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "[I")
    public static int[] field6085 = new int[2];

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "I")
    public static int field6089 = 0;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    public static int field6083;

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
    public static int field6084;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "I")
    public static int field6088;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "[I")
    private int[] field6086;

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "[I")
    private int[] field6090;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V")
    private final void method2508(int arg0) {
        ++field6081;
        this.field6086 = new int[this.field6091 - -1];
        this.field6090 = new int[this.field6091 + 1];
        if (arg0 != 3933) {
            this.field6091 = -126;
        }
        int var2 = 0;
        int var3 = 4096 / this.field6091;
        int var4 = this.field6082 * var3 >> 12;
        for (int var5 = 0; ~this.field6091 < ~var5; ++var5) {
            this.field6086[var5] = var2;
            this.field6090[var5] = var2 + var4;
            var2 += var3;
        }
        this.field6086[this.field6091] = 4096;
        this.field6090[this.field6091] = this.field6090[0] + 4096;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lek;IB)V")
    public final void method295(class465 arg0, int arg1, byte arg2) {
        ++field6088;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    this.field6080 = arg0.method2705(-118);
                }
            } else {
                this.field6082 = arg0.method2755((byte) -78);
            }
        } else {
            this.field6091 = arg0.method2705(-88);
        }
        if (arg2 < 7) {
            field6085 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    public class426() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
    public final void method422(int arg0) {
        this.method2508(3933);
        ++field6087;
        if (arg0 != -1) {
            field6089 = 32;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static void method2509(byte arg0) {
        field6085 = null;
        if (arg0 != -11) {
            method2510(2);
        }
    }

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)V")
    public static final void method2510(int arg0) {
        class526.method3098(true);
        ++field6083;
        class248.field3610 = null;
        class319.field4403 = null;
        class125.field2052 = null;
        class506.field7522 = null;
        if (arg0 >= -69) {
            field6085 = null;
        }
        class119.field1958 = null;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(IB)[I")
    public final int[] method424(int arg0, byte arg1) {
        if (arg1 != -120) {
            return null;
        } else {
            ++field6084;
            int[] var3 = super.field9156.method2193(1269, arg0);
            if (super.field9156.field5075) {
                int var4 = class78.field1195[arg0];
                if (~this.field6080 == -1) {
                    short var5 = 0;
                    for (int var6 = 0; var6 < this.field6091; ++var6) {
                        if (~var4 <= ~this.field6086[var6] && this.field6086[var6 + 1] > var4) {
                            if (this.field6090[var6] > var4) {
                                var5 = 4096;
                            }
                            break;
                        }
                    }
                    class553.method3238(var3, 0, class89.field1330, var5);
                } else {
                    for (int var7 = 0; ~class89.field1330 < ~var7; ++var7) {
                        int var8 = 0;
                        short var9 = 0;
                        int var10 = class518.field7652[var7];
                        int var11 = this.field6080;
                        if (~var11 != -2) {
                            if (~var11 != -3) {
                                if (var11 == 3) {
                                    var8 = 2048 - -(-var4 + var10 >> 1);
                                }
                            } else {
                                var8 = 2048 - -(var4 + -4096 + var10 >> 1);
                            }
                        } else {
                            var8 = var10;
                        }
                        for (int var12 = 0; ~var12 > ~this.field6091; ++var12) {
                            if (var8 >= this.field6086[var12] && this.field6086[var12 + 1] > var8) {
                                if (var8 < this.field6090[var12]) {
                                    var9 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var7] = var9;
                    }
                }
            }
            return var3;
        }
    }
}
