import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class256 extends class305 {

    @OriginalMember(owner = "client!na", name = "G", descriptor = "I")
    private int field4115 = 4;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "I")
    private int field4116 = 4;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "Z")
    public static boolean field4112 = false;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "I")
    public static int field4118 = 0;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "Z")
    public static boolean field4121 = false;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!na", name = "I", descriptor = "Lnh;")
    public static class522 field4117;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "Z")
    public static boolean field4122;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IB)[[I")
    public final int[][] method72(int arg0, byte arg1) {
        if (arg1 > -59) {
            field4121 = true;
        }
        ++field4120;
        int[][] var3 = super.field4674.method2206(-73, arg0);
        if (super.field4674.field5110) {
            int var4 = class91.field1471 / this.field4116;
            int var5 = class537.field7884 / this.field4115;
            int[][] var7;
            if (var5 > 0) {
                int var6 = arg0 % var5;
                var7 = this.method2015(true, 0, class537.field7884 * var6 / var5);
            } else {
                var7 = this.method2015(true, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; ~class91.field1471 < ~var14; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class91.field1471 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(CBI)I")
    public static final int method1808(char arg0, byte arg1, int arg2) {
        ++field4114;
        if (arg1 >= -43) {
            field4122 = true;
        }
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            arg0 = Character.toLowerCase(arg0);
            var3 = (arg0 << 4) + 1;
        }
        if (arg0 == 241 && ~arg2 == -1) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILfh;B)V")
    public final void method14(int arg0, class194 arg1, byte arg2) {
        if (arg2 <= 76) {
            method1808((char) 65441, (byte) -8, -53);
        }
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field4115 = arg1.method1337((byte) 87);
            }
        } else {
            this.field4116 = arg1.method1337((byte) -117);
        }
        ++field4119;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lbc;IIII)V")
    public static final void method1809(class512 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class43.method281(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class474.field6947) {
            class43.method281(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class43.method281(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class443.field6603) {
            class43.method281(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class443.field6603) {
            class43.method281(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class474.field6947 && arg4 <= class443.field6603) {
            class43.method281(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class43.method281(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class474.field6947 && arg4 > 0) {
            class43.method281(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "()V")
    public class256() {
        super(1, false);
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(I)V")
    public static void method1810(int arg0) {
        if (arg0 == 28986) {
            field4117 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field4113;
        if (arg1 != 4688) {
            field4118 = 68;
        }
        int[] var3 = super.field4677.method2174(arg0, -120);
        if (super.field4677.field5040) {
            int var4 = class91.field1471 / this.field4116;
            int var5 = class537.field7884 / this.field4115;
            int[] var7;
            if (~var5 < -1) {
                int var6 = arg0 % var5;
                var7 = this.method2021(0, class537.field7884 * var6 / var5, arg1 + -4688);
            } else {
                var7 = this.method2021(0, 0, 0);
            }
            for (int var8 = 0; class91.field1471 > var8; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class91.field1471 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        return var3;
    }
}
