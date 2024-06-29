import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class502 extends class775 {

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7515 = new String[] { method3789(method3788("c%v[X")), method3789(method3788("c%vXX")), method3789(method3788("c%vWX")), method3789(method3788("\u007f`v0\r")), method3789(method3788("c%vYX")), method3789(method3788("j;4r")), method3789(method3788("c%vVX")) };

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "[I")
    public static int[] field7513;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "Lwca;")
    public static class708 field7512;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field7509;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field7510;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field7514;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)V")
    public static final void method3783(boolean arg0) {
        try {
            field7509++;
            if (!arg0) {
                method3783(false);
            }
            class140.field1953 = new class398();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7515[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Z)V")
    public static void method3784(boolean arg0) {
        try {
            if (arg0) {
                method3784(true);
            }
            field7513 = null;
            field7512 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7515[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static final void method3785(int arg0) {
        try {
            class623.field8996.method3244(22733, class623.field8996.field6397, 1);
            if (arg0 <= 7) {
                method3784(false);
            }
            field7511++;
            class623.field8996.method3244(22733, class623.field8996.field6356, 1);
            class623.field8996.method3244(22733, class623.field8996.field6362, 2);
            class623.field8996.method3244(22733, class623.field8996.field6384, 2);
            class623.field8996.method3244(22733, class623.field8996.field6371, 1);
            class623.field8996.method3244(22733, class623.field8996.field6357, 1);
            class623.field8996.method3244(22733, class623.field8996.field6365, 1);
            class623.field8996.method3244(22733, class623.field8996.field6373, 1);
            class623.field8996.method3244(22733, class623.field8996.field6394, 1);
            class623.field8996.method3244(22733, class623.field8996.field6363, 1);
            class623.field8996.method3244(22733, class623.field8996.field6381, 2);
            class623.field8996.method3244(22733, class623.field8996.field6400, 1);
            class623.field8996.method3244(22733, class623.field8996.field6374, 2);
            class623.field8996.method3244(22733, class623.field8996.field6375, 1);
            class623.field8996.method3244(22733, class623.field8996.field6364, 0);
            class623.field8996.method3244(22733, class623.field8996.field6352, 0);
            class623.field8996.method3244(22733, class623.field8996.field6385, 2);
            class623.field8996.method3244(22733, class623.field8996.field6404, 0);
            class623.field8996.method3244(22733, class623.field8996.field6351, 0);
            class214.method1925(2);
            class623.field8996.method3244(22733, class623.field8996.field6383, 0);
            class623.field8996.method3244(22733, class623.field8996.field6388, 4);
            class181.method1710((byte) 31);
            class262.method2282(true);
            class550.field8069 = true;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field7515[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIIILpba;)Z")
    public static final boolean method3786(int arg0, int arg1, int arg2, int arg3, class350 arg4) {
        try {
            field7514++;
            if (!class382.field6142 || !class147.field2062) {
                return false;
            } else if (class74.field1066 < 100) {
                return false;
            } else if (class527.method3934(-56, arg0, arg1, arg2)) {
                int var5 = arg0 << class165.field2688;
                int var6 = arg2 << class165.field2688;
                int var7 = class740.field10902[arg1].method2495(arg2, 1, arg0) - 1;
                int var8 = var7 + arg4.method43(0);
                if (arg4.field5668 == 1) {
                    if (!class728.method5281(var5, var5, var5, var6 + class152.field2131, var6, var7, var8, 22, var6, var8)) {
                        return false;
                    } else if (class728.method5281(var5, var5, var5, class152.field2131 + var6, var6 - -class152.field2131, var7, var7, -97, var6, var8)) {
                        class106.field1534++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (arg4.field5668 != 2) {
                    int var9 = -114 / ((arg3 + 33) / 35);
                    if (arg4.field5668 == 4) {
                        if (!class728.method5281(class152.field2131 + var5, var5 - -class152.field2131, class152.field2131 + var5, class152.field2131 + var6, var6, var7, var8, 82, var6, var8)) {
                            return false;
                        } else if (class728.method5281(class152.field2131 + var5, class152.field2131 + var5, class152.field2131 + var5, class152.field2131 + var6, var6 + class152.field2131, var7, var7, -3, var6, var8)) {
                            class106.field1534++;
                            return true;
                        } else {
                            return false;
                        }
                    } else if (arg4.field5668 == 8) {
                        if (!class728.method5281(class152.field2131 + var5, var5, var5, var6, var6, var7, var8, 50, var6, var8)) {
                            return false;
                        } else if (class728.method5281(class152.field2131 + var5, var5, class152.field2131 + var5, var6, var6, var7, var8, 119, var6, var7)) {
                            class106.field1534++;
                            return true;
                        } else {
                            return false;
                        }
                    } else if (arg4.field5668 == 16) {
                        if (class213.method1919(var5, -120, class316.field5139, var7, class316.field5139, class316.field5139 + var6, var8)) {
                            class106.field1534++;
                            return true;
                        } else {
                            return false;
                        }
                    } else if (arg4.field5668 == 32) {
                        if (class213.method1919(class316.field5139 + var5, -108, class316.field5139, var7, class316.field5139, class316.field5139 + var6, var8)) {
                            class106.field1534++;
                            return true;
                        } else {
                            return false;
                        }
                    } else if (arg4.field5668 == 64) {
                        if (class213.method1919(class316.field5139 + var5, -110, class316.field5139, var7, class316.field5139, var6, var8)) {
                            class106.field1534++;
                            return true;
                        } else {
                            return false;
                        }
                    } else if (arg4.field5668 != 128) {
                        return true;
                    } else if (class213.method1919(var5, 116, class316.field5139, var7, class316.field5139, var6, var8)) {
                        class106.field1534++;
                        return true;
                    } else {
                        return false;
                    }
                } else if (!class728.method5281(class152.field2131 + var5, var5, var5, class152.field2131 + var6, class152.field2131 + var6, var7, var8, -101, class152.field2131 + var6, var8)) {
                    return false;
                } else if (class728.method5281(class152.field2131 + var5, var5, class152.field2131 + var5, class152.field2131 + var6, class152.field2131 + var6, var7, var8, -112, class152.field2131 + var6, var7)) {
                    class106.field1534++;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field7515[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field7515[5] : field7515[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)V")
    public static final void method3787(byte arg0) {
        try {
            field7510++;
            if (class317.field5175 != -1) {
                int var1 = class15.field174.method5051(0);
                int var2 = class15.field174.method5048(true);
                class524 var3 = (class524) class199.field3151.method3228(11);
                if (var3 != null) {
                    var1 = var3.method1936(11481);
                    var2 = var3.method1935(-109);
                }
                int var4 = 0;
                int var5 = 0;
                if (class316.field5141) {
                    var4 = class50.method516(false);
                    var5 = class568.method4171(0);
                }
                class134.method1261(class333.field5444 + var5, var5, class317.field5175, var1, var4, var1 + var4, class64.field881 + var4, var5, var4, -108, var2 + var5, var2);
                int var6 = -73 % ((64 - arg0) / 62);
                if (class239.field3684 != null) {
                    class45.method461(var2 + var5, var1 - -var4, true);
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field7515[6] + arg0 + ')');
        }
    }

    static {
        new class532("", 76);
        field7513 = new int[4096];
        field7512 = new class708();
    }

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3788(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x70);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3789(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 4;
                    break;
                case 1:
                    var10005 = 78;
                    break;
                case 2:
                    var10005 = 88;
                    break;
                case 3:
                    var10005 = 30;
                    break;
                default:
                    var10005 = 112;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
