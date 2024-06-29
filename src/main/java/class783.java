import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sda")
public class class783 {

    @OriginalMember(owner = "client!sda", name = "j", descriptor = "Z")
    public boolean field10715 = false;

    @OriginalMember(owner = "client!sda", name = "h", descriptor = "Ltq;")
    private class536 field10713 = new class536(64);

    @OriginalMember(owner = "client!sda", name = "s", descriptor = "Ltq;")
    public class536 field10724 = new class536(500);

    @OriginalMember(owner = "client!sda", name = "t", descriptor = "Ltq;")
    public class536 field10725 = new class536(30);

    @OriginalMember(owner = "client!sda", name = "u", descriptor = "Ltq;")
    public class536 field10726 = new class536(50);

    @OriginalMember(owner = "client!sda", name = "o", descriptor = "Lwm;")
    public class30 field10720;

    @OriginalMember(owner = "client!sda", name = "e", descriptor = "Z")
    public boolean field10710;

    @OriginalMember(owner = "client!sda", name = "d", descriptor = "Lwm;")
    private class30 field10709;

    @OriginalMember(owner = "client!sda", name = "i", descriptor = "I")
    public static int field10714 = 0;

    @OriginalMember(owner = "client!sda", name = "n", descriptor = "Z")
    public static boolean field10719 = false;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "I")
    public static int field10706;

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "I")
    public static int field10707;

    @OriginalMember(owner = "client!sda", name = "c", descriptor = "I")
    public static int field10708;

    @OriginalMember(owner = "client!sda", name = "f", descriptor = "I")
    public static int field10711;

    @OriginalMember(owner = "client!sda", name = "g", descriptor = "I")
    public static int field10712;

    @OriginalMember(owner = "client!sda", name = "l", descriptor = "I")
    public static int field10717;

    @OriginalMember(owner = "client!sda", name = "m", descriptor = "I")
    public static int field10718;

    @OriginalMember(owner = "client!sda", name = "p", descriptor = "I")
    public static int field10721;

    @OriginalMember(owner = "client!sda", name = "q", descriptor = "I")
    public static int field10722;

    @OriginalMember(owner = "client!sda", name = "r", descriptor = "I")
    public static int field10723;

    @OriginalMember(owner = "client!sda", name = "v", descriptor = "I")
    public int field10727;

    @OriginalMember(owner = "client!sda", name = "k", descriptor = "Ltba;")
    public static class339 field10716;

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(II)V", line = 3)
    public final void method4287(int arg0, int arg1) {
        field10706++;
        this.field10713 = new class536(arg0);
        if (arg1 >= -17) {
            this.method4288(88);
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(I)V", line = 21)
    public final void method4288(int arg0) {
        class536 var2 = this.field10713;
        synchronized (this.field10713) {
            if (arg0 != 2) {
                this.field10725 = null;
            }
            this.field10713.method2932((byte) 80);
        }
        field10717++;
        class536 var3 = this.field10724;
        synchronized (this.field10724) {
            this.field10724.method2932((byte) 80);
        }
        class536 var4 = this.field10725;
        synchronized (this.field10725) {
            this.field10725.method2932((byte) 80);
        }
        class536 var5 = this.field10726;
        synchronized (this.field10726) {
            this.field10726.method2932((byte) 80);
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(BZ)V", line = 43)
    public final void method4289(byte arg0, boolean arg1) {
        field10718++;
        int var3 = 2 % ((-arg0 - 10) / 61);
        if (this.field10710 != arg1) {
            this.field10710 = arg1;
            this.method4291(0);
        }
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(II)V", line = 58)
    public final void method4290(int arg0, int arg1) {
        class536 var3 = this.field10713;
        synchronized (this.field10713) {
            this.field10713.method2928(true, arg0);
        }
        if (arg1 != 500) {
            return;
        }
        field10711++;
        class536 var4 = this.field10724;
        synchronized (this.field10724) {
            this.field10724.method2928(true, arg0);
        }
        class536 var5 = this.field10725;
        synchronized (this.field10725) {
            this.field10725.method2928(true, arg0);
        }
        class536 var6 = this.field10726;
        synchronized (this.field10726) {
            this.field10726.method2928(true, arg0);
        }
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)V", line = 81)
    public final void method4291(int arg0) {
        field10708++;
        class536 var2 = this.field10713;
        synchronized (this.field10713) {
            this.field10713.method2919(arg0 ^ arg0);
        }
        class536 var3 = this.field10724;
        synchronized (this.field10724) {
            this.field10724.method2919(0);
        }
        class536 var4 = this.field10725;
        synchronized (this.field10725) {
            this.field10725.method2919(arg0);
        }
        class536 var5 = this.field10726;
        synchronized (this.field10726) {
            this.field10726.method2919(arg0);
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IB)Lih;", line = 100)
    public final class773 method4292(int arg0, byte arg1) {
        field10707++;
        class536 var3 = this.field10713;
        class773 var4;
        synchronized (this.field10713) {
            var4 = (class773) this.field10713.method2931((long) arg0, (byte) -99);
        }
        if (var4 != null) {
            return var4;
        }
        class30 var5 = this.field10709;
        byte[] var6;
        synchronized (this.field10709) {
            var6 = this.field10709.method139(class154.method872(-112, arg0), (byte) -94, class718.method3849(arg0, -128));
        }
        class773 var7 = new class773();
        var7.field10482 = this;
        var7.field10531 = arg0;
        if (var6 != null) {
            var7.method4216(0, new class234(var6));
        }
        var7.method4224((byte) 119);
        if (arg1 > -73) {
            return null;
        }
        if (!this.field10710 && var7.field10526) {
            var7.field10529 = null;
            var7.field10502 = null;
        }
        if (var7.field10507) {
            var7.field10479 = false;
            var7.field10464 = 0;
        }
        class536 var8 = this.field10713;
        synchronized (this.field10713) {
            this.field10713.method2918((long) arg0, var7, 112);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sda", name = "b", descriptor = "(IB)V", line = 148)
    public final void method4293(int arg0, byte arg1) {
        this.field10727 = arg0;
        if (arg1 != 20) {
            this.field10727 = 2;
        }
        field10722++;
        class536 var3 = this.field10724;
        synchronized (this.field10724) {
            this.field10724.method2919(arg1 - 20);
        }
        class536 var4 = this.field10725;
        synchronized (this.field10725) {
            this.field10725.method2919(0);
        }
        class536 var5 = this.field10726;
        synchronized (this.field10726) {
            this.field10726.method2919(0);
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(ZZ)V", line = 169)
    public final void method4294(boolean arg0, boolean arg1) {
        field10721++;
        if (this.field10715 != arg1 && arg0) {
            this.field10715 = arg1;
            this.method4291(0);
        }
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(B)V", line = 186)
    public static void method4295(byte arg0) {
        if (arg0 <= 22) {
            field10716 = null;
        }
        field10716 = null;
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(BII)I", line = 200)
    public static final int method4296(byte arg0, int arg1, int arg2) {
        if (arg0 != 57) {
            method4296((byte) -97, -56, 124);
        }
        field10723++;
        double var3 = Math.log((double) arg2) / Math.log(2.0D);
        double var5 = Math.log((double) arg1) / Math.log(2.0D);
        double var7 = var5 + (var3 - var5) * Math.random();
        return (int) (Math.pow(2.0D, var7) + 0.5D);
    }

    @OriginalMember(owner = "client!sda", name = "a", descriptor = "(IZII[Luaa;I)V", line = 221)
    public static final void method4297(int arg0, boolean arg1, int arg2, int arg3, class391[] arg4, int arg5) {
        for (int var6 = arg3; var6 < arg4.length; var6++) {
            class391 var7 = arg4[var6];
            if (var7 != null && var7.field5136 == arg0) {
                class310.method1828(arg2, arg5, arg1, 512, var7);
                class102.method596(var7, -5, arg5, arg2);
                if ((var7.field4991 - var7.field5117) < var7.field4994) {
                    var7.field4994 = var7.field4991 - var7.field5117;
                }
                if (var7.field5010 - var7.field5031 < var7.field4984) {
                    var7.field4984 = var7.field5010 - var7.field5031;
                }
                if (var7.field4994 < 0) {
                    var7.field4994 = 0;
                }
                if (var7.field4984 < 0) {
                    var7.field4984 = 0;
                }
                if (var7.field5007 == 0) {
                    class564.method3052(var7, arg1, arg3 - 1);
                }
            }
        }
        field10712++;
    }

    @OriginalMember(owner = "client!sda", name = "<init>", descriptor = "(Lega;IZLwm;Lwm;)V", line = 295)
    public class783(class473 arg0, int arg1, boolean arg2, class30 arg3, class30 arg4) {
        this.field10720 = arg4;
        this.field10710 = arg2;
        this.field10709 = arg3;
        if (this.field10709 != null) {
            int var6 = this.field10709.method143((byte) 106) - 1;
            this.field10709.method138(0, var6);
        }
    }
}
