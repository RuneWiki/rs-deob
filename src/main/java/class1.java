import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!a")
public class class1 extends class10 {

    @OriginalMember(owner = "mapview!a", name = "l", descriptor = "[J")
    private long[] field7 = new long[10];

    @OriginalMember(owner = "mapview!a", name = "h", descriptor = "I")
    private int field3 = 256;

    @OriginalMember(owner = "mapview!a", name = "o", descriptor = "I")
    private int field10 = 1;

    @OriginalMember(owner = "mapview!a", name = "j", descriptor = "I")
    private int field5 = 0;

    @OriginalMember(owner = "mapview!a", name = "f", descriptor = "J")
    private long field1 = class18.method106(-1);

    @OriginalMember(owner = "mapview!a", name = "g", descriptor = "Lu;")
    public static class38 field2 = class28.method177("37(U", (byte) -84);

    @OriginalMember(owner = "mapview!a", name = "n", descriptor = "Lu;")
    public static class38 field9 = class28.method177("Silver Shop", (byte) -84);

    @OriginalMember(owner = "mapview!a", name = "q", descriptor = "Lu;")
    public static class38 field12 = class28.method177("world", (byte) -84);

    @OriginalMember(owner = "mapview!a", name = "p", descriptor = "Lu;")
    public static class38 field11 = class28.method177("Potters Wheel", (byte) -84);

    @OriginalMember(owner = "mapview!a", name = "m", descriptor = "I")
    private int field8;

    @OriginalMember(owner = "mapview!a", name = "k", descriptor = "Lpa;")
    public static class32 field6;

    @OriginalMember(owner = "mapview!a", name = "i", descriptor = "[Lca;")
    public static class6[] field4;

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(II)I", line = 18)
    public static final int method1(int arg0, int arg1) {
        if (arg0 > -98) {
            return 32;
        } else {
            if (arg1 >= 65 && arg1 <= 90) {
                arg1 += 32;
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(III)I", line = 41)
    public final int method2(int arg0, int arg1, int arg2) {
        int var4 = this.field3;
        int var5 = this.field10;
        this.field10 = 1;
        this.field3 = 300;
        this.field1 = class18.method106(-1);
        if (this.field7[this.field8] == 0L) {
            this.field3 = var4;
            this.field10 = var5;
        } else if (this.field7[this.field8] < this.field1) {
            this.field3 = (int) ((long) (arg2 * 2560) / (this.field1 - this.field7[this.field8]));
        }
        if (this.field3 < 25) {
            this.field3 = 25;
        }
        if (this.field3 > 256) {
            this.field3 = 256;
            this.field10 = (int) ((long) arg2 - (this.field1 - this.field7[this.field8]) / 10L);
        }
        if (this.field10 > arg2) {
            this.field10 = arg2;
        }
        this.field7[this.field8] = this.field1;
        this.field8 = (this.field8 + 1) % 10;
        if (this.field10 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field7[var6] != 0L) {
                    this.field7[var6] -= -((long) this.field10);
                }
            }
        }
        if (this.field10 < arg0) {
            this.field10 = arg0;
        }
        if (arg1 != -11235) {
            return -50;
        }
        class11.method53(0, (long) this.field10);
        int var7 = 0;
        while (this.field5 < 256) {
            this.field5 += this.field3;
            var7++;
        }
        this.field5 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "mapview!a", name = "b", descriptor = "(B)V", line = 124)
    public static void method3(byte arg0) {
        field2 = null;
        field12 = null;
        field6 = null;
        if (arg0 != 46) {
            method4(-9, null);
        }
        field11 = null;
        field4 = null;
        field9 = null;
    }

    @OriginalMember(owner = "mapview!a", name = "a", descriptor = "(I[B)Lk;", line = 145)
    public static final class21 method4(int arg0, byte[] arg1) {
        if (arg0 != -26802) {
            method4(25, null);
        }
        if (arg1 == null) {
            return null;
        } else {
            class21 var2 = new class21(arg1, class17.field171, class18.field175, mapview.field339, class38.field485, class7.field62, class16.field159);
            class24.method133((byte) -76);
            return var2;
        }
    }

    @OriginalMember(owner = "mapview!a", name = "<init>", descriptor = "()V", line = 176)
    public class1() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field7[var1] = this.field1;
        }
    }
}
