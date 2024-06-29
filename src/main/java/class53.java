import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class53 extends class170 {

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "[I")
    public static int[] field677 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "Z")
    public static boolean field678 = false;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "Z")
    public static boolean field675 = false;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public static int field674 = 0;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "Lhc;")
    public static class368 field673 = new class368("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "[Z")
    public static boolean[] field680 = new boolean[100];

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "Z")
    public static boolean field681 = false;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "F")
    public static float field682;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "Lfk;")
    public static class23 field683;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "Lij;")
    public static class316 field684;

    static {
        new class368("Use", "Benutzen", "Utiliser", "Usar");
        new class368("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZIIIII)Z", line = 10)
    public static final boolean method426(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field679++;
        if (!arg0) {
            method428((byte) -29);
        }
        for (int var6 = arg2; var6 <= arg1; var6++) {
            for (int var7 = arg5; var7 <= arg3; var7++) {
                if (class49.field629[var6][var7] == arg4 && class177.field2515[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)V", line = 58)
    public static void method427(byte arg0) {
        field673 = null;
        if (arg0 < 26) {
            method428((byte) 17);
        }
        field677 = null;
        field684 = null;
        field683 = null;
        field680 = null;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)V", line = 74)
    public static final void method428(byte arg0) {
        field676++;
        int var1 = class446.field6256.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class446.field6256[var2] != null) {
                int var4 = -1;
                for (int var5 = 0; var5 < class163.field2331; var5++) {
                    if (class186.field2701[var5] == class171.field2413[var2]) {
                        var4 = var5;
                        break;
                    }
                }
                if (var4 == -1) {
                    class186.field2701[class163.field2331] = class171.field2413[var2];
                    var4 = class163.field2331++;
                }
                class366 var6 = new class366(class446.field6256[var2]);
                int var7 = 0;
                while (var6.field5048 < class446.field6256[var2].length && var7 < 511 && field674 < 1023) {
                    int var8 = var7++ << 6 | var4;
                    int var9 = var6.method2297(13352);
                    int var10 = var9 >> 14;
                    int var11 = (var9 & 0x1FFC) >> 7;
                    int var12 = var9 & 0x3F;
                    int var13 = (class171.field2413[var2] >> 8) * 64 + var11 - class6.field65;
                    int var14 = (class171.field2413[var2] & 0xFF) * 64 - (class371.field5148 - var12);
                    class233 var15 = class11.method57(-14758, var6.method2297(13352));
                    if (class428.field5951[var8] == null && (var15.field3331 & 0x1) > 0 && class367.field5096 == var10 && var13 >= 0 && class11.field107 > var13 + var15.field3278 && var14 >= 0 && class264.field3620 > var15.field3278 + var14) {
                        class428.field5951[var8] = new class419();
                        class428.field5951[var8].field2622 = var8;
                        class419 var16 = class428.field5951[var8];
                        class228.field3187[field674++] = var8;
                        var16.field2575 = class246.field3467;
                        var16.method2586(var15, -8);
                        var16.method1291(var16.field5807.field3278, false);
                        var16.field2629 = var16.field5807.field3268 << 3;
                        if (var16.field2629 == 0) {
                            var16.method1290(0, 0);
                        } else {
                            var16.method1290((var16.field5807.field3289 + 4 & 0x7C200007) << 11, 0);
                        }
                        var16.method1280(var16.method1285(-101), 34, true, var13, var14, var10);
                    }
                }
            }
        }
        int var3 = 52 / ((arg0 - 56) / 50);
    }
}
