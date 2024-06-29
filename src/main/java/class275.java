import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class275 extends class281 {

    @OriginalMember(owner = "client!oba", name = "B", descriptor = "I")
    public int field4077;

    @OriginalMember(owner = "client!oba", name = "y", descriptor = "Z")
    public boolean field4074;

    @OriginalMember(owner = "client!oba", name = "I", descriptor = "I")
    public int field4083;

    @OriginalMember(owner = "client!oba", name = "A", descriptor = "I")
    public int field4076;

    @OriginalMember(owner = "client!oba", name = "K", descriptor = "I")
    public int field4085;

    @OriginalMember(owner = "client!oba", name = "N", descriptor = "J")
    public long field4087;

    @OriginalMember(owner = "client!oba", name = "F", descriptor = "I")
    public int field4080;

    @OriginalMember(owner = "client!oba", name = "J", descriptor = "Ljava/lang/String;")
    public String field4084;

    @OriginalMember(owner = "client!oba", name = "D", descriptor = "J")
    public long field4079;

    @OriginalMember(owner = "client!oba", name = "C", descriptor = "Ljava/lang/String;")
    public String field4078;

    @OriginalMember(owner = "client!oba", name = "G", descriptor = "Z")
    public boolean field4081;

    @OriginalMember(owner = "client!oba", name = "x", descriptor = "Z")
    public boolean field4073;

    @OriginalMember(owner = "client!oba", name = "z", descriptor = "Ljw;")
    public static class581 field4075 = new class581(19, 10);

    @OriginalMember(owner = "client!oba", name = "P", descriptor = "Lmga;")
    public static class739 field4089 = new class739(81, 2);

    @OriginalMember(owner = "client!oba", name = "Q", descriptor = "I")
    public static int field4090 = -2;

    @OriginalMember(owner = "client!oba", name = "M", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!oba", name = "H", descriptor = "Ljava/lang/String;")
    public String field4082;

    @OriginalMember(owner = "client!oba", name = "O", descriptor = "Ljava/lang/String;")
    public static String field4088;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(I)V", line = 7)
    public static void method1785(int arg0) {
        if (arg0 == -12281) {
            field4088 = null;
            field4075 = null;
            field4089 = null;
        }
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V", line = 39)
    public class275(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        this.field4077 = arg7;
        this.field4074 = arg9;
        this.field4083 = arg2;
        this.field4076 = arg6;
        this.field4085 = arg4;
        this.field4087 = arg10;
        this.field4080 = arg3;
        this.field4084 = arg1;
        this.field4079 = arg5;
        this.field4078 = arg0;
        this.field4081 = arg8;
        this.field4073 = arg11;
    }
}
