import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class8 {

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "Z")
    public static boolean field118 = false;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "Z")
    public static boolean field120 = false;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "[I")
    public static int[] field117 = new int[50];

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field122 = 0;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "La;")
    public static class281 field127 = new class281();

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "Lpe;")
    public static class277 field129;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "[[Lmn;")
    public static class161[][] field128;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V", line = 6)
    public static void method76(byte arg0) {
        int var1 = -91 / ((arg0 - 29) / 58);
        field128 = (class161[][]) null;
        field117 = null;
        field129 = null;
        field127 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)J", line = 18)
    public static final long method77(int arg0, int arg1, int arg2) {
        class79 var3 = class213.field3262[arg0][arg1][arg2];
        return var3 == null || var3.field1179 == null ? 0L : var3.field1179.field5292;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(III)I", line = 27)
    public static final int method78(int arg0, int arg1, int arg2) {
        if (arg1 < 69) {
            method82((class194) null, (class95) null, (byte) 1, (class95) null);
        }
        field126++;
        int var3 = 0;
        while (arg0 > 0) {
            var3 = arg2 & 0x1 | var3 << 1;
            arg2 >>>= 0x1;
            arg0--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "([SI)[S", line = 60)
    public static final short[] method79(short[] arg0, int arg1) {
        field125++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 <= 94) {
            method78(-16, -95, 13);
        }
        short[] var2 = new short[arg0.length];
        class126.method945(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(JB)Ljava/lang/String;", line = 79)
    public static final String method80(long arg0, byte arg1) {
        field123++;
        if (arg1 != -43) {
            field122 = 105;
        }
        return class101.method759(arg0, (byte) -80);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V", line = 98)
    public static final void method81(boolean arg0) {
        if (arg0) {
            class213.field3262 = class67.field967;
            class203.field3111 = class71.field1024;
            class251.field3797 = class134.field2034;
        } else {
            class213.field3262 = class263.field4062;
            class203.field3111 = class79.field1151;
            class251.field3797 = class319.field4929;
        }
        class139.field2088 = class213.field3262.length;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Lli;Ljd;BLjd;)V", line = 125)
    public static final void method82(class194 arg0, class95 arg1, byte arg2, class95 arg3) {
        class278.field4325 = arg0;
        if (arg2 != -95) {
            field129 = (class277) null;
        }
        class60.field796 = arg3;
        class293.field4527 = arg1;
        if (class60.field796 != null) {
            class121.field1859 = class60.field796.method685((byte) 15, 1);
        }
        if (class293.field4527 != null) {
            class109.field1650 = class293.field4527.method685((byte) 15, 1);
        }
        field124++;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIB)Ljava/lang/String;", line = 156)
    public static final String method83(int arg0, int arg1, byte arg2) {
        int var3 = arg0 - arg1;
        field121++;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else {
            if (arg2 != -44) {
                method79((short[]) null, -73);
            }
            if (var3 < -3) {
                return "<col=ff7000>";
            } else if (var3 < 0) {
                return "<col=ffb000>";
            } else if (var3 > 9) {
                return "<col=00ff00>";
            } else if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 <= 3) {
                return var3 > 0 ? "<col=c0ff00>" : "<col=ffff00>";
            } else {
                return "<col=80ff00>";
            }
        }
    }
}
