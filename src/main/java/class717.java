import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class717 extends class170 {

    @OriginalMember(owner = "client!ih", name = "kd", descriptor = "I")
    public int field10230 = 1;

    @OriginalMember(owner = "client!ih", name = "Mc", descriptor = "I")
    public int field10224 = 1;

    @OriginalMember(owner = "client!ih", name = "Qc", descriptor = "I")
    public int field10213 = -1;

    @OriginalMember(owner = "client!ih", name = "Lc", descriptor = "I")
    public int field10215 = -1;

    @OriginalMember(owner = "client!ih", name = "nd", descriptor = "[Ljava/lang/String;")
    private static final String[] field10241 = new String[] { method5208(method5207("\ng\u001fWi")), method5208(method5207("\u0018!\u001f)<")), method5208(method5207("\rz]k")), method5208(method5207("\ng\u001fPi")), method5208(method5207("\ng\u001fL\u0000K")), method5208(method5207("\ng\u001fJ\u0000K")), method5208(method5207("\ng\u001fCi")), method5208(method5207("\ng\u001fDi")), method5208(method5207("\ng\u001fFi")), method5208(method5207("\ng\u001fMi")), method5208(method5207("\ng\u001fNi")), method5208(method5207("\ng\u001fI\u0000K")), method5208(method5207("\ng\u001fSi")), method5208(method5207("\ng\u001fA\u0000K")), method5208(method5207("\ng\u001fB\u0000K")), method5208(method5207("\ng\u001fK\u0000K")), method5208(method5207("\ng\u001fIi")), method5208(method5207("\ng\u001fM\u0000K")), method5208(method5207("\ng\u001fF\u0000K")), method5208(method5207("\ng\u001fEi")), method5208(method5207("\ng\u001f@i")) };

    @OriginalMember(owner = "client!ih", name = "Zc", descriptor = "F")
    public static float field10234;

    @OriginalMember(owner = "client!ih", name = "ed", descriptor = "I")
    public static int field10210;

    @OriginalMember(owner = "client!ih", name = "Jc", descriptor = "I")
    public int field10214;

    @OriginalMember(owner = "client!ih", name = "cd", descriptor = "I")
    public static int field10216;

    @OriginalMember(owner = "client!ih", name = "Wc", descriptor = "I")
    public static int field10217;

    @OriginalMember(owner = "client!ih", name = "Oc", descriptor = "I")
    public static int field10218;

    @OriginalMember(owner = "client!ih", name = "Pc", descriptor = "I")
    public static int field10219;

    @OriginalMember(owner = "client!ih", name = "hd", descriptor = "I")
    public static int field10220;

    @OriginalMember(owner = "client!ih", name = "Sc", descriptor = "I")
    public static int field10221;

    @OriginalMember(owner = "client!ih", name = "fd", descriptor = "I")
    public static int field10222;

    @OriginalMember(owner = "client!ih", name = "Xc", descriptor = "I")
    public static int field10223;

    @OriginalMember(owner = "client!ih", name = "Yc", descriptor = "I")
    public static int field10225;

    @OriginalMember(owner = "client!ih", name = "id", descriptor = "I")
    public static int field10226;

    @OriginalMember(owner = "client!ih", name = "ad", descriptor = "I")
    public static int field10227;

    @OriginalMember(owner = "client!ih", name = "Rc", descriptor = "I")
    public static int field10228;

    @OriginalMember(owner = "client!ih", name = "jd", descriptor = "I")
    public static int field10231;

    @OriginalMember(owner = "client!ih", name = "Tc", descriptor = "I")
    public static int field10232;

    @OriginalMember(owner = "client!ih", name = "dd", descriptor = "I")
    public static int field10233;

    @OriginalMember(owner = "client!ih", name = "md", descriptor = "I")
    public static int field10235;

    @OriginalMember(owner = "client!ih", name = "gd", descriptor = "I")
    public static int field10236;

    @OriginalMember(owner = "client!ih", name = "Ic", descriptor = "I")
    public static int field10237;

    @OriginalMember(owner = "client!ih", name = "Kc", descriptor = "I")
    public static int field10238;

    @OriginalMember(owner = "client!ih", name = "Uc", descriptor = "I")
    public static int field10239;

    @OriginalMember(owner = "client!ih", name = "Nc", descriptor = "I")
    public static int field10240;

    @OriginalMember(owner = "client!ih", name = "ld", descriptor = "Lqca;")
    public class134 field10229;

    @OriginalMember(owner = "client!ih", name = "Vc", descriptor = "Lija;")
    public class434 field10212;

    @OriginalMember(owner = "client!ih", name = "bd", descriptor = "Llga;")
    public static class47 field10209;

    @OriginalMember(owner = "client!ih", name = "Hc", descriptor = "Ljava/lang/String;")
    public String field10211;

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(III)V", line = 3)
    public final void method5199(int arg0, int arg1, int arg2) {
        try {
            ++field10210;
            int var4 = super.field2252[0];
            int var5 = super.field2256[0];
            if (~arg0 == -1) {
                ++var5;
            }
            if (arg0 == 1) {
                ++var5;
                ++var4;
            }
            if (arg0 == 2) {
                ++var4;
            }
            if (~arg0 == -4) {
                ++var4;
                --var5;
            }
            if (arg0 == 4) {
                --var5;
            }
            if (~arg0 == arg1) {
                --var5;
                --var4;
            }
            if (arg0 == 6) {
                --var4;
            }
            if (~arg0 == -8) {
                --var4;
                ++var5;
            }
            if (super.field2228.method835(false) && ~super.field2228.method846(arg1 + 12769).field6445 == -2) {
                super.field2194 = null;
                super.field2228.method840(-1, false);
            }
            for (int var6 = 0; ~super.field2230.length < ~var6; ++var6) {
                if (super.field2230[var6].field6627 != -1) {
                    class595 var7 = class11.field153.method3479(super.field2230[var6].field6627, arg1 + 115);
                    if (var7.field8546 && var7.field8565 != -1 && ~class10.field132.method1889(var7.field8565, true).field6445 == -2) {
                        super.field2230[var6].field6631.method840(-1, false);
                        super.field2230[var6].field6627 = -1;
                    }
                }
            }
            if (~super.field2257 > ~(super.field2252.length - 1)) {
                ++super.field2257;
            }
            for (int var8 = super.field2257; ~var8 < -1; --var8) {
                super.field2252[var8] = super.field2252[var8 + -1];
                super.field2256[var8] = super.field2256[var8 + -1];
                super.field2254[var8] = super.field2254[var8 - 1];
            }
            super.field2252[0] = var4;
            super.field2256[0] = var5;
            super.field2254[0] = (byte) arg2;
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field10241[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "(B)I", line = 102)
    public final int method1446(byte arg0) {
        try {
            ++field10220;
            if (this.field10229.field1659 != null) {
                class134 var2 = this.field10229.method1178(class734.field10459, (byte) -79);
                if (var2 != null && var2.field1671 != -1) {
                    return var2.field1671;
                }
            }
            return arg0 != 51 ? -124 : this.field10229.field1671;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10241[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "(B)I", line = 127)
    public final int method1439(byte arg0) {
        try {
            if (arg0 > -88) {
                this.method1734(101);
            }
            ++field10237;
            if (this.field10229.field1659 != null) {
                class134 var2 = this.field10229.method1178(class734.field10459, (byte) -101);
                if (var2 != null && ~var2.field1721 != 0) {
                    return var2.field1721;
                }
            }
            return this.field10229.field1721 != -1 ? this.field10229.field1721 : super.method1439((byte) -122);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10241[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)I", line = 150)
    public final int method1734(int arg0) {
        try {
            if (arg0 != 13720) {
                field10232 = -102;
            }
            ++field10225;
            return this.field10229 == null ? 0 : this.field10229.field1725;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10241[18] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IBILrfa;ZILha;)V", line = 176)
    public final void method40(int arg0, byte arg1, int arg2, class202 arg3, boolean arg4, int arg5, class18 arg6) {
        try {
            int var8 = -38 / ((9 - arg1) / 35);
            ++field10216;
            throw new IllegalStateException();
        } catch (RuntimeException var10) {
            throw class665.method4799(var10, field10241[20] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10241[1] : field10241[2]) + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field10241[1] : field10241[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lha;I)V", line = 194)
    public final void method586(class18 arg0, int arg1) {
        try {
            ++field10219;
            if (this.field10229 != null) {
                if (super.field2260 || this.method5203(arg0, (byte) 63, 0)) {
                    class104 var3 = arg0.method136();
                    var3.method719(super.field2234.method52(16383));
                    var3.method721(super.field2969, super.field2975 + -20, super.field2984);
                    this.method1429(super.field2259, var3, arg0, super.field2260, (byte) -4);
                    for (int var4 = arg1; super.field2259.length > var4; ++var4) {
                        super.field2259[var4] = null;
                    }
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10241[12] + (arg0 != null ? field10241[1] : field10241[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(B)V", line = 229)
    public final void method44(byte arg0) {
        try {
            if (arg0 <= 111) {
                field10222 = 26;
            }
            ++field10217;
            throw new IllegalStateException();
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10241[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lqca;I)V", line = 243)
    public final void method5200(class134 arg0, int arg1) {
        try {
            ++field10221;
            if (this.field10229 != arg0 && class86.field1217 && class41.method468(-124, super.field2200)) {
                class215.method1806(4);
            }
            if (arg1 == -1) {
                this.field10229 = arg0;
                if (this.field10229 != null) {
                    this.field10214 = this.field10229.field1665;
                    this.field10211 = this.field10229.field1690;
                }
                if (super.field2255 != null) {
                    super.field2255.method3571();
                }
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10241[15] + (arg0 != null ? field10241[1] : field10241[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lha;B)Lsba;", line = 270)
    public final class311 method587(class18 arg0, byte arg1) {
        try {
            ++field10226;
            if (arg1 <= 94) {
                this.field10215 = -120;
            }
            return null;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10241[0] + (arg0 != null ? field10241[1] : field10241[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)Z", line = 283)
    public final boolean method46(int arg0) {
        try {
            if (arg0 >= -97) {
                return false;
            } else {
                ++field10228;
                return false;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10241[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)V", line = 297)
    public static void method5201(int arg0) {
        try {
            field10209 = null;
            if (arg0 != 21130) {
                field10218 = 39;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field10241[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "(B)Z", line = 307)
    private final boolean method5202(byte arg0) {
        try {
            ++field10239;
            int var2 = -105 % ((-67 - arg0) / 45);
            return this.field10229.field1678;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10241[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lha;BI)Z", line = 317)
    private final boolean method5203(class18 arg0, byte arg1, int arg2) {
        try {
            ++field10223;
            int var4 = arg2;
            class765 var5 = this.method1430(arg1 ^ 27737);
            class84 var6 = super.field2228.method835(false) && !super.field2228.method826(-1) ? super.field2228 : null;
            class84 var7 = super.field2182.method835(false) && (!super.field2204 || var6 == null) ? super.field2182 : null;
            int var8 = var5.field10924;
            int var9 = var5.field10885;
            if (~var8 != -1 || ~var9 != -1 || ~var5.field10926 != -1 || ~var5.field10886 != -1) {
                arg2 |= 7;
            }
            boolean var10 = ~super.field2236 != -1 && ~super.field2249 >= ~class694.field9700 && class694.field9700 < super.field2245;
            if (var10) {
                arg2 |= 524288;
            }
            int var11 = super.field2234.method52(16383);
            class761 var12 = super.field2259[0] = this.field10229.method1171((byte) -115, var6, class734.field10459, var11, var7, arg0, arg2, class772.field10996, this.field10212, super.field2248, super.field2239);
            if (var12 == null) {
                return false;
            } else {
                if (arg1 != 63) {
                    this.method1734(19);
                }
                super.field2196 = var12.method432();
                super.field2193 = var12.method423();
                this.method1441(true, var12);
                if (var8 == 0 && var9 == 0) {
                    this.method1428(var11, 0, 0, this.method1437((byte) -28) << 9, this.method1437((byte) -28) << 9, true);
                } else {
                    this.method1428(var11, var5.field10936, var5.field10906, var8, var9, true);
                    if (super.field2173 != 0) {
                        super.field2259[0].method436(super.field2173);
                    }
                    if (~super.field2203 != -1) {
                        super.field2259[0].method437(super.field2203);
                    }
                    if (super.field2216 != 0) {
                        super.field2259[0].method430(0, super.field2216, 0);
                    }
                }
                if (var10) {
                    var12.method398(super.field2229, super.field2242, super.field2241, super.field2236 & 255);
                }
                this.method1434(var4, var11, -128, arg0, var5, var9, var8);
                return true;
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field10241[17] + (arg0 != null ? field10241[1] : field10241[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "(I)Z", line = 380)
    public final boolean method5204(int arg0) {
        try {
            if (arg0 < 13) {
                return true;
            } else {
                ++field10233;
                return this.field10229 != null;
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field10241[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lha;III)Z", line = 397)
    public final boolean method580(class18 arg0, int arg1, int arg2, int arg3) {
        try {
            ++field10235;
            if (this.field10229 != null && this.method5203(arg0, (byte) 63, 131072)) {
                class104 var5 = arg0.method136();
                int var6 = super.field2234.method52(16383);
                var5.method719(var6);
                var5.method721(super.field2969, super.field2975, super.field2984);
                boolean var7 = false;
                for (int var8 = 0; ~var8 > ~super.field2259.length; ++var8) {
                    if (super.field2259[var8] != null) {
                        boolean var10000;
                        label71: {
                            if (~this.field10229.field1725 >= -1) {
                                label69: {
                                    if (this.field10229.field1727 != -1) {
                                        if (this.field10229.field1727 == 1) {
                                            break label69;
                                        }
                                        var10000 = false;
                                    } else {
                                        if (~this.field10229.field1717 == -2) {
                                            break label69;
                                        }
                                        var10000 = false;
                                    }
                                    if (!var10000) {
                                        var10000 = false;
                                        break label71;
                                    }
                                }
                            }
                            var10000 = true;
                        }
                        boolean var9 = var10000;
                        boolean var10;
                        if (!class149.field1902) {
                            var10 = super.field2259[var8].method382(arg3, arg1, var5, var9, this.field10229.field1725);
                        } else {
                            var10 = super.field2259[var8].method440(arg3, arg1, var5, var9, this.field10229.field1725, class194.field2686);
                        }
                        if (var10) {
                            var7 = true;
                            break;
                        }
                    }
                }
                if (arg2 != -1) {
                    field10234 = -1.4966503F;
                }
                for (int var11 = 0; super.field2259.length > var11; ++var11) {
                    super.field2259[var11] = null;
                }
                return var7;
            } else {
                return false;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field10241[8] + (arg0 != null ? field10241[1] : field10241[2]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIZIII)V", line = 458)
    public final void method5205(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        try {
            ++field10231;
            if (arg3 != -12595) {
                field10234 = 0.766744F;
            }
            super.field2981 = super.field2971 = (byte) arg5;
            if (class23.method275(1, arg0, arg4)) {
                ++super.field2971;
            }
            if (super.field2228.method835(false) && ~super.field2228.method846(12763).field6445 == -2) {
                super.field2194 = null;
                super.field2228.method840(-1, false);
            }
            for (int var7 = 0; ~var7 > ~super.field2230.length; ++var7) {
                if (~super.field2230[var7].field6627 != 0) {
                    class595 var8 = class11.field153.method3479(super.field2230[var7].field6627, 112);
                    if (var8.field8546 && var8.field8565 != -1 && ~class10.field132.method1889(var8.field8565, true).field6445 == -2) {
                        super.field2230[var7].field6631.method840(-1, false);
                        super.field2230[var7].field6627 = -1;
                    }
                }
            }
            if (!arg2) {
                int var9 = -super.field2252[0] + arg0;
                int var10 = -super.field2256[0] + arg4;
                if (~var9 <= 7 && ~var9 >= -9 && ~var10 <= 7 && var10 <= 8) {
                    if (super.field2252.length - 1 > super.field2257) {
                        ++super.field2257;
                    }
                    for (int var11 = super.field2257; var11 > 0; --var11) {
                        super.field2252[var11] = super.field2252[var11 + -1];
                        super.field2256[var11] = super.field2256[var11 + -1];
                        super.field2254[var11] = super.field2254[var11 + -1];
                    }
                    super.field2252[0] = arg0;
                    super.field2256[0] = arg4;
                    super.field2254[0] = 1;
                    return;
                }
            }
            super.field2257 = 0;
            super.field2262 = 0;
            super.field2252[0] = arg0;
            super.field2258 = 0;
            super.field2256[0] = arg4;
            super.field2969 = (super.field2252[0] << 9) + (arg1 << 8);
            super.field2984 = (super.field2256[0] << 9) + (arg1 << 8);
            if (super.field2255 != null) {
                super.field2255.method3571();
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field10241[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lha;Z)V", line = 547)
    public static final void method5206(class18 arg0, boolean arg1) {
        try {
            if (arg1) {
                ++field10236;
                if (~class628.field8955.method3981(0) != -1) {
                    if (class451.field6612.field9134.method4717(3) == 0) {
                        for (class727 var2 = (class727) class628.field8955.method3977((byte) -90); var2 != null; var2 = (class727) class628.field8955.method3987(0)) {
                            class153.field1955.method3243(var2.field10420, arg0, (byte) 109, false, false, !var2.field10418 ? null : class203.field2988.field4901, class626.field8945, arg0, var2.field10416, var2.field10417, var2.field10419, var2.field10414);
                            var2.method4294(0);
                        }
                        class591.method4369(0);
                    } else {
                        if (class427.field6149 == null) {
                            Canvas var3 = new Canvas();
                            var3.setSize(36, 32);
                            class427.field6149 = class325.method2569(var3, 0, class194.field2701, class608.field8716, 0, 0);
                            class468.field6847 = class427.field6149.method145(class85.method854((byte) -116, class121.field1536, 0, class151.field1933), class66.method694(class524.field7640, class121.field1536, 0), true);
                        }
                        for (class727 var4 = (class727) class628.field8955.method3977((byte) -119); var4 != null; var4 = (class727) class628.field8955.method3987(0)) {
                            class153.field1955.method3243(var4.field10420, class427.field6149, (byte) 109, false, false, !var4.field10418 ? null : class203.field2988.field4901, class468.field6847, arg0, var4.field10416, var4.field10417, var4.field10419, var4.field10414);
                            var4.method4294(0);
                        }
                    }
                }
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field10241[5] + (arg0 != null ? field10241[1] : field10241[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(ZLha;)Lrs;", line = 602)
    public final class297 method573(boolean arg0, class18 arg1) {
        try {
            ++field10238;
            if (this.field10229 != null && this.method5203(arg1, (byte) 63, 2048)) {
                class104 var3 = arg1.method136();
                int var4 = super.field2234.method52(16383);
                var3.method719(var4);
                class621 var5 = class608.field8715[super.field2981][super.field2969 >> class179.field2328][super.field2984 >> class179.field2328];
                if (var5 != null && var5.field8850 != null) {
                    int var6 = -var5.field8850.field1543 + super.field2169;
                    super.field2169 = (int) ((float) super.field2169 - (float) var6 / 10.0F);
                } else {
                    super.field2169 = (int) ((float) super.field2169 - (float) super.field2169 / 10.0F);
                }
                var3.method721(super.field2969, super.field2975 + -20 + -super.field2169, super.field2984);
                class765 var7 = this.method1430(27750);
                class134 var8 = this.field10229.field1659 == null ? this.field10229 : this.field10229.method1178(class734.field10459, (byte) -112);
                super.field2261 = arg0;
                class297 var9 = null;
                if (~class451.field6612.field9109.method3729(3) == -2 && var8.field1729 && var7.field10909) {
                    class84 var10 = super.field2228.method835(false) && super.field2228.method826(-1) ? super.field2228 : null;
                    class84 var11 = super.field2182.method835(false) && (!super.field2204 || var10 == null) ? super.field2182 : null;
                    class761 var12 = class595.method4393(this.field10229.field1717, super.field2203, super.field2173, 255 & this.field10229.field1710, var4, (byte) 100, 255 & this.field10229.field1711, super.field2259[0], var11 != null ? var11 : var10, this.field10229.field1704 & 65535, arg1, super.field2216, 65535 & this.field10229.field1686);
                    if (var12 != null) {
                        var9 = class674.method4839(this.method5202((byte) -17), super.field2259.length - -1, 12853);
                        super.field2261 = true;
                        arg1.method119(false);
                        if (!class149.field1902) {
                            var12.method415(var3, var9.field4153[super.field2259.length], 0);
                        } else {
                            var12.method427(var3, var9.field4153[super.field2259.length], class194.field2686, 0);
                        }
                        arg1.method119(true);
                    }
                }
                var3.method719(var4);
                var3.method721(super.field2969, super.field2975 + -5 + -super.field2169, super.field2984);
                if (var9 == null) {
                    var9 = class674.method4839(this.method5202((byte) -117), super.field2259.length, 12853);
                }
                this.method1429(super.field2259, var3, arg1, false, (byte) -4);
                if (!class149.field1902) {
                    for (int var13 = 0; ~super.field2259.length < ~var13; ++var13) {
                        if (super.field2259[var13] != null) {
                            super.field2259[var13].method415(var3, var9.field4153[var13], 0);
                        }
                    }
                } else {
                    for (int var14 = 0; var14 < super.field2259.length; ++var14) {
                        if (super.field2259[var14] != null) {
                            super.field2259[var14].method427(var3, var9.field4153[var14], class194.field2686, 0);
                        }
                    }
                }
                if (super.field2255 != null) {
                    class788 var15 = super.field2255.method3565();
                    if (!class149.field1902) {
                        arg1.method126(var15);
                    } else {
                        arg1.method193(var15, class194.field2686);
                    }
                }
                for (int var16 = 0; var16 < super.field2259.length; ++var16) {
                    if (super.field2259[var16] != null) {
                        super.field2261 |= super.field2259[var16].method422();
                    }
                }
                super.field2186 = class671.field9454;
                super.field2259[0] = super.field2259[1] = super.field2259[2] = null;
                return var9;
            } else {
                return null;
            }
        } catch (RuntimeException var18) {
            throw class665.method4799(var18, field10241[7] + arg0 + ',' + (arg1 != null ? field10241[1] : field10241[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)I", line = 726)
    public final int method1443(int arg0) {
        try {
            ++field10240;
            if (this.field10229.field1659 != null) {
                class134 var2 = this.field10229.method1178(class734.field10459, (byte) -99);
                if (var2 != null && ~var2.field1660 != 0) {
                    return var2.field1660;
                }
            }
            if (arg0 != 5247) {
                field10222 = 81;
            }
            return this.field10229.field1660;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field10241[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5207(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 65);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ih", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5208(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 99;
                    break;
                case 1:
                    var10005 = 15;
                    break;
                case 2:
                    var10005 = 49;
                    break;
                case 3:
                    var10005 = 7;
                    break;
                default:
                    var10005 = 65;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
