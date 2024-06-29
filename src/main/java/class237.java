import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public abstract class class237 {

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public int field3642 = 4;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
    private int field3652 = 4;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    private int field3648 = 0;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    private int field3653 = 4;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    private int field3641 = 4;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "[S")
    private short[] field3654 = new short[512];

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "Ljava/lang/String;")
    public static String field3640 = "Loading fonts - ";

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field3639 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "Z")
    public static volatile boolean field3646 = true;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "Z")
    public static boolean field3650 = true;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "[S")
    private short[] field3643;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V", line = 12)
    public static final void method1638(byte arg0) {
        field3647++;
        if (arg0 <= 4) {
            field3639 = -71;
        }
        if (class103.method653(-29308) || class219.field3290 == class207.field3127) {
            class108.method697(false);
            if (class219.field3290 != class190.field2854) {
                class168.method1191((byte) -101);
            }
        } else {
            class229.method1587(false, class11.field113.field3786[0], class344.field5466, class11.field113.field3747[0], class84.field1099, false, 8, class219.field3290);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V", line = 33)
    public static void method1639(boolean arg0) {
        field3640 = null;
        if (arg0) {
            field3646 = true;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIZ)V", line = 46)
    public static final void method1640(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class236.field3633 = arg1;
        class293.field4607 = arg2;
        class2.field26 = arg3;
        class236.field3634 = new class196[arg0][class236.field3633][class293.field4607];
        class214.field3247 = new int[arg0][class236.field3633 + 1][class293.field4607 + 1];
        if (class272.field4317) {
            class62.field748 = new class175[4][];
        }
        if (arg4) {
            class6.field76 = new class196[1][class236.field3633][class293.field4607];
            class161.field2484 = new int[class236.field3633][class293.field4607];
            class349.field5572 = new int[1][class236.field3633 + 1][class293.field4607 + 1];
            if (class272.field4317) {
                class120.field1669 = new class175[1][];
            }
        } else {
            class6.field76 = (class196[][][]) null;
            class161.field2484 = (int[][]) null;
            class349.field5572 = (int[][][]) null;
            class120.field1669 = (class175[][]) null;
        }
        class271.method1920(false);
        class123.field1700 = new class85[500];
        class135.field2026 = 0;
        class85.field1102 = new class85[500];
        class326.field5223 = 0;
        class231.field3495 = new int[arg0][class236.field3633 + 1][class293.field4607 + 1];
        class342.field5422 = new class44[5000];
        class214.field3253 = 0;
        class301.field4699 = new class44[100];
        class262.field4145 = new boolean[class2.field26 + class2.field26 + 1][class2.field26 + class2.field26 + 1];
        class189.field2843 = new boolean[class2.field26 + class2.field26 + 2][class2.field26 + class2.field26 + 2];
        class207.field3132 = new byte[arg0][class236.field3633][class293.field4607];
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(IIIII)V", line = 492)
    public class237(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3641 = arg4;
        this.field3652 = arg3;
        this.field3648 = arg0;
        this.field3642 = arg1;
        this.field3653 = arg2;
        this.method1644((byte) 48);
        this.method1647((byte) 19);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BIII)V", line = 106)
    public final void method1642(byte arg0, int arg1, int arg2, int arg3) {
        field3651++;
        if (arg0 >= -55) {
            this.field3648 = -107;
        }
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg1];
        int[] var7 = new int[arg3];
        for (int var8 = 0; var8 < arg2; var8++) {
            var5[var8] = (var8 << 12) / arg2;
        }
        for (int var9 = 0; var9 < arg3; var9++) {
            var7[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var6[var10] = (var10 << 12) / arg1;
        }
        this.method1643((byte) 12);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field3642; var14++) {
                        int var15 = this.field3643[var14] << 12;
                        int var16 = var5[var13] * var15 >> 12;
                        int var17 = this.field3653 * var16;
                        int var18 = this.field3653 * var15 >> 12;
                        int var19 = var6[var11] * var15 >> 12;
                        int var20 = var7[var12] * var15 >> 12;
                        int var21 = this.field3641 * var19;
                        int var22 = var17 >> 12;
                        int var23 = this.field3652 * var20;
                        int var24 = var23 >> 12;
                        int var25 = this.field3652 * var15 >> 12;
                        int var26 = var22 + 1;
                        int var27 = var22 & 0xFF;
                        int var28 = var17 & 0xFFF;
                        int var29 = var28 - 4096;
                        int var30 = var23 & 0xFFF;
                        int var31 = class95.field1312[var28];
                        int var32 = this.field3641 * var15 >> 12;
                        int var33 = var21 >> 12;
                        int var34 = class95.field1312[var30];
                        int var35 = var33 + 1;
                        int var36 = var33 & 0xFF;
                        int var37 = var21 & 0xFFF;
                        short var38 = this.field3654[var36];
                        int var39 = var24 + 1;
                        int var40 = class95.field1312[var37];
                        int var41;
                        if (var32 > var35) {
                            var41 = var35 & 0xFF;
                        } else {
                            var41 = 0;
                        }
                        int var42;
                        if (var39 >= var25) {
                            var42 = 0;
                        } else {
                            var42 = var39 & 0xFF;
                        }
                        int var43 = var24 & 0xFF;
                        int var44 = var37 - 4096;
                        short var45 = this.field3654[var41];
                        short var46 = this.field3654[var43 + var45];
                        short var47 = this.field3654[var42 + var45];
                        int var48;
                        if (var26 >= var18) {
                            var48 = 0;
                        } else {
                            var48 = var26 & 0xFF;
                        }
                        short var49 = this.field3654[var38 + var43];
                        int var50 = var30 - 4096;
                        short var51 = this.field3654[var38 + var42];
                        int var52 = class86.method545(var28, this.field3654[var27 + var49], var30, 4096, var37);
                        int var53 = class86.method545(var29, this.field3654[var48 + var49], var30, 4096, var37);
                        int var54 = ((var53 - var52) * var31 >> 12) + var52;
                        int var55 = class86.method545(var28, this.field3654[var27 + var51], var50, 4096, var37);
                        int var56 = class86.method545(var29, this.field3654[var48 + var51], var50, 4096, var37);
                        int var57 = var55 + ((var56 - var55) * var31 >> 12);
                        int var58 = class86.method545(var28, this.field3654[var27 + var46], var30, 4096, var44);
                        int var59 = ((var57 - var54) * var34 >> 12) + var54;
                        int var60 = class86.method545(var29, this.field3654[var48 + var46], var30, 4096, var44);
                        int var61 = ((var60 - var58) * var31 >> 12) + var58;
                        int var62 = class86.method545(var28, this.field3654[var27 + var47], var50, 4096, var44);
                        int var63 = class86.method545(var29, this.field3654[var47 + var48], var50, 4096, var44);
                        int var64 = var62 + ((var63 - var62) * var31 >> 12);
                        int var65 = ((var64 - var61) * var34 >> 12) + var61;
                        this.method1641((byte) -99, ((var65 - var59) * var40 >> 12) + var59, var14);
                    }
                    this.method1637(-125);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(B)V", line = 272)
    private final void method1644(byte arg0) {
        field3645++;
        this.field3643 = new short[this.field3642];
        if (arg0 == 48) {
            for (int var2 = 0; var2 < this.field3642; var2++) {
                this.field3643[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lnk;ILnk;)V", line = 294)
    public static final void method1645(class16 arg0, int arg1, class16 arg2) {
        if (arg1 >= 22) {
            field3649++;
            class344.field5467 = arg0;
            class92.field1207 = arg2;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIIIIIILio;IZJ)Z", line = 306)
    public static final boolean method1646(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class294 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class72.field902 == class349.field5572;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class236.field3633 || var16 >= class293.field4607) {
                    return false;
                }
                class196 var17 = class194.field2947[arg0][var15][var16];
                if (var17 != null && var17.field2979 >= 5) {
                    return false;
                }
            }
        }
        class44 var18 = new class44();
        var18.field502 = arg11;
        var18.field510 = arg0;
        var18.field503 = arg5;
        var18.field509 = arg6;
        var18.field499 = arg7;
        var18.field494 = arg8;
        var18.field496 = arg9;
        var18.field504 = arg1;
        var18.field497 = arg2;
        var18.field501 = arg1 + arg3 - 1;
        var18.field498 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class194.field2947[var22][var19][var20] == null) {
                        class194.field2947[var22][var19][var20] = new class196(var22, var19, var20);
                    }
                }
                class196 var23 = class194.field2947[arg0][var19][var20];
                var23.field2998[var23.field2979] = var18;
                var23.field2988[var23.field2979] = var21;
                var23.field2981 |= var21;
                var23.field2979++;
                if (var13 && class161.field2484[var19][var20] != 0) {
                    var14 = class161.field2484[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class161.field2484[var24][var25] == 0) {
                        class161.field2484[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class342.field5422[class214.field3253++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(B)V", line = 435)
    private final void method1647(byte arg0) {
        Random var2 = new Random((long) this.field3648);
        int var3 = -124 / ((69 - arg0) / 47);
        field3644++;
        for (int var4 = 0; var4 < 255; var4++) {
            this.field3654[var4] = (short) var4;
        }
        for (int var5 = 0; var5 < 255; var5++) {
            int var6 = 255 - var5;
            int var7 = class220.method1534(var6, var2, 2);
            short var8 = this.field3654[var7];
            this.field3654[var7] = this.field3654[var6];
            this.field3654[var6] = this.field3654[var6 + 256] = var8;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public abstract void method1637(int arg0);

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(BII)V")
    public abstract void method1641(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
    public abstract void method1643(byte arg0);
}
