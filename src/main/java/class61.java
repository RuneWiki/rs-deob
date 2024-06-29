import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class61 extends class449 {

    @OriginalMember(owner = "client!sm", name = "A", descriptor = "I")
    public int field891;

    @OriginalMember(owner = "client!sm", name = "y", descriptor = "I")
    public int field889;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "[[I")
    public int[][] field883;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "[I")
    public int[] field884;

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "[I")
    public int[] field890;

    @OriginalMember(owner = "client!sm", name = "B", descriptor = "[Z")
    public boolean[] field892;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!sm", name = "C", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!sm", name = "x", descriptor = "Lrp;")
    public static class419 field888;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIII)Z")
    public static final boolean method554(int arg0, int arg1, int arg2, int arg3) {
        if (!class395.method2385(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class380.field5232;
        int var5 = arg2 << class380.field5232;
        int var6 = class340.field4692[arg0].method591(arg1, arg2) - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 == 1) {
            if (var4 > class200.field2966) {
                if (!class22.method157(var4, var6, var5)) {
                    return false;
                }
                if (!class22.method157(var4, var6, class47.field719 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class22.method157(var4, var7, var5)) {
                    return false;
                }
                if (!class22.method157(var4, var7, class47.field719 + var5)) {
                    return false;
                }
            }
            if (class22.method157(var4, var8, var5)) {
                return class22.method157(var4, var8, class47.field719 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class385.field5280) {
                if (!class22.method157(var4, var6, class47.field719 + var5)) {
                    return false;
                }
                if (!class22.method157(class47.field719 + var4, var6, class47.field719 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class22.method157(var4, var7, class47.field719 + var5)) {
                    return false;
                }
                if (!class22.method157(class47.field719 + var4, var7, class47.field719 + var5)) {
                    return false;
                }
            }
            if (class22.method157(var4, var8, class47.field719 + var5)) {
                return class22.method157(class47.field719 + var4, var8, class47.field719 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class200.field2966) {
                if (!class22.method157(class47.field719 + var4, var6, var5)) {
                    return false;
                }
                if (!class22.method157(class47.field719 + var4, var6, class47.field719 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class22.method157(class47.field719 + var4, var7, var5)) {
                    return false;
                }
                if (!class22.method157(class47.field719 + var4, var7, class47.field719 + var5)) {
                    return false;
                }
            }
            if (class22.method157(class47.field719 + var4, var8, var5)) {
                return class22.method157(class47.field719 + var4, var8, class47.field719 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class385.field5280) {
                if (!class22.method157(var4, var6, var5)) {
                    return false;
                }
                if (!class22.method157(class47.field719 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class22.method157(var4, var7, var5)) {
                    return false;
                }
                if (!class22.method157(class47.field719 + var4, var7, var5)) {
                    return false;
                }
            }
            if (class22.method157(var4, var8, var5)) {
                return class22.method157(class47.field719 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class22.method157(class289.field4100 + var4, var9, class289.field4100 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class22.method157(var4, var8, class47.field719 + var5);
        } else if (arg3 == 32) {
            return class22.method157(class47.field719 + var4, var8, class47.field719 + var5);
        } else if (arg3 == 64) {
            return class22.method157(class47.field719 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class22.method157(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIII)V")
    public static final void method555(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class193.field2870 != 0 && arg3 != 0 && class172.field2628 < 50 && arg0 != -1) {
            class191.field2863[class172.field2628] = arg0;
            class261.field3746[class172.field2628] = arg3;
            class377.field5194[class172.field2628] = arg1;
            class126.field1717[class172.field2628] = null;
            class128.field1758[class172.field2628] = 0;
            class131.field1805[class172.field2628] = arg4;
            class172.field2628++;
        }
        if (arg2 > -48) {
            field888 = null;
        }
        field885++;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
    public static void method556(byte arg0) {
        field888 = null;
        if (arg0 != -73) {
            field887 = -6;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZBLjava/awt/Component;)Lpo;")
    public static final class230 method557(boolean arg0, byte arg1, Component arg2) {
        field881++;
        int var3 = -23 / ((-arg1 - 12) / 35);
        return new class407(arg2, arg0);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II[III)V")
    public static final void method558(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        if (arg1 != -10647) {
            return;
        }
        arg3--;
        field882++;
        int var6 = arg0 - 1;
        int var5 = var6 - 7;
        while (var5 > arg3) {
            int var7 = arg3 + 1;
            arg2[var7] = arg4;
            int var8 = var7 + 1;
            arg2[var8] = arg4;
            int var9 = var8 + 1;
            arg2[var9] = arg4;
            int var10 = var9 + 1;
            arg2[var10] = arg4;
            int var11 = var10 + 1;
            arg2[var11] = arg4;
            int var12 = var11 + 1;
            arg2[var12] = arg4;
            int var13 = var12 + 1;
            arg2[var13] = arg4;
            arg3 = var13 + 1;
            arg2[arg3] = arg4;
        }
        while (var6 > arg3) {
            arg3++;
            arg2[arg3] = arg4;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIB)V")
    public static final void method559(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field893++;
        if (arg5 <= 58) {
            method555(-39, -97, -98, 26, -40);
        }
        if (class295.field4153 <= arg1 && class103.field1457 >= arg0 && class444.field6338 <= arg2 && arg3 <= class151.field2091) {
            class367.method2249(arg0, arg3, arg4, 1, arg2, arg1);
        } else {
            class385.method2347(-82, arg0, arg2, arg3, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(I[B)V")
    public class61(int arg0, byte[] arg1) {
        this.field891 = arg0;
        class161 var3 = new class161(arg1);
        this.field889 = var3.method1172((byte) -28);
        this.field883 = new int[this.field889][];
        this.field884 = new int[this.field889];
        this.field890 = new int[this.field889];
        this.field892 = new boolean[this.field889];
        for (int var4 = 0; var4 < this.field889; var4++) {
            this.field884[var4] = var3.method1172((byte) 36);
        }
        for (int var5 = 0; var5 < this.field889; var5++) {
            this.field892[var5] = var3.method1172((byte) 77) == 1;
        }
        for (int var6 = 0; var6 < this.field889; var6++) {
            this.field890[var6] = var3.method1134(-16848);
        }
        for (int var7 = 0; var7 < this.field889; var7++) {
            this.field883[var7] = new int[var3.method1172((byte) 25)];
        }
        for (int var8 = 0; var8 < this.field889; var8++) {
            for (int var9 = 0; var9 < this.field883[var8].length; var9++) {
                this.field883[var8][var9] = var3.method1172((byte) 86);
            }
        }
    }
}
