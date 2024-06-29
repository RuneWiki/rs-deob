import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class300 extends class489 {

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "Lem;")
    public static class610 field3868 = new class610(3);

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!mu", name = "m", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!mu", name = "n", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!mu", name = "o", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!mu", name = "p", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!mu", name = "q", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)V", line = 7)
    public final void method6(int arg0) {
        ++field3873;
        super.field6956.method2177((byte) -62, false);
        if (arg0 != 0) {
            this.method6(33);
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "()V", line = 19)
    public static final void method1770() {
        byte var0 = 10;
        byte var1 = 30;
        if (class101.field1245 != 0 && class738.field10331 != null) {
            class618.field8660.method76(class485.field6888);
            for (int var2 = 0; var2 < class529.field7463.length; ++var2) {
                class618.field8660.method2667(class529.field7463[var2] + class237.field3063[var2], (byte) 113, class485.field6888[1], -256, class485.field6888[3] - class485.field6888[1]);
            }
            for (int var3 = 0; var3 < class113.field1392; ++var3) {
                class600 var11 = class384.field5349[var3];
                class618.field8660.method162(var11.field8337[0], var11.field8342[0], var11.field8336[0], class720.field10149);
                class618.field8660.method162(var11.field8337[1], var11.field8342[1], var11.field8336[1], class68.field935);
                class618.field8660.method162(var11.field8337[2], var11.field8342[2], var11.field8336[2], class733.field10241);
                class618.field8660.method162(var11.field8337[3], var11.field8342[3], var11.field8336[3], class43.field654);
                if (class720.field10149[2] != -1 && class68.field935[2] != -1 && class733.field10241[2] != -1 && class43.field654[2] != -1) {
                    int var12 = -65536;
                    if (var11.field8344 == 4) {
                        var12 = -16776961;
                    }
                    class618.field8660.method2671(class68.field935[1], class68.field935[0], class720.field10149[1], var12, class720.field10149[0], (byte) -113);
                    class618.field8660.method2671(class733.field10241[1], class733.field10241[0], class68.field935[1], var12, class68.field935[0], (byte) -110);
                    class618.field8660.method2671(class43.field654[1], class43.field654[0], class733.field10241[1], var12, class733.field10241[0], (byte) -106);
                    class618.field8660.method2671(class720.field10149[1], class720.field10149[0], class43.field654[1], var12, class43.field654[0], (byte) -109);
                    class618.field8660.method2671(class733.field10241[1], class733.field10241[0], class720.field10149[1], var12, class720.field10149[0], (byte) -127);
                }
            }
            class738.field10331.method2505(-256, -16777216, "Dynamic: " + class618.field8661 + "/" + 5000, var0, var1 + 45, 255);
            class738.field10331.method2505(-256, -16777216, "Total Opaque Onscreen: " + class141.field1675 + "/" + 10000, var0, var1 + 60, 255);
            class738.field10331.method2505(-256, -16777216, "Total Trans Onscreen: " + class400.field5553 + "/" + 5000, var0, var1 + 75, 255);
            class738.field10331.method2505(-256, -16777216, "Occluders: " + (class522.field7389 + class215.field2726) + " Active: " + class113.field1392, var0, var1 + 90, 255);
            class738.field10331.method2505(-256, -16777216, "Occluded: Ground:" + class408.field5748 + " Walls: " + class47.field689 + " CPs: " + class15.field208 + " Pixels: " + class540.field7599, var0, var1 + 105, 255);
            class738.field10331.method2505(-256, -16777216, "Occlude Calc Took: " + class553.field7763 / 1000L + "us", var0, var1 + 120, 255);
            if (class101.field1245 == 2 && class248.field3164 != null) {
                for (int var4 = 0; var4 < class248.field3164.length; ++var4) {
                    float var6 = (float) class248.field3164[var4];
                    float var7 = var6 / 4194304.0F;
                    if (var7 > 1.0F) {
                        var7 = 1.0F;
                    }
                    float var8 = var7 * 255.0F;
                    float var9 = 255.0F - var8;
                    int var10 = (int) var9;
                    class248.field3164[var4] = var10 | var10 << 8 | var10 << 16 | -16777216;
                }
                class712 var5 = class618.field8660.method2666(class597.field8284, class521.field7350, (byte) -48, class248.field3164, 0, class521.field7350);
                var5.method690(var0, 170, 1, 0, 0);
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "(Leq;)V", line = 102)
    public class300(class357 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(IZ)V", line = 105)
    public final void method9(int arg0, boolean arg1) {
        if (arg0 != -5) {
            field3868 = null;
        }
        ++field3871;
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(B)Z", line = 117)
    public final boolean method7(byte arg0) {
        if (arg0 < 95) {
            method1771(76, -38);
        }
        ++field3872;
        return true;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)V", line = 128)
    public static final void method1771(int arg0, int arg1) {
        ++field3869;
        class114 var2 = class124.field1474;
        synchronized (class124.field1474) {
            class124.field1474.method775(arg0 ^ -65535, arg1);
        }
        class114 var3 = class626.field8729;
        synchronized (class626.field8729) {
            if (arg0 == -65536) {
                class626.field8729.method775(1, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(BLkp;I)V", line = 144)
    public final void method12(byte arg0, class411 arg1, int arg2) {
        ++field3874;
        super.field6956.method2120(-1, arg1);
        if (arg0 > -66) {
            this.method10(-118, true);
        }
        super.field6956.method2153(120, arg2);
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)V", line = 156)
    public final void method8(int arg0, int arg1, int arg2) {
        if (arg2 == 40) {
            ++field3875;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(IZ)V", line = 168)
    public final void method10(int arg0, boolean arg1) {
        ++field3870;
        super.field6956.method2177((byte) -62, true);
        int var3 = 122 % ((-43 - arg0) / 37);
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)V", line = 178)
    public static void method1772(int arg0) {
        if (arg0 == -5975) {
            field3868 = null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "([BIIBII)V", line = 192)
    public static final void method1773(byte[] arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++field3876;
        if (arg2 < arg1) {
            int var6 = arg2 + arg5;
            int var7 = -arg2 + arg1 >> 2;
            while (true) {
                --var7;
                if (var7 < 0) {
                    if (arg3 != 1) {
                        method1770();
                    }
                    int var8 = 3 & -arg2 + arg1;
                    while (true) {
                        --var8;
                        if (var8 < 0) {
                            return;
                        }
                        arg0[var6++] = 1;
                    }
                }
                arg0[var6++] = 1;
                arg0[var6++] = 1;
                arg0[var6++] = 1;
                arg0[var6++] = 1;
            }
        }
    }
}
