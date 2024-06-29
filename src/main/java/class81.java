import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class81 extends class190 {

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "[J")
    private long[] field1642 = new long[10];

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    private int field1636 = 0;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    private int field1631 = 1;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    private int field1635 = 256;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "J")
    private long field1634 = class155.method994(64);

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "Lrf;")
    public static class163 field1632 = class53.method392(85, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "Lrf;")
    public static class163 field1630 = class53.method392(98, "<col=ffff00>");

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "Lfc;")
    public static class54 field1641 = new class54(64);

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "Lfc;")
    public static class54 field1644 = new class54(100);

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "Lrf;")
    public static class163 field1646 = class53.method392(-128, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    private int field1637;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public static int field1638;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "Lkg;")
    public static class102 field1629;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "Lu;")
    public static class184 field1645;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)I")
    public final int method221(int arg0, int arg1, int arg2) {
        int var4 = this.field1635;
        field1638++;
        this.field1635 = 300;
        int var5 = this.field1631;
        this.field1631 = arg1;
        this.field1634 = class155.method994(73);
        if (this.field1642[this.field1637] == 0L) {
            this.field1635 = var4;
            this.field1631 = var5;
        } else if (this.field1642[this.field1637] < this.field1634) {
            this.field1635 = (int) ((long) (arg0 * 2560) / (this.field1634 - this.field1642[this.field1637]));
        }
        if (this.field1635 < 25) {
            this.field1635 = 25;
        }
        if (this.field1635 > 256) {
            this.field1635 = 256;
            this.field1631 = (int) ((long) arg0 - (this.field1634 - this.field1642[this.field1637]) / 10L);
        }
        if (this.field1631 > arg0) {
            this.field1631 = arg0;
        }
        this.field1642[this.field1637] = this.field1634;
        this.field1637 = (this.field1637 + 1) % 10;
        if (this.field1631 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field1642[var6] != 0L) {
                    this.field1642[var6] += this.field1631;
                }
            }
        }
        if (arg2 > this.field1631) {
            this.field1631 = arg2;
        }
        class25.method151((long) this.field1631, (byte) 0);
        int var7 = 0;
        while (this.field1636 < 256) {
            this.field1636 += this.field1635;
            var7++;
        }
        this.field1636 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
    public static void method547(int arg0) {
        field1644 = null;
        field1629 = null;
        field1630 = null;
        field1632 = null;
        field1641 = null;
        if (arg0 == 25) {
            field1646 = null;
            field1645 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public final void method222(int arg0) {
        field1633++;
        if (arg0 <= 106) {
            field1629 = null;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field1642[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
    public class81() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field1642[var1] = this.field1634;
        }
    }
}
