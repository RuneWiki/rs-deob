import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class22 {

    @OriginalMember(owner = "client!af", name = "d", descriptor = "Lmo;")
    private class336 field238 = new class336(64);

    @OriginalMember(owner = "client!af", name = "o", descriptor = "I")
    public int field249 = 0;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "Lnl;")
    private class435 field246;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public int field244;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "Lap;")
    public static class310 field241 = new class310(78, 4);

    @OriginalMember(owner = "client!af", name = "k", descriptor = "J")
    public static long field245;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "Lrc;")
    public static class108 field250;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "J")
    public static long field251;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "[I")
    public static int[] field252;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field235;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "Lnl;")
    public static class435 field253;

    static {
        new class151("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
        field245 = 0L;
        field250 = new class108(29, 8);
        field251 = 0L;
        field252 = new int[250];
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)Llk;", line = 3)
    public static final class392 method156(int arg0) {
        field239++;
        try {
            return arg0 == -1 ? (class392) Class.forName("nj").getDeclaredConstructor().newInstance() : null;
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(III)Z", line = 23)
    public static final boolean method157(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class357.field4936; var3++) {
            class34 var4 = class55.field816[var3];
            if (var4.field352 == 1) {
                int var5 = var4.field351 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field348 * var5 >> 8) + var4.field355;
                    int var7 = (var4.field356 * var5 >> 8) + var4.field350;
                    int var8 = (var4.field361 * var5 >> 8) + var4.field365;
                    int var9 = (var4.field345 * var5 >> 8) + var4.field353;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field352 == 2) {
                int var10 = arg0 - var4.field351;
                if (var10 > 0) {
                    int var11 = (var4.field348 * var10 >> 8) + var4.field355;
                    int var12 = (var4.field356 * var10 >> 8) + var4.field350;
                    int var13 = (var4.field361 * var10 >> 8) + var4.field365;
                    int var14 = (var4.field345 * var10 >> 8) + var4.field353;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field352 == 3) {
                int var15 = var4.field355 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field362 * var15 >> 8) + var4.field351;
                    int var17 = (var4.field366 * var15 >> 8) + var4.field367;
                    int var18 = (var4.field361 * var15 >> 8) + var4.field365;
                    int var19 = (var4.field345 * var15 >> 8) + var4.field353;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field352 == 4) {
                int var20 = arg2 - var4.field355;
                if (var20 > 0) {
                    int var21 = (var4.field362 * var20 >> 8) + var4.field351;
                    int var22 = (var4.field366 * var20 >> 8) + var4.field367;
                    int var23 = (var4.field361 * var20 >> 8) + var4.field365;
                    int var24 = (var4.field345 * var20 >> 8) + var4.field353;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field352 == 5) {
                int var25 = arg1 - var4.field365;
                if (var25 > 0) {
                    int var26 = (var4.field362 * var25 >> 8) + var4.field351;
                    int var27 = (var4.field366 * var25 >> 8) + var4.field367;
                    int var28 = (var4.field348 * var25 >> 8) + var4.field355;
                    int var29 = (var4.field356 * var25 >> 8) + var4.field350;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IZ)Ldu;", line = 144)
    public final class261 method158(int arg0, boolean arg1) {
        field237++;
        if (!arg1) {
            this.method159(18);
        }
        class336 var3 = this.field238;
        class261 var4;
        synchronized (this.field238) {
            var4 = (class261) this.field238.method2113(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field246.method2633(4, arg0, 99);
        class261 var6 = new class261();
        var6.field3749 = arg0;
        var6.field3762 = this;
        if (var5 != null) {
            var6.method1757(new class161(var5), (byte) -93);
        }
        var6.method1759(-118);
        class336 var7 = this.field238;
        synchronized (this.field238) {
            this.field238.method2116((long) arg0, (byte) -40, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V", line = 177)
    public final void method159(int arg0) {
        class336 var2 = this.field238;
        synchronized (this.field238) {
            this.field238.method2119(arg0 ^ arg0);
        }
        field236++;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)[Lbc;", line = 191)
    public static final class8[] method160(int arg0) {
        if (arg0 != 0) {
            method156(-87);
        }
        field248++;
        return new class8[] { class433.field6117, class433.field6124, class433.field6125, class433.field6126, class433.field6127, class433.field6128, class433.field6129, class433.field6130, class433.field6131, class433.field6132 };
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V", line = 202)
    public static final void method161(byte arg0) {
        class371.method2268();
        field235++;
        if (arg0 != 34) {
            field252 = null;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class300.field4249[var1].method118(3174);
        }
        class184.method1311((byte) -82);
        class262.method1769(-19881);
        System.gc();
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V", line = 225)
    public static void method162(int arg0) {
        field241 = null;
        if (arg0 != 4096) {
            method163(98, 31, -13);
        }
        field252 = null;
        field250 = null;
        field253 = null;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(III)V", line = 238)
    public static final void method163(int arg0, int arg1, int arg2) {
        field242++;
        class334 var3 = class352.method2172(arg0, arg2, 16711935);
        var3.method2104(0);
        var3.field4648 = arg1;
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V", line = 253)
    public final void method164(int arg0) {
        field247++;
        if (arg0 == 8192) {
            class336 var2 = this.field238;
            synchronized (this.field238) {
                this.field238.method2109(-1);
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V", line = 281)
    public final void method165(int arg0, int arg1) {
        class336 var3 = this.field238;
        synchronized (this.field238) {
            this.field238.method2120((byte) -121, arg1);
            if (arg0 != 126) {
                this.method159(-18);
            }
        }
        field240++;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Llo;ILnl;)V", line = 693)
    public class22(class280 arg0, int arg1, class435 arg2) {
        this.field246 = arg2;
        this.field244 = this.field246.method2638(1, 4);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lgf;IBLvh;I)V", line = 297)
    public static final void method166(class39 arg0, int arg1, byte arg2, class84 arg3, int arg4) {
        field243++;
        byte var5 = -1;
        if ((arg1 & 0x1000) != 0) {
            arg0.field5757 = arg3.method1186(-1);
            if (arg0.field5757.charAt(0) == '~') {
                arg0.field5757 = arg0.field5757.substring(1);
                class106.method842(arg0.method250(true, arg2 ^ 0xFFFFEDA9), 2, arg0.field5757, 0, 0, arg0.method246(false, (byte) -27));
            } else if (class262.field3781 == arg0) {
                class106.method842(arg0.method250(true, arg2 ^ 0xFFFFEDA9), 2, arg0.field5757, 0, 0, arg0.method246(false, (byte) -27));
            }
            arg0.field5796 = 150;
            arg0.field5727 = 0;
            arg0.field5778 = 0;
        }
        if ((arg1 & 0x100) != 0) {
            int var6 = arg3.method1171((byte) 127);
            int var7 = arg3.method1188(24290);
            if (var6 == 65535) {
                var6 = -1;
            }
            boolean var8 = true;
            if (var6 != -1 && arg0.field5759 != -1) {
                if (arg0.field5759 == var6) {
                    class217 var9 = class371.field5108.method1664(var6, -117);
                    if (var9.field3128 && var9.field3129 != -1) {
                        class303 var10 = class386.field5289.method1856(122, var9.field3129);
                        int var11 = var10.field4289;
                        if (var11 == 0) {
                            var8 = false;
                        } else if (var11 == 1) {
                            var8 = true;
                        } else if (var11 == 2) {
                            var8 = false;
                            arg0.field5800 = 0;
                        }
                    }
                } else {
                    class217 var12 = class371.field5108.method1664(var6, 35);
                    class217 var13 = class371.field5108.method1664(arg0.field5759, arg2 + 133);
                    if (var12.field3129 != -1 && var13.field3129 != -1) {
                        class303 var14 = class386.field5289.method1856(arg2 + 60, var12.field3129);
                        class303 var15 = class386.field5289.method1856(66, var13.field3129);
                        if (var15.field4307 > var14.field4307) {
                            var8 = false;
                        }
                    }
                }
            }
            if (var8) {
                int var16 = class364.field5010;
                arg0.field5759 = var6;
                arg0.field5749 = var7 >> 16;
                arg0.field5741 = 0;
                arg0.field5730 = var16 + (var7 & 0xFFFF);
                arg0.field5737 = 0;
                arg0.field5788 = 1;
                if (arg0.field5730 > var16) {
                    arg0.field5741 = -1;
                }
                if (arg0.field5759 != -1 && arg0.field5730 == var16) {
                    int var17 = class371.field5108.method1664(arg0.field5759, -125).field3129;
                    if (var17 != -1) {
                        class303 var18 = class386.field5289.method1856(arg2 + 64, var17);
                        if (var18 != null && var18.field4286 != null) {
                            class178.method1275(0, class262.field3781 == arg0, false, arg0.field4531, arg0.field4537, var18, arg0.field4530);
                        }
                    }
                }
            }
        }
        if ((arg1 & 0x20) != 0) {
            int var19 = arg3.method1181((byte) -38);
            byte[] var20 = new byte[var19];
            class161 var21 = new class161(var20);
            arg3.method1179(var19, 0, var20, false);
            class141.field1970[arg4] = var21;
            arg0.method247(var21, (byte) 73);
        }
        if ((arg1 & 0x4) != 0) {
            int var22 = arg3.method1145((byte) 61);
            if (var22 == 65535) {
                var22 = -1;
            }
            arg0.field5748 = var22;
        }
        if ((arg1 & 0x2) != 0) {
            class418.field5783[arg4] = arg3.method1193(-2097152);
        }
        if ((arg1 & 0x4000) != 0) {
            int var23 = class364.field5010;
            int var24 = arg3.method1133(0);
            int var25 = arg3.method1181((byte) -38);
            arg0.method2500(var25, var24, 0, var23);
        }
        if ((arg1 & 0x1) != 0) {
            int var26 = arg3.method1134(-16848);
            int var27 = arg3.method1160(95);
            int var28 = arg3.method1160(73);
            int var29 = arg3.field2298;
            boolean var30 = (var26 & 0x8000) != 0;
            if (arg0.field485 != null && arg0.field498 != null) {
                boolean var31 = false;
                if (var27 <= 1) {
                    if (!var30 && !(!class291.field4125 || class178.field2709) || class184.field2782) {
                        var31 = true;
                    } else if (class261.method1756(arg0.field485, 0)) {
                        var31 = true;
                    }
                }
                if (!var31 && class361.field4976 == 0) {
                    class374.field5177.field2298 = 0;
                    arg3.method1162(0, class374.field5177.field2262, var28, true);
                    class374.field5177.field2298 = 0;
                    int var32 = -1;
                    String var34;
                    if (var30) {
                        var26 &= 0x7FFF;
                        class385 var33 = class333.method2098((byte) 23, class374.field5177);
                        var32 = var33.field5278;
                        var34 = var33.field5279.method2342(arg2 + 103, class374.field5177);
                    } else {
                        var34 = class264.method1787(-61, class333.method2096(16383, class68.method636(class374.field5177, arg2 ^ -118)));
                    }
                    arg0.field5757 = var34.trim();
                    arg0.field5727 = var26 & 0xFF;
                    arg0.field5778 = var26 >> 8;
                    arg0.field5796 = 150;
                    int var35;
                    if (var27 == 1 || var27 == 2) {
                        var35 = var30 ? 17 : 1;
                    } else {
                        var35 = var30 ? 17 : 2;
                    }
                    if (var27 == 2) {
                        class385.method2346("<img=1>" + arg0.method246(false, (byte) -27), 0, var35, "<img=1>" + arg0.method250(true, 4675), var34, (String) null, (byte) 103, var32);
                    } else if (var27 == 1) {
                        class385.method2346("<img=0>" + arg0.method246(false, (byte) -27), 0, var35, "<img=0>" + arg0.method250(true, 4675), var34, (String) null, (byte) 103, var32);
                    } else {
                        class385.method2346(arg0.method246(false, (byte) -27), 0, var35, arg0.method250(true, arg2 ^ 0xFFFFEDA9), var34, (String) null, (byte) 103, var32);
                    }
                }
            }
            arg3.field2298 = var28 + var29;
        }
        if ((arg1 & 0x800) != 0) {
            int var36 = arg3.method1137(true);
            int[] var37 = new int[var36];
            int[] var38 = new int[var36];
            int[] var39 = new int[var36];
            for (int var40 = 0; var40 < var36; var40++) {
                int var41 = arg3.method1134(-16848);
                if (var41 == 65535) {
                    var41 = -1;
                }
                var37[var40] = var41;
                var38[var40] = arg3.method1181((byte) -38);
                var39[var40] = arg3.method1171((byte) 124);
            }
            class249.method1708(var38, 0, arg0, var37, var39);
        }
        if ((arg1 & 0x200) != 0) {
            arg0.field5777 = arg3.method1193(-2097152);
            arg0.field5782 = arg3.method1193(-2097152);
            arg0.field5745 = arg3.method1195(102);
            arg0.field5776 = arg3.method1195(115);
            arg0.field5750 = arg3.method1134(-16848) + class364.field5010;
            arg0.field5787 = arg3.method1145((byte) 101) + class364.field5010;
            arg0.field5769 = arg3.method1181((byte) -38);
            arg0.field5809 = 0;
            if (arg0.field500 == -1) {
                arg0.field5745 += arg0.field5811[0];
                arg0.field5810 = 1;
                arg0.field5777 += arg0.field5811[0];
                arg0.field5776 += arg0.field5807[0];
                arg0.field5782 += arg0.field5807[0];
            } else {
                arg0.field5745 += arg0.field500;
                arg0.field5777 += arg0.field500;
                arg0.field5810 = 0;
                arg0.field5776 += arg0.field493;
                arg0.field5782 += arg0.field493;
            }
        }
        if ((arg1 & 0x8) != 0) {
            arg0.field497 = arg3.method1145((byte) 64);
            if (arg0.field5810 == 0) {
                arg0.method2507(arg0.field497, false);
                arg0.field497 = -1;
            }
        }
        if (arg2 != -22) {
            field251 = -19L;
        }
        if ((arg1 & 0x400) != 0) {
            int var42 = arg3.method1145((byte) 65);
            arg0.field5792 = arg3.method1181((byte) -38);
            arg0.field5764 = arg3.method1181((byte) -38);
            arg0.field5738 = var42 & 0x7FFF;
            arg0.field5732 = (var42 & 0x8000) != 0;
            arg0.field5793 = class364.field5010 + arg0.field5738 + arg0.field5792;
        }
        if ((arg1 & 0x10) != 0) {
            int var43 = arg3.method1134(-16848);
            if (var43 == 65535) {
                var43 = -1;
            }
            int var44 = arg3.method1172((byte) 127);
            class436.method2664(var43, arg0, (byte) 4, var44);
        }
        if ((arg1 & 0x80) != 0) {
            int var45 = arg3.method1133(0);
            int var46 = arg3.method1172((byte) -128);
            arg0.method2500(var46, var45, 0, class364.field5010);
            arg0.field5761 = class364.field5010 + 300;
            arg0.field5740 = arg3.method1181((byte) -38);
        }
        if ((arg1 & 0x2000) != 0) {
            var5 = arg3.method1152(-1910700904);
        }
        if (arg0.field500 == -1) {
            return;
        }
        if (var5 == 127) {
            arg0.method242(arg0.field493, arg2 ^ 0x4F, arg0.field500);
            return;
        }
        byte var47;
        if (var5 == -1) {
            var47 = class418.field5783[arg4];
        } else {
            var47 = var5;
        }
        arg0.method248(arg0.field493, arg0.field500, var47, 118);
    }
}
