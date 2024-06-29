import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class214 extends class46 {

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "Ljava/lang/String;")
    public String field3259;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "[I")
    public static int[] field3258 = new int[5];

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field3261 = 0;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field3255 = 0;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "Ljava/lang/String;")
    public static String field3264 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "Lpb;")
    public static class2 field3256;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V", line = 10)
    public static void method1502(byte arg0) {
        field3258 = null;
        int var1 = 1 % ((-arg0 - 19) / 62);
        field3264 = null;
        field3256 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BB)C", line = 21)
    public static final char method1503(byte arg0, byte arg1) {
        field3257++;
        if (arg1 != 58) {
            return '<';
        }
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        }
        if (var2 >= 128 && var2 < 160) {
            char var3 = class297.field4586[var2 - 128];
            if (var3 == '\u0000') {
                var3 = '?';
            }
            var2 = var3;
        }
        return (char) var2;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 48)
    public static final boolean method1504(byte arg0, String arg1) {
        field3262++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 <= 19) {
            method1503((byte) 51, (byte) 47);
        }
        for (int var2 = 0; var2 < class336.field5253; var2++) {
            if (arg1.equalsIgnoreCase(class54.field910[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)J", line = 76)
    public static final long method1505(int arg0, int arg1, int arg2) {
        class142 var3 = class256.field4013[arg0][arg1][arg2];
        return var3 == null || var3.field2194 == null ? 0L : var3.field2194.field3631;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(III)Lbn;", line = 89)
    public static final class228 method1506(int arg0, int arg1, int arg2) {
        class142 var3 = class256.field4013[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class228 var4 = var3.field2194;
            var3.field2194 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)Ltm;", line = 102)
    public static final class264 method1507(byte arg0, int arg1) {
        field3260++;
        class264 var2 = (class264) class213.field3248.method2179(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class200.field3004.method980(34, arg1, 5);
        class264 var4 = new class264();
        if (arg0 >= -55) {
            field3256 = (class2) null;
        }
        if (var3 != null) {
            var4.method1804(arg1, new class166(var3), (byte) 109);
        }
        class213.field3248.method2173(var4, true, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V", line = 124)
    public class214() {
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([I[I[IILib;)V", line = 128)
    public static final void method1508(int[] arg0, int[] arg1, int[] arg2, int arg3, class313 arg4) {
        field3263++;
        for (int var5 = arg3; var5 < arg2.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg2[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; var6 != 0 && arg4.field1908.length > var9; var9++) {
                if ((var6 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg4.field1908[var9] = null;
                    } else {
                        class281 var10 = class133.method948(var7, (byte) 33);
                        class111 var11 = arg4.field1908[var9];
                        int var12 = var10.field4330;
                        if (var11 != null) {
                            if (var11.field1733 == var7) {
                                if (var12 == 0) {
                                    var11 = arg4.field1908[var9] = null;
                                } else if (var12 == 1) {
                                    var11.field1731 = 1;
                                    var11.field1722 = var8;
                                    var11.field1724 = 0;
                                    var11.field1725 = 0;
                                    var11.field1729 = 0;
                                    class170.method1231(false, arg4.field1905, arg4.field1868, 0, var10, -24255);
                                } else if (var12 == 2) {
                                    var11.field1724 = 0;
                                }
                            } else if (var10.field4344 >= class133.method948(var11.field1733, (byte) 33).field4344) {
                                var11 = arg4.field1908[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class111 var13 = arg4.field1908[var9] = new class111();
                            var13.field1729 = 0;
                            var13.field1724 = 0;
                            var13.field1722 = var8;
                            var13.field1733 = var7;
                            var13.field1731 = 1;
                            var13.field1725 = 0;
                            class170.method1231(false, arg4.field1905, arg4.field1868, 0, var10, -24255);
                        }
                    }
                }
                var6 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 224)
    public class214(String arg0) {
        this.field3259 = arg0;
    }
}
