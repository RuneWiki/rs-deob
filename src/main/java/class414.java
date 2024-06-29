import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class414 extends class11 {

    @OriginalMember(owner = "client!lv", name = "v", descriptor = "[B")
    public byte[] field5672;

    @OriginalMember(owner = "client!lv", name = "u", descriptor = "Z")
    public static boolean field5671 = false;

    @OriginalMember(owner = "client!lv", name = "t", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!lv", name = "w", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(IZI)Z", line = 3)
    public static final boolean method2373(int arg0, boolean arg1, int arg2) {
        field5673++;
        if (!arg1) {
            field5671 = true;
        }
        return (arg0 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(ILvj;ILvj;IIBIII)V", line = 15)
    public static final void method2374(int arg0, class411 arg1, int arg2, class411 arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        field5670++;
        int var10 = arg1.method1780((byte) 104);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class468 var12 = (class468) class237.field3350.method3750((long) var10, false);
        if (var12 == null) {
            class500[] var13 = class500.method2777(class658.field9155, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class10.field197.method440(var13[0], true);
            class237.field3350.method3745(1, (long) var10, var12);
        }
        class188.method1234(arg3.field8609, arg3.field8620, arg7, (byte) 109, arg3.method2317((byte) 40) * 256, 0, arg3.field8612, arg9 >> 1, arg4, arg2 >> 1);
        int var14 = class601.field7980[0] + arg8 - 18;
        int var15 = arg0 / 4 * 18 + var14;
        int var16 = arg5 + class601.field7980[1] - 16 - 54;
        int var17 = arg0 % 4 * 18 + var16;
        var12.method2637(var15, var17);
        if (arg1 == arg3) {
            class10.field197.method3572((byte) -33, var15 - 1, -256, 18, var17 - 1, 18);
        }
        if (arg6 != 118) {
            field5671 = false;
        }
        class369 var18 = class570.method3134((byte) -84);
        var18.field4982 = var15;
        var18.field4980 = var17 + 16;
        var18.field4986 = arg1;
        var18.field4985 = var15 + 16;
        var18.field4988 = var17;
        class82.field1278.method327(var18, true);
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "([B)V", line = 67)
    public class414(byte[] arg0) {
        this.field5672 = arg0;
    }
}
