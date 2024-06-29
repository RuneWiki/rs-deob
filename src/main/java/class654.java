import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class654 extends class262 {

    @OriginalMember(owner = "client!fj", name = "N", descriptor = "Z")
    public static boolean field9329 = false;

    @OriginalMember(owner = "client!fj", name = "I", descriptor = "I")
    public static int field9324;

    @OriginalMember(owner = "client!fj", name = "J", descriptor = "I")
    public static int field9325;

    @OriginalMember(owner = "client!fj", name = "K", descriptor = "I")
    public static int field9326;

    @OriginalMember(owner = "client!fj", name = "L", descriptor = "I")
    public static int field9327;

    @OriginalMember(owner = "client!fj", name = "M", descriptor = "I")
    public static int field9328;

    @OriginalMember(owner = "client!fj", name = "O", descriptor = "I")
    public static int field9330;

    @OriginalMember(owner = "client!fj", name = "R", descriptor = "I")
    public static int field9333;

    @OriginalMember(owner = "client!fj", name = "Q", descriptor = "Loh;")
    public static class404 field9332;

    @OriginalMember(owner = "client!fj", name = "S", descriptor = "Lgn;")
    public static class699 field9334;

    @OriginalMember(owner = "client!fj", name = "P", descriptor = "[B")
    private byte[] field9331;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)V", line = 4)
    public static final void method3707(String arg0, int arg1, int arg2, String arg3) {
        if (arg1 != -1) {
            field9332 = null;
        }
        class126.field1328 = arg2;
        field9333++;
        class352.field4528 = 2;
        class714.method3989(arg3, false, arg0, 109);
    }

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "(I)V", line = 19)
    public static void method3708(int arg0) {
        field9332 = null;
        field9334 = null;
        if (arg0 != -8369) {
            field9332 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)Z", line = 32)
    public static final boolean method3709(int arg0, int arg1) {
        if (arg1 <= 124) {
            return true;
        } else {
            field9326++;
            return arg0 == 0 || arg0 == 1 || arg0 == 2;
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V", line = 43)
    public class654() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(BIII)[B", line = 47)
    public final byte[] method3710(byte arg0, int arg1, int arg2, int arg3) {
        field9327++;
        int var5 = -74 % ((arg0 - 65) / 38);
        this.field9331 = new byte[arg1 * arg3 * arg2 * 2];
        this.method3296((byte) -48, arg3, arg2, arg1);
        return this.field9331;
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(II)Lsq;", line = 60)
    public static final class178 method3711(int arg0, int arg1) {
        field9328++;
        class178[] var2 = class564.method3283(-106);
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field2093 == arg1) {
                return var2[var3];
            }
        }
        if (arg0 != 31725) {
            field9334 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(JB)V", line = 84)
    public static final void method3712(long arg0, byte arg1) {
        if (class638.field9170 != null) {
            if (class496.field7014 == 1 || class496.field7014 == 5) {
                class399.method2442((byte) -81, arg0);
            } else if (class496.field7014 == 4) {
                class678.method3851(true, arg0);
            }
        }
        field9325++;
        class380.method2335(class275.field3370, true, (long) class392.field5398);
        if (arg1 != -33) {
            method3709(117, -53);
        }
        if (class327.field4245 != -1) {
            class331.method1979(false, class327.field4245);
        }
        for (int var3 = 0; var3 < class717.field10056; var3++) {
            if (class272.field3360[var3]) {
                class344.field4472[var3] = true;
            }
            class459.field6560[var3] = class272.field3360[var3];
            class272.field3360[var3] = false;
        }
        class659.field9407 = class392.field5398;
        class203.method1223(-1, -1, (byte) -121, null);
        class446.method2764(null, -1, -1, arg1 ^ 0xFFFFFFDF);
        if (class327.field4245 != -1) {
            class717.field10056 = 0;
            class629.method3604((byte) 85);
        }
        class275.field3370.method393();
        class463.method2817(class275.field3370, (byte) 70);
        int var4 = class180.method1115((byte) -52);
        if (var4 == -1) {
            var4 = class61.field627;
        }
        if (var4 == -1) {
            var4 = class627.field9012;
        }
        class521.method3060(var4, -1);
        int var5 = class90.field937.method1128(arg1 + 32) << 8;
        class222.method1292(class90.field937.field4628, class721.field10119, 20294, class90.field937.field4635 + var5, class90.field937.field4629 + var5);
        class721.field10119 = 0;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILoh;)V", line = 153)
    public static final void method3713(int arg0, class404 arg1) {
        field9324++;
        class613.field8770 = arg1.method2474(-124, "p11_full");
        class630.field9062 = arg1.method2474(arg0 + 78, "p12_full");
        if (arg0 != 0) {
            method3712(25L, (byte) 54);
        }
        class152.field1671 = arg1.method2474(45, "b12_full");
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIB)V", line = 169)
    public final void method1574(int arg0, int arg1, byte arg2) {
        field9330++;
        if (arg1 != 3) {
            field9329 = true;
        }
        int var4 = arg0 * 2;
        byte var5 = (byte) ((arg2 >> 1 & 0x7F) + 127);
        int var6 = var4 + 1;
        this.field9331[var4] = var5;
        this.field9331[var6] = var5;
    }
}
