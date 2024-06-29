import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class471 {

    @OriginalMember(owner = "client!dv", name = "n", descriptor = "I")
    public int field6813;

    @OriginalMember(owner = "client!dv", name = "e", descriptor = "I")
    public int field6804;

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "Ldv;")
    public class471 field6802;

    @OriginalMember(owner = "client!dv", name = "j", descriptor = "Lc;")
    public class125 field6809;

    @OriginalMember(owner = "client!dv", name = "i", descriptor = "Lhn;")
    public static class509 field6808 = new class509(40, 15);

    @OriginalMember(owner = "client!dv", name = "m", descriptor = "I")
    public static int field6812 = 0;

    @OriginalMember(owner = "client!dv", name = "l", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field6811 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!dv", name = "o", descriptor = "Z")
    public static boolean field6814 = true;

    @OriginalMember(owner = "client!dv", name = "k", descriptor = "F")
    public static float field6810;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "I")
    public static int field6801;

    @OriginalMember(owner = "client!dv", name = "d", descriptor = "I")
    public int field6803;

    @OriginalMember(owner = "client!dv", name = "f", descriptor = "I")
    public int field6805;

    @OriginalMember(owner = "client!dv", name = "g", descriptor = "I")
    public int field6806;

    @OriginalMember(owner = "client!dv", name = "h", descriptor = "I")
    public static int field6807;

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(I)Lhf;")
    public final class273 method2839(int arg0) {
        if (arg0 <= 49) {
            method2842(-11, null, (byte) 71, -22, null, -28, -97, null);
        }
        field6800++;
        return class433.method2689((byte) -124, this.field6804);
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V")
    public static void method2840(int arg0) {
        field6808 = null;
        field6811 = null;
        if (arg0 != -4988) {
            field6811 = null;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(II)Ldv;")
    public final class471 method2841(int arg0, int arg1) {
        field6801++;
        if (arg1 >= -79) {
            this.field6806 = -74;
        }
        return new class471(this.field6804, arg0);
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILjt;BILwq;IILcl;)V")
    public static final void method2842(int arg0, class69 arg1, byte arg2, int arg3, class116 arg4, int arg5, int arg6, class177 arg7) {
        if (arg2 < 20) {
            field6812 = -82;
        }
        field6807++;
        class101 var8 = new class101();
        var8.field1440 = arg3;
        var8.field1433 = arg0 << 7;
        var8.field1451 = arg6 << 7;
        if (arg1 != null) {
            var8.field1447 = arg1;
            int var9 = arg1.field941;
            int var10 = arg1.field927;
            if (arg5 == 1 || arg5 == 3) {
                var9 = arg1.field927;
                var10 = arg1.field941;
            }
            var8.field1436 = arg1.field892;
            var8.field1441 = arg1.field889;
            var8.field1445 = arg1.field891;
            var8.field1448 = arg1.field904;
            var8.field1442 = arg6 + var9 << 7;
            var8.field1457 = arg1.field939;
            var8.field1438 = arg1.field909 << 7;
            var8.field1450 = arg0 + var10 << 7;
            if (arg1.field906 != null) {
                var8.field1439 = true;
                var8.method809(120);
            }
            if (var8.field1448 != null) {
                var8.field1452 = (int) ((double) (var8.field1445 - var8.field1457) * Math.random()) + var8.field1457;
            }
            class251.field3891.method994(var8, -3610);
        } else if (arg4 != null) {
            var8.field1446 = arg4;
            class37 var11 = arg4.field1763;
            if (var11.field499 != null) {
                var8.field1439 = true;
                var11 = var11.method256(125, class195.field3271);
            }
            if (var11 != null) {
                var8.field1450 = var11.field494 + arg0 << 7;
                var8.field1442 = var11.field494 + arg6 << 7;
                var8.field1436 = class202.method1416(arg4, -1);
                var8.field1441 = var11.field466;
                var8.field1438 = var11.field450 << 7;
            }
            class360.field5347.method994(var8, -3610);
        } else if (arg7 != null) {
            var8.field1455 = arg7;
            var8.field1442 = arg7.method953(-83) + arg6 << 7;
            var8.field1450 = arg7.method953(-65) + arg0 << 7;
            var8.field1436 = class289.method1864(arg7, true);
            var8.field1438 = arg7.field2641 << 7;
            var8.field1441 = arg7.field2674;
            class25.field314.method2591((long) arg7.field1881, var8, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(II)V")
    public class471(int arg0, int arg1) {
        this.field6813 = arg1;
        this.field6804 = arg0;
    }

    @OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(Ldv;I)V")
    public class471(class471 arg0, int arg1) {
        this.field6802 = arg0;
        this.field6804 = this.field6802.field6804;
        this.field6813 = this.field6802.field6813 + arg1;
        this.field6809 = this.field6802.field6809;
    }
}
