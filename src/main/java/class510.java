import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class510 extends class305 {

    @OriginalMember(owner = "client!mq", name = "n", descriptor = "Lmia;")
    public static class63 field7261 = new class63(15, 4);

    @OriginalMember(owner = "client!mq", name = "i", descriptor = "I")
    public static int field7256;

    @OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
    public static int field7257;

    @OriginalMember(owner = "client!mq", name = "k", descriptor = "I")
    public static int field7258;

    @OriginalMember(owner = "client!mq", name = "l", descriptor = "I")
    public static int field7259;

    @OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
    public static int field7260;

    @OriginalMember(owner = "client!mq", name = "o", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!mq", name = "p", descriptor = "I")
    public static int field7263;

    @OriginalMember(owner = "client!mq", name = "q", descriptor = "I")
    public static int field7264;

    @OriginalMember(owner = "client!mq", name = "r", descriptor = "I")
    public static int field7265;

    @OriginalMember(owner = "client!mq", name = "s", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!mq", name = "t", descriptor = "I")
    public static int field7267;

    @OriginalMember(owner = "client!mq", name = "u", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!mq", name = "v", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V")
    public static void method3020(int arg0) {
        if (arg0 != 2) {
            method3027((short[][]) null, -37, (float[][]) null);
        }
        field7261 = null;
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lhb;)V")
    public class510(class728 arg0) {
        super(arg0);
        class59.method414(super.field4320, (byte) -65);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "([BI)[B")
    public static final byte[] method3021(byte[] arg0, int arg1) {
        ++field7268;
        if (arg1 > -106) {
            field7263 = -115;
        }
        if (arg0 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class319.method2022(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)Lcha;")
    public static final class218 method3022(int arg0) {
        ++field7260;
        if (arg0 != 96) {
            method3028((class645) null, -124);
        }
        return class691.field9552 < class124.field1669.length ? class124.field1669[class691.field9552++] : null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(III)Z")
    public static final boolean method3023(int arg0, int arg1, int arg2) {
        if (arg2 != 31169) {
            method3021((byte[]) null, -18);
        }
        ++field7264;
        return (arg1 & 2048) != 0;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)I")
    public final int method305(byte arg0) {
        ++field7266;
        if (arg0 != 68) {
            this.method305((byte) 36);
        }
        return super.field4323.method4104(54).method3296((byte) -123) < 96 ? 0 : 2;
    }

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "(I)Z")
    public final boolean method3024(int arg0) {
        ++field7262;
        if (arg0 != 2) {
            field7261 = null;
        }
        return ~super.field4323.method4104(113).method3296((byte) -120) <= -97;
    }

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "(B)V")
    public static final void method3025(byte arg0) {
        ++field7267;
        if (class201.field3017 == null) {
            class315 var1 = new class315();
            byte[] var2 = var1.method1994(128, (byte) 50, 16, 128);
            class201.field3017 = class597.method3477(false, var2, (byte) 118);
        }
        int var3 = -40 / ((20 - arg0) / 63);
        if (class364.field5260 == null) {
            class303 var4 = new class303();
            byte[] var5 = var4.method1911(16, 128, 100, 128);
            class364.field5260 = class597.method3477(false, var5, (byte) 113);
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)V")
    public final void method303(int arg0, int arg1) {
        if (arg0 != -27751) {
            field7261 = null;
        }
        super.field4320 = arg1;
        ++field7265;
        class59.method414(super.field4320, (byte) -65);
    }

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "(II)I")
    public final int method306(int arg0, int arg1) {
        ++field7258;
        if (arg0 != 31401) {
            this.method308((byte) -88);
        }
        return ~super.field4323.method4104(82).method3296((byte) -122) > -97 ? 3 : 1;
    }

    @OriginalMember(owner = "client!mq", name = "e", descriptor = "(I)I")
    public final int method3026(int arg0) {
        ++field7256;
        if (arg0 != 17503) {
            field7263 = -118;
        }
        return super.field4320;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "([[SI[[F)[[S")
    public static final short[][] method3027(short[][] arg0, int arg1, float[][] arg2) {
        ++field7259;
        for (int var3 = arg1; var3 < arg2.length; ++var3) {
            for (int var4 = 0; arg0[var3].length > var4; ++var4) {
                arg0[var3][var4] = (short) ((int) (arg2[var3][var4] * 16383.0F));
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)V")
    public final void method308(byte arg0) {
        ++field7269;
        if (arg0 >= -40) {
            method3023(5, 12, -122);
        }
        if (super.field4323.method4104(61).method3296((byte) -121) < 96) {
            super.field4320 = 0;
        }
        if (super.field4320 < 0 || super.field4320 > 2) {
            super.field4320 = this.method305((byte) 68);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lrg;I)Lkg;")
    public static final class273 method3028(class645 arg0, int arg1) {
        if (arg1 != 2) {
            field7261 = null;
        }
        ++field7257;
        return new class273(arg0.method3756(arg1 ^ 65538), arg0.method3756(65536), arg0.method3756(65536), arg0.method3756(65536), arg0.method3747((byte) -74), arg0.method3747((byte) -74), arg0.method3745(-6314));
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(ILhb;)V")
    public class510(int arg0, class728 arg1) {
        super(arg0, arg1);
        class59.method414(super.field4320, (byte) -65);
    }
}
