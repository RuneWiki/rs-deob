import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class227 extends class288 {

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "Z")
    private boolean field3581 = true;

    @OriginalMember(owner = "client!qj", name = "J", descriptor = "Z")
    private boolean field3587 = true;

    @OriginalMember(owner = "client!qj", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3595 = "";

    @OriginalMember(owner = "client!qj", name = "R", descriptor = "I")
    public static int field3593 = -1;

    @OriginalMember(owner = "client!qj", name = "U", descriptor = "Ljava/lang/String;")
    public static String field3596 = "shake:";

    @OriginalMember(owner = "client!qj", name = "V", descriptor = "[I")
    public static int[] field3597 = new int[1000];

    @OriginalMember(owner = "client!qj", name = "D", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!qj", name = "E", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!qj", name = "F", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!qj", name = "G", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!qj", name = "L", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!qj", name = "N", descriptor = "I")
    public static int field3590;

    @OriginalMember(owner = "client!qj", name = "O", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!qj", name = "P", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!qj", name = "S", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!qj", name = "M", descriptor = "Ljj;")
    public static class134 field3589;

    @OriginalMember(owner = "client!qj", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field3586;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIBIIII)V")
    public static final void method1494(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        class115[] var7 = class293.field4649;
        if (arg2 != 27) {
            field3595 = null;
        }
        for (int var8 = 0; ~var7.length < ~var8; ++var8) {
            class115 var9 = var7[var8];
            if (var9 != null && ~var9.field1967 == -3) {
                class238.method1572(var9.field1974 * 2, (-class93.field1321 + var9.field1973 << 7) + var9.field1976, arg0, arg1, (-class296.field4685 + var9.field1963 << 7) + var9.field1968, arg6 >> 1, arg5 >> 1, (byte) 101);
                if (class236.field3775 > -1 && ~(class9.field141 % 20) > -11) {
                    class1.field17[var9.field1970].method174(arg4 + -12 + class236.field3775, arg3 - -class54.field773 - 28);
                }
            }
        }
        ++field3582;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIII)V")
    public static final void method1495(int arg0, int arg1, int arg2, int arg3) {
        ++field3588;
        if (arg2 > 98) {
            class267.method1807(false, -4);
            class76.field1040 = arg0;
            class218.field3494 = arg1;
            class138.method953(49, arg3);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZ)Loi;")
    public static final class289 method1496(int arg0, boolean arg1) {
        ++field3594;
        class289 var2 = (class289) class178.field2887.method1579((long) arg0, 0);
        if (var2 != null) {
            return var2;
        } else {
            if (!arg1) {
                field3593 = 47;
            }
            byte[] var3 = class28.field337.method940((byte) 115, arg0, 26);
            class289 var4 = new class289();
            if (var3 != null) {
                var4.method1937(-1, new class264(var3));
            }
            class178.field2887.method1578(var4, (long) arg0, 50);
            return var4;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
    public class227() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        ++field3591;
        if (arg1 != -19) {
            field3597 = null;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field4612 = arg0.method1779(arg1 + -102) == 1;
                }
            } else {
                this.field3581 = arg0.method1779(arg1 + -73) == 1;
            }
        } else {
            this.field3587 = arg0.method1779(-108) == 1;
        }
    }

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(B)V")
    public static void method1497(byte arg0) {
        field3589 = null;
        int var1 = 93 % ((arg0 - -9) / 56);
        field3595 = null;
        field3597 = null;
        field3586 = null;
        field3596 = null;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIII)V")
    public static final void method1498(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= arg4) {
            class168.method1184(128, arg4, arg1, arg0, class85.field1162[arg3]);
        } else {
            class168.method1184(128, arg1, arg4, arg0, class85.field1162[arg3]);
        }
        if (arg2 > -33) {
            field3595 = null;
        }
        ++field3585;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(II)[[I")
    public final int[][] method34(int arg0, int arg1) {
        int[][] var3 = super.field4598.method812(arg1, 65535);
        ++field3592;
        if (arg0 != 1) {
            this.field3581 = true;
        }
        if (super.field4598.field1954) {
            int[][] var4 = this.method1930(0, this.field3581 ? -arg1 + class144.field2332 : arg1, (byte) -110);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[1];
            int[] var10 = var3[2];
            if (!this.field3587) {
                for (int var11 = 0; ~var11 > ~class186.field2986; ++var11) {
                    var7[var11] = var5[var11];
                    var8[var11] = var9[var11];
                    var10[var11] = var6[var11];
                }
            } else {
                for (int var12 = 0; ~var12 > ~class186.field2986; ++var12) {
                    var7[var12] = var5[-var12 + class34.field422];
                    var8[var12] = var9[class34.field422 - var12];
                    var10[var12] = var6[-var12 + class34.field422];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLjj;II)Z")
    public static final boolean method1499(byte arg0, class134 arg1, int arg2, int arg3) {
        ++field3583;
        int var4 = -20 / ((73 - arg0) / 53);
        byte[] var5 = arg1.method940((byte) 59, arg3, arg2);
        if (var5 == null) {
            return false;
        } else {
            class122.method855((byte) -77, var5);
            return true;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        ++field3584;
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (super.field4609.field1059) {
            int[] var4 = this.method1931((byte) -124, 0, this.field3581 ? -arg1 + class144.field2332 : arg1);
            if (this.field3587) {
                for (int var5 = 0; class186.field2986 > var5; ++var5) {
                    var3[var5] = var4[-var5 + class34.field422];
                }
            } else {
                class56.method434(var4, 0, var3, 0, class186.field2986);
            }
        }
        return arg0 != 0 ? null : var3;
    }
}
