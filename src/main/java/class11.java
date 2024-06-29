import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class11 extends class181 {

    @OriginalMember(owner = "client!ea", name = "x", descriptor = "I")
    public int field165;

    @OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
    public int field167;

    @OriginalMember(owner = "client!ea", name = "y", descriptor = "Z")
    public static boolean field166 = false;

    @OriginalMember(owner = "client!ea", name = "s", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!ea", name = "t", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!ea", name = "v", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!ea", name = "w", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!ea", name = "u", descriptor = "Lpk;")
    public static class237 field162;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)V")
    public static final void method79(byte arg0) {
        field160++;
        if (class90.field1362 == null) {
            return;
        }
        if (class130.field1903 < 10) {
            if (!class24.field391.method1611(-1, class90.field1362.field4342)) {
                class130.field1903 = class34.field603.method1613(class90.field1362.field4342, (byte) 111) / 10;
                return;
            }
            class243.method1658(4);
            class130.field1903 = 10;
        }
        if (class130.field1903 == 10) {
            class67.field1114 = class90.field1362.field4326 >> 6 << 6;
            class141.field2029 = class90.field1362.field4329 >> 6 << 6;
            class235.field3619 = (class90.field1362.field4337 >> 6 << 6) + 64 - class67.field1114;
            class133.field1956 = (class90.field1362.field4338 >> 6 << 6) + 64 - class141.field2029;
            int[] var1 = class90.field1362.method1872((byte) -126, (class185.field2687.field425 >> 7) + class90.field1367, class260.field3986, class188.field2774 + (class185.field2687.field455 >> 7));
            int var2 = -1;
            int var3 = -1;
            if (var1 != null) {
                var2 = var1[1] - class141.field2029;
                var3 = class235.field3619 + class67.field1114 - var1[2] - 1;
            }
            if (var2 >= 0 && var2 < class133.field1956 && var3 >= 0 && class235.field3619 > var3) {
                int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
                class12.field171 = var4;
                int var5 = var2 + (int) (Math.random() * 10.0D) - 5;
                class220.field3433 = var5;
            } else if (class156.field2282 == -1 || class51.field836 == -1) {
                int[] var7 = class90.field1362.method1874(class90.field1362.field4345 & 0x3FFF, class90.field1362.field4345 >> 14 & 0x3FFF, false);
                class12.field171 = class67.field1114 + class235.field3619 - var7[2] - 1;
                class220.field3433 = var7[1] - class141.field2029;
            } else {
                int[] var6 = class90.field1362.method1874(class51.field836, class156.field2282, false);
                if (var6 != null) {
                    class220.field3433 = var6[1] - class141.field2029;
                    class12.field171 = class235.field3619 - (var6[2] - class67.field1114) - 1;
                }
                class51.field836 = -1;
                class156.field2282 = -1;
            }
            if (class90.field1362.field4341 == 37) {
                class78.field1243 = 3.0F;
                class44.field777 = 3.0F;
            } else if (class90.field1362.field4341 == 50) {
                class78.field1243 = 4.0F;
                class44.field777 = 4.0F;
            } else if (class90.field1362.field4341 == 75) {
                class78.field1243 = 6.0F;
                class44.field777 = 6.0F;
            } else if (class90.field1362.field4341 == 100) {
                class78.field1243 = 8.0F;
                class44.field777 = 8.0F;
            } else if (class90.field1362.field4341 == 200) {
                class78.field1243 = 16.0F;
                class44.field777 = 16.0F;
            } else {
                class78.field1243 = 8.0F;
                class44.field777 = 8.0F;
            }
            class160.method1083(30661);
            class148.field2150 = new int[class235.field3617 + 1];
            int var8 = class133.field1956 >> 6;
            int var9 = class235.field3619 >> 6;
            class77.field1218 = new int[var8][var9][];
            class63.field1059 = new byte[var8][var9][];
            class218.field3344 = new byte[var8][var9][];
            class164.field2403 = new byte[var8][var9][];
            class243.field3765 = new byte[var8][var9][];
            class208.field3119 = new int[var8][var9][];
            class122.field1815 = new int[var8][var9][];
            int var10 = class155.field2269 >> 1;
            class226.field3528 = new byte[var8][var9][];
            int var11 = class194.field2937 >> 2 << 10;
            class50.method382(var11, var10, 126);
            class130.field1903 = 20;
        } else if (class130.field1903 == 20) {
            class246.method1691(0, new class54(class24.field391.method1615(class90.field1362.field4342, "underlay", 0)));
            class130.field1903 = 30;
            class142.method969(true, (byte) 107);
            class231.method1573(-114);
        } else if (class130.field1903 == 30) {
            class21.method144(new class54(class24.field391.method1615(class90.field1362.field4342, "overlay", 0)), 21);
            class130.field1903 = 40;
            class231.method1573(-96);
        } else if (class130.field1903 == 40) {
            class202.method1344(new class54(class24.field391.method1615(class90.field1362.field4342, "overlay2", 0)), -111);
            class130.field1903 = 50;
            class231.method1573(-91);
        } else if (class130.field1903 == 50) {
            class217.method1461(-32223, new class54(class24.field391.method1615(class90.field1362.field4342, "loc", 0)));
            class130.field1903 = 60;
            class142.method969(true, (byte) 107);
            class231.method1573(-99);
        } else if (class130.field1903 == 60) {
            if (class24.field391.method1622(class90.field1362.field4342 + "_labels", -1)) {
                if (!class24.field391.method1611(-1, class90.field1362.field4342 + "_labels")) {
                    return;
                }
                class154.field2251 = class27.method194(64, class24.field391, class90.field1362.field4342 + "_labels");
            } else {
                class154.field2251 = new class240(0);
            }
            class130.field1903 = 70;
            class231.method1573(-51);
        } else if (class130.field1903 == 70) {
            class58.field960 = new class158(11, true, class297.field4569);
            class130.field1903 = 73;
            class142.method969(true, (byte) 107);
            class231.method1573(-91);
        } else if (class130.field1903 == 73) {
            class139.field2016 = new class158(12, true, class297.field4569);
            class130.field1903 = 76;
            class142.method969(true, (byte) 107);
            class231.method1573(-99);
        } else if (class130.field1903 == 76) {
            class34.field605 = new class158(14, true, class297.field4569);
            class130.field1903 = 79;
            class142.method969(true, (byte) 107);
            class231.method1573(-106);
        } else if (class130.field1903 == 79) {
            class270.field4219 = new class158(17, true, class297.field4569);
            class130.field1903 = 82;
            class142.method969(true, (byte) 107);
            class231.method1573(-113);
        } else {
            if (arg0 >= -70) {
                method81(105);
            }
            if (class130.field1903 == 82) {
                class143.field2073 = new class158(19, true, class297.field4569);
                class130.field1903 = 85;
                class142.method969(true, (byte) 107);
                class231.method1573(-96);
            } else if (class130.field1903 == 85) {
                class78.field1225 = new class158(22, true, class297.field4569);
                class130.field1903 = 88;
                class142.method969(true, (byte) 107);
                class231.method1573(-88);
            } else if (class130.field1903 == 88) {
                class170.field2499 = new class158(26, true, class297.field4569);
                class130.field1903 = 91;
                class142.method969(true, (byte) 107);
                class231.method1573(-125);
            } else {
                class180.field2620 = new class158(30, true, class297.field4569);
                class130.field1903 = 100;
                class142.method969(true, (byte) 107);
                class231.method1573(-53);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method80(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field161++;
        class243.method1655(arg2, -83);
        int var7 = 0;
        int var8 = arg2 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        int var10 = 25 % ((-arg5 - 15) / 60);
        int var11 = var8;
        int var12 = -arg2;
        int var13 = -var8;
        int var14 = -1;
        int var15 = -1;
        int[] var16 = class241.field3751[arg1];
        int var17 = arg4 - var8;
        class222.method1519((byte) -120, arg4 - arg2, var16, var17, arg3);
        int var18 = arg4 + var8;
        class222.method1519((byte) -115, var17, var16, var18, arg6);
        class222.method1519((byte) -128, var18, var16, arg4 + arg2, arg3);
        while (var9 > var7) {
            var15 += 2;
            var14 += 2;
            var12 += var14;
            var13 += var15;
            if (var13 >= 0 && var11 >= 1) {
                class13.field187[var11] = var7;
                var11--;
                var13 -= var11 << 1;
            }
            var7++;
            if (var12 >= 0) {
                var9--;
                if (var9 < var8) {
                    int[] var19 = class241.field3751[arg1 - var9];
                    int[] var20 = class241.field3751[arg1 + var9];
                    int var21 = class13.field187[var9];
                    int var22 = arg4 + var7;
                    int var23 = arg4 - var7;
                    int var24 = arg4 + var21;
                    int var25 = arg4 - var21;
                    class222.method1519((byte) -113, var23, var20, var25, arg3);
                    class222.method1519((byte) -118, var25, var20, var24, arg6);
                    class222.method1519((byte) -123, var24, var20, var22, arg3);
                    class222.method1519((byte) -115, var23, var19, var25, arg3);
                    class222.method1519((byte) -120, var25, var19, var24, arg6);
                    class222.method1519((byte) -111, var24, var19, var22, arg3);
                } else {
                    int[] var26 = class241.field3751[arg1 - var9];
                    int[] var27 = class241.field3751[arg1 + var9];
                    int var28 = arg4 + var7;
                    int var29 = arg4 - var7;
                    class222.method1519((byte) -121, var29, var27, var28, arg3);
                    class222.method1519((byte) -109, var29, var26, var28, arg3);
                }
                var12 -= var9 << 1;
            }
            int[] var30 = class241.field3751[arg1 + var7];
            int[] var31 = class241.field3751[arg1 - var7];
            int var32 = arg4 - var9;
            int var33 = arg4 + var9;
            if (var8 > var7) {
                int var34 = var7 > var11 ? class13.field187[var7] : var11;
                int var35 = arg4 + var34;
                int var36 = arg4 - var34;
                class222.method1519((byte) -115, var32, var30, var36, arg3);
                class222.method1519((byte) -124, var36, var30, var35, arg6);
                class222.method1519((byte) -116, var35, var30, var33, arg3);
                class222.method1519((byte) -108, var32, var31, var36, arg3);
                class222.method1519((byte) -119, var36, var31, var35, arg6);
                class222.method1519((byte) -124, var35, var31, var33, arg3);
            } else {
                class222.method1519((byte) -117, var32, var30, var33, arg3);
                class222.method1519((byte) -115, var32, var31, var33, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
    public static void method81(int arg0) {
        int var1 = -109 % ((65 - arg0) / 47);
        field162 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)Lv;")
    public static final class69 method82(boolean arg0) {
        field164++;
        try {
            if (!arg0) {
                method82(false);
            }
            return (class69) Class.forName("l").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class79();
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(II)V")
    public class11(int arg0, int arg1) {
        this.field165 = arg0;
        this.field167 = arg1;
    }
}
