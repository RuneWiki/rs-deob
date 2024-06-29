import java.awt.Canvas;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class281 extends class513 {

    @OriginalMember(owner = "client!cl", name = "v", descriptor = "Lpja;")
    public static class43 field3898 = new class43(50);

    @OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
    public static int field3906 = -1;

    @OriginalMember(owner = "client!cl", name = "w", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
    public int field3901;

    @OriginalMember(owner = "client!cl", name = "z", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!cl", name = "A", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!cl", name = "C", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!cl", name = "F", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
    public int field3909;

    @OriginalMember(owner = "client!cl", name = "H", descriptor = "I")
    public int field3910;

    @OriginalMember(owner = "client!cl", name = "J", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!cl", name = "K", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!cl", name = "B", descriptor = "Lpga;")
    public static class562 field3904;

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "Ljava/lang/String;")
    public String field3913;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)J")
    public final long method1812(int arg0) {
        if (arg0 != -962962312) {
            method1816((byte) 53);
        }
        ++field3905;
        return super.field2528 & 72057594037927935L;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(IBI)Z")
    public static final boolean method1813(int arg0, byte arg1, int arg2) {
        ++field3911;
        if (arg1 <= 15) {
            return true;
        } else {
            return ~(arg0 & 2048) != -1 && ~(arg2 & 55) != -1;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLjava/awt/Canvas;Ld;II)Lha;")
    public static final class66 method1814(byte arg0, Canvas arg1, class162 arg2, int arg3, int arg4) {
        if (arg0 != -94) {
            return null;
        } else {
            ++field3902;
            return new class136(arg1, arg2, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIII)V")
    public static final void method1815(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3907;
        if (~arg2 > ~arg0) {
            for (int var5 = arg2; arg0 > var5; ++var5) {
                class298.field4105[var5][arg1] = arg3;
            }
        } else {
            for (int var6 = arg0; arg2 > var6; ++var6) {
                class298.field4105[var6][arg1] = arg3;
            }
        }
        if (arg4 <= 49) {
            field3904 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public static void method1816(byte arg0) {
        field3904 = null;
        field3898 = null;
        if (arg0 != 87) {
            method1815(1, 124, -68, 35, 120);
        }
    }

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "(B)J")
    public final long method1817(byte arg0) {
        ++field3903;
        int var2 = -62 / ((arg0 - -48) / 32);
        return super.field7008 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(B)V")
    public final void method1818(byte arg0) {
        super.field7008 = super.field7008 & Long.MIN_VALUE | class197.method1423(1) - -500L;
        ++field3899;
        class191.field2934.method1953((byte) 83, this);
        if (arg0 <= 77) {
            this.field3909 = -103;
        }
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)I")
    public final int method1819(int arg0) {
        if (arg0 < 87) {
            this.method1819(101);
        }
        ++field3912;
        return (int) (super.field2528 >>> 56 & 255L);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/Throwable;)V")
    public static final void method1820(String arg0, int arg1, Throwable arg2) {
        ++field3908;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class5.method33(arg2, (byte) 42);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            if (arg1 == 28395) {
                class777.method4263(var3, -1);
                String var4 = class246.method1641(":", "%3a", var3, (byte) -52);
                String var5 = class246.method1641("@", "%40", var4, (byte) -52);
                String var6 = class246.method1641("&", "%26", var5, (byte) -52);
                String var7 = class246.method1641("#", "%23", var6, (byte) -52);
                if (class331.field4493 != null) {
                    class545 var8 = class648.field8969.method4111((byte) -117, new URL(class331.field4493.getCodeBase(), "clienterror.ws?c=" + class251.field3528 + "&u=" + (class619.field8623 == null ? String.valueOf(class649.field8973) : class619.field8623) + "&v1=" + class742.field10231 + "&v2=" + class742.field10247 + "&e=" + var7));
                    while (~var8.field7412 == -1) {
                        class643.method3577(1L, 0);
                    }
                    if (~var8.field7412 == -2) {
                        DataInputStream var9 = (DataInputStream) var8.field7416;
                        var9.read();
                        var9.close();
                    }
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "(B)V")
    public final void method1821(byte arg0) {
        super.field7008 |= Long.MIN_VALUE;
        int var2 = 39 % ((arg0 - -90) / 33);
        ++field3900;
        if (this.method1817((byte) -9) == 0L) {
            class38.field639.method1953((byte) 83, this);
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(IJ)V")
    public class281(int arg0, long arg1) {
        super.field2528 = (long) arg0 << 56 | arg1;
    }
}
