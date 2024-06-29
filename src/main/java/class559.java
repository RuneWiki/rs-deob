import java.util.BitSet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oha")
public class class559 {

    @OriginalMember(owner = "client!oha", name = "q", descriptor = "Ljava/lang/String;")
    private String field7873 = "null";

    @OriginalMember(owner = "client!oha", name = "g", descriptor = "S")
    public static short field7863 = 32767;

    @OriginalMember(owner = "client!oha", name = "v", descriptor = "Z")
    public static boolean field7878 = false;

    @OriginalMember(owner = "client!oha", name = "o", descriptor = "I")
    public static int field7871 = 0;

    @OriginalMember(owner = "client!oha", name = "h", descriptor = "C")
    public char field7864;

    @OriginalMember(owner = "client!oha", name = "l", descriptor = "C")
    public char field7868;

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "I")
    public static int field7857;

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "I")
    public static int field7858;

    @OriginalMember(owner = "client!oha", name = "c", descriptor = "I")
    public static int field7859;

    @OriginalMember(owner = "client!oha", name = "d", descriptor = "I")
    public static int field7860;

    @OriginalMember(owner = "client!oha", name = "e", descriptor = "I")
    public static int field7861;

    @OriginalMember(owner = "client!oha", name = "f", descriptor = "I")
    public static int field7862;

    @OriginalMember(owner = "client!oha", name = "j", descriptor = "I")
    private int field7866;

    @OriginalMember(owner = "client!oha", name = "k", descriptor = "I")
    public static int field7867;

    @OriginalMember(owner = "client!oha", name = "n", descriptor = "I")
    public static int field7870;

    @OriginalMember(owner = "client!oha", name = "p", descriptor = "I")
    public static int field7872;

    @OriginalMember(owner = "client!oha", name = "r", descriptor = "I")
    public static int field7874;

    @OriginalMember(owner = "client!oha", name = "s", descriptor = "I")
    private int field7875;

    @OriginalMember(owner = "client!oha", name = "t", descriptor = "I")
    public static int field7876;

    @OriginalMember(owner = "client!oha", name = "w", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!oha", name = "i", descriptor = "Lda;")
    public static class442 field7865;

    @OriginalMember(owner = "client!oha", name = "m", descriptor = "Llk;")
    private class638 field7869;

    @OriginalMember(owner = "client!oha", name = "u", descriptor = "Llk;")
    public class638 field7877;

    static {
        new BitSet(65536);
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(Lae;Lae;Lae;BLae;)V", line = 10)
    public static final void method3288(class283 arg0, class283 arg1, class283 arg2, byte arg3, class283 arg4) {
        if (arg3 != -37) {
            method3291(true, null, null);
        }
        class749.field10343 = arg1;
        field7858++;
        class102.field1185 = arg2;
        class131.field1691 = arg0;
        class609.field8594 = new class115[class131.field1691.method1866((byte) 120)][];
        class689.field9604 = new boolean[class131.field1691.method1866((byte) 105)];
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(III)V", line = 28)
    public static final void method3289(int arg0, int arg1, int arg2) {
        field7861++;
        class17 var3 = class245.method1634(1, (long) arg0, 17);
        var3.method66((byte) 34);
        var3.field107 = arg2;
        if (arg1 != 15245) {
            method3288(null, null, null, (byte) -121, null);
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 45)
    public final String method3290(int arg0, byte arg1) {
        field7870++;
        if (this.field7877 == null) {
            return this.field7873;
        }
        class282 var3 = (class282) this.field7877.method3669(false, (long) arg0);
        if (var3 == null) {
            return this.field7873;
        } else if (arg1 == -121) {
            return var3.field4042;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(ZLd;Lha;)V", line = 69)
    public static final void method3291(boolean arg0, class101 arg1, class473 arg2) {
        field7872++;
        if (class46.field483 == null) {
            return;
        }
        if (class130.field1678 < 10) {
            if (!class46.field477.method1837((byte) -99, class46.field483.field4438)) {
                class130.field1678 = class539.field7458.method1868(0, class46.field483.field4438) / 10;
                return;
            }
            class266.method1740(!arg0);
            class130.field1678 = 10;
        }
        if (class130.field1678 == 10) {
            class46.field511 = class46.field483.field4423 >> 6 << 6;
            class46.field503 = class46.field483.field4425 >> 6 << 6;
            class46.field516 = (class46.field483.field4436 >> 6 << 6) + 64 - class46.field511;
            class46.field509 = (class46.field483.field4432 >> 6 << 6) + 64 - class46.field503;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class46.field483.method1987(class724.field10031.field3467, (class724.field10031.field3470 >> 9) + class444.field6151, var3, -795484448, (class724.field10031.field3460 >> 9) + class236.field3535)) {
                var5 = var3[2] - class46.field511;
                var4 = var3[1] - class46.field503;
            }
            if (!class269.field3898 && var4 >= 0 && var4 < class46.field509 && var5 >= 0 && var5 < class46.field516) {
                int var6 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var4 + ((int) (Math.random() * 10.0D) - 5);
                class744.field10276 = var6;
                class612.field8623 = var7;
            } else if (class124.field1632 == -1 || class302.field4403 == -1) {
                class46.field483.method1983(0, var3, class46.field483.field4420 & 0x3FFF, class46.field483.field4420 >> 14 & 0x3FFF);
                class612.field8623 = var3[1] - class46.field503;
                class744.field10276 = var3[2] - class46.field511;
            } else {
                class46.field483.method1983(0, var3, class302.field4403, class124.field1632);
                class302.field4403 = -1;
                class124.field1632 = -1;
                class269.field3898 = false;
                if (var3 != null) {
                    class612.field8623 = var3[1] - class46.field503;
                    class744.field10276 = var3[2] - class46.field511;
                }
            }
            if (class46.field483.field4418 == 37) {
                class46.field489 = 3.0F;
                class46.field494 = 3.0F;
            } else if (class46.field483.field4418 == 50) {
                class46.field489 = 4.0F;
                class46.field494 = 4.0F;
            } else if (class46.field483.field4418 == 75) {
                class46.field489 = 6.0F;
                class46.field494 = 6.0F;
            } else if (class46.field483.field4418 == 100) {
                class46.field489 = 8.0F;
                class46.field494 = 8.0F;
            } else if (class46.field483.field4418 == 200) {
                class46.field489 = 16.0F;
                class46.field494 = 16.0F;
            } else {
                class46.field489 = 8.0F;
                class46.field494 = 8.0F;
            }
            class46.field486 = (int) class46.field489 >> 1;
            class46.field492 = class474.method2828(76, class46.field486);
            class418.method2528(0);
            class46.method381();
            class94.field1093 = new class165();
            class46.field495 += (int) (Math.random() * 5.0D) - 2;
            if (class46.field495 < -8) {
                class46.field495 = -8;
            }
            class46.field493 += (int) (Math.random() * 5.0D) - 2;
            if (class46.field495 > 8) {
                class46.field495 = 8;
            }
            if (class46.field493 < -16) {
                class46.field493 = -16;
            }
            if (class46.field493 > 16) {
                class46.field493 = 16;
            }
            class46.method372(arg1, class46.field495 >> 2 << 10, class46.field493 >> 1);
            class46.field485.method518(256, 1024, (byte) -79);
            class46.field482.method2917((byte) 86, 256, 256);
            class46.field484.method3067(4096, (byte) 106);
            class650.field9089.method1965((byte) 127, 256);
            class130.field1678 = 20;
        } else if (class130.field1678 == 20) {
            class454.method2737(true, true);
            class46.method363(arg2, class46.field495, class46.field493);
            class130.field1678 = 60;
            class454.method2737(true, true);
            class54.method460(-1);
        } else if (class130.field1678 == 60) {
            if (class46.field477.method1845((byte) 94, class46.field483.field4438 + "_staticelements")) {
                if (!class46.field477.method1837((byte) -99, class46.field483.field4438 + "_staticelements")) {
                    return;
                }
                class46.field491 = class148.method986(class46.field477, (byte) -124, class14.field78, class46.field483.field4438 + "_staticelements");
            } else {
                class46.field491 = new class762(0);
            }
            class46.method379();
            class130.field1678 = 70;
            class454.method2737(true, true);
            class54.method460(-1);
        } else if (class130.field1678 == 70) {
            class120.field1599 = new class506(arg2, 11, true, class749.field10341);
            class130.field1678 = 73;
            class454.method2737(true, true);
            class54.method460(-1);
        } else if (class130.field1678 == 73) {
            class602.field8448 = new class506(arg2, 12, true, class749.field10341);
            class130.field1678 = 76;
            class454.method2737(true, arg0);
            class54.method460(-1);
        } else if (class130.field1678 == 76) {
            class531.field7312 = new class506(arg2, 14, true, class749.field10341);
            class130.field1678 = 79;
            class454.method2737(true, true);
            class54.method460(-1);
        } else if (class130.field1678 == 79) {
            class732.field10114 = new class506(arg2, 17, true, class749.field10341);
            class130.field1678 = 82;
            class454.method2737(true, true);
            class54.method460(-1);
        } else if (class130.field1678 == 82) {
            class748.field10329 = new class506(arg2, 19, true, class749.field10341);
            class130.field1678 = 85;
            class454.method2737(true, true);
            class54.method460(-1);
        } else if (class130.field1678 == 85) {
            class116.field1580 = new class506(arg2, 22, true, class749.field10341);
            class130.field1678 = 88;
            class454.method2737(true, true);
            class54.method460(-1);
        } else if (class130.field1678 == 88) {
            class428.field5976 = new class506(arg2, 26, true, class749.field10341);
            class130.field1678 = 91;
            class454.method2737(true, true);
            class54.method460(-1);
        } else {
            class498.field6832 = new class506(arg2, 30, true, class749.field10341);
            class130.field1678 = 100;
            class454.method2737(arg0, true);
            class54.method460(-1);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(II)Z", line = 295)
    public final boolean method3292(int arg0, int arg1) {
        field7879++;
        if (this.field7877 == null) {
            return false;
        }
        if (this.field7869 == null) {
            this.method3296(false);
        }
        class324 var3 = (class324) this.field7869.method3669(false, (long) arg0);
        if (arg1 != 31298) {
            method3291(false, null, null);
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(IILgga;)V", line = 319)
    private final void method3293(int arg0, int arg1, class511 arg2) {
        field7867++;
        if (arg1 == 1) {
            this.field7868 = class395.method2438(arg2.method3030(arg0 - 25989), -128);
        } else if (arg1 == 2) {
            this.field7864 = class395.method2438(arg2.method3030(-25984), -128);
        } else if (arg1 == 3) {
            this.field7873 = arg2.method2993((byte) -56);
        } else if (arg1 == 4) {
            this.field7866 = arg2.method3008(64);
        } else if (arg1 == 5 || arg1 == 6) {
            this.field7875 = arg2.method3002(-1);
            this.field7877 = new class638(class179.method1142(this.field7875, 62));
            for (int var4 = 0; var4 < this.field7875; var4++) {
                int var5 = arg2.method3008(64);
                class69 var6;
                if (arg1 == 5) {
                    var6 = new class282(arg2.method2993((byte) -72));
                } else {
                    var6 = new class324(arg2.method3008(arg0 + 59));
                }
                this.field7877.method3666((byte) 65, (long) var5, var6);
            }
        }
        if (arg0 != 5) {
            method3289(-122, -1, -22);
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(I)V", line = 372)
    public static void method3294(int arg0) {
        field7865 = null;
        if (arg0 != -1689898042) {
            field7871 = -49;
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 386)
    public final boolean method3295(String arg0, int arg1) {
        field7859++;
        if (this.field7877 == null) {
            return false;
        }
        if (this.field7869 == null) {
            this.method3298(17780);
        }
        if (arg1 != 10768) {
            method3291(false, null, null);
        }
        for (class653 var3 = (class653) this.field7869.method3669(false, class616.method3555(arg0, (byte) 40)); var3 != null; var3 = (class653) this.field7869.method3673(-122)) {
            if (var3.field9115.equals(arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(Z)V", line = 420)
    private final void method3296(boolean arg0) {
        if (arg0) {
            this.method3298(-80);
        }
        this.field7869 = new class638(this.field7877.method3670((byte) 126));
        field7876++;
        for (class324 var2 = (class324) this.field7877.method3668(91); var2 != null; var2 = (class324) this.field7877.method3667((byte) 102)) {
            class324 var3 = new class324((int) var2.field762);
            this.field7869.method3666((byte) 65, (long) var2.field4575, var3);
        }
    }

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "(II)I", line = 442)
    public final int method3297(int arg0, int arg1) {
        field7857++;
        if (this.field7877 == null) {
            return this.field7866;
        }
        if (arg1 != -19759) {
            this.field7875 = -98;
        }
        class324 var3 = (class324) this.field7877.method3669(false, (long) arg0);
        return var3 == null ? this.field7866 : var3.field4575;
    }

    @OriginalMember(owner = "client!oha", name = "b", descriptor = "(I)V", line = 467)
    private final void method3298(int arg0) {
        this.field7869 = new class638(this.field7877.method3670((byte) 127));
        if (arg0 != 17780) {
            return;
        }
        field7860++;
        for (class282 var2 = (class282) this.field7877.method3668(-84); var2 != null; var2 = (class282) this.field7877.method3667((byte) 49)) {
            class653 var3 = new class653(var2.field4042, (int) var2.field762);
            this.field7869.method3666((byte) 65, class616.method3555(var2.field4042, (byte) 40), var3);
        }
    }

    @OriginalMember(owner = "client!oha", name = "a", descriptor = "(Lgga;B)V", line = 500)
    public final void method3299(class511 arg0, byte arg1) {
        if (arg1 <= 4) {
            return;
        }
        field7862++;
        while (true) {
            int var3 = arg0.method3013(-125);
            if (var3 == 0) {
                return;
            }
            this.method3293(5, var3, arg0);
        }
    }
}
