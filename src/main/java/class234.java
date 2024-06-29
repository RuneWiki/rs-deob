import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class234 extends class220 {

    @OriginalMember(owner = "client!le", name = "M", descriptor = "I")
    public int field4037 = 0;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "I")
    public static int field4032 = 0;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "Lmh;")
    public static class128 field4031 = class22.method156(126, ")3)3)3");

    @OriginalMember(owner = "client!le", name = "I", descriptor = "I")
    public static int field4033 = 0;

    @OriginalMember(owner = "client!le", name = "E", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "Lue;")
    public static class14 field4036;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "Ldd;")
    public static class239 field4030;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "Ldj;")
    public static class314 field4035;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILbg;I)V", line = 43)
    private final void method1608(int arg0, class194 arg1, int arg2) {
        field4034++;
        if (arg0 == 2) {
            this.field4037 = arg1.method1308(-22);
        }
        int var4 = -118 % ((8 - arg2) / 47);
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V", line = 66)
    public static void method1609(int arg0) {
        field4035 = null;
        field4031 = null;
        int var1 = 50 % ((-arg0 - 6) / 40);
        field4036 = null;
        field4030 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILbg;)V", line = 91)
    public final void method1610(int arg0, class194 arg1) {
        field4029++;
        if (arg0 != -1) {
            method1609(-52);
        }
        while (true) {
            int var3 = arg1.method1325(arg0 + 7628);
            if (var3 == 0) {
                return;
            }
            this.method1608(var3, arg1, -66);
        }
    }
}
