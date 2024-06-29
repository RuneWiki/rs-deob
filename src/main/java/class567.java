import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class567 {

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    public int field8244 = -1;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8245 = new String[] { method4169(method4168("\u000b%rX\b")), method4169(method4168("\u001390v")), method4169(method4168("\u000b%r[\b")), method4169(method4168("\u0006br4]")) };

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "J")
    public static long field8239 = 0L;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "[I")
    public static int[] field8240 = new int[8];

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    public static int field8241;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "Lkca;")
    public class88 field8242;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "[I")
    public int[] field8243;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "[J")
    public long[] field8237;

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "[Ljava/lang/String;")
    public String[] field8238;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V", line = 8)
    public static void method4166(byte arg0) {
        try {
            int var1 = 125 / ((53 - arg0) / 38);
            field8240 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field8245[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZBLha;Lkaa;Ljava/lang/String;Lda;)V", line = 17)
    public static final void method4167(boolean arg0, byte arg1, class63 arg2, class49 arg3, String arg4, class64 arg5) {
        try {
            if (arg1 <= 115) {
                field8240 = null;
            }
            field8241++;
            boolean var6 = !class317.field5176 || class375.method3088(16);
            if (var6) {
                if (class317.field5176 && var6) {
                    class49 var23 = class734.field10764;
                    class64 var24 = arg2.method184(var23, class397.field6288, true);
                    int var12 = var23.method504(arg4, 250, -8055, null);
                    int var13 = var23.method505(arg4, -1, null, 250, var23.field584);
                    int var14 = class347.field5632.field2781;
                    int var15 = var14 + 4;
                    int var16 = var15 * 2 + var12;
                    int var17 = var15 * 2 + var13;
                    if (var17 < class22.field215) {
                        var17 = class22.field215;
                    }
                    if (class237.field3640 > var16) {
                        var16 = class237.field3640;
                    }
                    int var18 = class612.field8808.method4806(class696.field10028, var16, -124) + class83.field1256;
                    int var19 = class795.field11623.method4833(var17, class518.field7672, (byte) 84) + class50.field596;
                    if (class316.field5141) {
                        var18 += class50.method516(false);
                        var19 += class568.method4171(0);
                    }
                    arg2.method213(class43.field480, false).method21(var18 + class721.field10567.field2781, class721.field10567.field2782 + var19, var16 - (class721.field10567.field2781 * 2), var17 - class721.field10567.field2782 * 2, 1, 0, 0);
                    arg2.method213(class721.field10567, true).method1001(var18, var19);
                    class721.field10567.method1606();
                    arg2.method213(class721.field10567, true).method1001(var18 + var16 - var14, var19);
                    class721.field10567.method1614();
                    arg2.method213(class721.field10567, true).method1001(var16 + var18 - var14, var19 - -var17 + -var14);
                    class721.field10567.method1606();
                    arg2.method213(class721.field10567, true).method1001(var18, var17 + var19 - var14);
                    class721.field10567.method1614();
                    arg2.method213(class347.field5632, true).method1002(var18, class721.field10567.field2782 + var19, var14, var17 - (class721.field10567.field2782 * 2));
                    class347.field5632.method1616();
                    arg2.method213(class347.field5632, true).method1002(class721.field10567.field2781 + var18, var19, var16 - class721.field10567.field2781 * 2, var14);
                    class347.field5632.method1616();
                    arg2.method213(class347.field5632, true).method1002(var18 + var16 - var14, class721.field10567.field2782 + var19, var14, var17 - class721.field10567.field2782 * 2);
                    class347.field5632.method1616();
                    arg2.method213(class347.field5632, true).method1002(class721.field10567.field2781 + var18, -var14 + var17 + var19, var16 - (class721.field10567.field2781 * 2), var14);
                    class347.field5632.method1616();
                    var24.method681((byte) -124, null, 1, 0, arg4, var17 - (var15 * 2), -(var15 * 2) + var16, class579.field8341 | 0xFF000000, var15 + var18, null, 0, -1, 0, null, 1, var15 + var19);
                    class481.method3669(var19, var17, var18, var16, 0);
                } else {
                    int var7 = arg3.method504(arg4, 250, -8055, null);
                    int var8 = arg3.method508(250, null, -6901, arg4) * 13;
                    byte var9 = 4;
                    int var10 = var9 + 6;
                    int var11 = var9 + 6;
                    arg2.method242(var10 - var9, -var9 + var11, var7 + var9 + var9, var8 + var9 + var9, -16777216, 0);
                    arg2.method208(var10 - var9, -var9 + var11, var7 - (-var9 - var9), var8 + var9 + var9, -1, 0);
                    arg5.method681((byte) -118, null, 1, 0, arg4, var8, var7, -1, var10, null, 0, -1, 0, null, 1, var11);
                    class481.method3669(var11 - var9, var8 + var9 - -var9, var10 - var9, var7 + var9 + var9, 0);
                }
                if (arg0) {
                    try {
                        if (class316.field5141) {
                            class1.method2((byte) -92);
                        } else {
                            arg2.method660(false);
                        }
                    } catch (class146 var21) {
                    }
                }
            }
        } catch (RuntimeException var22) {
            throw class590.method4333(var22, field8245[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field8245[1] : field8245[3]) + ',' + (arg3 == null ? field8245[1] : field8245[3]) + ',' + (arg4 == null ? field8245[1] : field8245[3]) + ',' + (arg5 == null ? field8245[1] : field8245[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4168(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x20);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4169(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 125;
                    break;
                case 1:
                    var10005 = 76;
                    break;
                case 2:
                    var10005 = 92;
                    break;
                case 3:
                    var10005 = 26;
                    break;
                default:
                    var10005 = 32;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
