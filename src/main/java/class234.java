import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class234 {

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Lr;")
    public static class66 field4086 = class93.method641(43, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lr;")
    public static class66 field4091 = class93.method641(43, "<col=00ff00>");

    @OriginalMember(owner = "client!he", name = "o", descriptor = "Lr;")
    private static class66 field4097 = class93.method641(43, "RuneScape is loading )2 please wait)3)3)3");

    @OriginalMember(owner = "client!he", name = "h", descriptor = "Lr;")
    public static class66 field4090 = field4097;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "[I")
    public static int[] field4098 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static volatile int field4092 = 0;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "S")
    public static short field4093 = 320;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public int field4083;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field4084;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field4085;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public int field4094;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    public int field4096;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "[[[B")
    public static byte[][][] field4087;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1527(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var6 = arg3 - arg0;
        if (arg4 >= -119) {
            field4091 = null;
        }
        int var7 = arg5 - arg2;
        field4095++;
        if (var6 == 0) {
            if (var7 != 0) {
                class151.method1028(arg1, arg5, arg0, (byte) -7, arg2);
            }
        } else if (var7 == 0) {
            class178.method1193(arg2, arg1, arg0, true, arg3);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg2 - (arg0 * var8 >> 12);
            int var10;
            int var11;
            if (arg0 < class165.field2972) {
                var10 = (class165.field2972 * var8 >> 12) + var9;
                var11 = class165.field2972;
            } else if (arg0 <= class215.field3706) {
                var10 = arg2;
                var11 = arg0;
            } else {
                var11 = class215.field3706;
                var10 = var9 + (class215.field3706 * var8 >> 12);
            }
            if (var10 < class241.field4186) {
                var10 = class241.field4186;
                var11 = (class241.field4186 - var9 << 12) / var8;
            } else if (class222.field3788 < var10) {
                var10 = class222.field3788;
                var11 = (class222.field3788 - var9 << 12) / var8;
            }
            int var12;
            int var13;
            if (class165.field2972 > arg3) {
                var13 = (class165.field2972 * var8 >> 12) + var9;
                var12 = class165.field2972;
            } else if (arg3 <= class215.field3706) {
                var12 = arg3;
                var13 = arg5;
            } else {
                var13 = (class215.field3706 * var8 >> 12) + var9;
                var12 = class215.field3706;
            }
            if (var13 < class241.field4186) {
                var13 = class241.field4186;
                var12 = (class241.field4186 - var9 << 12) / var8;
            } else if (var13 > class222.field3788) {
                var13 = class222.field3788;
                var12 = (class222.field3788 - var9 << 12) / var8;
            }
            class103.method711(var11, var13, (byte) 91, var12, arg1, var10);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)Llf;")
    public static final class99 method1528(int arg0, byte arg1) {
        field4085++;
        if (arg0 == 0) {
            return new class122();
        } else if (arg0 == 1) {
            return new class8();
        } else if (arg0 == 2) {
            return new class195();
        } else if (arg0 == 3) {
            return new class84();
        } else if (arg0 == 4) {
            return new class59();
        } else if (arg0 == 5) {
            return new class24();
        } else if (arg0 == 6) {
            return new class12();
        } else if (arg0 == 7) {
            return new class208();
        } else if (arg0 == 8) {
            return new class164();
        } else if (arg0 == 9) {
            return new class199();
        } else if (arg0 == 10) {
            return new class31();
        } else if (arg0 == 11) {
            return new class161();
        } else if (arg0 == 12) {
            return new class261();
        } else if (arg0 == 13) {
            return new class205();
        } else if (arg0 == 14) {
            return new class233();
        } else if (arg0 == 15) {
            return new class21();
        } else if (arg0 == 16) {
            return new class144();
        } else if (arg0 == 17) {
            return new class182();
        } else if (arg0 == 18) {
            return new class135();
        } else if (arg0 == 19) {
            return new class120();
        } else if (arg0 == 20) {
            return new class223();
        } else if (arg0 == 21) {
            return new class163();
        } else if (arg0 == 22) {
            return new class166();
        } else if (arg0 == 23) {
            return new class70();
        } else if (arg0 == 24) {
            return new class105();
        } else if (arg0 == 25) {
            return new class136();
        } else if (arg0 == 26) {
            return new class150();
        } else if (arg0 == 27) {
            return new class180();
        } else if (arg0 == 28) {
            return new class69();
        } else if (arg0 == 29) {
            return new class220();
        } else if (arg0 == 30) {
            return new class10();
        } else if (arg0 == 31) {
            return new class34();
        } else if (arg0 == 32) {
            return new class187();
        } else if (arg0 == 33) {
            return new class68();
        } else if (arg0 == 34) {
            return new class188();
        } else if (arg0 == 35) {
            return new class176();
        } else if (arg0 == 36) {
            return new class130();
        } else if (arg0 == 37) {
            return new class96();
        } else if (arg0 == 38) {
            return new class2();
        } else if (arg0 == 39) {
            return new class124();
        } else {
            if (arg1 != -46) {
                field4086 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method1529(int arg0) {
        field4091 = null;
        int var1 = -67 % ((arg0 - 49) / 63);
        field4086 = null;
        field4090 = null;
        field4087 = null;
        field4098 = null;
        field4097 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILlh;)V")
    public final void method1530(int arg0, class249 arg1) {
        field4084++;
        while (true) {
            int var3 = arg1.method1677(-6677);
            if (var3 == 0) {
                if (arg0 < 119) {
                    field4092 = -69;
                    return;
                } else {
                    return;
                }
            }
            this.method1531(arg1, -39, var3);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Llh;II)V")
    private final void method1531(class249 arg0, int arg1, int arg2) {
        if (arg1 != -39) {
            return;
        }
        if (arg2 == 1) {
            this.field4083 = arg0.method1674(1355769544);
            this.field4096 = arg0.method1677(-6677);
            this.field4094 = arg0.method1677(-6677);
        }
        field4089++;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)V")
    public static final void method1532(byte arg0) {
        class132.field2460.method1614(125);
        field4099++;
        if (arg0 > -114) {
            method1533((class66) null, 12, (class66) null, -124);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lr;ILr;I)V")
    public static final void method1533(class66 arg0, int arg1, class66 arg2, int arg3) {
        class171.method1165((class66) null, -19596, arg0, -1, arg3, arg2);
        int var4 = -56 / ((75 - arg1) / 50);
        field4088++;
    }
}
