import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class493 {

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
    public static int field6316;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
    public static int field6317;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "I")
    public static int field6319;

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "I")
    public static int field6320;

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "[[[S")
    public static short[][][] field6321;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(B)V", line = 4)
    public static void method2745(byte arg0) {
        field6321 = null;
        if (arg0 != 70) {
            method2746((byte) -112);
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(B)V", line = 14)
    public static final void method2746(byte arg0) {
        field6322++;
        class127.method740(class576.field7320, (long) class693.field8900, 0);
        if (client.field6070 != -1) {
            class766.method4165(-1, client.field6070);
        }
        for (int var1 = 0; var1 < class547.field6839; var1++) {
            if (class454.field5919[var1]) {
                class576.field7318[var1] = true;
            }
            class40.field461[var1] = class454.field5919[var1];
            class454.field5919[var1] = false;
        }
        class655.field8444 = class693.field8900;
        if (client.field6070 != -1) {
            class547.field6839 = 0;
            class747.method4057((byte) 28);
        }
        class576.field7320.method957();
        class120.method711(class576.field7320, (byte) -75);
        if (arg0 != -107) {
            field6321 = null;
        }
        int var2 = class789.method4320(3);
        if (var2 == -1) {
            var2 = class20.field185;
        }
        if (var2 == -1) {
            var2 = class32.field314;
        }
        class681.method3660(var2, -1);
        class621.field7858 = 0;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lha;Ld;B)V", line = 65)
    public static final void method2747(class570 arg0, class284 arg1, byte arg2) {
        field6318++;
        if (class402.field5326 == null) {
            return;
        }
        if (class562.field7147 < 10) {
            if (!class402.field5321.method141(class402.field5326.field4975, 70)) {
                class562.field7147 = class162.field2163.method151(class402.field5326.field4975, 0) / 10;
                return;
            }
            class12.method53(45);
            class562.field7147 = 10;
        }
        if (class562.field7147 == 10) {
            class402.field5357 = class402.field5326.field4967 >> 6 << 6;
            class402.field5347 = class402.field5326.field4978 >> 6 << 6;
            class402.field5342 = (class402.field5326.field4960 >> 6 << 6) + 64 - class402.field5347;
            class402.field5356 = (class402.field5326.field4954 >> 6 << 6) + 64 - class402.field5357;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class402.field5326.method2246(class422.field5564.field2895, (class422.field5564.field2900 >> 9) + class240.field3293, (byte) 29, (class422.field5564.field2896 >> 9) + class714.field9407, var3)) {
                var4 = var3[1] - class402.field5357;
                var5 = var3[2] - class402.field5347;
            }
            if (!class13.field137 && var4 >= 0 && class402.field5356 > var4 && var5 >= 0 && class402.field5342 > var5) {
                int var6 = var5 + ((int) (Math.random() * 10.0D) - 5);
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class669.field8692 = var7;
                class238.field3238 = var6;
            } else if (class602.field7655 == -1 || class752.field10253 == -1) {
                class402.field5326.method2244(5250, (class402.field5326.field4974 & 0xFFFDC27) >> 14, var3, class402.field5326.field4974 & 0x3FFF);
                class238.field3238 = var3[2] - class402.field5347;
                class669.field8692 = var3[1] - class402.field5357;
            } else {
                class402.field5326.method2244(5250, class602.field7655, var3, class752.field10253);
                class13.field137 = false;
                class752.field10253 = -1;
                class602.field7655 = -1;
                if (var3 != null) {
                    class669.field8692 = var3[1] - class402.field5357;
                    class238.field3238 = var3[2] - class402.field5347;
                }
            }
            if (class402.field5326.field4963 == 37) {
                class402.field5335 = 3.0F;
                class402.field5336 = 3.0F;
            } else if (class402.field5326.field4963 == 50) {
                class402.field5335 = 4.0F;
                class402.field5336 = 4.0F;
            } else if (class402.field5326.field4963 == 75) {
                class402.field5335 = 6.0F;
                class402.field5336 = 6.0F;
            } else if (class402.field5326.field4963 == 100) {
                class402.field5335 = 8.0F;
                class402.field5336 = 8.0F;
            } else if (class402.field5326.field4963 == 200) {
                class402.field5335 = 16.0F;
                class402.field5336 = 16.0F;
            } else {
                class402.field5335 = 8.0F;
                class402.field5336 = 8.0F;
            }
            class402.field5328 = (int) class402.field5335 >> 1;
            class402.field5334 = class337.method1944(class402.field5328, 9431);
            class401.method2327(-1);
            class402.method2352();
            class565.field7168 = new class661();
            class402.field5332 += (int) (Math.random() * 5.0D) - 2;
            if (class402.field5332 < -8) {
                class402.field5332 = -8;
            }
            if (class402.field5332 > 8) {
                class402.field5332 = 8;
            }
            class402.field5331 += (int) (Math.random() * 5.0D) - 2;
            if (class402.field5331 < -16) {
                class402.field5331 = -16;
            }
            if (class402.field5331 > 16) {
                class402.field5331 = 16;
            }
            class402.method2341(arg1, class402.field5332 >> 2 << 10, class402.field5331 >> 1);
            class402.field5322.method2322(false, 1024, 256);
            class402.field5324.method2690(256, -1, 256);
            class402.field5320.method4287(4096, -59);
            class229.field3089.method220(true, 256);
            class562.field7147 = 20;
        } else if (arg2 <= -84) {
            if (class562.field7147 == 20) {
                class653.method3538((byte) 26, true);
                class402.method2350(arg0, class402.field5332, class402.field5331);
                class562.field7147 = 60;
                class653.method3538((byte) 26, true);
                class116.method676(8);
            } else if (class562.field7147 == 60) {
                if (class402.field5321.method160(0, class402.field5326.field4975 + "_staticelements")) {
                    if (!class402.field5321.method141(class402.field5326.field4975 + "_staticelements", 100)) {
                        return;
                    }
                    class402.field5330 = class370.method2123(class402.field5321, class216.field2939, class402.field5326.field4975 + "_staticelements", 5657);
                } else {
                    class402.field5330 = new class607(0);
                }
                class402.method2332();
                class562.field7147 = 70;
                class653.method3538((byte) 26, true);
                class116.method676(8);
            } else if (class562.field7147 == 70) {
                class372.field4555 = new class619(arg0, 11, true, class678.field8763);
                class562.field7147 = 73;
                class653.method3538((byte) 26, true);
                class116.method676(8);
            } else if (class562.field7147 == 73) {
                class773.field10539 = new class619(arg0, 12, true, class678.field8763);
                class562.field7147 = 76;
                class653.method3538((byte) 26, true);
                class116.method676(8);
            } else if (class562.field7147 == 76) {
                class190.field2647 = new class619(arg0, 14, true, class678.field8763);
                class562.field7147 = 79;
                class653.method3538((byte) 26, true);
                class116.method676(8);
            } else if (class562.field7147 == 79) {
                class249.field3418 = new class619(arg0, 17, true, class678.field8763);
                class562.field7147 = 82;
                class653.method3538((byte) 26, true);
                class116.method676(8);
            } else if (class562.field7147 == 82) {
                class588.field7467 = new class619(arg0, 19, true, class678.field8763);
                class562.field7147 = 85;
                class653.method3538((byte) 26, true);
                class116.method676(8);
            } else if (class562.field7147 == 85) {
                class266.field3530 = new class619(arg0, 22, true, class678.field8763);
                class562.field7147 = 88;
                class653.method3538((byte) 26, true);
                class116.method676(8);
            } else if (class562.field7147 == 88) {
                class596.field7570 = new class619(arg0, 26, true, class678.field8763);
                class562.field7147 = 91;
                class653.method3538((byte) 26, true);
                class116.method676(8);
            } else {
                class202.field2805 = new class619(arg0, 30, true, class678.field8763);
                class562.field7147 = 100;
                class653.method3538((byte) 26, true);
                class116.method676(8);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIII)V", line = 297)
    public static final void method2748(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6316++;
        for (int var5 = 0; var5 < class547.field6839; var5++) {
            Rectangle var6 = class393.field5181[var5];
            if (var6.x + var6.width > arg4 && (arg1 + arg4) > var6.x && var6.y + var6.height > arg0 && var6.y < arg0 + arg2) {
                class576.field7318[var5] = true;
            }
        }
        class548.method2967(arg4, arg0 + arg2, arg0, (byte) -86, arg1 + arg4);
        if (arg3 <= 23) {
            field6321 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Z)V", line = 325)
    public static final void method2749(boolean arg0) {
        field6320++;
        if (arg0) {
            field6321 = null;
        }
        class621.field7861 = -1;
        class737.field9982 = null;
    }
}
