import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class529 {

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public int field7310 = 0;

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    public int field7322 = -1;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public int field7316 = 0;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public int field7317 = -1;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    private int field7312 = -1;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public int field7319 = -1;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    private int field7325 = -1;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public int field7315 = 70;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public int field7327 = 0;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    private int field7326 = -1;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    private int field7330 = -1;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "Ljava/lang/String;")
    private String field7313 = "";

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public int field7332 = 16777215;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field7311;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field7318;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "I")
    public static int field7320;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field7321;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "Lcq;")
    public class492 field7329;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Lth;")
    public static class621 field7309;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 4)
    public static void method3059(int arg0) {
        field7309 = null;
        if (arg0 != 70) {
            method3059(49);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lha;I)Lhh;", line = 14)
    public final class140 method3060(class66 arg0, int arg1) {
        field7321++;
        if (arg1 < ~this.field7326) {
            return null;
        }
        class140 var3 = (class140) this.field7329.field6923.method3109((byte) 121, (long) this.field7326);
        if (var3 == null) {
            this.method3064(-21149, arg0);
            var3 = (class140) this.field7329.field6923.method3109((byte) 116, (long) this.field7326);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)Ljava/lang/String;", line = 37)
    public final String method3061(int arg0, int arg1) {
        if (arg1 != -8) {
            return null;
        }
        field7328++;
        String var3 = this.field7313;
        while (true) {
            int var4 = var3.indexOf("%1");
            if (var4 < 0) {
                return var3;
            }
            var3 = var3.substring(0, var4) + class648.method3603(arg0, -35, false) + var3.substring(var4 + 2);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLdt;)V", line = 63)
    public final void method3062(byte arg0, class254 arg1) {
        while (true) {
            int var3 = arg1.method1731((byte) 64);
            if (var3 == 0) {
                field7311++;
                if (arg0 != 62) {
                    field7320 = 64;
                    return;
                }
                return;
            }
            this.method3065(var3, arg1, (byte) 119);
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Lha;I)Lhh;", line = 87)
    public final class140 method3063(class66 arg0, int arg1) {
        field7318++;
        if (~this.field7312 > arg1) {
            return null;
        }
        class140 var3 = (class140) this.field7329.field6923.method3109((byte) 107, (long) this.field7312);
        if (var3 == null) {
            this.method3064(-21149, arg0);
            var3 = (class140) this.field7329.field6923.method3109((byte) 127, (long) this.field7312);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILha;)V", line = 112)
    private final void method3064(int arg0, class66 arg1) {
        field7314++;
        if (arg0 != -21149) {
            this.field7329 = null;
        }
        class172 var3 = this.field7329.field6922;
        if (this.field7325 >= 0 && this.field7329.field6923.method3109((byte) 104, (long) this.field7325) == null && var3.method1185(this.field7325, 9330)) {
            class162 var4 = class162.method1129(var3, this.field7325);
            this.field7329.field6923.method3108((long) this.field7325, 16337, arg1.method466(var4, true));
        }
        if (this.field7312 >= 0 && this.field7329.field6923.method3109((byte) 110, (long) this.field7312) == null && var3.method1185(this.field7312, 9330)) {
            class162 var5 = class162.method1129(var3, this.field7312);
            this.field7329.field6923.method3108((long) this.field7312, arg0 ^ 0xFFFF92B2, arg1.method466(var5, true));
        }
        if (this.field7330 >= 0 && this.field7329.field6923.method3109((byte) 120, (long) this.field7330) == null && var3.method1185(this.field7330, arg0 + 30479)) {
            class162 var6 = class162.method1129(var3, this.field7330);
            this.field7329.field6923.method3108((long) this.field7330, arg0 ^ 0xFFFF92B2, arg1.method466(var6, true));
        }
        if (this.field7326 >= 0 && this.field7329.field6923.method3109((byte) 122, (long) this.field7326) == null && var3.method1185(this.field7326, arg0 ^ 0xFFFF8911)) {
            class162 var7 = class162.method1129(var3, this.field7326);
            this.field7329.field6923.method3108((long) this.field7326, 16337, arg1.method466(var7, true));
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILdt;B)V", line = 173)
    private final void method3065(int arg0, class254 arg1, byte arg2) {
        field7323++;
        if (arg0 == 1) {
            this.field7322 = arg1.method1728((byte) 61);
        } else if (arg0 == 2) {
            this.field7332 = arg1.method1722(false);
        } else if (arg0 == 3) {
            this.field7325 = arg1.method1728((byte) 57);
        } else if (arg0 == 4) {
            this.field7330 = arg1.method1728((byte) 117);
        } else if (arg0 == 5) {
            this.field7312 = arg1.method1728((byte) 45);
        } else if (arg0 == 6) {
            this.field7326 = arg1.method1728((byte) 81);
        } else if (arg0 == 7) {
            this.field7327 = arg1.method1695(423951304);
        } else if (arg0 == 8) {
            this.field7313 = arg1.method1705((byte) 97);
        } else if (arg0 == 9) {
            this.field7315 = arg1.method1728((byte) 34);
        } else if (arg0 == 10) {
            this.field7310 = arg1.method1695(423951304);
        } else if (arg0 == 11) {
            this.field7319 = 0;
        } else if (arg0 == 12) {
            this.field7317 = arg1.method1731((byte) 64);
        } else if (arg0 == 13) {
            this.field7316 = arg1.method1695(423951304);
        } else if (arg0 == 14) {
            this.field7319 = arg1.method1728((byte) 103);
        }
        if (arg2 != 119) {
            this.field7319 = 0;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(ILha;)Lhh;", line = 243)
    public final class140 method3066(int arg0, class66 arg1) {
        int var3 = 37 % ((arg0 - 8) / 54);
        field7324++;
        if (this.field7325 < 0) {
            return null;
        }
        class140 var4 = (class140) this.field7329.field6923.method3109((byte) 127, (long) this.field7325);
        if (var4 == null) {
            this.method3064(-21149, arg1);
            var4 = (class140) this.field7329.field6923.method3109((byte) 118, (long) this.field7325);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(Lha;I)Lhh;", line = 270)
    public final class140 method3067(class66 arg0, int arg1) {
        field7331++;
        if (this.field7330 < 0) {
            return null;
        }
        if (arg1 >= -104) {
            this.method3064(-101, null);
        }
        class140 var3 = (class140) this.field7329.field6923.method3109((byte) 103, (long) this.field7330);
        if (var3 == null) {
            this.method3064(-21149, arg0);
            var3 = (class140) this.field7329.field6923.method3109((byte) 107, (long) this.field7330);
        }
        return var3;
    }
}
