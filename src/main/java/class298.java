import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class298 extends class123 {

    @OriginalMember(owner = "client!sm", name = "Z", descriptor = "I")
    public static int field4321 = -1;

    @OriginalMember(owner = "client!sm", name = "W", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!sm", name = "X", descriptor = "I")
    public static int field4319;

    @OriginalMember(owner = "client!sm", name = "Y", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(IIB)I", line = 3)
    public static final int method1938(int arg0, int arg1, byte arg2) {
        ++field4318;
        double var3 = Math.log((double) arg0) / Math.log(2.0D);
        if (arg2 > -12) {
            return 92;
        } else {
            double var5 = Math.log((double) arg1) / Math.log(2.0D);
            double var7 = var5 + (-var5 + var3) * Math.random();
            return (int) (Math.pow(2.0D, var7) + 0.5D);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZI)[[I", line = 25)
    public final int[][] method58(boolean arg0, int arg1) {
        ++field4320;
        int[][] var3 = super.field8265.method1576((byte) 102, arg1);
        if (arg0) {
            method1939((class746) null, -7);
        }
        if (super.field8265.field3546 && this.method932((byte) 123)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field1909 * super.field1909;
            for (int var8 = 0; ~var8 > ~class293.field4278; ++var8) {
                int var9 = super.field1917[var8 % super.field1918 + var7];
                var6[var8] = class702.method3977(var9 << 4, 4080);
                var5[var8] = class702.method3977(var9, 65280) >> 4;
                var4[var8] = class702.method3977(var9, 16711680) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljga;I)I", line = 72)
    public static final int method1939(class746 arg0, int arg1) {
        ++field4319;
        String var2 = class287.method1854(arg0, (byte) -61);
        int var3 = 47 / ((arg1 - -31) / 60);
        int[] var4 = null;
        if (class776.method4271(arg0.field10340, 1951)) {
            var4 = class313.field4456.method1681((int) arg0.field10333, 85).field9642;
        } else if (~arg0.field10343 == 0) {
            if (!class460.method2740(false, arg0.field10340)) {
                if (class457.method2724(arg0.field10340, (byte) 89)) {
                    Object var5 = null;
                    class282 var6;
                    if (~arg0.field10340 != -1011) {
                        var6 = class277.field4038.method3919(true, (int) (2147483647L & arg0.field10333 >>> 32));
                    } else {
                        var6 = class277.field4038.method3919(true, (int) arg0.field10333);
                    }
                    if (var6.field4117 != null) {
                        var6 = var6.method1826(class537.field7727, -122);
                    }
                    if (var6 != null) {
                        var4 = var6.field4169;
                    }
                }
            } else {
                class205 var7 = (class205) class645.field9014.method2242((long) ((int) arg0.field10333), -1);
                if (var7 != null) {
                    class665 var8 = var7.field3181;
                    class110 var9 = var8.field9240;
                    if (var9.field1657 != null) {
                        var9 = var9.method840(class537.field7727, 90);
                    }
                    if (var9 != null) {
                        var4 = var9.field1669;
                    }
                }
            }
        } else {
            var4 = class313.field4456.method1681(arg0.field10343, 104).field9642;
        }
        if (var4 != null) {
            var2 = var2 + class354.method2255(-1, var4);
        }
        int var10 = class395.field5431.method40(var2, class132.field1980, (byte) 119);
        if (arg0.field10338) {
            var10 += 4 + class84.field927.method1508();
        }
        return var10;
    }
}
