import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class482 {

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "[Lkt;")
    public static class61[] field7065 = new class61[14];

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static int field7069 = 1;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "Lmo;")
    public static class271 field7064 = new class271(2, 4);

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field7066;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public static int field7067;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field7068;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLl;Lza;)V", line = 5)
    public static final void method2907(byte arg0, class127 arg1, class299 arg2) {
        field7067++;
        if (class362.field5327 == null) {
            return;
        }
        if (class307.field4698 < 10) {
            if (!class362.field5325.method750(0, class362.field5327.field7870)) {
                class307.field4698 = class531.field7764.method729(class362.field5327.field7870, -10493) / 10;
                return;
            }
            class254.method1799((byte) -98);
            class307.field4698 = 10;
        }
        if (class307.field4698 == 10) {
            class362.field5350 = class362.field5327.field7876 >> 6 << 6;
            class362.field5345 = class362.field5327.field7871 >> 6 << 6;
            class362.field5357 = (class362.field5327.field7869 >> 6 << 6) + 64 - class362.field5350;
            class362.field5349 = (class362.field5327.field7867 >> 6 << 6) + 64 - class362.field5345;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class362.field5327.method3157(class116.field1781.field1274, class23.field273 + (class116.field1781.field1279 >> 7), var3, class422.field6201 + (class116.field1781.field1275 >> 7), (byte) -67)) {
                var5 = var3[2] - class362.field5345;
                var4 = var3[1] - class362.field5350;
            }
            if (!class533.field7786 && var4 >= 0 && class362.field5357 > var4 && var5 >= 0 && class362.field5349 > var5) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                class274.field4298 = var7;
                class445.field6617 = var6;
            } else if (class251.field4087 == -1 || class425.field6339 == -1) {
                class362.field5327.method3161(56, var3, (class362.field5327.field7866 & 0xFFFDAEE) >> 14, class362.field5327.field7866 & 0x3FFF);
                class274.field4298 = var3[2] - class362.field5345;
                class445.field6617 = var3[1] - class362.field5350;
            } else {
                class362.field5327.method3161(-109, var3, class251.field4087, class425.field6339);
                if (var3 != null) {
                    class445.field6617 = var3[1] - class362.field5350;
                    class274.field4298 = var3[2] - class362.field5345;
                }
                class425.field6339 = -1;
                class251.field4087 = -1;
                class533.field7786 = false;
            }
            if (class362.field5327.field7877 == 37) {
                class362.field5340 = 3.0F;
                class362.field5337 = 3.0F;
            } else if (class362.field5327.field7877 == 50) {
                class362.field5340 = 4.0F;
                class362.field5337 = 4.0F;
            } else if (class362.field5327.field7877 == 75) {
                class362.field5340 = 6.0F;
                class362.field5337 = 6.0F;
            } else if (class362.field5327.field7877 == 100) {
                class362.field5340 = 8.0F;
                class362.field5337 = 8.0F;
            } else if (class362.field5327.field7877 == 200) {
                class362.field5340 = 16.0F;
                class362.field5337 = 16.0F;
            } else {
                class362.field5340 = 8.0F;
                class362.field5337 = 8.0F;
            }
            class362.field5338 = (int) class362.field5340 >> 1;
            class362.field5342 = class525.method3123(11825, class362.field5338);
            class321.method2121(24659);
            class362.method2309();
            class328.field4965 = new class44();
            class362.field5341 += (int) (Math.random() * 5.0D) - 2;
            if (class362.field5341 < -8) {
                class362.field5341 = -8;
            }
            if (class362.field5341 > 8) {
                class362.field5341 = 8;
            }
            class362.field5334 += (int) (Math.random() * 5.0D) - 2;
            if (class362.field5334 < -16) {
                class362.field5334 = -16;
            }
            if (class362.field5334 > 16) {
                class362.field5334 = 16;
            }
            class362.method2311(arg1, class362.field5341 >> 2 << 10, class362.field5334 >> 1);
            class362.field5329.method2180(256, 1024, (byte) 125);
            class362.field5331.method773(256, 256, 64);
            class362.field5326.method2280((byte) 91, 4096);
            class529.field7739.method2104((byte) -18, 256);
            class307.field4698 = 20;
        } else if (class307.field4698 == 20) {
            class80.method714(-1570, true);
            class362.method2303(arg2, class362.field5341, class362.field5334);
            class307.field4698 = 60;
            class80.method714(-1570, true);
            class43.method282(0);
        } else if (class307.field4698 == 60) {
            if (class362.field5325.method732(-9794, class362.field5327.field7870 + "_staticelements")) {
                if (!class362.field5325.method750(0, class362.field5327.field7870 + "_staticelements")) {
                    return;
                }
                class362.field5336 = class154.method1120(class324.field4918, class362.field5327.field7870 + "_staticelements", 2, class362.field5325);
            } else {
                class362.field5336 = new class6(0);
            }
            class362.method2308();
            class307.field4698 = 70;
            class80.method714(-1570, true);
            class43.method282(0);
        } else if (class307.field4698 == 70) {
            class139.field2094 = new class177(arg2, 11, true, class342.field5114);
            class307.field4698 = 73;
            class80.method714(-1570, true);
            class43.method282(0);
        } else if (class307.field4698 == 73) {
            class503.field7312 = new class177(arg2, 12, true, class342.field5114);
            class307.field4698 = 76;
            class80.method714(-1570, true);
            class43.method282(0);
        } else if (class307.field4698 == 76) {
            class507.field7377 = new class177(arg2, 14, true, class342.field5114);
            class307.field4698 = 79;
            class80.method714(-1570, true);
            class43.method282(0);
        } else {
            int var8 = 114 / ((arg0 + 54) / 59);
            if (class307.field4698 == 79) {
                class271.field4282 = new class177(arg2, 17, true, class342.field5114);
                class307.field4698 = 82;
                class80.method714(-1570, true);
                class43.method282(0);
            } else if (class307.field4698 == 82) {
                class27.field300 = new class177(arg2, 19, true, class342.field5114);
                class307.field4698 = 85;
                class80.method714(-1570, true);
                class43.method282(0);
            } else if (class307.field4698 == 85) {
                class305.field4670 = new class177(arg2, 22, true, class342.field5114);
                class307.field4698 = 88;
                class80.method714(-1570, true);
                class43.method282(0);
            } else if (class307.field4698 == 88) {
                class360.field5312 = new class177(arg2, 26, true, class342.field5114);
                class307.field4698 = 91;
                class80.method714(-1570, true);
                class43.method282(0);
            } else {
                class80.field1322 = new class177(arg2, 30, true, class342.field5114);
                class307.field4698 = 100;
                class80.method714(-1570, true);
                class43.method282(0);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 230)
    public static void method2908(int arg0) {
        field7065 = null;
        if (arg0 == 0) {
            field7064 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILii;III)V", line = 245)
    public static final void method2909(int arg0, class395 arg1, int arg2, int arg3, int arg4) {
        field7068++;
        for (class491 var5 = (class491) class410.field6066.method295((byte) 121); var5 != null; var5 = (class491) class410.field6066.method296(true)) {
            if (var5.field7173 == arg0 && (arg4 << 7) == var5.field7169 && arg3 << 7 == var5.field7165 && var5.field7177.field5831 == arg1.field5831) {
                if (var5.field7182 != null) {
                    class503.field7313.method1802(var5.field7182);
                    var5.field7182 = null;
                }
                if (var5.field7170 != null) {
                    class503.field7313.method1802(var5.field7170);
                    var5.field7170 = null;
                }
                var5.method947((byte) 100);
                return;
            }
        }
        if (arg2 != 364175271) {
            method2910(-39, -59, -111);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)V", line = 286)
    public static final void method2910(int arg0, int arg1, int arg2) {
        if (arg0 == 4096) {
            field7066++;
            class188 var3 = class10.method48((byte) 37, 14, arg2);
            var3.method1308(false);
            var3.field2873 = arg1;
        }
    }
}
