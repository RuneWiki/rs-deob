import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class157 {

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "I")
    public static int field2511 = 0;

    @OriginalMember(owner = "client!wea", name = "e", descriptor = "[I")
    public static int[] field2513 = new int[4];

    @OriginalMember(owner = "client!wea", name = "f", descriptor = "[I")
    public static int[] field2514 = new int[2];

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!wea", name = "b", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!wea", name = "d", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!wea", name = "g", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(IIZLjava/lang/String;Ljava/lang/String;)V")
    public static final void method1157(int arg0, int arg1, boolean arg2, String arg3, String arg4) {
        if (arg0 <= 82) {
            method1159(-76);
        }
        class322.method2042(arg1, arg2, -1, arg3, arg4, -126, true);
        field2509++;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(ZI)I")
    public static final int method1158(boolean arg0, int arg1) {
        field2510++;
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else {
            if (arg0) {
                method1161(-7, null);
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)Z")
    public static final boolean method1159(int arg0) {
        field2515++;
        return class87.field1246 >= arg0;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(B)V")
    public static void method1160(byte arg0) {
        field2514 = null;
        field2513 = null;
        if (arg0 != -51) {
            field2514 = null;
        }
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1161(int arg0, String arg1) {
        field2512++;
        if (arg1 == null) {
            return;
        }
        if (!(class690.field9544 < 200 || class71.field1005) || class690.field9544 >= 200) {
            class618.method3559(class430.field6380.method2679(class650.field9160, -62), false, 4);
            String var2 = class430.field6381.method2679(class650.field9160, 85);
            if (var2 != null) {
                class618.method3559(var2, false, 4);
            }
            return;
        }
        String var3 = class712.method4064(-13, arg1);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class690.field9544; var4++) {
            String var9 = class712.method4064(-13, class133.field1790[var4]);
            if (var9 != null && var9.equals(var3)) {
                class618.method3559(arg1 + class430.field6408.method2679(class650.field9160, 104), false, 4);
                return;
            }
            if (class71.field1003[var4] != null) {
                String var10 = class712.method4064(-13, class71.field1003[var4]);
                if (var10 != null && var10.equals(var3)) {
                    class618.method3559(arg1 + class430.field6408.method2679(class650.field9160, -98), false, 4);
                    return;
                }
            }
        }
        if (arg0 <= 110) {
            field2514 = null;
        }
        for (int var5 = 0; var5 < class569.field8065; var5++) {
            String var7 = class712.method4064(-13, class254.field3654[var5]);
            if (var7 != null && var7.equals(var3)) {
                class618.method3559(class430.field6413.method2679(class650.field9160, 104) + arg1 + class430.field6414.method2679(class650.field9160, 80), false, 4);
                return;
            }
            if (class331.field4764[var5] != null) {
                String var8 = class712.method4064(-13, class331.field4764[var5]);
                if (var8 != null && var8.equals(var3)) {
                    class618.method3559(class430.field6413.method2679(class650.field9160, -102) + arg1 + class430.field6414.method2679(class650.field9160, 105), false, 4);
                    return;
                }
            }
        }
        if (class712.method4064(-13, class130.field1749.field9513).equals(var3)) {
            class618.method3559(class430.field6411.method2679(class650.field9160, 97), false, 4);
            return;
        }
        class739.field10370++;
        class468 var6 = class93.method734(class29.field284, class658.field9218, 8174);
        var6.field6839.method3730(109, class574.method3322(arg1, 16383));
        var6.field6839.method3692(122, arg1);
        class120.method872((byte) -97, var6);
    }
}
