import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class76 extends class154 {

    @OriginalMember(owner = "client!fg", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field1068 = new String[200];

    @OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
    public static volatile int field1071 = -1;

    @OriginalMember(owner = "client!fg", name = "B", descriptor = "Lim;")
    public static class178 field1074 = null;

    @OriginalMember(owner = "client!fg", name = "o", descriptor = "I")
    public int field1061;

    @OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
    public int field1062;

    @OriginalMember(owner = "client!fg", name = "q", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "client!fg", name = "r", descriptor = "I")
    public int field1064;

    @OriginalMember(owner = "client!fg", name = "s", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "client!fg", name = "t", descriptor = "I")
    public int field1066;

    @OriginalMember(owner = "client!fg", name = "w", descriptor = "I")
    public int field1069;

    @OriginalMember(owner = "client!fg", name = "x", descriptor = "I")
    public int field1070;

    @OriginalMember(owner = "client!fg", name = "z", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "client!fg", name = "A", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "I")
    public int field1076;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!fg", name = "G", descriptor = "I")
    public int field1078;

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "client!fg", name = "u", descriptor = "Lnh;")
    public static class305 field1067;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIILnh;)[Lbf;")
    public static final class108[] method497(int arg0, int arg1, int arg2, class305 arg3) {
        if (arg1 < 64) {
            method499((byte) 49, -119);
        }
        field1073++;
        return class131.method832(arg2, arg0, -128, arg3) ? class134.method844(55) : null;
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(I)V")
    public static void method498(int arg0) {
        field1068 = null;
        field1067 = null;
        field1074 = null;
        if (arg0 != -29603) {
            method498(107);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)Lda;")
    public static final class211 method499(byte arg0, int arg1) {
        field1075++;
        if (arg0 <= 9) {
            field1071 = -123;
        }
        class211 var2 = (class211) class167.field2392.method950((long) arg1, (byte) -45);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class186.field2830.method2050(77, class176.method1103((byte) 15, arg1), class247.method1615((byte) -126, arg1));
        class211 var4 = new class211();
        var4.field3177 = arg1;
        if (var3 != null) {
            var4.method1312((byte) -92, new class215(var3));
        }
        var4.method1318((byte) -115);
        class167.field2392.method942((long) arg1, (byte) 50, var4);
        return var4;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZJ)V")
    public static final void method500(boolean arg0, long arg1) {
        if (class12.field203 == 1 || class12.field203 == 5) {
            class103.method659(3, arg1);
        } else if (class12.field203 == 2) {
            class167.method1070((byte) 28);
        } else if (class12.field203 == 4) {
            class300.method2008(true, arg1);
        } else {
            class116.method743(88);
        }
        if (!class171.field2447) {
            class84.field1186[0] = class43.field645;
            class151.field2101[0] = 1008;
            if (class276.field4386 != 0) {
                class302.field4804 = class247.field3871;
                class179.field2717 = class242.field3799;
            } else if (class2.field15 == 0) {
                class179.field2717 = class249.field3891;
                class302.field4804 = class17.field304;
            } else {
                class179.field2717 = class25.field393;
                class302.field4804 = class59.field826;
            }
            class179.field2721 = 1;
            class205.field3062[0] = class229.field3595;
            class137.field1877[0] = "";
        }
        field1077++;
        class220.method1435((long) class35.field533);
        if (class104.field1499 != -1) {
            class198.method1250(class104.field1499, 108);
        }
        for (int var3 = 0; var3 < class261.field4206; var3++) {
            if (class274.field4355[var3]) {
                class30.field459[var3] = true;
            }
            class291.field4640[var3] = class274.field4355[var3];
            class274.field4355[var3] = false;
        }
        class10.field106 = null;
        class175.field2477 = null;
        class164.field2334 = -1;
        class100.field1442 = class35.field533;
        class255.field4034 = -1;
        if (class104.field1499 != -1) {
            class261.field4206 = 0;
            class27.method182(0);
        }
        class266.method1738();
        class308.method2094((byte) -39);
        if (class171.field2447) {
            if (class158.field2193) {
                class96.method616((byte) -77);
            } else {
                class103.method657(-14);
            }
        } else if (class175.field2477 != null) {
            class150.method945((byte) 49, class43.field646, class236.field3674, class175.field2477);
        } else if (class164.field2334 != -1) {
            class150.method945((byte) 49, class255.field4034, class164.field2334, (class178) null);
        }
        int var4 = class171.field2447 ? -1 : class158.method982(true);
        if (var4 == -1) {
            var4 = class75.field1054;
        }
        class85.method556(2, var4);
        if (class242.field3808 == 1) {
            class242.field3808 = 2;
        }
        if (class258.field4178 == 1) {
            class258.field4178 = 2;
        }
        if (class83.field1143 == 3) {
            for (int var5 = 0; var5 < class261.field4206; var5++) {
                if (class291.field4640[var5]) {
                    class266.method1748(class78.field1092[var5], class82.field1135[var5], class112.field1611[var5], class282.field4496[var5], 16711935, 128);
                } else if (class30.field459[var5]) {
                    class266.method1748(class78.field1092[var5], class82.field1135[var5], class112.field1611[var5], class282.field4496[var5], 16711680, 128);
                }
            }
        }
        class251.method1630(class250.field3905.field4081, arg0, class166.field2364, class208.field3094, class250.field3905.field4140);
        class208.field3094 = 0;
    }
}
