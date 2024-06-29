import jaggl.OpenGL;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class749 implements class666 {

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    private int field10415 = -1;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "[Lcf;")
    private class605[] field10405 = new class605[9];

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
    private int field10425 = 0;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "Lrda;")
    private class663 field10423;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    private int field10404;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Lkg;")
    public static class275 field10401 = new class275(10, 2, 2, 0);

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    private int field10400;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field10402;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    private int field10403;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field10406;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field10407;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field10408;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field10409;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field10410;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field10411;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field10412;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field10413;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field10414;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field10416;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public static int field10417;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    public static int field10418;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public static int field10419;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public static int field10420;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public static int field10421;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    public static int field10422;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
    public static int field10424;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
    public static int field10426;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
    private int field10427;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
    public static int field10428;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    public static int field10429;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "Llt;")
    public static class676 field10430;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nh", name = "G", descriptor = "Ljava/lang/Class;")
    public static Class field10431;

    // $FF: synthetic method
    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method4202(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)Z", line = 3)
    public final boolean method4187(int arg0) {
        field10409++;
        int var2 = -49 % ((-arg0 - 24) / 62);
        int var3 = OpenGL.glCheckFramebufferStatusEXT(this.field10415);
        return var3 == 36053;
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V", line = 24)
    public final void method3674(int arg0) {
        field10410++;
        int var2 = 95 % ((arg0 - 66) / 42);
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field10425 &= 0xFFFFFFFE;
        this.field10415 = this.method4197((byte) 49);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lsia;III)V", line = 36)
    private final void method4188(class737 arg0, int arg1, int arg2, int arg3) {
        field10426++;
        if (this.field10415 == -1) {
            throw new RuntimeException();
        }
        int var5 = 0x1 << arg1;
        if ((~var5 & this.field10427) == arg3) {
            this.field10400 = arg0.field10195;
            this.field10403 = arg0.field10191;
        } else if (this.field10400 != arg0.field10195 || this.field10403 != arg0.field10191) {
            throw new RuntimeException();
        }
        arg0.method4113(this.field10415, arg2, (byte) 85, class306.field4406[arg1]);
        this.field10405[arg1] = arg0;
        this.field10427 |= var5;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)V", line = 65)
    public final void method3677(boolean arg0) {
        if (!arg0) {
            this.field10405 = null;
        }
        OpenGL.glBindFramebufferEXT(36160, 0);
        field10406++;
        this.field10425 &= 0xFFFFFFFB;
        this.field10415 = this.method4197((byte) 74);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V", line = 78)
    public static final void method4189(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class557.field7336 = true;
        class88.field1068 = class184.field2781.method466() > 0;
        class430.field5926 = arg15;
        class458.field6258 = arg1 >> class140.field2224;
        class610.field8134 = arg3 >> class140.field2224;
        class58.field705 = arg1;
        class270.field3784 = arg3;
        class419.field5778 = arg2;
        class601.field7891 = class458.field6258 - class183.field2779;
        if (class601.field7891 < 0) {
            class704.field9770 = -class601.field7891;
            class601.field7891 = 0;
        } else {
            class704.field9770 = 0;
        }
        class675.field9363 = class610.field8134 - class183.field2779;
        if (class675.field9363 < 0) {
            class678.field9462 = -class675.field9363;
            class675.field9363 = 0;
        } else {
            class678.field9462 = 0;
        }
        class104.field1435 = class458.field6258 + class183.field2779;
        if (class104.field1435 > class735.field10163) {
            class104.field1435 = class735.field10163;
        }
        class78.field954 = class610.field8134 + class183.field2779;
        if (class78.field954 > class143.field2290) {
            class78.field954 = class143.field2290;
        }
        boolean[][] var19 = class672.field9269;
        boolean[][] var20 = class48.field604;
        if (class430.field5926) {
            for (int var21 = 0; var21 < class183.field2779 + class183.field2779 + 2; var21++) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class183.field2779 + class183.field2779 + 2; var24++) {
                    if (var24 > 1) {
                        class762.field10625[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class458.field6258 + var21 - class183.field2779;
                    int var26 = class610.field8134 + var24 - class183.field2779;
                    if (var25 >= 0 && var26 >= 0 && var25 < class735.field10163 && var26 < class143.field2290) {
                        int var27 = var25 << class140.field2224;
                        int var28 = var26 << class140.field2224;
                        int var29 = class113.field1866[class113.field1866.length - 1].method1742(var25, 71, var26) - (0x3E8 << class140.field2224 - 7);
                        int var30 = class588.field7675 == null ? class113.field1866[0].method1742(var25, 115, var26) + class384.field5377 : class588.field7675[0].method1742(var25, 40, var26) + class384.field5377;
                        var23 = arg16 >= 0 ? class184.field2781.method400(var27, var29, var28, var27, var30, var28, arg16) : class184.field2781.method438(var27, var29, var28, var27, var30, var28);
                        class48.field604[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class48.field604[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class762.field10625[var24 - 1] & class762.field10625[var24] & var22 & var23;
                        class672.field9269[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class762.field10625[class183.field2779 + class183.field2779] = var22;
                class762.field10625[class183.field2779 + class183.field2779 + 1] = var23;
            }
            if (arg16 >= 0) {
                class557.field7336 = false;
            } else {
                class503.field6750 = arg5;
                class365.field5126 = arg6;
                class90.field1094 = arg7;
                class48.field615 = arg8;
                class682.field9524 = arg9;
                class752.method4216(class184.field2781, arg10, 0);
            }
        } else {
            if (class604.field7942 == null) {
                class604.field7942 = new boolean[class735.field10163 + class735.field10163 + 1][class735.field10163 + class143.field2290 + 1];
            }
            for (int var32 = 0; var32 < class604.field7942.length; var32++) {
                for (int var42 = 0; var42 < class604.field7942[0].length; var42++) {
                    class604.field7942[var32][var42] = true;
                }
            }
            class48.field604 = class604.field7942;
            class672.field9269 = class604.field7942;
            class601.field7891 = 0;
            class675.field9363 = 0;
            class104.field1435 = class735.field10163;
            class78.field954 = class143.field2290;
            class557.field7336 = false;
        }
        class207.method1386(-22, class184.field2781);
        if (!class277.field3864.field9595) {
            class687 var33 = class277.field3864.field9586;
            for (class733 var34 = (class733) var33.method3874((byte) 23); var34 != null; var34 = (class733) var33.method3868(-24951)) {
                var34.method2815(-127);
                class500.method2819(var34, (byte) 31);
            }
        }
        if (class88.field1068) {
            for (int var35 = 0; var35 < class295.field4220; var35++) {
                class573.field7526[var35].method3880(-12091, arg0, arg14);
            }
        }
        if (class260.field3627) {
            class692.field9642 = class184.field2781.method469();
            class184.field2781.method393(class127.field2091);
            int var36 = (class127.field2091[2] - class127.field2091[0]) / class333.field4736;
            for (int var37 = 0; var37 < class333.field4736 - 1; var37++) {
                class568.field7468[var37] = (var37 + 1) * var36 + class190.field2865[var37];
            }
            for (int var38 = 0; var38 < class550.field7263.length; var38++) {
                class550.field7263[var38].method3276();
            }
        }
        if (class681.field9516 != null) {
            if (class260.field3627) {
                class380.method2245(0);
            }
            class503.method2832(true);
            class184.field2781.method490(-1, 1583160, 40, 127);
            class127.method1004(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class260.field3627) {
                class416.method2413();
            }
            class184.field2781.method478();
            class503.method2832(false);
        }
        class127.method1004(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class260.field3627) {
            for (int var39 = 0; var39 < class225.field3201; var39++) {
                class54.field657[var39] = class204.field3053[var39];
            }
            class380.method2245(0);
            for (int var40 = 0; var40 < class550.field7263.length; var40++) {
                class550.field7263[var40].method3276();
            }
        }
        if (class260.field3627) {
            class416.method2413();
            for (int var41 = 0; var41 < class225.field3201; var41++) {
                class204.field3053[var41] = class54.field657[var41];
            }
            if (class361.field5091 == 2) {
                int var10002;
                if (class557.field7331[0] < class557.field7331[1]) {
                    if (class568.field7468[0] + class190.field2865[0] > class127.field2091[0]) {
                        var10002 = class190.field2865[0]++;
                    }
                } else if (class557.field7331[0] > class557.field7331[1] && class568.field7468[0] + class190.field2865[0] < class127.field2091[2]) {
                    var10002 = class190.field2865[0]--;
                }
            }
        }
        if (!class430.field5926) {
            class672.field9269 = var19;
            class48.field604 = var20;
        }
        class165.method1185();
    }

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "(I)V", line = 357)
    public static final void method4190(int arg0) {
        class334.field4750++;
        field10424++;
        class583 var1 = class381.method2246(1, class128.field2105, class565.field7439);
        var1.field7637.method3831(1182, class589.field7684);
        class42.method309(var1, arg0 + arg0);
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(Z)V", line = 370)
    public static final void method4191(boolean arg0) {
        try {
            if (!arg0) {
                method4190(-62);
            }
            Method var1 = (field10431 == null ? (field10431 = method4202("java.lang.Runtime")) : field10431).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class692.field9641 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
        field10417++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)V", line = 411)
    public final void method4192(int arg0, int arg1) {
        field10418++;
        if (arg1 < 2) {
            this.method4187(88);
        }
        if (this.field10415 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class306.field4406[arg0]);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V", line = 429)
    public static void method4193(byte arg0) {
        field10430 = null;
        field10401 = null;
        if (arg0 != 19) {
            method4199(3, 117, null, -77, 76);
        }
    }

    @OriginalMember(owner = "client!nh", name = "finalize", descriptor = "()V", line = 443)
    protected final void finalize() throws Throwable {
        field10414++;
        this.field10423.method3624(this.field10404, -15493);
        super.finalize();
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 452)
    public final void method3672(int arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field10404);
        field10412++;
        this.field10425 |= 0x4;
        if (arg0 != -1358) {
            this.field10403 = -68;
        }
        this.field10415 = this.method4197((byte) 76);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ldw;II)V", line = 466)
    public final void method4194(class719 arg0, int arg1, int arg2) {
        field10419++;
        if (this.field10415 == -1) {
            throw new RuntimeException();
        }
        if (arg1 != 15061) {
            this.method3674(-57);
        }
        int var4 = 0x1 << arg2;
        if ((this.field10427 & ~var4) == 0) {
            this.field10403 = arg0.field10019;
            this.field10400 = arg0.field10018;
        } else if (this.field10400 != arg0.field10018 || this.field10403 != arg0.field10019) {
            throw new RuntimeException();
        }
        arg0.method4032(this.field10415, class306.field4406[arg2], arg1 ^ 0xFFFF809F);
        this.field10405[arg2] = arg0;
        this.field10427 |= var4;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILsia;)V", line = 497)
    public final void method4195(int arg0, int arg1, class737 arg2) {
        field10402++;
        this.method4188(arg2, arg1, 0, 0);
        if (arg0 != -22433) {
            this.method4187(105);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljc;III)V", line = 508)
    public final void method4196(class444 arg0, int arg1, int arg2, int arg3) {
        this.method4198(arg0, arg1, arg3, 1, arg2);
        field10413++;
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)I", line = 516)
    private final int method4197(byte arg0) {
        if (arg0 <= 39) {
            this.field10405 = null;
        }
        field10429++;
        if ((this.field10425 & 0x4) != 0) {
            return 36160;
        } else if ((this.field10425 & 0x2) == 0) {
            return (this.field10425 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lrda;)V", line = 679)
    public class749(class663 arg0) {
        if (!arg0.field8985) {
            throw new IllegalStateException("");
        }
        this.field10423 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class396.field5525, 0);
        this.field10404 = class396.field5525[0];
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljc;IIII)V", line = 544)
    private final void method4198(class444 arg0, int arg1, int arg2, int arg3, int arg4) {
        field10422++;
        if (this.field10415 == -1) {
            throw new RuntimeException();
        }
        int var6 = arg3 << arg4;
        if ((this.field10427 & ~var6) == 0) {
            this.field10400 = arg0.field6108;
            this.field10403 = arg0.field6108;
        } else if (this.field10400 != arg0.field6108 || this.field10403 != arg0.field6108) {
            throw new RuntimeException();
        }
        arg0.method2553(this.field10415, arg1, arg2, class306.field4406[arg4], false);
        this.field10405[arg4] = arg0;
        this.field10427 |= var6;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V", line = 572)
    public final void method3675(boolean arg0) {
        field10411++;
        OpenGL.glBindFramebufferEXT(36009, this.field10404);
        this.field10425 |= 0x2;
        this.field10415 = this.method4197((byte) 96);
        if (!arg0) {
            this.method3676((byte) -44);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILma;II)V", line = 588)
    public static final void method4199(int arg0, int arg1, class11 arg2, int arg3, int arg4) {
        field10420++;
        long var5 = (long) (arg4 | arg3 << 28 | arg0 << 14);
        class635 var7 = (class635) class649.field8627.method2135(var5, (byte) 31);
        if (arg1 != 0) {
            return;
        }
        if (var7 == null) {
            class635 var8 = new class635();
            class649.field8627.method2143(arg1 - 1, var8, var5);
            var8.field8446.method11(arg2, arg1 ^ 0xFFFFFF9C);
            return;
        }
        class597 var9 = class77.field948.method1165((byte) 95, arg2.field179);
        int var10 = var9.field7814;
        if (var9.field7832 == 1) {
            var10 = (arg2.field176 + 1) * var10;
        }
        for (class11 var11 = (class11) var7.field8446.method21(2); var11 != null; var11 = (class11) var7.field8446.method9(-127)) {
            class597 var12 = class77.field948.method1165((byte) 73, var11.field179);
            int var13 = var12.field7814;
            if (var12.field7832 == 1) {
                var13 = (var11.field176 + 1) * var13;
            }
            if (var10 > var13) {
                class499.method2814(var11, (byte) 109, arg2);
                return;
            }
        }
        var7.field8446.method11(arg2, -119);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V", line = 638)
    public final void method3676(byte arg0) {
        if (arg0 != -67) {
            this.method4197((byte) 30);
        }
        field10421++;
        OpenGL.glBindFramebufferEXT(36008, this.field10404);
        this.field10425 |= 0x1;
        this.field10415 = this.method4197((byte) 58);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)V", line = 653)
    public final void method4200(int arg0, int arg1) {
        field10416++;
        if (this.field10405[arg1] != null) {
            this.field10405[arg1].method2032((byte) 111);
        }
        this.field10427 &= ~(arg0 << arg1);
        this.field10405[arg1] = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)V", line = 692)
    public final void method4201(int arg0, boolean arg1) {
        field10407++;
        if (arg1) {
            return;
        }
        if (this.field10415 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class306.field4406[arg0]);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V", line = 706)
    public final void method3673(int arg0) {
        if (arg0 != -19346) {
            this.field10425 = -80;
        }
        field10408++;
        OpenGL.glBindFramebufferEXT(36009, 0);
        this.field10425 &= 0xFFFFFFFD;
        this.field10415 = this.method4197((byte) 44);
    }
}
