import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class423 extends InputStream {

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(JZ)Ljava/lang/String;")
    public static final String method2579(long arg0, boolean arg1) {
        field5858++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            if (!arg1) {
                field5857 = 123;
            }
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                var6.append(class523.field7342[(int) (var7 - (arg0 * 37L))]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLhg;I)V")
    public static final void method2580(byte arg0, class584 arg1, int arg2) {
        field5859++;
        if (arg1.field8348 != null) {
            int var3 = arg1.field8348[arg2 + 1];
            if (arg1.field8317 != var3) {
                arg1.field8317 = var3;
                arg1.field8357 = 0;
                arg1.field8407 = 1;
                arg1.field8323 = 0;
                arg1.field8328 = 0;
                arg1.field8416 = arg1.field8419;
                if (arg1.field8317 != -1) {
                    class694.method3941(arg1.field8357, class274.field3684.method1881((byte) -80, arg1.field8317), arg1, true);
                }
            }
        }
        if (arg0 >= -107) {
            field5857 = -109;
        }
    }

    @OriginalMember(owner = "client!la", name = "read", descriptor = "()I")
    public final int read() {
        field5856++;
        class740.method4124(30000L, 89);
        return -1;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static final void method2581(int arg0) {
        class124.field1690.method905(5, (byte) 110);
        field5860++;
        class304.field3958.method15(64, 5);
        class486.field6564.method826((byte) -111, 5);
        class264.field3604.method3186((byte) -88, 5);
        class643.field9112.method3883(4677, 5);
        class487.field6572.method3045(0, 5);
        class274.field3684.method1880(5, 123);
        if (arg0 > -65) {
            method2581(-64);
        }
        class267.field3625.method3987(true, 5);
        class62.field836.method1661(64, 5);
        class410.field5694.method3705(-642, 5);
        class544.field7653.method1641(-1, 5);
        class92.field1241.method1973((byte) 93, 5);
        class625.field8924.method895((byte) 79, 5);
        class223.field3134.method2386(-1, 5);
        class535.field7498.method2065(false, 5);
        class533.field7474.method1232(5, 29);
        class128.field1758.method4024(35, 5);
        class125.field1706.method3567((byte) -116, 5);
        class466.field6364.method1068(5, 64);
        class98.field1425.method4187(false, 5);
        class490.method2861((byte) -56, 5);
        class645.method3741(50, 111);
        class492.method2941(-1, 50);
        class379.method2318(5, (byte) 98);
        class209.method1390(5, (byte) 47);
        class713.field10114.method3204((byte) 125, 5);
        class331.field4251.method3204((byte) 78, 5);
        class542.field7584.method3204((byte) 63, 5);
        class674.field9504.method3204((byte) 86, 5);
        class318.field4105.method3204((byte) -75, 5);
    }
}
