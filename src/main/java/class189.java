import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class189 {

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "Lt;")
    private class200 field3265 = new class200();

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "Llc;")
    private class123 field3270 = new class123();

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    private int field3266;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    private int field3273;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "Ll;")
    private class120 field3268;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "Ldj;")
    public static class44 field3264 = class89.method650(255, "(Y");

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "Ls;")
    public static class190 field3259 = new class190();

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
    public static int field3272 = 0;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "Ldj;")
    public static class44 field3269 = class89.method650(255, "(U1");

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIII)V")
    public static final void method1175(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class57.field1068 = arg4;
        field3260++;
        class14.field267 = arg2;
        class70.field1337 = arg3;
        if (arg1 != 50) {
            field3272 = 36;
        }
        class70.field1321 = arg0;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)I")
    public static final int method1176(int arg0) {
        if (arg0 == 0) {
            field3257++;
            return class146.field2568;
        } else {
            return -67;
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V")
    public static void method1177(int arg0) {
        field3264 = null;
        field3259 = null;
        if (arg0 == 256) {
            field3269 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(JI)Lt;")
    public final class200 method1178(long arg0, int arg1) {
        field3271++;
        class200 var4 = (class200) this.field3268.method828(arg0, (byte) -40);
        if (arg1 == 14176) {
            if (var4 != null) {
                this.field3270.method845(100, var4);
            }
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V")
    public final void method1179(byte arg0) {
        while (true) {
            class200 var2 = this.field3270.method850(-1);
            if (var2 == null) {
                if (arg0 >= -62) {
                    method1177(96);
                }
                field3262++;
                this.field3273 = this.field3266;
                return;
            }
            var2.method1148(-13215);
            var2.method1288(false);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IJ)V")
    public final void method1180(int arg0, long arg1) {
        if (arg0 != 2) {
            return;
        }
        class200 var4 = (class200) this.field3268.method828(arg1, (byte) -40);
        field3263++;
        if (var4 != null) {
            var4.method1148(arg0 ^ 0xFFFFCC63);
            var4.method1288(false);
            this.field3273++;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILld;)V")
    public static final void method1181(int arg0, class124 arg1) {
        arg1.field2264 = arg1.field2196;
        field3261++;
        if (arg1.field2194 == 0) {
            arg1.field2261 = 0;
            return;
        }
        if (arg1.field2243 != -1 && arg1.field2222 == 0) {
            class204 var2 = class94.method672(arg1.field2243, -84);
            if (arg1.field2203 > 0 && var2.field3656 == 0) {
                arg1.field2261++;
                return;
            }
            if (arg1.field2203 <= 0 && var2.field3663 == 0) {
                arg1.field2261++;
                return;
            }
        }
        if (arg0 != 2) {
            field3269 = null;
        }
        int var3 = arg1.field2260;
        int var4 = arg1.field2195;
        int var5 = arg1.field2240[arg1.field2194 - 1] * 128 + arg1.field2231 * 64;
        int var6 = arg1.field2235[arg1.field2194 - 1] * 128 + arg1.field2231 * 64;
        if (var5 - var3 > 256 || var5 - var3 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg1.field2195 = var6;
            arg1.field2260 = var5;
            return;
        }
        int var7 = arg1.field2242;
        if (var3 < var5) {
            if (var4 < var6) {
                arg1.field2211 = 1280;
            } else if (var6 < var4) {
                arg1.field2211 = 1792;
            } else {
                arg1.field2211 = 1536;
            }
        } else if (var5 < var3) {
            if (var6 > var4) {
                arg1.field2211 = 768;
            } else if (var4 > var6) {
                arg1.field2211 = 256;
            } else {
                arg1.field2211 = 512;
            }
        } else if (var4 < var6) {
            arg1.field2211 = 1024;
        } else if (var4 > var6) {
            arg1.field2211 = 0;
        }
        int var8 = arg1.field2211 - arg1.field2224 & 0x7FF;
        int var9 = 4;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        boolean var10 = true;
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg1.field2197;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg1.field2251;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg1.field2253;
        }
        if (var7 == -1) {
            var7 = arg1.field2197;
        }
        arg1.field2264 = var7;
        if (arg1 instanceof class121) {
            var10 = ((class121) arg1).field2156.field3579;
        }
        if (var10) {
            if (arg1.field2224 != arg1.field2211 && arg1.field2259 == -1 && arg1.field2201 != 0) {
                var9 = 2;
            }
            if (arg1.field2194 > 2) {
                var9 = 6;
            }
            if (arg1.field2194 > 3) {
                var9 = 8;
            }
            if (arg1.field2261 > 0 && arg1.field2194 > 1) {
                arg1.field2261--;
                var9 = 8;
            }
        } else {
            if (arg1.field2194 > 1) {
                var9 = 6;
            }
            if (arg1.field2194 > 2) {
                var9 = 8;
            }
            if (arg1.field2261 > 0 && arg1.field2194 > 1) {
                var9 = 8;
                arg1.field2261--;
            }
        }
        if (arg1.field2241[arg1.field2194 - 1]) {
            var9 <<= 0x1;
        }
        if (var4 < var6) {
            arg1.field2195 += var9;
            if (arg1.field2195 > var6) {
                arg1.field2195 = var6;
            }
        } else if (var6 < var4) {
            arg1.field2195 -= var9;
            if (arg1.field2195 < var6) {
                arg1.field2195 = var6;
            }
        }
        if (var5 > var3) {
            arg1.field2260 += var9;
            if (arg1.field2260 > var5) {
                arg1.field2260 = var5;
            }
        } else if (var3 > var5) {
            arg1.field2260 -= var9;
            if (var5 > arg1.field2260) {
                arg1.field2260 = var5;
            }
        }
        if (arg1.field2260 == var5 && arg1.field2195 == var6) {
            if (arg1.field2203 > 0) {
                arg1.field2203--;
            }
            arg1.field2194--;
        }
        if (var9 >= 8 && arg1.field2264 == arg1.field2197 && arg1.field2257 != -1) {
            arg1.field2264 = arg1.field2257;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Z)Lrb;")
    public final class183 method1182(boolean arg0) {
        if (arg0) {
            this.method1180(-115, -81L);
        }
        field3258++;
        return this.field3268.method832(101);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLt;J)V")
    public final void method1183(byte arg0, class200 arg1, long arg2) {
        field3256++;
        if (this.field3273 == 0) {
            class200 var5 = this.field3270.method850(-1);
            var5.method1148(-13215);
            var5.method1288(false);
            if (this.field3265 == var5) {
                class200 var6 = this.field3270.method850(-1);
                var6.method1148(-13215);
                var6.method1288(false);
            }
        } else {
            this.field3273--;
        }
        this.field3268.method830(arg1, arg2, 1);
        if (arg0 < 84) {
            this.method1179((byte) 105);
        }
        this.field3270.method845(108, arg1);
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)Lrb;")
    public final class183 method1184(byte arg0) {
        field3267++;
        if (arg0 != -3) {
            method1177(108);
        }
        return this.field3268.method829((byte) 72);
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(I)V")
    public class189(int arg0) {
        int var2 = 1;
        this.field3266 = arg0;
        while (var2 + var2 < arg0) {
            var2 += var2;
        }
        this.field3273 = arg0;
        this.field3268 = new class120(var2);
    }
}
