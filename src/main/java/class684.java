import java.awt.Frame;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class684 implements class437 {

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
    public int field9258;

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field9255 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!jca", name = "j", descriptor = "Z")
    public static boolean field9262 = false;

    @OriginalMember(owner = "client!jca", name = "h", descriptor = "Loaa;")
    public static class290 field9260 = new class290(12, 0, 1, 0);

    @OriginalMember(owner = "client!jca", name = "m", descriptor = "[I")
    public static int[] field9265 = new int[4];

    @OriginalMember(owner = "client!jca", name = "l", descriptor = "Lej;")
    public static class124 field9264 = new class124(44, 3);

    @OriginalMember(owner = "client!jca", name = "n", descriptor = "Lej;")
    public static class124 field9266 = new class124(48, 11);

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
    public static int field9253;

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "I")
    public static int field9254;

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "I")
    public static int field9256;

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "I")
    public static int field9257;

    @OriginalMember(owner = "client!jca", name = "g", descriptor = "I")
    public static int field9259;

    @OriginalMember(owner = "client!jca", name = "i", descriptor = "I")
    public static int field9261;

    @OriginalMember(owner = "client!jca", name = "k", descriptor = "Ljava/awt/Frame;")
    public static Frame field9263;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(BLcea;)Liia;")
    public static final class88 method3827(byte arg0, class215 arg1) {
        field9256++;
        class88 var2 = new class88();
        var2.field1567 = arg1.method1478(842397944);
        var2.field1566 = class621.field8455.method2411(var2.field1567, (byte) -90);
        int var3 = -91 / ((9 - arg0) / 54);
        return var2;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)Lad;")
    public final class426 method119(byte arg0) {
        field9253++;
        return arg0 < 116 ? null : class293.field4105;
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(B)V")
    public static final void method3828(byte arg0) {
        for (int var1 = 0; var1 < class607.field8331.length; var1++) {
            for (int var3 = 0; var3 < class607.field8331[0].length; var3++) {
                for (int var4 = 0; var4 < class607.field8331[0][0].length; var4++) {
                    class607.field8331[var1][var3][var4] = 0;
                }
            }
        }
        int var2 = 119 / ((arg0 - 47) / 34);
        field9261++;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V")
    public static void method3829(int arg0) {
        field9264 = null;
        field9266 = null;
        field9263 = null;
        if (arg0 < -17) {
            field9255 = null;
            field9265 = null;
            field9260 = null;
        }
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(I)V")
    public class684(int arg0) {
        this.field9258 = arg0;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Z)V")
    public static final void method3830(boolean arg0) {
        if (class222.field3181 == null) {
            class222.field3181 = class120.method1045(-91);
            class594.field8134 = class222.field3181[0];
            class361.field5194 = class554.method3190(-119);
        }
        field9259++;
        if (class99.field1732 == null) {
            class255.method1735(116);
        }
        class120 var1 = class594.field8134;
        int var2 = class723.method4009(-28660);
        if (class594.field8134 == var1) {
            class750.field10401 = class594.field8134.field2024.method2936(class607.field8336, 544);
            if (class594.field8134.field2028) {
                class296.field4158 = (class594.field8134.field2033 - class594.field8134.field2037) * var2 / 100 + class594.field8134.field2037;
            }
            if (class594.field8134.field2025) {
                class750.field10401 = class750.field10401 + class296.field4158 + "%";
            }
        } else if (class594.field8134 == class120.field2055) {
            class99.field1732 = null;
            class215.method1527(2, 3);
        } else {
            class750.field10401 = var1.field2027.method2936(class607.field8336, 544);
            if (class594.field8134.field2025) {
                class750.field10401 = class750.field10401 + var1.field2033 + "%";
            }
            class296.field4158 = var1.field2033;
            if (class594.field8134.field2028 || var1.field2028) {
                class361.field5194 = class554.method3190(-128);
            }
        }
        if (!arg0 || class99.field1732 == null) {
            return;
        }
        class99.field1732.method1709(class594.field8134, class750.field10401, class296.field4158, class361.field5194, false);
        if (class117.field1990 == null) {
            return;
        }
        for (int var3 = class278.field3922 + 1; var3 < class117.field1990.length; var3++) {
            if (class117.field1990[var3].method560(-19079) >= 100 && var3 - 1 == class278.field3922 && class214.field3036 >= 1 && class99.field1732.method1715(0)) {
                try {
                    class117.field1990[var3].method562(117);
                } catch (Exception var4) {
                    class117.field1990 = null;
                    return;
                }
                class99.field1732.method1714(10559, class117.field1990[var3]);
                class278.field3922++;
                if (class278.field3922 >= class117.field1990.length - 1 && class117.field1990.length > 1) {
                    class278.field3922 = class453.field6393.method2490(26) ? 0 : -1;
                }
            }
        }
        return;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)I")
    public static final int method3831(int arg0, int arg1) {
        if (arg0 <= 78) {
            field9255 = null;
        }
        field9257++;
        return arg1 & 0x7F;
    }
}
