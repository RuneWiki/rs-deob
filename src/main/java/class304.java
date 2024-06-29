import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public class class304 extends class388 {

    @OriginalMember(owner = "client!ip", name = "D", descriptor = "J")
    public long field4156;

    @OriginalMember(owner = "client!ip", name = "s", descriptor = "I")
    public int field4146;

    @OriginalMember(owner = "client!ip", name = "G", descriptor = "I")
    public int field4159;

    @OriginalMember(owner = "client!ip", name = "F", descriptor = "Ljava/lang/String;")
    public String field4158;

    @OriginalMember(owner = "client!ip", name = "x", descriptor = "Ljava/lang/String;")
    public String field4151;

    @OriginalMember(owner = "client!ip", name = "E", descriptor = "Z")
    public boolean field4157;

    @OriginalMember(owner = "client!ip", name = "A", descriptor = "Z")
    public boolean field4154;

    @OriginalMember(owner = "client!ip", name = "t", descriptor = "I")
    public int field4147;

    @OriginalMember(owner = "client!ip", name = "w", descriptor = "I")
    public int field4150;

    @OriginalMember(owner = "client!ip", name = "r", descriptor = "Z")
    public boolean field4145;

    @OriginalMember(owner = "client!ip", name = "z", descriptor = "J")
    public long field4153;

    @OriginalMember(owner = "client!ip", name = "y", descriptor = "I")
    public int field4152;

    @OriginalMember(owner = "client!ip", name = "u", descriptor = "[I")
    public static int[] field4148 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ip", name = "v", descriptor = "Llc;")
    public static class435 field4149 = new class435(14, 3);

    @OriginalMember(owner = "client!ip", name = "B", descriptor = "I")
    public static int field4155 = -1;

    @OriginalMember(owner = "client!ip", name = "H", descriptor = "Ljava/lang/String;")
    public String field4160;

    @OriginalMember(owner = "client!ip", name = "a", descriptor = "(B)V")
    public static void method1896(byte arg0) {
        field4149 = null;
        int var1 = -54 % ((arg0 + 31) / 51);
        field4148 = null;
    }

    @OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
    public class304(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        this.field4156 = arg5;
        this.field4146 = arg6;
        this.field4159 = arg7;
        this.field4158 = arg1;
        this.field4151 = arg0;
        this.field4157 = arg11;
        this.field4154 = arg9;
        this.field4147 = arg4;
        this.field4150 = arg2;
        this.field4145 = arg8;
        this.field4153 = arg10;
        this.field4152 = arg3;
    }
}
