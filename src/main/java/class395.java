import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public abstract class class395 {

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public int field5199 = 4;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    private int field5202 = 4;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
    private int field5198 = 4;

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "[S")
    private short[] field5204 = new short[512];

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "I")
    private int field5197 = 0;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    private int field5193 = 4;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "Luw;")
    public static class208 field5192 = new class208(72, 6);

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "[I")
    public static int[] field5205 = new int[1];

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "[S")
    private short[] field5203;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V", line = 6)
    private final void method2283(int arg0) {
        this.field5203 = new short[this.field5199];
        field5195++;
        if (arg0 != 17393) {
            method2290(true);
        }
        for (int var2 = 0; var2 < this.field5199; var2++) {
            this.field5203[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lwm;B)V", line = 29)
    public static final void method2284(class30 arg0, byte arg1) {
        if (arg1 != 4) {
            field5205 = null;
        }
        class482.field6224 = arg0;
        field5194++;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)V", line = 48)
    public static void method2287(byte arg0) {
        field5192 = null;
        field5205 = null;
        if (arg0 != 56) {
            field5192 = null;
        }
    }

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "(I)V", line = 59)
    public static final void method2288(int arg0) {
        field5206++;
        class413.method2393((byte) 78, class485.field6252.field6916.method1641(false));
        int var1 = (class97.field1309 >> 12) + (class714.field9407 >> 3);
        int var2 = (class240.field3293 >> 3) + (class148.field1890 >> 12);
        class309.field3877 = class422.field5564.field2895 = 0;
        class422.field5564.method184(8, 8, 10);
        byte var3 = 18;
        class382.field4782 = new int[var3][4];
        class279.field3625 = new byte[var3][];
        class256.field3474 = new byte[var3][];
        class55.field712 = new byte[var3][];
        class702.field9287 = new byte[var3][];
        class644.field8240 = new int[var3];
        class195.field2709 = new int[var3];
        class92.field1263 = new byte[var3][];
        class484.field6249 = new int[var3];
        class459.field5994 = new int[var3];
        class439.field5768 = new int[var3];
        class448.field5848 = new int[var3];
        int var4 = arg0;
        for (int var5 = (var1 - (class240.field3280 >> 4)) / 8; var5 <= (var1 + (class240.field3280 >> 4)) / 8; var5++) {
            for (int var8 = (var2 - (class276.field3602 >> 4)) / 8; var8 <= (var2 + (class276.field3602 >> 4)) / 8; var8++) {
                int var9 = (var5 << 8) + var8;
                class644.field8240[var4] = var9;
                class195.field2709[var4] = class650.field8282.method135(0, "m" + var5 + "_" + var8);
                class459.field5994[var4] = class650.field8282.method135(0, "l" + var5 + "_" + var8);
                class439.field5768[var4] = class650.field8282.method135(0, "n" + var5 + "_" + var8);
                class448.field5848[var4] = class650.field8282.method135(0, "um" + var5 + "_" + var8);
                class484.field6249[var4] = class650.field8282.method135(0, "ul" + var5 + "_" + var8);
                if (class439.field5768[var4] == -1) {
                    class195.field2709[var4] = -1;
                    class459.field5994[var4] = -1;
                    class448.field5848[var4] = -1;
                    class484.field6249[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class439.field5768.length; var6++) {
            class439.field5768[var6] = -1;
            class195.field2709[var6] = -1;
            class459.field5994[var6] = -1;
            class448.field5848[var6] = -1;
            class484.field6249[var6] = -1;
        }
        byte var7;
        if (class332.field4052 == 3) {
            var7 = 4;
        } else {
            var7 = 8;
        }
        class166.method1057(var1, false, var2, var7, 98);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIIII)V", line = 148)
    public static final void method2289(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 < 18) {
            field5192 = null;
        }
        field5200++;
        int var5 = class737.field9977;
        if (var5 == 0) {
            return;
        }
        if (var5 == 1) {
            class737.field9977 = 2;
            class434.field5696 = arg0;
            class438.field5763 = arg4;
            class585.field7409 = arg2;
            class406.field5388 = arg1;
        } else if (var5 == 2) {
            if (arg2 > class585.field7409) {
                class585.field7409 = arg2;
            }
            if (arg4 < class438.field5763) {
                class438.field5763 = arg4;
            }
            if (class406.field5388 < arg1) {
                class406.field5388 = arg1;
            }
            if (class434.field5696 > arg0) {
                class434.field5696 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V", line = 205)
    public static final void method2290(boolean arg0) {
        if (arg0) {
            class28.field252 = class324.field4002;
            class116.field1542 = class735.field9973;
        } else {
            class28.field252 = class137.field1810;
            class116.field1542 = class383.field4790;
        }
        class78.field1121 = class28.field252.length;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(IIIII)V", line = 451)
    public class395(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5202 = arg4;
        this.field5193 = arg2;
        this.field5198 = arg3;
        this.field5197 = arg0;
        this.field5199 = arg1;
        this.method2283(17393);
        this.method2292((byte) -41);
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIZI)V", line = 240)
    public final void method2291(int arg0, int arg1, boolean arg2, int arg3) {
        field5201++;
        if (arg2) {
            this.field5202 = 3;
        }
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg1];
        int[] var7 = new int[arg0];
        for (int var8 = 0; var8 < arg3; var8++) {
            var5[var8] = (var8 << 12) / arg3;
        }
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var7[var10] = (var10 << 12) / arg0;
        }
        this.method2285(-4);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field5199; var14++) {
                        int var15 = this.field5203[var14] << 12;
                        int var16 = this.field5202 * var15 >> 12;
                        int var17 = this.field5198 * var15 >> 12;
                        int var18 = this.field5193 * var15 >> 12;
                        int var19 = var5[var13] * var15 >> 12;
                        int var20 = var6[var12] * var15 >> 12;
                        int var21 = var7[var11] * var15 >> 12;
                        int var22 = this.field5193 * var19;
                        int var23 = this.field5198 * var20;
                        int var24 = this.field5202 * var21;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var23 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var24 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var23 & 0xFFF;
                        int var34 = var31 & 0xFF;
                        int var35;
                        if (var16 <= var32) {
                            var35 = 0;
                        } else {
                            var35 = var32 & 0xFF;
                        }
                        int var36 = var22 & 0xFFF;
                        int var37 = var24 & 0xFFF;
                        int var38;
                        if (var29 < var17) {
                            var38 = var29 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        int var39;
                        if (var26 >= var18) {
                            var39 = 0;
                        } else {
                            var39 = var26 & 0xFF;
                        }
                        short var40 = this.field5204[var34];
                        int var41 = var33 - 4096;
                        int var42 = var37 - 4096;
                        int var43 = var36 - 4096;
                        int var44 = class340.field4166[var33];
                        short var45 = this.field5204[var35];
                        int var46 = class340.field4166[var36];
                        int var47 = class340.field4166[var37];
                        short var48 = this.field5204[var30 + var45];
                        short var49 = this.field5204[var30 + var40];
                        short var50 = this.field5204[var38 + var40];
                        short var51 = this.field5204[var38 + var45];
                        int var52 = class32.method169(var37, this.field5204[var28 + var49], (byte) -84, var33, var36);
                        int var53 = class32.method169(var37, this.field5204[var39 + var49], (byte) -90, var33, var43);
                        int var54 = var52 + ((var53 - var52) * var46 >> 12);
                        int var55 = class32.method169(var37, this.field5204[var28 + var50], (byte) -84, var41, var36);
                        int var56 = class32.method169(var37, this.field5204[var39 + var50], (byte) -115, var41, var43);
                        int var57 = var55 + ((var56 - var55) * var46 >> 12);
                        int var58 = class32.method169(var42, this.field5204[var28 + var48], (byte) -124, var33, var36);
                        int var59 = var54 + ((var57 - var54) * var44 >> 12);
                        int var60 = class32.method169(var42, this.field5204[var39 + var48], (byte) -122, var33, var43);
                        int var61 = ((var60 - var58) * var46 >> 12) + var58;
                        int var62 = class32.method169(var42, this.field5204[var28 + var51], (byte) -106, var41, var36);
                        int var63 = class32.method169(var42, this.field5204[var39 + var51], (byte) -108, var41, var43);
                        int var64 = var62 + ((var63 - var62) * var46 >> 12);
                        int var65 = ((var64 - var61) * var44 >> 12) + var61;
                        this.method2293(var14, true, ((var65 - var59) * var47 >> 12) + var59);
                    }
                    this.method2286(2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V", line = 406)
    private final void method2292(byte arg0) {
        field5196++;
        Random var2 = new Random((long) this.field5197);
        int var3 = 0;
        if (arg0 > -19) {
            method2290(true);
        }
        while (var3 < 255) {
            this.field5204[var3] = (short) var3;
            var3++;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class419.method2416(var5, var2, (byte) 43);
            short var7 = this.field5204[var6];
            this.field5204[var6] = this.field5204[var5];
            this.field5204[var5] = this.field5204[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)V")
    public abstract void method2285(int arg0);

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
    public abstract void method2286(int arg0);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZI)V")
    public abstract void method2293(int arg0, boolean arg1, int arg2);
}
