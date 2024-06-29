import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class266 {

    @OriginalMember(owner = "client!s", name = "e", descriptor = "[F")
    public float[] field4566 = new float[4];

    @OriginalMember(owner = "client!s", name = "G", descriptor = "Z")
    public boolean field4594 = false;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public int field4568;

    @OriginalMember(owner = "client!s", name = "D", descriptor = "Z")
    public boolean field4591;

    @OriginalMember(owner = "client!s", name = "H", descriptor = "Z")
    public boolean field4595;

    @OriginalMember(owner = "client!s", name = "v", descriptor = "I")
    public int field4583;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "I")
    public int field4578;

    @OriginalMember(owner = "client!s", name = "B", descriptor = "I")
    public int field4589;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public int field4565;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "[S")
    public short[] field4571;

    @OriginalMember(owner = "client!s", name = "A", descriptor = "I")
    public int field4588;

    @OriginalMember(owner = "client!s", name = "s", descriptor = "I")
    private int field4580;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    private int field4576;

    @OriginalMember(owner = "client!s", name = "y", descriptor = "Lok;")
    private static class146 field4586 = class235.method1724(-12908, "Loading fonts )2 ");

    @OriginalMember(owner = "client!s", name = "x", descriptor = "Lok;")
    public static class146 field4585 = field4586;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "F")
    public float field4564;

    @OriginalMember(owner = "client!s", name = "I", descriptor = "F")
    public float field4596;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    private int field4573;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    private int field4579;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!s", name = "w", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!s", name = "z", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!s", name = "C", descriptor = "I")
    private int field4590;

    @OriginalMember(owner = "client!s", name = "E", descriptor = "I")
    private int field4592;

    @OriginalMember(owner = "client!s", name = "F", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "Loh;")
    public static class15 field4572;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "Loh;")
    public static class15 field4582;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Lhl;")
    public class61 field4570;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)I", line = 14)
    public static final int method1928(int arg0) {
        if (arg0 == 2048) {
            field4581++;
            return class280.field4791;
        } else {
            return 108;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V", line = 30)
    private final void method1929(byte arg0) {
        int var2 = (this.field4565 << 7) + 64;
        this.field4564 = 1.0F / (float) (var2 * var2);
        field4563++;
        if (arg0 != 39) {
            this.field4590 = 103;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILoh;IZ)Lan;", line = 45)
    public static final class315 method1930(int arg0, class15 arg1, int arg2, boolean arg3) {
        field4587++;
        if (!arg3) {
            field4585 = (class146) null;
        }
        return class230.method1688(arg2, arg0, 1221, arg1) ? class137.method1009(-81) : null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIB)V", line = 66)
    public static final void method1931(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field4584++;
        int var6 = arg2;
        int var7 = 0;
        int var8 = -48 % ((arg5 - 5) / 55);
        int var9 = arg3 * arg3;
        int var10 = arg2 * arg2;
        int var11 = var9 << 1;
        int var12 = var10 << 1;
        int var13 = arg2 << 1;
        int var14 = (1 - var13) * var9 + var12;
        int var15 = var9 << 2;
        int var16 = var10 << 2;
        int var17 = ((var7 << 1) + 3) * var12;
        int var18 = (arg2 - 1) * var15;
        int var19 = (var7 + 1) * var16;
        if (arg0 >= class123.field2008 && arg0 <= class318.field5394) {
            int var20 = class21.method153(-119, arg3 + arg4, class151.field2564, class126.field2058);
            int var21 = class21.method153(-117, arg4 - arg3, class151.field2564, class126.field2058);
            class40.method281(arg1, var21, class81.field1297[arg0], var20, 7);
        }
        int var22 = var10 - ((var13 - 1) * var11);
        int var23 = ((arg2 << 1) - 3) * var11;
        while (var6 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var22 += var19;
                    var7++;
                    var19 += var16;
                    var14 += var17;
                    var17 += var16;
                }
            }
            var6--;
            int var24 = arg0 + var6;
            if (var22 < 0) {
                var14 += var17;
                var7++;
                var22 += var19;
                var17 += var16;
                var19 += var16;
            }
            int var25 = arg0 - var6;
            var14 += -var18;
            var22 += -var23;
            var23 -= var15;
            if (var24 >= class123.field2008 && var25 <= class318.field5394) {
                int var26 = class21.method153(-124, arg4 + var7, class151.field2564, class126.field2058);
                int var27 = class21.method153(-128, arg4 - var7, class151.field2564, class126.field2058);
                if (class123.field2008 <= var25) {
                    class40.method281(arg1, var27, class81.field1297[var25], var26, 7);
                }
                if (class318.field5394 >= var24) {
                    class40.method281(arg1, var27, class81.field1297[var24], var26, 7);
                }
            }
            var18 -= var15;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V", line = 172)
    private final void method1932(int arg0) {
        if (arg0 != -10310) {
            method1931(114, -1, 12, 31, 124, (byte) -112);
        }
        int var2 = this.field4576;
        if (var2 == 2) {
            this.field4592 = 1;
            this.field4573 = 2048;
            this.field4579 = 0;
            this.field4590 = 2048;
        } else if (var2 == 3) {
            this.field4592 = 1;
            this.field4579 = 0;
            this.field4590 = 2048;
            this.field4573 = 4096;
        } else if (var2 == 4) {
            this.field4592 = 4;
            this.field4573 = 2048;
            this.field4579 = 0;
            this.field4590 = 2048;
        } else if (var2 == 5) {
            this.field4590 = 2048;
            this.field4592 = 4;
            this.field4579 = 0;
            this.field4573 = 8192;
        } else if (var2 == 12) {
            this.field4573 = 2048;
            this.field4592 = 2;
            this.field4590 = 2048;
            this.field4579 = 0;
        } else if (var2 == 13) {
            this.field4592 = 2;
            this.field4579 = 0;
            this.field4573 = 8192;
            this.field4590 = 2048;
        } else if (var2 == 10) {
            this.field4590 = 512;
            this.field4579 = 1536;
            this.field4573 = 2048;
            this.field4592 = 3;
        } else if (var2 == 11) {
            this.field4592 = 3;
            this.field4590 = 512;
            this.field4573 = 4096;
            this.field4579 = 1536;
        } else if (var2 == 6) {
            this.field4592 = 3;
            this.field4579 = 1280;
            this.field4573 = 2048;
            this.field4590 = 768;
        } else if (var2 == 7) {
            this.field4579 = 1280;
            this.field4590 = 768;
            this.field4573 = 4096;
            this.field4592 = 3;
        } else if (var2 == 8) {
            this.field4590 = 1024;
            this.field4592 = 3;
            this.field4579 = 1024;
            this.field4573 = 2048;
        } else if (var2 == 9) {
            this.field4579 = 1024;
            this.field4590 = 1024;
            this.field4573 = 4096;
            this.field4592 = 3;
        } else if (var2 == 14) {
            this.field4573 = 2048;
            this.field4590 = 768;
            this.field4579 = 1280;
            this.field4592 = 1;
        } else if (var2 == 15) {
            this.field4590 = 512;
            this.field4573 = 4096;
            this.field4592 = 1;
            this.field4579 = 1536;
        } else if (var2 == 16) {
            this.field4579 = 1792;
            this.field4590 = 256;
            this.field4592 = 1;
            this.field4573 = 8192;
        } else {
            this.field4590 = 2048;
            this.field4573 = 2048;
            this.field4579 = 0;
            this.field4592 = 0;
        }
        field4569++;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BI)I", line = 371)
    public static final int method1933(byte arg0, int arg1) {
        field4574++;
        if (arg0 != 59) {
            method1936((byte) -44, (class146) null);
        }
        if (arg1 >= 97 && arg1 <= 122 || arg1 >= 224 && arg1 <= 254 && arg1 != 247) {
            return arg1 - 32;
        } else if (arg1 == 255) {
            return 159;
        } else if (arg1 == 156) {
            return 140;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZII)V", line = 393)
    public final void method1934(boolean arg0, int arg1, int arg2) {
        field4593++;
        int var4 = this.field4580 + (this.field4573 * arg2 / 50) & 0x7FF;
        int var5 = this.field4592;
        int var6;
        if (var5 == 1) {
            var6 = (class109.field1750[var4] >> 6) + 1024;
        } else if (var5 == 3) {
            var6 = class262.field4348[var4] >> 1;
        } else if (var5 == 4) {
            var6 = var4 >> 10 << 11;
        } else if (var5 == 2) {
            var6 = var4;
        } else if (var5 == 5) {
            var6 = (var4 < 1024 ? var4 : 2048 - var4) << 1;
        } else {
            var6 = 2048;
        }
        if (arg1 < 69) {
            this.method1932(39);
        }
        if (arg0) {
            var6 = 2048;
        }
        this.field4596 = (float) (this.field4579 + (this.field4590 * var6 >> 11)) / 2048.0F;
        float var7 = this.field4596 / 255.0F;
        this.field4566[0] = var7 * (float) (class82.method582(this.field4588, 16770130) >> 16);
        this.field4566[2] = var7 * (float) class82.method582(255, this.field4588);
        this.field4566[1] = var7 * (float) (class82.method582(65300, this.field4588) >> 8);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lti;", line = 477)
    public static final class216 method1935(Throwable arg0, String arg1) {
        field4567++;
        class216 var2;
        if ((arg0 instanceof class216)) {
            var2 = (class216) arg0;
            var2.field3568 = var2.field3568 + ' ' + arg1;
        } else {
            var2 = new class216(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BLok;)V", line = 502)
    public static final void method1936(byte arg0, class146 arg1) {
        field4575++;
        if (arg0 != -75) {
            method1931(44, -124, 93, 6, 34, (byte) 100);
        }
        if (class191.field3164 >= 2) {
            if (arg1.method1106(class122.field2002, 101)) {
                class26.method175(arg0 + 203);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class316.method2209(false, class112.method758(-28, new class146[] { class201.field3359, class82.method585(arg0 ^ -14803, var4), class180.field3021 }), 0, (class146) null);
            }
            if (arg1.method1106(class152.field2584, 56)) {
                class26.method175(128);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class316.method2209(false, class112.method758(-64, new class146[] { class41.field733, class82.method585(14744, var7), class180.field3021 }), 0, (class146) null);
                class101.method692((byte) -108);
                class26.method175(128);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class316.method2209(false, class112.method758(arg0 + 196, new class146[] { class101.field1637, class82.method585(14744, var9), class180.field3021 }), 0, (class146) null);
            }
            if (arg1.method1106(class165.field2794, 104)) {
                class316.method2209(false, class112.method758(-55, new class146[] { class179.field3008, class82.method585(14744, class241.method1747(false)) }), 0, (class146) null);
            }
            if (class271.field4640 && arg1.method1106(class242.field4023, 56)) {
                System.out.println("oncard_geometry:" + class68.field1128);
                System.out.println("oncard_2d:" + class68.field1129);
                System.out.println("oncard_texture:" + class68.field1130);
            }
            if (arg1.method1106(class73.field1188, 108)) {
                class264.method1904(4803);
            }
            if (arg1.method1106(class316.field5357, 96)) {
                class70.field1139.method1217(0);
            }
            if (arg1.method1106(class264.field4548, 79)) {
                class70.field1139.method1226(123);
            }
            if (arg1.method1106(class94.field1507, 69)) {
                class232.field3876.method914(-24);
                class98.field1582.method289((byte) 111);
                class70.field1139.method1221((byte) -128);
            }
            if (arg1.method1106(class45.field767, 125)) {
                class312.field5308 = true;
            }
            if (arg1.method1106(class112.field1792, 121)) {
                class1.method4(-41, 25);
            }
            if (arg1.method1106(class74.field1208, 115)) {
                class214.field3526 = true;
            }
            if (arg1.method1106(class318.field5430, 63)) {
                class214.field3526 = false;
            }
            if (arg1.method1106(class116.field1866, 123)) {
                class265.method1927(false, -1, 0, -1, arg0 + 75);
            }
            if (arg1.method1106(class185.field3079, 113)) {
                class265.method1927(false, -1, 1, -1, 0);
            }
            if (arg1.method1106(class216.field3570, arg0 + 127)) {
                class265.method1927(false, -1, 2, -1, 0);
            }
            if (arg1.method1106(class107.field1730, 59)) {
                class265.method1927(false, 1024, 3, 768, arg0 + 75);
            }
            if (arg1.method1106(class306.field5232, 62)) {
                for (int var10 = 0; var10 < 4; var10++) {
                    for (int var11 = 1; var11 < 103; var11++) {
                        for (int var12 = 1; var12 < 103; var12++) {
                            class251.field4202[var10].field2392[var11][var12] = 0;
                        }
                    }
                }
            }
            if (arg1.method1080((byte) -47, class86.field1367)) {
                class284.method2051(arg1.method1111(-8, 15).method1092(true));
                class166.method1291(-13383, class232.field3876);
                class157.field2654 = false;
            }
            if (arg1.method1080((byte) -51, class292.field4976) && class22.field408 != 0) {
                class260.method1885(arg1.method1111(-19, 6).method1092(true), 7);
            }
            if (arg1.method1106(class146.field2487, 107) && class22.field408 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method1080((byte) -38, class158.field2660)) {
                class150.field2556 = arg1.method1111(120, 12).method1096((byte) -89).method1092(true);
                class316.method2209(false, class112.method758(-51, new class146[] { class115.field1857, class82.method585(14744, class150.field2556) }), 0, (class146) null);
            }
            if (arg1.method1106(class183.field3056, 111)) {
                class128.field2096 = true;
            }
            if (arg1.method1106(class11.field225, 57)) {
                if (class115.field1851) {
                    class185.field3092.method1102((byte) -126);
                    class115.field1851 = false;
                } else {
                    class40.field724.method1102((byte) -126);
                    class115.field1851 = true;
                }
            }
        }
        class79.field1259++;
        class47.field820.method1656(118, 16);
        class47.field820.method332(arg1.method1094((byte) -8) - 1, 124);
        class47.field820.method339(arg0 - 25, arg1.method1111(arg0 ^ 0x8, 2));
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V", line = 740)
    protected class266() {
        if (class262.field4348 == null) {
            class195.method1504((byte) -93);
        }
        this.method1932(-10310);
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(Lwe;)V", line = 750)
    public class266(class47 arg0) {
        if (class262.field4348 == null) {
            class195.method1504((byte) -93);
        }
        this.field4568 = arg0.method368(-128);
        this.field4591 = (this.field4568 & 0x8) != 0;
        this.field4595 = (this.field4568 & 0x10) != 0;
        this.field4568 &= 0x7;
        this.field4583 = arg0.method379(-2);
        this.field4578 = arg0.method379(-2);
        this.field4589 = arg0.method379(-2);
        this.field4565 = arg0.method368(92);
        this.method1929((byte) 39);
        this.field4571 = new short[this.field4565 * 2 + 1];
        for (int var2 = 0; var2 < this.field4571.length; var2++) {
            this.field4571[var2] = (short) arg0.method379(-2);
        }
        this.field4588 = class109.field1746[arg0.method379(-2)];
        int var3 = arg0.method368(-120);
        this.field4580 = (var3 & 0xE0) << 3;
        this.field4576 = var3 & 0x1F;
        this.method1932(-10310);
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V", line = 728)
    public static void method1937(int arg0) {
        field4582 = null;
        if (arg0 == 1) {
            field4585 = null;
            field4586 = null;
            field4572 = null;
        }
    }
}
