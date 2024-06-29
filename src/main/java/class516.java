import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class516 {

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "I")
    public int field7372;

    @OriginalMember(owner = "client!ew", name = "p", descriptor = "[B")
    private byte[] field7381;

    @OriginalMember(owner = "client!ew", name = "q", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field7382 = new BigInteger("8649fcf2448fbde5f1d6ced139d3d718500a07d69124b6996771a365fa4555a22af3e19bde8d36f85c258d129c5beaa9b08a1acd3adf51f45730ba44496b5cf55a693a1283846f30ea4e3ab20c18a5e85426e22031ffab13deaab3898c045633472513dae5a014145cec13391ae5734a1b3963662aef6761bffb95294dbfad792ebf06d5c24e497d858228aa29aac511e5b908060c8e0f96c5919c283fd31d16591a4a9eb9377d42ac478834718ec73880f8e5ddfe5fc91826b4f7bc67ac50d7fc787fdd863e07418f2a88e2937aab9e8e78ef34768289d0349f9d541bd1474cbb469359e519172fe524fed02b7b73372990f469634cec3a0bd7358f2da75dd4613b9ccacad3415f7075e360a2a93727ca55a3c3bfd82d90eb4b92faa942f9fbe652edec790a3f31f9059d9af2d15b80a43f8c49359ddb80fc8d28d617d9812150adf9aada993788300f8724abc261500c005cc24e04aba9f1ec8aa43e5989339eeffc86a1bb1dfc5bb442f3aec04d8bc5df858657237d48258e2a79c5d87eb1fddb3e9551b929011a300b8632508340e423860b443d8cb011c979b2988bef47cbb720231480dbc88d57bfddff8f9f19adc2ce4e79dcbbb8ebbc70455b68e5b69aeff83952a912a24bb4be21f4c0029b1ea2bc77b0071d956b744136132f7ee4a415bbe3f04c170921e8531d36b1a26c06d1b39629ad103d60fb9e4039eccbd1", 16);

    @OriginalMember(owner = "client!ew", name = "v", descriptor = "I")
    public static int field7387 = 0;

    @OriginalMember(owner = "client!ew", name = "u", descriptor = "F")
    public static float field7386;

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "I")
    public int field7371;

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "I")
    public int field7374;

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "I")
    public static int field7375;

    @OriginalMember(owner = "client!ew", name = "m", descriptor = "I")
    public static int field7378;

    @OriginalMember(owner = "client!ew", name = "r", descriptor = "I")
    public int field7383;

    @OriginalMember(owner = "client!ew", name = "t", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!ew", name = "s", descriptor = "Lqda;")
    public static class112 field7384;

    @OriginalMember(owner = "client!ew", name = "o", descriptor = "Lgka;")
    public class389 field7380;

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "[I")
    public int[] field7367;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "[I")
    public int[] field7368;

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "[I")
    public int[] field7369;

    @OriginalMember(owner = "client!ew", name = "l", descriptor = "[I")
    public int[] field7377;

    @OriginalMember(owner = "client!ew", name = "n", descriptor = "[I")
    public int[] field7379;

    @OriginalMember(owner = "client!ew", name = "w", descriptor = "[I")
    public int[] field7388;

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "[Lgka;")
    public class389[] field7373;

    @OriginalMember(owner = "client!ew", name = "k", descriptor = "[[B")
    public byte[][] field7376;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "[[I")
    public int[][] field7366;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "[[I")
    public int[][] field7370;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)V")
    public static final void method3007(int arg0) {
        field7378++;
        class49.field707.method2369(-1);
        if (arg0 != 1) {
            field7384 = null;
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)V")
    public static void method3008(byte arg0) {
        if (arg0 != 6) {
            method3007(55);
        }
        field7384 = null;
        field7382 = null;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(III)Z")
    public static final boolean method3009(int arg0, int arg1, int arg2) {
        field7375++;
        if (((arg2 & 0x10000) != arg0 | class627.method3590(arg0 - 61, arg1, arg2)) || class581.method3381(-55, arg2, arg1)) {
            return true;
        } else {
            return (arg1 & 0x37) == 0 && class339.method2177(arg2, arg1, false);
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B[B)V")
    private final void method3010(byte arg0, byte[] arg1) {
        field7385++;
        int var3 = -57 / ((arg0 - 19) / 62);
        class120 var4 = new class120(class264.method1740(arg1, (byte) 121));
        int var5 = var4.method842(2384);
        if (var5 < 5 || var5 > 6) {
            throw new RuntimeException();
        }
        if (var5 < 6) {
            this.field7374 = 0;
        } else {
            this.field7374 = var4.method871(23995);
        }
        int var6 = var4.method842(2384);
        boolean var7 = (var6 & 0x1) != 0;
        this.field7371 = var4.method898((byte) -77);
        boolean var8 = (var6 & 0x2) != 0;
        int var9 = 0;
        int var10 = -1;
        this.field7377 = new int[this.field7371];
        for (int var11 = 0; var11 < this.field7371; var11++) {
            this.field7377[var11] = var9 += var4.method898((byte) -114);
            if (var10 < this.field7377[var11]) {
                var10 = this.field7377[var11];
            }
        }
        this.field7383 = var10 + 1;
        if (var8) {
            this.field7376 = new byte[this.field7383][];
        }
        this.field7369 = new int[this.field7383];
        this.field7366 = new int[this.field7383][];
        this.field7379 = new int[this.field7383];
        this.field7367 = new int[this.field7383];
        this.field7368 = new int[this.field7383];
        if (var7) {
            this.field7388 = new int[this.field7383];
            for (int var12 = 0; var12 < this.field7383; var12++) {
                this.field7388[var12] = -1;
            }
            for (int var13 = 0; var13 < this.field7371; var13++) {
                this.field7388[this.field7377[var13]] = var4.method871(23995);
            }
            this.field7380 = new class389(this.field7388);
        }
        for (int var14 = 0; var14 < this.field7371; var14++) {
            this.field7379[this.field7377[var14]] = var4.method871(23995);
        }
        if (var8) {
            for (int var15 = 0; var15 < this.field7371; var15++) {
                byte[] var16 = new byte[64];
                var4.method850(255, 0, 64, var16);
                this.field7376[this.field7377[var15]] = var16;
            }
        }
        for (int var17 = 0; var17 < this.field7371; var17++) {
            this.field7369[this.field7377[var17]] = var4.method871(23995);
        }
        for (int var18 = 0; var18 < this.field7371; var18++) {
            this.field7367[this.field7377[var18]] = var4.method898((byte) -84);
        }
        for (int var19 = 0; var19 < this.field7371; var19++) {
            int var26 = this.field7377[var19];
            int var27 = 0;
            int var28 = this.field7367[var26];
            this.field7366[var26] = new int[var28];
            int var29 = -1;
            for (int var30 = 0; var30 < var28; var30++) {
                int var31 = this.field7366[var26][var30] = var27 += var4.method898((byte) -103);
                if (var29 < var31) {
                    var29 = var31;
                }
            }
            this.field7368[var26] = var29 + 1;
            if (var29 + 1 == var28) {
                this.field7366[var26] = null;
            }
        }
        if (!var7) {
            return;
        }
        this.field7370 = new int[var10 + 1][];
        this.field7373 = new class389[var10 + 1];
        for (int var20 = 0; var20 < this.field7371; var20++) {
            int var21 = this.field7377[var20];
            int var22 = this.field7367[var21];
            this.field7370[var21] = new int[this.field7368[var21]];
            for (int var23 = 0; var23 < this.field7368[var21]; var23++) {
                this.field7370[var21][var23] = -1;
            }
            for (int var24 = 0; var24 < var22; var24++) {
                int var25;
                if (this.field7366[var21] == null) {
                    var25 = var24;
                } else {
                    var25 = this.field7366[var21][var24];
                }
                this.field7370[var21][var25] = var4.method871(23995);
            }
            this.field7373[var21] = new class389(this.field7370[var21]);
        }
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "([BI[B)V")
    public class516(byte[] arg0, int arg1, byte[] arg2) {
        this.field7372 = class459.method2739((byte) 10, arg0, arg0.length);
        if (this.field7372 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field7381 = class759.method4188(arg0.length, 0, arg0, (byte) 112);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field7381[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method3010((byte) 111, arg0);
    }
}
