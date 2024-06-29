import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class516 extends class426 {

    @OriginalMember(owner = "client!hn", name = "B", descriptor = "I")
    private int field7595 = 0;

    @OriginalMember(owner = "client!hn", name = "z", descriptor = "Llp;")
    private class272 field7593 = new class272(16);

    @OriginalMember(owner = "client!hn", name = "H", descriptor = "I")
    private int field7601 = 0;

    @OriginalMember(owner = "client!hn", name = "D", descriptor = "Lps;")
    private class63 field7597 = new class63();

    @OriginalMember(owner = "client!hn", name = "J", descriptor = "J")
    private long field7603 = 0L;

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "I")
    private int field7586;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "Lvc;")
    private class211 field7584;

    @OriginalMember(owner = "client!hn", name = "G", descriptor = "Z")
    private boolean field7600;

    @OriginalMember(owner = "client!hn", name = "E", descriptor = "Lps;")
    private class63 field7598;

    @OriginalMember(owner = "client!hn", name = "C", descriptor = "Lpq;")
    private class131 field7596;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "Lvc;")
    private class211 field7581;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "I")
    private int field7585;

    @OriginalMember(owner = "client!hn", name = "I", descriptor = "Z")
    private boolean field7602;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "Lqc;")
    private class532 field7573;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    private int field7575;

    @OriginalMember(owner = "client!hn", name = "t", descriptor = "Lmb;")
    private class175 field7587;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public static int field7570;

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "I")
    public static int field7572;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field7576;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field7579;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
    public static int field7580;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!hn", name = "u", descriptor = "I")
    public static int field7588;

    @OriginalMember(owner = "client!hn", name = "v", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!hn", name = "w", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!hn", name = "x", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!hn", name = "A", descriptor = "I")
    public static int field7594;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "Lqa;")
    public static class165 field7574;

    @OriginalMember(owner = "client!hn", name = "y", descriptor = "Lkm;")
    private class241 field7592;

    @OriginalMember(owner = "client!hn", name = "F", descriptor = "Z")
    private boolean field7599;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "[B")
    private byte[] field7583;

    static {
        new class446("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)I", line = 7)
    public final int method3078(int arg0) {
        if (arg0 != 100) {
            this.method3084(2);
        }
        field7571++;
        return this.field7595;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)[B", line = 20)
    public final byte[] method2602(int arg0, int arg1) {
        field7594++;
        class175 var3 = this.method3079(arg0, arg1, true);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method480((byte) 118);
            var3.method25(-13489);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIZ)Lmb;", line = 46)
    private final class175 method3079(int arg0, int arg1, boolean arg2) {
        field7588++;
        class175 var4 = (class175) this.field7593.method1747((long) arg0, false);
        if (var4 != null && arg1 == 0 && !var4.field2344 && var4.field2342) {
            var4.method25(-13489);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field7584 == null || this.field7583[arg0] == -1) {
                    if (this.field7596.method887((byte) -78)) {
                        return null;
                    }
                    var4 = this.field7596.method891(true, 0, (byte) 2, arg0, this.field7586);
                } else {
                    var4 = this.field7573.method3143(arg0, (byte) 90, this.field7584);
                }
            } else if (arg1 == 1) {
                if (this.field7584 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field7573.method3146(true, arg0, this.field7584);
            } else if (arg1 == 2) {
                if (this.field7584 == null) {
                    throw new RuntimeException();
                }
                if (this.field7583[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field7596.method890((byte) -124)) {
                    return null;
                }
                var4 = this.field7596.method891(false, 0, (byte) 2, arg0, this.field7586);
            } else {
                throw new RuntimeException();
            }
            this.field7593.method1751((long) arg0, -103, var4);
        }
        if (var4.field2342) {
            return null;
        }
        byte[] var5 = var4.method480((byte) 118);
        if (!arg2) {
            this.method2600((byte) -21);
        }
        if (!var4 instanceof class457) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class509.field7480.reset();
                class509.field7480.update(var5, 0, var5.length - 2);
                int var9 = (int) class509.field7480.getValue();
                if (this.field7592.field3380[arg0] != var9) {
                    throw new RuntimeException();
                }
                this.field7596.field1777 = 0;
                this.field7596.field1778 = 0;
            } catch (RuntimeException var12) {
                this.field7596.method885((byte) -39);
                var4.method25(-13489);
                if (var4.field2344 && !this.field7596.method887((byte) -78)) {
                    class67 var10 = this.field7596.method891(true, 0, (byte) 2, arg0, this.field7586);
                    this.field7593.method1751((long) arg0, -121, var10);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field7592.field3391[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field7592.field3391[arg0];
            if (this.field7584 != null) {
                this.field7573.method3144(var5, this.field7584, false, arg0);
                if (this.field7583[arg0] != 1) {
                    this.field7595++;
                    this.field7583[arg0] = 1;
                }
            }
            if (!var4.field2344) {
                var4.method25(-13489);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class509.field7480.reset();
            class509.field7480.update(var5, 0, var5.length - 2);
            int var6 = (int) class509.field7480.getValue();
            if (this.field7592.field3380[arg0] != var6) {
                throw new RuntimeException();
            }
            int var7 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field7592.field3391[arg0] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field7583[arg0] != 1) {
                this.field7595++;
                this.field7583[arg0] = 1;
            }
            if (!var4.field2344) {
                var4.method25(-13489);
            }
            return var4;
        } catch (Exception var11) {
            this.field7583[arg0] = -1;
            var4.method25(-13489);
            if (var4.field2344 && !this.field7596.method887((byte) -78)) {
                class67 var8 = this.field7596.method891(true, 0, (byte) 2, arg0, this.field7586);
                this.field7593.method1751((long) arg0, -101, var8);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V", line = 260)
    public final void method3080(boolean arg0) {
        field7590++;
        if (this.field7584 != null) {
            this.field7599 = arg0;
            if (this.field7598 == null) {
                this.field7598 = new class63();
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)V", line = 277)
    public final void method2599(int arg0, int arg1) {
        field7577++;
        if (this.field7584 == null) {
            return;
        }
        for (class5 var3 = this.field7597.method445(33); var3 != null; var3 = this.field7597.method451(false)) {
            if (((long) arg0) == var3.field35) {
                return;
            }
        }
        if (arg1 != -2) {
            this.field7584 = null;
        }
        class5 var4 = new class5();
        var4.field35 = arg0;
        this.field7597.method453((byte) 125, var4);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)I", line = 307)
    public final int method2603(int arg0, byte arg1) {
        field7576++;
        class175 var3 = (class175) this.field7593.method1747((long) arg0, false);
        if (var3 == null) {
            if (arg1 != -118) {
                this.field7600 = false;
            }
            return 0;
        } else {
            return var3.method479(0);
        }
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(II)Luo;", line = 324)
    public static final class412 method3081(int arg0, int arg1) {
        if (arg1 == -1) {
            field7580++;
            return class370.field5657 && class44.field638 <= arg0 && arg0 <= class433.field6583 ? class278.field3944[arg0 - class44.field638] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(Z)V", line = 344)
    public final void method3082(boolean arg0) {
        field7591++;
        if (this.field7598 != null) {
            if (this.method2600((byte) -75) == null) {
                return;
            }
            if (this.field7600) {
                boolean var6 = true;
                for (class5 var7 = this.field7598.method445(33); var7 != null; var7 = this.field7598.method451(!arg0)) {
                    int var9 = (int) var7.field35;
                    if (this.field7583[var9] == 0) {
                        this.method3079(var9, 1, true);
                    }
                    if (this.field7583[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method25(-13489);
                    }
                }
                while (this.field7592.field3386.length > this.field7601) {
                    if (this.field7592.field3386[this.field7601] == 0) {
                        this.field7601++;
                    } else {
                        if (this.field7573.field7826 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field7583[this.field7601] == 0) {
                            this.method3079(this.field7601, 1, true);
                        }
                        if (this.field7583[this.field7601] == 0) {
                            class5 var8 = new class5();
                            var8.field35 = this.field7601;
                            this.field7598.method453((byte) 127, var8);
                            var6 = false;
                        }
                        this.field7601++;
                    }
                }
                if (var6) {
                    this.field7600 = false;
                    this.field7601 = 0;
                }
            } else if (this.field7599) {
                boolean var2 = true;
                for (class5 var3 = this.field7598.method445(33); var3 != null; var3 = this.field7598.method451(false)) {
                    int var5 = (int) var3.field35;
                    if (this.field7583[var5] != 1) {
                        this.method3079(var5, 2, true);
                    }
                    if (this.field7583[var5] == 1) {
                        var3.method25(-13489);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field7601 < this.field7592.field3386.length) {
                    if (this.field7592.field3386[this.field7601] == 0) {
                        this.field7601++;
                    } else {
                        if (this.field7596.method890((byte) -123)) {
                            var2 = false;
                            break;
                        }
                        if (this.field7583[this.field7601] != 1) {
                            this.method3079(this.field7601, 2, true);
                        }
                        if (this.field7583[this.field7601] != 1) {
                            class5 var4 = new class5();
                            var4.field35 = this.field7601;
                            var2 = false;
                            this.field7598.method453((byte) 120, var4);
                        }
                        this.field7601++;
                    }
                }
                if (var2) {
                    this.field7599 = false;
                    this.field7601 = 0;
                }
            } else {
                this.field7598 = null;
            }
        }
        if (!arg0 || !this.field7602 || this.field7603 > class58.method427((byte) -19)) {
            return;
        }
        for (class175 var10 = (class175) this.field7593.method1743(false); var10 != null; var10 = (class175) this.field7593.method1742(-73)) {
            if (!var10.field2342) {
                if (var10.field2339) {
                    if (!var10.field2344) {
                        throw new RuntimeException();
                    }
                    var10.method25(-13489);
                } else {
                    var10.field2339 = true;
                }
            }
        }
        this.field7603 = class58.method427((byte) -19) + 1000L;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V", line = 524)
    public final void method3083(int arg0) {
        field7582++;
        if (this.field7598 == null || this.method2600((byte) -109) == null) {
            return;
        }
        class5 var2 = this.field7597.method445(33);
        if (arg0 != -1) {
            this.method3086(88);
        }
        while (var2 != null) {
            int var3 = (int) var2.field35;
            if (var3 < 0 || var3 >= this.field7592.field3388 || this.field7592.field3386[var3] == 0) {
                var2.method25(-13489);
            } else {
                if (this.field7583[var3] == 0) {
                    this.method3079(var3, 1, true);
                }
                if (this.field7583[var3] == -1) {
                    this.method3079(var3, 2, true);
                }
                if (this.field7583[var3] == 1) {
                    var2.method25(-13489);
                }
            }
            var2 = this.field7597.method451(false);
        }
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)I", line = 578)
    public final int method3084(int arg0) {
        field7570++;
        if (arg0 != -14586) {
            this.method3083(-67);
        }
        if (this.method2600((byte) -96) == null) {
            return this.field7587 == null ? 0 : this.field7587.method479(0);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V", line = 604)
    public static void method3085(int arg0) {
        field7574 = null;
        if (arg0 != -2) {
            method3085(100);
        }
    }

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)I", line = 615)
    public final int method3086(int arg0) {
        field7579++;
        if (this.field7592 == null) {
            return 0;
        } else {
            if (arg0 > -61) {
                this.method3087(29);
            }
            return this.field7592.field3392;
        }
    }

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "(I)I", line = 630)
    public final int method3087(int arg0) {
        if (arg0 > -88) {
            this.field7593 = null;
        }
        field7589++;
        if (this.field7592 == null) {
            return 0;
        } else if (this.field7600) {
            class5 var2 = this.field7598.method445(33);
            return var2 == null ? 0 : (int) var2.field35;
        } else {
            return this.field7592.field3392;
        }
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(ILvc;Lvc;Lpq;Lqc;IIZ)V", line = 772)
    public class516(int arg0, class211 arg1, class211 arg2, class131 arg3, class532 arg4, int arg5, int arg6, boolean arg7) {
        this.field7586 = arg0;
        this.field7584 = arg1;
        if (this.field7584 == null) {
            this.field7600 = false;
        } else {
            this.field7600 = true;
            this.field7598 = new class63();
        }
        this.field7596 = arg3;
        this.field7581 = arg2;
        this.field7585 = arg6;
        this.field7602 = arg7;
        this.field7573 = arg4;
        this.field7575 = arg5;
        if (this.field7581 != null) {
            this.field7587 = this.field7573.method3143(this.field7586, (byte) 90, this.field7581);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)Lkm;", line = 657)
    public final class241 method2600(byte arg0) {
        field7572++;
        if (this.field7592 != null) {
            return this.field7592;
        }
        if (this.field7587 == null) {
            if (this.field7596.method887((byte) -78)) {
                return null;
            }
            this.field7587 = this.field7596.method891(true, 0, (byte) 0, this.field7586, 255);
        }
        if (this.field7587.field2342) {
            return null;
        } else if (arg0 > -57) {
            return null;
        } else {
            byte[] var2 = this.field7587.method480((byte) 118);
            if (this.field7587 instanceof class457) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field7592 = new class241(var2, this.field7575);
                    if (this.field7592.field3393 != this.field7585) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field7592 = null;
                    if (this.field7596.method887((byte) -78)) {
                        this.field7587 = null;
                    } else {
                        this.field7587 = this.field7596.method891(true, 0, (byte) 0, this.field7586, 255);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field7592 = new class241(var2, this.field7575);
                } catch (RuntimeException var4) {
                    this.field7596.method885((byte) -39);
                    this.field7592 = null;
                    if (this.field7596.method887((byte) -78)) {
                        this.field7587 = null;
                    } else {
                        this.field7587 = this.field7596.method891(true, 0, (byte) 0, this.field7586, 255);
                    }
                    return null;
                }
                if (this.field7581 != null) {
                    this.field7573.method3144(var2, this.field7581, false, this.field7586);
                }
            }
            if (this.field7584 != null) {
                this.field7583 = new byte[this.field7592.field3388];
                this.field7595 = 0;
            }
            this.field7587 = null;
            return this.field7592;
        }
    }
}
