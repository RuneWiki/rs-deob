import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class118 extends class287 {

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "[[I")
    public static int[][] field1639 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "Lgca;")
    public static class209 field1631 = new class209(64);

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public int field1629;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field1632;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "I")
    public int field1634;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    public int field1636;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    public static int field1637;

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "Ljava/lang/String;")
    public String field1638;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 3)
    public final void method771(int arg0) {
        if (arg0 != -30559) {
            this.field1629 = -16;
        }
        ++field1632;
        super.field3778 |= Long.MIN_VALUE;
        if (~this.method777((byte) 75) == -1L) {
            class644.field9138.method666(8192, this);
        }
    }

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "(I)V", line = 22)
    public static void method772(int arg0) {
        if (arg0 >= -8) {
            method775((String) null, (byte) 125);
        }
        field1639 = null;
        field1631 = null;
    }

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "(I)I", line = 33)
    public final int method773(int arg0) {
        ++field1633;
        if (arg0 <= 11) {
            field1642 = 26;
        }
        return (int) super.field7166;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIZLjava/lang/String;)V", line = 45)
    public static final void method774(int arg0, int arg1, boolean arg2, String arg3) {
        class56.method381(-12764);
        ++field1640;
        class361.method2035(arg0 + 17574);
        class18.method93(-21347);
        class735.method4079(false, arg3, arg2, arg1);
        if (arg0 != -25484) {
            method775((String) null, (byte) -113);
        }
        class154.method981(true);
        class533.method3182(class96.field1401, (byte) 99);
        class717.method4031(class96.field1401, (byte) 50);
        class359.method2025(-2301, class96.field1401, class323.field4156);
        class713.method4017((byte) -104);
        class375.method2264(-37, class209.field2979);
        class330.method1918(7);
        class469.method2794(false);
        if (~class213.field3004 == -4) {
            class647.method3754(4, true);
        } else if (class213.field3004 == 7) {
            class647.method3754(8, true);
        } else if (class213.field3004 == 10) {
            class647.method3754(11, true);
        } else {
            if (~class213.field3004 == -2 || class213.field3004 == 2) {
                class622.method3641(true);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(Ljava/lang/String;B)V", line = 84)
    public static final void method775(String arg0, byte arg1) {
        ++field1635;
        if (arg0 != null) {
            if (arg0.startsWith("*")) {
                arg0 = arg0.substring(1);
            }
            String var2 = class53.method357(arg0, 1);
            if (var2 != null) {
                if (arg1 != 43) {
                    field1642 = -61;
                }
                for (int var3 = 0; ~var3 > ~class458.field6302; ++var3) {
                    String var4 = class46.field674[var3];
                    if (var4.startsWith("*")) {
                        var4 = var4.substring(1);
                    }
                    String var5 = class53.method357(var4, 1);
                    if (var5 != null && var5.equals(var2)) {
                        --class458.field6302;
                        for (int var6 = var3; ~class458.field6302 < ~var6; ++var6) {
                            class46.field674[var6] = class46.field674[var6 + 1];
                            class144.field1996[var6] = class144.field1996[var6 + 1];
                            class270.field3639[var6] = class270.field3639[var6 - -1];
                            class545.field7697[var6] = class545.field7697[var6 + 1];
                            class272.field3671[var6] = class272.field3671[var6 + 1];
                        }
                        ++class528.field7379;
                        class666.field9387 = class564.field8023;
                        class120 var7 = class292.method1716(class608.field8668, true, class262.field3575);
                        var7.field1653.method184(class678.method3882(arg0, (byte) 109), arg1 + -73);
                        var7.field1653.method187(arg0, (byte) -100);
                        class471.method2805(126, var7);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)I", line = 148)
    public final int method776(byte arg0) {
        int var2 = 35 / ((arg0 - -75) / 49);
        ++field1641;
        return (int) (255L & super.field7166 >>> 32);
    }

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "(B)J", line = 160)
    public final long method777(byte arg0) {
        if (arg0 != 75) {
            return -3L;
        } else {
            ++field1637;
            return Long.MAX_VALUE & super.field3778;
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(II)V", line = 182)
    public class118(int arg0, int arg1) {
        super.field7166 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "(I)V", line = 190)
    public final void method778(int arg0) {
        super.field3778 = class224.method1457((byte) -62) + 500L | Long.MIN_VALUE & super.field3778;
        if (arg0 != 27970) {
            field1642 = -19;
        }
        ++field1630;
        class632.field9003.method666(arg0 ^ 19778, this);
    }
}
