import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class514 {

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "Lvg;")
    private class49 field7478 = new class49(64);

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "Lri;")
    private class97 field7479;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public int field7473;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "[I")
    public static int[] field7472 = new int[14];

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field7470;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "I")
    public static int field7471;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field7474;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "J")
    public static long field7477;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)Lgr;")
    public final class400 method3114(int arg0, int arg1) {
        field7475++;
        class49 var3 = this.field7478;
        class400 var4;
        synchronized (this.field7478) {
            var4 = (class400) this.field7478.method560(false, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class97 var5 = this.field7479;
        byte[] var6;
        synchronized (this.field7479) {
            var6 = this.field7479.method926(16, -128, arg0);
        }
        class400 var7 = new class400();
        if (var6 != null) {
            var7.method2572(new class6(var6), 0);
        }
        class49 var8 = this.field7478;
        synchronized (this.field7478) {
            this.field7478.method559(var7, (long) arg0, arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)V")
    public final void method3115(int arg0, int arg1) {
        field7470++;
        class49 var3 = this.field7478;
        synchronized (this.field7478) {
            this.field7478.method573((byte) 124, arg1);
        }
        if (arg0 != 64) {
            this.method3116((byte) -5);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
    public final void method3116(byte arg0) {
        if (arg0 != -72) {
            return;
        }
        class49 var2 = this.field7478;
        synchronized (this.field7478) {
            this.field7478.method569(0);
        }
        field7471++;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IILri;)Lfm;")
    public static final class683 method3117(int arg0, int arg1, class97 arg2) {
        if (arg1 != 16) {
            method3119(88);
        }
        field7476++;
        byte[] var3 = arg2.method952(84, arg0);
        return var3 == null ? null : new class683(var3);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V")
    public final void method3118(int arg0) {
        field7474++;
        class49 var2 = this.field7478;
        synchronized (this.field7478) {
            if (arg0 <= -1) {
                this.field7478.method563(0);
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V")
    public static void method3119(int arg0) {
        int var1 = -73 / ((9 - arg0) / 55);
        field7472 = null;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lei;ILri;)V")
    public class514(class162 arg0, int arg1, class97 arg2) {
        this.field7479 = arg2;
        if (this.field7479 == null) {
            this.field7473 = 0;
        } else {
            this.field7473 = this.field7479.method949(16, 0);
        }
    }
}
