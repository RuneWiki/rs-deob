import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class717 {

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Z")
    public static boolean field9768 = false;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "[[I")
    public static int[][] field9769 = new int[6][];

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Z")
    public static boolean field9767 = true;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "[[I")
    public static int[][] field9770 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field9764;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field9765;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field9771;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field9772;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Z")
    public static boolean field9766;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILaf;)V", line = 6)
    public static final void method3964(int arg0, class459 arg1) {
        field9764++;
        int var2 = 0;
        arg1.method2722(arg0 ^ 0x1FEA);
        for (int var3 = 0; var3 < class652.field8795; var3++) {
            int var15 = class497.field6986[var3];
            if ((class134.field1826[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class134.field1826[var15] = (byte) class670.method3699(class134.field1826[var15], 2);
                } else {
                    int var16 = arg1.method2721(1, 1);
                    if (var16 == 0) {
                        var2 = class33.method181(arg1, (byte) -101);
                        class134.field1826[var15] = (byte) class670.method3699(class134.field1826[var15], 2);
                    } else {
                        class516.method3011(0, arg1, var15);
                    }
                }
            }
        }
        arg1.method2717((byte) -41);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg1.method2722(-33);
        for (int var4 = 0; var4 < class652.field8795; var4++) {
            int var13 = class497.field6986[var4];
            if ((class134.field1826[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class134.field1826[var13] = (byte) class670.method3699(class134.field1826[var13], 2);
                } else {
                    int var14 = arg1.method2721(1, 1);
                    if (var14 == 0) {
                        var2 = class33.method181(arg1, (byte) -115);
                        class134.field1826[var13] = (byte) class670.method3699(class134.field1826[var13], 2);
                    } else {
                        class516.method3011(0, arg1, var13);
                    }
                }
            }
        }
        arg1.method2717((byte) -122);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg1.method2722(arg0 ^ 0x1FD3);
        if (arg0 != 8070) {
            return;
        }
        for (int var5 = 0; var5 < class377.field5510; var5++) {
            int var11 = class537.field7440[var5];
            if ((class134.field1826[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class134.field1826[var11] = (byte) class670.method3699(class134.field1826[var11], 2);
                } else {
                    int var12 = arg1.method2721(1, 1);
                    if (var12 == 0) {
                        var2 = class33.method181(arg1, (byte) -112);
                        class134.field1826[var11] = (byte) class670.method3699(class134.field1826[var11], 2);
                    } else if (class265.method1780(arg1, var11, 74)) {
                        class134.field1826[var11] = (byte) class670.method3699(class134.field1826[var11], 2);
                    }
                }
            }
        }
        arg1.method2717((byte) 126);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg1.method2722(87);
        for (int var6 = 0; var6 < class377.field5510; var6++) {
            int var9 = class537.field7440[var6];
            if ((class134.field1826[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class134.field1826[var9] = (byte) class670.method3699(class134.field1826[var9], 2);
                } else {
                    int var10 = arg1.method2721(1, 1);
                    if (var10 == 0) {
                        var2 = class33.method181(arg1, (byte) -125);
                        class134.field1826[var9] = (byte) class670.method3699(class134.field1826[var9], 2);
                    } else if (class265.method1780(arg1, var9, 40)) {
                        class134.field1826[var9] = (byte) class670.method3699(class134.field1826[var9], 2);
                    }
                }
            }
        }
        arg1.method2717((byte) 125);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class377.field5510 = 0;
        class652.field8795 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class134.field1826[var7] = (byte) (class134.field1826[var7] >> 1);
            class758 var8 = class84.field1204[var7];
            if (var8 == null) {
                class537.field7440[class377.field5510++] = var7;
            } else {
                class497.field6986[class652.field8795++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 211)
    public static final String method3965(int arg0, String arg1) {
        field9772++;
        if (class519.field7225.startsWith("win")) {
            return arg1 + ".dll";
        } else if (class519.field7225.startsWith("linux")) {
            return "lib" + arg1 + ".so";
        } else if (class519.field7225.startsWith("mac")) {
            return "lib" + arg1 + ".dylib";
        } else {
            if (arg0 != 24531) {
                method3968(28, -44);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)[Lgi;", line = 233)
    public static final class705[] method3966(byte arg0) {
        if (arg0 != 27) {
            method3966((byte) -44);
        }
        field9771++;
        return new class705[] { class28.field280, class719.field9784, class318.field4528 };
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 250)
    public static void method3967(int arg0) {
        field9770 = null;
        int var1 = 25 / ((-arg0 - 47) / 44);
        field9769 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V", line = 268)
    public static final void method3968(int arg0, int arg1) {
        int var2 = -31 % ((arg1 - 44) / 41);
        field9765++;
        class778 var3 = class389.method2406(88, (long) arg0, 4);
        var3.method4276(0);
    }
}
