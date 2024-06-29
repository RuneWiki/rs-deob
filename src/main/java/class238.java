import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class238 extends class220 {

    @OriginalMember(owner = "client!cc", name = "K", descriptor = "Lwd;")
    public class74 field4079;

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "I")
    public static int field4073 = 0;

    @OriginalMember(owner = "client!cc", name = "J", descriptor = "Lmh;")
    private static class128 field4078 = class22.method156(122, " has logged out)3");

    @OriginalMember(owner = "client!cc", name = "G", descriptor = "Lmh;")
    public static class128 field4075 = field4078;

    @OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!cc", name = "I", descriptor = "I")
    public static int field4077;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I", line = 4)
    public static int method1622(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIZLld;)V", line = 22)
    public static final void method1623(int arg0, int arg1, boolean arg2, class115 arg3) {
        field4076++;
        if (arg2) {
            field4078 = (class128) null;
        }
        if (arg3.field451 == arg0 && arg0 != -1) {
            class1 var4 = class167.method1091(-88, arg0);
            int var5 = var4.field5;
            if (var5 == 1) {
                arg3.field461 = 0;
                arg3.field430 = 0;
                arg3.field470 = 0;
                arg3.field463 = arg1;
                class171.method1143(arg3.field418, -105, var4, false, arg3.field461, arg3.field478);
            }
            if (var5 == 2) {
                arg3.field470 = 0;
            }
        } else if (arg0 == -1 || arg3.field451 == -1 || class167.method1091(-113, arg0).field34 >= class167.method1091(-83, arg3.field451).field34) {
            arg3.field461 = 0;
            arg3.field470 = 0;
            arg3.field430 = 0;
            arg3.field463 = arg1;
            arg3.field451 = arg0;
            arg3.field442 = arg3.field414;
            if (arg3.field451 != -1) {
                class171.method1143(arg3.field418, -78, class167.method1091(-32, arg3.field451), false, arg3.field461, arg3.field478);
            }
        }
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V", line = 79)
    public static void method1624(int arg0) {
        field4078 = null;
        if (arg0 != 0) {
            method1626(62, 91, 2, 125, -103);
        }
        field4075 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Ldj;B)V", line = 107)
    public static final void method1625(class314 arg0, byte arg1) {
        class299.field5096 = arg0;
        if (arg1 >= -3) {
            field4078 = (class128) null;
        }
        field4077++;
        class313.field5292 = class299.field5096.method2146((byte) 116, 16);
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lwd;)V", line = 118)
    public class238(class74 arg0) {
        this.field4079 = arg0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIII)V", line = 127)
    public static final void method1626(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4074++;
        if (arg0 >= class193.field3335 && arg0 <= class43.field875) {
            int var5 = class7.method59(class181.field3173, arg1, class70.field1315, 0);
            int var6 = class7.method59(class181.field3173, arg4, class70.field1315, 0);
            class261.method1830(var5, arg2, var6, -10177, arg0);
        }
        if (arg3 != 19681) {
            method1624(-62);
        }
    }
}
