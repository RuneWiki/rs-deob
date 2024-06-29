import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class404 {

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public int field5582;

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "Z")
    public static boolean field5589 = true;

    @OriginalMember(owner = "client!jp", name = "s", descriptor = "Lhc;")
    public static class368 field5592 = new class368("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "Z")
    public static boolean field5593 = true;

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "[Lgo;")
    public static class177[] field5595 = new class177[29];

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public int field5576;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public int field5577;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
    public static int field5585;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
    public int field5588;

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "Lmn;")
    public class78 field5591;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "[I")
    public int[] field5580;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "[I")
    public int[] field5581;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "[I")
    public int[] field5583;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "[I")
    public int[] field5584;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "[I")
    public int[] field5586;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "[I")
    public int[] field5587;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "[Lmn;")
    public class78[] field5575;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "[[I")
    public int[][] field5579;

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "[[I")
    public int[][] field5590;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(III)V", line = 3)
    public static final void method2494(int arg0, int arg1, int arg2) {
        class66.field924[arg0] = arg1;
        field5585++;
        class93 var3 = (class93) class366.field5073.method837((byte) -72, (long) arg0);
        if (arg2 != 0) {
            return;
        }
        if (var3 == null) {
            class93 var4 = new class93(4611686018427387905L);
            class366.field5073.method835(4, var4, (long) arg0);
        } else if (var3.field1295 != 4611686018427387905L) {
            var3.field1295 = class199.method1372(30938) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BZ)V", line = 30)
    public static final void method2495(byte arg0, boolean arg1) {
        int var2 = 56 % ((-arg0 - 65) / 49);
        field5574++;
        if (arg1 != class14.field180) {
            class14.field180 = arg1;
            class266.method1694((byte) 110);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B[B)V", line = 54)
    private final void method2496(byte arg0, byte[] arg1) {
        int var3 = 31 % ((-arg0 - 66) / 43);
        field5578++;
        class366 var4 = new class366(class210.method1409(arg1, (byte) 127));
        int var5 = var4.method2306((byte) 50);
        if (var5 != 5 && var5 != 6) {
            throw new RuntimeException();
        }
        if (var5 < 6) {
            this.field5577 = 0;
        } else {
            this.field5577 = var4.method2258(1177515464);
        }
        int var6 = var4.method2306((byte) 28);
        this.field5588 = var4.method2297(13352);
        int var7 = 0;
        int var8 = -1;
        this.field5584 = new int[this.field5588];
        for (int var9 = 0; var9 < this.field5588; var9++) {
            this.field5584[var9] = var7 += var4.method2297(13352);
            if (this.field5584[var9] > var8) {
                var8 = this.field5584[var9];
            }
        }
        this.field5576 = var8 + 1;
        this.field5580 = new int[this.field5576];
        this.field5586 = new int[this.field5576];
        this.field5587 = new int[this.field5576];
        this.field5579 = new int[this.field5576][];
        this.field5581 = new int[this.field5576];
        if (var6 != 0) {
            this.field5583 = new int[this.field5576];
            for (int var10 = 0; var10 < this.field5576; var10++) {
                this.field5583[var10] = -1;
            }
            for (int var11 = 0; var11 < this.field5588; var11++) {
                this.field5583[this.field5584[var11]] = var4.method2258(1177515464);
            }
            this.field5591 = new class78(this.field5583);
        }
        for (int var12 = 0; var12 < this.field5588; var12++) {
            this.field5586[this.field5584[var12]] = var4.method2258(1177515464);
        }
        for (int var13 = 0; var13 < this.field5588; var13++) {
            this.field5587[this.field5584[var13]] = var4.method2258(1177515464);
        }
        for (int var14 = 0; var14 < this.field5588; var14++) {
            this.field5580[this.field5584[var14]] = var4.method2297(13352);
        }
        for (int var15 = 0; var15 < this.field5588; var15++) {
            int var22 = this.field5584[var15];
            int var23 = 0;
            int var24 = this.field5580[var22];
            int var25 = -1;
            this.field5579[var22] = new int[var24];
            for (int var26 = 0; var26 < var24; var26++) {
                int var27 = this.field5579[var22][var26] = var23 += var4.method2297(13352);
                if (var27 > var25) {
                    var25 = var27;
                }
            }
            this.field5581[var22] = var25 + 1;
            if ((var25 + 1) == var24) {
                this.field5579[var22] = null;
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field5575 = new class78[var8 + 1];
        this.field5590 = new int[var8 + 1][];
        for (int var16 = 0; var16 < this.field5588; var16++) {
            int var17 = this.field5584[var16];
            int var18 = this.field5580[var17];
            this.field5590[var17] = new int[this.field5581[var17]];
            for (int var19 = 0; var19 < this.field5581[var17]; var19++) {
                this.field5590[var17][var19] = -1;
            }
            for (int var20 = 0; var20 < var18; var20++) {
                int var21;
                if (this.field5579[var17] == null) {
                    var21 = var20;
                } else {
                    var21 = this.field5579[var17][var20];
                }
                this.field5590[var17][var21] = var4.method2258(1177515464);
            }
            this.field5575[var17] = new class78(this.field5590[var17]);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V", line = 223)
    public static void method2497(int arg0) {
        field5592 = null;
        field5595 = null;
        if (arg0 != 9644) {
            field5592 = null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "([BI)V", line = 251)
    public class404(byte[] arg0, int arg1) {
        this.field5582 = class81.method656(120, arg0.length, arg0);
        if (this.field5582 != arg1) {
            throw new RuntimeException();
        }
        this.method2496((byte) 82, arg0);
    }
}
