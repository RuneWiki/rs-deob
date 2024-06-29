import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class135 extends class578 {

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public int field1739;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    public int field1742;

    @OriginalMember(owner = "client!le", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1752 = new String[] { method1190(method1189("QPmc")), method1190(method1189("D\u000b/!H")), method1190(method1189("S@/H\u001d")), method1190(method1189("S@/L\u001d")), method1190(method1189("S@/M\u001d")), method1190(method1189("S@/K\u001d")), method1190(method1189("S@/G\u001d")), method1190(method1189("S@/3\\QLu1\u001d")), method1190(method1189("S@/N\u001d")), method1190(method1189("S@/J\u001d")), method1190(method1189("S@/I\u001d")) };

    @OriginalMember(owner = "client!le", name = "j", descriptor = "Lmv;")
    public static class125 field1749 = new class125(45, 3);

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public static int field1740;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "Llga;")
    public static class47 field1751;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "Lhja;")
    public static class520 field1750;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)Z")
    public final boolean method1181(int arg0, int arg1) {
        try {
            if (arg1 == 0) {
                field1746++;
                return (this.field1739 >> arg0 + 1 & 0x1) != 0;
            } else {
                return false;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1752[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)Z")
    public final boolean method1182(int arg0) {
        try {
            if (arg0 != -1) {
                field1751 = null;
            }
            field1747++;
            return (this.field1739 & 0x54AC02) >> 22 != 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1752[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I[I[Ljava/lang/Object;IB)V")
    public static final void method1183(int arg0, int[] arg1, Object[] arg2, int arg3, byte arg4) {
        try {
            field1745++;
            if (arg0 > arg3) {
                int var5 = (arg3 + arg0) / 2;
                int var6 = arg3;
                int var7 = arg1[var5];
                arg1[var5] = arg1[arg0];
                arg1[arg0] = var7;
                Object var8 = arg2[var5];
                arg2[var5] = arg2[arg0];
                arg2[arg0] = var8;
                int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
                for (int var10 = arg3; var10 < arg0; var10++) {
                    if (arg1[var10] < (var10 & var9) + var7) {
                        int var11 = arg1[var10];
                        arg1[var10] = arg1[var6];
                        arg1[var6] = var11;
                        Object var12 = arg2[var10];
                        arg2[var10] = arg2[var6];
                        arg2[var6++] = var12;
                    }
                }
                arg1[arg0] = arg1[var6];
                arg1[var6] = var7;
                arg2[arg0] = arg2[var6];
                arg2[var6] = var8;
                method1183(var6 - 1, arg1, arg2, arg3, (byte) -37);
                method1183(arg0, arg1, arg2, var6 + 1, (byte) -37);
            }
            if (arg4 != -37) {
                field1749 = null;
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field1752[2] + arg0 + ',' + (arg1 == null ? field1752[0] : field1752[1]) + ',' + (arg2 == null ? field1752[0] : field1752[1]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)Z")
    public final boolean method1184(boolean arg0) {
        try {
            field1741++;
            if (!arg0) {
                this.field1742 = -29;
            }
            return (this.field1739 >> 21 & 0x1) != 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1752[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)I")
    public final int method1185(byte arg0) {
        try {
            if (arg0 > -51) {
                return 46;
            } else {
                field1743++;
                return (this.field1739 & 0x1C6AD8) >> 18;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1752[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(B)V")
    public static void method1186(byte arg0) {
        try {
            field1750 = null;
            if (arg0 <= 57) {
                field1750 = null;
            }
            field1751 = null;
            field1749 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1752[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(II)V")
    public class135(int arg0, int arg1) {
        try {
            this.field1739 = arg0;
            this.field1742 = arg1;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1752[7] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(B)Z")
    public final boolean method1187(byte arg0) {
        try {
            if (arg0 != 10) {
                this.method1187((byte) 9);
            }
            field1740++;
            return (this.field1739 & 0x1) != 0;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1752[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)I")
    public final int method1188(int arg0) {
        try {
            if (arg0 == 1) {
                field1744++;
                return class568.method4237(this.field1739, (byte) -82);
            } else {
                return -74;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1752[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!le", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1189(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x35);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!le", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1190(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 63;
                    break;
                case 1:
                    var10005 = 37;
                    break;
                case 2:
                    var10005 = 1;
                    break;
                case 3:
                    var10005 = 15;
                    break;
                default:
                    var10005 = 53;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
