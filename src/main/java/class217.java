import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class217 {

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "I")
    public int field3135;

    @OriginalMember(owner = "client!vv", name = "s", descriptor = "Ldu;")
    public static class242 field3149 = new class242(11, 3);

    @OriginalMember(owner = "client!vv", name = "u", descriptor = "Z")
    public static boolean field3151 = false;

    @OriginalMember(owner = "client!vv", name = "x", descriptor = "[I")
    public static int[] field3154 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!vv", name = "t", descriptor = "[Lwo;")
    public static class533[] field3150 = new class533[75];

    @OriginalMember(owner = "client!vv", name = "v", descriptor = "Z")
    public static boolean field3152 = true;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
    public int field3133;

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "I")
    public int field3136;

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!vv", name = "o", descriptor = "I")
    public int field3145;

    @OriginalMember(owner = "client!vv", name = "w", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!vv", name = "r", descriptor = "Lrg;")
    public class463 field3148;

    @OriginalMember(owner = "client!vv", name = "k", descriptor = "[I")
    public int[] field3141;

    @OriginalMember(owner = "client!vv", name = "l", descriptor = "[I")
    public int[] field3142;

    @OriginalMember(owner = "client!vv", name = "m", descriptor = "[I")
    public int[] field3143;

    @OriginalMember(owner = "client!vv", name = "n", descriptor = "[I")
    public int[] field3144;

    @OriginalMember(owner = "client!vv", name = "p", descriptor = "[I")
    public int[] field3146;

    @OriginalMember(owner = "client!vv", name = "q", descriptor = "[I")
    public int[] field3147;

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "[Lrg;")
    public class463[] field3137;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "[[I")
    public int[][] field3134;

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "[[I")
    public int[][] field3140;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "([BI)V", line = 3)
    private final void method1347(byte[] arg0, int arg1) {
        field3139++;
        class403 var3 = new class403(class84.method612(17801, arg0));
        int var4 = var3.method2357((byte) 119);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field3136 = 0;
        } else {
            this.field3136 = var3.method2319((byte) 75);
        }
        int var5 = var3.method2357((byte) 118);
        this.field3145 = var3.method2338(arg1 ^ arg1);
        int var6 = 0;
        this.field3147 = new int[this.field3145];
        int var7 = -1;
        for (int var8 = 0; var8 < this.field3145; var8++) {
            this.field3147[var8] = var6 += var3.method2338(0);
            if (this.field3147[var8] > var7) {
                var7 = this.field3147[var8];
            }
        }
        this.field3133 = var7 + 1;
        this.field3143 = new int[this.field3133];
        this.field3142 = new int[this.field3133];
        this.field3141 = new int[this.field3133];
        this.field3140 = new int[this.field3133][];
        this.field3146 = new int[this.field3133];
        if (var5 != 0) {
            this.field3144 = new int[this.field3133];
            for (int var9 = 0; var9 < this.field3133; var9++) {
                this.field3144[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field3145; var10++) {
                this.field3144[this.field3147[var10]] = var3.method2319((byte) 106);
            }
            this.field3148 = new class463(this.field3144);
        }
        for (int var11 = 0; var11 < this.field3145; var11++) {
            this.field3143[this.field3147[var11]] = var3.method2319((byte) 78);
        }
        for (int var12 = 0; var12 < this.field3145; var12++) {
            this.field3146[this.field3147[var12]] = var3.method2319((byte) 93);
        }
        for (int var13 = 0; var13 < this.field3145; var13++) {
            this.field3142[this.field3147[var13]] = var3.method2338(class509.method3039(arg1, 1));
        }
        for (int var14 = 0; var14 < this.field3145; var14++) {
            int var21 = this.field3147[var14];
            int var22 = 0;
            int var23 = this.field3142[var21];
            int var24 = -1;
            this.field3140[var21] = new int[var23];
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field3140[var21][var25] = var22 += var3.method2338(class509.method3039(arg1, 1));
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field3141[var21] = var24 + 1;
            if ((var24 + 1) == var23) {
                this.field3140[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field3137 = new class463[var7 + 1];
        this.field3134 = new int[var7 + 1][];
        for (int var15 = 0; var15 < this.field3145; var15++) {
            int var16 = this.field3147[var15];
            int var17 = this.field3142[var16];
            this.field3134[var16] = new int[this.field3141[var16]];
            for (int var18 = 0; var18 < this.field3141[var16]; var18++) {
                this.field3134[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field3140[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field3140[var16][var19];
                }
                this.field3134[var16][var20] = var3.method2319((byte) 99);
            }
            this.field3137[var16] = new class463(this.field3134[var16]);
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V", line = 174)
    public static void method1348(byte arg0) {
        field3150 = null;
        field3149 = null;
        field3154 = null;
        if (arg0 != 82) {
            field3151 = false;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(II)V", line = 186)
    public static final void method1349(int arg0, int arg1) {
        field3153++;
        class45 var2 = class354.method2094(arg0, (byte) -43, arg1);
        var2.method261(4);
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "()V", line = 199)
    public static final void method1350() {
        class197.field2808 = 0;
        label212: for (int var0 = 0; var0 < class345.field5010; var0++) {
            class296 var1 = class382.field5383[var0];
            if (class327.field4764 != null) {
                for (int var2 = 0; var2 < class327.field4764.length; var2++) {
                    if (class327.field4764[var2] != -1000000 && (var1.field4352 <= class327.field4764[var2] || var1.field4340 <= class327.field4764[var2]) && (var1.field4356 <= class470.field6560[var2] || var1.field4344 <= class470.field6560[var2]) && (var1.field4356 >= class511.field7559[var2] || var1.field4344 >= class511.field7559[var2]) && (var1.field4358 <= class367.field5235[var2] || var1.field4346 <= class367.field5235[var2]) && (var1.field4358 >= class168.field2454[var2] || var1.field4346 >= class168.field2454[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field4350 == 1) {
                int var3 = var1.field4343 + class153.field2206 - class88.field1096;
                if (var3 >= 0 && var3 <= class153.field2206 + class153.field2206) {
                    int var4 = var1.field4342 + class153.field2206 - class204.field2910;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class153.field2206 + class153.field2206) {
                        continue;
                    }
                    int var5 = var1.field4349 + class153.field2206 - class204.field2910;
                    if (var5 > class153.field2206 + class153.field2206) {
                        var5 = class153.field2206 + class153.field2206;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class477.field6647[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class347.field5024 - var1.field4356;
                        if (var7 > class400.field5632) {
                            var1.field4348 = 1;
                        } else {
                            if (var7 >= -class400.field5632) {
                                continue;
                            }
                            var1.field4348 = 2;
                            var7 = -var7;
                        }
                        var1.field4341 = (var1.field4358 - class181.field2608 << 8) / var7;
                        var1.field4357 = (var1.field4346 - class181.field2608 << 8) / var7;
                        var1.field4355 = (var1.field4352 - class222.field3198 << 8) / var7;
                        var1.field4347 = (var1.field4340 - class222.field3198 << 8) / var7;
                        class52.field629[class197.field2808++] = var1;
                    }
                }
            } else if (var1.field4350 == 2) {
                int var8 = var1.field4342 + class153.field2206 - class204.field2910;
                if (var8 >= 0 && var8 <= class153.field2206 + class153.field2206) {
                    int var9 = var1.field4343 + class153.field2206 - class88.field1096;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class153.field2206 + class153.field2206) {
                        continue;
                    }
                    int var10 = var1.field4354 + class153.field2206 - class88.field1096;
                    if (var10 > class153.field2206 + class153.field2206) {
                        var10 = class153.field2206 + class153.field2206;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class477.field6647[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class181.field2608 - var1.field4358;
                        if (var12 > class400.field5632) {
                            var1.field4348 = 3;
                        } else {
                            if (var12 >= -class400.field5632) {
                                continue;
                            }
                            var1.field4348 = 4;
                            var12 = -var12;
                        }
                        var1.field4359 = (var1.field4356 - class347.field5024 << 8) / var12;
                        var1.field4351 = (var1.field4344 - class347.field5024 << 8) / var12;
                        var1.field4355 = (var1.field4352 - class222.field3198 << 8) / var12;
                        var1.field4347 = (var1.field4340 - class222.field3198 << 8) / var12;
                        class52.field629[class197.field2808++] = var1;
                    }
                }
            } else if (var1.field4350 == 4) {
                int var13 = var1.field4352 - class222.field3198;
                if (var13 > class14.field185) {
                    int var14 = var1.field4342 + class153.field2206 - class204.field2910;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class153.field2206 + class153.field2206) {
                        continue;
                    }
                    int var15 = var1.field4349 + class153.field2206 - class204.field2910;
                    if (var15 > class153.field2206 + class153.field2206) {
                        var15 = class153.field2206 + class153.field2206;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field4343 + class153.field2206 - class88.field1096;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class153.field2206 + class153.field2206) {
                        continue;
                    }
                    int var17 = var1.field4354 + class153.field2206 - class88.field1096;
                    if (var17 > class153.field2206 + class153.field2206) {
                        var17 = class153.field2206 + class153.field2206;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class477.field6647[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field4348 = 5;
                        var1.field4359 = (var1.field4356 - class347.field5024 << 8) / var13;
                        var1.field4351 = (var1.field4344 - class347.field5024 << 8) / var13;
                        var1.field4341 = (var1.field4358 - class181.field2608 << 8) / var13;
                        var1.field4357 = (var1.field4346 - class181.field2608 << 8) / var13;
                        class52.field629[class197.field2808++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V", line = 457)
    public static final void method1351(int arg0) {
        field3138++;
        int var1 = 0;
        if (class4.field81.method728(false, class405.field5737)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (arg0 > -72) {
            method1350();
        }
        if (!class4.field81.field1412) {
            var1 |= 0x40;
        }
        class270.method1713(var1, 29380);
        class377.field5338.method1902(-127, var1);
        class344.field5000.method989(var1, (byte) -35);
        class106.field1400.method2584(var1, false);
        class125.field1688.method2456((byte) -82, var1);
        class450.method2634(-97, var1);
        class215.method1343(104, var1);
        class134.method850(36, var1);
        class64.method514(-1, var1);
        class224.method1381((byte) -63);
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "([BI)V", line = 525)
    public class217(byte[] arg0, int arg1) {
        this.field3135 = class542.method3182(arg0.length, arg0, 0);
        if (this.field3135 != arg1) {
            throw new RuntimeException();
        }
        this.method1347(arg0, 1);
    }
}
