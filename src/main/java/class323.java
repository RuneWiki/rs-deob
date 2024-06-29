import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public abstract class class323 implements class355 {

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "Lau;")
    public class690 field4027;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Lpfa;")
    public class275 field4024;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "Lpfa;")
    private class275 field4018;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Luc;")
    public static class27 field4025 = new class27(4, 19);

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "Llt;")
    public static class632 field4028 = class216.method1253((byte) -69);

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field4030 = 1338;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    private int field4026;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "J")
    private long field4023;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Lta;")
    private class201 field4021;

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "Z")
    public static boolean field4029;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 4)
    public void method518(int arg0) {
        field4016++;
        class20 var2 = class267.method1587((byte) -124, this.field4027.field9570, this.field4018);
        if (arg0 != -841) {
            field4025 = null;
        }
        this.field4021 = class309.field3898.method414(var2, class495.method2690(this.field4024, this.field4027.field9570), true);
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)I", line = 17)
    public final int method1860(int arg0) {
        field4020++;
        if (arg0 != 0) {
            field4025 = null;
        }
        int var2 = class185.field2182.method2425((byte) 113);
        int var3 = var2 * 100;
        if (this.field4026 == var2 && var2 != 0) {
            int var4 = class185.field2182.method2430(true);
            if (var4 > var2) {
                long var5 = this.field4023 - class185.field2182.method2431(79);
                if (var5 > 0L) {
                    long var7 = var5 * 10000L / (long) var2 * (long) (var4 - var2);
                    long var9 = (class321.method1854(-30) - this.field4023) * 10000L;
                    if (var7 <= var9) {
                        var3 = var4 * 100;
                    } else {
                        var3 = (int) ((long) (var4 - var2) * 100L * var9 / var7 + (long) (var2 * 100));
                    }
                }
            }
        } else {
            this.field4026 = var2;
            this.field4023 = class321.method1854(-48);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)[Lhg;", line = 79)
    public static final class647[] method1863(byte arg0) {
        field4019++;
        int var1 = 27 % ((-arg0 - 23) / 62);
        return new class647[] { class26.field309, class194.field2289, class520.field6561 };
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)Z", line = 94)
    public boolean method516(int arg0) {
        field4022++;
        boolean var2 = true;
        if (!this.field4024.method1669((byte) -88, this.field4027.field9570)) {
            var2 = false;
        }
        if (!this.field4018.method1669((byte) 115, this.field4027.field9570)) {
            var2 = false;
        }
        if (arg0 != -6191) {
            field4028 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V", line = 114)
    public static void method1864(int arg0) {
        int var1 = -29 / ((65 - arg0) / 55);
        field4028 = null;
        field4025 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZB)V", line = 129)
    public final void method513(boolean arg0, byte arg1) {
        field4017++;
        if (arg1 < 57) {
            return;
        }
        int var3 = this.field4027.field9578.method3205(class696.field9640, -7963, this.field4027.field9574) + this.field4027.field9571;
        int var4 = this.field4027.field9576.method1445(2, class634.field8596, this.field4027.field9572) + this.field4027.field9577;
        this.method1862(var4, var3, arg0, true);
        this.method1861(arg0, (byte) -121, var3, var4);
        String var5 = class185.field2182.method2429((byte) -77);
        if (class321.method1854(-128) - this.field4023 > 10000L) {
            var5 = var5 + " (" + class185.field2182.method2426(-6221).method1060(9) + ")";
        }
        this.field4021.method1162(true, this.field4027.field9574 / 2 + var3, var5, this.field4027.field9569, -1, this.field4027.field9572 / 2 + this.field4027.field9568 + var4 + 4);
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Lpfa;Lpfa;Lau;)V", line = 151)
    public class323(class275 arg0, class275 arg1, class690 arg2) {
        this.field4027 = arg2;
        this.field4024 = arg0;
        this.field4018 = arg1;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZBII)V")
    public abstract void method1861(boolean arg0, byte arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIZZ)V")
    public abstract void method1862(int arg0, int arg1, boolean arg2, boolean arg3);
}
