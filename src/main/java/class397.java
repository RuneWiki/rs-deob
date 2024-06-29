import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class397 {

    @OriginalMember(owner = "client!ln", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5937 = new String[] { method3136(method3135("%2$4&")), method3136(method3135("\u0018ly ")), method3136(method3135("\u0013yg ")), method3136(method3135("0ifv")), method3136(method3135("2r$[s")), method3136(method3135(".li5")), method3136(method3135("7(2,")), method3136(method3135("&$<Emj")), method3136(method3135("3}iu(q")), method3136(method3135("&$<Emj3")), method3136(method3135("&$<5")), method3136(method3135("&$<")), method3136(method3135(".li")), method3136(method3135("3}i")), method3136(method3135("2udo#q")), method3136(method3135("3o`{-?3")), method3136(method3135("7)2,")), method3136(method3135("7/2,")), method3136(method3135("?qn,o")), method3136(method3135("2udo#")), method3136(method3135("+rcl>,okvt")), method3136(method3135(")ud")), method3136(method3135(")ud~4)o%")), method3136(method3135("2r$Xs")) };

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lla;ZLmca;)V")
    public static final void method3133(class476 arg0, boolean arg1, class33 arg2) {
        try {
            class275.field4157 = arg0;
            class8.field79 = arg2;
            class58.field622 = "";
            field5935++;
            if (class72.field785.startsWith(field5937[21])) {
                class58.field622 = class58.field622 + field5937[22];
            } else if (class72.field785.startsWith(field5937[19])) {
                class58.field622 = class58.field622 + field5937[14];
            } else if (class72.field785.startsWith(field5937[13])) {
                class58.field622 = class58.field622 + field5937[8];
            }
            if (arg1) {
                if (class8.field79.field395) {
                    class58.field622 = class58.field622 + field5937[15];
                } else if (class72.field789.startsWith(field5937[18]) || class72.field789.startsWith(field5937[7])) {
                    class58.field622 = class58.field622 + field5937[9];
                } else if (class72.field789.startsWith(field5937[17]) || class72.field789.startsWith(field5937[6]) || class72.field789.startsWith(field5937[16]) || class72.field789.startsWith(field5937[11])) {
                    class58.field622 = class58.field622 + field5937[10];
                } else if (class72.field789.startsWith(field5937[12])) {
                    class58.field622 = class58.field622 + field5937[5];
                } else {
                    class58.field622 = class58.field622 + field5937[20];
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5937[23] + (arg0 == null ? field5937[3] : field5937[0]) + ',' + arg1 + ',' + (arg2 == null ? field5937[3] : field5937[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILd;IIILha;)V")
    public static final void method3134(int arg0, int arg1, class160 arg2, int arg3, int arg4, int arg5, class66 arg6) {
        try {
            int var7 = 97 % ((arg4 - 28) / 58);
            field5936++;
            if (class712.field10330 < 100) {
                class653.method4789(-87, arg2, arg6);
            }
            arg6.method489(arg0, arg5, arg0 + arg1, arg5 - -arg3);
            if (class712.field10330 < 100) {
                byte var8 = 20;
                int var9 = arg1 / 2 + arg0;
                arg6.method556(arg0, arg5, arg1, arg3, -16777216, 0);
                int var10 = arg3 / 2 + arg5 - var8 - 18;
                arg6.method527(var9 - 152, var10, 304, 34, class362.field5543[class50.field566].getRGB(), 0);
                arg6.method556(var9 - 150, var10 + 2, class712.field10330 * 3, 30, class195.field2616[class50.field566].getRGB(), 0);
                class269.field4100.method608(var9, var8 + var10, class121.field1430[class50.field566].getRGB(), true, -1, class309.field4865.method2616(false, class167.field2300));
            } else {
                int var11 = class494.field7096 - ((int) ((float) arg1 / class161.field2163));
                int var12 = class560.field8334 + ((int) ((float) arg3 / class161.field2163));
                int var13 = class494.field7096 + ((int) ((float) arg1 / class161.field2163));
                class617.field9074 = (int) ((float) (arg3 * 2) / class161.field2163);
                int var14 = class560.field8334 - ((int) ((float) arg3 / class161.field2163));
                class555.field8282 = class494.field7096 - ((int) ((float) arg1 / class161.field2163));
                class507.field7339 = class560.field8334 - ((int) ((float) arg3 / class161.field2163));
                class519.field7612 = (int) ((float) (arg1 * 2) / class161.field2163);
                class161.method1369(class161.field2171 + var11, class161.field2167 + var12, class161.field2171 + var13, class161.field2167 + var14, arg0, arg5, arg0 + arg1, arg3 + arg5 + 1);
                class161.method1387(arg6);
                class513 var15 = class161.method1372(arg6);
                class495.method3735(0, 4, arg6, var15, 0);
                if (class352.field5439 > 0) {
                    class180.field2496--;
                    if (class180.field2496 == 0) {
                        class352.field5439--;
                        class180.field2496 = 20;
                    }
                }
                if (class655.field9471) {
                    int var16 = arg0 - (5 - arg1);
                    int var17 = arg5 + arg3 - 8;
                    class309.field4911.method611(var16, field5937[1] + class48.field549, 16776960, -1, var17, 16895);
                    int var23 = var17 - 15;
                    Runtime var18 = Runtime.getRuntime();
                    int var19 = (int) ((var18.totalMemory() - var18.freeMemory()) / 1024L);
                    int var20 = 16776960;
                    if (var19 > 65536) {
                        var20 = 16711680;
                    }
                    class309.field4911.method611(var16, field5937[2] + var19 + "k", var20, -1, var23, 16895);
                    var17 = var23 - 15;
                }
            }
        } catch (RuntimeException var22) {
            throw class759.method5498(var22, field5937[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5937[3] : field5937[0]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 == null ? field5937[3] : field5937[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!ln", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3135(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ln", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3136(char[] arg0) {
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
                    var10005 = 28;
                    break;
                case 2:
                    var10005 = 10;
                    break;
                case 3:
                    var10005 = 26;
                    break;
                default:
                    var10005 = 91;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
