import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gu")
public class class412 {

    @OriginalMember(owner = "client!gu", name = "o", descriptor = "I")
    private int field6170 = 0;

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "I")
    public int field6158;

    @OriginalMember(owner = "client!gu", name = "g", descriptor = "[Lcf;")
    public class431[] field6162;

    @OriginalMember(owner = "client!gu", name = "m", descriptor = "I")
    public static int field6168 = 0;

    @OriginalMember(owner = "client!gu", name = "s", descriptor = "[I")
    public static int[] field6174;

    @OriginalMember(owner = "client!gu", name = "u", descriptor = "Ljava/lang/String;")
    public static String field6176;

    @OriginalMember(owner = "client!gu", name = "w", descriptor = "[I")
    public static int[] field6178;

    @OriginalMember(owner = "client!gu", name = "v", descriptor = "Z")
    public static boolean field6177;

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!gu", name = "e", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!gu", name = "f", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!gu", name = "h", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!gu", name = "i", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!gu", name = "l", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!gu", name = "n", descriptor = "I")
    public static int field6169;

    @OriginalMember(owner = "client!gu", name = "r", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!gu", name = "t", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!gu", name = "y", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!gu", name = "k", descriptor = "J")
    private long field6166;

    @OriginalMember(owner = "client!gu", name = "x", descriptor = "Lja;")
    public static class185 field6179;

    @OriginalMember(owner = "client!gu", name = "q", descriptor = "Lti;")
    public static class307 field6172;

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "Lcf;")
    private class431 field6159;

    @OriginalMember(owner = "client!gu", name = "p", descriptor = "Lcf;")
    private class431 field6171;

    static {
        new class234("Now talking in clan channel of player: ", "Clanchat dieses Spieler beigetreten: ", "Vous participez actuellement au canal de clan du joueur : ", "Falando no canal do clã do jogador: ");
        field6174 = new int[14];
        new class234("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field6176 = null;
        field6178 = new int[500];
        field6177 = false;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(Z)I", line = 3)
    public final int method2583(boolean arg0) {
        if (arg0) {
            this.method2584((byte) -99, null);
        }
        field6167++;
        return this.field6158;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B[Lcf;)I", line = 14)
    public final int method2584(byte arg0, class431[] arg1) {
        field6163++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field6158; var4++) {
            class431 var5 = this.field6162[var4];
            for (class431 var6 = var5.field6384; var6 != var5; var6 = var6.field6384) {
                arg1[var3++] = var6;
            }
        }
        if (arg0 == -117) {
            return var3;
        } else {
            return -32;
        }
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(BJ)Lcf;", line = 46)
    public final class431 method2585(byte arg0, long arg1) {
        field6157++;
        this.field6166 = arg1;
        class431 var4 = this.field6162[(int) (arg1 & (long) (this.field6158 - 1))];
        for (this.field6159 = var4.field6384; this.field6159 != var4; this.field6159 = this.field6159.field6384) {
            if (this.field6159.field6388 == arg1) {
                class431 var5 = this.field6159;
                this.field6159 = this.field6159.field6384;
                return var5;
            }
        }
        this.field6159 = null;
        if (arg0 != 114) {
            this.method2590((byte) -107);
        }
        return null;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)Z", line = 75)
    public static final boolean method2586(int arg0, int arg1) {
        if (arg0 >= -66) {
            field6168 = -84;
        }
        field6173++;
        return arg1 == 3 || arg1 == 7 || arg1 == 10;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V", line = 90)
    public static void method2587(byte arg0) {
        field6178 = null;
        field6176 = null;
        field6179 = null;
        field6174 = null;
        field6172 = null;
        int var1 = 31 / ((-arg0 - 56) / 36);
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V", line = 104)
    public final void method2588(int arg0) {
        for (int var2 = 0; var2 < this.field6158; var2++) {
            class431 var3 = this.field6162[var2];
            while (true) {
                class431 var4 = var3.field6384;
                if (var3 == var4) {
                    break;
                }
                var4.method2677(-22491);
            }
        }
        field6164++;
        if (arg0 >= -104) {
            this.method2593(19);
        }
        this.field6159 = null;
        this.field6171 = null;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)Lcf;", line = 138)
    public final class431 method2589(int arg0) {
        field6169++;
        if (~this.field6170 < arg0 && this.field6162[this.field6170 - 1] != this.field6171) {
            class431 var2 = this.field6171;
            this.field6171 = var2.field6384;
            return var2;
        }
        while (this.field6170 < this.field6158) {
            class431 var3 = this.field6162[this.field6170++].field6384;
            if (this.field6162[this.field6170 - 1] != var3) {
                this.field6171 = var3.field6384;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!gu", name = "b", descriptor = "(B)Lcf;", line = 169)
    public final class431 method2590(byte arg0) {
        field6160++;
        if (this.field6159 == null) {
            return null;
        }
        class431 var2 = this.field6162[(int) ((long) (this.field6158 - 1) & this.field6166)];
        if (arg0 < 84) {
            this.method2593(-96);
        }
        while (this.field6159 != var2) {
            if (this.field6159.field6388 == this.field6166) {
                class431 var3 = this.field6159;
                this.field6159 = this.field6159.field6384;
                return var3;
            }
            this.field6159 = this.field6159.field6384;
        }
        this.field6159 = null;
        return null;
    }

    @OriginalMember(owner = "client!gu", name = "a", descriptor = "(JLcf;B)V", line = 199)
    public final void method2591(long arg0, class431 arg1, byte arg2) {
        field6156++;
        if (arg1.field6389 != null) {
            arg1.method2677(-22491);
        }
        class431 var5 = this.field6162[(int) (arg0 & (long) (this.field6158 - 1))];
        arg1.field6384 = var5;
        arg1.field6389 = var5.field6389;
        int var6 = -118 / ((arg2 + 55) / 48);
        arg1.field6389.field6384 = arg1;
        arg1.field6384.field6389 = arg1;
        arg1.field6388 = arg0;
    }

    @OriginalMember(owner = "client!gu", name = "c", descriptor = "(I)Lcf;", line = 222)
    public final class431 method2592(int arg0) {
        this.field6170 = 0;
        field6161++;
        if (arg0 < 113) {
            this.field6159 = null;
        }
        return this.method2589(-1);
    }

    @OriginalMember(owner = "client!gu", name = "d", descriptor = "(I)I", line = 234)
    public final int method2593(int arg0) {
        field6165++;
        int var2 = arg0;
        for (int var3 = 0; var3 < this.field6158; var3++) {
            class431 var4 = this.field6162[var3];
            class431 var5 = var4.field6384;
            while (var4 != var5) {
                var5 = var5.field6384;
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(I)V", line = 263)
    public class412(int arg0) {
        this.field6158 = arg0;
        this.field6162 = new class431[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class431 var3 = this.field6162[var2] = new class431();
            var3.field6389 = var3;
            var3.field6384 = var3;
        }
    }
}
