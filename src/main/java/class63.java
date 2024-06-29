import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class63 {

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    private int field948 = 0;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    private int field944 = -1;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field940 = 0;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field941 = 0;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "Z")
    public static boolean field950 = false;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "[Lgl;")
    public static class228[] field952 = new class228[4];

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public int field937;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public int field939;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    public int field942;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public int field943;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "Lkb;")
    public static class54 field947;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
    public static void method408(boolean arg0) {
        field952 = null;
        field947 = null;
        if (!arg0) {
            field952 = null;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILma;)V")
    public final void method409(int arg0, int arg1, class202 arg2) {
        field945++;
        if (arg0 != -256) {
            this.method411(-49, -40, (class202) null, -39);
        }
        while (true) {
            int var4 = arg2.method1420((byte) 0);
            if (var4 == 0) {
                return;
            }
            this.method411(-121, var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLjava/lang/Object;Lgj;)V")
    public static final void method410(byte arg0, Object arg1, class255 arg2) {
        field938++;
        if (arg0 != 65) {
            field947 = null;
        }
        if (arg2.field4209 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field4209.peekEvent() != null; var3++) {
            class96.method614(arg0 ^ 0x41, 1L);
        }
        if (arg1 != null) {
            arg2.field4209.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IILma;I)V")
    private final void method411(int arg0, int arg1, class202 arg2, int arg3) {
        int var5 = -120 % ((arg0 - 4) / 60);
        field949++;
        if (arg1 == 1) {
            this.field948 = arg2.method1401((byte) -95);
            this.method412(this.field948, (byte) -106);
        } else if (arg1 == 2) {
            this.field944 = arg2.method1419(71);
            if (this.field944 != 65535) {
                return;
            }
            this.field944 = -1;
        } else if (arg1 == 3) {
            arg2.method1419(66);
            return;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IB)V")
    private final void method412(int arg0, byte arg1) {
        field951++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF47) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (var5 > var3) {
            var11 = var5;
        }
        if (arg1 > -88) {
            this.method409(-9, -51, (class202) null);
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        double var19 = var13 / 6.0D;
        this.field943 = (int) (var15 * 256.0D);
        this.field942 = (int) (var17 * 256.0D);
        if (this.field943 < 0) {
            this.field943 = 0;
        } else if (this.field943 > 255) {
            this.field943 = 255;
        }
        if (this.field942 < 0) {
            this.field942 = 0;
        } else if (this.field942 > 255) {
            this.field942 = 255;
        }
        if (var17 > 0.5D) {
            this.field937 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field937 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field937 < 1) {
            this.field937 = 1;
        }
        this.field939 = (int) ((double) this.field937 * var19);
    }
}
