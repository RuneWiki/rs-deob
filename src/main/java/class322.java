import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public abstract class class322 {

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    private int field5118 = 4;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    private int field5116 = 0;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "I")
    private int field5125 = 4;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public int field5117 = 4;

    @OriginalMember(owner = "client!dk", name = "o", descriptor = "I")
    private int field5130 = 4;

    @OriginalMember(owner = "client!dk", name = "s", descriptor = "[S")
    private short[] field5134 = new short[512];

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "Z")
    public static boolean field5124 = false;

    @OriginalMember(owner = "client!dk", name = "p", descriptor = "Ljava/lang/String;")
    public static String field5131 = "Loading world list data";

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "Lrl;")
    public static class324 field5128 = class283.method2075(1);

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field5121;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    public static int field5122;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!dk", name = "r", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!dk", name = "t", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "Lth;")
    public static class57 field5123;

    @OriginalMember(owner = "client!dk", name = "q", descriptor = "[I")
    public static int[] field5132;

    @OriginalMember(owner = "client!dk", name = "n", descriptor = "[S")
    private short[] field5129;

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(IIIII)V", line = 318)
    public class322(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5118 = arg3;
        this.field5117 = arg1;
        this.field5125 = arg2;
        this.field5116 = arg0;
        this.field5130 = arg4;
        this.method2275((byte) 115);
        this.method2274(false);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII)V", line = 19)
    public static final void method2271(int arg0, int arg1, int arg2, int arg3) {
        String var4 = "::tele " + arg1 + "," + (arg3 >> 6) + "," + (arg2 >> 6) + "," + (arg3 & 0x3F) + "," + (arg2 & 0x3F);
        if (arg0 < 85) {
            field5132 = (int[]) null;
        }
        System.out.println(var4);
        class279.method2065(1746, var4);
        field5126++;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(IIII)V", line = 36)
    public final void method2272(int arg0, int arg1, int arg2, int arg3) {
        field5135++;
        if (arg0 != 1714362860) {
            field5131 = (String) null;
        }
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg3];
        int[] var7 = new int[arg2];
        for (int var8 = 0; var8 < arg1; var8++) {
            var5[var8] = (var8 << 12) / arg1;
        }
        for (int var9 = 0; var9 < arg3; var9++) {
            var6[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var7[var10] = (var10 << 12) / arg2;
        }
        this.method156(121);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field5117; var14++) {
                        int var15 = this.field5129[var14] << 12;
                        int var16 = this.field5125 * var15 >> 12;
                        int var17 = var7[var11] * var15 >> 12;
                        int var18 = var6[var12] * var15 >> 12;
                        int var19 = this.field5118 * var18;
                        int var20 = this.field5130 * var17;
                        int var21 = var5[var13] * var15 >> 12;
                        int var22 = this.field5118 * var15 >> 12;
                        int var23 = var20 >> 12;
                        int var24 = var20 & 0xFFF;
                        int var25 = var23 + 1;
                        int var26 = class20.field220[var24];
                        int var27 = var24 - 4096;
                        int var28 = var23 & 0xFF;
                        int var29 = this.field5130 * var15 >> 12;
                        int var30 = this.field5125 * var21;
                        int var31;
                        if (var29 > var25) {
                            var31 = var25 & 0xFF;
                        } else {
                            var31 = 0;
                        }
                        short var32 = this.field5134[var28];
                        int var33 = var30 >> 12;
                        int var34 = var30 & 0xFFF;
                        int var35 = var34 - 4096;
                        int var36 = var33 + 1;
                        int var37 = var19 >> 12;
                        int var38 = var33 & 0xFF;
                        int var39 = class20.field220[var34];
                        int var40;
                        if (var16 > var36) {
                            var40 = var36 & 0xFF;
                        } else {
                            var40 = 0;
                        }
                        int var41 = var19 & 0xFFF;
                        int var42 = var41 - 4096;
                        int var43 = var37 + 1;
                        int var44 = var37 & 0xFF;
                        int var45 = class20.field220[var41];
                        short var46 = this.field5134[var44 + var32];
                        short var47 = this.field5134[var31];
                        int var48;
                        if (var43 >= var22) {
                            var48 = 0;
                        } else {
                            var48 = var43 & 0xFF;
                        }
                        short var49 = this.field5134[var32 + var48];
                        short var50 = this.field5134[var47 + var48];
                        short var51 = this.field5134[var44 + var47];
                        int var52 = class122.method966(var34, 116, this.field5134[var38 + var46], var41, var24);
                        int var53 = class122.method966(var35, arg0 ^ 0x99D0E61D, this.field5134[var40 + var46], var41, var24);
                        int var54 = ((var53 - var52) * var39 >> 12) + var52;
                        int var55 = class122.method966(var34, -1, this.field5134[var38 + var49], var42, var24);
                        int var56 = class122.method966(var35, -116, this.field5134[var40 + var49], var42, var24);
                        int var57 = var55 + ((var56 - var55) * var39 >> 12);
                        int var58 = ((var57 - var54) * var45 >> 12) + var54;
                        int var59 = class122.method966(var34, -27, this.field5134[var38 + var51], var41, var27);
                        int var60 = class122.method966(var35, 117, this.field5134[var40 + var51], var41, var27);
                        int var61 = ((var60 - var59) * var39 >> 12) + var59;
                        int var62 = class122.method966(var34, -11, this.field5134[var38 + var50], var42, var27);
                        int var63 = class122.method966(var35, 123, this.field5134[var40 + var50], var42, var27);
                        int var64 = ((var63 - var62) * var39 >> 12) + var62;
                        int var65 = ((var64 - var61) * var45 >> 12) + var61;
                        this.method154(2, ((var65 - var58) * var26 >> 12) + var58, var14);
                    }
                    this.method162(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILwf;B)I", line = 207)
    public static final int method2273(int arg0, class250 arg1, byte arg2) {
        if (arg2 <= 20) {
            return 84;
        }
        field5120++;
        if (!client.method336(arg1).method810((byte) 126, arg0) && arg1.field4166 == null) {
            return -1;
        } else if (arg1.field4088 == null || arg0 >= arg1.field4088.length) {
            return -1;
        } else {
            return arg1.field4088[arg0];
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)V", line = 223)
    private final void method2274(boolean arg0) {
        Random var2 = new Random((long) this.field5116);
        int var3 = 0;
        if (arg0) {
            method2273(-127, (class250) null, (byte) -112);
        }
        while (var3 < 255) {
            this.field5134[var3] = (short) var3;
            var3++;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class2.method4(var5, var2, -44);
            short var7 = this.field5134[var6];
            this.field5134[var6] = this.field5134[var5];
            this.field5134[var5] = this.field5134[var5 + 256] = var7;
        }
        field5127++;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V", line = 259)
    private final void method2275(byte arg0) {
        this.field5129 = new short[this.field5117];
        int var2 = 0;
        int var3 = -110 / ((-arg0 - 59) / 34);
        while (this.field5117 > var2) {
            this.field5129[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
            var2++;
        }
        field5122++;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V", line = 285)
    public static void method2276(byte arg0) {
        field5132 = null;
        field5123 = null;
        if (arg0 >= 88) {
            field5131 = null;
            field5128 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
    public abstract void method156(int arg0);

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)V")
    public abstract void method154(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(Z)V")
    public abstract void method162(boolean arg0);
}
