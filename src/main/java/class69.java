import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class69 {

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "Ltl;")
    private static class59 field1056 = class85.method639("Loading )2 please wait)3", 9588);

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "Ltl;")
    public static class59 field1057 = class85.method639("Fallen lassen", 9588);

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "Ltl;")
    public static class59 field1059 = field1056;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field1061 = 0;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "I")
    public static int field1066 = 0;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field1065 = -1;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "Ltl;")
    public static class59 field1064 = class85.method639("rot:", 9588);

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "Lma;")
    public static class263 field1060;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "Lvj;")
    public static class95 field1062;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V", line = 6)
    public static void method566(byte arg0) {
        field1056 = null;
        field1062 = null;
        field1060 = null;
        field1057 = null;
        if (arg0 == 74) {
            field1059 = null;
            field1064 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([IIIIII)V", line = 44)
    public static final void method567(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class245 var6 = class120.field2010[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class133 var7 = var6.field4103;
        if (var7 != null) {
            int var8 = var7.field2204;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class79 var10 = var6.field4105;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1260;
        int var12 = var10.field1266;
        int var13 = var10.field1271;
        int var14 = var10.field1252;
        int[] var15 = class121.field2017[var11];
        int[] var16 = class138.field2278[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lme;I)V", line = 136)
    public static final void method568(class295 arg0, int arg1) {
        class43.field643 = class216.method1502(-122, class6.field60, 0, arg0);
        field1063++;
        class12.field163 = new class5[class43.field643.length];
        class159.field2593 = new class5[class43.field643.length];
        class11.field152 = new class5[class43.field643.length];
        for (int var2 = 0; var2 < class43.field643.length; var2++) {
            class43.field643[var2].method33();
            class12.field163[var2] = class43.field643[var2].method37();
            class43.field643[var2].method33();
            class159.field2593[var2] = class43.field643[var2].method37();
            class43.field643[var2].method33();
            class11.field152[var2] = class43.field643[var2].method37();
            class43.field643[var2].method33();
        }
        class283.field4878 = class103.method783(0, arg0, class275.field4732, false);
        class249.field4143 = class19.method125(arg0, arg1 ^ 0xFFFFECA3, 0, class43.field642);
        class177.field2903 = class19.method125(arg0, -29269, 0, class227.field3665);
        class26.field353 = class19.method125(arg0, -29269, 0, class148.field2428);
        class154.field2509 = class19.method125(arg0, -29269, 0, class113.field1832);
        class291.field4976 = class309.method2140((byte) 58, class8.field104, arg0, 0);
        class93.field1448 = class309.method2140((byte) 93, class179.field2926, arg0, 0);
        if (arg1 != 24840) {
            field1056 = (class59) null;
        }
        class65.field995 = class251.method1752(0, 256, class285.field4896, arg0);
        class236.field3915 = class309.method2140((byte) 58, class33.field471, arg0, 0);
        class159.field2597 = class309.method2140((byte) 111, class20.field259, arg0, 0);
        class263.field4400 = class221.method1532(class186.field3112, 0, arg0, arg1 - 22792);
        class130.field2160 = class221.method1532(class295.field5040, 0, arg0, 2048);
        class178.field2923.method714(class130.field2160, (int[]) null);
        field1062.method714(class130.field2160, (int[]) null);
        class251.field4187.method714(class130.field2160, (int[]) null);
        if (class55.field815) {
            class158.field2587 = class216.method1502(-117, class120.field1999, 0, arg0);
            for (int var3 = 0; var3 < class158.field2587.length; var3++) {
                class158.field2587[var3].method40();
            }
        }
        class47 var4 = class26.method169(class98.field1575, true, arg0, 0);
        var4.method336();
        if (class55.field815) {
            class235.field3908 = new class122(var4);
        } else {
            class235.field3908 = var4;
        }
        class47[] var5 = class103.method783(0, arg0, class215.field3523, false);
        for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].method336();
        }
        if (class55.field815) {
            client.field623 = new class260[var5.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                client.field623[var7] = new class122(var5[var7]);
            }
        } else {
            client.field623 = var5;
        }
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 41.0D) - 20;
        int var11 = (int) (Math.random() * 21.0D) - 10;
        for (int var12 = 0; var12 < class283.field4878.length; var12++) {
            class283.field4878[var12].method348(var9 + var10, var8 + var10, var11 + var10);
        }
        class43.field643[0].method43(var9 + var10, var8 - -var10, var10 + var11);
        if (class55.field815) {
            class70.field1083 = new class260[class283.field4878.length];
            for (int var13 = 0; var13 < class283.field4878.length; var13++) {
                class70.field1083[var13] = new class122(class283.field4878[var13]);
            }
        } else {
            class70.field1083 = class283.field4878;
        }
    }
}
