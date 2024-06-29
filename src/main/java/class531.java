import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class531 {

    @OriginalMember(owner = "client!kj", name = "r", descriptor = "I")
    private int field6718 = -1;

    @OriginalMember(owner = "client!kj", name = "q", descriptor = "Z")
    public boolean field6717 = true;

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "Lkea;")
    private class223 field6712;

    @OriginalMember(owner = "client!kj", name = "o", descriptor = "I")
    private int field6715;

    @OriginalMember(owner = "client!kj", name = "m", descriptor = "I")
    private int field6713;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "Lo;")
    private class28 field6704;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    private int field6703;

    @OriginalMember(owner = "client!kj", name = "n", descriptor = "I")
    private int field6714;

    @OriginalMember(owner = "client!kj", name = "s", descriptor = "Lvl;")
    private class13 field6719;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public int field6711;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "Lem;")
    private class212 field6709;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field6701 = 0;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "Z")
    public static boolean field6707 = true;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Lhm;")
    public static class208 field6705 = new class208(8);

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!kj", name = "p", descriptor = "I")
    public static int field6716;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "Ldr;")
    public static class675 field6702;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILvl;)V", line = 7)
    public final void method2865(int arg0, int arg1, class13 arg2) {
        field6710++;
        if (arg0 != 0) {
            this.method2866(-49);
        }
        if (arg1 > 0) {
            this.method2866(90);
            this.field6712.method1349(this.field6709, false);
            this.field6712.method375(0, (byte) 126, this.field6703, this.field6714 + 1 - this.field6703, arg1, class701.field9803, arg2);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V", line = 31)
    private final void method2866(int arg0) {
        field6706++;
        if (!this.field6717) {
            return;
        }
        this.field6717 = false;
        byte[] var2 = this.field6704.field339;
        int var3 = 0;
        int var4 = this.field6704.field337;
        int var5 = this.field6704.field337 * this.field6715 + this.field6713;
        int var6 = 110 / ((arg0 + 49) / 35);
        for (int var7 = -128; var7 < 0; var7++) {
            var3 = (var3 << 8) - var3;
            for (int var18 = -128; var18 < 0; var18++) {
                if (var2[var5++] != 0) {
                    var3++;
                }
            }
            var5 += var4 - 128;
        }
        if (this.field6709 != null && this.field6718 == var3) {
            this.field6717 = false;
            return;
        }
        this.field6718 = var3;
        int var8 = this.field6715 * var4 + this.field6713;
        int var9 = 0;
        if (!this.field6712.method357(-22567, class100.field1288, class190.field2256)) {
            if (class293.field3732 == null) {
                class293.field3732 = new int[16384];
            }
            int[] var10 = class293.field3732;
            for (int var11 = -128; var11 < 0; var11++) {
                for (int var12 = -128; var12 < 0; var12++) {
                    if (var2[var8] == 0) {
                        int var13 = 0;
                        if (var2[var8 - 1] != 0) {
                            var13++;
                        }
                        if (var2[var8 + 1] != 0) {
                            var13++;
                        }
                        if (var2[var8 - var4] != 0) {
                            var13++;
                        }
                        if (var2[var4 + var8] != 0) {
                            var13++;
                        }
                        var10[var9++] = var13 * 17 << 24;
                    } else {
                        var10[var9++] = 1140850688;
                    }
                    var8++;
                }
                var8 += this.field6704.field337 - 128;
            }
            if (this.field6709 == null) {
                this.field6709 = this.field6712.method1295((byte) -122, 128, class293.field3732, 128, false);
                this.field6709.method40(false, false, 7220);
            } else {
                this.field6709.method35(class293.field3732, 0, 128, 128, 0, 128, 63, 0);
            }
            return;
        }
        if (class223.field2739 == null) {
            class223.field2739 = new byte[16384];
        }
        byte[] var14 = class223.field2739;
        for (int var15 = -128; var15 < 0; var15++) {
            for (int var16 = -128; var16 < 0; var16++) {
                if (var2[var8] == 0) {
                    int var17 = 0;
                    if (var2[var8 - 1] != 0) {
                        var17++;
                    }
                    if (var2[var8 + 1] != 0) {
                        var17++;
                    }
                    if (var2[var8 - var4] != 0) {
                        var17++;
                    }
                    if (var2[var4 + var8] != 0) {
                        var17++;
                    }
                    var14[var9++] = (byte) (var17 * 17);
                } else {
                    var14[var9++] = 68;
                }
                var8++;
            }
            var8 += this.field6704.field337 - 128;
        }
        if (this.field6709 == null) {
            this.field6709 = this.field6712.method1286(128, class223.field2739, (byte) 100, false, class190.field2256, 128);
            this.field6709.method40(false, false, 7220);
        } else {
            this.field6709.method34(0, 128, 0, false, 0, 128, class190.field2256, 128, class223.field2739);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V", line = 201)
    public static void method2867(byte arg0) {
        field6705 = null;
        if (arg0 >= -30) {
            field6702 = null;
        }
        field6702 = null;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V", line = 213)
    public final void method2868(byte arg0) {
        field6708++;
        this.method2865(0, this.field6711, this.field6719);
        if (arg0 != 81) {
            this.field6715 = -72;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)Z", line = 227)
    public static final boolean method2869(int arg0, int arg1, int arg2) {
        int var3 = -86 / ((arg2 + 30) / 62);
        field6716++;
        return (arg1 & 0x60000) != 0 | class650.method3627(arg1, 1, arg0) || class273.method1626((byte) -82, arg1, arg0) || class97.method718(64, arg1, arg0);
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lkea;Lo;Liq;IIIII)V", line = 254)
    public class531(class223 arg0, class28 arg1, class568 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field6712 = arg0;
        this.field6715 = arg7;
        this.field6713 = arg6;
        this.field6704 = arg1;
        int var9 = 0x1 << arg5;
        int var10 = 0;
        int var11 = arg3 << arg5;
        int var12 = arg4 << arg5;
        for (int var13 = 0; var13 < var9; var13++) {
            int var29 = (var12 + var13) * arg2.field1685 + var11;
            for (int var30 = 0; var30 < var9; var30++) {
                short[] var31 = arg2.field7119[var29++];
                if (var31 != null) {
                    var10 += var31.length;
                }
            }
        }
        if (var10 <= 0) {
            this.field6711 = 0;
            this.field6709 = null;
        } else {
            this.field6703 = Integer.MAX_VALUE;
            this.field6714 = Integer.MIN_VALUE;
            this.field6719 = this.field6712.method340((byte) 122, false);
            this.field6719.method59(-29529, var10);
            for (int var14 = 0; var14 < 4; var14++) {
                Buffer var15 = this.field6719.method62(true, true);
                if (var15 != null) {
                    Stream var16 = this.field6712.method1289(-82, var15);
                    if (Stream.method3525()) {
                        for (int var17 = 0; var17 < var9; var17++) {
                            int var18 = (var12 + var17) * arg2.field1685 + var11;
                            for (int var19 = 0; var19 < var9; var19++) {
                                short[] var20 = arg2.field7119[var18++];
                                if (var20 != null) {
                                    for (int var21 = 0; var21 < var20.length; var21++) {
                                        int var22 = var20[var21] & 0xFFFF;
                                        if (this.field6714 < var22) {
                                            this.field6714 = var22;
                                        }
                                        if (this.field6703 > var22) {
                                            this.field6703 = var22;
                                        }
                                        var16.method3526(var22);
                                    }
                                }
                            }
                        }
                    } else {
                        for (int var23 = 0; var23 < var9; var23++) {
                            int var24 = (var12 + var23) * arg2.field1685 + var11;
                            for (int var25 = 0; var25 < var9; var25++) {
                                short[] var26 = arg2.field7119[var24++];
                                if (var26 != null) {
                                    for (int var27 = 0; var27 < var26.length; var27++) {
                                        int var28 = var26[var27] & 0xFFFF;
                                        if (var28 > this.field6714) {
                                            this.field6714 = var28;
                                        }
                                        if (var28 < this.field6703) {
                                            this.field6703 = var28;
                                        }
                                        var16.method3519(var28);
                                    }
                                }
                            }
                        }
                    }
                    var16.method3530();
                    if (this.field6719.method61((byte) 96)) {
                        break;
                    }
                }
            }
            this.field6711 = var10 / 3;
        }
    }
}
