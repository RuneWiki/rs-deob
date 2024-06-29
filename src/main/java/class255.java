import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class255 extends class307 {

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "I")
    public int field4240 = 0;

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "I")
    public static int field4236 = 0;

    @OriginalMember(owner = "client!vg", name = "M", descriptor = "[Lm;")
    public static class44[] field4247 = new class44[4];

    @OriginalMember(owner = "client!vg", name = "R", descriptor = "I")
    public static int field4252 = 0;

    @OriginalMember(owner = "client!vg", name = "X", descriptor = "Lqd;")
    public static class40 field4258 = class147.method1106("Loaded world list data", (byte) -76);

    @OriginalMember(owner = "client!vg", name = "Z", descriptor = "[[B")
    public static byte[][] field4260 = new byte[1000][];

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "I")
    public int field4235;

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
    public int field4237;

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "I")
    public int field4238;

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "I")
    public int field4239;

    @OriginalMember(owner = "client!vg", name = "G", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "I")
    public int field4245;

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!vg", name = "O", descriptor = "I")
    public int field4249;

    @OriginalMember(owner = "client!vg", name = "P", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!vg", name = "Q", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!vg", name = "T", descriptor = "I")
    public int field4254;

    @OriginalMember(owner = "client!vg", name = "U", descriptor = "I")
    public int field4255;

    @OriginalMember(owner = "client!vg", name = "V", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!vg", name = "W", descriptor = "I")
    public static int field4257;

    @OriginalMember(owner = "client!vg", name = "Y", descriptor = "I")
    public int field4259;

    @OriginalMember(owner = "client!vg", name = "ab", descriptor = "I")
    public int field4261;

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "Ldi;")
    public class145 field4234;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "Ldi;")
    public class145 field4243;

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "Lve;")
    public static class258 field4233;

    @OriginalMember(owner = "client!vg", name = "bb", descriptor = "Lve;")
    public class258 field4262;

    @OriginalMember(owner = "client!vg", name = "N", descriptor = "Ljb;")
    public class27 field4248;

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "Lfm;")
    public class42 field4244;

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "Z")
    public boolean field4232;

    @OriginalMember(owner = "client!vg", name = "S", descriptor = "[I")
    public int[] field4253;

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "[[[B")
    public static byte[][][] field4241;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V", line = 7)
    public final void method1794(boolean arg0) {
        field4256++;
        int var2 = this.field4255;
        if (this.field4248 != null) {
            class27 var5 = this.field4248.method258((byte) -114);
            if (var5 == null) {
                this.field4238 = 0;
                this.field4255 = -1;
                this.field4235 = 0;
                this.field4245 = 0;
                this.field4253 = null;
            } else {
                this.field4238 = var5.field527;
                this.field4255 = var5.field531;
                this.field4253 = var5.field575;
                this.field4235 = var5.field574;
                this.field4245 = var5.field587 * 128;
            }
        } else if (this.field4244 != null) {
            int var3 = class76.method560(this.field4244, -1);
            if (var2 != var3) {
                this.field4255 = var3;
                class121 var4 = this.field4244.field796;
                if (var4.field2098 != null) {
                    var4 = var4.method918(-1);
                }
                if (var4 == null) {
                    this.field4245 = 0;
                } else {
                    this.field4245 = var4.field2096 * 128;
                }
            }
        } else if (this.field4262 != null) {
            this.field4255 = class228.method1600(this.field4262, 1);
            this.field4245 = this.field4262.field4314 * 128;
        }
        if (this.field4255 != var2 && this.field4234 != null) {
            class89.field1610.method1336(this.field4234);
            this.field4234 = null;
        }
        if (arg0) {
            this.field4238 = 64;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V", line = 97)
    public static final void method1795(byte arg0) {
        int var1 = class149.method1121(1);
        if (arg0 != 124) {
            return;
        }
        field4250++;
        if (var1 == 0) {
            field4241 = (byte[][][]) null;
            class181.method1325(0, true);
        } else if (var1 == 1) {
            class217.method1521((byte) 0, (byte) -77);
            class181.method1325(512, true);
            class49.method432(664);
        } else {
            class217.method1521((byte) (class55.field1069 - 4 & 0xFF), (byte) -77);
            class181.method1325(2, true);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIBI)I", line = 129)
    public static final int method1796(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4251++;
        if (class112.field1942) {
            class112.field1942 = false;
            arg0 = 1000000;
        }
        class217 var5 = class59.field1140[arg2][arg4];
        int var6 = var5.field3612;
        float var7 = ((float) arg1 * 0.1F + 0.7F) * var5.field3608;
        float var8 = var5.field3622;
        float var9 = var5.field3613;
        int var10 = var5.field3606;
        int var11 = var5.field3619;
        if (!class206.field3287) {
            var11 = 0;
        }
        if (arg3 < 16) {
            return 40;
        }
        if (class46.field894 != var6 || class188.field3015 != var7 || class106.field1857 != var8 || class211.field3363 != var9 || class55.field1073 != var10 || class120.field2025 != var11) {
            class55.field1073 = var10;
            class106.field1857 = var8;
            class188.field3015 = var7;
            class120.field2025 = var11;
            class73.field1288 = 0;
            class249.field4118 = class94.field1701;
            class46.field894 = var6;
            class209.field3343 = class258.field4290;
            class142.field2377 = class45.field887;
            class148.field2482 = class229.field3785;
            class63.field1195 = class217.field3607;
            class310.field5209 = class237.field3918;
            class211.field3363 = var9;
        }
        if (class73.field1288 < 65536) {
            class73.field1288 += arg0 * 250;
            if (class73.field1288 >= 65536) {
                class73.field1288 = 65536;
            }
            int var12 = 65536 - class73.field1288 >> 8;
            int var13 = class73.field1288 >> 8;
            class229.field3785 = ((class46.field894 & 0xFF00FF) * var13 + (class148.field2482 & 0xFF00FF) * var12 & 0xFF00FF00) + ((class148.field2482 & 0xFF00) * var12 + ((class46.field894 & 0xFF00) * var13) & 0xFF0000) >> 8;
            class94.field1701 = ((class249.field4118 & 0xFF00) * var12 + ((class55.field1073 & 0xFF00) * var13) & 0xFF0000) + ((class249.field4118 & 0xFF00FF) * var12 + ((class55.field1073 & 0xFF00FF) * var13) & 0xFF00FF00) >> 8;
            class217.field3607 = class63.field1195 * var12 + (class120.field2025 * var13) >> 8;
            float var14 = (float) (65536 - class73.field1288) / 65536.0F;
            float var15 = (float) class73.field1288 / 65536.0F;
            class237.field3918 = class310.field5209 * var14 + class211.field3363 * var15;
            class45.field887 = class142.field2377 * var14 + class106.field1857 * var15;
            class258.field4290 = class209.field3343 * var14 + class188.field3015 * var15;
        }
        class273.method1890(class229.field3785, class258.field4290, class45.field887, class237.field3918);
        class273.method1893(class94.field1701, class217.field3607);
        class273.method1891((float) class142.field2378, (float) class197.field3168, (float) class233.field3839);
        class273.method1886();
        return class94.field1701;
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)V", line = 217)
    public static void method1797(int arg0) {
        field4241 = (byte[][][]) null;
        field4260 = (byte[][]) null;
        field4258 = null;
        field4247 = null;
        if (arg0 == 32236) {
            field4233 = null;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIIIIIZ)V", line = 235)
    public static final void method1798(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        field4242++;
        if (method1799(arg0, arg8)) {
            class49.field949 = null;
            class299.method2039(arg4, arg5, arg1, arg2, arg3, -1, class44.field845[arg0], -1, arg6, arg7);
            if (class49.field949 != null) {
                class299.method2039(arg4, arg5, arg1, class207.field3297, arg3, -1, class49.field949, -1412584499, arg6, class49.field951);
                class49.field949 = null;
            }
            if (arg8) {
                method1795((byte) 24);
            }
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class229.field3778[var9] = true;
            }
        } else {
            class229.field3778[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IZ)Z", line = 280)
    public static final boolean method1799(int arg0, boolean arg1) {
        field4257++;
        if (class293.field4917[arg0]) {
            return true;
        } else if (class158.field2644.method1648(false, arg0)) {
            int var2 = class158.field2644.method1664(arg0, (byte) 30);
            if (var2 == 0) {
                class293.field4917[arg0] = true;
                return true;
            }
            if (class44.field845[arg0] == null) {
                class44.field845[arg0] = new class213[var2];
            }
            if (arg1) {
                field4236 = 108;
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class44.field845[arg0][var3] == null) {
                    byte[] var4 = class158.field2644.method1651(arg0, var3, -1);
                    if (var4 != null) {
                        class44.field845[arg0][var3] = new class213();
                        class44.field845[arg0][var3].field3507 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class44.field845[arg0][var3].method1506(new class26(var4), -65536);
                        } else {
                            class44.field845[arg0][var3].method1503(new class26(var4), (byte) 0);
                        }
                    }
                }
            }
            class293.field4917[arg0] = true;
            return true;
        } else {
            return false;
        }
    }
}
