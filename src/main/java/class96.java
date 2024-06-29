import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class96 implements class703 {

    @OriginalMember(owner = "client!pia", name = "i", descriptor = "Leq;")
    private class213 field1672 = new class213(128);

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "[I")
    public int[] field1665 = new int[class537.field7423.field1920];

    @OriginalMember(owner = "client!pia", name = "q", descriptor = "[I")
    private int[] field1680 = new int[class537.field7423.field1920];

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "I")
    public static int field1664;

    @OriginalMember(owner = "client!pia", name = "c", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!pia", name = "d", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!pia", name = "e", descriptor = "I")
    public static int field1668;

    @OriginalMember(owner = "client!pia", name = "g", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!pia", name = "h", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!pia", name = "j", descriptor = "I")
    public static int field1673;

    @OriginalMember(owner = "client!pia", name = "k", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!pia", name = "l", descriptor = "I")
    public static int field1675;

    @OriginalMember(owner = "client!pia", name = "m", descriptor = "I")
    public static int field1676;

    @OriginalMember(owner = "client!pia", name = "n", descriptor = "I")
    public static int field1677;

    @OriginalMember(owner = "client!pia", name = "o", descriptor = "I")
    public static int field1678;

    @OriginalMember(owner = "client!pia", name = "p", descriptor = "I")
    public static int field1679;

    @OriginalMember(owner = "client!pia", name = "r", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!pia", name = "s", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!pia", name = "t", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!pia", name = "f", descriptor = "Lvaa;")
    public static class469 field1669;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(BZ)I")
    public final int method893(byte arg0, boolean arg1) {
        field1673++;
        if (arg0 >= -124) {
            method897(-105, 89, -65, -52, (byte) 76, 37, -61, 73);
        }
        long var3 = class554.method3190(-79);
        for (class423 var5 = arg1 ? (class423) this.field1672.method1469(0) : (class423) this.field1672.method1467(0); var5 != null; var5 = (class423) this.field1672.method1467(0)) {
            if ((var5.field6099 & 0x3FFFFFFFFFFFFFFFL) < var3) {
                if ((var5.field6099 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field5204;
                    this.field1665[var6] = this.field1680[var6];
                    var5.method2314((byte) 31);
                    return var6;
                }
                var5.method2314((byte) 75);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(BII)V")
    public final void method894(byte arg0, int arg1, int arg2) {
        if (arg0 != -78) {
            return;
        }
        field1668++;
        this.field1665[arg2] = arg1;
        class423 var4 = (class423) this.field1672.method1465((long) arg2, -6008);
        if (var4 == null) {
            class423 var5 = new class423(class554.method3190(-122) + 500L);
            this.field1672.method1468((byte) 73, (long) arg2, var5);
        } else {
            var4.field6099 = class554.method3190(-88) + 500L;
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(II)I")
    public final int method895(int arg0, int arg1) {
        field1670++;
        class499 var3 = class732.field9890.method3435(arg0, -1);
        int var4 = var3.field6977;
        if (arg1 == -65536) {
            int var5 = var3.field6974;
            int var6 = var3.field6978;
            int var7 = class417.field6042[var6 - var5];
            return this.field1665[var4] >> var5 & var7;
        } else {
            return -52;
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(III)V")
    public final void method896(int arg0, int arg1, int arg2) {
        field1676++;
        class499 var4 = class732.field9890.method3435(arg0, -1);
        int var5 = var4.field6977;
        int var6 = var4.field6974;
        int var7 = var4.field6978;
        int var8 = class417.field6042[var7 - var6];
        if (arg1 < ~arg2 || arg2 > var8) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method894((byte) -78, arg2 << var6 & var9 | this.field1665[var5] & ~var9, var5);
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method897(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field1674++;
        if (class140.field2314 <= arg2 && arg6 <= class536.field7419 && arg1 >= class58.field1150 && class479.field6682 >= arg7) {
            class615.method3487(arg3, arg7, arg1, arg6, arg0, arg5, -128, arg2);
        } else {
            class146.method1147(arg7, arg6, arg1, arg0, arg5, -80, arg2, arg3);
        }
        if (arg4 > -113) {
            field1669 = null;
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(ZI)V")
    public static final void method898(boolean arg0, int arg1) {
        if (class99.field1732 == null) {
            class255.method1735(92);
        }
        if (arg1 < 116) {
            field1669 = null;
        }
        field1664++;
        if (arg0) {
            class99.field1732.method1719(96);
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(Z)V")
    public static void method899(boolean arg0) {
        if (arg0) {
            field1669 = null;
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(ILha;)V")
    public static final void method900(int arg0, class59 arg1) {
        class538.field7445 = new class547[class669.field9118.length];
        field1666++;
        if (arg0 != 5139) {
            field1667 = 62;
        }
        for (int var2 = 0; var2 < class669.field9118.length; var2++) {
            int var3 = class669.field9118[var2];
            class597 var4 = class507.method2982((byte) -86, var3, class281.field3935);
            class60 var5 = arg1.method216(var4, class267.method1782(class428.field6143, var3), true);
            class538.field7445[var2] = new class547(var5, var4);
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(BLcea;)Ljca;")
    public static final class684 method901(byte arg0, class215 arg1) {
        field1677++;
        int var2 = arg1.method1533((byte) -126);
        if (arg0 < 47) {
            method905(4);
        }
        return new class684(var2);
    }

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "(BII)V")
    public final void method902(byte arg0, int arg1, int arg2) {
        field1675++;
        if (arg0 != 42) {
            field1667 = -16;
        }
        this.field1680[arg2] = arg1;
        class423 var4 = (class423) this.field1672.method1465((long) arg2, arg0 - 6050);
        if (var4 == null) {
            class423 var5 = new class423(4611686018427387905L);
            this.field1672.method1468((byte) 19, (long) arg2, var5);
        } else if (var4.field6099 != 4611686018427387905L) {
            var4.field6099 = class554.method3190(-108) + 500L | 0x4000000000000000L;
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(B)V")
    public final void method903(byte arg0) {
        for (int var2 = 0; var2 < class537.field7423.field1920; var2++) {
            class348 var4 = class537.field7423.method981(-105, var2);
            if (var4 != null && var4.field4867 == 0) {
                this.field1680[var2] = 0;
                this.field1665[var2] = 0;
            }
        }
        field1678++;
        this.field1672 = new class213(128);
        int var3 = -69 % ((25 - arg0) / 39);
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IB)I")
    public final int method904(int arg0, byte arg1) {
        field1683++;
        if (arg1 != -16) {
            field1667 = 51;
        }
        return this.field1665[arg0];
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V")
    public static final void method905(int arg0) {
        field1679++;
        if (class424.field6105 != null) {
            if (class424.field6105.field8462 == 1) {
                class424.field6105 = null;
                return;
            }
            if (class424.field6105.field8462 == 2) {
                class12.method94(class637.field8758, class21.field334, -120, 2);
                class424.field6105 = null;
                return;
            }
        }
        int var1 = -31 / ((-arg0 - 29) / 61);
    }

    @OriginalMember(owner = "client!pia", name = "c", descriptor = "(BII)V")
    public final void method906(byte arg0, int arg1, int arg2) {
        field1671++;
        class499 var4 = class732.field9890.method3435(arg1, -1);
        int var5 = var4.field6977;
        int var6 = var4.field6974;
        if (arg0 >= -56) {
            return;
        }
        int var7 = var4.field6978;
        int var8 = class417.field6042[var7 - var6];
        if (arg2 < 0 || var8 < arg2) {
            arg2 = 0;
        }
        int var9 = var8 << var6;
        this.method902((byte) 42, arg2 << var6 & var9 | ~var9 & this.field1680[var5], var5);
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(IBI)Z")
    public static final boolean method907(int arg0, byte arg1, int arg2) {
        field1681++;
        if (arg1 >= -67) {
            method907(43, (byte) 36, 20);
        }
        return class49.method565(arg0, arg2, 0) | (arg2 & 0x70000) != 0 || class231.method1607(arg2, arg0, 7);
    }

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "(I)V")
    public static final void method908(int arg0) {
        if (arg0 != -65536) {
            method899(false);
        }
        for (int var1 = 0; var1 < class661.field9039; var1++) {
            int var2 = class633.field8706[var1];
            class9 var3 = ((class751) class86.field1546.method1465((long) var2, -6008)).field10510;
            int var4 = class149.field2477.method1535(255);
            if ((var4 & 0x10) != 0) {
                var4 += class149.field2477.method1535(arg0 ^ 0xFFFF00FF) << 8;
            }
            if ((var4 & 0x2) != 0) {
                if (var3.field126.method2109(arg0 ^ 0xFFFF0000)) {
                    class600.method3414(true, var3);
                }
                var3.method61(class510.field7099.method1341(class149.field2477.method1503(-1), -1), -2);
                var3.method2455((byte) 95, var3.field126.field4716);
                var3.field5736 = var3.field126.field4646 << 3;
                if (var3.field126.method2109(0)) {
                    class426.method2607(979190089, var3, var3.field5926, var3.field5743[0], var3.field5746[0], null, null, 0);
                }
            }
            if ((var4 & 0x8) != 0) {
                int[] var5 = new int[4];
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] = class149.field2477.method1478(842397944);
                    if (var5[var6] == 65535) {
                        var5[var6] = -1;
                    }
                }
                int var7 = class149.field2477.method1490((byte) -121);
                class217.method1553(var7, (byte) 115, var5, var3);
            }
            if ((var4 & 0x20) != 0) {
                int var8 = class149.field2477.method1521(false);
                int var9 = class149.field2477.method1491((byte) 82);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var10 = class149.field2477.method1535(255);
                int var11 = var10 & 0x7;
                int var12 = (var10 & 0x79) >> 3;
                if (var12 == 15) {
                    var12 = -1;
                }
                var3.method2458(var11, var8, arg0 ^ 0x3C569B2E, var12, false, var9);
            }
            if ((var4 & 0x4000) != 0) {
                int var13 = class149.field2477.method1477((byte) 21);
                int[] var14 = new int[var13];
                int[] var15 = new int[var13];
                int[] var16 = new int[var13];
                for (int var17 = 0; var17 < var13; var17++) {
                    int var18 = class149.field2477.method1478(842397944);
                    if (var18 == 65535) {
                        var18 = -1;
                    }
                    var14[var17] = var18;
                    var15[var17] = class149.field2477.method1477((byte) 21);
                    var16[var17] = class149.field2477.method1506(-109);
                }
                class79.method727(-7387, var3, var16, var14, var15);
            }
            if ((var4 & 0x200) != 0) {
                int var19 = class149.field2477.method1490((byte) -121);
                int[] var20 = new int[var19];
                int[] var21 = new int[var19];
                for (int var22 = 0; var22 < var19; var22++) {
                    int var23 = class149.field2477.method1503(124);
                    if ((var23 & 0xC000) == 49152) {
                        int var24 = class149.field2477.method1478(arg0 + 842463480);
                        var20[var22] = class418.method2577(var24, var23 << 16);
                    } else {
                        var20[var22] = var23;
                    }
                    var21[var22] = class149.field2477.method1478(842397944);
                }
                var3.method2451(var21, var20, -100);
            }
            if ((var4 & 0x4) != 0) {
                var3.field120 = class149.field2477.method1503(124);
                var3.field133 = class149.field2477.method1521(false);
            }
            if ((var4 & 0x1000) != 0) {
                var3.field5719 = class149.field2477.method1493(-27697);
                var3.field5740 = class149.field2477.method1493(-27697);
                var3.field5667 = class149.field2477.method1536(-128);
                var3.field5714 = class149.field2477.method1493(-27697);
                var3.field5665 = class149.field2477.method1521(false) + class641.field8810;
                var3.field5726 = class149.field2477.method1503(12) + class641.field8810;
                var3.field5657 = class149.field2477.method1490((byte) 66);
                var3.field5740 += var3.field5743[0];
                var3.field5748 = 0;
                var3.field5714 += var3.field5743[0];
                var3.field5719 += var3.field5746[0];
                var3.field5667 += var3.field5746[0];
                var3.field5745 = 1;
            }
            if ((var4 & 0x2000) != 0) {
                var3.field5681 = class149.field2477.method1509(-622951480);
                var3.field5632 = class149.field2477.method1493(-27697);
                var3.field5696 = class149.field2477.method1509(arg0 - 622885944);
                var3.field5705 = (byte) class149.field2477.method1535(255);
                var3.field5674 = class641.field8810 + class149.field2477.method1478(842397944);
                var3.field5676 = class641.field8810 + class149.field2477.method1478(842397944);
            }
            if ((var4 & 0x40) != 0) {
                int var25 = class149.field2477.method1490((byte) -100);
                if (var25 > 0) {
                    for (int var26 = 0; var26 < var25; var26++) {
                        int var27 = -1;
                        int var28 = -1;
                        int var29 = -1;
                        int var30 = class149.field2477.method1530(-126);
                        if (var30 == 32767) {
                            var30 = class149.field2477.method1530(-118);
                            var28 = class149.field2477.method1530(-117);
                            var27 = class149.field2477.method1530(-122);
                            var29 = class149.field2477.method1530(-123);
                        } else if (var30 == 32766) {
                            var30 = -1;
                        } else {
                            var28 = class149.field2477.method1530(-123);
                        }
                        int var31 = class149.field2477.method1530(-122);
                        int var32 = class149.field2477.method1535(255);
                        var3.method2459(var28, class641.field8810, var30, var29, var27, var31, var32, (byte) 124);
                    }
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field5701 = class149.field2477.method1478(842397944);
                if (var3.field5701 == 65535) {
                    var3.field5701 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field5718 = class149.field2477.method1525((byte) 121);
                var3.field5690 = 100;
            }
            if ((var4 & 0x800) != 0) {
                int var33 = class149.field2477.method1478(842397944);
                var3.field5653 = class149.field2477.method1490((byte) -84);
                var3.field5697 = class149.field2477.method1490((byte) -88);
                var3.field5636 = var33 & 0x7FFF;
                var3.field5652 = (var33 & 0x8000) != 0;
                var3.field5713 = class641.field8810 + var3.field5653 + var3.field5636;
            }
            if ((var4 & 0x400) != 0) {
                int var34 = class149.field2477.method1521(false);
                int var35 = class149.field2477.method1512((byte) -127);
                if (var34 == 65535) {
                    var34 = -1;
                }
                int var36 = class149.field2477.method1490((byte) -116);
                int var37 = var36 & 0x7;
                int var38 = (var36 & 0x7E) >> 3;
                if (var38 == 15) {
                    var38 = -1;
                }
                var3.method2458(var37, var34, arg0 ^ 0x3C569B2E, var38, true, var35);
            }
        }
        field1682++;
    }
}
