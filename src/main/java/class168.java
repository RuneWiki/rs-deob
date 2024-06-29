import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class168 {

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public int field2439 = 128;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    private int field2445 = 0;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public int field2440 = -1;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "Z")
    public boolean field2446 = true;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field2451 = 0;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "Lfc;")
    public static class174 field2443 = new class174(8);

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "Leh;")
    public static class246 field2453;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "F")
    public static float field2456;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public int field2438;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public int field2442;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public int field2447;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    public int field2452;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "[I")
    public static int[] field2454;

    static {
        new class530(" left the channel.", " hat den Chatraum verlassen.", " a quitté le canal.", " deixou o canal.");
        field2453 = new class246(63, 16);
        new class530("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIII)V", line = 4)
    public static final void method1054(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2450++;
        int var7 = class539.method3173(arg5, (byte) 88, class303.field4422, class353.field5062);
        int var8 = class539.method3173(arg4, (byte) 40, class303.field4422, class353.field5062);
        int var9 = class539.method3173(arg2, (byte) 34, class392.field5514, class518.field7624);
        int var10 = class539.method3173(arg1, (byte) 41, class392.field5514, class518.field7624);
        int var11 = class539.method3173(arg5 + arg6, (byte) 45, class303.field4422, class353.field5062);
        int var12 = class539.method3173(arg4 - arg6, (byte) 62, class303.field4422, class353.field5062);
        for (int var13 = var7; var13 < var11; var13++) {
            class447.method2605(-7, var9, arg3, var10, class112.field1523[var13]);
        }
        int var14 = 93 % ((arg0 - 8) / 58);
        for (int var15 = var8; var15 > var12; var15--) {
            class447.method2605(-7, var9, arg3, var10, class112.field1523[var15]);
        }
        int var16 = class539.method3173(arg2 + arg6, (byte) 100, class392.field5514, class518.field7624);
        int var17 = class539.method3173(arg1 - arg6, (byte) 113, class392.field5514, class518.field7624);
        for (int var18 = var11; var18 <= var12; var18++) {
            int[] var19 = class112.field1523[var18];
            class447.method2605(-7, var9, arg3, var16, var19);
            class447.method2605(-7, var17, arg3, var10, var19);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BILwm;)V", line = 59)
    private final void method1055(byte arg0, int arg1, class403 arg2) {
        if (arg0 != 75) {
            return;
        }
        if (arg1 == 1) {
            this.field2445 = arg2.method2323((byte) 97);
            this.method1057(-102, this.field2445);
        } else if (arg1 == 2) {
            this.field2440 = arg2.method2338(arg0 - 75);
            if (this.field2440 == 65535) {
                this.field2440 = -1;
            }
        } else if (arg1 == 3) {
            this.field2439 = arg2.method2338(0) << 0;
        } else if (arg1 == 4) {
            this.field2446 = false;
        }
        field2441++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 102)
    public static final Class method1056(String arg0, int arg1) throws ClassNotFoundException {
        field2449++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg1 == 65403) {
            return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V", line = 144)
    private final void method1057(int arg0, int arg1) {
        field2448++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF7B) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        if (arg0 > -96) {
            this.method1057(87, -96);
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        this.field2442 = (int) (var15 * 256.0D);
        this.field2438 = (int) (var17 * 256.0D);
        if (this.field2442 < 0) {
            this.field2442 = 0;
        } else if (this.field2442 > 255) {
            this.field2442 = 255;
        }
        if (this.field2438 < 0) {
            this.field2438 = 0;
        } else if (this.field2438 > 255) {
            this.field2438 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field2452 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field2452 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field2452 < 1) {
            this.field2452 = 1;
        }
        this.field2447 = (int) ((double) this.field2452 * var19);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V", line = 236)
    public static void method1058(int arg0) {
        field2443 = null;
        field2453 = null;
        field2454 = null;
        if (arg0 != 16) {
            field2443 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lwm;I)V", line = 249)
    public final void method1059(class403 arg0, int arg1) {
        if (arg1 >= -82) {
            this.method1055((byte) 73, 60, null);
        }
        field2444++;
        while (true) {
            int var3 = arg0.method2357((byte) 126);
            if (var3 == 0) {
                return;
            }
            this.method1055((byte) 75, var3, arg0);
        }
    }
}
