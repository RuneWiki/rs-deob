import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class413 {

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field5843;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field5842;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Llba;")
    private class504 field5844;

    @OriginalMember(owner = "client!ci", name = "m", descriptor = "Lnp;")
    private class451 field5852;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "Lpi;")
    private class458 field5851;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "Z")
    public static boolean field5848 = false;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field5845;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field5847;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "Ljr;")
    private class96 field5853;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "[Lcm;")
    private class668[] field5840;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public final void method2353(int arg0) {
        field5841++;
        if (this.field5840 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field5840.length; var2++) {
            if (this.field5840[var2] != null) {
                this.field5840[var2].method3703((byte) -77);
            }
        }
        if (arg0 != 64) {
            this.field5852 = null;
        }
        for (int var3 = 0; var3 < this.field5840.length; var3++) {
            if (this.field5840[var3] != null) {
                this.field5840[var3].method3704(21517);
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lfo;Lfo;IZZ)Lcm;")
    private final class668 method2354(class476 arg0, class476 arg1, int arg2, boolean arg3, boolean arg4) {
        field5849++;
        if (this.field5853 == null) {
            throw new RuntimeException();
        } else if (arg2 < 0 || arg2 >= this.field5840.length) {
            throw new RuntimeException();
        } else if (this.field5840[arg2] == null) {
            this.field5853.field1301 = arg2 * 72 + 6;
            int var6 = this.field5853.method714(arg3);
            int var7 = this.field5853.method714(false);
            byte[] var8 = new byte[64];
            this.field5853.method719(var8, 64, -7861, 0);
            class668 var9 = new class668(arg2, arg1, arg0, this.field5844, this.field5852, var6, var8, var7, arg4);
            this.field5840[arg2] = var9;
            return var9;
        } else {
            return this.field5840[arg2];
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)Lrg;")
    public static final class588 method2355(int arg0, int arg1) {
        field5846++;
        class588[] var2 = class220.method1419(1);
        int var3 = 38 / ((arg0 + 5) / 55);
        for (int var4 = 0; var4 < var2.length; var4++) {
            class588 var5 = var2[var4];
            if (var5.field8207 == arg1) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lfo;ZILfo;)Lcm;")
    public final class668 method2356(class476 arg0, boolean arg1, int arg2, class476 arg3) {
        field5847++;
        if (arg1) {
            this.field5842 = null;
        }
        return this.method2354(arg3, arg0, arg2, false, true);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)Z")
    public final boolean method2357(byte arg0) {
        field5850++;
        if (this.field5853 != null) {
            return true;
        }
        if (this.field5851 == null) {
            if (this.field5844.method2810(126)) {
                return false;
            }
            this.field5851 = this.field5844.method2811(255, true, true, 255, (byte) 0);
        }
        if (this.field5851.field9187) {
            return false;
        }
        class96 var2 = new class96(this.field5851.method2239(true));
        var2.field1301 = 5;
        if (arg0 >= -39) {
            this.method2357((byte) 17);
        }
        int var3 = var2.method718(-122);
        var2.field1301 += var3 * 72;
        byte[] var4 = new byte[var2.field1316.length - var2.field1301];
        var2.method719(var4, var4.length, -7861, 0);
        byte[] var7;
        if (this.field5843 == null || this.field5842 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field5843, this.field5842);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class424.method2405(var2.field1301 - var4.length - 5, var2.field1316, 5, -127);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field5853 = var2;
        this.field5840 = new class668[var3];
        return true;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III[FIII)V")
    public static final void method2358(int arg0, int arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6) {
        field5845++;
        if (arg6 > 0 && !class17.method89(arg6, arg4 ^ 0x1E4C9E6E)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class17.method89(arg0, arg4 + 508337774)) {
            int var7 = class418.method2386(arg4 - 6407, arg1);
            int var8 = arg4;
            int var9 = arg6 < arg0 ? arg6 : arg0;
            int var10 = arg6 >> 1;
            int var11 = arg0 >> 1;
            float[] var12 = arg3;
            float[] var13 = new float[var7 * var11 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg5, var8, arg2, arg6, arg0, 0, arg1, 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg6 * var7;
                float[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            float var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var13[var17] = var27 * 0.25F;
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                arg0 = var11;
                arg6 = var10;
                var12 = var15;
                var8++;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Llba;Lnp;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class413(class504 arg0, class451 arg1, BigInteger arg2, BigInteger arg3) {
        this.field5843 = arg2;
        this.field5842 = arg3;
        this.field5844 = arg0;
        this.field5852 = arg1;
        if (!this.field5844.method2810(124)) {
            this.field5851 = this.field5844.method2811(255, true, true, 255, (byte) 0);
        }
    }
}
