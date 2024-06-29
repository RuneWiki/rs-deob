import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class332 {

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "Lbi;")
    public static class104 field5193 = new class104(38, 9);

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Z")
    public static volatile boolean field5195 = true;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "Lmn;")
    public static class162 field5194;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Llp;")
    public static class53 field5191;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIILkj;ILkj;IIII)V")
    public static final void method2211(int arg0, int arg1, int arg2, class55 arg3, int arg4, class55 arg5, int arg6, int arg7, int arg8, int arg9) {
        field5192++;
        int var10 = arg3.method417(64);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class139 var12 = (class139) class174.field2538.method2191((byte) -73, (long) var10);
        if (var12 == null) {
            class175[] var13 = class175.method1110(class120.field1646, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class19.field198.method1278(var13[0], true);
            class174.field2538.method2188(-123, (long) var10, var12);
        }
        class238.method1670(arg5.field6417, arg2, arg5.method415(-4) * 64, arg5.field6410, 0, arg1 >> 1, arg5.field6419, arg9 >> 1, -7, arg0);
        if (arg6 <= 120) {
            method2213(78, 110, -4);
        }
        int var14 = class229.field3812[0] + arg7 - 18;
        int var15 = class229.field3812[1] + arg4 - 54 - 16;
        int var16 = arg8 / 4 * 18 + var14;
        int var17 = arg8 % 4 * 18 + var15;
        var12.method852(var16, var17);
        if (arg3 == arg5) {
            class19.field198.method3040(-256, true, 18, var17 - 1, var16 + -1, 18);
        }
        class214 var18 = class454.method2857(-14005);
        var18.field3650 = arg3;
        var18.field3651 = var16;
        var18.field3645 = var16 + 16;
        var18.field3647 = var17 + 16;
        var18.field3644 = var17;
        class114.field1603.method2625(var18, 0);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
    public static void method2212(boolean arg0) {
        field5191 = null;
        if (arg0) {
            field5191 = null;
        }
        field5194 = null;
        field5193 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)I")
    public static final int method2213(int arg0, int arg1, int arg2) {
        field5190++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg1 >> 7;
        int var4 = 99 / ((arg2 - 39) / 43);
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
    public static final void method2214(int arg0, int arg1) {
        class491.field7427.method2202(arg1 ^ arg1, arg0);
        field5196++;
    }
}
