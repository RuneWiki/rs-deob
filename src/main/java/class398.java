import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class398 implements class515 {

    @OriginalMember(owner = "client!mea", name = "l", descriptor = "I")
    public int field5055;

    @OriginalMember(owner = "client!mea", name = "r", descriptor = "Lpd;")
    public class241 field5061;

    @OriginalMember(owner = "client!mea", name = "k", descriptor = "I")
    public int field5054;

    @OriginalMember(owner = "client!mea", name = "b", descriptor = "I")
    public int field5045;

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "I")
    public int field5046;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
    public int field5044;

    @OriginalMember(owner = "client!mea", name = "e", descriptor = "Ljava/lang/String;")
    public String field5048;

    @OriginalMember(owner = "client!mea", name = "s", descriptor = "I")
    public int field5062;

    @OriginalMember(owner = "client!mea", name = "h", descriptor = "I")
    public int field5051;

    @OriginalMember(owner = "client!mea", name = "d", descriptor = "I")
    public int field5047;

    @OriginalMember(owner = "client!mea", name = "g", descriptor = "Ltl;")
    public class580 field5050;

    @OriginalMember(owner = "client!mea", name = "n", descriptor = "I")
    public int field5057;

    @OriginalMember(owner = "client!mea", name = "j", descriptor = "I")
    public int field5053;

    @OriginalMember(owner = "client!mea", name = "p", descriptor = "I")
    public static int field5059 = 0;

    @OriginalMember(owner = "client!mea", name = "f", descriptor = "Lvf;")
    public static class141 field5049 = new class141(10, 2, 2, 0);

    @OriginalMember(owner = "client!mea", name = "t", descriptor = "I")
    public static int field5063 = 0;

    @OriginalMember(owner = "client!mea", name = "m", descriptor = "F")
    public static float field5056;

    @OriginalMember(owner = "client!mea", name = "i", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!mea", name = "o", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!mea", name = "q", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 20)
    public static final int method2250(String arg0, boolean arg1) {
        field5060++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1) {
            method2252(34, 114);
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class648.method3614(arg0.charAt(var4), (byte) -97) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(I)V", line = 43)
    public static void method2251(int arg0) {
        field5049 = null;
        if (arg0 != 10) {
            field5049 = null;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(II)Z", line = 54)
    public static final boolean method2252(int arg0, int arg1) {
        if (arg1 != 2) {
            method2252(104, 12);
        }
        field5058++;
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(B)Ljd;", line = 69)
    public final class216 method20(byte arg0) {
        field5052++;
        int var2 = 114 % ((-arg0 - 27) / 42);
        return class677.field9226;
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Ljava/lang/String;Ltl;Lpd;IIIIIIIIII)V", line = 84)
    public class398(String arg0, class580 arg1, class241 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        this.field5055 = arg4;
        this.field5061 = arg2;
        this.field5054 = arg6;
        this.field5045 = arg9;
        this.field5046 = arg12;
        this.field5044 = arg10;
        this.field5048 = arg0;
        this.field5062 = arg11;
        this.field5051 = arg5;
        this.field5047 = arg8;
        this.field5050 = arg1;
        this.field5057 = arg3;
        this.field5053 = arg7;
    }
}
