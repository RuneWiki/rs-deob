import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class161 extends class751 {

    @OriginalMember(owner = "client!as", name = "A", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!as", name = "C", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!as", name = "D", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!as", name = "F", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!as", name = "G", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!as", name = "B", descriptor = "Lqda;")
    public static class112 field2373;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(II)[I", line = 3)
    public final int[] method365(int arg0, int arg1) {
        field2372++;
        if (arg1 != 4095) {
            method1271(-15, null, 10, -64, -124, -56);
        }
        return class179.field2708;
    }

    @OriginalMember(owner = "client!as", name = "c", descriptor = "(I)V", line = 14)
    public static final void method1269(int arg0) {
        if (arg0 != 0) {
            field2373 = null;
        }
        field2374++;
        while (class26.field371.method2139(true, class440.field6294) >= 15) {
            int var1 = class26.field371.method2138(15, (byte) -105);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            class14 var3 = (class14) class543.field7606.method380((byte) -3, (long) var1);
            if (var3 == null) {
                class645 var4 = new class645();
                var4.field6361 = var1;
                var3 = new class14(var4);
                class543.field7606.method384((long) var1, var3, false);
                var2 = true;
                class642.field9044[class662.field9292++] = var3;
            }
            class645 var5 = var3.field262;
            class790.field10846[class26.field379++] = var1;
            var5.field6401 = class153.field2277;
            if (var5.field9071 != null && var5.field9071.method1807((byte) -121)) {
                class179.method1355(false, var5);
            }
            int var6 = class26.field371.method2138(5, (byte) -105);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class26.field371.method2138(1, (byte) -105);
            if (var7 == 1) {
                class70.field960[class747.field10380++] = var1;
            }
            int var8 = class26.field371.method2138(3, (byte) -105) + 4 << 11 & 0x3EFB;
            var5.method3686(class21.field322.method1466((byte) 69, class26.field371.method2138(14, (byte) -105)), (byte) -52);
            int var9 = class26.field371.method2138(2, (byte) -105);
            int var10 = class26.field371.method2138(5, (byte) -105);
            if (var10 > 15) {
                var10 -= 32;
            }
            int var11 = class26.field371.method2138(1, (byte) -105);
            var5.method2703(var5.field9071.field3878, ~arg0);
            var5.field6370 = var5.field9071.field3944 << 3;
            if (var2) {
                var5.method2700(19, true, var8);
            }
            var5.method3683(var5.method2692((byte) 12), class251.field3549.field6448[0] + var6, var11 == 1, class251.field3549.field6445[0] + var10, var9, -10);
            if (var5.field9071.method1807((byte) -121)) {
                class653.method3743(var5.field6445[0], 30, 0, null, var5, var5.field7710, var5.field6448[0], null);
            }
        }
        class26.field371.method2146(false);
    }

    @OriginalMember(owner = "client!as", name = "g", descriptor = "(I)V", line = 96)
    public static void method1270(int arg0) {
        if (arg0 == 8192) {
            field2373 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "()V", line = 109)
    public class161() {
        super(0, true);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILnb;IIII)V", line = 115)
    public static final void method1271(int arg0, class315 arg1, int arg2, int arg3, int arg4, int arg5) {
        field2376++;
        if (arg1.field4679 == -1 && arg1.field4684 == null) {
            return;
        }
        int var6 = 0;
        int var7 = arg1.field4692 * class145.field1852.field9003.method978((byte) -118) >> 8;
        if (arg4 > arg1.field4694) {
            var6 += arg4 - arg1.field4694;
        } else if (arg1.field4704 > arg4) {
            var6 += arg1.field4704 - arg4;
        }
        if (arg3 > arg1.field4709) {
            var6 += arg3 - arg1.field4709;
        } else if (arg3 < arg1.field4683) {
            var6 += arg1.field4683 - arg3;
        }
        if (arg1.field4701 == 0 || arg1.field4701 < var6 - 256 || class145.field1852.field9003.method978((byte) -106) == 0 || arg1.field4698 != arg5) {
            if (arg1.field4688 != null) {
                class229.field3307.method3439(arg1.field4688);
                arg1.field4695 = null;
                arg1.field4707 = null;
                arg1.field4688 = null;
            }
            if (arg1.field4678 != null) {
                class229.field3307.method3439(arg1.field4678);
                arg1.field4678 = null;
                arg1.field4703 = null;
                arg1.field4699 = null;
            }
            return;
        }
        var6 -= 256;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = arg1.field4701 - arg1.field4682;
        if (var8 < 0) {
            var8 = arg1.field4701;
        }
        int var9 = var7;
        int var10 = var6 - arg1.field4682;
        if (var10 > 0 && var8 > 0) {
            var9 = (var8 - var10) * var7 / var8;
        }
        class251.field3549.method2692((byte) -2);
        int var11 = arg0;
        int var12 = (arg1.field4704 + arg1.field4694) / 2 - arg4;
        int var13 = (arg1.field4709 + arg1.field4683) / 2 - arg3;
        if (var12 != 0 || var13 != 0) {
            int var14 = -class118.field1478 - ((int) (Math.atan2((double) var12, (double) var13) * 2607.5945876176133D)) - 4096 & 0x3FFF;
            if (var14 > 8192) {
                var14 = 16384 - var14;
            }
            int var15;
            if (var6 <= 0) {
                var15 = 8192;
            } else if (var6 < 4096) {
                var15 = (var6 * 8192 / 4096) + 8192;
            } else {
                var15 = 16384;
            }
            var11 = (16384 - var15 >> 1) + var14 * var15 / 8192;
        }
        if (arg1.field4688 != null) {
            arg1.field4688.method1188(var9);
            arg1.field4688.method1206(var11);
        } else if (arg1.field4679 >= 0) {
            int var16 = arg1.field4689 == 256 && arg1.field4687 == 256 ? 256 : class76.method590(arg1.field4689, (byte) -16, arg1.field4687);
            if (arg1.field4702) {
                if (arg1.field4695 == null) {
                    arg1.field4695 = class198.method1436(class641.field9035, arg1.field4679);
                }
                if (arg1.field4695 != null) {
                    if (arg1.field4707 == null) {
                        arg1.field4707 = arg1.field4695.method1438(new int[] { 22050 });
                    }
                    if (arg1.field4707 != null) {
                        class154 var20 = class154.method1191(arg1.field4707, var16, var9 << 6, var11);
                        var20.method1203(-1);
                        class229.field3307.method3443(var20);
                        arg1.field4688 = var20;
                    }
                }
            } else {
                class97 var17 = class97.method683(class346.field5086, arg1.field4679, 0);
                if (var17 != null) {
                    class383 var18 = var17.method685().method2349(class789.field10832);
                    class154 var19 = class154.method1191(var18, var16, var9 << 6, var11);
                    var19.method1203(-1);
                    class229.field3307.method3443(var19);
                    arg1.field4688 = var19;
                }
            }
        }
        if (arg1.field4678 != null) {
            arg1.field4678.method1188(var9);
            arg1.field4678.method1206(var11);
            if (arg1.field4678.method3114(120)) {
                return;
            }
            arg1.field4699 = null;
            arg1.field4703 = null;
            arg1.field4678 = null;
        } else if (arg1.field4684 != null && (arg1.field4700 -= arg2) <= 0) {
            int var21 = arg1.field4689 == 256 && arg1.field4687 == 256 ? 256 : (int) ((double) (arg1.field4689 - arg1.field4687) * Math.random()) + arg1.field4687;
            if (!arg1.field4691) {
                int var22 = (int) (Math.random() * (double) arg1.field4684.length);
                class97 var23 = class97.method683(class346.field5086, arg1.field4684[var22], 0);
                if (var23 != null) {
                    class383 var24 = var23.method685().method2349(class789.field10832);
                    class154 var25 = class154.method1191(var24, var21, var9 << 6, var11);
                    var25.method1203(0);
                    class229.field3307.method3443(var25);
                    arg1.field4700 = (int) (Math.random() * (double) (arg1.field4697 - arg1.field4710)) + arg1.field4710;
                    arg1.field4678 = var25;
                    return;
                }
                return;
            }
            if (arg1.field4699 == null) {
                int var26 = (int) ((double) arg1.field4684.length * Math.random());
                arg1.field4699 = class198.method1436(class641.field9035, arg1.field4684[var26]);
            }
            if (arg1.field4699 != null) {
                if (arg1.field4703 == null) {
                    arg1.field4703 = arg1.field4699.method1438(new int[] { 22050 });
                }
                if (arg1.field4703 != null) {
                    class154 var27 = class154.method1191(arg1.field4703, var21, var9 << 6, var11);
                    var27.method1203(0);
                    class229.field3307.method3443(var27);
                    arg1.field4678 = var27;
                    arg1.field4700 = arg1.field4710 + (int) ((double) (arg1.field4697 - arg1.field4710) * Math.random());
                    return;
                }
            }
        }
    }
}
