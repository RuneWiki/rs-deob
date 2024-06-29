import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class28 {

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    private int field602;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "[[I")
    private int[][] field601;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    private int field592;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field600 = -1;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Lcd;")
    private static class23 field603 = class54.method414("Try again in 60 secs)3)3)3", -1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Lcd;")
    public static class23 field591 = field603;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "Lva;")
    public static class189 field595 = new class189(8);

    @OriginalMember(owner = "client!d", name = "o", descriptor = "Lcd;")
    private static class23 field605 = class54.method414("Loaded interfaces", -1);

    @OriginalMember(owner = "client!d", name = "p", descriptor = "Lcd;")
    public static class23 field606 = field605;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Lsa;")
    public static class162 field607 = new class162(30);

    @OriginalMember(owner = "client!d", name = "u", descriptor = "Lcd;")
    private static class23 field611 = class54.method414("glow1:", -1);

    @OriginalMember(owner = "client!d", name = "t", descriptor = "Lcd;")
    public static class23 field610 = field611;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "Lcd;")
    public static class23 field608 = field611;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "Lsa;")
    public static class162 field609 = new class162(64);

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public static int field614 = 0;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "[I")
    public static int[] field615 = new int[500];

    @OriginalMember(owner = "client!d", name = "w", descriptor = "Lcd;")
    public static class23 field613 = class54.method414("Sprites geladen)3", -1);

    @OriginalMember(owner = "client!d", name = "z", descriptor = "Lcd;")
    public static class23 field616 = class54.method414("<col=40ff00>", -1);

    @OriginalMember(owner = "client!d", name = "v", descriptor = "Lcd;")
    public static class23 field612 = class54.method414("Verbinde mit Server)3)3)3", -1);

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZI)I")
    public final int method212(boolean arg0, int arg1) {
        field604++;
        if (!arg0) {
            field603 = null;
        }
        if (this.field601 != null) {
            arg1 = (int) ((long) this.field592 * (long) arg1 / (long) this.field602);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static final void method213(int arg0) {
        class19.field407 = null;
        class60.field1402 = null;
        class40.field852 = null;
        class136.field2822 = null;
        if (arg0 != 842646466) {
            method217(47);
        }
        field594++;
        class111.field2353 = null;
        class163.field3270 = null;
        class39.field824 = null;
        class169.field3375 = null;
        class105.field2267 = null;
        class110.field2337 = null;
        class9.field185 = null;
        class12.field233 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)I")
    public final int method214(int arg0, int arg1) {
        if (this.field601 != null) {
            arg1 = (int) ((long) this.field592 * (long) arg1 / (long) this.field602) + 6;
        }
        field599++;
        if (arg0 < 53) {
            this.method212(true, -29);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)I")
    public static final int method215(int arg0, int arg1, int arg2, int arg3) {
        field596++;
        int var4 = 256 - arg2;
        if (arg3 != 16711680) {
            field607 = null;
        }
        return ((arg0 & 0xFF00) * arg2 + (arg1 & 0xFF00) * var4 & 0xFF0000) + ((arg0 & 0xFF00FF) * arg2 + (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) >> 8;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([BB)[B")
    public final byte[] method216(byte[] arg0, byte arg1) {
        int var3 = -104 / ((arg1 + 13) / 46);
        if (this.field601 != null) {
            int var4 = (int) ((long) arg0.length * (long) this.field592 / (long) this.field602) + 14;
            int[] var5 = new int[var4];
            int var6 = 0;
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.length; var8++) {
                int[] var11 = this.field601[var6];
                byte var12 = arg0[var8];
                for (int var13 = 0; var13 < 14; var13++) {
                    var5[var7 + var13] += var11[var13] * var12;
                }
                int var14 = this.field592 + var6;
                int var15 = var14 / this.field602;
                var6 = var14 - this.field602 * var15;
                var7 += var15;
            }
            arg0 = new byte[var4];
            for (int var9 = 0; var9 < var4; var9++) {
                int var10 = var5[var9] + 32768 >> 16;
                if (var10 < -128) {
                    arg0[var9] = -128;
                } else if (var10 <= 127) {
                    arg0[var9] = (byte) var10;
                } else {
                    arg0[var9] = 127;
                }
            }
        }
        field598++;
        return arg0;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    public static void method217(int arg0) {
        field616 = null;
        if (arg0 != 0) {
            method213(-24);
        }
        field595 = null;
        field612 = null;
        field609 = null;
        field603 = null;
        field611 = null;
        field615 = null;
        field608 = null;
        field605 = null;
        field606 = null;
        field610 = null;
        field607 = null;
        field613 = null;
        field591 = null;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(II)V")
    public class28(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class23.method169(arg0, arg1, (byte) 93);
            int var4 = arg0 / var3;
            this.field602 = var4;
            int var5 = arg1 / var3;
            this.field601 = new int[var4][14];
            this.field592 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field601[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
