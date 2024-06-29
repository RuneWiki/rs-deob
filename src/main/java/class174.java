import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class174 {

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Lu;")
    private class34 field3092 = new class34();

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Lc;")
    private class70 field3095 = new class70();

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    private int field3094;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "I")
    private int field3096;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Lrj;")
    private class254 field3093;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "[Lfj;")
    public static class286[] field3083 = new class286[50];

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "Lke;")
    public static class256 field3089 = class316.method2202("Spielwelt erstellt)3", 27626);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "[Lsk;")
    public static class269[] field3091;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lu;JI)V", line = 5)
    public final void method1259(class34 arg0, long arg1, int arg2) {
        if (this.field3096 == arg2) {
            class34 var5 = this.field3095.method538(110);
            var5.method1199(21966);
            var5.method235(arg2 - 90);
            if (this.field3092 == var5) {
                class34 var6 = this.field3095.method538(-85);
                var6.method1199(21966);
                var6.method235(arg2 + 111);
            }
        } else {
            this.field3096--;
        }
        this.field3093.method1749(true, arg0, arg1);
        field3082++;
        this.field3095.method537(arg0, -1);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IJ)Lu;", line = 32)
    public final class34 method1260(int arg0, long arg1) {
        field3088++;
        if (arg0 >= -57) {
            this.field3094 = 4;
        }
        class34 var4 = (class34) this.field3093.method1744((byte) 126, arg1);
        if (var4 != null) {
            this.field3095.method537(var4, -1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 64)
    public final void method1261(int arg0) {
        this.field3095.method531(arg0);
        this.field3093.method1748(0);
        field3087++;
        this.field3092 = new class34();
        this.field3096 = this.field3094;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)Lsg;", line = 90)
    public final class163 method1262(int arg0) {
        if (arg0 != -13503) {
            this.field3094 = -96;
        }
        field3090++;
        return this.field3093.method1743(true);
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)Lsg;", line = 102)
    public final class163 method1263(int arg0) {
        int var2 = 121 % ((3 - arg0) / 47);
        field3086++;
        return this.field3093.method1742((byte) 32);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)I", line = 111)
    public static final int method1264(int arg0, int arg1, int arg2) {
        if (arg1 <= 32) {
            method1266(119, (class256) null);
        }
        int var3 = class140.method1030(-81, arg0 - 1, arg2 + -1) - (-class140.method1030(110, arg0 - 1, arg2 + 1) + (-class140.method1030(96, arg0 + 1, arg2 + -1) - class140.method1030(-83, arg0 + 1, arg2 + 1)));
        field3085++;
        int var4 = class140.method1030(102, arg0, arg2 - 1) - (-class140.method1030(-31, arg0, arg2 + 1) - class140.method1030(92, arg0 - 1, arg2)) + class140.method1030(78, arg0 - -1, arg2);
        int var5 = class140.method1030(-125, arg0, arg2);
        return var3 / 16 - (-(var4 / 8) - (var5 / 4));
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V", line = 138)
    public static void method1265(byte arg0) {
        field3083 = null;
        field3089 = null;
        field3091 = null;
        int var1 = -83 % ((-arg0 - 49) / 43);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILke;)I", line = 150)
    public static final int method1266(int arg0, class256 arg1) {
        field3084++;
        if (arg0 != 1) {
            method1266(114, (class256) null);
        }
        return arg1.method1799(127) + 1;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(I)V", line = 183)
    public class174(int arg0) {
        this.field3094 = arg0;
        this.field3096 = arg0;
        int var2;
        for (var2 = 1; arg0 > (var2 + var2); var2 += var2) {
        }
        this.field3093 = new class254(var2);
    }
}
