import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class17 {

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field351 = 0;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "Lie;")
    public static class53 field356 = new class53();

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "[I")
    public static int[] field358 = new int[256];

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field359 = 0;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "Lke;")
    private static class65 field361;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "Lke;")
    public static class65 field360;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "Lke;")
    public static class65 field362;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "Lke;")
    public static class65 field363;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "Lke;")
    public static class65 field364;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "J")
    public long field349;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "Lcd;")
    public class17 field353;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "Lcd;")
    public class17 field354;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "Ljd;")
    public static class58 field366;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field358[var0] = var1;
        }
        field361 = class1.method17("Please try again)3", -128);
        field360 = class1.method17("Sie befinden sich in einem Mitglieder)2Gebiet(Q", -117);
        field362 = field361;
        field363 = class1.method17("Fehler beim Laden Ihres Charakter)2Profils", -113);
        field364 = class1.method17("blinken3:", -124);
        field365 = (int) (Math.random() * 17.0D) - 8;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 8)
    public static final void method126(int arg0) {
        if (arg0 != 19789) {
            field362 = null;
        }
        if (class52.field1327 != null) {
            class101 var1 = class52.field1327;
            synchronized (class52.field1327) {
                class52.field1327 = null;
            }
        }
        field352++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)Z", line = 38)
    public static final boolean method127(int arg0, int arg1) {
        field357++;
        if (!class28.method232(arg0, true)) {
            return false;
        }
        class27[] var2 = class88.field2361[arg0];
        boolean var3 = false;
        int var4 = 0;
        int var5 = -27 / ((71 - arg1) / 35);
        while (var2.length > var4) {
            class27 var6 = var2[var4];
            if (var6 != null && var6.field671 == 6) {
                if (var6.field721 != -1 || var6.field684 != -1) {
                    boolean var7 = class92.method802((byte) 42, var6);
                    int var8;
                    if (var7) {
                        var8 = var6.field684;
                    } else {
                        var8 = var6.field721;
                    }
                    if (var8 != -1) {
                        class1 var9 = class80.method702(127, var8);
                        var6.field674 += class22.field524;
                        label51: while (true) {
                            do {
                                do {
                                    if (var9.field24[var6.field657] >= var6.field674) {
                                        break label51;
                                    }
                                    var3 = true;
                                    var6.field674 -= var9.field24[var6.field657];
                                    var6.field657++;
                                } while (var9.field21.length > var6.field657);
                                var6.field657 -= var9.field6;
                            } while (var6.field657 >= 0 && var6.field657 < var9.field21.length);
                            var6.field657 = 0;
                        }
                    }
                }
                if (var6.field729 != 0) {
                    int var10 = var6.field729 << 16 >> 16;
                    int var11 = var6.field729 >> 16;
                    var3 = true;
                    int var12 = class22.field524 * var10;
                    var6.field707 = var6.field707 + var12 & 0x7FF;
                    int var13 = class22.field524 * var11;
                    var6.field663 = var6.field663 + var13 & 0x7FF;
                }
            }
            var4++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZILjd;)Lkb;", line = 119)
    public static final class61 method128(int arg0, boolean arg1, int arg2, class58 arg3) {
        field346++;
        if (class97.method811(4, arg2, arg3, arg0)) {
            if (arg1) {
                field365 = -61;
            }
            return class27.method221(-1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V", line = 138)
    public static final void method129(byte arg0) {
        class113.field2823 = -1;
        int var1 = -76 % ((18 - arg0) / 63);
        class56.field1453.field998 = 0;
        class13.field277 = 0;
        class7.field144 = -1;
        class126.field3057 = 0;
        class24.field614 = false;
        class58.field1575.field998 = 0;
        class1.field41 = -1;
        class52.field1317 = 0;
        class123.field2995 = -1;
        field347++;
        class125.field3040 = 0;
        class54.field1392 = 0;
        class13.field283 = 0;
        class75.method663((byte) -122, 30);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIZII)V", line = 161)
    public static final void method130(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field348++;
        int var6 = class89.field2377.method614(arg0, arg1, arg2);
        if (var6 != 0) {
            int var7 = class89.field2377.method608(arg0, arg1, arg2, var6);
            int var8 = var7 & 0x1F;
            int var9 = var6 >> 14 & 0x7FFF;
            int var10 = var7 >> 6 & 0x3;
            int var11 = arg5;
            int[] var12 = class48.field1246.field1623;
            if (var6 > 0) {
                var11 = arg4;
            }
            int var13 = (52736 - arg2 * 512) * 4 + arg1 * 4 + 24624;
            class19 var14 = class54.method435(32247, var9);
            if (var14.field424 == -1) {
                if (var8 == 0 || var8 == 2) {
                    if (var10 == 0) {
                        var12[var13] = var11;
                        var12[var13 + 512] = var11;
                        var12[var13 + 1024] = var11;
                        var12[var13 + 1536] = var11;
                    } else if (var10 == 1) {
                        var12[var13] = var11;
                        var12[var13 + 1] = var11;
                        var12[var13 + 2] = var11;
                        var12[var13 + 3] = var11;
                    } else if (var10 == 2) {
                        var12[var13 + 3] = var11;
                        var12[var13 + 3 + 512] = var11;
                        var12[var13 + 3 + 1024] = var11;
                        var12[var13 + 1536 + 3] = var11;
                    } else if (var10 == 3) {
                        var12[var13 + 1536] = var11;
                        var12[var13 + 1 + 1536] = var11;
                        var12[var13 + 1536 + 2] = var11;
                        var12[var13 + 1539] = var11;
                    }
                }
                if (var8 == 3) {
                    if (var10 == 0) {
                        var12[var13] = var11;
                    } else if (var10 == 1) {
                        var12[var13 + 3] = var11;
                    } else if (var10 == 2) {
                        var12[var13 + 3 + 1536] = var11;
                    } else if (var10 == 3) {
                        var12[var13 + 1536] = var11;
                    }
                }
                if (var8 == 2) {
                    if (var10 == 3) {
                        var12[var13] = var11;
                        var12[var13 + 512] = var11;
                        var12[var13 + 1024] = var11;
                        var12[var13 + 1536] = var11;
                    } else if (var10 == 0) {
                        var12[var13] = var11;
                        var12[var13 + 1] = var11;
                        var12[var13 + 2] = var11;
                        var12[var13 + 3] = var11;
                    } else if (var10 == 1) {
                        var12[var13 + 3] = var11;
                        var12[var13 + 3 + 512] = var11;
                        var12[var13 + 1027] = var11;
                        var12[var13 + 1536 + 3] = var11;
                    } else if (var10 == 2) {
                        var12[var13 + 1536] = var11;
                        var12[var13 + 1 + 1536] = var11;
                        var12[var13 + 1536 + 2] = var11;
                        var12[var13 + 1536 + 3] = var11;
                    }
                }
            } else {
                class119 var15 = class99.field2575[var14.field424];
                if (var15 != null) {
                    int var16 = (var14.field415 * 4 - var15.field2954) / 2;
                    int var17 = (var14.field432 * 4 - var15.field2949) / 2;
                    var15.method963(arg1 * 4 + var16 + 48, 48 - -((-var14.field432 + -arg2 + 104) * 4) + var17);
                }
            }
        }
        int var18 = class89.field2377.method619(arg0, arg1, arg2);
        if (var18 != 0) {
            int var19 = class89.field2377.method608(arg0, arg1, arg2, var18);
            int var20 = var19 & 0x1F;
            int var21 = var19 >> 6 & 0x3;
            int var22 = var18 >> 14 & 0x7FFF;
            class19 var23 = class54.method435(32247, var22);
            if (var23.field424 != -1) {
                class119 var24 = class99.field2575[var23.field424];
                if (var24 != null) {
                    int var25 = (var23.field432 * 4 - var24.field2949) / 2;
                    int var26 = (var23.field415 * 4 - var24.field2954) / 2;
                    var24.method963(arg1 * 4 + var26 + 48, (104 - var23.field432 + -arg2) * 4 + 48 + var25);
                }
            } else if (var20 == 9) {
                int[] var27 = class48.field1246.field1623;
                int var28 = 15658734;
                if (var18 > 0) {
                    var28 = 15597568;
                }
                int var29 = arg1 * 4 + (52736 - arg2 * 512) * 4 + 24624;
                if (var21 == 0 || var21 == 2) {
                    var27[var29 + 1536] = var28;
                    var27[var29 + 1024 + 1] = var28;
                    var27[var29 + 514] = var28;
                    var27[var29 + 3] = var28;
                } else {
                    var27[var29] = var28;
                    var27[var29 + 512 + 1] = var28;
                    var27[var29 + 1024 + 2] = var28;
                    var27[var29 + 1536 + 3] = var28;
                }
            }
        }
        if (!arg3) {
            field363 = null;
        }
        int var30 = class89.field2377.method585(arg0, arg1, arg2);
        if (var30 == 0) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class19 var32 = class54.method435(32247, var31);
        if (var32.field424 == -1) {
            return;
        }
        class119 var33 = class99.field2575[var32.field424];
        if (var33 != null) {
            int var34 = (var32.field415 * 4 - var33.field2954) / 2;
            int var35 = (var32.field432 * 4 - var33.field2949) / 2;
            var33.method963(arg1 * 4 + var34 + 48, (104 - arg2 + -var32.field432) * 4 + 48 + var35);
            return;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V", line = 407)
    public static void method131(byte arg0) {
        field364 = null;
        field361 = null;
        field362 = null;
        field360 = null;
        field356 = null;
        field366 = null;
        field363 = null;
        if (arg0 == -96) {
            field358 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILjd;)V", line = 425)
    public static final void method132(int arg0, class58 arg1) {
        class62.field1630 = arg1;
        field345++;
        if (arg0 != 28386) {
            method129((byte) -48);
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V", line = 439)
    public final void method133(int arg0) {
        field355++;
        if (this.field354 == null) {
            return;
        }
        this.field354.field353 = this.field353;
        if (arg0 != 2) {
            method126(-35);
        }
        this.field353.field354 = this.field354;
        this.field354 = null;
        this.field353 = null;
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)Z", line = 458)
    public final boolean method134(byte arg0) {
        field350++;
        if (this.field354 == null) {
            return false;
        } else {
            int var2 = 52 % ((arg0 - 30) / 52);
            return true;
        }
    }
}
