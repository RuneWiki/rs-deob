import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class222 implements class81 {

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "Llga;")
    private class47 field3216;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "Llga;")
    private class47 field3223;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "Lsca;")
    private class667 field3225;

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3226 = new String[] { method1867(method1866("?#\u0019\u0007\u007f")), method1867(method1866("?#\u0019\u000e\u007f")), method1867(method1866("\"}\u0019b*")), method1867(method1866("7&[ ")), method1867(method1866("?#\u0019p>7:Cr\u007f")), method1867(method1866("?#\u0019\b\u007f")), method1867(method1866("?#\u0019\n\u007f")), method1867(method1866("yo^!0d")), method1867(method1866("?#\u0019\u000f\u007f")), method1867(method1866("?#\u0019\t\u007f")), method1867(method1866("?#\u0019\u000b\u007f")), method1867(method1866("?#\u0019\r\u007f")) };

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "Lmv;")
    public static class125 field3215 = new class125(56, 5);

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "[I")
    public static int[] field3218 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
    public static int field3222;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "Lda;")
    private class216 field3214;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)Z", line = 5)
    public final boolean method800(byte arg0) {
        try {
            field3224++;
            boolean var2 = true;
            if (arg0 > -2) {
                method1862((byte) -5, -63, null, 39);
            }
            if (!this.field3216.method530(false, this.field3225.field9402)) {
                var2 = false;
            }
            if (!this.field3223.method530(false, this.field3225.field9402)) {
                var2 = false;
            }
            return var2;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3226[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IZ)V", line = 27)
    public final void method801(int arg0, boolean arg1) {
        try {
            if (arg1) {
                int var3 = this.field3225.field9400.method2058(this.field3225.field9418, class500.field7304, 0) + this.field3225.field9403;
                int var4 = this.field3225.field9405.method4767(23467, this.field3225.field9419, class791.field11507) + this.field3225.field9411;
                this.field3214.method1815(var4, this.field3225.field9415, var3, null, this.field3225.field9404, this.field3225.field9419, 0, this.field3225.field9413, this.field3225.field9408, 0, null, -93, this.field3225.field9412, null, this.field3225.field9418, this.field3225.field9407);
            }
            field3213++;
            int var5 = -59 % ((15 - arg0) / 60);
        } catch (RuntimeException var7) {
            throw class665.method4799(var7, field3226[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)Z", line = 45)
    public static final boolean method1861(int arg0, int arg1, int arg2) {
        try {
            field3222++;
            if (arg1 != -27943) {
                field3215 = null;
            }
            return (arg0 & 0x800) != 0;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field3226[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(BI[BI)I", line = 57)
    public static final int method1862(byte arg0, int arg1, byte[] arg2, int arg3) {
        try {
            field3219++;
            int var4 = -1;
            if (arg0 < 20) {
                field3215 = null;
            }
            for (int var5 = arg3; var5 < arg1; var5++) {
                var4 = var4 >>> 8 ^ class505.field7398[(arg2[var5] ^ var4) & 0xFF];
            }
            return ~var4;
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field3226[11] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field3226[3] : field3226[2]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V", line = 89)
    public static void method1863(int arg0) {
        try {
            field3218 = null;
            field3215 = null;
            if (arg0 != -1) {
                field3218 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field3226[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V", line = 102)
    public final void method802(int arg0) {
        try {
            field3220++;
            int var2 = 22 / ((38 - arg0) / 41);
            class161 var3 = class692.method4940(this.field3225.field9402, this.field3223, 3);
            this.field3214 = class236.field3418.method145(var3, class66.method702(this.field3216, this.field3225.field9402), true);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3226[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I[I)Ljava/lang/String;", line = 117)
    public static final String method1864(int arg0, int[] arg1) {
        try {
            field3212++;
            StringBuffer var2 = new StringBuffer();
            int var3 = class501.field7319;
            for (int var4 = arg0; var4 < arg1.length; var4++) {
                class11 var5 = class646.field9183.method5249(arg0 ^ 0x74, arg1[var4]);
                if (var5.field159 != -1) {
                    class392 var6 = (class392) class282.field3973.method2053(0, (long) var5.field159);
                    if (var6 == null) {
                        class66 var7 = class66.method704(class524.field7640, var5.field159, 0);
                        if (var7 != null) {
                            var6 = class236.field3418.method231(var7, true);
                            class282.field3973.method2051((long) var5.field159, var6, 93);
                        }
                    }
                    if (var6 != null) {
                        class342.field4978[var3] = var6;
                        var2.append(field3226[7]).append(var3).append(">");
                        var3++;
                    }
                }
            }
            return var2.toString();
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field3226[8] + arg0 + ',' + (arg1 == null ? field3226[3] : field3226[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(B)V", line = 165)
    public static final void method1865(byte arg0) {
        try {
            field3221++;
            int var1 = -35 / ((-arg0 - 74) / 49);
            for (int var2 = 0; var2 < class347.field5048; var2++) {
                class441 var3 = class759.field10834[var2];
                if (var3.field6508 == 3) {
                    if (var3.field6511 == null) {
                        var3.field6515 = Integer.MIN_VALUE;
                    } else {
                        class261.field3699.method4232(var3.field6511);
                    }
                }
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3226[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Llga;Llga;Lsca;)V", line = 195)
    public class222(class47 arg0, class47 arg1, class667 arg2) {
        try {
            this.field3216 = arg0;
            this.field3223 = arg1;
            this.field3225 = arg2;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field3226[4] + (arg0 == null ? field3226[3] : field3226[2]) + ',' + (arg1 == null ? field3226[3] : field3226[2]) + ',' + (arg2 == null ? field3226[3] : field3226[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1866(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x57);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1867(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 89;
                    break;
                case 1:
                    var10005 = 83;
                    break;
                case 2:
                    var10005 = 55;
                    break;
                case 3:
                    var10005 = 76;
                    break;
                default:
                    var10005 = 87;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
