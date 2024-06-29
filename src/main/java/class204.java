import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lda")
public class class204 {

    @OriginalMember(owner = "client!lda", name = "m", descriptor = "Lkf;")
    private class287 field2417 = new class287();

    @OriginalMember(owner = "client!lda", name = "k", descriptor = "Ljava/lang/String;")
    public String field2415;

    @OriginalMember(owner = "client!lda", name = "g", descriptor = "Lad;")
    public static class19 field2411 = new class19(4);

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!lda", name = "e", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!lda", name = "f", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!lda", name = "h", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!lda", name = "i", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!lda", name = "j", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!lda", name = "l", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!lda", name = "n", descriptor = "I")
    private volatile int field2418;

    @OriginalMember(owner = "client!lda", name = "o", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!lda", name = "p", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!lda", name = "q", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!lda", name = "s", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!lda", name = "t", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!lda", name = "u", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!lda", name = "r", descriptor = "Lhs;")
    private class589 field2422;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "[I")
    public static int[] field2405;

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(B)Z")
    public final boolean method1215(byte arg0) {
        if (arg0 < 29) {
            method1227(-102);
        }
        field2409++;
        return this.field2418 == 0;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(ILpk;)V")
    public final void method1216(int arg0, class105 arg1) {
        field2416++;
        class287 var3 = this.field2417;
        synchronized (this.field2417) {
            this.field2417.method1670((byte) -96, arg1);
            this.field2418++;
        }
        if (this.field2422 != null) {
            class589 var4 = this.field2422;
            synchronized (this.field2422) {
                this.field2422.notify();
            }
        }
        if (arg0 != 0) {
            this.field2422 = null;
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2420++;
        int var7 = arg0 + arg4;
        int var8 = arg6 - arg0;
        for (int var9 = arg4; var9 < var7; var9++) {
            class315.method1809(class557.field7954[var9], arg2, -128, arg5, arg1);
        }
        if (arg3 != 8) {
            method1226((byte) 66, null, null);
        }
        for (int var10 = arg6; var10 > var8; var10--) {
            class315.method1809(class557.field7954[var10], arg2, -128, arg5, arg1);
        }
        int var11 = arg5 + arg0;
        int var12 = arg1 - arg0;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class557.field7954[var13];
            class315.method1809(var14, arg2, -128, arg5, var11);
            class315.method1809(var14, arg2, -128, var12, arg1);
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(I)V")
    public static final void method1218(int arg0) {
        field2424++;
        if (!class348.field4665) {
            return;
        }
        class452 var1 = class633.method3558(class128.field1439, -1, class465.field6641);
        if (var1 != null && var1.field6369 != null) {
            class213 var2 = new class213();
            var2.field2592 = var1;
            var2.field2587 = var1.field6369;
            class281.method1642(var2);
        }
        class672.field9355 = -1;
        class348.field4665 = false;
        class178.field1992 = -1;
        int var3 = 114 % ((-arg0 - 48) / 43);
        if (var1 != null) {
            class130.method741(var1, 26034);
        }
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(I)V")
    public static void method1219(int arg0) {
        field2405 = null;
        field2411 = null;
        if (arg0 != 0) {
            method1219(31);
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(Lrb;B)V")
    public final void method1220(class383 arg0, byte arg1) {
        field2419++;
        arg0.field5180 = false;
        class287 var3 = this.field2417;
        synchronized (this.field2417) {
            if (arg1 >= -57) {
                field2411 = null;
            }
            this.field2417.method1670((byte) -16, arg0);
            this.field2418++;
        }
        if (this.field2422 != null) {
            class589 var4 = this.field2422;
            synchronized (this.field2422) {
                this.field2422.notify();
            }
        }
    }

    @OriginalMember(owner = "client!lda", name = "b", descriptor = "(Lrb;B)V")
    public final void method1221(class383 arg0, byte arg1) {
        if (arg1 != -75) {
            method1224(10, 86, 56, null);
        }
        arg0.field5180 = true;
        field2410++;
        class287 var3 = this.field2417;
        synchronized (this.field2417) {
            this.field2417.method1670((byte) -50, arg0);
            this.field2418++;
        }
        if (this.field2422 != null) {
            class589 var4 = this.field2422;
            synchronized (this.field2422) {
                this.field2422.notify();
            }
        }
    }

    @OriginalMember(owner = "client!lda", name = "c", descriptor = "(I)Lki;")
    public final class321 method1222(int arg0) {
        field2421++;
        Object var2 = null;
        class287 var3 = this.field2417;
        synchronized (this.field2417) {
            class321 var4 = this.field2417.method1672((byte) 93);
            var4.method1821(109);
            if (arg0 == 0) {
                this.field2418--;
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(ILhs;)V")
    public final void method1223(int arg0, class589 arg1) {
        this.field2422 = arg1;
        if (arg0 != -1) {
            this.field2415 = null;
        }
        field2425++;
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(III[B)Ljava/lang/String;")
    public static final String method1224(int arg0, int arg1, int arg2, byte[] arg3) {
        field2408++;
        char[] var4 = new char[arg2];
        if (arg0 <= 23) {
            field2411 = null;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < arg2; var6++) {
            int var7 = arg3[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class369.field5052[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var4[var5++] = (char) var7;
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(ILce;I)V")
    public static final void method1225(int arg0, class445 arg1, int arg2) {
        class540.field7591 = false;
        class293.field3662 = 0;
        field2407++;
        if (arg0 <= 55) {
            method1226((byte) 74, null, null);
        }
        class315.method1810(28062, arg1);
        class164.method889(1265482928, arg1);
        if (class540.field7591) {
            System.out.println("---endgpp---");
        }
        if (arg1.field1218 != arg2) {
            throw new RuntimeException("gpi1 pos:" + arg1.field1218 + " psize:" + arg2);
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(B[[BLuk;)V")
    public static final void method1226(byte arg0, byte[][] arg1, class476 arg2) {
        field2412++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg2.field8807; var4++) {
            class530.method2975((byte) 86);
            for (int var6 = 0; var6 < (class142.field1574 >> 3); var6++) {
                for (int var7 = 0; var7 < class140.field1550 >> 3; var7++) {
                    int var8 = class687.field9668[var4][var6][var7];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg2.field8821 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = (var8 & 0xFFFF8E) >> 14;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + (var12 / 8);
                            for (int var14 = 0; var14 < class306.field3784.length; var14++) {
                                if (class306.field3784[var14] == var13 && arg1[var14] != null) {
                                    class115 var15 = new class115(arg1[var14]);
                                    arg2.method3502(var15, class282.field3534, var6 * 8, var12, var4, var11, var7 * 8, 5816, var9, var10);
                                    arg2.method2743(var12, var9, var6 * 8, (byte) -62, var7 * 8, var15, class701.field9813, var11, var10, var4, var3[0] == -1 ? var3 : null);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        int var5 = -96 % ((-arg0 - 50) / 34);
        if (var3[0] != -1) {
            class160.field1788 = class66.field669.method2494(var3[0], var3[2], 80, class328.field4021, var3[1], var3[3]);
            class153.field1692 = var3[4];
        }
    }

    @OriginalMember(owner = "client!lda", name = "d", descriptor = "(I)V")
    public static final void method1227(int arg0) {
        field2413++;
        if (class655.field9213 != null) {
            return;
        }
        class655.field9213 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        if (arg0 != -4481) {
            method1219(-101);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = var12 - (float) var13;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - (var6 * var15)) * var8;
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var10 = var18;
                    var9 = var8;
                    var11 = var16;
                } else if (var14 == 1) {
                    var11 = var16;
                    var10 = var8;
                    var9 = var17;
                } else if (var14 == 2) {
                    var11 = var18;
                    var10 = var8;
                    var9 = var16;
                } else if (var14 == 3) {
                    var11 = var8;
                    var10 = var17;
                    var9 = var16;
                } else if (var14 == 4) {
                    var10 = var16;
                    var11 = var8;
                    var9 = var18;
                } else if (var14 == 5) {
                    var11 = var17;
                    var9 = var8;
                    var10 = var16;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var23 << 8) + (var22 << 16) + var24 - 16777216;
                class655.field9213[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!lda", name = "a", descriptor = "(ZLr;)V")
    public static final void method1228(boolean arg0, class564 arg1) {
        field2423++;
        if (class421.field5610 == class362.field4859.field5166 || class487.field7044 == null) {
            return;
        }
        if (arg0) {
            field2411 = null;
        }
        if (class536.method3005(class362.field4859.field5166, 31343400, arg1)) {
            class421.field5610 = class362.field4859.field5166;
        }
    }

    @OriginalMember(owner = "client!lda", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class204(String arg0) {
        this.field2415 = arg0;
    }
}
