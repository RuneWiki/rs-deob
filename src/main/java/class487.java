import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class487 extends class568 {

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7367 = new String[] { method3703(method3702("\u001c*\u000e\r]")), method3703(method3702("\u001c*\u000e\u000b]")), method3703(method3702("\u001c*\u000e\f]")), method3703(method3702("\u001c*\u000e\u000f]")), method3703(method3702("\u001c*\u000e\n]")), method3703(method3702("\u001c.L\"")), method3703(method3702("\tu\u000e`\b")) };

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
    public int field7358;

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "I")
    public static int field7359;

    @OriginalMember(owner = "client!nq", name = "o", descriptor = "I")
    public static int field7361;

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "I")
    public int field7364;

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "I")
    public static int field7366;

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "Lrv;")
    public class117 field7362;

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "Lvn;")
    public class330 field7360;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)V", line = 4)
    public static final void method3697(int arg0, int arg1) {
        try {
            field7359++;
            if (arg0 != -22726) {
                method3697(-15, 2);
            }
            class551 var2 = class380.method3113(-116, (long) arg1, 3);
            var2.method4089(63);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field7367[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIIIIII)V", line = 17)
    public static final void method3698(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            if (arg8 != -65536) {
                method3698(91, -115, -90, 64, -112, 94, -109, 27, 106);
            }
            field7365++;
            class326.method2772(false, arg1, arg6, arg7, arg5, arg3, arg0, arg2, arg4, 0);
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field7367[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILwq;)V", line = 33)
    public static final void method3699(int arg0, class176 arg1) {
        try {
            if (arg0 > 82) {
                for (int var2 = 0; var2 < class31.field366; var2++) {
                    int var3 = arg1.method1660(false);
                    int var4 = arg1.method1687((byte) -88);
                    if (var4 == 65535) {
                        var4 = -1;
                    }
                    if (class663.field9452[var3] != null) {
                        class663.field9452[var3].field5434 = var4;
                    }
                }
                field7361++;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7367[4] + arg0 + ',' + (arg1 == null ? field7367[5] : field7367[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V", line = 65)
    public final void method3700(int arg0) {
        try {
            field7366++;
            if (arg0 < -86 && class489.field7375 < class759.field11156.length) {
                class759.field11156[class489.field7375++] = this;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field7367[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BIIII)V", line = 81)
    public static final void method3701(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        try {
            field7363++;
            if ((arg1 - arg4) >= class546.field8030 && class779.field11374 >= (arg1 + arg4) && (arg3 - arg4) >= class310.field5088 && (arg3 + arg4) <= class478.field7264) {
                class478.method3651(arg2, arg3, (byte) 117, arg4, arg1);
            } else {
                class732.method5307(arg3, -20478, arg2, arg1, arg4);
            }
            if (arg0 == 73) {
                ;
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field7367[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3702(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x75);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3703(char[] arg0) {
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
                    var10005 = 91;
                    break;
                case 2:
                    var10005 = 32;
                    break;
                case 3:
                    var10005 = 78;
                    break;
                default:
                    var10005 = 117;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
