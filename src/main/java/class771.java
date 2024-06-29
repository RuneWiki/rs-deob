import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class771 extends class58 {

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "I")
    private int field10988;

    @OriginalMember(owner = "client!qs", name = "w", descriptor = "I")
    private int field10989;

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "Lml;")
    private class194 field10990;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
    private int field10992;

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "I")
    private int field10986;

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
    private int field10985;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "I")
    private int field10987;

    @OriginalMember(owner = "client!qs", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10995 = new String[] { method5559(method5558("B\r:\u000bI")), method5559(method5558("B\r:\fI")), method5559(method5558("A\n")), method5559(method5558("HP:c\u001c")), method5559(method5558("]\u000bx!")), method5559(method5558("B\r:q\b]\u0017`sI")) };

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "I")
    public static int field10991;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
    public static int field10993;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "Lgfa;")
    private class112 field10984;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qs", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field10994;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method5557(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZLtl;)V", line = 7)
    public static final void method5556(boolean arg0, class224 arg1) {
        try {
            field10991++;
            if (class608.field8715 != null) {
                class675 var2 = null;
                if (arg1.field3258 == 0) {
                    var2 = (class675) class185.method1526(arg1.field3256, arg1.field3248, arg1.field3247);
                }
                if (arg1.field3258 == 1) {
                    var2 = (class675) class501.method3838(arg1.field3256, arg1.field3248, arg1.field3247);
                }
                if (!arg0) {
                    method5556(true, null);
                }
                if (arg1.field3258 == 2) {
                    var2 = (class675) class590.method4352(arg1.field3256, arg1.field3248, arg1.field3247, field10994 == null ? (field10994 = method5557(field10995[2])) : field10994);
                }
                if (arg1.field3258 == 3) {
                    var2 = (class675) class254.method2130(arg1.field3256, arg1.field3248, arg1.field3247);
                }
                if (var2 == null) {
                    arg1.field3252 = 0;
                    arg1.field3262 = -1;
                    arg1.field3255 = 0;
                } else {
                    arg1.field3262 = var2.method584(false);
                    arg1.field3255 = var2.method572(88);
                    arg1.field3252 = var2.method585(-20175);
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10995[1] + arg0 + ',' + (arg1 == null ? field10995[4] : field10995[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(B)Lgfa;", line = 54)
    public final class112 method491(byte arg0) {
        try {
            if (arg0 > -95) {
                this.field10987 = -31;
            }
            field10993++;
            if (this.field10984 == null) {
                class673 var2 = this.field10990.field237;
                class80.field1121[5] = this.field10992;
                class80.field1121[0] = this.field10989;
                class80.field1121[2] = this.field10986;
                class80.field1121[3] = this.field10987;
                class80.field1121[1] = this.field10988;
                class80.field1121[4] = this.field10985;
                byte var3 = 0;
                int var4 = 0;
                for (int var5 = 0; var5 < 6; var5++) {
                    if (!var2.method4504(class80.field1121[var5], -31410)) {
                        return null;
                    }
                    class684 var6 = var2.method4500(-23641, class80.field1121[var5]);
                    int var7 = var6.field9599 ? 64 : 128;
                    if (var7 > var4) {
                        var4 = var7;
                    }
                    if (var6.field9597 > 0) {
                        var3 = 1;
                    }
                }
                for (int var8 = 0; var8 < 6; var8++) {
                    class130.field1616[var8] = var2.method4502(1.0F, var4, -83, var4, class80.field1121[var8], false);
                }
                this.field10984 = new class112(this.field10990, 6407, var4, var3 != 0, class130.field1616);
            }
            return this.field10984;
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field10995[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lml;IIIIII)V", line = 119)
    public class771(class194 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            this.field10988 = arg2;
            this.field10989 = arg1;
            this.field10990 = arg0;
            this.field10992 = arg6;
            this.field10986 = arg3;
            this.field10985 = arg5;
            this.field10987 = arg4;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field10995[5] + (arg0 == null ? field10995[4] : field10995[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!qs", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5558(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x61);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qs", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5559(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 51;
                    break;
                case 1:
                    var10005 = 126;
                    break;
                case 2:
                    var10005 = 20;
                    break;
                case 3:
                    var10005 = 77;
                    break;
                default:
                    var10005 = 97;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
