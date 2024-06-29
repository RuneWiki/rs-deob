import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class125 extends class90 implements class503 {

    @OriginalMember(owner = "client!op", name = "u", descriptor = "Lfr;")
    public class283 field1862;

    @OriginalMember(owner = "client!op", name = "y", descriptor = "Z")
    private boolean field1866;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "Lo;")
    public static class24 field1858 = new class24(0, 0);

    @OriginalMember(owner = "client!op", name = "n", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!op", name = "p", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!op", name = "v", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!op", name = "w", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!op", name = "x", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!op", name = "z", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!op", name = "A", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!op", name = "B", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!op", name = "C", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!op", name = "D", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!op", name = "E", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!op", name = "F", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!op", name = "H", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(I)Z")
    public final boolean method489(int arg0) {
        int var2 = 20 / ((arg0 - 23) / 62);
        ++field1867;
        return this.field1862.method1680(-1);
    }

    @OriginalMember(owner = "client!op", name = "h", descriptor = "(I)V")
    public final void method495(int arg0) {
        if (arg0 > -104) {
            method865(-6);
        }
        ++field1861;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lya;IZLij;III)V")
    public final void method498(class38 arg0, int arg1, boolean arg2, class291 arg3, int arg4, int arg5, int arg6) {
        ++field1869;
        if (arg6 != -1) {
            field1858 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!op", name = "i", descriptor = "(I)V")
    public static final void method865(int arg0) {
        ++field1859;
        if (arg0 != -17091) {
            field1858 = null;
        }
        if (class183.field2679 != null) {
            class183.field2679.method267(-104);
            class134.field1943 = null;
            class183.field2679 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(ILya;)V")
    public final void method493(int arg0, class38 arg1) {
        ++field1855;
        class471 var3 = this.field1862.method1687((byte) 56, true, true, super.field1309, super.field1307, arg1, 262144);
        if (var3 != null) {
            int var4 = super.field1309 >> 7;
            int var5 = super.field1307 >> 7;
            this.field1862.method1681(false, var5, arg1, var4, var4, var5, var3, (byte) 72);
        }
        if (arg0 >= -114) {
            this.field1862 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "f", descriptor = "(I)Z")
    public final boolean method492(int arg0) {
        if (arg0 != -1) {
            return true;
        } else {
            ++field1872;
            return false;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZILya;I)Z")
    public final boolean method500(boolean arg0, int arg1, class38 arg2, int arg3) {
        ++field1868;
        class471 var5 = this.field1862.method1687((byte) 56, false, false, super.field1309, super.field1307, arg2, 131072);
        if (var5 == null) {
            return false;
        } else if (!arg0) {
            return true;
        } else {
            class122 var6 = arg2.method280();
            var6.method182(super.field1309, super.field1313, super.field1307);
            return var5.method391(arg3, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!op", name = "d", descriptor = "(I)I")
    public final int method490(int arg0) {
        if (arg0 != -29679) {
            return 65;
        } else {
            ++field1857;
            return this.field1862.field3887;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BLya;I)Lt;")
    public final class471 method488(byte arg0, class38 arg1, int arg2) {
        ++field1863;
        if (arg0 != 124) {
            this.field1866 = true;
        }
        return this.field1862.method1687((byte) 56, false, false, 0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(B)V")
    public static void method866(byte arg0) {
        int var1 = -84 / ((7 - arg0) / 44);
        field1858 = null;
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(ILya;)V")
    public final void method486(int arg0, class38 arg1) {
        this.field1862.method1679((byte) -106, arg1);
        ++field1856;
        if (arg0 != 9229) {
            this.method485(8);
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Lya;Ljo;IIIIIZIII)V")
    public class125(class38 arg0, class220 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class449.method2656(arg9, 3, arg8));
        this.field1862 = new class283(arg0, arg1, arg8, arg9, arg2, arg3, super.field1309, super.field1307, arg7, arg10);
        this.field1866 = arg1.field3119 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILya;)V")
    public final void method482(int arg0, class38 arg1) {
        this.field1862.method1688((byte) -124, arg1);
        ++field1873;
        if (arg0 > -56) {
            this.method489(-126);
        }
    }

    @OriginalMember(owner = "client!op", name = "e", descriptor = "(I)I")
    public final int method499(int arg0) {
        if (arg0 != -15561) {
            this.method493(114, (class38) null);
        }
        ++field1864;
        return this.field1862.field3891;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)I")
    public final int method496(int arg0) {
        ++field1871;
        int var2 = 36 % ((arg0 - -4) / 61);
        return this.field1862.field3872;
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V")
    public final void method485(int arg0) {
        if (arg0 > -92) {
            field1874 = -4;
        }
        ++field1865;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lya;B)Lmf;")
    public final class289 method484(class38 arg0, byte arg1) {
        ++field1870;
        class471 var3 = this.field1862.method1687((byte) 56, true, false, super.field1309, super.field1307, arg0, 2048);
        if (var3 == null) {
            return null;
        } else {
            class122 var4 = arg0.method280();
            if (arg1 < 111) {
                return null;
            } else {
                var4.method182(super.field1309, super.field1313, super.field1307);
                class289 var5 = null;
                if (this.field1866) {
                    var5 = class165.method1099(true, 1);
                }
                if (this.field1862.field3874 != null) {
                    class523 var6 = this.field1862.field3874.method1193();
                    arg0.method312(var3, var6, var4, var5 == null ? null : var5.field4009[0], 0);
                } else {
                    var3.method397(var4, var5 == null ? null : var5.field4009[0], 0);
                }
                int var7 = super.field1309 >> 7;
                int var8 = super.field1307 >> 7;
                this.field1862.method1681(true, var8, arg0, var7, var7, var8, var3, (byte) 72);
                return var5;
            }
        }
    }
}
