import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class164 {

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "Lee;")
    private class195 field2402 = new class195();

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "Lee;")
    private class195 field2406 = new class195();

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "Lee;")
    private class195 field2407 = new class195();

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "Lee;")
    private class195 field2408 = new class195();

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "Lca;")
    private class54 field2412 = new class54(4);

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "B")
    private byte field2413 = 0;

    @OriginalMember(owner = "client!ol", name = "F", descriptor = "I")
    public volatile int field2416 = 0;

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "I")
    public volatile int field2415 = 0;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "Lca;")
    private class54 field2414 = new class54(8);

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "[S")
    public static short[] field2395 = new short[256];

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "[Z")
    public static boolean[] field2392 = new boolean[100];

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public static int field2394 = 0;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public static int field2398 = -2;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "I")
    public static int field2405 = 2;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "I")
    private int field2410;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "J")
    private long field2411;

    @OriginalMember(owner = "client!ol", name = "G", descriptor = "Lbh;")
    private class172 field2417;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "Lpe;")
    private class253 field2409;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "[[[B")
    public static byte[][][] field2403;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public static void method1109(int arg0) {
        field2403 = null;
        field2395 = null;
        if (arg0 == 200) {
            field2392 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)V")
    public final void method1110(boolean arg0) {
        if (this.field2409 != null) {
            this.field2409.method1718(-17492);
        }
        field2396++;
        if (!arg0) {
            field2392 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
    public final void method1111(int arg0) {
        field2393++;
        if (arg0 < 86) {
            this.field2402 = null;
        }
        try {
            this.field2409.method1718(-17492);
        } catch (Exception var2) {
        }
        this.field2409 = null;
        this.field2413 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field2416++;
        this.field2415 = -1;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BZLpe;)V")
    public final void method1112(byte arg0, boolean arg1, class253 arg2) {
        if (arg0 != -42) {
            return;
        }
        field2387++;
        if (this.field2409 != null) {
            try {
                this.field2409.method1718(-17492);
            } catch (Exception var8) {
            }
            this.field2409 = null;
        }
        this.field2409 = arg2;
        this.method1120(0);
        this.method1119((byte) -55, arg1);
        this.field2414.field887 = 0;
        this.field2417 = null;
        while (true) {
            class172 var4 = (class172) this.field2406.method1312((byte) -88);
            if (var4 == null) {
                while (true) {
                    class172 var5 = (class172) this.field2408.method1312((byte) -118);
                    if (var5 == null) {
                        if (this.field2413 != 0) {
                            try {
                                this.field2412.field887 = 0;
                                this.field2412.method437(true, 4);
                                this.field2412.method437(true, this.field2413);
                                this.field2412.method428(0, (byte) 46);
                                this.field2409.method1715(this.field2412.field848, arg0 + 160, 0, 4);
                            } catch (IOException var7) {
                                try {
                                    this.field2409.method1718(-17492);
                                } catch (Exception var6) {
                                }
                                this.field2409 = null;
                                this.field2415 = -2;
                                this.field2416++;
                            }
                        }
                        this.field2410 = 0;
                        this.field2411 = class257.method1736(14361);
                        return;
                    }
                    this.field2407.method1315((byte) -48, var5);
                }
            }
            this.field2402.method1315((byte) -48, var4);
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)Z")
    public final boolean method1113(int arg0) {
        field2400++;
        if (arg0 != -30921) {
            field2395 = null;
        }
        return this.method1123(false) >= 20;
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)V")
    public final void method1114(int arg0) {
        if (arg0 != 23271) {
            field2398 = -116;
        }
        field2391++;
        if (this.field2409 != null) {
            this.field2409.method1722(arg0 - 23145);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIBZI)Lbh;")
    public final class172 method1115(int arg0, int arg1, byte arg2, boolean arg3, int arg4) {
        field2386++;
        if (arg0 >= -29) {
            this.field2406 = null;
        }
        class172 var6 = new class172();
        var6.field2522 = arg2;
        var6.field1578 = arg3;
        long var7 = (long) ((arg4 << 16) + arg1);
        var6.field3978 = var7;
        if (arg3) {
            if (this.method1123(false) >= 20) {
                throw new RuntimeException();
            }
            this.field2402.method1315((byte) -48, var6);
        } else if (this.method1116(-1) < 20) {
            this.field2407.method1315((byte) -48, var6);
        } else {
            throw new RuntimeException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "(I)I")
    private final int method1116(int arg0) {
        field2404++;
        return arg0 == -1 ? this.field2407.method1313(27920) + this.field2408.method1313(27920) : 22;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(Z)Z")
    public final boolean method1117(boolean arg0) {
        field2389++;
        if (this.field2409 != null) {
            long var2 = class257.method1736(14361);
            int var4 = (int) (var2 - this.field2411);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field2411 = var2;
            this.field2410 += var4;
            if (this.field2410 > 30000) {
                try {
                    this.field2409.method1718(-17492);
                } catch (Exception var27) {
                }
                this.field2409 = null;
            }
        }
        if (this.field2409 == null) {
            return this.method1123(false) == 0 && this.method1116(-1) == 0;
        } else if (arg0) {
            return true;
        } else {
            try {
                this.field2409.method1717(128);
                for (class172 var5 = (class172) this.field2402.method1318((byte) -104); var5 != null; var5 = (class172) this.field2402.method1317(-3668)) {
                    this.field2412.field887 = 0;
                    this.field2412.method437(true, 1);
                    this.field2412.method444((byte) -128, (int) var5.field3978);
                    this.field2409.method1715(this.field2412.field848, 117, 0, 4);
                    this.field2406.method1315((byte) -48, var5);
                }
                for (class172 var6 = (class172) this.field2407.method1318((byte) -88); var6 != null; var6 = (class172) this.field2407.method1317(-3668)) {
                    this.field2412.field887 = 0;
                    this.field2412.method437(true, 0);
                    this.field2412.method444((byte) -127, (int) var6.field3978);
                    this.field2409.method1715(this.field2412.field848, 113, 0, 4);
                    this.field2408.method1315((byte) -48, var6);
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = this.field2409.method1725(0);
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    this.field2410 = 0;
                    byte var9 = 0;
                    if (this.field2417 == null) {
                        var9 = 8;
                    } else if (this.field2417.field2520 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - this.field2414.field887;
                        if (var8 < var10) {
                            var10 = var8;
                        }
                        this.field2409.method1723(var10, this.field2414.field848, this.field2414.field887, (byte) -116);
                        if (this.field2413 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                this.field2414.field848[this.field2414.field887 + var11] = (byte) class226.method1551(this.field2414.field848[this.field2414.field887 + var11], this.field2413);
                            }
                        }
                        this.field2414.field887 += var10;
                        if (this.field2414.field887 >= var9) {
                            if (this.field2417 == null) {
                                this.field2414.field887 = 0;
                                int var12 = this.field2414.method407(255);
                                int var13 = this.field2414.method423(120);
                                int var14 = this.field2414.method407(255);
                                int var15 = this.field2414.method420((byte) 37);
                                int var16 = var14 & 0x7F;
                                boolean var17 = (var14 & 0x80) != 0;
                                Object var18 = null;
                                long var19 = (long) ((var12 << 16) + var13);
                                class172 var21;
                                if (var17) {
                                    for (var21 = (class172) this.field2408.method1318((byte) -111); var21 != null && var21.field3978 != var19; var21 = (class172) this.field2408.method1317(-3668)) {
                                    }
                                } else {
                                    for (var21 = (class172) this.field2406.method1318((byte) -123); var21 != null && var21.field3978 != var19; var21 = (class172) this.field2406.method1317(-3668)) {
                                    }
                                }
                                if (var21 == null) {
                                    throw new IOException();
                                }
                                this.field2417 = var21;
                                int var22 = var16 == 0 ? 5 : 9;
                                this.field2417.field2526 = new class54(this.field2417.field2522 + var22 + var15);
                                this.field2417.field2526.method437(!arg0, var16);
                                this.field2417.field2526.method453((byte) 126, var15);
                                this.field2417.field2520 = 8;
                                this.field2414.field887 = 0;
                            } else if (this.field2417.field2520 != 0) {
                                throw new IOException();
                            } else if (this.field2414.field848[0] == -1) {
                                this.field2417.field2520 = 1;
                                this.field2414.field887 = 0;
                            } else {
                                this.field2417 = null;
                            }
                        }
                    } else {
                        int var23 = this.field2417.field2526.field848.length - this.field2417.field2522;
                        int var24 = 512 - this.field2417.field2520;
                        if (var23 - this.field2417.field2526.field887 < var24) {
                            var24 = var23 - this.field2417.field2526.field887;
                        }
                        if (var24 > var8) {
                            var24 = var8;
                        }
                        this.field2409.method1723(var24, this.field2417.field2526.field848, this.field2417.field2526.field887, (byte) -111);
                        if (this.field2413 != 0) {
                            for (int var25 = 0; var25 < var24; var25++) {
                                this.field2417.field2526.field848[this.field2417.field2526.field887 + var25] = (byte) class226.method1551(this.field2417.field2526.field848[this.field2417.field2526.field887 + var25], this.field2413);
                            }
                        }
                        this.field2417.field2520 += var24;
                        this.field2417.field2526.field887 += var24;
                        if (this.field2417.field2526.field887 == var23) {
                            this.field2417.method1746(-90);
                            this.field2417.field1572 = false;
                            this.field2417 = null;
                        } else if (this.field2417.field2520 == 512) {
                            this.field2417.field2520 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var28) {
                try {
                    this.field2409.method1718(-17492);
                } catch (Exception var26) {
                }
                this.field2416++;
                this.field2415 = -2;
                this.field2409 = null;
                return this.method1123(arg0) == 0 && this.method1116(-1) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)Z")
    public final boolean method1118(byte arg0) {
        if (arg0 == -102) {
            field2390++;
            return this.method1116(-1) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BZ)V")
    public final void method1119(byte arg0, boolean arg1) {
        field2385++;
        if (this.field2409 == null) {
            return;
        }
        try {
            this.field2412.field887 = 0;
            if (arg0 > -46) {
                this.field2409 = null;
            }
            this.field2412.method437(true, arg1 ? 2 : 3);
            this.field2412.method444((byte) -126, 0);
            this.field2409.method1715(this.field2412.field848, 109, 0, 4);
        } catch (IOException var4) {
            try {
                this.field2409.method1718(-17492);
            } catch (Exception var3) {
            }
            this.field2416++;
            this.field2415 = -2;
            this.field2409 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "(I)V")
    private final void method1120(int arg0) {
        field2401++;
        if (this.field2409 == null) {
            return;
        }
        try {
            this.field2412.field887 = arg0;
            this.field2412.method437(true, 6);
            this.field2412.method444((byte) -126, 3);
            this.field2409.method1715(this.field2412.field848, 105, 0, 4);
        } catch (IOException var3) {
            try {
                this.field2409.method1718(-17492);
            } catch (Exception var2) {
            }
            this.field2409 = null;
            this.field2415 = -2;
            this.field2416++;
        }
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V")
    public final void method1121(byte arg0) {
        field2388++;
        if (this.field2409 == null) {
            return;
        }
        try {
            this.field2412.field887 = 0;
            this.field2412.method437(true, 7);
            this.field2412.method444((byte) -125, 0);
            int var2 = -42 % ((-arg0 - 13) / 44);
            this.field2409.method1715(this.field2412.field848, 123, 0, 4);
        } catch (IOException var4) {
            try {
                this.field2409.method1718(-17492);
            } catch (Exception var3) {
            }
            this.field2416++;
            this.field2415 = -2;
            this.field2409 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIILjk;II)V")
    public static final void method1122(int arg0, int arg1, int arg2, int arg3, int arg4, class297 arg5, int arg6, int arg7) {
        field2397++;
        if (class12.field184) {
            class45.field781 = 32;
        } else {
            class45.field781 = 0;
        }
        int var8 = -103 / ((arg0 + 37) / 41);
        class12.field184 = false;
        if (class215.field3304 != 0) {
            if (arg3 <= arg6 && (arg3 + 16) > arg6 && arg1 >= arg4 && arg1 < arg4 + 16) {
                arg5.field4594 -= 4;
                class297.method1979((byte) -102, arg5);
            } else if (arg3 <= arg6 && arg6 < (arg3 + 16) && arg1 >= (arg4 - (16 - arg7)) && arg1 < arg4 + arg7) {
                arg5.field4594 += 4;
                class297.method1979((byte) -125, arg5);
            } else if (arg6 >= (arg3 - class45.field781) && arg3 + class45.field781 + 16 > arg6 && (arg4 + 16) <= arg1 && arg1 < arg4 + arg7 - 16) {
                int var9 = (arg7 - 32) * arg7 / arg2;
                if (var9 < 8) {
                    var9 = 8;
                }
                int var10 = arg7 - var9 - 32;
                int var11 = arg1 - arg4 - (var9 / 2) - 16;
                arg5.field4594 = (arg2 - arg7) * var11 / var10;
                class297.method1979((byte) -93, arg5);
                class12.field184 = true;
            }
        }
        if (class136.field1984 == 0) {
            return;
        }
        int var12 = arg5.field4627;
        if ((arg3 - var12) <= arg6 && arg4 <= arg1 && arg6 < (arg3 + 16) && (arg4 + arg7) >= arg1) {
            arg5.field4594 += class136.field1984 * 45;
            class297.method1979((byte) -68, arg5);
            return;
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(Z)I")
    public final int method1123(boolean arg0) {
        field2399++;
        if (arg0) {
            field2403 = null;
        }
        return this.field2402.method1313(27920) + this.field2406.method1313(27920);
    }
}
