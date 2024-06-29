import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class510 {

    @OriginalMember(owner = "client!os", name = "g", descriptor = "Ljava/lang/String;")
    public String field7320;

    @OriginalMember(owner = "client!os", name = "h", descriptor = "Ljava/lang/String;")
    public String field7321;

    @OriginalMember(owner = "client!os", name = "b", descriptor = "Ljava/lang/String;")
    public String field7315;

    @OriginalMember(owner = "client!os", name = "i", descriptor = "[S")
    public static short[] field7322 = new short[] { 30, 58, 49, 5, 21, 44, 51, 4 };

    @OriginalMember(owner = "client!os", name = "l", descriptor = "I")
    public static int field7325 = 0;

    @OriginalMember(owner = "client!os", name = "d", descriptor = "Z")
    public static boolean field7317 = false;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "Lcq;")
    public static class110 field7316 = new class110(4, -2);

    @OriginalMember(owner = "client!os", name = "a", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "I")
    public static int field7318;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!os", name = "k", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!os", name = "j", descriptor = "Lql;")
    public static class165 field7323;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIII)V", line = 6)
    public static final void method2913(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class331.field4170 == 1) {
            class614.field8648[class388.field5242 / 100].method3001(class569.field8097 - 8, class557.field7955 + -8);
        }
        field7318++;
        if (class331.field4170 == 2) {
            class614.field8648[class388.field5242 / 100 + 4].method3001(class569.field8097 - 8, class557.field7955 + -8);
        }
        class345.method2058((byte) 75);
        if (arg2 < 37) {
            method2914(false);
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V", line = 28)
    public static void method2914(boolean arg0) {
        field7322 = null;
        field7316 = null;
        if (!arg0) {
            field7316 = null;
        }
        field7323 = null;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "([SI)[S", line = 43)
    public static final short[] method2915(short[] arg0, int arg1) {
        field7314++;
        if (arg0 == null) {
            return null;
        }
        short[] var2 = new short[arg0.length];
        if (arg1 == 924) {
            class567.method3212(arg0, 0, var2, 0, arg0.length);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 76)
    public class510(String arg0, String arg1, String arg2) {
        this.field7320 = arg1;
        this.field7321 = arg2;
        this.field7315 = arg0;
    }
}
