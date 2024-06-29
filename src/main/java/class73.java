import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hia")
public class class73 extends class232 {

    @OriginalMember(owner = "client!hia", name = "i", descriptor = "Log;")
    private class673 field972;

    @OriginalMember(owner = "client!hia", name = "t", descriptor = "Llo;")
    private class785 field983;

    @OriginalMember(owner = "client!hia", name = "v", descriptor = "Lhga;")
    private class182 field985;

    @OriginalMember(owner = "client!hia", name = "u", descriptor = "Ljo;")
    public static class351 field984 = new class351(10, -1);

    @OriginalMember(owner = "client!hia", name = "x", descriptor = "[Z")
    public static boolean[] field987 = new boolean[100];

    @OriginalMember(owner = "client!hia", name = "j", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!hia", name = "k", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!hia", name = "l", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!hia", name = "m", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!hia", name = "n", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!hia", name = "o", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!hia", name = "p", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!hia", name = "q", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!hia", name = "r", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!hia", name = "s", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!hia", name = "w", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!hia", name = "y", descriptor = "[I")
    public static int[] field988;

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(ZB)V", line = 9)
    public final void method568(boolean arg0, byte arg1) {
        ++field978;
        if (arg1 == -126) {
            OpenGL.glBindProgramARB(34336, this.field985.field2759);
            OpenGL.glEnable(34336);
            super.field3368.method1056(32, class490.field6967, 0);
        }
    }

    @OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Log;Lcb;Llo;)V", line = 24)
    public class73(class673 arg0, class544 arg1, class785 arg2) {
        super(arg0);
        this.field972 = arg0;
        this.field983 = arg2;
        if (arg1 != null && this.field983.method4301(3344) && this.field972.field9534) {
            this.field985 = class786.method4310(25394, 34336, arg1.method3126((byte) 91, "gl", "transparent_water"), this.field972);
        } else {
            this.field985 = null;
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(III)V", line = 40)
    public final void method569(int arg0, int arg1, int arg2) {
        if (this.field983.field10788) {
            float var4 = (float) (super.field3368.field2209 % 4000) / 4000.0F;
            super.field3368.method1104(true, this.field983.field10792);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0F, 0.0F, 1.0F);
        } else {
            int var5 = super.field3368.field2209 % 4000 * 16 / 4000;
            super.field3368.method1104(true, this.field983.field10787[var5]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        int var6 = -126 % ((arg0 - 48) / 51);
        ++field975;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(ILdr;I)V", line = 64)
    public final void method570(int arg0, class749 arg1, int arg2) {
        if (arg0 != 2305) {
            this.method570(50, (class749) null, 101);
        }
        ++field981;
    }

    @OriginalMember(owner = "client!hia", name = "e", descriptor = "(I)Z", line = 74)
    public final boolean method571(int arg0) {
        if (arg0 != -30998) {
            return true;
        } else {
            ++field979;
            return this.field985 != null;
        }
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(ZI)V", line = 89)
    public final void method572(boolean arg0, int arg1) {
        if (arg1 < 21) {
            method577(63);
        }
        super.field3368.method1136((byte) -118, class438.field6278, class576.field8141);
        ++field974;
    }

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "(B)V", line = 100)
    public final void method573(byte arg0) {
        super.field3368.method1056(32, class412.field5814, 0);
        ++field977;
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
        if (arg0 <= 77) {
            field984 = null;
        }
    }

    @OriginalMember(owner = "client!hia", name = "f", descriptor = "(I)V", line = 117)
    public static void method574(int arg0) {
        field987 = null;
        if (arg0 != 15079) {
            method576(-88, 119, -44);
        }
        field988 = null;
        field984 = null;
    }

    @OriginalMember(owner = "client!hia", name = "a", descriptor = "(Lli;B)V", line = 129)
    public static final void method575(class449 arg0, byte arg1) {
        ++field973;
        if (arg0.field6415 != null || arg0.field6380 != null) {
            if (arg1 > 30) {
                boolean var2 = true;
                for (int var3 = 0; ~var3 > ~arg0.field6415.length; ++var3) {
                    int var4 = -1;
                    if (arg0.field6415 != null) {
                        var4 = arg0.field6415[var3];
                    }
                    if (var4 == -1) {
                        if (!arg0.method2697((byte) -5, var3, -1)) {
                            var2 = false;
                        }
                    } else {
                        var2 = false;
                        boolean var5 = false;
                        boolean var6 = false;
                        int var9;
                        int var10;
                        if (~(var4 & -1073741824) != 1073741823) {
                            if (~(32768 & var4) != -1) {
                                int var7 = 32767 & var4;
                                class559 var8 = class581.field8250[var7];
                                if (var8 == null) {
                                    arg0.method2697((byte) -5, var3, -1);
                                    continue;
                                }
                                var9 = arg0.field7719 - var8.field7719;
                                var10 = -var8.field7718 + arg0.field7718;
                            } else {
                                class14 var11 = (class14) class543.field7606.method380((byte) -3, (long) var4);
                                if (var11 == null) {
                                    arg0.method2697((byte) -5, var3, -1);
                                    continue;
                                }
                                class645 var12 = var11.field262;
                                var10 = -var12.field7718 + arg0.field7718;
                                var9 = -var12.field7719 + arg0.field7719;
                            }
                        } else {
                            int var13 = var4 & 268435455;
                            int var14 = var13 >> 14;
                            int var15 = var13 & 16383;
                            var10 = arg0.field7718 - ((-class103.field1295 + var14) * 512 + 256);
                            var9 = -((-class175.field2496 + var15) * 512) + -256 + arg0.field7719;
                        }
                        if (var10 != 0 || ~var9 != -1) {
                            arg0.method2697((byte) -5, var3, (int) (Math.atan2((double) var10, (double) var9) * 2607.5945876176133D) & 16383);
                        }
                    }
                }
                if (var2) {
                    arg0.field6380 = null;
                    arg0.field6415 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hia", name = "b", descriptor = "(III)Z", line = 240)
    public static final boolean method576(int arg0, int arg1, int arg2) {
        ++field982;
        int var3 = 126 % ((-43 - arg2) / 42);
        return class195.method1421(arg0, arg1, -88) & class493.method2882(-1, arg1, arg0);
    }

    @OriginalMember(owner = "client!hia", name = "g", descriptor = "(I)[Lgq;", line = 251)
    public static final class538[] method577(int arg0) {
        if (arg0 != 34820) {
            field986 = 119;
        }
        ++field980;
        return new class538[] { class10.field218, class388.field5523, class438.field6277 };
    }
}
