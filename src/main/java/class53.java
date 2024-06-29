import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class53 {

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    private int field967 = 0;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public int field969 = 128;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Z")
    public boolean field977 = true;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "I")
    public int field983 = -1;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "Lke;")
    public static class256 field972 = class316.method2202("Lade Sprites )2 ", 27626);

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "[Z")
    public static boolean[] field974 = new boolean[100];

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "Lke;")
    public static class256 field981 = class316.method2202("comp-Btence ", 27626);

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "[Z")
    public static boolean[] field979 = new boolean[200];

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public int field966;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public int field971;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public int field973;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "[[Z")
    public static boolean[][] field978;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIB)I", line = 14)
    public static final int method419(int arg0, int arg1, byte arg2) {
        field970++;
        class185 var3 = (class185) class254.field4355.method1744((byte) 126, (long) arg1);
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = -101 % ((-arg2 - 14) / 45);
            int var5 = 0;
            for (int var6 = 0; var6 < var3.field3256.length; var6++) {
                if (var3.field3254[var6] == arg0) {
                    var5 += var3.field3256[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V", line = 46)
    public static final void method420(byte arg0) {
        class274.field4740.method2084(-7);
        field965++;
        if (arg0 < 3) {
            field981 = (class256) null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BILra;)V", line = 59)
    public final void method421(byte arg0, int arg1, class41 arg2) {
        if (arg0 <= 26) {
            this.method426(-87, -126);
        }
        while (true) {
            int var4 = arg2.method357(false);
            if (var4 == 0) {
                field964++;
                return;
            }
            this.method423(false, var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 83)
    public static void method422(int arg0) {
        field979 = null;
        field981 = null;
        field978 = (boolean[][]) null;
        field972 = null;
        int var1 = 62 / ((64 - arg0) / 38);
        field974 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZIILra;)V", line = 100)
    private final void method423(boolean arg0, int arg1, int arg2, class41 arg3) {
        if (arg0) {
            field968 = 12;
        }
        if (arg1 == 1) {
            this.field967 = arg3.method349((byte) -113);
            this.method426(-6902, this.field967);
        } else if (arg1 == 2) {
            this.field983 = arg3.method346(-16);
            if (this.field983 == 65535) {
                this.field983 = -1;
            }
        } else if (arg1 == 3) {
            this.field969 = arg3.method346(-16);
        } else if (arg1 == 4) {
            this.field977 = false;
        }
        field980++;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)Lhk;", line = 139)
    public static final class39 method424(int arg0, int arg1, int arg2) {
        class271 var3 = class41.field790[arg0][arg1][arg2];
        return var3 == null ? null : var3.field4643;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZ)V", line = 156)
    public static final void method425(int arg0, boolean arg1) {
        class77 var2 = class156.method1158(3, arg1, arg0);
        field975++;
        var2.method586((byte) 98);
        if (arg1) {
            field978 = (boolean[][]) ((boolean[][]) null);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V", line = 180)
    private final void method426(int arg0, int arg1) {
        if (arg0 != -6902) {
            return;
        }
        double var3 = (double) ((arg1 & 0xFF1E10) >> 16) / 256.0D;
        field982++;
        double var5 = (double) (arg1 & 0xFF) / 256.0D;
        double var7 = (double) ((arg1 & 0xFF4B) >> 8) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var3 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        if (var7 < var3) {
            var9 = var7;
        }
        if (var5 < var9) {
            var9 = var5;
        }
        if (var11 < var5) {
            var11 = var5;
        }
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        this.field971 = (int) (var17 * 256.0D);
        if (this.field971 < 0) {
            this.field971 = 0;
        } else if (this.field971 > 255) {
            this.field971 = 255;
        }
        if (var9 != var11) {
            if (var3 == var11) {
                var13 = (var7 - var5) / (var11 - var9);
            } else if (var7 == var11) {
                var13 = (var5 - var3) / (var11 - var9) + 2.0D;
            } else if (var5 == var11) {
                var13 = (var3 - var7) / (var11 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        double var19 = var13 / 6.0D;
        if ((var17 > 0.5D)) {
            this.field976 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field976 = (int) (var15 * var17 * 512.0D);
        }
        this.field966 = (int) (var15 * 256.0D);
        if (this.field966 < 0) {
            this.field966 = 0;
        } else if (this.field966 > 255) {
            this.field966 = 255;
        }
        if (this.field976 < 1) {
            this.field976 = 1;
        }
        this.field973 = (int) ((double) this.field976 * var19);
    }
}
