import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class185 {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "[I")
    public static int[] field3419 = new int[] { 2, 2, 4, 2, 1, 8, 4 };

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "Lvd;")
    private static class222 field3425 = class212.method1357("flash1:", 10731);

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "Lvd;")
    public static class222 field3424 = field3425;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "Lvd;")
    public static class222 field3426 = field3425;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Lcf;")
    public static class28 field3420 = new class28();

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "Lvd;")
    public static class222 field3427 = class212.method1357("Clientscript error in: ", 10731);

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "[I")
    public static int[] field3429;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "[[[B")
    public static byte[][][] field3428;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static void method1160(int arg0) {
        field3426 = null;
        field3429 = null;
        int var1 = -117 / ((-arg0 - 45) / 63);
        field3425 = null;
        field3424 = null;
        field3427 = null;
        field3420 = null;
        field3428 = null;
        field3419 = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)V")
    public static final void method1161(int arg0, int arg1, int arg2) {
        class130.field2529 = true;
        class80.field1539 = arg0;
        class52.field1002 = arg1;
        class204.field3799 = arg2;
        class71.field1385 = -1;
        class81.field1566 = -1;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)Lvd;")
    public static final class222 method1162(int arg0, int arg1) {
        if (arg0 < 87) {
            method1160(-97);
        }
        field3423++;
        return arg1 < 999999999 ? class56.method414(-120, arg1) : class188.field3489;
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(III)I")
    public static final int method1163(int arg0, int arg1, int arg2) {
        field3421++;
        int var3 = class173.method1097(arg2 - 1, arg1 + -1, (byte) -112) + class173.method1097(arg2 - 1, arg1 + 1, (byte) -112) + class173.method1097(arg2 + 1, arg1 + -1, (byte) -112) + class173.method1097(arg2 + 1, arg1 - -1, (byte) -112);
        if (arg0 != -3649) {
            method1162(-83, -92);
        }
        int var4 = class173.method1097(arg2, arg1 - 1, (byte) -112) + class173.method1097(arg2, arg1 + 1, (byte) -112) + class173.method1097(arg2 - 1, arg1, (byte) -112) + class173.method1097(arg2 + 1, arg1, (byte) -112);
        int var5 = class173.method1097(arg2, arg1, (byte) -112);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lva;Z)V")
    public static final void method1164(class219 arg0, boolean arg1) {
        field3422++;
        short var2 = 256;
        for (int var3 = 0; var3 < class39.field866.length; var3++) {
            class39.field866[var3] = 0;
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var2 * Math.random() * 128.0D);
            class39.field866[var16] = (int) (Math.random() * 256.0D);
        }
        if (!arg1) {
            field3425 = null;
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var2 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class143.field2764[var15] = (class39.field866[var15 + 128] + class39.field866[var15 - 1] + class39.field866[var15 + 1] + class39.field866[var15 + -128]) / 4;
                }
            }
            int[] var13 = class39.field866;
            class39.field866 = class143.field2764;
            class143.field2764 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field4061; var7++) {
            for (int var8 = 0; var8 < arg0.field4057; var8++) {
                if (arg0.field4056[var6++] != 0) {
                    int var9 = var8 + arg0.field4058 + 16;
                    int var10 = arg0.field4054 + var7 + 16;
                    int var11 = (var10 << 7) + var9;
                    class39.field866[var11] = 0;
                }
            }
        }
    }
}
