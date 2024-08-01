import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("jg")
public class class92 extends class71 {

    @OriginalMember(owner = "jg", name = "n", descriptor = "I")
    public int field1887;

    @OriginalMember(owner = "jg", name = "s", descriptor = "I")
    public int field1892;

    @OriginalMember(owner = "jg", name = "q", descriptor = "I")
    public static int field1890 = 0;

    @OriginalMember(owner = "jg", name = "t", descriptor = "Llf;")
    private static class109 field1893 = class35.method275("Ok", 2);

    @OriginalMember(owner = "jg", name = "z", descriptor = "Llf;")
    private static class109 field1899 = class35.method275("Prepared visibility map", 2);

    @OriginalMember(owner = "jg", name = "u", descriptor = "Llf;")
    public static class109 field1894 = class35.method275("::errortest", 2);

    @OriginalMember(owner = "jg", name = "B", descriptor = "Llf;")
    private static class109 field1901 = class35.method275("level)2", 2);

    @OriginalMember(owner = "jg", name = "w", descriptor = "Llf;")
    public static class109 field1896 = field1893;

    @OriginalMember(owner = "jg", name = "D", descriptor = "Llf;")
    public static class109 field1903 = field1901;

    @OriginalMember(owner = "jg", name = "A", descriptor = "Llf;")
    public static class109 field1900 = field1899;

    @OriginalMember(owner = "jg", name = "o", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "jg", name = "v", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "jg", name = "x", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "jg", name = "y", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "jg", name = "C", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "jg", name = "p", descriptor = "Lvg;")
    public static class200 field1889;

    @OriginalMember(owner = "jg", name = "r", descriptor = "Ldb;")
    public static class33 field1891;

    @OriginalMember(owner = "jg", name = "a", descriptor = "(III)V")
    public static final void method668(int arg0, int arg1, int arg2) {
        int[] var3 = new int[4];
        field1902++;
        var3[0] = arg1;
        int var4 = 1;
        int[] var5 = new int[4];
        var5[0] = arg0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class157.field2961[var6] != arg1) {
                var3[var4] = class157.field2961[var6];
                var5[var4] = class126.field2432[var6];
                var4++;
            }
        }
        if (arg2 == 2001) {
            class157.field2961 = var3;
            class126.field2432 = var5;
            method671(class157.field2961, 0, class168.field3121.length - 1, class168.field3121, 2, class126.field2432);
        }
    }

    @OriginalMember(owner = "jg", name = "a", descriptor = "(IIII)I")
    public static final int method669(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field1888++;
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            if (arg0 != -29778) {
                method672(66, 53);
            }
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "jg", name = "c", descriptor = "(B)V")
    public static void method670(byte arg0) {
        field1901 = null;
        field1899 = null;
        field1891 = null;
        field1894 = null;
        field1893 = null;
        field1903 = null;
        field1889 = null;
        int var1 = -97 % ((arg0 - 64) / 57);
        field1900 = null;
        field1896 = null;
    }

    @OriginalMember(owner = "jg", name = "a", descriptor = "([III[Lfd;I[I)V")
    public static final void method671(int[] arg0, int arg1, int arg2, class55[] arg3, int arg4, int[] arg5) {
        if (arg2 > arg1) {
            int var6 = arg1 - 1;
            int var7 = arg2 + 1;
            int var8 = (arg1 + arg2) / 2;
            class55 var9 = arg3[var8];
            arg3[var8] = arg3[arg1];
            arg3[arg1] = var9;
            while (var6 < var7) {
                boolean var10 = true;
                do {
                    var7--;
                    for (int var11 = 0; var11 < 4; var11++) {
                        int var12;
                        int var13;
                        if (arg0[var11] == 2) {
                            var12 = arg3[var7].field1104;
                            var13 = var9.field1104;
                        } else if (arg0[var11] == 1) {
                            var13 = var9.field1106;
                            if (var13 == -1 && arg5[var11] == 1) {
                                var13 = 2001;
                            }
                            var12 = arg3[var7].field1106;
                            if (var12 == -1 && arg5[var11] == 1) {
                                var12 = 2001;
                            }
                        } else if (arg0[var11] == 3) {
                            var13 = var9.field1111 ? 1 : 0;
                            var12 = arg3[var7].field1111 ? 1 : 0;
                        } else {
                            var12 = arg3[var7].field1113;
                            var13 = var9.field1113;
                        }
                        if (var12 != var13) {
                            if ((arg5[var11] != 1 || var13 >= var12) && (arg5[var11] != 0 || var13 <= var12)) {
                                var10 = false;
                            }
                            break;
                        }
                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);
                boolean var14 = true;
                do {
                    var6++;
                    for (int var15 = 0; var15 < 4; var15++) {
                        int var16;
                        int var17;
                        if (arg0[var15] == 2) {
                            var17 = arg3[var6].field1104;
                            var16 = var9.field1104;
                        } else if (arg0[var15] == 1) {
                            var16 = var9.field1106;
                            var17 = arg3[var6].field1106;
                            if (var16 == -1 && arg5[var15] == 1) {
                                var16 = 2001;
                            }
                            if (var17 == -1 && arg5[var15] == 1) {
                                var17 = 2001;
                            }
                        } else if (arg0[var15] == 3) {
                            var17 = arg3[var6].field1111 ? 1 : 0;
                            var16 = var9.field1111 ? 1 : 0;
                        } else {
                            var16 = var9.field1113;
                            var17 = arg3[var6].field1113;
                        }
                        if (var16 != var17) {
                            if ((arg5[var15] != 1 || var16 <= var17) && (arg5[var15] != 0 || var16 >= var17)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (var15 == 3) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (var6 < var7) {
                    class55 var18 = arg3[var6];
                    arg3[var6] = arg3[var7];
                    arg3[var7] = var18;
                }
            }
            method671(arg0, arg1, var7, arg3, 2, arg5);
            method671(arg0, var7 + 1, arg2, arg3, 2, arg5);
        }
        field1895++;
        if (arg4 != 2) {
            method668(-72, -111, 59);
        }
    }

    @OriginalMember(owner = "jg", name = "a", descriptor = "(II)V")
    public static final void method672(int arg0, int arg1) {
        class139.field2694 = 1000 / arg0;
        if (arg1 == 0) {
            field1898++;
        }
    }

    @OriginalMember(owner = "jg", name = "<init>", descriptor = "(II)V")
    public class92(int arg0, int arg1) {
        this.field1887 = arg0;
        this.field1892 = arg1;
    }
}
