import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class277 {

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "B")
    private byte field4433;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public int field4431;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public int field4427;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public int field4434;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public int field4424;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public int field4435;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4436 = new String[] { method2379(method2378("7O\u001bhz")), method2379(method2378(":VYB")), method2379(method2378("2W")), method2379(method2378("/\r\u001b\u0000/")), method2379(method2378("7O\u001bjz")), method2379(method2378("7O\u001bmz")), method2379(method2378("7O\u001b\u0012;:JA\u0010z")), method2379(method2378("7O\u001blz")), method2379(method2378("7O\u001bkz")) };

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field4430;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)I")
    public final int method2372(int arg0) {
        try {
            field4432++;
            return arg0 == 7 ? this.field4433 & 0x7 : 42;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4436[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)I")
    public final int method2373(int arg0) {
        try {
            if (arg0 != 0) {
                this.field4431 = 125;
            }
            field4425++;
            return (this.field4433 & 0x8) == 8 ? 1 : 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4436[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
    public static final Object method2374(byte[] arg0, int arg1, boolean arg2) {
        try {
            if (arg1 != 1) {
                return null;
            }
            field4429++;
            if (arg0 == null) {
                return null;
            }
            if (arg0.length > 136 && !class398.field6313) {
                try {
                    class129 var3 = (class129) Class.forName(field4436[2]).getDeclaredConstructor().newInstance();
                    var3.method36(99, arg0);
                    return var3;
                } catch (Throwable var5) {
                    class398.field6313 = true;
                }
            }
            return arg2 ? class758.method5476(arg0, (byte) -121) : arg0;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field4436[0] + (arg0 == null ? field4436[1] : field4436[3]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2375(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            field4428++;
            int var8 = arg1 + arg4;
            int var9 = arg5 - arg4;
            int var10 = arg1;
            if (arg6 != 1) {
                method2377(null);
            }
            while (var8 > var10) {
                class545.method4051(arg2, arg0, arg7, class193.field3047[var10], -108);
                var10++;
            }
            int var11 = arg7 - arg4;
            for (int var12 = arg5; var12 > var9; var12--) {
                class545.method4051(arg2, arg0, arg7, class193.field3047[var12], -117);
            }
            int var13 = arg2 + arg4;
            for (int var14 = var8; var14 <= var9; var14++) {
                int[] var15 = class193.field3047[var14];
                class545.method4051(arg2, arg0, var13, var15, arg6 - 116);
                class545.method4051(var13, arg3, var11, var15, -106);
                class545.method4051(var11, arg0, arg7, var15, -114);
            }
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field4436[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lns;B)V")
    public static final void method2376(class426 arg0, byte arg1) {
        try {
            field4430++;
            int var2 = -40 % ((-arg1 - 37) / 50);
            for (class195 var3 = (class195) class190.field3010.method3228(11); var3 != null; var3 = (class195) class190.field3010.method3216(true)) {
                if (var3.field3087 == arg0) {
                    if (var3.field3081 != null) {
                        class476.field7253.method2594(var3.field3081);
                        var3.field3081 = null;
                    }
                    var3.method4173(-1);
                    return;
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field4436[4] + (arg0 == null ? field4436[1] : field4436[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lda;)V")
    public static final void method2377(class64 arg0) {
        class766.field11217 = arg0;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "()V")
    public class277() {
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lwq;)V")
    public class277(class176 arg0) {
        try {
            this.field4433 = arg0.method1672(-82);
            this.field4431 = arg0.method1687((byte) -58);
            this.field4427 = arg0.method1622(-18712);
            this.field4434 = arg0.method1622(-18712);
            this.field4424 = arg0.method1622(-18712);
            this.field4435 = arg0.method1622(-18712);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field4436[6] + (arg0 == null ? field4436[1] : field4436[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2378(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x52);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2379(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 84;
                    break;
                case 1:
                    var10005 = 35;
                    break;
                case 2:
                    var10005 = 53;
                    break;
                case 3:
                    var10005 = 46;
                    break;
                default:
                    var10005 = 82;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
