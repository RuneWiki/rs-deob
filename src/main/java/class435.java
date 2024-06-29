import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class435 {

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Ljava/lang/String;")
    public static String field6351 = null;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "[I")
    public static int[] field6356 = new int[32];

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "Z")
    public static boolean field6362 = false;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "F")
    public static float field6360;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    private int field6350;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field6352;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public static int field6353;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public int field6358;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "Loo;")
    public static class383 field6364;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
    public final void method2686(byte arg0) {
        if (arg0 <= 6) {
            method2693(22, (String[]) null);
        }
        this.field6358 &= 0x3FFF;
        field6363++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IJII)V")
    public static final void method2687(int arg0, long arg1, int arg2, int arg3) {
        field6357++;
        int var5 = (int) arg1 >> 14 & 0x1F;
        int var6 = ((int) arg1 & 0x3C73FC) >> 20;
        int var7 = 87 % ((-arg2 - 18) / 42);
        int var8 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class108.method573(0, var6, class427.field6264.field6109[0], class427.field6264.field6119[0], 0, arg0, 0, var5, true, arg3, true);
            return;
        }
        class225 var9 = class281.method1655((byte) -28, var8);
        int var10;
        int var11;
        if (var6 == 0 || var6 == 2) {
            var10 = var9.field3019;
            var11 = var9.field2995;
        } else {
            var10 = var9.field2995;
            var11 = var9.field3019;
        }
        int var12 = var9.field3031;
        if (var6 != 0) {
            var12 = (var12 >> 4 - var6) + (var12 << var6 & 0xF);
        }
        class108.method573(var12, 0, class427.field6264.field6109[0], class427.field6264.field6119[0], var10, arg0, var11, 0, true, arg3, true);
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)Ljj;")
    public static final class156 method2688(boolean arg0) {
        field6367++;
        if (arg0) {
            return class36.field359 < class5.field41.length ? class5.field41[class36.field359++] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public static void method2689(int arg0) {
        if (arg0 == -32170) {
            field6351 = null;
            field6364 = null;
            field6356 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)I")
    public final int method2690(int arg0) {
        field6353++;
        if (arg0 != -17869) {
            this.method2694(-110, 116);
        }
        return this.field6358 & 0x3FFF;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)Z")
    public static final boolean method2691(byte arg0, int arg1) {
        field6365++;
        if (arg1 == 15 || arg1 == 32 || arg1 == 5 || arg1 == 13 || arg1 == 1 || arg1 == 16 || arg1 == 51 || arg1 == 59) {
            return true;
        } else if (arg1 == 45 || arg1 == 18 || arg1 == 1001 || arg1 == 1006) {
            return true;
        } else if (arg1 == 41 || arg1 == 26 || arg1 == 35 || arg1 == 43 || arg1 == 31) {
            return true;
        } else {
            if (arg0 >= -119) {
                field6356 = null;
            }
            return arg1 == 42 || arg1 == 4 || arg1 == 24 || arg1 == 36 || arg1 == 10 || arg1 == 44;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)Z")
    public final boolean method2692(int arg0, int arg1, int arg2, int arg3) {
        field6361++;
        int var5 = this.field6350;
        if (this.field6358 == arg3 && this.field6350 == 0) {
            return false;
        }
        boolean var6;
        if (this.field6350 == 0) {
            if (arg3 > this.field6358 && arg3 <= this.field6358 + arg2 || this.field6358 > arg3 && arg3 >= this.field6358 - arg2) {
                this.field6358 = arg3;
                return false;
            }
            var6 = true;
        } else if (this.field6350 > 0 && this.field6358 < arg3) {
            int var7 = this.field6350 * this.field6350 / (arg2 * 2);
            int var8 = this.field6358 + var7;
            if (var8 < arg3 && var8 >= this.field6358) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field6350 < 0 && arg3 < this.field6358) {
            int var9 = this.field6350 * this.field6350 / (arg2 * 2);
            int var10 = this.field6358 - var9;
            if (var10 > arg3 && var10 <= this.field6358) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (arg3 <= this.field6358) {
                this.field6350 -= arg2;
                if (arg1 != 0 && this.field6350 < -arg1) {
                    this.field6350 = -arg1;
                }
            } else {
                this.field6350 += arg2;
                if (arg1 != 0 && arg1 < this.field6350) {
                    this.field6350 = arg1;
                }
            }
            if (this.field6350 != var5) {
                int var11 = this.field6350 * this.field6350 / (arg2 * 2);
                if (arg3 > this.field6358) {
                    if (this.field6358 + var11 > arg3) {
                        this.field6350 = var5;
                    }
                } else if (arg3 < this.field6358 && this.field6358 - var11 < arg3) {
                    this.field6350 = var5;
                }
            }
        } else if (this.field6350 <= 0) {
            this.field6350 += arg2;
            if (this.field6350 > 0) {
                this.field6350 = 0;
            }
        } else {
            this.field6350 -= arg2;
            if (this.field6350 < 0) {
                this.field6350 = 0;
            }
        }
        if (arg0 == 1) {
            this.field6358 += this.field6350 + var5 >> 1;
            return var6;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
    public static final String[] method2693(int arg0, String[] arg1) {
        field6366++;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        if (arg0 != -20122) {
            field6364 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
    public final void method2694(int arg0, int arg1) {
        this.field6350 = arg1;
        field6359++;
        this.field6358 = arg0;
    }
}
