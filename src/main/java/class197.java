import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public abstract class class197 {

    @OriginalMember(owner = "client!js", name = "b", descriptor = "[S")
    private short[] field2773 = new short[512];

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    private int field2775 = 4;

    @OriginalMember(owner = "client!js", name = "j", descriptor = "I")
    public int field2781 = 4;

    @OriginalMember(owner = "client!js", name = "s", descriptor = "I")
    private int field2790 = 4;

    @OriginalMember(owner = "client!js", name = "p", descriptor = "I")
    private int field2787 = 0;

    @OriginalMember(owner = "client!js", name = "r", descriptor = "I")
    private int field2789 = 4;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "Lcm;")
    public static class449 field2778 = new class449(75, 6);

    @OriginalMember(owner = "client!js", name = "n", descriptor = "[I")
    public static int[] field2785 = new int[256];

    @OriginalMember(owner = "client!js", name = "m", descriptor = "Z")
    public static boolean field2784 = false;

    @OriginalMember(owner = "client!js", name = "q", descriptor = "Z")
    public static boolean field2788 = false;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!js", name = "k", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!js", name = "l", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!js", name = "t", descriptor = "[I")
    public static int[] field2791;

    @OriginalMember(owner = "client!js", name = "o", descriptor = "[S")
    private short[] field2786;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(Z)V", line = 5)
    private final void method1377(boolean arg0) {
        this.field2786 = new short[this.field2781];
        field2782++;
        if (arg0) {
            for (int var2 = 0; var2 < this.field2781; var2++) {
                this.field2786[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIII)V", line = 25)
    public final void method1378(int arg0, int arg1, int arg2, int arg3) {
        field2774++;
        if (arg2 != -29917) {
            return;
        }
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg3];
        for (int var7 = 0; var7 < arg1; var7++) {
            var5[var7] = (var7 << 12) / arg1;
        }
        int[] var8 = new int[arg0];
        for (int var9 = 0; var9 < arg3; var9++) {
            var6[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var8[var10] = (var10 << 12) / arg0;
        }
        this.method8(-78);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field2781; var14++) {
                        int var15 = this.field2786[var14] << 12;
                        int var16 = this.field2775 * var15 >> 12;
                        int var17 = this.field2789 * var15 >> 12;
                        int var18 = var5[var13] * var15 >> 12;
                        int var19 = var8[var11] * var15 >> 12;
                        int var20 = this.field2790 * var15 >> 12;
                        int var21 = var6[var12] * var15 >> 12;
                        int var22 = this.field2789 * var19;
                        int var23 = this.field2790 * var18;
                        int var24 = this.field2775 * var21;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var24 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var22 >> 12;
                        int var31 = var27 & 0xFF;
                        int var32 = var30 + 1;
                        int var33 = var23 & 0xFFF;
                        int var34;
                        if (var32 >= var17) {
                            var34 = 0;
                        } else {
                            var34 = var32 & 0xFF;
                        }
                        int var35;
                        if (var20 <= var26) {
                            var35 = 0;
                        } else {
                            var35 = var26 & 0xFF;
                        }
                        int var36 = var30 & 0xFF;
                        int var37 = var24 & 0xFFF;
                        int var38;
                        if (var29 >= var16) {
                            var38 = 0;
                        } else {
                            var38 = var29 & 0xFF;
                        }
                        int var39 = var22 & 0xFFF;
                        int var40 = class328.field5033[var39];
                        int var41 = var39 - 4096;
                        int var42 = var33 - 4096;
                        int var43 = var37 - 4096;
                        int var44 = class328.field5033[var37];
                        short var45 = this.field2773[var34];
                        int var46 = class328.field5033[var33];
                        short var47 = this.field2773[var36];
                        short var48 = this.field2773[var38 + var45];
                        short var49 = this.field2773[var31 + var47];
                        short var50 = this.field2773[var31 + var45];
                        short var51 = this.field2773[var38 + var47];
                        int var52 = class119.method767((byte) -119, var37, var33, this.field2773[var28 + var49], var39);
                        int var53 = class119.method767((byte) -119, var37, var42, this.field2773[var35 + var49], var39);
                        int var54 = ((var53 - var52) * var46 >> 12) + var52;
                        int var55 = class119.method767((byte) -119, var43, var33, this.field2773[var28 + var51], var39);
                        int var56 = class119.method767((byte) -119, var43, var42, this.field2773[var35 + var51], var39);
                        int var57 = var55 + ((var56 - var55) * var46 >> 12);
                        int var58 = var54 + ((var57 - var54) * var44 >> 12);
                        int var59 = class119.method767((byte) -119, var37, var33, this.field2773[var28 + var50], var41);
                        int var60 = class119.method767((byte) -119, var37, var42, this.field2773[var35 + var50], var41);
                        int var61 = var59 + ((var60 - var59) * var46 >> 12);
                        int var62 = class119.method767((byte) -119, var43, var33, this.field2773[var28 + var48], var41);
                        int var63 = class119.method767((byte) -119, var43, var42, this.field2773[var35 + var48], var41);
                        int var64 = ((var63 - var62) * var46 >> 12) + var62;
                        int var65 = ((var64 - var61) * var44 >> 12) + var61;
                        this.method1(var58 + ((var65 - var58) * var40 >> 12), var14, 1);
                    }
                    this.method12((byte) 114);
                }
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([IB[ILrk;[I)V", line = 191)
    public static final void method1379(int[] arg0, byte arg1, int[] arg2, class194 arg3, int[] arg4) {
        if (arg1 >= -30) {
            return;
        }
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg2[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (var7 != 0 && arg3.field5288.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field5288[var9] = null;
                    } else {
                        class270 var10 = class260.field3621.method1934(126, var6);
                        int var11 = var10.field3735;
                        class113 var12 = arg3.field5288[var9];
                        if (var12 != null) {
                            if (var12.field1587 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field5288[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1585 = 0;
                                    var12.field1583 = var8;
                                    var12.field1586 = 1;
                                    var12.field1579 = 0;
                                    var12.field1574 = 0;
                                    class445.method2678(false, 0, arg3.field2210, var10, arg3.field2217, (byte) 43, arg3.field2215);
                                } else if (var11 == 2) {
                                    var12.field1574 = 0;
                                }
                            } else if (var10.field3756 >= class260.field3621.method1934(116, var12.field1587).field3756) {
                                var12 = arg3.field5288[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class113 var13 = arg3.field5288[var9] = new class113();
                            var13.field1574 = 0;
                            var13.field1586 = 1;
                            var13.field1587 = var6;
                            var13.field1579 = 0;
                            var13.field1585 = 0;
                            var13.field1583 = var8;
                            class445.method2678(false, 0, arg3.field2210, var10, arg3.field2217, (byte) 34, arg3.field2215);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field2772++;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V", line = 287)
    public static void method1380(byte arg0) {
        field2785 = null;
        if (arg0 != 91) {
            method1380((byte) -87);
        }
        field2791 = null;
        field2778 = null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IC)Z", line = 305)
    public static final boolean method1381(int arg0, char arg1) {
        if (arg0 <= 118) {
            return true;
        } else {
            field2779++;
            return arg1 >= '0' && arg1 <= '9';
        }
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(IIIII)V", line = 424)
    public class197(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2789 = arg4;
        this.field2775 = arg3;
        this.field2790 = arg2;
        this.field2787 = arg0;
        this.field2781 = arg1;
        this.method1377(true);
        this.method1383((byte) -17);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(BI)V", line = 323)
    public static final void method1382(byte arg0, int arg1) {
        int var2 = -35 / ((51 - arg0) / 56);
        field2777++;
        class377 var3 = class99.method672(arg1, false, 4);
        var3.method2339(-11688);
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(B)V", line = 368)
    private final void method1383(byte arg0) {
        field2780++;
        Random var2 = new Random((long) this.field2787);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field2773[var3] = (short) var3;
        }
        int var4 = 0;
        if (arg0 != -17) {
            field2791 = null;
        }
        while (var4 < 255) {
            int var5 = 255 - var4;
            int var6 = class455.method2740(-8, var2, var5);
            short var7 = this.field2773[var6];
            this.field2773[var6] = this.field2773[var5];
            this.field2773[var5] = this.field2773[var5 + 256] = var7;
            var4++;
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)[Lwi;", line = 406)
    public static final class340[] method1384(int arg0) {
        if (arg0 == -1214668628) {
            field2776++;
            return new class340[] { class170.field2469, class10.field165, class115.field1596, class421.field6291, class278.field3847, class429.field6373, class149.field2151, class201.field2836, class405.field6117, class472.field6897, class340.field5374, class263.field3652, class290.field4311, class395.field6015 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(III)V")
    public abstract void method1(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V")
    public abstract void method8(int arg0);

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(B)V")
    public abstract void method12(byte arg0);
}
