import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class491 {

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "Ljava/lang/String;")
    private String field7313 = "null";

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field7316 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "I")
    public static int field7321 = 0;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "Lmt;")
    public static class517 field7318 = new class517(64);

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "I")
    public static int field7325 = 0;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "[I")
    public static int[] field7326 = new int[4096];

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "C")
    public char field7314;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "C")
    public char field7315;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field7306;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    private int field7307;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field7310;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field7311;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "I")
    public static int field7320;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "Lmt;")
    public class517 field7312;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "Lmt;")
    private class517 field7319;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 3)
    private final void method2925(int arg0) {
        if (arg0 != -21281) {
            return;
        }
        field7309++;
        this.field7319 = new class517(this.field7312.method3067(4631));
        for (class221 var2 = (class221) this.field7312.method3061(-16817); var2 != null; var2 = (class221) this.field7312.method3066((byte) 127)) {
            class221 var3 = new class221((int) var2.field1739);
            this.field7319.method3055(arg0 + 21281, (long) var2.field3155, var3);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lgk;I)V", line = 26)
    public final void method2926(class468 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2765(118);
            if (var3 == 0) {
                if (arg1 != 0) {
                    field7324 = -106;
                }
                field7322++;
                return;
            }
            this.method2929(var3, (byte) 119, arg0);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 49)
    public final boolean method2927(int arg0, String arg1) {
        field7306++;
        if (arg0 != -6) {
            return true;
        } else if (this.field7312 == null) {
            return false;
        } else {
            if (this.field7319 == null) {
                this.method2930((byte) 28);
            }
            for (class421 var3 = (class421) this.field7319.method3059(111, class379.method2239(arg0 ^ 0x465B, arg1)); var3 != null; var3 = (class421) this.field7319.method3057(0)) {
                if (var3.field6298.equals(arg1)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)Z", line = 81)
    public final boolean method2928(int arg0, byte arg1) {
        field7317++;
        if (this.field7312 == null) {
            return false;
        }
        if (arg1 >= -94) {
            this.field7314 = '\u0007';
        }
        if (this.field7319 == null) {
            this.method2925(-21281);
        }
        class221 var3 = (class221) this.field7319.method3059(58, (long) arg0);
        return var3 != null;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBLgk;)V", line = 105)
    private final void method2929(int arg0, byte arg1, class468 arg2) {
        field7310++;
        if (arg0 == 1) {
            this.field7315 = class245.method1490(arg2.method2714((byte) -76), -1);
        } else if (arg0 == 2) {
            this.field7314 = class245.method1490(arg2.method2714((byte) -90), -1);
        } else if (arg0 == 3) {
            this.field7313 = arg2.method2770(-20459);
        } else if (arg0 == 4) {
            this.field7307 = arg2.method2722(false);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg2.method2727((byte) 43);
            this.field7312 = new class517(class143.method1039(8, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method2722(false);
                class115 var7;
                if (arg0 == 5) {
                    var7 = new class498(arg2.method2770(-20459));
                } else {
                    var7 = new class221(arg2.method2722(false));
                }
                this.field7312.method3055(0, (long) var6, var7);
            }
        }
        int var8 = 105 / ((arg1 - 15) / 35);
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V", line = 157)
    private final void method2930(byte arg0) {
        field7320++;
        this.field7319 = new class517(this.field7312.method3067(4631));
        if (arg0 <= 20) {
            this.method2930((byte) -117);
        }
        for (class498 var2 = (class498) this.field7312.method3061(-16817); var2 != null; var2 = (class498) this.field7312.method3066((byte) 124)) {
            class421 var3 = new class421(var2.field7389, (int) var2.field1739);
            this.field7319.method3055(0, class379.method2239(-18015, var2.field7389), var3);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BI)I", line = 187)
    public final int method2931(byte arg0, int arg1) {
        field7308++;
        if (this.field7312 == null) {
            return this.field7307;
        }
        class221 var3 = (class221) this.field7312.method3059(53, (long) arg1);
        if (var3 == null) {
            return this.field7307;
        } else if (arg0 == -2) {
            return var3.field3155;
        } else {
            return -34;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 207)
    public static final String method2932(byte arg0, String arg1) {
        field7311++;
        if (arg0 < 16) {
            method2932((byte) -22, null);
        }
        if (arg1 == null) {
            return null;
        }
        int var2 = 0;
        int var3 = arg1.length();
        while (var3 > var2 && class357.method2142(arg1.charAt(var2), -557)) {
            var2++;
        }
        while (var3 > var2 && class357.method2142(arg1.charAt(var3 - 1), -557)) {
            var3--;
        }
        int var4 = var3 - var2;
        if (var4 < 1 || var4 > 12) {
            return null;
        }
        StringBuffer var5 = new StringBuffer(var4);
        for (int var6 = var2; var6 < var3; var6++) {
            char var7 = arg1.charAt(var6);
            if (class521.method3091(var7, (byte) -103)) {
                char var8 = class275.method1715(var7, (byte) 106);
                if (var8 != '\u0000') {
                    var5.append(var8);
                }
            }
        }
        if (var5.length() == 0) {
            return null;
        } else {
            return var5.toString();
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)Ljava/lang/String;", line = 263)
    public final String method2933(int arg0, int arg1) {
        field7323++;
        if (this.field7312 == null) {
            return this.field7313;
        }
        class498 var3 = (class498) this.field7312.method3059(91, (long) arg1);
        if (var3 == null) {
            return this.field7313;
        } else {
            if (arg0 < 18) {
                this.method2926(null, 85);
            }
            return var3.field7389;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V", line = 286)
    public static void method2934(int arg0) {
        field7316 = null;
        field7326 = null;
        field7318 = null;
        if (arg0 != -6) {
            field7325 = -79;
        }
    }
}
