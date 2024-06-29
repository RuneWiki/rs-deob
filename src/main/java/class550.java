import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class550 extends class616 implements class519 {

    @OriginalMember(owner = "client!eba", name = "E", descriptor = "Lhm;")
    public static class208 field6905 = new class208(4);

    @OriginalMember(owner = "client!eba", name = "F", descriptor = "Ldr;")
    public static class675 field6906 = new class675(92, 8);

    @OriginalMember(owner = "client!eba", name = "G", descriptor = "Ldr;")
    public static class675 field6907 = new class675(54, 14);

    @OriginalMember(owner = "client!eba", name = "v", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!eba", name = "w", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!eba", name = "x", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!eba", name = "y", descriptor = "I")
    public static int field6899;

    @OriginalMember(owner = "client!eba", name = "z", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!eba", name = "A", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!eba", name = "B", descriptor = "I")
    public static int field6902;

    @OriginalMember(owner = "client!eba", name = "C", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!eba", name = "D", descriptor = "I")
    public static int field6904;

    @OriginalMember(owner = "client!eba", name = "H", descriptor = "I")
    public static int field6908;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Z)V")
    public static void method2941(boolean arg0) {
        field6905 = null;
        field6907 = null;
        if (!arg0) {
            field6907 = null;
        }
        field6906 = null;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(CI)Z")
    public static final boolean method2942(char arg0, int arg1) {
        field6903++;
        if (arg1 != 57) {
            field6906 = null;
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V")
    public final void method60(int arg0) {
        if (arg0 == 5634) {
            field6898++;
            super.method60(arg0);
        }
    }

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)I")
    public final int method503(int arg0) {
        field6901++;
        return arg0 == -3267 ? super.method503(-3267) : 59;
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lel;Z)V")
    public class550(class513 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    public final Buffer method62(boolean arg0, boolean arg1) {
        field6900++;
        if (!arg0) {
            method2942((char) 65508, -113);
        }
        return super.method62(true, arg1);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)Z")
    public final boolean method61(byte arg0) {
        if (arg0 != 96) {
            this.method2814(-91, (byte) 47, -86);
        }
        field6897++;
        return super.method61((byte) 96);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2943(int arg0, boolean arg1) {
        field6904++;
        if (arg1) {
            method2942('\u000b', 116);
        }
        return arg0 == 22 || arg0 == 60 || arg0 == 1002 || arg0 == 3 || arg0 == 44;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(ILjaclib/memory/Source;II)Z")
    public final boolean method2813(int arg0, Source arg1, int arg2, int arg3) {
        if (arg0 > -41) {
            return true;
        } else {
            super.method3437(arg3, arg1, -91);
            field6899++;
            return true;
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(BLac;)V")
    public static final void method2944(byte arg0, class506 arg1) {
        field6902++;
        class112 var2 = (class112) class16.field163.method1909(true);
        if (arg0 != -93) {
            field6907 = null;
        }
        while (var2 != null) {
            if (var2.field1389 == arg1) {
                if (var2.field1396 != null) {
                    class314.field3941.method1489(var2.field1396);
                    var2.field1396 = null;
                }
                var2.method1566(-89);
                return;
            }
            var2 = (class112) class16.field163.method1916((byte) 90);
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IBI)Z")
    public final boolean method2814(int arg0, byte arg1, int arg2) {
        super.method59(arg1 - 29430, arg2);
        if (arg1 == -99) {
            field6896++;
            return true;
        } else {
            return true;
        }
    }
}
