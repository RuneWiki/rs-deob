import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class77 {

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "Lsu;")
    private class143 field1118 = new class143();

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    private int field1114;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    private int field1120;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "Lgu;")
    private class412 field1113;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1109 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "Lob;")
    public static class521 field1121 = new class521(17, 3);

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "Z")
    public static boolean field1124 = true;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public static int field1117;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V", line = 3)
    public static void method657(byte arg0) {
        if (arg0 == 103) {
            field1121 = null;
            field1109 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)V", line = 14)
    public final void method658(byte arg0) {
        if (arg0 > -91) {
            this.field1113 = null;
        }
        for (class40 var2 = (class40) this.field1118.method1024((byte) 117); var2 != null; var2 = (class40) this.field1118.method1022(-3)) {
            if (var2.method378((byte) 8)) {
                var2.method2677(-22491);
                var2.method2754(-152804768);
                this.field1120 += var2.field533;
            }
        }
        field1117++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)I", line = 39)
    public final int method659(boolean arg0) {
        if (arg0) {
            this.method660(null, -91);
        }
        field1107++;
        return this.field1114;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lcp;I)Ljava/lang/Object;", line = 50)
    public final Object method660(class512 arg0, int arg1) {
        field1116++;
        if (arg1 != -29866) {
            method657((byte) -88);
        }
        long var3 = arg0.method502((byte) -98);
        for (class40 var5 = (class40) this.field1113.method2585((byte) 114, var3); var5 != null; var5 = (class40) this.field1113.method2590((byte) 116)) {
            if (var5.field537.method504(4473, arg0)) {
                Object var6 = var5.method381(false);
                if (var6 != null) {
                    if (var5.method378((byte) 8)) {
                        class218 var7 = new class218(arg0, var6, var5.field533);
                        this.field1113.method2591(var5.field6388, var7, (byte) -112);
                        this.field1118.method1021(var7, -86);
                        var7.field6596 = 0L;
                        var5.method2677(-22491);
                        var5.method2754(arg1 ^ 0x91BE936);
                    } else {
                        this.field1118.method1021(var5, arg1 + 29766);
                        var5.field6596 = 0L;
                    }
                    return var6;
                }
                var5.method2677(-22491);
                var5.method2754(-152804768);
                this.field1120 += var5.field533;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V", line = 106)
    public final void method661(int arg0, int arg1) {
        field1123++;
        if (class385.field5785 != null) {
            for (class40 var3 = (class40) this.field1118.method1024((byte) 100); var3 != null; var3 = (class40) this.field1118.method1022(arg1 - 2050)) {
                if (var3.method378((byte) 8)) {
                    if (var3.method381(false) == null) {
                        var3.method2677(arg1 ^ 0xFFFFAFDA);
                        var3.method2754(-152804768);
                        this.field1120 += var3.field533;
                    }
                } else if ((long) arg0 < ++var3.field6596) {
                    class40 var4 = class385.field5785.method490(-1, var3);
                    this.field1113.method2591(var3.field6388, var4, (byte) -114);
                    class339.method2140(var3, var4, -1279242032);
                    var3.method2677(-22491);
                    var3.method2754(-152804768);
                }
            }
        }
        if (arg1 != 2047) {
            this.method659(true);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZLmk;)V", line = 156)
    private final void method662(boolean arg0, class40 arg1) {
        field1110++;
        if (arg1 != null) {
            arg1.method2677(-22491);
            arg1.method2754(-152804768);
            this.field1120 += arg1.field533;
        }
        if (arg0) {
            this.method662(false, null);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)I", line = 182)
    public final int method663(int arg0) {
        if (arg0 == 17894) {
            field1122++;
            return this.field1120;
        } else {
            return -122;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lcp;Ljava/lang/Object;I)V", line = 193)
    public final void method664(class512 arg0, Object arg1, int arg2) {
        if (arg2 == 19635) {
            field1112++;
            this.method666(arg1, 1, arg2 - 19635, arg0);
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V", line = 206)
    public final void method665(int arg0) {
        if (arg0 != -18632) {
            this.method658((byte) 85);
        }
        this.field1118.method1026(-15663);
        field1108++;
        this.field1113.method2588(-106);
        this.field1120 = this.field1114;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/lang/Object;IILcp;)V", line = 222)
    private final void method666(Object arg0, int arg1, int arg2, class512 arg3) {
        field1115++;
        if (arg1 > this.field1114) {
            throw new IllegalStateException("s>cs");
        }
        this.method669(arg3, (byte) 106);
        this.field1120 -= arg1;
        while (this.field1120 < 0) {
            class40 var6 = (class40) this.field1118.method1019(arg2 + 65408);
            this.method662(false, var6);
        }
        class218 var5 = new class218(arg3, arg0, arg1);
        this.field1113.method2591(arg3.method502((byte) -100), var5, (byte) 32);
        this.field1118.method1021(var5, -97);
        var5.field6596 = arg2;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(I)V", line = 342)
    public class77(int arg0) {
        this.field1114 = arg0;
        this.field1120 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field1113 = new class412(var2);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II[BLjava/lang/String;)I", line = 257)
    public static final int method667(int arg0, int arg1, byte[] arg2, String arg3) {
        field1125++;
        int var4 = arg3.length();
        int var5 = arg1;
        for (int var6 = 0; var6 < var4; var6++) {
            char var7 = arg3.charAt(var6);
            if (var7 <= '\u007F') {
                arg2[var5++] = (byte) var7;
            } else if (var7 > '߿') {
                arg2[var5++] = (byte) (class264.method1763(var7, 919275) >> 12);
                arg2[var5++] = (byte) class264.method1763(128, class74.method644(var7 >> 6, 63));
                arg2[var5++] = (byte) class264.method1763(128, class74.method644(63, var7));
            } else {
                arg2[var5++] = (byte) (class264.method1763(var7, 12309) >> 6);
                arg2[var5++] = (byte) class264.method1763(128, class74.method644(var7, 63));
            }
        }
        if (arg0 == 63) {
            return var5 - arg1;
        } else {
            return 63;
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(Z)V", line = 300)
    public static final void method668(boolean arg0) {
        if (!arg0) {
            class488.field7031 = null;
            field1111++;
            class296.field4520 = -1;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lcp;B)V", line = 316)
    private final void method669(class512 arg0, byte arg1) {
        field1119++;
        long var3 = arg0.method502((byte) -85);
        class40 var5 = (class40) this.field1113.method2585((byte) 114, var3);
        if (arg1 <= 85) {
            this.method662(false, null);
        }
        while (var5 != null) {
            if (var5.field537.method504(4473, arg0)) {
                this.method662(false, var5);
                return;
            }
            var5 = (class40) this.field1113.method2590((byte) 118);
        }
    }
}
