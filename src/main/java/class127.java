import java.math.BigInteger;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class127 extends class303 {

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "I")
    private int field2018 = 409;

    @OriginalMember(owner = "client!sk", name = "T", descriptor = "I")
    private int field2028 = 0;

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "I")
    private int field2024 = 819;

    @OriginalMember(owner = "client!sk", name = "N", descriptor = "I")
    private int field2022 = 1024;

    @OriginalMember(owner = "client!sk", name = "R", descriptor = "I")
    private int field2026 = 0;

    @OriginalMember(owner = "client!sk", name = "U", descriptor = "I")
    private int field2029 = 1024;

    @OriginalMember(owner = "client!sk", name = "W", descriptor = "I")
    private int field2031 = 2048;

    @OriginalMember(owner = "client!sk", name = "Y", descriptor = "I")
    private int field2033 = 1024;

    @OriginalMember(owner = "client!sk", name = "S", descriptor = "I")
    private int field2027 = 1024;

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "S")
    public static short field2023 = 205;

    @OriginalMember(owner = "client!sk", name = "K", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2019 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!sk", name = "M", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!sk", name = "Q", descriptor = "I")
    private int field2025;

    @OriginalMember(owner = "client!sk", name = "V", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!sk", name = "Z", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!sk", name = "ab", descriptor = "Lvd;")
    public static class135 field2035;

    @OriginalMember(owner = "client!sk", name = "X", descriptor = "Loh;")
    public static class16 field2032;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "(III)V", line = 5)
    public static final void method952(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class203.field3189; var3++) {
            for (int var4 = 0; var4 < class323.field5009; var4++) {
                for (int var5 = 0; var5 < class196.field3122; var5++) {
                    class272 var6 = class60.field946[var3][var4][var5];
                    if (var6 != null) {
                        class189 var7 = var6.field4236;
                        if (var7 != null && var7.field2996.method983()) {
                            class101.method768(var7.field2996, var3, var4, var5, 1, 1);
                            if (var7.field2998 != null && var7.field2998.method983()) {
                                class101.method768(var7.field2998, var3, var4, var5, 1, 1);
                                var7.field2996.method989(var7.field2998, 0, 0, 0, false);
                                var7.field2998 = var7.field2998.method988(arg0, arg1, arg2);
                            }
                            var7.field2996 = var7.field2996.method988(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field4220; var8++) {
                            class45 var9 = var6.field4217[var8];
                            if (var9 != null && var9.field782.method983()) {
                                class101.method768(var9.field782, var3, var4, var5, var9.field785 + 1 - var9.field770, var9.field784 - var9.field772 + 1);
                                var9.field782 = var9.field782.method988(arg0, arg1, arg2);
                            }
                        }
                        class87 var10 = var6.field4213;
                        if (var10 != null && var10.field1325.method983()) {
                            class103.method796(var10.field1325, var3, var4, var5);
                            var10.field1325 = var10.field1325.method988(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILwl;I)V", line = 76)
    public static final void method953(int arg0, class89 arg1, int arg2) {
        field2015++;
        if (arg0 != 128) {
            return;
        }
        if (arg1.field1415 > class205.field3252) {
            class110.method840(arg1, arg0 - 59);
        } else if (arg1.field1376 >= class205.field3252) {
            method954(arg1, 4151);
        } else {
            class196.method1429(arg1, (byte) 96);
        }
        if (arg1.field1442 < 128 || arg1.field1369 < 128 || arg1.field1442 >= 13184 || arg1.field1369 >= 13184) {
            arg1.field1417 = -1;
            arg1.field1458 = -1;
            arg1.field1376 = 0;
            arg1.field1415 = 0;
            arg1.field1442 = arg1.field1386[0] * 128 + (arg1.method200(arg0 ^ 0xFFFFFF7F) * 64);
            arg1.field1369 = arg1.field1388[0] * 128 + (arg1.method200(arg0 - 129) * 64);
            arg1.method633(0);
        }
        if (class19.field356 == arg1 && (arg1.field1442 < 1536 || arg1.field1369 < 1536 || arg1.field1442 >= 11776 || arg1.field1369 >= 11776)) {
            arg1.field1417 = -1;
            arg1.field1458 = -1;
            arg1.field1376 = 0;
            arg1.field1415 = 0;
            arg1.field1442 = arg1.field1386[0] * 128 + arg1.method200(-1) * 64;
            arg1.field1369 = arg1.field1388[0] * 128 + arg1.method200(-1) * 64;
            arg1.method633(arg0 ^ 0x80);
        }
        class291.method2037(127, arg1);
        class108.method828(-1, arg1);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILpe;I)V", line = 126)
    public final void method65(int arg0, class101 arg1, int arg2) {
        if (arg0 != -4004) {
            this.field2031 = 108;
        }
        field2021++;
        if (arg2 == 0) {
            this.field2028 = arg1.method741(arg0 ^ 0xFFFFF07E);
        } else if (arg2 == 1) {
            this.field2033 = arg1.method731(false);
        } else if (arg2 == 2) {
            this.field2031 = arg1.method731(false);
        } else if (arg2 == 3) {
            this.field2018 = arg1.method731(false);
        } else if (arg2 == 4) {
            this.field2024 = arg1.method731(false);
        } else if (arg2 == 5) {
            this.field2027 = arg1.method731(false);
        } else if (arg2 == 6) {
            this.field2026 = arg1.method741(111);
        } else if (arg2 == 7) {
            this.field2029 = arg1.method731(false);
        } else if (arg2 == 8) {
            this.field2022 = arg1.method731(false);
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V", line = 220)
    public class127() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(II)[I", line = 226)
    public final int[] method67(int arg0, int arg1) {
        int[] var3 = this.field4763.method394(0, arg1);
        field2016++;
        if (arg0 != -3) {
            this.method956(79, 52, (Random) null, 23, (int[][]) ((int[][]) null), (byte) 65, 82);
        }
        if (!this.field4763.field863) {
            return var3;
        }
        int[][] var4 = this.field4763.method396(-14579);
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        boolean var9 = true;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        boolean var13 = true;
        int var14 = class70.field1108 * this.field2031 >> 12;
        int var15 = class70.field1108 * this.field2033 >> 12;
        int var16 = class247.field3815 * this.field2018 >> 12;
        int var17 = class247.field3815 * this.field2024 >> 12;
        if (var17 <= 1) {
            return var4[arg1];
        }
        this.field2025 = class70.field1108 / 8 * this.field2027 >> 12;
        int var18 = (class70.field1108 / var15) + 1;
        int[][] var19 = new int[var18][3];
        int[][] var20 = new int[var18][3];
        Random var21 = new Random((long) this.field2028);
        while (true) {
            while (true) {
                int var22 = class86.method621((byte) 22, var21, var14 - var15) + var15;
                int var23 = class86.method621((byte) 127, var21, var17 - var16) + var16;
                int var24 = var8 + var22;
                if (var24 > class70.field1108) {
                    var24 = class70.field1108;
                    var22 = class70.field1108 - var8;
                }
                int var26;
                if (var9) {
                    var26 = 0;
                } else {
                    int[] var25 = var19[var10];
                    var26 = var25[2];
                    int var27 = var10;
                    int var28 = 0;
                    int var29 = var5 + var24;
                    if (var29 < 0) {
                        var29 += class70.field1108;
                    }
                    if (class70.field1108 < var29) {
                        var29 -= class70.field1108;
                    }
                    while (true) {
                        int[] var30 = var19[var27];
                        if (var29 >= var30[0] && var30[1] >= var29) {
                            if (var10 != var27) {
                                int var31 = var5 + var8;
                                if (var31 < 0) {
                                    var31 += class70.field1108;
                                }
                                if (var31 > class70.field1108) {
                                    var31 -= class70.field1108;
                                }
                                for (int var32 = 1; var32 <= var28; var32++) {
                                    int[] var33 = var19[(var10 + var32) % var11];
                                    var26 = Math.max(var26, var33[2]);
                                }
                                for (int var34 = 0; var34 <= var28; var34++) {
                                    int[] var35 = var19[(var10 + var34) % var11];
                                    int var36 = var35[2];
                                    if (var26 != var36) {
                                        int var37 = var35[0];
                                        int var38 = var35[1];
                                        int var39;
                                        int var40;
                                        if (var29 > var31) {
                                            var39 = Math.max(var31, var37);
                                            var40 = Math.min(var29, var38);
                                        } else if (var37 == 0) {
                                            var39 = 0;
                                            var40 = Math.min(var29, var38);
                                        } else {
                                            var39 = Math.max(var31, var37);
                                            var40 = class70.field1108;
                                        }
                                        this.method956(var40 - var39, var26 - var36, var21, var36, var4, (byte) -127, var7 + var39);
                                    }
                                }
                            }
                            var10 = var27;
                            break;
                        }
                        var28++;
                        var27++;
                        if (var27 >= var11) {
                            var27 = 0;
                        }
                    }
                }
                if (var23 + var26 > class247.field3815) {
                    var23 = class247.field3815 - var26;
                } else {
                    var13 = false;
                }
                if (class70.field1108 == var24) {
                    this.method956(var22, var23, var21, var26, var4, (byte) -126, var6 + var8);
                    if (var13) {
                        return var3;
                    }
                    var7 = var6;
                    var13 = true;
                    var9 = false;
                    var10 = 0;
                    int[] var42 = var20[var12++];
                    var42[2] = var23 + var26;
                    int[][] var43 = var19;
                    var42[0] = var8;
                    var42[1] = var24;
                    var11 = var12;
                    var6 = class86.method621((byte) 9, var21, class70.field1108);
                    var8 = 0;
                    var5 = var6 - var7;
                    var12 = 0;
                    var19 = var20;
                    var20 = var43;
                    int var44 = var5;
                    if (var5 < 0) {
                        var44 = class70.field1108 + var5;
                    }
                    if (var44 > class70.field1108) {
                        var44 -= class70.field1108;
                    }
                    while (true) {
                        int[] var45 = var19[var10];
                        if (var44 >= var45[0] && var44 <= var45[1]) {
                            break;
                        }
                        var10++;
                        if (var11 <= var10) {
                            var10 = 0;
                        }
                    }
                } else {
                    int[] var41 = var20[var12++];
                    var41[2] = var23 + var26;
                    var41[0] = var8;
                    var41[1] = var24;
                    this.method956(var22, var23, var21, var26, var4, (byte) -128, var6 + var8);
                    var8 = var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lwl;I)V", line = 479)
    private static final void method954(class89 arg0, int arg1) {
        field2030++;
        if (arg1 != 4151) {
            method954((class89) null, 123);
        }
        if (class205.field3252 == arg0.field1376 || arg0.field1458 == -1 || arg0.field1398 != 0 || (arg0.field1401 + 1) > class6.method28(arg0.field1458, 2).field4165[arg0.field1414]) {
            int var2 = arg0.field1376 - arg0.field1415;
            int var3 = class205.field3252 - arg0.field1415;
            int var4 = arg0.field1436 * 128 + (arg0.method200(-1) * 64);
            int var5 = arg0.field1371 * 128 + (arg0.method200(-1) * 64);
            int var6 = arg0.field1411 * 128 + arg0.method200(-1) * 64;
            int var7 = arg0.field1413 * 128 + arg0.method200(-1) * 64;
            arg0.field1442 = ((var2 - var3) * var4 + var3 * var6) / var2;
            arg0.field1369 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        if (arg0.field1359 == 0) {
            arg0.field1395 = 1024;
        }
        arg0.field1389 = 0;
        if (arg0.field1359 == 1) {
            arg0.field1395 = 1536;
        }
        if (arg0.field1359 == 2) {
            arg0.field1395 = 0;
        }
        if (arg0.field1359 == 3) {
            arg0.field1395 = 512;
        }
        arg0.field1443 = arg0.field1395;
    }

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "(I)V", line = 526)
    public final void method70(int arg0) {
        if (arg0 <= 13) {
            this.method70(-67);
        }
        field2034++;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZLjava/lang/Object;)[B", line = 537)
    public static final byte[] method955(int arg0, boolean arg1, Object arg2) {
        field2020++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) ((byte[]) arg2);
            return arg1 ? class103.method792(var3, (byte) -108) : var3;
        } else {
            if (arg0 != -25419) {
                method957(true);
            }
            if (!arg2 instanceof class70) {
                throw new IllegalArgumentException();
            }
            class70 var4 = (class70) arg2;
            return var4.method542((byte) 117);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILjava/util/Random;I[[IBI)V", line = 575)
    private final void method956(int arg0, int arg1, Random arg2, int arg3, int[][] arg4, byte arg5, int arg6) {
        field2017++;
        int var8 = this.field2022 > 0 ? 4096 - class86.method621((byte) -28, arg2, this.field2022) : 4096;
        int var9 = this.field2029 * this.field2025 >> 12;
        int var10 = this.field2025 - (var9 > 0 ? class86.method621((byte) -102, arg2, var9) : 0);
        if (class70.field1108 <= arg6) {
            arg6 -= class70.field1108;
        }
        if (arg5 > -122) {
            return;
        }
        if (var10 > 0) {
            if (arg1 <= 0 || arg0 <= 0) {
                return;
            }
            int var11 = arg1 / 2;
            int var12 = arg0 / 2;
            int var13 = var12 >= var10 ? var10 : var12;
            int var14 = var11 >= var10 ? var10 : var11;
            int var15 = arg6 + var13;
            int var16 = arg0 - (var13 * 2);
            for (int var17 = 0; var17 < arg1; var17++) {
                int[] var18 = arg4[arg3 + var17];
                if (var17 >= var14) {
                    int var19 = arg1 - var17 - 1;
                    if (var14 <= var19) {
                        for (int var20 = 0; var20 < var13; var20++) {
                            var18[class280.method2001(class40.field724, arg6 + var20)] = var18[class280.method2001(arg0 + arg6 - var20 - 1, class40.field724)] = var8 * var20 / var13;
                        }
                        if ((var15 + var16) > class70.field1108) {
                            int var21 = class70.field1108 - var15;
                            class271.method1955(var18, var15, var21, var8);
                            class271.method1955(var18, 0, var16 - var21, var8);
                        } else {
                            class271.method1955(var18, var15, var16, var8);
                        }
                    } else {
                        int var22 = var8 * var19 / var14;
                        if (this.field2026 == 0) {
                            for (int var23 = 0; var23 < var13; var23++) {
                                int var24 = var8 * var23 / var13;
                                var18[class280.method2001(arg6 + var23, class40.field724)] = var18[class280.method2001(class40.field724, arg0 + arg6 - var23 - 1)] = var22 * var24 >> 12;
                            }
                        } else {
                            for (int var25 = 0; var25 < var13; var25++) {
                                int var26 = var8 * var25 / var13;
                                var18[class280.method2001(class40.field724, arg6 + var25)] = var18[class280.method2001(class40.field724, arg6 + arg0 - var25 - 1)] = var26 < var22 ? var26 : var22;
                            }
                        }
                        if (class70.field1108 >= var15 + var16) {
                            class271.method1955(var18, var15, var16, var22);
                        } else {
                            int var27 = class70.field1108 - var15;
                            class271.method1955(var18, var15, var27, var22);
                            class271.method1955(var18, 0, var16 - var27, var22);
                        }
                    }
                } else {
                    int var28 = var8 * var17 / var14;
                    if (this.field2026 == 0) {
                        for (int var29 = 0; var29 < var13; var29++) {
                            int var30 = var8 * var29 / var13;
                            var18[class280.method2001(arg6 + var29, class40.field724)] = var18[class280.method2001(class40.field724, arg0 + arg6 - var29 - 1)] = var28 * var30 >> 12;
                        }
                    } else {
                        for (int var31 = 0; var31 < var13; var31++) {
                            int var32 = var8 * var31 / var13;
                            var18[class280.method2001(arg6 + var31, class40.field724)] = var18[class280.method2001(class40.field724, arg0 + arg6 - var31 - 1)] = var28 > var32 ? var32 : var28;
                        }
                    }
                    if ((var15 + var16) > class70.field1108) {
                        int var33 = class70.field1108 - var15;
                        class271.method1955(var18, var15, var33, var28);
                        class271.method1955(var18, 0, var16 - var33, var28);
                    } else {
                        class271.method1955(var18, var15, var16, var28);
                    }
                }
            }
        } else if (arg0 + arg6 > class70.field1108) {
            int var34 = class70.field1108 - arg6;
            for (int var35 = 0; var35 < arg1; var35++) {
                int[] var36 = arg4[arg3 + var35];
                class271.method1955(var36, arg6, var34, var8);
                class271.method1955(var36, 0, arg0 - var34, var8);
            }
        } else {
            for (int var37 = 0; var37 < arg1; var37++) {
                class271.method1955(arg4[arg3 + var37], arg6, arg0, var8);
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)V", line = 790)
    public static void method957(boolean arg0) {
        field2032 = null;
        field2035 = null;
        if (arg0) {
            field2032 = (class16) null;
        }
        field2019 = null;
    }
}
