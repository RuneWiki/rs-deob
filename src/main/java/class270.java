import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class270 extends class118 {

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "[J")
    private long[] field4640 = new long[10];

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    private int field4635 = 1;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    private int field4634 = 256;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    private int field4647 = 0;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "J")
    private long field4644 = class153.method1032(122);

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Ljf;")
    public static class229 field4627 = class212.method1457((byte) 109, "Textures charg-Bes");

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public static int field4630 = -1;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "Ljf;")
    public static class229 field4628 = class212.method1457((byte) 110, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public static int field4632 = 0;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "Ljf;")
    public static class229 field4633 = class212.method1457((byte) 108, "mapscene");

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public static int field4637 = 2;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "Ljf;")
    public static class229 field4643 = class212.method1457((byte) 73, "l");

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
    private int field4629;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    public static int field4642;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field4645;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "[I")
    public static int[] field4631;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "[[B")
    public static byte[][] field4638;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "[[[I")
    public static int[][][] field4639;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)Ljf;", line = 5)
    public static final class229 method1904(int arg0, int arg1) {
        if (arg0 < 122) {
            field4638 = (byte[][]) ((byte[][]) null);
        }
        field4645++;
        return class142.method989(new class229[] { class84.method607(-87, arg1 >> 24 & 0xFF), class306.field5170, class84.method607(-63, (arg1 & 0xFF14B1) >> 16), class306.field5170, class84.method607(121, (arg1 & 0xFFD9) >> 8), class306.field5170, class84.method607(-128, arg1 & 0xFF) }, -16);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBI)V", line = 18)
    public static final void method1905(int arg0, byte arg1, int arg2) {
        field4642++;
        class10 var3 = class205.method1427(5000, arg2);
        if (arg1 > -33) {
            return;
        }
        int var4 = var3.field123;
        int var5 = var3.field114;
        int var6 = var3.field127;
        int var7 = client.field4464[var6 - var5];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class249.method1797(128, ~var8 & class286.field4908[var4] | var8 & arg0 << var5, var4);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V", line = 46)
    public final void method609(boolean arg0) {
        field4646++;
        for (int var2 = 0; var2 < 10; var2++) {
            this.field4640[var2] = 0L;
        }
        if (arg0) {
            field4627 = (class229) null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljf;B)V", line = 71)
    public static final void method1906(class229 arg0, byte arg1) {
        field4636++;
        if (arg1 != -119) {
            return;
        }
        for (class161 var2 = (class161) class157.field2687.method2078(-115); var2 != null; var2 = (class161) class157.field2687.method2080(5)) {
            if (var2.field2723.method1641((byte) -64, arg0)) {
                class264.field4555 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZILek;Lek;)V", line = 111)
    public static final void method1907(boolean arg0, int arg1, class185 arg2, class185 arg3) {
        field4641++;
        if (arg1 != 1776690424) {
            method1906((class229) null, (byte) -78);
        }
        class307.field5191 = arg0;
        class57.field1016 = arg2;
        class160.field2710 = arg3;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V", line = 237)
    public class270() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field4640[var1] = this.field4644;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)I", line = 160)
    public final int method610(int arg0, int arg1, int arg2) {
        int var4 = this.field4634;
        this.field4634 = 300;
        field4648++;
        int var5 = this.field4635;
        this.field4635 = 1;
        this.field4644 = class153.method1032(103);
        if (this.field4640[this.field4629] == 0L) {
            this.field4634 = var4;
            this.field4635 = var5;
        } else if (this.field4640[this.field4629] < this.field4644) {
            this.field4634 = (int) ((long) (arg0 * 2560) / (this.field4644 - this.field4640[this.field4629]));
        }
        if (this.field4634 < 25) {
            this.field4634 = 25;
        }
        if (this.field4634 > 256) {
            this.field4634 = 256;
            this.field4635 = (int) ((long) arg0 - ((this.field4644 - this.field4640[this.field4629]) / 10L));
        }
        if (this.field4635 > arg0) {
            this.field4635 = arg0;
        }
        this.field4640[this.field4629] = this.field4644;
        this.field4629 = (this.field4629 + 1) % 10;
        if (this.field4635 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field4640[var6] != 0L) {
                    this.field4640[var6] += (long) this.field4635;
                }
            }
        }
        if (arg1 > this.field4635) {
            this.field4635 = arg1;
        }
        class235.method1675((byte) -22, (long) this.field4635);
        int var7 = 0;
        if (arg2 <= 13) {
            method1905(-89, (byte) 80, 11);
        }
        while (this.field4647 < 256) {
            var7++;
            this.field4647 += this.field4634;
        }
        this.field4647 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V", line = 258)
    public static void method1908(int arg0) {
        field4627 = null;
        if (arg0 != 0) {
            field4630 = 111;
        }
        field4639 = (int[][][]) null;
        field4628 = null;
        field4633 = null;
        field4631 = null;
        field4643 = null;
        field4638 = (byte[][]) null;
    }
}
