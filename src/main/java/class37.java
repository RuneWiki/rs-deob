import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class37 {

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    public int field624;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "S")
    public static short field601 = 256;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Lwm;")
    public static class152 field602 = class157.method1048("overlay2", 98);

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "[[Z")
    public static boolean[][] field622 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field618 = 0;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "I")
    public static int field616 = 0;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "I")
    public static int field625 = -1;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "Lne;")
    public static class235 field607 = new class235(64);

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    public int field610;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    public int field614;

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
    public int field615;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "Lah;")
    public static class205 field626;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "Lsh;")
    public class287 field620;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "[I")
    public int[] field604;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "[I")
    public int[] field608;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "[I")
    public int[] field609;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "[I")
    public int[] field611;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "[I")
    public int[] field613;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "[I")
    public int[] field621;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "[Lsh;")
    public class287[] field603;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "[[I")
    public int[][] field606;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "[[I")
    public int[][] field617;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V", line = 11)
    public static void method269(byte arg0) {
        field602 = null;
        int var1 = -53 / ((arg0 + 9) / 50);
        field607 = null;
        field622 = (boolean[][]) null;
        field626 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "([BI)V", line = 24)
    private final void method270(byte[] arg0, int arg1) {
        field619++;
        class291 var3 = new class291(class80.method528(false, arg0));
        int var4 = var3.method2011(-80);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field610 = 0;
        } else {
            this.field610 = var3.method1969((byte) -16);
        }
        int var5 = 0;
        int var6 = var3.method2011(-49);
        this.field615 = var3.method2021((byte) 74);
        this.field609 = new int[this.field615];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field615; var8++) {
            this.field609[var8] = var5 += var3.method2021((byte) 74);
            if (var7 < this.field609[var8]) {
                var7 = this.field609[var8];
            }
        }
        this.field614 = var7 + 1;
        this.field613 = new int[this.field614];
        this.field621 = new int[this.field614];
        this.field608 = new int[this.field614];
        this.field604 = new int[this.field614];
        this.field606 = new int[this.field614][];
        if (var6 != 0) {
            this.field611 = new int[this.field614];
            for (int var9 = 0; var9 < this.field614; var9++) {
                this.field611[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field615; var10++) {
                this.field611[this.field609[var10]] = var3.method1969((byte) -16);
            }
            this.field620 = new class287(this.field611);
        }
        for (int var11 = 0; var11 < this.field615; var11++) {
            this.field604[this.field609[var11]] = var3.method1969((byte) -16);
        }
        int var12 = 0;
        if (arg1 < 112) {
            this.field603 = (class287[]) null;
        }
        while (this.field615 > var12) {
            this.field621[this.field609[var12]] = var3.method1969((byte) -16);
            var12++;
        }
        for (int var13 = 0; var13 < this.field615; var13++) {
            this.field613[this.field609[var13]] = var3.method2021((byte) 74);
        }
        for (int var14 = 0; var14 < this.field615; var14++) {
            int var15 = 0;
            int var16 = this.field609[var14];
            int var17 = this.field613[var16];
            this.field606[var16] = new int[var17];
            int var18 = -1;
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field606[var16][var19] = var15 += var3.method2021((byte) 74);
                if (var18 < var20) {
                    var18 = var20;
                }
            }
            this.field608[var16] = var18 + 1;
            if ((var18 + 1) == var17) {
                this.field606[var16] = null;
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field603 = new class287[var7 + 1];
        this.field617 = new int[var7 + 1][];
        for (int var21 = 0; var21 < this.field615; var21++) {
            int var22 = this.field609[var21];
            int var23 = this.field613[var22];
            this.field617[var22] = new int[this.field608[var22]];
            for (int var24 = 0; var24 < this.field608[var22]; var24++) {
                this.field617[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field606[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field606[var22][var25];
                }
                this.field617[var22][var26] = var3.method1969((byte) -16);
            }
            this.field603[var22] = new class287(this.field617[var22]);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)I", line = 201)
    public static final int method271(boolean arg0) {
        field623++;
        return arg0 ? -114 : 15;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(Z)I", line = 232)
    public static final int method272(boolean arg0) {
        if (arg0) {
            field612++;
            return class162.field2569;
        } else {
            return -62;
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "([BI)V", line = 261)
    public class37(byte[] arg0, int arg1) {
        this.field624 = class122.method788((byte) 69, arg0, arg0.length);
        if (this.field624 != arg1) {
            throw new RuntimeException();
        }
        this.method270(arg0, 127);
    }
}
