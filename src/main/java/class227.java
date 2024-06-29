import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class227 extends class392 {

    @OriginalMember(owner = "client!em", name = "E", descriptor = "J")
    public long field2949;

    @OriginalMember(owner = "client!em", name = "A", descriptor = "I")
    public int field2946;

    @OriginalMember(owner = "client!em", name = "y", descriptor = "I")
    public int field2944;

    @OriginalMember(owner = "client!em", name = "G", descriptor = "I")
    public int field2951;

    @OriginalMember(owner = "client!em", name = "F", descriptor = "Ljava/lang/String;")
    public String field2950;

    @OriginalMember(owner = "client!em", name = "D", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!em", name = "v", descriptor = "Z")
    public boolean field2941;

    @OriginalMember(owner = "client!em", name = "w", descriptor = "Z")
    public boolean field2942;

    @OriginalMember(owner = "client!em", name = "B", descriptor = "Z")
    public boolean field2947;

    @OriginalMember(owner = "client!em", name = "z", descriptor = "J")
    public long field2945;

    @OriginalMember(owner = "client!em", name = "I", descriptor = "I")
    public int field2953;

    @OriginalMember(owner = "client!em", name = "H", descriptor = "Ljava/lang/String;")
    public String field2952;

    @OriginalMember(owner = "client!em", name = "J", descriptor = "Lea;")
    public static class547 field2954 = new class547(30, -1);

    @OriginalMember(owner = "client!em", name = "x", descriptor = "Ljava/lang/String;")
    public String field2943;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)V")
    public static void method1350(boolean arg0) {
        field2954 = null;
        if (!arg0) {
            field2954 = null;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
    public class227(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        this.field2949 = arg10;
        this.field2946 = arg4;
        this.field2944 = arg2;
        this.field2951 = arg7;
        this.field2950 = arg1;
        this.field2948 = arg3;
        this.field2941 = arg9;
        this.field2942 = arg8;
        this.field2947 = arg11;
        this.field2945 = arg5;
        this.field2953 = arg6;
        this.field2952 = arg0;
    }
}
