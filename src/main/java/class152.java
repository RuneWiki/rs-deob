import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class152 {

    @OriginalMember(owner = "client!ufa", name = "m", descriptor = "I")
    private int field1851;

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "I")
    private int field1842;

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "I")
    private int field1841;

    @OriginalMember(owner = "client!ufa", name = "n", descriptor = "I")
    private int field1852;

    @OriginalMember(owner = "client!ufa", name = "g", descriptor = "I")
    public int field1845;

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "I")
    public int field1844;

    @OriginalMember(owner = "client!ufa", name = "j", descriptor = "I")
    public int field1848;

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "I")
    public int field1840;

    @OriginalMember(owner = "client!ufa", name = "i", descriptor = "I")
    public int field1847;

    @OriginalMember(owner = "client!ufa", name = "h", descriptor = "I")
    public int field1846;

    @OriginalMember(owner = "client!ufa", name = "k", descriptor = "Lmq;")
    public static class78 field1849 = new class78(65, 6);

    @OriginalMember(owner = "client!ufa", name = "p", descriptor = "I")
    public static int field1854 = 0;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!ufa", name = "e", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!ufa", name = "l", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!ufa", name = "o", descriptor = "Lvm;")
    public static class208 field1853;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIIIIIIIIII)V", line = 6)
    public final void method942(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field1852 = arg4;
        this.field1842 = arg7;
        field1850++;
        this.field1851 = arg8;
        this.field1841 = arg6 * arg6;
        this.field1846 = this.field1842 + arg2;
        this.field1845 = this.field1852 + arg9;
        this.field1840 = this.field1851 + arg1;
        this.field1847 = this.field1852 + arg5;
        this.field1844 = this.field1851 + arg10;
        if (arg0 <= 98) {
            this.field1841 = -114;
        }
        this.field1848 = this.field1842 + arg3;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Z)V", line = 29)
    public static void method943(boolean arg0) {
        field1853 = null;
        if (arg0) {
            field1849 = null;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(II)Luu;", line = 44)
    public static final class529 method944(int arg0, int arg1) {
        if (arg0 != 11471) {
            method944(63, 107);
        }
        field1839++;
        if (arg1 == 0) {
            return new class306();
        } else if (arg1 == 1) {
            return new class449();
        } else if (arg1 == 2) {
            return new class71();
        } else if (arg1 == 3) {
            return new class738();
        } else if (arg1 == 4) {
            return new class252();
        } else if (arg1 == 5) {
            return new class387();
        } else if (arg1 == 6) {
            return new class540();
        } else if (arg1 == 7) {
            return new class123();
        } else if (arg1 == 8) {
            return new class689();
        } else if (arg1 == 9) {
            return new class480();
        } else if (arg1 == 10) {
            return new class503();
        } else if (arg1 == 11) {
            return new class265();
        } else if (arg1 == 12) {
            return new class31();
        } else if (arg1 == 13) {
            return new class274();
        } else if (arg1 == 14) {
            return new class437();
        } else if (arg1 == 15) {
            return new class558();
        } else if (arg1 == 16) {
            return new class14();
        } else if (arg1 == 17) {
            return new class541();
        } else if (arg1 == 18) {
            return new class484();
        } else if (arg1 == 19) {
            return new class298();
        } else if (arg1 == 20) {
            return new class626();
        } else if (arg1 == 21) {
            return new class537();
        } else if (arg1 == 22) {
            return new class335();
        } else if (arg1 == 23) {
            return new class83();
        } else if (arg1 == 24) {
            return new class589();
        } else if (arg1 == 25) {
            return new class245();
        } else if (arg1 == 26) {
            return new class706();
        } else if (arg1 == 27) {
            return new class159();
        } else if (arg1 == 28) {
            return new class186();
        } else if (arg1 == 29) {
            return new class674();
        } else if (arg1 == 30) {
            return new class244();
        } else if (arg1 == 31) {
            return new class704();
        } else if (arg1 == 32) {
            return new class730();
        } else if (arg1 == 33) {
            return new class538();
        } else if (arg1 == 34) {
            return new class703();
        } else if (arg1 == 35) {
            return new class527();
        } else if (arg1 == 36) {
            return new class443();
        } else if (arg1 == 37) {
            return new class516();
        } else if (arg1 == 38) {
            return new class488();
        } else if (arg1 == 39) {
            return new class625();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 370)
    public class152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field1851 = arg1;
        this.field1842 = arg2;
        this.field1841 = arg3 * arg3;
        this.field1852 = arg0;
        this.field1845 = this.field1852 + arg4;
        this.field1844 = this.field1851 + arg6;
        this.field1848 = this.field1842 + arg8;
        this.field1840 = this.field1851 + arg7;
        this.field1847 = this.field1852 + arg5;
        this.field1846 = this.field1842 + arg9;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIII)Z", line = 389)
    public final boolean method945(int arg0, int arg1, int arg2, int arg3) {
        field1843++;
        if (arg3 < this.field1845 || arg3 > this.field1847) {
            return false;
        } else if (arg0 < this.field1844 || this.field1840 < arg0) {
            return false;
        } else if (this.field1848 <= arg1 && this.field1846 >= arg1) {
            int var5 = arg3 - this.field1852;
            int var6 = arg1 - this.field1842;
            if (arg2 > -120) {
                this.method942(-93, 13, 63, 82, 81, -115, -93, -3, 126, 58, -48);
            }
            return this.field1841 > (var5 * var5 + (var6 * var6));
        } else {
            return false;
        }
    }
}
