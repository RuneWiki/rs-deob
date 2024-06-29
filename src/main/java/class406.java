import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class406 extends class543 {

    @OriginalMember(owner = "client!dea", name = "g", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!dea", name = "h", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!dea", name = "i", descriptor = "I")
    public static int field5574;

    @OriginalMember(owner = "client!dea", name = "k", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!dea", name = "l", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!dea", name = "j", descriptor = "[[[I")
    public static int[][][] field5575;

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(B)V")
    public static void method2421(byte arg0) {
        field5575 = null;
        if (arg0 > -49) {
            method2424(false, -128, 117, 78);
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(IILkr;)Lmj;")
    public static final class315 method2422(int arg0, int arg1, class329 arg2) {
        if (arg1 == 8787) {
            field5574++;
            byte[] var3 = arg2.method2076(arg1 - 8786, arg0);
            return var3 == null ? null : new class315(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)I")
    public static final int method2423(int arg0) {
        field5576++;
        if (arg0 != -10665) {
            method2423(-47);
        }
        if (class15.field162 == null) {
            if (!class264.field3373 && class50.field673 > 0) {
                if (class592.field8560 && class634.field9227.method2004((byte) -73, 81) && class50.field673 > 2) {
                    return ((class245) class57.field760.field7933.field1399.field1399).field3101;
                }
                return ((class245) class57.field760.field7933.field1399).field3101;
            }
            int var1 = class343.field4760.method100((byte) -60);
            int var2 = class343.field4760.method92(8);
            int var3 = class431.field5868;
            int var4 = class423.field5739;
            int var5 = class641.field9318;
            if (var3 < var1 && var3 + var5 > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class50.field673; var7++) {
                    if (class641.field9319) {
                        int var11 = var4 + ((class50.field673 - var7 - 1) * 16) + 33;
                        if ((var11 - 13) < var2 && var11 + 3 >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = var4 + ((-var7 + -1 + class50.field673) * 16) + 31;
                        if (var12 - 13 < var2 && var12 + 3 >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class273 var9 = new class273(class57.field760);
                    for (class245 var10 = (class245) var9.method1669(arg0 - 14599); var10 != null; var10 = (class245) var9.method1670((byte) 109)) {
                        if (var6 == var8++) {
                            return var10.field3101;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZIII)V")
    public static final void method2424(boolean arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 << 3;
        field5573++;
        int var5 = arg3 << 3;
        int var6 = arg2 << 3;
        class568.field7951 = var4;
        class521.field7250 = var6;
        if (class621.field8952 == 2) {
            class60.field838 = var6;
            class627.field9131 = var4;
            class392.field5439 = var5;
        }
        class509.method2849(3);
        if (arg0) {
            method2422(52, -24, null);
        }
        class194.field2524 = true;
    }
}
