import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class306 extends class313 {

    @OriginalMember(owner = "client!um", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4854 = null;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "I")
    public static int field4847 = -1;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "I")
    public static int field4846;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public int field4848;

    @OriginalMember(owner = "client!um", name = "l", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "I")
    public int field4852;

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "I")
    public int field4855;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!um", name = "v", descriptor = "Lhm;")
    public class120 field4859;

    @OriginalMember(owner = "client!um", name = "s", descriptor = "[Lcd;")
    public class170[] field4856;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V", line = 3)
    public static void method2057(byte arg0) {
        field4854 = null;
        if (arg0 != -45) {
            field4847 = -115;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lkk;III)V", line = 14)
    public static final void method2058(class102 arg0, int arg1, int arg2, int arg3) {
        int var4 = class411.field6089[arg1][arg2][arg3];
        int var5 = 0;
        arg0.field1422 = 0;
        while (var5 <= 24) {
            int var6 = var4 >> var5 & 0xFF;
            if (var6 <= 0) {
                break;
            }
            arg0.field1416[arg0.field1422++] = class27.field317[var6 - 1];
            var5 += 8;
        }
        for (int var7 = arg0.field1422; var7 < 4; var7++) {
            arg0.field1416[var7] = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILjg;)Lmm;", line = 41)
    public static final class152 method2059(int arg0, class186 arg1) {
        field4858++;
        return arg0 == 5 ? new class152(arg1.method1276((byte) 118), arg1.method1276((byte) -45), arg1.method1276((byte) 87), arg1.method1276((byte) -93), arg1.method1275(-1), arg1.method1275(-1), arg1.method1322(false)) : null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIILe;)Z", line = 52)
    public final boolean method2060(int arg0, int arg1, int arg2, class312 arg3) {
        if (arg0 != 28533) {
            this.field4856 = null;
        }
        field4850++;
        if (this.field4856 != null) {
            for (int var5 = 0; var5 < this.field4856.length; var5++) {
                if (this.field4856[var5].method1182(arg1, arg2) && this.field4859.method188(arg1, 65536, arg2, arg3)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 81)
    public static final Class method2061(String arg0, int arg1) throws ClassNotFoundException {
        field4857++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else if (arg1 == 0) {
            return Class.forName(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BLap;)V", line = 122)
    public static final void method2062(byte arg0, class279 arg1) {
        field4853++;
        class335 var2 = null;
        try {
            class26 var3 = arg1.method1887((byte) -40);
            while (var3.field304 == 0) {
                class84.method517((byte) -12, 1L);
            }
            if (var3.field304 == 1) {
                var2 = (class335) var3.field305;
                class186 var4 = class392.method2472((byte) 110);
                var2.method2211(var4.field3044, true, 0, var4.field3066);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method2210((byte) 96);
            }
        } catch (Exception var5) {
        }
        if (arg0 <= 94) {
            field4847 = -121;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZJ)Ljava/lang/String;", line = 162)
    public static final String method2063(boolean arg0, long arg1) {
        class105.field1472.setTime(new Date(arg1));
        field4845++;
        int var3 = class105.field1472.get(7);
        int var4 = class105.field1472.get(5);
        int var5 = class105.field1472.get(2);
        int var6 = class105.field1472.get(1);
        int var7 = class105.field1472.get(11);
        int var8 = class105.field1472.get(12);
        if (!arg0) {
            field4854 = null;
        }
        int var9 = class105.field1472.get(13);
        return class138.field2150[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class193.field3145[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIII)V", line = 192)
    public static final void method2064(int arg0, int arg1, int arg2, int arg3) {
        field4846++;
        if (arg0 < 24) {
            field4854 = null;
        }
        class31.field382 = new byte[arg3][arg2][arg1];
    }
}
