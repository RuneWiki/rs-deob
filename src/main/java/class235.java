import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class235 {

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "Luj;")
    private class287 field3582 = null;

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "Z")
    private boolean field3570;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "Z")
    private boolean field3563;

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "Lbh;")
    private class7 field3574;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "Ljava/lang/String;")
    public static String field3569 = " from your ignore list first.";

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "I")
    public static int field3568 = -1;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "Ljava/lang/String;")
    public static String field3565 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "Z")
    public static boolean field3553 = false;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Lab;")
    public static class148 field3541 = new class148();

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "Llc;")
    public static class86 field3583 = new class86(64);

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!hc", name = "J", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!hc", name = "S", descriptor = "I")
    public static int field3580;

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "[Ljava/lang/Object;")
    private Object[] field3554;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3559;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
    public static void method1546(boolean arg0) {
        field3569 = null;
        if (arg0) {
            field3565 = null;
            field3583 = null;
            field3541 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
    public final boolean method1547(String arg0, String arg1, int arg2) {
        field3581++;
        if (!this.method1574(arg2 ^ arg2)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field3582.field4538.method316(arg2 - 3, class7.method48(var4, arg2 + 253));
        if (this.method1566(-91, var6)) {
            int var7 = this.field3582.field4529[var6].method316(-1, class7.method48(var5, arg2 + 253));
            return this.method1564(2, var6, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public final void method1548(int arg0) {
        if (arg0 != -2) {
            field3583 = null;
        }
        field3572++;
        if (this.field3559 != null) {
            for (int var2 = 0; var2 < this.field3559.length; var2++) {
                this.field3559[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZI)Ls;")
    public static final class245 method1549(boolean arg0, int arg1) {
        if (arg0) {
            method1575(-113, -40, (byte) 92, 118, 57, 61, 60, -11, 13, 107, 87);
        }
        field3577++;
        return class257.field3927 && arg1 >= class232.field3509 && class276.field4282 >= arg1 ? class167.field2299[arg1 - class232.field3509] : null;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(Z)I")
    public final int method1550(boolean arg0) {
        field3542++;
        if (!this.method1574(0)) {
            return 0;
        }
        if (!arg0) {
            this.field3582 = null;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3554.length; var4++) {
            if (this.field3582.field4536[var4] > 0) {
                var2 += this.method1573(var4, -122);
                var3 += 100;
            }
        }
        if (var3 == 0) {
            return 100;
        } else {
            return var2 * 100 / var3;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public final void method1551(String arg0, byte arg1) {
        field3543++;
        if (!this.method1574(0)) {
            return;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != 78) {
            this.field3570 = true;
        }
        int var4 = this.field3582.field4538.method316(-1, class7.method48(var3, 255));
        this.method1569((byte) -109, var4);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
    public final byte[] method1552(int arg0, String arg1, String arg2) {
        field3566++;
        if (!this.method1574(0)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field3582.field4538.method316(-1, class7.method48(var4, arg0 ^ -1824));
        if (!this.method1566(arg0 + 2100, var6)) {
            return null;
        }
        if (arg0 != -2017) {
            this.field3574 = null;
        }
        int var7 = this.field3582.field4529[var6].method316(-1, class7.method48(var5, 255));
        return this.method1576(-47, var6, var7);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method1553(byte arg0, String arg1) {
        field3550++;
        if (!this.method1574(arg0 + 118)) {
            return false;
        }
        if (arg0 != -118) {
            this.field3563 = true;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field3582.field4538.method316(-1, class7.method48(var3, 255));
        return this.method1581(var4, false);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ[I)Z")
    private final boolean method1554(int arg0, boolean arg1, int[] arg2) {
        field3544++;
        if (!this.method1566(-83, arg0)) {
            return false;
        } else if (this.field3554[arg0] == null) {
            return false;
        } else {
            int var4 = this.field3582.field4536[arg0];
            int[] var5 = this.field3582.field4526[arg0];
            if (this.field3559[arg0] == null) {
                this.field3559[arg0] = new Object[this.field3582.field4527[arg0]];
            }
            boolean var6 = true;
            Object[] var7 = this.field3559[arg0];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            byte[] var10;
            if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
                var10 = class281.method1891(23394, false, this.field3554[arg0]);
            } else {
                var10 = class281.method1891(23394, true, this.field3554[arg0]);
                class224 var11 = new class224(var10);
                var11.method1478(arg2, 5, (byte) 2, var11.field3336.length);
            }
            byte[] var12;
            try {
                var12 = class77.method496(var10, 110);
            } catch (RuntimeException var31) {
                throw class276.method1844(var31, "T3 - " + (arg2 != null) + "," + arg0 + "," + var10.length + "," + class286.method1923(96, var10.length, var10) + "," + class286.method1923(111, var10.length - 2, var10) + "," + this.field3582.field4544[arg0] + "," + this.field3582.field4546);
            }
            if (arg1) {
                field3565 = null;
            }
            if (this.field3563) {
                this.field3554[arg0] = null;
            }
            if (var4 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                class224 var16 = new class224(var12);
                int var17 = var32 - var4 * 4 * var15;
                var16.field3402 = var17;
                int[] var18 = new int[var4];
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var4; var21++) {
                        var20 += var16.method1483((byte) 46);
                        var18[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var4][];
                for (int var23 = 0; var23 < var4; var23++) {
                    var22[var23] = new byte[var18[var23]];
                    var18[var23] = 0;
                }
                var16.field3402 = var17;
                int var24 = 0;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var4; var27++) {
                        var26 += var16.method1483((byte) 46);
                        class115.method775(var12, var24, var22[var27], var18[var27], var26);
                        var24 += var26;
                        var18[var27] += var26;
                    }
                }
                for (int var28 = 0; var28 < var4; var28++) {
                    int var29;
                    if (var5 == null) {
                        var29 = var28;
                    } else {
                        var29 = var5[var28];
                    }
                    if (this.field3570) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class282.method1893(126, var22[var28], false);
                    }
                }
            } else {
                int var30;
                if (var5 == null) {
                    var30 = 0;
                } else {
                    var30 = var5[0];
                }
                if (this.field3570) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class282.method1893(126, var12, false);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V")
    public final void method1555(int arg0, int arg1) {
        field3555++;
        if (arg0 == -22 && this.method1566(-85, arg1) && this.field3559 != null) {
            this.field3559[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1556(int arg0, String arg1) {
        if (arg0 > -67) {
            this.method1554(-96, true, (int[]) null);
        }
        field3547++;
        if (this.method1574(0)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field3582.field4538.method316(-1, class7.method48(var3, 255));
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZZI)V")
    public final void method1557(boolean arg0, boolean arg1, int arg2) {
        field3576++;
        if (!this.method1574(0)) {
            return;
        }
        if (arg1) {
            this.field3582.field4534 = null;
            this.field3582.field4529 = null;
        }
        if (arg0) {
            this.field3582.field4540 = null;
            this.field3582.field4538 = null;
        }
        if (arg2 != 100) {
            this.method1573(-109, 16);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)I")
    public final int method1558(int arg0) {
        field3579++;
        if (arg0 != -23026) {
            method1546(true);
        }
        if (!this.method1574(0)) {
            throw new IllegalStateException("");
        }
        return this.field3582.field4546;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(ILjava/lang/String;)I")
    public final int method1559(int arg0, String arg1) {
        field3539++;
        if (!this.method1574(0)) {
            return 0;
        }
        String var3 = arg1.toLowerCase();
        if (arg0 >= -56) {
            field3569 = null;
        }
        int var4 = this.field3582.field4538.method316(-1, class7.method48(var3, 255));
        return this.method1573(var4, -101);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([IIBI)[B")
    public final byte[] method1560(int[] arg0, int arg1, byte arg2, int arg3) {
        field3580++;
        if (!this.method1571(arg1, 65, arg3)) {
            return null;
        }
        if (arg2 < 19) {
            this.method1554(95, false, (int[]) null);
        }
        if (this.field3559[arg3] == null || this.field3559[arg3][arg1] == null) {
            boolean var5 = this.method1554(arg3, false, arg0);
            if (!var5) {
                this.method1579(arg3, (byte) 49);
                boolean var6 = this.method1554(arg3, false, arg0);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class281.method1891(23394, false, this.field3559[arg3][arg1]);
        if (this.field3570) {
            this.field3559[arg3][arg1] = null;
            if (this.field3582.field4527[arg3] == 1) {
                this.field3559[arg3] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)I")
    public final int method1561(int arg0) {
        if (arg0 != -24367) {
            this.method1580(58, (byte) 11, -115);
        }
        field3549++;
        return this.method1574(0) ? this.field3582.field4527.length : -1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)Z")
    public final boolean method1562(byte arg0) {
        field3567++;
        if (!this.method1574(0)) {
            return false;
        }
        int var2 = -114 % ((arg0 - 27) / 54);
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field3582.field4539.length; var4++) {
            int var5 = this.field3582.field4539[var4];
            if (this.field3554[var5] == null) {
                this.method1579(var5, (byte) 75);
                if (this.field3554[var5] == null) {
                    var3 = false;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
    public static final void method1563(int arg0) {
        field3558++;
        for (int var1 = -1; var1 < class103.field1442; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class205.field2848[var1];
            }
            class88 var3 = class154.field2133[var2];
            if (var3 != null) {
                class74.method473(var3.method561(-1), true, var3);
            }
        }
        if (arg0 != -28328) {
            method1578(90);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)Z")
    public final boolean method1564(int arg0, int arg1, int arg2) {
        field3545++;
        if (!this.method1571(arg2, arg0 ^ 0xFFFFFF99, arg1)) {
            return false;
        } else if (this.field3559[arg1] != null && this.field3559[arg1][arg2] != null) {
            return true;
        } else if (arg0 != 2) {
            return false;
        } else if (this.field3554[arg1] == null) {
            this.method1579(arg1, (byte) 118);
            return this.field3554[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(II)[B")
    public final byte[] method1565(int arg0, int arg1) {
        field3551++;
        if (!this.method1574(0)) {
            return null;
        } else if (this.field3582.field4527.length == 1) {
            return this.method1576(-108, 0, arg0);
        } else if (this.method1566(89, arg0)) {
            int var3 = -54 % ((-arg1 - 44) / 53);
            if (this.field3582.field4527[arg0] != 1) {
                throw new RuntimeException();
            }
            return this.method1576(-58, arg0, 0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(II)Z")
    private final boolean method1566(int arg0, int arg1) {
        field3557++;
        int var3 = 34 / ((arg0 - 36) / 45);
        if (!this.method1574(0)) {
            return false;
        } else if (arg1 >= 0 && this.field3582.field4527.length > arg1 && this.field3582.field4527[arg1] != 0) {
            return true;
        } else if (class71.field993) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)[I")
    public final int[] method1567(byte arg0, int arg1) {
        field3564++;
        if (!this.method1566(-26, arg1)) {
            return null;
        } else if (arg0 <= 61) {
            return null;
        } else {
            int[] var3 = this.field3582.field4526[arg1];
            if (var3 == null) {
                var3 = new int[this.field3582.field4536[arg1]];
                int var4 = 0;
                while (var3.length > var4) {
                    var3[var4] = var4++;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public final int method1568(String arg0, int arg1) {
        field3561++;
        if (!this.method1574(0)) {
            return -1;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != -7551) {
            this.field3554 = null;
        }
        int var4 = this.field3582.field4538.method316(-1, class7.method48(var3, 255));
        return this.method1566(-24, var4) ? var4 : -1;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(BI)V")
    private final void method1569(byte arg0, int arg1) {
        this.field3574.method47(arg1, (byte) 89);
        if (arg0 < -82) {
            field3538++;
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(BI)Z")
    public final boolean method1570(byte arg0, int arg1) {
        field3578++;
        if (!this.method1574(0)) {
            return false;
        } else if (this.field3582.field4527.length == 1) {
            return this.method1564(2, 0, arg1);
        } else if (arg0 != -39) {
            return true;
        } else if (!this.method1566(118, arg1)) {
            return false;
        } else if (this.field3582.field4527[arg1] == 1) {
            return this.method1564(arg0 + 41, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(III)Z")
    private final boolean method1571(int arg0, int arg1, int arg2) {
        int var4 = -63 % ((arg1 - 11) / 35);
        field3540++;
        if (!this.method1574(0)) {
            return false;
        } else if (arg2 >= 0 && arg0 >= 0 && this.field3582.field4527.length > arg2 && this.field3582.field4527[arg2] > arg0) {
            return true;
        } else if (class71.field993) {
            throw new IllegalArgumentException(arg2 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(II)I")
    public static int method1572(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(II)I")
    private final int method1573(int arg0, int arg1) {
        field3575++;
        if (!this.method1566(-30, arg0)) {
            return 0;
        } else if (this.field3554[arg0] == null) {
            int var3 = -26 % ((-arg1 - 45) / 43);
            return this.field3574.method50(arg0, (byte) 117);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)Z")
    private final boolean method1574(int arg0) {
        field3571++;
        if (arg0 != 0) {
            this.field3559 = null;
        }
        if (this.field3582 == null) {
            this.field3582 = this.field3574.method41((byte) 53);
            if (this.field3582 == null) {
                return false;
            }
            this.field3559 = new Object[this.field3582.field4532][];
            this.field3554 = new Object[this.field3582.field4532];
        }
        return true;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIBIIIIIIII)V")
    public static final void method1575(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field3556++;
        int var11 = arg4 - arg10;
        if (class41.field605 > arg4) {
            var11++;
        }
        int var12 = arg9 - arg3;
        if (arg9 < class138.field1929) {
            var12++;
        }
        if (arg2 != -69) {
            return;
        }
        int var10000;
        for (int var13 = 0; var13 < var12; var13++) {
            int var41 = (var13 + 1) * arg1 + arg8 >> 16;
            int var42 = arg1 * var13 + arg8 >> 16;
            int var43 = var41 - var42;
            if (var43 > 0) {
                int var44 = arg3 + var13 >> 6;
                if (var44 >= 0 && (class174.field2446.length - 1) >= var44) {
                    int var45 = arg7 + var41;
                    byte[][] var46 = class253.field3877[var44];
                    int[][] var47 = class174.field2446[var44];
                    byte[][] var48 = class297.field4697[var44];
                    int var49 = arg7 + var42;
                    byte[][] var50 = class123.field1716[var44];
                    byte[][] var51 = class251.field3836[var44];
                    byte[][] var52 = class56.field807[var44];
                    for (int var53 = 0; var53 < var11; var53++) {
                        int var54 = arg6 * var53 + arg0 >> 16;
                        int var55 = (var53 + 1) * arg6 + arg0 >> 16;
                        int var56 = var55 - var54;
                        if (var56 > 0) {
                            int var57 = arg5 + var55;
                            int var58 = arg5 + var54;
                            int var59 = arg10 + var53 >> 6;
                            int var60 = arg10 + var53 & 0x3F;
                            int var61 = arg3 + var13 & 0x3F;
                            int var62 = (var60 << 6) + var61;
                            int var63;
                            if (var59 < 0 || var59 > var47.length - 1 || var47[var59] == null) {
                                if (class210.field3000.field3886 != -1) {
                                    var63 = class210.field3000.field3886;
                                } else if ((arg3 + var13 & 0x4) == (arg10 + var53 & 0x4)) {
                                    var63 = class73.field1000[class76.field1064 + 1];
                                } else {
                                    var63 = 4936552;
                                }
                                if (var59 < 0 || var59 > var47.length - 1) {
                                    if (var63 == 0) {
                                        var63 = 1;
                                    }
                                    class64.method401(var49, var58, var43, var56, var63);
                                    continue;
                                }
                            } else {
                                var63 = var47[var59][var62];
                            }
                            if (var63 == 0) {
                                var63 = 1;
                            }
                            int var64 = var48[var59] == null ? 0 : class73.field1000[var48[var59][var62] & 0xFF];
                            int var65 = var46[var59] == null ? 0 : class73.field1000[var46[var59][var62] & 0xFF];
                            if (var65 == 0 && var64 == 0) {
                                class64.method401(var49, var58, var43, var56, var63);
                            } else {
                                if (var65 != 0) {
                                    byte var66 = var51[var59] == null ? 0 : var51[var59][var62];
                                    int var67 = var66 & 0xFC;
                                    if (var65 == -1) {
                                        var65 = 1;
                                    }
                                    if (var67 == 0 || var43 <= 1 || var56 <= 1) {
                                        class64.method401(var49, var58, var43, var56, var65);
                                    } else {
                                        class9.method62(var56, var65, var58, true, var67 >> 2, (byte) 97, var63, var49, var43, var66 & 0x3, class64.field881);
                                    }
                                }
                                if (var64 != 0) {
                                    if (var64 == -1) {
                                        var64 = var63;
                                    }
                                    byte var68 = var50[var59][var62];
                                    int var69 = var68 & 0xFC;
                                    if (var69 == 0 || var43 <= 1 || var56 <= 1) {
                                        class64.method401(var49, var58, var43, var56, var64);
                                    }
                                    class9.method62(var56, var64, var58, var65 == 0, var69 >> 2, (byte) 114, 0, var49, var43, var68 & 0x3, class64.field881);
                                }
                            }
                            if (var52[var59] != null) {
                                int var70 = var52[var59][var62] & 0xFF;
                                if (var70 != 0) {
                                    int var71;
                                    if (var56 == 1) {
                                        var71 = var58;
                                    } else {
                                        var71 = var57 - 1;
                                    }
                                    int var72;
                                    if (var43 == 1) {
                                        var72 = var49;
                                    } else {
                                        var72 = var45 - 1;
                                    }
                                    int var73 = 13421772;
                                    if (var70 >= 5 && var70 <= 8 || var70 >= 13 && var70 <= 16 || var70 >= 21 && var70 <= 24 || var70 == 27 || var70 == 28) {
                                        var70 -= 4;
                                        var73 = 13369344;
                                    }
                                    if (var70 == 1) {
                                        class64.method388(var49, var58, var56, var73);
                                    } else if (var70 == 2) {
                                        class64.method396(var49, var58, var43, var73);
                                    } else if (var70 == 3) {
                                        class64.method388(var72, var58, var56, var73);
                                    } else if (var70 == 4) {
                                        class64.method396(var49, var71, var43, var73);
                                    } else if (var70 == 9) {
                                        class64.method388(var49, var58, var56, 16777215);
                                        class64.method396(var49, var58, var43, var73);
                                    } else if (var70 == 10) {
                                        class64.method388(var72, var58, var56, 16777215);
                                        class64.method396(var49, var58, var43, var73);
                                    } else if (var70 == 11) {
                                        class64.method388(var72, var58, var56, 16777215);
                                        class64.method396(var49, var71, var43, var73);
                                    } else if (var70 == 12) {
                                        class64.method388(var49, var58, var56, 16777215);
                                        class64.method396(var49, var71, var43, var73);
                                    } else if (var70 == 17) {
                                        class64.method396(var49, var58, 1, var73);
                                    } else if (var70 == 18) {
                                        class64.method396(var72, var58, 1, var73);
                                    } else if (var70 == 19) {
                                        class64.method396(var72, var71, 1, var73);
                                    } else if (var70 == 20) {
                                        class64.method396(var49, var71, 1, var73);
                                    } else if (var70 == 25) {
                                        for (int var74 = 0; var74 < var56; var74++) {
                                            class64.method396(var49 + var74, -var74 + var71, 1, var73);
                                        }
                                    } else if (var70 == 26) {
                                        for (int var75 = 0; var75 < var56; var75++) {
                                            class64.method396(var49 + var75, var58 + var75, 1, var73);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg7 + var41;
                    int var77 = arg7 + var42;
                    for (int var78 = 0; var78 < var11; var78++) {
                        int var79;
                        if (class210.field3000.field3886 != -1) {
                            var79 = class210.field3000.field3886;
                        } else if ((var78 + arg10 & 0x4) == (arg3 + var13 & 0x4)) {
                            var79 = class73.field1000[class76.field1064 + 1];
                        } else {
                            var79 = 4936552;
                        }
                        int var80 = (arg0 + ((var78 + 1) * arg6) >> 16) + arg5;
                        if (var79 == 0) {
                            var79 = 1;
                        }
                        int var81 = (arg6 * var78 + arg0 >> 16) + arg5;
                        int var82 = var80 - var81;
                        class64.method401(var77, var81, var43, var82, var79);
                    }
                }
            }
        }
        for (int var14 = -2; var14 < (var12 + 2); var14++) {
            int var15 = (var14 + 1) * arg1 + arg8 >> 16;
            int var16 = arg8 + (arg1 * var14) >> 16;
            int var17 = var15 - var16;
            if (var17 > 0) {
                var10000 = arg7 + var15;
                int var19 = arg7 + var16;
                int var20 = arg3 + var14 >> 6;
                if (var20 >= 0 && var20 <= (class34.field531.length - 1)) {
                    int[][] var21 = class34.field531[var20];
                    for (int var22 = -2; var22 < var11 + 2; var22++) {
                        int var23 = arg6 * var22 + arg0 >> 16;
                        int var24 = (var22 + 1) * arg6 + arg0 >> 16;
                        int var25 = var24 - var23;
                        if (var25 > 0) {
                            var10000 = arg5 + var24;
                            int var27 = arg10 + var22 >> 6;
                            int var28 = arg5 + var23;
                            if (var27 >= 0 && var21.length - 1 >= var27) {
                                int var29 = (arg10 + var22 & 0x3F << 6) + (arg3 + var14 & 0x3F);
                                if (var21[var27] != null) {
                                    int var30 = var21[var27][var29];
                                    int var31 = var30 & 0x1FFF;
                                    if (var31 != 0) {
                                        class40 var32 = class87.method547(false, var31 - 1);
                                        int var33 = (var30 & 0x78DB) >> 13;
                                        boolean var34 = (var30 & 0xA2FC) >> 15 == 1;
                                        class72 var35 = var32.method266((byte) 1, var33, var34);
                                        if (var35 != null) {
                                            int var36 = var35.field2611 * var17 / 4;
                                            int var37 = var35.field2609 * var25 / 4;
                                            if (var32.field601) {
                                                int var38 = var30 >> 16 & 0xF;
                                                int var39 = var30 >> 20 & 0xF;
                                                if ((var33 & 0x1) == 1) {
                                                    int var40 = var38;
                                                    var38 = var39;
                                                    var39 = var40;
                                                }
                                                var37 = var25 * var39;
                                                var36 = var17 * var38;
                                            }
                                            if (var36 != 0 && var37 != 0) {
                                                if (var32.field598 == 0) {
                                                    var35.method454(var19, var25 + var28 - var37, var36, var37);
                                                } else {
                                                    var35.method451(var19, var28 + var25 - var37, var36, var37, var32.field598);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(III)[B")
    public final byte[] method1576(int arg0, int arg1, int arg2) {
        if (arg0 >= -34) {
            field3568 = -42;
        }
        field3546++;
        return this.method1560((int[]) null, arg2, (byte) 108, arg1);
    }

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "(II)I")
    public final int method1577(int arg0, int arg1) {
        field3552++;
        if (this.method1566(-78, arg0)) {
            if (arg1 != -6339) {
                this.method1564(126, -31, 64);
            }
            return this.field3582.field4527[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)V")
    public static final void method1578(int arg0) {
        int var1 = 28 / ((86 - arg0) / 35);
        field3560++;
        class231.field3497.method544(false);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)V")
    private final void method1579(int arg0, byte arg1) {
        field3562++;
        if (arg1 < 5) {
            this.method1576(83, -48, 2);
        }
        if (this.field3563) {
            this.field3554[arg0] = this.field3574.method44(arg0, 115);
        } else {
            this.field3554[arg0] = class282.method1893(-62, this.field3574.method44(arg0, 65), false);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IBI)[B")
    public final byte[] method1580(int arg0, byte arg1, int arg2) {
        field3548++;
        if (!this.method1571(arg2, -61, arg0)) {
            return null;
        }
        if (this.field3559[arg0] == null || this.field3559[arg0][arg2] == null) {
            boolean var4 = this.method1554(arg0, false, (int[]) null);
            if (!var4) {
                this.method1579(arg0, (byte) 54);
                boolean var5 = this.method1554(arg0, false, (int[]) null);
                if (!var5) {
                    return null;
                }
            }
        }
        byte[] var6 = class281.method1891(23394, false, this.field3559[arg0][arg2]);
        if (arg1 > -109) {
            field3584 = -89;
        }
        return var6;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZ)Z")
    public final boolean method1581(int arg0, boolean arg1) {
        field3573++;
        if (!this.method1566(88, arg0)) {
            return false;
        }
        if (arg1) {
            this.field3559 = null;
        }
        if (this.field3554[arg0] == null) {
            this.method1579(arg0, (byte) 115);
            return this.field3554[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lbh;ZZ)V")
    public class235(class7 arg0, boolean arg1, boolean arg2) {
        this.field3570 = arg2;
        this.field3563 = arg1;
        this.field3574 = arg0;
    }
}
