import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class59 {

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    private int field1265 = 0;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    private int field1262 = 0;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    private int field1263;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
    private int field1277;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "[[I")
    public int[][] field1267;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field1252 = 2301979;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "Lvc;")
    private static class137 field1259 = class45.method325("Connecting to friendserver", -46);

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "Lvc;")
    public static class137 field1266 = class45.method325("@cr1@", -46);

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public static int field1270 = 0;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public static int field1274 = 5063219;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Lvc;")
    public static class137 field1255 = field1259;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "[I")
    public static int[] field1282 = new int[500];

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "Lia;")
    public static class57 field1272;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "Lia;")
    public static class57 field1273;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "Z")
    public static boolean field1278;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIII)Z")
    public final boolean method413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1271++;
        if (arg0 == arg6 && arg1 == arg3) {
            return true;
        }
        int var8 = arg3 - this.field1262;
        int var9 = arg1 - this.field1262;
        int var10 = -13 / ((arg2 + 82) / 43);
        int var11 = arg0 - this.field1265;
        int var12 = arg6 - this.field1265;
        if (arg4 == 0) {
            if (arg5 == 0) {
                if (var11 - 1 == var12 && var8 == var9) {
                    return true;
                }
                if (var11 == var12 && var8 + 1 == var9 && (this.field1267[var12][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 == var12 && var8 - 1 == var9 && (this.field1267[var12][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var11 == var12 && var8 + 1 == var9) {
                    return true;
                }
                if (var11 - 1 == var12 && var8 == var9 && (this.field1267[var12][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var8 == var9 && (this.field1267[var12][var9] & 0x1280180) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var11 + 1 == var12 && var8 == var9) {
                    return true;
                }
                if (var11 == var12 && var8 + 1 == var9 && (this.field1267[var12][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 == var12 && var8 - 1 == var9 && (this.field1267[var12][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var11 == var12 && var8 - 1 == var9) {
                    return true;
                }
                if (var11 - 1 == var12 && var8 == var9 && (this.field1267[var12][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var8 == var9 && (this.field1267[var12][var9] & 0x1280180) == 0) {
                    return true;
                }
            }
        }
        if (arg4 == 2) {
            if (arg5 == 0) {
                if (var11 - 1 == var12 && var8 == var9) {
                    return true;
                }
                if (var11 == var12 && var8 + 1 == var9) {
                    return true;
                }
                if (var11 + 1 == var12 && var8 == var9 && (this.field1267[var12][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var11 == var12 && var8 - 1 == var9 && (this.field1267[var12][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 1) {
                if (var11 - 1 == var12 && var8 == var9 && (this.field1267[var12][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 == var12 && var8 + 1 == var9) {
                    return true;
                }
                if (var11 + 1 == var12 && var8 == var9) {
                    return true;
                }
                if (var11 == var12 && var8 - 1 == var9 && (this.field1267[var12][var9] & 0x1280102) == 0) {
                    return true;
                }
            } else if (arg5 == 2) {
                if (var11 - 1 == var12 && var8 == var9 && (this.field1267[var12][var9] & 0x1280108) == 0) {
                    return true;
                }
                if (var11 == var12 && var8 + 1 == var9 && (this.field1267[var12][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var8 == var9) {
                    return true;
                }
                if (var11 == var12 && var8 - 1 == var9) {
                    return true;
                }
            } else if (arg5 == 3) {
                if (var11 - 1 == var12 && var8 == var9) {
                    return true;
                }
                if (var11 == var12 && var8 + 1 == var9 && (this.field1267[var12][var9] & 0x1280120) == 0) {
                    return true;
                }
                if (var11 + 1 == var12 && var8 == var9 && (this.field1267[var12][var9] & 0x1280180) == 0) {
                    return true;
                }
                if (var11 == var12 && var8 - 1 == var9) {
                    return true;
                }
            }
        }
        if (arg4 == 9) {
            if (var11 == var12 && var8 + 1 == var9 && (this.field1267[var12][var9] & 0x20) == 0) {
                return true;
            }
            if (var11 == var12 && var8 - 1 == var9 && (this.field1267[var12][var9] & 0x2) == 0) {
                return true;
            }
            if (var11 - 1 == var12 && var8 == var9 && (this.field1267[var12][var9] & 0x8) == 0) {
                return true;
            }
            if (var11 + 1 == var12 && var8 == var9 && (this.field1267[var12][var9] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZIZIII)V")
    public final void method414(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var7 = arg1 - this.field1262;
        if (arg0) {
            method417(-81);
        }
        field1256++;
        int var8 = arg5 - this.field1265;
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method421(var7, var8, 5627, 128);
                this.method421(var7, var8 - 1, 5627, 8);
            }
            if (arg4 == 1) {
                this.method421(var7, var8, 5627, 2);
                this.method421(var7 + 1, var8, 5627, 32);
            }
            if (arg4 == 2) {
                this.method421(var7, var8, 5627, 8);
                this.method421(var7, var8 + 1, 5627, 128);
            }
            if (arg4 == 3) {
                this.method421(var7, var8, 5627, 32);
                this.method421(var7 - 1, var8, 5627, 2);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method421(var7, var8, 5627, 1);
                this.method421(var7 + 1, var8 + -1, 5627, 16);
            }
            if (arg4 == 1) {
                this.method421(var7, var8, 5627, 4);
                this.method421(var7 + 1, var8 - -1, 5627, 64);
            }
            if (arg4 == 2) {
                this.method421(var7, var8, 5627, 16);
                this.method421(var7 - 1, var8 + 1, 5627, 1);
            }
            if (arg4 == 3) {
                this.method421(var7, var8, 5627, 64);
                this.method421(var7 - 1, var8 + -1, 5627, 4);
            }
        }
        if (arg3 == 2) {
            if (arg4 == 0) {
                this.method421(var7, var8, 5627, 130);
                this.method421(var7, var8 - 1, 5627, 8);
                this.method421(var7 + 1, var8, 5627, 32);
            }
            if (arg4 == 1) {
                this.method421(var7, var8, 5627, 10);
                this.method421(var7 + 1, var8, 5627, 32);
                this.method421(var7, var8 + 1, 5627, 128);
            }
            if (arg4 == 2) {
                this.method421(var7, var8, 5627, 40);
                this.method421(var7, var8 + 1, 5627, 128);
                this.method421(var7 - 1, var8, 5627, 2);
            }
            if (arg4 == 3) {
                this.method421(var7, var8, 5627, 160);
                this.method421(var7 - 1, var8, 5627, 2);
                this.method421(var7, var8 - 1, 5627, 8);
            }
        }
        if (!arg2) {
            return;
        }
        if (arg3 == 0) {
            if (arg4 == 0) {
                this.method421(var7, var8, 5627, 65536);
                this.method421(var7, var8 - 1, 5627, 4096);
            }
            if (arg4 == 1) {
                this.method421(var7, var8, 5627, 1024);
                this.method421(var7 + 1, var8, 5627, 16384);
            }
            if (arg4 == 2) {
                this.method421(var7, var8, 5627, 4096);
                this.method421(var7, var8 + 1, 5627, 65536);
            }
            if (arg4 == 3) {
                this.method421(var7, var8, 5627, 16384);
                this.method421(var7 - 1, var8, 5627, 1024);
            }
        }
        if (arg3 == 1 || arg3 == 3) {
            if (arg4 == 0) {
                this.method421(var7, var8, 5627, 512);
                this.method421(var7 + 1, var8 + -1, 5627, 8192);
            }
            if (arg4 == 1) {
                this.method421(var7, var8, 5627, 2048);
                this.method421(var7 + 1, var8 + 1, 5627, 32768);
            }
            if (arg4 == 2) {
                this.method421(var7, var8, 5627, 8192);
                this.method421(var7 - 1, var8 + 1, 5627, 512);
            }
            if (arg4 == 3) {
                this.method421(var7, var8, 5627, 32768);
                this.method421(var7 - 1, var8 + -1, 5627, 2048);
            }
        }
        if (arg3 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method421(var7, var8, 5627, 66560);
            this.method421(var7, var8 - 1, 5627, 4096);
            this.method421(var7 + 1, var8, 5627, 16384);
        }
        if (arg4 == 1) {
            this.method421(var7, var8, 5627, 5120);
            this.method421(var7 + 1, var8, 5627, 16384);
            this.method421(var7, var8 + 1, 5627, 65536);
        }
        if (arg4 == 2) {
            this.method421(var7, var8, 5627, 20480);
            this.method421(var7, var8 + 1, 5627, 65536);
            this.method421(var7 - 1, var8, 5627, 1024);
        }
        if (arg4 == 3) {
            this.method421(var7, var8, 5627, 81920);
            this.method421(var7 - 1, var8, 5627, 1024);
            this.method421(var7, var8 - 1, 5627, 4096);
            return;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V")
    private final void method415(int arg0, int arg1, int arg2, int arg3) {
        field1279++;
        this.field1267[arg0][arg1] = class49.method351(this.field1267[arg0][arg1], arg2);
        int var5 = 88 % ((-arg3 - 27) / 39);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)Z")
    public static final boolean method416(boolean arg0) {
        long var1 = class60.method432(arg0);
        field1251++;
        int var3 = (int) (var1 - class100.field2331);
        if (var3 > 200) {
            var3 = 200;
        }
        class100.field2331 = var1;
        class132.field3081 += var3;
        if (class77.field1706 == 0 && class127.field2997 == 0 && class11.field237 == 0 && class137.field3136 == 0) {
            return true;
        } else if (class139.field3225 == null) {
            return false;
        } else {
            try {
                if (class132.field3081 > 30000) {
                    throw new IOException();
                }
                while (class127.field2997 < 20 && class137.field3136 > 0) {
                    class38 var4 = (class38) class116.field2752.method871(-16);
                    class109 var5 = new class109(4);
                    var5.method837(-86, 1);
                    var5.method806((int) var4.field2490, (byte) 121);
                    class139.field3225.method440(0, 4, !arg0, var5.field2547);
                    class103.field2397.method873(var4.field2490, 121, var4);
                    class127.field2997++;
                    class137.field3136--;
                }
                while (class77.field1706 < 20 && class11.field237 > 0) {
                    class38 var6 = (class38) class32.field680.method56((byte) 76);
                    class109 var7 = new class109(4);
                    var7.method837(101, 0);
                    var7.method806((int) var6.field2490, (byte) 108);
                    class139.field3225.method440(0, 4, false, var7.field2547);
                    var6.method923(10);
                    class72.field1536.method873(var6.field2490, 122, var6);
                    class77.field1706++;
                    class11.field237--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class139.field3225.method438(90);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    byte var10 = 0;
                    class132.field3081 = 0;
                    if (class7.field137 == null) {
                        var10 = 8;
                    } else if (class128.field3015 == 0) {
                        var10 = 1;
                    }
                    if (var10 <= 0) {
                        int var11 = class24.field580.field2547.length - class7.field137.field839;
                        int var12 = 512 - class128.field3015;
                        if (var11 - class24.field580.field2583 < var12) {
                            var12 = var11 - class24.field580.field2583;
                        }
                        if (var9 < var12) {
                            var12 = var9;
                        }
                        class139.field3225.method441(5000, class24.field580.field2583, class24.field580.field2547, var12);
                        if (class40.field887 != 0) {
                            for (int var13 = 0; var13 < var12; var13++) {
                                class24.field580.field2547[class24.field580.field2583 + var13] = (byte) class77.method571(class24.field580.field2547[class24.field580.field2583 + var13], class40.field887);
                            }
                        }
                        class128.field3015 += var12;
                        class24.field580.field2583 += var12;
                        if (class24.field580.field2583 == var11) {
                            if (class7.field137.field2490 == 16711935L) {
                                class91.field2147 = class24.field580;
                                for (int var15 = 0; var15 < 256; var15++) {
                                    class39 var16 = class30.field664[var15];
                                    if (var16 != null) {
                                        class91.field2147.field2583 = var15 * 4 + 5;
                                        int var17 = class91.field2147.method832(14722);
                                        var16.method281(var17, (byte) 0);
                                    }
                                }
                            } else {
                                class141.field3268.reset();
                                class141.field3268.update(class24.field580.field2547, 0, var11);
                                int var14 = (int) class141.field3268.getValue();
                                if (class7.field137.field845 != var14) {
                                    try {
                                        class139.field3225.method434(127);
                                    } catch (Exception var29) {
                                    }
                                    class139.field3225 = null;
                                    class75.field1696++;
                                    class40.field887 = (byte) (Math.random() * 255.0D + 1.0D);
                                    return false;
                                }
                                class75.field1696 = 0;
                                class24.field579 = 0;
                                class7.field137.field832.method277(class24.field580.field2547, (byte) -45, (int) (class7.field137.field2490 & 0xFFFFL), (class7.field137.field2490 & 0xFF0000L) == 16711680L, class64.field1355);
                            }
                            class7.field137.method776(0);
                            class128.field3015 = 0;
                            if (class64.field1355) {
                                class127.field2997--;
                            } else {
                                class77.field1706--;
                            }
                            class24.field580 = null;
                            class7.field137 = null;
                        } else {
                            if (class128.field3015 != 512) {
                                break;
                            }
                            class128.field3015 = 0;
                        }
                    } else {
                        int var18 = var10 - class40.field888.field2583;
                        if (var9 < var18) {
                            var18 = var9;
                        }
                        class139.field3225.method441(5000, class40.field888.field2583, class40.field888.field2547, var18);
                        if (class40.field887 != 0) {
                            for (int var19 = 0; var19 < var18; var19++) {
                                class40.field888.field2547[class40.field888.field2583 + var19] = (byte) class77.method571(class40.field888.field2547[class40.field888.field2583 + var19], class40.field887);
                            }
                        }
                        class40.field888.field2583 += var18;
                        if (var10 > class40.field888.field2583) {
                            break;
                        }
                        if (class7.field137 == null) {
                            class40.field888.field2583 = 0;
                            int var20 = class40.field888.method838(255);
                            int var21 = class40.field888.method835(2);
                            long var22 = (long) ((var20 << 16) + var21);
                            int var24 = class40.field888.method838(255);
                            int var25 = class40.field888.method832(14722);
                            class38 var26 = (class38) class103.field2397.method867(var22, false);
                            class64.field1355 = true;
                            if (var26 == null) {
                                var26 = (class38) class72.field1536.method867(var22, false);
                                class64.field1355 = false;
                            }
                            if (var26 == null) {
                                throw new IOException();
                            }
                            class7.field137 = var26;
                            int var27 = var24 == 0 ? 5 : 9;
                            class24.field580 = new class109(var25 + var27 + class7.field137.field839);
                            class24.field580.method837(-85, var24);
                            class24.field580.method817(-2770, var25);
                            class128.field3015 = 8;
                            class40.field888.field2583 = 0;
                        } else if (class128.field3015 == 0) {
                            if (class40.field888.field2547[0] == -1) {
                                class128.field3015 = 1;
                                class40.field888.field2583 = 0;
                            } else {
                                class7.field137 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var30) {
                try {
                    class139.field3225.method434(105);
                } catch (Exception var28) {
                }
                class24.field579++;
                class139.field3225 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static final void method417(int arg0) {
        int var1 = -112 % ((arg0 - 63) / 58);
        field1260++;
        if (class48.field1071 != null) {
            class84 var2 = class48.field1071;
            synchronized (class48.field1071) {
                class48.field1071 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BII)V")
    public final void method418(byte arg0, int arg1, int arg2) {
        if (arg0 != 53) {
            this.field1262 = 107;
        }
        int var4 = arg1 - this.field1265;
        int var5 = arg2 - this.field1262;
        field1268++;
        this.field1267[var4][var5] = class45.method323(this.field1267[var4][var5], 14680063);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIZZI)V")
    public final void method419(int arg0, int arg1, int arg2, boolean arg3, boolean arg4, int arg5) {
        field1257++;
        int var7 = arg5 - this.field1265;
        if (arg4) {
            this.method419(118, -124, -102, true, true, -98);
        }
        int var8 = arg2 - this.field1262;
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method415(var7, var8, 128, 89);
                this.method415(var7 - 1, var8, 8, 50);
            }
            if (arg1 == 1) {
                this.method415(var7, var8, 2, 28);
                this.method415(var7, var8 + 1, 32, 61);
            }
            if (arg1 == 2) {
                this.method415(var7, var8, 8, -114);
                this.method415(var7 + 1, var8, 128, -100);
            }
            if (arg1 == 3) {
                this.method415(var7, var8, 32, -108);
                this.method415(var7, var8 - 1, 2, 81);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method415(var7, var8, 1, -118);
                this.method415(var7 - 1, var8 + 1, 16, -99);
            }
            if (arg1 == 1) {
                this.method415(var7, var8, 4, 47);
                this.method415(var7 + 1, var8 + 1, 64, -89);
            }
            if (arg1 == 2) {
                this.method415(var7, var8, 16, 126);
                this.method415(var7 + 1, var8 - 1, 1, 93);
            }
            if (arg1 == 3) {
                this.method415(var7, var8, 64, 68);
                this.method415(var7 - 1, var8 + -1, 4, -105);
            }
        }
        if (arg0 == 2) {
            if (arg1 == 0) {
                this.method415(var7, var8, 130, 117);
                this.method415(var7 - 1, var8, 8, -71);
                this.method415(var7, var8 + 1, 32, 127);
            }
            if (arg1 == 1) {
                this.method415(var7, var8, 10, -104);
                this.method415(var7, var8 + 1, 32, -88);
                this.method415(var7 + 1, var8, 128, -75);
            }
            if (arg1 == 2) {
                this.method415(var7, var8, 40, -80);
                this.method415(var7 + 1, var8, 128, 50);
                this.method415(var7, var8 - 1, 2, -118);
            }
            if (arg1 == 3) {
                this.method415(var7, var8, 160, 118);
                this.method415(var7, var8 - 1, 2, 53);
                this.method415(var7 - 1, var8, 8, -68);
            }
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg1 == 0) {
                this.method415(var7, var8, 65536, 108);
                this.method415(var7 - 1, var8, 4096, 19);
            }
            if (arg1 == 1) {
                this.method415(var7, var8, 1024, -82);
                this.method415(var7, var8 + 1, 16384, -116);
            }
            if (arg1 == 2) {
                this.method415(var7, var8, 4096, -96);
                this.method415(var7 + 1, var8, 65536, 119);
            }
            if (arg1 == 3) {
                this.method415(var7, var8, 16384, 70);
                this.method415(var7, var8 - 1, 1024, -127);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg1 == 0) {
                this.method415(var7, var8, 512, -114);
                this.method415(var7 - 1, var8 + 1, 8192, -88);
            }
            if (arg1 == 1) {
                this.method415(var7, var8, 2048, 73);
                this.method415(var7 + 1, var8 - -1, 32768, 107);
            }
            if (arg1 == 2) {
                this.method415(var7, var8, 8192, -89);
                this.method415(var7 + 1, var8 - 1, 512, 125);
            }
            if (arg1 == 3) {
                this.method415(var7, var8, 32768, -96);
                this.method415(var7 - 1, var8 + -1, 2048, -103);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg1 == 0) {
            this.method415(var7, var8, 66560, -123);
            this.method415(var7 - 1, var8, 4096, 92);
            this.method415(var7, var8 + 1, 16384, 94);
        }
        if (arg1 == 1) {
            this.method415(var7, var8, 5120, 59);
            this.method415(var7, var8 + 1, 16384, -121);
            this.method415(var7 + 1, var8, 65536, 35);
        }
        if (arg1 == 2) {
            this.method415(var7, var8, 20480, -106);
            this.method415(var7 + 1, var8, 65536, 39);
            this.method415(var7, var8 - 1, 1024, 22);
        }
        if (arg1 == 3) {
            this.method415(var7, var8, 81920, -121);
            this.method415(var7, var8 - 1, 1024, -106);
            this.method415(var7 - 1, var8, 4096, 60);
            return;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIZBII)V")
    public final void method420(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5, int arg6) {
        int var8 = arg0 - this.field1262;
        int var9 = arg2 - this.field1265;
        field1261++;
        if (arg5 == 1 || arg5 == 3) {
            int var10 = arg6;
            arg6 = arg1;
            arg1 = var10;
        }
        int var11 = 256;
        if (arg3) {
            var11 += 131072;
        }
        for (int var12 = var9; var12 < var9 + arg6; var12++) {
            if (var12 >= 0 && this.field1263 > var12) {
                for (int var13 = var8; var13 < arg1 + var8; var13++) {
                    if (var13 >= 0 && var13 < this.field1277) {
                        this.method421(var13, var12, 5627, var11);
                    }
                }
            }
        }
        if (arg4 > -81) {
            field1259 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIII)V")
    private final void method421(int arg0, int arg1, int arg2, int arg3) {
        this.field1267[arg1][arg0] = class45.method323(this.field1267[arg1][arg0], 16777215 - arg3);
        if (arg2 != 5627) {
            this.method420(-26, -1, 121, true, (byte) 90, 60, 27);
        }
        field1281++;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public static void method422(int arg0) {
        field1266 = null;
        field1259 = null;
        field1272 = null;
        field1273 = null;
        field1282 = null;
        field1255 = null;
        int var1 = -36 / ((arg0 + 49) / 48);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)V")
    public final void method423(int arg0, int arg1, int arg2) {
        int var4 = arg0 - this.field1265;
        int var5 = arg2 - this.field1262;
        field1276++;
        if (arg1 > -37) {
            method427(38);
        }
        this.field1267[var4][var5] = class49.method351(this.field1267[var4][var5], 2097152);
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IIIIIII)Z")
    public final boolean method424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1258++;
        if (arg1 == arg4 && arg5 == arg6) {
            return true;
        }
        int var8 = arg6 - this.field1262;
        if (arg3 != 16711935) {
            field1259 = null;
        }
        int var9 = arg1 - this.field1265;
        int var10 = arg4 - this.field1265;
        int var11 = arg5 - this.field1262;
        if (arg2 == 6 || arg2 == 7) {
            if (arg2 == 7) {
                arg0 = arg0 + 2 & 0x3;
            }
            if (arg0 == 0) {
                if (var9 + 1 == var10 && var8 == var11 && (this.field1267[var10][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field1267[var10][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 1) {
                if (var9 - 1 == var10 && var8 == var11 && (this.field1267[var10][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 - 1 == var8 && (this.field1267[var10][var8] & 0x2) == 0) {
                    return true;
                }
            } else if (arg0 == 2) {
                if (var9 - 1 == var10 && var8 == var11 && (this.field1267[var10][var8] & 0x8) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field1267[var10][var8] & 0x20) == 0) {
                    return true;
                }
            } else if (arg0 == 3) {
                if (var9 + 1 == var10 && var8 == var11 && (this.field1267[var10][var8] & 0x80) == 0) {
                    return true;
                }
                if (var9 == var10 && var11 + 1 == var8 && (this.field1267[var10][var8] & 0x20) == 0) {
                    return true;
                }
            }
        }
        if (arg2 == 8) {
            if (var9 == var10 && var11 + 1 == var8 && (this.field1267[var10][var8] & 0x20) == 0) {
                return true;
            }
            if (var9 == var10 && var11 - 1 == var8 && (this.field1267[var10][var8] & 0x2) == 0) {
                return true;
            }
            if (var9 - 1 == var10 && var8 == var11 && (this.field1267[var10][var8] & 0x8) == 0) {
                return true;
            }
            if (var9 + 1 == var10 && var8 == var11 && (this.field1267[var10][var8] & 0x80) == 0) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZZIIIII)V")
    public final void method425(boolean arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1254++;
        int var8 = arg5 - this.field1262;
        if (arg4 == 1 || arg4 == 3) {
            int var9 = arg3;
            arg3 = arg6;
            arg6 = var9;
        }
        int var10 = arg2 - this.field1265;
        int var11 = 256;
        if (arg1) {
            var11 += 131072;
        }
        for (int var12 = var10; var12 < arg3 + var10; var12++) {
            if (var12 >= 0 && this.field1263 > var12) {
                for (int var13 = var8; var13 < arg6 + var8; var13++) {
                    if (var13 >= 0 && var13 < this.field1277) {
                        this.method415(var12, var13, var11, -75);
                    }
                }
            }
        }
        if (arg0) {
            method427(47);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIBI)Z")
    public final boolean method426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field1275++;
        int var9 = arg1 + arg3 - 1;
        int var10 = arg0 + arg7 - 1;
        if (arg1 <= arg5 && arg5 <= var9 && arg0 <= arg4 && var10 >= arg4) {
            return true;
        } else if (arg1 - 1 == arg5 && arg4 >= arg0 && arg4 <= var10 && (this.field1267[arg5 - this.field1265][arg4 - this.field1262] & 0x8) == 0 && (arg2 & 0x8) == 0) {
            return true;
        } else {
            int var11 = 54 % ((arg6 - 55) / 34);
            if (var9 + 1 == arg5 && arg0 <= arg4 && var10 >= arg4 && (this.field1267[arg5 - this.field1265][arg4 - this.field1262] & 0x80) == 0 && (arg2 & 0x2) == 0) {
                return true;
            } else if (arg0 - 1 == arg4 && arg5 >= arg1 && var9 >= arg5 && (this.field1267[arg5 - this.field1265][arg4 - this.field1262] & 0x2) == 0 && (arg2 & 0x4) == 0) {
                return true;
            } else {
                return var10 + 1 == arg4 && arg5 >= arg1 && var9 >= arg5 && (this.field1267[arg5 - this.field1265][arg4 - this.field1262] & 0x20) == 0 && (arg2 & 0x1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
    public static final void method427(int arg0) {
        class83.field1858 = null;
        field1280++;
        class126.field2949 = null;
        class105.field2456 = null;
        if (arg0 != 0) {
            field1252 = -39;
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(II)V")
    public class59(int arg0, int arg1) {
        this.field1263 = arg0;
        this.field1277 = arg1;
        this.field1267 = new int[this.field1263][this.field1277];
        this.method428((byte) -66);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public final void method428(byte arg0) {
        field1269++;
        if (arg0 > -21) {
            return;
        }
        for (int var2 = 0; var2 < this.field1263; var2++) {
            for (int var3 = 0; var3 < this.field1277; var3++) {
                if (var2 == 0 || var3 == 0 || this.field1263 - 1 == var2 || this.field1277 - 1 == var3) {
                    this.field1267[var2][var3] = 16777215;
                } else {
                    this.field1267[var2][var3] = 16777216;
                }
            }
        }
    }
}
