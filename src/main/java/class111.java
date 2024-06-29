import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class111 extends class585 {

    @OriginalMember(owner = "client!qda", name = "M", descriptor = "[S")
    private short[] field1703 = new short[512];

    @OriginalMember(owner = "client!qda", name = "H", descriptor = "I")
    private int field1698 = 2;

    @OriginalMember(owner = "client!qda", name = "O", descriptor = "[B")
    private byte[] field1705 = new byte[512];

    @OriginalMember(owner = "client!qda", name = "Q", descriptor = "I")
    private int field1707 = 0;

    @OriginalMember(owner = "client!qda", name = "K", descriptor = "I")
    private int field1701 = 5;

    @OriginalMember(owner = "client!qda", name = "R", descriptor = "I")
    private int field1708 = 2048;

    @OriginalMember(owner = "client!qda", name = "U", descriptor = "I")
    private int field1711 = 5;

    @OriginalMember(owner = "client!qda", name = "V", descriptor = "I")
    private int field1712 = 1;

    @OriginalMember(owner = "client!qda", name = "P", descriptor = "[I")
    public static int[] field1706 = new int[6];

    @OriginalMember(owner = "client!qda", name = "I", descriptor = "Lfba;")
    public static class27 field1699 = new class27(24, 3);

    @OriginalMember(owner = "client!qda", name = "W", descriptor = "Ljo;")
    public static class353 field1713 = new class353(512);

    @OriginalMember(owner = "client!qda", name = "E", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!qda", name = "F", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!qda", name = "G", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!qda", name = "L", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!qda", name = "N", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!qda", name = "S", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!qda", name = "T", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!qda", name = "J", descriptor = "[Lrca;")
    public static class478[] field1700;

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "()V")
    public class111() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field1695;
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (super.field8255.field3677) {
            int var4 = class633.field8892[arg0] * this.field1701 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class293.field4278 > var7; ++var7) {
                class154.field2188 = Integer.MAX_VALUE;
                class789.field10826 = Integer.MAX_VALUE;
                class772.field10593 = Integer.MAX_VALUE;
                class24.field384 = Integer.MAX_VALUE;
                int var8 = class581.field8200[var7] * this.field1711 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                    int var13 = 255 & this.field1705[255 & (~this.field1701 < ~var11 ? var11 : var11 - this.field1701)];
                    for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                        int var15 = (this.field1705[255 & var13 + (var14 >= this.field1711 ? -this.field1711 + var14 : var14)] & 255) * 2;
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 - this.field1703[var15] + var8;
                        int var17 = -(var11 << 12) - this.field1703[var27] + var4;
                        int var18 = this.field1712;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (~var18 != -6) {
                                        if (~var18 == -3) {
                                            var19 = (~var16 <= -1 ? var16 : -var16) + (var17 >= 0 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var21 - -var20) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 <= -1 ? var16 : -var16;
                                int var26 = ~var17 <= -1 ? var17 : -var17;
                                var19 = ~var25 < ~var26 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 - -(var17 * var17) >> 12;
                        }
                        if (var19 < class24.field384) {
                            class154.field2188 = class789.field10826;
                            class789.field10826 = class772.field10593;
                            class772.field10593 = class24.field384;
                            class24.field384 = var19;
                        } else if (~var19 <= ~class772.field10593) {
                            if (~var19 <= ~class789.field10826) {
                                if (~var19 > ~class154.field2188) {
                                    class154.field2188 = var19;
                                }
                            } else {
                                class154.field2188 = class789.field10826;
                                class789.field10826 = var19;
                            }
                        } else {
                            class154.field2188 = class789.field10826;
                            class789.field10826 = class772.field10593;
                            class772.field10593 = var19;
                        }
                    }
                }
                int var12 = this.field1698;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class24.field384 + class772.field10593;
                                }
                            } else {
                                var3[var7] = class154.field2188;
                            }
                        } else {
                            var3[var7] = class789.field10826;
                        }
                    } else {
                        var3[var7] = class772.field10593;
                    }
                } else {
                    var3[var7] = class24.field384;
                }
            }
        }
        if (arg1 < 123) {
            this.field1703 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(I)V")
    public final void method52(int arg0) {
        this.field1705 = class31.method258(this.field1707, (byte) 32);
        ++field1709;
        if (arg0 == -4096) {
            this.method852((byte) -63);
        }
    }

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "(I)V")
    public static void method849(int arg0) {
        field1700 = null;
        field1706 = null;
        field1699 = null;
        field1713 = null;
        if (arg0 != -1) {
            field1697 = 66;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "([FIIIIII)V")
    public static final void method850(float[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1710;
        if (~arg5 < -1 && !class262.method1704(arg5, arg4 ^ 2)) {
            throw new IllegalArgumentException("");
        } else if (~arg1 < -1 && !class262.method1704(arg1, 3)) {
            throw new IllegalArgumentException("");
        } else {
            int var7 = class397.method2449(4, arg6);
            int var8 = 0;
            int var9 = ~arg1 < ~arg5 ? arg5 : arg1;
            int var10 = arg5 >> 1;
            int var11 = arg1 >> 1;
            float[] var12 = arg0;
            float[] var13 = new float[var7 * var11 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg3, var8, arg2, arg5, arg1, 0, arg6, 5126, var12, 0);
                if (~var9 >= -2) {
                    if (arg4 != 1) {
                        method851(40, false, -43, (class669) null, 33);
                        return;
                    }
                    return;
                }
                int var14 = arg5 * var7;
                for (int var15 = 0; ~var7 < ~var15; ++var15) {
                    int var17 = var15;
                    int var18 = var15;
                    int var19 = var14 + var15;
                    for (int var20 = 0; ~var20 > ~var11; ++var20) {
                        for (int var21 = 0; ~var10 < ~var21; ++var21) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            float var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                float[] var16 = var13;
                var13 = var12;
                var12 = var16;
                arg1 = var11;
                arg5 = var10;
                ++var8;
                var11 >>= 1;
                var10 >>= 1;
                var9 >>= 1;
            }
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lso;II)V")
    public final void method54(class494 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 == -7) {
                                    this.field1701 = arg0.method2964((byte) 49);
                                }
                            } else {
                                this.field1711 = arg0.method2964((byte) 75);
                            }
                        } else {
                            this.field1712 = arg0.method2964((byte) 123);
                        }
                    } else {
                        this.field1698 = arg0.method2964((byte) 37);
                    }
                } else {
                    this.field1708 = arg0.method2998(true);
                }
            } else {
                this.field1707 = arg0.method2964((byte) 50);
            }
        } else {
            this.field1711 = this.field1701 = arg0.method2964((byte) 113);
        }
        if (arg1 == 1) {
            ++field1704;
        }
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(IZILph;I)V")
    public static final void method851(int arg0, boolean arg1, int arg2, class669 arg3, int arg4) {
        ++field1696;
        long var5 = (long) (arg4 | arg2 << 14 | arg0 << 28);
        class102 var7 = (class102) class250.field3692.method2242(var5, -1);
        if (var7 == null) {
            class102 var8 = new class102();
            class250.field3692.method2241(101, var5, var8);
            var8.field1182.method1727(arg3, (byte) 97);
        } else {
            class689 var9 = class313.field4456.method1681(arg3.field9305, 122);
            if (!arg1) {
                method850((float[]) null, 69, -34, -50, 18, -21, 28);
            }
            int var10 = var9.field9599;
            if (~var9.field9573 == -2) {
                var10 = (arg3.field9304 - -1) * var10;
            }
            for (class669 var11 = (class669) var7.field1182.method1731((byte) -125); var11 != null; var11 = (class669) var7.field1182.method1724(0)) {
                class689 var12 = class313.field4456.method1681(var11.field9305, 83);
                int var13 = var12.field9599;
                if (var12.field9573 == 1) {
                    var13 = (var11.field9304 + 1) * var13;
                }
                if (~var10 < ~var13) {
                    class788.method4316(-123, arg3, var11);
                    return;
                }
            }
            var7.field1182.method1727(arg3, (byte) 78);
        }
    }

    @OriginalMember(owner = "client!qda", name = "e", descriptor = "(B)V")
    private final void method852(byte arg0) {
        ++field1702;
        if (arg0 < -13) {
            Random var2 = new Random((long) this.field1707);
            this.field1703 = new short[512];
            if (this.field1708 > 0) {
                for (int var3 = 0; ~var3 > -513; ++var3) {
                    this.field1703[var3] = (short) class7.method51(-60, var2, this.field1708);
                }
            }
        }
    }
}
