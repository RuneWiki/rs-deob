import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class212 {

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    public int field3302;

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "Lna;")
    private static class26 field3283 = class69.method505("You can(Wt add yourself to your own friend list)3", (byte) -121);

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "Lna;")
    public static class26 field3281 = class69.method505(")2", (byte) -128);

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "Lna;")
    public static class26 field3286 = class69.method505("Interfaces charg-Bes", (byte) -122);

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field3279 = 0;

    @OriginalMember(owner = "client!ii", name = "q", descriptor = "Lna;")
    public static class26 field3293 = field3283;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "I")
    public int field3282;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    public int field3297;

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
    public int field3298;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
    public static int field3299;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "Ljg;")
    public class299 field3284;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "[I")
    public int[] field3280;

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "[I")
    public int[] field3289;

    @OriginalMember(owner = "client!ii", name = "n", descriptor = "[I")
    public int[] field3290;

    @OriginalMember(owner = "client!ii", name = "o", descriptor = "[I")
    public int[] field3291;

    @OriginalMember(owner = "client!ii", name = "p", descriptor = "[I")
    public int[] field3292;

    @OriginalMember(owner = "client!ii", name = "r", descriptor = "[I")
    public int[] field3294;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "[Ljg;")
    public class299[] field3300;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "[[I")
    public int[][] field3278;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "[[I")
    public int[][] field3295;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I)V", line = 20)
    public static void method1415(int arg0) {
        field3286 = null;
        field3281 = null;
        if (arg0 == 0) {
            field3283 = null;
            field3293 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lbe;III)V", line = 47)
    public static final void method1416(class297 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field4961 == 0) {
            arg0.field5014 = arg0.field4965;
        } else if (arg0.field4961 == 1) {
            arg0.field5014 = (arg2 - arg0.field4996) / 2 + arg0.field4965;
        } else if (arg0.field4961 == 2) {
            arg0.field5014 = arg2 - arg0.field4996 - arg0.field4965;
        } else if (arg0.field4961 == 3) {
            arg0.field5014 = arg0.field4965 * arg2 >> 14;
        } else if (arg0.field4961 == 4) {
            arg0.field5014 = (arg0.field4965 * arg2 >> 14) + (arg2 - arg0.field4996) / 2;
        } else {
            arg0.field5014 = arg2 - (arg0.field4965 * arg2 >> 14) - arg0.field4996;
        }
        field3287++;
        if (arg0.field5082 == 0) {
            arg0.field5118 = arg0.field5130;
        } else if (arg0.field5082 == 1) {
            arg0.field5118 = (arg3 - arg0.field4967) / 2 + arg0.field5130;
        } else if (arg0.field5082 == 2) {
            arg0.field5118 = arg3 - arg0.field4967 - arg0.field5130;
        } else if (arg0.field5082 == 3) {
            arg0.field5118 = arg0.field5130 * arg3 >> 14;
        } else if (arg0.field5082 == 4) {
            arg0.field5118 = (arg0.field5130 * arg3 >> 14) + (arg3 - arg0.field4967) / 2;
        } else {
            arg0.field5118 = arg3 - arg0.field4967 - (arg0.field5130 * arg3 >> 14);
        }
        if (class299.field5146 && (client.method1730(arg0).field5661 != 0 || arg0.field4988 == 0)) {
            if (arg0.field5014 < 0) {
                arg0.field5014 = 0;
            } else if (arg0.field5014 + arg0.field4996 > arg2) {
                arg0.field5014 = arg2 - arg0.field4996;
            }
            if (arg0.field5118 < 0) {
                arg0.field5118 = 0;
            } else if (arg3 < arg0.field5118 + arg0.field4967) {
                arg0.field5118 = arg3 - arg0.field4967;
            }
        }
        if (arg1 != 23730) {
            method1415(19);
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)V", line = 118)
    public static final void method1417(int arg0) {
        class305 var1 = class94.field1539;
        synchronized (class94.field1539) {
            if (arg0 != 18074) {
                field3281 = (class26) null;
            }
            class310.field5325 = class300.field5175;
            class136.field2090 = class23.field331;
            class259.field4235 = class313.field5352;
            class277.field4639 = class109.field1733;
            class205.field3210 = class236.field3745;
            class94.field1536++;
            class11.field152 = class110.field1756;
            class222.field3514 = class319.field5488;
            class109.field1733 = 0;
        }
        field3299++;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[B)V", line = 146)
    private final void method1418(int arg0, byte[] arg1) {
        field3296++;
        class82 var3 = new class82(class133.method903((byte) -114, arg1));
        int var4 = var3.method642((byte) -34);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field3298 = var3.method587(-502942936);
        } else {
            this.field3298 = 0;
        }
        int var5 = var3.method642((byte) -127);
        int var6 = 0;
        this.field3282 = var3.method576(arg0 ^ 0x3);
        int var7 = -1;
        this.field3289 = new int[this.field3282];
        for (int var8 = 0; var8 < this.field3282; var8++) {
            this.field3289[var8] = var6 += var3.method576(1);
            if (this.field3289[var8] > var7) {
                var7 = this.field3289[var8];
            }
        }
        this.field3297 = var7 + 1;
        this.field3294 = new int[this.field3297];
        this.field3295 = new int[this.field3297][];
        this.field3280 = new int[this.field3297];
        this.field3290 = new int[this.field3297];
        this.field3292 = new int[this.field3297];
        if (var5 != 0) {
            this.field3291 = new int[this.field3297];
            for (int var9 = 0; var9 < this.field3297; var9++) {
                this.field3291[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3282; var10++) {
                this.field3291[this.field3289[var10]] = var3.method587(class282.method1982(arg0, -502942934));
            }
            this.field3284 = new class299(this.field3291);
        }
        for (int var11 = 0; var11 < this.field3282; var11++) {
            this.field3280[this.field3289[var11]] = var3.method587(-502942936);
        }
        for (int var12 = 0; var12 < this.field3282; var12++) {
            this.field3294[this.field3289[var12]] = var3.method587(class282.method1982(arg0, -502942934));
        }
        int var13 = 0;
        if (arg0 != 2) {
            field3293 = (class26) null;
        }
        while (this.field3282 > var13) {
            this.field3292[this.field3289[var13]] = var3.method576(1);
            var13++;
        }
        for (int var14 = 0; var14 < this.field3282; var14++) {
            int var15 = 0;
            int var16 = this.field3289[var14];
            int var17 = this.field3292[var16];
            int var18 = -1;
            this.field3295[var16] = new int[var17];
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field3295[var16][var19] = var15 += var3.method576(1);
                if (var20 > var18) {
                    var18 = var20;
                }
            }
            this.field3290[var16] = var18 + 1;
            if ((var18 + 1) == var17) {
                this.field3295[var16] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field3300 = new class299[var7 + 1];
        this.field3278 = new int[var7 + 1][];
        for (int var21 = 0; var21 < this.field3282; var21++) {
            int var22 = this.field3289[var21];
            int var23 = this.field3292[var22];
            this.field3278[var22] = new int[this.field3290[var22]];
            for (int var24 = 0; var24 < this.field3290[var22]; var24++) {
                this.field3278[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field3295[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field3295[var22][var25];
                }
                this.field3278[var22][var26] = var3.method587(arg0 - 502942938);
            }
            this.field3300[var22] = new class299(this.field3278[var22]);
        }
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "([BI)V", line = 344)
    public class212(byte[] arg0, int arg1) {
        this.field3302 = class45.method344(arg0, arg0.length, false);
        if (this.field3302 != arg1) {
            throw new RuntimeException();
        }
        this.method1418(2, arg0);
    }
}
