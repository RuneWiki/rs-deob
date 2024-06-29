import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class467 extends class574 implements class514 {

    @OriginalMember(owner = "client!dp", name = "v", descriptor = "I")
    private int field6656;

    @OriginalMember(owner = "client!dp", name = "u", descriptor = "I")
    private int field6655;

    @OriginalMember(owner = "client!dp", name = "y", descriptor = "I")
    private int field6659;

    @OriginalMember(owner = "client!dp", name = "t", descriptor = "I")
    public static int field6654;

    @OriginalMember(owner = "client!dp", name = "w", descriptor = "I")
    public static int field6657;

    @OriginalMember(owner = "client!dp", name = "x", descriptor = "I")
    public static int field6658;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IBI)Ljw;")
    public static final class263 method2691(int arg0, byte arg1, int arg2) {
        ++field6654;
        class263 var3 = new class263();
        var3.field3287 = arg0 + 5 + 1;
        var3.field3271 = arg2 + 5 + 1;
        var3.field3289 = -1;
        var3.field3274 = -1;
        var3.field3286 = new int[var3.field3287][var3.field3271];
        var3.method1557((byte) 44);
        return arg1 <= 17 ? null : var3;
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(Lmr;Lsq;III[B)V")
    public class467(class221 arg0, class485 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class179.field2008, arg3 * arg4 * arg2, false);
        this.field6656 = arg3;
        this.field6655 = arg2;
        this.field6659 = arg4;
        super.field8143.method1997(127, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field8151, 0, this.method3244(19), this.field6655, this.field6656, this.field6659, 0, class181.method1102(super.field8155, (byte) 53), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public static final void method2692(int arg0) {
        ++field6658;
        if (~class639.field9075.method2640((byte) 48, class430.field6109) == -3) {
            byte var1 = (byte) (class330.field4057 - 4 & 255);
            int var2 = class330.field4057 % class142.field1574;
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var19 = 0; var19 < class140.field1550; ++var19) {
                    class125.field1420[var3][var2][var19] = var1;
                }
            }
            if (class169.field1888 != 3) {
                for (int var4 = 0; var4 < 2; ++var4) {
                    class309.field3823[var4] = -1000000;
                    class3.field34[var4] = 1000000;
                    class277.field3448[var4] = 0;
                    class397.field5361[var4] = 1000000;
                    class692.field9719[var4] = 0;
                }
                int var5 = 2 / ((arg0 - 33) / 58);
                int var6 = class362.field4859.field5179;
                int var7 = class362.field4859.field5176;
                if (~class538.field7572 != -2 && class307.field3791 == -1) {
                    int var8 = class593.method3335(class689.field9698, class169.field1888, 27648, class516.field7360);
                    if (-class44.field432 + var8 < 3200 && ~(4 & class16.field131[class169.field1888][class516.field7360 >> 9][class689.field9698 >> 9]) != -1) {
                        class143.method786(class487.field7044, 1, (byte) -112, false, class689.field9698 >> 9, class516.field7360 >> 9);
                        return;
                    }
                } else {
                    if (~class538.field7572 != -2) {
                        var7 = class510.field7319;
                        var6 = class307.field3791;
                    }
                    if ((4 & class16.field131[class169.field1888][var6 >> 9][var7 >> 9]) != 0) {
                        class143.method786(class487.field7044, 0, (byte) -83, false, var7 >> 9, var6 >> 9);
                    }
                    if (class485.field6986 < 2560) {
                        int var9 = class516.field7360 >> 9;
                        int var10 = class689.field9698 >> 9;
                        int var11 = var6 >> 9;
                        int var12 = var7 >> 9;
                        int var13;
                        if (~var11 < ~var9) {
                            var13 = var11 - var9;
                        } else {
                            var13 = -var11 + var9;
                        }
                        int var14;
                        if (var10 >= var12) {
                            var14 = -var12 + var10;
                        } else {
                            var14 = var12 - var10;
                        }
                        if ((~var13 != -1 || ~var14 != -1) && var13 > -class142.field1574 && var13 < class142.field1574 && ~(-class140.field1550) > ~var14 && var14 < class140.field1550) {
                            if (~var14 > ~var13) {
                                int var15 = var14 * 65536 / var13;
                                int var16 = 32768;
                                while (var9 != var11) {
                                    if (var11 <= var9) {
                                        if (var11 < var9) {
                                            --var9;
                                        }
                                    } else {
                                        ++var9;
                                    }
                                    if (~(4 & class16.field131[class169.field1888][var9][var10]) != -1) {
                                        class143.method786(class487.field7044, 1, (byte) -127, false, var10, var9);
                                        return;
                                    }
                                    var16 += var15;
                                    if (var16 >= 65536) {
                                        var16 -= 65536;
                                        if (~var10 > ~var12) {
                                            ++var10;
                                        } else if (var12 < var10) {
                                            --var10;
                                        }
                                        if (~(4 & class16.field131[class169.field1888][var9][var10]) != -1) {
                                            class143.method786(class487.field7044, 1, (byte) -102, false, var10, var9);
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                            int var17 = var13 * 65536 / var14;
                            int var18 = 32768;
                            while (~var10 != ~var12) {
                                if (var10 < var12) {
                                    ++var10;
                                } else if (var12 < var10) {
                                    --var10;
                                }
                                if (~(4 & class16.field131[class169.field1888][var9][var10]) != -1) {
                                    class143.method786(class487.field7044, 1, (byte) -105, false, var10, var9);
                                    return;
                                }
                                var18 += var17;
                                if (var18 >= 65536) {
                                    if (~var11 >= ~var9) {
                                        if (~var9 < ~var11) {
                                            --var9;
                                        }
                                    } else {
                                        ++var9;
                                    }
                                    var18 -= 65536;
                                    if (~(4 & class16.field131[class169.field1888][var9][var10]) != -1) {
                                        class143.method786(class487.field7044, 1, (byte) -122, false, var10, var9);
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                        class333.method1923((Throwable) null, true, "RC: " + var9 + "," + var10 + " " + var11 + "," + var12 + " " + class26.field245 + "," + class231.field2860);
                        return;
                    }
                }
            }
        }
    }
}
