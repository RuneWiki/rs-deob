import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wu")
public class class393 extends class232 {

    @OriginalMember(owner = "client!wu", name = "R", descriptor = "I")
    private int field6259 = 0;

    @OriginalMember(owner = "client!wu", name = "O", descriptor = "I")
    private int field6262 = 4096;

    @OriginalMember(owner = "client!wu", name = "G", descriptor = "[Ljava/lang/String;")
    private static final String[] field6263 = new String[] { method3196(method3195("R\u001e_\u0003r")), method3196(method3195("R\u001e_\u0004r")), method3196(method3195("^E_l'")), method3196(method3195("R\u001e_\u0007r")), method3196(method3195("K\u001e\u001d.")), method3196(method3195("R\u001e_\tr")), method3196(method3195("R\u001e_\u000er")), method3196(method3195("R\u001e_\br")) };

    @OriginalMember(owner = "client!wu", name = "K", descriptor = "I")
    public static int field6255 = -1;

    @OriginalMember(owner = "client!wu", name = "Q", descriptor = "I")
    public static int field6250 = 0;

    @OriginalMember(owner = "client!wu", name = "N", descriptor = "I")
    public static int field6253 = 0;

    @OriginalMember(owner = "client!wu", name = "J", descriptor = "I")
    public static int field6251;

    @OriginalMember(owner = "client!wu", name = "I", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!wu", name = "P", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!wu", name = "L", descriptor = "I")
    public static int field6257;

    @OriginalMember(owner = "client!wu", name = "T", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!wu", name = "M", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!wu", name = "H", descriptor = "Ltga;")
    public static class61 field6256;

    @OriginalMember(owner = "client!wu", name = "S", descriptor = "[[[Lgf;")
    public static class290[][][] field6261;

    @OriginalMember(owner = "client!wu", name = "b", descriptor = "(B)V")
    public static void method3190(byte arg0) {
        try {
            if (arg0 != 47) {
                field6256 = null;
            }
            field6256 = null;
            field6261 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6263[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(ILwq;I)V")
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            if (arg0 > 96) {
                if (~arg2 != -1) {
                    if (arg2 == 1) {
                        this.field6262 = arg1.method1687((byte) -60);
                    }
                } else {
                    this.field6259 = arg1.method1687((byte) -79);
                }
                ++field6260;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6263[3] + arg0 + ',' + (arg1 != null ? field6263[2] : field6263[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wu", name = "d", descriptor = "(I)V")
    public static final void method3191(int arg0) {
        try {
            class52.field639 = null;
            ++field6257;
            class620.field8951 = null;
            if (arg0 != 9260) {
                field6255 = -43;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6263[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wu", name = "c", descriptor = "(B)V")
    public static final void method3192(byte arg0) {
        try {
            ++field6254;
            for (int var1 = 0; ~var1 > -6; ++var1) {
                class576.field8309[var1] = false;
            }
            class346.field5619 = class431.field6776;
            int var2 = -101 % ((arg0 - 81) / 35);
            class497.field7466 = -1;
            class445.field6925 = 0;
            class740.field10885 = 0;
            class154.field2149 = class134.field1902;
            class401.field6334 = 5;
            class423.field6670 = class396.field6285;
            class210.field3323 = -1;
            class344.field5593 = -1;
            class571.field8274 = class133.field1896;
            class233.field3611 = -1;
            class347.field5634 = class728.field10661;
            class741.field10914 = class791.field11550;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6263[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "()V")
    public static final void method3193() {
        for (int var0 = class103.field1521; var0 < class612.field8806; ++var0) {
            for (int var1 = 0; var1 < class150.field2096; ++var1) {
                for (int var2 = 0; var2 < class117.field1705; ++var2) {
                    class290 var3 = class85.field1280[var0][var1][var2];
                    if (var3 != null) {
                        class350 var4 = var3.field4684;
                        class350 var5 = var3.field4678;
                        if (var4 != null && var4.method53(47)) {
                            class524.method3916(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method53(47)) {
                                class524.method3916(var5, var0, var1, var2, 1, 1);
                                var5.method48(false, 0, class120.field1734, 0, var4, -83, 0);
                                var5.method50((byte) -68);
                            }
                            var4.method50((byte) -99);
                        }
                        for (class135 var6 = var3.field4670; var6 != null; var6 = var6.field1912) {
                            class185 var8 = var6.field1911;
                            if (var8 != null && var8.method53(47)) {
                                class524.method3916(var8, var0, var1, var2, var8.field2940 - var8.field2945 + 1, var8.field2939 - var8.field2946 + 1);
                                var8.method50((byte) -110);
                            }
                        }
                        class513 var7 = var3.field4677;
                        if (var7 != null && var7.method53(47)) {
                            class30.method311(var7, var0, var1, var2);
                            var7.method50((byte) -106);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wu", name = "<init>", descriptor = "()V")
    public class393() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IIIIII)V")
    public static final void method3194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            ++field6251;
            if (arg3 == arg5) {
                class487.method3701((byte) 73, arg0, arg1, arg2, arg5);
            } else {
                if (class546.field8030 <= -arg5 + arg0 && arg0 + arg5 <= class779.field11374 && ~class310.field5088 >= ~(-arg3 + arg2) && ~(arg2 + arg3) >= ~class478.field7264) {
                    class9.method71(arg0, (byte) -108, arg3, arg1, arg5, arg2);
                } else {
                    class233.method2030(37, arg5, arg2, arg1, arg0, arg3);
                }
                if (arg4 != 0) {
                    field6256 = null;
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field6263[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!wu", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        try {
            ++field6252;
            if (arg1 != 123) {
                method3192((byte) -102);
            }
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (super.field3601.field6907) {
                int[] var4 = this.method2022(arg0, 0, arg1 + -123);
                for (int var5 = 0; ~class449.field6969 < ~var5; ++var5) {
                    int var6 = var4[var5];
                    var3[var5] = ~var6 <= ~this.field6259 && this.field6262 >= var6 ? 4096 : 0;
                }
            }
            return var3;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field6263[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3195(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 90);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3196(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 37;
                    break;
                case 1:
                    var10005 = 107;
                    break;
                case 2:
                    var10005 = 113;
                    break;
                case 3:
                    var10005 = 66;
                    break;
                default:
                    var10005 = 90;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
