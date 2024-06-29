import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class373 {

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public static int field5536 = 0;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "[I")
    public static int[] field5537 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "[B")
    public static byte[] field5539 = new byte[2048];

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
    public static void method2298(int arg0) {
        field5539 = null;
        int var1 = -39 % ((arg0 + 54) / 56);
        field5537 = null;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)Lku;")
    public static final class255 method2299(int arg0) {
        field5535++;
        if (arg0 != 8) {
            return null;
        }
        class255 var1 = (class255) class49.field543.method2949((byte) 112);
        if (var1 == null) {
            return new class255();
        } else {
            class370.field5500--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIII)V")
    public static final void method2300(int arg0, int arg1, int arg2, int arg3) {
        field5538++;
        if (arg1 != 0) {
            method2298(21);
        }
        int var4 = class478.field7044.field3334 * arg0 >> 8;
        if (var4 != 0 && arg3 != -1) {
            class458.method2755(var4, arg3, 0, class279.field4087, arg1 - 15727, false);
            class195.field2843 = true;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)Lua;")
    public static final class470 method2301(int arg0, int arg1, int arg2) {
        class148 var3 = class422.field6240[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class470 var4 = var3.field2084;
            var3.field2084 = null;
            return var4;
        }
    }
}
