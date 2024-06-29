import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class33 {

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "Lad;")
    private class342 field494 = new class342();

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "Lad;")
    private class342 field495 = new class342();

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "Lad;")
    private class342 field496 = new class342();

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "Lad;")
    private class342 field497 = new class342();

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "Lsb;")
    private class190 field499 = new class190(4);

    @OriginalMember(owner = "client!dl", name = "I", descriptor = "I")
    public volatile int field504 = 0;

    @OriginalMember(owner = "client!dl", name = "H", descriptor = "I")
    public volatile int field503 = 0;

    @OriginalMember(owner = "client!dl", name = "G", descriptor = "B")
    private byte field502 = 0;

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "Lsb;")
    private class190 field505 = new class190(8);

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "Z")
    public static boolean field471 = false;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field473 = 0;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "Z")
    public static boolean field488 = false;

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "I")
    public static int field493 = -1;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "I")
    public static int field487;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!dl", name = "E", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "client!dl", name = "F", descriptor = "J")
    private long field501;

    @OriginalMember(owner = "client!dl", name = "K", descriptor = "Lhl;")
    private class166 field506;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Ls;")
    public static class196 field477;

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "Lag;")
    private class215 field498;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "Lph;")
    public static class361 field479;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZ)V", line = 6)
    public final void method233(int arg0, boolean arg1) {
        if (arg0 != -2) {
            return;
        }
        field480++;
        if (this.field498 == null) {
            return;
        }
        try {
            this.field499.field2776 = 0;
            this.field499.method1355((byte) -128, arg1 ? 2 : 3);
            this.field499.method1367(arg0 + 130, 0);
            this.field498.method1558(arg0 + 5002, this.field499.field2718, 0, 4);
        } catch (IOException var6) {
            try {
                this.field498.method1555(false);
            } catch (Exception var5) {
            }
            this.field504++;
            this.field498 = null;
            this.field503 = -2;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIBZ)Lhl;", line = 34)
    public final class166 method234(int arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        long var6 = (long) ((arg2 << 16) + arg1);
        if (arg0 != -2081513200) {
            return (class166) null;
        }
        field490++;
        class166 var8 = new class166();
        var8.field108 = arg4;
        var8.field2382 = arg3;
        var8.field1122 = var6;
        if (arg4) {
            if (this.method245((byte) -58) >= 20) {
                throw new RuntimeException();
            }
            this.field494.method2385(var8, 14);
        } else if (this.method247(arg0 + 2081513204) < 20) {
            this.field496.method2385(var8, 14);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V", line = 74)
    public final void method235(boolean arg0) {
        if (arg0) {
            if (this.field498 != null) {
                this.field498.method1561((byte) 87);
            }
            field476++;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIILid;IZLef;Lgi;)V", line = 88)
    public static final void method236(int arg0, int arg1, int arg2, class200 arg3, int arg4, boolean arg5, class92 arg6, class287 arg7) {
        field485++;
        class25 var8 = null;
        if (arg3.field2922 == 0) {
            if ((double) class105.field1506 == 3.0D) {
                var8 = class56.field807;
            }
            if ((double) class105.field1506 == 4.0D) {
                var8 = class240.field3571;
            }
            if ((double) class105.field1506 == 6.0D) {
                var8 = class50.field759;
            }
            if ((double) class105.field1506 >= 8.0D) {
                var8 = class19.field303;
            }
        } else if (arg3.field2922 == 1) {
            if ((double) class105.field1506 == 3.0D) {
                var8 = class50.field759;
            }
            if ((double) class105.field1506 == 4.0D) {
                var8 = class19.field303;
            }
            if ((double) class105.field1506 == 6.0D) {
                var8 = class50.field762;
            }
            if ((double) class105.field1506 >= 8.0D) {
                var8 = class215.field3173;
            }
        } else if (arg3.field2922 == 2) {
            if ((double) class105.field1506 == 3.0D) {
                var8 = class50.field762;
            }
            if ((double) class105.field1506 == 4.0D) {
                var8 = class215.field3173;
            }
            if ((double) class105.field1506 == 6.0D) {
                var8 = class35.field519;
            }
            if ((double) class105.field1506 >= 8.0D) {
                var8 = class54.field791;
            }
        }
        if (var8 != null) {
            int var9 = arg3.field2931;
            if (arg7.field4349 && arg3.field2909 != -1) {
                var9 = arg3.field2909;
            }
            int var10 = class229.field3473.method183(arg3.field2920, (int[]) null, class219.field3270);
            int var11 = arg7.field4347;
            int var12;
            if (arg5) {
                var12 = var11 - var10 * var8.method162() / 2;
            } else {
                var12 = var11 - (arg1 + (var8.method159() * (var10 - 1)) + var8.method162() / 2);
            }
            int var13 = var12 - var8.method162();
            int var14 = var12 + var8.method162() / 2;
            int var15 = 0;
            for (int var16 = 0; var16 < var10; var16++) {
                String var17 = class219.field3270[var16];
                if (var16 < (var10 - 1)) {
                    var17 = var17.substring(0, var17.length() - 4);
                }
                int var18 = var8.method158(var17);
                if (var15 < var18) {
                    var15 = var18;
                }
            }
            int var19 = var13 + 2;
            arg6.field1273 = arg2 + var13;
            arg6.field1276 = arg7.field4341 + arg0 - var15 / 2;
            arg6.field1284 = var15 / 2 + arg7.field4341 + arg0;
            arg6.field1287 = var10 * var8.method159() + var13 + arg2;
            int var20 = arg7.field4341 - (var15 / 2) - 5;
            if (arg3.field2934 != 0) {
                class44.method315(var20, var19, var15 + 10, var13 - -(var10 * var8.method159()) - (var19 + -1), arg3.field2934, arg3.field2934 >>> 24);
            }
            if (arg3.field2918 != 0) {
                class44.method314(var20, var19, var15 + 10, var13 + 1 - -(var8.method159() * var10) + -var19, arg3.field2918, arg3.field2918 >>> 24);
            }
            for (int var21 = 0; var21 < var10; var21++) {
                String var22 = class219.field3270[var21];
                if ((var10 - 1) > var21) {
                    var22 = var22.substring(0, var22.length() - 4);
                }
                int var23 = var8.method158(var22);
                if (var23 > var15) {
                    var15 = var23;
                }
                var8.method161(var22, arg7.field4341, var14, var9, true);
                var14 += var8.method159();
            }
        }
        if (arg4 != 0) {
            method246(false, -78, 4, -107L, -104);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILqc;)V", line = 236)
    public static final void method237(int arg0, class97 arg1) {
        field481++;
        if (arg0 < 112) {
            field475 = -17;
        }
        class58.field853 = arg1;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V", line = 254)
    public final void method238(byte arg0) {
        field489++;
        if (this.field498 == null) {
            return;
        }
        try {
            this.field499.field2776 = 0;
            this.field499.method1355((byte) -126, 7);
            this.field499.method1367(128, 0);
            if (arg0 > -105) {
                this.field505 = (class190) null;
            }
            this.field498.method1558(5000, this.field499.field2718, 0, 4);
        } catch (IOException var5) {
            try {
                this.field498.method1555(false);
            } catch (Exception var4) {
            }
            this.field504++;
            this.field498 = null;
            this.field503 = -2;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)Z", line = 282)
    public final boolean method239(int arg0) {
        if (this.field498 != null) {
            long var2 = class176.method1234(5574);
            int var4 = (int) (var2 - this.field501);
            this.field501 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field500 += var4;
            if (this.field500 > 30000) {
                try {
                    this.field498.method1555(false);
                } catch (Exception var30) {
                }
                this.field498 = null;
            }
        }
        field472++;
        if (this.field498 == null) {
            return this.method245((byte) -100) == 0 && this.method247(4) == 0;
        }
        try {
            this.field498.method1551((byte) 88);
            if (arg0 <= 71) {
                return false;
            }
            for (class166 var6 = (class166) this.field494.method2386((byte) -36); var6 != null; var6 = (class166) this.field494.method2388((byte) -92)) {
                this.field499.field2776 = 0;
                this.field499.method1355((byte) -112, 1);
                this.field499.method1367(128, (int) var6.field1122);
                this.field498.method1558(5000, this.field499.field2718, 0, 4);
                this.field495.method2385(var6, 14);
            }
            for (class166 var7 = (class166) this.field496.method2386((byte) -39); var7 != null; var7 = (class166) this.field496.method2388((byte) -92)) {
                this.field499.field2776 = 0;
                this.field499.method1355((byte) -116, 0);
                this.field499.method1367(128, (int) var7.field1122);
                this.field498.method1558(5000, this.field499.field2718, 0, 4);
                this.field497.method2385(var7, 14);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field498.method1554(-2);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field500 = 0;
                byte var10 = 0;
                if (this.field506 == null) {
                    var10 = 8;
                } else if (this.field506.field2377 == 0) {
                    var10 = 1;
                }
                if (var10 > 0) {
                    int var11 = var10 - this.field505.field2776;
                    if (var9 < var11) {
                        var11 = var9;
                    }
                    this.field498.method1552(this.field505.field2718, this.field505.field2776, var11, (byte) 33);
                    if (this.field502 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field505.field2718[this.field505.field2776 + var12] = (byte) class228.method1706(this.field505.field2718[this.field505.field2776 + var12], this.field502);
                        }
                    }
                    this.field505.field2776 += var11;
                    if (this.field505.field2776 >= var10) {
                        if (this.field506 == null) {
                            this.field505.field2776 = 0;
                            int var13 = this.field505.method1319(255);
                            int var14 = this.field505.method1317((byte) 29);
                            int var15 = this.field505.method1319(255);
                            int var16 = this.field505.method1371(-4);
                            int var17 = var15 & 0x7F;
                            long var18 = (long) ((var13 << 16) + var14);
                            boolean var20 = (var15 & 0x80) != 0;
                            Object var21 = null;
                            class166 var22;
                            if (var20) {
                                for (var22 = (class166) this.field497.method2386((byte) -89); var22 != null && var22.field1122 != var18; var22 = (class166) this.field497.method2388((byte) -92)) {
                                }
                            } else {
                                for (var22 = (class166) this.field495.method2386((byte) -127); var22 != null && var22.field1122 != var18; var22 = (class166) this.field495.method2388((byte) -92)) {
                                }
                            }
                            if (var22 == null) {
                                throw new IOException();
                            }
                            int var23 = var17 == 0 ? 5 : 9;
                            this.field506 = var22;
                            this.field506.field2373 = new class190(this.field506.field2382 + var23 + var16);
                            this.field506.field2373.method1355((byte) -111, var17);
                            this.field506.field2373.method1354(var16, (byte) 1);
                            this.field505.field2776 = 0;
                            this.field506.field2377 = 8;
                        } else if (this.field506.field2377 != 0) {
                            throw new IOException();
                        } else if (this.field505.field2718[0] == -1) {
                            this.field506.field2377 = 1;
                            this.field505.field2776 = 0;
                        } else {
                            this.field506 = null;
                        }
                    }
                } else {
                    int var24 = this.field506.field2373.field2718.length - this.field506.field2382;
                    int var25 = 512 - this.field506.field2377;
                    if (var24 - this.field506.field2373.field2776 < var25) {
                        var25 = var24 - this.field506.field2373.field2776;
                    }
                    if (var9 < var25) {
                        var25 = var9;
                    }
                    this.field498.method1552(this.field506.field2373.field2718, this.field506.field2373.field2776, var25, (byte) 33);
                    if (this.field502 != 0) {
                        for (int var26 = 0; var26 < var25; var26++) {
                            this.field506.field2373.field2718[this.field506.field2373.field2776 + var26] = (byte) class228.method1706(this.field506.field2373.field2718[this.field506.field2373.field2776 + var26], this.field502);
                        }
                    }
                    this.field506.field2377 += var25;
                    this.field506.field2373.field2776 += var25;
                    if (this.field506.field2373.field2776 == var24) {
                        this.field506.method627(0);
                        this.field506.field118 = false;
                        this.field506 = null;
                    } else if (this.field506.field2377 == 512) {
                        this.field506.field2377 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field498.method1555(false);
            } catch (Exception var29) {
            }
            this.field504++;
            this.field498 = null;
            this.field503 = -2;
            return this.method245((byte) -39) == 0 && this.method247(4) == 0;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)Z", line = 561)
    public final boolean method240(int arg0) {
        if (arg0 != 20456) {
            this.method240(117);
        }
        field484++;
        return this.method247(4) >= 20;
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)V", line = 573)
    public final void method241(int arg0) {
        if (this.field498 != null) {
            this.field498.method1555(false);
        }
        if (arg0 != 30783) {
            this.method248(53, (class215) null, false);
        }
        field478++;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(Z)V", line = 586)
    public static void method242(boolean arg0) {
        field477 = null;
        field479 = null;
        if (!arg0) {
            field477 = (class196) null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V", line = 598)
    public final void method243(byte arg0) {
        try {
            this.field498.method1555(false);
        } catch (Exception var3) {
        }
        this.field504++;
        if (arg0 != 10) {
            this.method248(20, (class215) null, true);
        }
        this.field498 = null;
        this.field503 = -1;
        field487++;
        this.field502 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)V", line = 619)
    private final void method244(int arg0) {
        field483++;
        if (arg0 != 19063 || this.field498 == null) {
            return;
        }
        try {
            this.field499.field2776 = 0;
            this.field499.method1355((byte) -118, 6);
            this.field499.method1367(128, 3);
            this.field498.method1558(5000, this.field499.field2718, 0, 4);
        } catch (IOException var5) {
            try {
                this.field498.method1555(false);
            } catch (Exception var4) {
            }
            this.field498 = null;
            this.field503 = -2;
            this.field504++;
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(B)I", line = 646)
    public final int method245(byte arg0) {
        if (arg0 >= -37) {
            return -83;
        } else {
            field482++;
            return this.field494.method2389(114) + this.field495.method2389(111);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIIJI)Ljava/lang/String;", line = 661)
    public static final String method246(boolean arg0, int arg1, int arg2, long arg3, int arg4) {
        field486++;
        char var6 = ',';
        char var7 = '.';
        if (arg1 != -3194) {
            method236(55, 51, 106, (class200) null, 121, false, (class92) null, (class287) null);
        }
        boolean var8 = false;
        if (arg3 < 0L) {
            var8 = true;
            arg3 = -arg3;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg4 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg2 > 0) {
            for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = (int) arg3;
                arg3 /= 10L;
                var9.append((char) (var11 + 48 - (int) arg3 * 10));
            }
            var9.append(var6);
        }
        if (arg4 == 2) {
            var7 = ' ';
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg3;
            arg3 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg3 * 10));
            if (arg3 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg0) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)I", line = 748)
    private final int method247(int arg0) {
        field491++;
        if (arg0 != 4) {
            this.method247(-57);
        }
        return this.field496.method2389(109) + this.field497.method2389(110);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILag;Z)V", line = 767)
    public final void method248(int arg0, class215 arg1, boolean arg2) {
        if (this.field498 != null) {
            try {
                this.field498.method1555(false);
            } catch (Exception var11) {
            }
            this.field498 = null;
        }
        field474++;
        this.field498 = arg1;
        this.method244(19063);
        this.method233(-2, arg2);
        this.field506 = null;
        this.field505.field2776 = 0;
        if (arg0 != 14538) {
            this.field495 = (class342) null;
        }
        while (true) {
            class166 var5 = (class166) this.field495.method2390((byte) 121);
            if (var5 == null) {
                while (true) {
                    class166 var6 = (class166) this.field497.method2390((byte) 124);
                    if (var6 == null) {
                        if (this.field502 != 0) {
                            try {
                                this.field499.field2776 = 0;
                                this.field499.method1355((byte) -109, 4);
                                this.field499.method1355((byte) -116, this.field502);
                                this.field499.method1361(0, (byte) 124);
                                this.field498.method1558(5000, this.field499.field2718, 0, 4);
                            } catch (IOException var10) {
                                try {
                                    this.field498.method1555(false);
                                } catch (Exception var9) {
                                }
                                this.field503 = -2;
                                this.field504++;
                                this.field498 = null;
                            }
                        }
                        this.field500 = 0;
                        this.field501 = class176.method1234(5574);
                        return;
                    }
                    this.field496.method2385(var6, arg0 - 14524);
                }
            }
            this.field494.method2385(var5, 14);
        }
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(B)Z", line = 842)
    public final boolean method249(byte arg0) {
        field492++;
        if (arg0 <= 61) {
            this.field505 = (class190) null;
        }
        return this.method245((byte) -80) >= 20;
    }
}
