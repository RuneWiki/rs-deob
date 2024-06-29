import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class23 {

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "[[I")
    private int[][] field441;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "Lmc;")
    public static class75 field446 = class30.method234(true, "Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1 bevor Sie die (WMissbrauch melden(W Option benutzen");

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Lmc;")
    public static class75 field436 = class30.method234(true, "welle2:");

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Lmc;")
    public static class75 field438 = class30.method234(true, "Absender:");

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Z")
    public static boolean field443 = false;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "Z")
    public static boolean field455 = false;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Lfa;")
    public static class32 field442 = new class32();

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Lnc;")
    public static class81 field449;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Ljava/awt/Font;")
    public static Font field440;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "[I")
    public static int[] field437;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 5)
    public static final void method158(int arg0) {
        field453++;
        short var1 = 256;
        for (int var2 = 10; var2 < 117; var2++) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                class100.field2586[(var1 - 2 << 7) + var2] = 255;
            }
        }
        for (int var3 = 0; var3 < 100; var3++) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            class100.field2586[var17] = 192;
        }
        for (int var4 = 1; var4 < var1 - 1; var4++) {
            for (int var13 = 1; var13 < 127; var13++) {
                int var14 = (var4 << 7) + var13;
                class41.field995[var14] = (class100.field2586[var14 - 1] + class100.field2586[var14 + 1] + class100.field2586[var14 - 128] + class100.field2586[var14 + 128]) / 4;
            }
        }
        int var5 = -109 % ((arg0 + 76) / 39);
        class59.field1539 += 128;
        if (class59.field1539 > class109.field2778.length) {
            class59.field1539 -= class109.field2778.length;
            int var6 = (int) (Math.random() * 12.0D);
            class118.method945(0, class112.field2844[var6]);
        }
        for (int var7 = 1; var7 < var1 - 1; var7++) {
            for (int var10 = 1; var10 < 127; var10++) {
                int var11 = (var7 << 7) + var10;
                int var12 = class41.field995[var11 + 128] - class109.field2778[class109.field2778.length - 1 & class59.field1539 + var11] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                class100.field2586[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var1 - 1; var8++) {
            class98.field2471[var8] = class98.field2471[var8 + 1];
        }
        class98.field2471[var1 - 1] = (int) (Math.sin((double) class34.field781 / 14.0D) * 16.0D + Math.sin((double) class34.field781 / 15.0D) * 14.0D + Math.sin((double) class34.field781 / 16.0D) * 12.0D);
        if (class65.field1713 > 0) {
            class65.field1713 -= 4;
        }
        if (client.field381 > 0) {
            client.field381 -= 4;
        }
        if (class65.field1713 != 0 || client.field381 != 0) {
            return;
        }
        int var9 = (int) (Math.random() * 2000.0D);
        if (var9 == 0) {
            class65.field1713 = 1024;
        }
        if (var9 == 1) {
            client.field381 = 1024;
            return;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)I", line = 142)
    public final int method159(int arg0, boolean arg1) {
        if (this.field441 != null) {
            arg0 = this.field439 * arg0 / this.field445 + 7;
        }
        if (arg1) {
            this.field439 = 71;
        }
        field447++;
        return arg0;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)I", line = 156)
    public final int method160(byte arg0, int arg1) {
        if (this.field441 != null) {
            arg1 = this.field439 * arg1 / this.field445;
        }
        field454++;
        return arg0 == 61 ? arg1 : -115;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(II)V", line = 181)
    public class23(int arg0, int arg1) {
        int var3 = class100.method832(arg0, arg1, true);
        int var4 = arg1 / var3;
        this.field439 = var4;
        int var5 = arg0 / var3;
        this.field445 = var5;
        if (var4 != var5) {
            this.field441 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                double var7 = (double) var6 / (double) var5 + 6.0D;
                int[] var9 = this.field441[var6];
                int var10 = (int) Math.floor(var7 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var7 + 7.0D);
                double var12 = (double) var4 / (double) var5;
                if (var11 > 14) {
                    var11 = 14;
                }
                while (var11 > var10) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var7) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var7) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var9[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B[B)[B", line = 239)
    public final byte[] method161(byte arg0, byte[] arg1) {
        if (arg0 < 30) {
            method162(-16);
        }
        field450++;
        if (this.field441 != null) {
            int var3 = arg1.length * this.field439 / this.field445 + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field441[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field439 + var6;
                int var14 = var13 / this.field445;
                var6 = var13 - this.field445 * var14;
                var5 += var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V", line = 310)
    public static void method162(int arg0) {
        field449 = null;
        field446 = null;
        field437 = null;
        field442 = null;
        field436 = null;
        if (arg0 == -6151) {
            field438 = null;
            field440 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V", line = 326)
    public static final void method163(int arg0) {
        class92.field2270 = true;
        if (arg0 >= 71) {
            field451++;
            class29.field620 = true;
        }
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V", line = 339)
    public static final void method164(int arg0) {
        if (arg0 != -1) {
            field438 = null;
        }
        class6.field85.method553((byte) -36);
        field444++;
    }
}
