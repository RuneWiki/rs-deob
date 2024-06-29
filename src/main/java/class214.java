import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class214 extends class171 {

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    private int field3633 = 0;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "Lje;")
    private class68 field3634 = null;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
    private int field3644 = -32768;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "Z")
    private boolean field3639 = true;

    @OriginalMember(owner = "client!nj", name = "J", descriptor = "I")
    private int field3653 = 0;

    @OriginalMember(owner = "client!nj", name = "M", descriptor = "I")
    private int field3656 = -1;

    @OriginalMember(owner = "client!nj", name = "L", descriptor = "I")
    private int field3655 = -1;

    @OriginalMember(owner = "client!nj", name = "O", descriptor = "I")
    private int field3658 = 0;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    private int field3630;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    private int field3637;

    @OriginalMember(owner = "client!nj", name = "N", descriptor = "I")
    private int field3657;

    @OriginalMember(owner = "client!nj", name = "V", descriptor = "I")
    private int field3665;

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "I")
    private int field3645;

    @OriginalMember(owner = "client!nj", name = "E", descriptor = "I")
    private int field3649;

    @OriginalMember(owner = "client!nj", name = "P", descriptor = "Lhj;")
    private class28 field3659;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    private int field3638;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    private int field3635;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "Lwa;")
    public static class75 field3631 = class66.method560("AUS", false);

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "Z")
    public static boolean field3640 = false;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "Lwa;")
    public static class75 field3646 = class66.method560("RuneScape wird geladen )2 bitte warten)3)3)3", false);

    @OriginalMember(owner = "client!nj", name = "F", descriptor = "Lwa;")
    public static class75 field3650 = class66.method560(" GMT", false);

    @OriginalMember(owner = "client!nj", name = "S", descriptor = "Z")
    public static boolean field3662 = false;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "F")
    public static float field3632;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!nj", name = "C", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!nj", name = "D", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!nj", name = "G", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!nj", name = "H", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!nj", name = "K", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!nj", name = "Q", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!nj", name = "R", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!nj", name = "T", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!nj", name = "U", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "()I", line = 6)
    public final int method443() {
        field3660++;
        return this.field3644;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIBI)V", line = 16)
    public final void method1267(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        this.method1573(true, true);
        field3636++;
        int var6 = 32 % ((arg3 + 47) / 33);
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(IIIIIIIZLpj;)V", line = 714)
    public class214(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class171 arg8) {
        this.field3630 = arg1;
        this.field3637 = arg4;
        this.field3657 = arg5;
        this.field3665 = arg2;
        this.field3645 = arg0;
        this.field3649 = arg3;
        if (arg8 != null) {
            if ((arg8 instanceof class214)) {
                ((class214) arg8).method1574(-120);
            } else {
                class108 var10 = class3.method14((byte) 83, this.field3645);
                if (var10.field1812 != null) {
                    var10 = var10.method849(true);
                }
                if (var10 != null) {
                    class72.method599(-13873, this.field3630, 0, var10, this.field3649, this.field3665, this.field3637, this.field3657, 0);
                }
            }
        }
        if (arg6 != -1) {
            this.field3659 = class302.method2082(arg6, 110);
            this.field3638 = 0;
            this.field3635 = class143.field2463 - 1;
            if (this.field3659.field381 == 0 && arg8 != null && arg8 instanceof class214) {
                class214 var11 = (class214) arg8;
                if (this.field3659 == var11.field3659) {
                    this.field3638 = var11.field3638;
                    this.field3635 = var11.field3635;
                    return;
                }
            }
            if (arg7 && this.field3659.field384 != -1) {
                this.field3638 = (int) (Math.random() * (double) this.field3659.field368.length);
                this.field3635 -= (int) ((double) this.field3659.field361[this.field3638] * Math.random());
            }
        }
        if (arg8 != null) {
            this.method1573(true, true);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIIIIIIIJ)V", line = 34)
    public final void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class171 var11 = this.method1576(-111);
        field3648++;
        if (var11 != null) {
            var11.method409(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3644 = var11.method443();
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V", line = 51)
    public static final void method1572(int arg0) {
        field3643++;
        if (arg0 != 1513) {
            method1572(-9);
        }
        for (class85 var1 = (class85) class216.field3701.method1250(true); var1 != null; var1 = (class85) class216.field3701.method1256((byte) -126)) {
            if (var1.field1399 > 0) {
                var1.field1399--;
            }
            if (var1.field1399 != 0) {
                if (var1.field1408 > 0) {
                    var1.field1408--;
                }
                if (var1.field1408 == 0 && var1.field1396 >= 1 && var1.field1406 >= 1 && var1.field1396 <= 102 && var1.field1406 <= 102 && (var1.field1391 < 0 || class216.method1589(23519, var1.field1398, var1.field1391))) {
                    class85.method689(var1.field1401, var1.field1398, arg0 ^ 0xFFFFFA74, var1.field1411, var1.field1396, var1.field1391, var1.field1410, var1.field1406);
                    var1.field1408 = -1;
                    if (var1.field1395 == var1.field1391 && var1.field1395 == -1) {
                        var1.method1527(126);
                    } else if (var1.field1395 == var1.field1391 && var1.field1410 == var1.field1402 && var1.field1405 == var1.field1398) {
                        var1.method1527(40);
                    }
                }
            } else if (var1.field1395 < 0 || class216.method1589(23519, var1.field1405, var1.field1395)) {
                class85.method689(var1.field1401, var1.field1405, arg0 ^ 0xFFFFFA7F, var1.field1411, var1.field1396, var1.field1395, var1.field1402, var1.field1406);
                var1.method1527(arg0 - 1470);
            }
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZZ)Lpj;", line = 110)
    private final class171 method1573(boolean arg0, boolean arg1) {
        field3661++;
        boolean var3 = class60.field1058 != class53.field879;
        class108 var4 = class3.method14((byte) 83, this.field3645);
        if (var4.field1812 != null) {
            var4 = var4.method849(arg1);
        }
        if (var4 == null) {
            if (!var3) {
                this.method1574(-120);
            }
            return null;
        }
        int var5 = this.field3665 & 0x3;
        int var6;
        int var7;
        if (var5 == 1 || var5 == 3) {
            var6 = var4.field1856;
            var7 = var4.field1837;
        } else {
            var6 = var4.field1837;
            var7 = var4.field1856;
        }
        int var8 = (var7 + 1 >> 1) + this.field3637;
        int var9 = (var6 >> 1) + this.field3657;
        int var10 = (var7 >> 1) + this.field3637;
        int var11 = (var6 + 1 >> 1) + this.field3657;
        this.method1582(var9 * 128, var10 * 128, -128);
        boolean var12 = !var3 && var4.field1840 && (this.field3655 != var4.field1823 || this.field3656 != this.field3638 && class157.field2692 >= 2);
        if (arg0 && !var12) {
            return null;
        }
        int[][] var13 = class53.field879[this.field3649];
        if (!arg1) {
            return (class171) null;
        }
        int var14 = var13[var8][var9] + var13[var10][var9] + var13[var8][var11] + var13[var10][var11] >> 2;
        int var15 = (this.field3637 << 7) + (var7 << 6);
        int[][] var16 = (int[][]) null;
        if (var3) {
            var16 = class60.field1058[0];
        } else if (this.field3649 < 3) {
            var16 = class53.field879[this.field3649 + 1];
        }
        int var17 = (this.field3657 << 7) + (var6 << 6);
        if (var12) {
            class18.method110(this.field3634, this.field3633, this.field3658, this.field3653);
        }
        boolean var18 = this.field3634 == null;
        class121 var19;
        if (this.field3659 == null) {
            var19 = var4.method835((byte) 91, this.field3630, var12, var16, var15, var17, var14, this.field3665, false, var18 ? class130.field2253 : this.field3634, var13);
        } else {
            var19 = var4.method836(var14, var17, var12, var18 ? class130.field2253 : this.field3634, this.field3665, this.field3659, var16, -18349, var13, this.field3638, this.field3630, var15);
        }
        if (var19 == null) {
            return null;
        }
        if (var12) {
            if (var18) {
                class130.field2253 = var19.field2032;
            }
            int var20 = 0;
            if (this.field3649 != 0) {
                int[][] var21 = class53.field879[0];
                var20 = var14 - (var21[var8][var9] + var21[var10][var9] + var21[var8][var11] + var21[var10][var11] >> 2);
            }
            class68 var22 = var19.field2032;
            if (this.field3639 && class18.method123(var22, var15, var20, var17)) {
                this.field3639 = false;
            }
            if (!this.field3639) {
                class18.method108(var22, var15, var20, var17);
                this.field3633 = var15;
                this.field3658 = var20;
                this.field3653 = var17;
                this.field3634 = var22;
                if (var18) {
                    class130.field2253 = null;
                }
            }
            this.field3655 = var4.field1823;
            this.field3656 = this.field3638;
        }
        return var19.field2033;
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V", line = 249)
    public final void method1574(int arg0) {
        int var2 = 9 / ((arg0 + 65) / 52);
        if (this.field3634 != null) {
            class18.method110(this.field3634, this.field3633, this.field3658, this.field3653);
        }
        field3647++;
        this.field3656 = -1;
        this.field3634 = null;
        this.field3655 = -1;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(II)Z", line = 270)
    public static final boolean method1575(int arg0, int arg1) {
        field3663++;
        if (arg0 != 30250) {
            method1579((class96) null, 109, false, 123);
        }
        return arg1 == 198 || arg1 == 230 || arg1 == 156 || arg1 == 140 || arg1 == 223;
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)Lpj;", line = 285)
    private final class171 method1576(int arg0) {
        field3652++;
        return arg0 > -109 ? (class171) null : this.method1573(false, true);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lcb;I)I", line = 310)
    public static final int method1577(class267 arg0, int arg1) {
        field3642++;
        int var2 = arg1;
        if (arg0.method1908(class210.field3588, (byte) -18)) {
            var2 = arg1 + 1;
        }
        if (arg0.method1908(class271.field4687, (byte) -18)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nj", name = "e", descriptor = "(I)V", line = 330)
    public static void method1578(int arg0) {
        field3646 = null;
        field3650 = null;
        if (arg0 <= 24) {
            method1580(false, 35);
        }
        field3631 = null;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Lwc;IZI)V", line = 348)
    public static final void method1579(class96 arg0, int arg1, boolean arg2, int arg3) {
        field3641++;
        if (!arg2) {
            method1581(-94, 7, (byte) 64);
        }
        if ((arg3 & 0x20) != 0) {
            arg0.field3243 = class136.field2328.method532(-1);
            if (arg0.field3243.method626(160, 0) == 126) {
                arg0.field3243 = arg0.field3243.method650(0, 1);
                class162.method1216((byte) 38, 2, arg0.field3243, arg0.method738((byte) -128));
            } else if (class279.field4831 == arg0) {
                class162.method1216((byte) 38, 2, arg0.field3243, arg0.method738((byte) -128));
            }
            arg0.field3263 = 0;
            arg0.field3250 = 0;
            arg0.field3275 = 150;
        }
        if ((arg3 & 0x80) != 0) {
            int var4 = class136.field2328.method488(0);
            int var5 = class136.field2328.method479(109);
            arg0.method1452(var4, var5, (byte) -61, class143.field2463);
            arg0.field3245 = class143.field2463 + 300;
            arg0.field3226 = class136.field2328.method479(113);
        }
        if ((arg3 & 0x8) != 0) {
            arg0.field3213 = class136.field2328.method491(8);
            arg0.field3256 = class136.field2328.method481((byte) 45);
        }
        if ((arg3 & 0x4) != 0) {
            arg0.field3237 = class136.field2328.method485((byte) -2);
            if (arg0.field3237 == 65535) {
                arg0.field3237 = -1;
            }
        }
        if ((arg3 & 0x40) != 0) {
            int var6 = class136.field2328.method474((byte) 104);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = class136.field2328.method501(0);
            class299.method2063(var6, (byte) 76, var7, arg0);
        }
        if ((arg3 & 0x200) != 0) {
            arg0.field3261 = class136.field2328.method491(8);
            int var8 = class136.field2328.method483((byte) 47);
            arg0.field3224 = (var8 & 0xFFFF) + class143.field2463;
            arg0.field3255 = 0;
            arg0.field3247 = var8 >> 16;
            arg0.field3210 = 0;
            if (class143.field2463 < arg0.field3224) {
                arg0.field3255 = -1;
            }
            if (arg0.field3261 == 65535) {
                arg0.field3261 = -1;
            }
            if (arg0.field3261 != -1 && class143.field2463 == arg0.field3224) {
                int var9 = class65.method556(arg0.field3261, -42).field4550;
                if (var9 != -1) {
                    class28 var10 = class302.method2082(var9, 79);
                    if (var10 != null && var10.field368 != null) {
                        class292.method2034(0, class279.field4831 == arg0, arg0.field3259, var10, 17, arg0.field3218);
                    }
                }
            }
        }
        if ((arg3 & 0x400) != 0) {
            arg0.field3239 = class136.field2328.method488(0);
            arg0.field3207 = class136.field2328.method479(114);
            arg0.field3242 = class136.field2328.method488(0);
            arg0.field3253 = class136.field2328.method507(-124);
            arg0.field3249 = class136.field2328.method491(8) + class143.field2463;
            arg0.field3214 = class136.field2328.method481((byte) 29) + class143.field2463;
            arg0.field3258 = class136.field2328.method479(116);
            arg0.field3246 = 1;
            arg0.field3222 = 0;
        }
        if ((arg3 & 0x10) != 0) {
            int var11 = class136.field2328.method485((byte) -2);
            boolean var12 = (var11 & 0x8000) != 0;
            int var13 = class136.field2328.method479(90);
            int var14 = class136.field2328.method501(0);
            int var15 = class136.field2328.field1012;
            if (arg0.field1561 != null && arg0.field1564 != null) {
                long var16 = arg0.field1561.method630(-48);
                boolean var18 = false;
                if (var13 <= 1) {
                    if (!var12 && (class188.field3140 == 1 || class213.field3627 == 1)) {
                        var18 = true;
                    } else {
                        for (int var19 = 0; var19 < class205.field3472; var19++) {
                            if (class66.field1152[var19] == var16) {
                                var18 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var18 && class211.field3603 == 0) {
                    class286.field4923.field1012 = 0;
                    class136.field2328.method502(var14, 0, class286.field4923.field997, -20243);
                    class286.field4923.field1012 = 0;
                    int var20 = -1;
                    class75 var21;
                    if (var12) {
                        class200 var22 = class204.method1517(4096, class286.field4923);
                        var11 &= 0x7FFF;
                        var20 = var22.field3377;
                        var21 = var22.field3390.method1283(class286.field4923, (byte) -92);
                    } else {
                        var21 = class101.method787(class238.method1724(class286.field4923, 121).method641(-8450));
                    }
                    arg0.field3243 = var21.method649(255);
                    arg0.field3263 = var11 & 0xFF;
                    arg0.field3275 = 150;
                    arg0.field3250 = var11 >> 8;
                    if (var13 == 2) {
                        class63.method545((class75) null, var12 ? 17 : 1, var21, 1, var20, class66.method562((byte) -56, new class75[] { class134.field2312, arg0.method738((byte) -128) }));
                    } else if (var13 == 1) {
                        class63.method545((class75) null, var12 ? 17 : 1, var21, 1, var20, class66.method562((byte) -21, new class75[] { class211.field3602, arg0.method738((byte) -128) }));
                    } else {
                        class63.method545((class75) null, var12 ? 17 : 2, var21, 1, var20, arg0.method738((byte) -128));
                    }
                }
            }
            class136.field2328.field1012 = var14 + var15;
        }
        if ((arg3 & 0x1) != 0) {
            int var23 = class136.field2328.method488(0);
            byte[] var24 = new byte[var23];
            class60 var25 = new class60(var24);
            class136.field2328.method502(var23, 0, var24, -20243);
            class48.field786[arg1] = var25;
            arg0.method737(var25, (byte) 3);
        }
        if ((arg3 & 0x100) != 0) {
            int var26 = class136.field2328.method507(-116);
            int var27 = class136.field2328.method507(-125);
            arg0.method1452(var26, var27, (byte) -38, class143.field2463);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ZI)I", line = 596)
    public static final int method1580(boolean arg0, int arg1) {
        if (arg0) {
            return 107;
        } else {
            field3651++;
            return arg1 & 0x3FF;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIB)I", line = 613)
    public static final int method1581(int arg0, int arg1, byte arg2) {
        if (arg2 != 18) {
            field3640 = false;
        }
        field3654++;
        class118 var3 = (class118) class310.field5269.method1007((long) arg1, -17004);
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && var3.field2001.length > arg0) {
            return var3.field2001[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(III)V", line = 638)
    private final void method1582(int arg0, int arg1, int arg2) {
        field3664++;
        if (arg2 >= -121) {
            method1575(-60, -76);
        }
        if (this.field3659 == null) {
            return;
        }
        int var4 = class143.field2463 - this.field3635;
        if (var4 > 100 && this.field3659.field384 > 0) {
            int var5 = this.field3659.field368.length - this.field3659.field384;
            while (this.field3638 < var5 && var4 > this.field3659.field361[this.field3638]) {
                var4 -= this.field3659.field361[this.field3638];
                this.field3638++;
            }
            if (var5 <= this.field3638) {
                int var6 = 0;
                for (int var7 = var5; var7 < this.field3659.field368.length; var7++) {
                    var6 += this.field3659.field361[var7];
                }
                var4 %= var6;
            }
        }
        label62: {
            do {
                do {
                    if (var4 <= this.field3659.field361[this.field3638]) {
                        break label62;
                    }
                    class292.method2034(this.field3638, false, arg1, this.field3659, 79, arg0);
                    var4 -= this.field3659.field361[this.field3638];
                    this.field3638++;
                } while (this.field3659.field368.length > this.field3638);
                this.field3638 -= this.field3659.field384;
            } while (this.field3638 >= 0 && this.field3659.field368.length > this.field3638);
            this.field3659 = null;
        }
        this.field3635 = class143.field2463 - var4;
    }
}
