import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class790 {

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "Ltja;")
    private class288 field10874 = new class288(64);

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "Lbt;")
    private class48 field10872;

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "Lgha;")
    public static class366 field10873 = new class366();

    @OriginalMember(owner = "client!eca", name = "f", descriptor = "Z")
    public static boolean field10876 = true;

    @OriginalMember(owner = "client!eca", name = "g", descriptor = "I")
    public static int field10877 = 0;

    @OriginalMember(owner = "client!eca", name = "h", descriptor = "Llja;")
    public static class744 field10878 = new class744(1, 3);

    @OriginalMember(owner = "client!eca", name = "n", descriptor = "I")
    public static int field10884 = 1405;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "I")
    public static int field10871;

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "I")
    public static int field10875;

    @OriginalMember(owner = "client!eca", name = "i", descriptor = "I")
    public static int field10879;

    @OriginalMember(owner = "client!eca", name = "j", descriptor = "I")
    public static int field10880;

    @OriginalMember(owner = "client!eca", name = "k", descriptor = "I")
    public static int field10881;

    @OriginalMember(owner = "client!eca", name = "l", descriptor = "I")
    public static int field10882;

    @OriginalMember(owner = "client!eca", name = "m", descriptor = "J")
    public static long field10883;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZI)V", line = 3)
    public final void method4361(boolean arg0, int arg1) {
        if (!arg0) {
            field10876 = false;
        }
        class288 var3 = this.field10874;
        synchronized (this.field10874) {
            this.field10874.method1694(arg1, -116);
        }
        field10881++;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(B)V", line = 33)
    public final void method4362(byte arg0) {
        class288 var2 = this.field10874;
        synchronized (this.field10874) {
            int var3 = -109 / ((-arg0 - 43) / 54);
            this.field10874.method1690(0);
        }
        field10879++;
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lmja;ILbt;)V", line = 51)
    public class790(class441 arg0, int arg1, class48 arg2) {
        this.field10872 = arg2;
        if (this.field10872 != null) {
            this.field10872.method431(4, 11);
        }
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(B)V", line = 74)
    public static void method4363(byte arg0) {
        field10878 = null;
        if (arg0 != -118) {
            method4365(78, true);
        }
        field10873 = null;
    }

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "(B)V", line = 85)
    public final void method4364(byte arg0) {
        field10875++;
        class288 var2 = this.field10874;
        synchronized (this.field10874) {
            this.field10874.method1687((byte) 61);
        }
        if (arg0 > -23) {
            method4365(-82, false);
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IZ)V", line = 98)
    public static final void method4365(int arg0, boolean arg1) {
        field10882++;
        class594.field8080.method141(class434.field5738.method574());
        int[] var2 = class434.field5738.method569();
        class298.field3561 = var2[1];
        class49.field691 = var2[0];
        class699.field9508 = var2[arg0];
        class563.field7774 = var2[3];
        if (arg1) {
            class434.field5738.method565(class550.field7651, class674.field9243, class349.field4357, class303.field3616);
            class429.method2547(125, class635.field8664);
        } else {
            class434.field5738.method565(class322.field4005, class466.field6520, class194.field2306, class705.field9919);
            class429.method2547(125, class729.field10224);
        }
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(ZI)Lnw;", line = 131)
    public final class613 method4366(boolean arg0, int arg1) {
        field10880++;
        if (!arg0) {
            field10871 = 105;
        }
        class288 var3 = this.field10874;
        class613 var4;
        synchronized (this.field10874) {
            var4 = (class613) this.field10874.method1684((long) arg1, -359);
        }
        if (var4 != null) {
            return var4;
        }
        class48 var5 = this.field10872;
        byte[] var6;
        synchronized (this.field10872) {
            var6 = this.field10872.method437(11, (byte) 112, arg1);
        }
        class613 var7 = new class613();
        if (var6 != null) {
            var7.method3473(0, new class403(var6));
        }
        class288 var8 = this.field10874;
        synchronized (this.field10874) {
            this.field10874.method1686(-25638, (long) arg1, var7);
            return var7;
        }
    }
}
