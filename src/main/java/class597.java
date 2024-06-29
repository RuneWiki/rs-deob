import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class597 {

    @OriginalMember(owner = "client!dda", name = "s", descriptor = "Lvm;")
    private class386 field8803 = null;

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "I")
    public int field8794;

    @OriginalMember(owner = "client!dda", name = "G", descriptor = "Z")
    private boolean field8817;

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "Lnq;")
    private class598 field8788;

    @OriginalMember(owner = "client!dda", name = "C", descriptor = "F")
    public static float field8813;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "I")
    public static int field8785;

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "I")
    public static int field8786;

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "I")
    public static int field8789;

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "I")
    public static int field8790;

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "I")
    public static int field8791;

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "I")
    public static int field8792;

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!dda", name = "k", descriptor = "I")
    public static int field8795;

    @OriginalMember(owner = "client!dda", name = "l", descriptor = "I")
    public static int field8796;

    @OriginalMember(owner = "client!dda", name = "m", descriptor = "I")
    public static int field8797;

    @OriginalMember(owner = "client!dda", name = "n", descriptor = "I")
    public static int field8798;

    @OriginalMember(owner = "client!dda", name = "o", descriptor = "I")
    public static int field8799;

    @OriginalMember(owner = "client!dda", name = "p", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!dda", name = "q", descriptor = "I")
    public static int field8801;

    @OriginalMember(owner = "client!dda", name = "r", descriptor = "I")
    public static int field8802;

    @OriginalMember(owner = "client!dda", name = "t", descriptor = "I")
    public static int field8804;

    @OriginalMember(owner = "client!dda", name = "u", descriptor = "I")
    public static int field8805;

    @OriginalMember(owner = "client!dda", name = "v", descriptor = "I")
    public static int field8806;

    @OriginalMember(owner = "client!dda", name = "w", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!dda", name = "x", descriptor = "I")
    public static int field8808;

    @OriginalMember(owner = "client!dda", name = "y", descriptor = "I")
    public static int field8809;

    @OriginalMember(owner = "client!dda", name = "z", descriptor = "I")
    public static int field8810;

    @OriginalMember(owner = "client!dda", name = "A", descriptor = "I")
    public static int field8811;

    @OriginalMember(owner = "client!dda", name = "B", descriptor = "I")
    public static int field8812;

    @OriginalMember(owner = "client!dda", name = "D", descriptor = "I")
    public static int field8814;

    @OriginalMember(owner = "client!dda", name = "F", descriptor = "I")
    public static int field8816;

    @OriginalMember(owner = "client!dda", name = "H", descriptor = "I")
    public static int field8818;

    @OriginalMember(owner = "client!dda", name = "I", descriptor = "I")
    public static int field8819;

    @OriginalMember(owner = "client!dda", name = "J", descriptor = "I")
    public static int field8820;

    @OriginalMember(owner = "client!dda", name = "K", descriptor = "I")
    public static int field8821;

    @OriginalMember(owner = "client!dda", name = "M", descriptor = "I")
    public static int field8823;

    @OriginalMember(owner = "client!dda", name = "N", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!dda", name = "O", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "Lha;")
    public static class116 field8787;

    @OriginalMember(owner = "client!dda", name = "E", descriptor = "[Ljava/lang/Object;")
    private Object[] field8815;

    @OriginalMember(owner = "client!dda", name = "L", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field8822;

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method3460(int arg0, String arg1) {
        field8800++;
        if (!this.method3487(87)) {
            return;
        }
        if (arg0 != -1) {
            this.field8817 = true;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field8803.field5642.method1823(class86.method501(var3, (byte) 121), true);
        this.method3485(arg0 + 3, var4);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(III)Z")
    public final boolean method3461(int arg0, int arg1, int arg2) {
        field8791++;
        if (arg2 != 0) {
            return false;
        } else if (!this.method3470(arg2 + 96, arg0, arg1)) {
            return false;
        } else if (this.field8822[arg0] != null && this.field8822[arg0][arg1] != null) {
            return true;
        } else if (this.field8815[arg0] == null) {
            this.method3492(2, arg0);
            return this.field8815[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(II)I")
    public final int method3462(int arg0, int arg1) {
        int var3 = 52 / ((arg1 + 10) / 37);
        field8808++;
        return this.method3464(arg0, 100) ? this.field8803.field5649[arg0] : 0;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method3463(String arg0, int arg1) {
        field8816++;
        if (!this.method3487(90)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 < 35) {
            this.method3489(-31, 29);
        }
        int var4 = this.field8803.field5642.method1823(class86.method501(var3, (byte) 124), true);
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(II)Z")
    private final boolean method3464(int arg0, int arg1) {
        field8785++;
        if (!this.method3487(105)) {
            return false;
        } else if (arg0 >= 0 && this.field8803.field5649.length > arg0 && this.field8803.field5649[arg0] != 0) {
            if (arg1 != 100) {
                this.field8803 = null;
            }
            return true;
        } else if (class281.field4168) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(II)[I")
    public final int[] method3465(int arg0, int arg1) {
        field8812++;
        if (!this.method3464(arg1, 100)) {
            return null;
        }
        int[] var3 = this.field8803.field5657[arg1];
        if (arg0 != 0) {
            return null;
        }
        if (var3 == null) {
            var3 = new int[this.field8803.field5648[arg1]];
            int var4 = 0;
            while (var4 < var3.length) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
    public final byte[] method3466(String arg0, int arg1, String arg2) {
        field8799++;
        if (!this.method3487(86)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field8803.field5642.method1823(class86.method501(var4, (byte) 125), true);
        if (!this.method3464(var6, 100)) {
            return null;
        }
        if (arg1 != 0) {
            field8813 = 0.8211475F;
        }
        int var7 = this.field8803.field5659[var6].method1823(class86.method501(var5, (byte) 120), true);
        return this.method3486((byte) -85, var7, var6);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(I)I")
    public final int method3467(int arg0) {
        field8820++;
        if (arg0 != -19739) {
            this.field8788 = null;
        }
        if (!this.method3487(arg0 + 19820)) {
            throw new IllegalStateException("");
        }
        return this.field8803.field5647;
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(I)Z")
    public final boolean method3468(int arg0) {
        field8825++;
        if (!this.method3487(107)) {
            return false;
        }
        if (arg0 != -1) {
            this.field8803 = null;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field8803.field5650.length; var3++) {
            int var4 = this.field8803.field5650[var3];
            if (this.field8815[var4] == null) {
                this.method3492(arg0 + 3, var4);
                if (this.field8815[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "(II)[B")
    public final byte[] method3469(int arg0, int arg1) {
        field8805++;
        if (!this.method3487(82)) {
            return null;
        } else if (this.field8803.field5649.length == 1) {
            return this.method3486((byte) -66, arg0, 0);
        } else if (!this.method3464(arg0, 100)) {
            return null;
        } else if (this.field8803.field5649[arg0] == 1) {
            return this.method3486((byte) -70, 0, arg0);
        } else if (arg1 <= 105) {
            return null;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(III)Z")
    private final boolean method3470(int arg0, int arg1, int arg2) {
        field8818++;
        if (arg0 < 38) {
            this.field8815 = null;
        }
        if (!this.method3487(106)) {
            return false;
        } else if (arg1 >= 0 && arg2 >= 0 && this.field8803.field5649.length > arg1 && this.field8803.field5649[arg1] > arg2) {
            return true;
        } else if (class281.field4168) {
            throw new IllegalArgumentException(arg1 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(Ljava/lang/String;I)I")
    public final int method3471(String arg0, int arg1) {
        field8804++;
        if (!this.method3487(83)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 == 0) {
            int var4 = this.field8803.field5642.method1823(class86.method501(var3, (byte) 119), true);
            return this.method3489(arg1 + 100, var4);
        } else {
            return 28;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
    public final boolean method3472(String arg0, String arg1, byte arg2) {
        field8790++;
        if (!this.method3487(99)) {
            return false;
        }
        if (arg2 != -59) {
            this.field8822 = null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field8803.field5642.method1823(class86.method501(var4, (byte) 127), true);
        if (this.method3464(var6, 100)) {
            int var7 = this.field8803.field5659[var6].method1823(class86.method501(var5, (byte) 122), true);
            return this.method3461(var6, var7, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "([IIII)[B")
    public final byte[] method3473(int[] arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -2) {
            this.field8822 = null;
        }
        field8795++;
        if (!this.method3470(94, arg2, arg3)) {
            return null;
        }
        if (this.field8822[arg2] == null || this.field8822[arg2][arg3] == null) {
            boolean var5 = this.method3490(arg3, arg2, arg0, arg1 ^ 0x70F);
            if (!var5) {
                this.method3492(arg1 ^ 0xFFFFFFFC, arg2);
                boolean var6 = this.method3490(arg3, arg2, arg0, -1807);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class568.method3317(this.field8822[arg2][arg3], (byte) 51, false);
        if (this.field8794 == 1) {
            this.field8822[arg2][arg3] = null;
            if (this.field8803.field5649[arg2] == 1) {
                this.field8822[arg2] = null;
            }
        } else if (this.field8794 == 2) {
            this.field8822[arg2] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!dda", name = "e", descriptor = "(II)Z")
    public final boolean method3474(int arg0, int arg1) {
        if (arg0 >= -38) {
            this.field8803 = null;
        }
        field8789++;
        if (!this.method3464(arg1, 100)) {
            return false;
        } else if (this.field8815[arg1] == null) {
            this.method3492(2, arg1);
            return this.field8815[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "(II)I")
    public final int method3475(int arg0, int arg1) {
        field8811++;
        if (!this.method3487(91)) {
            return -1;
        }
        int var3 = this.field8803.field5642.method1823(arg0, true);
        if (this.method3464(var3, arg1 ^ 0xFFFFFF9B)) {
            return arg1 == -1 ? var3 : -68;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method3476(int arg0, String arg1) {
        if (arg0 != 100) {
            this.method3474(-97, -27);
        }
        field8806++;
        if (this.method3487(85)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field8803.field5642.method1823(class86.method501(var3, (byte) 120), true);
            return this.method3474(-101, var4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Z)I")
    public final int method3477(boolean arg0) {
        field8801++;
        if (arg0) {
            this.field8788 = null;
        }
        return this.method3487(117) ? this.field8803.field5649.length : -1;
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(ILjava/lang/String;)I")
    public final int method3478(int arg0, String arg1) {
        if (arg0 != -1) {
            this.field8803 = null;
        }
        field8807++;
        if (this.method3487(109)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field8803.field5642.method1823(class86.method501(var3, (byte) 119), true);
            return this.method3464(var4, 100) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(I)I")
    public final int method3479(int arg0) {
        field8814++;
        if (!this.method3487(120)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = arg0; var4 < this.field8815.length; var4++) {
            if (this.field8803.field5648[var4] > 0) {
                var2 += 100;
                var3 += this.method3489(arg0 + 100, var4);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZI)V")
    public final void method3480(boolean arg0, int arg1) {
        field8797++;
        if (arg0 && this.method3464(arg1, 100) && this.field8822 != null) {
            this.field8822[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(B)V")
    public static void method3481(byte arg0) {
        if (arg0 >= 71) {
            field8787 = null;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(ZIZ)V")
    public final void method3482(boolean arg0, int arg1, boolean arg2) {
        field8793++;
        if (!this.method3487(70)) {
            return;
        }
        if (arg0) {
            this.field8803.field5651 = null;
            this.field8803.field5659 = null;
        }
        if (arg2) {
            this.field8803.field5642 = null;
            this.field8803.field5640 = null;
        }
        if (arg1 != -21222) {
            this.method3462(-31, 85);
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)Z")
    public final boolean method3483(byte arg0, String arg1, String arg2) {
        field8821++;
        if (!this.method3487(99)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field8803.field5642.method1823(class86.method501(var4, (byte) 119), true);
        if (var6 < 0) {
            return false;
        }
        int var7 = this.field8803.field5659[var6].method1823(class86.method501(var5, (byte) 124), true);
        if (var7 < 0) {
            return false;
        } else {
            if (arg0 != -128) {
                this.field8788 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(Z)V")
    public final void method3484(boolean arg0) {
        if (this.field8815 != null) {
            for (int var2 = 0; var2 < this.field8815.length; var2++) {
                this.field8815[var2] = null;
            }
        }
        if (arg0) {
            field8798++;
        }
    }

    @OriginalMember(owner = "client!dda", name = "g", descriptor = "(II)V")
    private final void method3485(int arg0, int arg1) {
        field8786++;
        this.field8788.method1551(arg1, 0);
        if (arg0 != 2) {
            this.field8817 = true;
        }
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(BII)[B")
    public final byte[] method3486(byte arg0, int arg1, int arg2) {
        if (arg0 >= -28) {
            return null;
        } else {
            field8810++;
            return this.method3473(null, -2, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!dda", name = "d", descriptor = "(I)Z")
    private final boolean method3487(int arg0) {
        field8802++;
        if (this.field8803 == null) {
            this.field8803 = this.field8788.method1549(-71);
            if (this.field8803 == null) {
                return false;
            }
            this.field8822 = new Object[this.field8803.field5643][];
            this.field8815 = new Object[this.field8803.field5643];
        }
        if (arg0 < 54) {
            this.method3463(null, -93);
        }
        return true;
    }

    @OriginalMember(owner = "client!dda", name = "c", descriptor = "(Z)V")
    public final void method3488(boolean arg0) {
        field8824++;
        if (arg0) {
            this.field8815 = null;
        }
        if (this.field8822 != null) {
            for (int var2 = 0; var2 < this.field8822.length; var2++) {
                this.field8822[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!dda", name = "h", descriptor = "(II)I")
    private final int method3489(int arg0, int arg1) {
        field8796++;
        if (this.method3464(arg1, arg0)) {
            return this.field8815[arg1] == null ? this.field8788.method1559(arg1, arg0 ^ 0x64) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "(Lnq;ZI)V")
    public class597(class598 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field8794 = arg2;
        this.field8817 = arg1;
        this.field8788 = arg0;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(II[II)Z")
    private final boolean method3490(int arg0, int arg1, int[] arg2, int arg3) {
        field8809++;
        if (!this.method3464(arg1, 100)) {
            return false;
        } else if (this.field8815[arg1] == null) {
            return false;
        } else {
            int var5 = this.field8803.field5648[arg1];
            if (arg3 != -1807) {
                return false;
            }
            int[] var6 = this.field8803.field5657[arg1];
            if (this.field8822[arg1] == null) {
                this.field8822[arg1] = new Object[this.field8803.field5649[arg1]];
            }
            Object[] var7 = this.field8822[arg1];
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
            if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
                var11 = class568.method3317(this.field8815[arg1], (byte) 51, false);
            } else {
                var11 = class568.method3317(this.field8815[arg1], (byte) 51, true);
                class428 var12 = new class428(var11);
                var12.method2606(arg2, (byte) 110, 5, var12.field6162.length);
            }
            byte[] var13;
            try {
                var13 = class210.method1358(var11, -125);
            } catch (RuntimeException var49) {
                throw class511.method3054(var49, "T3 - " + (arg2 != null) + "," + arg1 + "," + var11.length + "," + class335.method2095(var11.length, var11, 10425) + "," + class335.method2095(var11.length - 2, var11, 10425) + "," + this.field8803.field5644[arg1] + "," + this.field8803.field5647);
            }
            if (this.field8817) {
                this.field8815[arg1] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field8794 == 0) {
                    var7[var15] = class149.method877(var13, false, 119);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field8794 == 2) {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var5 * var17 * 4;
                class428 var19 = new class428(var13);
                int var20 = 0;
                var19.field6221 = var18;
                int var21 = 0;
                for (int var22 = 0; var22 < var17; var22++) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < var5; var24++) {
                        var23 += var19.method2589(-11179);
                        int var25;
                        if (var6 == null) {
                            var25 = var24;
                        } else {
                            var25 = var6[var24];
                        }
                        if (arg0 == var25) {
                            var21 = var25;
                            var20 += var23;
                        }
                    }
                }
                if (var20 == 0) {
                    return true;
                }
                byte[] var26 = new byte[var20];
                var19.field6221 = var18;
                int var27 = 0;
                int var28 = 0;
                for (int var29 = 0; var29 < var17; var29++) {
                    int var30 = 0;
                    for (int var31 = 0; var31 < var5; var31++) {
                        var30 += var19.method2589(arg3 ^ 0x2CA4);
                        int var32;
                        if (var6 == null) {
                            var32 = var31;
                        } else {
                            var32 = var6[var31];
                        }
                        if (arg0 == var32) {
                            class473.method2883(var13, var28, var26, var27, var30);
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
                class428 var36 = new class428(var13);
                var36.field6221 = var35;
                int[] var37 = new int[var5];
                for (int var38 = 0; var38 < var34; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var36.method2589(-11179);
                        var37[var40] += var39;
                    }
                }
                byte[][] var41 = new byte[var5][];
                for (int var42 = 0; var42 < var5; var42++) {
                    var41[var42] = new byte[var37[var42]];
                    var37[var42] = 0;
                }
                var36.field6221 = var35;
                int var43 = 0;
                for (int var44 = 0; var44 < var34; var44++) {
                    int var45 = 0;
                    for (int var46 = 0; var46 < var5; var46++) {
                        var45 += var36.method2589(-11179);
                        class473.method2883(var13, var43, var41[var46], var37[var46], var45);
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
                    if (this.field8794 == 0) {
                        var7[var48] = class149.method877(var41[var47], false, 126);
                    } else {
                        var7[var48] = var41[var47];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!dda", name = "i", descriptor = "(II)Z")
    public final boolean method3491(int arg0, int arg1) {
        field8819++;
        if (!this.method3487(103)) {
            return false;
        } else if (this.field8803.field5649.length == 1) {
            return this.method3461(0, arg1, 0);
        } else if (arg0 < 102) {
            return true;
        } else if (!this.method3464(arg1, 100)) {
            return false;
        } else if (this.field8803.field5649[arg1] == 1) {
            return this.method3461(arg1, 0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dda", name = "j", descriptor = "(II)V")
    private final void method3492(int arg0, int arg1) {
        if (arg0 != 2) {
            this.method3462(-15, -40);
        }
        if (this.field8817) {
            this.field8815[arg1] = this.field8788.method1557(115, arg1);
        } else {
            this.field8815[arg1] = class149.method877(this.field8788.method1557(116, arg1), false, 109);
        }
        field8792++;
    }
}
