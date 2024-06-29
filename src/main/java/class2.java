import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class2 {

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public int field14;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "Lok;")
    public static class41 field17 = class137.method956("<col=ffff00>", 45);

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "Lak;")
    public static class20 field19 = new class20(5);

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "Lok;")
    public static class41 field34 = class137.method956("::fpson", 45);

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "B")
    public static byte field33;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public int field15;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public int field18;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public int field22;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "Leh;")
    public static class108 field28;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "Lli;")
    public class230 field20;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "[I")
    public int[] field21;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "[I")
    public int[] field23;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "[I")
    public int[] field24;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "[I")
    public int[] field25;

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "[I")
    public int[] field29;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "[I")
    public int[] field35;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "[Ltb;")
    public static class199[] field16;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "[Lli;")
    public class230[] field26;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "[[I")
    public int[][] field13;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "[[I")
    public int[][] field31;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 20)
    public static final void method6(int arg0) {
        class28.field418.method131(~arg0);
        if (arg0 != 1) {
            field19 = (class20) null;
        }
        field27++;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V", line = 34)
    public static void method7(int arg0) {
        field16 = null;
        field28 = null;
        if (arg0 > 45) {
            field19 = null;
            field17 = null;
            field34 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "([BI)V", line = 55)
    private final void method8(byte[] arg0, int arg1) {
        field30++;
        class112 var3 = new class112(class271.method1918(258, arg0));
        int var4 = var3.method792(2);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        int var5 = 0;
        if (var4 >= 6) {
            this.field18 = var3.method779(-27100);
        } else {
            this.field18 = 0;
        }
        int var6 = var3.method792(2);
        this.field22 = var3.method759((byte) -89);
        int var7 = -1;
        this.field25 = new int[this.field22];
        if (arg1 > -13) {
            return;
        }
        for (int var8 = 0; var8 < this.field22; var8++) {
            this.field25[var8] = var5 += var3.method759((byte) -124);
            if (var7 < this.field25[var8]) {
                var7 = this.field25[var8];
            }
        }
        this.field15 = var7 + 1;
        this.field29 = new int[this.field15];
        this.field31 = new int[this.field15][];
        this.field24 = new int[this.field15];
        this.field23 = new int[this.field15];
        this.field35 = new int[this.field15];
        if (var6 != 0) {
            this.field21 = new int[this.field15];
            for (int var9 = 0; var9 < this.field15; var9++) {
                this.field21[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field22; var10++) {
                this.field21[this.field25[var10]] = var3.method779(-27100);
            }
            this.field20 = new class230(this.field21);
        }
        for (int var11 = 0; var11 < this.field22; var11++) {
            this.field29[this.field25[var11]] = var3.method779(-27100);
        }
        for (int var12 = 0; var12 < this.field22; var12++) {
            this.field35[this.field25[var12]] = var3.method779(-27100);
        }
        for (int var13 = 0; var13 < this.field22; var13++) {
            this.field23[this.field25[var13]] = var3.method759((byte) -30);
        }
        for (int var14 = 0; var14 < this.field22; var14++) {
            int var15 = 0;
            int var16 = this.field25[var14];
            int var17 = this.field23[var16];
            int var18 = -1;
            this.field31[var16] = new int[var17];
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field31[var16][var19] = var15 += var3.method759((byte) -33);
                if (var20 > var18) {
                    var18 = var20;
                }
            }
            this.field24[var16] = var18 + 1;
            if ((var18 + 1) == var17) {
                this.field31[var16] = null;
            }
        }
        if (var6 == 0) {
            return;
        }
        this.field13 = new int[var7 + 1][];
        this.field26 = new class230[var7 + 1];
        for (int var21 = 0; var21 < this.field22; var21++) {
            int var22 = this.field25[var21];
            int var23 = this.field23[var22];
            this.field13[var22] = new int[this.field24[var22]];
            for (int var24 = 0; var24 < this.field24[var22]; var24++) {
                this.field13[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field31[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field31[var22][var25];
                }
                this.field13[var22][var26] = var3.method779(-27100);
            }
            this.field26[var22] = new class230(this.field13[var22]);
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "([BI)V", line = 253)
    public class2(byte[] arg0, int arg1) {
        this.field14 = class297.method2049(arg0, arg0.length, 0);
        if (this.field14 != arg1) {
            throw new RuntimeException();
        }
        this.method8(arg0, -123);
    }
}
