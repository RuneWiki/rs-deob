import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class303 extends class156 {

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "I")
    private int field4600;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    private int field4592;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    private int field4584;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    private int field4583;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "[I")
    public static int[] field4588 = new int[14];

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "J")
    public static long field4581 = 0L;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    private int field4589;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    private int field4591;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    private int field4595;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    public static int field4599;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "I")
    private int field4602;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "I")
    public static int field4603;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "I")
    public static int field4604;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "[B")
    private byte[] field4593;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "[Lfd;")
    public static class206[] field4585;

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "[Z")
    public static boolean[] field4607;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V", line = 6)
    public final void method489(int arg0) {
        this.field4595 >>= 0x4;
        field4587++;
        if (this.field4595 < 0) {
            this.field4595 = 0;
        } else if (this.field4595 > 255) {
            this.field4595 = 255;
        }
        this.field4583 = this.field4584;
        if (arg0 <= 90) {
            method2012(-108, false, 97);
        }
        this.method2013(this.field4602++, (byte) this.field4595);
        this.field4595 = 0;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIIFFF)V", line = 29)
    public class303(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field4600 = (int) (arg7 * 4096.0F);
        this.field4592 = (int) (arg6 * 4096.0F);
        this.field4583 = this.field4584 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)I", line = 40)
    public static final int method2010(int arg0, String arg1, String arg2, int arg3) {
        field4586++;
        int var4 = arg2.length();
        int var5 = arg1.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > (var6 - var9) || var7 - var8 < var5) {
            if (var4 <= var6 - var9) {
                return -1;
            }
            if (var7 - var8 >= var5) {
                return 1;
            }
            char var23;
            if (var9 == '\u0000') {
                var23 = arg2.charAt(var6++);
            } else {
                var23 = var9;
                boolean var24 = false;
            }
            char var25;
            if (var8 == '\u0000') {
                var25 = arg1.charAt(var7++);
            } else {
                var25 = var8;
                boolean var26 = false;
            }
            var9 = class188.method1203(var23, (byte) 99);
            var8 = class188.method1203(var25, (byte) 97);
            char var27 = class259.method1738(var23, arg0, -79);
            char var28 = class259.method1738(var25, arg0, 94);
            if (var27 != var28 && Character.toUpperCase(var27) != Character.toUpperCase(var28)) {
                char var29 = Character.toLowerCase(var27);
                char var30 = Character.toLowerCase(var28);
                if (var29 != var30) {
                    return class328.method2277(-120, var29, arg0) - class328.method2277(-128, var30, arg0);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        int var11 = 50 / ((arg3 + 46) / 36);
        for (int var12 = 0; var12 < var10; var12++) {
            int var13;
            int var14;
            if (arg0 == 2) {
                var13 = var5 - var12 - 1;
                var14 = var4 - var12 - 1;
            } else {
                var13 = var12;
                var14 = var12;
            }
            char var15 = arg2.charAt(var14);
            char var16 = arg1.charAt(var13);
            if (var15 != var16 && Character.toUpperCase(var15) != Character.toUpperCase(var16)) {
                char var17 = Character.toLowerCase(var15);
                char var18 = Character.toLowerCase(var16);
                if (var17 != var18) {
                    return class328.method2277(-119, var17, arg0) - class328.method2277(-123, var18, arg0);
                }
            }
        }
        int var19 = var4 - var5;
        if (var19 != 0) {
            return var19;
        }
        for (int var20 = 0; var20 < var10; var20++) {
            char var21 = arg2.charAt(var20);
            char var22 = arg1.charAt(var20);
            if (var21 != var22) {
                return class328.method2277(-114, var21, arg0) - class328.method2277(-122, var22, arg0);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)V", line = 163)
    public final void method488(int arg0, int arg1, int arg2) {
        field4598++;
        if (arg1 == 0) {
            this.field4589 = this.field4592 - (arg2 < 0 ? -arg2 : arg2);
            this.field4589 = this.field4589 * this.field4589 >> 12;
            this.field4591 = 4096;
            this.field4595 = this.field4589;
        } else {
            this.field4591 = this.field4600 * this.field4589 >> 12;
            this.field4589 = this.field4592 - (arg2 < 0 ? -arg2 : arg2);
            this.field4589 = this.field4589 * this.field4589 >> 12;
            if (this.field4591 < 0) {
                this.field4591 = 0;
            } else if (this.field4591 > 4096) {
                this.field4591 = 4096;
            }
            this.field4589 = this.field4591 * this.field4589 >> 12;
            this.field4595 += this.field4589 * this.field4583 >> 12;
            this.field4583 = this.field4584 * this.field4583 >> 12;
        }
        if (arg0 != -850495892) {
            this.method2013(-49, (byte) -63);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)I", line = 198)
    public static final int method2011(int arg0, int arg1) {
        field4590++;
        return arg0 >= -74 ? -13 : arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZI)V", line = 217)
    public static final void method2012(int arg0, boolean arg1, int arg2) {
        class156.field2530++;
        class14.field263.method80(173, (byte) 108);
        if (!arg1) {
            field4605++;
            class14.field263.method1339(arg2, (byte) 118);
            class14.field263.method1313(arg0, -376480);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)V", line = 237)
    public void method2013(int arg0, byte arg1) {
        this.field4593[arg0] = arg1;
        field4604++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIBIIIII)V", line = 248)
    public static final void method2014(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4582++;
        int var8 = class8.method73(8, class186.field3028, class59.field1162, arg4);
        int var9 = class8.method73(8, class186.field3028, class59.field1162, arg3);
        int var10 = class8.method73(8, class259.field4024, class147.field2416, arg1);
        int var11 = class8.method73(8, class259.field4024, class147.field2416, arg5);
        int var12 = class8.method73(8, class186.field3028, class59.field1162, arg4 + arg6);
        int var13 = class8.method73(8, class186.field3028, class59.field1162, arg3 - arg6);
        for (int var14 = var8; var14 < var12; var14++) {
            class241.method1598(arg7, -7, class155.field2522[var14], var11, var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class241.method1598(arg7, -7, class155.field2522[var15], var11, var10);
        }
        int var16 = class8.method73(8, class259.field4024, class147.field2416, arg1 + arg6);
        int var17 = class8.method73(8, class259.field4024, class147.field2416, arg5 - arg6);
        if (arg2 < 94) {
            field4606 = 127;
        }
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class155.field2522[var18];
            class241.method1598(arg7, -7, var19, var16, var10);
            class241.method1598(arg0, -7, var19, var17, var16);
            class241.method1598(arg7, -7, var19, var11, var17);
        }
    }

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)V", line = 304)
    public static void method2015(int arg0) {
        field4585 = null;
        field4607 = null;
        field4588 = null;
        if (arg0 != 4096) {
            field4606 = -47;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 319)
    public static final int method2016(String arg0, boolean arg1) {
        field4594++;
        if (class222.field3517 == null || arg0.length() == 0) {
            return -1;
        }
        for (int var2 = 0; var2 < class222.field3517.field3672; var2++) {
            if (class208.method1407(class222.field3517.field3673[var2], "<br>", " ", 89).equals(arg0)) {
                return var2;
            }
        }
        if (arg1) {
            method2010(-100, (String) null, (String) null, 104);
        }
        return -1;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 344)
    public final void method493(byte arg0) {
        this.field4595 = 0;
        field4603++;
        if (arg0 != -85) {
            method2010(77, (String) null, (String) null, -30);
        }
        this.field4602 = 0;
    }
}
