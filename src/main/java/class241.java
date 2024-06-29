import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class241 extends class142 {

    @OriginalMember(owner = "client!gq", name = "P", descriptor = "F")
    public float field3329;

    @OriginalMember(owner = "client!gq", name = "L", descriptor = "F")
    public float field3325;

    @OriginalMember(owner = "client!gq", name = "O", descriptor = "Z")
    public boolean field3328;

    @OriginalMember(owner = "client!gq", name = "K", descriptor = "I")
    public int field3324;

    @OriginalMember(owner = "client!gq", name = "M", descriptor = "I")
    public int field3326;

    @OriginalMember(owner = "client!gq", name = "J", descriptor = "[S")
    public static short[] field3323 = new short[] { 6, 12, 3, 60, 49, 58, 45, 13 };

    @OriginalMember(owner = "client!gq", name = "Q", descriptor = "I")
    public static int field3330 = 0;

    @OriginalMember(owner = "client!gq", name = "I", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!gq", name = "N", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lpg;IIIZ[I)V", line = 6)
    public class241(class333 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        if (super.field1970 == 34037) {
            this.field3329 = (float) arg2;
            this.field3325 = (float) arg3;
            this.field3328 = false;
        } else {
            this.field3328 = true;
            this.field3329 = this.field3325 = 1.0F;
        }
        this.field3324 = arg3;
        this.field3326 = arg2;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIIIZ)V", line = 31)
    public static final void method1466(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        ++field3327;
        if (arg1 < 1) {
            arg1 = 1;
        }
        if (~arg3 > -2) {
            arg3 = 1;
        }
        int var6 = arg1 + -334;
        if (~var6 > -1) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (-class313.field4242 + class243.field3341) * var6 / 100 + class313.field4242;
        if (~class274.field3708 < ~var7) {
            var7 = class274.field3708;
        } else if (class518.field7615 < var7) {
            var7 = class518.field7615;
        }
        int var8 = arg1 * var7 * 512 / (arg3 * 334);
        if (~var8 > ~class51.field746) {
            short var9 = class51.field746;
            var7 = var9 * 334 * arg3 / (arg1 * 512);
            if (var7 > class518.field7615) {
                var7 = class518.field7615;
                int var10 = arg1 * var7 * 512 / (var9 * 334);
                int var11 = (arg3 - var10) / 2;
                if (arg5) {
                    class275.field3737.method477();
                    class275.field3737.method1712(arg1, 0, -16777216, var11, arg0, arg2);
                    class275.field3737.method1712(arg1, arg4 ^ -2731, -16777216, var11, arg0, arg2 + arg3 + -var11);
                }
                arg2 += var11;
                arg3 -= var11 * 2;
            }
        } else if (~class317.field4318 > ~var8) {
            short var12 = class317.field4318;
            var7 = var12 * 334 * arg3 / (arg1 * 512);
            if (class274.field3708 > var7) {
                var7 = class274.field3708;
                int var13 = var12 * 334 * arg3 / (var7 * 512);
                int var14 = (-var13 + arg1) / 2;
                if (arg5) {
                    class275.field3737.method477();
                    class275.field3737.method1712(var14, 0, -16777216, arg3, arg0, arg2);
                    class275.field3737.method1712(var14, 0, -16777216, arg3, arg0 + arg1 + -var14, arg2);
                }
                arg1 -= var14 * 2;
                arg0 += var14;
            }
        }
        if (arg4 != -2731) {
            field3323 = null;
        }
        class367.field5266 = (short) arg3;
        class185.field2743 = arg0;
        class211.field3008 = arg1 * var7 / 334;
        class510.field7460 = (short) arg1;
        class13.field142 = arg2;
    }

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "(B)V", line = 124)
    public static final void method1467(byte arg0) {
        ++field3322;
        if (arg0 != -77) {
            field3323 = null;
        }
        class505.field7387 = new class444[class41.field614.method2493((byte) -41)][];
        class302.field4121 = new class444[class41.field614.method2493((byte) -41)][];
        class210.field3004 = new boolean[class41.field614.method2493((byte) -41)];
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lpg;IIIIZ[BI)V", line = 137)
    public class241(class333 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field3326 = arg3;
        this.field3324 = arg4;
        if (super.field1970 == 34037) {
            this.field3325 = (float) arg4;
            this.field3328 = false;
            this.field3329 = (float) arg3;
        } else {
            this.field3328 = true;
            this.field3329 = this.field3325 = 1.0F;
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lpg;IIIIIIZ)V", line = 161)
    public class241(class333 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field3324 = arg4;
        this.field3328 = false;
        this.field3326 = arg3;
        this.field3329 = (float) arg3 / (float) arg5;
        this.field3325 = (float) arg4 / (float) arg6;
        this.method990(false, 1024, false);
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lpg;IIIIIZ)V", line = 180)
    public class241(class333 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field3324 = arg5;
        if (super.field1970 == 34037) {
            this.field3329 = (float) arg4;
            this.field3325 = (float) arg5;
            this.field3328 = false;
        } else {
            this.field3328 = true;
            this.field3329 = this.field3325 = 1.0F;
        }
        this.field3326 = arg4;
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lpg;IIII[I)V", line = 202)
    public class241(class333 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field3324 = arg2;
        this.field3326 = arg1;
        this.method991(arg5, true, arg2, (byte) 101, arg1, 0, 0, 0, 0);
        this.field3328 = false;
        this.field3329 = (float) arg1 / (float) arg3;
        this.field3325 = (float) arg2 / (float) arg4;
        this.method990(false, 1024, false);
    }

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)V", line = 216)
    public static void method1468(int arg0) {
        field3323 = null;
        if (arg0 != -6327) {
            field3330 = 117;
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lpg;IIIII[BI)V", line = 226)
    public class241(class333 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field3324 = arg3;
        this.field3326 = arg2;
        this.method996(0, false, arg2, arg7, true, 0, arg3, 0, 0, arg6);
        this.field3329 = (float) arg2 / (float) arg4;
        this.field3325 = (float) arg3 / (float) arg5;
        this.field3328 = false;
        this.method990(false, 1024, false);
    }
}
