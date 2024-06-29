import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class18 {

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    private int field415;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "[[I")
    private int[][] field423;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field417 = 0;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Lv;")
    private static class122 field418 = class55.method425(-114, "Connecting to server)3)3)3");

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "Lv;")
    public static class122 field425 = class55.method425(-81, "q8_full");

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "Lv;")
    public static class122 field426 = class55.method425(-115, "huffman");

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "Lv;")
    public static class122 field428 = field418;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Lvc;")
    public static class125 field414 = new class125(5000);

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "Lv;")
    public static class122 field429 = class55.method425(-73, "leuchten2:");

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "[I")
    public static int[] field432 = new int[5];

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "Lv;")
    public static class122 field433 = class55.method425(-94, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "Lv;")
    private static class122 field436 = class55.method425(-126, "Prepared sound engine");

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "Lv;")
    private static class122 field431 = class55.method425(-116, "Loading ignore list");

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "Lv;")
    public static class122 field430 = field431;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "Lv;")
    public static class122 field437 = class55.method425(-76, "Ung\u001c1ltiger Benutzername oder Passwort)3");

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "Lv;")
    public static class122 field438 = field436;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "Ljb;")
    public static class56 field434 = new class56(10);

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "Lv;")
    public static class122 field439 = class55.method425(-109, "Side panel redrawn");

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "Lmc;")
    public static class75 field440 = new class75(4096);

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "I")
    public static int field424;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "Lab;")
    public static class3 field435;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)I", line = 9)
    public final int method168(int arg0, int arg1) {
        if (arg0 != -28582) {
            this.method170(72, -53);
        }
        field416++;
        if (this.field423 != null) {
            arg1 = this.field415 * arg1 / this.field419;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)I", line = 31)
    public static final int method169(int arg0, int arg1, int arg2) {
        field421++;
        int var3 = class66.method535(arg1 - 1, (byte) 123, arg0 - 1) + class66.method535(arg1 - 1, (byte) -110, arg0 + 1) + class66.method535(arg1 + 1, (byte) 101, arg0 - 1) + class66.method535(arg1 - -1, (byte) 47, arg0 - -1);
        int var4 = class66.method535(arg1, (byte) 102, arg0 - 1) + class66.method535(arg1, (byte) -121, arg0 + 1) + class66.method535(arg1 + -1, (byte) 106, arg0) + class66.method535(arg1 + 1, (byte) -94, arg0);
        int var5 = class66.method535(arg1, (byte) -90, arg0);
        return arg2 == 4 ? var5 / 4 + var3 / 16 + var4 / 8 : 39;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)I", line = 49)
    public final int method170(int arg0, int arg1) {
        if (this.field423 != null) {
            arg0 = this.field415 * arg0 / this.field419 + 7;
        }
        field420++;
        if (arg1 != 7) {
            method172(35, null);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 64)
    public static final void method171(int arg0) {
        if (arg0 != -4969) {
            method172(-15, null);
        }
        for (int var1 = 0; var1 < class49.field1245; var1++) {
            int var2 = class21.field581[var1];
            class80 var3 = class94.field2423[var2];
            if (var3 != null) {
                class22.method233(var3.field2089.field540, 125, var3);
            }
        }
        field424++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILbd;)V", line = 108)
    public static final void method172(int arg0, class11 arg1) {
        field427++;
        if (class16.field396 == arg1.field288 || arg1.field324 == -1 || arg1.field292 != 0 || arg1.field302 + 1 > class51.method401(-30325, arg1.field324).field2287[arg1.field301]) {
            int var2 = arg1.field288 - arg1.field312;
            int var3 = class16.field396 - arg1.field312;
            int var4 = arg1.field348 * 128 + arg1.field317 * 64;
            int var5 = arg1.field317 * 64 + arg1.field314 * 128;
            int var6 = arg1.field341 * 128 + arg1.field317 * 64;
            int var7 = arg1.field339 * 128 + arg1.field317 * 64;
            arg1.field343 = ((var2 - var3) * var4 + var3 * var7) / var2;
            arg1.field349 = ((var2 - var3) * var5 + var3 * var6) / var2;
        }
        if (arg1.field322 == 0) {
            arg1.field280 = 1024;
        }
        if (arg0 != 327) {
            method169(76, 21, 23);
        }
        arg1.field342 = 0;
        if (arg1.field322 == 1) {
            arg1.field280 = 1536;
        }
        if (arg1.field322 == 2) {
            arg1.field280 = 0;
        }
        if (arg1.field322 == 3) {
            arg1.field280 = 512;
        }
        arg1.field299 = arg1.field280;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(II)V", line = 152)
    public class18(int arg0, int arg1) {
        int var3 = class54.method416(arg0, arg1, (byte) 119);
        int var4 = arg1 / var3;
        int var5 = arg0 / var3;
        this.field419 = var5;
        this.field415 = var4;
        if (var4 != var5) {
            this.field423 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                double var7 = (double) var6 / (double) var5 + 6.0D;
                double var9 = (double) var4 / (double) var5;
                int[] var11 = this.field423[var6];
                int var12 = (int) Math.floor(var7 + 1.0D - 7.0D);
                int var13 = (int) Math.ceil(var7 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                if (var12 < 0) {
                    var12 = 0;
                }
                while (var12 < var13) {
                    double var14 = var9;
                    double var16 = ((double) var12 - var7) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var9 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var12 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var11[var12] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var12++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "([BI)[B", line = 221)
    public final byte[] method173(byte[] arg0, int arg1) {
        if (this.field423 != null) {
            int var3 = arg0.length * this.field415 / this.field419 + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field423[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field415 + var6;
                int var14 = var13 / this.field419;
                var5 += var14;
                var6 = var13 - this.field419 * var14;
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
        field413++;
        return arg1 == -1 ? arg0 : null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V", line = 291)
    public static void method174(boolean arg0) {
        field432 = null;
        field429 = null;
        field425 = null;
        if (arg0) {
            field438 = null;
        }
        field439 = null;
        field436 = null;
        field434 = null;
        field433 = null;
        field414 = null;
        field418 = null;
        field431 = null;
        field438 = null;
        field435 = null;
        field437 = null;
        field428 = null;
        field426 = null;
        field430 = null;
        field440 = null;
    }
}
