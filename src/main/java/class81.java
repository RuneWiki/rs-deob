import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class81 {

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "Lnga;")
    private class510 field1512 = new class510(64);

    @OriginalMember(owner = "client!gv", name = "n", descriptor = "Lnga;")
    public class510 field1513 = new class510(64);

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "Leq;")
    public class209 field1509;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "Leq;")
    private class209 field1500;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "Leq;")
    public static class209 field1511;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "Ljava/applet/Applet;")
    public static Applet field1504;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)V")
    public final void method789(boolean arg0) {
        class510 var2 = this.field1512;
        synchronized (this.field1512) {
            this.field1512.method3050(false);
        }
        field1508++;
        class510 var3 = this.field1513;
        synchronized (this.field1513) {
            this.field1513.method3050(arg0);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIII)V")
    public static final void method790(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1505++;
        class354 var5 = class501.method3012(arg0, arg3, 2145997216);
        var5.method2222(-91);
        var5.field4980 = arg1;
        var5.field4979 = arg4;
        var5.field4990 = arg2;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
    public final void method791(byte arg0) {
        field1506++;
        class510 var2 = this.field1512;
        synchronized (this.field1512) {
            this.field1512.method3048(false);
        }
        class510 var3 = this.field1513;
        synchronized (this.field1513) {
            this.field1513.method3048(false);
        }
        int var4 = 48 / ((68 - arg0) / 57);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)V")
    public final void method792(int arg0, int arg1) {
        class510 var3 = this.field1512;
        synchronized (this.field1512) {
            if (arg1 != 1004) {
                method795(115);
            }
            this.field1512.method3049(arg0, (byte) 127);
        }
        field1501++;
        class510 var4 = this.field1513;
        synchronized (this.field1513) {
            this.field1513.method3049(arg0, (byte) 127);
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIII)V")
    public static final void method793(int arg0, int arg1, int arg2, int arg3) {
        if ((short) arg2 == arg0) {
            class357.method2232(class459.field6619, arg1, arg3);
        } else if (arg0 == 1004) {
            class357.method2232(class283.field4027, arg1, arg3);
        } else if (arg0 == 1003) {
            class357.method2232(class739.field10380, arg1, arg3);
        } else if (arg0 == 1007) {
            class357.method2232(class436.field6095, arg1, arg3);
        } else if (arg0 == 1010) {
            class357.method2232(class208.field2975, arg1, arg3);
        }
        field1503++;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZILjava/lang/String;)I")
    public static final int method794(boolean arg0, int arg1, String arg2) {
        field1502++;
        if (arg0) {
            method790(55, 95, 39, 107, -104);
        }
        return class50.method456(arg2, arg1, true, 55);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
    public static void method795(int arg0) {
        if (arg0 != 34) {
            field1511 = null;
        }
        field1504 = null;
        field1511 = null;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIB)V")
    public final void method796(int arg0, int arg1, byte arg2) {
        field1507++;
        this.field1512 = new class510(arg0);
        this.field1513 = new class510(arg1);
        int var4 = 53 / ((arg2 + 8) / 49);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IZ)Lwn;")
    public final class720 method797(int arg0, boolean arg1) {
        field1510++;
        class510 var3 = this.field1512;
        class720 var4;
        synchronized (this.field1512) {
            var4 = (class720) this.field1512.method3054((byte) -112, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class209 var5 = this.field1500;
        byte[] var6;
        synchronized (this.field1500) {
            var6 = this.field1500.method1453(arg0, 62, 34);
        }
        class720 var7 = new class720();
        var7.field10082 = this;
        if (var6 != null) {
            var7.method4018((byte) -101, new class35(var6));
        }
        class510 var8 = this.field1512;
        synchronized (this.field1512) {
            this.field1512.method3047(arg1, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lcw;ILeq;Leq;)V")
    public class81(class179 arg0, int arg1, class209 arg2, class209 arg3) {
        this.field1509 = arg3;
        this.field1500 = arg2;
        this.field1500.method1477(0, 34);
    }
}
