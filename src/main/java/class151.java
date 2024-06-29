import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class151 {

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "Lbd;")
    public static class162 field2695 = class17.method142(0, "titlebg");

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "Lbd;")
    public static class162 field2694 = class17.method142(0, ")3");

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "Lbd;")
    public static class162 field2704 = class17.method142(0, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "Lbd;")
    public static class162 field2702 = class17.method142(0, "<col=00ff80>");

    @OriginalMember(owner = "client!jm", name = "p", descriptor = "Lbd;")
    private static class162 field2706 = class17.method142(0, "Loaded world list data");

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "[I")
    public static int[] field2692 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "Lbd;")
    public static class162 field2703 = field2706;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "J")
    public long field2701;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Lda;")
    public static class143 field2693;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "Ljm;")
    public class151 field2691;

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "Ljm;")
    public class151 field2707;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1181(boolean arg0) {
        field2703 = null;
        if (arg0) {
            field2702 = (class162) null;
        }
        field2692 = null;
        field2694 = null;
        field2693 = null;
        field2706 = null;
        field2695 = null;
        field2702 = null;
        field2704 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)[Ldc;", line = 32)
    public static final class71[] method1182(byte arg0) {
        field2698++;
        class71[] var1 = new class71[class129.field2334];
        for (int var2 = 0; var2 < class129.field2334; var2++) {
            int var3 = class260.field4333[var2] * class190.field3253[var2];
            byte[] var4 = class317.field5350[var2];
            if (class120.field2194[var2]) {
                byte[] var5 = class101.field1848[var2];
                int[] var6 = new int[var3];
                for (int var7 = 0; var7 < var3; var7++) {
                    var6[var7] = class289.method2005(class306.field5152[class92.method695(var4[var7], 255)], class92.method695(-16777216, var5[var7] << 24));
                }
                if (class117.field2159) {
                    var1[var2] = new class150(class238.field3962, class277.field4637, class127.field2312[var2], class40.field646[var2], class190.field3253[var2], class260.field4333[var2], var6);
                } else {
                    var1[var2] = new class232(class238.field3962, class277.field4637, class127.field2312[var2], class40.field646[var2], class190.field3253[var2], class260.field4333[var2], var6);
                }
            } else {
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class306.field5152[class92.method695(255, var4[var9])];
                }
                if (class117.field2159) {
                    var1[var2] = new class140(class238.field3962, class277.field4637, class127.field2312[var2], class40.field646[var2], class190.field3253[var2], class260.field4333[var2], var8);
                } else {
                    var1[var2] = new class79(class238.field3962, class277.field4637, class127.field2312[var2], class40.field646[var2], class190.field3253[var2], class260.field4333[var2], var8);
                }
            }
        }
        class247.method1738(-125);
        if (arg0 >= -114) {
            field2705 = 32;
        }
        return var1;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(Z)V", line = 101)
    public final void method1183(boolean arg0) {
        field2699++;
        if (this.field2691 == null) {
            return;
        }
        this.field2691.field2707 = this.field2707;
        this.field2707.field2691 = this.field2691;
        this.field2691 = null;
        if (arg0) {
            method1186((short[]) null, -81, (class162[]) null);
        }
        this.field2707 = null;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIII)I", line = 121)
    public static final int method1184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg1 & 0x3;
        field2700++;
        if ((arg2 & 0x1) == 1) {
            int var8 = arg3;
            arg3 = arg0;
            arg0 = var8;
        }
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return 1 - (arg3 - (7 - arg5));
        } else {
            if (arg4 < 43) {
                method1184(-48, 92, 46, 100, 41, -55, 34);
            }
            return var7 == 2 ? 1 + 7 - arg6 - arg0 : arg5;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(B)Z", line = 156)
    public final boolean method1185(byte arg0) {
        field2696++;
        if (this.field2691 == null) {
            return false;
        } else {
            if (arg0 >= -14) {
                method1184(-18, 26, -40, 11, -82, 4, -105);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "([SI[Lbd;)V", line = 196)
    public static final void method1186(short[] arg0, int arg1, class162[] arg2) {
        class131.method1046(arg2.length - 1, arg2, true, 0, arg0);
        if (arg1 != 1) {
            field2703 = (class162) null;
        }
        field2697++;
    }
}
