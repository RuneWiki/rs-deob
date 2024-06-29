import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oca")
public class class224 extends class145 {

    @OriginalMember(owner = "client!oca", name = "K", descriptor = "I")
    private int field3148 = 8192;

    @OriginalMember(owner = "client!oca", name = "F", descriptor = "I")
    private int field3143 = 2048;

    @OriginalMember(owner = "client!oca", name = "E", descriptor = "I")
    private int field3142 = 0;

    @OriginalMember(owner = "client!oca", name = "P", descriptor = "I")
    private int field3153 = 0;

    @OriginalMember(owner = "client!oca", name = "R", descriptor = "I")
    private int field3155 = 4096;

    @OriginalMember(owner = "client!oca", name = "U", descriptor = "I")
    private int field3158 = 2048;

    @OriginalMember(owner = "client!oca", name = "G", descriptor = "I")
    private int field3144 = 12288;

    @OriginalMember(owner = "client!oca", name = "I", descriptor = "[I")
    public static int[] field3146 = new int[2048];

    @OriginalMember(owner = "client!oca", name = "W", descriptor = "I")
    public static int field3160 = 0;

    @OriginalMember(owner = "client!oca", name = "S", descriptor = "Lraa;")
    public static class528 field3156 = new class528("WTRC", 1);

    @OriginalMember(owner = "client!oca", name = "cb", descriptor = "I")
    public static int field3166 = 0;

    @OriginalMember(owner = "client!oca", name = "J", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!oca", name = "L", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!oca", name = "M", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!oca", name = "O", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!oca", name = "Q", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!oca", name = "T", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!oca", name = "V", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!oca", name = "Y", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!oca", name = "ab", descriptor = "I")
    public static int field3164;

    @OriginalMember(owner = "client!oca", name = "bb", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!oca", name = "X", descriptor = "Lkea;")
    public static class203 field3161;

    @OriginalMember(owner = "client!oca", name = "Z", descriptor = "Lkea;")
    public static class203 field3163;

    @OriginalMember(owner = "client!oca", name = "N", descriptor = "Ljs;")
    public static class279 field3151;

    @OriginalMember(owner = "client!oca", name = "H", descriptor = "Lci;")
    public static class386 field3145;

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "([Lni;Lad;I)Lis;", line = 4)
    public static final class434 method1458(class451[] arg0, class362 arg1, int arg2) {
        ++field3159;
        for (int var3 = 0; ~arg0.length < ~var3; ++var3) {
            if (arg0[var3] == null || ~arg0[var3].field6727 >= -1L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field6727);
        }
        if (arg2 != 5097) {
            field3166 = 25;
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class509.field7453, 0);
        if (~class509.field7453[0] == -1) {
            if (class509.field7453[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class509.field7453, 1);
            if (class509.field7453[1] > 1) {
                byte[] var7 = new byte[class509.field7453[1]];
                OpenGL.glGetInfoLogARB(var4, class509.field7453[1], class509.field7453, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (~class509.field7453[0] == -1) {
                for (int var8 = 0; var8 < arg0.length; ++var8) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field6727);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class434(arg1, var4, arg0);
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(B)V", line = 75)
    public static final void method1459(byte arg0) {
        for (int var1 = 0; ~var1 > -6; ++var1) {
            class126.field1553[var1] = false;
        }
        ++field3150;
        class61.field701 = -1;
        if (arg0 != 82) {
            field3164 = 63;
        }
        class341.field4861 = class337.field4821;
        class118.field1474 = class309.field4550;
        class281.field3924 = class287.field3982;
        class531.field7668 = class100.field1192;
        class236.field3384 = 5;
        class74.field787 = -1;
        class468.field6956 = 0;
        class622.field8997 = 0;
        class277.field3870 = class207.field2781;
        class280.field3905 = class17.field177;
    }

    @OriginalMember(owner = "client!oca", name = "<init>", descriptor = "()V", line = 106)
    public class224() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oca", name = "f", descriptor = "(I)V", line = 121)
    public final void method145(int arg0) {
        int var2 = -29 % ((arg0 - -46) / 45);
        class315.method2072((byte) -12);
        ++field3165;
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(B)V", line = 145)
    public static final void method1460(byte arg0) {
        ++field3162;
        int var1 = -87 / ((68 - arg0) / 35);
        for (class55 var2 = (class55) class117.field1451.method719(false); var2 != null; var2 = (class55) class117.field1451.method716(14)) {
            if (~var2.field636 != 0) {
                var2.method2108(true);
            } else {
                var2.field632 = 0;
                if (~var2.field623 <= -1 && ~var2.field625 <= -1 && class90.field1032 > var2.field623 && ~class30.field349 < ~var2.field625) {
                    class368.method2358(false, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oca", name = "b", descriptor = "(III)Z", line = 176)
    private final boolean method1461(int arg0, int arg1, int arg2) {
        ++field3154;
        int var4 = (arg0 + arg2) * this.field3144 >> 12;
        int var5 = class215.field2959[(var4 * 255 & 1046671) >> 12];
        int var6 = (var5 << 12) / this.field3144;
        if (arg1 != 726029772) {
            field3160 = -8;
        }
        int var7 = (var6 << 12) / this.field3148;
        int var8 = this.field3155 * var7 >> 12;
        return ~(-arg0 + arg2) > ~var8 && -var8 < arg2 - arg0;
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(ZI)[I", line = 197)
    public final int[] method27(boolean arg0, int arg1) {
        ++field3149;
        if (arg0) {
            this.method1464(58, 110, -115);
        }
        int[] var3 = super.field1779.method2069(-2, arg1);
        if (super.field1779.field4602) {
            int var4 = class573.field8270[arg1] + -2048;
            for (int var5 = 0; ~var5 > ~class647.field9368; ++var5) {
                int var6 = class601.field8779[var5] + -2048;
                int var7 = this.field3143 + var6;
                int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                int var9 = var8 <= 2048 ? var8 : var8 - 4096;
                int var10 = this.field3153 + var4;
                int var11 = var10 < -2048 ? var10 + 4096 : var10;
                int var12 = ~var11 < -2049 ? var11 + -4096 : var11;
                int var13 = this.field3142 + var6;
                int var14 = ~var13 <= 2047 ? var13 : var13 + 4096;
                int var15 = ~var14 < -2049 ? var14 + -4096 : var14;
                int var16 = var4 - -this.field3158;
                int var17 = ~var16 > 2047 ? var16 - -4096 : var16;
                int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                var3[var5] = !this.method1464(var12, var9, -5) && !this.method1461(var15, 726029772, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "(B)V", line = 253)
    public static void method1462(byte arg0) {
        field3145 = null;
        field3146 = null;
        field3163 = null;
        field3151 = null;
        field3156 = null;
        field3161 = null;
        if (arg0 != -36) {
            method1459((byte) -90);
        }
    }

    @OriginalMember(owner = "client!oca", name = "a", descriptor = "(IILrt;)V", line = 268)
    public final void method28(int arg0, int arg1, class194 arg2) {
        if (arg1 >= -67) {
            field3151 = null;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field3148 = arg2.method1220(-58);
                                }
                            } else {
                                this.field3155 = arg2.method1220(126);
                            }
                        } else {
                            this.field3144 = arg2.method1220(124);
                        }
                    } else {
                        this.field3158 = arg2.method1220(-117);
                    }
                } else {
                    this.field3142 = arg2.method1220(-16);
                }
            } else {
                this.field3153 = arg2.method1220(115);
            }
        } else {
            this.field3143 = arg2.method1220(114);
        }
        ++field3147;
    }

    @OriginalMember(owner = "client!oca", name = "i", descriptor = "(I)V", line = 346)
    public static final void method1463(int arg0) {
        ++field3157;
        class277 var1 = class229.field3231;
        synchronized (class229.field3231) {
            class229.field3231.method1810(false);
            if (arg0 > -31) {
                field3161 = null;
            }
        }
    }

    @OriginalMember(owner = "client!oca", name = "c", descriptor = "(III)Z", line = 369)
    private final boolean method1464(int arg0, int arg1, int arg2) {
        if (arg2 != -5) {
            this.field3158 = 72;
        }
        ++field3152;
        int var4 = (-arg1 + arg0) * this.field3144 >> 12;
        int var5 = class215.field2959[(var4 * 255 & 1045595) >> 12];
        int var6 = (var5 << 12) / this.field3144;
        int var7 = (var6 << 12) / this.field3148;
        int var8 = this.field3155 * var7 >> 12;
        return ~var8 < ~(arg1 - -arg0) && ~(arg1 - -arg0) < ~(-var8);
    }
}
