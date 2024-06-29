import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class216 {

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    private int field3332 = -1;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    private int field3342 = 0;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "Z")
    public static boolean field3333 = true;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "[I")
    public static int[] field3335 = new int[25];

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public static int field3339 = 0;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3331 = "Allocating memory";

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public int field3329;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public int field3336;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public int field3338;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public int field3340;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "Z")
    public static boolean field3343;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "[[[B")
    public static byte[][][] field3334;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILuf;Luf;Luf;Lfe;)Z")
    public static final boolean method1435(int arg0, class176 arg1, class176 arg2, class176 arg3, class261 arg4) {
        if (arg0 < 46) {
            field3334 = null;
        }
        class32.field517 = arg3;
        class61.field988 = arg4;
        field3327++;
        class43.field690 = arg1;
        class35.field568 = arg2;
        return true;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IB)V")
    private final void method1436(int arg0, byte arg1) {
        field3337++;
        double var3 = (double) ((arg0 & 0xFFC3) >> 8) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF773A) >> 16) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var5;
        if (var3 < var5) {
            var9 = var3;
        }
        double var11 = var5;
        if (var7 < var9) {
            var9 = var7;
        }
        if (var3 > var5) {
            var11 = var3;
        }
        double var13 = 0.0D;
        if (var7 > var11) {
            var11 = var7;
        }
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        this.field3338 = (int) (var17 * 256.0D);
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var13 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var5 == var11) {
                var15 = (var3 - var7) / (var11 - var9);
            } else if (var3 == var11) {
                var15 = (var7 - var5) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var15 = (var5 - var3) / (var11 - var9) + 4.0D;
            }
        }
        if (this.field3338 < 0) {
            this.field3338 = 0;
        } else if (this.field3338 > 255) {
            this.field3338 = 255;
        }
        double var19 = var15 / 6.0D;
        int var21 = 74 % ((-arg1 - 13) / 58);
        this.field3340 = (int) (var13 * 256.0D);
        if (this.field3340 < 0) {
            this.field3340 = 0;
        } else if (this.field3340 > 255) {
            this.field3340 = 255;
        }
        if (var17 > 0.5D) {
            this.field3329 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field3329 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field3329 < 1) {
            this.field3329 = 1;
        }
        this.field3336 = (int) ((double) this.field3329 * var19);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V")
    public static void method1437(boolean arg0) {
        field3334 = null;
        field3335 = null;
        field3331 = null;
        if (arg0) {
            method1439(117, (char) 65523, (String) null);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lf;IIZ)V")
    private final void method1438(class37 arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            this.method1440((class37) null, (byte) 79, -127);
        }
        if (arg2 == 1) {
            this.field3342 = arg0.method336(23362);
            this.method1436(this.field3342, (byte) 55);
        } else if (arg2 == 2) {
            this.field3332 = arg0.method293(-12);
            if (this.field3332 == 65535) {
                this.field3332 = -1;
            }
        } else if (arg2 == 3) {
            arg0.method293(120);
        }
        field3330++;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method1439(int arg0, char arg1, String arg2) {
        int var3 = class260.method1727(0, arg1, arg2);
        if (arg0 <= 116) {
            field3343 = true;
        }
        field3328++;
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var5; arg1 != arg2.charAt(var8); var8++) {
            }
            var4[var6++] = arg2.substring(var5, var8);
            var5 = var8 + 1;
        }
        var4[var3] = arg2.substring(var5);
        return var4;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lf;BI)V")
    public final void method1440(class37 arg0, byte arg1, int arg2) {
        field3341++;
        while (true) {
            int var4 = arg0.method333((byte) -59);
            if (var4 == 0) {
                int var5 = -101 % ((arg1 + 10) / 51);
                return;
            }
            this.method1438(arg0, arg2, var4, true);
        }
    }
}
