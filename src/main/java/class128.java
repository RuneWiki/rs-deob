import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class128 extends class369 {

    @OriginalMember(owner = "client!di", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field2162 = new String[200];

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field2165;

    @OriginalMember(owner = "client!di", name = "k", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!di", name = "l", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!di", name = "m", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!di", name = "n", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!di", name = "o", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 4)
    public final void method371(int arg0) {
        if (arg0 < -75) {
            super.field5255.method347(false, (byte) -61);
            ++field2168;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/lang/String;IBILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 15)
    public static final void method1064(String arg0, int arg1, byte arg2, int arg3, String arg4, String arg5, String arg6) {
        class8.method48(arg0, arg4, (byte) -110, -1, arg5, (String) null, arg1, arg3, arg6);
        ++field2160;
        if (arg2 >= -86) {
            field2162 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lqo;)V", line = 32)
    public class128(class22 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(I)V", line = 35)
    public static final void method1065(int arg0) {
        ++field2167;
        ++class654.field8971;
        class564 var1 = class227.method1594(class241.field3517, class72.field1320, -124);
        var1.field7778.method1526(false, class324.method2072(-96));
        var1.field7778.method1485((byte) 107, class467.field6559);
        var1.field7778.method1485((byte) 107, class582.field7968);
        if (arg0 != -24498) {
            field2162 = null;
        }
        var1.field7778.method1526(false, class693.field9368.field4445.method1857(-32350));
        class167.method1260(-101, var1);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lud;BI)V", line = 53)
    public final void method373(class36 arg0, byte arg1, int arg2) {
        ++field2163;
        super.field5255.method256((byte) -80, arg0);
        if (arg1 >= -89) {
            this.method372(-67, -39, (byte) 18);
        }
        super.field5255.method237(0, arg2);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V", line = 65)
    public static final void method1066(byte arg0) {
        int var1 = 34 % ((arg0 - 32) / 38);
        ++field2170;
        class634.method3616((byte) -48);
        class311.field4321 = false;
        class633.method3613(class106.field1869, class565.field7788, class749.field10379, 0, class469.field6575);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIB)V", line = 80)
    public final void method372(int arg0, int arg1, byte arg2) {
        ++field2166;
        if (arg2 > -42) {
            this.method371(35);
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)Z", line = 92)
    public final boolean method368(int arg0) {
        ++field2165;
        if (arg0 > -5) {
            field2169 = 1;
        }
        return true;
    }

    @OriginalMember(owner = "client!di", name = "f", descriptor = "(I)V", line = 104)
    public static void method1067(int arg0) {
        if (arg0 != -1) {
            field2169 = -79;
        }
        field2162 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZZ)V", line = 114)
    public final void method369(boolean arg0, boolean arg1) {
        super.field5255.method347(true, (byte) -83);
        if (arg1) {
            this.method372(-78, 73, (byte) 12);
        }
        ++field2161;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZB)V", line = 128)
    public final void method366(boolean arg0, byte arg1) {
        int var3 = 23 / ((-60 - arg1) / 38);
        ++field2164;
    }
}
