import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ka")
public abstract class class20 {

    @OriginalMember(owner = "mapview!ka", name = "b", descriptor = "Z")
    private boolean field173;

    @OriginalMember(owner = "mapview!ka", name = "g", descriptor = "Z")
    private boolean field178;

    @OriginalMember(owner = "mapview!ka", name = "m", descriptor = "Ll;")
    public static class21 field184 = class28.method185(-20839, "Prev page");

    @OriginalMember(owner = "mapview!ka", name = "j", descriptor = "I")
    public static int field181 = 0;

    @OriginalMember(owner = "mapview!ka", name = "k", descriptor = "Ll;")
    public static class21 field182 = class28.method185(-20839, "Magic Shop");

    @OriginalMember(owner = "mapview!ka", name = "d", descriptor = "Ll;")
    public static class21 field175 = class28.method185(-20839, "Candle Shop");

    @OriginalMember(owner = "mapview!ka", name = "q", descriptor = "I")
    public static volatile int field188 = -1;

    @OriginalMember(owner = "mapview!ka", name = "h", descriptor = "I")
    public static int field179 = 500;

    @OriginalMember(owner = "mapview!ka", name = "v", descriptor = "Ll;")
    public static class21 field193 = class28.method185(-20839, "Combat Training");

    @OriginalMember(owner = "mapview!ka", name = "t", descriptor = "Ll;")
    public static class21 field191 = class28.method185(-20839, "Slayer Master");

    @OriginalMember(owner = "mapview!ka", name = "f", descriptor = "I")
    private int field177;

    @OriginalMember(owner = "mapview!ka", name = "n", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "mapview!ka", name = "o", descriptor = "I")
    public int field186;

    @OriginalMember(owner = "mapview!ka", name = "w", descriptor = "Lq;")
    private class28 field194;

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "[I")
    private int[] field172;

    @OriginalMember(owner = "mapview!ka", name = "e", descriptor = "[I")
    private int[] field176;

    @OriginalMember(owner = "mapview!ka", name = "i", descriptor = "[I")
    public int[] field180;

    @OriginalMember(owner = "mapview!ka", name = "p", descriptor = "[I")
    private int[] field187;

    @OriginalMember(owner = "mapview!ka", name = "x", descriptor = "[I")
    private int[] field195;

    @OriginalMember(owner = "mapview!ka", name = "l", descriptor = "[Lq;")
    private class28[] field183;

    @OriginalMember(owner = "mapview!ka", name = "r", descriptor = "[[B")
    public byte[][] field189;

    @OriginalMember(owner = "mapview!ka", name = "c", descriptor = "[[I")
    private int[][] field174;

    @OriginalMember(owner = "mapview!ka", name = "s", descriptor = "[[I")
    private int[][] field190;

    @OriginalMember(owner = "mapview!ka", name = "u", descriptor = "[[[B")
    private byte[][][] field192;

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(IIILka;)[Lf;", line = 4)
    public static final Pix24[] method84(int arg0, int arg1, int arg2, class20 arg3) {
        if (class30.method193(arg1, (byte) 118, arg3, arg0)) {
            if (arg2 != -15554) {
                field185 = 112;
            }
            return class26.method174((byte) 96);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "([BI)[B", line = 20)
    private static final byte[] method85(byte[] arg0, int arg1) {
        class16 var2 = new class16(arg0);
        int var3 = var2.method64(0);
        if (arg1 != -10533) {
            return (byte[]) null;
        }
        int var4 = var2.method67(true);
        if (var4 < 0 || mapview.field233 != 0 && var4 > mapview.field233) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method60(var4, (byte) -108, 0, var5);
            return var5;
        } else {
            int var6 = var2.method67(true);
            if (var6 < 0 || mapview.field233 != 0 && mapview.field233 < var6) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class23.method133(var7, var6, arg0, var4, 9);
            } else {
                try {
                    DataInputStream var8 = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(arg0, 9, var4)));
                    var8.readFully(var7);
                    var8.close();
                } catch (IOException var10) {
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "([III)Z", line = 89)
    private final boolean method86(int[] arg0, int arg1, int arg2) {
        if (this.field189[arg1] == null) {
            return false;
        }
        int[] var4 = this.field190[arg1];
        byte[][] var5 = this.field192[arg1];
        boolean var6 = true;
        int var7 = this.field187[arg1];
        for (int var8 = 0; var8 < var7; var8++) {
            if (var5[var4[var8]] == null) {
                var6 = false;
                break;
            }
        }
        if (var6) {
            return true;
        }
        byte[] var9;
        if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
            var9 = this.field189[arg1];
        } else {
            var9 = new byte[this.field189[arg1].length];
            class15.method58(this.field189[arg1], 0, var9, 0, var9.length);
            class16 var10 = new class16(var9);
            var10.method63(arg0, 5, (byte) 70, var10.field144.length);
        }
        byte[] var11;
        try {
            var11 = method85(var9, -10533);
            if (arg2 >= -69) {
                method87(false, -117, null);
            }
        } catch (RuntimeException var26) {
            throw method91(var26, "T3 - " + (arg0 != null) + "," + arg1 + "," + var9.length + "," + method87(false, var9.length, var9) + "," + method87(false, var9.length - 2, var9) + "," + this.field172[arg1] + "," + this.field177);
        }
        if (this.field178) {
            this.field189[arg1] = null;
        }
        if (var7 > 1) {
            int var13 = var11.length;
            int var27 = var13 - 1;
            int var14 = var11[var27] & 0xFF;
            int var15 = var27 - var7 * var14 * 4;
            class16 var16 = new class16(var11);
            var16.field145 = var15;
            int[] var17 = new int[var7];
            for (int var18 = 0; var18 < var14; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var7; var20++) {
                    var19 += var16.method67(true);
                    var17[var20] += var19;
                }
            }
            for (int var21 = 0; var21 < var7; var21++) {
                if (var5[var4[var21]] == null) {
                    var5[var4[var21]] = new byte[var17[var21]];
                }
                var17[var21] = 0;
            }
            var16.field145 = var15;
            int var22 = 0;
            for (int var23 = 0; var23 < var14; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var7; var25++) {
                    var24 += var16.method67(true);
                    class15.method58(var11, var22, var5[var4[var25]], var17[var25], var24);
                    var17[var25] += var24;
                    var22 += var24;
                }
            }
        } else {
            var5[var4[0]] = var11;
        }
        return true;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(ZI[B)I", line = 229)
    private static final int method87(boolean arg0, int arg1, byte[] arg2) {
        if (arg0) {
            field182 = null;
        }
        return class28.method180(arg2, 59, arg1, 0);
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(IBI)[B", line = 249)
    public final byte[] method88(int arg0, byte arg1, int arg2) {
        return arg1 == -49 ? this.method90(0, null, arg0, arg2) : (byte[]) null;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(I)V", line = 270)
    public static void method89(int arg0) {
        field184 = null;
        field193 = null;
        field191 = null;
        if (arg0 != 0) {
            method85(null, 125);
        }
        field175 = null;
        field182 = null;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(I[III)[B", line = 285)
    private final byte[] method90(int arg0, int[] arg1, int arg2, int arg3) {
        if (arg0 > arg3 || this.field192.length <= arg3 || this.field192[arg3] == null || arg2 < 0 || arg2 >= this.field192[arg3].length) {
            return null;
        }
        if (this.field192[arg3][arg2] == null) {
            boolean var5 = this.method86(arg1, arg3, -113);
            if (!var5) {
                this.method96(1, arg3);
                boolean var6 = this.method86(arg1, arg3, -89);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = this.field192[arg3][arg2];
        if (this.field173) {
            this.field192[arg3][arg2] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ls;", line = 322)
    public static final class30 method91(Throwable arg0, String arg1) {
        class30 var2;
        if (arg0 instanceof class30) {
            var2 = (class30) arg0;
            var2.field350 = var2.field350 + ' ' + arg1;
        } else {
            var2 = new class30(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(BLl;)I", line = 339)
    public final int method92(byte arg0, class21 arg1) {
        if (arg0 != 4) {
            this.method88(57, (byte) -41, 66);
        }
        class21 var3 = arg1.method104(48);
        return this.field194.method179(var3.method98(-798259035), (byte) -105);
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(B[B)V", line = 359)
    public final void method93(byte arg0, byte[] arg1) {
        this.field177 = method87(false, arg1.length, arg1);
        class16 var3 = new class16(method85(arg1, -10533));
        int var4 = var3.method64(0);
        if (var4 != 5) {
            return;
        }
        int var5 = -1;
        int var6 = var3.method64(0);
        this.field186 = var3.method65((byte) -39);
        this.field180 = new int[this.field186];
        int var7 = 0;
        for (int var8 = 0; var8 < this.field186; var8++) {
            this.field180[var8] = var7 += var3.method65((byte) -39);
            if (this.field180[var8] > var5) {
                var5 = this.field180[var8];
            }
        }
        this.field172 = new int[var5 + 1];
        this.field190 = new int[var5 + 1][];
        this.field189 = new byte[var5 + 1][];
        this.field187 = new int[var5 + 1];
        this.field192 = new byte[var5 + 1][][];
        this.field176 = new int[var5 + 1];
        if (var6 != 0) {
            this.field195 = new int[var5 + 1];
            for (int var9 = 0; var9 < this.field186; var9++) {
                this.field195[this.field180[var9]] = var3.method67(true);
            }
            this.field194 = new class28(this.field195);
        }
        for (int var10 = 0; var10 < this.field186; var10++) {
            this.field172[this.field180[var10]] = var3.method67(true);
        }
        for (int var11 = 0; var11 < this.field186; var11++) {
            this.field176[this.field180[var11]] = var3.method67(true);
        }
        int var12 = 0;
        if (arg0 < 31) {
            this.method96(127, 77);
        }
        while (var12 < this.field186) {
            this.field187[this.field180[var12]] = var3.method65((byte) -39);
            var12++;
        }
        for (int var13 = 0; var13 < this.field186; var13++) {
            int var14 = 0;
            int var15 = this.field180[var13];
            int var16 = -1;
            int var17 = this.field187[var15];
            this.field190[var15] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                int var19 = this.field190[var15][var18] = var14 += var3.method65((byte) -39);
                if (var19 > var16) {
                    var16 = var19;
                }
            }
            this.field192[var15] = new byte[var16 + 1][];
        }
        if (var6 == 0) {
            return;
        }
        this.field183 = new class28[var5 + 1];
        this.field174 = new int[var5 + 1][];
        for (int var20 = 0; var20 < this.field186; var20++) {
            int var21 = this.field180[var20];
            int var22 = this.field187[var21];
            this.field174[var21] = new int[this.field192[var21].length];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field174[var21][this.field190[var21][var23]] = var3.method67(true);
            }
            this.field183[var21] = new class28(this.field174[var21]);
        }
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(Ll;II)I", line = 498)
    public final int method94(class21 arg0, int arg1, int arg2) {
        class21 var4 = arg0.method104(arg2 ^ 0xFFFFFE1D);
        if (arg2 != -467) {
            this.field189 = null;
        }
        return this.field183[arg1].method179(var4.method98(-798259035), (byte) -54);
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(ILl;Ll;)[B", line = 517)
    public final byte[] method95(int arg0, class21 arg1, class21 arg2) {
        class21 var4 = arg1.method104(48);
        class21 var5 = arg2.method104(48);
        int var6 = this.field194.method179(var4.method98(-798259035), (byte) 97);
        if (arg0 != 9747) {
            this.field177 = -111;
        }
        int var7 = this.field183[var6].method179(var5.method98(-798259035), (byte) -112);
        return this.method88(var7, (byte) -49, var6);
    }

    @OriginalMember(owner = "mapview!ka", name = "<init>", descriptor = "(ZZ)V", line = 557)
    public class20(boolean arg0, boolean arg1) {
        this.field173 = arg1;
        this.field178 = arg0;
    }

    @OriginalMember(owner = "mapview!ka", name = "a", descriptor = "(II)V", line = 571)
    private final void method96(int arg0, int arg1) {
        if (arg0 != 1) {
            field175 = null;
        }
    }
}
