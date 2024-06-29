import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class102 extends class409 {

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field1577 = -1;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public int field1578;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "I")
    public static int field1580;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "I")
    public int field1581;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "I")
    public int field1582;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "I")
    public int field1583;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    public static int field1584;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "Luc;")
    public class23 field1576;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "Lpr;")
    public static class317 field1575;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "Laa;")
    public static class343 field1574;

    static {
        new class44("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BI)V", line = 5)
    public static final void method748(byte arg0, int arg1) {
        if (class497.field7189 == 1) {
            class208.field3161 = arg1;
        } else if (class497.field7189 == 2 || class497.field7189 == 3) {
            class252.field3741 = arg1;
        }
        field1580++;
        if (arg0 != 49) {
            field1585 = 42;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)I", line = 22)
    public static final int method749(int arg0, int arg1, int arg2) {
        if (arg0 != 16383) {
            field1585 = 92;
        }
        field1584++;
        return arg2 == 4 || arg2 == 5 ? class244.field3651[arg1 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BZIIII)V", line = 38)
    public static final void method750(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field1579++;
        if (class461.field6675 == null) {
            class76.field1256.method1193(1, arg5, arg4, arg2, arg3, -16777216);
        } else if (class364.field5293.field6961 >= 0 && class364.field5293.field6961 < (class69.field1139 * 128) && class364.field5293.field6965 >= 0 && (class255.field3763 * 128) > class364.field5293.field6965) {
            class110.field1635++;
            if (class364.field5293 != null && (class364.field5293.field6961 + 64 - class364.field5293.method135((byte) 72) * 64 >> 7) == class17.field186 && (class364.field5293.field6965 + (64 - (class364.field5293.method135((byte) 72) * 64)) >> 7) == class112.field1651) {
                class112.field1651 = -1;
                class17.field186 = -1;
                class320.method2041(-110);
            }
            class269.method1737(119);
            if (!arg1) {
                class107.method784(true);
            }
            class451.method2684(2048);
            class468.method2777(arg2, arg5, arg4, true, arg3, (byte) -13);
            int var6 = class8.field67;
            if (arg0 == 37) {
                int var7 = class67.field1122;
                int var8 = class497.field7205;
                int var9 = class100.field1552;
                if (class294.field4381 == 1) {
                    int var12 = (int) class524.field7655;
                    if ((class463.field6717 >> 8) > var12) {
                        var12 = class463.field6717 >> 8;
                    }
                    if (class172.field2551[4] && (class77.field1260[4] + 128) > var12) {
                        var12 = class77.field1260[4] + 128;
                    }
                    int var13 = (int) class508.field7354 + class505.field7304 & 0x3FFF;
                    class77.method590(arg0 - 152, class486.field7048, class78.field1279, class224.method1515(class364.field5293.field6961, class364.field5293.field6965, class123.field1944, arg0 ^ -631749406) - 50, var8, var12, var13, ((var12 >> 3) * 3) + 600 << 0);
                } else if (class294.field4381 == 4) {
                    int var10 = (int) class524.field7655;
                    if ((class463.field6717 >> 8) > var10) {
                        var10 = class463.field6717 >> 8;
                    }
                    if (class172.field2551[4] && var10 < (class77.field1260[4] + 128)) {
                        var10 = class77.field1260[4] + 128;
                    }
                    int var11 = (int) class508.field7354 & 0x3FFF;
                    class77.method590(-116, class486.field7048, class78.field1279, class224.method1515(class385.field5502, class279.field4147, class123.field1944, -631749433) - 50, var8, var10, var11, (var10 >> 3) * 3 + 600 << 0);
                } else if (class294.field4381 == 5) {
                    class395.method2383(-115, var8);
                }
                int var14 = class315.field4688;
                int var15 = class62.field1086;
                int var16 = class397.field5649;
                int var17 = class254.field3756;
                int var18 = class171.field2548;
                for (int var19 = 0; var19 < 5; var19++) {
                    if (class172.field2551[var19]) {
                        int var22 = (int) ((double) (-class408.field5787[var19]) + (double) (class408.field5787[var19] * 2 + 1) * Math.random() + Math.sin((double) class400.field5681[var19] / 100.0D * (double) class196.field2868[var19]) * (double) class77.field1260[var19]);
                        if (var19 == 3) {
                            class171.field2548 = class171.field2548 + var22 & 0x3FFF;
                        }
                        if (var19 == 1) {
                            class62.field1086 += var22;
                        }
                        if (var19 == 2) {
                            class397.field5649 += var22;
                        }
                        if (var19 == 0) {
                            class315.field4688 += var22;
                        }
                        if (var19 == 4) {
                            class254.field3756 += var22;
                            if (class254.field3756 < 1024) {
                                class254.field3756 = 1024;
                            } else if (class254.field3756 > 3072) {
                                class254.field3756 = 3072;
                            }
                        }
                    }
                }
                if (class315.field4688 < 0) {
                    class315.field4688 = 0;
                }
                if (class397.field5649 < 0) {
                    class397.field5649 = 0;
                }
                if (class315.field4688 > ((class394.field5608 << 7) - 1)) {
                    class315.field4688 = (class394.field5608 << 7) - 1;
                }
                if ((class337.field5000 << 7) - 1 < class397.field5649) {
                    class397.field5649 = (class337.field5000 << 7) - 1;
                }
                class96.method732(-19490);
                class96.method729((byte) -124);
                class76.field1256.method345(var9, var6, var9 + var7, var6 + var8);
                class76.field1256.method268();
                int var20 = class540.field7953;
                if (class391.field5551 == null) {
                    class76.field1256.method233(var20);
                } else {
                    class391.field5551.method2074(class254.field3756, -4096, class358.field5198 << 3, var20, class171.field2548, var9, class76.field1256, var8, var7, var6);
                }
                class259.method1668(8101);
                class289.field4283.method35(class315.field4688, class62.field1086, class397.field5649, -class254.field3756 & 0x3FFF, -class171.field2548 & 0x3FFF, -class39.field835 & 0x3FFF);
                class76.field1256.method209(class289.field4283);
                class76.field1256.method325(var9 + (var7 / 2), var8 / 2 + var6, class380.field5433 << 1, class380.field5433 << 1);
                class227.method1525(class380.field5433 << 1, 24209, class380.field5433 << 1, var6 + (var8 / 2), var9 - -(var7 / 2));
                class465.method2763(-class39.field835 & 0x3FFF, class397.field5649, 8069, -class254.field3756 & 0x3FFF, class62.field1086, -class171.field2548 & 0x3FFF, class315.field4688);
                byte var21 = class220.field3371.method1050(31659, class74.field1211) == 2 ? (byte) class110.field1635 : 1;
                class332.method2101(class76.field1256, class24.field349, class327.field4806, class289.field4283, class315.field4688, class62.field1086, class397.field5649, class386.field5507, class485.field7032, class319.field4733, class408.field5785, class7.field51, class477.field6944, class364.field5293.field6956 + 1, var21, class364.field5293.field6961 >> 7, class364.field5293.field6965 >> 7, !class220.field3371.field2579);
                class259.method1668(8101);
                if (class37.field799 == 9) {
                    class154.method1088(var8, 256, true, var6, var7, var9, 256);
                    class495.method2906(var9, 256, var7, var6, arg0 ^ 0xFF000025, var8, 256);
                    class451.method2689(var9, 256, var8, 256, var6, (byte) -40, var7);
                    class254.method1637((byte) -106, var7, var6, var8, var9);
                }
                class347.method2187();
                class254.field3756 = var17;
                class397.field5649 = var16;
                class315.field4688 = var14;
                class62.field1086 = var15;
                class171.field2548 = var18;
                if (class141.field2181 && class479.field6979.method459(0) == 0) {
                    class141.field2181 = false;
                }
                if (class141.field2181) {
                    class76.field1256.method1193(1, var6, var9, var7, var8, -16777216);
                    class283.method1825(false, class406.field5775, class235.field3505.method426(class503.field7255, arg0 + 33), 54);
                }
            }
        } else {
            class76.field1256.method1193(1, arg5, arg4, arg2, arg3, -16777216);
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V", line = 230)
    public static void method751(int arg0) {
        if (arg0 != 803177123) {
            method751(68);
        }
        field1574 = null;
        field1575 = null;
    }
}
