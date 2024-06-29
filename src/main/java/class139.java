import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class139 {

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "[I")
    public static int[] field1936 = new int[128];

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Lhk;")
    public static class127 field1933;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIB)I")
    public static final int method937(int arg0, int arg1, byte arg2) {
        if (arg2 > -127) {
            return -64;
        } else {
            field1938++;
            int var3 = arg1 >>> 31;
            return (arg1 + var3) / arg0 - var3;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)I")
    public static final int method938(int arg0) {
        field1937++;
        return arg0 == 0 ? class266.field4000 : 117;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILhc;II)[Lq;")
    public static final class128[] method939(int arg0, class235 arg1, int arg2, int arg3) {
        field1932++;
        if (arg0 != 0) {
            field1933 = null;
        }
        return class57.method351(arg1, arg3, arg2, (byte) -128) ? class124.method814(3) : null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILse;)Lse;")
    public static final class211 method940(int arg0, class211 arg1) {
        field1934++;
        if (arg1.field3127 != -1) {
            return class67.method421(arg1.field3127, 0);
        }
        int var2 = arg1.field3093 >>> 16;
        if (arg0 != 0) {
            method938(-115);
        }
        class12 var3 = new class12(class289.field4559);
        for (class56 var4 = (class56) var3.method72((byte) -104); var4 != null; var4 = (class56) var3.method75(-1)) {
            if (var4.field808 == var2) {
                return class67.method421((int) var4.field2369, 0);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
    public static void method941(int arg0) {
        field1936 = null;
        if (arg0 != 291646527) {
            field1936 = null;
        }
        field1933 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static final void method942(byte arg0) {
        field1935++;
        class137.field1917.method80((byte) -72);
        for (int var1 = 0; var1 < 32; var1++) {
            class39.field575[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class181.field2536[var2] = 0L;
        }
        int var3 = -83 % ((arg0 - 58) / 45);
        class1.field6 = 0;
    }
}
