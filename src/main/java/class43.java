import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cja")
public class class43 {

    @OriginalMember(owner = "client!cja", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field482 = new String[] { method446(method445("\u0011\u0000\bYQZ")), method446(method445("\u0011\u0000\bYRZ")), method446(method445("\u001c\u001f\u0005\u001b")), method446(method445("R9SW")), method446(method445("\tDGYm")) };

    @OriginalMember(owner = "client!cja", name = "c", descriptor = "I")
    public static int field481 = 0;

    @OriginalMember(owner = "client!cja", name = "b", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "Luh;")
    public static class174 field480;

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(I)V")
    public static void method443(int arg0) {
        try {
            field480 = null;
            if (arg0 != -843) {
                field480 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field482[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cja", name = "a", descriptor = "(Lko;III)Lkca;")
    public static final class88 method444(class532 arg0, int arg1, int arg2, int arg3) {
        try {
            field479++;
            int var4 = arg0.field7812 | arg2 << 10;
            class88 var5 = (class88) class309.field5029.method4427(arg1 + 8359, (long) var4 << 16);
            if (var5 != null) {
                return var5;
            }
            byte[] var6 = class546.field8029.method587(class546.field8029.method579(var4, (byte) -112), true);
            if (var6 == null) {
                int var9 = arg0.field7812 | arg3 + 65536 << 10;
                class88 var10 = (class88) class309.field5029.method4427(arg1 ^ 0xFFFFDFDD, (long) var9 << 16);
                if (var10 != null) {
                    return var10;
                }
                byte[] var11 = class546.field8029.method587(class546.field8029.method579(var9, (byte) -119), true);
                if (var11 == null) {
                    int var14 = arg0.field7812 | 0x3FFFC00;
                    class88 var15 = (class88) class309.field5029.method4427(arg1 + 8384, (long) var14 << 16);
                    if (var15 != null) {
                        return var15;
                    } else if (arg1 == -8287) {
                        byte[] var16 = class546.field8029.method587(class546.field8029.method579(var14, (byte) -115), true);
                        if (var16 == null) {
                            return null;
                        } else if (var16.length <= 1) {
                            return null;
                        } else {
                            class88 var17;
                            try {
                                var17 = class190.method1768((byte) 96, var16);
                            } catch (Exception var22) {
                                throw new RuntimeException(var22.getMessage() + field482[3] + var14);
                            }
                            var17.field1310 = arg0;
                            class309.field5029.method4428((byte) 64, var17, (long) var14 << 16);
                            return var17;
                        }
                    } else {
                        return null;
                    }
                } else if (var11.length <= 1) {
                    return null;
                } else {
                    class88 var12;
                    try {
                        var12 = class190.method1768((byte) 26, var11);
                    } catch (Exception var21) {
                        throw new RuntimeException(var21.getMessage() + field482[3] + var9);
                    }
                    var12.field1310 = arg0;
                    class309.field5029.method4428((byte) 85, var12, (long) var9 << 16);
                    return var12;
                }
            } else if (var6.length <= 1) {
                return null;
            } else {
                class88 var7;
                try {
                    var7 = class190.method1768((byte) 27, var6);
                } catch (Exception var20) {
                    throw new RuntimeException(var20.getMessage() + field482[3] + var4);
                }
                var7.field1310 = arg0;
                class309.field5029.method4428((byte) 96, var7, (long) var4 << 16);
                return var7;
            }
        } catch (RuntimeException var23) {
            throw class590.method4333(var23, field482[1] + (arg0 == null ? field482[2] : field482[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!cja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method445(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x10);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method446(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 114;
                    break;
                case 1:
                    var10005 = 106;
                    break;
                case 2:
                    var10005 = 105;
                    break;
                case 3:
                    var10005 = 119;
                    break;
                default:
                    var10005 = 16;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
