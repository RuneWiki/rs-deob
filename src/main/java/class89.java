import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iia")
public class class89 extends class499 {

    @OriginalMember(owner = "client!iia", name = "P", descriptor = "[[B")
    private byte[][] field1238 = new byte[10][];

    @OriginalMember(owner = "client!iia", name = "M", descriptor = "Lsl;")
    private class461 field1235 = new class461(null);

    @OriginalMember(owner = "client!iia", name = "U", descriptor = "Lsl;")
    private class461 field1243 = new class461(null);

    @OriginalMember(owner = "client!iia", name = "S", descriptor = "I")
    private int field1241;

    @OriginalMember(owner = "client!iia", name = "K", descriptor = "Lnd;")
    private class547 field1233;

    @OriginalMember(owner = "client!iia", name = "J", descriptor = "Lpw;")
    public static class708 field1232 = new class708(64);

    @OriginalMember(owner = "client!iia", name = "T", descriptor = "[I")
    public static int[] field1242 = new int[14];

    @OriginalMember(owner = "client!iia", name = "R", descriptor = "Lhm;")
    public static class223 field1240 = new class223(2, 2);

    @OriginalMember(owner = "client!iia", name = "F", descriptor = "I")
    private int field1228;

    @OriginalMember(owner = "client!iia", name = "H", descriptor = "I")
    public static int field1230;

    @OriginalMember(owner = "client!iia", name = "I", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!iia", name = "L", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!iia", name = "N", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!iia", name = "O", descriptor = "I")
    public static int field1237;

    @OriginalMember(owner = "client!iia", name = "Q", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!iia", name = "G", descriptor = "[I")
    private int[] field1229;

    @OriginalMember(owner = "client!iia", name = "<init>", descriptor = "(ILnd;I)V", line = 3)
    public class89(int arg0, class547 arg1, int arg2) {
        super(arg0);
        this.field1241 = arg2;
        this.field1233 = arg1;
    }

    @OriginalMember(owner = "client!iia", name = "b", descriptor = "(Z)V", line = 12)
    public final void method726(boolean arg0) {
        field1234++;
        if (this.field1229 == null) {
            return;
        }
        int var2 = 0;
        if (!arg0) {
            field1232 = null;
        }
        while (var2 < 10) {
            if ((var2 + this.field1228) >= this.field1229.length) {
                return;
            }
            if (this.field1238[var2] == null && this.field1233.method3157(0, 0, this.field1229[this.field1228 + var2])) {
                this.field1238[var2] = this.field1233.method3153(0, 0, this.field1229[this.field1228 + var2]);
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!iia", name = "d", descriptor = "(B)V", line = 48)
    public static final void method727(byte arg0) {
        int var1 = 0;
        if (arg0 != -72) {
            return;
        }
        while (var1 < class28.field502) {
            int var2 = class414.field5284[var1];
            class733 var3 = ((class592) class207.field2745.method1160((long) var2, 124)).field8280;
            int var4 = class609.field8448.method2600((byte) -126);
            if ((var4 & 0x2) != 0) {
                var4 += class609.field8448.method2600((byte) -128) << 8;
            }
            if ((var4 & 0x800) != 0) {
                var4 += class609.field8448.method2600((byte) -125) << 16;
            }
            if ((var4 & 0x1000) != 0) {
                int var5 = class609.field8448.method2606((byte) -103);
                int[] var6 = new int[var5];
                int[] var7 = new int[var5];
                int[] var8 = new int[var5];
                for (int var9 = 0; var9 < var5; var9++) {
                    int var10 = class609.field8448.method2595((byte) 31);
                    if (var10 == 65535) {
                        var10 = -1;
                    }
                    var6[var9] = var10;
                    var7[var9] = class609.field8448.method2606((byte) -103);
                    var8[var9] = class609.field8448.method2604((byte) -126);
                }
                class473.method2699(15825, var3, var7, var6, var8);
            }
            if ((var4 & 0x80) != 0) {
                var3.field214 = class609.field8448.method2574(arg0 ^ 0x47);
                var3.field247 = 100;
            }
            if ((var4 & 0x4000) != 0) {
                int var11 = var3.field10192.field1900.length;
                int var12 = 0;
                if (var3.field10192.field1862 != null) {
                    var12 = var3.field10192.field1862.length;
                }
                int var13 = 0;
                if (var3.field10192.field1854 != null) {
                    var13 = var3.field10192.field1854.length;
                }
                int var14 = class609.field8448.method2600((byte) -123);
                if ((var14 & 0x1) == 1) {
                    var3.field10215 = null;
                } else {
                    int[] var15 = null;
                    if ((var14 & 0x2) == 2) {
                        var15 = new int[var11];
                        for (int var16 = 0; var16 < var11; var16++) {
                            var15[var16] = class609.field8448.method2595((byte) 88);
                        }
                    }
                    short[] var17 = null;
                    if ((var14 & 0x4) == 4) {
                        var17 = new short[var12];
                        for (int var18 = 0; var18 < var12; var18++) {
                            var17[var18] = (short) class609.field8448.method2566(-2);
                        }
                    }
                    short[] var19 = null;
                    if ((var14 & 0x8) == 8) {
                        var19 = new short[var13];
                        for (int var20 = 0; var20 < var13; var20++) {
                            var19[var20] = (short) class609.field8448.method2595((byte) 69);
                        }
                    }
                    long var21 = (long) (var3.field10198++) << 32 | (long) var2;
                    var3.field10215 = new class552(var21, var15, var17, var19);
                }
            }
            if ((var4 & 0x20) != 0) {
                if (var3.field10192.method972(27961)) {
                    class408.method2274(var3, (byte) -23);
                }
                var3.method4090(class300.field3941.method3859(class609.field8448.method2566(arg0 + 70), (byte) 108), 0);
                var3.method92(var3.field10192.field1918, -94);
                var3.field253 = var3.field10192.field1913 << 3;
                if (var3.field10192.method972(27961)) {
                    class718.method4016(null, null, var3, (byte) 85, 0, var3.field5796, var3.field260[0], var3.field264[0]);
                }
            }
            if ((var4 & 0x20000) != 0) {
                var3.field10204 = class609.field8448.method2595((byte) 105);
                if (var3.field10204 == 65535) {
                    var3.field10204 = var3.field10192.field1898;
                }
            }
            if ((var4 & 0x10000) != 0) {
                var3.field10189 = class609.field8448.method2574(-1);
                if ("".equals(var3.field10189) || var3.field10189.equals(var3.field10192.field1851)) {
                    var3.field10189 = var3.field10192.field1851;
                }
            }
            if ((var4 & 0x8000) != 0) {
                int var23 = class609.field8448.method2583(false);
                int[] var24 = new int[var23];
                int[] var25 = new int[var23];
                for (int var26 = 0; var26 < var23; var26++) {
                    int var27 = class609.field8448.method2617((byte) 76);
                    if ((var27 & 0xC000) == 49152) {
                        int var28 = class609.field8448.method2566(arg0 ^ 0x46);
                        var24[var26] = class683.method3840(var27 << 16, var28);
                    } else {
                        var24[var26] = var27;
                    }
                    var25[var26] = class609.field8448.method2617((byte) 127);
                }
                var3.method97(var24, -12780, var25);
            }
            if ((var4 & 0x10) != 0) {
                int var29 = class609.field8448.method2583(false);
                if (var29 > 0) {
                    for (int var30 = 0; var30 < var29; var30++) {
                        int var31 = -1;
                        int var32 = -1;
                        int var33 = -1;
                        int var34 = class609.field8448.method2594(3340);
                        if (var34 == 32767) {
                            var34 = class609.field8448.method2594(3340);
                            var32 = class609.field8448.method2594(3340);
                            var31 = class609.field8448.method2594(3340);
                            var33 = class609.field8448.method2594(3340);
                        } else if (var34 == 32766) {
                            var34 = -1;
                        } else {
                            var32 = class609.field8448.method2594(3340);
                        }
                        int var35 = class609.field8448.method2594(3340);
                        int var36 = class609.field8448.method2629(arg0 - 37);
                        var3.method95(var31, var36, var32, class463.field6224, var35, false, var34, var33);
                    }
                }
            }
            if ((var4 & 0x100) != 0) {
                var3.field185 = class609.field8448.method2579(arg0 + 194);
                var3.field154 = class609.field8448.method2579(arg0 ^ 0xFFFFFFE6);
                var3.field162 = class609.field8448.method2601(0);
                var3.field240 = class609.field8448.method2579(108);
                var3.field238 = class609.field8448.method2604((byte) -128) + class463.field6224;
                var3.field176 = class609.field8448.method2595((byte) 82) + class463.field6224;
                var3.field164 = class609.field8448.method2600((byte) -126);
                var3.field162 += var3.field264[0];
                var3.field266 = 0;
                var3.field185 += var3.field264[0];
                var3.field154 += var3.field260[0];
                var3.field263 = 1;
                var3.field240 += var3.field260[0];
            }
            if ((var4 & 0x400) != 0) {
                var3.field156 = class609.field8448.method2593((byte) 111);
                var3.field161 = class609.field8448.method2601(arg0 ^ 0xFFFFFFB8);
                var3.field151 = class609.field8448.method2593((byte) 92);
                var3.field219 = (byte) class609.field8448.method2629(arg0 ^ 0xE);
                var3.field217 = class463.field6224 + class609.field8448.method2604((byte) -128);
                var3.field222 = class463.field6224 + class609.field8448.method2604((byte) -126);
            }
            if ((var4 & 0x8) != 0) {
                int var37 = class609.field8448.method2604((byte) -127);
                int var38 = class609.field8448.method2571(arg0 ^ 0xFFFFAD16);
                if (var37 == 65535) {
                    var37 = -1;
                }
                int var39 = class609.field8448.method2600((byte) -127);
                int var40 = var39 & 0x7;
                int var41 = var39 >> 3 & 0xF;
                if (var41 == 15) {
                    var41 = -1;
                }
                var3.method99(var37, var41, var38, var40, true, false);
            }
            if ((var4 & 0x200) != 0) {
                int var42 = class609.field8448.method2595((byte) 120);
                var3.field183 = class609.field8448.method2583(false);
                var3.field224 = class609.field8448.method2629(arg0 + 5);
                var3.field170 = (var42 & 0x8000) != 0;
                var3.field190 = var42 & 0x7FFF;
                var3.field196 = class463.field6224 + var3.field183 + var3.field190;
            }
            if ((var4 & 0x40) != 0) {
                var3.field10203 = class609.field8448.method2617((byte) 97);
                var3.field10191 = class609.field8448.method2595((byte) 102);
            }
            if ((var4 & 0x40000) != 0) {
                int var43 = var3.field10192.field1886.length;
                int var44 = 0;
                if (var3.field10192.field1862 != null) {
                    var44 = var3.field10192.field1862.length;
                }
                if (var3.field10192.field1854 != null) {
                    var44 = var3.field10192.field1854.length;
                }
                byte var45 = 0;
                int var46 = class609.field8448.method2583(false);
                if ((var46 & 0x1) != 1) {
                    int[] var47 = null;
                    if ((var46 & 0x2) == 2) {
                        var47 = new int[var43];
                        for (int var48 = 0; var48 < var43; var48++) {
                            var47[var48] = class609.field8448.method2595((byte) 112);
                        }
                    }
                    short[] var49 = null;
                    if ((var46 & 0x4) == 4) {
                        var49 = new short[var44];
                        for (int var50 = 0; var50 < var44; var50++) {
                            var49[var50] = (short) class609.field8448.method2604((byte) -126);
                        }
                    }
                    short[] var51 = null;
                    if ((var46 & 0x8) == 8) {
                        var51 = new short[var45];
                        for (int var52 = 0; var52 < var45; var52++) {
                            var51[var52] = (short) class609.field8448.method2595((byte) 63);
                        }
                    }
                    long var53 = (long) (var3.field10201++) << 32 | (long) var2;
                    new class552(var53, var47, var49, var51);
                }
            }
            if ((var4 & 0x1) != 0) {
                var3.field221 = class609.field8448.method2566(-2);
                if (var3.field221 == 65535) {
                    var3.field221 = -1;
                }
            }
            if ((var4 & 0x4) != 0) {
                int[] var55 = new int[4];
                for (int var56 = 0; var56 < 4; var56++) {
                    var55[var56] = class609.field8448.method2566(-2);
                    if (var55[var56] == 65535) {
                        var55[var56] = -1;
                    }
                }
                int var57 = class609.field8448.method2583(false);
                class353.method2061(var3, arg0 + 70, var57, var55);
            }
            if ((var4 & 0x2000) != 0) {
                int var58 = class609.field8448.method2595((byte) 75);
                if (var58 == 65535) {
                    var58 = -1;
                }
                int var59 = class609.field8448.method2628(103);
                int var60 = class609.field8448.method2629(-82);
                int var61 = var60 & 0x7;
                int var62 = var60 >> 3 & 0xF;
                if (var62 == 15) {
                    var62 = -1;
                }
                var3.method99(var58, var62, var59, var61, true, true);
            }
            var1++;
        }
        field1231++;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "([BI)I", line = 504)
    public final int method728(byte[] arg0, int arg1) throws IOException {
        field1239++;
        if (this.field1229 == null) {
            if (!this.field1233.method3157(0, 0, this.field1241)) {
                return 0;
            }
            byte[] var3 = this.field1233.method3153(0, 0, this.field1241);
            if (var3 == null) {
                throw new IllegalStateException("");
            }
            this.field1243.field6180 = var3;
            this.field1243.field6193 = 0;
            int var4 = var3.length >> 1;
            this.field1229 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1229[var5] = this.field1243.method2566(arg1 + 8049);
            }
        }
        if (this.field1228 >= this.field1229.length) {
            return -1;
        }
        this.method726(true);
        if (arg1 != -8051) {
            field1242 = null;
        }
        this.field1243.field6180 = arg0;
        this.field1243.field6193 = 0;
        do {
            if (this.field1243.field6193 >= this.field1243.field6180.length) {
                this.field1243.field6180 = null;
                return arg0.length;
            }
            if (this.field1235.field6180 == null) {
                if (this.field1238[0] == null) {
                    this.field1243.field6180 = null;
                    return this.field1243.field6193;
                }
                this.field1235.field6180 = this.field1238[0];
            }
            int var6 = this.field1243.field6180.length - this.field1243.field6193;
            int var7 = this.field1235.field6180.length - this.field1235.field6193;
            if (var6 < var7) {
                this.field1235.method2573(this.field1243.field6180, (byte) -77, var6, this.field1243.field6193);
                this.field1243.field6180 = null;
                return arg0.length;
            }
            this.field1243.method2614(3, this.field1235.field6193, this.field1235.field6180, var7);
            this.field1235.field6180 = null;
            this.field1228++;
            this.field1235.field6193 = 0;
            for (int var8 = 0; var8 < 9; var8++) {
                this.field1238[var8] = this.field1238[var8 + 1];
            }
            this.field1238[9] = null;
        } while (this.field1228 < this.field1229.length);
        this.field1243.field6180 = null;
        return this.field1243.field6193;
    }

    @OriginalMember(owner = "client!iia", name = "j", descriptor = "(I)V", line = 604)
    public static void method729(int arg0) {
        field1242 = null;
        int var1 = 108 / ((arg0 - 65) / 53);
        field1232 = null;
        field1240 = null;
    }

    @OriginalMember(owner = "client!iia", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 625)
    public static final void method730(String arg0, byte arg1) {
        field1230++;
        if (class306.field4038 == null) {
            return;
        }
        class494.field7001++;
        class589 var2 = class514.method2994(-29488, class760.field10605, class440.field5866);
        var2.field8251.method2578(class747.method4155(-1, arg0), -1221492240);
        var2.field8251.method2597(arg0, (byte) 111);
        int var3 = -33 / ((34 - arg1) / 58);
        class737.method4107(var2, 7);
    }
}
