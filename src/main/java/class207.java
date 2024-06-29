import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class207 implements class236 {

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "Lhl;")
    private class40 field3319 = new class40(256);

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "Llc;")
    private class86 field3320;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "Llc;")
    private class86 field3332;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "[Luc;")
    private class39[] field3324;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "[S")
    public static short[] field3318 = new short[500];

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field3328 = 0;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "[I")
    public static int[] field3326 = new int[2048];

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "Z")
    public static boolean field3334 = true;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "F")
    public static float field3323;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field3330;

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BI)Z")
    public final boolean method1512(byte arg0, int arg1) {
        if (arg0 > -90) {
            return true;
        } else {
            class181 var3 = this.method233((byte) -123, arg1);
            field3330++;
            return var3 != null && var3.method1349(this.field3332, this, false);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method1513(boolean arg0, int arg1, String arg2) {
        field3327++;
        class201 var3 = class94.method738(-116, arg1, 2);
        var3.method1477(0);
        if (!arg0) {
            field3318 = null;
        }
        var3.field3230 = arg2;
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(II)Luc;")
    public final class39 method1514(int arg0, int arg1) {
        if (arg1 == 0) {
            field3331++;
            return this.field3324[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static void method1515(int arg0) {
        field3326 = null;
        field3318 = null;
        int var1 = -111 / ((arg0 + 15) / 33);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(FIIIBZ)[I")
    public final int[] method1516(float arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        if (arg4 < 71) {
            this.method233((byte) 55, 100);
        }
        field3322++;
        return this.method233((byte) -127, arg2).method1344(this.field3324[arg2].field550, (byte) 38, (double) arg0, this.field3332, arg5, this, arg3, arg1);
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(BI)Lam;")
    public class181 method233(byte arg0, int arg1) {
        class139 var3 = this.field3319.method310(-24190, (long) arg1);
        field3329++;
        if (var3 != null) {
            return (class181) var3;
        } else if (arg0 >= -92) {
            return null;
        } else {
            byte[] var4 = this.field3320.method645(106, arg1);
            if (var4 == null) {
                return null;
            } else {
                class181 var5 = new class181(new class152(var4));
                this.field3319.method312((long) arg1, var5, (byte) 109);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Llc;Llc;Llc;)V")
    public class207(class86 arg0, class86 arg1, class86 arg2) {
        this.field3320 = arg1;
        this.field3332 = arg2;
        class152 var4 = new class152(arg0.method643(0, 0, false));
        int var5 = var4.method1126(false);
        this.field3324 = new class39[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1111(255) == 1) {
                this.field3324[var6] = new class39();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field3324[var7] != null) {
                this.field3324[var7].field553 = var4.method1111(255) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field3324[var8] != null) {
                this.field3324[var8].field548 = var4.method1111(255) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3324[var9] != null) {
                this.field3324[var9].field545 = var4.method1111(255) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field3324[var10] != null) {
                var4.method1111(255);
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field3324[var11] != null) {
                var4.method1092((byte) -62);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field3324[var12] != null) {
                var4.method1092((byte) -62);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field3324[var13] != null) {
                var4.method1092((byte) -62);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field3324[var14] != null) {
                var4.method1092((byte) -62);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field3324[var15] != null) {
                this.field3324[var15].field547 = (short) var4.method1126(false);
            }
        }
        if (var4.field2523.length > var4.field2511) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field3324[var16] != null) {
                    var4.method1092((byte) -62);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field3324[var17] != null) {
                    var4.method1092((byte) -62);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field3324[var18] != null) {
                    var4.method1111(255);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field3324[var19] != null) {
                    this.field3324[var19].field550 = var4.method1111(255) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field3324[var20] != null) {
                    var4.method1092((byte) -62);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field3324[var21] != null) {
                    var4.method1111(255);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field3324[var22] != null) {
                    var4.method1111(255);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field3324[var23] != null) {
                    var4.method1111(255);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)V")
    public static final void method1517(int arg0, boolean arg1) {
        field3321++;
        if (arg1) {
            method1518(83, -8);
        }
        class83 var2 = (class83) class67.field991.method1034((long) arg0, (byte) 21);
        if (var2 != null) {
            for (int var3 = 0; var3 < var2.field1206.length; var3++) {
                var2.field1206[var3] = -1;
                var2.field1197[var3] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(II)V")
    public static final void method1518(int arg0, int arg1) {
        if (arg1 == 1) {
            field3333++;
            class222.field3551 = (class222) class149.field2425.method1034((long) arg0, (byte) 21);
        }
    }
}
