import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class217 extends class69 {

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    private final int field3731;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
    private final int field3742;

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    private final int field3729;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    private final int field3743;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "[I")
    public static int[] field3726 = new int[500];

    @OriginalMember(owner = "client!ug", name = "F", descriptor = "I")
    public static int field3734 = 0;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
    public static int field3736 = 0;

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "I")
    public static int field3727 = 0;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "[I")
    public static int[] field3737 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
    public static int field3733 = -1;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "Leg;")
    public static class37 field3728 = class174.method1167("Starte 3D)2Softwarebibliothek)3", -66);

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "Leg;")
    public static class37 field3740 = class174.method1167("M-Bmoire en cours d(Wattribution", 59);

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
    public static int field3741 = 100;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public static int field3730;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(III)V")
    public final void method418(int arg0, int arg1, int arg2) {
        int var4 = this.field3742 * arg2 >> 12;
        ++field3732;
        if (arg1 == 28440) {
            int var5 = this.field3729 * arg2 >> 12;
            int var6 = this.field3743 * arg0 >> 12;
            int var7 = this.field3731 * arg0 >> 12;
            class86.method566(super.field1110, var4, super.field1090, super.field1111, var7, var6, var5, arg1 ^ -20726);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)V")
    public final void method414(int arg0, int arg1, int arg2) {
        ++field3739;
        int var4 = this.field3742 * arg0 >> 12;
        if (arg2 != 31712) {
            field3727 = -112;
        }
        int var5 = this.field3729 * arg0 >> 12;
        int var6 = this.field3743 * arg1 >> 12;
        int var7 = this.field3731 * arg1 >> 12;
        class72.method486(var4, var7, var5, var6, super.field1111, super.field1110, arg2 + -30412);
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public static void method1527(int arg0) {
        field3737 = null;
        field3726 = null;
        field3740 = null;
        field3728 = null;
        if (arg0 >= -42) {
            field3741 = -69;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lpi;Z)V")
    public static final void method1528(class188 arg0, boolean arg1) {
        class89 var2 = (class89) class154.field2584.method992((byte) 125, arg0.field3235.method217((byte) -102));
        ++field3730;
        if (var2 != null) {
            var2.method588((byte) 90);
        } else {
            class47.method314(0, (class133) null, arg0.field1780[0], class237.field4140, arg0.field1812[0], (class163) null, true, arg0);
        }
        if (!arg1) {
            field3736 = 37;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(IIIIIII)V")
    public class217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3731 = arg3;
        this.field3742 = arg0;
        this.field3729 = arg2;
        this.field3743 = arg1;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(III)V")
    public final void method416(int arg0, int arg1, int arg2) {
        ++field3735;
        int var4 = this.field3731 * arg1 >> 12;
        int var5 = this.field3742 * arg2 >> 12;
        int var6 = this.field3743 * arg1 >> 12;
        int var7 = this.field3729 * arg2 >> 12;
        class198.method1378(var5, super.field1090, var4, var6, true, var7);
        if (arg0 > -49) {
            field3737 = null;
        }
    }
}
