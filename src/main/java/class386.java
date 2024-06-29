import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class386 extends class305 {

    @OriginalMember(owner = "client!kp", name = "K", descriptor = "I")
    private int field5679 = 4096;

    @OriginalMember(owner = "client!kp", name = "L", descriptor = "I")
    private int field5680 = 0;

    @OriginalMember(owner = "client!kp", name = "J", descriptor = "I")
    public static int field5678 = 0;

    @OriginalMember(owner = "client!kp", name = "N", descriptor = "Lmo;")
    public static class271 field5682 = new class271(11, 17);

    @OriginalMember(owner = "client!kp", name = "Q", descriptor = "I")
    public static int field5685 = -1;

    @OriginalMember(owner = "client!kp", name = "R", descriptor = "[I")
    public static int[] field5686 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!kp", name = "E", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!kp", name = "F", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!kp", name = "H", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!kp", name = "I", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!kp", name = "M", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!kp", name = "O", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!kp", name = "P", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILae;Lcl;Lza;)V")
    public static final void method2454(int arg0, class30 arg1, class53 arg2, class299 arg3) {
        ++field5674;
        class363 var4 = arg1.method181(1579123101, arg3);
        if (var4 != null) {
            int var5 = var4.method398();
            if (~var5 > ~var4.method399()) {
                var5 = var4.method399();
            }
            if (arg0 <= 71) {
                method2457(122, 72, -63, 91, 85, 60, 47, false, 44, 104);
            }
            byte var6 = 10;
            int var7 = arg2.field820;
            int var8 = arg2.field823;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            if (arg1.field337 != null) {
                var9 = class258.field4149.method166((class363[]) null, (int[]) null, arg1.field337, class185.field2842, 5256);
                for (int var12 = 0; ~var12 > ~var9; ++var12) {
                    String var13 = class185.field2842[var12];
                    if (var12 < var9 - 1) {
                        var13 = var13.substring(0, -4 + var13.length());
                    }
                    int var14 = class507.field7377.method1254(var13);
                    if (var14 > var10) {
                        var10 = var14;
                    }
                }
                var11 = class507.field7377.method1253() * var9 - -(class507.field7377.method1251() / 2);
            }
            int var15 = var5 / 2 + arg2.field820;
            if (var7 < class362.field5344 + var5) {
                var7 = class362.field5344;
                var15 = var5 / 2 + var6 + 5 + class362.field5344 - -(var10 / 2);
            } else if (~(class362.field5346 - var5) > ~var7) {
                var7 = -var5 + class362.field5346;
                var15 = -(var5 / 2) + class362.field5346 - var6 + -(var10 / 2) + -5;
            }
            int var16 = arg2.field823;
            if (~var8 > ~(class362.field5358 + var5)) {
                var8 = class362.field5358;
                var16 = var5 / 2 + class362.field5358 + var6;
            } else if (-var5 + class362.field5360 < var8) {
                var16 = -(var5 / 2) + class362.field5360 + -var11 + -var6;
                var8 = class362.field5360 - var5;
            }
            int var17 = 65535 & (int) (32767.0D * (Math.atan2((double) (var7 - arg2.field820), (double) (var8 - arg2.field823)) / 3.141592653589793D));
            var4.method2317((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
            int var18 = -2;
            int var19 = -2;
            int var20 = -2;
            int var21 = -2;
            if (arg1.field337 != null) {
                var18 = -(var10 / 2) + var15 + -5;
                var19 = var16;
                var20 = var18 + 10 + var10;
                var21 = 3 + var16 + var9 * class507.field7377.method1253();
                if (~arg1.field364 != -1) {
                    arg3.method1991(var16, arg1.field364, -var18 + var20, -var16 + var21, 44, var18);
                }
                if (~arg1.field339 != -1) {
                    arg3.method1992(var18, (byte) -58, var16, var20 - var18, -var16 + var21, arg1.field339);
                }
                for (int var22 = 0; var22 < var9; ++var22) {
                    String var23 = class185.field2842[var22];
                    if (var22 < var9 + -1) {
                        var23 = var23.substring(0, var23.length() + -4);
                    }
                    class507.field7377.method1249(arg3, var23, var15, var16, arg1.field327, true);
                    var16 += class507.field7377.method1253();
                }
            }
            if (~arg1.field331 != 0 || arg1.field337 != null) {
                class377 var24 = new class377(arg2);
                int var25 = var5 >> 1;
                var24.field5560 = -var25 + var8;
                var24.field5563 = var7 - var25;
                var24.field5564 = var21;
                var24.field5568 = var8 - -var25;
                var24.field5562 = var20;
                var24.field5569 = var7 + var25;
                var24.field5561 = var19;
                var24.field5565 = var18;
                class328.field4965.method292((byte) 121, var24);
            }
        }
    }

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "(I)I")
    public static final int method2455(int arg0) {
        ++field5681;
        if (arg0 > -83) {
            method2456(-58);
        }
        class242 var1 = class98.field1525;
        synchronized (class98.field1525) {
            return class98.field1525.method1636((byte) 89);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILfh;B)V")
    public final void method14(int arg0, class194 arg1, byte arg2) {
        ++field5677;
        if (arg2 < 76) {
            field5678 = -126;
        }
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field5679 = arg1.method1396(-96);
            }
        } else {
            this.field5680 = arg1.method1396(33);
        }
    }

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "(I)V")
    public static void method2456(int arg0) {
        field5686 = null;
        field5682 = null;
        if (arg0 != -11929) {
            field5685 = 63;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIIIIZII)V")
    public static final void method2457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        if (arg7) {
            method2455(-18);
        }
        if (class232.field3492 <= arg2 && ~class36.field453 <= ~arg2 && ~class232.field3492 >= ~arg8 && arg8 <= class36.field453 && ~class232.field3492 >= ~arg3 && arg3 <= class36.field453 && ~class232.field3492 >= ~arg9 && ~class36.field453 <= ~arg9 && ~arg0 <= ~class487.field7124 && ~class232.field3493 <= ~arg0 && ~class487.field7124 >= ~arg6 && class232.field3493 >= arg6 && arg4 >= class487.field7124 && arg4 <= class232.field3493 && ~arg5 <= ~class487.field7124 && class232.field3493 >= arg5) {
            class223.method1543(arg9, arg0, arg4, 0, arg2, arg3, arg5, arg1, arg6, arg8);
        } else {
            class206.method1437(arg2, arg5, arg6, arg0, arg3, arg8, arg4, arg9, 4655, arg1);
        }
        ++field5684;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V")
    public class386() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field5675;
        int[] var3 = super.field4677.method2174(arg0, 96);
        if (arg1 != 4688) {
            this.method14(-50, (class194) null, (byte) 6);
        }
        if (super.field4677.field5040) {
            int[] var4 = this.method2021(0, arg0, arg1 ^ 4688);
            for (int var5 = 0; ~var5 > ~class91.field1471; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~this.field5680 >= ~var6 && ~this.field5679 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "(B)V")
    public static final void method2458(byte arg0) {
        class242 var1 = class98.field1525;
        synchronized (class98.field1525) {
            class98.field1525.method1630(-55);
        }
        ++field5676;
        class242 var2 = class162.field2439;
        synchronized (class162.field2439) {
            if (arg0 != 90) {
                method2455(-43);
            }
            class162.field2439.method1630(-61);
        }
    }
}
