import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class460 {

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "Z")
    public boolean field6328 = false;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    private int field6336 = -1;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "I")
    public int field6323 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public int field6320 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public int field6327 = 0;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public int field6329 = -1;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public int field6325 = -1;

    @OriginalMember(owner = "client!fh", name = "M", descriptor = "I")
    public int field6357 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "Z")
    public boolean field6333 = true;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    public int field6338 = -1;

    @OriginalMember(owner = "client!fh", name = "N", descriptor = "I")
    private int field6358 = -1;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    private int field6319 = -1;

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "[Ljava/lang/String;")
    public String[] field6351 = new String[5];

    @OriginalMember(owner = "client!fh", name = "P", descriptor = "I")
    private int field6360 = -1;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "Z")
    public boolean field6347 = true;

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    private int field6334 = -1;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public int field6335 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!fh", name = "S", descriptor = "Z")
    public boolean field6362 = true;

    @OriginalMember(owner = "client!fh", name = "U", descriptor = "I")
    public int field6364 = -1;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
    public static int field6346;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "I")
    public static int field6321;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    private int field6322;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public int field6324;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field6326;

    @OriginalMember(owner = "client!fh", name = "m", descriptor = "I")
    public int field6331;

    @OriginalMember(owner = "client!fh", name = "n", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
    private int field6337;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
    public int field6339;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    private int field6340;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    private int field6342;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
    public static int field6350;

    @OriginalMember(owner = "client!fh", name = "J", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!fh", name = "K", descriptor = "I")
    public int field6355;

    @OriginalMember(owner = "client!fh", name = "L", descriptor = "I")
    public int field6356;

    @OriginalMember(owner = "client!fh", name = "O", descriptor = "I")
    public int field6359;

    @OriginalMember(owner = "client!fh", name = "Q", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!fh", name = "T", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "Lnt;")
    public class147 field6344;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "Lub;")
    private class18 field6341;

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "Ljava/lang/String;")
    public String field6352;

    @OriginalMember(owner = "client!fh", name = "I", descriptor = "Ljava/lang/String;")
    public String field6353;

    @OriginalMember(owner = "client!fh", name = "l", descriptor = "[I")
    public int[] field6330;

    static {
        new class304("You appear to be telling someone your password - please don't!", "Willst du jemandem dein Passwort verraten? Das darfst du nicht! Falls das", "Il semble que vous révéliez votre mot de passe à quelqu'un - ne faites jamais ça !", "Parece que você está revelando sua senha a alguém. Não faça isso!");
        field6346 = 52;
        new class304("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lmd;I)V", line = 5)
    public final void method2613(class379 arg0, int arg1) {
        field6326++;
        while (true) {
            int var3 = arg0.method2238(255);
            if (var3 == 0) {
                if (arg1 > -44) {
                    this.field6359 = 108;
                    return;
                } else {
                    return;
                }
            }
            this.method2617(arg0, (byte) 4, var3);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILqa;Z)Lf;", line = 27)
    public final class529 method2614(int arg0, class162 arg1, boolean arg2) {
        field6348++;
        int var4 = arg2 ? this.field6338 : this.field6364;
        if (arg0 != 49783229) {
            return null;
        }
        int var5 = arg1.field2378 << 29 | var4;
        class529 var6 = (class529) this.field6344.field2084.method1456((long) var5, 108);
        if (var6 != null) {
            return var6;
        } else if (this.field6344.field2081.method2721(var4, (byte) 101)) {
            class134 var7 = class134.method939(this.field6344.field2081, var4, 0);
            if (var7 != null) {
                var6 = arg1.method596(var7, true);
                this.field6344.field2084.method1462(var6, (long) var5, arg0 ^ 0xFD085E15);
            }
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)[Lwv;", line = 70)
    public static final class26[] method2615(int arg0) {
        field6345++;
        if (arg0 <= 42) {
            method2618(true, null, null, -50);
        }
        return new class26[] { class168.field2433, class22.field389, class152.field2203, class339.field4426, class132.field1908, class507.field7042 };
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;", line = 88)
    public final String method2616(int arg0, String arg1, int arg2) {
        field6343++;
        if (this.field6341 == null) {
            return arg1;
        }
        class494 var4 = (class494) this.field6341.method182((long) arg0, (byte) 106);
        if (arg2 != -1) {
            method2615(29);
        }
        return var4 == null ? arg1 : var4.field6857;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lmd;BI)V", line = 110)
    private final void method2617(class379 arg0, byte arg1, int arg2) {
        field6350++;
        if (arg1 != 4) {
            return;
        }
        if (arg2 == 1) {
            this.field6364 = arg0.method2212((byte) 83);
        } else if (arg2 == 2) {
            this.field6338 = arg0.method2212((byte) 83);
        } else if (arg2 == 3) {
            this.field6352 = arg0.method2218(-109);
        } else if (arg2 == 4) {
            this.field6359 = arg0.method2249((byte) 98);
        } else if (arg2 == 5) {
            this.field6325 = arg0.method2249((byte) 104);
        } else if (arg2 == 6) {
            this.field6327 = arg0.method2238(255);
            return;
        } else if (arg2 == 7) {
            int var12 = arg0.method2238(255);
            if ((var12 & 0x2) == 2) {
                this.field6328 = true;
            }
            if ((var12 & 0x1) == 0) {
                this.field6333 = false;
                return;
            }
        } else if (arg2 == 8) {
            this.field6362 = arg0.method2238(arg1 + 251) == 1;
            return;
        } else if (arg2 == 9) {
            this.field6360 = arg0.method2212((byte) 83);
            if (this.field6360 == 65535) {
                this.field6360 = -1;
            }
            this.field6358 = arg0.method2212((byte) 83);
            if (this.field6358 == 65535) {
                this.field6358 = -1;
            }
            this.field6340 = arg0.method2232((byte) 125);
            this.field6322 = arg0.method2232((byte) 125);
            return;
        } else if (arg2 < 10 || arg2 > 14) {
            if (arg2 != 15) {
                if (arg2 == 16) {
                    this.field6347 = false;
                    return;
                }
                if (arg2 != 17) {
                    if (arg2 != 18) {
                        if (arg2 == 19) {
                            this.field6329 = arg0.method2212((byte) 83);
                            return;
                        }
                        if (arg2 == 20) {
                            this.field6319 = arg0.method2212((byte) 83);
                            if (this.field6319 == 65535) {
                                this.field6319 = -1;
                            }
                            this.field6336 = arg0.method2212((byte) 83);
                            if (this.field6336 == 65535) {
                                this.field6336 = -1;
                            }
                            this.field6342 = arg0.method2232((byte) 125);
                            this.field6337 = arg0.method2232((byte) 127);
                            return;
                        }
                        if (arg2 == 21) {
                            this.field6331 = arg0.method2232((byte) 127);
                        } else if (arg2 == 22) {
                            this.field6355 = arg0.method2232((byte) 127);
                            return;
                        } else if (arg2 == 249) {
                            int var4 = arg0.method2238(255);
                            if (this.field6341 == null) {
                                int var5 = class321.method1857((byte) 113, var4);
                                this.field6341 = new class18(var5);
                            }
                            for (int var6 = 0; var6 < var4; var6++) {
                                boolean var7 = arg0.method2238(255) == 1;
                                int var8 = arg0.method2249((byte) 79);
                                class42 var9;
                                if (var7) {
                                    var9 = new class494(arg0.method2218(123));
                                } else {
                                    var9 = new class387(arg0.method2232((byte) 126));
                                }
                                this.field6341.method173((long) var8, var9, (byte) 70);
                            }
                            return;
                        }
                        return;
                    }
                    this.field6334 = arg0.method2212((byte) 83);
                    return;
                }
                this.field6353 = arg0.method2218(arg1 + 114);
                return;
            }
            int var10 = arg0.method2238(255);
            this.field6330 = new int[var10 * 2];
            for (int var11 = 0; var11 < var10 * 2; var11++) {
                this.field6330[var11] = arg0.method2202(-26372);
            }
            this.field6356 = arg0.method2232((byte) 125);
            this.field6324 = arg0.method2232((byte) 124);
            return;
        } else {
            this.field6351[arg2 - 10] = arg0.method2218(-84);
            return;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZLjava/awt/Canvas;Lm;I)Lqa;", line = 284)
    public static final class162 method2618(boolean arg0, Canvas arg1, class126 arg2, int arg3) {
        field6332++;
        if (!arg0) {
            method2615(79);
        }
        return new class84(arg3, arg1, arg2);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIZ)I", line = 326)
    public final int method2619(int arg0, int arg1, boolean arg2) {
        field6349++;
        if (this.field6341 == null) {
            return arg1;
        }
        class387 var4 = (class387) this.field6341.method182((long) arg0, (byte) 97);
        if (var4 == null) {
            return arg1;
        } else if (arg2) {
            return var4.field5264;
        } else {
            return 88;
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V", line = 370)
    public final void method2620(int arg0) {
        field6354++;
        if (this.field6330 != null) {
            for (int var2 = 0; var2 < this.field6330.length; var2 += 2) {
                if (this.field6320 > this.field6330[var2]) {
                    this.field6320 = this.field6330[var2];
                } else if (this.field6330[var2] > this.field6357) {
                    this.field6357 = this.field6330[var2];
                }
                if (this.field6330[var2 + 1] < this.field6323) {
                    this.field6323 = this.field6330[var2 + 1];
                } else if (this.field6335 < this.field6330[var2 + 1]) {
                    this.field6335 = this.field6330[var2 + 1];
                }
            }
        }
        if (arg0 != 2) {
            this.field6327 = 18;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILrd;)Z", line = 411)
    public final boolean method2621(int arg0, class221 arg1) {
        field6321++;
        int var3;
        if (~this.field6358 == arg0) {
            if (this.field6360 == -1) {
                return true;
            }
            var3 = arg1.method1395(this.field6360, (byte) 64);
        } else {
            var3 = arg1.method1394(arg0 ^ 0x60, this.field6358);
        }
        if (this.field6340 > var3 || var3 > this.field6322) {
            return false;
        }
        boolean var4 = false;
        int var5;
        if (this.field6336 == -1) {
            if (this.field6319 == -1) {
                return true;
            }
            var5 = arg1.method1395(this.field6319, (byte) 124);
        } else {
            var5 = arg1.method1394(arg0 ^ 0x7D, this.field6336);
        }
        return var5 >= this.field6342 && this.field6337 >= var5;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lqa;I)Lf;", line = 448)
    public final class529 method2622(class162 arg0, int arg1) {
        field6363++;
        class529 var3 = (class529) this.field6344.field2084.method1456((long) (arg0.field2378 << 29 | this.field6334 | 0x20000), 108);
        if (var3 != null) {
            return var3;
        }
        this.field6344.field2081.method2721(this.field6334, (byte) 99);
        class134 var4 = class134.method939(this.field6344.field2081, this.field6334, arg1);
        if (var4 != null) {
            var3 = arg0.method596(var4, true);
            this.field6344.field2084.method1462(var3, (long) (arg0.field2378 << 29 | this.field6334 | 0x20000), -57);
        }
        return var3;
    }
}
