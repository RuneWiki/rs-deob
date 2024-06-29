import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class126 implements Runnable {

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "Laca;")
    private class134 field1567 = new class153();

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "Laca;")
    private class134 field1586 = null;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field1569;

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!jl", name = "j", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!jl", name = "k", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
    public static int field1576;

    @OriginalMember(owner = "client!jl", name = "m", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!jl", name = "q", descriptor = "I")
    private int field1581;

    @OriginalMember(owner = "client!jl", name = "s", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    private int field1585;

    @OriginalMember(owner = "client!jl", name = "p", descriptor = "J")
    private long field1580;

    @OriginalMember(owner = "client!jl", name = "r", descriptor = "J")
    private long field1582;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "Llda;")
    private class203 field1587;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "Ljava/lang/String;")
    private String field1588;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "Z")
    private volatile boolean field1568;

    @OriginalMember(owner = "client!jl", name = "n", descriptor = "Z")
    private boolean field1578;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLaca;)V")
    public final synchronized void method666(byte arg0, class134 arg1) {
        this.field1586 = this.field1567;
        field1566++;
        this.field1567 = arg1;
        int var3 = -48 % ((arg0 + 44) / 63);
        this.field1582 = class571.method3150(111);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)I")
    public final int method667(byte arg0) {
        if (arg0 == -39) {
            field1565++;
            return this.field1581;
        } else {
            return -36;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public final synchronized void method668(int arg0) {
        field1572++;
        int var2 = -66 / ((arg0 - 57) / 47);
        this.field1578 = true;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Llda;BJILjava/lang/String;)V")
    public final synchronized void method669(class203 arg0, byte arg1, long arg2, int arg3, String arg4) {
        this.field1585 = arg3;
        this.field1587 = arg0;
        this.field1588 = arg4;
        field1569++;
        int var7 = 99 % ((arg1 + 68) / 53);
        this.field1580 = arg2;
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)J")
    public final long method670(byte arg0) {
        if (arg0 == -25) {
            field1575++;
            return this.field1580;
        } else {
            return 8L;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)Z")
    public final synchronized boolean method671(boolean arg0) {
        field1574++;
        if (!arg0) {
            this.field1567 = null;
        }
        return this.field1567.method779(this.field1582, 21336);
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)V")
    public final void method672(int arg0) {
        this.field1568 = true;
        if (arg0 != 24551) {
            this.field1580 = -13L;
        }
        field1570++;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(B)Llda;")
    public final class203 method673(byte arg0) {
        if (arg0 <= 31) {
            return null;
        } else {
            field1573++;
            return this.field1587;
        }
    }

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "(B)Ljava/lang/String;")
    public final String method674(byte arg0) {
        field1577++;
        if (arg0 != 86) {
            field1583 = -67;
        }
        return this.field1588;
    }

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)I")
    public final int method675(int arg0) {
        field1576++;
        if (this.field1587 == null) {
            return 0;
        }
        int var2 = this.field1587.method1226((byte) -98);
        if (this.field1587.field2560 && this.field1585 < this.field1587.field2566) {
            return this.field1585 + 1;
        } else if (var2 < 0 || var2 >= (class487.field6450.length - 1)) {
            return 100;
        } else if (this.field1587.field2568 == this.field1585) {
            return this.field1587.field2566;
        } else if (arg0 == -23213) {
            return this.field1587.field2568;
        } else {
            return 25;
        }
    }

    @OriginalMember(owner = "client!jl", name = "run", descriptor = "()V")
    public final void run() {
        while (!this.field1568) {
            long var1 = class571.method3150(112);
            synchronized (this) {
                try {
                    if (this.field1567 instanceof class153) {
                        this.field1567.method775(true, this.field1578);
                    } else {
                        this.field1581++;
                        long var4 = class571.method3150(117);
                        if (class32.field452 == null || this.field1586 == null || this.field1586.method780((byte) -105) == 0 || this.field1582 < (var4 - (long) this.field1586.method780((byte) -108))) {
                            if (this.field1586 != null) {
                                this.field1578 = true;
                                this.field1586.method777((byte) -22);
                                this.field1586 = null;
                            }
                            if (this.field1578) {
                                class170.method972(0);
                                if (class32.field452 != null) {
                                    class32.field452.method1028(0);
                                }
                            }
                            this.field1567.method775(true, this.field1578 || class32.field452 != null && class32.field452.method1067());
                        } else {
                            int var6 = (int) ((var4 - this.field1582) * 255L / (long) this.field1586.method780((byte) -96));
                            int var7 = 255 - var6;
                            class170.method972(0);
                            int var8 = var7 << 24 | 0xFFFFFF;
                            int var9 = var6 << 24 | 0xFFFFFF;
                            class32.field452.method1028(0);
                            class536 var10 = class32.field452.method1071(class523.field7111, class244.field3022, true);
                            class32.field452.method3112(var10, 5);
                            this.field1586.method775(true, true);
                            class32.field452.method1082();
                            var10.method155(0, 0, 0, var8, 1);
                            class32.field452.method3112(var10, 5);
                            class32.field452.method1028(0);
                            this.field1567.method775(true, true);
                            class32.field452.method1082();
                            var10.method155(0, 0, 0, var9, 1);
                        }
                        try {
                            if (class32.field452 != null && !(this.field1567 instanceof class153)) {
                                class32.field452.method988();
                            }
                        } catch (class180 var17) {
                            class106.method597(var17.getMessage() + " (Recovered) " + class520.field7094.method3703((byte) -30), -2, var17);
                            class393.method2111(0, true);
                        }
                    }
                    this.field1578 = false;
                } catch (Exception var18) {
                    continue;
                }
            }
            long var12 = class571.method3150(92);
            int var14 = (int) (20L - (var12 - var1));
            if (var14 > 0) {
                class419.method2233(-28448, (long) var14);
            }
        }
        field1579++;
    }

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "(B)I")
    public final int method676(byte arg0) {
        field1584++;
        return arg0 == -29 ? this.field1585 : 3;
    }
}
