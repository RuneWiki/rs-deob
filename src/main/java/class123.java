import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class123 extends class29 {

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "Ljn;")
    public class256 field2069;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "Lph;")
    public static class229 field2067 = class266.method1858("compass", 0);

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "Lph;")
    public static class229 field2070 = class266.method1858("showingVideoAd", 0);

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "Lsi;")
    public static class66 field2066;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIILsi;)Lcl;", line = 4)
    public static final class32 method914(int arg0, int arg1, int arg2, class66 arg3) {
        field2068++;
        if (arg2 > -57) {
            field2070 = (class229) null;
        }
        return class176.method1264(arg1, (byte) 75, arg3, arg0) ? class110.method837(-6859) : null;
    }

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "(I)V", line = 24)
    public static void method915(int arg0) {
        field2070 = null;
        if (arg0 != 2301) {
            field2070 = (class229) null;
        }
        field2066 = null;
        field2067 = null;
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Ljn;)V", line = 40)
    public class123(class256 arg0) {
        this.field2069 = arg0;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI)I", line = 56)
    public static final int method916(byte arg0, int arg1) {
        field2071++;
        if (arg1 < 0) {
            return 0;
        }
        class285 var2 = (class285) class243.field4004.method713(3365, (long) arg1);
        if (var2 == null) {
            return class111.method848(arg1, arg0 + 116).field1967;
        }
        if (arg0 != -116) {
            method915(-90);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field4696.length; var4++) {
            if (var2.field4696[var4] == -1) {
                var3++;
            }
        }
        return var3 + class111.method848(arg1, 0).field1967 - var2.field4696.length;
    }
}
