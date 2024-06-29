import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class12 {

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "[I")
    public static int[] field389 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "Lvf;")
    public static class265 field391 = class87.method582(-46, "Benutzen");

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "Lfd;")
    public static class207 field392 = new class207(128);

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "Lvf;")
    public static class265 field395 = class87.method582(-46, "mapflag");

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "[I")
    public static int[] field397 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "Lvf;")
    public static class265 field398 = class87.method582(-46, "Impossible de trouver ");

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "Lvf;")
    public static class265 field399 = class87.method582(-46, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "J")
    public long field393;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Lkh;")
    public class12 field388;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "Lkh;")
    public class12 field394;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)Z")
    public final boolean method95(int arg0) {
        field387++;
        if (this.field394 == null) {
            return false;
        } else {
            int var2 = 51 % ((arg0 + 77) / 48);
            return true;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V")
    public static void method96(byte arg0) {
        field389 = null;
        field392 = null;
        field395 = null;
        field397 = null;
        field398 = null;
        field399 = null;
        field391 = null;
        int var1 = -115 % ((-arg0 - 50) / 57);
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
    public final void method97(int arg0) {
        if (arg0 != 158) {
            field398 = null;
        }
        field396++;
        if (this.field394 != null) {
            this.field394.field388 = this.field388;
            this.field388.field394 = this.field394;
            this.field388 = null;
            this.field394 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIB)Lgk;")
    public static final class6 method98(int arg0, int arg1, byte arg2) {
        class6 var3 = class21.method204(arg0, -16257);
        field390++;
        if (arg1 == -1) {
            return var3;
        } else {
            if (arg2 != -124) {
                field389 = null;
            }
            return var3 == null || var3.field160 == null || arg1 >= var3.field160.length ? null : var3.field160[arg1];
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V")
    public static final void method99(int arg0) {
        field386++;
        class150.field2775.method1893(-20);
        class160.field2927.method1893(-78);
        class211.field3787.method1893(-86);
        if (arg0 != 193) {
            field399 = null;
        }
    }
}
