import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gba")
public class class732 extends class601 {

    @OriginalMember(owner = "client!gba", name = "J", descriptor = "I")
    private int field9588 = 585;

    @OriginalMember(owner = "client!gba", name = "F", descriptor = "I")
    public static int field9584;

    @OriginalMember(owner = "client!gba", name = "G", descriptor = "I")
    public static int field9585;

    @OriginalMember(owner = "client!gba", name = "H", descriptor = "I")
    public static int field9586;

    @OriginalMember(owner = "client!gba", name = "I", descriptor = "I")
    public static int field9587;

    @OriginalMember(owner = "client!gba", name = "L", descriptor = "I")
    public static int field9590;

    @OriginalMember(owner = "client!gba", name = "K", descriptor = "Lon;")
    public static class527 field9589;

    @OriginalMember(owner = "client!gba", name = "b", descriptor = "(BII)Z")
    public static final boolean method3905(byte arg0, int arg1, int arg2) {
        ++field9585;
        int var3 = -88 / ((54 - arg0) / 49);
        return class319.method1860(arg2, arg1, 55) & ((8192 & arg2) != 0 | class311.method1832(arg1, 123, arg2) | class791.method4327(arg1, arg2, (byte) -64));
    }

    @OriginalMember(owner = "client!gba", name = "f", descriptor = "(I)V")
    public static void method3906(int arg0) {
        field9589 = null;
        if (arg0 != 12) {
            method3906(-115);
        }
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(Lmc;II)V")
    public final void method259(class234 arg0, int arg1, int arg2) {
        int var4 = 101 / ((40 - arg2) / 52);
        if (~arg1 == -1) {
            this.field9588 = arg0.method1553((byte) -115);
        }
        ++field9587;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IB)[I")
    public final int[] method261(int arg0, byte arg1) {
        ++field9590;
        if (arg1 >= -76) {
            field9589 = null;
        }
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (super.field7643.field4364) {
            int var4 = class427.field5623[arg0];
            for (int var5 = 0; class418.field5518 > var5; ++var5) {
                int var6 = class64.field839[var5];
                if (this.field9588 < var6 && -this.field9588 + 4096 > var6 && -this.field9588 + 2048 < var4 && var4 < 2048 - -this.field9588) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field9588 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~var6 < ~(-this.field9588 + 2048) && this.field9588 + 2048 > var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field9588;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field9588 + 2048);
                } else if (~var4 <= ~this.field9588 && -this.field9588 + 4096 >= var4) {
                    if (~var6 <= ~this.field9588 && ~(-this.field9588 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field9588 + 2048);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field9588;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field9588 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gba", name = "a", descriptor = "(IIIILck;I)Lrc;")
    public static final class59 method3907(int arg0, int arg1, int arg2, int arg3, class733 arg4, int arg5) {
        int var6 = 126 % ((arg2 - -12) / 53);
        ++field9584;
        if (!arg4.field9891 && (!class735.method3997(arg5, (byte) -112) || !class735.method3997(arg0, (byte) -90))) {
            return arg4.field9876 ? new class59(arg4, 34037, arg1, arg3, arg5, arg0, true) : new class59(arg4, arg1, arg3, arg5, arg0, class483.method2714(arg5, (byte) -114), class483.method2714(arg0, (byte) -128), true);
        } else {
            return new class59(arg4, 3553, arg1, arg3, arg5, arg0, true);
        }
    }

    @OriginalMember(owner = "client!gba", name = "<init>", descriptor = "()V")
    public class732() {
        super(0, true);
    }
}
