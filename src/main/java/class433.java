import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class433 {

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field6798;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field6802;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "Lmo;")
    private class783 field6797;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "Lqh;")
    private class72 field6801;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "Lsv;")
    private class689 field6805;

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6808 = new String[] { method3427(method3426("N\u000f\u001c\\*")), method3427(method3426("GL\u001c3\u007f")), method3427(method3426("R\u0017^q")), method3427(method3426("N\u000f\u001c_*")), method3427(method3426("N\u000f\u001cX*")), method3427(method3426("N\u000f\u001cY*")), method3427(method3426("N\u000f\u001c^*")), method3427(method3426("N\u000f\u001c!kR\u000bF#*")), method3427(method3426("N\u000f\u001c[*")) };

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "[I")
    public static int[] field6794 = new int[256];

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "Lvn;")
    public static class330 field6806;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "[I")
    public static int[] field6807;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field6793;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field6796;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field6799;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public static int field6800;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "Lhk;")
    public static class107 field6804;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "Lwq;")
    private class176 field6803;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "[Ltf;")
    private class310[] field6792;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V")
    public static final void method3420(int arg0) {
        try {
            field6796++;
            class449.field6964 = new class259(8);
            class393.field6253 = 0;
            if (arg0 == 6) {
                for (class92 var1 = (class92) class440.field6871.method749(0); var1 != null; var1 = (class92) class440.field6871.method747((byte) 21)) {
                    var1.method906();
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6808[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ldca;ZILdca;I)Ltf;")
    private final class310 method3421(class186 arg0, boolean arg1, int arg2, class186 arg3, int arg4) {
        try {
            field6795++;
            if (this.field6803 == null) {
                throw new RuntimeException();
            } else if (arg2 < 0 || this.field6792.length <= arg2) {
                throw new RuntimeException();
            } else if (this.field6792[arg2] == null) {
                this.field6803.field2799 = arg2 * 72 + 6;
                int var6 = this.field6803.method1622(arg4 ^ 0xFFFFB617);
                int var7 = this.field6803.method1622(-18712);
                byte[] var8 = new byte[64];
                if (arg4 != 255) {
                    method3420(22);
                }
                this.field6803.method1651(var8, arg4 - 127, 0, 64);
                class310 var9 = new class310(arg2, arg3, arg0, this.field6797, this.field6801, var6, var8, var7, arg1);
                this.field6792[arg2] = var9;
                return var9;
            } else {
                return this.field6792[arg2];
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field6808[3] + (arg0 == null ? field6808[2] : field6808[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field6808[2] : field6808[1]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILdca;Ldca;B)Ltf;")
    public final class310 method3422(int arg0, class186 arg1, class186 arg2, byte arg3) {
        try {
            int var5 = -86 / ((arg3 - 52) / 62);
            field6800++;
            return this.method3421(arg2, true, arg0, arg1, 255);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6808[5] + arg0 + ',' + (arg1 == null ? field6808[2] : field6808[1]) + ',' + (arg2 == null ? field6808[2] : field6808[1]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Z)V")
    public final void method3423(boolean arg0) {
        try {
            field6793++;
            if (this.field6792 != null) {
                if (!arg0) {
                    this.method3422(112, null, null, (byte) -107);
                }
                for (int var2 = 0; var2 < this.field6792.length; var2++) {
                    if (this.field6792[var2] != null) {
                        this.field6792[var2].method2664(!arg0);
                    }
                }
                for (int var3 = 0; var3 < this.field6792.length; var3++) {
                    if (this.field6792[var3] != null) {
                        this.field6792[var3].method2660(-114);
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6808[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)V")
    public static void method3424(int arg0) {
        try {
            field6794 = null;
            field6804 = null;
            if (arg0 >= 22) {
                field6807 = null;
                field6806 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6808[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)Z")
    public final boolean method3425(int arg0) {
        try {
            field6799++;
            if (this.field6803 != null) {
                return true;
            }
            if (this.field6805 == null) {
                if (this.field6797.method5630(-29571)) {
                    return false;
                }
                this.field6805 = this.field6797.method5623(255, 6, (byte) 0, 255, true);
            }
            if (this.field6805.field11246) {
                return false;
            }
            int var2 = 19 / ((arg0 - 9) / 42);
            class176 var3 = new class176(this.field6805.method4228(true));
            var3.field2799 = 5;
            int var4 = var3.method1645((byte) -100);
            var3.field2799 += var4 * 72;
            byte[] var5 = new byte[var3.field2805.length - var3.field2799];
            var3.method1651(var5, 128, 0, var5.length);
            byte[] var6;
            if (this.field6802 == null || this.field6798 == null) {
                var6 = var5;
            } else {
                BigInteger var7 = new BigInteger(var5);
                BigInteger var8 = var7.modPow(this.field6802, this.field6798);
                var6 = var8.toByteArray();
            }
            if (var6.length != 65) {
                throw new RuntimeException();
            }
            byte[] var9 = class198.method1816((byte) -81, var3.field2799 - var5.length - 5, var3.field2805, 5);
            for (int var10 = 0; var10 < 64; var10++) {
                if (var6[var10 + 1] != var9[var10]) {
                    throw new RuntimeException();
                }
            }
            this.field6792 = new class310[var4];
            this.field6803 = var3;
            return true;
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field6808[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "(Lmo;Lqh;Ljava/math/BigInteger;Ljava/math/BigInteger;)V")
    public class433(class783 arg0, class72 arg1, BigInteger arg2, BigInteger arg3) {
        try {
            this.field6798 = arg3;
            this.field6802 = arg2;
            this.field6797 = arg0;
            this.field6801 = arg1;
            if (!this.field6797.method5630(-29571)) {
                this.field6805 = this.field6797.method5623(255, 6, (byte) 0, 255, true);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6808[7] + (arg0 == null ? field6808[2] : field6808[1]) + ',' + (arg1 == null ? field6808[2] : field6808[1]) + ',' + (arg2 == null ? field6808[2] : field6808[1]) + ',' + (arg3 == null ? field6808[2] : field6808[1]) + ')');
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field6794[var0] = var1;
        }
        field6806 = new class330(40, 6);
        field6807 = new int[1000];
    }

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3426(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x2);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3427(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 60;
                    break;
                case 1:
                    var10005 = 98;
                    break;
                case 2:
                    var10005 = 50;
                    break;
                case 3:
                    var10005 = 29;
                    break;
                default:
                    var10005 = 2;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
