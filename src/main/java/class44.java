import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class44 extends class210 {

    @OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
    private int field576 = 2048;

    @OriginalMember(owner = "client!wb", name = "W", descriptor = "I")
    private int field586 = 0;

    @OriginalMember(owner = "client!wb", name = "S", descriptor = "I")
    private int field582 = 10;

    @OriginalMember(owner = "client!wb", name = "I", descriptor = "Lbn;")
    public static class160 field573 = new class160(41, 15);

    @OriginalMember(owner = "client!wb", name = "X", descriptor = "[Lnp;")
    public static class213[] field587 = new class213[14];

    @OriginalMember(owner = "client!wb", name = "Z", descriptor = "I")
    public static int field589 = -1;

    @OriginalMember(owner = "client!wb", name = "Y", descriptor = "Lbt;")
    public static class363 field588 = new class363(64);

    @OriginalMember(owner = "client!wb", name = "J", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!wb", name = "K", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!wb", name = "N", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!wb", name = "O", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!wb", name = "P", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!wb", name = "T", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!wb", name = "U", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!wb", name = "V", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!wb", name = "Q", descriptor = "[I")
    private int[] field580;

    @OriginalMember(owner = "client!wb", name = "R", descriptor = "[I")
    private int[] field581;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIII)V")
    public static final void method365(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -117 % ((30 - arg2) / 40);
        ++field579;
        class159.field2132.method1721(25153, arg0);
        class159.field2132.method1750((byte) 0, arg3);
        class159.field2132.method1750((byte) 0, arg1);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILgt;IBLjava/awt/Component;)Lfr;")
    public static final class105 method366(int arg0, class341 arg1, int arg2, byte arg3, Component arg4) {
        ++field585;
        if (class298.field4331 == 0) {
            throw new IllegalStateException();
        } else if (~arg2 <= -1 && arg2 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class105 var5 = (class105) Class.forName("eo").newInstance();
                var5.field1413 = arg0;
                var5.field1410 = new int[256 * (class263.field3896 ? 2 : 1)];
                var5.method747(arg4);
                var5.field1421 = (-1024 & arg0) - -1024;
                if (~var5.field1421 < -16385) {
                    var5.field1421 = 16384;
                }
                var5.method753(var5.field1421);
                if (class36.field513 > 0 && class242.field3590 == null) {
                    class242.field3590 = new class431();
                    class242.field3590.field6282 = arg1;
                    arg1.method2213(class36.field513, class242.field3590, 26744);
                }
                if (class242.field3590 != null) {
                    if (class242.field3590.field6281[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class242.field3590.field6281[arg2] = var5;
                }
                return var5;
            } catch (Throwable var9) {
                try {
                    class218 var6 = new class218(arg1, arg2);
                    var6.field1410 = new int[(!class263.field3896 ? 1 : 2) * 256];
                    var6.field1413 = arg0;
                    var6.method747(arg4);
                    var6.field1421 = 16384;
                    var6.method753(var6.field1421);
                    int var7 = 0 % ((-67 - arg3) / 57);
                    if (~class36.field513 < -1 && class242.field3590 == null) {
                        class242.field3590 = new class431();
                        class242.field3590.field6282 = arg1;
                        arg1.method2213(class36.field513, class242.field3590, 26744);
                    }
                    if (class242.field3590 != null) {
                        if (class242.field3590.field6281[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class242.field3590.field6281[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var8) {
                    return new class105();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IB)[I")
    public final int[] method361(int arg0, byte arg1) {
        ++field584;
        int[] var3 = super.field2950.method1892(arg0, (byte) -115);
        if (arg1 != -38) {
            return null;
        } else {
            if (super.field2950.field4111) {
                int var4 = class331.field4911[arg0];
                if (~this.field586 == -1) {
                    short var5 = 0;
                    for (int var6 = 0; var6 < this.field582; ++var6) {
                        if (~this.field581[var6] >= ~var4 && ~this.field581[var6 + 1] < ~var4) {
                            if (this.field580[var6] > var4) {
                                var5 = 4096;
                            }
                            break;
                        }
                    }
                    class224.method1542(var3, 0, class202.field2852, var5);
                } else {
                    for (int var7 = 0; class202.field2852 > var7; ++var7) {
                        int var8 = 0;
                        short var9 = 0;
                        int var10 = class430.field6250[var7];
                        int var11 = this.field586;
                        if (~var11 != -2) {
                            if (var11 != 2) {
                                if (var11 == 3) {
                                    var8 = (-var4 + var10 >> 1) + 2048;
                                }
                            } else {
                                var8 = (var4 + -4096 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = var10;
                        }
                        for (int var12 = 0; ~var12 > ~this.field582; ++var12) {
                            if (this.field581[var12] <= var8 && this.field581[var12 + 1] > var8) {
                                if (~this.field580[var12] < ~var8) {
                                    var9 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var7] = var9;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
    public final void method363(int arg0) {
        if (arg0 != 0) {
            this.method363(-83);
        }
        ++field578;
        this.method367((byte) 39);
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)V")
    private final void method367(byte arg0) {
        ++field577;
        this.field580 = new int[this.field582 + 1];
        if (arg0 != 39) {
            method365(-8, -12, -123, -99);
        }
        int var2 = 0;
        this.field581 = new int[this.field582 + 1];
        int var3 = 4096 / this.field582;
        int var4 = this.field576 * var3 >> 12;
        for (int var5 = 0; ~this.field582 < ~var5; ++var5) {
            this.field581[var5] = var2;
            this.field580[var5] = var2 - -var4;
            var2 += var3;
        }
        this.field581[this.field582] = 4096;
        this.field580[this.field582] = 4096 - -this.field580[0];
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)V")
    public static final void method368(byte arg0, int arg1) {
        if (arg0 != -10) {
            method366(114, (class341) null, -106, (byte) -55, (Component) null);
        }
        ++field574;
        class125 var2 = class56.method428(arg1, 12, -3636);
        var2.method847(arg0 + 108);
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(B)V")
    public static void method369(byte arg0) {
        field587 = null;
        field588 = null;
        field573 = null;
        if (arg0 != -80) {
            field573 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
    public class44() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILat;)V")
    public final void method56(int arg0, int arg1, class256 arg2) {
        if (arg1 != -11941) {
            this.method363(81);
        }
        ++field575;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field586 = arg2.method1738((byte) -34);
                }
            } else {
                this.field576 = arg2.method1767(1930493576);
            }
        } else {
            this.field582 = arg2.method1738((byte) -102);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZII)I")
    public static final int method370(int arg0, boolean arg1, int arg2, int arg3) {
        ++field583;
        int var4 = -arg2 + 255;
        if (arg1) {
            field587 = null;
        }
        int var5 = (16711680 & (65280 & arg3) * arg2 | -16711936 & (16711935 & arg3) * arg2) >>> 8;
        return (((65280 & arg0) * var4 & 16711680 | (arg0 & 16711935) * var4 & -16711936) >>> 8) - -var5;
    }
}
