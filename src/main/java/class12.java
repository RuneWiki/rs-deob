import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class12 extends class196 {

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "Z")
    public boolean field184 = false;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    private int field185 = 0;

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "I")
    private int field199 = 0;

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "I")
    private int field204 = -32768;

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "I")
    public int field205;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public int field187;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    private int field188;

    @OriginalMember(owner = "client!nk", name = "x", descriptor = "I")
    public int field200;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public int field189;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "Lpi;")
    private class300 field191;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "Lqd;")
    private static class40 field194 = class147.method1106("Please wait)3)3)3", (byte) -119);

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "Lqd;")
    public static class40 field203 = class147.method1106("blinken1:", (byte) -90);

    @OriginalMember(owner = "client!nk", name = "D", descriptor = "Lqd;")
    private static class40 field206 = class147.method1106("Use", (byte) -98);

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "Lqd;")
    public static class40 field202 = field194;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "Lqd;")
    public static class40 field207 = field206;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "Lpg;")
    public static class194 field192 = new class194(0, 0);

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "[I")
    public static int[] field198;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "[I")
    public static int[] field208;

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "[I")
    public static int[] field209;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "()I", line = 8)
    public final int method74() {
        field193++;
        return this.field204;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)Lrf;", line = 35)
    private final class266 method75(byte arg0) {
        field196++;
        if (arg0 <= 124) {
            this.field199 = 76;
        }
        class276 var2 = class185.method1339(-454810365, this.field188);
        class266 var3;
        if (this.field184) {
            var3 = var2.method1921(180, -1);
        } else {
            var3 = var2.method1921(180, this.field199);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)V", line = 62)
    public final void method76(int arg0, int arg1) {
        field195++;
        if (this.field184) {
            return;
        }
        this.field185 += arg0;
        if (arg1 != 0) {
            return;
        }
        while (this.field185 > this.field191.field5033[this.field199]) {
            this.field185 -= this.field191.field5033[this.field199];
            this.field199++;
            if (this.field199 >= this.field191.field5018.length) {
                this.field184 = true;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIIIJ)V", line = 89)
    public final void method77(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field190++;
        class266 var11 = this.method75((byte) 125);
        if (var11 != null) {
            var11.method77(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field204 = var11.method74();
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(IIIIIII)V", line = 175)
    public class12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field205 = arg3;
        this.field187 = arg2;
        this.field188 = arg0;
        this.field200 = arg5 + arg6;
        this.field189 = arg4;
        this.field186 = arg1;
        int var8 = class185.method1339(-454810365, this.field188).field4600;
        if (var8 == -1) {
            this.field184 = true;
        } else {
            this.field184 = false;
            this.field191 = class20.method128(125, var8);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIIII)V", line = 125)
    public static final void method78(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field197++;
        int var9 = arg4 - arg7;
        int var10 = arg0 - arg6;
        int var11 = (arg3 - arg1 << 16) / var9;
        int var12 = (arg8 - arg2 << 16) / var10;
        class103.method773(-128, arg4, 0, arg7, var11, arg6, arg2, arg0, arg1, var12, arg5);
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V", line = 151)
    public static void method79(byte arg0) {
        field207 = null;
        field209 = null;
        field192 = null;
        int var1 = 1 / ((-arg0 - 84) / 38);
        field202 = null;
        field194 = null;
        field198 = null;
        field208 = null;
        field203 = null;
        field206 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)Lda;", line = 199)
    public static final class114 method80(int arg0) {
        if (arg0 == -32768) {
            field201++;
            class114 var1 = new class114(class102.field1799, class169.field2787, field208[0], class256.field4265[0], class102.field1802[0], class210.field3356[0], class22.field387[0], class171.field2797);
            class181.method1324(arg0 + 32791);
            return var1;
        } else {
            return (class114) null;
        }
    }
}
