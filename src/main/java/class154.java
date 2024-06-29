import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class154 {

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "Loh;")
    public static class258 field2634 = class153.method1046("Gegenstand f-Ur Mitglieder", 104);

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "Loh;")
    public static class258 field2637 = class153.method1046("(U(Y", 117);

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "Loh;")
    private static class258 field2643 = class153.method1046("Loaded world list data", 121);

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "Loh;")
    public static class258 field2641 = field2643;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "Ls;")
    public static class171 field2647 = null;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "J")
    public long field2642;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "Lsd;")
    public static class125 field2640;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "Lkh;")
    public class154 field2635;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "Lkh;")
    public class154 field2636;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "[[I")
    public static int[][] field2638;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)[Lrm;", line = 14)
    public static final class113[] method1049(byte arg0) {
        field2645++;
        class113[] var1 = new class113[class152.field2608];
        if (arg0 != 41) {
            return (class113[]) null;
        }
        for (int var2 = 0; var2 < class152.field2608; var2++) {
            if (class257.field4390) {
                var1[var2] = new class46(class108.field1919, class23.field279, class279.field4795[var2], class280.field4819[var2], class113.field1958[var2], class301.field5149[var2], class37.field497[var2], class121.field2143);
            } else {
                var1[var2] = new class129(class108.field1919, class23.field279, class279.field4795[var2], class280.field4819[var2], class113.field1958[var2], class301.field5149[var2], class37.field497[var2], class121.field2143);
            }
        }
        class290.method2038(arg0 + 86);
        return var1;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)Z", line = 57)
    public final boolean method1050(byte arg0) {
        if (arg0 != -35) {
            field2634 = (class258) null;
        }
        field2639++;
        return this.field2635 != null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)V", line = 75)
    public static void method1051(boolean arg0) {
        field2638 = (int[][]) null;
        field2643 = null;
        field2641 = null;
        if (!arg0) {
            method1051(true);
        }
        field2634 = null;
        field2647 = null;
        field2640 = null;
        field2637 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIII)V", line = 110)
    public static final void method1052(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2646++;
        int var5 = -arg3;
        int var6 = arg3;
        int var7 = arg2;
        int var8 = -1;
        int var9 = class203.method1347(class75.field1314, arg3 + arg4, 1, class206.field3562);
        int var10 = class203.method1347(class75.field1314, arg4 - arg3, 1, class206.field3562);
        class19.method126(7, arg1, field2638[arg0], var10, var9);
        while (var6 > var7) {
            var8 += 2;
            var5 += var8;
            if (var5 > 0) {
                var6--;
                var5 -= var6 << 1;
                int var11 = arg0 + var6;
                int var12 = arg0 - var6;
                if (var11 >= class241.field4189 && class94.field1654 >= var12) {
                    int var13 = class203.method1347(class75.field1314, arg4 + var7, 1, class206.field3562);
                    int var14 = class203.method1347(class75.field1314, arg4 - var7, 1, class206.field3562);
                    if (class94.field1654 >= var11) {
                        class19.method126(7, arg1, field2638[var11], var14, var13);
                    }
                    if (class241.field4189 <= var12) {
                        class19.method126(7, arg1, field2638[var12], var14, var13);
                    }
                }
            }
            var7++;
            int var15 = arg0 + var7;
            int var16 = arg0 - var7;
            if (var15 >= class241.field4189 && class94.field1654 >= var16) {
                int var17 = class203.method1347(class75.field1314, arg4 + var6, arg2 + 1, class206.field3562);
                int var18 = class203.method1347(class75.field1314, arg4 - var6, arg2 ^ 0x1, class206.field3562);
                if (var15 <= class94.field1654) {
                    class19.method126(7, arg1, field2638[var15], var18, var17);
                }
                if (class241.field4189 <= var16) {
                    class19.method126(arg2 ^ 0x7, arg1, field2638[var16], var18, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "()V", line = 182)
    public static final void method1053() {
        class117.field2084 = 0;
        label194: for (int var0 = 0; var0 < class63.field1099; var0++) {
            class226 var1 = class84.field1428[var0];
            if (class73.field1288 != null) {
                for (int var2 = 0; var2 < class73.field1288.length; var2++) {
                    if (class73.field1288[var2] != -1000000 && (var1.field3879 <= class73.field1288[var2] || var1.field3883 <= class73.field1288[var2]) && (var1.field3878 <= class90.field1590[var2] || var1.field3877 <= class90.field1590[var2]) && (var1.field3878 >= class119.field2105[var2] || var1.field3877 >= class119.field2105[var2]) && (var1.field3875 <= class146.field2479[var2] || var1.field3897 <= class146.field2479[var2]) && (var1.field3875 >= class208.field3581[var2] || var1.field3897 >= class208.field3581[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field3873 == 1) {
                int var3 = var1.field3893 + class297.field5101 - class64.field1134;
                if (var3 >= 0 && var3 <= class297.field5101 + class297.field5101) {
                    int var4 = var1.field3891 + class297.field5101 - class145.field2447;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field3872 + class297.field5101 - class145.field2447;
                    if (var5 > class297.field5101 + class297.field5101) {
                        var5 = class297.field5101 + class297.field5101;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class232.field4032[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class190.field3359 - var1.field3878;
                        if (var7 > 32) {
                            var1.field3871 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field3871 = 2;
                            var7 = -var7;
                        }
                        var1.field3881 = (var1.field3875 - class289.field4986 << 8) / var7;
                        var1.field3890 = (var1.field3897 - class289.field4986 << 8) / var7;
                        var1.field3887 = (var1.field3879 - class258.field4463 << 8) / var7;
                        var1.field3884 = (var1.field3883 - class258.field4463 << 8) / var7;
                        class36.field480[class117.field2084++] = var1;
                    }
                }
            } else if (var1.field3873 == 2) {
                int var8 = var1.field3891 + class297.field5101 - class145.field2447;
                if (var8 >= 0 && var8 <= class297.field5101 + class297.field5101) {
                    int var9 = var1.field3893 + class297.field5101 - class64.field1134;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field3885 + class297.field5101 - class64.field1134;
                    if (var10 > class297.field5101 + class297.field5101) {
                        var10 = class297.field5101 + class297.field5101;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class232.field4032[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class289.field4986 - var1.field3875;
                        if (var12 > 32) {
                            var1.field3871 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field3871 = 4;
                            var12 = -var12;
                        }
                        var1.field3889 = (var1.field3878 - class190.field3359 << 8) / var12;
                        var1.field3888 = (var1.field3877 - class190.field3359 << 8) / var12;
                        var1.field3887 = (var1.field3879 - class258.field4463 << 8) / var12;
                        var1.field3884 = (var1.field3883 - class258.field4463 << 8) / var12;
                        class36.field480[class117.field2084++] = var1;
                    }
                }
            } else if (var1.field3873 == 4) {
                int var13 = var1.field3879 - class258.field4463;
                if (var13 > 128) {
                    int var14 = var1.field3891 + class297.field5101 - class145.field2447;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field3872 + class297.field5101 - class145.field2447;
                    if (var15 > class297.field5101 + class297.field5101) {
                        var15 = class297.field5101 + class297.field5101;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field3893 + class297.field5101 - class64.field1134;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field3885 + class297.field5101 - class64.field1134;
                        if (var17 > class297.field5101 + class297.field5101) {
                            var17 = class297.field5101 + class297.field5101;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class232.field4032[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field3871 = 5;
                            var1.field3889 = (var1.field3878 - class190.field3359 << 8) / var13;
                            var1.field3888 = (var1.field3877 - class190.field3359 << 8) / var13;
                            var1.field3881 = (var1.field3875 - class289.field4986 << 8) / var13;
                            var1.field3890 = (var1.field3897 - class289.field4986 << 8) / var13;
                            class36.field480[class117.field2084++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(B)V", line = 405)
    public final void method1054(byte arg0) {
        field2644++;
        if (this.field2635 == null) {
            return;
        }
        this.field2635.field2636 = this.field2636;
        this.field2636.field2635 = this.field2635;
        this.field2636 = null;
        if (arg0 < 76) {
            field2640 = (class125) null;
        }
        this.field2635 = null;
    }
}
