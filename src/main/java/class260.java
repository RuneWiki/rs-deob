import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class260 {

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lh;")
    public class221 field4580 = new class221();

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "J")
    public static volatile long field4581 = 0L;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Lsf;")
    public static class108 field4584 = class140.method973(255, ":assist:");

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "Lhe;")
    public static class94 field4586 = new class94(50);

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field4593 = 0;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "Lh;")
    private class221 field4590;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)Lh;", line = 12)
    public final class221 method1843(int arg0) {
        if (arg0 != 0) {
            return (class221) null;
        }
        field4591++;
        class221 var2 = this.field4590;
        if (this.field4580 == var2) {
            this.field4590 = null;
            return null;
        } else {
            this.field4590 = var2.field3926;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)Lh;", line = 33)
    public final class221 method1844(boolean arg0) {
        field4583++;
        if (!arg0) {
            this.method1848((class221) null, 89);
        }
        class221 var2 = this.field4580.field3926;
        if (this.field4580 == var2) {
            this.field4590 = null;
            return null;
        } else {
            this.field4590 = var2.field3926;
            return var2;
        }
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(Z)V", line = 55)
    public static final void method1845(boolean arg0) {
        field4587++;
        class68.method456((byte) -73, arg0);
        System.gc();
        class312.method2177(25, (byte) -127);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBIIIIIIII)V", line = 73)
    public static final void method1846(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class163 var10 = null;
        field4585++;
        for (class163 var11 = (class163) class326.field5565.method13(0); var11 != null; var11 = (class163) class326.field5565.method15((byte) 47)) {
            if (var11.field2926 == arg7 && var11.field2929 == arg0 && var11.field2908 == arg8 && var11.field2909 == arg9) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class163();
            var10.field2909 = arg9;
            var10.field2929 = arg0;
            var10.field2926 = arg7;
            var10.field2908 = arg8;
            class330.method2261((byte) -29, var10);
            class326.field5565.method5(var10, (byte) -128);
        }
        var10.field2928 = arg5;
        if (arg1 <= 46) {
            field4592 = 78;
        }
        var10.field2917 = arg4;
        var10.field2918 = arg3;
        var10.field2924 = arg2;
        var10.field2911 = arg6;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 114)
    public final void method1847(int arg0) {
        field4588++;
        while (true) {
            class221 var2 = this.field4580.field3926;
            if (this.field4580 == var2) {
                this.field4590 = null;
                if (arg0 != 25) {
                    method1849(59);
                }
                return;
            }
            var2.method1516(arg0 ^ 0xE6);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lh;I)V", line = 141)
    public final void method1848(class221 arg0, int arg1) {
        field4582++;
        if (arg0.field3933 != null) {
            arg0.method1516(255);
        }
        arg0.field3926 = this.field4580;
        arg0.field3933 = this.field4580.field3933;
        arg0.field3933.field3926 = arg0;
        if (arg1 < 120) {
            field4592 = 84;
        }
        arg0.field3926.field3933 = arg0;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V", line = 246)
    public class260() {
        this.field4580.field3926 = this.field4580;
        this.field4580.field3933 = this.field4580;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V", line = 181)
    public static final void method1849(int arg0) {
        field4589++;
        class165.method1147((long) class116.field2000);
        if (class322.field5511 != -1) {
            class167.method1167((byte) -114, class322.field5511);
        }
        for (int var1 = 0; var1 < class273.field4806; var1++) {
            if (class47.field692[var1]) {
                class280.field4910[var1] = true;
            }
            class183.field3366[var1] = class47.field692[var1];
            class47.field692[var1] = false;
        }
        if (arg0 >= -91) {
            return;
        }
        if (class231.field4051) {
            class98.field1735 = true;
        }
        class301.field5245 = class116.field2000;
        class39.field548 = -1;
        class278.field4879 = null;
        class157.field2838 = -1;
        if (class322.field5511 != -1) {
            class273.field4806 = 0;
            class280.method2017(class322.field5511, class73.field1110, 0, -1, class21.field331, 8619, 0, 0, 0);
        }
        if (class231.field4051) {
            class50.method351();
        } else {
            class28.method191();
        }
        class195.field3534 = 0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V", line = 233)
    public static void method1850(byte arg0) {
        if (arg0 > -92) {
            field4592 = -65;
        }
        field4586 = null;
        field4584 = null;
    }
}
