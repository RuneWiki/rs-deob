import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class64 {

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public int field1015 = 0;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Lta;")
    public static class262 field1019 = new class262(100);

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field1024 = 64;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1026 = "scroll:";

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field1023 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Z")
    public static boolean field1025 = false;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lf;IB)Ljava/lang/String;")
    public static final String method502(class37 arg0, int arg1, byte arg2) {
        field1016++;
        try {
            int var3 = arg0.method285((byte) 35);
            if (arg1 < var3) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg0.field588 += class257.field3943.method1088(arg0.field583, 0, (byte) 16, var3, arg0.field588, var4);
            return arg2 == 115 ? class246.method1664(var4, 0, 14439, var3) : null;
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILuf;)V")
    public static final void method503(int arg0, class176 arg1) {
        field1014++;
        class86.field1419 = arg1;
        int var2 = 45 / ((arg0 + 67) / 38);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(JIB[I)Ljava/lang/String;")
    public static final String method504(long arg0, int arg1, byte arg2, int[] arg3) {
        if (arg2 <= 84) {
            return null;
        }
        field1017++;
        if (class57.field883 != null) {
            String var5 = class57.field883.method1002(arg3, 1306, arg1, arg0);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIB)V")
    public static final void method505(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1022++;
        if (arg1 < arg2) {
            for (int var5 = arg1; var5 < arg2; var5++) {
                class156.field2379[var5][arg3] = arg0;
            }
        } else {
            for (int var6 = arg2; var6 < arg1; var6++) {
                class156.field2379[var6][arg3] = arg0;
            }
        }
        if (arg4 != 0) {
            method509(-73);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILf;)V")
    public final void method506(int arg0, class37 arg1) {
        field1020++;
        if (arg0 != 22048) {
            return;
        }
        while (true) {
            int var3 = arg1.method333((byte) -59);
            if (var3 == 0) {
                return;
            }
            this.method507((byte) -106, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BILf;)V")
    private final void method507(byte arg0, int arg1, class37 arg2) {
        if (arg0 == -106) {
            field1018++;
            if (arg1 == 5) {
                this.field1015 = arg2.method293(121);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V")
    public static final void method508(boolean arg0) {
        field1021++;
        if (arg0) {
            method502((class37) null, -15, (byte) 85);
        }
        for (class46 var1 = (class46) class208.field3232.method1010(125); var1 != null; var1 = (class46) class208.field3232.method1008((byte) 88)) {
            if (var1.field738 > 0) {
                var1.field738--;
            }
            if (var1.field738 != 0) {
                if (var1.field730 > 0) {
                    var1.field730--;
                }
                if (var1.field730 == 0 && var1.field729 >= 1 && var1.field728 >= 1 && var1.field729 <= 102 && var1.field728 <= 102 && (var1.field735 < 0 || class275.method1848(var1.field735, -77, var1.field726))) {
                    class293.method1971((byte) 90, var1.field735, var1.field733, var1.field728, var1.field729, var1.field725, var1.field726, var1.field736);
                    var1.field730 = -1;
                    if (var1.field735 == var1.field731 && var1.field731 == -1) {
                        var1.method693(112);
                    } else if (var1.field735 == var1.field731 && var1.field736 == var1.field723 && var1.field727 == var1.field726) {
                        var1.method693(118);
                    }
                }
            } else if (var1.field731 < 0 || class275.method1848(var1.field731, -84, var1.field727)) {
                class293.method1971((byte) 47, var1.field731, var1.field733, var1.field728, var1.field729, var1.field725, var1.field727, var1.field723);
                var1.method693(87);
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static void method509(int arg0) {
        field1026 = null;
        if (arg0 != 0) {
            method502((class37) null, -106, (byte) -39);
        }
        field1019 = null;
    }
}
