import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class351 extends class115 {

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "I")
    private int field5121;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "Lfi;")
    public static class331 field5125 = new class331(128);

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
    public static int field5127 = 0;

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "I")
    public static int field5129 = 127;

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "F")
    public static float field5130;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
    public static int field5132;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        ++field5126;
        int[] var3 = super.field1340.method14(127, arg0);
        if (super.field1340.field35) {
            class408.method2569(var3, 0, class218.field2979, this.field5121);
        }
        return arg1 != 0 ? null : var3;
    }

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "(I)V")
    public static void method2235(int arg0) {
        field5125 = null;
        if (arg0 != -1) {
            field5129 = 82;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)I")
    public static final int method2236(int arg0, int arg1, int arg2) {
        if (arg2 < arg0) {
            int var3 = arg2;
            arg2 = arg0;
            arg0 = var3;
        }
        ++field5128;
        if (arg1 != 4700) {
            method2238((byte) 34);
        }
        while (~arg0 != -1) {
            int var4 = arg2 % arg0;
            arg2 = arg0;
            arg0 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "(I)V")
    public static final void method2237(int arg0) {
        class331 var1 = class350.field5107;
        synchronized (class350.field5107) {
            class350.field5107.method2043(-62);
        }
        ++field5122;
        class331 var2 = class422.field6060;
        synchronized (class422.field6060) {
            class422.field6060.method2043(-22);
            if (arg0 != 1023) {
                field5125 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "()V")
    public class351() {
        this(4096);
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(B)V")
    public static final void method2238(byte arg0) {
        ++field5131;
        class251.field3396.method2052(0);
        class97.field1094.method2052(0);
        if (arg0 < 77) {
            method2241(-75, 7);
        }
    }

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "(I)V")
    public static final void method2239(int arg0) {
        class219.field3002.method1206(-68);
        if (arg0 != -1) {
            method2235(-111);
        }
        ++field5123;
        class240.field3262.method1((byte) 120);
        class228.field3110.method1((byte) 122);
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(IIIII)V")
    public static final void method2240(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5118;
        if (~arg2 <= ~arg3) {
            for (int var5 = arg3; ~var5 > ~arg2; ++var5) {
                class318.field4522[var5][arg4] = arg0;
            }
        } else {
            for (int var6 = arg2; ~arg3 < ~var6; ++var6) {
                class318.field4522[var6][arg4] = arg0;
            }
        }
        if (arg1 > -124) {
            field5130 = -0.28839654F;
        }
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(II)I")
    public static final int method2241(int arg0, int arg1) {
        if (arg0 < 104) {
            return 72;
        } else {
            ++field5119;
            return arg1 & 1023;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLbk;I)V")
    public final void method149(byte arg0, class211 arg1, int arg2) {
        ++field5132;
        if (~arg2 == -1) {
            this.field5121 = (arg1.method1342((byte) -128) << 12) / 255;
        }
        if (arg0 < 83) {
            method2240(-28, 81, 18, 68, -97);
        }
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(II)V")
    public static final void method2242(int arg0, int arg1) {
        for (class359 var2 = class302.field4309.method1212(arg0 + 4005); var2 != null; var2 = class302.field4309.method1207(false)) {
            if ((long) arg1 == (var2.field5248 >> 48 & 65535L)) {
                var2.method2290((byte) 98);
            }
        }
        ++field5124;
        if (arg0 != -4113) {
            method2239(-52);
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(I)V")
    public class351(int arg0) {
        super(0, true);
        this.field5121 = 4096;
        this.field5121 = arg0;
    }
}
