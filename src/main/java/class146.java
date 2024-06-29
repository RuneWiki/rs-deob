import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class146 extends class35 {

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public int field2056;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "J")
    public long field2066;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public int field2058;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public int field2061;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "Ljava/lang/String;")
    public String field2064;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "Z")
    public boolean field2060;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "Ljava/lang/String;")
    public String field2062;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public int field2057;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public int field2068;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "Z")
    public boolean field2059;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "[I")
    public static int[] field2067 = new int[256];

    @OriginalMember(owner = "client!se", name = "v", descriptor = "[S")
    public static short[] field2065 = new short[256];

    @OriginalMember(owner = "client!se", name = "t", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "Lcp;")
    public static class481 field2055;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIIIZ)Z")
    public static final boolean method992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field2063++;
        if (arg4 >= arg0 + arg2 || (arg3 + arg4) <= arg2) {
            return false;
        } else if (arg5 < arg6 + arg7 && (arg1 + arg5) > arg6) {
            if (arg8) {
                method993(19);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!se", name = "d", descriptor = "(I)V")
    public static void method993(int arg0) {
        if (arg0 <= 53) {
            method993(126);
        }
        field2067 = null;
        field2055 = null;
        field2065 = null;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZ)V")
    public class146(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9) {
        this.field2056 = arg3;
        this.field2066 = arg5;
        this.field2058 = arg7;
        this.field2061 = arg6;
        this.field2064 = arg1;
        this.field2060 = arg9;
        this.field2062 = arg0;
        this.field2057 = arg4;
        this.field2068 = arg2;
        this.field2059 = arg8;
    }
}
