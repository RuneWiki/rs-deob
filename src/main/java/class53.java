import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class53 {

    @OriginalMember(owner = "client!il", name = "t", descriptor = "Lrl;")
    private class185 field866;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "Ljm;")
    private class226 field857;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "Lhg;")
    private class163 field871;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "Lcd;")
    public static class64 field847 = class44.method335((byte) 71, "(U5");

    @OriginalMember(owner = "client!il", name = "h", descriptor = "Lcd;")
    public static class64 field854 = class44.method335((byte) 71, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!il", name = "m", descriptor = "Lcd;")
    private static class64 field859 = class44.method335((byte) 71, "Cancel");

    @OriginalMember(owner = "client!il", name = "f", descriptor = "Lcd;")
    public static class64 field852 = field859;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "Lcd;")
    public static class64 field855 = class44.method335((byte) 71, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!il", name = "z", descriptor = "[Lbc;")
    public static class111[] field872 = new class111[50];

    @OriginalMember(owner = "client!il", name = "x", descriptor = "Lcd;")
    public static class64 field870 = class44.method335((byte) 71, ")4a=");

    @OriginalMember(owner = "client!il", name = "g", descriptor = "Lea;")
    public static class193 field853 = new class193();

    @OriginalMember(owner = "client!il", name = "C", descriptor = "Lcd;")
    public static class64 field875 = class44.method335((byte) 71, "");

    @OriginalMember(owner = "client!il", name = "A", descriptor = "Lcd;")
    public static class64 field873 = class44.method335((byte) 71, "(U0a )2 via: ");

    @OriginalMember(owner = "client!il", name = "D", descriptor = "Lcd;")
    public static class64 field876 = class44.method335((byte) 71, "runes");

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "I")
    public static int field868;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "Lkh;")
    private class13 field861;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "Lqm;")
    public static class222 field858;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "[I")
    public static int[] field864;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "[Lnl;")
    private class29[] field848;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "[Lqd;")
    public static class40[] field856;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ZILcd;)V", line = 6)
    public static final void method395(boolean arg0, int arg1, class64 arg2) {
        field850++;
        boolean var3 = false;
        class64 var4 = arg2.method534(-91).method510(99);
        if (!arg0) {
            field853 = (class193) null;
        }
        for (int var5 = 0; var5 < class163.field2862; var5++) {
            class41 var6 = class284.field4888[class194.field3307[var5]];
            if (var6 != null && var6.field672 != null && var6.field672.method515(-64, var4)) {
                class85.method650(0, 2, 0, -12920, var6.field1876[0], var6.field1898[0], 1, false, class139.field2472.field1876[0], class139.field2472.field1898[0], 0, 1);
                var3 = true;
                if (arg1 == 1) {
                    class17.field353.method1214(-125, 248);
                    class298.field5140++;
                    class17.field353.method149(class194.field3307[var5], arg0);
                } else if (arg1 == 4) {
                    class28.field450++;
                    class17.field353.method1214(-52, 199);
                    class17.field353.method149(class194.field3307[var5], true);
                } else if (arg1 == 5) {
                    class125.field2261++;
                    class17.field353.method1214(-48, 109);
                    class17.field353.method126(class194.field3307[var5], true);
                } else if (arg1 == 6) {
                    class30.field507++;
                    class17.field353.method1214(-86, 84);
                    class17.field353.method145(81, class194.field3307[var5]);
                } else if (arg1 == 7) {
                    class307.field5250++;
                    class17.field353.method1214(-80, 133);
                    class17.field353.method126(class194.field3307[var5], true);
                }
                break;
            }
        }
        if (!var3) {
            class233.method1670(class104.method768(new class64[] { class180.field3077, var4 }, false), class188.field3240, 0, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BILih;Lih;)Lnl;", line = 91)
    public final class29 method396(byte arg0, int arg1, class30 arg2, class30 arg3) {
        field851++;
        if (arg0 >= -12) {
            method398(-3);
        }
        return this.method401(8, arg1, arg3, true, arg2);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)Z", line = 109)
    public final boolean method397(int arg0) {
        field869++;
        if (this.field861 != null) {
            return true;
        }
        if (this.field871 == null) {
            if (this.field866.method1309(false)) {
                return false;
            }
            this.field871 = this.field866.method1305(true, 255, 2627, 255, (byte) 0);
        }
        if (this.field871.field961) {
            return false;
        } else {
            this.field861 = new class13(this.field871.method451(28985));
            this.field848 = new class29[(this.field861.field254.length - 5) / 8];
            return arg0 > -79 ? true : true;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V", line = 141)
    public static void method398(int arg0) {
        field870 = null;
        field854 = null;
        field855 = null;
        int var1 = -58 % ((65 - arg0) / 37);
        field859 = null;
        field873 = null;
        field853 = null;
        field875 = null;
        field876 = null;
        field864 = null;
        field858 = null;
        field856 = null;
        field852 = null;
        field872 = null;
        field847 = null;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)V", line = 168)
    public static final void method399(int arg0) {
        int var1 = 0;
        int var2 = -127 % ((-arg0 - 5) / 41);
        while (class97.field1779 > var1) {
            class301 var3 = class24.method220(var1, (byte) 125);
            if (var3 != null && var3.field5178 == 0) {
                class88.field1601[var1] = 0;
                class289.field4941[var1] = 0;
            }
            var1++;
        }
        field849++;
        class196.field3339 = new class159(16);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 197)
    public static final Class method400(String arg0, int arg1) throws ClassNotFoundException {
        field868++;
        if (arg1 > -100) {
            method398(-120);
        }
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IILih;ZLih;)Lnl;", line = 248)
    private final class29 method401(int arg0, int arg1, class30 arg2, boolean arg3, class30 arg4) {
        field863++;
        if (this.field861 == null) {
            throw new RuntimeException();
        }
        this.field861.field281 = arg0 * arg1 + 5;
        if (this.field861.field254.length <= this.field861.field281) {
            throw new RuntimeException();
        } else if (this.field848[arg1] == null) {
            int var6 = this.field861.method105((byte) 63);
            int var7 = this.field861.method105((byte) 38);
            class29 var8 = new class29(arg1, arg2, arg4, this.field866, this.field857, var6, var7, arg3);
            this.field848[arg1] = var8;
            return var8;
        } else {
            return this.field848[arg1];
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V", line = 300)
    public static final void method402(byte arg0) {
        if (arg0 != 74) {
            return;
        }
        field860++;
        if (class83.field1524 != -1) {
            class120.method846(class83.field1524, -19);
        }
        for (int var1 = 0; var1 < class241.field4161; var1++) {
            if (class249.field4328[var1]) {
                class267.field4582[var1] = true;
            }
            class117.field2137[var1] = class249.field4328[var1];
            class249.field4328[var1] = false;
        }
        class49.field810 = -1;
        class304.field5201 = -1;
        class66.field1308 = class29.field482;
        class69.field1328 = null;
        if (class123.field2216) {
            class149.field2617 = true;
        }
        if (class83.field1524 != -1) {
            class241.field4161 = 0;
            class264.method1854(0, class58.field960, 0, -1, 15706, class13.field290, class83.field1524, 0, 0);
        }
        if (class123.field2216) {
            class21.method203();
        } else {
            class210.method1458();
        }
        class249.field4327 = 0;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V", line = 347)
    public final void method403(int arg0) {
        field862++;
        if (this.field848 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field848.length; var2++) {
            if (this.field848[var2] != null) {
                this.field848[var2].method253(-579);
            }
        }
        int var3 = 0;
        if (arg0 < 116) {
            field877 = 24;
        }
        while (this.field848.length > var3) {
            if (this.field848[var3] != null) {
                this.field848[var3].method248((byte) 0);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lrl;Ljm;)V", line = 391)
    public class53(class185 arg0, class226 arg1) {
        this.field866 = arg0;
        this.field857 = arg1;
        if (!this.field866.method1309(false)) {
            this.field871 = this.field866.method1305(true, 255, 2627, 255, (byte) 0);
        }
    }
}
