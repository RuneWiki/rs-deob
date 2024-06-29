import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public class class143 {

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "Llh;")
    private class213 field1988 = new class213();

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "Luk;")
    private class105 field1997 = new class105();

    @OriginalMember(owner = "client!dj", name = "r", descriptor = "I")
    private int field2000;

    @OriginalMember(owner = "client!dj", name = "s", descriptor = "I")
    private int field2001;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "Lic;")
    private class329 field1999;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "[Z")
    public static boolean[] field1991 = new boolean[112];

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
    public static int field1985;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "Lfh;")
    public static class140 field1998;

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "[[I")
    public static int[][] field1992;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 5)
    public static final void method1110(byte arg0, Component arg1) {
        field1987++;
        arg1.addMouseListener(class226.field3250);
        if (arg0 != -87) {
            method1118((Component) null, 112);
        }
        arg1.addMouseMotionListener(class226.field3250);
        arg1.addFocusListener(class226.field3250);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V", line = 24)
    public static final void method1111(int arg0) {
        class287.field4120.method2258((byte) 86);
        field1996++;
        class62.field777.method2258((byte) 86);
        int var1 = 27 / ((arg0 + 75) / 38);
        class348.field5428.method2258((byte) 86);
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)V", line = 42)
    public static void method1112(int arg0) {
        field1991 = null;
        field1998 = null;
        field1992 = (int[][]) null;
        if (arg0 != -51) {
            method1114(-82, (class140) null, -71);
        }
    }

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "(I)Lni;", line = 55)
    public final class26 method1113(int arg0) {
        if (arg0 < 11) {
            method1118((Component) null, -16);
        }
        field1989++;
        return this.field1999.method2277(13292);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(ILfh;I)Lqh;", line = 81)
    public static final class275 method1114(int arg0, class140 arg1, int arg2) {
        field1990++;
        if (arg2 != 112) {
            method1114(81, (class140) null, -127);
        }
        byte[] var3 = arg1.method1060(arg0, true);
        return var3 == null ? null : new class275(var3);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(JILlh;)V", line = 99)
    public final void method1115(long arg0, int arg1, class213 arg2) {
        if (this.field2000 == 0) {
            class213 var5 = this.field1997.method743(false);
            var5.method179((byte) 51);
            var5.method1556(255);
            if (this.field1988 == var5) {
                class213 var6 = this.field1997.method743(false);
                var6.method179((byte) 51);
                var6.method1556(255);
            }
        } else {
            this.field2000--;
        }
        field1984++;
        this.field1999.method2275(arg2, 89, arg0);
        if (arg1 > 28) {
            this.field1997.method740(-102, arg2);
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(IJ)Llh;", line = 131)
    public final class213 method1116(int arg0, long arg1) {
        if (arg0 != 17301) {
            return (class213) null;
        }
        field1993++;
        class213 var4 = (class213) this.field1999.method2279(arg1, arg0 - 17420);
        if (var4 != null) {
            this.field1997.method740(-109, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)Lni;", line = 159)
    public final class26 method1117(int arg0) {
        field1986++;
        if (arg0 != -91) {
            this.method1113(16);
        }
        return this.field1999.method2278((byte) -65);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 172)
    public static final void method1118(Component arg0, int arg1) {
        arg0.removeMouseListener(class226.field3250);
        arg0.removeMouseMotionListener(class226.field3250);
        if (arg1 <= 9) {
            method1119(-86, -52);
        }
        field1983++;
        arg0.removeFocusListener(class226.field3250);
        class290.field4192 = 0;
    }

    @OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(I)V", line = 227)
    public class143(int arg0) {
        this.field2000 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field2001 = arg0;
        this.field1999 = new class329(var2);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Ljava/lang/String;", line = 193)
    public static final String method1119(int arg0, int arg1) {
        if (arg0 > -8) {
            return (String) null;
        }
        field1985++;
        if (arg1 >= 100000) {
            return arg1 < 10000000 ? "<col=ffffff>" + arg1 / 1000 + class204.field2834 + "</col>" : "<col=00ff80>" + arg1 / 1000000 + class249.field3623 + "</col>";
        } else {
            return "<col=ffff00>" + arg1 + "</col>";
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V", line = 212)
    public final void method1120(byte arg0) {
        this.field1997.method744(-15997);
        this.field1999.method2282((byte) -127);
        field1994++;
        this.field1988 = new class213();
        this.field2000 = this.field2001;
        int var2 = 82 / ((arg0 - 80) / 34);
    }
}
