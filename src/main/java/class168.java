import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class168 extends class21 {

    @OriginalMember(owner = "client!lh", name = "X", descriptor = "I")
    private int field2697 = 10;

    @OriginalMember(owner = "client!lh", name = "ab", descriptor = "I")
    private int field2700 = 2048;

    @OriginalMember(owner = "client!lh", name = "R", descriptor = "I")
    private int field2691 = 0;

    @OriginalMember(owner = "client!lh", name = "V", descriptor = "[I")
    public static int[] field2695 = new int[32];

    @OriginalMember(owner = "client!lh", name = "W", descriptor = "I")
    public static int field2696 = -1;

    @OriginalMember(owner = "client!lh", name = "Z", descriptor = "S")
    public static short field2699 = 32767;

    @OriginalMember(owner = "client!lh", name = "db", descriptor = "J")
    public static long field2703 = 0L;

    @OriginalMember(owner = "client!lh", name = "cb", descriptor = "Z")
    public static boolean field2702 = false;

    @OriginalMember(owner = "client!lh", name = "S", descriptor = "I")
    public static int field2692 = 0;

    @OriginalMember(owner = "client!lh", name = "P", descriptor = "Ljc;")
    public static class230 field2689 = new class230();

    @OriginalMember(owner = "client!lh", name = "N", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!lh", name = "Q", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!lh", name = "Y", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!lh", name = "bb", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!lh", name = "O", descriptor = "[I")
    private int[] field2688;

    @OriginalMember(owner = "client!lh", name = "T", descriptor = "[I")
    private int[] field2693;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)[I", line = 10)
    public final int[] method177(int arg0, int arg1) {
        int var3 = -109 / ((33 - arg0) / 36);
        field2701++;
        int[] var4 = this.field443.method1040(arg1, false);
        if (this.field443.field2637) {
            int var5 = class330.field5058[arg1];
            if (this.field2691 == 0) {
                short var12 = 0;
                for (int var13 = 0; var13 < this.field2697; var13++) {
                    if (var5 >= this.field2693[var13] && this.field2693[var13 + 1] > var5) {
                        if (this.field2688[var13] > var5) {
                            var12 = 4096;
                        }
                        break;
                    }
                }
                class129.method854(var4, 0, class294.field4489, var12);
            } else {
                for (int var6 = 0; var6 < class294.field4489; var6++) {
                    int var7 = 0;
                    int var8 = class51.field1027[var6];
                    short var9 = 0;
                    int var10 = this.field2691;
                    if (var10 == 1) {
                        var7 = var8;
                    } else if (var10 == 2) {
                        var7 = (var5 + var8 - 4096 >> 1) + 2048;
                    } else if (var10 == 3) {
                        var7 = (var8 - var5 >> 1) + 2048;
                    }
                    for (int var11 = 0; var11 < this.field2697; var11++) {
                        if (this.field2693[var11] <= var7 && this.field2693[var11 + 1] > var7) {
                            if (var7 < this.field2688[var11]) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var4[var6] = var9;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)Z", line = 121)
    public static final boolean method1063(int arg0, int arg1) {
        field2690++;
        class103 var2 = class335.method2311(true, arg0);
        if (var2 == null) {
            return false;
        } else if (class124.field2149 == 1 || class124.field2149 == 2 || class260.field4068 == 2) {
            class245.field3808 = var2.field1783;
            class109.field1940 = var2.field1791;
            if (class260.field4068 != 0) {
                class313.field4760 = class109.field1940 + 50000;
                class329.field5049 = class109.field1940 + 40000;
                class205.field3347 = class329.field5049;
            }
            return true;
        } else {
            String var3 = "";
            String var4 = "";
            if (class260.field4068 != arg1) {
                var3 = ":" + (var2.field1791 + 7000);
            }
            if (class228.field3604 != null) {
                var4 = "/p=" + class228.field3604;
            }
            String var5 = "http://" + var2.field1783 + var3 + "/l=" + class321.field4894 + "/a=" + class190.field3090 + var4 + "/j" + (class276.field4214 ? "1" : "0") + ",o" + (class46.field949 ? "1" : "0") + ",a2,m" + (class63.field1219 ? "1" : "0");
            try {
                class72.field1506.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(B)V", line = 169)
    private final void method1064(byte arg0) {
        this.field2693 = new int[this.field2697 + 1];
        field2698++;
        int var2 = 4096 / this.field2697;
        this.field2688 = new int[this.field2697 + 1];
        int var3 = 0;
        int var4 = -17 % ((-arg0 - 69) / 57);
        int var5 = this.field2700 * var2 >> 12;
        for (int var6 = 0; var6 < this.field2697; var6++) {
            this.field2693[var6] = var3;
            this.field2688[var6] = var3 + var5;
            var3 += var2;
        }
        this.field2693[this.field2697] = 4096;
        this.field2688[this.field2697] = this.field2688[0] + 4096;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IILag;)V", line = 202)
    public final void method178(int arg0, int arg1, class202 arg2) {
        if (arg0 != -318) {
            this.method183((byte) -97);
        }
        field2687++;
        if (arg1 == 0) {
            this.field2697 = arg2.method1317((byte) -97);
        } else if (arg1 == 1) {
            this.field2700 = arg2.method1315(14289);
        } else if (arg1 == 2) {
            this.field2691 = arg2.method1317((byte) -76);
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(III)Z", line = 249)
    public static final boolean method1065(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class220.field3492; var3++) {
            class191 var4 = class327.field4992[var3];
            if (var4.field3107 == 1) {
                int var5 = var4.field3105 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3098 * var5 >> 8) + var4.field3120;
                    int var7 = (var4.field3093 * var5 >> 8) + var4.field3097;
                    int var8 = (var4.field3118 * var5 >> 8) + var4.field3113;
                    int var9 = (var4.field3106 * var5 >> 8) + var4.field3121;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3107 == 2) {
                int var10 = arg0 - var4.field3105;
                if (var10 > 0) {
                    int var11 = (var4.field3098 * var10 >> 8) + var4.field3120;
                    int var12 = (var4.field3093 * var10 >> 8) + var4.field3097;
                    int var13 = (var4.field3118 * var10 >> 8) + var4.field3113;
                    int var14 = (var4.field3106 * var10 >> 8) + var4.field3121;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3107 == 3) {
                int var15 = var4.field3120 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3104 * var15 >> 8) + var4.field3105;
                    int var17 = (var4.field3108 * var15 >> 8) + var4.field3099;
                    int var18 = (var4.field3118 * var15 >> 8) + var4.field3113;
                    int var19 = (var4.field3106 * var15 >> 8) + var4.field3121;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3107 == 4) {
                int var20 = arg2 - var4.field3120;
                if (var20 > 0) {
                    int var21 = (var4.field3104 * var20 >> 8) + var4.field3105;
                    int var22 = (var4.field3108 * var20 >> 8) + var4.field3099;
                    int var23 = (var4.field3118 * var20 >> 8) + var4.field3113;
                    int var24 = (var4.field3106 * var20 >> 8) + var4.field3121;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3107 == 5) {
                int var25 = arg1 - var4.field3113;
                if (var25 > 0) {
                    int var26 = (var4.field3104 * var25 >> 8) + var4.field3105;
                    int var27 = (var4.field3108 * var25 >> 8) + var4.field3099;
                    int var28 = (var4.field3098 * var25 >> 8) + var4.field3120;
                    int var29 = (var4.field3093 * var25 >> 8) + var4.field3097;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V", line = 406)
    public class168() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)V", line = 389)
    public static void method1066(int arg0) {
        if (arg0 != 5) {
            method1065(9, -14, 126);
        }
        field2695 = null;
        field2689 = null;
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)V", line = 410)
    public final void method183(byte arg0) {
        this.method1064((byte) 127);
        if (arg0 <= 82) {
            this.method177(93, 83);
        }
        field2694++;
    }
}
