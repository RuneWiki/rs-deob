import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class124 {

    @OriginalMember(owner = "client!r", name = "f", descriptor = "Lkh;")
    private class13 field1849 = new class13(128);

    @OriginalMember(owner = "client!r", name = "j", descriptor = "Lul;")
    private class406 field1853;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1847 = "";

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "Ll;")
    public static class16 field1846;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 5)
    public final void method914(int arg0) {
        field1851++;
        class13 var2 = this.field1849;
        synchronized (this.field1849) {
            int var3 = 93 / ((arg0 + 36) / 43);
            this.field1849.method93((byte) 83);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lya;IILc;III[[[B[I[I[I[I[IIBIIZ)V", line = 18)
    public static final void method915(class38 arg0, int arg1, int arg2, class125 arg3, int arg4, int arg5, int arg6, byte[][][] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, byte arg14, int arg15, int arg16, boolean arg17) {
        class291.field4407 = arg0;
        class193.field3263 = arg1;
        class348.field5152 = arg3;
        class242.field3845 = class291.field4407.method301() > 0;
        class395.field5900 = arg4 >> class163.field2415;
        class284.field4314 = arg6 >> class163.field2415;
        class62.field761 = arg4;
        class529.field7735 = arg6;
        class490.field7046 = arg5;
        class233.field3768 = class395.field5900 - class46.field602;
        if (class233.field3768 < 0) {
            class133.field2043 = -class233.field3768;
            class233.field3768 = 0;
        } else {
            class133.field2043 = 0;
        }
        class313.field4715 = class284.field4314 - class46.field602;
        if (class313.field4715 < 0) {
            class262.field4022 = -class313.field4715;
            class313.field4715 = 0;
        } else {
            class262.field4022 = 0;
        }
        class222.field3640 = class46.field602 + class395.field5900;
        if (class222.field3640 > class497.field7147) {
            class222.field3640 = class497.field7147;
        }
        class376.field5649 = class46.field602 + class284.field4314;
        if (class376.field5649 > class385.field5799) {
            class376.field5649 = class385.field5799;
        }
        for (int var18 = 0; var18 < class46.field602 + class46.field602 + 2; var18++) {
            for (int var23 = 0; var23 < class46.field602 + class46.field602 + 2; var23++) {
                int var24 = class395.field5900 + var18 - class46.field602;
                int var25 = class284.field4314 + var23 - class46.field602;
                if (var24 >= 0 && var25 >= 0 && var24 < class497.field7147 && var25 < class385.field5799) {
                    int var26 = var24 << class163.field2415;
                    int var27 = var25 << class163.field2415;
                    int var28 = class289.field4358[class289.field4358.length - 1].method411(var24, var25) - (0x3E8 << class163.field2415 - 7);
                    int var29 = class290.field4367 == null ? class289.field4358[0].method411(var24, var25) + class450.field6574 : class290.field4367[0].method411(var24, var25) + class450.field6574;
                    class60.field721[var18][var23] = class291.field4407.method310(var26, var28, var27, var26, var29, var27);
                } else {
                    class60.field721[var18][var23] = false;
                }
            }
        }
        for (int var19 = 0; var19 < class46.field602 + class46.field602 + 1; var19++) {
            for (int var22 = 0; var22 < class46.field602 + class46.field602 + 1; var22++) {
                class265.field4070[var19][var22] = class60.field721[var19][var22] || class60.field721[var19 + 1][var22] || class60.field721[var19][var22 + 1] || class60.field721[var19 + 1][var22 + 1];
            }
        }
        class348.field5146 = arg8;
        class329.field4945 = arg9;
        class454.field6607 = arg10;
        class271.field4153 = arg11;
        class280.field4250 = arg12;
        class405.method2530();
        class363.method2276((byte) -73);
        for (class484 var20 = (class484) class515.field7496.method1958(53); var20 != null; var20 = (class484) class515.field7496.method1961(80)) {
            var20.method526((byte) 74);
            class287.method1855(0, var20);
        }
        if (class242.field3845) {
            for (int var21 = 0; var21 < class316.field4756; var21++) {
                class503.field7256[var21].method2496(-32695, arg17, arg1);
            }
        }
        if (arg2 > 1) {
            class291.field4407.method265(0);
            if (class358.field5320 == null || class358.field5320 instanceof class425) {
                class358.field5320 = new class326();
            }
        } else if (class358.field5320 == null || class358.field5320 instanceof class326) {
            class358.field5320 = new class425();
        }
        class358.field5320.method1431(arg2, 0);
        class358.field5320.method1435(113);
        if (class75.field1076 != null) {
            class528.method3119(true);
            class358.field5320.method1434(22, -127);
            class397.method2502(arg2, null, 0, (byte) 0, arg15, arg16);
            class358.field5320.method1435(118);
            class358.field5320.method1434(23, -127);
            class528.method3119(false);
        }
        class397.method2502(arg2, arg7, arg13, arg14, arg15, arg16);
        class358.field5320.method1435(123);
        class358.field5320.method1428((byte) 12);
        class358.field5320.method1435(117);
        if (arg2 > 1) {
            class291.field4407.method318(0);
        }
        class291.field4407.method359(0, null);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V", line = 174)
    public final void method916(int arg0) {
        if (arg0 != 0) {
            return;
        }
        class13 var2 = this.field1849;
        synchronized (this.field1849) {
            this.field1849.method88(86);
        }
        field1845++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BI)V", line = 189)
    public final void method917(byte arg0, int arg1) {
        class13 var3 = this.field1849;
        synchronized (this.field1849) {
            if (arg0 != -97) {
                this.method917((byte) -19, 59);
            }
            this.field1849.method91(20, arg1);
        }
        field1848++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IILod;III)Ljava/awt/Frame;", line = 206)
    public static final Frame method918(int arg0, int arg1, class352 arg2, int arg3, int arg4, int arg5) {
        if (arg0 > -39) {
            method921(-116, -118, -91, false);
        }
        field1854++;
        if (!arg2.method2199(1)) {
            return null;
        }
        if (arg3 == 0) {
            class224[] var6 = class154.method1060(arg2, 34);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field3666 == arg4 && var6[var8].field3668 == arg5 && (arg1 == 0 || var6[var8].field3667 == arg1) && (!var7 || var6[var8].field3669 > arg3)) {
                    var7 = true;
                    arg3 = var6[var8].field3669;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class449 var9 = arg2.method2207((byte) 116, arg5, arg4, arg3, arg1);
        while (var9.field6570 == 0) {
            class434.method2690(10, 10L);
        }
        Frame var10 = (Frame) var9.field6569;
        if (var10 == null) {
            return null;
        } else if (var9.field6570 == 2) {
            class366.method2289((byte) 88, arg2, var10);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)Lsd;", line = 283)
    public final class63 method919(int arg0, int arg1) {
        field1844++;
        class13 var3 = this.field1849;
        class63 var4;
        synchronized (this.field1849) {
            var4 = (class63) this.field1849.method87((long) arg1, -2062335807);
        }
        if (var4 != null) {
            return var4;
        }
        class406 var5 = this.field1853;
        byte[] var6;
        synchronized (this.field1853) {
            var6 = this.field1853.method2536(arg0, 0, arg1);
        }
        class63 var7 = new class63();
        if (var6 != null) {
            var7.method550((byte) -77, new class217(var6));
        }
        class13 var8 = this.field1849;
        synchronized (this.field1849) {
            this.field1849.method84((long) arg1, var7, (byte) 27);
            return var7;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V", line = 314)
    public static void method920(byte arg0) {
        if (arg0 > 81) {
            field1847 = null;
            field1846 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lee;ILul;)V", line = 330)
    public class124(class480 arg0, int arg1, class406 arg2) {
        this.field1853 = arg2;
        this.field1853.method2551(1, -26070);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIZ)I", line = 345)
    public static final int method921(int arg0, int arg1, int arg2, boolean arg3) {
        field1850++;
        class240 var4 = class516.method3061((byte) -30, arg3, arg2);
        if (arg0 != -11059) {
            method915(null, 85, -83, null, -53, 60, 54, null, null, null, null, null, null, 22, (byte) 91, -63, -83, true);
        }
        if (var4 == null) {
            return 0;
        } else if (arg1 >= 0 && arg1 < var4.field3829.length) {
            return var4.field3829[arg1];
        } else {
            return 0;
        }
    }
}
