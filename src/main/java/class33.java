import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ra")
public class class33 {

    @OriginalMember(owner = "mapview!ra", name = "m", descriptor = "[Lga;")
    private class12[] field434;

    @OriginalMember(owner = "mapview!ra", name = "i", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "mapview!ra", name = "c", descriptor = "Lna;")
    public static class26 field424 = class6.method40("overlay)3dat", 48);

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "Lna;")
    public static class26 field422 = class6.method40("Farming patch", 48);

    @OriginalMember(owner = "mapview!ra", name = "f", descriptor = "Lna;")
    public static class26 field427 = class6.method40("Prev page", 48);

    @OriginalMember(owner = "mapview!ra", name = "g", descriptor = "Lna;")
    public static class26 field428 = class6.method40("Staff Shop", 48);

    @OriginalMember(owner = "mapview!ra", name = "e", descriptor = "Lna;")
    public static class26 field426 = class6.method40("Crafting Shop", 48);

    @OriginalMember(owner = "mapview!ra", name = "k", descriptor = "I")
    public static int field432 = 0;

    @OriginalMember(owner = "mapview!ra", name = "h", descriptor = "J")
    public static volatile long field429 = 0L;

    @OriginalMember(owner = "mapview!ra", name = "n", descriptor = "[J")
    public static long[] field435 = new long[32];

    @OriginalMember(owner = "mapview!ra", name = "d", descriptor = "J")
    private long field425;

    @OriginalMember(owner = "mapview!ra", name = "l", descriptor = "J")
    public static long field433;

    @OriginalMember(owner = "mapview!ra", name = "b", descriptor = "Lga;")
    private class12 field423;

    @OriginalMember(owner = "mapview!ra", name = "j", descriptor = "[I")
    public static int[] field431;

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(I)B", line = 4)
    public static final byte method232(int arg0) {
        if (arg0 != -1) {
            method237(75);
        }
        return class8.field95 == null ? 0 : class8.field95[class20.field213];
    }

    @OriginalMember(owner = "mapview!ra", name = "b", descriptor = "(I)Lga;", line = 20)
    public final class12 method233(int arg0) {
        if (this.field423 == null) {
            return null;
        }
        class12 var2 = this.field434[(int) (this.field425 & (long) (this.field430 - 1))];
        while (this.field423 != var2) {
            if (this.field423.field148 == this.field425) {
                class12 var3 = this.field423;
                this.field423 = this.field423.field143;
                return var3;
            }
            this.field423 = this.field423.field143;
        }
        this.field423 = null;
        if (arg0 > -69) {
            this.method233(1);
        }
        return null;
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(JLga;I)V", line = 54)
    public final void method234(long arg0, class12 arg1, int arg2) {
        if (arg1.field145 != null) {
            arg1.method76(100);
        }
        if (arg2 != -19442) {
            method237(-105);
        }
        class12 var5 = this.field434[(int) ((long) (this.field430 - 1) & arg0)];
        arg1.field148 = arg0;
        arg1.field145 = var5.field145;
        arg1.field143 = var5;
        arg1.field145.field143 = arg1;
        arg1.field143.field145 = arg1;
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(IJ)Lga;", line = 92)
    public final class12 method235(int arg0, long arg1) {
        this.field425 = arg1;
        if (arg0 > -4) {
            return (class12) null;
        }
        class12 var4 = this.field434[(int) (arg1 & (long) (this.field430 - 1))];
        for (this.field423 = var4.field143; this.field423 != var4; this.field423 = this.field423.field143) {
            if (this.field423.field148 == arg1) {
                class12 var5 = this.field423;
                this.field423 = this.field423.field143;
                return var5;
            }
        }
        this.field423 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 120)
    public static final void method236(byte arg0, Component arg1) {
        if (arg0 != -104) {
            field427 = null;
        }
        arg1.removeMouseListener(class11.field132);
        arg1.removeMouseMotionListener(class11.field132);
        arg1.removeFocusListener(class11.field132);
    }

    @OriginalMember(owner = "mapview!ra", name = "c", descriptor = "(I)V", line = 192)
    public static void method237(int arg0) {
        field428 = null;
        field431 = null;
        field427 = null;
        field422 = null;
        if (arg0 != 0) {
            field431 = null;
        }
        field426 = null;
        field424 = null;
        field435 = null;
    }

    @OriginalMember(owner = "mapview!ra", name = "<init>", descriptor = "(I)V", line = 221)
    public class33(int arg0) {
        this.field434 = new class12[arg0];
        this.field430 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class12 var3 = this.field434[var2] = new class12();
            var3.field143 = var3;
            var3.field145 = var3;
        }
    }
}
