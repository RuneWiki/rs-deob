import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class158 {

    @OriginalMember(owner = "client!oga", name = "n", descriptor = "Lmk;")
    private class321 field2252 = new class321();

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "Lvg;")
    public static class622 field2239 = new class622(19, 11);

    @OriginalMember(owner = "client!oga", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field2251 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "F")
    public static float field2242;

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!oga", name = "f", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!oga", name = "g", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!oga", name = "h", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!oga", name = "i", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!oga", name = "j", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!oga", name = "k", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!oga", name = "l", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!oga", name = "o", descriptor = "Lmk;")
    private class321 field2253;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(Z)V")
    public final void method1125(boolean arg0) {
        field2246++;
        while (true) {
            class321 var2 = this.field2252.field4674;
            if (this.field2252 == var2) {
                if (!arg0) {
                    this.field2252 = null;
                }
                this.field2253 = null;
                return;
            }
            var2.method1989((byte) 125);
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)Lmk;")
    public final class321 method1126(int arg0) {
        field2248++;
        int var2 = -65 % ((arg0 + 26) / 40);
        class321 var3 = this.field2252.field4674;
        if (this.field2252 == var3) {
            this.field2253 = null;
            return null;
        } else {
            this.field2253 = var3.field4674;
            return var3;
        }
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(Z)I")
    public final int method1127(boolean arg0) {
        field2241++;
        if (arg0) {
            this.field2252 = null;
        }
        int var2 = 0;
        class321 var3 = this.field2252.field4674;
        while (this.field2252 != var3) {
            var3 = var3.field4674;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(I)Lmk;")
    public final class321 method1128(int arg0) {
        field2245++;
        if (arg0 != 11) {
            this.method1125(true);
        }
        class321 var2 = this.field2253;
        if (this.field2252 == var2) {
            this.field2253 = null;
            return null;
        } else {
            this.field2253 = var2.field4674;
            return var2;
        }
    }

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "(Z)V")
    public static void method1129(boolean arg0) {
        if (arg0) {
            method1129(true);
        }
        field2251 = null;
        field2239 = null;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)Lmk;")
    public final class321 method1130(byte arg0) {
        field2244++;
        class321 var2 = this.field2252.field4673;
        if (this.field2252 == var2) {
            return null;
        }
        if (arg0 != -64) {
            this.method1128(-93);
        }
        var2.method1989((byte) 92);
        return var2;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(ILmk;)V")
    public final void method1131(int arg0, class321 arg1) {
        field2247++;
        int var3 = -77 % ((-arg0 - 34) / 52);
        if (arg1.field4673 != null) {
            arg1.method1989((byte) 98);
        }
        arg1.field4673 = this.field2252;
        arg1.field4674 = this.field2252.field4674;
        arg1.field4673.field4674 = arg1;
        arg1.field4674.field4673 = arg1;
    }

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "(I)Lmk;")
    public final class321 method1132(int arg0) {
        field2240++;
        class321 var2 = this.field2252.field4674;
        if (this.field2252 == var2) {
            return null;
        } else if (arg0 == -1) {
            var2.method1989((byte) 117);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIZI)I")
    public static final int method1133(int arg0, int arg1, boolean arg2, int arg3) {
        field2243++;
        if (arg1 != 23608) {
            return -30;
        }
        class15 var4 = class262.method1577((byte) -17, arg0, arg2);
        if (var4 == null) {
            return -1;
        } else if (arg3 >= 0 && var4.field330.length > arg3) {
            return var4.field330[arg3];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(Lmk;I)V")
    public final void method1134(class321 arg0, int arg1) {
        field2249++;
        if (arg1 != -1) {
            field2242 = -0.53495866F;
        }
        if (arg0.field4673 != null) {
            arg0.method1989((byte) 103);
        }
        arg0.field4674 = this.field2252;
        arg0.field4673 = this.field2252.field4673;
        arg0.field4673.field4674 = arg0;
        arg0.field4674.field4673 = arg0;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I[B[BIIIIII)V")
    public static final void method1135(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2250++;
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg8; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg7++;
                arg2[var10001] += arg1[arg6++];
                int var14 = arg7++;
                arg2[var14] += arg1[arg6++];
                int var15 = arg7++;
                arg2[var15] += arg1[arg6++];
                int var16 = arg7++;
                arg2[var16] += arg1[arg6++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg2[var10001] += arg1[arg6++];
            }
            arg6 += arg0;
            arg7 += arg3;
        }
        if (arg4 != -1) {
            method1133(54, 98, false, 88);
        }
    }

    @OriginalMember(owner = "client!oga", name = "<init>", descriptor = "()V")
    public class158() {
        this.field2252.field4673 = this.field2252;
        this.field2252.field4674 = this.field2252;
    }
}
