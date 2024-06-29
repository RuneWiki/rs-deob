import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class class351 {

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Lhv;")
    public static class150 field5229 = new class150();

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Lnv;")
    public static class44 field5231 = new class44();

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field5232;

    static {
        new class179("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BZILza;IILla;)V", line = 4)
    public static final void method2251(byte arg0, boolean arg1, int arg2, class299 arg3, int arg4, int arg5, class310 arg6) {
        field5230++;
        if (arg0 != -28) {
            return;
        }
        if (arg1) {
            class300.field4609.method2316((class169.field2570 - class300.field4609.method394()) / 2, (class360.field5313 - class300.field4609.method396()) / 2);
            class392.field5728.method2316((class169.field2570 - class392.field5728.method394()) / 2, 18);
        }
        String var7 = "";
        if (class81.field1327 == class401.field5923) {
            var7 = class463.field6864.method1265(class345.field5141, -114);
        } else if (class401.field5923 == class268.field4258) {
            var7 = class250.field4074.method1265(class345.field5141, -100);
        }
        arg6.method2047(class169.field2570 / 2, var7, class360.field5313 / 2 - 26, arg2, -1, -1);
        int var8 = class360.field5313 / 2 - 18;
        arg3.method602(class169.field2570 / 2 - 152, var8, 304, 34, arg4, 0);
        arg3.method602(class169.field2570 / 2 - 151, var8 + 1, 302, 32, 0, 0);
        arg3.method506(class169.field2570 / 2 - 150, var8 - -2, class428.field6355 * 3, 30, arg5, 0);
        arg3.method506(class428.field6355 * 3 + (class169.field2570 / 2 - 150), var8 + 2, 300 - (class428.field6355 * 3), 30, 0, 0);
        arg6.method2047(class169.field2570 / 2, class444.field6616, class360.field5313 / 2 + 4, arg2, arg0 ^ 0x1B, -1);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "()V", line = 40)
    public static final void method2252() {
        if (class470.field6902 != null) {
            for (int var0 = 0; var0 < class470.field6902.length; var0++) {
                for (int var1 = 0; var1 < class474.field6947; var1++) {
                    for (int var2 = 0; var2 < class443.field6603; var2++) {
                        if (class470.field6902[var0][var1][var2] != null) {
                            class470.field6902[var0][var1][var2].method1895((byte) 95);
                        }
                        class470.field6902[var0][var1][var2] = null;
                    }
                }
            }
        }
        class470.field6902 = null;
        class274.field4306 = null;
        if (class360.field5317 != null) {
            for (int var3 = 0; var3 < class360.field5317.length; var3++) {
                for (int var4 = 0; var4 < class474.field6947; var4++) {
                    for (int var5 = 0; var5 < class443.field6603; var5++) {
                        if (class360.field5317[var3][var4][var5] != null) {
                            class360.field5317[var3][var4][var5].method1895((byte) 99);
                        }
                        class360.field5317[var3][var4][var5] = null;
                    }
                }
            }
        }
        class360.field5317 = null;
        class288.field4475 = null;
        class348.field5192 = null;
        class407.field6024 = null;
        class259.field4155 = 0;
        if (class155.field2378 != null) {
            for (int var6 = 0; var6 < class259.field4155; var6++) {
                class155.field2378[var6] = null;
            }
        }
        if (class195.field3065 != null) {
            for (int var7 = 0; var7 < class327.field4957; var7++) {
                class195.field3065[var7] = null;
            }
            class327.field4957 = 0;
        }
        if (class356.field5270 != null) {
            for (int var8 = 0; var8 < class16.field172; var8++) {
                class356.field5270[var8] = null;
            }
            for (int var9 = 0; var9 < class183.field2802; var9++) {
                for (int var10 = 0; var10 < class474.field6947; var10++) {
                    for (int var11 = 0; var11 < class443.field6603; var11++) {
                        class424.field6221[var9][var10][var11] = 0L;
                    }
                }
            }
            class16.field172 = 0;
        }
        class317.field4835 = null;
        class291.method1952(-30999);
        class103.field1592.method1079(true);
        class101.field1543 = null;
        class295.field4548 = null;
        class341.field5093 = null;
        class33.field398 = null;
        class182.field2788 = null;
        class319.field4840 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 186)
    public static void method2253(int arg0) {
        field5229 = null;
        field5231 = null;
        if (arg0 != 2) {
            field5231 = null;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(F[FBFFFIIIII)V")
    public abstract void method1565(float arg0, float[] arg1, byte arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10);
}
