import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public abstract class class290 {

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    private int field4328 = 4;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    private int field4333 = 0;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    private int field4322 = 4;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    private int field4335 = 4;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "[S")
    private short[] field4326 = new short[512];

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
    public int field4337 = 4;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4319 = " more options";

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4325 = new String[200];

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Lin;")
    public static class344 field4324 = null;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4327 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "[I")
    public static int[] field4323 = new int[1000];

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "[Lve;")
    public static class215[] field4339 = new class215[50];

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field4321;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "Lpn;")
    public static class170 field4336;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "Z")
    public static boolean field4332;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "[S")
    private short[] field4329;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V", line = 4)
    private final void method1987(boolean arg0) {
        field4331++;
        Random var2 = new Random((long) this.field4333);
        if (!arg0) {
            return;
        }
        for (int var3 = 0; var3 < 255; var3++) {
            this.field4326[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class175.method1217((byte) 103, var2, var5);
            short var7 = this.field4326[var6];
            this.field4326[var6] = this.field4326[var5];
            this.field4326[var5] = this.field4326[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB)V", line = 43)
    public static final void method1988(int arg0, byte arg1) {
        class148.field2045.method720(arg0, 1088);
        field4330++;
        if (arg1 != -34) {
            field4323 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V", line = 55)
    private final void method1989(byte arg0) {
        if (arg0 > -123) {
            method1991(true, (byte) 7, (class48) null);
        }
        field4334++;
        this.field4329 = new short[this.field4337];
        for (int var2 = 0; var2 < this.field4337; var2++) {
            this.field4329[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BIII)V", line = 89)
    public final void method1990(byte arg0, int arg1, int arg2, int arg3) {
        field4321++;
        if (arg0 != 34) {
            this.method1051((byte) 104, -53, -89);
        }
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg3];
        for (int var7 = 0; var7 < arg3; var7++) {
            var6[var7] = (var7 << 12) / arg3;
        }
        int[] var8 = new int[arg2];
        for (int var9 = 0; var9 < arg2; var9++) {
            var8[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var5[var10] = (var10 << 12) / arg1;
        }
        this.method1049((byte) -25);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field4337; var14++) {
                        int var15 = this.field4329[var14] << 12;
                        int var16 = this.field4322 * var15 >> 12;
                        int var17 = var8[var12] * var15 >> 12;
                        int var18 = this.field4335 * var15 >> 12;
                        int var19 = this.field4328 * var15 >> 12;
                        int var20 = var5[var11] * var15 >> 12;
                        int var21 = var6[var13] * var15 >> 12;
                        int var22 = this.field4322 * var21;
                        int var23 = this.field4328 * var20;
                        int var24 = var23 >> 12;
                        int var25 = var24 + 1;
                        int var26 = var24 & 0xFF;
                        int var27;
                        if (var19 <= var25) {
                            var27 = 0;
                        } else {
                            var27 = var25 & 0xFF;
                        }
                        int var28 = var23 & 0xFFF;
                        int var29 = var22 >> 12;
                        short var30 = this.field4326[var27];
                        int var31 = var28 - 4096;
                        short var32 = this.field4326[var26];
                        int var33 = var29 + 1;
                        int var34 = var29 & 0xFF;
                        int var35;
                        if (var33 >= var16) {
                            var35 = 0;
                        } else {
                            var35 = var33 & 0xFF;
                        }
                        int var36 = var22 & 0xFFF;
                        int var37 = class41.field467[var36];
                        int var38 = this.field4335 * var17;
                        int var39 = class41.field467[var28];
                        int var40 = var36 - 4096;
                        int var41 = var38 >> 12;
                        int var42 = var41 + 1;
                        int var43 = var38 & 0xFFF;
                        int var44 = class41.field467[var43];
                        int var45 = var43 - 4096;
                        int var46 = var41 & 0xFF;
                        short var47 = this.field4326[var32 + var46];
                        int var48;
                        if (var42 >= var18) {
                            var48 = 0;
                        } else {
                            var48 = var42 & 0xFF;
                        }
                        short var49 = this.field4326[var32 + var48];
                        short var50 = this.field4326[var48 + var30];
                        short var51 = this.field4326[var30 + var46];
                        int var52 = class334.method2323(var43, 3, var28, var36, this.field4326[var34 + var47]);
                        int var53 = class334.method2323(var43, 3, var28, var40, this.field4326[var35 + var47]);
                        int var54 = ((var53 - var52) * var37 >> 12) + var52;
                        int var55 = class334.method2323(var45, arg0 ^ 0x21, var28, var36, this.field4326[var34 + var49]);
                        int var56 = class334.method2323(var45, 3, var28, var40, this.field4326[var35 + var49]);
                        int var57 = ((var56 - var55) * var37 >> 12) + var55;
                        int var58 = class334.method2323(var43, 3, var31, var36, this.field4326[var34 + var51]);
                        int var59 = ((var57 - var54) * var44 >> 12) + var54;
                        int var60 = class334.method2323(var43, 3, var31, var40, this.field4326[var35 + var51]);
                        int var61 = ((var60 - var58) * var37 >> 12) + var58;
                        int var62 = class334.method2323(var45, 3, var31, var36, this.field4326[var34 + var50]);
                        int var63 = class334.method2323(var45, 3, var31, var40, this.field4326[var35 + var50]);
                        int var64 = var62 + ((var63 - var62) * var37 >> 12);
                        int var65 = ((var64 - var61) * var44 >> 12) + var61;
                        this.method1051((byte) -125, ((var65 - var59) * var39 >> 12) + var59, var14);
                    }
                    this.method1050(arg0 + 88);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZBLhm;)V", line = 254)
    public static final void method1991(boolean arg0, byte arg1, class48 arg2) {
        field4338++;
        if (arg1 <= 2) {
            method1988(121, (byte) 94);
        }
        int var3 = arg2.field595;
        int var4 = (int) arg2.field2522;
        arg2.method1274((byte) -26);
        if (arg0) {
            class155.method1119(var3, -123);
        }
        class251.method1708((byte) 116, var3);
        class344 var5 = class151.method1101(-104, var4);
        if (var5 != null) {
            class255.method1741(var5, false);
        }
        int var6 = class204.field2938;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class340.method2353(class54.field722[var7], -110)) {
                class97.method708(var7, 81);
            }
        }
        if (class204.field2938 == 1) {
            class100.field1380 = false;
            class253.method1728(class183.field2524, class218.field3131, (byte) 60, class312.field4704, class8.field79);
        } else {
            class253.method1728(class183.field2524, class218.field3131, (byte) 74, class312.field4704, class8.field79);
            int var8 = class204.field2946.method1904(class291.field4342);
            for (int var9 = 0; var9 < class204.field2938; var9++) {
                int var10 = class204.field2946.method1904(class51.method353(101, var9));
                if (var8 < var10) {
                    var8 = var10;
                }
            }
            class183.field2524 = var8 + 8;
            class218.field3131 = (class141.field1924 ? 26 : 22) + class204.field2938 * 15;
        }
        if (class183.field2521 != -1) {
            class52.method358(1, class183.field2521, 18248);
        }
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(IIIII)V", line = 391)
    public class290(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4322 = arg2;
        this.field4335 = arg3;
        this.field4337 = arg1;
        this.field4328 = arg4;
        this.field4333 = arg0;
        this.method1989((byte) -127);
        this.method1987(true);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 347)
    public static void method1992(int arg0) {
        field4323 = null;
        field4319 = null;
        if (arg0 > -74) {
            field4332 = false;
        }
        field4324 = null;
        field4339 = null;
        field4325 = null;
        field4327 = null;
        field4336 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BII)V")
    public abstract void method1051(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
    public abstract void method1049(byte arg0);

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public abstract void method1050(int arg0);
}
