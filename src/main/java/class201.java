import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class201 {

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "Lo;")
    private class248 field3210 = null;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "Z")
    private boolean field3203;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "Lhh;")
    private class118 field3206;

    @OriginalMember(owner = "client!qh", name = "A", descriptor = "Z")
    private boolean field3223;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "[[[B")
    public static byte[][][] field3198 = new byte[4][104][104];

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!qh", name = "q", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!qh", name = "r", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!qh", name = "t", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!qh", name = "u", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!qh", name = "x", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!qh", name = "y", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!qh", name = "z", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!qh", name = "M", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!qh", name = "N", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!qh", name = "O", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!qh", name = "P", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!qh", name = "Q", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!qh", name = "R", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "Lf;")
    public static class36 field3231;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "Z")
    public static boolean field3208;

    @OriginalMember(owner = "client!qh", name = "o", descriptor = "[I")
    public static int[] field3211;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "[Ljava/lang/Object;")
    private Object[] field3201;

    @OriginalMember(owner = "client!qh", name = "J", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3232;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([III)Z")
    private final boolean method1352(int[] arg0, int arg1, int arg2) {
        field3204++;
        if (!this.method1383(arg1, true)) {
            return false;
        } else if (this.field3201[arg1] == null) {
            return false;
        } else {
            int var4 = this.field3210.field3970[arg1];
            boolean var5 = true;
            int[] var6 = this.field3210.field3962[arg1];
            if (this.field3232[arg1] == null) {
                this.field3232[arg1] = new Object[this.field3210.field3960[arg1]];
            }
            Object[] var7 = this.field3232[arg1];
            if (arg2 != 2) {
                this.method1379((byte) -9, 127);
            }
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var6 == null) {
                    var9 = var8;
                } else {
                    var9 = var6[var8];
                }
                if (var7[var9] == null) {
                    var5 = false;
                    break;
                }
            }
            if (var5) {
                return true;
            }
            byte[] var10;
            if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
                var10 = class47.method379(false, this.field3201[arg1], 13508);
            } else {
                var10 = class47.method379(true, this.field3201[arg1], 13508);
                class221 var11 = new class221(var10);
                var11.method1564(5, var11.field3653.length, arg2 ^ 0x70, arg0);
            }
            byte[] var12;
            try {
                var12 = class78.method548(var10, false);
            } catch (RuntimeException var31) {
                throw class278.method1869(var31, "T3 - " + (arg0 != null) + "," + arg1 + "," + var10.length + "," + class79.method553(102, var10.length, var10) + "," + class79.method553(111, var10.length - 2, var10) + "," + this.field3210.field3951[arg1] + "," + this.field3210.field3958);
            }
            if (this.field3203) {
                this.field3201[arg1] = null;
            }
            if (var4 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                class221 var16 = new class221(var12);
                int[] var17 = new int[var4];
                int var18 = var32 - var15 * 4 * var4;
                var16.field3655 = var18;
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var4; var21++) {
                        var20 += var16.method1526(-16777216);
                        var17[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var4][];
                for (int var23 = 0; var23 < var4; var23++) {
                    var22[var23] = new byte[var17[var23]];
                    var17[var23] = 0;
                }
                int var24 = 0;
                var16.field3655 = var18;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var4; var27++) {
                        var26 += var16.method1526(-16777216);
                        class140.method973(var12, var24, var22[var27], var17[var27], var26);
                        var17[var27] += var26;
                        var24 += var26;
                    }
                }
                for (int var28 = 0; var28 < var4; var28++) {
                    int var29;
                    if (var6 == null) {
                        var29 = var28;
                    } else {
                        var29 = var6[var28];
                    }
                    if (this.field3223) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class101.method740(var22[var28], class91.method687(arg2, 2), false);
                    }
                }
            } else {
                int var30;
                if (var6 == null) {
                    var30 = 0;
                } else {
                    var30 = var6[0];
                }
                if (this.field3223) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class101.method740(var12, 0, false);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)Z")
    public final boolean method1353(int arg0, int arg1) {
        field3221++;
        if (arg0 > -4) {
            this.field3201 = null;
        }
        if (!this.method1362((byte) -114)) {
            return false;
        } else if (this.field3210.field3960.length == 1) {
            return this.method1371((byte) -112, 0, arg1);
        } else if (!this.method1383(arg1, true)) {
            return false;
        } else if (this.field3210.field3960[arg1] == 1) {
            return this.method1371((byte) -112, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIBI)V")
    public static final void method1354(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field3236++;
        int var6 = arg0 * arg0;
        int var7 = arg2;
        int var8 = 0;
        int var9 = arg2 * arg2;
        int var10 = var9 << 1;
        int var11 = var6 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var6 + var10;
        int var14 = var6 << 2;
        int var15 = var9 - ((var12 - 1) * var11);
        int var16 = ((var8 << 1) + 3) * var10;
        int var17 = var9 << 2;
        if (arg4 >= -122) {
            return;
        }
        int var18 = ((arg2 << 1) - 3) * var11;
        int var19 = (var8 + 1) * var17;
        int var20 = (arg2 - 1) * var14;
        if (class161.field2561 <= arg5 && class51.field896 >= arg5) {
            int var21 = class51.method393(arg0 + arg1, 0, class255.field4055, class9.field128);
            int var22 = class51.method393(arg1 - arg0, 0, class255.field4055, class9.field128);
            class56.method420(class29.field452[arg5], arg3, -7, var22, var21);
        }
        while (var7 > 0) {
            var7--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var15 += var19;
                    var19 += var17;
                    var13 += var16;
                    var8++;
                    var16 += var17;
                }
            }
            if (var15 < 0) {
                var15 += var19;
                var8++;
                var13 += var16;
                var19 += var17;
                var16 += var17;
            }
            var13 += -var20;
            var15 += -var18;
            var20 -= var14;
            var18 -= var14;
            int var23 = arg5 - var7;
            int var24 = arg5 + var7;
            if (class161.field2561 <= var24 && class51.field896 >= var23) {
                int var25 = class51.method393(arg1 + var8, 0, class255.field4055, class9.field128);
                int var26 = class51.method393(arg1 - var8, 0, class255.field4055, class9.field128);
                if (var23 >= class161.field2561) {
                    class56.method420(class29.field452[var23], arg3, -7, var26, var25);
                }
                if (var24 <= class51.field896) {
                    class56.method420(class29.field452[var24], arg3, -7, var26, var25);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)V")
    private final void method1355(int arg0, int arg1) {
        if (this.field3203) {
            this.field3201[arg0] = this.field3206.method869(arg0, (byte) 0);
        } else {
            this.field3201[arg0] = class101.method740(this.field3206.method869(arg0, (byte) 0), 0, false);
        }
        if (arg1 != 2) {
            this.method1364((int[]) null, 68, (byte) -35, -10);
        }
        field3202++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method1356(String arg0, byte arg1) {
        field3238++;
        if (arg1 < 17) {
            this.method1374(true, false, -61);
        }
        if (this.method1362((byte) -66)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field3210.field3967.method937(-103, class99.method728(true, var3));
            return this.method1380(var4, (byte) 93);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(III)[B")
    public final byte[] method1357(int arg0, int arg1, int arg2) {
        field3212++;
        if (arg2 != -1) {
            this.method1359((String) null, (String) null, (byte) 91);
        }
        return this.method1364((int[]) null, arg0, (byte) 126, arg1);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I[I)[I")
    public static final int[] method1358(int arg0, int[] arg1) {
        field3217++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 >= -52) {
            field3198 = null;
        }
        int[] var2 = new int[arg1.length];
        class140.method969(arg1, 0, var2, 0, arg1.length);
        return var2;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
    public final boolean method1359(String arg0, String arg1, byte arg2) {
        if (arg2 >= -5) {
            this.method1385(56);
        }
        field3235++;
        if (!this.method1362((byte) -117)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field3210.field3967.method937(-106, class99.method728(true, var4));
        if (this.method1383(var6, true)) {
            int var7 = this.field3210.field3966[var6].method937(72, class99.method728(true, var5));
            return this.method1371((byte) -112, var6, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(II)[I")
    public final int[] method1360(int arg0, int arg1) {
        field3216++;
        if (!this.method1383(arg1, true)) {
            return null;
        }
        if (arg0 != 1) {
            this.field3206 = null;
        }
        int[] var3 = this.field3210.field3962[arg1];
        if (var3 == null) {
            var3 = new int[this.field3210.field3970[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(II)I")
    public final int method1361(int arg0, int arg1) {
        field3218++;
        if (arg1 >= -29) {
            this.field3223 = false;
        }
        return this.method1383(arg0, true) ? this.field3210.field3960[arg0] : 0;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)Z")
    private final boolean method1362(byte arg0) {
        field3222++;
        if (arg0 >= -2) {
            return false;
        }
        if (this.field3210 == null) {
            this.field3210 = this.field3206.method865(255);
            if (this.field3210 == null) {
                return false;
            }
            this.field3201 = new Object[this.field3210.field3964];
            this.field3232 = new Object[this.field3210.field3964][];
        }
        return true;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLjava/lang/String;)I")
    public final int method1363(byte arg0, String arg1) {
        if (arg0 != -90) {
            this.field3201 = null;
        }
        field3219++;
        if (this.method1362((byte) -71)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field3210.field3967.method937(78, class99.method728(true, var3));
            return this.method1384(var4, (byte) 101);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([IIBI)[B")
    public final byte[] method1364(int[] arg0, int arg1, byte arg2, int arg3) {
        field3234++;
        if (!this.method1377(arg3, arg1, -13676)) {
            return null;
        }
        int var5 = -102 % ((arg2 - 89) / 35);
        if (this.field3232[arg3] == null || this.field3232[arg3][arg1] == null) {
            boolean var6 = this.method1352(arg0, arg3, 2);
            if (!var6) {
                this.method1355(arg3, 2);
                boolean var7 = this.method1352(arg0, arg3, 2);
                if (!var7) {
                    return null;
                }
            }
        }
        byte[] var8 = class47.method379(false, this.field3232[arg3][arg1], 13508);
        if (this.field3223) {
            this.field3232[arg3][arg1] = null;
            if (this.field3210.field3960[arg3] == 1) {
                this.field3232[arg3] = null;
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method1365(String arg0, int arg1) {
        field3230++;
        if (!this.method1362((byte) -122)) {
            return false;
        }
        if (arg1 > -92) {
            field3208 = true;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field3210.field3967.method937(60, class99.method728(true, var3));
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class285 var10 = null;
        field3213++;
        for (class285 var11 = (class285) class206.field3310.method843(-112); var11 != null; var11 = (class285) class206.field3310.method852((byte) 123)) {
            if (var11.field4505 == arg6 && var11.field4501 == arg9 && var11.field4509 == arg4 && var11.field4497 == arg5) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class285();
            var10.field4501 = arg9;
            var10.field4505 = arg6;
            var10.field4509 = arg4;
            var10.field4497 = arg5;
            class34.method287(92, var10);
            class206.field3310.method855(false, var10);
        }
        var10.field4502 = arg8;
        var10.field4511 = arg3;
        var10.field4498 = arg0;
        var10.field4493 = arg2;
        var10.field4494 = arg7;
        if (arg1 != 0) {
            method1381(-92);
        }
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(II)[B")
    public final byte[] method1367(int arg0, int arg1) {
        field3224++;
        if (!this.method1362((byte) -65)) {
            return null;
        }
        if (arg0 >= -51) {
            field3211 = null;
        }
        if (this.field3210.field3960.length == 1) {
            return this.method1357(arg1, 0, -1);
        } else if (!this.method1383(arg1, true)) {
            return null;
        } else if (this.field3210.field3960[arg1] == 1) {
            return this.method1357(0, arg1, -1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)I")
    public final int method1368(int arg0) {
        field3239++;
        if (arg0 != 1596) {
            this.method1379((byte) -93, -71);
        }
        return this.method1362((byte) -67) ? this.field3210.field3960.length : -1;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
    public final void method1369(byte arg0) {
        field3229++;
        int var2 = -1 % ((20 - arg0) / 53);
        if (this.field3232 != null) {
            for (int var3 = 0; var3 < this.field3232.length; var3++) {
                this.field3232[var3] = null;
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZ)V")
    public static final void method1370(int arg0, boolean arg1) {
        field3209++;
        class49.field867.method476(false, arg0);
        if (!arg1) {
            method1354(-111, -48, 30, -8, (byte) -55, 32);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BII)Z")
    public final boolean method1371(byte arg0, int arg1, int arg2) {
        field3199++;
        if (!this.method1377(arg1, arg2, -13676)) {
            return false;
        } else if (this.field3232[arg1] != null && this.field3232[arg1][arg2] != null) {
            return true;
        } else if (this.field3201[arg1] != null) {
            return true;
        } else if (arg0 == -112) {
            this.method1355(arg1, 2);
            return this.field3201[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(III)[B")
    public final byte[] method1372(int arg0, int arg1, int arg2) {
        field3197++;
        if (!this.method1377(arg1, arg0, -13676)) {
            return null;
        }
        if (arg2 != -401709663) {
            this.method1357(101, -107, 5);
        }
        if (this.field3232[arg1] == null || this.field3232[arg1][arg0] == null) {
            boolean var4 = this.method1352((int[]) null, arg1, 2);
            if (!var4) {
                this.method1355(arg1, 2);
                boolean var5 = this.method1352((int[]) null, arg1, 2);
                if (!var5) {
                    return null;
                }
            }
        }
        return class47.method379(false, this.field3232[arg1][arg0], 13508);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILjava/lang/String;)I")
    public final int method1373(int arg0, String arg1) {
        field3215++;
        int var3 = 113 / ((arg0 - 10) / 49);
        if (this.method1362((byte) -107)) {
            String var4 = arg1.toLowerCase();
            int var5 = this.field3210.field3967.method937(86, class99.method728(true, var4));
            return this.method1383(var5, true) ? var5 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZZI)V")
    public final void method1374(boolean arg0, boolean arg1, int arg2) {
        field3237++;
        int var4 = -122 / ((18 - arg2) / 47);
        if (!this.method1362((byte) -59)) {
            return;
        }
        if (arg1) {
            this.field3210.field3957 = null;
            this.field3210.field3966 = null;
        }
        if (arg0) {
            this.field3210.field3955 = null;
            this.field3210.field3967 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(Ljava/lang/String;I)V")
    public final void method1375(String arg0, int arg1) {
        field3205++;
        if (this.method1362((byte) -62) && arg1 > 27) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field3210.field3967.method937(52, class99.method728(true, var3));
            this.method1378(false, var4);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B")
    public final byte[] method1376(String arg0, byte arg1, String arg2) {
        field3207++;
        if (!this.method1362((byte) -37)) {
            return null;
        }
        if (arg1 != 44) {
            this.method1364((int[]) null, 41, (byte) 22, -18);
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field3210.field3967.method937(arg1 ^ 0x3F, class99.method728(true, var4));
        if (this.method1383(var6, true)) {
            int var7 = this.field3210.field3966[var6].method937(arg1 + 59, class99.method728(true, var5));
            return this.method1357(var7, var6, -1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(III)Z")
    private final boolean method1377(int arg0, int arg1, int arg2) {
        field3200++;
        if (arg2 != -13676) {
            return true;
        } else if (!this.method1362((byte) -86)) {
            return false;
        } else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.field3210.field3960.length && arg1 < this.field3210.field3960[arg0]) {
            return true;
        } else if (class175.field2739) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZI)V")
    private final void method1378(boolean arg0, int arg1) {
        if (arg0) {
            this.field3210 = null;
        }
        this.field3206.method864(30481, arg1);
        field3214++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BI)V")
    public final void method1379(byte arg0, int arg1) {
        field3228++;
        if (!this.method1383(arg1, true)) {
            return;
        }
        if (this.field3232 != null) {
            this.field3232[arg1] = null;
        }
        if (arg0 != -13) {
            this.method1373(-108, (String) null);
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)Z")
    public final boolean method1380(int arg0, byte arg1) {
        field3233++;
        if (!this.method1383(arg0, true)) {
            return false;
        }
        int var3 = -84 / ((arg1 - 13) / 62);
        if (this.field3201[arg0] == null) {
            this.method1355(arg0, 2);
            return this.field3201[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
    public static void method1381(int arg0) {
        field3231 = null;
        field3211 = null;
        field3198 = null;
        if (arg0 != -1) {
            field3231 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)Z")
    public final boolean method1382(byte arg0) {
        field3226++;
        if (!this.method1362((byte) -3)) {
            return false;
        }
        boolean var2 = true;
        if (arg0 != 14) {
            return false;
        }
        for (int var3 = 0; var3 < this.field3210.field3961.length; var3++) {
            int var4 = this.field3210.field3961[var3];
            if (this.field3201[var4] == null) {
                this.method1355(var4, 2);
                if (this.field3201[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(IZ)Z")
    private final boolean method1383(int arg0, boolean arg1) {
        field3227++;
        if (!arg1) {
            this.method1353(-79, 83);
        }
        if (!this.method1362((byte) -44)) {
            return false;
        } else if (arg0 >= 0 && this.field3210.field3960.length > arg0 && this.field3210.field3960[arg0] != 0) {
            return true;
        } else if (class175.field2739) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(IB)I")
    private final int method1384(int arg0, byte arg1) {
        field3220++;
        if (!this.method1383(arg0, true)) {
            return 0;
        } else if (this.field3201[arg0] == null) {
            if (arg1 != 101) {
                this.method1374(true, true, -24);
            }
            return this.field3206.method863(arg0, (byte) -119);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)I")
    public final int method1385(int arg0) {
        field3240++;
        if (!this.method1362((byte) -95)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        if (arg0 != -2492) {
            this.method1380(-124, (byte) 50);
        }
        for (int var4 = 0; var4 < this.field3201.length; var4++) {
            if (this.field3210.field3970[var4] > 0) {
                var3 += 100;
                var2 += this.method1384(var4, (byte) 101);
            }
        }
        if (var3 == 0) {
            return 100;
        } else {
            return var2 * 100 / var3;
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lhh;ZZ)V")
    public class201(class118 arg0, boolean arg1, boolean arg2) {
        this.field3203 = arg1;
        this.field3206 = arg0;
        this.field3223 = arg2;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)I")
    public final int method1386(boolean arg0) {
        field3225++;
        if (!arg0) {
            return 109;
        } else if (this.method1362((byte) -104)) {
            return this.field3210.field3958;
        } else {
            throw new IllegalStateException("");
        }
    }
}
