import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class183 extends class151 {

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    public int field3154 = 0;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    public int field3156 = -1;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "Lbd;")
    public static class162 field3150 = class17.method142(0, "Cache:");

    @OriginalMember(owner = "client!dg", name = "u", descriptor = "[I")
    public static int[] field3145 = new int[256];

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "S")
    public static short field3164 = 1;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "Lbd;")
    public static class162 field3155 = class17.method142(0, "overlay");

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
    public static int field3158 = 0;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "Lqb;")
    public static class209 field3160 = new class209(50);

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "Lbd;")
    public static class162 field3165 = class17.method142(0, "Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100");

    @OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
    public int field3143;

    @OriginalMember(owner = "client!dg", name = "v", descriptor = "I")
    public int field3146;

    @OriginalMember(owner = "client!dg", name = "w", descriptor = "I")
    public int field3147;

    @OriginalMember(owner = "client!dg", name = "x", descriptor = "I")
    public int field3148;

    @OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
    public int field3149;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
    public int field3151;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
    public int field3152;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public int field3153;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    public int field3157;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
    public int field3159;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "Lh;")
    public static class315 field3161;

    @OriginalMember(owner = "client!dg", name = "t", descriptor = "[Lud;")
    public static class79[] field3144;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(B)V", line = 23)
    public static void method1387(byte arg0) {
        field3161 = null;
        if (arg0 != 121) {
            return;
        }
        field3160 = null;
        field3165 = null;
        field3155 = null;
        field3144 = null;
        field3145 = null;
        field3150 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 47)
    public static final void method1388(int arg0) {
        int var1 = 45 % ((59 - arg0) / 54);
        field3162++;
        if (class28.field468.toLowerCase().indexOf("microsoft") != -1) {
            class280.field4718[190] = 72;
            class280.field4718[189] = 26;
            class280.field4718[220] = 74;
            class280.field4718[219] = 42;
            class280.field4718[192] = 58;
            class280.field4718[188] = 71;
            class280.field4718[221] = 43;
            class280.field4718[222] = 59;
            class280.field4718[186] = 57;
            class280.field4718[223] = 28;
            class280.field4718[191] = 73;
            class280.field4718[187] = 27;
            return;
        }
        class280.field4718[47] = 73;
        class280.field4718[91] = 42;
        class280.field4718[92] = 74;
        class280.field4718[45] = 26;
        class280.field4718[61] = 27;
        class280.field4718[59] = 57;
        class280.field4718[46] = 72;
        if (class28.field487 == null) {
            class280.field4718[222] = 59;
            class280.field4718[192] = 58;
        } else {
            class280.field4718[192] = 28;
            class280.field4718[222] = 58;
            class280.field4718[520] = 59;
        }
        class280.field4718[93] = 43;
        class280.field4718[44] = 71;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(III)Llm;", line = 102)
    public static final class43 method1389(int arg0, int arg1, int arg2) {
        class225 var3 = class288.field4856[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3756; var4++) {
            class43 var5 = var3.field3765[var4];
            if ((var5.field697 >> 29 & 0x3L) == 2L && var5.field711 == arg1 && var5.field699 == arg2) {
                class31.method255(var5);
                return var5;
            }
        }
        return null;
    }
}
