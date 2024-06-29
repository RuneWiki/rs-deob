import jaggl.OpenGL;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class402 extends class314 {

    @OriginalMember(owner = "client!rp", name = "S", descriptor = "I")
    private int field6197 = 12288;

    @OriginalMember(owner = "client!rp", name = "T", descriptor = "I")
    private int field6198 = 0;

    @OriginalMember(owner = "client!rp", name = "P", descriptor = "I")
    private int field6194 = 2048;

    @OriginalMember(owner = "client!rp", name = "R", descriptor = "I")
    private int field6196 = 0;

    @OriginalMember(owner = "client!rp", name = "W", descriptor = "I")
    private int field6201 = 2048;

    @OriginalMember(owner = "client!rp", name = "db", descriptor = "I")
    private int field6208 = 8192;

    @OriginalMember(owner = "client!rp", name = "ab", descriptor = "I")
    private int field6205 = 4096;

    @OriginalMember(owner = "client!rp", name = "M", descriptor = "Lhga;")
    public static class158 field6192 = new class158(47, 3);

    @OriginalMember(owner = "client!rp", name = "Y", descriptor = "Z")
    public static boolean field6203 = false;

    @OriginalMember(owner = "client!rp", name = "bb", descriptor = "I")
    public static int field6206 = 1;

    @OriginalMember(owner = "client!rp", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field6210;

    @OriginalMember(owner = "client!rp", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field6204;

    @OriginalMember(owner = "client!rp", name = "L", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!rp", name = "N", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!rp", name = "Q", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!rp", name = "U", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!rp", name = "V", descriptor = "I")
    public static int field6200;

    @OriginalMember(owner = "client!rp", name = "X", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!rp", name = "eb", descriptor = "I")
    public static int field6209;

    @OriginalMember(owner = "client!rp", name = "gb", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!rp", name = "hb", descriptor = "I")
    public static int field6212;

    @OriginalMember(owner = "client!rp", name = "cb", descriptor = "Lk;")
    public static class525 field6207;

    @OriginalMember(owner = "client!rp", name = "c", descriptor = "(III)Z")
    private final boolean method2580(int arg0, int arg1, int arg2) {
        ++field6191;
        if (arg0 != -24533) {
            method2584(89, -69, 120, 101, -25, -49, 90, (byte) 120);
        }
        int var4 = (arg1 + arg2) * this.field6197 >> 12;
        int var5 = class174.field2873[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field6197;
        int var7 = (var6 << 12) / this.field6208;
        int var8 = this.field6205 * var7 >> 12;
        return ~(-arg2 + arg1) > ~var8 && ~(-var8) > ~(arg1 - arg2);
    }

    @OriginalMember(owner = "client!rp", name = "d", descriptor = "(III)Z")
    private final boolean method2581(int arg0, int arg1, int arg2) {
        ++field6200;
        if (arg0 < 97) {
            this.field6205 = -23;
        }
        int var4 = (arg2 - arg1) * this.field6197 >> 12;
        int var5 = class174.field2873[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field6197;
        int var7 = (var6 << 12) / this.field6208;
        int var8 = this.field6205 * var7 >> 12;
        return ~var8 < ~(arg1 - -arg2) && -var8 < arg1 + arg2;
    }

    @OriginalMember(owner = "client!rp", name = "h", descriptor = "(I)V")
    public static void method2582(int arg0) {
        field6207 = null;
        field6204 = null;
        if (arg0 != -1060549588) {
            method2585((class92) null, true, (class199[]) null);
        }
        field6210 = null;
        field6192 = null;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        ++field6211;
        if (arg1 < 109) {
            return null;
        } else {
            int[] var3 = super.field4928.method534((byte) -108, arg0);
            if (super.field4928.field618) {
                int var4 = class657.field9166[arg0] - 2048;
                for (int var5 = 0; class81.field1009 > var5; ++var5) {
                    int var6 = class328.field5091[var5] + -2048;
                    int var7 = this.field6194 + var6;
                    int var8 = ~var7 <= 2047 ? var7 : var7 + 4096;
                    int var9 = var8 <= 2048 ? var8 : var8 + -4096;
                    int var10 = this.field6196 + var4;
                    int var11 = var10 < -2048 ? var10 - -4096 : var10;
                    int var12 = ~var11 < -2049 ? var11 + -4096 : var11;
                    int var13 = this.field6198 + var6;
                    int var14 = ~var13 > 2047 ? var13 + 4096 : var13;
                    int var15 = ~var14 >= -2049 ? var14 : var14 + -4096;
                    int var16 = this.field6201 + var4;
                    int var17 = var16 >= -2048 ? var16 : var16 + 4096;
                    int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                    var3[var5] = !this.method2581(99, var9, var12) && !this.method2580(-24533, var18, var15) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2583(String arg0, int arg1) {
        ++field6193;
        if (!arg0.equals("")) {
            ++class393.field6139;
            class165 var2 = class271.method1917(class420.field6424, (byte) -64, class459.field6863);
            if (arg1 != 17378) {
                method2584(-8, -106, -71, -33, -41, -105, -102, (byte) -91);
            }
            var2.field2776.method65(class516.method3125(94, arg0), -77);
            var2.field2776.method28(arg0, 0);
            class642.method3726(-684096285, var2);
        }
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)V")
    public final void method3(byte arg0) {
        if (arg0 != -15) {
            this.field6201 = 124;
        }
        class46.method546(-15541);
        ++field6209;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method2584(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        ++field6195;
        int var8 = arg5 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (~var8 < -101) {
            var8 = 100;
        }
        int var9 = (class271.field4378 - class599.field8542) * var8 / 100 + class599.field8542;
        int var10 = arg0 * var9 >> 8;
        int var11 = -arg6 + 16384 & 16383;
        int var12 = -arg3 + 16384 & 16383;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (arg7 <= 68) {
            method2582(120);
        }
        if (~var11 != -1) {
            var14 = class567.field8139[var11] * -var10 >> 14;
            var15 = class567.field8138[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class567.field8139[var12] * var15 >> 14;
            var15 = class567.field8138[var12] * var15 >> 14;
        }
        class607.field8638 = -var14 + arg4;
        class675.field9521 = -var13 + arg2;
        class13.field197 = arg6;
        class412.field6318 = arg1 - var15;
        class617.field8744 = 0;
        class523.field7598 = arg3;
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ler;Z[Ljf;)Lcaa;")
    public static final class277 method2585(class92 arg0, boolean arg1, class199[] arg2) {
        ++field6199;
        for (int var3 = 0; var3 < arg2.length; ++var3) {
            if (arg2[var3] == null || ~arg2[var3].field3247 >= -1L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        int var6 = 0;
        if (arg1) {
            return null;
        } else {
            while (~arg2.length < ~var6) {
                OpenGL.glAttachObjectARB(var4, arg2[var6].field3247);
                ++var6;
            }
            OpenGL.glLinkProgramARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35714, class414.field6348, 0);
            if (~class414.field6348[0] == -1) {
                if (class414.field6348[0] == 0) {
                    System.out.println("Shader linking failed:");
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class414.field6348, 1);
                if (class414.field6348[1] > 1) {
                    byte[] var7 = new byte[class414.field6348[1]];
                    OpenGL.glGetInfoLogARB(var4, class414.field6348[1], class414.field6348, 0, var7, 0);
                    System.out.println(new String(var7));
                }
                if (~class414.field6348[0] == -1) {
                    for (int var8 = 0; arg2.length > var8; ++var8) {
                        OpenGL.glDetachObjectARB(var4, arg2[var8].field3247);
                    }
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            return new class277(arg0, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "()V")
    public class402() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(BLie;I)V")
    public final void method5(byte arg0, class6 arg1, int arg2) {
        ++field6212;
        if (arg0 >= -1) {
            this.method5((byte) 98, (class6) null, -102);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field6208 = arg1.method67(12021);
                                }
                            } else {
                                this.field6205 = arg1.method67(12021);
                            }
                        } else {
                            this.field6197 = arg1.method67(12021);
                        }
                    } else {
                        this.field6201 = arg1.method67(12021);
                    }
                } else {
                    this.field6198 = arg1.method67(12021);
                }
            } else {
                this.field6196 = arg1.method67(12021);
            }
        } else {
            this.field6194 = arg1.method67(12021);
        }
    }

    static {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception var11) {
        }
        var0.toLowerCase();
        String var1 = "Unknown";
        try {
            var1 = System.getProperty("java.version").toLowerCase();
        } catch (Exception var10) {
        }
        var1.toLowerCase();
        String var2 = "Unknown";
        try {
            var2 = System.getProperty("os.name").toLowerCase();
        } catch (Exception var9) {
        }
        field6210 = var2.toLowerCase();
        String var3 = "Unknown";
        try {
            var3 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception var8) {
        }
        field6204 = var3.toLowerCase();
        String var4 = "Unknown";
        try {
            var4 = System.getProperty("os.version").toLowerCase();
        } catch (Exception var7) {
        }
        var4.toLowerCase();
        String var5 = "~/";
        try {
            var5 = System.getProperty("user.home").toLowerCase();
        } catch (Exception var6) {
        }
        new File(var5);
    }
}
