import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class757 {

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "I")
    private int field10480 = -1;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "Lifa;")
    private class450 field10478 = new class450();

    @OriginalMember(owner = "client!aca", name = "f", descriptor = "Lhj;")
    public static class596 field10483 = new class596(118, -1);

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "I")
    public static int field10479;

    @OriginalMember(owner = "client!aca", name = "d", descriptor = "I")
    public static int field10481;

    @OriginalMember(owner = "client!aca", name = "g", descriptor = "I")
    public static int field10484;

    @OriginalMember(owner = "client!aca", name = "i", descriptor = "I")
    public static int field10486;

    @OriginalMember(owner = "client!aca", name = "j", descriptor = "I")
    public static int field10487;

    @OriginalMember(owner = "client!aca", name = "k", descriptor = "I")
    public static int field10488;

    @OriginalMember(owner = "client!aca", name = "l", descriptor = "I")
    public static int field10489;

    @OriginalMember(owner = "client!aca", name = "m", descriptor = "I")
    public static int field10490;

    @OriginalMember(owner = "client!aca", name = "h", descriptor = "J")
    private long field10485;

    @OriginalMember(owner = "client!aca", name = "e", descriptor = "Lnc;")
    public static class26 field10482;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(II)Z")
    public static final boolean method4219(int arg0, int arg1) {
        if (arg0 >= -52) {
            method4222(false, null);
        }
        field10486++;
        return arg1 == 3 || arg1 == 7 || arg1 == 10;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILoga;)V")
    public final void method4220(int arg0, class500 arg1) {
        field10481++;
        if (arg0 < 56) {
            return;
        }
        if (this.field10485 != arg1.field6986 || this.field10480 != arg1.field6999) {
            throw new RuntimeException("ClanSettingsDelta.applyToClanSettings(): Credentials do not match! Settings.owner:" + class486.method2889(true, arg1.field6986) + " updateNum:" + arg1.field6999 + " delta.owner:" + class486.method2889(true, this.field10485) + " updateNum:" + this.field10480);
        }
        for (class41 var3 = (class41) this.field10478.method2725(37); var3 != null; var3 = (class41) this.field10478.method2726(-123)) {
            var3.method331(arg1, 55);
        }
        arg1.field6999++;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Z)V")
    public static void method4221(boolean arg0) {
        if (arg0) {
            field10482 = null;
            field10483 = null;
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZLpc;)V")
    public static final void method4222(boolean arg0, class700 arg1) {
        field10479++;
        if (class342.field4296 == null) {
            class218 var2 = new class218();
            byte[] var3 = var2.method1353(16, 128, 113, 128);
            class342.field4296 = class606.method3447(false, var3, 0);
        }
        if (class720.field10113 == null) {
            class86 var4 = new class86();
            byte[] var5 = var4.method791(128, 0, 128, 16);
            class720.field10113 = class606.method3447(false, var5, 0);
        }
        if (!arg0) {
            field10483 = null;
        }
        class451 var6 = arg1.field9728;
        if (var6.method2740(35632) && class728.field10192 == null) {
            byte[] var7 = class531.method3165(4.0F, 128, 16, 0.5F, 128, 0.6F, new class710(419684), 8, 16.0F, 4.0F, (byte) -125);
            class728.field10192 = class606.method3447(false, var7, 0);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILbt;JIIIZI)V")
    public static final void method4223(int arg0, class48 arg1, long arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7) {
        class120.field1543 = arg0;
        class486.field6774 = arg4;
        field10484++;
        if (arg3 != 1246799528) {
            return;
        }
        class753.field10443 = 10000;
        class174.field2167 = arg7;
        class677.field9292 = arg5;
        class8.field138 = arg1;
        class558.field7751 = 1;
        class678.field9298 = arg6;
        class300.field3598 = null;
        class432.field5708 = arg2;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILes;)V")
    private final void method4224(int arg0, class403 arg1) {
        this.field10485 = arg1.method2361(101);
        field10488++;
        this.field10480 = arg1.method2381((byte) 108);
        int var3 = -75 / ((arg0 + 18) / 45);
        for (int var4 = arg1.method2396((byte) 97); var4 != 0; var4 = arg1.method2396((byte) 116)) {
            if (class93.field1232) {
                System.out.println("t:" + var4);
            }
            class41 var5;
            if (var4 == 3) {
                var5 = new class547();
            } else if (var4 == 1) {
                var5 = new class259();
            } else if (var4 == 4) {
                var5 = new class683();
            } else if (var4 == 6) {
                var5 = new class741();
            } else if (var4 == 5) {
                var5 = new class734();
            } else if (var4 == 2) {
                var5 = new class617();
            } else if (var4 == 7) {
                var5 = new class624();
            } else if (var4 == 8) {
                var5 = new class189();
            } else if (var4 == 9) {
                var5 = new class303();
            } else if (var4 == 10) {
                var5 = new class384();
            } else if (var4 == 11) {
                var5 = new class494();
            } else if (var4 == 12) {
                var5 = new class38();
            } else {
                throw new RuntimeException("Unrecognised ClanSettingsDelta type in decode()");
            }
            var5.method329(-3999, arg1);
            this.field10478.method2732(var5, 21939);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIII)I")
    public static final int method4225(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -3362) {
            field10483 = null;
        }
        field10487++;
        int var4 = 255 - arg0;
        int var5 = ((arg1 & 0xFF00FF) * arg0 & 0xFF00FF00 | (arg1 & 0xFF00) * arg0 & 0xFF0000) >>> 8;
        return (((arg3 & 0xFF00) * var4 & 0xFF0000 | (arg3 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(Les;)V")
    public class757(class403 arg0) {
        this.method4224(-99, arg0);
    }
}
