import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class623 {

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public int field8471;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field8466;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field8467;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field8468;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field8470;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field8472;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    public static int field8473;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "Lwea;")
    public static class158 field8469;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I[FI)[F")
    public static final float[] method3543(int arg0, float[] arg1, int arg2) {
        field8466++;
        if (arg2 != -1) {
            field8469 = null;
        }
        float[] var3 = new float[arg0];
        class363.method2316(arg1, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!sk", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8468++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)Z")
    public static final boolean method3544(int arg0, int arg1) {
        if (arg1 != 14634) {
            method3543(-102, null, 28);
        }
        field8470++;
        return arg0 >= 12 && arg0 <= 17;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)I")
    public final int method3545(int arg0) {
        if (arg0 == 0) {
            field8467++;
            return this.field8471;
        } else {
            return -76;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V")
    public static void method3546(byte arg0) {
        field8469 = null;
        if (arg0 != 85) {
            field8469 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BLha;)V")
    public static final void method3547(byte arg0, class59 arg1) {
        field8473++;
        int var2 = 0;
        int var3 = 0;
        if (class241.field3529) {
            var2 = class146.method1163((byte) -124);
            var3 = class313.method2035(false);
        }
        int var4 = -10660793;
        class434.method2635(class565.field7788, class749.field10379 + var3, arg1, class106.field1869 + var2, var4, true, class469.field6575, -16777216);
        if (arg0 <= 98) {
            return;
        }
        class168.field2634.method639(class497.field6915.method2936(class607.field8336, 544), var4, class749.field10379 + var3 + 14, class106.field1869 + 3 + var2, -1, -125);
        int var5 = class284.field3963.method574(true) + var2;
        int var6 = var3 + class284.field3963.method571((byte) 127);
        if (class715.field9742) {
            int var7 = 0;
            for (class462 var8 = (class462) class631.field8684.method2344(-119); var8 != null; var8 = (class462) class631.field8684.method2336((byte) 44)) {
                int var12 = var7 * 16 + var3 + class749.field10379 + 31;
                var7++;
                if (var8.field6497 == 1) {
                    class42.method534(class749.field10379 + var3, -256, var12, arg1, (class324) var8.field6503.field5243.field241, class565.field7788, var6, -1, (byte) 124, class469.field6575, class106.field1869 + var2, var5);
                } else {
                    class390.method2452(-1, var12, var8, var5, class565.field7788, -256, var6, arg1, class749.field10379 + var3, 126, class106.field1869 + var2, class469.field6575);
                }
            }
            if (class164.field2589 != null) {
                class434.method2635(class465.field6522, class157.field2522, arg1, class142.field2352, var4, true, class562.field7760, -16777216);
                int var9 = 0;
                class168.field2634.method639(class164.field2589.field6499, var4, class157.field2522 + 14, class142.field2352 + 3, -1, -126);
                for (class324 var10 = (class324) class164.field2589.field6503.method2344(-84); var10 != null; var10 = (class324) class164.field2589.field6503.method2336((byte) 73)) {
                    int var11 = var9 * 16 + class157.field2522 + 31;
                    var9++;
                    class42.method534(class157.field2522, -256, var11, arg1, var10, class465.field6522, var6, -1, (byte) 125, class562.field7760, class142.field2352, var5);
                }
                class344.method2169(class465.field6522, class157.field2522, true, class142.field2352, class562.field7760);
            }
        } else {
            int var13 = 0;
            for (class324 var14 = (class324) class528.field7301.method1269(4); var14 != null; var14 = (class324) class528.field7301.method1264((byte) 55)) {
                int var15 = class749.field10379 + var3 + ((-var13 + -1 + class192.field2844) * 16) + 31;
                class42.method534(class749.field10379 + var3, -256, var15, arg1, var14, class565.field7788, var6, -1, (byte) 124, class469.field6575, class106.field1869 + var2, var5);
                var13++;
            }
        }
        class344.method2169(class565.field7788, class749.field10379 + var3, true, class106.field1869 + var2, class469.field6575);
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class623(String arg0, int arg1) {
        this.field8471 = arg1;
    }
}
