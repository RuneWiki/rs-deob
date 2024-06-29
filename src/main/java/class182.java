import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class182 {

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "I")
    public int field3187;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "I")
    public int field3188;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "I")
    public int field3186;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "F")
    public float field3190;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public int field3181;

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "F")
    public float field3196;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "F")
    public float field3192;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public int field3182;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public int field3191;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "[I")
    public static int[] field3185 = new int[32];

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!gl", name = "t", descriptor = "Lmh;")
    public static class128 field3199;

    @OriginalMember(owner = "client!gl", name = "s", descriptor = "Loe;")
    public static class120 field3198;

    @OriginalMember(owner = "client!gl", name = "u", descriptor = "Lhc;")
    public static class164 field3200;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "J")
    public static long field3183;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "[[[Le;")
    public static class150[][][] field3184;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V", line = 8)
    public static final void method1238(byte arg0) {
        int var1 = 44 / ((arg0 - 12) / 44);
        field3189++;
        class294.field5028.method1832((byte) 43);
        class222.field3897.method1832((byte) 46);
        class223.field3907.method1832((byte) 79);
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)V", line = 29)
    public static void method1239(boolean arg0) {
        field3199 = null;
        field3184 = (class150[][][]) null;
        if (!arg0) {
            method1238((byte) 76);
        }
        field3200 = null;
        field3185 = null;
        field3198 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(BI)Lne;", line = 44)
    public static final class225 method1240(byte arg0, int arg1) {
        field3194++;
        if (arg0 != 99) {
            method1241((class314) null, -81);
        }
        class225 var2 = (class225) class276.field4774.method1836((long) arg1, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class109.field1857.method2155(arg1, 1, (byte) 70);
        class225 var4 = new class225();
        if (var3 != null) {
            var4.method1548(new class194(var3), arg1, (byte) -32);
        }
        class276.field4774.method1835((byte) -81, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Ldj;I)V", line = 77)
    public static final void method1241(class314 arg0, int arg1) {
        if (arg1 == 0) {
            class268.field4657 = arg0;
            field3180++;
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3185[var1] = var0 - 1;
            var0 += var0;
        }
        field3197 = 2;
        field3199 = class22.method156(124, ": ");
        field3198 = new class120(8);
        field3200 = new class164();
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIILem;I)V", line = 105)
    public static final void method1242(int arg0, int arg1, int arg2, class10 arg3, int arg4) {
        field3193++;
        class218.method1503(false);
        if (arg0 >= -103) {
            return;
        }
        if (class247.field4247) {
            class269.method1875(arg4, arg2, arg3.field260 + arg4, arg3.field226 + arg2);
        } else {
            class213.method1470(arg4, arg2, arg3.field260 + arg4, arg3.field226 + arg2);
        }
        if (class283.field4872 != 2 && class283.field4872 != 5 && class70.field1314 != null) {
            int var5 = class216.field3803 + class118.field1997 & 0x7FF;
            int var6 = class163.field2796.field478 / 32 + 48;
            int var7 = 464 - (class163.field2796.field418 / 32);
            if (class247.field4247) {
                ((class40) class70.field1314).method272(arg4, arg2, arg3.field260, arg3.field226, var6, var7, var5, class145.field2480 + 256, (class40) arg3.method82((byte) 78, false));
            } else {
                ((class231) class70.field1314).method746(arg4, arg2, arg3.field260, arg3.field226, var6, var7, var5, class145.field2480 + 256, arg3.field268, arg3.field289);
            }
            if (class144.field2470 != null) {
                for (int var8 = 0; var8 < class144.field2470.field1047; var8++) {
                    if (class144.field2470.method368(var8, 0)) {
                        int var9 = (class144.field2470.field1044[var8] - class221.field3889) * 4 + 2 - (class163.field2796.field478 / 32);
                        int var10 = (class144.field2470.field1043[var8] - class4.field72) * 4 + 2 - (class163.field2796.field418 / 32);
                        int var11 = class141.field2424[var5];
                        int var12 = var11 * 256 / (class145.field2480 + 256);
                        int var13 = class141.field2411[var5];
                        int var14 = var13 * 256 / (class145.field2480 + 256);
                        int var15 = var9 * var14 + var10 * var12 >> 16;
                        int var16 = var10 * var14 - (var9 * var12) >> 16;
                        class305 var17 = class34.field724;
                        if (class144.field2470.method365(13808, var8) == 1) {
                            var17 = class132.field2292;
                        }
                        if (class144.field2470.method365(13808, var8) == 2) {
                            var17 = client.field4159;
                        }
                        int var18 = var17.method2081(class144.field2470.field1049[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (-arg3.field260 <= var19 && var19 <= arg3.field260 && var16 >= -arg3.field226 && arg3.field226 >= var16) {
                            int var20 = 16777215;
                            if (class144.field2470.field1040[var8] != -1) {
                                var20 = class144.field2470.field1040[var8];
                            }
                            if (class247.field4247) {
                                class269.method1877((class40) arg3.method82((byte) 78, false));
                            } else {
                                class213.method1473(arg3.field268, arg3.field289);
                            }
                            var17.method2076(class144.field2470.field1049[var8], arg4 + var19 + (arg3.field260 / 2), arg3.field226 / 2 + -var16 + arg2, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class247.field4247) {
                                class269.method1872();
                            } else {
                                class213.method1476();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class52.field1019; var21++) {
                int var22 = class259.field4483[var21] * 4 + 2 - (class163.field2796.field478 / 32);
                int var23 = class250.field4336[var21] * 4 + 2 - (class163.field2796.field418 / 32);
                class38 var24 = class239.method1629((byte) -21, class271.field4707[var21]);
                if (var24.field817 != null) {
                    var24 = var24.method258(-115);
                    if (var24 == null || var24.field791 == -1) {
                        continue;
                    }
                }
                class123.method752(arg4, arg3, var22, 2, class42.field854[var24.field791], arg2, var23);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class296 var27 = class221.field3888[class133.field2315][var25][var26];
                    if (var27 != null) {
                        int var28 = var26 * 4 + 2 - (class163.field2796.field418 / 32);
                        int var29 = var25 * 4 + 2 - (class163.field2796.field478 / 32);
                        class123.method752(arg4, arg3, var29, 2, class200.field3541[0], arg2, var28);
                    }
                }
            }
            for (int var30 = 0; var30 < class37.field749; var30++) {
                class115 var31 = class201.field3560[class39.field839[var30]];
                if (var31 != null && var31.method122(false)) {
                    class208 var32 = var31.field1934;
                    if (var32 != null && var32.field3655 != null) {
                        var32 = var32.method1429((byte) -96);
                    }
                    if (var32 != null && var32.field3666 && var32.field3653) {
                        int var33 = var31.field478 / 32 - (class163.field2796.field478 / 32);
                        int var34 = var31.field418 / 32 - (class163.field2796.field418 / 32);
                        class123.method752(arg4, arg3, var33, 2, class200.field3541[1], arg2, var34);
                    }
                }
            }
            for (int var35 = 0; var35 < class75.field1404; var35++) {
                class123 var36 = class140.field2405[class203.field3593[var35]];
                if (var36 != null && var36.method122(false)) {
                    int var37 = var36.field478 / 32 - class163.field2796.field478 / 32;
                    boolean var38 = false;
                    int var39 = var36.field418 / 32 - class163.field2796.field418 / 32;
                    long var40 = var36.field2079.method819((byte) 125);
                    for (int var42 = 0; var42 < class214.field3779; var42++) {
                        if (class34.field738[var42] == var40 && class171.field2996[var42] != 0) {
                            var38 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class288.field4928; var44++) {
                        if (class208.field3694[var44].field4915 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class163.field2796.field2087 != 0 && var36.field2087 != 0 && class163.field2796.field2087 == var36.field2087) {
                        var45 = true;
                    }
                    if (var38) {
                        class123.method752(arg4, arg3, var37, 2, class200.field3541[3], arg2, var39);
                    } else if (var43) {
                        class123.method752(arg4, arg3, var37, 2, class200.field3541[5], arg2, var39);
                    } else if (var45) {
                        class123.method752(arg4, arg3, var37, 2, class200.field3541[4], arg2, var39);
                    } else {
                        class123.method752(arg4, arg3, var37, 2, class200.field3541[2], arg2, var39);
                    }
                }
            }
            class199[] var46 = class260.field4489;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class199 var48 = var46[var47];
                if (var48 != null && var48.field3475 != 0 && class293.field5011 % 20 < 10) {
                    if (var48.field3475 == 1 && var48.field3466 >= 0 && var48.field3466 < class201.field3560.length) {
                        class115 var49 = class201.field3560[var48.field3466];
                        if (var49 != null) {
                            int var50 = var49.field478 / 32 - (class163.field2796.field478 / 32);
                            int var51 = var49.field418 / 32 - class163.field2796.field418 / 32;
                            class89.method556(arg3, arg2, var48.field3474, 127, arg4, var51, var50);
                        }
                    }
                    if (var48.field3475 == 2) {
                        int var52 = (var48.field3478 - class221.field3889) * 4 + 2 - class163.field2796.field478 / 32;
                        int var53 = (var48.field3471 - class4.field72) * 4 + 2 - (class163.field2796.field418 / 32);
                        class89.method556(arg3, arg2, var48.field3474, 94, arg4, var53, var52);
                    }
                    if (var48.field3475 == 10 && var48.field3466 >= 0 && class140.field2405.length > var48.field3466) {
                        class123 var54 = class140.field2405[var48.field3466];
                        if (var54 != null) {
                            int var55 = var54.field478 / 32 - (class163.field2796.field478 / 32);
                            int var56 = var54.field418 / 32 - (class163.field2796.field418 / 32);
                            class89.method556(arg3, arg2, var48.field3474, 97, arg4, var56, var55);
                        }
                    }
                }
            }
            if (class219.field3863 != 0) {
                int var57 = class114.field1907 * 4 + 2 - (class163.field2796.field418 / 32);
                int var58 = class219.field3863 * 4 + 2 - (class163.field2796.field478 / 32);
                class123.method752(arg4, arg3, var58, 2, class96.field1612, arg2, var57);
            }
            if (class247.field4247) {
                class269.method1878(arg3.field260 / 2 + arg4 - 1, arg2 - (-(arg3.field226 / 2) + 1), 3, 3, 16777215);
            } else {
                class213.method1464(arg3.field260 / 2 + arg4 - 1, arg3.field226 / 2 + arg2 - 1, 3, 3, 16777215);
            }
        } else if (class247.field4247) {
            class55 var59 = arg3.method82((byte) 78, false);
            if (var59 != null) {
                var59.method273(arg4, arg2);
            }
        } else {
            class213.method1475(arg4, arg2, 0, arg3.field268, arg3.field289);
        }
        class199.field3468[arg1] = true;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "()V", line = 457)
    public class182() {
        this.field3187 = -50;
        this.field3188 = 0;
        this.field3186 = class119.field2015;
        this.field3190 = 0.69921875F;
        this.field3181 = -50;
        this.field3196 = 1.2F;
        this.field3192 = 1.1523438F;
        this.field3182 = class119.field2004;
        this.field3191 = -60;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lbg;)V", line = 472)
    public class182(class194 arg0) {
        int var2 = arg0.method1325(7627);
        if ((var2 & 0x1) == 0) {
            this.field3182 = class119.field2004;
        } else {
            this.field3182 = arg0.method1350(false);
        }
        if ((var2 & 0x2) == 0) {
            this.field3192 = 1.1523438F;
        } else {
            this.field3192 = (float) arg0.method1308(-62) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field3190 = 0.69921875F;
        } else {
            this.field3190 = (float) arg0.method1308(-23) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field3196 = 1.2F;
        } else {
            this.field3196 = (float) arg0.method1308(-18) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field3191 = -60;
            this.field3187 = -50;
            this.field3181 = -50;
        } else {
            this.field3187 = arg0.method1354(2);
            this.field3191 = arg0.method1354(2);
            this.field3181 = arg0.method1354(2);
        }
        if ((var2 & 0x20) == 0) {
            this.field3186 = class119.field2015;
        } else {
            this.field3186 = arg0.method1350(false);
        }
        if ((var2 & 0x40) == 0) {
            this.field3188 = 0;
        } else {
            this.field3188 = arg0.method1308(-128);
        }
    }
}
