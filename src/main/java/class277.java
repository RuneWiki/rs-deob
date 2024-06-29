import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class277 {

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "Lfr;")
    private class231 field4549 = new class231(128);

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "Lqs;")
    private class496 field4544;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "Z")
    public static boolean field4545 = false;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public static int field4548 = 104;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Lnk;")
    public static class326 field4546 = new class326(24, -1);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZB)Z")
    public static final boolean method1825(boolean arg0, byte arg1) {
        if (arg1 != 54) {
            field4546 = null;
        }
        field4550++;
        boolean var2 = class305.field4873.method903();
        if (var2 == arg0) {
            return true;
        }
        if (!arg0) {
            class305.field4873.method842();
        } else if (!class305.field4873.method906()) {
            arg0 = false;
        }
        if (var2 == arg0) {
            return false;
        } else {
            class510.field7403.field5115 = arg0;
            class510.field7403.method1190(class419.field6342, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIII)V")
    public static final void method1826(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4543++;
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        class357.method2291(arg4 - arg3, arg2, class209.field3294[arg1], arg3 + arg4, arg0);
        int var8 = -1;
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class209.field3294[arg1 + var6];
                int[] var10 = class209.field3294[arg1 - var6];
                int var11 = arg4 + var5;
                int var12 = arg4 - var5;
                class357.method2291(var12, arg2, var9, var11, -1);
                class357.method2291(var12, arg2, var10, var11, arg0);
            }
            int var13 = arg4 + var6;
            int var14 = arg4 - var6;
            int[] var15 = class209.field3294[arg1 + var5];
            int[] var16 = class209.field3294[arg1 - var5];
            class357.method2291(var14, arg2, var15, var13, -1);
            class357.method2291(var14, arg2, var16, var13, -1);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)Lrj;")
    public final class525 method1827(int arg0, int arg1) {
        field4551++;
        class231 var3 = this.field4549;
        class525 var4;
        synchronized (this.field4549) {
            if (arg1 >= -43) {
                field4548 = 64;
            }
            var4 = (class525) this.field4549.method1593((byte) 32, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4544.method2926(class137.method1030(20, arg0), -113, class364.method2324(true, arg0));
        class525 var6 = new class525();
        if (var5 != null) {
            var6.method3107(new class23(var5), 48);
        }
        class231 var7 = this.field4549;
        synchronized (this.field4549) {
            this.field4549.method1595(var6, (long) arg0, (byte) -121);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1828(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 <= 83) {
            return;
        }
        field4547++;
        if (!class468.method2782(arg9, -24955)) {
            return;
        }
        if (class251.field4291[arg9] == null) {
            client.method484(class508.field7389[arg9], -1, arg4, arg6, arg3, arg2, arg0, arg5, arg8, arg1);
        } else {
            client.method484(class251.field4291[arg9], -1, arg4, arg6, arg3, arg2, arg0, arg5, arg8, arg1);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
    public static void method1829(int arg0) {
        if (arg0 < -87) {
            field4546 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Lwv;ILqs;)V")
    public class277(class535 arg0, int arg1, class496 arg2) {
        this.field4544 = arg2;
        if (this.field4544 != null) {
            int var4 = this.field4544.method2919((byte) 61) - 1;
            this.field4544.method2940(var4, -10511);
        }
    }
}
