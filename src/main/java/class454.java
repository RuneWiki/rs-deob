import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class454 {

    @OriginalMember(owner = "client!np", name = "q", descriptor = "Llga;")
    private class663 field6304 = new class663(64);

    @OriginalMember(owner = "client!np", name = "s", descriptor = "Llga;")
    public class663 field6306 = new class663(50);

    @OriginalMember(owner = "client!np", name = "t", descriptor = "Llga;")
    public class663 field6307 = new class663(5);

    @OriginalMember(owner = "client!np", name = "f", descriptor = "Lci;")
    public class414 field6293;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "Z")
    public boolean field6290;

    @OriginalMember(owner = "client!np", name = "i", descriptor = "Lsea;")
    private class648 field6296;

    @OriginalMember(owner = "client!np", name = "j", descriptor = "Lsea;")
    public class648 field6297;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "[I")
    public static int[] field6294 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };

    @OriginalMember(owner = "client!np", name = "r", descriptor = "Lci;")
    public static class414 field6305 = new class414("runescape", 0);

    @OriginalMember(owner = "client!np", name = "e", descriptor = "F")
    public static float field6292;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!np", name = "b", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "I")
    public static int field6295;

    @OriginalMember(owner = "client!np", name = "k", descriptor = "I")
    public static int field6298;

    @OriginalMember(owner = "client!np", name = "l", descriptor = "I")
    public static int field6299;

    @OriginalMember(owner = "client!np", name = "m", descriptor = "I")
    public static int field6300;

    @OriginalMember(owner = "client!np", name = "n", descriptor = "I")
    public static int field6301;

    @OriginalMember(owner = "client!np", name = "o", descriptor = "I")
    public static int field6302;

    @OriginalMember(owner = "client!np", name = "p", descriptor = "I")
    public static int field6303;

    @OriginalMember(owner = "client!np", name = "u", descriptor = "I")
    public int field6308;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I[SI)[S", line = 4)
    public static final short[] method2576(int arg0, short[] arg1, int arg2) {
        field6301++;
        short[] var3 = new short[arg0];
        class359.method2050(arg1, 0, var3, 0, arg0);
        int var4 = -81 / ((7 - arg2) / 47);
        return var3;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V", line = 20)
    public final void method2577(byte arg0) {
        class663 var2 = this.field6306;
        synchronized (this.field6306) {
            this.field6306.method3749(7648);
        }
        field6302++;
        if (arg0 <= 36) {
            this.method2577((byte) 59);
        }
        class663 var3 = this.field6307;
        synchronized (this.field6307) {
            this.field6307.method3749(7648);
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(B)V", line = 45)
    public final void method2578(byte arg0) {
        class663 var2 = this.field6304;
        synchronized (this.field6304) {
            this.field6304.method3755(19713);
        }
        field6289++;
        class663 var3 = this.field6306;
        synchronized (this.field6306) {
            this.field6306.method3755(19713);
        }
        class663 var4 = this.field6307;
        synchronized (this.field6307) {
            this.field6307.method3755(19713);
        }
        if (arg0 > -21) {
            this.field6290 = true;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)V", line = 66)
    public final void method2579(int arg0, int arg1) {
        field6295++;
        this.field6308 = arg0;
        class663 var3 = this.field6306;
        synchronized (this.field6306) {
            if (arg1 != 26447) {
                return;
            }
            this.field6306.method3749(arg1 ^ 0x7AAF);
        }
        class663 var4 = this.field6307;
        synchronized (this.field6307) {
            this.field6307.method3749(arg1 - 18799);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(Lin;Lin;B)V", line = 83)
    public static final void method2580(class78 arg0, class78 arg1, byte arg2) {
        field6303++;
        class119.field1602++;
        int var3 = -29 % ((arg2 - 88) / 37);
        class352 var4 = class290.method1786(98, class199.field2836, class315.field4345);
        var4.field4686.method2836(arg0.field1129, -22164);
        var4.field4686.method2823(arg0.field1145, -117);
        var4.field4686.method2818(arg1.field1034, -27787);
        var4.field4686.method2856(arg1.field1129, (byte) 93);
        var4.field4686.method2837(arg0.field1034, -2);
        var4.field4686.method2812(85, arg1.field1145);
        class602.method3388(var4, (byte) 28);
    }

    @OriginalMember(owner = "client!np", name = "c", descriptor = "(B)V", line = 103)
    public static void method2581(byte arg0) {
        int var1 = -79 % ((arg0 + 10) / 43);
        field6294 = null;
        field6305 = null;
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(ZB)V", line = 116)
    public final void method2582(boolean arg0, byte arg1) {
        field6299++;
        if (arg0 != this.field6290) {
            int var3 = 82 % ((-arg1 - 74) / 35);
            this.field6290 = arg0;
            this.method2585(0);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(BI)V", line = 133)
    public final void method2583(byte arg0, int arg1) {
        class663 var3 = this.field6304;
        synchronized (this.field6304) {
            this.field6304.method3754(arg1, true);
            if (arg0 >= -52) {
                this.method2579(-41, -27);
            }
        }
        field6298++;
        class663 var4 = this.field6306;
        synchronized (this.field6306) {
            this.field6306.method3754(arg1, true);
        }
        class663 var5 = this.field6307;
        synchronized (this.field6307) {
            this.field6307.method3754(arg1, true);
        }
    }

    @OriginalMember(owner = "client!np", name = "b", descriptor = "(II)Lwa;", line = 152)
    public final class568 method2584(int arg0, int arg1) {
        field6288++;
        class663 var3 = this.field6304;
        class568 var4;
        synchronized (this.field6304) {
            var4 = (class568) this.field6304.method3747((byte) -66, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class648 var5 = this.field6296;
        byte[] var6;
        synchronized (this.field6296) {
            var6 = this.field6296.method3654(arg1 ^ 0xFFFFC300, class295.method1802(true, arg0), class435.method2492(arg0, (byte) 117));
        }
        class568 var7 = new class568();
        if (arg1 != 1) {
            return null;
        }
        var7.field8021 = arg0;
        var7.field8067 = this;
        if (var6 != null) {
            var7.method3249(new class501(var6), -116);
        }
        var7.method3251(arg1 ^ 0x53F5);
        class663 var8 = this.field6304;
        synchronized (this.field6304) {
            this.field6304.method3748((long) arg0, var7, arg1 + 12536);
            return var7;
        }
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lci;IZLsea;Lsea;)V", line = 223)
    public class454(class414 arg0, int arg1, boolean arg2, class648 arg3, class648 arg4) {
        this.field6293 = arg0;
        this.field6290 = arg2;
        this.field6296 = arg3;
        this.field6297 = arg4;
        if (this.field6296 != null) {
            int var6 = this.field6296.method3649((byte) 112) - 1;
            this.field6296.method3653(var6, true);
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V", line = 197)
    public final void method2585(int arg0) {
        if (arg0 != 0) {
            this.method2583((byte) 115, 6);
        }
        class663 var2 = this.field6304;
        synchronized (this.field6304) {
            this.field6304.method3749(7648);
        }
        field6300++;
        class663 var3 = this.field6306;
        synchronized (this.field6306) {
            this.field6306.method3749(arg0 ^ 0x1DE0);
        }
        class663 var4 = this.field6307;
        synchronized (this.field6307) {
            this.field6307.method3749(7648);
        }
    }
}
