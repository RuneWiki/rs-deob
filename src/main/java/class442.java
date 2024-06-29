import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class442 {

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "Z")
    public boolean field6434 = false;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "Lmf;")
    private class382 field6431 = new class382(64);

    @OriginalMember(owner = "client!eu", name = "q", descriptor = "Lmf;")
    public class382 field6446 = new class382(500);

    @OriginalMember(owner = "client!eu", name = "r", descriptor = "Lmf;")
    public class382 field6447 = new class382(30);

    @OriginalMember(owner = "client!eu", name = "s", descriptor = "Lmf;")
    public class382 field6448 = new class382(50);

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "Lpu;")
    public class522 field6435;

    @OriginalMember(owner = "client!eu", name = "m", descriptor = "Lpu;")
    private class522 field6442;

    @OriginalMember(owner = "client!eu", name = "l", descriptor = "Z")
    public boolean field6441;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
    public static int field6436;

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "I")
    public static int field6437;

    @OriginalMember(owner = "client!eu", name = "i", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!eu", name = "j", descriptor = "I")
    public static int field6439;

    @OriginalMember(owner = "client!eu", name = "k", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!eu", name = "n", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!eu", name = "o", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!eu", name = "p", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!eu", name = "t", descriptor = "I")
    public int field6449;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IBIIIII)V")
    public static final void method2615(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6443++;
        int var7 = 35 / ((14 - arg1) / 40);
        if (arg0 - arg4 >= class15.field153 && class248.field3859 >= arg0 + arg4 && arg3 - arg4 >= class520.field7329 && class239.field3747 >= arg3 + arg4) {
            class348.method2148(arg4, arg3, arg2, arg6, arg5, 0, arg0);
        } else {
            class19.method224(arg2, arg6, true, arg4, arg5, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V")
    public final void method2616(int arg0) {
        class382 var2 = this.field6431;
        synchronized (this.field6431) {
            this.field6431.method2279(arg0 - 4182);
        }
        field6436++;
        class382 var3 = this.field6446;
        synchronized (this.field6446) {
            this.field6446.method2279(arg0 ^ arg0);
        }
        class382 var4 = this.field6447;
        synchronized (this.field6447) {
            this.field6447.method2279(0);
        }
        class382 var5 = this.field6448;
        synchronized (this.field6448) {
            this.field6448.method2279(0);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(BI)Let;")
    public final class550 method2617(byte arg0, int arg1) {
        field6430++;
        class382 var3 = this.field6431;
        class550 var4;
        synchronized (this.field6431) {
            var4 = (class550) this.field6431.method2287(1, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field6442;
        byte[] var6;
        synchronized (this.field6442) {
            var6 = this.field6442.method3007(class371.method2241(arg1, (byte) 59), class672.method3726(arg1, 255), 5);
        }
        class550 var7 = new class550();
        var7.field7783 = arg1;
        var7.field7763 = this;
        if (var6 != null) {
            var7.method3108(new class695(var6), 120);
        }
        var7.method3121((byte) 89);
        if (!this.field6441 && var7.field7749) {
            var7.field7764 = null;
            var7.field7793 = null;
        }
        if (arg0 >= -86) {
            this.method2616(-122);
        }
        if (var7.field7795) {
            var7.field7773 = false;
            var7.field7806 = 0;
        }
        class382 var8 = this.field6431;
        synchronized (this.field6431) {
            this.field6431.method2291(var7, (long) arg1, 1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(ZIBI)I")
    public static final int method2618(boolean arg0, int arg1, byte arg2, int arg3) {
        field6438++;
        class138 var4 = class642.method3576(arg1, (byte) -50, arg0);
        if (arg2 >= -102) {
            method2618(true, -125, (byte) 88, 120);
        }
        if (var4 == null) {
            return -1;
        } else if (arg3 >= 0 && arg3 < var4.field2009.length) {
            return var4.field2009[arg3];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IZ)V")
    public final void method2619(int arg0, boolean arg1) {
        field6437++;
        if (this.field6441 == arg1) {
            return;
        }
        if (arg0 != -1) {
            this.method2624(-59, 39);
        }
        this.field6441 = arg1;
        this.method2621(-84);
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(II)V")
    public final void method2620(int arg0, int arg1) {
        this.field6431 = new class382(arg0);
        field6444++;
        if (arg1 != 0) {
            this.field6447 = null;
        }
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)V")
    public final void method2621(int arg0) {
        field6432++;
        class382 var2 = this.field6431;
        synchronized (this.field6431) {
            int var3 = -3 / ((-arg0 - 25) / 54);
            this.field6431.method2285((byte) -79);
        }
        class382 var4 = this.field6446;
        synchronized (this.field6446) {
            this.field6446.method2285((byte) -128);
        }
        class382 var5 = this.field6447;
        synchronized (this.field6447) {
            this.field6447.method2285((byte) -91);
        }
        class382 var6 = this.field6448;
        synchronized (this.field6448) {
            this.field6448.method2285((byte) -80);
        }
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(BI)V")
    public final void method2622(byte arg0, int arg1) {
        class382 var3 = this.field6431;
        synchronized (this.field6431) {
            this.field6431.method2290(false, arg1);
        }
        field6439++;
        class382 var4 = this.field6446;
        synchronized (this.field6446) {
            this.field6446.method2290(false, arg1);
        }
        class382 var5 = this.field6447;
        synchronized (this.field6447) {
            if (arg0 >= 0) {
                this.field6448 = null;
            }
            this.field6447.method2290(false, arg1);
        }
        class382 var6 = this.field6448;
        synchronized (this.field6448) {
            this.field6448.method2290(false, arg1);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(BZ)V")
    public final void method2623(byte arg0, boolean arg1) {
        field6440++;
        if (arg1 == this.field6434) {
            return;
        }
        this.field6434 = arg1;
        this.method2621(arg0 ^ 0x7F);
        if (arg0 != -45) {
            this.method2620(-15, -86);
        }
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(II)V")
    public final void method2624(int arg0, int arg1) {
        int var3 = -55 / ((-arg1 - 44) / 58);
        field6433++;
        this.field6449 = arg0;
        class382 var4 = this.field6446;
        synchronized (this.field6446) {
            this.field6446.method2285((byte) -75);
        }
        class382 var5 = this.field6447;
        synchronized (this.field6447) {
            this.field6447.method2285((byte) -111);
        }
        class382 var6 = this.field6448;
        synchronized (this.field6448) {
            this.field6448.method2285((byte) -124);
        }
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lkr;IZLpu;Lpu;)V")
    public class442(class693 arg0, int arg1, boolean arg2, class522 arg3, class522 arg4) {
        this.field6435 = arg4;
        this.field6442 = arg3;
        this.field6441 = arg2;
        if (this.field6442 != null) {
            int var6 = this.field6442.method2977((byte) -95) - 1;
            this.field6442.method2988(115, var6);
        }
    }
}
