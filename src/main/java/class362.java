import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class class362 {

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "[S")
    private static short[] field5164 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "[S")
    private static short[] field5167 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "[[F")
    public static float[][] field5170 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "[S")
    private static short[] field5175 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "[[S")
    public static short[][] field5169 = new short[][] { field5164, field5167, field5175 };

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "I")
    public static int field5168;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public int field5172;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "Ljava/lang/String;")
    public String field5173;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method2297(int arg0) throws IOException {
        if (arg0 == 512) {
            field5165++;
            return new Socket(this.field5173, this.field5172);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
    public static final void method2298(byte arg0) {
        field5171++;
        if (!class25.field320) {
            class17.field153 = class225.field3031 != -1 && class225.field3031 <= class284.field4103 || class553.field7716 < class284.field4103 * 16 + (class484.field6743 ? 26 : 22);
        }
        class681.field9473.method3615((byte) 120);
        class300.field4248.method3615((byte) -47);
        if (arg0 >= -63) {
            return;
        }
        for (class558 var1 = (class558) class290.field4161.method3618(-108); var1 != null; var1 = (class558) class290.field4161.method3619(0)) {
            int var38 = var1.field7754;
            if (var38 < 1000) {
                var1.method549(6410);
                if (var38 == 58 || var38 == 20 || var38 == 22 || var38 == 46 || var38 == 15 || var38 == 60 || var38 == 5) {
                    class300.field4248.method3610(9289, var1);
                } else {
                    class681.field9473.method3610(9289, var1);
                }
            }
        }
        class681.field9473.method3612(class290.field4161, 2);
        class300.field4248.method3612(class290.field4161, 2);
        if (class284.field4103 > 1) {
            if (class46.field584 && class224.field3014.method129(81, 95) && class284.field4103 > 2) {
                class655.field8752 = (class558) class290.field4161.field8670.field1075.field1075;
            } else {
                class655.field8752 = (class558) class290.field4161.field8670.field1075;
            }
            class498.field6967 = (class558) class290.field4161.field8670.field1075;
        } else {
            class498.field6967 = null;
            class655.field8752 = null;
        }
        int var2 = -1;
        class674 var3 = (class674) class72.field1088.method3618(116);
        if (var3 != null) {
            var2 = var3.method2573((byte) -111);
        }
        if (!class25.field320) {
            if (var2 == 0 && (class559.field7775 == 1 && class284.field4103 > 2 || class301.method1984(126))) {
                var2 = 2;
            }
            if (var2 == 2 && class284.field4103 > 0 && var3 != null) {
                if (class731.field10159 == null && class409.field5835 == 0) {
                    class435.method2683(-88, var3.method2574((byte) 2), var3.method2571(true));
                } else {
                    class258.field3735 = 2;
                }
            }
            if (var2 == 0) {
                if (class655.field8752 != null) {
                    class521.method3101((byte) -122);
                } else if (class160.field2235) {
                    class594.method3413((byte) 87);
                }
            }
            if (class731.field10159 != null || class409.field5835 != 0) {
                return;
            }
            class258.field3735 = 0;
            class435.field6066 = null;
            return;
        }
        if (var2 == -1) {
            int var4 = class103.field1419.method1553((byte) 99);
            int var5 = class103.field1419.method1556(20);
            boolean var6 = false;
            if (class610.field8211 != null) {
                if (var4 >= class530.field7345 - 10 && (class530.field7345 + class153.field2104 + 10) >= var4 && var5 >= (class479.field6657 - 10) && (class467.field6492 + class479.field6657 + 10) >= var5) {
                    var6 = true;
                } else {
                    class542.method3207(true);
                }
            }
            if (!var6) {
                if (var4 < (class401.field5750 - 10) || var4 > class746.field10270 + class401.field5750 + 10 || (class686.field9524 - 10) > var5 || class178.field2450 + class686.field9524 + 10 < var5) {
                    class320.method2068(-110);
                } else if (class17.field153) {
                    int var7 = -1;
                    int var8 = -1;
                    for (int var9 = 0; var9 < class569.field7865; var9++) {
                        if (class484.field6743) {
                            int var10 = class686.field9524 - (-var9 * 16 - 33);
                            if ((var10 - 13) < var5 && var10 + 4 > var5) {
                                var8 = var10 - 13;
                                var7 = var9;
                                break;
                            }
                        } else {
                            int var11 = var9 * 16 + class686.field9524 + 31;
                            if (var11 - 13 < var5 && (var11 + 3) > var5) {
                                var8 = var11 - 13;
                                var7 = var9;
                                break;
                            }
                        }
                    }
                    if (var7 != -1) {
                        int var12 = 0;
                        class87 var13 = new class87(class176.field2411);
                        for (class272 var14 = (class272) var13.method606(-93); var14 != null; var14 = (class272) var13.method610(16068)) {
                            if (var7 == var12) {
                                if (var14.field3953 > 1) {
                                    class616.method3489(var5, 692, var8, var14);
                                }
                                break;
                            }
                            var12++;
                        }
                    }
                }
            }
        }
        if (var2 != 0) {
            return;
        }
        int var15 = var3.method2574((byte) 2);
        int var16 = var3.method2571(true);
        if (class610.field8211 != null && var15 >= class530.field7345 && class530.field7345 + class153.field2104 >= var15 && class479.field6657 <= var16 && var16 <= class479.field6657 + class467.field6492) {
            int var17 = -1;
            for (int var18 = 0; var18 < class610.field8211.field3953; var18++) {
                if (class484.field6743) {
                    int var22 = var18 * 16 + class479.field6657 + 33;
                    if (var16 > var22 - 13 && var16 < var22 + 4) {
                        var17 = var18;
                    }
                } else {
                    int var23 = var18 * 16 + class479.field6657 + 31;
                    if (var16 > (var23 - 13) && var16 < (var23 + 3)) {
                        var17 = var18;
                    }
                }
            }
            if (var17 != -1) {
                int var19 = 0;
                class87 var20 = new class87(class610.field8211.field3951);
                for (class558 var21 = (class558) var20.method606(105); var21 != null; var21 = (class558) var20.method610(16068)) {
                    if (var17 == var19) {
                        class673.method3804(var21, var15, var16, true);
                        break;
                    }
                    var19++;
                }
            }
            class320.method2068(-125);
            return;
        }
        if (var15 < class401.field5750 || (class746.field10270 + class401.field5750) < var15 || class686.field9524 > var16 || (class686.field9524 + class178.field2450) < var16) {
            return;
        }
        if (!class17.field153) {
            int var24 = -1;
            for (int var25 = 0; var25 < class284.field4103; var25++) {
                if (class484.field6743) {
                    int var29 = ((class284.field4103 - var25 - 1) * 16) + class686.field9524 + 33;
                    if (var16 > (var29 - 13) && var16 < (var29 + 4)) {
                        var24 = var25;
                    }
                } else {
                    int var30 = (class284.field4103 - var25 - 1) * 16 + class686.field9524 + 31;
                    if ((var30 - 13) < var16 && var16 < (var30 + 3)) {
                        var24 = var25;
                    }
                }
            }
            if (var24 != -1) {
                int var26 = 0;
                class451 var27 = new class451(class290.field4161);
                for (class558 var28 = (class558) var27.method2760((byte) 120); var28 != null; var28 = (class558) var27.method2763(26385)) {
                    if (var24 == var26) {
                        class673.method3804(var28, var15, var16, true);
                        break;
                    }
                    var26++;
                }
            }
            class320.method2068(-75);
            return;
        }
        int var31 = -1;
        for (int var32 = 0; var32 < class569.field7865; var32++) {
            if (class484.field6743) {
                int var34 = var32 * 16 + class686.field9524 + 33;
                if ((var34 - 13) < var16 && (var34 + 4) > var16) {
                    var31 = var32;
                    break;
                }
            } else {
                int var33 = var32 * 16 + class686.field9524 + 31;
                if ((var33 - 13) < var16 && var33 + 3 > var16) {
                    var31 = var32;
                    break;
                }
            }
        }
        if (var31 == -1) {
            return;
        }
        int var35 = 0;
        class87 var36 = new class87(class176.field2411);
        for (class272 var37 = (class272) var36.method606(-85); var37 != null; var37 = (class272) var36.method610(16068)) {
            if (var31 == var35) {
                class673.method3804((class558) var37.field3951.field9462.field33, var15, var16, true);
                class320.method2068(-69);
                return;
            }
            var35++;
        }
        return;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III[[[Lve;IZ)Z")
    public static final boolean method2299(int arg0, int arg1, int arg2, class262[][][] arg3, int arg4, boolean arg5) {
        field5174++;
        byte var6 = arg5 ? 1 : (byte) (class428.field5973 & 0xFF);
        if (arg4 != 802127056) {
            field5167 = null;
        }
        if (class343.field4884[class96.field1331][arg0][arg2] == var6) {
            return false;
        } else if ((class692.field9623[class96.field1331][arg0][arg2] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class65.field1014[var7] = arg0;
            int var35 = var7 + 1;
            class113.field1511[var7] = arg2;
            class343.field4884[class96.field1331][arg0][arg2] = var6;
            while (var35 != var8) {
                int var9 = class65.field1014[var8] & 0xFFFF;
                int var10 = (class65.field1014[var8] & 0xFF2DFF) >> 16;
                int var11 = class65.field1014[var8] >> 24 & 0xFF;
                int var12 = class113.field1511[var8] & 0xFFFF;
                int var13 = (class113.field1511[var8] & 0xFF8906) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class692.field9623[class96.field1331][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                if (arg3 != null) {
                    label244: for (int var16 = class96.field1331 + 1; var16 <= 3; var16++) {
                        if (arg3[var16] != null && (class692.field9623[var16][var9][var12] & 0x8) == 0) {
                            if (var14 && arg3[var16][var9][var12] != null) {
                                if (arg3[var16][var9][var12].field3845 != null) {
                                    int var17 = class449.method2734((byte) 72, var10);
                                    if (arg3[var16][var9][var12].field3845.field1275 == var17 || arg3[var16][var9][var12].field3842 != null && arg3[var16][var9][var12].field3842.field1275 == var17) {
                                        continue;
                                    }
                                    if (var11 != 0) {
                                        int var18 = class449.method2734((byte) 79, var11);
                                        if (arg3[var16][var9][var12].field3845.field1275 == var18 || arg3[var16][var9][var12].field3842 != null && arg3[var16][var9][var12].field3842.field1275 == var18) {
                                            continue;
                                        }
                                    }
                                    if (var13 != 0) {
                                        int var19 = class449.method2734((byte) 68, var13);
                                        if (arg3[var16][var9][var12].field3845.field1275 == var19 || arg3[var16][var9][var12].field3842 != null && arg3[var16][var9][var12].field3842.field1275 == var19) {
                                            continue;
                                        }
                                    }
                                }
                                class262 var20 = arg3[var16][var9][var12];
                                if (var20.field3846 != null) {
                                    for (class638 var21 = var20.field3846; var21 != null; var21 = var21.field8564) {
                                        class395 var22 = var21.field8567;
                                        if (var22 instanceof class722) {
                                            class722 var23 = (class722) var22;
                                            int var24 = var23.method784(-4532);
                                            if (var24 == 21) {
                                                var24 = 19;
                                            }
                                            int var25 = var23.method794(arg4 ^ 0x2FCF7CA5);
                                            int var26 = var24 | var25 << 6;
                                            if (var10 == var26 || var11 != 0 && var11 == var26 || var13 != 0 && var13 == var26) {
                                                continue label244;
                                            }
                                        }
                                    }
                                }
                            }
                            class262 var27 = arg3[var16][var9][var12];
                            if (var27 != null && var27.field3846 != null) {
                                for (class638 var28 = var27.field3846; var28 != null; var28 = var28.field8564) {
                                    class395 var29 = var28.field8567;
                                    if (var29.field5683 != var29.field5680 || var29.field5679 != var29.field5673) {
                                        for (int var30 = var29.field5680; var30 <= var29.field5683; var30++) {
                                            for (int var31 = var29.field5673; var31 <= var29.field5679; var31++) {
                                                class343.field4884[var16][var30][var31] = var6;
                                            }
                                        }
                                    }
                                }
                            }
                            class343.field4884[var16][var9][var12] = var6;
                            var15 = true;
                        }
                    }
                }
                if (var15) {
                    int var32 = class433.field6043[class96.field1331 + 1].method2171(var12, var9, 31);
                    if (var32 > class724.field10047[arg1]) {
                        class724.field10047[arg1] = var32;
                    }
                    int var33 = var9 << 9;
                    int var34 = var12 << 9;
                    if (var33 < client.field6237[arg1]) {
                        client.field6237[arg1] = var33;
                    } else if (class147.field2055[arg1] < var33) {
                        class147.field2055[arg1] = var33;
                    }
                    if (var34 < class92.field1282[arg1]) {
                        class92.field1282[arg1] = var34;
                    } else if (var34 > class563.field7819[arg1]) {
                        class563.field7819[arg1] = var34;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class343.field4884[class96.field1331][var9 - 1][var12] != var6) {
                        class65.field1014[var35] = class678.method3817(class678.method3817(1179648, var9 - 1), -754974720);
                        class113.field1511[var35] = class678.method3817(1245184, var12);
                        var35 = var35 + 1 & 0xFFF;
                        class343.field4884[class96.field1331][var9 - 1][var12] = var6;
                    }
                    int var10000 = ~class667.field9202;
                    var12++;
                    if (var10000 < ~var12) {
                        if ((var9 - 1) >= 0 && class343.field4884[class96.field1331][var9 - 1][var12] != var6 && (class692.field9623[class96.field1331][var9][var12] & 0x4) == 0 && (class692.field9623[class96.field1331][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class65.field1014[var35] = class678.method3817(class678.method3817(1179648, var9 - 1), 1375731712);
                            class113.field1511[var35] = class678.method3817(1245184, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class343.field4884[class96.field1331][var9 - 1][var12] = var6;
                        }
                        if (class343.field4884[class96.field1331][var9][var12] != var6) {
                            class65.field1014[var35] = class678.method3817(class678.method3817(5373952, var9), 318767104);
                            class113.field1511[var35] = class678.method3817(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class343.field4884[class96.field1331][var9][var12] = var6;
                        }
                        if (class277.field4036 > var9 + 1 && class343.field4884[class96.field1331][var9 + 1][var12] != var6 && (class692.field9623[class96.field1331][var9][var12] & 0x4) == 0 && (class692.field9623[class96.field1331][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class65.field1014[var35] = class678.method3817(-1845493760, class678.method3817(var9 + 1, 5373952));
                            class113.field1511[var35] = class678.method3817(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class343.field4884[class96.field1331][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (class277.field4036 > var9 + 1 && class343.field4884[class96.field1331][var9 + 1][var12] != var6) {
                        class65.field1014[var35] = class678.method3817(class678.method3817(var9 + 1, 9568256), 1392508928);
                        class113.field1511[var35] = class678.method3817(var12, 9633792);
                        var35 = var35 + 1 & 0xFFF;
                        class343.field4884[class96.field1331][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class343.field4884[class96.field1331][var9 - 1][var12] != var6 && (class692.field9623[class96.field1331][var9][var12] & 0x4) == 0 && (class692.field9623[class96.field1331][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class65.field1014[var35] = class678.method3817(301989888, class678.method3817(13762560, var9 - 1));
                            class113.field1511[var35] = class678.method3817(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class343.field4884[class96.field1331][var9 - 1][var12] = var6;
                        }
                        if (class343.field4884[class96.field1331][var9][var12] != var6) {
                            class65.field1014[var35] = class678.method3817(-1828716544, class678.method3817(var9, 13762560));
                            class113.field1511[var35] = class678.method3817(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class343.field4884[class96.field1331][var9][var12] = var6;
                        }
                        if (var9 + 1 < class277.field4036 && class343.field4884[class96.field1331][var9 + 1][var12] != var6 && (class692.field9623[class96.field1331][var9][var12] & 0x4) == 0 && (class692.field9623[class96.field1331][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class65.field1014[var35] = class678.method3817(-771751936, class678.method3817(var9 + 1, 9568256));
                            class113.field1511[var35] = class678.method3817(var12, 9633792);
                            class343.field4884[class96.field1331][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class724.field10047[arg1] != -1000000) {
                class724.field10047[arg1] += 40;
                client.field6237[arg1] -= 512;
                class147.field2055[arg1] += 512;
                class563.field7819[arg1] += 512;
                class92.field1282[arg1] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)Z")
    public static final boolean method2300(int arg0) {
        field5166++;
        if (class258.field3740) {
            try {
                if ((Boolean) class69.method540("showingVideoAd", class320.field4445, -127)) {
                    return false;
                }
                return true;
            } catch (Throwable var2) {
            }
        }
        int var1 = 97 % ((-arg0 - 45) / 44);
        return true;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V")
    public static void method2301(byte arg0) {
        field5167 = null;
        if (arg0 <= 69) {
            method2301((byte) 109);
        }
        field5175 = null;
        field5169 = null;
        field5164 = null;
        field5170 = null;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method1178(int arg0) throws IOException;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V")
    public static final void method2302(int arg0) {
        field5168++;
        int var1 = 0;
        if (class332.field4707 != null) {
            var1 = class332.field4707.field4758.method2724(arg0 ^ 0x76DC);
        }
        if (var1 == 2) {
            int var2 = class374.field5260 <= 800 ? class374.field5260 : 800;
            class555.field7740 = (class374.field5260 - var2) / 2;
            int var3 = class648.field8690 <= 600 ? class648.field8690 : 600;
            class118.field1561 = var2;
            class320.field4452 = 0;
            class553.field7716 = var3;
        } else if (var1 == 1) {
            int var4 = class374.field5260 > 1024 ? 1024 : class374.field5260;
            class555.field7740 = (class374.field5260 - var4) / 2;
            class118.field1561 = var4;
            int var5 = class648.field8690 <= 768 ? class648.field8690 : 768;
            class320.field4452 = 0;
            class553.field7716 = var5;
        } else {
            class555.field7740 = 0;
            class320.field4452 = 0;
            class118.field1561 = class374.field5260;
            class553.field7716 = class648.field8690;
        }
        if (arg0 != 30428) {
            field5167 = null;
        }
    }
}
