import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class23 extends class425 {

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public int field281;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public int field287;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "[I")
    public int[] field288;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "[I")
    public int[] field286;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "[Z")
    public boolean[] field284;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "[[I")
    public int[][] field282;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "Lkn;")
    public static class442 field292;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "[I")
    public static int[] field293;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "[Lvd;")
    public static class26[] field295;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "I")
    public static int field294;

    static {
        new class349("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
        field292 = new class442();
        field293 = new int[50];
        field295 = new class26[16];
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)V", line = 6)
    public static final void method122(int arg0, int arg1, int arg2) {
        field285++;
        if (class103.method609(arg2, 1)) {
            if (arg1 != -27431) {
                method124(80);
            }
            class396.method2489(522, arg0, class186.field2657[arg2]);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 24)
    public static final void method123(int arg0) {
        field294++;
        if (class119.field1615 == null) {
            return;
        }
        if (arg0 != -20339) {
            method124(-128);
        }
        while (true) {
            while (class409.field5870 < class241.field3561.length) {
                class158 var1 = class241.field3561[class409.field5870];
                if (var1 != null && var1.field2309 == -1) {
                    if (class440.field6296 == null) {
                        class440.field6296 = class119.field1615.method1848(var1.field2303, (byte) 35);
                    }
                    int var2 = class440.field6296.field3182;
                    if (var2 == -1) {
                        return;
                    }
                    class440.field6296 = null;
                    class409.field5870++;
                    var1.field2309 = var2;
                } else {
                    class409.field5870++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V", line = 68)
    public static void method124(int arg0) {
        field295 = null;
        field292 = null;
        field293 = null;
        if (arg0 != 16) {
            method127(-32, 27, (byte) 55);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Lca;", line = 82)
    public static final class166 method125(int arg0, int arg1) {
        field283++;
        class166 var2 = (class166) class405.field5681.method99(true, (long) arg0);
        if (arg1 > -81) {
            field292 = null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class58.field781.method643(33, arg0, true);
        class166 var4 = new class166();
        if (var3 != null) {
            var4.method1197((byte) -57, arg0, new class130(var3));
        }
        class405.field5681.method90(var4, (long) arg0, 0);
        return var4;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)Lri;", line = 108)
    public static final class59 method126(int arg0, int arg1) {
        field290++;
        class59 var2 = (class59) class340.field4919.method1972((long) arg1, 0);
        if (arg0 != 32767) {
            field292 = null;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class142.field2151.method643(1, arg1 & 0x7FFF, true);
        } else {
            var3 = class63.field839.method643(1, arg1, true);
        }
        class59 var4 = new class59();
        if (var3 != null) {
            var4.method385(new class130(var3), -1021);
        }
        if (arg1 >= 32768) {
            var4.method386(123);
        }
        class340.field4919.method1975(var4, (long) arg1, false);
        return var4;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(I[B)V", line = 141)
    public class23(int arg0, byte[] arg1) {
        this.field281 = arg0;
        class130 var3 = new class130(arg1);
        this.field287 = var3.method837(true);
        this.field288 = new int[this.field287];
        this.field286 = new int[this.field287];
        this.field284 = new boolean[this.field287];
        this.field282 = new int[this.field287][];
        for (int var4 = 0; var4 < this.field287; var4++) {
            this.field288[var4] = var3.method837(true);
        }
        for (int var5 = 0; var5 < this.field287; var5++) {
            this.field284[var5] = var3.method837(true) == 1;
        }
        for (int var6 = 0; var6 < this.field287; var6++) {
            this.field286[var6] = var3.method798(false);
        }
        for (int var7 = 0; var7 < this.field287; var7++) {
            this.field282[var7] = new int[var3.method837(true)];
        }
        for (int var8 = 0; var8 < this.field287; var8++) {
            for (int var9 = 0; var9 < this.field282[var8].length; var9++) {
                this.field282[var8][var9] = var3.method837(true);
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIB)I", line = 202)
    public static final int method127(int arg0, int arg1, byte arg2) {
        field289++;
        int var3 = arg1 >>> 24;
        int var4 = ((arg1 & 0xFF00) * var3 & 0xFF0000 | (arg1 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
        int var5 = 255 - var3;
        if (arg2 != 83) {
            method124(-113);
        }
        return (((arg0 & 0xFF00) * var5 & 0xFF0000 | (arg0 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var4;
    }
}
