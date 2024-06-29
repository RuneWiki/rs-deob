import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class103 {

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "[I")
    public static int[] field1417 = new int[5];

    @OriginalMember(owner = "client!pia", name = "h", descriptor = "I")
    public static int field1424 = -1;

    @OriginalMember(owner = "client!pia", name = "e", descriptor = "[I")
    public static int[] field1421 = new int[500];

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "I")
    public int field1418;

    @OriginalMember(owner = "client!pia", name = "c", descriptor = "I")
    public int field1419;

    @OriginalMember(owner = "client!pia", name = "d", descriptor = "I")
    public int field1420;

    @OriginalMember(owner = "client!pia", name = "f", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!pia", name = "g", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!pia", name = "i", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!pia", name = "k", descriptor = "I")
    public int field1427;

    @OriginalMember(owner = "client!pia", name = "l", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!pia", name = "m", descriptor = "I")
    public static int field1429;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pia", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field1430;

    @OriginalMember(owner = "client!pia", name = "j", descriptor = "[I")
    public static int[] field1426;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(Ljava/lang/String;Laa;IILor;IILeia;Lda;III)V")
    public static final void method794(String arg0, class514 arg1, int arg2, int arg3, class668 arg4, int arg5, int arg6, class255 arg7, class66 arg8, int arg9, int arg10, int arg11) {
        field1425++;
        int var12;
        if (class502.field6938 == 4) {
            var12 = (int) class135.field1974 & 0x3FFF;
        } else {
            var12 = (int) class135.field1974 + class594.field8116 & 0x3FFF;
        }
        int var13 = Math.max(arg4.field9282 / 2, arg4.field9297 / 2) + 10;
        int var14 = arg2 * arg2 + arg10 * arg10;
        if (var14 > var13 * var13) {
            return;
        }
        int var15 = class749.field10324[var12];
        int var16 = class749.field10316[var12];
        if (class502.field6938 != 4) {
            var15 = var15 * 256 / (class299.field4334 + 256);
            var16 = var16 * 256 / (class299.field4334 + 256);
        }
        int var17 = arg2 * var15 + arg10 * var16 >> 14;
        int var18 = -9 % ((arg6 + 22) / 37);
        int var19 = arg2 * var16 - (arg10 * var15) >> 14;
        int var20 = arg7.method1701((byte) -121, arg0, 100, null);
        int var21 = var17 - var20 / 2;
        int var22 = arg7.method1704(true, 100, arg0, null, 0);
        if (var21 >= -arg4.field9282 && var21 <= arg4.field9282 && -arg4.field9297 <= var19 && var19 <= arg4.field9297) {
            arg8.method574(arg0, arg5, arg9, null, var21 - (-arg5 - arg4.field9282 / 2), -1, arg11, 1, var20, 50, 0, 0, 0, arg1, null, arg4.field9297 / 2 + arg9 - arg3 - var22 - var19);
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IC)Z")
    public static final boolean method795(int arg0, char arg1) {
        if (arg0 == 64) {
            field1422++;
            return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(ZB)V")
    public static final void method796(boolean arg0, byte arg1) {
        field1428++;
        if (arg0 && class375.field5414 != null) {
            class664.field9184 = class375.field5414.field6712;
        } else {
            class664.field9184 = -1;
        }
        class375.field5414 = null;
        class37.field579 = 0;
        class474.field6605 = null;
        class101.field1413 = null;
        class375.method2340();
        class375.field5423.method2549(-103);
        class742.field10244 = null;
        if (arg1 >= -84) {
            return;
        }
        class760.field10520 = null;
        class419.field6021 = null;
        class768.field10592 = null;
        class45.field685 = null;
        class28.field412 = null;
        class375.field5427 = null;
        class232.field3167 = -1;
        class12.field192 = null;
        class425.field6066 = null;
        class603.field8204 = null;
        class587.field7831 = -1;
        if (class375.field5418 != null) {
            class375.field5418.method2236((byte) -116);
            class375.field5418.method2234(128, 1, 64);
        }
        if (class375.field5416 != null) {
            class375.field5416.method392(true, 64, 64);
        }
        if (class375.field5412 != null) {
            class375.field5412.method3735(11, 64);
        }
        class642.field8904.method3239(64, true);
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(B)V")
    public static void method797(byte arg0) {
        if (arg0 != 127) {
            method794(null, null, 91, -126, null, 80, -108, null, null, -29, 14, 13);
        }
        field1426 = null;
        field1417 = null;
        field1421 = null;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V")
    public static final void method798(int arg0) {
        field1429++;
        try {
            Method var1 = (field1430 == null ? (field1430 = method799("java.lang.Runtime")) : field1430).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class262.field3897 = var3;
                } catch (Throwable var4) {
                }
            }
            if (arg0 != -1358116690) {
                field1417 = null;
            }
        } catch (Exception var5) {
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method799(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
