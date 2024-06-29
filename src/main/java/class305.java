import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class305 {

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field4852 = 0;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field4849;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "[I")
    public static int[] field4853;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILjava/lang/String;)I", line = 4)
    public static final int method2163(int arg0, String arg1) {
        field4848++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = arg0; var4 < var2; var4++) {
            var3 = class242.method1713(50, arg1.charAt(var4)) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)V", line = 24)
    public static final void method2164(byte arg0, int arg1) {
        field4851++;
        int var2 = 15 % ((arg0 - 2) / 54);
        class170 var3 = class221.method1613(4, arg1, -8410);
        var3.method1267(-120);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 36)
    public static void method2165(int arg0) {
        if (arg0 >= 84) {
            field4853 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILaj;)V", line = 62)
    public static final void method2166(int arg0, class1 arg1) {
        field4850++;
        if (arg0 != 30896) {
            method2166(-5, (class1) null);
        }
        byte[] var2 = new byte[24];
        if (class63.field928 != null) {
            try {
                int var3 = 0;
                class63.field928.method430(0L, (byte) 98);
                class63.field928.method426(var2, 0);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var6) {
                for (int var5 = 0; var5 < 24; var5++) {
                    var2[var5] = -1;
                }
            }
        }
        arg1.method61(24, var2, 0, -2131480434);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IB)Lbi;", line = 107)
    public static final class91 method2167(int arg0, byte arg1) {
        field4856++;
        return arg1 > -123 ? (class91) null : (class91) class243.field3641.method79((long) arg0, (byte) 0);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)Lud;", line = 118)
    public static final class297 method2168(int arg0, int arg1) {
        field4854++;
        if (arg0 == 0) {
            return new class318();
        } else if (arg0 == 1) {
            return new class95();
        } else if (arg0 == 2) {
            return new class34();
        } else if (arg0 == 3) {
            return new class247();
        } else if (arg0 == 4) {
            return new class343();
        } else if (arg0 == 5) {
            return new class156();
        } else if (arg0 == 6) {
            return new class39();
        } else if (arg0 == 7) {
            return new class195();
        } else if (arg0 == 8) {
            return new class221();
        } else if (arg0 == 9) {
            return new class81();
        } else if (arg0 == 10) {
            return new class137();
        } else if (arg0 == 11) {
            return new class323();
        } else if (arg0 == 12) {
            return new class184();
        } else if (arg0 == 13) {
            return new class48();
        } else if (arg0 == 14) {
            return new class319();
        } else if (arg0 == 15) {
            return new class143();
        } else if (arg0 == 16) {
            return new class273();
        } else if (arg0 == 17) {
            return new class87();
        } else if (arg0 == 18) {
            return new class338();
        } else if (arg0 == 19) {
            return new class208();
        } else if (arg0 == 20) {
            return new class197();
        } else if (arg0 == 21) {
            return new class258();
        } else if (arg0 == 22) {
            return new class50();
        } else if (arg0 == 23) {
            return new class213();
        } else if (arg0 == 24) {
            return new class164();
        } else if (arg0 == 25) {
            return new class345();
        } else if (arg0 == 26) {
            return new class328();
        } else if (arg0 == 27) {
            return new class130();
        } else if (arg0 == 28) {
            return new class99();
        } else if (arg0 == 29) {
            return new class12();
        } else if (arg0 == 30) {
            return new class191();
        } else if (arg0 == 31) {
            return new class15();
        } else if (arg0 == 32) {
            return new class28();
        } else if (arg0 == 33) {
            return new class169();
        } else if (arg0 == 34) {
            return new class237();
        } else if (arg0 == 35) {
            return new class229();
        } else if (arg0 == 36) {
            return new class116();
        } else if (arg0 == 37) {
            return new class131();
        } else if (arg0 == 38) {
            return new class79();
        } else if (arg0 == 39) {
            return new class96();
        } else {
            if (arg1 != -20) {
                method2166(-42, (class1) null);
            }
            return null;
        }
    }
}
