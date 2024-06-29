import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class29 extends class289 {

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "[J")
    private long[] field625 = new long[10];

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "I")
    private int field610 = 256;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    private int field627 = 0;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "I")
    private int field621 = 1;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "J")
    private long field615 = class69.method535(true);

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "Lqd;")
    public static class40 field616 = class147.method1106("hint_mapmarkers", (byte) -113);

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "Lqd;")
    public static class40 field614 = class147.method1106(" weitere Optionen", (byte) -124);

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "Lqd;")
    private static class40 field611 = class147.method1106("Loading sprites )2 ", (byte) -119);

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "Lqd;")
    public static class40 field620 = field611;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public static int field622 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    private int field629;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "Lce;")
    public static class239 field624;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "Lwd;")
    public static class75 field626;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "[I")
    public static int[] field618;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "[I")
    public static int[] field628;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BI)Lqd;", line = 10)
    public static final class40 method274(byte arg0, int arg1) {
        field612++;
        class40 var2 = new class40();
        if (arg0 != -118) {
            method276(52);
        }
        var2.field745 = new byte[arg1];
        var2.field766 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)I", line = 30)
    public final int method275(int arg0, int arg1, int arg2) {
        field619++;
        int var4 = this.field610;
        this.field610 = 300;
        int var5 = this.field621;
        this.field621 = 1;
        this.field615 = class69.method535(true);
        if (this.field625[this.field629] == 0L) {
            this.field621 = var5;
            this.field610 = var4;
        } else if (this.field615 > this.field625[this.field629]) {
            this.field610 = (int) ((long) (arg1 * 2560) / (this.field615 - this.field625[this.field629]));
        }
        if (this.field610 < 25) {
            this.field610 = 25;
        }
        if (this.field610 > 256) {
            this.field610 = 256;
            this.field621 = (int) ((long) arg1 - ((this.field615 - this.field625[this.field629]) / 10L));
        }
        if (arg1 < this.field621) {
            this.field621 = arg1;
        }
        int var6 = -47 / ((arg2 - 15) / 58);
        this.field625[this.field629] = this.field615;
        this.field629 = (this.field629 + 1) % 10;
        if (this.field621 > 1) {
            for (int var7 = 0; var7 < 10; var7++) {
                if (this.field625[var7] != 0L) {
                    this.field625[var7] -= -((long) this.field621);
                }
            }
        }
        if (this.field621 < arg0) {
            this.field621 = arg0;
        }
        class160.method1227((long) this.field621, false);
        int var8 = 0;
        while (this.field627 < 256) {
            this.field627 += this.field610;
            var8++;
        }
        this.field627 &= 0xFF;
        return var8;
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V", line = 119)
    public static void method276(int arg0) {
        field620 = null;
        field628 = null;
        field626 = null;
        field611 = null;
        field618 = null;
        field614 = null;
        if (arg0 == -11) {
            field624 = null;
            field616 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V", line = 140)
    public final void method277(int arg0) {
        int var2 = 0;
        if (arg0 != 100) {
            return;
        }
        while (var2 < 10) {
            this.field625[var2] = 0L;
            var2++;
        }
        field617++;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V", line = 183)
    public class29() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field625[var1] = this.field615;
        }
    }
}
