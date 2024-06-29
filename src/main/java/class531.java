import java.io.IOException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class531 {

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field7793 = -1;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "Lbi;")
    public static class104 field7798 = new class104(37, -2);

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field7794;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field7795;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field7796;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field7797;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLna;IZ[II)Lme;")
    public static final class508 method3153(byte arg0, class211 arg1, int arg2, boolean arg3, int[] arg4, int arg5) {
        field7797++;
        if (arg0 != -95) {
            field7798 = null;
        }
        if (!arg1.field3618 && (!class357.method2363(-85, arg2) || !class357.method2363(-55, arg5))) {
            return arg1.field3549 ? new class508(arg1, 34037, arg2, arg5, arg3, arg4) : new class508(arg1, arg2, arg5, class123.method774(-100, arg2), class123.method774(arg0 + 26, arg5), arg4);
        } else {
            return new class508(arg1, 3553, arg2, arg5, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(JI)Ljava/lang/String;")
    public static final String method3154(long arg0, int arg1) {
        class434.field6551.setTime(new Date(arg0));
        field7796++;
        int var3 = class434.field6551.get(7);
        int var4 = class434.field6551.get(5);
        int var5 = class434.field6551.get(2);
        if (arg1 != -6409) {
            method3157(72, 110);
        }
        int var6 = class434.field6551.get(1);
        int var7 = class434.field6551.get(11);
        int var8 = class434.field6551.get(12);
        int var9 = class434.field6551.get(13);
        return class484.field7356[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class134.field1814[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILhw;)V")
    public static final void method3155(int arg0, class208 arg1) {
        field7795++;
        byte[] var2 = new byte[arg0];
        if (class320.field4981 != null) {
            try {
                class320.field4981.method2589(0L, 0);
                class320.field4981.method2588(var2, arg0 - 149);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1474(var2, 0, 24, (byte) -104);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V")
    public static void method3156(byte arg0) {
        field7798 = null;
        if (arg0 != -118) {
            method3156((byte) -64);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)I")
    public static final int method3157(int arg0, int arg1) {
        field7794++;
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        } else if (arg0 != 6406) {
            return -58;
        } else if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else if (arg1 == 6406 || arg1 == 34844) {
            return 6406;
        } else if (arg1 == 6409 || arg1 == 34846) {
            return 6409;
        } else if (arg1 == 6410 || arg1 == 34847) {
            return 6410;
        } else if (arg1 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }
}
