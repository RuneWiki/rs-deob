import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class306 extends class335 {

    @OriginalMember(owner = "client!vd", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field4760 = new String[8];

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
    public static int field4763 = 0;

    @OriginalMember(owner = "client!vd", name = "M", descriptor = "Z")
    public static boolean field4758 = false;

    @OriginalMember(owner = "client!vd", name = "N", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!vd", name = "L", descriptor = "[[B")
    public static byte[][] field4757;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(II)[I", line = 6)
    public final int[] method149(int arg0, int arg1) {
        if (arg1 != 621) {
            field4757 = (byte[][]) ((byte[][]) null);
        }
        field4761++;
        return class90.field1437;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(II)V", line = 18)
    public static final void method2093(int arg0, int arg1) {
        field4762++;
        class235.field3745 = 1000 / arg0;
        if (arg1 != 0) {
            method2094((Object[]) null, (long[]) null, -38);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([Ljava/lang/Object;[JI)V", line = 31)
    public static final void method2094(Object[] arg0, long[] arg1, int arg2) {
        field4759++;
        class34.method286((byte) -63, arg0, 0, arg1.length - arg2, arg1);
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V", line = 39)
    public class306() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(Z)V", line = 43)
    public static void method2095(boolean arg0) {
        if (arg0) {
            field4760 = (String[]) null;
        }
        field4760 = null;
        field4757 = (byte[][]) null;
    }
}
