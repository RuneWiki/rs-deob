import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class390 {

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
    public static int field5389;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIB)V")
    public static final void method2403(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = class654.field9334.field9831.method1500(-123) * arg0 >> 8;
        if (arg3 != 77) {
            return;
        }
        field5390++;
        if (var4 == 0 || arg2 == -1) {
            return;
        }
        if (!class533.field7714 && class326.field4223 != -1 && class435.method2715(arg3 ^ 0x3B17) && !class24.method116(1)) {
            class184.field2208 = class555.method3250((byte) -101);
            class233 var5 = class345.method2058((byte) -47, class184.field2208);
            class254.method1513(true, -1, var5);
        }
        class294.method1748(15251, var4, false, class646.field9233, 0, arg2);
        class476.method2858(-1, true, 255);
        class533.field7714 = true;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V")
    public static final void method2404(int arg0) {
        field5391++;
        client var1 = class30.field343;
        synchronized (class30.field343) {
            if (class370.field4740 == null) {
                Container var2;
                if (class537.field7761 != null) {
                    var2 = class537.field7761;
                } else if (class255.field3123 == null) {
                    var2 = class471.field6735;
                } else {
                    var2 = class255.field3123;
                }
                class71.field758 = var2.getSize().width;
                class217.field2523 = var2.getSize().height;
                if (class537.field7761 == var2) {
                    Insets var3 = class537.field7761.getInsets();
                    class217.field2523 -= var3.top + var3.bottom;
                    class71.field758 -= var3.right + var3.left;
                }
                if (arg0 == ~class735.method4098(false)) {
                    class705.field9926 = class12.field92;
                    class476.field6777 = class181.field2143;
                    class504.field7104 = 0;
                    class93.field979 = (class71.field758 - class12.field92) / 2;
                } else {
                    class211.method1254(0);
                }
                if (class342.field4425 != class237.field2829) {
                    boolean var10000;
                    if (class705.field9926 < 1024 && class476.field6777 < 768) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                }
                class618.field8849.setSize(class705.field9926, class476.field6777);
                if (class275.field3370 != null) {
                    if (class397.field5443) {
                        class578.method3335(class618.field8849, true);
                    } else {
                        class275.field3370.method427(class618.field8849, class705.field9926, class476.field6777);
                    }
                }
                if (class537.field7761 == var2) {
                    Insets var4 = class537.field7761.getInsets();
                    class618.field8849.setLocation(class93.field979 + var4.left, class504.field7104 + var4.top);
                } else {
                    class618.field8849.setLocation(class93.field979, class504.field7104);
                }
                if (class327.field4245 != -1) {
                    class296.method1762(112, true);
                }
                class161.method997(0);
            }
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lwp;Lefa;BII)V")
    public static final void method2405(class179 arg0, class183 arg1, byte arg2, int arg3, int arg4) {
        field5389++;
        byte var5 = -1;
        if ((arg4 & 0x4000) != 0) {
            int var6 = arg0.method1474((byte) -9);
            int var7 = arg0.method1451(true);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var8 = arg0.method1450(-126);
            int var9 = var8 & 0x7;
            int var10 = (var8 & 0x79) >> 3;
            if (var10 == 15) {
                var10 = -1;
            }
            arg1.method2997(var9, true, (byte) -22, var6, var10, var7);
        }
        if ((arg4 & 0x200) != 0) {
            arg1.field7172 = arg0.method1472(108);
            arg1.field7176 = arg0.method1419((byte) 30);
            arg1.field7096 = arg0.method1419((byte) 30);
            arg1.field7073 = arg0.method1419((byte) 30);
            arg1.field7141 = arg0.method1474((byte) 117) + class392.field5398;
            arg1.field7167 = arg0.method1439((byte) 65) + class392.field5398;
            arg1.field7119 = arg0.method1423(-91);
            if (arg1.field2165) {
                arg1.field7184 = 0;
                arg1.field7176 += arg1.field2150;
                arg1.field7172 += arg1.field2195;
                arg1.field7073 += arg1.field2150;
                arg1.field7096 += arg1.field2195;
            } else {
                arg1.field7172 += arg1.field7187[0];
                arg1.field7073 += arg1.field7193[0];
                arg1.field7096 += arg1.field7187[0];
                arg1.field7184 = 1;
                arg1.field7176 += arg1.field7193[0];
            }
            arg1.field7188 = 0;
        }
        if ((arg4 & 0x100) != 0) {
            int var11 = arg0.method1450(-118);
            int[] var12 = new int[var11];
            int[] var13 = new int[var11];
            int[] var14 = new int[var11];
            for (int var15 = 0; var15 < var11; var15++) {
                int var16 = arg0.method1443(-1);
                if (var16 == 65535) {
                    var16 = -1;
                }
                var12[var15] = var16;
                var13[var15] = arg0.method1450(-123);
                var14[var15] = arg0.method1443(-1);
            }
            class557.method3268(var14, -100, var12, var13, arg1);
        }
        if ((arg4 & 0x2) != 0) {
            int var17 = arg0.method1476(-99);
            if (var17 == 65535) {
                var17 = -1;
            }
            arg1.field7148 = var17;
        }
        if ((arg4 & 0x4) != 0) {
            arg1.field2197 = arg0.method1476(22);
            if (arg1.field7184 == 0) {
                arg1.method3003((byte) -79, arg1.field2197);
                arg1.field2197 = -1;
            }
        }
        if ((arg4 & 0x2000) != 0) {
            arg1.field7125 = arg0.method1468(-1468860088);
            if (arg1.field7125.charAt(0) == '~') {
                arg1.field7125 = arg1.field7125.substring(1);
                class74.method536(arg1.field7125, arg1.method1129(true, -2), 2, 0, (byte) -117, arg1.method1133(false, 0), arg1.field2161);
            } else if (class90.field937 == arg1) {
                class74.method536(arg1.field7125, arg1.method1129(true, -2), 2, 0, (byte) -61, arg1.method1133(false, 0), arg1.field2161);
            }
            arg1.field7165 = 0;
            arg1.field7079 = 150;
            arg1.field7163 = 0;
        }
        if ((arg4 & 0x8) != 0) {
            int var18 = arg0.method1476(-2);
            if (var18 == 65535) {
                var18 = -1;
            }
            int var19 = arg0.method1438(90);
            int var20 = arg0.method1425((byte) 18);
            int var21 = var20 & 0x7;
            int var22 = (var20 & 0x7A) >> 3;
            if (var22 == 15) {
                var22 = -1;
            }
            arg1.method2997(var21, false, (byte) -22, var18, var22, var19);
        }
        if ((arg4 & 0x80) != 0) {
            int[] var23 = new int[4];
            for (int var24 = 0; var24 < 4; var24++) {
                var23[var24] = arg0.method1474((byte) -102);
                if (var23[var24] == 65535) {
                    var23[var24] = -1;
                }
            }
            int var25 = arg0.method1423(-8);
            class357.method2106(var25, 103, arg1, var23);
        }
        if ((arg4 & 0x20) != 0) {
            class311.field3859[arg3] = arg0.method1437((byte) 80);
        }
        if ((arg4 & 0x20000) != 0) {
            int var26 = class392.field5398;
            int var27 = arg0.method1463(3010);
            int var28 = arg0.method1426((byte) 39);
            arg1.method2991(var26, var27, var28, -11752);
        }
        if ((arg4 & 0x40) != 0) {
            int var29 = arg0.method1425((byte) 18);
            byte[] var30 = new byte[var29];
            class244 var31 = new class244(var30);
            arg0.method1442(false, var29, 0, var30);
            class633.field9108[arg3] = var31;
            arg1.method1134(var31, (byte) 45);
        }
        if (arg2 >= -32) {
            return;
        }
        if ((arg4 & 0x800) != 0) {
            var5 = arg0.method1448((byte) -106);
        }
        if ((arg4 & 0x10000) != 0) {
            int var32 = arg0.method1426((byte) 39);
            int[] var33 = new int[var32];
            int[] var34 = new int[var32];
            for (int var35 = 0; var35 < var32; var35++) {
                int var36 = arg0.method1439((byte) -90);
                if ((var36 & 0xC000) == 49152) {
                    int var37 = arg0.method1474((byte) -125);
                    var33[var35] = class695.method3919(var36 << 16, var37);
                } else {
                    var33[var35] = var36;
                }
                var34[var35] = arg0.method1439((byte) 70);
            }
            arg1.method3002(0, var34, var33);
        }
        if ((arg4 & 0x400) != 0) {
            arg1.field2176 = arg0.method1425((byte) 18) == 1;
        }
        if ((arg4 & 0x40000) != 0) {
            arg1.field7137 = arg0.method1472(68);
            arg1.field7090 = arg0.method1419((byte) 30);
            arg1.field7099 = arg0.method1419((byte) 30);
            arg1.field7169 = (byte) arg0.method1450(-126);
            arg1.field7124 = class392.field5398 + arg0.method1443(-1);
            arg1.field7088 = class392.field5398 + arg0.method1474((byte) -102);
        }
        if ((arg4 & 0x8000) != 0) {
            int var38 = arg0.method1476(97);
            arg1.field7174 = arg0.method1423(-43);
            arg1.field7128 = arg0.method1426((byte) 39);
            arg1.field7113 = var38 & 0x7FFF;
            arg1.field7114 = (var38 & 0x8000) != 0;
            arg1.field7171 = arg1.field7174 + arg1.field7113 + class392.field5398;
        }
        if ((arg4 & 0x10) != 0) {
            int var39 = arg0.method1463(3010);
            int var40 = arg0.method1450(-120);
            arg1.method2991(class392.field5398, var39, var40, -11752);
            arg1.field7180 = class392.field5398 + 300;
            arg1.field7078 = arg0.method1426((byte) 39);
        }
        if (!arg1.field2165) {
            return;
        }
        if (var5 == 127) {
            arg1.method1132(arg1.field2195, arg1.field2150, 0);
            return;
        }
        byte var41;
        if (var5 == -1) {
            var41 = class311.field3859[arg3];
        } else {
            var41 = var5;
        }
        class158.method976(arg1, var41, (byte) -115);
        arg1.method1141((byte) -119, arg1.field2195, var41, arg1.field2150);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "()V")
    public static final void method2406() {
        for (int var0 = 0; var0 < class472.field6766.length; var0++) {
            class472.field6766[var0].method568();
        }
        class472.field6766 = null;
    }
}
