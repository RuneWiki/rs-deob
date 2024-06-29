import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class248 extends class103 {

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "[I")
    public int[] field4365 = new int[1];

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "[I")
    public int[] field4372 = new int[] { -1 };

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "Z")
    public static boolean field4367 = false;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "Lda;")
    private static class275 field4370 = class255.method1672(116, "Examine");

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "Lda;")
    public static class275 field4371 = class255.method1672(94, "Hidden)2");

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "Lda;")
    public static class275 field4368 = field4370;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "[S")
    public static short[] field4366;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "[[B")
    public static byte[][] field4369;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
    public static void method1626(int arg0) {
        field4371 = null;
        field4368 = null;
        if (arg0 < 85) {
            method1628((byte) 46, -104, 77);
        }
        field4366 = null;
        field4369 = null;
        field4370 = null;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)I")
    public static final int method1627(byte arg0) {
        field4364++;
        if (arg0 <= 53) {
            method1627((byte) -122);
        }
        return 6;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BII)I")
    public static final int method1628(byte arg0, int arg1, int arg2) {
        field4363++;
        int var3 = arg2 >> 31 & arg1 - 1;
        int var4 = -61 / ((arg0 + 37) / 40);
        return ((arg2 >>> 31) + arg2) % arg1 + var3;
    }
}
