import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class57 {

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "Ljava/lang/String;")
    private String field734 = "null";

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field745 = 0;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "Lhga;")
    public static class158 field737 = new class158(16, 0);

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "Lhga;")
    public static class158 field750 = new class158(75, -1);

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "C")
    public char field741;

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "C")
    public char field744;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    private int field743;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "Lsba;")
    public class200 field735;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Lsba;")
    private class200 field740;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILie;)V")
    public final void method657(int arg0, class6 arg1) {
        if (arg0 != -1) {
            method666(null, 73, 13, 76, (byte) -56);
        }
        while (true) {
            int var3 = arg1.method70(-9059);
            if (var3 == 0) {
                field748++;
                return;
            }
            this.method663(arg1, var3, (byte) 111);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public final boolean method658(boolean arg0, String arg1) {
        field751++;
        if (this.field735 == null) {
            return false;
        } else if (arg0) {
            if (this.field740 == null) {
                this.method662(0);
            }
            for (class89 var3 = (class89) this.field740.method1558(class585.method3432(arg1, 0), (byte) -93); var3 != null; var3 = (class89) this.field740.method1565((byte) 44)) {
                if (var3.field1073.equals(arg1)) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)I")
    public final int method659(int arg0, int arg1) {
        field736++;
        if (this.field735 == null) {
            return this.field743;
        }
        class160 var3 = (class160) this.field735.method1558((long) arg1, (byte) -93);
        if (var3 == null) {
            return this.field743;
        } else if (arg0 == -2) {
            return var3.field2728;
        } else {
            return -6;
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method660(int arg0, int arg1) {
        field739++;
        if (this.field735 == null) {
            return this.field734;
        }
        if (arg0 >= -117) {
            this.field734 = null;
        }
        class420 var3 = (class420) this.field735.method1558((long) arg1, (byte) -93);
        return var3 == null ? this.field734 : var3.field6425;
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(II)Z")
    public final boolean method661(int arg0, int arg1) {
        field742++;
        if (this.field735 == null) {
            return false;
        }
        if (arg0 != 3) {
            this.field744 = '\u0010';
        }
        if (this.field740 == null) {
            this.method664(-5);
        }
        class160 var3 = (class160) this.field740.method1558((long) arg1, (byte) -93);
        return var3 != null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    private final void method662(int arg0) {
        field738++;
        this.field740 = new class200(this.field735.method1561((byte) -115));
        class420 var2 = (class420) this.field735.method1556(arg0 + 97);
        if (arg0 != 0) {
            return;
        }
        while (var2 != null) {
            class89 var3 = new class89(var2.field6425, (int) var2.field844);
            this.field740.method1564(class585.method3432(var2.field6425, 0), var3, (byte) 112);
            var2 = (class420) this.field735.method1559(74);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lie;IB)V")
    private final void method663(class6 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field741 = class457.method2868(51, arg0.method81(true));
        } else if (arg1 == 2) {
            this.field744 = class457.method2868(arg2 ^ 0x43, arg0.method81(true));
        } else if (arg1 == 3) {
            this.field734 = arg0.method42((byte) -104);
        } else if (arg1 == 4) {
            this.field743 = arg0.method72(-86);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method67(12021);
            this.field735 = new class200(class413.method2636(var4, 127));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method72(arg2 ^ 0xFFFFFFB5);
                class66 var7;
                if (arg1 == 5) {
                    var7 = new class420(arg0.method42((byte) -44));
                } else {
                    var7 = new class160(arg0.method72(-17));
                }
                this.field735.method1564((long) var6, var7, (byte) 125);
            }
        }
        field746++;
        if (arg2 != 111) {
            this.method661(63, 121);
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V")
    private final void method664(int arg0) {
        if (arg0 != -5) {
            this.method660(-76, -63);
        }
        this.field740 = new class200(this.field735.method1561((byte) -95));
        field747++;
        for (class160 var2 = (class160) this.field735.method1556(58); var2 != null; var2 = (class160) this.field735.method1559(arg0 ^ 0xFFFFFFC5)) {
            class160 var3 = new class160((int) var2.field844);
            this.field740.method1564((long) var2.field2728, var3, (byte) 105);
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)V")
    public static void method665(int arg0) {
        int var1 = -90 / ((23 - arg0) / 37);
        field737 = null;
        field750 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Llr;IIIB)V")
    public static final void method666(class698 arg0, int arg1, int arg2, int arg3, byte arg4) {
        field749++;
        if (arg4 > -119) {
            field737 = null;
        }
        for (class119 var5 = (class119) class675.field9520.method3465((byte) 117); var5 != null; var5 = (class119) class675.field9520.method3469(0)) {
            if (var5.field1914 == arg2 && (arg1 << 9) == var5.field1902 && (arg3 << 9) == var5.field1904 && var5.field1906.field9825 == arg0.field9825) {
                if (var5.field1911 != null) {
                    class505.field7381.method1985(var5.field1911);
                    var5.field1911 = null;
                }
                if (var5.field1917 != null) {
                    class505.field7381.method1985(var5.field1917);
                    var5.field1917 = null;
                }
                var5.method707((byte) -14);
                return;
            }
        }
    }
}
