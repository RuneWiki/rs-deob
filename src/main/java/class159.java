import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class159 {

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
    public int field2396 = 0;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BLee;)V", line = 5)
    public final void method1143(byte arg0, class677 arg1) {
        while (true) {
            int var3 = arg1.method3821((byte) -80);
            if (var3 == 0) {
                int var4 = 115 / ((arg0 + 72) / 41);
                field2399++;
                return;
            }
            this.method1144(125, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IILee;)V", line = 29)
    private final void method1144(int arg0, int arg1, class677 arg2) {
        if (arg0 < 73) {
            field2398 = 88;
        }
        if (arg1 == 5) {
            this.field2396 = arg2.method3807(-1);
        }
        field2397++;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIILcj;Lcj;)V", line = 49)
    public static final void method1145(int arg0, int arg1, int arg2, class694 arg3, class694 arg4) {
        class701 var5 = class229.method1455(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field9737 = arg3;
        var5.field9735 = arg4;
        int var6 = class588.field7675 == class507.field6771 ? 1 : 0;
        if (!arg3.method806((byte) 99)) {
            arg3.field3513 = class15.field214[var6];
            class15.field214[var6] = arg3;
        } else if (arg3.method801(false)) {
            arg3.field3513 = class8.field162[var6];
            class8.field162[var6] = arg3;
        } else {
            arg3.field3513 = class496.field6694[var6];
            class496.field6694[var6] = arg3;
            class302.field4291 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method806((byte) 125)) {
            if (arg4.method801(false)) {
                arg4.field3513 = class8.field162[var6];
                class8.field162[var6] = arg4;
                return;
            }
            arg4.field3513 = class496.field6694[var6];
            class496.field6694[var6] = arg4;
            class302.field4291 = true;
            return;
        }
        arg4.field3513 = class15.field214[var6];
        class15.field214[var6] = arg4;
    }
}
