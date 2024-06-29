import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class315 {

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    private int field4327 = -1;

    @OriginalMember(owner = "client!gd", name = "r", descriptor = "Z")
    public boolean field4337 = true;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "I")
    private int field4333;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "Lpm;")
    private class546 field4330;

    @OriginalMember(owner = "client!gd", name = "s", descriptor = "Lej;")
    private class111 field4338;

    @OriginalMember(owner = "client!gd", name = "v", descriptor = "I")
    private int field4341;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public int field4320;

    @OriginalMember(owner = "client!gd", name = "q", descriptor = "Lak;")
    private class324 field4336;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    private int field4323;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    private int field4325;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "Lft;")
    private class4 field4328;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "D")
    public static double field4324 = -1.0D;

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "I")
    public static int field4332 = 0;

    @OriginalMember(owner = "client!gd", name = "t", descriptor = "Lcu;")
    public static class206 field4339 = new class206(44, 8);

    @OriginalMember(owner = "client!gd", name = "w", descriptor = "I")
    public static int field4342 = -1;

    @OriginalMember(owner = "client!gd", name = "o", descriptor = "F")
    public static float field4334;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!gd", name = "p", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!gd", name = "x", descriptor = "Llfa;")
    public static class103 field4343;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 6)
    public final void method1875(int arg0) {
        if (arg0 == -1) {
            field4322++;
            this.method1876(false, this.field4320, this.field4328);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZILft;)V", line = 17)
    public final void method1876(boolean arg0, int arg1, class4 arg2) {
        if (arg1 > 0) {
            this.method1882(74);
            this.field4338.method897(this.field4336, true);
            this.field4338.method53(0, this.field4325, class620.field8229, arg2, 0, this.field4323 + 1 - this.field4325, arg1);
        }
        if (arg0) {
            method1877(70, -59, 5);
        }
        field4331++;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)Z", line = 42)
    public static final boolean method1877(int arg0, int arg1, int arg2) {
        field4335++;
        if (arg0 == 458752) {
            return (arg2 & 0x70000) != 0 | class445.method2510((byte) -118, arg1, arg2) || class565.method3097((byte) 17, arg1, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)I", line = 55)
    public static final int method1878(int arg0, int arg1, int arg2, int arg3) {
        field4321++;
        if (class218.field3099 == null) {
            return 0;
        }
        int var4 = arg0 >> 9;
        int var5 = arg3 >> 9;
        if (var4 < 0 || var5 < 0 || var4 > class34.field530 - 1 || (class34.field531 - 1) < var5) {
            return 0;
        }
        if (arg1 != 2921) {
            field4324 = -2.267863341273287D;
        }
        int var6 = arg2;
        if (arg2 < 3 && (class477.field6362[1][var4][var5] & 0x2) != 0) {
            var6 = arg2 + 1;
        }
        return class218.field3099[var6].method200(arg0, arg3);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 82)
    public static final void method1879(byte arg0) {
        field4326++;
        class463.method2624(false, class109.field1591);
        class549.field7326++;
        if (class233.field3270 && class704.field9907) {
            int var1 = class164.field2564.method1110((byte) 91);
            int var2 = class164.field2564.method1113(-6387);
            int var3 = var1 - class628.field8468;
            int var4 = var2 - class643.field8627;
            if (var3 < class199.field2886) {
                var3 = class199.field2886;
            }
            if (class199.field2886 + class673.field9525.field8350 < class109.field1591.field8350 + var3) {
                var3 = class199.field2886 + class673.field9525.field8350 - class109.field1591.field8350;
            }
            if (arg0 != 99) {
                field4324 = 0.7546458080740784D;
            }
            if (class138.field2231 > var4) {
                var4 = class138.field2231;
            }
            if (var4 + class109.field1591.field8361 > class138.field2231 + class673.field9525.field8361) {
                var4 = class138.field2231 + class673.field9525.field8361 - class109.field1591.field8361;
            }
            int var5 = var3 + class673.field9525.field8365 - class199.field2886;
            int var6 = class673.field9525.field8441 + var4 - class138.field2231;
            if (class164.field2564.method2667(true)) {
                if (class549.field7326 > class109.field1591.field8360) {
                    int var8 = var3 - class210.field3000;
                    int var9 = var4 - class201.field2941;
                    if (var8 > class109.field1591.field8398 || var8 < -class109.field1591.field8398 || var9 > class109.field1591.field8398 || var9 < -class109.field1591.field8398) {
                        class29.field477 = true;
                    }
                }
                if (class109.field1591.field8425 != null && class29.field477) {
                    class48 var10 = new class48();
                    var10.field681 = class109.field1591.field8425;
                    var10.field692 = class109.field1591;
                    var10.field682 = var5;
                    var10.field691 = var6;
                    class544.method3013(var10);
                }
            } else {
                if (class29.field477) {
                    class671.method3761(1);
                    if (class109.field1591.field8278 != null) {
                        class48 var7 = new class48();
                        var7.field681 = class109.field1591.field8278;
                        var7.field682 = var5;
                        var7.field692 = class109.field1591;
                        var7.field688 = class484.field6543;
                        var7.field691 = var6;
                        class544.method3013(var7);
                    }
                    if (class484.field6543 != null && client.method1702(class109.field1591) != null) {
                        class690.method3831(class109.field1591, class484.field6543, -104);
                    }
                } else if ((class47.field671 == 1 || class244.method1496(-127)) && class398.field5290 > 2) {
                    class338.method2053(class628.field8468 + class210.field3000, class643.field8627 + class201.field2941, arg0 - 174);
                } else if (class111.method876((byte) 39)) {
                    class338.method2053(class628.field8468 + class210.field3000, class643.field8627 + class201.field2941, -113);
                }
                class109.field1591 = null;
            }
        } else if (class549.field7326 > 1) {
            class109.field1591 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V", line = 200)
    public static void method1880(int arg0) {
        if (arg0 < -115) {
            field4343 = null;
            field4339 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lej;Lpm;Lan;IIIII)V", line = 407)
    public class315(class111 arg0, class546 arg1, class22 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field4333 = arg7;
        this.field4330 = arg1;
        this.field4338 = arg0;
        this.field4341 = arg6;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field2247 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field327[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field4320 = 0;
            this.field4336 = null;
        } else {
            this.field4323 = Integer.MIN_VALUE;
            this.field4325 = Integer.MAX_VALUE;
            this.field4328 = this.field4338.method105(false, 10);
            this.field4328.method26(-24955, var10);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field4328.method27((byte) -64, true);
                if (var15 != null) {
                    Stream var16 = this.field4338.method896(var15, (byte) -82);
                    if (Stream.method3473()) {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field2247 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field327[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 > this.field4323) {
                                            this.field4323 = var28;
                                        }
                                        if (var28 < this.field4325) {
                                            this.field4325 = var28;
                                        }
                                        var16.method3474(var28);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field2247 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field327[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field4323 < var22) {
                                            this.field4323 = var22;
                                        }
                                        if (var22 < this.field4325) {
                                            this.field4325 = var22;
                                        }
                                        var16.method3478(var22);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3479();
                    if (this.field4328.method28(11390)) {
                        break;
                    }
                }
            }
            this.field4320 = var10 / 3;
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 224)
    public static final void method1881(String arg0, int arg1, int arg2) {
        field4340++;
        class135.method1011("", "", arg0, arg2, "", arg1, 115);
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V", line = 232)
    private final void method1882(int arg0) {
        field4329++;
        if (!this.field4337) {
            return;
        }
        this.field4337 = false;
        int var2 = 31 / ((arg0 - 3) / 57);
        byte[] var3 = this.field4330.field7272;
        int var4 = 0;
        int var5 = this.field4330.field7282;
        int var6 = this.field4330.field7282 * this.field4333 + this.field4341;
        for (int var7 = -128; var7 < 0; var7++) {
            var4 = (var4 << 8) - var4;
            for (int var18 = -128; var18 < 0; var18++) {
                if (var3[var6++] != 0) {
                    var4++;
                }
            }
            var6 += var5 - 128;
        }
        if (this.field4336 != null && this.field4327 == var4) {
            this.field4337 = false;
            return;
        }
        this.field4327 = var4;
        int var8 = 0;
        int var9 = this.field4333 * var5 + this.field4341;
        if (!this.field4338.method69(class616.field8164, true, class294.field4160)) {
            if (class55.field763 == null) {
                class55.field763 = new int[16384];
            }
            int[] var10 = class55.field763;
            for (int var11 = -128; var11 < 0; var11++) {
                for (int var12 = -128; var12 < 0; var12++) {
                    if (var3[var9] == 0) {
                        int var13 = 0;
                        if (var3[var9 - 1] != 0) {
                            var13++;
                        }
                        if (var3[var9 + 1] != 0) {
                            var13++;
                        }
                        if (var3[var9 - var5] != 0) {
                            var13++;
                        }
                        if (var3[var5 + var9] != 0) {
                            var13++;
                        }
                        var10[var8++] = var13 * 17 << 24;
                    } else {
                        var10[var8++] = 1140850688;
                    }
                    var9++;
                }
                var9 += this.field4330.field7282 - 128;
            }
            if (this.field4336 == null) {
                this.field4336 = this.field4338.method878(false, 128, 128, class55.field763, (byte) -22);
                this.field4336.method947((byte) 109, false, false);
            } else {
                this.field4336.method941(0, 128, 128, 128, 0, 0, -89, class55.field763);
            }
            return;
        }
        if (class525.field6999 == null) {
            class525.field6999 = new byte[16384];
        }
        byte[] var14 = class525.field6999;
        for (int var15 = -128; var15 < 0; var15++) {
            for (int var16 = -128; var16 < 0; var16++) {
                if (var3[var9] == 0) {
                    int var17 = 0;
                    if (var3[var9 - 1] != 0) {
                        var17++;
                    }
                    if (var3[var9 + 1] != 0) {
                        var17++;
                    }
                    if (var3[var9 - var5] != 0) {
                        var17++;
                    }
                    if (var3[var5 + var9] != 0) {
                        var17++;
                    }
                    var14[var8++] = (byte) (var17 * 17);
                } else {
                    var14[var8++] = 68;
                }
                var9++;
            }
            var9 += this.field4330.field7282 - 128;
        }
        if (this.field4336 == null) {
            this.field4336 = this.field4338.method884((byte) 96, false, 128, class525.field6999, class616.field8164, 128);
            this.field4336.method947((byte) 106, false, false);
        } else {
            this.field4336.method945(128, (byte) 52, 0, 0, class525.field6999, class616.field8164, 0, 128, 128);
        }
    }
}
