import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class660 {

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Laq;")
    private class494 field9299 = new class494(64);

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "Laq;")
    public class494 field9304 = new class494(50);

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "Laq;")
    public class494 field9306 = new class494(5);

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Lmca;")
    public class41 field9298;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Z")
    public boolean field9292;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Lgga;")
    private class513 field9300;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "Lgga;")
    public class513 field9296;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field9293;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field9294;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field9295;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field9297;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field9301;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field9303;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field9305;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public int field9307;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZ)V")
    public static final void method3695(int arg0, boolean arg1) {
        class791.field10831 = arg0;
        if (arg1) {
            return;
        }
        field9294++;
        class494 var2 = class677.field9507;
        synchronized (class677.field9507) {
            class677.field9507.method2881((byte) -12);
        }
        class494 var3 = class725.field10099;
        synchronized (class725.field10099) {
            class725.field10099.method2881((byte) -46);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public final void method3696(int arg0) {
        class494 var2 = this.field9299;
        synchronized (this.field9299) {
            this.field9299.method2893((byte) 106);
        }
        field9301++;
        class494 var3 = this.field9304;
        synchronized (this.field9304) {
            this.field9304.method2893((byte) 110);
        }
        if (arg0 == -4642) {
            class494 var4 = this.field9306;
            synchronized (this.field9306) {
                this.field9306.method2893((byte) 88);
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IB)V")
    public final void method3697(int arg0, byte arg1) {
        class494 var3 = this.field9299;
        synchronized (this.field9299) {
            this.field9299.method2888(arg0, arg1 ^ 0x2F);
        }
        field9293++;
        class494 var4 = this.field9304;
        synchronized (this.field9304) {
            if (arg1 != 89) {
                this.method3696(-3);
            }
            this.field9304.method2888(arg0, 123);
        }
        class494 var5 = this.field9306;
        synchronized (this.field9306) {
            this.field9306.method2888(arg0, arg1 + 37);
        }
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public final void method3698(int arg0) {
        class494 var2 = this.field9299;
        synchronized (this.field9299) {
            this.field9299.method2881((byte) -113);
        }
        field9303++;
        class494 var3 = this.field9304;
        synchronized (this.field9304) {
            this.field9304.method2881((byte) -114);
            if (arg0 > -56) {
                this.field9292 = true;
            }
        }
        class494 var4 = this.field9306;
        synchronized (this.field9306) {
            this.field9306.method2881((byte) -55);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public final void method3699(byte arg0) {
        field9305++;
        int var2 = 30 / ((arg0 - 31) / 54);
        class494 var3 = this.field9304;
        synchronized (this.field9304) {
            this.field9304.method2881((byte) -104);
        }
        class494 var4 = this.field9306;
        synchronized (this.field9306) {
            this.field9306.method2881((byte) -45);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Lrf;")
    public final class179 method3700(int arg0, int arg1) {
        field9295++;
        class494 var3 = this.field9299;
        class179 var4;
        synchronized (this.field9299) {
            if (arg0 != 32501) {
                this.method3698(51);
            }
            var4 = (class179) this.field9299.method2882((long) arg1, (byte) -47);
        }
        if (var4 != null) {
            return var4;
        }
        class513 var5 = this.field9300;
        byte[] var6;
        synchronized (this.field9300) {
            var6 = this.field9300.method3019(class431.method2574(arg1, 17495), class201.method1416(127, arg1), 70);
        }
        class179 var7 = new class179();
        var7.field2677 = this;
        var7.field2725 = arg1;
        if (var6 != null) {
            var7.method1303(new class431(var6), 1);
        }
        var7.method1300(116);
        class494 var8 = this.field9299;
        synchronized (this.field9299) {
            this.field9299.method2890(-7307, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZB)V")
    public final void method3701(boolean arg0, byte arg1) {
        field9297++;
        if (this.field9292 == arg0) {
            return;
        }
        this.field9292 = arg0;
        if (arg1 != 61) {
            this.method3699((byte) -28);
        }
        this.method3698(-107);
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(IB)V")
    public final void method3702(int arg0, byte arg1) {
        this.field9307 = arg0;
        field9302++;
        class494 var3 = this.field9304;
        synchronized (this.field9304) {
            this.field9304.method2881((byte) -24);
            if (arg1 <= 63) {
                this.field9296 = null;
            }
        }
        class494 var4 = this.field9306;
        synchronized (this.field9306) {
            this.field9306.method2881((byte) -74);
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lmca;IZLgga;Lgga;)V")
    public class660(class41 arg0, int arg1, boolean arg2, class513 arg3, class513 arg4) {
        this.field9298 = arg0;
        this.field9292 = arg2;
        this.field9300 = arg3;
        this.field9296 = arg4;
        if (this.field9300 != null) {
            int var6 = this.field9300.method3011((byte) 112) - 1;
            this.field9300.method3007(-1, var6);
        }
    }
}
