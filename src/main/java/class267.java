import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class267 extends class262 {

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    private int field4583 = 0;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    private int field4581 = -32768;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "I")
    private int field4598 = 0;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "Z")
    public boolean field4600 = false;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    public int field4596;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public int field4580;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public int field4587;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public int field4590;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    private int field4595;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public int field4579;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "Lia;")
    private class199 field4597;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "[Z")
    public static boolean[] field4582 = new boolean[100];

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "Lcd;")
    public static class64 field4599 = class44.method335((byte) 71, "");

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "I")
    public static int field4594 = -1;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "Lke;")
    public static class106 field4603 = new class106();

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "I")
    public static int field4605 = -1;

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "[Lcd;")
    public static class64[] field4607 = new class64[100];

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "Z")
    public static boolean field4604 = false;

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "F")
    public static float field4606;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    public static int field4602;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)Lam;", line = 9)
    private final class243 method1865(int arg0) {
        field4585++;
        class91 var2 = class275.method1908(this.field4595, 75);
        int var3 = -78 % ((arg0 + 5) / 54);
        class243 var4;
        if (this.field4600) {
            var4 = var2.method685(-1, -1);
        } else {
            var4 = var2.method685(this.field4598, -1);
        }
        return var4 == null ? null : var4;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZI)V", line = 32)
    public static final void method1866(boolean arg0, int arg1) {
        if (arg1 <= 45) {
            field4594 = -85;
        }
        field4591++;
        class76.method605(arg0, class83.field1524, class58.field960, (byte) -128, class13.field290);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)I", line = 45)
    public static final int method1867(int arg0, int arg1) {
        if (arg1 != -123) {
            field4606 = 0.8157445F;
        }
        field4593++;
        if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
            return arg0 - 32;
        } else if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V", line = 67)
    public static void method1868(int arg0) {
        field4582 = null;
        field4603 = null;
        if (arg0 <= 120) {
            field4606 = 1.2786047F;
        }
        field4599 = null;
        field4607 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[Lcd;I[SI)V", line = 80)
    public static final void method1869(int arg0, class64[] arg1, int arg2, short[] arg3, int arg4) {
        if (arg2 < 100) {
            field4599 = (class64) null;
        }
        field4586++;
        if (arg4 >= arg0) {
            return;
        }
        int var5 = arg4;
        int var6 = (arg0 + arg4) / 2;
        class64 var7 = arg1[var6];
        arg1[var6] = arg1[arg0];
        arg1[arg0] = var7;
        short var8 = arg3[var6];
        arg3[var6] = arg3[arg0];
        arg3[arg0] = var8;
        for (int var9 = arg4; var9 < arg0; var9++) {
            if (var7 == null || arg1[var9] != null && arg1[var9].method492(var7, 255) < (var9 & 0x1)) {
                class64 var10 = arg1[var9];
                arg1[var9] = arg1[var5];
                arg1[var5] = var10;
                short var11 = arg3[var9];
                arg3[var9] = arg3[var5];
                arg3[var5++] = var11;
            }
        }
        arg1[arg0] = arg1[var5];
        arg1[var5] = var7;
        arg3[arg0] = arg3[var5];
        arg3[var5] = var8;
        method1869(var5 - 1, arg1, 124, arg3, arg4);
        method1869(arg0, arg1, 124, arg3, var5 + 1);
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)V", line = 139)
    public final void method1870(int arg0, int arg1) {
        if (arg1 >= -64) {
            return;
        }
        field4602++;
        if (this.field4600) {
            return;
        }
        this.field4583 += arg0;
        while (this.field4583 > this.field4597.field3419[this.field4598]) {
            this.field4583 -= this.field4597.field3419[this.field4598];
            this.field4598++;
            if (this.field4597.field3393.length <= this.field4598) {
                this.field4600 = true;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(IIIIIII)V", line = 268)
    public class267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4596 = arg6 + arg5;
        this.field4580 = arg1;
        this.field4587 = arg3;
        this.field4590 = arg4;
        this.field4595 = arg0;
        this.field4579 = arg2;
        int var8 = class275.method1908(this.field4595, 78).field1647;
        if (var8 == -1) {
            this.field4600 = true;
        } else {
            this.field4600 = false;
            this.field4597 = class281.method1944(var8, 0);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IJ)V", line = 188)
    public static final void method1871(int arg0, long arg1) {
        field4592++;
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % (long) arg0 == 0L) {
            class55.method429(115, arg1 - 1L);
            class55.method429(70, 1L);
        } else {
            class55.method429(47, arg1);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([I[Ljava/lang/Object;B)V", line = 206)
    public static final void method1872(int[] arg0, Object[] arg1, byte arg2) {
        field4601++;
        if (arg2 >= -60) {
            method1866(false, 106);
        }
        class58.method446(arg0, 126, arg1, 0, arg0.length - 1);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "()I", line = 218)
    public final int method48() {
        field4588++;
        return this.field4581;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIIIJ)V", line = 229)
    public final void method43(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field4584++;
        class243 var11 = this.method1865(109);
        if (var11 != null) {
            var11.method43(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field4581 = var11.method48();
        }
    }
}
