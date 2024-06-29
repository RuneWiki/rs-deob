import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class46 {

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    private int field574 = 0;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    private int field576 = 128;

    @OriginalMember(owner = "client!ll", name = "h", descriptor = "I")
    private int field581 = 0;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "I")
    private int field580 = -1;

    @OriginalMember(owner = "client!ll", name = "q", descriptor = "I")
    private int field590 = 128;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "B")
    public byte field579 = 0;

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "I")
    public int field596 = -1;

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "Z")
    public boolean field592 = false;

    @OriginalMember(owner = "client!ll", name = "p", descriptor = "I")
    private int field589 = 0;

    @OriginalMember(owner = "client!ll", name = "k", descriptor = "Z")
    public static boolean field584 = false;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
    private int field578;

    @OriginalMember(owner = "client!ll", name = "i", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!ll", name = "l", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!ll", name = "n", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "I")
    public int field595;

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!ll", name = "A", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "Lgu;")
    public class729 field599;

    @OriginalMember(owner = "client!ll", name = "j", descriptor = "[S")
    private short[] field583;

    @OriginalMember(owner = "client!ll", name = "m", descriptor = "[S")
    private short[] field586;

    @OriginalMember(owner = "client!ll", name = "o", descriptor = "[S")
    private short[] field588;

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "[S")
    private short[] field591;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILdc;I)V")
    private final void method250(int arg0, class63 arg1, int arg2) {
        if (arg2 == 1) {
            this.field578 = arg1.method482(-772591672);
        } else if (arg2 == 2) {
            this.field596 = arg1.method482(-772591672);
        } else if (arg2 == 4) {
            this.field576 = arg1.method482(-772591672);
        } else if (arg2 == 5) {
            this.field590 = arg1.method482(arg0 ^ 0xD1F30497);
        } else if (arg2 == 6) {
            this.field574 = arg1.method482(-772591672);
        } else if (arg2 == 7) {
            this.field589 = arg1.method505((byte) -119);
        } else if (arg2 == 8) {
            this.field581 = arg1.method505((byte) -119);
        } else if (arg2 == 9) {
            this.field579 = 3;
            this.field580 = 8224;
        } else if (arg2 == 10) {
            this.field592 = true;
        } else if (arg2 == 11) {
            this.field579 = 1;
        } else if (arg2 == 12) {
            this.field579 = 4;
        } else if (arg2 == 13) {
            this.field579 = 5;
        } else if (arg2 == 14) {
            this.field579 = 2;
            this.field580 = arg1.method505((byte) -119) * 256;
        } else if (arg2 == 15) {
            this.field579 = 3;
            this.field580 = arg1.method482(-772591672);
        } else if (arg2 == 16) {
            this.field579 = 3;
            this.field580 = arg1.method457(-14532);
        } else if (arg2 == 40) {
            int var4 = arg1.method505((byte) -119);
            this.field591 = new short[var4];
            this.field588 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field588[var5] = (short) arg1.method482(-772591672);
                this.field591[var5] = (short) arg1.method482(-772591672);
            }
        } else if (arg2 == 41) {
            int var6 = arg1.method505((byte) -119);
            this.field586 = new short[var6];
            this.field583 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field583[var7] = (short) arg1.method482(-772591672);
                this.field586[var7] = (short) arg1.method482(-772591672);
            }
        }
        if (arg0 == 11103) {
            field577++;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILdc;)V")
    public static final void method251(int arg0, class63 arg1) {
        field575++;
        int var2 = arg1.method478(-124);
        class184.field2528 = new class737[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class184.field2528[var3] = new class737();
            class184.field2528[var3].field10197 = arg1.method478(-99);
            class184.field2528[var3].field10196 = arg1.method477(true);
        }
        class650.field8719 = arg1.method478(-95);
        class15.field147 = arg1.method478(-113);
        class451.field6255 = arg1.method478(-128);
        int var4 = -33 / ((arg0 + 9) / 36);
        class393.field5649 = new class370[class15.field147 + 1 - class650.field8719];
        for (int var5 = 0; var5 < class451.field6255; var5++) {
            int var6 = arg1.method478(-119);
            class370 var7 = class393.field5649[var6] = new class370();
            var7.field6047 = arg1.method505((byte) -119);
            var7.field6044 = arg1.method457(-14532);
            var7.field5222 = class650.field8719 + var6;
            var7.field5221 = arg1.method477(true);
            var7.field5224 = arg1.method477(true);
        }
        class673.field9359 = arg1.method457(-14532);
        class711.field9940 = true;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(III)I")
    public static final int method252(int arg0, int arg1, int arg2) {
        field587++;
        int var3 = -85 % ((arg2 - 52) / 44);
        int var4 = class26.method147(arg0 + 45365, -115, arg1 + 91923, 4) + (class26.method147(arg0 + 10294, -101, arg1 + 37821, 2) - 128 >> 1) + (class26.method147(arg0, -96, arg1, 1) + -128 >> 2) - 128;
        int var5 = (int) ((double) var4 * 0.3D) + 35;
        if (var5 < 10) {
            var5 = 10;
        } else if (var5 > 60) {
            var5 = 60;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IB)Lgs;")
    public static final class747 method253(int arg0, byte arg1) {
        field597++;
        int var2 = 45 / ((20 - arg1) / 50);
        if (arg0 == 0) {
            return new class268();
        } else if (arg0 == 1) {
            return new class189();
        } else if (arg0 == 2) {
            return new class235();
        } else if (arg0 == 3) {
            return new class331();
        } else if (arg0 == 4) {
            return new class554();
        } else if (arg0 == 5) {
            return new class321();
        } else if (arg0 == 6) {
            return new class430();
        } else if (arg0 == 7) {
            return new class369();
        } else if (arg0 == 8) {
            return new class575();
        } else if (arg0 == 9) {
            return new class676();
        } else if (arg0 == 10) {
            return new class636();
        } else if (arg0 == 11) {
            return new class497();
        } else if (arg0 == 12) {
            return new class84();
        } else if (arg0 == 13) {
            return new class622();
        } else if (arg0 == 14) {
            return new class449();
        } else if (arg0 == 15) {
            return new class112();
        } else if (arg0 == 16) {
            return new class458();
        } else if (arg0 == 17) {
            return new class122();
        } else if (arg0 == 18) {
            return new class657();
        } else if (arg0 == 19) {
            return new class184();
        } else if (arg0 == 20) {
            return new class177();
        } else if (arg0 == 21) {
            return new class465();
        } else if (arg0 == 22) {
            return new class222();
        } else if (arg0 == 23) {
            return new class171();
        } else if (arg0 == 24) {
            return new class442();
        } else if (arg0 == 25) {
            return new class104();
        } else if (arg0 == 26) {
            return new class101();
        } else if (arg0 == 27) {
            return new class34();
        } else if (arg0 == 28) {
            return new class609();
        } else if (arg0 == 29) {
            return new class612();
        } else if (arg0 == 30) {
            return new class360();
        } else if (arg0 == 31) {
            return new class120();
        } else if (arg0 == 32) {
            return new class376();
        } else if (arg0 == 33) {
            return new class656();
        } else if (arg0 == 34) {
            return new class218();
        } else if (arg0 == 35) {
            return new class720();
        } else if (arg0 == 36) {
            return new class113();
        } else if (arg0 == 37) {
            return new class763();
        } else if (arg0 == 38) {
            return new class518();
        } else if (arg0 == 39) {
            return new class541();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIILpga;ZIIILs;Lha;Ls;II)Lka;")
    public final class284 method254(int arg0, int arg1, int arg2, class495 arg3, boolean arg4, int arg5, int arg6, int arg7, class341 arg8, class548 arg9, class341 arg10, int arg11, int arg12) {
        field593++;
        if (arg11 > -109) {
            this.field599 = null;
        }
        return this.method258(arg3, arg12, arg1, arg0, arg9, arg5, arg2, arg7, arg6, (byte) 2, arg10, arg4, 0, arg8);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lpga;IBIIILha;)Lka;")
    public final class284 method255(class495 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class548 arg6) {
        field594++;
        int var8 = 23 % ((arg2 - 20) / 53);
        return this.method258(arg0, arg3, arg4, 0, arg6, 0, arg1, 0, arg5, (byte) 2, null, false, 0, null);
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(ILdc;)V")
    public final void method256(int arg0, class63 arg1) {
        if (arg0 > -35) {
            this.method258(null, 63, -12, 98, null, 122, -109, 48, -28, (byte) -63, null, false, -10, null);
        }
        while (true) {
            int var3 = arg1.method505((byte) -119);
            if (var3 == 0) {
                field600++;
                return;
            }
            this.method250(11103, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V")
    public static final void method257(int arg0) {
        field585++;
        class63.field987.method819(23738);
        class284.field4101.method3833(20975);
        class747.field10285.method3833(20975);
        if (arg0 != -128) {
            method257(-109);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lpga;IIILha;IIIIBLs;ZILs;)Lka;")
    private final class284 method258(class495 arg0, int arg1, int arg2, int arg3, class548 arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, class341 arg10, boolean arg11, int arg12, class341 arg13) {
        field582++;
        int var15 = arg2;
        class57 var16 = this.field596 == -1 || arg6 == -1 ? null : arg0.method3001(-12575, this.field596);
        boolean var17 = arg11 & this.field579 != 0;
        if (var16 != null) {
            var15 = arg2 | var16.method409(arg6, false, arg8, arg12);
        }
        if (var17) {
            var15 |= this.field579 == 3 ? 7 : 2;
        }
        if (this.field590 != 128) {
            var15 |= 0x2;
        }
        if (this.field576 != 128 || this.field574 != 0) {
            var15 |= 0x5;
        }
        class690 var18 = this.field599.field10153;
        class284 var19;
        synchronized (this.field599.field10153) {
            var19 = (class284) this.field599.field10153.method3898((byte) -42, (long) (this.field595 |= arg4.field7611 << 29));
        }
        if (var19 == null || arg4.method1484(var19.method1703(), var15) != 0) {
            if (var19 != null) {
                var15 = arg4.method1390(var15, var19.method1703());
            }
            int var20 = var15;
            if (this.field588 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field583 != null) {
                var20 |= 0x8000;
            }
            class133 var21 = class214.method1266(this.field599.field10151, 0, this.field578, 0);
            if (var21 == null) {
                return null;
            }
            if (var21.field1891 < 13) {
                var21.method833(2, 6);
            }
            var19 = arg4.method1463(var21, var20, this.field599.field10155, this.field589 + 64, this.field581 + 850);
            if (this.field588 != null) {
                for (int var22 = 0; var22 < this.field588.length; var22++) {
                    var19.method1660(this.field588[var22], this.field591[var22]);
                }
            }
            if (this.field583 != null) {
                for (int var23 = 0; var23 < this.field583.length; var23++) {
                    var19.method1665(this.field583[var23], this.field586[var23]);
                }
            }
            var19.method1691(var15);
            class690 var24 = this.field599.field10153;
            synchronized (this.field599.field10153) {
                this.field599.field10153.method3899(-74, var19, (long) (this.field595 |= arg4.field7611 << 29));
            }
        }
        class284 var25 = var16 == null ? var19.method1659(arg9, var15, true) : var16.method407(arg1, 0, var15, arg6, arg8, arg9, var19, 128);
        if (this.field576 != 128 || this.field590 != 128) {
            var25.method1663(this.field576, this.field590, this.field576);
        }
        if (this.field574 != arg12) {
            if (this.field574 == 90) {
                var25.method1704(4096);
            }
            if (this.field574 == 180) {
                var25.method1704(8192);
            }
            if (this.field574 == 270) {
                var25.method1704(12288);
            }
        }
        if (var17) {
            var25.method1687(this.field579, this.field580, arg10, arg13, arg5, arg7, arg3);
        }
        var25.method1691(arg2);
        return var25;
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IZIBIILpga;Lha;)Lka;")
    public final class284 method259(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, class495 arg6, class548 arg7) {
        if (arg1) {
            this.method250(-33, null, 104);
        }
        field598++;
        return this.method258(arg6, arg4, arg5, 0, arg7, 0, arg2, 0, arg0, arg3, null, false, 0, null);
    }
}
