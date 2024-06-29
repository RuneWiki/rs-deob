import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class146 {

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Lwe;")
    private class24 field2113 = new class24();

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    private int field2112;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    private int field2121;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "Ltn;")
    private class109 field2114;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Lhc;")
    public static class368 field2120 = new class368("glow2:", "", "", "");

    @OriginalMember(owner = "client!la", name = "o", descriptor = "Lka;")
    public static class408 field2124 = new class408(260);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "Laa;")
    public static class276 field2122;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method1048(int arg0) {
        field2124 = null;
        field2122 = null;
        field2120 = null;
        if (arg0 != 8754) {
            method1048(-42);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lne;IIIII)Ljava/awt/Frame;")
    public static final Frame method1049(class76 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2125++;
        if (!arg0.method606(-34)) {
            return null;
        }
        if (arg3 == arg5) {
            class49[] var6 = class130.method977(arg0, arg5 - 328264830);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field620 == arg1 && var6[var8].field626 == arg4 && (arg2 == 0 || var6[var8].field625 == arg2) && (!var7 || var6[var8].field623 > arg3)) {
                    arg3 = var6[var8].field623;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class285 var9 = arg0.method589(arg2, arg1, arg4, arg3, 1353396240);
        while (var9.field3875 == 0) {
            class328.method1999(0, 10L);
        }
        Frame var10 = (Frame) var9.field3871;
        if (var10 == null) {
            return null;
        } else if (var9.field3875 == 2) {
            class64.method513(var10, arg5 - 2, arg0);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILm;)Ljava/lang/Object;")
    public final Object method1050(int arg0, class181 arg1) {
        field2127++;
        long var3 = arg1.method966(-101);
        if (arg0 != 1088) {
            this.method1052((byte) -97, (Object) null, (class181) null);
        }
        for (class448 var5 = (class448) this.field2114.method837((byte) -72, var3); var5 != null; var5 = (class448) this.field2114.method838(48)) {
            if (var5.field6347.method965(arg1, 125)) {
                Object var6 = var5.method350(arg0 + 28177);
                if (var6 != null) {
                    if (var5.method352((byte) 90)) {
                        class41 var7 = new class41(arg1, var6);
                        this.field2114.method835(4, var7, var5.field4226);
                        this.field2113.method145(var7, false);
                        var7.field2411 = 0L;
                        var5.method1884(false);
                        var5.method1213((byte) 106);
                    } else {
                        this.field2113.method145(var5, false);
                        var5.field2411 = 0L;
                    }
                    return var6;
                }
                var5.method1884(false);
                var5.method1213((byte) 106);
                this.field2112++;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIZIIIII)Z")
    public static final boolean method1051(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg3) {
            method1048(64);
        }
        field2126++;
        if (arg4 + arg5 > arg6 && arg4 < arg6 + arg8) {
            return arg0 < arg1 + arg7 && arg7 < arg0 + arg2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLjava/lang/Object;Lm;)V")
    public final void method1052(byte arg0, Object arg1, class181 arg2) {
        this.method1056((byte) -124, arg2);
        field2123++;
        if (this.field2112 == 0) {
            class448 var4 = (class448) this.field2113.method146((byte) 121);
            var4.method1884(false);
            var4.method1213((byte) 106);
        } else {
            this.field2112--;
        }
        class41 var5 = new class41(arg2, arg1);
        this.field2114.method835(4, var5, arg2.method966(-118));
        if (arg0 > -97) {
            method1054((class316) null, -104);
        }
        this.field2113.method145(var5, false);
        var5.field2411 = 0L;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)I")
    public final int method1053(byte arg0) {
        field2110++;
        if (arg0 != 87) {
            this.method1052((byte) 69, (Object) null, (class181) null);
        }
        return this.field2121;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lij;I)V")
    public static final void method1054(class316 arg0, int arg1) {
        field2111++;
        class177.field2538 = arg0;
        class182.field2562 = class177.field2538.method1934((byte) 28, 15);
        if (arg1 != -1) {
            method1049((class76) null, -105, 32, -18, 86, 54);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
    public final void method1055(int arg0, int arg1) {
        if (class325.field4422 != null) {
            for (class448 var3 = (class448) this.field2113.method152(102); var3 != null; var3 = (class448) this.field2113.method148(5)) {
                if (var3.method352((byte) 90)) {
                    if (var3.method350(arg1 ^ 0xFFFF8DAE) == null) {
                        var3.method1884(false);
                        var3.method1213((byte) 106);
                        this.field2112++;
                    }
                } else if (((long) arg0) < (++var3.field2411)) {
                    class448 var4 = class325.field4422.method1612(5, var3);
                    this.field2114.method835(arg1 ^ 0xFFFFFFFB, var4, var3.field4226);
                    class104.method785(var3, -1, var4);
                    var3.method1884(false);
                    var3.method1213((byte) 106);
                }
            }
        }
        field2115++;
        if (arg1 != -1) {
            field2128 = -15;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLm;)V")
    private final void method1056(byte arg0, class181 arg1) {
        field2117++;
        long var3 = arg1.method966(-118);
        if (arg0 > -77) {
            method1051(33, 5, 24, false, 57, -78, 85, 1, -90);
        }
        for (class448 var5 = (class448) this.field2114.method837((byte) -72, var3); var5 != null; var5 = (class448) this.field2114.method838(48)) {
            if (var5.field6347.method965(arg1, 117)) {
                var5.method1884(false);
                var5.method1213((byte) 106);
                this.field2112++;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
    public final void method1057(int arg0) {
        if (arg0 != 0) {
            method1051(39, 109, -11, false, -43, 99, 25, -15, -64);
        }
        this.field2113.method151(126);
        field2118++;
        this.field2114.method843(arg0 - 1);
        this.field2112 = this.field2121;
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
    public final void method1058(byte arg0) {
        for (class448 var2 = (class448) this.field2113.method152(72); var2 != null; var2 = (class448) this.field2113.method148(5)) {
            if (var2.method352((byte) 90)) {
                var2.method1884(false);
                var2.method1213((byte) 106);
                this.field2112++;
            }
        }
        if (arg0 != 74) {
            this.field2121 = -116;
        }
        field2119++;
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(I)I")
    public final int method1059(int arg0) {
        int var2 = -123 % ((65 - arg0) / 49);
        field2116++;
        return this.field2112;
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(I)V")
    public class146(int arg0) {
        this.field2112 = arg0;
        this.field2121 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field2114 = new class109(var2);
    }
}
