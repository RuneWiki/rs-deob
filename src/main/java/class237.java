import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class237 extends class297 {

    @OriginalMember(owner = "client!ti", name = "U", descriptor = "[B")
    private byte[] field3566 = new byte[512];

    @OriginalMember(owner = "client!ti", name = "Y", descriptor = "I")
    public int field3570 = 4;

    @OriginalMember(owner = "client!ti", name = "cb", descriptor = "I")
    public int field3574 = 4;

    @OriginalMember(owner = "client!ti", name = "X", descriptor = "I")
    public int field3569 = 4;

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
    public int field3554 = 1638;

    @OriginalMember(owner = "client!ti", name = "W", descriptor = "I")
    public int field3568 = 0;

    @OriginalMember(owner = "client!ti", name = "ib", descriptor = "Z")
    public boolean field3580 = true;

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "Z")
    public static boolean field3555 = true;

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "F")
    public static float field3557;

    @OriginalMember(owner = "client!ti", name = "M", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!ti", name = "N", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!ti", name = "T", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!ti", name = "V", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!ti", name = "Z", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!ti", name = "ab", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!ti", name = "bb", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!ti", name = "db", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!ti", name = "eb", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!ti", name = "fb", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!ti", name = "hb", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!ti", name = "R", descriptor = "Lkc;")
    public static class41 field3563;

    @OriginalMember(owner = "client!ti", name = "gb", descriptor = "[Ljava/lang/String;")
    public static String[] field3578;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "[S")
    private short[] field3556;

    @OriginalMember(owner = "client!ti", name = "Q", descriptor = "[S")
    private short[] field3562;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(ZI)Z", line = 13)
    public static final boolean method1691(boolean arg0, int arg1) {
        field3571++;
        boolean var2 = class54.method459();
        if (arg1 != 504172684) {
            return true;
        } else if (var2 == arg0) {
            return true;
        } else {
            if (!arg0) {
                class54.method462();
            } else if (!class54.method465() || !class54.method457() || !class54.method458()) {
                arg0 = false;
            }
            class151.field2467 = arg0;
            class281.method1976(class92.field1484, -7136);
            if (arg0 == var2) {
                return false;
            } else {
                ((class277) class40.field614).method1963(255);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 51)
    public static final void method1692(String arg0, byte arg1) {
        if (arg1 != -1) {
            method1694(122, 16, 58);
        }
        field3565++;
        int var2 = class137.method1058(arg1 ^ 0xFFFFFF85, arg0);
        if (var2 != -1) {
            int[] var3 = class322.field5049.method720((byte) -91, (class62.field903.field1780[var2] & 0x33ACE4D5) >> 28, class62.field903.field1780[var2] & 0x3FFF, (class62.field903.field1780[var2] & 0xFFFE706) >> 14);
            class147.method1113(arg1 - 69, var3[2], var3[1]);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZ)[I", line = 73)
    public final int[] method173(int arg0, boolean arg1) {
        field3573++;
        if (!arg1) {
            return (int[]) null;
        }
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (this.field4760.field388) {
            this.method1699(-108, var3, arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)Z", line = 96)
    public static final boolean method1693(String arg0, byte arg1, String arg2) {
        int var3 = arg0.length();
        int var4 = arg2.length();
        field3579++;
        if (var4 > var3) {
            return false;
        }
        if (arg1 != -9) {
            method1692((String) null, (byte) 5);
        }
        for (int var5 = 0; var5 < var4; var5++) {
            char var6 = arg0.charAt(var5);
            char var7 = arg2.charAt(var5);
            if (var6 != var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && Character.toUpperCase(var6) != Character.toUpperCase(var7)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(III)Lvd;", line = 130)
    public static final class144 method1694(int arg0, int arg1, int arg2) {
        class42 var3 = class34.field521[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field672; var4++) {
            class144 var5 = var3.field659[var4];
            if ((var5.field2344 >> 29 & 0x3L) == 2L && var5.field2345 == arg1 && var5.field2339 == arg2) {
                class102.method832(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IZILpk;BII)V", line = 157)
    public static final void method1695(int arg0, boolean arg1, int arg2, class120 arg3, byte arg4, int arg5, int arg6) {
        field3567++;
        class25.field423 = arg0;
        class182.field2882 = 1;
        class225.field3494 = arg1;
        class130.field2076 = arg5;
        class13.field284 = arg3;
        class68.field1035 = arg2;
        if (arg4 != -64) {
            method1695(71, false, 115, (class120) null, (byte) 108, -34, 87);
        }
        class164.field2663 = arg6;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "()V", line = 294)
    public class237() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILaj;)V", line = 182)
    public final void method169(int arg0, int arg1, class1 arg2) {
        field3560++;
        if (arg0 == 0) {
            this.field3580 = arg2.method15((byte) 66) == 1;
        } else if (arg0 == 1) {
            this.field3574 = arg2.method15((byte) 126);
        } else if (arg0 == 2) {
            this.field3554 = arg2.method41((byte) -66);
            if (this.field3554 < 0) {
                this.field3556 = new short[this.field3574];
                for (int var5 = 0; var5 < this.field3574; var5++) {
                    this.field3556[var5] = (short) arg2.method41((byte) -66);
                }
            }
        } else if (arg0 == 3) {
            this.field3569 = this.field3570 = arg2.method15((byte) -109);
        } else if (arg0 == 4) {
            this.field3568 = arg2.method15((byte) -33);
        } else if (arg0 == 5) {
            this.field3569 = arg2.method15((byte) -78);
        } else if (arg0 == 6) {
            this.field3570 = arg2.method15((byte) -64);
        }
        if (arg1 != 255) {
            field3563 = (class41) null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(Z)V", line = 278)
    public static final void method1696(boolean arg0) {
        class209.field3305.method1808((byte) -74, 40);
        if (!arg0) {
            return;
        }
        class209.field3305.method21(77, class101.method823(-15));
        field3559++;
        class209.field3305.method14(-246866616, class211.field3314);
        class209.field3305.method14(-246866616, class338.field5219);
        class1.field63++;
        class209.field3305.method21(-126, class315.field4973);
    }

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "(I)V", line = 299)
    public static void method1697(int arg0) {
        field3563 = null;
        field3578 = null;
        if (arg0 <= 76) {
            method1692((String) null, (byte) -66);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIIZ)I", line = 311)
    private final int method1698(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field3575++;
        int var8 = arg5 - 4096;
        int var9 = arg1 >> 12;
        int var10 = var9 + 1;
        if (!arg6) {
            return 40;
        }
        int var11 = var9 & 0xFF;
        int var12 = this.field3566[arg0 + var11] & 0x3;
        int var13 = arg1 & 0xFFF;
        if (var10 >= arg4) {
            var10 = 0;
        }
        int var14 = var13 - 4096;
        int var15 = var10 & 0xFF;
        int var16 = class264.field3909[var13];
        int var17;
        if (var12 <= 1) {
            var17 = var12 == 0 ? var13 + arg5 : -var13 + arg5;
        } else {
            var17 = var12 == 2 ? var13 - arg5 : -var13 - arg5;
        }
        int var18 = this.field3566[var15 + arg0] & 0x3;
        int var19;
        if (var18 > 1) {
            var19 = var18 == 2 ? var14 - arg5 : -arg5 + -var14;
        } else {
            var19 = var18 == 0 ? var14 + arg5 : -var14 + arg5;
        }
        int var20 = var17 + ((var19 - var17) * var16 >> 12);
        int var21 = this.field3566[var11 + arg3] & 0x3;
        int var22;
        if (var21 > 1) {
            var22 = var21 == 2 ? var13 - var8 : -var8 + -var13;
        } else {
            var22 = var21 == 0 ? var8 + var13 : -var13 + var8;
        }
        int var23 = this.field3566[arg3 + var15] & 0x3;
        int var24;
        if (var23 <= 1) {
            var24 = var23 == 0 ? var8 + var14 : var8 - var14;
        } else {
            var24 = var23 == 2 ? var14 - var8 : -var8 + -var14;
        }
        int var25 = ((var24 - var22) * var16 >> 12) + var22;
        return ((var25 - var20) * arg2 >> 12) + var20;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I[II)V", line = 387)
    public final void method1699(int arg0, int[] arg1, int arg2) {
        field3572++;
        int var4 = class264.field3901[arg2] * this.field3570;
        if (arg0 >= -7) {
            this.method169(3, 6, (class1) null);
        }
        if (this.field3574 == 1) {
            short var5 = this.field3556[0];
            int var6 = this.field3562[0] << 12;
            int var7 = var4 * var6 >> 12;
            int var8 = var7 >> 12;
            int var9 = var7 & 0xFFF;
            int var10 = this.field3569 * var6 >> 12;
            int var11 = var8 + 1;
            int var12 = class264.field3909[var9];
            int var13 = this.field3566[var8 & 0xFF] & 0xFF;
            int var14 = this.field3570 * var6 >> 12;
            if (var11 >= var14) {
                var11 = 0;
            }
            int var15 = this.field3566[var11 & 0xFF] & 0xFF;
            if (this.field3580) {
                for (int var19 = 0; var19 < class31.field491; var19++) {
                    int var20 = class251.field3705[var19] * this.field3569;
                    int var21 = this.method1698(var13, var6 * var20 >> 12, var12, var15, var10, var9, true);
                    int var22 = var5 * var21 >> 12;
                    arg1[var19] = (var22 >> 1) + 2048;
                }
            } else {
                for (int var16 = 0; var16 < class31.field491; var16++) {
                    int var17 = class251.field3705[var16] * this.field3569;
                    int var18 = this.method1698(var13, var6 * var17 >> 12, var12, var15, var10, var9, true);
                    arg1[var16] = var5 * var18 >> 12;
                }
            }
            return;
        }
        short var23 = this.field3556[0];
        if (var23 > 8 || var23 < -8) {
            int var24 = this.field3562[0] << 12;
            int var25 = this.field3570 * var24 >> 12;
            int var26 = var4 * var24 >> 12;
            int var27 = this.field3569 * var24 >> 12;
            int var28 = var26 >> 12;
            int var29 = var26 & 0xFFF;
            int var30 = var28 + 1;
            int var31 = class264.field3909[var29];
            int var32 = this.field3566[var28 & 0xFF] & 0xFF;
            if (var30 >= var25) {
                var30 = 0;
            }
            int var33 = this.field3566[var30 & 0xFF] & 0xFF;
            for (int var34 = 0; var34 < class31.field491; var34++) {
                int var35 = class251.field3705[var34] * this.field3569;
                int var36 = this.method1698(var32, var24 * var35 >> 12, var31, var33, var27, var29, true);
                arg1[var34] = var23 * var36 >> 12;
            }
        }
        for (int var37 = 1; var37 < this.field3574; var37++) {
            short var38 = this.field3556[var37];
            if (var38 > 8 || var38 < -8) {
                int var39 = this.field3562[var37] << 12;
                int var40 = var4 * var39 >> 12;
                int var41 = this.field3569 * var39 >> 12;
                int var42 = this.field3570 * var39 >> 12;
                int var43 = var40 >> 12;
                int var44 = this.field3566[var43 & 0xFF] & 0xFF;
                int var45 = var43 + 1;
                int var46 = var40 & 0xFFF;
                int var47 = class264.field3909[var46];
                if (var45 >= var42) {
                    var45 = 0;
                }
                int var48 = this.field3566[var45 & 0xFF] & 0xFF;
                if (this.field3580 && (this.field3574 - 1) == var37) {
                    for (int var49 = 0; var49 < class31.field491; var49++) {
                        int var50 = class251.field3705[var49] * this.field3569;
                        int var51 = this.method1698(var44, var39 * var50 >> 12, var47, var48, var41, var46, true);
                        int var52 = (var38 * var51 >> 12) + arg1[var49];
                        arg1[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; var53 < class31.field491; var53++) {
                        int var54 = class251.field3705[var53] * this.field3569;
                        int var55 = this.method1698(var44, var39 * var54 >> 12, var47, var48, var41, var46, true);
                        arg1[var53] += var38 * var55 >> 12;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V", line = 550)
    public final void method247(byte arg0) {
        this.field3566 = class32.method286((byte) 46, this.field3568);
        if (arg0 != 68) {
            return;
        }
        field3558++;
        this.method1700((byte) 102);
        for (int var2 = this.field3574 - 1; var2 >= 1; var2--) {
            short var3 = this.field3556[var2];
            if (var3 > 8 || var3 < -8) {
                break;
            }
            this.field3574--;
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)V", line = 582)
    private final void method1700(byte arg0) {
        if (this.field3554 > 0) {
            this.field3556 = new short[this.field3574];
            this.field3562 = new short[this.field3574];
            for (int var3 = 0; var3 < this.field3574; var3++) {
                this.field3556[var3] = (short) ((int) (Math.pow((double) ((float) this.field3554 / 4096.0F), (double) var3) * 4096.0D));
                this.field3562[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        } else if (this.field3556 != null && this.field3556.length == this.field3574) {
            this.field3562 = new short[this.field3574];
            for (int var2 = 0; var2 < this.field3574; var2++) {
                this.field3562[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            }
        }
        field3576++;
        int var4 = 45 / ((arg0 - 9) / 43);
    }
}
