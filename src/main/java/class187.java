import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class187 {

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "I")
    private int field3178 = 0;

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    private int field3180 = -1;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Lub;")
    public static class227 field3184 = class257.method1749(": ", 17263);

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "Lub;")
    public static class227 field3189 = class257.method1749("(U", 17263);

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    public int field3183;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public int field3185;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public int field3186;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "I")
    public static int field3190;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public int field3192;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lld;IILqa;IIILfa;)V")
    public static final void method1188(class195 arg0, int arg1, int arg2, class225 arg3, int arg4, int arg5, int arg6, class45 arg7) {
        if (arg2 != 3319) {
            method1192(true);
        }
        field3181++;
        class238 var8 = new class238();
        var8.field4128 = arg1 * 128;
        var8.field4144 = arg6;
        var8.field4127 = arg4 * 128;
        if (arg7 != null) {
            var8.field4139 = arg7.field783;
            var8.field4141 = arg7.field778;
            int var10 = arg7.field810;
            var8.field4132 = arg7;
            var8.field4126 = arg7.field806;
            var8.field4130 = arg7.field747 * 128;
            var8.field4136 = arg7.field798;
            int var11 = arg7.field790;
            if (arg5 == 1 || arg5 == 3) {
                var11 = arg7.field810;
                var10 = arg7.field790;
            }
            var8.field4123 = (arg1 + var10) * 128;
            var8.field4138 = (arg4 + var11) * 128;
            if (arg7.field754 != null) {
                var8.field4121 = true;
                var8.method1587(arg2 - 3319);
            }
            if (var8.field4126 != null) {
                var8.field4125 = (int) (Math.random() * (double) (var8.field4141 - var8.field4136)) + var8.field4136;
            }
            class97.field1701.method1272(arg2 ^ 0x1AD7, var8);
            return;
        }
        if (arg0 != null) {
            class147 var9 = arg0.field3315;
            var8.field4124 = arg0;
            if (var9.field2563 != null) {
                var8.field4121 = true;
                var9 = var9.method933(arg2 ^ 0x784D);
            }
            if (var9 != null) {
                var8.field4138 = (var9.field2542 + arg4) * 128;
                var8.field4123 = (var9.field2542 + arg1) * 128;
                var8.field4139 = class36.method191((byte) 120, arg0);
                var8.field4130 = var9.field2521 * 128;
            }
            class185.field3140.method1272(5664, var8);
            return;
        }
        if (arg3 == null) {
            return;
        }
        var8.field4123 = (arg1 + arg3.field45) * 128;
        var8.field4135 = arg3;
        var8.field4138 = (arg3.field45 + arg4) * 128;
        var8.field4139 = class63.method399(-71, arg3);
        var8.field4130 = arg3.field3831 * 128;
        class223.field3790.method1300(var8, arg3.field3819.method1485(arg2 - 3197), arg2 ^ 0xFFFFF832);
        return;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public static void method1189(int arg0) {
        field3184 = null;
        if (arg0 < -4) {
            field3189 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IB)I")
    public static final int method1190(int arg0, byte arg1) {
        if (arg1 >= -83) {
            field3189 = null;
        }
        field3179++;
        if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
            return arg0 - 32;
        } else if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(II)V")
    private final void method1191(int arg0, int arg1) {
        field3190++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = var3;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var11 = 0.0D;
        double var13 = var3;
        if (var3 > var9) {
            var13 = var9;
        }
        if (var9 > var3) {
            var5 = var9;
        }
        if (var13 > var7) {
            var13 = var7;
        }
        double var15 = 0.0D;
        if (var5 < var7) {
            var5 = var7;
        }
        double var17 = (var5 + var13) / 2.0D;
        this.field3183 = (int) (var17 * 256.0D);
        if (var5 != var13) {
            if (var17 < 0.5D) {
                var15 = (var5 - var13) / (var5 + var13);
            }
            if (var17 >= 0.5D) {
                var15 = (var5 - var13) / (2.0D - var5 - var13);
            }
            if (var3 == var5) {
                var11 = (var9 - var7) / (var5 - var13);
            } else if (var5 == var9) {
                var11 = (var7 - var3) / (var5 - var13) + 2.0D;
            } else if (var5 == var7) {
                var11 = (var3 - var9) / (var5 - var13) + 4.0D;
            }
        }
        this.field3185 = (int) (var15 * 256.0D);
        double var19 = var11 / 6.0D;
        if (this.field3185 < 0) {
            this.field3185 = 0;
        } else if (this.field3185 > 255) {
            this.field3185 = 255;
        }
        if ((var17 > 0.5D)) {
            this.field3192 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3192 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3192 < 1) {
            this.field3192 = 1;
        }
        if (this.field3183 < 0) {
            this.field3183 = 0;
        } else if (this.field3183 > 255) {
            this.field3183 = 255;
        }
        this.field3186 = (int) ((double) this.field3192 * var19);
        if (arg1 != 12038) {
            this.field3192 = -109;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V")
    public static final void method1192(boolean arg0) {
        field3191++;
        if (!class34.method178(arg0) && class64.field1171 != class14.field269) {
            class131.method812(class64.field1171, false, class148.field2581, false, class241.field4189, class216.field3639.field49[0], class216.field3639.field78[0]);
        } else if (class64.field1171 != class60.field1102) {
            class60.field1102 = class64.field1171;
            class162.method999(class64.field1171, -119);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIILnj;)V")
    private final void method1193(int arg0, int arg1, int arg2, class226 arg3) {
        if (arg0 < 24) {
            this.method1194(-117, -44, (class226) null);
        }
        field3188++;
        if (arg2 == 1) {
            this.field3178 = arg3.method1444(171285352);
            this.method1191(this.field3178, 12038);
        } else if (arg2 == 2) {
            this.field3180 = arg3.method1447(0);
            if (this.field3180 == 65535) {
                this.field3180 = -1;
                return;
            }
        } else if (arg2 == 3) {
            arg3.method1447(0);
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILnj;)V")
    public final void method1194(int arg0, int arg1, class226 arg2) {
        if (arg1 != 128) {
            return;
        }
        while (true) {
            int var4 = arg2.method1471(255);
            if (var4 == 0) {
                field3182++;
                return;
            }
            this.method1193(arg1 ^ 0xAD, arg0, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(Z)V")
    public static final void method1195(boolean arg0) {
        field3187++;
        class221.field3742.method1723(-4173);
        if (arg0) {
            class193.field3290.method1723(-4173);
            class180.field3089.method1723(-4173);
        }
    }
}
