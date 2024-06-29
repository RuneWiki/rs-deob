import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class692 {

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Ljava/lang/String;")
    private String field9606 = "";

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public int field9609 = -1;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public int field9599 = 16777215;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    private int field9615 = -1;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    private int field9602 = -1;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public int field9610 = -1;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public int field9617 = 0;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    private int field9607 = -1;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    private int field9613 = -1;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public int field9620 = 0;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public int field9619 = 0;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public int field9621 = -1;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public int field9622 = 70;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "Lkg;")
    public static class275 field9623 = new class275(119, -2);

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public static int field9624 = 0;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "Lkg;")
    public static class275 field9625 = new class275(48, 6);

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    public static int field9626 = -2;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field9601;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field9603;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field9604;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field9605;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field9608;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field9611;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public static int field9612;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field9616;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field9618;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Lut;")
    public class127 field9600;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "Lvea;")
    public static class277 field9614;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILha;)Liea;", line = 5)
    public final class481 method3872(int arg0, class60 arg1) {
        field9618++;
        if (this.field9607 < 0) {
            return null;
        }
        if (arg0 >= -45) {
            this.field9602 = -5;
        }
        class481 var3 = (class481) this.field9600.field1812.method3079((long) this.field9607, 0);
        if (var3 == null) {
            this.method3873(arg1, (byte) 107);
            var3 = (class481) this.field9600.field1812.method3079((long) this.field9607, 0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lha;B)V", line = 27)
    private final void method3873(class60 arg0, byte arg1) {
        field9611++;
        class547 var3 = this.field9600.field1813;
        if (this.field9607 >= 0 && this.field9600.field1812.method3079((long) this.field9607, 0) == null && var3.method3154(this.field9607, (byte) 98)) {
            class728 var4 = class728.method4054(var3, this.field9607);
            this.field9600.field1812.method3077((byte) -91, (long) this.field9607, arg0.method508(var4, true));
        }
        if (this.field9602 >= 0 && this.field9600.field1812.method3079((long) this.field9602, 0) == null && var3.method3154(this.field9602, (byte) 98)) {
            class728 var5 = class728.method4054(var3, this.field9602);
            this.field9600.field1812.method3077((byte) -48, (long) this.field9602, arg0.method508(var5, true));
        }
        if (this.field9613 >= 0 && this.field9600.field1812.method3079((long) this.field9613, 0) == null && var3.method3154(this.field9613, (byte) 98)) {
            class728 var6 = class728.method4054(var3, this.field9613);
            this.field9600.field1812.method3077((byte) -106, (long) this.field9613, arg0.method508(var6, true));
        }
        if (arg1 > 71 && this.field9615 >= 0 && this.field9600.field1812.method3079((long) this.field9615, 0) == null && var3.method3154(this.field9615, (byte) 98)) {
            class728 var7 = class728.method4054(var3, this.field9615);
            this.field9600.field1812.method3077((byte) -27, (long) this.field9615, arg0.method508(var7, true));
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lha;I)Liea;", line = 99)
    public final class481 method3874(class60 arg0, int arg1) {
        field9605++;
        if (this.field9602 < 0) {
            return null;
        } else if (arg1 >= -62) {
            return null;
        } else {
            class481 var3 = (class481) this.field9600.field1812.method3079((long) this.field9602, 0);
            if (var3 == null) {
                this.method3873(arg0, (byte) 80);
                var3 = (class481) this.field9600.field1812.method3079((long) this.field9602, 0);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(ILha;)Liea;", line = 132)
    public final class481 method3875(int arg0, class60 arg1) {
        field9601++;
        if (this.field9613 < 0) {
            return null;
        }
        if (arg0 != 8482) {
            this.field9606 = null;
        }
        class481 var3 = (class481) this.field9600.field1812.method3079((long) this.field9613, 0);
        if (var3 == null) {
            this.method3873(arg1, (byte) 106);
            var3 = (class481) this.field9600.field1812.method3079((long) this.field9613, 0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)Ljava/lang/String;", line = 156)
    public final String method3876(byte arg0, int arg1) {
        field9612++;
        if (arg0 != 54) {
            this.method3874(null, -25);
        }
        String var3 = this.field9606;
        while (true) {
            int var4 = var3.indexOf("%1");
            if (var4 < 0) {
                return var3;
            }
            var3 = var3.substring(0, var4) + class646.method3624(arg1, 0, false) + var3.substring(var4 + 2);
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(ILha;)Liea;", line = 192)
    public final class481 method3877(int arg0, class60 arg1) {
        field9604++;
        if (arg0 > this.field9615) {
            return null;
        }
        class481 var3 = (class481) this.field9600.field1812.method3079((long) this.field9615, 0);
        if (var3 == null) {
            this.method3873(arg1, (byte) 123);
            var3 = (class481) this.field9600.field1812.method3079((long) this.field9615, arg0);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILsl;)V", line = 212)
    public final void method3878(int arg0, class461 arg1) {
        if (arg0 != 0) {
            return;
        }
        while (true) {
            int var3 = arg1.method2600((byte) -126);
            if (var3 == 0) {
                field9608++;
                return;
            }
            this.method3880(var3, arg0 ^ 0x6E22, arg1);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 235)
    public static void method3879(int arg0) {
        field9625 = null;
        if (arg0 < 114) {
            field9624 = -48;
        }
        field9623 = null;
        field9614 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILsl;)V", line = 268)
    private final void method3880(int arg0, int arg1, class461 arg2) {
        if (arg1 != 28194) {
            field9625 = null;
        }
        if (arg0 == 1) {
            this.field9621 = arg2.method2566(arg1 - 28196);
        } else if (arg0 == 2) {
            this.field9599 = arg2.method2576((byte) 86);
        } else if (arg0 == 3) {
            this.field9607 = arg2.method2566(-2);
        } else if (arg0 == 4) {
            this.field9613 = arg2.method2566(-2);
        } else if (arg0 == 5) {
            this.field9602 = arg2.method2566(-2);
        } else if (arg0 == 6) {
            this.field9615 = arg2.method2566(-2);
        } else if (arg0 == 7) {
            this.field9617 = arg2.method2577(2);
        } else if (arg0 == 8) {
            this.field9606 = arg2.method2625(arg1 - 28306);
        } else if (arg0 == 9) {
            this.field9622 = arg2.method2566(-2);
        } else if (arg0 == 10) {
            this.field9620 = arg2.method2577(2);
        } else if (arg0 == 11) {
            this.field9609 = 0;
        } else if (arg0 == 12) {
            this.field9610 = arg2.method2600((byte) -127);
        } else if (arg0 == 13) {
            this.field9619 = arg2.method2577(2);
        } else if (arg0 == 14) {
            this.field9609 = arg2.method2566(-2);
        }
        field9616++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;)[B", line = 336)
    public static final byte[] method3881(int arg0, String arg1) {
        field9603++;
        int var2 = arg1.length();
        if (arg0 > -75) {
            field9624 = 29;
        }
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg1.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }
}
