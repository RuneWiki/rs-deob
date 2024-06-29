import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public abstract class class196 extends class107 {

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "[Lsh;")
    public class196[] field3281;

    @OriginalMember(owner = "client!sh", name = "M", descriptor = "Z")
    public boolean field3291;

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "I")
    public static int field3287 = 2;

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "I")
    public static volatile int field3288 = 0;

    @OriginalMember(owner = "client!sh", name = "N", descriptor = "Ldf;")
    public static class51 field3292 = class46.method233("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 100);

    @OriginalMember(owner = "client!sh", name = "L", descriptor = "I")
    public static int field3290 = 0;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
    public int field3277;

    @OriginalMember(owner = "client!sh", name = "z", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!sh", name = "K", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!sh", name = "O", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!sh", name = "P", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "Lkk;")
    public class215 field3274;

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "Lqf;")
    public class225 field3285;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V")
    public void method1177(int arg0) {
        if (this.field3291) {
            this.field3274.method1479(0);
            this.field3274 = null;
        } else {
            this.field3285.method1547(false);
            this.field3285 = null;
        }
        if (arg0 <= -126) {
            field3286++;
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(B)V")
    public void method73(byte arg0) {
        field3289++;
        int var2 = 43 / ((43 - arg0) / 41);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(BI)[[I")
    public int[][] method46(byte arg0, int arg1) {
        field3282++;
        if (arg0 != 11) {
            this.field3277 = 51;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(II)[I")
    public int[] method45(int arg0, int arg1) {
        field3278++;
        if (arg1 == 10565) {
            throw new IllegalStateException("This operation does not have a monochrome output");
        }
        return null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZILwc;I)V")
    public static final void method1385(int arg0, boolean arg1, int arg2, class213 arg3, int arg4) {
        field3284++;
        class190.method1361(205);
        class59.method390(arg4, arg2, arg3.field3603 + arg4, arg3.field3608 + arg2);
        if (class170.field2780 == 2 || class170.field2780 == 5 || class182.field3004 == null) {
            class59.method379(arg4, arg2, 0, arg3.field3661, arg3.field3637);
        } else {
            int var5 = class44.field706.field4319 / 32 + 48;
            int var6 = class120.field1993 + class119.field1991 & 0x7FF;
            int var7 = 464 - (class44.field706.field4348 / 32);
            ((class254) class182.field3004).method1097(arg4, arg2, arg3.field3603, arg3.field3608, var5, var7, var6, class109.field1849 + 256, arg3.field3661, arg3.field3637);
            if (class175.field2864 != null) {
                for (int var8 = 0; var8 < class175.field2864.field2337; var8++) {
                    if (class175.field2864.method1010(var8, -6)) {
                        int var9 = (class175.field2864.field2341[var8] - class11.field160) * 4 + 2 - (class44.field706.field4319 / 32);
                        int var10 = class73.field1155[var6];
                        int var11 = class73.field1167[var6];
                        int var12 = (class175.field2864.field2338[var8] - class241.field4179) * 4 + 2 - (class44.field706.field4348 / 32);
                        int var13 = var10 * 256 / (class109.field1849 + 256);
                        int var14 = var11 * 256 / (class109.field1849 + 256);
                        int var15 = var12 * var13 + (var9 * var14) >> 16;
                        int var16 = var12 * var14 - (var9 * var13) >> 16;
                        class187 var17 = class4.field34;
                        if (class175.field2864.method1012(var8, (byte) -73) == 1) {
                            var17 = class177.field2891;
                        }
                        if (class175.field2864.method1012(var8, (byte) -73) == 2) {
                            var17 = class239.field4161;
                        }
                        int var18 = var17.method1319(class175.field2864.field2342[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (-arg3.field3603 <= var19 && var19 <= arg3.field3603 && var16 >= (-arg3.field3608) && var16 <= arg3.field3608) {
                            int var20 = 16777215;
                            if (class175.field2864.field2328[var8] != -1) {
                                var20 = class175.field2864.field2328[var8];
                            }
                            class59.method380(arg3.field3661, arg3.field3637);
                            var17.method1336(class175.field2864.field2342[var8], var19 + (arg3.field3603 / 2) + arg4, arg2 - -(arg3.field3608 / 2) + -var16, var18, 50, var20, 0, 256, 1, 0, 0);
                            class59.method370();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class74.field1183; var21++) {
                int var54 = class78.field1245[var21] * 4 + 2 - (class44.field706.field4348 / 32);
                int var55 = class93.field1538[var21] * 4 + 2 - class44.field706.field4319 / 32;
                class108 var56 = class41.method210(class49.field773[var21], (byte) 75);
                if (var56.field1796 != null) {
                    var56 = var56.method784((byte) 117);
                    if (var56 == null || var56.field1826 == -1) {
                        continue;
                    }
                }
                class21.method109(class181.field2986[var56.field1826], var54, arg3, (byte) -15, arg2, arg4, var55);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var50 = 0; var50 < 104; var50++) {
                    class252 var51 = class90.field1493[class257.field4496][var22][var50];
                    if (var51 != null) {
                        int var52 = var22 * 4 + 2 - (class44.field706.field4319 / 32);
                        int var53 = var50 * 4 + 2 - (class44.field706.field4348 / 32);
                        class21.method109(class255.field4449[0], var53, arg3, (byte) -42, arg2, arg4, var52);
                    }
                }
            }
            for (int var23 = 0; var23 < class218.field3788; var23++) {
                class83 var46 = class34.field512[class193.field3242[var23]];
                if (var46 != null && var46.method646((byte) -72)) {
                    class11 var47 = var46.field1392;
                    if (var47 != null && var47.field120 != null) {
                        var47 = var47.method60((byte) 90);
                    }
                    if (var47 != null && var47.field121 && var47.field150) {
                        int var48 = var46.field4348 / 32 - (class44.field706.field4348 / 32);
                        int var49 = var46.field4319 / 32 - (class44.field706.field4319 / 32);
                        class21.method109(class255.field4449[1], var48, arg3, (byte) -66, arg2, arg4, var49);
                    }
                }
            }
            for (int var24 = 0; var24 < class86.field1444; var24++) {
                class103 var38 = class66.field1055[class75.field1195[var24]];
                if (var38 != null && var38.method646((byte) -103)) {
                    int var39 = var38.field4319 / 32 - class44.field706.field4319 / 32;
                    int var40 = var38.field4348 / 32 - (class44.field706.field4348 / 32);
                    boolean var41 = false;
                    long var42 = var38.field1711.method316(52);
                    for (int var44 = 0; var44 < class184.field3051; var44++) {
                        if (class122.field2079[var44] == var42 && class96.field1588[var44] != 0) {
                            var41 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class44.field706.field1717 != 0 && var38.field1717 != 0 && class44.field706.field1717 == var38.field1717) {
                        var45 = true;
                    }
                    if (var41) {
                        class21.method109(class255.field4449[3], var40, arg3, (byte) -62, arg2, arg4, var39);
                    } else if (var45) {
                        class21.method109(class255.field4449[4], var40, arg3, (byte) -112, arg2, arg4, var39);
                    } else {
                        class21.method109(class255.field4449[2], var40, arg3, (byte) -56, arg2, arg4, var39);
                    }
                }
            }
            class157[] var25 = class135.field2250;
            for (int var26 = 0; var26 < var25.length; var26++) {
                class157 var29 = var25[var26];
                if (var29 != null && var29.field2592 != 0 && (class179.field2960 % 20) < 10) {
                    if (var29.field2592 == 1 && var29.field2596 >= 0 && var29.field2596 < class34.field512.length) {
                        class83 var30 = class34.field512[var29.field2596];
                        if (var30 != null) {
                            int var31 = var30.field4319 / 32 - class44.field706.field4319 / 32;
                            int var32 = var30.field4348 / 32 - (class44.field706.field4348 / 32);
                            class95.method707(var29.field2597, var31, arg3, arg4, arg2, 15, var32);
                        }
                    }
                    if (var29.field2592 == 2) {
                        int var33 = (var29.field2586 - class11.field160) * 4 + 2 - class44.field706.field4319 / 32;
                        int var34 = (var29.field2590 - class241.field4179) * 4 - ((class44.field706.field4348 / 32) - 2);
                        class95.method707(var29.field2597, var33, arg3, arg4, arg2, 15, var34);
                    }
                    if (var29.field2592 == 10 && var29.field2596 >= 0 && class66.field1055.length > var29.field2596) {
                        class103 var35 = class66.field1055[var29.field2596];
                        if (var35 != null) {
                            int var36 = var35.field4319 / 32 - (class44.field706.field4319 / 32);
                            int var37 = var35.field4348 / 32 - (class44.field706.field4348 / 32);
                            class95.method707(var29.field2597, var36, arg3, arg4, arg2, 15, var37);
                        }
                    }
                }
            }
            if (class96.field1581 != 0) {
                int var27 = class96.field1581 * 4 + 2 - (class44.field706.field4319 / 32);
                int var28 = class248.field4373 * 4 + 2 - (class44.field706.field4348 / 32);
                class21.method109(class23.field356, var28, arg3, (byte) -52, arg2, arg4, var27);
            }
            class59.method393(arg3.field3603 / 2 + arg4 - 1, arg3.field3608 / 2 + arg2 + -1, 3, 3, 16777215);
        }
        if (!arg1) {
            class42.field681[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILlb;B)V")
    public void method44(int arg0, class121 arg1, byte arg2) {
        if (arg2 != 82) {
            field3287 = 110;
        }
        field3276++;
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(I)V")
    public static void method1386(int arg0) {
        if (arg0 > -106) {
            field3290 = -17;
        }
        field3292 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)[[I")
    public final int[][] method1387(int arg0, int arg1, int arg2) {
        field3279++;
        if (arg0 <= 17) {
            method1385(46, true, -65, (class213) null, -124);
        }
        if (this.field3281[arg1].field3291) {
            int[] var4 = this.field3281[arg1].method45(arg2, 10565);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field3281[arg1].method46((byte) 11, arg2);
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(BI)V")
    public static final void method1388(byte arg0, int arg1) {
        if (arg1 == -1 && !class236.field4117) {
            class135.method984(2);
        } else if (arg1 != -1 && (class153.field2556 != arg1 || !class264.method1793(2)) && class26.field381 != 0 && !class236.field4117) {
            class60.method402(class149.field2493, 2, (byte) 70, false, 0, class26.field381, arg1);
        }
        class153.field2556 = arg1;
        if (arg0 < 75) {
            field3292 = null;
        }
        field3294++;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(III)V")
    public final void method1389(int arg0, int arg1, int arg2) {
        field3280++;
        if (arg2 > -38) {
            return;
        }
        int var4 = this.field3277 == 255 ? arg0 : this.field3277;
        if (this.field3291) {
            this.field3274 = new class215(var4, arg0, arg1);
        } else {
            this.field3285 = new class225(var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "(I)I")
    public int method1176(int arg0) {
        field3283++;
        if (arg0 != 2) {
            this.field3274 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "(B)I")
    public int method1372(byte arg0) {
        if (arg0 >= -92) {
            return -21;
        } else {
            field3293++;
            return -1;
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(III)[I")
    public final int[] method1390(int arg0, int arg1, int arg2) {
        field3275++;
        if (arg2 >= -78) {
            return null;
        } else if (this.field3281[arg1].field3291) {
            return this.field3281[arg1].method45(arg0, 10565);
        } else {
            return this.field3281[arg1].method46((byte) 11, arg0)[0];
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(IZ)V")
    public class196(int arg0, boolean arg1) {
        this.field3281 = new class196[arg0];
        this.field3291 = arg1;
    }
}
