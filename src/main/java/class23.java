import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class23 extends class301 {

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    private final int field411;

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "I")
    private final int field425;

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
    private final int field424;

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "I")
    private int field426;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
    public static int field415 = 0;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    public static int field419 = 1;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "Ljf;")
    public static class229 field413 = class212.method1457((byte) 108, "scrollbar");

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
    public static int field418 = 0;

    @OriginalMember(owner = "client!lh", name = "P", descriptor = "Ljf;")
    private static class229 field430 = class212.method1457((byte) 59, "Allocated memory");

    @OriginalMember(owner = "client!lh", name = "R", descriptor = "I")
    public static int field432 = 0;

    @OriginalMember(owner = "client!lh", name = "O", descriptor = "Ljf;")
    public static class229 field429 = field430;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
    private int field417;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "I")
    public static int field421;

    @OriginalMember(owner = "client!lh", name = "H", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "I")
    private int field427;

    @OriginalMember(owner = "client!lh", name = "N", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!lh", name = "Q", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!lh", name = "T", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "[B")
    private byte[] field414;

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "[[Lnf;")
    public static class67[][] field423;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)V", line = 5)
    public void method216(int arg0, byte arg1) {
        field422++;
        this.field414[arg0] = arg1;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V", line = 20)
    public final void method217(int arg0) {
        this.field417 >>= 0x4;
        this.field426 = this.field424;
        field428++;
        if (this.field417 < 0) {
            this.field417 = 0;
        } else if (this.field417 > 255) {
            this.field417 = 255;
        }
        if (arg0 != 1) {
            this.method221(-94, -24, 83);
        }
        this.method216(this.field427++, (byte) this.field417);
        this.field417 = 0;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Llf;Z)V", line = 40)
    public static final void method218(class125 arg0, boolean arg1) {
        class245.field4355.method2079(arg0, 104);
        while (true) {
            class125 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class125[][] var7;
            class125 var118;
            do {
                class125 var117;
                do {
                    class125 var116;
                    do {
                        class125 var115;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class125) class245.field4355.method2076((byte) -119);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field2199);
                                            var3 = var2.field2202;
                                            var4 = var2.field2215;
                                            var5 = var2.field2195;
                                            var6 = var2.field2200;
                                            var7 = class312.field5246[var5];
                                            float var8 = 0.0F;
                                            if (class108.field1900) {
                                                if (class242.field4270 == class132.field2328) {
                                                    int var9 = class299.field5095[var3][var4];
                                                    int var10 = var9 & 0xFFFFFF;
                                                    if (class302.field5139 != var10) {
                                                        class302.field5139 = var10;
                                                        class74.method538(-13487, var10);
                                                        class276.method1938(class112.method790(-67));
                                                    }
                                                    int var11 = var9 >>> 24 << 3;
                                                    if (class48.field879 != var11) {
                                                        class48.field879 = var11;
                                                        class267.method1878(true, var11);
                                                    }
                                                    int var12 = class16.field256[0][var3 + 1][var4] + class16.field256[0][var3][var4] + class16.field256[0][var3][var4 + 1] + class16.field256[0][var3 + 1][var4 + 1] >> 2;
                                                    class257.method1832((byte) 107, 3, -var12);
                                                    var8 = 201.5F;
                                                    class108.method756(var8);
                                                } else {
                                                    var8 = 201.5F - (float) (var6 + 1) * 50.0F;
                                                    class108.method756(var8);
                                                }
                                            }
                                            if (!var2.field2212) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class125 var13 = class312.field5246[var5 - 1][var3][var4];
                                                    if (var13 != null && var13.field2199) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class325.field5481 && var3 > class211.field3631) {
                                                    class125 var14 = var7[var3 - 1][var4];
                                                    if (var14 != null && var14.field2199 && (var14.field2212 || (var2.field2194 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class325.field5481 && var3 < class167.field2867 - 1) {
                                                    class125 var15 = var7[var3 + 1][var4];
                                                    if (var15 != null && var15.field2199 && (var15.field2212 || (var2.field2194 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class243.field4316 && var4 > class5.field49) {
                                                    class125 var16 = var7[var3][var4 - 1];
                                                    if (var16 != null && var16.field2199 && (var16.field2212 || (var2.field2194 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class243.field4316 && var4 < class137.field2380 - 1) {
                                                    class125 var17 = var7[var3][var4 + 1];
                                                    if (var17 != null && var17.field2199 && (var17.field2212 || (var2.field2194 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2212 = false;
                                            if (var2.field2210 != null) {
                                                class125 var18 = var2.field2210;
                                                if (class108.field1900) {
                                                    class108.method756(201.5F - (float) (var18.field2200 + 1) * 50.0F);
                                                }
                                                if (var18.field2187 == null) {
                                                    if (var18.field2188 != null) {
                                                        if (class268.method1889(0, var3, var4)) {
                                                            class254.method1803(var18.field2188, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var3, var4, true);
                                                        } else {
                                                            class254.method1803(var18.field2188, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class268.method1889(0, var3, var4)) {
                                                    class1.method2(var18.field2187, 0, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var3, var4, true);
                                                } else {
                                                    class1.method2(var18.field2187, 0, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var3, var4, false);
                                                }
                                                class167 var19 = var18.field2198;
                                                if (var19 != null) {
                                                    if (class108.field1900) {
                                                        if ((var19.field2873 & var2.field2205) == 0) {
                                                            class216.method1483(class331.field5639, class42.field754, class61.field1045, var5, var3, var4);
                                                        } else {
                                                            class216.method1489(var19.field2873, class331.field5639, class42.field754, class61.field1045, var6, var3, var4);
                                                        }
                                                    }
                                                    var19.field2865.method190(0, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var19.field2868 - class331.field5639, var19.field2857 - class42.field754, var19.field2870 - class61.field1045, var19.field2860, var5, (class164) null);
                                                }
                                                for (int var20 = 0; var20 < var18.field2201; var20++) {
                                                    class104 var21 = var18.field2204[var20];
                                                    if (var21 != null) {
                                                        if (class108.field1900) {
                                                            class216.method1483(class331.field5639, class42.field754, class61.field1045, var5, var3, var4);
                                                        }
                                                        var21.field1806.method190(var21.field1798, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var21.field1811 - class331.field5639, var21.field1795 - class42.field754, var21.field1793 - class61.field1045, var21.field1814, var5, (class164) null);
                                                    }
                                                }
                                                if (class108.field1900) {
                                                    class108.method756(var8);
                                                }
                                            }
                                            boolean var22 = false;
                                            if (var2.field2187 == null) {
                                                if (var2.field2188 != null) {
                                                    if (class268.method1889(var6, var3, var4)) {
                                                        class254.method1803(var2.field2188, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var3, var4, true);
                                                    } else {
                                                        var22 = true;
                                                        class254.method1803(var2.field2188, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var3, var4, false);
                                                    }
                                                }
                                            } else if (class268.method1889(var6, var3, var4)) {
                                                class1.method2(var2.field2187, var6, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var3, var4, true);
                                            } else {
                                                var22 = true;
                                                if (var2.field2187.field1771 != 12345678 || class10.field115 && var5 <= class80.field1457) {
                                                    class1.method2(var2.field2187, var6, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var3, var4, false);
                                                }
                                            }
                                            if (var22) {
                                                class143 var23 = var2.field2190;
                                                if (var23 != null && (var23.field2493 & 0x80000000L) != 0L) {
                                                    if (class108.field1900 && var23.field2481) {
                                                        class108.method756(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class108.field1900) {
                                                        class216.method1483(class331.field5639, class42.field754, class61.field1045, var5, var3, var4);
                                                    }
                                                    var23.field2480.method190(0, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var23.field2491 - class331.field5639, var23.field2477 - class42.field754, var23.field2495 - class61.field1045, var23.field2493, var5, (class164) null);
                                                    if (class108.field1900 && var23.field2481) {
                                                        class108.method756(var8);
                                                    }
                                                }
                                            }
                                            int var24 = 0;
                                            int var25 = 0;
                                            class167 var26 = var2.field2198;
                                            class232 var27 = var2.field2192;
                                            if (var26 != null || var27 != null) {
                                                if (class325.field5481 == var3) {
                                                    var24++;
                                                } else if (class325.field5481 < var3) {
                                                    var24 += 2;
                                                }
                                                if (class243.field4316 == var4) {
                                                    var24 += 3;
                                                } else if (class243.field4316 > var4) {
                                                    var24 += 6;
                                                }
                                                var25 = class82.field1516[var24];
                                                var2.field2205 = class12.field141[var24];
                                            }
                                            if (var26 != null) {
                                                if ((var26.field2873 & class221.field3774[var24]) == 0) {
                                                    var2.field2214 = 0;
                                                } else if (var26.field2873 == 16) {
                                                    var2.field2214 = 3;
                                                    var2.field2211 = class261.field4535[var24];
                                                    var2.field2191 = 3 - var2.field2211;
                                                } else if (var26.field2873 == 32) {
                                                    var2.field2214 = 6;
                                                    var2.field2211 = class206.field3603[var24];
                                                    var2.field2191 = 6 - var2.field2211;
                                                } else if (var26.field2873 == 64) {
                                                    var2.field2214 = 12;
                                                    var2.field2211 = class161.field2730[var24];
                                                    var2.field2191 = 12 - var2.field2211;
                                                } else {
                                                    var2.field2214 = 9;
                                                    var2.field2211 = class42.field774[var24];
                                                    var2.field2191 = 9 - var2.field2211;
                                                }
                                                if ((var26.field2873 & var25) != 0 && !class221.method1523(var6, var3, var4, var26.field2873)) {
                                                    if (class108.field1900) {
                                                        class216.method1483(class331.field5639, class42.field754, class61.field1045, var5, var3, var4);
                                                    }
                                                    var26.field2865.method190(0, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var26.field2868 - class331.field5639, var26.field2857 - class42.field754, var26.field2870 - class61.field1045, var26.field2860, var5, (class164) null);
                                                }
                                                if ((var26.field2866 & var25) != 0 && !class221.method1523(var6, var3, var4, var26.field2866)) {
                                                    if (class108.field1900) {
                                                        class216.method1483(class331.field5639, class42.field754, class61.field1045, var5, var3, var4);
                                                    }
                                                    var26.field2874.method190(0, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var26.field2868 - class331.field5639, var26.field2857 - class42.field754, var26.field2870 - class61.field1045, var26.field2860, var5, (class164) null);
                                                }
                                            }
                                            if (var27 != null && !class69.method511(var6, var3, var4, var27.field4016.method201())) {
                                                if (class108.field1900) {
                                                    class108.method756(var8 - 0.5F);
                                                }
                                                if ((var27.field4038 & var25) != 0) {
                                                    if (class108.field1900) {
                                                        class216.method1483(class331.field5639, class42.field754, class61.field1045, var5, var3, var4);
                                                    }
                                                    var27.field4016.method190(0, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var27.field4036 + var27.field4021 - class331.field5639, var27.field4019 - class42.field754, var27.field4037 + var27.field4029 - class61.field1045, var27.field4027, var5, (class164) null);
                                                } else if (var27.field4038 == 256) {
                                                    int var28 = var27.field4036 - class331.field5639;
                                                    int var29 = var27.field4019 - class42.field754;
                                                    int var30 = var27.field4037 - class61.field1045;
                                                    int var31 = var27.field4013;
                                                    int var32;
                                                    if (var31 == 1 || var31 == 2) {
                                                        var32 = -var28;
                                                    } else {
                                                        var32 = var28;
                                                    }
                                                    int var33;
                                                    if (var31 == 2 || var31 == 3) {
                                                        var33 = -var30;
                                                    } else {
                                                        var33 = var30;
                                                    }
                                                    if (var33 < var32) {
                                                        if (class108.field1900) {
                                                            class216.method1483(class331.field5639, class42.field754, class61.field1045, var5, var3, var4);
                                                        }
                                                        var27.field4016.method190(0, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var27.field4021 + var28, var29, var27.field4029 + var30, var27.field4027, var5, (class164) null);
                                                    } else if (var27.field4028 != null) {
                                                        if (class108.field1900) {
                                                            class216.method1483(class331.field5639, class42.field754, class61.field1045, var5, var3, var4);
                                                        }
                                                        var27.field4028.method190(0, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var28, var29, var30, var27.field4027, var5, (class164) null);
                                                    }
                                                }
                                                if (class108.field1900) {
                                                    class108.method756(var8);
                                                }
                                            }
                                            if (var22) {
                                                class143 var34 = var2.field2190;
                                                if (var34 != null && (var34.field2493 & 0x80000000L) == 0L) {
                                                    if (class108.field1900 && var34.field2481) {
                                                        class108.method756(var8 + 50.0F - 1.5F);
                                                    }
                                                    if (class108.field1900) {
                                                        class216.method1483(class331.field5639, class42.field754, class61.field1045, var5, var3, var4);
                                                    }
                                                    var34.field2480.method190(0, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var34.field2491 - class331.field5639, var34.field2477 - class42.field754, var34.field2495 - class61.field1045, var34.field2493, var5, (class164) null);
                                                    if (class108.field1900 && var34.field2481) {
                                                        class108.method756(var8);
                                                    }
                                                }
                                                class240 var35 = var2.field2196;
                                                if (var35 != null && var35.field4232 == 0) {
                                                    if (class108.field1900) {
                                                        class216.method1483(class331.field5639, class42.field754, class61.field1045, var5, var3, var4);
                                                    }
                                                    if (var35.field4241 != null) {
                                                        var35.field4241.method190(0, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var35.field4235 - class331.field5639, var35.field4228 - class42.field754, var35.field4236 - class61.field1045, var35.field4233, var5, (class164) null);
                                                    }
                                                    if (var35.field4237 != null) {
                                                        var35.field4237.method190(0, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var35.field4235 - class331.field5639, var35.field4228 - class42.field754, var35.field4236 - class61.field1045, var35.field4233, var5, (class164) null);
                                                    }
                                                    if (var35.field4240 != null) {
                                                        var35.field4240.method190(0, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var35.field4235 - class331.field5639, var35.field4228 - class42.field754, var35.field4236 - class61.field1045, var35.field4233, var5, (class164) null);
                                                    }
                                                }
                                            }
                                            int var36 = var2.field2194;
                                            if (var36 != 0) {
                                                if (var3 < class325.field5481 && (var36 & 0x4) != 0) {
                                                    class125 var37 = var7[var3 + 1][var4];
                                                    if (var37 != null && var37.field2199) {
                                                        class245.field4355.method2079(var37, 45);
                                                    }
                                                }
                                                if (var4 < class243.field4316 && (var36 & 0x2) != 0) {
                                                    class125 var38 = var7[var3][var4 + 1];
                                                    if (var38 != null && var38.field2199) {
                                                        class245.field4355.method2079(var38, 74);
                                                    }
                                                }
                                                if (var3 > class325.field5481 && (var36 & 0x1) != 0) {
                                                    class125 var39 = var7[var3 - 1][var4];
                                                    if (var39 != null && var39.field2199) {
                                                        class245.field4355.method2079(var39, 72);
                                                    }
                                                }
                                                if (var4 > class243.field4316 && (var36 & 0x8) != 0) {
                                                    class125 var40 = var7[var3][var4 - 1];
                                                    if (var40 != null && var40.field2199) {
                                                        class245.field4355.method2079(var40, 80);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2214 != 0) {
                                            boolean var41 = true;
                                            for (int var42 = 0; var42 < var2.field2201; var42++) {
                                                if (class31.field535 != var2.field2204[var42].field1807 && (var2.field2208[var42] & var2.field2214) == var2.field2211) {
                                                    var41 = false;
                                                    break;
                                                }
                                            }
                                            if (var41) {
                                                class167 var43 = var2.field2198;
                                                if (!class221.method1523(var6, var3, var4, var43.field2873)) {
                                                    if (class108.field1900) {
                                                        label1026: {
                                                            if ((var43.field2860 & 0xFC000L) == 16384L) {
                                                                int var44 = var43.field2868 - class331.field5639;
                                                                int var45 = var43.field2870 - class61.field1045;
                                                                int var46 = (int) (var43.field2860 >> 20 & 0x3L);
                                                                if (var46 == 0) {
                                                                    var44 -= 64;
                                                                    var45 += 64;
                                                                    if (var45 < var44 && var3 > 0 && var4 < class10.field119 - 1) {
                                                                        class216.method1483(class331.field5639, class42.field754, class61.field1045, var5, var3 - 1, var4 + 1);
                                                                        break label1026;
                                                                    }
                                                                } else if (var46 == 1) {
                                                                    var44 += 64;
                                                                    var45 += 64;
                                                                    if (var45 < -var44 && var3 < class170.field2971 - 1 && var4 < class10.field119 - 1) {
                                                                        class216.method1483(class331.field5639, class42.field754, class61.field1045, var5, var3 + 1, var4 + 1);
                                                                        break label1026;
                                                                    }
                                                                } else if (var46 == 2) {
                                                                    var44 += 64;
                                                                    var45 -= 64;
                                                                    if (var45 > var44 && var3 < class170.field2971 - 1 && var4 > 0) {
                                                                        class216.method1483(class331.field5639, class42.field754, class61.field1045, var5, var3 + 1, var4 - 1);
                                                                        break label1026;
                                                                    }
                                                                } else if (var46 == 3) {
                                                                    var44 -= 64;
                                                                    var45 -= 64;
                                                                    if (var45 > -var44 && var3 > 0 && var4 > 0) {
                                                                        class216.method1483(class331.field5639, class42.field754, class61.field1045, var5, var3 - 1, var4 - 1);
                                                                        break label1026;
                                                                    }
                                                                }
                                                            }
                                                            class216.method1483(class331.field5639, class42.field754, class61.field1045, var5, var3, var4);
                                                        }
                                                    }
                                                    var43.field2865.method190(0, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var43.field2868 - class331.field5639, var43.field2857 - class42.field754, var43.field2870 - class61.field1045, var43.field2860, var5, (class164) null);
                                                }
                                                var2.field2214 = 0;
                                            }
                                        }
                                        if (!var2.field2197) {
                                            break;
                                        }
                                        try {
                                            int var47 = var2.field2201;
                                            var2.field2197 = false;
                                            int var48 = 0;
                                            label832: for (int var49 = 0; var49 < var47; var49++) {
                                                class104 var50 = var2.field2204[var49];
                                                if (class31.field535 != var50.field1807) {
                                                    for (int var51 = var50.field1800; var51 <= var50.field1802; var51++) {
                                                        for (int var52 = var50.field1791; var52 <= var50.field1812; var52++) {
                                                            class125 var53 = var7[var51][var52];
                                                            if (var53.field2212) {
                                                                var2.field2197 = true;
                                                                continue label832;
                                                            }
                                                            if (var53.field2214 != 0) {
                                                                int var54 = 0;
                                                                if (var51 > var50.field1800) {
                                                                    var54++;
                                                                }
                                                                if (var51 < var50.field1802) {
                                                                    var54 += 4;
                                                                }
                                                                if (var52 > var50.field1791) {
                                                                    var54 += 8;
                                                                }
                                                                if (var52 < var50.field1812) {
                                                                    var54 += 2;
                                                                }
                                                                if ((var54 & var53.field2214) == var2.field2191) {
                                                                    var2.field2197 = true;
                                                                    continue label832;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class318.field5372[var48++] = var50;
                                                    int var55 = class325.field5481 - var50.field1800;
                                                    int var56 = var50.field1802 - class325.field5481;
                                                    if (var56 > var55) {
                                                        var55 = var56;
                                                    }
                                                    int var57 = class243.field4316 - var50.field1791;
                                                    int var58 = var50.field1812 - class243.field4316;
                                                    if (var58 > var57) {
                                                        var50.field1803 = var55 + var58;
                                                    } else {
                                                        var50.field1803 = var55 + var57;
                                                    }
                                                }
                                            }
                                            while (var48 > 0) {
                                                int var59 = -50;
                                                int var60 = -1;
                                                for (int var61 = 0; var61 < var48; var61++) {
                                                    class104 var62 = class318.field5372[var61];
                                                    if (class31.field535 != var62.field1807) {
                                                        if (var62.field1803 > var59) {
                                                            var59 = var62.field1803;
                                                            var60 = var61;
                                                        } else if (var62.field1803 == var59) {
                                                            int var63 = var62.field1811 - class331.field5639;
                                                            int var64 = var62.field1793 - class61.field1045;
                                                            int var65 = class318.field5372[var60].field1811 - class331.field5639;
                                                            int var66 = class318.field5372[var60].field1793 - class61.field1045;
                                                            if (var63 * var63 + var64 * var64 > var65 * var65 + var66 * var66) {
                                                                var60 = var61;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var60 == -1) {
                                                    break;
                                                }
                                                class104 var67 = class318.field5372[var60];
                                                var67.field1807 = class31.field535;
                                                if (!class290.method2019(var6, var67.field1800, var67.field1802, var67.field1791, var67.field1812, var67.field1806.method201())) {
                                                    if (class108.field1900) {
                                                        if ((var67.field1814 & 0xFC000L) == 147456L) {
                                                            class216.method1483(class331.field5639, class42.field754, class61.field1045, var5, var3, var4);
                                                            int var68 = var67.field1811 - class331.field5639;
                                                            int var69 = var67.field1793 - class61.field1045;
                                                            int var70 = (int) (var67.field1814 >> 20 & 0x3L);
                                                            if (var70 == 1 || var70 == 3) {
                                                                if (var69 > -var68) {
                                                                    class216.method1487(var5, var3, var4 - 1, var3 - 1, var4);
                                                                } else {
                                                                    class216.method1487(var5, var3, var4 + 1, var3 + 1, var4);
                                                                }
                                                            } else if (var69 > var68) {
                                                                class216.method1487(var5, var3, var4 - 1, var3 + 1, var4);
                                                            } else {
                                                                class216.method1487(var5, var3, var4 + 1, var3 - 1, var4);
                                                            }
                                                        } else {
                                                            class216.method1484(class331.field5639, class42.field754, class61.field1045, var5, var67.field1800, var67.field1791, var67.field1802, var67.field1812);
                                                        }
                                                    }
                                                    var67.field1806.method190(var67.field1798, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var67.field1811 - class331.field5639, var67.field1795 - class42.field754, var67.field1793 - class61.field1045, var67.field1814, var5, (class164) null);
                                                }
                                                for (int var71 = var67.field1800; var71 <= var67.field1802; var71++) {
                                                    for (int var72 = var67.field1791; var72 <= var67.field1812; var72++) {
                                                        class125 var73 = var7[var71][var72];
                                                        if (var73.field2214 != 0) {
                                                            class245.field4355.method2079(var73, 115);
                                                        } else if ((var3 != var71 || var4 != var72) && var73.field2199) {
                                                            class245.field4355.method2079(var73, 98);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2197) {
                                                break;
                                            }
                                        } catch (Exception var133) {
                                            var2.field2197 = false;
                                            break;
                                        }
                                    }
                                    if (var2.field2189 != null) {
                                        if (class108.field1900) {
                                            GL var75 = class108.field1899;
                                            class164.method1109(class331.field5639, class42.field754, class61.field1045);
                                            int var76 = var2.field2202 * 128 + 64 - class331.field5639;
                                            int var77 = class132.field2328[var5][var2.field2202][var2.field2215] - class42.field754;
                                            int var78 = var2.field2215 * 128 + 64 - class61.field1045;
                                            int var79;
                                            if (var5 < 3) {
                                                var79 = class132.field2328[var5][var2.field2202][var2.field2215] - class132.field2328[var5 + 1][var2.field2202][var2.field2215];
                                            } else {
                                                var79 = 1024;
                                            }
                                            int var80 = class150.field2604 * var78 - class211.field3626 * var76 >> 16;
                                            int var81 = class199.field3486 * var77 + class174.field3038 * var80 >> 16;
                                            int var82 = (class199.field3486 * 0 + class174.field3038 * 92 >> 16) + var81;
                                            int var83 = (class174.field3038 * -92 - class199.field3486 * var79 >> 16) + var81;
                                            int var84 = var82 + 2 - var83;
                                            class181 var85 = null;
                                            class292 var86 = null;
                                            int var87 = -1;
                                            class181 var88 = (class181) var2.field2189.method1048(31832);
                                            while (true) {
                                                label1042: {
                                                    if (var88 != null) {
                                                        if (var88.field3136 == null || var88.field3136.field4983.field2783) {
                                                            var88.method172(338);
                                                            break label1042;
                                                        }
                                                        if ((byte) ((int) (var88.field3136.field4983.field2789 & 0xFFL)) != var2.field2213) {
                                                            var2.field2189 = null;
                                                            break;
                                                        }
                                                        if (var85 == null) {
                                                            var85 = var88;
                                                            var86 = var88.field3136;
                                                            var87 = var86.field4993.field4146;
                                                            break label1042;
                                                        }
                                                    }
                                                    if (var85 != null && (var88 == null || var88.field3136 != var86 || var88.field3136.field4993.field4146 != var87)) {
                                                        for (int var89 = 0; var89 < var84; var89++) {
                                                            class164.field2798[var89] = 0;
                                                        }
                                                        for (int var90 = 0; var90 < 32; var90++) {
                                                            class164.field2793[var90] = 0;
                                                        }
                                                        class164.field2797 = 0;
                                                        for (class181 var91 = var85; var91 != var88; var91 = (class181) var91.field4776) {
                                                            if (var91.field3136 != null) {
                                                                int var92 = (var91.field3131 >> 12) - class331.field5639;
                                                                int var93 = (var91.field3129 >> 12) - class42.field754;
                                                                int var94 = (var91.field3127 >> 12) - class61.field1045;
                                                                int var95 = class150.field2604 * var94 - class211.field3626 * var92 >> 16;
                                                                int var96 = (class199.field3486 * var93 + class174.field3038 * var95 >> 16) - var83;
                                                                if (class164.field2798[var96] < 32) {
                                                                    class164.field2801[var96][class164.field2798[var96]++] = var91.field3137;
                                                                } else {
                                                                    if (class164.field2798[var96] == 32) {
                                                                        if (class164.field2797 == 32) {
                                                                            if (class164.field2788) {
                                                                                System.out.println("Overflowed world-based radix sort");
                                                                            }
                                                                            break;
                                                                        }
                                                                        class164.field2798[var96] += class164.field2797++ + 1;
                                                                    }
                                                                    int var97 = class164.field2793[class164.field2798[var96] - 32 - 1];
                                                                    if (var97 < 768) {
                                                                        short[] var10000 = class164.field2799[class164.field2798[var96] - 32 - 1];
                                                                        int var10002 = class164.field2798[var96] - 32 - 1;
                                                                        int var10004 = class164.field2793[class164.field2798[var96] - 32 - 1];
                                                                        class164.field2793[var10002] = class164.field2793[class164.field2798[var96] - 32 - 1] + 1;
                                                                        var10000[var10004] = var91.field3137;
                                                                    }
                                                                }
                                                            }
                                                            if (var2.field2189.field2660 == var91.field4776) {
                                                                break;
                                                            }
                                                        }
                                                        boolean var98 = false;
                                                        if (class164.field2773 && var86.field4993.field4140 != -1) {
                                                            class227.field3904.method1504(var86.field4993.field4140, 255);
                                                            var98 = true;
                                                        } else {
                                                            class108.method736(-1);
                                                        }
                                                        var75.glPointSize((float) var87);
                                                        var86.field4983.method1115(var75, var84, var98, var86.field4993.field4147);
                                                        if (var88 != null) {
                                                            var85 = var88;
                                                            var86 = var88.field3136;
                                                            var87 = var88.field3136.field4993.field4146;
                                                        }
                                                    }
                                                    if (var88 == null) {
                                                        break;
                                                    }
                                                }
                                                var88 = (class181) var2.field2189.method1045(6507);
                                            }
                                            class164.method1118();
                                        } else {
                                            int var99 = class227.field3909 + class164.field2786;
                                            int var100 = class227.field3895 + class164.field2781;
                                            class279 var101 = var2.field2189.field2660;
                                            for (class279 var102 = var101.field4776; var102 != var101; var102 = var102.field4776) {
                                                class181 var103 = (class181) var102;
                                                if (var103.field3136 != null && !var103.field3136.field4983.field2783) {
                                                    if ((byte) ((int) (var103.field3136.field4983.field2789 & 0xFFL)) != var2.field2213) {
                                                        var2.field2189 = null;
                                                        break;
                                                    }
                                                    int var104 = (var103.field3131 >> 12) - class331.field5639;
                                                    int var105 = (var103.field3129 >> 12) - class42.field754;
                                                    int var106 = (var103.field3127 >> 12) - class61.field1045;
                                                    int var107 = class211.field3626 * var106 + class150.field2604 * var104 >> 16;
                                                    int var108 = class150.field2604 * var106 - class211.field3626 * var104 >> 16;
                                                    int var110 = class174.field3038 * var105 - class199.field3486 * var108 >> 16;
                                                    int var111 = class199.field3486 * var105 + class174.field3038 * var108 >> 16;
                                                    if (var111 >= 50) {
                                                        int var113 = (var107 << 9) / var111 + var99;
                                                        int var114 = (var110 << 9) / var111 + var100;
                                                        class114.method812(var113, var114, var103.field3136.field4993.field4146 >> 2, var103.field3133, var103.field3133 >> 24 & 0xFF);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } while (!var2.field2199);
                            } while (var2.field2214 != 0);
                            if (var3 > class325.field5481 || var3 <= class211.field3631) {
                                break;
                            }
                            var115 = var7[var3 - 1][var4];
                        } while (var115 != null && var115.field2199);
                        if (var3 < class325.field5481 || var3 >= class167.field2867 - 1) {
                            break;
                        }
                        var116 = var7[var3 + 1][var4];
                    } while (var116 != null && var116.field2199);
                    if (var4 > class243.field4316 || var4 <= class5.field49) {
                        break;
                    }
                    var117 = var7[var3][var4 - 1];
                } while (var117 != null && var117.field2199);
                if (var4 < class243.field4316 || var4 >= class137.field2380 - 1) {
                    break;
                }
                var118 = var7[var3][var4 + 1];
            } while (var118 != null && var118.field2199);
            var2.field2199 = false;
            class287.field4911--;
            class240 var119 = var2.field2196;
            if (var119 != null && var119.field4232 != 0) {
                if (class108.field1900) {
                    class216.method1483(class331.field5639, class42.field754, class61.field1045, var5, var3, var4);
                }
                if (var119.field4241 != null) {
                    var119.field4241.method190(0, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var119.field4235 - class331.field5639, var119.field4228 - class42.field754 - var119.field4232, var119.field4236 - class61.field1045, var119.field4233, var5, (class164) null);
                }
                if (var119.field4237 != null) {
                    var119.field4237.method190(0, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var119.field4235 - class331.field5639, var119.field4228 - class42.field754 - var119.field4232, var119.field4236 - class61.field1045, var119.field4233, var5, (class164) null);
                }
                if (var119.field4240 != null) {
                    var119.field4240.method190(0, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var119.field4235 - class331.field5639, var119.field4228 - class42.field754 - var119.field4232, var119.field4236 - class61.field1045, var119.field4233, var5, (class164) null);
                }
            }
            if (var2.field2205 != 0) {
                class232 var120 = var2.field2192;
                if (var120 != null && !class69.method511(var6, var3, var4, var120.field4016.method201())) {
                    if ((var120.field4038 & var2.field2205) != 0) {
                        if (class108.field1900) {
                            class216.method1483(class331.field5639, class42.field754, class61.field1045, var5, var3, var4);
                        }
                        var120.field4016.method190(0, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var120.field4036 + var120.field4021 - class331.field5639, var120.field4019 - class42.field754, var120.field4037 + var120.field4029 - class61.field1045, var120.field4027, var5, (class164) null);
                    } else if (var120.field4038 == 256) {
                        int var121 = var120.field4036 - class331.field5639;
                        int var122 = var120.field4019 - class42.field754;
                        int var123 = var120.field4037 - class61.field1045;
                        int var124 = var120.field4013;
                        int var125;
                        if (var124 == 1 || var124 == 2) {
                            var125 = -var121;
                        } else {
                            var125 = var121;
                        }
                        int var126;
                        if (var124 == 2 || var124 == 3) {
                            var126 = -var123;
                        } else {
                            var126 = var123;
                        }
                        if (var126 >= var125) {
                            if (class108.field1900) {
                                class216.method1483(class331.field5639, class42.field754, class61.field1045, var5, var3, var4);
                            }
                            var120.field4016.method190(0, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var120.field4021 + var121, var122, var120.field4029 + var123, var120.field4027, var5, (class164) null);
                        } else if (var120.field4028 != null) {
                            if (class108.field1900) {
                                class216.method1483(class331.field5639, class42.field754, class61.field1045, var5, var3, var4);
                            }
                            var120.field4028.method190(0, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var121, var122, var123, var120.field4027, var5, (class164) null);
                        }
                    }
                }
                class167 var127 = var2.field2198;
                if (var127 != null) {
                    if ((var127.field2866 & var2.field2205) != 0 && !class221.method1523(var6, var3, var4, var127.field2866)) {
                        if (class108.field1900) {
                            class216.method1489(var127.field2866, class331.field5639, class42.field754, class61.field1045, var6, var3, var4);
                        }
                        var127.field2874.method190(0, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var127.field2868 - class331.field5639, var127.field2857 - class42.field754, var127.field2870 - class61.field1045, var127.field2860, var5, (class164) null);
                    }
                    if ((var127.field2873 & var2.field2205) != 0 && !class221.method1523(var6, var3, var4, var127.field2873)) {
                        if (class108.field1900) {
                            class216.method1489(var127.field2873, class331.field5639, class42.field754, class61.field1045, var6, var3, var4);
                        }
                        var127.field2865.method190(0, class199.field3486, class174.field3038, class211.field3626, class150.field2604, var127.field2868 - class331.field5639, var127.field2857 - class42.field754, var127.field2870 - class61.field1045, var127.field2860, var5, (class164) null);
                    }
                }
            }
            if (var5 < class45.field828 - 1) {
                class125 var128 = class312.field5246[var5 + 1][var3][var4];
                if (var128 != null && var128.field2199) {
                    class245.field4355.method2079(var128, 53);
                }
            }
            if (var3 < class325.field5481) {
                class125 var129 = var7[var3 + 1][var4];
                if (var129 != null && var129.field2199) {
                    class245.field4355.method2079(var129, 62);
                }
            }
            if (var4 < class243.field4316) {
                class125 var130 = var7[var3][var4 + 1];
                if (var130 != null && var130.field2199) {
                    class245.field4355.method2079(var130, 37);
                }
            }
            if (var3 > class325.field5481) {
                class125 var131 = var7[var3 - 1][var4];
                if (var131 != null && var131.field2199) {
                    class245.field4355.method2079(var131, 83);
                }
            }
            if (var4 > class243.field4316) {
                class125 var132 = var7[var3][var4 - 1];
                if (var132 != null && var132.field2199) {
                    class245.field4355.method2079(var132, 65);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(IIIIIFFF)V", line = 1241)
    public class23(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field411 = (int) (arg6 * 4096.0F);
        this.field425 = (int) (arg7 * 4096.0F);
        this.field426 = this.field424 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)V", line = 1259)
    public static void method219(int arg0) {
        field429 = null;
        field430 = null;
        field423 = (class67[][]) null;
        int var1 = -64 / ((arg0) / 46);
        field413 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lek;Lek;ILek;)V", line = 1276)
    public static final void method220(class185 arg0, class185 arg1, int arg2, class185 arg3) {
        field412++;
        class89.field1629 = arg1;
        class64.field1113 = arg0;
        class56.field1002 = arg3;
        if (arg2 != 0) {
            field415 = -10;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)V", line = 1292)
    public final void method221(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field434 = 4096;
            this.field431 = this.field411 - (arg0 < 0 ? -arg0 : arg0);
            this.field431 = this.field431 * this.field431 >> 12;
            this.field417 = this.field431;
        } else {
            this.field434 = this.field431 * this.field425 >> 12;
            if (this.field434 < 0) {
                this.field434 = 0;
            } else if (this.field434 > 4096) {
                this.field434 = 4096;
            }
            this.field431 = this.field411 - (arg0 < 0 ? -arg0 : arg0);
            this.field431 = this.field431 * this.field431 >> 12;
            this.field431 = this.field434 * this.field431 >> 12;
            this.field417 += this.field431 * this.field426 >> 12;
            this.field426 = this.field426 * this.field424 >> 12;
        }
        field421++;
        if (arg1 != -1513462804) {
            method224(-8, (byte) -34);
        }
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)V", line = 1327)
    public final void method222(int arg0) {
        if (arg0 != 22620) {
            this.method217(31);
        }
        this.field417 = 0;
        field433++;
        this.field427 = 0;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)I", line = 1347)
    public static final int method223(int arg0, int arg1) {
        if (arg0 != 784978120) {
            method223(93, 29);
        }
        field416++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(IB)V", line = 1393)
    public static final void method224(int arg0, byte arg1) {
        field420++;
        if (arg1 != -67) {
            method220((class185) null, (class185) null, 56, (class185) null);
        }
        class122 var2 = class323.method2175(3, arg0, -25873);
        var2.method865(arg1 - 52);
    }
}
