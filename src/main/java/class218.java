import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class218 {

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public int field3764 = -1;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "Z")
    public boolean field3769 = false;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "[I")
    private int[] field3767 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Loh;")
    public static class258 field3752 = class153.method1046("(U3", 108);

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "Loh;")
    public static class258 field3771 = class153.method1046("::clientjs5drop", 111);

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "Loh;")
    public static class258 field3763 = class153.method1046("Lade Wordpack )2 ", 96);

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field3759 = 1;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "Loh;")
    private static class258 field3776 = class153.method1046("Use", 95);

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "Loh;")
    private static class258 field3774 = class153.method1046(" from your friend list first)3", 99);

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "J")
    public static long field3780 = 0L;

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "Loh;")
    public static class258 field3784 = field3774;

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    public static int field3782 = -1;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "Loh;")
    public static class258 field3770 = field3776;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public static int field3772;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "Lkk;")
    public static class112 field3755;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "[I")
    private int[] field3757;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "[S")
    private short[] field3754;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "[S")
    private short[] field3768;

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "[S")
    private short[] field3781;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "[S")
    private short[] field3783;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)Z", line = 16)
    public final boolean method1473(int arg0) {
        field3762++;
        if (this.field3757 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field3757.length; var3++) {
            if (!class39.field560.method1442(0, this.field3757[var3], -19595)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)Z", line = 42)
    public final boolean method1474(int arg0) {
        int var2 = -110 % ((10 - arg0) / 34);
        boolean var3 = true;
        field3765++;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3767[var4] != -1 && !class39.field560.method1442(0, this.field3767[var4], -19595)) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(III)I", line = 76)
    public static final int method1475(int arg0, int arg1, int arg2) {
        if (arg0 > -78) {
            field3771 = (class258) null;
        }
        field3760++;
        class238 var3 = (class238) class287.field4943.method986((long) arg1, 0);
        if (var3 == null) {
            return -1;
        } else if (arg2 >= 0 && arg2 < var3.field4153.length) {
            return var3.field4153[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZIIB)V", line = 99)
    public static final void method1476(int arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        field3777++;
        class121.field2141 = 0L;
        int var5 = class185.method1253((byte) 122);
        if (arg0 == 3 || var5 == 3) {
            arg1 = true;
        }
        if (class295.field5060.startsWith("mac") && arg0 > 0) {
            arg1 = true;
        }
        if (arg4 != 14) {
            field3763 = (class258) null;
        }
        boolean var6 = false;
        if (var5 <= 0 != arg0 <= 0) {
            var6 = true;
        }
        if (arg1 && arg0 > 0) {
            var6 = true;
        }
        class184.method1249(arg1, arg0, var6, false, arg2, var5, arg3);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lva;BI)V", line = 138)
    private final void method1477(class235 arg0, byte arg1, int arg2) {
        if (arg1 <= 29) {
            method1481(93, -19);
        }
        field3775++;
        if (arg2 == 1) {
            this.field3764 = arg0.method1589(126);
        } else if (arg2 == 2) {
            int var8 = arg0.method1589(74);
            this.field3757 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3757[var9] = arg0.method1615(-122);
            }
        } else if (arg2 == 3) {
            this.field3769 = true;
        } else if (arg2 == 40) {
            int var4 = arg0.method1589(88);
            this.field3783 = new short[var4];
            this.field3781 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3781[var5] = (short) arg0.method1615(-123);
                this.field3783[var5] = (short) arg0.method1615(-16);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method1589(61);
            this.field3754 = new short[var6];
            this.field3768 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3768[var7] = (short) arg0.method1615(-127);
                this.field3754[var7] = (short) arg0.method1615(-123);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field3767[arg2 - 60] = arg0.method1615(-41);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 216)
    public static void method1478(byte arg0) {
        field3752 = null;
        field3784 = null;
        field3755 = null;
        field3774 = null;
        field3776 = null;
        int var1 = 25 / ((-arg0 - 43) / 59);
        field3771 = null;
        field3770 = null;
        field3763 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILva;)V", line = 261)
    public final void method1479(int arg0, class235 arg1) {
        while (true) {
            int var3 = arg1.method1589(87);
            if (var3 == 0) {
                field3761++;
                if (arg0 != -1) {
                    this.field3767 = (int[]) null;
                }
                return;
            }
            this.method1477(arg1, (byte) 41, var3);
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)V", line = 287)
    public static final void method1480(int arg0) {
        field3772++;
        class293.field5039++;
        class159.field2710.method885(arg0, -122);
        class159.field2710.method1598(class185.method1253((byte) 110), 27052);
        class159.field2710.method1605(field3773, (byte) 110);
        class159.field2710.method1605(class42.field577, (byte) 121);
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Loh;", line = 303)
    public static final class258 method1481(int arg0, int arg1) {
        int var2 = -25 % ((arg0) / 41);
        field3758++;
        return class30.method221(-15449, 10, arg1, false);
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)Lka;", line = 323)
    public final class97 method1482(byte arg0) {
        field3779++;
        class97[] var2 = new class97[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3767[var4] != -1) {
                var2[var3++] = class97.method738(class39.field560, this.field3767[var4], 0);
            }
        }
        class97 var5 = new class97(var2, var3);
        if (this.field3781 != null) {
            for (int var6 = 0; var6 < this.field3781.length; var6++) {
                var5.method727(this.field3781[var6], this.field3783[var6]);
            }
        }
        if (this.field3768 != null) {
            for (int var7 = 0; var7 < this.field3768.length; var7++) {
                var5.method736(this.field3768[var7], this.field3754[var7]);
            }
        }
        return arg0 == 78 ? var5 : (class97) null;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)Lka;", line = 394)
    public final class97 method1483(int arg0) {
        field3778++;
        if (this.field3757 == null) {
            return null;
        }
        class97[] var2 = new class97[this.field3757.length];
        int var3 = 0;
        if (arg0 != -9394) {
            field3774 = (class258) null;
        }
        while (this.field3757.length > var3) {
            var2[var3] = class97.method738(class39.field560, this.field3757[var3], 0);
            var3++;
        }
        class97 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class97(var2, var2.length);
        }
        if (this.field3781 != null) {
            for (int var5 = 0; var5 < this.field3781.length; var5++) {
                var4.method727(this.field3781[var5], this.field3783[var5]);
            }
        }
        if (this.field3768 != null) {
            for (int var6 = 0; var6 < this.field3768.length; var6++) {
                var4.method736(this.field3768[var6], this.field3754[var6]);
            }
        }
        return var4;
    }
}
