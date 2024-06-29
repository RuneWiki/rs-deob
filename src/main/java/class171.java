import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class171 {

    @OriginalMember(owner = "client!mj", name = "k", descriptor = "Z")
    private boolean field2423 = false;

    @OriginalMember(owner = "client!mj", name = "l", descriptor = "Z")
    private boolean field2424 = false;

    @OriginalMember(owner = "client!mj", name = "p", descriptor = "I")
    private int field2428 = -1;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    private int field2414 = -32768;

    @OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
    private int field2442 = -1;

    @OriginalMember(owner = "client!mj", name = "r", descriptor = "I")
    private int field2430;

    @OriginalMember(owner = "client!mj", name = "y", descriptor = "I")
    public int field2437;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "I")
    private int field2444;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "B")
    private byte field2419;

    @OriginalMember(owner = "client!mj", name = "z", descriptor = "I")
    public int field2438;

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
    public int field2445;

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "B")
    private byte field2451;

    @OriginalMember(owner = "client!mj", name = "w", descriptor = "Z")
    private boolean field2435;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "Ltn;")
    public static class109 field2415 = new class109(8);

    @OriginalMember(owner = "client!mj", name = "t", descriptor = "[C")
    public static char[] field2432 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!mj", name = "u", descriptor = "Lle;")
    public static class65 field2433 = new class65(64);

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    private int field2416;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    private int field2420;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
    private int field2425;

    @OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!mj", name = "s", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
    private int field2436;

    @OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!mj", name = "B", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!mj", name = "C", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Lts;")
    private class116 field2417;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "Llb;")
    private class210 field2422;

    @OriginalMember(owner = "client!mj", name = "v", descriptor = "Lrs;")
    public class240 field2434;

    @OriginalMember(owner = "client!mj", name = "o", descriptor = "Lij;")
    public static class316 field2427;

    @OriginalMember(owner = "client!mj", name = "q", descriptor = "Li;")
    private class83 field2429;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "[I")
    public static int[] field2413;

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "[Z")
    private boolean[] field2447;

    static {
        new class368("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IZIBI)V", line = 3)
    public static final void method1215(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        field2418++;
        if (arg3 <= 126) {
            method1227(true);
        }
        class83.field1151 = 0L;
        int var5 = class111.method846(-12334);
        if (arg4 == 3 || var5 == 3) {
            arg1 = true;
        }
        if (!class354.field4765.method252()) {
            arg1 = true;
        }
        class129.method972(var5, arg4, arg2, arg1, -128, arg0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILea;)V", line = 24)
    public final void method1216(int arg0, class58 arg1) {
        if (arg0 != -15436) {
            return;
        }
        if (this.field2422 != null) {
            class383.method2369(this.field2422, this.field2451, this.field2430, this.field2444, this.field2447);
            this.field2447 = null;
            this.field2422 = null;
        }
        field2450++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)I", line = 43)
    public final int method1217(int arg0) {
        field2449++;
        if (arg0 != -12) {
            this.method1219(-7, -115);
        }
        return this.field2414;
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V", line = 55)
    public static void method1218(int arg0) {
        field2413 = null;
        field2433 = null;
        field2415 = null;
        field2432 = null;
        if (arg0 == 0) {
            field2427 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "finalize", descriptor = "()V", line = 70)
    protected final void finalize() {
        if (this.field2434 != null) {
            this.field2434.method1554();
        }
        field2431++;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V", line = 94)
    private final void method1219(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field2428 = 42;
        }
        field2426++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class447 var5 = class133.method996((byte) -19, this.field2445);
            class447 var6 = var5;
            if (var5.field6307 != null) {
                var5 = var5.method2772(-127);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field6286 != null) {
                if (this.field2429 != null && var5.method2773(this.field2429.field1165, 7187)) {
                    return;
                }
                var3 = var5.method2774((byte) -127);
                if (this.field2442 != var5.field6323) {
                    var4 = var5.field6282;
                }
            } else if (var5.field6264 == -1) {
                if (var6 != null && var6.field6286 != null) {
                    if (this.field2429 != null && var6.method2773(this.field2429.field1165, arg0 + 7187)) {
                        return;
                    }
                    var3 = var6.method2774((byte) -127);
                    if (this.field2442 != var6.field6323) {
                        var4 = var6.field6282;
                    }
                } else if (var6 != null && var6.field6264 != -1 && this.field2442 != var6.field6323) {
                    var3 = var6.field6264;
                    var4 = var6.field6282;
                }
            } else if (this.field2442 != var5.field6323) {
                var3 = var5.field6264;
                var4 = var5.field6282;
            }
        }
        if (var3 == -1) {
            this.field2429 = null;
            return;
        }
        this.field2417 = null;
        if (this.field2429 == null || this.field2429.field1165 != var3) {
            this.field2429 = class408.method2521((byte) 18, var3);
        } else if (this.field2429.field1166 == 0) {
            return;
        }
        if (this.field2429.field1145 == null) {
            this.field2429 = null;
            return;
        }
        if (var4) {
            this.field2425 = (int) ((double) this.field2429.field1145.length * Math.random());
            this.field2436 = (int) ((double) this.field2429.field1144[this.field2425] * Math.random()) + 1;
        } else {
            this.field2436 = 1;
            this.field2425 = 0;
        }
        this.field2420 = this.field2425 + 1;
        if (this.field2420 < 0 || this.field2420 >= this.field2429.field1145.length) {
            this.field2420 = -1;
        }
        this.field2416 = class246.field3467 - this.field2436;
    }

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V", line = 221)
    public static final void method1220(int arg0) {
        class418.field5783 = arg0;
        field2448++;
        class453.field6503 = 0;
        class124.method950(true);
        class63.method508(84);
        class24.method143((byte) -126);
        class424.method2618((byte) 122);
        for (int var1 = 0; var1 < class453.field6503; var1++) {
            int var3 = class405.field5609[var1];
            if (class246.field3467 != class87.field1227[var3].field2575) {
                if (class87.field1227[var3].field5852 > 0) {
                    class35.method316(false, class87.field1227[var3]);
                }
                class87.field1227[var3] = null;
            }
        }
        if (class213.field2982 != class75.field1068.field5048) {
            throw new RuntimeException("gpp1 pos:" + class75.field1068.field5048 + " psize:" + class213.field2982);
        }
        for (int var2 = 0; var2 < class11.field86; var2++) {
            if (class87.field1227[class18.field243[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class11.field86);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)V", line = 272)
    public final void method1221(int arg0, byte arg1) {
        if (arg1 < -47) {
            this.field2424 = true;
            field2421++;
            this.method1219(0, arg0);
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)Z", line = 286)
    public final boolean method1222(byte arg0) {
        int var2 = -31 % ((-arg0 - 6) / 38);
        field2439++;
        return this.field2435;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lea;Lp;IIIIIIZI)V", line = 628)
    public class171(class58 arg0, class447 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field2430 = arg6;
        this.field2437 = arg3;
        this.field2444 = arg7;
        this.field2419 = (byte) arg4;
        this.field2438 = arg2;
        this.field2423 = arg8;
        this.field2445 = arg1.field6323;
        this.field2451 = (byte) arg5;
        this.field2435 = arg0.method218() && arg1.field6332 && !this.field2423;
        if (arg9 != -1) {
            this.field2424 = true;
        }
        this.method1219(0, arg9);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILea;ZIIIZ)Lts;", line = 325)
    public final class116 method1223(int arg0, class58 arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field2446++;
        class447 var8 = class133.method996((byte) -19, this.field2445);
        if (var8.field6307 != null) {
            var8 = var8.method2772(74);
        }
        if (arg5 != 18928) {
            field2415 = null;
        }
        if (var8 == null) {
            this.method1216(-15436, arg1);
            this.field2442 = -1;
            this.field2428 = this.field2425;
            return null;
        }
        if (!this.field2424 && this.field2442 != var8.field6323) {
            this.field2417 = null;
            this.method1219(arg5 ^ 0x49F0, -1);
        }
        this.method1224(arg5 - 19773, arg0, arg3);
        boolean var9 = arg6 & class228.field3188 != 0 & this.field2435;
        boolean var10 = var9 & (this.field2442 != var8.field6323 || (this.field2428 != this.field2425 || this.field2429 != null && (this.field2429.field1140 || class196.field2845) && this.field2425 != this.field2420) && class228.field3188 >= 2);
        if (arg2 && !var10) {
            this.field2442 = var8.field6323;
            this.field2428 = this.field2425;
            return null;
        }
        if (var10) {
            class383.method2369(this.field2422, this.field2451, this.field2430, this.field2444, this.field2447);
        }
        class323 var11 = class436.field6160[this.field2451];
        class323 var12;
        if (this.field2423) {
            var12 = class82.field1130[0];
        } else {
            var12 = this.field2451 >= 3 ? null : class436.field6160[this.field2451 + 1];
        }
        class116 var13 = null;
        if (this.field2429 != null) {
            if (var10) {
                arg4 |= 0x20000;
            }
            var13 = var8.method2766(this.field2438 == 11 ? this.field2437 + 4 : this.field2437, this.field2444, this.field2429, var11, this.field2425, arg1, 25678, this.field2430, this.field2438 == 11 ? 10 : this.field2438, this.field2420, var12, arg4, var11.method331(this.field2430, this.field2444), this.field2436);
            if (var13 == null) {
                this.field2414 = 0;
                this.field2422 = null;
                this.field2447 = null;
            } else {
                if (var10) {
                    if (this.field2447 == null) {
                        this.field2447 = new boolean[4];
                    }
                    this.field2422 = var13.method906(this.field2422);
                    class259.method1669(this.field2422, this.field2451, arg0, arg3, this.field2447);
                }
                this.field2414 = var13.method889();
            }
            this.field2417 = null;
        } else if (this.field2417 != null && (this.field2417.method866() & arg4) == arg4 && this.field2442 == var8.field6323) {
            var13 = this.field2417;
        } else {
            if (this.field2417 != null) {
                arg4 |= this.field2417.method866();
            }
            class274 var14 = var8.method2761(var11, arg1, this.field2438 == 11 ? this.field2437 + 4 : this.field2437, arg5 ^ 0xD15101AD, var10, this.field2438 == 11 ? 10 : this.field2438, var11.method331(this.field2430, this.field2444), arg4, this.field2444, this.field2430, var12);
            if (var14 == null) {
                this.field2414 = 0;
                this.field2447 = null;
                this.field2417 = null;
                this.field2422 = null;
            } else {
                var13 = var14.field3748;
                this.field2417 = var14.field3748;
                if (var10) {
                    this.field2422 = var14.field3745;
                    this.field2447 = null;
                    class259.method1669(this.field2422, this.field2451, arg0, arg3, (boolean[]) null);
                }
                this.field2414 = var13.method889();
            }
        }
        this.field2442 = var8.field6323;
        this.field2430 = arg0;
        this.field2428 = this.field2425;
        this.field2444 = arg3;
        return var13;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(III)V", line = 457)
    private final void method1224(int arg0, int arg1, int arg2) {
        if (arg0 != -845) {
            return;
        }
        field2440++;
        label92: while (true) {
            if (this.field2429 == null) {
                if (this.field2424) {
                    return;
                }
                this.method1219(0, -1);
                if (this.field2429 == null) {
                    return;
                }
            }
            int var4 = class246.field3467 - this.field2416;
            if (var4 > 100 && this.field2429.field1164 > 0) {
                int var5 = this.field2429.field1145.length - this.field2429.field1164;
                while (var5 > this.field2425 && this.field2429.field1144[this.field2425] < var4) {
                    var4 -= this.field2429.field1144[this.field2425];
                    this.field2425++;
                }
                if (this.field2425 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field2429.field1145.length; var7++) {
                        var6 += this.field2429.field1144[var7];
                    }
                    var4 %= var6;
                }
                this.field2420 = this.field2425 + 1;
                if (this.field2429.field1145.length <= this.field2420) {
                    this.field2420 -= this.field2429.field1164;
                    if (this.field2420 < 0 || this.field2429.field1145.length <= this.field2420) {
                        this.field2420 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field2429.field1144[this.field2425]) {
                            this.field2416 = class246.field3467 - var4;
                            this.field2436 = var4;
                            return;
                        }
                        class431.method2657(this.field2429, -63, arg1, false, this.field2425, arg2);
                        var4 -= this.field2429.field1144[this.field2425];
                        this.field2425++;
                        if (this.field2425 >= this.field2429.field1145.length) {
                            this.field2425 -= this.field2429.field1164;
                            if (this.field2425 < 0 || this.field2429.field1145.length <= this.field2425) {
                                this.field2429 = null;
                                continue label92;
                            }
                        }
                        this.field2420 = this.field2425 + 1;
                    } while (this.field2420 < this.field2429.field1145.length);
                    this.field2420 -= this.field2429.field1164;
                } while (this.field2420 >= 0 && this.field2429.field1145.length > this.field2420);
                this.field2420 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLea;ZIIIILts;)V", line = 561)
    public final void method1225(byte arg0, class58 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, class116 arg7) {
        if (arg0 < 4) {
            return;
        }
        field2441++;
        class217[] var9 = arg7.method879();
        class138[] var10 = arg7.method892();
        if ((this.field2434 == null || this.field2434.field3390) && (var9 != null || var10 != null)) {
            class447 var11 = class133.method996((byte) -19, this.field2445);
            if (var11.field6307 != null) {
                var11 = var11.method2772(89);
            }
            if (var11 != null) {
                this.field2434 = new class240(class246.field3467);
            }
        }
        if (this.field2434 == null) {
            return;
        }
        if (arg2) {
            this.field2434.method1560(arg1, (long) class246.field3467, var9, var10, false);
        } else {
            this.field2434.method1561((long) class246.field3467);
        }
        this.field2434.method1556(this.field2419, arg5, arg6, arg4, arg3);
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(ILea;)V", line = 616)
    public final void method1226(int arg0, class58 arg1) {
        field2443++;
        this.method1223(this.field2430, arg1, true, this.field2444, 131072, 18928, true);
        if (arg0 >= -21) {
            this.field2422 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V", line = 649)
    public static final void method1227(boolean arg0) {
        if (arg0) {
            class341.field4617 = class304.field4147;
            class436.field6160 = class125.field1879;
        } else {
            class341.field4617 = class255.field3554;
            class436.field6160 = class82.field1130;
        }
        class409.field5706 = class341.field4617.length;
    }
}
