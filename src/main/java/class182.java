import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class182 extends class12 {

    @OriginalMember(owner = "client!qg", name = "v", descriptor = "I")
    public static int field3288 = 0;

    @OriginalMember(owner = "client!qg", name = "y", descriptor = "I")
    public static int field3291 = 0;

    @OriginalMember(owner = "client!qg", name = "z", descriptor = "Lkh;")
    private static class117 field3292 = class224.method1450((byte) -17, "Location");

    @OriginalMember(owner = "client!qg", name = "B", descriptor = "Lkh;")
    public static class117 field3294 = field3292;

    @OriginalMember(owner = "client!qg", name = "x", descriptor = "Lkh;")
    public static class117 field3290 = class224.method1450((byte) 126, "::autoshadow off");

    @OriginalMember(owner = "client!qg", name = "w", descriptor = "Z")
    public static boolean field3289 = false;

    @OriginalMember(owner = "client!qg", name = "C", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!qg", name = "D", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!qg", name = "F", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!qg", name = "G", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!qg", name = "H", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!qg", name = "A", descriptor = "Lqg;")
    public class182 field3293;

    @OriginalMember(owner = "client!qg", name = "E", descriptor = "Lqg;")
    public class182 field3297;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "[I")
    public static int[] field3287;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
    public final void method1254(boolean arg0) {
        field3299++;
        if (this.field3293 == null) {
            return;
        }
        this.field3293.field3297 = this.field3297;
        this.field3297.field3293 = this.field3293;
        this.field3297 = null;
        this.field3293 = null;
        if (arg0) {
            this.field3293 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BI)I")
    public static final int method1255(byte arg0, int arg1) {
        field3300++;
        if (arg0 != -100) {
            return -81;
        } else if (arg1 >= 97 && arg1 <= 122 || arg1 >= 224 && arg1 <= 254 && arg1 != 247) {
            return arg1 - 32;
        } else if (arg1 == 255) {
            return 159;
        } else if (arg1 == 156) {
            return 140;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBI)I")
    public static final int method1256(int arg0, byte arg1, int arg2) {
        if (arg1 <= 5) {
            method1255((byte) -31, -112);
        }
        int var3 = 0;
        field3296++;
        while (arg2 > 0) {
            arg2--;
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "(B)V")
    public static void method1257(byte arg0) {
        field3290 = null;
        field3287 = null;
        if (arg0 <= 10) {
            method1257((byte) 43);
        }
        field3292 = null;
        field3294 = null;
    }
}
