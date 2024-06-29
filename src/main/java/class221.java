import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class221 {

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lna;")
    private class31 field3838 = new class31();

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    private int field3840;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    private int field3834;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Lhe;")
    private class19 field3846;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "[I")
    public static int[] field3841 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field3831;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "Lua;")
    public static class113 field3837;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
    public final void method1478(int arg0, int arg1) {
        if (class106.field1758 != null) {
            for (class125 var3 = (class125) this.field3838.method274((byte) -102); var3 != null; var3 = (class125) this.field3838.method272(true)) {
                if (var3.method776(-104)) {
                    if (var3.method777(4) == null) {
                        var3.method1146(26159);
                        var3.method392(1);
                        this.field3840++;
                    }
                } else if ((++var3.field865) > ((long) arg0)) {
                    class125 var4 = class106.field1758.method1674(var3, (byte) 37);
                    this.field3846.method148(-1, var4, var3.field2827);
                    class136.method938(-123, var4, var3);
                    var3.method1146(26159);
                    var3.method392(1);
                }
            }
        }
        if (arg1 <= 70) {
            method1490((class160) null);
        }
        field3839++;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)I")
    public static final int method1479(boolean arg0, int arg1) {
        if (arg0) {
            method1479(true, -52);
        }
        field3836++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BJ)Ljava/lang/Object;")
    public final Object method1480(byte arg0, long arg1) {
        class125 var4 = (class125) this.field3846.method150(arg1, arg0 + 48);
        field3843++;
        if (var4 == null) {
            return null;
        }
        if (arg0 != 50) {
            this.field3840 = 39;
        }
        Object var5 = var4.method777(4);
        if (var5 == null) {
            var4.method1146(26159);
            var4.method392(1);
            this.field3840++;
            return null;
        }
        if (var4.method776(-126)) {
            class222 var6 = new class222(var5);
            this.field3846.method148(arg0 - 51, var6, var4.field2827);
            this.field3838.method273(0, var6);
            var6.field865 = 0L;
            var4.method1146(26159);
            var4.method392(1);
        } else {
            this.field3838.method273(0, var4);
            var4.field865 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public final void method1481(boolean arg0) {
        if (arg0) {
            this.method1483((byte) -11, 19L, (Object) null);
        }
        this.field3838.method270((byte) 88);
        field3833++;
        this.field3846.method146(-1);
        this.field3840 = this.field3834;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(JI)V")
    public final void method1482(long arg0, int arg1) {
        field3842++;
        if (arg1 != 1625459090) {
            this.method1483((byte) 69, -53L, (Object) null);
        }
        class125 var4 = (class125) this.field3846.method150(arg0, -81);
        if (var4 != null) {
            var4.method1146(arg1 ^ 0x60E2EFBD);
            var4.method392(1);
            this.field3840++;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BJLjava/lang/Object;)V")
    public final void method1483(byte arg0, long arg1, Object arg2) {
        this.method1482(arg1, 1625459090);
        if (this.field3840 == 0) {
            class125 var5 = (class125) this.field3838.method267(-117);
            var5.method1146(26159);
            var5.method392(1);
        } else {
            this.field3840--;
        }
        class222 var6 = new class222(arg2);
        field3835++;
        this.field3846.method148(-1, var6, arg1);
        if (arg0 < -97) {
            this.field3838.method273(0, var6);
            var6.field865 = 0L;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method1484(int arg0) {
        field3841 = null;
        field3837 = null;
        if (arg0 != 0) {
            method1487(16);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public final void method1485(byte arg0) {
        field3829++;
        for (class125 var2 = (class125) this.field3838.method274((byte) 30); var2 != null; var2 = (class125) this.field3838.method272(true)) {
            if (var2.method776(-128)) {
                var2.method1146(26159);
                var2.method392(1);
                this.field3840++;
            }
        }
        if (arg0 > -68) {
            this.method1483((byte) 100, 65L, (Object) null);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)V")
    public static final void method1486(int arg0, int arg1) {
        class266.field4684 = arg0;
        field3845++;
        class277.field4818 = -1;
        class97.field1558 = -1;
        if (arg1 != 20386) {
            method1486(37, 55);
        }
        class133.method922(arg1 - 20387);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static final void method1487(int arg0) {
        class266.field4673.method1485((byte) -83);
        if (arg0 == 0) {
            field3844++;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(ZI)I")
    public static final int method1488(boolean arg0, int arg1) {
        field3832++;
        if (!arg0) {
            method1488(true, -116);
        }
        return (arg1 & 0x1CDEB3) >> 18;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)I")
    public final int method1489(byte arg0) {
        int var2 = 0;
        field3831++;
        for (class125 var3 = (class125) this.field3838.method274((byte) -105); var3 != null; var3 = (class125) this.field3838.method272(true)) {
            if (!var3.method776(-106)) {
                var2++;
            }
        }
        if (arg0 > -101) {
            this.method1478(47, 85);
        }
        return var2;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ll;)V")
    public static final void method1490(class160 arg0) {
        for (int var1 = arg0.field2814; var1 <= arg0.field2790; var1++) {
            for (int var2 = arg0.field2796; var2 <= arg0.field2788; var2++) {
                class162 var3 = class220.field3787[arg0.field2802][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2841; var4++) {
                        if (var3.field2845[var4] == arg0) {
                            var3.field2841--;
                            for (int var5 = var4; var5 < var3.field2841; var5++) {
                                var3.field2845[var5] = var3.field2845[var5 + 1];
                                var3.field2846[var5] = var3.field2846[var5 + 1];
                            }
                            var3.field2845[var3.field2841] = null;
                            break;
                        }
                    }
                    var3.field2840 = 0;
                    for (int var6 = 0; var6 < var3.field2841; var6++) {
                        var3.field2840 |= var3.field2846[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I)V")
    public class221(int arg0) {
        this.field3840 = arg0;
        this.field3834 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3846 = new class19(var2);
    }
}
