import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class268 extends class82 {

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public int field4035;

    @OriginalMember(owner = "client!sa", name = "E", descriptor = "I")
    public int field4049;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "I")
    public static int field4037 = -1;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
    public static int field4041 = 0;

    @OriginalMember(owner = "client!sa", name = "A", descriptor = "Lik;")
    public static class267 field4045 = new class267(16);

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public static int field4040;

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!sa", name = "B", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!sa", name = "C", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!sa", name = "G", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!sa", name = "H", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!sa", name = "I", descriptor = "I")
    public static int field4053;

    @OriginalMember(owner = "client!sa", name = "J", descriptor = "I")
    public static int field4054;

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "I")
    public static int field4055;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "Lrl;")
    public static class164 field4036;

    @OriginalMember(owner = "client!sa", name = "z", descriptor = "[Lpi;")
    public static class141[] field4044;

    @OriginalMember(owner = "client!sa", name = "F", descriptor = "[S")
    public static short[] field4050;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)Z")
    public final boolean method1787(int arg0) {
        field4052++;
        int var2 = -73 / ((arg0 + 23) / 63);
        return (this.field4049 >> 21 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IZ)Z")
    public final boolean method1788(int arg0, boolean arg1) {
        field4039++;
        if (!arg1) {
            field4041 = -6;
        }
        return (this.field4049 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "(I)V")
    public static void method1789(int arg0) {
        field4050 = null;
        if (arg0 > -88) {
            field4037 = 54;
        }
        field4036 = null;
        field4045 = null;
        field4044 = null;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)V")
    public static final void method1790(byte arg0) {
        field4040++;
        class57.field902.method1775(27147);
        if (arg0 != 77) {
            field4044 = null;
        }
        class264.field3989.method1775(arg0 ^ 0x6A46);
        class149.field2159.method1775(arg0 ^ 0x6A46);
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)I")
    public final int method1791(byte arg0) {
        if (arg0 == 69) {
            field4055++;
            return class255.method1685(-118, this.field4049);
        } else {
            return -88;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
    public static final void method1792(boolean arg0) {
        field4048++;
        if (!arg0) {
            class234.field3532 = new class289[class154.field2312.method1962(true)][];
            class220.field3307 = new boolean[class154.field2312.method1962(true)];
        }
    }

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "(I)Z")
    public final boolean method1793(int arg0) {
        field4047++;
        if (arg0 >= -20) {
            return true;
        } else {
            return (this.field4049 & 0x7B202A) >> 22 != 0;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)J")
    public static final long method1794(int arg0, int arg1, int arg2) {
        class270 var3 = class33.field487[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field4071; var4++) {
            class2 var5 = var3.field4069[var4];
            if ((var5.field28 >> 29 & 0x3L) == 2L && var5.field26 == arg1 && var5.field23 == arg2) {
                return var5.field28;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "(B)Z")
    public final boolean method1795(byte arg0) {
        if (arg0 < 57) {
            return false;
        } else {
            field4043++;
            return (this.field4049 >> 31 & 0x1) != 0;
        }
    }

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "(I)Z")
    public final boolean method1796(int arg0) {
        if (arg0 != -1) {
            this.method1798(-76);
        }
        field4038++;
        return (this.field4049 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "(I)I")
    public final int method1797(int arg0) {
        if (arg0 != 0) {
            field4041 = -74;
        }
        field4051++;
        return (this.field4049 & 0x1C2924) >> 18;
    }

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "(I)Z")
    public final boolean method1798(int arg0) {
        field4053++;
        if (arg0 != -4800) {
            field4041 = 98;
        }
        return (this.field4049 & 0x2F31307D) >> 29 != 0;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(II)V")
    public class268(int arg0, int arg1) {
        this.field4035 = arg1;
        this.field4049 = arg0;
    }

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "(I)Z")
    public final boolean method1799(int arg0) {
        if (arg0 != -7933) {
            this.method1797(44);
        }
        field4046++;
        return (this.field4049 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(Z)Z")
    public final boolean method1800(boolean arg0) {
        if (arg0) {
            this.field4049 = -109;
        }
        field4054++;
        return (this.field4049 & 0x1) != 0;
    }
}
