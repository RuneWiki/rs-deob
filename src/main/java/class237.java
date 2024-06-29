import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public abstract class class237 implements class175 {

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "Lgda;")
    public class58 field3645;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "Lgda;")
    private class58 field3641;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "Lgm;")
    public class131 field3648;

    @OriginalMember(owner = "client!rt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3651 = new String[] { method2051(method2050(",C\f\u0018q")), method2051(method2050("~\u001f")), method2051(method2050(",C\f\u001bq")), method2051(method2050(",C\f\u001aq")), method2051(method2050(",C\fe00^Vgq")), method2051(method2050("0BN5")), method2051(method2050("%\u0019\fw$")), method2051(method2050(",C\f\u001eq")), method2051(method2050(",C\f\u001dq")) };

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "Z")
    public static boolean field3642 = false;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "I")
    private int field3647;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "J")
    private long field3639;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "Lda;")
    private class64 field3646;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)I")
    public final int method2048(int arg0) {
        try {
            field3637++;
            if (arg0 < 105) {
                return 39;
            }
            int var2 = class355.field5711.method4921(60);
            int var3 = var2 * 100;
            if (this.field3647 == var2 && var2 != 0) {
                int var4 = class355.field5711.method4928((byte) -126);
                if (var2 < var4) {
                    long var5 = this.field3639 - class355.field5711.method4931(0);
                    if (var5 > 0L) {
                        long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                        long var9 = (class712.method5167(-2334) - this.field3639) * 10000L;
                        if (var7 <= var9) {
                            var3 = var4 * 100;
                        } else {
                            var3 = (int) ((long) (var4 - var2) * var9 * 100L / var7 + ((long) (var2 * 100)));
                        }
                    }
                }
            } else {
                this.field3647 = var2;
                this.field3639 = class712.method5167(-2334);
            }
            return var3;
        } catch (RuntimeException var12) {
            throw class590.method4333(var12, field3651[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIIZ)V")
    public abstract void method460(int arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)Z")
    public boolean method457(byte arg0) {
        try {
            field3644++;
            if (arg0 <= 9) {
                this.method460(41, -75, 56, true);
            }
            boolean var2 = true;
            if (!this.field3645.method595(-2, this.field3648.field1877)) {
                var2 = false;
            }
            if (!this.field3641.method595(-2, this.field3648.field1877)) {
                var2 = false;
            }
            return var2;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3651[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIILdq;II)V")
    public static final void method2049(int arg0, int arg1, int arg2, class729 arg3, int arg4, int arg5) {
        try {
            field3650++;
            if (arg5 != 100) {
                method2049(9, -78, -25, null, 91, -18);
            }
            class10 var6 = null;
            for (class10 var7 = (class10) class344.field5596.method3228(11); var7 != null; var7 = (class10) class344.field5596.method3216(true)) {
                if (var7.field120 == arg2 && var7.field114 == arg4 && var7.field116 == arg1 && var7.field110 == arg0) {
                    var6 = var7;
                    break;
                }
            }
            if (var6 == null) {
                var6 = new class10();
                var6.field120 = arg2;
                var6.field110 = arg0;
                var6.field114 = arg4;
                var6.field116 = arg1;
                class344.field5596.method3220(var6, arg5 - 100);
            }
            var6.field118 = arg3;
            var6.field122 = true;
            var6.field117 = false;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field3651[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field3651[5] : field3651[6]) + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IZII)V")
    public abstract void method458(int arg0, boolean arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ZZ)V")
    public final void method1618(boolean arg0, boolean arg1) {
        try {
            field3638++;
            int var3 = this.field3648.field1875.method4806(class696.field10028, this.field3648.field1869, -113) + this.field3648.field1872;
            int var4 = this.field3648.field1865.method4833(this.field3648.field1862, class518.field7672, (byte) 84) + this.field3648.field1874;
            if (!arg0) {
                this.field3647 = -37;
            }
            this.method460(var3, var4, -64, arg1);
            this.method458(var4, arg1, 2, var3);
            String var5 = class355.field5711.method4926(-17786);
            if (class712.method5167(-2334) - this.field3639 > 10000L) {
                var5 = var5 + field3651[1] + class355.field5711.method4929(false).method4937(100) + ")";
            }
            this.field3646.method680(this.field3648.field1862 / 2 + var4 + this.field3648.field1859 + 4, (byte) -78, -1, var3 + (this.field3648.field1869 / 2), this.field3648.field1870, var5);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3651[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lgda;Lgda;Lgm;)V")
    public class237(class58 arg0, class58 arg1, class131 arg2) {
        try {
            this.field3645 = arg0;
            this.field3641 = arg1;
            this.field3648 = arg2;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3651[4] + (arg0 == null ? field3651[5] : field3651[6]) + ',' + (arg1 == null ? field3651[5] : field3651[6]) + ',' + (arg2 == null ? field3651[5] : field3651[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(B)V")
    public void method459(byte arg0) {
        try {
            field3649++;
            class49 var2 = class570.method4197(this.field3641, (byte) 41, this.field3648.field1877);
            if (arg0 == -13) {
                this.field3646 = class662.field9437.method184(var2, class174.method1603(this.field3645, this.field3648.field1877), true);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3651[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2050(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x59);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2051(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 94;
                    break;
                case 1:
                    var10005 = 55;
                    break;
                case 2:
                    var10005 = 34;
                    break;
                case 3:
                    var10005 = 89;
                    break;
                default:
                    var10005 = 89;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
