import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class197 {

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "[I")
    public static int[] field2755 = new int[4096];

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!mn", name = "b", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(IB)I", line = 4)
    public static final int method1391(int arg0, byte arg1) {
        field2754++;
        int var2 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
        if (arg1 != 101) {
            return 55;
        }
        int var3 = (var2 >>> 2 & 0xB3333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(BII)V", line = 22)
    public static final void method1392(byte arg0, int arg1, int arg2) {
        field2753++;
        class143 var3 = class163.method1176((byte) -77, arg2, 1);
        var3.method1032((byte) 121);
        if (arg0 == 56) {
            var3.field1965 = arg1;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V", line = 45)
    public static void method1393(int arg0) {
        field2755 = null;
        if (arg0 != -16598) {
            field2755 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)V", line = 62)
    public static final void method1394(int arg0, int arg1) {
        field2756++;
        if (class301.field4441 == null || class301.field4441.length < arg1) {
            class301.field4441 = new int[arg1];
        }
        if (arg0 <= 57) {
            field2755 = (int[]) null;
        }
    }
}
