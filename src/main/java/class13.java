import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class13 {

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "Loa;")
    public static class99 field118 = class221.method1463(2844, "<col=ffff00>");

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "J")
    public static long field122 = 0L;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field125 = -1;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "Loa;")
    public static class99 field127 = class221.method1463(2844, "; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0");

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "Loa;")
    public static class99 field116 = class221.method1463(2844, "Sprites geladen)3");

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "Ljava/awt/Font;")
    public static Font field120;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "[S")
    public static short[] field117;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "[[[B")
    public static byte[][][] field126;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "[[[I")
    public static int[][][] field114;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lik;Z)V")
    public static final void method85(class261 arg0, boolean arg1) {
        if (arg1) {
            method89(74);
        }
        field124++;
        for (int var2 = 0; var2 < class54.field884; var2++) {
            int var3 = arg0.method1742(-957401312);
            int var4 = arg0.method1740((byte) 97);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class146.field2588[var3] != null) {
                class146.field2588[var3].field4894 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIBI)V")
    public static final void method86(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        long var6 = class130.method857(arg0, arg3, arg1);
        if (var6 != 0L) {
            int var8 = Integer.MAX_VALUE & (int) (var6 >>> 32);
            class153 var9 = class247.method1601(26012, var8);
            int var10 = (int) var6 >> 14 & 0x1F;
            int var11 = (int) var6 >> 20 & 0x3;
            if (var9.field2687 == -1) {
                int var14 = arg2;
                if (var6 > 0L) {
                    var14 = arg5;
                }
                int var15 = (52736 - arg1 * 512) * 4 + arg3 * 4 + 24624;
                int[] var16 = class68.field1141;
                if (var10 == 0 || var10 == 2) {
                    if (var11 == 0) {
                        var16[var15] = var14;
                        var16[var15 + 512] = var14;
                        var16[var15 + 1024] = var14;
                        var16[var15 + 1536] = var14;
                    } else if (var11 == 1) {
                        var16[var15] = var14;
                        var16[var15 + 1] = var14;
                        var16[var15 + 2] = var14;
                        var16[var15 + 3] = var14;
                    } else if (var11 == 2) {
                        var16[var15 + 3] = var14;
                        var16[var15 + 3 + 512] = var14;
                        var16[var15 + 3 + 1024] = var14;
                        var16[var15 + 1536 + 3] = var14;
                    } else if (var11 == 3) {
                        var16[var15 + 1536] = var14;
                        var16[var15 + 1536 + 1] = var14;
                        var16[var15 + 1538] = var14;
                        var16[var15 + 1536 + 3] = var14;
                    }
                }
                if (var10 == 3) {
                    if (var11 == 0) {
                        var16[var15] = var14;
                    } else if (var11 == 1) {
                        var16[var15 + 3] = var14;
                    } else if (var11 == 2) {
                        var16[var15 + 3 + 1536] = var14;
                    } else if (var11 == 3) {
                        var16[var15 + 1536] = var14;
                    }
                }
                if (var10 == 2) {
                    if (var11 == 3) {
                        var16[var15] = var14;
                        var16[var15 + 512] = var14;
                        var16[var15 + 1024] = var14;
                        var16[var15 + 1536] = var14;
                    } else if (var11 == 0) {
                        var16[var15] = var14;
                        var16[var15 + 1] = var14;
                        var16[var15 + 2] = var14;
                        var16[var15 + 3] = var14;
                    } else if (var11 == 1) {
                        var16[var15 + 3] = var14;
                        var16[var15 + 512 + 3] = var14;
                        var16[var15 + 3 + 1024] = var14;
                        var16[var15 + 3 + 1536] = var14;
                    } else if (var11 == 2) {
                        var16[var15 + 1536] = var14;
                        var16[var15 + 1537] = var14;
                        var16[var15 + 1536 + 2] = var14;
                        var16[var15 + 3 + 1536] = var14;
                    }
                }
            } else {
                class109 var12 = null;
                int var13 = var9.field2704;
                if (!var9.field2744) {
                    var12 = class265.field4692[var9.field2687];
                } else if (var11 == 0) {
                    var12 = class265.field4692[var9.field2687];
                } else if (var11 == 1) {
                    var12 = class93.field1560[var9.field2687];
                    var13 = var9.field2717;
                } else if (var11 == 2) {
                    var12 = class290.field5095[var9.field2687];
                } else if (var11 == 3) {
                    var12 = class92.field1558[var9.field2687];
                    var13 = var9.field2717;
                }
                if (var12 != null) {
                    var12.method751(arg3 * 4 + 48, (-arg1 + -var13 + 104) * 4 + 48);
                }
            }
        }
        field115++;
        long var17 = class240.method1565(arg0, arg3, arg1);
        if (var17 != 0L) {
            int var19 = ((int) var17 & 0x7E593) >> 14;
            int var20 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            int var21 = (int) var17 >> 20 & 0x3;
            class153 var22 = class247.method1601(26012, var20);
            if (var22.field2687 != -1) {
                class109 var23 = null;
                int var24 = var22.field2704;
                if (!var22.field2744) {
                    var23 = class265.field4692[var22.field2687];
                } else if (var21 == 0) {
                    var23 = class265.field4692[var22.field2687];
                } else if (var21 == 1) {
                    var23 = class93.field1560[var22.field2687];
                    var24 = var22.field2717;
                } else if (var21 == 2) {
                    var23 = class290.field5095[var22.field2687];
                } else if (var21 == 3) {
                    var23 = class92.field1558[var22.field2687];
                    var24 = var22.field2717;
                }
                if (var23 != null) {
                    var23.method751(arg3 * 4 + 48, (-var24 + 104 + -arg1) * 4 + 48);
                }
            } else if (var19 == 9) {
                int var25 = arg3 * 4 + ((103 - arg1) * 4 * 512) + 24624;
                int[] var26 = class68.field1141;
                int var27 = 15658734;
                if (var17 > 0L) {
                    var27 = 15597568;
                }
                if (var21 == 0 || var21 == 2) {
                    var26[var25 + 1536] = var27;
                    var26[var25 + 1024 + 1] = var27;
                    var26[var25 + 512 + 2] = var27;
                    var26[var25 + 3] = var27;
                } else {
                    var26[var25] = var27;
                    var26[var25 + 513] = var27;
                    var26[var25 + 1024 + 2] = var27;
                    var26[var25 + 1536 + 3] = var27;
                }
            }
        }
        long var28 = class226.method1488(arg0, arg3, arg1);
        if (var28 != 0L) {
            int var30 = (int) (var28 >>> 32) & Integer.MAX_VALUE;
            class153 var31 = class247.method1601(arg4 + 26062, var30);
            int var32 = (int) var28 >> 20 & 0x3;
            if (var31.field2687 != -1) {
                class109 var33 = null;
                int var34 = var31.field2704;
                if (!var31.field2744) {
                    var33 = class265.field4692[var31.field2687];
                } else if (var32 == 0) {
                    var33 = class265.field4692[var31.field2687];
                } else if (var32 == 1) {
                    var33 = class93.field1560[var31.field2687];
                    var34 = var31.field2717;
                } else if (var32 == 2) {
                    var33 = class290.field5095[var31.field2687];
                } else if (var32 == 3) {
                    var34 = var31.field2717;
                    var33 = class92.field1558[var31.field2687];
                }
                if (var33 != null) {
                    var33.method751((arg3 * 4) + 48, (-var34 + 104 + -arg1) * 4 + 48);
                }
            }
        }
        if (arg4 != -50) {
            method87(92);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static final void method87(int arg0) {
        class171.method1150(10286);
        if (arg0 != -25731) {
            field118 = null;
        }
        field121++;
        class189.method1288(1);
        class250.method1618((byte) 104);
        class124.method820((byte) 110);
        class122.method809((byte) -27);
        class281.method1856(112);
        class135.method915(65536);
        class236.method1535(-32467);
        class214.method1435(-22565);
        class146.method992((byte) -80);
        class41.method313((byte) 56);
        class28.method243(104);
        class141.method952(73);
        class88.method604(true);
        class81.method560(0);
        class38.method294((byte) -84);
        ((class145) class134.field2338).method984((byte) -121);
        class82.field1438.method513(true);
        class119.field2112.method1236(arg0 ^ 0xFFFFE753);
        class260.field4535.method1236(31790);
        class138.field2430.method1236(31790);
        class271.field4788.method1236(arg0 + 57521);
        class269.field4732.method1236(arg0 + 57521);
        class227.field3923.method1236(31790);
        class9.field74.method1236(arg0 + 57521);
        class280.field4908.method1236(31790);
        class236.field4064.method1236(arg0 + 57521);
        class242.field4199.method1236(31790);
        class111.field2014.method1236(31790);
        class67.field1123.method1812(-84);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
    public static final void method88(byte arg0) {
        class142.field2499.method1551((byte) 14);
        class149.field2623.method1322(false);
        class23.field305.method1322(false);
        if (arg0 > -27) {
            field125 = -62;
        }
        field129++;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V")
    public static void method89(int arg0) {
        field114 = null;
        field126 = null;
        field117 = null;
        field116 = null;
        if (arg0 != 48) {
            field116 = null;
        }
        field120 = null;
        field118 = null;
        field127 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIZIZI)V")
    public static final void method90(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6) {
        if (arg5) {
            field117 = null;
        }
        class34.field610 = arg6;
        class23.field296 = arg0;
        class244.field4212 = arg1;
        class237.field4103 = arg2;
        class276.field4865 = arg4;
        field123++;
        if (arg3 && class276.field4865 >= 100) {
            class221.field3850 = class244.field4212 * 128 + 64;
            class2.field13 = class34.field610 * 128 + 64;
            class24.field367 = class115.method777(-1, class221.field3850, class255.field4407, class2.field13) - class237.field4103;
        }
        class141.field2481 = 2;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I[III[I)V")
    public static final void method91(int arg0, int[] arg1, int arg2, int arg3, int[] arg4) {
        if (arg0 <= 77) {
            field125 = -2;
        }
        field119++;
        if (arg2 <= arg3) {
            return;
        }
        int var5 = (arg2 + arg3) / 2;
        int var6 = arg3;
        int var7 = arg4[var5];
        arg4[var5] = arg4[arg2];
        arg4[arg2] = var7;
        int var8 = arg1[var5];
        arg1[var5] = arg1[arg2];
        arg1[arg2] = var8;
        for (int var9 = arg3; var9 < arg2; var9++) {
            if (((var9 & 0x1) + var7) < arg4[var9]) {
                int var10 = arg4[var9];
                arg4[var9] = arg4[var6];
                arg4[var6] = var10;
                int var11 = arg1[var9];
                arg1[var9] = arg1[var6];
                arg1[var6++] = var11;
            }
        }
        arg4[arg2] = arg4[var6];
        arg4[var6] = var7;
        arg1[arg2] = arg1[var6];
        arg1[var6] = var8;
        method91(109, arg1, var6 - 1, arg3, arg4);
        method91(94, arg1, arg2, var6 + 1, arg4);
    }
}
