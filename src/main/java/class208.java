import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class208 extends class122 {

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "I")
    public int field3321 = 0;

    @OriginalMember(owner = "client!gi", name = "X", descriptor = "I")
    public int field3326 = 12800;

    @OriginalMember(owner = "client!gi", name = "Z", descriptor = "I")
    public int field3328 = 12800;

    @OriginalMember(owner = "client!gi", name = "bb", descriptor = "I")
    public int field3330 = 0;

    @OriginalMember(owner = "client!gi", name = "db", descriptor = "Z")
    public boolean field3332 = true;

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "I")
    public int field3322 = -1;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "Lqd;")
    public class40 field3318;

    @OriginalMember(owner = "client!gi", name = "R", descriptor = "I")
    public int field3320;

    @OriginalMember(owner = "client!gi", name = "ab", descriptor = "I")
    public int field3329;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "Lqd;")
    public class40 field3319;

    @OriginalMember(owner = "client!gi", name = "hb", descriptor = "Lhi;")
    public class282 field3336;

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
    public static int field3324 = 0;

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "Lqd;")
    public static class40 field3323 = class147.method1106("k", (byte) -57);

    @OriginalMember(owner = "client!gi", name = "eb", descriptor = "Z")
    public static boolean field3333 = false;

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!gi", name = "W", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!gi", name = "Y", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!gi", name = "cb", descriptor = "I")
    public static int field3331;

    @OriginalMember(owner = "client!gi", name = "fb", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!gi", name = "gb", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!gi", name = "ib", descriptor = "I")
    public static int field3337;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method1468(boolean arg0) {
        field3317++;
        class39.field705.method1347(0);
        if (arg0) {
            field3333 = true;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(Z)V", line = 22)
    public final void method1469(boolean arg0) {
        this.field3326 = 12800;
        this.field3321 = 0;
        this.field3328 = 12800;
        this.field3330 = 0;
        if (!arg0) {
            this.method1469(false);
        }
        field3327++;
        for (class242 var2 = (class242) this.field3336.method1971(100); var2 != null; var2 = (class242) this.field3336.method1967(100)) {
            if (var2.field4001 < this.field3328) {
                this.field3328 = var2.field4001;
            }
            if (var2.field3991 < this.field3326) {
                this.field3326 = var2.field3991;
            }
            if (this.field3330 < var2.field4000) {
                this.field3330 = var2.field4000;
            }
            if (var2.field3995 > this.field3321) {
                this.field3321 = var2.field3995;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIIIILbg;IJZ)Z", line = 56)
    public static final boolean method1470(int arg0, int arg1, int arg2, int arg3, int arg4, class196 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class303.method2066(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lqd;Lqd;IIIZ)V", line = 479)
    public class208(class40 arg0, class40 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field3318 = arg1;
        this.field3320 = arg3;
        this.field3329 = arg2;
        this.field3319 = arg0;
        this.field3332 = arg5;
        this.field3322 = arg4;
        this.field3336 = new class282();
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)V", line = 98)
    public static void method1471(int arg0) {
        field3323 = null;
        if (arg0 != -6) {
            field3331 = -124;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILrb;Z)I", line = 109)
    public static final int method1472(int arg0, class213 arg1, boolean arg2) {
        field3325++;
        if (arg1.field3505 == null || arg0 >= arg1.field3505.length) {
            return -2;
        }
        try {
            if (!arg2) {
                field3323 = (class40) null;
            }
            int[] var3 = arg1.field3505[arg0];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 1) {
                    var9 = class280.field4733[var3[var5++]];
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 2) {
                    var9 = class308.field5170[var3[var5++]];
                }
                if (var7 == 3) {
                    var9 = class150.field2519[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class213 var12 = class314.method2172((byte) 104, var11);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class165.method1243(-88, var13).field4627 || class308.field5164)) {
                        for (int var14 = 0; var14 < var12.field3532.length; var14++) {
                            if (var13 + 1 == var12.field3532[var14]) {
                                var9 += var12.field3471[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var9 = class192.field3098[var3[var5++]];
                }
                if (var7 == 6) {
                    var9 = class90.field1624[class308.field5170[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class192.field3098[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class255.field4233.field4320;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class43.field822[var15]) {
                            var9 += class308.field5170[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class213 var18 = class314.method2172((byte) 34, var17);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class165.method1243(-31, var19).field4627 || class308.field5164)) {
                        for (int var20 = 0; var20 < var18.field3532.length; var20++) {
                            if (var19 + 1 == var18.field3532[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class205.field3274;
                }
                if (var7 == 12) {
                    var9 = class254.field4206;
                }
                if (var7 == 13) {
                    int var21 = class192.field3098[var3[var5++]];
                    int var22 = var3[var5++];
                    var9 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var9 = class153.method1193(var23, -122);
                }
                if (var7 == 18) {
                    var9 = (class255.field4233.field1531 >> 7) + class196.field3152;
                }
                if (var7 == 19) {
                    var9 = (class255.field4233.field1497 >> 7) + class263.field4407;
                }
                if (var7 == 20) {
                    var9 = var3[var5++];
                }
                if (var8 == 0) {
                    if (var6 == 0) {
                        var4 += var9;
                    }
                    if (var6 == 1) {
                        var4 -= var9;
                    }
                    if (var6 == 2 && var9 != 0) {
                        var4 /= var9;
                    }
                    if (var6 == 3) {
                        var4 *= var9;
                    }
                    var6 = 0;
                } else {
                    var6 = var8;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIBZ)Lqd;", line = 315)
    public static final class40 method1473(int arg0, int arg1, byte arg2, boolean arg3) {
        field3337++;
        if (arg2 < 93) {
            method1471(-53);
        }
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var4 = 1;
        int var5 = arg1 / arg0;
        while (var5 != 0) {
            var5 /= arg0;
            var4++;
        }
        int var6 = var4;
        if (arg1 < 0 || arg3) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg1 % arg0;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            arg1 /= arg0;
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class40 var10 = new class40();
        var10.field766 = var6;
        var10.field745 = var7;
        return var10;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIB)Z", line = 387)
    public final boolean method1474(int arg0, int arg1, byte arg2) {
        field3335++;
        if (arg0 < this.field3328 || arg0 > this.field3321 || this.field3326 > arg1 || arg1 > this.field3330) {
            return false;
        }
        if (arg2 < 118) {
            this.field3326 = -74;
        }
        for (class242 var4 = (class242) this.field3336.method1971(100); var4 != null; var4 = (class242) this.field3336.method1967(100)) {
            if (var4.method1704(arg1, (byte) 75, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZLqd;)Z", line = 428)
    public static final boolean method1475(boolean arg0, class40 arg1) {
        field3334++;
        if (arg1 == null) {
            return false;
        }
        if (!arg0) {
            method1468(false);
        }
        for (int var2 = 0; var2 < class233.field3844; var2++) {
            if (arg1.method327(class15.field242[var2], -21581)) {
                return true;
            }
        }
        if (arg1.method327(class255.field4233.field4319, -21581)) {
            return true;
        } else {
            return false;
        }
    }
}
