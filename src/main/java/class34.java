import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class34 {

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "Lfr;")
    private class231 field523 = new class231(64);

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "Lqs;")
    private class496 field522;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "[Z")
    public static boolean[] field524 = new boolean[200];

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "I")
    public static int field529 = 1338;

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "[I")
    public static int[] field525;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(III)V")
    public static final void method258(int arg0, int arg1, int arg2) {
        field527++;
        if (class402.field6113 != arg2) {
            class276.field4540 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class276.field4540[var3] = (var3 << 12) / arg2;
            }
            class402.field6113 = arg2;
            class269.field4478 = arg2 - 1;
            class517.field7650 = arg2 * 32;
        }
        if (arg0 >= -28) {
            method261(-27);
        }
        if (class227.field3953 == arg1) {
            return;
        }
        if (class402.field6113 == arg1) {
            class412.field6233 = class276.field4540;
        } else {
            class412.field6233 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class412.field6233[var4] = (var4 << 12) / arg1;
            }
        }
        class270.field4492 = arg1 - 1;
        class227.field3953 = arg1;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZI)Lrd;")
    public final class348 method259(boolean arg0, int arg1) {
        field528++;
        class231 var3 = this.field523;
        class348 var4;
        synchronized (this.field523) {
            var4 = (class348) this.field523.method1593((byte) 126, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class496 var5 = this.field522;
        byte[] var6;
        synchronized (this.field522) {
            var6 = this.field522.method2926(arg1, -63, 5);
            if (!arg0) {
                method261(-110);
            }
        }
        class348 var7 = new class348();
        if (var6 != null) {
            var7.method2247(new class23(var6), (byte) -17);
        }
        class231 var8 = this.field523;
        synchronized (this.field523) {
            this.field523.method1595(var7, (long) arg1, (byte) -127);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IB)V")
    public static final void method260(int arg0, byte arg1) {
        class247.field4237 = arg0;
        field526++;
        if (arg1 <= -66) {
            class239.field4117.method1604(4);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
    public static void method261(int arg0) {
        field525 = null;
        if (arg0 != 64) {
            field524 = null;
        }
        field524 = null;
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(Lwv;ILqs;)V")
    public class34(class535 arg0, int arg1, class496 arg2) {
        this.field522 = arg2;
        this.field522.method2940(5, -10511);
    }

    static {
        new class306("Use", "Benutzen", "Utiliser", "Usar");
    }
}
