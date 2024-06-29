import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class89 {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "Lcd;")
    public static class64 field1603 = class44.method335((byte) 71, "leuchten2:");

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field1610 = 0;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "Lcd;")
    private static class64 field1608 = class44.method335((byte) 71, "Walk here");

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Lcd;")
    public static class64 field1604 = field1608;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field1612 = 0;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "[Le;")
    public static class150[] field1615 = new class150[4];

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "Lcd;")
    public static class64 field1606 = class44.method335((byte) 71, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "[I")
    public static int[] field1616 = new int[2048];

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "[I")
    public static int[] field1605;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "[I")
    public static int[] field1611;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBIIII)V", line = 9)
    public static final void method680(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field1607++;
        if (arg1 != 47) {
            method681((byte) 32);
        }
        class290.field4992 = arg5;
        class245.field4263 = arg3;
        class84.field1556 = arg2;
        class121.field2177 = arg0;
        class304.field5202 = arg4;
        if (class304.field5202 >= 100) {
            int var6 = class84.field1556 * 128 + 64;
            int var7 = class245.field4263 * 128 + 64;
            int var8 = class15.method169(var7, 13257, class20.field364, var6) - class290.field4992;
            int var9 = var8 - class268.field4622;
            int var10 = var6 - class99.field1791;
            int var11 = var7 - class119.field2156;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class131.field2336 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class181.field3102 = (int) (Math.atan2((double) var10, (double) var11) * -325.949D) & 0x7FF;
            if (class131.field2336 < 128) {
                class131.field2336 = 128;
            }
            if (class131.field2336 > 383) {
                class131.field2336 = 383;
            }
        }
        class238.field4054 = 2;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V", line = 94)
    public static void method681(byte arg0) {
        field1603 = null;
        field1605 = null;
        field1606 = null;
        field1615 = null;
        if (arg0 > 67) {
            field1604 = null;
            field1611 = null;
            field1616 = null;
            field1608 = null;
        }
    }
}
