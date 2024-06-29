import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class424 {

    @OriginalMember(owner = "client!th", name = "p", descriptor = "I")
    private int field6005 = 0;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "I")
    private int field6006 = 0;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    private int field6011 = 1;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "I")
    private int field6010 = 1;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "Lub;")
    private class18 field6000 = new class18();

    @OriginalMember(owner = "client!th", name = "A", descriptor = "[Lml;")
    private class265[] field6016 = new class265[2];

    @OriginalMember(owner = "client!th", name = "E", descriptor = "Z")
    private boolean field6020 = false;

    @OriginalMember(owner = "client!th", name = "D", descriptor = "Z")
    private boolean field6019 = true;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "I")
    private int field6021 = -1;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    private int field6015 = 0;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "Z")
    private boolean field6013 = true;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "Z")
    private boolean field6017 = true;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "Z")
    private boolean field6022 = true;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "Lug;")
    private class395 field6012;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "Lns;")
    private class279 field5996;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "Lns;")
    private class279 field6002;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "Lns;")
    private class279 field6001;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "[Lfh;")
    public static class463[] field5991 = new class463[2048];

    @OriginalMember(owner = "client!th", name = "j", descriptor = "Z")
    public static boolean field5999 = false;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field5997;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field6003;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field6004;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!th", name = "s", descriptor = "I")
    public static int field6008;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "Lml;")
    private class265 field6018;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "Lcf;")
    private class430 field6014;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "Lcf;")
    private class430 field6023;

    @OriginalMember(owner = "client!th", name = "t", descriptor = "Z")
    private boolean field6009;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "[Ll;")
    public static class16[] field5990;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    private final void method2484(int arg0) {
        field6007++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class245 var5 = (class245) this.field6000.method153(0); var5 != null; var5 = (class245) this.field6000.method161(-62)) {
            int var10 = var5.method1497((byte) -106);
            if (var3 < var10) {
                var3 = var10;
            }
            var4 += var5.method1487(124);
            var2 |= var5.method1498((byte) 82);
        }
        int var6 = 117 % ((-arg0 - 66) / 40);
        int var7;
        if (var3 == 2) {
            var7 = 34836;
        } else if (var3 == 1) {
            var7 = 34842;
        } else {
            var7 = 6408;
        }
        if (this.field6021 != var7) {
            this.field6017 = true;
            this.field6021 = var7;
        }
        int var8 = this.field6015 > 2 ? 2 : this.field6015;
        int var9 = var4 <= 2 ? var4 : 2;
        this.field6015 = var4;
        if (var2 != this.field6020) {
            this.field6020 = var2;
            this.field6019 = true;
        }
        if (var8 != var9) {
            this.field6022 = this.field6017 = true;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V")
    public final void method2485(boolean arg0) {
        field6008++;
        if (!this.field6009) {
            return;
        }
        if (this.field6001 != null) {
            int var2 = 16384;
            this.field6012.method2339(this.field6001, -1);
            this.field6012.method2324((byte) -115, this.field5996);
            this.field6001.method1656(0, 0);
            this.field5996.method1645(true, 0);
            if (this.field6020) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field6011, this.field6010, 0, 0, this.field6011, this.field6010, var2, 9728);
            this.field6012.method2298(-52, this.field6001);
            this.field6012.method2288(this.field5996, 8744);
        }
        this.field6012.method2318(-20334);
        this.field6012.method2290(true, 0);
        this.field6012.method2305(7681, 1);
        this.field6012.method318();
        int var3 = 0;
        int var4 = 1;
        class245 var6;
        for (class245 var5 = (class245) this.field6000.method153(0); var5 != null; var5 = var6) {
            var6 = (class245) this.field6000.method161(-21);
            int var7 = var5.method1487(124);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method1495(this.field6018, var8, 94, this.field6016[var3]);
                if (var6 == null && var7 - 1 == var8) {
                    this.field6012.method2283(-111, this.field5996);
                    this.field6012.method2278(0, 0, (byte) 37);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6010);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field6006, this.field6005);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field6006, this.field6010 + this.field6005);
                    OpenGL.glTexCoord2f((float) this.field6011, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field6011 + this.field6006, this.field6010 + this.field6005);
                    OpenGL.glTexCoord2f((float) this.field6011, (float) this.field6010);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field6006 + this.field6011, this.field6005);
                    OpenGL.glEnd();
                } else {
                    this.field5996.method1645(true, var4);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field6010);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field6010);
                    OpenGL.glTexCoord2f((float) this.field6011, (float) this.field6010);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field6011, this.field6010);
                    OpenGL.glTexCoord2f((float) this.field6011, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field6011, 0);
                    OpenGL.glEnd();
                }
                var3 = var3 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
                var5.method1494(60, var8);
            }
        }
        this.field6009 = arg0;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Z")
    public final boolean method2486(byte arg0) {
        if (arg0 >= -96) {
            field5990 = null;
        }
        field5997++;
        return this.field6002 != null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Luv;I)Z")
    public final boolean method2487(class245 arg0, int arg1) {
        int var3 = 17 % ((-arg1 - 11) / 33);
        field5992++;
        if (this.field6002 != null) {
            if (arg0.method1490((byte) 66) || arg0.method1488(7)) {
                this.field6000.method163(arg0, 0);
                this.method2484(-113);
                if (this.method2488(-30826)) {
                    if (this.field6011 != -1 && this.field6010 != -1) {
                        arg0.method1493(this.field6010, this.field6011, -108);
                    }
                    arg0.field3163 = true;
                    return true;
                }
            }
            this.method2489((byte) -86, arg0);
        }
        return false;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)Z")
    private final boolean method2488(int arg0) {
        field5998++;
        if (this.field6019) {
            if (this.field6023 != null) {
                this.field6023.method2518((byte) -83);
                this.field6023 = null;
            }
            if (this.field6018 != null) {
                this.field6018.method860((byte) 25);
                this.field6018 = null;
            }
            if (this.field6001 != null) {
                this.field6023 = new class430(this.field6012, 6402, this.field6011, this.field6010, this.field6012.field5488);
            }
            if (this.field6020) {
                this.field6018 = new class265(this.field6012, 34037, 6402, this.field6011, this.field6010);
            } else if (this.field6023 == null) {
                this.field6023 = new class430(this.field6012, 6402, this.field6011, this.field6010);
            }
            this.field6019 = false;
            this.field6022 = true;
            this.field6013 = true;
        }
        if (this.field6017) {
            if (this.field6014 != null) {
                this.field6014.method2518((byte) -83);
                this.field6014 = null;
            }
            if (this.field6016[0] != null) {
                this.field6016[0].method860((byte) -81);
                this.field6016[0] = null;
            }
            if (this.field6016[1] != null) {
                this.field6016[1].method860((byte) 58);
                this.field6016[1] = null;
            }
            if (this.field6001 != null) {
                this.field6014 = new class430(this.field6012, this.field6021, this.field6011, this.field6010, this.field6012.field5488);
            }
            this.field6016[0] = new class265(this.field6012, 34037, this.field6021, this.field6011, this.field6010);
            this.field6016[1] = this.field6015 <= 1 ? null : new class265(this.field6012, 34037, this.field6021, this.field6011, this.field6010);
            this.field6013 = true;
            this.field6022 = true;
            this.field6017 = false;
        }
        if (this.field6022) {
            if (this.field6001 == null) {
                this.field6012.method2303(this.field5996, 34165);
                this.field5996.method1643(0, arg0 ^ 0xFFFF8797);
                this.field5996.method1643(1, 1);
                this.field5996.method1643(8, arg0 + 30827);
                this.field5996.method1648(this.field6016[0], 0, -87);
                if (this.field6015 > 1) {
                    this.field5996.method1648(this.field6016[1], 1, 104);
                }
                if (this.field6020) {
                    this.field5996.method1648(this.field6018, 8, arg0 ^ 0xFFFF87F1);
                } else {
                    this.field5996.method1657(this.field6023, 8, -73);
                }
                this.field6012.method2283(29, this.field5996);
            } else {
                this.field6012.method2303(this.field5996, 34165);
                this.field5996.method1643(0, 1);
                this.field5996.method1643(1, 1);
                this.field5996.method1643(8, 1);
                this.field5996.method1648(this.field6016[0], 0, 6);
                if (this.field6015 > 1) {
                    this.field5996.method1648(this.field6016[1], 1, -128);
                }
                if (this.field6020) {
                    this.field5996.method1648(this.field6018, 8, 120);
                }
                this.field6012.method2283(126, this.field5996);
                this.field6012.method2303(this.field6001, arg0 ^ 0xFFFF02E3);
                this.field6001.method1643(0, 1);
                this.field6001.method1643(8, arg0 ^ 0xFFFF8797);
                this.field6001.method1657(this.field6014, 0, 105);
                this.field6001.method1657(this.field6023, 8, 123);
                this.field6012.method2283(arg0 + 30719, this.field6001);
            }
            this.field6022 = false;
            this.field6013 = true;
        }
        if (arg0 != -30826) {
            return true;
        }
        if (this.field6013) {
            this.field6012.method2303(this.field6002, 34165);
            this.field6013 = !this.field6002.method1654(arg0 + 30826);
            this.field6012.method2283(arg0 + 30942, this.field6002);
        }
        return !this.field6013;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(BLuv;)V")
    public final void method2489(byte arg0, class245 arg1) {
        field6003++;
        arg1.field3163 = false;
        arg1.method1489(-107);
        if (arg0 >= -76) {
            this.field6002 = null;
        }
        arg1.method2165(16225);
        this.method2484(-117);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(B)V")
    public static void method2490(byte arg0) {
        int var1 = -112 % ((12 - arg0) / 55);
        field5991 = null;
        field5990 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "([[[Lev;ZIIII)Z")
    public static final boolean method2491(class490[][][] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field5993++;
        byte var6 = arg1 ? 1 : (byte) (class386.field5073 & 0xFF);
        if (class387.field5105[class276.field3488][arg2][arg4] == var6) {
            return false;
        } else if ((class379.field4998[class276.field3488][arg2][arg4] & 0x4) == 0) {
            return false;
        } else {
            if (arg3 != 1) {
                method2493(false, false, (byte) -125, -78, -23);
            }
            byte var7 = 0;
            class68.field887[var7] = arg2;
            int var8 = 0;
            int var35 = var7 + 1;
            class128.field1702[var7] = arg4;
            class387.field5105[class276.field3488][arg2][arg4] = var6;
            while (var35 != var8) {
                int var9 = class68.field887[var8] & 0xFFFF;
                int var10 = (class68.field887[var8] & 0xFFB0A4) >> 16;
                int var11 = class68.field887[var8] >> 24 & 0xFF;
                int var12 = class128.field1702[var8] & 0xFFFF;
                int var13 = (class128.field1702[var8] & 0xFF5A92) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class379.field4998[class276.field3488][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class276.field3488 + 1; var16 <= 3; var16++) {
                    if ((class379.field4998[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg0[var16][var9][var12] != null) {
                            if (arg0[var16][var9][var12].field7126 != null) {
                                int var20 = class379.method2146(var10, -52);
                                if (arg0[var16][var9][var12].field7126.field4011 == var20 || arg0[var16][var9][var12].field7130 != null && arg0[var16][var9][var12].field7130.field4011 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class379.method2146(var11, 106);
                                    if (arg0[var16][var9][var12].field7126.field4011 == var21 || arg0[var16][var9][var12].field7130 != null && arg0[var16][var9][var12].field7130.field4011 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class379.method2146(var13, -116);
                                    if (arg0[var16][var9][var12].field7126.field4011 == var22 || arg0[var16][var9][var12].field7130 != null && arg0[var16][var9][var12].field7130.field4011 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class490 var23 = arg0[var16][var9][var12];
                            if (var23.field7127 != null) {
                                for (class376 var24 = var23.field7127; var24 != null; var24 = var24.field4952) {
                                    class205 var25 = var24.field4953;
                                    if (var25 instanceof class41) {
                                        class41 var26 = (class41) var25;
                                        int var27 = var26.method189(32725);
                                        int var28 = var26.method178(true);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var28 << 6 | var27;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class490 var30 = arg0[var16][var9][var12];
                        if (var30 != null && var30.field7127 != null) {
                            for (class376 var31 = var30.field7127; var31 != null; var31 = var31.field4952) {
                                class205 var32 = var31.field4953;
                                if (var32.field2681 != var32.field2673 || var32.field2671 != var32.field2670) {
                                    for (int var33 = var32.field2673; var33 <= var32.field2681; var33++) {
                                        for (int var34 = var32.field2671; var34 <= var32.field2670; var34++) {
                                            class387.field5105[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class387.field5105[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class520.field7520[class276.field3488 + 1].method399(var9, var12);
                    if (var17 > class175.field2278[arg5]) {
                        class175.field2278[arg5] = var17;
                    }
                    int var18 = var9 << 7;
                    if (var18 < class129.field1712[arg5]) {
                        class129.field1712[arg5] = var18;
                    } else if (class159.field2025[arg5] < var18) {
                        class159.field2025[arg5] = var18;
                    }
                    int var19 = var12 << 7;
                    if (var19 < class225.field2871[arg5]) {
                        class225.field2871[arg5] = var19;
                    } else if (var19 > class184.field2414[arg5]) {
                        class184.field2414[arg5] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class387.field5105[class276.field3488][var9 - 1][var12] != var6) {
                        class68.field887[var35] = class215.method1323(class215.method1323(var9 - 1, 1179648), -754974720);
                        class128.field1702[var35] = class215.method1323(var12, 1245184);
                        var35 = var35 + 1 & 0xFFF;
                        class387.field5105[class276.field3488][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < class440.field6307) {
                        if (var9 - 1 >= 0 && class387.field5105[class276.field3488][var9 - 1][var12] != var6 && (class379.field4998[class276.field3488][var9][var12] & 0x4) == 0 && (class379.field4998[class276.field3488][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class68.field887[var35] = class215.method1323(1375731712, class215.method1323(var9 - 1, 1179648));
                            class128.field1702[var35] = class215.method1323(1245184, var12);
                            class387.field5105[class276.field3488][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class387.field5105[class276.field3488][var9][var12] != var6) {
                            class68.field887[var35] = class215.method1323(class215.method1323(5373952, var9), 318767104);
                            class128.field1702[var35] = class215.method1323(5439488, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class387.field5105[class276.field3488][var9][var12] = var6;
                        }
                        if (class452.field6526 > var9 + 1 && class387.field5105[class276.field3488][var9 + 1][var12] != var6 && (class379.field4998[class276.field3488][var9][var12] & 0x4) == 0 && (class379.field4998[class276.field3488][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class68.field887[var35] = class215.method1323(-1845493760, class215.method1323(5373952, var9 + 1));
                            class128.field1702[var35] = class215.method1323(5439488, var12);
                            class387.field5105[class276.field3488][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if ((var9 + 1) < class452.field6526 && class387.field5105[class276.field3488][var9 + 1][var12] != var6) {
                        class68.field887[var35] = class215.method1323(class215.method1323(9568256, var9 + 1), 1392508928);
                        class128.field1702[var35] = class215.method1323(9633792, var12);
                        class387.field5105[class276.field3488][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class387.field5105[class276.field3488][var9 - 1][var12] != var6 && (class379.field4998[class276.field3488][var9][var12] & 0x4) == 0 && (class379.field4998[class276.field3488][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class68.field887[var35] = class215.method1323(301989888, class215.method1323(13762560, var9 - 1));
                            class128.field1702[var35] = class215.method1323(var12, 13828096);
                            class387.field5105[class276.field3488][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class387.field5105[class276.field3488][var9][var12] != var6) {
                            class68.field887[var35] = class215.method1323(class215.method1323(var9, 13762560), -1828716544);
                            class128.field1702[var35] = class215.method1323(13828096, var12);
                            class387.field5105[class276.field3488][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < class452.field6526 && class387.field5105[class276.field3488][var9 + 1][var12] != var6 && (class379.field4998[class276.field3488][var9][var12] & 0x4) == 0 && (class379.field4998[class276.field3488][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class68.field887[var35] = class215.method1323(class215.method1323(var9 + 1, 9568256), -771751936);
                            class128.field1702[var35] = class215.method1323(var12, 9633792);
                            var35 = var35 + 1 & 0xFFF;
                            class387.field5105[class276.field3488][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class175.field2278[arg5] != -1000000) {
                class175.field2278[arg5] += 10;
                class129.field1712[arg5] -= 50;
                class159.field2025[arg5] += 50;
                class184.field2414[arg5] += 50;
                class225.field2871[arg5] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IBIII)Z")
    public final boolean method2492(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field5994++;
        if (this.field6002 == null || this.field6000.method162((byte) 78)) {
            return false;
        }
        if (this.field6011 != arg2 || this.field6010 != arg0) {
            this.field6011 = arg2;
            this.field6010 = arg0;
            for (class383 var6 = this.field6000.method153(0); var6 != this.field6000.field268; var6 = var6.field5042) {
                ((class245) var6).method1493(this.field6010, this.field6011, -125);
            }
            this.field6017 = true;
            this.field6019 = true;
            this.field6022 = true;
        }
        if (arg1 <= 103) {
            return true;
        } else if (this.method2488(-30826)) {
            this.field6006 = arg4;
            this.field6009 = true;
            this.field6005 = arg3;
            this.field6012.method2303(this.field6002, 34165);
            this.field6002.method1645(true, 0);
            this.field6012.method2278(-this.field6006, this.field6010 + (-this.field6002.method1646((byte) -123) - this.field6005), (byte) 37);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZZBII)Lqn;")
    public static final class47 method2493(boolean arg0, boolean arg1, byte arg2, int arg3, int arg4) {
        field6004++;
        if (arg2 < 4) {
            method2491(null, false, -5, -81, -21, 92);
        }
        class412 var5 = null;
        if (class264.field3332 != null) {
            var5 = new class412(arg4, class264.field3332, class414.field5899[arg4], 1000000);
        }
        class122.field1639[arg4] = class3.field25.method725(arg4, var5, 30217, class411.field5863);
        if (arg0) {
            class122.field1639[arg4].method500(-57);
        }
        return new class47(class122.field1639[arg4], arg1, arg3);
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
    public final void method2494(int arg0) {
        field5995++;
        this.field6014 = null;
        this.field6002 = this.field6001 = this.field5996 = null;
        this.field6016 = null;
        this.field6018 = null;
        this.field6023 = null;
        if (!this.field6000.method162((byte) 48)) {
            for (class383 var2 = this.field6000.method153(0); var2 != this.field6000.field268; var2 = var2.field5042) {
                ((class245) var2).method1489(-97);
            }
        }
        if (arg0 < 29) {
            this.field5996 = null;
        }
        this.field6011 = this.field6010 = 1;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lug;)V")
    public class424(class395 arg0) {
        this.field6012 = arg0;
        if (this.field6012.field5529 && this.field6012.field5624) {
            this.field6002 = this.field5996 = new class279(this.field6012);
            if (this.field6012.field5488 > 1 && this.field6012.field5565 && this.field6012.field5569) {
                this.field6002 = this.field6001 = new class279(this.field6012);
                return;
            }
        }
    }
}
