import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class571 extends class39 {

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "I")
    private int field8234 = 0;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "Lsd;")
    private class80 field8252 = new class80(16);

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
    private int field8258 = 0;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "Leea;")
    private class114 field8256 = new class114();

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "J")
    private long field8260 = 0L;

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "Lls;")
    private class121 field8239;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
    private int field8243;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "Z")
    private boolean field8254;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "Leea;")
    private class114 field8257;

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "Z")
    private boolean field8261;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "Lkf;")
    private class215 field8251;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    private int field8247;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "Lls;")
    private class121 field8225;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "[B")
    private byte[] field8250;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "I")
    private int field8228;

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "Ljq;")
    private class443 field8227;

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "Ldr;")
    private class624 field8235;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "I")
    public static int field8232 = 0;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
    public static int field8248 = 0;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "Lea;")
    public static class474 field8233 = new class474("M", "M", "M", "M");

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    public static int field8226;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field8230;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field8231;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
    public static int field8236;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field8237;

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "I")
    public static int field8238;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
    public static int field8240;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public static int field8242;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public static int field8244;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "I")
    public static int field8245;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "I")
    public static int field8246;

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "I")
    public static int field8253;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "I")
    public static int field8255;

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "Lbs;")
    private class598 field8249;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "Z")
    private boolean field8259;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "[B")
    private byte[] field8229;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "[S")
    public static short[] field8241;

    static {
        new class474("You can't reach that.", "Da kommst du nicht hin.", "Vous ne pouvez pas l'atteindre.", "Você não consegue alcançar isso.");
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(IB)I", line = 3)
    public final int method209(int arg0, byte arg1) {
        field8236++;
        class624 var3 = (class624) this.field8252.method524((byte) 110, (long) arg0);
        if (arg1 < 90) {
            this.method208(-26, 23);
        }
        return var3 == null ? 0 : var3.method600((byte) 54);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(III)Z", line = 23)
    public static final boolean method3315(int arg0, int arg1, int arg2) {
        int var3 = class326.field4697[arg0][arg1][arg2];
        if (-class348.field4982 == var3) {
            return false;
        } else if (class348.field4982 == var3) {
            return true;
        } else {
            int var4 = arg1 << class465.field6917;
            int var5 = arg2 << class465.field6917;
            if (class237.method1590(var4 + 1, class435.field6449[arg0].method259(arg1, arg2), var5 + 1) && class237.method1590(class193.field2559 + var4 - 1, class435.field6449[arg0].method259(arg1 + 1, arg2), var5 + 1) && class237.method1590(class193.field2559 + var4 - 1, class435.field6449[arg0].method259(arg1 + 1, arg2 + 1), class193.field2559 + var5 - 1) && class237.method1590(var4 + 1, class435.field6449[arg0].method259(arg1, arg2 + 1), class193.field2559 + var5 - 1) && class237.method1590(class170.field2095 + var4, class435.field6449[arg0].method259(arg1, arg2), var5 + 1) && class237.method1590(class193.field2559 + var4 - 1, class435.field6449[arg0].method259(arg1 + 1, arg2), class170.field2095 + var5) && class237.method1590(class170.field2095 + var4, class435.field6449[arg0].method259(arg1, arg2 + 1), class193.field2559 + var5 - 1) && class237.method1590(class193.field2559 + var4 - 1, class435.field6449[arg0].method259(arg1, arg2), class170.field2095 + var5) && class237.method1590(class170.field2095 + var4, class435.field6449[arg0].method259(arg1, arg2), class170.field2095 + var5)) {
                class326.field4697[arg0][arg1][arg2] = class348.field4982;
                return true;
            } else {
                class326.field4697[arg0][arg1][arg2] = -class348.field4982;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(III)Ldr;", line = 48)
    private final class624 method3316(int arg0, int arg1, int arg2) {
        if (arg1 != -4045) {
            this.method207(-116, (byte) 19);
        }
        field8240++;
        class624 var4 = (class624) this.field8252.method524((byte) 121, (long) arg2);
        if (var4 != null && arg0 == 0 && !var4.field9008 && var4.field9009) {
            var4.method2108(true);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field8239 == null || this.field8229[arg2] == -1) {
                    if (this.field8227.method2773(86)) {
                        return null;
                    }
                    var4 = this.field8227.method2760(this.field8243, (byte) 2, arg1 ^ 0xFFFFF033, arg2, true);
                } else {
                    var4 = this.field8251.method1416(arg2, (byte) 109, this.field8239);
                }
            } else if (arg0 == 1) {
                if (this.field8239 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field8251.method1420(arg2, false, this.field8239);
            } else if (arg0 == 2) {
                if (this.field8239 == null) {
                    throw new RuntimeException();
                }
                if (this.field8229[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field8227.method2767(-120)) {
                    return null;
                }
                var4 = this.field8227.method2760(this.field8243, (byte) 2, 0, arg2, false);
            } else {
                throw new RuntimeException();
            }
            this.field8252.method520((byte) -97, var4, (long) arg2);
        }
        if (var4.field9009) {
            return null;
        }
        byte[] var5 = var4.method603((byte) 121);
        if (!(var4 instanceof class472)) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class239.field3403.reset();
                class239.field3403.update(var5, 0, var5.length - 2);
                int var6 = (int) class239.field3403.getValue();
                if (this.field8249.field8731[arg2] != var6) {
                    throw new RuntimeException();
                }
                if (this.field8249.field8744 != null && this.field8249.field8744[arg2] != null) {
                    byte[] var7 = this.field8249.field8744[arg2];
                    byte[] var8 = class408.method2585(var5.length - 2, var5, 0, 72);
                    for (int var9 = 0; var9 < 64; var9++) {
                        if (var7[var9] != var8[var9]) {
                            throw new RuntimeException();
                        }
                    }
                }
                this.field8227.field6639 = 0;
                this.field8227.field6636 = 0;
            } catch (RuntimeException var17) {
                this.field8227.method2766(arg1 + 33820);
                var4.method2108(true);
                if (var4.field9008 && !this.field8227.method2773(106)) {
                    class96 var10 = this.field8227.method2760(this.field8243, (byte) 2, 0, arg2, true);
                    this.field8252.method520((byte) -88, var10, (long) arg2);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field8249.field8743[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field8249.field8743[arg2];
            if (this.field8239 != null) {
                this.field8251.method1421(var5, arg2, this.field8239, arg1 - 15867);
                if (this.field8229[arg2] != 1) {
                    this.field8234++;
                    this.field8229[arg2] = 1;
                }
            }
            if (!var4.field9008) {
                var4.method2108(true);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class239.field3403.reset();
            class239.field3403.update(var5, 0, var5.length - 2);
            int var11 = (int) class239.field3403.getValue();
            if (this.field8249.field8731[arg2] != var11) {
                throw new RuntimeException();
            }
            if (this.field8249.field8744 != null && this.field8249.field8744[arg2] != null) {
                byte[] var12 = this.field8249.field8744[arg2];
                byte[] var13 = class408.method2585(var5.length - 2, var5, 0, arg1 ^ 0xFFFFF059);
                for (int var14 = 0; var14 < 64; var14++) {
                    if (var12[var14] != var13[var14]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var15 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field8249.field8743[arg2] & 0xFFFF) != var15) {
                throw new RuntimeException();
            }
            if (this.field8229[arg2] != 1) {
                this.field8234++;
                this.field8229[arg2] = 1;
            }
            if (!var4.field9008) {
                var4.method2108(true);
            }
            return var4;
        } catch (Exception var18) {
            this.field8229[arg2] = -1;
            var4.method2108(true);
            if (var4.field9008 && !this.field8227.method2773(72)) {
                class96 var16 = this.field8227.method2760(this.field8243, (byte) 2, 0, arg2, true);
                this.field8252.method520((byte) -82, var16, (long) arg2);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V", line = 315)
    public final void method3317(byte arg0) {
        field8246++;
        if (arg0 < -88 && this.field8239 != null) {
            this.field8259 = true;
            if (this.field8257 == null) {
                this.field8257 = new class114();
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V", line = 338)
    public final void method3318(int arg0) {
        field8244++;
        if (this.field8257 != null) {
            if (this.method211(111) == null) {
                return;
            }
            if (this.field8254) {
                boolean var6 = true;
                for (class324 var7 = this.field8257.method719(false); var7 != null; var7 = this.field8257.method716(14)) {
                    int var9 = (int) var7.field4676;
                    if (this.field8229[var9] == 0) {
                        this.method3316(1, -4045, var9);
                    }
                    if (this.field8229[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method2108(true);
                    }
                }
                while (this.field8258 < this.field8249.field8735.length) {
                    if (this.field8249.field8735[this.field8258] == 0) {
                        this.field8258++;
                    } else {
                        if (this.field8251.field2967 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field8229[this.field8258] == 0) {
                            this.method3316(1, -4045, this.field8258);
                        }
                        if (this.field8229[this.field8258] == 0) {
                            class324 var8 = new class324();
                            var8.field4676 = this.field8258;
                            this.field8257.method706(var8, true);
                            var6 = false;
                        }
                        this.field8258++;
                    }
                }
                if (var6) {
                    this.field8254 = false;
                    this.field8258 = 0;
                }
            } else if (this.field8259) {
                boolean var2 = true;
                for (class324 var3 = this.field8257.method719(false); var3 != null; var3 = this.field8257.method716(14)) {
                    int var5 = (int) var3.field4676;
                    if (this.field8229[var5] != 1) {
                        this.method3316(2, -4045, var5);
                    }
                    if (this.field8229[var5] == 1) {
                        var3.method2108(true);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field8249.field8735.length > this.field8258) {
                    if (this.field8249.field8735[this.field8258] == 0) {
                        this.field8258++;
                    } else {
                        if (this.field8227.method2767(-94)) {
                            var2 = false;
                            break;
                        }
                        if (this.field8229[this.field8258] != 1) {
                            this.method3316(2, -4045, this.field8258);
                        }
                        if (this.field8229[this.field8258] != 1) {
                            class324 var4 = new class324();
                            var4.field4676 = this.field8258;
                            var2 = false;
                            this.field8257.method706(var4, true);
                        }
                        this.field8258++;
                    }
                }
                if (var2) {
                    this.field8258 = 0;
                    this.field8259 = false;
                }
            } else {
                this.field8257 = null;
            }
        }
        if (this.field8261 && class84.method550((byte) -106) >= this.field8260) {
            for (class624 var10 = (class624) this.field8252.method523(-113); var10 != null; var10 = (class624) this.field8252.method530(12714)) {
                if (!var10.field9009) {
                    if (var10.field9007) {
                        if (!var10.field9008) {
                            throw new RuntimeException();
                        }
                        var10.method2108(true);
                    } else {
                        var10.field9007 = true;
                    }
                }
            }
            this.field8260 = class84.method550((byte) -117) + 1000L;
        }
        if (arg0 < 29) {
            this.field8251 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)V", line = 519)
    public final void method207(int arg0, byte arg1) {
        field8231++;
        if (this.field8239 == null) {
            return;
        }
        for (class324 var3 = this.field8256.method719(false); var3 != null; var3 = this.field8256.method716(14)) {
            if ((long) arg0 == var3.field4676) {
                return;
            }
        }
        class324 var4 = new class324();
        int var5 = 126 % ((arg1 + 49) / 60);
        var4.field4676 = arg0;
        this.field8256.method706(var4, true);
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)V", line = 549)
    public final void method3319(byte arg0) {
        if (arg0 != 1) {
            return;
        }
        field8253++;
        if (this.field8257 == null || this.method211(95) == null) {
            return;
        }
        for (class324 var2 = this.field8256.method719(false); var2 != null; var2 = this.field8256.method716(14)) {
            int var3 = (int) var2.field4676;
            if (var3 < 0 || var3 >= this.field8249.field8738 || this.field8249.field8735[var3] == 0) {
                var2.method2108(true);
            } else {
                if (this.field8229[var3] == 0) {
                    this.method3316(1, -4045, var3);
                }
                if (this.field8229[var3] == -1) {
                    this.method3316(2, -4045, var3);
                }
                if (this.field8229[var3] == 1) {
                    var2.method2108(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[Lqf;I)V", line = 596)
    public static final void method3320(int arg0, class593[] arg1, int arg2) {
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class593 var5 = arg1[var3];
            if (var5 != null) {
                if (var5.field8507 == 0) {
                    if (var5.field8512 != null) {
                        method3320(81, var5.field8512, arg2);
                    }
                    class563 var6 = (class563) class234.field3309.method524((byte) 114, (long) var5.field8579);
                    if (var6 != null) {
                        class244.method1626(arg2, -24494, var6.field8022);
                    }
                }
                if (arg2 == 0 && var5.field8557 != null) {
                    class86 var7 = new class86();
                    var7.field985 = var5.field8557;
                    var7.field976 = var5;
                    class604.method3516(var7);
                }
                if (arg2 == 1 && var5.field8546 != null) {
                    if (var5.field8593 >= 0) {
                        class593 var8 = class259.method1728(40, var5.field8579);
                        if (var8 == null || var8.field8512 == null || var8.field8512.length <= var5.field8593 || var8.field8512[var5.field8593] != var5) {
                            continue;
                        }
                    }
                    class86 var9 = new class86();
                    var9.field985 = var5.field8546;
                    var9.field976 = var5;
                    class604.method3516(var9);
                }
            }
        }
        int var4 = -73 / ((arg0 - 18) / 42);
        field8226++;
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)I", line = 670)
    public final int method3321(int arg0) {
        field8238++;
        int var2 = -96 % ((-arg0 - 13) / 53);
        if (this.method211(88) == null) {
            return this.field8235 == null ? 0 : this.field8235.method600((byte) 54);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)I", line = 689)
    public final int method3322(int arg0) {
        if (arg0 != 1) {
            this.method3317((byte) -13);
        }
        field8245++;
        return this.field8249 == null ? 0 : this.field8249.field8734;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[B", line = 704)
    public final byte[] method208(int arg0, int arg1) {
        field8237++;
        class624 var3 = this.method3316(0, -4045, arg0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.method603((byte) 102);
        if (arg1 == 1) {
            var3.method2108(true);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)V", line = 727)
    public static void method3323(byte arg0) {
        if (arg0 > -24) {
            method3315(101, -4, -16);
        }
        field8241 = null;
        field8233 = null;
    }

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)I", line = 739)
    public final int method3324(int arg0) {
        field8230++;
        if (this.field8249 == null) {
            return 0;
        } else if (this.field8254) {
            class324 var2 = this.field8257.method719(false);
            if (var2 == null) {
                return 0;
            } else {
                if (arg0 != 0) {
                    this.method3325(true);
                }
                return (int) var2.field4676;
            }
        } else {
            return this.field8249.field8734;
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)Lbs;", line = 775)
    public final class598 method211(int arg0) {
        field8242++;
        if (this.field8249 != null) {
            return this.field8249;
        } else if (arg0 <= 85) {
            return null;
        } else {
            if (this.field8235 == null) {
                if (this.field8227.method2773(60)) {
                    return null;
                }
                this.field8235 = this.field8227.method2760(255, (byte) 0, 0, this.field8243, true);
            }
            if (this.field8235.field9009) {
                return null;
            }
            byte[] var2 = this.field8235.method603((byte) 126);
            if (this.field8235 instanceof class472) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field8249 = new class598(var2, this.field8228, this.field8250);
                    if (this.field8249.field8727 != this.field8247) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field8249 = null;
                    if (this.field8227.method2773(50)) {
                        this.field8235 = null;
                    } else {
                        this.field8235 = this.field8227.method2760(255, (byte) 0, 0, this.field8243, true);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field8249 = new class598(var2, this.field8228, this.field8250);
                } catch (RuntimeException var4) {
                    this.field8227.method2766(29775);
                    this.field8249 = null;
                    if (this.field8227.method2773(59)) {
                        this.field8235 = null;
                    } else {
                        this.field8235 = this.field8227.method2760(255, (byte) 0, 0, this.field8243, true);
                    }
                    return null;
                }
                if (this.field8225 != null) {
                    this.field8251.method1421(var2, this.field8243, this.field8225, -19912);
                }
            }
            if (this.field8239 != null) {
                this.field8234 = 0;
                this.field8229 = new byte[this.field8249.field8738];
            }
            this.field8235 = null;
            return this.field8249;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(ILls;Lls;Ljq;Lkf;I[BIZ)V", line = 914)
    public class571(int arg0, class121 arg1, class121 arg2, class443 arg3, class215 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field8239 = arg1;
        this.field8243 = arg0;
        if (this.field8239 == null) {
            this.field8254 = false;
        } else {
            this.field8254 = true;
            this.field8257 = new class114();
        }
        this.field8261 = arg8;
        this.field8251 = arg4;
        this.field8247 = arg7;
        this.field8225 = arg2;
        this.field8250 = arg6;
        this.field8228 = arg5;
        this.field8227 = arg3;
        if (this.field8225 != null) {
            this.field8235 = this.field8251.method1416(this.field8243, (byte) 109, this.field8225);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)I", line = 887)
    public final int method3325(boolean arg0) {
        field8255++;
        if (arg0) {
            this.field8261 = true;
        }
        return this.field8234;
    }
}
