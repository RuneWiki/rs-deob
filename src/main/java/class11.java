import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!g")
public class class11 extends class26 {

    @OriginalMember(owner = "mapview!g", name = "q", descriptor = "[J")
    private long[] field89 = new long[10];

    @OriginalMember(owner = "mapview!g", name = "h", descriptor = "Ll;")
    public static class21 field80 = class28.method185(-20839, "Amulet Shop");

    @OriginalMember(owner = "mapview!g", name = "o", descriptor = "Ll;")
    public static class21 field87 = class28.method185(-20839, "Please wait)3)3)3 Rendering Map");

    @OriginalMember(owner = "mapview!g", name = "l", descriptor = "Ll;")
    public static class21 field84 = class28.method185(-20839, "Axe Shop");

    @OriginalMember(owner = "mapview!g", name = "n", descriptor = "Ll;")
    public static class21 field86 = class28.method185(-20839, "labels)3dat");

    @OriginalMember(owner = "mapview!g", name = "i", descriptor = "I")
    private int field81;

    @OriginalMember(owner = "mapview!g", name = "j", descriptor = "I")
    private int field82;

    @OriginalMember(owner = "mapview!g", name = "k", descriptor = "I")
    private int field83;

    @OriginalMember(owner = "mapview!g", name = "p", descriptor = "I")
    private int field88;

    @OriginalMember(owner = "mapview!g", name = "r", descriptor = "J")
    private long field90;

    @OriginalMember(owner = "mapview!g", name = "m", descriptor = "Lo;")
    public static class26 field85;

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(III)I", line = 6)
    public final int method30(int arg0, int arg1, int arg2) {
        int var4 = this.field83;
        int var5 = this.field82;
        this.field82 = 1;
        if (arg1 != -3566) {
            return 7;
        }
        this.field83 = 300;
        this.field90 = System.currentTimeMillis();
        if (this.field89[this.field88] == 0L) {
            this.field83 = var4;
            this.field82 = var5;
        } else if (this.field90 > this.field89[this.field88]) {
            this.field83 = (int) ((long) (arg2 * 2560) / (this.field90 - this.field89[this.field88]));
        }
        if (this.field83 < 25) {
            this.field83 = 25;
        }
        if (this.field83 > 256) {
            this.field83 = 256;
            this.field82 = (int) ((long) arg2 - (this.field90 - this.field89[this.field88]) / 10L);
        }
        if (this.field82 > arg2) {
            this.field82 = arg2;
        }
        this.field89[this.field88] = this.field90;
        this.field88 = (this.field88 + 1) % 10;
        if (this.field82 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field89[var6] != 0L) {
                    this.field89[var6] -= -((long) this.field82);
                }
            }
        }
        if (arg0 > this.field82) {
            this.field82 = arg0;
        }
        int var7 = 0;
        class2.method4((long) this.field82, -114);
        while (this.field81 < 256) {
            var7++;
            this.field81 += this.field83;
        }
        this.field81 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(Z)Lga;", line = 104)
    public static final class12 method31(boolean arg0) {
        if (arg0) {
            class12 var1 = new class12(class29.field344, class2.field12, class18.field161, class34.field389, class31.field359);
            class29.method188(true);
            return var1;
        } else {
            return (class12) null;
        }
    }

    @OriginalMember(owner = "mapview!g", name = "a", descriptor = "(I)V", line = 137)
    public final void method32(int arg0) {
        this.field83 = 256;
        this.field82 = 1;
        this.field81 = 0;
        this.field90 = System.currentTimeMillis();
        for (int var2 = 0; var2 < 10; var2++) {
            this.field89[var2] = this.field90;
        }
        if (arg0 < 59) {
            field87 = null;
        }
    }

    @OriginalMember(owner = "mapview!g", name = "c", descriptor = "(I)V", line = 176)
    public static void method33(int arg0) {
        field86 = null;
        field85 = null;
        field87 = null;
        field80 = null;
        field84 = null;
        if (arg0 != 256) {
            field80 = null;
        }
    }

    @OriginalMember(owner = "mapview!g", name = "<init>", descriptor = "()V", line = 194)
    public class11() {
        this.method32(87);
    }
}
