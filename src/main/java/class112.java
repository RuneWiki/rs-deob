import java.awt.Color;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class112 {

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "Lcv;")
    private class398 field1771 = new class398(256);

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Lcv;")
    private class398 field1777 = new class398(256);

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "Lhh;")
    private class84 field1770;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "Lhh;")
    private class84 field1769;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1772 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1779 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "Lvp;")
    public static class123 field1781 = new class123(34, -1);

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "Lgf;")
    public static class180 field1782 = new class180("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public static int field1784 = 0;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "Lci;")
    public static class312 field1785;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "Lf;")
    public static class528 field1783;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)V", line = 6)
    public static void method827(byte arg0) {
        field1785 = null;
        field1779 = null;
        field1781 = null;
        field1782 = null;
        if (arg0 >= 53) {
            field1772 = null;
            field1783 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(III[I)Lbv;", line = 22)
    private final class199 method828(int arg0, int arg1, int arg2, int[] arg3) {
        field1767++;
        int var5 = (arg0 >>> 12 | (arg0 & arg2) << 4) ^ arg1;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class199 var9 = (class199) this.field1777.method2485(124, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class195 var10 = (class195) this.field1771.method2485(arg2 - 1879052234, var7);
            if (var10 == null) {
                var10 = class195.method1329(this.field1769, arg0, arg1);
                if (var10 == null) {
                    return null;
                }
                this.field1771.method2486(20, var10, var7);
            }
            class199 var11 = var10.method1328(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method2663(-128);
                this.field1777.method2486(-126, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([IIII)Lbv;", line = 67)
    private final class199 method829(int[] arg0, int arg1, int arg2, int arg3) {
        field1775++;
        int var5 = arg3 ^ (arg1 << 4 & 0xFFFB | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        long var7 = (long) var6;
        class199 var9 = (class199) this.field1777.method2485(55, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class71 var10 = class71.method603(this.field1770, arg1, arg3);
            if (var10 == null) {
                return null;
            }
            class199 var11 = var10.method602();
            this.field1777.method2486(arg2 ^ 0xFFFF8CEE, var11, var7);
            if (arg0 != null) {
                arg0[0] -= var11.field2908.length;
            }
            return arg2 == 29545 ? var11 : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)V", line = 107)
    public static final void method830(int arg0, byte arg1) {
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        if (arg1 == -111) {
            field1768++;
            class73.field1228 = arg0;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "([IZI)Lbv;", line = 125)
    public final class199 method831(int[] arg0, boolean arg1, int arg2) {
        field1773++;
        if (this.field1770.method658((byte) -124) == 1) {
            return this.method829(arg0, 0, 29545, arg2);
        } else if (!arg1) {
            return null;
        } else if (this.field1770.method656((byte) 122, arg2) == 1) {
            return this.method829(arg0, arg2, 29545, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BLrq;)Z", line = 144)
    public static final boolean method832(byte arg0, class232 arg1) {
        field1778++;
        class510 var2 = class246.field3567.method609(arg0 ^ 0x3A, arg1.method379((byte) -96));
        if (arg0 != 78) {
            return true;
        } else if (var2.field7465 == -1) {
            return true;
        } else {
            class494 var3 = class173.field2651.method1760(false, var2.field7465);
            return var3.field7198 == -1 ? true : var3.method2949(0);
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lhh;Lhh;)V", line = 215)
    public class112(class84 arg0, class84 arg1) {
        this.field1770 = arg0;
        this.field1769 = arg1;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II[I)Lbv;", line = 182)
    public final class199 method833(int arg0, int arg1, int[] arg2) {
        if (arg1 != 8020) {
            this.method829(null, -12, -62, -84);
        }
        field1774++;
        if (this.field1769.method658((byte) 60) == 1) {
            return this.method828(0, arg0, 1879052287, arg2);
        } else if (this.field1769.method656((byte) 122, arg0) == 1) {
            return this.method828(arg0, 0, arg1 + 1879044267, arg2);
        } else {
            throw new RuntimeException();
        }
    }
}
