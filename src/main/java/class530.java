import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class530 {

    @OriginalMember(owner = "client!cm", name = "d", descriptor = "I")
    public int field7402 = class548.method3027(65535);

    @OriginalMember(owner = "client!cm", name = "l", descriptor = "I")
    public int field7410;

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "I")
    public int field7401;

    @OriginalMember(owner = "client!cm", name = "i", descriptor = "Ljava/lang/String;")
    public String field7407;

    @OriginalMember(owner = "client!cm", name = "n", descriptor = "I")
    public int field7412;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "Ljava/lang/String;")
    public String field7399;

    @OriginalMember(owner = "client!cm", name = "e", descriptor = "I")
    public int field7403;

    @OriginalMember(owner = "client!cm", name = "k", descriptor = "Ljava/lang/String;")
    public String field7409;

    @OriginalMember(owner = "client!cm", name = "g", descriptor = "Ljava/lang/String;")
    public String field7405;

    @OriginalMember(owner = "client!cm", name = "f", descriptor = "[[B")
    public static byte[][] field7404 = new byte[1000][];

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "I")
    public static int field7400 = 0;

    @OriginalMember(owner = "client!cm", name = "j", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!cm", name = "m", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!cm", name = "h", descriptor = "Ljava/lang/Object;")
    public static Object field7406;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;BLjava/lang/String;Ljava/lang/String;)V")
    public final void method2955(String arg0, int arg1, int arg2, int arg3, String arg4, byte arg5, String arg6, String arg7) {
        field7408++;
        this.field7402 = class548.method3027(65535);
        this.field7410 = arg2;
        this.field7412 = class7.field61;
        this.field7409 = arg4;
        this.field7403 = arg1;
        this.field7407 = arg6;
        this.field7399 = arg7;
        this.field7405 = arg0;
        this.field7401 = arg3;
        if (arg5 >= -8) {
            method2956((byte) 15);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V")
    public static final void method2956(byte arg0) {
        class387.field5384 = null;
        class604.field8712 = null;
        class106.field1370 = null;
        class480.field6728 = null;
        class646.field9353 = null;
        if (arg0 != -86) {
            method2956((byte) 91);
        }
        field7411++;
        class233.field2980 = null;
        class239.field3057 = null;
        class173.field2243 = null;
        class600.field8678 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)V")
    public static void method2957(int arg0) {
        field7404 = null;
        if (arg0 != 5325) {
            method2957(84);
        }
        field7406 = null;
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class530(int arg0, int arg1, String arg2, String arg3, String arg4, int arg5, String arg6) {
        this.field7410 = arg0;
        this.field7401 = arg5;
        this.field7407 = arg3;
        this.field7412 = class7.field61;
        this.field7399 = arg4;
        this.field7403 = arg1;
        this.field7409 = arg2;
        this.field7405 = arg6;
    }
}
