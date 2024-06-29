import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class293 extends RuntimeException {

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "Ljava/lang/String;")
    public String field4589;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Ljava/lang/Throwable;")
    public Throwable field4594;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "Llc;")
    public static class175 field4596;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Llc;B)V", line = 7)
    public static final void method2081(class175 arg0, byte arg1) {
        class110.field1560 = arg0;
        if (arg1 > -81) {
            method2085(-56, false);
        }
        field4595++;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;", line = 24)
    public static final String[] method2082(String[] arg0, byte arg1) {
        if (arg1 < 22) {
            return (String[]) null;
        }
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        field4597++;
        return var2;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)Lmf;", line = 52)
    public static final class53 method2083(int arg0, int arg1) {
        class53 var2 = (class53) class74.field951.method1239((byte) -7, (long) arg0);
        field4590++;
        if (var2 != null) {
            return var2;
        }
        if (arg1 >= -29) {
            method2086((class11) null, 18, false);
        }
        byte[] var3 = class316.field4873.method1199(28815, arg0, 34);
        class53 var4 = new class53();
        if (var3 != null) {
            var4.method325(arg0, new class107(var3), (byte) -97);
        }
        class74.field951.method1243(var4, (long) arg0, -29282);
        return var4;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V", line = 76)
    public static void method2084(byte arg0) {
        field4596 = null;
        int var1 = 123 / ((-arg0 - 13) / 47);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZ)V", line = 85)
    public static final void method2085(int arg0, boolean arg1) {
        class239.method1713(31532);
        field4592++;
        if (class17.field236 != 30 && class17.field236 != 25) {
            return;
        }
        class242.field3644++;
        if (class242.field3644 < 50 && !arg1) {
            return;
        }
        class242.field3644 = 0;
        int var2 = 61 % ((87 - arg0) / 33);
        if (!class113.field1612 && class236.field3463 != null) {
            class311.field4800++;
            class140.field1954.method573(116, 6);
            try {
                class236.field3463.method1097(class140.field1954.field1388, 0, true, class140.field1954.field1400);
                class140.field1954.field1400 = 0;
            } catch (IOException var4) {
                class113.field1612 = true;
            }
        }
        class239.method1713(31532);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lwh;IZ)V", line = 117)
    public static final void method2086(class11 arg0, int arg1, boolean arg2) {
        if (arg1 > -73) {
            method2086((class11) null, -92, true);
        }
        if (class250.field3787 || arg2) {
            int var3 = class314.field4847;
            int var4 = var3 * 956 / 503;
            class285.field4491.method539((class188.field2712 - var4) / 2, 0, var4, var3);
            class61.field752.method1657(class188.field2712 / 2 - (class61.field752.field4743 / 2), 18);
        }
        arg0.method64(class315.field4858, class188.field2712 / 2, class314.field4847 / 2 - 26, 16777215, -1);
        field4591++;
        int var5 = class314.field4847 / 2 - 18;
        if (class250.field3787) {
            class306.method2156(class188.field2712 / 2 - 152, var5, 304, 34, 9179409);
            class306.method2156(class188.field2712 / 2 - 151, var5 + 1, 302, 32, 0);
            class306.method2154(class188.field2712 / 2 - 150, var5 - -2, class204.field2859 * 3, 30, 9179409);
            class306.method2154(class188.field2712 / 2 + (class204.field2859 * 3) - 150, var5 + 2, 300 - (class204.field2859 * 3), 30, 0);
        } else {
            class144.method964(class188.field2712 / 2 - 152, var5, 304, 34, 9179409);
            class144.method964(class188.field2712 / 2 - 151, var5 + 1, 302, 32, 0);
            class144.method977(class188.field2712 / 2 - 150, var5 + 2, class204.field2859 * 3, 30, 9179409);
            class144.method977(class188.field2712 / 2 + (class204.field2859 * 3) - 150, var5 + 2, 300 - (class204.field2859 * 3), 30, 0);
        }
        arg0.method64(class315.field4853, class188.field2712 / 2, class314.field4847 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IB)Lge;", line = 158)
    public static final class163 method2087(int arg0, byte arg1) {
        if (arg1 > -35) {
            return (class163) null;
        } else {
            field4593++;
            return class192.field2764 && arg0 >= class254.field3858 && arg0 <= class85.field1089 ? class175.field2507[arg0 - class254.field3858] : null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 170)
    public class293(Throwable arg0, String arg1) {
        this.field4589 = arg1;
        this.field4594 = arg0;
    }
}
