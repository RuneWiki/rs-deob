import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class64 {

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public int field841;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Lqg;")
    public static class256 field835 = new class256();

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public int field838;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public int field842;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field844;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public int field847;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Lge;")
    public class164 field834;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "Lkb;")
    public static class39 field852;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "Lkb;")
    public static class39 field853;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "[I")
    public int[] field837;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "[I")
    public int[] field839;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "[I")
    public int[] field840;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "[I")
    public int[] field843;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "[I")
    public int[] field849;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "[I")
    public int[] field850;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "[Lge;")
    public class164[] field836;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "[[I")
    public int[][] field846;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "[[I")
    public int[][] field851;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[B)V", line = 7)
    private final void method428(int arg0, byte[] arg1) {
        field845++;
        class192 var3 = new class192(class132.method909(arg1, -1));
        int var4 = var3.method1399(-1172389784);
        if (arg0 >= -60) {
            this.method428(5, (byte[]) null);
        }
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field842 = var3.method1354((byte) -128);
        } else {
            this.field842 = 0;
        }
        int var5 = -1;
        int var6 = 0;
        int var7 = var3.method1399(-1172389784);
        this.field838 = var3.method1396(-88);
        this.field843 = new int[this.field838];
        for (int var8 = 0; var8 < this.field838; var8++) {
            this.field843[var8] = var6 += var3.method1396(-107);
            if (var5 < this.field843[var8]) {
                var5 = this.field843[var8];
            }
        }
        this.field847 = var5 + 1;
        this.field839 = new int[this.field847];
        this.field840 = new int[this.field847];
        this.field851 = new int[this.field847][];
        this.field837 = new int[this.field847];
        this.field849 = new int[this.field847];
        if (var7 != 0) {
            this.field850 = new int[this.field847];
            for (int var9 = 0; var9 < this.field847; var9++) {
                this.field850[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field838; var10++) {
                this.field850[this.field843[var10]] = var3.method1354((byte) -115);
            }
            this.field834 = new class164(this.field850);
        }
        for (int var11 = 0; var11 < this.field838; var11++) {
            this.field837[this.field843[var11]] = var3.method1354((byte) -124);
        }
        for (int var12 = 0; var12 < this.field838; var12++) {
            this.field849[this.field843[var12]] = var3.method1354((byte) -7);
        }
        for (int var13 = 0; var13 < this.field838; var13++) {
            this.field840[this.field843[var13]] = var3.method1396(-91);
        }
        for (int var14 = 0; var14 < this.field838; var14++) {
            int var15 = 0;
            int var16 = this.field843[var14];
            int var17 = -1;
            int var18 = this.field840[var16];
            this.field851[var16] = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                int var20 = this.field851[var16][var19] = var15 += var3.method1396(-82);
                if (var20 > var17) {
                    var17 = var20;
                }
            }
            this.field839[var16] = var17 + 1;
            if ((var17 + 1) == var18) {
                this.field851[var16] = null;
            }
        }
        if (var7 == 0) {
            return;
        }
        this.field846 = new int[var5 + 1][];
        this.field836 = new class164[var5 + 1];
        for (int var21 = 0; var21 < this.field838; var21++) {
            int var22 = this.field843[var21];
            int var23 = this.field840[var22];
            this.field846[var22] = new int[this.field839[var22]];
            for (int var24 = 0; var24 < this.field839[var22]; var24++) {
                this.field846[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field851[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field851[var22][var25];
                }
                this.field846[var22][var26] = var3.method1354((byte) 115);
            }
            this.field836[var22] = new class164(this.field846[var22]);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 185)
    public static void method429(byte arg0) {
        if (arg0 == 27) {
            field852 = null;
            field835 = null;
            field853 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)V", line = 206)
    public static final void method430(boolean arg0) {
        field848++;
        class80.field1201.method1615(43);
        if (arg0) {
            method430(true);
        }
        class89.field1362.method1615(55);
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "([BI)V", line = 224)
    public class64(byte[] arg0, int arg1) {
        this.field841 = class160.method1107(arg0.length, arg0, 0);
        if (this.field841 != arg1) {
            throw new RuntimeException();
        }
        this.method428(-73, arg0);
    }
}
