import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class329 extends class21 {

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "I")
    private int field5040 = 4096;

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "I")
    private int field5045 = 0;

    @OriginalMember(owner = "client!ak", name = "V", descriptor = "Ljava/lang/String;")
    public static String field5048 = "Loading config - ";

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!ak", name = "T", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!ak", name = "U", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!ak", name = "W", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!ak", name = "X", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!ak", name = "Y", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!ak", name = "Z", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!ak", name = "ab", descriptor = "I")
    public static int field5053;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "Lbm;")
    public static class307 field5042;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIZ)V", line = 3)
    public static final void method2278(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class306.field4629 = arg1;
        class39.field762 = arg2;
        class339.field5251 = arg3;
        class197.field3169 = new class47[arg0][class306.field4629][class39.field762];
        class46.field954 = new int[arg0][class306.field4629 + 1][class39.field762 + 1];
        if (class249.field3893) {
            class61.field1180 = new class16[4][];
        }
        if (arg4) {
            class239.field3738 = new class47[1][class306.field4629][class39.field762];
            class25.field498 = new int[class306.field4629][class39.field762];
            class136.field2290 = new int[1][class306.field4629 + 1][class39.field762 + 1];
            if (class249.field3893) {
                class48.field1001 = new class16[1][];
            }
        } else {
            class239.field3738 = (class47[][][]) null;
            class25.field498 = (int[][]) null;
            class136.field2290 = (int[][][]) null;
            class48.field1001 = (class16[][]) null;
        }
        class199.method1269(false);
        class274.field4204 = new class191[500];
        class66.field1249 = 0;
        class327.field4992 = new class191[500];
        class220.field3492 = 0;
        class244.field3791 = new int[arg0][class306.field4629 + 1][class39.field762 + 1];
        class2.field37 = new class271[5000];
        class175.field2819 = 0;
        class276.field4215 = new class271[100];
        class56.field1110 = new boolean[class339.field5251 + class339.field5251 + 1][class339.field5251 + class339.field5251 + 1];
        class255.field3985 = new boolean[class339.field5251 + class339.field5251 + 2][class339.field5251 + class339.field5251 + 2];
        class44.field855 = new byte[arg0][class306.field4629][class39.field762];
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)I", line = 46)
    public static final int method2279(int arg0) {
        if (arg0 != 1881) {
            method2283(true);
        }
        field5041++;
        return class298.field4530;
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)V", line = 58)
    public static void method2280(int arg0) {
        if (arg0 == 2) {
            field5048 = null;
            field5042 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V", line = 256)
    public class329() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(IB)[[I", line = 77)
    public final int[][] method175(int arg0, byte arg1) {
        int[][] var3 = this.field441.method220(arg0, 17433);
        if (arg1 <= 16) {
            field5042 = (class307) null;
        }
        field5043++;
        if (this.field441.field532) {
            int[][] var4 = this.method173(0, arg0, (byte) 120);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class294.field4489; var11++) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var7[var11];
                if (var13 < this.field5045) {
                    var8[var11] = this.field5045;
                } else if (var13 > this.field5040) {
                    var8[var11] = this.field5040;
                } else {
                    var8[var11] = var13;
                }
                if (this.field5045 > var12) {
                    var9[var11] = this.field5045;
                } else if (this.field5040 < var12) {
                    var9[var11] = this.field5040;
                } else {
                    var9[var11] = var12;
                }
                if (var14 < this.field5045) {
                    var10[var11] = this.field5045;
                } else if (this.field5040 < var14) {
                    var10[var11] = this.field5040;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)[I", line = 151)
    public final int[] method177(int arg0, int arg1) {
        field5052++;
        int var3 = 91 % ((33 - arg0) / 36);
        int[] var4 = this.field443.method1040(arg1, false);
        if (this.field443.field2637) {
            int[] var5 = this.method171(0, 94, arg1);
            for (int var6 = 0; var6 < class294.field4489; var6++) {
                int var7 = var5[var6];
                if (var7 < this.field5045) {
                    var4[var6] = this.field5045;
                } else if (var7 > this.field5040) {
                    var4[var6] = this.field5040;
                } else {
                    var4[var6] = var7;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZ)I", line = 197)
    public static final int method2281(int arg0, boolean arg1) {
        field5046++;
        return arg1 ? arg0 & 0x7F : -124;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(III)Ljava/lang/String;", line = 210)
    public static final String method2282(int arg0, int arg1, int arg2) {
        field5050++;
        if (arg0 < 79) {
            field5042 = (class307) null;
        }
        int var3 = arg1 - arg2;
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
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (var3 <= 3) {
            return var3 <= 0 ? "<col=ffff00>" : "<col=c0ff00>";
        } else {
            return "<col=80ff00>";
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(Z)V", line = 261)
    public static final void method2283(boolean arg0) {
        field5051++;
        if (class322.field4911 == 5 && arg0) {
            class322.field4911 = 6;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IILag;)V", line = 277)
    public final void method178(int arg0, int arg1, class202 arg2) {
        if (arg0 != -318) {
            field5042 = (class307) null;
        }
        if (arg1 == 0) {
            this.field5045 = arg2.method1315(14289);
        } else if (arg1 == 1) {
            this.field5040 = arg2.method1315(14289);
        } else if (arg1 == 2) {
            this.field444 = arg2.method1317((byte) -93) == 1;
        }
        field5047++;
    }
}
