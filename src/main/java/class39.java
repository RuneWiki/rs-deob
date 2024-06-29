import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class39 {

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "Lsf;")
    public static class108 field539 = class140.method973(255, "Ablegen");

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "[I")
    public static int[] field545 = new int[100];

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "Lsf;")
    public static class108 field541 = class140.method973(255, "Fps:");

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field548 = -1;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "B")
    public static byte field546;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "Ldl;")
    public class39 field538;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "Ldl;")
    public class39 field549;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "[[B")
    public static byte[][] field542;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lca;ZIII)V", line = 4)
    public static final void method264(class98 arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field540++;
        int var5 = arg0.field1673;
        int var6 = arg0.field1688;
        if (arg0.field1621 == 0) {
            arg0.field1688 = arg0.field1648;
        } else if (arg0.field1621 == 1) {
            arg0.field1688 = arg2 - arg0.field1648;
        } else if (arg0.field1621 == 2) {
            arg0.field1688 = arg0.field1648 * arg2 >> 14;
        } else if (arg0.field1621 == 3) {
            if (arg0.field1677 == 2) {
                arg0.field1688 = arg0.field1648 * 32 + ((arg0.field1648 - 1) * arg0.field1564);
            } else if (arg0.field1677 == 7) {
                arg0.field1688 = (arg0.field1648 - 1) * arg0.field1564 + arg0.field1648 * 12;
            }
        }
        if (arg0.field1567 == 0) {
            arg0.field1673 = arg0.field1733;
        } else if (arg0.field1567 == 1) {
            arg0.field1673 = arg4 - arg0.field1733;
        } else if (arg0.field1567 == 2) {
            arg0.field1673 = arg0.field1733 * arg4 >> 14;
        } else if (arg0.field1567 == 3) {
            if (arg0.field1677 == 2) {
                arg0.field1673 = arg0.field1733 * 32 + ((arg0.field1733 - 1) * arg0.field1652);
            } else if (arg0.field1677 == 7) {
                arg0.field1673 = (arg0.field1733 - 1) * arg0.field1652 + arg0.field1733 * 115;
            }
        }
        if (arg0.field1567 == 4) {
            arg0.field1673 = arg0.field1717 * arg0.field1688 / arg0.field1715;
        }
        if (arg3 != 1) {
            return;
        }
        if (arg0.field1621 == 4) {
            arg0.field1688 = arg0.field1715 * arg0.field1673 / arg0.field1717;
        }
        if (class46.field673 && (client.method1815(arg0) != 0 || arg0.field1677 == 0)) {
            if (arg0.field1688 < 5 && arg0.field1673 < 5) {
                arg0.field1673 = 5;
                arg0.field1688 = 5;
            } else {
                if (arg0.field1673 <= 0) {
                    arg0.field1673 = 5;
                }
                if (arg0.field1688 <= 0) {
                    arg0.field1688 = 5;
                }
            }
        }
        if (arg0.field1698 == 1337) {
            class122.field2086 = arg0;
        }
        if (arg1 && arg0.field1581 != null && (arg0.field1673 != var5 || arg0.field1688 != var6)) {
            class286 var7 = new class286();
            var7.field5006 = arg0;
            var7.field4993 = arg0.field1581;
            class295.field5138.method5(var7, (byte) -118);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIILma;JZ)V", line = 110)
    public static final void method265(int arg0, int arg1, int arg2, int arg3, class290 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class258 var8 = new class258();
        var8.field4557 = arg4;
        var8.field4563 = arg1 * 128 + 64;
        var8.field4559 = arg2 * 128 + 64;
        var8.field4553 = arg3;
        var8.field4560 = arg5;
        var8.field4561 = arg6;
        if (class99.field1759[arg0][arg1][arg2] == null) {
            class99.field1759[arg0][arg1][arg2] = new class74(arg0, arg1, arg2);
        }
        class99.field1759[arg0][arg1][arg2].field1141 = var8;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "()V", line = 129)
    public static final void method266() {
        class227.field3986 = 0;
        label194: for (int var0 = 0; var0 < class145.field2621; var0++) {
            class92 var1 = class285.field4985[var0];
            if (class240.field4180 != null) {
                for (int var2 = 0; var2 < class240.field4180.length; var2++) {
                    if (class240.field4180[var2] != -1000000 && (var1.field1462 <= class240.field4180[var2] || var1.field1473 <= class240.field4180[var2]) && (var1.field1458 <= class270.field4729[var2] || var1.field1449 <= class270.field4729[var2]) && (var1.field1458 >= class132.field2259[var2] || var1.field1449 >= class132.field2259[var2]) && (var1.field1459 <= class215.field3832[var2] || var1.field1455 <= class215.field3832[var2]) && (var1.field1459 >= class330.field5642[var2] || var1.field1455 >= class330.field5642[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field1445 == 1) {
                int var3 = var1.field1460 + class288.field5040 - class209.field3730;
                if (var3 >= 0 && var3 <= class288.field5040 + class288.field5040) {
                    int var4 = var1.field1451 + class288.field5040 - class131.field2237;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field1469 + class288.field5040 - class131.field2237;
                    if (var5 > class288.field5040 + class288.field5040) {
                        var5 = class288.field5040 + class288.field5040;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class78.field1179[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class1.field10 - var1.field1458;
                        if (var7 > 32) {
                            var1.field1464 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field1464 = 2;
                            var7 = -var7;
                        }
                        var1.field1467 = (var1.field1459 - class311.field5381 << 8) / var7;
                        var1.field1463 = (var1.field1455 - class311.field5381 << 8) / var7;
                        var1.field1471 = (var1.field1462 - class260.field4592 << 8) / var7;
                        var1.field1457 = (var1.field1473 - class260.field4592 << 8) / var7;
                        class247.field4292[class227.field3986++] = var1;
                    }
                }
            } else if (var1.field1445 == 2) {
                int var8 = var1.field1451 + class288.field5040 - class131.field2237;
                if (var8 >= 0 && var8 <= class288.field5040 + class288.field5040) {
                    int var9 = var1.field1460 + class288.field5040 - class209.field3730;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field1465 + class288.field5040 - class209.field3730;
                    if (var10 > class288.field5040 + class288.field5040) {
                        var10 = class288.field5040 + class288.field5040;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class78.field1179[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class311.field5381 - var1.field1459;
                        if (var12 > 32) {
                            var1.field1464 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field1464 = 4;
                            var12 = -var12;
                        }
                        var1.field1454 = (var1.field1458 - class1.field10 << 8) / var12;
                        var1.field1452 = (var1.field1449 - class1.field10 << 8) / var12;
                        var1.field1471 = (var1.field1462 - class260.field4592 << 8) / var12;
                        var1.field1457 = (var1.field1473 - class260.field4592 << 8) / var12;
                        class247.field4292[class227.field3986++] = var1;
                    }
                }
            } else if (var1.field1445 == 4) {
                int var13 = var1.field1462 - class260.field4592;
                if (var13 > 128) {
                    int var14 = var1.field1451 + class288.field5040 - class131.field2237;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field1469 + class288.field5040 - class131.field2237;
                    if (var15 > class288.field5040 + class288.field5040) {
                        var15 = class288.field5040 + class288.field5040;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field1460 + class288.field5040 - class209.field3730;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field1465 + class288.field5040 - class209.field3730;
                        if (var17 > class288.field5040 + class288.field5040) {
                            var17 = class288.field5040 + class288.field5040;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class78.field1179[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field1464 = 5;
                            var1.field1454 = (var1.field1458 - class1.field10 << 8) / var13;
                            var1.field1452 = (var1.field1449 - class1.field10 << 8) / var13;
                            var1.field1467 = (var1.field1459 - class311.field5381 << 8) / var13;
                            var1.field1463 = (var1.field1455 - class311.field5381 << 8) / var13;
                            class247.field4292[class227.field3986++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)I", line = 355)
    public static final int method267(int arg0) {
        field544++;
        return arg0 == -25835 ? 16 : -57;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)V", line = 366)
    public final void method268(int arg0) {
        field547++;
        if (this.field538 == null) {
            return;
        }
        this.field538.field549 = this.field549;
        this.field549.field538 = this.field538;
        this.field549 = null;
        if (arg0 == 17450) {
            this.field538 = null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)V", line = 386)
    public static void method269(int arg0) {
        field545 = null;
        field539 = null;
        if (arg0 != 128) {
            method266();
        }
        field542 = (byte[][]) null;
        field541 = null;
    }
}
