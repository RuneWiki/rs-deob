import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class179 {

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Lwd;")
    private class232 field3318 = new class232(256);

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "Lwd;")
    private class232 field3332 = new class232(256);

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "Lab;")
    private class3 field3328;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Lab;")
    private class3 field3331;

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Lvd;")
    private static class222 field3326 = class212.method1357("Free world", 10731);

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "[Lvd;")
    public static class222[] field3323 = new class222[500];

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Lvd;")
    public static class222 field3321 = field3326;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field3327 = 0;

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "Lvd;")
    public static class222 field3330 = class212.method1357(":clan:", 10731);

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "Lvd;")
    public static class222 field3333 = class212.method1357("<img=0>", 10731);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "[[[B")
    public static byte[][][] field3319;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    public static void method1120(byte arg0) {
        field3333 = null;
        if (arg0 != 61) {
            method1125(-6, -89, 87, 53);
        }
        field3330 = null;
        field3323 = null;
        field3321 = null;
        field3326 = null;
        field3319 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)I")
    public static final int method1121(int arg0) {
        field3322++;
        if (class104.field1929 == 3.0D) {
            return 37;
        } else if (class104.field1929 == 4.0D) {
            return 50;
        } else if (class104.field1929 == 6.0D) {
            return 75;
        } else {
            int var1 = -37 / ((70 - arg0) / 44);
            return 100;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3320++;
        if (class27.method232(arg5, -7754)) {
            class60.method427(false, arg7, arg0, arg6, arg1, arg2, class220.field4066[arg5], arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[II)Lqc;")
    public final class171 method1123(int arg0, int[] arg1, int arg2) {
        field3329++;
        if (arg2 >= -95) {
            this.method1126(24, null, -20, -16);
        }
        if (this.field3331.method34((byte) 16) == 1) {
            return this.method1126(-128, arg1, 0, arg0);
        } else if (this.field3331.method38(5, arg0) == 1) {
            return this.method1126(-127, arg1, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I[II)Lqc;")
    public final class171 method1124(int arg0, int[] arg1, int arg2) {
        field3325++;
        if (arg0 <= 124) {
            method1125(-15, -24, -9, -115);
        }
        if (this.field3328.method34((byte) 16) == 1) {
            return this.method1127(-23, arg1, arg2, 0);
        } else if (this.field3328.method38(5, arg2) == 1) {
            return this.method1127(-83, arg1, 0, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1125(int arg0, int arg1, int arg2, int arg3) {
        if (class222.method1423(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class191.method1191(var4 + 1, class80.field1544[arg0][arg1][arg2] + arg3, var5 + 1) && class191.method1191(var4 + 128 - 1, class80.field1544[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class191.method1191(var4 + 128 - 1, class80.field1544[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class191.method1191(var4 + 1, class80.field1544[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I[III)Lqc;")
    private final class171 method1126(int arg0, int[] arg1, int arg2, int arg3) {
        field3324++;
        int var5 = (arg2 << 4 & 0xFFFD | arg2 >>> 12) ^ arg3;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class171 var9 = (class171) this.field3332.method1520(var7, 110);
        if (var9 != null) {
            return var9;
        } else if (arg0 > -126) {
            return null;
        } else if (arg1 == null || arg1[0] > 0) {
            class136 var10 = (class136) this.field3318.method1520(var7, 102);
            if (var10 == null) {
                var10 = class136.method857(this.field3331, arg2, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field3318.method1519(true, var10, var7);
            }
            class171 var11 = var10.method864(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method826(-22101);
                this.field3332.method1519(true, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I[III)Lqc;")
    private final class171 method1127(int arg0, int[] arg1, int arg2, int arg3) {
        int var5 = (arg3 >>> 12 | (arg3 & 0xD0000FFF) << 4) ^ arg2;
        field3317++;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class171 var9 = (class171) this.field3332.method1520(var7, 68);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            if (arg0 >= 0) {
                method1120((byte) -55);
            }
            class4 var10 = class4.method49(this.field3328, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            class171 var11 = var10.method46();
            this.field3332.method1519(true, var11, var7);
            if (arg1 != null) {
                arg1[0] -= var11.field3220.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "(Lab;Lab;)V")
    public class179(class3 arg0, class3 arg1) {
        this.field3328 = arg0;
        this.field3331 = arg1;
    }
}
