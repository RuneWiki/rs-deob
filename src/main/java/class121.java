import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class121 extends class497 {

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "Lui;")
    private class240 field1893;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "Lko;")
    private class529 field1889;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "Lhka;")
    private class57 field1891;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!ri", name = "s", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!ri", name = "t", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!ri", name = "u", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!ri", name = "v", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!ri", name = "w", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!ri", name = "x", descriptor = "I")
    public static int field1900;

    @OriginalMember(owner = "client!ri", name = "y", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lmaa;B)V", line = 3)
    public static final void method919(class495 arg0, byte arg1) {
        arg0.field7063 = null;
        ++field1894;
        int var2 = arg0.field7067.length;
        for (int var3 = 0; ~var3 > ~var2; ++var3) {
            arg0.field7067[var3].field9875 = false;
        }
        class343[] var4 = class418.field5724;
        synchronized (class418.field5724) {
            if (arg1 < -4) {
                if (var2 < class418.field5724.length && class40.field528[var2] < 200) {
                    class418.field5724[var2].method2173(-77, arg0);
                    int var10002 = class40.field528[var2]++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZILqfa;Ljava/lang/String;)Lnk;", line = 36)
    public static final class747 method920(boolean arg0, int arg1, class106 arg2, String arg3) {
        if (arg0) {
            method920(false, -69, (class106) null, (String) null);
        }
        ++field1896;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg1, var4);
        OpenGL.glProgramStringARB(arg1, 34933, arg3);
        OpenGL.glGetIntegerv(34379, class791.field10887, 0);
        if (class791.field10887[0] != -1) {
            OpenGL.glBindProgramARB(arg1, 0);
            return null;
        } else {
            OpenGL.glBindProgramARB(arg1, 0);
            return new class747(arg2, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(Lko;Lwia;Lui;)V", line = 63)
    public class121(class529 arg0, class791 arg1, class240 arg2) {
        super(arg0);
        this.field1893 = arg2;
        this.field1889 = arg0;
        if (arg1 != null && this.field1893.method1598((byte) -74) && this.field1889.field7670) {
            this.field1891 = class40.method308(this.field1889, 34336, true, arg1.method4362("transparent_water", "gl", (byte) 71));
        } else {
            this.field1891 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)Z", line = 82)
    public final boolean method921(int arg0) {
        int var2 = -115 / ((19 - arg0) / 52);
        ++field1890;
        return this.field1891 != null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lfb;I)V", line = 93)
    public static final void method922(class702 arg0, int arg1) {
        ++field1901;
        if (arg1 != 0) {
            method919((class495) null, (byte) 78);
        }
        class513 var2 = (class513) class585.field8269.method2242((long) arg0.field4640, arg1 + -1);
        if (var2 != null) {
            var2.method3095(106);
        } else {
            class303.method1961((class282) null, (class665) null, arg0, arg0.field4672[0], arg0.field4670[0], 118, 0, arg0.field5755);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IBI)V", line = 112)
    public final void method923(int arg0, byte arg1, int arg2) {
        if (arg1 >= 5) {
            if (!this.field1893.field3604) {
                int var4 = super.field7086.field2434 % 4000 * 16 / 4000;
                super.field7086.method1118(0, this.field1893.field3599[var4]);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
            } else {
                float var5 = (float) (super.field7086.field2434 % 4000) / 4000.0F;
                super.field7086.method1118(0, this.field1893.field3600);
                OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
            }
            ++field1897;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lwia;BII)Lie;", line = 138)
    public static final class6 method924(class791 arg0, byte arg1, int arg2, int arg3) {
        ++field1892;
        byte[] var4 = arg0.method4339(arg2, 0, arg3);
        if (var4 == null) {
            return null;
        } else {
            return arg1 >= -49 ? null : new class6(var4);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BILkja;)V", line = 154)
    public final void method925(byte arg0, int arg1, class684 arg2) {
        ++field1888;
        if (arg0 < 83) {
            this.field1891 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 165)
    public final void method926(int arg0) {
        ++field1900;
        super.field7086.method1180(0, (byte) 91, class605.field8453);
        if (arg0 != -339) {
            this.method921(18);
        }
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIII)V", line = 180)
    public static final void method927(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1899;
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg5 * arg5;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        if (arg0 != 5026) {
            method922((class702) null, 43);
        }
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = (1 - var12) * var8 - -var10;
        int var14 = -((var12 + -1) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg4 << 1) + -3) * var11;
        int var19 = (var6 - -1) * var16;
        class434.method2601(class746.field10330[arg1], -arg5 + arg2, arg3, (byte) -62, arg2 + arg5);
        int var20 = (arg4 + -1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (~var13 > -1) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var19 += var16;
                    ++var6;
                }
            }
            if (~var14 > -1) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var17 += var16;
                ++var6;
            }
            var13 += -var20;
            var14 += -var18;
            var18 -= var15;
            --var7;
            var20 -= var15;
            int var21 = arg1 - var7;
            int var22 = arg1 + var7;
            int var23 = arg2 + var6;
            int var24 = -var6 + arg2;
            class434.method2601(class746.field10330[var21], var24, arg3, (byte) -62, var23);
            class434.method2601(class746.field10330[var22], var24, arg3, (byte) -62, var23);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ZB)V", line = 263)
    public final void method928(boolean arg0, byte arg1) {
        super.field7086.method1080(class776.field10666, class624.field8745, -30);
        ++field1895;
        int var3 = -87 % ((24 - arg1) / 46);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IZ)V", line = 275)
    public final void method929(int arg0, boolean arg1) {
        OpenGL.glBindProgramARB(34336, this.field1891.field720);
        ++field1898;
        OpenGL.glEnable(34336);
        if (arg0 >= -83) {
            this.field1891 = null;
        }
        super.field7086.method1180(0, (byte) 91, class639.field8962);
    }
}
