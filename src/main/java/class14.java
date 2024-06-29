import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public abstract class class14 extends class42 {

    @OriginalMember(owner = "client!qk", name = "q", descriptor = "Z")
    public boolean field263;

    @OriginalMember(owner = "client!qk", name = "z", descriptor = "[Lqk;")
    public class14[] field272;

    @OriginalMember(owner = "client!qk", name = "s", descriptor = "Lff;")
    public static class9 field265 = new class9(18, 0);

    @OriginalMember(owner = "client!qk", name = "A", descriptor = "Lvj;")
    public static class304 field273 = new class304("Your friend list is full. Max of 100 for free users, and 200 for members.", "Deine Freunde-Liste ist voll! Maximale Einträge: Mitglieder 200/freie Spieler 100", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para os usuários não pagantes e 200 para os membros.");

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!qk", name = "p", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!qk", name = "r", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!qk", name = "t", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!qk", name = "u", descriptor = "I")
    public int field267;

    @OriginalMember(owner = "client!qk", name = "w", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!qk", name = "y", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!qk", name = "B", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!qk", name = "C", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!qk", name = "D", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!qk", name = "E", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!qk", name = "x", descriptor = "Lel;")
    public class382 field270;

    @OriginalMember(owner = "client!qk", name = "v", descriptor = "Lmh;")
    public class444 field268;

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "Lpc;")
    public static class473 field279;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(Z)V", line = 3)
    public static final void method135(boolean arg0) {
        field275++;
        if (class474.field6555 == -1) {
            return;
        }
        int var1 = class267.field3526.method1302(-4362);
        int var2 = class267.field3526.method1297(arg0);
        class378 var3 = (class378) class511.field7294.method1672((byte) -115);
        if (var3 != null) {
            var1 = var3.method255(107);
            var2 = var3.method263((byte) -128);
        }
        class489.method2815(class149.field2132, var2, 0, class474.field6555, class175.field2555, 0, -24, 0, 0, var1);
        if (class53.field836 != null) {
            class119.method829(var2, var1, 24474);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)I", line = 33)
    public int method136(int arg0) {
        int var2 = -20 % ((-arg0 - 23) / 58);
        field277++;
        return -1;
    }

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "(I)I", line = 43)
    public int method137(int arg0) {
        if (arg0 != -1) {
            this.method142((byte) 60);
        }
        field266++;
        return -1;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIB)V", line = 54)
    public void method138(int arg0, int arg1, byte arg2) {
        if (arg2 != -30) {
            this.method138(67, -82, (byte) -53);
        }
        field264++;
        int var4 = this.field267 == 255 ? arg0 : this.field267;
        if (this.field263) {
            this.field270 = new class382(var4, arg0, arg1);
        } else {
            this.field268 = new class444(var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)[[I", line = 77)
    public final int[][] method139(int arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            return null;
        }
        field278++;
        if (this.field272[arg0].field263) {
            int[] var4 = this.field272[arg0].method140(arg2, (byte) -118);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field272[arg0].method141(-30909, arg2);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IB)[I", line = 109)
    public int[] method140(int arg0, byte arg1) {
        if (arg1 >= -2) {
            this.method140(47, (byte) 47);
        }
        field269++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)[[I", line = 122)
    public int[][] method141(int arg0, int arg1) {
        if (arg0 != -30909) {
            this.field272 = null;
        }
        field261++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(B)V", line = 136)
    public void method142(byte arg0) {
        int var2 = -50 % ((39 - arg0) / 59);
        field262++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BII)V", line = 147)
    public static final void method143(byte arg0, int arg1, int arg2) {
        field271++;
        class149 var3 = class259.field3425[arg2][arg1];
        if (var3 != null) {
            class348.field4704 = var3.field2111;
            class380.field5197 = var3.field2123;
            class95.field1422 = var3.field2117;
        }
        class461.method2627(0);
        if (arg0 != 124) {
            field265 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(Z)V", line = 169)
    public static void method144(boolean arg0) {
        field279 = null;
        field265 = null;
        field273 = null;
        if (!arg0) {
            field279 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(III)[I", line = 183)
    public final int[] method145(int arg0, int arg1, int arg2) {
        field276++;
        if (arg2 != -18596) {
            method144(false);
        }
        return this.field272[arg1].field263 ? this.field272[arg1].method140(arg0, (byte) -14) : this.field272[arg1].method141(arg2 - 12313, arg0)[0];
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(B)V", line = 208)
    public void method146(byte arg0) {
        if (arg0 > -36) {
            this.method136(75);
        }
        if (this.field263) {
            this.field270.method2267(127);
            this.field270 = null;
        } else {
            this.field268.method2558(86);
            this.field268 = null;
        }
        field260++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBLmd;)V", line = 233)
    public void method147(int arg0, byte arg1, class379 arg2) {
        field281++;
        int var4 = 85 % ((arg1 + 51) / 37);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;", line = 249)
    public static final Object method148(boolean arg0, int arg1, byte[] arg2) {
        field274++;
        if (arg2 == null) {
            return null;
        } else if (arg1 == -5578) {
            if (arg2.length > 136 && !class175.field2553) {
                try {
                    class299 var3 = (class299) Class.forName("kt").getDeclaredConstructor().newInstance();
                    var3.method748((byte) -109, arg2);
                    return var3;
                } catch (Throwable var4) {
                    class175.field2553 = true;
                }
            }
            return arg0 ? class312.method1809(arg2, 0) : arg2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(IZ)V", line = 294)
    public class14(int arg0, boolean arg1) {
        this.field263 = arg1;
        this.field272 = new class14[arg0];
    }
}
