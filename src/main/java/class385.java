import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class385 {

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    private int field5634;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    private int field5632;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "[[I")
    private int[][] field5630;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "Ljava/lang/String;")
    public static String field5635 = null;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "Ljn;")
    public static class409 field5631 = new class409("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "Ljn;")
    public static class409 field5637 = new class409("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "Lct;")
    public static class104 field5628;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "Lct;")
    public static class104 field5636;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)I")
    public static final int method2429(byte arg0, int arg1) {
        if (arg0 == 38) {
            field5624++;
            return arg1 >>> 8;
        } else {
            return 125;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)I")
    public final int method2430(int arg0, int arg1) {
        if (this.field5630 != null) {
            arg1 = (int) ((long) this.field5634 * (long) arg1 / (long) this.field5632);
        }
        field5625++;
        if (arg0 != 32767) {
            method2434(-110, (class104) null);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IB)I")
    public final int method2431(int arg0, byte arg1) {
        if (arg1 != -61) {
            return -113;
        }
        field5629++;
        if (this.field5630 != null) {
            arg0 = ((int) ((long) this.field5634 * (long) arg0 / (long) this.field5632)) + 6;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lfp;IIILeb;)V")
    public static final void method2432(class9 arg0, int arg1, int arg2, int arg3, class395 arg4) {
        class223.field3243.method2477(arg2 - 14235);
        field5627++;
        if (class7.field101) {
            return;
        }
        class376 var5 = (class376) arg4.method2478(1603);
        if (arg2 != 14) {
            return;
        }
        while (var5 != null) {
            class110 var6 = class443.method2721(-12, var5.field5483);
            if (class423.method2609(var6, 27402)) {
                boolean var7 = class390.method2458(var6, var5, arg0, arg1, (byte) 89, arg3);
                if (var7) {
                    class13.method201((byte) 100, var6, var5, arg0);
                }
            }
            var5 = (class376) arg4.method2486((byte) -82);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B[B)[B")
    public final byte[] method2433(byte arg0, byte[] arg1) {
        field5626++;
        if (arg0 != -108) {
            return null;
        }
        if (this.field5630 != null) {
            int var3 = (int) ((long) arg1.length * (long) this.field5634 / (long) this.field5632) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg1.length; var7++) {
                byte var10 = arg1[var7];
                int[] var11 = this.field5630[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field5634 + var6;
                int var14 = var13 / this.field5632;
                var6 = var13 - this.field5632 * var14;
                var5 += var14;
            }
            arg1 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg1[var8] = -128;
                } else if (var9 <= 127) {
                    arg1[var8] = (byte) var9;
                } else {
                    arg1[var8] = 127;
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILct;)V")
    public static final void method2434(int arg0, class104 arg1) {
        class4.field67 = arg1;
        field5633++;
        if (arg0 != 14) {
            field5636 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V")
    public static void method2435(int arg0) {
        field5635 = null;
        field5637 = null;
        field5636 = null;
        field5631 = null;
        field5628 = null;
        int var1 = 127 / ((arg0 + 48) / 48);
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(II)V")
    public class385(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class35.method324(arg0, arg1, 0);
            int var4 = arg1 / var3;
            int var5 = arg0 / var3;
            this.field5634 = var4;
            this.field5632 = var5;
            this.field5630 = new int[var5][14];
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field5630[var6];
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
                while (var11 > var10) {
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
}
