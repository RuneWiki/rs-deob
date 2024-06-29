import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class243 {

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "Lad;")
    private class11 field3118 = new class11(64);

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "Ldn;")
    private class201 field3117;

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
    public static int field3125 = 1;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "Ltu;")
    public static class7 field3114 = new class7();

    @OriginalMember(owner = "client!tr", name = "o", descriptor = "Lpi;")
    public static class340 field3128 = new class340(106, 6);

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
    public static int field3123;

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!tr", name = "n", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "Lvh;")
    public static class191 field3126;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
    public static void method1522(int arg0) {
        if (arg0 >= -23) {
            field3125 = -52;
        }
        field3128 = null;
        field3114 = null;
        field3126 = null;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIB)I")
    public static final int method1523(int arg0, int arg1, byte arg2) {
        int var3 = -98 / ((arg2 + 8) / 55);
        field3116++;
        return arg1 == 1 || arg1 == 3 ? class73.field924[arg0 & 0x3] : class56.field758[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IZ)V")
    public final void method1524(int arg0, boolean arg1) {
        class11 var3 = this.field3118;
        synchronized (this.field3118) {
            this.field3118.method90((byte) -27);
            this.field3118 = new class11(arg0);
        }
        field3127++;
        if (arg1) {
            this.method1526(-43);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IB)V")
    public final void method1525(int arg0, byte arg1) {
        class11 var3 = this.field3118;
        synchronized (this.field3118) {
            if (arg1 < 73) {
                return;
            }
            this.field3118.method80(-70, arg0);
        }
        field3115++;
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)V")
    public final void method1526(int arg0) {
        field3119++;
        class11 var2 = this.field3118;
        synchronized (this.field3118) {
            this.field3118.method84(-84);
            if (arg0 >= -69) {
                field3122 = -68;
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(BLeo;)V")
    public static final void method1527(byte arg0, class423 arg1) {
        int var2 = 45 % ((arg0 - 54) / 54);
        field3121++;
        if (class32.field530 != arg1.field5800) {
            return;
        }
        if (class37.field573.field7630 == null) {
            arg1.field5677 = 0;
            arg1.field5760 = 0;
            return;
        }
        arg1.field5669 = 150;
        arg1.field5766 = (int) (Math.sin((double) class264.field3353 / 40.0D) * 256.0D) & 0x7FF;
        arg1.field5677 = class166.field2149;
        arg1.field5727 = 5;
        arg1.field5760 = class278.method1702(class37.field573.field7630, 0);
        arg1.field5691 = 0;
        arg1.field5792 = class37.field573.field5174;
        arg1.field5667 = class37.field573.field5148;
        arg1.field5807 = class37.field573.field5181;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(ZI)Lpq;")
    public final class51 method1528(boolean arg0, int arg1) {
        field3120++;
        class11 var3 = this.field3118;
        class51 var4;
        synchronized (this.field3118) {
            var4 = (class51) this.field3118.method78((long) arg1, (byte) -116);
        }
        if (var4 != null) {
            return var4;
        }
        if (arg0) {
            this.method1529(false);
        }
        byte[] var5 = this.field3117.method1313((byte) -120, class481.method2885(arg1, (byte) -127), class197.method1270((byte) -115, arg1));
        class51 var6 = new class51();
        if (var5 != null) {
            var6.method309(true, new class88(var5));
        }
        class11 var7 = this.field3118;
        synchronized (this.field3118) {
            this.field3118.method88((long) arg1, 72, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)V")
    public final void method1529(boolean arg0) {
        field3124++;
        class11 var2 = this.field3118;
        synchronized (this.field3118) {
            this.field3118.method90((byte) -27);
            if (arg0) {
                field3128 = null;
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(Lgt;ILdn;)V")
    public class243(class65 arg0, int arg1, class201 arg2) {
        this.field3117 = arg2;
        if (this.field3117 != null) {
            int var4 = this.field3117.method1309((byte) 31) - 1;
            this.field3117.method1302(-105, var4);
        }
    }
}
