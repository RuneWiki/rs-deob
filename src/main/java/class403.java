import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public abstract class class403 extends class250 {

    @OriginalMember(owner = "client!et", name = "f", descriptor = "I")
    public int field5933;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "I")
    public int field5936;

    @OriginalMember(owner = "client!et", name = "k", descriptor = "I")
    public int field5938;

    @OriginalMember(owner = "client!et", name = "j", descriptor = "I")
    public int field5937;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "Lgn;")
    public static class475 field5934 = new class475(57, 2);

    @OriginalMember(owner = "client!et", name = "l", descriptor = "Lgn;")
    public static class475 field5939 = new class475(67, 3);

    @OriginalMember(owner = "client!et", name = "e", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILcu;II)V", line = 5)
    public static final void method2417(int arg0, class139 arg1, int arg2, int arg3) {
        if (arg1.field4215 == arg0 && arg0 != -1) {
            class168 var4 = class286.field4083.method2602(-24462, arg0);
            int var5 = var4.field2221;
            if (var5 == 1) {
                arg1.field4216 = 0;
                arg1.field4221 = 1;
                arg1.field4198 = 0;
                arg1.field4261 = 0;
                arg1.field4206 = arg2;
                class204.method1258(-1, arg1.field4216, arg1.field2959, false, var4, arg1.field2966, arg1.field2956);
            }
            if (var5 == 2) {
                arg1.field4198 = 0;
            }
        } else if (arg0 == -1 || arg1.field4215 == -1 || class286.field4083.method2602(-24462, arg0).field2217 >= class286.field4083.method2602(-24462, arg1.field4215).field2217) {
            arg1.field4221 = 1;
            arg1.field4215 = arg0;
            arg1.field4274 = arg1.field4277;
            arg1.field4198 = 0;
            arg1.field4261 = 0;
            arg1.field4206 = arg2;
            arg1.field4216 = 0;
            if (arg1.field4215 != -1) {
                class204.method1258(-1, arg1.field4216, arg1.field2959, false, class286.field4083.method2602(-24462, arg1.field4215), arg1.field2966, arg1.field2956);
            }
        }
        field5935++;
        if (arg3 < 89) {
            field5934 = null;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IB)Z", line = 62)
    public static final boolean method2418(int arg0, byte arg1) {
        if (arg1 < 73) {
            field5939 = null;
        }
        field5932++;
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(Z)V", line = 81)
    public static void method2419(boolean arg0) {
        if (!arg0) {
            field5939 = null;
        }
        field5939 = null;
        field5934 = null;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(IIII)V", line = 94)
    public class403(int arg0, int arg1, int arg2, int arg3) {
        this.field5933 = arg3;
        this.field5936 = arg2;
        this.field5938 = arg1;
        this.field5937 = arg0;
    }
}
