import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public abstract class class521 {

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
    public int field7695 = 127;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
    public int field7693 = 0;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "Z")
    public boolean field7696 = true;

    @OriginalMember(owner = "client!fv", name = "m", descriptor = "I")
    public int field7704 = 127;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "I")
    public int field7702 = 2;

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
    public int field7698 = 3;

    @OriginalMember(owner = "client!fv", name = "r", descriptor = "I")
    public int field7709 = 0;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "Z")
    public boolean field7697 = false;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "Z")
    public boolean field7699 = true;

    @OriginalMember(owner = "client!fv", name = "q", descriptor = "Z")
    public boolean field7708 = true;

    @OriginalMember(owner = "client!fv", name = "l", descriptor = "Z")
    public boolean field7703 = false;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    public int field7701 = 0;

    @OriginalMember(owner = "client!fv", name = "u", descriptor = "I")
    public int field7712 = 255;

    @OriginalMember(owner = "client!fv", name = "x", descriptor = "Z")
    public boolean field7715 = true;

    @OriginalMember(owner = "client!fv", name = "C", descriptor = "Z")
    public boolean field7720 = true;

    @OriginalMember(owner = "client!fv", name = "B", descriptor = "Z")
    public boolean field7719 = true;

    @OriginalMember(owner = "client!fv", name = "w", descriptor = "Z")
    public boolean field7714 = true;

    @OriginalMember(owner = "client!fv", name = "I", descriptor = "I")
    public int field7725 = 1;

    @OriginalMember(owner = "client!fv", name = "E", descriptor = "Z")
    public boolean field7722 = true;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "Z")
    public boolean field7694 = true;

    @OriginalMember(owner = "client!fv", name = "J", descriptor = "Z")
    public boolean field7726 = false;

    @OriginalMember(owner = "client!fv", name = "A", descriptor = "I")
    public int field7718 = 0;

    @OriginalMember(owner = "client!fv", name = "v", descriptor = "Z")
    public boolean field7713 = true;

    @OriginalMember(owner = "client!fv", name = "y", descriptor = "I")
    public int field7716 = 2;

    @OriginalMember(owner = "client!fv", name = "n", descriptor = "Z")
    public boolean field7705 = true;

    @OriginalMember(owner = "client!fv", name = "L", descriptor = "I")
    public int field7728 = 0;

    @OriginalMember(owner = "client!fv", name = "K", descriptor = "I")
    public int field7727 = 2;

    @OriginalMember(owner = "client!fv", name = "N", descriptor = "I")
    public int field7730 = 2;

    @OriginalMember(owner = "client!fv", name = "G", descriptor = "Z")
    public boolean field7723 = true;

    @OriginalMember(owner = "client!fv", name = "O", descriptor = "I")
    public int field7731 = 0;

    @OriginalMember(owner = "client!fv", name = "t", descriptor = "I")
    public int field7711 = 0;

    @OriginalMember(owner = "client!fv", name = "P", descriptor = "Loi;")
    public static class169 field7732 = new class169("You can't add yourself to your own friend list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!fv", name = "R", descriptor = "[S")
    public static short[] field7734 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!fv", name = "Q", descriptor = "Lpi;")
    public static class340 field7733 = new class340(89, 9);

    @OriginalMember(owner = "client!fv", name = "S", descriptor = "[I")
    public static int[] field7735 = new int[8];

    @OriginalMember(owner = "client!fv", name = "U", descriptor = "B")
    public static byte field7737;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "I")
    public static int field7700;

    @OriginalMember(owner = "client!fv", name = "z", descriptor = "I")
    public static int field7717;

    @OriginalMember(owner = "client!fv", name = "D", descriptor = "I")
    public static int field7721;

    @OriginalMember(owner = "client!fv", name = "H", descriptor = "I")
    public static int field7724;

    @OriginalMember(owner = "client!fv", name = "M", descriptor = "I")
    public static int field7729;

    @OriginalMember(owner = "client!fv", name = "o", descriptor = "Z")
    public boolean field7706;

    @OriginalMember(owner = "client!fv", name = "p", descriptor = "Z")
    public boolean field7707;

    @OriginalMember(owner = "client!fv", name = "s", descriptor = "Z")
    public boolean field7710;

    @OriginalMember(owner = "client!fv", name = "T", descriptor = "[[Las;")
    public static class17[][] field7736;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(BI)I")
    public final int method3097(byte arg0, int arg1) {
        field7700++;
        if (arg0 < 112) {
            method3103((byte) -40);
        }
        return arg1 == 1 || arg1 == 3 ? this.field7716 : this.field7711;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
    public static void method3098(int arg0) {
        field7732 = null;
        field7735 = null;
        field7734 = null;
        if (arg0 < 60) {
            method3099(117);
        }
        field7733 = null;
        field7736 = null;
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)I")
    public static final int method3099(int arg0) {
        field7721++;
        if (arg0 != -2378) {
            field7732 = null;
        }
        class11 var1 = class286.field3657;
        synchronized (class286.field3657) {
            return class286.field3657.method86((byte) -14);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIB)V")
    public final void method3100(int arg0, int arg1, byte arg2) {
        if (arg0 == 1 || arg0 == 3) {
            this.field7716 = arg1;
        } else {
            this.field7711 = arg1;
        }
        field7729++;
        if (arg2 < 104) {
            this.field7702 = -51;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(BIZ)V")
    public final void method3101(byte arg0, int arg1, boolean arg2) {
        field7717++;
        if (arg1 == 1 || arg1 == 3) {
            this.field7710 = arg2;
        } else {
            this.field7706 = arg2;
        }
        if (arg0 < 119) {
            method3103((byte) -91);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(IB)Z")
    public final boolean method3102(int arg0, byte arg1) {
        field7724++;
        if (arg1 == 48) {
            return arg0 == 1 || arg0 == 3 ? this.field7710 : this.field7706;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V")
    public static final void method3103(byte arg0) {
        if (class311.field4022 > 0) {
            class311.field4022--;
        }
        if (class285.field3634 > 1) {
            class259.field3282 = class165.field2140;
            class285.field3634--;
        }
        field7692++;
        if (class360.field4665) {
            class360.field4665 = false;
            class152.method1046((byte) -64);
            return;
        }
        if (!class450.field6267) {
            class57.method326((byte) -62);
        }
        for (int var1 = 0; var1 < 100 && class169.method1129((byte) 103); var1++) {
        }
        if (class65.field821 != 30) {
            return;
        }
        class477.method2864(class225.field2923.method1564((byte) 93), true, class319.field4112);
        if (class282.field3609 == null) {
            if (class423.field5828 <= class173.method1134(true)) {
                class282.field3609 = class339.field4332.method2518(class385.field5066, 114);
            }
        } else if (class282.field3609.field3152 != -1) {
            class420.method2472((byte) -101, class242.field3107);
            class319.field4112.method609(class282.field3609.field3152, -96);
            class282.field3609 = null;
            class423.field5828 = class173.method1134(true) + 30000L;
        }
        class228 var2 = (class228) class61.field792.method49(-117);
        if (var2 != null || (class173.method1134(true) - 2000L) > class138.field1843) {
            boolean var3 = false;
            int var4 = class319.field4112.field1176;
            for (class228 var5 = (class228) class446.field6205.method49(114); var5 != null && class319.field4112.field1176 - var4 < 240; var5 = (class228) class446.field6205.method46((byte) 86)) {
                var5.method3021(120);
                int var6 = var5.method1442((byte) 71);
                if (var6 < 0) {
                    var6 = 0;
                } else if (var6 > 65534) {
                    var6 = 65534;
                }
                int var7 = var5.method1444(-105);
                if (var7 < 0) {
                    var7 = 0;
                } else if (var7 > 65534) {
                    var7 = 65534;
                }
                boolean var8 = false;
                if (var5.method1442((byte) 71) == -1 && var5.method1444(-120) == -1) {
                    var8 = true;
                    var6 = -1;
                    var7 = -1;
                }
                if (class443.field6161 != var7 || class293.field3803 != var6) {
                    if (!var3) {
                        class24.field426++;
                        class420.method2472((byte) -101, class161.field2101);
                        class319.field4112.method565(-74, 0);
                        var3 = true;
                        var4 = class319.field4112.field1176;
                    }
                    int var9 = var7 - class443.field6161;
                    class443.field6161 = var7;
                    int var10 = var6 - class293.field3803;
                    class293.field3803 = var6;
                    int var11 = (int) ((var5.method1440(-119) - class138.field1843) / 20L);
                    if (var11 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                        var10 += 32;
                        var9 += 32;
                        class319.field4112.method609((var9 << 6) + (var11 << 12) + var10, -78);
                    } else if (var11 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                        var10 += 128;
                        class319.field4112.method565(93, var11 + 128);
                        var9 += 128;
                        class319.field4112.method609((var9 << 8) + var10, -86);
                    } else if (var11 < 32) {
                        class319.field4112.method565(74, var11 + 192);
                        if (var8) {
                            class319.field4112.method572(-127, Integer.MIN_VALUE);
                        } else {
                            class319.field4112.method572(-125, var6 << 16 | var7);
                        }
                    } else {
                        class319.field4112.method609(var11 + 57344, -123);
                        if (var8) {
                            class319.field4112.method572(-117, Integer.MIN_VALUE);
                        } else {
                            class319.field4112.method572(-122, var7 | var6 << 16);
                        }
                    }
                    class138.field1843 = var5.method1440(-124);
                }
            }
            if (var3) {
                class319.field4112.method557(class319.field4112.field1176 - var4, false);
            }
        }
        if (var2 != null) {
            long var12 = (var2.method1440(-118) - class130.field1778) / 50L;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            class130.field1778 = var2.method1440(-120);
            int var14 = var2.method1442((byte) 71);
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = var2.method1444(-106);
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (var2.method1439(-121) == 2) {
                var16 = 1;
            }
            class420.method2472((byte) -101, class127.field1734);
            int var17 = (int) var12;
            class258.field3263++;
            class319.field4112.method566(-12633, var17 | var16 << 15);
            class319.field4112.method572(-118, var15 | var14 << 16);
        }
        if (class437.field5995 > 0) {
            int var18 = 0;
            for (int var19 = 0; var19 < class437.field5995; var19++) {
                if (class171.field2216[var19].method1056((byte) -86)) {
                    var18++;
                }
            }
            if (var18 > 0) {
                if (var18 > 75) {
                    var18 = 75;
                }
                class420.method2472((byte) -101, class325.field4176);
                class176.field2249++;
                class319.field4112.method565(53, var18 * 3);
                for (int var20 = 0; var20 < class437.field5995; var20++) {
                    class156 var21 = class171.field2216[var20];
                    if (var21.method1056((byte) 104)) {
                        long var22 = (var21.method1055(28633) - class19.field329) / 50L;
                        if (var22 > 65535L) {
                            var22 = 65535L;
                        }
                        class19.field329 = var21.method1055(28633);
                        class319.field4112.method565(92, var21.method1057((byte) -114));
                        class319.field4112.method609((int) var22, -97);
                    }
                }
            }
        }
        if (class197.field2546 > 0) {
            class197.field2546--;
        }
        if (class267.field3387 && class197.field2546 <= 0) {
            class197.field2546 = 20;
            class267.field3387 = false;
            class356.field4568++;
            class420.method2472((byte) -101, class192.field2488);
            class319.field4112.method566(-12633, (int) class244.field3138 >> 3);
            class319.field4112.method609((int) class163.field2110 >> 3, -63);
        }
        if (class35.field546 && !class407.field5453) {
            class360.field4653++;
            class407.field5453 = true;
            class420.method2472((byte) -101, class421.field5639);
            class319.field4112.method565(-86, 1);
        }
        if (!class35.field546 && class407.field5453) {
            class407.field5453 = false;
            class360.field4653++;
            class420.method2472((byte) -101, class421.field5639);
            class319.field4112.method565(82, 0);
        }
        if (!class461.field6449) {
            class85.field1150++;
            class420.method2472((byte) -101, class406.field5438);
            class319.field4112.method565(86, 0);
            int var24 = class319.field4112.field1176;
            class88 var25 = class421.field5647.method650(true);
            class319.field4112.method590(var25.field1176, -1, var25.field1223, 0);
            class319.field4112.method557(class319.field4112.field1176 - var24, false);
            class461.field6449 = true;
        }
        if (class470.field6877 != null) {
            if (class396.field5271 == 2) {
                class307.method1832(14235);
            } else if (class396.field5271 == 3) {
                class6.method34(false);
            }
        }
        if (class352.field4498) {
            class352.field4498 = false;
        } else {
            class36.field553 /= 2.0F;
        }
        if (class418.field5561) {
            class418.field5561 = false;
        } else {
            class183.field2409 /= 2.0F;
        }
        class359.method2114(8);
        if (class65.field821 != 30) {
            return;
        }
        class163.method1084(true);
        class520.method3094(false);
        class24.method163((byte) 127);
        class389.method2324(-234);
        class439.field6112++;
        if (class439.field6112 > 750) {
            class152.method1046((byte) -64);
            return;
        }
        class437.method2579(4);
        class412.method2434(3863);
        class92.method632((byte) 58);
        for (int var26 = class198.field2555.method1215(true, (byte) -127); var26 != -1; var26 = class198.field2555.method1215(false, (byte) -125)) {
            class376.method2195(90, var26);
            class328.field4216[class60.method339(31, class14.field238++)] = var26;
        }
        for (class436 var27 = class44.method283((byte) 96); var27 != null; var27 = class44.method283((byte) 96)) {
            int var28 = var27.method2569(-66);
            int var29 = var27.method2573(63);
            if (var28 == 1) {
                class276.field3537[var29] = var27.field5980;
                class374.field4865 |= class346.field4415[var29];
                class30.field500[class60.method339(class316.field4075++, 31)] = var29;
            } else if (var28 == 2) {
                class340.field4341[var29] = var27.field5975;
                class283.field3621[class60.method339(31, class223.field2873++)] = var29;
            } else if (var28 == 3) {
                class423 var30 = class497.method2965(0, var29);
                if (!var27.field5975.equals(var30.field5758)) {
                    var30.field5758 = var27.field5975;
                    class415.method2440(10, var30);
                }
            } else if (var28 == 4) {
                class423 var31 = class497.method2965(0, var29);
                int var32 = var27.field5980;
                int var33 = var27.field5977;
                int var34 = var27.field5979;
                if (var31.field5727 != var32 || var31.field5677 != var33 || var31.field5760 != var34) {
                    var31.field5760 = var34;
                    var31.field5727 = var32;
                    var31.field5677 = var33;
                    class415.method2440(10, var31);
                }
            } else if (var28 == 5) {
                class423 var51 = class497.method2965(0, var29);
                if (var27.field5980 != var51.field5792 || var27.field5980 == -1) {
                    var51.field5691 = 0;
                    var51.field5807 = 1;
                    var51.field5667 = 0;
                    var51.field5792 = var27.field5980;
                    class415.method2440(10, var51);
                }
            } else if (var28 == 6) {
                int var45 = var27.field5980;
                int var46 = (var45 & 0x7CEE) >> 10;
                int var47 = var45 >> 5 & 0x1F;
                int var48 = var45 & 0x1F;
                int var49 = (var47 << 11) + (var46 << 19) + (var48 << 3);
                class423 var50 = class497.method2965(0, var29);
                if (var50.field5728 != var49) {
                    var50.field5728 = var49;
                    class415.method2440(10, var50);
                }
            } else if (var28 == 7) {
                class423 var43 = class497.method2965(0, var29);
                boolean var44 = var27.field5980 == 1;
                if (var43.field5672 != var44) {
                    var43.field5672 = var44;
                    class415.method2440(10, var43);
                }
            } else if (var28 == 8) {
                class423 var35 = class497.method2965(0, var29);
                if (var27.field5980 != var35.field5669 || var27.field5977 != var35.field5766 || var27.field5979 != var35.field5762) {
                    var35.field5762 = var27.field5979;
                    var35.field5766 = var27.field5977;
                    var35.field5669 = var27.field5980;
                    if (var35.field5763 != -1) {
                        if (var35.field5796 > 0) {
                            var35.field5762 = var35.field5762 * 32 / var35.field5796;
                        } else if (var35.field5700 > 0) {
                            var35.field5762 = var35.field5762 * 32 / var35.field5700;
                        }
                    }
                    class415.method2440(10, var35);
                }
            } else if (var28 == 9) {
                class423 var36 = class497.method2965(0, var29);
                if (var27.field5980 != var36.field5763 || var27.field5977 != var36.field5753) {
                    var36.field5763 = var27.field5980;
                    var36.field5753 = var27.field5977;
                    class415.method2440(10, var36);
                }
            } else if (var28 == 10) {
                class423 var37 = class497.method2965(0, var29);
                if (var27.field5980 != var37.field5795 || var27.field5977 != var37.field5670 || var27.field5979 != var37.field5773) {
                    var37.field5795 = var27.field5980;
                    var37.field5670 = var27.field5977;
                    var37.field5773 = var27.field5979;
                    class415.method2440(10, var37);
                }
            } else if (var28 == 11) {
                class423 var38 = class497.method2965(0, var29);
                var38.field5751 = 0;
                var38.field5808 = var38.field5757 = var27.field5980;
                var38.field5788 = 0;
                var38.field5802 = var38.field5752 = var27.field5977;
                class415.method2440(10, var38);
            } else if (var28 == 12) {
                class423 var41 = class497.method2965(0, var29);
                int var42 = var27.field5980;
                if (var41 != null && var41.field5741 == 0) {
                    if ((var41.field5768 - var41.field5726) < var42) {
                        var42 = var41.field5768 - var41.field5726;
                    }
                    if (var42 < 0) {
                        var42 = 0;
                    }
                    if (var41.field5686 != var42) {
                        var41.field5686 = var42;
                        class415.method2440(10, var41);
                    }
                }
            } else if (var28 == 14) {
                class423 var40 = class497.method2965(0, var29);
                var40.field5703 = var27.field5980;
            } else if (var28 == 15) {
                class429.field5919 = var27.field5980;
                class138.field1847 = var27.field5977;
                class403.field5425 = true;
            } else if (var28 == 16) {
                class423 var39 = class497.method2965(0, var29);
                var39.field5821 = var27.field5980;
            }
        }
        class314.field4050++;
        if (class21.field407 != 0) {
            class267.field3382 += 20;
            if (class267.field3382 >= 400) {
                class21.field407 = 0;
            }
        }
        if (class147.field1944 != null) {
            class486.field7061++;
            if (class486.field7061 >= 15) {
                class415.method2440(10, class147.field1944);
                class147.field1944 = null;
            }
        }
        class141.field1871 = false;
        class14.field240 = null;
        class218.field2785 = false;
        class502.field7383 = null;
        class235.method1500(null, -1, -1, 60);
        class245.method1535(null, -1, -1, 126);
        if (!class515.field7573) {
            class501.field7364 = -1;
        }
        class426.method2523(-1344);
        class165.field2140++;
        if (class189.field2477) {
            class473.field6909++;
            class420.method2472((byte) -101, class501.field7372);
            class319.field4112.method572(-105, class426.field5848 | class272.field3457 << 28 | class88.field1196 << 14);
            class189.field2477 = false;
        }
        while (true) {
            class195 var52;
            class423 var53;
            class423 var54;
            do {
                var52 = (class195) class212.field2722.method52((byte) -126);
                if (var52 == null) {
                    while (true) {
                        class195 var55;
                        class423 var56;
                        class423 var57;
                        do {
                            var55 = (class195) class115.field1627.method52((byte) -124);
                            if (var55 == null) {
                                while (true) {
                                    class195 var58;
                                    class423 var59;
                                    class423 var60;
                                    do {
                                        var58 = (class195) class243.field3114.method52((byte) -107);
                                        if (var58 == null) {
                                            if (class14.field240 == null) {
                                                class142.field1882 = 0;
                                            }
                                            if (class465.field6838 != null) {
                                                class510.method3029(-8);
                                            }
                                            if (class363.field4685 > 0 && class439.field6113.method1488((byte) 100, 82) && class439.field6113.method1488((byte) 60, 81) && class458.field6411 != 0) {
                                                int var61 = class37.field573.field6220 - class458.field6411;
                                                if (var61 < 0) {
                                                    var61 = 0;
                                                } else if (var61 > 3) {
                                                    var61 = 3;
                                                }
                                                class195.method1264(var61, 0, class336.field4299 + class37.field573.field5251[0], class35.field545 - -class37.field573.field5246[0]);
                                            }
                                            class445.method2638((byte) 33);
                                            for (int var62 = 0; var62 < 5; var62++) {
                                                int var10002 = class372.field4832[var62]++;
                                            }
                                            if (class374.field4865 && (class173.method1134(true) - 60000L) > class491.field7173) {
                                                class502.method2997((byte) -24);
                                            }
                                            class289.field3696++;
                                            if (class289.field3696 > 500) {
                                                class289.field3696 = 0;
                                                int var63 = (int) (Math.random() * 8.0D);
                                                if ((var63 & 0x2) == 2) {
                                                    class225.field2920 += class488.field7092;
                                                }
                                                if ((var63 & 0x4) == 4) {
                                                    class82.field1021 += class202.field2649;
                                                }
                                                if ((var63 & 0x1) == 1) {
                                                    class481.field7006 += class157.field2074;
                                                }
                                            }
                                            if (class481.field7006 < -50) {
                                                class157.field2074 = 2;
                                            }
                                            if (class225.field2920 < -55) {
                                                class488.field7092 = 2;
                                            }
                                            if (class481.field7006 > 50) {
                                                class157.field2074 = -2;
                                            }
                                            if (class225.field2920 > 55) {
                                                class488.field7092 = -2;
                                            }
                                            if (class82.field1021 < -40) {
                                                class202.field2649 = 1;
                                            }
                                            if (class82.field1021 > 40) {
                                                class202.field2649 = -1;
                                            }
                                            class472.field6898++;
                                            if (class472.field6898 > 500) {
                                                class472.field6898 = 0;
                                                int var64 = (int) (Math.random() * 8.0D);
                                                if ((var64 & 0x2) == 2) {
                                                    class364.field4694 += class188.field2471;
                                                }
                                                if ((var64 & 0x1) == 1) {
                                                    class446.field6192 += class234.field3047;
                                                }
                                            }
                                            if (class446.field6192 < -60) {
                                                class234.field3047 = 2;
                                            }
                                            if (class364.field4694 < -20) {
                                                class188.field2471 = 1;
                                            }
                                            if (class446.field6192 > 60) {
                                                class234.field3047 = -2;
                                            }
                                            if (class364.field4694 > 10) {
                                                class188.field2471 = -1;
                                            }
                                            if (arg0 >= -56) {
                                                return;
                                            }
                                            class30.field501++;
                                            if (class30.field501 > 50) {
                                                class420.method2472((byte) -101, class54.field744);
                                                class321.field4130++;
                                            }
                                            if (class27.field471) {
                                                class457.method2704((byte) 40);
                                                class27.field471 = false;
                                            }
                                            try {
                                                if (class286.field3643 != null && class319.field4112.field1176 > 0) {
                                                    class117.field1638 += class319.field4112.field1176;
                                                    class286.field3643.method1001(0, (byte) -8, class319.field4112.field1223, class319.field4112.field1176);
                                                    class30.field501 = 0;
                                                    class319.field4112.field1176 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var65) {
                                                class152.method1046((byte) -64);
                                                return;
                                            }
                                        }
                                        var59 = var58.field2516;
                                        if (var59.field5756 < 0) {
                                            break;
                                        }
                                        var60 = class497.method2965(0, var59.field5823);
                                    } while (var60 == null || var60.field5679 == null || var60.field5679.length <= var59.field5756 || var60.field5679[var59.field5756] != var59);
                                    class490.method2928(var58);
                                }
                            }
                            var56 = var55.field2516;
                            if (var56.field5756 < 0) {
                                break;
                            }
                            var57 = class497.method2965(0, var56.field5823);
                        } while (var57 == null || var57.field5679 == null || var57.field5679.length <= var56.field5756 || var57.field5679[var56.field5756] != var56);
                        class490.method2928(var55);
                    }
                }
                var53 = var52.field2516;
                if (var53.field5756 < 0) {
                    break;
                }
                var54 = class497.method2965(0, var53.field5823);
            } while (var54 == null || var54.field5679 == null || var53.field5756 >= var54.field5679.length || var54.field5679[var53.field5756] != var53);
            class490.method2928(var52);
        }
    }
}
