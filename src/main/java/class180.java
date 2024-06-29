import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class180 {

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "Lku;")
    private class232 field2591 = new class232(64);

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "Lb;")
    private class201 field2596;

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "Lus;")
    public static class1 field2595;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "Lwf;")
    public static class79 field2597;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "Ldk;")
    public static class326 field2598;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "I")
    public static int field2589;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
    public static int field2592;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(B)V")
    public final void method1101(byte arg0) {
        if (arg0 < 97) {
            this.method1101((byte) 54);
        }
        field2590++;
        class232 var2 = this.field2591;
        synchronized (this.field2591) {
            this.field2591.method1475(0);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IB)V")
    public final void method1102(int arg0, byte arg1) {
        field2593++;
        class232 var3 = this.field2591;
        synchronized (this.field2591) {
            int var4 = -121 / ((-arg1 - 14) / 48);
            this.field2591.method1486(438127120, arg0);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)Led;")
    public final class459 method1103(int arg0, int arg1) {
        field2589++;
        class232 var3 = this.field2591;
        class459 var4;
        synchronized (this.field2591) {
            var4 = (class459) this.field2591.method1479(arg1 + arg1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2596.method1257(class317.method2031((byte) 105, arg0), class281.method1780(114, arg0), 24558);
        class459 var6 = new class459();
        if (var5 != null) {
            var6.method2685(new class276(var5), (byte) -106);
        }
        class232 var7 = this.field2591;
        synchronized (this.field2591) {
            this.field2591.method1473(var6, (long) arg0, 111);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(II)V")
    public final void method1104(int arg0, int arg1) {
        class232 var3 = this.field2591;
        synchronized (this.field2591) {
            this.field2591.method1478((byte) -100);
            this.field2591 = new class232(arg0);
        }
        field2588++;
        if (arg1 != -203) {
            this.method1104(-39, 28);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IILjava/lang/String;Ljava/lang/String;)I")
    public static final int method1105(int arg0, int arg1, String arg2, String arg3) {
        field2594++;
        int var4 = arg3.length();
        int var5 = arg2.length();
        int var6 = 0;
        if (arg1 >= -33) {
            method1106(false);
        }
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > var6 - var8 || var5 > (var7 - var9)) {
            if (var6 - var8 >= var4) {
                return -1;
            }
            if (var5 <= var7 - var9) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg3.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg2.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class168.method1042(var22, -17426);
            var9 = class168.method1042(var24, -17426);
            char var26 = class86.method482(var22, 79, arg0);
            char var27 = class86.method482(var24, 79, arg0);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class173.method1066(arg0, (byte) -91, var28) - class173.method1066(arg0, (byte) -91, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg0 == 2) {
                var17 = var4 - var11 - 1;
                var16 = var5 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg3.charAt(var17);
            char var19 = arg2.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class173.method1066(arg0, (byte) -91, var20) - class173.method1066(arg0, (byte) -91, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg3.charAt(var13);
            char var15 = arg2.charAt(var13);
            if (var14 != var15) {
                return class173.method1066(arg0, (byte) -91, var14) - class173.method1066(arg0, (byte) -91, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)V")
    public static void method1106(boolean arg0) {
        field2597 = null;
        field2598 = null;
        field2595 = null;
        if (arg0) {
            method1106(false);
        }
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(Z)V")
    public final void method1107(boolean arg0) {
        field2592++;
        class232 var2 = this.field2591;
        synchronized (this.field2591) {
            this.field2591.method1478((byte) -97);
            if (!arg0) {
                method1108((byte) -108, 87, (class276) null);
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BILrp;)V")
    public static final void method1108(byte arg0, int arg1, class276 arg2) {
        if (class307.field4373 != null) {
            try {
                class307.field4373.method506((byte) -112, 0L);
                class307.field4373.method509(24, arg2.field4064, -30916, arg1);
            } catch (Exception var3) {
            }
        }
        field2587++;
        if (arg0 <= 33) {
            method1105(-43, -70, (String) null, (String) null);
        }
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Lea;ILb;)V")
    public class180(class353 arg0, int arg1, class201 arg2) {
        this.field2596 = arg2;
        if (this.field2596 != null) {
            int var4 = this.field2596.method1233(-1) - 1;
            this.field2596.method1235(0, var4);
        }
    }

    static {
        new class326("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field2595 = new class1(80, 10);
        field2597 = new class79(54, 16);
        field2598 = new class326("M", "M", "M", "M");
    }
}
