import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class225 {

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "[I")
    public static int[] field3504 = new int[2048];

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "Lbm;")
    public static class137 field3501;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "Llb;")
    public static class211 field3502;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Lbh;", line = 7)
    public static final class274 method1603(int arg0, int arg1) {
        field3503++;
        class274 var2 = (class274) class299.field4706.method1432((byte) 120, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class204.field3237.method1507(class177.method1283((byte) -89, arg0), (byte) 42, class227.method1614(arg0, 15653));
        class274 var4 = new class274();
        var4.field4206 = arg0;
        if (var3 != null) {
            var4.method1909(new class35(var3), (byte) 38);
        }
        var4.method1900(6172);
        if (var4.field4156 != -1) {
            var4.method1915(-94, method1603(var4.field4156, 0), method1603(var4.field4148, arg1));
        }
        if (~var4.field4177 != arg1) {
            var4.method1911(true, method1603(var4.field4195, 0), method1603(var4.field4177, 0));
        }
        if (!class200.field3180 && var4.field4200) {
            var4.field4184 = class270.field4082;
            var4.field4161 = false;
            var4.field4151 = 0;
            var4.field4149 = class67.field1001;
            var4.field4165 = class180.field2700;
        }
        class299.field4706.method1436(false, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)Z", line = 51)
    public static final boolean method1604(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class6.field55; var3++) {
            class96 var4 = class292.field4592[var3];
            if (var4.field1401 == 1) {
                int var5 = var4.field1419 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field1420 * var5 >> 8) + var4.field1407;
                    int var7 = (var4.field1422 * var5 >> 8) + var4.field1427;
                    int var8 = (var4.field1403 * var5 >> 8) + var4.field1406;
                    int var9 = (var4.field1418 * var5 >> 8) + var4.field1415;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field1401 == 2) {
                int var10 = arg0 - var4.field1419;
                if (var10 > 0) {
                    int var11 = (var4.field1420 * var10 >> 8) + var4.field1407;
                    int var12 = (var4.field1422 * var10 >> 8) + var4.field1427;
                    int var13 = (var4.field1403 * var10 >> 8) + var4.field1406;
                    int var14 = (var4.field1418 * var10 >> 8) + var4.field1415;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field1401 == 3) {
                int var15 = var4.field1407 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field1411 * var15 >> 8) + var4.field1419;
                    int var17 = (var4.field1425 * var15 >> 8) + var4.field1416;
                    int var18 = (var4.field1403 * var15 >> 8) + var4.field1406;
                    int var19 = (var4.field1418 * var15 >> 8) + var4.field1415;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field1401 == 4) {
                int var20 = arg2 - var4.field1407;
                if (var20 > 0) {
                    int var21 = (var4.field1411 * var20 >> 8) + var4.field1419;
                    int var22 = (var4.field1425 * var20 >> 8) + var4.field1416;
                    int var23 = (var4.field1403 * var20 >> 8) + var4.field1406;
                    int var24 = (var4.field1418 * var20 >> 8) + var4.field1415;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field1401 == 5) {
                int var25 = arg1 - var4.field1406;
                if (var25 > 0) {
                    int var26 = (var4.field1411 * var25 >> 8) + var4.field1419;
                    int var27 = (var4.field1425 * var25 >> 8) + var4.field1416;
                    int var28 = (var4.field1420 * var25 >> 8) + var4.field1407;
                    int var29 = (var4.field1422 * var25 >> 8) + var4.field1427;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(DB)V", line = 175)
    public static final void method1605(double arg0, byte arg1) {
        if (arg1 != -88) {
            return;
        }
        field3505++;
        if (class302.field4723 == arg0) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
            class98.field1454[var3] = var4 > 255 ? 255 : var4;
        }
        class302.field4723 = arg0;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V", line = 208)
    public static void method1606(byte arg0) {
        field3501 = null;
        if (arg0 != 74) {
            field3504 = (int[]) null;
        }
        field3504 = null;
        field3502 = null;
    }
}
