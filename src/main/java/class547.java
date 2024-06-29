import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class547 {

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Luaa;")
    private class395 field7597 = new class395(64);

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Lgp;")
    private class561 field7607;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public int field7601;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Lpp;")
    public static class464 field7608 = new class464(21, -1);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field7599;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field7600;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field7602;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field7604;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field7605;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field7606;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Lpj;")
    public static class218 field7610;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Lgp;")
    public static class561 field7609;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public final void method3058(int arg0) {
        class395 var2 = this.field7597;
        synchronized (this.field7597) {
            this.field7597.method2406(23);
        }
        if (arg0 != 12398) {
            field7609 = null;
        }
        field7604++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZLoh;I)V")
    public static final void method3059(int arg0, boolean arg1, class549 arg2, int arg3) {
        if (!arg1) {
            return;
        }
        field7596++;
        class593 var4 = arg2.method3086(class159.field2378, 45);
        if (var4 == null) {
            return;
        }
        class159.field2378.method615(arg0, arg3, arg2.field7678 + arg0, arg2.field7776 + arg3);
        if (class473.field6783 < 3) {
            class61.field851.method967((float) arg2.field7678 / 2.0F + (float) arg0, (float) arg2.field7776 / 2.0F + (float) arg3, 4096, (int) (-class523.field7256) & 0x3FFF << 2, var4, arg0, arg3);
        } else {
            class159.field2378.method592(-16777216, var4, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Lhba;")
    public final class403 method3060(int arg0, int arg1) {
        field7600++;
        class395 var3 = this.field7597;
        class403 var4;
        synchronized (this.field7597) {
            var4 = (class403) this.field7597.method2407(false, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class561 var5 = this.field7607;
        byte[] var6;
        synchronized (this.field7607) {
            if (arg0 >= -40) {
                field7610 = null;
            }
            var6 = this.field7607.method3175(arg1, (byte) -53, 16);
        }
        class403 var7 = new class403();
        if (var6 != null) {
            var7.method2459(1, new class268(var6));
        }
        class395 var8 = this.field7597;
        synchronized (this.field7597) {
            this.field7597.method2408(var7, (long) arg1, -121);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)Loh;")
    public static final class549 method3061(int arg0, int arg1, int arg2) {
        field7603++;
        class549 var3 = class495.method2822((byte) -126, arg2);
        if (arg1 == -1) {
            return var3;
        } else if (arg0 == 4096) {
            return var3 == null || var3.field7684 == null || arg1 >= var3.field7684.length ? null : var3.field7684[arg1];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
    public final void method3062(int arg0) {
        field7605++;
        class395 var2 = this.field7597;
        synchronized (this.field7597) {
            if (arg0 < -52) {
                this.field7597.method2404((byte) -78);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
    public static final void method3063(byte arg0) {
        field7599++;
        int var1 = -54 % ((27 - arg0) / 44);
        class161.field2395.method2406(-117);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
    public static final void method3064(byte arg0) {
        int var1 = 3 % ((arg0 - 16) / 48);
        field7606++;
        if (class127.field2087 != null) {
            class127.field2087.method2076((byte) -113);
        }
        if (class384.field5706 != null) {
            class384.field5706.method2076((byte) -59);
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V")
    public final void method3065(int arg0, int arg1) {
        if (arg1 != -1) {
            this.field7597 = null;
        }
        field7598++;
        class395 var3 = this.field7597;
        synchronized (this.field7597) {
            this.field7597.method2397(arg0, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
    public static void method3066(int arg0) {
        field7609 = null;
        if (arg0 != 5708) {
            method3064((byte) 103);
        }
        field7610 = null;
        field7608 = null;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Ljc;ILgp;)V")
    public class547(class584 arg0, int arg1, class561 arg2) {
        this.field7607 = arg2;
        if (this.field7607 == null) {
            this.field7601 = 0;
        } else {
            this.field7601 = this.field7607.method3164(16, true);
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(III)Z")
    public static final boolean method3067(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method3064((byte) 86);
        }
        field7602++;
        return (arg1 & 0x40000) != 0 | class400.method2444(arg1, arg2, (byte) 25) || class155.method1097((byte) -99, arg2, arg1);
    }
}
