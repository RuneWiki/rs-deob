import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class461 {

    @OriginalMember(owner = "client!af", name = "o", descriptor = "Z")
    private boolean field6271 = true;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    private int field6277 = -1;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    private int field6260;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    private int field6261;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    private int field6273;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    private int field6272;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "[Lav;")
    private class667[] field6276;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "[Lav;")
    private class667[] field6270;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "Lav;")
    private class667 field6267;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field6266 = 0;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "[Lija;")
    public static class366[] field6275 = new class366[14];

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    private int field6258;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    private int field6262;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "Lnf;")
    private class604 field6269;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IBIIILha;IIII)V")
    public final void method2650(int arg0, byte arg1, int arg2, int arg3, int arg4, class66 arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg7 + arg9 & 0x3FFF;
        field6264++;
        if (this.field6260 == -1 || this.field6258 == 0) {
            arg5.method537(arg3, arg6, arg0, arg2, arg8, 0);
        } else {
            class311 var12 = class699.field9647.method1270(this.field6260, true);
            if (this.field6269 == null && class699.field9647.method1274(this.field6260, 21532)) {
                int[] var13 = var12.field4242 == 2 ? class699.field9647.method1272(this.field6258, this.field6260, 0.7F, this.field6258, (byte) 81, false) : class699.field9647.method1269(0.7F, this.field6258, false, this.field6260, this.field6258, true);
                this.field6269 = arg5.method495(0, this.field6258, var13, this.field6258, this.field6258, true);
            }
            if (var12.field4242 == 2) {
                arg5.method537(arg3, arg6, arg0, arg2, arg8, 0);
            }
            if (this.field6269 != null) {
                int var14 = var12.field4242 == 2 ? 1 : 0;
                int var15 = arg2 * arg4 / -4096;
                int var16;
                for (var16 = (arg0 - arg2) / 2 + (arg2 * var11 / 4096); var16 > arg2; var16 -= arg2) {
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
                for (int var17 = var16 - arg2; var17 < arg0; var17 += arg2) {
                    for (int var18 = var15 - arg2; var18 < arg2; var18 += arg2) {
                        this.field6269.method3433(arg3 + var17, var18 - -arg6, arg2, arg2, 1, 0, var14);
                    }
                }
            }
        }
        if (arg1 > -70) {
            this.method2650(-110, (byte) -14, 45, -101, -43, null, -59, -3, -30, -56);
        }
        for (int var19 = this.field6262 - 1; var19 >= 0; var19--) {
            this.field6270[var19].method3777(arg5, arg3, arg6, arg0, arg2, arg4, var11);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III[Ljava/lang/String;)Ljava/lang/String;")
    public static final String method2651(int arg0, int arg1, int arg2, String[] arg3) {
        field6274++;
        if (arg0 == 0) {
            return "";
        } else if (arg0 == 1) {
            String var4 = arg3[arg1];
            return var4 == null ? "null" : var4.toString();
        } else {
            if (arg2 != -1) {
                method2651(-49, -32, 11, null);
            }
            int var5 = arg0 + arg1;
            int var6 = 0;
            for (int var7 = arg1; var7 < var5; var7++) {
                String var11 = arg3[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg1; var9 < var5; var9++) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method2652(int arg0) {
        if (arg0 <= 125) {
            field6266 = 34;
        }
        field6275 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ILha;I)Z")
    public final boolean method2653(int arg0, class66 arg1, int arg2) {
        if (this.field6277 != arg2) {
            this.field6277 = arg2;
            int var4 = class484.method2765(arg2, 91);
            if (var4 > 512) {
                var4 = 512;
            }
            if (var4 <= 0) {
                var4 = 1;
            }
            if (this.field6258 != var4) {
                this.field6258 = var4;
                this.field6269 = null;
            }
            if (this.field6276 != null) {
                this.field6262 = 0;
                int[] var5 = new int[this.field6276.length];
                for (int var6 = 0; var6 < this.field6276.length; var6++) {
                    class667 var7 = this.field6276[var6];
                    if (var7.method3769(this.field6272, this.field6273, this.field6261, this.field6277)) {
                        var5[this.field6262] = var7.field9274;
                        this.field6270[this.field6262++] = var7;
                    }
                }
                class650.method3644(this.field6262 - 1, 0, this.field6270, var5, false);
            }
            this.field6271 = true;
        }
        field6265++;
        boolean var8 = false;
        if (arg0 != 16885) {
            return false;
        }
        if (this.field6271) {
            this.field6271 = false;
            for (int var9 = this.field6262 - 1; var9 >= 0; var9--) {
                boolean var10 = this.field6270[var9].method3779(arg1, this.field6267);
                var8 |= var10;
                this.field6271 |= !var10;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
    public static final void method2654(int arg0) {
        class259.field3631 = null;
        class783.field10756 = null;
        class467.field6329 = null;
        class759.field10456 = null;
        class8.field161 = null;
        class766.field10566 = null;
        if (arg0 < 65) {
            field6266 = 105;
        }
        class407.field5584 = null;
        class70.field1037 = null;
        class309.field4220 = null;
        class350.field4695 = null;
        field6268++;
        class18.field424 = null;
        class555.field7842 = null;
        class724.field9959 = null;
        class521.field7068 = null;
        class557.field7861 = null;
        class359.field4908 = null;
        class62.field857 = null;
        class761.field10487 = null;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V")
    public final void method2655(int arg0) {
        field6263++;
        if (this.field6276 != null) {
            for (int var2 = 0; var2 < this.field6276.length; var2++) {
                this.field6276[var2].method3772();
            }
        }
        this.field6269 = null;
        if (arg0 >= -71) {
            this.method2650(-48, (byte) -79, -89, 108, -11, null, -98, 29, -117, 98);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Z")
    public static final boolean method2656(int arg0, int arg1) {
        field6259++;
        if (arg0 != 0) {
            method2651(-76, -53, -119, null);
        }
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(I[Lav;IIII)V")
    public class461(int arg0, class667[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6260 = arg0;
        this.field6261 = arg5;
        this.field6273 = arg4;
        this.field6272 = arg3;
        this.field6276 = arg1;
        if (arg1 == null) {
            this.field6267 = null;
            this.field6270 = null;
        } else {
            this.field6270 = new class667[arg1.length];
            this.field6267 = arg2 < 0 ? null : arg1[arg2];
        }
    }
}
