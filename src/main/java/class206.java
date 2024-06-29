import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class206 implements class429 {

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "Lmo;")
    private class482 field3191 = new class482(128);

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "[I")
    private int[] field3189 = new int[class545.field8005.field7078];

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "[I")
    public int[] field3180 = new int[class545.field8005.field7078];

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "Z")
    public static boolean field3186 = false;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "[C")
    private static char[] field3182 = new char[64];

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    public static int field3192;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field3182[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field3182[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field3182[var2] = (char) (var2 + 48 - 52);
        }
        field3182[63] = '-';
        field3182[62] = '*';
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V", line = 4)
    public final void method1422(byte arg0) {
        int var2 = 80 % ((-arg0 - 11) / 36);
        for (int var3 = 0; var3 < class545.field8005.field7078; var3++) {
            class644 var4 = class545.field8005.method2888(var3, (byte) 10);
            if (var4 != null && var4.field9149 == 0) {
                this.field3189[var3] = 0;
                this.field3180[var3] = 0;
            }
        }
        field3192++;
        this.field3191 = new class482(128);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIB)V", line = 36)
    public final void method1423(int arg0, int arg1, byte arg2) {
        if (arg2 != 74) {
            this.field3189 = null;
        }
        field3181++;
        class594 var4 = class56.field781.method3292((byte) 4, arg1);
        int var5 = var4.field8611;
        int var6 = var4.field8610;
        int var7 = var4.field8608;
        int var8 = class188.field2945[var7 - var6];
        if (arg0 < 0 || var8 < arg0) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method1427(128, this.field3180[var5] & ~var9 | arg0 << var6 & var9, var5);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V", line = 65)
    public static void method1424(int arg0) {
        field3182 = null;
        if (arg0 != 0) {
            method1432(-114);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)I", line = 77)
    public final int method1425(boolean arg0, int arg1) {
        if (arg0) {
            this.field3191 = null;
        }
        field3187++;
        return this.field3180[arg1];
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)I", line = 88)
    public final int method1426(int arg0, int arg1) {
        field3190++;
        if (arg0 != 65) {
            return 69;
        }
        class594 var3 = class56.field781.method3292((byte) 4, arg1);
        int var4 = var3.field8611;
        int var5 = var3.field8610;
        int var6 = var3.field8608;
        int var7 = class188.field2945[var6 - var5];
        return var7 & this.field3180[var4] >> var5;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V", line = 110)
    public final void method1427(int arg0, int arg1, int arg2) {
        field3178++;
        if (arg0 != 128) {
            this.method1425(false, 20);
        }
        this.field3180[arg2] = arg1;
        class661 var4 = (class661) this.field3191.method2818(-22803, (long) arg2);
        if (var4 == null) {
            class661 var5 = new class661(class254.method1619(true) + 500L);
            this.field3191.method2816(var5, (long) arg2, false);
        } else {
            var4.field9299 = class254.method1619(true) + 500L;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(ZI)I", line = 133)
    public final int method1428(boolean arg0, int arg1) {
        field3188++;
        long var3 = class254.method1619(true);
        for (class661 var5 = arg0 ? (class661) this.field3191.method2815(0) : (class661) this.field3191.method2814(arg1 + 12974); var5 != null; var5 = (class661) this.field3191.method2814(4)) {
            if ((var5.field9299 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field9299 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field6265;
                    this.field3180[var6] = this.field3189[var6];
                    var5.method2549((byte) -38);
                    return var6;
                }
                var5.method2549((byte) 108);
            }
        }
        if (arg1 == -12970) {
            return -1;
        } else {
            return 10;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)V", line = 175)
    public final void method1429(int arg0, int arg1, int arg2) {
        field3183++;
        class594 var4 = class56.field781.method3292((byte) 4, arg0);
        int var5 = var4.field8611;
        int var6 = var4.field8610;
        if (arg2 >= -90) {
            this.field3191 = null;
        }
        int var7 = var4.field8608;
        int var8 = class188.field2945[var7 - var6];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method1431(-1, this.field3189[var5] & ~var9 | arg1 << var6 & var9, var5);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILjava/lang/String;B[B)I", line = 203)
    public static final int method1430(int arg0, String arg1, byte arg2, byte[] arg3) {
        field3184++;
        int var4 = arg1.length();
        int var5 = arg0;
        int var6 = 0;
        if (arg2 != -1) {
            return -64;
        }
        while (var6 < var4) {
            char var7 = arg1.charAt(var6);
            if (var7 <= '\u007F') {
                arg3[var5++] = (byte) var7;
            } else if (var7 > '߿') {
                arg3[var5++] = (byte) class460.method2676(224, var7 >> 12);
                arg3[var5++] = (byte) class460.method2676(128, class248.method1593(4057, var7) >> 6);
                arg3[var5++] = (byte) class460.method2676(128, class248.method1593(var7, 63));
            } else {
                arg3[var5++] = (byte) (class460.method2676(var7, 12293) >> 6);
                arg3[var5++] = (byte) class460.method2676(128, class248.method1593(var7, 63));
            }
            var6++;
        }
        return var5 - arg0;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(III)V", line = 246)
    public final void method1431(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            field3186 = true;
        }
        this.field3189[arg2] = arg1;
        field3179++;
        class661 var4 = (class661) this.field3191.method2818(-22803, (long) arg2);
        if (var4 == null) {
            class661 var5 = new class661(4611686018427387905L);
            this.field3191.method2816(var5, (long) arg2, false);
        } else if (var4.field9299 != 4611686018427387905L) {
            var4.field9299 = class254.method1619(true) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)Z", line = 306)
    public static final boolean method1432(int arg0) {
        if (arg0 != 1253) {
            method1430(-24, null, (byte) -56, null);
        }
        field3185++;
        return class331.method1968("jaclib", (byte) 103) ? class331.method1968("hw3d", (byte) 97) : false;
    }
}
