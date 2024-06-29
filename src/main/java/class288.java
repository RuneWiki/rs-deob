import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class288 {

    @OriginalMember(owner = "client!wp", name = "r", descriptor = "Lgj;")
    private class62 field3802 = new class62();

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "F")
    public static float field3792 = 0.0F;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    public static int field3789 = 0;

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "Lih;")
    public static class108 field3791 = new class108(64);

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!wp", name = "m", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!wp", name = "o", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!wp", name = "q", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "Lwo;")
    public static class285 field3786;

    @OriginalMember(owner = "client!wp", name = "s", descriptor = "Lgj;")
    private class62 field3803;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lgj;I)V")
    public final void method1833(class62 arg0, int arg1) {
        field3795++;
        if (arg1 != 10209) {
            field3789 = -29;
        }
        if (arg0.field762 != null) {
            arg0.method358(arg1 ^ 0x27CB);
        }
        arg0.field762 = this.field3802.field762;
        arg0.field761 = this.field3802;
        arg0.field762.field761 = arg0;
        arg0.field761.field762 = arg0;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(B)Lgj;")
    public final class62 method1834(byte arg0) {
        if (arg0 < 8) {
            this.field3802 = null;
        }
        field3794++;
        class62 var2 = this.field3803;
        if (this.field3802 == var2) {
            this.field3803 = null;
            return null;
        } else {
            this.field3803 = var2.field761;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)Lgj;")
    public final class62 method1835(int arg0) {
        field3787++;
        if (arg0 != 64) {
            return null;
        }
        class62 var2 = this.field3802.field762;
        if (this.field3802 == var2) {
            this.field3803 = null;
            return null;
        } else {
            this.field3803 = var2.field762;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)Z")
    public final boolean method1836(int arg0) {
        field3788++;
        if (arg0 >= -14) {
            field3786 = null;
        }
        return this.field3802.field761 == this.field3802;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Ljava/lang/String;IC)I")
    public static final int method1837(String arg0, int arg1, char arg2) {
        field3798++;
        int var3 = 0;
        if (arg1 != -1117372769) {
            return 47;
        }
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0.charAt(var5) == arg2) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "(I)Lgj;")
    public final class62 method1838(int arg0) {
        if (arg0 != -6325) {
            field3791 = null;
        }
        field3796++;
        class62 var2 = this.field3802.field761;
        if (this.field3802 == var2) {
            this.field3803 = null;
            return null;
        } else {
            this.field3803 = var2.field761;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILna;)Z")
    public static final boolean method1839(int arg0, class222 arg1) {
        field3799++;
        if (arg1 == null) {
            return false;
        } else if (arg1.field2760) {
            if (arg0 != 64) {
                method1841(-122);
            }
            if (!arg1.method1345((byte) 55)) {
                return false;
            } else if (class153.field1780.method2218(1, (long) arg1.field2772) == null) {
                return class355.field4822.method2218(1, (long) arg1.field2784) == null;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(III)I")
    public static final int method1840(int arg0, int arg1, int arg2) {
        field3785++;
        int var3 = arg0 + arg1 & arg2 >> 31;
        return (arg2 + (arg2 >>> 31)) % arg0 + var3;
    }

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "(I)V")
    public static void method1841(int arg0) {
        int var1 = 26 % ((-arg0 - 28) / 46);
        field3791 = null;
        field3786 = null;
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(B)I")
    public final int method1842(byte arg0) {
        field3800++;
        int var2 = 0;
        for (class62 var3 = this.field3802.field761; var3 != this.field3802; var3 = var3.field761) {
            var2++;
        }
        if (arg0 <= 87) {
            this.method1836(-39);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "(I)V")
    public final void method1843(int arg0) {
        field3801++;
        while (true) {
            class62 var2 = this.field3802.field761;
            if (this.field3802 == var2) {
                if (arg0 == 64) {
                    this.field3803 = null;
                    return;
                } else {
                    return;
                }
            }
            var2.method358(42);
        }
    }

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "(I)Lgj;")
    public final class62 method1844(int arg0) {
        field3793++;
        if (arg0 != 0) {
            method1841(81);
        }
        class62 var2 = this.field3802.field761;
        if (this.field3802 == var2) {
            return null;
        } else {
            var2.method358(42);
            return var2;
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
    public class288() {
        this.field3802.field761 = this.field3802;
        this.field3802.field762 = this.field3802;
    }
}
