import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class712 {

    @OriginalMember(owner = "client!jca", name = "h", descriptor = "B")
    public byte field10328;

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "S")
    public short field10324;

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "I")
    public int field10322;

    @OriginalMember(owner = "client!jca", name = "j", descriptor = "Z")
    public boolean field10320;

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "I")
    public int field10327;

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "I")
    public int field10326;

    @OriginalMember(owner = "client!jca", name = "g", descriptor = "S")
    public short field10325;

    @OriginalMember(owner = "client!jca", name = "o", descriptor = "I")
    public int field10329;

    @OriginalMember(owner = "client!jca", name = "k", descriptor = "S")
    public short field10323;

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "I")
    public int field10317;

    @OriginalMember(owner = "client!jca", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10332 = new String[] { method5194(method5193(">\u001e\r#2|")), method5194(method5193(">\u001e\r#M=\u0013\u0005yO|")), method5194(method5193(">\u001e\r#3|")) };

    @OriginalMember(owner = "client!jca", name = "i", descriptor = "Lel;")
    public static class573 field10318 = new class573(46, 12);

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
    public static int field10330 = 0;

    @OriginalMember(owner = "client!jca", name = "l", descriptor = "Leba;")
    public static class614 field10331 = new class614();

    @OriginalMember(owner = "client!jca", name = "n", descriptor = "I")
    public static int field10319;

    @OriginalMember(owner = "client!jca", name = "m", descriptor = "I")
    public static int field10321;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(Lvv;Z)Z")
    public static final boolean method5190(class343 arg0, boolean arg1) {
        boolean var2 = class555.field8261 == class195.field2617;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method1904(310992073);
        if (arg0.field5330 < 0 || arg0.field5329 < 0 || arg0.field5335 >= class132.field1543 || arg0.field5325 >= class216.field3296) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field5330; var7 <= arg0.field5335; var7++) {
            for (int var11 = arg0.field5329; var11 <= arg0.field5325; var11++) {
                class96 var12 = class483.method3683(arg0.field6200, var7, var11);
                if (var12 != null) {
                    class681 var13 = class715.method5204((byte) 121, arg0);
                    class681 var14 = var12.field1085;
                    if (var14 == null) {
                        var12.field1085 = var13;
                    } else {
                        while (var14.field9865 != null) {
                            var14 = var14.field9865;
                        }
                        var14.field9865 = var13;
                    }
                    if (var2 && (class614.field8972[var7][var11] & 0xFF000000) != 0) {
                        var3 = class614.field8972[var7][var11];
                        var4 = class218.field3366[var7][var11];
                        var5 = class574.field8476[var7][var11];
                    }
                    if (!arg1 && var12.field1081 != null && var12.field1081.field10900 > var6) {
                        var6 = var12.field1081.field10900;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field5330; var8 <= arg0.field5335; var8++) {
                for (int var9 = arg0.field5329; var9 <= arg0.field5325; var9++) {
                    if ((class614.field8972[var8][var9] & 0xFF000000) == 0) {
                        class614.field8972[var8][var9] = var3;
                        class218.field3366[var8][var9] = var4;
                        class574.field8476[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class400.field5975[class272.field4124++] = arg0;
        } else {
            int var10 = class555.field8261 == class195.field2617 ? 1 : 0;
            if (!arg0.method1082((byte) 27)) {
                arg0.field6207 = class74.field862[var10];
                class74.field862[var10] = arg0;
            } else if (arg0.method1098(false)) {
                arg0.field6207 = class273.field4136[var10];
                class273.field4136[var10] = arg0;
            } else {
                arg0.field6207 = class106.field1228[var10];
                class106.field1228[var10] = arg0;
                class222.field3412 = true;
            }
        }
        if (arg1) {
            arg0.field6199 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(I)V")
    public static void method5191(int arg0) {
        try {
            field10331 = null;
            if (arg0 != 12) {
                field10318 = null;
            }
            field10318 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field10332[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(ZIIZI)I")
    public static final int method5192(boolean arg0, int arg1, int arg2, boolean arg3, int arg4) {
        try {
            field10321++;
            class495 var5 = class668.method4916(arg1, arg0, 3);
            if (var5 == null) {
                return 0;
            }
            int var6 = arg4;
            for (int var7 = 0; var7 < var5.field7103.length; var7++) {
                if (var5.field7103[var7] >= 0 && var5.field7103[var7] < class540.field7920.field9873) {
                    class530 var8 = class540.field7920.method5000(var5.field7103[var7], (byte) 41);
                    int var9 = var8.method3999(109, arg2, class566.field8395.method3413((byte) -34, arg2).field2506);
                    if (arg3) {
                        var6 += var5.field7108[var7] * var9;
                    } else {
                        var6 += var9;
                    }
                }
            }
            return var6;
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field10332[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!jca", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        try {
            this.field10328 = (byte) arg8;
            this.field10324 = (short) arg4;
            this.field10322 = arg3;
            this.field10320 = arg10;
            this.field10327 = arg1;
            this.field10326 = arg2;
            this.field10325 = (short) arg6;
            this.field10329 = arg11;
            this.field10323 = (short) arg5;
            this.field10317 = arg0;
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field10332[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!jca", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5193(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x71);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jca", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5194(char[] arg0) {
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
                    var10005 = 125;
                    break;
                case 2:
                    var10005 = 108;
                    break;
                case 3:
                    var10005 = 13;
                    break;
                default:
                    var10005 = 113;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
