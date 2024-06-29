import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class397 extends class362 {

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
    public int field5809 = 0;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    public int field5802;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "I")
    public int field5804;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    public static int field5806;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
    public int field5811;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
    public int field5812;

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "I")
    public int field5814;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "I")
    public int field5815;

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "I")
    public int field5819;

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "I")
    public int field5821;

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "I")
    public int field5823;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    public int field5827;

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "I")
    public int field5828;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    public int field5830;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
    public int field5832;

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "Lhp;")
    public class329 field5817;

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "Lhp;")
    public class329 field5822;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "Lvia;")
    public class563 field5807;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "Lvia;")
    public class563 field5810;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "Lke;")
    public class598 field5813;

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "Lob;")
    public class735 field5820;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "Lob;")
    public class735 field5826;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "Liv;")
    public class99 field5829;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "Lff;")
    public class9 field5825;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "Z")
    public boolean field5808;

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "Z")
    public boolean field5818;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "Z")
    public boolean field5833;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "[I")
    public int[] field5831;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lga;Z[[[BIB)Z", line = 16)
    public static final boolean method2483(class404 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class148.field2474) {
            return false;
        }
        int var5 = arg0.field5922 >> class130.field2185;
        int var6 = var5;
        int var7 = arg0.field5933 >> class130.field2185;
        int var8 = var7;
        if (arg0 instanceof class494) {
            var6 = ((class494) arg0).field6839;
            var8 = ((class494) arg0).field6835;
            var5 = ((class494) arg0).field6831;
            var7 = ((class494) arg0).field6838;
        }
        for (int var9 = var5; var9 <= var6; var9++) {
            for (int var10 = var7; var10 <= var8; var10++) {
                if (arg0.field5921 < class510.field7094 && var9 >= class237.field3442 && var9 < class581.field7952 && var10 >= class38.field943 && var10 < class241.field3522) {
                    if ((arg2 == null || arg0.field5926 < arg3 || arg2[arg0.field5926][var9][var10] != arg4) && arg0.method939(0) && !arg0.method937((byte) -79)) {
                        return false;
                    }
                    if (!arg1 && var9 >= class134.field2256 - 16 && var9 <= class134.field2256 + 16 && var10 >= class492.field6813 - 16 && var10 <= class492.field6813 + 16) {
                        if (class719.field9783) {
                            class516.field7188[class263.field3758++].method3479(-15481, arg0);
                            class263.field3758 %= class165.field2594;
                        } else {
                            arg0.method31(class44.field982, -128);
                        }
                    }
                }
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI)I", line = 85)
    public static final int method2484(boolean arg0, int arg1) {
        field5806++;
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        } else if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else if (arg1 == 6406 || arg1 == 34844) {
            return 6406;
        } else if (arg1 == 6409 || arg1 == 34846) {
            return 6409;
        } else if (arg1 == 6410 || arg1 == 34847) {
            return 6410;
        } else {
            if (!arg0) {
                method2485(36, null, (byte) -28, -58, -120);
            }
            if (arg1 != 6402) {
                throw new IllegalArgumentException("");
            }
            return 6402;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILjava/lang/String;BII)V", line = 117)
    public static final void method2485(int arg0, String arg1, byte arg2, int arg3, int arg4) {
        field5803++;
        class378 var5 = class751.method4199(arg0, (byte) -54, arg4);
        if (var5 == null) {
            return;
        }
        if (var5.field5417 != null) {
            class33 var6 = new class33();
            var6.field847 = var5;
            var6.field852 = arg1;
            var6.field845 = var5.field5417;
            var6.field844 = arg3;
            class83.method788(var6);
        }
        if (class214.field3036 != 10 || !client.method1975(var5).method2099(arg3 - 1, false)) {
            return;
        }
        if (arg3 == 1) {
            class422.field6087++;
            class564 var7 = class227.method1594(class581.field7963, class72.field1320, -93);
            class278.method1829(arg4, arg0, var5.field5488, var7, -19692);
            class167.method1260(118, var7);
        }
        if (arg3 == 2) {
            class508.field7061++;
            class564 var8 = class227.method1594(class455.field6414, class72.field1320, -98);
            class278.method1829(arg4, arg0, var5.field5488, var8, -19692);
            class167.method1260(126, var8);
        }
        if (arg3 == 3) {
            class591.field8073++;
            class564 var9 = class227.method1594(class108.field1894, class72.field1320, -93);
            class278.method1829(arg4, arg0, var5.field5488, var9, -19692);
            class167.method1260(-80, var9);
        }
        if (arg3 == 4) {
            class367.field5233++;
            class564 var10 = class227.method1594(class301.field4199, class72.field1320, -82);
            class278.method1829(arg4, arg0, var5.field5488, var10, -19692);
            class167.method1260(116, var10);
        }
        int var11 = -80 / ((64 - arg2) / 43);
        if (arg3 == 5) {
            class81.field1454++;
            class564 var12 = class227.method1594(class216.field3130, class72.field1320, -94);
            class278.method1829(arg4, arg0, var5.field5488, var12, -19692);
            class167.method1260(123, var12);
        }
        if (arg3 == 6) {
            class214.field3042++;
            class564 var13 = class227.method1594(class260.field3732, class72.field1320, -100);
            class278.method1829(arg4, arg0, var5.field5488, var13, -19692);
            class167.method1260(-4, var13);
        }
        if (arg3 == 7) {
            class234.field3397++;
            class564 var14 = class227.method1594(class493.field6826, class72.field1320, -84);
            class278.method1829(arg4, arg0, var5.field5488, var14, -19692);
            class167.method1260(118, var14);
        }
        if (arg3 == 8) {
            class724.field9809++;
            class564 var15 = class227.method1594(class174.field2700, class72.field1320, -117);
            class278.method1829(arg4, arg0, var5.field5488, var15, -19692);
            class167.method1260(-96, var15);
        }
        if (arg3 == 9) {
            class501.field6989++;
            class564 var16 = class227.method1594(class253.field3640, class72.field1320, -107);
            class278.method1829(arg4, arg0, var5.field5488, var16, -19692);
            class167.method1260(119, var16);
        }
        if (arg3 == 10) {
            class373.field5300++;
            class564 var17 = class227.method1594(class276.field3871, class72.field1320, -120);
            class278.method1829(arg4, arg0, var5.field5488, var17, -19692);
            class167.method1260(117, var17);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 255)
    public final void method2486(byte arg0) {
        field5805++;
        int var2 = this.field5819;
        if (arg0 != 21) {
            return;
        }
        boolean var3 = this.field5808;
        if (this.field5829 != null) {
            class99 var6 = this.field5829.method925(class390.field5635, (byte) 47);
            if (var6 == null) {
                this.field5815 = 256;
                this.field5808 = false;
                this.field5833 = false;
                this.field5831 = null;
                this.field5802 = 0;
                this.field5811 = 0;
                this.field5830 = 256;
                this.field5814 = 0;
                this.field5819 = -1;
                this.field5828 = 0;
            } else {
                this.field5815 = var6.field1751;
                this.field5819 = var6.field1722;
                this.field5830 = var6.field1713;
                this.field5828 = var6.field1724 << 9;
                this.field5808 = var6.field1723;
                this.field5814 = var6.field1797;
                this.field5811 = var6.field1771;
                this.field5802 = var6.field1772;
                this.field5833 = var6.field1738;
                this.field5831 = var6.field1739;
            }
        } else if (this.field5825 != null) {
            int var4 = class436.method2643(this.field5825, -1);
            if (var2 != var4) {
                this.field5819 = var4;
                class334 var5 = this.field5825.field126;
                if (var5.field4694 != null) {
                    var5 = var5.method2110(class390.field5635, -1);
                }
                if (var5 == null) {
                    this.field5811 = this.field5828 = 0;
                    this.field5815 = 256;
                    this.field5830 = 256;
                    this.field5808 = this.field5825.field126.field4687;
                } else {
                    this.field5828 = var5.field4709 << 9;
                    this.field5815 = var5.field4680;
                    this.field5811 = var5.field4673;
                    this.field5808 = var5.field4687;
                    this.field5830 = var5.field4657;
                }
            }
        } else if (this.field5813 != null) {
            this.field5819 = class613.method3475(-1, this.field5813);
            this.field5828 = this.field5813.field8198 << 9;
            this.field5811 = this.field5813.field8203;
            this.field5815 = 256;
            this.field5830 = 256;
            this.field5808 = this.field5813.field8162;
        }
        if (this.field5819 == var2 && var3 == this.field5808) {
            return;
        }
        if (this.field5810 == null) {
            return;
        }
        class326.field4510.method1321(this.field5810);
        this.field5820 = null;
        this.field5810 = null;
        this.field5822 = null;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(III)B", line = 371)
    public static final byte method2487(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method2488(-96, (byte) -65, -96);
        }
        field5824++;
        if (arg1 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IBI)Z", line = 390)
    public static final boolean method2488(int arg0, byte arg1, int arg2) {
        field5816++;
        int var3 = 53 / ((15 - arg1) / 55);
        return class421.method2586(arg2, arg0, 118) & class654.method3695(arg2, (byte) 56, arg0);
    }
}
