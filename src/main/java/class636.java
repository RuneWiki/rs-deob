import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class636 extends class142 implements class289 {

    @OriginalMember(owner = "client!qm", name = "B", descriptor = "Z")
    private boolean field8681;

    @OriginalMember(owner = "client!qm", name = "N", descriptor = "Z")
    private boolean field8693;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "B")
    private byte field8669;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "B")
    private byte field8671;

    @OriginalMember(owner = "client!qm", name = "L", descriptor = "B")
    private byte field8691;

    @OriginalMember(owner = "client!qm", name = "K", descriptor = "Z")
    private boolean field8690;

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "S")
    private short field8677;

    @OriginalMember(owner = "client!qm", name = "O", descriptor = "Z")
    private boolean field8694;

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "Lba;")
    public class629 field8678;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "Lw;")
    private class451 field8673;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "J")
    public static long field8670 = 0L;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public static int field8666;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field8667;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public static int field8668;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public static int field8672;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
    public static int field8674;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
    public static int field8675;

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "I")
    public static int field8676;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
    public static int field8679;

    @OriginalMember(owner = "client!qm", name = "A", descriptor = "I")
    public static int field8680;

    @OriginalMember(owner = "client!qm", name = "C", descriptor = "I")
    public static int field8682;

    @OriginalMember(owner = "client!qm", name = "D", descriptor = "I")
    public static int field8683;

    @OriginalMember(owner = "client!qm", name = "E", descriptor = "I")
    public static int field8684;

    @OriginalMember(owner = "client!qm", name = "F", descriptor = "I")
    public static int field8685;

    @OriginalMember(owner = "client!qm", name = "G", descriptor = "I")
    public static int field8686;

    @OriginalMember(owner = "client!qm", name = "H", descriptor = "I")
    public static int field8687;

    @OriginalMember(owner = "client!qm", name = "I", descriptor = "I")
    public static int field8688;

    @OriginalMember(owner = "client!qm", name = "M", descriptor = "I")
    public static int field8692;

    @OriginalMember(owner = "client!qm", name = "J", descriptor = "Lvg;")
    private class162 field8689;

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Loa;Luca;IIIIZIIZ)V", line = 3)
    public class636(class689 arg0, class252 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class293.method1739(arg8, arg7, 84));
        this.field8681 = ~arg1.field3453 != -1 && !arg6;
        this.field8693 = arg6;
        super.field1803 = arg5;
        this.field8669 = (byte) arg2;
        this.field8671 = (byte) arg7;
        this.field8691 = (byte) arg8;
        this.field8690 = arg9;
        super.field1805 = arg3;
        this.field8677 = (short) arg1.field3456;
        this.field8694 = arg0.method1976() && arg1.field3413 && !this.field8693 && ~class72.field935.method2693(class161.field2038, (byte) 91) != -1;
        int var11 = 2048;
        if (this.field8690) {
            var11 |= 65536;
        }
        class72 var12 = this.method3468(var11, false, arg0, this.field8694);
        if (var12 != null) {
            this.field8678 = var12.field934;
            this.field8673 = var12.field932;
            if (this.field8690) {
                this.field8678 = this.field8678.method659((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)I", line = 41)
    public final int method130(int arg0) {
        ++field8667;
        return arg0 != -5582 ? -71 : 65535 & this.field8677;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(BLoa;)V", line = 54)
    public final void method123(byte arg0, class689 arg1) {
        if (arg0 < 91) {
            this.field8673 = null;
        }
        ++field8684;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)I", line = 65)
    public final int method126(int arg0) {
        if (arg0 != 20377) {
            return -103;
        } else {
            ++field8674;
            return this.field8691;
        }
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)Z", line = 77)
    public final boolean method135(int arg0) {
        if (arg0 != 0) {
            this.field8677 = -28;
        }
        ++field8682;
        return this.field8690;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)I", line = 92)
    public final int method128(byte arg0) {
        if (arg0 <= 35) {
            return -86;
        } else {
            ++field8692;
            return this.field8671;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(ILoa;)V", line = 103)
    public final void method129(int arg0, class689 arg1) {
        ++field8687;
        Object var3 = null;
        if (arg0 != 27921) {
            this.method133((class631) null, 112, (class689) null, -39, 6, 27, true);
        }
        class451 var5;
        if (this.field8673 == null && this.field8694) {
            class72 var4 = this.method3468(262144, false, arg1, true);
            var5 = var4 != null ? var4.field932 : null;
        } else {
            var5 = this.field8673;
            this.field8673 = null;
        }
        if (var5 != null) {
            class105.method564(var5, this.field8669, super.field1805, super.field1803, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILoa;)Lba;", line = 130)
    public final class629 method124(int arg0, int arg1, class689 arg2) {
        ++field8666;
        if (arg1 != 17925) {
            this.method132(false);
        }
        return this.method3467(arg0, arg2, (byte) -87);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILoa;B)Lba;", line = 145)
    private final class629 method3467(int arg0, class689 arg1, byte arg2) {
        if (arg2 >= -29) {
            this.field8689 = null;
        }
        ++field8672;
        if (this.field8678 != null && arg1.method2007(this.field8678.method688(), arg0) == 0) {
            return this.field8678;
        } else {
            class72 var4 = this.method3468(arg0, false, arg1, false);
            return var4 != null ? var4.field934 : null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZLoa;Z)Ltaa;", line = 166)
    private final class72 method3468(int arg0, boolean arg1, class689 arg2, boolean arg3) {
        if (arg1) {
            this.method126(-106);
        }
        ++field8668;
        class252 var5 = class578.field7980.method1746(65535 & this.field8677, (byte) 123);
        class176 var6;
        class176 var7;
        if (this.field8693) {
            var6 = class249.field3345[0];
            var7 = class185.field2270[this.field8669];
        } else {
            if (this.field8669 >= 3) {
                var6 = null;
            } else {
                var6 = class249.field3345[this.field8669 + 1];
            }
            var7 = class249.field3345[this.field8669];
        }
        return var5.method1564(var7, this.field8671, super.field1805, this.field8691, 31302, arg2, super.field1803, arg3, super.field1804, var6, arg0);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIILoa;)Z", line = 197)
    public final boolean method137(int arg0, int arg1, int arg2, class689 arg3) {
        if (arg2 < 117) {
            return false;
        } else {
            ++field8679;
            class629 var5 = this.method3467(131072, arg3, (byte) -96);
            if (var5 != null) {
                class111 var6 = arg3.method1972();
                var6.method609(super.field1805, super.field1804, super.field1803);
                return var5.method695(arg0, arg1, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(Z)V", line = 220)
    public final void method132(boolean arg0) {
        if (this.field8678 != null) {
            this.field8678.method647();
        }
        ++field8683;
        if (!arg0) {
            this.method3468(3, false, (class689) null, false);
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V", line = 234)
    public final void method127(int arg0) {
        this.field8690 = false;
        ++field8675;
        if (this.field8678 != null) {
            this.field8678.method655(this.field8678.method688() & -65537);
        }
        if (arg0 <= 118) {
            this.method137(73, -53, 18, (class689) null);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lbo;ILoa;IIIZ)V", line = 251)
    public final void method133(class631 arg0, int arg1, class689 arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (!(arg0 instanceof class636)) {
            if (arg0 instanceof class592) {
                class592 var8 = (class592) arg0;
                if (this.field8678 != null && var8.field8124 != null) {
                    this.field8678.method646(var8.field8124, arg3, arg1, arg5, arg6);
                }
            }
        } else {
            class636 var9 = (class636) arg0;
            if (this.field8678 != null && var9.field8678 != null) {
                this.field8678.method646(var9.field8678, arg3, arg1, arg5, arg6);
            }
        }
        if (arg4 != -8763) {
            this.method132(false);
        }
        ++field8685;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)Z", line = 283)
    public final boolean method122(boolean arg0) {
        ++field8680;
        return arg0 ? true : this.field8694;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Loa;B)Llt;", line = 299)
    public final class95 method136(class689 arg0, byte arg1) {
        ++field8676;
        if (this.field8678 == null) {
            return null;
        } else {
            class111 var3 = arg0.method1972();
            var3.method609(super.field1805, super.field1804, super.field1803);
            class95 var4 = null;
            if (this.field8681) {
                var4 = class429.method2472(1, (byte) -101);
            }
            if (arg1 >= -47) {
                this.method134((byte) 124, (class689) null);
            }
            this.field8678.method665(var3, var4 == null ? null : var4.field1175[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLoa;)Lvg;", line = 328)
    public final class162 method134(byte arg0, class689 arg1) {
        if (arg0 <= 121) {
            this.field8689 = null;
        }
        if (this.field8689 == null) {
            this.field8689 = class440.method2525(255, this.method3467(0, arg1, (byte) -43), super.field1805, super.field1804, super.field1803);
        }
        ++field8688;
        return this.field8689;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILoa;)V", line = 346)
    public final void method131(int arg0, class689 arg1) {
        ++field8686;
        if (arg0 == -20929) {
            Object var3 = null;
            class451 var5;
            if (this.field8673 == null && this.field8694) {
                class72 var4 = this.method3468(262144, false, arg1, true);
                var5 = var4 != null ? var4.field932 : null;
            } else {
                var5 = this.field8673;
                this.field8673 = null;
            }
            if (var5 != null) {
                class477.method2673(var5, this.field8669, super.field1805, super.field1803, (boolean[]) null);
            }
        }
    }
}
