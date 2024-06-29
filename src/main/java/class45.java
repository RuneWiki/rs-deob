import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class45 {

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field511 = 1;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "Lvh;")
    public static class62 field516 = new class62(128);

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field518 = 0;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Lf;")
    public static class274 field517;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)Lom;", line = 8)
    public static final class79 method275(int arg0, int arg1) {
        class79 var2 = (class79) class273.field4322.method1998(-1114531641, (long) arg0);
        field515++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class251.field3976.method100(5, arg0, (byte) -107);
        class79 var4 = new class79();
        int var5 = 49 / ((arg1 - 27) / 63);
        if (var3 != null) {
            var4.method520(new class143(var3), true);
        }
        class273.field4322.method2000(var4, (byte) -98, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILnk;)I", line = 38)
    public static final int method276(int arg0, class16 arg1) {
        field514++;
        int var2 = arg0;
        if (arg1.method125(class123.field1687, arg0 ^ 0xFFFFFF8A)) {
            var2 = arg0 + 1;
        }
        if (arg1.method125(class54.field628, -68)) {
            var2++;
        }
        if (arg1.method125(class303.field4730, 124)) {
            var2++;
        }
        if (arg1.method125(class31.field368, arg0 ^ 0x40)) {
            var2++;
        }
        if (arg1.method125(class139.field2081, 122)) {
            var2++;
        }
        if (arg1.method125(class171.field2602, 113)) {
            var2++;
        }
        if (arg1.method125(class172.field2612, arg0 ^ 0xFFFFFFBC)) {
            var2++;
        }
        if (arg1.method125(class226.field3419, -27)) {
            var2++;
        }
        if (arg1.method125(class172.field2618, 112)) {
            var2++;
        }
        if (arg1.method125(class333.field5325, arg0 ^ 0xFFFFFF94)) {
            var2++;
        }
        if (arg1.method125(class127.field1863, arg0 ^ 0x77)) {
            var2++;
        }
        if (arg1.method125(class2.field25, arg0 + 50)) {
            var2++;
        }
        if (arg1.method125(class311.field4884, 71)) {
            var2++;
        }
        if (arg1.method125(class103.field1399, 108)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(II)Lhi;", line = 98)
    public static final class323 method277(int arg0, int arg1) {
        field512++;
        int var2 = arg1 >> 16;
        if (arg0 != -12866) {
            return (class323) null;
        }
        int var3 = arg1 & 0xFFFF;
        if (class232.field3512[var2] == null || class232.field3512[var2][var3] == null) {
            boolean var4 = class296.method2104((byte) -64, var2);
            if (!var4) {
                return null;
            }
        }
        return class232.field3512[var2][var3];
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIC)I", line = 124)
    public static final int method278(int arg0, int arg1, char arg2) {
        if (arg1 < 19) {
            return -50;
        }
        field513++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg2 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V", line = 148)
    public static void method279(byte arg0) {
        field516 = null;
        if (arg0 >= -39) {
            method277(57, 63);
        }
        field517 = null;
    }
}
