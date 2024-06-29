import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class543 extends class36 {

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
    private int field7991 = -1;

    @OriginalMember(owner = "client!cn", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7997 = new String[] { method4043(method4042("Z$\u000e\u0006")), method4043(method4042("O\u007fLD\u0010")), method4043(method4042("W?L.E")), method4043(method4042("W?L+E")), method4043(method4042("W?L(E")), method4043(method4042("W?L,E")), method4043(method4042("W?L-E")) };

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
    public static int field7989;

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public static int field7990;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
    public static int field7993;

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "I")
    public static int field7994;

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
    public static int field7996;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "Lha;")
    public static class63 field7992;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "[I")
    public static int[] field7995;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V", line = 5)
    public static void method4037(boolean arg0) {
        try {
            field7992 = null;
            field7995 = null;
            if (arg0) {
                field7995 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7997[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lwt;I)V", line = 18)
    public final void method359(class328 arg0, int arg1) {
        try {
            arg0.method2791(this.field7991, 0);
            field7989++;
            if (arg1 != 1984) {
                this.field7991 = 16;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7997[3] + (arg0 == null ? field7997[0] : field7997[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lwq;I)V", line = 30)
    public final void method361(class176 arg0, int arg1) {
        try {
            field7994++;
            this.field7991 = arg0.method1687((byte) -83);
            arg0.method1645((byte) -87);
            if (arg1 <= 0) {
                method4040(null);
            }
            if (arg0.method1645((byte) -85) != 255) {
                arg0.field2799--;
                arg0.method1658(-24862);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7997[2] + (arg0 == null ? field7997[0] : field7997[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 52)
    public static final void method4038(byte arg0) {
        try {
            if (arg0 != 104) {
                method4037(false);
            }
            class21.method137(arg0 - 96, false);
            field7993++;
            if (class313.field5122 >= 0 && class313.field5122 != 0) {
                class679.method4942(false, (byte) -110, class313.field5122);
                class313.field5122 = -1;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7997[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIIILlv;)V", line = 72)
    public static final void method4039(int arg0, int arg1, int arg2, int arg3, class471 arg4) {
        class290 var5 = class438.method3442(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        arg4.field9985 = (arg1 << class165.field2688) + class316.field5139;
        arg4.field9972 = arg3;
        arg4.field9983 = (arg2 << class165.field2688) + class316.field5139;
        var5.field4679 = arg4;
        int var6 = class757.field11125 == class740.field10902 ? 1 : 0;
        if (arg4.method41((byte) 108)) {
            if (arg4.method45(-32768)) {
                arg4.field9987 = class50.field608[var6];
                class50.field608[var6] = arg4;
                return;
            }
            arg4.field9987 = class42.field476[var6];
            class42.field476[var6] = arg4;
            class540.field7961 = true;
            return;
        }
        arg4.field9987 = class570.field8262[var6];
        class570.field8262[var6] = arg4;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lkha;)V", line = 115)
    public static final void method4040(class610 arg0) {
        if (class642.field9210 >= 65535) {
            return;
        }
        class731 var1 = arg0.field8782;
        class782.field11417[class642.field9210] = arg0;
        class537.field7884[class642.field9210] = false;
        class642.field9210++;
        int var2 = arg0.field8793;
        if (arg0.field8777) {
            var2 = 0;
        }
        int var3 = arg0.field8793;
        if (arg0.field8778) {
            var3 = class612.field8806 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method5298(-4) + class316.field5139 - var1.method5295(32) >> class165.field2688;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method5298(-4) + var1.method5295(32) - class316.field5139 >> class165.field2688;
            if (var7 >= class117.field1705) {
                var7 = class117.field1705 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field8792[var5++];
                int var10 = (var1.method5300(32) + class316.field5139 - var1.method5295(32) >> class165.field2688) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class150.field2096) {
                    var11 = class150.field2096 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class328.field5375[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class328.field5375[var4][var12][var8] = var13 | (long) class642.field9210;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class328.field5375[var4][var12][var8] = var13 | (long) class642.field9210 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class328.field5375[var4][var12][var8] = var13 | (long) class642.field9210 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class328.field5375[var4][var12][var8] = var13 | (long) class642.field9210 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILip;)I", line = 208)
    public static final int method4041(int arg0, class738 arg1) {
        try {
            field7996++;
            int var2 = arg1.field10809;
            class707 var3 = arg1.method802(-90);
            if (~arg1.field1121 == arg0 || arg1.field1150) {
                var2 = arg1.field10806;
            } else if (arg1.field1121 == var3.field10142 || arg1.field1121 == var3.field10133 || arg1.field1121 == var3.field10165 || arg1.field1121 == var3.field10153) {
                var2 = arg1.field10841;
            } else if (arg1.field1121 == var3.field10177 || arg1.field1121 == var3.field10134 || arg1.field1121 == var3.field10181 || arg1.field1121 == var3.field10149) {
                var2 = arg1.field10812;
            }
            return var2;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field7997[4] + arg0 + ',' + (arg1 == null ? field7997[0] : field7997[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!cn", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4042(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cn", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4043(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 52;
                    break;
                case 1:
                    var10005 = 81;
                    break;
                case 2:
                    var10005 = 98;
                    break;
                case 3:
                    var10005 = 106;
                    break;
                default:
                    var10005 = 109;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
