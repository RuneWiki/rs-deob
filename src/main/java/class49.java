import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class49 {

    @OriginalMember(owner = "client!ed", name = "w", descriptor = "I")
    private int field720 = 0;

    @OriginalMember(owner = "client!ed", name = "u", descriptor = "I")
    public int field718;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "[Lai;")
    public class206[] field709;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!ed", name = "p", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!ed", name = "q", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!ed", name = "r", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!ed", name = "s", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!ed", name = "t", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "J")
    private long field699;

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "Lai;")
    private class206 field705;

    @OriginalMember(owner = "client!ed", name = "v", descriptor = "Lai;")
    private class206 field719;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Lhi;")
    public static class26 field701;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B[Lai;)I", line = 7)
    public final int method308(byte arg0, class206[] arg1) {
        field698++;
        int var3 = 0;
        if (arg0 > -102) {
            this.method310(-126);
        }
        for (int var4 = 0; var4 < this.field718; var4++) {
            class206 var5 = this.field709[var4];
            for (class206 var6 = var5.field3492; var6 != var5; var6 = var6.field3492) {
                arg1[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lai;JI)V", line = 38)
    public final void method309(class206 arg0, long arg1, int arg2) {
        if (arg0.field3495 != null) {
            arg0.method1444((byte) 89);
        }
        field716++;
        class206 var5 = this.field709[(int) ((long) (this.field718 - arg2) & arg1)];
        arg0.field3499 = arg1;
        arg0.field3495 = var5.field3495;
        arg0.field3492 = var5;
        arg0.field3495.field3492 = arg0;
        arg0.field3492.field3495 = arg0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)Lai;", line = 56)
    public final class206 method310(int arg0) {
        field714++;
        if (this.field705 == null) {
            return null;
        }
        class206 var2 = this.field709[(int) ((long) (this.field718 - 1) & this.field699)];
        while (this.field705 != var2) {
            if (this.field705.field3499 == this.field699) {
                class206 var3 = this.field705;
                this.field705 = this.field705.field3492;
                return var3;
            }
            this.field705 = this.field705.field3492;
        }
        if (arg0 < 126) {
            return (class206) null;
        } else {
            this.field705 = null;
            return null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BJ)Lai;", line = 93)
    public final class206 method311(byte arg0, long arg1) {
        field700++;
        this.field699 = arg1;
        class206 var4 = this.field709[(int) ((long) (this.field718 - 1) & arg1)];
        this.field705 = var4.field3492;
        if (arg0 != 114) {
            return (class206) null;
        }
        while (this.field705 != var4) {
            if (this.field705.field3499 == arg1) {
                class206 var5 = this.field705;
                this.field705 = this.field705.field3492;
                return var5;
            }
            this.field705 = this.field705.field3492;
        }
        this.field705 = null;
        return null;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(I)I", line = 122)
    public final int method312(int arg0) {
        field713++;
        int var2 = -22 % ((46 - arg0) / 50);
        int var3 = 0;
        for (int var4 = 0; var4 < this.field718; var4++) {
            class206 var5 = this.field709[var4];
            for (class206 var6 = var5.field3492; var6 != var5; var6 = var6.field3492) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III[[[BIBII)V", line = 153)
    public static final void method313(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class187.field2992++;
        class293.field4983 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class278.field4777; var12 < class164.field2669; var12++) {
            class166[][] var13 = class256.field4320[var12];
            for (int var14 = field715; var14 < class108.field1752; var14++) {
                for (int var15 = class127.field2104; var15 < class164.field2671; var15++) {
                    class166 var16 = var13[var14][var15];
                    if (var16 != null) {
                        if (class308.field5290[var14 + class1.field9 - class36.field480][var15 + class1.field9 - class24.field264] && arg3 == null || var12 < arg4 || arg3[var12][var14][var15] != arg5) {
                            var16.field2729 = true;
                            var16.field2714 = true;
                            if (var16.field2724 > 0) {
                                var16.field2730 = true;
                            } else {
                                var16.field2730 = false;
                            }
                            class293.field4983++;
                        } else {
                            var16.field2729 = false;
                            var16.field2714 = false;
                            var16.field2723 = 0;
                            if (var14 >= var8 && var14 <= var9 && var15 >= var10 && var15 <= var11) {
                                if (var16.field2706 != null) {
                                    class54 var17 = var16.field2706;
                                    var17.field786.method939(var17.field793, var17.field784, var17.field784, var17.field793, (byte) 95);
                                    if (var17.field788 != null) {
                                        var17.field788.method939(var17.field793, var17.field784, var17.field784, var17.field793, (byte) 33);
                                    }
                                }
                                if (var16.field2720 != null) {
                                    class268 var18 = var16.field2720;
                                    var18.field4559.method939(var18.field4556, var18.field4549, var18.field4549, var18.field4556, (byte) -107);
                                    if (var18.field4552 != null) {
                                        var18.field4552.method939(var18.field4556, var18.field4549, var18.field4549, var18.field4556, (byte) -114);
                                    }
                                }
                                if (var16.field2711 != null) {
                                    class32 var19 = var16.field2711;
                                    var19.field443.method939(var19.field430, var19.field434, var19.field434, var19.field430, (byte) 86);
                                }
                                if (var16.field2713 != null) {
                                    for (int var20 = 0; var20 < var16.field2724; var20++) {
                                        class164 var21 = var16.field2713[var20];
                                        var21.field2672.method939(var21.field2661, var21.field2657, var21.field2670, var21.field2651, (byte) 90);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var22 = class41.field632 == class37.field569;
        GL var23 = class154.field2479;
        var23.glPushMatrix();
        var23.glTranslatef((float) (-arg0), (float) (-arg1), (float) (-arg2));
        if (var22) {
            class39.method265();
            class135.method1024(3, -2, -1);
            class195.field3304 = true;
            class273.method1868();
            class191.field3050 = -1;
            class131.field2129 = -1;
            for (int var24 = 0; var24 < class101.field1662[0].length; var24++) {
                class224 var25 = class101.field1662[0][var24];
                float var26 = 251.5F - (var25.field3890 ? 1.0F : 0.5F);
                if (class191.field3050 != var25.field3910) {
                    class191.field3050 = var25.field3910;
                    class153.method1095(-35, var25.field3910);
                    class179.method1253(class205.method1427(91));
                }
                var25.method1593(class256.field4320, var26, false);
            }
            class273.method1870();
        } else {
            for (int var27 = class278.field4777; var27 < class164.field2669; var27++) {
                for (int var28 = 0; var28 < class101.field1662[var27].length; var28++) {
                    class224 var29 = class101.field1662[var27][var28];
                    float var30 = 201.5F - (float) var27 * 50.0F - (var29.field3890 ? 1.0F : 0.5F);
                    if (var29.field3916 != -1 && class23.field248.method192(var29.field3916, 255) == 4 && class72.field1107) {
                        class153.method1095(-37, var29.field3910);
                    }
                    var29.method1593(class256.field4320, var30, false);
                }
                if (var27 == 0 && class301.field5179 > 0) {
                    class154.method1112(101.5F);
                    class168.method1198(class36.field480, class24.field264, class1.field9, arg1, class308.field5290, class37.field569[0]);
                }
            }
            class117.method916(class36.field480, class24.field264, class256.field4320);
        }
        var23.glPopMatrix();
        for (int var31 = class278.field4777; var31 < class164.field2669; var31++) {
            class166[][] var32 = class256.field4320[var31];
            for (int var33 = -class1.field9; var33 <= 0; var33++) {
                int var34 = class36.field480 + var33;
                int var35 = class36.field480 - var33;
                if (var34 >= field715 || var35 < class108.field1752) {
                    for (int var36 = -class1.field9; var36 <= 0; var36++) {
                        int var37 = class24.field264 + var36;
                        int var38 = class24.field264 - var36;
                        if (var34 >= field715) {
                            if (var37 >= class127.field2104) {
                                class166 var39 = var32[var34][var37];
                                if (var39 != null && var39.field2729) {
                                    class46.method300(var39, true);
                                }
                            }
                            if (var38 < class164.field2671) {
                                class166 var40 = var32[var34][var38];
                                if (var40 != null && var40.field2729) {
                                    class46.method300(var40, true);
                                }
                            }
                        }
                        if (var35 < class108.field1752) {
                            if (var37 >= class127.field2104) {
                                class166 var41 = var32[var35][var37];
                                if (var41 != null && var41.field2729) {
                                    class46.method300(var41, true);
                                }
                            }
                            if (var38 < class164.field2671) {
                                class166 var42 = var32[var35][var38];
                                if (var42 != null && var42.field2729) {
                                    class46.method300(var42, true);
                                }
                            }
                        }
                        if (class293.field4983 == 0) {
                            if (!var22) {
                                class264.field4446 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var43 = class278.field4777; var43 < class164.field2669; var43++) {
            class166[][] var44 = class256.field4320[var43];
            for (int var45 = -class1.field9; var45 <= 0; var45++) {
                int var46 = class36.field480 + var45;
                int var47 = class36.field480 - var45;
                if (var46 >= field715 || var47 < class108.field1752) {
                    for (int var48 = -class1.field9; var48 <= 0; var48++) {
                        int var49 = class24.field264 + var48;
                        int var50 = class24.field264 - var48;
                        if (var46 >= field715) {
                            if (var49 >= class127.field2104) {
                                class166 var51 = var44[var46][var49];
                                if (var51 != null && var51.field2729) {
                                    class46.method300(var51, false);
                                }
                            }
                            if (var50 < class164.field2671) {
                                class166 var52 = var44[var46][var50];
                                if (var52 != null && var52.field2729) {
                                    class46.method300(var52, false);
                                }
                            }
                        }
                        if (var47 < class108.field1752) {
                            if (var49 >= class127.field2104) {
                                class166 var53 = var44[var47][var49];
                                if (var53 != null && var53.field2729) {
                                    class46.method300(var53, false);
                                }
                            }
                            if (var50 < class164.field2671) {
                                class166 var54 = var44[var47][var50];
                                if (var54 != null && var54.field2729) {
                                    class46.method300(var54, false);
                                }
                            }
                        }
                        if (class293.field4983 == 0) {
                            if (!var22) {
                                class264.field4446 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class264.field4446 = false;
    }

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "(I)Lai;", line = 522)
    public final class206 method314(int arg0) {
        field707++;
        if (arg0 >= -7) {
            this.field709 = (class206[]) null;
        }
        if (this.field720 > 0 && this.field709[this.field720 - 1] != this.field719) {
            class206 var2 = this.field719;
            this.field719 = var2.field3492;
            return var2;
        }
        class206 var3;
        do {
            if (this.field720 >= this.field718) {
                return null;
            }
            var3 = this.field709[this.field720++].field3492;
        } while (this.field709[this.field720 - 1] == var3);
        this.field719 = var3.field3492;
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "(I)V", line = 555)
    public final void method315(int arg0) {
        field711++;
        for (int var2 = arg0; var2 < this.field718; var2++) {
            class206 var3 = this.field709[var2];
            while (true) {
                class206 var4 = var3.field3492;
                if (var3 == var4) {
                    break;
                }
                var4.method1444((byte) 89);
            }
        }
        this.field719 = null;
        this.field705 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)I", line = 584)
    public final int method316(byte arg0) {
        field706++;
        if (arg0 <= 18) {
            this.method314(-22);
        }
        return this.field718;
    }

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "(I)Lai;", line = 596)
    public final class206 method317(int arg0) {
        field712++;
        this.field720 = 0;
        return arg0 >= -18 ? (class206) null : this.method314(-56);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IILmi;IIIIZI)V", line = 609)
    public static final void method318(int arg0, int arg1, class92 arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (arg3 != 8) {
            field715 = 18;
        }
        if (arg8 >= 0 && arg8 < 104 && arg6 >= 0 && arg6 < 104) {
            if (!arg7) {
                class42.field641[arg1][arg8][arg6] = 0;
            }
            while (true) {
                int var9 = arg2.method702(-1);
                if (var9 == 0) {
                    if (arg7) {
                        class37.field569[0][arg8][arg6] = class72.field1106[0][arg8][arg6];
                    } else if (arg1 == 0) {
                        class37.field569[0][arg8][arg6] = -class64.method460((byte) -96, arg5 + arg6 + 556238, 932731 - -arg4 + arg8) * 8;
                    } else {
                        class37.field569[arg1][arg8][arg6] = class37.field569[arg1 - 1][arg8][arg6] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg2.method702(-1);
                    if (arg7) {
                        class37.field569[0][arg8][arg6] = class72.field1106[0][arg8][arg6] + (var10 * 8);
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg1 == 0) {
                            class37.field569[0][arg8][arg6] = -var10 * 8;
                        } else {
                            class37.field569[arg1][arg8][arg6] = class37.field569[arg1 - 1][arg8][arg6] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class35.field473[arg1][arg8][arg6] = arg2.method743((byte) 100);
                    class121.field2020[arg1][arg8][arg6] = (byte) ((var9 - 2) / 4);
                    class206.field3502[arg1][arg8][arg6] = (byte) class234.method1648(arg0 + var9 - 2, 3);
                } else if (var9 > 81) {
                    class129.field2120[arg1][arg8][arg6] = (byte) (var9 - 81);
                } else if (!arg7) {
                    class42.field641[arg1][arg8][arg6] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg2.method702(arg3 - 9);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg2.method702(-1);
                    break;
                }
                if (var11 <= 49) {
                    arg2.method702(arg3 - 9);
                }
            }
        }
        field704++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lhi;III)[Lwj;", line = 726)
    public static final class135[] method319(class26 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 29956) {
            method320((byte) 6, (byte[]) null);
        }
        field708++;
        return class127.method951(arg0, arg3, -74, arg1) ? class72.method519((byte) 124) : null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B[B)[B", line = 744)
    public static final byte[] method320(byte arg0, byte[] arg1) {
        field702++;
        if (arg0 <= 43) {
            field717 = -20;
        }
        class92 var2 = new class92(arg1);
        int var3 = var2.method702(-1);
        int var4 = var2.method704(1509947792);
        if (var4 < 0 || !(class176.field2811 == 0 || var4 <= class176.field2811)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method740(var4, 0, var5, true);
            return var5;
        } else {
            int var6 = var2.method704(1509947792);
            if (var6 < 0 || !(class176.field2811 == 0 || class176.field2811 >= var6)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class33.method212(var7, var6, arg1, var4, 9);
            } else {
                class247.field4197.method1030((byte) -103, var2, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(B)V", line = 802)
    public static void method321(byte arg0) {
        int var1 = 93 / ((arg0 + 79) / 37);
        field701 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)Z", line = 812)
    public static final boolean method322(int arg0, byte arg1) {
        field703++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        }
        int var2 = 58 / ((arg1 - 51) / 39);
        if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(I)V", line = 832)
    public class49(int arg0) {
        this.field718 = arg0;
        this.field709 = new class206[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class206 var3 = this.field709[var2] = new class206();
            var3.field3495 = var3;
            var3.field3492 = var3;
        }
    }
}
