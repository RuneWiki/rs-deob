import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ra")
public class class34 extends class27 {

    @OriginalMember(owner = "mapview!ra", name = "j", descriptor = "[J")
    private long[] field484 = new long[10];

    @OriginalMember(owner = "mapview!ra", name = "r", descriptor = "I")
    private int field492 = 256;

    @OriginalMember(owner = "mapview!ra", name = "s", descriptor = "I")
    private int field493 = 1;

    @OriginalMember(owner = "mapview!ra", name = "h", descriptor = "I")
    private int field482 = 0;

    @OriginalMember(owner = "mapview!ra", name = "k", descriptor = "J")
    private long field485 = class10.method50(false);

    @OriginalMember(owner = "mapview!ra", name = "i", descriptor = "Lna;")
    public static class26 field483 = class33.method219("details)3dat", 103);

    @OriginalMember(owner = "mapview!ra", name = "p", descriptor = "Lna;")
    public static class26 field490 = class33.method219("Cooking Range", 113);

    @OriginalMember(owner = "mapview!ra", name = "o", descriptor = "Lna;")
    public static class26 field489 = class33.method219("Helmet Shop", 114);

    @OriginalMember(owner = "mapview!ra", name = "l", descriptor = "I")
    public static int field486 = -1;

    @OriginalMember(owner = "mapview!ra", name = "t", descriptor = "Lna;")
    public static class26 field494 = class33.method219("Saw Mill", 79);

    @OriginalMember(owner = "mapview!ra", name = "n", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "mapview!ra", name = "m", descriptor = "Lna;")
    public static class26 field487;

    @OriginalMember(owner = "mapview!ra", name = "q", descriptor = "[B")
    public static byte[] field491;

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(I)V", line = 5)
    public static void method224(int arg0) {
        field483 = null;
        field494 = null;
        field487 = null;
        if (arg0 != 1) {
            method225(null, 100);
        }
        field489 = null;
        field491 = null;
        field490 = null;
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(III)I", line = 26)
    public final int method193(int arg0, int arg1, int arg2) {
        int var4 = this.field492;
        this.field492 = 300;
        int var5 = this.field493;
        this.field493 = 1;
        this.field485 = class10.method50(false);
        if (this.field484[this.field488] == 0L) {
            this.field493 = var5;
            this.field492 = var4;
        } else if (this.field484[this.field488] < this.field485) {
            this.field492 = (int) ((long) (arg2 * 2560) / (this.field485 - this.field484[this.field488]));
        }
        if (this.field492 < 25) {
            this.field492 = 25;
        }
        if (this.field492 > 256) {
            this.field492 = 256;
            this.field493 = (int) ((long) arg2 - (this.field485 - this.field484[this.field488]) / 10L);
        }
        if (arg2 < this.field493) {
            this.field493 = arg2;
        }
        this.field484[this.field488] = this.field485;
        this.field488 = (this.field488 + 1) % 10;
        if (this.field493 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field484[var6] != 0L) {
                    this.field484[var6] += this.field493;
                }
            }
        }
        if (arg1 > this.field493) {
            this.field493 = arg1;
        }
        method228((long) this.field493, true);
        int var7 = arg0;
        while (this.field482 < 256) {
            var7++;
            this.field482 += this.field492;
        }
        this.field482 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 97)
    public static final void method225(Component arg0, int arg1) {
        arg0.removeKeyListener(class10.field95);
        arg0.removeFocusListener(class10.field95);
        class15.field155 = arg1;
    }

    @OriginalMember(owner = "mapview!ra", name = "b", descriptor = "(B)V", line = 111)
    public static final void method226(byte arg0) {
        if (class38.field506[0][class5.field53][class8.field77] == null) {
            class25.field383 = null;
        } else {
            class25.field383 = class38.field506[0][class5.field53][class8.field77];
        }
        if (class38.field506[1][class5.field53][class8.field77] == null) {
            field491 = null;
        } else {
            field491 = class38.field506[1][class5.field53][class8.field77];
        }
        if (class38.field506[2][class5.field53][class8.field77] == null) {
            class2.field22 = null;
        } else {
            class2.field22 = class38.field506[2][class5.field53][class8.field77];
        }
        if (arg0 != -76) {
            field491 = null;
        }
        if (class38.field506[3][class5.field53][class8.field77] == null) {
            class11.field107 = null;
        } else {
            class11.field107 = class38.field506[3][class5.field53][class8.field77];
        }
        if (class38.field506[4][class5.field53][class8.field77] == null) {
            class40.field533 = null;
        } else {
            class40.field533 = class38.field506[4][class5.field53][class8.field77];
        }
        if (class25.field388[class5.field53][class8.field77] == null) {
            class26.field407 = null;
        } else {
            class26.field407 = class25.field388[class5.field53][class8.field77];
        }
        if (class8.field79[class5.field53][class8.field77] == null) {
            class23.field245 = null;
        } else {
            class23.field245 = class8.field79[class5.field53][class8.field77];
        }
        if (class23.field246[class5.field53][class8.field77] == null) {
            mapview.field349 = null;
        } else {
            mapview.field349 = class23.field246[class5.field53][class8.field77];
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(IIBII)V", line = 182)
    public static final void method227(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        int var5 = arg0 >> 6;
        int var6 = arg3 >> 6;
        if (class38.field506[arg4][var6][var5] == null) {
            class38.field506[arg4][var6][var5] = new byte[4096];
        }
        if (arg1 != 192057510) {
            field494 = null;
        }
        class38.field506[arg4][var6][var5][class22.method119(63, arg0) + class22.method119(arg3 << 6, 4032)] = arg2;
    }

    @OriginalMember(owner = "mapview!ra", name = "<init>", descriptor = "()V", line = 239)
    public class34() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field484[var1] = this.field485;
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(JZ)V", line = 220)
    public static final void method228(long arg0, boolean arg1) {
        if (arg0 <= 0L || !arg1) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class21.method117((byte) -98, arg0 - 1L);
            class21.method117((byte) -64, 1L);
        } else {
            class21.method117((byte) -52, arg0);
        }
    }
}
