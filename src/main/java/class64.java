import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class64 {

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "Lna;")
    public static class26 field1008 = class69.method505("S-Blectionner", (byte) -123);

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "Lna;")
    public static class26 field1010 = class69.method505("niveau ", (byte) -128);

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "Lih;")
    public static class32 field1012 = new class32();

    @OriginalMember(owner = "client!ja", name = "j", descriptor = "I")
    public static int field1016 = 0;

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "[Lwa;")
    public static class82[] field1018 = new class82[2048];

    @OriginalMember(owner = "client!ja", name = "k", descriptor = "Lna;")
    public static class26 field1017 = class69.method505("Fps:", (byte) -124);

    @OriginalMember(owner = "client!ja", name = "n", descriptor = "I")
    public static int field1020 = 0;

    @OriginalMember(owner = "client!ja", name = "p", descriptor = "Lna;")
    public static class26 field1022 = class69.method505(" est d-Bj-9 dans votre liste d(Wamis)3", (byte) -120);

    @OriginalMember(owner = "client!ja", name = "o", descriptor = "Lna;")
    public static class26 field1021 = class69.method505("voudrait faire un -Bchange avec vous)3", (byte) -123);

    @OriginalMember(owner = "client!ja", name = "s", descriptor = "Lna;")
    public static class26 field1025 = class69.method505("http:)4)4", (byte) -121);

    @OriginalMember(owner = "client!ja", name = "r", descriptor = "I")
    public static int field1024 = -1;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!ja", name = "q", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([II)[I", line = 5)
    public static final int[] method480(int[] arg0, int arg1) {
        field1014++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != 2) {
            field1016 = 113;
        }
        int[] var2 = new int[arg0.length];
        class75.method537(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIII)I", line = 39)
    public static final int method481(int arg0, int arg1, int arg2, int arg3) {
        field1009++;
        int var4 = arg1 / arg0;
        int var5 = arg2 / arg0;
        int var6 = arg2 & arg0 - 1;
        int var7 = arg0 - 1 & arg1;
        int var8 = class66.method495(var4, var5, (byte) -82);
        int var9 = class66.method495(var4 + 1, var5, (byte) -104);
        int var10 = class66.method495(var4, var5 + 1, (byte) -100);
        if (arg3 == 512) {
            int var11 = class66.method495(var4 + 1, var5 + 1, (byte) -109);
            int var12 = class115.method797(var8, var9, var7, 96, arg0);
            int var13 = class115.method797(var10, var11, var7, 16, arg0);
            return class115.method797(var12, var13, var6, 87, arg0);
        } else {
            return -57;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIB)V", line = 69)
    public static final void method482(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1019++;
        if (class260.field4255 == 1) {
            class312.field5337[class203.field3178 / 100].method876(class267.field4414 - 8, class304.field5243 + -8);
        }
        if (arg4 != -121) {
            field1023 = -21;
        }
        if (class260.field4255 == 2) {
            class312.field5337[class203.field3178 / 100 + 4].method876(class267.field4414 - 8, class304.field5243 + -8);
        }
        class144.method957(true);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lve;Lve;I)V", line = 96)
    public static final void method483(class266 arg0, class266 arg1, int arg2) {
        class5.field70 = arg1;
        if (arg2 >= -94) {
            field1025 = (class26) null;
        }
        class246.field4032 = arg0;
        field1007++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)V", line = 117)
    public static final void method484(int arg0, int arg1) {
        class166.field2578 = arg1 / arg0;
        field1015++;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V", line = 142)
    public static void method485(int arg0) {
        field1025 = null;
        if (arg0 >= -83) {
            return;
        }
        field1021 = null;
        field1012 = null;
        field1022 = null;
        field1017 = null;
        field1008 = null;
        field1018 = null;
        field1010 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIZ)V", line = 160)
    public static final void method486(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1011++;
        if (arg0 < 1) {
            arg0 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        if (class255.field4184) {
            int var6 = arg3 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class320.field5506 - class25.field364) * var6 / 100 + class25.field364;
            if (class181.field2844 > var7) {
                var7 = class181.field2844;
            } else if (class163.field2535 < var7) {
                var7 = class163.field2535;
            }
            int var8 = arg3 * var7 * 512 / (arg0 * 334);
            if (var8 < class279.field4655) {
                short var12 = class279.field4655;
                var7 = arg0 * var12 * 334 / (arg3 * 512);
                if (class163.field2535 < var7) {
                    var7 = class163.field2535;
                    int var13 = arg3 * 512 * var7 / (var12 * 334);
                    int var14 = (arg0 - var13) / 2;
                    if (arg5) {
                        class326.method2269();
                        class326.method2278(arg4, arg2, var14, arg3, 0);
                        class326.method2278(arg4 + arg0 - var14, arg2, var14, arg3, 0);
                    }
                    arg4 += var14;
                    arg0 -= var14 * 2;
                }
            } else if (class76.field1159 < var8) {
                short var9 = class76.field1159;
                var7 = arg0 * var9 * 334 / (arg3 * 512);
                if (class181.field2844 > var7) {
                    var7 = class181.field2844;
                    int var10 = arg0 * 334 * var9 / (var7 * 512);
                    int var11 = (arg3 - var10) / 2;
                    if (arg5) {
                        class326.method2269();
                        class326.method2278(arg4, arg2, arg0, var11, 0);
                        class326.method2278(arg4, arg3 + arg2 - var11, arg0, var11, 0);
                    }
                    arg3 -= var11 * 2;
                    arg2 += var11;
                }
            }
            class259.field4229 = arg3 * var7 / 334;
        }
        class145.field2210 = (short) arg0;
        class71.field1093 = (short) arg3;
        if (arg1 < 11) {
            method480((int[]) null, 18);
        }
        class66.field1050 = arg2;
        class205.field3205 = arg4;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Z)V", line = 278)
    public static final void method487(boolean arg0) {
        field1013++;
        class136.field2083 = null;
        class276.field4615 = null;
        class312.field5337 = null;
        class268.field4428 = null;
        class107.field1688 = null;
        class13.field218 = null;
        class241.field3983 = null;
        class50.field787 = null;
        class324.field5566 = null;
        class89.field1474 = null;
        class117.field1831 = null;
        class295.field4917 = null;
        class283.field4723 = null;
        class7.field88 = null;
        class28.field472 = null;
        class261.field4260 = null;
        class10.field133 = null;
        class194.field3022 = null;
        class86.field1412 = null;
        if (arg0) {
            method480((int[]) null, -51);
        }
    }
}
