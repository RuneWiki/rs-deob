import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!naa")
public class class100 {

    @OriginalMember(owner = "client!naa", name = "c", descriptor = "I")
    private int field1478 = 0;

    @OriginalMember(owner = "client!naa", name = "g", descriptor = "Z")
    public boolean field1482 = true;

    @OriginalMember(owner = "client!naa", name = "l", descriptor = "I")
    public int field1487 = -1;

    @OriginalMember(owner = "client!naa", name = "h", descriptor = "Z")
    public boolean field1483 = true;

    @OriginalMember(owner = "client!naa", name = "m", descriptor = "I")
    public int field1488 = 512;

    @OriginalMember(owner = "client!naa", name = "i", descriptor = "I")
    public static int field1484 = -1;

    @OriginalMember(owner = "client!naa", name = "k", descriptor = "Laq;")
    public static class494 field1486 = new class494(20);

    @OriginalMember(owner = "client!naa", name = "o", descriptor = "Lsv;")
    public static class570 field1490 = new class570(6, 2);

    @OriginalMember(owner = "client!naa", name = "p", descriptor = "Z")
    public static boolean field1491 = false;

    @OriginalMember(owner = "client!naa", name = "q", descriptor = "I")
    public static int field1492 = 0;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "I")
    public int field1476;

    @OriginalMember(owner = "client!naa", name = "b", descriptor = "I")
    public int field1477;

    @OriginalMember(owner = "client!naa", name = "d", descriptor = "I")
    public int field1479;

    @OriginalMember(owner = "client!naa", name = "e", descriptor = "I")
    public static int field1480;

    @OriginalMember(owner = "client!naa", name = "f", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!naa", name = "j", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!naa", name = "n", descriptor = "I")
    public int field1489;

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(IILol;)V", line = 7)
    private final void method834(int arg0, int arg1, class431 arg2) {
        field1485++;
        if (arg0 == 1) {
            this.field1478 = arg2.method2515(109);
            this.method836((byte) 114, this.field1478);
        } else if (arg0 == 2) {
            this.field1487 = arg2.method2565((byte) -92);
            if (this.field1487 == 65535) {
                this.field1487 = -1;
            }
        } else if (arg0 == 3) {
            this.field1488 = arg2.method2565((byte) -91) << 2;
        } else if (arg0 == 4) {
            this.field1483 = false;
        } else if (arg0 == 5) {
            this.field1482 = false;
        }
        if (arg1 < 15) {
            this.field1487 = 69;
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(BLol;)V", line = 59)
    public final void method835(byte arg0, class431 arg1) {
        field1481++;
        while (true) {
            int var3 = arg1.method2557(14929);
            if (var3 == 0) {
                if (arg0 <= 38) {
                    this.method835((byte) 73, null);
                    return;
                } else {
                    return;
                }
            }
            this.method834(var3, 126, arg1);
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(BI)V", line = 82)
    private final void method836(byte arg0, int arg1) {
        field1480++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg1 & 0xFFC8) >> 8) / 256.0D;
        if (arg0 != 114) {
            this.method835((byte) -123, null);
        }
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        double var19 = var13 / 6.0D;
        this.field1479 = (int) (var17 * 256.0D);
        this.field1476 = (int) (var15 * 256.0D);
        if (this.field1479 < 0) {
            this.field1479 = 0;
        } else if (this.field1479 > 255) {
            this.field1479 = 255;
        }
        if (this.field1476 < 0) {
            this.field1476 = 0;
        } else if (this.field1476 > 255) {
            this.field1476 = 255;
        }
        if (var17 > 0.5D) {
            this.field1477 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1477 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1477 < 1) {
            this.field1477 = 1;
        }
        this.field1489 = (int) ((double) this.field1477 * var19);
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(Z[[[BIBIIZ)V", line = 172)
    public static final void method837(boolean arg0, byte[][][] arg1, int arg2, byte arg3, int arg4, int arg5, boolean arg6) {
        int var7 = arg0 ? 1 : 0;
        class761.field10539 = 0;
        class502.field6879 = 0;
        class94.field1352++;
        if ((arg5 & 0x2) == 0) {
            for (class745 var8 = class5.field74[var7]; var8 != null; var8 = var8.field10360) {
                if (!class118.method1044(var8, arg0, arg1, arg2, arg3)) {
                    class552.method3186(var8);
                    if (var8.field10348 != -1) {
                        class269.field3800[class761.field10539++] = var8;
                    }
                }
            }
        }
        if ((arg5 & 0x1) == 0) {
            for (class745 var9 = class277.field3997[var7]; var9 != null; var9 = var9.field10360) {
                if (!class118.method1044(var9, arg0, arg1, arg2, arg3)) {
                    class552.method3186(var9);
                    if (var9.field10348 != -1) {
                        class477.field6498[class502.field6879++] = var9;
                    }
                }
            }
            for (class745 var10 = class407.field5602[var7]; var10 != null; var10 = var10.field10360) {
                if (!class118.method1044(var10, arg0, arg1, arg2, arg3)) {
                    if (var10.method1175((byte) 71)) {
                        class552.method3186(var10);
                        if (var10.field10348 != -1) {
                            class477.field6498[class502.field6879++] = var10;
                        }
                    } else {
                        class552.method3186(var10);
                        if (var10.field10348 != -1) {
                            class269.field3800[class761.field10539++] = var10;
                        }
                    }
                }
            }
            if (!arg0) {
                for (int var11 = 0; var11 < class401.field5525; var11++) {
                    if (!class118.method1044(class316.field4516[var11], arg0, arg1, arg2, arg3)) {
                        class552.method3186(class316.field4516[var11]);
                        if (class316.field4516[var11].field10348 != -1) {
                            if (class316.field4516[var11].method1175((byte) 91)) {
                                class477.field6498[class502.field6879++] = class316.field4516[var11];
                            } else {
                                class269.field3800[class761.field10539++] = class316.field4516[var11];
                            }
                        }
                    }
                }
            }
        }
        if (class761.field10539 > 0) {
            class310.method1903(class269.field3800, 0, class761.field10539 - 1);
            for (int var12 = 0; var12 < class761.field10539; var12++) {
                class734.method4060(class269.field3800[var12], true, arg6);
            }
        }
        if (class398.field5491) {
            class29.field307.method504(0, null);
        }
        if ((arg5 & 0x2) == 0) {
            for (int var13 = class614.field8712; var13 < class169.field2565; var13++) {
                if (var13 < arg2 || arg1 == null) {
                    int var23 = class737.field10233.length;
                    if (class737.field10233.length + class483.field6677 > class42.field520) {
                        var23 -= class737.field10233.length + class483.field6677 - class42.field520;
                    }
                    int var24 = class737.field10233[0].length;
                    if (class737.field10233[0].length + class62.field946 > class681.field9665) {
                        var24 -= class737.field10233[0].length + class62.field946 - class681.field9665;
                    }
                    boolean[][] var25 = client.field1581;
                    if (class721.field10072) {
                        if (class494.field6789) {
                            var25 = class542.field7502[var13];
                        }
                        for (int var26 = class586.field8433; var26 < var23; var26++) {
                            int var27 = class483.field6677 + var26 - class586.field8433;
                            for (int var28 = class733.field10198; var28 < var24; var28++) {
                                if (class737.field10233[var26][var28] && !class291.method1845(class62.field946 + var28 - class733.field10198, (byte) -53, var27, var13)) {
                                    var25[var26][var28] = true;
                                } else {
                                    var25[var26][var28] = false;
                                }
                            }
                        }
                    }
                    if (class494.field6789) {
                        if (arg4 >= 0) {
                            class678.field9594[var13].method817(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class678.field9594[var13].method816(0, 0, 0, null, false, arg5);
                        }
                        for (int var29 = 0; var29 < class44.field585; var29++) {
                            class604.field8584[var29].method3148(new class139(var13 + 1), 4);
                        }
                    } else if (arg4 >= 0) {
                        class678.field9594[var13].method817(class277.field3995, class3.field47, class162.field2499, client.field1581, true, arg4, arg5);
                    } else {
                        class678.field9594[var13].method816(class277.field3995, class3.field47, class162.field2499, client.field1581, true, arg5);
                    }
                } else {
                    int var14 = class737.field10233.length;
                    if (class737.field10233.length + class483.field6677 > class42.field520) {
                        var14 -= class737.field10233.length + class483.field6677 - class42.field520;
                    }
                    int var15 = class737.field10233[0].length;
                    if (class737.field10233[0].length + class62.field946 > class681.field9665) {
                        var15 -= class737.field10233[0].length + class62.field946 - class681.field9665;
                    }
                    boolean[][] var16 = client.field1581;
                    if (class721.field10072) {
                        if (class494.field6789) {
                            var16 = class542.field7502[var13];
                        }
                        for (int var17 = class586.field8433; var17 < var14; var17++) {
                            int var18 = class483.field6677 + var17 - class586.field8433;
                            for (int var19 = class733.field10198; var19 < var15; var19++) {
                                var16[var17][var19] = false;
                                if (class737.field10233[var17][var19]) {
                                    int var20 = class62.field946 + var19 - class733.field10198;
                                    for (int var21 = var13; var21 >= 0; var21--) {
                                        if (class514.field7096[var21][var18][var20] != null && class514.field7096[var21][var18][var20].field2599 == var13) {
                                            if ((var21 < arg2 || arg1[var21][var18][var20] != arg3) && !class291.method1845(var20, (byte) -53, var18, var13)) {
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
                    if (class494.field6789) {
                        if (arg4 >= 0) {
                            class678.field9594[var13].method817(0, 0, 0, null, false, arg4, arg5);
                        } else {
                            class678.field9594[var13].method816(0, 0, 0, null, false, arg5);
                        }
                        for (int var22 = 0; var22 < class44.field585; var22++) {
                            class604.field8584[var22].method3148(new class139(var13 + 1), 4);
                        }
                    } else if (arg4 >= 0) {
                        class678.field9594[var13].method817(class277.field3995, class3.field47, class162.field2499, client.field1581, false, arg4, arg5);
                    } else {
                        class678.field9594[var13].method816(class277.field3995, class3.field47, class162.field2499, client.field1581, false, arg5);
                    }
                }
            }
        }
        if (class502.field6879 > 0) {
            class136.method1125(class477.field6498, 0, class502.field6879 - 1);
            for (int var30 = 0; var30 < class502.field6879; var30++) {
                class734.method4060(class477.field6498[var30], true, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!naa", name = "a", descriptor = "(B)V", line = 479)
    public static void method838(byte arg0) {
        field1486 = null;
        if (arg0 != 93) {
            field1484 = -30;
        }
        field1490 = null;
    }
}
