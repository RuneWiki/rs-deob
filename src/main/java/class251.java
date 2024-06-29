import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class251 extends class247 {

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
    public int field4107 = 0;

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "Lke;")
    public static class106 field4106 = new class106(64);

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "Ljava/lang/String;")
    public static String field4109 = "Please remove ";

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
    public static int field4111 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    public int field4100;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
    public int field4103;

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "I")
    public int field4105;

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "I")
    public int field4110;

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
    public int field4114;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "I")
    public int field4116;

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
    public int field4117;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "I")
    public static int field4118;

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "I")
    public int field4119;

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "I")
    public int field4120;

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "I")
    public int field4121;

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "I")
    public int field4122;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "Lwb;")
    public class145 field4099;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "Lwb;")
    public class145 field4102;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "Lpg;")
    public class191 field4101;

    @OriginalMember(owner = "client!vg", name = "G", descriptor = "Laj;")
    public class1 field4115;

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "Luk;")
    public class86 field4113;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "Z")
    public boolean field4096;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "[I")
    public int[] field4097;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)V")
    public static void method1790(int arg0) {
        field4109 = null;
        field4106 = null;
        if (arg0 != 28754) {
            method1790(-1);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZ)V")
    public static final void method1791(int arg0, boolean arg1) {
        field4108++;
        for (class251 var2 = (class251) class241.field3882.method1548(0); var2 != null; var2 = (class251) class241.field3882.method1549(arg0 ^ 0x6C06)) {
            if (var2.field4099 != null) {
                class81.field1231.method1931(var2.field4099);
                var2.field4099 = null;
            }
            if (var2.field4102 != null) {
                class81.field1231.method1931(var2.field4102);
                var2.field4102 = null;
            }
            var2.method1764(64);
        }
        if (arg0 != 27749) {
            method1793(15L, (byte) -14, -22, (int[]) null);
        }
        if (!arg1) {
            return;
        }
        for (class251 var3 = (class251) class206.field3234.method1548(0); var3 != null; var3 = (class251) class206.field3234.method1549(-54)) {
            if (var3.field4099 != null) {
                class81.field1231.method1931(var3.field4099);
                var3.field4099 = null;
            }
            var3.method1764(64);
        }
        for (class251 var4 = (class251) class13.field190.method1065((byte) -59); var4 != null; var4 = (class251) class13.field190.method1066(-123)) {
            if (var4.field4099 != null) {
                class81.field1231.method1931(var4.field4099);
                var4.field4099 = null;
            }
            var4.method1764(64);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)I")
    public static final int method1792(byte arg0, int arg1) {
        field4112++;
        return arg0 > -70 ? -46 : arg1 >>> 10;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(JBI[I)Ljava/lang/String;")
    public static final String method1793(long arg0, byte arg1, int arg2, int[] arg3) {
        if (arg1 > -64) {
            field4104 = 91;
        }
        field4098++;
        if (class90.field1362 != null) {
            String var5 = class90.field1362.method843(arg2, (byte) 76, arg0, arg3);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V")
    public final void method1794(boolean arg0) {
        int var2 = this.field4110;
        field4095++;
        if (this.field4101 != null) {
            class191 var5 = this.field4101.method1340(0);
            if (var5 == null) {
                this.field4110 = -1;
                this.field4100 = 0;
                this.field4122 = 0;
                this.field4097 = null;
                this.field4120 = 0;
                this.field4119 = 0;
            } else {
                this.field4097 = var5.field3035;
                this.field4119 = var5.field3005;
                this.field4120 = var5.field3016;
                this.field4110 = var5.field3006;
                this.field4100 = var5.field3030;
                this.field4122 = var5.field3002 * 128;
            }
        } else if (this.field4113 != null) {
            int var3 = class222.method1574(this.field4113, -11);
            if (var2 != var3) {
                this.field4110 = var3;
                class134 var4 = this.field4113.field1321;
                if (var4.field1894 != null) {
                    var4 = var4.method855((byte) -114);
                }
                if (var4 == null) {
                    this.field4100 = this.field4122 = 0;
                } else {
                    this.field4122 = var4.field1934 * 128;
                    this.field4100 = var4.field1924;
                }
            }
        } else if (this.field4115 != null) {
            this.field4110 = class59.method382(32, this.field4115);
            this.field4100 = this.field4115.field1;
            this.field4122 = this.field4115.field11 * 128;
        }
        if (this.field4110 != var2 && this.field4099 != null) {
            class81.field1231.method1931(this.field4099);
            this.field4099 = null;
        }
        if (!arg0) {
            this.field4119 = 1;
        }
    }
}
