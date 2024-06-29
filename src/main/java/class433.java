import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class433 extends class179 {

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "Lps;")
    public class302 field5908;

    @OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!bc", name = "B", descriptor = "Lih;")
    public static class108 field5917;

    @OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
    public static int field5911;

    @OriginalMember(owner = "client!bc", name = "w", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!bc", name = "z", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "Lc;")
    public static class436 field5910;

    @OriginalMember(owner = "client!bc", name = "A", descriptor = "[Lc;")
    public static class436[] field5916;

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "[Z")
    public static boolean[] field5909;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public static final void method2638(int arg0) {
        if (arg0 > -8) {
            method2641(95);
        }
        field5911++;
        if (class318.field4284 != null) {
            return;
        }
        class318.field4284 = new int[65536];
        double var1 = (Math.random() * 0.03D - 0.015D) + 0.7D;
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFE5D) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x395) >> 7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if ((var8 < 0.5D)) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if ((var20 * 2.0D < 1.0D)) {
                    var10 = var16;
                } else if (var20 * 3.0D < 2.0D) {
                    var10 = (0.6666666666666666D - var20) * (var16 - var18) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var24 * 6.0D < 1.0D)) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if (var24 * 2.0D < 1.0D) {
                    var14 = var16;
                } else if ((var24 * 3.0D < 2.0D)) {
                    var14 = (0.6666666666666666D - var24) * (var16 - var18) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + var34 + (var33 << 8);
            class318.field4284[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(B)V")
    public static void method2639(byte arg0) {
        field5910 = null;
        field5909 = null;
        field5917 = null;
        field5916 = null;
        if (arg0 != 26) {
            field5918 = -78;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lwo;Z)V")
    public static final void method2640(class285 arg0, boolean arg1) {
        if (!arg1) {
            field5910 = null;
        }
        field5914++;
        class349.field4757 = arg0;
        class431.field5879 = class349.field4757.method1821(-120, 16);
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
    public static final void method2641(int arg0) {
        field5915++;
        class258.field3327 = arg0;
        class134.field1531 = arg0;
        class370.field5035 = arg0;
        class242.field3233 = arg0;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Laq;B)V")
    public static final void method2642(class453 arg0, byte arg1) {
        field5913++;
        int var2 = -1 % ((arg1 - 38) / 57);
        int var3 = arg0.field6415;
        if (var3 == 327) {
            arg0.field6478 = 150;
            arg0.field6332 = (int) (Math.sin((double) class106.field1273 / 40.0D) * 256.0D) & 0x3FFF;
            arg0.field6411 = 5;
            arg0.field6435 = -1;
        } else if (var3 == 328) {
            if (class143.field1684.field1480 == null) {
                arg0.field6330 = 0;
                arg0.field6435 = 0;
            } else {
                arg0.field6478 = 150;
                arg0.field6332 = (int) (Math.sin((double) class106.field1273 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field6411 = 5;
                arg0.field6435 = 2047;
                arg0.field6330 = class223.method1358(class143.field1684.field1480, (byte) -127);
                arg0.field6439 = 0;
                arg0.field6331 = class143.field1684.field2457;
                arg0.field6426 = class143.field1684.field2394;
                arg0.field6315 = class143.field1684.field2420;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lps;)V")
    public class433(class302 arg0) {
        this.field5908 = arg0;
    }

    static {
        new class72("To prevent further mutes please read the rules.", "Um eine erneute Stummschaltung zu verhindern, lies bitte die Regeln.", "Pour éviter un nouveau blocage, lisez le règlement.", "Para evitar outros vetos, leia as regras.");
        field5918 = 0;
        field5917 = new class108(64);
    }
}
