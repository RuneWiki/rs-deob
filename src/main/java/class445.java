import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class445 extends class568 {

    @OriginalMember(owner = "client!ep", name = "v", descriptor = "I")
    public int field6926;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
    public int field6920;

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field6930 = new String[] { method3487(method3486("r\u0010\u0016\u0018C")), method3487(method3486("r\u0010\u0016g\u0002y\tLeC")), method3487(method3486("y\u0015T7")), method3487(method3486("r\u0010\u0016\u001dC")), method3487(method3486("lN\u0016u\u0016")), method3487(method3486("r\u0010\u0016\u001aC")), method3487(method3486("r\u0010\u0016\u001cC")), method3487(method3486("r\u0010\u0016\u0019C")), method3487(method3486("r\u0010\u0016\u001eC")), method3487(method3486("r\u0010\u0016\u001fC")) };

    @OriginalMember(owner = "client!ep", name = "t", descriptor = "Z")
    public static boolean field6928 = false;

    @OriginalMember(owner = "client!ep", name = "q", descriptor = "I")
    public static int field6919;

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!ep", name = "s", descriptor = "I")
    public static int field6923;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!ep", name = "r", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!ep", name = "u", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(II)Z", line = 6)
    public final boolean method3479(int arg0, int arg1) {
        try {
            field6921++;
            if (arg0 != -3979) {
                method3480(null, -62);
            }
            return (this.field6926 >> arg1 + 1 & 0x1) != 0;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6930[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 19)
    public static final boolean method3480(String arg0, int arg1) {
        try {
            int var2 = -80 % ((20 - arg1) / 59);
            field6929++;
            if (arg0 == null) {
                return false;
            }
            for (int var3 = 0; var3 < class198.field3145; var3++) {
                if (arg0.equalsIgnoreCase(class129.field1846[var3])) {
                    return true;
                }
            }
            return arg0.equalsIgnoreCase(class438.field6846.field10821);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field6930[3] + (arg0 == null ? field6930[2] : field6930[4]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)I", line = 54)
    public final int method3481(int arg0) {
        try {
            if (arg0 <= 3) {
                this.method3483((byte) 45);
            }
            field6927++;
            return class648.method4720((byte) 40, this.field6926);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6930[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(II)V", line = 68)
    public class445(int arg0, int arg1) {
        try {
            this.field6926 = arg0;
            this.field6920 = arg1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6930[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)Z", line = 78)
    public final boolean method3482(byte arg0) {
        try {
            if (arg0 == -110) {
                field6924++;
                return (this.field6926 & 0x1) != 0;
            } else {
                return true;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6930[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(B)Z", line = 94)
    public final boolean method3483(byte arg0) {
        try {
            field6923++;
            if (arg0 != -52) {
                field6925 = -48;
            }
            return (this.field6926 >> 21 & 0x1) != 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6930[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)Z", line = 105)
    public final boolean method3484(int arg0) {
        try {
            field6922++;
            if (arg0 < 101) {
                this.method3482((byte) -10);
            }
            return (this.field6926 & 0x7D88F4) >> 22 != 0;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6930[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)I", line = 116)
    public final int method3485(byte arg0) {
        try {
            if (arg0 >= -22) {
                this.method3482((byte) -88);
            }
            field6919++;
            return (this.field6926 & 0x1DFA12) >> 18;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field6930[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3486(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x6B);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ep", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3487(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 23;
                    break;
                case 1:
                    var10005 = 96;
                    break;
                case 2:
                    var10005 = 56;
                    break;
                case 3:
                    var10005 = 91;
                    break;
                default:
                    var10005 = 107;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
