import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class307 {

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "I")
    public int field4207;

    @OriginalMember(owner = "client!lv", name = "f", descriptor = "I")
    public int field4208;

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "I")
    public int field4205;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "I")
    public int field4206;

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "Luf;")
    public static class310 field4204 = new class310(40, 11);

    @OriginalMember(owner = "client!lv", name = "k", descriptor = "I")
    public static int field4213 = 0;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!lv", name = "g", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!lv", name = "h", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!lv", name = "i", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!lv", name = "j", descriptor = "[I")
    public static int[] field4212;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(CZ)Z")
    public static final boolean method1740(char arg0, boolean arg1) {
        field4210++;
        if (arg1) {
            method1740('t', false);
        }
        return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(IIII)V")
    public class307(int arg0, int arg1, int arg2, int arg3) {
        this.field4207 = arg1;
        this.field4208 = arg0;
        this.field4205 = arg3;
        this.field4206 = arg2;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(III)Z")
    public static final boolean method1741(int arg0, int arg1, int arg2) {
        field4203++;
        if (arg2 != 40) {
            field4212 = null;
        }
        return class203.method1240(arg0, arg1, arg2 ^ 0x1BA9) || class168.method1042(arg0, arg1, false);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Z)V")
    public static void method1742(boolean arg0) {
        field4204 = null;
        field4212 = null;
        if (!arg0) {
            field4213 = -125;
        }
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(BI)Llv;")
    public final class307 method1743(byte arg0, int arg1) {
        field4209++;
        return arg0 <= 100 ? null : new class307(this.field4208, arg1, this.field4206, this.field4205);
    }
}
