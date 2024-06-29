import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class180 extends class258 {

    @OriginalMember(owner = "client!vc", name = "U", descriptor = "Lda;")
    public class212 field2926 = new class212();

    @OriginalMember(owner = "client!vc", name = "W", descriptor = "Lug;")
    public class200 field2927 = new class200();

    @OriginalMember(owner = "client!vc", name = "C", descriptor = "Lma;")
    private class152 field2908;

    @OriginalMember(owner = "client!vc", name = "P", descriptor = "Z")
    public static boolean field2921 = false;

    @OriginalMember(owner = "client!vc", name = "N", descriptor = "Lok;")
    public static class41 field2919 = class137.method956("Okay", 45);

    @OriginalMember(owner = "client!vc", name = "T", descriptor = "Lok;")
    private static class41 field2925 = class137.method956("Loaded interfaces", 45);

    @OriginalMember(owner = "client!vc", name = "S", descriptor = "Lok;")
    public static class41 field2924 = field2925;

    @OriginalMember(owner = "client!vc", name = "z", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!vc", name = "A", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!vc", name = "D", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!vc", name = "E", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!vc", name = "F", descriptor = "I")
    public static int field2911;

    @OriginalMember(owner = "client!vc", name = "G", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!vc", name = "H", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!vc", name = "I", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!vc", name = "J", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!vc", name = "K", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!vc", name = "M", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!vc", name = "Q", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!vc", name = "O", descriptor = "Lp;")
    public static class111 field2920;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1285(boolean arg0) {
        field2920 = null;
        field2919 = null;
        field2924 = null;
        field2925 = null;
        if (!arg0) {
            method1286(56, 53, -127, 14, -80, 77, 111);
        }
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IIIIIII)V", line = 18)
    public static final void method1286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 >= class273.field4449 && class153.field2439 >= arg0 && arg4 >= class15.field192 && class237.field3801 >= arg1) {
            if (arg6 == 1) {
                class317.method2185(arg3, arg4, false, arg5, arg1, arg0);
            } else {
                class94.method671(arg1, arg4, 0, arg0, arg5, arg6, arg3);
            }
        } else if (arg6 == 1) {
            class181.method1298(arg3, false, arg1, arg0, arg4, arg5);
        } else {
            class32.method225(49, arg3, arg1, arg6, arg0, arg4, arg5);
        }
        if (arg2 == 3652) {
            field2915++;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "([III)V", line = 56)
    public final void method1072(int[] arg0, int arg1, int arg2) {
        field2906++;
        this.field2927.method1072(arg0, arg1, arg2);
        for (class203 var4 = (class203) this.field2926.method1495(-312); var4 != null; var4 = (class203) this.field2926.method1501(-103)) {
            if (!this.field2908.method1044(-1, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field3275 >= var6) {
                        this.method1290(var6, true, var4, var5 + var6, var5, arg0);
                        var4.field3275 -= var6;
                        break;
                    }
                    this.method1290(var4.field3275, true, var4, var5 + var6, var5, arg0);
                    var6 -= var4.field3275;
                    var5 += var4.field3275;
                } while (!this.field2908.method1045(arg0, -2, var6, var4, var5));
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)V", line = 95)
    public static final void method1287(int arg0, byte arg1) {
        if (arg1 != 91) {
            return;
        }
        field2918++;
        class28.field415[2] = (float) class217.method1563(arg0, 255) / 255.0F;
        class28.field415[0] = (float) class217.method1563(255, arg0 >> 16) / 255.0F;
        class28.field415[1] = (float) class217.method1563(255, arg0 >> 8) / 255.0F;
        class196.method1402(arg1 ^ 0x29, 3);
        class196.method1402(-75, 4);
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "(IZ)I", line = 110)
    public static final int method1288(int arg0, boolean arg1) {
        field2913++;
        if (!arg1) {
            method1285(true);
        }
        if (class118.field1724 != null) {
            class118.field1724.method1570((byte) -116);
            class118.field1724 = null;
        }
        class138.field2066++;
        if (class138.field2066 > 4) {
            class138.field2066 = 0;
            class50.field763 = 0;
            return arg0;
        }
        class50.field763 = 0;
        if (class147.field2286 == class139.field2135) {
            class147.field2286 = class175.field2844;
        } else {
            class147.field2286 = class139.field2135;
        }
        return -1;
    }

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "()I", line = 144)
    public final int method1067() {
        field2910++;
        return 0;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLmh;)V", line = 153)
    public static final void method1289(byte arg0, class65 arg1) {
        field2907++;
        class75.field1121 = class289.method2015(arg1, 0, 21192, class111.field1580);
        class104.field1470 = new class279[class75.field1121.length];
        class35.field530 = new class279[class75.field1121.length];
        class89.field1303 = new class279[class75.field1121.length];
        for (int var2 = 0; var2 < class75.field1121.length; var2++) {
            class75.field1121[var2].method1975();
            class104.field1470[var2] = class75.field1121[var2].method1976();
            class75.field1121[var2].method1975();
            class35.field530[var2] = class75.field1121[var2].method1976();
            class75.field1121[var2].method1975();
            class89.field1303[var2] = class75.field1121[var2].method1976();
            class75.field1121[var2].method1975();
        }
        class60.field890 = class205.method1451(0, (byte) -86, arg1, class308.field5187);
        class139.field2132 = class79.method566(arg1, false, class86.field1269, 0);
        class110.field1566 = class79.method566(arg1, false, class80.field1179, 0);
        class23.field364 = class79.method566(arg1, false, class38.field593, 0);
        class2.field16 = class79.method566(arg1, false, class164.field2588, 0);
        class277.field4538 = class64.method442(class235.field3777, 0, arg1, -29202);
        class75.field1125 = class64.method442(class304.field5067, 0, arg1, -29202);
        class105.field1493 = class159.method1124(0, 0, arg1, class109.field1535);
        class199.field3202 = class64.method442(class249.field3968, 0, arg1, -29202);
        class139.field2141 = class64.method442(class171.field2761, 0, arg1, -29202);
        class140.field2164 = class226.method1621(false, arg1, class93.field1373, 0);
        class53.field790 = class226.method1621(false, arg1, class226.field3615, 0);
        class48.field749.method1802(class53.field790, (int[]) null);
        class244.field3898.method1802(class53.field790, (int[]) null);
        class140.field2165.method1802(class53.field790, (int[]) null);
        if (class166.field2625) {
            class263.field4176 = class289.method2015(arg1, 0, 21192, class89.field1309);
            for (int var3 = 0; var3 < class263.field4176.length; var3++) {
                class263.field4176[var3].method1974();
            }
        }
        class72 var4 = class1.method5(arg1, 0, 54, class301.field4886);
        var4.method537();
        if (class166.field2625) {
            class18.field238 = new class17(var4);
        } else {
            class18.field238 = var4;
        }
        class72[] var5 = class205.method1451(0, (byte) -77, arg1, class81.field1202);
        for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].method537();
        }
        if (class166.field2625) {
            class271.field4388 = new class199[var5.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class271.field4388[var7] = new class17(var5[var7]);
            }
        } else {
            class271.field4388 = var5;
        }
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 21.0D) - 10;
        int var11 = (int) (Math.random() * 41.0D) - 20;
        for (int var12 = 0; var12 < class60.field890.length; var12++) {
            class60.field890[var12].method523(var9 + var11, var8 - -var11, var10 + var11);
        }
        class75.field1121[0].method1968(var9 + var11, var8 + var11, var10 + var11);
        if (arg0 < 104) {
            method1285(false);
        }
        if (class166.field2625) {
            class8.field98 = new class199[class60.field890.length];
            for (int var13 = 0; var13 < class60.field890.length; var13++) {
                class8.field98[var13] = new class17(class60.field890[var13]);
            }
        } else {
            class8.field98 = class60.field890;
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "()Lcm;", line = 272)
    public final class258 method1070() {
        class203 var1 = (class203) this.field2926.method1495(-312);
        field2905++;
        if (var1 == null) {
            return null;
        } else if (var1.field3266 == null) {
            return this.method1075();
        } else {
            return var1.field3266;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IZLsk;II[I)V", line = 289)
    private final void method1290(int arg0, boolean arg1, class203 arg2, int arg3, int arg4, int[] arg5) {
        if ((this.field2908.field2415[arg2.field3265] & 0x4) != 0 && arg2.field3283 < 0) {
            int var7 = this.field2908.field2395[arg2.field3265] / class202.field3240;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field3264) / var7;
                if (arg0 < var8) {
                    arg2.field3264 += arg0 * var7;
                    break;
                }
                arg2.field3266.method1072(arg5, arg4, var8);
                arg4 += var8;
                arg2.field3264 += var7 * var8 - 1048576;
                int var9 = class202.field3240 / 100;
                arg0 -= var8;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                class215 var11 = arg2.field3266;
                if (this.field2908.field2413[arg2.field3265] == 0) {
                    arg2.field3266 = class215.method1535(arg2.field3257, var11.method1536(), var11.method1547(), var11.method1537());
                } else {
                    arg2.field3266 = class215.method1535(arg2.field3257, var11.method1536(), 0, var11.method1537());
                    this.field2908.method1060(8339977, arg2, arg2.field3276.field3342[arg2.field3270] < 0);
                    arg2.field3266.method1548(var9, var11.method1547());
                }
                if (arg2.field3276.field3342[arg2.field3270] < 0) {
                    arg2.field3266.method1538(-1);
                }
                var11.method1530(var9);
                var11.method1072(arg5, arg4, arg3 - arg4);
                if (var11.method1541()) {
                    this.field2927.method1422(var11);
                }
            }
        }
        if (arg1) {
            field2909++;
            arg2.field3266.method1072(arg5, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILsk;I)V", line = 358)
    private final void method1291(int arg0, class203 arg1, int arg2) {
        if ((this.field2908.field2415[arg1.field3265] & 0x4) != 0 && arg1.field3283 < 0) {
            int var4 = this.field2908.field2395[arg1.field3265] / class202.field3240;
            int var5 = (var4 + 1048575 - arg1.field3264) / var4;
            arg1.field3264 = arg1.field3264 + (arg2 * var4) & 0xFFFFF;
            if (arg2 >= var5) {
                if (this.field2908.field2413[arg1.field3265] == 0) {
                    arg1.field3266 = class215.method1535(arg1.field3257, arg1.field3266.method1536(), arg1.field3266.method1547(), arg1.field3266.method1537());
                } else {
                    arg1.field3266 = class215.method1535(arg1.field3257, arg1.field3266.method1536(), 0, arg1.field3266.method1537());
                    this.field2908.method1060(8339977, arg1, arg1.field3276.field3342[arg1.field3270] < 0);
                }
                if (arg1.field3276.field3342[arg1.field3270] < 0) {
                    arg1.field3266.method1538(-1);
                }
                arg2 = arg1.field3264 / var4;
            }
        }
        field2922++;
        if (arg0 > 71) {
            arg1.field3266.method1054(arg2);
        }
    }

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "(B)V", line = 400)
    public static final void method1292(byte arg0) {
        class35.field527.method135(18436);
        if (arg0 != 65) {
            method1289((byte) 123, (class65) null);
        }
        field2912++;
        class289.field4692.method135(18436);
        class81.field1190.method135(18436);
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "(I)V", line = 414)
    public final void method1054(int arg0) {
        this.field2927.method1054(arg0);
        field2917++;
        for (class203 var2 = (class203) this.field2926.method1495(-312); var2 != null; var2 = (class203) this.field2926.method1501(-116)) {
            if (!this.field2908.method1044(-1, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3275) {
                        this.method1291(101, var2, var3);
                        var2.field3275 -= var3;
                        break;
                    }
                    this.method1291(109, var2, var2.field3275);
                    var3 -= var2.field3275;
                } while (!this.field2908.method1045((int[]) null, -2, var3, var2, 0));
            }
        }
    }

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "()Lcm;", line = 449)
    public final class258 method1075() {
        field2914++;
        class203 var1;
        do {
            var1 = (class203) this.field2926.method1501(115);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3266 == null);
        return var1.field3266;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIBIIII)V", line = 476)
    public static final void method1293(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != 10) {
            field2925 = (class41) null;
        }
        field2916++;
        if (class32.method223(arg4, 255)) {
            client.method2123(class273.field4446[arg4], -1, arg5, arg6, arg1, arg0, arg2, arg7);
        }
    }

    @OriginalMember(owner = "client!vc", name = "e", descriptor = "(I)V", line = 495)
    public static final void method1294(int arg0) {
        for (int var1 = arg0; var1 < class85.field1239; var1++) {
            int var2 = class241.field3853[var1];
            class245 var3 = class246.field3955[var2];
            int var4 = class164.field2597.method792(2);
            if ((var4 & 0x8) != 0) {
                var4 += class164.field2597.method792(2) << 8;
            }
            class125.method878(var3, var4, 100, var2);
        }
        field2923++;
    }

    @OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(Lma;)V", line = 535)
    public class180(class152 arg0) {
        this.field2908 = arg0;
    }
}
