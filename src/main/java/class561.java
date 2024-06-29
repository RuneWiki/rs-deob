import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class561 extends class161 {

    @OriginalMember(owner = "client!ts", name = "U", descriptor = "[Ljava/lang/String;")
    private static final String[] field8348 = new String[] { method4196(method4195("'\"*\u0012\u000f")), method4196(method4195("'\"*\u0010\u000f")), method4196(method4195("'\"*\u0017\u000f")), method4196(method4195("'\"*\u0011\u000f")) };

    @OriginalMember(owner = "client!ts", name = "P", descriptor = "Lel;")
    public static class573 field8346 = new class573(33, 20);

    @OriginalMember(owner = "client!ts", name = "R", descriptor = "I")
    public static int field8347 = 0;

    @OriginalMember(owner = "client!ts", name = "Q", descriptor = "I")
    public static int field8343;

    @OriginalMember(owner = "client!ts", name = "S", descriptor = "I")
    public static int field8344;

    @OriginalMember(owner = "client!ts", name = "T", descriptor = "I")
    public static int field8345;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IZI)Z", line = 3)
    public static final boolean method4191(int arg0, boolean arg1, int arg2) {
        try {
            if (!arg1) {
                method4193(24L, false);
            }
            field8345++;
            return (arg2 & 0x21) != 0;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8348[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIIIIIIII)V", line = 17)
    public static final void method4192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        try {
            field8344++;
            if (arg9 == -1 && class334.method2801(arg7, arg9 + 1)) {
                if (class769.field11137[arg7] == null) {
                    client.method2675(class683.field9897[arg7], -1, arg8, arg0, arg4, arg1, arg2, arg11, arg5, arg3, arg10, arg6);
                } else {
                    client.method2675(class769.field11137[arg7], -1, arg8, arg0, arg4, arg1, arg2, arg11, arg5, arg3, arg10, arg6);
                }
            }
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field8348[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(JZ)V", line = 36)
    public static final void method4193(long arg0, boolean arg1) {
        try {
            field8343++;
            int var3 = class227.field3469 + class225.field3446.field6197;
            int var4 = class225.field3446.field6211 + class304.field4752;
            if ((class477.field6945 - var3) < -2000 || class477.field6945 - var3 > 2000 || class578.field8576 - var4 < -2000 || (class578.field8576 - var4) > 2000) {
                class477.field6945 = var3;
                class578.field8576 = var4;
            }
            if (class477.field6945 != var3) {
                int var5 = var3 - class477.field6945;
                int var6 = (int) ((long) var5 * arg0 / 320L);
                if (var5 > 0) {
                    if (var6 == 0) {
                        var6 = 1;
                    } else if (var5 < var6) {
                        var6 = var5;
                    }
                } else if (var6 == 0) {
                    var6 = -1;
                } else if (var5 > var6) {
                    var6 = var5;
                }
                class477.field6945 += var6;
            }
            class377.field5748 += (float) arg0 * class459.field6688 / 6.0F;
            if (class578.field8576 != var4) {
                int var7 = var4 - class578.field8576;
                int var8 = (int) ((long) var7 * arg0 / 320L);
                if (var7 <= 0) {
                    if (var8 == 0) {
                        var8 = -1;
                    } else if (var7 > var8) {
                        var8 = var7;
                    }
                } else if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
                class578.field8576 += var8;
            }
            if (!arg1) {
                class98.field1099 += (float) arg0 * class402.field5996 / 6.0F;
                class521.method3958(-16402);
            }
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field8348[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Z)V", line = 124)
    public static void method4194(boolean arg0) {
        try {
            if (arg0) {
                field8347 = -101;
            }
            field8346 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8348[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ts", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4195(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x27);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ts", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4196(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 83;
                    break;
                case 1:
                    var10005 = 81;
                    break;
                case 2:
                    var10005 = 4;
                    break;
                case 3:
                    var10005 = 83;
                    break;
                default:
                    var10005 = 39;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
