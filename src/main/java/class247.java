import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class247 extends class279 {

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "I")
    private int field4112 = 2048;

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
    private int field4120 = 3072;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    private int field4116 = 1024;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    public static int field4111 = 0;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "[I")
    public static int[] field4118 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "I")
    public static int field4117;

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "[Ltl;")
    public static class59[] field4123;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(II)[[I", line = 10)
    public final int[][] method87(int arg0, int arg1) {
        field4114++;
        if (arg0 != -7523) {
            this.method51(106, 99, (class170) null);
        }
        int[][] var3 = this.field4786.method1427(0, arg1);
        if (this.field4786.field3297) {
            int[][] var4 = this.method1956(0, arg1, (byte) -112);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var3[1];
            int[] var8 = var4[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class56.field835; var11++) {
                var10[var11] = (var6[var11] * this.field4112 >> 12) + this.field4116;
                var7[var11] = this.field4116 + (var8[var11] * this.field4112 >> 12);
                var9[var11] = (var5[var11] * this.field4112 >> 12) + this.field4116;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(ZI)Lma;", line = 52)
    public static final class263 method1738(boolean arg0, int arg1) {
        field4121++;
        int var2 = arg1 >> 16;
        if (arg0) {
            return (class263) null;
        }
        int var3 = arg1 & 0xFFFF;
        if (class239.field3986[var2] == null || class239.field3986[var2][var3] == null) {
            boolean var4 = class253.method1764(var2, 0);
            if (!var4) {
                return null;
            }
        }
        return class239.field3986[var2][var3];
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V", line = 77)
    public class247() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILs;)V", line = 82)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg0 >= -125) {
            return;
        }
        if (arg1 == 0) {
            this.field4116 = arg2.method1214(-18254);
        } else if (arg1 == 1) {
            this.field4120 = arg2.method1214(-18254);
        } else if (arg1 == 2) {
            this.field4789 = arg2.method1221(124) == 1;
        }
        field4113++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V", line = 126)
    public final void method319(byte arg0) {
        this.field4112 = this.field4120 - this.field4116;
        field4115++;
        if (arg0 > -9) {
            method1738(true, 57);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lme;Lme;ILml;)V", line = 137)
    public static final void method1739(class295 arg0, class295 arg1, int arg2, class15 arg3) {
        class187.field3128 = arg0;
        class274.field4722 = arg3;
        field4122++;
        class179.field2928 = arg1;
        if (arg2 != 168) {
            field4119 = -38;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)[I", line = 152)
    public final int[] method44(boolean arg0, int arg1) {
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        field4110++;
        if (arg0) {
            this.method51(-122, 68, (class170) null);
        }
        if (this.field4781.field354) {
            int[] var4 = this.method1960(-121, arg1, 0);
            for (int var5 = 0; var5 < class56.field835; var5++) {
                var3[var5] = (var4[var5] * this.field4112 >> 12) + this.field4116;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)V", line = 224)
    public static void method1740(byte arg0) {
        if (arg0 != 105) {
            field4111 = 58;
        }
        field4123 = null;
        field4118 = null;
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(B)V", line = 240)
    public static final void method1741(byte arg0) {
        field4109++;
        if (class293.field4998 < class254.field4211) {
            class293.field4998 = (float) ((double) class293.field4998 / 30.0D + (double) class293.field4998);
            if (class293.field4998 > class254.field4211) {
                class293.field4998 = class254.field4211;
            }
            class64.method528(124);
        } else if (class254.field4211 < class293.field4998) {
            class293.field4998 = (float) ((double) class293.field4998 - (double) class293.field4998 / 30.0D);
            if (class254.field4211 > class293.field4998) {
                class293.field4998 = class254.field4211;
            }
            class64.method528(127);
        }
        if (class119.field1942 != -1 && class69.field1065 != -1) {
            int var1 = class119.field1942 - class120.field2005;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            class120.field2005 += var1;
            int var2 = class69.field1065 - class100.field1624;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            if (var1 == 0 && var2 == 0) {
                class69.field1065 = -1;
                class119.field1942 = -1;
            }
            class100.field1624 += var2;
            class64.method528(arg0 ^ 0xFFFFFFBB);
        }
        if (arg0 != 15) {
            field4119 = -112;
        }
    }
}
