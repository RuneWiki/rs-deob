import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class36 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public int field476 = -1;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Ldp;")
    public static class347 field481 = new class347("Loaded world map", "Weltkarte geladen", "Mappemonde chargée", "Mapa-múndi carregado");

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "Ldp;")
    public static class347 field493 = new class347("K", "T", "K", "K");

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public static int field496 = 0;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "Lgn;")
    public static class526 field498 = new class526(1, 15);

    @OriginalMember(owner = "client!fb", name = "z", descriptor = "[B")
    public static byte[] field501 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "[I")
    public static int[] field500 = new int[256];

    @OriginalMember(owner = "client!fb", name = "B", descriptor = "Z")
    public static boolean field503 = false;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "J")
    private long field488;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "J")
    private long field490;

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "Lok;")
    public static class74 field499;

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "Led;")
    public static class90 field497;

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Z")
    public boolean field491;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "[I")
    public int[] field477;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "[I")
    private int[] field478;

    @OriginalMember(owner = "client!fb", name = "A", descriptor = "[Z")
    public static boolean[] field502;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "[[I")
    private int[][] field487;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method300(String arg0, byte arg1) {
        field485++;
        if (arg1 != 0) {
            method300(null, (byte) 53);
        }
        return class316.method1979(arg1 + 9472, 10, arg0, true);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILya;IIILm;Lqm;Lgu;Lmq;Llc;Lac;)Lt;")
    public final class398 method301(int arg0, int arg1, class11 arg2, int arg3, int arg4, int arg5, class80 arg6, class281 arg7, class101 arg8, class59 arg9, class520 arg10, class223 arg11) {
        int var13 = 124 / ((arg0 + 18) / 53);
        field483++;
        if (this.field476 != -1) {
            return arg8.method774(this.field476, -66).method1728(arg10, arg5, -84, arg11, arg3, arg6, arg4, arg1, arg2);
        }
        int var14 = arg5;
        if (arg10 != null) {
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = false;
            boolean var19 = true;
            boolean var20 = true;
            Object var21 = null;
            Object var22 = null;
            int var23 = arg10.field7630[arg4];
            var14 = arg5 | 0x20;
            int var24 = var23 >>> 16;
            class41 var25 = arg6.method571(var24, 100);
            int var26 = var23 & 0xFFFF;
            if (var25 != null) {
                var16 |= var25.method324(var26, -1500);
                var15 |= var25.method327((byte) 67, var26);
                var18 |= var25.method326(0, var26);
                var17 |= arg10.field7634;
            }
            if ((arg10.field7647 || class522.field7688) && arg1 != -1 && arg1 < arg10.field7630.length) {
                int var27 = arg10.field7630[arg1];
                int var28 = var27 >>> 16;
                class41 var29 = var24 == var28 ? var25 : arg6.method571(var28, 100);
                int var30 = var27 & 0xFFFF;
                if (var29 != null) {
                    var16 |= var29.method324(var30, -1500);
                    var15 |= var29.method327((byte) 59, var30);
                    var18 |= var29.method326(0, var30);
                }
            }
            if (var16) {
                var14 |= 0x80;
            }
            if (var15) {
                var14 |= 0x100;
            }
            if (var17) {
                var14 |= 0x200;
            }
            if (var18) {
                var14 |= 0x400;
            }
        }
        class382 var31 = class146.field2199;
        class398 var32;
        synchronized (class146.field2199) {
            var32 = (class398) class146.field2199.method2288(this.field490, 0);
        }
        if (var32 == null || arg2.method160(var32.method626(), var14) != 0) {
            if (var32 != null) {
                var14 = arg2.method120(var14, var32.method626());
            }
            boolean var34 = false;
            for (int var35 = 0; var35 < 12; var35++) {
                int var36 = this.field478[var35];
                if ((var36 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var36) != 0 && !arg9.method419(3, var36 & 0x3FFFFFFF).method2504(122)) {
                        var34 = true;
                    }
                } else if (!arg7.method1749(var36 & 0x3FFFFFFF, -20230).method588(this.field491, 14788)) {
                    var34 = true;
                }
            }
            if (var34) {
                return null;
            }
            class118[] var37 = new class118[12];
            int var38 = 0;
            for (int var39 = 0; var39 < 12; var39++) {
                int var40 = this.field478[var39];
                if ((var40 & 0x40000000) != 0) {
                    class118 var41 = arg7.method1749(var40 & 0x3FFFFFFF, -20230).method576(this.field491, false);
                    if (var41 != null) {
                        var37[var38++] = var41;
                    }
                } else if ((Integer.MIN_VALUE & var40) != 0) {
                    class118 var42 = arg9.method419(3, var40 & 0x3FFFFFFF).method2501(67);
                    if (var42 != null) {
                        var37[var38++] = var42;
                    }
                }
            }
            int var43 = var14 | 0x4000;
            class118 var44 = new class118(var37, var38);
            var32 = arg2.method150(var44, var43, class182.field2703, 64, 768);
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field477[var45] < class406.field6118[var45].length) {
                    var32.method654(class328.field5124[var45], class406.field6118[var45][this.field477[var45]]);
                }
                if (class266.field3970[var45].length > this.field477[var45]) {
                    var32.method654(class157.field2373[var45], class266.field3970[var45][this.field477[var45]]);
                }
            }
            var32.method602(var14);
            class382 var46 = class146.field2199;
            synchronized (class146.field2199) {
                class146.field2199.method2290(this.field490, var32, 102);
            }
        }
        if (arg10 == null) {
            return var32;
        } else {
            var32.method610((byte) 4, var14, true);
            return arg10.method3073(arg4, arg1, arg3, 93, arg5, var32);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZ)V")
    public final void method302(int arg0, boolean arg1) {
        this.field491 = arg1;
        field479++;
        this.method306((byte) 74);
        if (arg0 != 32201) {
            this.method301(-102, -25, null, -110, -93, -101, null, null, null, null, null, null);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lm;Llc;IIILya;IIIILmq;I)Lt;")
    public final class398 method303(class80 arg0, class520 arg1, int arg2, int arg3, int arg4, class11 arg5, int arg6, int arg7, int arg8, int arg9, class59 arg10, int arg11) {
        field484++;
        int var13 = arg7;
        if (arg1 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg7 | 0x20;
            int var21 = arg1.field7630[arg4];
            Object var22 = null;
            int var23 = var21 >>> 16;
            class41 var24 = arg0.method571(var23, 100);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method324(var25, -1500);
                var14 |= var24.method327((byte) -79, var25);
                var17 |= var24.method326(0, var25);
                var16 |= arg1.field7634;
            }
            if ((arg1.field7647 || class522.field7688) && arg2 != -1 && arg1.field7630.length > arg2) {
                int var26 = arg1.field7630[arg2];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class41 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg0.method571(var28 >>> 16, arg8 ^ 0x2C72);
                }
                if (var29 != null) {
                    var15 |= var29.method324(var28, arg8 - 12786);
                    var14 |= var29.method327((byte) -94, var28);
                    var17 |= var29.method326(0, var28);
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
        if (arg8 != 11286) {
            return null;
        }
        long var30 = (long) (arg9 << 16) | (long) arg6 << 32 | (long) arg3;
        class382 var32 = class146.field2199;
        class398 var33;
        synchronized (class146.field2199) {
            var33 = (class398) class146.field2199.method2288(var30, 0);
        }
        if (var33 == null || arg5.method160(var33.method626(), var13) != 0) {
            if (var33 != null) {
                var13 = arg5.method120(var13, var33.method626());
            }
            class118[] var35 = new class118[3];
            int var36 = 0;
            if (!arg10.method419(arg8 - 11283, arg3).method2504(-117) || !arg10.method419(arg8 - 11283, arg9).method2504(arg8 - 11271) || !arg10.method419(3, arg6).method2504(123)) {
                return null;
            }
            class118 var37 = arg10.method419(3, arg3).method2501(arg8 - 11330);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class118 var38 = arg10.method419(3, arg9).method2501(arg8 ^ 0x2C52);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class118 var39 = arg10.method419(arg8 ^ 0x2C15, arg6).method2501(117);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class118 var41 = new class118(var35, var36);
            var33 = arg5.method150(var41, var40, class182.field2703, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (this.field477[var42] < class406.field6118[var42].length) {
                    var33.method654(class328.field5124[var42], class406.field6118[var42][this.field477[var42]]);
                }
                if (class266.field3970[var42].length > this.field477[var42]) {
                    var33.method654(class157.field2373[var42], class266.field3970[var42][this.field477[var42]]);
                }
            }
            var33.method602(var13);
            class382 var43 = class146.field2199;
            synchronized (class146.field2199) {
                class146.field2199.method2290(var30, var33, 101);
            }
        }
        if (arg1 == null) {
            return var33;
        } else {
            class398 var44 = var33.method610((byte) 4, var13, true);
            return arg1.method3073(arg4, arg2, arg11, arg8 - 11178, arg7, var44);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static void method304(byte arg0) {
        if (arg0 != 16) {
            return;
        }
        field500 = null;
        field493 = null;
        field497 = null;
        field498 = null;
        field481 = null;
        field502 = null;
        field499 = null;
        field501 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([IBZII[I)V")
    public final void method305(int[] arg0, byte arg1, boolean arg2, int arg3, int arg4, int[] arg5) {
        this.field476 = arg3;
        this.field491 = arg2;
        if (this.field492 != arg4) {
            this.field487 = null;
            this.field492 = arg4;
        }
        field489++;
        this.field477 = arg0;
        this.field478 = arg5;
        if (arg1 >= -48) {
            this.method307(null, -43, (byte) 115, -20);
        }
        this.method306((byte) 74);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
    private final void method306(byte arg0) {
        field494++;
        long[] var2 = class256.field3476;
        this.field490 = -1L;
        this.field490 = this.field490 >>> 8 ^ var2[(int) (((long) (this.field492 >> 8) ^ this.field490) & 0xFFL)];
        this.field490 = this.field490 >>> 8 ^ var2[(int) ((this.field490 ^ (long) this.field492) & 0xFFL)];
        if (arg0 != 74) {
            return;
        }
        for (int var3 = 0; var3 < 12; var3++) {
            this.field490 = var2[(int) ((this.field490 ^ (long) (this.field478[var3] >> 24)) & 0xFFL)] ^ this.field490 >>> 8;
            this.field490 = var2[(int) ((this.field490 ^ (long) (this.field478[var3] >> 16)) & 0xFFL)] ^ this.field490 >>> 8;
            this.field490 = var2[(int) ((this.field490 ^ (long) (this.field478[var3] >> 8)) & 0xFFL)] ^ this.field490 >>> 8;
            this.field490 = this.field490 >>> 8 ^ var2[(int) ((this.field490 ^ (long) this.field478[var3]) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field490 = this.field490 >>> 8 ^ var2[(int) ((this.field490 ^ (long) this.field477[var4]) & 0xFFL)];
        }
        this.field490 = this.field490 >>> 8 ^ var2[(int) ((this.field490 ^ (long) (this.field491 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lmq;IBI)V")
    public final void method307(class59 arg0, int arg1, byte arg2, int arg3) {
        field486++;
        int var5 = class502.field7407[arg1];
        if (arg2 == 10 && this.field478[var5] != 0 && arg0.method419(arg2 ^ 0x9, arg3) != null) {
            this.field478[var5] = class390.method2340(Integer.MIN_VALUE, arg3);
            this.method306((byte) 74);
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(B)V")
    public static final void method308(byte arg0) {
        class27.field395.method90(((float) class454.field6661.field1006 * 0.1F + 0.7F) * class351.field5403);
        field480++;
        class27.field395.method122(class480.field7086, class317.field4900, class265.field3958, (float) (class152.field2316 << 0), (float) (class440.field6460 << 0), (float) (class78.field1084 << 0));
        class27.field395.method148(class378.field5692);
        if (arg0 <= 111) {
            method304((byte) -82);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIBILgu;Lqm;Lya;Lmf;Lm;Llc;Llc;[Len;IILac;ILmq;Z)Lt;")
    public final class398 method309(int arg0, int arg1, int arg2, byte arg3, int arg4, class101 arg5, class281 arg6, class11 arg7, class51 arg8, class80 arg9, class520 arg10, class520 arg11, class357[] arg12, int arg13, int arg14, class223 arg15, int arg16, class59 arg17, boolean arg18) {
        field495++;
        if (this.field476 != -1) {
            return arg5.method774(this.field476, 105).method1731(arg8, arg13, arg2, arg0, arg4, arg1, arg14, -1, arg9, arg7, arg12, arg15, arg10, arg11, arg16);
        }
        int var20 = arg4;
        long var21 = this.field490;
        int[] var23 = this.field478;
        if (arg10 != null && (arg10.field7635 >= 0 || arg10.field7629 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field478[var24];
            }
            if (arg10.field7635 >= 0) {
                if (arg10.field7635 == 65535) {
                    var23[5] = 0;
                    var21 ^= 0xFFFFFFFF00000000L;
                } else {
                    var23[5] = class390.method2340(1073741824, arg10.field7635);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg10.field7629 >= 0) {
                if (arg10.field7629 == 65535) {
                    var21 ^= 0xFFFFFFFFL;
                    var23[3] = 0;
                } else {
                    var23[3] = class390.method2340(arg10.field7629, 1073741824);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg10 != null || arg11 != null;
        int var29 = arg12 == null ? 0 : arg12.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class4.field39[var30] = null;
            if (arg12[var30] != null) {
                class520 var31 = arg9.method575(arg12[var30].field5474, -74);
                if (var31.field7630 != null) {
                    class494.field7346[var30] = var31;
                    var28 = true;
                    int var32 = arg12[var30].field5467;
                    int var33 = arg12[var30].field5470;
                    int var34 = var31.field7630[var32];
                    class4.field39[var30] = arg9.method571(var34 >>> 16, 100);
                    int var35 = var34 & 0xFFFF;
                    class355.field5445[var30] = var35;
                    if (class4.field39[var30] != null) {
                        var26 |= class4.field39[var30].method324(var35, -1500);
                        var25 |= class4.field39[var30].method327((byte) -71, var35);
                        var27 |= class4.field39[var30].method326(0, var35);
                    }
                    if ((var31.field7647 || class522.field7688) && var33 != -1 && var33 < var31.field7630.length) {
                        class404.field6096[var30] = var31.field7645[var32];
                        class8.field70[var30] = arg12[var30].field5468;
                        int var36 = var31.field7630[var33];
                        class213.field3046[var30] = arg9.method571(var36 >>> 16, 100);
                        int var37 = var36 & 0xFFFF;
                        class242.field3374[var30] = var37;
                        if (class213.field3046[var30] != null) {
                            var26 |= class213.field3046[var30].method324(var37, -1500);
                            var25 |= class213.field3046[var30].method327((byte) -124, var37);
                            var27 |= class213.field3046[var30].method326(0, var37);
                        }
                    } else {
                        class404.field6096[var30] = 0;
                        class8.field70[var30] = 0;
                        class213.field3046[var30] = null;
                        class242.field3374[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class41 var41 = null;
        class41 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class41 var46 = null;
        int var47 = -109 % ((17 - arg3) / 58);
        class41 var48 = null;
        if (var28) {
            var20 = arg4 | 0x20;
            if (arg10 != null) {
                int var49 = arg10.field7630[arg14];
                int var50 = var49 >>> 16;
                var41 = arg9.method571(var50, 100);
                var38 = var49 & 0xFFFF;
                if (var41 != null) {
                    var26 |= var41.method324(var38, -1500);
                    var25 |= var41.method327((byte) 106, var38);
                    var27 |= var41.method326(0, var38);
                }
                if ((arg10.field7647 || class522.field7688) && arg2 != -1 && arg10.field7630.length > arg2) {
                    var40 = arg10.field7645[arg14];
                    int var51 = arg10.field7630[arg2];
                    int var52 = var51 >>> 16;
                    var42 = var50 == var52 ? var41 : arg9.method571(var52, 100);
                    var39 = var51 & 0xFFFF;
                    if (var42 != null) {
                        var26 |= var42.method324(var39, -1500);
                        var25 |= var42.method327((byte) 84, var39);
                        var27 |= var42.method326(0, var39);
                    }
                }
            }
            if (arg11 != null) {
                int var53 = arg11.field7630[arg1];
                int var54 = var53 >>> 16;
                var46 = arg9.method571(var54, 100);
                var43 = var53 & 0xFFFF;
                if (var46 != null) {
                    var26 |= var46.method324(var43, -1500);
                    var25 |= var46.method327((byte) 98, var43);
                    var27 |= var46.method326(0, var43);
                }
                if ((arg11.field7647 || class522.field7688) && arg13 != -1 && arg13 < arg11.field7630.length) {
                    var45 = arg11.field7645[arg1];
                    int var55 = arg11.field7630[arg13];
                    int var56 = var55 >>> 16;
                    var48 = var54 == var56 ? var46 : arg9.method571(var56, 100);
                    var44 = var55 & 0xFFFF;
                    if (var48 != null) {
                        var26 |= var48.method324(var44, -1500);
                        var25 |= var48.method327((byte) 104, var44);
                        var27 |= var48.method326(0, var44);
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
        class382 var57 = class169.field2484;
        class398 var58;
        synchronized (class169.field2484) {
            var58 = (class398) class169.field2484.method2288(var21, 0);
        }
        class192 var59 = null;
        if (this.field492 != -1) {
            var59 = arg8.method383(this.field492, 32);
        }
        if (var58 == null || arg7.method160(var58.method626(), var20) != 0 || var59 != null && var59.field2807 != null && this.field487 == null) {
            if (var58 != null) {
                var20 = arg7.method120(var20, var58.method626());
            }
            boolean var61 = false;
            int var62 = 0;
            while (true) {
                if (var62 >= 12) {
                    if (var61) {
                        if (this.field488 != -1L) {
                            class382 var89 = class169.field2484;
                            synchronized (class169.field2484) {
                                var58 = (class398) class169.field2484.method2288(this.field488, 0);
                            }
                        }
                        if (var58 == null || arg7.method160(var58.method626(), var20) != 0 || var59 != null && var59.field2807 != null && this.field487 == null) {
                            return null;
                        }
                    } else {
                        class118[] var64 = new class118[12];
                        for (int var65 = 0; var65 < 12; var65++) {
                            int var66 = var23[var65];
                            if ((var66 & 0x40000000) != 0) {
                                class118 var68 = arg6.method1749(var66 & 0x3FFFFFFF, -20230).method590(0, this.field491);
                                if (var68 != null) {
                                    var64[var65] = var68;
                                }
                            } else if ((var66 & Integer.MIN_VALUE) != 0) {
                                class118 var67 = arg17.method419(3, var66 & 0x3FFFFFFF).method2500(-19967);
                                if (var67 != null) {
                                    var64[var65] = var67;
                                }
                            }
                        }
                        if (var59 != null && var59.field2807 != null) {
                            for (int var69 = 0; var69 < var59.field2807.length; var69++) {
                                if (var59.field2807[var69] != null && var64[var69] != null) {
                                    int var70 = var59.field2807[var69][0];
                                    int var71 = var59.field2807[var69][1];
                                    int var72 = var59.field2807[var69][2];
                                    int var73 = var59.field2807[var69][3] << 3;
                                    int var74 = var59.field2807[var69][4] << 3;
                                    int var75 = var59.field2807[var69][5] << 3;
                                    if (this.field487 == null) {
                                        this.field487 = new int[var59.field2807.length][];
                                    }
                                    if (this.field487[var69] == null) {
                                        int[] var76 = this.field487[var69] = new int[15];
                                        if (var73 == 0 && var74 == 0 && var75 == 0) {
                                            var76[0] = var76[4] = var76[8] = 32768;
                                            var76[14] = -var72;
                                            var76[13] = -var71;
                                            var76[12] = -var70;
                                        } else {
                                            int var77 = class445.field6544[var73];
                                            int var78 = class445.field6545[var73];
                                            int var79 = class445.field6544[var74];
                                            int var80 = class445.field6545[var74];
                                            int var81 = class445.field6544[var75];
                                            int var82 = class445.field6545[var75];
                                            int var83 = var78 * var81 + 16384 >> 15;
                                            int var84 = var78 * var82 + 16384 >> 15;
                                            var76[5] = -var78;
                                            var76[8] = var77 * var79 + 16384 >> 15;
                                            var76[2] = var77 * var80 + 16384 >> 15;
                                            var76[7] = var79 * var83 + -var80 * -var82 + 16384 >> 15;
                                            var76[6] = var79 * var84 + -var80 * var81 + 16384 >> 15;
                                            var76[0] = var79 * var81 + (var80 * var84) + 16384 >> 15;
                                            var76[1] = -var82 * var79 + (var80 * var83) + 16384 >> 15;
                                            var76[3] = var77 * var82 + 16384 >> 15;
                                            var76[4] = var77 * var81 + 16384 >> 15;
                                            var76[12] = var76[6] * -var72 + (var76[0] * -var70 + (var76[3] * -var71)) + 16384 >> 15;
                                            var76[13] = var76[7] * -var72 + (var76[4] * -var71 + var76[1] * -var70 + 16384) >> 15;
                                            var76[14] = var76[5] * -var71 + var76[2] * -var70 - (-(var76[8] * -var72) + -16384) >> 15;
                                        }
                                        var76[11] = var72;
                                        var76[10] = var71;
                                        var76[9] = var70;
                                    }
                                    if (var73 != 0 || var74 != 0 || var75 != 0) {
                                        var64[var69].method892(var74, var75, var73, -127);
                                    }
                                    if (var70 != 0 || var71 != 0 || var72 != 0) {
                                        var64[var69].method888(var71, var72, var70, (byte) -83);
                                    }
                                }
                            }
                        }
                        int var85 = var20 | 0x4000;
                        class118 var86 = new class118(var64, var64.length);
                        var58 = arg7.method150(var86, var85, class182.field2703, 64, 850);
                        for (int var87 = 0; var87 < 5; var87++) {
                            if (this.field477[var87] < class406.field6118[var87].length) {
                                var58.method654(class328.field5124[var87], class406.field6118[var87][this.field477[var87]]);
                            }
                            if (class266.field3970[var87].length > this.field477[var87]) {
                                var58.method654(class157.field2373[var87], class266.field3970[var87][this.field477[var87]]);
                            }
                        }
                        if (arg18) {
                            var58.method602(var20);
                            class382 var88 = class169.field2484;
                            synchronized (class169.field2484) {
                                class169.field2484.method2290(var21, var58, 124);
                            }
                            this.field488 = var21;
                        }
                    }
                    break;
                }
                int var63 = var23[var62];
                if ((var63 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var63) != 0 && !arg17.method419(3, var63 & 0x3FFFFFFF).method2505(-19340)) {
                        var61 = true;
                    }
                } else if (!arg6.method1749(var63 & 0x3FFFFFFF, -20230).method593(this.field491, (byte) -80)) {
                    var61 = true;
                }
                var62++;
            }
        }
        class398 var90 = var58.method610((byte) 4, var20, true);
        if (!var28) {
            return var90;
        }
        int var91 = 0;
        int var92 = 1;
        while (var91 < var29) {
            if (class4.field39[var91] != null) {
                var90.method2390(false, class213.field3046[var91], 0, class8.field70[var91] - 1, class4.field39[var91], this.field487 == null ? null : this.field487[var91], var92, 0, class242.field3374[var91], class404.field6096[var91], class355.field5445[var91]);
            }
            var92 <<= 0x1;
            var91++;
        }
        if (var41 != null && var46 != null) {
            var90.method2393(var41, var39, var45, true, arg16 - 1, var44, var42, false, var48, var46, arg0 - 1, arg10.field7613, var43, var40, var38);
        } else if (var41 != null) {
            var90.method2391(-1, false, var41, 0, var42, arg16 - 1, var38, var39, var40);
        } else if (var46 != null) {
            var90.method2391(-1, false, var46, 0, var48, arg0 - 1, var43, var44, var45);
        }
        for (int var93 = 0; var93 < var29; var93++) {
            class4.field39[var93] = null;
            class213.field3046[var93] = null;
            class494.field7346[var93] = null;
        }
        return var90;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIB)V")
    public final void method310(int arg0, int arg1, byte arg2) {
        if (arg2 > 65) {
            field482++;
            this.field477[arg0] = arg1;
            this.method306((byte) 74);
        }
    }
}
