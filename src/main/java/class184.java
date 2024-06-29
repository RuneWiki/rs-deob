import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class184 {

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "Lbh;")
    private class538 field2662 = new class538(16);

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "Lwu;")
    private class557 field2663;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "Ljia;")
    public static class336 field2669 = new class336();

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
    public final void method1227(int arg0) {
        if (arg0 != 16518) {
            return;
        }
        class538 var2 = this.field2662;
        synchronized (this.field2662) {
            this.field2662.method3210(false);
        }
        field2666++;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIBI)V")
    public static final void method1228(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg0 > arg2) {
            for (int var5 = arg2; var5 < arg0; var5++) {
                class591.field8480[var5][arg1] = arg4;
            }
        } else {
            for (int var6 = arg0; var6 < arg2; var6++) {
                class591.field8480[var6][arg1] = arg4;
            }
        }
        if (arg3 == 113) {
            field2667++;
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)I")
    public static final int method1229(int arg0, int arg1) {
        field2664++;
        byte var2;
        if (arg1 > 12000) {
            class220.method1437(0);
            var2 = 4;
        } else if (arg1 > 5000) {
            var2 = 3;
            class72.method460(73);
        } else if (arg1 <= 2000) {
            class144.method942(123, true);
            var2 = 1;
        } else {
            var2 = 2;
            class668.method3825(arg0 - 12220);
        }
        if (class674.field9500.field5158.method1006(arg0 ^ arg0) != 2) {
            class674.field9500.method2250((byte) 120, 2, class674.field9500.field5118);
            class736.method4088((byte) 122, false, 2);
        }
        class199.method1350(arg0 ^ 0xFFFF8A59);
        return var2;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILmj;IZII)Liw;")
    public final class608 method1230(int arg0, class713 arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field2661++;
        class334[] var7 = null;
        if (arg3) {
            method1229(-83, -121);
        }
        class569 var8 = this.method1231((byte) 107, arg5);
        if (var8.field8068 != null) {
            var7 = new class334[var8.field8068.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class440 var10 = arg1.method4023(var8.field8068[var9], 0);
                var7[var9] = new class334(var10.field6027, var10.field6032, var10.field6025, var10.field6028, var10.field6034, var10.field6035, var10.field6026, var10.field6031);
            }
        }
        return new class608(var8.field8066, var7, var8.field8070, arg2, arg0, arg4);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BI)Llda;")
    private final class569 method1231(byte arg0, int arg1) {
        field2660++;
        class538 var3 = this.field2662;
        class569 var4;
        synchronized (this.field2662) {
            var4 = (class569) this.field2662.method3200((long) arg1, -19983);
        }
        if (var4 != null) {
            return var4;
        }
        class557 var5 = this.field2663;
        byte[] var6;
        synchronized (this.field2663) {
            var6 = this.field2663.method3322(29, arg1, (byte) 125);
        }
        class569 var7 = new class569();
        if (var6 != null) {
            var7.method3404((byte) -118, new class26(var6));
        }
        class538 var8 = this.field2662;
        synchronized (this.field2662) {
            this.field2662.method3199((byte) 78, var7, (long) arg1);
        }
        if (arg0 < 12) {
            this.method1230(43, null, -126, false, 83, -79);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(II)V")
    public final void method1232(int arg0, int arg1) {
        class538 var3 = this.field2662;
        synchronized (this.field2662) {
            this.field2662.method3204((byte) 66, arg0);
        }
        if (arg1 != 29) {
            field2669 = null;
        }
        field2665++;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V")
    public static void method1233(byte arg0) {
        if (arg0 != 31) {
            field2669 = null;
        }
        field2669 = null;
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lwj;ILwu;)V")
    public class184(class121 arg0, int arg1, class557 arg2) {
        this.field2663 = arg2;
        this.field2663.method3333(29, 3443);
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V")
    public final void method1234(int arg0) {
        field2668++;
        class538 var2 = this.field2662;
        synchronized (this.field2662) {
            if (arg0 < 60) {
                this.method1230(57, null, -106, false, -86, -14);
            }
            this.field2662.method3202((byte) 127);
        }
    }
}
