import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class551 {

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Lmga;")
    private class666 field7331 = new class666(64);

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "Lbi;")
    private class449 field7333;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field7338 = -1;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Ljava/lang/String;")
    public static String field7334 = null;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Ldb;")
    public static class298 field7336 = new class298(103, 0);

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Lcu;")
    public static class206 field7339 = new class206(53, -1);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public final void method3057(byte arg0) {
        int var2 = 27 / ((-arg0 - 35) / 63);
        class666 var3 = this.field7331;
        synchronized (this.field7331) {
            this.field7331.method3739(0);
        }
        field7330++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public final void method3058(int arg0) {
        int var2 = -68 % ((arg0 + 22) / 58);
        class666 var3 = this.field7331;
        synchronized (this.field7331) {
            this.field7331.method3748(6);
        }
        field7335++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V")
    public final void method3059(int arg0, int arg1) {
        class666 var3 = this.field7331;
        synchronized (this.field7331) {
            this.field7331.method3740((byte) 60, arg1);
        }
        if (arg0 == 103) {
            field7337++;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Loa;IIIILgba;IILfa;)V")
    public static final void method3060(class651 arg0, int arg1, int arg2, int arg3, int arg4, class625 arg5, int arg6, int arg7, class217 arg8) {
        if (arg6 != 2) {
            method3061(78);
        }
        field7332++;
        class634 var9 = class521.field6960.method1487(arg7, (byte) 115);
        if (var9 == null || !var9.field8513 || !var9.method3507(class80.field1261, true)) {
            return;
        }
        if (var9.field8532 != null) {
            int[] var10 = new int[var9.field8532.length];
            for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                int var13;
                if (class140.field2254 == 4) {
                    var13 = (int) class42.field602 & 0x3FFF;
                } else {
                    var13 = (int) class42.field602 + class588.field7795 & 0x3FFF;
                }
                int var14 = class126.field2116[var13];
                int var15 = class126.field2105[var13];
                if (class140.field2254 != 4) {
                    var15 = var15 * 256 / (class376.field5073 + 256);
                    var14 = var14 * 256 / (class376.field5073 + 256);
                }
                var10[var11 * 2] = ((arg4 + (var9.field8532[var11 * 2] * 4)) * var15 + (arg2 + (var9.field8532[var11 * 2 + 1] * 4)) * var14 >> 14) + arg5.field8350 / 2 + arg1;
                var10[var11 * 2 + 1] = arg5.field8361 / 2 + arg3 - ((var9.field8532[var11 * 2 + 1] * 4 + arg2) * var15 - ((var9.field8532[var11 * 2] * 4 + arg4) * var14) >> 14);
            }
            class614.method3356(arg0, var10, var9.field8552, arg5.field8434, arg5.field8445);
            for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                arg0.method437(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[(var12 + 1) * 2 + 1], var9.field8549, 1, arg8, arg1, arg3);
            }
            arg0.method437(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field8549, 1, arg8, arg1, arg3);
        }
        class468 var16 = null;
        if (var9.field8554 != -1) {
            var16 = var9.method3505(false, arg0, (byte) -104);
            if (var16 != null) {
                class146.method1056(arg8, arg1, arg2, arg4, arg5, false, var16, arg3);
            }
        }
        if (var9.field8541 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method1028();
        }
        class200 var18 = class700.field9851;
        class511 var19 = class664.field9424;
        if (var9.field8547 == 1) {
            var18 = class188.field2788;
            var19 = class665.field9437;
        }
        if (var9.field8547 == 2) {
            var19 = class193.field2823;
            var18 = class450.field6177;
        }
        class279.method1740(arg5, arg1, var17, arg3, var9.field8541, arg4, arg8, var9.field8546, (byte) -122, var19, arg2, var18);
        return;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
    public static void method3061(int arg0) {
        field7336 = null;
        field7339 = null;
        if (arg0 != 16268) {
            field7338 = -73;
        }
        field7334 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)Lcr;")
    public final class538 method3062(byte arg0, int arg1) {
        field7340++;
        if (arg0 > -63) {
            return null;
        }
        class666 var3 = this.field7331;
        class538 var4;
        synchronized (this.field7331) {
            var4 = (class538) this.field7331.method3750((long) arg1, false);
        }
        if (var4 != null) {
            return var4;
        }
        class449 var5 = this.field7333;
        byte[] var6;
        synchronized (this.field7333) {
            var6 = this.field7333.method2537(false, 11, arg1);
        }
        class538 var7 = new class538();
        if (var6 != null) {
            var7.method2977((byte) -113, new class335(var6));
        }
        class666 var8 = this.field7331;
        synchronized (this.field7331) {
            this.field7331.method3745(1, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lpca;ILbi;)V")
    public class551(class671 arg0, int arg1, class449 arg2) {
        this.field7333 = arg2;
        if (this.field7333 != null) {
            this.field7333.method2527(0, 11);
        }
    }
}
