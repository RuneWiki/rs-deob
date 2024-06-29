import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public abstract class class614 extends class551 {

    @OriginalMember(owner = "client!naa", name = "v", descriptor = "Z")
    public volatile boolean field9003 = true;

    @OriginalMember(owner = "client!naa", name = "t", descriptor = "[[I")
    public static int[][] field9001 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!naa", name = "s", descriptor = "I")
    public static int field9000 = 0;

    @OriginalMember(owner = "client!naa", name = "x", descriptor = "Lrk;")
    public static class419 field9005 = new class419();

    @OriginalMember(owner = "client!naa", name = "B", descriptor = "Lqu;")
    public static class364 field9009 = new class364(75, 3);

    @OriginalMember(owner = "client!naa", name = "A", descriptor = "I")
    public static int field9008;

    @OriginalMember(owner = "client!naa", name = "u", descriptor = "Z")
    public static boolean field9002;

    @OriginalMember(owner = "client!naa", name = "y", descriptor = "Z")
    public boolean field9006;

    @OriginalMember(owner = "client!naa", name = "z", descriptor = "Z")
    public boolean field9007;

    @OriginalMember(owner = "client!naa", name = "w", descriptor = "[I")
    public static int[] field9004;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "(B)V", line = 20)
    public static void method3573(byte arg0) {
        field9009 = null;
        if (arg0 > 54) {
            field9005 = null;
            field9004 = null;
            field9001 = null;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Lge;ILge;)V", line = 33)
    public static final void method3574(class551 arg0, int arg1, class551 arg2) {
        if (arg2.field8203 != null) {
            arg2.method3225(-54);
        }
        field9008++;
        arg2.field8211 = arg0.field8211;
        arg2.field8203 = arg0;
        arg2.field8203.field8211 = arg2;
        if (arg1 != -15952) {
            field9004 = null;
        }
        arg2.field8211.field8203 = arg2;
    }

    @OriginalMember(owner = "client!naa", name = "g", descriptor = "(I)[B")
    public abstract byte[] method1999(int arg0);

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)I")
    public abstract int method1997(byte arg0);
}
