import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class448 extends class646 {

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "[I")
    public static int[] field6466 = new int[13];

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "Z")
    public static boolean field6465;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(IB)[I", line = 3)
    public final int[] method424(int arg0, byte arg1) {
        ++field6468;
        if (arg1 != -120) {
            field6465 = false;
        }
        int[] var3 = super.field9156.method2193(1269, arg0);
        if (super.field9156.field5075) {
            int[] var4 = this.method3628(false, 0, arg0);
            for (int var5 = 0; ~class89.field1330 < ~var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)Z", line = 36)
    public static final boolean method2609(byte arg0, int arg1) {
        class119.field1913 = true;
        ++field6469;
        class189.field2958 = arg1 + 1 & 65535;
        if (arg0 != -79) {
            field6465 = false;
        }
        return true;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)[[I", line = 54)
    public final int[][] method298(int arg0, int arg1) {
        ++field6471;
        if (arg0 != -12424) {
            method2612((byte) 86);
        }
        int[][] var3 = super.field9164.method1002(120, arg1);
        if (super.field9164.field2082) {
            int[][] var4 = this.method3626(arg0 ^ -12543, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class89.field1330; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZZ)V", line = 101)
    public static final void method2610(boolean arg0, boolean arg1) {
        ++field6464;
        class655.method3701((byte) 38);
        if (class272.method1715(0, class515.field7636)) {
            ++class510.field7592;
            if (arg0) {
                method2609((byte) -21, 100);
            }
            if (~class510.field7592 <= -51 || arg1) {
                class510.field7592 = 0;
                if (!class253.field3666 && class256.field3696 != null) {
                    ++class425.field6065;
                    class699 var2 = class452.method2630(class699.field9897, class396.field5727, (byte) 126);
                    class149.method1134(var2, true);
                    try {
                        class557.method3263(104);
                    } catch (IOException var3) {
                        class253.field3666 = true;
                    }
                }
                class655.method3701((byte) 38);
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lek;IB)V", line = 138)
    public final void method295(class465 arg0, int arg1, byte arg2) {
        if (arg2 > 7) {
            ++field6470;
            if (~arg1 == -1) {
                super.field9160 = ~arg0.method2705(-115) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([BI)Ljava/lang/String;", line = 155)
    public static final String method2611(byte[] arg0, int arg1) {
        if (arg1 != 0) {
            method2609((byte) 97, 63);
        }
        ++field6467;
        return class353.method2137(arg0, 0, arg0.length, 0);
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V", line = 170)
    public class448() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 173)
    public static void method2612(byte arg0) {
        int var1 = 54 / ((arg0 - 59) / 54);
        field6466 = null;
    }
}
