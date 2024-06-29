import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class662 extends class192 {

    @OriginalMember(owner = "client!pg", name = "J", descriptor = "I")
    private int field9208;

    @OriginalMember(owner = "client!pg", name = "L", descriptor = "I")
    public static int field9210 = 0;

    @OriginalMember(owner = "client!pg", name = "I", descriptor = "I")
    public static int field9207;

    @OriginalMember(owner = "client!pg", name = "K", descriptor = "I")
    public static int field9209;

    @OriginalMember(owner = "client!pg", name = "M", descriptor = "I")
    public static int field9211;

    @OriginalMember(owner = "client!pg", name = "N", descriptor = "I")
    public static int field9212;

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(I)V", line = 40)
    public class662(int arg0) {
        super(0, true);
        this.field9208 = 4096;
        this.field9208 = arg0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILfd;I)V", line = 11)
    public final void method109(int arg0, class418 arg1, int arg2) {
        if (~arg0 == -1) {
            this.field9208 = (arg1.method2396(89) << 12) / 255;
        }
        if (arg2 != -12160) {
            method3629(-37, (short[]) null, 15, (String[]) null, 116);
        }
        ++field9211;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "()V", line = 37)
    public class662() {
        this(4096);
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(IBI)V", line = 48)
    public static final void method3628(int arg0, byte arg1, int arg2) {
        int var3 = -113 / ((arg1 - 26) / 62);
        ++field9212;
        class367 var4 = class573.method3057(14, arg2, 2);
        var4.method2115(1);
        var4.field4735 = arg0;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[SI[Ljava/lang/String;I)V", line = 61)
    public static final void method3629(int arg0, short[] arg1, int arg2, String[] arg3, int arg4) {
        if (~arg2 > ~arg0) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg2;
            String var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg0];
            arg1[arg0] = var8;
            for (int var9 = arg2; ~var9 > ~arg0; ++var9) {
                if (var7 == null || arg3[var9] != null && (1 & var9) > arg3[var9].compareTo(var7)) {
                    String var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg0] = arg1[var6];
            arg1[var6] = var8;
            method3629(var6 + -1, arg1, arg2, arg3, 113);
            method3629(arg0, arg1, var6 - -1, arg3, -40);
        }
        int var12 = 72 / ((arg4 - 55) / 52);
        ++field9209;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)[I", line = 117)
    public final int[] method118(int arg0, byte arg1) {
        ++field9207;
        int[] var3 = super.field2448.method2978(arg0, (byte) -56);
        if (super.field2448.field7266) {
            class443.method2511(var3, 0, class561.field7319, this.field9208);
        }
        return arg1 > -123 ? null : var3;
    }
}
