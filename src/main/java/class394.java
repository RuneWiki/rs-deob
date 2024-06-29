import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class394 extends class430 {

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public int field5655;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public int field5659;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "Z")
    public boolean field5661;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "Lhda;")
    public class345 field5658;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "Llc;")
    public static class435 field5656 = new class435(63, 6);

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field5662 = 0;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "Z")
    public boolean field5654;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "Z")
    public boolean field5657;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "Z")
    public boolean field5660;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILip;)V")
    public static final void method2400(int arg0, class304 arg1) {
        field5653++;
        if (arg1 == null) {
            return;
        }
        class303.field4137.method3559(arg1, (byte) 12);
        class456.field6499++;
        int var2 = -125 % ((arg0 - 30) / 44);
        Object var3 = null;
        class194 var6;
        if (arg1.field4157 || "".equals(arg1.field4158)) {
            var6 = new class194(arg1.field4158);
            class654.field9376++;
        } else {
            long var4 = arg1.field4153;
            for (var6 = (class194) class326.field4420.method4020(var4, (byte) -113); var6 != null && !var6.field2847.equals(arg1.field4158); var6 = (class194) class326.field4420.method4018((byte) 121)) {
            }
            if (var6 == null) {
                var6 = (class194) class696.field9836.method2216(0, var4);
                if (var6 != null && !var6.field2847.equals(arg1.field4158)) {
                    var6 = null;
                }
                if (var6 == null) {
                    var6 = new class194(arg1.field4158);
                }
                class326.field4420.method4022(var6, 85, var4);
                class654.field9376++;
            }
        }
        if (var6.method1375(arg1, 9)) {
            class618.method3591(var6, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public static void method2401(int arg0) {
        field5656 = null;
        if (arg0 != 6) {
            field5662 = -86;
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(ILhda;IZ)V")
    public class394(int arg0, class345 arg1, int arg2, boolean arg3) {
        this.field5655 = arg2;
        this.field5659 = arg0;
        this.field5661 = arg3;
        this.field5658 = arg1;
    }
}
