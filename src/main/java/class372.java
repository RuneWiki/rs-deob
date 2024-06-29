import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kja")
public class class372 extends class204 {

    @OriginalMember(owner = "client!kja", name = "k", descriptor = "I")
    public static int field5347 = -1;

    @OriginalMember(owner = "client!kja", name = "h", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!kja", name = "i", descriptor = "I")
    public static int field5345;

    @OriginalMember(owner = "client!kja", name = "l", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!kja", name = "m", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!kja", name = "n", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!kja", name = "o", descriptor = "I")
    public static int field5351;

    @OriginalMember(owner = "client!kja", name = "p", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!kja", name = "q", descriptor = "I")
    public static int field5353;

    @OriginalMember(owner = "client!kja", name = "r", descriptor = "I")
    public static int field5354;

    @OriginalMember(owner = "client!kja", name = "t", descriptor = "I")
    public static int field5356;

    @OriginalMember(owner = "client!kja", name = "j", descriptor = "[I")
    public static int[] field5346;

    @OriginalMember(owner = "client!kja", name = "s", descriptor = "[I")
    public static int[] field5355;

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(II)I", line = 3)
    public final int method487(int arg0, int arg1) {
        ++field5348;
        int var3 = -35 / ((-57 - arg1) / 60);
        if (super.field2853.method3505(124)) {
            return 3;
        } else {
            return ~super.field2853.field8506.method1732((byte) -98) == -1 ? 3 : 1;
        }
    }

    @OriginalMember(owner = "client!kja", name = "c", descriptor = "(I)Z", line = 23)
    public final boolean method2311(int arg0) {
        ++field5349;
        if (super.field2853.method3505(123)) {
            return false;
        } else {
            int var2 = 86 / ((-13 - arg0) / 44);
            return super.field2853.field8506.method1732((byte) -98) != 0;
        }
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(III)Z", line = 40)
    public static final boolean method2312(int arg0, int arg1, int arg2) {
        ++field5344;
        if (arg2 != 33) {
            field5346 = null;
        }
        return ~(arg0 & 33) != -1;
    }

    @OriginalMember(owner = "client!kja", name = "<init>", descriptor = "(ILfs;)V", line = 51)
    public class372(int arg0, class607 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!kja", name = "d", descriptor = "(II)V", line = 59)
    public final void method488(int arg0, int arg1) {
        ++field5345;
        if (arg1 > -105) {
            method2312(12, 118, 93);
        }
        super.field2852 = arg0;
    }

    @OriginalMember(owner = "client!kja", name = "b", descriptor = "(B)V", line = 70)
    public static void method2313(byte arg0) {
        if (arg0 < 87) {
            method2312(-8, -123, 65);
        }
        field5355 = null;
        field5346 = null;
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(B)I", line = 84)
    public final int method490(byte arg0) {
        if (arg0 < 83) {
            this.method486(-48);
        }
        ++field5350;
        return 2;
    }

    @OriginalMember(owner = "client!kja", name = "<init>", descriptor = "(Lfs;)V", line = 100)
    public class372(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(IIIII[B)Z", line = 103)
    public static final boolean method2314(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        ++field5356;
        boolean var6 = true;
        class511 var7 = new class511(arg5);
        int var8 = -1;
        label68: while (true) {
            int var9 = var7.method3041(-54);
            if (~var9 == -1) {
                int var20 = 44 / ((arg4 - -41) / 44);
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class286 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method3043(-31927);
                                        if (~var19 == -1) {
                                            continue label68;
                                        }
                                        var7.method3013(-109);
                                    }
                                    int var12 = var7.method3043(-31927);
                                    if (var12 == 0) {
                                        continue label68;
                                    }
                                    var10 += var12 + -1;
                                    int var13 = 63 & var10;
                                    int var14 = (4056 & var10) >> 6;
                                    var15 = var7.method3013(-109) >> 2;
                                    var16 = arg0 + var14;
                                    var17 = arg2 + var13;
                                } while (var16 <= 0);
                            } while (var17 <= 0);
                        } while (~(arg1 - 1) >= ~var16);
                    } while (~var17 <= ~(arg3 + -1));
                    var18 = class390.field5558.method3065(92, var8);
                } while (~var15 == -23 && ~class688.field9602.field8508.method491((byte) -98) == -1 && ~var18.field4137 == -1 && ~var18.field4138 != -2 && !var18.field4205);
                var11 = true;
                if (!var18.method1890(-10609)) {
                    ++class483.field6687;
                    var6 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kja", name = "a", descriptor = "(I)V", line = 185)
    public final void method486(int arg0) {
        ++field5353;
        if (super.field2853.method3505(126)) {
            super.field2852 = 0;
        }
        if (arg0 == -4591) {
            if (~super.field2853.field8506.method1732((byte) -98) == -1) {
                super.field2852 = 0;
            }
            if (super.field2852 < 0 || ~super.field2852 < -3) {
                super.field2852 = this.method490((byte) 112);
            }
        }
    }

    @OriginalMember(owner = "client!kja", name = "c", descriptor = "(B)I", line = 206)
    public final int method2315(byte arg0) {
        if (arg0 != -98) {
            return -92;
        } else {
            ++field5351;
            return super.field2852;
        }
    }
}
