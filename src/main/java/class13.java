import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class13 extends class200 {

    @OriginalMember(owner = "client!ba", name = "bb", descriptor = "I")
    private int field249 = 0;

    @OriginalMember(owner = "client!ba", name = "ab", descriptor = "I")
    public int field248 = -1;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "I")
    private int field234 = 0;

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "I")
    private int field241 = 128;

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "I")
    private int field244 = 128;

    @OriginalMember(owner = "client!ba", name = "hb", descriptor = "Z")
    public boolean field255 = false;

    @OriginalMember(owner = "client!ba", name = "db", descriptor = "I")
    private int field251 = 0;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "Ldj;")
    public static class44 field237 = class89.method650(255, "<img=1>");

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "Ls;")
    public static class190 field245 = new class190();

    @OriginalMember(owner = "client!ba", name = "jb", descriptor = "Ldj;")
    private static class44 field257 = class89.method650(255, "Ok");

    @OriginalMember(owner = "client!ba", name = "nb", descriptor = "I")
    public static int field261 = 0;

    @OriginalMember(owner = "client!ba", name = "ib", descriptor = "Ldj;")
    public static class44 field256 = field257;

    @OriginalMember(owner = "client!ba", name = "M", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client!ba", name = "cb", descriptor = "I")
    public static int field250;

    @OriginalMember(owner = "client!ba", name = "eb", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!ba", name = "fb", descriptor = "I")
    public int field253;

    @OriginalMember(owner = "client!ba", name = "gb", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!ba", name = "kb", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!ba", name = "lb", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!ba", name = "mb", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "[S")
    private short[] field233;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "[S")
    private short[] field236;

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "[S")
    private short[] field240;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "[S")
    private short[] field243;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILfj;I)V")
    private final void method112(int arg0, class66 arg1, int arg2) {
        field254++;
        if (arg2 != 0) {
            return;
        }
        if (arg0 == 1) {
            this.field247 = arg1.method500(120);
        } else if (arg0 == 2) {
            this.field248 = arg1.method500(arg2 + 87);
        } else if (arg0 == 4) {
            this.field241 = arg1.method500(59);
        } else if (arg0 == 5) {
            this.field244 = arg1.method500(84);
        } else if (arg0 == 6) {
            this.field234 = arg1.method500(43);
        } else if (arg0 == 7) {
            this.field251 = arg1.method506(arg2 ^ 0xFF);
            return;
        } else if (arg0 == 8) {
            this.field249 = arg1.method506(255);
            return;
        } else if (arg0 == 9) {
            this.field255 = true;
            return;
        } else if (arg0 == 40) {
            int var4 = arg1.method506(255);
            this.field236 = new short[var4];
            this.field243 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field236[var5] = (short) arg1.method500(arg2 + 74);
                this.field243[var5] = (short) arg1.method500(73);
            }
            return;
        } else if (arg0 == 41) {
            int var6 = arg1.method506(255);
            this.field233 = new short[var6];
            this.field240 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field240[var7] = (short) arg1.method500(54);
                this.field233[var7] = (short) arg1.method500(arg2 + 67);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V")
    public static final void method113(byte arg0) {
        field258++;
        int var1 = class150.field2620.method424(class221.field4007);
        if (arg0 <= 82) {
            method113((byte) 18);
        }
        for (int var2 = 0; var2 < class179.field3071; var2++) {
            int var6 = class150.field2620.method424(class137.method924(var2, (byte) -119));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        class58.field1086 = true;
        class7.field150 = class179.field3071 * 15 + 22;
        int var3 = class179.field3071 * 15 + 21;
        int var4 = class102.field1860;
        if (var4 + var3 > class169.field2926) {
            var4 = class169.field2926 - var3;
        }
        var1 += 8;
        int var5 = class180.field3108 - var1 / 2;
        if (var4 < 0) {
            var4 = 0;
        }
        if (class130.field2313 < var1 + var5) {
            var5 = class130.field2313 - var1;
        }
        class121.field2157 = var1;
        if (var5 < 0) {
            var5 = 0;
        }
        class122.field2176 = var4;
        class10.field212 = var5;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lfj;I)Ldj;")
    public static final class44 method114(class66 arg0, int arg1) {
        field252++;
        if (arg1 != -12769) {
            field237 = null;
        }
        return class92.method660(arg0, 0, 32767);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLdj;)V")
    public static final void method115(byte arg0, class44 arg1) {
        class35 var2 = class123.method843(false, arg1);
        field235++;
        if (var2 == null) {
            return;
        }
        class77.field1495 = var2.field632 - class198.field3502;
        int var3 = class77.field1495 + (int) ((double) class48.field895.field4130 / class202.field3601);
        int var4 = class77.field1495 - (int) ((double) class48.field895.field4130 / class202.field3601);
        class54.field994 = class214.field3851 + class136.field2431 - var2.field622;
        if (var4 < 0) {
            class77.field1495 = (int) ((double) class48.field895.field4130 / class202.field3601);
        }
        if (class168.field2896 < var3) {
            class77.field1495 = class168.field2896 - (int) ((double) class48.field895.field4130 / class202.field3601);
        }
        int var5 = class54.field994 - (int) ((double) class48.field895.field4134 / class202.field3601);
        int var6 = class54.field994 + (int) ((double) class48.field895.field4134 / class202.field3601);
        if (var5 < 0) {
            class54.field994 = (int) ((double) class48.field895.field4134 / class202.field3601);
        }
        if (var6 > class214.field3851) {
            class54.field994 = class214.field3851 - (int) ((double) class48.field895.field4134 / class202.field3601);
        }
        if (arg0 > -110) {
            method121(false);
        }
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(II)I")
    public static int method116(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZI)Llg;")
    public final class127 method117(boolean arg0, int arg1) {
        if (arg0) {
            method114(null, -40);
        }
        field239++;
        class127 var3 = (class127) class179.field3079.method677(1000, (long) this.field253);
        if (var3 == null) {
            class195 var4 = class195.method1271(class40.field757, this.field247, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field236 != null) {
                for (int var5 = 0; var5 < this.field236.length; var5++) {
                    var4.method1249(this.field236[var5], this.field243[var5]);
                }
            }
            if (this.field240 != null) {
                for (int var6 = 0; var6 < this.field240.length; var6++) {
                    var4.method1247(this.field240[var6], this.field233[var6]);
                }
            }
            var3 = var4.method1257(this.field251 + 64, this.field249 + 850, -30, -50, -30);
            class179.field3079.method675(var3, (long) this.field253, -32074);
        }
        class127 var7;
        if (this.field248 == -1 || arg1 == -1) {
            var7 = var3.method71(true);
        } else {
            var7 = class94.method672(this.field248, -109).method1322(arg1, -63, var3);
        }
        if (this.field241 != 128 || this.field244 != 128) {
            var7.method60(this.field241, this.field244, this.field241);
        }
        if (this.field234 != 0) {
            if (this.field234 == 90) {
                var7.method64();
            }
            if (this.field234 == 180) {
                var7.method44();
            }
            if (this.field234 == 270) {
                var7.method45();
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILca;IZ)V")
    public static final void method118(int arg0, class24 arg1, int arg2, boolean arg3) {
        if ((arg0 & 0x4) != 0) {
            int var4 = class218.field3957.method487(-32674);
            if (var4 == 65535) {
                var4 = -1;
            }
            int var5 = class218.field3957.method506(255);
            class180.method1135(arg1, var5, 107, var4);
        }
        if ((arg0 & 0x2) != 0) {
            arg1.field2259 = class218.field3957.method500(79);
            if (arg1.field2259 == 65535) {
                arg1.field2259 = -1;
            }
        }
        if ((arg0 & 0x80) != 0) {
            int var6 = class218.field3957.method506(255);
            int var7 = class218.field3957.method504((byte) -124);
            arg1.method853((byte) -124, var7, class46.field868, var6);
            arg1.field2225 = class46.field868 + 300;
            arg1.field2204 = class218.field3957.method506(255);
        }
        field246++;
        if ((arg0 & 0x40) != 0) {
            arg1.field2210 = class218.field3957.method500(124);
            arg1.field2246 = class218.field3957.method487(-32674);
        }
        if ((arg0 & 0x100) != 0) {
            int var8 = class218.field3957.method506(255);
            int var9 = class218.field3957.method504((byte) -124);
            arg1.method853((byte) -124, var9, class46.field868, var8);
        }
        if ((arg0 & 0x200) != 0) {
            arg1.field2205 = class218.field3957.method500(49);
            int var10 = class218.field3957.method499(-1020228848);
            arg1.field2223 = class46.field868 + (var10 & 0xFFFF);
            if (arg1.field2205 == 65535) {
                arg1.field2205 = -1;
            }
            arg1.field2209 = var10 >> 16;
            arg1.field2221 = 0;
            if (arg1.field2223 > class46.field868) {
                arg1.field2221 = -1;
            }
            arg1.field2247 = 0;
        }
        if ((arg0 & 0x1) != 0) {
            int var11 = class218.field3957.method512((byte) 104);
            byte[] var12 = new byte[var11];
            class66 var13 = new class66(var12);
            class218.field3957.method507(0, var12, var11, 0);
            class128.field2276[arg2] = var13;
            arg1.method173((byte) -96, var13);
        }
        if ((arg0 & 0x10) != 0) {
            int var14 = class218.field3957.method487(-32674);
            int var15 = class218.field3957.method512((byte) 30);
            int var16 = class218.field3957.method504((byte) -124);
            int var17 = class218.field3957.field1195;
            if (arg1.field395 != null && arg1.field407 != null) {
                long var18 = arg1.field395.method306(-58);
                boolean var20 = false;
                if (var15 <= 1) {
                    for (int var21 = 0; var21 < class37.field664; var21++) {
                        if (class154.field2686[var21] == var18) {
                            var20 = true;
                            break;
                        }
                    }
                }
                if (!var20 && class230.field4311 == 0) {
                    class218.field3952.field1195 = 0;
                    class218.field3957.method520(class218.field3952.field1219, 0, -128, var16);
                    class218.field3952.field1195 = 0;
                    int var22 = -1;
                    boolean var23 = (var14 & 0x8000) != 0;
                    class44 var25;
                    if (var23) {
                        var14 &= 0x7FFF;
                        class151 var24 = class64.method474((byte) -115, class218.field3952);
                        var22 = var24.field2628;
                        var25 = var24.field2635.method436(class218.field3952, (byte) 93);
                    } else {
                        var25 = class56.method419(method114(class218.field3952, -12769).method322(true));
                    }
                    arg1.field2262 = var25.method339(-11196);
                    arg1.field2227 = var14 & 0xFF;
                    arg1.field2230 = var14 >> 8;
                    arg1.field2238 = 150;
                    if (var15 == 2) {
                        class190.method1191(null, -29786, class70.method555(new class44[] { class79.field1525, arg1.field395 }, -3), var23 ? 17 : 1, var25, var22);
                    } else if (var15 == 1) {
                        class190.method1191(null, -29786, class70.method555(new class44[] { class172.field3003, arg1.field395 }, -3), var23 ? 17 : 1, var25, var22);
                    } else {
                        class190.method1191(null, -29786, arg1.field395, var23 ? 17 : 2, var25, var22);
                    }
                }
            }
            class218.field3957.field1195 = var17 + var16;
        }
        if ((arg0 & 0x8) != 0) {
            arg1.field2262 = class218.field3957.method496(true);
            if (arg1.field2262.method302(-12540, 0) == 126) {
                arg1.field2262 = arg1.field2262.method332(1, (byte) 57);
                class226.method1484(arg1.field2262, 0, 2, arg1.field395);
            } else if (class96.field1774 == arg1) {
                class226.method1484(arg1.field2262, 0, 2, arg1.field395);
            }
            arg1.field2238 = 150;
            arg1.field2227 = 0;
            arg1.field2230 = 0;
        }
        if (arg3) {
            field257 = null;
        }
        if ((arg0 & 0x400) == 0) {
            return;
        }
        arg1.field2218 = class218.field3957.method512((byte) 85);
        arg1.field2233 = class218.field3957.method512((byte) 101);
        arg1.field2216 = class218.field3957.method534(-5738);
        arg1.field2217 = class218.field3957.method512((byte) 65);
        arg1.field2198 = class218.field3957.method529((byte) 123) + class46.field868;
        arg1.field2199 = class218.field3957.method529((byte) 123) + class46.field868;
        arg1.field2208 = class218.field3957.method504((byte) -124);
        arg1.field2203 = 0;
        arg1.field2194 = 1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLfj;)V")
    public final void method119(byte arg0, class66 arg1) {
        if (arg0 >= -13) {
            method121(false);
        }
        field242++;
        while (true) {
            int var3 = arg1.method506(255);
            if (var3 == 0) {
                return;
            }
            this.method112(var3, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[B[Lue;IIIIIBI)V")
    public static final void method120(int arg0, byte[] arg1, class215[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9) {
        field259++;
        if (arg8 <= 103) {
            field245 = null;
        }
        class66 var10 = new class66(arg1);
        int var11 = -1;
        while (true) {
            int var12 = var10.method530((byte) -94);
            if (var12 == 0) {
                return;
            }
            int var13 = 0;
            var11 += var12;
            while (true) {
                int var14 = var10.method530((byte) -72);
                if (var14 == 0) {
                    break;
                }
                var13 += var14 - 1;
                int var15 = var13 & 0x3F;
                int var16 = var13 >> 6 & 0x3F;
                int var17 = var13 >> 12;
                int var18 = var10.method506(255);
                int var19 = var18 & 0x3;
                int var20 = var18 >> 2;
                if (arg3 == var17 && arg7 <= var16 && arg7 + 8 > var16 && var15 >= arg5 && var15 < arg5 + 8) {
                    class39 var21 = class40.method281(true, var11);
                    int var22 = arg4 + class50.method364(var19, arg6, var16 & 0x7, var21.field698, var21.field725, var15 & 0x7, 126);
                    int var23 = class215.method1402(var21.field725, arg6, var19, var16 & 0x7, var21.field698, var15 & 0x7, (byte) -43) + arg0;
                    if (var22 > 0 && var23 > 0 && var22 < 103 && var23 < 103) {
                        class215 var24 = null;
                        int var25 = arg9;
                        if ((class47.field875[1][var22][var23] & 0x2) == 2) {
                            var25 = arg9 - 1;
                        }
                        if (var25 >= 0) {
                            var24 = arg2[var25];
                        }
                        class53.method380(class33.field583, var22, var24, var20, -109, var11, true, var23, var19 + arg6 & 0x3, arg9, arg9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(Z)V")
    public static void method121(boolean arg0) {
        field237 = null;
        field257 = null;
        field245 = null;
        if (arg0) {
            method115((byte) 30, null);
        }
        field256 = null;
    }
}
