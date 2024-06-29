import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class630 {

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "Z")
    public static boolean field8463 = false;

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "Lst;")
    public static class335 field8465 = new class335(49, 2);

    @OriginalMember(owner = "client!nca", name = "e", descriptor = "Z")
    public static boolean field8467 = false;

    @OriginalMember(owner = "client!nca", name = "f", descriptor = "[[I")
    public static int[][] field8468 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "I")
    public static int field8464;

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "Lsg;")
    public static class17 field8466;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)V")
    public static void method3539(int arg0) {
        field8466 = null;
        field8468 = null;
        int var1 = 122 % ((arg0 + 46) / 38);
        field8465 = null;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IZIBILuu;I)V")
    public static final void method3540(int arg0, boolean arg1, int arg2, byte arg3, int arg4, class237 arg5, int arg6) {
        class217.field2826 = 1;
        class202.field2679 = arg1;
        if (arg3 < 103) {
            field8466 = null;
        }
        class438.field6107 = arg6;
        class524.field7281 = arg5;
        class123.field1689 = null;
        class459.field6373 = arg0;
        class517.field7221 = arg2;
        field8464++;
        class720.field10022 = arg4;
    }
}
