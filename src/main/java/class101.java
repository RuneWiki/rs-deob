import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class101 {

    @OriginalMember(owner = "client!op", name = "i", descriptor = "Lek;")
    private class295 field1225 = new class295();

    @OriginalMember(owner = "client!op", name = "f", descriptor = "I")
    private int field1222;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "I")
    private int field1226;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "Lva;")
    private class288 field1236;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "Z")
    public static boolean field1218 = true;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "Lgp;")
    public static class30 field1227 = null;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "Lo;")
    public static class21 field1234 = null;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "I")
    public static int field1235 = 0;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public static int field1217;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "I")
    public static int field1223;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "I")
    public static int field1224;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!op", name = "m", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!op", name = "p", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!op", name = "u", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;", line = 10)
    public static final Class method555(byte arg0, String arg1) throws ClassNotFoundException {
        field1223++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else {
            if (arg0 != -66) {
                method566((byte) 91);
            }
            if (arg1.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg1.equals("F")) {
                return Float.TYPE;
            } else if (arg1.equals("D")) {
                return Double.TYPE;
            } else if (arg1.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg1);
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(II)V", line = 50)
    public static final void method556(int arg0, int arg1) {
        field1224++;
        class20 var2 = class369.method2351((byte) 109, 10, arg1);
        var2.method148(-11806);
        int var3 = 8 / ((36 - arg0) / 48);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V", line = 63)
    public final void method557(int arg0) {
        if (arg0 != 0) {
            return;
        }
        for (class311 var2 = (class311) this.field1225.method1949(true); var2 != null; var2 = (class311) this.field1225.method1945((byte) -96)) {
            if (var2.method422(126)) {
                var2.method2594((byte) -22);
                var2.method2133(-31493);
                this.field1222++;
            }
        }
        field1232++;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BIILvl;)J", line = 88)
    public static final long method558(byte arg0, int arg1, int arg2, class9 arg3) {
        field1221++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        if (arg0 != 127) {
            method565(-117);
        }
        class88 var10 = class374.method2382(arg3.method71((byte) -118), false);
        long var11 = (long) (arg2 | 0x40000000 | arg1 << 7 | arg3.method69(-5944) << 14 | arg3.method68(126) << 20);
        if (var10.field998 == 0) {
            var11 |= var8;
        }
        if (var10.field1031 == 1) {
            var11 |= var4;
        }
        if (var10.field1059) {
            var11 |= var6;
        }
        return var11 | (long) arg3.method71((byte) -118) << 32;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lmn;B)V", line = 123)
    private final void method559(class205 arg0, byte arg1) {
        field1229++;
        long var3 = arg0.method1353(23264);
        for (class311 var5 = (class311) this.field1236.method1888(var3, (byte) -30); var5 != null; var5 = (class311) this.field1236.method1883(-22097)) {
            if (var5.field4391.method1354(-27234, arg0)) {
                var5.method2594((byte) -22);
                var5.method2133(-31493);
                this.field1222++;
                break;
            }
        }
        if (arg1 != -116) {
            this.method567((byte) 124, 110);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lmn;BLjava/lang/Object;)V", line = 151)
    public final void method560(class205 arg0, byte arg1, Object arg2) {
        int var4 = 24 % ((arg1 + 62) / 54);
        this.method559(arg0, (byte) -116);
        field1220++;
        if (this.field1222 == 0) {
            class311 var5 = (class311) this.field1225.method1946(4);
            var5.method2594((byte) -22);
            var5.method2133(-31493);
        } else {
            this.field1222--;
        }
        class76 var6 = new class76(arg0, arg2);
        this.field1236.method1886(var6, arg0.method1353(23264), 1);
        this.field1225.method1950(110, var6);
        var6.field4685 = 0L;
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)V", line = 180)
    public final void method561(int arg0) {
        field1219++;
        this.field1225.method1948((byte) 123);
        this.field1236.method1887(arg0 - 489974141);
        this.field1222 = this.field1226;
        if (arg0 != 489974055) {
            this.field1226 = 17;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)I", line = 193)
    public final int method562(byte arg0) {
        if (arg0 != 89) {
            this.field1225 = null;
        }
        field1237++;
        return this.field1222;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Z)I", line = 213)
    public final int method563(boolean arg0) {
        field1231++;
        if (arg0) {
            this.method568((class205) null, 87);
        }
        return this.field1226;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BLdg;Ljava/lang/String;)I", line = 227)
    public static final int method564(byte arg0, class236 arg1, String arg2) {
        field1230++;
        int var3 = arg1.field3320;
        byte[] var4 = class278.method1832(arg2, (byte) -113);
        arg1.method1560(var4.length, -120);
        arg1.field3320 += class240.field3417.method1441(arg1.field3320, 0, arg1.field3364, var4.length, var4, 0);
        if (arg0 >= -64) {
            method556(-85, -126);
        }
        return arg1.field3320 - var3;
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(I)V", line = 246)
    public static void method565(int arg0) {
        field1227 = null;
        field1234 = null;
        if (arg0 != 0) {
            field1234 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(B)I", line = 258)
    public static final int method566(byte arg0) {
        if (arg0 != -99) {
            method566((byte) 13);
        }
        field1233++;
        return 2;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(BI)V", line = 269)
    public final void method567(byte arg0, int arg1) {
        field1228++;
        if (class112.field1365 != null) {
            for (class311 var3 = (class311) this.field1225.method1949(true); var3 != null; var3 = (class311) this.field1225.method1945((byte) 111)) {
                if (var3.method422(arg0 + 220)) {
                    if (var3.method423(-27364) == null) {
                        var3.method2594((byte) -22);
                        var3.method2133(-31493);
                        this.field1222++;
                    }
                } else if (++var3.field4685 > (long) arg1) {
                    class311 var4 = class112.field1365.method327(127, var3);
                    this.field1236.method1886(var4, var3.field5855, 1);
                    class211.method1431(var4, false, var3);
                    var3.method2594((byte) -22);
                    var3.method2133(-31493);
                }
            }
        }
        if (arg0 != -100) {
            this.method568((class205) null, 22);
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lmn;I)Ljava/lang/Object;", line = 321)
    public final Object method568(class205 arg0, int arg1) {
        if (arg1 != 31746) {
            this.method563(true);
        }
        field1217++;
        long var3 = arg0.method1353(arg1 - 8482);
        for (class311 var5 = (class311) this.field1236.method1888(var3, (byte) -30); var5 != null; var5 = (class311) this.field1236.method1883(-22097)) {
            if (var5.field4391.method1354(-27234, arg0)) {
                Object var6 = var5.method423(-27364);
                if (var6 != null) {
                    if (var5.method422(arg1 ^ 0x7C77)) {
                        class76 var7 = new class76(arg0, var6);
                        this.field1236.method1886(var7, var5.field5855, 1);
                        this.field1225.method1950(95, var7);
                        var7.field4685 = 0L;
                        var5.method2594((byte) -22);
                        var5.method2133(-31493);
                    } else {
                        this.field1225.method1950(4, var5);
                        var5.field4685 = 0L;
                    }
                    return var6;
                }
                var5.method2594((byte) -22);
                var5.method2133(arg1 ^ 0xFFFFF8F9);
                this.field1222++;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(I)V", line = 384)
    public class101(int arg0) {
        this.field1222 = arg0;
        this.field1226 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1236 = new class288(var2);
    }
}
