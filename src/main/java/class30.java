import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!p")
public class class30 extends class24 {

    @OriginalMember(owner = "mapview!p", name = "t", descriptor = "[J")
    private long[] field384 = new long[10];

    @OriginalMember(owner = "mapview!p", name = "p", descriptor = "Lba;")
    public static class4 field380 = class14.method105((byte) -99, "Farming shop");

    @OriginalMember(owner = "mapview!p", name = "m", descriptor = "Lba;")
    public static class4 field377 = class14.method105((byte) -128, "Chainmail Shop");

    @OriginalMember(owner = "mapview!p", name = "r", descriptor = "Lba;")
    public static class4 field382 = class14.method105((byte) -112, "Spinning Wheel");

    @OriginalMember(owner = "mapview!p", name = "j", descriptor = "Lba;")
    public static class4 field374 = class14.method105((byte) -65, "floorcol)3dat");

    @OriginalMember(owner = "mapview!p", name = "w", descriptor = "Lba;")
    public static class4 field387 = class14.method105((byte) -87, "Spice Shop");

    @OriginalMember(owner = "mapview!p", name = "u", descriptor = "Lba;")
    public static class4 field385 = class14.method105((byte) -117, "Potters Wheel");

    @OriginalMember(owner = "mapview!p", name = "x", descriptor = "Lba;")
    public static class4 field388 = class14.method105((byte) -114, "Requesting ");

    @OriginalMember(owner = "mapview!p", name = "k", descriptor = "I")
    private int field375;

    @OriginalMember(owner = "mapview!p", name = "l", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "mapview!p", name = "o", descriptor = "I")
    private int field379;

    @OriginalMember(owner = "mapview!p", name = "s", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "mapview!p", name = "v", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "mapview!p", name = "n", descriptor = "J")
    private long field378;

    @OriginalMember(owner = "mapview!p", name = "q", descriptor = "Lda;")
    public static class8 field381;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(I)V", line = 9)
    public final void method166(int arg0) {
        this.field386 = 1;
        this.field379 = arg0;
        this.field376 = 256;
        this.field378 = class35.method226(-44);
        for (int var2 = 0; var2 < 10; var2++) {
            this.field384[var2] = this.field378;
        }
    }

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "(I)V", line = 30)
    public static void method185(int arg0) {
        field377 = null;
        if (arg0 != -19666) {
            return;
        }
        field388 = null;
        field382 = null;
        field381 = null;
        field374 = null;
        field387 = null;
        field385 = null;
        field380 = null;
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 76)
    public static final void method186(Component arg0, int arg1) {
        arg0.removeKeyListener(class17.field212);
        arg0.removeFocusListener(class17.field212);
        if (arg1 > -28) {
            method186(null, 82);
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(III)B", line = 92)
    public static final byte method187(int arg0, int arg1, int arg2) {
        int var3 = arg0 >> 6;
        if (arg1 != 15956) {
            return 106;
        }
        int var4 = arg2 >> 6;
        if (class17.field215[var4][var3] == null) {
            return 0;
        } else if (class17.field215[var4][var3].field362 == null) {
            return class17.field215[var4][var3].field367;
        } else {
            return class17.field215[var4][var3].field362[(arg2 & 0xFC0) + arg0 & 0x3F];
        }
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(IBI)I", line = 117)
    public final int method168(int arg0, byte arg1, int arg2) {
        int var4 = this.field376;
        this.field376 = 300;
        int var5 = this.field386;
        this.field386 = 1;
        this.field378 = class35.method226(-93);
        if (this.field384[this.field375] == 0L) {
            this.field376 = var4;
            this.field386 = var5;
        } else if (this.field378 > this.field384[this.field375]) {
            this.field376 = (int) ((long) (arg2 * 2560) / (this.field378 - this.field384[this.field375]));
        }
        if (this.field376 < 25) {
            this.field376 = 25;
        }
        if (this.field376 > 256) {
            this.field376 = 256;
            this.field386 = (int) ((long) arg2 - (this.field378 - this.field384[this.field375]) / 10L);
        }
        if (this.field386 > arg2) {
            this.field386 = arg2;
        }
        this.field384[this.field375] = this.field378;
        this.field375 = (this.field375 + 1) % 10;
        if (this.field386 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field384[var6] != 0L) {
                    this.field384[var6] -= -((long) this.field386);
                }
            }
        }
        if (this.field386 < arg0) {
            this.field386 = arg0;
        }
        class35.method225((long) this.field386, -71);
        int var7 = 0;
        if (arg1 < 101) {
            method186(null, -114);
        }
        while (this.field379 < 256) {
            this.field379 += this.field376;
            var7++;
        }
        this.field379 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "mapview!p", name = "<init>", descriptor = "()V", line = 207)
    public class30() {
        this.method166(0);
    }
}
