import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class303 {

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "[[[I")
    public static int[][][] field4207 = new int[2][][];

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "I")
    public static int field4208;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1836(int arg0, int arg1) {
        field4208++;
        class382 var2 = class396.method2276(arg0 ^ 0xFFFFFFFD, 3, arg1);
        if (arg0 != 0) {
            field4207 = null;
        }
        var2.method2228((byte) -55);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V", line = 21)
    public static void method1837(int arg0) {
        field4207 = null;
        if (arg0 != 0) {
            method1836(-10, -10);
        }
    }
}
