import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class302 {

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "Lmn;")
    public static class161 field4628 = null;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "Lec;")
    public static class99 field4627 = new class99(64);

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field4629;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "I")
    public static int field4631;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(JZZ)V", line = 4)
    public static final void method2075(long arg0, boolean arg1, boolean arg2) {
        field4631++;
        if (arg0 == 0L) {
            return;
        }
        if (class153.field2321 >= 100) {
            class262.method1840("", class178.field2832, 0, -11);
            return;
        }
        String var4 = class336.method2344(23827, arg0);
        for (int var5 = 0; var5 < class153.field2321; var5++) {
            if (class162.field2626[var5] == arg0) {
                class262.method1840("", var4 + class121.field1864, 0, -102);
                return;
            }
        }
        for (int var6 = 0; var6 < class159.field2416; var6++) {
            if (class110.field1659[var6] == arg0) {
                class262.method1840("", class240.field3668 + var4 + class168.field2717, 0, -110);
                return;
            }
        }
        if (var4.equals(class39.field575.field4218)) {
            class262.method1840("", class339.field5269, 0, -69);
            return;
        }
        class162.field2626[class153.field2321] = arg0;
        class212.field3254++;
        class102.field1469[class153.field2321] = class8.method80(arg0, (byte) -43);
        class339.field5266[class153.field2321++] = arg1;
        class338.field5255 = class12.field155;
        class85.field1236.method1141((byte) 108, 253);
        class85.field1236.method1738((byte) 55, arg0);
        if (!arg2) {
            field4627 = (class99) null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lke;IIIIIIZ)V", line = 69)
    public static final void method2076(class271 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field4238.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field4238[var9] - class336.field5227;
            int var11 = arg0.field4234[var9] - class295.field4557;
            int var12 = arg0.field4239[var9] - class262.field4035;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field4248 != null) {
                class271.field4247[var9] = var13;
                class271.field4233[var9] = var16;
                class271.field4241[var9] = var17;
            }
            class271.field4231[var9] = (var13 << 9) / var17 + class164.field2667;
            class271.field4232[var9] = (var16 << 9) / var17 + class164.field2666;
        }
        class164.field2665 = 0;
        int var19 = arg0.field4236.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field4236[var20];
            int var22 = arg0.field4240[var20];
            int var23 = arg0.field4245[var20];
            int var24 = class271.field4231[var21];
            int var25 = class271.field4231[var22];
            int var26 = class271.field4231[var23];
            int var27 = class271.field4232[var21];
            int var28 = class271.field4232[var22];
            int var29 = class271.field4232[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class95.field1368 && class205.method1482(class71.field1019 + class164.field2667, class240.field3669 + class164.field2666, var27, var28, var29, var24, var25, var26)) {
                    class257.field3933 = arg5;
                    class264.field4101 = arg6;
                }
                if (!class73.field1058 && !arg7) {
                    class164.field2658 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class164.field2661 || var25 > class164.field2661 || var26 > class164.field2661) {
                        class164.field2658 = true;
                    }
                    if (arg0.field4248 == null || arg0.field4248[var20] == -1) {
                        if (arg0.field4228[var20] != 12345678) {
                            class164.method1230(var27, var28, var29, var24, var25, var26, arg0.field4228[var20], arg0.field4237[var20], arg0.field4249[var20]);
                        }
                    } else if (!class258.field3983) {
                        int var30 = class164.field2662.method672(-28889, arg0.field4248[var20]);
                        class164.method1230(var27, var28, var29, var24, var25, var26, class220.method1568(var30, arg0.field4228[var20]), class220.method1568(var30, arg0.field4237[var20]), class220.method1568(var30, arg0.field4249[var20]));
                    } else if (arg0.field4235) {
                        class164.method1239(var27, var28, var29, var24, var25, var26, arg0.field4228[var20], arg0.field4237[var20], arg0.field4249[var20], class271.field4247[0], class271.field4247[1], class271.field4247[3], class271.field4233[0], class271.field4233[1], class271.field4233[3], class271.field4241[0], class271.field4241[1], class271.field4241[3], arg0.field4248[var20]);
                    } else {
                        class164.method1239(var27, var28, var29, var24, var25, var26, arg0.field4228[var20], arg0.field4237[var20], arg0.field4249[var20], class271.field4247[var21], class271.field4247[var22], class271.field4247[var23], class271.field4233[var21], class271.field4233[var22], class271.field4233[var23], class271.field4241[var21], class271.field4241[var22], class271.field4241[var23], arg0.field4248[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V", line = 195)
    public static void method2077(byte arg0) {
        field4627 = null;
        field4628 = null;
        if (arg0 != 60) {
            method2076((class271) null, -124, -99, 81, -66, 20, 107, false);
        }
    }
}
