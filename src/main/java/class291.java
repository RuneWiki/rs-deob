import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class291 extends class390 {

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "Lkn;")
    public static class442 field4078 = new class442("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "Lja;")
    public static class152 field4080;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "Lsg;")
    public class226 field4079;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "Z")
    public boolean field4076;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BLuo;)V", line = 7)
    public static final void method1882(byte arg0, class345 arg1) {
        if (class271.field3762) {
            class299.method1942(arg1, -96);
        } else {
            class45.method399(arg1, (byte) -44);
        }
        field4077++;
        int var2 = -13 % ((arg0 - 9) / 55);
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)V", line = 21)
    public static void method1883(int arg0) {
        field4078 = null;
        if (arg0 != 0) {
            method1882((byte) -52, (class345) null);
        }
        field4080 = null;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "()V", line = 33)
    public static final void method1884() {
        if (class276.field3836 != null) {
            for (int var0 = 0; var0 < class276.field3836.length; var0++) {
                for (int var1 = 0; var1 < class200.field2772; var1++) {
                    for (int var2 = 0; var2 < class264.field3687; var2++) {
                        if (class276.field3836[var0][var1][var2] != null) {
                            class276.field3836[var0][var1][var2].method851(-12572);
                        }
                        class276.field3836[var0][var1][var2] = null;
                    }
                }
            }
        }
        class276.field3836 = null;
        class418.field5939 = null;
        if (class311.field4255 != null) {
            for (int var3 = 0; var3 < class311.field4255.length; var3++) {
                for (int var4 = 0; var4 < class200.field2772; var4++) {
                    for (int var5 = 0; var5 < class264.field3687; var5++) {
                        if (class311.field4255[var3][var4][var5] != null) {
                            class311.field4255[var3][var4][var5].method851(-12572);
                        }
                        class311.field4255[var3][var4][var5] = null;
                    }
                }
            }
        }
        class311.field4255 = null;
        class214.field2979 = null;
        class328.field4549 = null;
        class375.field5354 = null;
        class269.field3749 = 0;
        if (class362.field5029 != null) {
            for (int var6 = 0; var6 < class269.field3749; var6++) {
                class362.field5029[var6] = null;
            }
        }
        if (class21.field384 != null) {
            for (int var7 = 0; var7 < class52.field730; var7++) {
                class21.field384[var7] = null;
            }
            class52.field730 = 0;
        }
        if (class14.field280 != null) {
            for (int var8 = 0; var8 < class231.field3344; var8++) {
                class14.field280[var8] = null;
            }
            for (int var9 = 0; var9 < class392.field5617; var9++) {
                for (int var10 = 0; var10 < class200.field2772; var10++) {
                    for (int var11 = 0; var11 < class264.field3687; var11++) {
                        class54.field754[var9][var10][var11] = 0;
                    }
                }
            }
            class231.field3344 = 0;
        }
        class14.field279 = null;
        class450.method2798(false);
        class100.field1383.method1011((byte) -112);
        class326.field4453 = null;
        class126.field1782 = null;
        class249.field3518 = null;
        class387.field5557 = null;
    }
}
