import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class24 {

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public int field312;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field310 = new String[200];

    @OriginalMember(owner = "client!o", name = "d", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Lpt;")
    public static class340 field311;

    @OriginalMember(owner = "client!o", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field313++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Z)V")
    public static void method168(boolean arg0) {
        if (arg0) {
            field310 = null;
        }
        field311 = null;
        field310 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BII)V")
    public static final void method169(byte arg0, int arg1, int arg2) {
        field315++;
        if (arg0 != -6) {
            field310 = null;
        }
        if (class78.method452(arg1, -3192)) {
            client.method1129(class112.field1421[arg1], arg2, arg0 ^ 0xFFFFFFFB);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIBI)Lja;")
    public static final class167 method170(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field318++;
        long var7 = (long) arg3 * 67481L ^ (long) arg1 * 97549L ^ (long) arg2 * 475427L ^ (long) arg4 * 986053L ^ (long) arg0 * 32147369L ^ (long) arg6 * 76724863L;
        class167 var9 = (class167) class277.field4082.method1479(0, var7);
        if (var9 != null) {
            return var9;
        } else if (arg5 == 35) {
            class167 var10 = class135.field1783.method689(arg3, arg1, arg2, arg4, arg0, arg6);
            class277.field4082.method1473(var10, var7, 117);
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IBZ)Ljava/lang/String;")
    public static final String method171(int arg0, byte arg1, boolean arg2) {
        if (arg1 != 88) {
            method172(-39);
        }
        field317++;
        return arg2 && arg0 >= 0 ? class103.method577(arg2, -1, arg0, 10) : Integer.toString(arg0);
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class24(String arg0, int arg1) {
        this.field312 = arg1;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static final void method172(int arg0) {
        field314++;
        if (class146.field2155 > 0) {
            class207.method1357((byte) -127);
        } else {
            class317.field4601 = class58.field761;
            class58.field761 = null;
            class211.method1368((byte) -117, arg0);
        }
    }
}
