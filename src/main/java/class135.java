import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class135 extends class391 implements class339 {

    @OriginalMember(owner = "client!qaa", name = "hb", descriptor = "Z")
    private boolean field1771 = false;

    @OriginalMember(owner = "client!qaa", name = "H", descriptor = "Lrea;")
    public class567 field1747;

    @OriginalMember(owner = "client!qaa", name = "eb", descriptor = "Z")
    private boolean field1768;

    @OriginalMember(owner = "client!qaa", name = "O", descriptor = "Z")
    public static boolean field1753 = false;

    @OriginalMember(owner = "client!qaa", name = "T", descriptor = "I")
    public static int field1758 = 0;

    @OriginalMember(owner = "client!qaa", name = "gb", descriptor = "I")
    public static int field1770 = 0;

    @OriginalMember(owner = "client!qaa", name = "V", descriptor = "Lwp;")
    public static class453 field1759 = new class453(52, 1);

    @OriginalMember(owner = "client!qaa", name = "C", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!qaa", name = "J", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!qaa", name = "K", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!qaa", name = "L", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!qaa", name = "N", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!qaa", name = "P", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!qaa", name = "Q", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!qaa", name = "R", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!qaa", name = "S", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!qaa", name = "W", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!qaa", name = "X", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!qaa", name = "Y", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!qaa", name = "Z", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!qaa", name = "ab", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!qaa", name = "bb", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!qaa", name = "cb", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!qaa", name = "db", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!qaa", name = "fb", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!qaa", name = "ib", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!qaa", name = "jb", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!qaa", name = "kb", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!qaa", name = "M", descriptor = "Lsd;")
    private class362 field1751;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lr;I)Lsd;", line = 4)
    public final class362 method82(class566 arg0, int arg1) {
        ++field1752;
        if (arg1 != -1660704056) {
            this.method73(false, (class566) null);
        }
        return this.field1751;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(BLr;)V", line = 15)
    public final void method70(byte arg0, class566 arg1) {
        this.field1747.method3120((byte) 107, arg1);
        int var3 = 53 / ((arg0 - -19) / 34);
        ++field1773;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Z)V", line = 25)
    public final void method81(boolean arg0) {
        ++field1766;
        if (arg0) {
            field1755 = 30;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "j", descriptor = "(I)V", line = 39)
    public static void method781(int arg0) {
        if (arg0 > -79) {
            field1759 = null;
        }
        field1759 = null;
    }

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(II)V", line = 50)
    public static final void method782(int arg0, int arg1) {
        class450 var2 = class199.field2526;
        synchronized (class199.field2526) {
            class199.field2526.method2411(true, arg0);
            int var3 = 95 / ((-14 - arg1) / 59);
        }
        ++field1748;
    }

    @OriginalMember(owner = "client!qaa", name = "g", descriptor = "(B)Z", line = 64)
    public final boolean method68(byte arg0) {
        if (arg0 < 114) {
            return false;
        } else {
            ++field1761;
            return false;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZIBLr;Llo;II)V", line = 75)
    public final void method77(boolean arg0, int arg1, byte arg2, class566 arg3, class488 arg4, int arg5, int arg6) {
        ++field1756;
        int var8 = -89 % ((-50 - arg2) / 55);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lr;Lbda;IIIIIZII)V", line = 85)
    public class135(class566 arg0, class441 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field5508);
        this.field1747 = new class567(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field1768 = arg1.field5560 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)Z", line = 95)
    public final boolean method64(int arg0) {
        if (arg0 != 3755) {
            return false;
        } else {
            ++field1769;
            return this.field1747.method3126(0);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(ZLr;)V", line = 106)
    public final void method67(boolean arg0, class566 arg1) {
        ++field1746;
        class474 var3 = this.field1747.method3130(true, super.field6461, arg1, true, true, super.field6464, 262144);
        if (var3 != null) {
            int var4 = super.field6461 >> 9;
            int var5 = super.field6464 >> 9;
            class491 var6 = arg1.method995();
            var6.method914(super.field6461, super.field6458, super.field6464);
            this.field1747.method3129(var3, var4, arg1, var5, false, var4, var5, 87, var6);
        }
        if (arg0) {
            this.method83((byte) 37);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(B)I", line = 130)
    public final int method65(byte arg0) {
        ++field1772;
        return arg0 <= 126 ? 119 : this.field1747.field7927;
    }

    @OriginalMember(owner = "client!qaa", name = "d", descriptor = "(I)V", line = 144)
    public final void method66(int arg0) {
        ++field1760;
        if (arg0 == -1) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!qaa", name = "g", descriptor = "(I)I", line = 158)
    public final int method71(int arg0) {
        int var2 = -47 % ((-43 - arg0) / 59);
        ++field1767;
        return this.field1747.method3131((byte) -99);
    }

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "(B)I", line = 169)
    public final int method78(byte arg0) {
        int var2 = -42 / ((12 - arg0) / 48);
        ++field1764;
        return this.field1747.field7940;
    }

    @OriginalMember(owner = "client!qaa", name = "h", descriptor = "(B)Z", line = 183)
    public final boolean method79(byte arg0) {
        ++field1754;
        return arg0 > -26;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(CI)Z", line = 194)
    public static final boolean method783(char arg0, int arg1) {
        ++field1774;
        if (arg1 != 20454) {
            method781(-37);
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "(I)I", line = 211)
    public final int method72(int arg0) {
        ++field1750;
        if (arg0 != -22496) {
            this.method82((class566) null, -118);
        }
        return this.field1747.method3128(28110);
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IILr;I)Z", line = 222)
    public final boolean method75(int arg0, int arg1, class566 arg2, int arg3) {
        if (arg3 != 9678) {
            this.method64(97);
        }
        ++field1749;
        class474 var5 = this.field1747.method3130(true, super.field6461, arg2, false, false, super.field6464, 131072);
        if (var5 == null) {
            return false;
        } else {
            class491 var6 = arg2.method995();
            var6.method914(super.field6461, super.field6458, super.field6464);
            return !class36.field498 ? var5.method744(arg0, arg1, var6, false) : var5.method738(arg0, arg1, var6, false, class432.field5406);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(B)I", line = 244)
    public final int method74(byte arg0) {
        ++field1757;
        return arg0 != 42 ? -6 : this.field1747.field7925;
    }

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(BLr;)V", line = 256)
    public final void method80(byte arg0, class566 arg1) {
        this.field1747.method3123(arg0 + 116, arg1);
        ++field1762;
        if (arg0 != -114) {
            this.method79((byte) 54);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZLr;)Log;", line = 267)
    public final class101 method73(boolean arg0, class566 arg1) {
        ++field1763;
        class474 var3 = this.field1747.method3130(!arg0, super.field6461, arg1, true, arg0, super.field6464, 2048);
        if (var3 == null) {
            return null;
        } else {
            class491 var4 = arg1.method995();
            var4.method914(super.field6461, super.field6458, super.field6464);
            class101 var5 = null;
            if (this.field1768) {
                var5 = class676.method3794(true, 1);
            }
            int var6 = super.field6461 >> 9;
            int var7 = super.field6464 >> 9;
            this.field1747.method3129(var3, var6, arg1, var7, true, var6, var7, 106, var4);
            if (class36.field498) {
                var3.method751(var4, var5 == null ? null : var5.field1361[0], class432.field5406, 0);
            } else {
                var3.method717(var4, var5 == null ? null : var5.field1361[0], 0);
            }
            if (this.field1747.field7939 != null) {
                class27 var8 = this.field1747.field7939.method545();
                if (!class36.field498) {
                    arg1.method993(var8);
                } else {
                    arg1.method999(var8, class432.field5406);
                }
            }
            this.field1771 = var3.method740() || this.field1747.field7939 != null;
            if (this.field1751 == null) {
                this.field1751 = class286.method1606(-24294, super.field6458, var3, super.field6464, super.field6461);
            } else {
                class227.method1360(var3, super.field6461, this.field1751, super.field6458, super.field6464, 26219);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "e", descriptor = "(B)Z", line = 327)
    public final boolean method83(byte arg0) {
        if (arg0 != 23) {
            this.field1751 = null;
        }
        ++field1765;
        return this.field1771;
    }
}
