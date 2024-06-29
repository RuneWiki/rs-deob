import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class747 {

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "Lfc;")
    private class262 field10378 = new class262(64);

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "Lfc;")
    public class262 field10382 = new class262(50);

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "Lep;")
    public class423 field10383 = new class423(250);

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "Leo;")
    private class299 field10384 = new class299();

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public int field10369;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "Lwba;")
    private class50 field10385;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "Lni;")
    public class522 field10374;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "Z")
    private boolean field10379;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "Lni;")
    private class522 field10381;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public int field10364;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field10387;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "[Ljava/lang/String;")
    private String[] field10388;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field10363;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field10365;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field10366;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field10367;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field10368;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field10370;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field10371;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field10372;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field10373;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field10375;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field10376;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field10377;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public static int field10380;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    public int field10386;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILha;Ltfa;IIII)Lufa;", line = 4)
    public final class680 method4165(int arg0, int arg1, class60 arg2, class34 arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field10384.field4024 = arg3 != null;
        this.field10384.field4023 = arg6;
        if (arg7 != 24056) {
            return null;
        }
        this.field10384.field4013 = arg1;
        this.field10384.field4014 = arg5;
        this.field10384.field4017 = arg2.field632;
        this.field10384.field4018 = arg4;
        this.field10384.field4021 = arg0;
        field10371++;
        return (class680) this.field10383.method2423(this.field10384, arg7 ^ 0x5DF8);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)Ljn;", line = 29)
    public static final class719 method4166(int arg0, int arg1, int arg2) {
        class624 var3 = class77.field947[arg0][arg1][arg2];
        return var3 == null ? null : var3.field8737;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)V", line = 38)
    public final void method4167(int arg0, int arg1) {
        this.field10386 = arg1;
        field10372++;
        class262 var3 = this.field10382;
        synchronized (this.field10382) {
            this.field10382.method1563(103);
            int var4 = -127 / ((-arg0 - 60) / 55);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lhl;I[Lon;)Lfg;", line = 53)
    public static final class130 method4168(class529 arg0, int arg1, class339[] arg2) {
        field10368++;
        for (int var3 = 0; var3 < arg2.length; var3++) {
            if (arg2[var3] == null || arg2[var3].field4566 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg2.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg2[var6].field4566);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class335.field4541, 0);
        if (class335.field4541[0] == arg1) {
            if (class335.field4541[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class335.field4541, 1);
            if (class335.field4541[1] > 1) {
                byte[] var7 = new byte[class335.field4541[1]];
                OpenGL.glGetInfoLogARB(var4, class335.field4541[1], class335.field4541, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class335.field4541[0] == 0) {
                for (int var8 = 0; var8 < arg2.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg2[var8].field4566);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class130(arg0, var4, arg2);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)Lsea;", line = 121)
    public final class697 method4169(int arg0, byte arg1) {
        field10380++;
        class262 var3 = this.field10378;
        class697 var4;
        synchronized (this.field10378) {
            var4 = (class697) this.field10378.method1571(-126, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field10381;
        byte[] var6;
        synchronized (this.field10381) {
            var6 = this.field10381.method2885(class260.method1561((byte) -84, arg0), class84.method620((byte) 124, arg0), false);
        }
        class697 var7 = new class697();
        var7.field9740 = this;
        var7.field9805 = arg0;
        var7.field9775 = new String[] { null, null, class755.field10487.method4201(this.field10369, (byte) 25), null, null };
        var7.field9811 = new String[] { null, null, null, null, class755.field10488.method4201(this.field10369, (byte) 25) };
        if (var6 != null) {
            var7.method3942(new class611(var6), (byte) -114);
        }
        var7.method3930(850);
        if (var7.field9735 != -1) {
            var7.method3932(this.method4169(var7.field9759, (byte) -120), 118, this.method4169(var7.field9735, (byte) -122));
        }
        if (var7.field9793 != -1) {
            var7.method3943(this.method4169(var7.field9810, (byte) -123), this.method4169(var7.field9793, (byte) -123), 123);
        }
        if (!this.field10379 && var7.field9741) {
            var7.field9780 = class755.field10485.method4201(this.field10369, (byte) 25);
            var7.field9775 = this.field10387;
            var7.field9798 = false;
            var7.field9811 = this.field10388;
            var7.field9761 = 0;
            var7.field9762 = null;
            if (var7.field9772 != null) {
                boolean var8 = false;
                for (class55 var9 = var7.field9772.method2560(124); var9 != null; var9 = var7.field9772.method2557(-1)) {
                    class135 var10 = this.field10385.method296((byte) 31, (int) var9.field556);
                    if (var10.field1721) {
                        var9.method315(44);
                    } else {
                        var8 = true;
                    }
                }
                if (!var8) {
                    var7.field9772 = null;
                }
            }
        }
        class262 var11 = this.field10378;
        synchronized (this.field10378) {
            this.field10378.method1574((long) arg0, var7, (byte) -80);
        }
        return arg1 >= -115 ? null : var7;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 199)
    public final void method4170(int arg0) {
        int var2 = -17 / ((arg0 + 34) / 55);
        class262 var3 = this.field10378;
        synchronized (this.field10378) {
            this.field10378.method1563(110);
        }
        field10376++;
        class262 var4 = this.field10382;
        synchronized (this.field10382) {
            this.field10382.method1563(64);
        }
        class423 var5 = this.field10383;
        synchronized (this.field10383) {
            this.field10383.method2413(true);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V", line = 218)
    public static final void method4171(int arg0) {
        field10365++;
        for (class532 var1 = (class532) class268.field3555.method724(32); var1 != null; var1 = (class532) class268.field3555.method723(arg0 ^ 0xFFFFDA12)) {
            class33 var2 = var1.field7226;
            if (class406.field5732 > var2.field302) {
                var1.method315(81);
                var2.method155(arg0 ^ 0x3254);
            } else if (class406.field5732 >= var2.field325) {
                var2.method158((byte) 109);
                if (var2.field328 > 0) {
                    class706 var3 = (class706) class681.field9475.method2552((long) (var2.field328 - 1), -1);
                    if (var3 != null) {
                        class215 var4 = var3.field9890;
                        if (var4.field2170 >= 0 && var4.field2170 < (class272.field3589 * 512) && var4.field2165 >= 0 && var4.field2165 < class3.field26 * 512) {
                            var2.method151(var4.field2170, class86.method624(var2.field2175, var4.field2165, var4.field2170, arg0 + 33738) - var2.field297, class406.field5732, (byte) 108, var4.field2165);
                        }
                    }
                }
                if (var2.field328 < 0) {
                    int var5 = -var2.field328 - 1;
                    class83 var6;
                    if (class247.field3207 == var5) {
                        var6 = class653.field9086;
                    } else {
                        var6 = class361.field4793[var5];
                    }
                    if (var6 != null && var6.field2170 >= 0 && var6.field2170 < (class272.field3589 * 512) && var6.field2165 >= 0 && var6.field2165 < (class3.field26 * 512)) {
                        var2.method151(var6.field2170, class86.method624(var2.field2175, var6.field2165, var6.field2170, 24111) - var2.field297, class406.field5732, (byte) 108, var6.field2165);
                    }
                }
                var2.method152(-10462, class242.field3146);
                class202.method1119(var2, true);
            }
        }
        if (arg0 != -9627) {
            method4166(3, 3, 3);
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V", line = 288)
    public final void method4172(int arg0) {
        field10366++;
        class423 var2 = this.field10383;
        synchronized (this.field10383) {
            this.field10383.method2413(true);
        }
        if (arg0 != 64) {
            this.field10383 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)V", line = 301)
    public final void method4173(int arg0, boolean arg1) {
        field10370++;
        if (arg1 == this.field10379) {
            return;
        }
        this.field10379 = arg1;
        if (arg0 > -30) {
            this.method4167(15, 22);
        }
        this.method4170(94);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V", line = 319)
    public final void method4174(byte arg0) {
        class262 var2 = this.field10378;
        synchronized (this.field10378) {
            int var3 = 85 / ((-arg0 - 69) / 55);
            this.field10378.method1575((byte) -86);
        }
        field10367++;
        class262 var4 = this.field10382;
        synchronized (this.field10382) {
            this.field10382.method1575((byte) 104);
        }
        class423 var5 = this.field10383;
        synchronized (this.field10383) {
            this.field10383.method2416(13937);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)V", line = 337)
    public final void method4175(int arg0, int arg1) {
        field10377++;
        class262 var3 = this.field10378;
        synchronized (this.field10378) {
            this.field10378.method1569((byte) 62, arg0);
        }
        if (arg1 != 1) {
            this.method4169(50, (byte) -48);
        }
        class262 var4 = this.field10382;
        synchronized (this.field10382) {
            this.field10382.method1569((byte) 62, arg0);
        }
        class423 var5 = this.field10383;
        synchronized (this.field10383) {
            this.field10383.method2415((byte) 96, arg0);
        }
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)V", line = 362)
    public final void method4176(int arg0) {
        field10363++;
        class262 var2 = this.field10382;
        synchronized (this.field10382) {
            if (arg0 <= 13) {
                this.field10382 = null;
            }
            this.field10382.method1563(38);
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lrga;IZLwba;Lni;Lni;)V", line = 462)
    public class747(class242 arg0, int arg1, boolean arg2, class50 arg3, class522 arg4, class522 arg5) {
        this.field10369 = arg1;
        this.field10385 = arg3;
        this.field10374 = arg5;
        this.field10379 = arg2;
        this.field10381 = arg4;
        if (this.field10381 == null) {
            this.field10364 = 0;
        } else {
            int var7 = this.field10381.method2892((byte) -11) - 1;
            this.field10364 = this.field10381.method2901(0, var7) + var7 * 256;
        }
        this.field10387 = new String[] { null, null, class755.field10487.method4201(this.field10369, (byte) 25), null, null };
        this.field10388 = new String[] { null, null, null, null, class755.field10488.method4201(this.field10369, (byte) 25) };
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lda;ZIIILtfa;Lha;IZILha;Z)Lufa;", line = 379)
    public final class680 method4177(class61 arg0, boolean arg1, int arg2, int arg3, int arg4, class34 arg5, class60 arg6, int arg7, boolean arg8, int arg9, class60 arg10, boolean arg11) {
        field10373++;
        class680 var13 = this.method4165(arg3, arg2, arg10, arg5, arg9, arg7, arg4, 24056);
        if (var13 != null) {
            return var13;
        }
        class697 var14 = this.method4169(arg2, (byte) -125);
        if (arg9 > 1 && var14.field9753 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field9784[var16] <= arg9 && var14.field9784[var16] != 0) {
                    var15 = var14.field9753[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method4169(var15, (byte) -116);
            }
        }
        int[] var17 = var14.method3933(arg4, arg7, arg11, arg9, arg3, arg10, arg6, (byte) -125, arg5, arg0);
        if (var17 == null) {
            return null;
        }
        class680 var18;
        if (arg8) {
            var18 = arg6.method351(-7962, 0, 36, 32, var17, 36);
        } else {
            var18 = arg10.method351(-7962, 0, 36, 32, var17, 36);
        }
        if (!arg8) {
            class299 var19 = new class299();
            var19.field4021 = arg3;
            var19.field4013 = arg2;
            var19.field4024 = arg5 != null;
            var19.field4023 = arg4;
            var19.field4018 = arg9;
            var19.field4017 = arg10.field632;
            var19.field4014 = arg7;
            this.field10383.method2420(var18, var19, false);
        }
        if (arg1) {
            this.method4173(-24, false);
        }
        return var18;
    }
}
