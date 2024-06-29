import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class276 extends class443 {

    @OriginalMember(owner = "client!cs", name = "x", descriptor = "Lrg;")
    public class562 field4032;

    @OriginalMember(owner = "client!cs", name = "y", descriptor = "Lml;")
    public static class36 field4033 = new class36("WTQA", 2);

    @OriginalMember(owner = "client!cs", name = "C", descriptor = "Lbg;")
    public static class340 field4036 = new class340();

    @OriginalMember(owner = "client!cs", name = "D", descriptor = "F")
    public static float field4037;

    @OriginalMember(owner = "client!cs", name = "t", descriptor = "I")
    public static int field4028;

    @OriginalMember(owner = "client!cs", name = "u", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!cs", name = "v", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!cs", name = "w", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!cs", name = "z", descriptor = "Loh;")
    public static class549 field4034;

    @OriginalMember(owner = "client!cs", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field4035;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(Lpb;BI)V")
    public static final void method1776(class366 arg0, byte arg1, int arg2) {
        if (class271.field3980) {
            arg2 = 0;
            class271.field3980 = false;
        }
        int var3 = -99 / ((arg1 - 12) / 46);
        field4028++;
        if (class594.field8437 != null && class594.field8437.method2212((byte) -39, arg0)) {
            return;
        }
        class594.field8437 = arg0;
        class244.field3535 = class508.method2860(false);
        class306.field4412 = arg2;
        class245.field3545 = arg2;
        if (class245.field3545 != 0) {
            class57.field808 = class10.field100;
            class441.field6440 = class592.field8417;
            class501.field7031 = class6.field55;
            class401.field6003 = class258.field3756;
            class275.field4025 = class77.field1403;
            class12.field120 = class404.field6023;
            class468.field6742 = class429.field6260;
            class6.field59 = class28.field371;
            class519.field7207 = class215.field3261;
            class579.field8256 = class108.field1796;
            return;
        }
        class421.method2532((byte) 100);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(BII)I")
    public static final int method1777(byte arg0, int arg1, int arg2) {
        if (arg0 < 61) {
            method1776(null, (byte) -121, -41);
        }
        field4030++;
        int var3 = arg1 >>> 24;
        int var4 = 255 - var3;
        int var5 = ((arg1 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg1 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        return (((arg2 & 0xFF00) * var4 & 0xFF0000 | (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1778(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field4029++;
        if (arg6 < 128 || arg0 < 128 || arg6 > ((class146.field2247 - 2) * 128) || arg0 > (class66.field990 * 128 - 256)) {
            class621.field8750[0] = class621.field8750[1] = -1;
            return;
        }
        int var10 = class355.method2160(arg6, arg0, arg5, (byte) 103) - arg7;
        class81.field1444.method877(arg4, 0, 0);
        class159.field2378.method587(class81.field1444);
        class159.field2378.method568(arg6, var10, arg0, class621.field8750);
        class81.field1444.method877(-arg4, 0, 0);
        if (arg9 != -256) {
            field4036 = null;
        }
        class159.field2378.method587(class81.field1444);
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)V")
    public static void method1779(int arg0) {
        field4033 = null;
        field4036 = null;
        if (arg0 != -1872566840) {
            method1778(-55, -100, -90, 61, -105, 27, 53, -95, -74, -94);
        }
        field4035 = null;
        field4034 = null;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)V")
    public static final void method1780(int arg0, int arg1) {
        if (arg0 != 16711935) {
            field4033 = null;
        }
        if (class490.field6891 == 1) {
            class624.field8795 = arg1;
        } else if (class490.field6891 == 2 || class490.field6891 == 3) {
            class544.field7580 = arg1;
        }
        field4031++;
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lrg;)V")
    public class276(class562 arg0) {
        this.field4032 = arg0;
    }
}
