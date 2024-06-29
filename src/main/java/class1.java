import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 {

    @OriginalMember(owner = "client!us", name = "b", descriptor = "[I")
    public static int[] field2 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!us", name = "a", descriptor = "F")
    public static float field1;

    @OriginalMember(owner = "client!us", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!us", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V")
    public static void method1(byte arg0) {
        if (arg0 > -109) {
            method3(105, 74, (byte) 50);
        }
        field2 = null;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V")
    public static final void method2(int arg0) {
        field4++;
        if (arg0 <= 117) {
            field2 = null;
        }
        int var1 = class149.field1788;
        int[] var2 = class95.field1239;
        for (int var3 = 0; var3 < var1; var3++) {
            class365 var4 = class132.field1601[var2[var3]];
            if (var4 != null) {
                class15.method85(var4.method210(false), var4, (byte) 55);
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3(int arg0, int arg1, byte arg2) {
        if (arg2 >= -127) {
            return true;
        } else {
            field3++;
            return (arg1 & 0x10000) != 0;
        }
    }
}
