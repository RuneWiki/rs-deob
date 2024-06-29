import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class780 {

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field11392 = new String[] { method5607(method5606("i?\u0011'@")), method5607(method5606("yc\u0011M\u0015")), method5607(method5606("l8S\u000f")), method5607(method5606("i?\u0011\"@")), method5607(method5606("c;^\n\u0004c/S\u00068p\"\\\u0006\u001bq\"M\u0010")), method5607(method5606("i?\u0011 @")), method5607(method5606("h,I\u0002Fn,Q\u0004FP8Q\u0017\u0001o(")), method5607(method5606("i?\u0011!@")) };

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "C")
    public char field11384;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public static int field11385;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public int field11386;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "I")
    public int field11387;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field11388;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "I")
    public static int field11389;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
    public int field11390;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "Lgl;")
    public static class627 field11383;

    // $FF: synthetic field
    @OriginalMember(owner = "client!kr", name = "d", descriptor = "Ljava/lang/Class;")
    public static Class field11391;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "[Lpp;")
    public static class415[] field11382;

    // $FF: synthetic method
    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method5605(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V", line = 3)
    public static final void method5601(int arg0) {
        try {
            try {
                Method var1 = (field11391 == null ? (field11391 = method5605(field11392[6])) : field11391).getMethod(field11392[4]);
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                        class201.field3184 = var3;
                    } catch (Throwable var5) {
                    }
                }
            } catch (Exception var6) {
            }
            field11389++;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field11392[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILwq;)V", line = 31)
    public final void method5602(int arg0, class176 arg1) {
        try {
            if (arg0 != 0) {
                this.field11387 = 44;
            }
            while (true) {
                int var3 = arg1.method1645((byte) -112);
                if (var3 == 0) {
                    field11388++;
                    return;
                }
                this.method5603(var3, false, arg1);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11392[7] + arg0 + ',' + (arg1 == null ? field11392[2] : field11392[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IZLwq;)V", line = 55)
    private final void method5603(int arg0, boolean arg1, class176 arg2) {
        try {
            field11385++;
            if (!arg1) {
                if (arg0 == 1) {
                    this.field11384 = class423.method3359(-6826, arg2.method1672(105));
                } else if (arg0 == 3) {
                    this.field11386 = arg2.method1687((byte) -55);
                    this.field11387 = arg2.method1645((byte) -78);
                    this.field11390 = arg2.method1645((byte) -83);
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11392[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field11392[2] : field11392[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V", line = 80)
    public static void method5604(int arg0) {
        try {
            field11383 = null;
            if (arg0 != 0) {
                method5601(-118);
            }
            field11382 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11392[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5606(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x68);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5607(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 2;
                    break;
                case 1:
                    var10005 = 77;
                    break;
                case 2:
                    var10005 = 63;
                    break;
                case 3:
                    var10005 = 99;
                    break;
                default:
                    var10005 = 104;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
