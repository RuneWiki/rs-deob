import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class288 extends class240 {

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "I")
    private int field4924 = 0;

    @OriginalMember(owner = "client!jg", name = "eb", descriptor = "I")
    private int field4932 = 1;

    @OriginalMember(owner = "client!jg", name = "db", descriptor = "I")
    private int field4931 = 0;

    @OriginalMember(owner = "client!jg", name = "X", descriptor = "Lcd;")
    public static class64 field4925 = class44.method335((byte) 71, "(U3");

    @OriginalMember(owner = "client!jg", name = "Z", descriptor = "Z")
    public static boolean field4927 = true;

    @OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!jg", name = "P", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!jg", name = "Q", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!jg", name = "R", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!jg", name = "Y", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!jg", name = "bb", descriptor = "I")
    public static int field4929;

    @OriginalMember(owner = "client!jg", name = "cb", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!jg", name = "ab", descriptor = "Lqm;")
    public static class222 field4928;

    @OriginalMember(owner = "client!jg", name = "S", descriptor = "[I")
    public static int[] field4920;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "(I)V", line = 5)
    public static final void method1986(int arg0) {
        class137.field2438 = 0;
        field4923++;
        class26.field428 = 0;
        class17.field353.field281 = 0;
        class101.field1828 = false;
        class220.field3736 = 0;
        class11.field227 = 0;
        class133.field2361 = 0;
        class273.field4685 = -1;
        class40.field631 = 0;
        class274.field4709 = -1;
        class108.field1991.field281 = 0;
        class299.field5163 = -1;
        class156.field2765 = -1;
        for (int var1 = 0; var1 < class284.field4888.length; var1++) {
            if (class284.field4888[var1] != null) {
                class284.field4888[var1].field1912 = -1;
            }
        }
        if (arg0 != 15660) {
            method1991(-87);
        }
        for (int var2 = 0; var2 < class2.field12.length; var2++) {
            if (class2.field12[var2] != null) {
                class2.field12[var2].field1912 = -1;
            }
        }
        class13.method132((byte) 98);
        class238.field4054 = 1;
        class153.method1107(30, (byte) -105);
        for (int var3 = 0; var3 < 100; var3++) {
            class249.field4328[var3] = true;
        }
        class83.method644(46);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)[I", line = 67)
    public final int[] method12(int arg0, int arg1) {
        field4917++;
        if (arg0 != 64) {
            field4925 = (class64) null;
        }
        int[] var3 = this.field4094.method179(arg1, true);
        if (this.field4094.field344) {
            int var4 = class268.field4615[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class169.field2936; var6++) {
                int var7 = class74.field1408[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field4931 == 0) {
                    var11 = (var7 - var4) * this.field4932;
                } else {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field4932 * var10) * 3.141592653589793D);
                }
                int var12 = var11 - (var11 & 0xFFFFF000);
                if (this.field4924 == 0) {
                    var12 = class168.field2929[var12 >> 4 & 0xFF] + 4096 >> 1;
                } else if (this.field4924 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(BI)I", line = 139)
    public static final int method1987(byte arg0, int arg1) {
        if (arg0 >= -41) {
            return 22;
        } else {
            field4930++;
            return arg1 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)V", line = 150)
    public final void method288(int arg0) {
        if (arg0 == 17772) {
            field4926++;
            class92.method692(arg0 - 17772);
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V", line = 162)
    public class288() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)Lnf;", line = 171)
    public static final class62 method1988(boolean arg0) {
        field4919++;
        try {
            return arg0 ? (class62) null : (class62) Class.forName("he").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "(I)V", line = 205)
    public static void method1989(int arg0) {
        field4925 = null;
        if (arg0 != 0) {
            method1988(false);
        }
        field4928 = null;
        field4920 = null;
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(B)V", line = 220)
    public static final void method1990(byte arg0) {
        field4929++;
        int var1 = (class121.field2184 >> 3) + (class119.field2156 >> 10);
        int var2 = (class99.field1791 >> 10) + (class190.field3269 >> 3);
        byte var3 = 0;
        byte var4 = 8;
        byte var5 = 8;
        byte var6 = 18;
        class97.field1768 = new byte[var6][];
        class53.field864 = new int[var6];
        class292.field5045 = new int[var6];
        class82.field1515 = new int[var6];
        class71.field1360 = new byte[var6][];
        class134.field2384 = new byte[var6][];
        class13.field268 = new byte[var6][];
        class65.field1295 = new int[var6];
        class180.field3099 = new byte[var6][];
        class89.field1611 = new int[var6];
        class120.field2165 = new int[var6][4];
        if (arg0 != 76) {
            field4916 = -27;
        }
        class211.field3540 = new int[var6];
        int var7 = 0;
        for (int var8 = (var2 - 6) / 8; var8 <= ((var2 + 6) / 8); var8++) {
            for (int var9 = (var1 - 6) / 8; var9 <= (var1 + 6) / 8; var9++) {
                int var10 = (var8 << 8) + var9;
                class89.field1611[var7] = var10;
                class292.field5045[var7] = class253.field4413.method1606(55, class104.method768(new class64[] { class180.field3092, class310.method2149(var8, (byte) 91), class121.field2187, class310.method2149(var9, (byte) 6) }, false));
                class53.field864[var7] = class253.field4413.method1606(arg0 - 12, class104.method768(new class64[] { class250.field4338, class310.method2149(var8, (byte) -55), class121.field2187, class310.method2149(var9, (byte) -92) }, false));
                class82.field1515[var7] = class253.field4413.method1606(arg0 + 4, class104.method768(new class64[] { class309.field5255, class310.method2149(var8, (byte) -48), class121.field2187, class310.method2149(var9, (byte) -28) }, false));
                class211.field3540[var7] = class253.field4413.method1606(85, class104.method768(new class64[] { class83.field1539, class310.method2149(var8, (byte) 106), class121.field2187, class310.method2149(var9, (byte) 86) }, false));
                class65.field1295[var7] = class253.field4413.method1606(127, class104.method768(new class64[] { class82.field1506, class310.method2149(var8, (byte) 87), class121.field2187, class310.method2149(var9, (byte) 99) }, false));
                if (class82.field1515[var7] == -1) {
                    class292.field5045[var7] = -1;
                    class53.field864[var7] = -1;
                    class211.field3540[var7] = -1;
                    class65.field1295[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class82.field1515.length; var11++) {
            class82.field1515[var11] = -1;
            class292.field5045[var11] = -1;
            class53.field864[var11] = -1;
            class211.field3540[var11] = -1;
            class65.field1295[var11] = -1;
        }
        class254.method1817(var1, -84, var5, var4, var3, true, var2);
    }

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "(I)V", line = 307)
    public static final void method1991(int arg0) {
        class70.field1357.method1198(false);
        if (arg0 != 8) {
            field4927 = false;
        }
        field4918++;
        class301.field5173.method1198(false);
        class130.field2311.method1198(false);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILkh;)V", line = 325)
    public final void method16(int arg0, int arg1, class13 arg2) {
        field4921++;
        if (arg0 != 2) {
            this.method16(-12, 13, (class13) null);
        }
        if (arg1 == 0) {
            this.field4931 = arg2.method152((byte) -111);
        } else if (arg1 == 1) {
            this.field4924 = arg2.method152((byte) -88);
        } else if (arg1 == 3) {
            this.field4932 = arg2.method152((byte) -76);
        }
    }
}
