import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class246 {

    @OriginalMember(owner = "client!tf", name = "v", descriptor = "I")
    private int field4209 = 32;

    @OriginalMember(owner = "client!tf", name = "w", descriptor = "J")
    private long field4210 = class71.method470(true);

    @OriginalMember(owner = "client!tf", name = "E", descriptor = "I")
    private int field4218 = 0;

    @OriginalMember(owner = "client!tf", name = "F", descriptor = "[Lej;")
    private class149[] field4219 = new class149[8];

    @OriginalMember(owner = "client!tf", name = "C", descriptor = "I")
    private int field4216 = 0;

    @OriginalMember(owner = "client!tf", name = "A", descriptor = "I")
    private int field4214 = 0;

    @OriginalMember(owner = "client!tf", name = "G", descriptor = "J")
    private long field4220 = 0L;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "[Lej;")
    private class149[] field4222 = new class149[8];

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "Z")
    private boolean field4223 = true;

    @OriginalMember(owner = "client!tf", name = "H", descriptor = "I")
    private int field4221 = 0;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "J")
    private long field4225 = 0L;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "Lmh;")
    public static class128 field4188 = class22.method156(122, "gelb:");

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "Lmh;")
    public static class128 field4194 = class22.method156(123, "Hidden)2use");

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "Lmh;")
    private static class128 field4200 = class22.method156(125, "cyan:");

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Lmh;")
    public static class128 field4197 = field4200;

    @OriginalMember(owner = "client!tf", name = "y", descriptor = "Lmh;")
    public static class128 field4212 = field4200;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "Ls;")
    public static class261 field4195 = new class261(64);

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field4196;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "I")
    public static int field4207;

    @OriginalMember(owner = "client!tf", name = "x", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!tf", name = "z", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
    public int field4215;

    @OriginalMember(owner = "client!tf", name = "D", descriptor = "I")
    private int field4217;

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "I")
    public int field4224;

    @OriginalMember(owner = "client!tf", name = "u", descriptor = "Lej;")
    private class149 field4208;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "[I")
    public int[] field4202;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V", line = 4)
    private final void method1669(int arg0, int arg1) {
        field4198++;
        if (arg0 != -18061) {
            this.method1675(-67);
        }
        this.field4216 -= arg1;
        if (this.field4216 < 0) {
            this.field4216 = 0;
        }
        if (this.field4208 != null) {
            this.field4208.method388(arg1);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "()I", line = 23)
    public int method1152() throws Exception {
        field4205++;
        return this.field4215;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBLej;)V", line = 32)
    private final void method1670(int arg0, byte arg1, class149 arg2) {
        field4204++;
        int var4 = arg0 >> 5;
        class149 var5 = this.field4222[var4];
        int var6 = 35 / ((55 - arg1) / 34);
        if (var5 == null) {
            this.field4219[var4] = arg2;
        } else {
            var5.field2561 = arg2;
        }
        this.field4222[var4] = arg2;
        arg2.field2560 = arg0;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "([II)V", line = 56)
    private final void method1671(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class195.field3424) {
            var3 = arg1 << 1;
        }
        class224.method1541(arg0, 0, var3);
        this.field4216 -= arg1;
        if (this.field4208 != null && this.field4216 <= 0) {
            this.field4216 += class10.field356 >> 4;
            class134.method893(false, this.field4208);
            this.method1670(this.field4208.method1001(), (byte) 105, this.field4208);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
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
                        class149 var10 = null;
                        class149 var11 = this.field4219[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class19 var12 = var11.field2559;
                                if (var12 == null || var12.field535 <= var8) {
                                    var11.field2562 = true;
                                    int var13 = var11.method398();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field535 += var13;
                                    }
                                    if (var4 >= this.field4209) {
                                        break label105;
                                    }
                                    class149 var14 = var11.method387();
                                    if (var14 != null) {
                                        int var15 = var11.field2560;
                                        while (var14 != null) {
                                            this.method1670(var15 * var14.method1001() >> 8, (byte) -80, var14);
                                            var14 = var11.method397();
                                        }
                                    }
                                    class149 var16 = var11.field2561;
                                    var11.field2561 = null;
                                    if (var10 == null) {
                                        this.field4219[var7] = var16;
                                    } else {
                                        var10.field2561 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field4222[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2561;
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
                class149 var18 = this.field4219[var17];
                this.field4219[var17] = this.field4222[var17] = null;
                while (var18 != null) {
                    class149 var19 = var18.field2561;
                    var18.field2561 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field4216 < 0) {
            this.field4216 = 0;
        }
        if (this.field4208 != null) {
            this.field4208.method392(arg0, 0, arg1);
        }
        this.field4210 = class71.method470(true);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 217)
    public final synchronized void method1672(int arg0) {
        this.field4223 = true;
        try {
            if (arg0 != 2000) {
                field4195 = (class261) null;
            }
            this.method1153();
        } catch (Exception var3) {
            this.method1150();
            this.field4225 = class71.method470(true) + 2000L;
        }
        field4199++;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "()V", line = 237)
    public void method1156() throws Exception {
        field4203++;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(II)Z", line = 246)
    public static final boolean method1673(int arg0, int arg1) {
        field4211++;
        if (arg0 != 57) {
            method1674((byte) 0);
        }
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V", line = 257)
    public static void method1674(byte arg0) {
        field4195 = null;
        field4194 = null;
        field4212 = null;
        if (arg0 >= -125) {
            field4197 = (class128) null;
        }
        field4200 = null;
        field4197 = null;
        field4188 = null;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "()V", line = 276)
    public void method1153() throws Exception {
        field4206++;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 287)
    public final synchronized void method1675(int arg0) {
        if (class62.field1187 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class62.field1187.field3759[var3] == this) {
                    class62.field1187.field3759[var3] = null;
                }
                if (class62.field1187.field3759[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class62.field1187.field3757 = true;
                while (class62.field1187.field3756) {
                    class177.method1213(0, 50L);
                }
                class62.field1187 = null;
            }
        }
        if (arg0 >= -90) {
            this.method1669(17, 121);
        }
        this.method1150();
        field4207++;
        this.field4202 = null;
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(I)V", line = 330)
    public final void method1676(int arg0) {
        if (arg0 != -6244) {
            this.field4221 = -125;
        }
        field4191++;
        this.field4223 = true;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBZZI)V", line = 341)
    public static final void method1677(int arg0, byte arg1, boolean arg2, boolean arg3, int arg4) {
        class218.method1508(0, class219.field3862.length - 1, arg2, arg3, arg4, arg0, (byte) 64);
        field4201++;
        int var5 = 64 % ((arg1 + 69) / 40);
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "()V", line = 351)
    public void method1150() {
        field4213++;
    }

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)V", line = 372)
    public static final void method1678(int arg0) {
        field4193++;
        for (class88 var1 = (class88) class182.field3198.method729(arg0 ^ 0x4F52); var1 != null; var1 = (class88) class182.field3198.method732(1)) {
            int var2 = var1.field1510;
            if (class133.method890(false, var2)) {
                class10[] var3 = class200.field3508[var2];
                boolean var4 = true;
                for (int var5 = 0; var5 < var3.length; var5++) {
                    if (var3[var5] != null) {
                        var4 = var3[var5].field294;
                        break;
                    }
                }
                if (!var4) {
                    int var6 = (int) var1.field4915;
                    class10 var7 = class233.method1606(true, var6);
                    if (var7 != null) {
                        class7.method48(var7, 0);
                    }
                }
            }
        }
        if (arg0 != -20249) {
            field4195 = (class261) null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lej;Z)V", line = 442)
    public final synchronized void method1679(class149 arg0, boolean arg1) {
        this.field4208 = arg0;
        if (!arg1) {
            this.method1676(59);
        }
        field4192++;
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(I)V", line = 455)
    public void method1155(int arg0) throws Exception {
        field4196++;
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)V", line = 462)
    public final synchronized void method1680(int arg0) {
        field4189++;
        if (this.field4202 == null) {
            return;
        }
        long var2 = class71.method470(true);
        try {
            if (this.field4225 != 0L) {
                if (this.field4225 > var2) {
                    return;
                }
                this.method1155(this.field4215);
                this.field4223 = true;
                this.field4225 = 0L;
            }
            int var4 = this.method1152();
            int var5 = this.field4224 + this.field4217;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field4221 < (this.field4218 - var4)) {
                this.field4221 = this.field4218 - var4;
            }
            if (arg0 != -30144) {
                this.method1679((class149) null, true);
            }
            if (this.field4215 < (var5 + 256)) {
                var4 = 0;
                this.field4215 += 1024;
                if (this.field4215 > 16384) {
                    this.field4215 = 16384;
                }
                this.method1150();
                this.method1155(this.field4215);
                if (var5 + 256 > this.field4215) {
                    var5 = this.field4215 - 256;
                    this.field4217 = var5 - this.field4224;
                }
                this.field4223 = true;
            }
            while (var4 < var5) {
                this.method1671(this.field4202, 256);
                var4 += 256;
                this.method1156();
            }
            if (var2 > this.field4220) {
                if (this.field4223) {
                    this.field4223 = false;
                } else if (this.field4221 == 0 && this.field4214 == 0) {
                    this.method1150();
                    this.field4225 = var2 + 2000L;
                    return;
                } else {
                    this.field4217 = Math.min(this.field4214, this.field4221);
                    this.field4214 = this.field4221;
                }
                this.field4221 = 0;
                this.field4220 = var2 + 2000L;
            }
            this.field4218 = var4;
        } catch (Exception var9) {
            this.method1150();
            this.field4225 = var2 + 2000L;
        }
        try {
            if (var2 > (this.field4210 + 500000L)) {
                var2 = this.field4210;
            }
            while ((this.field4210 + 5000L) < var2) {
                this.method1669(-18061, 256);
                this.field4210 += (long) (256000 / class10.field356);
            }
        } catch (Exception var8) {
            this.field4210 = var2;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 601)
    public void method1154(Component arg0) throws Exception {
        field4190++;
    }
}
