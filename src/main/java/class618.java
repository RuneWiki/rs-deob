import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class618 {

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "Lsw;")
    private class641 field8935 = new class641(64);

    @OriginalMember(owner = "client!aca", name = "f", descriptor = "Ldn;")
    private class438 field8939;

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "Ldn;")
    private class438 field8936;

    @OriginalMember(owner = "client!aca", name = "e", descriptor = "I")
    public static int field8938 = 1;

    @OriginalMember(owner = "client!aca", name = "h", descriptor = "Lrg;")
    public static class548 field8941 = new class548(4, -1);

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "I")
    public static int field8934;

    @OriginalMember(owner = "client!aca", name = "d", descriptor = "I")
    public static int field8937;

    @OriginalMember(owner = "client!aca", name = "g", descriptor = "I")
    public static int field8940;

    @OriginalMember(owner = "client!aca", name = "i", descriptor = "I")
    public static int field8942;

    @OriginalMember(owner = "client!aca", name = "j", descriptor = "I")
    public static int field8943;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(IZ)V", line = 4)
    public static final void method3549(int arg0, boolean arg1) {
        field8943++;
        class557 var2 = class93.method564(16, -14073, arg0);
        var2.method3264(-1037624096);
        if (arg1) {
            method3549(126, false);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Llp;IIIII)V", line = 17)
    public static final void method3550(class329 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        arg0.field4296 = 0;
        label58: for (int var6 = arg2; var6 <= arg4; var6++) {
            label56: for (int var7 = arg3; var7 <= arg5; var7++) {
                long var8 = class209.field2558[arg1][var6][var7];
                long var10 = 0L;
                while (true) {
                    label51: while (true) {
                        if (var10 > 48L) {
                            continue label56;
                        }
                        int var12 = (int) (var8 >>> (int) var10 & 0xFFFFL);
                        if (var12 <= 0) {
                            continue label56;
                        }
                        class328 var13 = class602.field8699[var12 - 1];
                        for (int var14 = 0; var14 < arg0.field4296; var14++) {
                            if (arg0.field4293[var14] == var13.field4282) {
                                var10 += 16L;
                                continue label51;
                            }
                        }
                        arg0.field4293[arg0.field4296++] = var13.field4282;
                        if (arg0.field4296 == 4) {
                            break label58;
                        }
                        var10 += 16L;
                    }
                }
            }
        }
        for (int var15 = arg0.field4296; var15 < 4; var15++) {
            arg0.field4293[var15] = null;
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(B)V", line = 85)
    public static void method3551(byte arg0) {
        field8941 = null;
        int var1 = 126 % (arg0 / 59);
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(I)Z", line = 94)
    public static final boolean method3552(int arg0) {
        field8942++;
        if (class545.field8022) {
            try {
                if ((Boolean) class47.method249("showingVideoAd", class74.field873.field2014, (byte) 97)) {
                    return false;
                }
                return true;
            } catch (Throwable var2) {
            }
        }
        int var1 = -5 / ((-arg0 - 48) / 51);
        return true;
    }

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "(I)V", line = 126)
    public static final void method3553(int arg0) {
        if (class137.field1671 == 8) {
            class35.method200(4, 2);
        } else if (class137.field1671 == 4 || class137.field1671 == 5) {
            class35.method200(2, 2);
        } else if (class137.field1671 == 11) {
            class35.method200(2, arg0 - 65533);
        }
        if (arg0 != 65535) {
            field8941 = null;
        }
        field8940++;
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(IIIIIIIZ)V", line = 154)
    public static final void method3554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field8937++;
        int var8 = arg1 - 334;
        if (!arg7) {
            method3550(null, -61, 5, -83, -102, -72);
        }
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class562.field8275 - class515.field7271) * var8 / 100 + class515.field7271;
        int var10 = arg6 * var9 >> 8;
        int var11 = 16384 - arg3 & 0x3FFF;
        int var12 = 16384 - arg0 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class442.field6100[var11] * -var10 >> 15;
            var15 = class442.field6101[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class442.field6100[var12] * var15 >> 15;
            var15 = class442.field6101[var12] * var15 >> 15;
        }
        class39.field303 = arg5 - var15;
        class168.field2055 = arg0;
        class521.field7321 = arg4 - var14;
        class482.field6748 = arg3;
        class286.field3729 = arg2 - var13;
        class263.field3390 = 0;
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "(ILdn;Ldn;)V", line = 219)
    public class618(int arg0, class438 arg1, class438 arg2) {
        this.field8939 = arg1;
        this.field8936 = arg2;
        if (this.field8939 != null) {
            this.field8939.method2554(0, 125);
        }
        if (this.field8936 != null) {
            this.field8936.method2554(0, 125);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(II)Laea;", line = 240)
    public final class45 method3555(int arg0, int arg1) {
        field8934++;
        class45 var3 = (class45) this.field8935.method3682(0, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field8936.method2558(arg1 ^ 0xFFFFBE25, arg0 & 0x7FFF, 0);
        } else {
            var4 = this.field8939.method2558(100, arg0, 0);
        }
        class45 var5 = new class45();
        if (arg1 != -16831) {
            this.field8939 = null;
        }
        if (var4 != null) {
            var5.method238(-19212, new class374(var4));
        }
        if (arg0 >= 32768) {
            var5.method239((byte) -114);
        }
        this.field8935.method3684(var5, 0, (long) arg0);
        return var5;
    }
}
