import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public abstract class class175 {

    @OriginalMember(owner = "client!go", name = "a", descriptor = "[Z")
    public static boolean[] field2194 = new boolean[100];

    @OriginalMember(owner = "client!go", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2196 = "Take";

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lvm;Lfd;B)V")
    public static final void method923(class322 arg0, class194 arg1, byte arg2) {
        class105.method561(arg1, arg0, 0, true, 0);
        field2195++;
        if (arg2 < 51) {
            field2194 = null;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
    public static void method924(int arg0) {
        field2194 = null;
        field2196 = null;
        if (arg0 > -123) {
            field2196 = null;
        }
    }
}
