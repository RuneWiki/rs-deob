import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class292 {

    @OriginalMember(owner = "client!iv", name = "f", descriptor = "Ld;")
    private class242 field4516 = new class242(64);

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "Lum;")
    private class83 field4515;

    @OriginalMember(owner = "client!iv", name = "j", descriptor = "Lum;")
    public class83 field4520;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "I")
    public static int field4511 = 0;

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "[Lwi;")
    public static class417[] field4519 = new class417[8];

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(II)Ljo;")
    public final class384 method1953(int arg0, int arg1) {
        field4517++;
        class242 var3 = this.field4516;
        class384 var4;
        synchronized (this.field4516) {
            var4 = (class384) this.field4516.method1634((long) arg1, 64);
        }
        if (var4 != null) {
            return var4;
        }
        class83 var5 = this.field4515;
        byte[] var6;
        synchronized (this.field4515) {
            var6 = this.field4515.method731(0, arg1, 3);
            if (arg0 != 16249) {
                method1956(-92, null, -19);
            }
        }
        class384 var7 = new class384();
        var7.field5658 = this;
        if (var6 != null) {
            var7.method2444(new class194(var6), 0);
        }
        class242 var8 = this.field4516;
        synchronized (this.field4516) {
            this.field4516.method1623((long) arg1, arg0 + 1372, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Z)V")
    public final void method1954(boolean arg0) {
        if (!arg0) {
            return;
        }
        class242 var2 = this.field4516;
        synchronized (this.field4516) {
            this.field4516.method1637((byte) 13);
        }
        field4514++;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
    public static void method1955(int arg0) {
        field4519 = null;
        if (arg0 != 64) {
            field4519 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILwl;I)V")
    public static final void method1956(int arg0, class521 arg1, int arg2) {
        field4518++;
        if (arg0 != 8) {
            field4519 = null;
        }
        int var3 = -1;
        int var4 = 0;
        if (arg1.field7589 > class446.field6625) {
            class298.method1984(123, arg1);
        } else if (class446.field6625 <= arg1.field7585) {
            class100.method816(arg1, (byte) 108);
        } else {
            class509.method3032(arg1, (byte) -108, false);
            var4 = class504.field7325;
            var3 = class441.field6570;
        }
        if (arg1.field1275 < 128 || arg1.field1279 < 128 || ((class338.field5076 - 1) * 128) <= arg1.field1275 || arg1.field1279 >= (class250.field4077 * 128 - 128)) {
            var3 = -1;
            arg1.field7621 = -1;
            arg1.field7585 = 0;
            arg1.field7561 = -1;
            arg1.field7644 = -1;
            arg1.field7589 = 0;
            var4 = 0;
            arg1.field1275 = arg1.field7654[0] * 128 + arg1.method3045(0) * 64;
            arg1.field1279 = arg1.field7653[0] * 128 + (arg1.method3045(0) * 64);
            arg1.method3108(arg0 ^ 0x8);
        }
        if (class116.field1781 == arg1 && (arg1.field1275 < 1536 || arg1.field1279 < 1536 || ((class338.field5076 - 12) * 128) <= arg1.field1275 || arg1.field1279 >= (class250.field4077 * 128 - 1536))) {
            arg1.field7644 = -1;
            arg1.field7585 = 0;
            arg1.field7589 = 0;
            arg1.field7621 = -1;
            var3 = -1;
            arg1.field7561 = -1;
            var4 = 0;
            arg1.field1275 = arg1.field7654[0] * 128 + arg1.method3045(0) * 64;
            arg1.field1279 = arg1.field7653[0] * 128 + arg1.method3045(0) * 64;
            arg1.method3108(arg0 - 8);
        }
        int var5 = class16.method94((byte) -117, arg1);
        class393.method2474((byte) 106, var4, var3, var5, arg1);
        class202.method1419(arg1, arg0 ^ 0x78);
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V")
    public final void method1957(int arg0) {
        field4513++;
        class242 var2 = this.field4516;
        synchronized (this.field4516) {
            this.field4516.method1630(-41);
            if (arg0 != 128) {
                this.method1957(28);
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lpt;ILum;Lum;)V")
    public class292(class308 arg0, int arg1, class83 arg2, class83 arg3) {
        this.field4515 = arg2;
        this.field4520 = arg3;
        this.field4515.method748(3, 12408);
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(II)V")
    public final void method1958(int arg0, int arg1) {
        field4512++;
        class242 var3 = this.field4516;
        synchronized (this.field4516) {
            this.field4516.method1631(arg1, (byte) -19);
            if (arg0 != 8282) {
                field4511 = -37;
            }
        }
    }
}
