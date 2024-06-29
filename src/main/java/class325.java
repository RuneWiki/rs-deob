import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class325 extends class627 {

    @OriginalMember(owner = "client!ww", name = "p", descriptor = "Lqfa;")
    public static class371 field4143 = new class371();

    @OriginalMember(owner = "client!ww", name = "s", descriptor = "I")
    public static int field4146 = 4;

    @OriginalMember(owner = "client!ww", name = "j", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!ww", name = "k", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!ww", name = "l", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!ww", name = "m", descriptor = "I")
    public int field4140;

    @OriginalMember(owner = "client!ww", name = "u", descriptor = "I")
    public int field4148;

    @OriginalMember(owner = "client!ww", name = "n", descriptor = "[I")
    public int[] field4141;

    @OriginalMember(owner = "client!ww", name = "q", descriptor = "[I")
    public int[] field4144;

    @OriginalMember(owner = "client!ww", name = "v", descriptor = "[I")
    public int[] field4149;

    @OriginalMember(owner = "client!ww", name = "o", descriptor = "[Lwp;")
    public class435[] field4142;

    @OriginalMember(owner = "client!ww", name = "r", descriptor = "[Lwp;")
    public class435[] field4145;

    @OriginalMember(owner = "client!ww", name = "t", descriptor = "[[[B")
    public byte[][][] field4147;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(II)V")
    public static final void method1917(int arg0, int arg1) {
        field4138++;
        if (class44.field661 == null || class44.field661.length < arg0) {
            class44.field661 = new int[arg0];
        }
        int var2 = -108 % ((arg1 + 21) / 58);
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lvm;Lkha;Lnl;ILkha;Lkha;)Z")
    public static final boolean method1918(class208 arg0, class687 arg1, class681 arg2, int arg3, class687 arg4, class687 arg5) {
        if (arg3 != -955) {
            method1920((byte) 77);
        }
        class274.field3469 = arg0;
        class214.field2715 = arg1;
        class224.field2965 = arg5;
        field4137++;
        class154.field1871 = arg4;
        class551.field7752 = new int[16];
        class106.field1297 = arg2;
        for (int var6 = 0; var6 < 16; var6++) {
            class551.field7752[var6] = 255;
        }
        return true;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1919(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4139++;
        int var8 = arg2 + arg5;
        int var9 = arg4 - arg5;
        if (arg7 != -17) {
            return;
        }
        for (int var10 = arg2; var10 < var8; var10++) {
            class284.method1709(class15.field220[var10], arg1, -8251, arg6, arg3);
        }
        int var11 = arg1 - arg5;
        for (int var12 = arg4; var12 > var9; var12--) {
            class284.method1709(class15.field220[var12], arg1, -8251, arg6, arg3);
        }
        int var13 = arg6 + arg5;
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class15.field220[var14];
            class284.method1709(var15, var13, arg7 ^ 0x202A, arg6, arg3);
            class284.method1709(var15, var11, -8251, var13, arg0);
            class284.method1709(var15, arg1, -8251, var11, arg3);
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)V")
    public static void method1920(byte arg0) {
        if (arg0 < 24) {
            field4143 = null;
        }
        field4143 = null;
    }
}
