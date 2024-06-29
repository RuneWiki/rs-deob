import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class45 {

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "Le;")
    public static class191 field807 = class54.method368("blinken2:", 2047);

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field809 = 0;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static volatile int field808 = 0;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Le;")
    public static class191 field806 = null;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static void method309(int arg0) {
        field806 = null;
        field807 = null;
        if (arg0 != -1) {
            method313(39, -74, -65);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)Z")
    public static final boolean method310(int arg0) {
        field805++;
        if (class273.field4825 == 0) {
            if (arg0 != -9488) {
                field809 = -103;
            }
            return class42.field733.method1529(true);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)I")
    public static final int method311(int arg0) {
        field810++;
        return arg0 == -67 ? 2 : -29;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)I")
    public static final int method312(byte arg0, int arg1) {
        if (arg0 != 48) {
            field807 = null;
        }
        field811++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)I")
    public static final int method313(int arg0, int arg1, int arg2) {
        int var3 = 116 / ((arg2 - 47) / 48);
        field802++;
        if (arg0 < arg1) {
            int var4 = arg0;
            arg0 = arg1;
            arg1 = var4;
        }
        while (arg1 != 0) {
            int var5 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var5;
        }
        return arg0;
    }
}
