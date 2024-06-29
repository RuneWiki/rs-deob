import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class18 extends class626 implements class602 {

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field237 = 2;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "Lpu;")
    public static class559 field235 = new class559(8, 2);

    @OriginalMember(owner = "client!l", name = "i", descriptor = "C")
    public char field228;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public int field229;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public int field234;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public int field240;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "J")
    public long field227;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "Lgba;")
    public static class664 field241;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)V", line = 5)
    public static final void method108(int arg0, int arg1, int arg2) {
        field238++;
        if (arg2 == 8643) {
            class354 var3 = class501.method3012(arg1, 13, 2145997216);
            var3.method2222(-25);
            var3.field4990 = arg0;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)I", line = 20)
    public final int method109(byte arg0) {
        int var2 = -53 / ((-arg0 - 71) / 52);
        field232++;
        return this.field229;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)C", line = 36)
    public final char method110(int arg0) {
        field231++;
        if (arg0 != 29932) {
            this.field228 = '\u001F';
        }
        return this.field228;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)J", line = 53)
    public final long method111(int arg0) {
        int var2 = 92 % ((70 - arg0) / 40);
        field230++;
        return this.field227;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)I", line = 64)
    public final int method112(byte arg0) {
        if (arg0 > -73) {
            return -12;
        } else {
            field236++;
            return this.field240;
        }
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "(I)V", line = 83)
    public static void method113(int arg0) {
        if (arg0 == 13) {
            field235 = null;
            field241 = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)I", line = 97)
    public final int method114(int arg0) {
        field233++;
        if (arg0 != 10721) {
            this.field234 = 32;
        }
        return this.field234;
    }
}
