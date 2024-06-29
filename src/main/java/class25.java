import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class25 {

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field508 = 0;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Z")
    public static boolean field512 = true;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "Lea;")
    public static class38 field516 = class9.method46((byte) 111, "p12_full");

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Ls;")
    public static class161 field514;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "[I")
    public static int[] field511;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "[Lfa;")
    public static class47[] field506;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "[[B")
    public static byte[][] field513;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIII)I")
    public static final int method145(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 / arg2;
        field515++;
        int var5 = arg0 & arg2 - 1;
        if (arg3 < 120) {
            method146(-36);
        }
        int var6 = arg1 / arg2;
        int var7 = arg2 - 1 & arg1;
        int var8 = class14.method78(var6, (byte) 25, var4);
        int var9 = class14.method78(var6, (byte) -115, var4 + 1);
        int var10 = class14.method78(var6 + 1, (byte) 125, var4);
        int var11 = class14.method78(var6 + 1, (byte) 94, var4 + 1);
        int var12 = class197.method1301(var9, 2058356880, arg2, var5, var8);
        int var13 = class197.method1301(var11, 2058356880, arg2, var5, var10);
        return class197.method1301(var13, 2058356880, arg2, var7, var12);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method146(int arg0) {
        field513 = null;
        field506 = null;
        if (arg0 >= 31) {
            field516 = null;
            field514 = null;
            field511 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)I")
    public static final int method147(int arg0, boolean arg1) {
        field505++;
        if (arg1) {
            method147(-18, true);
        }
        return arg0 >> 11 & 0x3F;
    }
}
