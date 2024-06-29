import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class646 extends class524 {

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "I")
    private int field8842 = 0;

    @OriginalMember(owner = "client!lc", name = "W", descriptor = "I")
    private int field8845 = 0;

    @OriginalMember(owner = "client!lc", name = "bb", descriptor = "I")
    private int field8850 = 0;

    @OriginalMember(owner = "client!lc", name = "gb", descriptor = "I")
    private int field8855 = 0;

    @OriginalMember(owner = "client!lc", name = "fb", descriptor = "I")
    private int field8854 = 0;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "Z")
    private boolean field8837 = true;

    @OriginalMember(owner = "client!lc", name = "db", descriptor = "Z")
    public boolean field8852 = false;

    @OriginalMember(owner = "client!lc", name = "ib", descriptor = "I")
    private int field8857 = -1;

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
    private int field8844;

    @OriginalMember(owner = "client!lc", name = "cb", descriptor = "I")
    public int field8851;

    @OriginalMember(owner = "client!lc", name = "jb", descriptor = "Lmga;")
    private class709 field8858;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
    public static int field8836;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    public static int field8838;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
    public static int field8839;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
    public static int field8840;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
    public static int field8841;

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
    public static int field8843;

    @OriginalMember(owner = "client!lc", name = "X", descriptor = "I")
    public static int field8846;

    @OriginalMember(owner = "client!lc", name = "Z", descriptor = "I")
    public static int field8848;

    @OriginalMember(owner = "client!lc", name = "ab", descriptor = "I")
    public static int field8849;

    @OriginalMember(owner = "client!lc", name = "eb", descriptor = "I")
    public static int field8853;

    @OriginalMember(owner = "client!lc", name = "hb", descriptor = "I")
    public static int field8856;

    @OriginalMember(owner = "client!lc", name = "kb", descriptor = "I")
    public static int field8859;

    @OriginalMember(owner = "client!lc", name = "lb", descriptor = "I")
    public static int field8860;

    @OriginalMember(owner = "client!lc", name = "mb", descriptor = "I")
    public static int field8861;

    @OriginalMember(owner = "client!lc", name = "nb", descriptor = "I")
    public static int field8862;

    @OriginalMember(owner = "client!lc", name = "ob", descriptor = "I")
    public static int field8863;

    @OriginalMember(owner = "client!lc", name = "Y", descriptor = "Lur;")
    private class537 field8847;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIILha;)Lka;", line = 4)
    private final class471 method3564(int arg0, int arg1, int arg2, class58 arg3) {
        int var5 = 116 / ((26 - arg2) / 35);
        ++field8863;
        class752 var6 = class220.field2879.method977(arg1, (byte) -63);
        class278 var7 = class588.field8292[super.field1266];
        class278 var8 = super.field1258 < 3 ? class588.field8292[super.field1258 + 1] : null;
        return this.field8852 ? var6.method4187(var8, super.field1255, (byte) -45, -1, -1, arg3, arg0, true, class343.field4785, super.field1250, var7, 0, super.field1264) : var6.method4187(var8, super.field1255, (byte) 126, this.field8857, this.field8850, arg3, arg0, true, class343.field4785, super.field1250, var7, this.field8854, super.field1264);
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(B)I", line = 24)
    public final int method750(byte arg0) {
        ++field8859;
        if (arg0 != 14) {
            this.finalize();
        }
        return this.field8845;
    }

    @OriginalMember(owner = "client!lc", name = "finalize", descriptor = "()V", line = 36)
    protected final void finalize() {
        if (this.field8847 != null) {
            this.field8847.method3115();
        }
        ++field8841;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(ILha;)Lkj;", line = 47)
    public final class566 method744(int arg0, class58 arg1) {
        if (arg0 != 0) {
            this.field8837 = false;
        }
        ++field8848;
        return null;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(IIIIIIIIIIIII)V", line = 75)
    public class646(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field8844 = arg0;
        this.field8851 = arg1 + arg2;
        this.field8855 = arg12;
        class752 var14 = class220.field2879.method977(this.field8844, (byte) 110);
        int var15 = var14.field10449;
        if (var15 != -1) {
            this.field8858 = class343.field4785.method3525(var15, (byte) 97);
            this.field8852 = false;
        } else {
            this.field8852 = true;
        }
        if (this.field8851 == arg2) {
            class346.method2239(-701644944, this.field8850, this, this.field8858);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLha;IILkba;II)V", line = 64)
    public final void method615(boolean arg0, class58 arg1, int arg2, int arg3, class105 arg4, int arg5, int arg6) {
        if (arg5 != 22501) {
            this.method751(false);
        }
        ++field8840;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lha;III)Z", line = 102)
    public final boolean method752(class58 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            this.method3567((byte) 112, (class471) null, (class513) null, (class58) null);
        }
        ++field8856;
        return false;
    }

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)Z", line = 114)
    public final boolean method746(int arg0) {
        if (arg0 > -106) {
            this.field8842 = 120;
        }
        ++field8843;
        return false;
    }

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "(I)V", line = 135)
    public final void method614(int arg0) {
        if (arg0 != 26062) {
            this.field8855 = 116;
        }
        ++field8849;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)V", line = 146)
    public final void method3565(byte arg0, int arg1) {
        ++field8853;
        if (!this.field8852) {
            if (arg0 >= 94) {
                this.field8854 += arg1;
                while (this.field8854 > this.field8858.field9849[this.field8850]) {
                    this.field8854 -= this.field8858.field9849[this.field8850];
                    ++this.field8850;
                    if (~this.field8850 <= ~this.field8858.field9826.length) {
                        this.field8852 = true;
                        break;
                    }
                }
                if (!this.field8852) {
                    class346.method2239(-701644944, this.field8850, this, this.field8858);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)Z", line = 181)
    public final boolean method751(boolean arg0) {
        if (arg0) {
            this.field8854 = 66;
        }
        ++field8838;
        return this.field8837;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V", line = 200)
    public final void method3566(byte arg0) {
        if (arg0 == -120) {
            if (this.field8847 != null) {
                this.field8847.method3115();
            }
            ++field8860;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(BLha;)Lml;", line = 216)
    public final class387 method755(byte arg0, class58 arg1) {
        ++field8836;
        class471 var3 = this.method3564((~this.field8855 != -1 ? 5 : 0) | 2048, this.field8844, 122, arg1);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != -127) {
                this.method3567((byte) 122, (class471) null, (class513) null, (class58) null);
            }
            if (this.field8855 != 0) {
                var3.method231(this.field8855 * 2048);
            }
            class513 var4 = arg1.method439();
            var4.method339(super.field1264, super.field1255, super.field1250);
            this.method3567((byte) 49, var3, var4, arg1);
            class387 var5 = class65.method544(false, 1, arg0 ^ -24711);
            if (!class180.field2409) {
                var3.method221(var4, var5.field5482[0], 0);
            } else {
                var3.method262(var4, var5.field5482[0], class516.field7361, 0);
            }
            if (this.field8847 != null) {
                class50 var6 = this.field8847.method3116();
                if (class180.field2409) {
                    arg1.method379(var6, class516.field7361);
                } else {
                    arg1.method381(var6);
                }
            }
            this.field8837 = var3.method224();
            this.field8842 = var3.method253();
            this.field8845 = var3.method218();
            return var5;
        }
    }

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "(I)I", line = 262)
    public final int method749(int arg0) {
        ++field8846;
        if (arg0 != 32767) {
            this.field8858 = null;
        }
        return this.field8842;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLka;Lnga;Lha;)V", line = 273)
    private final void method3567(byte arg0, class471 arg1, class513 arg2, class58 arg3) {
        arg1.method239(arg2);
        ++field8839;
        class531[] var5 = arg1.method227();
        if (arg0 == 49) {
            class253[] var6 = arg1.method241();
            if ((this.field8847 == null || this.field8847.field7529) && (var5 != null || var6 != null)) {
                this.field8847 = class537.method3110(class740.field10285, true);
            }
            if (this.field8847 != null) {
                this.field8847.method3120(arg3, (long) class740.field10285, var5, var6, false);
                this.field8847.method3114(super.field1266, super.field7415, super.field7413, super.field7418, super.field7409);
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)Z", line = 305)
    public final boolean method621(int arg0) {
        if (arg0 > -103) {
            this.field8858 = null;
        }
        ++field8861;
        return false;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLha;)V", line = 320)
    public final void method753(byte arg0, class58 arg1) {
        ++field8862;
        class471 var3 = this.method3564(0, this.field8844, 113, arg1);
        if (var3 != null) {
            class513 var4 = arg1.method439();
            var4.method339(super.field1264, super.field1255, super.field1250);
            this.method3567((byte) 49, var3, var4, arg1);
        }
        int var5 = -125 % ((arg0 - 18) / 40);
    }
}
