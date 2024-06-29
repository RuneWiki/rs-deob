import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public abstract class class109 extends class203 {

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "Z")
    public boolean field1569 = false;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "Z")
    public boolean field1571 = false;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public int field1573;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    public int field1576;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public int field1568;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "Lms;")
    public static class453 field1567 = null;

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "I")
    public static int field1574 = 1;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "Lun;")
    public static class243 field1565;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(Z)V", line = 3)
    public static void method769(boolean arg0) {
        if (!arg0) {
            method769(true);
        }
        field1565 = null;
        field1567 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BIIII)V", line = 19)
    public static final void method770(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field1572++;
        if (arg0 >= -112) {
            return;
        }
        int var5 = 0;
        int var6 = arg4;
        int var7 = -arg4;
        class295.method1924(3289650, class296.field4138[arg1], arg3 + arg4, arg2, arg3 - arg4);
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class296.field4138[arg1 + var6];
                int[] var10 = class296.field4138[arg1 - var6];
                int var11 = arg3 + var5;
                int var12 = arg3 - var5;
                class295.method1924(3289650, var9, var11, arg2, var12);
                class295.method1924(3289650, var10, var11, arg2, var12);
            }
            int var13 = arg3 + var6;
            int var14 = arg3 - var6;
            int[] var15 = class296.field4138[arg1 + var5];
            int[] var16 = class296.field4138[arg1 - var5];
            class295.method1924(3289650, var15, var13, arg2, var14);
            class295.method1924(3289650, var16, var13, arg2, var14);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIZ)V", line = 77)
    public static final void method771(int arg0, int arg1, boolean arg2) {
        class57.field783 = new int[arg0][class211.field2954 + 1][class290.field4061 + 1];
        class348.field4796 = new int[class290.field4061];
        class414.field5879 = new byte[arg0][class211.field2954][class290.field4061];
        class288.field4053 = new int[5];
        class65.field968 = new byte[arg0][class211.field2954][class290.field4061];
        class397.field5672 = new int[class290.field4061];
        if (arg1 != -6805) {
            field1574 = 103;
        }
        if (!arg2) {
            class132.field1889 = null;
        }
        class442.field6205 = new int[class290.field4061];
        class277.field3882 = new byte[arg0][class211.field2954][class290.field4061];
        class329.field4569 = new int[class290.field4061];
        class268.field3727 = 99;
        class290.field4074 = new byte[arg0][class211.field2954][class290.field4061];
        field1570++;
        class170.field2329 = new int[class290.field4061];
        class195.field2682 = new byte[arg0][class211.field2954 + 1][class290.field4061 + 1];
    }

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "(I)V", line = 107)
    public static final void method772(int arg0) {
        field1566++;
        if (class64.field935 == 0) {
            return;
        }
        try {
            if (++class415.field5900 > 1500) {
                if (class156.field2207 != null) {
                    class156.field2207.method2210(-2);
                    class156.field2207 = null;
                }
                if (class211.field2953 >= 1) {
                    class390.field5593 = -5;
                    class64.field935 = 0;
                    return;
                }
                class64.field935 = 1;
                class211.field2953++;
                if (class292.field4094 == class129.field1811) {
                    class129.field1811 = class178.field2446;
                } else {
                    class129.field1811 = class292.field4094;
                }
                class415.field5900 = 0;
            }
            if (arg0 != 0) {
                field1567 = null;
            }
            if (class64.field935 == 1) {
                class7.field106 = class241.field3426.method1912(class129.field1811, 1, class173.field2375);
                class64.field935 = 2;
            }
            if (class64.field935 == 2) {
                if (class7.field106.field3998 == 2) {
                    throw new IOException();
                }
                if (class7.field106.field3998 != 1) {
                    return;
                }
                class156.field2207 = new class348((Socket) class7.field106.field3999, class241.field3426);
                class7.field106 = null;
                class156.field2207.method2203(class46.field648.field230, 0, class46.field648.field191, -9);
                if (class417.field5927 != null) {
                    class417.field5927.method272(2);
                }
                if (class119.field1682 != null) {
                    class119.field1682.method272(arg0 + 2);
                }
                int var1 = class156.field2207.method2207(arg0 ^ 0xFFFF00);
                if (class417.field5927 != null) {
                    class417.field5927.method272(2);
                }
                if (class119.field1682 != null) {
                    class119.field1682.method272(2);
                }
                if (var1 != 101) {
                    class390.field5593 = var1;
                    class64.field935 = 0;
                    class156.field2207.method2210(-2);
                    class156.field2207 = null;
                    return;
                }
                class64.field935 = 3;
            }
            if (class64.field935 == 3 && class156.field2207.method2213(99) >= 2) {
                int var2 = class156.field2207.method2207(arg0 ^ 0xFFFF00) << 8 | class156.field2207.method2207(arg0 ^ 0xFFFF00);
                class381.method2426(var2, 10869);
                if (class277.field3883 == -1) {
                    class64.field935 = 0;
                    class390.field5593 = 6;
                    class156.field2207.method2210(arg0 - 2);
                    class156.field2207 = null;
                } else {
                    class64.field935 = 0;
                    class156.field2207.method2210(-2);
                    class156.field2207 = null;
                    class368.method2370(34);
                }
            }
        } catch (IOException var3) {
            if (class156.field2207 != null) {
                class156.field2207.method2210(-2);
                class156.field2207 = null;
            }
            if (class211.field2953 < 1) {
                class415.field5900 = 0;
                class211.field2953++;
                class64.field935 = 1;
                if (class292.field4094 == class129.field1811) {
                    class129.field1811 = class178.field2446;
                } else {
                    class129.field1811 = class292.field4094;
                }
            } else {
                class390.field5593 = -4;
                class64.field935 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(IIIZZ)V", line = 295)
    public class109(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field1573 = arg1;
        this.field1569 = arg3;
        this.field1576 = arg2;
        this.field1568 = arg0;
        this.field1571 = arg4;
    }

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)V", line = 266)
    public static final void method773(int arg0) {
        for (int var1 = 0; var1 < class438.field6171; var1++) {
            int var2 = class314.field4301[var1];
            class134 var3 = class381.field5447[var2];
            int var4 = class333.field4591.method172((byte) 52);
            if ((var4 & 0x40) != 0) {
                var4 += class333.field4591.method172((byte) 52) << 8;
            }
            class254.method1694(11221, var4, var3, var2);
        }
        field1575++;
        if (arg0 <= 17) {
            method773(-19);
        }
    }
}
