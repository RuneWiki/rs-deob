import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class86 extends class366 {

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "Lah;")
    public class216 field1118;

    @OriginalMember(owner = "client!ib", name = "D", descriptor = "[J")
    public static long[] field1116 = new long[256];

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "Lcs;")
    public static class189 field1120;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "Ltj;")
    public static class108 field1119;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "[I")
    public static int[] field1121;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "[I")
    public static int[] field1123;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1116[var0] = var1;
        }
        field1122 = 0;
        field1120 = new class189();
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBI)I", line = 7)
    public static final int method514(int arg0, byte arg1, int arg2) {
        field1115++;
        int var3 = 10 % ((arg1 + 29) / 50);
        int var4 = arg0 >>> 31;
        return (arg0 + var4) / arg2 - var4;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 19)
    public static final void method515(int arg0) {
        class109.method663((byte) -53, class59.field786, (long) class34.field434);
        field1114++;
        if (class265.field3898 != -1) {
            class178.method1283(3215, class265.field3898);
        }
        for (int var1 = 0; var1 < class10.field129; var1++) {
            if (class353.field5126[var1]) {
                class336.field4875[var1] = true;
            }
            class396.field5576[var1] = class353.field5126[var1];
            class353.field5126[var1] = false;
        }
        class370.field5268 = class34.field434;
        if (class59.field786.method864()) {
            class311.field4515 = true;
        }
        if (~class265.field3898 != arg0) {
            class10.field129 = 0;
            class154.method1138((byte) 107);
        }
        class59.field786.method931();
        class63.method404(class2.field14, -123);
        class239.field3529 = 0;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIBII)V", line = 60)
    public static final void method516(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        for (int var6 = arg5; var6 <= arg0; var6++) {
            class5.method17(class440.field6288[var6], arg2, arg4, (byte) 118, arg1);
        }
        if (arg3 > 107) {
            field1117++;
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lah;)V", line = 80)
    public class86(class216 arg0) {
        this.field1118 = arg0;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(B)V", line = 121)
    public static void method517(byte arg0) {
        field1119 = null;
        field1121 = null;
        field1123 = null;
        int var1 = -119 / ((-arg0 - 69) / 42);
        field1116 = null;
        field1120 = null;
    }
}
