import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class723 {

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "Ltq;")
    private class536 field9495 = new class536(16);

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "Lwm;")
    private class30 field9489;

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "[I")
    public static int[] field9490 = new int[2048];

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "Z")
    public static boolean field9497 = false;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
    public static int field9487;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
    public static int field9491;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
    public static int field9492;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
    public static int field9493;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "I")
    public static int field9494;

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
    public static int field9496;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "[B")
    public static byte[] field9488;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V", line = 4)
    public final void method3867(boolean arg0) {
        field9487++;
        class536 var2 = this.field9495;
        synchronized (this.field9495) {
            if (arg0) {
                method3873(true);
            }
            this.field9495.method2919(0);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)V", line = 18)
    public static void method3868(int arg0) {
        field9490 = null;
        if (arg0 <= 17) {
            field9488 = null;
        }
        field9488 = null;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(II)Lri;", line = 38)
    private final class361 method3869(int arg0, int arg1) {
        field9492++;
        class536 var3 = this.field9495;
        class361 var4;
        synchronized (this.field9495) {
            var4 = (class361) this.field9495.method2931((long) arg1, (byte) -81);
        }
        if (var4 != null) {
            return var4;
        }
        class30 var5 = this.field9489;
        byte[] var6;
        synchronized (this.field9489) {
            var6 = this.field9489.method139(29, (byte) -94, arg1);
        }
        class361 var7 = new class361();
        if (var6 != null) {
            var7.method2082(new class234(var6), (byte) -123);
        }
        class536 var8 = this.field9495;
        synchronized (this.field9495) {
            this.field9495.method2918((long) arg1, var7, 125);
        }
        return arg0 == 29246 ? var7 : null;
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V", line = 70)
    public final void method3870(int arg0) {
        if (arg0 != 29) {
            this.method3870(66);
        }
        field9496++;
        class536 var2 = this.field9495;
        synchronized (this.field9495) {
            this.field9495.method2932((byte) 80);
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BIIIILfl;)Lam;", line = 84)
    public final class60 method3871(byte arg0, int arg1, int arg2, int arg3, int arg4, class545 arg5) {
        field9494++;
        class690[] var7 = null;
        class361 var8 = this.method3869(29246, arg4);
        if (arg0 != -121) {
            return null;
        }
        if (var8.field4394 != null) {
            var7 = new class690[var8.field4394.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class376 var10 = arg5.method2955(-119, var8.field4394[var9]);
                var7[var9] = new class690(var10.field4596, var10.field4593, var10.field4588, var10.field4601, var10.field4594, var10.field4597, var10.field4590, var10.field4592);
            }
        }
        return new class60(var8.field4396, var7, var8.field4391, arg2, arg3, arg1);
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(II)V", line = 116)
    public final void method3872(int arg0, int arg1) {
        field9491++;
        class536 var3 = this.field9495;
        synchronized (this.field9495) {
            this.field9495.method2928(true, arg1);
        }
        if (arg0 != 22021) {
            this.method3869(-77, -124);
        }
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(Z)V", line = 133)
    public static final void method3873(boolean arg0) {
        field9493++;
        int var1 = 0;
        if (class485.field6252.field6947.method106(arg0) == 1) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (class485.field6252.field6913.method3304(arg0) == 0) {
            var1 |= 0x40;
        }
        class687.method3678(-80, var1);
        class390.field4983.method4293(var1, (byte) 20);
        class640.field8189.method697(var1, 101);
        class595.field7561.method767(var1, -1);
        class62.field819.method563(var1, (byte) 29);
        class699.method3798(300, var1);
        class29.method123(!arg0, var1);
        class572.method3084(var1, 78);
        class276.method1700(7446, var1);
        class486.method2723(-8);
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lega;ILwm;)V", line = 173)
    public class723(class473 arg0, int arg1, class30 arg2) {
        this.field9489 = arg2;
        this.field9489.method138(0, 29);
    }
}
