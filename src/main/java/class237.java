import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class237 {

    @OriginalMember(owner = "client!pk", name = "t", descriptor = "Lch;")
    private class97 field3655 = null;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "Z")
    private boolean field3663;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "Z")
    private boolean field3637;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "Lkh;")
    private class146 field3636;

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "Lhl;")
    public static class139 field3673 = new class139(50);

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "Ljava/lang/String;")
    public static String field3677 = "wave:";

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field3640;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!pk", name = "r", descriptor = "I")
    public static int field3653;

    @OriginalMember(owner = "client!pk", name = "s", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!pk", name = "u", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!pk", name = "v", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!pk", name = "w", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!pk", name = "x", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!pk", name = "y", descriptor = "I")
    public static int field3660;

    @OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!pk", name = "A", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!pk", name = "C", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!pk", name = "D", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!pk", name = "F", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!pk", name = "H", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "[Ljava/lang/Object;")
    private Object[] field3639;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3675;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(II)Z")
    private final boolean method1598(int arg0, int arg1) {
        field3676++;
        if (!this.method1604((byte) 63)) {
            return false;
        }
        if (arg1 != -1) {
            this.field3639 = null;
        }
        if (arg0 >= 0 && this.field3655.field1442.length > arg0 && this.field3655.field1442[arg0] != 0) {
            return true;
        } else if (class177.field2603) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)I")
    public final int method1599(int arg0) {
        field3664++;
        if (!this.method1604((byte) 63)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = arg0; var4 < this.field3639.length; var4++) {
            if (this.field3655.field1431[var4] > 0) {
                var3 += 100;
                var2 += this.method1602(var4, 100);
            }
        }
        if (var3 == 0) {
            return 100;
        } else {
            return var2 * 100 / var3;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "([IBI)Z")
    private final boolean method1600(int[] arg0, byte arg1, int arg2) {
        field3653++;
        if (!this.method1598(arg2, -1)) {
            return false;
        } else if (this.field3639[arg2] == null) {
            return false;
        } else {
            int var4 = this.field3655.field1431[arg2];
            int[] var5 = this.field3655.field1445[arg2];
            if (this.field3675[arg2] == null) {
                this.field3675[arg2] = new Object[this.field3655.field1442[arg2]];
            }
            Object[] var6 = this.field3675[arg2];
            boolean var7 = true;
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var6[var9] == null) {
                    var7 = false;
                    break;
                }
            }
            if (var7) {
                return true;
            }
            byte[] var10;
            if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
                var10 = class23.method158(false, this.field3639[arg2], 27155);
            } else {
                var10 = class23.method158(true, this.field3639[arg2], 27155);
                class54 var11 = new class54(var10);
                var11.method441(arg0, 5, 673756677, var11.field848.length);
            }
            if (arg1 > -82) {
                this.field3639 = null;
            }
            byte[] var12;
            try {
                var12 = class200.method1337(-1, var10);
            } catch (RuntimeException var31) {
                throw class280.method1862(var31, "T3 - " + (arg0 != null) + "," + arg2 + "," + var10.length + "," + class66.method530(var10.length, false, var10) + "," + class66.method530(var10.length - 2, false, var10) + "," + this.field3655.field1434[arg2] + "," + this.field3655.field1425);
            }
            if (this.field3663) {
                this.field3639[arg2] = null;
            }
            if (var4 <= 1) {
                int var14;
                if (var5 == null) {
                    var14 = 0;
                } else {
                    var14 = var5[0];
                }
                if (this.field3637) {
                    var6[var14] = var12;
                } else {
                    var6[var14] = class220.method1514(var12, false, 10581);
                }
            } else {
                int var15 = var12.length;
                int var32 = var15 - 1;
                int var16 = var12[var32] & 0xFF;
                class54 var17 = new class54(var12);
                int var18 = var32 - var4 * var16 * 4;
                var17.field887 = var18;
                int[] var19 = new int[var4];
                for (int var20 = 0; var20 < var16; var20++) {
                    int var21 = 0;
                    for (int var22 = 0; var22 < var4; var22++) {
                        var21 += var17.method420((byte) -95);
                        var19[var22] += var21;
                    }
                }
                byte[][] var23 = new byte[var4][];
                for (int var24 = 0; var24 < var4; var24++) {
                    var23[var24] = new byte[var19[var24]];
                    var19[var24] = 0;
                }
                var17.field887 = var18;
                int var25 = 0;
                for (int var26 = 0; var26 < var16; var26++) {
                    int var27 = 0;
                    for (int var28 = 0; var28 < var4; var28++) {
                        var27 += var17.method420((byte) -90);
                        class41.method335(var12, var25, var23[var28], var19[var28], var27);
                        var19[var28] += var27;
                        var25 += var27;
                    }
                }
                for (int var29 = 0; var29 < var4; var29++) {
                    int var30;
                    if (var5 == null) {
                        var30 = var29;
                    } else {
                        var30 = var5[var29];
                    }
                    if (this.field3637) {
                        var6[var30] = var23[var29];
                    } else {
                        var6[var30] = class220.method1514(var23[var29], false, 10581);
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)[B")
    public final byte[] method1601(int arg0, int arg1, int arg2) {
        field3674++;
        if (!this.method1624(arg0, arg2, 0)) {
            return null;
        }
        if (arg1 <= 123) {
            this.field3637 = true;
        }
        if (this.field3675[arg0] == null || this.field3675[arg0][arg2] == null) {
            boolean var4 = this.method1600((int[]) null, (byte) -128, arg0);
            if (!var4) {
                this.method1630(true, arg0);
                boolean var5 = this.method1600((int[]) null, (byte) -106, arg0);
                if (!var5) {
                    return null;
                }
            }
        }
        return class23.method158(false, this.field3675[arg0][arg2], 27155);
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(II)I")
    private final int method1602(int arg0, int arg1) {
        if (arg1 != 100) {
            this.method1625(1, (int[]) null, (byte) 57, 104);
        }
        field3672++;
        if (this.method1598(arg0, -1)) {
            return this.field3639[arg0] == null ? this.field3636.method495(arg0, false) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)I")
    public final int method1603(int arg0) {
        if (arg0 == -1) {
            field3661++;
            return this.method1604((byte) 63) ? this.field3655.field1442.length : -1;
        } else {
            return -110;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)Z")
    private final boolean method1604(byte arg0) {
        field3642++;
        if (this.field3655 == null) {
            this.field3655 = this.field3636.method494((byte) 0);
            if (this.field3655 == null) {
                return false;
            }
            this.field3639 = new Object[this.field3655.field1429];
            this.field3675 = new Object[this.field3655.field1429][];
        }
        if (arg0 != 63) {
            field3673 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(III)[B")
    public final byte[] method1605(int arg0, int arg1, int arg2) {
        field3658++;
        if (arg0 > -123) {
            this.field3639 = null;
        }
        return this.method1625(arg1, (int[]) null, (byte) -114, arg2);
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(II)V")
    private final void method1606(int arg0, int arg1) {
        field3646++;
        if (arg0 <= 17) {
            this.field3637 = false;
        }
        this.field3636.method505(arg1, (byte) 14);
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V")
    public final void method1607(int arg0) {
        if (this.field3675 != null) {
            for (int var2 = 0; var2 < this.field3675.length; var2++) {
                this.field3675[var2] = null;
            }
        }
        field3666++;
        if (arg0 != 0) {
            this.method1613((String) null, (byte) 47);
        }
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)V")
    public static void method1608(int arg0) {
        field3677 = null;
        if (arg0 == -9648) {
            field3673 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZII)Z")
    public final boolean method1609(boolean arg0, int arg1, int arg2) {
        field3643++;
        if (!this.method1624(arg1, arg2, 0)) {
            return false;
        } else if (this.field3675[arg1] == null || this.field3675[arg1][arg2] == null) {
            if (arg0) {
                this.field3639 = null;
            }
            if (this.field3639[arg1] == null) {
                this.method1630(true, arg1);
                return this.field3639[arg1] != null;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZZZ)V")
    public final void method1610(boolean arg0, boolean arg1, boolean arg2) {
        field3656++;
        if (!this.method1604((byte) 63)) {
            return;
        }
        if (arg1) {
            this.field3655.field1430 = null;
            this.field3655.field1428 = null;
        }
        if (!arg0 && arg2) {
            this.field3655.field1443 = null;
            this.field3655.field1440 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method1611(int arg0, String arg1) {
        if (arg0 != -1) {
            this.field3655 = null;
        }
        field3645++;
        if (this.method1604((byte) 63)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field3655.field1443.method631(class226.method1546(var3, 0), (byte) -50);
            return this.method1626(arg0 + 117, var4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method1612(String arg0, int arg1) {
        field3657++;
        if (this.method1604((byte) 63)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field3655.field1443.method631(class226.method1546(var3, 0), (byte) -50);
            int var5 = -108 % ((arg1 - 30) / 40);
            this.method1606(121, var4);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method1613(String arg0, byte arg1) {
        field3640++;
        if (!this.method1604((byte) 63)) {
            return 0;
        } else if (arg1 == 111) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field3655.field1443.method631(class226.method1546(var3, 0), (byte) -50);
            return this.method1602(var4, arg1 ^ 0xB);
        } else {
            return -27;
        }
    }

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(II)I")
    public final int method1614(int arg0, int arg1) {
        field3662++;
        if (arg0 == 0) {
            return this.method1598(arg1, -1) ? this.field3655.field1442[arg1] : 0;
        } else {
            return 21;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
    public final byte[] method1615(String arg0, String arg1, int arg2) {
        field3665++;
        if (!this.method1604((byte) 63)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field3655.field1443.method631(class226.method1546(var4, arg2 ^ arg2), (byte) -50);
        if (this.method1598(var6, -1)) {
            int var7 = this.field3655.field1428[var6].method631(class226.method1546(var5, 0), (byte) -50);
            return this.method1605(-126, var7, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)I")
    public final int method1616(boolean arg0) {
        field3667++;
        if (!this.method1604((byte) 63)) {
            throw new IllegalStateException("");
        }
        if (arg0) {
            this.method1604((byte) 103);
        }
        return this.field3655.field1425;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IBI)Ljk;")
    public static final class297 method1617(int arg0, byte arg1, int arg2) {
        class297 var3 = class151.method1023(arg1 - 30527, arg2);
        if (arg1 != 63) {
            return null;
        }
        field3660++;
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field4646 == null || arg0 >= var3.field4646.length) {
            return null;
        } else {
            return var3.field4646[arg0];
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILbk;)V")
    public static final void method1618(int arg0, class46 arg1) {
        field3670++;
        int var2 = 117 / ((arg0 - 65) / 61);
        short var3 = 256;
        for (int var4 = 0; var4 < class221.field3446.length; var4++) {
            class221.field3446[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; var5++) {
            int var17 = (int) ((double) var3 * Math.random() * 128.0D);
            class221.field3446[var17] = (int) (Math.random() * 284.0D);
        }
        for (int var6 = 0; var6 < 20; var6++) {
            for (int var13 = 1; var13 < (var3 - 1); var13++) {
                for (int var15 = 1; var15 < 127; var15++) {
                    int var16 = (var13 << 7) + var15;
                    class160.field2333[var16] = (class221.field3446[var16 + 128] + class221.field3446[var16 + 1] + class221.field3446[var16 + -1] + class221.field3446[var16 + -128]) / 4;
                }
            }
            int[] var14 = class221.field3446;
            class221.field3446 = class160.field2333;
            class160.field2333 = var14;
        }
        if (arg1 == null) {
            return;
        }
        int var7 = 0;
        for (int var8 = 0; var8 < arg1.field3545; var8++) {
            for (int var9 = 0; var9 < arg1.field3546; var9++) {
                if (arg1.field786[var7++] != 0) {
                    int var10 = arg1.field3539 + var9 + 16;
                    int var11 = var8 + arg1.field3543 + 16;
                    int var12 = (var11 << 7) + var10;
                    class221.field3446[var12] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)I")
    public static final int method1619(byte arg0) {
        class146.field2118 = 0;
        field3668++;
        return arg0 >= -72 ? -48 : class75.method603(15051);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZI)[B")
    public final byte[] method1620(boolean arg0, int arg1) {
        field3649++;
        if (arg0) {
            this.method1611(21, (String) null);
        }
        if (!this.method1604((byte) 63)) {
            return null;
        } else if (this.field3655.field1442.length == 1) {
            return this.method1605(-128, arg1, 0);
        } else if (!this.method1598(arg1, -1)) {
            return null;
        } else if (this.field3655.field1442[arg1] == 1) {
            return this.method1605(-125, 0, arg1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public final int method1621(String arg0, int arg1) {
        field3652++;
        if (this.method1604((byte) 63)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field3655.field1443.method631(class226.method1546(var3, arg1 ^ arg1), (byte) -50);
            return this.method1598(var4, -1) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method1622(String arg0, int arg1) {
        if (arg1 != -1) {
            this.method1599(121);
        }
        field3669++;
        if (this.method1604((byte) 63)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field3655.field1443.method631(class226.method1546(var3, 0), (byte) -50);
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "(II)V")
    public final void method1623(int arg0, int arg1) {
        field3641++;
        if (!this.method1598(arg1, -1)) {
            return;
        }
        if (this.field3675 != null) {
            this.field3675[arg1] = null;
        }
        if (arg0 != 0) {
            this.field3663 = true;
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(III)Z")
    private final boolean method1624(int arg0, int arg1, int arg2) {
        field3671++;
        if (!this.method1604((byte) 63)) {
            return false;
        } else if (arg2 <= arg0 && arg1 >= 0 && this.field3655.field1442.length > arg0 && arg1 < this.field3655.field1442[arg0]) {
            return true;
        } else if (class177.field2603) {
            throw new IllegalArgumentException(arg0 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I[IBI)[B")
    public final byte[] method1625(int arg0, int[] arg1, byte arg2, int arg3) {
        field3650++;
        if (!this.method1624(arg3, arg0, 0)) {
            return null;
        }
        if (this.field3675[arg3] == null || this.field3675[arg3][arg0] == null) {
            boolean var5 = this.method1600(arg1, (byte) -116, arg3);
            if (!var5) {
                this.method1630(true, arg3);
                boolean var6 = this.method1600(arg1, (byte) -97, arg3);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class23.method158(false, this.field3675[arg3][arg0], 27155);
        if (this.field3637) {
            this.field3675[arg3][arg0] = null;
            if (this.field3655.field1442[arg3] == 1) {
                this.field3675[arg3] = null;
            }
        }
        if (arg2 >= -63) {
            this.field3663 = false;
        }
        return var7;
    }

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "(II)Z")
    public final boolean method1626(int arg0, int arg1) {
        if (arg0 <= 33) {
            method1617(-95, (byte) 20, 92);
        }
        field3644++;
        if (!this.method1598(arg1, -1)) {
            return false;
        } else if (this.field3639[arg1] == null) {
            this.method1630(true, arg1);
            return this.field3639[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
    public final boolean method1627(int arg0, String arg1, String arg2) {
        field3638++;
        if (!this.method1604((byte) 63)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field3655.field1443.method631(class226.method1546(var4, 0), (byte) -50);
        if (!this.method1598(var6, -1)) {
            return false;
        }
        if (arg0 != 1) {
            this.field3663 = false;
        }
        int var7 = this.field3655.field1428[var6].method631(class226.method1546(var5, 0), (byte) -50);
        return this.method1609(false, var6, var7);
    }

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "(I)Z")
    public final boolean method1628(int arg0) {
        field3651++;
        if (!this.method1604((byte) 63)) {
            return false;
        }
        int var2 = 74 / ((arg0 - 5) / 44);
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field3655.field1422.length; var4++) {
            int var5 = this.field3655.field1422[var4];
            if (this.field3639[var5] == null) {
                this.method1630(true, var5);
                if (this.field3639[var5] == null) {
                    var3 = false;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "(II)Z")
    public final boolean method1629(int arg0, int arg1) {
        field3647++;
        if (!this.method1604((byte) 63)) {
            return false;
        } else if (this.field3655.field1442.length == 1) {
            return this.method1609(false, 0, arg0);
        } else if (this.method1598(arg0, -1)) {
            if (arg1 != 0) {
                this.method1600((int[]) null, (byte) 114, 94);
            }
            if (this.field3655.field1442[arg0] != 1) {
                throw new RuntimeException();
            }
            return this.method1609(false, arg0, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(ZI)V")
    private final void method1630(boolean arg0, int arg1) {
        if (!arg0) {
            return;
        }
        if (this.field3663) {
            this.field3639[arg1] = this.field3636.method496(arg1, 0);
        } else {
            this.field3639[arg1] = class220.method1514(this.field3636.method496(arg1, 0), false, 10581);
        }
        field3648++;
    }

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "(II)V")
    public static final void method1631(int arg0, int arg1) {
        if (~class287.field4391 == arg0) {
            class148.field2151.method1425(0, arg1);
        } else {
            class181.field2643 = arg1;
        }
        field3659++;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)[I")
    public final int[] method1632(int arg0, byte arg1) {
        field3654++;
        if (!this.method1598(arg0, -1)) {
            return null;
        } else if (arg1 > -37) {
            return null;
        } else {
            int[] var3 = this.field3655.field1445[arg0];
            if (var3 == null) {
                var3 = new int[this.field3655.field1431[arg0]];
                int var4 = 0;
                while (var4 < var3.length) {
                    var3[var4] = var4++;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lkh;ZZ)V")
    public class237(class146 arg0, boolean arg1, boolean arg2) {
        this.field3663 = arg1;
        this.field3637 = arg2;
        this.field3636 = arg0;
    }
}
