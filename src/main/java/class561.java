import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class561 extends class663 implements class343 {

    @OriginalMember(owner = "client!ts", name = "l", descriptor = "I")
    private int field7693;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "Ljb;")
    public static class519 field7685 = new class519(102, 6);

    @OriginalMember(owner = "client!ts", name = "j", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field7691 = new Rectangle[100];

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
    public static int field7684;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
    public static int field7687;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
    public static int field7689;

    @OriginalMember(owner = "client!ts", name = "k", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!ts", name = "m", descriptor = "I")
    public static int field7694;

    @OriginalMember(owner = "client!ts", name = "n", descriptor = "I")
    public static int field7695;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "[Loq;")
    public static class378[] field7690;

    static {
        for (int var0 = 0; var0 < 100; ++var0) {
            field7691[var0] = new Rectangle();
        }
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(B)V", line = 4)
    public static final void method3199(byte arg0) {
        ++field7688;
        int var1 = class652.field8795;
        int[] var2 = class497.field6986;
        if (arg0 != 18) {
            field7691 = null;
        }
        for (int var3 = 0; var1 > var3; ++var3) {
            class758 var4 = class84.field1204[var2[var3]];
            if (var4 != null) {
                class377.method2361(var4.method2563(-12840), var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Lcc;[[BB)V", line = 33)
    public static final void method3200(class760 arg0, byte[][] arg1, byte arg2) {
        ++field7692;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; ~arg0.field6789 < ~var4; ++var4) {
            class324.method2095(arg2 + -162);
            for (int var9 = 0; class102.field1467 >> 3 > var9; ++var9) {
                for (int var10 = 0; var10 < class393.field5663 >> 3; ++var10) {
                    int var11 = class199.field2587[var4][var9][var10];
                    if (var11 != -1) {
                        int var12 = (56008691 & var11) >> 24;
                        if (!arg0.field6799 || ~var12 == -1) {
                            int var13 = (var11 & 7) >> 1;
                            int var14 = (16769802 & var11) >> 14;
                            int var15 = (var11 & 16377) >> 3;
                            int var16 = (var14 / 8 << 8) + var15 / 8;
                            for (int var17 = 0; var17 < class649.field8753.length; ++var17) {
                                if (~class649.field8753[var17] == ~var16 && arg1[var17] != null) {
                                    class254 var18 = new class254(arg1[var17]);
                                    arg0.method2855(var9 * 8, var12, var14, class257.field3830, var15, (byte) -128, var18, var13, var4, var10 * 8);
                                    arg0.method4190(class375.field5490, var14, (byte) 55, var9 * 8, var4, var15, var10 * 8, ~var3[0] != 0 ? null : var3, var13, var12, var18);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var5 = 0; ~var5 > ~arg0.field6789; ++var5) {
            class324.method2095(arg2 + -149);
            for (int var6 = 0; var6 < class102.field1467 >> 3; ++var6) {
                for (int var7 = 0; class393.field5663 >> 3 > var7; ++var7) {
                    int var8 = class199.field2587[var5][var6][var7];
                    if (var8 == -1) {
                        arg0.method2853((byte) 87, var7 * 8, var6 * 8, 8, 8, var5);
                    }
                }
            }
        }
        if (arg2 == 34) {
            if (~var3[0] != 0) {
                class126.field1734 = class629.field8517.method4132(var3[2], class297.field4200, var3[0], (byte) 108, var3[1], var3[3]);
                class627.field8498 = var3[4];
            }
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "([Lmca;Lsha;I)Ljd;", line = 148)
    public static final class243 method3201(class33[] arg0, class757 arg1, int arg2) {
        ++field7695;
        for (int var3 = 0; ~var3 > ~arg0.length; ++var3) {
            if (arg0[var3] == null || ~arg0[var3].field318 >= -1L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; arg0.length > var6; ++var6) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field318);
        }
        if (arg2 != 1) {
            method3199((byte) -83);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class520.field7229, 0);
        if (class520.field7229[0] == 0) {
            if (~class520.field7229[0] == -1) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class520.field7229, 1);
            if (~class520.field7229[1] < -2) {
                byte[] var7 = new byte[class520.field7229[1]];
                OpenGL.glGetInfoLogARB(var4, class520.field7229[1], class520.field7229, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (~class520.field7229[0] == -1) {
                for (int var8 = 0; ~var8 > ~arg0.length; ++var8) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field318);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class243(arg1, var4, arg0);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)I", line = 218)
    public final int method1761(int arg0) {
        int var2 = -54 / ((arg0 - -7) / 44);
        ++field7694;
        return 0;
    }

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)V", line = 233)
    public static void method3202(int arg0) {
        field7690 = null;
        field7685 = null;
        field7691 = null;
        int var1 = 22 / ((arg0 - -4) / 61);
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Llf;I[BI)V", line = 263)
    public class561(class250 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field7693 = arg1;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)I", line = 271)
    public final int method1765(int arg0) {
        int var2 = 3 / ((63 - arg0) / 38);
        ++field7686;
        return this.field7693;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(B)J", line = 283)
    public final long method1766(byte arg0) {
        ++field7689;
        return arg0 > -110 ? -33L : super.field8911.getAddress();
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I[BBI)V", line = 295)
    public final void method1762(int arg0, byte[] arg1, byte arg2, int arg3) {
        ++field7684;
        if (arg2 >= 48) {
            this.method3664(arg1, arg0);
            this.field7693 = arg3;
        }
    }
}
