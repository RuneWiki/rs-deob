import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class429 {

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "B")
    private byte field6229;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public int field6228;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public int field6230;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public int field6238;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public int field6235;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public int field6241;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "[Lmd;")
    public static class233[] field6232 = new class233[14];

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "Ljava/lang/String;")
    public static String field6239 = "Use";

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field6231;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field6240;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLsj;II)V")
    public static final void method2676(byte arg0, class248 arg1, int arg2, int arg3) {
        field6236++;
        if (class171.field2342 != null || class165.field2244 || arg1 == null || class158.method1053(arg1, 0) == null) {
            return;
        }
        class171.field2342 = arg1;
        class268.field3967 = class158.method1053(arg1, 0);
        if (arg0 >= -126) {
            method2676((byte) -53, (class248) null, -109, 107);
        }
        class38.field570 = 0;
        class316.field4634 = arg3;
        class14.field215 = false;
        class355.field5259 = arg2;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)I")
    public final int method2677(byte arg0) {
        int var2 = -125 % ((arg0 - 45) / 60);
        field6231++;
        return (this.field6229 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)I")
    public final int method2678(int arg0) {
        field6233++;
        return arg0 == 4154 ? this.field6229 & 0x7 : 53;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public static void method2679(int arg0) {
        field6232 = null;
        if (arg0 == 3) {
            field6239 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)I")
    public static final int method2680(int arg0, int arg1) {
        field6240++;
        if (arg1 != 85) {
            method2680(-117, -120);
        }
        return (arg0 & 0x3FAD8) >> 11;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ltj;Lwh;B)V")
    public static final void method2681(class298 arg0, class288 arg1, byte arg2) {
        field6237++;
        if (class200.field2758 == null) {
            return;
        }
        if (class31.field512 < 10) {
            if (!class200.field2759.method1233((byte) -127, class200.field2758.field5535)) {
                class31.field512 = class299.field4523.method1236(class200.field2758.field5535, (byte) 84) / 10;
                return;
            }
            class139.method975(-126);
            class31.field512 = 10;
        }
        if (class31.field512 == 10) {
            class200.field2789 = class200.field2758.field5541 >> 6 << 6;
            class200.field2782 = class200.field2758.field5538 >> 6 << 6;
            class200.field2770 = (class200.field2758.field5551 >> 6 << 6) + 64 - class200.field2789;
            class200.field2779 = (class200.field2758.field5533 >> 6 << 6) + 64 - class200.field2782;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class200.field2758.method2471((class383.field5609.field5921 >> 7) + class236.field3292, (class383.field5609.field5930 >> 7) + class90.field1223, var3, class268.field3973, 0)) {
                var5 = var3[2] - class200.field2789;
                var4 = var3[1] - class200.field2782;
            }
            if (!class431.field6272 && var4 >= 0 && var4 < class200.field2779 && var5 >= 0 && var5 < class200.field2770) {
                int var6 = var5 + ((int) (Math.random() * 10.0D) - 5);
                int var7 = var4 + ((int) (Math.random() * 10.0D) - 5);
                class297.field4487 = var7;
                class85.field1184 = var6;
            } else if (class129.field1677 == -1 || class334.field4907 == -1) {
                class200.field2758.method2474(class200.field2758.field5537 & 0x3FFF, var3, 0, class200.field2758.field5537 >> 14 & 0x3FFF);
                class85.field1184 = var3[2] - class200.field2789;
                class297.field4487 = var3[1] - class200.field2782;
            } else {
                class200.field2758.method2474(class334.field4907, var3, 0, class129.field1677);
                class334.field4907 = -1;
                class129.field1677 = -1;
                class431.field6272 = false;
                if (var3 != null) {
                    class297.field4487 = var3[1] - class200.field2782;
                    class85.field1184 = var3[2] - class200.field2789;
                }
            }
            if (class200.field2758.field5540 == 37) {
                class200.field2765 = 3.0F;
                class200.field2769 = 3.0F;
            } else if (class200.field2758.field5540 == 50) {
                class200.field2765 = 4.0F;
                class200.field2769 = 4.0F;
            } else if (class200.field2758.field5540 == 75) {
                class200.field2765 = 6.0F;
                class200.field2769 = 6.0F;
            } else if (class200.field2758.field5540 == 100) {
                class200.field2765 = 8.0F;
                class200.field2769 = 8.0F;
            } else if (class200.field2758.field5540 == 200) {
                class200.field2765 = 16.0F;
                class200.field2769 = 16.0F;
            } else {
                class200.field2765 = 8.0F;
                class200.field2769 = 8.0F;
            }
            class200.field2762 = (int) class200.field2765 >> 1;
            class200.field2760 = class383.method2491(0, class200.field2762);
            class338.method2198((byte) 114);
            class200.method1331();
            class394.field5730 = new class242();
            class36.field555 = new class348();
            class200.field2764 += (int) (Math.random() * 5.0D) - 2;
            if (class200.field2764 < -8) {
                class200.field2764 = -8;
            }
            class200.field2768 += (int) (Math.random() * 5.0D) - 2;
            if (class200.field2764 > 8) {
                class200.field2764 = 8;
            }
            if (class200.field2768 < -16) {
                class200.field2768 = -16;
            }
            if (class200.field2768 > 16) {
                class200.field2768 = 16;
            }
            class200.method1329(arg1, class200.field2764 >> 2 << 10, class200.field2768 >> 1);
            class350.method2314(1024, 256, 2);
            class124.method884(256, 256, 11479);
            class398.method2555(85, 4096);
            class143.method992(126, 256);
            class31.field512 = 20;
        } else if (class31.field512 == 20) {
            class295.method1997((byte) 115, true);
            class200.method1334(arg0, class200.field2764, class200.field2768);
            class31.field512 = 60;
            class295.method1997((byte) 112, true);
            class7.method39(-15898);
        } else if (class31.field512 == 60) {
            if (class200.field2759.method1224(105, class200.field2758.field5535 + "_staticelements")) {
                if (!class200.field2759.method1233((byte) 127, class200.field2758.field5535 + "_staticelements")) {
                    return;
                }
                class200.field2766 = class113.method834(class200.field2758.field5535 + "_staticelements", (byte) 66, class200.field2759, class190.field2652);
            } else {
                class200.field2766 = new class269(0);
            }
            class200.method1341();
            class31.field512 = 70;
            class295.method1997((byte) 119, true);
            class7.method39(-15898);
        } else if (class31.field512 == 70) {
            class86.field1201 = new class414(arg0, 11, true, class422.field6138);
            class31.field512 = 73;
            class295.method1997((byte) 61, true);
            class7.method39(-15898);
        } else if (class31.field512 == 73) {
            class377.field5518 = new class414(arg0, 12, true, class422.field6138);
            class31.field512 = 76;
            class295.method1997((byte) 95, true);
            class7.method39(-15898);
        } else if (class31.field512 == 76) {
            class268.field3965 = new class414(arg0, 14, true, class422.field6138);
            class31.field512 = 79;
            class295.method1997((byte) 121, true);
            class7.method39(-15898);
        } else if (class31.field512 == 79) {
            class117.field1524 = new class414(arg0, 17, true, class422.field6138);
            class31.field512 = 82;
            class295.method1997((byte) 66, true);
            class7.method39(-15898);
        } else {
            if (arg2 > -101) {
                method2679(-51);
            }
            if (class31.field512 == 82) {
                class351.field5212 = new class414(arg0, 19, true, class422.field6138);
                class31.field512 = 85;
                class295.method1997((byte) 99, true);
                class7.method39(-15898);
            } else if (class31.field512 == 85) {
                class163.field2222 = new class414(arg0, 22, true, class422.field6138);
                class31.field512 = 88;
                class295.method1997((byte) 112, true);
                class7.method39(-15898);
            } else if (class31.field512 == 88) {
                class125.field1618 = new class414(arg0, 26, true, class422.field6138);
                class31.field512 = 91;
                class295.method1997((byte) 118, true);
                class7.method39(-15898);
            } else {
                class407.field5928 = new class414(arg0, 30, true, class422.field6138);
                class31.field512 = 100;
                class295.method1997((byte) 106, true);
                class7.method39(-15898);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZZ)Z")
    public static boolean method2682(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    public class429() {
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lfb;)V")
    public class429(class341 arg0) {
        this.field6229 = arg0.method2211(255);
        this.field6228 = arg0.method2239(-1076227960);
        this.field6230 = arg0.method2232(-97);
        this.field6238 = arg0.method2232(-40);
        this.field6235 = arg0.method2232(-43);
        this.field6241 = arg0.method2232(105);
    }
}
