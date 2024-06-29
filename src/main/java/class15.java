import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class15 {

    @OriginalMember(owner = "client!c", name = "f", descriptor = "[I")
    private int[] field210;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "I")
    public static int field205 = 0;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static volatile int field208 = 0;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "Lqf;")
    public static class117 field216 = class72.method514(105, "chatback");

    @OriginalMember(owner = "client!c", name = "m", descriptor = "[I")
    public static int[] field217 = new int[32];

    @OriginalMember(owner = "client!c", name = "j", descriptor = "[I")
    public static int[] field214 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!c", name = "p", descriptor = "Lqf;")
    public static class117 field220 = class72.method514(103, "(Z");

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field221 = 0;

    @OriginalMember(owner = "client!c", name = "o", descriptor = "Lqf;")
    public static class117 field219 = class72.method514(108, "sl_flags");

    @OriginalMember(owner = "client!c", name = "n", descriptor = "Lqf;")
    public static class117 field218 = class72.method514(116, "Ihr Spielkonto wird bereits benutzt)3");

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "Lca;")
    public static class16 field215;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BI)I")
    public final int method128(byte arg0, int arg1) {
        int var3 = this.field210.length - 2;
        if (arg0 != 20) {
            method133(-125);
        }
        field212++;
        int var4 = arg1 << 1 & var3;
        while (true) {
            int var5 = this.field210[var4];
            if (arg1 == var5) {
                return this.field210[var4 + 1];
            }
            if (var5 == -1) {
                return -1;
            }
            var4 = var3 & var4 + 2;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIII)V")
    public static final void method129(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field209++;
        class78 var5 = (class78) client.field395.method1221(109, (long) arg2);
        if (arg0 != 0) {
            return;
        }
        if (var5 == null) {
            var5 = new class78();
            client.field395.method1219(var5, (byte) 38, (long) arg2);
        }
        if (var5.field1762.length <= arg1) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field1762.length; var8++) {
                var6[var8] = var5.field1762[var8];
                var7[var8] = var5.field1757[var8];
            }
            for (int var9 = var5.field1762.length; var9 < arg1; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1757 = var7;
            var5.field1762 = var6;
        }
        var5.field1762[arg1] = arg3;
        var5.field1757[arg1] = arg4;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static final void method130(int arg0) {
        if (arg0 != 29247) {
            return;
        }
        field213++;
        if (class120.field2876 == -1) {
            return;
        }
        class89 var1 = class82.method643(class120.field2876, (byte) 119, class29.field589);
        if (var1 == null) {
            class120.field2876 = -1;
            class29.field589 = -1;
            return;
        }
        class89 var2 = class104.method799(var1, arg0 - 29138);
        if (var2 == null) {
            class120.field2876 = -1;
            class29.field589 = -1;
            return;
        }
        class101.field2447++;
        int var3 = class18.field274;
        int var4 = class143.field3504;
        if (class35.field740 == 0) {
            var4 -= 4;
            var3 -= 4;
        }
        if (class35.field740 == 1) {
            var4 -= 553;
            var3 -= 205;
        }
        if (class35.field740 == 2) {
            var4 -= 17;
            var3 -= 357;
        }
        int var5 = var3 - class66.field1385;
        int var6 = var4 - class67.field1400;
        int[] var7 = class80.method629(true, var2);
        class89 var8 = class141.field3426[var1.field2125 >> 16][var1.field2154 & 0xFFFF];
        if (var7[1] > var5) {
            var5 = var7[1];
        }
        if (var6 < var7[0]) {
            var6 = var7[0];
        }
        if (var7[1] + var2.field2095 < var1.field2095 + var5) {
            var5 = var7[1] + var2.field2095 - var1.field2095;
        }
        if (var1.field2152 + var6 > var7[0] + var2.field2152) {
            var6 = var2.field2152 + var7[0] - var1.field2152;
        }
        int var9 = var6 + var2.field2103 - var7[0];
        int var10 = var2.field2043 + var5 - var7[1];
        int[] var11 = class80.method629(true, var8);
        int var12 = var6 + var8.field2103 - var11[0];
        int var13 = var5 + var8.field2043 - var11[1];
        int var14 = var13 - var1.field2046;
        int var15 = var12 - var1.field2133;
        int var10000;
        if (var1.field2081 >= var15 && -var1.field2081 <= var15 && var14 <= var1.field2081 && var14 >= -var1.field2081 && !class27.field540) {
            var10 -= var14;
            var10000 = var12 - var15;
            var9 -= var15;
            var10000 = var13 - var14;
            boolean var18 = false;
            boolean var19 = false;
        } else if (var1.field2137 < class101.field2447 || class27.field540) {
            class27.field540 = true;
        } else {
            var9 -= var15;
            var10000 = var12 - var15;
            int var25 = var13 - var14;
            var10 -= var14;
            boolean var22 = false;
            boolean var23 = false;
        }
        if (var1.field2052 != null && class27.field540) {
            class18.method145(var1.field2052, var1, var10, var9, null, 18859, 0);
        }
        if (class152.field3752 != 0) {
            return;
        }
        if (class27.field540) {
            class89 var24 = class135.method1042(var9 + class67.field1400 - var2.field2103, var1, var10 + class66.field1385 - var2.field2043, (byte) -2, var2);
            if (var1.field2086 != null) {
                class18.method145(var1.field2086, var1, var10, var9, var24, arg0 - 10388, 0);
            }
            if (var24 != null && class5.method23(var1, 25157) != null) {
                class107.field2558++;
                class99.field2373.method961(160, -1198);
                class99.field2373.method604(-119, var24.field2122);
                class99.field2373.method556(var1.field2122, true);
                class99.field2373.method585(29037224, var1.field2125);
                class99.field2373.method585(29037224, var24.field2125);
            }
        } else if ((class45.field889 == 1 || class107.method810(class27.field531 - 1, 123)) && class27.field531 > 2) {
            class90.method716(2);
        } else if (class27.field531 > 0) {
            class90.method717((byte) -78, class27.field531 - 1);
        }
        class29.field589 = -1;
        class120.field2876 = -1;
        return;
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static void method131(int arg0) {
        field218 = null;
        field219 = null;
        field217 = null;
        field216 = null;
        field220 = null;
        if (arg0 != -17873) {
            method131(-31);
        }
        field214 = null;
        field215 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lr;I)V")
    public static final void method132(class118 arg0, int arg1) {
        field211++;
        short var2 = 256;
        for (int var3 = 0; var3 < class71.field1503.length; var3++) {
            class71.field1503[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var2);
            class71.field1503[var16] = (int) (Math.random() * 256.0D);
        }
        if (arg1 != -1) {
            field220 = null;
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class134.field3159[var15] = (class71.field1503[var15 - 128] + class71.field1503[var15 + 1] + class71.field1503[var15 - 1] + class71.field1503[var15 + 128]) / 4;
                }
            }
            int[] var13 = class71.field1503;
            class71.field1503 = class134.field3159;
            class134.field3159 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field2832; var7++) {
            for (int var8 = 0; var8 < arg0.field2835; var8++) {
                if (arg0.field2833[var6++] != 0) {
                    int var9 = var8 + arg0.field2834 + 16;
                    int var10 = var7 + arg0.field2837 + 16;
                    int var11 = var9 + (var10 << 7);
                    class71.field1503[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "([I)V")
    public class15(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field210 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field210[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field210[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 - -1) {
            }
            this.field210[var5 + var5] = arg0[var4];
            this.field210[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
    public static final void method133(int arg0) {
        field207++;
        if (class125.field2957 != null) {
            class125.field2957.method738(1);
            class125.field2957 = null;
        }
        class91.method718(-128);
        class19.field311.method863();
        for (int var1 = 0; var1 < 4; var1++) {
            class107.field2550[var1].method1051(18580);
        }
        System.gc();
        class66.method474(-27742, 2);
        class65.field1359 = -1;
        class40.field796 = false;
        class70.method491(-95);
        if (arg0 <= 116) {
            method133(45);
        }
        class62.method430(10, (byte) -47);
    }
}
