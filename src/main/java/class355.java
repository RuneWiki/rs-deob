import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class355 {

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "[[I")
    public static int[][] field5240 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "Z")
    public static boolean field5242 = false;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "F")
    public static float field5245;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Liq;")
    public static class134 field5241;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5247;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "[[[I")
    public static int[][][] field5243;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Lkn;")
    public static final class330 method2129(int arg0, int arg1) {
        if (arg0 != -4966) {
            method2129(-32, -23);
        }
        field5239++;
        class330 var2 = (class330) class327.field4918.method927((long) arg1, arg0 ^ 0x1308);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class280.field4290.method823(5, -20334, arg1);
        class330 var4 = new class330();
        if (var3 != null) {
            var4.method2030(true, new class385(var3));
        }
        class327.field4918.method929((long) arg1, var4, false);
        return var4;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V")
    public static void method2130(boolean arg0) {
        field5241 = null;
        field5243 = null;
        field5247 = null;
        if (arg0) {
            field5240 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static final void method2131(int arg0) {
        field5246++;
        if (arg0 == 6) {
            class414.field6154 = new class398();
        }
    }
}
