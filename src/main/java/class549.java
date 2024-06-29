import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class549 extends class478 {

    @OriginalMember(owner = "client!dk", name = "B", descriptor = "[I")
    public static int[] field7857 = new int[3];

    @OriginalMember(owner = "client!dk", name = "C", descriptor = "I")
    public static int field7858;

    @OriginalMember(owner = "client!dk", name = "E", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!dk", name = "F", descriptor = "I")
    public static int field7860;

    @OriginalMember(owner = "client!dk", name = "G", descriptor = "I")
    public static int field7861;

    @OriginalMember(owner = "client!dk", name = "H", descriptor = "I")
    public static int field7862;

    @OriginalMember(owner = "client!dk", name = "I", descriptor = "I")
    public static int field7863;

    @OriginalMember(owner = "client!dk", name = "L", descriptor = "I")
    public static int field7866;

    @OriginalMember(owner = "client!dk", name = "J", descriptor = "Lhc;")
    public static class431 field7864;

    @OriginalMember(owner = "client!dk", name = "K", descriptor = "[Lbm;")
    private class299[] field7865;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILnp;I)V", line = 6)
    public final void method33(int arg0, class115 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field6881 = ~arg1.method620((byte) -127) == -2;
            }
        } else {
            this.field7865 = new class299[arg1.method620((byte) -128)];
            for (int var4 = 0; ~this.field7865.length < ~var4; ++var4) {
                int var5 = arg1.method620((byte) -128);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field7865[var4] = class415.method2338(arg1, (byte) -74);
                            }
                        } else {
                            this.field7865[var4] = class114.method606(arg0 + -32853, arg1);
                        }
                    } else {
                        this.field7865[var4] = class324.method1827(false, arg1);
                    }
                } else {
                    this.field7865[var4] = class595.method3343(class2.method13(arg0, 250), arg1);
                }
            }
        }
        if (arg0 != 255) {
            this.field7865 = null;
        }
        ++field7859;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZI)[[I", line = 88)
    public final int[][] method104(boolean arg0, int arg1) {
        ++field7866;
        if (!arg0) {
            return null;
        } else {
            int[][] var3 = super.field6889.method2091(-127, arg1);
            if (super.field6889.field4765) {
                int var4 = class436.field6154;
                int var5 = class407.field5435;
                int[][] var6 = new int[var5][var4];
                int[][][] var7 = super.field6889.method2090(1);
                this.method3109(true, var6);
                for (int var8 = 0; var8 < class407.field5435; ++var8) {
                    int[] var9 = var6[var8];
                    int[][] var10 = var7[var8];
                    int[] var11 = var10[0];
                    int[] var12 = var10[1];
                    int[] var13 = var10[2];
                    for (int var14 = 0; ~var14 > ~class436.field6154; ++var14) {
                        int var15 = var9[var14];
                        var13[var14] = class105.method572(var15 << 4, 4080);
                        var12[var14] = class105.method572(var15, 65280) >> 4;
                        var11[var14] = class105.method572(4080, var15 >> 12);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)V", line = 151)
    public static void method3108(int arg0) {
        field7864 = null;
        if (arg0 != -3) {
            field7864 = null;
        }
        field7857 = null;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(II)[I", line = 162)
    public final int[] method35(int arg0, int arg1) {
        ++field7858;
        int[] var3 = super.field6886.method789(arg0, (byte) 125);
        if (super.field6886.field1592) {
            this.method3109(true, super.field6886.method791(arg1 + 11324));
        }
        if (arg1 != -11323) {
            field7857 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V", line = 184)
    public class549() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z[[I)V", line = 187)
    private final void method3109(boolean arg0, int[][] arg1) {
        if (!arg0) {
            this.method104(true, 29);
        }
        ++field7860;
        int var3 = class436.field6154;
        int var4 = class407.field5435;
        class366.method2146(127, arg1);
        class338.method1942(-35, 0, class204.field2414, 0, class156.field1746);
        if (this.field7865 != null) {
            for (int var5 = 0; ~var5 > ~this.field7865.length; ++var5) {
                class299 var6 = this.field7865[var5];
                int var7 = var6.field3726;
                int var8 = var6.field3725;
                if (var7 >= 0) {
                    if (var8 >= 0) {
                        var6.method1477((byte) -119, var3, var4);
                    } else {
                        var6.method1480(4096, var3, var4);
                    }
                } else if (var8 >= 0) {
                    var6.method1481(0, var4, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V", line = 238)
    public static final void method3110(byte arg0) {
        int var1 = -12 / ((-26 - arg0) / 42);
        ++field7863;
        if (class654.field9183 != 0) {
            try {
                if (++class51.field514 > 2000) {
                    if (class99.field1061 != null) {
                        class99.field1061.method1509(0);
                        class99.field1061 = null;
                    }
                    if (class227.field2811 >= 2) {
                        class239.field2965 = -5;
                        class654.field9183 = 0;
                        return;
                    }
                    class527.field7428.method1087(0);
                    class654.field9183 = 1;
                    class51.field514 = 0;
                    ++class227.field2811;
                }
                if (~class654.field9183 == -2) {
                    class533.field7493 = class527.field7428.method1089(class353.field4757, 47);
                    class654.field9183 = 2;
                }
                if (class654.field9183 == 2) {
                    if (class533.field7493.field884 == 2) {
                        throw new IOException();
                    }
                    if (class533.field7493.field884 != 1) {
                        return;
                    }
                    class99.field1061 = class203.method1213(7500, 0, (Socket) class533.field7493.field886);
                    class533.field7493 = null;
                    class160.method869((byte) -100);
                    class654.field9183 = 4;
                }
                if (~class654.field9183 == -5) {
                    if (!class99.field1061.method1514(-28728, 1)) {
                        return;
                    }
                    class99.field1061.method1508(1, (byte) 115, class626.field8849.field1269, 0);
                    int var2 = class626.field8849.field1269[0] & 255;
                    if (~var2 != -22) {
                        class239.field2965 = var2;
                        class654.field9183 = 0;
                        class99.field1061.method1509(0);
                        class99.field1061 = null;
                        return;
                    }
                    class654.field9183 = 5;
                }
                if (class654.field9183 == 5) {
                    if (!class99.field1061.method1514(-28728, 1)) {
                        return;
                    }
                    class99.field1061.method1508(1, (byte) 70, class626.field8849.field1269, 0);
                    class678.field9538 = new String[255 & class626.field8849.field1269[0]];
                    class654.field9183 = 6;
                }
                if (~class654.field9183 == -7) {
                    if (class99.field1061.method1514(-28728, class678.field9538.length * 8)) {
                        class626.field8849.field1218 = 0;
                        class99.field1061.method1508(class678.field9538.length * 8, (byte) -74, class626.field8849.field1269, 0);
                        for (int var3 = 0; var3 < class678.field9538.length; ++var3) {
                            class678.field9538[var3] = class645.method3614(40, class626.field8849.method671(0));
                        }
                        class654.field9183 = 0;
                        class239.field2965 = 21;
                        class99.field1061.method1509(0);
                        class99.field1061 = null;
                    }
                }
            } catch (IOException var4) {
                if (class99.field1061 != null) {
                    class99.field1061.method1509(0);
                    class99.field1061 = null;
                }
                if (~class227.field2811 > -3) {
                    class527.field7428.method1087(0);
                    class654.field9183 = 1;
                    class51.field514 = 0;
                    ++class227.field2811;
                } else {
                    class239.field2965 = -4;
                    class654.field9183 = 0;
                }
            }
        }
    }
}
