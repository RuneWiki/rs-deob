import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class141 extends class80 {

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "[I")
    private int[] field2002;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "[I")
    private int[] field1998;

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "Loh;")
    private class278 field2005;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "Loh;")
    private class278 field1999;

    @OriginalMember(owner = "client!ta", name = "J", descriptor = "Loh;")
    private class278 field2011;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "[Loh;")
    private class278[] field2003;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "Lfg;")
    public static class83 field2000 = new class83("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!ta", name = "L", descriptor = "I")
    public static int field2013 = 0;

    @OriginalMember(owner = "client!ta", name = "K", descriptor = "[I")
    public static int[] field2012 = new int[25];

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!ta", name = "H", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!ta", name = "I", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!ta", name = "M", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZLm;Lvh;DII)[I")
    public final int[] method910(int arg0, boolean arg1, class126 arg2, class240 arg3, double arg4, int arg5, int arg6) {
        class140.field1996 = arg3;
        class44.field618 = arg2;
        field2008++;
        for (int var9 = 0; var9 < this.field2003.length; var9++) {
            this.field2003[var9].method1046((byte) -72, arg0, arg6);
        }
        class157.method974(arg5 + 107, arg4);
        class520.method3060(arg6, arg0, 79);
        int[] var10 = new int[arg0 * 4 * arg6];
        int var11 = 0;
        for (int var12 = arg5; var12 < arg6; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field1999.field3754) {
                int[] var14 = this.field1999.method208(-9, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field1999.method324(78, var12);
                var15 = var18[1];
                var16 = var18[0];
                var17 = var18[2];
            }
            int[] var19;
            if (this.field2011.field3754) {
                var19 = this.field2011.method208(-9, var12);
            } else {
                var19 = this.field2011.method324(121, var12)[0];
            }
            if (arg1) {
                var11 = var12;
            }
            for (int var20 = arg0 - 1; var20 >= 0; var20--) {
                int var21 = var16[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var15[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class128.field1749[var21];
                int var25 = class128.field1749[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class128.field1749[var23];
                int var27;
                if (var24 == 0 && var25 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var25 << 8) + (var24 << 16) + (var27 << 24) + var26;
                if (arg1) {
                    var11 += arg0 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field2003.length; var13++) {
            this.field2003[var13].method410(false);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IZLvh;BZLm;DI)[I")
    public final int[] method911(int arg0, boolean arg1, class240 arg2, byte arg3, boolean arg4, class126 arg5, double arg6, int arg7) {
        class140.field1996 = arg2;
        field2009++;
        class44.field618 = arg5;
        for (int var10 = 0; var10 < this.field2003.length; var10++) {
            this.field2003[var10].method1046((byte) 126, arg7, arg0);
        }
        class157.method974(101, arg6);
        class520.method3060(arg0, arg7, 70);
        int[] var11 = new int[arg0 * arg7];
        byte var12;
        int var13;
        int var14;
        if (arg1) {
            var12 = -1;
            var13 = -1;
            var14 = arg7 - 1;
        } else {
            var14 = 0;
            var13 = arg7;
            var12 = 1;
        }
        int var15 = 0;
        if (arg3 != -101) {
            return null;
        }
        for (int var16 = 0; var16 < arg0; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1999.field3754) {
                int[] var18 = this.field1999.method208(-9, var16);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field1999.method324(90, var16);
                var19 = var22[2];
                var20 = var22[0];
                var21 = var22[1];
            }
            if (arg4) {
                var15 = var16;
            }
            for (int var23 = var14; var23 != var13; var23 += var12) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class128.field1749[var25];
                int var28 = class128.field1749[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class128.field1749[var26];
                int var30 = (var28 << 16) + (var27 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg4) {
                    var15 += arg7 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field2003.length; var17++) {
            this.field2003[var17].method410(false);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lm;ILvh;)Z")
    public final boolean method912(class126 arg0, int arg1, class240 arg2) {
        field1997++;
        if (class378.field5318 < 0) {
            for (int var4 = 0; var4 < this.field2002.length; var4++) {
                if (!arg2.method1412(this.field2002[var4], 1)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field2002.length; var5++) {
                if (!arg2.method1404(class378.field5318, this.field2002[var5], 0)) {
                    return false;
                }
            }
        }
        if (arg1 != -20314) {
            this.field1999 = null;
        }
        for (int var6 = 0; var6 < this.field1998.length; var6++) {
            if (!arg0.method831(this.field1998[var6], 69)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZJ)Ljava/lang/String;")
    public static final String method913(boolean arg0, long arg1) {
        field2006++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            if (arg0) {
                method914(false);
            }
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class495.field7291[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class141() {
        this.field2002 = new int[0];
        this.field1998 = new int[0];
        this.field2005 = new class171(0);
        this.field2005.field3751 = 1;
        this.field1999 = new class171();
        this.field1999.field3751 = 1;
        this.field2011 = new class171();
        this.field2011.field3751 = 1;
        this.field2003 = new class278[] { this.field1999, this.field2011, this.field2005 };
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
    public static void method914(boolean arg0) {
        field2000 = null;
        if (!arg0) {
            method914(true);
        }
        field2012 = null;
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Llh;)V")
    public class141(class365 arg0) {
        int var2 = arg0.method2099(255);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field2003 = new class278[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class278 var16 = class466.method2739(arg0, (byte) 32);
            if (var16.method412(-29) >= 0) {
                var3++;
            }
            if (var16.method1044((byte) 117) >= 0) {
                var4++;
            }
            int var17 = var16.field3744.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2099(255);
            }
            this.field2003[var6] = var16;
        }
        this.field2002 = new int[var3];
        int var7 = 0;
        this.field1998 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class278 var11 = this.field2003[var9];
            int var12 = var11.field3744.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field3744[var13] = this.field2003[var5[var9][var13]];
            }
            int var14 = var11.method412(-100);
            int var15 = var11.method1044((byte) 118);
            if (var14 > 0) {
                this.field2002[var7++] = var14;
            }
            if (var15 > 0) {
                this.field1998[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field1999 = this.field2003[arg0.method2099(255)];
        this.field2011 = this.field2003[arg0.method2099(255)];
        this.field2005 = this.field2003[arg0.method2099(255)];
        Object var10 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ILm;ZIILvh;)[F")
    public final float[] method915(int arg0, class126 arg1, boolean arg2, int arg3, int arg4, class240 arg5) {
        class140.field1996 = arg5;
        field2001++;
        class44.field618 = arg1;
        for (int var7 = 0; var7 < this.field2003.length; var7++) {
            this.field2003[var7].method1046((byte) -23, arg3, arg4);
        }
        class520.method3060(arg4, arg3, -122);
        float[] var8 = new float[arg3 * arg4 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg4; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field1999.field3754) {
                int[] var16 = this.field1999.method208(-9, var10);
                var13 = var16;
                var14 = var16;
                var15 = var16;
            } else {
                int[][] var12 = this.field1999.method324(125, var10);
                var13 = var12[2];
                var14 = var12[1];
                var15 = var12[0];
            }
            int[] var17;
            if (this.field2011.field3754) {
                var17 = this.field2011.method208(-9, var10);
            } else {
                var17 = this.field2011.method324(82, var10)[0];
            }
            int[] var18;
            if (this.field2005.field3754) {
                var18 = this.field2005.method208(-9, var10);
            } else {
                var18 = this.field2005.method324(84, var10)[0];
            }
            if (arg2) {
                var9 = var10 << 2;
            }
            for (int var19 = arg3 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = var20;
                if (arg2) {
                    var9 += (arg3 << 2) - 4;
                }
            }
        }
        if (arg0 > -21) {
            this.method910(86, false, null, null, -0.30929351728059684D, -12, -50);
        }
        for (int var11 = 0; var11 < this.field2003.length; var11++) {
            this.field2003[var11].method410(false);
        }
        return var8;
    }
}
