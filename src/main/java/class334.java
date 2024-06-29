import java.awt.Canvas;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class334 {

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "[I")
    public static int[] field5194 = new int[5];

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "Ljava/lang/String;")
    public static String field5199 = "Members object";

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field5193;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "Lub;")
    public static class23 field5192;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field5197;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 4)
    public static void method2335(int arg0) {
        if (arg0 != 5000) {
            method2335(-101);
        }
        field5192 = null;
        field5199 = null;
        field5197 = null;
        field5194 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lbk;IIIII)Ljava/awt/Frame;", line = 25)
    public static final Frame method2336(class69 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5193++;
        if (!arg0.method551((byte) -61)) {
            return null;
        }
        if (arg1 == 0) {
            class108[] var6 = class139.method1069(arg0, 0);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field1765 == arg2 && var6[var8].field1768 == arg4 && (arg3 == 0 || var6[var8].field1761 == arg3) && (!var7 || var6[var8].field1760 > arg1)) {
                    var7 = true;
                    arg1 = var6[var8].field1760;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class23 var9 = arg0.method544(arg3, arg1, true, arg2, arg4);
        while (var9.field405 == 0) {
            class245.method1729(-6, 10L);
        }
        Frame var10 = (Frame) var9.field409;
        if (arg5 != 10) {
            return (Frame) null;
        } else if (var10 == null) {
            return null;
        } else if (var9.field405 == 2) {
            class34.method315(arg0, var10, true);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)Lnn;", line = 101)
    public static final class44 method2337(boolean arg0, int arg1) {
        field5196++;
        if (arg0) {
            field5199 = (String) null;
        }
        return class53.field812 && arg1 >= class151.field2470 && arg1 <= class135.field2140 ? class204.field3177[arg1 - class151.field2470] : null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BI)[B", line = 115)
    public static final synchronized byte[] method2338(byte arg0, int arg1) {
        field5198++;
        if (arg1 == 100 && class339.field5242 > 0) {
            byte[] var2 = class158.field2585[--class339.field5242];
            class158.field2585[class339.field5242] = null;
            return var2;
        } else if (arg1 == 5000 && class247.field3682 > 0) {
            byte[] var3 = class73.field1109[--class247.field3682];
            class73.field1109[class247.field3682] = null;
            return var3;
        } else if (arg1 == 30000 && class73.field1107 > 0) {
            byte[] var4 = class108.field1762[--class73.field1107];
            class108.field1762[class73.field1107] = null;
            return var4;
        } else {
            if (arg0 != -97) {
                field5199 = (String) null;
            }
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIIB)V", line = 168)
    public static final void method2339(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field5195++;
        if (arg0 == arg1) {
            class80.method623(arg0, arg4, arg5, arg6, 114, arg3, arg2);
            return;
        }
        if (class310.field4897 <= (arg5 - arg0) && arg0 + arg5 <= class180.field2862 && arg6 - arg1 >= class104.field1719 && class333.field5188 >= (arg1 + arg6)) {
            class289.method2032(arg2, arg4, arg5, arg3, arg6, -3, arg1, arg0);
        } else {
            class71.method567(arg2, arg3, arg6, arg1, 30059, arg0, arg5, arg4);
        }
        int var8 = -5 % ((arg7 - 74) / 48);
    }
}
