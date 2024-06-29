import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class388 {

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "J")
    public static long field5391 = (long) (Math.random() * 9.999999999E9D);

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5389 = new BigInteger("887946773e1e99e379998a1580ec294f72a95746463d66a5352310126d56e23b5041b479e911aa53aed40925f29ebe426011984f64805b2a083bdab2ad86f9f7", 16);

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method2341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5390++;
        if (arg5 != -2) {
            field5389 = null;
        }
        for (int var6 = arg0; var6 <= arg3; var6++) {
            for (int var7 = arg4; var7 <= arg2; var7++) {
                if (class446.field6171[var6][var7] == arg1 && class503.field6997[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
    public static void method2342(byte arg0) {
        if (arg0 <= -82) {
            field5389 = null;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLdc;)V")
    public static final void method2343(byte arg0, class23 arg1) {
        if (arg0 != -57) {
            return;
        }
        field5392++;
        if (arg1 instanceof class585) {
            class585 var2 = (class585) arg1;
            if (var2.field8478 != null) {
                class38.method226(class147.field1899.field6358 != var2.field6358, var2, (byte) -59);
                return;
            }
        } else if ((arg1 instanceof class20)) {
            class20 var3 = (class20) arg1;
            class191.method1222(false, class147.field1899.field6358 != var3.field6358, var3);
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)V")
    public static final void method2344(int arg0, int arg1, int arg2) {
        class563 var3 = class199.field2605[arg0][arg1][arg2];
        if (var3 != null && var3.field7891 != null) {
            var3.field7891 = null;
        }
    }
}
