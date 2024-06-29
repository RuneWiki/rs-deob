import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class82 implements class515 {

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "Ldq;")
    private class4 field1138;

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "[Lwg;")
    private class81[] field1130;

    @OriginalMember(owner = "client!fea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1141 = new String[] { method812(method811("Fi|#\f\b")), method812(method811("Fi|#\u000e\b")), method812(method811("Fi|#\b\b")), method812(method811("Fi|#qIbtys\b")), method812(method811("[\"3#0")), method812(method811("Nyqa")), method812(method811("Fi|#\t\b")), method812(method811("Fi|#\u000f\b")), method812(method811("Fi|#\u0005\b")), method812(method811("Fi|#\u000b\b")), method812(method811("Fi|#\n\b")) };

    @OriginalMember(owner = "client!fea", name = "f", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!fea", name = "h", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!fea", name = "j", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!fea", name = "k", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!fea", name = "i", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!fea", name = "g", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "Lha;")
    private class18 field1140;

    @OriginalMember(owner = "client!fea", name = "l", descriptor = "Z")
    private boolean field1137;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lqo;IIILqo;IIIII)V", line = 3)
    public static final void method803(class170 arg0, int arg1, int arg2, int arg3, class170 arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        try {
            field1139++;
            int var10 = arg4.method1443(arg6 ^ 0x146F);
            if (var10 != -1) {
                Object var11 = null;
                class392 var12 = (class392) class30.field378.method2053(0, (long) var10);
                if (var12 == null) {
                    class66[] var13 = class66.method694(class524.field7640, var10, 0);
                    if (var13 == null) {
                        return;
                    }
                    var12 = class236.field3418.method231(var13[0], true);
                    class30.field378.method2051((long) var10, var12, 93);
                }
                class115.method1061(arg0.field2981, arg5 >> 1, arg6 + 35, arg0.field2969, 0, arg7, arg0.field2984, arg0.method1437((byte) -28) * 256, arg1, arg9 >> 1);
                int var14 = class302.field4219[0] + arg3 - 18;
                int var15 = arg2 / 4 * 18 + var14;
                int var16 = class302.field4219[1] + arg8 - 16 - 54;
                int var17 = arg2 % 4 * 18 + var16;
                var12.method3074(var15, var17);
                if (arg0 == arg4) {
                    class236.field3418.method241(18, var17 - 1, -256, -116, 18, var15 - 1);
                }
                class232.method1925(var17 - 1, var15 + -1, var17 + 18, var15 - -18, (byte) 96);
                class87 var18 = class750.method5430((byte) 1);
                var18.field1227 = var17;
                var18.field1223 = var15;
                var18.field1226 = var15 + 16;
                var18.field1228 = arg4;
                var18.field1224 = arg6 + var17;
                class317.field4344.method3618(var18, arg6 + 21);
            }
        } catch (RuntimeException var20) {
            throw class665.method4799(var20, field1141[10] + (arg0 == null ? field1141[5] : field1141[4]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field1141[5] : field1141[4]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Z)V", line = 54)
    public final void method804(boolean arg0) {
        try {
            field1135++;
            if (arg0) {
                this.method807((byte) 62);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1141[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)I", line = 64)
    public final int method805(byte arg0) {
        try {
            if (arg0 >= -94) {
                return -33;
            } else {
                field1136++;
                return this.field1138.field57;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1141[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V", line = 75)
    public final void method806(int arg0) {
        try {
            if (arg0 != 31428) {
                this.method804(true);
            }
            if (class236.field3418 != this.field1140) {
                this.field1137 = true;
                this.field1140 = class236.field3418;
            }
            field1133++;
            this.field1140.method243(0);
            class81[] var2 = this.field1130;
            for (int var3 = 0; var3 < var2.length; var3++) {
                class81 var4 = var2[var3];
                if (var4 != null) {
                    var4.method802(116);
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1141[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(B)I", line = 106)
    public final int method807(byte arg0) {
        try {
            field1134++;
            int var2 = 0;
            class81[] var3 = this.field1130;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class81 var5 = var3[var4];
                if (var5 == null || var5.method800((byte) -31)) {
                    var2++;
                }
            }
            if (arg0 <= 119) {
                method803(null, 81, 106, 0, null, -71, -91, -1, 13, 48);
            }
            return var2 * 100 / this.field1130.length;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1141[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILjc;I)V", line = 136)
    public static final void method808(int arg0, class711 arg1, int arg2) {
        try {
            if (arg0 != 24) {
                method808(-14, null, -3);
            }
            if (class397.field5776 != null) {
                try {
                    class397.field5776.method1166(0L, 0);
                    class397.field5776.method1157(arg1.field9996, -1, arg2, 24);
                } catch (Exception var4) {
                }
            }
            field1132++;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1141[8] + arg0 + ',' + (arg1 == null ? field1141[5] : field1141[4]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ZJ)Z", line = 156)
    public final boolean method809(boolean arg0, long arg1) {
        try {
            field1131++;
            if (!arg0) {
                this.method807((byte) 85);
            }
            return arg1 + ((long) this.field1138.field55) <= class614.method4531(-81);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1141[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(BZ)V", line = 169)
    public final void method810(byte arg0, boolean arg1) {
        try {
            boolean var8 = true;
            field1129++;
            if (arg0 >= -12) {
                this.method805((byte) -105);
            }
            class81[] var3 = this.field1130;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class81 var5 = var3[var4];
                if (var5 != null) {
                    var5.method801(125, var8 || this.field1137);
                }
            }
            this.field1137 = false;
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1141[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Ldq;Laea;)V", line = 199)
    public class82(class4 arg0, class679 arg1) {
        try {
            this.field1138 = arg0;
            this.field1130 = new class81[this.field1138.field56.length];
            for (int var3 = 0; var3 < this.field1130.length; var3++) {
                this.field1130[var3] = arg1.method4873(89, this.field1138.field56[var3]);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1141[3] + (arg0 == null ? field1141[5] : field1141[4]) + ',' + (arg1 == null ? field1141[5] : field1141[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method811(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method812(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 32;
                    break;
                case 1:
                    var10005 = 12;
                    break;
                case 2:
                    var10005 = 29;
                    break;
                case 3:
                    var10005 = 13;
                    break;
                default:
                    var10005 = 77;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
