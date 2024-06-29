import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class19 {

    @OriginalMember(owner = "client!hm", name = "m", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "Lwa;")
    private static class75 field247 = class66.method560("Loading sprites )2 ", false);

    @OriginalMember(owner = "client!hm", name = "j", descriptor = "[I")
    public static int[] field253 = new int[] { 4, 4, 1, 2, 6, 4, 2, 50, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!hm", name = "s", descriptor = "Lwa;")
    public static class75 field262 = field247;

    @OriginalMember(owner = "client!hm", name = "u", descriptor = "[I")
    public static int[] field264 = new int[128];

    @OriginalMember(owner = "client!hm", name = "e", descriptor = "I")
    public int field248;

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!hm", name = "k", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!hm", name = "n", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!hm", name = "p", descriptor = "I")
    public int field259;

    @OriginalMember(owner = "client!hm", name = "v", descriptor = "I")
    public int field265;

    @OriginalMember(owner = "client!hm", name = "q", descriptor = "Llg;")
    public class115 field260;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "Lcb;")
    public static class267 field244;

    @OriginalMember(owner = "client!hm", name = "t", descriptor = "Lcb;")
    public static class267 field263;

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "[I")
    public int[] field245;

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "[I")
    public int[] field251;

    @OriginalMember(owner = "client!hm", name = "i", descriptor = "[I")
    public int[] field252;

    @OriginalMember(owner = "client!hm", name = "l", descriptor = "[I")
    public int[] field255;

    @OriginalMember(owner = "client!hm", name = "o", descriptor = "[I")
    public int[] field258;

    @OriginalMember(owner = "client!hm", name = "x", descriptor = "[I")
    public int[] field267;

    @OriginalMember(owner = "client!hm", name = "w", descriptor = "[Llg;")
    public class115[] field266;

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "[[I")
    public int[][] field246;

    @OriginalMember(owner = "client!hm", name = "r", descriptor = "[[I")
    public int[][] field261;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(BI)Lfi;", line = 4)
    public static final class247 method124(byte arg0, int arg1) {
        field254++;
        class247 var2 = (class247) class151.field2601.method1514(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class78.field1335.method1911(11, arg1, -65);
        if (arg0 >= -112) {
            field247 = (class75) null;
        }
        class247 var4 = new class247();
        if (var3 != null) {
            var4.method1782(new class60(var3), (byte) 106);
        }
        class151.field2601.method1509((long) arg1, var4, -1);
        return var4;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)V", line = 55)
    public static void method125(byte arg0) {
        field247 = null;
        field263 = null;
        field262 = null;
        int var1 = 13 % ((arg0 + 33) / 61);
        field253 = null;
        field264 = null;
        field244 = null;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "([BI)V", line = 85)
    private final void method126(byte[] arg0, int arg1) {
        field257++;
        class60 var3 = new class60(class87.method699(arg0, -127));
        int var4 = var3.method501(0);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field259 = var3.method505(255);
        } else {
            this.field259 = 0;
        }
        int var5 = var3.method501(0);
        int var6 = -1;
        this.field265 = var3.method485((byte) -2);
        this.field245 = new int[this.field265];
        int var7 = 0;
        if (arg1 > -64) {
            return;
        }
        for (int var8 = 0; var8 < this.field265; var8++) {
            this.field245[var8] = var7 += var3.method485((byte) -2);
            if (var6 < this.field245[var8]) {
                var6 = this.field245[var8];
            }
        }
        this.field248 = var6 + 1;
        this.field261 = new int[this.field248][];
        this.field258 = new int[this.field248];
        this.field251 = new int[this.field248];
        this.field252 = new int[this.field248];
        this.field267 = new int[this.field248];
        if (var5 != 0) {
            this.field255 = new int[this.field248];
            for (int var9 = 0; var9 < this.field248; var9++) {
                this.field255[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field265; var10++) {
                this.field255[this.field245[var10]] = var3.method505(255);
            }
            this.field260 = new class115(this.field255);
        }
        for (int var11 = 0; var11 < this.field265; var11++) {
            this.field267[this.field245[var11]] = var3.method505(255);
        }
        for (int var12 = 0; var12 < this.field265; var12++) {
            this.field252[this.field245[var12]] = var3.method505(255);
        }
        for (int var13 = 0; var13 < this.field265; var13++) {
            this.field258[this.field245[var13]] = var3.method485((byte) -2);
        }
        for (int var14 = 0; var14 < this.field265; var14++) {
            int var15 = 0;
            int var16 = this.field245[var14];
            int var17 = -1;
            int var18 = this.field258[var16];
            this.field261[var16] = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                int var20 = this.field261[var16][var19] = var15 += var3.method485((byte) -2);
                if (var17 < var20) {
                    var17 = var20;
                }
            }
            this.field251[var16] = var17 + 1;
            if (var17 + 1 == var18) {
                this.field261[var16] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field246 = new int[var6 + 1][];
        this.field266 = new class115[var6 + 1];
        for (int var21 = 0; var21 < this.field265; var21++) {
            int var22 = this.field245[var21];
            int var23 = this.field258[var22];
            this.field246[var22] = new int[this.field251[var22]];
            for (int var24 = 0; var24 < this.field251[var22]; var24++) {
                this.field246[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field261[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field261[var22][var25];
                }
                this.field246[var22][var26] = var3.method505(255);
            }
            this.field266[var22] = new class115(this.field246[var22]);
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V", line = 261)
    public static final void method127(int arg0) {
        field250++;
        if (class285.field4915 == 2) {
            if (class161.field2737 == class152.field2623 && class82.field1367 == class217.field3708) {
                class285.field4915 = 0;
                class279.method1991(class126.field2188 - 1, (byte) 126);
            }
        } else if (class39.field595 == class152.field2623 && class271.field4685 == class217.field3708) {
            class285.field4915 = 0;
            class279.method1991(class126.field2188 - 1, (byte) 117);
        } else {
            class161.field2737 = class39.field595;
            class82.field1367 = class271.field4685;
            class285.field4915 = 2;
        }
        if (arg0 != 11078) {
            field247 = (class75) null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "([BI)V", line = 318)
    public class19(byte[] arg0, int arg1) {
        this.field256 = class6.method35(-13828, arg0.length, arg0);
        if (this.field256 != arg1) {
            throw new RuntimeException();
        }
        this.method126(arg0, -128);
    }
}
