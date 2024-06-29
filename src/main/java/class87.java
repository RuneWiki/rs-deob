import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class87 {

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "Liha;")
    private class29 field1292 = new class29(64);

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    public int field1301 = 0;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "Lgda;")
    private class58 field1300;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
    public int field1290;

    @OriginalMember(owner = "client!gv", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1304 = new String[] { method869(method868("a\u000f_\u0018\u0001")), method869(method868("a\u000f_\u001d\u0001")), method869(method868("a\u000f_\u001e\u0001")), method869(method868("a\u000f_\u001c\u0001")), method869(method868("h\f\u001d7")), method869(method868("a\u000f_g@h\u0010\u0005e\u0001")), method869(method868("}W_uT")), method869(method868("a\u000f_\u001a\u0001")), method869(method868("i\t\u00145Cu")), method869(method868("a\u000f_\u001f\u0001")), method869(method868("a\u000f_\u0019\u0001")) };

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "Lhl;")
    public static class556 field1294 = new class556(127, -2);

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "Lvn;")
    public static class330 field1303 = new class330(33, -1);

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!gv", name = "n", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)V")
    public final void method861(int arg0) {
        try {
            field1298++;
            class29 var2 = this.field1292;
            synchronized (this.field1292) {
                this.field1292.method298(5);
            }
            if (arg0 > -92) {
                field1294 = null;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1304[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(I)V")
    public final void method862(int arg0) {
        try {
            class29 var2 = this.field1292;
            synchronized (this.field1292) {
                this.field1292.method304(1);
            }
            field1291++;
            if (arg0 >= -32) {
                field1294 = null;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1304[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)V")
    public final void method863(int arg0, int arg1) {
        try {
            field1296++;
            class29 var3 = this.field1292;
            synchronized (this.field1292) {
                this.field1292.method294(arg0, -630);
                if (arg1 > -50) {
                    method864(-118, 66, -49, 124, -92, 77, 110, 42, 111);
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1304[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method864(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        try {
            class382.field6139[class245.field3793++] = new class781(arg3, arg8, arg6, arg7, arg7, arg6, arg1, arg5, arg5, arg1, arg2, arg2, arg0, arg0);
            field1295++;
            if (arg4 <= 4) {
                method864(-90, -69, -50, 73, 70, -17, -26, 84, 105);
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field1304[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IZ)Ljc;")
    public final class466 method865(int arg0, boolean arg1) {
        try {
            field1293++;
            class29 var3 = this.field1292;
            class466 var5;
            synchronized (this.field1292) {
                if (!arg1) {
                    return null;
                }
                var5 = (class466) this.field1292.method302(-78, (long) arg0);
            }
            if (var5 != null) {
                return var5;
            }
            class58 var6 = this.field1300;
            byte[] var7;
            synchronized (this.field1300) {
                var7 = this.field1300.method604((byte) 52, arg0, 4);
            }
            class466 var8 = new class466();
            var8.field7156 = this;
            var8.field7146 = arg0;
            if (var7 != null) {
                var8.method3601(-10, new class176(var7));
            }
            var8.method3597((byte) -86);
            class29 var9 = this.field1292;
            synchronized (this.field1292) {
                this.field1292.method295(false, (long) arg0, var8);
                return var8;
            }
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field1304[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Ltga;Ljava/lang/String;ZZB)V")
    public static final void method866(class61 arg0, String arg1, boolean arg2, boolean arg3, byte arg4) {
        try {
            class115.method1143(arg1, arg0, arg3, (byte) -106, arg2, field1304[8]);
            int var5 = 35 % ((46 - arg4) / 52);
            field1299++;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field1304[7] + (arg0 == null ? field1304[4] : field1304[6]) + ',' + (arg1 == null ? field1304[4] : field1304[6]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
    public static void method867(byte arg0) {
        try {
            field1294 = null;
            if (arg0 <= -51) {
                field1303 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1304[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Lpo;ILgda;)V")
    public class87(class585 arg0, int arg1, class58 arg2) {
        try {
            this.field1300 = arg2;
            this.field1290 = this.field1300.method580(71, 4);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1304[5] + (arg0 == null ? field1304[4] : field1304[6]) + ',' + arg1 + ',' + (arg2 == null ? field1304[4] : field1304[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!gv", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method868(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x29);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gv", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method869(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 6;
                    break;
                case 1:
                    var10005 = 121;
                    break;
                case 2:
                    var10005 = 113;
                    break;
                case 3:
                    var10005 = 91;
                    break;
                default:
                    var10005 = 41;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
