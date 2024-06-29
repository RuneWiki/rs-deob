import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class132 {

    @OriginalMember(owner = "client!t", name = "w", descriptor = "I")
    private int field2916 = 32;

    @OriginalMember(owner = "client!t", name = "p", descriptor = "J")
    private long field2909 = class150.method1148(-85808345);

    @OriginalMember(owner = "client!t", name = "C", descriptor = "[Ld;")
    private class22[] field2922 = new class22[8];

    @OriginalMember(owner = "client!t", name = "I", descriptor = "I")
    private int field2928 = 0;

    @OriginalMember(owner = "client!t", name = "K", descriptor = "J")
    private long field2930 = 0L;

    @OriginalMember(owner = "client!t", name = "B", descriptor = "I")
    private int field2921 = 0;

    @OriginalMember(owner = "client!t", name = "H", descriptor = "I")
    private int field2927 = 0;

    @OriginalMember(owner = "client!t", name = "F", descriptor = "[Ld;")
    private class22[] field2925 = new class22[8];

    @OriginalMember(owner = "client!t", name = "M", descriptor = "J")
    private long field2932 = 0L;

    @OriginalMember(owner = "client!t", name = "L", descriptor = "Z")
    private boolean field2931 = true;

    @OriginalMember(owner = "client!t", name = "J", descriptor = "I")
    private int field2929 = 0;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "I")
    public static int field2906 = 0;

    @OriginalMember(owner = "client!t", name = "q", descriptor = "Lje;")
    public static class67 field2910 = class85.method592(255, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!t", name = "u", descriptor = "Lje;")
    private static class67 field2914 = class85.method592(255, "Members only world");

    @OriginalMember(owner = "client!t", name = "t", descriptor = "Lje;")
    public static class67 field2913 = field2914;

    @OriginalMember(owner = "client!t", name = "o", descriptor = "Lje;")
    private static class67 field2908 = class85.method592(255, "Select");

    @OriginalMember(owner = "client!t", name = "v", descriptor = "Lje;")
    public static class67 field2915 = field2908;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!t", name = "r", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!t", name = "x", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!t", name = "y", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!t", name = "z", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!t", name = "A", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!t", name = "D", descriptor = "I")
    public int field2923;

    @OriginalMember(owner = "client!t", name = "E", descriptor = "I")
    public int field2924;

    @OriginalMember(owner = "client!t", name = "G", descriptor = "I")
    private int field2926;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "Lua;")
    public static class140 field2903;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Ld;")
    private class22 field2902;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "[I")
    public int[] field2895;

    @OriginalMember(owner = "client!t", name = "s", descriptor = "[Lqb;")
    public static class113[] field2912;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public final void method1000(int arg0) {
        this.field2931 = true;
        field2904++;
        if (arg0 >= -47) {
            field2901 = 83;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
    public final synchronized void method1001(int arg0) {
        field2905++;
        this.field2931 = true;
        try {
            this.method400();
            if (arg0 != 1) {
                this.method1000(-24);
            }
        } catch (Exception var2) {
            this.method397();
            this.field2932 = class150.method1148(-85808345) + 2000L;
        }
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
    public static void method1002(int arg0) {
        field2914 = null;
        field2915 = null;
        field2910 = null;
        int var1 = 91 / ((50 - arg0) / 55);
        field2912 = null;
        field2908 = null;
        field2903 = null;
        field2913 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)V")
    private final void method1003(int arg0, byte arg1) {
        if (arg1 > -16) {
            field2912 = null;
        }
        this.field2929 -= arg0;
        if (this.field2929 < 0) {
            this.field2929 = 0;
        }
        if (this.field2902 != null) {
            this.field2902.method158(arg0);
        }
        field2920++;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IILd;)V")
    private final void method1004(int arg0, int arg1, class22 arg2) {
        field2917++;
        int var4 = arg0 >> 5;
        class22 var5 = this.field2922[var4];
        if (var5 == null) {
            this.field2925[var4] = arg2;
        } else {
            var5.field406 = arg2;
        }
        this.field2922[var4] = arg2;
        arg2.field409 = arg0;
        if (arg1 <= 126) {
            this.field2916 = -21;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ld;B)V")
    public final synchronized void method1005(class22 arg0, byte arg1) {
        field2907++;
        if (arg1 <= 13) {
            this.field2924 = 64;
        }
        this.field2902 = arg0;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
    public void method400() throws Exception {
        field2911++;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "(I)V")
    public static final void method1006(int arg0) {
        if (arg0 != 20365) {
            field2901 = 95;
        }
        for (int var1 = -1; var1 < class155.field3540; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class151.field3464[var1];
            }
            class83 var3 = class85.field1885[var2];
            if (var3 != null) {
                class145.method1118(1, (byte) 97, var3);
            }
        }
        field2894++;
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "()V")
    public void method402() throws Exception {
        field2919++;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "()I")
    public int method398() throws Exception {
        field2900++;
        return this.field2924;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method399(Component arg0) throws Exception {
        field2896++;
    }

    @OriginalMember(owner = "client!t", name = "d", descriptor = "()V")
    public void method397() {
        field2897++;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([II)V")
    private final void method1007(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class41.field765) {
            var3 = arg1 << 1;
        }
        class139.method1052(arg0, 0, var3);
        this.field2929 -= arg1;
        if (this.field2902 != null && this.field2929 <= 0) {
            this.field2929 += class84.field1873 >> 4;
            class92.method676(this.field2902, -123);
            this.method1004(this.field2902.method157(), 127, this.field2902);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class22 var10 = null;
                        class22 var11 = this.field2925[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class20 var12 = var11.field407;
                                if (var12 == null || var12.field371 <= var8) {
                                    var11.field408 = true;
                                    int var13 = var11.method154();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field371 += var13;
                                    }
                                    if (var4 >= this.field2916) {
                                        break label107;
                                    }
                                    class22 var14 = var11.method159();
                                    if (var14 != null) {
                                        int var15 = var11.field409;
                                        while (var14 != null) {
                                            this.method1004(var15 * var14.method157() >> 8, 127, var14);
                                            var14 = var11.method153();
                                        }
                                    }
                                    class22 var16 = var11.field406;
                                    var11.field406 = null;
                                    if (var10 == null) {
                                        this.field2925[var7] = var16;
                                    } else {
                                        var10.field406 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2922[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field406;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class22 var18 = this.field2925[var17];
                this.field2925[var17] = this.field2922[var17] = null;
                while (var18 != null) {
                    class22 var19 = var18.field406;
                    var18.field406 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2929 < 0) {
            this.field2929 = 0;
        }
        if (this.field2902 != null) {
            this.field2902.method156(arg0, 0, arg1);
        }
        this.field2909 = class150.method1148(-85808345);
    }

    @OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V")
    public final synchronized void method1008(int arg0) {
        if (class44.field815 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class44.field815.field2825[var3] == this) {
                    class44.field815.field2825[var3] = null;
                }
                if (class44.field815.field2825[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class44.field815.field2837 = true;
                while (class44.field815.field2835) {
                    class104.method822(-103, 50L);
                }
                class44.field815 = null;
            }
        }
        field2918++;
        if (arg0 != 1817) {
            this.method397();
        }
        this.method397();
        this.field2895 = null;
    }

    @OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V")
    public void method401(int arg0) throws Exception {
        field2899++;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
    public final synchronized void method1009(byte arg0) {
        field2898++;
        if (this.field2895 == null) {
            return;
        }
        long var2 = class150.method1148(-85808345);
        try {
            if (this.field2932 != 0L) {
                if (var2 < this.field2932) {
                    return;
                }
                this.method401(this.field2924);
                this.field2931 = true;
                this.field2932 = 0L;
            }
            int var4 = this.method398();
            if (arg0 != 121) {
                return;
            }
            int var5 = this.field2923 + this.field2926;
            if (this.field2928 < this.field2927 - var4) {
                this.field2928 = this.field2927 - var4;
            }
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field2924 < var5 + 256) {
                var4 = 0;
                this.field2924 += 1024;
                if (this.field2924 > 16384) {
                    this.field2924 = 16384;
                }
                this.method397();
                this.method401(this.field2924);
                this.field2931 = true;
                if (var5 + 256 > this.field2924) {
                    var5 = this.field2924 - 256;
                    this.field2926 = var5 - this.field2923;
                }
            }
            while (var5 > var4) {
                var4 += 256;
                this.method1007(this.field2895, 256);
                this.method402();
            }
            if (var2 > this.field2930) {
                if (this.field2931) {
                    this.field2931 = false;
                } else if (this.field2928 == 0 && this.field2921 == 0) {
                    this.method397();
                    this.field2932 = var2 + 2000L;
                    return;
                } else {
                    this.field2926 = Math.min(this.field2921, this.field2928);
                    this.field2921 = this.field2928;
                }
                this.field2930 = var2 + 2000L;
                this.field2928 = 0;
            }
            this.field2927 = var4;
        } catch (Exception var7) {
            this.method397();
            this.field2932 = var2 + 2000L;
        }
        try {
            if (var2 > this.field2909 + 500000L) {
                var2 = this.field2909;
            }
            while (this.field2909 + 5000L < var2) {
                this.method1003(256, (byte) -128);
                this.field2909 += 256000 / class84.field1873;
            }
        } catch (Exception var6) {
            this.field2909 = var2;
        }
    }
}
