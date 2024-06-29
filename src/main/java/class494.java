import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class494 {

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
    public int field7015;

    @OriginalMember(owner = "client!uo", name = "n", descriptor = "[B")
    private byte[] field7028;

    @OriginalMember(owner = "client!uo", name = "u", descriptor = "Lada;")
    public static class144 field7035;

    @OriginalMember(owner = "client!uo", name = "v", descriptor = "Llb;")
    public static class465 field7036;

    @OriginalMember(owner = "client!uo", name = "x", descriptor = "Lada;")
    public static class144 field7038;

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "I")
    public int field7016;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "I")
    public int field7019;

    @OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!uo", name = "k", descriptor = "I")
    public int field7025;

    @OriginalMember(owner = "client!uo", name = "q", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!uo", name = "t", descriptor = "I")
    public static int field7034;

    @OriginalMember(owner = "client!uo", name = "w", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!uo", name = "l", descriptor = "Lso;")
    public class402 field7026;

    @OriginalMember(owner = "client!uo", name = "s", descriptor = "Lpi;")
    public static class426 field7033;

    @OriginalMember(owner = "client!uo", name = "c", descriptor = "[I")
    public int[] field7017;

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "[I")
    public int[] field7018;

    @OriginalMember(owner = "client!uo", name = "h", descriptor = "[I")
    public int[] field7022;

    @OriginalMember(owner = "client!uo", name = "o", descriptor = "[I")
    public int[] field7029;

    @OriginalMember(owner = "client!uo", name = "p", descriptor = "[I")
    public int[] field7030;

    @OriginalMember(owner = "client!uo", name = "r", descriptor = "[I")
    public int[] field7032;

    @OriginalMember(owner = "client!uo", name = "j", descriptor = "[Lso;")
    public class402[] field7024;

    @OriginalMember(owner = "client!uo", name = "m", descriptor = "[[B")
    public byte[][] field7027;

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "[[I")
    public int[][] field7020;

    @OriginalMember(owner = "client!uo", name = "g", descriptor = "[[I")
    public int[][] field7021;

    static {
        new class572("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
        field7035 = new class144(100, 0);
        field7036 = new class465(512);
        field7038 = new class144(17, 12);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)V", line = 14)
    public static final void method2950(int arg0, int arg1) {
        class177.field2703 = arg0;
        field7031++;
        class451.field6372 = -1;
        class451.field6372 = arg1;
        class415.method2448((byte) -34);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I[B)V", line = 30)
    private final void method2951(int arg0, byte[] arg1) {
        field7034++;
        class148 var3 = new class148(class132.method914((byte) 54, arg1));
        int var4 = var3.method1032((byte) -33);
        if (var4 < 5 || var4 > 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field7016 = 0;
        } else {
            this.field7016 = var3.method1026(-917302120);
        }
        int var5 = var3.method1032((byte) -33);
        if (arg0 != 64) {
            return;
        }
        boolean var6 = (var5 & 0x1) != 0;
        this.field7019 = var3.method1045(true);
        boolean var7 = (var5 & 0x2) != 0;
        int var8 = 0;
        this.field7022 = new int[this.field7019];
        int var9 = -1;
        for (int var10 = 0; var10 < this.field7019; var10++) {
            this.field7022[var10] = var8 += var3.method1045(true);
            if (var9 < this.field7022[var10]) {
                var9 = this.field7022[var10];
            }
        }
        this.field7025 = var9 + 1;
        this.field7018 = new int[this.field7025];
        this.field7030 = new int[this.field7025];
        this.field7020 = new int[this.field7025][];
        if (var7) {
            this.field7027 = new byte[this.field7025][];
        }
        this.field7029 = new int[this.field7025];
        this.field7032 = new int[this.field7025];
        if (var6) {
            this.field7017 = new int[this.field7025];
            for (int var11 = 0; var11 < this.field7025; var11++) {
                this.field7017[var11] = -1;
            }
            for (int var12 = 0; var12 < this.field7019; var12++) {
                this.field7017[this.field7022[var12]] = var3.method1026(-917302120);
            }
            this.field7026 = new class402(this.field7017);
        }
        for (int var13 = 0; var13 < this.field7019; var13++) {
            this.field7030[this.field7022[var13]] = var3.method1026(-917302120);
        }
        if (var7) {
            for (int var14 = 0; var14 < this.field7019; var14++) {
                byte[] var15 = new byte[64];
                var3.method1060((byte) 100, var15, 0, 64);
                this.field7027[this.field7022[var14]] = var15;
            }
        }
        for (int var16 = 0; var16 < this.field7019; var16++) {
            this.field7029[this.field7022[var16]] = var3.method1026(-917302120);
        }
        for (int var17 = 0; var17 < this.field7019; var17++) {
            this.field7018[this.field7022[var17]] = var3.method1045(true);
        }
        for (int var18 = 0; var18 < this.field7019; var18++) {
            int var25 = this.field7022[var18];
            int var26 = this.field7018[var25];
            int var27 = 0;
            int var28 = -1;
            this.field7020[var25] = new int[var26];
            for (int var29 = 0; var29 < var26; var29++) {
                int var30 = this.field7020[var25][var29] = var27 += var3.method1045(true);
                if (var30 > var28) {
                    var28 = var30;
                }
            }
            this.field7032[var25] = var28 + 1;
            if (var28 + 1 == var26) {
                this.field7020[var25] = null;
            }
        }
        if (!var6) {
            return;
        }
        this.field7021 = new int[var9 + 1][];
        this.field7024 = new class402[var9 + 1];
        for (int var19 = 0; var19 < this.field7019; var19++) {
            int var20 = this.field7022[var19];
            int var21 = this.field7018[var20];
            this.field7021[var20] = new int[this.field7032[var20]];
            for (int var22 = 0; var22 < this.field7032[var20]; var22++) {
                this.field7021[var20][var22] = -1;
            }
            for (int var23 = 0; var23 < var21; var23++) {
                int var24;
                if (this.field7020[var20] == null) {
                    var24 = var23;
                } else {
                    var24 = this.field7020[var20][var23];
                }
                this.field7021[var20][var24] = var3.method1026(-917302120);
            }
            this.field7024[var20] = new class402(this.field7021[var20]);
        }
    }

    @OriginalMember(owner = "client!uo", name = "b", descriptor = "(II)V", line = 236)
    public static final void method2952(int arg0, int arg1) {
        field7023++;
        class451.field6372 = -1;
        class607.field9016 = arg0;
        if (arg1 >= -31) {
            method2953(-54);
        }
        class485.field6906 = -1;
        class415.method2448((byte) -34);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(I)V", line = 250)
    public static void method2953(int arg0) {
        field7033 = null;
        field7035 = null;
        field7036 = null;
        if (arg0 <= -95) {
            field7038 = null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "([BI[B)V", line = 264)
    public class494(byte[] arg0, int arg1, byte[] arg2) {
        this.field7015 = class68.method533(arg0, arg0.length, 0);
        if (this.field7015 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field7028 = class45.method286(arg0, -18340, arg0.length, 0);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field7028[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method2951(64, arg0);
    }
}
