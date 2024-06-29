import java.lang.reflect.Method;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public abstract class class227 {

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    private int field3598 = 4;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
    private int field3605 = 4;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    private int field3611 = 0;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    private int field3609 = 4;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "[S")
    private short[] field3614 = new short[512];

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public int field3612 = 4;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Lpg;")
    public static class320 field3596 = new class320(64);

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    public static int field3618 = 0;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Ll;")
    public static class133 field3601;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "Ll;")
    public static class133 field3603;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "Ljava/lang/String;")
    public static String field3602;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "[S")
    private short[] field3619;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIBLmd;I)V", line = 4)
    public static final void method1601(int arg0, int arg1, int arg2, int arg3, byte arg4, class123 arg5, int arg6) {
        if (arg4 != 21) {
            field3597 = 47;
        }
        class310.method2115(-51, arg1, arg3, arg6, arg0, arg2, arg5.field1905, arg5.field1868);
        field3595++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([I[I[IZLqh;)V", line = 15)
    public static final void method1602(int[] arg0, int[] arg1, int[] arg2, boolean arg3, class33 arg4) {
        field3606++;
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg1[var5];
            int var7 = arg0[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg4.field1908.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var8 == -1) {
                        arg4.field1908[var9] = null;
                    } else {
                        class281 var10 = class133.method948(var8, (byte) 33);
                        int var11 = var10.field4330;
                        class111 var12 = arg4.field1908[var9];
                        if (var12 != null) {
                            if (var12.field1733 == var8) {
                                if (var11 == 0) {
                                    var12 = arg4.field1908[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1724 = 0;
                                    var12.field1729 = 0;
                                    var12.field1731 = 1;
                                    var12.field1722 = var6;
                                    var12.field1725 = 0;
                                    class170.method1231(class98.field1566 == arg4, arg4.field1905, arg4.field1868, 0, var10, -24255);
                                } else if (var11 == 2) {
                                    var12.field1724 = 0;
                                }
                            } else if (var10.field4344 >= class133.method948(var12.field1733, (byte) 33).field4344) {
                                var12 = arg4.field1908[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class111 var13 = arg4.field1908[var9] = new class111();
                            var13.field1724 = 0;
                            var13.field1729 = 0;
                            var13.field1725 = 0;
                            var13.field1731 = 1;
                            var13.field1722 = var6;
                            var13.field1733 = var8;
                            class170.method1231(class98.field1566 == arg4, arg4.field1905, arg4.field1868, 0, var10, -24255);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
        if (arg3) {
            method1604(-63);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V", line = 111)
    private final void method1603(byte arg0) {
        field3599++;
        Random var2 = new Random((long) this.field3611);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field3614[var3] = (short) var3;
        }
        if (arg0 != 54) {
            return;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class85.method615(var2, var5, true);
            short var7 = this.field3614[var6];
            this.field3614[var6] = this.field3614[var5];
            this.field3614[var5] = this.field3614[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 151)
    public static final void method1604(int arg0) {
        try {
            Method var1 = Runtime.class.getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class318.field4975 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var6) {
                }
            }
        } catch (Exception var7) {
        }
        if (arg0 == 1048576) {
            field3604++;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)V", line = 177)
    public static void method1605(byte arg0) {
        field3602 = null;
        if (arg0 >= -33) {
            method1604(-1);
        }
        field3596 = null;
        field3601 = null;
        field3603 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I[S)[S", line = 190)
    public static final short[] method1606(int arg0, short[] arg1) {
        field3613++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class343.method2374(arg1, arg0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZZIII)V", line = 206)
    public static final void method1607(boolean arg0, boolean arg1, int arg2, int arg3, int arg4) {
        class300.method2046(arg4, arg0, arg2, arg3, class119.field1825.length - 1, -339, arg1);
        field3617++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lmd;II)V", line = 227)
    public static final void method1608(class123 arg0, int arg1, int arg2) {
        if (field3618 < arg0.field1870) {
            class203.method1440(arg0, (byte) 13);
        } else if (arg0.field1856 >= field3618) {
            class193.method1373(arg2 ^ 0xFFFFD181, arg0);
        } else {
            class76.method557(0, arg0);
        }
        field3607++;
        if (arg0.field1905 < 128 || arg0.field1868 < 128 || arg0.field1905 >= 13184 || arg0.field1868 >= 13184) {
            arg0.field1870 = 0;
            arg0.field1856 = 0;
            arg0.field1912 = -1;
            arg0.field1951 = -1;
            arg0.field1905 = arg0.field1910[0] * 128 + (arg0.method280(false) * 64);
            arg0.field1868 = arg0.field1938[0] * 128 + (arg0.method280(false) * 64);
            arg0.method889(true);
        }
        if (arg2 != -11777) {
            field3597 = 37;
        }
        if (class98.field1566 == arg0 && (arg0.field1905 < 1536 || arg0.field1868 < 1536 || arg0.field1905 >= 11776 || arg0.field1868 >= 11776)) {
            arg0.field1870 = 0;
            arg0.field1951 = -1;
            arg0.field1912 = -1;
            arg0.field1856 = 0;
            arg0.field1905 = arg0.field1910[0] * 128 + (arg0.method280(false) * 64);
            arg0.field1868 = arg0.field1938[0] * 128 + (arg0.method280(false) * 64);
            arg0.method889(true);
        }
        class193.method1376(2047, arg0);
        class201.method1436(arg0, arg2 ^ 0x2E5E);
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)V", line = 280)
    private final void method1609(byte arg0) {
        field3600++;
        this.field3619 = new short[this.field3612];
        for (int var2 = 0; var2 < this.field3612; var2++) {
            this.field3619[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 > -124) {
            method1601(116, -44, 94, -16, (byte) 113, (class123) null, 88);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIBI)V", line = 303)
    public final void method1610(int arg0, int arg1, byte arg2, int arg3) {
        field3615++;
        if (arg2 <= 4) {
            return;
        }
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg0];
        for (int var7 = 0; var7 < arg0; var7++) {
            var6[var7] = (var7 << 12) / arg0;
        }
        int[] var8 = new int[arg3];
        for (int var9 = 0; var9 < arg1; var9++) {
            var5[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var8[var10] = (var10 << 12) / arg3;
        }
        this.method131(-118);
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field3612; var14++) {
                        int var15 = this.field3619[var14] << 12;
                        int var16 = this.field3609 * var15 >> 12;
                        int var17 = var5[var12] * var15 >> 12;
                        int var18 = var8[var11] * var15 >> 12;
                        int var19 = var6[var13] * var15 >> 12;
                        int var20 = this.field3605 * var18;
                        int var21 = this.field3598 * var17;
                        int var22 = var20 >> 12;
                        int var23 = var22 + 1;
                        int var24 = this.field3598 * var15 >> 12;
                        int var25 = var22 & 0xFF;
                        int var26 = var20 & 0xFFF;
                        int var27 = var26 - 4096;
                        int var28 = this.field3609 * var19;
                        int var29 = this.field3605 * var15 >> 12;
                        int var30 = class295.field4559[var26];
                        int var31;
                        if (var29 <= var23) {
                            var31 = 0;
                        } else {
                            var31 = var23 & 0xFF;
                        }
                        short var32 = this.field3614[var25];
                        short var33 = this.field3614[var31];
                        int var34 = var21 >> 12;
                        int var35 = var34 + 1;
                        int var36;
                        if (var24 > var35) {
                            var36 = var35 & 0xFF;
                        } else {
                            var36 = 0;
                        }
                        short var37 = this.field3614[var32 + var36];
                        short var38 = this.field3614[var33 + var36];
                        int var39 = var21 & 0xFFF;
                        int var40 = class295.field4559[var39];
                        int var41 = var39 - 4096;
                        int var42 = var28 >> 12;
                        int var43 = var42 + 1;
                        int var44 = var34 & 0xFF;
                        short var45 = this.field3614[var33 + var44];
                        int var46;
                        if (var16 <= var43) {
                            var46 = 0;
                        } else {
                            var46 = var43 & 0xFF;
                        }
                        short var47 = this.field3614[var32 + var44];
                        int var48 = var42 & 0xFF;
                        int var49 = var28 & 0xFFF;
                        int var50 = class295.field4559[var49];
                        int var51 = var49 - 4096;
                        int var52 = class99.method730(true, this.field3614[var47 + var48], var49, var26, var39);
                        int var53 = class99.method730(true, this.field3614[var46 + var47], var51, var26, var39);
                        int var54 = ((var53 - var52) * var50 >> 12) + var52;
                        int var55 = class99.method730(true, this.field3614[var37 + var48], var49, var26, var41);
                        int var56 = class99.method730(true, this.field3614[var37 + var46], var51, var26, var41);
                        int var57 = ((var56 - var55) * var50 >> 12) + var55;
                        int var58 = ((var57 - var54) * var40 >> 12) + var54;
                        int var59 = class99.method730(true, this.field3614[var45 + var48], var49, var27, var39);
                        int var60 = class99.method730(true, this.field3614[var46 + var45], var51, var27, var39);
                        int var61 = var59 + ((var60 - var59) * var50 >> 12);
                        int var62 = class99.method730(true, this.field3614[var38 + var48], var49, var27, var41);
                        int var63 = class99.method730(true, this.field3614[var38 + var46], var51, var27, var41);
                        int var64 = ((var63 - var62) * var50 >> 12) + var62;
                        int var65 = ((var64 - var61) * var40 >> 12) + var61;
                        this.method134(var14, 101, ((var65 - var58) * var30 >> 12) + var58);
                    }
                    this.method136(-26370);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(IIIII)V", line = 518)
    public class227(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field3598 = arg3;
        this.field3609 = arg2;
        this.field3605 = arg4;
        this.field3612 = arg1;
        this.field3611 = arg0;
        this.method1609((byte) -128);
        this.method1603((byte) 54);
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(B)Lla;", line = 478)
    public static final class193 method1611(byte arg0) {
        if (arg0 <= 78) {
            return (class193) null;
        }
        field3610++;
        try {
            return (class193) Class.forName("se").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(III)I", line = 533)
    public static final int method1612(int arg0, int arg1, int arg2) {
        field3608++;
        class137 var3 = (class137) class281.field4320.method1222(0, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            if (arg1 > -42) {
                return -37;
            }
            for (int var5 = 0; var5 < var3.field2159.length; var5++) {
                if (var3.field2158[var5] == arg2) {
                    var4 += var3.field2159[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    public abstract void method131(int arg0);

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V")
    public abstract void method136(int arg0);

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)V")
    public abstract void method134(int arg0, int arg1, int arg2);
}
