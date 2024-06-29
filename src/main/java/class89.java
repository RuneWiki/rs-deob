import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class89 {

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    private int field2096;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    private int field2094;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "[[I")
    private int[][] field2097;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field2099 = 0;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Lad;")
    public static class5 field2098 = class88.method674("Bitte versuchen Sie)1", -109);

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "Lad;")
    public static class5 field2104 = class88.method674("Lade Freunde)2Liste)3)3)3", -96);

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Lbb;")
    public static class9 field2092 = new class9(50);

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field2106 = 0;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "Lgb;")
    public static class39 field2105 = new class39(new byte[5000]);

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "Lad;")
    public static class5 field2110 = class88.method674("Verbindung abgebrochen)3", 39);

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public static int field2111 = 0;

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "Lad;")
    public static class5 field2108 = class88.method674(" zuerst von Ihrer Freunde)2Liste(Q", -126);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "Lkb;")
    public static class62 field2109;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 18)
    public static void method679(int arg0) {
        field2105 = null;
        field2104 = null;
        field2108 = null;
        field2092 = null;
        field2098 = null;
        if (arg0 >= -118) {
            field2104 = null;
        }
        field2110 = null;
        field2109 = null;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(II)V", line = 39)
    public class89(int arg0, int arg1) {
        int var3 = class95.method727(arg0, 120, arg1);
        int var4 = arg1 / var3;
        this.field2096 = var4;
        int var5 = arg0 / var3;
        this.field2094 = var5;
        if (var4 != var5) {
            this.field2097 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                double var7 = (double) var6 / (double) var5 + 6.0D;
                int[] var9 = this.field2097[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                int var11 = (int) Math.ceil(var7 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                if (var10 < 0) {
                    var10 = 0;
                }
                double var12 = (double) var4 / (double) var5;
                while (var11 > var10) {
                    double var14 = ((double) var10 - var7) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V", line = 98)
    public static final void method680(byte arg0) {
        field2102++;
        int var1 = class36.field907.method207((byte) 80, 8);
        if (class12.field348 > var1) {
            for (int var2 = var1; var2 < class12.field348; var2++) {
                class1.field18[class33.field800++] = class105.field2577[var2];
            }
        }
        if (var1 > class12.field348) {
            throw new RuntimeException("gppov1");
        }
        class12.field348 = 0;
        int var3 = 0;
        int var4 = -31 / ((arg0 + 83) / 33);
        while (var1 > var3) {
            int var5 = class105.field2577[var3];
            class112 var6 = class7.field251[var5];
            int var7 = class36.field907.method207((byte) 80, 1);
            if (var7 == 0) {
                class105.field2577[class12.field348++] = var5;
                var6.field113 = class69.field1636;
            } else {
                int var8 = class36.field907.method207((byte) 80, 2);
                if (var8 == 0) {
                    class105.field2577[class12.field348++] = var5;
                    var6.field113 = class69.field1636;
                    class13.field380[class109.field2727++] = var5;
                } else if (var8 == 1) {
                    class105.field2577[class12.field348++] = var5;
                    var6.field113 = class69.field1636;
                    int var9 = class36.field907.method207((byte) 80, 3);
                    var6.method22((byte) -123, false, var9);
                    int var10 = class36.field907.method207((byte) 80, 1);
                    if (var10 == 1) {
                        class13.field380[class109.field2727++] = var5;
                    }
                } else if (var8 == 2) {
                    class105.field2577[class12.field348++] = var5;
                    var6.field113 = class69.field1636;
                    int var11 = class36.field907.method207((byte) 80, 3);
                    var6.method22((byte) -113, true, var11);
                    int var12 = class36.field907.method207((byte) 80, 3);
                    var6.method22((byte) -113, true, var12);
                    int var13 = class36.field907.method207((byte) 80, 1);
                    if (var13 == 1) {
                        class13.field380[class109.field2727++] = var5;
                    }
                } else if (var8 == 3) {
                    class1.field18[class33.field800++] = var5;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BI)I", line = 211)
    public final int method681(byte arg0, int arg1) {
        if (this.field2097 != null) {
            arg1 = this.field2096 * arg1 / this.field2094 + 7;
        }
        field2095++;
        return arg0 >= -44 ? 71 : arg1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([BB)[B", line = 238)
    public final byte[] method682(byte[] arg0, byte arg1) {
        if (this.field2097 != null) {
            int var3 = arg0.length * this.field2096 / this.field2094 + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field2097[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field2096 + var6;
                int var14 = var13 / this.field2094;
                var5 += var14;
                var6 = var13 - this.field2094 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 <= 127) {
                    arg0[var8] = (byte) var9;
                } else {
                    arg0[var8] = 127;
                }
            }
        }
        if (arg1 < 29) {
            field2104 = null;
        }
        field2093++;
        return arg0;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Z", line = 306)
    public static final boolean method683(int arg0, int arg1, int arg2) {
        field2100++;
        if (arg0 == 0 && class13.field379 == arg1) {
            return true;
        } else if (~arg0 == arg2 && class129.field3130 == arg1) {
            return true;
        } else {
            return (arg0 == 2 || arg0 == 3) && class128.field3073 == arg1;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(BI)I", line = 328)
    public final int method684(byte arg0, int arg1) {
        if (this.field2097 != null) {
            arg1 = this.field2096 * arg1 / this.field2094;
        }
        field2101++;
        if (arg0 != 32) {
            method679(112);
        }
        return arg1;
    }
}
