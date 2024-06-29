import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class171 {

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public static int field2600 = 0;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Z")
    public static boolean field2602 = true;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public static int field2599;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "I")
    public static int field2603;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V", line = 20)
    public static final void method1158(int arg0, int arg1) {
        class75 var2 = class204.method1371(2, 7, arg0);
        if (arg1 != 6658) {
            field2600 = 33;
        }
        field2599++;
        var2.method533(22461);
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V", line = 36)
    public static final void method1159(int arg0) {
        if (class246.field3863 > class276.field4253) {
            class276.field4253 = (float) ((double) class276.field4253 / 30.0D + (double) class276.field4253);
            if (class276.field4253 > class246.field3863) {
                class276.field4253 = class246.field3863;
            }
            class242.method1649(1);
        } else if (class276.field4253 > class246.field3863) {
            class276.field4253 = (float) ((double) class276.field4253 - (double) class276.field4253 / 30.0D);
            if (class246.field3863 > class276.field4253) {
                class276.field4253 = class246.field3863;
            }
            class242.method1649(1);
        }
        field2603++;
        if (class121.field1869 != -1 && class324.field5050 != -1) {
            int var1 = class121.field1869 - class129.field2023;
            int var2 = class324.field5050 - class342.field5334;
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            class129.field2023 -= -var1;
            if (var1 == 0 && var2 == 0) {
                class121.field1869 = -1;
                class324.field5050 = -1;
            }
            class342.field5334 += var2;
            class242.method1649(1);
        }
        if (arg0 != 14382) {
            method1158(-81, 67);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BLgn;)Lhk;", line = 91)
    public static final class132 method1160(byte arg0, class303 arg1) {
        if (arg0 == 47) {
            field2604++;
            return new class132(arg1.method2042(7), arg1.method2042(7), arg1.method2042(7), arg1.method2042(7), arg1.method2042(7), arg1.method2042(7), arg1.method2042(arg0 - 40), arg1.method2042(arg0 - 40), arg1.method2059(arg0 ^ 0xD0), arg1.method2043((byte) -119));
        } else {
            return (class132) null;
        }
    }
}
