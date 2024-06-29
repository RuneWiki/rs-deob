import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class1 extends class390 {

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "Lkn;")
    public static class442 field4 = new class442("Loaded wordpack", "Wordpack geladen.", "Module texte chargé", "Pacote de palavras carregado");

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "Lms;")
    public static class453 field9 = null;

    @OriginalMember(owner = "client!ro", name = "v", descriptor = "[I")
    public static int[] field13 = new int[14];

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!ro", name = "s", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!ro", name = "t", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!ro", name = "u", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!ro", name = "x", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ro", name = "B", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
    public int field3;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
    public int field5;

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!ro", name = "w", descriptor = "Lk;")
    public static class337 field14;

    @OriginalMember(owner = "client!ro", name = "z", descriptor = "[I")
    public int[] field17;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "[I")
    public int[] field2;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "[I")
    public int[] field6;

    @OriginalMember(owner = "client!ro", name = "y", descriptor = "[Laa;")
    public class283[] field16;

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "[Laa;")
    public class283[] field8;

    @OriginalMember(owner = "client!ro", name = "A", descriptor = "[[[B")
    public byte[][][] field18;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZII)V")
    public static final void method1(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field15++;
            class239 var3 = class436.method2740(6, arg1, -323285792);
            var3.method1622(-127);
            var3.field3399 = arg2;
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(III)B")
    public static final byte method2(int arg0, int arg1, int arg2) {
        if (arg1 > -122) {
            return -47;
        }
        field10++;
        if (arg2 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IZ)V")
    public static final void method3(int arg0, boolean arg1) {
        field7++;
        class239 var2 = class436.method2740(16, arg0, -323285792);
        if (arg1) {
            field9 = null;
        }
        var2.method1628(14478);
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "([IIB)[I")
    public static final int[] method4(int[] arg0, int arg1, byte arg2) {
        field12++;
        if (arg2 <= 29) {
            return null;
        }
        int[] var3 = new int[1152];
        int var4 = 0;
        for (int var5 = 0; var5 < 32; var5++) {
            for (int var6 = 0; var6 < 36; var6++) {
                int var7 = arg0[var4];
                if (var7 == 0) {
                    if (var6 > 0 && arg0[var4 - 1] != 0) {
                        var7 = arg1;
                    } else if (var5 > 0 && arg0[var4 - 36] != 0) {
                        var7 = arg1;
                    } else if (var6 < 35 && arg0[var4 + 1] != 0) {
                        var7 = arg1;
                    } else if (var5 < 31 && arg0[var4 + 36] != 0) {
                        var7 = arg1;
                    }
                }
                var3[var4++] = var7;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(ILms;II)V")
    public static final void method5(int arg0, class453 arg1, int arg2, int arg3) {
        if (arg1.field6358 == 0) {
            arg1.field6363 = arg1.field6393;
        } else if (arg1.field6358 == 1) {
            arg1.field6363 = (arg2 - arg1.field6342) / 2 + arg1.field6393;
        } else if (arg1.field6358 == 2) {
            arg1.field6363 = arg2 - arg1.field6342 - arg1.field6393;
        } else if (arg1.field6358 == 3) {
            arg1.field6363 = arg1.field6393 * arg2 >> 14;
        } else if (arg1.field6358 == 4) {
            arg1.field6363 = (arg1.field6393 * arg2 >> 14) + (arg2 - arg1.field6342) / 2;
        } else {
            arg1.field6363 = arg2 - arg1.field6342 - (arg1.field6393 * arg2 >> 14);
        }
        if (arg1.field6413 == 0) {
            arg1.field6418 = arg1.field6457;
        } else if (arg1.field6413 == 1) {
            arg1.field6418 = (arg0 - arg1.field6447) / 2 + arg1.field6457;
        } else if (arg1.field6413 == 2) {
            arg1.field6418 = arg0 - arg1.field6447 - arg1.field6457;
        } else if (arg1.field6413 == 3) {
            arg1.field6418 = arg1.field6457 * arg0 >> 14;
        } else if (arg1.field6413 == 4) {
            arg1.field6418 = (arg1.field6457 * arg0 >> 14) + (arg0 - arg1.field6447) / 2;
        } else {
            arg1.field6418 = arg0 - (arg1.field6457 * arg0 >> 14) - arg1.field6447;
        }
        field11++;
        if (arg3 != -25599) {
            field9 = null;
        }
        if (!class293.field4106 || client.method1091(arg1).field1985 == 0 && arg1.field6356 != 0) {
            return;
        }
        if (arg1.field6418 < 0) {
            arg1.field6418 = 0;
        } else if ((arg1.field6447 + arg1.field6418) > arg0) {
            arg1.field6418 = arg0 - arg1.field6447;
        }
        if (arg1.field6363 < 0) {
            arg1.field6363 = 0;
        } else if ((arg1.field6363 + arg1.field6342) > arg2) {
            arg1.field6363 = arg2 - arg1.field6342;
            return;
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V")
    public static void method6(int arg0) {
        int var1 = 105 % ((-arg0 - 12) / 37);
        field13 = null;
        field4 = null;
        field9 = null;
        field14 = null;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lwk;BI)V")
    public static final void method7(class76 arg0, byte arg1, int arg2) {
        field1++;
        if (class231.field3345) {
            arg2 = 0;
            class231.field3345 = false;
        }
        if (class286.field4036 == null || !class286.field4036.method563(arg0, 123)) {
            class286.field4036 = arg0;
            class222.field3102 = class385.method2442(-6631);
            class11.field241 = arg2;
            class39.field568 = arg2;
            if (class39.field568 == 0) {
                class206.method1342(false);
            } else {
                class426.field6001 = class99.field1370;
                class196.field2698 = class170.field2325;
                class395.field5661 = class214.field2992;
                class411.field5831 = class279.field3917;
                class254.field3584 = class30.field493;
                class128.field1799 = class75.field1075;
                class255.field3585 = class382.field5450;
                class304.field4196 = class7.field112;
                class312.field4267 = class163.field2264;
                class204.field2793 = class380.field5430;
            }
        }
        if (arg1 > -92) {
            field19 = 103;
        }
    }
}
