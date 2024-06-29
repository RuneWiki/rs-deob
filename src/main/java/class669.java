import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class669 {

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "Z")
    public static boolean field9324 = false;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Lcq;")
    public static class110 field9323 = new class110(1, -1);

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "F")
    public static float field9326;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field9322;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field9325;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V", line = 9)
    public static void method3700(int arg0) {
        field9323 = null;
        if (arg0 > -54) {
            method3702(108, (byte) 60, -119);
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V", line = 24)
    public static final void method3701(int arg0) {
        if (arg0 <= -114) {
            if (class353.field4757.field6614 && class386.field5201.field2001 != -1) {
                class291.method1699(class386.field5201.field2001, class386.field5201.field1987, 32506);
            }
            field9325++;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IBI)I", line = 41)
    public static final int method3702(int arg0, byte arg1, int arg2) {
        if (arg1 != 111) {
            return 120;
        }
        field9322++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg0 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg0 & 0xFF80) + var3;
        }
    }
}
