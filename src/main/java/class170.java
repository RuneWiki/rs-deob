import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class170 implements class79 {

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    private int field3173 = 50;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "I")
    private int field3185 = 128;

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "Lpb;")
    private class165 field3182;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "Lpb;")
    private class165 field3168;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "Lkg;")
    private class115 field3172;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "Lmb;")
    public static class132 field3175 = class166.method1092("Wir vermuten)1 dass Ihr Konto gestohlen wurde", 125);

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "Lmb;")
    public static class132 field3177 = null;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "Lmb;")
    public static class132 field3181 = class166.method1092("Spieler kann nicht gefunden werden: ", 117);

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "Lmb;")
    public static class132 field3184 = class166.method1092("settings", 115);

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(IB)Z")
    public final boolean method486(int arg0, byte arg1) {
        if (arg1 > -4) {
            field3184 = null;
        }
        field3170++;
        return this.method1112(arg0, (byte) -101).field3930;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)[I")
    public final int[] method490(int arg0, int arg1) {
        field3183++;
        int var3 = -20 / (-arg1 / 58);
        class215 var4 = this.method1112(arg0, (byte) 125);
        return var4.method1339(this.field3185, this, this.field3182, -32032);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)Z")
    public final boolean method485(int arg0, byte arg1) {
        if (arg1 == 116) {
            field3166++;
            return this.field3185 == 64 || this.method1112(arg0, (byte) 127).field3938 == 64;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)V")
    public final void method1110(int arg0, int arg1) {
        field3174++;
        int var3 = 41 / ((arg0 + 56) / 57);
        for (class215 var4 = (class215) this.field3172.method772(false); var4 != null; var4 = (class215) this.field3172.method771((byte) 78)) {
            if (var4.field3919) {
                var4.method1338(arg1, 21168);
                var4.field3919 = false;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)V")
    public final void method1111(boolean arg0) {
        if (arg0) {
            method1114(84);
        }
        field3178++;
        this.field3172 = new class115(this.field3173);
    }

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "(IB)Lua;")
    private final class215 method1112(int arg0, byte arg1) {
        field3180++;
        class215 var3 = (class215) this.field3172.method777(-1, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field3168.method1079(0, 115, arg0);
        int var5 = 6 / ((70 - arg1) / 54);
        if (var4 == null) {
            return class111.method700(-1024);
        } else {
            class112 var6 = new class112(var4);
            class215 var7 = new class215(var6);
            this.field3172.method774((long) arg0, var7, 0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lii;B)I")
    public static final int method1113(class96 arg0, byte arg1) {
        field3167++;
        class171 var2 = (class171) class236.field4269.method806(-1, ((long) arg0.field1794 << 32) + (long) arg0.field1743);
        if (var2 == null) {
            if (arg1 != -50) {
                method1113(null, (byte) -56);
            }
            return arg0.field1814;
        } else {
            return var2.field3189;
        }
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(IB)I")
    public final int method489(int arg0, byte arg1) {
        if (arg1 > -40) {
            this.field3182 = null;
        }
        field3171++;
        return this.method1112(arg0, (byte) 124).field3939;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)Z")
    public final boolean method491(boolean arg0, int arg1) {
        field3169++;
        if (!arg0) {
            this.field3185 = 36;
        }
        return this.method1112(arg1, (byte) 13).field3926;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V")
    public static void method1114(int arg0) {
        field3184 = null;
        field3181 = null;
        field3175 = null;
        field3177 = null;
        if (arg0 != 293147616) {
            field3175 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "([IIIIII)V")
    public static final void method1115(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class169 var6 = class101.field1900[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class91 var7 = var6.field3145;
        if (var7 != null) {
            int var8 = var7.field1600;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class206 var10 = var6.field3127;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field3772;
        int var12 = var10.field3778;
        int var13 = var10.field3765;
        int var14 = var10.field3777;
        int[] var15 = class40.field658[var11];
        int[] var16 = class140.field2622[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(FII)[I")
    public final int[] method487(float arg0, int arg1, int arg2) {
        class215 var4 = this.method1112(arg1, (byte) -77);
        var4.field3919 = true;
        if (arg2 != 3) {
            this.field3172 = null;
        }
        field3179++;
        return var4.method1343(this, arg0, 5069, this.field3185, this.field3182);
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(IB)Z")
    public final boolean method488(int arg0, byte arg1) {
        if (arg1 != -48) {
            this.field3182 = null;
        }
        field3176++;
        return this.method1112(arg0, (byte) -70).method1344(this.field3182, (byte) 43, this);
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lpb;Lpb;II)V")
    public class170(class165 arg0, class165 arg1, int arg2, int arg3) {
        this.field3182 = arg1;
        this.field3185 = arg3;
        this.field3168 = arg0;
        this.field3173 = arg2;
        this.field3172 = new class115(this.field3173);
    }
}
