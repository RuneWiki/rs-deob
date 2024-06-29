import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class615 extends class626 {

    @OriginalMember(owner = "client!jia", name = "o", descriptor = "Luea;")
    private class315 field8885;

    @OriginalMember(owner = "client!jia", name = "h", descriptor = "I")
    public int field8878;

    @OriginalMember(owner = "client!jia", name = "p", descriptor = "I")
    public int field8886;

    @OriginalMember(owner = "client!jia", name = "n", descriptor = "Loea;")
    private class594 field8884;

    @OriginalMember(owner = "client!jia", name = "z", descriptor = "F")
    public float field8896;

    @OriginalMember(owner = "client!jia", name = "i", descriptor = "[I")
    private int[] field8879;

    @OriginalMember(owner = "client!jia", name = "w", descriptor = "I")
    public int field8893;

    @OriginalMember(owner = "client!jia", name = "l", descriptor = "I")
    public int field8882;

    @OriginalMember(owner = "client!jia", name = "C", descriptor = "Lon;")
    private class335 field8899;

    @OriginalMember(owner = "client!jia", name = "x", descriptor = "Lqca;")
    public static class115 field8894 = new class115(4, 1, 1, 1);

    @OriginalMember(owner = "client!jia", name = "j", descriptor = "I")
    public static int field8880;

    @OriginalMember(owner = "client!jia", name = "k", descriptor = "I")
    public static int field8881;

    @OriginalMember(owner = "client!jia", name = "m", descriptor = "I")
    public static int field8883;

    @OriginalMember(owner = "client!jia", name = "q", descriptor = "I")
    public static int field8887;

    @OriginalMember(owner = "client!jia", name = "r", descriptor = "I")
    public static int field8888;

    @OriginalMember(owner = "client!jia", name = "u", descriptor = "I")
    public static int field8891;

    @OriginalMember(owner = "client!jia", name = "v", descriptor = "I")
    public static int field8892;

    @OriginalMember(owner = "client!jia", name = "y", descriptor = "I")
    public static int field8895;

    @OriginalMember(owner = "client!jia", name = "A", descriptor = "I")
    public static int field8897;

    @OriginalMember(owner = "client!jia", name = "B", descriptor = "I")
    public static int field8898;

    @OriginalMember(owner = "client!jia", name = "s", descriptor = "Ldda;")
    private class379 field8889;

    @OriginalMember(owner = "client!jia", name = "D", descriptor = "Ljaclib/memory/Stream;")
    private Stream field8900;

    @OriginalMember(owner = "client!jia", name = "t", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field8890;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(IFIBI)V", line = 3)
    public final void method3532(int arg0, float arg1, int arg2, byte arg3, int arg4) {
        int var6 = 110 / ((56 - arg3) / 40);
        if (this.field8893 != -1) {
            class546 var7 = this.field8884.field1084.method1154(-102, this.field8893);
            int var8 = var7.field7707 & 0xFF;
            if (var8 != 0 && var7.field7711 != 4) {
                int var9;
                if (arg2 < 0) {
                    var9 = 0;
                } else if (arg2 <= 127) {
                    var9 = arg2 * 131586;
                } else {
                    var9 = 16777215;
                }
                if (var8 == 256) {
                    arg4 = var9;
                } else {
                    int var11 = 256 - var8;
                    arg4 = ((var9 & 0xFF00) * var8 + ((arg4 & 0xFF00) * var11) & 0xFF0000) + ((arg4 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field7696 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = ((arg4 & 0xFF0000) >> 16) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = ((arg4 & 0xFF00) >> 8) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (arg4 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                arg4 = (var15 >> 8) + ((var13 << 8 & 0xFF00E6) + (var14 & 0xFF00));
            }
        }
        field8880++;
        this.field8900.method3775(arg0 * 4);
        if (arg1 != 1.0F) {
            int var16 = (arg4 & 0xFF44B2) >> 16;
            int var17 = arg4 >> 8 & 0xFF;
            int var18 = arg4 & 0xFF;
            int var19 = (int) ((float) var16 * arg1);
            int var20 = (int) ((float) var17 * arg1);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var21 = (int) ((float) var18 * arg1);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            if (var21 < 0) {
                var21 = 0;
            } else if (var21 > 255) {
                var21 = 255;
            }
            arg4 = var21 | var19 << 16 | var20 << 8;
        }
        this.field8900.method3772((byte) (arg4 >> 16));
        this.field8900.method3772((byte) (arg4 >> 8));
        this.field8900.method3772((byte) arg4);
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(BI)V", line = 113)
    public final void method3533(byte arg0, int arg1) {
        field8888++;
        this.field8900.method3775(arg1 * 4 + 3);
        this.field8900.method3772(arg0);
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(B)V", line = 128)
    public static void method3534(byte arg0) {
        field8894 = null;
        if (arg0 >= -79) {
            field8894 = null;
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(I)V", line = 139)
    public static final void method3535(int arg0) {
        field8881++;
        class224.field3206 = null;
        if (arg0 < 59) {
            method3534((byte) -56);
        }
        if (class200.field2876 && class190.method1336((byte) -106) != 1) {
            class16.method100(class394.method2447(-2), 0, class611.field8839 == 3 || class611.field8839 == 7, 5093, class389.method2428((byte) 34), 0);
        }
        int var1 = 0;
        int var2 = 0;
        if (class200.field2876) {
            var1 = class228.method1570((byte) 73);
            var2 = class252.method1712((byte) 37);
        }
        class165.method1226(var1, class401.field5610, var2 + class363.field5105, var2, var2, (byte) 60, var1 + class206.field2956, var1, -1);
        if (class224.field3206 != null) {
            class749.method4169(class206.field2956 + var1, class224.field3206, class363.field5105 + var2, class148.field2266.field794, -4183, true, var2, -1412584499, class369.field5173, class306.field4310, var1);
            class224.field3206 = null;
        }
    }

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "(B)V", line = 174)
    public static final void method3536(byte arg0) {
        class510.field7279 = -1;
        class459.field6628 = null;
        field8883++;
        if (arg0 <= 32) {
            field8894 = null;
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "([BB)Z", line = 190)
    public static final boolean method3537(byte[] arg0, byte arg1) {
        field8887++;
        class35 var2 = new class35(arg0);
        int var3 = var2.method273(255);
        if (var3 != 2) {
            return false;
        } else if (arg1 > -42) {
            return false;
        } else {
            boolean var4 = var2.method273(255) == 1;
            if (var4) {
                class387.method2419(true, var2);
            }
            class401.method2478(var2, -89);
            return true;
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(II)V", line = 218)
    public final void method3538(int arg0, int arg1) {
        field8898++;
        this.field8900.method3761();
        class635 var3 = this.field8884.method3482(this.field8890, false, arg1 * 4, 4, (byte) 42);
        this.field8889 = new class379(var3, 5121, 4, arg0);
        this.field8890 = null;
        this.field8900 = null;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(II[I)V", line = 238)
    public final void method3539(int arg0, int arg1, int[] arg2) {
        field8895++;
        int var4 = 0;
        class427 var5 = this.field8884.field8688;
        var5.field469 = 0;
        if (this.field8884.field8682) {
            for (int var12 = 0; var12 < arg1; var12++) {
                int var14 = arg2[var12];
                short[] var15 = this.field8885.field4439[var14];
                int var16 = this.field8879[var14];
                if (var16 != 0 && var15 != null) {
                    int var17 = 0;
                    int var18 = 0;
                    while (var15.length > var18) {
                        if ((0x1 << var17++ & var16) == 0) {
                            var18 += 3;
                        } else {
                            var5.method223(1493807496, var15[var18++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method223(1493807496, var15[var18++] & 0xFFFF);
                            var5.method223(1493807496, var15[var18++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var6 = 0; var6 < arg1; var6++) {
                int var7 = arg2[var6];
                short[] var8 = this.field8885.field4439[var7];
                int var9 = this.field8879[var7];
                if (var9 != 0 && var8 != null) {
                    int var10 = 0;
                    int var11 = 0;
                    while (var8.length > var11) {
                        if ((var9 & 0x1 << var10++) == 0) {
                            var11 += 3;
                        } else {
                            var5.method237(false, var8[var11++] & 0xFFFF);
                            var4++;
                            var4++;
                            var5.method237(false, var8[var11++] & 0xFFFF);
                            var5.method237(false, var8[var11++] & 0xFFFF);
                            var4++;
                        }
                    }
                }
            }
        }
        if (var4 > 0) {
            this.field8899.method53(var5.field469, -6562, 5123, var5.field483);
            this.field8884.method3409(this.field8885.field4475, this.field8885.field4480, this.field8889, this.field8885.field4483, (byte) 123);
            this.field8884.method3465(-106, ~(this.field8885.field4459 & 0x7) != -1, (this.field8885.field4459 & 0x8) != 0, this.field8893);
            if (this.field8884.field8656) {
                this.field8884.method596(Integer.MAX_VALUE, this.field8886, this.field8882, this.field8878);
            }
            OpenGL.glMatrixMode(5890);
            OpenGL.glPushMatrix();
            OpenGL.glScalef(1.0F / this.field8896, 1.0F / this.field8896, 1.0F);
            OpenGL.glMatrixMode(5888);
            this.field8884.method3409(this.field8885.field4475, this.field8885.field4480, this.field8889, this.field8885.field4483, (byte) 122);
            this.field8884.method3420((byte) -108, var4, this.field8899, 0, 4);
            OpenGL.glMatrixMode(5890);
            OpenGL.glPopMatrix();
            OpenGL.glMatrixMode(5888);
        }
        int var13 = 21 % ((36 - arg0) / 58);
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(IIII)V", line = 364)
    public final void method3540(int arg0, int arg1, int arg2, int arg3) {
        field8891++;
        if (arg2 != 65535) {
            this.method3532(-53, -0.44283646F, 96, (byte) -125, 12);
        }
        this.field8879[this.field8885.field3924 * arg0 + arg3] = class164.method1221(this.field8879[this.field8885.field3924 * arg0 + arg3], 0x1 << arg1);
    }

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "(II)V", line = 379)
    public final void method3541(int arg0, int arg1) {
        this.field8890 = this.field8884.field8543.method3758(arg1 * 4, true);
        field8897++;
        if (arg0 != -25173) {
            this.field8893 = 42;
        }
        this.field8900 = new Stream(this.field8890);
    }

    @OriginalMember(owner = "client!jia", name = "<init>", descriptor = "(Luea;IIIII)V", line = 391)
    public class615(class315 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field8885 = arg0;
        this.field8878 = arg5;
        this.field8886 = arg3;
        this.field8884 = this.field8885.field4445;
        this.field8896 = arg2;
        this.field8879 = new int[this.field8885.field3924 * this.field8885.field3914];
        this.field8893 = arg1;
        this.field8882 = arg4;
        this.field8899 = new class335(this.field8884, 5123, null, 1);
    }
}
