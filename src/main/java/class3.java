import java.math.BigInteger;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class3 {

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    private int field18 = -1;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    private int field22 = 0;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "Lci;")
    private class327 field23 = new class327();

    @OriginalMember(owner = "client!el", name = "o", descriptor = "Z")
    public boolean field30 = false;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    private int field27;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    private int field16;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "[[[I")
    private int[][][] field28;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "[Lil;")
    private class295[] field21;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "Z")
    public static boolean field24 = false;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field20 = 0;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field19 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!el", name = "u", descriptor = "Z")
    public static boolean field36 = true;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "[I")
    public static int[] field37 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field29;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "Lth;")
    public static class57 field17;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)[[[I", line = 5)
    public final int[][][] method8(int arg0) {
        field26++;
        if (this.field27 != this.field16) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field27; var2++) {
            this.field21[var2] = class316.field5043;
        }
        if (arg0 != 8914) {
            this.method10((byte) 73, 28);
        }
        return this.field28;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IZ)V", line = 27)
    public static final void method9(int arg0, boolean arg1) {
        if (class280.field4600 == null || arg0 > class280.field4600.length) {
            class280.field4600 = new int[arg0];
        }
        if (arg1) {
            field35++;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)[[I", line = 51)
    public final int[][] method10(byte arg0, int arg1) {
        if (arg0 > -103) {
            method15(-19, 93);
        }
        field33++;
        if (this.field27 == this.field16) {
            this.field30 = this.field21[arg1] == null;
            this.field21[arg1] = class316.field5043;
            return this.field28[arg1];
        } else if (this.field27 == 1) {
            this.field30 = this.field18 != arg1;
            this.field18 = arg1;
            return this.field28[0];
        } else {
            class295 var3 = this.field21[arg1];
            if (var3 == null) {
                this.field30 = true;
                if (this.field27 > this.field22) {
                    var3 = new class295(arg1, this.field22);
                    this.field22++;
                } else {
                    class295 var4 = (class295) this.field23.method2311(true);
                    var3 = new class295(arg1, var4.field4748);
                    this.field21[var4.field4751] = null;
                    var4.method330(15);
                }
                this.field21[arg1] = var3;
            } else {
                this.field30 = false;
            }
            this.field23.method2299(false, var3);
            return this.field28[var3.field4748];
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(III)V", line = 6969)
    public class3(int arg0, int arg1, int arg2) {
        this.field27 = arg0;
        this.field16 = arg1;
        this.field28 = new int[this.field27][3][arg2];
        this.field21 = new class295[this.field16];
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V", line = 126)
    public static final void method11(byte arg0) {
        field25++;
        if (arg0 != 88) {
            field19 = (BigInteger) null;
        }
        if (class145.field2349.toLowerCase().indexOf("microsoft") != -1) {
            class342.field5459[191] = 73;
            class342.field5459[190] = 72;
            class342.field5459[220] = 74;
            class342.field5459[223] = 28;
            class342.field5459[189] = 26;
            class342.field5459[192] = 58;
            class342.field5459[219] = 42;
            class342.field5459[222] = 59;
            class342.field5459[187] = 27;
            class342.field5459[188] = 71;
            class342.field5459[221] = 43;
            class342.field5459[186] = 57;
            return;
        }
        class342.field5459[93] = 43;
        class342.field5459[61] = 27;
        class342.field5459[91] = 42;
        class342.field5459[47] = 73;
        class342.field5459[59] = 57;
        if (class145.field2361 == null) {
            class342.field5459[192] = 58;
            class342.field5459[222] = 59;
        } else {
            class342.field5459[520] = 59;
            class342.field5459[222] = 58;
            class342.field5459[192] = 28;
        }
        class342.field5459[46] = 72;
        class342.field5459[45] = 26;
        class342.field5459[44] = 71;
        class342.field5459[92] = 74;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V", line = 176)
    public static void method12(int arg0) {
        field37 = null;
        if (arg0 != 28081) {
            field37 = (int[]) null;
        }
        field19 = null;
        field17 = null;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V", line = 189)
    public final void method13(int arg0) {
        field31++;
        for (int var2 = arg0; var2 < this.field27; var2++) {
            this.field28[var2][0] = null;
            this.field28[var2][1] = null;
            this.field28[var2][2] = null;
            this.field28[var2] = (int[][]) null;
        }
        this.field28 = (int[][][]) null;
        this.field21 = null;
        this.field23.method2301(-23);
        this.field23 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V", line = 216)
    public static final void method14(int arg0, int arg1, int arg2) {
        class321 var3 = class46.method370(arg1, (byte) -106, arg0);
        var3.method2265(false);
        var3.field5112 = arg2;
        field34++;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)V", line = 233)
    public static final void method15(int arg0, int arg1) {
        if (arg1 == 10) {
            class187.field3003.method2334(arg1 ^ 0xE, arg0);
            field29++;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Leb;II)V", line = 257)
    public static final void method16(class6 arg0, int arg1, int arg2) {
        class247.field4044 = 0;
        field32++;
        int var3 = 0;
        int var4 = -50 % ((arg2 + 72) / 33);
        int var5 = 0;
        int[] var6 = arg0.field45;
        byte var7 = -1;
        int var8 = -1;
        int[] var9 = arg0.field44;
        try {
            int var10 = 0;
            label4564: while (true) {
                var10++;
                if (var10 > arg1) {
                    throw new RuntimeException("slow");
                }
                var8++;
                int var550 = var6[var8];
                if (var550 < 100) {
                    if (var550 == 0) {
                        class63.field1126[var5++] = var9[var8];
                        continue;
                    }
                    if (var550 == 1) {
                        int var11 = var9[var8];
                        class63.field1126[var5++] = class66.field1178[var11];
                        continue;
                    }
                    if (var550 == 2) {
                        int var12 = var9[var8];
                        var5--;
                        class248.method1910(class63.field1126[var5], var12, (byte) -111);
                        continue;
                    }
                    if (var550 == 3) {
                        class340.field5429[var3++] = arg0.field50[var8];
                        continue;
                    }
                    if (var550 == 6) {
                        var8 += var9[var8];
                        continue;
                    }
                    if (var550 == 7) {
                        var5 -= 2;
                        if (class63.field1126[var5 + 1] != class63.field1126[var5]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var550 == 8) {
                        var5 -= 2;
                        if (class63.field1126[var5 + 1] == class63.field1126[var5]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var550 == 9) {
                        var5 -= 2;
                        if (class63.field1126[var5] < class63.field1126[var5 + 1]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var550 == 10) {
                        var5 -= 2;
                        if (class63.field1126[var5] > class63.field1126[var5 + 1]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var550 == 21) {
                        if (class247.field4044 == 0) {
                            return;
                        }
                        class319 var13 = class326.field5189[--class247.field4044];
                        class39.field576 = var13.field5076;
                        var8 = var13.field5077;
                        class191.field3056 = var13.field5087;
                        arg0 = var13.field5079;
                        var6 = arg0.field45;
                        var9 = arg0.field44;
                        continue;
                    }
                    if (var550 == 25) {
                        int var14 = var9[var8];
                        class63.field1126[var5++] = class106.method820(var14, (byte) -55);
                        continue;
                    }
                    if (var550 == 27) {
                        int var15 = var9[var8];
                        var5--;
                        class83.method672(92, class63.field1126[var5], var15);
                        continue;
                    }
                    if (var550 == 31) {
                        var5 -= 2;
                        if (class63.field1126[var5] <= class63.field1126[var5 + 1]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var550 == 32) {
                        var5 -= 2;
                        if (class63.field1126[var5 + 1] <= class63.field1126[var5]) {
                            var8 += var9[var8];
                        }
                        continue;
                    }
                    if (var550 == 33) {
                        class63.field1126[var5++] = class191.field3056[var9[var8]];
                        continue;
                    }
                    int var10001;
                    if (var550 == 34) {
                        var10001 = var9[var8];
                        var5--;
                        class191.field3056[var10001] = class63.field1126[var5];
                        continue;
                    }
                    if (var550 == 35) {
                        class340.field5429[var3++] = class39.field576[var9[var8]];
                        continue;
                    }
                    if (var550 == 36) {
                        var10001 = var9[var8];
                        var3--;
                        class39.field576[var10001] = class340.field5429[var3];
                        continue;
                    }
                    if (var550 == 37) {
                        int var16 = var9[var8];
                        var3 -= var16;
                        String var17 = class93.method731(-120, class340.field5429, var16, var3);
                        class340.field5429[var3++] = var17;
                        continue;
                    }
                    if (var550 == 38) {
                        var5--;
                        continue;
                    }
                    if (var550 == 39) {
                        var3--;
                        continue;
                    }
                    if (var550 == 40) {
                        int var18 = var9[var8];
                        class6 var19 = class194.method1504(var18, 120);
                        int[] var20 = new int[var19.field56];
                        String[] var21 = new String[var19.field57];
                        for (int var22 = 0; var22 < var19.field49; var22++) {
                            var20[var22] = class63.field1126[var5 + var22 - var19.field49];
                        }
                        for (int var23 = 0; var23 < var19.field59; var23++) {
                            var21[var23] = class340.field5429[var23 + var3 - var19.field59];
                        }
                        var3 -= var19.field59;
                        var5 -= var19.field49;
                        class319 var24 = new class319();
                        var24.field5076 = class39.field576;
                        var24.field5077 = var8;
                        var24.field5079 = arg0;
                        var24.field5087 = class191.field3056;
                        if (class247.field4044 >= class326.field5189.length) {
                            throw new RuntimeException();
                        }
                        var8 = -1;
                        class326.field5189[class247.field4044++] = var24;
                        class191.field3056 = var20;
                        class39.field576 = var21;
                        arg0 = var19;
                        var9 = var19.field44;
                        var6 = var19.field45;
                        continue;
                    }
                    if (var550 == 42) {
                        class63.field1126[var5++] = class113.field1854[var9[var8]];
                        continue;
                    }
                    if (var550 == 43) {
                        int var25 = var9[var8];
                        var5--;
                        class113.field1854[var25] = class63.field1126[var5];
                        class48.method378(var25, 91);
                        continue;
                    }
                    if (var550 == 44) {
                        int var26 = var9[var8] >> 16;
                        int var27 = var9[var8] & 0xFFFF;
                        var5--;
                        int var28 = class63.field1126[var5];
                        if (var28 >= 0 && var28 <= 5000) {
                            byte var29 = -1;
                            if (var27 == 105) {
                                var29 = 0;
                            }
                            class309.field4930[var26] = var28;
                            int var30 = 0;
                            while (true) {
                                if (var30 >= var28) {
                                    continue label4564;
                                }
                                class301.field4844[var26][var30] = var29;
                                var30++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var550 == 45) {
                        int var31 = var9[var8];
                        var5--;
                        int var32 = class63.field1126[var5];
                        if (var32 >= 0 && class309.field4930[var31] > var32) {
                            class63.field1126[var5++] = class301.field4844[var31][var32];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var550 == 46) {
                        int var33 = var9[var8];
                        var5 -= 2;
                        int var34 = class63.field1126[var5];
                        if (var34 >= 0 && class309.field4930[var33] > var34) {
                            class301.field4844[var33][var34] = class63.field1126[var5 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var550 == 47) {
                        String var35 = class327.field5202[var9[var8]];
                        if (var35 == null) {
                            var35 = "null";
                        }
                        class340.field5429[var3++] = var35;
                        continue;
                    }
                    if (var550 == 48) {
                        int var36 = var9[var8];
                        var3--;
                        class327.field5202[var36] = class340.field5429[var3];
                        class77.method640(-98, var36);
                        continue;
                    }
                    if (var550 == 51) {
                        class164 var37 = arg0.field53[var9[var8]];
                        var5--;
                        class301 var38 = (class301) var37.method1268(119, (long) class63.field1126[var5]);
                        if (var38 != null) {
                            var8 += var38.field4846;
                        }
                        continue;
                    }
                }
                boolean var39;
                if (var9[var8] == 1) {
                    var39 = true;
                } else {
                    var39 = false;
                }
                if (var550 < 300) {
                    if (var550 == 100) {
                        var5 -= 3;
                        int var40 = class63.field1126[var5];
                        int var41 = class63.field1126[var5 + 1];
                        int var42 = class63.field1126[var5 + 2];
                        if (var41 == 0) {
                            throw new RuntimeException();
                        }
                        class250 var43 = class13.method74(-108, var40);
                        if (var43.field4171 == null) {
                            var43.field4171 = new class250[var42 + 1];
                        }
                        if (var42 >= var43.field4171.length) {
                            class250[] var44 = new class250[var42 + 1];
                            for (int var45 = 0; var45 < var43.field4171.length; var45++) {
                                var44[var45] = var43.field4171[var45];
                            }
                            var43.field4171 = var44;
                        }
                        if (var42 > 0 && var43.field4171[var42 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var42 - 1));
                        }
                        class250 var46 = new class250();
                        var46.field4086 = var46.field4167 = var43.field4167;
                        var46.field4078 = var41;
                        var46.field4229 = var42;
                        var46.field4205 = true;
                        var43.field4171[var42] = var46;
                        if (var39) {
                            class278.field4578 = var46;
                        } else {
                            class36.field519 = var46;
                        }
                        class205.method1568(var43, (byte) 119);
                        continue;
                    }
                    if (var550 == 101) {
                        class250 var47 = var39 ? class278.field4578 : class36.field519;
                        if (var47.field4229 == -1) {
                            if (var39) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class250 var48 = class13.method74(-97, var47.field4167);
                        var48.field4171[var47.field4229] = null;
                        class205.method1568(var48, (byte) 118);
                        continue;
                    }
                    if (var550 == 102) {
                        var5--;
                        class250 var49 = class13.method74(-102, class63.field1126[var5]);
                        var49.field4171 = null;
                        class205.method1568(var49, (byte) 120);
                        continue;
                    }
                    if (var550 == 200) {
                        var5 -= 2;
                        int var50 = class63.field1126[var5];
                        int var51 = class63.field1126[var5 + 1];
                        class250 var52 = class25.method165(var51, var50, 24836);
                        if (var52 != null && var51 != -1) {
                            class63.field1126[var5++] = 1;
                            if (var39) {
                                class278.field4578 = var52;
                            } else {
                                class36.field519 = var52;
                            }
                            continue;
                        }
                        class63.field1126[var5++] = 0;
                        continue;
                    }
                    if (var550 == 201) {
                        var5--;
                        int var53 = class63.field1126[var5];
                        class250 var54 = class13.method74(-44, var53);
                        if (var54 == null) {
                            class63.field1126[var5++] = 0;
                        } else {
                            class63.field1126[var5++] = 1;
                            if (var39) {
                                class278.field4578 = var54;
                            } else {
                                class36.field519 = var54;
                            }
                        }
                        continue;
                    }
                } else if (var550 < 500) {
                    if (var550 == 403) {
                        var5 -= 2;
                        int var55 = class63.field1126[var5];
                        int var56 = class63.field1126[var5 + 1];
                        for (int var57 = 0; var57 < class134.field2252.length; var57++) {
                            if (class134.field2252[var57] == var55) {
                                class6.field55.field4316.method903((byte) -121, var56, var57);
                                continue label4564;
                            }
                        }
                        int var58 = 0;
                        while (true) {
                            if (class166.field2654.length <= var58) {
                                continue label4564;
                            }
                            if (class166.field2654[var58] == var55) {
                                class6.field55.field4316.method903((byte) 47, var56, var58);
                                continue label4564;
                            }
                            var58++;
                        }
                    }
                    if (var550 == 404) {
                        var5 -= 2;
                        int var59 = class63.field1126[var5];
                        int var60 = class63.field1126[var5 + 1];
                        class6.field55.field4316.method902(var60, true, var59);
                        continue;
                    }
                    if (var550 == 410) {
                        var5--;
                        boolean var61 = class63.field1126[var5] != 0;
                        class6.field55.field4316.method906(var61, (byte) -50);
                        continue;
                    }
                } else if (var550 >= 1000 && var550 < 1100 || var550 >= 2000 && var550 < 2100) {
                    class250 var62;
                    if (var550 >= 2000) {
                        var550 -= 1000;
                        var5--;
                        var62 = class13.method74(-15, class63.field1126[var5]);
                    } else {
                        var62 = var39 ? class278.field4578 : class36.field519;
                    }
                    if (var550 == 1000) {
                        var5 -= 4;
                        var62.field4192 = class63.field1126[var5];
                        var62.field4132 = class63.field1126[var5 + 1];
                        int var63 = class63.field1126[var5 + 3];
                        int var64 = class63.field1126[var5 + 2];
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 5) {
                            var63 = 5;
                        }
                        var62.field4137 = (byte) var63;
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 5) {
                            var64 = 5;
                        }
                        var62.field4234 = (byte) var64;
                        class205.method1568(var62, (byte) 117);
                        class36.method244(var62, (byte) 99);
                        if (var62.field4229 == -1) {
                            class52.method415(16726, var62.field4167);
                        }
                        continue;
                    }
                    if (var550 == 1001) {
                        var5 -= 4;
                        var62.field4200 = class63.field1126[var5];
                        var62.field4113 = class63.field1126[var5 + 1];
                        var62.field4127 = 0;
                        var62.field4070 = 0;
                        int var65 = class63.field1126[var5 + 2];
                        int var66 = class63.field1126[var5 + 3];
                        if (var65 < 0) {
                            var65 = 0;
                        } else if (var65 > 4) {
                            var65 = 4;
                        }
                        var62.field4206 = (byte) var65;
                        if (var66 < 0) {
                            var66 = 0;
                        } else if (var66 > 4) {
                            var66 = 4;
                        }
                        var62.field4202 = (byte) var66;
                        class205.method1568(var62, (byte) 115);
                        class36.method244(var62, (byte) 118);
                        if (var62.field4078 == 0) {
                            class278.method2057(var62, false, -121);
                        }
                        continue;
                    }
                    if (var550 == 1003) {
                        var5--;
                        boolean var67 = class63.field1126[var5] == 1;
                        if (var62.field4130 != var67) {
                            var62.field4130 = var67;
                            class205.method1568(var62, (byte) 116);
                        }
                        if (var62.field4229 == -1) {
                            class195.method1509(255, var62.field4167);
                        }
                        continue;
                    }
                    if (var550 == 1004) {
                        var5 -= 2;
                        var62.field4226 = class63.field1126[var5];
                        var62.field4215 = class63.field1126[var5 + 1];
                        class205.method1568(var62, (byte) 118);
                        class36.method244(var62, (byte) 89);
                        if (var62.field4078 == 0) {
                            class278.method2057(var62, false, -125);
                        }
                        continue;
                    }
                    if (var550 == 1005) {
                        var5--;
                        var62.field4145 = class63.field1126[var5] == 1;
                        continue;
                    }
                } else if (var550 >= 1100 && var550 < 1200 || var550 >= 2100 && var550 < 2200) {
                    class250 var68;
                    if (var550 >= 2000) {
                        var5--;
                        var68 = class13.method74(-47, class63.field1126[var5]);
                        var550 -= 1000;
                    } else {
                        var68 = var39 ? class278.field4578 : class36.field519;
                    }
                    if (var550 == 1100) {
                        var5 -= 2;
                        var68.field4225 = class63.field1126[var5];
                        if (var68.field4225 > (var68.field4211 - var68.field4081)) {
                            var68.field4225 = var68.field4211 - var68.field4081;
                        }
                        if (var68.field4225 < 0) {
                            var68.field4225 = 0;
                        }
                        var68.field4120 = class63.field1126[var5 + 1];
                        if (var68.field4120 > var68.field4201 - var68.field4157) {
                            var68.field4120 = var68.field4201 - var68.field4157;
                        }
                        if (var68.field4120 < 0) {
                            var68.field4120 = 0;
                        }
                        class205.method1568(var68, (byte) 125);
                        if (var68.field4229 == -1) {
                            class13.method72(var68.field4167, -1);
                        }
                        continue;
                    }
                    if (var550 == 1101) {
                        var5--;
                        var68.field4068 = class63.field1126[var5];
                        class205.method1568(var68, (byte) 122);
                        if (var68.field4229 == -1) {
                            class323.method2278((byte) 87, var68.field4167);
                        }
                        continue;
                    }
                    if (var550 == 1102) {
                        var5--;
                        var68.field4061 = class63.field1126[var5] == 1;
                        class205.method1568(var68, (byte) 126);
                        continue;
                    }
                    if (var550 == 1103) {
                        var5--;
                        var68.field4087 = class63.field1126[var5];
                        class205.method1568(var68, (byte) 125);
                        continue;
                    }
                    if (var550 == 1104) {
                        var5--;
                        var68.field4210 = class63.field1126[var5];
                        class205.method1568(var68, (byte) 124);
                        continue;
                    }
                    if (var550 == 1105) {
                        var5--;
                        int var69 = class63.field1126[var5];
                        if (var68.field4178 != var69) {
                            var68.field4178 = var69;
                            class205.method1568(var68, (byte) 124);
                        }
                        if (var68.field4229 == -1) {
                            class65.method564(var68.field4167, -13017);
                        }
                        continue;
                    }
                    if (var550 == 1106) {
                        var5--;
                        var68.field4122 = class63.field1126[var5];
                        class205.method1568(var68, (byte) 117);
                        continue;
                    }
                    if (var550 == 1107) {
                        var5--;
                        var68.field4124 = class63.field1126[var5] == 1;
                        class205.method1568(var68, (byte) 115);
                        continue;
                    }
                    if (var550 == 1108) {
                        var68.field4197 = 1;
                        var5--;
                        var68.field4238 = class63.field1126[var5];
                        class205.method1568(var68, (byte) 120);
                        if (var68.field4229 == -1) {
                            class350.method2466((byte) 83, var68.field4167);
                        }
                        continue;
                    }
                    if (var550 == 1109) {
                        var5 -= 6;
                        var68.field4172 = class63.field1126[var5];
                        var68.field4174 = class63.field1126[var5 + 1];
                        var68.field4084 = class63.field1126[var5 + 2];
                        var68.field4139 = class63.field1126[var5 + 3];
                        var68.field4085 = class63.field1126[var5 + 4];
                        var68.field4240 = class63.field1126[var5 + 5];
                        class205.method1568(var68, (byte) 115);
                        if (var68.field4229 == -1) {
                            class336.method2344((byte) 110, var68.field4167);
                            class254.method1964(var68.field4167, -124);
                        }
                        continue;
                    }
                    if (var550 == 1110) {
                        var5--;
                        int var70 = class63.field1126[var5];
                        if (var68.field4063 != var70) {
                            var68.field4114 = 0;
                            var68.field4063 = var70;
                            var68.field4116 = 0;
                            var68.field4135 = 1;
                            class205.method1568(var68, (byte) 125);
                        }
                        if (var68.field4229 == -1) {
                            class44.method328(var68.field4167, 120);
                        }
                        continue;
                    }
                    if (var550 == 1111) {
                        var5--;
                        var68.field4064 = class63.field1126[var5] == 1;
                        class205.method1568(var68, (byte) 121);
                        continue;
                    }
                    if (var550 == 1112) {
                        var3--;
                        String var71 = class340.field5429[var3];
                        if (!var71.equals(var68.field4168)) {
                            var68.field4168 = var71;
                            class205.method1568(var68, (byte) 115);
                        }
                        if (var68.field4229 == -1) {
                            class318.method2248((byte) 114, var68.field4167);
                        }
                        continue;
                    }
                    if (var550 == 1113) {
                        var5--;
                        var68.field4067 = class63.field1126[var5];
                        class205.method1568(var68, (byte) 115);
                        continue;
                    }
                    if (var550 == 1114) {
                        var5 -= 3;
                        var68.field4123 = class63.field1126[var5];
                        var68.field4209 = class63.field1126[var5 + 1];
                        var68.field4126 = class63.field1126[var5 + 2];
                        class205.method1568(var68, (byte) 122);
                        continue;
                    }
                    if (var550 == 1115) {
                        var5--;
                        var68.field4185 = class63.field1126[var5] == 1;
                        class205.method1568(var68, (byte) 115);
                        continue;
                    }
                    if (var550 == 1116) {
                        var5--;
                        var68.field4224 = class63.field1126[var5];
                        class205.method1568(var68, (byte) 125);
                        continue;
                    }
                    if (var550 == 1117) {
                        var5--;
                        var68.field4125 = class63.field1126[var5];
                        class205.method1568(var68, (byte) 127);
                        continue;
                    }
                    if (var550 == 1118) {
                        var5--;
                        var68.field4138 = class63.field1126[var5] == 1;
                        class205.method1568(var68, (byte) 121);
                        continue;
                    }
                    if (var550 == 1119) {
                        var5--;
                        var68.field4221 = class63.field1126[var5] == 1;
                        class205.method1568(var68, (byte) 125);
                        continue;
                    }
                    if (var550 == 1120) {
                        var5 -= 2;
                        var68.field4211 = class63.field1126[var5];
                        var68.field4201 = class63.field1126[var5 + 1];
                        class205.method1568(var68, (byte) 126);
                        if (var68.field4078 == 0) {
                            class278.method2057(var68, false, -123);
                        }
                        continue;
                    }
                    if (var550 == 1121) {
                        var5 -= 2;
                        var68.field4152 = (short) class63.field1126[var5];
                        var68.field4121 = (short) class63.field1126[var5 + 1];
                        class205.method1568(var68, (byte) 126);
                        continue;
                    }
                    if (var550 == 1122) {
                        var5--;
                        var68.field4179 = class63.field1126[var5] == 1;
                        class205.method1568(var68, (byte) 127);
                        continue;
                    }
                    if (var550 == 1123) {
                        var5--;
                        var68.field4240 = class63.field1126[var5];
                        class205.method1568(var68, (byte) 121);
                        if (var68.field4229 == -1) {
                            class336.method2344((byte) 110, var68.field4167);
                        }
                        continue;
                    }
                    if (var550 == 1124) {
                        var5--;
                        int var72 = class63.field1126[var5];
                        var68.field4092 = var72 == 1;
                        class205.method1568(var68, (byte) 118);
                        continue;
                    }
                } else if (!(var550 < 1200 || var550 >= 1300) || !(var550 < 2200 || var550 >= 2300)) {
                    class250 var541;
                    if (var550 < 2000) {
                        var541 = var39 ? class278.field4578 : class36.field519;
                    } else {
                        var5--;
                        var541 = class13.method74(-65, class63.field1126[var5]);
                        var550 -= 1000;
                    }
                    class205.method1568(var541, (byte) 118);
                    if (var550 == 1200 || var550 == 1205 || var550 == 1208 || var550 == 1209) {
                        var5 -= 2;
                        int var542 = class63.field1126[var5];
                        int var543 = class63.field1126[var5 + 1];
                        if (var541.field4229 == -1) {
                            class291.method2106(7047, var541.field4167);
                            class336.method2344((byte) 110, var541.field4167);
                            class254.method1964(var541.field4167, 37);
                        }
                        if (var542 == -1) {
                            var541.field4231 = -1;
                            var541.field4197 = 1;
                            var541.field4238 = -1;
                            continue;
                        }
                        var541.field4231 = var542;
                        var541.field4176 = var543;
                        if (var550 == 1208 || var550 == 1209) {
                            var541.field4193 = true;
                        } else {
                            var541.field4193 = false;
                        }
                        class52 var544 = class6.method22(var542, 16430);
                        if (var550 == 1205) {
                            var541.field4187 = false;
                        } else {
                            var541.field4187 = true;
                        }
                        var541.field4084 = var544.field859;
                        var541.field4172 = var544.field870;
                        var541.field4085 = var544.field841;
                        var541.field4174 = var544.field827;
                        var541.field4240 = var544.field844;
                        if (var541.field4070 > 0) {
                            var541.field4240 = var541.field4240 * 32 / var541.field4070;
                        } else if (var541.field4200 > 0) {
                            var541.field4240 = var541.field4240 * 32 / var541.field4200;
                        }
                        var541.field4139 = var544.field840;
                        continue;
                    }
                    if (var550 == 1201) {
                        var541.field4197 = 2;
                        var5--;
                        var541.field4238 = class63.field1126[var5];
                        if (var541.field4229 == -1) {
                            class350.method2466((byte) 83, var541.field4167);
                        }
                        continue;
                    }
                    if (var550 == 1202) {
                        var541.field4197 = 3;
                        var541.field4238 = class6.field55.field4316.method907(1073741824);
                        if (var541.field4229 == -1) {
                            class350.method2466((byte) 83, var541.field4167);
                        }
                        continue;
                    }
                    if (var550 == 1203) {
                        var541.field4197 = 6;
                        var5--;
                        var541.field4238 = class63.field1126[var5];
                        if (var541.field4229 == -1) {
                            class350.method2466((byte) 83, var541.field4167);
                        }
                        continue;
                    }
                    if (var550 == 1204) {
                        var541.field4197 = 5;
                        var5--;
                        var541.field4238 = class63.field1126[var5];
                        if (var541.field4229 == -1) {
                            class350.method2466((byte) 83, var541.field4167);
                        }
                        continue;
                    }
                    if (var550 == 1206) {
                        var5 -= 4;
                        var541.field4106 = class63.field1126[var5];
                        var541.field4128 = class63.field1126[var5 + 1];
                        var541.field4079 = class63.field1126[var5 + 2];
                        var541.field4156 = class63.field1126[var5 + 3];
                        class205.method1568(var541, (byte) 121);
                        continue;
                    }
                    if (var550 == 1207) {
                        var5 -= 2;
                        var541.field4083 = class63.field1126[var5];
                        var541.field4109 = class63.field1126[var5 + 1];
                        class205.method1568(var541, (byte) 115);
                        continue;
                    }
                    if (var550 == 1211) {
                        var541.field4222 = 0;
                        var541.field4238 = 2047;
                        var541.field4197 = 5;
                        if (var541.field4229 == -1) {
                            class350.method2466((byte) 83, var541.field4167);
                        }
                        continue;
                    }
                } else if (var550 >= 1300 && var550 < 1400 || var550 >= 2300 && var550 < 2400) {
                    class250 var73;
                    if (var550 >= 2000) {
                        var550 -= 1000;
                        var5--;
                        var73 = class13.method74(-14, class63.field1126[var5]);
                    } else {
                        var73 = var39 ? class278.field4578 : class36.field519;
                    }
                    if (var550 == 1300) {
                        var5--;
                        int var74 = class63.field1126[var5] - 1;
                        if (var74 >= 0 && var74 <= 9) {
                            var3--;
                            var73.method1936(class340.field5429[var3], var74, 20364);
                            continue;
                        }
                        var3--;
                        continue;
                    }
                    if (var550 == 1301) {
                        var5 -= 2;
                        int var75 = class63.field1126[var5 + 1];
                        int var76 = class63.field1126[var5];
                        var73.field4077 = class25.method165(var75, var76, 24836);
                        continue;
                    }
                    if (var550 == 1302) {
                        var5--;
                        var73.field4091 = class63.field1126[var5] == 1;
                        continue;
                    }
                    if (var550 == 1303) {
                        var5--;
                        var73.field4183 = class63.field1126[var5];
                        continue;
                    }
                    if (var550 == 1304) {
                        var5--;
                        var73.field4149 = class63.field1126[var5];
                        continue;
                    }
                    if (var550 == 1305) {
                        var3--;
                        var73.field4074 = class340.field5429[var3];
                        continue;
                    }
                    if (var550 == 1306) {
                        var3--;
                        var73.field4089 = class340.field5429[var3];
                        continue;
                    }
                    if (var550 == 1307) {
                        var73.field4159 = null;
                        continue;
                    }
                    if (var550 == 1308) {
                        var5--;
                        var73.field4242 = class63.field1126[var5];
                        var5--;
                        var73.field4136 = class63.field1126[var5];
                        continue;
                    }
                    if (var550 == 1309) {
                        var5--;
                        int var77 = class63.field1126[var5];
                        var5--;
                        int var78 = class63.field1126[var5];
                        if (var78 >= 1 && var78 <= 10) {
                            var73.method1945(var78 - 1, var77, 0);
                        }
                        continue;
                    }
                    if (var550 == 1310) {
                        var3--;
                        var73.field4191 = class340.field5429[var3];
                        continue;
                    }
                } else {
                    if (var550 >= 1400 && var550 < 1500 || var550 >= 2400 && var550 < 2500) {
                        class250 var79;
                        if (var550 < 2000) {
                            var79 = var39 ? class278.field4578 : class36.field519;
                        } else {
                            var5--;
                            var79 = class13.method74(-91, class63.field1126[var5]);
                            var550 -= 1000;
                        }
                        int[] var80 = null;
                        var3--;
                        String var81 = class340.field5429[var3];
                        if (var81.length() > 0 && var81.charAt(var81.length() - 1) == 'Y') {
                            var5--;
                            int var82 = class63.field1126[var5];
                            if (var82 > 0) {
                                var80 = new int[var82];
                                while (var82-- > 0) {
                                    var5--;
                                    var80[var82] = class63.field1126[var5];
                                }
                            }
                            var81 = var81.substring(0, var81.length() - 1);
                        }
                        Object[] var83 = new Object[var81.length() + 1];
                        for (int var84 = var83.length - 1; var84 >= 1; var84--) {
                            if (var81.charAt(var84 - 1) == 's') {
                                var3--;
                                var83[var84] = class340.field5429[var3];
                            } else {
                                var5--;
                                var83[var84] = Integer.valueOf(class63.field1126[var5]);
                            }
                        }
                        var5--;
                        int var85 = class63.field1126[var5];
                        if (var85 == -1) {
                            var83 = null;
                        } else {
                            var83[0] = Integer.valueOf(var85);
                        }
                        var79.field4071 = true;
                        if (var550 == 1400) {
                            var79.field4227 = var83;
                        } else if (var550 == 1401) {
                            var79.field4217 = var83;
                        } else if (var550 == 1402) {
                            var79.field4073 = var83;
                        } else if (var550 == 1403) {
                            var79.field4108 = var83;
                        } else if (var550 == 1404) {
                            var79.field4190 = var83;
                        } else if (var550 == 1405) {
                            var79.field4143 = var83;
                        } else if (var550 == 1406) {
                            var79.field4103 = var83;
                        } else if (var550 == 1407) {
                            var79.field4090 = var80;
                            var79.field4133 = var83;
                        } else if (var550 == 1408) {
                            var79.field4101 = var83;
                        } else if (var550 == 1409) {
                            var79.field4166 = var83;
                        } else if (var550 == 1410) {
                            var79.field4146 = var83;
                        } else if (var550 == 1411) {
                            var79.field4148 = var83;
                        } else if (var550 == 1412) {
                            var79.field4112 = var83;
                        } else if (var550 == 1414) {
                            var79.field4241 = var83;
                            var79.field4218 = var80;
                        } else if (var550 == 1415) {
                            var79.field4199 = var83;
                            var79.field4119 = var80;
                        } else if (var550 == 1416) {
                            var79.field4096 = var83;
                        } else if (var550 == 1417) {
                            var79.field4065 = var83;
                        } else if (var550 == 1418) {
                            var79.field4184 = var83;
                        } else if (var550 == 1419) {
                            var79.field4118 = var83;
                        } else if (var550 == 1420) {
                            var79.field4069 = var83;
                        } else if (var550 == 1421) {
                            var79.field4115 = var83;
                        } else if (var550 == 1422) {
                            var79.field4100 = var83;
                        } else if (var550 == 1423) {
                            var79.field4105 = var83;
                        } else if (var550 == 1424) {
                            var79.field4080 = var83;
                        } else if (var550 == 1425) {
                            var79.field4207 = var83;
                        } else if (var550 == 1426) {
                            var79.field4214 = var83;
                        } else if (var550 == 1427) {
                            var79.field4164 = var83;
                        } else if (var550 == 1428) {
                            var79.field4153 = var83;
                            var79.field4150 = var80;
                        } else if (var550 == 1429) {
                            var79.field4198 = var80;
                            var79.field4097 = var83;
                        }
                        continue;
                    }
                    if (var550 < 1600) {
                        class250 var86 = var39 ? class278.field4578 : class36.field519;
                        if (var550 == 1500) {
                            class63.field1126[var5++] = var86.field4147;
                            continue;
                        }
                        if (var550 == 1501) {
                            class63.field1126[var5++] = var86.field4213;
                            continue;
                        }
                        if (var550 == 1502) {
                            class63.field1126[var5++] = var86.field4081;
                            continue;
                        }
                        if (var550 == 1503) {
                            class63.field1126[var5++] = var86.field4157;
                            continue;
                        }
                        if (var550 == 1504) {
                            class63.field1126[var5++] = var86.field4130 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 1505) {
                            class63.field1126[var5++] = var86.field4086;
                            continue;
                        }
                    } else if (var550 < 1700) {
                        class250 var87 = var39 ? class278.field4578 : class36.field519;
                        if (var550 == 1600) {
                            class63.field1126[var5++] = var87.field4225;
                            continue;
                        }
                        if (var550 == 1601) {
                            class63.field1126[var5++] = var87.field4120;
                            continue;
                        }
                        if (var550 == 1602) {
                            class340.field5429[var3++] = var87.field4168;
                            continue;
                        }
                        if (var550 == 1603) {
                            class63.field1126[var5++] = var87.field4211;
                            continue;
                        }
                        if (var550 == 1604) {
                            class63.field1126[var5++] = var87.field4201;
                            continue;
                        }
                        if (var550 == 1605) {
                            class63.field1126[var5++] = var87.field4240;
                            continue;
                        }
                        if (var550 == 1606) {
                            class63.field1126[var5++] = var87.field4084;
                            continue;
                        }
                        if (var550 == 1607) {
                            class63.field1126[var5++] = var87.field4085;
                            continue;
                        }
                        if (var550 == 1608) {
                            class63.field1126[var5++] = var87.field4139;
                            continue;
                        }
                        if (var550 == 1609) {
                            class63.field1126[var5++] = var87.field4087;
                            continue;
                        }
                        if (var550 == 1610) {
                            class63.field1126[var5++] = var87.field4172;
                            continue;
                        }
                        if (var550 == 1611) {
                            class63.field1126[var5++] = var87.field4174;
                            continue;
                        }
                        if (var550 == 1612) {
                            class63.field1126[var5++] = var87.field4178;
                            continue;
                        }
                    } else if (var550 < 1800) {
                        class250 var88 = var39 ? class278.field4578 : class36.field519;
                        if (var550 == 1700) {
                            class63.field1126[var5++] = var88.field4231;
                            continue;
                        }
                        if (var550 == 1701) {
                            if (var88.field4231 == -1) {
                                class63.field1126[var5++] = 0;
                            } else {
                                class63.field1126[var5++] = var88.field4176;
                            }
                            continue;
                        }
                        if (var550 == 1702) {
                            class63.field1126[var5++] = var88.field4229;
                            continue;
                        }
                    } else if (var550 < 1900) {
                        class250 var89 = var39 ? class278.field4578 : class36.field519;
                        if (var550 == 1800) {
                            class63.field1126[var5++] = client.method336(var89).method812(true);
                            continue;
                        }
                        if (var550 == 1801) {
                            var5--;
                            int var90 = class63.field1126[var5];
                            int var551 = var90 - 1;
                            if (var89.field4159 != null && var551 < var89.field4159.length && var89.field4159[var551] != null) {
                                class340.field5429[var3++] = var89.field4159[var551];
                                continue;
                            }
                            class340.field5429[var3++] = "";
                            continue;
                        }
                        if (var550 == 1802) {
                            if (var89.field4074 == null) {
                                class340.field5429[var3++] = "";
                            } else {
                                class340.field5429[var3++] = var89.field4074;
                            }
                            continue;
                        }
                    } else if (var550 < 2600) {
                        var5--;
                        class250 var91 = class13.method74(-39, class63.field1126[var5]);
                        if (var550 == 2500) {
                            class63.field1126[var5++] = var91.field4147;
                            continue;
                        }
                        if (var550 == 2501) {
                            class63.field1126[var5++] = var91.field4213;
                            continue;
                        }
                        if (var550 == 2502) {
                            class63.field1126[var5++] = var91.field4081;
                            continue;
                        }
                        if (var550 == 2503) {
                            class63.field1126[var5++] = var91.field4157;
                            continue;
                        }
                        if (var550 == 2504) {
                            class63.field1126[var5++] = var91.field4130 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 2505) {
                            class63.field1126[var5++] = var91.field4086;
                            continue;
                        }
                    } else if (var550 < 2700) {
                        var5--;
                        class250 var92 = class13.method74(-64, class63.field1126[var5]);
                        if (var550 == 2600) {
                            class63.field1126[var5++] = var92.field4225;
                            continue;
                        }
                        if (var550 == 2601) {
                            class63.field1126[var5++] = var92.field4120;
                            continue;
                        }
                        if (var550 == 2602) {
                            class340.field5429[var3++] = var92.field4168;
                            continue;
                        }
                        if (var550 == 2603) {
                            class63.field1126[var5++] = var92.field4211;
                            continue;
                        }
                        if (var550 == 2604) {
                            class63.field1126[var5++] = var92.field4201;
                            continue;
                        }
                        if (var550 == 2605) {
                            class63.field1126[var5++] = var92.field4240;
                            continue;
                        }
                        if (var550 == 2606) {
                            class63.field1126[var5++] = var92.field4084;
                            continue;
                        }
                        if (var550 == 2607) {
                            class63.field1126[var5++] = var92.field4085;
                            continue;
                        }
                        if (var550 == 2608) {
                            class63.field1126[var5++] = var92.field4139;
                            continue;
                        }
                        if (var550 == 2609) {
                            class63.field1126[var5++] = var92.field4087;
                            continue;
                        }
                        if (var550 == 2610) {
                            class63.field1126[var5++] = var92.field4172;
                            continue;
                        }
                        if (var550 == 2611) {
                            class63.field1126[var5++] = var92.field4174;
                            continue;
                        }
                        if (var550 == 2612) {
                            class63.field1126[var5++] = var92.field4178;
                            continue;
                        }
                    } else if (var550 < 2800) {
                        if (var550 == 2700) {
                            var5--;
                            class250 var93 = class13.method74(-48, class63.field1126[var5]);
                            class63.field1126[var5++] = var93.field4231;
                            continue;
                        }
                        if (var550 == 2701) {
                            var5--;
                            class250 var94 = class13.method74(-62, class63.field1126[var5]);
                            if (var94.field4231 == -1) {
                                class63.field1126[var5++] = 0;
                            } else {
                                class63.field1126[var5++] = var94.field4176;
                            }
                            continue;
                        }
                        if (var550 == 2702) {
                            var5--;
                            int var95 = class63.field1126[var5];
                            class259 var96 = (class259) class226.field3723.method1268(-86, (long) var95);
                            if (var96 == null) {
                                class63.field1126[var5++] = 0;
                            } else {
                                class63.field1126[var5++] = 1;
                            }
                            continue;
                        }
                        if (var550 == 2703) {
                            var5--;
                            class250 var97 = class13.method74(-128, class63.field1126[var5]);
                            if (var97.field4171 == null) {
                                class63.field1126[var5++] = 0;
                                continue;
                            }
                            int var98 = var97.field4171.length;
                            for (int var99 = 0; var99 < var97.field4171.length; var99++) {
                                if (var97.field4171[var99] == null) {
                                    var98 = var99;
                                    break;
                                }
                            }
                            class63.field1126[var5++] = var98;
                            continue;
                        }
                        if (var550 == 2704 || var550 == 2705) {
                            var5 -= 2;
                            int var100 = class63.field1126[var5 + 1];
                            int var101 = class63.field1126[var5];
                            class259 var102 = (class259) class226.field3723.method1268(105, (long) var101);
                            if (var102 != null && var102.field4358 == var100) {
                                class63.field1126[var5++] = 1;
                                continue;
                            }
                            class63.field1126[var5++] = 0;
                            continue;
                        }
                    } else if (var550 < 2900) {
                        var5--;
                        class250 var539 = class13.method74(-36, class63.field1126[var5]);
                        if (var550 == 2800) {
                            class63.field1126[var5++] = client.method336(var539).method812(true);
                            continue;
                        }
                        if (var550 == 2801) {
                            var5--;
                            int var540 = class63.field1126[var5];
                            int var552 = var540 - 1;
                            if (var539.field4159 != null && var552 < var539.field4159.length && var539.field4159[var552] != null) {
                                class340.field5429[var3++] = var539.field4159[var552];
                                continue;
                            }
                            class340.field5429[var3++] = "";
                            continue;
                        }
                        if (var550 == 2802) {
                            if (var539.field4074 == null) {
                                class340.field5429[var3++] = "";
                            } else {
                                class340.field5429[var3++] = var539.field4074;
                            }
                            continue;
                        }
                    } else if (var550 < 3200) {
                        if (var550 == 3100) {
                            var3--;
                            String var103 = class340.field5429[var3];
                            class182.method1431(var103, (byte) -11);
                            continue;
                        }
                        if (var550 == 3101) {
                            var5 -= 2;
                            class165.method1284(class6.field55, class63.field1126[var5 + 1], 1, class63.field1126[var5]);
                            continue;
                        }
                        if (var550 == 3103) {
                            class87.method697(true);
                            continue;
                        }
                        if (var550 == 3104) {
                            class130.field2198++;
                            var3--;
                            String var104 = class340.field5429[var3];
                            int var105 = 0;
                            if (class216.method1630(false, var104)) {
                                var105 = class130.method996(var104, 30958);
                            }
                            class36.field520.method2228(170, 16547);
                            class36.field520.method1757(var105, -106);
                            continue;
                        }
                        if (var550 == 3105) {
                            class216.field3457++;
                            var3--;
                            String var106 = class340.field5429[var3];
                            class36.field520.method2228(220, 16547);
                            class36.field520.method1712(var106.length() + 1, -75);
                            class36.field520.method1709(var106, (byte) -90);
                            continue;
                        }
                        if (var550 == 3106) {
                            class281.field4612++;
                            var3--;
                            String var107 = class340.field5429[var3];
                            class36.field520.method2228(143, 16547);
                            class36.field520.method1712(var107.length() + 1, -111);
                            class36.field520.method1709(var107, (byte) -72);
                            continue;
                        }
                        if (var550 == 3107) {
                            var5--;
                            int var108 = class63.field1126[var5];
                            var3--;
                            String var109 = class340.field5429[var3];
                            class113.method856(var108, false, var109);
                            continue;
                        }
                        if (var550 == 3108) {
                            var5 -= 3;
                            int var110 = class63.field1126[var5];
                            int var111 = class63.field1126[var5 + 1];
                            int var112 = class63.field1126[var5 + 2];
                            class250 var113 = class13.method74(-118, var112);
                            class250.method1939(3926, var113, var111, var110);
                            continue;
                        }
                        if (var550 == 3109) {
                            var5 -= 2;
                            int var114 = class63.field1126[var5];
                            int var115 = class63.field1126[var5 + 1];
                            class250 var116 = var39 ? class278.field4578 : class36.field519;
                            class250.method1939(3926, var116, var115, var114);
                            continue;
                        }
                        if (var550 == 3110) {
                            var5--;
                            int var117 = class63.field1126[var5];
                            class34.field503++;
                            class36.field520.method2228(166, 16547);
                            class36.field520.method1729(var117, 206);
                            continue;
                        }
                    } else if (var550 < 3300) {
                        if (var550 == 3200) {
                            var5 -= 3;
                            class309.method2195(class63.field1126[var5], class63.field1126[var5 + 2], (byte) 108, 255, class63.field1126[var5 + 1]);
                            continue;
                        }
                        if (var550 == 3201) {
                            var5--;
                            class235.method1806(255, class63.field1126[var5], (byte) -101);
                            continue;
                        }
                        if (var550 == 3202) {
                            var5 -= 2;
                            class302.method2161(class63.field1126[var5 + 1], (byte) -128, 255, class63.field1126[var5]);
                            continue;
                        }
                    } else if (var550 < 3400) {
                        if (var550 == 3300) {
                            class63.field1126[var5++] = class332.field5261;
                            continue;
                        }
                        if (var550 == 3301) {
                            var5 -= 2;
                            int var505 = class63.field1126[var5];
                            int var506 = class63.field1126[var5 + 1];
                            class63.field1126[var5++] = class77.method641(var505, 117, var506);
                            continue;
                        }
                        if (var550 == 3302) {
                            var5 -= 2;
                            int var507 = class63.field1126[var5];
                            int var508 = class63.field1126[var5 + 1];
                            class63.field1126[var5++] = class248.method1911(-5718, var507, var508);
                            continue;
                        }
                        if (var550 == 3303) {
                            var5 -= 2;
                            int var509 = class63.field1126[var5];
                            int var510 = class63.field1126[var5 + 1];
                            class63.field1126[var5++] = class140.method1085(var509, var510, 14136);
                            continue;
                        }
                        if (var550 == 3304) {
                            var5--;
                            int var511 = class63.field1126[var5];
                            class63.field1126[var5++] = class310.method2204(-19, var511).field5588;
                            continue;
                        }
                        if (var550 == 3305) {
                            var5--;
                            int var512 = class63.field1126[var5];
                            class63.field1126[var5++] = class57.field980[var512];
                            continue;
                        }
                        if (var550 == 3306) {
                            var5--;
                            int var513 = class63.field1126[var5];
                            class63.field1126[var5++] = class12.field119[var513];
                            continue;
                        }
                        if (var550 == 3307) {
                            var5--;
                            int var514 = class63.field1126[var5];
                            class63.field1126[var5++] = class320.field5094[var514];
                            continue;
                        }
                        if (var550 == 3308) {
                            int var515 = (class6.field55.field3577 >> 7) + class93.field1562;
                            int var516 = class186.field2991;
                            int var517 = (class6.field55.field3511 >> 7) + class275.field4546;
                            class63.field1126[var5++] = (var515 << 14) + ((var516 << 28) + var517);
                            continue;
                        }
                        if (var550 == 3309) {
                            var5--;
                            int var518 = class63.field1126[var5];
                            class63.field1126[var5++] = class343.method2418(var518 >> 14, 16383);
                            continue;
                        }
                        if (var550 == 3310) {
                            var5--;
                            int var519 = class63.field1126[var5];
                            class63.field1126[var5++] = var519 >> 28;
                            continue;
                        }
                        if (var550 == 3311) {
                            var5--;
                            int var520 = class63.field1126[var5];
                            class63.field1126[var5++] = class343.method2418(var520, 16383);
                            continue;
                        }
                        if (var550 == 3312) {
                            class63.field1126[var5++] = class286.field4661 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3313) {
                            var5 -= 2;
                            int var521 = class63.field1126[var5] + 32768;
                            int var522 = class63.field1126[var5 + 1];
                            class63.field1126[var5++] = class77.method641(var521, 126, var522);
                            continue;
                        }
                        if (var550 == 3314) {
                            var5 -= 2;
                            int var523 = class63.field1126[var5 + 1];
                            int var524 = class63.field1126[var5] + 32768;
                            class63.field1126[var5++] = class248.method1911(-5718, var524, var523);
                            continue;
                        }
                        if (var550 == 3315) {
                            var5 -= 2;
                            int var525 = class63.field1126[var5] + 32768;
                            int var526 = class63.field1126[var5 + 1];
                            class63.field1126[var5++] = class140.method1085(var525, var526, 14136);
                            continue;
                        }
                        if (var550 == 3316) {
                            if (class162.field2572 < 2) {
                                class63.field1126[var5++] = 0;
                            } else {
                                class63.field1126[var5++] = class162.field2572;
                            }
                            continue;
                        }
                        if (var550 == 3317) {
                            class63.field1126[var5++] = class247.field4042;
                            continue;
                        }
                        if (var550 == 3318) {
                            class63.field1126[var5++] = class259.field4360;
                            continue;
                        }
                        if (var550 == 3321) {
                            class63.field1126[var5++] = class122.field2098;
                            continue;
                        }
                        if (var550 == 3322) {
                            class63.field1126[var5++] = class220.field3512;
                            continue;
                        }
                        if (var550 == 3323) {
                            if (class254.field4287 >= 5 && class254.field4287 <= 9) {
                                class63.field1126[var5++] = 1;
                                continue;
                            }
                            class63.field1126[var5++] = 0;
                            continue;
                        }
                        if (var550 == 3324) {
                            if (class254.field4287 >= 5 && class254.field4287 <= 9) {
                                class63.field1126[var5++] = class254.field4287;
                                continue;
                            }
                            class63.field1126[var5++] = 0;
                            continue;
                        }
                        if (var550 == 3325) {
                            class63.field1126[var5++] = class134.field2256 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3326) {
                            class63.field1126[var5++] = class6.field55.field4330;
                            continue;
                        }
                        if (var550 == 3327) {
                            class63.field1126[var5++] = class6.field55.field4316.field1935 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3328) {
                            class63.field1126[var5++] = class322.field5124 && !class93.field1568 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3329) {
                            class63.field1126[var5++] = class314.field4991 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3330) {
                            var5--;
                            int var527 = class63.field1126[var5];
                            class63.field1126[var5++] = class113.method857((byte) -89, var527);
                            continue;
                        }
                        if (var550 == 3331) {
                            var5 -= 2;
                            int var528 = class63.field1126[var5 + 1];
                            int var529 = class63.field1126[var5];
                            class63.field1126[var5++] = class84.method673(var529, 0, var528, false);
                            continue;
                        }
                        if (var550 == 3332) {
                            var5 -= 2;
                            int var530 = class63.field1126[var5];
                            int var531 = class63.field1126[var5 + 1];
                            class63.field1126[var5++] = class84.method673(var530, 0, var531, true);
                            continue;
                        }
                        if (var550 == 3333) {
                            class63.field1126[var5++] = class323.field5153;
                            continue;
                        }
                        if (var550 == 3335) {
                            class63.field1126[var5++] = class204.field3223;
                            continue;
                        }
                        if (var550 == 3336) {
                            var5 -= 4;
                            int var532 = class63.field1126[var5 + 1];
                            int var533 = class63.field1126[var5];
                            int var534 = class63.field1126[var5 + 3];
                            int var535 = (var532 << 14) + var533;
                            int var536 = class63.field1126[var5 + 2];
                            int var537 = (var536 << 28) + var535;
                            int var538 = var534 + var537;
                            class63.field1126[var5++] = var538;
                            continue;
                        }
                        if (var550 == 3337) {
                            class63.field1126[var5++] = class240.field3973;
                            continue;
                        }
                    } else if (var550 < 3500) {
                        if (var550 == 3400) {
                            var5 -= 2;
                            int var118 = class63.field1126[var5];
                            int var119 = class63.field1126[var5 + 1];
                            class48 var120 = class229.method1780(false, var118);
                            if (var120.field753 != 's') {
                            }
                            class340.field5429[var3++] = var120.method374((byte) -115, var119);
                            continue;
                        }
                        if (var550 == 3408) {
                            var5 -= 4;
                            int var121 = class63.field1126[var5];
                            int var122 = class63.field1126[var5 + 2];
                            int var123 = class63.field1126[var5 + 1];
                            int var124 = class63.field1126[var5 + 3];
                            class48 var125 = class229.method1780(false, var122);
                            if (var125.field775 == var121 && var125.field753 == var123) {
                                if (var123 == 115) {
                                    class340.field5429[var3++] = var125.method374((byte) -115, var124);
                                } else {
                                    class63.field1126[var5++] = var125.method383(var124, (byte) 110);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var550 == 3409) {
                            var5 -= 3;
                            int var126 = class63.field1126[var5 + 2];
                            int var127 = class63.field1126[var5];
                            int var128 = class63.field1126[var5 + 1];
                            if (var128 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class48 var129 = class229.method1780(false, var128);
                            if (var129.field753 != var127) {
                                throw new RuntimeException("C3409-1");
                            }
                            class63.field1126[var5++] = var129.method377(var126, (byte) -108) ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3410) {
                            var5--;
                            int var130 = class63.field1126[var5];
                            var3--;
                            String var131 = class340.field5429[var3];
                            if (var130 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class48 var132 = class229.method1780(false, var130);
                            if (var132.field753 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class63.field1126[var5++] = var132.method380((byte) -96, var131) ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3411) {
                            var5--;
                            int var133 = class63.field1126[var5];
                            class48 var134 = class229.method1780(false, var133);
                            class63.field1126[var5++] = var134.field752.method1274((byte) 118);
                            continue;
                        }
                    } else if (var550 < 3700) {
                        if (var550 == 3600) {
                            if (class293.field4740 == 0) {
                                class63.field1126[var5++] = -2;
                            } else if (class293.field4740 == 1) {
                                class63.field1126[var5++] = -1;
                            } else {
                                class63.field1126[var5++] = class38.field570;
                            }
                            continue;
                        }
                        if (var550 == 3601) {
                            var5--;
                            int var135 = class63.field1126[var5];
                            if (class293.field4740 == 2 && var135 < class38.field570) {
                                class340.field5429[var3++] = class241.field3986[var135];
                                if (class121.field2021[var135] == null) {
                                    class340.field5429[var3++] = "";
                                } else {
                                    class340.field5429[var3++] = class121.field2021[var135];
                                }
                                continue;
                            }
                            class340.field5429[var3++] = "";
                            class340.field5429[var3++] = "";
                            continue;
                        }
                        if (var550 == 3602) {
                            var5--;
                            int var136 = class63.field1126[var5];
                            if (class293.field4740 == 2 && var136 < class38.field570) {
                                class63.field1126[var5++] = class65.field1147[var136];
                                continue;
                            }
                            class63.field1126[var5++] = 0;
                            continue;
                        }
                        if (var550 == 3603) {
                            var5--;
                            int var137 = class63.field1126[var5];
                            if (class293.field4740 == 2 && var137 < class38.field570) {
                                class63.field1126[var5++] = class162.field2570[var137];
                                continue;
                            }
                            class63.field1126[var5++] = 0;
                            continue;
                        }
                        if (var550 == 3604) {
                            var5--;
                            int var138 = class63.field1126[var5];
                            var3--;
                            String var139 = class340.field5429[var3];
                            class35.method237(0, var138, var139);
                            continue;
                        }
                        if (var550 == 3605) {
                            var3--;
                            String var140 = class340.field5429[var3];
                            class39.method257(0, var140);
                            continue;
                        }
                        if (var550 == 3606) {
                            var3--;
                            String var141 = class340.field5429[var3];
                            class109.method836(-1, var141);
                            continue;
                        }
                        if (var550 == 3607) {
                            var3--;
                            String var142 = class340.field5429[var3];
                            class275.method2050(var142, (byte) 75, false);
                            continue;
                        }
                        if (var550 == 3608) {
                            var3--;
                            String var143 = class340.field5429[var3];
                            class137.method1036(true, var143);
                            continue;
                        }
                        if (var550 == 3609) {
                            var3--;
                            String var144 = class340.field5429[var3];
                            if (var144.startsWith("<img=0>") || var144.startsWith("<img=1>")) {
                                var144 = var144.substring(7);
                            }
                            class63.field1126[var5++] = class213.method1607((byte) -69, var144) ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3610) {
                            var5--;
                            int var145 = class63.field1126[var5];
                            if (class293.field4740 == 2 && class38.field570 > var145) {
                                class340.field5429[var3++] = class128.field2169[var145];
                                continue;
                            }
                            class340.field5429[var3++] = "";
                            continue;
                        }
                        if (var550 == 3611) {
                            if (class352.field5586 == null) {
                                class340.field5429[var3++] = "";
                            } else {
                                class340.field5429[var3++] = class260.method1983(class352.field5586, -2);
                            }
                            continue;
                        }
                        if (var550 == 3612) {
                            if (class352.field5586 == null) {
                                class63.field1126[var5++] = 0;
                            } else {
                                class63.field1126[var5++] = class313.field4980;
                            }
                            continue;
                        }
                        if (var550 == 3613) {
                            var5--;
                            int var146 = class63.field1126[var5];
                            if (class352.field5586 != null && var146 < class313.field4980) {
                                class340.field5429[var3++] = class306.field4891[var146].field1817;
                                continue;
                            }
                            class340.field5429[var3++] = "";
                            continue;
                        }
                        if (var550 == 3614) {
                            var5--;
                            int var147 = class63.field1126[var5];
                            if (class352.field5586 != null && class313.field4980 > var147) {
                                class63.field1126[var5++] = class306.field4891[var147].field1814;
                                continue;
                            }
                            class63.field1126[var5++] = 0;
                            continue;
                        }
                        if (var550 == 3615) {
                            var5--;
                            int var148 = class63.field1126[var5];
                            if (class352.field5586 != null && class313.field4980 > var148) {
                                class63.field1126[var5++] = class306.field4891[var148].field1815;
                                continue;
                            }
                            class63.field1126[var5++] = 0;
                            continue;
                        }
                        if (var550 == 3616) {
                            class63.field1126[var5++] = class135.field2265;
                            continue;
                        }
                        if (var550 == 3617) {
                            var3--;
                            String var149 = class340.field5429[var3];
                            class21.method128(1031, var149);
                            continue;
                        }
                        if (var550 == 3618) {
                            class63.field1126[var5++] = class296.field4757;
                            continue;
                        }
                        if (var550 == 3619) {
                            var3--;
                            String var150 = class340.field5429[var3];
                            class306.method2179(var150, 5348);
                            continue;
                        }
                        if (var550 == 3620) {
                            class353.method2500(2);
                            continue;
                        }
                        if (var550 == 3621) {
                            if (class293.field4740 == 0) {
                                class63.field1126[var5++] = -1;
                            } else {
                                class63.field1126[var5++] = class93.field1561;
                            }
                            continue;
                        }
                        if (var550 == 3622) {
                            var5--;
                            int var151 = class63.field1126[var5];
                            if (class293.field4740 != 0 && var151 < class93.field1561) {
                                class340.field5429[var3++] = class239.field3946[var151];
                                if (class92.field1553[var151] == null) {
                                    class340.field5429[var3++] = "";
                                } else {
                                    class340.field5429[var3++] = class92.field1553[var151];
                                }
                                continue;
                            }
                            class340.field5429[var3++] = "";
                            class340.field5429[var3++] = "";
                            continue;
                        }
                        if (var550 == 3623) {
                            var3--;
                            String var152 = class340.field5429[var3];
                            if (var152.startsWith("<img=0>") || var152.startsWith("<img=1>")) {
                                var152 = var152.substring(7);
                            }
                            class63.field1126[var5++] = class57.method481(true, var152) ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3624) {
                            var5--;
                            int var153 = class63.field1126[var5];
                            if (class306.field4891 != null && var153 < class313.field4980 && class306.field4891[var153].field1813.equalsIgnoreCase(class6.field55.field4349)) {
                                class63.field1126[var5++] = 1;
                                continue;
                            }
                            class63.field1126[var5++] = 0;
                            continue;
                        }
                        if (var550 == 3625) {
                            if (class321.field5114 == null) {
                                class340.field5429[var3++] = "";
                            } else {
                                class340.field5429[var3++] = class321.field5114;
                            }
                            continue;
                        }
                        if (var550 == 3626) {
                            var5--;
                            int var154 = class63.field1126[var5];
                            if (class352.field5586 != null && class313.field4980 > var154) {
                                class340.field5429[var3++] = class306.field4891[var154].field1819;
                                continue;
                            }
                            class340.field5429[var3++] = "";
                            continue;
                        }
                        if (var550 == 3627) {
                            var5--;
                            int var155 = class63.field1126[var5];
                            if (class293.field4740 == 2 && var155 >= 0 && var155 < class38.field570) {
                                class63.field1126[var5++] = class92.field1560[var155] ? 1 : 0;
                                continue;
                            }
                            class63.field1126[var5++] = 0;
                            continue;
                        }
                        if (var550 == 3628) {
                            var3--;
                            String var156 = class340.field5429[var3];
                            if (var156.startsWith("<img=0>") || var156.startsWith("<img=1>")) {
                                var156 = var156.substring(7);
                            }
                            class63.field1126[var5++] = class240.method1826(var156, -1);
                            continue;
                        }
                        if (var550 == 3629) {
                            class63.field1126[var5++] = class1.field2;
                            continue;
                        }
                        if (var550 == 3630) {
                            var3--;
                            String var157 = class340.field5429[var3];
                            class275.method2050(var157, (byte) 75, true);
                            continue;
                        }
                        if (var550 == 3631) {
                            var5--;
                            int var158 = class63.field1126[var5];
                            class63.field1126[var5++] = class362.field5745[var158] ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3632) {
                            var5--;
                            int var159 = class63.field1126[var5];
                            if (class352.field5586 != null && var159 < class313.field4980) {
                                class340.field5429[var3++] = class306.field4891[var159].field1813;
                                continue;
                            }
                            class340.field5429[var3++] = "";
                            continue;
                        }
                        if (var550 == 3633) {
                            var5--;
                            int var160 = class63.field1126[var5];
                            if (class293.field4740 != 0 && var160 < class93.field1561) {
                                class340.field5429[var3++] = class210.field3364[var160];
                                continue;
                            }
                            class340.field5429[var3++] = "";
                            continue;
                        }
                    } else if (var550 < 4000) {
                        if (var550 == 3903) {
                            var5--;
                            int var161 = class63.field1126[var5];
                            class63.field1126[var5++] = class61.field1025[var161].method1569(1);
                            continue;
                        }
                        if (var550 == 3904) {
                            var5--;
                            int var162 = class63.field1126[var5];
                            class63.field1126[var5++] = class61.field1025[var162].field3233;
                            continue;
                        }
                        if (var550 == 3905) {
                            var5--;
                            int var163 = class63.field1126[var5];
                            class63.field1126[var5++] = class61.field1025[var163].field3238;
                            continue;
                        }
                        if (var550 == 3906) {
                            var5--;
                            int var164 = class63.field1126[var5];
                            class63.field1126[var5++] = class61.field1025[var164].field3243;
                            continue;
                        }
                        if (var550 == 3907) {
                            var5--;
                            int var165 = class63.field1126[var5];
                            class63.field1126[var5++] = class61.field1025[var165].field3231;
                            continue;
                        }
                        if (var550 == 3908) {
                            var5--;
                            int var166 = class63.field1126[var5];
                            class63.field1126[var5++] = class61.field1025[var166].field3232;
                            continue;
                        }
                        if (var550 == 3910) {
                            var5--;
                            int var167 = class63.field1126[var5];
                            int var168 = class61.field1025[var167].method1567(false);
                            class63.field1126[var5++] = var168 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3911) {
                            var5--;
                            int var169 = class63.field1126[var5];
                            int var170 = class61.field1025[var169].method1567(false);
                            class63.field1126[var5++] = var170 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3912) {
                            var5--;
                            int var171 = class63.field1126[var5];
                            int var172 = class61.field1025[var171].method1567(false);
                            class63.field1126[var5++] = var172 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 3913) {
                            var5--;
                            int var173 = class63.field1126[var5];
                            int var174 = class61.field1025[var173].method1567(false);
                            class63.field1126[var5++] = var174 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var550 < 4100) {
                        if (var550 == 4000) {
                            var5 -= 2;
                            int var175 = class63.field1126[var5 + 1];
                            int var176 = class63.field1126[var5];
                            class63.field1126[var5++] = var175 + var176;
                            continue;
                        }
                        if (var550 == 4001) {
                            var5 -= 2;
                            int var177 = class63.field1126[var5];
                            int var178 = class63.field1126[var5 + 1];
                            class63.field1126[var5++] = var177 - var178;
                            continue;
                        }
                        if (var550 == 4002) {
                            var5 -= 2;
                            int var179 = class63.field1126[var5];
                            int var180 = class63.field1126[var5 + 1];
                            class63.field1126[var5++] = var179 * var180;
                            continue;
                        }
                        if (var550 == 4003) {
                            var5 -= 2;
                            int var181 = class63.field1126[var5 + 1];
                            int var182 = class63.field1126[var5];
                            class63.field1126[var5++] = var182 / var181;
                            continue;
                        }
                        if (var550 == 4004) {
                            var5--;
                            int var183 = class63.field1126[var5];
                            class63.field1126[var5++] = (int) ((double) var183 * Math.random());
                            continue;
                        }
                        if (var550 == 4005) {
                            var5--;
                            int var184 = class63.field1126[var5];
                            class63.field1126[var5++] = (int) (Math.random() * (double) (var184 + 1));
                            continue;
                        }
                        if (var550 == 4006) {
                            var5 -= 5;
                            int var185 = class63.field1126[var5];
                            int var186 = class63.field1126[var5 + 1];
                            int var187 = class63.field1126[var5 + 2];
                            int var188 = class63.field1126[var5 + 3];
                            int var189 = class63.field1126[var5 + 4];
                            class63.field1126[var5++] = (var189 - var187) * (var186 - var185) / (var188 - var187) + var185;
                            continue;
                        }
                        if (var550 == 4007) {
                            var5 -= 2;
                            long var190 = (long) class63.field1126[var5];
                            long var192 = (long) class63.field1126[var5 + 1];
                            class63.field1126[var5++] = (int) (var190 * var192 / 100L + var190);
                            continue;
                        }
                        if (var550 == 4008) {
                            var5 -= 2;
                            int var194 = class63.field1126[var5];
                            int var195 = class63.field1126[var5 + 1];
                            class63.field1126[var5++] = class75.method624(0x1 << var195, var194);
                            continue;
                        }
                        if (var550 == 4009) {
                            var5 -= 2;
                            int var196 = class63.field1126[var5];
                            int var197 = class63.field1126[var5 + 1];
                            class63.field1126[var5++] = class343.method2418(var196, -(0x1 << var197) - 1);
                            continue;
                        }
                        if (var550 == 4010) {
                            var5 -= 2;
                            int var198 = class63.field1126[var5];
                            int var199 = class63.field1126[var5 + 1];
                            class63.field1126[var5++] = class343.method2418(var198, 0x1 << var199) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var550 == 4011) {
                            var5 -= 2;
                            int var200 = class63.field1126[var5 + 1];
                            int var201 = class63.field1126[var5];
                            class63.field1126[var5++] = var201 % var200;
                            continue;
                        }
                        if (var550 == 4012) {
                            var5 -= 2;
                            int var202 = class63.field1126[var5 + 1];
                            int var203 = class63.field1126[var5];
                            if (var203 == 0) {
                                class63.field1126[var5++] = 0;
                            } else {
                                class63.field1126[var5++] = (int) Math.pow((double) var203, (double) var202);
                            }
                            continue;
                        }
                        if (var550 == 4013) {
                            var5 -= 2;
                            int var204 = class63.field1126[var5];
                            int var205 = class63.field1126[var5 + 1];
                            if (var204 == 0) {
                                class63.field1126[var5++] = 0;
                            } else if (var205 == 0) {
                                class63.field1126[var5++] = Integer.MAX_VALUE;
                            } else {
                                class63.field1126[var5++] = (int) Math.pow((double) var204, 1.0D / (double) var205);
                            }
                            continue;
                        }
                        if (var550 == 4014) {
                            var5 -= 2;
                            int var206 = class63.field1126[var5];
                            int var207 = class63.field1126[var5 + 1];
                            class63.field1126[var5++] = class343.method2418(var207, var206);
                            continue;
                        }
                        if (var550 == 4015) {
                            var5 -= 2;
                            int var208 = class63.field1126[var5];
                            int var209 = class63.field1126[var5 + 1];
                            class63.field1126[var5++] = class75.method624(var209, var208);
                            continue;
                        }
                        if (var550 == 4016) {
                            var5 -= 2;
                            int var210 = class63.field1126[var5];
                            int var211 = class63.field1126[var5 + 1];
                            class63.field1126[var5++] = var210 < var211 ? var210 : var211;
                            continue;
                        }
                        if (var550 == 4017) {
                            var5 -= 2;
                            int var212 = class63.field1126[var5];
                            int var213 = class63.field1126[var5 + 1];
                            class63.field1126[var5++] = var212 <= var213 ? var213 : var212;
                            continue;
                        }
                        if (var550 == 4018) {
                            var5 -= 3;
                            long var214 = (long) class63.field1126[var5];
                            long var216 = (long) class63.field1126[var5 + 1];
                            long var218 = (long) class63.field1126[var5 + 2];
                            class63.field1126[var5++] = (int) (var214 * var218 / var216);
                            continue;
                        }
                    } else if (var550 < 4200) {
                        if (var550 == 4100) {
                            var3--;
                            String var220 = class340.field5429[var3];
                            var5--;
                            int var221 = class63.field1126[var5];
                            class340.field5429[var3++] = var220 + var221;
                            continue;
                        }
                        if (var550 == 4101) {
                            var3 -= 2;
                            String var222 = class340.field5429[var3];
                            String var223 = class340.field5429[var3 + 1];
                            class340.field5429[var3++] = var222 + var223;
                            continue;
                        }
                        if (var550 == 4102) {
                            var3--;
                            String var224 = class340.field5429[var3];
                            var5--;
                            int var225 = class63.field1126[var5];
                            class340.field5429[var3++] = var224 + class230.method1784((byte) 7, true, var225);
                            continue;
                        }
                        if (var550 == 4103) {
                            var3--;
                            String var226 = class340.field5429[var3];
                            class340.field5429[var3++] = var226.toLowerCase();
                            continue;
                        }
                        if (var550 == 4104) {
                            var5--;
                            int var227 = class63.field1126[var5];
                            long var228 = (long) var227 * 86400000L + 1014768000000L;
                            class76.field1307.setTime(new Date(var228));
                            int var230 = class76.field1307.get(5);
                            int var231 = class76.field1307.get(2);
                            int var232 = class76.field1307.get(1);
                            class340.field5429[var3++] = var230 + "-" + class66.field1174[var231] + "-" + var232;
                            continue;
                        }
                        if (var550 == 4105) {
                            var3 -= 2;
                            String var233 = class340.field5429[var3];
                            String var234 = class340.field5429[var3 + 1];
                            if (class6.field55.field4316 != null && class6.field55.field4316.field1935) {
                                class340.field5429[var3++] = var234;
                                continue;
                            }
                            class340.field5429[var3++] = var233;
                            continue;
                        }
                        if (var550 == 4106) {
                            var5--;
                            int var235 = class63.field1126[var5];
                            class340.field5429[var3++] = Integer.toString(var235);
                            continue;
                        }
                        if (var550 == 4107) {
                            var3 -= 2;
                            class63.field1126[var5++] = class232.method1790(class362.method2536(true, class340.field5429[var3], class340.field5429[var3 + 1], class204.field3223), 137);
                            continue;
                        }
                        if (var550 == 4108) {
                            var3--;
                            String var236 = class340.field5429[var3];
                            var5 -= 2;
                            int var237 = class63.field1126[var5];
                            int var238 = class63.field1126[var5 + 1];
                            class63.field1126[var5++] = class38.method249(var238, -90).method1344(var236, var237);
                            continue;
                        }
                        if (var550 == 4109) {
                            var5 -= 2;
                            int var239 = class63.field1126[var5];
                            int var240 = class63.field1126[var5 + 1];
                            var3--;
                            String var241 = class340.field5429[var3];
                            class63.field1126[var5++] = class38.method249(var240, -109).method1330(var241, var239);
                            continue;
                        }
                        if (var550 == 4110) {
                            var3 -= 2;
                            String var242 = class340.field5429[var3];
                            String var243 = class340.field5429[var3 + 1];
                            var5--;
                            if (class63.field1126[var5] == 1) {
                                class340.field5429[var3++] = var242;
                            } else {
                                class340.field5429[var3++] = var243;
                            }
                            continue;
                        }
                        if (var550 == 4111) {
                            var3--;
                            String var244 = class340.field5429[var3];
                            class340.field5429[var3++] = class171.method1348(var244);
                            continue;
                        }
                        if (var550 == 4112) {
                            var3--;
                            String var245 = class340.field5429[var3];
                            var5--;
                            int var246 = class63.field1126[var5];
                            if (var246 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class340.field5429[var3++] = var245 + (char) var246;
                            continue;
                        }
                        if (var550 == 4113) {
                            var5--;
                            int var247 = class63.field1126[var5];
                            class63.field1126[var5++] = class300.method2148((char) var247, -1) ? 1 : 0;
                            continue;
                        }
                        if (var550 == 4114) {
                            var5--;
                            int var248 = class63.field1126[var5];
                            class63.field1126[var5++] = class348.method2441(false, (char) var248) ? 1 : 0;
                            continue;
                        }
                        if (var550 == 4115) {
                            var5--;
                            int var249 = class63.field1126[var5];
                            class63.field1126[var5++] = class230.method1781((char) var249, 36) ? 1 : 0;
                            continue;
                        }
                        if (var550 == 4116) {
                            var5--;
                            int var250 = class63.field1126[var5];
                            class63.field1126[var5++] = class264.method2010((byte) 33, (char) var250) ? 1 : 0;
                            continue;
                        }
                        if (var550 == 4117) {
                            var3--;
                            String var251 = class340.field5429[var3];
                            if (var251 == null) {
                                class63.field1126[var5++] = 0;
                            } else {
                                class63.field1126[var5++] = var251.length();
                            }
                            continue;
                        }
                        if (var550 == 4118) {
                            var5 -= 2;
                            var3--;
                            String var252 = class340.field5429[var3];
                            int var253 = class63.field1126[var5];
                            int var254 = class63.field1126[var5 + 1];
                            class340.field5429[var3++] = var252.substring(var253, var254);
                            continue;
                        }
                        if (var550 == 4119) {
                            boolean var255 = false;
                            var3--;
                            String var256 = class340.field5429[var3];
                            StringBuffer var257 = new StringBuffer(var256.length());
                            for (int var258 = 0; var256.length() > var258; var258++) {
                                char var259 = var256.charAt(var258);
                                if (var259 == '<') {
                                    var255 = true;
                                } else if (var259 == '>') {
                                    var255 = false;
                                } else if (!var255) {
                                    var257.append(var259);
                                }
                            }
                            class340.field5429[var3++] = var257.toString();
                            continue;
                        }
                        if (var550 == 4120) {
                            var5 -= 2;
                            var3--;
                            String var260 = class340.field5429[var3];
                            int var261 = class63.field1126[var5];
                            int var262 = class63.field1126[var5 + 1];
                            class63.field1126[var5++] = var260.indexOf(var261, var262);
                            continue;
                        }
                        if (var550 == 4121) {
                            var3 -= 2;
                            String var263 = class340.field5429[var3];
                            var5--;
                            int var264 = class63.field1126[var5];
                            String var265 = class340.field5429[var3 + 1];
                            class63.field1126[var5++] = var263.indexOf(var265, var264);
                            continue;
                        }
                        if (var550 == 4122) {
                            var5--;
                            int var266 = class63.field1126[var5];
                            class63.field1126[var5++] = Character.toLowerCase((char) var266);
                            continue;
                        }
                        if (var550 == 4123) {
                            var5--;
                            int var267 = class63.field1126[var5];
                            class63.field1126[var5++] = Character.toUpperCase((char) var267);
                            continue;
                        }
                        if (var550 == 4124) {
                            var5--;
                            boolean var268 = class63.field1126[var5] != 0;
                            var5--;
                            int var269 = class63.field1126[var5];
                            class340.field5429[var3++] = class323.method2283(18, 0, class204.field3223, var268, (long) var269);
                            continue;
                        }
                    } else if (var550 < 4300) {
                        if (var550 == 4200) {
                            var5--;
                            int var270 = class63.field1126[var5];
                            class340.field5429[var3++] = class6.method22(var270, 16430).field871;
                            continue;
                        }
                        if (var550 == 4201) {
                            var5 -= 2;
                            int var271 = class63.field1126[var5];
                            int var272 = class63.field1126[var5 + 1];
                            class52 var273 = class6.method22(var271, 16430);
                            if (var272 >= 1 && var272 <= 5 && var273.field876[var272 - 1] != null) {
                                class340.field5429[var3++] = var273.field876[var272 - 1];
                                continue;
                            }
                            class340.field5429[var3++] = "";
                            continue;
                        }
                        if (var550 == 4202) {
                            var5 -= 2;
                            int var274 = class63.field1126[var5 + 1];
                            int var275 = class63.field1126[var5];
                            class52 var276 = class6.method22(var275, 16430);
                            if (var274 >= 1 && var274 <= 5 && var276.field845[var274 - 1] != null) {
                                class340.field5429[var3++] = var276.field845[var274 - 1];
                                continue;
                            }
                            class340.field5429[var3++] = "";
                            continue;
                        }
                        if (var550 == 4203) {
                            var5--;
                            int var277 = class63.field1126[var5];
                            class63.field1126[var5++] = class6.method22(var277, 16430).field865;
                            continue;
                        }
                        if (var550 == 4204) {
                            var5--;
                            int var278 = class63.field1126[var5];
                            class63.field1126[var5++] = class6.method22(var278, 16430).field884 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 4205) {
                            var5--;
                            int var279 = class63.field1126[var5];
                            class52 var280 = class6.method22(var279, 16430);
                            if (var280.field824 == -1 && var280.field863 >= 0) {
                                class63.field1126[var5++] = var280.field863;
                                continue;
                            }
                            class63.field1126[var5++] = var279;
                            continue;
                        }
                        if (var550 == 4206) {
                            var5--;
                            int var281 = class63.field1126[var5];
                            class52 var282 = class6.method22(var281, 16430);
                            if (var282.field824 >= 0 && var282.field863 >= 0) {
                                class63.field1126[var5++] = var282.field863;
                                continue;
                            }
                            class63.field1126[var5++] = var281;
                            continue;
                        }
                        if (var550 == 4207) {
                            var5--;
                            int var283 = class63.field1126[var5];
                            class63.field1126[var5++] = class6.method22(var283, 16430).field875 ? 1 : 0;
                            continue;
                        }
                        if (var550 == 4208) {
                            var5 -= 2;
                            int var284 = class63.field1126[var5 + 1];
                            int var285 = class63.field1126[var5];
                            class350 var286 = class113.method861((byte) 115, var284);
                            if (var286.method2460((byte) -9)) {
                                class340.field5429[var3++] = class6.method22(var285, 16430).method417(var286.field5568, var284, 0);
                            } else {
                                class63.field1126[var5++] = class6.method22(var285, 16430).method402(var286.field5554, var284, (byte) -2);
                            }
                            continue;
                        }
                        if (var550 == 4210) {
                            var3--;
                            String var287 = class340.field5429[var3];
                            var5--;
                            int var288 = class63.field1126[var5];
                            class223.method1695(var287, var288 == 1, false);
                            class63.field1126[var5++] = class248.field4051;
                            continue;
                        }
                        if (var550 == 4211) {
                            if (class17.field204 != null && class248.field4051 > class343.field5463) {
                                class63.field1126[var5++] = class343.method2418(class17.field204[class343.field5463++], 65535);
                                continue;
                            }
                            class63.field1126[var5++] = -1;
                            continue;
                        }
                        if (var550 == 4212) {
                            class343.field5463 = 0;
                            continue;
                        }
                    } else if (var550 < 4400) {
                        if (var550 == 4300) {
                            var5 -= 2;
                            int var289 = class63.field1126[var5];
                            int var290 = class63.field1126[var5 + 1];
                            class350 var291 = class113.method861((byte) 115, var290);
                            if (var291.method2460((byte) -9)) {
                                class340.field5429[var3++] = class222.method1683(-100, var289).method952(226, var291.field5568, var290);
                            } else {
                                class63.field1126[var5++] = class222.method1683(-118, var289).method962(-26346, var290, var291.field5554);
                            }
                            continue;
                        }
                    } else if (var550 >= 4500) {
                        if (var550 >= 4600) {
                            if (var550 < 5100) {
                                if (var550 == 5000) {
                                    class63.field1126[var5++] = class195.field3101;
                                    continue;
                                }
                                if (var550 == 5001) {
                                    var5 -= 3;
                                    class195.field3101 = class63.field1126[var5];
                                    class221.field3591 = class63.field1126[var5 + 1];
                                    class198.field3159 = class63.field1126[var5 + 2];
                                    class36.field520.method2228(36, 16547);
                                    class239.field3937++;
                                    class36.field520.method1712(class195.field3101, -97);
                                    class36.field520.method1712(class221.field3591, -87);
                                    class36.field520.method1712(class198.field3159, -118);
                                    continue;
                                }
                                if (var550 == 5002) {
                                    class293.field4735++;
                                    var3--;
                                    String var430 = class340.field5429[var3];
                                    var5 -= 2;
                                    int var431 = class63.field1126[var5];
                                    int var432 = class63.field1126[var5 + 1];
                                    class36.field520.method2228(217, 16547);
                                    class36.field520.method1712(class163.method1261(1, var430) + 2, -94);
                                    class36.field520.method1709(var430, (byte) -40);
                                    class36.field520.method1712(var431 - 1, -99);
                                    class36.field520.method1712(var432, -77);
                                    continue;
                                }
                                if (var550 == 5003) {
                                    var5--;
                                    int var433 = class63.field1126[var5];
                                    String var434 = null;
                                    if (var433 < 100) {
                                        var434 = class98.field1604[var433];
                                    }
                                    if (var434 == null) {
                                        var434 = "";
                                    }
                                    class340.field5429[var3++] = var434;
                                    continue;
                                }
                                if (var550 == 5004) {
                                    int var435 = -1;
                                    var5--;
                                    int var436 = class63.field1126[var5];
                                    if (var436 < 100 && class98.field1604[var436] != null) {
                                        var435 = class57.field962[var436];
                                    }
                                    class63.field1126[var5++] = var435;
                                    continue;
                                }
                                if (var550 == 5005) {
                                    class63.field1126[var5++] = class221.field3591;
                                    continue;
                                }
                                if (var550 == 5008) {
                                    var3--;
                                    String var437 = class340.field5429[var3];
                                    if (var437.startsWith("::")) {
                                        class279.method2065(1746, var437);
                                        continue;
                                    }
                                    if (class162.field2572 == 0 && (class322.field5124 && !class93.field1568 || class314.field4991)) {
                                        continue;
                                    }
                                    String var438 = var437.toLowerCase();
                                    class172.field2757++;
                                    byte var439 = 0;
                                    if (var438.startsWith(class191.field3057)) {
                                        var437 = var437.substring(class191.field3057.length());
                                        var439 = 0;
                                    } else if (var438.startsWith(class45.field700)) {
                                        var439 = 1;
                                        var437 = var437.substring(class45.field700.length());
                                    } else if (var438.startsWith(class206.field3251)) {
                                        var437 = var437.substring(class206.field3251.length());
                                        var439 = 2;
                                    } else if (var438.startsWith(class358.field5682)) {
                                        var439 = 3;
                                        var437 = var437.substring(class358.field5682.length());
                                    } else if (var438.startsWith(class319.field5088)) {
                                        var437 = var437.substring(class319.field5088.length());
                                        var439 = 4;
                                    } else if (var438.startsWith(class326.field5183)) {
                                        var437 = var437.substring(class326.field5183.length());
                                        var439 = 5;
                                    } else if (var438.startsWith(class45.field705)) {
                                        var437 = var437.substring(class45.field705.length());
                                        var439 = 6;
                                    } else if (var438.startsWith(class193.field3077)) {
                                        var437 = var437.substring(class193.field3077.length());
                                        var439 = 7;
                                    } else if (var438.startsWith(class41.field601)) {
                                        var439 = 8;
                                        var437 = var437.substring(class41.field601.length());
                                    } else if (var438.startsWith(class112.field1824)) {
                                        var437 = var437.substring(class112.field1824.length());
                                        var439 = 9;
                                    } else if (var438.startsWith(class267.field4478)) {
                                        var437 = var437.substring(class267.field4478.length());
                                        var439 = 10;
                                    } else if (var438.startsWith(class56.field949)) {
                                        var439 = 11;
                                        var437 = var437.substring(class56.field949.length());
                                    } else if (class204.field3223 != 0) {
                                        if (var438.startsWith(class350.field5559)) {
                                            var437 = var437.substring(class350.field5559.length());
                                            var439 = 0;
                                        } else if (var438.startsWith(class102.field1663)) {
                                            var437 = var437.substring(class102.field1663.length());
                                            var439 = 1;
                                        } else if (var438.startsWith(class285.field4659)) {
                                            var437 = var437.substring(class285.field4659.length());
                                            var439 = 2;
                                        } else if (var438.startsWith(class127.field2157)) {
                                            var437 = var437.substring(class127.field2157.length());
                                            var439 = 3;
                                        } else if (var438.startsWith(class7.field69)) {
                                            var439 = 4;
                                            var437 = var437.substring(class7.field69.length());
                                        } else if (var438.startsWith(class52.field861)) {
                                            var437 = var437.substring(class52.field861.length());
                                            var439 = 5;
                                        } else if (var438.startsWith(class215.field3439)) {
                                            var439 = 6;
                                            var437 = var437.substring(class215.field3439.length());
                                        } else if (var438.startsWith(class254.field4282)) {
                                            var439 = 7;
                                            var437 = var437.substring(class254.field4282.length());
                                        } else if (var438.startsWith(class258.field4338)) {
                                            var439 = 8;
                                            var437 = var437.substring(class258.field4338.length());
                                        } else if (var438.startsWith(class201.field3203)) {
                                            var439 = 9;
                                            var437 = var437.substring(class201.field3203.length());
                                        } else if (var438.startsWith(class326.field5181)) {
                                            var439 = 10;
                                            var437 = var437.substring(class326.field5181.length());
                                        } else if (var438.startsWith(class201.field3206)) {
                                            var439 = 11;
                                            var437 = var437.substring(class201.field3206.length());
                                        }
                                    }
                                    String var440 = var437.toLowerCase();
                                    byte var441 = 0;
                                    if (var440.startsWith(class7.field72)) {
                                        var437 = var437.substring(class7.field72.length());
                                        var441 = 1;
                                    } else if (var440.startsWith(class286.field4662)) {
                                        var441 = 2;
                                        var437 = var437.substring(class286.field4662.length());
                                    } else if (var440.startsWith(class129.field2181)) {
                                        var441 = 3;
                                        var437 = var437.substring(class129.field2181.length());
                                    } else if (var440.startsWith(class329.field5226)) {
                                        var441 = 4;
                                        var437 = var437.substring(class329.field5226.length());
                                    } else if (var440.startsWith(class25.field309)) {
                                        var437 = var437.substring(class25.field309.length());
                                        var441 = 5;
                                    } else if (class204.field3223 != 0) {
                                        if (var440.startsWith(class191.field3055)) {
                                            var441 = 1;
                                            var437 = var437.substring(class191.field3055.length());
                                        } else if (var440.startsWith(class257.field4314)) {
                                            var437 = var437.substring(class257.field4314.length());
                                            var441 = 2;
                                        } else if (var440.startsWith(class347.field5521)) {
                                            var437 = var437.substring(class347.field5521.length());
                                            var441 = 3;
                                        } else if (var440.startsWith(class355.field5637)) {
                                            var441 = 4;
                                            var437 = var437.substring(class355.field5637.length());
                                        } else if (var440.startsWith(class54.field898)) {
                                            var437 = var437.substring(class54.field898.length());
                                            var441 = 5;
                                        }
                                    }
                                    class36.field520.method2228(104, 16547);
                                    class36.field520.method1712(0, -65);
                                    int var442 = class36.field520.field3760;
                                    class36.field520.method1712(var439, -75);
                                    class36.field520.method1712(var441, -122);
                                    class353.method2497(class36.field520, var437, 0);
                                    class36.field520.method1739(-32423, class36.field520.field3760 - var442);
                                    continue;
                                }
                                if (var550 == 5009) {
                                    var3 -= 2;
                                    String var443 = class340.field5429[var3 + 1];
                                    String var444 = class340.field5429[var3];
                                    if (class162.field2572 != 0 || (!class322.field5124 || class93.field1568) && !class314.field4991) {
                                        class36.field520.method2228(13, 16547);
                                        class248.field4049++;
                                        class36.field520.method1712(0, -126);
                                        int var445 = class36.field520.field3760;
                                        class36.field520.method1709(var444, (byte) 104);
                                        class353.method2497(class36.field520, var443, 0);
                                        class36.field520.method1739(-32423, class36.field520.field3760 - var445);
                                    }
                                    continue;
                                }
                                if (var550 == 5010) {
                                    String var446 = null;
                                    var5--;
                                    int var447 = class63.field1126[var5];
                                    if (var447 < 100) {
                                        var446 = client.field728[var447];
                                    }
                                    if (var446 == null) {
                                        var446 = "";
                                    }
                                    class340.field5429[var3++] = var446;
                                    continue;
                                }
                                if (var550 == 5011) {
                                    var5--;
                                    int var448 = class63.field1126[var5];
                                    String var449 = null;
                                    if (var448 < 100) {
                                        var449 = class342.field5445[var448];
                                    }
                                    if (var449 == null) {
                                        var449 = "";
                                    }
                                    class340.field5429[var3++] = var449;
                                    continue;
                                }
                                if (var550 == 5012) {
                                    int var450 = -1;
                                    var5--;
                                    int var451 = class63.field1126[var5];
                                    if (var451 < 100) {
                                        var450 = class128.field2166[var451];
                                    }
                                    class63.field1126[var5++] = var450;
                                    continue;
                                }
                                if (var550 == 5015) {
                                    String var452;
                                    if (class6.field55 == null || class6.field55.field4340 == null) {
                                        var452 = class253.field4276;
                                    } else {
                                        var452 = class6.field55.method1975(true, 12473);
                                    }
                                    class340.field5429[var3++] = var452;
                                    continue;
                                }
                                if (var550 == 5018) {
                                    int var453 = 0;
                                    var5--;
                                    int var454 = class63.field1126[var5];
                                    if (var454 < 100 && class98.field1604[var454] != null) {
                                        var453 = class57.field962[var454];
                                    }
                                    class63.field1126[var5++] = var453;
                                    continue;
                                }
                                if (var550 == 5019) {
                                    var5--;
                                    int var455 = class63.field1126[var5];
                                    String var456 = null;
                                    if (var455 < 100) {
                                        var456 = class20.field229[var455];
                                    }
                                    if (var456 == null) {
                                        var456 = "";
                                    }
                                    class340.field5429[var3++] = var456;
                                    continue;
                                }
                                if (var550 == 5016) {
                                    class63.field1126[var5++] = class198.field3159;
                                    continue;
                                }
                                if (var550 == 5017) {
                                    class63.field1126[var5++] = class274.field4537;
                                    continue;
                                }
                                if (var550 == 5050) {
                                    var5--;
                                    int var457 = class63.field1126[var5];
                                    class340.field5429[var3++] = class124.method973(var457, (byte) 81).field5142;
                                    continue;
                                }
                                if (var550 == 5051) {
                                    var5--;
                                    int var458 = class63.field1126[var5];
                                    class323 var459 = class124.method973(var458, (byte) 41);
                                    if (var459.field5143 == null) {
                                        class63.field1126[var5++] = 0;
                                    } else {
                                        class63.field1126[var5++] = var459.field5143.length;
                                    }
                                    continue;
                                }
                                if (var550 == 5052) {
                                    var5 -= 2;
                                    int var460 = class63.field1126[var5];
                                    int var461 = class63.field1126[var5 + 1];
                                    class323 var462 = class124.method973(var460, (byte) 84);
                                    int var463 = var462.field5143[var461];
                                    class63.field1126[var5++] = var463;
                                    continue;
                                }
                                if (var550 == 5053) {
                                    var5--;
                                    int var464 = class63.field1126[var5];
                                    class323 var465 = class124.method973(var464, (byte) 108);
                                    if (var465.field5139 == null) {
                                        class63.field1126[var5++] = 0;
                                    } else {
                                        class63.field1126[var5++] = var465.field5139.length;
                                    }
                                    continue;
                                }
                                if (var550 == 5054) {
                                    var5 -= 2;
                                    int var466 = class63.field1126[var5];
                                    int var467 = class63.field1126[var5 + 1];
                                    class63.field1126[var5++] = class124.method973(var466, (byte) -126).field5139[var467];
                                    continue;
                                }
                                if (var550 == 5055) {
                                    var5--;
                                    int var468 = class63.field1126[var5];
                                    class340.field5429[var3++] = class326.method2298(4575, var468).method1015((byte) 86);
                                    continue;
                                }
                                if (var550 == 5056) {
                                    var5--;
                                    int var469 = class63.field1126[var5];
                                    class131 var470 = class326.method2298(4575, var469);
                                    if (var470.field2213 == null) {
                                        class63.field1126[var5++] = 0;
                                    } else {
                                        class63.field1126[var5++] = var470.field2213.length;
                                    }
                                    continue;
                                }
                                if (var550 == 5057) {
                                    var5 -= 2;
                                    int var471 = class63.field1126[var5 + 1];
                                    int var472 = class63.field1126[var5];
                                    class63.field1126[var5++] = class326.method2298(4575, var472).field2213[var471];
                                    continue;
                                }
                                if (var550 == 5058) {
                                    class149.field2385 = new class243();
                                    var5--;
                                    class149.field2385.field4000 = class63.field1126[var5];
                                    class149.field2385.field3999 = class326.method2298(4575, class149.field2385.field4000);
                                    class149.field2385.field4002 = new int[class149.field2385.field3999.method1002(-109)];
                                    continue;
                                }
                                if (var550 == 5059) {
                                    class109.field1798++;
                                    class36.field520.method2228(40, 16547);
                                    class36.field520.method1712(0, -89);
                                    int var473 = class36.field520.field3760;
                                    class36.field520.method1712(0, -108);
                                    class36.field520.method1729(class149.field2385.field4000, 206);
                                    class149.field2385.field3999.method1003(class149.field2385.field4002, (byte) -59, class36.field520);
                                    class36.field520.method1739(-32423, class36.field520.field3760 - var473);
                                    continue;
                                }
                                if (var550 == 5060) {
                                    var3--;
                                    String var474 = class340.field5429[var3];
                                    class36.field520.method2228(159, 16547);
                                    class36.field520.method1712(0, -116);
                                    int var475 = class36.field520.field3760;
                                    class81.field1394++;
                                    class36.field520.method1709(var474, (byte) -98);
                                    class36.field520.method1729(class149.field2385.field4000, 206);
                                    class149.field2385.field3999.method1003(class149.field2385.field4002, (byte) -85, class36.field520);
                                    class36.field520.method1739(-32423, class36.field520.field3760 - var475);
                                    continue;
                                }
                                if (var550 == 5061) {
                                    class109.field1798++;
                                    class36.field520.method2228(40, 16547);
                                    class36.field520.method1712(0, -105);
                                    int var476 = class36.field520.field3760;
                                    class36.field520.method1712(1, -56);
                                    class36.field520.method1729(class149.field2385.field4000, 206);
                                    class149.field2385.field3999.method1003(class149.field2385.field4002, (byte) -22, class36.field520);
                                    class36.field520.method1739(-32423, class36.field520.field3760 - var476);
                                    continue;
                                }
                                if (var550 == 5062) {
                                    var5 -= 2;
                                    int var477 = class63.field1126[var5];
                                    int var478 = class63.field1126[var5 + 1];
                                    class63.field1126[var5++] = class124.method973(var477, (byte) 63).field5136[var478];
                                    continue;
                                }
                                if (var550 == 5063) {
                                    var5 -= 2;
                                    int var479 = class63.field1126[var5];
                                    int var480 = class63.field1126[var5 + 1];
                                    class63.field1126[var5++] = class124.method973(var479, (byte) 85).field5144[var480];
                                    continue;
                                }
                                if (var550 == 5064) {
                                    var5 -= 2;
                                    int var481 = class63.field1126[var5];
                                    int var482 = class63.field1126[var5 + 1];
                                    if (var482 == -1) {
                                        class63.field1126[var5++] = -1;
                                    } else {
                                        class63.field1126[var5++] = class124.method973(var481, (byte) -71).method2277(-123, (char) var482);
                                    }
                                    continue;
                                }
                                if (var550 == 5065) {
                                    var5 -= 2;
                                    int var483 = class63.field1126[var5];
                                    int var484 = class63.field1126[var5 + 1];
                                    if (var484 == -1) {
                                        class63.field1126[var5++] = -1;
                                    } else {
                                        class63.field1126[var5++] = class124.method973(var483, (byte) -68).method2284(-9650, (char) var484);
                                    }
                                    continue;
                                }
                                if (var550 == 5066) {
                                    var5--;
                                    int var485 = class63.field1126[var5];
                                    class63.field1126[var5++] = class326.method2298(4575, var485).method1002(-110);
                                    continue;
                                }
                                if (var550 == 5067) {
                                    var5 -= 2;
                                    int var486 = class63.field1126[var5];
                                    int var487 = class63.field1126[var5 + 1];
                                    int var488 = class326.method2298(4575, var486).method1011(false, var487);
                                    class63.field1126[var5++] = var488;
                                    continue;
                                }
                                if (var550 == 5068) {
                                    var5 -= 2;
                                    int var489 = class63.field1126[var5];
                                    int var490 = class63.field1126[var5 + 1];
                                    class149.field2385.field4002[var489] = var490;
                                    continue;
                                }
                                if (var550 == 5069) {
                                    var5 -= 2;
                                    int var491 = class63.field1126[var5];
                                    int var492 = class63.field1126[var5 + 1];
                                    class149.field2385.field4002[var491] = var492;
                                    continue;
                                }
                                if (var550 == 5070) {
                                    var5 -= 3;
                                    int var493 = class63.field1126[var5 + 1];
                                    int var494 = class63.field1126[var5];
                                    int var495 = class63.field1126[var5 + 2];
                                    class131 var496 = class326.method2298(4575, var494);
                                    if (var496.method1011(false, var493) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class63.field1126[var5++] = var496.method1007(var493, 0, var495);
                                    continue;
                                }
                                if (var550 == 5071) {
                                    var3--;
                                    String var497 = class340.field5429[var3];
                                    var5--;
                                    boolean var498 = class63.field1126[var5] == 1;
                                    class172.method1353(var498, var497, (byte) -88);
                                    class63.field1126[var5++] = class248.field4051;
                                    continue;
                                }
                                if (var550 == 5072) {
                                    if (class17.field204 != null && class248.field4051 > class343.field5463) {
                                        class63.field1126[var5++] = class343.method2418(class17.field204[class343.field5463++], 65535);
                                        continue;
                                    }
                                    class63.field1126[var5++] = -1;
                                    continue;
                                }
                                if (var550 == 5073) {
                                    class343.field5463 = 0;
                                    continue;
                                }
                            } else if (var550 < 5200) {
                                if (var550 == 5100) {
                                    if (class240.field3972[86]) {
                                        class63.field1126[var5++] = 1;
                                    } else {
                                        class63.field1126[var5++] = 0;
                                    }
                                    continue;
                                }
                                if (var550 == 5101) {
                                    if (class240.field3972[82]) {
                                        class63.field1126[var5++] = 1;
                                    } else {
                                        class63.field1126[var5++] = 0;
                                    }
                                    continue;
                                }
                                if (var550 == 5102) {
                                    if (class240.field3972[81]) {
                                        class63.field1126[var5++] = 1;
                                    } else {
                                        class63.field1126[var5++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var550 < 5300) {
                                if (var550 == 5200) {
                                    var5--;
                                    class52.method405(-51, class63.field1126[var5]);
                                    continue;
                                }
                                if (var550 == 5201) {
                                    class63.field1126[var5++] = class101.method787(-101);
                                    continue;
                                }
                                if (var550 == 5205) {
                                    var5--;
                                    class307.method2188(23881, false, class63.field1126[var5], -1, -1);
                                    continue;
                                }
                                if (var550 == 5206) {
                                    var5--;
                                    int var383 = class63.field1126[var5];
                                    class104 var384 = class174.method1371(var383 >> 14 & 0x3FFF, var383 & 0x3FFF);
                                    if (var384 == null) {
                                        class63.field1126[var5++] = -1;
                                    } else {
                                        class63.field1126[var5++] = var384.field1684;
                                    }
                                    continue;
                                }
                                if (var550 == 5207) {
                                    var5--;
                                    class104 var385 = class174.method1361(class63.field1126[var5]);
                                    if (var385 != null && var385.field1688 != null) {
                                        class340.field5429[var3++] = var385.field1688;
                                        continue;
                                    }
                                    class340.field5429[var3++] = "";
                                    continue;
                                }
                                if (var550 == 5208) {
                                    class63.field1126[var5++] = class342.field5446;
                                    class63.field1126[var5++] = class56.field915;
                                    continue;
                                }
                                if (var550 == 5209) {
                                    class63.field1126[var5++] = class350.field5551 + class174.field2772;
                                    class63.field1126[var5++] = class174.field2780 + class174.field2773 - class208.field3268 - 1;
                                    continue;
                                }
                                if (var550 == 5210) {
                                    var5--;
                                    int var386 = class63.field1126[var5];
                                    class104 var387 = class174.method1361(var386);
                                    if (var387 == null) {
                                        class63.field1126[var5++] = 0;
                                        class63.field1126[var5++] = 0;
                                    } else {
                                        class63.field1126[var5++] = class343.method2418(16383, var387.field1679 >> 14);
                                        class63.field1126[var5++] = class343.method2418(16383, var387.field1679);
                                    }
                                    continue;
                                }
                                if (var550 == 5211) {
                                    var5--;
                                    int var388 = class63.field1126[var5];
                                    class104 var389 = class174.method1361(var388);
                                    if (var389 == null) {
                                        class63.field1126[var5++] = 0;
                                        class63.field1126[var5++] = 0;
                                    } else {
                                        class63.field1126[var5++] = var389.field1676 - var389.field1699;
                                        class63.field1126[var5++] = var389.field1696 - var389.field1685;
                                    }
                                    continue;
                                }
                                if (var550 == 5212) {
                                    class59 var390 = class285.method2078((byte) 92);
                                    if (var390 == null) {
                                        class63.field1126[var5++] = -1;
                                        class63.field1126[var5++] = -1;
                                    } else {
                                        class63.field1126[var5++] = var390.field1011;
                                        int var391 = var390.field1012 << 28 | class174.field2772 + var390.field1015 << 14 | class174.field2780 + class174.field2773 - var390.field1008 - 1;
                                        class63.field1126[var5++] = var391;
                                    }
                                    continue;
                                }
                                if (var550 == 5213) {
                                    class59 var392 = class57.method460(true);
                                    if (var392 == null) {
                                        class63.field1126[var5++] = -1;
                                        class63.field1126[var5++] = -1;
                                    } else {
                                        class63.field1126[var5++] = var392.field1011;
                                        int var393 = class174.field2780 + class174.field2773 - var392.field1008 - 1 | class174.field2772 + var392.field1015 << 14 | var392.field1012 << 28;
                                        class63.field1126[var5++] = var393;
                                    }
                                    continue;
                                }
                                if (var550 == 5214) {
                                    var5--;
                                    int var394 = class63.field1126[var5];
                                    class104 var395 = class7.method35((byte) -85);
                                    if (var395 != null) {
                                        boolean var396 = var395.method801(var394 & 0x3FFF, 0, class221.field3597, (var394 & 0xFFFEA3A) >> 14, var394 >> 28 & 0x3);
                                        if (var396) {
                                            class350.method2463(class221.field3597[1], class221.field3597[2], 1);
                                        }
                                    }
                                    continue;
                                }
                                if (var550 == 5215) {
                                    var5 -= 2;
                                    int var397 = class63.field1126[var5 + 1];
                                    boolean var398 = false;
                                    int var399 = class63.field1126[var5];
                                    class116 var400 = class174.method1372(var399 >> 14 & 0x3FFF, var399 & 0x3FFF);
                                    for (class104 var401 = (class104) var400.method912(false); var401 != null; var401 = (class104) var400.method909(-123)) {
                                        if (var401.field1684 == var397) {
                                            var398 = true;
                                            break;
                                        }
                                    }
                                    if (var398) {
                                        class63.field1126[var5++] = 1;
                                    } else {
                                        class63.field1126[var5++] = 0;
                                    }
                                    continue;
                                }
                                if (var550 == 5218) {
                                    var5--;
                                    int var402 = class63.field1126[var5];
                                    class104 var403 = class174.method1361(var402);
                                    if (var403 == null) {
                                        class63.field1126[var5++] = -1;
                                    } else {
                                        class63.field1126[var5++] = var403.field1700;
                                    }
                                    continue;
                                }
                                if (var550 == 5220) {
                                    class63.field1126[var5++] = class35.field509 == 100 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 5221) {
                                    var5--;
                                    int var404 = class63.field1126[var5];
                                    class350.method2463((var404 & 0xFFFCD64) >> 14, var404 & 0x3FFF, 1);
                                    continue;
                                }
                                if (var550 == 5222) {
                                    class104 var405 = class7.method35((byte) -90);
                                    if (var405 == null) {
                                        class63.field1126[var5++] = -1;
                                        class63.field1126[var5++] = -1;
                                    } else {
                                        boolean var406 = var405.method802((byte) 43, class221.field3597, class174.field2780 + class174.field2773 - class208.field3268 - 1, class350.field5551 + class174.field2772);
                                        if (var406) {
                                            class63.field1126[var5++] = class221.field3597[1];
                                            class63.field1126[var5++] = class221.field3597[2];
                                        } else {
                                            class63.field1126[var5++] = -1;
                                            class63.field1126[var5++] = -1;
                                        }
                                    }
                                    continue;
                                }
                                if (var550 == 5223) {
                                    var5 -= 2;
                                    int var407 = class63.field1126[var5 + 1];
                                    int var408 = class63.field1126[var5];
                                    class307.method2188(23881, false, var408, var407 & 0x3FFF, var407 >> 14 & 0x3FFF);
                                    continue;
                                }
                                if (var550 == 5224) {
                                    var5--;
                                    int var409 = class63.field1126[var5];
                                    class104 var410 = class7.method35((byte) -105);
                                    if (var410 == null) {
                                        class63.field1126[var5++] = -1;
                                        class63.field1126[var5++] = -1;
                                    } else {
                                        boolean var411 = var410.method801(var409 & 0x3FFF, 0, class221.field3597, (var409 & 0xFFFD0B1) >> 14, (var409 & 0x3CF4B21F) >> 28);
                                        if (var411) {
                                            class63.field1126[var5++] = class221.field3597[1];
                                            class63.field1126[var5++] = class221.field3597[2];
                                        } else {
                                            class63.field1126[var5++] = -1;
                                            class63.field1126[var5++] = -1;
                                        }
                                    }
                                    continue;
                                }
                                if (var550 == 5225) {
                                    var5--;
                                    int var412 = class63.field1126[var5];
                                    class104 var413 = class7.method35((byte) -113);
                                    if (var413 == null) {
                                        class63.field1126[var5++] = -1;
                                        class63.field1126[var5++] = -1;
                                    } else {
                                        boolean var414 = var413.method802((byte) 48, class221.field3597, var412 & 0x3FFF, (var412 & 0xFFFC704) >> 14);
                                        if (var414) {
                                            class63.field1126[var5++] = class221.field3597[1];
                                            class63.field1126[var5++] = class221.field3597[2];
                                        } else {
                                            class63.field1126[var5++] = -1;
                                            class63.field1126[var5++] = -1;
                                        }
                                    }
                                    continue;
                                }
                                if (var550 == 5226) {
                                    var5--;
                                    client.method335((byte) -72, class63.field1126[var5]);
                                    continue;
                                }
                                if (var550 == 5227) {
                                    var5 -= 2;
                                    int var415 = class63.field1126[var5];
                                    int var416 = class63.field1126[var5 + 1];
                                    class307.method2188(23881, true, var415, var416 & 0x3FFF, var416 >> 14 & 0x3FFF);
                                    continue;
                                }
                                if (var550 == 5228) {
                                    var5--;
                                    class227.field3799 = class63.field1126[var5] == 1;
                                    continue;
                                }
                                if (var550 == 5229) {
                                    class63.field1126[var5++] = class227.field3799 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 5230) {
                                    var5--;
                                    int var417 = class63.field1126[var5];
                                    class164.method1271(var417, -2541);
                                    continue;
                                }
                                if (var550 == 5231) {
                                    var5 -= 2;
                                    int var418 = class63.field1126[var5];
                                    boolean var419 = class63.field1126[var5 + 1] == 1;
                                    if (class327.field5194 == null) {
                                        continue;
                                    }
                                    class45 var420 = class327.field5194.method1268(122, (long) var418);
                                    if (var420 != null && !var419) {
                                        var420.method330(15);
                                        continue;
                                    }
                                    if (var420 == null && var419) {
                                        class45 var421 = new class45();
                                        class327.field5194.method1273(1, (long) var418, var421);
                                    }
                                    continue;
                                }
                                if (var550 == 5232) {
                                    var5--;
                                    int var422 = class63.field1126[var5];
                                    if (class327.field5194 == null) {
                                        class63.field1126[var5++] = 0;
                                    } else {
                                        class45 var423 = class327.field5194.method1268(94, (long) var422);
                                        class63.field1126[var5++] = var423 == null ? 0 : 1;
                                    }
                                    continue;
                                }
                                if (var550 == 5233) {
                                    var5 -= 2;
                                    int var424 = class63.field1126[var5];
                                    boolean var425 = class63.field1126[var5 + 1] == 1;
                                    if (class193.field3074 == null) {
                                        continue;
                                    }
                                    class45 var426 = class193.field3074.method1268(-88, (long) var424);
                                    if (var426 != null && !var425) {
                                        var426.method330(15);
                                        continue;
                                    }
                                    if (var426 == null && var425) {
                                        class45 var427 = new class45();
                                        class193.field3074.method1273(1, (long) var424, var427);
                                    }
                                    continue;
                                }
                                if (var550 == 5234) {
                                    var5--;
                                    int var428 = class63.field1126[var5];
                                    if (class193.field3074 == null) {
                                        class63.field1126[var5++] = 0;
                                    } else {
                                        class45 var429 = class193.field3074.method1268(-94, (long) var428);
                                        class63.field1126[var5++] = var429 == null ? 0 : 1;
                                    }
                                    continue;
                                }
                                if (var550 == 5235) {
                                    class63.field1126[var5++] = class174.field2777 == null ? -1 : class174.field2777.field1684;
                                    continue;
                                }
                            } else if (var550 < 5400) {
                                if (var550 == 5300) {
                                    var5 -= 2;
                                    int var370 = class63.field1126[var5];
                                    int var371 = class63.field1126[var5 + 1];
                                    class272.method2043(3, var371, var370, false, -1);
                                    class63.field1126[var5++] = class89.field1502 == null ? 0 : 1;
                                    continue;
                                }
                                if (var550 == 5301) {
                                    if (class89.field1502 != null) {
                                        class272.method2043(class267.field4462, -1, -1, false, -1);
                                    }
                                    continue;
                                }
                                if (var550 == 5302) {
                                    class16[] var372 = class135.method1029((byte) 58);
                                    class63.field1126[var5++] = var372.length;
                                    continue;
                                }
                                if (var550 == 5303) {
                                    var5--;
                                    int var373 = class63.field1126[var5];
                                    class16[] var374 = class135.method1029((byte) -110);
                                    class63.field1126[var5++] = var374[var373].field182;
                                    class63.field1126[var5++] = var374[var373].field183;
                                    continue;
                                }
                                if (var550 == 5305) {
                                    int var375 = class231.field3837;
                                    int var376 = -1;
                                    int var377 = class137.field2274;
                                    class16[] var378 = class135.method1029((byte) 61);
                                    for (int var379 = 0; var379 < var378.length; var379++) {
                                        class16 var380 = var378[var379];
                                        if (var380.field182 == var377 && var380.field183 == var375) {
                                            var376 = var379;
                                            break;
                                        }
                                    }
                                    class63.field1126[var5++] = var376;
                                    continue;
                                }
                                if (var550 == 5306) {
                                    class63.field1126[var5++] = class275.method2052((byte) -115);
                                    continue;
                                }
                                if (var550 == 5307) {
                                    var5--;
                                    int var381 = class63.field1126[var5];
                                    if (var381 < 0 || var381 > 2) {
                                        var381 = 0;
                                    }
                                    class272.method2043(var381, -1, -1, false, -1);
                                    continue;
                                }
                                if (var550 == 5308) {
                                    class63.field1126[var5++] = class267.field4462;
                                    continue;
                                }
                                if (var550 == 5309) {
                                    var5--;
                                    int var382 = class63.field1126[var5];
                                    if (var382 < 0 || var382 > 2) {
                                        var382 = 0;
                                    }
                                    class267.field4462 = var382;
                                    class16.method87(class128.field2163, (byte) -64);
                                    continue;
                                }
                            } else if (var550 < 5500) {
                                if (var550 == 5400) {
                                    class38.field568++;
                                    var3 -= 2;
                                    String var348 = class340.field5429[var3];
                                    String var349 = class340.field5429[var3 + 1];
                                    var5--;
                                    int var350 = class63.field1126[var5];
                                    class36.field520.method2228(185, 16547);
                                    class36.field520.method1712((class163.method1261(1, var348) + class163.method1261(1, var349)) + 1, -99);
                                    class36.field520.method1709(var348, (byte) 117);
                                    class36.field520.method1709(var349, (byte) -62);
                                    class36.field520.method1712(var350, -80);
                                    continue;
                                }
                                if (var550 == 5401) {
                                    var5 -= 2;
                                    class20.field227[class63.field1126[var5]] = (short) class112.method854((byte) -87, class63.field1126[var5 + 1]);
                                    class211.method1593((byte) 39);
                                    class122.method965(0);
                                    class32.method223((byte) -125);
                                    class200.method1539(-13412);
                                    class14.method82(19775);
                                    continue;
                                }
                                if (var550 == 5405) {
                                    var5 -= 2;
                                    int var351 = class63.field1126[var5];
                                    int var352 = class63.field1126[var5 + 1];
                                    if (var351 >= 0 && var351 < 2) {
                                        class339.field5412[var351] = new int[var352 << 1][4];
                                    }
                                    continue;
                                }
                                if (var550 == 5406) {
                                    var5 -= 7;
                                    int var353 = class63.field1126[var5];
                                    int var354 = class63.field1126[var5 + 2];
                                    int var355 = class63.field1126[var5 + 1] << 1;
                                    int var356 = class63.field1126[var5 + 3];
                                    int var357 = class63.field1126[var5 + 4];
                                    int var358 = class63.field1126[var5 + 5];
                                    int var359 = class63.field1126[var5 + 6];
                                    if (var353 >= 0 && var353 < 2 && class339.field5412[var353] != null && var355 >= 0 && class339.field5412[var353].length > var355) {
                                        class339.field5412[var353][var355] = new int[] { class343.method2418(var354 >> 14, 16383) * 128, var356, class343.method2418(16383, var354) * 128, var359 };
                                        class339.field5412[var353][var355 + 1] = new int[] { (class343.method2418(268423250, var357) >> 14) * 128, var358, class343.method2418(16383, var357) * 128 };
                                    }
                                    continue;
                                }
                                if (var550 == 5407) {
                                    var5--;
                                    int var360 = class339.field5412[class63.field1126[var5]].length >> 1;
                                    class63.field1126[var5++] = var360;
                                    continue;
                                }
                                if (var550 == 5411) {
                                    if (class89.field1502 != null) {
                                        class272.method2043(class267.field4462, -1, -1, false, -1);
                                    }
                                    if (class241.field3994 == null) {
                                        class342.method2413(class125.method976((byte) -61), false, 4940);
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var550 == 5419) {
                                    String var361 = "";
                                    if (class195.field3102 != null) {
                                        if (class195.field3102.field3066 == null) {
                                            var361 = class294.method2118(class195.field3102.field3061, -116);
                                        } else {
                                            var361 = (String) class195.field3102.field3066;
                                        }
                                    }
                                    class340.field5429[var3++] = var361;
                                    continue;
                                }
                                if (var550 == 5420) {
                                    class63.field1126[var5++] = class145.field2343 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 5421) {
                                    if (class89.field1502 != null) {
                                        class272.method2043(class267.field4462, -1, -1, false, -1);
                                    }
                                    var5--;
                                    boolean var362 = class63.field1126[var5] == 1;
                                    var3--;
                                    String var363 = class340.field5429[var3];
                                    String var364 = class125.method976((byte) -119) + var363;
                                    if (class241.field3994 != null || var362 && class145.field2343 != 3 && class145.field2360.startsWith("win") && !class247.field4046) {
                                        class25.field305 = var362;
                                        class311.field4955 = var364;
                                        class66.field1176 = class128.field2163.method1117((byte) 44, var364);
                                        continue;
                                    }
                                    class342.method2413(var364, var362, 4940);
                                    continue;
                                }
                                if (var550 == 5422) {
                                    var5--;
                                    int var365 = class63.field1126[var5];
                                    var3 -= 2;
                                    String var366 = class340.field5429[var3 + 1];
                                    String var367 = class340.field5429[var3];
                                    if (var367.length() > 0) {
                                        if (class19.field213 == null) {
                                            class19.field213 = new String[class140.field2303[class131.field2212]];
                                        }
                                        class19.field213[var365] = var367;
                                    }
                                    if (var366.length() > 0) {
                                        if (class75.field1279 == null) {
                                            class75.field1279 = new String[class140.field2303[class131.field2212]];
                                        }
                                        class75.field1279[var365] = var366;
                                    }
                                    continue;
                                }
                                if (var550 == 5423) {
                                    var3--;
                                    System.out.println(class340.field5429[var3]);
                                    continue;
                                }
                                if (var550 == 5424) {
                                    var5 -= 11;
                                    class29.field370 = class63.field1126[var5];
                                    class227.field3795 = class63.field1126[var5 + 1];
                                    class342.field5450 = class63.field1126[var5 + 2];
                                    class288.field4686 = class63.field1126[var5 + 3];
                                    class222.field3652 = class63.field1126[var5 + 4];
                                    class281.field4611 = class63.field1126[var5 + 5];
                                    class130.field2199 = class63.field1126[var5 + 6];
                                    class190.field3047 = class63.field1126[var5 + 7];
                                    class216.field3461 = class63.field1126[var5 + 8];
                                    class63.field1127 = class63.field1126[var5 + 9];
                                    class84.field1430 = class63.field1126[var5 + 10];
                                    class76.field1305.method452(class222.field3652, (byte) -120);
                                    class76.field1305.method452(class281.field4611, (byte) 124);
                                    class76.field1305.method452(class130.field2199, (byte) -127);
                                    class76.field1305.method452(class190.field3047, (byte) -121);
                                    class76.field1305.method452(class216.field3461, (byte) 44);
                                    class253.field4271 = true;
                                    continue;
                                }
                                if (var550 == 5425) {
                                    class255.method1967(-1);
                                    class253.field4271 = false;
                                    continue;
                                }
                                if (var550 == 5426) {
                                    var5--;
                                    class320.field5096 = class63.field1126[var5];
                                    continue;
                                }
                                if (var550 == 5427) {
                                    var5 -= 2;
                                    class129.field2193 = class63.field1126[var5];
                                    class121.field2082 = class63.field1126[var5 + 1];
                                    continue;
                                }
                                if (var550 == 5428) {
                                    var5 -= 2;
                                    int var368 = class63.field1126[var5 + 1];
                                    int var369 = class63.field1126[var5];
                                    class63.field1126[var5++] = class172.method1350(var369, -128, var368) ? 1 : 0;
                                    continue;
                                }
                            } else if (var550 < 5600) {
                                if (var550 == 5500) {
                                    var5 -= 4;
                                    int var331 = class63.field1126[var5 + 1];
                                    int var332 = class63.field1126[var5];
                                    int var333 = class63.field1126[var5 + 2];
                                    int var334 = class63.field1126[var5 + 3];
                                    class19.method110((var332 & 0x3FFF) - class275.field4546, var334, (var332 >> 14 & 0x3FFF) - class93.field1562, false, var333, var331, (byte) -63);
                                    continue;
                                }
                                if (var550 == 5501) {
                                    var5 -= 4;
                                    int var335 = class63.field1126[var5];
                                    int var336 = class63.field1126[var5 + 2];
                                    int var337 = class63.field1126[var5 + 3];
                                    int var338 = class63.field1126[var5 + 1];
                                    class19.method105(var338, (var335 & 0x3FFF) - class275.field4546, -129, var337, var336, (var335 >> 14 & 0x3FFF) - class93.field1562);
                                    continue;
                                }
                                if (var550 == 5502) {
                                    var5 -= 6;
                                    int var339 = class63.field1126[var5];
                                    if (var339 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class195.field3106 = var339;
                                    int var340 = class63.field1126[var5 + 1];
                                    if (class339.field5412[class195.field3106].length >> 1 <= var340 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class208.field3273 = var340;
                                    class353.field5596 = 0;
                                    class252.field4260 = class63.field1126[var5 + 2];
                                    class340.field5432 = class63.field1126[var5 + 3];
                                    int var341 = class63.field1126[var5 + 4];
                                    if (var341 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class317.field5053 = var341;
                                    int var342 = class63.field1126[var5 + 5];
                                    if (class339.field5412[class317.field5053].length >> 1 <= var342 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class285.field4655 = var342;
                                    class112.field1827 = 3;
                                    continue;
                                }
                                if (var550 == 5503) {
                                    class317.method2243(0);
                                    continue;
                                }
                                if (var550 == 5504) {
                                    var5 -= 2;
                                    class38.method248(class63.field1126[var5 + 1], class63.field1126[var5], -3);
                                    continue;
                                }
                                if (var550 == 5505) {
                                    class63.field1126[var5++] = (int) class84.field1426;
                                    continue;
                                }
                                if (var550 == 5506) {
                                    class63.field1126[var5++] = (int) class261.field4396;
                                    continue;
                                }
                                if (var550 == 5507) {
                                    class43.method313(61);
                                    continue;
                                }
                                if (var550 == 5508) {
                                    class311.method2212((byte) 4);
                                    continue;
                                }
                                if (var550 == 5509) {
                                    class187.method1469((byte) 107);
                                    continue;
                                }
                                if (var550 == 5510) {
                                    class362.method2539(710);
                                    continue;
                                }
                                if (var550 == 5511) {
                                    var5--;
                                    int var343 = class63.field1126[var5];
                                    int var344 = var343 & 0x3FFF;
                                    int var345 = (var343 & 0xFFFE728) >> 14;
                                    int var346 = var344 - class275.field4546;
                                    if (var346 < 0) {
                                        var346 = 0;
                                    } else if (var346 >= 104) {
                                        var346 = 104;
                                    }
                                    class240.field3954 = var346 * 128 + 64;
                                    class112.field1827 = 4;
                                    int var347 = var345 - class93.field1562;
                                    if (var347 < 0) {
                                        var347 = 0;
                                    } else if (var347 >= 104) {
                                        var347 = 104;
                                    }
                                    class350.field5565 = var347 * 128 + 64;
                                    continue;
                                }
                                if (var550 == 5512) {
                                    class194.method1503((byte) -49);
                                    continue;
                                }
                            } else if (var550 < 5700) {
                                if (var550 == 5600) {
                                    var3 -= 2;
                                    String var327 = class340.field5429[var3];
                                    String var328 = class340.field5429[var3 + 1];
                                    var5--;
                                    int var329 = class63.field1126[var5];
                                    if (class259.field4362 == 10 && class327.field5197 == 0 && class4.field42 == 0 && class20.field231 == 0 && class198.field3160 == 0) {
                                        class307.method2186(var329, var328, var327, 0);
                                    }
                                    continue;
                                }
                                if (var550 == 5601) {
                                    class41.method267(false);
                                    continue;
                                }
                                if (var550 == 5602) {
                                    if (class4.field42 == 0) {
                                        class46.field736 = -2;
                                    }
                                    continue;
                                }
                                if (var550 == 5603) {
                                    var5 -= 4;
                                    if (class259.field4362 == 10 && class327.field5197 == 0 && class4.field42 == 0 && class20.field231 == 0 && class198.field3160 == 0) {
                                        class327.method2309(class63.field1126[var5], class63.field1126[var5 + 3], class63.field1126[var5 + 1], -2760, class63.field1126[var5 + 2]);
                                    }
                                    continue;
                                }
                                if (var550 == 5604) {
                                    var3--;
                                    if (class259.field4362 == 10 && class327.field5197 == 0 && class4.field42 == 0 && class20.field231 == 0 && class198.field3160 == 0) {
                                        class348.method2436((byte) -93, class134.method1024(-25963, class340.field5429[var3]));
                                    }
                                    continue;
                                }
                                if (var550 == 5605) {
                                    var3 -= 3;
                                    var5 -= 7;
                                    if (class259.field4362 == 10 && class327.field5197 == 0 && class4.field42 == 0 && class20.field231 == 0 && class198.field3160 == 0) {
                                        class24.method158(class340.field5429[var3 + 1], class63.field1126[var5 + 4] == 1, class63.field1126[var5 + 1], 1, class63.field1126[var5 + 6] == 1, class63.field1126[var5], class63.field1126[var5 + 5] == 1, class134.method1024(-25963, class340.field5429[var3]), class340.field5429[var3 + 2], class63.field1126[var5 + 2], class63.field1126[var5 + 3]);
                                    }
                                    continue;
                                }
                                if (var550 == 5606) {
                                    if (class20.field231 == 0) {
                                        class138.field2278 = -2;
                                    }
                                    continue;
                                }
                                if (var550 == 5607) {
                                    class63.field1126[var5++] = class46.field736;
                                    continue;
                                }
                                if (var550 == 5608) {
                                    class63.field1126[var5++] = class23.field281;
                                    continue;
                                }
                                if (var550 == 5609) {
                                    class63.field1126[var5++] = class138.field2278;
                                    continue;
                                }
                                if (var550 == 5610) {
                                    for (int var330 = 0; var330 < 5; var330++) {
                                        class340.field5429[var3++] = var330 < class35.field507.length ? class260.method1983(class35.field507[var330], -2) : "";
                                    }
                                    class35.field507 = null;
                                    continue;
                                }
                                if (var550 == 5611) {
                                    class63.field1126[var5++] = class253.field4270;
                                    continue;
                                }
                            } else if (var550 < 6100) {
                                if (var550 == 6001) {
                                    var5--;
                                    int var317 = class63.field1126[var5];
                                    if (var317 < 1) {
                                        var317 = 1;
                                    }
                                    if (var317 > 4) {
                                        var317 = 4;
                                    }
                                    class166.field2649 = var317;
                                    if (!class42.field607 || !field36) {
                                        if (class166.field2649 == 1) {
                                            class153.method1181(0.9F);
                                        }
                                        if (class166.field2649 == 2) {
                                            class153.method1181(0.8F);
                                        }
                                        if (class166.field2649 == 3) {
                                            class153.method1181(0.7F);
                                        }
                                        if (class166.field2649 == 4) {
                                            class153.method1181(0.6F);
                                        }
                                    }
                                    if (class42.field607) {
                                        class74.method621(-112);
                                        if (!field36) {
                                            class81.method659(26326);
                                        }
                                    }
                                    class122.method965(0);
                                    class16.method87(class128.field2163, (byte) -64);
                                    class302.field4861 = false;
                                    continue;
                                }
                                if (var550 == 6002) {
                                    var5--;
                                    class73.method614(false, class63.field1126[var5] == 1);
                                    class340.method2395(-18581);
                                    class81.method659(26326);
                                    class135.method1032(9436);
                                    class16.method87(class128.field2163, (byte) -64);
                                    class302.field4861 = false;
                                    continue;
                                }
                                if (var550 == 6003) {
                                    var5--;
                                    class160.field2561 = class63.field1126[var5] == 1;
                                    class135.method1032(9436);
                                    class16.method87(class128.field2163, (byte) -64);
                                    class302.field4861 = false;
                                    continue;
                                }
                                if (var550 == 6005) {
                                    var5--;
                                    class292.field4726 = class63.field1126[var5] == 1;
                                    class81.method659(26326);
                                    class16.method87(class128.field2163, (byte) -64);
                                    class302.field4861 = false;
                                    continue;
                                }
                                if (var550 == 6006) {
                                    var5--;
                                    class44.field690 = class63.field1126[var5] == 1;
                                    ((class98) class153.field2439).method767(!class44.field690, (byte) 48);
                                    class16.method87(class128.field2163, (byte) -64);
                                    class302.field4861 = false;
                                    continue;
                                }
                                if (var550 == 6007) {
                                    var5--;
                                    class241.field3979 = class63.field1126[var5] == 1;
                                    class16.method87(class128.field2163, (byte) -64);
                                    class302.field4861 = false;
                                    continue;
                                }
                                if (var550 == 6008) {
                                    var5--;
                                    class243.field4004 = class63.field1126[var5] == 1;
                                    class16.method87(class128.field2163, (byte) -64);
                                    class302.field4861 = false;
                                    continue;
                                }
                                if (var550 == 6009) {
                                    var5--;
                                    class75.field1272 = class63.field1126[var5] == 1;
                                    class16.method87(class128.field2163, (byte) -64);
                                    class302.field4861 = false;
                                    continue;
                                }
                                if (var550 == 6010) {
                                    var5--;
                                    client.field717 = class63.field1126[var5] == 1;
                                    class16.method87(class128.field2163, (byte) -64);
                                    class302.field4861 = false;
                                    continue;
                                }
                                if (var550 == 6011) {
                                    var5--;
                                    int var318 = class63.field1126[var5];
                                    if (var318 < 0 || var318 > 2) {
                                        var318 = 0;
                                    }
                                    class131.field2214 = var318;
                                    class16.method87(class128.field2163, (byte) -64);
                                    class302.field4861 = false;
                                    continue;
                                }
                                if (var550 == 6012) {
                                    if (class42.field607) {
                                        class310.method2203(0, 0, -124);
                                    }
                                    var5--;
                                    field36 = class63.field1126[var5] == 1;
                                    if (class42.field607 && field36) {
                                        class153.method1181(0.7F);
                                    } else {
                                        if (class166.field2649 == 1) {
                                            class153.method1181(0.9F);
                                        }
                                        if (class166.field2649 == 2) {
                                            class153.method1181(0.8F);
                                        }
                                        if (class166.field2649 == 3) {
                                            class153.method1181(0.7F);
                                        }
                                        if (class166.field2649 == 4) {
                                            class153.method1181(0.6F);
                                        }
                                    }
                                    class81.method659(26326);
                                    class16.method87(class128.field2163, (byte) -64);
                                    class302.field4861 = false;
                                    continue;
                                }
                                if (var550 == 6014) {
                                    var5--;
                                    class193.field3083 = class63.field1126[var5] == 1;
                                    if (class42.field607) {
                                        class81.method659(26326);
                                    }
                                    class16.method87(class128.field2163, (byte) -64);
                                    class302.field4861 = false;
                                    continue;
                                }
                                if (var550 == 6015) {
                                    var5--;
                                    class198.field3165 = class63.field1126[var5] == 1;
                                    if (class42.field607) {
                                        class74.method621(-85);
                                    }
                                    class16.method87(class128.field2163, (byte) -64);
                                    class302.field4861 = false;
                                    continue;
                                }
                                if (var550 == 6016) {
                                    var5--;
                                    int var319 = class63.field1126[var5];
                                    if (var319 < 0 || var319 > 2) {
                                        var319 = 0;
                                    }
                                    if (class42.field607) {
                                        class64.field1135 = true;
                                    }
                                    class267.field4482 = var319;
                                    continue;
                                }
                                if (var550 == 6017) {
                                    var5--;
                                    class248.field4052 = class63.field1126[var5] == 1;
                                    class12.method60(-9820);
                                    class16.method87(class128.field2163, (byte) -64);
                                    class302.field4861 = false;
                                    continue;
                                }
                                if (var550 == 6018) {
                                    var5--;
                                    int var320 = class63.field1126[var5];
                                    if (var320 < 0) {
                                        var320 = 0;
                                    }
                                    if (var320 > 127) {
                                        var320 = 127;
                                    }
                                    class45.field704 = var320;
                                    class16.method87(class128.field2163, (byte) -64);
                                    class302.field4861 = false;
                                    continue;
                                }
                                if (var550 == 6019) {
                                    var5--;
                                    int var321 = class63.field1126[var5];
                                    if (var321 < 0) {
                                        var321 = 0;
                                    }
                                    if (var321 > 255) {
                                        var321 = 255;
                                    }
                                    if (class235.field3899 != var321) {
                                        if (class235.field3899 == 0 && class196.field3132 != -1) {
                                            class287.method2087(0, 106, class355.field5641, false, class196.field3132, var321);
                                            class32.field461 = false;
                                        } else if (var321 == 0) {
                                            class339.method2380((byte) -28);
                                            class32.field461 = false;
                                        } else {
                                            class161.method1255(-1, var321);
                                        }
                                        class235.field3899 = var321;
                                    }
                                    class16.method87(class128.field2163, (byte) -64);
                                    class302.field4861 = false;
                                    continue;
                                }
                                if (var550 == 6020) {
                                    var5--;
                                    int var322 = class63.field1126[var5];
                                    if (var322 < 0) {
                                        var322 = 0;
                                    }
                                    if (var322 > 127) {
                                        var322 = 127;
                                    }
                                    class272.field4520 = var322;
                                    class16.method87(class128.field2163, (byte) -64);
                                    class302.field4861 = false;
                                    continue;
                                }
                                if (var550 == 6021) {
                                    var5--;
                                    class129.field2192 = class63.field1126[var5] == 1;
                                    class135.method1032(9436);
                                    continue;
                                }
                                if (var550 == 6023) {
                                    var5--;
                                    int var323 = class63.field1126[var5];
                                    boolean var324 = false;
                                    if (var323 < 0) {
                                        var323 = 0;
                                    }
                                    if (var323 > 2) {
                                        var323 = 2;
                                    }
                                    if (class10.field81 < 96) {
                                        var323 = 0;
                                        var324 = true;
                                    }
                                    class158.method1224(var323);
                                    class16.method87(class128.field2163, (byte) -64);
                                    class302.field4861 = false;
                                    class63.field1126[var5++] = var324 ? 0 : 1;
                                    continue;
                                }
                                if (var550 == 6024) {
                                    var5--;
                                    int var325 = class63.field1126[var5];
                                    if (var325 < 0 || var325 > 2) {
                                        var325 = 0;
                                    }
                                    class340.field5436 = var325;
                                    class16.method87(class128.field2163, (byte) -64);
                                    continue;
                                }
                                if (var550 == 6027) {
                                    var5--;
                                    int var326 = class63.field1126[var5];
                                    if (!class42.field607) {
                                        continue;
                                    }
                                    if (var326 < 0 || var326 > 1) {
                                        var326 = 0;
                                    }
                                    class44.method326((byte) -122, var326 == 1);
                                    continue;
                                }
                                if (var550 == 6028) {
                                    var5--;
                                    class14.field152 = class63.field1126[var5] != 0;
                                    class16.method87(class128.field2163, (byte) -64);
                                    continue;
                                }
                            } else if (var550 < 6200) {
                                if (var550 == 6101) {
                                    class63.field1126[var5++] = class166.field2649;
                                    continue;
                                }
                                if (var550 == 6102) {
                                    class63.field1126[var5++] = class215.method1621(25) ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6103) {
                                    class63.field1126[var5++] = class160.field2561 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6105) {
                                    class63.field1126[var5++] = class292.field4726 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6106) {
                                    class63.field1126[var5++] = class44.field690 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6107) {
                                    class63.field1126[var5++] = class241.field3979 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6108) {
                                    class63.field1126[var5++] = class243.field4004 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6109) {
                                    class63.field1126[var5++] = class75.field1272 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6110) {
                                    class63.field1126[var5++] = client.field717 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6111) {
                                    class63.field1126[var5++] = class131.field2214;
                                    continue;
                                }
                                if (var550 == 6112) {
                                    class63.field1126[var5++] = field36 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6114) {
                                    class63.field1126[var5++] = class193.field3083 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6115) {
                                    class63.field1126[var5++] = class198.field3165 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6116) {
                                    class63.field1126[var5++] = class267.field4482;
                                    continue;
                                }
                                if (var550 == 6117) {
                                    class63.field1126[var5++] = class248.field4052 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6118) {
                                    class63.field1126[var5++] = class45.field704;
                                    continue;
                                }
                                if (var550 == 6119) {
                                    class63.field1126[var5++] = class235.field3899;
                                    continue;
                                }
                                if (var550 == 6120) {
                                    class63.field1126[var5++] = class272.field4520;
                                    continue;
                                }
                                if (var550 == 6121) {
                                    if (class42.field607) {
                                        class63.field1126[var5++] = class42.field604 ? 1 : 0;
                                    } else {
                                        class63.field1126[var5++] = 0;
                                    }
                                    continue;
                                }
                                if (var550 == 6123) {
                                    class63.field1126[var5++] = class158.method1219();
                                    continue;
                                }
                                if (var550 == 6124) {
                                    class63.field1126[var5++] = class340.field5436;
                                    continue;
                                }
                                if (var550 == 6126) {
                                    if (class42.field607) {
                                        class63.field1126[var5++] = class68.method579() ? 1 : 0;
                                    } else {
                                        class63.field1126[var5++] = 0;
                                    }
                                    continue;
                                }
                                if (var550 == 6127) {
                                    class63.field1126[var5++] = class238.field3932 ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6128) {
                                    class63.field1126[var5++] = class14.field152 ? 1 : 0;
                                    continue;
                                }
                            } else if (var550 < 6300) {
                                if (var550 == 6200) {
                                    var5 -= 2;
                                    class65.field1151 = (short) class63.field1126[var5];
                                    if (class65.field1151 <= 0) {
                                        class65.field1151 = 256;
                                    }
                                    class87.field1497 = (short) class63.field1126[var5 + 1];
                                    if (class87.field1497 <= 0) {
                                        class87.field1497 = 205;
                                    }
                                    continue;
                                }
                                if (var550 == 6201) {
                                    var5 -= 2;
                                    class125.field2137 = (short) class63.field1126[var5];
                                    if (class125.field2137 <= 0) {
                                        class125.field2137 = 256;
                                    }
                                    class347.field5526 = (short) class63.field1126[var5 + 1];
                                    if (class347.field5526 <= 0) {
                                        class347.field5526 = 320;
                                    }
                                    continue;
                                }
                                if (var550 == 6202) {
                                    var5 -= 4;
                                    class94.field1587 = (short) class63.field1126[var5];
                                    if (class94.field1587 <= 0) {
                                        class94.field1587 = 1;
                                    }
                                    class172.field2745 = (short) class63.field1126[var5 + 1];
                                    if (class172.field2745 <= 0) {
                                        class172.field2745 = 32767;
                                    } else if (class94.field1587 > class172.field2745) {
                                        class172.field2745 = class94.field1587;
                                    }
                                    class198.field3167 = (short) class63.field1126[var5 + 2];
                                    if (class198.field3167 <= 0) {
                                        class198.field3167 = 1;
                                    }
                                    class78.field1350 = (short) class63.field1126[var5 + 3];
                                    if (class78.field1350 <= 0) {
                                        class78.field1350 = 32767;
                                    } else if (class198.field3167 > class78.field1350) {
                                        class78.field1350 = class198.field3167;
                                    }
                                    continue;
                                }
                                if (var550 == 6203) {
                                    class295.method2123(class14.field153.field4157, 0, class14.field153.field4081, -2, false, 0);
                                    class63.field1126[var5++] = class254.field4294;
                                    class63.field1126[var5++] = class118.field1984;
                                    continue;
                                }
                                if (var550 == 6204) {
                                    class63.field1126[var5++] = class125.field2137;
                                    class63.field1126[var5++] = class347.field5526;
                                    continue;
                                }
                                if (var550 == 6205) {
                                    class63.field1126[var5++] = class65.field1151;
                                    class63.field1126[var5++] = class87.field1497;
                                    continue;
                                }
                            } else if (var550 < 6400) {
                                if (var550 == 6300) {
                                    class63.field1126[var5++] = (int) (class47.method371(91) / 60000L);
                                    continue;
                                }
                                if (var550 == 6301) {
                                    class63.field1126[var5++] = (int) (class47.method371(-92) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var550 == 6302) {
                                    var5 -= 3;
                                    int var292 = class63.field1126[var5 + 2];
                                    int var293 = class63.field1126[var5 + 1];
                                    int var294 = class63.field1126[var5];
                                    class76.field1307.clear();
                                    class76.field1307.set(11, 12);
                                    class76.field1307.set(var292, var293, var294);
                                    class63.field1126[var5++] = (int) (class76.field1307.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var550 == 6303) {
                                    class76.field1307.clear();
                                    class76.field1307.setTime(new Date(class47.method371(79)));
                                    class63.field1126[var5++] = class76.field1307.get(1);
                                    continue;
                                }
                                if (var550 == 6304) {
                                    var5--;
                                    int var295 = class63.field1126[var5];
                                    boolean var296 = true;
                                    if (var295 < 0) {
                                        var296 = ((var295 + 1) % 4) == 0;
                                    } else if (var295 < 1582) {
                                        var296 = (var295 % 4) == 0;
                                    } else if ((var295 % 4) != 0) {
                                        var296 = false;
                                    } else if (var295 % 100 != 0) {
                                        var296 = true;
                                    } else if ((var295 % 400) != 0) {
                                        var296 = false;
                                    }
                                    class63.field1126[var5++] = var296 ? 1 : 0;
                                    continue;
                                }
                            } else if (var550 < 6500) {
                                if (var550 == 6405) {
                                    class63.field1126[var5++] = class343.method2421(-121) ? 1 : 0;
                                    continue;
                                }
                                if (var550 == 6406) {
                                    class63.field1126[var5++] = class43.method321(1) ? 1 : 0;
                                    continue;
                                }
                            } else if (var550 < 6600) {
                                if (var550 == 6500) {
                                    if (class259.field4362 == 10 && class327.field5197 == 0 && class4.field42 == 0 && class20.field231 == 0) {
                                        class63.field1126[var5++] = class129.method990(true) == -1 ? 0 : 1;
                                        continue;
                                    }
                                    class63.field1126[var5++] = 1;
                                    continue;
                                }
                                if (var550 == 6501) {
                                    class201 var297 = class101.method786(false);
                                    if (var297 == null) {
                                        class63.field1126[var5++] = -1;
                                        class63.field1126[var5++] = 0;
                                        class340.field5429[var3++] = "";
                                        class63.field1126[var5++] = 0;
                                        class340.field5429[var3++] = "";
                                        class63.field1126[var5++] = 0;
                                    } else {
                                        class63.field1126[var5++] = var297.field3205;
                                        class63.field1126[var5++] = var297.field2839;
                                        class340.field5429[var3++] = var297.field3196;
                                        class27 var298 = var297.method1542(true);
                                        class63.field1126[var5++] = var298.field322;
                                        class340.field5429[var3++] = var298.field325;
                                        class63.field1126[var5++] = var297.field2841;
                                    }
                                    continue;
                                }
                                if (var550 == 6502) {
                                    class201 var299 = class177.method1395(24);
                                    if (var299 == null) {
                                        class63.field1126[var5++] = -1;
                                        class63.field1126[var5++] = 0;
                                        class340.field5429[var3++] = "";
                                        class63.field1126[var5++] = 0;
                                        class340.field5429[var3++] = "";
                                        class63.field1126[var5++] = 0;
                                    } else {
                                        class63.field1126[var5++] = var299.field3205;
                                        class63.field1126[var5++] = var299.field2839;
                                        class340.field5429[var3++] = var299.field3196;
                                        class27 var300 = var299.method1542(true);
                                        class63.field1126[var5++] = var300.field322;
                                        class340.field5429[var3++] = var300.field325;
                                        class63.field1126[var5++] = var299.field2841;
                                    }
                                    continue;
                                }
                                if (var550 == 6503) {
                                    var5--;
                                    int var301 = class63.field1126[var5];
                                    if (class259.field4362 == 10 && class327.field5197 == 0 && class4.field42 == 0 && class20.field231 == 0) {
                                        class63.field1126[var5++] = class38.method256(var301, 23611) ? 1 : 0;
                                        continue;
                                    }
                                    class63.field1126[var5++] = 0;
                                    continue;
                                }
                                if (var550 == 6504) {
                                    var5--;
                                    class237.field3923 = class63.field1126[var5];
                                    class16.method87(class128.field2163, (byte) -64);
                                    continue;
                                }
                                if (var550 == 6505) {
                                    class63.field1126[var5++] = class237.field3923;
                                    continue;
                                }
                                if (var550 == 6506) {
                                    var5--;
                                    int var302 = class63.field1126[var5];
                                    class201 var303 = class291.method2108(var302, (byte) 69);
                                    if (var303 == null) {
                                        class63.field1126[var5++] = -1;
                                        class340.field5429[var3++] = "";
                                        class63.field1126[var5++] = 0;
                                        class340.field5429[var3++] = "";
                                        class63.field1126[var5++] = 0;
                                    } else {
                                        class63.field1126[var5++] = var303.field2839;
                                        class340.field5429[var3++] = var303.field3196;
                                        class27 var304 = var303.method1542(true);
                                        class63.field1126[var5++] = var304.field322;
                                        class340.field5429[var3++] = var304.field325;
                                        class63.field1126[var5++] = var303.field2841;
                                    }
                                    continue;
                                }
                                if (var550 == 6507) {
                                    var5 -= 4;
                                    int var305 = class63.field1126[var5];
                                    boolean var306 = class63.field1126[var5 + 1] == 1;
                                    boolean var307 = class63.field1126[var5 + 3] == 1;
                                    int var308 = class63.field1126[var5 + 2];
                                    class32.method224(var308, var307, (byte) -128, var305, var306);
                                    continue;
                                }
                            } else if (var550 < 6700) {
                                if (var550 == 6600) {
                                    var5--;
                                    class336.field5314 = class63.field1126[var5] == 1;
                                    class16.method87(class128.field2163, (byte) -64);
                                    continue;
                                }
                                if (var550 == 6601) {
                                    class63.field1126[var5++] = class336.field5314 ? 1 : 0;
                                    continue;
                                }
                            } else if (var550 < 6900) {
                                if (var550 == 6800) {
                                    var5--;
                                    int var309 = class63.field1126[var5];
                                    class213 var310 = class169.method1315(var309, 102);
                                    if (var310.field3401 == null) {
                                        class340.field5429[var3++] = "";
                                    } else {
                                        class340.field5429[var3++] = var310.field3401;
                                    }
                                    continue;
                                }
                                if (var550 == 6801) {
                                    var5--;
                                    int var311 = class63.field1126[var5];
                                    class213 var312 = class169.method1315(var311, 66);
                                    class63.field1126[var5++] = var312.field3413;
                                    continue;
                                }
                                if (var550 == 6802) {
                                    var5--;
                                    int var313 = class63.field1126[var5];
                                    class213 var314 = class169.method1315(var313, 116);
                                    class63.field1126[var5++] = var314.field3417;
                                    continue;
                                }
                                if (var550 == 6803) {
                                    var5--;
                                    int var315 = class63.field1126[var5];
                                    class213 var316 = class169.method1315(var315, 75);
                                    class63.field1126[var5++] = var316.field3421;
                                    continue;
                                }
                            }
                        } else if (var550 == 4500) {
                            var5 -= 2;
                            int var499 = class63.field1126[var5];
                            int var500 = class63.field1126[var5 + 1];
                            class350 var501 = class113.method861((byte) 115, var500);
                            if (var501.method2460((byte) -9)) {
                                class340.field5429[var3++] = class57.method453((byte) 48, var499).method31(var501.field5568, var500, 1);
                            } else {
                                class63.field1126[var5++] = class57.method453((byte) 48, var499).method28(var500, var501.field5554, false);
                            }
                            continue;
                        }
                    } else if (var550 == 4400) {
                        var5 -= 2;
                        int var502 = class63.field1126[var5];
                        int var503 = class63.field1126[var5 + 1];
                        class350 var504 = class113.method861((byte) 115, var503);
                        if (var504.method2460((byte) -9)) {
                            class340.field5429[var3++] = class166.method1292(0, var502).method185(var503, 123, var504.field5568);
                        } else {
                            class63.field1126[var5++] = class166.method1292(0, var502).method196(var503, (byte) 52, var504.field5554);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var549) {
            if (arg0.field58 == null) {
                if (class237.field3922 != 0) {
                    class182.method1431("Clientscript error - check log for details", (byte) -11);
                }
                class285.method2079(var549, (byte) -16, "CS2 - scr:" + arg0.field698 + " op:" + var7);
            } else {
                StringBuffer var546 = new StringBuffer(30);
                var546.append("%0a - in: ").append(arg0.field58);
                for (int var547 = class247.field4044 - 1; var547 >= 0; var547--) {
                    var546.append("%0a - via: ").append(class326.field5189[var547].field5079.field58);
                }
                if (var7 == 40) {
                    int var548 = var9[var8];
                    var546.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var548));
                }
                if (class237.field3922 != 0) {
                    class182.method1431("Clientscript error in: " + arg0.field58, (byte) -11);
                }
                class285.method2079(var549, (byte) -16, "CS2 - scr:" + arg0.field698 + " op:" + var7 + var546.toString());
            }
        }
    }
}
