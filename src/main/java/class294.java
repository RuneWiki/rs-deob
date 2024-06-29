import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class294 {

    @OriginalMember(owner = "client!fe", name = "k", descriptor = "Z")
    public boolean field3941 = false;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "Lvi;")
    private class560 field3938 = new class560(64);

    @OriginalMember(owner = "client!fe", name = "s", descriptor = "Lvi;")
    public class560 field3949 = new class560(500);

    @OriginalMember(owner = "client!fe", name = "t", descriptor = "Lvi;")
    public class560 field3950 = new class560(30);

    @OriginalMember(owner = "client!fe", name = "u", descriptor = "Lvi;")
    public class560 field3951 = new class560(50);

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Z")
    public boolean field3936;

    @OriginalMember(owner = "client!fe", name = "l", descriptor = "Lpq;")
    private class159 field3942;

    @OriginalMember(owner = "client!fe", name = "r", descriptor = "Lpq;")
    public class159 field3948;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field3939 = 0;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Lcb;")
    public static class318 field3935 = new class318(77, 2);

    @OriginalMember(owner = "client!fe", name = "q", descriptor = "I")
    public static int field3947 = 0;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!fe", name = "m", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!fe", name = "n", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!fe", name = "p", descriptor = "I")
    public static int field3946;

    @OriginalMember(owner = "client!fe", name = "v", descriptor = "I")
    public int field3952;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IBI)V")
    public static final void method1741(int arg0, byte arg1, int arg2) {
        field3932++;
        if (arg1 != -8) {
            method1748(120);
        }
        if (class688.field9717 == 1) {
            class565.method3192(class50.field664, arg0, -85, arg2);
        } else if (class688.field9717 == 2) {
            class7.method46(arg2, (byte) -52, arg0);
        }
        class50.field664 = null;
        class688.field9717 = 0;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
    public final void method1742(int arg0) {
        int var2 = -19 % ((-arg0 - 37) / 42);
        class560 var3 = this.field3938;
        synchronized (this.field3938) {
            this.field3938.method3142(false);
        }
        field3934++;
        class560 var4 = this.field3949;
        synchronized (this.field3949) {
            this.field3949.method3142(false);
        }
        class560 var5 = this.field3950;
        synchronized (this.field3950) {
            this.field3950.method3142(false);
        }
        class560 var6 = this.field3951;
        synchronized (this.field3951) {
            this.field3951.method3142(false);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(BI)V")
    public final void method1743(byte arg0, int arg1) {
        field3933++;
        if (arg0 <= 18) {
            this.field3948 = null;
        }
        this.field3938 = new class560(arg1);
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
    public final void method1744(int arg0, int arg1) {
        this.field3952 = arg1;
        field3931++;
        class560 var3 = this.field3949;
        synchronized (this.field3949) {
            this.field3949.method3142(false);
        }
        class560 var4 = this.field3950;
        synchronized (this.field3950) {
            if (arg0 != 0) {
                method1748(4);
            }
            this.field3950.method3142(false);
        }
        class560 var5 = this.field3951;
        synchronized (this.field3951) {
            this.field3951.method3142(false);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IZ)V")
    public final void method1745(int arg0, boolean arg1) {
        field3945++;
        if (this.field3941 == arg1) {
            return;
        }
        this.field3941 = arg1;
        this.method1742(-122);
        if (arg0 != 21272) {
            this.field3950 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB)Luca;")
    public final class252 method1746(int arg0, byte arg1) {
        field3937++;
        if (arg1 <= 63) {
            method1741(108, (byte) -8, -112);
        }
        class560 var3 = this.field3938;
        class252 var4;
        synchronized (this.field3938) {
            var4 = (class252) this.field3938.method3134((long) arg0, -28);
        }
        if (var4 != null) {
            return var4;
        }
        class159 var5 = this.field3942;
        byte[] var6;
        synchronized (this.field3942) {
            var6 = this.field3942.method1087(class194.method1235((byte) 56, arg0), class73.method430(arg0, (byte) 20), 1);
        }
        class252 var7 = new class252();
        var7.field3456 = arg0;
        var7.field3445 = this;
        if (var6 != null) {
            var7.method1576(new class138(var6), -3);
        }
        var7.method1565(0);
        if (var7.field3416) {
            var7.field3428 = false;
            var7.field3440 = 0;
        }
        if (!this.field3936 && var7.field3433) {
            var7.field3468 = null;
            var7.field3421 = null;
        }
        class560 var8 = this.field3938;
        synchronized (this.field3938) {
            this.field3938.method3130((long) arg0, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(IB)V")
    public final void method1747(int arg0, byte arg1) {
        field3944++;
        class560 var3 = this.field3938;
        synchronized (this.field3938) {
            this.field3938.method3129(arg0, 14583);
        }
        class560 var4 = this.field3949;
        synchronized (this.field3949) {
            this.field3949.method3129(arg0, 14583);
            if (arg1 <= 69) {
                this.method1749(false, -30);
            }
        }
        class560 var5 = this.field3950;
        synchronized (this.field3950) {
            this.field3950.method3129(arg0, 14583);
        }
        class560 var6 = this.field3951;
        synchronized (this.field3951) {
            this.field3951.method3129(arg0, 14583);
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
    public static void method1748(int arg0) {
        field3935 = null;
        if (arg0 != -3) {
            field3947 = -100;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ZI)V")
    public final void method1749(boolean arg0, int arg1) {
        field3940++;
        if (arg1 != 30) {
            this.field3952 = -114;
        }
        if (this.field3936 != arg0) {
            this.field3936 = arg0;
            this.method1742(arg1 + 81);
        }
    }

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
    public final void method1750(int arg0) {
        class560 var2 = this.field3938;
        synchronized (this.field3938) {
            this.field3938.method3144(true);
            if (arg0 <= 74) {
                this.field3952 = 5;
            }
        }
        field3943++;
        class560 var3 = this.field3949;
        synchronized (this.field3949) {
            this.field3949.method3144(true);
        }
        class560 var4 = this.field3950;
        synchronized (this.field3950) {
            this.field3950.method3144(true);
        }
        class560 var5 = this.field3951;
        synchronized (this.field3951) {
            this.field3951.method3144(true);
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Luea;IZLpq;Lpq;)V")
    public class294(class484 arg0, int arg1, boolean arg2, class159 arg3, class159 arg4) {
        this.field3936 = arg2;
        this.field3942 = arg3;
        this.field3948 = arg4;
        if (this.field3942 != null) {
            int var6 = this.field3942.method1074((byte) 127) - 1;
            this.field3942.method1076(var6, 0);
        }
    }
}
