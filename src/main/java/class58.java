import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class58 {

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Leg;")
    public static class188 field802 = new class188(64);

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "Z")
    public static boolean field826 = false;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public int field803;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public int field804;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public int field805;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public int field806;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public int field807;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public int field808;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public int field811;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public int field814;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "I")
    public int field815;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public int field816;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    public int field817;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public int field819;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public int field820;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    public int field821;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public int field822;

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "Lwf;")
    public static class306 field818;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "Lwf;")
    public static class306 field823;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "[[[B")
    public static byte[][][] field827;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BILte;IIII)V", line = 6)
    public static final void method396(byte arg0, int arg1, class38 arg2, int arg3, int arg4, int arg5, int arg6) {
        class112.method752(arg4, arg5, arg6, (byte) -13, arg1, arg2.field519, arg2.field537, arg3);
        field810++;
        if (arg0 >= -72) {
            method400(15, -110, (byte) 81);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 22)
    public static final void method397(int arg0) {
        int var1 = 52 % ((-arg0 - 52) / 60);
        field825++;
        if (class14.field144 == null) {
            return;
        }
        class117 var2 = new class117();
        for (int var3 = 0; var3 < 13; var3++) {
            for (int var4 = 0; var4 < 13; var4++) {
                class14.field144[var3][var4] = var2;
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V", line = 65)
    public static void method398(int arg0) {
        field827 = (byte[][][]) null;
        if (arg0 != -2049) {
            method396((byte) -58, 53, (class38) null, 115, -43, 69, -39);
        }
        field823 = null;
        field802 = null;
        field818 = null;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V", line = 79)
    public static final void method399(int arg0) {
        class83.field1249 = arg0;
        for (int var1 = 0; var1 < class228.field3650; var1++) {
            for (int var2 = 0; var2 < class84.field1276; var2++) {
                if (class90.field1375[arg0][var1][var2] == null) {
                    class90.field1375[arg0][var1][var2] = new class174(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIB)I", line = 103)
    public static final int method400(int arg0, int arg1, byte arg2) {
        field824++;
        int var3 = 14 / ((32 - arg2) / 42);
        int var4 = arg1 >> 31 & arg0 - 1;
        return ((arg1 >>> 31) + arg1) % arg0 + var4;
    }
}
