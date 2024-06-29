import java.awt.Frame;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class276 {

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
    private int field4818 = 0;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public int field4812;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "[Lki;")
    public class103[] field4800;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field4809 = new CRC32();

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "Lda;")
    public static class275 field4813 = class255.method1672(109, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "J")
    public static long field4817 = 0L;

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Lda;")
    public static class275 field4816 = class255.method1672(92, "::rect_debug");

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "Lda;")
    public static class275 field4819 = class255.method1672(110, ")1");

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field4803;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field4805;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field4806;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field4808;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field4810;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field4811;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field4814;

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "I")
    public static int field4820;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "J")
    private long field4807;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Lki;")
    private class103 field4801;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "Lki;")
    private class103 field4815;

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "Ljava/awt/Frame;")
    public static Frame field4821;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)I")
    public static final int method1858(byte arg0) {
        if (arg0 != -4) {
            method1859((byte) 105);
        }
        field4805++;
        return 16;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)I")
    public static final int method1859(byte arg0) {
        field4811++;
        if (class275.field4745) {
            return 0;
        }
        int var1 = 105 / ((arg0 - 80) / 43);
        if (class262.method1714(-1)) {
            return class66.field1080 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILma;)Lrj;")
    public static final class13 method1860(int arg0, int arg1, class105 arg2) {
        field4810++;
        if (class181.method1213((byte) 123, arg2, arg1)) {
            if (arg0 != -30608) {
                method1859((byte) -13);
            }
            return class83.method540(121);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public static void method1861(int arg0) {
        field4813 = null;
        field4816 = null;
        field4809 = null;
        field4821 = null;
        field4819 = null;
        if (arg0 != 0) {
            field4816 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IJ)V")
    public static final void method1862(int arg0, long arg1) {
        field4814++;
        if (arg1 != 0L) {
            class197.field3363++;
            class149.field2597.method526((byte) -58, arg0);
            class149.field2597.method560(arg1, arg0 - 164);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)Lab;")
    public static final class220 method1863(int arg0, int arg1) {
        class220 var2 = (class220) class252.field4460.method252(true, (long) arg0);
        field4797++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class207.field3488.method775(26, arg0, arg1 - 24799);
        class220 var4 = new class220();
        if (var3 != null) {
            var4.method1414(true, new class85(var3));
        }
        if (arg1 != 0) {
            method1861(29);
        }
        class252.field4460.method251(var4, (byte) -91, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)Lki;")
    public final class103 method1864(byte arg0) {
        field4799++;
        if (arg0 >= -34) {
            this.field4815 = null;
        }
        this.field4818 = 0;
        return this.method1869(-1);
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public final void method1865(int arg0) {
        field4803++;
        for (int var2 = 0; var2 < this.field4812; var2++) {
            class103 var4 = this.field4800[var2];
            while (true) {
                class103 var5 = var4.field1716;
                if (var4 == var5) {
                    break;
                }
                var5.method741(3);
            }
        }
        int var3 = 43 / ((-arg0 - 19) / 63);
        this.field4801 = null;
        this.field4815 = null;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)I")
    public final int method1866(int arg0) {
        field4806++;
        int var2 = -4 / ((arg0 + 32) / 50);
        return this.field4812;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZJLki;)V")
    public final void method1867(boolean arg0, long arg1, class103 arg2) {
        field4802++;
        if (arg2.field1714 != null) {
            arg2.method741(3);
        }
        class103 var5 = this.field4800[(int) (arg1 & (long) (this.field4812 - 1))];
        arg2.field1714 = var5.field1714;
        arg2.field1716 = var5;
        arg2.field1707 = arg1;
        if (arg0) {
            arg2.field1714.field1716 = arg2;
            arg2.field1716.field1714 = arg2;
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)I")
    public final int method1868(byte arg0) {
        field4798++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field4812; var3++) {
            class103 var4 = this.field4800[var3];
            class103 var5 = var4.field1716;
            while (var4 != var5) {
                var5 = var5.field1716;
                var2++;
            }
        }
        if (arg0 <= 28) {
            return 119;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(I)V")
    public class276(int arg0) {
        this.field4812 = arg0;
        this.field4800 = new class103[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class103 var3 = this.field4800[var2] = new class103();
            var3.field1716 = var3;
            var3.field1714 = var3;
        }
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)Lki;")
    public final class103 method1869(int arg0) {
        field4808++;
        if (arg0 != -1) {
            field4820 = -123;
        }
        if (this.field4818 > 0 && this.field4800[this.field4818 - 1] != this.field4815) {
            class103 var2 = this.field4815;
            this.field4815 = var2.field1716;
            return var2;
        }
        while (this.field4818 < this.field4812) {
            class103 var3 = this.field4800[this.field4818++].field1716;
            if (this.field4800[this.field4818 - 1] != var3) {
                this.field4815 = var3.field1716;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(B)Lki;")
    public final class103 method1870(byte arg0) {
        field4804++;
        if (arg0 > -36) {
            this.field4800 = null;
        }
        if (this.field4801 == null) {
            return null;
        }
        class103 var2 = this.field4800[(int) (this.field4807 & (long) (this.field4812 - 1))];
        while (this.field4801 != var2) {
            if (this.field4801.field1707 == this.field4807) {
                class103 var3 = this.field4801;
                this.field4801 = this.field4801.field1716;
                return var3;
            }
            this.field4801 = this.field4801.field1716;
        }
        this.field4801 = null;
        return null;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IJ)Lki;")
    public final class103 method1871(int arg0, long arg1) {
        this.field4807 = arg1;
        if (arg0 != 0) {
            this.method1865(-34);
        }
        class103 var4 = this.field4800[(int) ((long) (this.field4812 - 1) & arg1)];
        field4796++;
        for (this.field4801 = var4.field1716; this.field4801 != var4; this.field4801 = this.field4801.field1716) {
            if (this.field4801.field1707 == arg1) {
                class103 var5 = this.field4801;
                this.field4801 = this.field4801.field1716;
                return var5;
            }
        }
        this.field4801 = null;
        return null;
    }
}
