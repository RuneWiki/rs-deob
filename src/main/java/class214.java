import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class214 {

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "Lcc;")
    private class201 field3756 = new class201();

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Lmb;")
    private class156 field3757 = new class156();

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    private int field3763;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    private int field3759;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Lpa;")
    private class204 field3766;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Ljd;")
    public static class85 field3754 = class221.method1499(" steht bereits auf Ihrer Freunde)2Liste(Q", (byte) 105);

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Z")
    public static boolean field3762 = true;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field3765 = 0;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Lmb;")
    public static class156 field3755 = new class156();

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field3770 = 0;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "[Lvh;")
    public static class260[] field3769 = new class260[500];

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "[[I")
    public static int[][] field3771 = new int[104][104];

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)Lof;")
    public final class253 method1466(byte arg0) {
        if (arg0 > -54) {
            method1470(-118, (byte) -110);
        }
        field3758++;
        return this.field3766.method1392((byte) -120);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)I")
    public static final int method1467(int arg0, int arg1, int arg2) {
        class186 var3 = (class186) class172.field2975.method1398(1, (long) arg1);
        field3753++;
        if (var3 == null) {
            return 0;
        } else if (arg0 >= -97) {
            return -105;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field3191.length; var5++) {
                if (var3.field3198[var5] == arg2) {
                    var4 += var3.field3191[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILcc;J)V")
    public final void method1468(int arg0, class201 arg1, long arg2) {
        if (this.field3759 == arg0) {
            class201 var5 = this.field3757.method1021(arg0 - 96);
            var5.method1753(137);
            var5.method1380(true);
            if (this.field3756 == var5) {
                class201 var6 = this.field3757.method1021(arg0 ^ 0x7C);
                var6.method1753(137);
                var6.method1380(true);
            }
        } else {
            this.field3759--;
        }
        this.field3766.method1393(arg1, arg2, 817);
        field3751++;
        this.field3757.method1025(29642, arg1);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
    public final void method1469(byte arg0) {
        this.field3757.method1029(230);
        this.field3766.method1394((byte) 47);
        field3767++;
        int var2 = 29 % ((arg0 - 10) / 36);
        this.field3756 = new class201();
        this.field3759 = this.field3763;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IB)V")
    public static final void method1470(int arg0, byte arg1) {
        class43 var2 = class168.field2886;
        synchronized (class168.field2886) {
            class198.field3395 = arg0;
            if (arg1 != 26) {
                field3754 = null;
            }
        }
        field3760++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public static void method1471(boolean arg0) {
        field3754 = null;
        if (!arg0) {
            field3762 = true;
        }
        field3771 = null;
        field3755 = null;
        field3769 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(JI)Lcc;")
    public final class201 method1472(long arg0, int arg1) {
        class201 var4 = (class201) this.field3766.method1398(arg1 + 27163, arg0);
        if (var4 != null) {
            this.field3757.method1025(29642, var4);
        }
        if (arg1 != -27162) {
            this.method1469((byte) -70);
        }
        field3768++;
        return var4;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILjd;)Z")
    public static final boolean method1473(int arg0, class85 arg1) {
        field3764++;
        if (arg1 == null) {
            return false;
        }
        int var2 = 0;
        if (arg0 < 13) {
            method1471(true);
        }
        while (class45.field810 > var2) {
            if (arg1.method582(class1.field5[var2], -76)) {
                return true;
            }
            var2++;
        }
        return arg1.method582(class22.field308.field762, -105);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)Lof;")
    public final class253 method1474(int arg0) {
        field3761++;
        if (arg0 <= 81) {
            field3752 = 31;
        }
        return this.field3766.method1399(-122);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I)V")
    public class214(int arg0) {
        this.field3763 = arg0;
        this.field3759 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field3766 = new class204(var2);
    }
}
