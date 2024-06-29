import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class654 extends class331 {

    @OriginalMember(owner = "client!gr", name = "q", descriptor = "Lmq;")
    public static class78 field9001 = new class78(46, 6);

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
    public static int field8997;

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "I")
    public static int field8998;

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "I")
    public static int field8999;

    @OriginalMember(owner = "client!gr", name = "p", descriptor = "I")
    public static int field9000;

    @OriginalMember(owner = "client!gr", name = "r", descriptor = "I")
    public static int field9002;

    @OriginalMember(owner = "client!gr", name = "s", descriptor = "I")
    public static int field9003;

    @OriginalMember(owner = "client!gr", name = "t", descriptor = "I")
    public static int field9004;

    @OriginalMember(owner = "client!gr", name = "u", descriptor = "I")
    public static int field9005;

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "I")
    public static int field9006;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(I)V", line = 3)
    public static void method3529(int arg0) {
        field9001 = null;
        if (arg0 != 46) {
            field9001 = null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(II)I", line = 13)
    public final int method222(int arg0, int arg1) {
        ++field9005;
        if (super.field4203.method344((byte) -109)) {
            return 3;
        } else {
            if (arg1 != 1) {
                field9001 = null;
            }
            return 1;
        }
    }

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "(II)V", line = 31)
    public final void method227(int arg0, int arg1) {
        super.field4202 = arg1;
        if (arg0 > 113) {
            ++field8998;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BLtn;)Lgn;", line = 43)
    public static final class565 method3530(byte arg0, class179 arg1) {
        ++field9004;
        int var2 = arg1.method1107(false);
        class761 var3 = class412.method2441(arg0 + -215)[arg1.method1094(255)];
        class407 var4 = class237.method1481(117)[arg1.method1094(255)];
        int var5 = arg1.method1137((byte) -114);
        if (arg0 != 126) {
            field9000 = 111;
        }
        int var6 = arg1.method1137((byte) -74);
        return new class565(var2, var3, var4, var5, var6);
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lts;)V", line = 64)
    public class654(class41 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V", line = 67)
    public final void method224(int arg0) {
        if (arg0 != -1959) {
            method3529(-16);
        }
        if (super.field4203.method344((byte) 99)) {
            super.field4202 = 0;
        }
        ++field8999;
        if (~super.field4202 != -2 && super.field4202 != 0) {
            super.field4202 = this.method226((byte) 13);
        }
    }

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "(B)I", line = 86)
    public final int method3531(byte arg0) {
        if (arg0 >= -119) {
            method3530((byte) -128, (class179) null);
        }
        ++field9003;
        return super.field4202;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Llea;BZ)V", line = 97)
    public static final void method3532(class546 arg0, byte arg1, boolean arg2) {
        ++field9002;
        if (class573.field8011 < 400) {
            if (class339.field4374 == arg0) {
                if (class138.field1656 && ~(16 & class337.field4352) != -1) {
                    class425.method2528(47, class741.field10370 + " -> <col=ffffff>" + class586.field8162.method3261(class416.field5920, (byte) 82), -1, true, -109, (long) arg0.field354, class556.field7800, 0L, false, 0, 0, false, class586.field8192);
                    ++class170.field2243;
                }
            } else {
                String var3;
                if (arg0.field7675 != 0) {
                    if (~arg0.field7675 == 0) {
                        var3 = arg0.method3101(124, true);
                    } else {
                        var3 = arg0.method3101(120, true) + " (" + class586.field8154.method3261(class416.field5920, (byte) 82) + arg0.field7675 + ")";
                    }
                } else {
                    boolean var4 = true;
                    if (class339.field4374.field7658 != -1 && arg0.field7658 != -1) {
                        int var5 = class339.field4374.field7658 < arg0.field7658 ? class339.field4374.field7658 : arg0.field7658;
                        int var6 = class339.field4374.field7702 - arg0.field7702;
                        if (var6 < 0) {
                            var6 = -var6;
                        }
                        if (var6 > var5) {
                            var4 = false;
                        }
                    }
                    String var7 = class737.field10321 == class702.field9902 ? class586.field8155.method3261(class416.field5920, (byte) 82) : class586.field8153.method3261(class416.field5920, (byte) 82);
                    if (arg0.field7662 <= arg0.field7702) {
                        var3 = arg0.method3101(116, true) + (!var4 ? "<col=ffffff>" : class714.method3956(arg0.field7702, class339.field4374.field7702, arg1 ^ 20529)) + " (" + var7 + arg0.field7702 + ")";
                    } else {
                        var3 = arg0.method3101(93, true) + (var4 ? class714.method3956(arg0.field7702, class339.field4374.field7702, 20543) : "<col=ffffff>") + " (" + var7 + arg0.field7702 + "+" + (arg0.field7662 - arg0.field7702) + ")";
                    }
                }
                if (arg1 == 14) {
                    if (class138.field1656 && !arg2 && ~(class337.field4352 & 8) != -1) {
                        ++class613.field8548;
                        class425.method2528(46, class741.field10370 + " -> <col=ffffff>" + var3, -1, true, arg1 ^ 66, (long) arg0.field354, class556.field7800, (long) arg0.field354, false, 0, 0, false, class586.field8192);
                    }
                    if (arg2) {
                        class425.method2528(-1, "", 0, false, 39, (long) arg0.field354, "<col=cccccc>" + var3, 0L, true, 0, 0, false, -1);
                    } else {
                        for (int var8 = 7; var8 >= 0; --var8) {
                            if (class542.field7635[var8] != null) {
                                short var10 = 0;
                                if (class702.field9902 == class400.field5535 && class542.field7635[var8].equalsIgnoreCase(class586.field8148.method3261(class416.field5920, (byte) 82))) {
                                    if (arg0.field7702 > class339.field4374.field7702) {
                                        var10 = 2000;
                                    }
                                    if (class339.field4374.field7695 != 0 && arg0.field7695 != 0) {
                                        if (class339.field4374.field7695 == arg0.field7695) {
                                            var10 = 2000;
                                        } else {
                                            var10 = 0;
                                        }
                                    }
                                } else if (class618.field8655[var8]) {
                                    var10 = 2000;
                                }
                                short var11 = (short) (class386.field5383[var8] + var10);
                                int var12 = class166.field2123[var8] != -1 ? class166.field2123[var8] : class423.field6015;
                                ++class547.field7706;
                                class425.method2528(var11, "<col=ffffff>" + var3, -1, true, 100, (long) arg0.field354, class542.field7635[var8], (long) arg0.field354, false, 0, 0, false, var12);
                            }
                        }
                    }
                    if (!arg2) {
                        for (class718 var9 = (class718) class565.field7906.method3111(78); var9 != null; var9 = (class718) class565.field7906.method3116(-68)) {
                            if (~var9.field10134 == -49) {
                                var9.field10123 = "<col=ffffff>" + var3;
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)I", line = 248)
    public final int method226(byte arg0) {
        ++field9006;
        if (arg0 != 13) {
            method3530((byte) 51, (class179) null);
        }
        return 1;
    }

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "(B)Z", line = 265)
    public final boolean method3533(byte arg0) {
        if (arg0 < 103) {
            field9000 = 40;
        }
        ++field8997;
        return !super.field4203.method344((byte) -86);
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(ILts;)V", line = 281)
    public class654(int arg0, class41 arg1) {
        super(arg0, arg1);
    }
}
