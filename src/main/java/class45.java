import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class45 {

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "I")
    private int field745 = 0;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    private int field762 = -1;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "Z")
    public static boolean field749 = true;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field750 = 0;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "Lsb;")
    public static class98 field748 = class47.method368("Lade Konfiguration )2 ", 0);

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "Lsb;")
    public static class98 field751 = class47.method368("null", 0);

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public static int field757 = 1;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field758 = 0;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "Z")
    public static boolean field747 = true;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public int field753;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public int field756;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public int field759;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "I")
    public int field761;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "Lac;")
    public static class188 field743;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)V")
    private final void method354(int arg0, int arg1) {
        field746++;
        double var3 = (double) ((arg0 & 0xFF5471) >> 16) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF56) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var3 == var11) {
                var15 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var15 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var15 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field756 = (int) (var13 * 256.0D);
        this.field759 = (int) (var17 * 256.0D);
        if (this.field756 < 0) {
            this.field756 = 0;
        } else if (this.field756 > 255) {
            this.field756 = 255;
        }
        double var19 = var15 / 6.0D;
        if ((var17 > 0.5D)) {
            this.field753 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field753 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field759 < 0) {
            this.field759 = 0;
        } else if (this.field759 > 255) {
            this.field759 = 255;
        }
        if (arg1 <= -31) {
            if (this.field753 < 1) {
                this.field753 = 1;
            }
            this.field761 = (int) ((double) this.field753 * var19);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static void method355(int arg0) {
        field751 = null;
        if (arg0 != 32559) {
            method360();
        }
        field748 = null;
        field743 = null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
    public static final void method356(boolean arg0) {
        if (!arg0) {
            field751 = null;
        }
        for (int var1 = -1; var1 < class97.field1671; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class51.field831[var1];
            }
            class192 var3 = class141.field2499[var2];
            if (var3 != null) {
                class105.method805(var3, 87, var3.field4486);
            }
        }
        field744++;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Llj;IBI)V")
    private final void method357(class216 arg0, int arg1, byte arg2, int arg3) {
        if (arg3 == 1) {
            this.field745 = arg0.method1448(26420);
            this.method354(this.field745, arg2 - 194);
        } else if (arg3 == 2) {
            this.field762 = arg0.method1487(3);
            if (this.field762 == 65535) {
                this.field762 = -1;
            }
        } else if (arg3 == 3) {
            arg0.method1487(32);
        }
        field755++;
        if (arg2 != 113) {
            this.method358(-125, (byte) -103, (class216) null);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBLlj;)V")
    public final void method358(int arg0, byte arg1, class216 arg2) {
        field763++;
        if (arg1 != -62) {
            field757 = 125;
        }
        while (true) {
            int var4 = arg2.method1446(5350);
            if (var4 == 0) {
                return;
            }
            this.method357(arg2, arg0, (byte) 113, var4);
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(II)Z")
    public static final boolean method359(int arg0, int arg1) {
        field754++;
        int var2 = -112 / ((arg0 - 47) / 58);
        return (arg1 & 0x2CB6DA39) >> 29 != 0;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "()V")
    public static final void method360() {
        for (int var0 = 0; var0 < class228.field3920; var0++) {
            for (int var4 = 0; var4 < class211.field3610; var4++) {
                for (int var5 = 0; var5 < class72.field1194; var5++) {
                    class31.field553[var0][var4][var5] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class75.field1327; var1++) {
            class131.field2334[var1] = null;
        }
        class75.field1327 = 0;
        for (int var2 = 0; var2 < class198.field3406; var2++) {
            class105.field1877[var2] = null;
        }
        class198.field3406 = 0;
        for (int var3 = 0; var3 < class171.field3019.length; var3++) {
            class171.field3019[var3] = null;
        }
    }
}
