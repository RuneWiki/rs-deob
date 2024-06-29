import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class29 {

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "I")
    public int field507 = -1;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "Lna;")
    public static class26 field505 = class69.method505("Benutzen", (byte) -117);

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Lna;")
    public static class26 field500 = class69.method505("hint_headicons", (byte) -121);

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field499;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!hj", name = "m", descriptor = "Lve;")
    public static class266 field509;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "Lqc;")
    public class4 field504;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "[I")
    public int[] field498;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "[Lna;")
    public class26[] field502;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V", line = 4)
    public static final void method235(int arg0, int arg1) {
        class18.field253 = -1;
        class165.field2566 = -1;
        field508++;
        if (arg1 <= 55) {
            method237(-67, 28L, (byte) 76, (class26) null, -45, (short) 94, (class26) null, -125);
        }
        class118.field1860 = arg0;
        class265.method1868((byte) 87);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lna;B)Z", line = 23)
    public static final boolean method236(class26 arg0, byte arg1) {
        field503++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class321.field5520; var2++) {
            if (arg0.method162(-121, class267.field4406[var2])) {
                return true;
            }
        }
        if (arg1 != -82) {
            field500 = (class26) null;
        }
        if (arg0.method162(arg1 - 46, class13.field221.field2495)) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IJBLna;ISLna;I)V", line = 56)
    public static final void method237(int arg0, long arg1, byte arg2, class26 arg3, int arg4, short arg5, class26 arg6, int arg7) {
        field499++;
        if (arg2 > -23) {
            method237(-45, 37L, (byte) -37, (class26) null, -16, (short) 110, (class26) null, -75);
        }
        if (class11.field153 || class126.field1955 >= 500) {
            return;
        }
        class141.field2154[class126.field1955] = arg6;
        class252.field4138[class126.field1955] = arg3;
        class85.field1404[class126.field1955] = arg0 == -1 ? class132.field2013 : arg0;
        class142.field2178[class126.field1955] = arg5;
        class268.field4429[class126.field1955] = arg1;
        class193.field3009[class126.field1955] = arg4;
        class322.field5529[class126.field1955] = arg7;
        class126.field1955++;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V", line = 95)
    public static void method238(byte arg0) {
        int var1 = 103 / ((arg0 + 13) / 52);
        field505 = null;
        field500 = null;
        field509 = null;
    }
}
