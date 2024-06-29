import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class237 extends class154 {

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "Loh;")
    public static class258 field4143 = class153.method1046("Suche nach Updates )2 ", 95);

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "Loh;")
    private static class258 field4139 = class153.method1046("Walk here", 99);

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "Loh;")
    public static class258 field4146 = field4139;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public static int field4141 = 0;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "Loh;")
    public static class258 field4145 = class153.method1046("mem=", 108);

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field4140;

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "I")
    public int field4142;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "I")
    public int field4144;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public static int field4147;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public static int field4149;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    public int field4150;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V", line = 9)
    public static final void method1627(int arg0, int arg1) {
        field4140++;
        class243.field4214.method1156(arg0, 0);
        if (arg1 < -37) {
            class167.field2834.method1156(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BJ)V", line = 32)
    public static final void method1628(byte arg0, long arg1) {
        field4147++;
        if (arg0 != -88 || arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class51.method401(-2, arg1 - 1L);
            class51.method401(-2, 1L);
        } else {
            class51.method401(-2, arg1);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZIB[[I[[FIIIIZIIIZ[[I[[FZZ[ILgd;[Z[[F)V", line = 57)
    public static final void method1629(boolean arg0, int arg1, byte arg2, int[][] arg3, float[][] arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, boolean arg13, int[][] arg14, float[][] arg15, boolean arg16, boolean arg17, int[] arg18, class157 arg19, boolean[] arg20, float[][] arg21) {
        field4138++;
        if (!arg17) {
            field4143 = (class258) null;
        }
        int var22 = (arg13 ? 255 : 0) + (arg10 << 8);
        int var23 = (arg6 << 8) + (arg16 ? 255 : 0);
        int var24 = (arg9 ? 255 : 0) + (arg11 << 8);
        int var25 = (arg5 << 8) + (arg0 ? 255 : 0);
        int[] var26 = new int[arg18.length / 2];
        for (int var27 = 0; var27 < var26.length; var27++) {
            int var28 = arg18[var27 + var27];
            int var29 = arg18[var27 + var27 + 1];
            int[][] var30 = arg3 == null || arg20 == null || !arg20[var27] ? arg14 : arg3;
            var26[var27] = class147.method1016(false, var23, var22, arg1, arg2, var30, var28, arg15, arg4, 2, var24, arg3, var29, arg12, arg19, var25, (float) arg8, arg21);
        }
        arg19.method1068(arg7, arg1, arg12, var26, (int[]) null, false);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIII)V", line = 93)
    public static final void method1630(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4137++;
        int var8 = arg0 + arg7;
        if (arg3 != 24126) {
            return;
        }
        int var9 = arg4 - arg7;
        int var10 = arg2 - arg7;
        for (int var11 = arg0; var11 < var8; var11++) {
            class19.method126(7, arg6, class154.field2638[var11], arg5, arg2);
        }
        int var12 = arg5 + arg7;
        for (int var13 = arg4; var13 > var9; var13--) {
            class19.method126(7, arg6, class154.field2638[var13], arg5, arg2);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class154.field2638[var14];
            class19.method126(7, arg6, var15, arg5, var12);
            class19.method126(arg3 - 24119, arg1, var15, var12, var10);
            class19.method126(arg3 - 24119, arg6, var15, var10, arg2);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 150)
    public static void method1631(int arg0) {
        field4139 = null;
        field4143 = null;
        field4146 = null;
        if (arg0 <= 66) {
            method1628((byte) 46, 69L);
        }
        field4145 = null;
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(B)V", line = 163)
    public static final void method1632(byte arg0) {
        field4148++;
        class60 var1 = new class60();
        for (int var2 = 0; var2 < 13; var2++) {
            for (int var3 = 0; var3 < 13; var3++) {
                class57.field899[var2][var3] = var1;
            }
        }
        int var4 = -66 / ((arg0 + 78) / 40);
    }
}
