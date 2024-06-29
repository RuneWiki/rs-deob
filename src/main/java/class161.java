import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class161 {

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public int field3238 = 0;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    public int field3237 = 0;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "[Lcd;")
    public static class23[] field3227 = new class23[100];

    @OriginalMember(owner = "client!s", name = "k", descriptor = "Lcd;")
    public static class23 field3229 = class54.method414("Sie haben gerade eine andere Welt verlassen)3", -1);

    @OriginalMember(owner = "client!s", name = "q", descriptor = "Lcd;")
    private static class23 field3235 = class54.method414("Invalid loginserver requested)3", -1);

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Lcd;")
    public static class23 field3221 = field3235;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "Lcd;")
    private static class23 field3233 = class54.method414("Please wait )2 attempting to reestablish)3", -1);

    @OriginalMember(owner = "client!s", name = "h", descriptor = "Lcd;")
    public static class23 field3226 = field3233;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "I")
    public static int field3239 = 0;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "Lcd;")
    private static class23 field3240 = class54.method414("shake:", -1);

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Lcd;")
    public static class23 field3222 = field3240;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "Lcd;")
    public static class23 field3230 = field3240;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public int field3219;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public int field3223;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public int field3225;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public int field3231;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public int field3236;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Lsh;")
    public class169 field3228;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "Lsh;")
    public class169 field3232;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public static void method987(byte arg0) {
        field3240 = null;
        field3221 = null;
        field3233 = null;
        field3226 = null;
        field3235 = null;
        field3229 = null;
        field3230 = null;
        field3222 = null;
        if (arg0 < 110) {
            method989((byte) 23);
        }
        field3227 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IBIIZLgd;I)V")
    public static final void method988(int arg0, byte arg1, int arg2, int arg3, boolean arg4, class58 arg5, int arg6) {
        long var7 = (long) ((arg3 << 16) + arg0);
        field3224++;
        class111 var9 = (class111) class204.field4014.method260(var7, (byte) 28);
        if (var9 != null || arg2 != 6116423) {
            return;
        }
        class111 var10 = (class111) class23.field499.method260(var7, (byte) 28);
        if (var10 != null) {
            return;
        }
        class111 var11 = (class111) class175.field3492.method260(var7, (byte) 28);
        if (var11 == null) {
            if (!arg4) {
                class111 var12 = (class111) class60.field1393.method260(var7, (byte) 28);
                if (var12 != null) {
                    return;
                }
            }
            class111 var13 = new class111();
            var13.field2350 = arg6;
            var13.field2349 = arg1;
            var13.field2342 = arg5;
            if (arg4) {
                class204.field4014.method262(var7, -115, var13);
                class145.field2973++;
            } else {
                class23.field514.method433((byte) -124, var13);
                class175.field3492.method262(var7, -127, var13);
                class31.field677++;
            }
        } else if (arg4) {
            var11.method724(true);
            class204.field4014.method262(var7, -115, var11);
            class145.field2973++;
            class31.field677--;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(B)V")
    public static final void method989(byte arg0) {
        int var1 = class134.field2789;
        if (arg0 > -75) {
            field3222 = null;
        }
        int var2 = class119.field2489;
        int var3 = class189.field3698;
        field3234++;
        int var4 = class179.field3552;
        int var5 = 6116423;
        class196.method1281(var1, var2, var4, var3, var5);
        class196.method1281(var1 + 1, var2 - -1, var4 - 2, 16, 0);
        class196.method1273(var1 + 1, var2 + 18, var4 - 2, var3 - 19, 0);
        class189.field3714.method291(class85.field1834, var1 + 3, var2 + 14, var5, -1);
        int var6 = class64.field1518;
        int var7 = class78.field1724;
        for (int var8 = 0; var8 < class49.field1171; var8++) {
            int var9 = 16777215;
            int var10 = (class49.field1171 - var8 - 1) * 15 + var2 + 31;
            if (var1 < var7 && var7 < var1 + var4 && var6 > var10 - 13 && var10 + 3 > var6) {
                var9 = 16776960;
            }
            class189.field3714.method291(class9.method52(var8, (byte) 125), var1 + 3, var10, var9, 0);
        }
        class67.method493(0, class179.field3552, class119.field2489, class189.field3698, class134.field2789);
    }
}
