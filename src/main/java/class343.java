import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class343 {

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "I")
    public static int field5286 = 0;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5292 = "Created gameworld";

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5291 = "Choose Option";

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "[Z")
    public static boolean[] field5284 = new boolean[8];

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "Ljava/lang/String;")
    public static String field5293 = "wave:";

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "[I")
    public static int[] field5290 = new int[5];

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public int field5288;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "Ljs;")
    public class180 field5289;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "[I")
    public int[] field5285;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "[[S")
    public static short[][] field5287;

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V")
    public static void method2249(int arg0) {
        field5287 = null;
        field5292 = null;
        field5290 = null;
        if (arg0 != 5) {
            method2249(31);
        }
        field5291 = null;
        field5293 = null;
        field5284 = null;
    }
}
