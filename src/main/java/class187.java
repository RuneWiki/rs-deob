import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class187 {

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
    public int field2759;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public static int field2758 = -1;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    public static int field2753;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "Lvu;")
    public static class155 field2761;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIB)V")
    public static final void method1250(int arg0, int arg1, int arg2, byte arg3) {
        class17.field275.method1858(arg0, (byte) -45);
        field2755++;
        class17.field275.method1866(arg2, true);
        int var4 = -30 % ((-arg3 - 65) / 61);
        class17.field275.method1866(arg1, true);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(BLjava/lang/String;)J")
    public static final long method1251(byte arg0, String arg1) {
        field2760++;
        int var2 = arg1.length();
        long var3 = 0L;
        if (arg0 != 108) {
            field2761 = null;
        }
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (long) arg1.charAt(var5) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIZIII)V")
    public static final void method1252(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (!arg2) {
            method1253(9);
        }
        if (class519.field7633 <= arg4 && arg1 <= class375.field5387 && class23.field320 <= arg0 && class233.field3241 >= arg3) {
            class382.method2268(arg1, arg4, arg0, arg3, (byte) 83, arg5);
        } else {
            class190.method1262(arg0, arg5, arg3, arg1, -1, arg4);
        }
        field2756++;
    }

    @OriginalMember(owner = "client!vr", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2757++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V")
    public static void method1253(int arg0) {
        if (arg0 != -12130) {
            field2761 = null;
        }
        field2761 = null;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1254(int arg0, String arg1, int arg2) {
        field2754++;
        class274.method1602(14, class487.field7048);
        class87.field1421++;
        class17.field275.method1891(false, class515.method3047((byte) -89, arg1) + 1);
        class17.field275.method1879(32767, arg1);
        if (arg2 != -31569) {
            method1253(-29);
        }
        class17.field275.method1891(false, arg0);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
    public static final void method1255(Throwable arg0, String arg1, int arg2) {
        field2752++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class259.method1540(arg0, (byte) -125);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class312.method1803(-6591, var3);
            String var4 = class395.method2339(":", false, "%3a", var3);
            String var5 = class395.method2339("@", false, "%40", var4);
            String var6 = class395.method2339("&", false, "%26", var5);
            String var7 = class395.method2339("#", false, "%23", var6);
            if (class56.field820.field2623 != null) {
                if (arg2 > -11) {
                    method1253(-1);
                }
                class464 var8 = class56.field820.method1179(new URL(class56.field820.field2623.getCodeBase(), "clienterror.ws?c=" + class391.field5639 + "&u=" + class66.field957 + "&v1=" + class173.field2619 + "&v2=" + class173.field2620 + "&e=" + var7), -97);
                while (var8.field6699 == 0) {
                    class334.method2047(1L, 0);
                }
                if (var8.field6699 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field6695;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class187(String arg0, int arg1) {
        this.field2759 = arg1;
    }
}
