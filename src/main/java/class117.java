import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class117 {

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "Lvm;")
    private class589 field1649 = new class589();

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "I")
    private int field1656;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    private int field1653;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "Llb;")
    private class465 field1661;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field1654;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field1655;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field1657;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public static int field1660;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "Ln;")
    public static class17 field1645;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Loa;")
    public static class597 field1641;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V", line = 3)
    public final void method834(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field1649 = null;
        }
        if (class644.field9374 != null) {
            for (class216 var3 = (class216) this.field1649.method3505(110); var3 != null; var3 = (class216) this.field1649.method3501((byte) 24)) {
                if (var3.method854((byte) 125)) {
                    if (var3.method855(-91) == null) {
                        var3.method2457(arg1 ^ 0xFFFFDF1A);
                        var3.method2987(-1);
                        this.field1653++;
                    }
                } else if ((long) arg0 < ++var3.field7109) {
                    class216 var4 = class644.field9374.method2120(22608, var3);
                    this.field1661.method2797(-4234, var4, var3.field5651);
                    class324.method1947(var4, (byte) 28, var3);
                    var3.method2457(-8422);
                    var3.method2987(-1);
                }
            }
        }
        field1647++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BJLjava/lang/Object;)V", line = 53)
    public final void method835(byte arg0, long arg1, Object arg2) {
        this.method836(1, -1, arg1, arg2);
        field1646++;
        if (arg0 < 115) {
            this.field1661 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIJLjava/lang/Object;)V", line = 65)
    private final void method836(int arg0, int arg1, long arg2, Object arg3) {
        field1644++;
        if (this.field1656 < arg0) {
            throw new IllegalStateException("s>cs");
        }
        if (arg1 != -1) {
            method841(-63, null);
        }
        this.method848(arg2, -102);
        this.field1653 -= arg0;
        while (this.field1653 < 0) {
            class216 var7 = (class216) this.field1649.method3506(~arg1);
            this.method844(-31191, var7);
        }
        class526 var6 = new class526(arg3, arg0);
        this.field1661.method2797(arg1 ^ 0x1089, var6, arg2);
        this.field1649.method3500(var6, false);
        var6.field7109 = 0L;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V", line = 95)
    public final void method837(int arg0) {
        this.field1649.method3504((byte) 74);
        field1642++;
        if (arg0 > 124) {
            this.field1661.method2800(0);
            this.field1653 = this.field1656;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Z)I", line = 111)
    public final int method838(boolean arg0) {
        field1651++;
        int var2 = 0;
        for (class216 var3 = (class216) this.field1649.method3505(-81); var3 != null; var3 = (class216) this.field1649.method3501((byte) 12)) {
            if (!var3.method854((byte) 125)) {
                var2++;
            }
        }
        if (!arg0) {
            method839((byte) 102);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V", line = 141)
    public static void method839(byte arg0) {
        if (arg0 != 40) {
            field1648 = 64;
        }
        field1645 = null;
        field1641 = null;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)I", line = 152)
    public final int method840(int arg0) {
        field1657++;
        if (arg0 != 28024) {
            this.method837(-117);
        }
        return this.field1656;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[[[Lnj;)V", line = 169)
    public static final void method841(int arg0, class205[][][] arg1) {
        field1658++;
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class205[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class205 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field3045 instanceof class231) {
                            ((class231) var6.field3045).method172(arg0 ^ 0x68);
                        }
                        if (var6.field3040 instanceof class231) {
                            ((class231) var6.field3040).method172(124);
                        }
                        if (var6.field3050 instanceof class231) {
                            ((class231) var6.field3050).method172(122);
                        }
                        if (var6.field3047 instanceof class231) {
                            ((class231) var6.field3047).method172(124);
                        }
                        if (var6.field3037 instanceof class231) {
                            ((class231) var6.field3037).method172(126);
                        }
                        for (class636 var7 = var6.field3029; var7 != null; var7 = var7.field9302) {
                            class577 var8 = var7.field9299;
                            if (var8 instanceof class231) {
                                ((class231) var8).method172(111);
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 1) {
            method841(6, null);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IJ)Ljava/lang/Object;", line = 243)
    public final Object method842(int arg0, long arg1) {
        if (arg0 != 0) {
            this.method842(62, 81L);
        }
        field1652++;
        class216 var4 = (class216) this.field1661.method2799(arg1, true);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method855(-89);
        if (var5 == null) {
            var4.method2457(-8422);
            var4.method2987(~arg0);
            this.field1653 += var4.field3169;
            return null;
        }
        if (var4.method854((byte) 125)) {
            class526 var6 = new class526(var5, var4.field3169);
            this.field1661.method2797(arg0 - 4234, var6, var4.field5651);
            this.field1649.method3500(var6, false);
            var6.field7109 = 0L;
            var4.method2457(-8422);
            var4.method2987(-1);
        } else {
            this.field1649.method3500(var4, false);
            var4.field7109 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 286)
    public final Object method843(int arg0) {
        field1650++;
        if (arg0 != 0) {
            field1648 = 86;
        }
        class216 var2 = (class216) this.field1661.method2798((byte) -54);
        while (var2 != null) {
            Object var3 = var2.method855(arg0 - 92);
            if (var3 != null) {
                return var3;
            }
            class216 var4 = var2;
            var2 = (class216) this.field1661.method2806(true);
            var4.method2457(-8422);
            var4.method2987(-1);
            this.field1653 += var2.field3169;
        }
        return null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILpd;)V", line = 319)
    private final void method844(int arg0, class216 arg1) {
        if (arg0 != -31191) {
            return;
        }
        if (arg1 != null) {
            arg1.method2457(-8422);
            arg1.method2987(-1);
            this.field1653 += arg1.field3169;
        }
        field1660++;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)Ljava/lang/Object;", line = 336)
    public final Object method845(int arg0) {
        if (arg0 != 0) {
            this.method838(false);
        }
        field1655++;
        class216 var2 = (class216) this.field1661.method2806(true);
        while (var2 != null) {
            Object var3 = var2.method855(-89);
            if (var3 != null) {
                return var3;
            }
            class216 var4 = var2;
            var2 = (class216) this.field1661.method2806(true);
            var4.method2457(-8422);
            var4.method2987(-1);
            this.field1653 += var2.field3169;
        }
        return null;
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)V", line = 367)
    public final void method846(int arg0) {
        field1640++;
        if (arg0 != 0) {
            this.field1661 = null;
        }
        for (class216 var2 = (class216) this.field1649.method3505(86); var2 != null; var2 = (class216) this.field1649.method3501((byte) 97)) {
            if (var2.method854((byte) 125)) {
                var2.method2457(-8422);
                var2.method2987(-1);
                this.field1653 += var2.field3169;
            }
        }
    }

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "(I)I", line = 394)
    public final int method847(int arg0) {
        field1659++;
        if (arg0 != 0) {
            this.field1661 = null;
        }
        return this.field1653;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(JI)V", line = 405)
    private final void method848(long arg0, int arg1) {
        if (arg1 >= -76) {
            this.method838(true);
        }
        field1654++;
        class216 var4 = (class216) this.field1661.method2799(arg0, true);
        this.method844(-31191, var4);
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(I)V", line = 421)
    public class117(int arg0) {
        this.field1656 = arg0;
        this.field1653 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field1661 = new class465(var2);
    }
}
