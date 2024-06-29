import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class564 {

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8374 = new String[] { method4214(method4213("h1&hQ")), method4214(method4213("h1&mQ")), method4214(method4213("a|&\u0002\u0004")), method4214(method4213("h1&nQ")), method4214(method4213("t'd@")), method4214(method4213("u&`I\u000bv7~I\u0015")), method4214(method4213("t3eI&s1gB\n")), method4214(method4213("r;fX&r7iH\u0010y=f_")), method4214(method4213("r;fX&w3xI\u001d}7")), method4214(method4213("r7iH\u0010y=f_&j9")), method4214(method4213("n;eI\u000bx3zs\u001d\u007f4iY\u0015n")), method4214(method4213("y g_\n")), method4214(method4213("r;fX&w3xA\u0018h9m^\n")), method4214(method4213("w3xH\u0016n!")), method4214(method4213("w3xJ\u0015{5")), method4214(method4213("h1&oQ")), method4214(method4213("r7iH\u0010y=f_&j iU\u001ch")), method4214(method4213("r;|A\u0018h9{")), method4214(method4213("y=e\\\u0018i!")), method4214(method4213("|>gC\u000bi:iH\u0016m!")), method4214(method4213("i1zC\u0015v0i^")), method4214(method4213("r;|N\u0018h\rlI\u001f{'dX")), method4214(method4213("h1&iQ")) };

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public int field8366;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public int field8367;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field8368;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field8369;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field8370;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field8372;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public int field8373;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "[I")
    public static int[] field8371;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V")
    public static void method4208(byte arg0) {
        try {
            field8371 = null;
            if (arg0 != 115) {
                field8371 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8374[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILib;)V")
    public final void method4209(int arg0, class163 arg1) {
        try {
            while (true) {
                int var3 = arg1.method1455((byte) 62);
                if (var3 == 0) {
                    if (arg0 != -14964) {
                        this.field8366 = 116;
                    }
                    field8368++;
                    return;
                }
                this.method4212(arg1, (byte) -42, var3);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8374[3] + arg0 + ',' + (arg1 == null ? field8374[4] : field8374[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIBZ)I")
    public static final int method4210(int arg0, int arg1, byte arg2, boolean arg3) {
        try {
            field8372++;
            class495 var4 = class668.method4916(arg0, arg3, 3);
            if (var4 == null) {
                return 0;
            } else if (arg1 == -1) {
                return 0;
            } else {
                int var5 = 0;
                for (int var6 = 0; var6 < var4.field7108.length; var6++) {
                    if (var4.field7103[var6] == arg1) {
                        var5 += var4.field7108[var6];
                    }
                }
                int var7 = 16 / ((arg2 + 52) / 51);
                return var5;
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field8374[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZLla;)V")
    public static final void method4211(boolean arg0, class476 arg1) {
        try {
            class766.field11074 = arg1.method3627(field8374[17], -77);
            field8370++;
            class412.field6085 = arg1.method3627(field8374[21], 83);
            class90.field1033 = arg1.method3627(field8374[10], 71);
            class194.field2604 = arg1.method3627(field8374[9], -102);
            class397.field5934 = arg1.method3627(field8374[16], -70);
            class252.field3902 = arg1.method3627(field8374[7], 31);
            class399.field5953 = arg1.method3627(field8374[12], 24);
            class562.field8356 = arg1.method3627(field8374[14], 17);
            if (!arg0) {
                class243.field3732 = arg1.method3627(field8374[11], 30);
                class680.field9861 = arg1.method3627(field8374[13], -125);
                class433.field6366 = arg1.method3627(field8374[20], -76);
                class331.field5198 = arg1.method3627(field8374[6], 66);
                class497.field7199 = arg1.method3627(field8374[19], -75);
                class433.field6360 = arg1.method3627(field8374[18], -100);
                class627.field9188 = arg1.method3627(field8374[5], 40);
                class280.field4196 = arg1.method3627(field8374[8], 120);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8374[15] + arg0 + ',' + (arg1 == null ? field8374[4] : field8374[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lib;BI)V")
    private final void method4212(class163 arg0, byte arg1, int arg2) {
        try {
            field8369++;
            if (arg1 != -42) {
                this.method4209(99, null);
            }
            if (arg2 == 1) {
                this.field8367 = arg0.method1445((byte) 108);
                this.field8366 = arg0.method1455((byte) 62);
                this.field8373 = arg0.method1455((byte) 62);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8374[22] + (arg0 == null ? field8374[4] : field8374[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4213(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x79);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4214(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 26;
                    break;
                case 1:
                    var10005 = 82;
                    break;
                case 2:
                    var10005 = 8;
                    break;
                case 3:
                    var10005 = 44;
                    break;
                default:
                    var10005 = 121;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
