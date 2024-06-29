import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class17 {

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public int field236;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "Lnc;")
    public static class85 field250 = new class85(16);

    @OriginalMember(owner = "client!db", name = "t", descriptor = "Lid;")
    public static class149 field254 = class60.method382("Nehmen", (byte) 48);

    @OriginalMember(owner = "client!db", name = "u", descriptor = "Lid;")
    public static class149 field255 = class60.method382("underlay", (byte) 92);

    @OriginalMember(owner = "client!db", name = "s", descriptor = "Lgk;")
    public static class157 field253 = new class157();

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public int field239;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public int field243;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    public int field245;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "Lmf;")
    public class10 field247;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "Z")
    public static boolean field256;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "[I")
    public int[] field235;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "[I")
    public int[] field237;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "[I")
    public int[] field238;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "[I")
    public int[] field244;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "[I")
    public int[] field246;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "[I")
    public int[] field248;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "[Lmf;")
    public class10[] field240;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "[[I")
    public int[][] field241;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "[[I")
    public int[][] field249;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static final void method99(int arg0) {
        if (class11.field161 != -1) {
            class276.method1907(4, class11.field161);
        }
        for (int var1 = 0; var1 < class259.field4538; var1++) {
            if (class94.field1664[var1]) {
                class216.field3819[var1] = true;
            }
            class16.field230[var1] = class94.field1664[var1];
            class94.field1664[var1] = false;
        }
        field251++;
        class177.field3236 = null;
        class268.field4815 = -1;
        class35.field516 = class118.field2022;
        class80.field1486 = -1;
        if (class11.field161 != -1) {
            class259.field4538 = 0;
            class83.method618(1);
        }
        class72.method455();
        if (arg0 >= -30) {
            field250 = null;
        }
        class149.field2683 = 0;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)Lgd;")
    public static final class74 method100(int arg0) {
        field242++;
        class74 var1 = new class74(34);
        var1.method494((byte) 4, 11);
        var1.method494((byte) 4, class140.field2573);
        var1.method494((byte) 4, class8.field99 ? 1 : 0);
        var1.method494((byte) 4, class80.field1489 ? 1 : 0);
        var1.method494((byte) 4, class211.field3761 ? 1 : 0);
        var1.method494((byte) 4, class83.field1512 ? 1 : 0);
        var1.method494((byte) 4, class283.field5003 ? 1 : 0);
        var1.method494((byte) 4, class86.field1573 ? 1 : 0);
        var1.method494((byte) 4, class211.field3762 ? 1 : 0);
        var1.method494((byte) 4, class116.field1989 ? 1 : 0);
        var1.method494((byte) 4, class281.field4997);
        if (arg0 != -6) {
            field256 = true;
        }
        var1.method494((byte) 4, class111.field1921 ? 1 : 0);
        var1.method494((byte) 4, class278.field4958 ? 1 : 0);
        var1.method494((byte) 4, class38.field571 ? 1 : 0);
        var1.method494((byte) 4, class136.field2496);
        var1.method494((byte) 4, class126.field2209 ? 1 : 0);
        var1.method494((byte) 4, class57.field1005);
        var1.method494((byte) 4, class44.field667);
        var1.method494((byte) 4, class133.field2432);
        var1.method518(16711680, class257.field4489);
        var1.method518(arg0 ^ 0xFF00FFFA, class214.field3792);
        var1.method494((byte) 4, class88.method652());
        var1.method517(class165.field3073, 127);
        var1.method494((byte) 4, class169.field3137);
        var1.method494((byte) 4, class15.field219 ? 1 : 0);
        var1.method494((byte) 4, class228.field3987 ? 1 : 0);
        var1.method494((byte) 4, class99.field1758);
        var1.method494((byte) 4, class211.field3755 ? 1 : 0);
        var1.method494((byte) 4, class26.field398 ? 1 : 0);
        return var1;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([BI)V")
    private final void method101(byte[] arg0, int arg1) {
        field252++;
        class74 var3 = new class74(class23.method133(arg0, false));
        int var4 = var3.method489((byte) -67);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field245 = 0;
        } else {
            this.field245 = var3.method498((byte) 125);
        }
        int var5 = var3.method489((byte) 111);
        int var6 = 0;
        this.field243 = var3.method485(-2386);
        this.field238 = new int[this.field243];
        int var7 = arg1;
        for (int var8 = 0; var8 < this.field243; var8++) {
            this.field238[var8] = var6 += var3.method485(-2386);
            if (this.field238[var8] > var7) {
                var7 = this.field238[var8];
            }
        }
        this.field239 = var7 + 1;
        this.field246 = new int[this.field239];
        this.field244 = new int[this.field239];
        this.field241 = new int[this.field239][];
        this.field248 = new int[this.field239];
        this.field235 = new int[this.field239];
        if (var5 != 0) {
            this.field237 = new int[this.field239];
            for (int var9 = 0; var9 < this.field239; var9++) {
                this.field237[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field243; var10++) {
                this.field237[this.field238[var10]] = var3.method498((byte) 127);
            }
            this.field247 = new class10(this.field237);
        }
        for (int var11 = 0; var11 < this.field243; var11++) {
            this.field248[this.field238[var11]] = var3.method498((byte) 127);
        }
        for (int var12 = 0; var12 < this.field243; var12++) {
            this.field235[this.field238[var12]] = var3.method498((byte) 126);
        }
        for (int var13 = 0; var13 < this.field243; var13++) {
            this.field246[this.field238[var13]] = var3.method485(-2386);
        }
        for (int var14 = 0; var14 < this.field243; var14++) {
            int var21 = this.field238[var14];
            int var22 = 0;
            int var23 = -1;
            int var24 = this.field246[var21];
            this.field241[var21] = new int[var24];
            for (int var25 = 0; var25 < var24; var25++) {
                int var26 = this.field241[var21][var25] = var22 += var3.method485(arg1 - 2385);
                if (var26 > var23) {
                    var23 = var26;
                }
            }
            this.field244[var21] = var23 + 1;
            if ((var23 + 1) == var24) {
                this.field241[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field240 = new class10[var7 + 1];
        this.field249 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field243; var15++) {
            int var16 = this.field238[var15];
            int var17 = this.field246[var16];
            this.field249[var16] = new int[this.field244[var16]];
            for (int var18 = 0; var18 < this.field244[var16]; var18++) {
                this.field249[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field241[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field241[var16][var19];
                }
                this.field249[var16][var20] = var3.method498((byte) 127);
            }
            this.field240[var16] = new class10(this.field249[var16]);
        }
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
    public static void method102(int arg0) {
        field254 = null;
        if (arg0 < 73) {
            field254 = null;
        }
        field255 = null;
        field253 = null;
        field250 = null;
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "([BI)V")
    public class17(byte[] arg0, int arg1) {
        this.field236 = class126.method882(0, arg0, arg0.length);
        if (this.field236 != arg1) {
            throw new RuntimeException();
        }
        this.method101(arg0, -1);
    }
}
