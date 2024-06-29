import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class139 extends class16 {

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "I")
    private int field2071 = 1024;

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "I")
    private int field2073 = 2048;

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "I")
    private int field2074 = 3072;

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "I")
    public static int field2078 = -1;

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "I")
    public static int field2076 = 127;

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "I")
    public static int field2075;

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!qa", name = "ab", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "Lkb;")
    public static class39 field2077;

    @OriginalMember(owner = "client!qa", name = "db", descriptor = "Lkb;")
    public static class39 field2084;

    @OriginalMember(owner = "client!qa", name = "bb", descriptor = "Lmf;")
    public static class53 field2082;

    @OriginalMember(owner = "client!qa", name = "cb", descriptor = "[I")
    public static int[] field2083;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZBLml;)V", line = 4)
    public static final void method935(boolean arg0, byte arg1, class143 arg2) {
        if (class186.field2991 || arg0) {
            int var3 = class210.field3432;
            int var4 = var3 * 956 / 503;
            class74.field976.method88((class160.field2601 - var4) / 2, 0, var4, var3);
            class8.field95.method854(class160.field2601 / 2 - (class8.field95.field4037 / 2), 18);
        }
        field2080++;
        int var5 = -29 / ((-arg1 - 6) / 55);
        arg2.method1001(class294.field4622, class160.field2601 / 2, class210.field3432 / 2 - 26, 16777215, -1);
        int var6 = class210.field3432 / 2 - 18;
        if (class186.field2991) {
            class344.method2371(class160.field2601 / 2 - 152, var6, 304, 34, 9179409);
            class344.method2371(class160.field2601 / 2 - 151, var6 + 1, 302, 32, 0);
            class344.method2375(class160.field2601 / 2 - 150, var6 - -2, class74.field992 * 3, 30, 9179409);
            class344.method2375(class74.field992 * 3 + class160.field2601 / 2 - 150, var6 + 2, 300 - (class74.field992 * 3), 30, 0);
        } else {
            class216.method1579(class160.field2601 / 2 - 152, var6, 304, 34, 9179409);
            class216.method1579(class160.field2601 / 2 - 151, var6 + 1, 302, 32, 0);
            class216.method1573(class160.field2601 / 2 - 150, var6 - -2, class74.field992 * 3, 30, 9179409);
            class216.method1573(class74.field992 * 3 + (class160.field2601 / 2 - 150), var6 + 2, 300 - class74.field992 * 3, 30, 0);
        }
        arg2.method1001(class50.field689, class160.field2601 / 2, class210.field3432 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(ZI)[I", line = 44)
    public final int[] method8(boolean arg0, int arg1) {
        field2072++;
        if (!arg0) {
            return (int[]) null;
        }
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (this.field207.field4024) {
            int[] var4 = this.method103(0, 4389, arg1);
            for (int var5 = 0; var5 < class276.field4376; var5++) {
                var3[var5] = (var4[var5] * this.field2073 >> 12) + this.field2071;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V", line = 222)
    public class139() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IB)[[I", line = 82)
    public final int[][] method54(int arg0, byte arg1) {
        field2075++;
        int var3 = 54 / ((arg1 - 40) / 41);
        int[][] var4 = this.field197.method715(true, arg0);
        if (this.field197.field1548) {
            int[][] var5 = this.method111(0, (byte) 122, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[2];
            int[] var11 = var4[1];
            for (int var12 = 0; var12 < class276.field4376; var12++) {
                var9[var12] = this.field2071 + (var6[var12] * this.field2073 >> 12);
                var11[var12] = (var7[var12] * this.field2073 >> 12) + this.field2071;
                var10[var12] = (var8[var12] * this.field2073 >> 12) + this.field2071;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V", line = 127)
    public static void method936(int arg0) {
        field2082 = null;
        field2084 = null;
        field2077 = null;
        field2083 = null;
        int var1 = 97 % ((41 - arg0) / 45);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLim;I)V", line = 145)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        field2079++;
        if (arg2 == 0) {
            this.field2071 = arg1.method1396(-63);
        } else if (arg2 == 1) {
            this.field2074 = arg1.method1396(-18);
        } else if (arg2 == 2) {
            this.field191 = arg1.method1399(-1172389784) == 1;
        }
        if (arg0 != -7) {
            this.field2074 = 123;
        }
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(B)V", line = 191)
    public final void method55(byte arg0) {
        field2081++;
        this.field2073 = this.field2074 - this.field2071;
        if (arg0 != 0) {
            method935(false, (byte) 88, (class143) null);
        }
    }
}
