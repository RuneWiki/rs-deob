import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public class class547 {

    @OriginalMember(owner = "client!baa", name = "c", descriptor = "Lbu;")
    public static class21 field7865 = new class21(97, 0);

    @OriginalMember(owner = "client!baa", name = "g", descriptor = "I")
    public static int field7869 = -1;

    @OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
    public static int field7864;

    @OriginalMember(owner = "client!baa", name = "e", descriptor = "I")
    public static int field7867;

    @OriginalMember(owner = "client!baa", name = "f", descriptor = "I")
    public static int field7868;

    @OriginalMember(owner = "client!baa", name = "h", descriptor = "I")
    public static int field7870;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "Lr;")
    public class194 field7863;

    @OriginalMember(owner = "client!baa", name = "d", descriptor = "Lka;")
    public class496 field7866;

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V")
    public static void method3270(int arg0) {
        field7865 = null;
        int var1 = -55 / ((-arg0 - 19) / 36);
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(BI)Lvk;")
    public static final class387 method3271(byte arg0, int arg1) {
        field7868++;
        if (arg0 < 65) {
            method3271((byte) 66, 91);
        }
        class387[] var2 = class643.method3664(0);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class387 var4 = var2[var3];
            if (var4.field5359 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IBII[BI)V")
    public static final void method3272(int arg0, byte arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field7870++;
        if (arg2 >= arg5) {
            return;
        }
        int var6 = arg5 - arg2 >> 2;
        int var7 = arg2 + arg3;
        while (true) {
            var6--;
            if (var6 < 0) {
                int var8 = arg5 - arg2 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        if (arg1 > -100) {
                            method3270(-99);
                            return;
                        } else {
                            return;
                        }
                    }
                    arg4[var7++] = 1;
                }
            }
            arg4[var7++] = 1;
            arg4[var7++] = 1;
            arg4[var7++] = 1;
            arg4[var7++] = 1;
        }
    }

    @OriginalMember(owner = "client!baa", name = "a", descriptor = "(IIIILnu;)V")
    public static final void method3273(int arg0, int arg1, int arg2, int arg3, class617 arg4) {
        class46 var5 = class704.method3985(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field5742 = (arg1 << class645.field9018) + class556.field7931;
        arg4.field5741 = arg3;
        arg4.field5746 = (arg2 << class645.field9018) + class556.field7931;
        var5.field591 = arg4;
        int var6 = class774.field10642 == class208.field3219 ? 1 : 0;
        if (arg4.method909(false)) {
            if (arg4.method906(106)) {
                arg4.field5747 = class338.field4733[var6];
                class338.field4733[var6] = arg4;
                return;
            }
            arg4.field5747 = class745.field10328[var6];
            class745.field10328[var6] = arg4;
            class98.field1115 = true;
            return;
        }
        arg4.field5747 = class695.field9711[var6];
        class695.field9711[var6] = arg4;
    }
}
