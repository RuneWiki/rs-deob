import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class428 extends class17 {

    @OriginalMember(owner = "client!kq", name = "F", descriptor = "I")
    public static int field6027 = 0;

    @OriginalMember(owner = "client!kq", name = "J", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6031 = new Rectangle[100];

    @OriginalMember(owner = "client!kq", name = "G", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!kq", name = "H", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!kq", name = "I", descriptor = "I")
    public static int field6030;

    @OriginalMember(owner = "client!kq", name = "K", descriptor = "I")
    public static int field6032;

    @OriginalMember(owner = "client!kq", name = "L", descriptor = "I")
    public static int field6033;

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V")
    public class428() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIII)V")
    public static final void method2532(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6030;
        if (arg1 != 100) {
            method2532(-73, 95, -104, 61, 23, 57);
        }
        if (class353.field5062 >= arg2 && ~class303.field4422 >= ~arg5) {
            boolean var6;
            if (arg3 >= class392.field5514) {
                if (arg3 > class518.field7624) {
                    arg3 = class518.field7624;
                    var6 = false;
                } else {
                    var6 = true;
                }
            } else {
                arg3 = class392.field5514;
                var6 = false;
            }
            boolean var7;
            if (~arg4 > ~class392.field5514) {
                var7 = false;
                arg4 = class392.field5514;
            } else if (arg4 > class518.field7624) {
                arg4 = class518.field7624;
                var7 = false;
            } else {
                var7 = true;
            }
            if (~class303.field4422 < ~arg2) {
                arg2 = class303.field4422;
            } else {
                class447.method2605(-7, arg3, arg0, arg4, class112.field1523[arg2++]);
            }
            if (class353.field5062 < arg5) {
                arg5 = class353.field5062;
            } else {
                class447.method2605(arg1 ^ -99, arg3, arg0, arg4, class112.field1523[arg5--]);
            }
            if (var6 && var7) {
                for (int var8 = arg2; var8 <= arg5; ++var8) {
                    int[] var9 = class112.field1523[var8];
                    var9[arg3] = var9[arg4] = arg0;
                }
                return;
            }
            if (var6) {
                for (int var10 = arg2; ~arg5 <= ~var10; ++var10) {
                    class112.field1523[var10][arg3] = arg0;
                }
                return;
            }
            if (var7) {
                for (int var11 = arg2; ~arg5 <= ~var11; ++var11) {
                    class112.field1523[var11][arg4] = arg0;
                }
                return;
            }
        }
    }

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "(III)V")
    private final void method2533(int arg0, int arg1, int arg2) {
        ++field6029;
        int var4 = class492.field6966[arg2];
        if (arg0 != -9867) {
            this.method2533(-4, 91, -94);
        }
        int var5 = class40.field427[arg1];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class160.field2377 = arg1;
            class343.field4980 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class160.field2377 = arg2;
            class343.field4980 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class160.field2377 = arg2;
            class343.field4980 = class530.field7763 - arg1;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class343.field4980 = arg2;
            class160.field2377 = class178.field2556 - arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class343.field4980 = -arg2 + class530.field7763;
            class160.field2377 = -arg1 + class178.field2556;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class343.field4980 = class530.field7763 - arg1;
            class160.field2377 = -arg2 + class178.field2556;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class343.field4980 = arg1;
            class160.field2377 = -arg2 + class178.field2556;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class160.field2377 = arg1;
            class343.field4980 = -arg2 + class530.field7763;
        }
        class343.field4980 &= class43.field499;
        class160.field2377 &= class38.field417;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        if (arg1 < 53) {
            return null;
        } else {
            ++field6032;
            int[] var3 = super.field210.method2683(-17, arg0);
            if (super.field210.field6442) {
                for (int var4 = 0; ~var4 > ~class530.field7763; ++var4) {
                    this.method2533(-9867, arg0, var4);
                    int[] var5 = this.method88(class160.field2377, -4526, 0);
                    var3[var4] = var5[class343.field4980];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(B)V")
    public static void method2534(byte arg0) {
        if (arg0 <= -13) {
            field6031 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        if (arg1 != -25) {
            method2534((byte) -62);
        }
        ++field6028;
        int[][] var3 = super.field201.method1851(arg0, (byte) -56);
        if (super.field201.field4431) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class530.field7763 < ~var7; ++var7) {
                this.method2533(arg1 ^ 9874, arg0, var7);
                int[][] var8 = this.method91(0, arg1 ^ -25, class160.field2377);
                var4[var7] = var8[0][class343.field4980];
                var5[var7] = var8[1][class343.field4980];
                var6[var7] = var8[2][class343.field4980];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lwm;II)V")
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (arg2 != 5159) {
            field6031 = null;
        }
        ++field6033;
        if (arg1 == 0) {
            super.field205 = arg0.method2357((byte) 119) == 1;
        }
    }
}
