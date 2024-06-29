import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class689 extends class665 {

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "Z")
    public static boolean field9699 = false;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "Lkr;")
    public static class693 field9693 = new class693("runescape", 0);

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "J")
    public static long field9705 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field9706 = 0;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "Ldg;")
    public static class376 field9704 = new class376(49, 3);

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    public static int field9707 = -1;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
    public static int field9694;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public int field9698;

    @OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
    public int field9702;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "[I")
    public int[] field9692;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "[I")
    public int[] field9695;

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "[I")
    public int[] field9700;

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "[I")
    public static int[] field9703;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "[Lpga;")
    public class494[] field9697;

    @OriginalMember(owner = "client!hd", name = "t", descriptor = "[Lpga;")
    public class494[] field9701;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "[[[B")
    public byte[][][] field9696;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3795(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class15.field153 <= arg0 && arg2 <= class248.field3859 && arg5 >= class520.field7329 && arg6 <= class239.field3747) {
            if (arg1 == 1) {
                class600.method3395(arg6, arg3, arg5, arg0, arg2, arg4 + 17599);
            } else {
                class492.method2853(arg4 ^ 0xFFFFDC77, arg6, arg3, arg0, arg5, arg1, arg2);
            }
        } else if (arg1 == 1) {
            class497.method2871(arg5, arg0, arg2, arg3, arg6, (byte) 113);
        } else {
            class522.method3003(arg5, arg1, false, arg6, arg0, arg3, arg2);
        }
        field9694++;
        if (arg4 != -9101) {
            field9704 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static void method3796(int arg0) {
        field9704 = null;
        field9703 = null;
        field9693 = null;
        if (arg0 != 22089) {
            field9703 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)I")
    public static int method3797(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
