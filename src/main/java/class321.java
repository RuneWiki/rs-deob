import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class321 {

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field4911 = 0;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)Z")
    public static final boolean method2092(int arg0) {
        if (arg0 < 101) {
            return true;
        }
        field4913++;
        if (class61.field1073) {
            try {
                if ((Boolean) class512.method3065("showingVideoAd", class368.field5553.field4170, (byte) 10)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IBI[B)I")
    public static final int method2093(int arg0, byte arg1, int arg2, byte[] arg3) {
        field4909++;
        int var4 = -1;
        for (int var5 = arg0; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class6.field129[(var4 ^ arg3[var5]) & 0xFF];
        }
        int var6 = -40 % ((arg1 + 17) / 50);
        return ~var4;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I[BIII[BIII)V")
    public static final void method2094(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
        field4908++;
        int var9 = -(arg6 >> 2);
        int var10 = -(arg6 & 0x3);
        for (int var11 = -arg7; var11 < 0; var11++) {
            int var10001;
            for (int var13 = var9; var13 < 0; var13++) {
                var10001 = arg2++;
                arg5[var10001] = (byte) (arg5[var10001] - arg1[arg0++]);
                int var15 = arg2++;
                arg5[var15] = (byte) (arg5[var15] - arg1[arg0++]);
                int var16 = arg2++;
                arg5[var16] = (byte) (arg5[var16] - arg1[arg0++]);
                int var17 = arg2++;
                arg5[var17] = (byte) (arg5[var17] - arg1[arg0++]);
            }
            for (int var14 = var10; var14 < 0; var14++) {
                var10001 = arg2++;
                arg5[var10001] = (byte) (arg5[var10001] - arg1[arg0++]);
            }
            arg0 += arg8;
            arg2 += arg3;
        }
        int var12 = 93 / ((-arg4 - 27) / 59);
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)Lnc;")
    public static final class21 method2095(int arg0, int arg1) {
        field4912++;
        class21 var2 = (class21) class185.field2767.method494(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class430.field6402.method114(arg1, 0, 125);
        int var4 = 90 % ((-arg0 - 59) / 37);
        class21 var5 = new class21();
        if (var3 != null) {
            var5.method173(true, new class145(var3));
        }
        var5.method178(9176);
        class185.field2767.method485((long) arg1, (byte) -125, var5);
        return var5;
    }
}
