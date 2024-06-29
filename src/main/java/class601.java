import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class601 {

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    private int field8678 = -1;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "Z")
    private boolean field8681 = true;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    private int field8670;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "[Lea;")
    private class465[] field8671;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    private int field8676;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    private int field8684;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    private int field8680;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "[Lea;")
    private class465[] field8686;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Lea;")
    private class465 field8682;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field8673;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field8675;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field8677;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field8679;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field8683;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
    private int field8685;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    private int field8687;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Ldn;")
    public static class438 field8674;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Lha;")
    private class52 field8669;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "[Lmu;")
    public static class249[] field8672;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public final void method3461(int arg0) {
        if (arg0 < 32) {
            method3462(-80, (byte) -109);
        }
        if (this.field8671 != null) {
            for (int var2 = 0; var2 < this.field8671.length; var2++) {
                this.field8671[var2].method2717();
            }
        }
        field8683++;
        this.field8669 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)Z")
    public static final boolean method3462(int arg0, byte arg1) {
        if (arg1 != -22) {
            return true;
        }
        field8679++;
        for (class99 var2 = (class99) class89.field1096.method1050((byte) 73); var2 != null; var2 = (class99) class89.field1096.method1047(-7962)) {
            if (class564.method3292(var2.field1227, -26) && ((long) arg0) == var2.field1235) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method3463(byte arg0) {
        field8674 = null;
        field8672 = null;
        if (arg0 > -86) {
            method3463((byte) 122);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lqa;BI)Z")
    public final boolean method3464(class206 arg0, byte arg1, int arg2) {
        if (this.field8678 != arg2) {
            this.field8678 = arg2;
            int var4 = class308.method1711((byte) -66, arg2);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field8687 != var4) {
                this.field8669 = null;
                this.field8687 = var4;
            }
            if (this.field8671 != null) {
                this.field8685 = 0;
                int[] var5 = new int[this.field8671.length];
                for (int var6 = 0; var6 < this.field8671.length; var6++) {
                    class465 var7 = this.field8671[var6];
                    if (var7.method2719(this.field8670, this.field8684, this.field8680, this.field8678)) {
                        var5[this.field8685] = var7.field6514;
                        this.field8686[this.field8685++] = var7;
                    }
                }
                class262.method1468(this.field8686, Integer.MIN_VALUE, this.field8685 - 1, var5, 0);
            }
            this.field8681 = true;
        }
        field8677++;
        boolean var8 = false;
        if (arg1 > -36) {
            return false;
        }
        if (this.field8681) {
            this.field8681 = false;
            for (int var9 = this.field8685 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field8686[var9].method2715(arg0, this.field8682);
                var8 |= var10;
                this.field8681 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIILqa;IIII)V")
    public final void method3465(int arg0, int arg1, int arg2, int arg3, int arg4, class206 arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg3 + arg7 & 0x3FFF;
        field8675++;
        if (~this.field8676 == arg0) {
            arg5.method1133(arg9, arg6, arg8, arg2, arg4, 0);
        } else {
            class217 var12 = class98.field1217.method119(-113, this.field8676);
            if (this.field8669 == null && class98.field1217.method118(this.field8676, (byte) 122)) {
                int[] var13 = var12.field2640 ? class98.field1217.method116(0.7F, -115, this.field8687, false, this.field8687, this.field8676) : class98.field1217.method120(this.field8687, false, 0.7F, this.field8676, this.field8687, 125);
                this.field8669 = arg5.method1114(var13, 0, this.field8687, this.field8687, this.field8687);
            }
            if (var12.field2640) {
                arg5.method1133(arg9, arg6, arg8, arg2, arg4, 0);
            }
            if (this.field8669 != null) {
                int var14 = var12.field2640 ? 1 : 0;
                int var15 = arg1 * arg2 / -4096;
                int var16;
                for (var16 = arg2 * var11 / 4096 + (arg8 - arg2) / 2; var16 > arg2; var16 -= arg2) {
                }
                while (var16 < 0) {
                    var16 += arg2;
                }
                while (var15 > arg2) {
                    var15 -= arg2;
                }
                while (var15 < 0) {
                    var15 += arg2;
                }
                for (int var17 = var16 - arg2; var17 < arg8; var17 += arg2) {
                    for (int var18 = var15 - arg2; var18 < arg2; var18 += arg2) {
                        this.field8669.method6(arg9 + var17, arg6 + var18, arg2, arg2, 1, 0, var14);
                    }
                }
            }
        }
        for (int var19 = this.field8685 - 1; var19 >= 0; var19--) {
            this.field8686[var19].method2716(arg5, arg9, arg6, arg8, arg2, arg1, var11);
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(I[Lea;IIII)V")
    public class601(int arg0, class465[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8670 = arg3;
        this.field8671 = arg1;
        this.field8676 = arg0;
        this.field8684 = arg4;
        this.field8680 = arg5;
        if (arg1 == null) {
            this.field8686 = null;
            this.field8682 = null;
        } else {
            this.field8686 = new class465[arg1.length];
            this.field8682 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
