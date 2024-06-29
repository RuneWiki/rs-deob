import java.io.UnsupportedEncodingException;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class74 extends class262 {

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "Lok;")
    public static class146 field1206 = class235.method1724(-12908, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "Lok;")
    public static class146 field1208 = class235.method1724(-12908, "::fpson");

    @OriginalMember(owner = "client!pb", name = "Y", descriptor = "Lok;")
    private static class146 field1213 = class235.method1724(-12908, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
    public static int field1207 = 0;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "Lok;")
    public static class146 field1205 = field1213;

    @OriginalMember(owner = "client!pb", name = "X", descriptor = "Lok;")
    public static class146 field1212 = class235.method1724(-12908, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!pb", name = "V", descriptor = "F")
    public static float field1210;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!pb", name = "U", descriptor = "I")
    public static int field1209;

    @OriginalMember(owner = "client!pb", name = "W", descriptor = "I")
    public static int field1211;

    @OriginalMember(owner = "client!pb", name = "Z", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BILoh;I)[Lhj;", line = 11)
    public static final class28[] method544(byte arg0, int arg1, class15 arg2, int arg3) {
        field1214++;
        if (arg0 <= 63) {
            return (class28[]) null;
        } else if (class230.method1688(arg3, arg1, 1221, arg2)) {
            return class239.method1745((byte) 127);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(B)V", line = 28)
    public static void method545(byte arg0) {
        field1205 = null;
        field1208 = null;
        field1213 = null;
        if (arg0 != -79) {
            method545((byte) -102);
        }
        field1212 = null;
        field1206 = null;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 41)
    public class74() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)[I", line = 54)
    public final int[] method38(int arg0, byte arg1) {
        if (arg1 > -85) {
            this.method38(-23, (byte) 102);
        }
        int[] var3 = this.field4350.method1532(arg0, (byte) 96);
        if (this.field4350.field3333) {
            int var4 = class312.field5326[arg0];
            for (int var5 = 0; var5 < class98.field1598; var5++) {
                var3[var5] = this.method547(var4, class210.field3485[var5], (byte) -45) % 4096;
            }
        }
        field1211++;
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILad;)V", line = 92)
    public static final void method546(int arg0, int arg1, class124 arg2) {
        field1203++;
        Object[] var3 = arg2.field2031;
        int var4 = (Integer) var3[0];
        class283 var5 = class216.method1603(var4, -25933);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        if (arg1 != -1413) {
            method544((byte) -44, 5, (class15) null, 94);
        }
        class242.field4029 = 0;
        int var7 = -1;
        int[] var8 = var5.field4840;
        int var9 = 0;
        int[] var10 = var5.field4844;
        byte var11 = -1;
        try {
            int var12 = 0;
            class160.field2709 = new int[var5.field4841];
            class138.field2301 = new class146[var5.field4854];
            int var13 = 0;
            for (int var14 = 1; var14 < var3.length; var14++) {
                if (var3[var14] instanceof Integer) {
                    int var15 = (Integer) var3[var14];
                    if (var15 == -2147483647) {
                        var15 = arg2.field2024;
                    }
                    if (var15 == -2147483646) {
                        var15 = arg2.field2033;
                    }
                    if (var15 == -2147483645) {
                        var15 = arg2.field2039 == null ? -1 : arg2.field2039.field4461;
                    }
                    if (var15 == -2147483644) {
                        var15 = arg2.field2023;
                    }
                    if (var15 == -2147483643) {
                        var15 = arg2.field2039 == null ? -1 : arg2.field2039.field4417;
                    }
                    if (var15 == -2147483642) {
                        var15 = arg2.field2025 == null ? -1 : arg2.field2025.field4461;
                    }
                    if (var15 == -2147483641) {
                        var15 = arg2.field2025 == null ? -1 : arg2.field2025.field4417;
                    }
                    if (var15 == -2147483640) {
                        var15 = arg2.field2026;
                    }
                    if (var15 == -2147483639) {
                        var15 = arg2.field2034;
                    }
                    class160.field2709[var12++] = var15;
                } else if (var3[var14] instanceof class146) {
                    class146 var16 = (class146) var3[var14];
                    if (var16.method1100((byte) -112, class202.field3376)) {
                        var16 = arg2.field2035;
                    }
                    class138.field2301[var13++] = var16;
                }
            }
            int var17 = 0;
            label4261: while (true) {
                var17++;
                if (var17 > arg0) {
                    throw new RuntimeException("slow");
                }
                var7++;
                int var514 = var8[var7];
                if (var514 < 100) {
                    if (var514 == 0) {
                        class157.field2651[var6++] = var10[var7];
                        continue;
                    }
                    if (var514 == 1) {
                        int var18 = var10[var7];
                        class157.field2651[var6++] = class75.field1221[var18];
                        continue;
                    }
                    if (var514 == 2) {
                        int var19 = var10[var7];
                        var6--;
                        class168.method1301((byte) -22, var19, class157.field2651[var6]);
                        continue;
                    }
                    if (var514 == 3) {
                        class196.field3270[var9++] = var5.field4842[var7];
                        continue;
                    }
                    if (var514 == 6) {
                        var7 += var10[var7];
                        continue;
                    }
                    if (var514 == 7) {
                        var6 -= 2;
                        if (class157.field2651[var6 + 1] != class157.field2651[var6]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var514 == 8) {
                        var6 -= 2;
                        if (class157.field2651[var6 + 1] == class157.field2651[var6]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var514 == 9) {
                        var6 -= 2;
                        if (class157.field2651[var6 + 1] > class157.field2651[var6]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var514 == 10) {
                        var6 -= 2;
                        if (class157.field2651[var6 + 1] < class157.field2651[var6]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var514 == 21) {
                        if (class242.field4029 == 0) {
                            return;
                        }
                        class31 var20 = class227.field3784[--class242.field4029];
                        var5 = var20.field573;
                        var8 = var5.field4840;
                        class138.field2301 = var20.field577;
                        var7 = var20.field579;
                        var10 = var5.field4844;
                        class160.field2709 = var20.field574;
                        continue;
                    }
                    if (var514 == 25) {
                        int var21 = var10[var7];
                        class157.field2651[var6++] = class75.method549(var21, 18);
                        continue;
                    }
                    if (var514 == 27) {
                        int var22 = var10[var7];
                        var6--;
                        class276.method2010(-18084, var22, class157.field2651[var6]);
                        continue;
                    }
                    if (var514 == 31) {
                        var6 -= 2;
                        if (class157.field2651[var6 + 1] >= class157.field2651[var6]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var514 == 32) {
                        var6 -= 2;
                        if (class157.field2651[var6 + 1] <= class157.field2651[var6]) {
                            var7 += var10[var7];
                        }
                        continue;
                    }
                    if (var514 == 33) {
                        class157.field2651[var6++] = class160.field2709[var10[var7]];
                        continue;
                    }
                    int var10001;
                    if (var514 == 34) {
                        var10001 = var10[var7];
                        var6--;
                        class160.field2709[var10001] = class157.field2651[var6];
                        continue;
                    }
                    if (var514 == 35) {
                        class196.field3270[var9++] = class138.field2301[var10[var7]];
                        continue;
                    }
                    if (var514 == 36) {
                        var10001 = var10[var7];
                        var9--;
                        class138.field2301[var10001] = class196.field3270[var9];
                        continue;
                    }
                    if (var514 == 37) {
                        int var23 = var10[var7];
                        var9 -= var23;
                        class146 var24 = class205.method1553(var9, class196.field3270, 17804, var23);
                        class196.field3270[var9++] = var24;
                        continue;
                    }
                    if (var514 == 38) {
                        var6--;
                        continue;
                    }
                    if (var514 == 39) {
                        var9--;
                        continue;
                    }
                    if (var514 == 40) {
                        int var25 = var10[var7];
                        class283 var26 = class216.method1603(var25, -25933);
                        int[] var27 = new int[var26.field4841];
                        class146[] var28 = new class146[var26.field4854];
                        for (int var29 = 0; var29 < var26.field4850; var29++) {
                            var27[var29] = class157.field2651[var6 + var29 - var26.field4850];
                        }
                        for (int var30 = 0; var30 < var26.field4847; var30++) {
                            var28[var30] = class196.field3270[var9 + var30 - var26.field4847];
                        }
                        var9 -= var26.field4847;
                        var6 -= var26.field4850;
                        class31 var31 = new class31();
                        var31.field579 = var7;
                        var31.field577 = class138.field2301;
                        var31.field573 = var5;
                        var31.field574 = class160.field2709;
                        if (class242.field4029 >= class227.field3784.length) {
                            throw new RuntimeException();
                        }
                        var7 = -1;
                        class227.field3784[class242.field4029++] = var31;
                        var5 = var26;
                        class138.field2301 = var28;
                        var8 = var26.field4840;
                        class160.field2709 = var27;
                        var10 = var26.field4844;
                        continue;
                    }
                    if (var514 == 42) {
                        class157.field2651[var6++] = class9.field181[var10[var7]];
                        continue;
                    }
                    if (var514 == 43) {
                        int var32 = var10[var7];
                        var6--;
                        class9.field181[var32] = class157.field2651[var6];
                        class319.method2222(var32, true);
                        continue;
                    }
                    if (var514 == 44) {
                        int var33 = var10[var7] >> 16;
                        int var34 = var10[var7] & 0xFFFF;
                        var6--;
                        int var35 = class157.field2651[var6];
                        if (var35 >= 0 && var35 <= 5000) {
                            byte var36 = -1;
                            class295.field4999[var33] = var35;
                            if (var34 == 105) {
                                var36 = 0;
                            }
                            int var37 = 0;
                            while (true) {
                                if (var35 <= var37) {
                                    continue label4261;
                                }
                                class235.field3930[var33][var37] = var36;
                                var37++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var514 == 45) {
                        var6--;
                        int var38 = class157.field2651[var6];
                        int var39 = var10[var7];
                        if (var38 >= 0 && var38 < class295.field4999[var39]) {
                            class157.field2651[var6++] = class235.field3930[var39][var38];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var514 == 46) {
                        var6 -= 2;
                        int var40 = class157.field2651[var6];
                        int var41 = var10[var7];
                        if (var40 >= 0 && var40 < class295.field4999[var41]) {
                            class235.field3930[var41][var40] = class157.field2651[var6 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var514 == 47) {
                        class146 var42 = class191.field3151[var10[var7]];
                        if (var42 == null) {
                            var42 = class128.field2101;
                        }
                        class196.field3270[var9++] = var42;
                        continue;
                    }
                    if (var514 == 48) {
                        int var43 = var10[var7];
                        var9--;
                        class191.field3151[var43] = class196.field3270[var9];
                        class222.method1641(var43, false);
                        continue;
                    }
                    if (var514 == 51) {
                        class118 var44 = var5.field4853[var10[var7]];
                        var6--;
                        class101 var45 = (class101) var44.method810((byte) -117, (long) class157.field2651[var6]);
                        if (var45 != null) {
                            var7 += var45.field1627;
                        }
                        continue;
                    }
                }
                boolean var46;
                if (var10[var7] == 1) {
                    var46 = true;
                } else {
                    var46 = false;
                }
                if (var514 < 300) {
                    if (var514 == 100) {
                        var6 -= 3;
                        int var47 = class157.field2651[var6];
                        int var48 = class157.field2651[var6 + 2];
                        int var49 = class157.field2651[var6 + 1];
                        if (var49 != 0) {
                            class264 var50 = class98.method680(var47, false);
                            if (var50.field4402 == null) {
                                var50.field4402 = new class264[var48 + 1];
                            }
                            if (var50.field4402.length <= var48) {
                                class264[] var51 = new class264[var48 + 1];
                                for (int var52 = 0; var52 < var50.field4402.length; var52++) {
                                    var51[var52] = var50.field4402[var52];
                                }
                                var50.field4402 = var51;
                            }
                            if (var48 > 0 && var50.field4402[var48 - 1] == null) {
                                throw new RuntimeException("Gap at:" + (var48 - 1));
                            }
                            class264 var53 = new class264();
                            var53.field4462 = true;
                            var53.field4536 = var49;
                            var53.field4417 = var48;
                            var53.field4497 = var53.field4461 = var50.field4461;
                            var50.field4402[var48] = var53;
                            if (var46) {
                                class171.field2887 = var53;
                            } else {
                                class301.field5151 = var53;
                            }
                            class164.method1280(false, var50);
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var514 == 101) {
                        class264 var54 = var46 ? class171.field2887 : class301.field5151;
                        if (var54.field4417 == -1) {
                            if (var46) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class264 var55 = class98.method680(var54.field4461, false);
                        var55.field4402[var54.field4417] = null;
                        class164.method1280(false, var55);
                        continue;
                    }
                    if (var514 == 102) {
                        var6--;
                        class264 var56 = class98.method680(class157.field2651[var6], false);
                        var56.field4402 = null;
                        class164.method1280(false, var56);
                        continue;
                    }
                    if (var514 == 200) {
                        var6 -= 2;
                        int var57 = class157.field2651[var6 + 1];
                        int var58 = class157.field2651[var6];
                        class264 var59 = class165.method1289(var58, true, var57);
                        if (var59 != null && var57 != -1) {
                            class157.field2651[var6++] = 1;
                            if (var46) {
                                class171.field2887 = var59;
                            } else {
                                class301.field5151 = var59;
                            }
                            continue;
                        }
                        class157.field2651[var6++] = 0;
                        continue;
                    }
                    if (var514 == 201) {
                        var6--;
                        int var60 = class157.field2651[var6];
                        class264 var61 = class98.method680(var60, false);
                        if (var61 == null) {
                            class157.field2651[var6++] = 0;
                        } else {
                            class157.field2651[var6++] = 1;
                            if (var46) {
                                class171.field2887 = var61;
                            } else {
                                class301.field5151 = var61;
                            }
                        }
                        continue;
                    }
                } else if (var514 < 500) {
                    if (var514 == 403) {
                        var6 -= 2;
                        int var503 = class157.field2651[var6];
                        int var504 = class157.field2651[var6 + 1];
                        if (var503 >= 7) {
                            var503 -= 7;
                        }
                        class102.field1639.field3923.method650((byte) 106, var504, var503);
                        continue;
                    }
                    if (var514 == 404) {
                        var6 -= 2;
                        int var505 = class157.field2651[var6];
                        int var506 = class157.field2651[var6 + 1];
                        class102.field1639.field3923.method655(var506, var505, false);
                        continue;
                    }
                    if (var514 == 410) {
                        var6--;
                        boolean var507 = class157.field2651[var6] != 0;
                        class102.field1639.field3923.method653(var507, -123);
                        continue;
                    }
                } else if (var514 >= 1000 && var514 < 1100 || var514 >= 2000 && var514 < 2100) {
                    class264 var62;
                    if (var514 < 2000) {
                        var62 = var46 ? class171.field2887 : class301.field5151;
                    } else {
                        var514 -= 1000;
                        var6--;
                        var62 = class98.method680(class157.field2651[var6], false);
                    }
                    if (var514 == 1000) {
                        var6 -= 4;
                        var62.field4408 = class157.field2651[var6];
                        var62.field4534 = class157.field2651[var6 + 1];
                        int var63 = class157.field2651[var6 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 5) {
                            var63 = 5;
                        }
                        int var64 = class157.field2651[var6 + 3];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 5) {
                            var64 = 5;
                        }
                        var62.field4425 = (byte) var64;
                        var62.field4455 = (byte) var63;
                        class164.method1280(false, var62);
                        class3.method10(5, var62);
                        if (var62.field4417 == -1) {
                            class100.method689(var62.field4461, (byte) 105);
                        }
                        continue;
                    }
                    if (var514 == 1001) {
                        var6 -= 4;
                        var62.field4445 = class157.field2651[var6];
                        var62.field4523 = class157.field2651[var6 + 1];
                        var62.field4383 = 0;
                        var62.field4541 = 0;
                        int var65 = class157.field2651[var6 + 2];
                        if (var65 < 0) {
                            var65 = 0;
                        } else if (var65 > 4) {
                            var65 = 4;
                        }
                        int var66 = class157.field2651[var6 + 3];
                        var62.field4496 = (byte) var65;
                        if (var66 < 0) {
                            var66 = 0;
                        } else if (var66 > 4) {
                            var66 = 4;
                        }
                        var62.field4463 = (byte) var66;
                        class164.method1280(false, var62);
                        class3.method10(5, var62);
                        if (var62.field4536 == 0) {
                            class183.method1444(25096, false, var62);
                        }
                        continue;
                    }
                    if (var514 == 1003) {
                        var6--;
                        boolean var67 = class157.field2651[var6] == 1;
                        if (var62.field4539 != var67) {
                            var62.field4539 = var67;
                            class164.method1280(false, var62);
                        }
                        if (var62.field4417 == -1) {
                            class241.method1751((byte) -110, var62.field4461);
                        }
                        continue;
                    }
                    if (var514 == 1004) {
                        var6 -= 2;
                        var62.field4400 = class157.field2651[var6];
                        var62.field4549 = class157.field2651[var6 + 1];
                        class164.method1280(false, var62);
                        class3.method10(5, var62);
                        if (var62.field4536 == 0) {
                            class183.method1444(25096, false, var62);
                        }
                        continue;
                    }
                    if (var514 == 1005) {
                        var6--;
                        var62.field4499 = class157.field2651[var6] == 1;
                        continue;
                    }
                } else if (var514 >= 1100 && var514 < 1200 || var514 >= 2100 && var514 < 2200) {
                    class264 var500;
                    if (var514 < 2000) {
                        var500 = var46 ? class171.field2887 : class301.field5151;
                    } else {
                        var6--;
                        var500 = class98.method680(class157.field2651[var6], false);
                        var514 -= 1000;
                    }
                    if (var514 == 1100) {
                        var6 -= 2;
                        var500.field4430 = class157.field2651[var6];
                        if (var500.field4490 - var500.field4393 < var500.field4430) {
                            var500.field4430 = var500.field4490 - var500.field4393;
                        }
                        if (var500.field4430 < 0) {
                            var500.field4430 = 0;
                        }
                        var500.field4377 = class157.field2651[var6 + 1];
                        if (var500.field4377 > (var500.field4513 - var500.field4381)) {
                            var500.field4377 = var500.field4513 - var500.field4381;
                        }
                        if (var500.field4377 < 0) {
                            var500.field4377 = 0;
                        }
                        class164.method1280(false, var500);
                        if (var500.field4417 == -1) {
                            class135.method995(var500.field4461, (byte) -123);
                        }
                        continue;
                    }
                    if (var514 == 1101) {
                        var6--;
                        var500.field4442 = class157.field2651[var6];
                        class164.method1280(false, var500);
                        if (var500.field4417 == -1) {
                            class5.method23(arg1 ^ 0xFFFFFA2C, var500.field4461);
                        }
                        continue;
                    }
                    if (var514 == 1102) {
                        var6--;
                        var500.field4547 = class157.field2651[var6] == 1;
                        class164.method1280(false, var500);
                        continue;
                    }
                    if (var514 == 1103) {
                        var6--;
                        var500.field4483 = class157.field2651[var6];
                        class164.method1280(false, var500);
                        continue;
                    }
                    if (var514 == 1104) {
                        var6--;
                        var500.field4503 = class157.field2651[var6];
                        class164.method1280(false, var500);
                        continue;
                    }
                    if (var514 == 1105) {
                        var6--;
                        var500.field4392 = class157.field2651[var6];
                        class164.method1280(false, var500);
                        continue;
                    }
                    if (var514 == 1106) {
                        var6--;
                        var500.field4405 = class157.field2651[var6];
                        class164.method1280(false, var500);
                        continue;
                    }
                    if (var514 == 1107) {
                        var6--;
                        var500.field4538 = class157.field2651[var6] == 1;
                        class164.method1280(false, var500);
                        continue;
                    }
                    if (var514 == 1108) {
                        var500.field4384 = 1;
                        var6--;
                        var500.field4544 = class157.field2651[var6];
                        class164.method1280(false, var500);
                        if (var500.field4417 == -1) {
                            class83.method587((byte) -106, var500.field4461);
                        }
                        continue;
                    }
                    if (var514 == 1109) {
                        var6 -= 6;
                        var500.field4487 = class157.field2651[var6];
                        var500.field4540 = class157.field2651[var6 + 1];
                        var500.field4410 = class157.field2651[var6 + 2];
                        var500.field4514 = class157.field2651[var6 + 3];
                        var500.field4420 = class157.field2651[var6 + 4];
                        var500.field4403 = class157.field2651[var6 + 5];
                        class164.method1280(false, var500);
                        if (var500.field4417 == -1) {
                            class28.method183(var500.field4461, -24235);
                            class236.method1728((byte) -43, var500.field4461);
                        }
                        continue;
                    }
                    if (var514 == 1110) {
                        var6--;
                        int var501 = class157.field2651[var6];
                        if (var500.field4378 != var501) {
                            var500.field4378 = var501;
                            var500.field4448 = 0;
                            var500.field4474 = 0;
                            class164.method1280(false, var500);
                        }
                        if (var500.field4417 == -1) {
                            class56.method449(var500.field4461, 5);
                        }
                        continue;
                    }
                    if (var514 == 1111) {
                        var6--;
                        var500.field4465 = class157.field2651[var6] == 1;
                        class164.method1280(false, var500);
                        continue;
                    }
                    if (var514 == 1112) {
                        var9--;
                        class146 var502 = class196.field3270[var9];
                        if (!var502.method1100((byte) -108, var500.field4453)) {
                            var500.field4453 = var502;
                            class164.method1280(false, var500);
                        }
                        if (var500.field4417 == -1) {
                            class168.method1298(123, var500.field4461);
                        }
                        continue;
                    }
                    if (var514 == 1113) {
                        var6--;
                        var500.field4532 = class157.field2651[var6];
                        class164.method1280(false, var500);
                        continue;
                    }
                    if (var514 == 1114) {
                        var6 -= 3;
                        var500.field4375 = class157.field2651[var6];
                        var500.field4419 = class157.field2651[var6 + 1];
                        var500.field4421 = class157.field2651[var6 + 2];
                        class164.method1280(false, var500);
                        continue;
                    }
                    if (var514 == 1115) {
                        var6--;
                        var500.field4395 = class157.field2651[var6] == 1;
                        class164.method1280(false, var500);
                        continue;
                    }
                    if (var514 == 1116) {
                        var6--;
                        var500.field4489 = class157.field2651[var6];
                        class164.method1280(false, var500);
                        continue;
                    }
                    if (var514 == 1117) {
                        var6--;
                        var500.field4389 = class157.field2651[var6];
                        class164.method1280(false, var500);
                        continue;
                    }
                    if (var514 == 1118) {
                        var6--;
                        var500.field4468 = class157.field2651[var6] == 1;
                        class164.method1280(false, var500);
                        continue;
                    }
                    if (var514 == 1119) {
                        var6--;
                        var500.field4391 = class157.field2651[var6] == 1;
                        class164.method1280(false, var500);
                        continue;
                    }
                    if (var514 == 1120) {
                        var6 -= 2;
                        var500.field4490 = class157.field2651[var6];
                        var500.field4513 = class157.field2651[var6 + 1];
                        class164.method1280(false, var500);
                        if (var500.field4536 == 0) {
                            class183.method1444(25096, false, var500);
                        }
                        continue;
                    }
                    if (var514 == 1121) {
                        var6 -= 2;
                        var500.field4494 = (short) class157.field2651[var6];
                        var500.field4527 = (short) class157.field2651[var6 + 1];
                        class164.method1280(false, var500);
                        continue;
                    }
                    if (var514 == 1122) {
                        var6--;
                        var500.field4426 = class157.field2651[var6] == 1;
                        class164.method1280(false, var500);
                        continue;
                    }
                    if (var514 == 1123) {
                        var6--;
                        var500.field4403 = class157.field2651[var6];
                        class164.method1280(false, var500);
                        if (var500.field4417 == -1) {
                            class28.method183(var500.field4461, -24235);
                        }
                        continue;
                    }
                } else if (!(var514 < 1200 || var514 >= 1300) || !(var514 < 2200 || var514 >= 2300)) {
                    class264 var496;
                    if (var514 < 2000) {
                        var496 = var46 ? class171.field2887 : class301.field5151;
                    } else {
                        var6--;
                        var496 = class98.method680(class157.field2651[var6], false);
                        var514 -= 1000;
                    }
                    class164.method1280(false, var496);
                    if (var514 == 1200 || var514 == 1205) {
                        var6 -= 2;
                        int var497 = class157.field2651[var6];
                        int var498 = class157.field2651[var6 + 1];
                        if (var496.field4417 == -1) {
                            class7.method45(var496.field4461, (byte) 119);
                            class28.method183(var496.field4461, arg1 - 22822);
                            class236.method1728((byte) -43, var496.field4461);
                        }
                        if (var497 == -1) {
                            var496.field4394 = -1;
                            var496.field4544 = -1;
                            var496.field4384 = 1;
                        } else {
                            var496.field4447 = var498;
                            var496.field4394 = var497;
                            class248 var499 = class84.method589(false, var497);
                            var496.field4403 = var499.field4100;
                            var496.field4487 = var499.field4097;
                            var496.field4420 = var499.field4142;
                            var496.field4514 = var499.field4139;
                            var496.field4540 = var499.field4131;
                            if (var496.field4541 > 0) {
                                var496.field4403 = var496.field4403 * 32 / var496.field4541;
                            } else if (var496.field4445 > 0) {
                                var496.field4403 = var496.field4403 * 32 / var496.field4445;
                            }
                            if (var514 == 1205) {
                                var496.field4529 = false;
                            } else {
                                var496.field4529 = true;
                            }
                            var496.field4410 = var499.field4147;
                        }
                        continue;
                    }
                    if (var514 == 1201) {
                        var496.field4384 = 2;
                        var6--;
                        var496.field4544 = class157.field2651[var6];
                        if (var496.field4417 == -1) {
                            class83.method587((byte) -85, var496.field4461);
                        }
                        continue;
                    }
                    if (var514 == 1202) {
                        var496.field4384 = 3;
                        var496.field4544 = class102.field1639.field3923.method647((byte) 91);
                        if (var496.field4417 == -1) {
                            class83.method587((byte) -123, var496.field4461);
                        }
                        continue;
                    }
                    if (var514 == 1203) {
                        var496.field4384 = 6;
                        var6--;
                        var496.field4544 = class157.field2651[var6];
                        if (var496.field4417 == -1) {
                            class83.method587((byte) -73, var496.field4461);
                        }
                        continue;
                    }
                    if (var514 == 1204) {
                        var496.field4384 = 5;
                        var6--;
                        var496.field4544 = class157.field2651[var6];
                        if (var496.field4417 == -1) {
                            class83.method587((byte) -65, var496.field4461);
                        }
                        continue;
                    }
                } else if ((var514 < 1300 || var514 >= 1400) && (var514 < 2300 || var514 >= 2400)) {
                    if (var514 >= 1400 && var514 < 1500 || var514 >= 2400 && var514 < 2500) {
                        class264 var68;
                        if (var514 >= 2000) {
                            var514 -= 1000;
                            var6--;
                            var68 = class98.method680(class157.field2651[var6], false);
                        } else {
                            var68 = var46 ? class171.field2887 : class301.field5151;
                        }
                        var9--;
                        class146 var69 = class196.field3270[var9];
                        int[] var70 = null;
                        if (var69.method1094((byte) -125) > 0 && var69.method1115(var69.method1094((byte) -26) - 1, (byte) 127) == 89) {
                            var6--;
                            int var71 = class157.field2651[var6];
                            if (var71 > 0) {
                                var70 = new int[var71];
                                while ((var71--) > 0) {
                                    var6--;
                                    var70[var71] = class157.field2651[var6];
                                }
                            }
                            var69 = var69.method1078(0, var69.method1094((byte) -39) - 1, false);
                        }
                        Object[] var72 = new Object[var69.method1094((byte) -15) + 1];
                        for (int var73 = var72.length - 1; var73 >= 1; var73--) {
                            if (var69.method1115(var73 - 1, (byte) 127) == 115) {
                                var9--;
                                var72[var73] = class196.field3270[var9];
                            } else {
                                var6--;
                                var72[var73] = Integer.valueOf(class157.field2651[var6]);
                            }
                        }
                        var6--;
                        int var74 = class157.field2651[var6];
                        if (var74 == -1) {
                            var72 = null;
                        } else {
                            var72[0] = Integer.valueOf(var74);
                        }
                        if (var514 == 1400) {
                            var68.field4511 = var72;
                        } else if (var514 == 1401) {
                            var68.field4467 = var72;
                        } else if (var514 == 1402) {
                            var68.field4418 = var72;
                        } else if (var514 == 1403) {
                            var68.field4502 = var72;
                        } else if (var514 == 1404) {
                            var68.field4495 = var72;
                        } else if (var514 == 1405) {
                            var68.field4550 = var72;
                        } else if (var514 == 1406) {
                            var68.field4473 = var72;
                        } else if (var514 == 1407) {
                            var68.field4422 = var70;
                            var68.field4521 = var72;
                        } else if (var514 == 1408) {
                            var68.field4457 = var72;
                        } else if (var514 == 1409) {
                            var68.field4471 = var72;
                        } else if (var514 == 1410) {
                            var68.field4477 = var72;
                        } else if (var514 == 1411) {
                            var68.field4441 = var72;
                        } else if (var514 == 1412) {
                            var68.field4476 = var72;
                        } else if (var514 == 1414) {
                            var68.field4472 = var72;
                            var68.field4454 = var70;
                        } else if (var514 == 1415) {
                            var68.field4501 = var70;
                            var68.field4480 = var72;
                        } else if (var514 == 1416) {
                            var68.field4433 = var72;
                        } else if (var514 == 1417) {
                            var68.field4543 = var72;
                        } else if (var514 == 1418) {
                            var68.field4507 = var72;
                        } else if (var514 == 1419) {
                            var68.field4449 = var72;
                        } else if (var514 == 1420) {
                            var68.field4439 = var72;
                        } else if (var514 == 1421) {
                            var68.field4432 = var72;
                        } else if (var514 == 1422) {
                            var68.field4413 = var72;
                        } else if (var514 == 1423) {
                            var68.field4491 = var72;
                        } else if (var514 == 1424) {
                            var68.field4390 = var72;
                        } else if (var514 == 1425) {
                            var68.field4517 = var72;
                        } else if (var514 == 1426) {
                            var68.field4452 = var72;
                        } else if (var514 == 1427) {
                            var68.field4412 = var72;
                        } else if (var514 == 1428) {
                            var68.field4440 = var70;
                            var68.field4380 = var72;
                        } else if (var514 == 1429) {
                            var68.field4396 = var70;
                            var68.field4460 = var72;
                        }
                        var68.field4409 = true;
                        continue;
                    }
                    if (var514 < 1600) {
                        class264 var489 = var46 ? class171.field2887 : class301.field5151;
                        if (var514 == 1500) {
                            class157.field2651[var6++] = var489.field4434;
                            continue;
                        }
                        if (var514 == 1501) {
                            class157.field2651[var6++] = var489.field4424;
                            continue;
                        }
                        if (var514 == 1502) {
                            class157.field2651[var6++] = var489.field4393;
                            continue;
                        }
                        if (var514 == 1503) {
                            class157.field2651[var6++] = var489.field4381;
                            continue;
                        }
                        if (var514 == 1504) {
                            class157.field2651[var6++] = var489.field4539 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 1505) {
                            class157.field2651[var6++] = var489.field4497;
                            continue;
                        }
                    } else if (var514 < 1700) {
                        class264 var488 = var46 ? class171.field2887 : class301.field5151;
                        if (var514 == 1600) {
                            class157.field2651[var6++] = var488.field4430;
                            continue;
                        }
                        if (var514 == 1601) {
                            class157.field2651[var6++] = var488.field4377;
                            continue;
                        }
                        if (var514 == 1602) {
                            class196.field3270[var9++] = var488.field4453;
                            continue;
                        }
                        if (var514 == 1603) {
                            class157.field2651[var6++] = var488.field4490;
                            continue;
                        }
                        if (var514 == 1604) {
                            class157.field2651[var6++] = var488.field4513;
                            continue;
                        }
                        if (var514 == 1605) {
                            class157.field2651[var6++] = var488.field4403;
                            continue;
                        }
                        if (var514 == 1606) {
                            class157.field2651[var6++] = var488.field4410;
                            continue;
                        }
                        if (var514 == 1607) {
                            class157.field2651[var6++] = var488.field4420;
                            continue;
                        }
                        if (var514 == 1608) {
                            class157.field2651[var6++] = var488.field4514;
                            continue;
                        }
                        if (var514 == 1609) {
                            class157.field2651[var6++] = var488.field4483;
                            continue;
                        }
                        if (var514 == 1610) {
                            class157.field2651[var6++] = var488.field4487;
                            continue;
                        }
                        if (var514 == 1611) {
                            class157.field2651[var6++] = var488.field4540;
                            continue;
                        }
                        if (var514 == 1612) {
                            class157.field2651[var6++] = var488.field4392;
                            continue;
                        }
                    } else if (var514 < 1800) {
                        class264 var75 = var46 ? class171.field2887 : class301.field5151;
                        if (var514 == 1700) {
                            class157.field2651[var6++] = var75.field4394;
                            continue;
                        }
                        if (var514 == 1701) {
                            if (var75.field4394 == -1) {
                                class157.field2651[var6++] = 0;
                            } else {
                                class157.field2651[var6++] = var75.field4447;
                            }
                            continue;
                        }
                        if (var514 == 1702) {
                            class157.field2651[var6++] = var75.field4417;
                            continue;
                        }
                    } else if (var514 < 1900) {
                        class264 var76 = var46 ? class171.field2887 : class301.field5151;
                        if (var514 == 1800) {
                            class157.field2651[var6++] = class268.method1947(127, client.method1789(var76));
                            continue;
                        }
                        if (var514 == 1801) {
                            var6--;
                            int var77 = class157.field2651[var6];
                            int var515 = var77 - 1;
                            if (var76.field4485 != null && var515 < var76.field4485.length && var76.field4485[var515] != null) {
                                class196.field3270[var9++] = var76.field4485[var515];
                                continue;
                            }
                            class196.field3270[var9++] = class39.field696;
                            continue;
                        }
                        if (var514 == 1802) {
                            if (var76.field4466 == null) {
                                class196.field3270[var9++] = class39.field696;
                            } else {
                                class196.field3270[var9++] = var76.field4466;
                            }
                            continue;
                        }
                    } else if (var514 < 2600) {
                        var6--;
                        class264 var487 = class98.method680(class157.field2651[var6], false);
                        if (var514 == 2500) {
                            class157.field2651[var6++] = var487.field4434;
                            continue;
                        }
                        if (var514 == 2501) {
                            class157.field2651[var6++] = var487.field4424;
                            continue;
                        }
                        if (var514 == 2502) {
                            class157.field2651[var6++] = var487.field4393;
                            continue;
                        }
                        if (var514 == 2503) {
                            class157.field2651[var6++] = var487.field4381;
                            continue;
                        }
                        if (var514 == 2504) {
                            class157.field2651[var6++] = var487.field4539 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 2505) {
                            class157.field2651[var6++] = var487.field4497;
                            continue;
                        }
                    } else if (var514 < 2700) {
                        var6--;
                        class264 var78 = class98.method680(class157.field2651[var6], false);
                        if (var514 == 2600) {
                            class157.field2651[var6++] = var78.field4430;
                            continue;
                        }
                        if (var514 == 2601) {
                            class157.field2651[var6++] = var78.field4377;
                            continue;
                        }
                        if (var514 == 2602) {
                            class196.field3270[var9++] = var78.field4453;
                            continue;
                        }
                        if (var514 == 2603) {
                            class157.field2651[var6++] = var78.field4490;
                            continue;
                        }
                        if (var514 == 2604) {
                            class157.field2651[var6++] = var78.field4513;
                            continue;
                        }
                        if (var514 == 2605) {
                            class157.field2651[var6++] = var78.field4403;
                            continue;
                        }
                        if (var514 == 2606) {
                            class157.field2651[var6++] = var78.field4410;
                            continue;
                        }
                        if (var514 == 2607) {
                            class157.field2651[var6++] = var78.field4420;
                            continue;
                        }
                        if (var514 == 2608) {
                            class157.field2651[var6++] = var78.field4514;
                            continue;
                        }
                        if (var514 == 2609) {
                            class157.field2651[var6++] = var78.field4483;
                            continue;
                        }
                        if (var514 == 2610) {
                            class157.field2651[var6++] = var78.field4487;
                            continue;
                        }
                        if (var514 == 2611) {
                            class157.field2651[var6++] = var78.field4540;
                            continue;
                        }
                        if (var514 == 2612) {
                            class157.field2651[var6++] = var78.field4392;
                            continue;
                        }
                    } else if (var514 < 2800) {
                        if (var514 == 2700) {
                            var6--;
                            class264 var477 = class98.method680(class157.field2651[var6], false);
                            class157.field2651[var6++] = var477.field4394;
                            continue;
                        }
                        if (var514 == 2701) {
                            var6--;
                            class264 var478 = class98.method680(class157.field2651[var6], false);
                            if (var478.field4394 == -1) {
                                class157.field2651[var6++] = 0;
                            } else {
                                class157.field2651[var6++] = var478.field4447;
                            }
                            continue;
                        }
                        if (var514 == 2702) {
                            var6--;
                            int var479 = class157.field2651[var6];
                            class142 var480 = (class142) class135.field2266.method810((byte) -88, (long) var479);
                            if (var480 == null) {
                                class157.field2651[var6++] = 0;
                            } else {
                                class157.field2651[var6++] = 1;
                            }
                            continue;
                        }
                        if (var514 == 2703) {
                            var6--;
                            class264 var481 = class98.method680(class157.field2651[var6], false);
                            if (var481.field4402 == null) {
                                class157.field2651[var6++] = 0;
                                continue;
                            }
                            int var482 = var481.field4402.length;
                            for (int var483 = 0; var483 < var481.field4402.length; var483++) {
                                if (var481.field4402[var483] == null) {
                                    var482 = var483;
                                    break;
                                }
                            }
                            class157.field2651[var6++] = var482;
                            continue;
                        }
                        if (var514 == 2704 || var514 == 2705) {
                            var6 -= 2;
                            int var484 = class157.field2651[var6 + 1];
                            int var485 = class157.field2651[var6];
                            class142 var486 = (class142) class135.field2266.method810((byte) -100, (long) var485);
                            if (var486 != null && var486.field2370 == var484) {
                                class157.field2651[var6++] = 1;
                                continue;
                            }
                            class157.field2651[var6++] = 0;
                            continue;
                        }
                    } else if (var514 < 2900) {
                        var6--;
                        class264 var475 = class98.method680(class157.field2651[var6], false);
                        if (var514 == 2800) {
                            class157.field2651[var6++] = class268.method1947(118, client.method1789(var475));
                            continue;
                        }
                        if (var514 == 2801) {
                            var6--;
                            int var476 = class157.field2651[var6];
                            int var516 = var476 - 1;
                            if (var475.field4485 != null && var475.field4485.length > var516 && var475.field4485[var516] != null) {
                                class196.field3270[var9++] = var475.field4485[var516];
                                continue;
                            }
                            class196.field3270[var9++] = class39.field696;
                            continue;
                        }
                        if (var514 == 2802) {
                            if (var475.field4466 == null) {
                                class196.field3270[var9++] = class39.field696;
                            } else {
                                class196.field3270[var9++] = var475.field4466;
                            }
                            continue;
                        }
                    } else if (var514 < 3200) {
                        if (var514 == 3100) {
                            var9--;
                            class146 var79 = class196.field3270[var9];
                            class316.method2209(false, var79, 0, class39.field696);
                            continue;
                        }
                        if (var514 == 3101) {
                            var6 -= 2;
                            class13.method76(class157.field2651[var6], (byte) 120, class157.field2651[var6 + 1], class102.field1639);
                            continue;
                        }
                        if (var514 == 3103) {
                            class52.method425((byte) 101);
                            continue;
                        }
                        if (var514 == 3104) {
                            class22.field407++;
                            var9--;
                            class146 var80 = class196.field3270[var9];
                            int var81 = 0;
                            if (var80.method1119((byte) -118)) {
                                var81 = var80.method1092(true);
                            }
                            class47.field820.method1656(127, 16);
                            class47.field820.method387(var81, 103);
                            continue;
                        }
                        if (var514 == 3105) {
                            class226.field3773++;
                            var9--;
                            class146 var82 = class196.field3270[var9];
                            class47.field820.method1656(142, 16);
                            class47.field820.method359(var82.method1123(-13726), arg1 + 1541);
                            continue;
                        }
                        if (var514 == 3106) {
                            var9--;
                            class146 var83 = class196.field3270[var9];
                            class47.field820.method1656(182, 16);
                            class47.field820.method332(var83.method1094((byte) -40) + 1, 77);
                            class166.field2812++;
                            class47.field820.method339(-110, var83);
                            continue;
                        }
                        if (var514 == 3107) {
                            var6--;
                            int var84 = class157.field2651[var6];
                            var9--;
                            class146 var85 = class196.field3270[var9];
                            class82.method583(var85, var84, -1);
                            continue;
                        }
                        if (var514 == 3108) {
                            var6 -= 3;
                            int var86 = class157.field2651[var6 + 1];
                            int var87 = class157.field2651[var6 + 2];
                            int var88 = class157.field2651[var6];
                            class264 var89 = class98.method680(var87, false);
                            class80.method576(0, var88, var89, var86);
                            continue;
                        }
                        if (var514 == 3109) {
                            var6 -= 2;
                            int var90 = class157.field2651[var6 + 1];
                            int var91 = class157.field2651[var6];
                            class264 var92 = var46 ? class171.field2887 : class301.field5151;
                            class80.method576(0, var91, var92, var90);
                            continue;
                        }
                        if (var514 == 3110) {
                            var6--;
                            int var93 = class157.field2651[var6];
                            class47.field820.method1656(195, 16);
                            class78.field1249++;
                            class47.field820.method361(var93, 1635554120);
                            continue;
                        }
                    } else if (var514 < 3300) {
                        if (var514 == 3200) {
                            var6 -= 3;
                            class84.method591(class157.field2651[var6], class157.field2651[var6 + 2], class157.field2651[var6 + 1], 0);
                            continue;
                        }
                        if (var514 == 3201) {
                            var6--;
                            class64.method492(class157.field2651[var6], arg1 ^ 0xFFFFFA26);
                            continue;
                        }
                        if (var514 == 3202) {
                            var6 -= 2;
                            class152.method1202(arg1 ^ 0xFFFFD2C6, class157.field2651[var6], class157.field2651[var6 + 1]);
                            continue;
                        }
                    } else if (var514 < 3400) {
                        if (var514 == 3300) {
                            class157.field2651[var6++] = class203.field3385;
                            continue;
                        }
                        if (var514 == 3301) {
                            var6 -= 2;
                            int var441 = class157.field2651[var6];
                            int var442 = class157.field2651[var6 + 1];
                            class157.field2651[var6++] = class258.method1873(var441, -1, var442);
                            continue;
                        }
                        if (var514 == 3302) {
                            var6 -= 2;
                            int var443 = class157.field2651[var6];
                            int var444 = class157.field2651[var6 + 1];
                            class157.field2651[var6++] = class146.method1079(var443, arg1 + 1505, var444);
                            continue;
                        }
                        if (var514 == 3303) {
                            var6 -= 2;
                            int var445 = class157.field2651[var6];
                            int var446 = class157.field2651[var6 + 1];
                            class157.field2651[var6++] = class122.method845(false, var446, var445);
                            continue;
                        }
                        if (var514 == 3304) {
                            var6--;
                            int var447 = class157.field2651[var6];
                            class157.field2651[var6++] = class192.method1486(var447, (byte) 67).field769;
                            continue;
                        }
                        if (var514 == 3305) {
                            var6--;
                            int var448 = class157.field2651[var6];
                            class157.field2651[var6++] = class32.field615[var448];
                            continue;
                        }
                        if (var514 == 3306) {
                            var6--;
                            int var449 = class157.field2651[var6];
                            class157.field2651[var6++] = class211.field3491[var449];
                            continue;
                        }
                        if (var514 == 3307) {
                            var6--;
                            int var450 = class157.field2651[var6];
                            class157.field2651[var6++] = class183.field3060[var450];
                            continue;
                        }
                        if (var514 == 3308) {
                            int var451 = class203.field3387;
                            int var452 = (class102.field1639.field5409 >> 7) + class15.field300;
                            int var453 = (class102.field1639.field5380 >> 7) + class201.field3357;
                            class157.field2651[var6++] = (var451 << 28) + (var452 << 14) + var453;
                            continue;
                        }
                        if (var514 == 3309) {
                            var6--;
                            int var454 = class157.field2651[var6];
                            class157.field2651[var6++] = class82.method582(var454, 268435191) >> 14;
                            continue;
                        }
                        if (var514 == 3310) {
                            var6--;
                            int var455 = class157.field2651[var6];
                            class157.field2651[var6++] = var455 >> 28;
                            continue;
                        }
                        if (var514 == 3311) {
                            var6--;
                            int var456 = class157.field2651[var6];
                            class157.field2651[var6++] = class82.method582(var456, 16383);
                            continue;
                        }
                        if (var514 == 3312) {
                            class157.field2651[var6++] = class202.field3366 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3313) {
                            var6 -= 2;
                            int var457 = class157.field2651[var6 + 1];
                            int var458 = class157.field2651[var6] + 32768;
                            class157.field2651[var6++] = class258.method1873(var458, -1, var457);
                            continue;
                        }
                        if (var514 == 3314) {
                            var6 -= 2;
                            int var459 = class157.field2651[var6] + 32768;
                            int var460 = class157.field2651[var6 + 1];
                            class157.field2651[var6++] = class146.method1079(var459, -108, var460);
                            continue;
                        }
                        if (var514 == 3315) {
                            var6 -= 2;
                            int var461 = class157.field2651[var6] + 32768;
                            int var462 = class157.field2651[var6 + 1];
                            class157.field2651[var6++] = class122.method845(false, var462, var461);
                            continue;
                        }
                        if (var514 == 3316) {
                            if (class191.field3164 < 2) {
                                class157.field2651[var6++] = 0;
                            } else {
                                class157.field2651[var6++] = class191.field3164;
                            }
                            continue;
                        }
                        if (var514 == 3317) {
                            class157.field2651[var6++] = class57.field1012;
                            continue;
                        }
                        if (var514 == 3318) {
                            class157.field2651[var6++] = class72.field1178;
                            continue;
                        }
                        if (var514 == 3321) {
                            class157.field2651[var6++] = class128.field2086;
                            continue;
                        }
                        if (var514 == 3322) {
                            class157.field2651[var6++] = class18.field362;
                            continue;
                        }
                        if (var514 == 3323) {
                            if (class14.field259 >= 5 && class14.field259 <= 9) {
                                class157.field2651[var6++] = 1;
                                continue;
                            }
                            class157.field2651[var6++] = 0;
                            continue;
                        }
                        if (var514 == 3324) {
                            if (class14.field259 >= 5 && class14.field259 <= 9) {
                                class157.field2651[var6++] = class14.field259;
                                continue;
                            }
                            class157.field2651[var6++] = 0;
                            continue;
                        }
                        if (var514 == 3325) {
                            class157.field2651[var6++] = class248.field4119 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3326) {
                            class157.field2651[var6++] = class102.field1639.field3900;
                            continue;
                        }
                        if (var514 == 3327) {
                            class157.field2651[var6++] = class102.field1639.field3923.field1526 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3328) {
                            class157.field2651[var6++] = class157.field2653 && !class158.field2675 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3329) {
                            class157.field2651[var6++] = class287.field4925 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3330) {
                            var6--;
                            int var463 = class157.field2651[var6];
                            class157.field2651[var6++] = class261.method1888((byte) 65, var463);
                            continue;
                        }
                        if (var514 == 3331) {
                            var6 -= 2;
                            int var464 = class157.field2651[var6 + 1];
                            int var465 = class157.field2651[var6];
                            class157.field2651[var6++] = class128.method873(false, var464, var465, 0);
                            continue;
                        }
                        if (var514 == 3332) {
                            var6 -= 2;
                            int var466 = class157.field2651[var6];
                            int var467 = class157.field2651[var6 + 1];
                            class157.field2651[var6++] = class128.method873(true, var467, var466, 0);
                            continue;
                        }
                        if (var514 == 3333) {
                            class157.field2651[var6++] = class39.field694;
                            continue;
                        }
                        if (var514 == 3335) {
                            class157.field2651[var6++] = class14.field263;
                            continue;
                        }
                        if (var514 == 3336) {
                            var6 -= 4;
                            int var468 = class157.field2651[var6];
                            int var469 = class157.field2651[var6 + 3];
                            int var470 = class157.field2651[var6 + 2];
                            int var471 = class157.field2651[var6 + 1];
                            int var472 = (var471 << 14) + var468;
                            int var473 = (var470 << 28) + var472;
                            int var474 = var469 + var473;
                            class157.field2651[var6++] = var474;
                            continue;
                        }
                        if (var514 == 3337) {
                            class157.field2651[var6++] = class92.field1468;
                            continue;
                        }
                    } else if (var514 < 3500) {
                        if (var514 == 3400) {
                            var6 -= 2;
                            int var94 = class157.field2651[var6 + 1];
                            int var95 = class157.field2651[var6];
                            class169 var96 = class263.method1900(var95, (byte) -68);
                            if (var96.field2856 == 115) {
                            }
                            class196.field3270[var9++] = var96.method1304((byte) -96, var94);
                            continue;
                        }
                        if (var514 == 3408) {
                            var6 -= 4;
                            int var97 = class157.field2651[var6 + 1];
                            int var98 = class157.field2651[var6];
                            int var99 = class157.field2651[var6 + 2];
                            int var100 = class157.field2651[var6 + 3];
                            class169 var101 = class263.method1900(var99, (byte) -68);
                            if (var101.field2866 == var98 && var101.field2856 == var97) {
                                if (var97 == 115) {
                                    class196.field3270[var9++] = var101.method1304((byte) -96, var100);
                                } else {
                                    class157.field2651[var6++] = var101.method1308(90, var100);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var514 == 3409) {
                            var6 -= 3;
                            int var102 = class157.field2651[var6];
                            int var103 = class157.field2651[var6 + 2];
                            int var104 = class157.field2651[var6 + 1];
                            if (var104 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class169 var105 = class263.method1900(var104, (byte) -68);
                            if (var105.field2856 != var102) {
                                throw new RuntimeException("C3409-1");
                            }
                            class157.field2651[var6++] = var105.method1303(var103, class35.method255(arg1, -1414)) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3410) {
                            var9--;
                            class146 var106 = class196.field3270[var9];
                            var6--;
                            int var107 = class157.field2651[var6];
                            if (var107 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class169 var108 = class263.method1900(var107, (byte) -68);
                            if (var108.field2856 != 115) {
                                throw new RuntimeException("C3410-1");
                            }
                            class157.field2651[var6++] = var108.method1310((byte) -97, var106) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3411) {
                            var6--;
                            int var109 = class157.field2651[var6];
                            class169 var110 = class263.method1900(var109, (byte) -68);
                            class157.field2651[var6++] = var110.field2849.method802(0);
                            continue;
                        }
                    } else if (var514 < 3700) {
                        if (var514 == 3600) {
                            if (class99.field1601 == 0) {
                                class157.field2651[var6++] = -2;
                            } else if (class99.field1601 == 1) {
                                class157.field2651[var6++] = -1;
                            } else {
                                class157.field2651[var6++] = class226.field3772;
                            }
                            continue;
                        }
                        if (var514 == 3601) {
                            var6--;
                            int var111 = class157.field2651[var6];
                            if (class99.field1601 == 2 && class226.field3772 > var111) {
                                class196.field3270[var9++] = class303.field5198[var111];
                                continue;
                            }
                            class196.field3270[var9++] = class39.field696;
                            continue;
                        }
                        if (var514 == 3602) {
                            var6--;
                            int var112 = class157.field2651[var6];
                            if (class99.field1601 == 2 && class226.field3772 > var112) {
                                class157.field2651[var6++] = class137.field2282[var112];
                                continue;
                            }
                            class157.field2651[var6++] = 0;
                            continue;
                        }
                        if (var514 == 3603) {
                            var6--;
                            int var113 = class157.field2651[var6];
                            if (class99.field1601 == 2 && var113 < class226.field3772) {
                                class157.field2651[var6++] = class168.field2842[var113];
                                continue;
                            }
                            class157.field2651[var6++] = 0;
                            continue;
                        }
                        if (var514 == 3604) {
                            var9--;
                            class146 var114 = class196.field3270[var9];
                            var6--;
                            int var115 = class157.field2651[var6];
                            class313.method2195(var115, var114, 3);
                            continue;
                        }
                        if (var514 == 3605) {
                            var9--;
                            class146 var116 = class196.field3270[var9];
                            class267.method1942(var116.method1123(-13726), (byte) 96);
                            continue;
                        }
                        if (var514 == 3606) {
                            var9--;
                            class146 var117 = class196.field3270[var9];
                            class60.method463((byte) -126, var117.method1123(-13726));
                            continue;
                        }
                        if (var514 == 3607) {
                            var9--;
                            class146 var118 = class196.field3270[var9];
                            class120.method838(-1249, var118.method1123(-13726));
                            continue;
                        }
                        if (var514 == 3608) {
                            var9--;
                            class146 var119 = class196.field3270[var9];
                            class171.method1323((byte) -62, var119.method1123(-13726));
                            continue;
                        }
                        if (var514 == 3609) {
                            var9--;
                            class146 var120 = class196.field3270[var9];
                            if (var120.method1080((byte) -43, class262.field4361) || var120.method1080((byte) -100, class184.field3072)) {
                                var120 = var120.method1111(124, 7);
                            }
                            class157.field2651[var6++] = class51.method414((byte) 111, var120) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3610) {
                            var6--;
                            int var121 = class157.field2651[var6];
                            if (class99.field1601 == 2 && class226.field3772 > var121) {
                                class196.field3270[var9++] = class36.field666[var121];
                                continue;
                            }
                            class196.field3270[var9++] = class39.field696;
                            continue;
                        }
                        if (var514 == 3611) {
                            if (class312.field5321 == null) {
                                class196.field3270[var9++] = class39.field696;
                            } else {
                                class196.field3270[var9++] = class312.field5321.method1104((byte) -107);
                            }
                            continue;
                        }
                        if (var514 == 3612) {
                            if (class312.field5321 == null) {
                                class157.field2651[var6++] = 0;
                            } else {
                                class157.field2651[var6++] = class146.field2481;
                            }
                            continue;
                        }
                        if (var514 == 3613) {
                            var6--;
                            int var122 = class157.field2651[var6];
                            if (class312.field5321 != null && class146.field2481 > var122) {
                                class196.field3270[var9++] = class258.field4283[var122].field3494.method1104((byte) -17);
                                continue;
                            }
                            class196.field3270[var9++] = class39.field696;
                            continue;
                        }
                        if (var514 == 3614) {
                            var6--;
                            int var123 = class157.field2651[var6];
                            if (class312.field5321 != null && class146.field2481 > var123) {
                                class157.field2651[var6++] = class258.field4283[var123].field3497;
                                continue;
                            }
                            class157.field2651[var6++] = 0;
                            continue;
                        }
                        if (var514 == 3615) {
                            var6--;
                            int var124 = class157.field2651[var6];
                            if (class312.field5321 != null && var124 < class146.field2481) {
                                class157.field2651[var6++] = class258.field4283[var124].field3495;
                                continue;
                            }
                            class157.field2651[var6++] = 0;
                            continue;
                        }
                        if (var514 == 3616) {
                            class157.field2651[var6++] = class310.field5280;
                            continue;
                        }
                        if (var514 == 3617) {
                            var9--;
                            class146 var125 = class196.field3270[var9];
                            class102.method698((byte) 82, var125);
                            continue;
                        }
                        if (var514 == 3618) {
                            class157.field2651[var6++] = class288.field4943;
                            continue;
                        }
                        if (var514 == 3619) {
                            var9--;
                            class146 var126 = class196.field3270[var9];
                            class52.method420(var126.method1123(-13726), 20366);
                            continue;
                        }
                        if (var514 == 3620) {
                            class192.method1477(arg1 ^ 0xFFFFFA0A);
                            continue;
                        }
                        if (var514 == 3621) {
                            if (class99.field1601 == 0) {
                                class157.field2651[var6++] = -1;
                            } else {
                                class157.field2651[var6++] = class102.field1653;
                            }
                            continue;
                        }
                        if (var514 == 3622) {
                            var6--;
                            int var127 = class157.field2651[var6];
                            if (class99.field1601 != 0 && class102.field1653 > var127) {
                                class196.field3270[var9++] = class267.method1938(arg1 + 1538, class106.field1715[var127]).method1104((byte) -56);
                                continue;
                            }
                            class196.field3270[var9++] = class39.field696;
                            continue;
                        }
                        if (var514 == 3623) {
                            var9--;
                            class146 var128 = class196.field3270[var9];
                            if (var128.method1080((byte) -117, class262.field4361) || var128.method1080((byte) -53, class184.field3072)) {
                                var128 = var128.method1111(arg1 + 1539, 7);
                            }
                            class157.field2651[var6++] = class140.method1024(39, var128) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3624) {
                            var6--;
                            int var129 = class157.field2651[var6];
                            if (class258.field4283 != null && class146.field2481 > var129 && class258.field4283[var129].field3494.method1106(class102.field1639.field3891, 82)) {
                                class157.field2651[var6++] = 1;
                                continue;
                            }
                            class157.field2651[var6++] = 0;
                            continue;
                        }
                        if (var514 == 3625) {
                            if (class198.field3294 == null) {
                                class196.field3270[var9++] = class39.field696;
                            } else {
                                class196.field3270[var9++] = class198.field3294.method1104((byte) -85);
                            }
                            continue;
                        }
                        if (var514 == 3626) {
                            var6--;
                            int var130 = class157.field2651[var6];
                            if (class312.field5321 != null && class146.field2481 > var130) {
                                class196.field3270[var9++] = class258.field4283[var130].field3489;
                                continue;
                            }
                            class196.field3270[var9++] = class39.field696;
                            continue;
                        }
                        if (var514 == 3627) {
                            var6--;
                            int var131 = class157.field2651[var6];
                            if (class99.field1601 == 2 && var131 >= 0 && class226.field3772 > var131) {
                                class157.field2651[var6++] = class217.field3574[var131] ? 1 : 0;
                                continue;
                            }
                            class157.field2651[var6++] = 0;
                            continue;
                        }
                        if (var514 == 3628) {
                            var9--;
                            class146 var132 = class196.field3270[var9];
                            if (var132.method1080((byte) -60, class262.field4361) || var132.method1080((byte) -112, class184.field3072)) {
                                var132 = var132.method1111(-47, 7);
                            }
                            class157.field2651[var6++] = class80.method574(class35.method255(arg1, -1413), var132);
                            continue;
                        }
                        if (var514 == 3629) {
                            class157.field2651[var6++] = class203.field3378;
                            continue;
                        }
                    } else if (var514 < 4000) {
                        if (var514 == 3903) {
                            var6--;
                            int var427 = class157.field2651[var6];
                            class157.field2651[var6++] = class135.field2259[var427].method2078(-123);
                            continue;
                        }
                        if (var514 == 3904) {
                            var6--;
                            int var428 = class157.field2651[var6];
                            class157.field2651[var6++] = class135.field2259[var428].field4944;
                            continue;
                        }
                        if (var514 == 3905) {
                            var6--;
                            int var429 = class157.field2651[var6];
                            class157.field2651[var6++] = class135.field2259[var429].field4939;
                            continue;
                        }
                        if (var514 == 3906) {
                            var6--;
                            int var430 = class157.field2651[var6];
                            class157.field2651[var6++] = class135.field2259[var430].field4942;
                            continue;
                        }
                        if (var514 == 3907) {
                            var6--;
                            int var431 = class157.field2651[var6];
                            class157.field2651[var6++] = class135.field2259[var431].field4940;
                            continue;
                        }
                        if (var514 == 3908) {
                            var6--;
                            int var432 = class157.field2651[var6];
                            class157.field2651[var6++] = class135.field2259[var432].field4941;
                            continue;
                        }
                        if (var514 == 3910) {
                            var6--;
                            int var433 = class157.field2651[var6];
                            int var434 = class135.field2259[var433].method2074(true);
                            class157.field2651[var6++] = var434 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3911) {
                            var6--;
                            int var435 = class157.field2651[var6];
                            int var436 = class135.field2259[var435].method2074(true);
                            class157.field2651[var6++] = var436 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3912) {
                            var6--;
                            int var437 = class157.field2651[var6];
                            int var438 = class135.field2259[var437].method2074(true);
                            class157.field2651[var6++] = var438 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 3913) {
                            var6--;
                            int var439 = class157.field2651[var6];
                            int var440 = class135.field2259[var439].method2074(true);
                            class157.field2651[var6++] = var440 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var514 < 4100) {
                        if (var514 == 4000) {
                            var6 -= 2;
                            int var133 = class157.field2651[var6 + 1];
                            int var134 = class157.field2651[var6];
                            class157.field2651[var6++] = var133 + var134;
                            continue;
                        }
                        if (var514 == 4001) {
                            var6 -= 2;
                            int var135 = class157.field2651[var6];
                            int var136 = class157.field2651[var6 + 1];
                            class157.field2651[var6++] = var135 - var136;
                            continue;
                        }
                        if (var514 == 4002) {
                            var6 -= 2;
                            int var137 = class157.field2651[var6];
                            int var138 = class157.field2651[var6 + 1];
                            class157.field2651[var6++] = var137 * var138;
                            continue;
                        }
                        if (var514 == 4003) {
                            var6 -= 2;
                            int var139 = class157.field2651[var6];
                            int var140 = class157.field2651[var6 + 1];
                            class157.field2651[var6++] = var139 / var140;
                            continue;
                        }
                        if (var514 == 4004) {
                            var6--;
                            int var141 = class157.field2651[var6];
                            class157.field2651[var6++] = (int) (Math.random() * (double) var141);
                            continue;
                        }
                        if (var514 == 4005) {
                            var6--;
                            int var142 = class157.field2651[var6];
                            class157.field2651[var6++] = (int) (Math.random() * (double) (var142 + 1));
                            continue;
                        }
                        if (var514 == 4006) {
                            var6 -= 5;
                            int var143 = class157.field2651[var6];
                            int var144 = class157.field2651[var6 + 2];
                            int var145 = class157.field2651[var6 + 1];
                            int var146 = class157.field2651[var6 + 3];
                            int var147 = class157.field2651[var6 + 4];
                            class157.field2651[var6++] = var143 + ((var145 - var143) * (var147 - var144) / (var146 - var144));
                            continue;
                        }
                        if (var514 == 4007) {
                            var6 -= 2;
                            long var148 = (long) class157.field2651[var6];
                            long var150 = (long) class157.field2651[var6 + 1];
                            class157.field2651[var6++] = (int) (var148 + (var148 * var150 / 100L));
                            continue;
                        }
                        if (var514 == 4008) {
                            var6 -= 2;
                            int var152 = class157.field2651[var6 + 1];
                            int var153 = class157.field2651[var6];
                            class157.field2651[var6++] = class138.method1013(var153, 0x1 << var152);
                            continue;
                        }
                        if (var514 == 4009) {
                            var6 -= 2;
                            int var154 = class157.field2651[var6 + 1];
                            int var155 = class157.field2651[var6];
                            class157.field2651[var6++] = class82.method582(var155, -(0x1 << var154) - 1);
                            continue;
                        }
                        if (var514 == 4010) {
                            var6 -= 2;
                            int var156 = class157.field2651[var6];
                            int var157 = class157.field2651[var6 + 1];
                            class157.field2651[var6++] = class82.method582(var156, 0x1 << var157) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var514 == 4011) {
                            var6 -= 2;
                            int var158 = class157.field2651[var6];
                            int var159 = class157.field2651[var6 + 1];
                            class157.field2651[var6++] = var158 % var159;
                            continue;
                        }
                        if (var514 == 4012) {
                            var6 -= 2;
                            int var160 = class157.field2651[var6];
                            int var161 = class157.field2651[var6 + 1];
                            if (var160 == 0) {
                                class157.field2651[var6++] = 0;
                            } else {
                                class157.field2651[var6++] = (int) Math.pow((double) var160, (double) var161);
                            }
                            continue;
                        }
                        if (var514 == 4013) {
                            var6 -= 2;
                            int var162 = class157.field2651[var6 + 1];
                            int var163 = class157.field2651[var6];
                            if (var163 == 0) {
                                class157.field2651[var6++] = 0;
                            } else if (var162 == 0) {
                                class157.field2651[var6++] = Integer.MAX_VALUE;
                            } else {
                                class157.field2651[var6++] = (int) Math.pow((double) var163, 1.0D / (double) var162);
                            }
                            continue;
                        }
                        if (var514 == 4014) {
                            var6 -= 2;
                            int var164 = class157.field2651[var6 + 1];
                            int var165 = class157.field2651[var6];
                            class157.field2651[var6++] = class82.method582(var164, var165);
                            continue;
                        }
                        if (var514 == 4015) {
                            var6 -= 2;
                            int var166 = class157.field2651[var6];
                            int var167 = class157.field2651[var6 + 1];
                            class157.field2651[var6++] = class138.method1013(var166, var167);
                            continue;
                        }
                        if (var514 == 4016) {
                            var6 -= 2;
                            int var168 = class157.field2651[var6];
                            int var169 = class157.field2651[var6 + 1];
                            class157.field2651[var6++] = var169 <= var168 ? var169 : var168;
                            continue;
                        }
                        if (var514 == 4017) {
                            var6 -= 2;
                            int var170 = class157.field2651[var6 + 1];
                            int var171 = class157.field2651[var6];
                            class157.field2651[var6++] = var171 > var170 ? var171 : var170;
                            continue;
                        }
                        if (var514 == 4018) {
                            var6 -= 3;
                            long var172 = (long) class157.field2651[var6];
                            long var174 = (long) class157.field2651[var6 + 1];
                            long var176 = (long) class157.field2651[var6 + 2];
                            class157.field2651[var6++] = (int) (var172 * var176 / var174);
                            continue;
                        }
                    } else if (var514 < 4200) {
                        if (var514 == 4100) {
                            var6--;
                            int var178 = class157.field2651[var6];
                            var9--;
                            class146 var179 = class196.field3270[var9];
                            class196.field3270[var9++] = class112.method758(-13, new class146[] { var179, class82.method585(14744, var178) });
                            continue;
                        }
                        if (var514 == 4101) {
                            var9 -= 2;
                            class146 var180 = class196.field3270[var9];
                            class146 var181 = class196.field3270[var9 + 1];
                            class196.field3270[var9++] = class112.method758(-100, new class146[] { var180, var181 });
                            continue;
                        }
                        if (var514 == 4102) {
                            var6--;
                            int var182 = class157.field2651[var6];
                            var9--;
                            class146 var183 = class196.field3270[var9];
                            class196.field3270[var9++] = class112.method758(127, new class146[] { var183, class318.method2219(true, -28746, var182) });
                            continue;
                        }
                        if (var514 == 4103) {
                            var9--;
                            class146 var184 = class196.field3270[var9];
                            class196.field3270[var9++] = var184.method1108(true);
                            continue;
                        }
                        if (var514 == 4104) {
                            var6--;
                            int var185 = class157.field2651[var6];
                            long var186 = ((long) var185 + 11745L) * 86400000L;
                            class11.field226.setTime(new Date(var186));
                            int var188 = class11.field226.get(5);
                            int var189 = class11.field226.get(2);
                            int var190 = class11.field226.get(1);
                            class196.field3270[var9++] = class112.method758(-85, new class146[] { class82.method585(14744, var188), class224.field3737, class230.field3852[var189], class224.field3737, class82.method585(14744, var190) });
                            continue;
                        }
                        if (var514 == 4105) {
                            var9 -= 2;
                            class146 var191 = class196.field3270[var9];
                            class146 var192 = class196.field3270[var9 + 1];
                            if (class102.field1639.field3923 != null && class102.field1639.field3923.field1526) {
                                class196.field3270[var9++] = var192;
                                continue;
                            }
                            class196.field3270[var9++] = var191;
                            continue;
                        }
                        if (var514 == 4106) {
                            var6--;
                            int var193 = class157.field2651[var6];
                            class196.field3270[var9++] = class82.method585(14744, var193);
                            continue;
                        }
                        if (var514 == 4107) {
                            var9 -= 2;
                            class157.field2651[var6++] = class196.field3270[var9].method1083(class196.field3270[var9 + 1], 108);
                            continue;
                        }
                        if (var514 == 4108) {
                            var6 -= 2;
                            var9--;
                            class146 var194 = class196.field3270[var9];
                            int var195 = class157.field2651[var6];
                            int var196 = class157.field2651[var6 + 1];
                            class157.field2651[var6++] = class319.method2227(var196, 61).method202(var194, var195);
                            continue;
                        }
                        if (var514 == 4109) {
                            var6 -= 2;
                            var9--;
                            class146 var197 = class196.field3270[var9];
                            int var198 = class157.field2651[var6];
                            int var199 = class157.field2651[var6 + 1];
                            class157.field2651[var6++] = class319.method2227(var199, -122).method213(var197, var198);
                            continue;
                        }
                        if (var514 == 4110) {
                            var9 -= 2;
                            class146 var200 = class196.field3270[var9];
                            class146 var201 = class196.field3270[var9 + 1];
                            var6--;
                            if (class157.field2651[var6] == 1) {
                                class196.field3270[var9++] = var200;
                            } else {
                                class196.field3270[var9++] = var201;
                            }
                            continue;
                        }
                        if (var514 == 4111) {
                            var9--;
                            class146 var202 = class196.field3270[var9];
                            class196.field3270[var9++] = class30.method211(var202);
                            continue;
                        }
                        if (var514 == 4112) {
                            var9--;
                            class146 var203 = class196.field3270[var9];
                            var6--;
                            int var204 = class157.field2651[var6];
                            if (var204 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class196.field3270[var9++] = var203.method1103((byte) -116, var204);
                            continue;
                        }
                        if (var514 == 4113) {
                            var6--;
                            int var205 = class157.field2651[var6];
                            class157.field2651[var6++] = class47.method344(true, var205) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 4114) {
                            var6--;
                            int var206 = class157.field2651[var6];
                            class157.field2651[var6++] = class101.method694(false, var206) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 4115) {
                            var6--;
                            int var207 = class157.field2651[var6];
                            class157.field2651[var6++] = client.method1790(var207, (byte) 86) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 4116) {
                            var6--;
                            int var208 = class157.field2651[var6];
                            class157.field2651[var6++] = class227.method1677(var208, (byte) 124) ? 1 : 0;
                            continue;
                        }
                        if (var514 == 4117) {
                            var9--;
                            class146 var209 = class196.field3270[var9];
                            if (var209 == null) {
                                class157.field2651[var6++] = 0;
                            } else {
                                class157.field2651[var6++] = var209.method1094((byte) -77);
                            }
                            continue;
                        }
                        if (var514 == 4118) {
                            var6 -= 2;
                            var9--;
                            class146 var210 = class196.field3270[var9];
                            int var211 = class157.field2651[var6];
                            int var212 = class157.field2651[var6 + 1];
                            class196.field3270[var9++] = var210.method1078(var211, var212, false);
                            continue;
                        }
                        if (var514 == 4119) {
                            boolean var213 = false;
                            var9--;
                            class146 var214 = class196.field3270[var9];
                            class146 var215 = class114.method776(121, var214.method1094((byte) -111));
                            for (int var216 = 0; var216 < var214.method1094((byte) -113); var216++) {
                                int var217 = var214.method1115(var216, (byte) 127);
                                if (var217 == 60) {
                                    var213 = true;
                                } else if (var217 == 62) {
                                    var213 = false;
                                } else if (!var213) {
                                    var215.method1095(25430, var217);
                                }
                            }
                            var215.method1098(15651);
                            class196.field3270[var9++] = var215;
                            continue;
                        }
                        if (var514 == 4120) {
                            var6 -= 2;
                            int var218 = class157.field2651[var6 + 1];
                            int var219 = class157.field2651[var6];
                            var9--;
                            class146 var220 = class196.field3270[var9];
                            class157.field2651[var6++] = var220.method1117(var218, var219, (byte) -39);
                            continue;
                        }
                        if (var514 == 4121) {
                            var9 -= 2;
                            class146 var221 = class196.field3270[var9 + 1];
                            class146 var222 = class196.field3270[var9];
                            var6--;
                            int var223 = class157.field2651[var6];
                            class157.field2651[var6++] = var222.method1085(7053, var221, var223);
                            continue;
                        }
                        if (var514 == 4122) {
                            var6--;
                            int var224 = class157.field2651[var6];
                            class157.field2651[var6++] = class80.method571(var224, 156);
                            continue;
                        }
                        if (var514 == 4123) {
                            var6--;
                            int var225 = class157.field2651[var6];
                            class157.field2651[var6++] = class266.method1933((byte) 59, var225);
                            continue;
                        }
                        if (var514 == 4124) {
                            var6--;
                            boolean var226 = class157.field2651[var6] != 0;
                            var6--;
                            int var227 = class157.field2651[var6];
                            class196.field3270[var9++] = class157.method1229(0, class14.field263, (byte) -123, var226, (long) var227);
                            continue;
                        }
                    } else if (var514 < 4300) {
                        if (var514 == 4200) {
                            var6--;
                            int var228 = class157.field2651[var6];
                            class196.field3270[var9++] = class84.method589(false, var228).field4149;
                            continue;
                        }
                        if (var514 == 4201) {
                            var6 -= 2;
                            int var229 = class157.field2651[var6];
                            int var230 = class157.field2651[var6 + 1];
                            class248 var231 = class84.method589(false, var229);
                            if (var230 >= 1 && var230 <= 5 && var231.field4099[var230 - 1] != null) {
                                class196.field3270[var9++] = var231.field4099[var230 - 1];
                                continue;
                            }
                            class196.field3270[var9++] = class39.field696;
                            continue;
                        }
                        if (var514 == 4202) {
                            var6 -= 2;
                            int var232 = class157.field2651[var6 + 1];
                            int var233 = class157.field2651[var6];
                            class248 var234 = class84.method589(false, var233);
                            if (var232 >= 1 && var232 <= 5 && var234.field4124[var232 - 1] != null) {
                                class196.field3270[var9++] = var234.field4124[var232 - 1];
                                continue;
                            }
                            class196.field3270[var9++] = class39.field696;
                            continue;
                        }
                        if (var514 == 4203) {
                            var6--;
                            int var235 = class157.field2651[var6];
                            class157.field2651[var6++] = class84.method589(false, var235).field4138;
                            continue;
                        }
                        if (var514 == 4204) {
                            var6--;
                            int var236 = class157.field2651[var6];
                            class157.field2651[var6++] = class84.method589(false, var236).field4118 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 4205) {
                            var6--;
                            int var237 = class157.field2651[var6];
                            class248 var238 = class84.method589(false, var237);
                            if (var238.field4145 == -1 && var238.field4168 >= 0) {
                                class157.field2651[var6++] = var238.field4168;
                                continue;
                            }
                            class157.field2651[var6++] = var237;
                            continue;
                        }
                        if (var514 == 4206) {
                            var6--;
                            int var239 = class157.field2651[var6];
                            class248 var240 = class84.method589(false, var239);
                            if (var240.field4145 >= 0 && var240.field4168 >= 0) {
                                class157.field2651[var6++] = var240.field4168;
                                continue;
                            }
                            class157.field2651[var6++] = var239;
                            continue;
                        }
                        if (var514 == 4207) {
                            var6--;
                            int var241 = class157.field2651[var6];
                            class157.field2651[var6++] = class84.method589(false, var241).field4151 ? 1 : 0;
                            continue;
                        }
                        if (var514 == 4208) {
                            var6 -= 2;
                            int var242 = class157.field2651[var6 + 1];
                            int var243 = class157.field2651[var6];
                            class319 var244 = class229.method1686(false, var242);
                            if (var244.method2220((byte) 119)) {
                                class196.field3270[var9++] = class84.method589(false, var243).method1811(var242, -1, var244.field5460);
                            } else {
                                class157.field2651[var6++] = class84.method589(false, var243).method1802(var244.field5449, var242, (byte) 46);
                            }
                            continue;
                        }
                        if (var514 == 4210) {
                            var6--;
                            int var245 = class157.field2651[var6];
                            var9--;
                            class146 var246 = class196.field3270[var9];
                            class112.method757(var246, var245 == 1, 8);
                            class157.field2651[var6++] = class148.field2520;
                            continue;
                        }
                        if (var514 == 4211) {
                            if (class146.field2476 != null && class84.field1334 < class148.field2520) {
                                class157.field2651[var6++] = class82.method582(class146.field2476[class84.field1334++], 65535);
                                continue;
                            }
                            class157.field2651[var6++] = -1;
                            continue;
                        }
                        if (var514 == 4212) {
                            class84.field1334 = 0;
                            continue;
                        }
                    } else if (var514 < 4400) {
                        if (var514 == 4300) {
                            var6 -= 2;
                            int var247 = class157.field2651[var6];
                            int var248 = class157.field2651[var6 + 1];
                            class319 var249 = class229.method1686(false, var248);
                            if (var249.method2220((byte) 119)) {
                                class196.field3270[var9++] = class218.method1610(var247, (byte) -33).method2125(class35.method255(arg1, 1540062076), var248, var249.field5460);
                            } else {
                                class157.field2651[var6++] = class218.method1610(var247, (byte) -33).method2131(var249.field5449, var248, (byte) 84);
                            }
                            continue;
                        }
                        if (var514 == 4301) {
                            var6--;
                            int var250 = class157.field2651[var6];
                            class157.field2651[var6++] = class218.method1610(var250, (byte) -33).field5105;
                            continue;
                        }
                        if (var514 == 4302) {
                            var6--;
                            int var251 = class157.field2651[var6];
                            class157.field2651[var6++] = class218.method1610(var251, (byte) -33).field5118;
                            continue;
                        }
                        if (var514 == 4303) {
                            var6--;
                            int var252 = class157.field2651[var6];
                            class157.field2651[var6++] = class218.method1610(var252, (byte) -33).field5104;
                            continue;
                        }
                        if (var514 == 4304) {
                            var6--;
                            int var253 = class157.field2651[var6];
                            class157.field2651[var6++] = class218.method1610(var253, (byte) -33).field5097;
                            continue;
                        }
                        if (var514 == 4305) {
                            var6--;
                            int var254 = class157.field2651[var6];
                            class157.field2651[var6++] = class218.method1610(var254, (byte) -33).field5107;
                            continue;
                        }
                        if (var514 == 4306) {
                            var6--;
                            int var255 = class157.field2651[var6];
                            class157.field2651[var6++] = class218.method1610(var255, (byte) -33).field5108;
                            continue;
                        }
                        if (var514 == 4307) {
                            var6--;
                            int var256 = class157.field2651[var6];
                            class157.field2651[var6++] = class218.method1610(var256, (byte) -33).field5132;
                            continue;
                        }
                    } else if (var514 >= 4500) {
                        if (var514 < 4600) {
                            if (var514 == 4500) {
                                var6 -= 2;
                                int var257 = class157.field2651[var6];
                                int var258 = class157.field2651[var6 + 1];
                                class319 var259 = class229.method1686(false, var258);
                                if (var259.method2220((byte) 119)) {
                                    class196.field3270[var9++] = class238.method1735(class35.method255(arg1, 1508), var257).method1234(var258, var259.field5460, 125);
                                } else {
                                    class157.field2651[var6++] = class238.method1735(-93, var257).method1230(false, var258, var259.field5449);
                                }
                                continue;
                            }
                        } else if (var514 < 5100) {
                            if (var514 == 5000) {
                                class157.field2651[var6++] = class106.field1716;
                                continue;
                            }
                            if (var514 == 5001) {
                                var6 -= 3;
                                class106.field1716 = class157.field2651[var6];
                                class62.field1061 = class157.field2651[var6 + 1];
                                class213.field3523++;
                                class25.field439 = class157.field2651[var6 + 2];
                                class47.field820.method1656(55, 16);
                                class47.field820.method332(class106.field1716, 105);
                                class47.field820.method332(class62.field1061, 84);
                                class47.field820.method332(class25.field439, 72);
                                continue;
                            }
                            if (var514 == 5002) {
                                var6 -= 2;
                                var9--;
                                class146 var359 = class196.field3270[var9];
                                int var360 = class157.field2651[var6];
                                class140.field2355++;
                                int var361 = class157.field2651[var6 + 1];
                                class47.field820.method1656(76, 16);
                                class47.field820.method359(var359.method1123(-13726), 128);
                                class47.field820.method332(var360 - 1, 97);
                                class47.field820.method332(var361, 80);
                                continue;
                            }
                            if (var514 == 5003) {
                                class146 var362 = null;
                                var6--;
                                int var363 = class157.field2651[var6];
                                if (var363 < 100) {
                                    var362 = class80.field1280[var363];
                                }
                                if (var362 == null) {
                                    var362 = class39.field696;
                                }
                                class196.field3270[var9++] = var362;
                                continue;
                            }
                            if (var514 == 5004) {
                                int var364 = -1;
                                var6--;
                                int var365 = class157.field2651[var6];
                                if (var365 < 100 && class80.field1280[var365] != null) {
                                    var364 = class97.field1575[var365];
                                }
                                class157.field2651[var6++] = var364;
                                continue;
                            }
                            if (var514 == 5005) {
                                class157.field2651[var6++] = class62.field1061;
                                continue;
                            }
                            if (var514 == 5008) {
                                var9--;
                                class146 var366 = class196.field3270[var9];
                                if (var366.method1080((byte) -36, class64.field1098)) {
                                    class266.method1936((byte) -75, var366);
                                    continue;
                                }
                                if (class191.field3164 == 0 && (class157.field2653 && !class158.field2675 || class287.field4925)) {
                                    continue;
                                }
                                class267.field4605++;
                                class146 var367 = var366.method1108(true);
                                byte var368 = 0;
                                if (var367.method1080((byte) -83, class76.field1232)) {
                                    var368 = 0;
                                    var366 = var366.method1111(arg1 ^ 0xFFFFFA0C, class76.field1232.method1094((byte) -69));
                                } else if (var367.method1080((byte) -34, class302.field5168)) {
                                    var366 = var366.method1111(115, class302.field5168.method1094((byte) -95));
                                    var368 = 1;
                                } else if (var367.method1080((byte) -117, class313.field5349)) {
                                    var368 = 2;
                                    var366 = var366.method1111(arg1 ^ 0xFFFFFA0F, class313.field5349.method1094((byte) -72));
                                } else if (var367.method1080((byte) -40, class218.field3604)) {
                                    var368 = 3;
                                    var366 = var366.method1111(arg1 ^ 0xFFFFFA04, class218.field3604.method1094((byte) -43));
                                } else if (var367.method1080((byte) -127, class3.field22)) {
                                    var366 = var366.method1111(119, class3.field22.method1094((byte) -32));
                                    var368 = 4;
                                } else if (var367.method1080((byte) -82, class88.field1399)) {
                                    var368 = 5;
                                    var366 = var366.method1111(arg1 ^ 0x5FE, class88.field1399.method1094((byte) -104));
                                } else if (var367.method1080((byte) -102, class192.field3199)) {
                                    var366 = var366.method1111(-24, class192.field3199.method1094((byte) -73));
                                    var368 = 6;
                                } else if (var367.method1080((byte) -27, class121.field1989)) {
                                    var366 = var366.method1111(117, class121.field1989.method1094((byte) -67));
                                    var368 = 7;
                                } else if (var367.method1080((byte) -91, class287.field4908)) {
                                    var366 = var366.method1111(119, class287.field4908.method1094((byte) -68));
                                    var368 = 8;
                                } else if (var367.method1080((byte) -31, class235.field3926)) {
                                    var366 = var366.method1111(-25, class235.field3926.method1094((byte) -99));
                                    var368 = 9;
                                } else if (var367.method1080((byte) -60, class318.field5402)) {
                                    var366 = var366.method1111(120, class318.field5402.method1094((byte) -70));
                                    var368 = 10;
                                } else if (var367.method1080((byte) -47, class228.field3804)) {
                                    var368 = 11;
                                    var366 = var366.method1111(121, class228.field3804.method1094((byte) -8));
                                } else if (class14.field263 != 0) {
                                    if (var367.method1080((byte) -20, class76.field1240)) {
                                        var368 = 0;
                                        var366 = var366.method1111(118, class76.field1240.method1094((byte) -69));
                                    } else if (var367.method1080((byte) -50, class302.field5171)) {
                                        var368 = 1;
                                        var366 = var366.method1111(119, class302.field5171.method1094((byte) -42));
                                    } else if (var367.method1080((byte) -53, class313.field5330)) {
                                        var366 = var366.method1111(116, class313.field5330.method1094((byte) -37));
                                        var368 = 2;
                                    } else if (var367.method1080((byte) -50, class218.field3597)) {
                                        var368 = 3;
                                        var366 = var366.method1111(arg1 ^ 0xFFFFFA01, class218.field3597.method1094((byte) -75));
                                    } else if (var367.method1080((byte) -125, class3.field21)) {
                                        var366 = var366.method1111(arg1 ^ 0x5B4, class3.field21.method1094((byte) -19));
                                        var368 = 4;
                                    } else if (var367.method1080((byte) -78, class88.field1403)) {
                                        var368 = 5;
                                        var366 = var366.method1111(-11, class88.field1403.method1094((byte) -39));
                                    } else if (var367.method1080((byte) -87, class192.field3178)) {
                                        var366 = var366.method1111(120, class192.field3178.method1094((byte) -111));
                                        var368 = 6;
                                    } else if (var367.method1080((byte) -103, class121.field1991)) {
                                        var366 = var366.method1111(117, class121.field1991.method1094((byte) -105));
                                        var368 = 7;
                                    } else if (var367.method1080((byte) -55, class287.field4911)) {
                                        var366 = var366.method1111(119, class287.field4911.method1094((byte) -26));
                                        var368 = 8;
                                    } else if (var367.method1080((byte) -126, class235.field3933)) {
                                        var366 = var366.method1111(-71, class235.field3933.method1094((byte) -102));
                                        var368 = 9;
                                    } else if (var367.method1080((byte) -28, class318.field5442)) {
                                        var368 = 10;
                                        var366 = var366.method1111(115, class318.field5442.method1094((byte) -10));
                                    } else if (var367.method1080((byte) -70, class228.field3808)) {
                                        var366 = var366.method1111(125, class228.field3808.method1094((byte) -47));
                                        var368 = 11;
                                    }
                                }
                                class146 var369 = var366.method1108(true);
                                byte var370 = 0;
                                if (var369.method1080((byte) -26, class83.field1318)) {
                                    var370 = 1;
                                    var366 = var366.method1111(125, class83.field1318.method1094((byte) -23));
                                } else if (var369.method1080((byte) -88, class312.field5318)) {
                                    var370 = 2;
                                    var366 = var366.method1111(123, class312.field5318.method1094((byte) -56));
                                } else if (var369.method1080((byte) -35, class297.field5057)) {
                                    var370 = 3;
                                    var366 = var366.method1111(arg1 ^ 0xFFFFFA01, class297.field5057.method1094((byte) -91));
                                } else if (var369.method1080((byte) -73, class107.field1738)) {
                                    var370 = 4;
                                    var366 = var366.method1111(arg1 ^ 0xFFFFFA03, class107.field1738.method1094((byte) -13));
                                } else if (var369.method1080((byte) -36, class214.field3540)) {
                                    var366 = var366.method1111(-73, class214.field3540.method1094((byte) -74));
                                    var370 = 5;
                                } else if (class14.field263 != 0) {
                                    if (var369.method1080((byte) -75, class83.field1321)) {
                                        var366 = var366.method1111(-94, class83.field1321.method1094((byte) -116));
                                        var370 = 1;
                                    } else if (var369.method1080((byte) -120, class312.field5324)) {
                                        var366 = var366.method1111(-120, class312.field5324.method1094((byte) -110));
                                        var370 = 2;
                                    } else if (var369.method1080((byte) -42, class297.field5060)) {
                                        var370 = 3;
                                        var366 = var366.method1111(122, class297.field5060.method1094((byte) -15));
                                    } else if (var369.method1080((byte) -105, class107.field1735)) {
                                        var366 = var366.method1111(125, class107.field1735.method1094((byte) -90));
                                        var370 = 4;
                                    } else if (var369.method1080((byte) -120, class214.field3527)) {
                                        var370 = 5;
                                        var366 = var366.method1111(115, class214.field3527.method1094((byte) -66));
                                    }
                                }
                                class47.field820.method1656(239, 16);
                                class47.field820.method332(0, 91);
                                int var371 = class47.field820.field857;
                                class47.field820.method332(var368, 92);
                                class47.field820.method332(var370, arg1 ^ 0xFFFFFA2B);
                                class250.method1829(0, var366, class47.field820);
                                class47.field820.method331(86, class47.field820.field857 - var371);
                                continue;
                            }
                            if (var514 == 5009) {
                                var9 -= 2;
                                class146 var372 = class196.field3270[var9];
                                class146 var373 = class196.field3270[var9 + 1];
                                if (class191.field3164 != 0 || (!class157.field2653 || class158.field2675) && !class287.field4925) {
                                    class47.field820.method1656(10, 16);
                                    class47.field820.method332(0, 83);
                                    class250.field4185++;
                                    int var374 = class47.field820.field857;
                                    class47.field820.method359(var372.method1123(-13726), arg1 ^ 0xFFFFFAFB);
                                    class250.method1829(0, var373, class47.field820);
                                    class47.field820.method331(-76, class47.field820.field857 - var374);
                                }
                                continue;
                            }
                            if (var514 == 5010) {
                                var6--;
                                int var375 = class157.field2651[var6];
                                class146 var376 = null;
                                if (var375 < 100) {
                                    var376 = class167.field2826[var375];
                                }
                                if (var376 == null) {
                                    var376 = class39.field696;
                                }
                                class196.field3270[var9++] = var376;
                                continue;
                            }
                            if (var514 == 5011) {
                                var6--;
                                int var377 = class157.field2651[var6];
                                class146 var378 = null;
                                if (var377 < 100) {
                                    var378 = class87.field1388[var377];
                                }
                                if (var378 == null) {
                                    var378 = class39.field696;
                                }
                                class196.field3270[var9++] = var378;
                                continue;
                            }
                            if (var514 == 5012) {
                                var6--;
                                int var379 = class157.field2651[var6];
                                int var380 = -1;
                                if (var379 < 100) {
                                    var380 = class274.field4723[var379];
                                }
                                class157.field2651[var6++] = var380;
                                continue;
                            }
                            if (var514 == 5015) {
                                class146 var381;
                                if (class102.field1639 == null || class102.field1639.field3891 == null) {
                                    var381 = class161.field2734;
                                } else {
                                    var381 = class102.field1639.method1715(arg1 ^ 0x5C8);
                                }
                                class196.field3270[var9++] = var381;
                                continue;
                            }
                            if (var514 == 5016) {
                                class157.field2651[var6++] = class25.field439;
                                continue;
                            }
                            if (var514 == 5017) {
                                class157.field2651[var6++] = class103.field1670;
                                continue;
                            }
                            if (var514 == 5050) {
                                var6--;
                                int var382 = class157.field2651[var6];
                                class196.field3270[var9++] = class277.method2018(97, var382).field3760;
                                continue;
                            }
                            if (var514 == 5051) {
                                var6--;
                                int var383 = class157.field2651[var6];
                                class226 var384 = class277.method2018(arg1 ^ 0xFFFFFA09, var383);
                                if (var384.field3763 == null) {
                                    class157.field2651[var6++] = 0;
                                } else {
                                    class157.field2651[var6++] = var384.field3763.length;
                                }
                                continue;
                            }
                            if (var514 == 5052) {
                                var6 -= 2;
                                int var385 = class157.field2651[var6];
                                int var386 = class157.field2651[var6 + 1];
                                class226 var387 = class277.method2018(99, var385);
                                int var388 = var387.field3763[var386];
                                class157.field2651[var6++] = var388;
                                continue;
                            }
                            if (var514 == 5053) {
                                var6--;
                                int var389 = class157.field2651[var6];
                                class226 var390 = class277.method2018(80, var389);
                                if (var390.field3768 == null) {
                                    class157.field2651[var6++] = 0;
                                } else {
                                    class157.field2651[var6++] = var390.field3768.length;
                                }
                                continue;
                            }
                            if (var514 == 5054) {
                                var6 -= 2;
                                int var391 = class157.field2651[var6];
                                int var392 = class157.field2651[var6 + 1];
                                class157.field2651[var6++] = class277.method2018(105, var391).field3768[var392];
                                continue;
                            }
                            if (var514 == 5055) {
                                var6--;
                                int var393 = class157.field2651[var6];
                                class196.field3270[var9++] = class40.method287(var393, (byte) -117).method1831(0);
                                continue;
                            }
                            if (var514 == 5056) {
                                var6--;
                                int var394 = class157.field2651[var6];
                                class250 var395 = class40.method287(var394, (byte) -67);
                                if (var395.field4182 == null) {
                                    class157.field2651[var6++] = 0;
                                } else {
                                    class157.field2651[var6++] = var395.field4182.length;
                                }
                                continue;
                            }
                            if (var514 == 5057) {
                                var6 -= 2;
                                int var396 = class157.field2651[var6];
                                int var397 = class157.field2651[var6 + 1];
                                class157.field2651[var6++] = class40.method287(var396, (byte) -80).field4182[var397];
                                continue;
                            }
                            if (var514 == 5058) {
                                class182.field3051 = new class293();
                                var6--;
                                class182.field3051.field4982 = class157.field2651[var6];
                                class182.field3051.field4983 = class40.method287(class182.field3051.field4982, (byte) -79);
                                class182.field3051.field4985 = new int[class182.field3051.field4983.method1826((byte) -113)];
                                continue;
                            }
                            if (var514 == 5059) {
                                class47.field820.method1656(120, 16);
                                class88.field1408++;
                                class47.field820.method332(0, 81);
                                int var398 = class47.field820.field857;
                                class47.field820.method332(0, 73);
                                class47.field820.method361(class182.field3051.field4982, arg1 + 1635555533);
                                class182.field3051.field4983.method1836(class47.field820, class182.field3051.field4985, (byte) -86);
                                class47.field820.method331(-89, class47.field820.field857 - var398);
                                continue;
                            }
                            if (var514 == 5060) {
                                class261.field4336++;
                                var9--;
                                class146 var399 = class196.field3270[var9];
                                class47.field820.method1656(9, arg1 ^ 0xFFFFFA6B);
                                class47.field820.method332(0, 102);
                                int var400 = class47.field820.field857;
                                class47.field820.method359(var399.method1123(-13726), 128);
                                class47.field820.method361(class182.field3051.field4982, 1635554120);
                                class182.field3051.field4983.method1836(class47.field820, class182.field3051.field4985, (byte) -86);
                                class47.field820.method331(arg1 ^ 0xFFFFFA70, class47.field820.field857 - var400);
                                continue;
                            }
                            if (var514 == 5061) {
                                class47.field820.method1656(120, arg1 ^ 0xFFFFFA6B);
                                class88.field1408++;
                                class47.field820.method332(0, 116);
                                int var401 = class47.field820.field857;
                                class47.field820.method332(1, 100);
                                class47.field820.method361(class182.field3051.field4982, 1635554120);
                                class182.field3051.field4983.method1836(class47.field820, class182.field3051.field4985, (byte) -86);
                                class47.field820.method331(127, class47.field820.field857 - var401);
                                continue;
                            }
                            if (var514 == 5062) {
                                var6 -= 2;
                                int var402 = class157.field2651[var6 + 1];
                                int var403 = class157.field2651[var6];
                                class157.field2651[var6++] = class277.method2018(126, var403).field3766[var402];
                                continue;
                            }
                            if (var514 == 5063) {
                                var6 -= 2;
                                int var404 = class157.field2651[var6 + 1];
                                int var405 = class157.field2651[var6];
                                class157.field2651[var6++] = class277.method2018(76, var405).field3770[var404];
                                continue;
                            }
                            if (var514 == 5064) {
                                var6 -= 2;
                                int var406 = class157.field2651[var6];
                                int var407 = class157.field2651[var6 + 1];
                                if (var407 == -1) {
                                    class157.field2651[var6++] = -1;
                                } else {
                                    class157.field2651[var6++] = class277.method2018(121, var406).method1671(var407, -1);
                                }
                                continue;
                            }
                            if (var514 == 5065) {
                                var6 -= 2;
                                int var408 = class157.field2651[var6 + 1];
                                int var409 = class157.field2651[var6];
                                if (var408 == -1) {
                                    class157.field2651[var6++] = -1;
                                } else {
                                    class157.field2651[var6++] = class277.method2018(83, var409).method1667(var408, -20325);
                                }
                                continue;
                            }
                            if (var514 == 5066) {
                                var6--;
                                int var410 = class157.field2651[var6];
                                class157.field2651[var6++] = class40.method287(var410, (byte) -75).method1826((byte) -128);
                                continue;
                            }
                            if (var514 == 5067) {
                                var6 -= 2;
                                int var411 = class157.field2651[var6];
                                int var412 = class157.field2651[var6 + 1];
                                int var413 = class40.method287(var411, (byte) -85).method1833(1, var412);
                                class157.field2651[var6++] = var413;
                                continue;
                            }
                            if (var514 == 5068) {
                                var6 -= 2;
                                int var414 = class157.field2651[var6];
                                int var415 = class157.field2651[var6 + 1];
                                class182.field3051.field4985[var414] = var415;
                                continue;
                            }
                            if (var514 == 5069) {
                                var6 -= 2;
                                int var416 = class157.field2651[var6 + 1];
                                int var417 = class157.field2651[var6];
                                class182.field3051.field4985[var417] = var416;
                                continue;
                            }
                            if (var514 == 5070) {
                                var6 -= 3;
                                int var418 = class157.field2651[var6];
                                int var419 = class157.field2651[var6 + 1];
                                int var420 = class157.field2651[var6 + 2];
                                class250 var421 = class40.method287(var418, (byte) 66);
                                if (var421.method1833(1, var419) != 0) {
                                    throw new RuntimeException("bad command");
                                }
                                class157.field2651[var6++] = var421.method1835(var419, -3568, var420);
                                continue;
                            }
                            if (var514 == 5071) {
                                var9--;
                                class146 var422 = class196.field3270[var9];
                                var6--;
                                boolean var423 = class157.field2651[var6] == 1;
                                class279.method2027((byte) 114, var422, var423);
                                class157.field2651[var6++] = class148.field2520;
                                continue;
                            }
                            if (var514 == 5072) {
                                if (class146.field2476 != null && class84.field1334 < class148.field2520) {
                                    class157.field2651[var6++] = class82.method582(class146.field2476[class84.field1334++], 65535);
                                    continue;
                                }
                                class157.field2651[var6++] = -1;
                                continue;
                            }
                            if (var514 == 5073) {
                                class84.field1334 = 0;
                                continue;
                            }
                        } else if (var514 < 5200) {
                            if (var514 == 5100) {
                                if (class113.field1813[86]) {
                                    class157.field2651[var6++] = 1;
                                } else {
                                    class157.field2651[var6++] = 0;
                                }
                                continue;
                            }
                            if (var514 == 5101) {
                                if (class113.field1813[82]) {
                                    class157.field2651[var6++] = 1;
                                } else {
                                    class157.field2651[var6++] = 0;
                                }
                                continue;
                            }
                            if (var514 == 5102) {
                                if (class113.field1813[81]) {
                                    class157.field2651[var6++] = 1;
                                } else {
                                    class157.field2651[var6++] = 0;
                                }
                                continue;
                            }
                        } else if (var514 < 5300) {
                            if (var514 == 5200) {
                                var6--;
                                class132.method983(class157.field2651[var6], (byte) 96);
                                continue;
                            }
                            if (var514 == 5201) {
                                class157.field2651[var6++] = class199.method1530(class35.method255(arg1, -1413));
                                continue;
                            }
                            if (var514 == 5202) {
                                var6--;
                                class138.method1015(124, class157.field2651[var6]);
                                continue;
                            }
                            if (var514 == 5203) {
                                var9--;
                                class302.method2140((byte) 124, class196.field3270[var9]);
                                continue;
                            }
                            if (var514 == 5204) {
                                class196.field3270[var9 - 1] = class97.method672((byte) 75, class196.field3270[var9 - 1]);
                                continue;
                            }
                            if (var514 == 5205) {
                                var9--;
                                class119.method815(-3, class196.field3270[var9]);
                                continue;
                            }
                            if (var514 == 5206) {
                                var6--;
                                int var260 = class157.field2651[var6];
                                class194 var261 = class88.method613(var260 & 0x3FFF, -126, var260 >> 14 & 0x3FFF);
                                if (var261 == null) {
                                    class196.field3270[var9++] = class39.field696;
                                } else {
                                    class196.field3270[var9++] = var261.field3236;
                                }
                                continue;
                            }
                            if (var514 == 5207) {
                                int var10000 = arg1 + 16500;
                                var9--;
                                class194 var262 = class187.method1462(var10000, class196.field3270[var9]);
                                if (var262 != null && var262.field3229 != null) {
                                    class196.field3270[var9++] = var262.field3229;
                                    continue;
                                }
                                class196.field3270[var9++] = class39.field696;
                                continue;
                            }
                            if (var514 == 5208) {
                                class157.field2651[var6++] = class195.field3243;
                                class157.field2651[var6++] = class14.field265;
                                continue;
                            }
                            if (var514 == 5209) {
                                class157.field2651[var6++] = class277.field4764 + class148.field2508;
                                class157.field2651[var6++] = class33.field639 + class191.field3152 - class236.field3937 - 1;
                                continue;
                            }
                            if (var514 == 5210) {
                                class194 var263 = class199.method1527((byte) 84);
                                if (var263 == null) {
                                    class157.field2651[var6++] = 0;
                                    class157.field2651[var6++] = 0;
                                } else {
                                    class157.field2651[var6++] = var263.field3225 * 64;
                                    class157.field2651[var6++] = var263.field3219 * 64;
                                }
                                continue;
                            }
                            if (var514 == 5211) {
                                class194 var264 = class199.method1527((byte) 84);
                                if (var264 == null) {
                                    class157.field2651[var6++] = 0;
                                    class157.field2651[var6++] = 0;
                                } else {
                                    class157.field2651[var6++] = var264.field3240 - var264.field3241;
                                    class157.field2651[var6++] = var264.field3227 - var264.field3230;
                                }
                                continue;
                            }
                            if (var514 == 5212) {
                                int var265 = class15.method100(-55);
                                int var266 = 0;
                                class146 var267;
                                if (var265 == -1) {
                                    var267 = class39.field696;
                                } else {
                                    var267 = class135.field2255.field4805[var265];
                                    var266 = class135.field2255.method2030(var265, (byte) -104);
                                }
                                class146 var268 = var267.method1126(arg1 + 1285, class182.field3043, class321.field5491);
                                class196.field3270[var9++] = var268;
                                class157.field2651[var6++] = var266;
                                continue;
                            }
                            if (var514 == 5213) {
                                int var269 = class26.method172(127);
                                int var270 = 0;
                                class146 var271;
                                if (var269 == -1) {
                                    var271 = class39.field696;
                                } else {
                                    var271 = class135.field2255.field4805[var269];
                                    var270 = class135.field2255.method2030(var269, (byte) -104);
                                }
                                class146 var272 = var271.method1126(-75, class182.field3043, class321.field5491);
                                class196.field3270[var9++] = var272;
                                class157.field2651[var6++] = var270;
                                continue;
                            }
                            if (var514 == 5214) {
                                var6--;
                                int var273 = class157.field2651[var6];
                                class296.method2104(var273 & 0x3FFF, var273 >> 14 & 0x3FFF, true);
                                continue;
                            }
                            if (var514 == 5215) {
                                var6--;
                                int var274 = class157.field2651[var6];
                                var9--;
                                class146 var275 = class196.field3270[var9];
                                class151 var276 = class104.method711(var274 & 0x3FFF, (var274 & 0xFFFC130) >> 14, arg1 ^ 0x5F3);
                                boolean var277 = false;
                                for (class194 var278 = (class194) var276.method1197(17181); var278 != null; var278 = (class194) var276.method1198((byte) -125)) {
                                    if (var278.field3236.method1106(var275, 73)) {
                                        var277 = true;
                                        break;
                                    }
                                }
                                if (var277) {
                                    class157.field2651[var6++] = 1;
                                } else {
                                    class157.field2651[var6++] = 0;
                                }
                                continue;
                            }
                            if (var514 == 5216) {
                                var6--;
                                int var279 = class157.field2651[var6];
                                class171.method1322(var279, 126);
                                continue;
                            }
                            if (var514 == 5217) {
                                var6--;
                                int var280 = class157.field2651[var6];
                                if (class320.method2229(26002, var280)) {
                                    class157.field2651[var6++] = 1;
                                } else {
                                    class157.field2651[var6++] = 0;
                                }
                                continue;
                            }
                            if (var514 == 5218) {
                                class194 var281 = class199.method1527((byte) 84);
                                if (var281 == null) {
                                    class157.field2651[var6++] = -1;
                                } else {
                                    class157.field2651[var6++] = var281.field3238;
                                }
                                continue;
                            }
                            if (var514 == 5219) {
                                var9--;
                                class185.method1450(3, class196.field3270[var9]);
                                continue;
                            }
                        } else if (var514 < 5400) {
                            if (var514 == 5300) {
                                var6 -= 2;
                                int var282 = class157.field2651[var6];
                                int var283 = class157.field2651[var6 + 1];
                                class265.method1927(false, var282, 3, var283, 0);
                                class157.field2651[var6++] = class18.field358 == null ? 0 : 1;
                                continue;
                            }
                            if (var514 == 5301) {
                                if (class18.field358 != null) {
                                    class265.method1927(false, -1, class91.field1435, -1, 0);
                                }
                                continue;
                            }
                            if (var514 == 5302) {
                                class87[] var284 = class143.method1053((byte) 96);
                                class157.field2651[var6++] = var284.length;
                                continue;
                            }
                            if (var514 == 5303) {
                                var6--;
                                int var285 = class157.field2651[var6];
                                class87[] var286 = class143.method1053((byte) -82);
                                class157.field2651[var6++] = var286[var285].field1377;
                                class157.field2651[var6++] = var286[var285].field1390;
                                continue;
                            }
                            if (var514 == 5305) {
                                int var287 = class275.field4727;
                                int var288 = class124.field2020;
                                int var289 = -1;
                                class87[] var290 = class143.method1053((byte) -72);
                                for (int var291 = 0; var291 < var290.length; var291++) {
                                    class87 var292 = var290[var291];
                                    if (var292.field1377 == var288 && var292.field1390 == var287) {
                                        var289 = var291;
                                        break;
                                    }
                                }
                                class157.field2651[var6++] = var289;
                                continue;
                            }
                            if (var514 == 5306) {
                                class157.field2651[var6++] = class157.method1228(arg1 + 1414);
                                continue;
                            }
                            if (var514 == 5307) {
                                var6--;
                                int var293 = class157.field2651[var6];
                                if (var293 < 0 || var293 > 2) {
                                    var293 = 0;
                                }
                                class265.method1927(false, -1, var293, -1, 0);
                                continue;
                            }
                            if (var514 == 5308) {
                                class157.field2651[var6++] = class91.field1435;
                                continue;
                            }
                            if (var514 == 5309) {
                                var6--;
                                int var294 = class157.field2651[var6];
                                if (var294 < 0 || var294 > 2) {
                                    var294 = 0;
                                }
                                class91.field1435 = var294;
                                class166.method1291(arg1 - 11970, class232.field3876);
                                continue;
                            }
                        } else if (var514 < 5500) {
                            if (var514 == 5400) {
                                var9 -= 2;
                                class146 var337 = class196.field3270[var9];
                                class293.field4977++;
                                var6--;
                                int var338 = class157.field2651[var6];
                                class146 var339 = class196.field3270[var9 + 1];
                                class47.field820.method1656(234, arg1 ^ 0xFFFFFA6B);
                                class47.field820.method332(class62.method479(-126, var337) + (class62.method479(-121, var339) + 1), 100);
                                class47.field820.method339(-104, var337);
                                class47.field820.method339(-96, var339);
                                class47.field820.method332(var338, 70);
                                continue;
                            }
                            if (var514 == 5401) {
                                var6 -= 2;
                                class245.field4048[class157.field2651[var6]] = (short) class252.method1839(class157.field2651[var6 + 1], (byte) -125);
                                class44.method308((byte) -105);
                                class252.method1844((byte) 91);
                                class173.method1336(arg1 + 1413);
                                class143.method1050((byte) -120);
                                class89.method616(-1212);
                                continue;
                            }
                            if (var514 == 5405) {
                                var6 -= 2;
                                int var340 = class157.field2651[var6];
                                int var341 = class157.field2651[var6 + 1];
                                if (var340 >= 0 && var340 < 2) {
                                    class232.field3882[var340] = new int[var341 << 1][4];
                                }
                                continue;
                            }
                            if (var514 == 5406) {
                                var6 -= 7;
                                int var342 = class157.field2651[var6];
                                int var343 = class157.field2651[var6 + 1] << 1;
                                int var344 = class157.field2651[var6 + 4];
                                int var345 = class157.field2651[var6 + 2];
                                int var346 = class157.field2651[var6 + 3];
                                int var347 = class157.field2651[var6 + 5];
                                int var348 = class157.field2651[var6 + 6];
                                if (var342 >= 0 && var342 < 2 && class232.field3882[var342] != null && var343 >= 0 && class232.field3882[var342].length > var343) {
                                    class232.field3882[var342][var343] = new int[] { (class82.method582(var345, 268426075) >> 14) * 128, var346, class82.method582(16383, var345) * 128, var348 };
                                    class232.field3882[var342][var343 + 1] = new int[] { (class82.method582(var344, 268429556) >> 14) * 128, var347, class82.method582(16383, var344) * 128 };
                                }
                                continue;
                            }
                            if (var514 == 5407) {
                                var6--;
                                int var349 = class232.field3882[class157.field2651[var6]].length >> 1;
                                class157.field2651[var6++] = var349;
                                continue;
                            }
                            if (var514 == 5411) {
                                if (class18.field358 != null) {
                                    class265.method1927(false, -1, class91.field1435, -1, arg1 + 1413);
                                }
                                if (class144.field2418 == null) {
                                    class165.method1287(class18.method138(arg1 ^ 0x5ED), -1, false);
                                } else {
                                    System.exit(0);
                                }
                                continue;
                            }
                            if (var514 == 5419) {
                                class146 var350 = class39.field696;
                                if (class187.field3110 != null) {
                                    var350 = class168.method1299(class187.field3110.field4267, -89781616);
                                    try {
                                        if (class187.field3110.field4269 != null) {
                                            byte[] var351 = ((String) class187.field3110.field4269).getBytes("ISO-8859-1");
                                            var350 = class316.method2210(arg1 + 1414, var351.length, var351, 0);
                                        }
                                    } catch (UnsupportedEncodingException var512) {
                                    }
                                }
                                class196.field3270[var9++] = var350;
                                continue;
                            }
                            if (var514 == 5420) {
                                class157.field2651[var6++] = class129.field2154 == 3 ? 1 : 0;
                                continue;
                            }
                            if (var514 == 5421) {
                                if (class18.field358 != null) {
                                    class265.method1927(false, -1, class91.field1435, -1, 0);
                                }
                                var6--;
                                boolean var353 = class157.field2651[var6] == 1;
                                var9--;
                                class146 var354 = class196.field3270[var9];
                                class146 var355 = class112.method758(126, new class146[] { class18.method138(arg1 + 1315), var354 });
                                if (class144.field2418 == null && (!var353 || class129.field2154 == 3 || !class129.field2166.startsWith("win") || class70.field1142)) {
                                    class165.method1287(var355, arg1 ^ 0x584, var353);
                                    continue;
                                }
                                class55.field982 = var353;
                                class148.field2511 = var355;
                                class159.field2692 = class232.field3876.method926(6, new String(var355.method1128(false), "ISO-8859-1"));
                                continue;
                            }
                            if (var514 == 5422) {
                                var9 -= 2;
                                class146 var356 = class196.field3270[var9];
                                class146 var357 = class196.field3270[var9 + 1];
                                var6--;
                                int var358 = class157.field2651[var6];
                                if (var356.method1094((byte) -23) > 0) {
                                    if (class222.field3696 == null) {
                                        class222.field3696 = new class146[class312.field5313[class95.field1530]];
                                    }
                                    class222.field3696[var358] = var356;
                                }
                                if (var357.method1094((byte) -123) > 0) {
                                    if (class230.field3842 == null) {
                                        class230.field3842 = new class146[class312.field5313[class95.field1530]];
                                    }
                                    class230.field3842[var358] = var357;
                                }
                                continue;
                            }
                            if (var514 == 5423) {
                                var9--;
                                class196.field3270[var9].method1102((byte) -126);
                                continue;
                            }
                            if (var514 == 5424) {
                                var6 -= 11;
                                class192.field3183 = class157.field2651[var6];
                                class262.field4367 = class157.field2651[var6 + 1];
                                class72.field1176 = class157.field2651[var6 + 2];
                                class266.field4577 = class157.field2651[var6 + 3];
                                class306.field5230 = class157.field2651[var6 + 4];
                                class228.field3810 = class157.field2651[var6 + 5];
                                class98.field1589 = class157.field2651[var6 + 6];
                                class217.field3581 = class157.field2651[var6 + 7];
                                class232.field3880 = class157.field2651[var6 + 8];
                                class55.field986 = class157.field2651[var6 + 9];
                                class281.field4824 = class157.field2651[var6 + 10];
                                class196.field3273.method117(arg1 ^ 0x786F, class306.field5230);
                                class196.field3273.method117(arg1 - 30823, class228.field3810);
                                class196.field3273.method117(-32236, class98.field1589);
                                class196.field3273.method117(-32236, class217.field3581);
                                class196.field3273.method117(-32236, class232.field3880);
                                class177.field3003 = true;
                                continue;
                            }
                            if (var514 == 5425) {
                                class273.method1994((byte) 82);
                                class177.field3003 = false;
                                continue;
                            }
                            if (var514 == 5426) {
                                var6--;
                                class60.field1027 = class157.field2651[var6];
                                continue;
                            }
                            if (var514 == 5427) {
                                var6 -= 2;
                                class269.field4618 = class157.field2651[var6];
                                class152.field2585 = class157.field2651[var6 + 1];
                                continue;
                            }
                        } else if (var514 < 5600) {
                            if (var514 == 5500) {
                                var6 -= 4;
                                int var295 = class157.field2651[var6 + 1];
                                int var296 = class157.field2651[var6];
                                int var297 = class157.field2651[var6 + 2];
                                int var298 = class157.field2651[var6 + 3];
                                class166.method1292((byte) 81, var298, var297, (var296 >> 14 & 0x3FFF) - class15.field300, var295, (var296 & 0x3FFF) - class201.field3357, false);
                                continue;
                            }
                            if (var514 == 5501) {
                                var6 -= 4;
                                int var299 = class157.field2651[var6 + 2];
                                int var300 = class157.field2651[var6];
                                int var301 = class157.field2651[var6 + 3];
                                int var302 = class157.field2651[var6 + 1];
                                class75.method551(var302, 121, (var300 & 0x3FFF) - class201.field3357, var301, var299, (var300 >> 14 & 0x3FFF) - class15.field300);
                                continue;
                            }
                            if (var514 == 5502) {
                                var6 -= 6;
                                int var303 = class157.field2651[var6];
                                if (var303 >= 2) {
                                    throw new RuntimeException();
                                }
                                class238.field3974 = var303;
                                int var304 = class157.field2651[var6 + 1];
                                if (class232.field3882[class238.field3974].length >> 1 <= var304 + 1) {
                                    throw new RuntimeException();
                                }
                                class112.field1790 = var304;
                                class166.field2810 = 0;
                                class150.field2545 = class157.field2651[var6 + 2];
                                class288.field4938 = class157.field2651[var6 + 3];
                                int var305 = class157.field2651[var6 + 4];
                                if (var305 >= 2) {
                                    throw new RuntimeException();
                                }
                                class217.field3579 = var305;
                                int var306 = class157.field2651[var6 + 5];
                                if (class232.field3882[class217.field3579].length >> 1 <= var306 + 1) {
                                    throw new RuntimeException();
                                }
                                class17.field349 = var306;
                                class302.field5172 = 3;
                                continue;
                            }
                            if (var514 == 5503) {
                                class322.method2234(arg1 + 1412);
                                continue;
                            }
                            if (var514 == 5504) {
                                var6 -= 2;
                                class211.field3490 = class157.field2651[var6];
                                class158.field2668 = class157.field2651[var6 + 1];
                                if (class302.field5172 == 2) {
                                    class79.field1269 = class158.field2668;
                                    class63.field1088 = class211.field3490;
                                }
                                class265.method1926(15);
                                continue;
                            }
                            if (var514 == 5505) {
                                class157.field2651[var6++] = class211.field3490;
                                continue;
                            }
                            if (var514 == 5506) {
                                class157.field2651[var6++] = class158.field2668;
                                continue;
                            }
                        } else if (var514 < 5700) {
                            if (var514 == 5600) {
                                var9 -= 2;
                                class146 var333 = class196.field3270[var9];
                                class146 var334 = class196.field3270[var9 + 1];
                                var6--;
                                int var335 = class157.field2651[var6];
                                if (class238.field3973 == 10 && class22.field412 == 0 && class264.field4515 == 0 && class144.field2390 == 0 && class164.field2776 == 0) {
                                    class241.method1750(var335, var334, -14308, var333);
                                }
                                continue;
                            }
                            if (var514 == 5601) {
                                class78.method564(-6);
                                continue;
                            }
                            if (var514 == 5602) {
                                if (class264.field4515 == 0) {
                                    class101.field1633 = -2;
                                }
                                continue;
                            }
                            if (var514 == 5603) {
                                var6 -= 4;
                                if (class238.field3973 == 10 && class22.field412 == 0 && class264.field4515 == 0 && class144.field2390 == 0 && class164.field2776 == 0) {
                                    class46.method321(class157.field2651[var6 + 2], class157.field2651[var6], class157.field2651[var6 + 1], class157.field2651[var6 + 3], -58);
                                }
                                continue;
                            }
                            if (var514 == 5604) {
                                var9--;
                                if (class238.field3973 == 10 && class22.field412 == 0 && class264.field4515 == 0 && class144.field2390 == 0 && class164.field2776 == 0) {
                                    class124.method855(class196.field3270[var9].method1123(-13726), (byte) -58);
                                }
                                continue;
                            }
                            if (var514 == 5605) {
                                var6 -= 4;
                                var9 -= 2;
                                if (class238.field3973 == 10 && class22.field412 == 0 && class264.field4515 == 0 && class144.field2390 == 0 && class164.field2776 == 0) {
                                    class312.method2192(1, class157.field2651[var6 + 3], class157.field2651[var6], class196.field3270[var9].method1123(-13726), class157.field2651[var6 + 1], class196.field3270[var9 + 1], class157.field2651[var6 + 2]);
                                }
                                continue;
                            }
                            if (var514 == 5606) {
                                if (class144.field2390 == 0) {
                                    class187.field3116 = -2;
                                }
                                continue;
                            }
                            if (var514 == 5607) {
                                class157.field2651[var6++] = class101.field1633;
                                continue;
                            }
                            if (var514 == 5608) {
                                class157.field2651[var6++] = class182.field3053;
                                continue;
                            }
                            if (var514 == 5609) {
                                class157.field2651[var6++] = class187.field3116;
                                continue;
                            }
                            if (var514 == 5610) {
                                for (int var336 = 0; var336 < 5; var336++) {
                                    class196.field3270[var9++] = class199.field3328.length > var336 ? class199.field3328[var336].method1104((byte) 122) : class39.field696;
                                }
                                class199.field3328 = null;
                                continue;
                            }
                            if (var514 == 5611) {
                                class157.field2651[var6++] = class92.field1464;
                                continue;
                            }
                        } else if (var514 < 6100) {
                            if (var514 == 6001) {
                                var6--;
                                int var307 = class157.field2651[var6];
                                if (var307 < 1) {
                                    var307 = 1;
                                }
                                if (var307 > 4) {
                                    var307 = 4;
                                }
                                class273.field4684 = var307;
                                if (!class271.field4640 || !class102.field1641) {
                                    if (class273.field4684 == 1) {
                                        class109.method728(0.9F);
                                    }
                                    if (class273.field4684 == 2) {
                                        class109.method728(0.8F);
                                    }
                                    if (class273.field4684 == 3) {
                                        class109.method728(0.7F);
                                    }
                                    if (class273.field4684 == 4) {
                                        class109.method728(0.6F);
                                    }
                                }
                                if (class271.field4640) {
                                    class1.method1(29659);
                                    if (!class102.field1641) {
                                        class302.method2138(arg1 ^ 0xFFFFFA62);
                                    }
                                }
                                class252.method1844((byte) 91);
                                class166.method1291(-13383, class232.field3876);
                                class157.field2654 = false;
                                continue;
                            }
                            if (var514 == 6002) {
                                var6--;
                                class137.method1011(class157.field2651[var6] == 1, (byte) -77);
                                class184.method1446(-127);
                                class302.method2138(25);
                                class91.method625(arg1 + 1396);
                                class166.method1291(-13383, class232.field3876);
                                class157.field2654 = false;
                                continue;
                            }
                            if (var514 == 6003) {
                                var6--;
                                class312.field5315 = class157.field2651[var6] == 1;
                                class91.method625(-77);
                                class166.method1291(-13383, class232.field3876);
                                class157.field2654 = false;
                                continue;
                            }
                            if (var514 == 6005) {
                                var6--;
                                class76.field1230 = class157.field2651[var6] == 1;
                                class302.method2138(25);
                                class166.method1291(-13383, class232.field3876);
                                class157.field2654 = false;
                                continue;
                            }
                            if (var514 == 6006) {
                                var6--;
                                class319.field5448 = class157.field2651[var6] == 1;
                                ((class120) class109.field1747).method826(!class319.field5448, (byte) 100);
                                class166.method1291(-13383, class232.field3876);
                                class157.field2654 = false;
                                continue;
                            }
                            if (var514 == 6007) {
                                var6--;
                                class195.field3252 = class157.field2651[var6] == 1;
                                class166.method1291(arg1 ^ 0x31C2, class232.field3876);
                                class157.field2654 = false;
                                continue;
                            }
                            if (var514 == 6008) {
                                var6--;
                                class300.field5078 = class157.field2651[var6] == 1;
                                class166.method1291(-13383, class232.field3876);
                                class157.field2654 = false;
                                continue;
                            }
                            if (var514 == 6009) {
                                var6--;
                                class160.field2704 = class157.field2651[var6] == 1;
                                class166.method1291(-13383, class232.field3876);
                                class157.field2654 = false;
                                continue;
                            }
                            if (var514 == 6010) {
                                var6--;
                                class281.field4822 = class157.field2651[var6] == 1;
                                class166.method1291(-13383, class232.field3876);
                                class157.field2654 = false;
                                continue;
                            }
                            if (var514 == 6011) {
                                var6--;
                                int var308 = class157.field2651[var6];
                                if (var308 < 0 || var308 > 2) {
                                    var308 = 0;
                                }
                                class27.field478 = var308;
                                class166.method1291(-13383, class232.field3876);
                                class157.field2654 = false;
                                continue;
                            }
                            if (var514 == 6012) {
                                if (class271.field4640) {
                                    class140.method1033(0, 0, -5);
                                }
                                var6--;
                                class102.field1641 = class157.field2651[var6] == 1;
                                if (class271.field4640 && class102.field1641) {
                                    class109.method728(0.7F);
                                } else {
                                    if (class273.field4684 == 1) {
                                        class109.method728(0.9F);
                                    }
                                    if (class273.field4684 == 2) {
                                        class109.method728(0.8F);
                                    }
                                    if (class273.field4684 == 3) {
                                        class109.method728(0.7F);
                                    }
                                    if (class273.field4684 == 4) {
                                        class109.method728(0.6F);
                                    }
                                }
                                class302.method2138(25);
                                class166.method1291(-13383, class232.field3876);
                                class157.field2654 = false;
                                continue;
                            }
                            if (var514 == 6014) {
                                var6--;
                                class117.field1888 = class157.field2651[var6] == 1;
                                if (class271.field4640) {
                                    class302.method2138(25);
                                }
                                class166.method1291(-13383, class232.field3876);
                                class157.field2654 = false;
                                continue;
                            }
                            if (var514 == 6015) {
                                var6--;
                                class322.field5501 = class157.field2651[var6] == 1;
                                if (class271.field4640) {
                                    class1.method1(29659);
                                }
                                class166.method1291(-13383, class232.field3876);
                                class157.field2654 = false;
                                continue;
                            }
                            if (var514 == 6016) {
                                var6--;
                                int var309 = class157.field2651[var6];
                                if (var309 < 0 || var309 > 2) {
                                    var309 = 0;
                                }
                                class147.field2502 = var309;
                                if (class271.field4640) {
                                    class312.field5308 = true;
                                }
                                continue;
                            }
                            if (var514 == 6017) {
                                var6--;
                                class119.field1927 = class157.field2651[var6] == 1;
                                class98.method679((byte) -33);
                                class166.method1291(-13383, class232.field3876);
                                class157.field2654 = false;
                                continue;
                            }
                            if (var514 == 6018) {
                                var6--;
                                int var310 = class157.field2651[var6];
                                if (var310 < 0) {
                                    var310 = 0;
                                }
                                if (var310 > 127) {
                                    var310 = 127;
                                }
                                class100.field1621 = var310;
                                class166.method1291(-13383, class232.field3876);
                                class157.field2654 = false;
                                continue;
                            }
                            if (var514 == 6019) {
                                var6--;
                                int var311 = class157.field2651[var6];
                                if (var311 < 0) {
                                    var311 = 0;
                                }
                                if (var311 > 255) {
                                    var311 = 255;
                                }
                                if (class27.field479 != var311) {
                                    if (class27.field479 == 0 && class174.field2910 != -1) {
                                        class212.method1588(class116.field1865, 0, var311, true, false, class174.field2910);
                                        class85.field1357 = false;
                                    } else if (var311 == 0) {
                                        class169.method1305(false);
                                        class85.field1357 = false;
                                    } else {
                                        class88.method608(0, var311);
                                    }
                                    class27.field479 = var311;
                                }
                                class166.method1291(-13383, class232.field3876);
                                class157.field2654 = false;
                                continue;
                            }
                            if (var514 == 6020) {
                                var6--;
                                int var312 = class157.field2651[var6];
                                if (var312 < 0) {
                                    var312 = 0;
                                }
                                if (var312 > 127) {
                                    var312 = 127;
                                }
                                class236.field3936 = var312;
                                class166.method1291(-13383, class232.field3876);
                                class157.field2654 = false;
                                continue;
                            }
                            if (var514 == 6021) {
                                var6--;
                                class119.field1935 = class157.field2651[var6] == 1;
                                class91.method625(arg1 + 1324);
                                continue;
                            }
                            if (var514 == 6023) {
                                var6--;
                                int var313 = class157.field2651[var6];
                                boolean var314 = false;
                                if (var313 < 0) {
                                    var313 = 0;
                                }
                                if (var313 > 2) {
                                    var313 = 2;
                                }
                                if (class93.field1494 < 96) {
                                    var314 = true;
                                    var313 = 0;
                                }
                                class284.method2051(var313);
                                class166.method1291(-13383, class232.field3876);
                                class157.field2654 = false;
                                class157.field2651[var6++] = var314 ? 0 : 1;
                                continue;
                            }
                            if (var514 == 6024) {
                                var6--;
                                int var315 = class157.field2651[var6];
                                if (var315 < 0 || var315 > 2) {
                                    var315 = 0;
                                }
                                class264.field4508 = var315;
                                class166.method1291(arg1 ^ 0x31C2, class232.field3876);
                                continue;
                            }
                            if (var514 == 6028) {
                                var6--;
                                class223.field3720 = class157.field2651[var6] != 0;
                                class166.method1291(-13383, class232.field3876);
                                continue;
                            }
                        } else if (var514 < 6200) {
                            if (var514 == 6101) {
                                class157.field2651[var6++] = class273.field4684;
                                continue;
                            }
                            if (var514 == 6102) {
                                class157.field2651[var6++] = class322.method2236(-7750) ? 1 : 0;
                                continue;
                            }
                            if (var514 == 6103) {
                                class157.field2651[var6++] = class312.field5315 ? 1 : 0;
                                continue;
                            }
                            if (var514 == 6105) {
                                class157.field2651[var6++] = class76.field1230 ? 1 : 0;
                                continue;
                            }
                            if (var514 == 6106) {
                                class157.field2651[var6++] = class319.field5448 ? 1 : 0;
                                continue;
                            }
                            if (var514 == 6107) {
                                class157.field2651[var6++] = class195.field3252 ? 1 : 0;
                                continue;
                            }
                            if (var514 == 6108) {
                                class157.field2651[var6++] = class300.field5078 ? 1 : 0;
                                continue;
                            }
                            if (var514 == 6109) {
                                class157.field2651[var6++] = class160.field2704 ? 1 : 0;
                                continue;
                            }
                            if (var514 == 6110) {
                                class157.field2651[var6++] = class281.field4822 ? 1 : 0;
                                continue;
                            }
                            if (var514 == 6111) {
                                class157.field2651[var6++] = class27.field478;
                                continue;
                            }
                            if (var514 == 6112) {
                                class157.field2651[var6++] = class102.field1641 ? 1 : 0;
                                continue;
                            }
                            if (var514 == 6114) {
                                class157.field2651[var6++] = class117.field1888 ? 1 : 0;
                                continue;
                            }
                            if (var514 == 6115) {
                                class157.field2651[var6++] = class322.field5501 ? 1 : 0;
                                continue;
                            }
                            if (var514 == 6116) {
                                class157.field2651[var6++] = class147.field2502;
                                continue;
                            }
                            if (var514 == 6117) {
                                class157.field2651[var6++] = class119.field1927 ? 1 : 0;
                                continue;
                            }
                            if (var514 == 6118) {
                                class157.field2651[var6++] = class100.field1621;
                                continue;
                            }
                            if (var514 == 6119) {
                                class157.field2651[var6++] = class27.field479;
                                continue;
                            }
                            if (var514 == 6120) {
                                class157.field2651[var6++] = class236.field3936;
                                continue;
                            }
                            if (var514 == 6121) {
                                if (class271.field4640) {
                                    class157.field2651[var6++] = class271.field4658 ? 1 : 0;
                                } else {
                                    class157.field2651[var6++] = 0;
                                }
                                continue;
                            }
                            if (var514 == 6123) {
                                class157.field2651[var6++] = class284.method2049();
                                continue;
                            }
                            if (var514 == 6124) {
                                class157.field2651[var6++] = class264.field4508;
                                continue;
                            }
                            if (var514 == 6128) {
                                class157.field2651[var6++] = class223.field3720 ? 1 : 0;
                                continue;
                            }
                        } else if (var514 < 6300) {
                            if (var514 == 6200) {
                                var6 -= 2;
                                class170.field2873 = (short) class157.field2651[var6];
                                if (class170.field2873 <= 0) {
                                    class170.field2873 = 256;
                                }
                                class139.field2316 = (short) class157.field2651[var6 + 1];
                                if (class139.field2316 <= 0) {
                                    class139.field2316 = 205;
                                }
                                continue;
                            }
                            if (var514 == 6201) {
                                var6 -= 2;
                                class62.field1068 = (short) class157.field2651[var6];
                                if (class62.field1068 <= 0) {
                                    class62.field1068 = 256;
                                }
                                class72.field1171 = (short) class157.field2651[var6 + 1];
                                if (class72.field1171 <= 0) {
                                    class72.field1171 = 320;
                                }
                                continue;
                            }
                            if (var514 == 6202) {
                                var6 -= 4;
                                class187.field3121 = (short) class157.field2651[var6];
                                if (class187.field3121 <= 0) {
                                    class187.field3121 = 1;
                                }
                                class106.field1704 = (short) class157.field2651[var6 + 1];
                                if (class106.field1704 <= 0) {
                                    class106.field1704 = 32767;
                                } else if (class187.field3121 > class106.field1704) {
                                    class106.field1704 = class187.field3121;
                                }
                                class238.field3963 = (short) class157.field2651[var6 + 2];
                                if (class238.field3963 <= 0) {
                                    class238.field3963 = 1;
                                }
                                class116.field1860 = (short) class157.field2651[var6 + 3];
                                if (class116.field1860 <= 0) {
                                    class116.field1860 = 32767;
                                } else if (class116.field1860 < class238.field3963) {
                                    class116.field1860 = class238.field3963;
                                }
                                continue;
                            }
                            if (var514 == 6203) {
                                class124.method854(0, (byte) 67, 0, class207.field3452.field4381, class207.field3452.field4393, false);
                                class157.field2651[var6++] = class43.field734;
                                class157.field2651[var6++] = class294.field4990;
                                continue;
                            }
                            if (var514 == 6204) {
                                class157.field2651[var6++] = class62.field1068;
                                class157.field2651[var6++] = class72.field1171;
                                continue;
                            }
                            if (var514 == 6205) {
                                class157.field2651[var6++] = class170.field2873;
                                class157.field2651[var6++] = class139.field2316;
                                continue;
                            }
                        } else if (var514 < 6400) {
                            if (var514 == 6300) {
                                class157.field2651[var6++] = (int) (class67.method501(-107) / 60000L);
                                continue;
                            }
                            if (var514 == 6301) {
                                class157.field2651[var6++] = (int) (class67.method501(-115) / 86400000L) - 11745;
                                continue;
                            }
                            if (var514 == 6302) {
                                var6 -= 3;
                                int var328 = class157.field2651[var6];
                                int var329 = class157.field2651[var6 + 1];
                                int var330 = class157.field2651[var6 + 2];
                                class11.field226.clear();
                                class11.field226.set(11, 12);
                                class11.field226.set(var330, var329, var328);
                                class157.field2651[var6++] = (int) (class11.field226.getTime().getTime() / 86400000L) - 11745;
                                continue;
                            }
                            if (var514 == 6303) {
                                class11.field226.clear();
                                class11.field226.setTime(new Date(class67.method501(-96)));
                                class157.field2651[var6++] = class11.field226.get(1);
                                continue;
                            }
                            if (var514 == 6304) {
                                var6--;
                                int var331 = class157.field2651[var6];
                                boolean var332 = true;
                                if (var331 < 0) {
                                    var332 = ((var331 + 1) % 4) == 0;
                                } else if (var331 < 1582) {
                                    var332 = var331 % 4 == 0;
                                } else if (var331 % 4 != 0) {
                                    var332 = false;
                                } else if (var331 % 100 != 0) {
                                    var332 = true;
                                } else if (var331 % 400 != 0) {
                                    var332 = false;
                                }
                                class157.field2651[var6++] = var332 ? 1 : 0;
                                continue;
                            }
                        } else if (var514 < 6500) {
                            if (var514 == 6405) {
                                class157.field2651[var6++] = class121.method842(false) ? 1 : 0;
                                continue;
                            }
                            if (var514 == 6406) {
                                class157.field2651[var6++] = class85.method593(69) ? 1 : 0;
                                continue;
                            }
                        } else if (var514 < 6600) {
                            if (var514 == 6500) {
                                if (class238.field3973 == 10 && class22.field412 == 0 && class264.field4515 == 0 && class144.field2390 == 0) {
                                    class157.field2651[var6++] = class196.method1513(92) == -1 ? 0 : 1;
                                    continue;
                                }
                                class157.field2651[var6++] = 1;
                                continue;
                            }
                            if (var514 == 6501) {
                                class228 var316 = class78.method562((byte) -115);
                                if (var316 == null) {
                                    class157.field2651[var6++] = -1;
                                    class157.field2651[var6++] = 0;
                                    class196.field3270[var9++] = class39.field696;
                                    class157.field2651[var6++] = 0;
                                    class196.field3270[var9++] = class39.field696;
                                    class157.field2651[var6++] = 0;
                                } else {
                                    class157.field2651[var6++] = var316.field3806;
                                    class157.field2651[var6++] = var316.field3157;
                                    class196.field3270[var9++] = var316.field3802;
                                    class292 var317 = var316.method1679(2568);
                                    class157.field2651[var6++] = var317.field4964;
                                    class196.field3270[var9++] = var317.field4967;
                                    class157.field2651[var6++] = var316.field3154;
                                }
                                continue;
                            }
                            if (var514 == 6502) {
                                class228 var318 = class92.method632((byte) -67);
                                if (var318 == null) {
                                    class157.field2651[var6++] = -1;
                                    class157.field2651[var6++] = 0;
                                    class196.field3270[var9++] = class39.field696;
                                    class157.field2651[var6++] = 0;
                                    class196.field3270[var9++] = class39.field696;
                                    class157.field2651[var6++] = 0;
                                } else {
                                    class157.field2651[var6++] = var318.field3806;
                                    class157.field2651[var6++] = var318.field3157;
                                    class196.field3270[var9++] = var318.field3802;
                                    class292 var319 = var318.method1679(2568);
                                    class157.field2651[var6++] = var319.field4964;
                                    class196.field3270[var9++] = var319.field4967;
                                    class157.field2651[var6++] = var318.field3154;
                                }
                                continue;
                            }
                            if (var514 == 6503) {
                                var6--;
                                int var320 = class157.field2651[var6];
                                if (class238.field3973 == 10 && class22.field412 == 0 && class264.field4515 == 0 && class144.field2390 == 0) {
                                    class157.field2651[var6++] = class300.method2117(var320, -1) ? 1 : 0;
                                    continue;
                                }
                                class157.field2651[var6++] = 0;
                                continue;
                            }
                            if (var514 == 6504) {
                                var6--;
                                class89.field1422 = class157.field2651[var6];
                                class166.method1291(arg1 - 11970, class232.field3876);
                                continue;
                            }
                            if (var514 == 6505) {
                                class157.field2651[var6++] = class89.field1422;
                                continue;
                            }
                            if (var514 == 6506) {
                                var6--;
                                int var321 = class157.field2651[var6];
                                class228 var322 = class265.method1924(var321, (byte) -80);
                                if (var322 == null) {
                                    class157.field2651[var6++] = -1;
                                    class196.field3270[var9++] = class39.field696;
                                    class157.field2651[var6++] = 0;
                                    class196.field3270[var9++] = class39.field696;
                                    class157.field2651[var6++] = 0;
                                } else {
                                    class157.field2651[var6++] = var322.field3157;
                                    class196.field3270[var9++] = var322.field3802;
                                    class292 var323 = var322.method1679(2568);
                                    class157.field2651[var6++] = var323.field4964;
                                    class196.field3270[var9++] = var323.field4967;
                                    class157.field2651[var6++] = var322.field3154;
                                }
                                continue;
                            }
                            if (var514 == 6507) {
                                var6 -= 4;
                                boolean var324 = class157.field2651[var6 + 1] == 1;
                                int var325 = class157.field2651[var6];
                                boolean var326 = class157.field2651[var6 + 3] == 1;
                                int var327 = class157.field2651[var6 + 2];
                                class251.method1838(var326, (byte) 117, var327, var325, var324);
                                continue;
                            }
                        } else if (var514 < 6700) {
                            if (var514 == 6600) {
                                var6--;
                                class215.field3549 = class157.field2651[var6] == 1;
                                class166.method1291(-13383, class232.field3876);
                                continue;
                            }
                            if (var514 == 6601) {
                                class157.field2651[var6++] = class215.field3549 ? 1 : 0;
                                continue;
                            }
                        }
                    } else if (var514 == 4400) {
                        var6 -= 2;
                        int var424 = class157.field2651[var6 + 1];
                        int var425 = class157.field2651[var6];
                        class319 var426 = class229.method1686(false, var424);
                        if (var426.method2220((byte) 119)) {
                            class196.field3270[var9++] = class112.method756((byte) 124, var425).method29((byte) 72, var426.field5460, var424);
                        } else {
                            class157.field2651[var6++] = class112.method756((byte) 34, var425).method31(var424, (byte) 75, var426.field5449);
                        }
                        continue;
                    }
                } else {
                    class264 var490;
                    if (var514 >= 2000) {
                        var6--;
                        var490 = class98.method680(class157.field2651[var6], false);
                        var514 -= 1000;
                    } else {
                        var490 = var46 ? class171.field2887 : class301.field5151;
                    }
                    if (var514 == 1300) {
                        var6--;
                        int var491 = class157.field2651[var6] - 1;
                        if (var491 >= 0 && var491 <= 9) {
                            var9--;
                            var490.method1914((byte) -112, var491, class196.field3270[var9]);
                            continue;
                        }
                        var9--;
                        continue;
                    }
                    if (var514 == 1301) {
                        var6 -= 2;
                        int var492 = class157.field2651[var6];
                        int var493 = class157.field2651[var6 + 1];
                        var490.field4464 = class165.method1289(var492, true, var493);
                        continue;
                    }
                    if (var514 == 1302) {
                        var6--;
                        var490.field4401 = class157.field2651[var6] == 1;
                        continue;
                    }
                    if (var514 == 1303) {
                        var6--;
                        var490.field4382 = class157.field2651[var6];
                        continue;
                    }
                    if (var514 == 1304) {
                        var6--;
                        var490.field4416 = class157.field2651[var6];
                        continue;
                    }
                    if (var514 == 1305) {
                        var9--;
                        var490.field4466 = class196.field3270[var9];
                        continue;
                    }
                    if (var514 == 1306) {
                        var9--;
                        var490.field4509 = class196.field3270[var9];
                        continue;
                    }
                    if (var514 == 1307) {
                        var490.field4485 = null;
                        continue;
                    }
                    if (var514 == 1309) {
                        var6--;
                        int var494 = class157.field2651[var6];
                        var6--;
                        int var495 = class157.field2651[var6];
                        if (var495 >= 1 && var495 <= 10) {
                            var490.method1908(var494, arg1 ^ 0xFFFFFA22, var495 - 1);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var513) {
            if (var5.field4848 == null) {
                if (class22.field408 != 0) {
                    class316.method2209(false, class276.field4746, 0, class39.field696);
                }
                class245.method1771(var513, "CS2 - scr:" + var5.field2883 + " op:" + var11, 0);
            } else {
                class146 var509 = class114.method776(-102, 30);
                var509.method1082(class80.field1283, false).method1082(var5.field4848, false);
                for (int var510 = class242.field4029 - 1; var510 >= 0; var510--) {
                    var509.method1082(class44.field760, false).method1082(class227.field3784[var510].field573.field4848, false);
                }
                if (var11 == 40) {
                    int var511 = var10[var7];
                    var509.method1082(class298.field5065, false).method1082(class82.method585(arg1 + 16157, var511), false);
                }
                if (class22.field408 != 0) {
                    class316.method2209(false, class112.method758(-5, new class146[] { class215.field3550, var5.field4848 }), 0, class39.field696);
                }
                class245.method1771(var513, "CS2 - scr:" + var5.field2883 + " op:" + var11 + new String(var509.method1128(false)), 0);
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIB)I", line = 6382)
    private final int method547(int arg0, int arg1, byte arg2) {
        field1204++;
        int var4 = arg0 * 57 + arg1;
        int var5 = var4 << 1 ^ var4;
        int var6 = 45 % ((arg2) / 40);
        return 4096 - ((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144);
    }
}
