import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nja")
public class class458 extends class618 implements class555 {

    @OriginalMember(owner = "client!nja", name = "z", descriptor = "I")
    private int field7066;

    @OriginalMember(owner = "client!nja", name = "C", descriptor = "I")
    private int field7070;

    @OriginalMember(owner = "client!nja", name = "B", descriptor = "I")
    private int field7064;

    @OriginalMember(owner = "client!nja", name = "F", descriptor = "[Ljava/lang/String;")
    private static final String[] field7071 = new String[] { method3556(method3555("IB#\u0007")), method3556(method3555("\\\u0019aEG")), method3556(method3555("I].E\u0006NY&\u001f\u0004\u000f")), method3556(method3555("I].E{\u000f")), method3556(method3555("\u0007\u000b,\u0004V\u001aQ)\r\\AQq")), method3556(method3555("\u001b\u0018,\u0004V\u0019")), method3556(method3555("\u000e\u000b`\bUK\t")), method3556(method3555("I].Ey\u000f")), method3556(method3555("\u0007\u000b,\u0004V\u001aQ)\r\\\u0017\u0007q")), method3556(method3555("\u0007\u001f")), method3556(method3555("\u0007\u000b,\u0004V\u001a\u0007\u007f\r\\\u001f\u0007q")), method3556(method3555("I].Ex\u000f")) };

    @OriginalMember(owner = "client!nja", name = "D", descriptor = "I")
    public static int field7065;

    @OriginalMember(owner = "client!nja", name = "A", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!nja", name = "y", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!nja", name = "E", descriptor = "I")
    public static int field7069;

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(IIIII)V", line = 11)
    public static final void method3552(int arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            ++field7067;
            if (~class184.field2931 == -2) {
                int var5 = arg3 / class667.field9483;
                int var6 = arg1 / class667.field9483;
                int var7 = arg0 / class742.field10924;
                int var8 = arg2 / class742.field10924;
                if (class152.field2133 > var5 && ~var6 <= -1 && ~var7 > ~class258.field3904 && ~var8 <= -1) {
                    if (arg4 <= -61) {
                        if (~var5 > -1) {
                            var5 = 0;
                        }
                        if (var7 < 0) {
                            var7 = 0;
                        }
                        if (class152.field2133 <= var6) {
                            var6 = class152.field2133 - 1;
                        }
                        if (~var8 <= ~class258.field3904) {
                            var8 = class258.field3904 + -1;
                        }
                        for (int var9 = var7; ~var8 <= ~var9; ++var9) {
                            int var10 = class207.method1870(class258.field3904, 106, class537.field7888 + var9) * class152.field2133;
                            for (int var11 = var5; var6 >= var11; ++var11) {
                                int var12 = var10 + class207.method1870(class152.field2133, 99, class574.field8297 + var11);
                                class194.field3055[var12] = class143.field2028;
                            }
                        }
                    }
                }
            }
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field7071[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 73)
    public static final String method3553(byte arg0, int arg1) {
        try {
            int var2 = -44 / ((arg0 - -21) / 60);
            ++field7068;
            String var3 = Integer.toString(arg1);
            for (int var4 = -3 + var3.length(); ~var4 < -1; var4 -= 3) {
                var3 = var3.substring(0, var4) + "," + var3.substring(var4);
            }
            if (var3.length() > 9) {
                return field7071[10] + var3.substring(0, -8 + var3.length()) + class709.field10235.method5154(class795.field11624, (byte) 65) + field7071[9] + var3 + field7071[6];
            } else {
                return ~var3.length() < -7 ? field7071[4] + var3.substring(0, -4 + var3.length()) + class709.field10237.method5154(class795.field11624, (byte) 65) + field7071[9] + var3 + field7071[6] : field7071[8] + var3 + field7071[5];
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7071[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nja", name = "a", descriptor = "(B)V", line = 104)
    public static final void method3554(byte arg0) {
        try {
            for (class603 var1 = (class603) class580.field8365.method5147((byte) -79); var1 != null; var1 = (class603) class580.field8365.method5144(256)) {
                if (~var1.field8711 < -2) {
                    var1.field8711 = 0;
                    class381.field6128.method295(false, ((class59) var1.field8713.field10193.field7074).field767, var1);
                    var1.field8713.method5141(arg0 ^ 12);
                }
            }
            ++field7065;
            class320.field5213 = 0;
            class681.field9707 = 0;
            class439.field6858.method3224(false);
            class324.field5256.method730(true);
            class580.field8365.method5141(arg0 + -12);
            class185.method1735(1, class330.field5401);
            if (arg0 != 12) {
                method3552(-92, 59, 105, 60, -79);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7071[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nja", name = "<init>", descriptor = "(Ltia;Lua;III[B)V", line = 136)
    public class458(class278 arg0, class696 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class544.field8004, arg2 * arg3 * arg4, false);
        try {
            this.field7066 = arg2;
            this.field7070 = arg4;
            this.field7064 = arg3;
            super.field8938.method2233((byte) -80, this);
            OpenGL.glPixelStorei(3317, 1);
            OpenGL.glTexImage3Dub(super.field8926, 0, this.method4512((byte) 83), this.field7066, this.field7064, this.field7070, 0, class284.method2418(super.field8936, 6410), 5121, arg5, 0);
            OpenGL.glPixelStorei(3317, 4);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field7071[2] + (arg0 != null ? field7071[1] : field7071[0]) + ',' + (arg1 != null ? field7071[1] : field7071[0]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field7071[1] : field7071[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!nja", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3555(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 58);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nja", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3556(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 39;
                    break;
                case 1:
                    var10005 = 55;
                    break;
                case 2:
                    var10005 = 79;
                    break;
                case 3:
                    var10005 = 107;
                    break;
                default:
                    var10005 = 58;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
