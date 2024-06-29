import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class392 {

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "Lqg;")
    public class320 field5929 = new class320();

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "Liv;")
    public static class64 field5945 = new class64(1, -1);

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field5930;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field5940;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "I")
    public static int field5944;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "Lqg;")
    private class320 field5946;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILqg;)V")
    public final void method2417(int arg0, class320 arg1) {
        field5934++;
        if (arg1.field4906 != null) {
            arg1.method2090(-1);
        }
        arg1.field4901 = this.field5929;
        int var3 = 49 / ((arg0 + 79) / 40);
        arg1.field4906 = this.field5929.field4906;
        arg1.field4906.field4901 = arg1;
        arg1.field4901.field4906 = arg1;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZIIIZI)V")
    public static final void method2418(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field5936++;
        if (arg4 != 2) {
            field5945 = null;
        }
        if (arg6 <= arg3) {
            return;
        }
        int var7 = (arg3 + arg6) / 2;
        int var8 = arg3;
        class89 var9 = class403.field6057[var7];
        class403.field6057[var7] = class403.field6057[arg6];
        class403.field6057[arg6] = var9;
        for (int var10 = arg3; var10 < arg6; var10++) {
            if (class14.method92(arg4 ^ 0xA, arg1, class403.field6057[var10], arg0, arg5, arg2, var9) <= 0) {
                class89 var11 = class403.field6057[var10];
                class403.field6057[var10] = class403.field6057[var8];
                class403.field6057[var8++] = var11;
            }
        }
        class403.field6057[arg6] = class403.field6057[var8];
        class403.field6057[var8] = var9;
        method2418(arg0, arg1, arg2, arg3, 2, arg5, var8 - 1);
        method2418(arg0, arg1, arg2, var8 + 1, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public final void method2419(byte arg0) {
        while (true) {
            class320 var2 = this.field5929.field4901;
            if (this.field5929 == var2) {
                field5941++;
                if (arg0 <= 104) {
                    this.field5929 = null;
                }
                this.field5946 = null;
                return;
            }
            var2.method2090(-1);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)I")
    public final int method2420(int arg0) {
        field5942++;
        int var2 = arg0;
        for (class320 var3 = this.field5929.field4901; var3 != this.field5929; var3 = var3.field4901) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lmq;I)V")
    public static final void method2421(class350 arg0, int arg1) {
        field5939++;
        if (class459.field6880 == arg0.field5219) {
            if (class139.field2224.field3684 == null) {
                arg0.field5258 = 0;
                arg0.field5260 = 0;
            } else {
                arg0.field5261 = 150;
                arg0.field5361 = (int) (Math.sin((double) class531.field7821 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field5260 = class148.field2368;
                arg0.field5286 = 5;
                arg0.field5258 = class90.method701(100, class139.field2224.field3684);
                arg0.field5342 = class139.field2224.field7624;
                arg0.field5323 = class139.field2224.field7629;
                arg0.field5276 = class139.field2224.field7666;
                arg0.field5220 = 0;
            }
        } else if (arg1 != 150) {
            field5947 = 117;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)Lqg;")
    public final class320 method2422(int arg0) {
        field5933++;
        class320 var2 = this.field5946;
        if (arg0 >= -72) {
            return null;
        } else if (this.field5929 == var2) {
            this.field5946 = null;
            return null;
        } else {
            this.field5946 = var2.field4901;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)Lqg;")
    public final class320 method2423(int arg0) {
        field5928++;
        if (arg0 != 0) {
            this.method2417(-56, null);
        }
        class320 var2 = this.field5929.field4901;
        if (this.field5929 == var2) {
            return null;
        } else {
            var2.method2090(-1);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lqg;ILug;)V")
    private final void method2424(class320 arg0, int arg1, class392 arg2) {
        field5930++;
        class320 var4 = this.field5929.field4906;
        this.field5929.field4906 = arg0.field4906;
        arg0.field4906.field4901 = this.field5929;
        if (this.field5929 != arg0) {
            arg0.field4906 = arg2.field5929.field4906;
            arg0.field4906.field4901 = arg0;
            var4.field4901 = arg2.field5929;
            arg2.field5929.field4906 = var4;
        }
        if (arg1 != 256) {
            this.method2417(-127, null);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI[BIII)V")
    public static final void method2425(byte arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field5944++;
        if (arg1 >= arg5) {
            return;
        }
        int var6 = arg1 + arg4;
        int var7 = arg5 - arg1 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg5 - arg1 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        if (arg0 == 86) {
                            return;
                        } else {
                            method2421(null, 84);
                            return;
                        }
                    }
                    arg2[var6++] = 1;
                }
            }
            arg2[var6++] = 1;
            arg2[var6++] = 1;
            arg2[var6++] = 1;
            arg2[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)Lqg;")
    public final class320 method2426(boolean arg0) {
        field5935++;
        class320 var2 = this.field5929.field4906;
        if (this.field5929 == var2) {
            this.field5946 = null;
            return null;
        }
        if (!arg0) {
            this.method2420(76);
        }
        this.field5946 = var2.field4906;
        return var2;
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)Lqg;")
    public final class320 method2427(int arg0) {
        field5940++;
        class320 var2 = this.field5929.field4901;
        if (arg0 < 103) {
            this.method2423(-51);
        }
        if (this.field5929 == var2) {
            this.field5946 = null;
            return null;
        } else {
            this.field5946 = var2.field4901;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLqg;)V")
    public final void method2428(byte arg0, class320 arg1) {
        field5943++;
        if (arg1.field4906 != null) {
            arg1.method2090(-1);
        }
        arg1.field4901 = this.field5929.field4901;
        arg1.field4906 = this.field5929;
        arg1.field4906.field4901 = arg1;
        arg1.field4901.field4906 = arg1;
        int var3 = -22 % ((25 - arg0) / 42);
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)V")
    public static void method2429(int arg0) {
        if (arg0 == 0) {
            field5945 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)Z")
    public final boolean method2430(int arg0) {
        if (arg0 != -1) {
            method2429(-11);
        }
        field5931++;
        return this.field5929.field4901 == this.field5929;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lug;B)V")
    public final void method2431(class392 arg0, byte arg1) {
        if (arg1 > -34) {
            this.method2433(54);
        }
        this.method2424(this.field5929.field4901, 256, arg0);
        field5938++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZZB)V")
    public static final void method2432(boolean arg0, boolean arg1, byte arg2) {
        if (arg0) {
            class105.field1757++;
            class168.method1233(false);
        }
        if (arg2 != 51) {
            return;
        }
        field5932++;
        if (arg1) {
            class343.field5165++;
            class174.method1256((byte) 95);
        }
    }

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)Lqg;")
    public final class320 method2433(int arg0) {
        field5937++;
        if (arg0 != -1) {
            this.field5929 = null;
        }
        class320 var2 = this.field5946;
        if (this.field5929 == var2) {
            this.field5946 = null;
            return null;
        } else {
            this.field5946 = var2.field4906;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    public class392() {
        this.field5929.field4906 = this.field5929;
        this.field5929.field4901 = this.field5929;
    }

    static {
        new class342("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
        field5947 = 0;
    }
}
