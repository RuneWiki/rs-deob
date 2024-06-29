import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class65 extends class222 {

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    private int field1140;

    @OriginalMember(owner = "client!al", name = "z", descriptor = "I")
    private int field1148;

    @OriginalMember(owner = "client!al", name = "w", descriptor = "I")
    private int field1145;

    @OriginalMember(owner = "client!al", name = "s", descriptor = "I")
    private int field1141;

    @OriginalMember(owner = "client!al", name = "x", descriptor = "I")
    public static int field1146 = -1;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!al", name = "t", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!al", name = "v", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!al", name = "y", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!al", name = "u", descriptor = "[I")
    public static int[] field1143;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method570(String arg0, int arg1) {
        ++field1147;
        if (arg1 != -1484774708) {
            field1143 = null;
        }
        return class373.method2387(true, 10, (byte) 50, arg0);
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(III)V")
    public final void method44(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.field1141 = -27;
        }
        ++field1142;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIII)V")
    public class65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1140 = arg1;
        this.field1148 = arg3;
        this.field1145 = arg0;
        this.field1141 = arg2;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V")
    public static void method571(int arg0) {
        int var1 = 0 / ((70 - arg0) / 46);
        field1143 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(III)V")
    public final void method51(int arg0, int arg1, int arg2) {
        if (arg2 >= -20) {
            field1143 = null;
        }
        ++field1144;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIZ)V")
    public final void method48(int arg0, int arg1, boolean arg2) {
        ++field1139;
        int var4 = this.field1145 * arg0 >> 12;
        int var5 = this.field1141 * arg0 >> 12;
        int var6 = this.field1140 * arg1 >> 12;
        if (!arg2) {
            this.field1141 = -21;
        }
        int var7 = this.field1148 * arg1 >> 12;
        class145.method1042(var5, var4, 6113, var6, var7, super.field3210);
    }
}
