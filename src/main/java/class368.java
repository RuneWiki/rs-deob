import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class368 {

    @OriginalMember(owner = "client!mn", name = "f", descriptor = "Lvl;")
    public class13 field5243 = new class13();

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field5241 = -2;

    @OriginalMember(owner = "client!mn", name = "i", descriptor = "[I")
    public static int[] field5246 = new int[1000];

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!mn", name = "e", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!mn", name = "h", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!mn", name = "j", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!mn", name = "m", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!mn", name = "n", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!mn", name = "k", descriptor = "Lvl;")
    private class13 field5248;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)I")
    public final int method2335(int arg0) {
        field5239++;
        int var2 = arg0;
        for (class13 var3 = this.field5243.field241; var3 != this.field5243; var3 = var3.field241) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)Lvl;")
    public final class13 method2336(byte arg0) {
        field5240++;
        if (arg0 <= 41) {
            return null;
        }
        class13 var2 = this.field5248;
        if (this.field5243 == var2) {
            this.field5248 = null;
            return null;
        } else {
            this.field5248 = var2.field241;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(B)V")
    public static void method2337(byte arg0) {
        field5246 = null;
        if (arg0 != 16) {
            method2339(false, (byte) -62);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZLvl;)V")
    public final void method2338(boolean arg0, class13 arg1) {
        if (arg1.field238 != null) {
            arg1.method115(arg0);
        }
        field5250++;
        arg1.field241 = this.field5243;
        arg1.field238 = this.field5243.field238;
        if (arg0) {
            arg1.field238.field241 = arg1;
            arg1.field241.field238 = arg1;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZB)V")
    public static final void method2339(boolean arg0, byte arg1) {
        field5251++;
        if (arg0) {
            if (class184.field2784 != -1) {
                class747.method4171(class184.field2784, (byte) -108);
            }
            for (class432 var2 = (class432) class323.field4473.method1469(0); var2 != null; var2 = (class432) class323.field4473.method1467(0)) {
                if (!var2.method2311((byte) 4)) {
                    var2 = (class432) class323.field4473.method1469(0);
                    if (var2 == null) {
                        break;
                    }
                }
                class422.method2587(true, false, var2, 2533);
            }
            class184.field2784 = -1;
            class323.field4473 = new class213(8);
            class196.method1401((byte) 11);
            class184.field2784 = class452.field6376;
            class212.method1455(false, 520);
            class299.method1955(-119);
            class83.method786(class184.field2784);
        }
        class426.field6128 = true;
        if (arg1 < 49) {
            field5247 = 10;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Lat;Lha;III)V")
    public static final void method2340(class378 arg0, class59 arg1, int arg2, int arg3, int arg4) {
        field5244++;
        class487 var5 = arg0.method2385(arg1, (byte) 40);
        if (var5 == null) {
            return;
        }
        if (arg4 != 22960) {
            field5246 = null;
        }
        arg1.method303(arg2, arg3, arg0.field5385 + arg2, arg0.field5465 + arg3);
        if (class318.field4392 == 2 || class318.field4392 == 5 || class746.field10334 == null) {
            arg1.method271(-16777216, var5, arg2, arg3);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class438.field6252 == 4) {
            var7 = class54.field1111;
            var9 = class667.field9105;
            var6 = 4096;
            var8 = (int) (-class451.field6366) & 0x3FFF;
        } else {
            var6 = 4096 - class548.field7552 * 16;
            var7 = class58.field1147.field5933;
            var8 = (int) (-class451.field6366) + class28.field748 & 0x3FFF;
            var9 = class58.field1147.field5922;
        }
        int var10 = 48 + 208 - ((class376.field5325 * 2) - (var9 / 128));
        int var11 = class175.field2711 * 4 + (208 - (class175.field2711 * 2 - 48)) - var7 / 128;
        class746.field10334.method2921((float) arg0.field5385 / 2.0F + (float) arg2, (float) arg0.field5465 / 2.0F + (float) arg3, (float) var10, (float) var11, var6, var8 << 2, var5, arg2, arg3);
        for (class113 var12 = (class113) class121.field2065.method1269(arg4 ^ 0x59B4); var12 != null; var12 = (class113) class121.field2065.method1264((byte) 92)) {
            int var58 = var12.field1945;
            int var59 = ((class28.field753.field4881[var58] & 0xFFFE5B0) >> 14) - class221.field3177;
            int var60 = (class28.field753.field4881[var58] & 0x3FFF) - class367.field5236;
            int var61 = var59 * 4 + 2 - (var9 / 128);
            int var62 = var60 * 4 + 2 - var7 / 128;
            class404.method2521(arg0, arg3, var5, class28.field753.field4882[var58], var61, arg2, (byte) -94, var62, arg1);
        }
        for (int var13 = 0; var13 < class556.field7684; var13++) {
            int var55 = class7.field49[var13] * 4 + 2 - var9 / 128;
            int var56 = class527.field7291[var13] * 4 + 2 - (var7 / 128);
            class99 var57 = class76.field1366.method1680(0, class245.field3541[var13]);
            if (var57.field1780 != null) {
                var57 = var57.method925(class390.field5635, (byte) 47);
                if (var57 == null || var57.field1756 == -1) {
                    continue;
                }
            }
            class404.method2521(arg0, arg3, var5, var57.field1756, var55, arg2, (byte) -113, var56, arg1);
        }
        for (class206 var14 = (class206) class491.field6801.method1469(arg4 ^ 0x59B0); var14 != null; var14 = (class206) class491.field6801.method1467(0)) {
            int var50 = (int) (var14.field5204 >> 28 & 0x3L);
            if (class511.field7109 == var50) {
                int var51 = (int) (var14.field5204 & 0x3FFFL) - class221.field3177;
                int var52 = (int) (var14.field5204 >> 14 & 0x3FFFL) - class367.field5236;
                int var53 = var51 * 4 + 2 - (var9 / 128);
                int var54 = var52 * 4 + 2 - (var7 / 128);
                class256.method1739(arg3, class682.field9238[0], arg2, arg0, var5, var54, arg4 ^ 0x59B2, var53);
            }
        }
        for (int var15 = 0; var15 < class738.field9939; var15++) {
            class751 var45 = (class751) class86.field1546.method1465((long) class737.field9925[var15], -6008);
            if (var45 != null) {
                class9 var46 = var45.field10510;
                if (var46.method56((byte) -126) && class58.field1147.field5926 == var46.field5926) {
                    class334 var47 = var46.field126;
                    if (var47 != null && var47.field4694 != null) {
                        var47 = var47.method2110(class390.field5635, -1);
                    }
                    if (var47 != null && var47.field4714 && var47.field4713) {
                        int var48 = var46.field5922 / 128 - (var9 / 128);
                        int var49 = var46.field5933 / 128 - (var7 / 128);
                        if (var47.field4700 == -1) {
                            class256.method1739(arg3, class682.field9238[1], arg2, arg0, var5, var49, 2, var48);
                        } else {
                            class404.method2521(arg0, arg3, var5, var47.field4700, var48, arg2, (byte) -73, var49, arg1);
                        }
                    }
                }
            }
        }
        int var16 = class219.field3167;
        int[] var17 = class87.field1561;
        for (int var18 = 0; var18 < var16; var18++) {
            class598 var37 = class49.field1040[var17[var18]];
            if (var37 != null && var37.method3405((byte) 37) && !var37.field8196 && class58.field1147 != var37 && class58.field1147.field5926 == var37.field5926) {
                int var38 = var37.field5922 / 128 - (var9 / 128);
                int var39 = var37.field5933 / 128 - (var7 / 128);
                boolean var40 = false;
                for (int var41 = 0; var41 < class443.field6289; var41++) {
                    if (var37.field8189.equals(class648.field8912[var41]) && class59.field1169[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class237.field3446; var43++) {
                    if (var37.field8189.equals(class166.field2601[var43].field2965)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class58.field1147.field8187 != 0 && var37.field8187 != 0 && class58.field1147.field8187 == var37.field8187) {
                    var44 = true;
                }
                if (var37.field8199) {
                    class256.method1739(arg3, class682.field9238[6], arg2, arg0, var5, var39, arg4 - 22958, var38);
                } else if (var40) {
                    class256.method1739(arg3, class682.field9238[3], arg2, arg0, var5, var39, 2, var38);
                } else if (var42) {
                    class256.method1739(arg3, class682.field9238[5], arg2, arg0, var5, var39, arg4 - 22958, var38);
                } else if (var44) {
                    class256.method1739(arg3, class682.field9238[4], arg2, arg0, var5, var39, 2, var38);
                } else {
                    class256.method1739(arg3, class682.field9238[2], arg2, arg0, var5, var39, 2, var38);
                }
            }
        }
        class741[] var19 = class55.field1118;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class741 var23 = var19[var20];
            if (var23 != null && var23.field9982 != 0 && class641.field8810 % 20 < 10) {
                if (var23.field9982 == 1) {
                    class751 var24 = (class751) class86.field1546.method1465((long) var23.field9975, -6008);
                    if (var24 != null) {
                        class9 var25 = var24.field10510;
                        int var26 = var25.field5922 / 128 - (var9 / 128);
                        int var27 = var25.field5933 / 128 - (var7 / 128);
                        class190.method1369(360000L, arg3, -125, var27, arg2, arg0, var26, var23.field9973, var5);
                    }
                }
                if (var23.field9982 == 2) {
                    int var28 = var23.field9977 / 128 - (var9 / 128);
                    int var29 = var23.field9974 / 128 - (var7 / 128);
                    long var30 = (long) (var23.field9979 << 7);
                    long var32 = var30 * var30;
                    class190.method1369(var32, arg3, -112, var29, arg2, arg0, var28, var23.field9973, var5);
                }
                if (var23.field9982 == 10 && var23.field9975 >= 0 && class49.field1040.length > var23.field9975) {
                    class598 var34 = class49.field1040[var23.field9975];
                    if (var34 != null) {
                        int var35 = var34.field5922 / 128 - (var9 / 128);
                        int var36 = var34.field5933 / 128 - (var7 / 128);
                        class190.method1369(360000L, arg3, -121, var36, arg2, arg0, var35, var23.field9973, var5);
                    }
                }
            }
        }
        if (class438.field6252 == 4) {
            return;
        }
        if (class295.field4138 != 0) {
            int var21 = class295.field4138 * 4 + 2 - (var9 / 128) - (-(class58.field1147.method2457((byte) 77) * 2) - -2);
            int var22 = class136.field2279 * 4 + (class58.field1147.method2457((byte) 59) - 1) * 2 - (var7 / 128 - 2);
            class256.method1739(arg3, class160.field2568[class6.field46 ? 1 : 0], arg2, arg0, var5, var22, 2, var21);
        }
        if (!class58.field1147.field8196) {
            arg1.method624(3, (byte) -125, arg2 + (arg0.field5385 / 2) - 1, arg0.field5465 / 2 + arg3 + -1, 3, -1);
            return;
        }
    }

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)Lvl;")
    public final class13 method2341(int arg0) {
        if (arg0 != 20) {
            this.field5248 = null;
        }
        field5249++;
        class13 var2 = this.field5243.field241;
        if (this.field5243 == var2) {
            return null;
        } else {
            var2.method115(true);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V")
    public final void method2342(int arg0) {
        field5242++;
        if (arg0 != 2110355138) {
            return;
        }
        while (true) {
            class13 var2 = this.field5243.field241;
            if (this.field5243 == var2) {
                this.field5248 = null;
                return;
            }
            var2.method115(true);
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZZ)V")
    public static final void method2343(boolean arg0, boolean arg1) {
        class184.field2783.method778(class569.field7823.method320());
        field5238++;
        int[] var2 = class569.field7823.method188();
        class407.field5956 = var2[2];
        class295.field4137 = var2[0];
        class581.field7959 = var2[3];
        class602.field8263 = var2[1];
        if (arg1) {
            class569.field7823.method179(class660.field9033, class583.field7977, class65.field1252, class417.field6036);
            class184.method1343(true, class121.field2060);
        } else {
            class569.field7823.method179(class679.field9210, class731.field9884, class700.field9470, class349.field4874);
            class184.method1343(true, class310.field4317);
        }
        if (arg0) {
            method2343(true, true);
        }
    }

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "(I)Lvl;")
    public final class13 method2344(int arg0) {
        if (arg0 > -23) {
            method2339(false, (byte) -34);
        }
        field5245++;
        class13 var2 = this.field5243.field241;
        if (this.field5243 == var2) {
            this.field5248 = null;
            return null;
        } else {
            this.field5248 = var2.field241;
            return var2;
        }
    }

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
    public class368() {
        this.field5243.field238 = this.field5243;
        this.field5243.field241 = this.field5243;
    }
}
