import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class285 extends class135 {

    @OriginalMember(owner = "client!p", name = "H", descriptor = "I")
    public static int field4522 = 1;

    @OriginalMember(owner = "client!p", name = "C", descriptor = "[I")
    public static int[] field4517 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!p", name = "M", descriptor = "Ljava/lang/String;")
    public static String field4526 = "shake:";

    @OriginalMember(owner = "client!p", name = "z", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!p", name = "A", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!p", name = "B", descriptor = "I")
    public int field4516;

    @OriginalMember(owner = "client!p", name = "D", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!p", name = "J", descriptor = "I")
    public int field4523;

    @OriginalMember(owner = "client!p", name = "L", descriptor = "I")
    public int field4525;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "I")
    public int field4528;

    @OriginalMember(owner = "client!p", name = "E", descriptor = "Lkf;")
    public static class180 field4519;

    @OriginalMember(owner = "client!p", name = "F", descriptor = "Ljava/lang/String;")
    public String field4520;

    @OriginalMember(owner = "client!p", name = "G", descriptor = "[I")
    public int[] field4521;

    @OriginalMember(owner = "client!p", name = "N", descriptor = "[I")
    public int[] field4527;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "[Lpk;")
    public class100[] field4524;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "[Ljava/lang/String;")
    public String[] field4513;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)V")
    public static void method1900(int arg0) {
        field4517 = null;
        field4519 = null;
        field4526 = null;
        if (arg0 != 524287) {
            field4517 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZII)I")
    public static final int method1901(boolean arg0, int arg1, int arg2) {
        field4515++;
        int var3 = class173.method1220(true, arg1 - 1, arg2 + -1) - (-class173.method1220(arg0, arg1 - 1, arg2 + 1) - class173.method1220(true, arg1 + 1, arg2 + -1) - class173.method1220(true, arg1 + 1, arg2 + 1));
        int var4 = class173.method1220(true, arg1, arg2 - 1) - (-class173.method1220(true, arg1, arg2 + 1) - class173.method1220(true, arg1 - 1, arg2) - class173.method1220(arg0, arg1 - -1, arg2));
        int var5 = class173.method1220(arg0, arg1, arg2);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ldl;Ldl;ILdl;Ldl;)V")
    public static final void method1902(class123 arg0, class123 arg1, int arg2, class123 arg3, class123 arg4) {
        class162.field2521 = arg4;
        if (arg2 != 3) {
            return;
        }
        class125.field1866 = arg0;
        field4514++;
        class104.field1603 = arg3;
        class143.field2099 = arg1;
        class104.field1608 = new class214[class143.field2099.method812(111)][];
        class3.field33 = new boolean[class143.field2099.method812(arg2 ^ 0x7F)];
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
    public static final void method1903(byte arg0) {
        if (arg0 > -77) {
            method1903((byte) 20);
        }
        field4518++;
        int[] var1 = new int[class98.field1529];
        int var2 = 0;
        for (int var3 = 0; var3 < class98.field1529; var3++) {
            class253 var5 = class162.method1112(var3, (byte) 103);
            if (var5.field4066 >= 0 || var5.field4102 >= 0) {
                var1[var2++] = var3;
            }
        }
        class126.field1867 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class126.field1867[var4] = var1[var4];
        }
    }
}
