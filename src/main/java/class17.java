import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class17 extends class97 {

    @OriginalMember(owner = "client!bg", name = "Cb", descriptor = "Lnd;")
    public static class127 field316 = new class127(64);

    @OriginalMember(owner = "client!bg", name = "Mb", descriptor = "[I")
    public static int[] field326 = new int[32];

    @OriginalMember(owner = "client!bg", name = "xb", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!bg", name = "yb", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!bg", name = "zb", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!bg", name = "Ab", descriptor = "I")
    private int field314;

    @OriginalMember(owner = "client!bg", name = "Bb", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!bg", name = "Db", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!bg", name = "Eb", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!bg", name = "Fb", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!bg", name = "Gb", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!bg", name = "Hb", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!bg", name = "Ib", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!bg", name = "Jb", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!bg", name = "Nb", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!bg", name = "Kb", descriptor = "Lud;")
    public static class190 field324;

    @OriginalMember(owner = "client!bg", name = "Lb", descriptor = "Lgd;")
    private class63 field325;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZI)I")
    public final int method104(boolean arg0, int arg1) {
        ++field320;
        if (arg0) {
            this.method108((int[]) null, (byte) 55);
        }
        return arg1 * 8 - this.field314;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(ZI)V")
    public static final void method105(boolean arg0, int arg1) {
        if (~(class46.field872.field635 >> 7) == ~class40.field751 && ~(class46.field872.field614 >> 7) == ~class153.field2741) {
            class40.field751 = 0;
        }
        if (arg1 != 28958) {
            field316 = null;
        }
        ++field318;
        int var2 = class26.field466;
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; ++var3) {
            class67 var4;
            long var5;
            if (!arg0) {
                var4 = class57.field1024[class200.field3880[var3]];
                var5 = (long) class200.field3880[var3] << 32;
            } else {
                var5 = 8791798054912L;
                var4 = class46.field872;
            }
            if (var4 != null && var4.method213(-30610)) {
                var4.field1291 = false;
                if ((class55.field970 && ~class26.field466 < -51 || class26.field466 > 200) && !arg0 && ~var4.field655 == ~var4.field596) {
                    var4.field1291 = true;
                }
                int var7 = var4.field635 >> 7;
                int var8 = var4.field614 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var4.field1295 != null && ~var4.field1279 >= ~class161.field2903 && class161.field2903 < var4.field1294) {
                        var4.field1291 = false;
                        var4.field599 = class115.method706(var4.field635, class47.field892, 127, var4.field614);
                        class73.method429(class47.field892, var4.field635, var4.field614, var4.field599, var4, var4.field647, var5, var4.field1297, var4.field1280, var4.field1296, var4.field1274);
                    } else {
                        if (~(127 & var4.field635) == -65 && ~(var4.field614 & 127) == -65) {
                            if (~class9.field165[var7][var8] == ~class105.field1904) {
                                continue;
                            }
                            class9.field165[var7][var8] = class105.field1904;
                        }
                        var4.field599 = class115.method706(var4.field635, class47.field892, 127, var4.field614);
                        class125.method760(class47.field892, var4.field635, var4.field614, var4.field599, 60, var4, var4.field647, var5, var4.field648);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "(II)V")
    public final void method106(int arg0, int arg1) {
        super.field1809[super.field1834++] = (byte) (arg0 + this.field325.method356(-7310));
        ++field319;
        int var3 = 13 % ((-69 - arg1) / 45);
    }

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "(B)V")
    public final void method107(byte arg0) {
        super.field1834 = (this.field314 + 7) / 8;
        int var2 = -123 % ((16 - arg0) / 58);
        ++field317;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([IB)V")
    public final void method108(int[] arg0, byte arg1) {
        ++field323;
        if (arg1 != -100) {
            this.method108((int[]) null, (byte) -28);
        }
        this.field325 = new class63(arg0);
    }

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "(I)V")
    public static void method109(int arg0) {
        if (arg0 < 22) {
            field326 = null;
        }
        field316 = null;
        field324 = null;
        field326 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lrh;IZII)V")
    public static final void method110(class167 arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field313;
        if (~class101.field1870 <= -4) {
            class4.method33(arg4, arg1, 0, arg0.field3093, arg0.field3024);
        } else {
            class169.field3201.method845(arg4, arg1, arg0.field3045, arg0.field3089, class169.field3201.field2491 / 2, class169.field3201.field2490 / 2, class38.field716, 256, arg0.field3093, arg0.field3024);
        }
        class134.field2427[arg3] = arg2;
    }

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "(B)V")
    public final void method111(byte arg0) {
        int var2 = 124 % ((arg0 - 64) / 62);
        ++field311;
        this.field314 = super.field1834 * 8;
    }

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "(Z)I")
    public final int method112(boolean arg0) {
        if (!arg0) {
            field324 = null;
        }
        ++field315;
        return 255 & super.field1809[super.field1834++] + -this.field325.method356(-7310);
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(I)V")
    public class17(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIIZ)V")
    public static final void method113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        ++field327;
        if (arg7) {
            method110((class167) null, 62, true, -123, 122);
        }
        if (arg0 >= 1 && ~arg1 <= -2 && arg0 <= 102 && ~arg1 >= -103) {
            if (class55.field970 && ~class47.field892 != ~arg6) {
                return;
            }
            long var8 = 0L;
            if (arg5 == 0) {
                var8 = class21.method131(arg6, arg0, arg1);
            }
            if (~arg5 == -2) {
                var8 = class193.method1229(arg6, arg0, arg1);
            }
            boolean var10 = false;
            boolean var11 = true;
            if (arg5 == 2) {
                var8 = class117.method713(arg6, arg0, arg1);
            }
            if (~arg5 == -4) {
                var8 = class52.method286(arg6, arg0, arg1);
            }
            boolean var12 = false;
            if (~var8 != -1L) {
                int var13 = (int) var8 >> 20 & 3;
                int var14 = Integer.MAX_VALUE & (int) (var8 >>> 32);
                int var15 = (int) var8 >> 14 & 31;
                if (~arg5 == -1) {
                    class26.method169(arg6, arg0, arg1);
                    class58 var16 = class14.method88(-86, var14);
                    if (~var16.field1060 != -1) {
                        class159.field2883[arg6].method384(var15, var13, arg0, var16.field1047, arg7, arg1);
                    }
                }
                if (arg5 == 1) {
                    class12.method75(arg6, arg0, arg1);
                }
                if (~arg5 == -3) {
                    class58.method323(arg6, arg0, arg1);
                    class58 var17 = class14.method88(69, var14);
                    if (arg0 - -var17.field1027 > 103 || ~(var17.field1027 + arg1) < -104 || ~(arg0 - -var17.field1084) < -104 || var17.field1084 + arg1 > 103) {
                        return;
                    }
                    if (~var17.field1060 != -1) {
                        class159.field2883[arg6].method376(arg1, var17.field1027, -1, arg0, var17.field1047, var13, var17.field1084);
                    }
                }
                if (~arg5 == -4) {
                    class195.method1236(arg6, arg0, arg1);
                    class58 var18 = class14.method88(-76, var14);
                    if (var18.field1060 == 1) {
                        class159.field2883[arg6].method377(arg0, arg1, -113);
                    }
                }
            }
            if (arg4 >= 0) {
                int var19 = arg6;
                if (arg6 < 3 && (class46.field878[1][arg0][arg1] & 2) == 2) {
                    var19 = arg6 + 1;
                }
                class138.method852(arg3, arg0, arg6, arg4, class159.field2883[arg6], arg2, -15835, var19, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(IZ)V")
    public static final void method114(int arg0, boolean arg1) {
        ++field322;
        if (arg0 != 0) {
            field324 = null;
        }
        class40.field749 = arg1;
        if (class40.field749) {
            int var2 = class21.field394.method572(false);
            class21.field394.method111((byte) 126);
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var22 = 0; var22 < 13; ++var22) {
                    for (int var23 = 0; var23 < 13; ++var23) {
                        int var24 = class21.field394.method115(1, 104);
                        if (var24 == 1) {
                            class119.field2148[var3][var22][var23] = class21.field394.method115(26, 104);
                        } else {
                            class119.field2148[var3][var22][var23] = -1;
                        }
                    }
                }
            }
            class21.field394.method107((byte) -74);
            int var4 = (-class21.field394.field1834 + class111.field2014) / 16;
            class197.field3825 = new int[var4][4];
            for (int var5 = 0; ~var5 > ~var4; ++var5) {
                for (int var21 = 0; ~var21 > -5; ++var21) {
                    class197.field3825[var5][var21] = class21.field394.method566(4);
                }
            }
            int var6 = class21.field394.method572(false);
            int var7 = class21.field394.method590(true);
            int var8 = class21.field394.method588((byte) -109);
            int var9 = class21.field394.method590(true);
            class39.field742 = new byte[var4][];
            class68.field1313 = new int[var4];
            class115.field2086 = new int[var4];
            class105.field1919 = new int[var4];
            class63.field1186 = new byte[var4][];
            int var10 = 0;
            for (int var11 = 0; ~var11 > -5; ++var11) {
                for (int var12 = 0; ~var12 > -14; ++var12) {
                    for (int var13 = 0; var13 < 13; ++var13) {
                        int var14 = class119.field2148[var11][var12][var13];
                        if (var14 != -1) {
                            int var15 = var14 >> 14 & 1023;
                            int var16 = (var14 & 16377) >> 3;
                            int var17 = (var15 / 8 << 8) + var16 / 8;
                            for (int var18 = 0; ~var10 < ~var18; ++var18) {
                                if (~class105.field1919[var18] == ~var17) {
                                    var17 = -1;
                                    break;
                                }
                            }
                            if (~var17 != 0) {
                                class105.field1919[var10] = var17;
                                int var19 = 255 & var17;
                                int var20 = var17 >> 8 & 255;
                                class68.field1313[var10] = field324.method1261(class144.method884(0, new class184[] { class55.field974, class170.method1060(var20, class51.method283(arg0, -110)), class54.field963, class170.method1060(var19, arg0 + -107) }), (byte) 54);
                                class115.field2086[var10] = field324.method1261(class144.method884(0, new class184[] { class106.field1929, class170.method1060(var20, -116), class54.field963, class170.method1060(var19, class51.method283(arg0, -124)) }), (byte) 98);
                                ++var10;
                            }
                        }
                    }
                }
            }
            class34.method206(var8, var9, var2, var6, 0, var7);
        } else {
            int var25 = class21.field394.method611(false);
            int var26 = class21.field394.method611(false);
            int var27 = (-class21.field394.field1834 + class111.field2014) / 16;
            class197.field3825 = new int[var27][4];
            for (int var28 = 0; ~var27 < ~var28; ++var28) {
                for (int var37 = 0; var37 < 4; ++var37) {
                    class197.field3825[var28][var37] = class21.field394.method575(82);
                }
            }
            int var29 = class21.field394.method614(0);
            boolean var30 = false;
            int var31 = class21.field394.method572(false);
            int var32 = class21.field394.method611(false);
            class63.field1186 = new byte[var27][];
            if ((~(var31 / 8) == -49 || var31 / 8 == 49) && var26 / 8 == 48) {
                var30 = true;
            }
            if (~(var31 / 8) == -49 && ~(var26 / 8) == -149) {
                var30 = true;
            }
            class68.field1313 = new int[var27];
            class39.field742 = new byte[var27][];
            class115.field2086 = new int[var27];
            class105.field1919 = new int[var27];
            int var33 = 0;
            for (int var34 = (var31 + -6) / 8; var34 <= (var31 + 6) / 8; ++var34) {
                for (int var35 = (var26 + -6) / 8; ~((var26 + 6) / 8) <= ~var35; ++var35) {
                    int var36 = (var34 << 8) + var35;
                    if (!var30 || var35 != 49 && var35 != 149 && var35 != 147 && ~var34 != -51 && (var34 != 49 || ~var35 != -48)) {
                        class105.field1919[var33] = var36;
                        class68.field1313[var33] = field324.method1261(class144.method884(0, new class184[] { class55.field974, class170.method1060(var34, -116), class54.field963, class170.method1060(var35, -113) }), (byte) 77);
                        class115.field2086[var33] = field324.method1261(class144.method884(class51.method283(arg0, 0), new class184[] { class106.field1929, class170.method1060(var34, -107), class54.field963, class170.method1060(var35, -127) }), (byte) 72);
                        ++var33;
                    }
                }
            }
            class34.method206(var29, var31, var26, var32, arg0, var25);
        }
    }

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "(II)I")
    public final int method115(int arg0, int arg1) {
        ++field312;
        if (arg1 != 104) {
            return 0;
        } else {
            int var3 = this.field314 >> 3;
            int var4 = 0;
            int var5 = 8 - (7 & this.field314);
            this.field314 += arg0;
            while (var5 < arg0) {
                var4 += (super.field1809[var3++] & class85.field1574[var5]) << -var5 + arg0;
                arg0 -= var5;
                var5 = 8;
            }
            int var6;
            if (arg0 == var5) {
                var6 = (class85.field1574[var5] & super.field1809[var3]) + var4;
            } else {
                var6 = (super.field1809[var3] >> var5 - arg0 & class85.field1574[arg0]) + var4;
            }
            return var6;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; ~var1 > -33; ++var1) {
            field326[var1] = var0 + -1;
            var0 += var0;
        }
    }
}
