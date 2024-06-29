import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class393 {

    @OriginalMember(owner = "client!hea", name = "m", descriptor = "I")
    public int field5183 = class344.method2067((byte) 0);

    @OriginalMember(owner = "client!hea", name = "g", descriptor = "I")
    public int field5177;

    @OriginalMember(owner = "client!hea", name = "i", descriptor = "Ljava/lang/String;")
    public String field5179;

    @OriginalMember(owner = "client!hea", name = "j", descriptor = "I")
    public int field5180;

    @OriginalMember(owner = "client!hea", name = "f", descriptor = "Ljava/lang/String;")
    public String field5176;

    @OriginalMember(owner = "client!hea", name = "h", descriptor = "Ljava/lang/String;")
    public String field5178;

    @OriginalMember(owner = "client!hea", name = "o", descriptor = "Ljava/lang/String;")
    public String field5185;

    @OriginalMember(owner = "client!hea", name = "q", descriptor = "Ljava/lang/String;")
    public String field5187;

    @OriginalMember(owner = "client!hea", name = "p", descriptor = "I")
    public int field5186;

    @OriginalMember(owner = "client!hea", name = "n", descriptor = "I")
    public int field5184;

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "I")
    public static int field5173 = -1;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "Z")
    public static boolean field5171 = false;

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "I")
    public static int field5172 = -1;

    @OriginalMember(owner = "client!hea", name = "d", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!hea", name = "e", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!hea", name = "k", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!hea", name = "l", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)Ljd;")
    public static final class214 method2257(int arg0) {
        if (arg0 != -32159) {
            return null;
        }
        field5181++;
        try {
            return (class214) Class.forName("tea").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIB)I")
    public static final int method2258(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 < 9) {
            field5172 = 127;
        }
        int var4 = arg1 & 0x3;
        field5174++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V")
    public final void method2259(int arg0, int arg1, String arg2, String arg3, String arg4, int arg5, String arg6, String arg7, int arg8) {
        field5182++;
        this.field5183 = class344.method2067((byte) -125);
        this.field5176 = arg4;
        this.field5180 = class642.field8626;
        this.field5179 = arg2;
        this.field5178 = arg6;
        this.field5184 = arg5;
        this.field5177 = arg8;
        if (arg1 == -26475) {
            this.field5186 = arg0;
            this.field5185 = arg3;
            this.field5187 = arg7;
        }
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class393(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field5177 = arg1;
        this.field5179 = arg7;
        this.field5180 = class642.field8626;
        this.field5176 = arg5;
        this.field5178 = arg2;
        this.field5185 = arg4;
        this.field5187 = arg3;
        this.field5186 = arg0;
        this.field5184 = arg6;
    }
}
