import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class300 {

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "I")
    public int field4859 = 1;

    @OriginalMember(owner = "client!uu", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4865 = new String[] { method2589(method2588("\u0016Kgg?")), method2589(method2588("\u0016Kge?")), method2589(method2588("\u0018\u0010g\nj")), method2589(method2588("\rK%H")), method2589(method2588("\u0016Kga?")), method2589(method2588("\u0016Kgb?")), method2589(method2588("\u0016Kgf?")), method2589(method2588("\u0016Kg`?")) };

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
    public static int field4862 = 2;

    @OriginalMember(owner = "client!uu", name = "i", descriptor = "C")
    public char field4857;

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!uu", name = "e", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!uu", name = "h", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIILha;ILtk;)V", line = 5)
    public static final void method2582(int arg0, int arg1, int arg2, class63 arg3, int arg4, class362 arg5) {
        try {
            field4861++;
            class57 var6 = class179.field2874.method3724(arg5.field5907, (byte) -70);
            if (var6.field705 != -1) {
                if (arg5.field5892) {
                    int var14 = arg5.field5897 + arg0;
                    arg0 = var14 & 0x3;
                } else {
                    arg0 = 0;
                }
                class107 var7 = var6.method569(arg0, arg5.field5887, arg3, -96);
                if (var7 != null) {
                    int var8 = arg5.field5842;
                    int var9 = arg5.field5894;
                    if ((arg0 & 0x1) == 1) {
                        var9 = arg5.field5842;
                        var8 = arg5.field5894;
                    }
                    int var10 = var7.method26();
                    if (arg1 != -4) {
                        method2586(42, -59);
                    }
                    int var11 = var7.method12();
                    if (var6.field709) {
                        var11 = var9 * 4;
                        var10 = var8 * 4;
                    }
                    if (var6.field702 == 0) {
                        var7.method994(arg4, arg2 + 4 - var9 * 4, var10, var11);
                    } else {
                        var7.method999(arg4, arg2 + 4 - (var9 * 4), var10, var11, 0, var6.field702 | 0xFF000000, 1);
                    }
                }
            }
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field4865[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field4865[3] : field4865[2]) + ',' + arg4 + ',' + (arg5 == null ? field4865[3] : field4865[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lwq;II)V", line = 61)
    private final void method2583(class176 arg0, int arg1, int arg2) {
        try {
            if (arg2 <= -94) {
                if (arg1 == 1) {
                    this.field4857 = class423.method3359(-6826, arg0.method1672(119));
                } else if (arg1 == 2) {
                    this.field4859 = 0;
                }
                field4864++;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4865[6] + (arg0 == null ? field4865[3] : field4865[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)I", line = 83)
    public static final int method2584(byte arg0) {
        try {
            field4858++;
            int var1 = 82 % ((56 - arg0) / 45);
            return class355.field5711.method4922((byte) -128);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4865[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILwq;)V", line = 99)
    public final void method2585(int arg0, class176 arg1) {
        try {
            if (arg0 <= 16) {
                this.field4859 = -114;
            }
            field4863++;
            while (true) {
                int var3 = arg1.method1645((byte) -91);
                if (var3 == 0) {
                    return;
                }
                this.method2583(arg1, var3, -125);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4865[7] + arg0 + ',' + (arg1 == null ? field4865[3] : field4865[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)I", line = 124)
    public static final int method2586(int arg0, int arg1) {
        try {
            field4856++;
            return arg0 == arg1 ? -1 : class209.method1886(true, arg1);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4865[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BZZ)V", line = 139)
    public static final void method2587(byte arg0, boolean arg1, boolean arg2) {
        try {
            if (arg1) {
                class715.field10352--;
                if (class715.field10352 == 0) {
                    class200.field3161 = null;
                }
            }
            field4860++;
            if (arg0 > 54 && arg2) {
                class57.field708--;
                if (class57.field708 == 0) {
                    class613.field8810 = null;
                    return;
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field4865[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uu", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2588(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x17);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uu", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2589(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 99;
                    break;
                case 1:
                    var10005 = 62;
                    break;
                case 2:
                    var10005 = 73;
                    break;
                case 3:
                    var10005 = 36;
                    break;
                default:
                    var10005 = 23;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
