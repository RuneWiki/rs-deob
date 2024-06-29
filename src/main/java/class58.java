import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class58 {

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "[I")
    public static int[] field916 = new int[500];

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "[I")
    public static int[] field918 = new int[2048];

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "[S")
    public static short[] field911 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "[I")
    public static int[] field913 = new int[14];

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "Z")
    public static boolean field914 = true;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Ljava/lang/String;")
    public static String field912 = "slide:";

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "Lpf;")
    public static class294 field917;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "[[Z")
    public static boolean[][] field915;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static void method388(int arg0) {
        field916 = null;
        field917 = null;
        field915 = null;
        field913 = null;
        if (arg0 != 4550) {
            method388(-98);
        }
        field912 = null;
        field911 = null;
        field918 = null;
    }
}
