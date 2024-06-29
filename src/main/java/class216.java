import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class216 extends class301 {

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "[I")
    private int[] field3601;

    @OriginalMember(owner = "client!pl", name = "D", descriptor = "[I")
    private int[] field3596;

    @OriginalMember(owner = "client!pl", name = "G", descriptor = "Lng;")
    private class182 field3599;

    @OriginalMember(owner = "client!pl", name = "v", descriptor = "Lng;")
    private class182 field3588;

    @OriginalMember(owner = "client!pl", name = "z", descriptor = "Lng;")
    private class182 field3592;

    @OriginalMember(owner = "client!pl", name = "F", descriptor = "[Lng;")
    private class182[] field3598;

    @OriginalMember(owner = "client!pl", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field3600 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!pl", name = "L", descriptor = "Z")
    public static boolean field3604 = false;

    @OriginalMember(owner = "client!pl", name = "y", descriptor = "Ll;")
    public static class328 field3591 = new class328(32);

    @OriginalMember(owner = "client!pl", name = "O", descriptor = "I")
    public static int field3607 = 128;

    @OriginalMember(owner = "client!pl", name = "Q", descriptor = "Lg;")
    public static class181 field3609 = null;

    @OriginalMember(owner = "client!pl", name = "S", descriptor = "F")
    public static float field3610;

    @OriginalMember(owner = "client!pl", name = "w", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!pl", name = "x", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!pl", name = "A", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!pl", name = "B", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!pl", name = "C", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!pl", name = "E", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!pl", name = "K", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!pl", name = "M", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!pl", name = "N", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!pl", name = "P", descriptor = "Ljava/lang/String;")
    public static String field3608;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BILek;ZILli;)[F", line = 6)
    public final float[] method1501(byte arg0, int arg1, class206 arg2, boolean arg3, int arg4, class245 arg5) {
        class7.field260 = arg2;
        field3595++;
        float[] var7 = new float[arg1 * arg4 * 4];
        if (arg0 > -70) {
            method1511((byte) 35);
        }
        class253.field4161 = arg5;
        class101.method764((byte) -119, arg4, arg1);
        for (int var8 = 0; var8 < this.field3598.length; var8++) {
            this.field3598[var8].method1284(arg1, false, arg4);
        }
        int var9 = 0;
        for (int var10 = 0; var10 < arg4; var10++) {
            if (arg3) {
                var9 = var10 << 2;
            }
            int[] var12;
            int[] var13;
            int[] var14;
            if (this.field3588.field3154) {
                int[] var11 = this.field3588.method125(2, var10);
                var12 = var11;
                var13 = var11;
                var14 = var11;
            } else {
                int[][] var15 = this.field3588.method122(var10, 4944);
                var13 = var15[2];
                var12 = var15[0];
                var14 = var15[1];
            }
            int[] var16;
            if (this.field3592.field3154) {
                var16 = this.field3592.method125(2, var10);
            } else {
                var16 = this.field3592.method122(var10, 4944)[0];
            }
            int[] var17;
            if (this.field3599.field3154) {
                var17 = this.field3599.method125(2, var10);
            } else {
                var17 = this.field3599.method122(var10, 4944)[0];
            }
            for (int var18 = arg1 - 1; var18 >= 0; var18--) {
                float var19 = (float) var16[var18] / 4096.0F;
                float var20 = ((float) var17[var18] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if ((var19 < 0.0F)) {
                    var19 = 0.0F;
                } else if (var19 > 1.0F) {
                    var19 = 1.0F;
                }
                var7[var9++] = (float) var12[var18] * var20;
                var7[var9++] = (float) var14[var18] * var20;
                var7[var9++] = (float) var13[var18] * var20;
                var7[var9++] = var19;
                if (arg3) {
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var21 = 0; var21 < this.field3598.length; var21++) {
            this.field3598[var21].method470(2);
        }
        return var7;
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(I)V", line = 115)
    public static final void method1502(int arg0) {
        field3590++;
        if (class65.field1234 == 0) {
            return;
        }
        try {
            if (++class173.field2881 > 2000) {
                if (class127.field2224 != null) {
                    class127.field2224.method1646((byte) 93);
                    class127.field2224 = null;
                }
                if (class208.field3481 >= 1) {
                    class65.field1234 = 0;
                    class46.field927 = -5;
                    return;
                }
                class208.field3481++;
                class173.field2881 = 0;
                class65.field1234 = 1;
                if (class65.field1239 == class177.field2934) {
                    class177.field2934 = class160.field2714;
                } else {
                    class177.field2934 = class65.field1239;
                }
            }
            if (class65.field1234 == 1) {
                class41.field877 = class59.field1164.method1120(class177.field2934, class199.field3348, arg0 - 31249);
                class65.field1234 = 2;
            }
            if (class65.field1234 == 2) {
                if (class41.field877.field3504 == 2) {
                    throw new IOException();
                }
                if (class41.field877.field3504 != 1) {
                    return;
                }
                class127.field2224 = new class237((Socket) class41.field877.field3501, class59.field1164);
                class41.field877 = null;
                class127.field2224.method1645(class51.field1038.field2496, class51.field1038.field2435, -20326, 0);
                if (class125.field2205 != null) {
                    class125.field2205.method140(-78);
                }
                if (class96.field1746 != null) {
                    class96.field1746.method140(-80);
                }
                int var1 = class127.field2224.method1639((byte) 125);
                if (class125.field2205 != null) {
                    class125.field2205.method140(arg0 ^ 0xFFFFFF9A);
                }
                if (class96.field1746 != null) {
                    class96.field1746.method140(-115);
                }
                if (var1 != 21) {
                    class65.field1234 = 0;
                    class46.field927 = var1;
                    class127.field2224.method1646((byte) 99);
                    class127.field2224 = null;
                    return;
                }
                class65.field1234 = 3;
            }
            if (class65.field1234 == arg0) {
                if (class127.field2224.method1642((byte) -89) < 1) {
                    return;
                }
                class331.field5288 = new String[class127.field2224.method1639((byte) 125)];
                class65.field1234 = 4;
            }
            if (class65.field1234 == 4) {
                if (class127.field2224.method1642((byte) -89) < class331.field5288.length * 8) {
                    return;
                }
                class342.field5413.field2435 = 0;
                class127.field2224.method1643(0, class331.field5288.length * 8, (byte) -101, class342.field5413.field2496);
                for (int var2 = 0; var2 < class331.field5288.length; var2++) {
                    class331.field5288[var2] = class41.method316(class342.field5413.method991((byte) -82), 30274);
                }
                class46.field927 = 21;
                class65.field1234 = 0;
                class127.field2224.method1646((byte) 126);
                class127.field2224 = null;
                return;
            }
        } catch (IOException var4) {
            if (class127.field2224 != null) {
                class127.field2224.method1646((byte) 113);
                class127.field2224 = null;
            }
            if (class208.field3481 >= 1) {
                class65.field1234 = 0;
                class46.field927 = -4;
            } else {
                if (class65.field1239 == class177.field2934) {
                    class177.field2934 = class160.field2714;
                } else {
                    class177.field2934 = class65.field1239;
                }
                class173.field2881 = 0;
                class208.field3481++;
                class65.field1234 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZDLli;ZLek;III)[I", line = 269)
    public final int[] method1503(boolean arg0, double arg1, class245 arg2, boolean arg3, class206 arg4, int arg5, int arg6, int arg7) {
        class97.method739((byte) 102, arg1);
        field3606++;
        class253.field4161 = arg2;
        class7.field260 = arg4;
        class101.method764((byte) -105, arg5, arg7);
        for (int var10 = 0; var10 < this.field3598.length; var10++) {
            this.field3598[var10].method1284(arg7, false, arg5);
        }
        int[] var11 = new int[arg5 * arg7];
        byte var12;
        int var13;
        int var14;
        if (arg0) {
            var12 = -1;
            var13 = -1;
            var14 = arg7 - 1;
        } else {
            var13 = arg7;
            var14 = 0;
            var12 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg5; var16++) {
            if (arg3) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field3588.field3154) {
                int[] var17 = this.field3588.method125(2, var16);
                var18 = var17;
                var19 = var17;
                var20 = var17;
            } else {
                int[][] var21 = this.field3588.method122(var16, 4944);
                var18 = var21[2];
                var19 = var21[1];
                var20 = var21[0];
            }
            for (int var22 = var14; var22 != var13; var22 += var12) {
                int var23 = var20[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class124.field2176[var23];
                int var25 = var19[var22] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = class124.field2176[var25];
                int var27 = var18[var22] >> 4;
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                int var28 = class124.field2176[var27];
                var11[var15++] = (var26 << 8) + (var24 << 16) + var28;
                if (arg3) {
                    var15 += arg7 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field3598.length; var29++) {
            this.field3598[var29].method470(2);
        }
        if (arg6 != 21374) {
            this.field3588 = (class182) null;
        }
        return var11;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lek;BII)Lsc;", line = 406)
    public static final class288 method1504(class206 arg0, byte arg1, int arg2, int arg3) {
        field3603++;
        if (class76.method581(arg0, 60, arg3, arg2)) {
            if (arg1 > -45) {
                method1502(44);
            }
            return class276.method1961(5094);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZDIILek;ILli;)Lki;", line = 423)
    public final class183 method1505(boolean arg0, double arg1, int arg2, int arg3, class206 arg4, int arg5, class245 arg6) {
        field3602++;
        class97.method739((byte) 121, arg1);
        class7.field260 = arg4;
        class253.field4161 = arg6;
        class101.method764((byte) -122, arg3, arg5);
        class183 var9 = new class183(arg5, arg3);
        for (int var10 = 0; var10 < this.field3598.length; var10++) {
            this.field3598[var10].method1284(arg5, false, arg3);
        }
        int var11 = 0;
        for (int var12 = arg2; var12 < arg3; var12++) {
            if (arg0) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field3588.field3154) {
                int[] var13 = this.field3588.method125(2, var12);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field3588.method122(var12, 4944);
                var15 = var17[0];
                var14 = var17[2];
                var16 = var17[1];
            }
            int[] var18;
            if (this.field3592.field3154) {
                var18 = this.field3592.method125(2, var12);
            } else {
                var18 = this.field3592.method122(var12, arg2 + 4944)[0];
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
                int var21 = var16[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var22 = class124.field2176[var20];
                int var23 = var14[var19] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class124.field2176[var23];
                int var25 = class124.field2176[var21];
                int var26;
                if (var22 == 0 && var25 == 0 && var24 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9.field4697[var11++] = (var22 << 16) + (var26 << 24) + (var25 << 8) + var24;
                if (arg0) {
                    var11 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field3598.length; var27++) {
            this.field3598[var27].method470(arg2 + 2);
        }
        return var9;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lek;Lli;IIDIZ)[I", line = 560)
    public final int[] method1506(class206 arg0, class245 arg1, int arg2, int arg3, double arg4, int arg5, boolean arg6) {
        int[] var9 = new int[arg3 * arg5 * 4];
        field3597++;
        class97.method739((byte) 119, arg4);
        class253.field4161 = arg1;
        class7.field260 = arg0;
        class101.method764((byte) -119, arg3, arg5);
        for (int var10 = 0; var10 < this.field3598.length; var10++) {
            this.field3598[var10].method1284(arg5, false, arg3);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg3; var12++) {
            if (arg6) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field3588.field3154) {
                int[] var13 = this.field3588.method125(2, var12);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field3588.method122(var12, 4944);
                var15 = var17[0];
                var16 = var17[2];
                var14 = var17[1];
            }
            int[] var18;
            if (this.field3592.field3154) {
                var18 = this.field3592.method125(2, var12);
            } else {
                var18 = this.field3592.method122(var12, 4944)[0];
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                int var20 = var15[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                int var21 = var14[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var22 = class124.field2176[var20];
                int var23 = var16[var19] >> 4;
                if (var21 < 0) {
                    var21 = 0;
                }
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class124.field2176[var21];
                int var25 = class124.field2176[var23];
                int var26;
                if (var22 == 0 && var24 == 0 && var25 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (var24 << 8) + (var26 << 24) + (var22 << 16) + var25;
                if (arg6) {
                    var11 += arg5 - 1;
                }
            }
        }
        for (int var27 = 0; var27 < this.field3598.length; var27++) {
            this.field3598[var27].method470(2);
        }
        if (arg2 < 79) {
            field3608 = (String) null;
        }
        return var9;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBDZLli;ILek;)Lsc;", line = 693)
    public final class288 method1507(int arg0, byte arg1, double arg2, boolean arg3, class245 arg4, int arg5, class206 arg6) {
        if (arg1 != -14) {
            field3610 = -0.7813223F;
        }
        class97.method739((byte) 125, arg2);
        class253.field4161 = arg4;
        class7.field260 = arg6;
        field3605++;
        class101.method764((byte) -107, arg0, arg5);
        class288 var9 = new class288(arg5, arg0);
        for (int var10 = 0; var10 < this.field3598.length; var10++) {
            this.field3598[var10].method1284(arg5, false, arg0);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            if (arg3) {
                var11 = var12;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field3588.field3154) {
                int[] var13 = this.field3588.method125(2, var12);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field3588.method122(var12, arg1 + 4958);
                var16 = var17[1];
                var15 = var17[0];
                var14 = var17[2];
            }
            for (int var18 = arg5 - 1; var18 >= 0; var18--) {
                int var19 = var15[var18] >> 4;
                int var20 = var16[var18] >> 4;
                if (var19 > 255) {
                    var19 = 255;
                }
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var19 < 0) {
                    var19 = 0;
                }
                int var21 = class124.field2176[var19];
                int var22 = class124.field2176[var20];
                int var23 = var14[var18] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class124.field2176[var23];
                var9.field4697[var11++] = (var22 << 8) + (var21 << 16) + var24;
                if (arg3) {
                    var11 += arg5 - 1;
                }
            }
        }
        for (int var25 = 0; var25 < this.field3598.length; var25++) {
            this.field3598[var25].method470(2);
        }
        return var9;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lek;BLli;)Z", line = 813)
    public final boolean method1508(class206 arg0, byte arg1, class245 arg2) {
        field3593++;
        if (class23.field579 > 0) {
            for (int var4 = 0; var4 < this.field3601.length; var4++) {
                if (!arg0.method1421(class23.field579, this.field3601[var4], -111)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field3601.length; var5++) {
                if (!arg0.method1401(this.field3601[var5], -2689)) {
                    return false;
                }
            }
        }
        if (arg1 != -56) {
            return true;
        }
        for (int var6 = 0; var6 < this.field3596.length; var6++) {
            if (!arg2.method1733(this.field3596[var6], -98)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Loe;I)Ljava/lang/String;", line = 868)
    public static final String method1509(class146 arg0, int arg1) {
        field3594++;
        if (arg1 >= -60) {
            method1509((class146) null, -22);
        }
        return class65.method521(32767, arg0, (byte) 98);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(BI)I", line = 880)
    public static final int method1510(byte arg0, int arg1) {
        if (arg0 != -127) {
            method1510((byte) 23, 17);
        }
        field3589++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V", line = 897)
    public class216() {
        this.field3601 = new int[0];
        this.field3596 = new int[0];
        this.field3599 = new class285(0);
        this.field3599.field3164 = 1;
        this.field3588 = new class285();
        this.field3588.field3164 = 1;
        this.field3592 = new class285();
        this.field3592.field3164 = 1;
        this.field3598 = new class182[] { this.field3588, this.field3592, this.field3599 };
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Loe;)V", line = 913)
    public class216(class146 arg0) {
        int var2 = arg0.method1005((byte) 122);
        this.field3598 = new class182[var2];
        int var3 = 0;
        int[][] var4 = new int[var2][];
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class182 var7 = class233.method1622((byte) 45, arg0);
            if (var7.method1287(false) >= 0) {
                var3++;
            }
            if (var7.method469(80) >= 0) {
                var5++;
            }
            int var8 = var7.field3161.length;
            var4[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var4[var6][var9] = arg0.method1005((byte) 122);
            }
            this.field3598[var6] = var7;
        }
        this.field3601 = new int[var3];
        this.field3596 = new int[var5];
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class182 var13 = this.field3598[var12];
            int var14 = var13.field3161.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field3161[var15] = this.field3598[var4[var12][var15]];
            }
            int var16 = var13.method1287(false);
            int var17 = var13.method469(99);
            if (var16 > 0) {
                this.field3601[var11++] = var16;
            }
            if (var17 > 0) {
                this.field3596[var10++] = var17;
            }
            var4[var12] = null;
        }
        this.field3588 = this.field3598[arg0.method1005((byte) 122)];
        this.field3592 = this.field3598[arg0.method1005((byte) 122)];
        int[][] var18 = (int[][]) null;
        this.field3599 = this.field3598[arg0.method1005((byte) 122)];
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)V", line = 1002)
    public static void method1511(byte arg0) {
        field3600 = null;
        if (arg0 <= 39) {
            field3600 = (String[]) null;
        }
        field3608 = null;
        field3609 = null;
        field3591 = null;
    }
}
