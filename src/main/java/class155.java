import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class155 extends class259 {

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "Z")
    public static boolean field2416 = false;

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "I")
    public static int field2418 = 0;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!uj", name = "y", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!uj", name = "A", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!uj", name = "B", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!uj", name = "C", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!uj", name = "x", descriptor = "J")
    public long field2422;

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "Luj;")
    public class155 field2420;

    @OriginalMember(owner = "client!uj", name = "z", descriptor = "Luj;")
    public class155 field2424;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "Lba;")
    public static class157 field2414;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "Lmh;")
    public static class263 field2415;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILlc;)V")
    public static final void method1128(int arg0, class270 arg1) {
        class135.field2207 = arg1;
        if (arg0 == 1) {
            field2417++;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Llc;Llc;I)V")
    public static final void method1129(class270 arg0, class270 arg1, int arg2) {
        field2409++;
        if (arg2 != -20742) {
            method1132((byte) 90);
        }
        class292.field4646 = arg1;
        class1.field20 = arg0;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IJ)V")
    public static final void method1130(int arg0, long arg1) {
        if (arg0 != 1) {
            field2416 = true;
        }
        field2410++;
        if (arg1 <= 0L) {
            return;
        }
        if ((arg1 % 10L) == 0L) {
            class291.method1981(true, arg1 - 1L);
            class291.method1981(true, 1L);
        } else {
            class291.method1981(true, arg1);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Z)V")
    public static void method1131(boolean arg0) {
        if (!arg0) {
            field2414 = null;
            field2415 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)I")
    public static final int method1132(byte arg0) {
        field2421++;
        if (arg0 != -20) {
            field2415 = null;
        }
        return class181.field2723;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILhc;)Lji;")
    public static final class255 method1133(int arg0, class53 arg1) {
        field2423++;
        if (arg0 != 1) {
            method1128(-72, (class270) null);
        }
        return new class255(arg1.method337(90), arg1.method337(arg0 ^ 0x48), arg1.method337(93), arg1.method337(127), arg1.method362(-4), arg1.method362(-4), arg1.method366(-16505));
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)V")
    public static final void method1134(int arg0) {
        field2425++;
        class36.field463.method1420((byte) 110);
        if (arg0 != -22127) {
            field2415 = null;
        }
        class241.field3533.method1420((byte) -70);
        class301.field4878.method1420((byte) 120);
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(Z)V")
    public final void method1135(boolean arg0) {
        field2413++;
        if (arg0) {
            method1128(17, (class270) null);
        }
        if (this.field2424 != null) {
            this.field2424.field2420 = this.field2420;
            this.field2420.field2424 = this.field2424;
            this.field2424 = null;
            this.field2420 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(Z)Z")
    public final boolean method1136(boolean arg0) {
        if (arg0) {
            field2414 = null;
        }
        field2411++;
        return this.field2424 != null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(CLjava/lang/StringBuffer;II)Ljava/lang/StringBuffer;")
    public static final StringBuffer method1137(char arg0, StringBuffer arg1, int arg2, int arg3) {
        int var4 = arg1.length();
        arg1.setLength(arg3);
        if (arg2 != 21334) {
            method1132((byte) 99);
        }
        field2419++;
        for (int var5 = var4; var5 < arg3; var5++) {
            arg1.setCharAt(var5, arg0);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BI)Lob;")
    public static final class308 method1138(byte arg0, int arg1) {
        if (arg0 > -52) {
            method1130(122, 36L);
        }
        class308 var2 = (class308) class141.field2274.method1418((long) arg1, 0);
        field2427++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class306.field4940.method1868(arg1, 4, 1);
        class308 var4 = new class308();
        if (var3 != null) {
            var4.method2087(arg1, 0, new class53(var3));
        }
        class141.field2274.method1421((long) arg1, var4, (byte) -112);
        return var4;
    }
}
