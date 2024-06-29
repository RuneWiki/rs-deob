import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class28 {

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lrd;")
    private static class173 field572 = class133.method843("Please enter your username)3", 110);

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field573 = 50;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "[I")
    public static int[] field571 = new int[field573];

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "Lrd;")
    private static class173 field577 = class133.method843("Please try again)3", -85);

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "Lrd;")
    public static class173 field575 = class133.method843("Ihr Charakter)2Profil wird in:", -89);

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "[I")
    public static int[] field578 = new int[field573];

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "[I")
    public static int[] field568 = new int[field573];

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Lrd;")
    public static class173 field574 = class133.method843("(U0a )2 via: ", 100);

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    public static int field581 = -1;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "[I")
    public static int[] field579 = new int[field573];

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "[I")
    public static int[] field580 = new int[field573];

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "Lrd;")
    private static class173 field585 = class133.method843("wave:", 20);

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Lrd;")
    public static class173 field569 = field585;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "[I")
    public static int[] field590 = new int[field573];

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "Lrd;")
    public static class173 field584 = field577;

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "[I")
    public static int[] field587 = new int[field573];

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "Lrd;")
    public static class173 field591 = field572;

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "[Lrd;")
    public static class173[] field586 = new class173[field573];

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "Lrd;")
    public static class173 field588 = field585;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "Laf;")
    public static class7 field582 = new class7(128);

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field589;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IB)Llg;")
    public static final class116 method223(int arg0, byte arg1) {
        field576++;
        class116 var2 = (class116) class191.field3737.method46((long) arg0, 26580);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class54.field1091.method142(arg0, 0, (byte) 2);
        if (var3 == null) {
            return null;
        }
        int var4 = 8 / ((-arg1 - 48) / 34);
        class116 var5 = new class116();
        class121 var6 = new class121(var3);
        var6.field2222 = var6.field2218.length - 2;
        int var7 = var6.method755((byte) -97);
        int var8 = var6.field2218.length - var7 - 2 - 12;
        var6.field2222 = var8;
        int var9 = var6.method776(-83);
        var5.field2153 = var6.method755((byte) -76);
        var5.field2146 = var6.method755((byte) -55);
        var5.field2140 = var6.method755((byte) -26);
        var5.field2137 = var6.method755((byte) -47);
        int var10 = var6.method751((byte) -89);
        if (var10 > 0) {
            var5.field2138 = new class112[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = var6.method755((byte) -51);
                class112 var13 = new class112(class144.method907(var12, -49));
                var5.field2138[var11] = var13;
                while (var12-- > 0) {
                    int var14 = var6.method776(-84);
                    int var15 = var6.method776(-81);
                    var13.method675((long) var14, new class76(var15), false);
                }
            }
        }
        var6.field2222 = 0;
        var5.field2152 = var6.method761(-1);
        int var16 = 0;
        var5.field2150 = new class173[var9];
        var5.field2141 = new int[var9];
        var5.field2136 = new int[var9];
        while (var8 > var6.field2222) {
            int var17 = var6.method755((byte) -103);
            if (var17 == 3) {
                var5.field2150[var16] = var6.method746(-19941);
            } else if (var17 >= 100 || var17 == 21 || var17 == 38 || var17 == 39) {
                var5.field2141[var16] = var6.method751((byte) 118);
            } else {
                var5.field2141[var16] = var6.method776(119);
            }
            var5.field2136[var16++] = var17;
        }
        class191.field3737.method52(-3583, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([BZLmb;)V")
    public final void method224(byte[] arg0, boolean arg1, class121 arg2) {
        field583++;
        if (arg2.field2218[arg2.field2222] != 31 || arg2.field2218[arg2.field2222 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (!arg1) {
            this.method224(null, false, null);
        }
        if (this.field589 == null) {
            this.field589 = new Inflater(true);
        }
        try {
            this.field589.setInput(arg2.field2218, arg2.field2222 + 10, -arg2.field2222 - 8 + arg2.field2218.length + -10);
            this.field589.inflate(arg0);
        } catch (Exception var4) {
            this.field589.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field589.reset();
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)Lkh;")
    public static final class107 method225(int arg0, int arg1, int arg2) {
        class105 var3 = class208.field4055[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1959;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "()V")
    public class28() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static void method226(int arg0) {
        field591 = null;
        field590 = null;
        field584 = null;
        field572 = null;
        field571 = null;
        field582 = null;
        field577 = null;
        field580 = null;
        field568 = null;
        field588 = null;
        field579 = null;
        field578 = null;
        field569 = null;
        field585 = null;
        field574 = null;
        if (arg0 != -22) {
            field571 = null;
        }
        field586 = null;
        field575 = null;
        field587 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lnc;IIIIII)V")
    public static final void method227(class132 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg0.field2484.length;
        for (int var8 = 0; var8 < var7; var8++) {
            int var21 = arg0.field2484[var8] - class98.field1791;
            int var22 = arg0.field2500[var8] - class106.field1984;
            int var23 = arg0.field2501[var8] - class161.field2998;
            int var24 = arg3 * var23 + arg4 * var21 >> 16;
            int var25 = arg4 * var23 - arg3 * var21 >> 16;
            int var27 = arg2 * var22 - arg1 * var25 >> 16;
            int var28 = arg1 * var22 + arg2 * var25 >> 16;
            if (var28 < 50) {
                return;
            }
            if (arg0.field2491 != null) {
                class132.field2504[var8] = var24;
                class132.field2487[var8] = var27;
                class132.field2497[var8] = var28;
            }
            class132.field2495[var8] = (var24 << 9) / var28 + class72.field1411;
            class132.field2499[var8] = (var27 << 9) / var28 + class72.field1398;
        }
        class72.field1409 = 0;
        int var9 = arg0.field2489.length;
        for (int var10 = 0; var10 < var9; var10++) {
            int var11 = arg0.field2489[var10];
            int var12 = arg0.field2496[var10];
            int var13 = arg0.field2488[var10];
            int var14 = class132.field2495[var11];
            int var15 = class132.field2495[var12];
            int var16 = class132.field2495[var13];
            int var17 = class132.field2499[var11];
            int var18 = class132.field2499[var12];
            int var19 = class132.field2499[var13];
            if ((var14 - var15) * (var19 - var18) - (var16 - var15) * (var17 - var18) > 0) {
                if (class97.field1773 && class134.method850(class3.field23, class57.field1142, var17, var18, var19, var14, var15, var16)) {
                    class116.field2154 = arg5;
                    class139.field2598 = arg6;
                }
                class72.field1407 = false;
                if (var14 < 0 || var15 < 0 || var16 < 0 || var14 > class72.field1402 || var15 > class72.field1402 || var16 > class72.field1402) {
                    class72.field1407 = true;
                }
                if (arg0.field2491 == null || arg0.field2491[var10] == -1) {
                    if (arg0.field2498[var10] != 12345678) {
                        class72.method433(var17, var18, var19, var14, var15, var16, arg0.field2498[var10], arg0.field2486[var10], arg0.field2483[var10]);
                    }
                } else if (class217.field4200) {
                    int var20 = class72.field1400.method15(arg0.field2491[var10], 73);
                    class72.method433(var17, var18, var19, var14, var15, var16, class126.method806(var20, arg0.field2498[var10]), class126.method806(var20, arg0.field2486[var10]), class126.method806(var20, arg0.field2483[var10]));
                } else if (arg0.field2502) {
                    class72.method446(var17, var18, var19, var14, var15, var16, arg0.field2498[var10], arg0.field2486[var10], arg0.field2483[var10], class132.field2504[0], class132.field2504[1], class132.field2504[3], class132.field2487[0], class132.field2487[1], class132.field2487[3], class132.field2497[0], class132.field2497[1], class132.field2497[3], arg0.field2491[var10]);
                } else {
                    class72.method446(var17, var18, var19, var14, var15, var16, arg0.field2498[var10], arg0.field2486[var10], arg0.field2483[var10], class132.field2504[var11], class132.field2504[var12], class132.field2504[var13], class132.field2487[var11], class132.field2487[var12], class132.field2487[var13], class132.field2497[var11], class132.field2497[var12], class132.field2497[var13], arg0.field2491[var10]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(III)V")
    private class28(int arg0, int arg1, int arg2) {
    }
}
