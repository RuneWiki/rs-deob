import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class27 extends class170 {

    @OriginalMember(owner = "client!cd", name = "W", descriptor = "I")
    private int field544 = 4096;

    @OriginalMember(owner = "client!cd", name = "gb", descriptor = "I")
    private int field554 = 4096;

    @OriginalMember(owner = "client!cd", name = "db", descriptor = "[I")
    private int[] field551 = new int[3];

    @OriginalMember(owner = "client!cd", name = "hb", descriptor = "I")
    private int field555 = 4096;

    @OriginalMember(owner = "client!cd", name = "ib", descriptor = "I")
    private int field556 = 409;

    @OriginalMember(owner = "client!cd", name = "kb", descriptor = "Lqk;")
    private static class207 field558 = class24.method212(255, "wave2:");

    @OriginalMember(owner = "client!cd", name = "eb", descriptor = "Lqk;")
    public static class207 field552 = field558;

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "Lqk;")
    public static class207 field545 = field558;

    @OriginalMember(owner = "client!cd", name = "cb", descriptor = "I")
    public static int field550 = 0;

    @OriginalMember(owner = "client!cd", name = "lb", descriptor = "I")
    public static int field559 = -1;

    @OriginalMember(owner = "client!cd", name = "Z", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!cd", name = "bb", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!cd", name = "fb", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!cd", name = "jb", descriptor = "I")
    public static int field557;

    @OriginalMember(owner = "client!cd", name = "ab", descriptor = "Lp;")
    public static class284 field548;

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "[I")
    public static int[] field546;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method32(int arg0, boolean arg1) {
        if (arg1) {
            this.method32(32, true);
        }
        int[][] var3 = super.field3002.method427(arg0, 239);
        ++field547;
        if (super.field3002.field1077) {
            int[][] var4 = this.method1223(0, -67, arg0);
            int[] var5 = var4[0];
            int[] var6 = var3[0];
            int[] var7 = var4[2];
            int[] var8 = var4[1];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class88.field1595; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field551[0] + var12;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~var13 < ~this.field556) {
                    var6[var11] = var12;
                    var9[var11] = var8[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var8[var11];
                    int var15 = -this.field551[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 > this.field556) {
                        var6[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field551[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (this.field556 < var17) {
                            var6[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var6[var11] = this.field544 * var12 >> 12;
                            var9[var11] = this.field554 * var14 >> 12;
                            var10[var11] = this.field555 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLmd;)V")
    public static final void method218(byte arg0, class220 arg1) {
        class220 var2 = class159.method1159(arg1, -1943270064);
        if (arg0 < 1) {
            field552 = null;
        }
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class244.field4428;
            var4 = class31.field625;
        } else {
            var4 = var2.field4037;
            var3 = var2.field3948;
        }
        class204.method1413(arg1, var3, -1, var4, false);
        class46.method358(var4, arg1, var3, 30);
        ++field557;
    }

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "(I)V")
    public static void method219(int arg0) {
        field546 = null;
        field548 = null;
        field552 = null;
        field558 = null;
        field545 = null;
        if (arg0 != 0) {
            field558 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "()V")
    public class27() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 == -5) {
                            int var5 = arg0.method1065((byte) 88);
                            this.field551[2] = class121.method860(var5 >> 12, 0);
                            this.field551[1] = class121.method860(var5 >> 4, 4080);
                            this.field551[0] = class121.method860(16711680, var5) << 4;
                        }
                    } else {
                        this.field544 = arg0.method1050(1272006568);
                    }
                } else {
                    this.field554 = arg0.method1050(1272006568);
                }
            } else {
                this.field555 = arg0.method1050(1272006568);
            }
        } else {
            this.field556 = arg0.method1050(1272006568);
        }
        ++field549;
        if (arg1 != 5877) {
            field545 = null;
        }
    }
}
