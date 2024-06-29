import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class51 extends class7 {

    @OriginalMember(owner = "client!ps", name = "x", descriptor = "Lal;")
    public static class52 field625 = new class52(4);

    @OriginalMember(owner = "client!ps", name = "D", descriptor = "[I")
    public static int[] field630 = new int[5];

    @OriginalMember(owner = "client!ps", name = "G", descriptor = "I")
    public static int field632 = 99;

    @OriginalMember(owner = "client!ps", name = "w", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!ps", name = "y", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!ps", name = "z", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!ps", name = "A", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!ps", name = "B", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!ps", name = "F", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!ps", name = "v", descriptor = "Lbn;")
    private class256 field623;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZIBLoh;Loh;)I", line = 13)
    public static final int method323(boolean arg0, int arg1, byte arg2, class231 arg3, class231 arg4) {
        field629++;
        if (arg1 == 1) {
            int var5 = arg4.field4064;
            int var6 = arg3.field4064;
            if (!arg0) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg1 == 2) {
            return class163.method1130(class205.field3298, arg3.method1640(21626).field2930, arg4.method1640(21626).field2930, true);
        } else if (arg1 == 3) {
            if (arg4.field3844.equals("-")) {
                if (arg3.field3844.equals("-")) {
                    return 0;
                } else if (arg0) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg3.field3844.equals("-")) {
                return arg0 ? 1 : -1;
            } else {
                return class163.method1130(class205.field3298, arg3.field3844, arg4.field3844, true);
            }
        } else if (arg1 != 4) {
            int var7 = 31 / ((arg2 - 30) / 56);
            if (arg1 == 5) {
                if (arg4.method1715(1)) {
                    return arg3.method1715(1) ? 0 : 1;
                } else if (arg3.method1715(1)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg1 == 6) {
                if (arg4.method1716(false)) {
                    return arg3.method1716(false) ? 0 : 1;
                } else if (arg3.method1716(false)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg1 == 7) {
                if (arg4.method1717(122)) {
                    return arg3.method1717(-28) ? 0 : 1;
                } else if (arg3.method1717(93)) {
                    return -1;
                } else {
                    return 0;
                }
            } else if (arg1 == 8) {
                int var8 = arg4.field3848;
                int var9 = arg3.field3848;
                if (arg0) {
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                    if (var9 == 1000) {
                        var9 = -1;
                    }
                } else {
                    if (var9 == -1) {
                        var9 = 1000;
                    }
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                }
                return var8 - var9;
            } else {
                return arg4.field3849 - arg3.field3849;
            }
        } else if (arg4.method1720((byte) 7)) {
            return arg3.method1720((byte) 93) ? 0 : 1;
        } else if (arg3.method1720((byte) -119)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(Z)V", line = 113)
    public static void method324(boolean arg0) {
        if (arg0) {
            field630 = null;
            field625 = null;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)V", line = 125)
    public static final void method325(int arg0, byte arg1) {
        field624++;
        class52 var2 = class142.field2250;
        synchronized (class142.field2250) {
            class142.field2250.method337(arg0, (byte) -127);
            if (arg1 > -43) {
                field630 = null;
            }
        }
        class52 var3 = class287.field4601;
        synchronized (class287.field4601) {
            class287.field4601.method337(arg0, (byte) -128);
        }
        class392 var4 = class110.field1528;
        synchronized (class110.field1528) {
            class110.field1528.method2475(0, arg0);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;", line = 146)
    public final String method326(String arg0, int arg1, byte arg2) {
        if (arg2 != 117) {
            return null;
        }
        field627++;
        if (this.field623 == null) {
            return arg0;
        } else {
            class249 var4 = (class249) this.field623.method1770(arg2 - 997, (long) arg1);
            return var4 == null ? arg0 : var4.field4069;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IBI)I", line = 166)
    public final int method327(int arg0, byte arg1, int arg2) {
        if (arg1 != 66) {
            method324(true);
        }
        field631++;
        if (this.field623 == null) {
            return arg2;
        } else {
            class160 var4 = (class160) this.field623.method1770(arg1 - 946, (long) arg0);
            return var4 == null ? arg2 : var4.field2527;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Ljg;IB)V", line = 190)
    private final void method328(class186 arg0, int arg1, byte arg2) {
        if (arg2 < 112) {
            method323(false, 86, (byte) -28, (class231) null, (class231) null);
        }
        if (arg1 == 249) {
            int var4 = arg0.method1322(false);
            if (this.field623 == null) {
                int var5 = class111.method822((byte) 22, var4);
                this.field623 = new class256(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1322(false) == 1;
                int var8 = arg0.method1275(-1);
                class161 var9;
                if (var7) {
                    var9 = new class249(arg0.method1270(-9970));
                } else {
                    var9 = new class160(arg0.method1284(8388607));
                }
                this.field623.method1766((long) var8, var9, -74);
            }
        }
        field626++;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(ZLjg;)V", line = 244)
    public final void method329(boolean arg0, class186 arg1) {
        field628++;
        while (true) {
            int var3 = arg1.method1322(false);
            if (var3 == 0) {
                if (arg0) {
                    field630 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method328(arg1, var3, (byte) 114);
        }
    }
}
