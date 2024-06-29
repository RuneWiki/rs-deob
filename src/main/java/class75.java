import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class75 {

    @OriginalMember(owner = "client!fca", name = "e", descriptor = "I")
    public int field798;

    @OriginalMember(owner = "client!fca", name = "p", descriptor = "I")
    public int field809;

    @OriginalMember(owner = "client!fca", name = "j", descriptor = "B")
    public byte field803;

    @OriginalMember(owner = "client!fca", name = "q", descriptor = "I")
    private int field810;

    @OriginalMember(owner = "client!fca", name = "g", descriptor = "I")
    public int field800;

    @OriginalMember(owner = "client!fca", name = "f", descriptor = "Lfca;")
    public class75 field799;

    @OriginalMember(owner = "client!fca", name = "k", descriptor = "Lkca;")
    public static class73 field804 = new class73(19, 8);

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "I")
    public int field794;

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!fca", name = "h", descriptor = "I")
    public int field801;

    @OriginalMember(owner = "client!fca", name = "i", descriptor = "I")
    public int field802;

    @OriginalMember(owner = "client!fca", name = "l", descriptor = "I")
    public int field805;

    @OriginalMember(owner = "client!fca", name = "n", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!fca", name = "o", descriptor = "I")
    public int field808;

    @OriginalMember(owner = "client!fca", name = "r", descriptor = "I")
    public int field811;

    @OriginalMember(owner = "client!fca", name = "s", descriptor = "I")
    public int field812;

    @OriginalMember(owner = "client!fca", name = "t", descriptor = "I")
    public int field813;

    @OriginalMember(owner = "client!fca", name = "u", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!fca", name = "m", descriptor = "Lxa;")
    public static class433 field806;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIIB)Lfca;", line = 5)
    public final class75 method491(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 == 54) {
            field796++;
            return new class75(this.field810, arg0, arg1, arg2, this.field803);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)Lgk;", line = 16)
    public final class409 method492(int arg0) {
        field797++;
        if (arg0 >= -69) {
            this.field808 = -124;
        }
        return class595.method3473(this.field810, 0);
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(ILoa;Le;)V", line = 33)
    public static final void method493(int arg0, class605 arg1, class462 arg2) {
        field807++;
        if (class182.field2250 == null) {
            return;
        }
        if (class123.field1537 < 10) {
            if (!class182.field2247.method1289(class182.field2250.field4039, 104)) {
                class123.field1537 = class144.field1770.method1310(class182.field2250.field4039, 1) / 10;
                return;
            }
            class165.method958((byte) 34);
            class123.field1537 = 10;
        }
        if (class123.field1537 == 10) {
            class182.field2273 = class182.field2250.field4029 >> 6 << 6;
            class182.field2267 = class182.field2250.field4028 >> 6 << 6;
            class182.field2279 = (class182.field2250.field4018 >> 6 << 6) + 64 - class182.field2267;
            class182.field2261 = (class182.field2250.field4023 >> 6 << 6) + 64 - class182.field2273;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class182.field2250.method1883((class439.field6548.field1768 >> 9) + class250.field3549, class439.field6548.field1757, 0, (class439.field6548.field1764 >> 9) + class287.field3980, var3)) {
                var5 = var3[2] - class182.field2267;
                var4 = var3[1] - class182.field2273;
            }
            if (!class163.field2004 && var4 >= 0 && class182.field2261 > var4 && var5 >= 0 && var5 < class182.field2279) {
                int var6 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                field814 = var6;
                class421.field6299 = var7;
            } else if (class27.field289 == -1 || class355.field5054 == -1) {
                class182.field2250.method1879((byte) 46, class182.field2250.field4022 & 0x3FFF, var3, (class182.field2250.field4022 & 0xFFFD9F6) >> 14);
                class421.field6299 = var3[1] - class182.field2273;
                field814 = var3[2] - class182.field2267;
            } else {
                class182.field2250.method1879((byte) 112, class355.field5054, var3, class27.field289);
                if (var3 != null) {
                    field814 = var3[2] - class182.field2267;
                    class421.field6299 = var3[1] - class182.field2273;
                }
                class355.field5054 = -1;
                class27.field289 = -1;
                class163.field2004 = false;
            }
            if (class182.field2250.field4034 == 37) {
                class182.field2259 = 3.0F;
                class182.field2252 = 3.0F;
            } else if (class182.field2250.field4034 == 50) {
                class182.field2259 = 4.0F;
                class182.field2252 = 4.0F;
            } else if (class182.field2250.field4034 == 75) {
                class182.field2259 = 6.0F;
                class182.field2252 = 6.0F;
            } else if (class182.field2250.field4034 == 100) {
                class182.field2259 = 8.0F;
                class182.field2252 = 8.0F;
            } else if (class182.field2250.field4034 == 200) {
                class182.field2259 = 16.0F;
                class182.field2252 = 16.0F;
            } else {
                class182.field2259 = 8.0F;
                class182.field2252 = 8.0F;
            }
            class182.field2254 = (int) class182.field2259 >> 1;
            class182.field2256 = class256.method1711(class182.field2254, 1);
            class171.method986((byte) 31);
            class182.method1047();
            class501.field7292 = new class114();
            class182.field2260 += (int) (Math.random() * 5.0D) - 2;
            if (class182.field2260 < -8) {
                class182.field2260 = -8;
            }
            if (class182.field2260 > 8) {
                class182.field2260 = 8;
            }
            class182.field2255 += (int) (Math.random() * 5.0D) - 2;
            if (class182.field2255 < -16) {
                class182.field2255 = -16;
            }
            if (class182.field2255 > 16) {
                class182.field2255 = 16;
            }
            class182.method1064(arg2, class182.field2260 >> 2 << 10, class182.field2255 >> 1);
            class182.field2242.method1013(1024, -127, 256);
            class182.field2248.method110(256, 256, -18);
            class182.field2243.method1502(4096, (byte) 119);
            class300.field4421.method1259(256, 1808421224);
            class123.field1537 = 20;
        } else if (class123.field1537 == 20) {
            class548.method3186(true, (byte) 77);
            class182.method1056(arg1, class182.field2260, class182.field2255);
            class123.field1537 = 60;
            class548.method3186(true, (byte) 77);
            class387.method2505(88);
        } else if (class123.field1537 == 60) {
            if (class182.field2247.method1294(-97, class182.field2250.field4039 + "_staticelements")) {
                if (!class182.field2247.method1289(class182.field2250.field4039 + "_staticelements", 104)) {
                    return;
                }
                class182.field2251 = class408.method2581(false, class182.field2250.field4039 + "_staticelements", class182.field2247, class525.field7616);
            } else {
                class182.field2251 = new class136(0);
            }
            class182.method1058();
            class123.field1537 = 70;
            class548.method3186(true, (byte) 77);
            class387.method2505(78);
        } else if (class123.field1537 == 70) {
            class270.field3786 = new class476(arg1, 11, true, class30.field348);
            class123.field1537 = 73;
            class548.method3186(true, (byte) 77);
            class387.method2505(86);
        } else if (class123.field1537 == 73) {
            class270.field3784 = new class476(arg1, 12, true, class30.field348);
            class123.field1537 = 76;
            class548.method3186(true, (byte) 77);
            class387.method2505(93);
        } else if (class123.field1537 == 76) {
            class34.field391 = new class476(arg1, 14, true, class30.field348);
            class123.field1537 = 79;
            class548.method3186(true, (byte) 77);
            class387.method2505(114);
        } else if (class123.field1537 == 79) {
            class240.field3407 = new class476(arg1, 17, true, class30.field348);
            class123.field1537 = 82;
            class548.method3186(true, (byte) 77);
            class387.method2505(99);
        } else if (arg0 < -34) {
            if (class123.field1537 == 82) {
                class574.field8285 = new class476(arg1, 19, true, class30.field348);
                class123.field1537 = 85;
                class548.method3186(true, (byte) 77);
                class387.method2505(71);
            } else if (class123.field1537 == 85) {
                class581.field8365 = new class476(arg1, 22, true, class30.field348);
                class123.field1537 = 88;
                class548.method3186(true, (byte) 77);
                class387.method2505(71);
            } else if (class123.field1537 == 88) {
                class1.field5 = new class476(arg1, 26, true, class30.field348);
                class123.field1537 = 91;
                class548.method3186(true, (byte) 77);
                class387.method2505(110);
            } else {
                class112.field1376 = new class476(arg1, 30, true, class30.field348);
                class123.field1537 = 100;
                class548.method3186(true, (byte) 77);
                class387.method2505(97);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)V", line = 270)
    public static void method494(byte arg0) {
        field806 = null;
        field804 = null;
        if (arg0 != -117) {
            field806 = null;
        }
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(IIIIB)V", line = 287)
    public class75(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.field798 = arg1;
        this.field809 = arg3;
        this.field803 = arg4;
        this.field810 = arg0;
        this.field800 = arg2;
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lfca;I)V", line = 298)
    public class75(class75 arg0, int arg1) {
        this.field799 = arg0;
        this.field809 = this.field799.field809 + arg1;
        this.field803 = this.field799.field803;
        this.field798 = this.field799.field798 + arg1;
        this.field800 = this.field799.field800 + arg1;
        this.field810 = this.field799.field810;
    }
}
