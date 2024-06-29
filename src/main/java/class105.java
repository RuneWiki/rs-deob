import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class105 {

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field1512 = -1;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "Llm;")
    public static class150 field1509 = new class150(30);

    @OriginalMember(owner = "client!di", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1514 = "rating: ";

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method668(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        if (arg4 != 60) {
            return;
        }
        field1511++;
        if (arg1 == arg6) {
            class284.method1866(95, arg3, arg7, arg0, arg5, arg1, arg2);
        } else if (class261.field4204 <= (arg0 - arg1) && class18.field310 >= (arg0 + arg1) && class271.field4322 <= arg3 - arg6 && class311.field5001 >= (arg3 + arg6)) {
            class112.method718(arg2, arg5, arg0, arg3, arg6, arg4 + 288683109, arg1, arg7);
        } else {
            class113.method721(arg5, -124, arg1, arg7, arg3, arg0, arg2, arg6);
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method669(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1510++;
        if (arg0 != -17815) {
            method671(-23);
        }
        int var8 = arg1 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = 2048 - arg4 & 0x7FF;
        int var10 = 2048 - arg7 & 0x7FF;
        int var11 = (class190.field2886 - class310.field4986) * var8 / 100 + class310.field4986;
        int var12 = 0;
        int var13 = 0;
        int var14 = arg6 * var11 >> 8;
        int var15 = var14;
        if (var9 != 0) {
            int var16 = class118.field1690[var9];
            int var17 = class118.field1697[var9];
            var13 = -var14 * var17 >> 16;
            var15 = var14 * var16 >> 16;
        }
        if (var10 != 0) {
            int var18 = class118.field1690[var10];
            int var19 = class118.field1697[var10];
            var12 = var15 * var19 >> 16;
            var15 = var15 * var18 >> 16;
        }
        class277.field4407 = arg4;
        class246.field3870 = arg7;
        class188.field2848 = arg3 - var15;
        class178.field2603 = arg5 - var12;
        class27.field423 = arg2 - var13;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static void method670(int arg0) {
        int var1 = -80 % ((arg0 - 6) / 60);
        field1509 = null;
        field1514 = null;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)J")
    public static final long method671(int arg0) {
        if (arg0 != 0) {
            method669(-98, 35, -78, -118, -78, -116, -50, -36);
        }
        field1508++;
        return class157.field2162.method382((byte) 97);
    }
}
