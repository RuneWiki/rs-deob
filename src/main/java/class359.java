import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class359 extends class618 {

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    private int field4646;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "I")
    private int field4654;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    private int field4650;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "Lfc;")
    private class575 field4651;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    private int field4649;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    private int field4645;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    private int field4653;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "Lib;")
    public static class647 field4655 = new class647(8);

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field4652;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "Lou;")
    public static class262 field4657;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Ltda;")
    private class342 field4647;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "Lmaa;")
    public static class412 field4656;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "Luga;")
    public static class552 field4658;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V", line = 3)
    public static void method2062(boolean arg0) {
        field4655 = null;
        field4658 = null;
        field4657 = null;
        if (!arg0) {
            method2063((byte) 7, -50, -70, null, null);
        }
        field4656 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BII[I[I)V", line = 20)
    public static final void method2063(byte arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        field4648++;
        if (arg0 != 120 || arg1 >= arg2) {
            return;
        }
        int var5 = (arg1 + arg2) / 2;
        int var6 = arg1;
        int var7 = arg3[var5];
        arg3[var5] = arg3[arg2];
        arg3[arg2] = var7;
        int var8 = arg4[var5];
        arg4[var5] = arg4[arg2];
        arg4[arg2] = var8;
        int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
        for (int var10 = arg1; var10 < arg2; var10++) {
            if ((var10 & var9) + var7 > arg3[var10]) {
                int var11 = arg3[var10];
                arg3[var10] = arg3[var6];
                arg3[var6] = var11;
                int var12 = arg4[var10];
                arg4[var10] = arg4[var6];
                arg4[var6++] = var12;
            }
        }
        arg3[arg2] = arg3[var6];
        arg3[var6] = var7;
        arg4[arg2] = arg4[var6];
        arg4[var6] = var8;
        method2063((byte) 120, arg1, var6 - 1, arg3, arg4);
        method2063((byte) 120, var6 + 1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)Ltda;", line = 82)
    public final class342 method2064(byte arg0) {
        field4652++;
        if (arg0 >= -65) {
            method2062(true);
        }
        if (this.field4647 == null) {
            class447.field5847[3] = this.field4654;
            class447.field5847[5] = this.field4653;
            class447.field5847[4] = this.field4645;
            class447.field5847[2] = this.field4650;
            class447.field5847[1] = this.field4649;
            class702 var2 = this.field4651.field598;
            class447.field5847[0] = this.field4646;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method3164((byte) -31, class447.field5847[var5])) {
                    return null;
                }
                class59 var7 = var2.method3162((byte) -104, class447.field5847[var5]);
                int var8 = var7.field794 ? 64 : 128;
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var7.field801 > 0) {
                    var3 = 1;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class194.field2534[var6] = var2.method3158(var4, false, 1.0F, var4, class447.field5847[var6], (byte) -56);
            }
            this.field4647 = this.field4651.method204((byte) -67, var4, class194.field2534, var3 != 0);
        }
        return this.field4647;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lfc;IIIIII)V", line = 144)
    public class359(class575 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4646 = arg1;
        this.field4654 = arg4;
        this.field4650 = arg3;
        this.field4651 = arg0;
        this.field4649 = arg2;
        this.field4645 = arg5;
        this.field4653 = arg6;
    }
}
