import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!a")
public class class1 extends class22 {

    @OriginalMember(owner = "mapview!a", name = "u", descriptor = "[J")
    private long[] field10 = new long[10];

    @OriginalMember(owner = "mapview!a", name = "o", descriptor = "I")
    public static int field4 = 0;

    @OriginalMember(owner = "mapview!a", name = "l", descriptor = "I")
    public static volatile int field1 = 0;

    @OriginalMember(owner = "mapview!a", name = "r", descriptor = "Lt;")
    public static class31 field7 = class14.method84(109, "Spice Shop");

    @OriginalMember(owner = "mapview!a", name = "q", descriptor = "Z")
    public static boolean field6 = false;

    @OriginalMember(owner = "mapview!a", name = "m", descriptor = "Lt;")
    public static class31 field2 = class14.method84(125, "sprites");

    @OriginalMember(owner = "mapview!a", name = "v", descriptor = "Lt;")
    public static class31 field11 = class14.method84(111, "Amulet Shop");

    @OriginalMember(owner = "mapview!a", name = "n", descriptor = "J")
    public static long field3 = 0L;

    @OriginalMember(owner = "mapview!a", name = "z", descriptor = "Lt;")
    public static class31 field15 = class14.method84(114, "Mining Shop");

    @OriginalMember(owner = "mapview!a", name = "A", descriptor = "Z")
    public static volatile boolean field16 = true;

    @OriginalMember(owner = "mapview!a", name = "B", descriptor = "Lfa;")
    public static class11 field17 = null;

    @OriginalMember(owner = "mapview!a", name = "w", descriptor = "I")
    private int field12;

    @OriginalMember(owner = "mapview!a", name = "x", descriptor = "I")
    private int field13;

    @OriginalMember(owner = "mapview!a", name = "y", descriptor = "I")
    private int field14;

    @OriginalMember(owner = "mapview!a", name = "s", descriptor = "I")
    private int field8;

    @OriginalMember(owner = "mapview!a", name = "p", descriptor = "J")
    private long field5;

    @OriginalMember(owner = "mapview!a", name = "t", descriptor = "J")
    public static long field9;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Z)V", line = 20)
    public final void method1(boolean arg0) {
        this.field12 = 0;
        this.field13 = 1;
        this.field14 = 256;
        this.field5 = System.currentTimeMillis();
        if (arg0) {
            field3 = 93L;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field10[var2] = this.field5;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "(Z)V", line = 50)
    public static void method2(boolean arg0) {
        field15 = null;
        field7 = null;
        field2 = null;
        field11 = null;
        if (!arg0) {
            method3(null, 68);
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 64)
    public static final void method3(Component arg0, int arg1) {
        arg0.addMouseListener(class6.field39);
        if (arg1 != 300) {
            field9 = -109L;
        }
        arg0.addMouseMotionListener(class6.field39);
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(III)I", line = 104)
    public final int method4(int arg0, int arg1, int arg2) {
        int var4 = this.field13;
        int var5 = this.field14;
        this.field13 = 1;
        this.field14 = 300;
        this.field5 = System.currentTimeMillis();
        if (this.field10[this.field8] == 0L) {
            this.field13 = var4;
            this.field14 = var5;
        } else if (this.field10[this.field8] < this.field5) {
            this.field14 = (int) ((long) (arg0 * 2560) / (this.field5 - this.field10[this.field8]));
        }
        if (this.field14 < 25) {
            this.field14 = 25;
        }
        if (this.field14 > 256) {
            this.field14 = 256;
            this.field13 = (int) ((long) arg0 - (this.field5 - this.field10[this.field8]) / 10L);
        }
        if (arg0 < this.field13) {
            this.field13 = arg0;
        }
        this.field10[this.field8] = this.field5;
        this.field8 = (this.field8 + 1) % 10;
        if (this.field13 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field10[var6] != 0L) {
                    this.field10[var6] += this.field13;
                }
            }
        }
        if (this.field13 < arg1) {
            this.field13 = arg1;
        }
        mapview.method145((long) this.field13, -63);
        if (arg2 > -59) {
            return -6;
        }
        int var7 = 0;
        while (this.field12 < 256) {
            this.field12 += this.field14;
            var7++;
        }
        this.field12 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "(I)[Lha;", line = 194)
    public static final class15[] method5(int arg0) {
        int var1 = 43 / ((arg0 - 11) / 53);
        class15[] var2 = new class15[class34.field367];
        for (int var3 = 0; var3 < class34.field367; var3++) {
            class15 var4 = var2[var3] = new class15();
            var4.field119 = class26.field303;
            var4.field120 = class34.field355;
            var4.field118 = class12.field92[var3];
            var4.field122 = class20.field182[var3];
            var4.field121 = class24.field208[var3];
            var4.field124 = class18.field159[var3];
            var4.field123 = class22.field194;
            var4.field125 = class33.field351[var3];
        }
        class14.method82(-27498);
        return var2;
    }

    @OriginalMember(owner = "mapview!a", name = "<init>", descriptor = "()V", line = 225)
    public class1() {
        this.method1(false);
    }
}
