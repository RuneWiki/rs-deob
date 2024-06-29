import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public class class275 extends class545 {

    @OriginalMember(owner = "client!tca", name = "x", descriptor = "I")
    public int field3984;

    @OriginalMember(owner = "client!tca", name = "u", descriptor = "I")
    public int field3981;

    @OriginalMember(owner = "client!tca", name = "w", descriptor = "Lkr;")
    public static class602 field3983 = new class602(50, 17);

    @OriginalMember(owner = "client!tca", name = "t", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!tca", name = "v", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!tca", name = "y", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "(I)V", line = 3)
    public static void method1845(int arg0) {
        field3983 = null;
        if (arg0 != 0) {
            field3983 = null;
        }
    }

    @OriginalMember(owner = "client!tca", name = "<init>", descriptor = "(Lrg;Lal;IIIIIIIII)V", line = 20)
    public class275(class557 arg0, class125 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field3984 = arg9;
        this.field3981 = arg10;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(Z)Lww;", line = 32)
    public final class288 method1206(boolean arg0) {
        field3980++;
        if (arg0) {
            this.method1206(true);
        }
        return class498.field6963;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IBIIIIIIII)V", line = 43)
    public static final void method1846(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3982++;
        if (arg5 < 512 || arg0 < 512 || ((class277.field4036 - 2) * 512) < arg5 || class667.field9202 * 512 - 1024 < arg0) {
            class185.field2530[0] = class185.field2530[1] = -1;
            return;
        }
        int var10 = class737.method4102((byte) 19, arg5, arg0, arg8) - arg3;
        int var11 = -63 % ((10 - arg1) / 35);
        if (class222.field3009) {
            class484.method2948(true, (byte) -80);
        } else {
            class243.field3618.method882(arg4, 0, 0);
            class129.field1802.method1444(class243.field3618);
        }
        if (class301.field4261) {
            class129.field1802.method1475(arg5, var10, arg0, class3.field30, class185.field2530);
        } else {
            class129.field1802.method1486(arg5, var10, arg0, class185.field2530);
        }
        if (class222.field3009) {
            class451.method2761(-121);
        } else {
            class243.field3618.method882(-arg4, 0, 0);
            class129.field1802.method1444(class243.field3618);
        }
    }
}
