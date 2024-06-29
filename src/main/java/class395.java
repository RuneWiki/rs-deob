import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class395 {

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "[[I")
    public static int[][] field5687 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field5686 = 0;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "[I")
    public static int[] field5692 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "Ljava/lang/String;")
    public static String field5694 = "wave:";

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "[I")
    public static int[] field5693 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public int field5680;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public int field5681;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public int field5683;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public int field5684;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public int field5685;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!sc", name = "k", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public int field5691;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)I", line = 5)
    public static final int method2466(int arg0, int arg1, int arg2) {
        field5689++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg0 != -22897) {
            return -32;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V", line = 45)
    public static final void method2467(int arg0) {
        class87.field970.method307((byte) 115);
        if (arg0 <= -1) {
            field5688++;
            class96.field1119.method391((byte) 114);
            class380.field5363.method391((byte) 114);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIILlo;)V", line = 59)
    public static final void method2468(int arg0, int arg1, int arg2, int arg3, class419 arg4) {
        field5682++;
        class70 var5 = arg4.method2606(0);
        int var6 = arg4.field6052 - arg4.field6075.field6358 & 0x3FFF;
        if (arg2 == -1) {
            if (var6 != 0 || arg4.field6081 > 25) {
                if (arg0 < 0 && var5.field740 != -1) {
                    arg4.field6100 = var5.field740;
                } else if (arg0 <= 0 || var5.field768 == -1) {
                    arg4.field6100 = var5.field758;
                } else {
                    arg4.field6100 = var5.field768;
                }
                arg4.field6056 = false;
            } else if (!arg4.field6056 || !var5.method404(arg4.field6100, (byte) 60)) {
                arg4.field6100 = var5.method402(-120);
                arg4.field6056 = arg4.field6100 != -1;
            }
        } else if (arg4.field6024 != -1 && var6 >= 10240 || var6 <= 2048) {
            int var7 = class97.field1154[arg3] - arg4.field6075.field6358 & 0x3FFF;
            if (arg2 == 2 && var5.field783 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field770 != -1) {
                    arg4.field6100 = var5.field770;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field775 != -1) {
                    arg4.field6100 = var5.field775;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field743 == -1) {
                    arg4.field6100 = var5.field783;
                } else {
                    arg4.field6100 = var5.field743;
                }
            } else if (arg2 == 0 && var5.field784 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field774 != -1) {
                    arg4.field6100 = var5.field774;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field739 != -1) {
                    arg4.field6100 = var5.field739;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field756 == -1) {
                    arg4.field6100 = var5.field784;
                } else {
                    arg4.field6100 = var5.field756;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field782 != -1) {
                arg4.field6100 = var5.field782;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field749 != -1) {
                arg4.field6100 = var5.field749;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field764 == -1) {
                arg4.field6100 = var5.field758;
            } else {
                arg4.field6100 = var5.field764;
            }
            arg4.field6056 = false;
        } else if (var6 == 0 && arg4.field6081 <= 25) {
            arg4.field6056 = false;
            if (arg2 == 2 && var5.field783 != -1) {
                arg4.field6100 = var5.field783;
            } else if (arg2 == 0 && var5.field784 != -1) {
                arg4.field6100 = var5.field784;
            } else {
                arg4.field6100 = var5.field758;
            }
        } else {
            if (arg2 == 2 && var5.field783 != -1) {
                if (arg0 < 0 && var5.field746 != -1) {
                    arg4.field6100 = var5.field746;
                } else if (arg0 <= 0 || var5.field780 == -1) {
                    arg4.field6100 = var5.field783;
                } else {
                    arg4.field6100 = var5.field780;
                }
            } else if (arg2 == 0 && var5.field784 != -1) {
                if (arg0 < 0 && var5.field744 != -1) {
                    arg4.field6100 = var5.field744;
                } else if (arg0 <= 0 || var5.field750 == -1) {
                    arg4.field6100 = var5.field784;
                } else {
                    arg4.field6100 = var5.field750;
                }
            } else if (arg0 < 0 && var5.field742 != -1) {
                arg4.field6100 = var5.field742;
            } else if (arg0 <= 0 || var5.field735 == -1) {
                arg4.field6100 = var5.field758;
            } else {
                arg4.field6100 = var5.field735;
            }
            arg4.field6056 = false;
        }
        if (arg1 <= 73) {
            method2466(-78, 103, 8);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V", line = 221)
    public static void method2469(byte arg0) {
        if (arg0 <= 47) {
            method2466(39, 123, -8);
        }
        field5693 = null;
        field5694 = null;
        field5687 = null;
        field5692 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZI[B)Ljava/lang/Object;", line = 237)
    public static final Object method2470(boolean arg0, int arg1, byte[] arg2) {
        field5690++;
        if (arg2 == null) {
            return null;
        }
        if (arg1 != -18755) {
            method2470(true, 13, (byte[]) null);
        }
        if (arg2.length > 136 && !class330.field4413) {
            try {
                class297 var3 = (class297) Class.forName("ec").getDeclaredConstructor().newInstance();
                var3.method180(arg2, false);
                return var3;
            } catch (Throwable var4) {
                class330.field4413 = true;
            }
        }
        return arg0 ? class440.method2725(true, arg2) : arg2;
    }
}
