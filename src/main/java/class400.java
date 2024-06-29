import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class400 {

    @OriginalMember(owner = "client!so", name = "c", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field5697;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "Lni;")
    private class444 field5699;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field5704;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "Lef;")
    private class414 field5700;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "Luca;")
    private class437 field5707;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "Ldv;")
    public static class566 field5695 = new class566(55, -1);

    @OriginalMember(owner = "client!so", name = "d", descriptor = "F")
    public static float field5698;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!so", name = "p", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "Ldaa;")
    private class11 field5706;

    @OriginalMember(owner = "client!so", name = "n", descriptor = "Ldj;")
    public static class288 field5708;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "[Liw;")
    private class263[] field5703;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)Z")
    public final boolean method2389(byte arg0) {
        field5710++;
        if (this.field5706 != null) {
            return true;
        }
        if (this.field5707 == null) {
            if (this.field5700.method2492(true)) {
                return false;
            }
            this.field5707 = this.field5700.method2481(true, 255, 7126, (byte) 0, 255);
        }
        if (this.field5707.field792) {
            return false;
        }
        class11 var2 = new class11(this.field5707.method410(14));
        var2.field165 = 5;
        int var3 = var2.method110((byte) 41);
        var2.field165 += var3 * 72;
        byte[] var4 = new byte[var2.field138.length - var2.field165];
        int var5 = 107 % ((arg0 - 67) / 38);
        var2.method75(0, var4.length, (byte) 120, var4);
        byte[] var8;
        if (this.field5697 == null || this.field5704 == null) {
            var8 = var4;
        } else {
            BigInteger var6 = new BigInteger(var4);
            BigInteger var7 = var6.modPow(this.field5697, this.field5704);
            var8 = var7.toByteArray();
        }
        if (var8.length != 65) {
            throw new RuntimeException();
        }
        byte[] var9 = class219.method1417(5, var2.field165 - var4.length - 5, false, var2.field138);
        for (int var10 = 0; var10 < 64; var10++) {
            if (var8[var10 + 1] != var9[var10]) {
                throw new RuntimeException();
            }
        }
        this.field5706 = var2;
        this.field5703 = new class263[var3];
        return true;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Loba;Loba;IIZ)Liw;")
    private final class263 method2390(class219 arg0, class219 arg1, int arg2, int arg3, boolean arg4) {
        field5702++;
        if (this.field5706 == null) {
            throw new RuntimeException();
        } else if (arg2 < 0 || this.field5703.length <= arg2) {
            throw new RuntimeException();
        } else if (this.field5703[arg2] == null) {
            this.field5706.field165 = arg2 * 72 + 6;
            int var6 = this.field5706.method119(-74);
            int var7 = this.field5706.method119(-109);
            byte[] var8 = new byte[64];
            this.field5706.method75(0, 64, (byte) 110, var8);
            class263 var9 = new class263(arg2, arg1, arg0, this.field5700, this.field5699, var6, var8, var7, arg4);
            if (arg3 == -18885) {
                this.field5703[arg2] = var9;
                return var9;
            } else {
                return null;
            }
        } else {
            return this.field5703[arg2];
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Loba;ZILoba;)Liw;")
    public final class263 method2391(class219 arg0, boolean arg1, int arg2, class219 arg3) {
        if (arg1) {
            this.method2391(null, true, -75, null);
        }
        field5705++;
        return this.method2390(arg3, arg0, arg2, -18885, true);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
    public static void method2392(int arg0) {
        field5708 = null;
        field5695 = null;
        if (arg0 <= 122) {
            field5708 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(III)B")
    public static final byte method2393(int arg0, int arg1, int arg2) {
        if (arg1 != 5) {
            return 45;
        }
        field5701++;
        if (arg2 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lef;Lni;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class400(class414 arg0, class444 arg1, BigInteger arg2, BigInteger arg3) {
        this.field5697 = arg2;
        this.field5699 = arg1;
        this.field5704 = arg3;
        this.field5700 = arg0;
        if (!this.field5700.method2492(true)) {
            this.field5707 = this.field5700.method2481(true, 255, 7126, (byte) 0, 255);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method2394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class277.field3830[arg0][var8][var14] == -class439.field6235) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class272.field3786) + 1;
            int var10 = (arg3 << class272.field3786) + 2;
            int var11 = class590.field8430[arg0].method1104(arg1, arg3) + arg5;
            if (!class239.method1492(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class272.field3786) - 1;
            if (!class239.method1492(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class272.field3786) - 1;
            if (!class239.method1492(var9, var11, var13)) {
                return false;
            } else if (class239.method1492(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class427.method2538(arg0, arg1, arg3)) {
            int var6 = arg1 << class272.field3786;
            int var7 = arg3 << class272.field3786;
            return class239.method1492(var6 + 1, class590.field8430[arg0].method1104(arg1, arg3) + arg5, var7 + 1) && class239.method1492(class41.field808 + var6 - 1, class590.field8430[arg0].method1104(arg1 + 1, arg3) + arg5, var7 + 1) && class239.method1492(class41.field808 + var6 - 1, class590.field8430[arg0].method1104(arg1 + 1, arg3 + 1) + arg5, class41.field808 + var7 - 1) && class239.method1492(var6 + 1, class590.field8430[arg0].method1104(arg1, arg3 + 1) + arg5, class41.field808 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IZ)V")
    public static final void method2395(int arg0, boolean arg1) {
        field5696++;
        class314 var2 = class483.method2819(2, arg0, 21303);
        if (!arg1) {
            method2395(-110, true);
        }
        var2.method1962((byte) 0);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Z)V")
    public final void method2396(boolean arg0) {
        field5709++;
        if (this.field5703 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field5703.length; var2++) {
            if (this.field5703[var2] != null) {
                this.field5703[var2].method1716((byte) 109);
            }
        }
        if (arg0) {
            return;
        }
        for (int var3 = 0; var3 < this.field5703.length; var3++) {
            if (this.field5703[var3] != null) {
                this.field5703[var3].method1723((byte) -1);
            }
        }
    }
}
