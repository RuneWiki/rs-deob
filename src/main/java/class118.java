import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class118 extends class176 {

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "Ljava/lang/String;")
    public String field1939;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "Z")
    public static boolean field1936 = false;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field1937 = new String[5];

    @OriginalMember(owner = "client!fn", name = "u", descriptor = "I")
    public static int field1943 = -1;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "Lej;")
    public static class104 field1938 = new class104("glow1:", "leuchten1:", "brillant1:", "brilho1:");

    @OriginalMember(owner = "client!fn", name = "v", descriptor = "[I")
    public static int[] field1944 = new int[64];

    @OriginalMember(owner = "client!fn", name = "w", descriptor = "[[I")
    public static int[][] field1945 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "F")
    public static float field1935;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "[I")
    public static int[] field1940;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "[[[Lbo;")
    public static class622[][][] field1941;

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
    public class118() {
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(BI)I")
    public static final int method830(byte arg0, int arg1) {
        field1942++;
        if (arg0 != 79) {
            field1941 = null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
    public static void method831(int arg0) {
        field1940 = null;
        field1945 = null;
        field1941 = null;
        field1937 = null;
        if (arg0 == -30758) {
            field1938 = null;
            field1944 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class118(String arg0) {
        this.field1939 = arg0;
    }
}
