import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class382 extends class263 {

    @OriginalMember(owner = "client!fr", name = "z", descriptor = "I")
    public int field4912 = 0;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "Liq;")
    private class568 field4893;

    @OriginalMember(owner = "client!fr", name = "C", descriptor = "Lkea;")
    private class223 field4914;

    @OriginalMember(owner = "client!fr", name = "o", descriptor = "I")
    public int field4901;

    @OriginalMember(owner = "client!fr", name = "x", descriptor = "F")
    public float field4910;

    @OriginalMember(owner = "client!fr", name = "A", descriptor = "I")
    public int field4913;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "[I")
    private int[] field4895;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "I")
    public int field4896;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    public int field4894;

    @OriginalMember(owner = "client!fr", name = "u", descriptor = "Lpw;")
    public static class661 field4907 = new class661("", 17);

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!fr", name = "m", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!fr", name = "n", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!fr", name = "p", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!fr", name = "q", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!fr", name = "r", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!fr", name = "w", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!fr", name = "y", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!fr", name = "v", descriptor = "Lii;")
    private class519 field4908;

    @OriginalMember(owner = "client!fr", name = "t", descriptor = "Ljaclib/memory/Stream;")
    private Stream field4906;

    @OriginalMember(owner = "client!fr", name = "l", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field4898;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IZ)V")
    public final void method2194(int arg0, boolean arg1) {
        field4902++;
        this.field4906.method3530();
        this.field4908 = this.field4914.method341(115, arg1);
        this.field4908.method2813(-52, this.field4898, 4, arg0 * 4);
        this.field4906 = null;
        this.field4898 = null;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "([BB)Lxa;")
    public static final class468 method2195(byte[] arg0, byte arg1) {
        field4909++;
        if (arg1 != -76) {
            method2195(null, (byte) -53);
        }
        if (arg0 == null) {
            throw new RuntimeException("");
        }
        while (true) {
            try {
                Image var2 = Toolkit.getDefaultToolkit().createImage(arg0);
                MediaTracker var3 = new MediaTracker(class455.field5687);
                var3.addImage(var2, 0);
                var3.waitForAll();
                int var4 = var2.getWidth(class455.field5687);
                int var5 = var2.getHeight(class455.field5687);
                if (!var3.isErrorAny() && var4 >= 0 && var5 >= 0) {
                    int[] var6 = new int[var4 * var5];
                    PixelGrabber var7 = new PixelGrabber(var2, 0, 0, var4, var5, var6, 0, var4);
                    var7.grabPixels();
                    return class309.field3898.method428(var6, 0, var4, var4, var5);
                }
                throw new RuntimeException("");
            } catch (InterruptedException var8) {
            }
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "([IBI)V")
    public final void method2196(int[] arg0, byte arg1, int arg2) {
        field4899++;
        class13 var4 = this.field4914.method1293(20932, this.field4912 * 3);
        Buffer var5 = var4.method62(true, true);
        if (var5 == null) {
            return;
        }
        if (arg1 < 20) {
            this.method2196(null, (byte) 96, 47);
        }
        Stream var6 = this.field4914.method1289(-98, var5);
        int var7 = 0;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method3525()) {
            label126: for (int var10 = 0; var10 < arg2; var10++) {
                int var11 = arg0[var10];
                int var12 = this.field4895[var11];
                short[] var13 = this.field4893.field7119[var11];
                if (var12 != 0 && var13 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var15 >= var13.length) {
                                continue label126;
                            }
                            if ((0x1 << var14++ & var12) == 0) {
                                var15 += 3;
                            } else {
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var13[var15++] & 0xFFFF;
                                    var6.method3526(var17);
                                    if (var9 < var17) {
                                        var9 = var17;
                                    }
                                    if (var8 > var17) {
                                        var8 = var17;
                                    }
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        } else {
            label100: for (int var18 = 0; var18 < arg2; var18++) {
                int var20 = arg0[var18];
                short[] var21 = this.field4893.field7119[var20];
                int var22 = this.field4895[var20];
                if (var22 != 0 && var21 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var21.length <= var24) {
                                continue label100;
                            }
                            if ((0x1 << var23++ & var22) == 0) {
                                var24 += 3;
                            } else {
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var21[var24++] & 0xFFFF;
                                    if (var9 < var26) {
                                        var9 = var26;
                                    }
                                    if (var8 > var26) {
                                        var8 = var26;
                                    }
                                    var6.method3519(var26);
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        }
        var6.method3530();
        if (!var4.method61((byte) 96) || var7 <= 0) {
            return;
        }
        this.field4914.method1312((this.field4893.field7116 & 0x7) != 0, 0, this.field4901, (this.field4893.field7116 & 0x8) != 0);
        if (this.field4914.field2861) {
            this.field4914.method456(Integer.MAX_VALUE, this.field4894, this.field4896, this.field4913);
        }
        class581 var19 = this.field4914.method1336(0);
        var19.method3226(false, 1.0F / this.field4910, 1.0F / this.field4910, 1.0F);
        this.field4914.method1339(true, class228.field2942);
        this.field4914.method363(-92, 1, this.field4908);
        this.field4914.method344(28303, this.field4893.field7143);
        this.field4914.method375(0, (byte) 127, var8, var9 + 1 - var8, var7, class701.field9803, var4);
        this.field4914.method1324(0);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(ZLwv;Z)V")
    public static final void method2197(boolean arg0, class32 arg1, boolean arg2) {
        field4904++;
        class403 var3 = arg1.method209(2);
        if (arg1.field503 == 0) {
            class318.field3987 = 0;
            class174.field2037 = -1;
            arg1.field509 = 0;
            return;
        }
        if (arg1.field447 != -1 && arg1.field472 == 0) {
            class207 var4 = class11.field110.method1141(arg1.field447, (byte) -16);
            if (arg1.field506 > 0 && var4.field2424 == 0) {
                class318.field3987 = 0;
                arg1.field509++;
                class174.field2037 = -1;
                return;
            }
            if (arg1.field506 <= 0 && var4.field2443 == 0) {
                class318.field3987 = 0;
                class174.field2037 = -1;
                arg1.field509++;
                return;
            }
        }
        if (arg1.field429 != -1 && class665.field9027 >= arg1.field460) {
            class561 var5 = class339.field4336.method2158((byte) -25, arg1.field429);
            if (var5.field7006 && var5.field7016 != -1) {
                class207 var6 = class11.field110.method1141(var5.field7016, (byte) 126);
                if (arg1.field506 > 0 && var6.field2424 == 0) {
                    class174.field2037 = -1;
                    arg1.field509++;
                    class318.field3987 = 0;
                    return;
                }
                if (arg1.field506 <= 0 && var6.field2443 == 0) {
                    class318.field3987 = 0;
                    class174.field2037 = -1;
                    arg1.field509++;
                    return;
                }
            }
        }
        if (arg1.field429 != -1 && class665.field9027 >= arg1.field460) {
            class561 var7 = class339.field4336.method2158((byte) -25, arg1.field429);
            if (var7.field7006 && var7.field7016 != -1) {
                class207 var8 = class11.field110.method1141(var7.field7016, (byte) 113);
                if (arg1.field506 > 0 && var8.field2424 == 0) {
                    class318.field3987 = 0;
                    arg1.field509++;
                    class174.field2037 = -1;
                    return;
                }
                if (arg1.field506 <= 0 && var8.field2443 == 0) {
                    class174.field2037 = -1;
                    arg1.field509++;
                    class318.field3987 = 0;
                    return;
                }
            }
        }
        int var9 = arg1.field8018;
        int var10 = arg1.field8011;
        int var11 = arg1.field508[arg1.field503 - 1] * 512 + (arg1.method210(!arg0) * 256);
        int var12 = arg1.field511[arg1.field503 - 1] * 512 + (arg1.method210(false) * 256);
        if (var9 >= var11) {
            if (var9 <= var11) {
                if (var10 < var12) {
                    arg1.method228(34, 8192);
                } else if (var12 < var10) {
                    arg1.method228(115, 0);
                }
            } else if (var12 > var10) {
                arg1.method228(110, 6144);
            } else if (var10 > var12) {
                arg1.method228(122, 2048);
            } else {
                arg1.method228(103, 4096);
            }
        } else if (var12 > var10) {
            arg1.method228(55, 10240);
        } else if (var12 < var10) {
            arg1.method228(113, 14336);
        } else {
            arg1.method228(34, 12288);
        }
        byte var13 = arg1.field505[arg1.field503 - 1];
        if (!arg2 && var11 - var9 > 1024 || var11 - var9 < -1024 || var12 - var10 > 1024 || var12 - var10 < -1024) {
            arg1.field8018 = var11;
            arg1.field8011 = var12;
            arg1.method221(false, arg1.field408, 2);
            if (arg1.field506 > 0) {
                arg1.field506--;
            }
            class318.field3987 = 0;
            class174.field2037 = -1;
            arg1.field503--;
            return;
        }
        int var14 = 16;
        boolean var15 = arg0;
        if (arg1 instanceof class506) {
            var15 = ((class506) arg1).field6326.field9496;
        }
        if (var15) {
            int var16 = arg1.field408 - arg1.field477.field5467;
            if (var16 != 0 && arg1.field491 == -1 && arg1.field480 != 0) {
                var14 = 8;
            }
            if (!arg2 && arg1.field503 > 2) {
                var14 = 24;
            }
            if (!arg2 && arg1.field503 > 3) {
                var14 = 32;
            }
        } else {
            if (!arg2 && arg1.field503 > 1) {
                var14 = 24;
            }
            if (!arg2 && arg1.field503 > 2) {
                var14 = 32;
            }
        }
        if (arg1.field509 > 0 && arg1.field503 > 1) {
            arg1.field509--;
            var14 = 32;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field5185 != -1) {
            int var17 = var14 << 9;
            if (arg1.field503 == 1) {
                int var18 = arg1.field510 * arg1.field510;
                int var19 = (var11 >= arg1.field8018 ? var11 - arg1.field8018 : -var11 + arg1.field8018) << 9;
                int var20 = (var12 < arg1.field8011 ? arg1.field8011 - var12 : -arg1.field8011 + var12) << 9;
                int var21 = var20 >= var19 ? var20 : var19;
                int var22 = var21 * 2 * var3.field5185;
                if (var18 > var22) {
                    arg1.field510 /= 2;
                } else if (var18 / 2 > var21) {
                    arg1.field510 -= var3.field5185;
                    if (arg1.field510 < 0) {
                        arg1.field510 = 0;
                    }
                } else if (arg1.field510 < var17) {
                    arg1.field510 += var3.field5185;
                    if (arg1.field510 > var17) {
                        arg1.field510 = var17;
                    }
                }
            } else if (var17 > arg1.field510) {
                arg1.field510 += var3.field5185;
                if (arg1.field510 > var17) {
                    arg1.field510 = var17;
                }
            } else if (arg1.field510 > 0) {
                arg1.field510 -= var3.field5185;
                if (arg1.field510 < 0) {
                    arg1.field510 = 0;
                }
            }
            var14 = arg1.field510 >> 9;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class318.field3987 = 0;
        if (var9 == var11 && var10 == var12) {
            class174.field2037 = -1;
        } else {
            if (var11 > var9) {
                class318.field3987 |= 0x4;
                arg1.field8018 += var14;
                if (var11 < arg1.field8018) {
                    arg1.field8018 = var11;
                }
            } else if (var9 > var11) {
                class318.field3987 |= 0x8;
                arg1.field8018 -= var14;
                if (var11 > arg1.field8018) {
                    arg1.field8018 = var11;
                }
            }
            if (var10 < var12) {
                arg1.field8011 += var14;
                class318.field3987 |= 0x1;
                if (var12 < arg1.field8011) {
                    arg1.field8011 = var12;
                }
            } else if (var10 > var12) {
                class318.field3987 |= 0x2;
                arg1.field8011 -= var14;
                if (var12 > arg1.field8011) {
                    arg1.field8011 = var12;
                }
            }
            if (var14 >= 32) {
                class174.field2037 = 2;
            } else {
                class174.field2037 = var13;
            }
        }
        if (arg1.field8018 == var11 && arg1.field8011 == var12) {
            if (arg1.field506 > 0) {
                arg1.field506--;
            }
            arg1.field503--;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIII)V")
    public final void method2198(int arg0, int arg1, int arg2, int arg3) {
        this.field4895[this.field4893.field1685 * arg3 + arg0] = class364.method2113(this.field4895[this.field4893.field1685 * arg3 + arg0], 0x1 << arg2);
        field4897++;
        this.field4912++;
        if (arg1 != -14251) {
            method2199(-45);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
    public static void method2199(int arg0) {
        int var1 = 29 / ((arg0 - 29) / 60);
        field4907 = null;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
    public final void method2200(int arg0, int arg1) {
        if (arg1 != 26340) {
            this.field4912 = -34;
        }
        this.field4906.method3529(arg0 * 4 + 3);
        field4911++;
        this.field4906.method3521(-1);
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(FIIII)V")
    public final void method2201(float arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~this.field4901 != arg3) {
            class152 var6 = this.field4914.field8781.method2718(this.field4901, (byte) 72);
            int var7 = var6.field1820 & 0xFF;
            if (var7 != 0 && var6.field1809 != 4) {
                int var8;
                if (arg1 < 0) {
                    var8 = 0;
                } else if (arg1 > 127) {
                    var8 = 16777215;
                } else {
                    var8 = arg1 * 131586;
                }
                if (var7 == 256) {
                    arg4 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg4 = ((arg4 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg4 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field1816 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg4 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = (arg4 >> 8 & 0xFF) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg4 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg4 = (var13 & 0xFF00) + ((var12 << 8 & 0xFF003E) + (var14 >> 8));
            }
        }
        field4905++;
        if (arg0 != 1.0F) {
            int var15 = (arg4 & 0xFFC038) >> 16;
            int var16 = arg4 >> 8 & 0xFF;
            int var17 = (int) ((float) var15 * arg0);
            int var18 = arg4 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg0);
            int var20 = (int) ((float) var18 * arg0);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg4 = var20 | var19 << 8 | var17 << 16;
        }
        this.field4906.method3529(arg2 * 4);
        if (this.field4914.field2856 == 0) {
            this.field4906.method3521((byte) arg4);
            this.field4906.method3521((byte) (arg4 >> 8));
            this.field4906.method3521((byte) (arg4 >> 16));
        } else {
            this.field4906.method3521((byte) (arg4 >> 16));
            this.field4906.method3521((byte) (arg4 >> 8));
            this.field4906.method3521((byte) arg4);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IB)I")
    public static final int method2202(int arg0, byte arg1) {
        if (arg1 != 55) {
            method2199(-74);
        }
        field4900++;
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(II)V")
    public final void method2203(int arg0, int arg1) {
        field4903++;
        this.field4898 = this.field4914.method1288(true, arg1 * 4, -58);
        if (arg0 == 65535) {
            this.field4906 = new Stream(this.field4898, 0, arg1 * 4);
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Liq;IIIII)V")
    public class382(class568 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field4893 = arg0;
        this.field4914 = this.field4893.field7120;
        this.field4901 = arg1;
        this.field4910 = arg2;
        this.field4913 = arg5;
        this.field4895 = new int[this.field4893.field1685 * this.field4893.field1684];
        this.field4896 = arg4;
        this.field4894 = arg3;
    }
}
