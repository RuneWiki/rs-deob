import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class255 {

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "Lgm;")
    private class108 field3914 = new class108();

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    private int field3908;

    @OriginalMember(owner = "client!ol", name = "m", descriptor = "I")
    private int field3918;

    @OriginalMember(owner = "client!ol", name = "n", descriptor = "Lkea;")
    private class213 field3919;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field3910;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!ol", name = "l", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!ol", name = "r", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!ol", name = "k", descriptor = "Lqca;")
    public static class100 field3916;

    @OriginalMember(owner = "client!ol", name = "o", descriptor = "Ljava/awt/Image;")
    public static Image field3920;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V", line = 3)
    public final void method1696(int arg0) {
        field3906++;
        for (class472 var2 = (class472) this.field3914.method849((byte) 125); var2 != null; var2 = (class472) this.field3914.method854((byte) 99)) {
            if (var2.method2776((byte) -76)) {
                var2.method3678(arg0 - 4);
                var2.method2258((byte) 114);
                this.field3908 += var2.field6747;
            }
        }
        if (arg0 != 3) {
            this.method1707(null, (byte) -95);
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljq;Z)V", line = 30)
    private final void method1697(class472 arg0, boolean arg1) {
        if (arg1) {
            field3916 = null;
        }
        field3922++;
        if (arg0 != null) {
            arg0.method3678(-1);
            arg0.method2258((byte) 118);
            this.field3908 += arg0.field6747;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IB)V", line = 52)
    public final void method1698(int arg0, byte arg1) {
        if (class630.field8809 != null) {
            for (class472 var3 = (class472) this.field3914.method849((byte) 48); var3 != null; var3 = (class472) this.field3914.method854((byte) 98)) {
                if (var3.method2776((byte) -76)) {
                    if (var3.method2777(14) == null) {
                        var3.method3678(-1);
                        var3.method2258((byte) 115);
                        this.field3908 += var3.field6747;
                    }
                } else if (++var3.field5344 > (long) arg0) {
                    class472 var4 = class630.field8809.method1618(var3, (byte) -56);
                    this.field3919.method1403((byte) -18, var4, var3.field9386);
                    class522.method3005((byte) 126, var4, var3);
                    var3.method3678(-1);
                    var3.method2258((byte) 125);
                }
            }
        }
        field3913++;
        int var5 = 88 % ((arg1 - 69) / 46);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z)I", line = 99)
    public final int method1699(boolean arg0) {
        field3917++;
        return arg0 ? -64 : this.field3908;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V", line = 119)
    public final void method1700(int arg0) {
        this.field3914.method846((byte) 121);
        if (arg0 >= 97) {
            field3909++;
            this.field3919.method1409((byte) 119);
            this.field3908 = this.field3918;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lqt;Z)Ljava/lang/Object;", line = 134)
    public final Object method1701(class589 arg0, boolean arg1) {
        if (!arg1) {
            return null;
        }
        field3915++;
        long var3 = arg0.method740(22503);
        for (class472 var5 = (class472) this.field3919.method1405(var3, (byte) -96); var5 != null; var5 = (class472) this.field3919.method1411((byte) 75)) {
            if (var5.field6746.method741(arg0, -3267)) {
                Object var6 = var5.method2777(14);
                if (var6 != null) {
                    if (var5.method2776((byte) -76)) {
                        class565 var7 = new class565(arg0, var6, var5.field6747);
                        this.field3919.method1403((byte) -18, var7, var5.field9386);
                        this.field3914.method852(true, var7);
                        var7.field5344 = 0L;
                        var5.method3678(-1);
                        var5.method2258((byte) 124);
                    } else {
                        this.field3914.method852(true, var5);
                        var5.field5344 = 0L;
                    }
                    return var6;
                }
                var5.method3678(-1);
                var5.method2258((byte) 115);
                this.field3908 += var5.field6747;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "(I)V", line = 186)
    public static void method1702(int arg0) {
        int var1 = 14 % ((25 - arg0) / 45);
        field3920 = null;
        field3916 = null;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lft;ILjava/lang/String;ZZ)V", line = 197)
    public static final void method1703(class4 arg0, int arg1, String arg2, boolean arg3, boolean arg4) {
        field3921++;
        if (arg1 != 2) {
            field3916 = null;
        }
        if (!arg4) {
            class640.method3562(arg2, (byte) -14, 3, arg0);
            return;
        }
        if (class4.field22.startsWith("win") && arg0.field49) {
            String var5 = null;
            if (class421.field6129 != null) {
                var5 = class421.field6129.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class494 var6 = class640.method3562(arg2, (byte) -14, 0, arg0);
                class487.field6929 = var6;
                class159.field2302 = arg2;
                class401.field5905 = arg0;
                return;
            }
        }
        if (class4.field22.startsWith("mac")) {
            String var7 = null;
            if (class421.field6129 != null) {
                var7 = class421.field6129.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg3) {
                class640.method3562(arg2, (byte) -14, 1, arg0);
                return;
            }
        }
        class640.method3562(arg2, (byte) -14, 2, arg0);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)I", line = 264)
    public final int method1704(byte arg0) {
        field3923++;
        if (arg0 < 59) {
            this.method1705(null, -68, null, 115);
        }
        return this.field3918;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lqt;ILjava/lang/Object;I)V", line = 276)
    private final void method1705(class589 arg0, int arg1, Object arg2, int arg3) {
        field3907++;
        if (arg1 != 28392) {
            this.field3918 = -106;
        }
        if (arg3 > this.field3918) {
            throw new IllegalStateException("s>cs");
        }
        this.method1707(arg0, (byte) 104);
        this.field3908 -= arg3;
        while (this.field3908 < 0) {
            class472 var6 = (class472) this.field3914.method847(0);
            this.method1697(var6, false);
        }
        class565 var5 = new class565(arg0, arg2, arg3);
        this.field3919.method1403((byte) -18, var5, arg0.method740(22503));
        this.field3914.method852(true, var5);
        var5.field5344 = 0L;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Ljava/lang/Object;ILqt;)V", line = 305)
    public final void method1706(Object arg0, int arg1, class589 arg2) {
        field3911++;
        this.method1705(arg2, arg1 + 28391, arg0, arg1);
    }

    @OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(I)V", line = 315)
    public class255(int arg0) {
        this.field3908 = arg0;
        this.field3918 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3919 = new class213(var2);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lqt;B)V", line = 331)
    private final void method1707(class589 arg0, byte arg1) {
        field3910++;
        long var3 = arg0.method740(22503);
        int var5 = 58 / ((arg1 - 1) / 60);
        for (class472 var6 = (class472) this.field3919.method1405(var3, (byte) -17); var6 != null; var6 = (class472) this.field3919.method1411((byte) 110)) {
            if (var6.field6746.method741(arg0, -3267)) {
                this.method1697(var6, false);
                return;
            }
        }
    }
}
