import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class313 extends class128 {

    @OriginalMember(owner = "client!be", name = "P", descriptor = "I")
    private int field4841 = 4096;

    @OriginalMember(owner = "client!be", name = "H", descriptor = "F")
    public static float field4833;

    @OriginalMember(owner = "client!be", name = "I", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!be", name = "J", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!be", name = "K", descriptor = "I")
    public static int field4836;

    @OriginalMember(owner = "client!be", name = "L", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!be", name = "M", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!be", name = "N", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!be", name = "O", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!be", name = "Q", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!be", name = "R", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lp;II)V", line = 8)
    public final void method107(class107 arg0, int arg1, int arg2) {
        field4835++;
        if (arg1 == 0) {
            this.field4841 = arg0.method624(14612);
        }
        if (arg2 >= -85) {
            this.method107((class107) null, -67, -89);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IC)Z", line = 26)
    private static final boolean method2194(int arg0, char arg1) {
        if (arg0 != -11206) {
            method2195((class176) null, -42, false);
        }
        field4839++;
        return arg1 >= '0' && arg1 <= '9';
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V", line = 36)
    public class313() {
        super(1, true);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(BI)[I", line = 46)
    public final int[] method126(byte arg0, int arg1) {
        field4836++;
        if (arg0 < 100) {
            field4842 = 105;
        }
        int[] var3 = this.field1748.method902(arg1, true);
        if (this.field1748.field1878) {
            int[] var4 = this.method851((byte) -83, 0, arg1 - 1 & class237.field3486);
            int[] var5 = this.method851((byte) -101, 0, arg1);
            int[] var6 = this.method851((byte) -84, 0, arg1 + 1 & class237.field3486);
            for (int var7 = 0; var7 < class10.field141; var7++) {
                int var8 = (var5[var7 + 1 & class244.field3664] - var5[var7 - 1 & class244.field3664]) * this.field4841;
                int var9 = var8 >> 12;
                int var10 = (var6[var7] - var4[var7]) * this.field4841;
                int var11 = var9 * var9 >> 12;
                int var12 = var10 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var11 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lmn;IZ)V", line = 100)
    public static final void method2195(class176 arg0, int arg1, boolean arg2) {
        field4838++;
        Object[] var3 = arg0.field2551;
        int var4 = (Integer) var3[0];
        class1 var5 = class40.method235(var4, false);
        if (var5 == null) {
            return;
        }
        class296.field4617 = 0;
        int var6 = 0;
        int var7 = 0;
        if (!arg2) {
            field4843 = -113;
        }
        int var8 = -1;
        int[] var9 = var5.field11;
        byte var10 = -1;
        int[] var11 = var5.field5;
        try {
            class161.field2214 = new String[var5.field10];
            class35.field412 = new int[var5.field7];
            int var12 = 0;
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if ((var3[var14] instanceof Integer)) {
                    int var16 = (Integer) var3[var14];
                    if (var16 == -2147483647) {
                        var16 = arg0.field2550;
                    }
                    if (var16 == -2147483646) {
                        var16 = arg0.field2562;
                    }
                    if (var16 == -2147483645) {
                        var16 = arg0.field2552 == null ? -1 : arg0.field2552.field4083;
                    }
                    if (var16 == -2147483644) {
                        var16 = arg0.field2564;
                    }
                    if (var16 == -2147483643) {
                        var16 = arg0.field2552 == null ? -1 : arg0.field2552.field4012;
                    }
                    if (var16 == -2147483642) {
                        var16 = arg0.field2557 == null ? -1 : arg0.field2557.field4083;
                    }
                    if (var16 == -2147483641) {
                        var16 = arg0.field2557 == null ? -1 : arg0.field2557.field4012;
                    }
                    if (var16 == -2147483640) {
                        var16 = arg0.field2554;
                    }
                    if (var16 == -2147483639) {
                        var16 = arg0.field2556;
                    }
                    class35.field412[var12++] = var16;
                } else if (var3[var14] instanceof String) {
                    String var15 = (String) var3[var14];
                    if (var15.equals("event_opbase")) {
                        var15 = arg0.field2553;
                    }
                    class161.field2214[var13++] = var15;
                }
            }
            int var17 = 0;
            label4434: while (true) {
                var17++;
                if (arg1 < var17) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var528 = var9[var8];
                if (var528 < 100) {
                    if (var528 == 0) {
                        class67.field881[var6++] = var11[var8];
                        continue;
                    }
                    if (var528 == 1) {
                        int var18 = var11[var8];
                        class67.field881[var6++] = class226.field3235[var18];
                        continue;
                    }
                    if (var528 == 2) {
                        int var19 = var11[var8];
                        var6--;
                        class206.method1399(var19, class67.field881[var6], -67);
                        continue;
                    }
                    if (var528 == 3) {
                        class284.field4450[var7++] = var5.field9[var8];
                        continue;
                    }
                    if (var528 == 6) {
                        var8 += var11[var8];
                        continue;
                    }
                    if (var528 == 7) {
                        var6 -= 2;
                        if (class67.field881[var6 + 1] != class67.field881[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var528 == 8) {
                        var6 -= 2;
                        if (class67.field881[var6 + 1] == class67.field881[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var528 == 9) {
                        var6 -= 2;
                        if (class67.field881[var6] < class67.field881[var6 + 1]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var528 == 10) {
                        var6 -= 2;
                        if (class67.field881[var6 + 1] < class67.field881[var6]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var528 == 21) {
                        if (class296.field4617 == 0) {
                            return;
                        }
                        class249 var20 = class103.field1329[--class296.field4617];
                        class161.field2214 = var20.field3770;
                        class35.field412 = var20.field3775;
                        var8 = var20.field3774;
                        var5 = var20.field3767;
                        var9 = var5.field11;
                        var11 = var5.field5;
                        continue;
                    }
                    if (var528 == 25) {
                        int var21 = var11[var8];
                        class67.field881[var6++] = class292.method2080((byte) 85, var21);
                        continue;
                    }
                    if (var528 == 27) {
                        int var22 = var11[var8];
                        var6--;
                        class326.method2258(24569, var22, class67.field881[var6]);
                        continue;
                    }
                    if (var528 == 31) {
                        var6 -= 2;
                        if (class67.field881[var6] <= class67.field881[var6 + 1]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var528 == 32) {
                        var6 -= 2;
                        if (class67.field881[var6] >= class67.field881[var6 + 1]) {
                            var8 += var11[var8];
                        }
                        continue;
                    }
                    if (var528 == 33) {
                        class67.field881[var6++] = class35.field412[var11[var8]];
                        continue;
                    }
                    int var10001;
                    if (var528 == 34) {
                        var10001 = var11[var8];
                        var6--;
                        class35.field412[var10001] = class67.field881[var6];
                        continue;
                    }
                    if (var528 == 35) {
                        class284.field4450[var7++] = class161.field2214[var11[var8]];
                        continue;
                    }
                    if (var528 == 36) {
                        var10001 = var11[var8];
                        var7--;
                        class161.field2214[var10001] = class284.field4450[var7];
                        continue;
                    }
                    if (var528 == 37) {
                        int var23 = var11[var8];
                        var7 -= var23;
                        String var24 = class20.method124(var7, class284.field4450, var23, 3);
                        class284.field4450[var7++] = var24;
                        continue;
                    }
                    if (var528 == 38) {
                        var6--;
                        continue;
                    }
                    if (var528 == 39) {
                        var7--;
                        continue;
                    }
                    if (var528 == 40) {
                        int var25 = var11[var8];
                        class1 var26 = class40.method235(var25, !arg2);
                        int[] var27 = new int[var26.field7];
                        String[] var28 = new String[var26.field10];
                        for (int var29 = 0; var29 < var26.field2; var29++) {
                            var27[var29] = class67.field881[var6 - (var26.field2 - var29)];
                        }
                        for (int var30 = 0; var30 < var26.field8; var30++) {
                            var28[var30] = class284.field4450[var30 + var7 - var26.field8];
                        }
                        var6 -= var26.field2;
                        var7 -= var26.field8;
                        class249 var31 = new class249();
                        var31.field3775 = class35.field412;
                        var31.field3774 = var8;
                        var31.field3767 = var5;
                        var31.field3770 = class161.field2214;
                        if (class103.field1329.length <= class296.field4617) {
                            throw new RuntimeException();
                        }
                        var5 = var26;
                        class103.field1329[class296.field4617++] = var31;
                        var8 = -1;
                        var9 = var26.field11;
                        class161.field2214 = var28;
                        var11 = var26.field5;
                        class35.field412 = var27;
                        continue;
                    }
                    if (var528 == 42) {
                        class67.field881[var6++] = class259.field3936[var11[var8]];
                        continue;
                    }
                    if (var528 == 43) {
                        int var32 = var11[var8];
                        var6--;
                        class259.field3936[var32] = class67.field881[var6];
                        class59.method341(-86, var32);
                        continue;
                    }
                    if (var528 == 44) {
                        int var33 = var11[var8] >> 16;
                        var6--;
                        int var34 = class67.field881[var6];
                        int var35 = var11[var8] & 0xFFFF;
                        if (var34 >= 0 && var34 <= 5000) {
                            byte var36 = -1;
                            if (var35 == 105) {
                                var36 = 0;
                            }
                            class309.field4778[var33] = var34;
                            int var37 = 0;
                            while (true) {
                                if (var34 <= var37) {
                                    continue label4434;
                                }
                                class284.field4461[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 45) {
                        int var38 = var11[var8];
                        var6--;
                        int var39 = class67.field881[var6];
                        if (var39 >= 0 && class309.field4778[var38] > var39) {
                            class67.field881[var6++] = class284.field4461[var38][var39];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 46) {
                        var6 -= 2;
                        int var40 = class67.field881[var6];
                        int var41 = var11[var8];
                        if (var40 >= 0 && class309.field4778[var41] > var40) {
                            class284.field4461[var41][var40] = class67.field881[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 47) {
                        String var42 = class30.field382[var11[var8]];
                        if (var42 == null) {
                            var42 = "null";
                        }
                        class284.field4450[var7++] = var42;
                        continue;
                    }
                    if (var528 == 48) {
                        int var43 = var11[var8];
                        var7--;
                        class30.field382[var43] = class284.field4450[var7];
                        class5.method18(var43, (byte) -125);
                        continue;
                    }
                    if (var528 == 51) {
                        class224 var44 = var5.field1[var11[var8]];
                        var6--;
                        class172 var45 = (class172) var44.method1537((long) class67.field881[var6], -22708);
                        if (var45 != null) {
                            var8 += var45.field2483;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var11[var8] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var528 < 300) {
                    if (var528 == 100) {
                        var6 -= 3;
                        int var47 = class67.field881[var6];
                        int var48 = class67.field881[var6 + 1];
                        int var49 = class67.field881[var6 + 2];
                        if (var48 != 0) {
                            class263 var50 = class91.method530(var47, 10989328);
                            if (var50.field3975 == null) {
                                var50.field3975 = new class263[var49 + 1];
                            }
                            if (var50.field3975.length <= var49) {
                                class263[] var51 = new class263[var49 + 1];
                                for (int var52 = 0; var52 < var50.field3975.length; var52++) {
                                    var51[var52] = var50.field3975[var52];
                                }
                                var50.field3975 = var51;
                            }
                            if (var49 > 0 && var50.field3975[var49 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var49 - 1));
                            }
                            class263 var53 = new class263();
                            var53.field3993 = true;
                            var53.field3981 = var48;
                            var53.field4012 = var49;
                            var53.field4065 = var53.field4083 = var50.field4083;
                            var50.field3975[var49] = var53;
                            if (var46) {
                                class301.field4702 = var53;
                            } else {
                                class23.field310 = var53;
                            }
                            class239.method1712(0, var50);
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var528 == 101) {
                        class263 var54 = var46 ? class301.field4702 : class23.field310;
                        if (var54.field4012 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class263 var55 = class91.method530(var54.field4083, 10989328);
                        var55.field3975[var54.field4012] = null;
                        class239.method1712(0, var55);
                        continue;
                    }
                    if (var528 == 102) {
                        var6--;
                        class263 var56 = class91.method530(class67.field881[var6], 10989328);
                        var56.field3975 = null;
                        class239.method1712(0, var56);
                        continue;
                    }
                    if (var528 == 200) {
                        var6 -= 2;
                        int var57 = class67.field881[var6];
                        int var58 = class67.field881[var6 + 1];
                        class263 var59 = class176.method1211(1, var57, var58);
                        if (var59 != null && var58 != -1) {
                            class67.field881[var6++] = 1;
                            if (var46) {
                                class301.field4702 = var59;
                            } else {
                                class23.field310 = var59;
                            }
                            continue;
                        }
                        class67.field881[var6++] = 0;
                        continue;
                    }
                    if (var528 == 201) {
                        var6--;
                        int var60 = class67.field881[var6];
                        class263 var61 = class91.method530(var60, 10989328);
                        if (var61 == null) {
                            class67.field881[var6++] = 0;
                        } else {
                            class67.field881[var6++] = 1;
                            if (var46) {
                                class301.field4702 = var61;
                            } else {
                                class23.field310 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var528 < 500) {
                    if (var528 == 403) {
                        var6 -= 2;
                        int var516 = class67.field881[var6];
                        int var517 = class67.field881[var6 + 1];
                        for (int var518 = 0; var518 < class305.field4730.length; var518++) {
                            if (class305.field4730[var518] == var516) {
                                class118.field1664.field1510.method2308(var518, var517, 92);
                                continue label4434;
                            }
                        }
                        int var519 = 0;
                        while (true) {
                            if (var519 >= class94.field1233.length) {
                                continue label4434;
                            }
                            if (class94.field1233[var519] == var516) {
                                class118.field1664.field1510.method2308(var519, var517, 103);
                                continue label4434;
                            }
                            var519++;
                        }
                    }
                    if (var528 == 404) {
                        var6 -= 2;
                        int var520 = class67.field881[var6 + 1];
                        int var521 = class67.field881[var6];
                        class118.field1664.field1510.method2311(var520, var521, (byte) -108);
                        continue;
                    }
                    if (var528 == 410) {
                        var6--;
                        boolean var522 = class67.field881[var6] != 0;
                        class118.field1664.field1510.method2310((byte) 57, var522);
                        continue;
                    }
                } else if (var528 >= 1000 && var528 < 1100 || var528 >= 2000 && var528 < 2100) {
                    class263 var510;
                    if (var528 >= 2000) {
                        var528 -= 1000;
                        var6--;
                        var510 = class91.method530(class67.field881[var6], 10989328);
                    } else {
                        var510 = var46 ? class301.field4702 : class23.field310;
                    }
                    if (var528 == 1000) {
                        var6 -= 4;
                        var510.field3974 = class67.field881[var6];
                        var510.field4105 = class67.field881[var6 + 1];
                        int var511 = class67.field881[var6 + 2];
                        int var512 = class67.field881[var6 + 3];
                        if (var511 < 0) {
                            var511 = 0;
                        } else if (var511 > 5) {
                            var511 = 5;
                        }
                        var510.field4118 = (byte) var511;
                        if (var512 < 0) {
                            var512 = 0;
                        } else if (var512 > 5) {
                            var512 = 5;
                        }
                        var510.field4045 = (byte) var512;
                        class239.method1712(0, var510);
                        class15.method103(var510, 71);
                        if (var510.field4012 == -1) {
                            class1.method2(var510.field4083, 110);
                        }
                        continue;
                    }
                    if (var528 == 1001) {
                        var6 -= 4;
                        var510.field4092 = class67.field881[var6];
                        var510.field4155 = class67.field881[var6 + 1];
                        var510.field4028 = 0;
                        var510.field4102 = 0;
                        int var513 = class67.field881[var6 + 2];
                        int var514 = class67.field881[var6 + 3];
                        if (var513 < 0) {
                            var513 = 0;
                        } else if (var513 > 4) {
                            var513 = 4;
                        }
                        var510.field4062 = (byte) var513;
                        if (var514 < 0) {
                            var514 = 0;
                        } else if (var514 > 4) {
                            var514 = 4;
                        }
                        var510.field4122 = (byte) var514;
                        class239.method1712(0, var510);
                        class15.method103(var510, -100);
                        if (var510.field3981 == 0) {
                            class112.method769(var510, false, 268219088);
                        }
                        continue;
                    }
                    if (var528 == 1003) {
                        var6--;
                        boolean var515 = class67.field881[var6] == 1;
                        if (var510.field4001 != var515) {
                            var510.field4001 = var515;
                            class239.method1712(0, var510);
                        }
                        if (var510.field4012 == -1) {
                            class205.method1397((byte) -34, var510.field4083);
                        }
                        continue;
                    }
                    if (var528 == 1004) {
                        var6 -= 2;
                        var510.field3991 = class67.field881[var6];
                        var510.field4008 = class67.field881[var6 + 1];
                        class239.method1712(0, var510);
                        class15.method103(var510, 84);
                        if (var510.field3981 == 0) {
                            class112.method769(var510, false, 268219088);
                        }
                        continue;
                    }
                    if (var528 == 1005) {
                        var6--;
                        var510.field4046 = class67.field881[var6] == 1;
                        continue;
                    }
                } else if (!(var528 < 1100 || var528 >= 1200) || !(var528 < 2100 || var528 >= 2200)) {
                    class263 var506;
                    if (var528 >= 2000) {
                        var528 -= 1000;
                        var6--;
                        var506 = class91.method530(class67.field881[var6], 10989328);
                    } else {
                        var506 = var46 ? class301.field4702 : class23.field310;
                    }
                    if (var528 == 1100) {
                        var6 -= 2;
                        var506.field4068 = class67.field881[var6];
                        if (var506.field4068 > var506.field3984 - var506.field3989) {
                            var506.field4068 = var506.field3984 - var506.field3989;
                        }
                        if (var506.field4068 < 0) {
                            var506.field4068 = 0;
                        }
                        var506.field3990 = class67.field881[var6 + 1];
                        if ((var506.field4059 - var506.field4096) < var506.field3990) {
                            var506.field3990 = var506.field4059 - var506.field4096;
                        }
                        if (var506.field3990 < 0) {
                            var506.field3990 = 0;
                        }
                        class239.method1712(0, var506);
                        if (var506.field4012 == -1) {
                            class257.method1864(var506.field4083, (byte) -98);
                        }
                        continue;
                    }
                    if (var528 == 1101) {
                        var6--;
                        var506.field4063 = class67.field881[var6];
                        class239.method1712(0, var506);
                        if (var506.field4012 == -1) {
                            class40.method236((byte) 17, var506.field4083);
                        }
                        continue;
                    }
                    if (var528 == 1102) {
                        var6--;
                        var506.field4082 = class67.field881[var6] == 1;
                        class239.method1712(0, var506);
                        continue;
                    }
                    if (var528 == 1103) {
                        var6--;
                        var506.field3992 = class67.field881[var6];
                        class239.method1712(0, var506);
                        continue;
                    }
                    if (var528 == 1104) {
                        var6--;
                        var506.field4116 = class67.field881[var6];
                        class239.method1712(0, var506);
                        continue;
                    }
                    if (var528 == 1105) {
                        var6--;
                        var506.field4066 = class67.field881[var6];
                        class239.method1712(0, var506);
                        continue;
                    }
                    if (var528 == 1106) {
                        var6--;
                        var506.field4011 = class67.field881[var6];
                        class239.method1712(0, var506);
                        continue;
                    }
                    if (var528 == 1107) {
                        var6--;
                        var506.field4023 = class67.field881[var6] == 1;
                        class239.method1712(0, var506);
                        continue;
                    }
                    if (var528 == 1108) {
                        var506.field4142 = 1;
                        var6--;
                        var506.field4034 = class67.field881[var6];
                        class239.method1712(0, var506);
                        if (var506.field4012 == -1) {
                            class223.method1531(true, var506.field4083);
                        }
                        continue;
                    }
                    if (var528 == 1109) {
                        var6 -= 6;
                        var506.field4115 = class67.field881[var6];
                        var506.field4061 = class67.field881[var6 + 1];
                        var506.field4131 = class67.field881[var6 + 2];
                        var506.field4120 = class67.field881[var6 + 3];
                        var506.field4021 = class67.field881[var6 + 4];
                        var506.field4136 = class67.field881[var6 + 5];
                        class239.method1712(0, var506);
                        if (var506.field4012 == -1) {
                            class284.method2031(var506.field4083, 8);
                            class258.method1868(1002, var506.field4083);
                        }
                        continue;
                    }
                    if (var528 == 1110) {
                        var6--;
                        int var507 = class67.field881[var6];
                        if (var506.field4134 != var507) {
                            var506.field4050 = 0;
                            var506.field4042 = 1;
                            var506.field4153 = 0;
                            var506.field4134 = var507;
                            class239.method1712(0, var506);
                        }
                        if (var506.field4012 == -1) {
                            class218.method1503(5, var506.field4083);
                        }
                        continue;
                    }
                    if (var528 == 1111) {
                        var6--;
                        var506.field4010 = class67.field881[var6] == 1;
                        class239.method1712(0, var506);
                        continue;
                    }
                    if (var528 == 1112) {
                        var7--;
                        String var508 = class284.field4450[var7];
                        if (!var508.equals(var506.field3999)) {
                            var506.field3999 = var508;
                            class239.method1712(0, var506);
                        }
                        if (var506.field4012 == -1) {
                            class9.method48((byte) -73, var506.field4083);
                        }
                        continue;
                    }
                    if (var528 == 1113) {
                        var6--;
                        var506.field4110 = class67.field881[var6];
                        class239.method1712(0, var506);
                        continue;
                    }
                    if (var528 == 1114) {
                        var6 -= 3;
                        var506.field4018 = class67.field881[var6];
                        var506.field4097 = class67.field881[var6 + 1];
                        var506.field4005 = class67.field881[var6 + 2];
                        class239.method1712(0, var506);
                        continue;
                    }
                    if (var528 == 1115) {
                        var6--;
                        var506.field4087 = class67.field881[var6] == 1;
                        class239.method1712(0, var506);
                        continue;
                    }
                    if (var528 == 1116) {
                        var6--;
                        var506.field4056 = class67.field881[var6];
                        class239.method1712(0, var506);
                        continue;
                    }
                    if (var528 == 1117) {
                        var6--;
                        var506.field3982 = class67.field881[var6];
                        class239.method1712(0, var506);
                        continue;
                    }
                    if (var528 == 1118) {
                        var6--;
                        var506.field4128 = class67.field881[var6] == 1;
                        class239.method1712(0, var506);
                        continue;
                    }
                    if (var528 == 1119) {
                        var6--;
                        var506.field4152 = class67.field881[var6] == 1;
                        class239.method1712(0, var506);
                        continue;
                    }
                    if (var528 == 1120) {
                        var6 -= 2;
                        var506.field3984 = class67.field881[var6];
                        var506.field4059 = class67.field881[var6 + 1];
                        class239.method1712(0, var506);
                        if (var506.field3981 == 0) {
                            class112.method769(var506, false, 268219088);
                        }
                        continue;
                    }
                    if (var528 == 1121) {
                        var6 -= 2;
                        var506.field4141 = (short) class67.field881[var6];
                        var506.field4076 = (short) class67.field881[var6 + 1];
                        class239.method1712(0, var506);
                        continue;
                    }
                    if (var528 == 1122) {
                        var6--;
                        var506.field4019 = class67.field881[var6] == 1;
                        class239.method1712(0, var506);
                        continue;
                    }
                    if (var528 == 1123) {
                        var6--;
                        var506.field4136 = class67.field881[var6];
                        class239.method1712(0, var506);
                        if (var506.field4012 == -1) {
                            class284.method2031(var506.field4083, 8);
                        }
                        continue;
                    }
                    if (var528 == 1124) {
                        var6--;
                        int var509 = class67.field881[var6];
                        var506.field4123 = var509 == 1;
                        class239.method1712(0, var506);
                        continue;
                    }
                } else if (!(var528 < 1200 || var528 >= 1300) || !(var528 < 2200 || var528 >= 2300)) {
                    class263 var502;
                    if (var528 < 2000) {
                        var502 = var46 ? class301.field4702 : class23.field310;
                    } else {
                        var528 -= 1000;
                        var6--;
                        var502 = class91.method530(class67.field881[var6], 10989328);
                    }
                    class239.method1712(0, var502);
                    if (var528 == 1200 || var528 == 1205 || var528 == 1208 || var528 == 1209) {
                        var6 -= 2;
                        int var503 = class67.field881[var6];
                        int var504 = class67.field881[var6 + 1];
                        if (var502.field4012 == -1) {
                            class79.method473(true, var502.field4083);
                            class284.method2031(var502.field4083, 8);
                            class258.method1868(1002, var502.field4083);
                        }
                        if (var503 == -1) {
                            var502.field4142 = 1;
                            var502.field4034 = -1;
                            var502.field4000 = -1;
                            continue;
                        }
                        var502.field4000 = var503;
                        var502.field4022 = var504;
                        if (var528 == 1208 || var528 == 1209) {
                            var502.field4085 = true;
                        } else {
                            var502.field4085 = false;
                        }
                        class93 var505 = class60.method353(var503, (byte) -124);
                        var502.field4115 = var505.field1200;
                        var502.field4061 = var505.field1218;
                        var502.field4021 = var505.field1156;
                        var502.field4136 = var505.field1214;
                        if (var528 == 1205) {
                            var502.field4107 = false;
                        } else {
                            var502.field4107 = true;
                        }
                        var502.field4120 = var505.field1198;
                        var502.field4131 = var505.field1186;
                        if (var502.field4028 > 0) {
                            var502.field4136 = var502.field4136 * 32 / var502.field4028;
                        } else if (var502.field4092 > 0) {
                            var502.field4136 = var502.field4136 * 32 / var502.field4092;
                        }
                        continue;
                    }
                    if (var528 == 1201) {
                        var502.field4142 = 2;
                        var6--;
                        var502.field4034 = class67.field881[var6];
                        if (var502.field4012 == -1) {
                            class223.method1531(true, var502.field4083);
                        }
                        continue;
                    }
                    if (var528 == 1202) {
                        var502.field4142 = 3;
                        var502.field4034 = class118.field1664.field1510.method2317(40);
                        if (var502.field4012 == -1) {
                            class223.method1531(true, var502.field4083);
                        }
                        continue;
                    }
                    if (var528 == 1203) {
                        var502.field4142 = 6;
                        var6--;
                        var502.field4034 = class67.field881[var6];
                        if (var502.field4012 == -1) {
                            class223.method1531(arg2, var502.field4083);
                        }
                        continue;
                    }
                    if (var528 == 1204) {
                        var502.field4142 = 5;
                        var6--;
                        var502.field4034 = class67.field881[var6];
                        if (var502.field4012 == -1) {
                            class223.method1531(true, var502.field4083);
                        }
                        continue;
                    }
                    if (var528 == 1206) {
                        var6 -= 4;
                        var502.field4053 = class67.field881[var6];
                        var502.field4119 = class67.field881[var6 + 1];
                        var502.field4086 = class67.field881[var6 + 2];
                        var502.field3998 = class67.field881[var6 + 3];
                        class239.method1712(0, var502);
                        continue;
                    }
                    if (var528 == 1207) {
                        var6 -= 2;
                        var502.field4014 = class67.field881[var6];
                        var502.field4094 = class67.field881[var6 + 1];
                        class239.method1712(0, var502);
                        continue;
                    }
                } else if (var528 >= 1300 && var528 < 1400 || var528 >= 2300 && var528 < 2400) {
                    class263 var62;
                    if (var528 < 2000) {
                        var62 = var46 ? class301.field4702 : class23.field310;
                    } else {
                        var528 -= 1000;
                        var6--;
                        var62 = class91.method530(class67.field881[var6], 10989328);
                    }
                    if (var528 == 1300) {
                        var6--;
                        int var63 = class67.field881[var6] - 1;
                        if (var63 >= 0 && var63 <= 9) {
                            var7--;
                            var62.method1897(var63, class284.field4450[var7], -127);
                            continue;
                        }
                        var7--;
                        continue;
                    }
                    if (var528 == 1301) {
                        var6 -= 2;
                        int var64 = class67.field881[var6];
                        int var65 = class67.field881[var6 + 1];
                        var62.field4031 = class176.method1211(1, var64, var65);
                        continue;
                    }
                    if (var528 == 1302) {
                        var6--;
                        var62.field3995 = class67.field881[var6] == 1;
                        continue;
                    }
                    if (var528 == 1303) {
                        var6--;
                        var62.field4048 = class67.field881[var6];
                        continue;
                    }
                    if (var528 == 1304) {
                        var6--;
                        var62.field4091 = class67.field881[var6];
                        continue;
                    }
                    if (var528 == 1305) {
                        var7--;
                        var62.field3996 = class284.field4450[var7];
                        continue;
                    }
                    if (var528 == 1306) {
                        var7--;
                        var62.field4029 = class284.field4450[var7];
                        continue;
                    }
                    if (var528 == 1307) {
                        var62.field3983 = null;
                        continue;
                    }
                    if (var528 == 1308) {
                        var6--;
                        var62.field3978 = class67.field881[var6];
                        var6--;
                        var62.field4057 = class67.field881[var6];
                        continue;
                    }
                    if (var528 == 1309) {
                        var6--;
                        int var66 = class67.field881[var6];
                        var6--;
                        int var67 = class67.field881[var6];
                        if (var67 >= 1 && var67 <= 10) {
                            var62.method1895(var67 - 1, var66, (byte) -128);
                        }
                        continue;
                    }
                    if (var528 == 1310) {
                        var7--;
                        var62.field4025 = class284.field4450[var7];
                        continue;
                    }
                } else {
                    if (var528 >= 1400 && var528 < 1500 || var528 >= 2400 && var528 < 2500) {
                        class263 var68;
                        if (var528 >= 2000) {
                            var528 -= 1000;
                            var6--;
                            var68 = class91.method530(class67.field881[var6], 10989328);
                        } else {
                            var68 = var46 ? class301.field4702 : class23.field310;
                        }
                        var7--;
                        String var69 = class284.field4450[var7];
                        int[] var70 = null;
                        if (var69.length() > 0 && var69.charAt(var69.length() - 1) == 'Y') {
                            var6--;
                            int var71 = class67.field881[var6];
                            if (var71 > 0) {
                                var70 = new int[var71];
                                while ((var71--) > 0) {
                                    var6--;
                                    var70[var71] = class67.field881[var6];
                                }
                            }
                            var69 = var69.substring(0, var69.length() - 1);
                        }
                        Object[] var72 = new Object[var69.length() + 1];
                        for (int var73 = var72.length - 1; var73 >= 1; var73--) {
                            if (var69.charAt(var73 - 1) == 's') {
                                var7--;
                                var72[var73] = class284.field4450[var7];
                            } else {
                                var6--;
                                var72[var73] = Integer.valueOf(class67.field881[var6]);
                            }
                        }
                        var6--;
                        int var74 = class67.field881[var6];
                        if (var74 == -1) {
                            var72 = null;
                        } else {
                            var72[0] = Integer.valueOf(var74);
                        }
                        if (var528 == 1400) {
                            var68.field3976 = var72;
                        } else if (var528 == 1401) {
                            var68.field4133 = var72;
                        } else if (var528 == 1402) {
                            var68.field4080 = var72;
                        } else if (var528 == 1403) {
                            var68.field4049 = var72;
                        } else if (var528 == 1404) {
                            var68.field4054 = var72;
                        } else if (var528 == 1405) {
                            var68.field4067 = var72;
                        } else if (var528 == 1406) {
                            var68.field4033 = var72;
                        } else if (var528 == 1407) {
                            var68.field4075 = var72;
                            var68.field4069 = var70;
                        } else if (var528 == 1408) {
                            var68.field3987 = var72;
                        } else if (var528 == 1409) {
                            var68.field4043 = var72;
                        } else if (var528 == 1410) {
                            var68.field4109 = var72;
                        } else if (var528 == 1411) {
                            var68.field4052 = var72;
                        } else if (var528 == 1412) {
                            var68.field4026 = var72;
                        } else if (var528 == 1414) {
                            var68.field4060 = var70;
                            var68.field4009 = var72;
                        } else if (var528 == 1415) {
                            var68.field4111 = var72;
                            var68.field4114 = var70;
                        } else if (var528 == 1416) {
                            var68.field4093 = var72;
                        } else if (var528 == 1417) {
                            var68.field4095 = var72;
                        } else if (var528 == 1418) {
                            var68.field3988 = var72;
                        } else if (var528 == 1419) {
                            var68.field4041 = var72;
                        } else if (var528 == 1420) {
                            var68.field4144 = var72;
                        } else if (var528 == 1421) {
                            var68.field4124 = var72;
                        } else if (var528 == 1422) {
                            var68.field4036 = var72;
                        } else if (var528 == 1423) {
                            var68.field4104 = var72;
                        } else if (var528 == 1424) {
                            var68.field4148 = var72;
                        } else if (var528 == 1425) {
                            var68.field4058 = var72;
                        } else if (var528 == 1426) {
                            var68.field4073 = var72;
                        } else if (var528 == 1427) {
                            var68.field4127 = var72;
                        } else if (var528 == 1428) {
                            var68.field4044 = var70;
                            var68.field4098 = var72;
                        } else if (var528 == 1429) {
                            var68.field4040 = var70;
                            var68.field4125 = var72;
                        }
                        var68.field4145 = true;
                        continue;
                    }
                    if (var528 < 1600) {
                        class263 var75 = var46 ? class301.field4702 : class23.field310;
                        if (var528 == 1500) {
                            class67.field881[var6++] = var75.field4027;
                            continue;
                        }
                        if (var528 == 1501) {
                            class67.field881[var6++] = var75.field4074;
                            continue;
                        }
                        if (var528 == 1502) {
                            class67.field881[var6++] = var75.field3989;
                            continue;
                        }
                        if (var528 == 1503) {
                            class67.field881[var6++] = var75.field4096;
                            continue;
                        }
                        if (var528 == 1504) {
                            class67.field881[var6++] = var75.field4001 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 1505) {
                            class67.field881[var6++] = var75.field4065;
                            continue;
                        }
                    } else if (var528 < 1700) {
                        class263 var76 = var46 ? class301.field4702 : class23.field310;
                        if (var528 == 1600) {
                            class67.field881[var6++] = var76.field4068;
                            continue;
                        }
                        if (var528 == 1601) {
                            class67.field881[var6++] = var76.field3990;
                            continue;
                        }
                        if (var528 == 1602) {
                            class284.field4450[var7++] = var76.field3999;
                            continue;
                        }
                        if (var528 == 1603) {
                            class67.field881[var6++] = var76.field3984;
                            continue;
                        }
                        if (var528 == 1604) {
                            class67.field881[var6++] = var76.field4059;
                            continue;
                        }
                        if (var528 == 1605) {
                            class67.field881[var6++] = var76.field4136;
                            continue;
                        }
                        if (var528 == 1606) {
                            class67.field881[var6++] = var76.field4131;
                            continue;
                        }
                        if (var528 == 1607) {
                            class67.field881[var6++] = var76.field4021;
                            continue;
                        }
                        if (var528 == 1608) {
                            class67.field881[var6++] = var76.field4120;
                            continue;
                        }
                        if (var528 == 1609) {
                            class67.field881[var6++] = var76.field3992;
                            continue;
                        }
                        if (var528 == 1610) {
                            class67.field881[var6++] = var76.field4115;
                            continue;
                        }
                        if (var528 == 1611) {
                            class67.field881[var6++] = var76.field4061;
                            continue;
                        }
                        if (var528 == 1612) {
                            class67.field881[var6++] = var76.field4066;
                            continue;
                        }
                    } else if (var528 < 1800) {
                        class263 var77 = var46 ? class301.field4702 : class23.field310;
                        if (var528 == 1700) {
                            class67.field881[var6++] = var77.field4000;
                            continue;
                        }
                        if (var528 == 1701) {
                            if (var77.field4000 == -1) {
                                class67.field881[var6++] = 0;
                            } else {
                                class67.field881[var6++] = var77.field4022;
                            }
                            continue;
                        }
                        if (var528 == 1702) {
                            class67.field881[var6++] = var77.field4012;
                            continue;
                        }
                    } else if (var528 < 1900) {
                        class263 var500 = var46 ? class301.field4702 : class23.field310;
                        if (var528 == 1800) {
                            class67.field881[var6++] = client.method1952(var500).method1123(55);
                            continue;
                        }
                        if (var528 == 1801) {
                            var6--;
                            int var501 = class67.field881[var6];
                            int var530 = var501 - 1;
                            if (var500.field3983 != null && var530 < var500.field3983.length && var500.field3983[var530] != null) {
                                class284.field4450[var7++] = var500.field3983[var530];
                                continue;
                            }
                            class284.field4450[var7++] = "";
                            continue;
                        }
                        if (var528 == 1802) {
                            if (var500.field3996 == null) {
                                class284.field4450[var7++] = "";
                            } else {
                                class284.field4450[var7++] = var500.field3996;
                            }
                            continue;
                        }
                    } else if (var528 < 2600) {
                        var6--;
                        class263 var499 = class91.method530(class67.field881[var6], 10989328);
                        if (var528 == 2500) {
                            class67.field881[var6++] = var499.field4027;
                            continue;
                        }
                        if (var528 == 2501) {
                            class67.field881[var6++] = var499.field4074;
                            continue;
                        }
                        if (var528 == 2502) {
                            class67.field881[var6++] = var499.field3989;
                            continue;
                        }
                        if (var528 == 2503) {
                            class67.field881[var6++] = var499.field4096;
                            continue;
                        }
                        if (var528 == 2504) {
                            class67.field881[var6++] = var499.field4001 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 2505) {
                            class67.field881[var6++] = var499.field4065;
                            continue;
                        }
                    } else if (var528 < 2700) {
                        var6--;
                        class263 var498 = class91.method530(class67.field881[var6], 10989328);
                        if (var528 == 2600) {
                            class67.field881[var6++] = var498.field4068;
                            continue;
                        }
                        if (var528 == 2601) {
                            class67.field881[var6++] = var498.field3990;
                            continue;
                        }
                        if (var528 == 2602) {
                            class284.field4450[var7++] = var498.field3999;
                            continue;
                        }
                        if (var528 == 2603) {
                            class67.field881[var6++] = var498.field3984;
                            continue;
                        }
                        if (var528 == 2604) {
                            class67.field881[var6++] = var498.field4059;
                            continue;
                        }
                        if (var528 == 2605) {
                            class67.field881[var6++] = var498.field4136;
                            continue;
                        }
                        if (var528 == 2606) {
                            class67.field881[var6++] = var498.field4131;
                            continue;
                        }
                        if (var528 == 2607) {
                            class67.field881[var6++] = var498.field4021;
                            continue;
                        }
                        if (var528 == 2608) {
                            class67.field881[var6++] = var498.field4120;
                            continue;
                        }
                        if (var528 == 2609) {
                            class67.field881[var6++] = var498.field3992;
                            continue;
                        }
                        if (var528 == 2610) {
                            class67.field881[var6++] = var498.field4115;
                            continue;
                        }
                        if (var528 == 2611) {
                            class67.field881[var6++] = var498.field4061;
                            continue;
                        }
                        if (var528 == 2612) {
                            class67.field881[var6++] = var498.field4066;
                            continue;
                        }
                    } else if (var528 < 2800) {
                        if (var528 == 2700) {
                            var6--;
                            class263 var78 = class91.method530(class67.field881[var6], 10989328);
                            class67.field881[var6++] = var78.field4000;
                            continue;
                        }
                        if (var528 == 2701) {
                            var6--;
                            class263 var79 = class91.method530(class67.field881[var6], 10989328);
                            if (var79.field4000 == -1) {
                                class67.field881[var6++] = 0;
                            } else {
                                class67.field881[var6++] = var79.field4022;
                            }
                            continue;
                        }
                        if (var528 == 2702) {
                            var6--;
                            int var80 = class67.field881[var6];
                            class343 var81 = (class343) class292.field4585.method1537((long) var80, -22708);
                            if (var81 == null) {
                                class67.field881[var6++] = 0;
                            } else {
                                class67.field881[var6++] = 1;
                            }
                            continue;
                        }
                        if (var528 == 2703) {
                            var6--;
                            class263 var82 = class91.method530(class67.field881[var6], 10989328);
                            if (var82.field3975 == null) {
                                class67.field881[var6++] = 0;
                                continue;
                            }
                            int var83 = var82.field3975.length;
                            for (int var84 = 0; var84 < var82.field3975.length; var84++) {
                                if (var82.field3975[var84] == null) {
                                    var83 = var84;
                                    break;
                                }
                            }
                            class67.field881[var6++] = var83;
                            continue;
                        }
                        if (var528 == 2704 || var528 == 2705) {
                            var6 -= 2;
                            int var85 = class67.field881[var6];
                            int var86 = class67.field881[var6 + 1];
                            class343 var87 = (class343) class292.field4585.method1537((long) var85, -22708);
                            if (var87 != null && var87.field5329 == var86) {
                                class67.field881[var6++] = 1;
                                continue;
                            }
                            class67.field881[var6++] = 0;
                            continue;
                        }
                    } else if (var528 < 2900) {
                        var6--;
                        class263 var496 = class91.method530(class67.field881[var6], 10989328);
                        if (var528 == 2800) {
                            class67.field881[var6++] = client.method1952(var496).method1123(84);
                            continue;
                        }
                        if (var528 == 2801) {
                            var6--;
                            int var497 = class67.field881[var6];
                            int var529 = var497 - 1;
                            if (var496.field3983 != null && var529 < var496.field3983.length && var496.field3983[var529] != null) {
                                class284.field4450[var7++] = var496.field3983[var529];
                                continue;
                            }
                            class284.field4450[var7++] = "";
                            continue;
                        }
                        if (var528 == 2802) {
                            if (var496.field3996 == null) {
                                class284.field4450[var7++] = "";
                            } else {
                                class284.field4450[var7++] = var496.field3996;
                            }
                            continue;
                        }
                    } else if (var528 < 3200) {
                        if (var528 == 3100) {
                            var7--;
                            String var88 = class284.field4450[var7];
                            class150.method1010(var88, 0, (byte) -59, "");
                            continue;
                        }
                        if (var528 == 3101) {
                            var6 -= 2;
                            class172.method1132(class118.field1664, class67.field881[var6 + 1], class67.field881[var6], -1566);
                            continue;
                        }
                        if (var528 == 3103) {
                            class68.method426(true);
                            continue;
                        }
                        if (var528 == 3104) {
                            class267.field4209++;
                            int var89 = 0;
                            var7--;
                            String var90 = class284.field4450[var7];
                            if (class217.method1497(var90, 85)) {
                                var89 = class235.method1672(var90, 10);
                            }
                            class140.field1954.method573(122, 93);
                            class140.field1954.method641(1773202520, var89);
                            continue;
                        }
                        if (var528 == 3105) {
                            class88.field1099++;
                            var7--;
                            String var91 = class284.field4450[var7];
                            class140.field1954.method573(119, 187);
                            class140.field1954.method678(class48.method285((byte) -90, var91), (byte) 112);
                            continue;
                        }
                        if (var528 == 3106) {
                            class141.field1965++;
                            var7--;
                            String var92 = class284.field4450[var7];
                            class140.field1954.method573(121, 57);
                            class140.field1954.method648(var92.length() + 1, (byte) 38);
                            class140.field1954.method636(255, var92);
                            continue;
                        }
                        if (var528 == 3107) {
                            var6--;
                            int var93 = class67.field881[var6];
                            var7--;
                            String var94 = class284.field4450[var7];
                            class73.method441(var94, var93, 18269);
                            continue;
                        }
                        if (var528 == 3108) {
                            var6 -= 3;
                            int var95 = class67.field881[var6];
                            int var96 = class67.field881[var6 + 2];
                            int var97 = class67.field881[var6 + 1];
                            class263 var98 = class91.method530(var96, 10989328);
                            class196.method1359(var95, (byte) 121, var97, var98);
                            continue;
                        }
                        if (var528 == 3109) {
                            var6 -= 2;
                            int var99 = class67.field881[var6];
                            int var100 = class67.field881[var6 + 1];
                            class263 var101 = var46 ? class301.field4702 : class23.field310;
                            class196.method1359(var99, (byte) 104, var100, var101);
                            continue;
                        }
                        if (var528 == 3110) {
                            class244.field3677++;
                            var6--;
                            int var102 = class67.field881[var6];
                            class140.field1954.method573(117, 100);
                            class140.field1954.method662(true, var102);
                            continue;
                        }
                    } else if (var528 < 3300) {
                        if (var528 == 3200) {
                            var6 -= 3;
                            class74.method452((byte) -29, class67.field881[var6], class67.field881[var6 + 1], 255, class67.field881[var6 + 2]);
                            continue;
                        }
                        if (var528 == 3201) {
                            var6--;
                            class304.method2130(-64, 255, class67.field881[var6]);
                            continue;
                        }
                        if (var528 == 3202) {
                            var6 -= 2;
                            class280.method2002(true, class67.field881[var6], 255, class67.field881[var6 + 1]);
                            continue;
                        }
                    } else if (var528 < 3400) {
                        if (var528 == 3300) {
                            class67.field881[var6++] = class38.field463;
                            continue;
                        }
                        if (var528 == 3301) {
                            var6 -= 2;
                            int var462 = class67.field881[var6 + 1];
                            int var463 = class67.field881[var6];
                            class67.field881[var6++] = class175.method1178(var462, false, var463);
                            continue;
                        }
                        if (var528 == 3302) {
                            var6 -= 2;
                            int var464 = class67.field881[var6];
                            int var465 = class67.field881[var6 + 1];
                            class67.field881[var6++] = class171.method1116(0, var464, var465);
                            continue;
                        }
                        if (var528 == 3303) {
                            var6 -= 2;
                            int var466 = class67.field881[var6];
                            int var467 = class67.field881[var6 + 1];
                            class67.field881[var6++] = class19.method120(var467, 0, var466);
                            continue;
                        }
                        if (var528 == 3304) {
                            var6--;
                            int var468 = class67.field881[var6];
                            class67.field881[var6++] = class152.method1014(var468, 63).field4977;
                            continue;
                        }
                        if (var528 == 3305) {
                            var6--;
                            int var469 = class67.field881[var6];
                            class67.field881[var6++] = class97.field1260[var469];
                            continue;
                        }
                        if (var528 == 3306) {
                            var6--;
                            int var470 = class67.field881[var6];
                            class67.field881[var6++] = class59.field723[var470];
                            continue;
                        }
                        if (var528 == 3307) {
                            var6--;
                            int var471 = class67.field881[var6];
                            class67.field881[var6++] = class286.field4499[var471];
                            continue;
                        }
                        if (var528 == 3308) {
                            int var472 = class138.field1940;
                            int var473 = (class118.field1664.field2392 >> 7) + class142.field1992;
                            int var474 = (class118.field1664.field2357 >> 7) + class118.field1668;
                            class67.field881[var6++] = (var472 << 28) + (var473 << 14) + var474;
                            continue;
                        }
                        if (var528 == 3309) {
                            var6--;
                            int var475 = class67.field881[var6];
                            class67.field881[var6++] = class229.method1613(268423270, var475) >> 14;
                            continue;
                        }
                        if (var528 == 3310) {
                            var6--;
                            int var476 = class67.field881[var6];
                            class67.field881[var6++] = var476 >> 28;
                            continue;
                        }
                        if (var528 == 3311) {
                            var6--;
                            int var477 = class67.field881[var6];
                            class67.field881[var6++] = class229.method1613(16383, var477);
                            continue;
                        }
                        if (var528 == 3312) {
                            class67.field881[var6++] = class141.field1969 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3313) {
                            var6 -= 2;
                            int var478 = class67.field881[var6] + 32768;
                            int var479 = class67.field881[var6 + 1];
                            class67.field881[var6++] = class175.method1178(var479, false, var478);
                            continue;
                        }
                        if (var528 == 3314) {
                            var6 -= 2;
                            int var480 = class67.field881[var6 + 1];
                            int var481 = class67.field881[var6] + 32768;
                            class67.field881[var6++] = class171.method1116(0, var481, var480);
                            continue;
                        }
                        if (var528 == 3315) {
                            var6 -= 2;
                            int var482 = class67.field881[var6] + 32768;
                            int var483 = class67.field881[var6 + 1];
                            class67.field881[var6++] = class19.method120(var483, 0, var482);
                            continue;
                        }
                        if (var528 == 3316) {
                            if (class154.field2151 >= 2) {
                                class67.field881[var6++] = class154.field2151;
                            } else {
                                class67.field881[var6++] = 0;
                            }
                            continue;
                        }
                        if (var528 == 3317) {
                            class67.field881[var6++] = class90.field1122;
                            continue;
                        }
                        if (var528 == 3318) {
                            class67.field881[var6++] = class109.field1500;
                            continue;
                        }
                        if (var528 == 3321) {
                            class67.field881[var6++] = class14.field188;
                            continue;
                        }
                        if (var528 == 3322) {
                            class67.field881[var6++] = class223.field3154;
                            continue;
                        }
                        if (var528 == 3323) {
                            if (class262.field3958 >= 5 && class262.field3958 <= 9) {
                                class67.field881[var6++] = 1;
                                continue;
                            }
                            class67.field881[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3324) {
                            if (class262.field3958 >= 5 && class262.field3958 <= 9) {
                                class67.field881[var6++] = class262.field3958;
                                continue;
                            }
                            class67.field881[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3325) {
                            class67.field881[var6++] = class14.field194 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3326) {
                            class67.field881[var6++] = class118.field1664.field1495;
                            continue;
                        }
                        if (var528 == 3327) {
                            class67.field881[var6++] = class118.field1664.field1510.field5190 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3328) {
                            class67.field881[var6++] = class270.field4257 && !class136.field1884 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3329) {
                            class67.field881[var6++] = class316.field4872 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3330) {
                            var6--;
                            int var484 = class67.field881[var6];
                            class67.field881[var6++] = class23.method149((byte) -117, var484);
                            continue;
                        }
                        if (var528 == 3331) {
                            var6 -= 2;
                            int var485 = class67.field881[var6];
                            int var486 = class67.field881[var6 + 1];
                            class67.field881[var6++] = class312.method2187(var486, (byte) 2, false, var485);
                            continue;
                        }
                        if (var528 == 3332) {
                            var6 -= 2;
                            int var487 = class67.field881[var6];
                            int var488 = class67.field881[var6 + 1];
                            class67.field881[var6++] = class312.method2187(var488, (byte) 108, true, var487);
                            continue;
                        }
                        if (var528 == 3333) {
                            class67.field881[var6++] = class304.field4719;
                            continue;
                        }
                        if (var528 == 3335) {
                            class67.field881[var6++] = class172.field2484;
                            continue;
                        }
                        if (var528 == 3336) {
                            var6 -= 4;
                            int var489 = class67.field881[var6 + 2];
                            int var490 = class67.field881[var6 + 1];
                            int var491 = class67.field881[var6];
                            int var492 = (var490 << 14) + var491;
                            int var493 = class67.field881[var6 + 3];
                            int var494 = (var489 << 28) + var492;
                            int var495 = var493 + var494;
                            class67.field881[var6++] = var495;
                            continue;
                        }
                        if (var528 == 3337) {
                            class67.field881[var6++] = class244.field3667;
                            continue;
                        }
                    } else if (var528 < 3500) {
                        if (var528 == 3400) {
                            var6 -= 2;
                            int var445 = class67.field881[var6 + 1];
                            int var446 = class67.field881[var6];
                            class230 var447 = class323.method2250(6243, var446);
                            if (var447.field3349 == 's') {
                            }
                            class284.field4450[var7++] = var447.method1626((byte) 119, var445);
                            continue;
                        }
                        if (var528 == 3408) {
                            var6 -= 4;
                            int var448 = class67.field881[var6];
                            int var449 = class67.field881[var6 + 1];
                            int var450 = class67.field881[var6 + 2];
                            int var451 = class67.field881[var6 + 3];
                            class230 var452 = class323.method2250(6243, var450);
                            if (var452.field3345 == var448 && var452.field3349 == var449) {
                                if (var449 == 115) {
                                    class284.field4450[var7++] = var452.method1626((byte) 119, var451);
                                } else {
                                    class67.field881[var6++] = var452.method1619(-11, var451);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var528 == 3409) {
                            var6 -= 3;
                            int var453 = class67.field881[var6 + 1];
                            int var454 = class67.field881[var6];
                            int var455 = class67.field881[var6 + 2];
                            if (var453 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class230 var456 = class323.method2250(6243, var453);
                            if (var456.field3349 != var454) {
                                throw new RuntimeException("C3409-1");
                            }
                            class67.field881[var6++] = var456.method1624(var455, 12885) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3410) {
                            var7--;
                            String var457 = class284.field4450[var7];
                            var6--;
                            int var458 = class67.field881[var6];
                            if (var458 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class230 var459 = class323.method2250(6243, var458);
                            if (var459.field3349 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class67.field881[var6++] = var459.method1617(15384, var457) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3411) {
                            var6--;
                            int var460 = class67.field881[var6];
                            class230 var461 = class323.method2250(6243, var460);
                            class67.field881[var6++] = var461.field3352.method1539(-74);
                            continue;
                        }
                    } else if (var528 < 3700) {
                        if (var528 == 3600) {
                            if (class239.field3568 == 0) {
                                class67.field881[var6++] = -2;
                            } else if (class239.field3568 == 1) {
                                class67.field881[var6++] = -1;
                            } else {
                                class67.field881[var6++] = class74.field954;
                            }
                            continue;
                        }
                        if (var528 == 3601) {
                            var6--;
                            int var421 = class67.field881[var6];
                            if (class239.field3568 == 2 && class74.field954 > var421) {
                                class284.field4450[var7++] = class76.field965[var421];
                                continue;
                            }
                            class284.field4450[var7++] = "";
                            continue;
                        }
                        if (var528 == 3602) {
                            var6--;
                            int var422 = class67.field881[var6];
                            if (class239.field3568 == 2 && var422 < class74.field954) {
                                class67.field881[var6++] = class132.field1816[var422];
                                continue;
                            }
                            class67.field881[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3603) {
                            var6--;
                            int var423 = class67.field881[var6];
                            if (class239.field3568 == 2 && class74.field954 > var423) {
                                class67.field881[var6++] = class296.field4619[var423];
                                continue;
                            }
                            class67.field881[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3604) {
                            var7--;
                            String var424 = class284.field4450[var7];
                            var6--;
                            int var425 = class67.field881[var6];
                            class43.method250(-128, var424, var425);
                            continue;
                        }
                        if (var528 == 3605) {
                            var7--;
                            String var426 = class284.field4450[var7];
                            class249.method1787(false, class48.method285((byte) -90, var426));
                            continue;
                        }
                        if (var528 == 3606) {
                            var7--;
                            String var427 = class284.field4450[var7];
                            class237.method1692(class48.method285((byte) -90, var427), -81);
                            continue;
                        }
                        if (var528 == 3607) {
                            var7--;
                            String var428 = class284.field4450[var7];
                            class145.method983(class48.method285((byte) -90, var428), 65, false);
                            continue;
                        }
                        if (var528 == 3608) {
                            var7--;
                            String var429 = class284.field4450[var7];
                            class183.method1271(1, class48.method285((byte) -90, var429));
                            continue;
                        }
                        if (var528 == 3609) {
                            var7--;
                            String var430 = class284.field4450[var7];
                            if (var430.startsWith("<img=0>") || var430.startsWith("<img=1>")) {
                                var430 = var430.substring(7);
                            }
                            class67.field881[var6++] = class58.method337(var430, -62) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3610) {
                            var6--;
                            int var431 = class67.field881[var6];
                            if (class239.field3568 == 2 && class74.field954 > var431) {
                                class284.field4450[var7++] = class330.field5039[var431];
                                continue;
                            }
                            class284.field4450[var7++] = "";
                            continue;
                        }
                        if (var528 == 3611) {
                            if (class20.field263 == null) {
                                class284.field4450[var7++] = "";
                            } else {
                                class284.field4450[var7++] = class154.method1025(class20.field263, -128);
                            }
                            continue;
                        }
                        if (var528 == 3612) {
                            if (class20.field263 == null) {
                                class67.field881[var6++] = 0;
                            } else {
                                class67.field881[var6++] = class72.field913;
                            }
                            continue;
                        }
                        if (var528 == 3613) {
                            var6--;
                            int var432 = class67.field881[var6];
                            if (class20.field263 != null && class72.field913 > var432) {
                                class284.field4450[var7++] = class154.method1025(class170.field2394[var432].field476, -127);
                                continue;
                            }
                            class284.field4450[var7++] = "";
                            continue;
                        }
                        if (var528 == 3614) {
                            var6--;
                            int var433 = class67.field881[var6];
                            if (class20.field263 != null && class72.field913 > var433) {
                                class67.field881[var6++] = class170.field2394[var433].field471;
                                continue;
                            }
                            class67.field881[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3615) {
                            var6--;
                            int var434 = class67.field881[var6];
                            if (class20.field263 != null && class72.field913 > var434) {
                                class67.field881[var6++] = class170.field2394[var434].field468;
                                continue;
                            }
                            class67.field881[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3616) {
                            class67.field881[var6++] = class329.field5035;
                            continue;
                        }
                        if (var528 == 3617) {
                            var7--;
                            String var435 = class284.field4450[var7];
                            class320.method2230(var435, -13768);
                            continue;
                        }
                        if (var528 == 3618) {
                            class67.field881[var6++] = class224.field3164;
                            continue;
                        }
                        if (var528 == 3619) {
                            var7--;
                            String var436 = class284.field4450[var7];
                            class316.method2206(class48.method285((byte) -90, var436), (byte) 127);
                            continue;
                        }
                        if (var528 == 3620) {
                            class60.method351((byte) -106);
                            continue;
                        }
                        if (var528 == 3621) {
                            if (class239.field3568 == 0) {
                                class67.field881[var6++] = -1;
                            } else {
                                class67.field881[var6++] = class96.field1248;
                            }
                            continue;
                        }
                        if (var528 == 3622) {
                            var6--;
                            int var437 = class67.field881[var6];
                            if (class239.field3568 != 0 && var437 < class96.field1248) {
                                class284.field4450[var7++] = class109.method743(class113.field1615[var437], 1);
                                continue;
                            }
                            class284.field4450[var7++] = "";
                            continue;
                        }
                        if (var528 == 3623) {
                            var7--;
                            String var438 = class284.field4450[var7];
                            if (var438.startsWith("<img=0>") || var438.startsWith("<img=1>")) {
                                var438 = var438.substring(7);
                            }
                            class67.field881[var6++] = class286.method2042(arg2, var438) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3624) {
                            var6--;
                            int var439 = class67.field881[var6];
                            if (class170.field2394 != null && class72.field913 > var439 && class170.field2394[var439].field476.equalsIgnoreCase(class118.field1664.field1496)) {
                                class67.field881[var6++] = 1;
                                continue;
                            }
                            class67.field881[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3625) {
                            if (class225.field3189 == null) {
                                class284.field4450[var7++] = "";
                            } else {
                                class284.field4450[var7++] = class154.method1025(class225.field3189, -127);
                            }
                            continue;
                        }
                        if (var528 == 3626) {
                            var6--;
                            int var440 = class67.field881[var6];
                            if (class20.field263 != null && class72.field913 > var440) {
                                class284.field4450[var7++] = class170.field2394[var440].field473;
                                continue;
                            }
                            class284.field4450[var7++] = "";
                            continue;
                        }
                        if (var528 == 3627) {
                            var6--;
                            int var441 = class67.field881[var6];
                            if (class239.field3568 == 2 && var441 >= 0 && class74.field954 > var441) {
                                class67.field881[var6++] = class154.field2114[var441] ? 1 : 0;
                                continue;
                            }
                            class67.field881[var6++] = 0;
                            continue;
                        }
                        if (var528 == 3628) {
                            var7--;
                            String var442 = class284.field4450[var7];
                            if (var442.startsWith("<img=0>") || var442.startsWith("<img=1>")) {
                                var442 = var442.substring(7);
                            }
                            class67.field881[var6++] = class318.method2222(654623064, var442);
                            continue;
                        }
                        if (var528 == 3629) {
                            class67.field881[var6++] = class303.field4711;
                            continue;
                        }
                        if (var528 == 3630) {
                            var7--;
                            String var443 = class284.field4450[var7];
                            class145.method983(class48.method285((byte) -90, var443), 72, true);
                            continue;
                        }
                        if (var528 == 3631) {
                            var6--;
                            int var444 = class67.field881[var6];
                            class67.field881[var6++] = class100.field1317[var444] ? 1 : 0;
                            continue;
                        }
                    } else if (var528 < 4000) {
                        if (var528 == 3903) {
                            var6--;
                            int var103 = class67.field881[var6];
                            class67.field881[var6++] = class326.field4988[var103].method1644(true);
                            continue;
                        }
                        if (var528 == 3904) {
                            var6--;
                            int var104 = class67.field881[var6];
                            class67.field881[var6++] = class326.field4988[var104].field3402;
                            continue;
                        }
                        if (var528 == 3905) {
                            var6--;
                            int var105 = class67.field881[var6];
                            class67.field881[var6++] = class326.field4988[var105].field3400;
                            continue;
                        }
                        if (var528 == 3906) {
                            var6--;
                            int var106 = class67.field881[var6];
                            class67.field881[var6++] = class326.field4988[var106].field3406;
                            continue;
                        }
                        if (var528 == 3907) {
                            var6--;
                            int var107 = class67.field881[var6];
                            class67.field881[var6++] = class326.field4988[var107].field3404;
                            continue;
                        }
                        if (var528 == 3908) {
                            var6--;
                            int var108 = class67.field881[var6];
                            class67.field881[var6++] = class326.field4988[var108].field3401;
                            continue;
                        }
                        if (var528 == 3910) {
                            var6--;
                            int var109 = class67.field881[var6];
                            int var110 = class326.field4988[var109].method1646((byte) -13);
                            class67.field881[var6++] = var110 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3911) {
                            var6--;
                            int var111 = class67.field881[var6];
                            int var112 = class326.field4988[var111].method1646((byte) -13);
                            class67.field881[var6++] = var112 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3912) {
                            var6--;
                            int var113 = class67.field881[var6];
                            int var114 = class326.field4988[var113].method1646((byte) -13);
                            class67.field881[var6++] = var114 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 3913) {
                            var6--;
                            int var115 = class67.field881[var6];
                            int var116 = class326.field4988[var115].method1646((byte) -13);
                            class67.field881[var6++] = var116 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var528 < 4100) {
                        if (var528 == 4000) {
                            var6 -= 2;
                            int var376 = class67.field881[var6];
                            int var377 = class67.field881[var6 + 1];
                            class67.field881[var6++] = var376 + var377;
                            continue;
                        }
                        if (var528 == 4001) {
                            var6 -= 2;
                            int var378 = class67.field881[var6 + 1];
                            int var379 = class67.field881[var6];
                            class67.field881[var6++] = var379 - var378;
                            continue;
                        }
                        if (var528 == 4002) {
                            var6 -= 2;
                            int var380 = class67.field881[var6];
                            int var381 = class67.field881[var6 + 1];
                            class67.field881[var6++] = var380 * var381;
                            continue;
                        }
                        if (var528 == 4003) {
                            var6 -= 2;
                            int var382 = class67.field881[var6];
                            int var383 = class67.field881[var6 + 1];
                            class67.field881[var6++] = var382 / var383;
                            continue;
                        }
                        if (var528 == 4004) {
                            var6--;
                            int var384 = class67.field881[var6];
                            class67.field881[var6++] = (int) ((double) var384 * Math.random());
                            continue;
                        }
                        if (var528 == 4005) {
                            var6--;
                            int var385 = class67.field881[var6];
                            class67.field881[var6++] = (int) ((double) (var385 + 1) * Math.random());
                            continue;
                        }
                        if (var528 == 4006) {
                            var6 -= 5;
                            int var386 = class67.field881[var6];
                            int var387 = class67.field881[var6 + 3];
                            int var388 = class67.field881[var6 + 1];
                            int var389 = class67.field881[var6 + 2];
                            int var390 = class67.field881[var6 + 4];
                            class67.field881[var6++] = (var388 - var386) * (var390 - var389) / (var387 - var389) + var386;
                            continue;
                        }
                        if (var528 == 4007) {
                            var6 -= 2;
                            long var391 = (long) class67.field881[var6];
                            long var393 = (long) class67.field881[var6 + 1];
                            class67.field881[var6++] = (int) (var391 * var393 / 100L + var391);
                            continue;
                        }
                        if (var528 == 4008) {
                            var6 -= 2;
                            int var395 = class67.field881[var6];
                            int var396 = class67.field881[var6 + 1];
                            class67.field881[var6++] = class48.method283(0x1 << var396, var395);
                            continue;
                        }
                        if (var528 == 4009) {
                            var6 -= 2;
                            int var397 = class67.field881[var6];
                            int var398 = class67.field881[var6 + 1];
                            class67.field881[var6++] = class229.method1613(var397, -(0x1 << var398) - 1);
                            continue;
                        }
                        if (var528 == 4010) {
                            var6 -= 2;
                            int var399 = class67.field881[var6];
                            int var400 = class67.field881[var6 + 1];
                            class67.field881[var6++] = class229.method1613(var399, 0x1 << var400) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var528 == 4011) {
                            var6 -= 2;
                            int var401 = class67.field881[var6];
                            int var402 = class67.field881[var6 + 1];
                            class67.field881[var6++] = var401 % var402;
                            continue;
                        }
                        if (var528 == 4012) {
                            var6 -= 2;
                            int var403 = class67.field881[var6];
                            int var404 = class67.field881[var6 + 1];
                            if (var403 == 0) {
                                class67.field881[var6++] = 0;
                            } else {
                                class67.field881[var6++] = (int) Math.pow((double) var403, (double) var404);
                            }
                            continue;
                        }
                        if (var528 == 4013) {
                            var6 -= 2;
                            int var405 = class67.field881[var6 + 1];
                            int var406 = class67.field881[var6];
                            if (var406 == 0) {
                                class67.field881[var6++] = 0;
                            } else if (var405 == 0) {
                                class67.field881[var6++] = Integer.MAX_VALUE;
                            } else {
                                class67.field881[var6++] = (int) Math.pow((double) var406, 1.0D / (double) var405);
                            }
                            continue;
                        }
                        if (var528 == 4014) {
                            var6 -= 2;
                            int var407 = class67.field881[var6];
                            int var408 = class67.field881[var6 + 1];
                            class67.field881[var6++] = class229.method1613(var408, var407);
                            continue;
                        }
                        if (var528 == 4015) {
                            var6 -= 2;
                            int var409 = class67.field881[var6];
                            int var410 = class67.field881[var6 + 1];
                            class67.field881[var6++] = class48.method283(var409, var410);
                            continue;
                        }
                        if (var528 == 4016) {
                            var6 -= 2;
                            int var411 = class67.field881[var6];
                            int var412 = class67.field881[var6 + 1];
                            class67.field881[var6++] = var411 < var412 ? var411 : var412;
                            continue;
                        }
                        if (var528 == 4017) {
                            var6 -= 2;
                            int var413 = class67.field881[var6];
                            int var414 = class67.field881[var6 + 1];
                            class67.field881[var6++] = var414 >= var413 ? var414 : var413;
                            continue;
                        }
                        if (var528 == 4018) {
                            var6 -= 3;
                            long var415 = (long) class67.field881[var6];
                            long var417 = (long) class67.field881[var6 + 1];
                            long var419 = (long) class67.field881[var6 + 2];
                            class67.field881[var6++] = (int) (var415 * var419 / var417);
                            continue;
                        }
                    } else if (var528 < 4200) {
                        if (var528 == 4100) {
                            var6--;
                            int var117 = class67.field881[var6];
                            var7--;
                            String var118 = class284.field4450[var7];
                            class284.field4450[var7++] = var118 + var117;
                            continue;
                        }
                        if (var528 == 4101) {
                            var7 -= 2;
                            String var119 = class284.field4450[var7 + 1];
                            String var120 = class284.field4450[var7];
                            class284.field4450[var7++] = var120 + var119;
                            continue;
                        }
                        if (var528 == 4102) {
                            var6--;
                            int var121 = class67.field881[var6];
                            var7--;
                            String var122 = class284.field4450[var7];
                            class284.field4450[var7++] = var122 + class47.method275(true, 10, var121);
                            continue;
                        }
                        if (var528 == 4103) {
                            var7--;
                            String var123 = class284.field4450[var7];
                            class284.field4450[var7++] = var123.toLowerCase();
                            continue;
                        }
                        if (var528 == 4104) {
                            var6--;
                            int var124 = class67.field881[var6];
                            long var125 = (long) var124 * 86400000L + 1014768000000L;
                            class316.field4871.setTime(new Date(var125));
                            int var127 = class316.field4871.get(5);
                            int var128 = class316.field4871.get(2);
                            int var129 = class316.field4871.get(1);
                            class284.field4450[var7++] = var127 + "-" + class308.field4764[var128] + "-" + var129;
                            continue;
                        }
                        if (var528 == 4105) {
                            var7 -= 2;
                            String var130 = class284.field4450[var7 + 1];
                            String var131 = class284.field4450[var7];
                            if (class118.field1664.field1510 != null && class118.field1664.field1510.field5190) {
                                class284.field4450[var7++] = var130;
                                continue;
                            }
                            class284.field4450[var7++] = var131;
                            continue;
                        }
                        if (var528 == 4106) {
                            var6--;
                            int var132 = class67.field881[var6];
                            class284.field4450[var7++] = Integer.toString(var132);
                            continue;
                        }
                        if (var528 == 4107) {
                            var7 -= 2;
                            class67.field881[var6++] = class91.method542(-1, class26.method166(class172.field2484, 0, class284.field4450[var7 + 1], class284.field4450[var7]));
                            continue;
                        }
                        if (var528 == 4108) {
                            var6 -= 2;
                            var7--;
                            String var133 = class284.field4450[var7];
                            int var134 = class67.field881[var6 + 1];
                            int var135 = class67.field881[var6];
                            class67.field881[var6++] = class235.method1662(false, var134).method70(var133, var135);
                            continue;
                        }
                        if (var528 == 4109) {
                            var6 -= 2;
                            var7--;
                            String var136 = class284.field4450[var7];
                            int var137 = class67.field881[var6];
                            int var138 = class67.field881[var6 + 1];
                            class67.field881[var6++] = class235.method1662(false, var138).method63(var136, var137);
                            continue;
                        }
                        if (var528 == 4110) {
                            var7 -= 2;
                            String var139 = class284.field4450[var7];
                            String var140 = class284.field4450[var7 + 1];
                            var6--;
                            if (class67.field881[var6] == 1) {
                                class284.field4450[var7++] = var139;
                            } else {
                                class284.field4450[var7++] = var140;
                            }
                            continue;
                        }
                        if (var528 == 4111) {
                            var7--;
                            String var141 = class284.field4450[var7];
                            class284.field4450[var7++] = class11.method57(var141);
                            continue;
                        }
                        if (var528 == 4112) {
                            var7--;
                            String var142 = class284.field4450[var7];
                            var6--;
                            int var143 = class67.field881[var6];
                            if (var143 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class284.field4450[var7++] = var142 + (char) var143;
                            continue;
                        }
                        if (var528 == 4113) {
                            var6--;
                            int var144 = class67.field881[var6];
                            class67.field881[var6++] = class53.method319(-256, (char) var144) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4114) {
                            var6--;
                            int var145 = class67.field881[var6];
                            class67.field881[var6++] = class67.method422(115, (char) var145) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4115) {
                            var6--;
                            int var146 = class67.field881[var6];
                            class67.field881[var6++] = class232.method1634((char) var146, 123) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4116) {
                            var6--;
                            int var147 = class67.field881[var6];
                            class67.field881[var6++] = method2194(-11206, (char) var147) ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4117) {
                            var7--;
                            String var148 = class284.field4450[var7];
                            if (var148 == null) {
                                class67.field881[var6++] = 0;
                            } else {
                                class67.field881[var6++] = var148.length();
                            }
                            continue;
                        }
                        if (var528 == 4118) {
                            var6 -= 2;
                            int var149 = class67.field881[var6];
                            var7--;
                            String var150 = class284.field4450[var7];
                            int var151 = class67.field881[var6 + 1];
                            class284.field4450[var7++] = var150.substring(var149, var151);
                            continue;
                        }
                        if (var528 == 4119) {
                            boolean var152 = false;
                            var7--;
                            String var153 = class284.field4450[var7];
                            StringBuffer var154 = new StringBuffer(var153.length());
                            for (int var155 = 0; var155 < var153.length(); var155++) {
                                char var156 = var153.charAt(var155);
                                if (var156 == '<') {
                                    var152 = true;
                                } else if (var156 == '>') {
                                    var152 = false;
                                } else if (!var152) {
                                    var154.append(var156);
                                }
                            }
                            class284.field4450[var7++] = var154.toString();
                            continue;
                        }
                        if (var528 == 4120) {
                            var6 -= 2;
                            int var157 = class67.field881[var6];
                            var7--;
                            String var158 = class284.field4450[var7];
                            int var159 = class67.field881[var6 + 1];
                            class67.field881[var6++] = var158.indexOf(var157, var159);
                            continue;
                        }
                        if (var528 == 4121) {
                            var7 -= 2;
                            String var160 = class284.field4450[var7];
                            String var161 = class284.field4450[var7 + 1];
                            var6--;
                            int var162 = class67.field881[var6];
                            class67.field881[var6++] = var160.indexOf(var161, var162);
                            continue;
                        }
                        if (var528 == 4122) {
                            var6--;
                            int var163 = class67.field881[var6];
                            class67.field881[var6++] = Character.toLowerCase((char) var163);
                            continue;
                        }
                        if (var528 == 4123) {
                            var6--;
                            int var164 = class67.field881[var6];
                            class67.field881[var6++] = Character.toUpperCase((char) var164);
                            continue;
                        }
                        if (var528 == 4124) {
                            var6--;
                            boolean var165 = class67.field881[var6] != 0;
                            var6--;
                            int var166 = class67.field881[var6];
                            class284.field4450[var7++] = class220.method1512((long) var166, class172.field2484, 0, var165, 114);
                            continue;
                        }
                    } else if (var528 < 4300) {
                        if (var528 == 4200) {
                            var6--;
                            int var167 = class67.field881[var6];
                            class284.field4450[var7++] = class60.method353(var167, (byte) -47).field1167;
                            continue;
                        }
                        if (var528 == 4201) {
                            var6 -= 2;
                            int var168 = class67.field881[var6];
                            int var169 = class67.field881[var6 + 1];
                            class93 var170 = class60.method353(var168, (byte) -90);
                            if (var169 >= 1 && var169 <= 5 && var170.field1172[var169 - 1] != null) {
                                class284.field4450[var7++] = var170.field1172[var169 - 1];
                                continue;
                            }
                            class284.field4450[var7++] = "";
                            continue;
                        }
                        if (var528 == 4202) {
                            var6 -= 2;
                            int var171 = class67.field881[var6];
                            int var172 = class67.field881[var6 + 1];
                            class93 var173 = class60.method353(var171, (byte) -44);
                            if (var172 >= 1 && var172 <= 5 && var173.field1163[var172 - 1] != null) {
                                class284.field4450[var7++] = var173.field1163[var172 - 1];
                                continue;
                            }
                            class284.field4450[var7++] = "";
                            continue;
                        }
                        if (var528 == 4203) {
                            var6--;
                            int var174 = class67.field881[var6];
                            class67.field881[var6++] = class60.method353(var174, (byte) -39).field1219;
                            continue;
                        }
                        if (var528 == 4204) {
                            var6--;
                            int var175 = class67.field881[var6];
                            class67.field881[var6++] = class60.method353(var175, (byte) -71).field1188 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4205) {
                            var6--;
                            int var176 = class67.field881[var6];
                            class93 var177 = class60.method353(var176, (byte) -109);
                            if (var177.field1164 == -1 && var177.field1203 >= 0) {
                                class67.field881[var6++] = var177.field1203;
                                continue;
                            }
                            class67.field881[var6++] = var176;
                            continue;
                        }
                        if (var528 == 4206) {
                            var6--;
                            int var178 = class67.field881[var6];
                            class93 var179 = class60.method353(var178, (byte) -78);
                            if (var179.field1164 >= 0 && var179.field1203 >= 0) {
                                class67.field881[var6++] = var179.field1203;
                                continue;
                            }
                            class67.field881[var6++] = var178;
                            continue;
                        }
                        if (var528 == 4207) {
                            var6--;
                            int var180 = class67.field881[var6];
                            class67.field881[var6++] = class60.method353(var180, (byte) -118).field1205 ? 1 : 0;
                            continue;
                        }
                        if (var528 == 4208) {
                            var6 -= 2;
                            int var181 = class67.field881[var6];
                            int var182 = class67.field881[var6 + 1];
                            class30 var183 = class343.method2373(-59, var182);
                            if (var183.method181(500)) {
                                class284.field4450[var7++] = class60.method353(var181, (byte) -121).method549(-4480, var182, var183.field373);
                            } else {
                                class67.field881[var6++] = class60.method353(var181, (byte) -114).method558(var182, 0, var183.field377);
                            }
                            continue;
                        }
                        if (var528 == 4210) {
                            var6--;
                            int var184 = class67.field881[var6];
                            var7--;
                            String var185 = class284.field4450[var7];
                            class298.method2110(128, var185, var184 == 1);
                            class67.field881[var6++] = class345.field5354;
                            continue;
                        }
                        if (var528 == 4211) {
                            if (class280.field4342 != null && class158.field2177 < class345.field5354) {
                                class67.field881[var6++] = class229.method1613(class280.field4342[class158.field2177++], 65535);
                                continue;
                            }
                            class67.field881[var6++] = -1;
                            continue;
                        }
                        if (var528 == 4212) {
                            class158.field2177 = 0;
                            continue;
                        }
                    } else if (var528 < 4400) {
                        if (var528 == 4300) {
                            var6 -= 2;
                            int var186 = class67.field881[var6];
                            int var187 = class67.field881[var6 + 1];
                            class30 var188 = class343.method2373(-76, var187);
                            if (var188.method181(500)) {
                                class284.field4450[var7++] = class120.method815(-127, var186).method2024(-1, var188.field373, var187);
                            } else {
                                class67.field881[var6++] = class120.method815(-112, var186).method2023(var187, !arg2, var188.field377);
                            }
                            continue;
                        }
                    } else if (var528 < 4500) {
                        if (var528 == 4400) {
                            var6 -= 2;
                            int var189 = class67.field881[var6];
                            int var190 = class67.field881[var6 + 1];
                            class30 var191 = class343.method2373(-114, var190);
                            if (var191.method181(500)) {
                                class284.field4450[var7++] = class142.method951(var189, 26915).method1702((byte) -110, var191.field373, var190);
                            } else {
                                class67.field881[var6++] = class142.method951(var189, 26915).method1693(var190, var191.field377, false);
                            }
                            continue;
                        }
                    } else if (var528 >= 4600) {
                        if (var528 < 5100) {
                            if (var528 == 5000) {
                                class67.field881[var6++] = class68.field898;
                                continue;
                            }
                            if (var528 == 5001) {
                                class50.field623++;
                                var6 -= 3;
                                class68.field898 = class67.field881[var6];
                                class7.field107 = class67.field881[var6 + 1];
                                class272.field4268 = class67.field881[var6 + 2];
                                class140.field1954.method573(121, 26);
                                class140.field1954.method648(class68.field898, (byte) 38);
                                class140.field1954.method648(class7.field107, (byte) 38);
                                class140.field1954.method648(class272.field4268, (byte) 38);
                                continue;
                            }
                            if (var528 == 5002) {
                                var6 -= 2;
                                var7--;
                                String var308 = class284.field4450[var7];
                                class262.field3963++;
                                int var309 = class67.field881[var6 + 1];
                                int var310 = class67.field881[var6];
                                class140.field1954.method573(121, 88);
                                class140.field1954.method678(class48.method285((byte) -90, var308), (byte) 119);
                                class140.field1954.method648(var310 - 1, (byte) 38);
                                class140.field1954.method648(var309, (byte) 38);
                                continue;
                            }
                            if (var528 == 5003) {
                                var6--;
                                int var311 = class67.field881[var6];
                                String var312 = null;
                                if (var311 < 100) {
                                    var312 = class217.field3041[var311];
                                }
                                if (var312 == null) {
                                    var312 = "";
                                }
                                class284.field4450[var7++] = var312;
                                continue;
                            }
                            if (var528 == 5004) {
                                int var313 = -1;
                                var6--;
                                int var314 = class67.field881[var6];
                                if (var314 < 100 && class217.field3041[var314] != null) {
                                    var313 = class80.field1019[var314];
                                }
                                class67.field881[var6++] = var313;
                                continue;
                            }
                            if (var528 == 5005) {
                                class67.field881[var6++] = class7.field107;
                                continue;
                            }
                            if (var528 == 5008) {
                                var7--;
                                String var315 = class284.field4450[var7];
                                if (!var315.startsWith("::")) {
                                    if (class154.field2151 == 0 && (class270.field4257 && !class136.field1884 || class316.field4872)) {
                                        continue;
                                    }
                                    String var316 = var315.toLowerCase();
                                    class224.field3183++;
                                    byte var317 = 0;
                                    byte var318 = 0;
                                    if (var316.startsWith(class171.field2458)) {
                                        var318 = 0;
                                        var315 = var315.substring(class171.field2458.length());
                                    } else if (var316.startsWith(class325.field4983)) {
                                        var318 = 1;
                                        var315 = var315.substring(class325.field4983.length());
                                    } else if (var316.startsWith(class31.field391)) {
                                        var315 = var315.substring(class31.field391.length());
                                        var318 = 2;
                                    } else if (var316.startsWith(class157.field2175)) {
                                        var318 = 3;
                                        var315 = var315.substring(class157.field2175.length());
                                    } else if (var316.startsWith(class195.field2804)) {
                                        var315 = var315.substring(class195.field2804.length());
                                        var318 = 4;
                                    } else if (var316.startsWith(class292.field4576)) {
                                        var318 = 5;
                                        var315 = var315.substring(class292.field4576.length());
                                    } else if (var316.startsWith(class307.field4745)) {
                                        var315 = var315.substring(class307.field4745.length());
                                        var318 = 6;
                                    } else if (var316.startsWith(class284.field4459)) {
                                        var318 = 7;
                                        var315 = var315.substring(class284.field4459.length());
                                    } else if (var316.startsWith(class328.field5015)) {
                                        var318 = 8;
                                        var315 = var315.substring(class328.field5015.length());
                                    } else if (var316.startsWith(class60.field747)) {
                                        var315 = var315.substring(class60.field747.length());
                                        var318 = 9;
                                    } else if (var316.startsWith(class283.field4444)) {
                                        var315 = var315.substring(class283.field4444.length());
                                        var318 = 10;
                                    } else if (var316.startsWith(class116.field1653)) {
                                        var318 = 11;
                                        var315 = var315.substring(class116.field1653.length());
                                    } else if (class172.field2484 != 0) {
                                        if (var316.startsWith(class206.field2890)) {
                                            var318 = 0;
                                            var315 = var315.substring(class206.field2890.length());
                                        } else if (var316.startsWith(class252.field3830)) {
                                            var318 = 1;
                                            var315 = var315.substring(class252.field3830.length());
                                        } else if (var316.startsWith(class237.field3479)) {
                                            var318 = 2;
                                            var315 = var315.substring(class237.field3479.length());
                                        } else if (var316.startsWith(class42.field500)) {
                                            var315 = var315.substring(class42.field500.length());
                                            var318 = 3;
                                        } else if (var316.startsWith(class115.field1638)) {
                                            var318 = 4;
                                            var315 = var315.substring(class115.field1638.length());
                                        } else if (var316.startsWith(class97.field1274)) {
                                            var315 = var315.substring(class97.field1274.length());
                                            var318 = 5;
                                        } else if (var316.startsWith(class301.field4699)) {
                                            var315 = var315.substring(class301.field4699.length());
                                            var318 = 6;
                                        } else if (var316.startsWith(class40.field470)) {
                                            var315 = var315.substring(class40.field470.length());
                                            var318 = 7;
                                        } else if (var316.startsWith(class233.field3403)) {
                                            var315 = var315.substring(class233.field3403.length());
                                            var318 = 8;
                                        } else if (var316.startsWith(class307.field4754)) {
                                            var318 = 9;
                                            var315 = var315.substring(class307.field4754.length());
                                        } else if (var316.startsWith(class316.field4870)) {
                                            var315 = var315.substring(class316.field4870.length());
                                            var318 = 10;
                                        } else if (var316.startsWith(class303.field4707)) {
                                            var315 = var315.substring(class303.field4707.length());
                                            var318 = 11;
                                        }
                                    }
                                    String var319 = var315.toLowerCase();
                                    if (var319.startsWith(class12.field169)) {
                                        var317 = 1;
                                        var315 = var315.substring(class12.field169.length());
                                    } else if (var319.startsWith(class171.field2461)) {
                                        var315 = var315.substring(class171.field2461.length());
                                        var317 = 2;
                                    } else if (var319.startsWith(class283.field4446)) {
                                        var315 = var315.substring(class283.field4446.length());
                                        var317 = 3;
                                    } else if (var319.startsWith(class73.field934)) {
                                        var317 = 4;
                                        var315 = var315.substring(class73.field934.length());
                                    } else if (var319.startsWith(class32.field407)) {
                                        var317 = 5;
                                        var315 = var315.substring(class32.field407.length());
                                    } else if (class172.field2484 != 0) {
                                        if (var319.startsWith(class295.field4609)) {
                                            var315 = var315.substring(class295.field4609.length());
                                            var317 = 1;
                                        } else if (var319.startsWith(class218.field3068)) {
                                            var315 = var315.substring(class218.field3068.length());
                                            var317 = 2;
                                        } else if (var319.startsWith(class258.field3919)) {
                                            var315 = var315.substring(class258.field3919.length());
                                            var317 = 3;
                                        } else if (var319.startsWith(class305.field4727)) {
                                            var317 = 4;
                                            var315 = var315.substring(class305.field4727.length());
                                        } else if (var319.startsWith(class283.field4442)) {
                                            var315 = var315.substring(class283.field4442.length());
                                            var317 = 5;
                                        }
                                    }
                                    class140.field1954.method573(118, 147);
                                    class140.field1954.method648(0, (byte) 38);
                                    int var320 = class140.field1954.field1400;
                                    class140.field1954.method648(var318, (byte) 38);
                                    class140.field1954.method648(var317, (byte) 38);
                                    class109.method741(class140.field1954, var315, -118);
                                    class140.field1954.method654(class140.field1954.field1400 - var320, 38102816);
                                    continue;
                                }
                                class322.method2241(12, var315);
                                continue;
                            }
                            if (var528 == 5009) {
                                var7 -= 2;
                                String var321 = class284.field4450[var7];
                                String var322 = class284.field4450[var7 + 1];
                                if (class154.field2151 != 0 || (!class270.field4257 || class136.field1884) && !class316.field4872) {
                                    class301.field4697++;
                                    class140.field1954.method573(116, 66);
                                    class140.field1954.method648(0, (byte) 38);
                                    int var323 = class140.field1954.field1400;
                                    class140.field1954.method678(class48.method285((byte) -90, var321), (byte) 119);
                                    class109.method741(class140.field1954, var322, 90);
                                    class140.field1954.method654(class140.field1954.field1400 - var323, 38102816);
                                }
                                continue;
                            }
                            if (var528 == 5010) {
                                var6--;
                                int var324 = class67.field881[var6];
                                String var325 = null;
                                if (var324 < 100) {
                                    var325 = class161.field2217[var324];
                                }
                                if (var325 == null) {
                                    var325 = "";
                                }
                                class284.field4450[var7++] = var325;
                                continue;
                            }
                            if (var528 == 5011) {
                                var6--;
                                int var326 = class67.field881[var6];
                                String var327 = null;
                                if (var326 < 100) {
                                    var327 = class179.field2604[var326];
                                }
                                if (var327 == null) {
                                    var327 = "";
                                }
                                class284.field4450[var7++] = var327;
                                continue;
                            }
                            if (var528 == 5012) {
                                var6--;
                                int var328 = class67.field881[var6];
                                int var329 = -1;
                                if (var328 < 100) {
                                    var329 = class301.field4703[var328];
                                }
                                class67.field881[var6++] = var329;
                                continue;
                            }
                            if (var528 == 5015) {
                                String var330;
                                if (class118.field1664 == null || class118.field1664.field1496 == null) {
                                    var330 = class222.field3147;
                                } else {
                                    var330 = class118.field1664.method742(-1);
                                }
                                class284.field4450[var7++] = var330;
                                continue;
                            }
                            if (var528 == 5016) {
                                class67.field881[var6++] = class272.field4268;
                                continue;
                            }
                            if (var528 == 5017) {
                                class67.field881[var6++] = class136.field1890;
                                continue;
                            }
                            if (var528 == 5050) {
                                var6--;
                                int var331 = class67.field881[var6];
                                class284.field4450[var7++] = class133.method885(true, var331).field3867;
                                continue;
                            }
                            if (var528 == 5051) {
                                var6--;
                                int var332 = class67.field881[var6];
                                class254 var333 = class133.method885(true, var332);
                                if (var333.field3860 == null) {
                                    class67.field881[var6++] = 0;
                                } else {
                                    class67.field881[var6++] = var333.field3860.length;
                                }
                                continue;
                            }
                            if (var528 == 5052) {
                                var6 -= 2;
                                int var334 = class67.field881[var6];
                                int var335 = class67.field881[var6 + 1];
                                class254 var336 = class133.method885(true, var334);
                                int var337 = var336.field3860[var335];
                                class67.field881[var6++] = var337;
                                continue;
                            }
                            if (var528 == 5053) {
                                var6--;
                                int var338 = class67.field881[var6];
                                class254 var339 = class133.method885(true, var338);
                                if (var339.field3859 == null) {
                                    class67.field881[var6++] = 0;
                                } else {
                                    class67.field881[var6++] = var339.field3859.length;
                                }
                                continue;
                            }
                            if (var528 == 5054) {
                                var6 -= 2;
                                int var340 = class67.field881[var6];
                                int var341 = class67.field881[var6 + 1];
                                class67.field881[var6++] = class133.method885(true, var340).field3859[var341];
                                continue;
                            }
                            if (var528 == 5055) {
                                var6--;
                                int var342 = class67.field881[var6];
                                class284.field4450[var7++] = class135.method897((byte) 79, var342).method261((byte) 86);
                                continue;
                            }
                            if (var528 == 5056) {
                                var6--;
                                int var343 = class67.field881[var6];
                                class44 var344 = class135.method897((byte) 79, var343);
                                if (var344.field523 == null) {
                                    class67.field881[var6++] = 0;
                                } else {
                                    class67.field881[var6++] = var344.field523.length;
                                }
                                continue;
                            }
                            if (var528 == 5057) {
                                var6 -= 2;
                                int var345 = class67.field881[var6];
                                int var346 = class67.field881[var6 + 1];
                                class67.field881[var6++] = class135.method897((byte) 79, var345).field523[var346];
                                continue;
                            }
                            if (var528 == 5058) {
                                class325.field4987 = new class16();
                                var6--;
                                class325.field4987.field221 = class67.field881[var6];
                                class325.field4987.field220 = class135.method897((byte) 79, class325.field4987.field221);
                                class325.field4987.field225 = new int[class325.field4987.field220.method258(arg2)];
                                continue;
                            }
                            if (var528 == 5059) {
                                class15.field208++;
                                class140.field1954.method573(115, 41);
                                class140.field1954.method648(0, (byte) 38);
                                int var347 = class140.field1954.field1400;
                                class140.field1954.method648(0, (byte) 38);
                                class140.field1954.method662(true, class325.field4987.field221);
                                class325.field4987.field220.method262(class140.field1954, class325.field4987.field225, (byte) 116);
                                class140.field1954.method654(class140.field1954.field1400 - var347, 38102816);
                                continue;
                            }
                            if (var528 == 5060) {
                                class134.field1849++;
                                var7--;
                                String var348 = class284.field4450[var7];
                                class140.field1954.method573(121, 5);
                                class140.field1954.method648(0, (byte) 38);
                                int var349 = class140.field1954.field1400;
                                class140.field1954.method678(class48.method285((byte) -90, var348), (byte) 102);
                                class140.field1954.method662(true, class325.field4987.field221);
                                class325.field4987.field220.method262(class140.field1954, class325.field4987.field225, (byte) 9);
                                class140.field1954.method654(class140.field1954.field1400 - var349, 38102816);
                                continue;
                            }
                            if (var528 == 5061) {
                                class140.field1954.method573(120, 41);
                                class15.field208++;
                                class140.field1954.method648(0, (byte) 38);
                                int var350 = class140.field1954.field1400;
                                class140.field1954.method648(1, (byte) 38);
                                class140.field1954.method662(arg2, class325.field4987.field221);
                                class325.field4987.field220.method262(class140.field1954, class325.field4987.field225, (byte) -124);
                                class140.field1954.method654(class140.field1954.field1400 - var350, 38102816);
                                continue;
                            }
                            if (var528 == 5062) {
                                var6 -= 2;
                                int var351 = class67.field881[var6 + 1];
                                int var352 = class67.field881[var6];
                                class67.field881[var6++] = class133.method885(true, var352).field3871[var351];
                                continue;
                            }
                            if (var528 == 5063) {
                                var6 -= 2;
                                int var353 = class67.field881[var6];
                                int var354 = class67.field881[var6 + 1];
                                class67.field881[var6++] = class133.method885(true, var353).field3865[var354];
                                continue;
                            }
                            if (var528 == 5064) {
                                var6 -= 2;
                                int var355 = class67.field881[var6];
                                int var356 = class67.field881[var6 + 1];
                                if (var356 == -1) {
                                    class67.field881[var6++] = -1;
                                } else {
                                    class67.field881[var6++] = class133.method885(arg2, var355).method1844((byte) 113, (char) var356);
                                }
                                continue;
                            }
                            if (var528 == 5065) {
                                var6 -= 2;
                                int var357 = class67.field881[var6];
                                int var358 = class67.field881[var6 + 1];
                                if (var358 == -1) {
                                    class67.field881[var6++] = -1;
                                } else {
                                    class67.field881[var6++] = class133.method885(arg2, var357).method1850((char) var358, 0);
                                }
                                continue;
                            }
                            if (var528 == 5066) {
                                var6--;
                                int var359 = class67.field881[var6];
                                class67.field881[var6++] = class135.method897((byte) 79, var359).method258(true);
                                continue;
                            }
                            if (var528 == 5067) {
                                var6 -= 2;
                                int var360 = class67.field881[var6];
                                int var361 = class67.field881[var6 + 1];
                                int var362 = class135.method897((byte) 79, var360).method253((byte) -85, var361);
                                class67.field881[var6++] = var362;
                                continue;
                            }
                            if (var528 == 5068) {
                                var6 -= 2;
                                int var363 = class67.field881[var6 + 1];
                                int var364 = class67.field881[var6];
                                class325.field4987.field225[var364] = var363;
                                continue;
                            }
                            if (var528 == 5069) {
                                var6 -= 2;
                                int var365 = class67.field881[var6 + 1];
                                int var366 = class67.field881[var6];
                                class325.field4987.field225[var366] = var365;
                                continue;
                            }
                            if (var528 == 5070) {
                                var6 -= 3;
                                int var367 = class67.field881[var6];
                                int var368 = class67.field881[var6 + 1];
                                int var369 = class67.field881[var6 + 2];
                                class44 var370 = class135.method897((byte) 79, var367);
                                if (var370.method253((byte) 104, var368) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class67.field881[var6++] = var370.method260(var369, var368, 0);
                                continue;
                            }
                            if (var528 == 5071) {
                                var7--;
                                String var371 = class284.field4450[var7];
                                var6--;
                                boolean var372 = class67.field881[var6] == 1;
                                class127.method847(var371, var372, true);
                                class67.field881[var6++] = class345.field5354;
                                continue;
                            }
                            if (var528 == 5072) {
                                if (class280.field4342 != null && class158.field2177 < class345.field5354) {
                                    class67.field881[var6++] = class229.method1613(65535, class280.field4342[class158.field2177++]);
                                    continue;
                                }
                                class67.field881[var6++] = -1;
                                continue;
                            }
                            if (var528 == 5073) {
                                class158.field2177 = 0;
                                continue;
                            }
                        } else if (var528 < 5200) {
                            if (var528 == 5100) {
                                if (class184.field2650[86]) {
                                    class67.field881[var6++] = 1;
                                } else {
                                    class67.field881[var6++] = 0;
                                }
                                continue;
                            }
                            if (var528 == 5101) {
                                if (class184.field2650[82]) {
                                    class67.field881[var6++] = 1;
                                } else {
                                    class67.field881[var6++] = 0;
                                }
                                continue;
                            }
                            if (var528 == 5102) {
                                if (class184.field2650[81]) {
                                    class67.field881[var6++] = 1;
                                } else {
                                    class67.field881[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var528 < 5300) {
                            if (var528 == 5200) {
                                var6--;
                                class158.method1050(class67.field881[var6], -92);
                                continue;
                            }
                            if (var528 == 5201) {
                                class67.field881[var6++] = class165.method1077((byte) -66);
                                continue;
                            }
                            if (var528 == 5202) {
                                var6--;
                                class12.method85(-36, class67.field881[var6]);
                                continue;
                            }
                            if (var528 == 5203) {
                                var7--;
                                class305.method2135(class284.field4450[var7], -1);
                                continue;
                            }
                            if (var528 == 5204) {
                                class284.field4450[var7 - 1] = class214.method1462(class284.field4450[var7 - 1], (byte) 41);
                                continue;
                            }
                            if (var528 == 5205) {
                                var6--;
                                class235.method1666(-1, class67.field881[var6], -1, 4);
                                continue;
                            }
                            if (var528 == 5206) {
                                var6--;
                                int var192 = class67.field881[var6];
                                class79 var193 = class267.method1937(var192 & 0x3FFF, var192 >> 14 & 0x3FFF, -118);
                                if (var193 == null) {
                                    class67.field881[var6++] = -1;
                                } else {
                                    class67.field881[var6++] = var193.field994;
                                }
                                continue;
                            }
                            if (var528 == 5207) {
                                var6--;
                                class79 var194 = class73.method446((byte) 55, class67.field881[var6]);
                                if (var194 != null && var194.field992 != null) {
                                    class284.field4450[var7++] = var194.field992;
                                    continue;
                                }
                                class284.field4450[var7++] = "";
                                continue;
                            }
                            if (var528 == 5208) {
                                class67.field881[var6++] = class45.field539;
                                class67.field881[var6++] = class91.field1143;
                                continue;
                            }
                            if (var528 == 5209) {
                                class67.field881[var6++] = class239.field3595 + class231.field3373;
                                class67.field881[var6++] = class308.field4766 + class249.field3771 - class184.field2663 - 1;
                                continue;
                            }
                            if (var528 == 5210) {
                                var6--;
                                int var195 = class67.field881[var6];
                                class79 var196 = class73.method446((byte) 115, var195);
                                if (var196 == null) {
                                    class67.field881[var6++] = 0;
                                    class67.field881[var6++] = 0;
                                } else {
                                    class67.field881[var6++] = class229.method1613(16383, var196.field990 >> 14);
                                    class67.field881[var6++] = class229.method1613(var196.field990, 16383);
                                }
                                continue;
                            }
                            if (var528 == 5211) {
                                var6--;
                                int var197 = class67.field881[var6];
                                class79 var198 = class73.method446((byte) 68, var197);
                                if (var198 == null) {
                                    class67.field881[var6++] = 0;
                                    class67.field881[var6++] = 0;
                                } else {
                                    class67.field881[var6++] = var198.field1006 - var198.field998;
                                    class67.field881[var6++] = var198.field1003 - var198.field995;
                                }
                                continue;
                            }
                            if (var528 == 5212) {
                                int var199 = class53.method326(125);
                                int var200 = 0;
                                String var201;
                                if (var199 == -1) {
                                    var201 = "";
                                } else {
                                    var201 = class334.field5162.field4251[var199];
                                    var200 = class334.field5162.method1961((byte) 127, var199);
                                }
                                String var202 = class170.method1106(var201, 1, "<br>", " ");
                                class284.field4450[var7++] = var202;
                                class67.field881[var6++] = var200;
                                continue;
                            }
                            if (var528 == 5213) {
                                int var203 = class141.method937(-123);
                                int var204 = 0;
                                String var205;
                                if (var203 == -1) {
                                    var205 = "";
                                } else {
                                    var205 = class334.field5162.field4251[var203];
                                    var204 = class334.field5162.method1961((byte) 122, var203);
                                }
                                String var206 = class170.method1106(var205, 1, "<br>", " ");
                                class284.field4450[var7++] = var206;
                                class67.field881[var6++] = var204;
                                continue;
                            }
                            if (var528 == 5214) {
                                var6--;
                                int var207 = class67.field881[var6];
                                class79 var208 = class188.method1300(-109);
                                if (var208 != null) {
                                    int[] var209 = var208.method466((var207 & 0x323D2CE2) >> 28, -10, var207 & 0x3FFF, (var207 & 0xFFFC30D) >> 14);
                                    if (var209 != null) {
                                        class287.method2049(var209[1], var209[2], (byte) -110);
                                    }
                                }
                                continue;
                            }
                            if (var528 == 5215) {
                                var6 -= 2;
                                int var210 = class67.field881[var6 + 1];
                                int var211 = class67.field881[var6];
                                boolean var212 = false;
                                class84 var213 = class165.method1078(var211 >> 14 & 0x3FFF, -108, var211 & 0x3FFF);
                                for (class79 var214 = (class79) var213.method499(3346); var214 != null; var214 = (class79) var213.method501((byte) 102)) {
                                    if (var214.field994 == var210) {
                                        var212 = true;
                                        break;
                                    }
                                }
                                if (var212) {
                                    class67.field881[var6++] = 1;
                                } else {
                                    class67.field881[var6++] = 0;
                                }
                                continue;
                            }
                            if (var528 == 5216) {
                                var6--;
                                int var215 = class67.field881[var6];
                                class260.method1876(var215, (byte) 113);
                                continue;
                            }
                            if (var528 == 5217) {
                                var6--;
                                int var216 = class67.field881[var6];
                                if (class61.method355(var216, (byte) 61)) {
                                    class67.field881[var6++] = 1;
                                } else {
                                    class67.field881[var6++] = 0;
                                }
                                continue;
                            }
                            if (var528 == 5218) {
                                var6--;
                                int var217 = class67.field881[var6];
                                class79 var218 = class73.method446((byte) 41, var217);
                                if (var218 == null) {
                                    class67.field881[var6++] = -1;
                                } else {
                                    class67.field881[var6++] = var218.field1004;
                                }
                                continue;
                            }
                            if (var528 == 5219) {
                                var7--;
                                class243.method1751(class284.field4450[var7], 30924);
                                continue;
                            }
                            if (var528 == 5220) {
                                class67.field881[var6++] = class232.field3393 == 100 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 5221) {
                                var6--;
                                int var219 = class67.field881[var6];
                                class287.method2049(var219 >> 14 & 0x3FFF, var219 & 0x3FFF, (byte) -118);
                                continue;
                            }
                            if (var528 == 5222) {
                                class79 var220 = class188.method1300(-127);
                                if (var220 == null) {
                                    class67.field881[var6++] = -1;
                                    class67.field881[var6++] = -1;
                                } else {
                                    int[] var221 = var220.method472((byte) -118, class231.field3373 + class239.field3595, class308.field4766 + class249.field3771 + -1 + -class184.field2663);
                                    if (var221 == null) {
                                        class67.field881[var6++] = -1;
                                        class67.field881[var6++] = -1;
                                    } else {
                                        class67.field881[var6++] = var221[1];
                                        class67.field881[var6++] = var221[2];
                                    }
                                }
                                continue;
                            }
                            if (var528 == 5223) {
                                var6 -= 2;
                                int var222 = class67.field881[var6];
                                int var223 = class67.field881[var6 + 1];
                                class235.method1666((var223 & 0xFFFDBEA) >> 14, var222, var223 & 0x3FFF, 4);
                                continue;
                            }
                            if (var528 == 5224) {
                                var6--;
                                int var224 = class67.field881[var6];
                                class79 var225 = class188.method1300(-106);
                                if (var225 == null) {
                                    class67.field881[var6++] = -1;
                                    class67.field881[var6++] = -1;
                                } else {
                                    int[] var226 = var225.method466((var224 & 0x33FDC019) >> 28, -10, var224 & 0x3FFF, var224 >> 14 & 0x3FFF);
                                    if (var226 == null) {
                                        class67.field881[var6++] = -1;
                                        class67.field881[var6++] = -1;
                                    } else {
                                        class67.field881[var6++] = var226[1];
                                        class67.field881[var6++] = var226[2];
                                    }
                                }
                                continue;
                            }
                            if (var528 == 5225) {
                                var6--;
                                int var227 = class67.field881[var6];
                                class79 var228 = class188.method1300(-120);
                                if (var228 == null) {
                                    class67.field881[var6++] = -1;
                                    class67.field881[var6++] = -1;
                                } else {
                                    int[] var229 = var228.method472((byte) -118, (var227 & 0xFFFC949) >> 14, var227 & 0x3FFF);
                                    if (var229 == null) {
                                        class67.field881[var6++] = -1;
                                        class67.field881[var6++] = -1;
                                    } else {
                                        class67.field881[var6++] = var229[1];
                                        class67.field881[var6++] = var229[2];
                                    }
                                }
                                continue;
                            }
                        } else if (var528 < 5400) {
                            if (var528 == 5300) {
                                var6 -= 2;
                                int var295 = class67.field881[var6];
                                int var296 = class67.field881[var6 + 1];
                                class35.method208(false, 3, var295, var296, 26332);
                                class67.field881[var6++] = class243.field3659 == null ? 0 : 1;
                                continue;
                            }
                            if (var528 == 5301) {
                                if (class243.field3659 != null) {
                                    class35.method208(false, class191.field2746, -1, -1, 26332);
                                }
                                continue;
                            }
                            if (var528 == 5302) {
                                class149[] var297 = class23.method150(false);
                                class67.field881[var6++] = var297.length;
                                continue;
                            }
                            if (var528 == 5303) {
                                var6--;
                                int var298 = class67.field881[var6];
                                class149[] var299 = class23.method150(false);
                                class67.field881[var6++] = var299[var298].field2077;
                                class67.field881[var6++] = var299[var298].field2067;
                                continue;
                            }
                            if (var528 == 5305) {
                                int var300 = class235.field3416;
                                int var301 = class154.field2127;
                                int var302 = -1;
                                class149[] var303 = class23.method150(false);
                                for (int var304 = 0; var304 < var303.length; var304++) {
                                    class149 var305 = var303[var304];
                                    if (var305.field2077 == var300 && var305.field2067 == var301) {
                                        var302 = var304;
                                        break;
                                    }
                                }
                                class67.field881[var6++] = var302;
                                continue;
                            }
                            if (var528 == 5306) {
                                class67.field881[var6++] = client.method1954(true);
                                continue;
                            }
                            if (var528 == 5307) {
                                var6--;
                                int var306 = class67.field881[var6];
                                if (var306 < 0 || var306 > 2) {
                                    var306 = 0;
                                }
                                class35.method208(false, var306, -1, -1, 26332);
                                continue;
                            }
                            if (var528 == 5308) {
                                class67.field881[var6++] = class191.field2746;
                                continue;
                            }
                            if (var528 == 5309) {
                                var6--;
                                int var307 = class67.field881[var6];
                                if (var307 < 0 || var307 > 2) {
                                    var307 = 0;
                                }
                                class191.field2746 = var307;
                                class319.method2223(class9.field131, 24398);
                                continue;
                            }
                        } else if (var528 < 5500) {
                            if (var528 == 5400) {
                                var7 -= 2;
                                class58.field704++;
                                String var273 = class284.field4450[var7 + 1];
                                String var274 = class284.field4450[var7];
                                var6--;
                                int var275 = class67.field881[var6];
                                class140.field1954.method573(125, 33);
                                class140.field1954.method648(class309.method2164(var274, (byte) 117) + (class309.method2164(var273, (byte) 117) + 1), (byte) 38);
                                class140.field1954.method636(255, var274);
                                class140.field1954.method636(255, var273);
                                class140.field1954.method648(var275, (byte) 38);
                                continue;
                            }
                            if (var528 == 5401) {
                                var6 -= 2;
                                class26.field346[class67.field881[var6]] = (short) class301.method2121(class67.field881[var6 + 1], (byte) 64);
                                class214.method1460(-71);
                                class157.method1046(107);
                                class139.method928((byte) -27);
                                class97.method586((byte) 28);
                                class180.method1249(-101);
                                continue;
                            }
                            if (var528 == 5405) {
                                var6 -= 2;
                                int var276 = class67.field881[var6 + 1];
                                int var277 = class67.field881[var6];
                                if (var277 >= 0 && var277 < 2) {
                                    class147.field2045[var277] = new int[var276 << 1][4];
                                }
                                continue;
                            }
                            if (var528 == 5406) {
                                var6 -= 7;
                                int var278 = class67.field881[var6 + 1] << 1;
                                int var279 = class67.field881[var6];
                                int var280 = class67.field881[var6 + 2];
                                int var281 = class67.field881[var6 + 3];
                                int var282 = class67.field881[var6 + 4];
                                int var283 = class67.field881[var6 + 5];
                                int var284 = class67.field881[var6 + 6];
                                if (var279 >= 0 && var279 < 2 && class147.field2045[var279] != null && var278 >= 0 && class147.field2045[var279].length > var278) {
                                    class147.field2045[var279][var278] = new int[] { class229.method1613(var280 >> 14, 16383) * 128, var281, class229.method1613(16383, var280) * 128, var284 };
                                    class147.field2045[var279][var278 + 1] = new int[] { (class229.method1613(268430100, var282) >> 14) * 128, var283, class229.method1613(var282, 16383) * 128 };
                                }
                                continue;
                            }
                            if (var528 == 5407) {
                                var6--;
                                int var285 = class147.field2045[class67.field881[var6]].length >> 1;
                                class67.field881[var6++] = var285;
                                continue;
                            }
                            if (var528 == 5411) {
                                if (class243.field3659 != null) {
                                    class35.method208(false, class191.field2746, -1, -1, 26332);
                                }
                                if (class329.field5029 == null) {
                                    class15.method108((byte) -111, class239.method1719(true), false);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var528 == 5419) {
                                String var286 = "";
                                if (class135.field1872 != null) {
                                    if (class135.field1872.field241 == null) {
                                        var286 = class328.method2272(class135.field1872.field240, 65);
                                    } else {
                                        var286 = (String) class135.field1872.field241;
                                    }
                                }
                                class284.field4450[var7++] = var286;
                                continue;
                            }
                            if (var528 == 5420) {
                                class67.field881[var6++] = class265.field4178 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 5421) {
                                if (class243.field3659 != null) {
                                    class35.method208(false, class191.field2746, -1, -1, 26332);
                                }
                                var7--;
                                String var287 = class284.field4450[var7];
                                var6--;
                                boolean var288 = class67.field881[var6] == 1;
                                String var289 = class239.method1719(true) + var287;
                                if (class329.field5029 != null || var288 && class265.field4178 != 3 && class265.field4172.startsWith("win") && !class311.field4806) {
                                    class163.field2257 = var289;
                                    class243.field3662 = var288;
                                    class32.field408 = class9.field131.method1906(6641, var289);
                                    continue;
                                }
                                class15.method108((byte) -86, var289, var288);
                                continue;
                            }
                            if (var528 == 5422) {
                                var7 -= 2;
                                String var290 = class284.field4450[var7];
                                var6--;
                                int var291 = class67.field881[var6];
                                String var292 = class284.field4450[var7 + 1];
                                if (var290.length() > 0) {
                                    if (class69.field901 == null) {
                                        class69.field901 = new String[class100.field1321[class249.field3769]];
                                    }
                                    class69.field901[var291] = var290;
                                }
                                if (var292.length() > 0) {
                                    if (class73.field939 == null) {
                                        class73.field939 = new String[class100.field1321[class249.field3769]];
                                    }
                                    class73.field939[var291] = var292;
                                }
                                continue;
                            }
                            if (var528 == 5423) {
                                var7--;
                                System.out.println(class284.field4450[var7]);
                                continue;
                            }
                            if (var528 == 5424) {
                                var6 -= 11;
                                class322.field4952 = class67.field881[var6];
                                class304.field4721 = class67.field881[var6 + 1];
                                class176.field2561 = class67.field881[var6 + 2];
                                class60.field745 = class67.field881[var6 + 3];
                                class7.field109 = class67.field881[var6 + 4];
                                class3.field59 = class67.field881[var6 + 5];
                                class262.field3957 = class67.field881[var6 + 6];
                                class67.field865 = class67.field881[var6 + 7];
                                class3.field44 = class67.field881[var6 + 8];
                                class223.field3148 = class67.field881[var6 + 9];
                                class14.field197 = class67.field881[var6 + 10];
                                class164.field2271.method1194(class7.field109, (byte) 126);
                                class164.field2271.method1194(class3.field59, (byte) 126);
                                class164.field2271.method1194(class262.field3957, (byte) 126);
                                class164.field2271.method1194(class67.field865, (byte) 126);
                                class164.field2271.method1194(class3.field44, (byte) 126);
                                class262.field3964 = true;
                                continue;
                            }
                            if (var528 == 5425) {
                                class222.method1527((byte) 110);
                                class262.field3964 = false;
                                continue;
                            }
                            if (var528 == 5426) {
                                var6--;
                                class166.field2293 = class67.field881[var6];
                                continue;
                            }
                            if (var528 == 5427) {
                                var6 -= 2;
                                class47.field551 = class67.field881[var6];
                                class60.field738 = class67.field881[var6 + 1];
                                continue;
                            }
                            if (var528 == 5428) {
                                var6 -= 2;
                                int var293 = class67.field881[var6];
                                int var294 = class67.field881[var6 + 1];
                                class67.field881[var6++] = class309.method2176(-1, var293, var294) ? 1 : 0;
                                continue;
                            }
                        } else if (var528 < 5600) {
                            if (var528 == 5500) {
                                var6 -= 4;
                                int var261 = class67.field881[var6];
                                int var262 = class67.field881[var6 + 1];
                                int var263 = class67.field881[var6 + 2];
                                int var264 = class67.field881[var6 + 3];
                                class74.method451(var264, (var261 & 0x3FFF) - class118.field1668, (var261 >> 14 & 0x3FFF) + -class142.field1992, 123, var263, false, var262);
                                continue;
                            }
                            if (var528 == 5501) {
                                var6 -= 4;
                                int var265 = class67.field881[var6];
                                int var266 = class67.field881[var6 + 3];
                                int var267 = class67.field881[var6 + 2];
                                int var268 = class67.field881[var6 + 1];
                                class140.method931(((var265 & 0xFFFD54C) >> 14) - class142.field1992, var267, (var265 & 0x3FFF) - class118.field1668, 1746656908, var266, var268);
                                continue;
                            }
                            if (var528 == 5502) {
                                var6 -= 6;
                                int var269 = class67.field881[var6];
                                if (var269 >= 2) {
                                    throw new RuntimeException();
                                }
                                class113.field1607 = var269;
                                int var270 = class67.field881[var6 + 1];
                                if ((var270 + 1) >= (class147.field2045[class113.field1607].length >> 1)) {
                                    throw new RuntimeException();
                                }
                                class321.field4924 = 0;
                                class247.field3743 = var270;
                                class100.field1315 = class67.field881[var6 + 2];
                                class149.field2068 = class67.field881[var6 + 3];
                                int var271 = class67.field881[var6 + 4];
                                if (var271 >= 2) {
                                    throw new RuntimeException();
                                }
                                class96.field1245 = var271;
                                int var272 = class67.field881[var6 + 5];
                                if (var272 + 1 >= class147.field2045[class96.field1245].length >> 1) {
                                    throw new RuntimeException();
                                }
                                class180.field2608 = var272;
                                class118.field1671 = 3;
                                continue;
                            }
                            if (var528 == 5503) {
                                class135.method903((byte) 119);
                                continue;
                            }
                            if (var528 == 5504) {
                                var6 -= 2;
                                class110.method752(6751, class67.field881[var6 + 1], class67.field881[var6]);
                                continue;
                            }
                            if (var528 == 5505) {
                                class67.field881[var6++] = (int) class184.field2664;
                                continue;
                            }
                            if (var528 == 5506) {
                                class67.field881[var6++] = (int) class280.field4344;
                                continue;
                            }
                            if (var528 == 5507) {
                                class20.method125(47);
                                continue;
                            }
                            if (var528 == 5508) {
                                class22.method134(123);
                                continue;
                            }
                            if (var528 == 5509) {
                                class310.method2178(-61);
                                continue;
                            }
                            if (var528 == 5510) {
                                class331.method2283(0);
                                continue;
                            }
                            if (var528 == 5512) {
                                class300.method2117((byte) 112);
                                continue;
                            }
                        } else if (var528 < 5700) {
                            if (var528 == 5600) {
                                var7 -= 2;
                                String var230 = class284.field4450[var7];
                                String var231 = class284.field4450[var7 + 1];
                                var6--;
                                int var232 = class67.field881[var6];
                                if (class17.field236 == 10 && class44.field527 == 0 && class60.field739 == 0 && class239.field3585 == 0 && class41.field489 == 0) {
                                    class323.method2246(var231, var232, 14552, var230);
                                }
                                continue;
                            }
                            if (var528 == 5601) {
                                class183.method1274((byte) -79);
                                continue;
                            }
                            if (var528 == 5602) {
                                if (class60.field739 == 0) {
                                    class255.field3876 = -2;
                                }
                                continue;
                            }
                            if (var528 == 5603) {
                                var6 -= 4;
                                if (class17.field236 == 10 && class44.field527 == 0 && class60.field739 == 0 && class239.field3585 == 0 && class41.field489 == 0) {
                                    class298.method2108(class67.field881[var6 + 2], class67.field881[var6 + 1], -114, class67.field881[var6 + 3], class67.field881[var6]);
                                }
                                continue;
                            }
                            if (var528 == 5604) {
                                var7--;
                                if (class17.field236 == 10 && class44.field527 == 0 && class60.field739 == 0 && class239.field3585 == 0 && class41.field489 == 0) {
                                    class308.method2161(-15388, class48.method285((byte) -90, class284.field4450[var7]));
                                }
                                continue;
                            }
                            if (var528 == 5605) {
                                var7 -= 3;
                                var6 -= 7;
                                if (class17.field236 == 10 && class44.field527 == 0 && class60.field739 == 0 && class239.field3585 == 0 && class41.field489 == 0) {
                                    class116.method793(class67.field881[var6 + 3], class67.field881[var6 + 4] == 1, class48.method285((byte) -90, class284.field4450[var7]), class67.field881[var6 + 2], class67.field881[var6 + 5] == 1, class67.field881[var6 + 6] == 1, class67.field881[var6 + 1], class284.field4450[var7 + 1], class284.field4450[var7 + 2], class67.field881[var6], 719);
                                }
                                continue;
                            }
                            if (var528 == 5606) {
                                if (class239.field3585 == 0) {
                                    class272.field4272 = -2;
                                }
                                continue;
                            }
                            if (var528 == 5607) {
                                class67.field881[var6++] = class255.field3876;
                                continue;
                            }
                            if (var528 == 5608) {
                                class67.field881[var6++] = class145.field2014;
                                continue;
                            }
                            if (var528 == 5609) {
                                class67.field881[var6++] = class272.field4272;
                                continue;
                            }
                            if (var528 == 5610) {
                                for (int var233 = 0; var233 < 5; var233++) {
                                    class284.field4450[var7++] = var233 >= class35.field416.length ? "" : class154.method1025(class35.field416[var233], -127);
                                }
                                class35.field416 = null;
                                continue;
                            }
                            if (var528 == 5611) {
                                class67.field881[var6++] = class322.field4945;
                                continue;
                            }
                        } else if (var528 < 6100) {
                            if (var528 == 6001) {
                                var6--;
                                int var234 = class67.field881[var6];
                                if (var234 < 1) {
                                    var234 = 1;
                                }
                                if (var234 > 4) {
                                    var234 = 4;
                                }
                                class165.field2289 = var234;
                                if (!class250.field3787 || !class162.field2241) {
                                    if (class165.field2289 == 1) {
                                        class215.method1486(0.9F);
                                    }
                                    if (class165.field2289 == 2) {
                                        class215.method1486(0.8F);
                                    }
                                    if (class165.field2289 == 3) {
                                        class215.method1486(0.7F);
                                    }
                                    if (class165.field2289 == 4) {
                                        class215.method1486(0.6F);
                                    }
                                }
                                if (class250.field3787) {
                                    class134.method889((byte) 52);
                                    if (!class162.field2241) {
                                        class276.method1987((byte) 106);
                                    }
                                }
                                class157.method1046(69);
                                class319.method2223(class9.field131, 24398);
                                class136.field1881 = false;
                                continue;
                            }
                            if (var528 == 6002) {
                                var6--;
                                class275.method1981(-108, -2 == ~class67.field881[var6]);
                                class312.method2189(0);
                                class276.method1987((byte) 121);
                                class23.method148((byte) -89);
                                class319.method2223(class9.field131, 24398);
                                class136.field1881 = false;
                                continue;
                            }
                            if (var528 == 6003) {
                                var6--;
                                class238.field3539 = class67.field881[var6] == 1;
                                class23.method148((byte) -92);
                                class319.method2223(class9.field131, 24398);
                                class136.field1881 = false;
                                continue;
                            }
                            if (var528 == 6005) {
                                var6--;
                                class90.field1124 = class67.field881[var6] == 1;
                                class276.method1987((byte) -54);
                                class319.method2223(class9.field131, 24398);
                                class136.field1881 = false;
                                continue;
                            }
                            if (var528 == 6006) {
                                var6--;
                                class117.field1661 = class67.field881[var6] == 1;
                                ((class63) class215.field3020).method370((byte) -124, !class117.field1661);
                                class319.method2223(class9.field131, 24398);
                                class136.field1881 = false;
                                continue;
                            }
                            if (var528 == 6007) {
                                var6--;
                                class240.field3616 = class67.field881[var6] == 1;
                                class319.method2223(class9.field131, 24398);
                                class136.field1881 = false;
                                continue;
                            }
                            if (var528 == 6008) {
                                var6--;
                                class321.field4926 = class67.field881[var6] == 1;
                                class319.method2223(class9.field131, 24398);
                                class136.field1881 = false;
                                continue;
                            }
                            if (var528 == 6009) {
                                var6--;
                                class229.field3332 = class67.field881[var6] == 1;
                                class319.method2223(class9.field131, 24398);
                                class136.field1881 = false;
                                continue;
                            }
                            if (var528 == 6010) {
                                var6--;
                                class272.field4269 = class67.field881[var6] == 1;
                                class319.method2223(class9.field131, 24398);
                                class136.field1881 = false;
                                continue;
                            }
                            if (var528 == 6011) {
                                var6--;
                                int var235 = class67.field881[var6];
                                if (var235 < 0 || var235 > 2) {
                                    var235 = 0;
                                }
                                class345.field5352 = var235;
                                class319.method2223(class9.field131, 24398);
                                class136.field1881 = false;
                                continue;
                            }
                            if (var528 == 6012) {
                                if (class250.field3787) {
                                    class262.method1886(0, 3, 0);
                                }
                                var6--;
                                class162.field2241 = class67.field881[var6] == 1;
                                if (class250.field3787 && class162.field2241) {
                                    class215.method1486(0.7F);
                                } else {
                                    if (class165.field2289 == 1) {
                                        class215.method1486(0.9F);
                                    }
                                    if (class165.field2289 == 2) {
                                        class215.method1486(0.8F);
                                    }
                                    if (class165.field2289 == 3) {
                                        class215.method1486(0.7F);
                                    }
                                    if (class165.field2289 == 4) {
                                        class215.method1486(0.6F);
                                    }
                                }
                                class276.method1987((byte) -63);
                                class319.method2223(class9.field131, 24398);
                                class136.field1881 = false;
                                continue;
                            }
                            if (var528 == 6014) {
                                var6--;
                                class172.field2481 = class67.field881[var6] == 1;
                                if (class250.field3787) {
                                    class276.method1987((byte) -13);
                                }
                                class319.method2223(class9.field131, 24398);
                                class136.field1881 = false;
                                continue;
                            }
                            if (var528 == 6015) {
                                var6--;
                                class177.field2567 = class67.field881[var6] == 1;
                                if (class250.field3787) {
                                    class134.method889((byte) 52);
                                }
                                class319.method2223(class9.field131, 24398);
                                class136.field1881 = false;
                                continue;
                            }
                            if (var528 == 6016) {
                                var6--;
                                int var236 = class67.field881[var6];
                                if (class250.field3787) {
                                    class63.field823 = true;
                                }
                                if (var236 < 0 || var236 > 2) {
                                    var236 = 0;
                                }
                                class67.field878 = var236;
                                continue;
                            }
                            if (var528 == 6017) {
                                var6--;
                                class54.field668 = class67.field881[var6] == 1;
                                class43.method248(16797);
                                class319.method2223(class9.field131, 24398);
                                class136.field1881 = false;
                                continue;
                            }
                            if (var528 == 6018) {
                                var6--;
                                int var237 = class67.field881[var6];
                                if (var237 < 0) {
                                    var237 = 0;
                                }
                                if (var237 > 127) {
                                    var237 = 127;
                                }
                                class259.field3934 = var237;
                                class319.method2223(class9.field131, 24398);
                                class136.field1881 = false;
                                continue;
                            }
                            if (var528 == 6019) {
                                var6--;
                                int var238 = class67.field881[var6];
                                if (var238 < 0) {
                                    var238 = 0;
                                }
                                if (var238 > 255) {
                                    var238 = 255;
                                }
                                if (class225.field3192 != var238) {
                                    if (class225.field3192 == 0 && class195.field2794 != -1) {
                                        class32.method192(var238, (byte) -123, false, class318.field4892, class195.field2794, 0);
                                        class253.field3838 = false;
                                    } else if (var238 == 0) {
                                        class149.method1001((byte) -116);
                                        class253.field3838 = false;
                                    } else {
                                        class258.method1866(var238, 90);
                                    }
                                    class225.field3192 = var238;
                                }
                                class319.method2223(class9.field131, 24398);
                                class136.field1881 = false;
                                continue;
                            }
                            if (var528 == 6020) {
                                var6--;
                                int var239 = class67.field881[var6];
                                if (var239 < 0) {
                                    var239 = 0;
                                }
                                if (var239 > 127) {
                                    var239 = 127;
                                }
                                class261.field3947 = var239;
                                class319.method2223(class9.field131, 24398);
                                class136.field1881 = false;
                                continue;
                            }
                            if (var528 == 6021) {
                                var6--;
                                class161.field2220 = class67.field881[var6] == 1;
                                class23.method148((byte) 110);
                                continue;
                            }
                            if (var528 == 6023) {
                                var6--;
                                int var240 = class67.field881[var6];
                                boolean var241 = false;
                                if (var240 < 0) {
                                    var240 = 0;
                                }
                                if (var240 > 2) {
                                    var240 = 2;
                                }
                                if (class340.field5274 < 96) {
                                    var241 = true;
                                    var240 = 0;
                                }
                                class274.method1978(var240);
                                class319.method2223(class9.field131, 24398);
                                class136.field1881 = false;
                                class67.field881[var6++] = var241 ? 0 : 1;
                                continue;
                            }
                            if (var528 == 6024) {
                                var6--;
                                int var242 = class67.field881[var6];
                                if (var242 < 0 || var242 > 2) {
                                    var242 = 0;
                                }
                                class285.field4465 = var242;
                                class319.method2223(class9.field131, 24398);
                                continue;
                            }
                            if (var528 == 6027) {
                                var6--;
                                int var243 = class67.field881[var6];
                                if (!class250.field3787) {
                                    continue;
                                }
                                if (var243 < 0 || var243 > 1) {
                                    var243 = 0;
                                }
                                class187.method1298(var243 == 1, 0);
                                continue;
                            }
                            if (var528 == 6028) {
                                var6--;
                                class296.field4614 = class67.field881[var6] != 0;
                                class319.method2223(class9.field131, 24398);
                                continue;
                            }
                        } else if (var528 < 6200) {
                            if (var528 == 6101) {
                                class67.field881[var6++] = class165.field2289;
                                continue;
                            }
                            if (var528 == 6102) {
                                class67.field881[var6++] = class339.method2348((byte) 69) ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6103) {
                                class67.field881[var6++] = class238.field3539 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6105) {
                                class67.field881[var6++] = class90.field1124 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6106) {
                                class67.field881[var6++] = class117.field1661 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6107) {
                                class67.field881[var6++] = class240.field3616 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6108) {
                                class67.field881[var6++] = class321.field4926 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6109) {
                                class67.field881[var6++] = class229.field3332 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6110) {
                                class67.field881[var6++] = class272.field4269 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6111) {
                                class67.field881[var6++] = class345.field5352;
                                continue;
                            }
                            if (var528 == 6112) {
                                class67.field881[var6++] = class162.field2241 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6114) {
                                class67.field881[var6++] = class172.field2481 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6115) {
                                class67.field881[var6++] = class177.field2567 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6116) {
                                class67.field881[var6++] = class67.field878;
                                continue;
                            }
                            if (var528 == 6117) {
                                class67.field881[var6++] = class54.field668 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6118) {
                                class67.field881[var6++] = class259.field3934;
                                continue;
                            }
                            if (var528 == 6119) {
                                class67.field881[var6++] = class225.field3192;
                                continue;
                            }
                            if (var528 == 6120) {
                                class67.field881[var6++] = class261.field3947;
                                continue;
                            }
                            if (var528 == 6121) {
                                if (class250.field3787) {
                                    class67.field881[var6++] = class250.field3813 ? 1 : 0;
                                } else {
                                    class67.field881[var6++] = 0;
                                }
                                continue;
                            }
                            if (var528 == 6123) {
                                class67.field881[var6++] = class274.method1976();
                                continue;
                            }
                            if (var528 == 6124) {
                                class67.field881[var6++] = class285.field4465;
                                continue;
                            }
                            if (var528 == 6126) {
                                if (class250.field3787) {
                                    class67.field881[var6++] = class124.method832() ? 1 : 0;
                                } else {
                                    class67.field881[var6++] = 0;
                                }
                                continue;
                            }
                            if (var528 == 6127) {
                                class67.field881[var6++] = class308.field4759 ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6128) {
                                class67.field881[var6++] = class296.field4614 ? 1 : 0;
                                continue;
                            }
                        } else if (var528 < 6300) {
                            if (var528 == 6200) {
                                var6 -= 2;
                                class171.field2459 = (short) class67.field881[var6];
                                if (class171.field2459 <= 0) {
                                    class171.field2459 = 256;
                                }
                                class165.field2281 = (short) class67.field881[var6 + 1];
                                if (class165.field2281 <= 0) {
                                    class165.field2281 = 205;
                                }
                                continue;
                            }
                            if (var528 == 6201) {
                                var6 -= 2;
                                class154.field2152 = (short) class67.field881[var6];
                                if (class154.field2152 <= 0) {
                                    class154.field2152 = 256;
                                }
                                class249.field3778 = (short) class67.field881[var6 + 1];
                                if (class249.field3778 <= 0) {
                                    class249.field3778 = 320;
                                }
                                continue;
                            }
                            if (var528 == 6202) {
                                var6 -= 4;
                                class93.field1204 = (short) class67.field881[var6];
                                if (class93.field1204 <= 0) {
                                    class93.field1204 = 1;
                                }
                                class55.field674 = (short) class67.field881[var6 + 1];
                                if (class55.field674 <= 0) {
                                    class55.field674 = 32767;
                                } else if (class55.field674 < class93.field1204) {
                                    class55.field674 = class93.field1204;
                                }
                                class13.field178 = (short) class67.field881[var6 + 2];
                                if (class13.field178 <= 0) {
                                    class13.field178 = 1;
                                }
                                class12.field168 = (short) class67.field881[var6 + 3];
                                if (class12.field168 <= 0) {
                                    class12.field168 = 32767;
                                } else if (class12.field168 < class13.field178) {
                                    class12.field168 = class13.field178;
                                }
                                continue;
                            }
                            if (var528 == 6203) {
                                class311.method2180(class226.field3230.field4096, class226.field3230.field3989, 0, false, arg2, 0);
                                class67.field881[var6++] = class100.field1318;
                                class67.field881[var6++] = class21.field265;
                                continue;
                            }
                            if (var528 == 6204) {
                                class67.field881[var6++] = class154.field2152;
                                class67.field881[var6++] = class249.field3778;
                                continue;
                            }
                            if (var528 == 6205) {
                                class67.field881[var6++] = class171.field2459;
                                class67.field881[var6++] = class165.field2281;
                                continue;
                            }
                        } else if (var528 < 6400) {
                            if (var528 == 6300) {
                                class67.field881[var6++] = (int) (class200.method1375(-16185) / 60000L);
                                continue;
                            }
                            if (var528 == 6301) {
                                class67.field881[var6++] = (int) (class200.method1375(-16185) / 86400000L) - 11745;
                                continue;
                            }
                            if (var528 == 6302) {
                                var6 -= 3;
                                int var256 = class67.field881[var6];
                                int var257 = class67.field881[var6 + 2];
                                int var258 = class67.field881[var6 + 1];
                                class316.field4871.clear();
                                class316.field4871.set(11, 12);
                                class316.field4871.set(var257, var258, var256);
                                class67.field881[var6++] = (int) (class316.field4871.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var528 == 6303) {
                                class316.field4871.clear();
                                class316.field4871.setTime(new Date(class200.method1375(-16185)));
                                class67.field881[var6++] = class316.field4871.get(1);
                                continue;
                            }
                            if (var528 == 6304) {
                                var6--;
                                int var259 = class67.field881[var6];
                                boolean var260 = true;
                                if (var259 < 0) {
                                    var260 = (var259 + 1) % 4 == 0;
                                } else if (var259 < 1582) {
                                    var260 = var259 % 4 == 0;
                                } else if ((var259 % 4) != 0) {
                                    var260 = false;
                                } else if (var259 % 100 != 0) {
                                    var260 = true;
                                } else if ((var259 % 400) != 0) {
                                    var260 = false;
                                }
                                class67.field881[var6++] = var260 ? 1 : 0;
                                continue;
                            }
                        } else if (var528 < 6500) {
                            if (var528 == 6405) {
                                class67.field881[var6++] = class292.method2077((byte) -122) ? 1 : 0;
                                continue;
                            }
                            if (var528 == 6406) {
                                class67.field881[var6++] = class35.method209((byte) 34) ? 1 : 0;
                                continue;
                            }
                        } else if (var528 < 6600) {
                            if (var528 == 6500) {
                                if (class17.field236 == 10 && class44.field527 == 0 && class60.field739 == 0 && class239.field3585 == 0) {
                                    class67.field881[var6++] = class279.method2001((byte) -103) == -1 ? 0 : 1;
                                    continue;
                                }
                                class67.field881[var6++] = 1;
                                continue;
                            }
                            if (var528 == 6501) {
                                class163 var244 = class125.method841(-10147);
                                if (var244 == null) {
                                    class67.field881[var6++] = -1;
                                    class67.field881[var6++] = 0;
                                    class284.field4450[var7++] = "";
                                    class67.field881[var6++] = 0;
                                    class284.field4450[var7++] = "";
                                    class67.field881[var6++] = 0;
                                } else {
                                    class67.field881[var6++] = var244.field2254;
                                    class67.field881[var6++] = var244.field2676;
                                    class284.field4450[var7++] = var244.field2248;
                                    class74 var245 = var244.method1071(7);
                                    class67.field881[var6++] = var245.field945;
                                    class284.field4450[var7++] = var245.field946;
                                    class67.field881[var6++] = var244.field2678;
                                }
                                continue;
                            }
                            if (var528 == 6502) {
                                class163 var246 = class16.method112(-86);
                                if (var246 == null) {
                                    class67.field881[var6++] = -1;
                                    class67.field881[var6++] = 0;
                                    class284.field4450[var7++] = "";
                                    class67.field881[var6++] = 0;
                                    class284.field4450[var7++] = "";
                                    class67.field881[var6++] = 0;
                                } else {
                                    class67.field881[var6++] = var246.field2254;
                                    class67.field881[var6++] = var246.field2676;
                                    class284.field4450[var7++] = var246.field2248;
                                    class74 var247 = var246.method1071(7);
                                    class67.field881[var6++] = var247.field945;
                                    class284.field4450[var7++] = var247.field946;
                                    class67.field881[var6++] = var246.field2678;
                                }
                                continue;
                            }
                            if (var528 == 6503) {
                                var6--;
                                int var248 = class67.field881[var6];
                                if (class17.field236 == 10 && class44.field527 == 0 && class60.field739 == 0 && class239.field3585 == 0) {
                                    class67.field881[var6++] = class295.method2092((byte) -69, var248) ? 1 : 0;
                                    continue;
                                }
                                class67.field881[var6++] = 0;
                                continue;
                            }
                            if (var528 == 6504) {
                                var6--;
                                class337.field5215 = class67.field881[var6];
                                class319.method2223(class9.field131, 24398);
                                continue;
                            }
                            if (var528 == 6505) {
                                class67.field881[var6++] = class337.field5215;
                                continue;
                            }
                            if (var528 == 6506) {
                                var6--;
                                int var249 = class67.field881[var6];
                                class163 var250 = class293.method2087(var249, (byte) -38);
                                if (var250 == null) {
                                    class67.field881[var6++] = -1;
                                    class284.field4450[var7++] = "";
                                    class67.field881[var6++] = 0;
                                    class284.field4450[var7++] = "";
                                    class67.field881[var6++] = 0;
                                } else {
                                    class67.field881[var6++] = var250.field2676;
                                    class284.field4450[var7++] = var250.field2248;
                                    class74 var251 = var250.method1071(7);
                                    class67.field881[var6++] = var251.field945;
                                    class284.field4450[var7++] = var251.field946;
                                    class67.field881[var6++] = var250.field2678;
                                }
                                continue;
                            }
                            if (var528 == 6507) {
                                var6 -= 4;
                                int var252 = class67.field881[var6];
                                boolean var253 = class67.field881[var6 + 1] == 1;
                                int var254 = class67.field881[var6 + 2];
                                boolean var255 = class67.field881[var6 + 3] == 1;
                                class120.method814(var255, var252, var253, var254, (byte) -113);
                                continue;
                            }
                        } else if (var528 < 6700) {
                            if (var528 == 6600) {
                                var6--;
                                class258.field3925 = class67.field881[var6] == 1;
                                class319.method2223(class9.field131, 24398);
                                continue;
                            }
                            if (var528 == 6601) {
                                class67.field881[var6++] = class258.field3925 ? 1 : 0;
                                continue;
                            }
                        }
                    } else if (var528 == 4500) {
                        var6 -= 2;
                        int var373 = class67.field881[var6];
                        int var374 = class67.field881[var6 + 1];
                        class30 var375 = class343.method2373(-95, var374);
                        if (var375.method181(500)) {
                            class284.field4450[var7++] = class227.method1566(var373, 26).method2216((byte) -107, var375.field373, var374);
                        } else {
                            class67.field881[var6++] = class227.method1566(var373, 26).method2217(-11421, var374, var375.field377);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var527) {
            if (var5.field3 == null) {
                if (class5.field83 != 0) {
                    class150.method1010("Clientscript error - check log for details", 0, (byte) -59, "");
                }
                class42.method245("CS2 - scr:" + var5.field5065 + " op:" + var10, 1, var527);
            } else {
                StringBuffer var524 = new StringBuffer(30);
                var524.append("%0a - in: ").append(var5.field3);
                for (int var525 = class296.field4617 - 1; var525 >= 0; var525--) {
                    var524.append("%0a - via: ").append(class103.field1329[var525].field3767.field3);
                }
                if (var10 == 40) {
                    int var526 = var11[var8];
                    var524.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var526));
                }
                if (class5.field83 != 0) {
                    class150.method1010("Clientscript error in: " + var5.field3, 0, (byte) -59, "");
                }
                class42.method245("CS2 - scr:" + var5.field5065 + " op:" + var10 + var524.toString(), 1, var527);
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZIZIZ)Llc;", line = 6599)
    public static final class175 method2196(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        field4834++;
        class315 var5 = null;
        if (class22.field287 != null) {
            var5 = new class315(arg3, class22.field287, class183.field2633[arg3], 1000000);
        }
        int var6 = 121 % ((arg1 - 82) / 35);
        class165.field2273[arg3] = class320.field4918.method2167(class17.field235, -1, arg3, var5);
        if (arg0) {
            class165.field2273[arg3].method1685((byte) -43);
        }
        return new class175(class165.field2273[arg3], arg4, arg2);
    }
}
