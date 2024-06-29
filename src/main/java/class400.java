import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public abstract class class400 {

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
    public int field5481;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public int field5478;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
    public int field5482;

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(III)V")
    public abstract void method1096(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIZ[[[Lrg;B)Z")
    public static final boolean method2403(int arg0, int arg1, int arg2, boolean arg3, class563[][][] arg4, byte arg5) {
        field5479++;
        byte var6 = arg3 ? 1 : (byte) (class227.field2903 & 0xFF);
        if (arg5 > -56) {
            field5480 = 100;
        }
        if (class625.field9046[class187.field2407][arg0][arg2] == var6) {
            return false;
        } else if ((class310.field3971[class187.field2407][arg0][arg2] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class638.field9257[var7] = arg0;
            int var35 = var7 + 1;
            class263.field3362[var7] = arg2;
            class625.field9046[class187.field2407][arg0][arg2] = var6;
            while (var35 != var8) {
                int var9 = class638.field9257[var8] & 0xFFFF;
                int var10 = class638.field9257[var8] >> 16 & 0xFF;
                int var11 = class638.field9257[var8] >> 24 & 0xFF;
                int var12 = class263.field3362[var8] & 0xFFFF;
                int var13 = class263.field3362[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class310.field3971[class187.field2407][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class187.field2407 + 1; var16 <= 3; var16++) {
                    if ((class310.field3971[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg4[var16][var9][var12] != null) {
                            if (arg4[var16][var9][var12].field7896 != null) {
                                int var20 = class93.method511((byte) 123, var10);
                                if (arg4[var16][var9][var12].field7896.field64 == var20 || arg4[var16][var9][var12].field7884 != null && arg4[var16][var9][var12].field7884.field64 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class93.method511((byte) -66, var11);
                                    if (arg4[var16][var9][var12].field7896.field64 == var21 || arg4[var16][var9][var12].field7884 != null && arg4[var16][var9][var12].field7884.field64 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class93.method511((byte) 91, var13);
                                    if (arg4[var16][var9][var12].field7896.field64 == var22 || arg4[var16][var9][var12].field7884 != null && arg4[var16][var9][var12].field7884.field64 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class563 var23 = arg4[var16][var9][var12];
                            if (var23.field7894 != null) {
                                for (class15 var24 = var23.field7894; var24 != null; var24 = var24.field158) {
                                    class450 var25 = var24.field161;
                                    if (var25 instanceof class246) {
                                        class246 var26 = (class246) var25;
                                        int var27 = var26.method57(-29185);
                                        int var28 = var26.method60(1901);
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
                        class563 var30 = arg4[var16][var9][var12];
                        if (var30 != null && var30.field7894 != null) {
                            for (class15 var31 = var30.field7894; var31 != null; var31 = var31.field158) {
                                class450 var32 = var31.field161;
                                if (var32.field6361 != var32.field6357 || var32.field6367 != var32.field6359) {
                                    for (int var33 = var32.field6361; var33 <= var32.field6357; var33++) {
                                        for (int var34 = var32.field6359; var34 <= var32.field6367; var34++) {
                                            class625.field9046[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class625.field9046[var16][var9][var12] = var6;
                        var15 = true;
                    }
                }
                if (var15) {
                    int var17 = class501.field6947[class187.field2407 + 1].method1031(var9, var12);
                    if (var17 > class585.field8466[arg1]) {
                        class585.field8466[arg1] = var17;
                    }
                    int var18 = var9 << 9;
                    if (var18 < class88.field1169[arg1]) {
                        class88.field1169[arg1] = var18;
                    } else if (var18 > client.field8972[arg1]) {
                        client.field8972[arg1] = var18;
                    }
                    int var19 = var12 << 9;
                    if (class324.field4451[arg1] > var19) {
                        class324.field4451[arg1] = var19;
                    } else if (class207.field2692[arg1] < var19) {
                        class207.field2692[arg1] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class625.field9046[class187.field2407][var9 - 1][var12] != var6) {
                        class638.field9257[var35] = class292.method1790(-754974720, class292.method1790(var9 - 1, 1179648));
                        class263.field3362[var35] = class292.method1790(1245184, var12);
                        class625.field9046[class187.field2407][var9 - 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12++;
                    if (var12 < class369.field5135) {
                        if (var9 - 1 >= 0 && class625.field9046[class187.field2407][var9 - 1][var12] != var6 && (class310.field3971[class187.field2407][var9][var12] & 0x4) == 0 && (class310.field3971[class187.field2407][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class638.field9257[var35] = class292.method1790(class292.method1790(1179648, var9 - 1), 1375731712);
                            class263.field3362[var35] = class292.method1790(1245184, var12);
                            class625.field9046[class187.field2407][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class625.field9046[class187.field2407][var9][var12] != var6) {
                            class638.field9257[var35] = class292.method1790(class292.method1790(5373952, var9), 318767104);
                            class263.field3362[var35] = class292.method1790(5439488, var12);
                            class625.field9046[class187.field2407][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < class139.field1760 && class625.field9046[class187.field2407][var9 + 1][var12] != var6 && (class310.field3971[class187.field2407][var9][var12] & 0x4) == 0 && (class310.field3971[class187.field2407][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class638.field9257[var35] = class292.method1790(class292.method1790(var9 + 1, 5373952), -1845493760);
                            class263.field3362[var35] = class292.method1790(var12, 5439488);
                            class625.field9046[class187.field2407][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if ((var9 + 1) < class139.field1760 && class625.field9046[class187.field2407][var9 + 1][var12] != var6) {
                        class638.field9257[var35] = class292.method1790(class292.method1790(var9 + 1, 9568256), 1392508928);
                        class263.field3362[var35] = class292.method1790(9633792, var12);
                        class625.field9046[class187.field2407][var9 + 1][var12] = var6;
                        var35 = var35 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var9 - 1 >= 0 && class625.field9046[class187.field2407][var9 - 1][var12] != var6 && (class310.field3971[class187.field2407][var9][var12] & 0x4) == 0 && (class310.field3971[class187.field2407][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class638.field9257[var35] = class292.method1790(class292.method1790(13762560, var9 - 1), 301989888);
                            class263.field3362[var35] = class292.method1790(13828096, var12);
                            class625.field9046[class187.field2407][var9 - 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class625.field9046[class187.field2407][var9][var12] != var6) {
                            class638.field9257[var35] = class292.method1790(class292.method1790(var9, 13762560), -1828716544);
                            class263.field3362[var35] = class292.method1790(13828096, var12);
                            class625.field9046[class187.field2407][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < class139.field1760 && class625.field9046[class187.field2407][var9 + 1][var12] != var6 && (class310.field3971[class187.field2407][var9][var12] & 0x4) == 0 && (class310.field3971[class187.field2407][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class638.field9257[var35] = class292.method1790(class292.method1790(var9 + 1, 9568256), -771751936);
                            class263.field3362[var35] = class292.method1790(var12, 9633792);
                            var35 = var35 + 1 & 0xFFF;
                            class625.field9046[class187.field2407][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class585.field8466[arg1] != -1000000) {
                class585.field8466[arg1] += 10;
                class88.field1169[arg1] -= 50;
                client.field8972[arg1] += 50;
                class207.field2692[arg1] += 50;
                class324.field4451[arg1] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(III)V")
    public class400(int arg0, int arg1, int arg2) {
        this.field5481 = arg1;
        this.field5478 = arg0;
        this.field5482 = arg2;
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(III)V")
    public abstract void method1099(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIB)V")
    public abstract void method1098(int arg0, int arg1, byte arg2);
}
