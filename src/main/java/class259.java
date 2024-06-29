import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class259 {

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    private int field3911;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "[Lrba;")
    private class459[] field3914;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3917 = new String[] { method2184(method2183("|ZgIJ")), method2184(method2183("|Zg0\u000bcR=2J")), method2184(method2183("cN%`")), method2184(method2183("v\u0015g\"\u001f")), method2184(method2183("|ZgJJ")), method2184(method2183("nM")), method2184(method2183("|ZgOJ")), method2184(method2183("|ZgMJ")), method2184(method2183("|ZgHJ")), method2184(method2183("|ZgNJ")) };

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "J")
    private long field3909;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Ld;")
    public static class158 field3910;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lrba;")
    private class459 field3912;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field3916;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2182(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)Lrba;", line = 6)
    public final class459 method2176(int arg0) {
        try {
            field3906++;
            if (this.field3912 == null) {
                return null;
            }
            class459 var2 = this.field3914[(int) ((long) (this.field3911 - 1) & this.field3909)];
            if (arg0 != -18934) {
                this.method2181(null, -125L, -52);
            }
            while (this.field3912 != var2) {
                if (this.field3912.field7075 == this.field3909) {
                    class459 var3 = this.field3912;
                    this.field3912 = this.field3912.field7074;
                    return var3;
                }
                this.field3912 = this.field3912.field7074;
            }
            this.field3912 = null;
            return null;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3917[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 37)
    public static final boolean method2177(byte arg0, String arg1) {
        try {
            if (arg0 != -72) {
                field3910 = null;
            }
            field3915++;
            return class735.method5342(arg1, field3916 == null ? (field3916 = method2182(field3917[5])) : field3916, (byte) -8);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3917[6] + arg0 + ',' + (arg1 == null ? field3917[2] : field3917[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(JI)Lrba;", line = 59)
    public final class459 method2178(long arg0, int arg1) {
        try {
            this.field3909 = arg0;
            field3913++;
            class459 var4 = this.field3914[(int) (arg0 & (long) (this.field3911 + arg1))];
            for (this.field3912 = var4.field7074; this.field3912 != var4; this.field3912 = this.field3912.field7074) {
                if (this.field3912.field7075 == arg0) {
                    class459 var5 = this.field3912;
                    this.field3912 = this.field3912.field7074;
                    return var5;
                }
            }
            this.field3912 = null;
            return null;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3917[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILmj;II)V", line = 88)
    public static final void method2179(int arg0, class683 arg1, int arg2, int arg3) {
        try {
            class417.field6593 = arg3;
            class466.field7144 = arg2;
            if (arg0 == 0) {
                class634.field9110 = arg1;
                field3908++;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3917[4] + arg0 + ',' + (arg1 == null ? field3917[2] : field3917[3]) + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(I)V", line = 104)
    public class259(int arg0) {
        try {
            this.field3911 = arg0;
            this.field3914 = new class459[arg0];
            for (int var2 = 0; var2 < arg0; var2++) {
                class459 var3 = this.field3914[var2] = new class459();
                var3.field7074 = var3;
                var3.field7073 = var3;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3917[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V", line = 129)
    public static void method2180(int arg0) {
        try {
            int var1 = -27 % ((arg0 + 27) / 63);
            field3910 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3917[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lrba;JI)V", line = 140)
    public final void method2181(class459 arg0, long arg1, int arg2) {
        try {
            if (arg0.field7073 != null) {
                arg0.method3558((byte) 73);
            }
            field3907++;
            class459 var5 = this.field3914[(int) ((long) (this.field3911 - 1) & arg1)];
            arg0.field7073 = var5.field7073;
            arg0.field7074 = var5;
            arg0.field7073.field7074 = arg0;
            if (arg2 != -19767) {
                this.field3914 = null;
            }
            arg0.field7074.field7073 = arg0;
            arg0.field7075 = arg1;
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3917[8] + (arg0 == null ? field3917[2] : field3917[3]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2183(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x62);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2184(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 13;
                    break;
                case 1:
                    var10005 = 59;
                    break;
                case 2:
                    var10005 = 73;
                    break;
                case 3:
                    var10005 = 12;
                    break;
                default:
                    var10005 = 98;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
