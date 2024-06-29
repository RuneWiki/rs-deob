import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class502 extends class157 {

    @OriginalMember(owner = "client!gga", name = "W", descriptor = "[Ljava/lang/String;")
    private static final String[] field7337 = new String[] { method3845(method3844("\r ^K2B")), method3845(method3844("J\u0014\u0005E")), method3845(method3844("\u0011i\u0011K\n")), method3845(method3844("\u00042S\t")), method3845(method3844("\r ^K5B")), method3845(method3844("\r ^K3B")), method3845(method3844("\r ^K6B")) };

    @OriginalMember(owner = "client!gga", name = "S", descriptor = "I")
    public static int field7330 = 0;

    @OriginalMember(owner = "client!gga", name = "O", descriptor = "Lsb;")
    public static class261 field7328 = new class261(82, -1);

    @OriginalMember(owner = "client!gga", name = "U", descriptor = "F")
    public static float field7336;

    @OriginalMember(owner = "client!gga", name = "R", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!gga", name = "T", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!gga", name = "V", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!gga", name = "N", descriptor = "Ljava/awt/Font;")
    public static Font field7332;

    @OriginalMember(owner = "client!gga", name = "P", descriptor = "[I")
    public static int[] field7335;

    @OriginalMember(owner = "client!gga", name = "Q", descriptor = "[[[J")
    public static long[][][] field7334;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Lop;BII)Lue;", line = 5)
    public static final class90 method3841(class574 arg0, byte arg1, int arg2, int arg3) {
        try {
            ++field7329;
            int var4 = arg2 << 10 | arg0.field8306;
            class90 var5 = (class90) class752.field10732.method2730(true, (long) var4 << 16);
            if (var5 != null) {
                return var5;
            } else {
                byte[] var6 = class788.field11371.method520((byte) 108, class788.field11371.method504(var4, -1));
                if (var6 != null) {
                    if (var6.length <= 1) {
                        return null;
                    } else {
                        class90 var7;
                        try {
                            var7 = class43.method476(-1001, var6);
                        } catch (Exception var21) {
                            throw new RuntimeException(var21.getMessage() + field7337[1] + var4);
                        }
                        var7.field1250 = arg0;
                        class752.field10732.method2734((long) var4 << 16, -1, var7);
                        return var7;
                    }
                } else {
                    int var9 = arg3 + 65536 << 10 | arg0.field8306;
                    class90 var10 = (class90) class752.field10732.method2730(true, (long) var9 << 16);
                    if (var10 != null) {
                        return var10;
                    } else {
                        int var11 = -114 / ((-57 - arg1) / 36);
                        byte[] var12 = class788.field11371.method520((byte) 108, class788.field11371.method504(var9, -1));
                        if (var12 != null) {
                            if (var12.length <= 1) {
                                return null;
                            } else {
                                class90 var13;
                                try {
                                    var13 = class43.method476(-1001, var12);
                                } catch (Exception var22) {
                                    throw new RuntimeException(var22.getMessage() + field7337[1] + var9);
                                }
                                var13.field1250 = arg0;
                                class752.field10732.method2734((long) var9 << 16, -1, var13);
                                return var13;
                            }
                        } else {
                            int var15 = arg0.field8306 | 67107840;
                            class90 var16 = (class90) class752.field10732.method2730(true, (long) var15 << 16);
                            if (var16 != null) {
                                return var16;
                            } else {
                                byte[] var17 = class788.field11371.method520((byte) 108, class788.field11371.method504(var15, -1));
                                if (var17 != null) {
                                    if (~var17.length >= -2) {
                                        return null;
                                    } else {
                                        class90 var18;
                                        try {
                                            var18 = class43.method476(-1001, var17);
                                        } catch (Exception var23) {
                                            throw new RuntimeException(var23.getMessage() + field7337[1] + var15);
                                        }
                                        var18.field1250 = arg0;
                                        class752.field10732.method2734((long) var15 << 16, -1, var18);
                                        return var18;
                                    }
                                } else {
                                    return null;
                                }
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var24) {
            throw class665.method4799(var24, field7337[4] + (arg0 != null ? field7337[2] : field7337[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!gga", name = "g", descriptor = "(I)V", line = 90)
    public static void method3842(int arg0) {
        try {
            field7334 = null;
            if (arg0 > -30) {
                method3843(true);
            }
            field7335 = null;
            field7332 = null;
            field7328 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7337[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(Z)V", line = 114)
    public static final void method3843(boolean arg0) {
        try {
            class90.field1257 = 200;
            ++field7333;
            class649.field9225 = (int) ((double) class625.field8929 * 34.46D);
            class649.field9225 <<= 2;
            if (class236.field3418.method186()) {
                class649.field9225 += 512;
            }
            if (!arg0) {
                field7332 = null;
            }
            class198.method1710(1, false);
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7337[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(II)[[I", line = 132)
    public final int[][] method349(int arg0, int arg1) {
        try {
            if (arg0 != 0) {
                method3843(false);
            }
            ++field7331;
            int[][] var3 = super.field7575.method1955(arg1, -2);
            if (super.field7575.field3416 && this.method1318(8141)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = arg1 % super.field2002 * super.field2002;
                for (int var8 = 0; ~var8 > ~class110.field1436; ++var8) {
                    int var9 = super.field1999[var7 - -(var8 % super.field1997)];
                    var6[var8] = class434.method3377(var9, 255) << 4;
                    var5[var8] = class434.method3377(4080, var9 >> 4);
                    var4[var8] = class434.method3377(16711680, var9) >> 12;
                }
            }
            return var3;
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field7337[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3844(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 119);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3845(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 106;
                    break;
                case 1:
                    var10005 = 71;
                    break;
                case 2:
                    var10005 = 63;
                    break;
                case 3:
                    var10005 = 101;
                    break;
                default:
                    var10005 = 119;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
