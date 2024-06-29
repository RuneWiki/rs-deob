import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class190 {

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field2957 = 0;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "[[B")
    public static byte[][] field2959;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IB)Z")
    public static final boolean method1322(int arg0, byte arg1) {
        field2958++;
        if (class123.field1763[arg0]) {
            return true;
        } else if (class217.field3394.method499((byte) 109, arg0)) {
            int var2 = class217.field3394.method481(2688, arg0);
            if (var2 == 0) {
                class123.field1763[arg0] = true;
                return true;
            }
            if (class68.field1018[arg0] == null) {
                class68.field1018[arg0] = new class231[var2];
            }
            if (arg1 != 97) {
                field2957 = -24;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class68.field1018[arg0][var3] == null) {
                    byte[] var4 = class217.field3394.method501(arg1 - 99, var3, arg0);
                    if (var4 != null) {
                        class231 var5 = class68.field1018[arg0][var3] = new class231();
                        var5.field3595 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method1631(new class170(var4), true);
                        } else {
                            var5.method1630(new class170(var4), (byte) 0);
                        }
                    }
                }
            }
            class123.field1763[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static void method1323(int arg0) {
        field2959 = null;
        if (arg0 != 3) {
            field2959 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILvl;)I")
    public static final int method1324(int arg0, class73 arg1) {
        field2960++;
        int var2 = 0;
        if (arg1.method509(27635, class263.field4277)) {
            var2++;
        }
        if (arg1.method509(27635, class45.field543)) {
            var2++;
        }
        if (arg1.method509(27635, class233.field3760)) {
            var2++;
        }
        if (arg1.method509(27635, class165.field2556)) {
            var2++;
        }
        if (arg1.method509(27635, class115.field1676)) {
            var2++;
        }
        if (arg1.method509(27635, class130.field1870)) {
            var2++;
        }
        if (arg1.method509(27635, class166.field2564)) {
            var2++;
        }
        if (arg1.method509(27635, class210.field3282)) {
            var2++;
        }
        if (arg1.method509(27635, class77.field1174)) {
            var2++;
        }
        if (arg1.method509(27635, class236.field3806)) {
            var2++;
        }
        if (arg1.method509(27635, class158.field2357)) {
            var2++;
        }
        if (arg0 <= 78) {
            method1326(76, -47);
        }
        if (arg1.method509(27635, class138.field1980)) {
            var2++;
        }
        if (arg1.method509(27635, class231.field3701)) {
            var2++;
        }
        if (arg1.method509(27635, class152.field2271)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1325(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class4.field67 = (long) arg2;
        field2956++;
        boolean var5 = false;
        int var6 = class49.method298((byte) 91);
        if (var6 <= 0 != arg0 <= 0) {
            var5 = true;
        }
        if (arg0 == 3 || var6 == 3) {
            arg4 = true;
        }
        if (class239.field3830.startsWith("mac") && arg0 > 0) {
            arg4 = true;
        }
        if (arg4 && arg0 > 0) {
            var5 = true;
        }
        class300.method2023(arg1, arg0, arg3, var6, arg4, (byte) 110, var5);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V")
    public static final void method1326(int arg0, int arg1) {
        class281.field4581.method1514(arg0, (byte) -55);
        field2961++;
        if (arg1 != 0) {
            field2957 = -71;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)V")
    public static final void method1327(int arg0) {
        field2954++;
        if (arg0 != 0) {
            method1326(99, 86);
        }
        class68.field1011.method1510(10283);
        class206.field3233.method1510(10283);
    }
}
