import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class class417 extends class210 {

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "S")
    public short field5504;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "Ltn;")
    public static class749 field5505 = new class749(4);

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "I")
    public static int field5507;

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([Lgu;I)I", line = 6)
    public final int method719(class757[] arg0, int arg1) {
        if (arg1 < 62) {
            this.method719((class757[]) null, 126);
        }
        ++field5507;
        return this.method1406(super.field2896 >> class88.field1221, arg0, super.field2900 >> class88.field1221, 114);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLvba;)I", line = 21)
    public static final int method2408(byte arg0, class765 arg1) {
        int var2 = -98 % ((-44 - arg0) / 33);
        ++field5511;
        String var3 = class381.method2185(arg1, -2);
        int[] var4 = null;
        if (class122.method722(arg1.field10412, true)) {
            var4 = class640.field8189.method705((int) arg1.field10404, -11467).field616;
        } else if (arg1.field10400 != -1) {
            var4 = class640.field8189.method705(arg1.field10400, -11467).field616;
        } else if (!class49.method319(arg1.field10412, -60)) {
            if (class143.method827(arg1.field10412, (byte) -52)) {
                Object var5 = null;
                class773 var6;
                if (~arg1.field10412 == -1010) {
                    var6 = class390.field4983.method4292((int) arg1.field10404, (byte) -123);
                } else {
                    var6 = class390.field4983.method4292((int) (2147483647L & arg1.field10404 >>> 32), (byte) -110);
                }
                if (var6.field10536 != null) {
                    var6 = var6.method4213(class381.field4705, -124);
                }
                if (var6 != null) {
                    var4 = var6.field10502;
                }
            }
        } else {
            class232 var7 = (class232) class444.field5811.method2616((long) ((int) arg1.field10404), (byte) -123);
            if (var7 != null) {
                class727 var8 = var7.field3125;
                class240 var9 = var8.field9545;
                if (var9.field3289 != null) {
                    var9 = var9.method1585((byte) -100, class381.field4705);
                }
                if (var9 != null) {
                    var4 = var9.field3318;
                }
            }
        }
        if (var4 != null) {
            var3 = var3 + class405.method2361(var4, 0);
        }
        int var10 = class66.field868.method1054(var3, true, class269.field3556);
        if (arg1.field10398) {
            var10 += class585.field7406.method620() + 4;
        }
        return var10;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZI)V", line = 94)
    public static final void method2409(boolean arg0, int arg1) {
        class745.field10115 = 0;
        if (!arg0) {
            field5505 = null;
        }
        class685.field8831 = arg1;
        class168.field2234 = null;
        class540.field6799 = -1;
        class416.field5500 = null;
        class691.field8879 = false;
        class483.field6236 = -1;
        ++field5508;
        class693.field8903 = 1;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BLuaa;I)Ljava/lang/String;", line = 115)
    public static final String method2410(byte arg0, class391 arg1, int arg2) {
        ++field5512;
        if (arg0 != 105) {
            field5505 = null;
        }
        if (!client.method2637(arg1).method2126(arg2, -1) && arg1.field5146 == null) {
            return null;
        } else if (arg1.field5013 != null && arg2 < arg1.field5013.length && arg1.field5013[arg2] != null && ~arg1.field5013[arg2].trim().length() != -1) {
            return arg1.field5013[arg2];
        } else {
            return class538.field6782 ? "Hidden-" + arg2 : null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(IIIIII)V", line = 137)
    public class417(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field2895 = (byte) arg3;
        this.field5504 = (short) arg5;
        super.field2889 = (byte) arg4;
        super.field2896 = arg0;
        super.field2900 = arg2;
        super.field2892 = arg1;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(Lha;I)Z", line = 151)
    public final boolean method717(class570 arg0, int arg1) {
        ++field5509;
        int var3 = -66 / ((21 - arg1) / 53);
        return class334.method1928(super.field2889, (byte) -61, super.field2896 >> class88.field1221, super.field2900 >> class88.field1221);
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)Z", line = 165)
    public final boolean method718(int arg0) {
        ++field5506;
        if (arg0 > -95) {
            this.field5504 = 34;
        }
        return class145.field1873[(super.field2896 >> class88.field1221) + class76.field1069 - class454.field5914][(super.field2900 >> class88.field1221) + -class309.field3875 + class76.field1069];
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)V", line = 176)
    public static void method2411(int arg0) {
        if (arg0 != 31180) {
            method2409(true, -40);
        }
        field5505 = null;
    }
}
