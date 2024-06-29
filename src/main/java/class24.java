import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class24 {

    @OriginalMember(owner = "client!we", name = "e", descriptor = "I")
    public int field428 = -1;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Ljava/lang/String;")
    public static String field426 = "Starting 3d Library";

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field424 = -1;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field433 = 0;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field429;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field432;

    @OriginalMember(owner = "client!we", name = "k", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!we", name = "t", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    private int field446;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "J")
    private long field425;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "J")
    private long field444;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Z")
    public boolean field436;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "[I")
    public int[] field440;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "[I")
    private int[] field442;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "[[I")
    private int[][] field438;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ZI)V", line = 3)
    public final void method293(boolean arg0, int arg1) {
        this.field436 = arg0;
        field439++;
        this.method294(8);
        if (arg1 <= 6) {
            method304(-13, 82);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 23)
    private final void method294(int arg0) {
        field427++;
        long[] var2 = class57.field914;
        this.field425 = -1L;
        this.field425 = this.field425 >>> 8 ^ var2[(int) (((long) (this.field446 >> 8) ^ this.field425) & 0xFFL)];
        this.field425 = this.field425 >>> 8 ^ var2[(int) (((long) this.field446 ^ this.field425) & 0xFFL)];
        for (int var3 = 0; var3 < 12; var3++) {
            this.field425 = var2[(int) ((this.field425 ^ (long) (this.field442[var3] >> 24)) & 0xFFL)] ^ this.field425 >>> 8;
            this.field425 = this.field425 >>> 8 ^ var2[(int) (((long) (this.field442[var3] >> 16) ^ this.field425) & 0xFFL)];
            this.field425 = this.field425 >>> 8 ^ var2[(int) (((long) (this.field442[var3] >> 8) ^ this.field425) & 0xFFL)];
            this.field425 = var2[(int) (((long) this.field442[var3] ^ this.field425) & 0xFFL)] ^ this.field425 >>> 8;
        }
        if (arg0 != 8) {
            this.field428 = -33;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field425 = this.field425 >>> 8 ^ var2[(int) ((this.field425 ^ (long) this.field440[var4]) & 0xFFL)];
        }
        this.field425 = var2[(int) (((long) (this.field436 ? 1 : 0) ^ this.field425) & 0xFFL)] ^ this.field425 >>> 8;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III[[[Ldg;BZ)Z", line = 60)
    public static final boolean method295(int arg0, int arg1, int arg2, class224[][][] arg3, byte arg4, boolean arg5) {
        field434++;
        byte var6 = arg5 ? 1 : (byte) (class128.field1811 & 0xFF);
        if (class163.field2408[class69.field1046][arg2][arg0] == var6) {
            return false;
        } else if ((class7.field57[class69.field1046][arg2][arg0] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            if (arg4 < 4) {
                return false;
            }
            int var8 = 0;
            class285.field3816[var7] = arg2;
            int var35 = var7 + 1;
            class275.field3706[var7] = arg0;
            class163.field2408[class69.field1046][arg2][arg0] = var6;
            while (var35 != var8) {
                int var9 = class285.field3816[var8] & 0xFFFF;
                int var10 = class285.field3816[var8] >> 16 & 0xFF;
                int var11 = class285.field3816[var8] >> 24 & 0xFF;
                int var12 = class275.field3706[var8] & 0xFFFF;
                int var13 = (class275.field3706[var8] & 0xFF839E) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class7.field57[class69.field1046][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class69.field1046 + 1; var16 <= 3; var16++) {
                    if ((class7.field57[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg3[var16][var9][var12] != null) {
                            if (arg3[var16][var9][var12].field3108 != null) {
                                int var20 = class335.method2121(var10, 3);
                                if (arg3[var16][var9][var12].field3108.field4632 == var20 || arg3[var16][var9][var12].field3125 != null && arg3[var16][var9][var12].field3125.field4632 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class335.method2121(var11, 3);
                                    if (arg3[var16][var9][var12].field3108.field4632 == var21 || arg3[var16][var9][var12].field3125 != null && arg3[var16][var9][var12].field3125.field4632 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class335.method2121(var13, 3);
                                    if (arg3[var16][var9][var12].field3108.field4632 == var22 || arg3[var16][var9][var12].field3125 != null && arg3[var16][var9][var12].field3125.field4632 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class224 var23 = arg3[var16][var9][var12];
                            if (var23.field3129 != null) {
                                for (class26 var24 = var23.field3129; var24 != null; var24 = var24.field463) {
                                    class228 var25 = var24.field460;
                                    if (var25 instanceof class111) {
                                        class111 var26 = (class111) var25;
                                        int var27 = var26.method575(-15863);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var28 = var26.method580(24493);
                                        int var29 = var28 << 6 | var27;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class224 var30 = arg3[var16][var9][var12];
                        if (var30 != null && var30.field3129 != null) {
                            for (class26 var31 = var30.field3129; var31 != null; var31 = var31.field463) {
                                class228 var32 = var31.field460;
                                if (var32.field3172 != var32.field3162 || var32.field3178 != var32.field3161) {
                                    for (int var33 = var32.field3172; var33 <= var32.field3162; var33++) {
                                        for (int var34 = var32.field3161; var34 <= var32.field3178; var34++) {
                                            class163.field2408[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class163.field2408[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class91.field1351[class69.field1046 + 1].method1509(var9, var12);
                    if (var17 > class386.field5442[arg1]) {
                        class386.field5442[arg1] = var17;
                    }
                    int var18 = var9 << 7;
                    if (var18 < class69.field1036[arg1]) {
                        class69.field1036[arg1] = var18;
                    } else if (class365.field5036[arg1] < var18) {
                        class365.field5036[arg1] = var18;
                    }
                    int var19 = var12 << 7;
                    if (var19 < class368.field5053[arg1]) {
                        class368.field5053[arg1] = var19;
                    } else if (var19 > class12.field89[arg1]) {
                        class12.field89[arg1] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class163.field2408[class69.field1046][var9 - 1][var12] != var6) {
                        class285.field3816[var35] = class260.method1678(-754974720, class260.method1678(1179648, var9 - 1));
                        class275.field3706[var35] = class260.method1678(var12, 1245184);
                        var35 = var35 + 1 & 0xFFF;
                        class163.field2408[class69.field1046][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (class385.field5425 > var12) {
                        if ((var9 - 1) >= 0 && class163.field2408[class69.field1046][var9 - 1][var12] != var6 && (class7.field57[class69.field1046][var9][var12] & 0x4) == 0 && (class7.field57[class69.field1046][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class285.field3816[var35] = class260.method1678(1375731712, class260.method1678(1179648, var9 - 1));
                            class275.field3706[var35] = class260.method1678(1245184, var12);
                            class163.field2408[class69.field1046][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class163.field2408[class69.field1046][var9][var12] != var6) {
                            class285.field3816[var35] = class260.method1678(class260.method1678(var9, 5373952), 318767104);
                            class275.field3706[var35] = class260.method1678(var12, 5439488);
                            class163.field2408[class69.field1046][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < class116.field1621 && class163.field2408[class69.field1046][var9 + 1][var12] != var6 && (class7.field57[class69.field1046][var9][var12] & 0x4) == 0 && (class7.field57[class69.field1046][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class285.field3816[var35] = class260.method1678(-1845493760, class260.method1678(var9 + 1, 5373952));
                            class275.field3706[var35] = class260.method1678(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class163.field2408[class69.field1046][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (class116.field1621 > (var9 + 1) && class163.field2408[class69.field1046][var9 + 1][var12] != var6) {
                        class285.field3816[var35] = class260.method1678(class260.method1678(9568256, var9 + 1), 1392508928);
                        class275.field3706[var35] = class260.method1678(var12, 9633792);
                        class163.field2408[class69.field1046][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class163.field2408[class69.field1046][var9 - 1][var12] != var6 && (class7.field57[class69.field1046][var9][var12] & 0x4) == 0 && (class7.field57[class69.field1046][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class285.field3816[var35] = class260.method1678(class260.method1678(13762560, var9 - 1), 301989888);
                            class275.field3706[var35] = class260.method1678(var12, 13828096);
                            class163.field2408[class69.field1046][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class163.field2408[class69.field1046][var9][var12] != var6) {
                            class285.field3816[var35] = class260.method1678(-1828716544, class260.method1678(13762560, var9));
                            class275.field3706[var35] = class260.method1678(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class163.field2408[class69.field1046][var9][var12] = var6;
                        }
                        if (var9 + 1 < class116.field1621 && class163.field2408[class69.field1046][var9 + 1][var12] != var6 && (class7.field57[class69.field1046][var9][var12] & 0x4) == 0 && (class7.field57[class69.field1046][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class285.field3816[var35] = class260.method1678(-771751936, class260.method1678(9568256, var9 + 1));
                            class275.field3706[var35] = class260.method1678(9633792, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class163.field2408[class69.field1046][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class386.field5442[arg1] != -1000000) {
                class386.field5442[arg1] += 10;
                class69.field1036[arg1] -= 50;
                class365.field5036[arg1] += 50;
                class12.field89[arg1] += 50;
                class368.field5053[arg1] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IILqi;Lpe;III)Lsj;", line = 376)
    public final class73 method296(int arg0, int arg1, class209 arg2, class391 arg3, int arg4, int arg5, int arg6) {
        field430++;
        if (this.field428 != -1) {
            return class330.method2102(this.field428, -46).method73(arg2, arg3, arg0, arg4, arg1, arg5 ^ 0xE0E, arg6);
        }
        int var8 = arg6;
        if (arg2 != null) {
            boolean var9 = false;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = true;
            boolean var13 = true;
            Object var14 = null;
            int var15 = arg2.field2915[arg4];
            var8 = arg6 | 0x20;
            Object var16 = null;
            int var17 = var15 >>> 16;
            int var18 = var15 & 0xFFFF;
            class61 var19 = class166.method1254((byte) -127, var17);
            if (var19 != null) {
                var10 |= var19.method546(var18, (byte) -83);
                var9 |= var19.method551(0, var18);
                var11 |= arg2.field2911;
            }
            if ((arg2.field2909 || class258.field3486) && arg0 != -1 && arg0 < arg2.field2915.length) {
                int var20 = arg2.field2915[arg0];
                int var21 = var20 >>> 16;
                int var22 = var20 & 0xFFFF;
                class61 var23;
                if (var17 == var21) {
                    var23 = var19;
                } else {
                    var23 = class166.method1254((byte) -127, var22 >>> 16);
                }
                if (var23 != null) {
                    var10 |= var23.method546(var22, (byte) 101);
                    var9 |= var23.method551(arg5 - 32, var22);
                }
            }
            if (var10) {
                var8 |= 0x80;
            }
            if (var9) {
                var8 |= 0x100;
            }
            if (var11) {
                var8 |= 0x200;
            }
        }
        if (arg5 != 32) {
            return null;
        }
        class410 var24 = class388.field5462;
        class73 var25;
        synchronized (class388.field5462) {
            var25 = (class73) class388.field5462.method2537(arg5 ^ 0xFFFFFF92, this.field425);
        }
        if (var25 == null || arg3.method183(var25.method426(), var8) != 0) {
            if (var25 != null) {
                var8 = arg3.method163(var8, var25.method426());
            }
            boolean var27 = false;
            for (int var28 = 0; var28 < 12; var28++) {
                int var29 = this.field442[var28];
                if ((var29 & 0x40000000) == 0) {
                    if ((var29 & Integer.MIN_VALUE) != 0 && !class100.method855(32767, var29 & 0x3FFFFFFF).method2126((byte) -67)) {
                        var27 = true;
                    }
                } else if (!class234.method1569(2142, var29 & 0x3FFFFFFF).method2819(this.field436, arg5 - 33)) {
                    var27 = true;
                }
            }
            if (var27) {
                return null;
            }
            class84[] var30 = new class84[12];
            int var31 = 0;
            for (int var32 = 0; var32 < 12; var32++) {
                int var33 = this.field442[var32];
                if ((var33 & 0x40000000) != 0) {
                    class84 var34 = class234.method1569(2142, var33 & 0x3FFFFFFF).method2808(this.field436, 0);
                    if (var34 != null) {
                        var30[var31++] = var34;
                    }
                } else if ((var33 & Integer.MIN_VALUE) != 0) {
                    class84 var35 = class100.method855(32767, var33 & 0x3FFFFFFF).method2128(false);
                    if (var35 != null) {
                        var30[var31++] = var35;
                    }
                }
            }
            class84 var36 = new class84(var30, var31);
            int var37 = var8 | 0x2000;
            var25 = arg3.method237(var36, var37, class22.field406, 64, 768);
            for (int var38 = 0; var38 < 5; var38++) {
                if (class134.field1905[var38].length > this.field440[var38]) {
                    var25.method424(class190.field2737[var38], class134.field1905[var38][this.field440[var38]]);
                }
                if (class417.field5857[var38].length > this.field440[var38]) {
                    var25.method424(class234.field3245[var38], class417.field5857[var38][this.field440[var38]]);
                }
            }
            var25.method463(var8);
            class410 var39 = class388.field5462;
            synchronized (class388.field5462) {
                class388.field5462.method2542(var25, (byte) -81, this.field425);
            }
        }
        if (arg2 == null) {
            return var25;
        } else {
            var25.method440((byte) 1, var8, true);
            return arg2.method1443(arg1, arg4, (byte) 102, arg0, var25, arg6);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(BIIIILqi;IILpe;I)Lsj;", line = 565)
    public final class73 method297(byte arg0, int arg1, int arg2, int arg3, int arg4, class209 arg5, int arg6, int arg7, class391 arg8, int arg9) {
        field435++;
        int var11 = arg9;
        if (arg5 != null) {
            boolean var12 = false;
            boolean var13 = false;
            boolean var14 = false;
            boolean var15 = true;
            boolean var16 = true;
            Object var17 = null;
            var11 = arg9 | 0x20;
            Object var18 = null;
            int var19 = arg5.field2915[arg3];
            int var20 = var19 >>> 16;
            class61 var21 = class166.method1254((byte) -127, var20);
            int var22 = var19 & 0xFFFF;
            if (var21 != null) {
                var13 |= var21.method546(var22, (byte) -15);
                var12 |= var21.method551(0, var22);
                var14 |= arg5.field2911;
            }
            if ((arg5.field2909 || class258.field3486) && arg7 != -1 && arg7 < arg5.field2915.length) {
                int var23 = arg5.field2915[arg7];
                int var24 = var23 >>> 16;
                int var25 = var23 & 0xFFFF;
                class61 var26;
                if (var20 == var24) {
                    var26 = var21;
                } else {
                    var26 = class166.method1254((byte) -127, var25 >>> 16);
                }
                if (var26 != null) {
                    var13 |= var26.method546(var25, (byte) -5);
                    var12 |= var26.method551(0, var25);
                }
            }
            if (var13) {
                var11 |= 0x80;
            }
            if (var12) {
                var11 |= 0x100;
            }
            if (var14) {
                var11 |= 0x200;
            }
        }
        long var27 = (long) arg1 | (long) arg2 << 32 | (long) (arg4 << 16);
        if (arg0 >= -4) {
            this.method302(115, -121, -78);
        }
        class410 var29 = class388.field5462;
        class73 var30;
        synchronized (class388.field5462) {
            var30 = (class73) class388.field5462.method2537(-72, var27);
        }
        if (var30 == null || arg8.method183(var30.method426(), var11) != 0) {
            if (var30 != null) {
                var11 = arg8.method163(var11, var30.method426());
            }
            class84[] var32 = new class84[3];
            int var33 = 0;
            if (!class100.method855(32767, arg1).method2126((byte) -63) || !class100.method855(32767, arg4).method2126((byte) -117) || !class100.method855(32767, arg2).method2126((byte) -83)) {
                return null;
            }
            class84 var34 = class100.method855(32767, arg1).method2128(false);
            if (var34 != null) {
                var32[var33++] = var34;
            }
            class84 var35 = class100.method855(32767, arg4).method2128(false);
            if (var35 != null) {
                var32[var33++] = var35;
            }
            class84 var36 = class100.method855(32767, arg2).method2128(false);
            if (var36 != null) {
                var32[var33++] = var36;
            }
            class84 var37 = new class84(var32, var33);
            int var38 = var11 | 0x2000;
            var30 = arg8.method237(var37, var38, class22.field406, 64, 768);
            for (int var39 = 0; var39 < 5; var39++) {
                if (this.field440[var39] < class134.field1905[var39].length) {
                    var30.method424(class190.field2737[var39], class134.field1905[var39][this.field440[var39]]);
                }
                if (class417.field5857[var39].length > this.field440[var39]) {
                    var30.method424(class234.field3245[var39], class417.field5857[var39][this.field440[var39]]);
                }
            }
            var30.method463(var11);
            class410 var40 = class388.field5462;
            synchronized (class388.field5462) {
                class388.field5462.method2542(var30, (byte) 111, var27);
            }
        }
        if (arg5 == null) {
            return var30;
        } else {
            class73 var41 = var30.method440((byte) 1, var11, true);
            return arg5.method1443(arg6, arg3, (byte) 113, arg7, var41, arg9);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 710)
    public static void method298(byte arg0) {
        if (arg0 != -17) {
            method295(-21, -37, -19, (class224[][][]) null, (byte) 51, true);
        }
        field426 = null;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIB)V", line = 731)
    public final void method299(int arg0, int arg1, byte arg2) {
        field429++;
        int var4 = class339.field4625[arg1];
        if (arg2 >= 120 && this.field442[var4] != 0 && class100.method855(32767, arg0) != null) {
            this.field442[var4] = class260.method1678(Integer.MIN_VALUE, arg0);
            this.method294(8);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILqi;Lpe;II[Ltc;IIILqi;IZI)Lsj;", line = 754)
    public final class73 method300(int arg0, class209 arg1, class391 arg2, int arg3, int arg4, class291[] arg5, int arg6, int arg7, int arg8, class209 arg9, int arg10, boolean arg11, int arg12) {
        field431++;
        if (this.field428 != -1) {
            return class330.method2102(this.field428, -85).method85(arg4, arg12, arg6, 25031, arg7, arg8, arg1, arg10, arg2, arg3, arg9, arg5);
        }
        int var14 = arg6;
        long var15 = this.field425;
        int[] var17 = this.field442;
        if (arg1 != null && (arg1.field2905 >= 0 || arg1.field2916 >= 0)) {
            var17 = new int[12];
            for (int var18 = 0; var18 < 12; var18++) {
                var17[var18] = this.field442[var18];
            }
            if (arg1.field2905 >= 0) {
                if (arg1.field2905 == 65535) {
                    var17[5] = 0;
                    var15 ^= 0xFFFFFFFF00000000L;
                } else {
                    var17[5] = class260.method1678(arg1.field2905, 1073741824);
                    var15 ^= (long) var17[5] << 32;
                }
            }
            if (arg1.field2916 >= 0) {
                if (arg1.field2916 == 65535) {
                    var17[3] = 0;
                    var15 ^= 0xFFFFFFFFL;
                } else {
                    var17[3] = class260.method1678(1073741824, arg1.field2916);
                    var15 ^= (long) var17[3];
                }
            }
        }
        boolean var19 = false;
        if (arg0 != 7) {
            field433 = -85;
        }
        boolean var20 = false;
        boolean var21 = arg1 != null || arg9 != null;
        int var22 = arg5 == null ? 0 : arg5.length;
        for (int var23 = 0; var23 < var22; var23++) {
            class414.field5789[var23] = null;
            if (arg5[var23] != null) {
                class209 var24 = class288.method1819(arg5[var23].field3955, (byte) 105);
                if (var24.field2915 != null) {
                    var21 = true;
                    class102.field1515[var23] = var24;
                    int var25 = arg5[var23].field3945;
                    int var26 = arg5[var23].field3948;
                    int var27 = var24.field2915[var25];
                    class414.field5789[var23] = class166.method1254((byte) -127, var27 >>> 16);
                    int var28 = var27 & 0xFFFF;
                    class131.field1857[var23] = var28;
                    if (class414.field5789[var23] != null) {
                        var20 |= class414.field5789[var23].method546(var28, (byte) 120);
                        var19 |= class414.field5789[var23].method551(arg0 - 7, var28);
                    }
                    if ((var24.field2909 || class258.field3486) && var26 != -1 && var26 < var24.field2915.length) {
                        class321.field4336[var23] = var24.field2894[var25];
                        class451.field6521[var23] = arg5[var23].field3946;
                        int var29 = var24.field2915[var26];
                        class187.field2702[var23] = class166.method1254((byte) -127, var29 >>> 16);
                        int var30 = var29 & 0xFFFF;
                        class287.field3851[var23] = var30;
                        if (class187.field2702[var23] != null) {
                            var20 |= class187.field2702[var23].method546(var30, (byte) -18);
                            var19 |= class187.field2702[var23].method551(0, var30);
                        }
                    } else {
                        class321.field4336[var23] = 0;
                        class451.field6521[var23] = 0;
                        class187.field2702[var23] = null;
                        class287.field3851[var23] = -1;
                    }
                }
            }
        }
        int var31 = -1;
        int var32 = -1;
        int var33 = 0;
        class61 var34 = null;
        class61 var35 = null;
        int var36 = -1;
        int var37 = -1;
        int var38 = 0;
        class61 var39 = null;
        class61 var40 = null;
        if (var21) {
            var14 = arg6 | 0x20;
            if (arg1 != null) {
                int var41 = arg1.field2915[arg10];
                int var42 = var41 >>> 16;
                var34 = class166.method1254((byte) -127, var42);
                var31 = var41 & 0xFFFF;
                if (var34 != null) {
                    var20 |= var34.method546(var31, (byte) -77);
                    var19 |= var34.method551(0, var31);
                }
                if ((arg1.field2909 || class258.field3486) && arg7 != -1 && arg1.field2915.length > arg7) {
                    int var43 = arg1.field2915[arg7];
                    var33 = arg1.field2894[arg10];
                    int var44 = var43 >>> 16;
                    var32 = var43 & 0xFFFF;
                    if (var42 == var44) {
                        var35 = var34;
                    } else {
                        var35 = class166.method1254((byte) -127, var32 >>> 16);
                    }
                    if (var35 != null) {
                        var20 |= var35.method546(var32, (byte) -82);
                        var19 |= var35.method551(0, var32);
                    }
                }
            }
            if (arg9 != null) {
                int var45 = arg9.field2915[arg12];
                int var46 = var45 >>> 16;
                var39 = class166.method1254((byte) -127, var46);
                var36 = var45 & 0xFFFF;
                if (var39 != null) {
                    var20 |= var39.method546(var36, (byte) 121);
                    var19 |= var39.method551(0, var36);
                }
                if ((arg9.field2909 || class258.field3486) && arg4 != -1 && arg9.field2915.length > arg4) {
                    var38 = arg9.field2894[arg12];
                    int var47 = arg9.field2915[arg4];
                    int var48 = var47 >>> 16;
                    var37 = var47 & 0xFFFF;
                    if (var46 == var48) {
                        var40 = var39;
                    } else {
                        var40 = class166.method1254((byte) -127, var37 >>> 16);
                    }
                    if (var40 != null) {
                        var20 |= var40.method546(var37, (byte) 116);
                        var19 |= var40.method551(arg0 ^ 0x7, var37);
                    }
                }
            }
            if (var20) {
                var14 |= 0x80;
            }
            if (var19) {
                var14 |= 0x100;
            }
        }
        class410 var49 = class68.field1018;
        class73 var50;
        synchronized (class68.field1018) {
            var50 = (class73) class68.field1018.method2537(-125, var15);
        }
        class434 var51 = null;
        if (this.field446 != -1) {
            var51 = class265.method1706(false, this.field446);
        }
        if (var50 == null || arg2.method183(var50.method426(), var14) != 0 || var51 != null && var51.field6186 != null && this.field438 == null) {
            if (var50 != null) {
                var14 = arg2.method163(var14, var50.method426());
            }
            boolean var53 = false;
            int var54 = 0;
            while (true) {
                if (var54 >= 12) {
                    if (var53) {
                        if (this.field444 != -1L) {
                            class410 var81 = class68.field1018;
                            synchronized (class68.field1018) {
                                var50 = (class73) class68.field1018.method2537(-98, this.field444);
                            }
                        }
                        if (var50 == null || arg2.method183(var50.method426(), var14) != 0 || var51 != null && var51.field6186 != null && this.field438 == null) {
                            return null;
                        }
                    } else {
                        class84[] var56 = new class84[12];
                        for (int var57 = 0; var57 < 12; var57++) {
                            int var58 = var17[var57];
                            if ((var58 & 0x40000000) != 0) {
                                class84 var60 = class234.method1569(2142, var58 & 0x3FFFFFFF).method2809((byte) 5, this.field436);
                                if (var60 != null) {
                                    var56[var57] = var60;
                                }
                            } else if ((var58 & Integer.MIN_VALUE) != 0) {
                                class84 var59 = class100.method855(32767, var58 & 0x3FFFFFFF).method2125(115);
                                if (var59 != null) {
                                    var56[var57] = var59;
                                }
                            }
                        }
                        if (var51 != null && var51.field6186 != null) {
                            for (int var61 = 0; var61 < var51.field6186.length; var61++) {
                                if (var51.field6186[var61] != null && var56[var61] != null) {
                                    int var62 = var51.field6186[var61][0];
                                    int var63 = var51.field6186[var61][1];
                                    int var64 = var51.field6186[var61][2];
                                    int var65 = var51.field6186[var61][3] << 3;
                                    int var66 = var51.field6186[var61][4] << 3;
                                    int var67 = var51.field6186[var61][5] << 3;
                                    if (this.field438 == null) {
                                        this.field438 = new int[var51.field6186.length][];
                                    }
                                    if (this.field438[var61] == null) {
                                        int[] var68 = this.field438[var61] = new int[15];
                                        if (var65 == 0 && var66 == 0 && var67 == 0) {
                                            var68[13] = -var63;
                                            var68[0] = var68[4] = var68[8] = 32768;
                                            var68[12] = -var62;
                                            var68[14] = -var64;
                                        } else {
                                            int var69 = class174.field2564[var65];
                                            int var70 = class174.field2572[var65];
                                            int var71 = class174.field2564[var66];
                                            int var72 = class174.field2572[var66];
                                            int var73 = class174.field2564[var67];
                                            int var74 = class174.field2572[var67];
                                            int var75 = var70 * var73 + 16384 >> 15;
                                            int var76 = var70 * var74 + 16384 >> 15;
                                            var68[5] = -var70;
                                            var68[0] = var71 * var73 + var72 * var76 + 16384 >> 15;
                                            var68[8] = var69 * var71 + 16384 >> 15;
                                            var68[2] = var69 * var72 + 16384 >> 15;
                                            var68[3] = var69 * var74 + 16384 >> 15;
                                            var68[4] = var69 * var73 + 16384 >> 15;
                                            var68[1] = -var74 * var71 + (var72 * var75) + 16384 >> 15;
                                            var68[7] = -var72 * -var74 + var71 * var75 + 16384 >> 15;
                                            var68[6] = -var72 * var73 + var71 * var76 + 16384 >> 15;
                                            var68[12] = var68[6] * -var64 + var68[3] * -var63 + var68[0] * -var62 + 16384 >> 15;
                                            var68[13] = var68[7] * -var64 + var68[1] * -var62 + (var68[4] * -var63) + 16384 >> 15;
                                            var68[14] = var68[2] * -var62 + var68[8] * -var64 + var68[5] * -var63 + 16384 >> 15;
                                        }
                                        var68[11] = var64;
                                        var68[10] = var63;
                                        var68[9] = var62;
                                    }
                                    if (var65 != 0 || var66 != 0 || var67 != 0) {
                                        var56[var61].method768(var67, var66, var65, 0);
                                    }
                                    if (var62 != 0 || var63 != 0 || var64 != 0) {
                                        var56[var61].method770(var64, arg0 ^ 0x70, var62, var63);
                                    }
                                }
                            }
                        }
                        int var77 = var14 | 0x2000;
                        class84 var78 = new class84(var56, var56.length);
                        var50 = arg2.method237(var78, var77, class22.field406, 64, 850);
                        for (int var79 = 0; var79 < 5; var79++) {
                            if (this.field440[var79] < class134.field1905[var79].length) {
                                var50.method424(class190.field2737[var79], class134.field1905[var79][this.field440[var79]]);
                            }
                            if (this.field440[var79] < class417.field5857[var79].length) {
                                var50.method424(class234.field3245[var79], class417.field5857[var79][this.field440[var79]]);
                            }
                        }
                        if (arg11) {
                            var50.method463(var14);
                            class410 var80 = class68.field1018;
                            synchronized (class68.field1018) {
                                class68.field1018.method2542(var50, (byte) 96, var15);
                            }
                            this.field444 = var15;
                        }
                    }
                    break;
                }
                int var55 = var17[var54];
                if ((var55 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var55) != 0 && !class100.method855(32767, var55 & 0x3FFFFFFF).method2127((byte) 62)) {
                        var53 = true;
                    }
                } else if (!class234.method1569(2142, var55 & 0x3FFFFFFF).method2818((byte) 78, this.field436)) {
                    var53 = true;
                }
                var54++;
            }
        }
        class73 var82 = var50.method440((byte) 1, var14, true);
        if (!var21) {
            return var82;
        }
        int var83 = 0;
        int var84 = 1;
        while (var83 < var22) {
            if (class414.field5789[var83] != null) {
                var82.method631(20116, class414.field5789[var83], class321.field4336[var83], class131.field1857[var83], class187.field2702[var83], false, class287.field3851[var83], 0, var84, this.field438 == null ? null : this.field438[var83], class451.field6521[var83] - 1);
            }
            var84 <<= 0x1;
            var83++;
        }
        if (var34 != null && var39 != null) {
            var82.method632(var36, false, arg8 - 1, var34, arg3 - 1, var40, arg1.field2897, var32, var33, var37, 107, var38, var35, var31, var39);
        } else if (var34 != null) {
            var82.method628(arg3 - 1, var34, var33, (byte) 120, var35, var32, var31, false, 0);
        } else if (var39 != null) {
            var82.method628(arg8 - 1, var39, var38, (byte) 115, var40, var37, var36, false, 0);
        }
        for (int var85 = 0; var85 < var22; var85++) {
            class414.field5789[var85] = null;
            class187.field2702[var85] = null;
            class102.field1515[var85] = null;
        }
        return var82;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)Z", line = 1255)
    public static final boolean method301(int arg0) {
        field437++;
        if (class101.field1504) {
            try {
                if ((Boolean) class117.method936("showingVideoAd", true, class30.field502.field4117)) {
                    return false;
                }
                return true;
            } catch (Throwable var2) {
            }
        }
        int var1 = -15 / ((-arg0 - 60) / 54);
        return true;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V", line = 1276)
    public final void method302(int arg0, int arg1, int arg2) {
        if (arg1 > -115) {
            this.method293(false, -106);
        }
        field445++;
        this.field440[arg0] = arg2;
        this.method294(8);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z[II[III)V", line = 1289)
    public final void method303(boolean arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5) {
        if (arg5 != 0) {
            this.method293(false, 25);
        }
        if (this.field446 != arg4) {
            this.field438 = null;
            this.field446 = arg4;
        }
        field432++;
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class55.field887; var8++) {
                    class336 var9 = class100.method855(arg5 ^ 0x7FFF, var8);
                    if (var9 != null && !var9.field4554 && (arg0 ? class144.field2169[var7] : class61.field950[var7]) == var9.field4548) {
                        arg3[class339.field4625[var7]] = class260.method1678(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field436 = arg0;
        this.field440 = arg1;
        this.field428 = arg2;
        this.field442 = arg3;
        this.method294(8);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)I", line = 1343)
    public static final int method304(int arg0, int arg1) {
        int var2 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
        field443++;
        if (arg1 != 0) {
            return 35;
        }
        int var3 = ((var2 & 0xCCCCCCCE) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }
}
