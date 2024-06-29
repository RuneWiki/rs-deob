import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class142 {

    @OriginalMember(owner = "client!sc", name = "y", descriptor = "I")
    public int field2592;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Lce;")
    public static class126 field2571 = class206.method1445(-7923, "clignotant3:");

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "Lce;")
    public static class126 field2583 = class206.method1445(-7923, ":chalreq:");

    @OriginalMember(owner = "client!sc", name = "v", descriptor = "Lce;")
    public static class126 field2589 = class206.method1445(-7923, ",Mcran)2titre ouvert");

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Lce;")
    public static class126 field2574 = class206.method1445(-7923, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "Lce;")
    public static class126 field2575 = class206.method1445(-7923, "M");

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Lce;")
    private static class126 field2585 = class206.method1445(-7923, "Cancel");

    @OriginalMember(owner = "client!sc", name = "t", descriptor = "Lce;")
    public static class126 field2587 = class206.method1445(-7923, "gelb:");

    @OriginalMember(owner = "client!sc", name = "x", descriptor = "I")
    public static int field2591 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "Lce;")
    public static class126 field2582 = field2585;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public int field2569;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public int field2579;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "I")
    public int field2584;

    @OriginalMember(owner = "client!sc", name = "A", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!sc", name = "C", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Lcc;")
    public static class313 field2570;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Lra;")
    public class41 field2577;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Z")
    public static boolean field2572;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "[I")
    public int[] field2573;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "[I")
    public int[] field2578;

    @OriginalMember(owner = "client!sc", name = "s", descriptor = "[I")
    public int[] field2586;

    @OriginalMember(owner = "client!sc", name = "w", descriptor = "[I")
    public int[] field2590;

    @OriginalMember(owner = "client!sc", name = "z", descriptor = "[I")
    public int[] field2593;

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "[I")
    public int[] field2596;

    @OriginalMember(owner = "client!sc", name = "u", descriptor = "[Lra;")
    public class41[] field2588;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "[[I")
    public int[][] field2568;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "[[I")
    public int[][] field2576;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1036(int arg0) {
        class189.field3244.method1178(-88);
        class167.field2967.method1178(-118);
        field2581++;
        if (arg0 != 0) {
            method1039(-82);
        }
        class170.field3019.method1178(-111);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V", line = 38)
    public static void method1037(byte arg0) {
        field2571 = null;
        field2574 = null;
        field2582 = null;
        field2587 = null;
        field2589 = null;
        field2575 = null;
        int var1 = 94 / ((20 - arg0) / 60);
        field2583 = null;
        field2570 = null;
        field2585 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([BI)V", line = 67)
    private final void method1038(byte[] arg0, int arg1) {
        class134 var3 = new class134(class93.method638(-1, arg0));
        field2594++;
        int var4 = var3.method948(-128);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        int var5 = 0;
        if (var4 < 6) {
            this.field2584 = 0;
        } else {
            this.field2584 = var3.method957(496113200);
        }
        int var6 = var3.method948(-126);
        this.field2569 = var3.method942(true);
        int var7 = -96 % ((-arg1 - 76) / 41);
        int var8 = -1;
        this.field2586 = new int[this.field2569];
        for (int var9 = 0; var9 < this.field2569; var9++) {
            this.field2586[var9] = var5 += var3.method942(true);
            if (var8 < this.field2586[var9]) {
                var8 = this.field2586[var9];
            }
        }
        this.field2579 = var8 + 1;
        this.field2568 = new int[this.field2579][];
        this.field2590 = new int[this.field2579];
        this.field2596 = new int[this.field2579];
        this.field2593 = new int[this.field2579];
        this.field2578 = new int[this.field2579];
        if (var6 != 0) {
            this.field2573 = new int[this.field2579];
            for (int var10 = 0; var10 < this.field2579; var10++) {
                this.field2573[var10] = -1;
            }
            for (int var11 = 0; var11 < this.field2569; var11++) {
                this.field2573[this.field2586[var11]] = var3.method957(496113200);
            }
            this.field2577 = new class41(this.field2573);
        }
        for (int var12 = 0; var12 < this.field2569; var12++) {
            this.field2590[this.field2586[var12]] = var3.method957(496113200);
        }
        for (int var13 = 0; var13 < this.field2569; var13++) {
            this.field2578[this.field2586[var13]] = var3.method957(496113200);
        }
        for (int var14 = 0; var14 < this.field2569; var14++) {
            this.field2593[this.field2586[var14]] = var3.method942(true);
        }
        for (int var15 = 0; var15 < this.field2569; var15++) {
            int var16 = 0;
            int var17 = this.field2586[var15];
            int var18 = this.field2593[var17];
            int var19 = -1;
            this.field2568[var17] = new int[var18];
            for (int var20 = 0; var20 < var18; var20++) {
                int var21 = this.field2568[var17][var20] = var16 += var3.method942(true);
                if (var19 < var21) {
                    var19 = var21;
                }
            }
            this.field2596[var17] = var19 + 1;
            if (var19 + 1 == var18) {
                this.field2568[var17] = null;
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field2588 = new class41[var8 + 1];
        this.field2576 = new int[var8 + 1][];
        for (int var22 = 0; var22 < this.field2569; var22++) {
            int var23 = this.field2586[var22];
            int var24 = this.field2593[var23];
            this.field2576[var23] = new int[this.field2596[var23]];
            for (int var25 = 0; var25 < this.field2596[var23]; var25++) {
                this.field2576[var23][var25] = -1;
            }
            for (int var26 = 0; var26 < var24; var26++) {
                int var27;
                if (this.field2568[var23] == null) {
                    var27 = var26;
                } else {
                    var27 = this.field2568[var23][var26];
                }
                this.field2576[var23][var27] = var3.method957(496113200);
            }
            this.field2588[var23] = new class41(this.field2576[var23]);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)Z", line = 255)
    public static final boolean method1039(int arg0) {
        field2580++;
        if (arg0 != -17021) {
            method1037((byte) -5);
        }
        try {
            if (class33.field477 == 2) {
                if (class41.field657 == null) {
                    class41.field657 = class178.method1286(class100.field1608, class240.field4050, class272.field4587);
                    if (class41.field657 == null) {
                        return false;
                    }
                }
                if (class99.field1602 == null) {
                    class99.field1602 = new class269(class301.field5005, class40.field638);
                }
                if (class217.field3654.method2060(class41.field657, class5.field45, 22050, class99.field1602, 0)) {
                    class217.field3654.method2082(true);
                    class217.field3654.method2078((byte) -124, class315.field5413);
                    class217.field3654.method2087(class41.field657, (byte) 107, class288.field4785);
                    class100.field1608 = null;
                    class99.field1602 = null;
                    class41.field657 = null;
                    class33.field477 = 0;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class217.field3654.method2071(224);
            class41.field657 = null;
            class100.field1608 = null;
            class33.field477 = 0;
            class99.field1602 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "([BI)V", line = 329)
    public class142(byte[] arg0, int arg1) {
        this.field2592 = class120.method787(arg0.length, arg0, 0);
        if (this.field2592 != arg1) {
            throw new RuntimeException();
        }
        this.method1038(arg0, -117);
    }
}
