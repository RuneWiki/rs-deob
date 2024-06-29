import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class144 implements class19 {

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Lmd;")
    private class84 field3424 = new class84();

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    private int field3445 = 0;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    private int field3442 = 128;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "D")
    private double field3446 = 1.0D;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    private int field3443;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "Lpb;")
    private class100 field3444;

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "[Lqd;")
    private class108[] field3437;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Lrd;")
    public static class114 field3420 = class84.method656("@or1@", (byte) 126);

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "[Lrd;")
    public static class114[] field3425 = new class114[100];

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Lrd;")
    private static class114 field3422 = class84.method656("You are standing in a members)2only area)3", (byte) 116);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field3416 = 0;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "Lrd;")
    public static class114 field3429 = field3422;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "Lrd;")
    public static class114 field3434 = class84.method656("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", (byte) 114);

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "Lrd;")
    private static class114 field3435 = class84.method656("Hide", (byte) 114);

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "Lrd;")
    public static class114 field3438 = class84.method656("Passwort: ", (byte) 118);

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "Lrd;")
    public static class114 field3428 = field3435;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public static int field3440 = 1;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(II)[I")
    public final int[] method130(int arg0, int arg1) {
        field3417++;
        if (arg1 != 20675) {
            field3416 = -9;
        }
        class108 var3 = this.field3437[arg0];
        if (var3 != null) {
            if (var3.field2486 != null) {
                this.field3424.method647(0, var3);
                var3.field2483 = true;
                return var3.field2486;
            }
            boolean var4 = var3.method822(this.field3446, this.field3442, this.field3444);
            if (var4) {
                if (this.field3445 == 0) {
                    class108 var5 = (class108) this.field3424.method652(false);
                    var5.method821();
                } else {
                    this.field3445--;
                }
                this.field3424.method647(0, var3);
                var3.field2483 = true;
                return var3.field2486;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IZ)Z")
    public final boolean method132(int arg0, boolean arg1) {
        field3439++;
        if (!arg1) {
            this.field3442 = -92;
        }
        return this.field3442 == 64;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static void method1141(byte arg0) {
        field3420 = null;
        field3425 = null;
        field3422 = null;
        field3429 = null;
        field3434 = null;
        field3428 = null;
        field3438 = null;
        if (arg0 > -93) {
            field3422 = null;
        }
        field3435 = null;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
    public final void method1142(byte arg0) {
        for (int var2 = 0; var2 < this.field3437.length; var2++) {
            if (this.field3437[var2] != null) {
                this.field3437[var2].method821();
            }
        }
        this.field3424 = new class84();
        this.field3445 = this.field3443;
        int var3 = 63 / ((arg0 - 11) / 48);
        field3430++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static final void method1143(int arg0) {
        int var1 = 0;
        if (arg0 != -24281) {
            method1141((byte) 21);
        }
        while (class77.field1765 > var1) {
            int var2 = class16.field317[var1];
            class8 var3 = class123.field2894[var2];
            if (var3 != null) {
                class106.method812(var3.field121.field2946, (byte) -74, var3);
            }
            var1++;
        }
        field3432++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I")
    public final int method129(int arg0, int arg1) {
        if (arg0 == -22953) {
            field3427++;
            return this.field3437[arg1] == null ? 0 : this.field3437[arg1].field2489;
        } else {
            return 126;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(DI)V")
    public final void method1144(double arg0, int arg1) {
        if (arg1 == -28996) {
            field3433++;
            this.field3446 = arg0;
            this.method1142((byte) 122);
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(II)V")
    public final void method1145(int arg0, int arg1) {
        field3431++;
        for (int var3 = arg1; var3 < this.field3437.length; var3++) {
            class108 var4 = this.field3437[var3];
            if (var4 != null && var4.field2488 != 0 && var4.field2483) {
                var4.method823(arg0);
                var4.field2483 = false;
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lrd;ILnd;)Lrd;")
    public static final class114 method1146(class114 arg0, int arg1, class90 arg2) {
        if (arg1 != arg0.method858((byte) 108, class124.field2920)) {
            label58: while (true) {
                int var3 = arg0.method858((byte) 99, class126.field3001);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg0.method858((byte) 39, class141.field3365);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg0.method858((byte) 60, class12.field229);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg0.method858((byte) 108, class29.field585);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg0.method858((byte) 33, class127.field3038);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg0.method858((byte) 44, class65.field1388);
                                                        if (var8 == -1) {
                                                            break label58;
                                                        }
                                                        class114 var9 = class72.field1610;
                                                        if (class46.field945 != null) {
                                                            var9 = class60.method487((byte) -92, class46.field945.field1825);
                                                            try {
                                                                if (class46.field945.field1823 != null) {
                                                                    byte[] var10 = ((String) class46.field945.field1823).getBytes("ISO-8859-1");
                                                                    var9 = class28.method204(var10, var10.length, 0, 0);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg0 = class101.method786((byte) 126, new class114[] { arg0.method860(var8, -23745, 0), var9, arg0.method866(false, var8 + 4) });
                                                    }
                                                }
                                                arg0 = class101.method786((byte) 127, new class114[] { arg0.method860(var7, -23745, 0), class12.method92(class55.method412(arg2, 4, (byte) -91), 8425), arg0.method866(false, var7 + 2) });
                                            }
                                        }
                                        arg0 = class101.method786((byte) 126, new class114[] { arg0.method860(var6, -23745, 0), class12.method92(class55.method412(arg2, 3, (byte) -82), 8425), arg0.method866(false, var6 + 2) });
                                    }
                                }
                                arg0 = class101.method786((byte) 126, new class114[] { arg0.method860(var5, arg1 - 23744, 0), class12.method92(class55.method412(arg2, 2, (byte) -65), 8425), arg0.method866(false, var5 + 2) });
                            }
                        }
                        arg0 = class101.method786((byte) 126, new class114[] { arg0.method860(var4, -23745, 0), class12.method92(class55.method412(arg2, 1, (byte) -124), 8425), arg0.method866(false, var4 + 2) });
                    }
                }
                arg0 = class101.method786((byte) 127, new class114[] { arg0.method860(var3, -23745, 0), class12.method92(class55.method412(arg2, 0, (byte) -78), 8425), arg0.method866(false, var3 + 2) });
            }
        }
        field3419++;
        return arg0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIZII)Z")
    public static final boolean method1147(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field3426++;
        if (!class1.method1(0, arg6)) {
            return false;
        }
        class14.field311 = null;
        boolean var7 = class101.method780(class78.field1772[arg6], 0, arg1, -1, arg5, arg0, (byte) 71, arg2, arg3, 0);
        if (arg4) {
            field3420 = null;
        }
        if (class14.field311 != null) {
            class101.method780(class14.field311, class72.field1620, arg1, -1412584499, arg5, arg0, (byte) 71, arg2, arg3, class8.field111);
        }
        return var7;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)Z")
    public final boolean method131(byte arg0, int arg1) {
        field3423++;
        return arg0 == -11 ? this.field3437[arg1].field2490 : false;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lpb;Lpb;IDI)V")
    public class144(class100 arg0, class100 arg1, int arg2, double arg3, int arg4) {
        this.field3443 = arg2;
        this.field3445 = this.field3443;
        this.field3446 = arg3;
        this.field3442 = arg4;
        this.field3444 = arg1;
        int[] var7 = arg0.method751(0, false);
        int var8 = var7.length;
        this.field3437 = new class108[arg0.method768(0, false)];
        for (int var9 = 0; var9 < var8; var9++) {
            class60 var10 = new class60(arg0.method762(0, var7[var9], (byte) 66));
            this.field3437[var7[var9]] = new class108(var10);
        }
    }
}
