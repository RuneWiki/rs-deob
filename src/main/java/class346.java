import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class346 extends class376 {

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public int field4840;

    @OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
    public int field4849;

    @OriginalMember(owner = "client!pf", name = "z", descriptor = "[I")
    public int[] field4853;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "[Z")
    public boolean[] field4845;

    @OriginalMember(owner = "client!pf", name = "x", descriptor = "[I")
    public int[] field4851;

    @OriginalMember(owner = "client!pf", name = "t", descriptor = "[[I")
    public int[][] field4847;

    @OriginalMember(owner = "client!pf", name = "s", descriptor = "I")
    public static int field4846 = 0;

    @OriginalMember(owner = "client!pf", name = "y", descriptor = "I")
    public static int field4852 = 1;

    @OriginalMember(owner = "client!pf", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field4854 = new String[8];

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!pf", name = "u", descriptor = "I")
    public static int field4848;

    @OriginalMember(owner = "client!pf", name = "w", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "[I")
    public static int[] field4844;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lql;B)V", line = 3)
    public static final void method2217(class437 arg0, byte arg1) {
        if (arg1 != -52) {
            return;
        }
        field4842++;
        for (class398 var2 = (class398) class286.field3939.method1312((byte) 25); var2 != null; var2 = (class398) class286.field3939.method1304(-33)) {
            if (var2.field5811 == arg0) {
                if (var2.field5799 != null) {
                    class252.field3467.method852(var2.field5799);
                    var2.field5799 = null;
                }
                var2.method2459(198);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V", line = 43)
    public static final void method2218(int arg0) {
        class105.field1573 = new class196();
        if (arg0 != 0) {
            field4844 = null;
        }
        field4843++;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILjj;)V", line = 59)
    public static final void method2219(int arg0, class61 arg1) {
        field4850++;
        boolean var2 = false;
        if (class35.field541 == arg1.field922 || arg1.field931 == -1 || arg1.field880 != 0) {
            var2 = true;
        } else {
            class449 var3 = class86.method599(false, arg1.field931);
            if (var3.field6520 || var3.field6506[arg1.field896] < arg1.field904 + 1) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field922 - arg1.field912;
            int var5 = class35.field541 - arg1.field912;
            int var6 = arg1.field852 * 128 + arg1.method410((byte) 41) * 64;
            int var7 = arg1.field901 * 128 + arg1.method410((byte) 109) * 64;
            int var8 = arg1.field871 * 128 + arg1.method410((byte) 100) * 64;
            int var9 = arg1.field867 * 128 + arg1.method410((byte) 46) * 64;
            arg1.field6192 = ((var4 - var5) * var7 + var5 * var9) / var4;
            arg1.field6197 = ((var4 - var5) * var6 + var5 * var8) / var4;
        }
        arg1.field942 = 0;
        if (arg0 != 12288) {
            return;
        }
        if (arg1.field873 == 0) {
            arg1.method417((byte) -67, 8192);
        }
        if (arg1.field873 == 1) {
            arg1.method417((byte) -115, 12288);
        }
        if (arg1.field873 == 2) {
            arg1.method417((byte) -119, 0);
        }
        if (arg1.field873 == 3) {
            arg1.method417((byte) 113, 4096);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(III)I", line = 126)
    public static final int method2220(int arg0, int arg1, int arg2) {
        int var3 = -32 / ((arg1 + 49) / 41);
        field4841++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var4 = (arg2 & 0x7F) * arg0 >> 7;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg2 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(I[B)V", line = 165)
    public class346(int arg0, byte[] arg1) {
        this.field4840 = arg0;
        class371 var3 = new class371(arg1);
        this.field4849 = var3.method2429(0);
        this.field4853 = new int[this.field4849];
        this.field4845 = new boolean[this.field4849];
        this.field4851 = new int[this.field4849];
        this.field4847 = new int[this.field4849][];
        for (int var4 = 0; var4 < this.field4849; var4++) {
            this.field4853[var4] = var3.method2429(0);
        }
        for (int var5 = 0; var5 < this.field4849; var5++) {
            this.field4845[var5] = var3.method2429(0) == 1;
        }
        for (int var6 = 0; var6 < this.field4849; var6++) {
            this.field4851[var6] = var3.method2403((byte) 67);
        }
        for (int var7 = 0; var7 < this.field4849; var7++) {
            this.field4847[var7] = new int[var3.method2429(0)];
        }
        for (int var8 = 0; var8 < this.field4849; var8++) {
            for (int var9 = 0; var9 < this.field4847[var8].length; var9++) {
                this.field4847[var8][var9] = var3.method2429(0);
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)V", line = 228)
    public static void method2221(int arg0) {
        field4854 = null;
        if (arg0 == 12288) {
            field4844 = null;
        }
    }
}
