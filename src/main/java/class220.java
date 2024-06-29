import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class220 {

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field2907 = 0;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZIIIIIII)V")
    public static final void method1286(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2906++;
        int var8 = class304.method2068(class379.field5521, arg7, -125, class125.field1751);
        int var9 = class304.method2068(class379.field5521, arg6, -117, class125.field1751);
        int var10 = class304.method2068(class87.field1227, arg4, -125, class299.field4382);
        int var11 = class304.method2068(class87.field1227, arg3, -104, class299.field4382);
        int var12 = class304.method2068(class379.field5521, arg2 + arg7, -103, class125.field1751);
        int var13 = class304.method2068(class379.field5521, arg6 - arg2, -103, class125.field1751);
        for (int var14 = var8; var14 < var12; var14++) {
            class207.method1221((byte) -122, var10, var11, class384.field5560[var14], arg5);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class207.method1221((byte) -127, var10, var11, class384.field5560[var15], arg5);
        }
        int var16 = class304.method2068(class87.field1227, arg4 + arg2, -112, class299.field4382);
        if (arg0) {
            method1286(true, -123, -33, 112, 52, 29, -97, 120);
        }
        int var17 = class304.method2068(class87.field1227, arg3 - arg2, -108, class299.field4382);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class384.field5560[var18];
            class207.method1221((byte) -124, var10, var16, var19, arg5);
            class207.method1221((byte) -128, var16, var17, var19, arg1);
            class207.method1221((byte) -122, var17, var11, var19, arg5);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)Lnb;")
    public static final class333 method1287(byte arg0, int arg1) {
        field2908++;
        class333 var2 = (class333) class270.field3909.method1137((long) arg1, arg0 ^ 0x82507F0D);
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -126) {
            field2907 = 38;
        }
        byte[] var3 = class403.field6003.method2261(arg1, 26, 73);
        class333 var4 = new class333();
        if (var3 != null) {
            var4.method2201(0, new class228(var3));
        }
        class270.field3909.method1144((long) arg1, var4, -3480);
        return var4;
    }
}
