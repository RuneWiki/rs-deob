import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class406 extends class390 {

    @OriginalMember(owner = "client!qf", name = "m", descriptor = "I")
    public int field5773;

    @OriginalMember(owner = "client!qf", name = "n", descriptor = "Lbj;")
    public static class131 field5774;

    @OriginalMember(owner = "client!qf", name = "o", descriptor = "Lec;")
    public static class129 field5775;

    @OriginalMember(owner = "client!qf", name = "q", descriptor = "[I")
    public static int[] field5777;

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    public static int field5770;

    @OriginalMember(owner = "client!qf", name = "k", descriptor = "I")
    public static int field5771;

    @OriginalMember(owner = "client!qf", name = "l", descriptor = "Laa;")
    public static class283 field5772;

    @OriginalMember(owner = "client!qf", name = "p", descriptor = "[[I")
    public static int[][] field5776;

    static {
        new class442("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field5774 = new class131(64);
        field5775 = new class129(8);
        field5777 = new int[50];
        new class442("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V", line = 4)
    public static final void method2548(int arg0) {
        field5770++;
        class46.field648.field191 = 0;
        class135.field1970 = 0;
        class263.field3677 = 0;
        class206.field2833 = -1;
        class304.field4190 = -1;
        class181.field2490 = -1;
        class15.field290 = 0;
        class333.field4591.field191 = 0;
        class50.field698 = -1;
        class126.method859(false);
        class198.method1296((byte) -95);
        for (int var1 = 0; var1 < class381.field5447.length; var1++) {
            if (class381.field5447[var1] != null) {
                class381.field5447[var1].field5275 = -1;
            }
        }
        if (arg0 != 24387) {
            return;
        }
        for (int var2 = 0; var2 < class98.field1358.length; var2++) {
            if (class98.field1358[var2] != null) {
                class98.field1358[var2].field5275 = -1;
            }
        }
        class371.method2379(arg0 - 24497);
        class128.field1807 = 1;
        class139.method958(30, false);
        for (int var3 = 0; var3 < 100; var3++) {
            class377.field5395[var3] = true;
        }
        class228.method1579(-39);
    }

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V", line = 62)
    public static void method2549(int arg0) {
        field5774 = null;
        field5777 = null;
        field5775 = null;
        field5772 = null;
        int var1 = -100 % ((arg0 - 52) / 46);
        field5776 = null;
    }

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V", line = 81)
    public static final void method2550(int arg0) {
        while (true) {
            if (class333.field4591.method1190((byte) 126, class15.field290) >= 27) {
                int var1 = class333.field4591.method1186((byte) -97, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class98.field1358[var1] == null) {
                        class98.field1358[var1] = new class198();
                        var2 = true;
                        class98.field1358[var1].field5294 = var1;
                    }
                    class198 var3 = class98.field1358[var1];
                    class135.field1967[class125.field1758++] = var1;
                    var3.field5260 = class276.field3837;
                    if (var3.field2737 != null && var3.field2737.method2102(arg0 - 4124)) {
                        class285.method1862(1, var3);
                    }
                    var3.method1290((byte) 114, class412.method2584(class333.field4591.method1186((byte) -97, 14), true));
                    int var4 = class333.field4591.method1186((byte) -97, 5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    int var5 = class333.field4591.method1186((byte) -97, 1);
                    if (var5 == 1) {
                        class314.field4301[class438.field6171++] = var1;
                    }
                    int var6 = class333.field4591.method1186((byte) -97, 1);
                    int var7 = class333.field4591.method1186((byte) -97, 3) + 4 << 11 & 0x3AD0;
                    int var8 = class333.field4591.method1186((byte) -97, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method2383(var3.field2737.field4488, (byte) 1);
                    var3.field5313 = var3.field2737.field4478 << 3;
                    if (var3.field5313 == 0) {
                        var3.method2386(16383, 0);
                    } else if (var2) {
                        var3.method2386(arg0 ^ 0x3FDF, var7);
                    }
                    var3.method2389(class412.field5841.field5326[0] + var4, class142.field2034, var3.method942(false), var6 == 1, -87, class412.field5841.field5332[0] + var8);
                    if (var3.field2737.method2102(arg0 - 4124)) {
                        class369.method2373(1, var3.field5332[0], (class134) null, 0, var3, var3.field5326[0], (class64) null, class142.field2034);
                    }
                    continue;
                }
            }
            field5771++;
            if (arg0 != 32) {
                field5775 = null;
            }
            class333.field4591.method1185((byte) -115);
            return;
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V", line = 161)
    public class406() {
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(I)V", line = 171)
    public class406(int arg0) {
        this.field5773 = arg0;
    }
}
