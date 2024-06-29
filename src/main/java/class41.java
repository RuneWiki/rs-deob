import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class41 {

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "Lll;")
    private class211 field667 = new class211(256);

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "Lll;")
    private class211 field674 = new class211(256);

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "Luf;")
    private class176 field673;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "Luf;")
    private class176 field664;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field671 = 0;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "[Lcd;")
    public static class28[] field675 = new class28[2048];

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Ljava/util/Calendar;")
    public static Calendar field665 = Calendar.getInstance();

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II[I)Lul;")
    public final class192 method347(int arg0, int arg1, int[] arg2) {
        field676++;
        if (this.field673.method1167(-125) == 1) {
            return this.method353(arg2, 0, arg0, (byte) 103);
        } else if (this.field673.method1165(3, arg0) == 1) {
            return this.method353(arg2, arg0, 0, (byte) 104);
        } else {
            if (arg1 != 0) {
                field665 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V")
    public static void method348(boolean arg0) {
        if (!arg0) {
            field665 = null;
        }
        field675 = null;
        field665 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)I")
    public static final int method349(int arg0) {
        field677++;
        if (arg0 == -29284) {
            return class181.field2697 && class145.field2256[81] && class220.field3450 > 2 ? class42.field686[class220.field3450 - 2] : class42.field686[class220.field3450 - 1];
        } else {
            return 105;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I[III)Lul;")
    private final class192 method350(int arg0, int[] arg1, int arg2, int arg3) {
        field672++;
        int var5 = (arg3 >>> 12 | (arg3 & 0xF0000FFF) << 4) ^ arg2;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class192 var9 = (class192) this.field674.method1414(true, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            if (arg0 != -4309) {
                this.field667 = null;
            }
            class27 var10 = class27.method215(this.field664, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            class192 var11 = var10.method216();
            this.field674.method1409(var7, arg0 + 4310, var11);
            if (arg1 != null) {
                arg1[0] -= var11.field3044.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(BLuf;)V")
    public static final void method351(byte arg0, class176 arg1) {
        field668++;
        class45.field718 = arg1.method1168(20345, "titlebg");
        if (arg0 < -6) {
            class255.field3910 = arg1.method1168(20345, "logo");
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B[II)Lul;")
    public final class192 method352(byte arg0, int[] arg1, int arg2) {
        field669++;
        if (arg0 < 62) {
            this.method353((int[]) null, -36, 126, (byte) -77);
        }
        if (this.field664.method1167(-124) == 1) {
            return this.method350(-4309, arg1, arg2, 0);
        } else if (this.field664.method1165(3, arg2) == 1) {
            return this.method350(-4309, arg1, 0, arg2);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([IIIB)Lul;")
    private final class192 method353(int[] arg0, int arg1, int arg2, byte arg3) {
        int var5 = arg2 ^ ((arg1 & 0xFFF) << 4 | arg1 >>> 12);
        int var6 = var5 | arg1 << 16;
        field666++;
        if (arg3 < 98) {
            field670 = 4;
        }
        long var7 = (long) var6 ^ 0x100000000L;
        class192 var9 = (class192) this.field674.method1414(true, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class104 var10 = (class104) this.field667.method1414(true, var7);
            if (var10 == null) {
                var10 = class104.method798(this.field673, arg1, arg2);
                if (var10 == null) {
                    return null;
                }
                this.field667.method1409(var7, 1, var10);
            }
            class192 var11 = var10.method799(arg0);
            if (var11 == null) {
                return null;
            } else {
                var10.method693(-84);
                this.field674.method1409(var7, 1, var11);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Luf;Luf;)V")
    public class41(class176 arg0, class176 arg1) {
        this.field673 = arg1;
        this.field664 = arg0;
    }
}
