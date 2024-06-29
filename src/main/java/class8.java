import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class8 {

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public int field178 = 0;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "I")
    public int field186 = 0;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "Lv;")
    public static class122 field196 = class55.method425(-56, "::");

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "[Lv;")
    public static class122[] field194 = new class122[100];

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "Lv;")
    private static class122 field193 = class55.method425(-92, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public static int field184 = 0;

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "[Lv;")
    public static class122[] field195 = new class122[100];

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "[I")
    public static int[] field198 = new int[25];

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "Lv;")
    public static class122 field192 = field193;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "Lv;")
    public static class122 field205 = class55.method425(-122, "Duell akzeptieren");

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
    public static int field206 = 0;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public int field181;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public int field185;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public int field190;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public int field191;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "Lab;")
    public static class3 field199;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "Lk;")
    public class60 field183;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "Lk;")
    public class60 field203;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "Lkb;")
    public static class62 field188;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "Lmb;")
    public static class74 field182;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lbd;IB)V", line = 15)
    public static final void method83(class11 arg0, int arg1, byte arg2) {
        field200++;
        class10.method92(128, arg1, arg0.field349, arg0.field343);
        if (arg2 >= -21) {
            field194 = null;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILad;)V", line = 32)
    public static final void method84(int arg0, class5 arg1) {
        field204++;
        int var2 = 0;
        int var3 = 0;
        int var4 = -1;
        if (arg1.field139 == 0) {
            var2 = class90.field2306.method47(arg1.field136, arg1.field118, arg1.field137);
        }
        if (arg1.field139 == 1) {
            var2 = class90.field2306.method42(arg1.field136, arg1.field118, arg1.field137);
        }
        if (arg0 < 57) {
            field180 = 18;
        }
        int var5 = 0;
        if (arg1.field139 == 2) {
            var2 = class90.field2306.method26(arg1.field136, arg1.field118, arg1.field137);
        }
        if (arg1.field139 == 3) {
            var2 = class90.field2306.method3(arg1.field136, arg1.field118, arg1.field137);
        }
        if (var2 != 0) {
            var4 = var2 >> 14 & 0x7FFF;
            int var6 = class90.field2306.method22(arg1.field136, arg1.field118, arg1.field137, var2);
            var5 = var6 >> 6 & 0x3;
            var3 = var6 & 0x1F;
        }
        arg1.field122 = var3;
        arg1.field123 = var5;
        arg1.field131 = var4;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)Lab;", line = 76)
    public static final class3 method85(int arg0) {
        field202++;
        class3 var1 = new class3();
        var1.field97 = class49.field1251;
        var1.field94 = client.field455;
        var1.field100 = class118.field2847[0];
        var1.field95 = class45.field1169[0];
        var1.field99 = class89.field2271[arg0];
        var1.field93 = class60.field1542[0];
        var1.field96 = class82.field2142;
        var1.field98 = class118.field2838[0];
        class61.method469(63);
        return var1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIIIIII)V", line = 106)
    public static final void method86(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field197++;
        int var7 = 2048 - arg4 & 0x7FF;
        int var8 = 2048 - arg5 & 0x7FF;
        int var9 = 118 / ((arg0 + 7) / 35);
        int var10 = 0;
        int var11 = 0;
        int var12 = arg6;
        if (var7 != 0) {
            int var13 = class68.field1792[var7];
            int var14 = class68.field1800[var7];
            int var15 = var11 * var14 - arg6 * var13 >> 16;
            var12 = var11 * var13 + arg6 * var14 >> 16;
            var11 = var15;
        }
        if (var8 != 0) {
            int var16 = class68.field1792[var8];
            int var17 = class68.field1800[var8];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        class81.field2114 = arg5;
        class115.field2815 = arg4;
        class5.field135 = arg3 - var12;
        class115.field2809 = arg2 - var10;
        class29.field743 = arg1 - var11;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lfe;Z)Z", line = 158)
    public static final boolean method87(class36 arg0, boolean arg1) {
        field189++;
        if (!arg1) {
            return true;
        }
        int var2 = arg0.field932;
        if (class40.field1012 == 2) {
            if (var2 == 201) {
                class88.field2263 = 1;
                class51.field1294 = class51.field1287;
                class103.field2558 = true;
                class51.field1319 = class66.field1685;
                class51.field1318 = true;
                class83.field2166 = 0;
            }
            if (var2 == 202) {
                class83.field2166 = 0;
                class51.field1294 = class51.field1287;
                class88.field2263 = 2;
                class51.field1318 = true;
                class51.field1319 = class41.field1054;
                class103.field2558 = true;
            }
        }
        if (var2 == 205) {
            class74.field1938 = 250;
            return true;
        }
        if (var2 == 501) {
            class88.field2263 = 4;
            class51.field1319 = class91.field2326;
            class103.field2558 = true;
            class51.field1294 = class51.field1287;
            class83.field2166 = 0;
            class51.field1318 = true;
        }
        if (var2 == 502) {
            class88.field2263 = 5;
            class51.field1294 = class51.field1287;
            class51.field1319 = class91.field2338;
            class51.field1318 = true;
            class103.field2558 = true;
            class83.field2166 = 0;
        }
        if (var2 >= 300 && var2 <= 313) {
            int var3 = (var2 - 300) / 2;
            int var4 = var2 & 0x1;
            class56.field1461.method729(var3, var4 == 1, 103);
        }
        if (var2 >= 314 && var2 <= 323) {
            int var5 = var2 & 0x1;
            int var6 = (var2 - 314) / 2;
            class56.field1461.method726(0, var6, var5 == 1);
        }
        if (var2 == 324) {
            class56.field1461.method728(false, 19755);
        }
        if (var2 == 325) {
            class56.field1461.method728(true, 19755);
        }
        if (var2 == 326) {
            class74.field1935.method996((byte) 104, 62);
            class44.field1154++;
            class56.field1461.method727(class74.field1935, -110);
            return true;
        }
        if (var2 == 620) {
            class61.field1566 = !class61.field1566;
        }
        if (var2 >= 601 && var2 <= 613) {
            class129.method1013(-29565);
            if (class51.field1288.method946(70) > 0) {
                class74.field1935.method996((byte) 113, 150);
                class45.field1168++;
                class74.field1935.method480(class51.field1288.method959(-1), 299629920);
                class74.field1935.method523(255, var2 - 601);
                class74.field1935.method523(255, class61.field1566 ? 1 : 0);
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V", line = 292)
    public static final void method88(byte arg0) {
        field207++;
        class37.field977.method473((byte) -4);
        class44.field1157.method63(0, 0);
        class74.field2000 = class77.method647(class74.field2000);
        if (arg0 <= 17) {
            field180 = 82;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V", line = 310)
    public static void method89(int arg0) {
        field188 = null;
        if (arg0 < 50) {
            field180 = 25;
        }
        field199 = null;
        field192 = null;
        field182 = null;
        field193 = null;
        field205 = null;
        field195 = null;
        field194 = null;
        field196 = null;
        field198 = null;
    }
}
