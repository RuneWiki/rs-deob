import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class345 extends class4 {

    @OriginalMember(owner = "client!ku", name = "m", descriptor = "I")
    private int field5561;

    @OriginalMember(owner = "client!ku", name = "h", descriptor = "I")
    private int field5556;

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "I")
    private int field5555;

    @OriginalMember(owner = "client!ku", name = "j", descriptor = "I")
    private int field5558;

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "Lvg;")
    public static class49 field5554 = new class49(8);

    @OriginalMember(owner = "client!ku", name = "l", descriptor = "I")
    public static int field5560 = 0;

    @OriginalMember(owner = "client!ku", name = "n", descriptor = "[I")
    public static int[] field5562 = null;

    @OriginalMember(owner = "client!ku", name = "i", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!ku", name = "k", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!ku", name = "o", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IIB)V", line = 12)
    public final void method22(int arg0, int arg1, byte arg2) {
        if (arg2 >= -124) {
            method2343((byte) -95);
        }
        ++field5559;
        int var4 = this.field5561 * arg1 >> 12;
        int var5 = this.field5558 * arg1 >> 12;
        int var6 = this.field5555 * arg0 >> 12;
        int var7 = this.field5556 * arg0 >> 12;
        class469.method2913(var7, var6, super.field31, var4, super.field32, (byte) -69, super.field28, var5);
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)V", line = 32)
    public static void method2343(byte arg0) {
        field5562 = null;
        field5554 = null;
        if (arg0 != -114) {
            field5562 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(IIIIIII)V", line = 44)
    public class345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field5561 = arg0;
        this.field5556 = arg3;
        this.field5555 = arg1;
        this.field5558 = arg2;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(III)V", line = 57)
    public final void method19(int arg0, int arg1, int arg2) {
        ++field5557;
        int var4 = this.field5561 * arg0 >> 12;
        int var5 = this.field5558 * arg0 >> 12;
        int var6 = this.field5555 * arg2 >> 12;
        if (arg1 != 1) {
            this.field5558 = -3;
        }
        int var7 = this.field5556 * arg2 >> 12;
        class589.method3439(var5, var4, var7, -1, var6, super.field32);
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(III)V", line = 79)
    public final void method21(int arg0, int arg1, int arg2) {
        ++field5563;
        if (arg1 != 8746) {
            field5554 = null;
        }
    }
}
