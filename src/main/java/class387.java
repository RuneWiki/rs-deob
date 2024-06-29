import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class387 extends class407 implements class300 {

    @OriginalMember(owner = "client!hea", name = "y", descriptor = "Lcda;")
    public static class156 field5428 = new class156();

    @OriginalMember(owner = "client!hea", name = "E", descriptor = "I")
    public static int field5433 = 0;

    @OriginalMember(owner = "client!hea", name = "G", descriptor = "I")
    public static int field5435 = class565.method3125(-257, 1600);

    @OriginalMember(owner = "client!hea", name = "I", descriptor = "Z")
    public static boolean field5437 = false;

    @OriginalMember(owner = "client!hea", name = "K", descriptor = "F")
    public static float field5438;

    @OriginalMember(owner = "client!hea", name = "z", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!hea", name = "A", descriptor = "I")
    public static int field5430;

    @OriginalMember(owner = "client!hea", name = "C", descriptor = "I")
    public static int field5431;

    @OriginalMember(owner = "client!hea", name = "D", descriptor = "I")
    public static int field5432;

    @OriginalMember(owner = "client!hea", name = "F", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!hea", name = "H", descriptor = "Lpj;")
    public static class132 field5436;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(BLoa;)V", line = 4)
    public static final void method2229(byte arg0, class638 arg1) {
        ++field5431;
        if (arg0 == 117) {
            for (class401 var2 = (class401) class381.field5356.method3676((byte) -53); var2 != null; var2 = (class401) class381.field5356.method3682(-18176)) {
                if (var2.field5582) {
                    var2.method2284(arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILoa;Ljd;Lvu;)V", line = 30)
    public static final void method2230(int arg0, class638 arg1, class209 arg2, class307 arg3) {
        ++field5430;
        class461 var4 = arg3.method1890(arg1, 2);
        if (var4 != null) {
            int var5 = var4.method31();
            if (var4.method26() > var5) {
                var5 = var4.method26();
            }
            byte var6 = 10;
            int var7 = arg2.field3084;
            int var8 = arg2.field3079;
            if (arg0 <= -116) {
                int var9 = 0;
                int var10 = 0;
                int var11 = 0;
                if (arg3.field4517 != null) {
                    var9 = class424.field5975.method3319(class628.field8767, arg3.field4517, (class461[]) null, (int[]) null, 29169);
                    for (int var12 = 0; ~var12 > ~var9; ++var12) {
                        String var13 = class628.field8767[var12];
                        if (var12 < var9 + -1) {
                            var13 = var13.substring(0, var13.length() + -4);
                        }
                        int var14 = class117.field1561.method3409(var13);
                        if (~var10 > ~var14) {
                            var10 = var14;
                        }
                    }
                    var11 = class117.field1561.method3407() * var9 - -(class117.field1561.method3403() / 2);
                }
                int var15 = var5 / 2 + arg2.field3084;
                int var16 = arg2.field3079;
                if (class148.field2198 + var5 <= var7) {
                    if (~(-var5 + class148.field2212) > ~var7) {
                        var7 = -var5 + class148.field2212;
                        var15 = -(var10 / 2) + -var6 + class148.field2212 + -(var5 / 2) + -5;
                    }
                } else {
                    var15 = class148.field2198 - (-(var5 / 2) - 5) + var10 / 2 + var6;
                    var7 = class148.field2198;
                }
                if (var8 >= class148.field2204 - -var5) {
                    if (var8 > -var5 + class148.field2211) {
                        var16 = -(var5 / 2) + -var6 - var11 + class148.field2211;
                        var8 = -var5 + class148.field2211;
                    }
                } else {
                    var8 = class148.field2204;
                    var16 = var5 / 2 + class148.field2204 + var6;
                }
                int var17 = (int) (32767.0D * (Math.atan2((double) (-arg2.field3084 + var7), (double) (var8 - arg2.field3079)) / 3.141592653589793D)) & 65535;
                var4.method2655((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
                int var18 = -2;
                int var19 = -2;
                int var20 = -2;
                int var21 = -2;
                if (arg3.field4517 != null) {
                    var19 = var16;
                    var18 = var15 + -5 - var10 / 2;
                    var20 = var10 + var18 + 10;
                    var21 = var9 * class117.field1561.method3407() + var16 + 3;
                    if (~arg3.field4532 != -1) {
                        arg1.method3558((byte) 31, var16, arg3.field4532, -var18 + var20, -var16 + var21, var18);
                    }
                    if (arg3.field4520 != 0) {
                        arg1.method3562(arg3.field4520, 1, var21 - var16, var18, var16, -var18 + var20);
                    }
                    for (int var22 = 0; ~var9 < ~var22; ++var22) {
                        String var23 = class628.field8767[var22];
                        if (var9 + -1 > var22) {
                            var23 = var23.substring(0, -4 + var23.length());
                        }
                        class117.field1561.method3408(arg1, var23, var15, var16, arg3.field4509, true);
                        var16 += class117.field1561.method3407();
                    }
                }
                if (arg3.field4539 != -1 || arg3.field4517 != null) {
                    class534 var24 = new class534(arg2);
                    int var25 = var5 >> 1;
                    var24.field7269 = var20;
                    var24.field7273 = var18;
                    var24.field7274 = var8 + var25;
                    var24.field7264 = var19;
                    var24.field7261 = -var25 + var8;
                    var24.field7267 = var7 + var25;
                    var24.field7271 = -var25 + var7;
                    var24.field7263 = var21;
                    class154.field2325.method1273(var24, (byte) 122);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(ILjava/lang/String;)I", line = 183)
    public static final int method2231(int arg0, String arg1) {
        if (arg0 < 126) {
            return -39;
        } else {
            ++field5434;
            int var2 = arg1.length();
            int var3 = 0;
            for (int var4 = 0; ~var4 > ~var2; ++var4) {
                var3 = arg1.charAt(var4) + -var3 + (var3 << 5);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(B)V", line = 205)
    public static void method2232(byte arg0) {
        field5436 = null;
        field5428 = null;
        if (arg0 > -93) {
            method2231(120, (String) null);
        }
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "(Lmc;IZ[[I)V", line = 216)
    public class387(class120 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class583.field8126, class82.field1147, arg1 * arg1 * 6, arg2);
        super.field5749.method3232(false, this);
        if (!arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                OpenGL.glTexImage2Di(var5 + 34069, 0, this.method2322(false), arg1, arg1, 0, class422.method2400((byte) 61, super.field5740), super.field5749.field1666, arg3[var5], 0);
            }
        } else {
            for (int var6 = 0; var6 < 6; ++var6) {
                this.method2323(arg1, arg1, 16384, arg3[var6], var6 + 34069);
            }
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IILen;Ljava/lang/String;)Lhba;", line = 251)
    public static final class10 method2233(int arg0, int arg1, class289 arg2, String arg3) {
        ++field5429;
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        OpenGL.glShaderSourceARB(var4, arg3);
        if (arg1 <= 16) {
            method2232((byte) 26);
        }
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class656.field9243, 0);
        if (~class656.field9243[0] == -1) {
            if (~class656.field9243[0] == -1) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class656.field9243, 1);
            if (class656.field9243[1] > 1) {
                byte[] var6 = new byte[class656.field9243[1]];
                OpenGL.glGetInfoLogARB(var4, class656.field9243[1], class656.field9243, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (~class656.field9243[0] == -1) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class10(arg2, var4, arg0);
    }
}
