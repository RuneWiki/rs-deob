import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class138 extends class418 {

    @OriginalMember(owner = "client!fq", name = "v", descriptor = "I")
    private int field2145 = 0;

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "Lhl;")
    private class375 field2131 = new class375(16);

    @OriginalMember(owner = "client!fq", name = "D", descriptor = "I")
    private int field2153 = 0;

    @OriginalMember(owner = "client!fq", name = "E", descriptor = "Lgw;")
    private class118 field2154 = new class118();

    @OriginalMember(owner = "client!fq", name = "J", descriptor = "J")
    private long field2158 = 0L;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
    private int field2129;

    @OriginalMember(owner = "client!fq", name = "w", descriptor = "Lwf;")
    private class91 field2146;

    @OriginalMember(owner = "client!fq", name = "C", descriptor = "Z")
    private boolean field2152;

    @OriginalMember(owner = "client!fq", name = "I", descriptor = "Lgw;")
    private class118 field2157;

    @OriginalMember(owner = "client!fq", name = "j", descriptor = "I")
    private int field2133;

    @OriginalMember(owner = "client!fq", name = "l", descriptor = "I")
    private int field2135;

    @OriginalMember(owner = "client!fq", name = "s", descriptor = "Lum;")
    private class371 field2142;

    @OriginalMember(owner = "client!fq", name = "B", descriptor = "Lwf;")
    private class91 field2151;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "Loi;")
    private class52 field2130;

    @OriginalMember(owner = "client!fq", name = "K", descriptor = "Z")
    private boolean field2159;

    @OriginalMember(owner = "client!fq", name = "x", descriptor = "Lwl;")
    private class287 field2147;

    @OriginalMember(owner = "client!fq", name = "y", descriptor = "[Lwn;")
    public static class519[] field2148;

    @OriginalMember(owner = "client!fq", name = "F", descriptor = "Z")
    public static boolean field2155;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!fq", name = "m", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!fq", name = "n", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!fq", name = "o", descriptor = "I")
    public static int field2138;

    @OriginalMember(owner = "client!fq", name = "q", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!fq", name = "r", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!fq", name = "t", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!fq", name = "u", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!fq", name = "z", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!fq", name = "A", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!fq", name = "p", descriptor = "Lss;")
    private class303 field2139;

    @OriginalMember(owner = "client!fq", name = "H", descriptor = "Z")
    private boolean field2156;

    @OriginalMember(owner = "client!fq", name = "k", descriptor = "[B")
    private byte[] field2134;

    static {
        new class44("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        field2148 = new class519[2048];
        new class44("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
        field2155 = false;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(BII)Lwl;", line = 3)
    private final class287 method999(byte arg0, int arg1, int arg2) {
        field2127++;
        if (arg0 <= 8) {
            this.method999((byte) 18, 27, 69);
        }
        class287 var4 = (class287) this.field2131.method2284(true, (long) arg1);
        if (var4 != null && arg2 == 0 && !var4.field4253 && var4.field4248) {
            var4.method421(22071);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field2146 == null || this.field2134[arg1] == -1) {
                    if (this.field2130.method457((byte) -117)) {
                        return null;
                    }
                    var4 = this.field2130.method461(-87, (byte) 2, true, this.field2129, arg1);
                } else {
                    var4 = this.field2142.method2269(42, arg1, this.field2146);
                }
            } else if (arg2 == 1) {
                if (this.field2146 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field2142.method2273(this.field2146, 125, arg1);
            } else if (arg2 == 2) {
                if (this.field2146 == null) {
                    throw new RuntimeException();
                }
                if (this.field2134[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field2130.method463((byte) 112)) {
                    return null;
                }
                var4 = this.field2130.method461(-53, (byte) 2, false, this.field2129, arg1);
            } else {
                throw new RuntimeException();
            }
            this.field2131.method2292((long) arg1, var4, (byte) -127);
        }
        if (var4.field4248) {
            return null;
        }
        byte[] var5 = var4.method398((byte) 68);
        if (!var4 instanceof class38) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class76.field1244.reset();
                class76.field1244.update(var5, 0, var5.length - 2);
                int var9 = (int) class76.field1244.getValue();
                if (this.field2139.field4499[arg1] != var9) {
                    throw new RuntimeException();
                }
                this.field2130.field972 = 0;
                this.field2130.field971 = 0;
            } catch (RuntimeException var12) {
                this.field2130.method453(-1);
                var4.method421(22071);
                if (var4.field4253 && !this.field2130.method457((byte) -117)) {
                    class297 var10 = this.field2130.method461(-48, (byte) 2, true, this.field2129, arg1);
                    this.field2131.method2292((long) arg1, var10, (byte) -127);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field2139.field4491[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field2139.field4491[arg1];
            if (this.field2146 != null) {
                this.field2142.method2274(this.field2146, 2, arg1, var5);
                if (this.field2134[arg1] != 1) {
                    this.field2145++;
                    this.field2134[arg1] = 1;
                }
            }
            if (!var4.field4253) {
                var4.method421(22071);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class76.field1244.reset();
            class76.field1244.update(var5, 0, var5.length - 2);
            int var6 = (int) class76.field1244.getValue();
            if (this.field2139.field4499[arg1] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field2139.field4491[arg1] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field2134[arg1] != 1) {
                this.field2145++;
                this.field2134[arg1] = 1;
            }
            if (!var4.field4253) {
                var4.method421(22071);
            }
            return var4;
        } catch (Exception var11) {
            this.field2134[arg1] = -1;
            var4.method421(22071);
            if (var4.field4253 && !this.field2130.method457((byte) -117)) {
                class297 var8 = this.field2130.method461(-45, (byte) 2, true, this.field2129, arg1);
                this.field2131.method2292((long) arg1, var8, (byte) -127);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)Lss;", line = 219)
    public final class303 method1000(int arg0) {
        field2136++;
        if (this.field2139 != null) {
            return this.field2139;
        }
        if (this.field2147 == null) {
            if (this.field2130.method457((byte) -117)) {
                return null;
            }
            this.field2147 = this.field2130.method461(-90, (byte) 0, true, 255, this.field2129);
        }
        if (this.field2147.field4248) {
            return null;
        }
        byte[] var2 = this.field2147.method398((byte) 68);
        if (arg0 != 31977) {
            return null;
        }
        if (this.field2147 instanceof class38) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2139 = new class303(var2, this.field2135);
                if (this.field2139.field4489 != this.field2133) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field2139 = null;
                if (this.field2130.method457((byte) -117)) {
                    this.field2147 = null;
                } else {
                    this.field2147 = this.field2130.method461(arg0 ^ 0xFFFF833C, (byte) 0, true, 255, this.field2129);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2139 = new class303(var2, this.field2135);
            } catch (RuntimeException var4) {
                this.field2130.method453(-1);
                this.field2139 = null;
                if (this.field2130.method457((byte) -117)) {
                    this.field2147 = null;
                } else {
                    this.field2147 = this.field2130.method461(-46, (byte) 0, true, 255, this.field2129);
                }
                return null;
            }
            if (this.field2151 != null) {
                this.field2142.method2274(this.field2151, 2, this.field2129, var2);
            }
        }
        if (this.field2146 != null) {
            this.field2134 = new byte[this.field2139.field4500];
            this.field2145 = 0;
        }
        this.field2147 = null;
        return this.field2139;
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(I)I", line = 320)
    public final int method1001(int arg0) {
        int var2 = -55 / ((17 - arg0) / 37);
        field2150++;
        return this.field2145;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(ZI)V", line = 330)
    public final void method1002(boolean arg0, int arg1) {
        field2138++;
        if (this.field2146 == null) {
            return;
        }
        for (class42 var3 = this.field2154.method863(-1); var3 != null; var3 = this.field2154.method865(-1)) {
            if ((long) arg1 == var3.field863) {
                return;
            }
        }
        class42 var4 = new class42();
        var4.field863 = arg1;
        if (!arg0) {
            this.field2154.method866((byte) 10, var4);
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(B)V", line = 360)
    public final void method1003(byte arg0) {
        field2141++;
        if (this.field2157 == null || this.method1000(31977) == null) {
            return;
        }
        class42 var2 = this.field2154.method863(arg0 ^ 0xD);
        if (arg0 != -14) {
            this.method1008((byte) -26);
        }
        while (var2 != null) {
            int var3 = (int) var2.field863;
            if (var3 < 0 || this.field2139.field4500 <= var3 || this.field2139.field4487[var3] == 0) {
                var2.method421(22071);
            } else {
                if (this.field2134[var3] == 0) {
                    this.method999((byte) 112, var3, 1);
                }
                if (this.field2134[var3] == -1) {
                    this.method999((byte) 85, var3, 2);
                }
                if (this.field2134[var3] == 1) {
                    var2.method421(22071);
                }
            }
            var2 = this.field2154.method865(-1);
        }
    }

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "(I)V", line = 407)
    public final void method1004(int arg0) {
        if (arg0 > 0) {
            this.field2159 = true;
        }
        field2140++;
        if (this.field2157 != null) {
            if (this.method1000(31977) == null) {
                return;
            }
            if (this.field2152) {
                boolean var6 = true;
                for (class42 var7 = this.field2157.method863(-1); var7 != null; var7 = this.field2157.method865(-1)) {
                    int var9 = (int) var7.field863;
                    if (this.field2134[var9] == 0) {
                        this.method999((byte) 44, var9, 1);
                    }
                    if (this.field2134[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method421(22071);
                    }
                }
                while (this.field2139.field4487.length > this.field2153) {
                    if (this.field2139.field4487[this.field2153] == 0) {
                        this.field2153++;
                    } else {
                        if (this.field2142.field5356 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field2134[this.field2153] == 0) {
                            this.method999((byte) 88, this.field2153, 1);
                        }
                        if (this.field2134[this.field2153] == 0) {
                            class42 var8 = new class42();
                            var8.field863 = this.field2153;
                            var6 = false;
                            this.field2157.method866((byte) 10, var8);
                        }
                        this.field2153++;
                    }
                }
                if (var6) {
                    this.field2152 = false;
                    this.field2153 = 0;
                }
            } else if (this.field2156) {
                boolean var2 = true;
                for (class42 var3 = this.field2157.method863(-1); var3 != null; var3 = this.field2157.method865(-1)) {
                    int var5 = (int) var3.field863;
                    if (this.field2134[var5] != 1) {
                        this.method999((byte) 74, var5, 2);
                    }
                    if (this.field2134[var5] == 1) {
                        var3.method421(22071);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field2139.field4487.length > this.field2153) {
                    if (this.field2139.field4487[this.field2153] == 0) {
                        this.field2153++;
                    } else {
                        if (this.field2130.method463((byte) 112)) {
                            var2 = false;
                            break;
                        }
                        if (this.field2134[this.field2153] != 1) {
                            this.method999((byte) 72, this.field2153, 2);
                        }
                        if (this.field2134[this.field2153] != 1) {
                            class42 var4 = new class42();
                            var4.field863 = this.field2153;
                            this.field2157.method866((byte) 10, var4);
                            var2 = false;
                        }
                        this.field2153++;
                    }
                }
                if (var2) {
                    this.field2153 = 0;
                    this.field2156 = false;
                }
            } else {
                this.field2157 = null;
            }
        }
        if (!this.field2159 || this.field2158 > class165.method1188((byte) 26)) {
            return;
        }
        for (class287 var10 = (class287) this.field2131.method2285(86); var10 != null; var10 = (class287) this.field2131.method2283((byte) 11)) {
            if (!var10.field4248) {
                if (var10.field4255) {
                    if (!var10.field4253) {
                        throw new RuntimeException();
                    }
                    var10.method421(22071);
                } else {
                    var10.field4255 = true;
                }
            }
        }
        this.field2158 = class165.method1188((byte) 26) + 1000L;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(II)[B", line = 589)
    public final byte[] method1005(int arg0, int arg1) {
        field2137++;
        class287 var3 = this.method999((byte) 38, arg1, arg0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method398((byte) 68);
            var3.method421(22071);
            return var4;
        }
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(B)I", line = 608)
    public final int method1006(byte arg0) {
        field2132++;
        if (this.field2139 == null) {
            return 0;
        } else {
            int var2 = -29 % ((43 - arg0) / 37);
            return this.field2139.field4485;
        }
    }

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "(I)I", line = 625)
    public final int method1007(int arg0) {
        if (arg0 != 0) {
            this.field2135 = -6;
        }
        field2126++;
        if (this.method1000(31977) == null) {
            return this.field2147 == null ? 0 : this.field2147.method399(-22900);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "(B)I", line = 644)
    public final int method1008(byte arg0) {
        field2143++;
        if (this.field2139 == null) {
            return 0;
        } else if (this.field2152) {
            if (arg0 < 110) {
                this.field2135 = 124;
            }
            class42 var2 = this.field2157.method863(-1);
            return var2 == null ? 0 : (int) var2.field863;
        } else {
            return this.field2139.field4485;
        }
    }

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "(II)I", line = 669)
    public final int method1009(int arg0, int arg1) {
        field2128++;
        class287 var3 = (class287) this.field2131.method2284(true, (long) arg0);
        if (var3 == null) {
            return arg1 == 0 ? 0 : -105;
        } else {
            return var3.method399(arg1 - 22900);
        }
    }

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "(I)V", line = 689)
    public final void method1010(int arg0) {
        if (arg0 >= -23) {
            this.method1006((byte) -106);
        }
        field2144++;
        if (this.field2146 != null) {
            this.field2156 = true;
            if (this.field2157 == null) {
                this.field2157 = new class118();
            }
        }
    }

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "(I)V", line = 708)
    public static void method1011(int arg0) {
        int var1 = 44 / ((-arg0 - 38) / 56);
        field2148 = null;
    }

    @OriginalMember(owner = "client!fq", name = "<init>", descriptor = "(ILwf;Lwf;Loi;Lum;IIZ)V", line = 808)
    public class138(int arg0, class91 arg1, class91 arg2, class52 arg3, class371 arg4, int arg5, int arg6, boolean arg7) {
        this.field2129 = arg0;
        this.field2146 = arg1;
        if (this.field2146 == null) {
            this.field2152 = false;
        } else {
            this.field2152 = true;
            this.field2157 = new class118();
        }
        this.field2133 = arg6;
        this.field2135 = arg5;
        this.field2142 = arg4;
        this.field2151 = arg2;
        this.field2130 = arg3;
        this.field2159 = arg7;
        if (this.field2151 != null) {
            this.field2147 = this.field2142.method2269(105, this.field2129, this.field2151);
        }
    }

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "(I)V", line = 737)
    public static final void method1012(int arg0) {
        class451.field6589.method2178(1);
        field2149++;
        class90.field1452.method595(false);
        class303.field4490.method574((byte) -46);
        class277.field4139.method570((byte) 126);
        class117.field1812.method2308(false);
        class58.field1052.method1640(0);
        class96.field1526.method2720(arg0 - 7634);
        class69.field1133.method1315((byte) 94);
        class6.field36.method2150(64);
        class429.field6177.method433(-30038);
        class147.field2266.method1251(55);
        class389.field5528.method2875(-18659);
        class506.field7320.method1424((byte) 102);
        class159.field2443.method1917(false);
        class510.field7361.method2009(arg0 ^ 0xFFFFE657);
        class175.field2614.method1020(arg0 - 7453);
        class59.field1057.method893((byte) 76);
        class163.field2468.method2423(true);
        class355.field5172.method1419((byte) -116);
        class88.field1430.method1244((byte) 112);
        class7.method23(70);
        class312.method1985(true);
        class234.method1552(arg0 - 7576);
        if (arg0 != 7576) {
            method1012(125);
        }
        class266.method1711(0);
        class52.field962.method2980(arg0 ^ 0xF51A7B70);
        class152.field2322.method2980(-182819096);
        class417.field5914.method2980(-182819096);
        class128.field1997.method2980(-182819096);
        class281.field4208.method2980(arg0 - 182826672);
    }
}
