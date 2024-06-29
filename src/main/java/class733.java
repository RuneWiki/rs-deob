import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class733 extends class499 {

    @OriginalMember(owner = "client!ww", name = "k", descriptor = "I")
    public static int field10148 = 0;

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "F")
    public static float field10145;

    @OriginalMember(owner = "client!ww", name = "i", descriptor = "I")
    public static int field10146;

    @OriginalMember(owner = "client!ww", name = "j", descriptor = "I")
    public static int field10147;

    @OriginalMember(owner = "client!ww", name = "n", descriptor = "I")
    public static int field10151;

    @OriginalMember(owner = "client!ww", name = "p", descriptor = "I")
    public static int field10153;

    @OriginalMember(owner = "client!ww", name = "q", descriptor = "I")
    public static int field10154;

    @OriginalMember(owner = "client!ww", name = "o", descriptor = "Lkf;")
    public class256 field10152;

    @OriginalMember(owner = "client!ww", name = "l", descriptor = "Z")
    public boolean field10149;

    @OriginalMember(owner = "client!ww", name = "m", descriptor = "[Lvh;")
    public class364[] field10150;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IILha;I)Z")
    public final boolean method4101(int arg0, int arg1, class59 arg2, int arg3) {
        field10153++;
        int var5 = this.field10152.method1451(-2);
        if (this.field10150 != null) {
            for (int var6 = 0; var6 < this.field10150.length; var6++) {
                this.field10150[var6].field5119 <<= var5;
                if (this.field10150[var6].method2159(arg1, arg3) && this.field10152.method790(arg2, arg3, arg1, (byte) 103)) {
                    this.field10150[var6].field5119 >>= var5;
                    return true;
                }
                this.field10150[var6].field5119 >>= var5;
            }
        }
        if (arg0 > 0) {
            method4102(-105, -59, false, -26, null, -4);
        }
        return false;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIZI[[[Lih;I)Z")
    public static final boolean method4102(int arg0, int arg1, boolean arg2, int arg3, class701[][][] arg4, int arg5) {
        field10146++;
        byte var6 = arg2 ? 1 : (byte) (class405.field5645 & 0xFF);
        if (class77.field943[class507.field6775][arg3][arg1] == var6) {
            return false;
        } else if ((class184.field2782[class507.field6775][arg3][arg1] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = arg5;
            class354.field4991[var7] = arg3;
            int var35 = var7 + 1;
            class264.field3682[var7] = arg1;
            class77.field943[class507.field6775][arg3][arg1] = var6;
            while (var35 != var8) {
                int var9 = class354.field4991[var8] & 0xFFFF;
                int var10 = class354.field4991[var8] >> 16 & 0xFF;
                int var11 = class354.field4991[var8] >> 24 & 0xFF;
                int var12 = class264.field3682[var8] & 0xFFFF;
                int var13 = class264.field3682[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class184.field2782[class507.field6775][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                if (arg4 != null) {
                    label240: for (int var16 = class507.field6775 + 1; var16 <= 3; var16++) {
                        if (arg4[var16] != null && (class184.field2782[var16][var9][var12] & 0x8) == 0) {
                            if (var14 && arg4[var16][var9][var12] != null) {
                                if (arg4[var16][var9][var12].field9729 != null) {
                                    int var17 = class610.method3327(arg5 ^ 0xFFFFFF98, var10);
                                    if (arg4[var16][var9][var12].field9729.field8623 == var17 || arg4[var16][var9][var12].field9739 != null && arg4[var16][var9][var12].field9739.field8623 == var17) {
                                        continue;
                                    }
                                    if (var11 != 0) {
                                        int var18 = class610.method3327(arg5 - 114, var11);
                                        if (arg4[var16][var9][var12].field9729.field8623 == var18 || arg4[var16][var9][var12].field9739 != null && arg4[var16][var9][var12].field9739.field8623 == var18) {
                                            continue;
                                        }
                                    }
                                    if (var13 != 0) {
                                        int var19 = class610.method3327(-105, var13);
                                        if (arg4[var16][var9][var12].field9729.field8623 == var19 || arg4[var16][var9][var12].field9739 != null && arg4[var16][var9][var12].field9739.field8623 == var19) {
                                            continue;
                                        }
                                    }
                                }
                                class701 var20 = arg4[var16][var9][var12];
                                if (var20.field9742 != null) {
                                    for (class10 var21 = var20.field9742; var21 != null; var21 = var21.field174) {
                                        class675 var22 = var21.field170;
                                        if (var22 instanceof class624) {
                                            class624 var23 = (class624) var22;
                                            int var24 = var23.method1757((byte) 47);
                                            if (var24 == 21) {
                                                var24 = 19;
                                            }
                                            int var25 = var23.method1752((byte) -111);
                                            int var26 = var25 << 6 | var24;
                                            if (var10 == var26 || var11 != 0 && var11 == var26 || var13 != 0 && var13 == var26) {
                                                continue label240;
                                            }
                                        }
                                    }
                                }
                            }
                            class701 var27 = arg4[var16][var9][var12];
                            if (var27 != null && var27.field9742 != null) {
                                for (class10 var28 = var27.field9742; var28 != null; var28 = var28.field174) {
                                    class675 var29 = var28.field170;
                                    if (var29.field9367 != var29.field9361 || var29.field9360 != var29.field9354) {
                                        for (int var30 = var29.field9367; var30 <= var29.field9361; var30++) {
                                            for (int var31 = var29.field9354; var31 <= var29.field9360; var31++) {
                                                class77.field943[var16][var30][var31] = var6;
                                            }
                                        }
                                    }
                                }
                            }
                            var15 = true;
                            class77.field943[var16][var9][var12] = var6;
                        }
                    }
                }
                if (var15) {
                    int var32 = class507.field6771[class507.field6775 + 1].method1742(var9, 116, var12);
                    if (class419.field5774[arg0] < var32) {
                        class419.field5774[arg0] = var32;
                    }
                    int var33 = var9 << 9;
                    if (class727.field10098[arg0] > var33) {
                        class727.field10098[arg0] = var33;
                    } else if (class756.field10508[arg0] < var33) {
                        class756.field10508[arg0] = var33;
                    }
                    int var34 = var12 << 9;
                    if (var34 < class227.field3232[arg0]) {
                        class227.field3232[arg0] = var34;
                    } else if (class564.field7411[arg0] < var34) {
                        class564.field7411[arg0] = var34;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class77.field943[class507.field6775][var9 - 1][var12] != var6) {
                        class354.field4991[var35] = class446.method2556(class446.method2556(var9 - 1, 1179648), -754974720);
                        class264.field3682[var35] = class446.method2556(1245184, var12);
                        class77.field943[class507.field6775][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12++;
                    if (class107.field1453 > var12) {
                        if ((var9 - 1) >= 0 && class77.field943[class507.field6775][var9 - 1][var12] != var6 && (class184.field2782[class507.field6775][var9][var12] & 0x4) == 0 && (class184.field2782[class507.field6775][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class354.field4991[var35] = class446.method2556(class446.method2556(1179648, var9 - 1), 1375731712);
                            class264.field3682[var35] = class446.method2556(var12, 1245184);
                            var35 = var35 + 1 & 0xFFF;
                            class77.field943[class507.field6775][var9 - 1][var12] = var6;
                        }
                        if (class77.field943[class507.field6775][var9][var12] != var6) {
                            class354.field4991[var35] = class446.method2556(class446.method2556(var9, 5373952), 318767104);
                            class264.field3682[var35] = class446.method2556(5439488, var12);
                            class77.field943[class507.field6775][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class719.field10004 > (var9 + 1) && class77.field943[class507.field6775][var9 + 1][var12] != var6 && (class184.field2782[class507.field6775][var9][var12] & 0x4) == 0 && (class184.field2782[class507.field6775][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class354.field4991[var35] = class446.method2556(class446.method2556(var9 + 1, 5373952), -1845493760);
                            class264.field3682[var35] = class446.method2556(var12, 5439488);
                            var35 = var35 + 1 & 0xFFF;
                            class77.field943[class507.field6775][var9 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (class719.field10004 > var9 + 1 && class77.field943[class507.field6775][var9 + 1][var12] != var6) {
                        class354.field4991[var35] = class446.method2556(1392508928, class446.method2556(9568256, var9 + 1));
                        class264.field3682[var35] = class446.method2556(9633792, var12);
                        class77.field943[class507.field6775][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class77.field943[class507.field6775][var9 - 1][var12] != var6 && (class184.field2782[class507.field6775][var9][var12] & 0x4) == 0 && (class184.field2782[class507.field6775][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class354.field4991[var35] = class446.method2556(class446.method2556(13762560, var9 - 1), 301989888);
                            class264.field3682[var35] = class446.method2556(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class77.field943[class507.field6775][var9 - 1][var12] = var6;
                        }
                        if (class77.field943[class507.field6775][var9][var12] != var6) {
                            class354.field4991[var35] = class446.method2556(-1828716544, class446.method2556(var9, 13762560));
                            class264.field3682[var35] = class446.method2556(13828096, var12);
                            class77.field943[class507.field6775][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class719.field10004 > var9 + 1 && class77.field943[class507.field6775][var9 + 1][var12] != var6 && (class184.field2782[class507.field6775][var9][var12] & 0x4) == 0 && (class184.field2782[class507.field6775][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class354.field4991[var35] = class446.method2556(-771751936, class446.method2556(var9 + 1, 9568256));
                            class264.field3682[var35] = class446.method2556(9633792, var12);
                            class77.field943[class507.field6775][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class419.field5774[arg0] != -1000000) {
                class419.field5774[arg0] += 40;
                class727.field10098[arg0] -= 512;
                class756.field10508[arg0] += 512;
                class564.field7411[arg0] += 512;
                class227.field3232[arg0] -= 512;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lrda;[III[II)Lew;")
    public static final class495 method4103(class663 arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5) {
        field10147++;
        byte[] var6 = new byte[arg2 * arg3];
        int var7 = 0;
        if (arg5 != 1179648) {
            field10145 = 0.6478928F;
        }
        while (arg3 > var7) {
            int var8 = arg2 * var7 + arg4[var7];
            for (int var9 = 0; var9 < arg1[var7]; var9++) {
                var6[var8++] = -1;
            }
            var7++;
        }
        return new class495(arg0, arg2, arg3, var6);
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(II)I")
    public static final int method4104(int arg0, int arg1) {
        return class363.field5106 == null ? 0 : class363.field5106[arg0][arg1] & 0xFFFFFF;
    }
}
