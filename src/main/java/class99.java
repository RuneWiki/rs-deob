import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class99 {

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "Lgf;")
    public static class7 field1824 = new class7(64);

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field1828 = 0;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "Lli;")
    public static class185 field1830 = class245.method1649("Chargement en cours)3)3)3", -116);

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public static void method647(byte arg0) {
        field1830 = null;
        if (arg0 > 97) {
            field1824 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public static final void method648(int arg0) {
        field1827++;
        class142.field2669.method573((byte) 79);
        int var1 = class142.field2669.method581(1, 7);
        int var2 = 104 % ((-arg0 - 33) / 51);
        if (var1 == 0) {
            return;
        }
        int var3 = class142.field2669.method581(2, 7);
        if (var3 == 0) {
            class80.field1404[class148.field2789++] = 2047;
        } else if (var3 == 1) {
            int var4 = class142.field2669.method581(3, 7);
            class241.field4310.method1021(var4, false, 1);
            int var5 = class142.field2669.method581(1, 7);
            if (var5 == 1) {
                class80.field1404[class148.field2789++] = 2047;
            }
        } else if (var3 == 2) {
            int var6 = class142.field2669.method581(3, 7);
            class241.field4310.method1021(var6, true, 1);
            int var7 = class142.field2669.method581(3, 7);
            class241.field4310.method1021(var7, true, 1);
            int var8 = class142.field2669.method581(1, 7);
            if (var8 == 1) {
                class80.field1404[class148.field2789++] = 2047;
            }
        } else if (var3 == 3) {
            class265.field4703 = class142.field2669.method581(2, 7);
            int var9 = class142.field2669.method581(1, 7);
            if (var9 == 1) {
                class80.field1404[class148.field2789++] = 2047;
            }
            int var10 = class142.field2669.method581(1, 7);
            int var11 = class142.field2669.method581(7, 7);
            int var12 = class142.field2669.method581(7, 7);
            class241.field4310.method1356(var12, (byte) -85, var11, var10 == 1);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)Z")
    public static final boolean method649(int arg0, byte arg1) {
        if (arg1 <= 51) {
            method647((byte) 9);
        }
        field1825++;
        return (arg0 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)I")
    public static final int method650(int arg0, int arg1, int arg2) {
        if (arg0 != -20228) {
            field1828 = 51;
        }
        field1829++;
        int var3 = arg1 >> 31 & arg2 - 1;
        return ((arg1 >>> 31) + arg1) % arg2 + var3;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZBI)Lli;")
    public static final class185 method651(boolean arg0, byte arg1, int arg2) {
        field1823++;
        int var3 = 44 / ((arg1 - 3) / 51);
        return class249.method1669(false, 10, arg2, arg0);
    }
}
