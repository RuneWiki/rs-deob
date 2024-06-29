import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class181 {

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public int field2473 = 99;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public int field2481 = -1;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Z")
    public boolean field2482 = false;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public int field2476 = -1;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "I")
    public int field2471 = 5;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "I")
    public int field2478 = -1;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public int field2479 = -1;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public int field2470 = 2;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "Z")
    public boolean field2487 = false;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public int field2488 = -1;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "Z")
    public boolean field2490 = false;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "Z")
    public boolean field2485 = false;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Lmc;")
    public static class78 field2472 = new class78(68, 3);

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "Lgd;")
    public static class206 field2491 = new class206("Loading interfaces - ", "Lade Benutzeroberfläche - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "Lh;")
    public static class434 field2493 = new class434(91, 2);

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public int field2477;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "Lgp;")
    public class35 field2483;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "Lfi;")
    public static class360 field2494;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "Lnk;")
    public static class464 field2492;

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "[I")
    public int[] field2466;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "[I")
    public int[] field2468;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "[I")
    private int[] field2486;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "[Z")
    public boolean[] field2465;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "[[I")
    public int[][] field2464;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lgn;IZIII)Lgn;", line = 5)
    public final class456 method1058(class456 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field2467++;
        int var7 = this.field2466[arg1];
        int var8 = this.field2468[arg1];
        class134 var9 = this.field2483.method263(-16777216, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg0.method1893((byte) 1, arg3, true);
        }
        class134 var11 = null;
        if ((this.field2490 || class293.field3917) && arg5 != -1 && this.field2468.length > arg5) {
            int var12 = this.field2468[arg5];
            var11 = this.field2483.method263(-16777216, var12 >> 16);
            arg5 = var12 & 0xFFFF;
        }
        class134 var13 = null;
        class134 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field2486 != null) {
            if (this.field2486.length > arg1) {
                var15 = this.field2486[arg1];
                if (var15 != 65535) {
                    var13 = this.field2483.method263(-16777216, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field2490 || class293.field3917) && arg5 != -1 && this.field2486.length > arg5) {
                var16 = this.field2486[arg5];
                if (var16 != 65535) {
                    var14 = this.field2483.method263(-16777216, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field2487) {
            arg3 |= 0x200;
        }
        if (var9.method816(255, var10)) {
            arg3 |= 0x80;
        }
        if (var9.method814(var10, (byte) 44)) {
            arg3 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method816(255, var15)) {
                arg3 |= 0x80;
            }
            if (var13.method814(var15, (byte) 25)) {
                arg3 |= 0x100;
            }
        }
        if (var11 != null) {
            if (var11.method816(255, arg5)) {
                arg3 |= 0x80;
            }
            if (var11.method814(arg5, (byte) 124)) {
                arg3 |= 0x100;
            }
        }
        if (var14 != null) {
            if (var14.method816(255, var16)) {
                arg3 |= 0x80;
            }
            if (var14.method814(var16, (byte) 120)) {
                arg3 |= 0x100;
            }
        }
        int var17 = arg3 | 0x20;
        class456 var18 = arg0.method1893((byte) 1, var17, arg2);
        var18.method2680(var7, var11, arg5, (byte) 124, this.field2487, arg4 - 1, var10, var9, 0);
        if (var13 != null) {
            var18.method2680(var7, var14, var16, (byte) 65, this.field2487, arg4 - 1, var15, var13, 0);
        }
        return var18;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IBIIIIBLgn;)Lgn;", line = 133)
    public final class456 method1059(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, class456 arg7) {
        field2484++;
        int var9 = this.field2466[arg2];
        int var10 = this.field2468[arg2];
        class134 var11 = this.field2483.method263(-16777216, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg7.method1893(arg1, arg5, true);
        }
        class134 var13 = null;
        if ((this.field2490 || class293.field3917) && arg0 != -1 && arg0 < this.field2468.length) {
            int var14 = this.field2468[arg0];
            var13 = this.field2483.method263(-16777216, var14 >> 16);
            arg0 = var14 & 0xFFFF;
        }
        if (this.field2487) {
            arg5 |= 0x200;
        }
        if (var11.method816(255, var12)) {
            arg5 |= 0x80;
        }
        if (var11.method814(var12, (byte) 15)) {
            arg5 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method816(255, arg0)) {
                arg5 |= 0x80;
            }
            if (var13.method814(arg0, (byte) 63)) {
                arg5 |= 0x100;
            }
        }
        if (arg6 <= 115) {
            return null;
        } else {
            int var15 = arg5 | 0x20;
            class456 var16 = arg7.method1893(arg1, var15, true);
            var16.method2680(var9, var13, arg0, (byte) 121, this.field2487, arg4 - 1, var12, var11, arg3);
            return var16;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lbt;II)V", line = 193)
    private final void method1060(class32 arg0, int arg1, int arg2) {
        field2489++;
        if (arg2 != -16) {
            return;
        }
        if (arg1 == 1) {
            int var4 = arg0.method215((byte) 107);
            this.field2466 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2466[var5] = arg0.method215((byte) 107);
            }
            this.field2468 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2468[var6] = arg0.method215((byte) 103);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field2468[var7] += arg0.method215((byte) 90) << 16;
            }
        } else if (arg1 == 2) {
            this.field2481 = arg0.method215((byte) 124);
        } else if (arg1 == 3) {
            this.field2465 = new boolean[256];
            int var8 = arg0.method201((byte) -117);
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2465[arg0.method201((byte) -116)] = true;
            }
        } else if (arg1 == 4) {
            this.field2482 = true;
        } else if (arg1 == 5) {
            this.field2471 = arg0.method201((byte) -105);
        } else if (arg1 == 6) {
            this.field2479 = arg0.method215((byte) 126);
        } else if (arg1 == 7) {
            this.field2488 = arg0.method215((byte) 106);
        } else if (arg1 == 8) {
            this.field2473 = arg0.method201((byte) -114);
        } else if (arg1 == 9) {
            this.field2476 = arg0.method201((byte) -120);
        } else if (arg1 == 10) {
            this.field2478 = arg0.method201((byte) -116);
        } else if (arg1 == 11) {
            this.field2470 = arg0.method201((byte) -127);
        } else if (arg1 == 12) {
            int var14 = arg0.method201((byte) -119);
            this.field2486 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field2486[var15] = arg0.method215((byte) 124);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field2486[var16] += arg0.method215((byte) 101) << 16;
            }
        } else if (arg1 == 13) {
            int var10 = arg0.method215((byte) 99);
            this.field2464 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg0.method201((byte) -117);
                if (var12 > 0) {
                    this.field2464[var11] = new int[var12];
                    this.field2464[var11][0] = arg0.method219(-119);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field2464[var11][var13] = arg0.method215((byte) 102);
                    }
                }
            }
            return;
        } else if (arg1 == 14) {
            this.field2487 = true;
            return;
        } else if (arg1 == 15) {
            this.field2490 = true;
            return;
        } else if (arg1 == 16) {
            this.field2485 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V", line = 354)
    public static final void method1061(boolean arg0) {
        class395 var1 = (class395) class450.field6121.method652((byte) 37);
        if (!arg0) {
            method1064((byte) 80);
        }
        while (var1 != null) {
            if (class161.method941(false, var1.field5469)) {
                class104.method634(var1, (byte) -100);
            }
            var1 = (class395) class450.field6121.method653(31);
        }
        field2469++;
        if (class475.field6540 == 1) {
            class385.field5334 = false;
            class446.method2623(class97.field1419, -729334780, class2.field40, class103.field1491, class94.field1390);
            return;
        }
        class446.method2623(class97.field1419, -729334780, class2.field40, class103.field1491, class94.field1390);
        int var2 = class392.field5448.method2145(class13.field180.method1176(class110.field1676, (byte) -116), 13938);
        for (class395 var3 = (class395) class450.field6121.method652((byte) 37); var3 != null; var3 = (class395) class450.field6121.method653(58)) {
            int var4 = class488.method2848(16107, var3);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        class97.field1419 = var2 + 8;
        class103.field1491 = class475.field6540 * 16 + (class316.field4178 ? 26 : 22);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IZII)I", line = 414)
    public final int method1062(int arg0, boolean arg1, int arg2, int arg3) {
        field2474++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field2468[arg0];
        class134 var8 = null;
        class134 var9 = this.field2483.method263(-16777216, var7 >> 16);
        int var10 = var7 & arg3;
        if (var9 == null) {
            return var5;
        }
        if ((this.field2490 || class293.field3917) && arg2 != -1 && this.field2468.length > arg2) {
            int var11 = this.field2468[arg2];
            var8 = this.field2483.method263(-16777216, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field2487) {
            var5 |= 0x200;
        }
        if (var9.method816(255, var10)) {
            var5 |= 0x80;
        }
        if (var9.method814(var10, (byte) 58)) {
            var5 |= 0x100;
        }
        if (var8 != null) {
            if (var8.method816(255, var6)) {
                var5 |= 0x80;
            }
            if (var8.method814(var6, (byte) 85)) {
                var5 |= 0x100;
            }
        }
        if (this.field2486 != null && arg1) {
            if (arg0 < this.field2486.length) {
                int var12 = this.field2486[arg0];
                if (var12 != 65535) {
                    class134 var13 = this.field2483.method263(-16777216, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method816(255, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method814(var14, (byte) 47)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
            if ((this.field2490 || class293.field3917) && arg2 != -1 && this.field2486.length > arg2) {
                int var15 = this.field2486[arg2];
                if (var15 != 65535) {
                    class134 var16 = this.field2483.method263(-16777216, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method816(255, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method814(var17, (byte) 68)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 547)
    public final void method1063(int arg0) {
        if (arg0 != 9869) {
            this.field2490 = true;
        }
        if (this.field2478 == -1) {
            if (this.field2465 == null) {
                this.field2478 = 0;
            } else {
                this.field2478 = 2;
            }
        }
        if (this.field2476 == -1) {
            if (this.field2465 == null) {
                this.field2476 = 0;
            } else {
                this.field2476 = 2;
            }
        }
        field2480++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V", line = 580)
    public static void method1064(byte arg0) {
        field2493 = null;
        field2472 = null;
        if (arg0 >= 31) {
            field2494 = null;
            field2491 = null;
            field2492 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lbt;I)V", line = 594)
    public final void method1065(class32 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method201((byte) -113);
            if (var3 == 0) {
                field2475++;
                if (arg1 >= -76) {
                    field2494 = null;
                    return;
                }
                return;
            }
            this.method1060(arg0, var3, -16);
        }
    }
}
