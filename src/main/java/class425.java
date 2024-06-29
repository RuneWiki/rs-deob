import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qba")
public class class425 extends class211 {

    @OriginalMember(owner = "client!qba", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field6269 = new String[] { method3281(method3280("Hk/Cv\u0011")), method3281(method3280("Hk/Cr\u0011")), method3281(method3280("B'`CJ")), method3281(method3280("W|\"\u0001")), method3281(method3280("Hk/Cs\u0011")), method3281(method3280("Hk/Cu\u0011")) };

    @OriginalMember(owner = "client!qba", name = "G", descriptor = "F")
    public static float field6265;

    @OriginalMember(owner = "client!qba", name = "E", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!qba", name = "D", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!qba", name = "F", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!qba", name = "C", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 5)
    public static final void method3277(boolean arg0, String arg1) {
        try {
            field6266++;
            if (arg1 != null) {
                if ((class588.field8654 < 200 || class233.field3519) && class588.field8654 < 200) {
                    String var2 = class727.method5306((byte) -108, arg1);
                    if (var2 != null) {
                        if (arg0) {
                            field6265 = -2.0279598F;
                        }
                        for (int var3 = 0; var3 < class588.field8654; var3++) {
                            String var4 = class727.method5306((byte) -66, class754.field10971[var3]);
                            if (var4 != null && var4.equals(var2)) {
                                class536.method4041(4, arg1 + class309.field4885.method2616(false, class167.field2300), 106);
                                return;
                            }
                            if (class311.field4935[var3] != null) {
                                String var5 = class727.method5306((byte) -44, class311.field4935[var3]);
                                if (var5 != null && var5.equals(var2)) {
                                    class536.method4041(4, arg1 + class309.field4885.method2616(false, class167.field2300), 110);
                                    return;
                                }
                            }
                        }
                        for (int var6 = 0; var6 < class157.field1960; var6++) {
                            String var7 = class727.method5306((byte) -77, class54.field598[var6]);
                            if (var7 != null && var7.equals(var2)) {
                                class536.method4041(4, class309.field4890.method2616(arg0, class167.field2300) + arg1 + class309.field4891.method2616(arg0, class167.field2300), 118);
                                return;
                            }
                            if (class666.field9687[var6] != null) {
                                String var8 = class727.method5306((byte) -56, class666.field9687[var6]);
                                if (var8 != null && var8.equals(var2)) {
                                    class536.method4041(4, class309.field4890.method2616(false, class167.field2300) + arg1 + class309.field4891.method2616(arg0, class167.field2300), 112);
                                    return;
                                }
                            }
                        }
                        if (class727.method5306((byte) -63, class225.field3446.field10506).equals(var2)) {
                            class536.method4041(4, class309.field4888.method2616(false, class167.field2300), 121);
                        } else {
                            class362.field5533++;
                            class280 var9 = class610.method4508(class505.field7321, class279.field4190, (byte) 19);
                            var9.field4197.method1428((byte) -24, class554.method4169(23827, arg1));
                            var9.field4197.method1464(arg1, 255);
                            class106.method934((byte) 53, var9);
                        }
                    }
                } else {
                    class536.method4041(4, class309.field4858.method2616(false, class167.field2300), 98);
                }
            }
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field6269[1] + arg0 + ',' + (arg1 == null ? field6269[3] : field6269[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(II)[I", line = 109)
    public final int[] method197(int arg0, int arg1) {
        try {
            if (arg0 != 8217) {
                field6265 = 0.21108742F;
            }
            field6264++;
            return class88.field997;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6269[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qba", name = "b", descriptor = "(Ljava/lang/String;I)[B", line = 121)
    public static final byte[] method3278(String arg0, int arg1) {
        try {
            field6268++;
            int var2 = arg0.length();
            byte[] var3 = new byte[var2];
            int var4 = 0;
            int var5 = -33 / ((arg1 - 36) / 54);
            while (var2 > var4) {
                char var6 = arg0.charAt(var4);
                if (!(var6 <= '\u0000' || var6 >= '\u0080') || !(var6 < ' ' || var6 > 'ÿ')) {
                    var3[var4] = (byte) var6;
                } else if (var6 == '€') {
                    var3[var4] = -128;
                } else if (var6 == '‚') {
                    var3[var4] = -126;
                } else if (var6 == 'ƒ') {
                    var3[var4] = -125;
                } else if (var6 == '„') {
                    var3[var4] = -124;
                } else if (var6 == '…') {
                    var3[var4] = -123;
                } else if (var6 == '†') {
                    var3[var4] = -122;
                } else if (var6 == '‡') {
                    var3[var4] = -121;
                } else if (var6 == 'ˆ') {
                    var3[var4] = -120;
                } else if (var6 == '‰') {
                    var3[var4] = -119;
                } else if (var6 == 'Š') {
                    var3[var4] = -118;
                } else if (var6 == '‹') {
                    var3[var4] = -117;
                } else if (var6 == 'Œ') {
                    var3[var4] = -116;
                } else if (var6 == 'Ž') {
                    var3[var4] = -114;
                } else if (var6 == '‘') {
                    var3[var4] = -111;
                } else if (var6 == '’') {
                    var3[var4] = -110;
                } else if (var6 == '“') {
                    var3[var4] = -109;
                } else if (var6 == '”') {
                    var3[var4] = -108;
                } else if (var6 == '•') {
                    var3[var4] = -107;
                } else if (var6 == '–') {
                    var3[var4] = -106;
                } else if (var6 == '—') {
                    var3[var4] = -105;
                } else if (var6 == '˜') {
                    var3[var4] = -104;
                } else if (var6 == '™') {
                    var3[var4] = -103;
                } else if (var6 == 'š') {
                    var3[var4] = -102;
                } else if (var6 == '›') {
                    var3[var4] = -101;
                } else if (var6 == 'œ') {
                    var3[var4] = -100;
                } else if (var6 == 'ž') {
                    var3[var4] = -98;
                } else if (var6 == 'Ÿ') {
                    var3[var4] = -97;
                } else {
                    var3[var4] = 63;
                }
                var4++;
            }
            return var3;
        } catch (RuntimeException var8) {
            throw class759.method5498(var8, field6269[4] + (arg0 == null ? field6269[3] : field6269[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qba", name = "<init>", descriptor = "()V", line = 259)
    public class425() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qba", name = "a", descriptor = "(ZII)Z", line = 262)
    public static final boolean method3279(boolean arg0, int arg1, int arg2) {
        try {
            field6267++;
            if (!arg0) {
                field6265 = 0.04214774F;
            }
            return (arg2 & 0x400) != 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field6269[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3280(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x37);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3281(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 57;
                    break;
                case 1:
                    var10005 = 9;
                    break;
                case 2:
                    var10005 = 78;
                    break;
                case 3:
                    var10005 = 109;
                    break;
                default:
                    var10005 = 55;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
