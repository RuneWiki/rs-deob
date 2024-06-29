import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class370 {

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public int field5423 = -1;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field5418 = 64;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "Lmn;")
    public static class249 field5431 = new class249(8);

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "Z")
    public static volatile boolean field5436 = true;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "Lbj;")
    public static class162 field5438 = new class162(25, -1);

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "F")
    public static float field5439;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    private int field5421;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field5424;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field5428;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field5433;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
    public static int field5437;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "J")
    private long field5417;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "J")
    private long field5434;

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "Lvt;")
    public static class200 field5440;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Z")
    public boolean field5419;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "[I")
    public int[] field5427;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "[I")
    private int[] field5432;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "[[I")
    private int[][] field5425;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lza;ILgs;ZIILgv;Ljv;IIII)Le;")
    public final class374 method2265(class288 arg0, int arg1, class34 arg2, boolean arg3, int arg4, int arg5, class58 arg6, class57 arg7, int arg8, int arg9, int arg10, int arg11) {
        field5429++;
        int var13 = arg9;
        if (arg7 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg9 | 0x20;
            int var21 = arg7.field1202[arg11];
            Object var22 = null;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class119 var25 = arg2.method240(var23, 31706);
            if (var25 != null) {
                var15 |= var25.method958(-122, var24);
                var14 |= var25.method963(true, var24);
                var17 |= var25.method961(-5269, var24);
                var16 |= arg7.field1212;
            }
            if ((arg7.field1211 || class424.field6376) && arg1 != -1 && arg7.field1202.length > arg1) {
                int var26 = arg7.field1202[arg1];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class119 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg2.method240(var28 >>> 16, 31706);
                }
                if (var29 != null) {
                    var15 |= var29.method958(-124, var28);
                    var14 |= var29.method963(true, var28);
                    var17 |= var29.method961(-5269, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        long var30 = (long) arg10 | (long) (arg4 << 16) | (long) arg8 << 32;
        class399 var32 = class522.field7581;
        class374 var33;
        synchronized (class522.field7581) {
            var33 = (class374) class522.field7581.method2478(1, var30);
        }
        if (var33 == null || arg0.method394(var33.method768(), var13) != 0) {
            if (var33 != null) {
                var13 = arg0.method271(var13, var33.method768());
            }
            class528[] var35 = new class528[3];
            int var36 = 0;
            if (!arg6.method523(false, arg10).method1263(110) || !arg6.method523(false, arg4).method1263(118) || !arg6.method523(false, arg8).method1263(102)) {
                return null;
            }
            class528 var37 = arg6.method523(false, arg10).method1260(true);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class528 var38 = arg6.method523(!arg3, arg4).method1260(true);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class528 var39 = arg6.method523(!arg3, arg8).method1260(arg3);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class528 var41 = new class528(var35, var36);
            var33 = arg0.method297(var41, var40, class119.field2094, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (class494.field7241[var42].length > this.field5427[var42]) {
                    var33.method755(class435.field6474[var42], class494.field7241[var42][this.field5427[var42]]);
                }
                if (class439.field6525[var42].length > this.field5427[var42]) {
                    var33.method755(class111.field2023[var42], class439.field6525[var42][this.field5427[var42]]);
                }
            }
            var33.method732(var13);
            class399 var43 = class522.field7581;
            synchronized (class522.field7581) {
                class522.field7581.method2472(-128, var33, var30);
            }
        }
        if (arg7 == null) {
            return var33;
        } else {
            class374 var44 = var33.method746((byte) 4, var13, arg3);
            return arg7.method517(arg5, 256, var44, arg1, arg11, arg9);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lgs;Lcg;Lza;ILhp;ILjv;Lwu;IILgv;B)Le;")
    public final class374 method2266(class34 arg0, class93 arg1, class288 arg2, int arg3, class217 arg4, int arg5, class57 arg6, class253 arg7, int arg8, int arg9, class58 arg10, byte arg11) {
        field5437++;
        if (this.field5423 != -1) {
            return arg1.method847(this.field5423, 0).method485(arg6, arg4, arg2, arg9, arg5, arg3, arg0, -16289, arg8);
        }
        int var13 = arg3;
        if (arg6 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg3 | 0x20;
            int var22 = arg6.field1202[arg5];
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class119 var25 = arg0.method240(var23, 31706);
            if (var25 != null) {
                var15 |= var25.method958(-125, var24);
                var14 |= var25.method963(true, var24);
                var17 |= var25.method961(-5269, var24);
                var16 |= arg6.field1212;
            }
            if ((arg6.field1211 || class424.field6376) && arg8 != -1 && arg6.field1202.length > arg8) {
                int var26 = arg6.field1202[arg8];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class119 var29 = var23 == var27 ? var25 : arg0.method240(var27, 31706);
                if (var29 != null) {
                    var15 |= var29.method958(-123, var28);
                    var14 |= var29.method963(true, var28);
                    var17 |= var29.method961(-5269, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        if (arg11 >= -58) {
            this.field5425 = null;
        }
        class399 var30 = class522.field7581;
        class374 var31;
        synchronized (class522.field7581) {
            var31 = (class374) class522.field7581.method2478(1, this.field5417);
        }
        if (var31 == null || arg2.method394(var31.method768(), var13) != 0) {
            if (var31 != null) {
                var13 = arg2.method271(var13, var31.method768());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field5432[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg10.method523(false, var35 & 0x3FFFFFFF).method1263(111)) {
                        var33 = true;
                    }
                } else if (!arg7.method1636(var35 & 0x3FFFFFFF, -105).method80(this.field5419, (byte) -114)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class528[] var36 = new class528[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field5432[var38];
                if ((var39 & 0x40000000) != 0) {
                    class528 var40 = arg7.method1636(var39 & 0x3FFFFFFF, -127).method72(-1, this.field5419);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                } else if ((Integer.MIN_VALUE & var39) != 0) {
                    class528 var41 = arg10.method523(false, var39 & 0x3FFFFFFF).method1260(true);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                }
            }
            class528 var42 = new class528(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg2.method297(var42, var43, class119.field2094, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (class494.field7241[var44].length > this.field5427[var44]) {
                    var31.method755(class435.field6474[var44], class494.field7241[var44][this.field5427[var44]]);
                }
                if (this.field5427[var44] < class439.field6525[var44].length) {
                    var31.method755(class111.field2023[var44], class439.field6525[var44][this.field5427[var44]]);
                }
            }
            var31.method732(var13);
            class399 var45 = class522.field7581;
            synchronized (class522.field7581) {
                class522.field7581.method2472(-109, var31, this.field5417);
            }
        }
        if (arg6 == null) {
            return var31;
        } else {
            var31.method746((byte) 4, var13, true);
            return arg6.method517(arg9, 256, var31, arg8, arg5, arg3);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZB)V")
    public final void method2267(boolean arg0, byte arg1) {
        this.field5419 = arg0;
        field5424++;
        if (arg1 < 53) {
            field5440 = null;
        }
        this.method2274((byte) 117);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V")
    public final void method2268(int arg0, int arg1, int arg2) {
        this.field5427[arg1] = arg0;
        if (arg2 == 16384) {
            field5433++;
            this.method2274((byte) 117);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method2269(String arg0, byte arg1) {
        field5426++;
        if (arg0 == null) {
            return;
        }
        if (!(class513.field7453 < 100 || class464.field6887) || class513.field7453 >= 200) {
            class475.method2843((byte) -98, class264.field4029.method1977(class146.field2452, 96));
            return;
        }
        String var2 = class502.method3025(-13, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class513.field7453; var3++) {
            String var7 = class502.method3025(arg1 ^ 0xFFFFFF83, class330.field5008[var3]);
            if (var7 != null && var7.equals(var2)) {
                class475.method2843((byte) -98, arg0 + class292.field4472.method1977(class146.field2452, -61));
                return;
            }
            if (class59.field1232[var3] != null) {
                String var8 = class502.method3025(-13, class59.field1232[var3]);
                if (var8 != null && var8.equals(var2)) {
                    class475.method2843((byte) -98, arg0 + class292.field4472.method1977(class146.field2452, 78));
                    return;
                }
            }
        }
        if (arg1 != 112) {
            field5439 = 0.16593044F;
        }
        for (int var4 = 0; var4 < class172.field2777; var4++) {
            String var5 = class502.method3025(arg1 ^ 0xFFFFFF83, class395.field6015[var4]);
            if (var5 != null && var5.equals(var2)) {
                class475.method2843((byte) -98, class159.field2575.method1977(class146.field2452, 68) + arg0 + class17.field281.method1977(class146.field2452, arg1 - 167));
                return;
            }
            if (class143.field2380[var4] != null) {
                String var6 = class502.method3025(-13, class143.field2380[var4]);
                if (var6 != null && var6.equals(var2)) {
                    class475.method2843((byte) -98, class159.field2575.method1977(class146.field2452, -122) + arg0 + class17.field281.method1977(class146.field2452, 61));
                    return;
                }
            }
        }
        if (class502.method3025(arg1 ^ 0xFFFFFF83, class15.field266.field5381).equals(var2)) {
            class475.method2843((byte) -98, class280.field4229.method1977(class146.field2452, arg1 - 51));
        } else {
            class236.field3642++;
            class459.method2765(class389.field5848, (byte) 87);
            class335.field5062.method1814(class362.method2220(arg0, (byte) -80), true);
            class335.field5062.method1821(arg0, arg1 - 45);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lgv;III)V")
    public final void method2270(class58 arg0, int arg1, int arg2, int arg3) {
        field5422++;
        int var5 = class443.field6573[arg3];
        if (this.field5432[var5] != 0 && arg0.method523(false, arg1) != null) {
            this.field5432[var5] = class418.method2558(arg2, arg1);
            this.method2274((byte) 117);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II[I[IZI)V")
    public final void method2271(int arg0, int arg1, int[] arg2, int[] arg3, boolean arg4, int arg5) {
        this.field5427 = arg3;
        if (arg1 != 2) {
            this.field5417 = -97L;
        }
        this.field5423 = arg0;
        this.field5432 = arg2;
        this.field5419 = arg4;
        field5420++;
        if (this.field5421 != arg5) {
            this.field5421 = arg5;
            this.field5425 = null;
        }
        this.method2274((byte) 117);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIB)I")
    public static final int method2272(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field5428++;
        if (arg6 != 118) {
            method2273(true);
        }
        if ((arg1 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg2;
            arg2 = var7;
        }
        int var8 = arg4 & 0x3;
        if (var8 == 0) {
            return arg3;
        } else if (var8 == 1) {
            return 1 + 7 - arg5 - arg0;
        } else if (var8 == 2) {
            return 1 + 7 - arg2 - arg3;
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
    public static void method2273(boolean arg0) {
        field5440 = null;
        field5431 = null;
        field5438 = null;
        if (arg0) {
            method2273(true);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    private final void method2274(byte arg0) {
        field5435++;
        this.field5417 = -1L;
        long[] var2 = class186.field2992;
        this.field5417 = this.field5417 >>> 8 ^ var2[(int) (((long) (this.field5421 >> 8) ^ this.field5417) & 0xFFL)];
        this.field5417 = var2[(int) ((this.field5417 ^ (long) this.field5421) & 0xFFL)] ^ this.field5417 >>> 8;
        if (arg0 != 117) {
            this.method2267(true, (byte) -78);
        }
        for (int var3 = 0; var3 < 12; var3++) {
            this.field5417 = this.field5417 >>> 8 ^ var2[(int) (((long) (this.field5432[var3] >> 24) ^ this.field5417) & 0xFFL)];
            this.field5417 = this.field5417 >>> 8 ^ var2[(int) (((long) (this.field5432[var3] >> 16) ^ this.field5417) & 0xFFL)];
            this.field5417 = this.field5417 >>> 8 ^ var2[(int) ((this.field5417 ^ (long) (this.field5432[var3] >> 8)) & 0xFFL)];
            this.field5417 = var2[(int) ((this.field5417 ^ (long) this.field5432[var3]) & 0xFFL)] ^ this.field5417 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field5417 = var2[(int) ((this.field5417 ^ (long) this.field5427[var4]) & 0xFFL)] ^ this.field5417 >>> 8;
        }
        this.field5417 = this.field5417 >>> 8 ^ var2[(int) (((long) (this.field5419 ? 1 : 0) ^ this.field5417) & 0xFFL)];
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljv;Ljv;Lgs;ILwu;BLsi;ILgv;IILza;ILcg;ZLhp;[Lgj;II)Le;")
    public final class374 method2275(class57 arg0, class57 arg1, class34 arg2, int arg3, class253 arg4, byte arg5, class395 arg6, int arg7, class58 arg8, int arg9, int arg10, class288 arg11, int arg12, class93 arg13, boolean arg14, class217 arg15, class452[] arg16, int arg17, int arg18) {
        field5430++;
        if (this.field5423 != -1) {
            return arg13.method847(this.field5423, 0).method473(arg18, arg9, arg1, arg15, arg12, arg0, arg6, arg2, arg3, arg11, arg16, arg10, -119, arg7, arg17);
        }
        int var20 = arg18;
        long var21 = this.field5417;
        int[] var23 = this.field5432;
        if (arg1 != null && (arg1.field1217 >= 0 || arg1.field1194 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field5432[var24];
            }
            if (arg1.field1217 >= 0) {
                if (arg1.field1217 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class418.method2558(arg1.field1217, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg1.field1194 >= 0) {
                if (arg1.field1194 == 65535) {
                    var21 ^= 0xFFFFFFFFL;
                    var23[3] = 0;
                } else {
                    var23[3] = class418.method2558(arg1.field1194, 1073741824);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        if (arg5 != 106) {
            return null;
        }
        boolean var28 = arg1 != null || arg0 != null;
        int var29 = arg16 == null ? 0 : arg16.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class387.field5666[var30] = null;
            if (arg16[var30] != null) {
                class57 var31 = arg2.method236(arg16[var30].field6710, (byte) -81);
                if (var31.field1202 != null) {
                    var28 = true;
                    class54.field1172[var30] = var31;
                    int var32 = arg16[var30].field6713;
                    int var33 = arg16[var30].field6706;
                    int var34 = var31.field1202[var32];
                    class387.field5666[var30] = arg2.method240(var34 >>> 16, arg5 + 31600);
                    int var35 = var34 & 0xFFFF;
                    class209.field3338[var30] = var35;
                    if (class387.field5666[var30] != null) {
                        var26 |= class387.field5666[var30].method958(14, var35);
                        var25 |= class387.field5666[var30].method963(true, var35);
                        var27 |= class387.field5666[var30].method961(-5269, var35);
                    }
                    if ((var31.field1211 || class424.field6376) && var33 != -1 && var33 < var31.field1202.length) {
                        class453.field6729[var30] = var31.field1210[var32];
                        class144.field2432[var30] = arg16[var30].field6714;
                        int var36 = var31.field1202[var33];
                        class255.field3915[var30] = arg2.method240(var36 >>> 16, 31706);
                        int var37 = var36 & 0xFFFF;
                        class257.field3937[var30] = var37;
                        if (class255.field3915[var30] != null) {
                            var26 |= class255.field3915[var30].method958(arg5 ^ 0xFFFFFFEE, var37);
                            var25 |= class255.field3915[var30].method963(true, var37);
                            var27 |= class255.field3915[var30].method961(arg5 ^ 0xFFFFEB01, var37);
                        }
                    } else {
                        class453.field6729[var30] = 0;
                        class144.field2432[var30] = 0;
                        class255.field3915[var30] = null;
                        class257.field3937[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class119 var41 = null;
        class119 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class119 var46 = null;
        class119 var47 = null;
        if (var28) {
            if (arg1 != null) {
                int var48 = arg1.field1202[arg9];
                int var49 = var48 >>> 16;
                var41 = arg2.method240(var49, 31706);
                var38 = var48 & 0xFFFF;
                if (var41 != null) {
                    var26 |= var41.method958(arg5 + 7, var38);
                    var25 |= var41.method963(true, var38);
                    var27 |= var41.method961(arg5 - 5375, var38);
                }
                if ((arg1.field1211 || class424.field6376) && arg10 != -1 && arg1.field1202.length > arg10) {
                    int var50 = arg1.field1202[arg10];
                    var40 = arg1.field1210[arg9];
                    int var51 = var50 >>> 16;
                    var42 = var49 == var51 ? var41 : arg2.method240(var51, 31706);
                    var39 = var50 & 0xFFFF;
                    if (var42 != null) {
                        var26 |= var42.method958(-123, var39);
                        var25 |= var42.method963(true, var39);
                        var27 |= var42.method961(arg5 - 5375, var39);
                    }
                }
            }
            var20 = arg18 | 0x20;
            if (arg0 != null) {
                int var52 = arg0.field1202[arg17];
                int var53 = var52 >>> 16;
                var43 = var52 & 0xFFFF;
                var46 = arg2.method240(var53, arg5 + 31600);
                if (var46 != null) {
                    var26 |= var46.method958(104, var43);
                    var25 |= var46.method963(true, var43);
                    var27 |= var46.method961(arg5 - 5375, var43);
                }
                if ((arg0.field1211 || class424.field6376) && arg7 != -1 && arg0.field1202.length > arg7) {
                    int var54 = arg0.field1202[arg7];
                    var45 = arg0.field1210[arg17];
                    int var55 = var54 >>> 16;
                    var47 = var53 == var55 ? var46 : arg2.method240(var55, 31706);
                    var44 = var54 & 0xFFFF;
                    if (var47 != null) {
                        var26 |= var47.method958(-123, var44);
                        var25 |= var47.method963(true, var44);
                        var27 |= var47.method961(-5269, var44);
                    }
                }
            }
            if (var26) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
            if (var27) {
                var20 |= 0x400;
            }
        }
        class399 var56 = class182.field2940;
        class374 var57;
        synchronized (class182.field2940) {
            var57 = (class374) class182.field2940.method2478(arg5 ^ 0x6B, var21);
        }
        class166 var58 = null;
        if (this.field5421 != -1) {
            var58 = arg6.method2457(this.field5421, -49);
        }
        if (var57 == null || arg11.method394(var57.method768(), var20) != 0 || var58 != null && var58.field2642 != null && this.field5425 == null) {
            if (var57 != null) {
                var20 = arg11.method271(var20, var57.method768());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var62) != 0 && !arg8.method523(false, var62 & 0x3FFFFFFF).method1266(arg5 ^ 0x6A)) {
                        var60 = true;
                    }
                } else if (!arg4.method1636(var62 & 0x3FFFFFFF, -109).method67(this.field5419, -23553)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field5434 != -1L) {
                    class399 var63 = class182.field2940;
                    synchronized (class182.field2940) {
                        var57 = (class374) class182.field2940.method2478(1, this.field5434);
                    }
                }
                if (var57 == null || arg11.method394(var57.method768(), var20) != 0 || var58 != null && var58.field2642 != null && this.field5425 == null) {
                    return null;
                }
            } else {
                class528[] var64 = new class528[12];
                for (int var65 = 0; var65 < 12; var65++) {
                    int var66 = var23[var65];
                    if ((var66 & 0x40000000) != 0) {
                        class528 var68 = arg4.method1636(var66 & 0x3FFFFFFF, arg5 - 220).method84((byte) -107, this.field5419);
                        if (var68 != null) {
                            var64[var65] = var68;
                        }
                    } else if ((var66 & Integer.MIN_VALUE) != 0) {
                        class528 var67 = arg8.method523(false, var66 & 0x3FFFFFFF).method1262(arg5 + 14383);
                        if (var67 != null) {
                            var64[var65] = var67;
                        }
                    }
                }
                if (var58 != null && var58.field2642 != null) {
                    for (int var69 = 0; var69 < var58.field2642.length; var69++) {
                        if (var58.field2642[var69] != null && var64[var69] != null) {
                            int var70 = var58.field2642[var69][0];
                            int var71 = var58.field2642[var69][1];
                            int var72 = var58.field2642[var69][2];
                            int var73 = var58.field2642[var69][3] << 3;
                            int var74 = var58.field2642[var69][4] << 3;
                            int var75 = var58.field2642[var69][5] << 3;
                            if (this.field5425 == null) {
                                this.field5425 = new int[var58.field2642.length][];
                            }
                            if (this.field5425[var69] == null) {
                                int[] var76 = this.field5425[var69] = new int[15];
                                if (var73 == 0 && var74 == 0 && var75 == 0) {
                                    var76[12] = -var70;
                                    var76[13] = -var71;
                                    var76[0] = var76[4] = var76[8] = 32768;
                                    var76[14] = -var72;
                                } else {
                                    int var77 = class407.field6168[var73];
                                    int var78 = class407.field6169[var73];
                                    int var79 = class407.field6168[var74];
                                    int var80 = class407.field6169[var74];
                                    int var81 = class407.field6168[var75];
                                    int var82 = class407.field6169[var75];
                                    int var83 = var78 * var81 + 16384 >> 15;
                                    int var84 = var78 * var82 + 16384 >> 15;
                                    var76[6] = var79 * var84 + (-var80 * var81 + 16384) >> 15;
                                    var76[3] = var77 * var82 + 16384 >> 15;
                                    var76[7] = -var80 * -var82 + var79 * var83 + 16384 >> 15;
                                    var76[1] = -var82 * var79 + var80 * var83 + 16384 >> 15;
                                    var76[0] = var80 * var84 + var79 * var81 + 16384 >> 15;
                                    var76[4] = var77 * var81 + 16384 >> 15;
                                    var76[8] = var77 * var79 + 16384 >> 15;
                                    var76[5] = -var78;
                                    var76[2] = var77 * var80 + 16384 >> 15;
                                    var76[13] = var76[1] * -var70 + (var76[4] * -var71) + (var76[7] * -var72) + 16384 >> 15;
                                    var76[14] = var76[8] * -var72 + var76[2] * -var70 - (-(var76[5] * -var71) - 16384) >> 15;
                                    var76[12] = var76[6] * -var72 + var76[0] * -var70 + var76[3] * -var71 + 16384 >> 15;
                                }
                                var76[10] = var71;
                                var76[11] = var72;
                                var76[9] = var70;
                            }
                            if (var73 != 0 || var74 != 0 || var75 != 0) {
                                var64[var69].method3125(var74, var75, var73, (byte) -61);
                            }
                            if (var70 != 0 || var71 != 0 || var72 != 0) {
                                var64[var69].method3132(var72, var71, 126, var70);
                            }
                        }
                    }
                }
                class528 var85 = new class528(var64, var64.length);
                int var86 = var20 | 0x4000;
                var57 = arg11.method297(var85, var86, class119.field2094, 64, 850);
                for (int var87 = 0; var87 < 5; var87++) {
                    if (class494.field7241[var87].length > this.field5427[var87]) {
                        var57.method755(class435.field6474[var87], class494.field7241[var87][this.field5427[var87]]);
                    }
                    if (this.field5427[var87] < class439.field6525[var87].length) {
                        var57.method755(class111.field2023[var87], class439.field6525[var87][this.field5427[var87]]);
                    }
                }
                if (arg14) {
                    var57.method732(var20);
                    class399 var88 = class182.field2940;
                    synchronized (class182.field2940) {
                        class182.field2940.method2472(124, var57, var21);
                    }
                    this.field5434 = var21;
                }
            }
        }
        class374 var89 = var57.method746((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var90 < var29) {
            if (class387.field5666[var90] != null) {
                var89.method2302(class387.field5666[var90], 0, this.field5425 == null ? null : this.field5425[var90], class257.field3937[var90], class144.field2432[var90] - 1, false, var91, class255.field3915[var90], class209.field3338[var90], false, class453.field6729[var90]);
            }
            var90++;
            var91 <<= 0x1;
        }
        if (var41 != null && var46 != null) {
            var89.method2300(arg3 - 1, arg1.field1197, var41, var39, (byte) -71, var42, var40, arg12 - 1, var44, var38, false, var43, var47, var46, var45);
        } else if (var41 != null) {
            var89.method2296(false, 0, var40, arg3 - 1, var41, var39, var42, 16383, var38);
        } else if (var46 != null) {
            var89.method2296(false, 0, var45, arg12 - 1, var46, var44, var47, arg5 ^ 0x3F95, var43);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class387.field5666[var92] = null;
            class255.field3915[var92] = null;
            class54.field1172[var92] = null;
        }
        return var89;
    }
}
