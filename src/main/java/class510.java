import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class510 {

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
    public int field7249 = class398.method2361((byte) 124);

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "Ljava/lang/String;")
    public String field7256;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
    public int field7248;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "Ljava/lang/String;")
    public String field7246;

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "I")
    public int field7254;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    public int field7247;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "Ljava/lang/String;")
    public String field7257;

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "Ljava/lang/String;")
    public String field7245;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
    public int field7251;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "Lada;")
    public static class144 field7255 = new class144(8, 14);

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "Lh;")
    public static class572 field7258 = new class572("Loaded shaders", "Shaders geladen", "Nuanceurs chargés", "Sombreamento carregado");

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "Z")
    public static boolean field7259 = false;

    @OriginalMember(owner = "client!kq", name = "q", descriptor = "Llb;")
    public static class465 field7260 = new class465(64);

    @OriginalMember(owner = "client!kq", name = "r", descriptor = "Llu;")
    public static class610 field7261 = new class610(36, 8);

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
    public static int field7252;

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
    public static int field7253;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIB)V", line = 3)
    public static final void method3034(int arg0, int arg1, byte arg2) {
        field7244++;
        class221 var3 = class65.method413(7, arg0, (byte) 112);
        var3.method1426((byte) -117);
        if (arg2 != -82) {
            field7259 = false;
        }
        var3.field3214 = arg1;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)V", line = 18)
    public static void method3035(boolean arg0) {
        field7261 = null;
        if (arg0) {
            field7258 = null;
            field7255 = null;
            field7260 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIIIII)V", line = 31)
    public static final void method3036(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field7253++;
        if (arg1 != 8) {
            field7255 = null;
        }
        if (arg0 == arg2) {
            class197.method1328(arg4, arg7, arg3, 14157, arg5, arg0, arg6);
        } else if (arg3 - arg0 >= class14.field136 && (arg0 + arg3) <= class130.field1801 && (arg5 - arg2) >= class3.field25 && (arg2 + arg5) <= class100.field1452) {
            class607.method3570(arg7, arg0, arg5, 21893, arg6, arg4, arg2, arg3);
        } else {
            class134.method922(arg2, arg3, arg0, arg7, arg4, arg5, arg6, 109);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(BI)V", line = 59)
    public static final void method3037(byte arg0, int arg1) {
        class391.field5386 = 1000000000L / (long) arg1;
        if (arg0 <= 82) {
            method3035(true);
        }
        field7250++;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", line = 82)
    public final void method3038(int arg0, int arg1, String arg2, String arg3, String arg4, int arg5, int arg6, String arg7) {
        field7252++;
        this.field7249 = class398.method2361((byte) 116);
        this.field7247 = class617.field9123;
        this.field7245 = arg2;
        this.field7246 = arg3;
        this.field7256 = arg7;
        this.field7248 = arg5;
        this.field7254 = arg6;
        this.field7257 = arg4;
        this.field7251 = arg1;
        if (arg0 != 7) {
            field7260 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", line = 103)
    public class510(int arg0, int arg1, String arg2, String arg3, String arg4, int arg5, String arg6) {
        this.field7256 = arg4;
        this.field7248 = arg1;
        this.field7246 = arg6;
        this.field7254 = arg0;
        this.field7247 = class617.field9123;
        this.field7257 = arg3;
        this.field7245 = arg2;
        this.field7251 = arg5;
    }
}
