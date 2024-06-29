import java.awt.Font;
import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!fa")
public class class10 {

    @OriginalMember(owner = "mapview!fa", name = "k", descriptor = "I")
    public static int field89 = 1;

    @OriginalMember(owner = "mapview!fa", name = "e", descriptor = "Lia;")
    public static class15 field83 = class28.method196("Woodcutting stump", false);

    @OriginalMember(owner = "mapview!fa", name = "d", descriptor = "Lia;")
    public static class15 field82 = class28.method196("Dungeon", false);

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "I")
    public static int field81 = 0;

    @OriginalMember(owner = "mapview!fa", name = "l", descriptor = "Lia;")
    public static class15 field90 = class28.method196("Estate Agent", false);

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "Lia;")
    public static class15 field80 = class28.method196("Farming patch", false);

    @OriginalMember(owner = "mapview!fa", name = "g", descriptor = "I")
    public static int field85 = 0;

    @OriginalMember(owner = "mapview!fa", name = "n", descriptor = "I")
    public static int field92 = 0;

    @OriginalMember(owner = "mapview!fa", name = "f", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "mapview!fa", name = "h", descriptor = "J")
    public long field86;

    @OriginalMember(owner = "mapview!fa", name = "i", descriptor = "Lfa;")
    public class10 field87;

    @OriginalMember(owner = "mapview!fa", name = "j", descriptor = "Lfa;")
    public class10 field88;

    @OriginalMember(owner = "mapview!fa", name = "o", descriptor = "Lf;")
    public static class9 field93;

    @OriginalMember(owner = "mapview!fa", name = "m", descriptor = "Ljava/awt/Font;")
    public static Font field91;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "[I")
    public static int[] field79;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(B)V", line = 12)
    public static final void method51(byte arg0) {
        if (class14.field139.toLowerCase().indexOf("microsoft") == -1) {
            class31.field433[91] = 42;
            class31.field433[61] = 27;
            class31.field433[45] = 26;
            if (class14.field126 == null) {
                class31.field433[222] = 59;
                class31.field433[192] = 58;
            } else {
                class31.field433[192] = 28;
                class31.field433[520] = 59;
                class31.field433[222] = 58;
            }
            class31.field433[93] = 43;
            class31.field433[44] = 71;
            class31.field433[59] = 57;
            class31.field433[92] = 74;
            class31.field433[47] = 73;
            class31.field433[46] = 72;
        } else {
            class31.field433[191] = 73;
            class31.field433[222] = 59;
            class31.field433[187] = 27;
            class31.field433[186] = 57;
            class31.field433[221] = 43;
            class31.field433[220] = 74;
            class31.field433[219] = 42;
            class31.field433[192] = 58;
            class31.field433[189] = 26;
            class31.field433[190] = 72;
            class31.field433[188] = 71;
            class31.field433[223] = 28;
        }
        int var1 = -39 / ((arg0 + 36) / 52);
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(IJ)V", line = 61)
    public static final void method52(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
            if (arg0 >= -121) {
                method55(-65);
            }
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(I)V", line = 73)
    public final void method53(int arg0) {
        if (this.field87 == null) {
            return;
        }
        this.field87.field88 = this.field88;
        this.field88.field87 = this.field87;
        this.field87 = null;
        this.field88 = null;
        if (arg0 != 190) {
            this.method53(-15);
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 103)
    public static final int method54(KeyEvent arg0, int arg1) {
        if (arg1 != 45) {
            return -90;
        }
        int var2 = arg0.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "b", descriptor = "(I)V", line = 132)
    public static void method55(int arg0) {
        field83 = null;
        field80 = null;
        field82 = null;
        field93 = null;
        field90 = null;
        if (arg0 != 0) {
            method52(-90, -3L);
        }
        field79 = null;
        field91 = null;
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "([BII)I", line = 161)
    public static final int method56(byte[] arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field90 = null;
        }
        return class35.method239((byte) 61, 0, arg2, arg0);
    }

    @OriginalMember(owner = "mapview!fa", name = "c", descriptor = "(I)B", line = 186)
    public static final byte method57(int arg0) {
        if (arg0 != -5265) {
            field84 = -103;
        }
        return mapview.field259 == null ? 0 : mapview.field259[class13.field111];
    }
}
