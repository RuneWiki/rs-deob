import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class284 {

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Z")
    public static boolean field4476 = false;

    @OriginalMember(owner = "client!sj", name = "v", descriptor = "[I")
    public static int[] field4491 = new int[14];

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public int field4480;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
    public int field4486;

    @OriginalMember(owner = "client!sj", name = "r", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!sj", name = "s", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
    public int field4490;

    @OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!sj", name = "x", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!sj", name = "y", descriptor = "I")
    public int field4494;

    @OriginalMember(owner = "client!sj", name = "z", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!sj", name = "p", descriptor = "[[I")
    public int[][] field4485;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "[[S")
    public static short[][] field4477;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public final void method1907(int arg0) {
        int var2 = 18 / ((arg0 + 52) / 62);
        for (int var3 = 0; var3 < this.field4490; var3++) {
            for (int var4 = 0; var4 < this.field4486; var4++) {
                if (var3 == 0 || var4 == 0 || var3 >= (this.field4490 - 5) || var4 >= this.field4486 - 5) {
                    this.field4485[var3][var4] = -1;
                } else {
                    this.field4485[var3][var4] = 2097152;
                }
            }
        }
        field4475++;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILjava/lang/String;Lna;B)Lim;")
    public static final class297 method1908(int arg0, String arg1, class211 arg2, byte arg3) {
        field4474++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        int var6 = -31 / ((arg3 - 22) / 35);
        OpenGL.glShaderSourceARB(var4, arg1);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class205.field3135, 0);
        if (class205.field3135[0] == 0) {
            if (class205.field3135[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class205.field3135, 1);
            if (class205.field3135[1] > 1) {
                byte[] var7 = new byte[class205.field3135[1]];
                OpenGL.glGetInfoLogARB(var4, class205.field3135[1], class205.field3135, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class205.field3135[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class297(arg2, var4, arg0);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)V")
    public final void method1909(int arg0, int arg1, int arg2) {
        int var4 = arg1 - this.field4480;
        field4482++;
        if (arg2 == -1) {
            int var5 = arg0 - this.field4494;
            this.field4485[var5][var4] = class410.method2621(this.field4485[var5][var4], 262144);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZI)V")
    public final void method1910(int arg0, boolean arg1, int arg2) {
        field4473++;
        int var4 = arg2 - this.field4494;
        int var5 = arg0 - this.field4480;
        if (!arg1) {
            this.field4485 = null;
        }
        this.field4485[var4][var5] = class272.method1842(this.field4485[var4][var5], -262145);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIIIIB)Z")
    public final boolean method1911(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9) {
        field4471++;
        int var11 = arg6 + arg7;
        int var12 = arg0 + arg3;
        int var13 = 51 / ((25 - arg9) / 39);
        int var14 = arg2 + arg1;
        int var15 = arg4 + arg5;
        if (arg6 == var14 && (arg8 & 0x2) == 0) {
            int var16 = arg0 <= arg4 ? arg4 : arg0;
            int var17 = var12 < var15 ? var12 : var15;
            while (var16 < var17) {
                if ((this.field4485[var14 - this.field4494 - 1][var16 - this.field4480] & 0x8) == 0) {
                    return true;
                }
                var16++;
            }
        } else if (arg2 == var11 && (arg8 & 0x8) == 0) {
            int var18 = arg0 > arg4 ? arg0 : arg4;
            int var19 = var12 < var15 ? var12 : var15;
            while (var18 < var19) {
                if ((this.field4485[arg2 - this.field4494][var18 - this.field4480] & 0x80) == 0) {
                    return true;
                }
                var18++;
            }
        } else if (arg0 == var15 && (arg8 & 0x1) == 0) {
            int var20 = arg2 < arg6 ? arg6 : arg2;
            int var21 = var14 > var11 ? var11 : var14;
            while (var21 > var20) {
                if ((this.field4485[var20 - this.field4494][var15 - this.field4480 - 1] & 0x2) == 0) {
                    return true;
                }
                var20++;
            }
        } else if (arg4 == var12 && (arg8 & 0x4) == 0) {
            int var22 = arg2 >= arg6 ? arg2 : arg6;
            int var23 = var11 >= var14 ? var14 : var11;
            while (var23 > var22) {
                if ((this.field4485[var22 - this.field4494][arg4 - this.field4480] & 0x20) == 0) {
                    return true;
                }
                var22++;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBIIIIIII)Z")
    public final boolean method1912(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4481++;
        if (arg8 > 1) {
            return class263.method1805(arg2, arg8, arg0, arg6, (byte) 105, arg4, arg8, arg3, arg5) ? true : this.method1911(arg3, arg0, arg4, arg8, arg6, arg5, arg2, arg8, arg7, (byte) 113);
        }
        int var10 = arg4 + arg0 - 1;
        int var11 = arg5 + arg6 - 1;
        if (arg2 >= arg4 && var10 >= arg2 && arg3 >= arg6 && var11 >= arg3) {
            return true;
        } else if ((arg4 - 1) == arg2 && arg3 >= arg6 && arg3 <= var11 && (this.field4485[arg2 - this.field4494][arg3 - this.field4480] & 0x8) == 0 && (arg7 & 0x8) == 0) {
            return true;
        } else if (var10 + 1 == arg2 && arg6 <= arg3 && var11 >= arg3 && (this.field4485[arg2 - this.field4494][arg3 - this.field4480] & 0x80) == 0 && (arg7 & 0x2) == 0) {
            return true;
        } else if ((arg6 - 1) == arg3 && arg4 <= arg2 && var10 >= arg2 && (this.field4485[arg2 - this.field4494][arg3 - this.field4480] & 0x2) == 0 && (arg7 & 0x4) == 0) {
            return true;
        } else if ((var11 + 1) == arg3 && arg2 >= arg4 && var10 >= arg2 && (this.field4485[arg2 - this.field4494][arg3 - this.field4480] & 0x20) == 0 && (arg7 & 0x1) == 0) {
            return true;
        } else {
            return arg1 < 2;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIZIIZ)V")
    public final void method1913(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, boolean arg7) {
        field4495++;
        int var9 = 256;
        if (arg7) {
            var9 |= 0x20000;
        }
        if (arg4) {
            var9 |= 0x40000000;
        }
        if (arg1 < 10) {
            return;
        }
        if (arg0 == 1 || arg0 == 3) {
            int var10 = arg3;
            arg3 = arg2;
            arg2 = var10;
        }
        int var11 = arg6 - this.field4480;
        int var12 = arg5 - this.field4494;
        for (int var13 = var12; var13 < arg3 + var12; var13++) {
            if (var13 >= 0 && var13 < this.field4490) {
                for (int var14 = var11; var14 < (arg2 + var11); var14++) {
                    if (var14 >= 0 && this.field4486 > var14) {
                        this.method1919(var14, -17400, var9, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZIZIIII)V")
    public final void method1914(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field4479++;
        int var8 = arg3 - this.field4494;
        int var9 = arg6 - this.field4480;
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method1919(var9, -17400, 128, var8);
                this.method1919(var9, -17400, 8, var8 - 1);
            }
            if (arg4 == 1) {
                this.method1919(var9, arg5 - 17398, 2, var8);
                this.method1919(var9 + 1, -17400, 32, var8);
            }
            if (arg4 == 2) {
                this.method1919(var9, arg5 - 17398, 8, var8);
                this.method1919(var9, arg5 - 17398, 128, var8 + 1);
            }
            if (arg4 == 3) {
                this.method1919(var9, -17400, 32, var8);
                this.method1919(var9 - 1, arg5 ^ 0x43F6, 2, var8);
            }
        }
        if (~arg1 == arg5 || arg1 == 3) {
            if (arg4 == 0) {
                this.method1919(var9, -17400, 1, var8);
                this.method1919(var9 + 1, -17400, 16, var8 - 1);
            }
            if (arg4 == 1) {
                this.method1919(var9, arg5 ^ 0x43F6, 4, var8);
                this.method1919(var9 + 1, -17400, 64, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1919(var9, -17400, 16, var8);
                this.method1919(var9 - 1, arg5 ^ 0x43F6, 1, var8 + 1);
            }
            if (arg4 == 3) {
                this.method1919(var9, arg5 ^ 0x43F6, 64, var8);
                this.method1919(var9 - 1, -17400, 4, var8 - 1);
            }
        }
        if (arg1 == 2) {
            if (arg4 == 0) {
                this.method1919(var9, arg5 ^ 0x43F6, 130, var8);
                this.method1919(var9, -17400, 8, var8 - 1);
                this.method1919(var9 + 1, -17400, 32, var8);
            }
            if (arg4 == 1) {
                this.method1919(var9, -17400, 10, var8);
                this.method1919(var9 + 1, -17400, 32, var8);
                this.method1919(var9, -17400, 128, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1919(var9, -17400, 40, var8);
                this.method1919(var9, -17400, 128, var8 + 1);
                this.method1919(var9 - 1, -17400, 2, var8);
            }
            if (arg4 == 3) {
                this.method1919(var9, arg5 - 17398, 160, var8);
                this.method1919(var9 - 1, arg5 ^ 0x43F6, 2, var8);
                this.method1919(var9, -17400, 8, var8 - 1);
            }
        }
        if (arg0) {
            if (arg1 == 0) {
                if (arg4 == 0) {
                    this.method1919(var9, -17400, 65536, var8);
                    this.method1919(var9, -17400, 4096, var8 - 1);
                }
                if (arg4 == 1) {
                    this.method1919(var9, -17400, 1024, var8);
                    this.method1919(var9 + 1, -17400, 16384, var8);
                }
                if (arg4 == 2) {
                    this.method1919(var9, arg5 ^ 0x43F6, 4096, var8);
                    this.method1919(var9, -17400, 65536, var8 + 1);
                }
                if (arg4 == 3) {
                    this.method1919(var9, arg5 ^ 0x43F6, 16384, var8);
                    this.method1919(var9 - 1, -17400, 1024, var8);
                }
            }
            if (arg1 == 1 || arg1 == 3) {
                if (arg4 == 0) {
                    this.method1919(var9, -17400, 512, var8);
                    this.method1919(var9 + 1, -17400, 8192, var8 - 1);
                }
                if (arg4 == 1) {
                    this.method1919(var9, arg5 ^ 0x43F6, 2048, var8);
                    this.method1919(var9 + 1, -17400, 32768, var8 + 1);
                }
                if (arg4 == 2) {
                    this.method1919(var9, -17400, 8192, var8);
                    this.method1919(var9 - 1, arg5 ^ 0x43F6, 512, var8 + 1);
                }
                if (arg4 == 3) {
                    this.method1919(var9, -17400, 32768, var8);
                    this.method1919(var9 - 1, -17400, 2048, var8 - 1);
                }
            }
            if (arg1 == 2) {
                if (arg4 == 0) {
                    this.method1919(var9, -17400, 66560, var8);
                    this.method1919(var9, -17400, 4096, var8 - 1);
                    this.method1919(var9 + 1, -17400, 16384, var8);
                }
                if (arg4 == 1) {
                    this.method1919(var9, arg5 ^ 0x43F6, 5120, var8);
                    this.method1919(var9 + 1, -17400, 16384, var8);
                    this.method1919(var9, -17400, 65536, var8 + 1);
                }
                if (arg4 == 2) {
                    this.method1919(var9, -17400, 20480, var8);
                    this.method1919(var9, -17400, 65536, var8 + 1);
                    this.method1919(var9 - 1, -17400, 1024, var8);
                }
                if (arg4 == 3) {
                    this.method1919(var9, -17400, 81920, var8);
                    this.method1919(var9 - 1, arg5 ^ 0x43F6, 1024, var8);
                    this.method1919(var9, arg5 ^ 0x43F6, 4096, var8 - 1);
                }
            }
        }
        if (!arg2) {
            return;
        }
        if (arg1 == 0) {
            if (arg4 == 0) {
                this.method1919(var9, -17400, 536870912, var8);
                this.method1919(var9, arg5 - 17398, 33554432, var8 - 1);
            }
            if (arg4 == 1) {
                this.method1919(var9, arg5 - 17398, 8388608, var8);
                this.method1919(var9 + 1, -17400, 134217728, var8);
            }
            if (arg4 == 2) {
                this.method1919(var9, -17400, 33554432, var8);
                this.method1919(var9, -17400, 536870912, var8 + 1);
            }
            if (arg4 == 3) {
                this.method1919(var9, -17400, 134217728, var8);
                this.method1919(var9 - 1, -17400, 8388608, var8);
            }
        }
        if (arg1 == 1 || arg1 == 3) {
            if (arg4 == 0) {
                this.method1919(var9, -17400, 4194304, var8);
                this.method1919(var9 + 1, -17400, 67108864, var8 - 1);
            }
            if (arg4 == 1) {
                this.method1919(var9, -17400, 16777216, var8);
                this.method1919(var9 + 1, arg5 ^ 0x43F6, 268435456, var8 + 1);
            }
            if (arg4 == 2) {
                this.method1919(var9, -17400, 67108864, var8);
                this.method1919(var9 - 1, -17400, 4194304, var8 + 1);
            }
            if (arg4 == 3) {
                this.method1919(var9, arg5 ^ 0x43F6, 268435456, var8);
                this.method1919(var9 - 1, -17400, 16777216, var8 - 1);
            }
        }
        if (arg1 != 2) {
            return;
        }
        if (arg4 == 0) {
            this.method1919(var9, -17400, 545259520, var8);
            this.method1919(var9, arg5 - 17398, 33554432, var8 - 1);
            this.method1919(var9 + 1, arg5 + -17398, 134217728, var8);
        }
        if (arg4 == 1) {
            this.method1919(var9, -17400, 41943040, var8);
            this.method1919(var9 + 1, -17400, 134217728, var8);
            this.method1919(var9, -17400, 536870912, var8 + 1);
        }
        if (arg4 == 2) {
            this.method1919(var9, arg5 - 17398, 167772160, var8);
            this.method1919(var9, -17400, 536870912, var8 + 1);
            this.method1919(var9 - 1, -17400, 8388608, var8);
        }
        if (arg4 == 3) {
            this.method1919(var9, -17400, 671088640, var8);
            this.method1919(var9 - 1, -17400, 8388608, var8);
            this.method1919(var9, -17400, 33554432, var8 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(JZLza;)V")
    public static final void method1915(long arg0, boolean arg1, class497 arg2) {
        class463.field7122 = 0;
        field4493++;
        class14.field151 = class537.field7866;
        class537.field7866 = 0;
        long var4 = class246.method1705((byte) 28);
        for (class356 var6 = (class356) class518.field7685.method2616(255); var6 != null; var6 = (class356) class518.field7685.method2619(255)) {
            if (var6.method2348(arg2, arg0)) {
                class463.field7122++;
            }
        }
        if (class109.field1558 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + class518.field7685.method2617(false) + ", running: " + class463.field7122 + ". Particles: " + class537.field7866 + ". Time taken: " + (class246.method1705((byte) 28) - var4) + "ms");
        }
        if (arg1) {
            method1924(-101);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIZ)V")
    public final void method1916(int arg0, int arg1, boolean arg2) {
        int var4 = arg0 - this.field4494;
        field4472++;
        int var5 = arg1 - this.field4480;
        if (arg2) {
            this.field4485[var4][var5] = class272.method1842(this.field4485[var4][var5], -2097153);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIZIIZI)V")
    public final void method1917(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6) {
        field4470++;
        int var8 = 256;
        if (arg2) {
            var8 |= 0x20000;
        }
        if (arg5) {
            var8 |= 0x40000000;
        }
        int var9 = arg6 - this.field4480;
        int var10 = arg3 - this.field4494;
        if (arg1 != 0) {
            this.method1907(-101);
        }
        for (int var11 = var10; var11 < (arg0 + var10); var11++) {
            if (var11 >= 0 && var11 < this.field4490) {
                for (int var12 = var9; var12 < arg4 + var9; var12++) {
                    if (var12 >= 0 && var12 < this.field4486) {
                        this.method1922(var12, var8, var11, (byte) -125);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIIIIII)Z")
    public final boolean method1918(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4483++;
        if (arg2 == 1) {
            if (arg0 == arg3 && arg1 == arg6) {
                return true;
            }
        } else if (arg0 <= arg3 && arg3 <= (arg0 + arg2 - 1) && arg1 <= arg1 && (arg1 + arg2 - 1) >= arg1) {
            return true;
        }
        if (arg7 < 51) {
            return false;
        }
        int var9 = arg1 - this.field4480;
        int var10 = arg3 - this.field4494;
        int var11 = arg6 - this.field4480;
        int var12 = arg0 - this.field4494;
        if (arg2 == 1) {
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var10 + 1) == var12 && var9 == var11 && (this.field4485[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && var9 - 1 == var11 && (this.field4485[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var10 - 1) == var12 && var9 == var11 && (this.field4485[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 - 1) == var11 && (this.field4485[var12][var11] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var10 - 1 == var12 && var9 == var11 && (this.field4485[var12][var11] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field4485[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var10 + 1 == var12 && var9 == var11 && (this.field4485[var12][var11] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 == var12 && (var9 + 1) == var11 && (this.field4485[var12][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var10 == var12 && var9 + 1 == var11 && (this.field4485[var12][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var12 && (var9 - 1) == var11 && (this.field4485[var12][var11] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var12 && var9 == var11 && (this.field4485[var12][var11] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var12 && var9 == var11 && (this.field4485[var12][var11] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = var12 + arg2 - 1;
            int var14 = arg2 + var11 - 1;
            if (arg5 == 6 || arg5 == 7) {
                if (arg5 == 7) {
                    arg4 = arg4 + 2 & 0x3;
                }
                if (arg4 == 0) {
                    if ((var10 + 1) == var12 && var11 <= var9 && var14 >= var9 && (this.field4485[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && var9 - arg2 == var11 && (this.field4485[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var10 - arg2) == var12 && var11 <= var9 && var9 <= var14 && (this.field4485[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var9 - arg2) == var11 && (this.field4485[var10][var14] & 0x2) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var10 - arg2 == var12 && var9 >= var11 && var9 <= var14 && (this.field4485[var13][var9] & 0x8) == 0) {
                        return true;
                    }
                    if (var10 >= var12 && var10 <= var13 && (var9 + 1) == var11 && (this.field4485[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var10 + 1) == var12 && var9 >= var11 && var9 <= var14 && (this.field4485[var12][var9] & 0x80) == 0) {
                        return true;
                    }
                    if (var12 <= var10 && var13 >= var10 && (var9 + 1) == var11 && (this.field4485[var10][var11] & 0x20) == 0) {
                        return true;
                    }
                }
            }
            if (arg5 == 8) {
                if (var12 <= var10 && var10 <= var13 && (var9 + 1) == var11 && (this.field4485[var10][var11] & 0x20) == 0) {
                    return true;
                }
                if (var10 >= var12 && var10 <= var13 && var9 - arg2 == var11 && (this.field4485[var10][var14] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - arg2) == var12 && var11 <= var9 && var9 <= var14 && (this.field4485[var13][var9] & 0x8) == 0) {
                    return true;
                }
                if ((var10 + 1) == var12 && var9 >= var11 && var9 <= var14 && (this.field4485[var12][var9] & 0x80) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIII)V")
    private final void method1919(int arg0, int arg1, int arg2, int arg3) {
        field4484++;
        if (arg1 == -17400) {
            this.field4485[arg3][arg0] = class272.method1842(this.field4485[arg3][arg0], ~arg2);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBIZIZI)V")
    public final void method1920(int arg0, byte arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        if (arg1 != 73) {
            field4476 = false;
        }
        field4489++;
        int var8 = arg4 - this.field4480;
        int var9 = arg2 - this.field4494;
        if (arg0 == 0) {
            if (arg6 == 0) {
                this.method1922(var8, 128, var9, (byte) -126);
                this.method1922(var8, 8, var9 - 1, (byte) -128);
            }
            if (arg6 == 1) {
                this.method1922(var8, 2, var9, (byte) -128);
                this.method1922(var8 + 1, 32, var9, (byte) -125);
            }
            if (arg6 == 2) {
                this.method1922(var8, 8, var9, (byte) -127);
                this.method1922(var8, 128, var9 + 1, (byte) -127);
            }
            if (arg6 == 3) {
                this.method1922(var8, 32, var9, (byte) -128);
                this.method1922(var8 - 1, 2, var9, (byte) -128);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg6 == 0) {
                this.method1922(var8, 1, var9, (byte) -126);
                this.method1922(var8 + 1, 16, var9 - 1, (byte) -125);
            }
            if (arg6 == 1) {
                this.method1922(var8, 4, var9, (byte) -127);
                this.method1922(var8 + 1, 64, var9 + 1, (byte) -128);
            }
            if (arg6 == 2) {
                this.method1922(var8, 16, var9, (byte) -126);
                this.method1922(var8 - 1, 1, var9 + 1, (byte) -126);
            }
            if (arg6 == 3) {
                this.method1922(var8, 64, var9, (byte) -128);
                this.method1922(var8 - 1, 4, var9 - 1, (byte) -125);
            }
        }
        if (arg0 == 2) {
            if (arg6 == 0) {
                this.method1922(var8, 130, var9, (byte) -126);
                this.method1922(var8, 8, var9 - 1, (byte) -125);
                this.method1922(var8 + 1, 32, var9, (byte) -128);
            }
            if (arg6 == 1) {
                this.method1922(var8, 10, var9, (byte) -127);
                this.method1922(var8 + 1, 32, var9, (byte) -126);
                this.method1922(var8, 128, var9 + 1, (byte) -127);
            }
            if (arg6 == 2) {
                this.method1922(var8, 40, var9, (byte) -125);
                this.method1922(var8, 128, var9 + 1, (byte) -127);
                this.method1922(var8 - 1, 2, var9, (byte) -125);
            }
            if (arg6 == 3) {
                this.method1922(var8, 160, var9, (byte) -125);
                this.method1922(var8 - 1, 2, var9, (byte) -127);
                this.method1922(var8, 8, var9 - 1, (byte) -125);
            }
        }
        if (arg5) {
            if (arg0 == 0) {
                if (arg6 == 0) {
                    this.method1922(var8, 65536, var9, (byte) -127);
                    this.method1922(var8, 4096, var9 - 1, (byte) -127);
                }
                if (arg6 == 1) {
                    this.method1922(var8, 1024, var9, (byte) -128);
                    this.method1922(var8 + 1, 16384, var9, (byte) -125);
                }
                if (arg6 == 2) {
                    this.method1922(var8, 4096, var9, (byte) -128);
                    this.method1922(var8, 65536, var9 + 1, (byte) -128);
                }
                if (arg6 == 3) {
                    this.method1922(var8, 16384, var9, (byte) -127);
                    this.method1922(var8 - 1, 1024, var9, (byte) -127);
                }
            }
            if (arg0 == 1 || arg0 == 3) {
                if (arg6 == 0) {
                    this.method1922(var8, 512, var9, (byte) -125);
                    this.method1922(var8 + 1, 8192, var9 - 1, (byte) -127);
                }
                if (arg6 == 1) {
                    this.method1922(var8, 2048, var9, (byte) -128);
                    this.method1922(var8 + 1, 32768, var9 + 1, (byte) -128);
                }
                if (arg6 == 2) {
                    this.method1922(var8, 8192, var9, (byte) -126);
                    this.method1922(var8 - 1, 512, var9 + 1, (byte) -126);
                }
                if (arg6 == 3) {
                    this.method1922(var8, 32768, var9, (byte) -126);
                    this.method1922(var8 - 1, 2048, var9 - 1, (byte) -127);
                }
            }
            if (arg0 == 2) {
                if (arg6 == 0) {
                    this.method1922(var8, 66560, var9, (byte) -128);
                    this.method1922(var8, 4096, var9 - 1, (byte) -125);
                    this.method1922(var8 + 1, 16384, var9, (byte) -128);
                }
                if (arg6 == 1) {
                    this.method1922(var8, 5120, var9, (byte) -128);
                    this.method1922(var8 + 1, 16384, var9, (byte) -128);
                    this.method1922(var8, 65536, var9 + 1, (byte) -126);
                }
                if (arg6 == 2) {
                    this.method1922(var8, 20480, var9, (byte) -125);
                    this.method1922(var8, 65536, var9 + 1, (byte) -127);
                    this.method1922(var8 - 1, 1024, var9, (byte) -125);
                }
                if (arg6 == 3) {
                    this.method1922(var8, 81920, var9, (byte) -127);
                    this.method1922(var8 - 1, 1024, var9, (byte) -126);
                    this.method1922(var8, 4096, var9 - 1, (byte) -128);
                }
            }
        }
        if (!arg3) {
            return;
        }
        if (arg0 == 0) {
            if (arg6 == 0) {
                this.method1922(var8, 536870912, var9, (byte) -126);
                this.method1922(var8, 33554432, var9 - 1, (byte) -128);
            }
            if (arg6 == 1) {
                this.method1922(var8, 8388608, var9, (byte) -125);
                this.method1922(var8 + 1, 134217728, var9, (byte) -126);
            }
            if (arg6 == 2) {
                this.method1922(var8, 33554432, var9, (byte) -127);
                this.method1922(var8, 536870912, var9 + 1, (byte) -127);
            }
            if (arg6 == 3) {
                this.method1922(var8, 134217728, var9, (byte) -128);
                this.method1922(var8 - 1, 8388608, var9, (byte) -125);
            }
        }
        if (arg0 == 1 || arg0 == 3) {
            if (arg6 == 0) {
                this.method1922(var8, 4194304, var9, (byte) -125);
                this.method1922(var8 + 1, 67108864, var9 - 1, (byte) -128);
            }
            if (arg6 == 1) {
                this.method1922(var8, 16777216, var9, (byte) -127);
                this.method1922(var8 + 1, 268435456, var9 + 1, (byte) -127);
            }
            if (arg6 == 2) {
                this.method1922(var8, 67108864, var9, (byte) -127);
                this.method1922(var8 - 1, 4194304, var9 + 1, (byte) -125);
            }
            if (arg6 == 3) {
                this.method1922(var8, 268435456, var9, (byte) -126);
                this.method1922(var8 - 1, 16777216, var9 - 1, (byte) -126);
            }
        }
        if (arg0 != 2) {
            return;
        }
        if (arg6 == 0) {
            this.method1922(var8, 545259520, var9, (byte) -127);
            this.method1922(var8, 33554432, var9 - 1, (byte) -125);
            this.method1922(var8 + 1, 134217728, var9, (byte) -125);
        }
        if (arg6 == 1) {
            this.method1922(var8, 41943040, var9, (byte) -128);
            this.method1922(var8 + 1, 134217728, var9, (byte) -128);
            this.method1922(var8, 536870912, var9 + 1, (byte) -128);
        }
        if (arg6 == 2) {
            this.method1922(var8, 167772160, var9, (byte) -125);
            this.method1922(var8, 536870912, var9 + 1, (byte) -127);
            this.method1922(var8 - 1, 8388608, var9, (byte) -126);
        }
        if (arg6 == 3) {
            this.method1922(var8, 671088640, var9, (byte) -127);
            this.method1922(var8 - 1, 8388608, var9, (byte) -127);
            this.method1922(var8, 33554432, var9 - 1, (byte) -128);
            return;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(IIIIIIII)Z")
    public final boolean method1921(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4488++;
        if (arg0 == 1) {
            if (arg3 == arg5 && arg1 == arg2) {
                return true;
            }
        } else if (arg5 <= arg3 && (arg0 + arg5 - 1) >= arg3 && arg2 <= arg2 && arg2 <= arg0 + arg2 - 1) {
            return true;
        }
        int var9 = arg2 - this.field4480;
        int var10 = arg3 - this.field4494;
        int var11 = arg5 - this.field4494;
        int var12 = arg1 - this.field4480;
        if (arg7 != 2883872) {
            return false;
        }
        if (arg0 == 1) {
            if (arg6 == 0) {
                if (arg4 == 0) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12 && (this.field4485[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field4485[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var10 == var11 && var9 + 1 == var12) {
                        return true;
                    }
                    if (var10 - 1 == var11 && var9 == var12 && (this.field4485[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field4485[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var10 + 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field4485[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field4485[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var10 == var11 && (var9 - 1) == var12) {
                        return true;
                    }
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field4485[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field4485[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg4 == 0) {
                    if (var10 - 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && (var9 + 1) == var12) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12 && (this.field4485[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12 && (this.field4485[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var10 - 1 == var11 && var9 == var12 && (this.field4485[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12 && (this.field4485[var11][var12] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var10 - 1) == var11 && var9 == var12 && (this.field4485[var11][var12] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field4485[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 - 1 == var12) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if ((var10 - 1) == var11 && var9 == var12) {
                        return true;
                    }
                    if (var10 == var11 && var9 + 1 == var12 && (this.field4485[var11][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 == var12 && (this.field4485[var11][var12] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 == var11 && (var9 - 1) == var12) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var10 == var11 && var9 + 1 == var12 && (this.field4485[var11][var12] & 0x20) == 0) {
                    return true;
                }
                if (var10 == var11 && var9 - 1 == var12 && (this.field4485[var11][var12] & 0x2) == 0) {
                    return true;
                }
                if ((var10 - 1) == var11 && var9 == var12 && (this.field4485[var11][var12] & 0x8) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var9 == var12 && (this.field4485[var11][var12] & 0x80) == 0) {
                    return true;
                }
            }
        } else {
            int var13 = arg0 + var11 - 1;
            int var14 = var12 - (1 - arg0);
            if (arg6 == 0) {
                if (arg4 == 0) {
                    if (var10 - arg0 == var11 && var9 >= var12 && var14 >= var9) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var9 + 1) == var12 && (this.field4485[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var9 - arg0 == var12 && (this.field4485[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if (var11 <= var10 && var13 >= var10 && var9 + 1 == var12) {
                        return true;
                    }
                    if ((var10 - arg0) == var11 && var9 >= var12 && var14 >= var9 && (this.field4485[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 >= var12 && var9 <= var14 && (this.field4485[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if ((var10 + 1) == var11 && var12 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var9 + 1) == var12 && (this.field4485[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var9 - arg0) == var12 && (this.field4485[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var10 >= var11 && var10 <= var13 && (var9 - arg0) == var12) {
                        return true;
                    }
                    if ((var10 - arg0) == var11 && var12 <= var9 && var9 <= var14 && (this.field4485[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 >= var12 && var9 <= var14 && (this.field4485[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                }
            }
            if (arg6 == 2) {
                if (arg4 == 0) {
                    if ((var10 - arg0) == var11 && var12 <= var9 && var9 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var9 + 1) == var12) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 >= var12 && var9 <= var14 && (this.field4485[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var13 >= var10 && (var9 - arg0) == var12 && (this.field4485[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 1) {
                    if ((var10 - arg0) == var11 && var9 >= var12 && var14 >= var9 && (this.field4485[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var10 <= var13 && var9 + 1 == var12) {
                        return true;
                    }
                    if (var10 + 1 == var11 && var9 >= var12 && var14 >= var9) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && var9 - arg0 == var12 && (this.field4485[var10][var14] & 0x2C0102) == 0) {
                        return true;
                    }
                } else if (arg4 == 2) {
                    if (var10 - arg0 == var11 && var12 <= var9 && var14 >= var9 && (this.field4485[var13][var9] & 0x2C0108) == 0) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var9 + 1) == var12 && (this.field4485[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 >= var12 && var9 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && (var9 - arg0) == var12) {
                        return true;
                    }
                } else if (arg4 == 3) {
                    if (var10 - arg0 == var11 && var9 >= var12 && var9 <= var14) {
                        return true;
                    }
                    if (var11 <= var10 && var10 <= var13 && var9 + 1 == var12 && (this.field4485[var10][var12] & 0x2C0120) == 0) {
                        return true;
                    }
                    if ((var10 + 1) == var11 && var9 >= var12 && var14 >= var9 && (this.field4485[var11][var9] & 0x2C0180) == 0) {
                        return true;
                    }
                    if (var10 >= var11 && var13 >= var10 && (var9 - arg0) == var12) {
                        return true;
                    }
                }
            }
            if (arg6 == 9) {
                if (var10 >= var11 && var10 <= var13 && (var9 + 1) == var12 && (this.field4485[var10][var12] & 0x2C0120) == 0) {
                    return true;
                }
                if (var10 >= var11 && var13 >= var10 && (var9 - arg0) == var12 && (this.field4485[var10][var14] & 0x2C0102) == 0) {
                    return true;
                }
                if (var10 - arg0 == var11 && var12 <= var9 && var9 <= var14 && (this.field4485[var13][var9] & 0x2C0108) == 0) {
                    return true;
                }
                if (var10 + 1 == var11 && var9 >= var12 && var14 >= var9 && (this.field4485[var11][var9] & 0x2C0180) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIB)V")
    private final void method1922(int arg0, int arg1, int arg2, byte arg3) {
        this.field4485[arg2][arg0] = class410.method2621(this.field4485[arg2][arg0], arg1);
        field4492++;
        if (arg3 >= -124) {
            method1924(126);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBI)V")
    public final void method1923(int arg0, byte arg1, int arg2) {
        field4478++;
        int var4 = arg0 - this.field4494;
        int var5 = -49 / ((54 - arg1) / 38);
        int var6 = arg2 - this.field4480;
        this.field4485[var4][var6] = class410.method2621(this.field4485[var4][var6], 2097152);
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
    public static void method1924(int arg0) {
        field4491 = null;
        field4477 = null;
        if (arg0 != 22520) {
            method1915(14L, true, null);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBII)V")
    public static final void method1925(int arg0, byte arg1, int arg2, int arg3) {
        field4487++;
        class456 var4 = class233.method1654(arg3, 9, -116);
        var4.method2858(10250);
        var4.field7041 = arg2;
        if (arg1 < -10) {
            var4.field7042 = arg0;
        }
    }
}
