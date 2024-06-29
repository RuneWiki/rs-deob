import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class555 {

    @OriginalMember(owner = "client!fs", name = "c", descriptor = "Z")
    public static boolean field7793 = false;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "I")
    public static int field7791 = 0;

    @OriginalMember(owner = "client!fs", name = "b", descriptor = "D")
    public static double field7792;

    @OriginalMember(owner = "client!fs", name = "d", descriptor = "I")
    public static int field7794;

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "I")
    public static int field7795;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lkj;IIIBLka;)V", line = 3)
    public static final void method3208(class566 arg0, int arg1, int arg2, int arg3, byte arg4, class471 arg5) {
        if (arg4 > -70) {
            method3209((byte) -96, null);
        }
        field7794++;
        if (arg5 != null) {
            arg0.method3263(arg1, arg5.method245(), arg5.method253(), arg5.method259(), arg5.method266(), 633, arg5.method222(), arg5.method260(), arg5.method234(), arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(BLwm;)V", line = 19)
    public static final void method3209(byte arg0, class564 arg1) {
        field7795++;
        if (arg0 != -120) {
            method3208(null, 67, -43, -19, (byte) -29, null);
        }
        boolean var2 = false;
        if (class740.field10285 == arg1.field7969 || arg1.field7991 == -1 || arg1.field7925 != 0) {
            var2 = true;
        } else {
            class709 var3 = class343.field4785.method3525(arg1.field7991, (byte) 114);
            if (var3.field9830 || arg1.field7921 + 1 > var3.field9849[arg1.field7965]) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field7969 - arg1.field7954;
            int var5 = class740.field10285 - arg1.field7954;
            int var6 = arg1.field7972 * 512 + (arg1.method1835((byte) 127) * 256);
            int var7 = arg1.field7980 * 512 + arg1.method1835((byte) 127) * 256;
            int var8 = arg1.field7947 * 512 + (arg1.method1835((byte) 127) * 256);
            int var9 = arg1.field7967 * 512 + (arg1.method1835((byte) 127) * 256);
            arg1.field1250 = ((var4 - var5) * var7 + var5 * var9) / var4;
            arg1.field1264 = ((var4 - var5) * var6 + (var5 * var8)) / var4;
        }
        arg1.field8012 = 0;
        if (arg1.field7933 == 0) {
            arg1.method3248(false, 42, 8192);
        }
        if (arg1.field7933 == 1) {
            arg1.method3248(false, -115, 12288);
        }
        if (arg1.field7933 == 2) {
            arg1.method3248(false, -106, 0);
        }
        if (arg1.field7933 == 3) {
            arg1.method3248(false, 60, 4096);
        }
    }
}
