import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class381 {

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field5520 = 0;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "[I")
    public static int[] field5521 = new int[200];

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field5518;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public static int field5522;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V", line = 9)
    public static void method2357(int arg0) {
        if (arg0 != -1) {
            method2358(13, -6, 43, -77, -71, -25, -75, 6);
        }
        field5521 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIIIII)V", line = 23)
    public static final void method2358(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5522++;
        int var8 = -116 / ((-arg4 - 35) / 56);
        int var9 = arg3 + arg0;
        int var10 = arg6 - arg0;
        for (int var11 = arg3; var11 < var9; var11++) {
            class518.method3153(arg2, arg1, class193.field2839[var11], -7, arg7);
        }
        for (int var12 = arg6; var12 > var10; var12--) {
            class518.method3153(arg2, arg1, class193.field2839[var12], -7, arg7);
        }
        int var13 = arg2 - arg0;
        int var14 = arg0 + arg1;
        for (int var15 = var9; var15 <= var10; var15++) {
            int[] var16 = class193.field2839[var15];
            class518.method3153(var14, arg1, var16, -7, arg7);
            class518.method3153(var13, var14, var16, -7, arg5);
            class518.method3153(arg2, var13, var16, -7, arg7);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BIIILhga;I)Ljava/awt/Frame;", line = 67)
    public static final Frame method2359(byte arg0, int arg1, int arg2, int arg3, class300 arg4, int arg5) {
        field5518++;
        if (!arg4.method1866(true)) {
            return null;
        }
        if (arg2 == 0) {
            class750[] var6 = class31.method153(1006102306, arg4);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field10454 == arg5 && var6[var8].field10455 == arg3 && (arg1 == 0 || var6[var8].field10453 == arg1) && (!var7 || var6[var8].field10450 > arg2)) {
                    var7 = true;
                    arg2 = var6[var8].field10450;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class432 var9 = arg4.method1880(arg1, arg3, arg5, 120, arg2);
        while (var9.field6198 == 0) {
            class363.method2283(10L, -24244);
        }
        if (arg0 <= 59) {
            field5521 = null;
        }
        Frame var10 = (Frame) var9.field6200;
        if (var10 == null) {
            return null;
        } else if (var9.field6198 == 2) {
            class702.method3948(arg4, 0, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V", line = 150)
    public static final void method2360(int arg0, int arg1) {
        class4.field30 = arg0;
        field5519++;
        class348 var2 = class11.field100;
        synchronized (class11.field100) {
            class11.field100.method2220(false);
        }
        if (arg1 != 0) {
            field5521 = null;
        }
    }
}
