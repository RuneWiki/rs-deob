import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class622 extends class172 {

    @OriginalMember(owner = "client!od", name = "P", descriptor = "I")
    private int field8680 = 0;

    @OriginalMember(owner = "client!od", name = "Z", descriptor = "I")
    private int field8690 = 0;

    @OriginalMember(owner = "client!od", name = "cb", descriptor = "I")
    private int field8693 = 0;

    @OriginalMember(owner = "client!od", name = "hb", descriptor = "I")
    private int field8698 = -1;

    @OriginalMember(owner = "client!od", name = "mb", descriptor = "I")
    private int field8703 = 0;

    @OriginalMember(owner = "client!od", name = "nb", descriptor = "I")
    private int field8704 = 0;

    @OriginalMember(owner = "client!od", name = "rb", descriptor = "Z")
    public boolean field8708 = false;

    @OriginalMember(owner = "client!od", name = "db", descriptor = "Z")
    private boolean field8694 = false;

    @OriginalMember(owner = "client!od", name = "ib", descriptor = "I")
    public int field8699;

    @OriginalMember(owner = "client!od", name = "bb", descriptor = "I")
    private int field8692;

    @OriginalMember(owner = "client!od", name = "O", descriptor = "Ldr;")
    private class395 field8679;

    @OriginalMember(owner = "client!od", name = "S", descriptor = "Lrga;")
    public static class280 field8683 = new class280(65, -1);

    @OriginalMember(owner = "client!od", name = "ab", descriptor = "Lwp;")
    public static class453 field8691 = new class453(84, 11);

    @OriginalMember(owner = "client!od", name = "K", descriptor = "I")
    public static int field8675;

    @OriginalMember(owner = "client!od", name = "L", descriptor = "I")
    public static int field8676;

    @OriginalMember(owner = "client!od", name = "M", descriptor = "I")
    public static int field8677;

    @OriginalMember(owner = "client!od", name = "N", descriptor = "I")
    public static int field8678;

    @OriginalMember(owner = "client!od", name = "Q", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    public static int field8682;

    @OriginalMember(owner = "client!od", name = "T", descriptor = "I")
    public static int field8684;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "I")
    public static int field8685;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "I")
    public static int field8686;

    @OriginalMember(owner = "client!od", name = "W", descriptor = "I")
    public static int field8687;

    @OriginalMember(owner = "client!od", name = "X", descriptor = "I")
    public static int field8688;

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "I")
    public static int field8689;

    @OriginalMember(owner = "client!od", name = "eb", descriptor = "I")
    public static int field8695;

    @OriginalMember(owner = "client!od", name = "fb", descriptor = "I")
    public static int field8696;

    @OriginalMember(owner = "client!od", name = "jb", descriptor = "I")
    public static int field8700;

    @OriginalMember(owner = "client!od", name = "kb", descriptor = "I")
    public static int field8701;

    @OriginalMember(owner = "client!od", name = "lb", descriptor = "I")
    public static int field8702;

    @OriginalMember(owner = "client!od", name = "pb", descriptor = "I")
    public static int field8706;

    @OriginalMember(owner = "client!od", name = "qb", descriptor = "I")
    public static int field8707;

    @OriginalMember(owner = "client!od", name = "tb", descriptor = "I")
    public static int field8710;

    @OriginalMember(owner = "client!od", name = "sb", descriptor = "Lpl;")
    public static class612 field8709;

    @OriginalMember(owner = "client!od", name = "gb", descriptor = "Ltq;")
    private class93 field8697;

    @OriginalMember(owner = "client!od", name = "ob", descriptor = "[Lf;")
    public static class536[] field8705;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "(I)I")
    public final int method71(int arg0) {
        int var2 = 98 / ((-43 - arg0) / 59);
        ++field8701;
        return this.field8693;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
    public final void method3407(int arg0, int arg1) {
        ++field8684;
        if (!this.field8708) {
            this.field8690 += arg1;
            if (arg0 != 0) {
                field8709 = null;
            }
            while (~this.field8679.field4991[this.field8680] > ~this.field8690) {
                this.field8690 -= this.field8679.field4991[this.field8680];
                ++this.field8680;
                if (~this.field8679.field4979.length >= ~this.field8680) {
                    this.field8708 = true;
                    break;
                }
            }
            if (!this.field8708) {
                class192.method1159(super.field6470, this.field8679, super.field6461, super.field6464, 83, this.field8680, false);
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIBLr;Llo;II)V")
    public final void method77(boolean arg0, int arg1, byte arg2, class566 arg3, class488 arg4, int arg5, int arg6) {
        ++field8682;
        int var8 = -55 % ((arg2 - -50) / 55);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!od", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field8678;
        if (this.field8697 != null) {
            this.field8697.method543();
        }
    }

    @OriginalMember(owner = "client!od", name = "h", descriptor = "(B)Z")
    public final boolean method79(byte arg0) {
        ++field8702;
        return arg0 >= -26;
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)I")
    public final int method72(int arg0) {
        ++field8700;
        if (arg0 != -22496) {
            this.method79((byte) 47);
        }
        return this.field8704;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Z)V")
    public final void method3408(boolean arg0) {
        if (!arg0) {
            field8691 = null;
        }
        if (this.field8697 != null) {
            this.field8697.method543();
        }
        ++field8677;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIILr;)Lda;")
    private final class474 method3409(int arg0, int arg1, int arg2, class566 arg3) {
        ++field8681;
        class388 var5 = class370.field4686.method3943((byte) 12, arg0);
        class272 var6 = class256.field3127[super.field6470];
        class272 var7 = ~super.field6456 <= -4 ? null : class256.field3127[super.field6456 + 1];
        if (arg2 != 22209) {
            this.method83((byte) -63);
        }
        return this.field8708 ? var5.method2087(super.field6461, arg1, -1, super.field6458, (byte) 0, var6, -1, true, var7, 0, arg3, class583.field8149, super.field6464) : var5.method2087(super.field6461, arg1, this.field8698, super.field6458, (byte) 0, var6, this.field8680, true, var7, this.field8690, arg3, class583.field8149, super.field6464);
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(B)Z")
    public final boolean method83(byte arg0) {
        ++field8675;
        return arg0 != 23 ? true : this.field8694;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method3410(int arg0) {
        field8705 = null;
        field8683 = null;
        if (arg0 == 0) {
            field8691 = null;
            field8709 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "g", descriptor = "(B)Z")
    public final boolean method68(byte arg0) {
        ++field8688;
        if (arg0 < 114) {
            this.method3411((class491) null, (class474) null, (byte) -25, (class566) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLr;)Log;")
    public final class101 method73(boolean arg0, class566 arg1) {
        ++field8686;
        class474 var3 = this.method3409(this.field8692, (this.field8703 != 0 ? 5 : 0) | 2048, 22209, arg1);
        if (var3 == null) {
            return null;
        } else {
            if (arg0) {
                this.finalize();
            }
            if (this.field8703 != 0) {
                var3.method722(this.field8703 * 2048);
            }
            class491 var4 = arg1.method995();
            var4.method914(super.field6461, super.field6458, super.field6464);
            this.method3411(var4, var3, (byte) 94, arg1);
            if (!class36.field498) {
                var3.method717(var4, (class151) null, 0);
            } else {
                var3.method751(var4, (class151) null, class432.field5406, 0);
            }
            if (this.field8697 != null) {
                class27 var5 = this.field8697.method545();
                if (!class36.field498) {
                    arg1.method993(var5);
                } else {
                    arg1.method999(var5, class432.field5406);
                }
            }
            this.field8694 = var3.method740();
            this.field8693 = var3.method757();
            this.field8704 = var3.method704();
            return null;
        }
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V")
    public final void method66(int arg0) {
        if (arg0 != -1) {
            this.method3411((class491) null, (class474) null, (byte) -18, (class566) null);
        }
        ++field8687;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IILr;I)Z")
    public final boolean method75(int arg0, int arg1, class566 arg2, int arg3) {
        ++field8689;
        if (arg3 != 9678) {
            this.method77(true, -110, (byte) -2, (class566) null, (class488) null, 27, 34);
        }
        return false;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lr;I)Lsd;")
    public final class362 method82(class566 arg0, int arg1) {
        ++field8695;
        if (arg1 != -1660704056) {
            this.method79((byte) 5);
        }
        return null;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field8703 = arg12;
        this.field8699 = arg1 + arg2;
        this.field8692 = arg0;
        class388 var14 = class370.field4686.method3943((byte) 12, this.field8692);
        int var15 = var14.field4895;
        if (var15 == -1) {
            this.field8708 = true;
        } else {
            this.field8679 = class583.field8149.method1844(64, var15);
            this.field8708 = false;
        }
        if (~this.field8699 == ~arg2) {
            class192.method1159(super.field6470, this.field8679, super.field6461, super.field6464, 65, this.field8680, false);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Lq;Lda;BLr;)V")
    private final void method3411(class491 arg0, class474 arg1, byte arg2, class566 arg3) {
        arg1.method720(arg0);
        ++field8696;
        class64[] var5 = arg1.method728();
        int var6 = -105 % ((17 - arg2) / 43);
        class214[] var7 = arg1.method706();
        if ((this.field8697 == null || this.field8697.field1293) && (var5 != null || var7 != null)) {
            this.field8697 = class93.method540(class133.field1735, true);
        }
        if (this.field8697 != null) {
            this.field8697.method533(arg3, (long) class133.field1735, var5, var7, false);
            this.field8697.method544(super.field6470, super.field2247, super.field2254, super.field2243, super.field2244);
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(ZLr;)V")
    public final void method67(boolean arg0, class566 arg1) {
        ++field8676;
        if (arg0) {
            this.method82((class566) null, 30);
        }
        class474 var3 = this.method3409(this.field8692, 0, 22209, arg1);
        if (var3 != null) {
            class491 var4 = arg1.method995();
            var4.method914(super.field6461, super.field6458, super.field6464);
            this.method3411(var4, var3, (byte) 91, arg1);
        }
    }
}
