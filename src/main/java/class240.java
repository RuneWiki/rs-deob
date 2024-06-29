import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public abstract class class240 {

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    private int field3571 = 4;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    private int field3578 = 4;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public int field3577 = 4;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "[S")
    private short[] field3575 = new short[512];

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    private int field3580 = 0;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    private int field3579 = 4;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "[I")
    public static int[] field3582 = new int[32];

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "[I")
    public static int[] field3574;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "[S")
    private short[] field3584;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 8)
    private final void method1627(int arg0) {
        field3573++;
        this.field3584 = new short[this.field3577];
        for (int var2 = arg0; var2 < this.field3577; var2++) {
            this.field3584[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(IIIII)V", line = 358)
    public class240(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3580 = arg0;
        this.field3577 = arg1;
        this.field3579 = arg4;
        this.field3578 = arg3;
        this.field3571 = arg2;
        this.method1627(0);
        this.method1631(0);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIII)V", line = 28)
    public final void method1628(int arg0, int arg1, int arg2, int arg3) {
        field3583++;
        int[] var5 = new int[arg1];
        for (int var6 = 0; var6 < arg1; var6++) {
            var5[var6] = (var6 << 12) / arg1;
        }
        if (arg3 != 255) {
            this.field3577 = 50;
        }
        int[] var7 = new int[arg0];
        int[] var8 = new int[arg2];
        for (int var9 = 0; var9 < arg2; var9++) {
            var8[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var7[var10] = (var10 << 12) / arg0;
        }
        this.method1395(4);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field3577; var14++) {
                        int var15 = this.field3584[var14] << 12;
                        int var16 = var8[var12] * var15 >> 12;
                        int var17 = this.field3571 * var15 >> 12;
                        int var18 = var7[var11] * var15 >> 12;
                        int var19 = this.field3579 * var18;
                        int var20 = var5[var13] * var15 >> 12;
                        int var21 = this.field3571 * var20;
                        int var22 = this.field3579 * var15 >> 12;
                        int var23 = var19 >> 12;
                        int var24 = var21 >> 12;
                        int var25 = this.field3578 * var16;
                        int var26 = var21 & 0xFFF;
                        int var27 = this.field3578 * var15 >> 12;
                        int var28 = var26 - 4096;
                        int var29 = var23 + 1;
                        int var30 = class261.field3949[var26];
                        int var31 = var24 + 1;
                        int var32 = var24 & 0xFF;
                        int var33;
                        if (var29 >= var22) {
                            var33 = 0;
                        } else {
                            var33 = var29 & 0xFF;
                        }
                        short var34 = this.field3575[var33];
                        int var35 = var23 & 0xFF;
                        short var36 = this.field3575[var35];
                        int var37 = var19 & 0xFFF;
                        int var38 = class261.field3949[var37];
                        int var39 = var25 >> 12;
                        int var40 = var37 - 4096;
                        int var41;
                        if (var17 > var31) {
                            var41 = var31 & 0xFF;
                        } else {
                            var41 = 0;
                        }
                        int var42 = var39 + 1;
                        int var43 = var25 & 0xFFF;
                        int var44 = var43 - 4096;
                        int var45;
                        if (var27 > var42) {
                            var45 = var42 & 0xFF;
                        } else {
                            var45 = 0;
                        }
                        short var46 = this.field3575[var36 + var45];
                        int var47 = var39 & 0xFF;
                        int var48 = class261.field3949[var43];
                        short var49 = this.field3575[var34 + var45];
                        short var50 = this.field3575[var36 + var47];
                        short var51 = this.field3575[var47 + var34];
                        int var52 = class243.method1645(var26, this.field3575[var32 + var50], var43, (byte) -118, var37);
                        int var53 = class243.method1645(var28, this.field3575[var41 + var50], var43, (byte) -118, var37);
                        int var54 = ((var53 - var52) * var30 >> 12) + var52;
                        int var55 = class243.method1645(var26, this.field3575[var32 + var46], var44, (byte) -118, var37);
                        int var56 = class243.method1645(var28, this.field3575[var41 + var46], var44, (byte) -118, var37);
                        int var57 = ((var56 - var55) * var30 >> 12) + var55;
                        int var58 = class243.method1645(var26, this.field3575[var32 + var51], var43, (byte) -118, var40);
                        int var59 = ((var57 - var54) * var48 >> 12) + var54;
                        int var60 = class243.method1645(var28, this.field3575[var41 + var51], var43, (byte) -118, var40);
                        int var61 = ((var60 - var58) * var30 >> 12) + var58;
                        int var62 = class243.method1645(var26, this.field3575[var32 + var49], var44, (byte) -118, var40);
                        int var63 = class243.method1645(var28, this.field3575[var41 + var49], var44, (byte) -118, var40);
                        int var64 = ((var63 - var62) * var30 >> 12) + var62;
                        int var65 = ((var64 - var61) * var48 >> 12) + var61;
                        this.method1387(var14, var59 + ((var65 - var59) * var38 >> 12), arg3 ^ 0xFF);
                    }
                    this.method1389(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V", line = 199)
    public static void method1629(int arg0) {
        field3582 = null;
        field3574 = null;
        if (arg0 != -696178004) {
            field3582 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILnj;IIBI)Lnj;", line = 219)
    public static final class100 method1630(int arg0, int arg1, class100 arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg5 != 76) {
            field3574 = (int[]) null;
        }
        long var7 = (long) arg1;
        field3581++;
        class100 var9 = (class100) class149.field2244.method2180(var7, (byte) 31);
        if (var9 == null) {
            class119 var10 = class119.method843(class9.field76, arg1, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method853(64, 768, -50, -10, -50);
            class149.field2244.method2175(var7, var9, -28);
        }
        int var11 = arg2.method497();
        int var12 = arg2.method494();
        int var13 = arg2.method502();
        int var14 = arg2.method515();
        class100 var15 = var9.method510(true, true, true);
        if (arg0 != 0) {
            var15.method512(arg0);
        }
        if (class117.field1817) {
            class83 var16 = (class83) var15;
            if (class74.method473(arg3 + var13, arg4 + var11, arg5 ^ 0xC, class180.field2697) != arg6 || class74.method473(arg3 + var14, arg4 + var12, arg5 - 12, class180.field2697) != arg6) {
                for (int var17 = 0; var17 < var16.field1180; var17++) {
                    var16.field1165[var17] += class74.method473(var16.field1168[var17] + arg3, var16.field1191[var17] + arg4, 64, class180.field2697) - arg6;
                }
                var16.field1162.field3559 = false;
                var16.field1184.field3720 = false;
            }
        } else {
            class77 var18 = (class77) var15;
            if (arg6 != class74.method473(arg3 + var13, arg4 + var11, 64, class180.field2697) || class74.method473(arg3 + var14, arg4 + var12, 64, class180.field2697) != arg6) {
                for (int var19 = 0; var19 < var18.field1009; var19++) {
                    var18.field1004[var19] += class74.method473(var18.field1012[var19] + arg3, var18.field1027[var19] + arg4, 64, class180.field2697) - arg6;
                }
                var18.field1003 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V", line = 318)
    private final void method1631(int arg0) {
        field3576++;
        Random var2 = new Random((long) this.field3580);
        for (int var3 = arg0; var3 < 255; var3++) {
            this.field3575[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class216.method1488(var5, true, var2);
            short var7 = this.field3575[var6];
            this.field3575[var6] = this.field3575[var5];
            this.field3575[var5] = this.field3575[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)V")
    public abstract void method1387(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
    public abstract void method1395(int arg0);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
    public abstract void method1389(boolean arg0);
}
