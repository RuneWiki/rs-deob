import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class10 {

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
    public int field132 = 0;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
    public static int field134 = 0;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "I")
    public static int field130;

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "[I")
    public static int[] field129;

    static {
        new class409("You are not allowed to join this user's clan channel.", "Du darfst den Chatraum dieses Benutzers nicht betreten.", "Vous n'êtes pas autorisé à rejoindre le canal de clan de cet utilisateur.", "Você não tem permissão para entrar no canal de clã desse usuário.");
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lat;B)V", line = 3)
    public final void method171(class256 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1738((byte) 66);
            if (var3 == 0) {
                field133++;
                if (arg1 != -110) {
                    field134 = -61;
                    return;
                }
                return;
            }
            this.method173(var3, 13364, arg0);
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIIIZ[[[Log;)Z", line = 25)
    public static final boolean method172(int arg0, int arg1, int arg2, int arg3, boolean arg4, class369[][][] arg5) {
        field130++;
        byte var6 = arg4 ? 1 : (byte) (class253.field3713 & 0xFF);
        if (class444.field6472[class423.field6117][arg1][arg2] == var6) {
            return false;
        } else if ((class131.field1790[class423.field6117][arg1][arg2] & 0x4) == 0) {
            return false;
        } else if (arg0 == 1) {
            byte var7 = 0;
            class126.field1673[var7] = arg1;
            int var8 = 0;
            int var35 = var7 + 1;
            class70.field920[var7] = arg2;
            class444.field6472[class423.field6117][arg1][arg2] = var6;
            while (var35 != var8) {
                int var9 = class126.field1673[var8] & 0xFFFF;
                int var10 = class126.field1673[var8] >> 16 & 0xFF;
                int var11 = class126.field1673[var8] >> 24 & 0xFF;
                int var12 = class70.field920[var8] & 0xFFFF;
                int var13 = class70.field920[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class131.field1790[class423.field6117][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class423.field6117 + 1; var16 <= 3; var16++) {
                    if ((class131.field1790[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg5[var16][var9][var12] != null) {
                            if (arg5[var16][var9][var12].field5335 != null) {
                                int var20 = class343.method2229(arg0 ^ 0xFFFFFF8A, var10);
                                if (arg5[var16][var9][var12].field5335.field6104 == var20 || arg5[var16][var9][var12].field5332 != null && arg5[var16][var9][var12].field5332.field6104 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class343.method2229(-123, var11);
                                    if (arg5[var16][var9][var12].field5335.field6104 == var21 || arg5[var16][var9][var12].field5332 != null && arg5[var16][var9][var12].field5332.field6104 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class343.method2229(-128, var13);
                                    if (arg5[var16][var9][var12].field5335.field6104 == var22 || arg5[var16][var9][var12].field5332 != null && arg5[var16][var9][var12].field5332.field6104 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class369 var23 = arg5[var16][var9][var12];
                            if (var23.field5345 != null) {
                                for (class206 var24 = var23.field5345; var24 != null; var24 = var24.field2882) {
                                    class336 var25 = var24.field2880;
                                    if (var25 instanceof class438) {
                                        class438 var26 = (class438) var25;
                                        int var27 = var26.method6(-20839);
                                        int var28 = var26.method1(-109);
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
                        class369 var30 = arg5[var16][var9][var12];
                        if (var30 != null && var30.field5345 != null) {
                            for (class206 var31 = var30.field5345; var31 != null; var31 = var31.field2882) {
                                class336 var32 = var31.field2880;
                                if (var32.field4961 != var32.field4957 || var32.field4959 != var32.field4950) {
                                    for (int var33 = var32.field4961; var33 <= var32.field4957; var33++) {
                                        for (int var34 = var32.field4959; var34 <= var32.field4950; var34++) {
                                            class444.field6472[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class444.field6472[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class215.field3069[class423.field6117 + 1].method1429(var9, var12);
                    if (class421.field6095[arg3] < var17) {
                        class421.field6095[arg3] = var17;
                    }
                    int var18 = var9 << 7;
                    if (var18 < class433.field6313[arg3]) {
                        class433.field6313[arg3] = var18;
                    } else if (class345.field5078[arg3] < var18) {
                        class345.field5078[arg3] = var18;
                    }
                    int var19 = var12 << 7;
                    if (var19 < class456.field6751[arg3]) {
                        class456.field6751[arg3] = var19;
                    } else if (class436.field6369[arg3] < var19) {
                        class436.field6369[arg3] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class444.field6472[class423.field6117][var9 - 1][var12] != var6) {
                        class126.field1673[var35] = class259.method1785(class259.method1785(var9 - 1, 1179648), -754974720);
                        class70.field920[var35] = class259.method1785(var12, 1245184);
                        var35 = var35 + 1 & 0xFFF;
                        class444.field6472[class423.field6117][var9 - 1][var12] = var6;
                    }
                    int var10000 = ~class78.field984;
                    var12++;
                    if (var10000 < ~var12) {
                        if (var9 - 1 >= 0 && class444.field6472[class423.field6117][var9 - 1][var12] != var6 && (class131.field1790[class423.field6117][var9][var12] & 0x4) == 0 && (class131.field1790[class423.field6117][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class126.field1673[var35] = class259.method1785(1375731712, class259.method1785(var9 - 1, 1179648));
                            class70.field920[var35] = class259.method1785(1245184, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class444.field6472[class423.field6117][var9 - 1][var12] = var6;
                        }
                        if (class444.field6472[class423.field6117][var9][var12] != var6) {
                            class126.field1673[var35] = class259.method1785(class259.method1785(5373952, var9), 318767104);
                            class70.field920[var35] = class259.method1785(5439488, var12);
                            class444.field6472[class423.field6117][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class195.field2745 > var9 + 1 && class444.field6472[class423.field6117][var9 + 1][var12] != var6 && (class131.field1790[class423.field6117][var9][var12] & 0x4) == 0 && (class131.field1790[class423.field6117][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class126.field1673[var35] = class259.method1785(class259.method1785(var9 + 1, 5373952), -1845493760);
                            class70.field920[var35] = class259.method1785(5439488, var12);
                            class444.field6472[class423.field6117][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (class195.field2745 > (var9 + 1) && class444.field6472[class423.field6117][var9 + 1][var12] != var6) {
                        class126.field1673[var35] = class259.method1785(1392508928, class259.method1785(9568256, var9 + 1));
                        class70.field920[var35] = class259.method1785(9633792, var12);
                        class444.field6472[class423.field6117][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class444.field6472[class423.field6117][var9 - 1][var12] != var6 && (class131.field1790[class423.field6117][var9][var12] & 0x4) == 0 && (class131.field1790[class423.field6117][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class126.field1673[var35] = class259.method1785(class259.method1785(13762560, var9 - 1), 301989888);
                            class70.field920[var35] = class259.method1785(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class444.field6472[class423.field6117][var9 - 1][var12] = var6;
                        }
                        if (class444.field6472[class423.field6117][var9][var12] != var6) {
                            class126.field1673[var35] = class259.method1785(-1828716544, class259.method1785(var9, 13762560));
                            class70.field920[var35] = class259.method1785(var12, 13828096);
                            var35 = var35 + 1 & 0xFFF;
                            class444.field6472[class423.field6117][var9][var12] = var6;
                        }
                        if (class195.field2745 > (var9 + 1) && class444.field6472[class423.field6117][var9 + 1][var12] != var6 && (class131.field1790[class423.field6117][var9][var12] & 0x4) == 0 && (class131.field1790[class423.field6117][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class126.field1673[var35] = class259.method1785(-771751936, class259.method1785(var9 + 1, 9568256));
                            class70.field920[var35] = class259.method1785(9633792, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class444.field6472[class423.field6117][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class421.field6095[arg3] != -1000000) {
                class421.field6095[arg3] += 10;
                class433.field6313[arg3] -= 50;
                class345.field5078[arg3] += 50;
                class436.field6369[arg3] += 50;
                class456.field6751[arg3] -= 50;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IILat;)V", line = 346)
    private final void method173(int arg0, int arg1, class256 arg2) {
        if (arg0 == 5) {
            this.field132 = arg2.method1767(1930493576);
        }
        field131++;
        if (arg1 != 13364) {
            field134 = 121;
        }
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(B)V", line = 362)
    public static void method174(byte arg0) {
        field129 = null;
        if (arg0 <= 60) {
            field134 = -16;
        }
    }
}
