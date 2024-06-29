import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class78 {

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "Lui;")
    private class251 field1099 = new class251(64);

    @OriginalMember(owner = "client!nba", name = "k", descriptor = "I")
    public int field1105 = 0;

    @OriginalMember(owner = "client!nba", name = "j", descriptor = "Llga;")
    private class47 field1097;

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "client!nba", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1106 = new String[] { method785(method784("L\u0018]-)")), method785(method784("YT\u0012-h^X\u001awj\u001f")), method785(method784("YC\u001fo")), method785(method784("YT\u0012-\u0010\u001f")), method785(method784("YT\u0012-\u0015\u001f")), method785(method784("YT\u0012-\u0017\u001f")), method785(method784("YT\u0012-\u0011\u001f")), method785(method784("YT\u0012-\u0016\u001f")), method785(method784("YT\u0012-\u0012\u001f")) };

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "I")
    public static int field1098 = -1;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!nba", name = "i", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIIIIZI)I")
    public static final int method778(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        try {
            int var10 = arg1 & 0x3;
            if (arg5) {
                field1098 = -17;
            }
            field1103++;
            if ((arg3 & 0x1) == 1) {
                int var7 = arg6;
                arg6 = arg4;
                arg4 = var7;
            }
            if (var10 == 0) {
                return arg2;
            } else if (var10 == 1) {
                return arg0;
            } else if (var10 == 2) {
                return 1 + 7 - arg2 - arg6;
            } else {
                return 7 + 1 - arg4 - arg0;
            }
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field1106[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)V")
    public final void method779(byte arg0) {
        try {
            field1101++;
            class251 var2 = this.field1099;
            synchronized (this.field1099) {
                this.field1099.method2043(false);
            }
            if (arg0 != 98) {
                method780(-25);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1106[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I)Lifa;")
    public static final class715 method780(int arg0) {
        try {
            if (arg0 != -1) {
                field1098 = -22;
            }
            field1095++;
            return class534.field7727;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1106[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)V")
    public final void method781(int arg0) {
        try {
            field1102++;
            class251 var2 = this.field1099;
            synchronized (this.field1099) {
                this.field1099.method2047(11914);
                if (arg0 != 2) {
                    this.method783(-81, (byte) -60);
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1106[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IB)V")
    public final void method782(int arg0, byte arg1) {
        try {
            int var3 = 81 % (arg1 / 48);
            field1104++;
            class251 var4 = this.field1099;
            synchronized (this.field1099) {
                this.field1099.method2038(0, arg0);
            }
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field1106[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(IB)Lnga;")
    public final class461 method783(int arg0, byte arg1) {
        try {
            field1096++;
            class251 var3 = this.field1099;
            class461 var4;
            synchronized (this.field1099) {
                var4 = (class461) this.field1099.method2053(0, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class47 var5 = this.field1097;
            byte[] var6;
            synchronized (this.field1097) {
                var6 = this.field1097.method512(arg0, 4, (byte) -7);
                if (arg1 != 97) {
                    this.method782(-9, (byte) -90);
                }
            }
            class461 var7 = new class461();
            var7.field6719 = arg0;
            var7.field6721 = this;
            if (var6 != null) {
                var7.method3545(new class711(var6), 122);
            }
            var7.method3547(true);
            class251 var8 = this.field1099;
            synchronized (this.field1099) {
                this.field1099.method2051((long) arg0, var7, 93);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field1106[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lfs;ILlga;)V")
    public class78(class796 arg0, int arg1, class47 arg2) {
        try {
            this.field1097 = arg2;
            this.field1100 = this.field1097.method509(true, 4);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1106[1] + (arg0 == null ? field1106[2] : field1106[0]) + ',' + arg1 + ',' + (arg2 == null ? field1106[2] : field1106[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!nba", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method784(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x54);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nba", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method785(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 55;
                    break;
                case 1:
                    var10005 = 54;
                    break;
                case 2:
                    var10005 = 115;
                    break;
                case 3:
                    var10005 = 3;
                    break;
                default:
                    var10005 = 84;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
