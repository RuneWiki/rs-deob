import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class54 extends class375 {

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "[S")
    public static short[] field1060 = new short[256];

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "Lno;")
    public static class652 field1057 = new class652();

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(B)V", line = 3)
    public static void method590(byte arg0) {
        field1060 = null;
        field1057 = null;
        if (arg0 != -86) {
            field1057 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILqaa;)V", line = 15)
    public static final void method591(int arg0, class26 arg1) {
        field1058++;
        if (arg0 != 484960808) {
            method592(73, 15);
        }
        for (int var2 = 0; var2 < class580.field8173; var2++) {
            int var3 = class568.field7985[var2];
            class491 var4 = class141.field2087[var3];
            int var5 = arg1.method3826(false);
            if ((var5 & 0x8) != 0) {
                var5 += arg1.method3826(false) << 8;
            }
            if ((var5 & 0x800) != 0) {
                var5 += arg1.method3826(false) << 16;
            }
            class60.method641(var3, var5, (byte) 120, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Z", line = 53)
    public static final boolean method592(int arg0, int arg1) {
        field1059++;
        if (arg0 != 8) {
            method592(-49, -27);
        }
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILpu;Lfa;)V", line = 76)
    public static final void method593(int arg0, class522 arg1, class209 arg2) {
        if (arg0 != 611) {
            method592(102, 37);
        }
        field1056++;
        class199.field2809 = arg2;
        class207.field2914 = arg1;
    }
}
