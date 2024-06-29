import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class206 extends class122 {

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
    public static int field3279 = 0;

    @OriginalMember(owner = "client!fg", name = "U", descriptor = "[[I")
    public static int[][] field3282 = new int[104][104];

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "Lqd;")
    public static class40 field3278 = class147.method1106("Lade Schrifts-=tze )2 ", (byte) -66);

    @OriginalMember(owner = "client!fg", name = "Z", descriptor = "Z")
    public static boolean field3287 = true;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!fg", name = "V", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!fg", name = "W", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!fg", name = "X", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!fg", name = "ab", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!fg", name = "bb", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!fg", name = "cb", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!fg", name = "db", descriptor = "Lce;")
    public static class239 field3291;

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "Lqd;")
    public class40 field3275;

    @OriginalMember(owner = "client!fg", name = "O", descriptor = "[I")
    public int[] field3276;

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "[I")
    public int[] field3277;

    @OriginalMember(owner = "client!fg", name = "Y", descriptor = "[I")
    public int[] field3286;

    @OriginalMember(owner = "client!fg", name = "eb", descriptor = "[I")
    public int[] field3292;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "(I)V", line = 9)
    public static final void method1448(int arg0) {
        int var1 = -32 / ((-arg0 - 69) / 53);
        field3284++;
        class44.field845 = new class213[class158.field2644.method1660(-22800)][];
        class293.field4917 = new boolean[class158.field2644.method1660(-22800)];
    }

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "(I)V", line = 20)
    public final void method1449(int arg0) {
        field3281++;
        if (this.field3277 != null) {
            for (int var2 = 0; var2 < this.field3277.length; var2++) {
                this.field3277[var2] = class11.method71(this.field3277[var2], 32768);
            }
        }
        if (this.field3286 != null) {
            for (int var3 = 0; var3 < this.field3286.length; var3++) {
                this.field3286[var3] = class11.method71(this.field3286[var3], 32768);
            }
        }
        if (arg0 != 32768) {
            this.field3292 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILsd;I)V", line = 54)
    private final void method1450(int arg0, class26 arg1, int arg2) {
        field3285++;
        if (arg0 <= 101) {
            field3291 = (class239) null;
        }
        if (arg2 == 1) {
            this.field3275 = arg1.method251((byte) 77);
        } else if (arg2 == 2) {
            int var4 = arg1.method226(255);
            this.field3292 = new int[var4];
            this.field3286 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3286[var5] = arg1.method197(-1);
                int var6 = arg1.method226(255);
                if (var6 == 0) {
                    this.field3292[var5] = -1;
                } else {
                    this.field3292[var5] = var6;
                }
            }
        } else if (arg2 == 3) {
            int var7 = arg1.method226(255);
            this.field3276 = new int[var7];
            this.field3277 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3277[var8] = arg1.method197(-1);
                int var9 = arg1.method226(255);
                if (var9 == 0) {
                    this.field3276[var8] = -1;
                } else {
                    this.field3276[var8] = var9;
                }
            }
        } else if (arg2 != 4) {
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V", line = 129)
    public static void method1451(byte arg0) {
        field3291 = null;
        field3282 = (int[][]) null;
        if (arg0 <= -73) {
            field3278 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILsd;)V", line = 146)
    public final void method1452(int arg0, class26 arg1) {
        field3280++;
        if (arg0 != 28908) {
            return;
        }
        while (true) {
            int var3 = arg1.method226(arg0 - 28653);
            if (var3 == 0) {
                return;
            }
            this.method1450(126, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(II)I", line = 174)
    public final int method1453(int arg0, int arg1) {
        field3289++;
        if (this.field3277 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field3277.length; var3++) {
            if (this.field3276[var3] == arg1) {
                return this.field3277[var3];
            }
        }
        if (arg0 != -1) {
            field3288 = 69;
        }
        return -1;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIZIII)V", line = 206)
    public static final void method1454(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field3290++;
        int var8 = arg1 + arg6;
        int var9 = arg3 - arg6;
        for (int var10 = arg1; var10 < var8; var10++) {
            class150.method1124(arg0, arg2, arg5, true, class37.field694[var10]);
        }
        for (int var11 = arg3; var11 > var9; var11--) {
            class150.method1124(arg0, arg2, arg5, true, class37.field694[var11]);
        }
        int var12 = arg0 - arg6;
        int var13 = arg2 + arg6;
        if (!arg4) {
            field3282 = (int[][]) ((int[][]) null);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class37.field694[var14];
            class150.method1124(var13, arg2, arg5, true, var15);
            class150.method1124(var12, var13, arg7, true, var15);
            class150.method1124(arg0, var12, arg5, arg4, var15);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)I", line = 266)
    public final int method1455(byte arg0, int arg1) {
        field3283++;
        if (this.field3286 == null) {
            return -1;
        }
        if (arg0 != -46) {
            method1448(102);
        }
        for (int var3 = 0; var3 < this.field3286.length; var3++) {
            if (this.field3292[var3] == arg1) {
                return this.field3286[var3];
            }
        }
        return -1;
    }
}
