import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class157 {

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field1981 = 0;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "[Z")
    public static boolean[] field1985;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V", line = 7)
    public static final void method1043(boolean arg0) {
        field1983++;
        class51 var1 = class431.field6263;
        synchronized (class431.field6263) {
            class431.field6263.method366(-100);
            if (arg0) {
                method1046(127, -95);
            }
        }
        class51 var2 = class370.field5462;
        synchronized (class370.field5462) {
            class370.field5462.method366(-95);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIBII)I", line = 29)
    public static final int method1044(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if ((arg0 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg6;
            arg6 = var7;
        }
        if (arg4 != -108) {
            field1985 = null;
        }
        field1982++;
        int var8 = arg1 & 0x3;
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return 7 - arg2 - (arg3 + -1);
        } else if (var8 == 2) {
            return 7 + 1 - arg5 - arg6;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V", line = 64)
    public static final void method1045(byte arg0) {
        if (arg0 < 26) {
            method1046(-20, 85);
        }
        class190.field2644 = null;
        class430.field6247 = null;
        class431.field6266 = null;
        class281.field4135 = null;
        class420.field6111 = null;
        class147.field1880 = null;
        field1980++;
        class271.field3997 = null;
        class57.field864 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V", line = 82)
    public static final void method1046(int arg0, int arg1) {
        class194.field2693.method379(arg0, false);
        if (arg1 != -2) {
            method1044(-89, -54, 23, 117, (byte) 102, 73, 59);
        }
        field1984++;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(II)V", line = 94)
    public static final void method1047(int arg0, int arg1) {
        class123.field1589.method379(arg1, false);
        field1986++;
        if (arg0 != 1) {
            field1985 = null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V", line = 106)
    public static void method1048(int arg0) {
        field1985 = null;
        if (arg0 != -11620) {
            method1046(42, -35);
        }
    }
}
