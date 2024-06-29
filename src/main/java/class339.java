import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class339 extends class34 {

    @OriginalMember(owner = "client!t", name = "v", descriptor = "Ljava/lang/String;")
    public static String field5278 = "";

    @OriginalMember(owner = "client!t", name = "C", descriptor = "Ldb;")
    public static class102 field5285 = new class102(4);

    @OriginalMember(owner = "client!t", name = "t", descriptor = "I")
    public static int field5276;

    @OriginalMember(owner = "client!t", name = "u", descriptor = "I")
    public static int field5277;

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    public static int field5279;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
    public int field5281;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!t", name = "D", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "Ljava/lang/String;")
    public String field5284;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "Ljava/lang/String;")
    public String field5287;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZILak;)Lfb;", line = 6)
    public static final class198 method2358(boolean arg0, int arg1, class172 arg2) {
        if (arg0) {
            return (class198) null;
        } else {
            field5282++;
            byte[] var3 = arg2.method1292(arg0, arg1);
            return var3 == null ? null : new class198(var3);
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V", line = 23)
    public static final void method2359(int arg0) {
        field5283++;
        if (arg0 == 128) {
            class74.field1039.method702((byte) 120);
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIII)V", line = 48)
    public static final void method2360(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5286++;
        if (arg3 > arg0 || arg5 < 128 || arg0 > 13056 || arg5 > 13056) {
            class78.field1100 = -1;
            class193.field3154 = -1;
            return;
        }
        int var8 = class123.method889(1, class49.field698, arg0, arg5) - arg2;
        int var9 = arg0 - class120.field1825;
        int var10 = class170.field2801[class74.field1036];
        int var11 = class170.field2810[class74.field1036];
        int var12 = var8 - class83.field1173;
        int var13 = arg5 - class260.field4150;
        int var14 = class170.field2801[class186.field3076];
        int var15 = class170.field2810[class186.field3076];
        int var16 = var9 * var15 + var13 * var14 >> 16;
        int var17 = var13 * var15 - (var9 * var14) >> 16;
        int var19 = var11 * var12 - var10 * var17 >> 16;
        int var20 = var10 * var12 + var11 * var17 >> 16;
        if (var20 < 50) {
            class78.field1100 = -1;
            class193.field3154 = -1;
        } else if (class232.field3690) {
            int var22 = arg6 * 512 >> 8;
            int var23 = arg7 * 512 >> 8;
            class193.field3154 = var16 * var23 / var20 + arg1;
            class78.field1100 = arg4 + (var19 * var22 / var20);
        } else {
            class193.field3154 = arg1 + ((var16 << 9) / var20);
            class78.field1100 = arg4 + ((var19 << 9) / var20);
        }
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V", line = 108)
    public static void method2361(int arg0) {
        field5285 = null;
        int var1 = 50 % ((arg0 - 55) / 55);
        field5278 = null;
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(I)Lpd;", line = 120)
    public final class173 method2362(int arg0) {
        field5276++;
        int var2 = -81 / ((arg0 - 47) / 34);
        return class29.field399[this.field457];
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIB)V", line = 141)
    public static final void method2363(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if ((arg2 - arg0) >= class336.field5249 && class191.field3131 >= (arg0 + arg2) && (arg1 - arg0) >= class98.field1410 && class279.field4497 >= (arg0 + arg1)) {
            class207.method1502(arg3, arg2, arg0, true, arg1);
        } else {
            class31.method171(arg0, arg1, arg2, -29, arg3);
        }
        if (arg4 <= 24) {
            method2360(26, -48, -97, -94, 112, 8, 74, 40);
        }
        field5280++;
    }
}
