import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class542 extends class384 {

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "[F")
    private float[] field7802 = new float[4];

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "Z")
    private boolean field7809 = false;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "Lkca;")
    private class82 field7816;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "Lkca;")
    private class82 field7814;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "Lkca;")
    private class82 field7817;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "Lkca;")
    private class82 field7818;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "Z")
    private boolean field7800;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "Loq;")
    private class358 field7819;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "I")
    public static int field7803 = 0;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "Z")
    public static boolean field7815 = false;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field7793;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field7794;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field7796;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field7798;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field7799;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field7801;

    @OriginalMember(owner = "client!nd", name = "v", descriptor = "I")
    public static int field7804;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field7806;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public static int field7807;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public static int field7810;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    public static int field7811;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    public static int field7812;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    public static int field7813;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "Lhu;")
    public static class131 field7795;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "Z")
    private boolean field7797;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "Z")
    private boolean field7805;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)V", line = 5)
    public final void method24(boolean arg0, int arg1) {
        this.field7805 = arg0;
        ++field7810;
        super.field5349.method2217(1, 27);
        super.field5349.method2207((byte) -61, this.field7819);
        super.field5349.method2242(-96, class94.field989, class1.field4);
        super.field5349.method2264(0, class58.field582, (byte) 60);
        if (arg1 != -1) {
            method3188(121, (byte) -94, 47);
        }
        super.field5349.method2318((byte) 122, false, true, 2, class424.field6157);
        super.field5349.method2268(0, 125, class324.field4136);
        super.field5349.method2217(0, arg1 ^ -44);
        this.method2387((byte) 112);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lke;BI)V", line = 25)
    public final void method27(class596 arg0, byte arg1, int arg2) {
        if (arg0 == null) {
            if (!this.field7809) {
                super.field5349.method2207((byte) -61, super.field5349.field5149);
                super.field5349.method2255(1, 15818);
                super.field5349.method2264(0, class324.field4136, (byte) 60);
                super.field5349.method2268(0, 31, class324.field4136);
                this.field7809 = true;
            }
        } else {
            if (this.field7809) {
                super.field5349.method2264(0, class424.field6157, (byte) 60);
                super.field5349.method2268(0, arg1 ^ 25, class424.field6157);
                this.field7809 = false;
            }
            super.field5349.method2207((byte) -61, arg0);
            super.field5349.method2255(arg2, 15818);
        }
        if (arg1 != 123) {
            this.field7818 = null;
        }
        ++field7811;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V", line = 61)
    public final void method528(byte arg0) {
        if (arg0 != 37) {
            method3185(31);
        }
        if (this.field7797) {
            int var2 = super.field5349.method435();
            int var3 = super.field5349.method320();
            float var4 = (float) var2 - (float) (-var3 + var2) * 0.125F;
            float var5 = (float) var2 - (float) (-var3 + var2) * 0.25F;
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, var4, 1.0F / (float) super.field5349.method2223(false), (float) super.field5349.method2293((byte) -113) / 255.0F);
            super.field5349.method2217(1, 37);
            super.field5349.method2257(super.field5349.method2322(0), -552);
            super.field5349.method2217(0, 12);
        }
        ++field7801;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)Z", line = 89)
    public final boolean method26(int arg0) {
        if (arg0 != 13326) {
            this.field7817 = null;
        }
        ++field7808;
        return this.field7800;
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V", line = 104)
    public static void method3185(int arg0) {
        if (arg0 != 17986) {
            field7815 = false;
        }
        field7795 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()V", line = 117)
    public static final void method3186() {
        while (true) {
            boolean var0 = true;
            for (int var1 = 0; var1 < class472.field6766.length; ++var1) {
                if (!class472.field6766[var1].method570()) {
                    synchronized (class472.field6766[var1]) {
                        class472.field6766[var1].notify();
                    }
                    var0 = false;
                } else {
                    class626.field8988[var1] = class472.field6766[var1].method573();
                }
            }
            if (var0) {
                class472.field6766[class472.field6766.length - 1].method569();
                class555.method3260(1);
                while (true) {
                    boolean var3 = true;
                    for (int var4 = 0; var4 < class472.field6766.length - 1; ++var4) {
                        if (!class472.field6766[var4].method570()) {
                            synchronized (class472.field6766[var4]) {
                                class472.field6766[var4].notify();
                            }
                            var3 = false;
                        }
                    }
                    if (var3) {
                        for (int var6 = 1; var6 < class472.field6766.length - 2; ++var6) {
                            class472.field6766[var6].method569();
                        }
                        class555.method3260(2);
                        while (!class472.field6766[0].method570()) {
                            synchronized (class472.field6766[0]) {
                                class472.field6766[0].notify();
                            }
                            try {
                                class524.method3076(1, 1L);
                            } catch (Exception var9) {
                            }
                        }
                        class472.field6766[0].method569();
                        return;
                    }
                    try {
                        class524.method3076(1, 1L);
                    } catch (Exception var12) {
                    }
                }
            }
            try {
                class524.method3076(1, 1L);
            } catch (Exception var8) {
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lfd;ZIIZLfd;I)I", line = 212)
    public static final int method3187(class526 arg0, boolean arg1, int arg2, int arg3, boolean arg4, class526 arg5, int arg6) {
        ++field7794;
        int var7 = class188.method1151((byte) -127, arg0, arg1, arg3, arg5);
        if (var7 != 0) {
            return !arg1 ? var7 : -var7;
        } else if (~arg6 == 0) {
            return 0;
        } else {
            if (arg2 != 21343) {
                field7803 = -6;
            }
            int var8 = class188.method1151((byte) -109, arg0, arg4, arg6, arg5);
            return arg4 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBI)Z", line = 245)
    public static final boolean method3188(int arg0, byte arg1, int arg2) {
        if (arg1 > -54) {
            field7804 = 34;
        }
        ++field7807;
        return (arg2 & 16) != 0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V", line = 262)
    public final void method31(byte arg0) {
        ++field7806;
        if (arg0 < -18) {
            super.field5349.method2217(1, 115);
            super.field5349.method2207((byte) -61, (class596) null);
            super.field5349.method2242(-114, class372.field4752, class372.field4752);
            super.field5349.method2264(0, class424.field6157, (byte) 60);
            super.field5349.method2264(2, class58.field582, (byte) 60);
            super.field5349.method2268(0, 38, class424.field6157);
            super.field5349.method2217(0, 91);
            if (this.field7809) {
                super.field5349.method2264(0, class424.field6157, (byte) 60);
                super.field5349.method2268(0, 91, class424.field6157);
                this.field7809 = false;
            }
            if (this.field7797) {
                OpenGL.glBindProgramARB(34336, 0);
                OpenGL.glDisable(34820);
                OpenGL.glDisable(34336);
                this.field7797 = false;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZB)V", line = 296)
    public final void method30(boolean arg0, byte arg1) {
        if (arg1 <= 78) {
            this.field7819 = null;
        }
        ++field7813;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)Z", line = 306)
    public static final boolean method3189(int arg0, int arg1) {
        ++field7796;
        if (arg0 != -12) {
            return true;
        } else {
            return ~arg1 == -7 || ~arg1 == -51 || ~arg1 == -60 || ~arg1 == -46 || arg1 == 18 || ~arg1 == -12 || arg1 == 13;
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V", line = 317)
    public final void method2387(byte arg0) {
        ++field7812;
        int var2 = super.field5349.method2243(false);
        class427 var3 = super.field5349.method2222(-8);
        if (this.field7805) {
            OpenGL.glBindProgramARB(34336, ~var2 != Integer.MIN_VALUE ? this.field7818.field852 : this.field7814.field852);
        } else {
            OpenGL.glBindProgramARB(34336, var2 == Integer.MAX_VALUE ? this.field7816.field852 : this.field7817.field852);
        }
        OpenGL.glEnable(34336);
        this.field7797 = true;
        var3.method2670(-1.0F, 0.0F, 0.0F, (float) var2, true, this.field7802);
        if (arg0 >= 75) {
            OpenGL.glProgramLocalParameter4fARB(34336, 1, this.field7802[0], this.field7802[1], this.field7802[2], this.field7802[3]);
            this.method528((byte) 37);
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lai;Loh;)V", line = 350)
    public class542(class597 arg0, class404 arg1) {
        super(arg0);
        if (arg1 != null && arg0.field8512) {
            this.field7816 = class702.method3942(arg0, arg1.method2471((byte) -125, "gl", "uw_ground_unlit"), 0, 34336);
            this.field7814 = class702.method3942(arg0, arg1.method2471((byte) -40, "gl", "uw_ground_lit"), 0, 34336);
            this.field7817 = class702.method3942(arg0, arg1.method2471((byte) -109, "gl", "uw_model_unlit"), 0, 34336);
            this.field7818 = class702.method3942(arg0, arg1.method2471((byte) -79, "gl", "uw_model_lit"), 0, 34336);
            if (!(this.field7818 != null & this.field7817 != null & this.field7816 != null & this.field7814 != null)) {
                this.field7800 = false;
            } else {
                this.field7819 = super.field5349.method2266(new int[] { 0, -1 }, 111, 1, 2, false);
                this.field7819.method604(false, false, (byte) -43);
                this.field7800 = true;
            }
        } else {
            this.field7800 = false;
        }
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(B)V", line = 379)
    public static final void method3190(byte arg0) {
        ++field7793;
        if (class336.field4322 != null) {
            if (arg0 == -122) {
                class336.field4322 = null;
                class119.method771(class134.field1515, (byte) -128, class750.field10484, class330.field4283, class210.field2484);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIZ)V", line = 400)
    public final void method32(int arg0, int arg1, boolean arg2) {
        ++field7799;
        if (!arg2) {
            method3189(-20, 107);
        }
    }
}
