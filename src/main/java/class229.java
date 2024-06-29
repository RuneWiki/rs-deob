import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class229 extends class187 {

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
    public int field3689 = 0;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "[I")
    public static int[] field3673 = new int[200];

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "Ljava/lang/String;")
    public static String field3688 = "wishes to trade with you.";

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "[J")
    public static long[] field3692 = new long[32];

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public int field3671;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public int field3672;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public int field3675;

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public int field3677;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    public int field3679;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    public int field3680;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
    public int field3681;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    public int field3683;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "I")
    public int field3685;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
    public int field3693;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
    public int field3697;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "Lmd;")
    public class17 field3687;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "Lmh;")
    public class331 field3690;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "Lmh;")
    public class331 field3694;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "Ljj;")
    public class80 field3674;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "Lum;")
    public class82 field3698;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "Z")
    public boolean field3676;

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "[I")
    public int[] field3686;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V", line = 7)
    public static void method1568(byte arg0) {
        field3688 = null;
        field3692 = null;
        field3673 = null;
        if (arg0 != -121) {
            method1571(-127, false, (byte) 87, -74, (class222) null, -54);
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V", line = 22)
    public static final void method1569(byte arg0) {
        int var1 = class183.field2811.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class183.field2811[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class162.field2501; var4++) {
                    if (class75.field1127[var4] == class121.field1865[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                int var5 = 0;
                if (var3 == -1) {
                    class75.field1127[class162.field2501] = class121.field1865[var2];
                    var3 = class162.field2501++;
                }
                class303 var6 = new class303(class183.field2811[var2]);
                while (var6.field4679 < class183.field2811[var2].length && var5 < 511) {
                    int var7 = var6.method1994(false);
                    int var8 = var3 | var5++ << 6;
                    int var9 = var7 >> 14;
                    int var10 = var7 & 0x3F;
                    int var11 = var7 >> 7 & 0x3F;
                    int var12 = (class121.field1865[var2] >> 8) * 64 + var11 - class30.field374;
                    int var13 = (class121.field1865[var2] & 0xFF) * 64 + var10 - class294.field4535;
                    class298 var14 = class71.method511(var6.method1994(false), 10);
                    if (class208.field3313[var8] == null && (var14.field4625 & 0x1) > 0 && class230.field3720 == var9 && var12 >= 0 && var14.field4609 + var12 < 104 && var13 >= 0 && var13 + var14.field4609 < 104) {
                        class208.field3313[var8] = new class80();
                        class80 var15 = class208.field3313[var8];
                        class144.field2286[class155.field2439++] = var8;
                        var15.field527 = class343.field5341;
                        var15.method554(var14, 56);
                        var15.method279(var15.field1178.field4609, arg0 + 118);
                        var15.field520 = var15.field564 = class303.field4677[var15.field1178.field4614];
                        var15.field565 = var15.field1178.field4572;
                        var15.field522 = var15.field1178.field4595;
                        if (var15.field565 == 0) {
                            var15.field564 = 0;
                        }
                        var15.method269(true, var13, arg0 ^ 0x10, var12, var15.method271((byte) 69));
                    }
                }
            }
        }
        if (arg0 != -101) {
            field3688 = (String) null;
        }
        field3682++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIIIILfe;IZJ)Z", line = 116)
    public static final boolean method1570(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class94 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = client.field2034 == class46.field655;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class228.field3650 || var16 >= class84.field1276) {
                    return false;
                }
                class174 var17 = class90.field1375[arg0][var15][var16];
                if (var17 != null && var17.field2655 >= 5) {
                    return false;
                }
            }
        }
        class272 var18 = new class272();
        var18.field4183 = arg11;
        var18.field4177 = arg0;
        var18.field4176 = arg5;
        var18.field4174 = arg6;
        var18.field4179 = arg7;
        var18.field4173 = arg8;
        var18.field4168 = arg9;
        var18.field4169 = arg1;
        var18.field4186 = arg2;
        var18.field4185 = arg1 + arg3 - 1;
        var18.field4181 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class90.field1375[var22][var19][var20] == null) {
                        class90.field1375[var22][var19][var20] = new class174(var22, var19, var20);
                    }
                }
                class174 var23 = class90.field1375[arg0][var19][var20];
                var23.field2671[var23.field2655] = var18;
                var23.field2654[var23.field2655] = var21;
                var23.field2661 |= var21;
                var23.field2655++;
                if (var13 && class150.field2367[var19][var20] != 0) {
                    var14 = class150.field2367[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class150.field2367[var24][var25] == 0) {
                        class150.field2367[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class118.field1828[class33.field420++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZBILgh;I)V", line = 255)
    public static final void method1571(int arg0, boolean arg1, byte arg2, int arg3, class222 arg4, int arg5) {
        field3678++;
        if (class271.field4162 >= 50 || arg4 == null || arg4.field3556 == null || arg5 >= arg4.field3556.length || arg4.field3556[arg5] == null) {
            return;
        }
        int var6 = arg4.field3556[arg5][0];
        int var7 = var6 >> 8;
        int var8 = (var6 & 0xE4) >> 5;
        if (arg4.field3556[arg5].length > 1) {
            int var9 = (int) (Math.random() * (double) arg4.field3556[arg5].length);
            if (var9 > 0) {
                var7 = arg4.field3556[arg5][var9];
            }
        }
        int var10 = var6 & 0x1F;
        if (var10 == 0) {
            if (arg1) {
                class118.method810(var7, true, var8, 255, 0);
            }
        } else if (class274.field4219 != 0) {
            class207.field3223[class271.field4162] = var7;
            if (arg2 != -110) {
                field3673 = (int[]) null;
            }
            int var11 = (arg3 - 64) / 128;
            int var12 = (arg0 - 64) / 128;
            class228.field3652[class271.field4162] = var8;
            class44.field631[class271.field4162] = 0;
            class222.field3536[class271.field4162] = null;
            class315.field4966[class271.field4162] = 255;
            class29.field359[class271.field4162] = (var11 << 8) + (var12 << 16) + var10;
            class271.field4162++;
        }
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(Z)[Lbd;", line = 322)
    public static final class20[] method1572(boolean arg0) {
        if (arg0) {
            field3692 = (long[]) null;
        }
        class20[] var1 = new class20[class246.field3862];
        field3684++;
        for (int var2 = 0; var2 < class246.field3862; var2++) {
            var1[var2] = new class20(class116.field1798, class168.field2567, class276.field4257[var2], class123.field1919[var2], class68.field1011[var2], class107.field1652[var2], class46.field644[var2], class154.field2417);
        }
        class345.method2394((byte) -92);
        return var1;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)V", line = 352)
    public static final void method1573(int arg0, int arg1, int arg2) {
        class345 var3 = class205.method1378(arg1, -29934);
        field3696++;
        int var4 = var3.field5355;
        if (arg0 != 8) {
            method1570(-31, 82, 8, -100, -113, 15, 41, -10, (class94) null, 90, true, -47L);
        }
        int var5 = var3.field5348;
        int var6 = class219.field3483[var4 - var5];
        int var7 = var3.field5356;
        if (arg2 < 0 || var6 < arg2) {
            arg2 = 0;
        }
        int var8 = var6 << var5;
        class42.method304(-27661, ~var8 & class156.field2442[var7] | arg2 << var5 & var8, var7);
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(Z)V", line = 380)
    public final void method1574(boolean arg0) {
        field3695++;
        int var2 = this.field3681;
        if (this.field3687 != null) {
            class17 var3 = this.field3687.method139(-1);
            if (var3 == null) {
                this.field3680 = 0;
                this.field3681 = -1;
                this.field3683 = 0;
                this.field3679 = 0;
                this.field3686 = null;
                this.field3677 = 0;
            } else {
                this.field3680 = var3.field183 * 128;
                this.field3683 = var3.field241;
                this.field3677 = var3.field239;
                this.field3679 = var3.field236;
                this.field3686 = var3.field208;
                this.field3681 = var3.field191;
            }
        } else if (this.field3674 != null) {
            int var4 = class61.method409(0, this.field3674);
            if (var2 != var4) {
                this.field3681 = var4;
                class298 var5 = this.field3674.field1178;
                if (var5.field4588 != null) {
                    var5 = var5.method1956(117);
                }
                if (var5 == null) {
                    this.field3679 = this.field3680 = 0;
                } else {
                    this.field3680 = var5.field4560 * 128;
                    this.field3679 = var5.field4613;
                }
            }
        } else if (this.field3698 != null) {
            this.field3681 = class247.method1667(this.field3698, false);
            this.field3679 = this.field3698.field1220;
            this.field3680 = this.field3698.field1248 * 128;
        }
        if (arg0) {
            method1571(43, true, (byte) 27, -10, (class222) null, -114);
        }
        if (this.field3681 != var2 && this.field3690 != null) {
            class74.field1102.method221(this.field3690);
            this.field3690 = null;
        }
    }
}
