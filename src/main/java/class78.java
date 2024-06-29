import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class78 extends class310 {

    @OriginalMember(owner = "client!hj", name = "L", descriptor = "[I")
    private int[] field1347 = new int[3];

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
    private int field1352 = 3216;

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "I")
    private int field1354 = 4096;

    @OriginalMember(owner = "client!hj", name = "Y", descriptor = "I")
    private int field1360 = 3216;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "S")
    public static short field1350 = 32767;

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "[I")
    public static int[] field1349 = new int[100];

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "[Z")
    public static boolean[] field1353 = new boolean[5];

    @OriginalMember(owner = "client!hj", name = "K", descriptor = "I")
    public static int field1346;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
    public static int field1351;

    @OriginalMember(owner = "client!hj", name = "T", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!hj", name = "V", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!hj", name = "W", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!hj", name = "X", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!hj", name = "Z", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!hj", name = "M", descriptor = "[Z")
    public static boolean[] field1348;

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V", line = 282)
    public class78() {
        super(1, true);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIII)Z", line = 22)
    public static final boolean method645(int arg0, int arg1, int arg2, int arg3) {
        if (!class273.method2044(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class101.field1656[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class291.field4713) {
                    if (!class326.method2295(var4, var6, var5)) {
                        return false;
                    }
                    if (!class326.method2295(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class326.method2295(var4, var7, var5)) {
                        return false;
                    }
                    if (!class326.method2295(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class326.method2295(var4, var8, var5)) {
                    return false;
                }
                if (!class326.method2295(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class36.field550) {
                    if (!class326.method2295(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class326.method2295(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class326.method2295(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class326.method2295(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class326.method2295(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class326.method2295(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class291.field4713) {
                    if (!class326.method2295(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class326.method2295(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class326.method2295(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class326.method2295(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class326.method2295(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class326.method2295(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class36.field550) {
                    if (!class326.method2295(var4, var6, var5)) {
                        return false;
                    }
                    if (!class326.method2295(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class326.method2295(var4, var7, var5)) {
                        return false;
                    }
                    if (!class326.method2295(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class326.method2295(var4, var8, var5)) {
                    return false;
                }
                if (!class326.method2295(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class326.method2295(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class326.method2295(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class326.method2295(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class326.method2295(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class326.method2295(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)[I", line = 207)
    public final int[] method77(int arg0, int arg1) {
        field1355++;
        if (arg1 != -13093) {
            method646((byte) 67);
        }
        int[] var3 = this.field4950.method930(arg0, 0);
        if (this.field4950.field2001) {
            int var4 = class79.field1362 * this.field1354 >> 12;
            int[] var5 = this.method2200(0, class113.field1861 & arg0 - 1, (byte) 74);
            int[] var6 = this.method2200(0, arg0, (byte) 74);
            int[] var7 = this.method2200(0, arg0 + 1 & class113.field1861, (byte) 74);
            for (int var8 = 0; var8 < class261.field4405; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[class98.field1628 & var8 - 1] - var6[class98.field1628 & var8 + 1]) * var4 >> 12;
                int var11 = var9 >> 4;
                int var12 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class38.field562[var12 + ((var11 + 1) * var11 >> 1)] & 0xFF;
                int var14 = var9 * var13 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = this.field1347[1] * var14 >> 12;
                int var17 = var13 * 4096 >> 8;
                int var18 = this.field1347[0] * var15 >> 12;
                int var19 = this.field1347[2] * var17 >> 12;
                var3[var8] = var16 + var18 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(B)V", line = 286)
    public final void method553(byte arg0) {
        this.method648((byte) 102);
        field1351++;
        if (arg0 >= -82) {
            field1349 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(B)V", line = 297)
    public static final void method646(byte arg0) {
        if (class117.field1960 == 2) {
            if (class65.field1157 == class45.field695 && class354.field5623 == class196.field3144) {
                class117.field1960 = 0;
                if (class162.field2569 && class240.field3972[81] && class104.field1683 > 2) {
                    class151.method1169(class104.field1683 - 2, -4);
                } else {
                    class151.method1169(class104.field1683 - 1, -4);
                }
            }
        } else if (class45.field695 == class333.field5278 && class229.field3812 == class196.field3144) {
            class117.field1960 = 0;
            if (class162.field2569 && class240.field3972[81] && class104.field1683 > 2) {
                class151.method1169(class104.field1683 - 2, -4);
            } else {
                class151.method1169(class104.field1683 - 1, arg0 + 76);
            }
        } else {
            class354.field5623 = class229.field3812;
            class65.field1157 = class333.field5278;
            class117.field1960 = 2;
        }
        field1358++;
        if (arg0 != -80) {
            field1349 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(II)V", line = 354)
    public static final void method647(int arg0, int arg1) {
        field1356++;
        if (arg1 > -51) {
            field1353 = (boolean[]) null;
        }
        class216.field3467.method2334(4, arg0);
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(B)V", line = 367)
    private final void method648(byte arg0) {
        double var2 = Math.cos((double) ((float) this.field1360 / 4096.0F));
        field1346++;
        this.field1347[0] = (int) (Math.sin((double) ((float) this.field1352 / 4096.0F)) * var2 * 4096.0D);
        this.field1347[1] = (int) (var2 * 4096.0D * Math.cos((double) ((float) this.field1352 / 4096.0F)));
        this.field1347[2] = (int) (Math.sin((double) ((float) this.field1360 / 4096.0F)) * 4096.0D);
        int var4 = this.field1347[2] * this.field1347[2] >> 12;
        int var5 = this.field1347[1] * this.field1347[1] >> 12;
        int var6 = this.field1347[0] * this.field1347[0] >> 12;
        if (arg0 <= 89) {
            return;
        }
        int var7 = (int) (Math.sqrt((double) (var6 + var5 + var4 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field1347[2] = (this.field1347[2] << 12) / var7;
            this.field1347[0] = (this.field1347[0] << 12) / var7;
            this.field1347[1] = (this.field1347[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(Z)V", line = 414)
    public static void method649(boolean arg0) {
        field1349 = null;
        if (!arg0) {
            method645(70, 0, 14, -105);
        }
        field1348 = null;
        field1353 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lqm;II)V", line = 430)
    public final void method75(class227 arg0, int arg1, int arg2) {
        if (arg1 != -2470) {
            return;
        }
        if (arg2 == 0) {
            this.field1354 = arg0.method1765(true);
        } else if (arg2 == 1) {
            this.field1352 = arg0.method1765(true);
        } else if (arg2 == 2) {
            this.field1360 = arg0.method1765(true);
        }
        field1359++;
    }
}
