import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class182 extends class93 {

    @OriginalMember(owner = "client!tc", name = "ab", descriptor = "Ljd;")
    private static class92 field3464 = class202.method1325((byte) 90, "purple:");

    @OriginalMember(owner = "client!tc", name = "cb", descriptor = "[I")
    public static int[] field3466 = new int[100];

    @OriginalMember(owner = "client!tc", name = "bb", descriptor = "I")
    public static int field3465 = 0;

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "Ljd;")
    public static class92 field3458 = field3464;

    @OriginalMember(owner = "client!tc", name = "eb", descriptor = "Ljd;")
    private static class92 field3468 = class202.method1325((byte) 90, "Continue");

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "Z")
    public static boolean field3456 = true;

    @OriginalMember(owner = "client!tc", name = "Z", descriptor = "Ljd;")
    public static class92 field3463 = field3464;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "Ljd;")
    public static class92 field3459 = field3468;

    @OriginalMember(owner = "client!tc", name = "gb", descriptor = "Ljd;")
    public static class92 field3470 = class202.method1325((byte) 90, "Angreifen");

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "I")
    public static int field3461;

    @OriginalMember(owner = "client!tc", name = "db", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!tc", name = "hb", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "Lud;")
    public static class192 field3462;

    @OriginalMember(owner = "client!tc", name = "fb", descriptor = "Lei;")
    public static class50 field3469;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V")
    public static final void method1189(int arg0) {
        class185.field3497.method407(0);
        ++field3471;
        int var1 = class185.field3497.method408((byte) -32, 8);
        if (class96.field1928 > var1) {
            for (int var2 = var1; ~class96.field1928 < ~var2; ++var2) {
                class146.field2903[class91.field1808++] = class39.field893[var2];
            }
        }
        if (class96.field1928 < var1) {
            throw new RuntimeException("gnpov1");
        } else {
            class96.field1928 = 0;
            if (arg0 < -83) {
                for (int var3 = 0; var3 < var1; ++var3) {
                    int var4 = class39.field893[var3];
                    class129 var5 = class107.field2187[var4];
                    int var6 = class185.field3497.method408((byte) -32, 1);
                    if (~var6 == -1) {
                        class39.field893[class96.field1928++] = var4;
                        var5.field244 = class158.field3150;
                    } else {
                        int var7 = class185.field3497.method408((byte) -32, 2);
                        if (~var7 == -1) {
                            class39.field893[class96.field1928++] = var4;
                            var5.field244 = class158.field3150;
                            class135.field2710[class208.field4003++] = var4;
                        } else if (var7 == 1) {
                            class39.field893[class96.field1928++] = var4;
                            var5.field244 = class158.field3150;
                            int var8 = class185.field3497.method408((byte) -32, 3);
                            var5.method32(72, var8, false);
                            int var9 = class185.field3497.method408((byte) -32, 1);
                            if (var9 == 1) {
                                class135.field2710[class208.field4003++] = var4;
                            }
                        } else if (var7 == 2) {
                            class39.field893[class96.field1928++] = var4;
                            var5.field244 = class158.field3150;
                            int var10 = class185.field3497.method408((byte) -32, 3);
                            var5.method32(55, var10, true);
                            int var11 = class185.field3497.method408((byte) -32, 3);
                            var5.method32(112, var11, true);
                            int var12 = class185.field3497.method408((byte) -32, 1);
                            if (var12 == 1) {
                                class135.field2710[class208.field4003++] = var4;
                            }
                        } else if (~var7 == -4) {
                            class146.field2903[class91.field1808++] = var4;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class182() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "(I)V")
    public static final void method1190(int arg0) {
        class2.field161 = null;
        client.field675 = null;
        class49.field1072 = null;
        client.field691 = null;
        class53.field1108 = null;
        class131.field2628 = null;
        class139.field2789 = null;
        class70.field1485 = null;
        class146.field2907 = null;
        ++field3467;
        if (arg0 == 6599) {
            class189.field3598 = null;
            class102.field2104 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        int var3 = 27 / ((67 - arg1) / 42);
        ++field3457;
        int[] var4 = super.field1887.method916(arg0, -76);
        if (super.field1887.field2757) {
            int var5 = class166.field3271[arg0];
            for (int var6 = 0; class150.field2985 > var6; ++var6) {
                var4[var6] = this.method1192(var5, class75.field1574[var6], (byte) 91) % 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZI[B)Ljd;")
    public static final class92 method1191(int arg0, boolean arg1, int arg2, byte[] arg3) {
        ++field3461;
        class92 var4 = new class92();
        var4.field1838 = 0;
        var4.field1856 = new byte[arg0];
        for (int var5 = arg2; ~var5 > ~(arg0 + arg2); ++var5) {
            if (arg3[var5] != 0) {
                var4.field1856[var4.field1838++] = arg3[var5];
            }
        }
        if (arg1) {
            method1190(-30);
        }
        return var4;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIB)I")
    private final int method1192(int arg0, int arg1, byte arg2) {
        if (arg2 != 91) {
            field3459 = null;
        }
        ++field3460;
        int var4 = arg0 * 57 + arg1;
        int var5 = var4 ^ var4 << 1;
        return -(((var5 * 15731 * var5 - -789221) * var5 - -1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(Z)V")
    public static void method1193(boolean arg0) {
        field3470 = null;
        field3464 = null;
        field3458 = null;
        field3459 = null;
        field3468 = null;
        if (arg0) {
            field3456 = true;
        }
        field3463 = null;
        field3466 = null;
        field3462 = null;
        field3469 = null;
    }
}
