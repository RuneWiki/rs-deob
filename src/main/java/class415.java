import jaggl.OpenGL;
import jaggl.memory.NativeStream;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class415 extends class285 {

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "Z")
    private boolean field5930 = true;

    @OriginalMember(owner = "client!oj", name = "xb", descriptor = "I")
    private int field5977 = 0;

    @OriginalMember(owner = "client!oj", name = "X", descriptor = "I")
    private int field5951 = 0;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "Z")
    private boolean field5913 = false;

    @OriginalMember(owner = "client!oj", name = "ub", descriptor = "I")
    private int field5974 = 0;

    @OriginalMember(owner = "client!oj", name = "Fb", descriptor = "I")
    private int field5985 = 0;

    @OriginalMember(owner = "client!oj", name = "bc", descriptor = "I")
    private int field6007 = 0;

    @OriginalMember(owner = "client!oj", name = "ec", descriptor = "Lpg;")
    private class333 field6010;

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "Lhf;")
    private class475 field5932;

    @OriginalMember(owner = "client!oj", name = "Y", descriptor = "Lhf;")
    private class475 field5952;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "Lhf;")
    private class475 field5922;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "Lhf;")
    private class475 field5912;

    @OriginalMember(owner = "client!oj", name = "vb", descriptor = "Lfb;")
    private class36 field5975;

    @OriginalMember(owner = "client!oj", name = "Kb", descriptor = "I")
    private int field5990;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    private int field5916;

    @OriginalMember(owner = "client!oj", name = "eb", descriptor = "[I")
    private int[] field5958;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "[I")
    private int[] field5933;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "[I")
    private int[] field5923;

    @OriginalMember(owner = "client!oj", name = "ib", descriptor = "[S")
    private short[] field5962;

    @OriginalMember(owner = "client!oj", name = "Rb", descriptor = "[I")
    private int[] field5997;

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "[Lmf;")
    private class51[] field5938;

    @OriginalMember(owner = "client!oj", name = "pb", descriptor = "[Lqe;")
    private class502[] field5969;

    @OriginalMember(owner = "client!oj", name = "W", descriptor = "I")
    private int field5950;

    @OriginalMember(owner = "client!oj", name = "kc", descriptor = "[Lvt;")
    private class277[] field6016;

    @OriginalMember(owner = "client!oj", name = "P", descriptor = "[Loq;")
    private class500[] field5943;

    @OriginalMember(owner = "client!oj", name = "ab", descriptor = "S")
    private short field5954;

    @OriginalMember(owner = "client!oj", name = "gb", descriptor = "[S")
    private short[] field5960;

    @OriginalMember(owner = "client!oj", name = "ob", descriptor = "[F")
    private float[] field5968;

    @OriginalMember(owner = "client!oj", name = "hb", descriptor = "[S")
    private short[] field5961;

    @OriginalMember(owner = "client!oj", name = "Db", descriptor = "[F")
    private float[] field5983;

    @OriginalMember(owner = "client!oj", name = "qc", descriptor = "[S")
    private short[] field6022;

    @OriginalMember(owner = "client!oj", name = "nc", descriptor = "S")
    private short field6019;

    @OriginalMember(owner = "client!oj", name = "Bb", descriptor = "[B")
    private byte[] field5981;

    @OriginalMember(owner = "client!oj", name = "Pb", descriptor = "[S")
    private short[] field5995;

    @OriginalMember(owner = "client!oj", name = "fc", descriptor = "[S")
    private short[] field6011;

    @OriginalMember(owner = "client!oj", name = "Gb", descriptor = "[S")
    private short[] field5986;

    @OriginalMember(owner = "client!oj", name = "Yb", descriptor = "[S")
    private short[] field6004;

    @OriginalMember(owner = "client!oj", name = "S", descriptor = "[B")
    private byte[] field5946;

    @OriginalMember(owner = "client!oj", name = "Mb", descriptor = "[S")
    private short[] field5992;

    @OriginalMember(owner = "client!oj", name = "Eb", descriptor = "[S")
    private short[] field5984;

    @OriginalMember(owner = "client!oj", name = "U", descriptor = "[S")
    private short[] field5948;

    @OriginalMember(owner = "client!oj", name = "qb", descriptor = "[I")
    private int[] field5970;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "[[I")
    private int[][] field5914;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "[[I")
    private int[][] field5917;

    @OriginalMember(owner = "client!oj", name = "dc", descriptor = "[[I")
    private int[][] field6009;

    @OriginalMember(owner = "client!oj", name = "pc", descriptor = "[I")
    public static int[] field6021 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!oj", name = "Cb", descriptor = "Lhi;")
    public static class45 field5982 = new class45(50, -1);

    @OriginalMember(owner = "client!oj", name = "sc", descriptor = "Lgs;")
    public static class439 field6024;

    @OriginalMember(owner = "client!oj", name = "uc", descriptor = "Z")
    public static boolean field6026;

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "B")
    private byte field5940;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    public static int field5918;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    public static int field5920;

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "I")
    public static int field5924;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "I")
    public static int field5929;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!oj", name = "Q", descriptor = "I")
    public static int field5944;

    @OriginalMember(owner = "client!oj", name = "R", descriptor = "I")
    public static int field5945;

    @OriginalMember(owner = "client!oj", name = "T", descriptor = "I")
    public static int field5947;

    @OriginalMember(owner = "client!oj", name = "V", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!oj", name = "Z", descriptor = "I")
    public static int field5953;

    @OriginalMember(owner = "client!oj", name = "bb", descriptor = "I")
    public static int field5955;

    @OriginalMember(owner = "client!oj", name = "cb", descriptor = "I")
    public static int field5956;

    @OriginalMember(owner = "client!oj", name = "jb", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!oj", name = "mb", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!oj", name = "nb", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!oj", name = "rb", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!oj", name = "sb", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!oj", name = "tb", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!oj", name = "wb", descriptor = "I")
    public static int field5976;

    @OriginalMember(owner = "client!oj", name = "yb", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!oj", name = "Hb", descriptor = "I")
    public static int field5987;

    @OriginalMember(owner = "client!oj", name = "Ib", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!oj", name = "Jb", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!oj", name = "Lb", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!oj", name = "Ob", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!oj", name = "Qb", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!oj", name = "Sb", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!oj", name = "Tb", descriptor = "I")
    public static int field5999;

    @OriginalMember(owner = "client!oj", name = "Ub", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!oj", name = "Vb", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!oj", name = "Wb", descriptor = "I")
    public static int field6002;

    @OriginalMember(owner = "client!oj", name = "Xb", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!oj", name = "Zb", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!oj", name = "ac", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!oj", name = "cc", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!oj", name = "gc", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!oj", name = "ic", descriptor = "I")
    public static int field6014;

    @OriginalMember(owner = "client!oj", name = "jc", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!oj", name = "lc", descriptor = "I")
    public static int field6017;

    @OriginalMember(owner = "client!oj", name = "mc", descriptor = "I")
    public static int field6018;

    @OriginalMember(owner = "client!oj", name = "oc", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!oj", name = "rc", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!oj", name = "vc", descriptor = "I")
    public static int field6027;

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "Lnn;")
    private class171 field5939;

    @OriginalMember(owner = "client!oj", name = "lb", descriptor = "Lfw;")
    private class337 field5965;

    @OriginalMember(owner = "client!oj", name = "hc", descriptor = "Lgj;")
    private class70 field6013;

    @OriginalMember(owner = "client!oj", name = "tc", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field6025;

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "S")
    private short field5936;

    @OriginalMember(owner = "client!oj", name = "db", descriptor = "S")
    private short field5957;

    @OriginalMember(owner = "client!oj", name = "fb", descriptor = "S")
    private short field5959;

    @OriginalMember(owner = "client!oj", name = "kb", descriptor = "S")
    private short field5964;

    @OriginalMember(owner = "client!oj", name = "zb", descriptor = "S")
    private short field5979;

    @OriginalMember(owner = "client!oj", name = "Ab", descriptor = "S")
    private short field5980;

    @OriginalMember(owner = "client!oj", name = "Nb", descriptor = "S")
    private short field5993;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lsh;B)V")
    private final void method2439(class511 arg0, byte arg1) {
        if (this.field5938 != null) {
            for (int var3 = 0; var3 < this.field5938.length; var3++) {
                class51 var4 = this.field5938[var3];
                class51 var5 = var4;
                if (var4.field740 != null) {
                    var5 = var4.field740;
                }
                var5.field741 = (int) ((float) this.field5923[var4.field735] * arg0.field7481 + (float) this.field5997[var4.field735] * arg0.field7468 + (float) this.field5933[var4.field735] * arg0.field7469 + arg0.field7479);
                var5.field729 = (int) ((float) this.field5923[var4.field735] * arg0.field7477 + (float) this.field5997[var4.field735] * arg0.field7486 + (float) this.field5933[var4.field735] * arg0.field7487 + arg0.field7472);
                var5.field747 = (int) ((float) this.field5923[var4.field735] * arg0.field7473 + (float) this.field5997[var4.field735] * arg0.field7471 + (float) this.field5933[var4.field735] * arg0.field7498 + arg0.field7484);
                var5.field730 = (int) ((float) this.field5923[var4.field737] * arg0.field7481 + (float) this.field5997[var4.field737] * arg0.field7468 + (float) this.field5933[var4.field737] * arg0.field7469 + arg0.field7479);
                var5.field734 = (int) ((float) this.field5923[var4.field737] * arg0.field7477 + (float) this.field5997[var4.field737] * arg0.field7486 + (float) this.field5933[var4.field737] * arg0.field7487 + arg0.field7472);
                var5.field749 = (int) ((float) this.field5923[var4.field737] * arg0.field7473 + (float) this.field5997[var4.field737] * arg0.field7471 + (float) this.field5933[var4.field737] * arg0.field7498 + arg0.field7484);
                var5.field744 = (int) ((float) this.field5923[var4.field738] * arg0.field7481 + (float) this.field5997[var4.field738] * arg0.field7468 + (float) this.field5933[var4.field738] * arg0.field7469 + arg0.field7479);
                var5.field742 = (int) ((float) this.field5923[var4.field738] * arg0.field7477 + (float) this.field5997[var4.field738] * arg0.field7486 + (float) this.field5933[var4.field738] * arg0.field7487 + arg0.field7472);
                var5.field732 = (int) ((float) this.field5923[var4.field738] * arg0.field7473 + (float) this.field5997[var4.field738] * arg0.field7471 + (float) this.field5933[var4.field738] * arg0.field7498 + arg0.field7484);
            }
        }
        if (arg1 <= 16) {
            this.field6013 = null;
        }
        field5934++;
        if (this.field5969 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field5969.length; var6++) {
            class502 var7 = this.field5969[var6];
            class502 var8 = var7;
            if (var7.field7342 != null) {
                var8 = var7.field7342;
            }
            if (var7.field7345 == null) {
                var7.field7345 = arg0.method947();
            } else {
                var7.field7345.method944(arg0);
            }
            var8.field7338 = (int) ((float) this.field5923[var7.field7344] * arg0.field7481 + (float) this.field5997[var7.field7344] * arg0.field7468 + (float) this.field5933[var7.field7344] * arg0.field7469 + arg0.field7479);
            var8.field7332 = (int) ((float) this.field5923[var7.field7344] * arg0.field7477 + (float) this.field5997[var7.field7344] * arg0.field7486 + (float) this.field5933[var7.field7344] * arg0.field7487 + arg0.field7472);
            var8.field7333 = (int) ((float) this.field5923[var7.field7344] * arg0.field7473 + (float) this.field5997[var7.field7344] * arg0.field7471 + (float) this.field5933[var7.field7344] * arg0.field7498 + arg0.field7484);
        }
    }

    @OriginalMember(owner = "client!oj", name = "KA", descriptor = "()V")
    public final void method665() {
        for (int var1 = 0; var1 < this.field6007; var1++) {
            this.field5997[var1] = this.field5997[var1] + 7 >> 4;
            this.field5933[var1] = this.field5933[var1] + 7 >> 4;
            this.field5923[var1] = this.field5923[var1] + 7 >> 4;
        }
        field6020++;
        if (this.field5932 != null) {
            this.field5932.field6875 = null;
        }
        this.field5913 = false;
    }

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "()Z")
    public final boolean method664() {
        field6023++;
        if (this.field5914 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field6007; var1++) {
            this.field5997[var1] <<= 0x4;
            this.field5933[var1] <<= 0x4;
            this.field5923[var1] <<= 0x4;
        }
        class451.field6615 = 0;
        class49.field698 = 0;
        class245.field3355 = 0;
        return true;
    }

    @OriginalMember(owner = "client!oj", name = "ta", descriptor = "()I")
    public final int method700() {
        if (!this.field5913) {
            this.method2449(24317);
        }
        field6008++;
        return this.field5957;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public static void method2440(byte arg0) {
        field6021 = null;
        int var1 = 10 / ((-arg0 - 31) / 45);
        field5982 = null;
        field6025 = null;
        field6024 = null;
    }

    @OriginalMember(owner = "client!oj", name = "Y", descriptor = "()I")
    public final int method722() {
        field5988++;
        return this.field6019;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IILc;Z)Z")
    public final boolean method684(int arg0, int arg1, class512 arg2, boolean arg3) {
        field5918++;
        class511 var5 = (class511) arg2;
        class511 var6 = this.field6010.field4851;
        float var7 = var5.field7484 * var6.field7481 + var5.field7479 * var6.field7468 + var5.field7472 * var6.field7469 + var6.field7479;
        float var8 = var5.field7484 * var6.field7477 + var5.field7479 * var6.field7486 + var5.field7472 * var6.field7487 + var6.field7472;
        class519.field7629 = var5.field7473 * var6.field7477 + var5.field7481 * var6.field7486 + var5.field7477 * var6.field7487;
        class159.field2420 = var5.field7498 * var6.field7481 + var5.field7487 * var6.field7469 + var5.field7469 * var6.field7468;
        class160.field2425 = var5.field7471 * var6.field7477 + var5.field7486 * var6.field7487 + var5.field7468 * var6.field7486;
        float var9 = var5.field7484 * var6.field7473 + var5.field7479 * var6.field7471 + var5.field7472 * var6.field7498 + var6.field7484;
        class326.field4461 = var5.field7471 * var6.field7473 + var5.field7486 * var6.field7498 + var5.field7468 * var6.field7471;
        class128.field1973 = var5.field7498 * var6.field7473 + var5.field7487 * var6.field7498 + var5.field7469 * var6.field7471;
        class417.field6051 = var5.field7471 * var6.field7481 + var5.field7486 * var6.field7469 + var5.field7468 * var6.field7468;
        class499.field7310 = var5.field7498 * var6.field7477 + var5.field7487 * var6.field7487 + var5.field7469 * var6.field7486;
        class143.field2128 = var5.field7473 * var6.field7481 + var5.field7481 * var6.field7468 + var5.field7477 * var6.field7469;
        class65.field945 = var5.field7473 * var6.field7473 + var5.field7481 * var6.field7471 + var5.field7477 * var6.field7498;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field6010.field4822;
        int var16 = this.field6010.field4774;
        if (!this.field5913) {
            this.method2449(24317);
        }
        class441.field6361[0] = this.field5957;
        class222.field3145[0] = this.field5959;
        class441.field6361[1] = this.field5964;
        class199.field2902[0] = this.field5993;
        class222.field3145[1] = this.field5959;
        class199.field2902[1] = this.field5993;
        class441.field6361[2] = this.field5957;
        class222.field3145[2] = this.field5980;
        class199.field2902[2] = this.field5993;
        class441.field6361[3] = this.field5964;
        class222.field3145[3] = this.field5980;
        class199.field2902[3] = this.field5993;
        class441.field6361[4] = this.field5957;
        class222.field3145[4] = this.field5959;
        class441.field6361[5] = this.field5964;
        class199.field2902[4] = this.field5979;
        class222.field3145[5] = this.field5959;
        class199.field2902[5] = this.field5979;
        class441.field6361[6] = this.field5957;
        class222.field3145[6] = this.field5980;
        class441.field6361[7] = this.field5964;
        class199.field2902[6] = this.field5979;
        class222.field3145[7] = this.field5980;
        class199.field2902[7] = this.field5979;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class222.field3145[var17];
            float var39 = (float) class199.field2902[var17];
            float var40 = (float) class441.field6361[var17];
            float var41 = class143.field2128 * var39 + class417.field6051 * var40 + class159.field2420 * var38 + var7;
            float var42 = class65.field945 * var39 + class326.field4461 * var40 + class128.field1973 * var38 + var9;
            float var43 = class519.field7629 * var39 + class499.field7310 * var38 + class160.field2425 * var40 + var8;
            if (var42 >= (float) this.field6010.field4790) {
                float var44 = (float) var15 * var41 / var42 + (float) this.field6010.field4758;
                if (var44 < var11) {
                    var11 = var44;
                }
                if (var12 < var44) {
                    var12 = var44;
                }
                float var45 = (float) var16 * var43 / var42 + (float) this.field6010.field4770;
                var10 = true;
                if (var13 > var45) {
                    var13 = var45;
                }
                if (var14 < var45) {
                    var14 = var45;
                }
            }
        }
        if (var10 && var11 < (float) arg0 && (float) arg0 < var12 && (float) arg1 > var13 && var14 > (float) arg1) {
            if (arg3) {
                return true;
            }
            if (this.field5985 > this.field6010.field4872.length) {
                this.field6010.field4872 = new int[this.field5985];
                this.field6010.field4870 = new int[this.field5985];
            }
            int[] var18 = this.field6010.field4872;
            int[] var19 = this.field6010.field4870;
            for (int var20 = 0; var20 < this.field5977; var20++) {
                float var22 = (float) this.field5923[var20];
                float var23 = (float) this.field5933[var20];
                float var24 = (float) this.field5997[var20];
                float var25 = class519.field7629 * var22 + class499.field7310 * var23 + class160.field2425 * var24 + var8;
                float var26 = class65.field945 * var22 + class326.field4461 * var24 + class128.field1973 * var23 + var9;
                float var27 = class143.field2128 * var22 + class417.field6051 * var24 + class159.field2420 * var23 + var7;
                if ((float) this.field6010.field4790 <= var26) {
                    int var28 = (int) ((float) var15 * var27 / var26 + (float) this.field6010.field4758);
                    int var29 = (int) ((float) var16 * var25 / var26 + (float) this.field6010.field4770);
                    int var30 = this.field5958[var20];
                    int var31 = this.field5958[var20 + 1];
                    for (int var32 = var30; var32 < var31; var32++) {
                        int var33 = this.field5995[var32] - 1;
                        if (var33 == -1) {
                            break;
                        }
                        var18[var33] = var28;
                        var19[var33] = var29;
                    }
                } else {
                    int var34 = this.field5958[var20];
                    int var35 = this.field5958[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field5995[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[this.field5995[var36] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field5974; var21++) {
                if (var18[this.field6004[var21]] != -999999 && var18[this.field5948[var21]] != -999999 && var18[this.field6011[var21]] != -999999 && this.method2442(arg0, var18[this.field6011[var21]], var18[this.field6004[var21]], var19[this.field6011[var21]], arg1, var18[this.field5948[var21]], var19[this.field6004[var21]], (byte) -24, var19[this.field5948[var21]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "(III)V")
    public final void method712(int arg0, int arg1, int arg2) {
        field5991++;
        for (int var4 = 0; var4 < this.field5977; var4++) {
            if (arg0 != 128) {
                this.field5997[var4] = this.field5997[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field5933[var4] = this.field5933[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field5923[var4] = this.field5923[var4] * arg2 >> 7;
            }
        }
        if (this.field5932 != null) {
            this.field5932.field6875 = null;
        }
        this.field5913 = false;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IISBI)I")
    private final int method2441(int arg0, int arg1, short arg2, byte arg3, int arg4) {
        if (arg4 >= -16) {
            this.field5961 = null;
        }
        field6014++;
        int var6 = class203.field2946[class264.method1551(2, arg1, arg0)];
        if (arg2 != -1) {
            class249 var7 = this.field6010.field3988.method914(false, arg2 & 0xFFFF);
            int var8 = var7.field3393 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg1 < 0) {
                    var9 = 0;
                } else if (arg1 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg1 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var9 & 0xFF00) * var8 + ((var6 & 0xFF00) * var11) & 0xFF0000) + ((var9 & 0xFF00FF) * var8 + ((var6 & 0xFF00FF) * var11) & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field3387 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = (var6 >> 16 & 0xFF) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = ((var6 & 0xFF00) >> 8) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = ((var13 & 0x8A00FF00) << 8) - (-(var14 & 0xFF00) - (var15 >> 8));
            }
        }
        return (var6 << 8) - ((arg3 & 0xFF) - 255);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIIBI)Z")
    private final boolean method2442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        if (arg7 != -24) {
            this.method722();
        }
        field5989++;
        if (arg4 < arg6 && arg4 < arg8 && arg4 < arg3) {
            return false;
        } else if (arg6 < arg4 && arg4 > arg8 && arg4 > arg3) {
            return false;
        } else if (arg2 > arg0 && arg5 > arg0 && arg1 > arg0) {
            return false;
        } else {
            return arg0 <= arg2 || arg0 <= arg5 || arg0 <= arg1;
        }
    }

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "()I")
    public final int method670() {
        if (!this.field5913) {
            this.method2449(24317);
        }
        field5915++;
        return this.field5959;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IFIIFJBILqq;I)S")
    private final short method2443(int arg0, float arg1, int arg2, int arg3, float arg4, long arg5, byte arg6, int arg7, class496 arg8, int arg9) {
        field5920++;
        int var12 = this.field5958[arg7];
        int var13 = this.field5958[arg7 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field5995[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class509.field7435[var15] == arg5) {
                return (short) (var16 - 1);
            }
        }
        this.field5995[var14] = (short) (this.field5985 + 1);
        if (arg6 != 57) {
            this.method716();
        }
        class509.field7435[var14] = arg5;
        this.field5960[this.field5985] = (short) arg2;
        this.field5992[this.field5985] = (short) arg0;
        this.field5986[this.field5985] = (short) arg3;
        this.field5946[this.field5985] = (byte) arg9;
        this.field5968[this.field5985] = arg1;
        this.field5983[this.field5985] = arg4;
        return (short) (this.field5985++);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILok;)V")
    private final void method2444(int arg0, class74 arg1) {
        if (this.field5985 > this.field6010.field4872.length) {
            this.field6010.field4870 = new int[this.field5985];
            this.field6010.field4872 = new int[this.field5985];
        }
        if (arg0 != -14762) {
            return;
        }
        field5928++;
        int[] var3 = this.field6010.field4872;
        int[] var4 = this.field6010.field4870;
        for (int var5 = 0; var5 < this.field5977; var5++) {
            int var16 = (this.field5997[var5] - (this.field5933[var5] * this.field6010.field4840 >> 8) >> this.field6010.field4728) - arg1.field1044;
            int var17 = (this.field5923[var5] - (this.field5933[var5] * this.field6010.field4861 >> 8) >> this.field6010.field4728) - arg1.field1053;
            int var18 = this.field5958[var5];
            int var19 = this.field5958[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field5995[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field5951; var6++) {
            if (this.field5981 == null || this.field5981[var6] <= 128) {
                short var7 = this.field6004[var6];
                short var8 = this.field5948[var6];
                short var9 = this.field6011[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var10 - var11) * (var14 - var15) - ((var12 - var11) * (var14 - var13)) > 0) {
                    arg1.method583(var13, (byte) -127, var15, var10, var11, var14, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "(I)V")
    public final void method703(int arg0) {
        field5996++;
        this.field5954 = (short) arg0;
        if (this.field5912 != null) {
            this.field5912.field6875 = null;
        }
        if (this.field5922 != null) {
            this.field5922.field6875 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "S", descriptor = "()I")
    public final int method682() {
        if (!this.field5913) {
            this.method2449(24317);
        }
        field5945++;
        return this.field5979;
    }

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "(SS)V")
    public final void method668(short arg0, short arg1) {
        field5973++;
        class127 var3 = this.field6010.field3988;
        for (int var4 = 0; var4 < this.field5974; var4++) {
            if (this.field5961[var4] == arg0) {
                this.field5961[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class249 var7 = var3.method914(false, arg0 & 0xFFFF);
            var5 = var7.field3393;
            var6 = var7.field3387;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class249 var10 = var3.method914(false, arg1 & 0xFFFF);
            var8 = var10.field3393;
            var9 = var10.field3387;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field6016 != null) {
            for (int var11 = 0; var11 < this.field5950; var11++) {
                class277 var12 = this.field6016[var11];
                class500 var13 = this.field5943[var11];
                var13.field7326 = class203.field2946[this.field5984[var12.field3768] & 0xFFFF] & 0xFFFFFF | var13.field7326 & 0xFF000000;
            }
        }
        if (this.field5912 != null) {
            this.field5912.field6875 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
    private final void method2445(byte arg0) {
        field5935++;
        if (this.field5951 == 0) {
            return;
        }
        if (this.field5940 != 0) {
            this.method2453(true, 255);
        }
        if (arg0 > -28) {
            this.method688(100);
        }
        this.method2453(false, 255);
        if (this.field5975 != null) {
            if (this.field5975.field552 == null) {
                this.method2447((this.field5940 & 0x10) != 0, (byte) -123);
            }
            if (this.field5975.field552 != null) {
                this.field6010.method2036(30919, this.field5922 != null);
                this.field6010.method1973(this.field5952, this.field5922, this.field5912, this.field5932, 32888);
                int var2 = this.field5970.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field5970[var3];
                    int var5 = this.field5970[var3 + 1];
                    int var6 = this.field5961[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field6010.method1969(var6, 0, this.field5922 != null);
                    this.field6010.method1964(var4 * 3, (byte) -91, this.field5975.field552, 4, (var5 - var4) * 3);
                }
            }
        }
        this.method2450(0);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lc;Lrr;II)V")
    public final void method666(class512 arg0, class305 arg1, int arg2, int arg3) {
        field5944++;
        if (this.field5985 == 0) {
            return;
        }
        class511 var5 = this.field6010.field4851;
        class511 var6 = (class511) arg0;
        if (!this.field5913) {
            this.method2449(24317);
        }
        class128.field1973 = var5.field7473 * var6.field7498 + var5.field7498 * var6.field7487 + var5.field7471 * var6.field7469;
        class495.field7181 = var5.field7473 * var6.field7484 + var5.field7498 * var6.field7472 + var5.field7471 * var6.field7479 + var5.field7484;
        float var7 = (float) this.field5959 * class128.field1973 + class495.field7181;
        float var8 = (float) this.field5980 * class128.field1973 + class495.field7181;
        float var9;
        float var10;
        if ((var8 < var7)) {
            var9 = (float) (-this.field5936) + var8;
            var10 = (float) this.field5936 + var7;
        } else {
            var9 = var7 - (float) this.field5936;
            var10 = (float) this.field5936 + var8;
        }
        if ((var9 >= this.field6010.field4839) || (var10 <= (float) this.field6010.field4790)) {
            return;
        }
        class431.field6241 = var5.field7481 * var6.field7484 + var5.field7469 * var6.field7472 + var5.field7468 * var6.field7479 + var5.field7479;
        class159.field2420 = var5.field7481 * var6.field7498 + var5.field7469 * var6.field7487 + var5.field7468 * var6.field7469;
        float var11 = (float) this.field5959 * class159.field2420 + class431.field6241;
        float var12 = (float) this.field5980 * class159.field2420 + class431.field6241;
        float var13;
        float var14;
        if ((var12 < var11)) {
            var14 = ((float) (-this.field5936) + var12) * (float) this.field6010.field4822;
            var13 = ((float) this.field5936 + var11) * (float) this.field6010.field4822;
        } else {
            var13 = ((float) this.field5936 + var12) * (float) this.field6010.field4822;
            var14 = (var11 - (float) this.field5936) * (float) this.field6010.field4822;
        }
        if ((var14 / (float) arg2 >= this.field6010.field4780) || (this.field6010.field4750 >= var13 / (float) arg2)) {
            return;
        }
        class499.field7310 = var5.field7477 * var6.field7498 + var5.field7487 * var6.field7487 + var5.field7486 * var6.field7469;
        class104.field1711 = var5.field7477 * var6.field7484 + var5.field7487 * var6.field7472 + var5.field7486 * var6.field7479 + var5.field7472;
        float var15 = (float) this.field5959 * class499.field7310 + class104.field1711;
        float var16 = (float) this.field5980 * class499.field7310 + class104.field1711;
        float var17;
        float var18;
        if ((var15 > var16)) {
            var18 = ((float) this.field5936 + var15) * (float) this.field6010.field4774;
            var17 = ((float) (-this.field5936) + var16) * (float) this.field6010.field4774;
        } else {
            var17 = (var15 - (float) this.field5936) * (float) this.field6010.field4774;
            var18 = ((float) this.field5936 + var16) * (float) this.field6010.field4774;
        }
        if ((this.field6010.field4847 <= var17 / (float) arg2) || (var18 / (float) arg2 <= this.field6010.field4830)) {
            return;
        }
        if (arg1 != null || this.field6016 != null) {
            class519.field7629 = var5.field7477 * var6.field7473 + var5.field7487 * var6.field7477 + var5.field7486 * var6.field7481;
            class417.field6051 = var5.field7481 * var6.field7471 + var5.field7469 * var6.field7486 + var5.field7468 * var6.field7468;
            class143.field2128 = var5.field7481 * var6.field7473 + var5.field7469 * var6.field7477 + var5.field7468 * var6.field7481;
            class65.field945 = var5.field7473 * var6.field7473 + var5.field7498 * var6.field7477 + var5.field7471 * var6.field7481;
            class160.field2425 = var5.field7477 * var6.field7471 + var5.field7487 * var6.field7486 + var5.field7486 * var6.field7468;
            class326.field4461 = var5.field7473 * var6.field7471 + var5.field7498 * var6.field7486 + var5.field7471 * var6.field7468;
        }
        if (arg1 != null) {
            int var19 = this.field5964 + this.field5957 >> 1;
            int var20 = this.field5993 + this.field5979 >> 1;
            int var21 = (int) ((float) var20 * class143.field2128 + (float) this.field5959 * class159.field2420 + (float) var19 * class417.field6051 + class431.field6241);
            int var22 = (int) ((float) var20 * class519.field7629 + (float) this.field5959 * class499.field7310 + (float) var19 * class160.field2425 + class104.field1711);
            int var23 = (int) ((float) var20 * class65.field945 + (float) this.field5959 * class128.field1973 + (float) var19 * class326.field4461 + class495.field7181);
            int var24 = (int) ((float) var20 * class143.field2128 + (float) this.field5980 * class159.field2420 + (float) var19 * class417.field6051 + class431.field6241);
            int var25 = (int) ((float) var20 * class519.field7629 + (float) this.field5980 * class499.field7310 + (float) var19 * class160.field2425 + class104.field1711);
            arg1.field4131 = this.field6010.field4822 * var21 / arg2 + this.field6010.field4758;
            arg1.field4136 = this.field6010.field4770 + (this.field6010.field4774 * var22 / arg2);
            int var26 = (int) ((float) var20 * class65.field945 + (float) this.field5980 * class128.field1973 + (float) var19 * class326.field4461 + class495.field7181);
            arg1.field4133 = this.field6010.field4822 * var24 / arg2 + this.field6010.field4758;
            arg1.field4134 = this.field6010.field4774 * var25 / arg2 + this.field6010.field4770;
            if (this.field6010.field4790 > var23 && this.field6010.field4790 > var26) {
                arg1.field4135 = true;
                arg1.field4132 = (this.field5936 + var21) * this.field6010.field4822 / arg2 + this.field6010.field4758 - arg1.field4131;
            }
        }
        this.field6010.method2013((byte) -42, (float) arg2);
        this.field6010.method2015(-101);
        this.field6010.method2037(-8497, var6);
        this.method2445((byte) -110);
        this.field6010.method1971(-32);
        this.method2451(-1191701960);
    }

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "()V")
    public final void method686() {
        field6015++;
        for (int var1 = 0; var1 < this.field5977; var1++) {
            this.field5923[var1] = -this.field5923[var1];
        }
        for (int var2 = 0; var2 < this.field5985; var2++) {
            this.field5986[var2] = (short) (-this.field5986[var2]);
        }
        for (int var3 = 0; var3 < this.field5974; var3++) {
            short var4 = this.field6004[var3];
            this.field6004[var3] = this.field6011[var3];
            this.field6011[var3] = var4;
        }
        if (this.field5922 == null && this.field5912 != null) {
            this.field5912.field6875 = null;
        }
        if (this.field5922 != null) {
            this.field5922.field6875 = null;
        }
        if (this.field5975 != null) {
            this.field5975.field552 = null;
        }
        this.field5913 = false;
        if (this.field5932 != null) {
            this.field5932.field6875 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "(I)V")
    public final void method688(int arg0) {
        field5994++;
        int var2 = class51.field743[arg0];
        int var3 = class51.field731[arg0];
        for (int var4 = 0; var4 < this.field5977; var4++) {
            int var7 = this.field5997[var4] * var3 + this.field5923[var4] * var2 >> 15;
            this.field5923[var4] = this.field5923[var4] * var3 - this.field5997[var4] * var2 >> 15;
            this.field5997[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field5985; var5++) {
            int var6 = this.field5986[var5] * var2 + this.field5960[var5] * var3 >> 15;
            this.field5986[var5] = (short) (this.field5986[var5] * var3 - (this.field5960[var5] * var2) >> 15);
            this.field5960[var5] = (short) var6;
        }
        if (this.field5922 == null && this.field5912 != null) {
            this.field5912.field6875 = null;
        }
        if (this.field5922 != null) {
            this.field5922.field6875 = null;
        }
        this.field5913 = false;
        if (this.field5932 != null) {
            this.field5932.field6875 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Loj;ZIZILoj;)Le;")
    private final class285 method2446(class415 arg0, boolean arg1, int arg2, boolean arg3, int arg4, class415 arg5) {
        arg5.field5950 = this.field5950;
        arg5.field5977 = this.field5977;
        arg5.field5951 = this.field5951;
        arg5.field5954 = this.field5954;
        arg5.field6019 = this.field6019;
        arg5.field5990 = arg2;
        arg5.field5974 = this.field5974;
        arg5.field5985 = this.field5985;
        field5953++;
        arg5.field5916 = this.field5916;
        arg5.field5940 = 0;
        arg5.field6007 = this.field6007;
        boolean var7 = class502.method2981(this.field5916, arg2, 22);
        boolean var8 = class373.method2234(arg2, this.field5916, -27219);
        boolean var9 = class124.method900(this.field5916, arg4 ^ 0x34, arg2);
        boolean var10 = var7 | var8 | var9;
        if (var10) {
            if (!var7) {
                arg5.field5997 = this.field5997;
            } else if (arg0.field5997 == null || this.field6007 > arg0.field5997.length) {
                arg5.field5997 = arg0.field5997 = new int[this.field6007];
            } else {
                arg5.field5997 = arg0.field5997;
            }
            if (!var8) {
                arg5.field5933 = this.field5933;
            } else if (arg0.field5933 == null || arg0.field5933.length < this.field6007) {
                arg5.field5933 = arg0.field5933 = new int[this.field6007];
            } else {
                arg5.field5933 = arg0.field5933;
            }
            if (!var9) {
                arg5.field5923 = this.field5923;
            } else if (arg0.field5923 == null || this.field6007 > arg0.field5923.length) {
                arg5.field5923 = arg0.field5923 = new int[this.field6007];
            } else {
                arg5.field5923 = arg0.field5923;
            }
            for (int var11 = 0; var11 < this.field6007; var11++) {
                if (var7) {
                    arg5.field5997[var11] = this.field5997[var11];
                }
                if (var8) {
                    arg5.field5933[var11] = this.field5933[var11];
                }
                if (var9) {
                    arg5.field5923[var11] = this.field5923[var11];
                }
            }
        } else {
            arg5.field5933 = this.field5933;
            arg5.field5997 = this.field5997;
            arg5.field5923 = this.field5923;
        }
        if (class267.method1575(arg2, this.field5916, -418764735)) {
            arg5.field5932 = arg0.field5932;
            if (arg3) {
                arg5.field5940 = (byte) (arg5.field5940 | 0x1);
            }
            arg5.field5932.field6868 = this.field5932.field6868;
            arg5.field5932.field6875 = this.field5932.field6875;
        } else if (class411.method2413(arg2, (byte) -19, this.field5916)) {
            arg5.field5932 = this.field5932;
        } else {
            arg5.field5932 = null;
        }
        if (class348.method2088(this.field5916, (byte) -83, arg2)) {
            if (arg0.field5984 == null || arg0.field5984.length < this.field5974) {
                arg5.field5984 = arg0.field5984 = new short[this.field5974];
            } else {
                arg5.field5984 = arg0.field5984;
            }
            for (int var12 = 0; var12 < this.field5974; var12++) {
                arg5.field5984[var12] = this.field5984[var12];
            }
        } else {
            arg5.field5984 = this.field5984;
        }
        if (class4.method28(arg2, arg4 ^ 0xFFFFB12D, this.field5916)) {
            if (arg0.field5981 == null || this.field5974 > arg0.field5981.length) {
                arg5.field5981 = arg0.field5981 = new byte[this.field5974];
            } else {
                arg5.field5981 = arg0.field5981;
            }
            for (int var13 = 0; var13 < this.field5974; var13++) {
                arg5.field5981[var13] = this.field5981[var13];
            }
        } else {
            arg5.field5981 = this.field5981;
        }
        if (class391.method2317(true, arg2, this.field5916)) {
            if (arg3) {
                arg5.field5940 = (byte) (arg5.field5940 | 0x2);
            }
            arg5.field5912 = arg0.field5912;
            arg5.field5912.field6868 = this.field5912.field6868;
            arg5.field5912.field6875 = this.field5912.field6875;
        } else if (class151.method1091((byte) -96, this.field5916, arg2)) {
            arg5.field5912 = this.field5912;
        } else {
            arg5.field5912 = null;
        }
        if (class463.method2689((byte) -120, this.field5916, arg2)) {
            if (arg0.field5960 == null || arg0.field5960.length < this.field5985) {
                int var14 = this.field5985;
                arg5.field5992 = arg0.field5992 = new short[var14];
                arg5.field5986 = arg0.field5986 = new short[var14];
                arg5.field5960 = arg0.field5960 = new short[var14];
            } else {
                arg5.field5986 = arg0.field5986;
                arg5.field5960 = arg0.field5960;
                arg5.field5992 = arg0.field5992;
            }
            if (this.field6013 == null) {
                for (int var15 = 0; var15 < this.field5985; var15++) {
                    arg5.field5960[var15] = this.field5960[var15];
                    arg5.field5992[var15] = this.field5992[var15];
                    arg5.field5986[var15] = this.field5986[var15];
                }
            } else {
                if (arg0.field6013 == null) {
                    arg0.field6013 = new class70();
                }
                class70 var16 = arg5.field6013 = arg0.field6013;
                if (var16.field1014 == null || this.field5985 > var16.field1014.length) {
                    int var17 = this.field5985;
                    var16.field1016 = new short[var17];
                    var16.field1014 = new short[var17];
                    var16.field1017 = new short[var17];
                    var16.field1013 = new byte[var17];
                }
                for (int var18 = 0; var18 < this.field5985; var18++) {
                    arg5.field5960[var18] = this.field5960[var18];
                    arg5.field5992[var18] = this.field5992[var18];
                    arg5.field5986[var18] = this.field5986[var18];
                    var16.field1014[var18] = this.field6013.field1014[var18];
                    var16.field1017[var18] = this.field6013.field1017[var18];
                    var16.field1016[var18] = this.field6013.field1016[var18];
                    var16.field1013[var18] = this.field6013.field1013[var18];
                }
            }
            arg5.field5946 = this.field5946;
        } else {
            arg5.field5946 = this.field5946;
            arg5.field5960 = this.field5960;
            arg5.field5992 = this.field5992;
            arg5.field5986 = this.field5986;
            arg5.field6013 = this.field6013;
        }
        if (class24.method145(this.field5916, arg2, (byte) -126)) {
            if (arg3) {
                arg5.field5940 = (byte) (arg5.field5940 | 0x4);
            }
            arg5.field5922 = arg0.field5922;
            arg5.field5922.field6875 = this.field5922.field6875;
            arg5.field5922.field6868 = this.field5922.field6868;
        } else if (class281.method1626(this.field5916, (byte) -22, arg2)) {
            arg5.field5922 = this.field5922;
        } else {
            arg5.field5922 = null;
        }
        if (class279.method1614((byte) -85, this.field5916, arg2)) {
            if (arg0.field5968 == null || arg0.field5968.length < this.field5974) {
                int var19 = this.field5985;
                arg5.field5968 = arg0.field5968 = new float[var19];
                arg5.field5983 = arg0.field5983 = new float[var19];
            } else {
                arg5.field5983 = arg0.field5983;
                arg5.field5968 = arg0.field5968;
            }
            for (int var20 = 0; var20 < this.field5985; var20++) {
                arg5.field5968[var20] = this.field5968[var20];
                arg5.field5983[var20] = this.field5983[var20];
            }
        } else {
            arg5.field5968 = this.field5968;
            arg5.field5983 = this.field5983;
        }
        if (class12.method88(this.field5916, (byte) 9, arg2)) {
            arg5.field5952 = arg0.field5952;
            if (arg3) {
                arg5.field5940 = (byte) (arg5.field5940 | 0x8);
            }
            arg5.field5952.field6875 = this.field5952.field6875;
            arg5.field5952.field6868 = this.field5952.field6868;
        } else if (class205.method1314(arg2, this.field5916, 103)) {
            arg5.field5952 = this.field5952;
        } else {
            arg5.field5952 = null;
        }
        if (class356.method2127(this.field5916, arg2, false)) {
            if (arg0.field6004 == null || this.field5974 > arg0.field6004.length) {
                int var21 = this.field5974;
                arg5.field5948 = arg0.field5948 = new short[var21];
                arg5.field6011 = arg0.field6011 = new short[var21];
                arg5.field6004 = arg0.field6004 = new short[var21];
            } else {
                arg5.field5948 = arg0.field5948;
                arg5.field6004 = arg0.field6004;
                arg5.field6011 = arg0.field6011;
            }
            for (int var22 = 0; var22 < this.field5974; var22++) {
                arg5.field6004[var22] = this.field6004[var22];
                arg5.field5948[var22] = this.field5948[var22];
                arg5.field6011[var22] = this.field6011[var22];
            }
        } else {
            arg5.field6011 = this.field6011;
            arg5.field6004 = this.field6004;
            arg5.field5948 = this.field5948;
        }
        if (class20.method133(this.field5916, true, arg2)) {
            if (arg3) {
                arg5.field5940 = (byte) (arg5.field5940 | 0x10);
            }
            arg5.field5975 = arg0.field5975;
            arg5.field5975.field552 = this.field5975.field552;
        } else if (class159.method1132(true, arg2, this.field5916)) {
            arg5.field5975 = this.field5975;
        } else {
            arg5.field5975 = null;
        }
        if (class266.method1572(this.field5916, arg2, true)) {
            if (arg0.field5961 == null || this.field5974 > arg0.field5961.length) {
                int var23 = this.field5974;
                arg5.field5961 = arg0.field5961 = new short[var23];
            } else {
                arg5.field5961 = arg0.field5961;
            }
            for (int var24 = 0; var24 < this.field5974; var24++) {
                arg5.field5961[var24] = this.field5961[var24];
            }
        } else {
            arg5.field5961 = this.field5961;
        }
        if (!class330.method1947(arg2, this.field5916, 1408)) {
            arg5.field5943 = this.field5943;
        } else if (arg0.field5943 == null || arg0.field5943.length < this.field5950) {
            int var26 = this.field5950;
            arg5.field5943 = arg0.field5943 = new class500[var26];
            for (int var27 = 0; var27 < this.field5950; var27++) {
                arg5.field5943[var27] = this.field5943[var27].method2977((byte) 68);
            }
        } else {
            arg5.field5943 = arg0.field5943;
            for (int var25 = 0; var25 < this.field5950; var25++) {
                arg5.field5943[var25].method2979(this.field5943[var25], -101);
            }
        }
        arg5.field5995 = this.field5995;
        arg5.field6016 = this.field6016;
        arg5.field5969 = this.field5969;
        arg5.field5914 = this.field5914;
        arg5.field5938 = this.field5938;
        arg5.field5917 = this.field5917;
        arg5.field5962 = this.field5962;
        arg5.field6022 = this.field6022;
        if (this.field5913) {
            arg5.field5913 = true;
            arg5.field5936 = this.field5936;
            arg5.field5959 = this.field5959;
            arg5.field5993 = this.field5993;
            arg5.field5979 = this.field5979;
            arg5.field5980 = this.field5980;
            arg5.field5964 = this.field5964;
            arg5.field5957 = this.field5957;
        } else {
            arg5.field5913 = false;
        }
        if (arg4 == 0) {
            arg5.field5958 = this.field5958;
            arg5.field6009 = this.field6009;
            arg5.field5970 = this.field5970;
            return arg5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "W", descriptor = "(I)V")
    public final void method690(int arg0) {
        field5956++;
        int var2 = class51.field743[arg0];
        int var3 = class51.field731[arg0];
        for (int var4 = 0; var4 < this.field5977; var4++) {
            int var5 = this.field5933[var4] * var3 - (this.field5923[var4] * var2) >> 15;
            this.field5923[var4] = this.field5933[var4] * var2 + this.field5923[var4] * var3 >> 15;
            this.field5933[var4] = var5;
        }
        if (this.field5932 != null) {
            this.field5932.field6875 = null;
        }
        this.field5913 = false;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
    public final void method675(int arg0, int arg1, int arg2) {
        field5925++;
        for (int var4 = 0; var4 < this.field5977; var4++) {
            if (arg0 != 0) {
                this.field5997[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field5933[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field5923[var4] += arg2;
            }
        }
        if (this.field5932 != null) {
            this.field5932.field6875 = null;
        }
        this.field5913 = false;
    }

    @OriginalMember(owner = "client!oj", name = "EA", descriptor = "(Li;)Li;")
    public final class197 method662(class197 arg0) {
        field5999++;
        if (this.field5985 == 0) {
            return null;
        }
        if (!this.field5913) {
            this.method2449(24317);
        }
        int var2;
        int var3;
        if (this.field6010.field4840 > 0) {
            var2 = this.field5957 - (this.field6010.field4840 * this.field5980 >> 8) >> this.field6010.field4728;
            var3 = this.field5964 - (this.field6010.field4840 * this.field5959 >> 8) >> this.field6010.field4728;
        } else {
            var2 = this.field5957 - (this.field6010.field4840 * this.field5959 >> 8) >> this.field6010.field4728;
            var3 = this.field5964 - (this.field6010.field4840 * this.field5980 >> 8) >> this.field6010.field4728;
        }
        int var4;
        int var5;
        if (this.field6010.field4861 > 0) {
            var4 = this.field5993 - (this.field6010.field4861 * this.field5980 >> 8) >> this.field6010.field4728;
            var5 = this.field5979 - (this.field6010.field4861 * this.field5959 >> 8) >> this.field6010.field4728;
        } else {
            var4 = this.field5993 - (this.field6010.field4861 * this.field5959 >> 8) >> this.field6010.field4728;
            var5 = this.field5979 - (this.field6010.field4861 * this.field5980 >> 8) >> this.field6010.field4728;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class74 var8 = (class74) arg0;
        class74 var9;
        if (var8 != null && var8.method582(var7, (byte) 21, var6)) {
            var9 = var8;
            var8.method580((byte) -59);
        } else {
            var9 = new class74(this.field6010, var6, var7);
        }
        var9.method578(var4, var3, var2, 104, var5);
        this.method2444(-14762, var9);
        return var9;
    }

    @OriginalMember(owner = "client!oj", name = "ma", descriptor = "(I)V")
    public final void method704(int arg0) {
        field5919++;
        int var2 = class51.field743[arg0];
        int var3 = class51.field731[arg0];
        for (int var4 = 0; var4 < this.field5977; var4++) {
            int var5 = this.field5923[var4] * var2 + (this.field5997[var4] * var3) >> 15;
            this.field5923[var4] = this.field5923[var4] * var3 - (this.field5997[var4] * var2) >> 15;
            this.field5997[var4] = var5;
        }
        if (this.field5932 != null) {
            this.field5932.field6875 = null;
        }
        this.field5913 = false;
    }

    @OriginalMember(owner = "client!oj", name = "RA", descriptor = "()I")
    public final int method671() {
        field5926++;
        return this.field5990;
    }

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "()I")
    public final int method691() {
        field5929++;
        if (!this.field5913) {
            this.method2449(24317);
        }
        return this.field5980;
    }

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "(I)V")
    public final void method692(int arg0) {
        field5924++;
        int var2 = class51.field743[arg0];
        int var3 = class51.field731[arg0];
        for (int var4 = 0; var4 < this.field5977; var4++) {
            int var5 = this.field5997[var4] * var3 + this.field5933[var4] * var2 >> 15;
            this.field5933[var4] = this.field5933[var4] * var3 - this.field5997[var4] * var2 >> 15;
            this.field5997[var4] = var5;
        }
        if (this.field5932 != null) {
            this.field5932.field6875 = null;
        }
        this.field5913 = false;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lc;Lrr;I)V")
    public final void method701(class512 arg0, class305 arg1, int arg2) {
        field5972++;
        if (this.field5985 == 0) {
            return;
        }
        class511 var4 = this.field6010.field4851;
        if (!this.field5913) {
            this.method2449(24317);
        }
        class511 var5 = (class511) arg0;
        this.method2439(var5, (byte) 27);
        class128.field1973 = var4.field7473 * var5.field7498 + var4.field7498 * var5.field7487 + var4.field7471 * var5.field7469;
        class495.field7181 = var4.field7473 * var5.field7484 + var4.field7498 * var5.field7472 + var4.field7471 * var5.field7479 + var4.field7484;
        float var6 = (float) this.field5959 * class128.field1973 + class495.field7181;
        float var7 = (float) this.field5980 * class128.field1973 + class495.field7181;
        float var8;
        float var9;
        if (var7 < var6) {
            var8 = (float) (-this.field5936) + var7;
            var9 = (float) this.field5936 + var6;
        } else {
            var8 = var6 - (float) this.field5936;
            var9 = (float) this.field5936 + var7;
        }
        if ((this.field6010.field4844 <= var8) || ((float) this.field6010.field4790 >= var9)) {
            return;
        }
        class159.field2420 = var4.field7481 * var5.field7498 + var4.field7469 * var5.field7487 + var4.field7468 * var5.field7469;
        class431.field6241 = var4.field7481 * var5.field7484 + var4.field7469 * var5.field7472 + var4.field7468 * var5.field7479 + var4.field7479;
        float var10 = (float) this.field5959 * class159.field2420 + class431.field6241;
        float var11 = (float) this.field5980 * class159.field2420 + class431.field6241;
        float var12;
        float var13;
        if (var10 > var11) {
            var12 = ((float) (-this.field5936) + var11) * (float) this.field6010.field4822;
            var13 = ((float) this.field5936 + var10) * (float) this.field6010.field4822;
        } else {
            var12 = ((float) (-this.field5936) + var10) * (float) this.field6010.field4822;
            var13 = ((float) this.field5936 + var11) * (float) this.field6010.field4822;
        }
        if ((var12 / var9 >= this.field6010.field4780) || (var13 / var9 <= this.field6010.field4750)) {
            return;
        }
        class104.field1711 = var4.field7477 * var5.field7484 + var4.field7487 * var5.field7472 + var4.field7486 * var5.field7479 + var4.field7472;
        class499.field7310 = var4.field7477 * var5.field7498 + var4.field7487 * var5.field7487 + var4.field7486 * var5.field7469;
        float var14 = (float) this.field5959 * class499.field7310 + class104.field1711;
        float var15 = (float) this.field5980 * class499.field7310 + class104.field1711;
        float var16;
        float var17;
        if ((var15 < var14)) {
            var16 = (var15 - (float) this.field5936) * (float) this.field6010.field4774;
            var17 = ((float) this.field5936 + var14) * (float) this.field6010.field4774;
        } else {
            var16 = ((float) (-this.field5936) + var14) * (float) this.field6010.field4774;
            var17 = ((float) this.field5936 + var15) * (float) this.field6010.field4774;
        }
        if ((var16 / var9 >= this.field6010.field4847) || (this.field6010.field4830 >= var17 / var9)) {
            return;
        }
        if (arg1 != null || this.field6016 != null) {
            class417.field6051 = var4.field7481 * var5.field7471 + var4.field7469 * var5.field7486 + var4.field7468 * var5.field7468;
            class326.field4461 = var4.field7473 * var5.field7471 + var4.field7498 * var5.field7486 + var4.field7471 * var5.field7468;
            class65.field945 = var4.field7473 * var5.field7473 + var4.field7498 * var5.field7477 + var4.field7471 * var5.field7481;
            class160.field2425 = var4.field7477 * var5.field7471 + var4.field7487 * var5.field7486 + var4.field7486 * var5.field7468;
            class143.field2128 = var4.field7481 * var5.field7473 + var4.field7469 * var5.field7477 + var4.field7468 * var5.field7481;
            class519.field7629 = var4.field7477 * var5.field7473 + var4.field7487 * var5.field7477 + var4.field7486 * var5.field7481;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field5964 + this.field5957 >> 1;
            int var21 = this.field5993 + this.field5979 >> 1;
            int var22 = (int) ((float) var21 * class143.field2128 + (float) this.field5959 * class159.field2420 + (float) var20 * class417.field6051 + class431.field6241);
            int var23 = (int) ((float) var21 * class519.field7629 + (float) this.field5959 * class499.field7310 + (float) var20 * class160.field2425 + class104.field1711);
            int var24 = (int) ((float) var21 * class65.field945 + (float) this.field5959 * class128.field1973 + (float) var20 * class326.field4461 + class495.field7181);
            if (var24 >= this.field6010.field4790) {
                arg1.field4131 = this.field6010.field4822 * var22 / var24 + this.field6010.field4758;
                arg1.field4136 = this.field6010.field4774 * var23 / var24 + this.field6010.field4770;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class143.field2128 + (float) this.field5980 * class159.field2420 + (float) var20 * class417.field6051 + class431.field6241);
            int var26 = (int) ((float) var21 * class519.field7629 + (float) this.field5980 * class499.field7310 + (float) var20 * class160.field2425 + class104.field1711);
            int var27 = (int) ((float) var21 * class65.field945 + (float) this.field5980 * class128.field1973 + (float) var20 * class326.field4461 + class495.field7181);
            if (this.field6010.field4790 > var27) {
                var18 = true;
            } else {
                arg1.field4133 = this.field6010.field4822 * var25 / var27 + this.field6010.field4758;
                arg1.field4134 = this.field6010.field4774 * var26 / var27 + this.field6010.field4770;
            }
            if (var18) {
                if (var24 < this.field6010.field4790 && var27 < this.field6010.field4790) {
                    var19 = false;
                } else if (this.field6010.field4790 > var24) {
                    int var31 = (var27 - this.field6010.field4790 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field4131 = this.field6010.field4822 * var32 / this.field6010.field4790 + this.field6010.field4758;
                    arg1.field4136 = this.field6010.field4774 * var33 / this.field6010.field4790 + this.field6010.field4770;
                } else if (this.field6010.field4790 > var27) {
                    int var28 = (var24 - this.field6010.field4790 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    arg1.field4131 = this.field6010.field4822 * var29 / this.field6010.field4790 + this.field6010.field4758;
                    int var30 = var23 + ((var23 - var26) * var28 >> 16);
                    arg1.field4136 = this.field6010.field4770 + (this.field6010.field4774 * var30 / this.field6010.field4790);
                }
            }
            if (var19) {
                if (var27 < var24) {
                    arg1.field4132 = this.field6010.field4758 + ((this.field5936 + var22) * this.field6010.field4822 / var24) - arg1.field4131;
                } else {
                    arg1.field4132 = (this.field5936 + var25) * this.field6010.field4822 / var27 + this.field6010.field4758 - arg1.field4133;
                }
                arg1.field4135 = true;
            }
        }
        this.field6010.method2030((byte) 110);
        this.field6010.method2037(-8497, var5);
        this.method2445((byte) -33);
        this.field6010.method1971(-95);
        this.method2451(-1191701960);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BIZ)Le;")
    public final class285 method697(byte arg0, int arg1, boolean arg2) {
        field5976++;
        class415 var4;
        class415 var5;
        if (arg0 == 1) {
            var5 = this.field6010.field4829;
            var4 = this.field6010.field4808;
        } else if (arg0 == 2) {
            var4 = this.field6010.field4836;
            var5 = this.field6010.field4864;
        } else if (arg0 == 3) {
            var5 = this.field6010.field4782;
            var4 = this.field6010.field4832;
        } else if (arg0 == 4) {
            var4 = this.field6010.field4828;
            var5 = this.field6010.field4849;
        } else if (arg0 == 5) {
            var4 = this.field6010.field4752;
            var5 = this.field6010.field4784;
        } else {
            var5 = var4 = new class415(this.field6010);
        }
        return this.method2446(var4, arg2, arg1, arg0 != 0, 0, var5);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZB)V")
    private final void method2447(boolean arg0, byte arg1) {
        field5947++;
        if (arg1 != -123) {
            this.method707(2, 28, -25, -70);
        }
        if (this.field6010.field4789.field4336.length >= this.field5951 * 6) {
            this.field6010.field4789.field4360 = 0;
        } else {
            this.field6010.field4789 = new class504((this.field5951 + 100) * 6);
        }
        class504 var3 = this.field6010.field4789;
        if (this.field6010.field4796) {
            for (int var4 = 0; var4 < this.field5951; var4++) {
                var3.method1857(arg1 + 561746571, this.field6004[var4]);
                var3.method1857(561746448, this.field5948[var4]);
                var3.method1857(arg1 + 561746571, this.field6011[var4]);
            }
        } else {
            for (int var5 = 0; var5 < this.field5951; var5++) {
                var3.method1829(0, this.field6004[var5]);
                var3.method1829(arg1 ^ 0xFFFFFF85, this.field5948[var5]);
                var3.method1829(0, this.field6011[var5]);
            }
        }
        if (var3.field4360 == 0) {
            return;
        }
        if (arg0) {
            if (this.field5965 == null) {
                this.field5965 = this.field6010.method2006(var3.field4336, 5123, true, var3.field4360, (byte) 124);
            } else {
                this.field5965.method2052(5123, var3.field4360, arg1 ^ 0xFFFFBEDB, var3.field4336);
            }
            this.field5975.field552 = this.field5965;
        } else {
            this.field5975.field552 = this.field6010.method2006(var3.field4336, 5123, false, var3.field4360, (byte) 127);
        }
        if (!arg0) {
            this.field5930 = true;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "()V")
    public final void method687() {
        field5937++;
        if (this.field5985 <= 0 || this.field5951 <= 0) {
            return;
        }
        this.method2453(false, 255);
        if ((this.field5940 & 0x10) == 0 && this.field5975.field552 == null) {
            this.method2447(false, (byte) -123);
        }
        this.method2450(0);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Le;IIIZ)V")
    public final void method698(class285 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field6000++;
        class415 var6 = (class415) arg0;
        if (this.field5974 == 0 || var6.field5974 == 0) {
            return;
        }
        int var7 = var6.field5977;
        int[] var8 = var6.field5997;
        int[] var9 = var6.field5933;
        int[] var10 = var6.field5923;
        short[] var11 = var6.field5960;
        short[] var12 = var6.field5992;
        short[] var13 = var6.field5986;
        byte[] var14 = var6.field5946;
        short[] var15;
        short[] var16;
        byte[] var17;
        short[] var18;
        if (this.field6013 == null) {
            var17 = null;
            var18 = null;
            var16 = null;
            var15 = null;
        } else {
            var15 = this.field6013.field1017;
            var16 = this.field6013.field1016;
            var17 = this.field6013.field1013;
            var18 = this.field6013.field1014;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        byte[] var22;
        if (var6.field6013 == null) {
            var22 = null;
            var20 = null;
            var19 = null;
            var21 = null;
        } else {
            var19 = var6.field6013.field1014;
            var20 = var6.field6013.field1017;
            var21 = var6.field6013.field1016;
            var22 = var6.field6013.field1013;
        }
        int[] var23 = var6.field5958;
        short[] var24 = var6.field5995;
        if (!var6.field5913) {
            var6.method2449(24317);
        }
        short var25 = var6.field5959;
        short var26 = var6.field5980;
        short var27 = var6.field5957;
        short var28 = var6.field5964;
        short var29 = var6.field5993;
        short var30 = var6.field5979;
        for (int var31 = 0; var31 < this.field5977; var31++) {
            int var32 = this.field5933[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field5997[var31] - arg1;
                if (var27 <= var33 && var33 <= var28) {
                    int var34 = this.field5923[var31] - arg3;
                    if (var34 >= var29 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field5958[var31];
                        int var37 = this.field5958[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field5995[var38] - 1;
                            if (var35 == -1 || this.field5946[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39];
                                    int var41 = -1;
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var40; var43 < var42; var43++) {
                                        var41 = var24[var43] - 1;
                                        if (var41 == -1 || var14[var41] != 0) {
                                            break;
                                        }
                                    }
                                    if (var41 != -1) {
                                        if (var18 == null) {
                                            this.field6013 = new class70();
                                            var18 = this.field6013.field1014 = class6.method38(0, this.field5960);
                                            var15 = this.field6013.field1017 = class6.method38(0, this.field5992);
                                            var16 = this.field6013.field1016 = class6.method38(0, this.field5986);
                                            var17 = this.field6013.field1013 = class4.method27(-63, this.field5946);
                                        }
                                        if (var19 == null) {
                                            class70 var44 = var6.field6013 = new class70();
                                            var19 = var44.field1014 = class6.method38(0, var11);
                                            var20 = var44.field1017 = class6.method38(0, var12);
                                            var21 = var44.field1016 = class6.method38(0, var13);
                                            var22 = var44.field1013 = class4.method27(-57, var14);
                                        }
                                        short var45 = this.field5960[var35];
                                        short var46 = this.field5992[var35];
                                        short var47 = this.field5986[var35];
                                        int var48 = var23[var39];
                                        int var49 = var23[var39 + 1];
                                        byte var50 = this.field5946[var35];
                                        for (int var51 = var48; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var19[var52] += var45;
                                                var20[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var50;
                                            }
                                        }
                                        byte var53 = var14[var41];
                                        short var54 = var12[var41];
                                        int var55 = this.field5958[var31];
                                        int var56 = this.field5958[var31 + 1];
                                        short var57 = var13[var41];
                                        short var58 = var11[var41];
                                        for (int var59 = var55; var59 < var56; var59++) {
                                            int var60 = this.field5995[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var17[var60] != 0) {
                                                var18[var60] += var58;
                                                var15[var60] += var54;
                                                var16[var60] += var57;
                                                var17[var60] += var53;
                                            }
                                        }
                                        if (this.field5922 == null && this.field5912 != null) {
                                            this.field5912.field6875 = null;
                                        }
                                        if (this.field5922 != null) {
                                            this.field5922.field6875 = null;
                                        }
                                        if (var6.field5922 == null && var6.field5912 != null) {
                                            var6.field5912.field6875 = null;
                                        }
                                        if (var6.field5922 != null) {
                                            var6.field5922.field6875 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "za", descriptor = "(IIII)V")
    public final void method720(int arg0, int arg1, int arg2, int arg3) {
        field5931++;
        if (arg0 == 0) {
            class245.field3355 = 0;
            class451.field6615 = 0;
            class49.field698 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field5977; var6++) {
                class245.field3355 += this.field5997[var6];
                class49.field698 += this.field5933[var6];
                var5++;
                class451.field6615 += this.field5923[var6];
            }
            if (var5 <= 0) {
                class245.field3355 = arg1;
                class451.field6615 = arg3;
                class49.field698 = arg2;
            } else {
                class451.field6615 = class451.field6615 / var5 + arg3;
                class49.field698 = class49.field698 / var5 + arg2;
                class245.field3355 = class245.field3355 / var5 + arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field5977; var7++) {
                this.field5997[var7] += arg1;
                this.field5933[var7] += arg2;
                this.field5923[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field5977; var8++) {
                this.field5997[var8] -= class245.field3355;
                this.field5933[var8] -= class49.field698;
                this.field5923[var8] -= class451.field6615;
                if (arg3 != 0) {
                    int var9 = class51.field743[arg3];
                    int var10 = class51.field731[arg3];
                    int var11 = this.field5997[var8] * var10 + this.field5933[var8] * var9 + 32767 >> 15;
                    this.field5933[var8] = this.field5933[var8] * var10 + 32767 - this.field5997[var8] * var9 >> 15;
                    this.field5997[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class51.field743[arg1];
                    int var13 = class51.field731[arg1];
                    int var14 = this.field5933[var8] * var13 + 32767 - (this.field5923[var8] * var12) >> 15;
                    this.field5923[var8] = this.field5933[var8] * var12 + this.field5923[var8] * var13 + 32767 >> 15;
                    this.field5933[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class51.field743[arg2];
                    int var16 = class51.field731[arg2];
                    int var17 = this.field5997[var8] * var16 + this.field5923[var8] * var15 + 32767 >> 15;
                    this.field5923[var8] = this.field5923[var8] * var16 + 32767 - this.field5997[var8] * var15 >> 15;
                    this.field5997[var8] = var17;
                }
                this.field5997[var8] += class245.field3355;
                this.field5933[var8] += class49.field698;
                this.field5923[var8] += class451.field6615;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field5977; var18++) {
                this.field5997[var18] -= class245.field3355;
                this.field5933[var18] -= class49.field698;
                this.field5923[var18] -= class451.field6615;
                this.field5997[var18] = this.field5997[var18] * arg1 / 128;
                this.field5933[var18] = this.field5933[var18] * arg2 / 128;
                this.field5923[var18] = this.field5923[var18] * arg3 / 128;
                this.field5997[var18] += class245.field3355;
                this.field5933[var18] += class49.field698;
                this.field5923[var18] += class451.field6615;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field5974; var19++) {
                int var23 = (this.field5981[var19] & 0xFF) + (arg1 * 8);
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field5981[var19] = (byte) var23;
            }
            if (this.field5912 != null) {
                this.field5912.field6875 = null;
            }
            if (this.field6016 != null) {
                for (int var20 = 0; var20 < this.field5950; var20++) {
                    class277 var21 = this.field6016[var20];
                    class500 var22 = this.field5943[var20];
                    var22.field7326 = var22.field7326 & 0xFFFFFF | 255 - (this.field5981[var21.field3768] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field5974; var24++) {
                int var28 = this.field5984[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = (var28 & 0x3F5) >> 7;
                int var31 = arg2 / 4 + var30;
                int var32 = var28 & 0x7F;
                int var33 = var29 + arg1 & 0x3F;
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 7) {
                    var31 = 7;
                }
                int var34 = arg3 + var32;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field5984[var24] = (short) class219.method1367(var34, class219.method1367(var31 << 7, var33 << 10));
            }
            if (this.field5912 != null) {
                this.field5912.field6875 = null;
            }
            if (this.field6016 != null) {
                for (int var25 = 0; var25 < this.field5950; var25++) {
                    class277 var26 = this.field6016[var25];
                    class500 var27 = this.field5943[var25];
                    var27.field7326 = class203.field2946[this.field5984[var26.field3768] & 0xFFFF] & 0xFFFFFF | var27.field7326 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field5950; var35++) {
                class500 var36 = this.field5943[var35];
                var36.field7323 += arg2;
                var36.field7317 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field5950; var37++) {
                class500 var38 = this.field5943[var37];
                var38.field7325 = var38.field7325 * arg1 >> 7;
                var38.field7320 = var38.field7320 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field5950; var39++) {
                class500 var40 = this.field5943[var39];
                var40.field7319 = var40.field7319 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
    public static final void method2448(int arg0) {
        field5942++;
        if (arg0 != -658990073) {
            method2452((byte) -14);
        }
        class106.method821((byte) 54);
    }

    @OriginalMember(owner = "client!oj", name = "va", descriptor = "(I[IIIIIZ)V")
    public final void method680(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field6017++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            class451.field6615 = 0;
            class245.field3355 = 0;
            int var12 = 0;
            class49.field698 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field5914.length) {
                    int[] var15 = this.field5914[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class245.field3355 += this.field5997[var17];
                        class49.field698 += this.field5933[var17];
                        class451.field6615 += this.field5923[var17];
                        var12++;
                    }
                }
            }
            if (var12 <= 0) {
                class451.field6615 = var11;
                class49.field698 = var9;
                class245.field3355 = var10;
            } else {
                class451.field6615 = class451.field6615 / var12 + var11;
                class49.field698 = class49.field698 / var12 + var9;
                class245.field3355 = class245.field3355 / var12 + var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg3 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field5914.length) {
                    int[] var23 = this.field5914[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field5997[var25] += var18;
                        this.field5933[var25] += var19;
                        this.field5923[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field5914.length > var45) {
                    int[] var46 = this.field5914[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field5997[var59] -= class245.field3355;
                            this.field5933[var59] -= class49.field698;
                            this.field5923[var59] -= class451.field6615;
                            if (arg4 != 0) {
                                int var60 = class51.field743[arg4];
                                int var61 = class51.field731[arg4];
                                int var62 = this.field5997[var59] * var61 + this.field5933[var59] * var60 + 32767 >> 15;
                                this.field5933[var59] = this.field5933[var59] * var61 + 32767 - (this.field5997[var59] * var60) >> 15;
                                this.field5997[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class51.field743[arg2];
                                int var64 = class51.field731[arg2];
                                int var65 = this.field5933[var59] * var64 - (this.field5923[var59] * var63 - 32767) >> 15;
                                this.field5923[var59] = this.field5933[var59] * var63 + this.field5923[var59] * var64 + 32767 >> 15;
                                this.field5933[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class51.field743[arg3];
                                int var67 = class51.field731[arg3];
                                int var68 = this.field5923[var59] * var66 + (this.field5997[var59] * var67) + 32767 >> 15;
                                this.field5923[var59] = this.field5923[var59] * var67 + 32767 - (this.field5997[var59] * var66) >> 15;
                                this.field5997[var59] = var68;
                            }
                            this.field5997[var59] += class245.field3355;
                            this.field5933[var59] += class49.field698;
                            this.field5923[var59] += class451.field6615;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field5997[var48] -= class245.field3355;
                            this.field5933[var48] -= class49.field698;
                            this.field5923[var48] -= class451.field6615;
                            if (arg2 != 0) {
                                int var49 = class51.field743[arg2];
                                int var50 = class51.field731[arg2];
                                int var51 = this.field5933[var48] * var50 + 32767 - (this.field5923[var48] * var49) >> 15;
                                this.field5923[var48] = this.field5923[var48] * var50 + this.field5933[var48] * var49 + 32767 >> 15;
                                this.field5933[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class51.field743[arg4];
                                int var53 = class51.field731[arg4];
                                int var54 = this.field5933[var48] * var52 + (this.field5997[var48] * var53) + 32767 >> 15;
                                this.field5933[var48] = this.field5933[var48] * var53 + 32767 - this.field5997[var48] * var52 >> 15;
                                this.field5997[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class51.field743[arg3];
                                int var56 = class51.field731[arg3];
                                int var57 = this.field5997[var48] * var56 + this.field5923[var48] * var55 + 32767 >> 15;
                                this.field5923[var48] = this.field5923[var48] * var56 + 32767 - (this.field5997[var48] * var55) >> 15;
                                this.field5997[var48] = var57;
                            }
                            this.field5997[var48] += class245.field3355;
                            this.field5933[var48] += class49.field698;
                            this.field5923[var48] += class451.field6615;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field5914.length) {
                        int[] var29 = this.field5914[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field5958[var31];
                            int var33 = this.field5958[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field5995[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class51.field743[arg4];
                                    int var37 = class51.field731[arg4];
                                    int var38 = this.field5992[var35] * var36 + this.field5960[var35] * var37 + 32767 >> 15;
                                    this.field5992[var35] = (short) (this.field5992[var35] * var37 + 32767 - (this.field5960[var35] * var36) >> 15);
                                    this.field5960[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class51.field743[arg2];
                                    int var40 = class51.field731[arg2];
                                    int var41 = this.field5992[var35] * var40 + 32767 - (this.field5986[var35] * var39) >> 15;
                                    this.field5986[var35] = (short) (this.field5992[var35] * var39 + this.field5986[var35] * var40 + 32767 >> 15);
                                    this.field5992[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class51.field743[arg3];
                                    int var43 = class51.field731[arg3];
                                    int var44 = this.field5960[var35] * var43 + this.field5986[var35] * var42 + 32767 >> 15;
                                    this.field5986[var35] = (short) (this.field5986[var35] * var43 + 32767 - (this.field5960[var35] * var42) >> 15);
                                    this.field5960[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field5922 == null && this.field5912 != null) {
                    this.field5912.field6875 = null;
                }
                if (this.field5922 != null) {
                    this.field5922.field6875 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field5914.length) {
                    int[] var71 = this.field5914[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field5997[var73] -= class245.field3355;
                        this.field5933[var73] -= class49.field698;
                        this.field5923[var73] -= class451.field6615;
                        this.field5997[var73] = this.field5997[var73] * arg2 >> 7;
                        this.field5933[var73] = this.field5933[var73] * arg3 >> 7;
                        this.field5923[var73] = this.field5923[var73] * arg4 >> 7;
                        this.field5997[var73] += class245.field3355;
                        this.field5933[var73] += class49.field698;
                        this.field5923[var73] += class451.field6615;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field6009 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field6009.length > var78) {
                        int[] var79 = this.field6009[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field5981[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field5981[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field5912 != null) {
                            this.field5912.field6875 = null;
                        }
                    }
                }
                if (this.field6016 != null) {
                    for (int var75 = 0; var75 < this.field5950; var75++) {
                        class277 var76 = this.field6016[var75];
                        class500 var77 = this.field5943[var75];
                        var77.field7326 = 255 - (this.field5981[var76.field3768] & 0xFF) << 24 | var77.field7326 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field6009 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (var87 < this.field6009.length) {
                        int[] var88 = this.field6009[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field5984[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = arg2 + var92 & 0x3F;
                            int var95 = arg3 / 4 + var93;
                            int var96 = var91 & 0x7F;
                            int var97 = arg4 + var96;
                            if (var95 < 0) {
                                var95 = 0;
                            } else if (var95 > 7) {
                                var95 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field5984[var90] = (short) class219.method1367(class219.method1367(var95 << 7, var94 << 10), var97);
                        }
                        if (var88.length > 0 && this.field5912 != null) {
                            this.field5912.field6875 = null;
                        }
                    }
                }
                if (this.field6016 != null) {
                    for (int var84 = 0; var84 < this.field5950; var84++) {
                        class277 var85 = this.field6016[var84];
                        class500 var86 = this.field5943[var84];
                        var86.field7326 = var86.field7326 & 0xFF000000 | class203.field2946[this.field5984[var85.field3768] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field5917 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field5917.length > var99) {
                        int[] var100 = this.field5917[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class500 var102 = this.field5943[var100[var101]];
                            var102.field7317 += arg2;
                            var102.field7323 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field5917 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field5917.length > var104) {
                        int[] var105 = this.field5917[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class500 var107 = this.field5943[var105[var106]];
                            var107.field7325 = var107.field7325 * arg2 >> 7;
                            var107.field7320 = var107.field7320 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field5917 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field5917.length) {
                    int[] var110 = this.field5917[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class500 var112 = this.field5943[var110[var111]];
                        var112.field7319 = var112.field7319 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "X", descriptor = "(I)V")
    public final void method660(int arg0) {
        if (this.field5912 != null) {
            this.field5912.field6875 = null;
        }
        this.field6019 = (short) arg0;
        field5927++;
    }

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "(SS)V")
    public final void method667(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field5974; var3++) {
            if (this.field5984[var3] == arg0) {
                this.field5984[var3] = arg1;
            }
        }
        field5998++;
        if (this.field6016 != null) {
            for (int var4 = 0; var4 < this.field5950; var4++) {
                class277 var5 = this.field6016[var4];
                class500 var6 = this.field5943[var4];
                var6.field7326 = var6.field7326 & 0xFF000000 | class203.field2946[this.field5984[var5.field3768] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field5912 != null) {
            this.field5912.field6875 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
    private final void method2449(int arg0) {
        field6012++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field5977; var10++) {
            int var11 = this.field5997[var10];
            int var12 = this.field5933[var10];
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var3 > var12) {
                var3 = var12;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            int var13 = this.field5923[var10];
            if (var13 < var4) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + (var13 * var13);
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var12 * var12 + (var11 * var11 + (var13 * var13));
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field5993 = (short) var4;
        this.field5980 = (short) var6;
        this.field5964 = (short) var5;
        this.field5959 = (short) var3;
        this.field5979 = (short) var7;
        this.field5957 = (short) var2;
        this.field5936 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        if (arg0 != 24317) {
            this.field6013 = null;
        }
        this.field5913 = true;
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(I)V")
    private final void method2450(int arg0) {
        field5941++;
        if (!this.field5930) {
            return;
        }
        this.field5930 = false;
        if (this.field5938 == null && this.field5969 == null && this.field6016 == null) {
            if (this.field5997 != null && !class326.method1932(this.field5990, false, this.field5916)) {
                if (this.field5932 != null && this.field5932.field6875 == null) {
                    this.field5930 = true;
                } else {
                    if (!this.field5913) {
                        this.method2449(24317);
                    }
                    this.field5997 = null;
                }
            }
            if (this.field5933 != null && !class231.method1412(this.field5916, 0, this.field5990)) {
                if (this.field5932 != null && this.field5932.field6875 == null) {
                    this.field5930 = true;
                } else {
                    if (!this.field5913) {
                        this.method2449(arg0 ^ 0x5EFD);
                    }
                    this.field5933 = null;
                }
            }
            if (this.field5923 != null && !class142.method994(this.field5916, this.field5990, arg0 + 13800)) {
                if (this.field5932 != null && this.field5932.field6875 == null) {
                    this.field5930 = true;
                } else {
                    if (!this.field5913) {
                        this.method2449(24317);
                    }
                    this.field5923 = null;
                }
            }
        }
        if (this.field5995 != null && this.field5997 == null && this.field5933 == null && this.field5923 == null) {
            this.field5958 = null;
            this.field5995 = null;
        }
        if (this.field5946 != null && !class314.method1810(this.field5990, (byte) -78, this.field5916)) {
            if (this.field5922 == null) {
                if (this.field5912 != null && this.field5912.field6875 == null) {
                    this.field5930 = true;
                } else {
                    this.field5960 = this.field5992 = this.field5986 = null;
                    this.field5946 = null;
                }
            } else if (this.field5922.field6875 == null) {
                this.field5930 = true;
            } else {
                this.field5960 = this.field5992 = this.field5986 = null;
                this.field5946 = null;
            }
        }
        if (this.field5984 != null && !class377.method2253(this.field5990, this.field5916, (byte) 42)) {
            if (this.field5912 != null && this.field5912.field6875 == null) {
                this.field5930 = true;
            } else {
                this.field5984 = null;
            }
        }
        if (this.field5981 != null && !class412.method2425(this.field5916, -107, this.field5990)) {
            if (this.field5912 != null && this.field5912.field6875 == null) {
                this.field5930 = true;
            } else {
                this.field5981 = null;
            }
        }
        if (arg0 != 0) {
            this.method685(-57, 81, null, null, -9, 71, 7);
        }
        if (this.field5968 != null && !class379.method2260(this.field5916, this.field5990, (byte) -41)) {
            if (this.field5952 != null && this.field5952.field6875 == null) {
                this.field5930 = true;
            } else {
                this.field5968 = this.field5983 = null;
            }
        }
        if (this.field5961 != null && !class366.method2193(false, this.field5990, this.field5916)) {
            if (this.field5912 != null && this.field5912.field6875 == null) {
                this.field5930 = true;
            } else {
                this.field5961 = null;
            }
        }
        if (this.field6004 != null && !class439.method2594(this.field5916, this.field5990, 34)) {
            if ((this.field5975 == null || this.field5975.field552 != null) && (this.field5912 == null || this.field5912.field6875 != null)) {
                this.field6004 = this.field5948 = this.field6011 = null;
            } else {
                this.field5930 = true;
            }
        }
        if (this.field6009 != null && !class16.method107(this.field5990, (byte) 95, this.field5916)) {
            this.field6022 = null;
            this.field6009 = null;
        }
        if (this.field5914 != null && !class213.method1347(this.field5990, (byte) 126, this.field5916)) {
            this.field5914 = null;
            this.field5962 = null;
        }
        if (this.field5917 != null && !class512.method3037(117, this.field5990, this.field5916)) {
            this.field5917 = null;
        }
        if (this.field5970 != null && (this.field5990 & 0x800) == 0 && (this.field5990 & 0x40000) == 0) {
            this.field5970 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII)V")
    public final void method707(int arg0, int arg1, int arg2, int arg3) {
        field6001++;
        for (int var5 = 0; var5 < this.field5974; var5++) {
            int var9 = this.field5984[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = (var9 & 0x3F5) >> 7;
            if (arg0 != -1) {
                var10 -= -((arg0 - var10) * arg3 >> 7);
            }
            if (arg1 != -1) {
                var11 -= -((arg1 - var11) * arg3 >> 7);
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 -= -((arg2 - var12) * arg3 >> 7);
            }
            this.field5984[var5] = (short) class219.method1367(class219.method1367(var10 << 10, var11 << 7), var12);
        }
        if (this.field6016 != null) {
            for (int var6 = 0; var6 < this.field5950; var6++) {
                class277 var7 = this.field6016[var6];
                class500 var8 = this.field5943[var6];
                var8.field7326 = class203.field2946[this.field5984[var7.field3768] & 0xFFFF] & 0xFFFFFF | var8.field7326 & 0xFF000000;
            }
        }
        if (this.field5912 != null) {
            this.field5912.field6875 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "()Z")
    public final boolean method696() {
        field6005++;
        if (this.field5961 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field5961.length; var1++) {
            if (this.field5961[var1] != -1 && !this.field6010.field3988.method918(this.field5961[var1], 118)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "()I")
    public final int method716() {
        if (!this.field5913) {
            this.method2449(24317);
        }
        field6002++;
        return this.field5936;
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)V")
    private final void method2451(int arg0) {
        field6003++;
        if (this.field6016 != null) {
            class511 var2 = this.field6010.field4723;
            float var3 = this.field6010.method472();
            float var4 = this.field6010.method461();
            this.field6010.method2041(1);
            this.field6010.method528(false);
            this.field6010.method2036(30919, false);
            this.field6010.method1973(this.field6010.field4800, null, null, this.field6010.field4862, arg0 + 1191734848);
            for (int var5 = 0; var5 < this.field5950; var5++) {
                class277 var6 = this.field6016[var5];
                class500 var7 = this.field5943[var5];
                if (!var6.field3766 || !this.field6010.method549()) {
                    float var8 = (float) (this.field5997[var6.field3767] - (-this.field5997[var6.field3769] - this.field5997[var6.field3760])) * 0.3333333F;
                    float var9 = (float) (this.field5933[var6.field3767] + this.field5933[var6.field3760] + this.field5933[var6.field3769]) * 0.3333333F;
                    float var10 = (float) (this.field5923[var6.field3767] + this.field5923[var6.field3760] + this.field5923[var6.field3769]) * 0.3333333F;
                    float var11 = class143.field2128 * var10 + class417.field6051 * var8 + class159.field2420 * var9 + class431.field6241;
                    float var12 = class519.field7629 * var10 + class499.field7310 * var9 + class160.field2425 * var8 + class104.field1711;
                    float var13 = class65.field945 * var10 + class326.field4461 * var8 + class128.field1973 * var9 + class495.field7181;
                    var2.method3028(arg0 ^ 0x4707F983, (float) var7.field7317 + var11, var6.field3771 * var7.field7325 >> 7, -var13, (float) var7.field7323 - var12, var6.field3762 * var7.field7320 >> 7, var7.field7319);
                    this.field6010.method2003(var2, 0);
                    this.field6010.method462(var4, var3 - ((float) var6.field3763 * 1.5F));
                    int var14 = var7.field7326;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field6010.method1998(var6.field3765, (byte) -53);
                    this.field6010.method2033(var6.field3761, -1743);
                    this.field6010.method1966(-1, var6.field3764);
                    this.field6010.method1962(4, 108, 7, 0);
                }
            }
            this.field6010.method462(var4, var3);
            this.field6010.method528(true);
            this.field6010.method1971(-77);
        }
        if (arg0 != -1191701960) {
            this.method664();
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(B)Lti;")
    public static final class237 method2452(byte arg0) {
        field5955++;
        if (class472.field6811 == null || class105.field1727 == null) {
            return null;
        }
        for (class237 var1 = (class237) class105.field1727.method378(120); var1 != null; var1 = (class237) class105.field1727.method378(125)) {
            class92 var2 = class472.field6803.method1655(var1.field3280, (byte) -116);
            if (var2 != null && var2.field1500 && var2.method749(54, class472.field6801)) {
                return var1;
            }
        }
        if (arg0 >= -25) {
            field6026 = true;
        }
        return null;
    }

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "(I)V")
    public final void method711(int arg0) {
        field5966++;
        this.field5990 = arg0;
        if (this.field6013 != null && (this.field5990 & 0x10000) == 0) {
            this.field5960 = this.field6013.field1014;
            this.field5986 = this.field6013.field1016;
            this.field5946 = this.field6013.field1013;
            this.field5992 = this.field6013.field1017;
            this.field6013 = null;
        }
        this.field5930 = true;
        this.method2450(0);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZI)V")
    private final void method2453(boolean arg0, int arg1) {
        field5978++;
        boolean var3 = this.field5912 != null && this.field5912.field6875 == null;
        boolean var4 = this.field5922 != null && this.field5922.field6875 == null;
        boolean var5 = this.field5932 != null && this.field5932.field6875 == null;
        boolean var6 = this.field5952 != null && this.field5952.field6875 == null;
        if (arg0) {
            var5 &= (this.field5940 & 0x1) != 0;
            var3 &= (this.field5940 & 0x2) != 0;
            var6 &= (this.field5940 & 0x8) != 0;
            var4 &= (this.field5940 & 0x4) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        byte var11 = 0;
        if (var3) {
            var9 = var7;
            var7 = (byte) (var7 + 4);
        }
        if (var4) {
            var10 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var6) {
            var11 = var7;
            var7 = (byte) (var7 + 8);
        }
        if (var7 == 0) {
            return;
        }
        if (this.field6010.field4789.field4336.length < this.field5985 * var7) {
            this.field6010.field4789 = new class504((this.field5985 + 100) * var7);
        } else {
            this.field6010.field4789.field4360 = 0;
        }
        if (arg1 != 255) {
            this.method2443(-112, 0.13155651F, -29, 52, -0.7611936F, -68L, (byte) -7, 118, null, -4);
        }
        class504 var12 = this.field6010.field4789;
        if (var5) {
            if (this.field6010.field4796) {
                for (int var13 = 0; var13 < this.field5977; var13++) {
                    int var14 = NativeStream.floatToRawIntBits((float) this.field5997[var13]);
                    int var15 = NativeStream.floatToRawIntBits((float) this.field5933[var13]);
                    int var16 = NativeStream.floatToRawIntBits((float) this.field5923[var13]);
                    int var17 = this.field5958[var13];
                    int var18 = this.field5958[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field5995[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field4360 = var7 * var20;
                        var12.method1858(var14, (byte) -29);
                        var12.method1858(var15, (byte) -76);
                        var12.method1858(var16, (byte) -94);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field5977; var21++) {
                    int var22 = NativeStream.floatToRawIntBits((float) this.field5997[var21]);
                    int var23 = NativeStream.floatToRawIntBits((float) this.field5933[var21]);
                    int var24 = NativeStream.floatToRawIntBits((float) this.field5923[var21]);
                    int var25 = this.field5958[var21];
                    int var26 = this.field5958[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field5995[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field4360 = var7 * var28;
                        var12.method1854((byte) 116, var22);
                        var12.method1854((byte) 116, var23);
                        var12.method1854((byte) 116, var24);
                    }
                }
            }
        }
        if (var3) {
            if (this.field5922 == null) {
                byte[] var29;
                short[] var30;
                short[] var31;
                short[] var32;
                if (this.field6013 == null) {
                    var31 = this.field5992;
                    var30 = this.field5960;
                    var32 = this.field5986;
                    var29 = this.field5946;
                } else {
                    var29 = this.field6013.field1013;
                    var30 = this.field6013.field1014;
                    var31 = this.field6013.field1017;
                    var32 = this.field6013.field1016;
                }
                float var33 = this.field6010.field4768[0];
                float var34 = this.field6010.field4768[1];
                float var35 = this.field6010.field4768[2];
                float var36 = this.field6010.field4778;
                float var37 = this.field6010.field4764 * 768.0F / (float) this.field5954;
                float var38 = this.field6010.field4763 * 768.0F / (float) this.field5954;
                for (int var39 = 0; var39 < this.field5974; var39++) {
                    int var40 = this.method2441(this.field5984[var39], this.field6019, this.field5961[var39], this.field5981[var39], -55);
                    float var41 = (float) (var40 >> 8 & 0xFF) * this.field6010.field4859;
                    float var42 = (float) ((var40 & 0xFF9928) >> 16) * this.field6010.field4845;
                    short var43 = this.field6004[var39];
                    float var44 = (float) (var40 >>> 24) * this.field6010.field4787;
                    short var45 = (short) var29[var43];
                    float var46;
                    if (var45 == 0) {
                        var46 = ((float) var32[var43] * var35 + (float) var30[var43] * var33 + (float) var31[var43] * var34) * 0.0026041667F;
                    } else {
                        var46 = ((float) var32[var43] * var35 + (float) var30[var43] * var33 + (float) var31[var43] * var34) / (float) (var45 * 256);
                    }
                    float var47 = var36 + var46 * (var46 < 0.0F ? var38 : var37);
                    int var48 = (int) (var44 * var47);
                    if (var48 < 0) {
                        var48 = 0;
                    } else if (var48 > 255) {
                        var48 = 255;
                    }
                    int var49 = (int) (var42 * var47);
                    if (var49 < 0) {
                        var49 = 0;
                    } else if (var49 > 255) {
                        var49 = 255;
                    }
                    int var50 = (int) (var41 * var47);
                    var12.field4360 = var7 * var43 + var9;
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    var12.method1891(false, var48);
                    var12.method1891(false, var49);
                    var12.method1891(false, var50);
                    var12.method1891(false, 255 - (this.field5981[var39] & 0xFF));
                    short var51 = this.field5948[var39];
                    short var52 = (short) var29[var51];
                    float var53;
                    if (var52 == 0) {
                        var53 = ((float) var32[var51] * var35 + (float) var30[var51] * var33 + (float) var31[var51] * var34) * 0.0026041667F;
                    } else {
                        var53 = ((float) var32[var51] * var35 + (float) var30[var51] * var33 + (float) var31[var51] * var34) / (float) (var52 * 256);
                    }
                    float var54 = var36 + (var53 < 0.0F ? var38 : var37) * var53;
                    int var55 = (int) (var44 * var54);
                    if (var55 < 0) {
                        var55 = 0;
                    } else if (var55 > 255) {
                        var55 = 255;
                    }
                    int var56 = (int) (var42 * var54);
                    int var57 = (int) (var41 * var54);
                    if (var56 < 0) {
                        var56 = 0;
                    } else if (var56 > 255) {
                        var56 = 255;
                    }
                    var12.field4360 = var9 + (var7 * var51);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    var12.method1891(false, var55);
                    var12.method1891(false, var56);
                    var12.method1891(false, var57);
                    var12.method1891(false, 255 - (this.field5981[var39] & 0xFF));
                    short var58 = this.field6011[var39];
                    short var59 = (short) var29[var58];
                    float var60;
                    if (var59 == 0) {
                        var60 = ((float) var32[var58] * var35 + (float) var30[var58] * var33 + (float) var31[var58] * var34) * 0.0026041667F;
                    } else {
                        var60 = ((float) var32[var58] * var35 + (float) var30[var58] * var33 + (float) var31[var58] * var34) / (float) (var59 * 256);
                    }
                    float var61 = var36 + ((var60 < 0.0F) ? var38 : var37) * var60;
                    int var62 = (int) (var44 * var61);
                    int var63 = (int) (var42 * var61);
                    if (var62 < 0) {
                        var62 = 0;
                    } else if (var62 > 255) {
                        var62 = 255;
                    }
                    int var64 = (int) (var41 * var61);
                    if (var63 < 0) {
                        var63 = 0;
                    } else if (var63 > 255) {
                        var63 = 255;
                    }
                    var12.field4360 = var7 * var58 + var9;
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    var12.method1891(false, var62);
                    var12.method1891(false, var63);
                    var12.method1891(false, var64);
                    var12.method1891(false, 255 - (this.field5981[var39] & 0xFF));
                }
            } else {
                for (int var65 = 0; var65 < this.field5974; var65++) {
                    int var66 = this.method2441(this.field5984[var65], this.field6019, this.field5961[var65], this.field5981[var65], -81);
                    var12.field4360 = var9 + (this.field6004[var65] * var7);
                    var12.method1858(var66, (byte) -79);
                    var12.field4360 = var9 + (this.field5948[var65] * var7);
                    var12.method1858(var66, (byte) -48);
                    var12.field4360 = var9 + (this.field6011[var65] * var7);
                    var12.method1858(var66, (byte) -61);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            short[] var69;
            byte[] var70;
            if (this.field6013 == null) {
                var67 = this.field5992;
                var68 = this.field5986;
                var69 = this.field5960;
                var70 = this.field5946;
            } else {
                var67 = this.field6013.field1017;
                var68 = this.field6013.field1016;
                var70 = this.field6013.field1013;
                var69 = this.field6013.field1014;
            }
            float var71 = 3.0F / (float) this.field5954;
            float var72 = 3.0F / (float) (this.field5954 / 2 + this.field5954);
            var12.field4360 = var10;
            if (this.field6010.field4796) {
                for (int var73 = 0; var73 < this.field5985; var73++) {
                    int var74 = var70[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method2988(-35, (float) var69[var73] * var72);
                        var12.method2988(-66, (float) var67[var73] * var72);
                        var12.method2988(-47, (float) var68[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method2988(-74, (float) var69[var73] * var75);
                        var12.method2988(-42, (float) var67[var73] * var75);
                        var12.method2988(arg1 - 363, (float) var68[var73] * var75);
                    }
                    var12.field4360 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field5985; var76++) {
                    int var77 = var70[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method2989((float) var69[var76] * var72, -13163);
                        var12.method2989((float) var67[var76] * var72, arg1 ^ 0xFFFFCC6A);
                        var12.method2989((float) var68[var76] * var72, -13163);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method2989((float) var69[var76] * var78, -13163);
                        var12.method2989((float) var67[var76] * var78, -13163);
                        var12.method2989((float) var68[var76] * var78, -13163);
                    }
                    var12.field4360 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field4360 = var11;
            if (this.field6010.field4796) {
                for (int var80 = 0; var80 < this.field5985; var80++) {
                    var12.method2988(-108, this.field5968[var80]);
                    var12.method2988(arg1 ^ 0xFFFFFF3A, this.field5983[var80]);
                    var12.field4360 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field5985; var79++) {
                    var12.method2989(this.field5968[var79], -13163);
                    var12.method2989(this.field5983[var79], arg1 - 13418);
                    var12.field4360 += var7 - 8;
                }
            }
        }
        var12.field4360 = this.field5985 * var7;
        class171 var81;
        if (arg0) {
            if (this.field5939 == null) {
                this.field5939 = this.field6010.method1983(var12.field4360, true, var7, var12.field4336, 1);
            } else {
                this.field5939.method878(var12.field4360, var7, var12.field4336, (byte) -32);
            }
            var81 = this.field5939;
            this.field5940 = 0;
        } else {
            var81 = this.field6010.method1983(var12.field4360, false, var7, var12.field4336, 1);
            this.field5930 = true;
        }
        if (var5) {
            this.field5932.field6875 = var81;
            this.field5932.field6868 = var8;
        }
        if (var6) {
            this.field5952.field6875 = var81;
            this.field5952.field6868 = var11;
        }
        if (var3) {
            this.field5912.field6868 = var9;
            this.field5912.field6875 = var81;
        }
        if (var4) {
            this.field5922.field6868 = var10;
            this.field5922.field6875 = var81;
        }
    }

    @OriginalMember(owner = "client!oj", name = "pa", descriptor = "()I")
    public final int method661() {
        field5987++;
        return this.field5954;
    }

    @OriginalMember(owner = "client!oj", name = "da", descriptor = "(IILya;Lya;III)V")
    public final void method685(int arg0, int arg1, class11 arg2, class11 arg3, int arg4, int arg5, int arg6) {
        if (!this.field5913) {
            this.method2449(24317);
        }
        field5963++;
        int var8 = this.field5957 + arg4;
        int var9 = this.field5964 + arg4;
        int var10 = arg6 + this.field5993;
        int var11 = this.field5979 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || (var9 + arg2.field121 >> arg2.field126) >= arg2.field125 || var10 < 0 || arg2.field124 <= (arg2.field121 + var11 >> arg2.field126)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field121 + var9 >> arg3.field126 >= arg3.field125 || var10 < 0 || (arg3.field121 + var11 >> arg3.field126) >= arg3.field124) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field126;
            int var13 = -(-arg2.field121 - var9) - 1 >> arg2.field126;
            int var14 = var10 >> arg2.field126;
            int var15 = var11 + arg2.field121 - 1 >> arg2.field126;
            if (arg5 == arg2.method85(var12, var14) && arg2.method85(var13, var14) == arg5 && arg2.method85(var12, var15) == arg5 && arg2.method85(var13, var15) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field5977; var32++) {
                this.field5933[var32] -= arg5 - arg2.method79(this.field5997[var32] + arg4, this.field5923[var32] + arg6);
            }
        } else if (arg0 == 2) {
            short var16 = this.field5959;
            if (var16 == 0) {
                return;
            }
            for (int var17 = 0; var17 < this.field5977; var17++) {
                int var18 = (this.field5933[var17] << 16) / var16;
                if (arg1 > var18) {
                    this.field5933[var17] -= -((arg2.method79(this.field5997[var17] + arg4, this.field5923[var17] + arg6) - arg5) * (arg1 - var18) / arg1);
                }
            }
        } else if (arg0 == 3) {
            int var19 = (arg1 & 0xFF) * 4;
            int var20 = (arg1 >> 8 & 0xFF) * 4;
            int var21 = (arg1 & 0xFF3222) >> 16 << 6;
            int var22 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var19 >> 1) < 0 || arg2.field125 << arg2.field126 <= arg4 + (var19 >> 1) + arg2.field121 || arg6 - (var20 >> 1) < 0 || (arg2.field124 << arg2.field126) <= ((var20 >> 1) + arg2.field121 + arg6)) {
                return;
            }
            this.method1638(arg6, var22, arg5, var21, var19, var20, arg2, arg4, 74);
        } else if (arg0 == 4) {
            int var30 = this.field5980 - this.field5959;
            for (int var31 = 0; var31 < this.field5977; var31++) {
                this.field5933[var31] = this.field5933[var31] + var30 + (arg3.method79(this.field5997[var31] + arg4, this.field5923[var31] + arg6) - arg5);
            }
        } else if (arg0 == 5) {
            int var23 = this.field5980 - this.field5959;
            for (int var24 = 0; var24 < this.field5977; var24++) {
                int var25 = this.field5997[var24] + arg4;
                int var26 = this.field5923[var24] + arg6;
                int var27 = arg2.method79(var25, var26);
                int var28 = arg3.method79(var25, var26);
                int var29 = var27 - var28;
                this.field5933[var24] = ((this.field5933[var24] << 8) / var23 * var29 >> 8) + var27 - arg5;
            }
        }
        if (this.field5932 != null) {
            this.field5932.field6875 = null;
        }
        this.field5913 = false;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "()[Lmf;")
    public final class51[] method715() {
        field6006++;
        return this.field5938;
    }

    @OriginalMember(owner = "client!oj", name = "Z", descriptor = "()I")
    public final int method723() {
        field5949++;
        if (!this.field5913) {
            this.method2449(24317);
        }
        return this.field5993;
    }

    @OriginalMember(owner = "client!oj", name = "MA", descriptor = "()I")
    public final int method681() {
        if (!this.field5913) {
            this.method2449(24317);
        }
        field5921++;
        return this.field5964;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "()[Lqe;")
    public final class502[] method709() {
        field6018++;
        return this.field5969;
    }

    @OriginalMember(owner = "client!oj", name = "aa", descriptor = "(I[IIIIZI[I)V")
    public final void method683(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field5967++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            int var12 = arg3 << 4;
            int var13 = 0;
            class49.field698 = 0;
            class451.field6615 = 0;
            class245.field3355 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field5914.length) {
                    int[] var16 = this.field5914[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field5962 == null || (this.field5962[var18] & arg6) != 0) {
                            class245.field3355 += this.field5997[var18];
                            class49.field698 += this.field5933[var18];
                            var13++;
                            class451.field6615 += this.field5923[var18];
                        }
                    }
                }
            }
            if (var13 > 0) {
                class451.field6615 = class451.field6615 / var13 + var11;
                class245.field3355 = class245.field3355 / var13 + var10;
                class49.field698 = class49.field698 / var13 + var12;
                class93.field1521 = true;
            } else {
                class49.field698 = var12;
                class451.field6615 = var11;
                class245.field3355 = var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + (arg7[1] * arg3) + (arg7[2] * arg4) + 16384 >> 15;
                int var20 = arg7[4] * arg3 + arg7[3] * arg2 - (-(arg7[5] * arg4) - 16384) >> 15;
                int var21 = arg7[6] * arg2 + arg7[8] * arg4 + arg7[7] * arg3 + 16384 >> 15;
                arg4 = var21;
                arg2 = var19;
                arg3 = var20;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field5914.length) {
                    int[] var27 = this.field5914[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field5962 == null || (arg6 & this.field5962[var29]) != 0) {
                            this.field5997[var29] += var22;
                            this.field5933[var29] += var23;
                            this.field5923[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (this.field5914.length > var49) {
                        int[] var50 = this.field5914[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field5962 == null || (this.field5962[var52] & arg6) != 0) {
                                this.field5997[var52] -= class245.field3355;
                                this.field5933[var52] -= class49.field698;
                                this.field5923[var52] -= class451.field6615;
                                if (arg4 != 0) {
                                    int var53 = class51.field743[arg4];
                                    int var54 = class51.field731[arg4];
                                    int var55 = this.field5997[var52] * var54 + (this.field5933[var52] * var53 + 32767) >> 15;
                                    this.field5933[var52] = this.field5933[var52] * var54 + 32767 - (this.field5997[var52] * var53) >> 15;
                                    this.field5997[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class51.field743[arg2];
                                    int var57 = class51.field731[arg2];
                                    int var58 = this.field5933[var52] * var57 + 32767 - this.field5923[var52] * var56 >> 15;
                                    this.field5923[var52] = this.field5923[var52] * var57 + (this.field5933[var52] * var56 + 32767) >> 15;
                                    this.field5933[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class51.field743[arg3];
                                    int var60 = class51.field731[arg3];
                                    int var61 = this.field5923[var52] * var59 + (this.field5997[var52] * var60) + 32767 >> 15;
                                    this.field5923[var52] = this.field5923[var52] * var60 + 32767 - (this.field5997[var52] * var59) >> 15;
                                    this.field5997[var52] = var61;
                                }
                                this.field5997[var52] += class245.field3355;
                                this.field5933[var52] += class49.field698;
                                this.field5923[var52] += class451.field6615;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field5914.length > var32) {
                            int[] var33 = this.field5914[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field5962 == null || (this.field5962[var35] & arg6) != 0) {
                                    int var36 = this.field5958[var35];
                                    int var37 = this.field5958[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field5995[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class51.field743[arg4];
                                            int var41 = class51.field731[arg4];
                                            int var42 = this.field5960[var39] * var41 + this.field5992[var39] * var40 + 32767 >> 15;
                                            this.field5992[var39] = (short) (this.field5992[var39] * var41 + 32767 - (this.field5960[var39] * var40) >> 15);
                                            this.field5960[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class51.field743[arg2];
                                            int var44 = class51.field731[arg2];
                                            int var45 = this.field5992[var39] * var44 + 32767 - (this.field5986[var39] * var43) >> 15;
                                            this.field5986[var39] = (short) (this.field5992[var39] * var43 + (this.field5986[var39] * var44 + 32767) >> 15);
                                            this.field5992[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class51.field743[arg3];
                                            int var47 = class51.field731[arg3];
                                            int var48 = this.field5960[var39] * var47 + this.field5986[var39] * var46 + 32767 >> 15;
                                            this.field5986[var39] = (short) (this.field5986[var39] * var47 + 32767 - (this.field5960[var39] * var46) >> 15);
                                            this.field5960[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field5922 == null && this.field5912 != null) {
                        this.field5912.field6875 = null;
                    }
                    if (this.field5922 != null) {
                        this.field5922.field6875 = null;
                        return;
                    }
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class93.field1521) {
                    int var68 = arg7[6] * class451.field6615 + arg7[3] * class49.field698 + arg7[0] * class245.field3355 + 16384 >> 15;
                    int var69 = arg7[7] * class451.field6615 + arg7[4] * class49.field698 + arg7[1] * class245.field3355 + 16384 >> 15;
                    int var70 = var66 + var69;
                    int var71 = var65 + var68;
                    int var72 = arg7[5] * class49.field698 + arg7[2] * class245.field3355 + arg7[8] * class451.field6615 + 16384 >> 15;
                    class245.field3355 = var71;
                    int var73 = var67 + var72;
                    class49.field698 = var70;
                    class93.field1521 = false;
                    class451.field6615 = var73;
                }
                int[] var74 = new int[9];
                int var75 = class51.field731[arg2];
                int var76 = class51.field743[arg2];
                int var77 = class51.field731[arg3];
                int var78 = class51.field743[arg3];
                int var79 = class51.field731[arg4];
                int var80 = class51.field743[arg4];
                int var81 = var76 * var79 + 16384 >> 15;
                int var82 = var76 * var80 + 16384 >> 15;
                var74[5] = -var76;
                var74[6] = -var78 * var79 + var77 * var82 + 16384 >> 15;
                var74[2] = var75 * var78 + 16384 >> 15;
                var74[0] = var77 * var79 + var78 * var82 + 16384 >> 15;
                var74[3] = var75 * var80 + 16384 >> 15;
                var74[4] = var75 * var79 + 16384 >> 15;
                var74[1] = -var77 * var80 + var78 * var81 + 16384 >> 15;
                var74[7] = var78 * var80 + var77 * var81 + 16384 >> 15;
                var74[8] = var75 * var77 + 16384 >> 15;
                int var83 = var74[2] * -class451.field6615 + var74[1] * -class49.field698 + var74[0] * -class245.field3355 + 16384 >> 15;
                int var84 = var74[4] * -class49.field698 + var74[3] * -class245.field3355 - (-(var74[5] * -class451.field6615) + -16384) >> 15;
                int var85 = var74[6] * -class245.field3355 + (var74[7] * -class49.field698) + (var74[8] * -class451.field6615) + 16384 >> 15;
                int var86 = class245.field3355 + var83;
                int var87 = var84 + class49.field698;
                int var88 = class451.field6615 + var85;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += var74[var90 * 3 + var121] * arg7[var119 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 16384 >> 15;
                    }
                }
                int var91 = var74[2] * var67 + var74[1] * var66 + var74[0] * var65 + 16384 >> 15;
                int var92 = var74[5] * var67 + var74[4] * var66 + var74[3] * var65 + 16384 >> 15;
                int var93 = var74[6] * var65 + var74[8] * var67 + var74[7] * var66 + 16384 >> 15;
                int var94 = var86 + var91;
                int var95 = var87 + var92;
                int var96 = var88 + var93;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += arg7[var98 * 3 + var118] * var89[var118 * 3 + var116];
                        }
                        var97[var98 * 3 + var116] = var117 + 16384 >> 15;
                    }
                }
                int var99 = arg7[0] * var94 - (-(arg7[1] * var95) - arg7[2] * var96 - 16384) >> 15;
                int var100 = arg7[5] * var96 + (arg7[3] * var94 + arg7[4] * var95 + 16384) >> 15;
                int var101 = var63 + var100;
                int var102 = arg7[8] * var96 + (arg7[6] * var94 + (arg7[7] * var95)) + 16384 >> 15;
                int var103 = var62 + var99;
                int var104 = var64 + var102;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field5914.length) {
                        int[] var107 = this.field5914[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field5962 == null || (arg6 & this.field5962[var109]) != 0) {
                                int var110 = this.field5997[var109] * var97[0] + this.field5933[var109] * var97[1] + this.field5923[var109] * var97[2] + 16384 >> 15;
                                int var111 = this.field5997[var109] * var97[3] + this.field5933[var109] * var97[4] + this.field5923[var109] * var97[5] + 16384 >> 15;
                                int var112 = this.field5923[var109] * var97[8] + this.field5997[var109] * var97[6] + this.field5933[var109] * var97[7] + 16384 >> 15;
                                int var113 = var101 + var111;
                                int var114 = var103 + var110;
                                int var115 = var104 + var112;
                                this.field5997[var109] = var114;
                                this.field5933[var109] = var113;
                                this.field5923[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (this.field5914.length > var123) {
                        int[] var124 = this.field5914[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field5962 == null || (arg6 & this.field5962[var126]) != 0) {
                                this.field5997[var126] -= class245.field3355;
                                this.field5933[var126] -= class49.field698;
                                this.field5923[var126] -= class451.field6615;
                                this.field5997[var126] = this.field5997[var126] * arg2 >> 7;
                                this.field5933[var126] = this.field5933[var126] * arg3 >> 7;
                                this.field5923[var126] = this.field5923[var126] * arg4 >> 7;
                                this.field5997[var126] += class245.field3355;
                                this.field5933[var126] += class49.field698;
                                this.field5923[var126] += class451.field6615;
                            }
                        }
                    }
                }
            } else {
                int var127 = arg7[9] << 4;
                int var128 = arg7[10] << 4;
                int var129 = arg7[11] << 4;
                int var130 = arg7[12] << 4;
                int var131 = arg7[13] << 4;
                int var132 = arg7[14] << 4;
                if (class93.field1521) {
                    int var133 = arg7[6] * class451.field6615 + (arg7[3] * class49.field698 + arg7[0] * class245.field3355 + 16384) >> 15;
                    int var134 = arg7[1] * class245.field3355 + (arg7[4] * class49.field698) + (arg7[7] * class451.field6615) + 16384 >> 15;
                    int var135 = var131 + var134;
                    int var136 = var130 + var133;
                    int var137 = arg7[2] * class245.field3355 + arg7[8] * class451.field6615 + (arg7[5] * class49.field698) + 16384 >> 15;
                    int var138 = var132 + var137;
                    class245.field3355 = var136;
                    class49.field698 = var135;
                    class93.field1521 = false;
                    class451.field6615 = var138;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class245.field3355 * var139 + 16384 >> 15;
                int var143 = -class49.field698 * var140 + 16384 >> 15;
                int var144 = -class451.field6615 * var141 + 16384 >> 15;
                int var145 = class245.field3355 + var142;
                int var146 = class49.field698 + var143;
                int var147 = class451.field6615 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 16384 >> 15, arg7[3] * var139 + 16384 >> 15, arg7[6] * var139 + 16384 >> 15, arg7[1] * var140 + 16384 >> 15, arg7[4] * var140 + 16384 >> 15, arg7[7] * var140 + 16384 >> 15, arg7[2] * var141 + 16384 >> 15, arg7[5] * var141 + 16384 >> 15, arg7[8] * var141 + 16384 >> 15 };
                int var149 = var130 * var139 + 16384 >> 15;
                int var150 = var131 * var140 + 16384 >> 15;
                int var151 = var132 * var141 + 16384 >> 15;
                int var152 = var146 + var150;
                int var153 = var145 + var149;
                int var154 = var147 + var151;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += arg7[var156 * 3 + var176] * var148[var176 * 3 + var174];
                        }
                        var155[var156 * 3 + var174] = var175 + 16384 >> 15;
                    }
                }
                int var157 = arg7[2] * var154 + arg7[0] * var153 + (arg7[1] * var152 - -16384) >> 15;
                int var158 = arg7[4] * var152 + arg7[3] * var153 + (arg7[5] * var154) + 16384 >> 15;
                int var159 = arg7[8] * var154 + arg7[6] * var153 + arg7[7] * var152 + 16384 >> 15;
                int var160 = var127 + var157;
                int var161 = var128 + var158;
                int var162 = var129 + var159;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (var164 < this.field5914.length) {
                        int[] var165 = this.field5914[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field5962 == null || (this.field5962[var167] & arg6) != 0) {
                                int var168 = this.field5923[var167] * var155[2] + this.field5997[var167] * var155[0] + this.field5933[var167] * var155[1] + 16384 >> 15;
                                int var169 = this.field5997[var167] * var155[3] + this.field5933[var167] * var155[4] + this.field5923[var167] * var155[5] + 16384 >> 15;
                                int var170 = var161 + var169;
                                int var171 = this.field5933[var167] * var155[7] + this.field5997[var167] * var155[6] + this.field5923[var167] * var155[8] + 16384 >> 15;
                                int var172 = var160 + var168;
                                int var173 = var162 + var171;
                                this.field5997[var167] = var172;
                                this.field5933[var167] = var170;
                                this.field5923[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field6009 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field6009.length > var181) {
                        int[] var182 = this.field6009[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field6022 == null || (arg6 & this.field6022[var184]) != 0) {
                                int var185 = (this.field5981[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field5981[var184] = (byte) var185;
                                if (this.field5912 != null) {
                                    this.field5912.field6875 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field6016 != null) {
                    for (int var178 = 0; var178 < this.field5950; var178++) {
                        class277 var179 = this.field6016[var178];
                        class500 var180 = this.field5943[var178];
                        var180.field7326 = 255 - (this.field5981[var179.field3768] & 0xFF) << 24 | var180.field7326 & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field6009 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (var190 < this.field6009.length) {
                        int[] var191 = this.field6009[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field6022 == null || (arg6 & this.field6022[var193]) != 0) {
                                int var194 = this.field5984[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFEAA) >> 10;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = var195 + arg2 & 0x3F;
                                int var198 = arg3 / 4 + var196;
                                int var199 = var194 & 0x7F;
                                int var200 = arg4 + var199;
                                if (var198 < 0) {
                                    var198 = 0;
                                } else if (var198 > 7) {
                                    var198 = 7;
                                }
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field5984[var193] = (short) class219.method1367(var200, class219.method1367(var198 << 7, var197 << 10));
                                if (this.field5912 != null) {
                                    this.field5912.field6875 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field6016 != null) {
                    for (int var187 = 0; var187 < this.field5950; var187++) {
                        class277 var188 = this.field6016[var187];
                        class500 var189 = this.field5943[var187];
                        var189.field7326 = var189.field7326 & 0xFF000000 | class203.field2946[this.field5984[var188.field3768] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field5917 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field5917.length > var202) {
                        int[] var203 = this.field5917[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class500 var205 = this.field5943[var203[var204]];
                            var205.field7317 += arg2;
                            var205.field7323 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field5917 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field5917.length > var207) {
                        int[] var208 = this.field5917[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class500 var210 = this.field5943[var208[var209]];
                            var210.field7320 = var210.field7320 * arg3 >> 7;
                            var210.field7325 = var210.field7325 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field5917 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (var212 < this.field5917.length) {
                    int[] var213 = this.field5917[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class500 var215 = this.field5943[var213[var214]];
                        var215.field7319 = var215.field7319 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lza;IIIIII)Le;")
    public static final class285 method2454(class295 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5971++;
        if (arg2 < 104) {
            field6021 = null;
        }
        long var7 = (long) arg4;
        class285 var9 = (class285) class2.field33.method2767(var7, 0);
        short var10 = 2055;
        if (var9 == null) {
            class496 var11 = class44.method299(class91.field1457, arg4, -6502, 0);
            if (var11 == null) {
                return null;
            }
            if (var11.field7253 < 13) {
                var11.method2938(false, 0);
            }
            var9 = arg0.method501(var11, var10, class246.field3358, 64, 768);
            class2.field33.method2777(-1025, var9, var7);
        }
        class285 var12 = var9.method697((byte) 2, var10, true);
        if (arg6 != 0) {
            var12.method704(arg6);
        }
        if (arg5 != 0) {
            var12.method690(arg5);
        }
        if (arg1 != 0) {
            var12.method692(arg1);
        }
        if (arg3 != 0) {
            var12.method675(0, arg3, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lpg;)V")
    public class415(class333 arg0) {
        this.field6010 = arg0;
        this.field5932 = new class475(null, 5126, 3, 0);
        this.field5952 = new class475(null, 5126, 2, 0);
        this.field5922 = new class475(null, 5126, 3, 0);
        this.field5912 = new class475(null, 5121, 4, 0);
        this.field5975 = new class36();
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lpg;Lqq;IIII)V")
    public class415(class333 arg0, class496 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5990 = arg2;
        this.field6010 = arg0;
        this.field5916 = arg5;
        if (class411.method2413(arg2, (byte) -19, arg5)) {
            this.field5932 = new class475(null, 5126, 3, 0);
        }
        if (class205.method1314(arg2, arg5, -119)) {
            this.field5952 = new class475(null, 5126, 2, 0);
        }
        if (class281.method1626(arg5, (byte) -22, arg2)) {
            this.field5922 = new class475(null, 5126, 3, 0);
        }
        if (class151.method1091((byte) -96, arg5, arg2)) {
            this.field5912 = new class475(null, 5121, 4, 0);
        }
        if (class159.method1132(true, arg2, arg5)) {
            this.field5975 = new class36();
        }
        class127 var7 = arg0.field3988;
        int[] var8 = new int[arg1.field7232];
        this.field5958 = new int[arg1.field7228 + 1];
        for (int var9 = 0; var9 < arg1.field7232; var9++) {
            if ((arg1.field7245 == null || arg1.field7245[var9] != 2) && (arg1.field7244 == null || arg1.field7244[var9] == -1 || !var7.method914(false, arg1.field7244[var9] & 0xFFFF).field3384)) {
                var8[this.field5974++] = var9;
                this.field5958[arg1.field7248[var9]]++;
                this.field5958[arg1.field7216[var9]]++;
                this.field5958[arg1.field7220[var9]]++;
            }
        }
        this.field5951 = this.field5974;
        long[] var10 = new long[this.field5974];
        boolean var11 = (this.field5990 & 0x100) != 0;
        label494: for (int var12 = 0; var12 < this.field5974; var12++) {
            int var180 = var8[var12];
            class249 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field7238 != null) {
                for (int var186 = 0; var186 < arg1.field7238.length; var186++) {
                    class87 var187 = arg1.field7238[var186];
                    if (var187.field1420 == var180) {
                        class385 var188 = class523.method3107(23244, var187.field1415);
                        if (var188.field5521) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field5951--;
                            continue label494;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field7244 != null) {
                var189 = arg1.field7244[var180];
                if (var189 != -1) {
                    var181 = var7.method914(false, var189 & 0xFFFF);
                    var184 = var181.field3382;
                    var185 = var181.field3383;
                }
            }
            boolean var190 = arg1.field7255 != null && arg1.field7255[var180] != 0 || var181 != null && !var181.field3381;
            if ((var11 || var190) && arg1.field7259 != null) {
                var182 += arg1.field7259[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = ((var184 & 0xFF) << 8) + var182;
            int var192 = (var185 & 0xFF) + var191;
            int var193 = (var189 & 0xFFFF << 16) + var183;
            int var194 = (var12 & 0xFFFF) + var193;
            var10[var12] = ((long) var192 << 32) + ((long) var194);
        }
        class201.method1304(var10, var8, (byte) -119);
        this.field5977 = arg1.field7228;
        this.field5933 = arg1.field7239;
        this.field5923 = arg1.field7257;
        this.field5962 = arg1.field7223;
        this.field6007 = arg1.field7234;
        this.field5997 = arg1.field7265;
        class20[] var13 = new class20[this.field5977];
        this.field5938 = arg1.field7217;
        this.field5969 = arg1.field7262;
        if (arg1.field7238 != null) {
            this.field5950 = arg1.field7238.length;
            this.field6016 = new class277[this.field5950];
            this.field5943 = new class500[this.field5950];
            for (int var14 = 0; var14 < this.field5950; var14++) {
                class87 var15 = arg1.field7238[var14];
                class385 var16 = class523.method3107(23244, var15.field1415);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field5974; var18++) {
                    if (var8[var18] == var15.field1420) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class203.field2946[arg1.field7251[var15.field1420] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field7255 == null ? 0 : arg1.field7255[var15.field1420]) << 24;
                this.field6016[var14] = new class277(var17, arg1.field7248[var15.field1420], arg1.field7216[var15.field1420], arg1.field7220[var15.field1420], var16.field5524, var16.field5529, var16.field5522, var16.field5525, var16.field5526, var16.field5521, var16.field5530, var15.field1412);
                this.field5943[var14] = new class500(var20);
            }
        }
        int var21 = this.field5974 * 3;
        this.field5954 = (short) arg4;
        this.field5960 = new short[var21];
        this.field5968 = new float[var21];
        this.field5961 = new short[this.field5974];
        this.field5983 = new float[var21];
        if (arg1.field7246 != null) {
            this.field6022 = new short[this.field5974];
        }
        this.field6019 = (short) arg3;
        this.field5981 = new byte[this.field5974];
        this.field5995 = new short[var21];
        this.field6011 = new short[this.field5974];
        this.field5986 = new short[var21];
        this.field6004 = new short[this.field5974];
        this.field5946 = new byte[var21];
        class509.field7435 = new long[var21];
        this.field5992 = new short[var21];
        this.field5984 = new short[this.field5974];
        this.field5948 = new short[this.field5974];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field7228; var23++) {
            int var179 = this.field5958[var23];
            this.field5958[var23] = var22;
            var13[var23] = new class20();
            var22 += var179;
        }
        this.field5958[arg1.field7228] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field7241 != null) {
            int var28 = arg1.field7235;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field5974; var36++) {
                int var43 = var8[var36];
                if (arg1.field7241[var43] != -1) {
                    int var44 = arg1.field7241[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field7248[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field7216[var43];
                        } else {
                            var46 = arg1.field7220[var43];
                        }
                        int var47 = arg1.field7265[var46];
                        int var48 = arg1.field7239[var46];
                        int var49 = arg1.field7257[var46];
                        if (var29[var44] > var47) {
                            var29[var44] = var47;
                        }
                        if (var30[var44] < var47) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
                            var31[var44] = var48;
                        }
                        if (var32[var44] < var48) {
                            var32[var44] = var48;
                        }
                        if (var33[var44] > var49) {
                            var33[var44] = var49;
                        }
                        if (var34[var44] < var49) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var26 = new int[var28];
            var27 = new float[var28][];
            var25 = new int[var28];
            var24 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field7229[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field7214[var37];
                        var40 = 64.0F / (float) arg1.field7219[var37];
                        if (var39 == 0) {
                            var41 = 1.0F;
                            var42 = 1.0F;
                        } else if (var39 > 0) {
                            var42 = (float) var39 / 1024.0F;
                            var41 = 1.0F;
                        } else {
                            var42 = 1.0F;
                            var41 = (float) (-var39) / 1024.0F;
                        }
                    } else if (var38 == 2) {
                        var42 = 64.0F / (float) arg1.field7227[var37];
                        var40 = 64.0F / (float) arg1.field7219[var37];
                        var41 = 64.0F / (float) arg1.field7214[var37];
                    } else {
                        var41 = (float) arg1.field7214[var37] / 1024.0F;
                        var42 = (float) arg1.field7227[var37] / 1024.0F;
                        var40 = (float) arg1.field7219[var37] / 1024.0F;
                    }
                    var27[var37] = class172.method1171(arg1.field7233[var37], var40, arg1.field7252[var37], arg1.field7230[var37], -114, var42, class375.method2245(arg1.field7231[var37], 255), var41);
                }
            }
        }
        class347[] var50 = new class347[arg1.field7232];
        for (int var51 = 0; var51 < arg1.field7232; var51++) {
            short var158 = arg1.field7248[var51];
            short var159 = arg1.field7216[var51];
            short var160 = arg1.field7220[var51];
            int var161 = this.field5997[var159] - this.field5997[var158];
            int var162 = this.field5933[var159] - this.field5933[var158];
            int var163 = this.field5923[var159] - this.field5923[var158];
            int var164 = this.field5997[var160] - this.field5997[var158];
            int var165 = this.field5933[var160] - this.field5933[var158];
            int var166 = this.field5923[var160] - this.field5923[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - (var161 * var166);
            int var169 = var161 * var165 - (var162 * var164);
            while (var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192) {
                var168 >>= 0x1;
                var169 >>= 0x1;
                var167 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var169 * var169 + var167 * var167 + var168 * var168));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var168 * 256 / var170;
            int var172 = var169 * 256 / var170;
            int var173 = var167 * 256 / var170;
            byte var174 = arg1.field7245 == null ? 0 : arg1.field7245[var51];
            if (var174 == 0) {
                class20 var176 = var13[var158];
                var176.field293 += var172;
                var176.field291++;
                var176.field290 += var171;
                var176.field289 += var173;
                class20 var177 = var13[var159];
                var177.field290 += var171;
                var177.field293 += var172;
                var177.field289 += var173;
                var177.field291++;
                class20 var178 = var13[var160];
                var178.field290 += var171;
                var178.field291++;
                var178.field289 += var173;
                var178.field293 += var172;
            } else if (var174 == 1) {
                class347 var175 = var50[var51] = new class347();
                var175.field4986 = var172;
                var175.field4987 = var173;
                var175.field4991 = var171;
            }
        }
        for (int var52 = 0; var52 < this.field5974; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field7251[var68] & 0xFFFF;
            short var70;
            if (arg1.field7244 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field7244[var68];
            }
            int var71;
            if (arg1.field7241 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field7241[var68];
            }
            int var72;
            if (arg1.field7255 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field7255[var68] & 0xFF;
            }
            float var73 = 0.0F;
            float var74 = 0.0F;
            float var75 = 0.0F;
            float var76 = 0.0F;
            float var77 = 0.0F;
            float var78 = 0.0F;
            byte var79 = 0;
            byte var80 = 0;
            int var81 = 0;
            if (var70 != -1) {
                if (var71 == -1) {
                    var76 = 1.0F;
                    var77 = 0.0F;
                    var79 = 1;
                    var75 = 1.0F;
                    var73 = 0.0F;
                    var78 = 0.0F;
                    var74 = 1.0F;
                    var80 = 2;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field7229[var71];
                    if (var82 == 0) {
                        short var111 = arg1.field7248[var68];
                        short var112 = arg1.field7216[var68];
                        short var113 = arg1.field7220[var68];
                        short var114 = arg1.field7233[var71];
                        short var115 = arg1.field7252[var71];
                        short var116 = arg1.field7230[var71];
                        float var117 = (float) arg1.field7265[var114];
                        float var118 = (float) arg1.field7239[var114];
                        float var119 = (float) arg1.field7257[var114];
                        float var120 = (float) arg1.field7265[var115] - var117;
                        float var121 = (float) arg1.field7239[var115] - var118;
                        float var122 = (float) arg1.field7257[var115] - var119;
                        float var123 = (float) arg1.field7265[var116] - var117;
                        float var124 = (float) arg1.field7239[var116] - var118;
                        float var125 = (float) arg1.field7257[var116] - var119;
                        float var126 = (float) arg1.field7265[var111] - var117;
                        float var127 = (float) arg1.field7239[var111] - var118;
                        float var128 = (float) arg1.field7257[var111] - var119;
                        float var129 = (float) arg1.field7265[var112] - var117;
                        float var130 = (float) arg1.field7239[var112] - var118;
                        float var131 = (float) arg1.field7257[var112] - var119;
                        float var132 = (float) arg1.field7265[var113] - var117;
                        float var133 = (float) arg1.field7239[var113] - var118;
                        float var134 = (float) arg1.field7257[var113] - var119;
                        float var135 = var121 * var125 - (var122 * var124);
                        float var136 = var122 * var123 - (var120 * var125);
                        float var137 = var120 * var124 - (var121 * var123);
                        float var138 = var124 * var137 - var125 * var136;
                        float var139 = var125 * var135 - (var123 * var137);
                        float var140 = var123 * var136 - var124 * var135;
                        float var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                        var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                        var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                        var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                        float var142 = var120 * var136 - (var121 * var135);
                        float var143 = var122 * var135 - var120 * var137;
                        float var144 = var121 * var137 - (var122 * var136);
                        float var145 = 1.0F / (var125 * var142 + var123 * var144 + var124 * var143);
                        var78 = (var134 * var142 + var132 * var144 + var133 * var143) * var145;
                        var74 = (var128 * var142 + var126 * var144 + var127 * var143) * var145;
                        var76 = (var131 * var142 + var129 * var144 + var130 * var143) * var145;
                    } else {
                        short var83 = arg1.field7248[var68];
                        short var84 = arg1.field7216[var68];
                        short var85 = arg1.field7220[var68];
                        int var86 = var24[var71];
                        int var87 = var25[var71];
                        int var88 = var26[var71];
                        float[] var89 = var27[var71];
                        byte var90 = arg1.field7225[var71];
                        float var91 = (float) arg1.field7224[var71] / 256.0F;
                        if (var82 == 1) {
                            float var92 = (float) arg1.field7227[var71] / 1024.0F;
                            class499.method2973(arg1.field7239[var83], var90, var92, var91, arg1.field7265[var83], var87, arg1.field7257[var83], 2566, var88, var86, var89);
                            var73 = class42.field622;
                            var74 = class380.field5459;
                            class499.method2973(arg1.field7239[var84], var90, var92, var91, arg1.field7265[var84], var87, arg1.field7257[var84], 2566, var88, var86, var89);
                            var76 = class380.field5459;
                            var75 = class42.field622;
                            class499.method2973(arg1.field7239[var85], var90, var92, var91, arg1.field7265[var85], var87, arg1.field7257[var85], 2566, var88, var86, var89);
                            var77 = class42.field622;
                            var78 = class380.field5459;
                            float var93 = var92 / 2.0F;
                            if ((var90 & 0x1) == 0) {
                                if ((var93 < var75 - var73)) {
                                    var75 -= var92;
                                    var79 = 1;
                                } else if (var93 < var73 - var75) {
                                    var79 = 2;
                                    var75 += var92;
                                }
                                if ((var77 - var73 > var93)) {
                                    var80 = 1;
                                    var77 -= var92;
                                } else if (var93 < var73 - var77) {
                                    var80 = 2;
                                    var77 += var92;
                                }
                            } else {
                                if ((var93 < var76 - var74)) {
                                    var76 -= var92;
                                    var79 = 1;
                                } else if (var74 - var76 > var93) {
                                    var76 += var92;
                                    var79 = 2;
                                }
                                if ((var93 < var78 - var74)) {
                                    var78 -= var92;
                                    var80 = 1;
                                } else if (var74 - var78 > var93) {
                                    var80 = 2;
                                    var78 += var92;
                                }
                            }
                        } else if (var82 == 2) {
                            float var94 = (float) arg1.field7249[var71] / 256.0F;
                            float var95 = (float) arg1.field7256[var71] / 256.0F;
                            int var96 = arg1.field7265[var84] - arg1.field7265[var83];
                            int var97 = arg1.field7239[var84] - arg1.field7239[var83];
                            int var98 = arg1.field7257[var84] - arg1.field7257[var83];
                            int var99 = arg1.field7265[var85] - arg1.field7265[var83];
                            int var100 = arg1.field7239[var85] - arg1.field7239[var83];
                            int var101 = arg1.field7257[var85] - arg1.field7257[var83];
                            int var102 = var97 * var101 - var98 * var100;
                            int var103 = var98 * var99 - (var96 * var101);
                            int var104 = var96 * var100 - (var97 * var99);
                            float var105 = 64.0F / (float) arg1.field7214[var71];
                            float var106 = 64.0F / (float) arg1.field7219[var71];
                            float var107 = 64.0F / (float) arg1.field7227[var71];
                            float var108 = (var89[2] * (float) var104 + var89[0] * (float) var102 + var89[1] * (float) var103) / var105;
                            float var109 = (var89[5] * (float) var104 + var89[3] * (float) var102 + var89[4] * (float) var103) / var106;
                            float var110 = (var89[8] * (float) var104 + var89[6] * (float) var102 + var89[7] * (float) var103) / var107;
                            var81 = class11.method87(var110, var109, false, var108);
                            class399.method2368(arg1.field7239[var83], var88, var91, var90, var86, var81, var87, (byte) -92, var95, var94, arg1.field7257[var83], arg1.field7265[var83], var89);
                            var73 = class307.field4170;
                            var74 = class154.field2376;
                            class399.method2368(arg1.field7239[var84], var88, var91, var90, var86, var81, var87, (byte) -124, var95, var94, arg1.field7257[var84], arg1.field7265[var84], var89);
                            var75 = class307.field4170;
                            var76 = class154.field2376;
                            class399.method2368(arg1.field7239[var85], var88, var91, var90, var86, var81, var87, (byte) -114, var95, var94, arg1.field7257[var85], arg1.field7265[var85], var89);
                            var77 = class307.field4170;
                            var78 = class154.field2376;
                        } else if (var82 == 3) {
                            class375.method2247(var86, arg1.field7265[var83], var87, arg1.field7239[var83], var89, var90, var88, 1, arg1.field7257[var83], var91);
                            var74 = class5.field76;
                            var73 = class236.field3272;
                            class375.method2247(var86, arg1.field7265[var84], var87, arg1.field7239[var84], var89, var90, var88, 1, arg1.field7257[var84], var91);
                            var75 = class236.field3272;
                            var76 = class5.field76;
                            class375.method2247(var86, arg1.field7265[var85], var87, arg1.field7239[var85], var89, var90, var88, 1, arg1.field7257[var85], var91);
                            var77 = class236.field3272;
                            var78 = class5.field76;
                            if ((var90 & 0x1) == 0) {
                                if ((var75 - var73 > 0.5F)) {
                                    var79 = 1;
                                    var75--;
                                } else if (var73 - var75 > 0.5F) {
                                    var75++;
                                    var79 = 2;
                                }
                                if ((var77 - var73 > 0.5F)) {
                                    var80 = 1;
                                    var77--;
                                } else if (var73 - var77 > 0.5F) {
                                    var80 = 2;
                                    var77++;
                                }
                            } else {
                                if (var78 - var74 > 0.5F) {
                                    var80 = 1;
                                    var78--;
                                } else if (var74 - var78 > 0.5F) {
                                    var80 = 2;
                                    var78++;
                                }
                                if (var76 - var74 > 0.5F) {
                                    var76--;
                                    var79 = 1;
                                } else if (var74 - var76 > 0.5F) {
                                    var79 = 2;
                                    var76++;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field7245 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field7245[var68];
            }
            if (var146 == 0) {
                long var150 = ((long) (var69 << 8) + (long) (var81 << 24) + (long) var72 << 32) + (long) (var71 << 2);
                short var152 = arg1.field7248[var68];
                short var153 = arg1.field7216[var68];
                short var154 = arg1.field7220[var68];
                class20 var155 = var13[var152];
                this.field6004[var52] = this.method2443(var155.field290, var73, var155.field289, var155.field293, var74, var150, (byte) 57, var152, arg1, var155.field291);
                class20 var156 = var13[var153];
                this.field5948[var52] = this.method2443(var156.field290, var75, var156.field289, var156.field293, var76, (long) var79 + var150, (byte) 57, var153, arg1, var156.field291);
                class20 var157 = var13[var154];
                this.field6011[var52] = this.method2443(var157.field290, var77, var157.field289, var157.field293, var78, (long) var80 + var150, (byte) 57, var154, arg1, var157.field291);
            } else if (var146 == 1) {
                class347 var147 = var50[var68];
                long var148 = ((long) (var81 << 24) + ((long) (var69 << 8)) + ((long) var72) << 32) + (long) ((var147.field4991 + 256 << 12) + (var147.field4987 > 0 ? 1024 : 2048) + ((var71 << 2) - -(var147.field4986 + 256 << 22)));
                this.field6004[var52] = this.method2443(var147.field4991, var73, var147.field4987, var147.field4986, var74, var148, (byte) 57, arg1.field7248[var68], arg1, 0);
                this.field5948[var52] = this.method2443(var147.field4991, var75, var147.field4987, var147.field4986, var76, (long) var79 + var148, (byte) 57, arg1.field7216[var68], arg1, 0);
                this.field6011[var52] = this.method2443(var147.field4991, var77, var147.field4987, var147.field4986, var78, (long) var80 + var148, (byte) 57, arg1.field7220[var68], arg1, 0);
            }
            if (arg1.field7244 == null) {
                this.field5961[var52] = -1;
            } else {
                this.field5961[var52] = arg1.field7244[var68];
            }
            if (arg1.field7255 != null) {
                this.field5981[var52] = arg1.field7255[var68];
            }
            if (arg1.field7246 != null) {
                this.field6022[var52] = arg1.field7246[var68];
            }
            this.field5984[var52] = arg1.field7251[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field5951; var55++) {
            short var67 = this.field5961[var55];
            if (var54 != var67) {
                var54 = var67;
                var53++;
            }
        }
        this.field5970 = new int[var53 + 1];
        int var56 = 0;
        short var57 = -10000;
        for (int var58 = 0; var58 < this.field5951; var58++) {
            short var66 = this.field5961[var58];
            if (var57 != var66) {
                var57 = var66;
                this.field5970[var56++] = var58;
            }
        }
        this.field5970[var56] = this.field5951;
        class509.field7435 = null;
        this.field5960 = class107.method823(this.field5985, (byte) -95, this.field5960);
        this.field5992 = class107.method823(this.field5985, (byte) -95, this.field5992);
        this.field5986 = class107.method823(this.field5985, (byte) -95, this.field5986);
        this.field5946 = class286.method1642(this.field5985, this.field5946, -62);
        this.field5968 = class431.method2561(this.field5968, this.field5985, -21311);
        this.field5983 = class431.method2561(this.field5983, this.field5985, -21311);
        if (arg1.field7264 != null && class213.method1347(arg2, (byte) 122, this.field5916)) {
            this.field5914 = arg1.method2937(true);
        }
        if (arg1.field7238 != null && class512.method3037(103, arg2, this.field5916)) {
            this.field5917 = arg1.method2933(110);
        }
        if (arg1.field7210 != null && class16.method107(arg2, (byte) -69, this.field5916)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field5974; var61++) {
                int var65 = arg1.field7210[var8[var61]];
                if (var65 >= 0) {
                    if (var65 > var59) {
                        var59 = var65;
                    }
                    int var10002 = var60[var65]++;
                }
            }
            this.field6009 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field6009[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field5974; var63++) {
                int var64 = arg1.field7210[var8[var63]];
                if (var64 >= 0) {
                    this.field6009[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    static {
        new class157("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field6024 = new class439();
        field6026 = true;
    }
}
