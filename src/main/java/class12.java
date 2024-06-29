import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class12 {

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Lmb;")
    public static class132 field158 = class166.method1092("Benutzen Sie die (WPasswort -=ndern(W Option", 113);

    @OriginalMember(owner = "client!b", name = "h", descriptor = "Lmb;")
    public static class132 field164 = class166.method1092(" <col=ffff00>", 112);

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Lji;")
    public static class107 field161;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Lua;")
    public static class215 field157;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "[[[B")
    public static byte[][][] field163;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static void method58(byte arg0) {
        field163 = null;
        field164 = null;
        field161 = null;
        field157 = null;
        field158 = null;
        if (arg0 != -66) {
            method60(51, -78, -74, 12, -124, -110, 13);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BII)V")
    public static final void method59(byte arg0, int arg1, int arg2) {
        if (class131.field2427 != arg1) {
            class156.field2849 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class156.field2849[var3] = (var3 << 12) / arg1;
            }
            class90.field1593 = arg1 - 1;
            class131.field2427 = arg1;
            class231.field4170 = arg1 == 64 ? 2048 : 4096;
        }
        if (class42.field689 != arg2) {
            if (class131.field2427 == arg2) {
                class2.field35 = class156.field2849;
            } else {
                class2.field35 = new int[arg2];
                for (int var4 = 0; var4 < arg2; var4++) {
                    class2.field35[var4] = (var4 << 12) / arg2;
                }
            }
            class42.field689 = arg2;
            class185.field3423 = arg2 - 1;
        }
        field162++;
        if (arg0 <= 10) {
            method59((byte) 27, 30, -88);
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIIIIII)V")
    public static final void method60(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class106.field1984 == 0 && !class10.field116) {
            class57.field960++;
            int var7 = class145.field2707;
            int var8 = class38.field625;
            int var9 = class16.field236;
            int var10 = (arg5 - arg2) * (var8 - var9) / arg3 + var9;
            int var11 = class158.field2870;
            int var12 = (arg6 - arg4) * (var11 - var7) / arg1 + var7;
            class108.method693(class75.field1247, class111.field2109, arg0 - 16809, 0L, (short) 49, var12, var10);
        }
        long var13 = -1L;
        if (arg0 != 16308) {
            field158 = null;
        }
        for (int var15 = 0; var15 < class138.field2591; var15++) {
            long var16 = class238.field4306[var15];
            int var18 = (int) var16 & 0x7F;
            int var19 = (int) var16 >> 7 & 0x7F;
            int var20 = (int) var16 >> 29 & 0x3;
            int var21 = Integer.MAX_VALUE & (int) (var16 >>> 32);
            if (var13 != var16) {
                var13 = var16;
                if (var20 == 2 && class168.method1099(class139.field2615, var18, var19, var16)) {
                    class84 var22 = class66.method414(0, var21);
                    if (var22.field1413 != null) {
                        var22 = var22.method515(-45);
                    }
                    if (var22 == null) {
                        continue;
                    }
                    if (class106.field1984 == 1) {
                        class27.field436++;
                        class108.method693(class187.method1197(new class132[] { class170.field3177, class122.field2290, var22.field1435 }, -110), class187.field3465, -501, var16, (short) 2, var19, var18);
                    } else if (!class10.field116) {
                        class132[] var23 = var22.field1419;
                        if (class202.field3716) {
                            var23 = class19.method126(arg0 - 16431, var23);
                        }
                        if (var23 != null) {
                            for (int var24 = 4; var24 >= 0; var24--) {
                                if (var23[var24] != null) {
                                    client.field535++;
                                    short var25 = 0;
                                    if (var24 == 0) {
                                        var25 = 44;
                                    }
                                    if (var24 == 1) {
                                        var25 = 32;
                                    }
                                    if (var24 == 2) {
                                        var25 = 15;
                                    }
                                    if (var24 == 3) {
                                        var25 = 47;
                                    }
                                    if (var24 == 4) {
                                        var25 = 1004;
                                    }
                                    class108.method693(class187.method1197(new class132[] { class216.field3942, var22.field1435 }, arg0 - 16387), var23[var24], -501, var16, var25, var19, var18);
                                }
                            }
                        }
                        class15.field229++;
                        class108.method693(class187.method1197(new class132[] { class216.field3942, var22.field1435 }, -117), class84.field1472, arg0 - 16809, (long) var22.field1425, (short) 1006, var19, var18);
                    } else if ((class38.field621 & 0x4) == 4) {
                        class108.method693(class187.method1197(new class132[] { class160.field2914, class122.field2290, var22.field1435 }, -101), class138.field2589, -501, var16, (short) 33, var19, var18);
                        class95.field1668++;
                    }
                }
                if (var20 == 1) {
                    class65 var26 = class11.field145[var21];
                    if (var26.field1072.field3422 == 1 && (var26.field673 & 0x7F) == 64 && (var26.field723 & 0x7F) == 64) {
                        for (int var27 = 0; var27 < class131.field2423; var27++) {
                            class65 var30 = class11.field145[class226.field4098[var27]];
                            if (var30 != null && var26 != var30 && var30.field1072.field3422 == 1 && var26.field673 == var30.field673 && var26.field723 == var30.field723) {
                                class33.method232(-91, var19, var18, class226.field4098[var27], var30.field1072);
                            }
                        }
                        for (int var28 = 0; var28 < class160.field2906; var28++) {
                            class159 var29 = class68.field1120[class33.field527[var28]];
                            if (var29 != null && var26.field673 == var29.field673 && var26.field723 == var29.field723) {
                                class110.method699(var19, var29, var18, class33.field527[var28], false);
                            }
                        }
                    }
                    class33.method232(-100, var19, var18, var21, var26.field1072);
                }
                if (var20 == 0) {
                    class159 var31 = class68.field1120[var21];
                    if ((var31.field673 & 0x7F) == 64 && (var31.field723 & 0x7F) == 64) {
                        for (int var32 = 0; var32 < class131.field2423; var32++) {
                            class65 var35 = class11.field145[class226.field4098[var32]];
                            if (var35 != null && var35.field1072.field3422 == 1 && var31.field673 == var35.field673 && var31.field723 == var35.field723) {
                                class33.method232(-52, var19, var18, class226.field4098[var32], var35.field1072);
                            }
                        }
                        for (int var33 = 0; var33 < class160.field2906; var33++) {
                            class159 var34 = class68.field1120[class33.field527[var33]];
                            if (var34 != null && var31 != var34 && var31.field673 == var34.field673 && var31.field723 == var34.field723) {
                                class110.method699(var19, var34, var18, class33.field527[var33], false);
                            }
                        }
                    }
                    class110.method699(var19, var31, var18, var21, false);
                }
                if (var20 == 3) {
                    class19 var36 = class15.field216[class139.field2615][var18][var19];
                    if (var36 != null) {
                        for (class39 var37 = (class39) var36.method124(0); var37 != null; var37 = (class39) var36.method129((byte) -126)) {
                            int var38 = var37.field634.field3620;
                            class243 var39 = class58.method389(0, var38);
                            if (class106.field1984 == 1) {
                                class108.method693(class187.method1197(new class132[] { class170.field3177, class69.field1146, var39.field4399 }, arg0 ^ 0xFFFFC017), class187.field3465, -501, (long) var38, (short) 38, var19, var18);
                                class169.field3095++;
                            } else if (!class10.field116) {
                                class110.field2080++;
                                class132[] var40 = var39.field4394;
                                if (class202.field3716) {
                                    var40 = class19.method126(arg0 - 16419, var40);
                                }
                                for (int var41 = 4; var41 >= 0; var41--) {
                                    if (var40 != null && var40[var41] != null) {
                                        class2.field22++;
                                        byte var42 = 0;
                                        if (var41 == 0) {
                                            var42 = 8;
                                        }
                                        if (var41 == 1) {
                                            var42 = 43;
                                        }
                                        if (var41 == 2) {
                                            var42 = 51;
                                        }
                                        if (var41 == 3) {
                                            var42 = 50;
                                        }
                                        if (var41 == 4) {
                                            var42 = 29;
                                        }
                                        class108.method693(class187.method1197(new class132[] { class236.field4259, var39.field4399 }, -94), var40[var41], -501, (long) var38, var42, var19, var18);
                                    } else if (var41 == 2) {
                                        class2.field30++;
                                        class108.method693(class187.method1197(new class132[] { class236.field4259, var39.field4399 }, -78), class68.field1126, -501, (long) var38, (short) 51, var19, var18);
                                    }
                                }
                                class108.method693(class187.method1197(new class132[] { class236.field4259, var39.field4399 }, -103), class84.field1472, -501, (long) var38, (short) 1005, var19, var18);
                            } else if ((class38.field621 & 0x1) == 1) {
                                class97.field1863++;
                                class108.method693(class187.method1197(new class132[] { class160.field2914, class69.field1146, var39.field4399 }, -103), class138.field2589, -501, (long) var38, (short) 37, var19, var18);
                            }
                        }
                    }
                }
            }
        }
        field160++;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IJZI)Lmb;")
    public static final class132 method61(int arg0, long arg1, boolean arg2, int arg3) {
        field159++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var5 = 1;
        long var6 = arg1 / (long) arg0;
        while (var6 != 0L) {
            var6 /= arg0;
            var5++;
        }
        if (arg3 > -114) {
            return null;
        }
        int var8 = var5;
        if (arg1 < 0L || arg2) {
            var8 = var5 + 1;
        }
        byte[] var9 = new byte[var8];
        if (arg1 < 0L) {
            var9[0] = 45;
        } else if (arg2) {
            var9[0] = 43;
        }
        for (int var10 = 0; var10 < var5; var10++) {
            int var12 = (int) (arg1 % (long) arg0);
            arg1 /= arg0;
            if (var12 < 0) {
                var12 = -var12;
            }
            if (var12 > 9) {
                var12 += 39;
            }
            var9[var8 - var10 - 1] = (byte) (var12 + 48);
        }
        class132 var11 = new class132();
        var11.field2479 = var8;
        var11.field2446 = var9;
        return var11;
    }
}
