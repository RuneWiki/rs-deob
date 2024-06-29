import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class476 extends class332 {

    @OriginalMember(owner = "client!vo", name = "H", descriptor = "I")
    public static int field6040 = 0;

    @OriginalMember(owner = "client!vo", name = "I", descriptor = "Lwp;")
    public static class453 field6041 = new class453(10, 3);

    @OriginalMember(owner = "client!vo", name = "J", descriptor = "[Les;")
    public static class630[] field6042 = new class630[2048];

    @OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
    public static int field6035;

    @OriginalMember(owner = "client!vo", name = "C", descriptor = "I")
    public static int field6036;

    @OriginalMember(owner = "client!vo", name = "D", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!vo", name = "F", descriptor = "I")
    public static int field6038;

    @OriginalMember(owner = "client!vo", name = "G", descriptor = "I")
    public static int field6039;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(Z)V", line = 5)
    public static void method2516(boolean arg0) {
        if (!arg0) {
            method2518((byte) -15);
        }
        field6041 = null;
        field6042 = null;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(IIIIIF)V", line = 16)
    public class476(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(IIIIII)V", line = 19)
    public static final void method2517(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6037;
        int var6 = class605.method3315(arg4, 4095, class289.field3595, class159.field2063);
        if (arg5 != -1) {
            method2516(false);
        }
        int var7 = class605.method3315(arg1, 4095, class289.field3595, class159.field2063);
        int var8 = class605.method3315(arg0, 4095, class263.field3294, class314.field4052);
        int var9 = class605.method3315(arg2, 4095, class263.field3294, class314.field4052);
        for (int var10 = var6; ~var10 >= ~var7; ++var10) {
            class57.method362(var8, class550.field7650[var10], arg3, var9, 65);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIBI)V", line = 47)
    public final void method2(int arg0, int arg1, byte arg2, int arg3) {
        super.field4235 = arg3;
        super.field4236 = arg1;
        if (arg2 <= -18) {
            super.field4247 = arg0;
            ++field6036;
        }
    }

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "(B)V", line = 60)
    public static final void method2518(byte arg0) {
        ++field6038;
        if (class664.field9377) {
            if (arg0 == 31) {
                class507 var1 = class138.method795(class529.field7156, class172.field2252, (byte) 64);
                if (var1 != null && var1.field6729 != null) {
                    class71 var2 = new class71();
                    var2.field963 = var1.field6729;
                    var2.field952 = var1;
                    class197.method1191(var2);
                }
                class474.field6013 = -1;
                class664.field9377 = false;
                class286.field3557 = -1;
                if (var1 != null) {
                    class572.method3158(var1, 1023);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IF)V", line = 102)
    public final void method1(int arg0, float arg1) {
        if (arg0 != 0) {
            field6041 = null;
        }
        ++field6035;
        super.field4239 = arg1;
    }
}
