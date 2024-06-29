import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class139 extends class322 {

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "[F")
    public static float[] field2013 = new float[2];

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field2009;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "J")
    public static long field2011;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)I")
    public final int method17(byte arg0) {
        int var2 = -32 / ((70 - arg0) / 51);
        ++field2016;
        return 0;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)V")
    public final void method22(int arg0, int arg1) {
        super.field4451 = arg1;
        ++field2012;
        if (arg0 != 0) {
            this.method982(false);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(B)J")
    public static final long method980(byte arg0) {
        ++field2010;
        if (arg0 != 84) {
            method984(71, (byte) -75);
        }
        return class145.field2086.method160((byte) 79);
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lch;)V")
    public class139(class463 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
    public static void method981(int arg0) {
        field2013 = null;
        if (arg0 > -22) {
            field2013 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
    public final void method23(boolean arg0) {
        ++field2015;
        if (arg0) {
            field2013 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(Z)I")
    public final int method982(boolean arg0) {
        ++field2009;
        if (arg0) {
            this.method23(true);
        }
        return super.field4451;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILjava/awt/Component;IBLvc;)Ljba;")
    public static final class398 method983(int arg0, Component arg1, int arg2, byte arg3, class316 arg4) {
        ++field2008;
        if (~class68.field831 == -1) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class398 var5 = (class398) Class.forName("uca").newInstance();
                var5.field5603 = new int[256 * (class673.field9127 ? 2 : 1)];
                var5.field5632 = arg0;
                var5.method2021(arg1);
                var5.field5634 = (arg0 & -1024) + 1024;
                if (var5.field5634 > 16384) {
                    var5.field5634 = 16384;
                }
                int var6 = 63 / ((-43 - arg3) / 33);
                var5.method2020(var5.field5634);
                if (~class155.field2172 < -1 && class534.field7515 == null) {
                    class534.field7515 = new class518();
                    class534.field7515.field7375 = arg4;
                    arg4.method2046(2, class534.field7515, class155.field2172);
                }
                if (class534.field7515 != null) {
                    if (class534.field7515.field7372[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class534.field7515.field7372[arg2] = var5;
                }
                return var5;
            } catch (Throwable var9) {
                try {
                    class311 var7 = new class311(arg4, arg2);
                    var7.field5603 = new int[(!class673.field9127 ? 1 : 2) * 256];
                    var7.field5632 = arg0;
                    var7.method2021(arg1);
                    var7.field5634 = 16384;
                    var7.method2020(var7.field5634);
                    if (~class155.field2172 < -1 && class534.field7515 == null) {
                        class534.field7515 = new class518();
                        class534.field7515.field7375 = arg4;
                        arg4.method2046(2, class534.field7515, class155.field2172);
                    }
                    if (class534.field7515 != null) {
                        if (class534.field7515.field7372[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class534.field7515.field7372[arg2] = var7;
                    }
                    return var7;
                } catch (Throwable var8) {
                    return new class398();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(ILch;)V")
    public class139(int arg0, class463 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)V")
    public static final void method984(int arg0, byte arg1) {
        ++field2017;
        class592 var2 = class682.method3825(-652872096, 4, arg0);
        var2.method3350(0);
        if (arg1 <= 1) {
            method981(29);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)I")
    public final int method19(int arg0, int arg1) {
        ++field2007;
        return arg1 <= 10 ? 12 : 1;
    }
}
