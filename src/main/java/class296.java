import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class296 {

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "Lea;")
    public static class547 field3980 = new class547(50, 7);

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "F")
    public static float field3979;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "Lni;")
    public static class522 field3981;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "Ldw;")
    public class718 field3978;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V", line = 4)
    public static void method1766(int arg0) {
        field3981 = null;
        field3980 = null;
        if (arg0 != 15529) {
            field3979 = -1.0144556F;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lji;B)Ljava/lang/String;", line = 15)
    public static final String method1767(class611 arg0, byte arg1) {
        if (arg1 == 72) {
            field3977++;
            return class626.method3540(false, arg0, 32767);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIILhc;)V", line = 29)
    public static final void method1768(int arg0, int arg1, int arg2, class142 arg3) {
        class624 var4 = class76.method565(arg0, arg1, arg2);
        if (var4 == null) {
            return;
        }
        var4.field8736 = arg3;
        int var5 = class25.field188 == class143.field1850 ? 1 : 0;
        if (arg3.method123(-127)) {
            if (arg3.method126(6540)) {
                arg3.field2179 = class43.field467[var5];
                class43.field467[var5] = arg3;
                return;
            }
            arg3.field2179 = class732.field10200[var5];
            class732.field10200[var5] = arg3;
            class315.field4252 = true;
            return;
        }
        arg3.field2179 = class707.field9896[var5];
        class707.field9896[var5] = arg3;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)Z", line = 65)
    public static final boolean method1769(int arg0, int arg1, int arg2) {
        if (arg2 == 2048) {
            field3983++;
            return (arg1 & 0x800) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIZ)V", line = 81)
    public static final void method1770(int arg0, int arg1, int arg2, boolean arg3) {
        class114.field1506 = new byte[arg2][arg1][arg0];
        if (arg3) {
            field3984++;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILgv;)V", line = 94)
    public static final void method1771(int arg0, class83 arg1) {
        field3982++;
        if (arg0 != 0) {
            field3981 = null;
        }
        class101 var2 = (class101) class374.field5207.method2552((long) arg1.field817, -1);
        if (var2 == null) {
            class333.method1978(arg1, null, arg1.field898[0], 0, arg0 + 3, arg1.field899[0], arg1.field2175, null);
        } else {
            var2.method696(true);
        }
    }
}
