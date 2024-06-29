import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class450 {

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public int field6485 = 1;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field6486 = 0;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field6492 = -1;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "C")
    public char field6488;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field6489;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field6490;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field6491;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZLmo;)V", line = 5)
    public final void method2669(boolean arg0, class695 arg1) {
        if (!arg0) {
            return;
        }
        while (true) {
            int var3 = arg1.method3826(!arg0);
            if (var3 == 0) {
                field6487++;
                return;
            }
            this.method2671(var3, 17868, arg1);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)V", line = 31)
    public static final void method2670(int arg0, int arg1, int arg2) {
        field6489++;
        if (class25.field341 > class25.field343) {
            class25.field343 = (float) ((double) class25.field343 / 30.0D + (double) class25.field343);
            if (class25.field343 > class25.field341) {
                class25.field343 = class25.field341;
            }
            class167.method1159((byte) -33);
            class25.field345 = (int) class25.field343 >> 1;
            class25.field347 = class483.method2814(-24169, class25.field345);
        } else if (class25.field343 > class25.field341) {
            class25.field343 = (float) ((double) class25.field343 - (double) class25.field343 / 30.0D);
            if (class25.field343 < class25.field341) {
                class25.field343 = class25.field341;
            }
            class167.method1159((byte) -33);
            class25.field345 = (int) class25.field343 >> 1;
            class25.field347 = class483.method2814(-24169, class25.field345);
        }
        int var3 = 98 / ((arg1 + 6) / 54);
        if (class319.field4698 != -1 && class9.field89 != -1) {
            int var4 = class319.field4698 - class199.field2808;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            int var5 = class9.field89 - class671.field9481;
            class199.field2808 += var4;
            if (var5 < 2 || var5 > 2) {
                var5 /= 8;
            }
            if (var4 == 0 && var5 == 0) {
                class319.field4698 = -1;
                class9.field89 = -1;
            }
            class671.field9481 += var5;
            class167.method1159((byte) -33);
        }
        if (class14.field132 > 0) {
            class394.field5835--;
            if (class394.field5835 == 0) {
                class394.field5835 = 100;
                class14.field132--;
            }
        } else {
            class511.field7190 = -1;
            class444.field6469 = -1;
        }
        if (!class688.field9686 || class569.field8030 == null) {
            return;
        }
        for (class430 var6 = (class430) class569.field8030.method472((byte) -119); var6 != null; var6 = (class430) class569.field8030.method482(-81)) {
            class588 var7 = class25.field339.method812((byte) 124, var6.field6302.field8781);
            if (var6.method2568((byte) -59, arg0, arg2)) {
                if (var7.field8250 != null) {
                    if (var7.field8250[4] != null) {
                        class605.method3404(var7.field8246, var7.field8220, 0, true, 1008, -1, false, -53, -1, (long) var6.field6302.field8781, var7.field8250[4]);
                    }
                    if (var7.field8250[3] != null) {
                        class605.method3404(var7.field8246, var7.field8220, 0, true, 1011, -1, false, -30, -1, (long) var6.field6302.field8781, var7.field8250[3]);
                    }
                    if (var7.field8250[2] != null) {
                        class605.method3404(var7.field8246, var7.field8220, 0, true, 1012, -1, false, -71, -1, (long) var6.field6302.field8781, var7.field8250[2]);
                    }
                    if (var7.field8250[1] != null) {
                        class605.method3404(var7.field8246, var7.field8220, 0, true, 1004, -1, false, -56, -1, (long) var6.field6302.field8781, var7.field8250[1]);
                    }
                    if (var7.field8250[0] != null) {
                        class605.method3404(var7.field8246, var7.field8220, 0, true, 1003, -1, false, -49, -1, (long) var6.field6302.field8781, var7.field8250[0]);
                    }
                }
                if (!var6.field6302.field8778) {
                    var6.field6302.field8778 = true;
                    class220.method1450(class129.field1904, var6.field6302.field8781, var7.field8246);
                }
                if (var6.field6302.field8778) {
                    class220.method1450(class132.field1947, var6.field6302.field8781, var7.field8246);
                }
            } else if (var6.field6302.field8778) {
                var6.field6302.field8778 = false;
                class220.method1450(class440.field6415, var6.field6302.field8781, var7.field8246);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILmo;)V", line = 175)
    private final void method2671(int arg0, int arg1, class695 arg2) {
        if (arg0 == 1) {
            this.field6488 = class178.method1210(32062, arg2.method3827((byte) -58));
        } else if (arg0 == 2) {
            this.field6485 = 0;
        }
        if (arg1 != 17868) {
            this.method2669(true, null);
        }
        field6491++;
    }
}
