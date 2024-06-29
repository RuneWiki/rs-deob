import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class189 extends InputStream {

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "Loh;")
    public static class263 field3395 = class253.method1681(-117, "Zugewiesener Speicher)3");

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "Loh;")
    private static class263 field3401 = class253.method1681(-128, "red:");

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "Loh;")
    public static class263 field3400 = field3401;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "Loh;")
    private static class263 field3407 = class253.method1681(-117, "M");

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "Loh;")
    public static class263 field3398 = field3401;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "Loh;")
    public static class263 field3402 = field3407;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "Loh;")
    public static class263 field3396 = field3407;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "Lal;")
    public static class223 field3394 = new class223(5000);

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "Lli;")
    public static class277 field3408 = new class277();

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIBIIII)V")
    public static final void method1239(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8) {
        field3404++;
        int var9 = arg6 - arg3;
        int var10 = (arg1 - arg0 << 16) / var9;
        int var11 = -27 / ((1 - arg4) / 45);
        int var12 = arg5 - arg2;
        int var13 = (arg8 - arg7 << 16) / var12;
        class236.method1580(arg7, var10, arg2, 0, arg0, 0, arg6, var13, arg3, (byte) -65, arg5);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILue;B)Lw;")
    public static final class141 method1240(int arg0, int arg1, class86 arg2, byte arg3) {
        field3405++;
        if (class254.method1687(arg1, (byte) 54, arg2, arg0)) {
            if (arg3 != -4) {
                method1241(74, -2);
            }
            return class55.method349(false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "read", descriptor = "()I")
    public final int read() {
        field3403++;
        class215.method1457(30000L, (byte) 111);
        return -1;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)Loh;")
    public static final class263 method1241(int arg0, int arg1) {
        field3397++;
        if (arg1 < 100000) {
            return class124.method797(-45, new class263[] { class92.field1825, class136.method891(-124, arg1), class54.field1135 });
        } else {
            int var2 = -4 % ((-arg0 - 38) / 51);
            return arg1 < 10000000 ? class124.method797(-74, new class263[] { class63.field1273, class136.method891(-87, arg1 / 1000), class168.field3096, class54.field1135 }) : class124.method797(-125, new class263[] { class71.field1427, class136.method891(-94, arg1 / 1000000), field3402, class54.field1135 });
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Lsi;I)Lhh;")
    public static final class115 method1242(class194 arg0, int arg1) {
        field3406++;
        return arg1 == 11238 ? new class115(arg0.method1298((byte) -94), arg0.method1298((byte) -121), arg0.method1298((byte) -80), arg0.method1298((byte) -115), arg0.method1277((byte) -110), arg0.method1277((byte) 81), arg0.method1301(-8317)) : null;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
    public static void method1243(int arg0) {
        field3400 = null;
        field3398 = null;
        if (arg0 != 5000) {
            method1241(117, 48);
        }
        field3402 = null;
        field3395 = null;
        field3407 = null;
        field3396 = null;
        field3401 = null;
        field3408 = null;
        field3394 = null;
    }
}
