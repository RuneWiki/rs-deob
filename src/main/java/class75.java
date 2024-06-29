import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class75 extends class152 {

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "I")
    public int field1029;

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "Ljava/lang/String;")
    public String field1028;

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "Z")
    public boolean field1031;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
    public int field1025;

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "I")
    public int field1032;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "J")
    public long field1024;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "J")
    public long field1027;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "Z")
    public boolean field1023;

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
    public int field1030;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "I")
    public int field1036;

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "Z")
    public boolean field1033;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "Ljava/lang/String;")
    public String field1026;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "Lhj;")
    public static class596 field1034 = new class596(84, 6);

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "Lei;")
    public static class191 field1039 = new class191();

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "[I")
    public static int[] field1040 = new int[2048];

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "Ljava/lang/String;")
    public String field1035;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field1041;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V", line = 10)
    public static void method696(int arg0) {
        if (arg0 == 2048) {
            field1039 = null;
            field1034 = null;
            field1040 = null;
            field1041 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V", line = 35)
    public class75(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        this.field1029 = arg3;
        this.field1028 = arg1;
        this.field1031 = arg11;
        this.field1025 = arg2;
        this.field1032 = arg4;
        this.field1024 = arg10;
        this.field1027 = arg5;
        this.field1023 = arg8;
        this.field1030 = arg6;
        this.field1036 = arg7;
        this.field1033 = arg9;
        this.field1026 = arg0;
    }
}
