import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class169 {

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "Lnga;")
    private class510 field2476 = new class510(64);

    @OriginalMember(owner = "client!gw", name = "k", descriptor = "Leq;")
    private class209 field2484;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "[I")
    public static int[] field2478 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "I")
    public static int field2483;

    static {
        new class271("", 76);
        field2482 = 0;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(II[B)[B", line = 5)
    public static final byte[] method1248(int arg0, int arg1, byte[] arg2) {
        field2477++;
        byte[] var3 = new byte[arg1];
        if (arg0 != 65535) {
            field2482 = 10;
        }
        class622.method3597(arg2, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V", line = 21)
    public static final void method1249(byte arg0) {
        field2479++;
        class577.field8163 = true;
        int var1 = 116 / ((-arg0 - 1) / 59);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V", line = 31)
    public static void method1250(int arg0) {
        field2478 = null;
        int var1 = 83 % ((-arg0 - 4) / 42);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)Lis;", line = 41)
    public final class500 method1251(int arg0, int arg1) {
        field2481++;
        class510 var3 = this.field2476;
        class500 var4;
        synchronized (this.field2476) {
            var4 = (class500) this.field2476.method3054((byte) -114, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class209 var5 = this.field2484;
        byte[] var6;
        synchronized (this.field2484) {
            var6 = this.field2484.method1453(arg0, -122, 32);
        }
        class500 var7 = new class500();
        if (arg1 > -84) {
            return null;
        }
        if (var6 != null) {
            var7.method3005(new class35(var6), 65);
        }
        class510 var8 = this.field2476;
        synchronized (this.field2476) {
            this.field2476.method3047(false, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(B)V", line = 75)
    public final void method1252(byte arg0) {
        if (arg0 < 50) {
            return;
        }
        field2475++;
        class510 var2 = this.field2476;
        synchronized (this.field2476) {
            this.field2476.method3050(false);
        }
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V", line = 93)
    public final void method1253(int arg0) {
        class510 var2 = this.field2476;
        synchronized (this.field2476) {
            this.field2476.method3048(false);
        }
        if (arg0 == 64) {
            field2480++;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IB)V", line = 113)
    public final void method1254(int arg0, byte arg1) {
        field2474++;
        if (arg1 < -87) {
            class510 var3 = this.field2476;
            synchronized (this.field2476) {
                this.field2476.method3049(arg0, (byte) 126);
            }
        }
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lcw;ILeq;)V", line = 132)
    public class169(class179 arg0, int arg1, class209 arg2) {
        this.field2484 = arg2;
        this.field2484.method1477(0, 32);
    }
}
