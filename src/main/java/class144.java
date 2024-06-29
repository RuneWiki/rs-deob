import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class144 extends class124 {

    @OriginalMember(owner = "client!ue", name = "Q", descriptor = "Lr;")
    private static class118 field3233 = class153.method1136(83, "Prepared sound engine");

    @OriginalMember(owner = "client!ue", name = "O", descriptor = "Lr;")
    public static class118 field3231 = class153.method1136(117, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!ue", name = "ab", descriptor = "I")
    public static int field3243 = -2;

    @OriginalMember(owner = "client!ue", name = "N", descriptor = "Lr;")
    public static class118 field3230 = field3233;

    @OriginalMember(owner = "client!ue", name = "cb", descriptor = "I")
    public static int field3245 = 0;

    @OriginalMember(owner = "client!ue", name = "U", descriptor = "Lr;")
    public static class118 field3237 = class153.method1136(86, "::fpsoff");

    @OriginalMember(owner = "client!ue", name = "hb", descriptor = "[Lr;")
    public static class118[] field3250 = new class118[500];

    @OriginalMember(owner = "client!ue", name = "jb", descriptor = "Lr;")
    public static class118 field3252 = class153.method1136(112, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!ue", name = "P", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!ue", name = "R", descriptor = "I")
    public int field3234;

    @OriginalMember(owner = "client!ue", name = "S", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!ue", name = "T", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!ue", name = "X", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!ue", name = "bb", descriptor = "I")
    public int field3244;

    @OriginalMember(owner = "client!ue", name = "db", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!ue", name = "eb", descriptor = "I")
    public int field3247;

    @OriginalMember(owner = "client!ue", name = "ib", descriptor = "I")
    public int field3251;

    @OriginalMember(owner = "client!ue", name = "fb", descriptor = "Lr;")
    public class118 field3248;

    @OriginalMember(owner = "client!ue", name = "V", descriptor = "Lvf;")
    public static class152 field3238;

    @OriginalMember(owner = "client!ue", name = "W", descriptor = "[I")
    public int[] field3239;

    @OriginalMember(owner = "client!ue", name = "Z", descriptor = "[I")
    public int[] field3242;

    @OriginalMember(owner = "client!ue", name = "gb", descriptor = "[Lr;")
    public class118[] field3249;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILff;Lff;)V")
    public static final void method1064(int arg0, class42 arg1, class42 arg2) {
        field3240++;
        int var3 = 44 / ((-arg0 - 51) / 54);
        class64.field1454 = arg1;
        class136.field3069 = arg2;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
    public static final void method1065(int arg0) {
        if (arg0 > -105) {
            return;
        }
        field3235++;
        if (class130.field2964[96]) {
            class126.field2887 += (-class126.field2887 - 24) / 2;
        } else if (class130.field2964[97]) {
            class126.field2887 += (24 - class126.field2887) / 2;
        } else {
            class126.field2887 /= 2;
        }
        class103.field2375 = class126.field2887 / 2 + class103.field2375 & 0x7FF;
        int var1 = class141.field3196 + class89.field2150.field712;
        int var2 = class89.field2150.field760 + class10.field217;
        if (class130.field2964[98]) {
            class63.field1448 += (12 - class63.field1448) / 2;
        } else if (class130.field2964[99]) {
            class63.field1448 += (-class63.field1448 - 12) / 2;
        } else {
            class63.field1448 /= 2;
        }
        class64.field1472 += class63.field1448 / 2;
        if (class158.field3645 - var2 < -500 || class158.field3645 - var2 > 500 || class115.field2675 - var1 < -500 || class115.field2675 - var1 > 500) {
            class115.field2675 = var1;
            class158.field3645 = var2;
        }
        if (class64.field1472 < 128) {
            class64.field1472 = 128;
        }
        if (class64.field1472 > 383) {
            class64.field1472 = 383;
        }
        if (class158.field3645 != var2) {
            class158.field3645 += (var2 - class158.field3645) / 16;
        }
        int var3 = class158.field3645 >> 7;
        if (class115.field2675 != var1) {
            class115.field2675 += (var1 - class115.field2675) / 16;
        }
        int var4 = 0;
        int var5 = class115.field2675 >> 7;
        int var6 = class46.method386(-15186, class106.field2468, class158.field3645, class115.field2675);
        if (var3 > 3 && var5 > 3 && var3 < 100 && var5 < 100) {
            for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                for (int var8 = var5 - 4; var8 <= var5 + 4; var8++) {
                    int var9 = class106.field2468;
                    if (var9 < 3 && (class33.field830[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var6 - class72.field1668[var9][var7][var8];
                    if (var10 > var4) {
                        var4 = var10;
                    }
                }
            }
        }
        int var11 = var4 * 192;
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (var11 > class67.field1561) {
            class67.field1561 += (var11 - class67.field1561) / 24;
        } else if (var11 < class67.field1561) {
            class67.field1561 += (var11 - class67.field1561) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Z[Lr;)Lr;")
    public static final class118 method1066(boolean arg0, class118[] arg1) {
        field3241++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        if (!arg0) {
            field3233 = null;
        }
        return class95.method748(55, 0, arg1.length, arg1);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lmd;IZ)V")
    public static final void method1067(class87 arg0, int arg1, boolean arg2) {
        field3236++;
        int var3 = arg0.field2114;
        int var4 = (int) arg0.field2295;
        if (arg1 != 29975) {
            return;
        }
        arg0.method768(-1);
        if (arg2) {
            class92.method739(var3, -1);
        }
        class48.method401(false, var3);
        class74 var5 = class99.method770(-4894, var4);
        if (var5 != null) {
            class26.method232((byte) 95, var5);
        }
        class138.field3144 = false;
        class39.field950 = 0;
        class121.method947(class138.field3157, class151.field3418, 101, class71.field1651, class89.field2141);
        if (class48.field1167 != -1) {
            class113.method882((byte) -117, 1, class48.field1167);
        }
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(B)V")
    public static void method1068(byte arg0) {
        if (arg0 >= -94) {
            method1067(null, -32, true);
        }
        field3237 = null;
        field3252 = null;
        field3230 = null;
        field3233 = null;
        field3238 = null;
        field3250 = null;
        field3231 = null;
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)V")
    public static final void method1069(int arg0) {
        field3232++;
        for (class10 var1 = (class10) class132.field3011.method889(125); var1 != null; var1 = (class10) class132.field3011.method884(true)) {
            if (var1.field221 != null) {
                var1.method80(arg0 ^ 0xFFFFFFFC);
            }
        }
        if (arg0 != -4) {
            method1065(89);
        }
    }
}
