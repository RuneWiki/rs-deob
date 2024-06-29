import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class362 extends class584 {

    @OriginalMember(owner = "client!jba", name = "A", descriptor = "Lnfa;")
    private class621 field4735;

    @OriginalMember(owner = "client!jba", name = "v", descriptor = "Lie;")
    private class6 field4730;

    @OriginalMember(owner = "client!jba", name = "s", descriptor = "Luaa;")
    private class103 field4727;

    @OriginalMember(owner = "client!jba", name = "r", descriptor = "[Lpi;")
    public static class455[] field4726 = new class455[2048];

    @OriginalMember(owner = "client!jba", name = "q", descriptor = "J")
    public static long field4725 = 0L;

    @OriginalMember(owner = "client!jba", name = "x", descriptor = "I")
    public static int field4732 = 0;

    @OriginalMember(owner = "client!jba", name = "l", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!jba", name = "m", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!jba", name = "n", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!jba", name = "o", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!jba", name = "p", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!jba", name = "t", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!jba", name = "u", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!jba", name = "w", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!jba", name = "y", descriptor = "I")
    public static int field4733;

    @OriginalMember(owner = "client!jba", name = "z", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!jba", name = "B", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "(ZI)V")
    public final void method180(boolean arg0, int arg1) {
        OpenGL.glBindProgramARB(34336, this.field4727.field1115);
        if (arg1 != -1) {
            this.method175(46, -94, -90);
        }
        ++field4729;
        OpenGL.glEnable(34336);
        super.field8309.method2757(class19.field171, (byte) -73, 0);
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILfp;)V")
    public static final void method1986(int arg0, class292 arg1) {
        ++field4723;
        int var2 = -class469.field6549 + arg1.field3783;
        if (arg0 > -49) {
            field4725 = 62L;
        }
        int var3 = arg1.field3759 * 512 + 256 * arg1.method1656(true);
        int var4 = arg1.field3753 * 512 + arg1.method1656(true) * 256;
        arg1.field4647 += (-arg1.field4647 + var4) / var2;
        arg1.field4641 += (-arg1.field4641 + var3) / var2;
        arg1.field3837 = 0;
        if (~arg1.field3829 == -1) {
            arg1.method1657(8192, -10652);
        }
        if (arg1.field3829 == 1) {
            arg1.method1657(12288, -10652);
        }
        if (~arg1.field3829 == -3) {
            arg1.method1657(0, -10652);
        }
        if (~arg1.field3829 == -4) {
            arg1.method1657(4096, -10652);
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZZ)V")
    public final void method177(boolean arg0, boolean arg1) {
        if (arg1) {
            super.field8309.method2759(class250.field3212, (byte) -5, class676.field9584);
            ++field4724;
        }
    }

    @OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lnfa;Ljo;Lie;)V")
    public class362(class621 arg0, class303 arg1, class6 arg2) {
        super(arg0);
        this.field4735 = arg0;
        this.field4730 = arg2;
        if (this.field4730.method28(false) && this.field4735.field8822) {
            this.field4727 = class379.method2077(this.field4735, arg1.method1734("transparent_water", 11434, "gl"), (byte) -84, 34336);
        } else {
            this.field4727 = null;
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILld;B)V")
    public final void method185(int arg0, class155 arg1, byte arg2) {
        if (arg2 <= 17) {
            this.field4730 = null;
        }
        ++field4721;
    }

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "(B)Z")
    public final boolean method178(byte arg0) {
        ++field4728;
        if (arg0 > -6) {
            this.field4730 = null;
        }
        return this.field4727 != null;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILoa;)V")
    public static final void method1987(int arg0, class635 arg1) {
        ++field4733;
        if (~class602.field8537.method3165((byte) 83) != -1) {
            if (class150.field1711 != arg0) {
                if (class266.field3350 == null) {
                    Canvas var2 = new Canvas();
                    var2.setSize(36, 32);
                    class266.field3350 = class635.method3555(-128, class457.field6380, 0, var2, class209.field2545, 0);
                    class567.field8034 = class266.field3350.method349(class415.method2244(2048, class57.field593, class93.field1050, 0), class563.method3180(class633.field8972, class93.field1050, 0), true);
                }
                for (class642 var3 = (class642) class602.field8537.method3174((byte) 49); var3 != null; var3 = (class642) class602.field8537.method3168(false)) {
                    class472.field6588.method1909(var3.field9082, (byte) 100, var3.field9083, class266.field3350, false, var3.field9081, var3.field9080, arg1, var3.field9084, class567.field8034, var3.field9085 ? class377.field4914.field6309 : null, false);
                    var3.method1519((byte) 121);
                }
            } else {
                for (class642 var4 = (class642) class602.field8537.method3174((byte) 49); var4 != null; var4 = (class642) class602.field8537.method3168(false)) {
                    class472.field6588.method1909(var4.field9082, (byte) 119, var4.field9083, arg1, false, var4.field9081, var4.field9080, arg1, var4.field9084, class419.field5573, !var4.field9085 ? null : class377.field4914.field6309, false);
                    var4.method1519((byte) 121);
                }
                class14.method66(arg0 + 12287);
            }
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(BLpi;)V")
    public static final void method1988(byte arg0, class455 arg1) {
        ++field4736;
        class282 var2 = (class282) class279.field3524.method3234((byte) -93, (long) arg1.field3784);
        if (arg0 != -110) {
            field4725 = 15L;
        }
        if (var2 != null) {
            if (var2.field3577 != null) {
                class424.field5641.method2852(var2.field3577);
                var2.field3577 = null;
            }
            var2.method1519((byte) 121);
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(III)V")
    public final void method175(int arg0, int arg1, int arg2) {
        ++field4731;
        if (this.field4730.field50) {
            float var4 = (float) (super.field8309.field6884 % 4000) / 4000.0F;
            super.field8309.method2696(-2, this.field4730.field49);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var4, 0.0F, 0.0F, 1.0F);
        } else {
            int var5 = super.field8309.field6884 % 4000 * 16 / 4000;
            super.field8309.method2696(-2, this.field4730.field53[var5]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        }
        if (arg2 < 116) {
            this.field4735 = null;
        }
    }

    @OriginalMember(owner = "client!jba", name = "f", descriptor = "(I)V")
    public final void method174(int arg0) {
        super.field8309.method2757(class67.field708, (byte) -73, 0);
        ++field4734;
        int var2 = -13 / ((86 - arg0) / 40);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "(B)V")
    public static void method1989(byte arg0) {
        field4726 = null;
        if (arg0 >= -58) {
            method1986(-66, (class292) null);
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(BII)I")
    public static final int method1990(byte arg0, int arg1, int arg2) {
        ++field4720;
        if (class220.field2665 == -1) {
            return 1;
        } else {
            if (class150.field1711 != arg1) {
                class466.method2646(8000, arg1);
                if (~class150.field1711 != ~arg1) {
                    return -1;
                }
            }
            try {
                Dimension var3 = class220.field2664.getSize();
                class1.method1(78, class221.field2685.method1296(class226.field2899, (byte) -120), true, class404.field5386);
                if (arg0 != 50) {
                    method1988((byte) 25, (class455) null);
                }
                class90 var4 = class189.method1098(class220.field2665, 0, 1, class389.field5195);
                long var5 = class641.method3604(false);
                class453.field6284.method378();
                class139.field1593.method228(0, class389.field5194, 0);
                class453.field6284.method311(class139.field1593);
                class453.field6284.method306(var3.width / 2, var3.height / 2, 512, 512);
                class453.field6284.method368(1.0F);
                class453.field6284.method320(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
                class350 var7 = class453.field6284.method375(var4, 2048, 64, 64, 768);
                int var8 = 0;
                label45: for (int var9 = 0; ~var9 > -501; ++var9) {
                    class453.field6284.method343(0);
                    class453.field6284.method358();
                    for (int var10 = 15; var10 >= 0; --var10) {
                        for (int var11 = 0; ~var11 >= ~var10; ++var11) {
                            class617.field8679.method228((int) (((float) var11 - (float) var10 / 2.0F) * (float) class463.field6445), 0, (var10 + 1) * class463.field6445);
                            var7.method904(class617.field8679, (class130) null, 0);
                            ++var8;
                            if (~(class641.method3604(false) - var5) <= ~((long) arg2)) {
                                break label45;
                            }
                        }
                    }
                }
                class453.field6284.method347();
                long var12 = (long) (var8 * 1000) / (class641.method3604(false) + -var5);
                class453.field6284.method343(0);
                class453.field6284.method358();
                return (int) var12;
            } catch (Throwable var15) {
                var15.printStackTrace();
                return -1;
            }
        }
    }
}
