import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class473 {

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "Leh;")
    private class241 field6527 = null;

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "I")
    public int field6535;

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "Lod;")
    private class349 field6543;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Z")
    private boolean field6507;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "[[I")
    public static int[][] field6505 = new int[6][];

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public static int field6514 = -1;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "Lvj;")
    public static class304 field6531 = new class304("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "Lra;")
    public static class70 field6545;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field6504;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    public static int field6540;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "I")
    public static int field6541;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public static int field6544;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "[Ljava/lang/Object;")
    private Object[] field6510;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field6515;

    static {
        new class304("I can't reach that!", "Da kommst du nicht hin.", "Je ne peux pas l'atteindre !", "Não consigo alcançar!");
        field6545 = new class70(9, 0, 4, 1);
        new class304("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B", line = 3)
    public final byte[] method2696(int arg0, String arg1, String arg2) {
        if (arg0 != 100) {
            return null;
        }
        field6506++;
        if (!this.method2713(true)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field6527.field3220.method2574(1, class374.method2165(var4, (byte) -32));
        if (this.method2697(var6, -1)) {
            int var7 = this.field6527.field3222[var6].method2574(1, class374.method2165(var5, (byte) -32));
            return this.method2708(var6, var7, (byte) 54);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Z", line = 28)
    private final boolean method2697(int arg0, int arg1) {
        field6502++;
        if (!this.method2713(true)) {
            return false;
        } else if (~arg0 <= arg1 && arg0 < this.field6527.field3218.length && this.field6527.field3218[arg0] != 0) {
            return true;
        } else if (class248.field3292) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)Z", line = 48)
    public final boolean method2698(String arg0, boolean arg1, String arg2) {
        if (arg1) {
            this.method2699(-29);
        }
        field6541++;
        if (!this.method2713(!arg1)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field6527.field3220.method2574(1, class374.method2165(var4, (byte) -32));
        if (this.method2697(var6, -1)) {
            int var7 = this.field6527.field3222[var6].method2574(1, class374.method2165(var5, (byte) -32));
            return this.method2723(var7, var6, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)Z", line = 74)
    public final boolean method2699(int arg0) {
        field6524++;
        if (!this.method2713(true)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field6527.field3225.length; var3++) {
            int var4 = this.field6527.field3225[var3];
            if (this.field6510[var4] == null) {
                this.method2705(var4, 4);
                if (this.field6510[var4] == null) {
                    var2 = false;
                }
            }
        }
        if (arg0 != -22265) {
            this.method2710(10, (byte) -41);
        }
        return var2;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V", line = 110)
    public final void method2700(byte arg0) {
        field6537++;
        if (arg0 == 58 && this.field6510 != null) {
            for (int var2 = 0; var2 < this.field6510.length; var2++) {
                this.field6510[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 132)
    public final int method2701(String arg0, int arg1) {
        field6530++;
        if (!this.method2713(true)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != -15149) {
            this.field6543 = null;
        }
        int var4 = this.field6527.field3220.method2574(1, class374.method2165(var3, (byte) -32));
        return this.method2722(100, var4);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 151)
    public final boolean method2702(int arg0, String arg1) {
        field6534++;
        if (!this.method2713(true)) {
            return false;
        } else if (arg0 == 31269) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field6527.field3220.method2574(1, class374.method2165(var3, (byte) -32));
            return this.method2712(var4, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(II)I", line = 170)
    public final int method2703(int arg0, int arg1) {
        field6508++;
        if (!this.method2713(true)) {
            return -1;
        }
        int var3 = this.field6527.field3220.method2574(arg1 ^ 0x632, arg0);
        if (arg1 == 1587) {
            return this.method2697(var3, -1) ? var3 : -1;
        } else {
            return 79;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/lang/String;Z)I", line = 192)
    public final int method2704(String arg0, boolean arg1) {
        field6511++;
        if (this.method2713(arg1)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field6527.field3220.method2574(1, class374.method2165(var3, (byte) -32));
            return this.method2697(var4, -1) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(II)V", line = 211)
    private final void method2705(int arg0, int arg1) {
        if (arg1 != 4) {
            return;
        }
        if (this.field6507) {
            this.field6510[arg0] = this.field6543.method2040(arg0, -2);
        } else {
            this.field6510[arg0] = class14.method148(false, -5578, this.field6543.method2040(arg0, -2));
        }
        field6532++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)Z", line = 232)
    private final boolean method2706(int arg0, int arg1, int arg2) {
        field6518++;
        if (arg1 != 0) {
            return false;
        } else if (!this.method2713(true)) {
            return false;
        } else if (arg2 >= 0 && arg0 >= 0 && this.field6527.field3218.length > arg2 && arg0 < this.field6527.field3218[arg2]) {
            return true;
        } else if (class248.field3292) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(II)[B", line = 258)
    public final byte[] method2707(int arg0, int arg1) {
        field6533++;
        if (!this.method2713(true)) {
            return null;
        } else if (this.field6527.field3218.length == 1) {
            return this.method2708(0, arg0, (byte) 54);
        } else {
            if (arg1 != 0) {
                this.method2715(false, true, 109);
            }
            if (!this.method2697(arg0, -1)) {
                return null;
            } else if (this.field6527.field3218[arg0] == 1) {
                return this.method2708(arg0, 0, (byte) 54);
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIB)[B", line = 289)
    public final byte[] method2708(int arg0, int arg1, byte arg2) {
        if (arg2 == 54) {
            field6509++;
            return this.method2716(-1, arg1, null, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(II)V", line = 304)
    private final void method2709(int arg0, int arg1) {
        field6517++;
        this.field6543.method2038(arg1, (byte) -32);
        if (arg0 != 0) {
            this.field6515 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IB)I", line = 319)
    public final int method2710(int arg0, byte arg1) {
        field6525++;
        if (arg1 > -97) {
            return -63;
        } else if (this.method2697(arg0, -1)) {
            return this.field6527.field3218[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lnp;B)Z", line = 338)
    public static final boolean method2711(class338 arg0, byte arg1) {
        if (arg1 >= -20) {
            method2711(null, (byte) -20);
        }
        field6504++;
        class1 var2 = class402.field5388.method1994(-17294, arg0.method347((byte) -87));
        if (var2.field45 == -1) {
            return true;
        } else {
            class355 var3 = class466.field6434.method372(126, var2.field45);
            return var3.field4791 == -1 ? true : var3.method2073(0);
        }
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(II)Z", line = 371)
    public final boolean method2712(int arg0, int arg1) {
        field6522++;
        if (!this.method2697(arg0, -1)) {
            return false;
        } else if (this.field6510[arg0] == null) {
            this.method2705(arg0, arg1 + 4);
            if (arg1 != 0) {
                field6544 = 28;
            }
            return this.field6510[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)Z", line = 396)
    private final boolean method2713(boolean arg0) {
        field6536++;
        if (!arg0) {
            return true;
        }
        if (this.field6527 == null) {
            this.field6527 = this.field6543.method2037(2);
            if (this.field6527 == null) {
                return false;
            }
            this.field6515 = new Object[this.field6527.field3214][];
            this.field6510 = new Object[this.field6527.field3214];
        }
        return true;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)J", line = 422)
    public static final long method2714(int arg0) {
        field6542++;
        if (arg0 != 0) {
            method2714(61);
        }
        return class21.field377.method474((byte) 90);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZZI)V", line = 435)
    public final void method2715(boolean arg0, boolean arg1, int arg2) {
        field6538++;
        if (!this.method2713(true)) {
            return;
        }
        if (arg2 != 0) {
            this.method2708(7, -10, (byte) 84);
        }
        if (arg1) {
            this.field6527.field3220 = null;
            this.field6527.field3226 = null;
        }
        if (arg0) {
            this.field6527.field3212 = null;
            this.field6527.field3222 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II[II)[B", line = 464)
    public final byte[] method2716(int arg0, int arg1, int[] arg2, int arg3) {
        field6513++;
        if (!this.method2706(arg1, arg0 + 1, arg3)) {
            return null;
        }
        if (this.field6515[arg3] == null || this.field6515[arg3][arg1] == null) {
            boolean var5 = this.method2725(arg3, arg2, arg1, (byte) -117);
            if (!var5) {
                this.method2705(arg3, 4);
                boolean var6 = this.method2725(arg3, arg2, arg1, (byte) -120);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class380.method2256(4, false, this.field6515[arg3][arg1]);
        if (arg0 != -1) {
            return null;
        }
        if (this.field6535 == 1) {
            this.field6515[arg3][arg1] = null;
            if (this.field6527.field3218[arg3] == 1) {
                this.field6515[arg3] = null;
            }
        } else if (this.field6535 == 2) {
            this.field6515[arg3] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)I", line = 512)
    public final int method2717(byte arg0) {
        field6540++;
        if (!this.method2713(true)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field6510.length; var4++) {
            if (this.field6527.field3213[var4] > 0) {
                var2 += 100;
                var3 += this.method2722(100, var4);
            }
        }
        if (arg0 != 81) {
            method2714(73);
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V", line = 558)
    public final void method2718(int arg0) {
        if (this.field6515 != null) {
            for (int var2 = 0; var2 < this.field6515.length; var2++) {
                this.field6515[var2] = null;
            }
        }
        field6512++;
        if (arg0 != 100) {
            this.method2697(-110, -86);
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(IB)[I", line = 580)
    public final int[] method2719(int arg0, byte arg1) {
        field6539++;
        if (!this.method2697(arg0, -1)) {
            return null;
        }
        int[] var3 = this.field6527.field3228[arg0];
        if (arg1 != -79) {
            this.method2724(99);
        }
        if (var3 == null) {
            var3 = new int[this.field6527.field3213[arg0]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 612)
    public final boolean method2720(byte arg0, String arg1) {
        field6523++;
        if (this.method2713(true)) {
            int var3 = -18 % ((54 - arg0) / 46);
            String var4 = arg1.toLowerCase();
            int var5 = this.field6527.field3220.method2574(1, class374.method2165(var4, (byte) -32));
            return var5 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(IB)Z", line = 632)
    public final boolean method2721(int arg0, byte arg1) {
        field6503++;
        if (!this.method2713(true)) {
            return false;
        }
        if (arg1 <= 80) {
            this.method2726(114);
        }
        if (this.field6527.field3218.length == 1) {
            return this.method2723(arg0, 0, 0);
        } else if (!this.method2697(arg0, -1)) {
            return false;
        } else if (this.field6527.field3218[arg0] == 1) {
            return this.method2723(0, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "(II)I", line = 659)
    private final int method2722(int arg0, int arg1) {
        field6519++;
        if (arg0 != 100) {
            this.method2703(-32, -20);
        }
        if (this.method2697(arg1, -1)) {
            return this.field6510[arg1] == null ? this.field6543.method2039(-2057, arg1) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(III)Z", line = 676)
    public final boolean method2723(int arg0, int arg1, int arg2) {
        field6528++;
        if (!this.method2706(arg0, arg2 ^ arg2, arg1)) {
            return false;
        } else if (this.field6515[arg1] != null && this.field6515[arg1][arg0] != null) {
            return true;
        } else if (this.field6510[arg1] == null) {
            this.method2705(arg1, 4);
            return this.field6510[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)I", line = 702)
    public final int method2724(int arg0) {
        field6516++;
        if (arg0 == 0) {
            return this.method2713(true) ? this.field6527.field3218.length : -1;
        } else {
            return -56;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[IIB)Z", line = 718)
    private final boolean method2725(int arg0, int[] arg1, int arg2, byte arg3) {
        field6526++;
        if (!this.method2697(arg0, -1)) {
            return false;
        } else if (this.field6510[arg0] == null) {
            return false;
        } else {
            int var5 = this.field6527.field3213[arg0];
            int[] var6 = this.field6527.field3228[arg0];
            if (this.field6515[arg0] == null) {
                this.field6515[arg0] = new Object[this.field6527.field3218[arg0]];
            }
            Object[] var7 = this.field6515[arg0];
            boolean var8 = true;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            int var11 = 111 / ((arg3 - 37) / 60);
            byte[] var12;
            if (arg1 != null && (arg1[0] != 0 || arg1[1] != 0 || arg1[2] != 0 || arg1[3] != 0)) {
                var12 = class380.method2256(4, true, this.field6510[arg0]);
                class379 var13 = new class379(var12);
                var13.method2219(5, var13.field5152.length, arg1, (byte) -22);
            } else {
                var12 = class380.method2256(4, false, this.field6510[arg0]);
            }
            byte[] var14;
            try {
                var14 = class265.method1596((byte) -8, var12);
            } catch (RuntimeException var50) {
                throw class124.method910(var50, "T3 - " + (arg1 != null) + "," + arg0 + "," + var12.length + "," + class42.method303((byte) -60, var12.length, var12) + "," + class42.method303((byte) 119, var12.length - 2, var12) + "," + this.field6527.field3215[arg0] + "," + this.field6527.field3219);
            }
            if (this.field6507) {
                this.field6510[arg0] = null;
            }
            if (var5 <= 1) {
                int var16;
                if (var6 == null) {
                    var16 = 0;
                } else {
                    var16 = var6[0];
                }
                if (this.field6535 == 0) {
                    var7[var16] = class14.method148(false, -5578, var14);
                } else {
                    var7[var16] = var14;
                }
            } else if (this.field6535 == 2) {
                int var17 = var14.length;
                int var51 = var17 - 1;
                int var18 = var14[var51] & 0xFF;
                int var19 = var51 - var18 * 4 * var5;
                class379 var20 = new class379(var14);
                int var21 = 0;
                int var22 = 0;
                var20.field5173 = var19;
                for (int var23 = 0; var23 < var18; var23++) {
                    int var24 = 0;
                    for (int var25 = 0; var25 < var5; var25++) {
                        var24 += var20.method2232((byte) 125);
                        int var26;
                        if (var6 == null) {
                            var26 = var25;
                        } else {
                            var26 = var6[var25];
                        }
                        if (arg2 == var26) {
                            var22 = var26;
                            var21 += var24;
                        }
                    }
                }
                if (var21 == 0) {
                    return true;
                }
                byte[] var27 = new byte[var21];
                int var28 = 0;
                var20.field5173 = var19;
                int var29 = 0;
                for (int var30 = 0; var30 < var18; var30++) {
                    int var31 = 0;
                    for (int var32 = 0; var32 < var5; var32++) {
                        var31 += var20.method2232((byte) 124);
                        int var33;
                        if (var6 == null) {
                            var33 = var32;
                        } else {
                            var33 = var6[var32];
                        }
                        if (arg2 == var33) {
                            class254.method1529(var14, var29, var27, var28, var31);
                            var28 += var31;
                        }
                        var29 += var31;
                    }
                }
                var7[var22] = var27;
            } else {
                int var34 = var14.length;
                int var52 = var34 - 1;
                int var35 = var14[var52] & 0xFF;
                int var36 = var52 - var35 * 4 * var5;
                class379 var37 = new class379(var14);
                int[] var38 = new int[var5];
                var37.field5173 = var36;
                for (int var39 = 0; var39 < var35; var39++) {
                    int var40 = 0;
                    for (int var41 = 0; var41 < var5; var41++) {
                        var40 += var37.method2232((byte) 124);
                        var38[var41] += var40;
                    }
                }
                byte[][] var42 = new byte[var5][];
                for (int var43 = 0; var43 < var5; var43++) {
                    var42[var43] = new byte[var38[var43]];
                    var38[var43] = 0;
                }
                var37.field5173 = var36;
                int var44 = 0;
                for (int var45 = 0; var45 < var35; var45++) {
                    int var46 = 0;
                    for (int var47 = 0; var47 < var5; var47++) {
                        var46 += var37.method2232((byte) 125);
                        class254.method1529(var14, var44, var42[var47], var38[var47], var46);
                        var38[var47] += var46;
                        var44 += var46;
                    }
                }
                for (int var48 = 0; var48 < var5; var48++) {
                    int var49;
                    if (var6 == null) {
                        var49 = var48;
                    } else {
                        var49 = var6[var48];
                    }
                    if (this.field6535 == 0) {
                        var7[var49] = class14.method148(false, -5578, var42[var48]);
                    } else {
                        var7[var49] = var42[var48];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Lod;ZI)V", line = 1061)
    public class473(class349 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field6535 = arg2;
        this.field6543 = arg0;
        this.field6507 = arg1;
    }

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)I", line = 1010)
    public final int method2726(int arg0) {
        field6521++;
        if (!this.method2713(true)) {
            throw new IllegalStateException("");
        }
        if (arg0 != -12075) {
            field6505 = null;
        }
        return this.field6527.field3219;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(ILjava/lang/String;)V", line = 1027)
    public final void method2727(int arg0, String arg1) {
        field6520++;
        if (this.method2713(true)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field6527.field3220.method2574(1, class374.method2165(var3, (byte) -32));
            this.method2709(arg0, var4);
        }
    }

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "(II)V", line = 1043)
    public final void method2728(int arg0, int arg1) {
        if (arg1 == 100) {
            field6529++;
            if (this.method2697(arg0, -1) && this.field6515 != null) {
                this.field6515[arg0] = null;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V", line = 1082)
    public static void method2729(int arg0) {
        field6531 = null;
        if (arg0 != -1) {
            method2729(49);
        }
        field6545 = null;
        field6505 = null;
    }
}
