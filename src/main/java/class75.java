import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class75 extends class217 {

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "I")
    private final int field1305;

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "I")
    private final int field1311;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "I")
    private final int field1303;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    private final int field1308;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "Lt;")
    public static class239 field1302 = new class239(16);

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "I")
    public static int field1309 = 0;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "[I")
    public static int[] field1315 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "Lbe;")
    private static class283 field1314 = class153.method941(-65, "Loaded update list");

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "Lbe;")
    public static class283 field1312 = field1314;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "I")
    public static int field1310;

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!wa", name = "I", descriptor = "I")
    public static int field1316;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLob;Lek;Lek;)V", line = 4)
    public static final void method495(byte arg0, class276 arg1, class172 arg2, class172 arg3) {
        field1301++;
        class64.field882 = arg2;
        class83.field1410 = arg3;
        if (arg0 != 58) {
            method495((byte) -106, (class276) null, (class172) null, (class172) null);
        }
        class33.field487 = arg1;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 26)
    public static void method496(int arg0) {
        field1314 = null;
        if (arg0 != 0) {
            field1309 = 24;
        }
        field1315 = null;
        field1312 = null;
        field1302 = null;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(III)V", line = 43)
    public final void method67(int arg0, int arg1, int arg2) {
        if (arg2 != 17113) {
            this.method68(-126, -38, 102);
        }
        field1304++;
        int var4 = this.field1303 * arg0 >> 12;
        int var5 = this.field1308 * arg0 >> 12;
        int var6 = this.field1311 * arg1 >> 12;
        int var7 = this.field1305 * arg1 >> 12;
        class55.method361(var7, this.field3672, var6, var5, var4, 1, this.field3671);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZII)V", line = 64)
    public final void method66(boolean arg0, int arg1, int arg2) {
        field1313++;
        if (arg0) {
            this.method67(88, 30, 68);
        }
        int var4 = this.field1303 * arg2 >> 12;
        int var5 = this.field1311 * arg1 >> 12;
        int var6 = this.field1305 * arg1 >> 12;
        int var7 = this.field1308 * arg2 >> 12;
        class297.method2016(var6, var5, var4, var7, 123, this.field3679);
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(IIIIIII)V", line = 87)
    public class75(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field1305 = arg3;
        this.field1311 = arg1;
        this.field1303 = arg0;
        this.field1308 = arg2;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)V", line = 111)
    public final void method68(int arg0, int arg1, int arg2) {
        int var4 = this.field1303 * arg0 >> 12;
        field1307++;
        int var5 = this.field1308 * arg0 >> 12;
        int var6 = this.field1311 * arg2 >> 12;
        if (arg1 > -28) {
            this.method67(90, -30, -95);
        }
        int var7 = this.field1305 * arg2 >> 12;
        class99.method656(var7, this.field3671, this.field3672, var5, var4, this.field3679, var6, -18602);
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V", line = 132)
    public static final void method497(int arg0) {
        class272.method1834(class20.field274, 0);
        class48.field667++;
        field1310++;
        if (class38.field548 && class137.field2277) {
            int var1 = class163.field2700;
            int var2 = var1 - class262.field4470;
            int var3 = class20.field274.field1118;
            int var4 = class109.field1849;
            int var5 = var4 - class256.field4324;
            if (class301.field5095 > var2) {
                var2 = class301.field5095;
            }
            if (arg0 != 6353) {
                field1312 = (class283) null;
            }
            if ((class301.field5095 + class110.field1864.field1085) < (class20.field274.field1085 + var2)) {
                var2 = class301.field5095 + class110.field1864.field1085 - class20.field274.field1085;
            }
            if (class110.field1866 > var5) {
                var5 = class110.field1866;
            }
            if ((class110.field1866 + class110.field1864.field1069) < (class20.field274.field1069 + var5)) {
                var5 = class110.field1866 + class110.field1864.field1069 - class20.field274.field1069;
            }
            int var6 = var5 - class219.field3703;
            int var7 = var5 + class110.field1864.field1011 - class110.field1866;
            int var8 = var2 - class13.field131;
            int var9 = var2 + class110.field1864.field1098 - class301.field5095;
            if (class20.field274.field1001 < class48.field667 && (var3 < var6 || (-var3) > var6 || var8 > var3 || (-var3) > var8)) {
                class227.field3816 = true;
            }
            if (class20.field274.field1042 != null && class227.field3816) {
                class231 var10 = new class231();
                var10.field3927 = var7;
                var10.field3912 = class20.field274;
                var10.field3919 = class20.field274.field1042;
                var10.field3921 = var9;
                class194.method1253(var10, 21258);
            }
            if (class177.field3051 == 0) {
                if (class227.field3816) {
                    if (class20.field274.field1071 != null) {
                        class231 var11 = new class231();
                        var11.field3919 = class20.field274.field1071;
                        var11.field3912 = class20.field274;
                        var11.field3927 = var7;
                        var11.field3921 = var9;
                        var11.field3918 = class176.field3026;
                        class194.method1253(var11, arg0 ^ 0x4BDB);
                    }
                    if (class176.field3026 != null && client.method1599(class20.field274) != null) {
                        class10.field84++;
                        class228.field3831.method621(191, 8);
                        class228.field3831.method1513(class20.field274.field1126, (byte) 29);
                        class228.field3831.method1533(true, class176.field3026.field1126);
                        class228.field3831.method1515(class176.field3026.field1079, arg0 - 6301);
                        class228.field3831.method1516(class20.field274.field1079, arg0 + 2051570527);
                    }
                } else if ((class61.field856 == 1 || class77.method502(class42.field589 - 1, true)) && class42.field589 > 2) {
                    class68.method429(15303);
                } else if (class42.field589 > 0) {
                    class49.method287(15);
                }
                class20.field274 = null;
            }
        } else if (class48.field667 > 1) {
            class20.field274 = null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(Z)V", line = 253)
    public static final void method498(boolean arg0) {
        if (arg0) {
            class65.field890 = class228.field3834;
            class86.field1459 = class162.field2661;
            class3.field35 = class199.field3396;
        } else {
            class65.field890 = class1.field12;
            class86.field1459 = class196.field3336;
            class3.field35 = class220.field3710;
        }
        class221.field3716 = class86.field1459.length;
    }
}
