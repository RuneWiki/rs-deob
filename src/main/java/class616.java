import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class616 {

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "Lgga;")
    public class333 field8677 = new class333();

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "I")
    public static int field8688 = 0;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "I")
    public static int field8680 = 1;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "Lqh;")
    public static class320 field8685 = new class320("runescape", 0);

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    public static int field8670;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field8671;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    public static int field8672;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field8673;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field8674;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
    public static int field8675;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field8676;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field8678;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "I")
    public static int field8679;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "I")
    public static int field8681;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    public static int field8682;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field8683;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public static int field8684;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public static int field8687;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
    public static int field8689;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "I")
    public static int field8690;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "Lgga;")
    private class333 field8691;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "Lvc;")
    public static class390 field8686;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lgga;Z)V", line = 5)
    public final void method3425(class333 arg0, boolean arg1) {
        field8678++;
        if (arg0.field4174 != null) {
            arg0.method1922(99);
        }
        arg0.field4174 = this.field8677.field4174;
        arg0.field4181 = this.field8677;
        arg0.field4174.field4181 = arg0;
        if (arg1) {
            field8685 = null;
        }
        arg0.field4181.field4174 = arg0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Lgga;", line = 25)
    public final class333 method3426(byte arg0) {
        field8682++;
        class333 var2 = this.field8691;
        if (this.field8677 == var2) {
            this.field8691 = null;
            return null;
        } else {
            int var3 = -67 % ((arg0 + 26) / 45);
            this.field8691 = var2.field4174;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V", line = 45)
    public static void method3427(int arg0) {
        field8685 = null;
        if (arg0 < -85) {
            field8686 = null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lgk;I)V", line = 56)
    public final void method3428(class616 arg0, int arg1) {
        if (arg1 > -31) {
            method3436(-126, -63, 74);
        }
        this.method3435(-15677, this.field8677.field4181, arg0);
        field8672++;
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)I", line = 72)
    public final int method3429(byte arg0) {
        field8671++;
        if (arg0 != -88) {
            field8685 = null;
        }
        int var2 = 0;
        class333 var3 = this.field8677.field4181;
        while (this.field8677 != var3) {
            var3 = var3.field4181;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)Lgga;", line = 100)
    public final class333 method3430(boolean arg0) {
        field8670++;
        class333 var2 = this.field8691;
        if (this.field8677 == var2) {
            this.field8691 = null;
            return null;
        }
        if (!arg0) {
            this.method3425(null, false);
        }
        this.field8691 = var2.field4181;
        return var2;
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(B)V", line = 125)
    public static final void method3431(byte arg0) {
        if (class541.field7599 == null) {
            class588 var1 = new class588();
            byte[] var2 = var1.method3315(128, 16, 128, -2);
            class541.field7599 = class489.method2836(var2, false, true);
        }
        field8676++;
        if (arg0 <= 4) {
            method3436(-74, 97, -106);
        }
        if (class371.field5065 == null) {
            class398 var3 = new class398();
            byte[] var4 = var3.method2248(16, (byte) 117, 128, 128);
            class371.field5065 = class489.method2836(var4, false, true);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)Lgga;", line = 155)
    public final class333 method3432(int arg0) {
        field8683++;
        class333 var2 = this.field8677.field4174;
        if (this.field8677 == var2) {
            this.field8691 = null;
            return null;
        } else {
            int var3 = -15 % ((44 - arg0) / 38);
            this.field8691 = var2.field4174;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)V", line = 176)
    public static final void method3433(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -99 % ((38 - arg3) / 47);
        field8684++;
        class76 var5 = class3.method28(11, (byte) 42, arg0);
        var5.method403((byte) -88);
        var5.field785 = arg1;
        var5.field789 = arg2;
    }

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "(B)Lgga;", line = 191)
    public final class333 method3434(byte arg0) {
        field8689++;
        class333 var2 = this.field8677.field4181;
        if (this.field8677 == var2) {
            this.field8691 = null;
            return null;
        } else {
            this.field8691 = var2.field4181;
            return arg0 == 2 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILgga;Lgk;)V", line = 214)
    private final void method3435(int arg0, class333 arg1, class616 arg2) {
        field8690++;
        class333 var4 = this.field8677.field4174;
        this.field8677.field4174 = arg1.field4174;
        arg1.field4174.field4181 = this.field8677;
        if (arg0 == -15677 && this.field8677 != arg1) {
            arg1.field4174 = arg2.field8677.field4174;
            arg1.field4174.field4181 = arg1;
            var4.field4181 = arg2.field8677;
            arg2.field8677.field4174 = var4;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)Z", line = 238)
    public static final boolean method3436(int arg0, int arg1, int arg2) {
        field8681++;
        if (arg2 != 3962) {
            method3433(-49, -128, 83, -120);
        }
        return (arg1 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(BLgga;)V", line = 250)
    public final void method3437(byte arg0, class333 arg1) {
        field8675++;
        if (arg1.field4174 != null) {
            arg1.method1922(79);
        }
        arg1.field4181 = this.field8677.field4181;
        if (arg0 > 28) {
            arg1.field4174 = this.field8677;
            arg1.field4174.field4181 = arg1;
            arg1.field4181.field4174 = arg1;
        }
    }

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V", line = 272)
    public final void method3438(int arg0) {
        while (true) {
            class333 var2 = this.field8677.field4181;
            if (this.field8677 == var2) {
                if (arg0 != 16) {
                    this.field8677 = null;
                }
                field8687++;
                this.field8691 = null;
                return;
            }
            var2.method1922(114);
        }
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V", line = 337)
    public class616() {
        this.field8677.field4181 = this.field8677;
        this.field8677.field4174 = this.field8677;
    }

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "(B)Z", line = 300)
    public final boolean method3439(byte arg0) {
        field8674++;
        int var2 = -26 % ((8 - arg0) / 44);
        return this.field8677.field4181 == this.field8677;
    }

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "(B)Lgga;", line = 317)
    public final class333 method3440(byte arg0) {
        int var2 = 93 % ((67 - arg0) / 37);
        field8679++;
        class333 var3 = this.field8677.field4181;
        if (this.field8677 == var3) {
            return null;
        } else {
            var3.method1922(92);
            return var3;
        }
    }
}
