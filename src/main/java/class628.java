import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class628 {

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    public static int field8908 = 0;

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "Lqv;")
    public static class406 field8907 = new class406(3, 1);

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field8910 = new Rectangle[100];

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "Lrk;")
    public static class30 field8911 = new class30(0, 0);

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public static int field8906;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    public static int field8909;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "[Ld;")
    public static class137[] field8912;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V", line = 3)
    public static void method3519(int arg0) {
        field8912 = null;
        field8910 = null;
        if (arg0 != 0) {
            field8908 = 9;
        }
        field8907 = null;
        field8911 = null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)V", line = 19)
    public static final void method3520(byte arg0) {
        int var1 = 82 % ((arg0 - 42) / 59);
        for (int var2 = 0; var2 < class46.field507; var2++) {
            int var3 = class233.field2975[var2];
            class625 var4 = ((class443) class392.field5223.method3234((byte) -108, (long) var3)).field6107;
            int var5 = class680.field9630.method2541(106);
            if ((var5 & 0x40) != 0) {
                var5 += class680.field9630.method2541(103) << 8;
            }
            if ((var5 & 0x10) != 0) {
                if (var4.field8855.method100((byte) 122)) {
                    class13.method64(var4, -9581);
                }
                var4.method3501(class608.field8585.method3273(-1119, class680.field9630.method2558((byte) -122)), 104);
                var4.method1664((byte) 87, var4.field8855.field234);
                var4.field3792 = var4.field8855.field232 << 3;
                if (var4.field8855.method100((byte) 122)) {
                    class67.method441(0, var4.field3841[0], null, -105, var4.field3839[0], var4.field4638, null, var4);
                }
            }
            if ((var5 & 0x8) != 0) {
                int var6 = class680.field9630.method2548(-29696);
                int var7 = class680.field9630.method2541(92);
                var4.method1665(var7, var6, (byte) 49, class469.field6549);
                var4.field3762 = class469.field6549 + 300;
                var4.field3780 = class680.field9630.method2563(-2263);
            }
            if ((var5 & 0x1000) != 0) {
                int var8 = class680.field9630.method2574(-1758460248);
                var4.field3788 = class680.field9630.method2541(46);
                var4.field3756 = class680.field9630.method2563(-2263);
                var4.field3737 = (var8 & 0x8000) != 0;
                var4.field3799 = var8 & 0x7FFF;
                var4.field3806 = class469.field6549 + var4.field3799 + var4.field3788;
            }
            if ((var5 & 0x200) != 0) {
                int var9 = class680.field9630.method2548(-29696);
                int var10 = class680.field9630.method2541(36);
                var4.method1665(var10, var9, (byte) 49, class469.field6549);
            }
            if ((var5 & 0x2000) != 0) {
                var4.field3759 = class680.field9630.method2517(32767);
                var4.field3753 = class680.field9630.method2547(true);
                var4.field3808 = class680.field9630.method2547(true);
                var4.field3827 = class680.field9630.method2539(76);
                var4.field3783 = class680.field9630.method2558((byte) -118) + class469.field6549;
                var4.field3826 = class680.field9630.method2532(false) + class469.field6549;
                var4.field3829 = class680.field9630.method2553(-209425784);
                var4.field3835 = 1;
                var4.field3840 = 0;
                var4.field3827 += var4.field3841[0];
                var4.field3808 += var4.field3839[0];
                var4.field3753 += var4.field3841[0];
                var4.field3759 += var4.field3839[0];
            }
            if ((var5 & 0x800) != 0) {
                int var11 = class680.field9630.method2529(117);
                int[] var12 = new int[var11];
                int[] var13 = new int[var11];
                int[] var14 = new int[var11];
                for (int var15 = 0; var15 < var11; var15++) {
                    int var16 = class680.field9630.method2574(-1758460248);
                    if (var16 == 65535) {
                        var16 = -1;
                    }
                    var12[var15] = var16;
                    var13[var15] = class680.field9630.method2563(-2263);
                    var14[var15] = class680.field9630.method2574(-1758460248);
                }
                class361.method1980(var4, var14, var13, 0, var12);
            }
            if ((var5 & 0x1) != 0) {
                var4.field3757 = class680.field9630.method2516(103);
                var4.field3816 = 100;
            }
            if ((var5 & 0x4) != 0) {
                int var17 = class680.field9630.method2542((byte) 63);
                if (var17 == 65535) {
                    var17 = -1;
                }
                int var18 = class680.field9630.method2541(55);
                class278.method1588(var4, (byte) 125, var18, var17);
            }
            if ((var5 & 0x2) != 0) {
                int var19 = class680.field9630.method2532(false);
                int var20 = class680.field9630.method2533(262144);
                if (var19 == 65535) {
                    var19 = -1;
                }
                int var21 = class680.field9630.method2553(-209425784);
                var4.method1661(var19, var20, 4, false, var21);
            }
            if ((var5 & 0x20) != 0) {
                var4.field8848 = class680.field9630.method2558((byte) -111);
                var4.field8854 = class680.field9630.method2558((byte) -69);
            }
            if ((var5 & 0x400) != 0) {
                int var22 = class680.field9630.method2542((byte) -111);
                if (var22 == 65535) {
                    var22 = -1;
                }
                int var23 = class680.field9630.method2544((byte) 101);
                int var24 = class680.field9630.method2553(-209425784);
                var4.method1661(var22, var23, 4, true, var24);
            }
            if ((var5 & 0x80) != 0) {
                var4.field3803 = class680.field9630.method2532(false);
                if (var4.field3803 == 65535) {
                    var4.field3803 = -1;
                }
            }
            if ((var5 & 0x100) != 0) {
                var4.field3794 = class680.field9630.method2555((byte) -26);
                var4.field3787 = class680.field9630.method2517(32767);
                var4.field3747 = class680.field9630.method2555((byte) -26);
                var4.field3817 = (byte) class680.field9630.method2553(-209425784);
                var4.field3809 = class469.field6549 + class680.field9630.method2532(false);
                var4.field3742 = class469.field6549 + class680.field9630.method2542((byte) 93);
            }
        }
        field8906++;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "([I[I[IILpi;)V", line = 231)
    public static final void method3521(int[] arg0, int[] arg1, int[] arg2, int arg3, class455 arg4) {
        field8909++;
        if (arg3 != -1) {
            field8908 = -93;
        }
        for (int var5 = 0; var5 < arg0.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg1[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg4.field3776.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field3776[var9] = null;
                    } else {
                        class576 var10 = class618.field8696.method124(24006, var6);
                        int var11 = var10.field8217;
                        class179 var12 = arg4.field3776[var9];
                        if (var12 != null) {
                            if (var12.field2211 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field3776[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field2210 = 0;
                                    var12.field2217 = 0;
                                    var12.field2213 = 0;
                                    var12.field2212 = 1;
                                    var12.field2214 = var8;
                                    class259.method1473(arg4.field4641, (byte) 1, var10, arg4.field4647, arg4.field4638, 0, class377.field4914 == arg4);
                                } else if (var11 == 2) {
                                    var12.field2213 = 0;
                                }
                            } else if (var10.field8222 >= class618.field8696.method124(24006, var12.field2211).field8222) {
                                var12 = arg4.field3776[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class179 var13 = arg4.field3776[var9] = new class179();
                            var13.field2217 = 0;
                            var13.field2213 = 0;
                            var13.field2211 = var6;
                            var13.field2210 = 0;
                            var13.field2212 = 1;
                            var13.field2214 = var8;
                            class259.method1473(arg4.field4641, (byte) 1, var10, arg4.field4647, arg4.field4638, 0, class377.field4914 == arg4);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }
}
