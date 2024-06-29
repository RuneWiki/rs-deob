import java.awt.Component;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!is")
public class class291 {

    @OriginalMember(owner = "client!is", name = "l", descriptor = "Z")
    private boolean field4176 = false;

    @OriginalMember(owner = "client!is", name = "o", descriptor = "I")
    private int field4179 = 32;

    @OriginalMember(owner = "client!is", name = "p", descriptor = "J")
    private long field4180 = class203.method1299((byte) 5);

    @OriginalMember(owner = "client!is", name = "B", descriptor = "[Lnf;")
    private class345[] field4192 = new class345[8];

    @OriginalMember(owner = "client!is", name = "E", descriptor = "[Lnf;")
    private class345[] field4194 = new class345[8];

    @OriginalMember(owner = "client!is", name = "z", descriptor = "I")
    private int field4190 = 0;

    @OriginalMember(owner = "client!is", name = "O", descriptor = "I")
    private int field4203 = 0;

    @OriginalMember(owner = "client!is", name = "A", descriptor = "I")
    private int field4191 = 0;

    @OriginalMember(owner = "client!is", name = "H", descriptor = "J")
    private long field4197 = 0L;

    @OriginalMember(owner = "client!is", name = "N", descriptor = "I")
    private int field4202 = 0;

    @OriginalMember(owner = "client!is", name = "G", descriptor = "J")
    private long field4196 = 0L;

    @OriginalMember(owner = "client!is", name = "I", descriptor = "Z")
    private boolean field4198 = true;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4175 = "Examine";

    @OriginalMember(owner = "client!is", name = "q", descriptor = "[I")
    public static int[] field4181 = new int[4];

    @OriginalMember(owner = "client!is", name = "F", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field4195 = new Rectangle[100];

    @OriginalMember(owner = "client!is", name = "L", descriptor = "Ljava/lang/String;")
    public static String field4201 = "glow1:";

    @OriginalMember(owner = "client!is", name = "a", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!is", name = "c", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!is", name = "d", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!is", name = "e", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!is", name = "g", descriptor = "I")
    public static int field4171;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public static int field4172;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!is", name = "m", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!is", name = "n", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!is", name = "t", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!is", name = "u", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!is", name = "v", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!is", name = "w", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!is", name = "x", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!is", name = "y", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!is", name = "C", descriptor = "I")
    public int field4193;

    @OriginalMember(owner = "client!is", name = "J", descriptor = "I")
    public int field4199;

    @OriginalMember(owner = "client!is", name = "K", descriptor = "I")
    private int field4200;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "Lnf;")
    private class345 field4170;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "Lra;")
    public static class57 field4166;

    @OriginalMember(owner = "client!is", name = "i", descriptor = "Z")
    public static boolean field4173;

    @OriginalMember(owner = "client!is", name = "r", descriptor = "[I")
    public static int[] field4182;

    @OriginalMember(owner = "client!is", name = "s", descriptor = "[I")
    public int[] field4183;

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(BLnj;)I", line = 3)
    public static final int method1858(byte arg0, class133 arg1) {
        field4169++;
        int var2 = arg1.field1844;
        class270 var3 = arg1.method2697((byte) 93);
        if (arg0 <= 46) {
            field4173 = true;
        }
        if (arg1.field6335) {
            var2 = arg1.field1856;
        } else if (arg1.field6265 == var3.field3798 || arg1.field6265 == var3.field3815 || arg1.field6265 == var3.field3835 || arg1.field6265 == var3.field3822) {
            var2 = arg1.field1839;
        } else if (arg1.field6265 == var3.field3824 || arg1.field6265 == var3.field3811 || arg1.field6265 == var3.field3804 || arg1.field6265 == var3.field3800) {
            var2 = arg1.field1823;
        }
        return var2;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V", line = 33)
    public final synchronized void method1859(int arg0) {
        field4174++;
        if (this.field4176) {
            return;
        }
        long var2 = class203.method1299((byte) 5);
        try {
            if (this.field4180 + 500000L < var2) {
                this.field4180 = var2 - 500000L;
            }
            while (var2 > (this.field4180 + 5000L)) {
                this.method1863(256, (byte) -34);
                this.field4180 += (long) (256000 / class233.field3158);
            }
        } catch (Exception var7) {
            this.field4180 = var2;
        }
        if (this.field4183 == null) {
            return;
        }
        try {
            if (this.field4196 != 0L) {
                if (this.field4196 > var2) {
                    return;
                }
                this.method487(this.field4199);
                this.field4196 = 0L;
                this.field4198 = true;
            }
            int var4 = this.method491();
            if ((this.field4203 - var4) > this.field4191) {
                this.field4191 = this.field4203 - var4;
            }
            if (arg0 != -5807) {
                this.method1859(-46);
            }
            int var5 = this.field4193 + this.field4200;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field4199) {
                this.field4199 += 1024;
                if (this.field4199 > 16384) {
                    this.field4199 = 16384;
                }
                this.method490();
                this.method487(this.field4199);
                var4 = 0;
                this.field4198 = true;
                if (var5 + 256 > this.field4199) {
                    var5 = this.field4199 - 256;
                    this.field4200 = var5 - this.field4193;
                }
            }
            while (var5 > var4) {
                this.method1860(this.field4183, 256);
                this.method488();
                var4 += 256;
            }
            if (var2 > this.field4197) {
                if (this.field4198) {
                    this.field4198 = false;
                } else if (this.field4191 == 0 && this.field4190 == 0) {
                    this.method490();
                    this.field4196 = var2 + 2000L;
                    return;
                } else {
                    this.field4200 = Math.min(this.field4190, this.field4191);
                    this.field4190 = this.field4191;
                }
                this.field4197 = var2 + 2000L;
                this.field4191 = 0;
            }
            this.field4203 = var4;
        } catch (Exception var6) {
            this.method490();
            this.field4196 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "([II)V", line = 155)
    private final void method1860(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class134.field1882) {
            var3 = arg1 << 1;
        }
        class408.method2572(arg0, 0, var3);
        this.field4202 -= arg1;
        if (this.field4170 != null && this.field4202 <= 0) {
            this.field4202 += class233.field3158 >> 4;
            class421.method2613(29314, this.field4170);
            this.method1866(this.field4170, this.field4170.method2208(), (byte) 21);
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
                        class345 var10 = null;
                        class345 var11 = this.field4194[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class22 var12 = var11.field5072;
                                if (var12 == null || var12.field228 <= var8) {
                                    var11.field5071 = true;
                                    int var13 = var11.method274();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field228 += var13;
                                    }
                                    if (var4 >= this.field4179) {
                                        break label107;
                                    }
                                    class345 var14 = var11.method273();
                                    if (var14 != null) {
                                        int var15 = var11.field5070;
                                        while (var14 != null) {
                                            this.method1866(var14, var15 * var14.method2208() >> 8, (byte) -74);
                                            var14 = var11.method268();
                                        }
                                    }
                                    class345 var16 = var11.field5069;
                                    var11.field5069 = null;
                                    if (var10 == null) {
                                        this.field4194[var7] = var16;
                                    } else {
                                        var10.field5069 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4192[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field5069;
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
                class345 var18 = this.field4194[var17];
                this.field4194[var17] = this.field4192[var17] = null;
                while (var18 != null) {
                    class345 var19 = var18.field5069;
                    var18.field5069 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4202 < 0) {
            this.field4202 = 0;
        }
        if (this.field4170 != null) {
            this.field4170.method270(arg0, 0, arg1);
        }
        this.field4180 = class203.method1299((byte) 5);
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(B)V", line = 313)
    public final void method1861(byte arg0) {
        if (arg0 != -51) {
            this.method1861((byte) 68);
        }
        this.field4198 = true;
        field4189++;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 327)
    public void method489(Component arg0) throws Exception {
        field4187++;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "()I", line = 334)
    public int method491() throws Exception {
        field4177++;
        return this.field4199;
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Lra;ZLra;)V", line = 342)
    public static final void method1862(class57 arg0, boolean arg1, class57 arg2) {
        class375.field5483 = arg0;
        field4172++;
        if (arg1) {
            class311.field4438 = arg2;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IB)V", line = 360)
    private final void method1863(int arg0, byte arg1) {
        field4167++;
        this.field4202 -= arg0;
        if (this.field4202 < 0) {
            this.field4202 = 0;
        }
        if (this.field4170 != null) {
            this.field4170.method265(arg0);
        }
        if (arg1 != -34) {
            field4201 = null;
        }
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(I)V", line = 379)
    public final synchronized void method1864(int arg0) {
        if (arg0 != 2000) {
            return;
        }
        this.field4198 = true;
        field4171++;
        try {
            this.method486();
        } catch (Exception var2) {
            this.method490();
            this.field4196 = class203.method1299((byte) 5) + 2000L;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Lnf;I)V", line = 402)
    public final synchronized void method1865(class345 arg0, int arg1) {
        this.field4170 = arg0;
        field4168++;
        if (arg1 <= 56) {
            this.field4191 = 93;
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(Lnf;IB)V", line = 413)
    private final void method1866(class345 arg0, int arg1, byte arg2) {
        field4165++;
        int var4 = -93 % ((arg2 - 82) / 40);
        int var5 = arg1 >> 5;
        class345 var6 = this.field4192[var5];
        if (var6 == null) {
            this.field4194[var5] = arg0;
        } else {
            var6.field5069 = arg0;
        }
        this.field4192[var5] = arg0;
        arg0.field5070 = arg1;
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(B)V", line = 433)
    public static void method1867(byte arg0) {
        field4175 = null;
        field4181 = null;
        field4195 = null;
        int var1 = 60 % ((arg0 - 32) / 33);
        field4182 = null;
        field4201 = null;
        field4166 = null;
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "(I)V", line = 447)
    public final synchronized void method1868(int arg0) {
        if (arg0 != -29804) {
            method1867((byte) 50);
        }
        field4186++;
        if (class403.field5882 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class403.field5882.field2619[var3] == this) {
                    class403.field5882.field2619[var3] = null;
                }
                if (class403.field5882.field2619[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class403.field5882.field2620 = true;
                while (class403.field5882.field2623) {
                    class278.method1757(50L, 0);
                }
                class403.field5882 = null;
            }
        }
        this.method490();
        this.field4183 = null;
        this.field4176 = true;
    }

    @OriginalMember(owner = "client!is", name = "d", descriptor = "(I)V", line = 495)
    public void method487(int arg0) throws Exception {
        field4178++;
    }

    @OriginalMember(owner = "client!is", name = "b", descriptor = "()V", line = 508)
    public void method490() {
        field4185++;
    }

    @OriginalMember(owner = "client!is", name = "c", descriptor = "()V", line = 539)
    public void method486() throws Exception {
        field4188++;
    }

    @OriginalMember(owner = "client!is", name = "d", descriptor = "()V", line = 551)
    public void method488() throws Exception {
        field4184++;
    }
}
