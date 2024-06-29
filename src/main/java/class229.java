import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class229 extends class124 {

    @OriginalMember(owner = "client!of", name = "Q", descriptor = "Le;")
    public static class191 field4114 = class54.method368(":duelfriend:", 2047);

    @OriginalMember(owner = "client!of", name = "W", descriptor = "Le;")
    public static class191 field4120 = class54.method368("<br>(X", 2047);

    @OriginalMember(owner = "client!of", name = "R", descriptor = "[I")
    public static int[] field4115 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!of", name = "V", descriptor = "Lvj;")
    public static class159 field4119 = new class159();

    @OriginalMember(owner = "client!of", name = "Y", descriptor = "Le;")
    public static class191 field4122 = class54.method368("Spieler", 2047);

    @OriginalMember(owner = "client!of", name = "Z", descriptor = "Le;")
    public static class191 field4123 = class54.method368("Verbindung abgebrochen)3", 2047);

    @OriginalMember(owner = "client!of", name = "P", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!of", name = "S", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!of", name = "T", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!of", name = "U", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!of", name = "X", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Z")
    public static final boolean method1633(int arg0, int arg1) {
        ++field4118;
        if (arg0 != -11307) {
            method1634((byte) -26);
        }
        return ~(1 & arg1 >> 30) != -1;
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(B)V")
    public static void method1634(byte arg0) {
        if (arg0 != 41) {
            method1633(39, 9);
        }
        field4120 = null;
        field4119 = null;
        field4115 = null;
        field4123 = null;
        field4122 = null;
        field4114 = null;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class229() {
        super(1, false);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        ++field4117;
        int[] var3 = super.field2064.method378(arg1, 0);
        if (super.field2064.field1035) {
            int[] var4 = this.method844(0, 67, arg1);
            for (int var5 = 0; ~class64.field1132 < ~var5; ++var5) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        if (arg0 < 68) {
            method1634((byte) -38);
        }
        return var3;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        if (!arg2) {
            field4114 = null;
        }
        if (~arg0 == -1) {
            super.field2063 = ~arg1.method1580(-6) == -2;
        }
        ++field4113;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IB)[[I")
    public final int[][] method137(int arg0, byte arg1) {
        ++field4121;
        if (arg1 != -7) {
            method1634((byte) 57);
        }
        int[][] var3 = super.field2053.method1775((byte) -117, arg0);
        if (super.field2053.field4558) {
            int[][] var4 = this.method843((byte) -84, arg0, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class64.field1132; ++var11) {
                var8[var11] = -var7[var11] + 4096;
                var9[var11] = -var5[var11] + 4096;
                var10[var11] = 4096 - var6[var11];
            }
        }
        return var3;
    }
}
