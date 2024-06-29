import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class187 extends class209 {

    @OriginalMember(owner = "client!le", name = "E", descriptor = "Luf;")
    private class168 field2962 = class153.field2381;

    @OriginalMember(owner = "client!le", name = "C", descriptor = "[J")
    public static long[] field2960 = new long[500];

    @OriginalMember(owner = "client!le", name = "x", descriptor = "I")
    public static int field2955 = 0;

    @OriginalMember(owner = "client!le", name = "T", descriptor = "I")
    public static int field2977 = -1;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "Luf;")
    public static class168 field2970 = class148.method1019(-1720, "Stufe)2");

    @OriginalMember(owner = "client!le", name = "z", descriptor = "Luf;")
    private static class168 field2957 = class148.method1019(-1720, "Loading)3)3)3");

    @OriginalMember(owner = "client!le", name = "V", descriptor = "Luf;")
    public static class168 field2979 = class148.method1019(-1720, "Texturen geladen)3");

    @OriginalMember(owner = "client!le", name = "w", descriptor = "Luf;")
    public static class168 field2954 = field2957;

    @OriginalMember(owner = "client!le", name = "y", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!le", name = "A", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!le", name = "B", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!le", name = "D", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "I")
    public int field2964;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "I")
    public int field2965;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!le", name = "K", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!le", name = "O", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!le", name = "P", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!le", name = "R", descriptor = "I")
    private int field2975;

    @OriginalMember(owner = "client!le", name = "S", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!le", name = "U", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!le", name = "W", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!le", name = "F", descriptor = "Lcd;")
    public static class35 field2963;

    @OriginalMember(owner = "client!le", name = "I", descriptor = "Lkb;")
    private class80 field2966;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "Lkb;")
    private class80 field2969;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZLdk;Ldk;Ldk;Ldk;)V", line = 5)
    public static final void method1317(boolean arg0, class241 arg1, class241 arg2, class241 arg3, class241 arg4) {
        class282.field4761 = arg2;
        class259.field4396 = arg4;
        class288.field4852 = arg1;
        class256.field4361 = arg3;
        class272.field4582 = new class242[class288.field4852.method1640(-43)][];
        if (arg0) {
            method1321(70);
        }
        field2976++;
        class151.field2351 = new boolean[class288.field4852.method1640(-28)];
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(II)I", line = 22)
    public final int method1318(int arg0, int arg1) {
        if (arg0 >= -91) {
            this.method1318(-106, -126);
        }
        field2958++;
        if (this.field2966 == null) {
            return this.field2975;
        } else {
            class69 var3 = (class69) this.field2966.method493((long) arg1, 65);
            return var3 == null ? this.field2975 : var3.field919;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILuf;)Z", line = 49)
    public final boolean method1319(int arg0, class168 arg1) {
        field2973++;
        if (this.field2966 == null) {
            return false;
        }
        if (this.field2969 == null) {
            this.method1326(arg0 - 30469);
        }
        if (arg0 != 30351) {
            this.method1325(-112, -61);
        }
        for (class300 var3 = (class300) this.field2969.method493(arg1.method1182(-16010), arg0 ^ 0x76D4); var3 != null; var3 = (class300) this.field2969.method496(false)) {
            if (var3.field5078.method1170(arg1, (byte) 94)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZLj;)V", line = 79)
    public final void method1320(boolean arg0, class153 arg1) {
        if (arg0) {
            this.method1318(-76, 45);
        }
        field2978++;
        while (true) {
            int var3 = arg1.method1042((byte) -83);
            if (var3 == 0) {
                return;
            }
            this.method1324(var3, arg1, -100);
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V", line = 100)
    public static void method1321(int arg0) {
        field2954 = null;
        field2957 = null;
        field2963 = null;
        field2979 = null;
        field2970 = null;
        if (arg0 >= -60) {
            field2970 = (class168) null;
        }
        field2960 = null;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(II)Luf;", line = 116)
    public final class168 method1322(int arg0, int arg1) {
        field2956++;
        if (this.field2966 == null) {
            return this.field2962;
        }
        if (arg1 != 1) {
            field2961 = 37;
        }
        class188 var3 = (class188) this.field2966.method493((long) arg0, arg1 + 102);
        return var3 == null ? this.field2962 : var3.field2985;
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V", line = 164)
    private final void method1323(int arg0) {
        field2972++;
        this.field2969 = new class80(this.field2966.method495(-17539));
        class69 var2 = (class69) this.field2966.method499((byte) -99);
        if (arg0 != -5) {
            this.field2965 = -45;
        }
        while (var2 != null) {
            class69 var3 = new class69((int) var2.field292);
            this.field2969.method490(var3, (long) var2.field919, true);
            var2 = (class69) this.field2966.method488(arg0 ^ 0xFFFFFFFA);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILj;I)V", line = 198)
    private final void method1324(int arg0, class153 arg1, int arg2) {
        if (arg0 == 1) {
            this.field2965 = arg1.method1042((byte) -99);
        } else if (arg0 == 2) {
            this.field2964 = arg1.method1042((byte) 100);
        } else if (arg0 == 3) {
            this.field2962 = arg1.method1075(95);
        } else if (arg0 == 4) {
            this.field2975 = arg1.method1089((byte) -14);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method1069(39);
            this.field2966 = new class80(class180.method1294(true, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1089((byte) -14);
                class24 var7;
                if (arg0 == 5) {
                    var7 = new class188(arg1.method1075(67));
                } else {
                    var7 = new class69(arg1.method1089((byte) -14));
                }
                this.field2966.method490(var7, (long) var6, true);
            }
        }
        field2980++;
        if (arg2 > -74) {
            this.field2965 = -106;
        }
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(II)Z", line = 251)
    public final boolean method1325(int arg0, int arg1) {
        field2967++;
        if (this.field2966 == null) {
            return false;
        }
        if (this.field2969 == null) {
            this.method1323(-5);
        }
        if (arg1 > -75) {
            this.method1324(-59, (class153) null, -39);
        }
        class69 var3 = (class69) this.field2969.method493((long) arg0, 118);
        return var3 != null;
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(I)V", line = 280)
    private final void method1326(int arg0) {
        field2971++;
        if (arg0 > -7) {
            return;
        }
        this.field2969 = new class80(this.field2966.method495(-17539));
        for (class188 var2 = (class188) this.field2966.method499((byte) -99); var2 != null; var2 = (class188) this.field2966.method488(1)) {
            class300 var3 = new class300(var2.field2985, (int) var2.field292);
            this.field2969.method490(var3, var2.field2985.method1182(-16010), true);
        }
    }
}
