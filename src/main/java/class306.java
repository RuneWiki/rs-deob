import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class306 {

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field4980 = 0;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Ljava/lang/String;")
    public static String field4977 = "Loaded textures";

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field4974 = new String[100];

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field4976 = 0;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "[I")
    public static int[] field4982 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4983 = "";

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "[[[B")
    public static byte[][][] field4975;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V", line = 6)
    public static void method2233(int arg0) {
        if (arg0 < 92) {
            return;
        }
        field4975 = (byte[][][]) null;
        field4983 = null;
        field4974 = null;
        field4977 = null;
        field4982 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V", line = 22)
    public static final void method2234(int arg0, int arg1) {
        field4978++;
        class338.field5355.method896(arg0, (byte) -101);
        class191.field3242.method896(arg0, (byte) -38);
        if (arg1 != 0) {
            field4982 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)V", line = 51)
    public static final void method2235(int arg0, int arg1, int arg2) {
        field4979++;
        class199 var3 = class173.method1231(false, arg0, arg2);
        var3.method1367((byte) 106);
        var3.field3338 = arg1;
    }
}
