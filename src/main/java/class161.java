import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class161 {

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Lda;")
    public static class275 field2818 = class255.method1672(111, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!je", name = "e", descriptor = "[I")
    public static int[] field2820 = new int[500];

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Z")
    public static volatile boolean field2816 = true;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "Lda;")
    public static class275 field2823 = class255.method1672(125, "0");

    @OriginalMember(owner = "client!je", name = "g", descriptor = "Z")
    public static boolean field2822 = false;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Lda;")
    public static class275 field2824 = class255.method1672(98, "Angreifen");

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field2826;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIII)V")
    public static final void method1123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 500) {
            field2823 = null;
        }
        int var8 = arg4 + 1;
        class36.method216(class19.field280[arg4], arg2, arg3, -113, arg0);
        int var9 = arg5 - 1;
        class36.method216(class19.field280[arg5], arg2, arg3, -113, arg0);
        field2825++;
        for (int var6 = var8; var6 <= var9; var6++) {
            int[] var7 = class19.field280[var6];
            var7[arg2] = var7[arg0] = arg3;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lda;Lda;IILda;)V")
    public static final void method1124(class275 arg0, class275 arg1, int arg2, int arg3, class275 arg4) {
        int var5 = 48 / ((11 - arg3) / 57);
        field2819++;
        class167.method1144(1, arg2, -1, arg1, arg4, arg0);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static void method1125(byte arg0) {
        field2824 = null;
        int var1 = 22 / ((arg0 - 18) / 43);
        field2823 = null;
        field2818 = null;
        field2820 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ZI)Lmj;")
    public static final class51 method1126(boolean arg0, int arg1) {
        class51 var2 = (class51) class103.field1720.method252(true, (long) arg1);
        field2817++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class108.field1876.method775(11, arg1, -24799);
        if (arg0) {
            method1125((byte) -72);
        }
        class51 var4 = new class51();
        if (var3 != null) {
            var4.method318(new class85(var3), (byte) 122);
        }
        class103.field1720.method251(var4, (byte) 89, (long) arg1);
        return var4;
    }
}
