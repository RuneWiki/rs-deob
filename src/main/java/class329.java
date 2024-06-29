import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class329 {

    @OriginalMember(owner = "client!kr", name = "D", descriptor = "Ltb;")
    private class409 field4557 = null;

    @OriginalMember(owner = "client!kr", name = "v", descriptor = "Li;")
    private class254 field4549;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "I")
    public int field4528;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "Z")
    private boolean field4540;

    @OriginalMember(owner = "client!kr", name = "C", descriptor = "Lim;")
    public static class353 field4556 = new class353(92, 6);

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "I")
    public static int field4547;

    @OriginalMember(owner = "client!kr", name = "u", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!kr", name = "w", descriptor = "I")
    public static int field4550;

    @OriginalMember(owner = "client!kr", name = "x", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!kr", name = "y", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!kr", name = "A", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!kr", name = "B", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!kr", name = "E", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!kr", name = "F", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!kr", name = "G", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!kr", name = "I", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!kr", name = "J", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!kr", name = "L", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!kr", name = "M", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!kr", name = "N", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!kr", name = "O", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!kr", name = "P", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "[Ljava/lang/Object;")
    private Object[] field4531;

    @OriginalMember(owner = "client!kr", name = "K", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field4563;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(BI)Z")
    public final boolean method2042(byte arg0, int arg1) {
        field4559++;
        if (arg0 != -80) {
            method2043(null, 93);
        }
        if (!this.method2069(3162)) {
            return false;
        } else if (this.field4557.field5606.length == 1) {
            return this.method2051(arg1, 0, arg0 ^ 0x18);
        } else if (!this.method2074(arg1, -27515)) {
            return false;
        } else if (this.field4557.field5606[arg1] == 1) {
            return this.method2051(0, arg1, -101);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lsb;I)I")
    public static final int method2043(class280 arg0, int arg1) {
        field4568++;
        if (arg1 > -96) {
            return 93;
        } else if (class280.field3656 == arg0) {
            return 5120;
        } else if (class280.field3660 == arg0) {
            return 5122;
        } else if (class280.field3662 == arg0) {
            return 5124;
        } else if (class280.field3663 == arg0) {
            return 5121;
        } else if (class280.field3664 == arg0) {
            return 5123;
        } else if (class280.field3665 == arg0) {
            return 5125;
        } else if (class280.field3666 == arg0) {
            return 5131;
        } else if (class280.field3667 == arg0) {
            return 5126;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/String;Z)I")
    public final int method2044(String arg0, boolean arg1) {
        field4545++;
        if (!this.method2069(3162)) {
            return 0;
        }
        if (!arg1) {
            this.field4540 = true;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field4557.field5607.method3646(class523.method2926(0, var3), 599786657);
        return this.method2056((byte) -114, var4);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B")
    public final byte[] method2045(String arg0, byte arg1, String arg2) {
        field4547++;
        if (!this.method2069(3162)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field4557.field5607.method3646(class523.method2926(0, var4), 599786657);
        if (this.method2074(var6, -27515)) {
            int var7 = this.field4557.field5618[var6].method3646(class523.method2926(arg1 + 22, var5), 599786657);
            return arg1 == -22 ? this.method2054(true, var6, var7) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)I")
    public final int method2046(byte arg0) {
        if (arg0 != 64) {
            this.field4531 = null;
        }
        field4558++;
        return this.method2069(3162) ? this.field4557.field5606.length : -1;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)[Lrh;")
    public static final class44[] method2047(boolean arg0) {
        field4542++;
        return arg0 ? null : new class44[] { class613.field8816, class93.field1237, class575.field8024 };
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "([IIII)Z")
    private final boolean method2048(int[] arg0, int arg1, int arg2, int arg3) {
        field4554++;
        if (!this.method2074(arg3, -27515)) {
            return false;
        } else if (this.field4531[arg3] == null) {
            return false;
        } else {
            int var5 = this.field4557.field5621[arg3];
            if (arg1 != -1) {
                return false;
            }
            int[] var6 = this.field4557.field5616[arg3];
            if (this.field4563[arg3] == null) {
                this.field4563[arg3] = new Object[this.field4557.field5606[arg3]];
            }
            Object[] var7 = this.field4563[arg3];
            boolean var8 = true;
            for (int var9 = 0; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
                var11 = class584.method3371(this.field4531[arg3], false, 3);
            } else {
                var11 = class584.method3371(this.field4531[arg3], true, 3);
                class551 var12 = new class551(var11);
                var12.method3076(arg0, 25341, var12.field7693.length, 5);
            }
            byte[] var13;
            try {
                var13 = class521.method2903(-3874, var11);
            } catch (RuntimeException var49) {
                throw class414.method2470(var49, "T3 - " + (arg0 != null) + "," + arg3 + "," + var11.length + "," + class381.method2317(119, var11, var11.length) + "," + class381.method2317(127, var11, var11.length - 2) + "," + this.field4557.field5603[arg3] + "," + this.field4557.field5622);
            }
            if (this.field4540) {
                this.field4531[arg3] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field4528 == 0) {
                    var7[var15] = class410.method2443((byte) -62, false, var13);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field4528 == 2) {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var5 * var17 * 4;
                class551 var19 = new class551(var13);
                int var20 = 0;
                var19.field7707 = var18;
                int var21 = 0;
                for (int var22 = 0; var22 < var17; var22++) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < var5; var24++) {
                        var23 += var19.method3048(arg1 ^ 0x3);
                        int var25;
                        if (var6 == null) {
                            var25 = var24;
                        } else {
                            var25 = var6[var24];
                        }
                        if (arg2 == var25) {
                            var20 += var23;
                            var21 = var25;
                        }
                    }
                }
                if (var20 == 0) {
                    return true;
                }
                byte[] var26 = new byte[var20];
                int var27 = 0;
                var19.field7707 = var18;
                int var28 = 0;
                for (int var29 = 0; var29 < var17; var29++) {
                    int var30 = 0;
                    for (int var31 = 0; var31 < var5; var31++) {
                        var30 += var19.method3048(-4);
                        int var32;
                        if (var6 == null) {
                            var32 = var31;
                        } else {
                            var32 = var6[var31];
                        }
                        if (arg2 == var32) {
                            class205.method1311(var13, var28, var26, var27, var30);
                            var27 += var30;
                        }
                        var28 += var30;
                    }
                }
                var7[var21] = var26;
            } else {
                int var33 = var13.length;
                int var51 = var33 - 1;
                int var34 = var13[var51] & 0xFF;
                int var35 = var51 - var5 * var34 * 4;
                class551 var36 = new class551(var13);
                int[] var37 = new int[var5];
                var36.field7707 = var35;
                for (int var38 = 0; var38 < var34; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var36.method3048(arg1 - 3);
                        var37[var40] += var39;
                    }
                }
                byte[][] var41 = new byte[var5][];
                for (int var42 = 0; var42 < var5; var42++) {
                    var41[var42] = new byte[var37[var42]];
                    var37[var42] = 0;
                }
                var36.field7707 = var35;
                int var43 = 0;
                for (int var44 = 0; var44 < var34; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var36.method3048(arg1 - 3);
                        class205.method1311(var13, var43, var41[var46], var37[var46], var45);
                        var37[var46] += var45;
                        var43 += var45;
                    }
                }
                for (int var47 = 0; var47 < var5; var47++) {
                    int var48;
                    if (var6 == null) {
                        var48 = var47;
                    } else {
                        var48 = var6[var47];
                    }
                    if (this.field4528 == 0) {
                        var7[var48] = class410.method2443((byte) -62, false, var41[var47]);
                    } else {
                        var7[var48] = var41[var47];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)V")
    public static void method2049(byte arg0) {
        field4556 = null;
        if (arg0 <= 3) {
            method2049((byte) -89);
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(Z)I")
    public final int method2050(boolean arg0) {
        field4566++;
        if (!this.method2069(3162)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4531.length; var4++) {
            if (this.field4557.field5621[var4] > 0) {
                var3 += this.method2056((byte) -110, var4);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            if (!arg0) {
                method2047(true);
            }
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(III)Z")
    public final boolean method2051(int arg0, int arg1, int arg2) {
        field4536++;
        if (!this.method2075(arg1, arg0, (byte) 46)) {
            return false;
        } else if (this.field4563[arg1] != null && this.field4563[arg1][arg0] != null) {
            return true;
        } else if (arg2 >= -17) {
            return false;
        } else if (this.field4531[arg1] == null) {
            this.method2063(0, arg1);
            return this.field4531[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZZI)V")
    public final void method2052(boolean arg0, boolean arg1, int arg2) {
        field4533++;
        if (arg2 >= -17 || !this.method2069(3162)) {
            return;
        }
        if (arg1) {
            this.field4557.field5607 = null;
            this.field4557.field5617 = null;
        }
        if (arg0) {
            this.field4557.field5612 = null;
            this.field4557.field5618 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(BLjava/lang/String;)I")
    public final int method2053(byte arg0, String arg1) {
        field4560++;
        if (!this.method2069(3162)) {
            return -1;
        }
        if (arg0 != 40) {
            this.method2072(null, true);
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field4557.field5607.method3646(class523.method2926(arg0 ^ 0x28, var3), 599786657);
        return this.method2074(var4, -27515) ? var4 : -1;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZII)[B")
    public final byte[] method2054(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field4529++;
            return this.method2071(arg2, (byte) 112, arg1, null);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(BI)Z")
    public final boolean method2055(byte arg0, int arg1) {
        field4541++;
        if (!this.method2074(arg1, -27515)) {
            return false;
        } else if (this.field4531[arg1] == null) {
            this.method2063(0, arg1);
            if (this.field4531[arg1] == null) {
                if (arg0 > -66) {
                    this.field4528 = 36;
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(BI)I")
    private final int method2056(byte arg0, int arg1) {
        field4535++;
        if (this.method2074(arg1, -27515)) {
            if (arg0 > -96) {
                this.field4540 = false;
            }
            return this.field4531[arg1] == null ? this.field4549.method1465(arg1, 31566) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)I")
    public final int method2057(int arg0, int arg1) {
        field4552++;
        if (!this.method2069(3162)) {
            return -1;
        }
        if (arg1 != 0) {
            field4556 = null;
        }
        int var3 = this.field4557.field5607.method3646(arg0, 599786657);
        return this.method2074(var3, -27515) ? var3 : -1;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(II)V")
    public final void method2058(int arg0, int arg1) {
        field4551++;
        if (!this.method2074(arg0, arg1 ^ 0xFFFF8084)) {
            return;
        }
        if (arg1 != 5121) {
            this.method2061(-116, null);
        }
        if (this.field4563 != null) {
            this.field4563[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)Z")
    public final boolean method2059(int arg0) {
        field4548++;
        if (!this.method2069(3162)) {
            return false;
        }
        boolean var2 = true;
        int var3 = 0;
        if (arg0 != 23233) {
            return true;
        }
        while (this.field4557.field5602.length > var3) {
            int var4 = this.field4557.field5602[var3];
            if (this.field4531[var4] == null) {
                this.method2063(arg0 ^ 0x5AC1, var4);
                if (this.field4531[var4] == null) {
                    var2 = false;
                }
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
    public final boolean method2060(String arg0, int arg1, String arg2) {
        if (arg1 > -11) {
            this.method2074(96, -1);
        }
        field4561++;
        if (!this.method2069(3162)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field4557.field5607.method3646(class523.method2926(0, var4), 599786657);
        if (this.method2074(var6, -27515)) {
            int var7 = this.field4557.field5618[var6].method3646(class523.method2926(0, var5), 599786657);
            return this.method2051(var7, var6, -37);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method2061(int arg0, String arg1) {
        field4567++;
        if (!this.method2069(arg0 + 29732)) {
            return;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 != -26570) {
            field4556 = null;
        }
        int var4 = this.field4557.field5607.method3646(class523.method2926(arg0 + 26570, var3), 599786657);
        this.method2067(-2, var4);
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V")
    public final void method2062(int arg0) {
        field4555++;
        if (arg0 > -116) {
            this.method2056((byte) 127, 21);
        }
        if (this.field4563 != null) {
            for (int var2 = 0; var2 < this.field4563.length; var2++) {
                this.field4563[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(II)V")
    private final void method2063(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method2056((byte) -39, -79);
        }
        field4564++;
        if (this.field4540) {
            this.field4531[arg1] = this.field4549.method1457((byte) 122, arg1);
        } else {
            this.field4531[arg1] = class410.method2443((byte) -62, false, this.field4549.method1457((byte) 117, arg1));
        }
    }

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "(II)I")
    public final int method2064(int arg0, int arg1) {
        field4532++;
        if (this.method2074(arg1, -27515)) {
            if (arg0 != 0) {
                this.method2059(57);
            }
            return this.field4557.field5606[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method2065(byte arg0, String arg1) {
        field4538++;
        if (!this.method2069(arg0 + 3227)) {
            return false;
        } else if (arg0 == -65) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field4557.field5607.method3646(class523.method2926(0, var3), arg0 ^ 0xDC3FFB1E);
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(B)I")
    public final int method2066(byte arg0) {
        field4534++;
        if (arg0 >= -96) {
            this.method2069(33);
        }
        if (!this.method2069(3162)) {
            throw new IllegalStateException("");
        }
        return this.field4557.field5622;
    }

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "(II)V")
    private final void method2067(int arg0, int arg1) {
        this.field4549.method1461((byte) -95, arg1);
        field4550++;
        if (arg0 != -2) {
            this.field4557 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "(II)[I")
    public final int[] method2068(int arg0, int arg1) {
        field4565++;
        if (arg0 != 0) {
            return null;
        } else if (this.method2074(arg1, arg0 ^ 0xFFFF9485)) {
            int[] var3 = this.field4557.field5616[arg1];
            if (var3 == null) {
                var3 = new int[this.field4557.field5621[arg1]];
                int var4 = 0;
                while (var4 < var3.length) {
                    var3[var4] = var4++;
                }
            }
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)Z")
    private final boolean method2069(int arg0) {
        if (arg0 != 3162) {
            return true;
        }
        field4537++;
        if (this.field4557 == null) {
            this.field4557 = this.field4549.method1455((byte) 55);
            if (this.field4557 == null) {
                return false;
            }
            this.field4531 = new Object[this.field4557.field5623];
            this.field4563 = new Object[this.field4557.field5623][];
        }
        return true;
    }

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)V")
    public final void method2070(int arg0) {
        if (this.field4531 != null) {
            for (int var2 = 0; var2 < this.field4531.length; var2++) {
                this.field4531[var2] = null;
            }
        }
        if (arg0 == 0) {
            field4530++;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IBI[I)[B")
    public final byte[] method2071(int arg0, byte arg1, int arg2, int[] arg3) {
        field4546++;
        if (!this.method2075(arg2, arg0, (byte) 114)) {
            return null;
        }
        if (this.field4563[arg2] == null || this.field4563[arg2][arg0] == null) {
            boolean var5 = this.method2048(arg3, -1, arg0, arg2);
            if (!var5) {
                this.method2063(0, arg2);
                boolean var6 = this.method2048(arg3, -1, arg0, arg2);
                if (!var6) {
                    return null;
                }
            }
        }
        if (arg1 < 89) {
            this.field4549 = null;
        }
        byte[] var7 = class584.method3371(this.field4563[arg2][arg0], false, 3);
        if (this.field4528 == 1) {
            this.field4563[arg2][arg0] = null;
            if (this.field4557.field5606[arg2] == 1) {
                this.field4563[arg2] = null;
            }
        } else if (this.field4528 == 2) {
            this.field4563[arg2] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(Ljava/lang/String;Z)Z")
    public final boolean method2072(String arg0, boolean arg1) {
        field4543++;
        if (!this.method2069(3162)) {
            return false;
        } else if (arg1) {
            return false;
        } else {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4557.field5607.method3646(class523.method2926(0, var3), 599786657);
            return this.method2055((byte) -76, var4);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)Z")
    public final boolean method2073(byte arg0, String arg1, String arg2) {
        field4553++;
        if (!this.method2069(3162)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field4557.field5607.method3646(class523.method2926(0, var4), 599786657);
        if (var6 < 0) {
            return false;
        }
        int var7 = this.field4557.field5618[var6].method3646(class523.method2926(0, var5), 599786657);
        if (var7 < 0) {
            return false;
        } else {
            int var8 = 69 % ((60 - arg0) / 37);
            return true;
        }
    }

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "(II)Z")
    private final boolean method2074(int arg0, int arg1) {
        field4562++;
        if (!this.method2069(3162)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field4557.field5606.length && this.field4557.field5606[arg0] != 0) {
            return arg1 == -27515;
        } else if (class6.field50) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIB)Z")
    private final boolean method2075(int arg0, int arg1, byte arg2) {
        field4539++;
        if (!this.method2069(3162)) {
            return false;
        } else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.field4557.field5606.length && arg1 < this.field4557.field5606[arg0]) {
            if (arg2 <= 34) {
                method2049((byte) -56);
            }
            return true;
        } else if (class6.field50) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "(II)[B")
    public final byte[] method2076(int arg0, int arg1) {
        field4544++;
        if (!this.method2069(3162)) {
            return null;
        } else if (this.field4557.field5606.length == arg0) {
            return this.method2054(true, 0, arg1);
        } else if (!this.method2074(arg1, -27515)) {
            return null;
        } else if (this.field4557.field5606[arg1] == 1) {
            return this.method2054(true, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Li;ZI)V")
    public class329(class254 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field4549 = arg0;
        this.field4528 = arg2;
        this.field4540 = arg1;
    }
}
