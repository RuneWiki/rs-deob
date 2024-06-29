import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class326 extends class98 {

    @OriginalMember(owner = "client!wt", name = "q", descriptor = "Lga;")
    public class420 field4875 = new class420();

    @OriginalMember(owner = "client!wt", name = "w", descriptor = "Lfe;")
    public class594 field4881 = new class594();

    @OriginalMember(owner = "client!wt", name = "u", descriptor = "Lhk;")
    private class110 field4879;

    @OriginalMember(owner = "client!wt", name = "s", descriptor = "[I")
    public static int[] field4877 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!wt", name = "m", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!wt", name = "n", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!wt", name = "o", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!wt", name = "p", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!wt", name = "r", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!wt", name = "t", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!wt", name = "v", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!wt", name = "x", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!wt", name = "d", descriptor = "()I")
    public final int method691() {
        field4873++;
        return 0;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I[ILuw;BII)V")
    private final void method2113(int arg0, int[] arg1, class435 arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != 85) {
            return;
        }
        if ((this.field4879.field1386[arg2.field6197] & 0x4) != 0 && arg2.field6202 < 0) {
            int var7 = this.field4879.field1347[arg2.field6197] / class110.field1367;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field6176) / var7;
                if (arg0 < var8) {
                    arg2.field6176 += arg0 * var7;
                    break;
                }
                arg2.field6196.method689(arg1, arg5, var8);
                arg0 -= var8;
                arg2.field6176 += var7 * var8 - 1048576;
                arg5 += var8;
                int var9 = class110.field1367 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class154 var11 = arg2.field6196;
                if (this.field4879.field1331[arg2.field6197] == 0) {
                    arg2.field6196 = class154.method1191(arg2.field6189, var11.method1189(), var11.method1197(), var11.method1181());
                } else {
                    arg2.field6196 = class154.method1191(arg2.field6189, var11.method1189(), 0, var11.method1181());
                    this.field4879.method734((byte) 107, arg2.field6179.field237[arg2.field6193] < 0, arg2);
                    arg2.field6196.method1183(var9, var11.method1197());
                }
                if (arg2.field6179.field237[arg2.field6193] < 0) {
                    arg2.field6196.method1203(-1);
                }
                var11.method1182(var9);
                var11.method689(arg1, arg5, arg4 - arg5);
                if (var11.method1213()) {
                    this.field4881.method3443(var11);
                }
            }
        }
        field4876++;
        arg2.field6196.method689(arg1, arg5, arg0);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V")
    public static void method2114(byte arg0) {
        int var1 = -34 % ((arg0 - 23) / 60);
        field4877 = null;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "()Leha;")
    public final class98 method688() {
        field4872++;
        class435 var1;
        do {
            var1 = (class435) this.field4875.method2505((byte) -55);
            if (var1 == null) {
                return null;
            }
        } while (var1.field6196 == null);
        return var1.field6196;
    }

    @OriginalMember(owner = "client!wt", name = "b", descriptor = "(B)V")
    public static final void method2115(byte arg0) {
        field4880++;
        class614.field8678 = new class571(8);
        class703.field9909 = 0;
        class24 var1 = (class24) class497.field7071.method2033(0);
        if (arg0 < 92) {
            field4877 = null;
        }
        while (var1 != null) {
            var1.method182();
            var1 = (class24) class497.field7071.method2025((byte) -88);
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
    public final void method686(int arg0) {
        field4874++;
        this.field4881.method686(arg0);
        for (class435 var2 = (class435) this.field4875.method2508((byte) -88); var2 != null; var2 = (class435) this.field4875.method2505((byte) -55)) {
            if (!this.field4879.method746(var2, (byte) 16)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field6178) {
                        this.method2116(80, var3, var2);
                        var2.field6178 -= var3;
                        break;
                    }
                    this.method2116(62, var2.field6178, var2);
                    var3 -= var2.field6178;
                } while (!this.field4879.method764(0, null, var3, -1, var2));
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "([III)V")
    public final void method689(int[] arg0, int arg1, int arg2) {
        field4871++;
        this.field4881.method689(arg0, arg1, arg2);
        for (class435 var4 = (class435) this.field4875.method2508((byte) 112); var4 != null; var4 = (class435) this.field4875.method2505((byte) -55)) {
            if (!this.field4879.method746(var4, (byte) 16)) {
                int var5 = arg2;
                int var6 = arg1;
                do {
                    if (var4.field6178 >= var5) {
                        this.method2113(var5, arg0, var4, (byte) 85, var5 + var6, var6);
                        var4.field6178 -= var5;
                        break;
                    }
                    this.method2113(var4.field6178, arg0, var4, (byte) 85, var5 + var6, var6);
                    var6 += var4.field6178;
                    var5 -= var4.field6178;
                } while (!this.field4879.method764(var6, arg0, var5, -1, var4));
            }
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IILuw;)V")
    private final void method2116(int arg0, int arg1, class435 arg2) {
        field4878++;
        if (arg0 < 5) {
            this.field4881 = null;
        }
        if ((this.field4879.field1386[arg2.field6197] & 0x4) != 0 && arg2.field6202 < 0) {
            int var4 = this.field4879.field1347[arg2.field6197] / class110.field1367;
            int var5 = (var4 + 1048575 - arg2.field6176) / var4;
            arg2.field6176 = arg1 * var4 + arg2.field6176 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field4879.field1331[arg2.field6197] == 0) {
                    arg2.field6196 = class154.method1191(arg2.field6189, arg2.field6196.method1189(), arg2.field6196.method1197(), arg2.field6196.method1181());
                } else {
                    arg2.field6196 = class154.method1191(arg2.field6189, arg2.field6196.method1189(), 0, arg2.field6196.method1181());
                    this.field4879.method734((byte) 65, arg2.field6179.field237[arg2.field6193] < 0, arg2);
                }
                if (arg2.field6179.field237[arg2.field6193] < 0) {
                    arg2.field6196.method1203(-1);
                }
                arg1 = arg2.field6176 / var4;
            }
        }
        arg2.field6196.method686(arg1);
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "()Leha;")
    public final class98 method687() {
        field4882++;
        class435 var1 = (class435) this.field4875.method2508((byte) -52);
        if (var1 == null) {
            return null;
        } else if (var1.field6196 == null) {
            return this.method688();
        } else {
            return var1.field6196;
        }
    }

    @OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lhk;)V")
    public class326(class110 arg0) {
        this.field4879 = arg0;
    }
}
