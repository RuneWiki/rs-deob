import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class10 extends class286 {

    @OriginalMember(owner = "client!em", name = "O", descriptor = "I")
    private int field85 = 4096;

    @OriginalMember(owner = "client!em", name = "R", descriptor = "I")
    private int field88 = 4096;

    @OriginalMember(owner = "client!em", name = "cb", descriptor = "I")
    private int field99 = 4096;

    @OriginalMember(owner = "client!em", name = "T", descriptor = "I")
    public static int field90 = 1;

    @OriginalMember(owner = "client!em", name = "bb", descriptor = "Lbe;")
    public static class283 field98 = class153.method941(-48, "(U3");

    @OriginalMember(owner = "client!em", name = "N", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!em", name = "Q", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!em", name = "U", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!em", name = "V", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!em", name = "X", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!em", name = "Y", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!em", name = "Z", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!em", name = "ab", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!em", name = "P", descriptor = "Lek;")
    public static class172 field86;

    @OriginalMember(owner = "client!em", name = "W", descriptor = "Lek;")
    public static class172 field93;

    @OriginalMember(owner = "client!em", name = "S", descriptor = "[I")
    public static int[] field89;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(B)V", line = 4)
    public static void method54(byte arg0) {
        field89 = null;
        if (arg0 != 15) {
            field98 = (class283) null;
        }
        field86 = null;
        field93 = null;
        field98 = null;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V", line = 21)
    public class10() {
        super(1, false);
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(IIII)Lvk;", line = 32)
    public static final class159 method55(int arg0, int arg1, int arg2, int arg3) {
        class159 var4 = new class159();
        var4.field2602 = arg3;
        var4.field2600 = arg2;
        class58.field805.method1611(var4, -1, (long) arg0);
        field94++;
        class221.method1452(false, arg2);
        class69 var5 = class65.method418(-8429, arg0);
        if (var5 != null) {
            class272.method1834(var5, 0);
        }
        if (class69.field1034 != null) {
            class272.method1834(class69.field1034, arg1 - 15);
            class69.field1034 = null;
        }
        int var6 = class42.field589;
        if (arg1 != 15) {
            return (class159) null;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            if (class174.method1150(class110.field1868[var7], -86)) {
                class5.method27(var7, (byte) -10);
            }
        }
        if (class42.field589 == 1) {
            class306.field5253 = false;
            class277.method1849(class47.field653, 1, class2.field14, class87.field1472, class31.field473);
        } else {
            class277.method1849(class47.field653, 1, class2.field14, class87.field1472, class31.field473);
            int var8 = class240.field4056.method1656(class301.field5076);
            for (int var9 = 0; var9 < class42.field589; var9++) {
                int var10 = class240.field4056.method1656(class183.method1207(var9, (byte) -115));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class47.field653 = var8 + 8;
            class31.field473 = class42.field589 * 15 + 22;
        }
        if (var5 != null) {
            class245.method1668(false, var5, 0);
        }
        class24.method172(arg2, 0);
        if (class82.field1397 != -1) {
            class99.method654(class82.field1397, 1, (byte) -126);
        }
        return var4;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lfe;ZI)V", line = 116)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            this.field88 = arg0.method1496(true);
        } else if (arg2 == 1) {
            this.field85 = arg0.method1496(!arg1);
        } else if (arg2 == 2) {
            this.field99 = arg0.method1496(true);
        }
        field97++;
        if (arg1) {
            method55(14, -26, 79, 69);
        }
    }

    @OriginalMember(owner = "client!em", name = "h", descriptor = "(I)V", line = 152)
    public static final void method56(int arg0) {
        if (class82.field1397 != -1) {
            class153.method943(arg0 + 26391, class82.field1397);
        }
        field92++;
        for (int var1 = 0; var1 < class217.field3686; var1++) {
            if (class201.field3434[var1]) {
                class69.field1147[var1] = true;
            }
            class219.field3699[var1] = class201.field3434[var1];
            class201.field3434[var1] = false;
        }
        class26.field397 = -1;
        class160.field2625 = class75.field1309;
        if (arg0 != 2) {
            return;
        }
        class57.field783 = true;
        class202.field3447 = -1;
        class62.field867 = null;
        if (class82.field1397 != -1) {
            class217.field3686 = 0;
            class217.method1430(0, true, class115.field1945, class48.field655, 0, 0, 0, class82.field1397, -1);
        }
        class311.method2107();
        class44.field606 = 0;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Lbe;Lfe;I)I", line = 198)
    public static final int method57(class283 arg0, class229 arg1, int arg2) {
        int var3 = arg1.field3905;
        arg1.method1546(-1, arg0.field4812);
        field91++;
        arg1.field3905 += class303.field5116.method220(arg0.field4812, arg1.field3879, arg0.field4843, arg1.field3905, (byte) 111, 0);
        if (arg2 < 45) {
            method56(57);
        }
        return arg1.field3905 - var3;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)[[I", line = 235)
    public final int[][] method16(int arg0, byte arg1) {
        field95++;
        int[][] var3 = this.field4878.method938((byte) -6, arg0);
        if (this.field4878.field2524) {
            int[][] var4 = this.method1964(arg0, 0, false);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class27.field410; var11++) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var8[var11] = this.field88 * var12 >> 12;
                    var9[var11] = this.field85 * var13 >> 12;
                    var10[var11] = this.field99 * var14 >> 12;
                } else {
                    var8[var11] = this.field88;
                    var9[var11] = this.field85;
                    var10[var11] = this.field99;
                }
            }
        }
        if (arg1 != -19) {
            method56(-45);
        }
        return var3;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(IIZ)Lrh;", line = 304)
    public static final class128 method58(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method56(-92);
        }
        field87++;
        for (class128 var3 = (class128) class184.field3163.method1812((byte) -115); var3 != null; var3 = (class128) class184.field3163.method1813((byte) 69)) {
            if (var3.field2121 && var3.method798((byte) 59, arg1, arg0)) {
                return var3;
            }
        }
        return null;
    }
}
