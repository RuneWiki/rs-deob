import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class399 {

    @OriginalMember(owner = "client!dda", name = "l", descriptor = "Z")
    public boolean field5671 = false;

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "Z")
    public boolean field5665 = false;

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "I")
    public int field5667 = 1;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "I")
    public int field5660 = 64;

    @OriginalMember(owner = "client!dda", name = "p", descriptor = "I")
    public int field5675 = 2;

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "I")
    public int field5666 = 64;

    @OriginalMember(owner = "client!dda", name = "o", descriptor = "I")
    public int field5674 = -1;

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "Z")
    public static boolean field5662 = false;

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "Z")
    public static boolean field5669 = true;

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "[C")
    public static char[] field5661 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "Lga;")
    public static class420 field5668 = new class420();

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "D")
    public static double field5664;

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!dda", name = "m", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!dda", name = "n", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)V")
    public static final void method2422(int arg0) {
        field5673++;
        for (class455 var1 = (class455) class715.field10079.method2508((byte) -28); var1 != null; var1 = (class455) class715.field10079.method2505((byte) -55)) {
            class541.method3121(false, (byte) 39, var1);
        }
        if (arg0 == 226) {
            for (class455 var2 = (class455) class110.field1360.method2508((byte) 122); var2 != null; var2 = (class455) class110.field1360.method2505((byte) -55)) {
                class541.method3121(true, (byte) 39, var2);
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(II)V")
    public static final void method2423(int arg0, int arg1) {
        if (arg0 != 201) {
            method2424(21);
        }
        if (class544.field7651 == 1) {
            class322.field4756 = arg1;
        } else if (class544.field7651 == 2) {
            class661.field9289 = arg1;
        }
        field5663++;
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)V")
    public static void method2424(int arg0) {
        field5661 = null;
        if (arg0 == 3982) {
            field5668 = null;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Lrv;III)V")
    private final void method2425(class120 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 30460) {
            method2424(36);
        }
        if (arg3 == 1) {
            this.field5674 = arg0.method898((byte) -80);
            if (this.field5674 == 65535) {
                this.field5674 = -1;
            }
        } else if (arg3 == 2) {
            this.field5666 = arg0.method898((byte) -91) + 1;
            this.field5660 = arg0.method898((byte) -125) + 1;
        } else if (arg3 == 3) {
            arg0.method877(-252);
        } else if (arg3 == 4) {
            this.field5675 = arg0.method842(arg2 - 28076);
        } else if (arg3 == 5) {
            this.field5667 = arg0.method842(arg2 - 28076);
        } else if (arg3 == 6) {
            this.field5665 = true;
        } else if (arg3 == 7) {
            this.field5671 = true;
        }
        field5670++;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(BILrv;)V")
    public final void method2426(byte arg0, int arg1, class120 arg2) {
        while (true) {
            int var4 = arg2.method842(2384);
            if (var4 == 0) {
                if (arg0 != -24) {
                    method2423(-26, -32);
                }
                field5672++;
                return;
            }
            this.method2425(arg2, arg1, arg0 + 30484, var4);
        }
    }
}
