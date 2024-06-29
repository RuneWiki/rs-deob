import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public abstract class class322 {

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    private int field4707 = 4;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    private int field4716 = 4;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    private int field4712 = 0;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    private int field4719 = 4;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public int field4713 = 4;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "[S")
    private short[] field4708 = new short[512];

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field4706 = new String[200];

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field4709;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field4710;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "[S")
    private short[] field4711;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[BIIII)Z", line = 3)
    public static final boolean method1927(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5) {
        field4715++;
        boolean var6 = true;
        class156 var7 = new class156(arg1);
        if (arg2 != -13184) {
            field4706 = null;
        }
        int var8 = -1;
        label58: while (true) {
            int var9 = var7.method995(0);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method953((byte) -40);
                    if (var13 == 0) {
                        continue label58;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = var10 >> 6 & 0x3F;
                    int var16 = var7.method941((byte) 125) >> 2;
                    int var17 = var15 + arg4;
                    int var18 = arg0 + var14;
                    if (var17 > 0 && var18 > 0 && var17 < (arg5 - 1) && (arg3 - 1) > var18) {
                        class486 var19 = class114.field1471.method2132((byte) 127, var8);
                        if (var16 != 22 || class118.field1533.field6892 || var19.field7041 != 0 || var19.field7074 == 1 || var19.field7108) {
                            var11 = true;
                            if (!var19.method2843(0)) {
                                class507.field7740++;
                                var6 = false;
                            }
                        }
                    }
                }
                int var12 = var7.method953((byte) -40);
                if (var12 == 0) {
                    break;
                }
                var7.method941((byte) 124);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Z", line = 90)
    public static final boolean method1928(int arg0, int arg1) {
        field4710++;
        if (class370.field5561[arg0]) {
            return true;
        } else if (class184.field2616.method1447((byte) -82, arg0)) {
            int var2 = class184.field2616.method1473(4309, arg0);
            if (var2 == 0) {
                class370.field5561[arg0] = true;
                return true;
            }
            if (class181.field2591[arg0] == null) {
                class181.field2591[arg0] = new class356[var2];
            }
            int var3 = 0;
            if (arg1 != 7387) {
                field4706 = null;
            }
            while (var2 > var3) {
                if (class181.field2591[arg0][var3] == null) {
                    byte[] var4 = class184.field2616.method1470(4, var3, arg0);
                    if (var4 != null) {
                        class356 var5 = class181.field2591[arg0][var3] = new class356();
                        var5.field5185 = (arg0 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method2167(false, new class156(var4));
                    }
                }
                var3++;
            }
            class370.field5561[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V", line = 150)
    public static void method1929(byte arg0) {
        field4706 = null;
        if (arg0 >= -67) {
            field4706 = null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIII)V", line = 160)
    public final void method1930(int arg0, int arg1, int arg2, int arg3) {
        field4714++;
        if (arg2 != 200) {
            this.field4707 = 112;
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
        this.method1687(9944);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field4713; var14++) {
                        int var15 = this.field4711[var14] << 12;
                        int var16 = this.field4719 * var15 >> 12;
                        int var17 = this.field4707 * var15 >> 12;
                        int var18 = var6[var12] * var15 >> 12;
                        int var19 = var8[var11] * var15 >> 12;
                        int var20 = var5[var13] * var15 >> 12;
                        int var21 = this.field4716 * var15 >> 12;
                        int var22 = this.field4707 * var20;
                        int var23 = this.field4716 * var18;
                        int var24 = this.field4719 * var19;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var23 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var24 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var23 & 0xFFF;
                        int var34;
                        if (var32 >= var16) {
                            var34 = 0;
                        } else {
                            var34 = var32 & 0xFF;
                        }
                        int var35;
                        if (var17 <= var26) {
                            var35 = 0;
                        } else {
                            var35 = var26 & 0xFF;
                        }
                        int var36 = var31 & 0xFF;
                        int var37 = var22 & 0xFFF;
                        int var38;
                        if (var29 >= var21) {
                            var38 = 0;
                        } else {
                            var38 = var29 & 0xFF;
                        }
                        int var39 = var24 & 0xFFF;
                        int var40 = class220.field3103[var39];
                        int var41 = class220.field3103[var33];
                        int var42 = var33 - 4096;
                        int var43 = class220.field3103[var37];
                        int var44 = var39 - 4096;
                        int var45 = var37 - 4096;
                        short var46 = this.field4708[var34];
                        short var47 = this.field4708[var36];
                        short var48 = this.field4708[var30 + var46];
                        short var49 = this.field4708[var38 + var47];
                        short var50 = this.field4708[var30 + var47];
                        short var51 = this.field4708[var38 + var46];
                        int var52 = class103.method613(arg2 ^ 0xFFFFFF54, var37, var33, this.field4708[var28 + var50], var39);
                        int var53 = class103.method613(-101, var45, var33, this.field4708[var35 + var50], var39);
                        int var54 = ((var53 - var52) * var43 >> 12) + var52;
                        int var55 = class103.method613(-103, var37, var42, this.field4708[var28 + var49], var39);
                        int var56 = class103.method613(-116, var45, var42, this.field4708[var35 + var49], var39);
                        int var57 = ((var56 - var55) * var43 >> 12) + var55;
                        int var58 = class103.method613(arg2 - 174, var37, var33, this.field4708[var28 + var48], var44);
                        int var59 = ((var57 - var54) * var41 >> 12) + var54;
                        int var60 = class103.method613(95, var45, var33, this.field4708[var35 + var48], var44);
                        int var61 = ((var60 - var58) * var43 >> 12) + var58;
                        int var62 = class103.method613(arg2 ^ 0xAB, var37, var42, this.field4708[var28 + var51], var44);
                        int var63 = class103.method613(41, var45, var42, this.field4708[var35 + var51], var44);
                        int var64 = ((var63 - var62) * var43 >> 12) + var62;
                        int var65 = ((var64 - var61) * var41 >> 12) + var61;
                        this.method1686(var14, ((var65 - var59) * var40 >> 12) + var59, -4096);
                    }
                    this.method1683(125);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIII)I", line = 327)
    public static final int method1931(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4718++;
        int var5 = 65536 - class323.field4733[arg4 * 8192 / arg0] >> 1;
        if (arg1 != -22186) {
            method1935(true, 101L);
        }
        return ((65536 - var5) * arg2 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)V", line = 342)
    public static final void method1932(int arg0, int arg1) {
        field4717++;
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        class373.field5596 = arg0;
        if (arg1 != 255) {
            method1932(-20, -22);
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(IIIII)V", line = 483)
    public class322(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4719 = arg4;
        this.field4713 = arg1;
        this.field4716 = arg3;
        this.field4707 = arg2;
        this.field4712 = arg0;
        this.method1936(2);
        this.method1933(-2);
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V", line = 362)
    private final void method1933(int arg0) {
        field4722++;
        Random var2 = new Random((long) this.field4712);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field4708[var3] = (short) var3;
        }
        int var4 = 39 % ((arg0 - 61) / 49);
        for (int var5 = 0; var5 < 255; var5++) {
            int var6 = 255 - var5;
            int var7 = class154.method931(var2, var6, (byte) 8);
            short var8 = this.field4708[var7];
            this.field4708[var7] = this.field4708[var6];
            this.field4708[var6] = this.field4708[var6 + 256] = var8;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)Z", line = 419)
    public static final boolean method1934(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method1927(46, null, -113, -99, 113, 8);
        }
        field4709++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZJ)V", line = 443)
    public static final void method1935(boolean arg0, long arg1) {
        field4720++;
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class375.method2276(arg1 - 1L, 30);
            class375.method2276(1L, 30);
        } else {
            class375.method2276(arg1, 30);
        }
        if (!arg0) {
            method1935(false, -41L);
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V", line = 464)
    private final void method1936(int arg0) {
        field4721++;
        this.field4711 = new short[this.field4713];
        for (int var2 = 0; var2 < this.field4713; var2++) {
            this.field4711[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 != 2) {
            this.field4712 = 36;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public abstract void method1683(int arg0);

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
    public abstract void method1687(int arg0);

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(III)V")
    public abstract void method1686(int arg0, int arg1, int arg2);
}
