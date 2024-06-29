import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public class class261 {

    @OriginalMember(owner = "client!lr", name = "t", descriptor = "Z")
    private boolean field3849 = false;

    @OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
    private int field3852 = 32;

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "J")
    private long field3832 = class450.method2719((byte) 119);

    @OriginalMember(owner = "client!lr", name = "D", descriptor = "I")
    private int field3859 = 0;

    @OriginalMember(owner = "client!lr", name = "F", descriptor = "I")
    private int field3861 = 0;

    @OriginalMember(owner = "client!lr", name = "E", descriptor = "[Lft;")
    private class514[] field3860 = new class514[8];

    @OriginalMember(owner = "client!lr", name = "C", descriptor = "J")
    private long field3858 = 0L;

    @OriginalMember(owner = "client!lr", name = "I", descriptor = "Z")
    private boolean field3864 = true;

    @OriginalMember(owner = "client!lr", name = "B", descriptor = "J")
    private long field3857 = 0L;

    @OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
    private int field3865 = 0;

    @OriginalMember(owner = "client!lr", name = "K", descriptor = "[Lft;")
    private class514[] field3866 = new class514[8];

    @OriginalMember(owner = "client!lr", name = "H", descriptor = "I")
    private int field3863 = 0;

    @OriginalMember(owner = "client!lr", name = "o", descriptor = "I")
    public static int field3844 = 0;

    @OriginalMember(owner = "client!lr", name = "e", descriptor = "F")
    public static float field3834;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!lr", name = "f", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!lr", name = "g", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!lr", name = "h", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!lr", name = "i", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!lr", name = "j", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!lr", name = "k", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!lr", name = "l", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!lr", name = "m", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!lr", name = "n", descriptor = "I")
    public static int field3843;

    @OriginalMember(owner = "client!lr", name = "q", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!lr", name = "r", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!lr", name = "s", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!lr", name = "u", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!lr", name = "v", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!lr", name = "x", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!lr", name = "y", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!lr", name = "z", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!lr", name = "A", descriptor = "I")
    public int field3856;

    @OriginalMember(owner = "client!lr", name = "G", descriptor = "I")
    public int field3862;

    @OriginalMember(owner = "client!lr", name = "L", descriptor = "I")
    private int field3867;

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "Lft;")
    private class514 field3831;

    @OriginalMember(owner = "client!lr", name = "p", descriptor = "[I")
    public int[] field3845;

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)V")
    private final void method1648(int arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        field3854++;
        this.field3865 -= arg0;
        if (this.field3865 < 0) {
            this.field3865 = 0;
        }
        if (this.field3831 != null) {
            this.field3831.method1434(arg0);
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
    public final synchronized void method1649(int arg0) {
        field3830++;
        if (arg0 <= 31) {
            this.method1652(-37, -22, null);
        }
        this.field3864 = true;
        try {
            this.method1663();
        } catch (Exception var2) {
            this.method1654();
            this.field3858 = class450.method2719((byte) 122) + 2000L;
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
    public final synchronized void method1650(int arg0) {
        field3846++;
        if (this.field3849) {
            return;
        }
        long var2 = class450.method2719((byte) 122);
        try {
            if ((this.field3832 + 500000L) < var2) {
                this.field3832 = var2 - 500000L;
            }
            while (var2 > (this.field3832 + 5000L)) {
                this.method1648(256, 1);
                this.field3832 += (256000 / class36.field419);
            }
        } catch (Exception var8) {
            this.field3832 = var2;
        }
        if (this.field3845 == null) {
            return;
        }
        try {
            if (this.field3858 != 0L) {
                if (var2 < this.field3858) {
                    return;
                }
                this.method1662(this.field3856);
                this.field3858 = 0L;
                this.field3864 = true;
            }
            int var4 = 85 % ((arg0 - 6) / 62);
            int var5 = this.method1651();
            if (this.field3861 < this.field3859 - var5) {
                this.field3861 = this.field3859 - var5;
            }
            int var6 = this.field3867 + this.field3862;
            if ((var6 + 256) > 16384) {
                var6 = 16128;
            }
            if ((var6 + 256) > this.field3856) {
                this.field3856 += 1024;
                if (this.field3856 > 16384) {
                    this.field3856 = 16384;
                }
                this.method1654();
                this.method1662(this.field3856);
                var5 = 0;
                if ((var6 + 256) > this.field3856) {
                    var6 = this.field3856 - 256;
                    this.field3867 = var6 - this.field3862;
                }
                this.field3864 = true;
            }
            while (var6 > var5) {
                this.method1660(this.field3845, 256);
                this.method1655();
                var5 += 256;
            }
            if (var2 > this.field3857) {
                if (this.field3864) {
                    this.field3864 = false;
                } else if (this.field3861 == 0 && this.field3863 == 0) {
                    this.method1654();
                    this.field3858 = var2 + 2000L;
                    return;
                } else {
                    this.field3867 = Math.min(this.field3863, this.field3861);
                    this.field3863 = this.field3861;
                }
                this.field3861 = 0;
                this.field3857 = var2 + 2000L;
            }
            this.field3859 = var5;
        } catch (Exception var7) {
            this.method1654();
            this.field3858 = var2 + 2000L;
        }
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "()I")
    public int method1651() throws Exception {
        field3855++;
        return this.field3856;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IILft;)V")
    private final void method1652(int arg0, int arg1, class514 arg2) {
        field3850++;
        int var4 = arg1 >> 5;
        if (arg0 != -18382) {
            this.field3864 = false;
        }
        class514 var5 = this.field3860[var4];
        if (var5 == null) {
            this.field3866[var4] = arg2;
        } else {
            var5.field7613 = arg2;
        }
        this.field3860[var4] = arg2;
        arg2.field7614 = arg1;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IB)V")
    public static final void method1653(int arg0, byte arg1) {
        field3836++;
        class621 var2 = class442.method2691(arg0, 8, true);
        if (arg1 == -94) {
            var2.method3598(255);
        }
    }

    @OriginalMember(owner = "client!lr", name = "b", descriptor = "()V")
    public void method1654() {
        field3851++;
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "()V")
    public void method1655() throws Exception {
        field3835++;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILft;)V")
    public final synchronized void method1656(int arg0, class514 arg1) {
        field3839++;
        this.field3831 = arg1;
        int var3 = 89 % ((arg0 - 19) / 33);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method1657(Component arg0) throws Exception {
        field3841++;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "([FIIIIIBIFI)V")
    public static final void method1658(float[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, float arg8, int arg9) {
        field3837++;
        int var10 = arg3 - arg5;
        int var11 = arg2 - arg7;
        int var12 = arg4 - arg9;
        float var13 = arg0[2] * (float) var11 + arg0[0] * (float) var12 + arg0[1] * (float) var10;
        float var14 = arg0[5] * (float) var11 + arg0[3] * (float) var12 + arg0[4] * (float) var10;
        float var15 = arg0[8] * (float) var11 + arg0[7] * (float) var10 + arg0[6] * (float) var12;
        int var16 = -61 / ((41 - arg6) / 46);
        float var17 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var18 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var19 = (float) Math.asin((double) (var14 / var17)) / 3.1415927F + arg8 + 0.5F;
        if (arg1 == 1) {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        } else if (arg1 == 2) {
            var19 = -var19;
            var18 = -var18;
        } else if (arg1 == 3) {
            float var20 = var18;
            var18 = var19;
            var19 = -var20;
        }
        class78.field912 = var19;
        class118.field1546 = var18;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V")
    public final synchronized void method1659(byte arg0) {
        if (class459.field6656 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class459.field6656.field9228[var3] == this) {
                    class459.field6656.field9228[var3] = null;
                }
                if (class459.field6656.field9228[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class459.field6656.field9226 = true;
                while (class459.field6656.field9227) {
                    class428.method2624(1, 50L);
                }
                class459.field6656 = null;
            }
        }
        field3843++;
        if (arg0 >= -24) {
            this.field3832 = -110L;
        }
        this.method1654();
        this.field3849 = true;
        this.field3845 = null;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "([II)V")
    private final void method1660(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class614.field9002) {
            var3 = arg1 << 1;
        }
        class473.method2878(arg0, 0, var3);
        this.field3865 -= arg1;
        if (this.field3831 != null && this.field3865 <= 0) {
            this.field3865 += class36.field419 >> 4;
            class313.method1933(this.field3831, 0);
            this.method1652(-18382, this.field3831.method1418(), this.field3831);
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
                        class514 var10 = null;
                        class514 var11 = this.field3866[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class305 var12 = var11.field7616;
                                if (var12 == null || var12.field4450 <= var8) {
                                    var11.field7615 = true;
                                    int var13 = var11.method1419();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field4450 += var13;
                                    }
                                    if (var4 >= this.field3852) {
                                        break label107;
                                    }
                                    class514 var14 = var11.method1437();
                                    if (var14 != null) {
                                        int var15 = var11.field7614;
                                        while (var14 != null) {
                                            this.method1652(-18382, var15 * var14.method1418() >> 8, var14);
                                            var14 = var11.method1397();
                                        }
                                    }
                                    class514 var16 = var11.field7613;
                                    var11.field7613 = null;
                                    if (var10 == null) {
                                        this.field3866[var7] = var16;
                                    } else {
                                        var10.field7613 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3860[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field7613;
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
                class514 var18 = this.field3866[var17];
                this.field3866[var17] = this.field3860[var17] = null;
                while (var18 != null) {
                    class514 var19 = var18.field7613;
                    var18.field7613 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3865 < 0) {
            this.field3865 = 0;
        }
        if (this.field3831 != null) {
            this.field3831.method1425(arg0, 0, arg1);
        }
        this.field3832 = class450.method2719((byte) 119);
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/awt/Component;B)Lnl;")
    public static final class533 method1661(Component arg0, byte arg1) {
        field3848++;
        return arg1 == -125 ? new class195(arg0) : null;
    }

    @OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V")
    public void method1662(int arg0) throws Exception {
        field3853++;
    }

    @OriginalMember(owner = "client!lr", name = "d", descriptor = "()V")
    public void method1663() throws Exception {
        field3847++;
    }

    @OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1664(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 != -256) {
            method1661(null, (byte) 106);
        }
        int var7 = arg0 & 0x3;
        field3833++;
        if ((arg5 & 0x1) == 1) {
            int var8 = arg6;
            arg6 = arg2;
            arg2 = var8;
        }
        if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return arg4;
        } else if (var7 == 2) {
            return 8 - arg6 - arg3;
        } else {
            return 1 + 7 - arg2 - arg4;
        }
    }
}
