import java.util.Hashtable;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public abstract class class368 {

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    private int field5202 = 0;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    private int field5198 = 4;

    @OriginalMember(owner = "client!gd", name = "k", descriptor = "I")
    public int field5205 = 4;

    @OriginalMember(owner = "client!gd", name = "l", descriptor = "I")
    private int field5206 = 4;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    private int field5200 = 4;

    @OriginalMember(owner = "client!gd", name = "n", descriptor = "[S")
    private short[] field5208 = new short[512];

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field5201 = new Hashtable();

    @OriginalMember(owner = "client!gd", name = "m", descriptor = "Z")
    public static boolean field5207 = false;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
    public static int field5199;

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!gd", name = "j", descriptor = "[S")
    private short[] field5204;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 3)
    private final void method2258(int arg0) {
        field5197++;
        Random var2 = new Random((long) this.field5202);
        int var3 = -25 / ((arg0 + 64) / 52);
        for (int var4 = 0; var4 < 255; var4++) {
            this.field5208[var4] = (short) var4;
        }
        for (int var5 = 0; var5 < 255; var5++) {
            int var6 = 255 - var5;
            int var7 = class408.method2420((byte) -15, var2, var6);
            short var8 = this.field5208[var7];
            this.field5208[var7] = this.field5208[var6];
            this.field5208[var6] = this.field5208[var6 + 256] = var8;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)V", line = 42)
    public static final void method2259(int arg0) {
        field5196++;
        class223.field2944.method346(class223.field2944.field637, 1, false);
        class223.field2944.method346(class223.field2944.field619, 1, false);
        int var1 = 100 / ((-arg0 - 12) / 47);
        class223.field2944.method346(class223.field2944.field596, 1, false);
        class223.field2944.method346(class223.field2944.field588, 1, false);
        class223.field2944.method346(class223.field2944.field610, 1, false);
        class223.field2944.method346(class223.field2944.field591, 1, false);
        class223.field2944.method346(class223.field2944.field620, 0, false);
        class223.field2944.method346(class223.field2944.field622, 0, false);
        class223.field2944.method346(class223.field2944.field611, 0, false);
        class223.field2944.method346(class223.field2944.field628, 0, false);
        class223.field2944.method346(class223.field2944.field621, 0, false);
        class223.field2944.method346(class223.field2944.field602, 0, false);
        class223.field2944.method346(class223.field2944.field604, 0, false);
        class223.field2944.method346(class223.field2944.field585, 0, false);
        class223.field2944.method346(class223.field2944.field618, 0, false);
        class223.field2944.method346(class223.field2944.field631, 0, false);
        class223.field2944.method346(class223.field2944.field615, 0, false);
        class223.field2944.method346(class223.field2944.field612, 0, false);
        class223.field2944.method346(class223.field2944.field594, 0, false);
        class87.method613(-18535);
        class223.field2944.method346(class223.field2944.field626, 2, false);
        class223.field2944.method346(class223.field2944.field609, 2, false);
        class681.method3687((byte) 62);
        class37.method328((byte) -45);
        class315.field4051 = true;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIB)V", line = 80)
    public final void method2260(int arg0, int arg1, int arg2, byte arg3) {
        field5199++;
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg1];
        int[] var7 = new int[arg2];
        for (int var8 = 0; var8 < arg0; var8++) {
            var5[var8] = (var8 << 12) / arg0;
        }
        if (arg3 < 106) {
            this.field5208 = null;
        }
        for (int var9 = 0; var9 < arg1; var9++) {
            var6[var9] = (var9 << 12) / arg1;
        }
        for (int var10 = 0; var10 < arg2; var10++) {
            var7[var10] = (var10 << 12) / arg2;
        }
        this.method681(-80);
        for (int var11 = 0; var11 < arg2; var11++) {
            for (int var12 = 0; var12 < arg1; var12++) {
                for (int var13 = 0; var13 < arg0; var13++) {
                    for (int var14 = 0; var14 < this.field5205; var14++) {
                        int var15 = this.field5204[var14] << 12;
                        int var16 = this.field5198 * var15 >> 12;
                        int var17 = var5[var13] * var15 >> 12;
                        int var18 = this.field5200 * var15 >> 12;
                        int var19 = var7[var11] * var15 >> 12;
                        int var20 = this.field5206 * var15 >> 12;
                        int var21 = var6[var12] * var15 >> 12;
                        int var22 = this.field5206 * var21;
                        int var23 = this.field5200 * var19;
                        int var24 = this.field5198 * var17;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var22 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var23 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var31 & 0xFF;
                        int var34;
                        if (var16 > var26) {
                            var34 = var26 & 0xFF;
                        } else {
                            var34 = 0;
                        }
                        int var35;
                        if (var32 < var18) {
                            var35 = var32 & 0xFF;
                        } else {
                            var35 = 0;
                        }
                        int var36;
                        if (var20 <= var29) {
                            var36 = 0;
                        } else {
                            var36 = var29 & 0xFF;
                        }
                        int var37 = var24 & 0xFFF;
                        int var38 = var22 & 0xFFF;
                        int var39 = var23 & 0xFFF;
                        short var40 = this.field5208[var33];
                        int var41 = var39 - 4096;
                        int var42 = class177.field2288[var38];
                        int var43 = var38 - 4096;
                        int var44 = class177.field2288[var37];
                        int var45 = var37 - 4096;
                        int var46 = class177.field2288[var39];
                        short var47 = this.field5208[var35];
                        short var48 = this.field5208[var30 + var47];
                        short var49 = this.field5208[var36 + var47];
                        short var50 = this.field5208[var30 + var40];
                        short var51 = this.field5208[var36 + var40];
                        int var52 = class720.method3987(var37, var38, var39, this.field5208[var28 + var50], -115);
                        int var53 = class720.method3987(var45, var38, var39, this.field5208[var34 + var50], -115);
                        int var54 = var52 + ((var53 - var52) * var44 >> 12);
                        int var55 = class720.method3987(var37, var43, var39, this.field5208[var28 + var51], -128);
                        int var56 = class720.method3987(var45, var43, var39, this.field5208[var34 + var51], -121);
                        int var57 = ((var56 - var55) * var44 >> 12) + var55;
                        int var58 = ((var57 - var54) * var42 >> 12) + var54;
                        int var59 = class720.method3987(var37, var38, var41, this.field5208[var28 + var48], -115);
                        int var60 = class720.method3987(var45, var38, var41, this.field5208[var34 + var48], -128);
                        int var61 = var59 + ((var60 - var59) * var44 >> 12);
                        int var62 = class720.method3987(var37, var43, var41, this.field5208[var28 + var49], -116);
                        int var63 = class720.method3987(var45, var43, var41, this.field5208[var34 + var49], -120);
                        int var64 = var62 + ((var63 - var62) * var44 >> 12);
                        int var65 = ((var64 - var61) * var42 >> 12) + var61;
                        this.method687(((var65 - var58) * var46 >> 12) + var58, var14, 0);
                    }
                    this.method683(-20419);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V", line = 251)
    private final void method2261(int arg0) {
        field5203++;
        this.field5204 = new short[this.field5205];
        for (int var2 = 0; var2 < this.field5205; var2++) {
            this.field5204[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 != 19895) {
            this.field5200 = 93;
        }
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)V", line = 273)
    public static final void method2262(int arg0) {
        if (arg0 >= -84) {
            field5207 = false;
        }
        class612.field8463.method2054(-22991);
        field5195++;
        class279.method1671((byte) -43);
        class68.field938 = null;
        class455.field6380 = null;
        class508.field7186 = null;
        class199.field2550 = 0;
        class471.field6763 = 0;
        class24.field414.field2354 = 0;
        class197.method1237((byte) -41);
        class760.field10595 = null;
        class492.field6976 = 0;
        class727.field10184 = 0;
        class17.field235 = 0;
        class110.field1357 = null;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(IIIII)V", line = 344)
    public class368(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5205 = arg1;
        this.field5200 = arg4;
        this.field5198 = arg2;
        this.field5202 = arg0;
        this.field5206 = arg3;
        this.method2261(19895);
        this.method2258(-119);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 313)
    public static void method2263(byte arg0) {
        field5201 = null;
        if (arg0 != -56) {
            method2259(98);
        }
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V")
    public abstract void method681(int arg0);

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)V")
    public abstract void method683(int arg0);

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)V")
    public abstract void method687(int arg0, int arg1, int arg2);
}
