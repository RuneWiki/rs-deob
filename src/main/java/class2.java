import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 {

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "Lpb;")
    public class656 field24 = new class656();

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "Lhda;")
    public static class752 field15 = new class752(52, 6);

    @OriginalMember(owner = "client!ro", name = "t", descriptor = "Z")
    public static boolean field33 = false;

    @OriginalMember(owner = "client!ro", name = "v", descriptor = "I")
    public static int field35 = 0;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!ro", name = "s", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!ro", name = "u", descriptor = "Lpb;")
    private class656 field34;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "Lgba;")
    public static class668 field26;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)Lpb;", line = 4)
    public final class656 method9(int arg0) {
        field21++;
        if (arg0 >= -126) {
            return null;
        }
        class656 var2 = this.field34;
        if (this.field24 == var2) {
            this.field34 = null;
            return null;
        } else {
            this.field34 = var2.field8677;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Z)Lpb;", line = 25)
    public final class656 method10(boolean arg0) {
        if (arg0) {
            this.method21(22);
        }
        field25++;
        class656 var2 = this.field24.field8677;
        if (this.field24 == var2) {
            return null;
        } else {
            var2.method3564(!arg0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lpb;I)V", line = 43)
    public final void method11(class656 arg0, int arg1) {
        field20++;
        if (arg0.field8681 != null) {
            arg0.method3564(true);
        }
        if (arg1 <= -87) {
            arg0.field8677 = this.field24;
            arg0.field8681 = this.field24.field8681;
            arg0.field8681.field8677 = arg0;
            arg0.field8677.field8681 = arg0;
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)Lpb;", line = 67)
    public final class656 method12(int arg0) {
        field14++;
        class656 var2 = this.field24.field8681;
        if (this.field24 == var2) {
            this.field34 = null;
            return null;
        }
        if (arg0 != 0) {
            field15 = null;
        }
        this.field34 = var2.field8681;
        return var2;
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(Lpb;I)V", line = 91)
    public final void method13(class656 arg0, int arg1) {
        field17++;
        if (arg0.field8681 != null) {
            arg0.method3564(true);
        }
        if (arg1 != 593) {
            this.method14(91);
        }
        arg0.field8681 = this.field24;
        arg0.field8677 = this.field24.field8677;
        arg0.field8681.field8677 = arg0;
        arg0.field8677.field8681 = arg0;
    }

    @OriginalMember(owner = "client!ro", name = "c", descriptor = "(I)I", line = 111)
    public final int method14(int arg0) {
        field23++;
        int var2 = arg0;
        for (class656 var3 = this.field24.field8677; var3 != this.field24; var3 = var3.field8677) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ro", name = "d", descriptor = "(I)V", line = 131)
    public static final void method15(int arg0) {
        field29++;
        if (arg0 != 17458) {
            method18(-99, 124, (byte) 2);
        }
        class574 var1 = null;
        try {
            class198 var2 = class66.field828.method1309(true, arg0 - 17458, "");
            while (var2.field2987 == 0) {
                class226.method1447((byte) -124, 1L);
            }
            if (var2.field2987 == 1) {
                var1 = (class574) var2.field2986;
                class677 var3 = class411.field5711.method1674((byte) -112);
                var1.method3161(3874, 0, var3.field9419, var3.field9399);
            }
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method3157(-95);
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lro;I)V", line = 168)
    public final void method16(class2 arg0, int arg1) {
        field31++;
        this.method19(this.field24.field8677, 41, arg0);
        if (arg1 != -2) {
            field33 = true;
        }
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(Z)Z", line = 180)
    public final boolean method17(boolean arg0) {
        field19++;
        if (arg0) {
            return true;
        } else {
            return this.field24.field8677 == this.field24;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IIB)V", line = 192)
    public static final void method18(int arg0, int arg1, byte arg2) {
        field18++;
        int var3 = 63 % ((arg2 - 78) / 37);
        if (class435.method2502(arg1, (byte) -22)) {
            class131.method1025(6409, class747.field10393[arg1], arg0);
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lpb;ILro;)V", line = 215)
    private final void method19(class656 arg0, int arg1, class2 arg2) {
        field16++;
        class656 var4 = this.field24.field8681;
        if (arg1 <= 27) {
            field33 = true;
        }
        this.field24.field8681 = arg0.field8681;
        arg0.field8681.field8677 = this.field24;
        if (this.field24 != arg0) {
            arg0.field8681 = arg2.field24.field8681;
            arg0.field8681.field8677 = arg0;
            arg2.field24.field8681 = var4;
            var4.field8677 = arg2.field24;
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)V", line = 241)
    public static void method20(byte arg0) {
        field15 = null;
        field26 = null;
        if (arg0 <= 33) {
            method24(69, (byte) -63, -7L);
        }
    }

    @OriginalMember(owner = "client!ro", name = "e", descriptor = "(I)Lpb;", line = 254)
    public final class656 method21(int arg0) {
        field32++;
        if (arg0 != 2) {
            this.field34 = null;
        }
        class656 var2 = this.field24.field8677;
        if (this.field24 == var2) {
            this.field34 = null;
            return null;
        } else {
            this.field34 = var2.field8677;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ro", name = "f", descriptor = "(I)Lpb;", line = 275)
    public final class656 method22(int arg0) {
        field30++;
        if (arg0 != 17833) {
            return null;
        }
        class656 var2 = this.field34;
        if (this.field24 == var2) {
            this.field34 = null;
            return null;
        } else {
            this.field34 = var2.field8681;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ro", name = "g", descriptor = "(I)V", line = 301)
    public final void method23(int arg0) {
        field27++;
        if (arg0 != 10) {
            return;
        }
        while (true) {
            class656 var2 = this.field24.field8677;
            if (this.field24 == var2) {
                this.field34 = null;
                return;
            }
            var2.method3564(true);
        }
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "()V", line = 351)
    public class2() {
        this.field24.field8681 = this.field24;
        this.field24.field8677 = this.field24;
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(IBJ)Ljava/lang/String;", line = 328)
    public static final String method24(int arg0, byte arg1, long arg2) {
        class56.method376(arg2, -8474);
        field22++;
        if (arg1 <= 26) {
            method24(-23, (byte) -10, 51L);
        }
        int var4 = class132.field2151.get(5);
        int var5 = class132.field2151.get(2);
        int var6 = class132.field2151.get(1);
        return arg0 == 3 ? class496.method2803(64, arg0, arg2) : Integer.toString(var4 / 10) + var4 % 10 + "-" + class56.field680[arg0][var5] + "-" + var6;
    }
}
