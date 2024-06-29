import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class160 {

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "Ljr;")
    private class112 field2561 = new class112(16);

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "Lin;")
    private class91 field2567;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "Lej;")
    public static class124 field2565 = new class124(12, 3);

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "Z")
    public static boolean field2569 = false;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "[I")
    public static int[] field2570;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "[Lmi;")
    public static class496[] field2568;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)V", line = 6)
    public final void method1224(int arg0, int arg1) {
        if (arg1 != 16) {
            this.field2567 = null;
        }
        class112 var3 = this.field2561;
        synchronized (this.field2561) {
            this.field2561.method987(2, arg0);
        }
        field2566++;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V", line = 23)
    public final void method1225(byte arg0) {
        field2572++;
        int var2 = 111 % ((arg0 + 40) / 57);
        class112 var3 = this.field2561;
        synchronized (this.field2561) {
            this.field2561.method999(0);
        }
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(II)Liea;", line = 36)
    public final class479 method1226(int arg0, int arg1) {
        field2562++;
        class112 var3 = this.field2561;
        class479 var4;
        synchronized (this.field2561) {
            var4 = (class479) this.field2561.method992((long) arg0, -91);
        }
        if (var4 != null) {
            return var4;
        }
        class91 var5 = this.field2567;
        byte[] var6;
        synchronized (this.field2567) {
            var6 = this.field2567.method863(-1860, 30, arg0);
        }
        if (arg1 < 6) {
            this.field2561 = null;
        }
        class479 var7 = new class479();
        if (var6 != null) {
            var7.method2809(new class215(var6), (byte) 54);
        }
        class112 var8 = this.field2561;
        synchronized (this.field2561) {
            this.field2561.method991(var7, (long) arg0, (byte) -109);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V", line = 70)
    public final void method1227(int arg0) {
        class112 var2 = this.field2561;
        synchronized (this.field2561) {
            if (arg0 != -797644856) {
                field2568 = null;
            }
            this.field2561.method996(arg0 ^ 0x2F8B186F);
        }
        field2573++;
    }

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(II)S", line = 92)
    public static final short method1228(int arg0, int arg1) {
        field2563++;
        int var2 = (arg0 & 0xFE66) >> 10;
        int var3 = arg0 >> 3 & 0x70;
        int var4 = arg0 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return arg1 == 30 ? (short) (var6 | var7 >> 4 << 7 | var2 << 10) : 79;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)V", line = 120)
    public static final void method1229(int arg0, int arg1, int arg2) {
        field2564++;
        if (arg1 != 437853543) {
            field2569 = true;
        }
        class594 var3 = class692.method3869(arg2, (byte) 105, 16);
        var3.method3378(-25490);
        var3.field8126 = arg0;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)V", line = 134)
    public static void method1230(byte arg0) {
        field2570 = null;
        if (arg0 != 79) {
            method1228(-22, -13);
        }
        field2565 = null;
        field2568 = null;
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lsj;ILin;)V", line = 149)
    public class160(class460 arg0, int arg1, class91 arg2) {
        this.field2567 = arg2;
        this.field2567.method860(0, 30);
    }
}
