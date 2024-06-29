import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class251 extends class179 {

    @OriginalMember(owner = "client!id", name = "X", descriptor = "I")
    private int field4262 = 0;

    @OriginalMember(owner = "client!id", name = "cb", descriptor = "I")
    private int field4267 = 0;

    @OriginalMember(owner = "client!id", name = "gb", descriptor = "I")
    private int field4271 = 0;

    @OriginalMember(owner = "client!id", name = "T", descriptor = "I")
    public static int field4258 = 0;

    @OriginalMember(owner = "client!id", name = "db", descriptor = "Lke;")
    public static class256 field4268 = class316.method2202("::qa_op_test", 27626);

    @OriginalMember(owner = "client!id", name = "S", descriptor = "Lke;")
    private static class256 field4257 = class316.method2202("Use", 27626);

    @OriginalMember(owner = "client!id", name = "bb", descriptor = "Lke;")
    public static class256 field4266 = class316.method2202("brillant3:", 27626);

    @OriginalMember(owner = "client!id", name = "U", descriptor = "Lke;")
    public static class256 field4259 = class316.method2202("Lade)3)3)3", 27626);

    @OriginalMember(owner = "client!id", name = "V", descriptor = "Lke;")
    public static class256 field4260 = field4257;

    @OriginalMember(owner = "client!id", name = "W", descriptor = "Lke;")
    public static class256 field4261 = class316.method2202("Untersuchen", 27626);

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    private int field4255;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!id", name = "Y", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!id", name = "Z", descriptor = "I")
    private int field4264;

    @OriginalMember(owner = "client!id", name = "ab", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!id", name = "eb", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!id", name = "fb", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!id", name = "hb", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!id", name = "ib", descriptor = "I")
    private int field4273;

    @OriginalMember(owner = "client!id", name = "jb", descriptor = "I")
    private int field4274;

    @OriginalMember(owner = "client!id", name = "kb", descriptor = "I")
    private int field4275;

    @OriginalMember(owner = "client!id", name = "lb", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!id", name = "mb", descriptor = "I")
    private int field4277;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 8)
    public static final void method1685(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class198 var20 = new class198(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class41.field790[var21][arg1][arg2] == null) {
                    class41.field790[var21][arg1][arg2] = new class271(var21, arg1, arg2);
                }
            }
            class41.field790[arg0][arg1][arg2].field4631 = var20;
        } else if (arg3 == 1) {
            class198 var22 = new class198(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class41.field790[var23][arg1][arg2] == null) {
                    class41.field790[var23][arg1][arg2] = new class271(var23, arg1, arg2);
                }
            }
            class41.field790[arg0][arg1][arg2].field4631 = var22;
        } else {
            class3 var24 = new class3(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class41.field790[var25][arg1][arg2] == null) {
                    class41.field790[var25][arg1][arg2] = new class271(var25, arg1, arg2);
                }
            }
            class41.field790[arg0][arg1][arg2].field4625 = var24;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 60)
    public static final void method1686(byte arg0, Component arg1) {
        field4263++;
        arg1.removeMouseListener(class129.field2261);
        arg1.removeMouseMotionListener(class129.field2261);
        if (arg0 > -25) {
            method1690((byte) 92);
        }
        arg1.removeFocusListener(class129.field2261);
        class15.field195 = 0;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)I", line = 75)
    public static final int method1687(byte arg0) {
        if (arg0 != 105) {
            field4259 = (class256) null;
        }
        field4270++;
        return class277.field4768;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IZII)V", line = 92)
    private final void method1688(int arg0, boolean arg1, int arg2, int arg3) {
        field4272++;
        int var5 = arg3 <= 2048 ? (arg0 + 4096) * arg3 >> 12 : arg3 + arg0 - (arg0 * arg3 >> 12);
        if (var5 > 0) {
            int var6 = arg2 * 6;
            int var7 = arg3 + arg3 - var5;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = var6 - (var9 << 12);
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var5 - var13;
            int var15 = var7 + var13;
            if (var9 == 0) {
                this.field4255 = var5;
                this.field4277 = var15;
                this.field4273 = var7;
            } else if (var9 == 1) {
                this.field4273 = var7;
                this.field4277 = var5;
                this.field4255 = var14;
            } else if (var9 == 2) {
                this.field4255 = var7;
                this.field4273 = var15;
                this.field4277 = var5;
            } else if (var9 == 3) {
                this.field4273 = var5;
                this.field4255 = var7;
                this.field4277 = var14;
            } else if (var9 == 4) {
                this.field4277 = var7;
                this.field4255 = var15;
                this.field4273 = var5;
            } else if (var9 == 5) {
                this.field4277 = var7;
                this.field4255 = var5;
                this.field4273 = var14;
            }
        } else {
            this.field4255 = this.field4277 = this.field4273 = arg3;
        }
        if (arg1) {
            this.field4274 = -94;
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(B)V", line = 199)
    public static void method1689(byte arg0) {
        field4257 = null;
        if (arg0 != 16) {
            field4266 = (class256) null;
        }
        field4260 = null;
        field4261 = null;
        field4268 = null;
        field4259 = null;
        field4266 = null;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)[[I", line = 220)
    public final int[][] method55(int arg0, int arg1) {
        if (arg0 != 75) {
            this.method55(65, 75);
        }
        field4265++;
        int[][] var3 = this.field3169.method463(arg1, arg0 - 74);
        if (this.field3169.field1080) {
            int[][] var4 = this.method1314(arg1, 158, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var3[1];
            int[] var8 = var4[0];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class161.field2858; var11++) {
                this.method1691(var6[var11], var5[var11], -17723, var8[var11]);
                this.field4274 += this.field4262;
                this.field4275 += this.field4267;
                if (this.field4274 < 0) {
                    this.field4274 = 0;
                }
                if (this.field4274 > 4096) {
                    this.field4274 = 4096;
                }
                this.field4264 += this.field4271;
                if (this.field4275 < 0) {
                    this.field4275 = 0;
                }
                if (this.field4275 > 4096) {
                    this.field4275 = 4096;
                }
                while (this.field4264 < 0) {
                    this.field4264 += 4096;
                }
                while (this.field4264 > 4096) {
                    this.field4264 -= 4096;
                }
                this.method1688(this.field4274, false, this.field4264, this.field4275);
                var9[var11] = this.field4255;
                var7[var11] = this.field4277;
                var10[var11] = this.field4273;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V", line = 300)
    public class251() {
        super(1, false);
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(B)V", line = 304)
    public static final void method1690(byte arg0) {
        field4269++;
        if (arg0 <= 67) {
            field4260 = (class256) null;
        }
        class105.field1884.method2084(111);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)V", line = 327)
    private final void method1691(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 >= arg3 ? arg1 : arg3;
        int var6 = var5 >= arg0 ? var5 : arg0;
        field4256++;
        int var7 = arg3 < arg1 ? arg3 : arg1;
        int var8 = var7 <= arg0 ? var7 : arg0;
        this.field4275 = (var6 + var8) / 2;
        if (arg2 != -17723) {
            this.field4275 = -52;
        }
        int var9 = var6 - var8;
        if (this.field4275 > 0 && this.field4275 < 4096) {
            this.field4274 = (var9 << 12) / (this.field4275 > 2048 ? 8192 - (this.field4275 * 2) : this.field4275 * 2);
        } else {
            this.field4274 = 0;
        }
        if (var9 <= 0) {
            this.field4264 = 0;
            return;
        }
        int var10 = (var6 - arg3 << 12) / var9;
        int var11 = (var6 - arg1 << 12) / var9;
        int var12 = (var6 - arg0 << 12) / var9;
        if (arg3 == var6) {
            this.field4264 = arg1 == var8 ? var12 + 20480 : -var11 + 4096;
        } else if (arg1 == var6) {
            this.field4264 = arg0 == var8 ? var10 + 4096 : -var12 + 12288;
        } else {
            this.field4264 = arg3 == var8 ? var11 + 12288 : -var10 + 20480;
        }
        this.field4264 /= 6;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILra;I)V", line = 405)
    public final void method54(int arg0, class41 arg1, int arg2) {
        if (arg2 == 0) {
            this.field4271 = arg1.method309(2);
        } else if (arg2 == 1) {
            this.field4262 = (arg1.method323(9092) << 12) / 100;
        } else if (arg2 == 2) {
            this.field4267 = (arg1.method323(9092) << 12) / 100;
        }
        if (arg0 < 108) {
            method1690((byte) -116);
        }
        field4276++;
    }
}
