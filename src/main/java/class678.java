import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class678 extends class219 {

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "I")
    public static int field9646 = -1;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public int field9639;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
    public static int field9640;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "I")
    public static int field9642;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
    public static int field9643;

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "I")
    public static int field9644;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
    public static int field9645;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "I")
    public static int field9647;

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "I")
    public static int field9648;

    @OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
    public int field9649;

    @OriginalMember(owner = "client!fk", name = "E", descriptor = "I")
    public static int field9650;

    @OriginalMember(owner = "client!fk", name = "F", descriptor = "I")
    public int field9651;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "Ljava/lang/String;")
    public String field9641;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(DI)V")
    public static final void method3832(double arg0, int arg1) {
        if (class176.field2678 != arg0) {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                int var4 = (int) (255.0D * Math.pow((double) var3 / 255.0D, arg0));
                class596.field8419[var3] = var4 <= 255 ? var4 : 255;
            }
            class176.field2678 = arg0;
        }
        if (arg1 != 27536) {
            method3839(33);
        }
        ++field9645;
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)I")
    public final int method3833(int arg0) {
        if (arg0 <= 89) {
            field9646 = -109;
        }
        ++field9640;
        return (int) (super.field7577 >>> 56 & 255L);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public final void method3834(byte arg0) {
        ++field9650;
        super.field3123 |= Long.MIN_VALUE;
        if (this.method3838((byte) -110) == 0L) {
            class214.field3086.method2475(this, -19680);
        }
        int var2 = 107 / ((-50 - arg0) / 60);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lsf;Z[[[BIB)Z")
    public static final boolean method3835(class547 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class282.field4336) {
            return false;
        } else {
            int var5 = arg0.field7718 >> class310.field4616;
            int var6 = var5;
            int var7 = arg0.field7719 >> class310.field4616;
            int var8 = var7;
            if (arg0 instanceof class778) {
                var6 = ((class778) arg0).field10727;
                var8 = ((class778) arg0).field10736;
                var5 = ((class778) arg0).field10733;
                var7 = ((class778) arg0).field10730;
            }
            for (int var9 = var5; var9 <= var6; ++var9) {
                for (int var10 = var7; var10 <= var8; ++var10) {
                    if (arg0.field7711 < class456.field6545 && var9 >= class623.field8779 && var9 < class481.field6840 && var10 >= class366.field5282 && var10 < class517.field7391) {
                        if ((arg2 == null || arg0.field7710 < arg3 || arg2[arg0.field7710][var9][var10] != arg4) && arg0.method1637(-1) && !arg0.method1638(-107, class711.field10005)) {
                            return false;
                        }
                        if (!arg1 && var9 >= class282.field4335 - 16 && var9 <= class282.field4335 + 16 && var10 >= class301.field4521 - 16 && var10 <= class301.field4521 + 16) {
                            if (class437.field6253) {
                                class137.field1790[class449.field6435++].method698((byte) -78, arg0);
                                class449.field6435 %= class347.field5092;
                            } else {
                                arg0.method257(class711.field10005, 106);
                            }
                        }
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(B)V")
    public final void method3836(byte arg0) {
        if (arg0 > -25) {
            this.field9641 = null;
        }
        ++field9643;
        super.field3123 = class109.method731(104) + 500L | super.field3123 & Long.MIN_VALUE;
        class297.field4474.method2475(this, -19680);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(Z)J")
    public final long method3837(boolean arg0) {
        if (!arg0) {
            this.field9649 = -99;
        }
        ++field9644;
        return super.field7577 & 72057594037927935L;
    }

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "(B)J")
    public final long method3838(byte arg0) {
        int var2 = -9 % ((-38 - arg0) / 33);
        ++field9648;
        return super.field3123 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(IJ)V")
    public class678(int arg0, long arg1) {
        super.field7577 = (long) arg0 << 56 | arg1;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
    public static final void method3839(int arg0) {
        if (arg0 != 0) {
            method3832(-0.11527143225796833D, -36);
        }
        if (class372.method2307((byte) 45)) {
            if (class543.field7607 == null) {
                class426.method2535(0);
            }
            class2.field20 = 0;
            class179.field2711 = true;
        }
        ++field9642;
    }
}
