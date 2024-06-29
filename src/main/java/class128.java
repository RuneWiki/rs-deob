import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class128 extends class311 {

    @OriginalMember(owner = "client!fa", name = "Ec", descriptor = "Z")
    public boolean field1769 = false;

    @OriginalMember(owner = "client!fa", name = "Qc", descriptor = "I")
    public int field1781 = -1;

    @OriginalMember(owner = "client!fa", name = "Kc", descriptor = "B")
    private byte field1775 = 0;

    @OriginalMember(owner = "client!fa", name = "Jc", descriptor = "I")
    public int field1774 = -1;

    @OriginalMember(owner = "client!fa", name = "Wc", descriptor = "I")
    public int field1787 = -1;

    @OriginalMember(owner = "client!fa", name = "Yc", descriptor = "I")
    public int field1789 = -1;

    @OriginalMember(owner = "client!fa", name = "Lc", descriptor = "I")
    public int field1776 = 0;

    @OriginalMember(owner = "client!fa", name = "jd", descriptor = "I")
    public int field1800 = 0;

    @OriginalMember(owner = "client!fa", name = "ed", descriptor = "I")
    public int field1795 = 0;

    @OriginalMember(owner = "client!fa", name = "dd", descriptor = "I")
    public int field1794 = -1;

    @OriginalMember(owner = "client!fa", name = "nd", descriptor = "B")
    private byte field1804 = 0;

    @OriginalMember(owner = "client!fa", name = "rd", descriptor = "I")
    public int field1808 = -1;

    @OriginalMember(owner = "client!fa", name = "vd", descriptor = "I")
    public int field1812 = 255;

    @OriginalMember(owner = "client!fa", name = "sd", descriptor = "I")
    public int field1809 = 0;

    @OriginalMember(owner = "client!fa", name = "ud", descriptor = "B")
    private byte field1811 = 0;

    @OriginalMember(owner = "client!fa", name = "wd", descriptor = "I")
    public int field1813 = 0;

    @OriginalMember(owner = "client!fa", name = "yd", descriptor = "I")
    public int field1815 = -1;

    @OriginalMember(owner = "client!fa", name = "cd", descriptor = "[I")
    public static int[] field1793 = new int[14];

    @OriginalMember(owner = "client!fa", name = "fd", descriptor = "Lpm;")
    public static class349 field1796 = new class349(" from your friend list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!fa", name = "td", descriptor = "Lkn;")
    public static class442 field1810 = new class442();

    @OriginalMember(owner = "client!fa", name = "Dc", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!fa", name = "Fc", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!fa", name = "Gc", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!fa", name = "Hc", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!fa", name = "Ic", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!fa", name = "Mc", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!fa", name = "Oc", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!fa", name = "Pc", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!fa", name = "Rc", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!fa", name = "Sc", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!fa", name = "Uc", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!fa", name = "Vc", descriptor = "I")
    private int field1786;

    @OriginalMember(owner = "client!fa", name = "Xc", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!fa", name = "ad", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!fa", name = "bd", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!fa", name = "gd", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!fa", name = "hd", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!fa", name = "id", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!fa", name = "kd", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!fa", name = "ld", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!fa", name = "md", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!fa", name = "od", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!fa", name = "pd", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!fa", name = "qd", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!fa", name = "xd", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!fa", name = "Nc", descriptor = "Lcn;")
    public class301 field1778;

    @OriginalMember(owner = "client!fa", name = "Tc", descriptor = "Ljava/lang/String;")
    public String field1784;

    @OriginalMember(owner = "client!fa", name = "Zc", descriptor = "Ljava/lang/String;")
    public String field1790;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "(B)I")
    public final int method773(byte arg0) {
        ++field1773;
        if (arg0 <= 18) {
            this.field1776 = -110;
        }
        return this.field1778 != null && ~this.field1778.field4392 != 0 ? class171.method1222(this.field1778.field4392, 127).field5008 : super.method773((byte) 90);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V")
    public static final void method774(boolean arg0) {
        if (!arg0) {
            field1814 = -21;
        }
        ++field1806;
        if (class93.field1195 != null) {
            if (~class93.field1195.field2298 == -2) {
                class93.field1195 = null;
                return;
            }
            if (class93.field1195.field2298 == 2) {
                class105.method617(class309.field4494, 2, -24962, class438.field6261);
                class93.field1195 = null;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lvq;B)V")
    public final void method22(class269 arg0, byte arg1) {
        ++field1785;
        if (this.field1778 != null) {
            if (super.field4596 || this.method784((byte) 113, arg0, 0)) {
                this.method2085(false, super.field4597, super.field4596, arg0);
                if (arg1 <= 11) {
                    this.method611((class269) null, false, (class198) null, -79, 57, (byte) 111, -54);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)I")
    public final int method775(int arg0) {
        if (arg0 != 3) {
            this.field1787 = -109;
        }
        ++field1780;
        return super.field4543;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V")
    public final void method776(int arg0, int arg1, int arg2) {
        ++field1768;
        int var4 = super.field4595[0];
        int var5 = super.field4601[0];
        if (arg1 == 0) {
            --var4;
            ++var5;
        }
        if (arg1 == 1) {
            ++var5;
        }
        if (~arg1 == -3) {
            ++var5;
            ++var4;
        }
        if (arg1 == 3) {
            --var4;
        }
        if (arg1 == 4) {
            ++var4;
        }
        if (arg1 == 5) {
            --var4;
            --var5;
        }
        if (arg1 == 6) {
            --var5;
        }
        if (arg1 == 7) {
            --var5;
            ++var4;
        }
        if (super.field4558 != -1 && class110.method671(-21965, super.field4558).field2597 == 1) {
            super.field4558 = -1;
        }
        if (super.field4578 != -1) {
            class135 var6 = class209.method1486(super.field4578, arg2 ^ 23549);
            if (var6.field2068 && var6.field2078 != -1 && ~class110.method671(-21965, var6.field2078).field2597 == -2) {
                super.field4578 = -1;
            }
        }
        if (~super.field4599 > -10) {
            ++super.field4599;
        }
        if (arg2 != 23542) {
            this.method782(104);
        }
        for (int var7 = super.field4599; ~var7 < -1; --var7) {
            super.field4595[var7] = super.field4595[var7 + -1];
            super.field4601[var7] = super.field4601[var7 - 1];
            super.field4606[var7] = super.field4606[var7 + -1];
        }
        super.field4595[0] = var4;
        super.field4601[0] = var5;
        super.field4606[0] = (byte) arg0;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ILlf;)V")
    public final void method777(int arg0, class130 arg1) {
        arg1.field1880 = 0;
        ++field1801;
        int var3 = arg1.method837(true);
        this.field1775 = (byte) (var3 & 1);
        boolean var4 = ~(var3 & 2) != -1;
        boolean var5 = ~(var3 & 4) != -1;
        int var6 = super.method773((byte) 122);
        this.method2095((byte) 51, (7 & var3 >> 3) + 1);
        this.field1811 = (byte) (var3 >> 6 & 3);
        super.field4463 += (this.method773((byte) 44) - var6) * 64;
        super.field4466 += (-var6 + this.method773((byte) 78)) * 64;
        this.field1804 = arg1.method823((byte) 117);
        this.field1815 = arg1.method823((byte) 113);
        this.field1787 = arg1.method823((byte) 116);
        this.field1795 = 0;
        int var7 = -1;
        int[] var8 = new int[12];
        for (int var9 = 0; var9 < 12; ++var9) {
            int var10 = arg1.method837(true);
            if (var10 == 0) {
                var8[var9] = 0;
            } else {
                int var11 = arg1.method837(true);
                int var12 = (var10 << 8) - -var11;
                if (var9 == 0 && ~var12 == -65536) {
                    var7 = arg1.method798(false);
                    this.field1795 = arg1.method837(true);
                    break;
                }
                if (var12 >= 32768) {
                    int var26 = class399.field5602[var12 + -32768];
                    var8[var9] = class332.method2176(1073741824, var26);
                    int var27 = class167.method1202(true, var26).field5863;
                    if (var27 != 0) {
                        this.field1795 = var27;
                    }
                } else {
                    var8[var9] = class332.method2176(var12 + -256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var13 = new int[5];
        for (int var14 = 0; var14 < 5; ++var14) {
            int var25 = arg1.method837(true);
            if (var25 < 0 || ~class358.field5175[var14].length >= ~var25) {
                var25 = 0;
            }
            var13[var14] = var25;
        }
        this.field1786 = arg1.method798(false);
        this.field1784 = arg1.method843(-117);
        if (!var4) {
            this.field1790 = this.field1784;
        } else {
            this.field1790 = arg1.method843(arg0 ^ -90);
        }
        if (arg0 != 32) {
            this.method776(25, -61, 31);
        }
        this.field1776 = arg1.method837(true);
        if (!var5) {
            this.field1813 = 0;
            this.field1809 = arg1.method837(true);
            this.field1774 = arg1.method837(true);
            if (this.field1774 == 255) {
                this.field1774 = -1;
            }
        } else {
            this.field1813 = arg1.method798(false);
            this.field1774 = -1;
            this.field1809 = this.field1776;
        }
        int var15 = this.field1800;
        this.field1800 = arg1.method837(true);
        if (this.field1800 != 0) {
            int var16 = this.field1789;
            int var17 = this.field1794;
            int var18 = this.field1781;
            int var19 = this.field1808;
            int var20 = this.field1812;
            this.field1789 = arg1.method798(false);
            this.field1794 = arg1.method798(false);
            this.field1781 = arg1.method798(false);
            this.field1808 = arg1.method798(false);
            this.field1812 = arg1.method837(true);
            if (this.field1800 != var15 || this.field1789 != var16 || this.field1794 != var17 || ~this.field1781 != ~var18 || this.field1808 != var19 || this.field1812 != var20) {
                class407.method2570(this, 0);
            }
        } else {
            class78.method463(this, true);
        }
        if (this.field1778 == null) {
            this.field1778 = new class301();
        }
        int var21 = this.field1778.field4392;
        int[] var22 = this.field1778.field4395;
        this.field1778.method2027(this.field1775 == 1, this.method787((byte) 43), var13, -9985, var7, var8);
        if (var7 != var21) {
            super.field4463 = super.field4595[0] * 128 - -(this.method773((byte) 50) * 64);
            super.field4466 = super.field4601[0] * 128 + this.method773((byte) 77) * 64;
        }
        if (super.field4514 == 2047 && var22 != null) {
            for (int var23 = 0; var13.length > var23; ++var23) {
                if (var13[var23] != var22[var23]) {
                    class69.method424(-3946);
                    break;
                }
            }
        }
        if (super.field4590 != null) {
            super.field4590.method2153();
        }
        if (~super.field4537 != 0 && super.field4513) {
            class3 var24 = this.method2093(-1498200479);
            if (!var24.method13(super.field4537, -18518)) {
                super.field4537 = -1;
                super.field4513 = false;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "(B)I")
    public final int method778(byte arg0) {
        if (arg0 < 81) {
            this.field1786 = -122;
        }
        ++field1779;
        return -1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIZI)V")
    public final void method779(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg0 != -3) {
            method785(124);
        }
        ++field1771;
        super.method2086(arg4, (byte) -77, arg1, arg3, this.method773((byte) 116), arg2);
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)Z")
    public final boolean method610(int arg0) {
        ++field1792;
        if (arg0 != -439) {
            this.method777(-54, (class130) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lvq;ZLkm;IIBI)V")
    public final void method611(class269 arg0, boolean arg1, class198 arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var8 = 21 / ((arg5 - 12) / 40);
        ++field1798;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(Z)V")
    public static final void method780(boolean arg0) {
        if (!arg0) {
            if (~class392.field5511 <= -1) {
                long var1 = class18.method107(-16145);
                class392.field5511 = (int) ((long) class392.field5511 - (-class305.field4449 + var1));
                if (class392.field5511 > 0) {
                    int var3 = (class392.field5511 << 8) / class447.field6389;
                    int var4 = -var3 + 255;
                    float var5 = (float) var3 / 255.0F;
                    class69.field925 = ((16711935 & class423.field6038) * var3 - -((class105.field1351.field1820 & 16711935) * var4) & -16711936) + ((class423.field6038 & 65280) * var3 - -((class105.field1351.field1820 & 65280) * var4) & 16711680) >>> 8;
                    float var6 = 1.0F - var5;
                    class200.field2855 = (16711680 & (65280 & class254.field3768) * var3 + (class105.field1351.field1823 & 65280) * var4) + ((16711935 & class254.field3768) * var3 + (16711935 & class105.field1351.field1823) * var4 & -16711936) >>> 8;
                    class147.field2202 = (-class197.field2824 + class105.field1351.field1816) * var6 + class197.field2824;
                    class19.field257 = (class105.field1351.field1819 - class214.field3076) * var6 + class214.field3076;
                    class352.field5115 = (class105.field1351.field1837 - class230.field3407) * var6 + class230.field3407;
                    class380.field5401 = (class105.field1351.field1828 - class252.field3739) * var6 + class252.field3739;
                    class439.field6278 = class84.field1074 * var3 - -(class105.field1351.field1833 * var4) >> 8;
                    class319.field4674 = (-class127.field1767 + class105.field1351.field1831) * var6 + class127.field1767;
                    class167.field2379 = (-class21.field270 + class105.field1351.field1829) * var6 + class21.field270;
                    if (class267.field3916 != class105.field1351.field1838) {
                        class1.field6 = class390.field5490.method993(class267.field3916, class105.field1351.field1838, var6, class1.field6);
                    }
                } else {
                    class167.field2379 = class105.field1351.field1829;
                    class352.field5115 = class105.field1351.field1837;
                    class1.field6 = class105.field1351.field1838;
                    class147.field2202 = class105.field1351.field1816;
                    class69.field925 = class105.field1351.field1820;
                    class19.field257 = class105.field1351.field1819;
                    class200.field2855 = class105.field1351.field1823;
                    class439.field6278 = class105.field1351.field1833;
                    class392.field5511 = -1;
                    class380.field5401 = class105.field1351.field1828;
                    class319.field4674 = class105.field1351.field1831;
                }
                class305.field4449 = var1;
            }
            ++field1805;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lvq;IIB)Z")
    public final boolean method16(class269 arg0, int arg1, int arg2, byte arg3) {
        ++field1777;
        if (this.field1778 != null && this.method784((byte) 113, arg0, 65536)) {
            class154 var5 = arg0.method884();
            int var6 = super.field4570.method2426(122);
            int var7 = -29 / ((arg3 - 19) / 45);
            var5.method1136(var6);
            var5.method1134(super.field4463, super.field4457, super.field4466);
            for (int var8 = 0; var8 < super.field4597.length; ++var8) {
                if (super.field4597[var8] != null && super.field4597[var8].method209(arg1, arg2, var5, true)) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ls;IBIILni;ILvq;)V")
    private final void method781(class154 arg0, int arg1, byte arg2, int arg3, int arg4, class305 arg5, int arg6, class269 arg7) {
        ++field1797;
        int var9 = arg1 * arg1 + arg4 * arg4;
        if (~var9 <= -17 && arg6 >= var9) {
            if (arg2 < 45) {
                this.method610(-124);
            }
            int var10 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) arg1, (double) arg4));
            class305 var11 = class433.method2707(super.field4554, super.field4466, super.field4457, super.field4463, -22737, arg5, arg3, super.field4551, arg7, var10, super.field4548);
            if (var11 != null) {
                arg7.method874(false);
                var11.method230(arg0, (class144) null, 0);
                arg7.method874(true);
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)Z")
    public final boolean method782(int arg0) {
        ++field1802;
        if (arg0 != 150) {
            this.method777(90, (class130) null);
        }
        return this.field1778 != null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ltj;I)I")
    public static final int method783(class108 arg0, int arg1) {
        ++field1791;
        int var2 = 0;
        if (arg0.method660(class294.field4259, (byte) -103)) {
            ++var2;
        }
        if (arg0.method660(class262.field3872, (byte) -72)) {
            ++var2;
        }
        if (arg0.method660(class103.field1331, (byte) 80)) {
            ++var2;
        }
        if (arg0.method660(class297.field4326, (byte) 60)) {
            ++var2;
        }
        if (arg0.method660(class340.field4922, (byte) 113)) {
            ++var2;
        }
        if (arg0.method660(class62.field829, (byte) 82)) {
            ++var2;
        }
        if (arg0.method660(class379.field5394, (byte) -84)) {
            ++var2;
        }
        if (arg0.method660(class291.field4228, (byte) -122)) {
            ++var2;
        }
        if (arg0.method660(class449.field6405, (byte) -117)) {
            ++var2;
        }
        if (arg0.method660(class255.field3772, (byte) -93)) {
            ++var2;
        }
        if (arg0.method660(class444.field6345, (byte) -118)) {
            ++var2;
        }
        if (arg0.method660(class432.field6185, (byte) 122)) {
            ++var2;
        }
        if (arg1 < 88) {
            return -44;
        } else {
            if (arg0.method660(class119.field1613, (byte) 86)) {
                ++var2;
            }
            if (arg0.method660(class140.field2140, (byte) 124)) {
                ++var2;
            }
            if (arg0.method660(class106.field1353, (byte) 104)) {
                ++var2;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLvq;I)Z")
    private final boolean method784(byte arg0, class269 arg1, int arg2) {
        ++field1782;
        int var4 = arg2;
        class3 var5 = this.method2093(-1498200479);
        class183 var6 = ~super.field4558 != 0 && super.field4535 == 0 ? class110.method671(-21965, super.field4558) : null;
        class183 var7 = super.field4537 == -1 || this.field1769 || super.field4513 && var6 != null ? null : class110.method671(-21965, super.field4537);
        int var8 = var5.field35;
        int var9 = var5.field43;
        if (~var8 != -1 || ~var9 != -1 || ~var5.field47 != -1 || ~var5.field16 != -1) {
            arg2 |= 7;
        }
        super.field4597[0] = this.field1778.method2023(super.field4547, super.field4541, arg1, super.field4566, super.field4520, arg2, var6, super.field4519, 110, super.field4506, super.field4575, true, var7);
        int var10 = client.method1177(18);
        if (class306.field4461 < 96 && var10 > 50) {
            class442.method2749(0);
        }
        if (~class31.field387 != -1 && ~var10 > -51) {
            int var11 = 50 - var10;
            while (~var11 < ~class421.field6020) {
                class440.field6292[class421.field6020] = new byte[102400];
                ++class421.field6020;
            }
            while (var11 < class421.field6020) {
                --class421.field6020;
                class440.field6292[class421.field6020] = null;
            }
        } else if (class31.field387 != 0) {
            class421.field6020 = 0;
            class440.field6292 = new byte[50][];
        }
        if (super.field4597[0] == null) {
            return false;
        } else {
            super.field4543 = super.field4597[0].method221();
            this.method2087(false, super.field4597[0]);
            int var12 = super.field4570.method2426(-116);
            super.field4554 = 0;
            super.field4551 = 0;
            super.field4548 = 0;
            if (arg0 != 113) {
                this.method773((byte) -116);
            }
            if (~var8 == -1 && var9 == 0) {
                this.method2082(-25962, var12, this.method773((byte) 86) << 7, this.method773((byte) 25) << 7);
            } else {
                this.method2082(-25962, var12, var9, var8);
                if (super.field4554 != 0) {
                    super.field4597[0].method207(super.field4554);
                }
                if (~super.field4548 != -1) {
                    super.field4597[0].method197(super.field4548);
                }
                if (~super.field4551 != -1) {
                    super.field4597[0].method201(0, super.field4551, 0);
                }
            }
            super.field4597[1] = null;
            if (!this.field1769 && ~super.field4578 != 0 && ~super.field4577 != 0) {
                class135 var13 = class209.method1486(super.field4578, arg0 + -102);
                class305 var14 = var13.method1041(var4 | (!var13.field2085 ? 2 : 7), super.field4577, arg1, arg0 ^ -77, super.field4552, super.field4586);
                if (var14 != null) {
                    var14.method201(0, -super.field4545, 0);
                    if (var13.field2085 && (~var8 != -1 || ~var9 != -1)) {
                        if (~super.field4554 != -1) {
                            var14.method207(super.field4554);
                        }
                        if (~super.field4548 != -1) {
                            var14.method197(super.field4548);
                        }
                        if (super.field4551 != 0) {
                            var14.method201(0, super.field4551, 0);
                        }
                    }
                    super.field4597[1] = var14;
                }
            }
            super.field4597[2] = null;
            if (!this.field1769 && super.field4600 != null) {
                if (class34.field434 >= super.field4598) {
                    super.field4600 = null;
                }
                if (~super.field4602 >= ~class34.field434 && ~super.field4598 < ~class34.field434) {
                    class305 var15 = super.field4600.method614(arg0 ^ -55, var4 | 7, arg1);
                    if (var15 != null) {
                        var15.method201(-super.field4463 + super.field4605, -super.field4457 + super.field4592, -super.field4466 + super.field4593);
                        if (~var12 != -1) {
                            var15.method198(16383 & -var12);
                        }
                        super.field4597[2] = var15;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BLvq;)Lbf;")
    public final class316 method15(byte arg0, class269 arg1) {
        ++field1788;
        if (this.field1778 != null && this.method784((byte) 113, arg1, 1024)) {
            int var3 = 19 % ((-8 - arg0) / 51);
            class154 var4 = arg1.method884();
            int var5 = super.field4570.method2426(126);
            var4.method1136(var5);
            var4.method1134(super.field4463, super.field4457, super.field4466);
            float var6 = arg1.method988();
            float var7 = arg1.method866();
            if (class79.field1027) {
                class3 var8 = this.method2093(-1498200479);
                if (var8.field55 && (this.field1778.field4392 == -1 || class171.method1222(this.field1778.field4392, 127).field4983)) {
                    class183 var9 = ~super.field4558 != 0 && super.field4535 == 0 ? class110.method671(-21965, super.field4558) : null;
                    class183 var10 = ~super.field4537 == 0 || this.field1769 || super.field4513 && var9 != null ? null : class110.method671(-21965, super.field4537);
                    class305 var11 = class135.method1039(arg1, 160, 1, var10 != null ? super.field4520 : super.field4566, super.field4597[0], 240, super.field4550, 0, var5, var10 != null ? var10 : var9, super.field4548, (byte) 78, 0, super.field4551, super.field4554);
                    if (var11 != null) {
                        arg1.method956(var6, var7 - 128.0F);
                        arg1.method874(false);
                        var11.method230(var4, (class144) null, 0);
                        arg1.method874(true);
                    }
                }
            }
            if (class181.field2555 == this) {
                arg1.method956(var6, var7 - 144.0F);
                var4.method1133(super.field4463, super.field4457, super.field4466);
                for (int var12 = class209.field2990.length + -1; var12 >= 0; --var12) {
                    class136 var13 = class209.field2990[var12];
                    if (var13 != null && var13.field2099 != -1) {
                        if (~var13.field2097 == -2 && var13.field2101 >= 0 && class442.field6317.length > var13.field2101) {
                            class446 var14 = class442.field6317[var13.field2101];
                            if (var14 != null) {
                                int var15 = var14.field4463 / 32 + -(class181.field2555.field4463 / 32);
                                int var16 = var14.field4466 / 32 + -(class181.field2555.field4466 / 32);
                                this.method781(var4, var15, (byte) 95, var13.field2099, var16, super.field4597[0], 360000, arg1);
                            }
                        }
                        if (~var13.field2097 == -3) {
                            int var17 = (-class306.field4459 + var13.field2102) * 4 + -(class181.field2555.field4463 / 32) + 2;
                            int var18 = (var13.field2106 - class342.field4959) * 4 + 2 + -(class181.field2555.field4466 / 32);
                            int var19 = var13.field2104 * 4;
                            int var20 = var19 * var19;
                            this.method781(var4, var17, (byte) 117, var13.field2099, var18, super.field4597[0], var20, arg1);
                        }
                        if (var13.field2097 == 10 && ~var13.field2101 <= -1 && ~var13.field2101 > ~class243.field3596.length) {
                            class128 var21 = class243.field3596[var13.field2101];
                            if (var21 != null) {
                                int var22 = var21.field4463 / 32 + -(class181.field2555.field4463 / 32);
                                int var23 = var21.field4466 / 32 + -(class181.field2555.field4466 / 32);
                                this.method781(var4, var22, (byte) 52, var13.field2099, var23, super.field4597[0], 360000, arg1);
                            }
                        }
                    }
                }
                var4.method1136(var5);
                var4.method1134(super.field4463, super.field4457, super.field4466);
            }
            arg1.method956(var6, var7);
            class316 var24 = class105.method616(-15465, super.field4597.length);
            if (super.field4590 == null) {
                arg1.method917(super.field4597, var4, var24.field4631, class181.field2555 == this ? 1 : 0);
            } else {
                class235 var25 = super.field4590.method2152();
                arg1.method1008(super.field4597, var25, var4, var24.field4631, class181.field2555 == this ? 1 : 0);
            }
            this.method2085(false, super.field4597, false, arg1);
            if (super.field4597[2] != null) {
                if (~var5 != -1) {
                    super.field4597[2].method198(var5);
                }
                super.field4597[2].method201(super.field4463 - super.field4605, super.field4457 - super.field4592, -super.field4593 + super.field4466);
            }
            return var24;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "(I)V")
    public static void method785(int arg0) {
        field1810 = null;
        field1796 = null;
        field1793 = null;
        if (arg0 != -3) {
            method786(-114, (byte) 87, 126, 46);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IBII)V")
    public static final void method786(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 27) {
            method785(46);
        }
        ++field1799;
        class129 var4 = class148.field2215[arg3][arg2];
        class347.method2276(arg0, var4 == null ? class2.field8 : var4, 0);
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)I")
    public final int method787(byte arg0) {
        if (arg0 != 43) {
            this.method15((byte) -14, (class269) null);
        }
        ++field1783;
        return this.field1786;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)V")
    public final void method613(byte arg0) {
        ++field1772;
        if (arg0 <= -56) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public final String method788(boolean arg0, int arg1) {
        ++field1807;
        if (arg1 <= 62) {
            this.method789(true, true);
        }
        String var3 = "";
        if (class134.field2067 != null) {
            var3 = var3 + class134.field2067[this.field1811];
        }
        int[] var4;
        if (this.field1775 == 1 && class429.field6101 != null) {
            var4 = class429.field6101;
        } else {
            var4 = class58.field773;
        }
        if (var4 != null && var4[this.field1811] != -1) {
            class294 var5 = class445.method2772(var4[this.field1811], 0);
            if (~var5.field4262 == -116) {
                var3 = var3 + var5.method1993(this.field1804 & 255, (byte) -80);
            } else {
                class334.method2191(true, "gdn1", new Throwable());
                var4[this.field1811] = -1;
            }
        }
        String var6;
        if (arg0) {
            var6 = var3 + this.field1784;
        } else {
            var6 = var3 + this.field1790;
        }
        if (class384.field5434 != null) {
            var6 = var6 + class384.field5434[this.field1811];
        }
        return var6;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
    public final String method789(boolean arg0, boolean arg1) {
        ++field1770;
        if (arg0) {
            this.method611((class269) null, false, (class198) null, 0, -43, (byte) -85, 17);
        }
        return arg1 ? this.field1784 : this.field1790;
    }
}
