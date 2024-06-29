import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class183 extends class251 {

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "Lma;")
    public class10 field2916;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "Lmj;")
    public class447 field2910;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public static int field2907 = -1;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public int field2906;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public int field2908;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public int field2909;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    public int field2912;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "I")
    public int field2917;

    @OriginalMember(owner = "client!sb", name = "B", descriptor = "Llt;")
    public static class458 field2914;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLro;)I")
    public static final int method1146(byte arg0, class2 arg1) {
        field2911++;
        String var2 = class442.method2635((byte) 92, arg1);
        int[] var3 = null;
        if (arg0 < 30) {
            return -85;
        }
        if (class395.method2344(-14262, arg1.field17)) {
            var3 = class288.field4362.method3030((byte) 59, (int) arg1.field12).field2836;
        } else if (arg1.field19 != -1) {
            var3 = class288.field4362.method3030((byte) 60, arg1.field19).field2836;
        } else if (class448.method2681(23208, arg1.field17)) {
            class249 var4 = class195.field3085[(int) arg1.field12];
            if (var4 != null) {
                class245 var5 = var4.field3819;
                if (var5.field3703 != null) {
                    var5 = var5.method1477(class273.field4144, -12819);
                }
                if (var5 != null) {
                    var3 = var5.field3744;
                }
            }
        } else if (class34.method200(arg1.field17, -78)) {
            Object var6 = null;
            class56 var7;
            if (arg1.field17 == 1009) {
                var7 = class128.field2070.method916((byte) -15, (int) arg1.field12);
            } else {
                var7 = class128.field2070.method916((byte) -15, (int) (arg1.field12 >>> 32 & 0x7FFFFFFFL));
            }
            if (var7.field892 != null) {
                var7 = var7.method393(class273.field4144, (byte) -127);
            }
            if (var7 != null) {
                var3 = var7.field879;
            }
        }
        if (var3 != null) {
            var2 = var2 + class99.method746(var3, (byte) 53);
        }
        int var8 = class512.field7764.method2357(-111, class302.field4562, var2);
        if (arg1.field18) {
            var8 += class330.field4946.method1001() + 4;
        }
        return var8;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static void method1147(byte arg0) {
        field2914 = null;
        if (arg0 != -51) {
            field2907 = -11;
        }
    }

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "(B)V")
    public final void method1148(byte arg0) {
        this.field2908 = this.field2916.field126;
        field2913++;
        this.field2912 = this.field2916.field128;
        this.field2906 = this.field2916.field124;
        if (this.field2916.field131 != null) {
            this.field2916.field131.method190(this.field2910.field6889, this.field2910.field6888, this.field2910.field6871, class270.field4082);
        }
        this.field2917 = class270.field4082[2];
        if (arg0 < 22) {
            this.field2917 = 110;
        }
        this.field2909 = class270.field4082[0];
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lma;Ldd;)V")
    public class183(class10 arg0, class477 arg1) {
        this.field2916 = arg0;
        this.field2910 = this.field2916.method52((byte) 119);
        this.method1148((byte) 82);
    }
}
