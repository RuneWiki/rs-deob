import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class156 extends class306 {

    @OriginalMember(owner = "client!bm", name = "I", descriptor = "I")
    private int field2443 = 0;

    @OriginalMember(owner = "client!bm", name = "O", descriptor = "I")
    private int field2448 = 4096;

    @OriginalMember(owner = "client!bm", name = "N", descriptor = "I")
    public static int field2447 = 0;

    @OriginalMember(owner = "client!bm", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field2450 = "Loading defaults - ";

    @OriginalMember(owner = "client!bm", name = "G", descriptor = "I")
    public static int field2441 = -1;

    @OriginalMember(owner = "client!bm", name = "U", descriptor = "Ljava/lang/String;")
    public static String field2454 = "flash3:";

    @OriginalMember(owner = "client!bm", name = "S", descriptor = "I")
    public static int field2452 = 0;

    @OriginalMember(owner = "client!bm", name = "H", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!bm", name = "J", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!bm", name = "K", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!bm", name = "L", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!bm", name = "P", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!bm", name = "T", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!bm", name = "R", descriptor = "Lrj;")
    public static class22 field2451;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILlf;I)V", line = 14)
    public final void method45(int arg0, class143 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2443 = arg1.method1051(1);
        } else if (arg2 == 1) {
            this.field2448 = arg1.method1051(1);
        }
        if (arg0 != -15334) {
            method1138(-51, (byte) -18, false, 60);
        }
        field2453++;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 45)
    public static final String method1135(String arg0, byte arg1) {
        field2445++;
        String var2 = class241.method1704(-86, class294.method2093((byte) 100, arg0));
        if (var2 == null) {
            var2 = "";
        }
        return arg1 <= 79 ? (String) null : var2;
    }

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "(B)V", line = 60)
    public static void method1136(byte arg0) {
        field2450 = null;
        field2451 = null;
        field2454 = null;
        int var1 = -31 % ((arg0 - 21) / 57);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BI)V", line = 72)
    public static final void method1137(byte arg0, int arg1) {
        field2444++;
        if (arg0 != -16) {
            field2450 = (String) null;
        }
        class279 var2 = class147.method1085(arg1, -19443, 3);
        var2.method1996(true);
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V", line = 85)
    public class156() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IBZI)I", line = 91)
    public static final int method1138(int arg0, byte arg1, boolean arg2, int arg3) {
        field2446++;
        class64 var4 = (class64) class6.field67.method770((long) arg0, arg1 + 99);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        if (arg1 != -52) {
            field2452 = 82;
        }
        for (int var6 = 0; var6 < var4.field773.length; var6++) {
            if (var4.field773[var6] >= 0 && var4.field773[var6] < class332.field5314) {
                class309 var7 = class190.method1302(var4.field773[var6], (byte) -122);
                if (var7.field4791 != null) {
                    class305 var8 = (class305) var7.field4791.method770((long) arg3, 52);
                    if (var8 != null) {
                        if (arg2) {
                            var5 += var4.field768[var6] * var8.field4748;
                        } else {
                            var5 += var8.field4748;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lsg;)V", line = 142)
    public static final void method1139(class44 arg0) {
        for (int var1 = arg0.field504; var1 <= arg0.field501; var1++) {
            for (int var2 = arg0.field497; var2 <= arg0.field498; var2++) {
                class196 var3 = class194.field2947[arg0.field510][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2979; var4++) {
                        if (var3.field2998[var4] == arg0) {
                            var3.field2979--;
                            for (int var5 = var4; var5 < var3.field2979; var5++) {
                                var3.field2998[var5] = var3.field2998[var5 + 1];
                                var3.field2988[var5] = var3.field2988[var5 + 1];
                            }
                            var3.field2998[var3.field2979] = null;
                            break;
                        }
                    }
                    var3.field2981 = 0;
                    for (int var6 = 0; var6 < var3.field2979; var6++) {
                        var3.field2981 |= var3.field2988[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)[I", line = 205)
    public final int[] method47(int arg0, int arg1) {
        field2449++;
        if (arg1 != -1546337535) {
            this.method47(72, -3);
        }
        int[] var3 = this.field4757.method903(arg0, arg1 + 1546337408);
        if (this.field4757.field1898) {
            int[] var4 = this.method2161(arg0, (byte) 119, 0);
            for (int var5 = 0; var5 < class31.field367; var5++) {
                int var6 = var4[var5];
                var3[var5] = this.field2443 <= var6 && var6 <= this.field2448 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIII)V", line = 244)
    public static final void method1140(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 23194) {
            return;
        }
        field2442++;
        int var6 = arg5 - arg3;
        int var7 = arg2 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class67.method418(arg1, arg4, arg5, arg3, 127);
            }
        } else if (var6 == 0) {
            class42.method259(arg2, arg4, 929588991, arg1, arg3);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg1;
                arg1 = arg3;
                arg3 = var9;
                int var10 = arg2;
                arg2 = arg5;
                arg5 = var10;
            }
            if (arg1 > arg2) {
                int var11 = arg3;
                int var12 = arg1;
                arg1 = arg2;
                arg2 = var12;
                arg3 = arg5;
                arg5 = var11;
            }
            int var13 = arg3;
            int var14 = arg5 - arg3;
            if (var14 < 0) {
                var14 = -var14;
            }
            int var15 = arg2 - arg1;
            int var16 = -(var15 >> 1);
            int var17 = arg5 > arg3 ? 1 : -1;
            if (var8) {
                for (int var19 = arg1; var19 <= arg2; var19++) {
                    var16 += var14;
                    class347.field5501[var19][var13] = arg4;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var15;
                    }
                }
            } else {
                for (int var18 = arg1; var18 <= arg2; var18++) {
                    class347.field5501[var13][var18] = arg4;
                    var16 += var14;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var15;
                    }
                }
            }
        }
    }
}
