import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class123 extends class259 {

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "[I")
    private final int[] field2080 = new int[this.field4339];

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "Lce;")
    public static class126 field2079 = class206.method1445(-7923, "<br>(X");

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "Lce;")
    public static class126 field2083 = class206.method1445(-7923, "Hierhin drehen");

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "Lce;")
    public static class126 field2081 = class206.method1445(-7923, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "[I")
    public static int[] field2089 = new int[100];

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "Lva;")
    public static class205 field2087 = null;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    private int field2082;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    private int field2085;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "[B")
    private byte[] field2091;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BIII)V", line = 4)
    public static final void method820(byte arg0, int arg1, int arg2, int arg3) {
        field2092++;
        class112 var4 = class53.method337((byte) -127, arg3, arg2);
        if (var4 != null && var4.field1881 != null) {
            class282 var5 = new class282();
            var5.field4699 = var4.field1881;
            var5.field4697 = var4;
            class309.method2111(var5, 200000);
        }
        class52.field797 = arg2;
        class189.field3250 = arg3;
        if (arg0 > 55) {
            class313.field5371 = true;
            class9.field105 = arg1;
            class23.method114(var4, (byte) 94);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)V", line = 43)
    public final void method821(int arg0, int arg1, int arg2) {
        this.field2082 += this.field2080[arg0] * arg1 >> 12;
        if (arg2 != 128) {
            method824(-32);
        }
        field2084++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IB)V", line = 71)
    public void method822(int arg0, byte arg1) {
        this.field2091[this.field2085++] = (byte) ((class47.method289(255, arg1) >> 1) + 127);
        field2095++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILvh;)V", line = 81)
    public static final void method823(int arg0, class147 arg1) {
        field2094++;
        class222 var2 = null;
        try {
            class60 var3 = arg1.method1100((byte) 74, "runescape");
            while (var3.field965 == 0) {
                class313.method2158(1L, true);
            }
            if (arg0 != -21165) {
                field2089 = (int[]) null;
            }
            if (var3.field965 == 1) {
                var2 = (class222) var3.field967;
                class134 var4 = class218.method1494(32225);
                var2.method1527(-82, 0, var4.field2299, var4.field2282);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1525(0);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "(I)V", line = 119)
    public static void method824(int arg0) {
        field2081 = null;
        field2089 = null;
        field2083 = null;
        field2079 = null;
        if (arg0 != 1220) {
            field2081 = (class126) null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 145)
    public final void method825(int arg0) {
        this.field2082 = Math.abs(this.field2082);
        if (this.field2082 >= 4096) {
            this.field2082 = 4095;
        }
        field2096++;
        if (arg0 <= 21) {
            field2089 = (int[]) null;
        }
        this.method822(this.field2085++, (byte) (this.field2082 >> 4));
        this.field2082 = 0;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIIF)V", line = 164)
    public class123(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field4339; var7++) {
            this.field2080[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BIIIIII)V", line = 182)
    public static final void method826(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class136.method987(arg4, true);
        int var7 = arg4 - arg3;
        int var8 = 0;
        field2086++;
        if (var7 < 0) {
            var7 = 0;
        }
        int var9 = -arg4;
        if (arg0 <= 25) {
            return;
        }
        int var10 = var7;
        int var11 = -1;
        int var12 = arg4;
        int var13 = -1;
        if (arg6 >= class197.field3372 && class194.field3302 >= arg6) {
            int[] var14 = class314.field5393[arg6];
            int var15 = class94.method645(class321.field5489, 0, arg5 - arg4, class52.field795);
            int var16 = class94.method645(class321.field5489, 0, arg4 + arg5, class52.field795);
            int var17 = class94.method645(class321.field5489, 0, arg5 - var7, class52.field795);
            int var18 = class94.method645(class321.field5489, 0, arg5 + var7, class52.field795);
            class94.method647(var14, var15, -7, var17, arg1);
            class94.method647(var14, var17, -7, var18, arg2);
            class94.method647(var14, var18, -7, var16, arg1);
        }
        int var19 = -var7;
        while (var12 > var8) {
            var11 += 2;
            var9 += var11;
            var13 += 2;
            var19 += var13;
            if (var19 >= 0 && var10 >= 1) {
                var10--;
                class70.field1150[var10] = var8;
                var19 -= var10 << 1;
            }
            var8++;
            if (var9 >= 0) {
                var12--;
                var9 -= var12 << 1;
                int var20 = arg6 - var12;
                int var21 = arg6 + var12;
                if (var21 >= class197.field3372 && var20 <= class194.field3302) {
                    if (var7 > var12) {
                        int var22 = class70.field1150[var12];
                        int var23 = class94.method645(class321.field5489, 0, arg5 + var8, class52.field795);
                        int var24 = class94.method645(class321.field5489, 0, arg5 - var8, class52.field795);
                        int var25 = class94.method645(class321.field5489, 0, arg5 + var22, class52.field795);
                        int var26 = class94.method645(class321.field5489, 0, arg5 - var22, class52.field795);
                        if (class194.field3302 >= var21) {
                            int[] var27 = class314.field5393[var21];
                            class94.method647(var27, var24, -7, var26, arg1);
                            class94.method647(var27, var26, -7, var25, arg2);
                            class94.method647(var27, var25, -7, var23, arg1);
                        }
                        if (var20 >= class197.field3372) {
                            int[] var28 = class314.field5393[var20];
                            class94.method647(var28, var24, -7, var26, arg1);
                            class94.method647(var28, var26, -7, var25, arg2);
                            class94.method647(var28, var25, -7, var23, arg1);
                        }
                    } else {
                        int var29 = class94.method645(class321.field5489, 0, arg5 + var8, class52.field795);
                        int var30 = class94.method645(class321.field5489, 0, arg5 - var8, class52.field795);
                        if (class194.field3302 >= var21) {
                            class94.method647(class314.field5393[var21], var30, -7, var29, arg1);
                        }
                        if (var20 >= class197.field3372) {
                            class94.method647(class314.field5393[var20], var30, -7, var29, arg1);
                        }
                    }
                }
            }
            int var31 = arg6 + var8;
            int var32 = arg6 - var8;
            if (var31 >= class197.field3372 && var32 <= class194.field3302) {
                int var33 = arg5 - var12;
                int var34 = arg5 + var12;
                if (class321.field5489 <= var34 && var33 <= class52.field795) {
                    int var35 = class94.method645(class321.field5489, 0, var34, class52.field795);
                    int var36 = class94.method645(class321.field5489, 0, var33, class52.field795);
                    if (var8 < var7) {
                        int var37 = var8 > var10 ? class70.field1150[var8] : var10;
                        int var38 = class94.method645(class321.field5489, 0, arg5 + var37, class52.field795);
                        int var39 = class94.method645(class321.field5489, 0, arg5 - var37, class52.field795);
                        if (class194.field3302 >= var31) {
                            int[] var40 = class314.field5393[var31];
                            class94.method647(var40, var36, -7, var39, arg1);
                            class94.method647(var40, var39, -7, var38, arg2);
                            class94.method647(var40, var38, -7, var35, arg1);
                        }
                        if (class197.field3372 <= var32) {
                            int[] var41 = class314.field5393[var32];
                            class94.method647(var41, var36, -7, var39, arg1);
                            class94.method647(var41, var39, -7, var38, arg2);
                            class94.method647(var41, var38, -7, var35, arg1);
                        }
                    } else {
                        if (class194.field3302 >= var31) {
                            class94.method647(class314.field5393[var31], var36, -7, var35, arg1);
                        }
                        if (var32 >= class197.field3372) {
                            class94.method647(class314.field5393[var32], var36, -7, var35, arg1);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V", line = 368)
    public final void method827(int arg0) {
        if (arg0 != -5437) {
            this.field2085 = -10;
        }
        this.field2085 = 0;
        field2090++;
        this.field2082 = 0;
    }
}
