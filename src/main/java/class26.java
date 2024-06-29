import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class26 extends class106 {

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "[J")
    private long[] field477 = new long[10];

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    private int field471 = 0;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    private int field467 = 1;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    private int field465 = 256;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "J")
    private long field470 = class150.method1148(-85808345);

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    public static int field466 = -1;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "Lje;")
    public static class67 field475 = class85.method592(255, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "Z")
    public static boolean field474 = false;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "I")
    private int field478;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(JI)V")
    public static final void method174(long arg0, int arg1) {
        field473++;
        if (arg0 == 0L) {
            return;
        }
        if (arg1 != 0) {
            method176(89);
        }
        class98.field2195++;
        class69.field1399.method285(45, (byte) 64);
        class69.field1399.method656(79, arg0);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BII)I")
    public final int method175(byte arg0, int arg1, int arg2) {
        field469++;
        int var4 = this.field465;
        this.field465 = 300;
        int var5 = this.field467;
        this.field467 = 1;
        this.field470 = class150.method1148(-85808345);
        if (this.field477[this.field478] == 0L) {
            this.field465 = var4;
            this.field467 = var5;
        } else if (this.field477[this.field478] < this.field470) {
            this.field465 = (int) ((long) (arg1 * 2560) / (this.field470 - this.field477[this.field478]));
        }
        if (this.field465 < 25) {
            this.field465 = 25;
        }
        if (this.field465 > 256) {
            this.field465 = 256;
            this.field467 = (int) ((long) arg1 - (this.field470 - this.field477[this.field478]) / 10L);
        }
        if (arg1 < this.field467) {
            this.field467 = arg1;
        }
        this.field477[this.field478] = this.field470;
        this.field478 = (this.field478 + 1) % 10;
        if (this.field467 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field477[var6] != 0L) {
                    this.field477[var6] -= -((long) this.field467);
                }
            }
        }
        if (this.field467 < arg2) {
            this.field467 = arg2;
        }
        int var7 = 119 / ((arg0 + 27) / 52);
        int var8 = 0;
        class104.method822(-123, (long) this.field467);
        while (this.field471 < 256) {
            this.field471 += this.field465;
            var8++;
        }
        this.field471 &= 0xFF;
        return var8;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
    public static void method176(int arg0) {
        if (arg0 != 45) {
            field475 = null;
        }
        field475 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public final void method177(int arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            this.field477[var2] = 0L;
        }
        field476++;
        if (arg0 != 2) {
            method174(24L, 118);
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    public class26() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field477[var1] = this.field470;
        }
    }
}
