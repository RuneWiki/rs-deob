import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class153 extends class166 {

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
    public int field3048 = 0;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "I")
    public int field3054 = -1;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
    public static int field3050 = -1;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "Lcd;")
    public static class23 field3052 = class54.method414("RuneScape wird geladen )2 bitte warten)3)3)3", -1);

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "Lcd;")
    private static class23 field3065 = class54.method414("Cancel", -1);

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "Lcd;")
    public static class23 field3061 = field3065;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "[Lcd;")
    public static class23[] field3049 = new class23[100];

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "I")
    public static int field3067 = 0;

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "Lcd;")
    public static class23 field3068 = class54.method414("Passwort: ", -1);

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "Lcd;")
    public static class23 field3071 = class54.method414("jolt", -1);

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public int field3051;

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "I")
    public int field3053;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "I")
    public int field3056;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
    public int field3057;

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "I")
    public int field3059;

    @OriginalMember(owner = "client!ra", name = "C", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!ra", name = "E", descriptor = "I")
    public int field3062;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "I")
    public int field3063;

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "I")
    public int field3064;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "I")
    public int field3066;

    @OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
    public int field3069;

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "[S")
    public static short[] field3058;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "(I)V")
    public static void method945(int arg0) {
        field3068 = null;
        int var1 = -2 / ((arg0 - 46) / 36);
        field3058 = null;
        field3052 = null;
        field3071 = null;
        field3065 = null;
        field3049 = null;
        field3061 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)Z")
    public static final boolean method946(int arg0, int arg1) {
        if (arg0 == -1) {
            field3060++;
            return (arg1 >> 31 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V")
    public static final void method947(byte arg0) {
        class110.field2337 = new byte[4][105][105];
        field3047++;
        class9.field185 = new byte[4][104][104];
        class40.field852 = new int[4][105][105];
        class39.field824 = new int[104];
        class19.field407 = new int[105][105];
        class21.field445 = 99;
        class111.field2353 = new int[104];
        class169.field3375 = new int[104];
        class163.field3270 = new byte[4][104][104];
        class136.field2822 = new int[104];
        class105.field2267 = new int[104];
        class60.field1402 = new byte[4][104][104];
        if (arg0 > -31) {
            method946(3, -86);
        }
        class12.field233 = new byte[4][104][104];
    }
}
