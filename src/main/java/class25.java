import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class25 extends class121 {

    @OriginalMember(owner = "client!d", name = "bb", descriptor = "Z")
    public boolean field579 = true;

    @OriginalMember(owner = "client!d", name = "R", descriptor = "I")
    public int field570 = -1;

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
    public int field577 = -1;

    @OriginalMember(owner = "client!d", name = "S", descriptor = "I")
    public int field571 = 0;

    @OriginalMember(owner = "client!d", name = "W", descriptor = "I")
    public static int field574 = -1;

    @OriginalMember(owner = "client!d", name = "ab", descriptor = "I")
    public static int field578 = 0;

    @OriginalMember(owner = "client!d", name = "fb", descriptor = "I")
    public static int field583 = 0;

    @OriginalMember(owner = "client!d", name = "hb", descriptor = "Loc;")
    public static class99 field585 = class48.method402((byte) -104, "sl_button");

    @OriginalMember(owner = "client!d", name = "X", descriptor = "Loc;")
    private static class99 field575 = class48.method402((byte) -104, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!d", name = "mb", descriptor = "Loc;")
    public static class99 field590 = class48.method402((byte) -104, "weiss:");

    @OriginalMember(owner = "client!d", name = "ib", descriptor = "Loc;")
    public static class99 field586 = field575;

    @OriginalMember(owner = "client!d", name = "qb", descriptor = "[Laf;")
    public static class7[] field594 = new class7[16];

    @OriginalMember(owner = "client!d", name = "pb", descriptor = "Loc;")
    private static class99 field593 = class48.method402((byte) -104, "Unable to find ");

    @OriginalMember(owner = "client!d", name = "db", descriptor = "Loc;")
    public static class99 field581 = field593;

    @OriginalMember(owner = "client!d", name = "T", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "I")
    public int field573;

    @OriginalMember(owner = "client!d", name = "Y", descriptor = "I")
    public int field576;

    @OriginalMember(owner = "client!d", name = "cb", descriptor = "I")
    public int field580;

    @OriginalMember(owner = "client!d", name = "eb", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!d", name = "gb", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!d", name = "jb", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!d", name = "kb", descriptor = "I")
    public int field588;

    @OriginalMember(owner = "client!d", name = "lb", descriptor = "I")
    public int field589;

    @OriginalMember(owner = "client!d", name = "nb", descriptor = "I")
    public int field591;

    @OriginalMember(owner = "client!d", name = "ob", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!d", name = "rb", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IB)V")
    private final void method220(int arg0, byte arg1) {
        double var3 = (double) (arg0 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        field587++;
        double var9 = var7;
        double var11 = 0.0D;
        double var13 = var7;
        double var15 = 0.0D;
        if (var5 < var7) {
            var13 = var5;
        }
        if (var7 < var5) {
            var9 = var5;
        }
        if (arg1 <= 40) {
            field578 = 108;
        }
        if (var9 < var3) {
            var9 = var3;
        }
        if (var13 > var3) {
            var13 = var3;
        }
        double var17 = (var9 + var13) / 2.0D;
        this.field580 = (int) (var17 * 256.0D);
        if (this.field580 < 0) {
            this.field580 = 0;
        } else if (this.field580 > 255) {
            this.field580 = 255;
        }
        if (var9 != var13) {
            if (var7 == var9) {
                var11 = (var5 - var3) / (var9 - var13);
            } else if (var5 == var9) {
                var11 = (var3 - var7) / (var9 - var13) + 2.0D;
            } else if (var3 == var9) {
                var11 = (var7 - var5) / (-var13 + var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var9 - var13) / (var9 + var13);
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var13) / (2.0D - var9 - var13);
            }
        }
        double var19 = var11 / 6.0D;
        this.field591 = (int) (var15 * 256.0D);
        this.field573 = (int) (var19 * 256.0D);
        if (this.field591 < 0) {
            this.field591 = 0;
        } else if (this.field591 > 255) {
            this.field591 = 255;
            return;
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
    public final void method221(int arg0) {
        if (this.field570 != arg0) {
            this.method220(this.field570, (byte) 80);
            this.field589 = this.field591;
            this.field576 = this.field580;
            this.field588 = this.field573;
        }
        this.method220(this.field571, (byte) 76);
        field592++;
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(B)V")
    public static final void method222(byte arg0) {
        field572++;
        if (arg0 < 84) {
            field585 = null;
        }
        for (int var1 = -1; var1 < class101.field2446; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class67.field1729[var1];
            }
            class126 var3 = class59.field1571[var2];
            if (var3 != null) {
                class107.method916(1, (byte) 14, var3);
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILib;I)V")
    public final void method223(int arg0, class57 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method510(-114);
            if (var4 == 0) {
                if (arg0 != 0) {
                    field581 = null;
                }
                field595++;
                return;
            }
            this.method225(var4, arg2, arg1, true);
        }
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V")
    public static void method224(int arg0) {
        field581 = null;
        field585 = null;
        field594 = null;
        field590 = null;
        field593 = null;
        field586 = null;
        if (arg0 != 256) {
            method226((byte) -111);
        }
        field575 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILib;Z)V")
    private final void method225(int arg0, int arg1, class57 arg2, boolean arg3) {
        if (!arg3) {
            return;
        }
        field582++;
        if (arg0 == 1) {
            this.field571 = arg2.method483(false);
        } else if (arg0 == 2) {
            this.field577 = arg2.method510(-123);
            return;
        } else if (arg0 == 5) {
            this.field579 = false;
            return;
        } else if (arg0 == 7) {
            this.field570 = arg2.method483(false);
            return;
        }
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(B)V")
    public static final void method226(byte arg0) {
        field584++;
        if (arg0 <= 50) {
            method226((byte) 72);
        }
        while (true) {
            class83 var1 = class21.field510;
            class132 var2;
            synchronized (class21.field510) {
                var2 = (class132) class52.field1250.method725(14538);
            }
            if (var2 == null) {
                return;
            }
            var2.field3216.method300(var2.field3219, var2.field3212, (byte) 0, (int) var2.field1138, false);
        }
    }
}
