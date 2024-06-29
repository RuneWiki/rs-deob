import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class98 extends class6 {

    @OriginalMember(owner = "client!th", name = "qc", descriptor = "I")
    public int field1776 = 0;

    @OriginalMember(owner = "client!th", name = "oc", descriptor = "I")
    public int field1774 = -1;

    @OriginalMember(owner = "client!th", name = "Bc", descriptor = "I")
    public int field1787 = -1;

    @OriginalMember(owner = "client!th", name = "xc", descriptor = "B")
    private byte field1783 = 0;

    @OriginalMember(owner = "client!th", name = "Lc", descriptor = "I")
    public int field1797 = -1;

    @OriginalMember(owner = "client!th", name = "Nc", descriptor = "I")
    public int field1799 = 0;

    @OriginalMember(owner = "client!th", name = "Pc", descriptor = "Z")
    public boolean field1801 = false;

    @OriginalMember(owner = "client!th", name = "Mc", descriptor = "I")
    public int field1798 = -1;

    @OriginalMember(owner = "client!th", name = "Gc", descriptor = "I")
    public int field1792 = -1;

    @OriginalMember(owner = "client!th", name = "uc", descriptor = "I")
    public int field1780 = -1;

    @OriginalMember(owner = "client!th", name = "wc", descriptor = "I")
    public int field1782 = 0;

    @OriginalMember(owner = "client!th", name = "Cc", descriptor = "B")
    private byte field1788 = 0;

    @OriginalMember(owner = "client!th", name = "Uc", descriptor = "I")
    public int field1806 = 255;

    @OriginalMember(owner = "client!th", name = "Rc", descriptor = "I")
    public int field1803 = 0;

    @OriginalMember(owner = "client!th", name = "Ac", descriptor = "I")
    public int field1786 = -1;

    @OriginalMember(owner = "client!th", name = "Xc", descriptor = "I")
    public int field1809 = 0;

    @OriginalMember(owner = "client!th", name = "sc", descriptor = "I")
    public static int field1778 = 0;

    @OriginalMember(owner = "client!th", name = "Wc", descriptor = "[I")
    public static int[] field1808 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!th", name = "rc", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!th", name = "vc", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!th", name = "yc", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!th", name = "zc", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!th", name = "Dc", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!th", name = "Fc", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!th", name = "Hc", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!th", name = "Ic", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!th", name = "Jc", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!th", name = "Kc", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!th", name = "Oc", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!th", name = "Qc", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!th", name = "Sc", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!th", name = "Tc", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!th", name = "Vc", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!th", name = "nc", descriptor = "Lol;")
    public static class258 field1773;

    @OriginalMember(owner = "client!th", name = "pc", descriptor = "Lkk;")
    public class260 field1775;

    @OriginalMember(owner = "client!th", name = "tc", descriptor = "Ljava/lang/String;")
    public String field1779;

    @OriginalMember(owner = "client!th", name = "Ec", descriptor = "Ljava/lang/String;")
    public String field1790;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIIILgl;Lhb;IIIIII)V", line = 11)
    private final void method742(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class214 arg8, class42 arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        field1802++;
        if (arg13 != -150) {
            this.field1782 = -28;
        }
        int var17 = arg4 * arg4 + arg12 * arg12;
        if (var17 < 16 || arg0 < var17) {
            return;
        }
        int var18 = (int) (Math.atan2((double) arg12, (double) arg4) * 325.949D) & 0x7FF;
        class42 var19 = class82.method608((byte) 105, this.field199, this.field213, this.field136, var18, arg9, arg3);
        if (var19 == null) {
            return;
        }
        if (!class241.field4016) {
            var19.method327(0, arg2, arg1, arg6, arg5, arg7, arg11, arg10, -1L, arg14, arg8);
            return;
        }
        float var20 = class241.method1722();
        float var21 = class241.method1706();
        class241.method1689();
        class241.method1698(var20, var21 - 150.0F);
        var19.method327(0, arg2, arg1, arg6, arg5, arg7, arg11, arg10, -1L, arg14, arg8);
        class241.method1700();
        class241.method1698(var20, var21);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZZ)Ljava/lang/String;", line = 55)
    public final String method743(boolean arg0, boolean arg1) {
        if (arg0) {
            field1807++;
            return arg1 ? this.field1790 : this.field1779;
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)V", line = 76)
    public final void method334(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1793++;
        if (!this.field142) {
            if (this.field1775 == null) {
                return;
            }
            class300 var6 = this.field166 != -1 && this.field180 == 0 ? class258.method1807(this.field166, 63) : null;
            class300 var7 = this.field206 == -1 || this.field1801 || this.field206 == this.method60(true).field106 && var6 != null ? null : class258.method1807(this.field206, 73);
            class42 var8 = this.field1775.method1835(this.field210, false, this.field149, (byte) -94, this.field167, var7, var6, false, this.field150, this.field177, this.field203, this.field220);
            if (var8 == null) {
                return;
            }
            this.method53(var8, (class42) null, (byte) 31);
        }
        if (this.field207 != null) {
            this.field207.method1483(arg0, arg1, arg3, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V", line = 110)
    public static final void method744(int arg0) {
        class23.field575.method889((byte) -5);
        if (arg0 != 15022) {
            method748(16, -5);
        }
        field1791++;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Z", line = 126)
    public final boolean method45(byte arg0) {
        field1781++;
        if (arg0 != -95) {
            this.field1783 = -5;
        }
        return this.field1775 != null;
    }

    @OriginalMember(owner = "client!th", name = "finalize", descriptor = "()V", line = 141)
    protected final void finalize() {
        if (this.field207 != null) {
            this.field207.method1486();
        }
        field1794++;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)I", line = 154)
    public final int method49(byte arg0) {
        field1784++;
        int var2 = -80 / ((arg0 + 9) / 55);
        return this.field1775 == null || this.field1775.field4248 == -1 ? super.method49((byte) 114) : class133.method934(this.field1775.field4248, (byte) 118).field1565;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)I", line = 171)
    public final int method54(boolean arg0) {
        field1796++;
        return arg0 ? 113 : this.field175;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIIIJILgl;)V", line = 187)
    public final void method327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class214 arg10) {
        field1785++;
        if (this.field1775 == null) {
            return;
        }
        class300 var13 = this.field166 != -1 && this.field180 == 0 ? class258.method1807(this.field166, 82) : null;
        class5 var14 = this.method60(true);
        boolean var15 = var14.field105 != 0 || var14.field78 != 0 || var14.field95 != 0 || var14.field84 != 0;
        class300 var16 = this.field206 == -1 || this.field1801 || this.field206 == this.method60(true).field106 && var13 != null ? null : class258.method1807(this.field206, 79);
        class42 var17 = this.field1775.method1835(this.field210, var15, this.field149, (byte) -20, this.field167, var16, var13, true, this.field150, this.field177, this.field203, this.field220);
        int var18 = class78.method589(-62);
        if (class241.field4016 && class58.field1148 < 96 && var18 > 50) {
            class123.method884(false);
        }
        if (class217.field3620 != 0 && var18 < 50) {
            int var19 = 50 - var18;
            while (class57.field1123 < var19) {
                class12.field375[class57.field1123] = new byte[102400];
                class57.field1123++;
            }
            while (class57.field1123 > var19) {
                class57.field1123--;
                class12.field375[class57.field1123] = null;
            }
        }
        if (var17 == null) {
            return;
        }
        this.field185 = var17.method340();
        if (class252.field4143 && (this.field1775.field4248 == -1 || class133.method934(this.field1775.field4248, (byte) -14).field1559)) {
            class42 var20 = class314.method2269(1, var17, 0, this.field199, 0, this.field213, var16 == null ? this.field220 : this.field150, 64, this.field136, 240, this.field189, arg0, 160, var16 == null ? var13 : var16);
            if (class241.field4016) {
                float var21 = class241.method1722();
                float var22 = class241.method1706();
                class241.method1689();
                class241.method1698(var21, var22 - 150.0F);
                var20.method327(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class214) null);
                class241.method1700();
                class241.method1698(var21, var22);
            } else {
                var20.method327(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class214) null);
            }
        }
        if (class96.field1750 == this) {
            for (int var23 = class120.field2140.length - 1; var23 >= 0; var23--) {
                class68 var24 = class120.field2140[var23];
                if (var24 != null && var24.field1268 != -1) {
                    if (var24.field1253 == 1 && var24.field1264 >= 0 && var24.field1264 < class149.field2533.length) {
                        class314 var25 = class149.field2533[var24.field1264];
                        if (var25 != null) {
                            int var26 = var25.field199 / 32 - (class96.field1750.field199 / 32);
                            int var27 = var25.field213 / 32 - class96.field1750.field213 / 32;
                            this.method742(360000, arg2, arg1, var24.field1268, var27, arg4, arg3, arg5, (class214) null, var17, arg7, arg6, var26, -150, arg9, arg0);
                        }
                    }
                    if (var24.field1253 == 2) {
                        int var28 = (var24.field1275 - class272.field4426) * 4 + 2 - (class96.field1750.field199 / 32);
                        int var29 = (var24.field1257 - class21.field543) * 4 + 2 - (class96.field1750.field213 / 32);
                        int var30 = var24.field1259 * 4;
                        int var31 = var30 * var30;
                        this.method742(var31, arg2, arg1, var24.field1268, var29, arg4, arg3, arg5, (class214) null, var17, arg7, arg6, var28, -150, arg9, arg0);
                    }
                    if (var24.field1253 == 10 && var24.field1264 >= 0 && class182.field3151.length > var24.field1264) {
                        class98 var32 = class182.field3151[var24.field1264];
                        if (var32 != null) {
                            int var33 = var32.field199 / 32 - (class96.field1750.field199 / 32);
                            int var34 = var32.field213 / 32 - class96.field1750.field213 / 32;
                            this.method742(360000, arg2, arg1, var24.field1268, var34, arg4, arg3, arg5, (class214) null, var17, arg7, arg6, var33, -150, arg9, arg0);
                        }
                    }
                }
            }
        }
        this.method59(-89, var17);
        this.method58(4, var17, arg0);
        class42 var35 = null;
        if (!this.field1801 && this.field127 != -1 && this.field147 != -1) {
            class198 var36 = class134.method944(1, this.field127);
            var35 = var36.method1357(this.field147, this.field153, this.field204, -11);
            if (var35 != null) {
                var35.method353(0, -this.field159, 0);
                if (var36.field3328) {
                    if (class190.field3226 != 0) {
                        var35.method344(class190.field3226);
                    }
                    if (class54.field1084 != 0) {
                        var35.method329(class54.field1084);
                    }
                    if (class318.field5175 != 0) {
                        var35.method353(0, class318.field5175, 0);
                    }
                }
            }
        }
        class42 var37 = null;
        if (!this.field1801 && this.field141 != null) {
            if (this.field200 <= class267.field4371) {
                this.field141 = null;
            }
            if (this.field143 <= class267.field4371 && this.field200 > class267.field4371) {
                if ((this.field141 instanceof class86)) {
                    var37 = (class42) ((class86) this.field141).method654((byte) -51);
                } else {
                    var37 = (class42) this.field141;
                }
                var37.method353(this.field125 - this.field199, this.field119 - this.field136, this.field198 - this.field213);
                if (this.field144 == 512) {
                    var37.method354();
                } else if (this.field144 == 1024) {
                    var37.method341();
                } else if (this.field144 == 1536) {
                    var37.method343();
                }
            }
        }
        if (class241.field4016) {
            this.method53(var17, var35, (byte) 69);
            var17.field895 = true;
            var17.method327(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field207);
            if (var35 != null) {
                if (this.field207 != null) {
                    class294 var38 = (class294) var35;
                    this.field207.method1491(var38.field4780, var38.field4772, true, var38.field4753, var38.field4759, var38.field4762);
                }
                var35.field895 = true;
                var35.method327(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field207);
            }
        } else {
            if (var35 != null) {
                var17 = ((class95) var17).method725(var35);
            }
            if (var37 != null) {
                var17 = ((class95) var17).method725(var37);
            }
            this.method53(var17, var35, (byte) 50);
            var17.field895 = true;
            var17.method327(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field207);
        }
        if (var37 == null) {
            return;
        }
        if (this.field144 == 512) {
            var37.method343();
        } else if (this.field144 == 1024) {
            var37.method341();
        } else if (this.field144 == 1536) {
            var37.method354();
        }
        var37.method353(this.field199 - this.field125, -this.field119 + this.field136, this.field213 - this.field198);
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)I", line = 448)
    public final int method56(int arg0) {
        int var2 = 119 / ((arg0 - 68) / 33);
        field1789++;
        return -1;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IILoe;)V", line = 468)
    public final void method745(int arg0, int arg1, class146 arg2) {
        field1805++;
        arg2.field2435 = 0;
        int var4 = arg2.method1005((byte) 122);
        boolean var5 = (var4 & 0x4) != 0;
        boolean var6 = (var4 & 0x2) != 0;
        int var7 = var4 & 0x1;
        int var8 = super.method49((byte) -114);
        int[] var9 = new int[12];
        int var10 = -1;
        this.method48(((var4 & 0x3C) >> 3) + 1, 0);
        this.field1783 = (byte) ((var4 & 0xC3) >> 6);
        this.field199 += (this.method49((byte) 61) - var8) * 64;
        this.field213 += (this.method49((byte) -94) - var8) * 64;
        this.field1788 = arg2.method1029(-2);
        this.field1780 = arg2.method1029(-2);
        this.field1792 = arg2.method1029(arg0 ^ 0xFFFFFFFE);
        this.field1782 = 0;
        for (int var11 = 0; var11 < 12; var11++) {
            int var12 = arg2.method1005((byte) 122);
            if (var12 == 0) {
                var9[var11] = 0;
            } else {
                int var13 = arg2.method1005((byte) 122);
                int var14 = (var12 << 8) + var13;
                if (var11 == 0 && var14 == 65535) {
                    var10 = arg2.method989(66);
                    this.field1782 = arg2.method1005((byte) 122);
                    break;
                }
                if (var14 >= 32768) {
                    int var15 = class25.field644[var14 - 32768];
                    var9[var11] = class287.method2034(1073741824, var15);
                    int var16 = class296.method2124(0, var15).field353;
                    if (var16 != 0) {
                        this.field1782 = var16;
                    }
                } else {
                    var9[var11] = class287.method2034(var14 - 256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var17 = new int[5];
        for (int var18 = arg0; var18 < 5; var18++) {
            int var19 = arg2.method1005((byte) 122);
            if (var19 < 0 || var19 >= class273.field4446[var18].length) {
                var19 = 0;
            }
            var17[var18] = var19;
        }
        this.field175 = arg2.method989(arg0 ^ 0x54);
        this.field1790 = arg2.method1017((byte) -122);
        if (var6) {
            this.field1779 = arg2.method1017((byte) -120);
        } else {
            this.field1779 = this.field1790;
        }
        this.field1776 = arg2.method1005((byte) 122);
        if (var5) {
            this.field1803 = arg2.method989(81);
            this.field1809 = this.field1776;
            this.field1774 = -1;
        } else {
            this.field1803 = 0;
            this.field1809 = arg2.method1005((byte) 122);
            this.field1774 = arg2.method1005((byte) 122);
            if (this.field1774 == 255) {
                this.field1774 = -1;
            }
        }
        int var20 = this.field1799;
        this.field1799 = arg2.method1005((byte) 122);
        if (this.field1799 == 0) {
            class318.method2289(arg1, this, 278577584);
        } else {
            int var21 = this.field1787;
            int var22 = this.field1798;
            int var23 = this.field1797;
            int var24 = this.field1786;
            int var25 = this.field1806;
            this.field1787 = arg2.method989(92);
            this.field1797 = arg2.method989(67);
            this.field1798 = arg2.method989(90);
            this.field1786 = arg2.method989(103);
            this.field1806 = arg2.method1005((byte) 122);
            if (this.field1799 != var20 || this.field1787 != var21 || this.field1797 != var23 || this.field1798 != var22 || this.field1786 != var24 || this.field1806 != var25) {
                class104.method781(arg1, 16420, this);
            }
        }
        if (this.field1775 == null) {
            this.field1775 = new class260();
        }
        int var26 = this.field1775.field4248;
        this.field1775.method1825(var9, var17, this.field175, -1, var7 == 1, var10);
        if (var10 != var26) {
            this.field199 = this.field139[0] * 128 + (this.method49((byte) 76) * 64);
            this.field213 = this.field170[0] * 128 + this.method49((byte) 53) * 64;
        }
        if (this.field207 != null) {
            this.field207.method1480();
        }
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(B)V", line = 635)
    public static void method746(byte arg0) {
        if (arg0 < 83) {
            method744(85);
        }
        field1773 = null;
        field1808 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZI)Ljava/lang/String;", line = 647)
    public final String method747(boolean arg0, int arg1) {
        String var3 = "";
        field1777++;
        if (class338.field5358 != null) {
            var3 = var3 + class338.field5358[this.field1783];
        }
        if (class275.field4483 != null && class275.field4483[this.field1783] != -1) {
            class99 var4 = class155.method1103(class275.field4483[this.field1783], -2);
            if (var4.field1820 == 's') {
                var3 = var3 + var4.method759(this.field1788 & 0xFF, (byte) 84);
            } else {
                class348.method2493(-26700, new Throwable(), "gdn1");
                class275.field4483[this.field1783] = -1;
            }
        }
        String var5;
        if (arg0) {
            var5 = var3 + this.field1790;
        } else {
            var5 = var3 + this.field1779;
        }
        if (class22.field553 != null) {
            var5 = var5 + class22.field553[this.field1783];
        }
        if (arg1 <= 59) {
            this.field1788 = -97;
        }
        return var5;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(II)V", line = 692)
    public static final void method748(int arg0, int arg1) {
        int var2 = class16.field462;
        int var3 = class141.field2380;
        field1804++;
        int var4 = class223.field3693;
        int var5 = class18.field500;
        int var6 = (int) class87.field1523;
        if (var6 < (class284.field4656 / 256)) {
            var6 = class284.field4656 / 256;
        }
        int var7 = class298.field4847;
        if (class195.field3271[4] && var6 < (class231.field3790[4] + 128)) {
            var6 = class231.field3790[4] + 128;
        }
        int var8 = (int) class354.field5652 + class12.field372 & 0x7FF;
        class144.method984((var6 * 3) + 600, class33.field724, class244.field4052, var6, (byte) 29, arg1, class21.method189((byte) 50, class96.field1750.field213, class96.field1750.field199, class276.field4506) - 50, var8);
        if (class223.field3693 == var4 && class141.field2380 == var3 && class16.field462 == var2 && class298.field4847 == var7 && class18.field500 == var5) {
            class69.field1280 = 1;
            return;
        }
        class55.field1088 = 10;
        class14.field424 = 10;
        if (class141.field2380 > var3) {
            var3 += (class141.field2380 - var3) * class14.field424 / 1000 + class55.field1088;
            if (var3 < class141.field2380) {
                class141.field2380 = var3;
            }
        }
        int var9 = class18.field500 - var5;
        if (class16.field462 > var2) {
            var2 += (class16.field462 - var2) * class14.field424 / 1000 + class55.field1088;
            if (class16.field462 > var2) {
                class16.field462 = var2;
            }
        }
        if (class223.field3693 > var4) {
            var4 += (class223.field3693 - var4) * class14.field424 / 1000 + class55.field1088;
            if (class223.field3693 > var4) {
                class223.field3693 = var4;
            }
        }
        if (var4 > class223.field3693) {
            int var10 = var4 - (class55.field1088 + ((var4 - class223.field3693) * class14.field424 / 1000));
            if (class223.field3693 < var10) {
                class223.field3693 = var10;
            }
        }
        if (class141.field2380 < var3) {
            int var11 = var3 - ((var3 - class141.field2380) * class14.field424 / 1000 + class55.field1088);
            if (class141.field2380 < var11) {
                class141.field2380 = var11;
            }
        }
        if (arg0 != -9808) {
            return;
        }
        class6.field208 = 10;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var9 < -1024) {
            var9 += 2048;
        }
        class251.field4122 = 10;
        if (class16.field462 < var2) {
            int var12 = var2 - (class55.field1088 + ((var2 - class16.field462) * class14.field424 / 1000));
            if (class16.field462 < var12) {
                class16.field462 = var12;
            }
        }
        if (var9 > 0) {
            int var13 = class251.field4122 * var9 / 1000 + class6.field208 + var5;
            var5 = var13 & 0x7FF;
        }
        if (var7 < class298.field4847) {
            var7 += (class298.field4847 - var7) * class251.field4122 / 1000 + class6.field208;
            if (class298.field4847 > var7) {
                class298.field4847 = var7;
            }
        }
        if (class298.field4847 < var7) {
            int var14 = var7 - ((var7 - class298.field4847) * class251.field4122 / 1000 + class6.field208);
            if (class298.field4847 < var14) {
                class298.field4847 = var14;
            }
        }
        if (var9 < 0) {
            int var15 = var5 - (-var9 * class251.field4122 / 1000 + class6.field208);
            var5 = var15 & 0x7FF;
        }
        int var16 = class18.field500 - var5;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 >= 0 || var9 <= 0 || var16 > 0 && var9 < 0) {
            class18.field500 = var5;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "()I", line = 849)
    public final int method340() {
        field1800++;
        return this.field185;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZIII)V", line = 870)
    public final void method749(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -26866) {
            this.method49((byte) -115);
        }
        super.method50(arg3, arg2 ^ 0x302A, arg1, arg0, this.method49((byte) -126));
        field1795++;
    }
}
