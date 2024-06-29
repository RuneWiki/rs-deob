import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class224 extends class104 {

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "I")
    public static int field3991 = 0;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "B")
    public byte field3988;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "I")
    public int field3989;

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "Le;")
    public class191 field3984;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "Le;")
    public class191 field3992;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILeg;Lwa;BIII)V")
    public static final void method1555(int arg0, class33 arg1, class226 arg2, byte arg3, int arg4, int arg5, int arg6) {
        field3985++;
        if (arg2 == null) {
            return;
        }
        int var7 = class65.field1138 + class137.field2302 & 0x7FF;
        int var8 = Math.max(arg1.field537 / 2, arg1.field561 / 2) + 10;
        int var9 = arg5 * arg5 + arg6 * arg6;
        if (arg3 > -14) {
            method1555(-121, (class33) null, (class226) null, (byte) -16, -91, 23, 107);
        }
        if (var9 > var8 * var8) {
            return;
        }
        int var10 = class15.field204[var7];
        int var11 = var10 * 256 / (class114.field1886 + 256);
        int var12 = class15.field206[var7];
        int var13 = var12 * 256 / (class114.field1886 + 256);
        int var14 = arg5 * var13 - (arg6 * var11) >> 16;
        int var15 = arg5 * var11 + arg6 * var13 >> 16;
        ((class155) arg2).method1053(arg1.field537 / 2 + var15 + arg4 - (arg2.field4070 / 2), arg1.field561 / 2 + -var14 + arg0 + -(arg2.field4079 / 2), arg1.field492, arg1.field566);
    }
}
