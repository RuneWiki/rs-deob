import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class356 extends class425 {

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "[B")
    public byte[] field5149;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "S")
    public static short field5148 = 32767;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "Lpm;")
    public static class349 field5152;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "Ljd;")
    public static class125 field5154;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "[S")
    public static short[] field5157;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "Lkn;")
    public static class442 field5156;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field5153;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static void method2325(int arg0) {
        field5152 = null;
        field5154 = null;
        int var1 = 87 / ((arg0 - 26) / 38);
        field5157 = null;
        field5156 = null;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "([B)V")
    public class356(byte[] arg0) {
        this.field5149 = arg0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lvq;I)V")
    public static final void method2326(class269 arg0, int arg1) {
        field5150++;
        arg0.method937(0, 0, class24.field307, 350);
        arg0.method1012(0, 0, class24.field307, 350, class5.field84 << 24 | 0x332277, 1);
        for (int var2 = 0; var2 < 100; var2++) {
            int var13 = class409.field5817[var2];
            int var14 = class204.field2881[var2];
            arg0.method1012(var13, var14, 2, 2, class126.field1744[var2] << 24 | 0xFFFFFF, 1);
        }
        int var3 = 350 / class130.field1842;
        if (class442.field6328 > 0) {
            int var4 = 342 - class130.field1842;
            int var5 = var3 * var4 / (class442.field6328 + var3 - 1);
            int var6 = 4;
            if (class442.field6328 > 1) {
                var6 += (class442.field6328 - class282.field4033 - 1) * (var4 - var5) / (class442.field6328 - 1);
            }
            arg0.method1012(class24.field307 - 16, var6, 12, var5, class5.field84 << 24 | 0x332277, 2);
            for (int var7 = class282.field4033; var7 < (class282.field4033 + var3) && class442.field6328 > var7; var7++) {
                String[] var8 = class190.method1362(class1.field4[var7], '\b', (byte) 25);
                int var9 = (class24.field307 - 8 - 16) / var8.length;
                for (int var10 = 0; var10 < var8.length; var10++) {
                    int var11 = (var9 * var10) + 8;
                    arg0.method937(var11, 0, var11 + var9 - 8, 350);
                    class402.field5648.method2197(-1, -16777216, var11, (byte) -75, var8[var10], 350 - ((var7 - class282.field4033) * class130.field1842) - class317.field4651.field2575 - class366.field5239 - 2);
                }
            }
        }
        arg0.method937(0, 0, class24.field307, 350);
        if (arg1 != 27994) {
            method2325(-10);
        }
        arg0.method1841((byte) -20, 0, -1, class24.field307, 350 - class366.field5239);
        class154.field2285.method2197(-1, -16777216, 10, (byte) 21, "--> " + class284.field4139, 350 - class70.field934.field2575 - 1);
        int var12 = -1;
        if (class34.field434 % 30 > 15) {
            var12 = 16777215;
        }
        arg0.method1839(class70.field934.method1309((byte) 125, "--> " + class284.field4139.substring(0, class198.field2836)) + 10, 12, var12, (byte) 123, 339 - class70.field934.field2575);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLtj;)V")
    public static final void method2327(byte arg0, class108 arg1) {
        if (arg0 == -21) {
            field5151++;
            class249.field3720 = arg1;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5153++;
        if (arg2 < 128 || arg0 < 128 || arg2 > (class80.field1034 * 128 - 256) || arg0 > (class381.field5414 * 128 - 256)) {
            class212.field3004[0] = class212.field3004[1] = -1;
            return;
        }
        int var9 = class452.method2820(class158.field2302, arg0, false, arg2) - arg3;
        class44.field598.method1134(arg5, 0, 0);
        class59.field786.method973(class44.field598);
        class59.field786.method914(arg2, var9, arg0, class212.field3004);
        if (arg6 <= -126) {
            class44.field598.method1134(-arg5, 0, 0);
            class59.field786.method973(class44.field598);
        }
    }

    static {
        new class349("Changes will take effect on your clan in the next 60 seconds.", "Die Änderungen am Chatraum werden innerhalb von 60 Sekunden gültig.", "Les modifications seront apportées à votre clan dans les prochaines 60 secondes.", "As alterações passarão a valer no seu clã nos próximos 60 segundos.");
        field5152 = new class349("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");
        field5154 = new class125(100);
        field5157 = new short[] { -10304, 9104, -1, -1, -1 };
        field5155 = 0;
        field5156 = new class442();
    }
}
