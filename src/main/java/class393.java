import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class393 implements class318 {

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "Z")
    public boolean field5332;

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
    public int field5338;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public int field5328;

    @OriginalMember(owner = "client!ur", name = "n", descriptor = "Ldba;")
    public class240 field5340;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
    public int field5330;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    public int field5331;

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "Lpa;")
    public class648 field5336;

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "I")
    public int field5337;

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "I")
    public int field5339;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
    public int field5327;

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "I")
    public int field5335;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    public static int field5329;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(B)Ljava/lang/String;", line = 13)
    public static final String method2230(byte arg0) {
        if (arg0 > -30) {
            return null;
        } else {
            field5329++;
            return class188.field2148 || class348.field4664 == null ? "" : class348.field4664.field4225;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)Lib;", line = 30)
    public final class14 method203(byte arg0) {
        field5333++;
        return arg0 == -92 ? class365.field4897 : null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 47)
    public static final String method2231(int arg0, String arg1, String arg2, String arg3) {
        field5334++;
        if (arg0 <= 5) {
            return null;
        } else {
            for (int var4 = arg3.indexOf(arg2); var4 != -1; var4 = arg3.indexOf(arg2, arg1.length() + var4)) {
                arg3 = arg3.substring(0, var4) + arg1 + arg3.substring(var4 + arg2.length());
            }
            return arg3;
        }
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(ILdba;Lpa;IIIIIIIZ)V", line = 65)
    public class393(int arg0, class240 arg1, class648 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field5332 = arg10;
        this.field5338 = arg7;
        this.field5328 = arg9;
        this.field5340 = arg1;
        this.field5330 = arg8;
        this.field5331 = arg4;
        this.field5336 = arg2;
        this.field5337 = arg5;
        this.field5339 = arg3;
        this.field5327 = arg6;
        this.field5335 = arg0;
    }
}
