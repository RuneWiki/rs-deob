import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class452 {

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public int field6463 = -1;

    @OriginalMember(owner = "client!f", name = "k", descriptor = "Z")
    public static boolean field6472 = false;

    @OriginalMember(owner = "client!f", name = "e", descriptor = "Liq;")
    public static class362 field6466 = new class362("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

    @OriginalMember(owner = "client!f", name = "o", descriptor = "[I")
    public static int[] field6476 = new int[5];

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field6462;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "I")
    public static int field6464;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "I")
    public static int field6467;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "I")
    public static int field6468;

    @OriginalMember(owner = "client!f", name = "i", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!f", name = "m", descriptor = "I")
    public static int field6474;

    @OriginalMember(owner = "client!f", name = "n", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!f", name = "h", descriptor = "Lec;")
    public class128 field6469;

    @OriginalMember(owner = "client!f", name = "j", descriptor = "Lnh;")
    public static class448 field6471;

    @OriginalMember(owner = "client!f", name = "p", descriptor = "Z")
    public static boolean field6477;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "[I")
    public int[] field6465;

    @OriginalMember(owner = "client!f", name = "l", descriptor = "[Ljava/lang/String;")
    public String[] field6473;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2797(int arg0) {
        field6464++;
        if (class69.field803 == 0) {
            return;
        }
        try {
            if ((++class298.field4171) > 2000) {
                if (class146.field1798 != null) {
                    class146.field1798.method1343((byte) -41);
                    class146.field1798 = null;
                }
                if (class366.field5192 >= 1) {
                    class222.field3109 = -5;
                    class69.field803 = 0;
                    return;
                }
                if (class297.field4149 == class154.field1904) {
                    class297.field4149 = class276.field3917;
                } else {
                    class297.field4149 = class154.field1904;
                }
                class69.field803 = 1;
                class366.field5192++;
                class298.field4171 = 0;
            }
            if (class69.field803 == 1) {
                class358.field5087 = class14.field185.method1268(class310.field4384, (byte) -84, class297.field4149);
                class69.field803 = 2;
            }
            if (class69.field803 == 2) {
                if (class358.field5087.field4498 == 2) {
                    throw new IOException();
                }
                if (class358.field5087.field4498 != 1) {
                    return;
                }
                class146.field1798 = new class202((Socket) class358.field5087.field4497, class14.field185);
                class358.field5087 = null;
                class146.field1798.method1337(class62.field718.field3320, (byte) 126, 0, class62.field718.field3364);
                if (class81.field942 != null) {
                    class81.field942.method137(-15326);
                }
                if (class230.field3255 != null) {
                    class230.field3255.method137(-15326);
                }
                int var1 = class146.field1798.method1344((byte) -103);
                if (class81.field942 != null) {
                    class81.field942.method137(-15326);
                }
                if (class230.field3255 != null) {
                    class230.field3255.method137(-15326);
                }
                if (var1 != 21) {
                    class222.field3109 = var1;
                    class69.field803 = 0;
                    class146.field1798.method1343((byte) 72);
                    class146.field1798 = null;
                    return;
                }
                class69.field803 = 3;
            }
            if (class69.field803 == 3) {
                if (class146.field1798.method1340(0) < 1) {
                    return;
                }
                class203.field2925 = new String[class146.field1798.method1344((byte) -103)];
                class69.field803 = 4;
            }
            if (class69.field803 == 4) {
                if (class146.field1798.method1340(0) < (class203.field2925.length * 8)) {
                    return;
                }
                class359.field5120.field3320 = 0;
                class146.field1798.method1336((byte) 125, class359.field5120.field3364, 0, class203.field2925.length * 8);
                for (int var2 = 0; var2 < class203.field2925.length; var2++) {
                    class203.field2925[var2] = class25.method178(class359.field5120.method1600(-1), (byte) 127);
                }
                class69.field803 = 0;
                class222.field3109 = 21;
                class146.field1798.method1343((byte) 56);
                class146.field1798 = null;
                return;
            }
        } catch (IOException var3) {
            if (class146.field1798 != null) {
                class146.field1798.method1343((byte) 105);
                class146.field1798 = null;
            }
            if (class366.field5192 >= 1) {
                class69.field803 = 0;
                class222.field3109 = -4;
            } else {
                class69.field803 = 1;
                class366.field5192++;
                class298.field4171 = 0;
                if (class297.field4149 == class154.field1904) {
                    class297.field4149 = class276.field3917;
                } else {
                    class297.field4149 = class154.field1904;
                }
            }
        }
        if (arg0 <= 25) {
            method2801(63, -74);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)Ljava/lang/String;", line = 162)
    public static final String method2798(int arg0, int arg1, int arg2) {
        field6470++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else {
            int var4 = -20 % ((-arg2 - 10) / 44);
            if (var3 > 6) {
                return "<col=40ff00>";
            } else if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lol;Lak;)V", line = 205)
    public static final void method2799(class156 arg0, class193 arg1) {
        if (!arg1.field2782) {
            return;
        }
        short var2 = arg1.field2765;
        short var3 = arg1.field2766;
        byte var4 = arg1.field2777;
        byte var5 = arg1.field2789;
        int var6 = (var2 << 7) + 64;
        int var7 = (var3 << 7) + 64;
        class193[][] var8 = class250.field3570[var4];
        float var10;
        if (class399.field5693 == class161.field2122) {
            int var9 = class87.field992[var2][var3];
            class36.field422.method619(class98.field1191[0].method342(var6, var7), var9 & 0xFFFFFF, var9 >>> 21 & 0x7F8);
            var10 = 251.5F;
        } else {
            var10 = 201.5F - (float) (var5 + 1) * 50.0F;
        }
        class36.field422.method691(3000.0F, var10 * 1.5F);
        if (arg1.field2795) {
            if (class402.field5768) {
                if (var4 > 0) {
                    class193 var11 = class250.field3570[var4 - 1][var2][var3];
                    if (var11 != null && var11.field2782) {
                        return;
                    }
                }
                if (var2 <= class444.field6379 && var2 > class216.field3050) {
                    class193 var12 = var8[var2 - 1][var3];
                    if (var12 != null && var12.field2782 && (var12.field2795 || (arg1.field2770 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class444.field6379 && var2 < class50.field605 - 1) {
                    class193 var13 = var8[var2 + 1][var3];
                    if (var13 != null && var13.field2782 && (var13.field2795 || (arg1.field2770 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class137.field1706 && var3 > class380.field5349) {
                    class193 var14 = var8[var2][var3 - 1];
                    if (var14 != null && var14.field2782 && (var14.field2795 || (arg1.field2770 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class137.field1706 && var3 < class161.field2129 - 1) {
                    class193 var15 = var8[var2][var3 + 1];
                    if (var15 != null && var15.field2782 && (var15.field2795 || (arg1.field2770 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class402.field5768 = true;
            }
            arg1.field2795 = false;
            if (arg1.field2773 != null) {
                class193 var16 = arg1.field2773;
                class36.field422.method691(3000.0F, (201.5F - (float) (var16.field2789 + 1) * 50.0F) * 1.5F);
                if (!class261.method1746(var16.field2789, var2, var3)) {
                    class161.field2122[var16.field2789].method347(var2, var3);
                }
                class394 var17 = var16.field2784;
                if (var17 != null) {
                    if (class263.field3752) {
                        if ((var17.field5560 & arg1.field2776) == 0) {
                            class48.method276(arg0, var4, var2, var3);
                        } else {
                            class273.method1799(arg0, var17.field5560, var5, var2, var3);
                        }
                        class36.field422.method677(arg0.field1911, arg0.field1910);
                    }
                    var17.method52((byte) -120, class36.field422);
                }
                for (class250 var18 = var16.field2779; var18 != null; var18 = var18.field3568) {
                    class233 var19 = var18.field3571;
                    if (var19 != null) {
                        if (class263.field3752) {
                            class48.method276(arg0, var4, var2, var3);
                            class36.field422.method677(arg0.field1911, arg0.field1910);
                        }
                        var19.method52((byte) -120, class36.field422);
                    }
                }
                class36.field422.method691(3000.0F, var10 * 1.5F);
            }
            boolean var20 = !class261.method1746(var5, var2, var3);
            if (var20) {
                class161.field2122[var5].method347(var2, var3);
                class46 var21 = arg1.field2790;
                if (var21 != null && var21.field553) {
                    if (var21.field561) {
                        class36.field422.method691(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class263.field3752) {
                        class48.method276(arg0, var4, var2, var3);
                        class36.field422.method677(arg0.field1911, arg0.field1910);
                    }
                    class186 var22 = var21.method52((byte) -120, class36.field422);
                    if (var22 != null) {
                        var22.field2703 = var21;
                        var22.field2702 = var4;
                        var22.field2695 = var2;
                        var22.field2701 = var3;
                        class134.field1615.method2511(12, var22);
                    }
                    if (var21.field561) {
                        class36.field422.method691(3000.0F, var10 * 1.5F);
                    }
                }
            }
            int var23 = 0;
            int var24 = 0;
            class394 var25 = arg1.field2784;
            class48 var26 = arg1.field2788;
            if (var25 != null || var26 != null) {
                if (class444.field6379 == var2) {
                    var23++;
                } else if (class444.field6379 < var2) {
                    var23 += 2;
                }
                if (class137.field1706 == var3) {
                    var23 += 3;
                } else if (class137.field1706 > var3) {
                    var23 += 6;
                }
                var24 = class181.field2483[var23];
                arg1.field2776 = class19.field251[var23];
            }
            if (var25 != null) {
                if ((var25.field5560 & class203.field2923[var23]) == 0) {
                    arg1.field2797 = 0;
                } else if (var25.field5560 == 16) {
                    arg1.field2797 = 3;
                    arg1.field2768 = class418.field5984[var23];
                    arg1.field2783 = (byte) (3 - arg1.field2768);
                } else if (var25.field5560 == 32) {
                    arg1.field2797 = 6;
                    arg1.field2768 = class392.field5536[var23];
                    arg1.field2783 = (byte) (6 - arg1.field2768);
                } else if (var25.field5560 == 64) {
                    arg1.field2797 = 12;
                    arg1.field2768 = class192.field2762[var23];
                    arg1.field2783 = (byte) (12 - arg1.field2768);
                } else {
                    arg1.field2797 = 9;
                    arg1.field2768 = class86.field983[var23];
                    arg1.field2783 = (byte) (9 - arg1.field2768);
                }
                if ((var25.field5560 & var24) != 0 && !class167.method1132(var5, var2, var3, var25.field5560)) {
                    if (class263.field3752) {
                        class48.method276(arg0, var4, var2, var3);
                        class36.field422.method677(arg0.field1911, arg0.field1910);
                    }
                    class186 var27 = var25.method52((byte) -120, class36.field422);
                    if (var27 != null) {
                        var27.field2703 = var25;
                        var27.field2702 = var4;
                        var27.field2695 = var2;
                        var27.field2701 = var3;
                        class134.field1615.method2511(-126, var27);
                    }
                }
                class394 var28 = arg1.field2771;
                if (var28 != null && (var28.field5560 & var24) != 0 && !class167.method1132(var5, var2, var3, var28.field5560)) {
                    if (class263.field3752) {
                        class48.method276(arg0, var4, var2, var3);
                        class36.field422.method677(arg0.field1911, arg0.field1910);
                    }
                    class186 var29 = var28.method52((byte) -120, class36.field422);
                    if (var29 != null) {
                        var29.field2703 = var28;
                        var29.field2702 = var4;
                        var29.field2695 = var2;
                        var29.field2701 = var3;
                        class134.field1615.method2511(-7, var29);
                    }
                }
            }
            if (var26 != null && !class160.method1023(var5, var2, var3, var26.method278((byte) -94))) {
                class48 var30 = arg1.field2786;
                class36.field422.method691(3000.0F, (var10 - 0.5F) * 1.5F);
                if ((var26.field566 & var24) != 0) {
                    if (class263.field3752) {
                        class48.method276(arg0, var4, var2, var3);
                        class36.field422.method677(arg0.field1911, arg0.field1910);
                    }
                    class186 var31 = var26.method52((byte) -120, class36.field422);
                    if (var31 != null) {
                        var31.field2703 = var26;
                        var31.field2702 = var4;
                        var31.field2695 = var2;
                        var31.field2701 = var3;
                        class134.field1615.method2511(-118, var31);
                    }
                } else if (var26.field566 == 256) {
                    int var32 = var26.field577 - class113.field1380;
                    int var33 = var26.field571 - class54.field655;
                    int var34 = var26.field576;
                    int var35;
                    if (var34 == 1 || var34 == 2) {
                        var35 = -var32;
                    } else {
                        var35 = var32;
                    }
                    int var36;
                    if (var34 == 2 || var34 == 3) {
                        var36 = -var33;
                    } else {
                        var36 = var33;
                    }
                    if (class263.field3752) {
                        class48.method276(arg0, var4, var2, var3);
                        class36.field422.method677(arg0.field1911, arg0.field1910);
                    }
                    if (var36 < var35) {
                        class186 var37 = var26.method52((byte) -120, class36.field422);
                        if (var37 != null) {
                            var37.field2703 = var26;
                            var37.field2702 = var4;
                            var37.field2695 = var2;
                            var37.field2701 = var3;
                            class134.field1615.method2511(17, var37);
                        }
                    } else if (var30 != null) {
                        class186 var38 = var30.method52((byte) -120, class36.field422);
                        if (var38 != null) {
                            var38.field2703 = var30;
                            var38.field2702 = var4;
                            var38.field2695 = var2;
                            var38.field2701 = var3;
                            class134.field1615.method2511(119, var38);
                        }
                    }
                }
                class36.field422.method691(3000.0F, var10 * 1.5F);
            }
            if (var20) {
                class46 var39 = arg1.field2790;
                if (var39 != null && !var39.field553) {
                    if (var39.field561) {
                        class36.field422.method691(3000.0F, (var10 + 50.0F - 1.5F) * 1.5F);
                    }
                    if (class263.field3752) {
                        class48.method276(arg0, var4, var2, var3);
                        class36.field422.method677(arg0.field1911, arg0.field1910);
                    }
                    class186 var40 = var39.method52((byte) -120, class36.field422);
                    if (var40 != null) {
                        var40.field2703 = var39;
                        var40.field2702 = var4;
                        var40.field2695 = var2;
                        var40.field2701 = var3;
                        class134.field1615.method2511(-125, var40);
                    }
                    if (var39.field561) {
                        class36.field422.method691(3000.0F, var10 * 1.5F);
                    }
                }
                class212 var41 = arg1.field2769;
                if (var41 != null && !var41.field3018) {
                    if (class263.field3752) {
                        class48.method276(arg0, var4, var2, var3);
                        class36.field422.method677(arg0.field1911, arg0.field1910);
                    }
                    class186 var42 = var41.method52((byte) -120, class36.field422);
                    if (var42 != null) {
                        var42.field2703 = var41;
                        var42.field2702 = var4;
                        var42.field2695 = var2;
                        var42.field2701 = var3;
                        class134.field1615.method2511(2, var42);
                    }
                }
            }
            byte var43 = arg1.field2770;
            if (var43 != 0) {
                if (var2 < class444.field6379 && (var43 & 0x4) != 0) {
                    class193 var44 = var8[var2 + 1][var3];
                    if (var44 != null && var44.field2782) {
                        class144.field1782.method203(var44, false);
                    }
                }
                if (var3 < class137.field1706 && (var43 & 0x2) != 0) {
                    class193 var45 = var8[var2][var3 + 1];
                    if (var45 != null && var45.field2782) {
                        class144.field1782.method203(var45, false);
                    }
                }
                if (var2 > class444.field6379 && (var43 & 0x1) != 0) {
                    class193 var46 = var8[var2 - 1][var3];
                    if (var46 != null && var46.field2782) {
                        class144.field1782.method203(var46, false);
                    }
                }
                if (var3 > class137.field1706 && (var43 & 0x8) != 0) {
                    class193 var47 = var8[var2][var3 - 1];
                    if (var47 != null && var47.field2782) {
                        class144.field1782.method203(var47, false);
                    }
                }
            }
        }
        if (arg1.field2797 != 0) {
            boolean var48 = true;
            for (class250 var49 = arg1.field2779; var49 != null; var49 = var49.field3568) {
                if (class396.field5655 != var49.field3571.field3283 && (var49.field3565 & arg1.field2797) == arg1.field2768) {
                    var48 = false;
                    break;
                }
            }
            if (var48) {
                class394 var50 = arg1.field2784;
                if (!class167.method1132(var5, var2, var3, var50.field5560)) {
                    if (class263.field3752) {
                        label687: {
                            if (var50.field5560 >= 16) {
                                int var51 = var2 - class444.field6379;
                                int var52 = var3 - class137.field1706;
                                if (var50.field5560 == 16) {
                                    var51 -= 64;
                                    var52 += 64;
                                    if (var52 < var51 && var2 > 0 && var3 <= class299.field4190) {
                                        class48.method276(arg0, var4, var2 - 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field5560 == 32) {
                                    var51 += 64;
                                    var52 += 64;
                                    if (var52 < -var51 && var2 < class415.field5953 && var3 < class299.field4190) {
                                        class48.method276(arg0, var4, var2 + 1, var3 + 1);
                                        break label687;
                                    }
                                } else if (var50.field5560 == 64) {
                                    var51 += 64;
                                    var52 -= 64;
                                    if (var52 > var51 && var2 < class415.field5953 && var3 > 0) {
                                        class48.method276(arg0, var4, var2 + 1, var3 - 1);
                                        break label687;
                                    }
                                } else if (var50.field5560 == 128) {
                                    var51 -= 64;
                                    var52 -= 64;
                                    if (var52 > -var51 && var2 > 0 && var3 > 0) {
                                        class48.method276(arg0, var4, var2 - 1, var3 - 1);
                                        break label687;
                                    }
                                }
                            }
                            class48.method276(arg0, var4, var2, var3);
                        }
                        class36.field422.method677(arg0.field1911, arg0.field1910);
                    }
                    class186 var53 = var50.method52((byte) -120, class36.field422);
                    if (var53 != null) {
                        var53.field2703 = var50;
                        var53.field2702 = var4;
                        var53.field2695 = var2;
                        var53.field2701 = var3;
                        class134.field1615.method2511(-118, var53);
                    }
                }
                arg1.field2797 = 0;
            }
        }
        if (arg1.field2796) {
            try {
                arg1.field2796 = false;
                int var54 = 0;
                label630: for (class250 var55 = arg1.field2779; var55 != null; var55 = var55.field3568) {
                    class233 var56 = var55.field3571;
                    if (class396.field5655 != var56.field3283) {
                        for (int var57 = var56.field3268; var57 <= var56.field3275; var57++) {
                            for (int var58 = var56.field3267; var58 <= var56.field3271; var58++) {
                                class193 var59 = var8[var57][var58];
                                if (var59.field2795) {
                                    arg1.field2796 = true;
                                    continue label630;
                                }
                                if (var59.field2797 != 0) {
                                    int var60 = 0;
                                    if (var57 > var56.field3268) {
                                        var60++;
                                    }
                                    if (var57 < var56.field3275) {
                                        var60 += 4;
                                    }
                                    if (var58 > var56.field3267) {
                                        var60 += 8;
                                    }
                                    if (var58 < var56.field3271) {
                                        var60 += 2;
                                    }
                                    if ((var60 & var59.field2797) == arg1.field2783) {
                                        arg1.field2796 = true;
                                        continue label630;
                                    }
                                }
                            }
                        }
                        int var61 = class444.field6379 - var56.field3268;
                        int var62 = var56.field3275 - class444.field6379;
                        if (var62 > var61) {
                            var61 = var62;
                        }
                        int var63 = class137.field1706 - var56.field3267;
                        int var64 = var56.field3271 - class137.field1706;
                        if (var64 > var63) {
                            var63 = var64;
                        }
                        arg0.field1917[var54] = var56;
                        arg0.field1915[var54++] = var61 + var63;
                    }
                }
                while (var54 > 0) {
                    int var65 = -50;
                    int var66 = -1;
                    for (int var67 = 0; var67 < var54; var67++) {
                        class233 var68 = arg0.field1917[var67];
                        if (class396.field5655 != var68.field3283) {
                            int var69 = arg0.field1915[var67];
                            if (var69 > var65) {
                                var65 = var69;
                                var66 = var67;
                            } else if (var65 == var69) {
                                int var70 = var68.field3284 - class113.field1380;
                                int var71 = var68.field3269 - class54.field655;
                                int var72 = arg0.field1917[var66].field3284 - class113.field1380;
                                int var73 = arg0.field1917[var66].field3269 - class54.field655;
                                if (var70 * var70 + var71 * var71 > var72 * var72 + var73 * var73) {
                                    var66 = var67;
                                }
                            }
                        }
                    }
                    if (var66 == -1) {
                        break;
                    }
                    class233 var74 = arg0.field1917[var66];
                    var74.field3283 = class396.field5655;
                    if (!class278.method1835(var5, var74.field3268, var74.field3275, var74.field3267, var74.field3271, var74.method61(131910471))) {
                        if (class263.field3752) {
                            if (var74.field3270 == 0) {
                                class24.method170(arg0, var4, var74.field3268, var74.field3267, var74.field3275, var74.field3271);
                            } else {
                                class48.method276(arg0, var4, var2, var3);
                                int var75 = var2 - class444.field6379;
                                int var76 = var3 - class137.field1706;
                                if (var74.field3270 == 2) {
                                    if (var76 > -var75) {
                                        class63.method360(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class63.method360(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var76 > var75) {
                                    class63.method360(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class63.method360(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class36.field422.method677(arg0.field1911, arg0.field1910);
                        }
                        class186 var77 = var74.method52((byte) -120, class36.field422);
                        if (var77 != null) {
                            var77.field2703 = var74;
                            var77.field2702 = var4;
                            var77.field2695 = var74.field3268;
                            var77.field2701 = var74.field3267;
                            class134.field1615.method2511(-126, var77);
                        }
                    }
                    for (int var78 = var74.field3268; var78 <= var74.field3275; var78++) {
                        for (int var79 = var74.field3267; var79 <= var74.field3271; var79++) {
                            class193 var80 = var8[var78][var79];
                            if (var80.field2797 != 0) {
                                class144.field1782.method203(var80, false);
                            } else if ((var2 != var78 || var3 != var79) && var80.field2782) {
                                class144.field1782.method203(var80, false);
                            }
                        }
                    }
                }
                if (arg1.field2796) {
                    return;
                }
            } catch (Exception var113) {
                arg1.field2796 = false;
            }
        }
        if (arg1.field2785 != null) {
            if ((byte) (class432.field6220 & 0xFF) == arg1.field2778) {
                class63 var81 = arg1.field2785;
                int var82 = class161.field2122[var4].method328(var2, var3);
                int var83;
                if (var4 < 3) {
                    var83 = class161.field2122[var4].method328(var2, var3) - class161.field2122[var4 + 1].method328(var2, var3);
                } else {
                    var83 = 1024;
                }
                class382.field5377.method122(var6, var82, var7, arg0.field1909);
                int var84 = arg0.field1909[2];
                class382.field5377.method122(var6, var82 - var83, var7, arg0.field1909);
                int var85 = arg0.field1909[2];
                int var86 = var84;
                int var87 = var85;
                if (var84 > var85) {
                    var86 = var85;
                    var87 = var84;
                }
                var86 -= 91;
                var87 += 91;
                if (var86 < var87 - 1597) {
                    var86 = var87 - 1597;
                }
                var81.field726 = var86;
                var81.field727 = var87;
                var81.field728 = true;
                class36.field422.method630(var81);
            } else {
                arg1.field2785 = null;
            }
        }
        if (!arg1.field2782) {
            return;
        }
        if (arg1.field2797 != 0) {
            return;
        }
        if (var2 <= class444.field6379 && var2 > class216.field3050) {
            class193 var88 = var8[var2 - 1][var3];
            if (var88 != null && var88.field2782) {
                return;
            }
        }
        if (var2 >= class444.field6379 && var2 < class50.field605 - 1) {
            class193 var89 = var8[var2 + 1][var3];
            if (var89 != null && var89.field2782) {
                return;
            }
        }
        if (var3 <= class137.field1706 && var3 > class380.field5349) {
            class193 var90 = var8[var2][var3 - 1];
            if (var90 != null && var90.field2782) {
                return;
            }
        }
        if (var3 >= class137.field1706 && var3 < class161.field2129 - 1) {
            class193 var91 = var8[var2][var3 + 1];
            if (var91 != null && var91.field2782) {
                return;
            }
        }
        arg1.field2782 = false;
        class423.field6058--;
        class212 var92 = arg1.field2769;
        if (var92 != null && var92.field3018) {
            if (class263.field3752) {
                class48.method276(arg0, var4, var2, var3);
                class36.field422.method677(arg0.field1911, arg0.field1910);
            }
            class186 var93 = var92.method52((byte) -120, class36.field422);
            if (var93 != null) {
                var93.field2703 = var92;
                var93.field2702 = var4;
                var93.field2695 = var2;
                var93.field2701 = var3;
                class134.field1615.method2511(44, var93);
            }
        }
        if (arg1.field2776 != 0) {
            class48 var94 = arg1.field2788;
            if (var94 != null && !class160.method1023(var5, var2, var3, var94.method278((byte) -28))) {
                if ((var94.field566 & arg1.field2776) != 0) {
                    if (class263.field3752) {
                        class48.method276(arg0, var4, var2, var3);
                        class36.field422.method677(arg0.field1911, arg0.field1910);
                    }
                    class186 var95 = var94.method52((byte) -120, class36.field422);
                    if (var95 != null) {
                        var95.field2703 = var94;
                        var95.field2702 = var4;
                        var95.field2695 = var2;
                        var95.field2701 = var3;
                        class134.field1615.method2511(72, var95);
                    }
                } else if (var94.field566 == 256) {
                    int var96 = var94.field577 - class113.field1380;
                    int var97 = var94.field571 - class54.field655;
                    int var98 = var94.field576;
                    int var99;
                    if (var98 == 1 || var98 == 2) {
                        var99 = -var96;
                    } else {
                        var99 = var96;
                    }
                    int var100;
                    if (var98 == 2 || var98 == 3) {
                        var100 = -var97;
                    } else {
                        var100 = var97;
                    }
                    if (class263.field3752) {
                        class48.method276(arg0, var4, var2, var3);
                        class36.field422.method677(arg0.field1911, arg0.field1910);
                    }
                    class48 var101 = arg1.field2786;
                    if (var100 > var99) {
                        class186 var102 = var94.method52((byte) -120, class36.field422);
                        if (var102 != null) {
                            var102.field2703 = var94;
                            var102.field2702 = var4;
                            var102.field2695 = var2;
                            var102.field2701 = var3;
                            class134.field1615.method2511(64, var102);
                        }
                    } else if (var101 != null) {
                        class186 var103 = var101.method52((byte) -120, class36.field422);
                        if (var103 != null) {
                            var103.field2703 = var101;
                            var103.field2702 = var4;
                            var103.field2695 = var2;
                            var103.field2701 = var3;
                            class134.field1615.method2511(111, var103);
                        }
                    }
                }
            }
            class394 var104 = arg1.field2784;
            class394 var105 = arg1.field2771;
            if (var105 != null && (var105.field5560 & arg1.field2776) != 0 && !class167.method1132(var5, var2, var3, var105.field5560)) {
                if (class263.field3752) {
                    class273.method1799(arg0, var105.field5560, var4, var2, var3);
                    class36.field422.method677(arg0.field1911, arg0.field1910);
                }
                class186 var106 = var105.method52((byte) -120, class36.field422);
                if (var106 != null) {
                    var106.field2703 = var105;
                    var106.field2702 = var4;
                    var106.field2695 = var2;
                    var106.field2701 = var3;
                    class134.field1615.method2511(-120, var106);
                }
            }
            if (var104 != null && (var104.field5560 & arg1.field2776) != 0 && !class167.method1132(var5, var2, var3, var104.field5560)) {
                if (class263.field3752) {
                    class273.method1799(arg0, var104.field5560, var4, var2, var3);
                    class36.field422.method677(arg0.field1911, arg0.field1910);
                }
                class186 var107 = var104.method52((byte) -120, class36.field422);
                if (var107 != null) {
                    var107.field2703 = var104;
                    var107.field2702 = var4;
                    var107.field2695 = var2;
                    var107.field2701 = var3;
                    class134.field1615.method2511(-117, var107);
                }
            }
        }
        if (var4 < class167.field2334 - 1) {
            class193 var108 = class250.field3570[var4 + 1][var2][var3];
            if (var108 != null && var108.field2782) {
                class144.field1782.method205(11610, var108);
            }
        }
        if (var2 < class444.field6379) {
            class193 var109 = var8[var2 + 1][var3];
            if (var109 != null && var109.field2782) {
                class144.field1782.method203(var109, false);
            }
        }
        if (var3 < class137.field1706) {
            class193 var110 = var8[var2][var3 + 1];
            if (var110 != null && var110.field2782) {
                class144.field1782.method203(var110, false);
            }
        }
        if (var2 > class444.field6379) {
            class193 var111 = var8[var2 - 1][var3];
            if (var111 != null && var111.field2782) {
                class144.field1782.method203(var111, false);
            }
        }
        if (var3 > class137.field1706) {
            class193 var112 = var8[var2][var3 - 1];
            if (var112 != null && var112.field2782) {
                class144.field1782.method203(var112, false);
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIIIIB)V", line = 1344)
    public static final void method2800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field6475++;
        class219[] var7 = class360.field5138;
        if (arg6 != -89) {
            return;
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class219 var9 = var7[var8];
            if (var9 != null && var9.field3092 == 2) {
                class8.method50(-12, arg1 >> 1, (var9.field3088 - class114.field1403 << 7) + var9.field3079, arg2, var9.field3087 * 2, (var9.field3094 - class41.field496 << 7) + var9.field3082, arg3, arg4 >> 1);
                if (class207.field2955[0] > -1 && (class189.field2726 % 20) < 10) {
                    class46.field550[var9.field3081].method2446(class207.field2955[0] + arg5 - 12, arg0 - (-class207.field2955[1] - -28));
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(II)I", line = 1374)
    public static final int method2801(int arg0, int arg1) {
        field6467++;
        if (arg1 == 16711935) {
            return -1;
        } else {
            if (arg0 <= 116) {
                method2800(-5, -85, -41, -114, -9, 95, (byte) 114);
            }
            return class140.method858(arg1, (byte) 3);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)V", line = 1391)
    public static void method2802(byte arg0) {
        field6476 = null;
        field6471 = null;
        field6466 = null;
        if (arg0 != 11) {
            field6476 = null;
        }
    }
}
