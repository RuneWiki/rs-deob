import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class693 extends class38 {

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "[Ljava/lang/String;")
    private static final String[] field10129 = new String[] { method5070(method5069("\u0011&0YC")), method5070(method5069("\u001fi03\u0016")), method5070(method5069("\u0011&0_C")), method5070(method5069("\n2rq")), method5070(method5069("\u0011&0^C")), method5070(method5069("\u0011&0XC")), method5070(method5069("\u0011&0\\C")) };

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "Lmm;")
    public static class293 field10124 = new class293();

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    public static int field10123;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "I")
    public static int field10126;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    public static int field10127;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field10128;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "[B")
    private byte[] field10125;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lhaa;Z[[B)V", line = 4)
    public static final void method5065(class89 arg0, boolean arg1, byte[][] arg2) {
        try {
            field10127++;
            int[] var3 = new int[] { -1, 0, 0, 0, 0 };
            if (!arg1) {
                field10124 = null;
            }
            for (int var4 = 0; var4 < arg0.field6419; var4++) {
                class318.method2691(1);
                for (int var5 = 0; var5 < (class648.field9378 >> 3); var5++) {
                    for (int var6 = 0; var6 < (class659.field9506 >> 3); var6++) {
                        int var7 = class138.field1642[var4][var5][var6];
                        if (var7 != -1) {
                            int var8 = (var7 & 0x3F3A51E) >> 24;
                            if (!arg0.field6424 || var8 == 0) {
                                int var9 = var7 >> 1 & 0x3;
                                int var10 = var7 >> 14 & 0x3FF;
                                int var11 = var7 >> 3 & 0x7FF;
                                int var12 = (var10 / 8 << 8) + (var11 / 8);
                                for (int var13 = 0; var13 < class752.field10938.length; var13++) {
                                    if (class752.field10938[var13] == var12 && arg2[var13] != null) {
                                        class163 var14 = new class163(arg2[var13]);
                                        arg0.method3355(var8, var6 * 8, var4, 64, var11, var5 * 8, var9, var10, class429.field6298, var14);
                                        arg0.method762(var11, var5 * 8, 44, var6 * 8, var8, var4, class610.field8913, var9, var10, var14, var3[0] == -1 ? var3 : null);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            for (int var15 = 0; var15 < arg0.field6419; var15++) {
                class318.method2691(1);
                for (int var16 = 0; var16 < class648.field9378 >> 3; var16++) {
                    for (int var17 = 0; var17 < (class659.field9506 >> 3); var17++) {
                        int var18 = class138.field1642[var15][var16][var17];
                        if (var18 == -1) {
                            arg0.method3352(8, (byte) 87, var17 * 8, var15, 8, var16 * 8);
                        }
                    }
                }
            }
            if (var3[0] != -1) {
                class492.field7061 = class596.field8739.method946(var3[2], -29424, var3[3], var3[1], var3[0], class13.field162);
                class559.field8329 = var3[4];
            }
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field10129[2] + (arg0 == null ? field10129[3] : field10129[1]) + ',' + arg1 + ',' + (arg2 == null ? field10129[3] : field10129[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(JZ)V", line = 118)
    public static final void method5066(long arg0, boolean arg1) {
        try {
            field10128++;
            class555.field8270.setTime(new Date(arg0));
            if (!arg1) {
                field10124 = null;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field10129[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIII)[B", line = 135)
    public final byte[] method5067(int arg0, int arg1, int arg2, int arg3) {
        try {
            this.field10125 = new byte[arg1 * arg2 * arg3 * 2];
            field10123++;
            this.method1867(arg2, arg3, arg1, (byte) -92);
            if (arg0 < 99) {
                field10124 = null;
            }
            return this.field10125;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field10129[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 151)
    public class693() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V", line = 157)
    public static void method5068(boolean arg0) {
        try {
            field10124 = null;
            if (arg0) {
                method5065(null, true, null);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10129[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBB)V", line = 167)
    public final void method254(int arg0, byte arg1, byte arg2) {
        try {
            field10126++;
            int var4 = arg0 * 2;
            int var5 = arg1 & 0xFF;
            if (arg2 != 14) {
                field10124 = null;
            }
            this.field10125[var4++] = (byte) (var5 * 3 >> 5);
            this.field10125[var4] = (byte) (var5 * 3 >> 5);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field10129[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5069(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5070(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 100;
                    break;
                case 1:
                    var10005 = 71;
                    break;
                case 2:
                    var10005 = 30;
                    break;
                case 3:
                    var10005 = 29;
                    break;
                default:
                    var10005 = 107;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
