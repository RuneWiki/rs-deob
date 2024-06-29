import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class310 {

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "Z")
    public boolean field4908 = false;

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "[F")
    public float[] field4921 = new float[4];

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
    public int field4915;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "Z")
    public boolean field4911;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "Z")
    public boolean field4914;

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "I")
    public int field4925;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public int field4913;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public int field4906;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public int field4893;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "[S")
    public short[] field4902;

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
    public int field4918;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public int field4894;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    private int field4899;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "Lnk;")
    public static class2 field4917 = new class2();

    @OriginalMember(owner = "client!wi", name = "G", descriptor = "I")
    public static int field4923 = 0;

    @OriginalMember(owner = "client!wi", name = "F", descriptor = "S")
    public static short field4922 = 256;

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "Leg;")
    public static class188 field4926 = new class188(100);

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "F")
    public float field4898;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "F")
    public float field4903;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field4895;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    private int field4896;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    private int field4897;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    private int field4901;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "I")
    public static int field4919;

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
    private int field4924;

    @OriginalMember(owner = "client!wi", name = "K", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "Ljh;")
    public static class207 field4907;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Lwm;")
    public class31 field4892;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "Lce;")
    public static class8 field4910;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBI)V", line = 11)
    public static final void method2126(int arg0, byte arg1, int arg2) {
        if (arg1 < -121) {
            class121.field1869 = arg2 - class78.field1161;
            field4919++;
            class324.field5050 = class129.field2021 + class338.field5233 - arg0 - 1;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V", line = 26)
    public static final void method2127(byte arg0) {
        int var1 = 126 % ((arg0 + 27) / 54);
        field4927++;
        if (class112.method750(true) != 2) {
            return;
        }
        byte var2 = (byte) (class19.field260 - 4 & 0xFF);
        int var3 = class19.field260 % 104;
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var5 = 0; var5 < 104; var5++) {
                class97.field1512[var4][var3][var5] = var2;
            }
        }
        if (class77.field1154 == 3) {
            return;
        }
        for (int var6 = 0; var6 < 2; var6++) {
            class247.field3883[var6] = -1000000;
            class22.field275[var6] = 1000000;
            class38.field559[var6] = 0;
            class288.field4409[var6] = 1000000;
            class194.field2918[var6] = 0;
        }
        if (class219.field3489 != 1) {
            int var17 = class39.method286(class77.field1154, (byte) 82, class298.field4598, class225.field3592);
            if (var17 - class169.field2579 < 800 && (class305.field4784[class77.field1154][class298.field4598 >> 7][class225.field3592 >> 7] & 0x4) != 0) {
                class222.method1488((byte) -52, class225.field3592 >> 7, class298.field4598 >> 7, false, class90.field1375, 1);
            }
            return;
        }
        if ((class305.field4784[class77.field1154][class79.field1173.field537 >> 7][class79.field1173.field519 >> 7] & 0x4) != 0) {
            class222.method1488((byte) -52, class79.field1173.field519 >> 7, class79.field1173.field537 >> 7, false, class90.field1375, 0);
        }
        if (class199.field2989 >= 310) {
            return;
        }
        int var7 = class298.field4598 >> 7;
        int var8 = class225.field3592 >> 7;
        int var9 = class79.field1173.field519 >> 7;
        int var10 = class79.field1173.field537 >> 7;
        int var11;
        if (var10 > var7) {
            var11 = var10 - var7;
        } else {
            var11 = var7 - var10;
        }
        int var12;
        if (var8 < var9) {
            var12 = var9 - var8;
        } else {
            var12 = var8 - var9;
        }
        if (var11 == 0 && var12 == 0 || var11 <= -104 || var11 >= 104 || var12 <= -104 || var12 >= 104) {
            class291.method1892("RC: " + var7 + "," + var8 + " " + var10 + "," + var9 + " " + class30.field374 + "," + class294.field4535, (Throwable) null, -2);
            return;
        }
        if (var11 <= var12) {
            int var15 = 32768;
            int var16 = var11 * 65536 / var12;
            while (var8 != var9) {
                if (var9 > var8) {
                    var8++;
                } else if (var9 < var8) {
                    var8--;
                }
                if ((class305.field4784[class77.field1154][var7][var8] & 0x4) != 0) {
                    class222.method1488((byte) -52, var8, var7, false, class90.field1375, 1);
                    break;
                }
                var15 += var16;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var10 > var7) {
                        var7++;
                    } else if (var10 < var7) {
                        var7--;
                    }
                    if ((class305.field4784[class77.field1154][var7][var8] & 0x4) != 0) {
                        class222.method1488((byte) -52, var8, var7, false, class90.field1375, 1);
                        break;
                    }
                }
            }
            return;
        }
        int var13 = var12 * 65536 / var11;
        int var14 = 32768;
        while (var7 != var10) {
            if (var7 < var10) {
                var7++;
            } else if (var10 < var7) {
                var7--;
            }
            if ((class305.field4784[class77.field1154][var7][var8] & 0x4) != 0) {
                class222.method1488((byte) -52, var8, var7, false, class90.field1375, 1);
                break;
            }
            var14 += var13;
            if (var14 >= 65536) {
                var14 -= 65536;
                if (var8 < var9) {
                    var8++;
                } else if (var9 < var8) {
                    var8--;
                }
                if ((class305.field4784[class77.field1154][var7][var8] & 0x4) != 0) {
                    class222.method1488((byte) -52, var8, var7, false, class90.field1375, 1);
                    break;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V", line = 220)
    private final void method2128(int arg0) {
        field4916++;
        int var2 = 108 / ((arg0 + 4) / 38);
        int var3 = this.field4894;
        if (var3 == 2) {
            this.field4896 = 2048;
            this.field4924 = 1;
            this.field4897 = 0;
            this.field4901 = 2048;
        } else if (var3 == 3) {
            this.field4901 = 2048;
            this.field4896 = 4096;
            this.field4897 = 0;
            this.field4924 = 1;
        } else if (var3 == 4) {
            this.field4896 = 2048;
            this.field4924 = 4;
            this.field4897 = 0;
            this.field4901 = 2048;
        } else if (var3 == 5) {
            this.field4901 = 2048;
            this.field4896 = 8192;
            this.field4897 = 0;
            this.field4924 = 4;
        } else if (var3 == 12) {
            this.field4897 = 0;
            this.field4896 = 2048;
            this.field4924 = 2;
            this.field4901 = 2048;
        } else if (var3 == 13) {
            this.field4897 = 0;
            this.field4901 = 2048;
            this.field4924 = 2;
            this.field4896 = 8192;
        } else if (var3 == 10) {
            this.field4897 = 1536;
            this.field4896 = 2048;
            this.field4901 = 512;
            this.field4924 = 3;
        } else if (var3 == 11) {
            this.field4897 = 1536;
            this.field4901 = 512;
            this.field4896 = 4096;
            this.field4924 = 3;
        } else if (var3 == 6) {
            this.field4896 = 2048;
            this.field4897 = 1280;
            this.field4924 = 3;
            this.field4901 = 768;
        } else if (var3 == 7) {
            this.field4901 = 768;
            this.field4924 = 3;
            this.field4897 = 1280;
            this.field4896 = 4096;
        } else if (var3 == 8) {
            this.field4896 = 2048;
            this.field4897 = 1024;
            this.field4924 = 3;
            this.field4901 = 1024;
        } else if (var3 == 9) {
            this.field4901 = 1024;
            this.field4896 = 4096;
            this.field4924 = 3;
            this.field4897 = 1024;
        } else if (var3 == 14) {
            this.field4897 = 1280;
            this.field4901 = 768;
            this.field4896 = 2048;
            this.field4924 = 1;
        } else if (var3 == 15) {
            this.field4897 = 1536;
            this.field4901 = 512;
            this.field4924 = 1;
            this.field4896 = 4096;
        } else if (var3 == 16) {
            this.field4901 = 256;
            this.field4897 = 1792;
            this.field4896 = 8192;
            this.field4924 = 1;
        } else {
            this.field4897 = 0;
            this.field4924 = 0;
            this.field4896 = 2048;
            this.field4901 = 2048;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V", line = 417)
    public static void method2129(boolean arg0) {
        if (arg0) {
            field4926 = (class188) null;
        }
        field4910 = null;
        field4917 = null;
        field4926 = null;
        field4907 = null;
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V", line = 676)
    protected class310() {
        if (class320.field5008 == null) {
            class95.method645((byte) -85);
        }
        this.method2128(54);
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lgn;)V", line = 689)
    public class310(class303 arg0) {
        if (class320.field5008 == null) {
            class95.method645((byte) -85);
        }
        this.field4915 = arg0.method2043((byte) -117);
        this.field4911 = (this.field4915 & 0x8) != 0;
        this.field4914 = (this.field4915 & 0x10) != 0;
        this.field4915 &= 0x7;
        this.field4925 = arg0.method1994(false);
        this.field4913 = arg0.method1994(false);
        this.field4906 = arg0.method1994(false);
        this.field4893 = arg0.method2043((byte) -128);
        this.method2132(true);
        this.field4902 = new short[this.field4893 * 2 + 1];
        for (int var2 = 0; var2 < this.field4902.length; var2++) {
            this.field4902[var2] = (short) arg0.method1994(false);
        }
        this.field4918 = class12.field129[arg0.method1994(false)];
        int var3 = arg0.method2043((byte) -106);
        this.field4894 = var3 & 0x1F;
        this.field4899 = var3 & 0xE0 << 3;
        if (this.field4894 != 31) {
            this.method2128(-124);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIII)V", line = 444)
    public final void method2130(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4904++;
        this.field4897 = arg0;
        this.field4901 = arg3;
        this.field4896 = arg1;
        this.field4924 = arg2;
        if (arg4 != 11) {
            this.method2131(false, 21, 17);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZII)V", line = 468)
    public final void method2131(boolean arg0, int arg1, int arg2) {
        field4912++;
        int var4 = this.field4899 + (this.field4896 * arg1 / 50) & 0x7FF;
        int var5 = this.field4924;
        int var6;
        if (var5 == 1) {
            var6 = (class12.field121[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class320.field5008[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg0) {
            var6 = 2048;
        }
        this.field4903 = (float) ((this.field4901 * var6 >> 11) + this.field4897) / 2048.0F;
        float var7 = this.field4903 / 255.0F;
        this.field4921[1] = (float) (class311.method2135(65504, this.field4918) >> 8) * var7;
        this.field4921[2] = (float) class311.method2135(this.field4918, 255) * var7;
        this.field4921[0] = (float) (class311.method2135(this.field4918, arg2) >> 16) * var7;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(Z)V", line = 542)
    private final void method2132(boolean arg0) {
        field4905++;
        int var2 = (this.field4893 << 7) + 64;
        if (!arg0) {
            method2129(false);
        }
        this.field4898 = 1.0F / (float) (var2 * var2);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIZIIII)V", line = 558)
    public static final void method2133(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class84.field1270 = arg1;
        class184.field2821 = arg0;
        class131.field2067 = arg4;
        class284.field4357 = arg3;
        field4895++;
        class269.field4147 = arg6;
        if (arg2 && class84.field1270 >= 100) {
            class298.field4598 = class131.field2067 * 128 + 64;
            class225.field3592 = class269.field4147 * 128 + 64;
            class169.field2579 = class39.method286(class77.field1154, (byte) 82, class298.field4598, class225.field3592) - class184.field2821;
        }
        if (arg5 != -1) {
            method2127((byte) 38);
        }
        class219.field3489 = 2;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)V", line = 584)
    public static final void method2134(int arg0, int arg1, int arg2) {
        class2 var3 = class274.field4221[class77.field1154][arg1][arg0];
        field4909++;
        if (var3 == null) {
            class245.method1658(class77.field1154, arg1, arg0);
            return;
        }
        int var4 = -99999999;
        class286 var5 = null;
        if (arg2 != 4) {
            return;
        }
        for (class286 var6 = (class286) var3.method10((byte) 72); var6 != null; var6 = (class286) var3.method13((byte) -32)) {
            class291 var7 = class160.method1106(var6.field4378.field141, arg2 ^ 0xFFFFFFB2);
            int var8 = var7.field4492;
            if (var7.field4440 == 1) {
                var8 = (var6.field4378.field138 + 1) * var8;
            }
            if (var8 > var4) {
                var5 = var6;
                var4 = var8;
            }
        }
        if (var5 == null) {
            class245.method1658(class77.field1154, arg1, arg0);
            return;
        }
        var3.method14(var5, -125);
        class286 var9 = (class286) var3.method10((byte) 65);
        class13 var10 = null;
        class13 var11 = null;
        while (var9 != null) {
            class13 var12 = var9.field4378;
            if (var5.field4378.field141 != var12.field141) {
                if (var11 == null) {
                    var11 = var12;
                }
                if (var11.field141 != var12.field141 && var10 == null) {
                    var10 = var12;
                }
            }
            var9 = (class286) var3.method13((byte) -32);
        }
        long var13 = (long) ((arg0 << 7) + arg1 + 1610612736);
        class69.method492(class77.field1154, arg1, arg0, class39.method286(class77.field1154, (byte) 82, arg1 * 128 + 64, arg0 * 128 - -64), var5.field4378, var13, var11, var10);
    }
}
