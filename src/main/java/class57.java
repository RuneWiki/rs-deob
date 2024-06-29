import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class57 {

    @OriginalMember(owner = "client!v", name = "e", descriptor = "Lpe;")
    private class81 field1248 = new class81();

    @OriginalMember(owner = "client!v", name = "g", descriptor = "[J")
    public static long[] field1250 = new long[32];

    @OriginalMember(owner = "client!v", name = "d", descriptor = "Lsg;")
    private static class30 field1247 = class167.method1221((byte) 33, "Discard");

    @OriginalMember(owner = "client!v", name = "i", descriptor = "I")
    public static int field1252 = -1;

    @OriginalMember(owner = "client!v", name = "s", descriptor = "S")
    public static short field1262 = 256;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Lsg;")
    public static class30 field1246 = field1247;

    @OriginalMember(owner = "client!v", name = "p", descriptor = "Lsg;")
    public static class30 field1259 = class167.method1221((byte) 33, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!v", name = "f", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!v", name = "h", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!v", name = "j", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!v", name = "k", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!v", name = "l", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!v", name = "n", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!v", name = "o", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!v", name = "q", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!v", name = "r", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!v", name = "m", descriptor = "Lpe;")
    private class81 field1256;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)Lpe;")
    public final class81 method533(int arg0) {
        field1260++;
        class81 var2 = this.field1256;
        if (arg0 != 7) {
            return null;
        } else if (this.field1248 == var2) {
            this.field1256 = null;
            return null;
        } else {
            this.field1256 = var2.field1740;
            return var2;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V")
    public final void method534(int arg0) {
        while (true) {
            class81 var2 = this.field1248.field1740;
            if (this.field1248 == var2) {
                field1249++;
                this.field1256 = null;
                if (arg0 >= -70) {
                    field1262 = -118;
                    return;
                }
                return;
            }
            var2.method701(true);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lpe;B)V")
    public final void method535(class81 arg0, byte arg1) {
        if (arg1 >= -53) {
            return;
        }
        if (arg0.field1736 != null) {
            arg0.method701(true);
        }
        field1254++;
        arg0.field1740 = this.field1248;
        arg0.field1736 = this.field1248.field1736;
        arg0.field1736.field1740 = arg0;
        arg0.field1740.field1736 = arg0;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIIZ)I")
    public static final int method536(int arg0, int arg1, int arg2, boolean arg3) {
        int var4 = arg2 & 0x3;
        field1251++;
        if (!arg3) {
            method537((byte) -89, (class8) null);
        }
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLaa;)V")
    public static final void method537(byte arg0, class8 arg1) {
        field1245++;
        byte[] var2 = new byte[24];
        if (class14.field274 != null) {
            try {
                int var3 = 0;
                class14.field274.method1677(0, 0L);
                class14.field274.method1666(0, var2);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        if (arg0 <= -93) {
            arg1.method62(24, 0, var2, 0);
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    public class57() {
        this.field1248.field1736 = this.field1248;
        this.field1248.field1740 = this.field1248;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
    public static void method538(boolean arg0) {
        if (!arg0) {
            field1246 = null;
            field1247 = null;
            field1250 = null;
            field1259 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)Lsg;")
    public static final class30 method539(int arg0, boolean arg1) {
        field1253++;
        if (arg0 <= 0 || arg0 > 255) {
            throw new IllegalArgumentException();
        }
        class30 var2 = new class30();
        if (arg1) {
            var2.field576 = 1;
            var2.field618 = new byte[1];
            var2.field618[0] = (byte) arg0;
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
    public static final void method540(int arg0) {
        class17.method171();
        int var1 = 0;
        if (arg0 != -31713) {
            field1262 = -104;
        }
        while (var1 < 4) {
            class100.field2032[var1].method120(arg0 + 31798);
            var1++;
        }
        System.gc();
        field1244++;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Z)Lpe;")
    public final class81 method541(boolean arg0) {
        if (arg0) {
            return null;
        }
        field1255++;
        class81 var2 = this.field1248.field1740;
        if (this.field1248 == var2) {
            return null;
        } else {
            var2.method701(true);
            return var2;
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)Lpe;")
    public final class81 method542(int arg0) {
        if (arg0 != 18844) {
            return null;
        }
        class81 var2 = this.field1248.field1740;
        field1257++;
        if (this.field1248 == var2) {
            this.field1256 = null;
            return null;
        } else {
            this.field1256 = var2.field1740;
            return var2;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)I")
    public final int method543(byte arg0) {
        field1261++;
        int var2 = 0;
        class81 var3 = this.field1248.field1740;
        if (arg0 <= 94) {
            return 67;
        }
        while (this.field1248 != var3) {
            var3 = var3.field1740;
            var2++;
        }
        return var2;
    }
}
