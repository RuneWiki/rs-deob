import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class335 {

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "[I")
    public static int[] field5261 = new int[2048];

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "[J")
    public static long[] field5259 = new long[32];

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "I")
    public static int field5268 = 1339;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "I")
    private int field5258;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
    public int field5264;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
    public static int field5266;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
    public static int field5269;

    static {
        new class306("This player is on a quick chat world and cannot receive your message.", "Der Spieler kann auf einer Direktchat-Welt keine Nachrichten empfangen.", "Ce joueur est sur un serveur à messagerie rapide et ne peut pas recevoir votre message.", "Este jogador não pode receber sua mensagem porque está em um mundo de papo rápido.");
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)V", line = 8)
    public static void method2109(boolean arg0) {
        field5261 = null;
        field5259 = null;
        if (arg0) {
            method2115(113, 64, -60, -86, -26, -15);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IB)V", line = 25)
    public final void method2110(int arg0, byte arg1) {
        this.field5264 = arg0;
        field5260++;
        if (arg1 == -86) {
            this.field5258 = 0;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V", line = 38)
    public final void method2111(int arg0) {
        field5257++;
        this.field5264 &= 0x3FFF;
        if (arg0 <= 103) {
            field5259 = null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)I", line = 54)
    public final int method2112(byte arg0) {
        if (arg0 < 120) {
            method2109(true);
        }
        field5265++;
        return this.field5264 & 0x3FFF;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIII)V", line = 65)
    public static final void method2113(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class263.field4381 = arg1;
        class69.field1197 = arg4;
        class236.field4083 = arg3;
        class519.field7667 = arg2;
        if (arg0 == 2) {
            field5267++;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Li;III[Z)V", line = 79)
    public static final void method2114(class515 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class360.field5592 == class320.field5039) {
            return;
        }
        int var5 = class511.field7488[arg1].method1517(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class220 var7 = class511.field7488[var6];
                if (var7 != null) {
                    var7.method1518(arg0, arg2, var5 - var7.method1517(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIIIII)I", line = 106)
    public static final int method2115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5262++;
        if (class360.field5592 == null) {
            return 0;
        }
        if (arg4 < 3) {
            int var6 = arg5 >> 7;
            int var7 = arg0 >> 7;
            if (arg2 < 0 || arg1 < 0 || arg2 > class217.field3775 - 1 || arg1 > class277.field4548 - 1) {
                return 0;
            }
            if (var6 < 1 || var7 < 1 || var6 > (class217.field3775 - 1) || var7 > (class277.field4548 - 1)) {
                return 0;
            }
            boolean var8 = (class192.field2982[1][arg5 >> 7][arg0 >> 7] & 0x2) != 0;
            if ((arg5 & 0x7F) == 0) {
                boolean var9 = (class192.field2982[1][var6 - 1][arg0 >> 7] & 0x2) != 0;
                boolean var10 = (class192.field2982[1][var6][arg0 >> 7] & 0x2) != 0;
                if (var10 != var9) {
                    var8 = (class192.field2982[1][arg2][arg1] & 0x2) != 0;
                }
            }
            if ((arg0 & 0x7F) == 0) {
                boolean var11 = (class192.field2982[1][arg5 >> 7][var7 - 1] & 0x2) != 0;
                boolean var12 = (class192.field2982[1][arg5 >> 7][var7] & 0x2) != 0;
                if (var11 != var12) {
                    var8 = (class192.field2982[1][arg2][arg1] & 0x2) != 0;
                }
            }
            if (var8) {
                arg4++;
            }
        }
        if (arg3 == 1001875841) {
            return class360.field5592[arg4].method1517(arg5, arg0);
        } else {
            return 81;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIII)Z", line = 166)
    public final boolean method2116(int arg0, int arg1, int arg2, int arg3) {
        field5269++;
        int var5 = this.field5258;
        if (this.field5264 == arg3 && this.field5258 == 0) {
            return false;
        }
        boolean var6;
        if (this.field5258 == arg2) {
            if (arg3 > this.field5264 && arg3 <= (this.field5264 + arg0) || arg3 < this.field5264 && arg3 >= this.field5264 - arg0) {
                this.field5264 = arg3;
                return false;
            }
            var6 = true;
        } else if (this.field5258 > 0 && arg3 > this.field5264) {
            int var7 = this.field5258 * this.field5258 / (arg0 * 2);
            int var8 = this.field5264 + var7;
            if (var8 < arg3 && var8 >= this.field5264) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field5258 < 0 && this.field5264 > arg3) {
            int var9 = this.field5258 * this.field5258 / (arg0 * 2);
            int var10 = this.field5264 - var9;
            if (var10 > arg3 && this.field5264 >= var10) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (this.field5264 >= arg3) {
                this.field5258 -= arg0;
                if (arg1 != 0 && -arg1 > this.field5258) {
                    this.field5258 = -arg1;
                }
            } else {
                this.field5258 += arg0;
                if (arg1 != 0 && this.field5258 > arg1) {
                    this.field5258 = arg1;
                }
            }
            if (this.field5258 != var5) {
                int var11 = this.field5258 * this.field5258 / (arg0 * 2);
                if (arg3 > this.field5264) {
                    if (arg3 < (this.field5264 + var11)) {
                        this.field5258 = var5;
                    }
                } else if (arg3 < this.field5264 && arg3 > this.field5264 - var11) {
                    this.field5258 = var5;
                }
            }
        } else if (this.field5258 <= 0) {
            this.field5258 += arg0;
            if (this.field5258 > 0) {
                this.field5258 = 0;
            }
        } else {
            this.field5258 -= arg0;
            if (this.field5258 < 0) {
                this.field5258 = 0;
            }
        }
        this.field5264 += this.field5258 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 300)
    public static final void method2117(int arg0, int arg1, int arg2, Class arg3) {
        class465 var4 = class66.field977[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class1 var5 = var4.field6898; var5 != null; var5 = var5.field2) {
            class290 var6 = var5.field9;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field4718 == arg1 && var6.field4717 == arg2) {
                class355.method2282(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lec;I)V", line = 326)
    public static final void method2118(class68 arg0, int arg1) {
        field5263++;
        if (class31.field486 == arg0.field1115) {
            if (class302.field4850.field2652 == null) {
                arg0.field1044 = 0;
                arg0.field1129 = 0;
            } else {
                arg0.field1113 = 150;
                arg0.field1031 = (int) (Math.sin((double) class504.field7348 / 40.0D) * 256.0D) & 0x7FF;
                arg0.field1099 = 5;
                arg0.field1129 = class265.field4432;
                arg0.field1044 = class97.method673(arg1 + 154, class302.field4850.field2652);
                arg0.field1025 = class302.field4850.field3063;
                arg0.field1046 = 0;
                arg0.field1084 = class302.field4850.field3128;
                arg0.field1016 = class302.field4850.field3078;
            }
        } else if (arg1 != -133) {
            field5259 = null;
        }
    }
}
