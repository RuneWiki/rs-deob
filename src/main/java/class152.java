import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class152 {

    @OriginalMember(owner = "client!fea", name = "i", descriptor = "Lwq;")
    private class178 field1873 = new class178(64);

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "Lla;")
    private class476 field1871;

    @OriginalMember(owner = "client!fea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1881 = new String[] { method1280(method1279("7\u001e7/Jy")), method1280(method1279("<\u00125sa\"\u00140u")), method1280(method1279("7\u001e7/Hy")), method1280(method1279("7\u001e7/Ky")), method1280(method1279("7\u001e7/My")), method1280(method1279("?\u000e:m")), method1280(method1279("*Ux/s")), method1280(method1279("7\u001e7/28\u0015?u0y")), method1280(method1279("7\u001e7/Oy")), method1280(method1279("7\u001e7/Ly")) };

    @OriginalMember(owner = "client!fea", name = "f", descriptor = "[I")
    public static int[] field1872 = new int[2];

    @OriginalMember(owner = "client!fea", name = "c", descriptor = "I")
    public static int field1874 = 1;

    @OriginalMember(owner = "client!fea", name = "e", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!fea", name = "h", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!fea", name = "g", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!fea", name = "d", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!fea", name = "j", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "Lfea;")
    public static class152 field1880;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)V", line = 3)
    public static final void method1273(byte arg0) {
        try {
            field1876++;
            if (class138.field1645 == 3) {
                class86.method728(4, (byte) -96);
            } else if (class138.field1645 == 7) {
                class86.method728(8, (byte) -96);
            } else if (class138.field1645 == 10) {
                class86.method728(11, (byte) -96);
            }
            int var1 = 116 % ((arg0 - 45) / 45);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1881[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(Ld;Lla;I)V", line = 29)
    public static final void method1274(class160 arg0, class476 arg1, int arg2) {
        try {
            field1878++;
            class702.field10199 = arg0;
            class90.field1036 = arg1;
            if (arg2 != 74) {
                method1273((byte) -109);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1881[8] + (arg0 == null ? field1881[5] : field1881[6]) + ',' + (arg1 == null ? field1881[5] : field1881[6]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ZLib;)Llr;", line = 42)
    public static final class783 method1275(boolean arg0, class163 arg1) {
        try {
            field1879++;
            if (!arg0) {
                return null;
            }
            int var2 = arg1.method1455((byte) 62);
            class613 var3 = class325.method2758(-48)[arg1.method1455((byte) 62)];
            class288 var4 = class349.method2869((byte) -65)[arg1.method1455((byte) 62)];
            int var5 = arg1.method1442(65280);
            int var6 = arg1.method1442(65280);
            int var7 = arg1.method1445((byte) 126);
            int var8 = arg1.method1445((byte) 115);
            int var9 = arg1.method1453((byte) 95);
            int var10 = arg1.method1453((byte) 101);
            int var11 = arg1.method1453((byte) 87);
            boolean var12 = arg1.method1455((byte) 62) == 1;
            return new class783(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field1881[4] + arg0 + ',' + (arg1 == null ? field1881[5] : field1881[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V", line = 79)
    public static final void method1276(int arg0) {
        try {
            field1875++;
            if (class33.field396.toLowerCase().indexOf(field1881[1]) == -1) {
                class530.field7730[46] = 72;
                class530.field7730[61] = 27;
                class530.field7730[59] = 57;
                class530.field7730[47] = 73;
                class530.field7730[92] = 74;
                class530.field7730[44] = 71;
                class530.field7730[91] = 42;
                class530.field7730[45] = 26;
                class530.field7730[93] = 43;
                if (class33.field380 == null) {
                    class530.field7730[222] = 59;
                    class530.field7730[192] = 58;
                } else {
                    class530.field7730[520] = 59;
                    class530.field7730[192] = 28;
                    class530.field7730[222] = 58;
                }
            } else {
                class530.field7730[189] = 26;
                class530.field7730[223] = 28;
                class530.field7730[186] = 57;
                class530.field7730[192] = 58;
                class530.field7730[219] = 42;
                class530.field7730[221] = 43;
                class530.field7730[190] = 72;
                class530.field7730[187] = 27;
                class530.field7730[191] = 73;
                class530.field7730[188] = 71;
                class530.field7730[222] = 59;
                class530.field7730[220] = 74;
            }
            if (arg0 < 34) {
                field1874 = 124;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1881[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(Lto;ILla;)V", line = 171)
    public class152(class8 arg0, int arg1, class476 arg2) {
        try {
            this.field1871 = arg2;
            this.field1871.method3646(5, (byte) -47);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1881[7] + (arg0 == null ? field1881[5] : field1881[6]) + ',' + arg1 + ',' + (arg2 == null ? field1881[5] : field1881[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(II)Lcea;", line = 140)
    public final class225 method1277(int arg0, int arg1) {
        try {
            field1877++;
            class178 var3 = this.field1873;
            class225 var4;
            synchronized (this.field1873) {
                var4 = (class225) this.field1873.method1558((byte) 96, (long) arg0);
            }
            if (var4 != null) {
                return var4;
            }
            class476 var5 = this.field1871;
            byte[] var6;
            synchronized (this.field1871) {
                var6 = this.field1871.method3632(5, arg0, arg1 ^ 0x99);
            }
            class225 var7 = new class225();
            if (var6 != null) {
                var7.method1948(new class163(var6), arg1 - 221);
            }
            class178 var8 = this.field1873;
            synchronized (this.field1873) {
                this.field1873.method1556((long) arg0, var7, 1);
            }
            if (arg1 != 221) {
                method1276(57);
            }
            return var7;
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field1881[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "(B)V", line = 186)
    public static void method1278(byte arg0) {
        try {
            if (arg0 == -76) {
                field1880 = null;
                field1872 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1881[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1279(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0xE);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1280(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 81;
                    break;
                case 1:
                    var10005 = 123;
                    break;
                case 2:
                    var10005 = 86;
                    break;
                case 3:
                    var10005 = 1;
                    break;
                default:
                    var10005 = 14;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
