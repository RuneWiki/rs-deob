import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class32 {

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field746 = 0;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Le;")
    public static class29 field745 = new class29(20);

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "Z")
    public static boolean field753 = false;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "Lu;")
    private static class135 field754 = class87.method676((byte) -51, "Cancel");

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field749 = 0;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "Lu;")
    public static class135 field756 = field754;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "Lu;")
    public static class135 field755 = class87.method676((byte) -93, "redstone1");

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "Le;")
    public static class29 field757 = new class29(260);

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "Lu;")
    public static class135 field758 = class87.method676((byte) -59, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field760 = 0;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "[Lbc;")
    public static class11[] field752;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "[[I")
    public static int[][] field759;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method257(int arg0) {
        field758 = null;
        field752 = null;
        field754 = null;
        if (arg0 != 0) {
            return;
        }
        field756 = null;
        field755 = null;
        field759 = null;
        field757 = null;
        field745 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILve;)Lu;")
    public static final class135 method258(int arg0, int arg1, class146 arg2) {
        if (arg0 != 0) {
            return null;
        }
        field744++;
        if (!class77.method614(class23.method196(arg2, (byte) -128), arg0 + 20809, arg1)) {
            return null;
        } else if (arg2.field3577 == null || arg2.field3577.length <= arg1 || arg2.field3577[arg1] == null || arg2.field3577[arg1].method1086((byte) -122).method1063(-64) == 0) {
            return class82.field1920 ? class107.method867(2, new class135[] { class133.field3209, class68.method547(-1, arg1) }) : null;
        } else {
            return arg2.field3577[arg1];
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method259(int arg0, int arg1) {
        field748++;
        if (arg0 == 100 && class139.field3388 > 0) {
            byte[] var2 = class1.field2[--class139.field3388];
            class1.field2[class139.field3388] = null;
            return var2;
        } else if (arg0 == 5000 && class3.field94 > 0) {
            byte[] var3 = class131.field3149[--class3.field94];
            class131.field3149[class3.field94] = null;
            return var3;
        } else if (arg0 == 30000 && class14.field343 > 0) {
            byte[] var4 = class97.field2359[--class14.field343];
            class97.field2359[class14.field343] = null;
            return var4;
        } else {
            if (arg1 >= -1) {
                method260(true, -99, null, null, null, 19, 29);
            }
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZILu;Lg;Lu;II)V")
    public static final void method260(boolean arg0, int arg1, class135 arg2, class43 arg3, class135 arg4, int arg5, int arg6) {
        field747++;
        int var7 = arg3.method317((byte) 13, arg4);
        int var8 = arg3.method340(var7, (byte) 37, arg2);
        class55.method426(arg0, arg3, (byte) 105, var8, var7, arg5, arg6);
        if (arg1 >= -58) {
            method257(-127);
        }
    }
}
