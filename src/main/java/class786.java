import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class786 implements class489 {

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "Lsi;")
    private class769 field10768 = new class769(128);

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "[I")
    private int[] field10762 = new int[class4.field60.field9333];

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "[I")
    public int[] field10770 = new int[class4.field60.field9333];

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field10758;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field10759;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field10760;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field10761;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field10763;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field10764;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field10765;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field10766;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field10767;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field10769;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I")
    public final int method2864(int arg0, int arg1) {
        field10769++;
        if (arg0 != 5) {
            this.method2864(-19, 37);
        }
        return this.field10770[arg1];
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V")
    public final void method4307(int arg0, int arg1, int arg2) {
        field10764++;
        class168 var4 = class600.field8552.method3556(512, arg0);
        int var5 = var4.field2546;
        int var6 = var4.field2545;
        int var7 = var4.field2543;
        int var8 = class109.field1550[var7 - var6];
        if (arg2 < 0 || var8 < arg2) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        if (arg1 != 24391) {
            this.field10770 = null;
        }
        this.method4314(var5, (byte) 33, var9 & arg2 << var6 | this.field10762[var5] & ~var9);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)I")
    public static final int method4308(boolean arg0, int arg1) {
        if (arg0) {
            return 84;
        } else {
            field10763++;
            return arg1 >>> 7;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZI)V")
    public final void method4309(int arg0, boolean arg1, int arg2) {
        field10765++;
        if (!arg1) {
            return;
        }
        class168 var4 = class600.field8552.method3556(512, arg2);
        int var5 = var4.field2546;
        int var6 = var4.field2545;
        int var7 = var4.field2543;
        int var8 = class109.field1550[var7 - var6];
        if (arg0 < 0 || arg0 > var8) {
            arg0 = 0;
        }
        int var9 = var8 << var6;
        this.method4312(var5, this.field10770[var5] & ~var9 | arg0 << var6 & var9, 268426362);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lha;Ld;I)V")
    public static final void method4310(class475 arg0, class103 arg1, int arg2) {
        field10759++;
        if (class751.field10419 == null) {
            return;
        }
        if (class466.field6347 < 10) {
            if (!class751.field10420.method2990((byte) 4, class751.field10419.field3589)) {
                class466.field6347 = class576.field8310.method3020(class751.field10419.field3589, arg2 - 3700) / 10;
                return;
            }
            class737.method4068(4);
            class466.field6347 = 10;
        }
        if (class466.field6347 == 10) {
            class751.field10446 = class751.field10419.field3586 >> 6 << 6;
            class751.field10445 = class751.field10419.field3599 >> 6 << 6;
            class751.field10452 = (class751.field10419.field3590 >> 6 << 6) + 64 - class751.field10446;
            class751.field10441 = (class751.field10419.field3595 >> 6 << 6) - (class751.field10445 - 64);
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class751.field10419.method1658((byte) -48, class697.field9798 + (class719.field10041.field10350 >> 9), class719.field10041.field10361, var3, (class719.field10041.field10347 >> 9) + class222.field3266)) {
                var4 = var3[1] - class751.field10445;
                var5 = var3[2] - class751.field10446;
            }
            if (!class674.field9436 && var4 >= 0 && class751.field10441 > var4 && var5 >= 0 && var5 < class751.field10452) {
                int var6 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class488.field6705 = var6;
                class761.field10553 = var7;
            } else if (class454.field6208 == -1 || class563.field7863 == -1) {
                class751.field10419.method1661((class751.field10419.field3597 & 0xFFFDC7A) >> 14, var3, (byte) 44, class751.field10419.field3597 & 0x3FFF);
                class488.field6705 = var3[2] - class751.field10446;
                class761.field10553 = var3[1] - class751.field10445;
            } else {
                class751.field10419.method1661(class454.field6208, var3, (byte) 44, class563.field7863);
                class563.field7863 = -1;
                class454.field6208 = -1;
                if (var3 != null) {
                    class761.field10553 = var3[1] - class751.field10445;
                    class488.field6705 = var3[2] - class751.field10446;
                }
                class674.field9436 = false;
            }
            if (class751.field10419.field3602 == 37) {
                class751.field10425 = 3.0F;
                class751.field10428 = 3.0F;
            } else if (class751.field10419.field3602 == 50) {
                class751.field10425 = 4.0F;
                class751.field10428 = 4.0F;
            } else if (class751.field10419.field3602 == 75) {
                class751.field10425 = 6.0F;
                class751.field10428 = 6.0F;
            } else if (class751.field10419.field3602 == 100) {
                class751.field10425 = 8.0F;
                class751.field10428 = 8.0F;
            } else if (class751.field10419.field3602 == 200) {
                class751.field10425 = 16.0F;
                class751.field10428 = 16.0F;
            } else {
                class751.field10425 = 8.0F;
                class751.field10428 = 8.0F;
            }
            class751.field10424 = (int) class751.field10425 >> 1;
            class751.field10429 = class251.method1668(false, class751.field10424);
            class274.method1744(1);
            class751.method4150();
            class148.field2381 = new class665();
            class751.field10427 += (int) (Math.random() * 5.0D) - 2;
            if (class751.field10427 < -8) {
                class751.field10427 = -8;
            }
            if (class751.field10427 > 8) {
                class751.field10427 = 8;
            }
            class751.field10431 += (int) (Math.random() * 5.0D) - 2;
            if (class751.field10431 < -16) {
                class751.field10431 = -16;
            }
            if (class751.field10431 > 16) {
                class751.field10431 = 16;
            }
            class751.method4149(arg1, class751.field10427 >> 2 << 10, class751.field10431 >> 1);
            class751.field10415.method4107(false, 256, 1024);
            class751.field10421.method649(256, (byte) 56, 256);
            class751.field10416.method363(false, 4096);
            class600.field8552.method3554(true, 256);
            class466.field6347 = 20;
        } else if (class466.field6347 == 20) {
            class178.method1295((byte) 126, true);
            class751.method4131(arg0, class751.field10427, class751.field10431);
            class466.field6347 = 60;
            class178.method1295((byte) 121, true);
            class691.method3885(arg2 - 3827);
        } else if (class466.field6347 == 60) {
            if (class751.field10420.method3015(3870, class751.field10419.field3589 + "_staticelements")) {
                if (!class751.field10420.method2990((byte) 125, class751.field10419.field3589 + "_staticelements")) {
                    return;
                }
                class751.field10430 = class792.method4328(class362.field5127, -21337, class751.field10420, class751.field10419.field3589 + "_staticelements");
            } else {
                class751.field10430 = new class78(0);
            }
            class751.method4134();
            class466.field6347 = 70;
            class178.method1295((byte) 125, true);
            class691.method3885(109);
        } else if (arg2 == 3700) {
            if (class466.field6347 == 70) {
                class242.field3475 = new class49(arg0, 11, true, class213.field3128);
                class466.field6347 = 73;
                class178.method1295((byte) 119, true);
                class691.method3885(-55);
            } else if (class466.field6347 == 73) {
                class397.field5473 = new class49(arg0, 12, true, class213.field3128);
                class466.field6347 = 76;
                class178.method1295((byte) 119, true);
                class691.method3885(111);
            } else if (class466.field6347 == 76) {
                class284.field4169 = new class49(arg0, 14, true, class213.field3128);
                class466.field6347 = 79;
                class178.method1295((byte) 122, true);
                class691.method3885(112);
            } else if (class466.field6347 == 79) {
                class626.field8906 = new class49(arg0, 17, true, class213.field3128);
                class466.field6347 = 82;
                class178.method1295((byte) 120, true);
                class691.method3885(-81);
            } else if (class466.field6347 == 82) {
                class747.field10396 = new class49(arg0, 19, true, class213.field3128);
                class466.field6347 = 85;
                class178.method1295((byte) 118, true);
                class691.method3885(arg2 ^ 0xFFFFF1CC);
            } else if (class466.field6347 == 85) {
                class611.field8673 = new class49(arg0, 22, true, class213.field3128);
                class466.field6347 = 88;
                class178.method1295((byte) 121, true);
                class691.method3885(107);
            } else if (class466.field6347 == 88) {
                class620.field8762 = new class49(arg0, 26, true, class213.field3128);
                class466.field6347 = 91;
                class178.method1295((byte) 124, true);
                class691.method3885(-77);
            } else {
                class61.field943 = new class49(arg0, 30, true, class213.field3128);
                class466.field6347 = 100;
                class178.method1295((byte) 120, true);
                class691.method3885(-14);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    public final void method4311(int arg0) {
        field10767++;
        for (int var2 = 0; var2 < class4.field60.field9333; var2++) {
            class597 var3 = class4.field60.method3713((byte) -110, var2);
            if (var3 != null && var3.field8524 == 0) {
                this.field10762[var2] = 0;
                this.field10770[var2] = 0;
            }
        }
        this.field10768 = new class769(128);
        if (arg0 != -12151) {
            this.method4313(true, (byte) 90);
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(III)V")
    public final void method4312(int arg0, int arg1, int arg2) {
        this.field10770[arg0] = arg1;
        if (arg2 != 268426362) {
            method4308(false, -110);
        }
        field10760++;
        class194 var4 = (class194) this.field10768.method4253((long) arg0, arg2 ^ 0xF0002385);
        if (var4 == null) {
            class194 var5 = new class194(class337.method2062(false) + 500L);
            this.field10768.method4252(false, var5, (long) arg0);
        } else {
            var4.field2906 = class337.method2062(false) + 500L;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BI)I")
    public final int method2863(byte arg0, int arg1) {
        field10758++;
        class168 var3 = class600.field8552.method3556(512, arg1);
        int var4 = var3.field2546;
        if (arg0 == -100) {
            int var5 = var3.field2545;
            int var6 = var3.field2543;
            int var7 = class109.field1550[var6 - var5];
            return var7 & this.field10770[var4] >> var5;
        } else {
            return -69;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZB)I")
    public final int method4313(boolean arg0, byte arg1) {
        field10766++;
        long var3 = class337.method2062(false);
        int var5 = 53 / ((-arg1 - 80) / 34);
        for (class194 var6 = arg0 ? (class194) this.field10768.method4254((byte) 8) : (class194) this.field10768.method4251(-111); var6 != null; var6 = (class194) this.field10768.method4251(-107)) {
            if (var3 > (var6.field2906 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var6.field2906 & 0x4000000000000000L) != 0L) {
                    int var7 = (int) var6.field10592;
                    this.field10770[var7] = this.field10762[var7];
                    var6.method4237(-1);
                    return var7;
                }
                var6.method4237(-1);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IBI)V")
    public final void method4314(int arg0, byte arg1, int arg2) {
        field10761++;
        this.field10762[arg0] = arg2;
        if (arg1 != 33) {
            this.method4307(-68, -98, 120);
        }
        class194 var4 = (class194) this.field10768.method4253((long) arg0, arg1 - 34);
        if (var4 == null) {
            class194 var5 = new class194(4611686018427387905L);
            this.field10768.method4252(false, var5, (long) arg0);
        } else if (var4.field2906 != 4611686018427387905L) {
            var4.field2906 = class337.method2062(false) + 500L | 0x4000000000000000L;
        }
    }
}
