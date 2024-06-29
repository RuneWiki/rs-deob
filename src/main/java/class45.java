import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class45 extends class128 {

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
    public int field1191;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    private int field1181;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "[I")
    public int[] field1187;

    @OriginalMember(owner = "client!gb", name = "x", descriptor = "[[I")
    public int[][] field1175;

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "Lid;")
    public static class60 field1176 = class11.method72("titlebox", (byte) -122);

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "Lid;")
    private static class60 field1182 = class11.method72("M", (byte) 127);

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
    public static volatile int field1189 = 0;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "[I")
    public static int[] field1183 = new int[] { 39, 35, 15, 13, 51, 29, 7, 32 };

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "Lid;")
    public static class60 field1193 = field1182;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "Lid;")
    private static class60 field1190 = class11.method72("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", (byte) 94);

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "J")
    public static long field1195 = 0L;

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "Lid;")
    public static class60 field1194 = field1182;

    @OriginalMember(owner = "client!gb", name = "w", descriptor = "Lid;")
    public static class60 field1174 = field1190;

    @OriginalMember(owner = "client!gb", name = "u", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
    public static int field1173;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "I")
    public static int field1184;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "Lfd;")
    public static class40 field1192;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "Lhf;")
    public static class55 field1179;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "[[Lfd;")
    public static class40[][] field1177;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)V")
    public static final void method348(byte arg0, int arg1) {
        field1173++;
        if (class48.field1265 == arg1) {
            return;
        }
        if (arg0 > -68) {
            method354(-76, 45, -118, 59);
        }
        if (class48.field1265 == 0) {
            class129.method1014(14179);
        }
        if (arg1 == 20 || arg1 == 40) {
            class51.field1295 = 0;
            class55.field1368 = 0;
            class42.field1123 = 0;
        }
        if (arg1 != 20 && arg1 != 40 && class153.field3447 != null) {
            class153.field3447.method729(false);
            class153.field3447 = null;
        }
        if (class48.field1265 == 25) {
            class136.field3081 = 0;
            class102.field2474 = 0;
            class148.field3372 = 0;
            class13.field235 = 1;
            class120.field2757 = 1;
        }
        if (arg1 == 5 || arg1 == 10 || arg1 == 20) {
            class140.method1087(class153.field3428, (byte) 104, class56.field1407, class9.field148);
        } else {
            class18.method147((byte) 97);
        }
        class48.field1265 = arg1;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
    public static void method349(int arg0) {
        field1182 = null;
        field1183 = null;
        field1179 = null;
        field1193 = null;
        int var1 = -92 / ((arg0 - 56) / 38);
        field1190 = null;
        field1176 = null;
        field1177 = null;
        field1192 = null;
        field1194 = null;
        field1174 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIBI)V")
    public static final void method350(int arg0, int arg1, byte arg2, int arg3) {
        field1178++;
        class40 var4 = class158.method1218(12777, arg3, arg0);
        if (var4 != null && var4.field994 != null) {
            class15 var5 = new class15();
            var5.field353 = var4.field994;
            var5.field361 = var4;
            class61.method467(false, var5);
        }
        class135.field3073 = arg0;
        class1.field17 = true;
        class7.field100 = arg1;
        class10.field159 = arg3;
        if (arg2 <= -76) {
            class12.method79(-30833, var4);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lfd;I)Z")
    public static final boolean method351(class40 arg0, int arg1) {
        if (arg1 != 23154) {
            method352(-17, 96, null, -48, -43);
        }
        field1188++;
        if (class40.field1000) {
            if (class97.method770(arg0, -1370253216) != 0) {
                return false;
            }
            if (arg0.field938 == 0) {
                return false;
            }
        }
        return arg0.field1064;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILwa;II)V")
    public static final void method352(int arg0, int arg1, class154 arg2, int arg3, int arg4) {
        if (arg4 != 0) {
            return;
        }
        field1185++;
        if (class80.field1956 >= 400) {
            return;
        }
        if (arg2.field3499 != null) {
            arg2 = arg2.method1169(arg4 ^ 0xFFFFC7A8);
        }
        if (arg2 == null || !arg2.field3497) {
            return;
        }
        class60 var5 = arg2.field3456;
        if (arg2.field3501 != 0) {
            var5 = class104.method853(arg4 ^ 0xFFFFFF8C, new class60[] { var5, class18.method149(class107.field2640.field13, -17976, arg2.field3501), class128.field2936, class121.field2771, class98.method774((byte) -121, arg2.field3501), class13.field238 });
        }
        if (class155.field3546 == 1) {
            class30.field702++;
            class82.method689(arg3, 16, (byte) 108, class104.method853(-111, new class60[] { class85.field2121, class141.field3223, var5 }), arg1, arg0, class81.field2014);
        } else if (!class1.field17) {
            class33.field779++;
            class60[] var6 = arg2.field3476;
            if (class13.field245) {
                var6 = class19.method154(var6, arg4 ^ 0xFFFF8764);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method426(class9.field149, (byte) 37)) {
                        byte var8 = 0;
                        class90.field2253++;
                        if (var7 == 0) {
                            var8 = 22;
                        }
                        if (var7 == 1) {
                            var8 = 8;
                        }
                        if (var7 == 2) {
                            var8 = 14;
                        }
                        if (var7 == 3) {
                            var8 = 10;
                        }
                        if (var7 == 4) {
                            var8 = 3;
                        }
                        class82.method689(arg3, var8, (byte) -123, class104.method853(-116, new class60[] { class34.field790, var5 }), arg1, arg0, var6[var7]);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method426(class9.field149, (byte) 37)) {
                        class69.field1644++;
                        short var10 = 0;
                        if (arg2.field3501 > class107.field2640.field13) {
                            var10 = 2000;
                        }
                        int var11 = 0;
                        if (var9 == 0) {
                            var11 = var10 + 22;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 8;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 14;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 10;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 3;
                        }
                        class82.method689(arg3, var11, (byte) 121, class104.method853(-103, new class60[] { class34.field790, var5 }), arg1, arg0, var6[var9]);
                    }
                }
            }
            class82.method689(arg3, 1002, (byte) 122, class104.method853(-106, new class60[] { class34.field790, var5 }), arg1, arg0, class153.field3450);
            return;
        } else if ((class7.field100 & 0x2) == 2) {
            class64.field1607++;
            class82.method689(arg3, 33, (byte) 118, class104.method853(arg4 - 128, new class60[] { class56.field1389, class141.field3223, var5 }), arg1, arg0, class35.field857);
            return;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)V")
    public static final void method353(boolean arg0) {
        field1180++;
        if (!arg0) {
            field1195 = 1L;
        }
        for (int var1 = 0; var1 < class35.field884; var1++) {
            int var2 = class19.field471[var1];
            class1 var3 = class81.field2016[var2];
            int var4 = class56.field1393.method829((byte) 109);
            if ((var4 & 0x10) != 0) {
                var4 += class56.field1393.method829((byte) -76) << 8;
            }
            class151.method1152(var3, var4, 1, var2);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIII)I")
    public static final int method354(int arg0, int arg1, int arg2, int arg3) {
        field1172++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else if (arg0 < 28) {
            return -8;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(I[B)V")
    public class45(int arg0, byte[] arg1) {
        this.field1191 = arg0;
        class103 var3 = new class103(arg1);
        this.field1181 = var3.method829((byte) 97);
        this.field1187 = new int[this.field1181];
        this.field1175 = new int[this.field1181][];
        for (int var4 = 0; var4 < this.field1181; var4++) {
            this.field1187[var4] = var3.method829((byte) -91);
        }
        for (int var5 = 0; var5 < this.field1181; var5++) {
            this.field1175[var5] = new int[var3.method829((byte) 80)];
        }
        for (int var6 = 0; var6 < this.field1181; var6++) {
            for (int var7 = 0; var7 < this.field1175[var6].length; var7++) {
                this.field1175[var6][var7] = var3.method829((byte) -102);
            }
        }
    }
}
