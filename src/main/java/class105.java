import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class105 extends class248 {

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
    private int field1538 = -32768;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
    public static int field1536 = 0;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public static int field1530 = 0;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "[I")
    public static int[] field1532 = new int[1000];

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field1523;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public int field1527;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public int field1528;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "Lvl;")
    public static class73 field1533;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)I")
    public static final int method699(int arg0, int arg1) {
        if (arg1 != 0) {
            method704(8);
        }
        field1526++;
        return arg0 == 16711935 ? -1 : class228.method1607(-108, arg0);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "()I")
    public final int method4() {
        field1525++;
        return this.field1538;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIZ)I")
    public static final int method700(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            return -37;
        }
        int var4 = arg2 & 0x3;
        field1531++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
    public static final void method701(int arg0) {
        field1534++;
        for (int var1 = -1; var1 < class272.field4432; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class52.field745[var1];
            }
            class1 var6 = class35.field409[var5];
            if (var6 != null && var6.field3982 > 0) {
                var6.field3982--;
                if (var6.field3982 == 0) {
                    var6.field3954 = null;
                }
            }
        }
        for (int var2 = arg0; var2 < class80.field1211; var2++) {
            int var3 = class187.field2939[var2];
            class86 var4 = class191.field3045[var3];
            if (var4 != null && var4.field3982 > 0) {
                var4.field3982--;
                if (var4.field3982 == 0) {
                    var4.field3954 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)V")
    public static final void method702(byte arg0) {
        for (int var1 = -1; var1 < class272.field4432; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class52.field745[var1];
            }
            class1 var3 = class35.field409[var2];
            if (var3 != null) {
                class108.method720(var3, var3.method8((byte) -120), (byte) -49);
            }
        }
        field1537++;
        if (arg0 >= -51) {
            field1533 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIII)V")
    public final void method3(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1524++;
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V")
    public static final void method703(int arg0) {
        field1529++;
        class56 var1 = class205.field3214;
        synchronized (class205.field3214) {
            class293.field4699 = class92.field1382;
            class8.field110++;
            if (arg0 >= -123) {
                field1532 = null;
            }
            if (class235.field3802 >= 0) {
                while (class39.field475 != class235.field3802) {
                    int var2 = class16.field226[class39.field475];
                    class39.field475 = class39.field475 + 1 & 0x7F;
                    if (var2 < 0) {
                        class309.field4977[~var2] = false;
                    } else {
                        class309.field4977[var2] = true;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class309.field4977[var3] = false;
                }
                class235.field3802 = class39.field475;
            }
            class92.field1382 = class313.field5015;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIIIIJILom;)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class65 arg10) {
        field1523++;
        class208 var13 = class104.method696((byte) -26, this.field1527).method1117((class57) null, (class172) null, 0, 128, 0, -1, this.field1528);
        if (var13 != null) {
            var13.method10(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10);
            this.field1538 = var13.method4();
        }
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)V")
    public static void method704(int arg0) {
        field1533 = null;
        if (arg0 != -32768) {
            method701(16);
        }
        field1532 = null;
    }
}
