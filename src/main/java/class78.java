import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public abstract class class78 {

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "[I")
    public static int[] field1065 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "[[Z")
    public static boolean[][] field1067 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 17)
    public static final int method513(String arg0, int arg1) {
        field1066++;
        if (arg1 <= 117) {
            return -36;
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class227.method1559((byte) -79, arg0.charAt(var4)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 41)
    public static void method514(int arg0) {
        field1065 = null;
        field1067 = null;
        if (arg0 != -11032) {
            method514(-84);
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Lck;I)Lck;")
    public abstract class156 method512(class156 arg0, int arg1);
}
