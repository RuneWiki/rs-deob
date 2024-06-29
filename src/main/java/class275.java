import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jda")
public class class275 {

    @OriginalMember(owner = "client!jda", name = "f", descriptor = "[[I")
    private int[][] field4019;

    @OriginalMember(owner = "client!jda", name = "e", descriptor = "I")
    private int field4018;

    @OriginalMember(owner = "client!jda", name = "g", descriptor = "I")
    private int field4020;

    @OriginalMember(owner = "client!jda", name = "i", descriptor = "Lbv;")
    public static class567 field4022;

    @OriginalMember(owner = "client!jda", name = "j", descriptor = "Lid;")
    public static class224 field4023;

    @OriginalMember(owner = "client!jda", name = "k", descriptor = "Lnn;")
    public static class214 field4024;

    @OriginalMember(owner = "client!jda", name = "h", descriptor = "F")
    public static float field4021;

    @OriginalMember(owner = "client!jda", name = "m", descriptor = "F")
    public static float field4026;

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "I")
    public static int field4015;

    @OriginalMember(owner = "client!jda", name = "c", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!jda", name = "d", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!jda", name = "l", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!jda", name = "n", descriptor = "Lvu;")
    public static class195 field4027;

    static {
        new class567("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
        field4022 = new class567("Loading JAGGL - ", "Lade JAGGL - ", "Chargement JAGGL - ", "Carregando JAGGL - ");
        field4023 = new class224("", 15);
        field4024 = new class214(9, 4);
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(BI)I", line = 3)
    public final int method1771(byte arg0, int arg1) {
        int var3 = -8 % ((-arg0 - 17) / 56);
        field4017++;
        if (this.field4019 != null) {
            arg1 = (int) ((long) this.field4018 * (long) arg1 / (long) this.field4020);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(B[B)[B", line = 29)
    public final byte[] method1772(byte arg0, byte[] arg1) {
        field4015++;
        if (this.field4019 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field4018 / (long) this.field4020) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field4019[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field4018 + var6;
                int var14 = var13 / this.field4020;
                var6 = var13 - this.field4020 * var14;
                var5 += var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 > 127) {
                    arg1[var8] = 127;
                } else {
                    arg1[var8] = (byte) var9;
                }
            }
        }
        return arg0 == -21 ? arg1 : null;
    }

    @OriginalMember(owner = "client!jda", name = "a", descriptor = "(B)V", line = 101)
    public static void method1773(byte arg0) {
        field4024 = null;
        field4023 = null;
        field4022 = null;
        field4027 = null;
        if (arg0 != -19) {
            method1773((byte) -57);
        }
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(B)Lmda;", line = 114)
    public static final class17 method1774(byte arg0) {
        field4016++;
        if (arg0 <= 40) {
            method1774((byte) -34);
        }
        class17 var1 = (class17) class118.field1909.method950(-93);
        if (var1 == null) {
            return new class17();
        } else {
            class430.field6274--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(II)V", line = 135)
    public class275(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class538.method3029(119, arg0, arg1);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field4019 = new int[var5][14];
            this.field4018 = var4;
            this.field4020 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field4019[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var4 / (double) var5;
                while (var10 < var11) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var12;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var12 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jda", name = "b", descriptor = "(BI)I", line = 194)
    public final int method1775(byte arg0, int arg1) {
        if (this.field4019 != null) {
            arg1 = (int) ((long) this.field4018 * (long) arg1 / (long) this.field4020) + 6;
        }
        if (arg0 == -128) {
            field4014++;
            return arg1;
        } else {
            return 73;
        }
    }
}
