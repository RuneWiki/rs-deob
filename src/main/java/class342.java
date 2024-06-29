import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class342 {

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "Loh;")
    private class680 field4700;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field4693;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "Lpt;")
    private class441 field4701;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field4702;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "Lwl;")
    private class184 field4696;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "Llc;")
    public static class435 field4703 = new class435(66, 1);

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "Lvg;")
    public static class186 field4705 = new class186();

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public static int field4704;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public static int field4707;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "Lsl;")
    private class479 field4690;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "Lvs;")
    public static class518 field4706;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "[Lrl;")
    private class230[] field4692;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILlp;ILlp;Z)Lrl;")
    private final class230 method2095(int arg0, class247 arg1, int arg2, class247 arg3, boolean arg4) {
        field4699++;
        if (this.field4690 == null) {
            throw new RuntimeException();
        } else if (arg0 < 0 || this.field4692.length <= arg0) {
            throw new RuntimeException();
        } else if (this.field4692[arg0] == null) {
            this.field4690.field6864 = arg0 * 72 + 6;
            int var6 = this.field4690.method2868(-75);
            int var7 = this.field4690.method2868(-36);
            byte[] var8 = new byte[arg2];
            this.field4690.method2867(-290150072, var8, 64, 0);
            class230 var9 = new class230(arg0, arg3, arg1, this.field4700, this.field4701, var6, var8, var7, arg4);
            this.field4692[arg0] = var9;
            return var9;
        } else {
            return this.field4692[arg0];
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public final void method2096(byte arg0) {
        field4695++;
        if (this.field4692 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field4692.length; var2++) {
            if (this.field4692[var2] != null) {
                this.field4692[var2].method1593((byte) 102);
            }
        }
        if (arg0 != -103) {
            field4703 = null;
        }
        for (int var3 = 0; var3 < this.field4692.length; var3++) {
            if (this.field4692[var3] != null) {
                this.field4692[var3].method1591((byte) -81);
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)Z")
    public final boolean method2097(int arg0) {
        field4698++;
        if (this.field4690 != null) {
            return true;
        }
        if (this.field4696 == null) {
            if (this.field4700.method3871(-63)) {
                return false;
            }
            this.field4696 = this.field4700.method3875((byte) 0, 255, true, 255, 20);
        }
        if (this.field4696.field9450) {
            return false;
        }
        class479 var2 = new class479(this.field4696.method1304(102));
        var2.field6864 = 5;
        int var3 = var2.method2886(true);
        var2.field6864 += var3 * 72;
        byte[] var4 = new byte[var2.field6800.length - var2.field6864];
        var2.method2867(-290150072, var4, var4.length, 0);
        byte[] var7;
        if (this.field4693 == null || this.field4702 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field4693, this.field4702);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class616.method3578(var2.field6864 - var4.length - 5, var2.field6800, 5, (byte) -124);
        int var9 = 0;
        if (arg0 < 61) {
            this.method2099(null, (byte) 90, -84, null);
        }
        while (var9 < 64) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
            var9++;
        }
        this.field4690 = var2;
        this.field4692 = new class230[var3];
        return true;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V")
    public static void method2098(byte arg0) {
        field4705 = null;
        field4703 = null;
        if (arg0 > 0) {
            field4703 = null;
        }
        field4706 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Llp;BILlp;)Lrl;")
    public final class230 method2099(class247 arg0, byte arg1, int arg2, class247 arg3) {
        if (arg1 != 4) {
            this.method2095(-78, null, -76, null, true);
        }
        field4694++;
        return this.method2095(arg2, arg3, 64, arg0, true);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(FFFIFIFF)F")
    public static final float method2100(float arg0, float arg1, float arg2, int arg3, float arg4, int arg5, float arg6, float arg7) {
        field4697++;
        int var8 = 19 / ((9 - arg5) / 60);
        float var9 = 0.0F;
        float var10 = arg0 - arg6;
        float var11 = arg2 - arg4;
        float var12 = arg7 - arg1;
        float var13 = 0.0F;
        float var14 = 0.0F;
        float var15 = 0.0F;
        while (var9 < 1.1F) {
            float var16 = var9 * var10 + arg6;
            float var17 = var9 * var11 + arg4;
            float var18 = var9 * var12 + arg1;
            int var19 = (int) var16 >> 9;
            int var20 = (int) var18 >> 9;
            if (var19 > 0 && var20 > 0 && class184.field2546 > var19 && var20 < class240.field3555) {
                int var21 = class108.field1536.field3920;
                if (var21 < 3 && (class160.field2297[1][var19][var20] & 0x2) != 0) {
                    var21++;
                }
                int var22 = class491.field7079[var21].method2089(26448, (int) var16, (int) var18);
                if ((float) var22 < var17) {
                    if (arg3 >= 2) {
                        return method2100(var16, var15, var17, arg3 - 1, var14, 84, var13, var18) * 0.1F + (var9 - 0.1F);
                    }
                    return var9;
                }
            }
            var13 = var16;
            var9 += 0.1F;
            var15 = var18;
            var14 = var17;
        }
        return -1.0F;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Loh;Lpt;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class342(class680 arg0, class441 arg1, BigInteger arg2, BigInteger arg3) {
        this.field4700 = arg0;
        this.field4693 = arg2;
        this.field4701 = arg1;
        this.field4702 = arg3;
        if (!this.field4700.method3871(-101)) {
            this.field4696 = this.field4700.method3875((byte) 0, 255, true, 255, 20);
        }
    }
}
