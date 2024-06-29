import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class486 extends class211 {

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "[[I")
    public static int[][] field7408 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "[Loa;")
    public static class471[] field7402 = new class471[0];

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public int field7401;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    public int field7404;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public int field7405;

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "I")
    public int field7409;

    @OriginalMember(owner = "client!hn", name = "t", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "Lta;")
    public class135 field7403;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "Lig;")
    public static class154 field7406;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "[I")
    public static int[] field7407;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lta;Z)V", line = 7)
    public static final void method2919(class135 arg0, boolean arg1) {
        field7410++;
        int var2 = arg0.field2144 - class369.field5424;
        int var3 = arg0.field2182 * 128 + (arg0.method337(0) * 64);
        int var4 = arg0.field2200 * 128 + (arg0.method337(0) * 64);
        arg0.field3218 += (var3 - arg0.field3218) / var2;
        arg0.field2233 = 0;
        arg0.field3222 += (var4 - arg0.field3222) / var2;
        if (arg0.field2181 == 0) {
            arg0.method896((byte) 13, 8192);
        }
        if (arg1) {
            return;
        }
        if (arg0.field2181 == 1) {
            arg0.method896((byte) 13, 12288);
        }
        if (arg0.field2181 == 2) {
            arg0.method896((byte) 13, 0);
        }
        if (arg0.field2181 == 3) {
            arg0.method896((byte) 13, 4096);
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V", line = 45)
    public static void method2920(int arg0) {
        field7407 = null;
        if (arg0 != 7) {
            method2920(-9);
        }
        field7406 = null;
        field7408 = null;
        field7402 = null;
    }
}
