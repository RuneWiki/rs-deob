import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class151 {

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "[Ljava/lang/String;")
    private String[] field2092;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field2081 = new String[100];

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "[B")
    public static byte[] field2080 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Lae;")
    public static class172 field2082 = null;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public static int field2091 = 100;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field2083;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field2085;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "[I")
    public static int[] field2084;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V", line = 20)
    public static void method1077(int arg0) {
        field2081 = null;
        field2080 = null;
        field2084 = null;
        field2082 = null;
        if (arg0 != 28021) {
            method1082(-6, 2);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Ljava/lang/String;", line = 40)
    public final String method1078(int arg0, int arg1) {
        field2089++;
        if (arg1 != 100) {
            field2080 = null;
        }
        return this.field2092[arg0];
    }

    @OriginalMember(owner = "client!ch", name = "toString", descriptor = "()Ljava/lang/String;", line = 54)
    public final String toString() {
        field2086++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lkj;BLkj;)V", line = 74)
    public static final void method1079(class47 arg0, byte arg1, class47 arg2) {
        field2090++;
        if (arg1 != 52) {
            method1079((class47) null, (byte) 117, (class47) null);
        }
        if (arg2.field718 != null) {
            arg2.method479((byte) -8);
        }
        arg2.field718 = arg0;
        arg2.field717 = arg0.field717;
        arg2.field718.field717 = arg2;
        arg2.field717.field718 = arg2;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BI)I", line = 110)
    public static final int method1080(byte arg0, int arg1) {
        if (arg0 != -77) {
            field2091 = 54;
        }
        field2087++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[S)[S", line = 128)
    public static final short[] method1081(int arg0, short[] arg1) {
        field2085++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class214.method1447(arg1, 0, var2, arg0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(II)V", line = 147)
    public static final void method1082(int arg0, int arg1) {
        field2083++;
        class334 var2 = class352.method2172(arg1, 5, 16711935);
        int var3 = -82 % ((32 - arg0) / 57);
        var2.method2099(true);
    }

    @OriginalMember(owner = "client!ch", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 207)
    public class151(String arg0, String arg1, String arg2, String arg3) {
        this.field2092 = new String[] { arg0, arg1, arg2, arg3 };
    }
}
