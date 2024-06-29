import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class122 extends class503 {

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    public static int field1781 = -1;

    @OriginalMember(owner = "client!ri", name = "z", descriptor = "Lss;")
    public static class457 field1782 = new class457();

    @OriginalMember(owner = "client!ri", name = "C", descriptor = "I")
    public static int field1785 = 0;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public int field1771;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public int field1772;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
    public int field1773;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public int field1777;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    public int field1779;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!ri", name = "A", descriptor = "I")
    public int field1783;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "Ljava/lang/String;")
    public String field1774;

    @OriginalMember(owner = "client!ri", name = "B", descriptor = "[Lwea;")
    public static class167[] field1784;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method998(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class174.field2335 = arg2;
        field1775++;
        class495.field6845 = arg3;
        class751.field10402 = arg1;
        if (arg0 != 0) {
            method998(2, -49, 121, 106, -90);
        }
        class523.field7178 = arg4;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 23)
    public static final void method999(int arg0) {
        if (class71.method631(class458.field6355, (byte) -128) || class779.method4306(class458.field6355, 105)) {
            class483.method2807(class634.field8856 >> 12, 5000, class350.field5138 >> 12, 0);
        } else {
            int var1 = class551.field7456.field1890[0] >> 3;
            int var2 = class551.field7456.field1884[0] >> 3;
            if (var1 >= 0 && var1 < class597.field8132 >> 3 && var2 >= 0 && var2 < (class628.field8800 >> 3)) {
                class483.method2807(var1, 5000, var2, 0);
            } else {
                class483.method2807(class597.field8132 >> 4, 0, class628.field8800 >> 4, 0);
            }
        }
        field1780++;
        class402.method2507(2);
        class299.method1896(true);
        class772.method4276((byte) 125);
        if (arg0 != 1204339692) {
            field1785 = -72;
        }
        class88.method720(-117);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)I", line = 55)
    public static final int method1000(int arg0, int arg1) {
        field1776++;
        if (arg0 != 255) {
            field1781 = -46;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V", line = 68)
    public static void method1001(int arg0) {
        field1784 = null;
        if (arg0 <= 29) {
            method1000(-51, 30);
        }
        field1782 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I[BZI)I", line = 79)
    public static final int method1002(int arg0, byte[] arg1, boolean arg2, int arg3) {
        field1778++;
        int var4 = -1;
        if (arg2) {
            return 4;
        } else {
            for (int var5 = arg3; var5 < arg0; var5++) {
                var4 = var4 >>> 8 ^ class481.field6657[(var4 ^ arg1[var5]) & 0xFF];
            }
            return ~var4;
        }
    }
}
