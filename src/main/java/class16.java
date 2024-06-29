import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class class16 {

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Le;")
    public static class191 field211 = class54.method368("<col=00ff00>", 2047);

    @OriginalMember(owner = "client!be", name = "d", descriptor = "Le;")
    public static class191 field213 = class54.method368("<col=ffffff> )4 ", 2047);

    @OriginalMember(owner = "client!be", name = "i", descriptor = "Z")
    public static boolean field218 = false;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()Z")
    public boolean method120() {
        field210++;
        return false;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)I")
    public static final int method121(int arg0, int arg1) {
        if (arg0 != 8) {
            method122(112);
        }
        int var2 = arg1 & 0x3F;
        int var3 = (arg1 & 0xCD) >> 6;
        field214++;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)V")
    public static void method122(int arg0) {
        int var1 = 123 / ((arg0 - 45) / 42);
        field213 = null;
        field211 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)Lbe;")
    public class16 method123(int arg0, int arg1, int arg2) {
        field215++;
        return this;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public static final void method124(int arg0) {
        class228.method1627(false, 1);
        field219++;
        boolean var1 = true;
        class100.field1600 = 0;
        for (int var2 = 0; var2 < class248.field4409.length; var2++) {
            if (class38.field685[var2] != -1 && class248.field4409[var2] == null) {
                class248.field4409[var2] = class273.field4834.method826((byte) 35, class38.field685[var2], 0);
                if (class248.field4409[var2] == null) {
                    class100.field1600++;
                    var1 = false;
                }
            }
            if (class228.field4103[var2] != -1 && class69.field1214[var2] == null) {
                class69.field1214[var2] = class273.field4834.method828(0, class228.field4103[var2], 0, class13.field163[var2]);
                if (class69.field1214[var2] == null) {
                    var1 = false;
                    class100.field1600++;
                }
            }
            if (class75.field1277 != null && class261.field4625[var2] == null && class75.field1277[var2] != -1) {
                class261.field4625[var2] = class273.field4834.method828(0, class75.field1277[var2], 0, class13.field163[var2]);
                if (class261.field4625[var2] == null) {
                    var1 = false;
                    class100.field1600++;
                }
            }
        }
        if (class35.field648 == null || !class190.field3332.method810(class228.method1629(new class191[] { class35.field648.field883, class97.field1562 }, (byte) -96), (byte) -46)) {
            class248.field4416 = null;
        } else if (class190.field3332.method825((byte) -57, class228.method1629(new class191[] { class35.field648.field883, class97.field1562 }, (byte) -25))) {
            class248.field4416 = class255.method1765(35, class228.method1629(new class191[] { class35.field648.field883, class97.field1562 }, (byte) -83), class190.field3332);
        } else {
            class100.field1600++;
            var1 = false;
        }
        if (!var1) {
            class73.field1270 = 1;
            return;
        }
        class47.field839 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class248.field4409.length; var4++) {
            byte[] var19 = class69.field1214[var4];
            if (var19 != null) {
                int var20 = (class154.field2642[var4] & 0xFF) * 64 - class193.field3474;
                int var21 = (class154.field2642[var4] >> 8) * 64 - class225.field4061;
                if (class71.field1241) {
                    var20 = 10;
                    var21 = 10;
                }
                var3 &= class105.method676(var21, var19, var20, -176531519);
            }
        }
        if (!var3) {
            class73.field1270 = 2;
            return;
        }
        if (class73.field1270 != 0) {
            class40.method270(true, 0, class228.method1629(new class191[] { class233.field4163, class252.field4473 }, (byte) -43));
        }
        class228.method1632((byte) 99);
        class169.method1145((byte) 63);
        class197.method1387();
        for (int var5 = 0; var5 < 4; var5++) {
            class82.field1383[var5].method1497((byte) -12);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var17 = 0; var17 < 104; var17++) {
                for (int var18 = 0; var18 < 104; var18++) {
                    class270.field4755[var6][var17][var18] = 0;
                }
            }
        }
        if (arg0 != 30) {
            return;
        }
        class13.method91(false, (byte) 55);
        class228.method1632((byte) 105);
        System.gc();
        class228.method1627(true, arg0 ^ 0x1F);
        class217.method1482(false, 39);
        if (!class71.field1241) {
            class190.method1302(false, 6185);
            class228.method1627(true, 1);
            class57.method382(false, 64);
            if (class261.field4625 != null) {
                class105.method677(-102);
            }
        }
        if (class71.field1241) {
            class38.method258(8, false);
            class228.method1627(true, 1);
            class90.method545(false, -27996);
        }
        class169.method1145((byte) -82);
        class228.method1627(true, 1);
        class19.method146(128, class82.field1383, false);
        class228.method1627(true, 1);
        int var7 = class65.field1141;
        if (class261.field4598 < var7) {
            var7 = class261.field4598;
        }
        if ((class261.field4598 - 1) > var7) {
            int var8 = class261.field4598 - 1;
        }
        if (class188.method1298(10)) {
            class243.method1704(0);
        } else {
            class243.method1704(class65.field1141);
        }
        class85.method528((byte) -21);
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class89.method541(-71, var9, var16);
            }
        }
        class61.method413(arg0 ^ 0xFFFFCFBB);
        class228.method1632((byte) 102);
        class200.method1397((byte) 126);
        class169.method1145((byte) -100);
        if (class114.field1884 != null && class263.field4670 != null && class47.field836 == 25) {
            class53.field963.method1096(73, 0);
            class14.field187++;
            class53.field963.method1576(30289, 1057001181);
        }
        if (!class71.field1241) {
            int var10 = (class14.field165 - 6) / 8;
            int var11 = (class14.field165 + 6) / 8;
            int var12 = (class79.field1339 - 6) / 8;
            int var13 = (class79.field1339 + 6) / 8;
            for (int var14 = var10 - 1; var14 <= (var11 + 1); var14++) {
                for (int var15 = var12 - 1; var15 <= (var13 + 1); var15++) {
                    if (var14 < var10 || var14 > var11 || var15 < var12 || var13 < var15) {
                        class273.field4834.method816(-761841721, class228.method1629(new class191[] { class105.field1756, class92.method563(-110, var14), class115.field1908, class92.method563(arg0 - 105, var15) }, (byte) -62));
                        class273.field4834.method816(-761841721, class228.method1629(new class191[] { class130.field2165, class92.method563(-109, var14), class115.field1908, class92.method563(arg0 ^ -125, var15) }, (byte) -23));
                    }
                }
            }
        }
        if (class47.field836 == 28) {
            class188.method1293(10, -30211);
        } else {
            class188.method1293(30, -30211);
            if (class263.field4670 != null) {
                class53.field963.method1096(227, 0);
            }
        }
        class228.method1632((byte) 93);
        class240.method1685((byte) 118);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lee;IIIIII)Lee;")
    public static final class251 method125(class251 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var7 = (long) arg2;
        class251 var9 = (class251) class117.field1937.method991(var7, -25858);
        field220++;
        if (var9 == null) {
            class187 var10 = class187.method1270(class200.field3581, arg2, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1280(64, 768, -50, -10, -50);
            class117.field1937.method987(var9, var7, -2438);
        }
        if (arg1 < 66) {
            field213 = null;
        }
        int var11 = arg0.method944();
        int var12 = arg0.method947();
        int var13 = arg0.method949();
        int var14 = arg0.method973();
        class251 var15 = var9.method945(true, true);
        if (arg3 != 0) {
            var15.method951(arg3);
        }
        class144 var16 = (class144) var15;
        if (class222.method1546(class261.field4598, arg6 + var11, arg5 + var13, 247425607) != arg4 || class222.method1546(class261.field4598, arg6 + var12, arg5 - -var14, 247425607) != arg4) {
            for (int var17 = 0; var17 < var16.field2401; var17++) {
                var16.field2393[var17] += class222.method1546(class261.field4598, var16.field2400[var17] + arg6, var16.field2391[var17] - -arg5, 247425607) - arg4;
            }
            var16.field2405 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "()I")
    public abstract int method126();

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lbe;IIIZ)V")
    public void method128(class16 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field212++;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IBIII)V")
    public void method129(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field216++;
        if (arg1 > -4) {
            this.method129(-81, (byte) -52, 20, -6, -51);
        }
    }
}
