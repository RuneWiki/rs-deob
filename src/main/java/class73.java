import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public abstract class class73 {

    @OriginalMember(owner = "client!v", name = "h", descriptor = "[I")
    public static int[] field1061 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Le;")
    public static class159 field1058 = new class159(5000);

    @OriginalMember(owner = "client!v", name = "l", descriptor = "Lwm;")
    public static class152 field1065 = class157.method1048(" )2> <col=ffff00>", 106);

    @OriginalMember(owner = "client!v", name = "m", descriptor = "[[S")
    public static short[][] field1066 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field1064 = 1;

    @OriginalMember(owner = "client!v", name = "i", descriptor = "Lwm;")
    private static class152 field1062 = class157.method1048("Loaded interfaces", 122);

    @OriginalMember(owner = "client!v", name = "o", descriptor = "Lwm;")
    public static class152 field1068 = field1062;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "Lwm;")
    private static class152 field1070 = class157.method1048("wave2:", 111);

    @OriginalMember(owner = "client!v", name = "p", descriptor = "Lwm;")
    public static class152 field1069 = field1070;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "Lwm;")
    public static class152 field1067 = field1070;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field1054;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field1055;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!v", name = "g", descriptor = "I")
    public static int field1060;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "Lah;")
    public static class205 field1063;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lv;IIIZ)V", line = 10)
    public void method494(class73 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1060++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)Lv;", line = 21)
    public class73 method495(int arg0, int arg1, int arg2) {
        field1057++;
        return this;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Loe;Lwm;I)Lwm;", line = 33)
    public static final class152 method496(class127 arg0, class152 arg1, int arg2) {
        if (arg1.method988(class272.field4680, 0) != -1) {
            label67: while (true) {
                int var3 = arg1.method988(class237.field3887, 0);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method988(class244.field4050, 0);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method988(class107.field1533, 0);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.method988(class186.field2969, 0);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method988(class273.field4690, 0);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.method988(class194.field3090, 0);
                                                        if (var8 == -1) {
                                                            break label67;
                                                        }
                                                        class152 var9 = class201.field3252;
                                                        if (class20.field265 != null) {
                                                            var9 = class49.method342(class20.field265.field2979, (byte) 126);
                                                            try {
                                                                if (class20.field265.field2977 != null) {
                                                                    byte[] var10 = ((String) class20.field265.field2977).getBytes("ISO-8859-1");
                                                                    var9 = class117.method775(var10, var10.length, (byte) 119, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var12) {
                                                            }
                                                        }
                                                        arg1 = class195.method1307(new class152[] { arg1.method1015(0, 19197, var8), var9, arg1.method983((byte) 88, var8 + 4) }, (byte) 29);
                                                    }
                                                }
                                                arg1 = class195.method1307(new class152[] { arg1.method1015(0, 19197, var7), class59.method391(class287.method1930(-106, 4, arg0), 999999999), arg1.method983((byte) 88, var7 + 2) }, (byte) 29);
                                            }
                                        }
                                        arg1 = class195.method1307(new class152[] { arg1.method1015(0, 19197, var6), class59.method391(class287.method1930(97, 3, arg0), 999999999), arg1.method983((byte) 88, var6 + 2) }, (byte) 29);
                                    }
                                }
                                arg1 = class195.method1307(new class152[] { arg1.method1015(0, 19197, var5), class59.method391(class287.method1930(76, 2, arg0), 999999999), arg1.method983((byte) 88, var5 + 2) }, (byte) 29);
                            }
                        }
                        arg1 = class195.method1307(new class152[] { arg1.method1015(0, 19197, var4), class59.method391(class287.method1930(24, 1, arg0), 999999999), arg1.method983((byte) 88, var4 + 2) }, (byte) 29);
                    }
                }
                arg1 = class195.method1307(new class152[] { arg1.method1015(0, 19197, var3), class59.method391(class287.method1930(-126, 0, arg0), 999999999), arg1.method983((byte) 88, var3 + 2) }, (byte) 29);
            }
        }
        if (arg2 > -106) {
            return (class152) null;
        } else {
            field1055++;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "()Z", line = 132)
    public boolean method497() {
        field1056++;
        return false;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILah;)V", line = 143)
    public static final void method498(int arg0, class205 arg1) {
        class79.field1108 = arg1.method1374(class185.field2945, (byte) -52);
        if (arg0 >= -19) {
            method496((class127) null, (class152) null, -17);
        }
        field1059++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V", line = 157)
    public static final void method499(byte arg0) {
        if (arg0 <= 46) {
            field1066 = (short[][]) ((short[][]) null);
        }
        class202.field3269++;
        field1054++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V", line = 168)
    public static void method500(int arg0) {
        field1061 = null;
        field1065 = null;
        field1063 = null;
        field1066 = (short[][]) null;
        field1058 = null;
        field1069 = null;
        field1068 = null;
        field1070 = null;
        field1067 = null;
        field1062 = null;
        int var1 = -26 % ((-arg0 - 35) / 58);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIIIIIIJILmf;)V")
    public abstract void method21(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class47 arg10);

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIII)V")
    public abstract void method20(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()I")
    public abstract int method22();
}
