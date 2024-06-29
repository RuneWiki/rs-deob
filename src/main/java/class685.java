import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class685 implements class346 {

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "Leq;")
    private class209 field9659;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "Ljava/lang/String;")
    private String field9662;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "[I")
    public static int[] field9663 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
    public static int field9657;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "I")
    public static int field9658;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "I")
    public static int field9660;

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
    public static int field9661;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
    public static int field9664;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)V", line = 3)
    public static void method3856(int arg0) {
        field9663 = null;
        if (arg0 != 4) {
            method3857(false);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)V", line = 14)
    public static final void method3857(boolean arg0) {
        field9664++;
        int var1 = 0;
        if (class471.field6781.field6688.method3933(27669) == 1) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (class471.field6781.field6696.method3214(27669) == 0) {
            var1 |= 0x40;
        }
        class417.method2543(var1, 97);
        class66.field1181.method127(var1, 2);
        class558.field7942.method729(8202, var1);
        class134.field2102.method3037((byte) 28, var1);
        class638.field9104.method3750(var1, 126);
        if (!arg0) {
            field9663 = null;
        }
        class533.method3132(false, var1);
        class312.method2022(var1, 0);
        class99.method882(0, var1);
        class486.method2921(var1, 1);
        class314.method2030(10);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)Lqfa;", line = 57)
    public final class98 method492(int arg0) {
        if (arg0 == -29480) {
            field9657++;
            return class98.field1668;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)I", line = 70)
    public final int method493(byte arg0) {
        field9661++;
        if (this.field9659.method1465(arg0 - 124, this.field9662)) {
            return 100;
        } else {
            if (arg0 != 124) {
                field9658 = 126;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z[[[BIBIIZ)V", line = 87)
    public static final void method3858(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class431.field6032 = 0;
        class237.field3355 = 0;
        class335.field4737++;
        if ((arg5 & 0x2) == 0) {
            for (int var8 = 0; var8 < class189.field2729[var7]; var8++) {
                if (!class376.method2359(class307.field4351[var7][var8], arg0, arg1, arg2, arg3)) {
                    class368.method2298(class307.field4351[var7][var8]);
                    if (class307.field4351[var7][var8].field647 != -1) {
                        class435.field6082[class431.field6032++] = class307.field4351[var7][var8];
                    }
                }
            }
        }
        if ((arg5 & 0x1) == 0) {
            for (int var9 = 0; var9 < class444.field6176[var7]; var9++) {
                if (!class376.method2359(class319.field4524[var7][var9], arg0, arg1, arg2, arg3)) {
                    class368.method2298(class319.field4524[var7][var9]);
                    if (class319.field4524[var7][var9].field647 != -1) {
                        class706.field9897[class237.field3355++] = class319.field4524[var7][var9];
                    }
                }
            }
            for (int var10 = 0; var10 < class579.field8176[var7]; var10++) {
                if (!class376.method2359(class598.field8718[var7][var10], arg0, arg1, arg2, arg3)) {
                    if (class598.field8718[var7][var10].method399((byte) 38)) {
                        class368.method2298(class598.field8718[var7][var10]);
                        if (class598.field8718[var7][var10].field647 != -1) {
                            class706.field9897[class237.field3355++] = class598.field8718[var7][var10];
                        }
                    } else {
                        class368.method2298(class598.field8718[var7][var10]);
                        if (class598.field8718[var7][var10].field647 != -1) {
                            class435.field6082[class431.field6032++] = class598.field8718[var7][var10];
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class586.field8252; var11++) {
                    if (!class376.method2359(class120.field1870[var11], arg0, arg1, arg2, arg3)) {
                        class368.method2298(class120.field1870[var11]);
                        if (class120.field1870[var11].field647 != -1) {
                            if (class120.field1870[var11].method399((byte) 38)) {
                                class706.field9897[class237.field3355++] = class120.field1870[var11];
                            } else {
                                class435.field6082[class431.field6032++] = class120.field1870[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class431.field6032 > 0) {
            class280.method1833(class435.field6082, 0, class431.field6032 - 1);
            for (int var12 = 0; var12 < class431.field6032; var12++) {
                class176.method1280(class435.field6082[var12], true, arg6);
            }
        }
        if (class140.field2172) {
            class497.field7089.method575(0, null);
        }
        if ((arg5 & 0x2) == 0) {
            for (int var13 = class475.field6803; var13 < class749.field10470; var13++) {
                if (var13 < arg2 || arg1 == null) {
                    int var23 = class533.field7539.length;
                    if (class533.field7539.length + class78.field1471 > class613.field8871) {
                        var23 -= class533.field7539.length + class78.field1471 - class613.field8871;
                    }
                    int var24 = class533.field7539[0].length;
                    if (class533.field7539[0].length + class249.field3503 > class453.field6328) {
                        var24 -= class533.field7539[0].length + class249.field3503 - class453.field6328;
                    }
                    boolean[][] var25 = class462.field6655;
                    if (class336.field4756) {
                        if (class190.field2741) {
                            var25 = class705.field9867[var13];
                        }
                        for (int var26 = class247.field3466; var26 < var23; var26++) {
                            int var27 = class78.field1471 + var26 - class247.field3466;
                            for (int var28 = class131.field1953; var28 < var24; var28++) {
                                if (class533.field7539[var26][var28] && !class675.method3817(var13, 1, class249.field3503 + var28 - class131.field1953, var27)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class190.field2741) {
                        if (arg4 >= 0) {
                            class138.field2153[var13].method1096(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class138.field2153[var13].method1078(0, 0, 0, null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class272.field3892; var29++) {
                            class497.field7092[var29].method3788((byte) 123, new class266(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class138.field2153[var13].method1096(class155.field2331, class214.field3065, class235.field3337, class462.field6655, true, arg4, arg5);
                    } else {
                        class138.field2153[var13].method1078(class155.field2331, class214.field3065, class235.field3337, class462.field6655, true, arg5);
                    }
                } else {
                    int var14 = class533.field7539.length;
                    if (class533.field7539.length + class78.field1471 > class613.field8871) {
                        var14 -= class533.field7539.length + class78.field1471 - class613.field8871;
                    }
                    int var15 = class533.field7539[0].length;
                    if (class533.field7539[0].length + class249.field3503 > class453.field6328) {
                        var15 -= class533.field7539[0].length + class249.field3503 - class453.field6328;
                    }
                    boolean[][] var16 = class462.field6655;
                    if (class336.field4756) {
                        if (class190.field2741) {
                            var16 = class705.field9867[var13];
                        }
                        for (int var17 = class247.field3466; var17 < var14; var17++) {
                            int var18 = class78.field1471 + var17 - class247.field3466;
                            for (int var19 = class131.field1953; var19 < var15; var19++) {
                                var16[var17][var19] = false;
                                if (class533.field7539[var17][var19]) {
                                    int var20 = class249.field3503 + var19 - class131.field1953;
                                    for (int var21 = var13; var21 >= 0; var21--) {
                                        if (class390.field5454[var21][var18][var20] != null && class390.field5454[var21][var18][var20].field5835 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class675.method3817(var13, 1, var20, var18)) {
                                                var16[var17][var19] = true;
                                                break;
                                            }
                                            var16[var17][var19] = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class190.field2741) {
                        if (arg4 >= 0) {
                            class138.field2153[var13].method1096(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class138.field2153[var13].method1078(0, 0, 0, null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class272.field3892; var22++) {
                            class497.field7092[var22].method3788((byte) 123, new class266(var13 + 1));
                        }
                    } else if (arg4 >= 0) {
                        class138.field2153[var13].method1096(class155.field2331, class214.field3065, class235.field3337, class462.field6655, false, arg4, arg5);
                    } else {
                        class138.field2153[var13].method1078(class155.field2331, class214.field3065, class235.field3337, class462.field6655, false, arg5);
                    }
                }
            }
        }
        if (class237.field3355 > 0) {
            class138.method1097(class706.field9897, 0, class237.field3355 - 1);
            for (int var30 = 0; var30 < class237.field3355; var30++) {
                class176.method1280(class706.field9897[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Leq;Ljava/lang/String;)V", line = 388)
    public class685(class209 arg0, String arg1) {
        this.field9659 = arg0;
        this.field9662 = arg1;
    }
}
