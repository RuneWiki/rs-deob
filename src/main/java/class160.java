import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class160 {

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public int field2483 = 70;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    private int field2486 = -1;

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    private int field2493 = -1;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public int field2494 = -1;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public int field2495 = -1;

    @OriginalMember(owner = "client!ij", name = "j", descriptor = "I")
    public int field2491 = 16777215;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    private int field2496 = -1;

    @OriginalMember(owner = "client!ij", name = "k", descriptor = "I")
    public int field2492 = 0;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "Ljava/lang/String;")
    private String field2497 = "";

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
    public int field2502 = 0;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public int field2484 = -1;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    private int field2500 = -1;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
    public int field2504 = 0;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "Lwc;")
    public class724 field2487;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lha;B)Lit;")
    public final class34 method1190(class544 arg0, byte arg1) {
        int var3 = -88 / ((-arg1 - 34) / 50);
        field2482++;
        if (this.field2493 < 0) {
            return null;
        }
        class34 var4 = (class34) this.field2487.field10166.method80((byte) -68, (long) this.field2493);
        if (var4 == null) {
            this.method1198(0, arg0);
            var4 = (class34) this.field2487.field10166.method80((byte) -47, (long) this.field2493);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(Lha;B)Lit;")
    public final class34 method1191(class544 arg0, byte arg1) {
        field2501++;
        if (arg1 != -114) {
            this.field2483 = -122;
        }
        if (this.field2496 < 0) {
            return null;
        }
        class34 var3 = (class34) this.field2487.field10166.method80((byte) -41, (long) this.field2496);
        if (var3 == null) {
            this.method1198(0, arg0);
            var3 = (class34) this.field2487.field10166.method80((byte) -101, (long) this.field2496);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(Lha;B)Lit;")
    public final class34 method1192(class544 arg0, byte arg1) {
        field2499++;
        if (this.field2486 < 0) {
            return null;
        } else if (arg1 == 116) {
            class34 var3 = (class34) this.field2487.field10166.method80((byte) -120, (long) this.field2486);
            if (var3 == null) {
                this.method1198(0, arg0);
                var3 = (class34) this.field2487.field10166.method80((byte) -88, (long) this.field2486);
            }
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lha;I)Lit;")
    public final class34 method1193(class544 arg0, int arg1) {
        field2488++;
        if (this.field2500 < 0) {
            return null;
        }
        class34 var3 = (class34) this.field2487.field10166.method80((byte) -93, (long) this.field2500);
        if (var3 == null) {
            this.method1198(0, arg0);
            var3 = (class34) this.field2487.field10166.method80((byte) -44, (long) this.field2500);
        }
        if (arg1 > -66) {
            this.method1194(null, true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lofa;Z)V")
    public final void method1194(class301 arg0, boolean arg1) {
        if (!arg1) {
            this.method1191(null, (byte) -2);
        }
        field2489++;
        while (true) {
            int var3 = arg0.method1987(-44);
            if (var3 == 0) {
                return;
            }
            this.method1195(true, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZILofa;)V")
    private final void method1195(boolean arg0, int arg1, class301 arg2) {
        field2498++;
        if (!arg0) {
            return;
        }
        if (arg1 == 1) {
            this.field2494 = arg2.method1989((byte) -127);
        } else if (arg1 == 2) {
            this.field2491 = arg2.method1952(22085);
        } else if (arg1 == 3) {
            this.field2500 = arg2.method1989((byte) -87);
        } else if (arg1 == 4) {
            this.field2486 = arg2.method1989((byte) -40);
        } else if (arg1 == 5) {
            this.field2493 = arg2.method1989((byte) -92);
        } else if (arg1 == 6) {
            this.field2496 = arg2.method1989((byte) -73);
        } else if (arg1 == 7) {
            this.field2502 = arg2.method1977((byte) -122);
        } else if (arg1 == 8) {
            this.field2497 = arg2.method1944(-46);
        } else if (arg1 == 9) {
            this.field2483 = arg2.method1989((byte) -125);
        } else if (arg1 == 10) {
            this.field2492 = arg2.method1977((byte) -117);
        } else if (arg1 == 11) {
            this.field2495 = 0;
            return;
        } else if (arg1 == 12) {
            this.field2484 = arg2.method1987(-80);
            return;
        } else if (arg1 == 13) {
            this.field2504 = arg2.method1977((byte) -119);
            return;
        } else if (arg1 == 14) {
            this.field2495 = arg2.method1989((byte) -120);
            return;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method1196(int arg0, int arg1) {
        field2503++;
        String var3 = this.field2497;
        int var4 = -29 / ((arg1 + 42) / 58);
        while (true) {
            int var5 = var3.indexOf("%1");
            if (var5 < 0) {
                return var3;
            }
            var3 = var3.substring(0, var5) + class169.method1353(123, arg0, false) + var3.substring(var5 + 2);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)V")
    public static final void method1197(int arg0, byte arg1) {
        int var2 = -116 / ((arg1 + 29) / 37);
        if (class146.field2293 == null || class146.field2293.length < arg0) {
            class146.field2293 = new int[arg0];
        }
        field2490++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILha;)V")
    private final void method1198(int arg0, class544 arg1) {
        field2485++;
        class422 var3 = this.field2487.field10168;
        if (this.field2500 >= 0 && this.field2487.field10166.method80((byte) -60, (long) this.field2500) == null && var3.method2621(this.field2500, -28975)) {
            class726 var4 = class726.method4014(var3, this.field2500);
            this.field2487.field10166.method67((long) this.field2500, arg1.method310(var4, true), -6772);
        }
        if (this.field2493 >= 0 && this.field2487.field10166.method80((byte) -58, (long) this.field2493) == null && var3.method2621(this.field2493, -28975)) {
            class726 var5 = class726.method4014(var3, this.field2493);
            this.field2487.field10166.method67((long) this.field2493, arg1.method310(var5, true), -6772);
        }
        if (arg0 <= this.field2486 && this.field2487.field10166.method80((byte) -73, (long) this.field2486) == null && var3.method2621(this.field2486, arg0 ^ 0xFFFF8ED1)) {
            class726 var6 = class726.method4014(var3, this.field2486);
            this.field2487.field10166.method67((long) this.field2486, arg1.method310(var6, true), -6772);
        }
        if (this.field2496 >= 0 && this.field2487.field10166.method80((byte) -51, (long) this.field2496) == null && var3.method2621(this.field2496, -28975)) {
            class726 var7 = class726.method4014(var3, this.field2496);
            this.field2487.field10166.method67((long) this.field2496, arg1.method310(var7, true), -6772);
        }
    }
}
