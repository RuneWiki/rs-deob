import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class3 implements class393 {

    @OriginalMember(owner = "client!er", name = "h", descriptor = "Lfa;")
    private class371 field59 = new class371(128);

    @OriginalMember(owner = "client!er", name = "j", descriptor = "[I")
    private int[] field61 = new int[class156.field2167.field1842];

    @OriginalMember(owner = "client!er", name = "k", descriptor = "[I")
    public int[] field62 = new int[class156.field2167.field1842];

    @OriginalMember(owner = "client!er", name = "q", descriptor = "[[Z")
    public static boolean[][] field68;

    @OriginalMember(owner = "client!er", name = "p", descriptor = "Lct;")
    public static class285 field67;

    @OriginalMember(owner = "client!er", name = "u", descriptor = "[I")
    public static int[] field72;

    @OriginalMember(owner = "client!er", name = "v", descriptor = "Lsh;")
    public static class472 field73;

    @OriginalMember(owner = "client!er", name = "w", descriptor = "Lsh;")
    public static class472 field74;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!er", name = "l", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!er", name = "n", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!er", name = "o", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!er", name = "r", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!er", name = "s", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!er", name = "t", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "Ljq;")
    public static class340 field64;

    static {
        new class332("You cannot send a quick chat message to a player on this world at this time.", "Einem Spieler auf dieser Welt können derzeit keine Direktchat-Nachrichten", "Impossible d'envoyer un message rapide à un joueur de ce serveur à l'heure actuelle.", "Você não pode enviar uma mensagem de papo rápido para um jogador neste mundo neste momento.");
        field68 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };
        field67 = new class285(69, 4);
        field72 = new int[1000];
        new class332((String) null, "der Spieler ist momentan nicht verfügbar.", (String) null, (String) null);
        field73 = new class472(30, 5);
        field74 = new class472(76, 2);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(ZI)I", line = 3)
    public final int method16(boolean arg0, int arg1) {
        field66++;
        long var3 = class435.method2539(-10659);
        class382 var5 = arg0 ? (class382) this.field59.method2296((byte) 39) : (class382) this.field59.method2297(true);
        int var6 = 36 / ((36 - arg1) / 52);
        while (var5 != null) {
            if (var3 > (var5.field5654 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var5.field5654 & 0x4000000000000000L) != 0L) {
                    int var7 = (int) var5.field436;
                    this.field62[var7] = this.field61[var7];
                    var5.method283(2);
                    return var7;
                }
                var5.method283(2);
            }
            var5 = (class382) this.field59.method2297(true);
        }
        return -1;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljava/lang/String;IC)[Ljava/lang/String;", line = 42)
    public static final String[] method17(String arg0, int arg1, char arg2) {
        field65++;
        int var3 = class2.method15(arg2, 27251, arg0);
        String[] var4 = new String[var3 + 1];
        if (arg1 != 11205) {
            field68 = null;
        }
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg2 != arg0.charAt(var8); var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IBI)V", line = 77)
    public final void method18(int arg0, byte arg1, int arg2) {
        field54++;
        this.field62[arg2] = arg0;
        class382 var4 = (class382) this.field59.method2305((long) arg2, (byte) 72);
        if (var4 == null) {
            class382 var5 = new class382(class435.method2539(-10659) + 500L);
            this.field59.method2307((long) arg2, var5, (byte) 118);
        } else {
            var4.field5654 = class435.method2539(-10659) + 500L;
        }
        if (arg1 != 47) {
            method25(44, -101, 28, -14, 110);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)I", line = 100)
    public final int method19(int arg0, int arg1) {
        if (arg0 > -5) {
            this.field61 = null;
        }
        field55++;
        return this.field62[arg1];
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(IBI)V", line = 117)
    public final void method20(int arg0, byte arg1, int arg2) {
        field56++;
        class227 var4 = class180.field2687.method1509((byte) 50, arg2);
        int var5 = var4.field3316;
        int var6 = var4.field3320;
        if (arg1 != -28) {
            field72 = null;
        }
        int var7 = var4.field3326;
        int var8 = class475.field6653[var7 - var6];
        if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method22((byte) -18, this.field61[var5] & ~var9 | var9 & arg0 << var6, var5);
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V", line = 145)
    public static final void method21(int arg0) {
        class296.field4445.method1103(90);
        field69++;
        class78.field1105.method1974(0);
        if (class429.field6115 != null) {
            class429.field6115.method1410(18387, class378.field5618);
        }
        class312.field4712.method1130(0);
        class378.field5618.setBackground(Color.black);
        class216.field3214 = -1;
        int var1 = 68 % ((arg0 + 86) / 38);
        class296.field4445 = class228.method1485(class378.field5618, 103333031);
        class78.field1105 = class105.method783(class378.field5618, true, 0);
        if (class429.field6115 != null) {
            class429.field6115.method1412(class378.field5618, -16731);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(BII)V", line = 169)
    public final void method22(byte arg0, int arg1, int arg2) {
        if (arg0 != -18) {
            field71 = 9;
        }
        field57++;
        this.field61[arg2] = arg1;
        class382 var4 = (class382) this.field59.method2305((long) arg2, (byte) 92);
        if (var4 == null) {
            class382 var5 = new class382(4611686018427387905L);
            this.field59.method2307((long) arg2, var5, (byte) 121);
        } else if (var4.field5654 != 4611686018427387905L) {
            var4.field5654 = class435.method2539(-10659) + 500L | 0x4000000000000000L;
            return;
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V", line = 197)
    public static final void method23(int arg0) {
        class186.field2817 = 0;
        field60++;
        class451.field6377.method2459(300);
        if (arg0 >= -21) {
            field72 = null;
        }
        class166.field2335 = false;
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(I)V", line = 210)
    public static void method24(int arg0) {
        field64 = null;
        field68 = null;
        field72 = null;
        field74 = null;
        field67 = null;
        if (arg0 != 30) {
            method23(-42);
        }
        field73 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIII)I", line = 231)
    public static final int method25(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == 0) {
            field53++;
            int var5 = 65536 - class172.field2456[arg1 * 8192 / arg3] >> 1;
            return ((65536 - var5) * arg4 >> 16) + (arg2 * var5 >> 16);
        } else {
            return -48;
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V", line = 252)
    public static final void method26(byte arg0) {
        field70++;
        int var1 = 0 % ((-arg0 - 63) / 43);
        for (class43 var2 = (class43) class390.field5742.method2456(32101); var2 != null; var2 = (class43) class390.field5742.method2461(301)) {
            if (var2.field591) {
                var2.method316(false);
            }
        }
        for (class43 var3 = (class43) class131.field1825.method2456(32101); var3 != null; var3 = (class43) class131.field1825.method2461(301)) {
            if (var3.field591) {
                var3.method316(false);
            }
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Z)V", line = 286)
    public final void method27(boolean arg0) {
        field52++;
        for (int var2 = 0; var2 < class156.field2167.field1842; var2++) {
            class298 var3 = class156.field2167.method918(var2, 103);
            if (var3 != null && var3.field4458 == 0) {
                this.field61[var2] = 0;
                this.field62[var2] = 0;
            }
        }
        this.field59 = new class371(128);
        if (arg0) {
            field71 = -53;
        }
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(II)I", line = 322)
    public final int method28(int arg0, int arg1) {
        field63++;
        class227 var3 = class180.field2687.method1509((byte) -108, arg1);
        if (arg0 != 5) {
            field73 = null;
        }
        int var4 = var3.field3316;
        int var5 = var3.field3320;
        int var6 = var3.field3326;
        int var7 = class475.field6653[var6 - var5];
        return var7 & this.field62[var4] >> var5;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(III)V", line = 343)
    public final void method29(int arg0, int arg1, int arg2) {
        if (arg0 != -18877) {
            this.field61 = null;
        }
        field58++;
        class227 var4 = class180.field2687.method1509((byte) 52, arg2);
        int var5 = var4.field3316;
        int var6 = var4.field3320;
        int var7 = var4.field3326;
        int var8 = class475.field6653[var7 - var6];
        if (arg1 < 0 || arg1 > var8) {
            arg1 = 0;
        }
        int var9 = var8 << var6;
        this.method18(this.field62[var5] & ~var9 | arg1 << var6 & var9, (byte) 47, var5);
    }
}
