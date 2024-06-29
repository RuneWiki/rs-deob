import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class138 {

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "Z")
    private boolean field2688 = false;

    @OriginalMember(owner = "client!eh", name = "p", descriptor = "I")
    public int field2696 = -1;

    @OriginalMember(owner = "client!eh", name = "r", descriptor = "I")
    public int field2698 = 5;

    @OriginalMember(owner = "client!eh", name = "x", descriptor = "I")
    public int field2704 = -1;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "I")
    public int field2706 = -1;

    @OriginalMember(owner = "client!eh", name = "o", descriptor = "I")
    public int field2695 = -1;

    @OriginalMember(owner = "client!eh", name = "n", descriptor = "Z")
    public boolean field2694 = false;

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
    public int field2707 = -1;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "I")
    public int field2710 = 99;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "I")
    public int field2709 = 2;

    @OriginalMember(owner = "client!eh", name = "v", descriptor = "Lsg;")
    public static class30 field2702 = class167.method1221((byte) 33, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!eh", name = "t", descriptor = "Lub;")
    public static class17 field2700 = new class17(64);

    @OriginalMember(owner = "client!eh", name = "y", descriptor = "I")
    public static int field2705 = 0;

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "Z")
    public static boolean field2711 = false;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!eh", name = "m", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!eh", name = "q", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!eh", name = "w", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "[I")
    private int[] field2686;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "[I")
    public int[] field2690;

    @OriginalMember(owner = "client!eh", name = "s", descriptor = "[I")
    public int[] field2699;

    @OriginalMember(owner = "client!eh", name = "u", descriptor = "[I")
    private int[] field2701;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "[Lbj;")
    public static class44[] field2687;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "[[I")
    public int[][] field2685;

    @OriginalMember(owner = "client!eh", name = "B", descriptor = "[[[B")
    public static byte[][][] field2708;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZLfi;I)Lfi;")
    public final class217 method1035(boolean arg0, class217 arg1, int arg2) {
        field2684++;
        int var4 = this.field2699[arg2];
        class219 var5 = class183.method1317(var4 >> 16, 38);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method1566(true, true);
        }
        int var7 = 0;
        class219 var8 = null;
        if (this.field2686 != null && this.field2686.length > arg2) {
            int var9 = this.field2686[arg2];
            var8 = class183.method1317(var9 >> 16, 49);
            var7 = var9 & 0xFFFF;
        }
        if (var8 == null || var7 == 65535) {
            class217 var11 = arg1.method1566(!var5.method1588(var6, (byte) -88), !this.field2688);
            var11.method1557(var5, var6, this.field2688);
            return var11;
        } else {
            class217 var10 = arg1.method1566(!var5.method1588(var6, (byte) -88) & !var8.method1588(var7, (byte) -88), !this.field2688);
            var10.method1557(var5, var6, this.field2688);
            var10.method1557(var8, var7, this.field2688);
            return arg0 ? var10 : null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V")
    public final void method1036(boolean arg0) {
        field2681++;
        if (this.field2696 == -1) {
            if (this.field2701 == null) {
                this.field2696 = 0;
            } else {
                this.field2696 = 2;
            }
        }
        if (arg0) {
            this.method1044((class8) null, -15);
        }
        if (this.field2695 != -1) {
            return;
        }
        if (this.field2701 == null) {
            this.field2695 = 0;
        } else {
            this.field2695 = 2;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIILfi;)Lfi;")
    public final class217 method1037(int arg0, int arg1, int arg2, class217 arg3) {
        int var5 = this.field2699[arg0];
        field2692++;
        class219 var6 = class183.method1317(var5 >> 16, 14);
        if (arg1 < 20) {
            return null;
        }
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg3.method1566(true, true);
        }
        int var8 = arg2 & 0x3;
        class217 var9 = arg3.method1566(!var6.method1588(var7, (byte) -88), !this.field2688);
        if (var8 == 1) {
            var9.method1551();
        } else if (var8 == 2) {
            var9.method1567();
        } else if (var8 == 3) {
            var9.method1548();
        }
        var9.method1557(var6, var7, this.field2688);
        if (var8 == 1) {
            var9.method1548();
        } else if (var8 == 2) {
            var9.method1567();
        } else if (var8 == 3) {
            var9.method1551();
        }
        return var9;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lfi;II)Lfi;")
    public final class217 method1038(class217 arg0, int arg1, int arg2) {
        if (arg2 < 123) {
            return null;
        }
        field2697++;
        int var4 = this.field2699[arg1];
        class219 var5 = class183.method1317(var4 >> 16, 112);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method1558(true, true);
        } else {
            class217 var7 = arg0.method1558(!var5.method1588(var6, (byte) -88), !this.field2688);
            var7.method1557(var5, var6, this.field2688);
            return var7;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(Lfi;II)Lfi;")
    public final class217 method1039(class217 arg0, int arg1, int arg2) {
        int var4 = this.field2699[arg2];
        class219 var5 = class183.method1317(var4 >> 16, 124);
        int var6 = var4 & 0xFFFF;
        field2683++;
        if (arg1 != 8) {
            return null;
        } else if (var5 == null) {
            return arg0.method1566(true, true);
        } else {
            class217 var7 = arg0.method1566(!var5.method1588(var6, (byte) -88), !this.field2688);
            var7.method1557(var5, var6, this.field2688);
            return var7;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IJIZ)Z")
    public static final boolean method1040(int arg0, long arg1, int arg2, boolean arg3) {
        field2691++;
        int var5 = ((int) arg1 & 0x7E590) >> 14;
        int var6 = (int) arg1 >> 20 & 0x3;
        if (!arg3) {
            field2702 = null;
        }
        int var7 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class40 var8 = class195.method1415(-109, var7);
            int var9 = var8.field995;
            int var10;
            int var11;
            if (var6 == 0 || var6 == 2) {
                var10 = var8.field955;
                var11 = var8.field937;
            } else {
                var10 = var8.field937;
                var11 = var8.field955;
            }
            if (var6 != 0) {
                var9 = (var9 << var6 & 0xF) + (var9 >> 4 - var6);
            }
            class96.method786(arg0, var10, var9, 0, 2, var11, 0, true, class247.field4394.field1349[0], class247.field4394.field1372[0], false, arg2);
        } else {
            class96.method786(arg0, 0, 0, var5 + 1, 2, 0, var6, true, class247.field4394.field1349[0], class247.field4394.field1372[0], false, arg2);
        }
        class108.field2179 = 0;
        class44.field1035 = class183.field3365;
        class36.field868 = 2;
        class150.field2847 = class32.field817;
        return true;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILaa;I)V")
    private final void method1041(int arg0, class8 arg1, int arg2) {
        if (arg2 == 1) {
            int var4 = arg1.method65((byte) 126);
            this.field2690 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2690[var5] = arg1.method65((byte) 127);
            }
            this.field2699 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field2699[var6] = arg1.method65((byte) 119);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field2699[var7] = (arg1.method65((byte) 127) << 16) + this.field2699[var7];
            }
        } else if (arg2 == 2) {
            this.field2706 = arg1.method65((byte) 118);
        } else if (arg2 == 3) {
            int var8 = arg1.method63((byte) 55);
            this.field2701 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2701[var9] = arg1.method63((byte) 61);
            }
            this.field2701[var8] = 9999999;
        } else if (arg2 == 4) {
            this.field2694 = true;
        } else if (arg2 == 5) {
            this.field2698 = arg1.method63((byte) 124);
        } else if (arg2 == 6) {
            this.field2704 = arg1.method65((byte) 125);
        } else if (arg2 == 7) {
            this.field2707 = arg1.method65((byte) 122);
        } else if (arg2 == 8) {
            this.field2710 = arg1.method63((byte) 106);
        } else if (arg2 == 9) {
            this.field2695 = arg1.method63((byte) 106);
        } else if (arg2 == 10) {
            this.field2696 = arg1.method63((byte) 53);
        } else if (arg2 == 11) {
            this.field2709 = arg1.method63((byte) 102);
        } else if (arg2 == 12) {
            int var14 = arg1.method63((byte) 107);
            this.field2686 = new int[var14];
            for (int var15 = 0; var15 < var14; var15++) {
                this.field2686[var15] = arg1.method65((byte) 113);
            }
            for (int var16 = 0; var16 < var14; var16++) {
                this.field2686[var16] = (arg1.method65((byte) 113) << 16) + this.field2686[var16];
            }
        } else if (arg2 == 13) {
            int var10 = arg1.method65((byte) 111);
            this.field2685 = new int[var10][];
            for (int var11 = 0; var11 < var10; var11++) {
                int var12 = arg1.method63((byte) 98);
                if (var12 > 0) {
                    this.field2685[var11] = new int[var12];
                    this.field2685[var11][0] = arg1.method60(23888);
                    for (int var13 = 1; var13 < var12; var13++) {
                        this.field2685[var11][var13] = arg1.method65((byte) 107);
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field2688 = true;
        }
        if (arg0 > -33) {
            method1047(99);
        }
        field2693++;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method1042(int arg0) {
        field2687 = null;
        field2700 = null;
        field2702 = null;
        field2708 = null;
        if (arg0 >= -109) {
            field2711 = false;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lfi;IIILeh;)Lfi;")
    public final class217 method1043(class217 arg0, int arg1, int arg2, int arg3, class138 arg4) {
        field2703++;
        int var6 = this.field2699[arg2];
        class219 var7 = class183.method1317(var6 >> 16, 47);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg4.method1039(arg0, arg3 ^ 0x80873698, arg1);
        }
        int var9 = arg4.field2699[arg1];
        class219 var10 = class183.method1317(var9 >> 16, 23);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class217 var12 = arg0.method1566(!var7.method1588(var8, (byte) -88), !this.field2688);
            var12.method1557(var7, var8, this.field2688);
            return var12;
        }
        class217 var13 = arg0.method1566(!var7.method1588(var8, (byte) -88) & !var10.method1588(var11, (byte) -88), !arg4.field2688 & !this.field2688);
        if (arg3 == -2138622320) {
            var13.method1553(var7, var8, var10, var11, this.field2701, this.field2688 | arg4.field2688);
            return var13;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Laa;I)V")
    public final void method1044(class8 arg0, int arg1) {
        field2689++;
        if (arg1 != -8) {
            return;
        }
        while (true) {
            int var3 = arg0.method63((byte) 76);
            if (var3 == 0) {
                return;
            }
            this.method1041(-60, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(III)Z")
    public static final boolean method1045(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class126.field2462; var3++) {
            class22 var4 = class163.field3038[var3];
            if (var4.field412 == 1) {
                int var5 = var4.field407 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field402 * var5 >> 8) + var4.field406;
                    int var7 = (var4.field403 * var5 >> 8) + var4.field399;
                    int var8 = (var4.field401 * var5 >> 8) + var4.field405;
                    int var9 = (var4.field422 * var5 >> 8) + var4.field400;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field412 == 2) {
                int var10 = arg0 - var4.field407;
                if (var10 > 0) {
                    int var11 = (var4.field402 * var10 >> 8) + var4.field406;
                    int var12 = (var4.field403 * var10 >> 8) + var4.field399;
                    int var13 = (var4.field401 * var10 >> 8) + var4.field405;
                    int var14 = (var4.field422 * var10 >> 8) + var4.field400;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field412 == 3) {
                int var15 = var4.field406 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field413 * var15 >> 8) + var4.field407;
                    int var17 = (var4.field404 * var15 >> 8) + var4.field408;
                    int var18 = (var4.field401 * var15 >> 8) + var4.field405;
                    int var19 = (var4.field422 * var15 >> 8) + var4.field400;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field412 == 4) {
                int var20 = arg2 - var4.field406;
                if (var20 > 0) {
                    int var21 = (var4.field413 * var20 >> 8) + var4.field407;
                    int var22 = (var4.field404 * var20 >> 8) + var4.field408;
                    int var23 = (var4.field401 * var20 >> 8) + var4.field405;
                    int var24 = (var4.field422 * var20 >> 8) + var4.field400;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field412 == 5) {
                int var25 = arg1 - var4.field405;
                if (var25 > 0) {
                    int var26 = (var4.field413 * var25 >> 8) + var4.field407;
                    int var27 = (var4.field404 * var25 >> 8) + var4.field408;
                    int var28 = (var4.field402 * var25 >> 8) + var4.field406;
                    int var29 = (var4.field403 * var25 >> 8) + var4.field399;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(III)V")
    public static final void method1046(int arg0, int arg1, int arg2) {
        class45.field1059 = true;
        class92.field1857 = arg0;
        class257.field4540 = arg1;
        class200.field3578 = arg2;
        class275.field4808 = -1;
        class252.field4448 = -1;
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)V")
    public static final void method1047(int arg0) {
        field2682++;
        for (int var1 = 0; var1 < class168.field3158; var1++) {
            int var2 = class116.field2293[var1];
            class120 var3 = class75.field1670[var2];
            int var4 = class59.field1289.method63((byte) 86);
            if ((var4 & 0x4) != 0) {
                var4 += class59.field1289.method63((byte) 76) << 8;
            }
            class254.method1770(var4, var3, arg0 ^ 0xFFFFE735, var2);
        }
        if (arg0 != -6347) {
            method1045(54, 3, 95);
        }
    }
}
