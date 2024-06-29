import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class246 {

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "B")
    private byte field3910;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public int field3912;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "I")
    public int field3901;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public int field3906;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    public int field3909;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public int field3905;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "Lwg;")
    public static class198 field3911 = new class198();

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field3913 = 0;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "[Lhl;")
    public static class246[] field3914 = new class246[6];

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public static int field3916 = 0;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public static int field3915 = -1;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "F")
    public static float field3917;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "Lnm;")
    public static class221 field3902;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)I", line = 10)
    public final int method1747(int arg0) {
        field3903++;
        if (arg0 != 1) {
            method1750(false);
        }
        return (this.field3910 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ZLre;)V", line = 23)
    public static final void method1748(boolean arg0, class287 arg1) {
        if (arg0) {
            field3916 = -83;
        }
        if (class58.field875 == arg1.field4726 || arg1.field4795 == -1 || arg1.field4715 != 0 || (arg1.field4776 + 1) > class68.method476((byte) 125, arg1.field4795).field2002[arg1.field4773]) {
            int var2 = arg1.field4726 - arg1.field4799;
            int var3 = class58.field875 - arg1.field4799;
            int var4 = arg1.field4769 * 128 + arg1.method312(-95) * 64;
            int var5 = arg1.field4749 * 128 + arg1.method312(-119) * 64;
            int var6 = arg1.field4756 * 128 + (arg1.method312(33) * 64);
            int var7 = arg1.field4729 * 128 + arg1.method312(-117) * 64;
            arg1.field4796 = ((var2 - var3) * var4 + var3 * var6) / var2;
            arg1.field4783 = ((var2 - var3) * var5 + (var3 * var7)) / var2;
        }
        field3908++;
        if (arg1.field4738 == 0) {
            arg1.field4780 = 1024;
        }
        arg1.field4725 = 0;
        if (arg1.field4738 == 1) {
            arg1.field4780 = 1536;
        }
        if (arg1.field4738 == 2) {
            arg1.field4780 = 0;
        }
        if (arg1.field4738 == 3) {
            arg1.field4780 = 512;
        }
        arg1.field4778 = arg1.field4780;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V", line = 67)
    public static void method1749(int arg0) {
        field3902 = null;
        if (arg0 != 0) {
            method1749(-40);
        }
        field3914 = null;
        field3911 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V", line = 91)
    public static final void method1750(boolean arg0) {
        class177 var1 = (class177) class41.field630.method1081(92);
        field3904++;
        while (var1 != null) {
            if (var1.field2767 == -1) {
                var1.field2755 = 0;
                class241.method1686(516374, var1);
            } else {
                var1.method1131(8);
            }
            var1 = (class177) class41.field630.method1083((byte) 113);
        }
        if (!arg0) {
            method1748(false, (class287) null);
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(Z)I", line = 120)
    public final int method1751(boolean arg0) {
        field3907++;
        return arg0 ? this.field3910 & 0x7 : -6;
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)Z", line = 132)
    public static final boolean method1752(int arg0) {
        field3900++;
        return class77.field1147 == arg0 ? class228.field3583.method1587(119) : true;
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "()V", line = 149)
    public class246() {
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lfh;)V", line = 151)
    public class246(class313 arg0) {
        this.field3910 = arg0.method2200(-89);
        this.field3912 = arg0.method2250(-1613178296);
        this.field3901 = arg0.method2231((byte) -125);
        this.field3906 = arg0.method2231((byte) -127);
        this.field3909 = arg0.method2231((byte) -126);
        this.field3905 = arg0.method2231((byte) -127);
    }
}
