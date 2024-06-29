import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class178 extends class79 implements class113 {

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "Lfg;")
    public class79 field2548;

    @OriginalMember(owner = "client!ol", name = "E", descriptor = "Lag;")
    public static class463 field2564;

    @OriginalMember(owner = "client!ol", name = "A", descriptor = "F")
    public static float field2560;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public static int field2549;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!ol", name = "s", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!ol", name = "t", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!ol", name = "u", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!ol", name = "v", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!ol", name = "w", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!ol", name = "x", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!ol", name = "y", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!ol", name = "z", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!ol", name = "B", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!ol", name = "D", descriptor = "I")
    public static int field2563;

    @OriginalMember(owner = "client!ol", name = "C", descriptor = "[Log;")
    public static class441[] field2562;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(Leq;Z)Lgl;")
    public final class408 method364(class134 arg0, boolean arg1) {
        if (arg1) {
            this.method368(25);
        }
        field2559++;
        return null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)I")
    public final int method369(byte arg0) {
        field2554++;
        return arg0 < 24 ? 4 : 0;
    }

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "(I)Z")
    public final boolean method723(int arg0) {
        if (arg0 != 17774) {
            this.method367(-124, null, true);
        }
        field2556++;
        return false;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(B)V")
    public static void method1132(byte arg0) {
        if (arg0 == 39) {
            field2564 = null;
            field2562 = null;
        }
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V")
    public final void method722(int arg0) {
        if (arg0 != 0) {
            field2562 = null;
        }
        field2550++;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)I")
    public final int method362(byte arg0) {
        field2555++;
        if (arg0 != -72) {
            this.method365(39, null, (byte) 60, -58);
        }
        return 0;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BJ)V")
    public static final void method1133(byte arg0, long arg1) {
        field2549++;
        if (class358.field5312 != null) {
            if (class306.field4454 == 1 || class306.field4454 == 5) {
                class248.method1546((byte) -81, arg1);
            } else if (class306.field4454 == 4) {
                class157.method1003(arg1, (byte) 84);
            }
        }
        class326.method1951((byte) 39, class481.field6937, (long) class263.field3748);
        if (class465.field6737 != -1) {
            class502.method3026(class465.field6737, -1);
        }
        for (int var3 = 0; var3 < class55.field845; var3++) {
            if (class61.field909[var3]) {
                class187.field2653[var3] = true;
            }
            class193.field2738[var3] = class61.field909[var3];
            class61.field909[var3] = false;
        }
        class368.field5533 = class263.field3748;
        if (class481.field6937.method831()) {
            class415.field6146 = true;
        }
        if (class465.field6737 != -1) {
            class55.field845 = 0;
            class192.method1212(-8446);
        }
        class481.field6937.method836();
        class266.method1636(true, class481.field6937);
        int var4 = class291.method1759(false);
        if (var4 == -1) {
            var4 = class450.field6553;
        }
        if (var4 == -1) {
            var4 = class152.field1954;
        }
        class120.method683(-1, var4);
        class117.method671(class415.field6145.field2956, class91.field1245, (byte) 100, class415.field6145.field2966, class415.field6145.field2959);
        class91.field1245 = 0;
        if (arg0 <= 35) {
            method1133((byte) -51, 34L);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)Z")
    public final boolean method371(boolean arg0) {
        if (arg0) {
            field2564 = null;
        }
        field2558++;
        return false;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Leq;I)V")
    public final void method361(class134 arg0, int arg1) {
        field2563++;
        if (arg1 != -1) {
            method1134(105, 53);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILeq;BI)Z")
    public final boolean method365(int arg0, class134 arg1, byte arg2, int arg3) {
        field2561++;
        int var5 = 85 % ((arg2 + 23) / 38);
        return false;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIILbp;IZLeq;)V")
    public final void method719(int arg0, int arg1, int arg2, class250 arg3, int arg4, boolean arg5, class134 arg6) {
        field2551++;
        if (arg2 != -1) {
            this.method723(5);
        }
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(IIILfg;)V")
    public class178(int arg0, int arg1, int arg2, class79 arg3) {
        super(arg0, arg1, arg2, false, false);
        this.field2548 = arg3;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Leq;Z)V")
    public final void method360(class134 arg0, boolean arg1) {
        field2547++;
        if (!arg1) {
            this.method719(97, 95, -61, null, -45, false, null);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(ILeq;Z)Lva;")
    public final class327 method367(int arg0, class134 arg1, boolean arg2) {
        if (!arg2) {
            method1132((byte) 0);
        }
        field2545++;
        return null;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
    public final void method368(int arg0) {
        if (arg0 != 5894) {
            this.method367(-123, null, true);
        }
        field2557++;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(BLeq;)V")
    public final void method372(byte arg0, class134 arg1) {
        field2553++;
        if (arg0 > -49) {
            this.method368(-121);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)I")
    public final int method359(int arg0) {
        if (arg0 != 13228) {
            this.field2548 = null;
        }
        field2552++;
        return 0;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(II)Z")
    public static final boolean method1134(int arg0, int arg1) {
        field2546++;
        if (arg1 != -8) {
            field2564 = null;
        }
        return arg0 != 1 && arg0 != 7;
    }

    static {
        new class194(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
        field2564 = new class463("LIVE", 0);
    }
}
