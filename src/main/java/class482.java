import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public abstract class class482 {

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    private int field6992 = 0;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    private int field6994 = 4;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "I")
    private int field6993 = 4;

    @OriginalMember(owner = "client!t", name = "j", descriptor = "I")
    public int field7001 = 4;

    @OriginalMember(owner = "client!t", name = "f", descriptor = "I")
    private int field6997 = 4;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "[S")
    private short[] field6998 = new short[512];

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field6999 = 0;

    @OriginalMember(owner = "client!t", name = "m", descriptor = "Lqt;")
    public static class459 field7004 = new class459(31, 3);

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field6996;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "I")
    public static int field7000;

    @OriginalMember(owner = "client!t", name = "k", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!t", name = "l", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!t", name = "n", descriptor = "Laa;")
    public static class343 field7005;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "[S")
    private short[] field6995;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V", line = 4)
    public static void method2843(byte arg0) {
        field7004 = null;
        if (arg0 > 12) {
            field7005 = null;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "([Laa;B)V", line = 20)
    public static final void method2844(class343[] arg0, byte arg1) {
        if (arg1 <= 70) {
            method2844(null, (byte) -107);
        }
        class26.field369 = arg0.length;
        field7002++;
        class175.field2613 = new int[class26.field369 + 10];
        class7.field40 = new class343[class26.field369 + 10];
        class282.method1820(arg0, 0, class7.field40, 0, class26.field369);
        for (int var2 = 0; var2 < class26.field369; var2++) {
            class175.field2613[var2] = class7.field40[var2].method374();
        }
        for (int var3 = class26.field369; var3 < class7.field40.length; var3++) {
            class175.field2613[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V", line = 50)
    private final void method2845(int arg0) {
        field7000++;
        this.field6995 = new short[this.field7001];
        if (arg0 != 2) {
            this.method2846(false, -128, 74, -25);
        }
        for (int var2 = 0; var2 < this.field7001; var2++) {
            this.field6995[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(ZIII)V", line = 73)
    public final void method2846(boolean arg0, int arg1, int arg2, int arg3) {
        field7003++;
        if (arg0) {
            return;
        }
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg3];
        int[] var7 = new int[arg1];
        for (int var8 = 0; var8 < arg2; var8++) {
            var5[var8] = (var8 << 12) / arg2;
        }
        for (int var9 = 0; var9 < arg3; var9++) {
            var6[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var7[var10] = (var10 << 12) / arg1;
        }
        this.method1848(114);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field7001; var14++) {
                        int var15 = this.field6995[var14] << 12;
                        int var16 = var7[var11] * var15 >> 12;
                        int var17 = this.field6997 * var15 >> 12;
                        int var18 = this.field6994 * var15 >> 12;
                        int var19 = var6[var12] * var15 >> 12;
                        int var20 = this.field6993 * var15 >> 12;
                        int var21 = var5[var13] * var15 >> 12;
                        int var22 = this.field6997 * var21;
                        int var23 = this.field6993 * var19;
                        int var24 = this.field6994 * var16;
                        int var25 = var22 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var23 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var28 & 0xFF;
                        int var31 = var24 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var31 & 0xFF;
                        int var34;
                        if (var18 <= var32) {
                            var34 = 0;
                        } else {
                            var34 = var32 & 0xFF;
                        }
                        int var35;
                        if (var26 < var17) {
                            var35 = var26 & 0xFF;
                        } else {
                            var35 = 0;
                        }
                        int var36 = var22 & 0xFFF;
                        int var37;
                        if (var29 < var20) {
                            var37 = var29 & 0xFF;
                        } else {
                            var37 = 0;
                        }
                        int var38 = var23 & 0xFFF;
                        int var39 = var24 & 0xFFF;
                        int var40 = var36 - 4096;
                        short var41 = this.field6998[var33];
                        int var42 = class51.field941[var38];
                        int var43 = class51.field941[var39];
                        int var44 = var39 - 4096;
                        short var45 = this.field6998[var34];
                        int var46 = var38 - 4096;
                        int var47 = class51.field941[var36];
                        short var48 = this.field6998[var37 + var41];
                        short var49 = this.field6998[var37 + var45];
                        short var50 = this.field6998[var30 + var41];
                        short var51 = this.field6998[var30 + var45];
                        int var52 = class364.method2246(var36, this.field6998[var27 + var50], var39, -125, var38);
                        int var53 = class364.method2246(var40, this.field6998[var35 + var50], var39, -110, var38);
                        int var54 = ((var53 - var52) * var47 >> 12) + var52;
                        int var55 = class364.method2246(var36, this.field6998[var27 + var48], var39, -86, var46);
                        int var56 = class364.method2246(var40, this.field6998[var35 + var48], var39, -111, var46);
                        int var57 = ((var56 - var55) * var47 >> 12) + var55;
                        int var58 = ((var57 - var54) * var42 >> 12) + var54;
                        int var59 = class364.method2246(var36, this.field6998[var27 + var51], var44, -98, var38);
                        int var60 = class364.method2246(var40, this.field6998[var35 + var51], var44, -107, var38);
                        int var61 = ((var60 - var59) * var47 >> 12) + var59;
                        int var62 = class364.method2246(var36, this.field6998[var27 + var49], var44, -124, var46);
                        int var63 = class364.method2246(var40, this.field6998[var35 + var49], var44, -121, var46);
                        int var64 = ((var63 - var62) * var47 >> 12) + var62;
                        int var65 = ((var64 - var61) * var42 >> 12) + var61;
                        this.method1850(-1734376532, var14, var58 + ((var65 - var58) * var43 >> 12));
                    }
                    this.method1853(343124908);
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "<init>", descriptor = "(IIIII)V", line = 310)
    public class482(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6992 = arg0;
        this.field6997 = arg2;
        this.field6994 = arg4;
        this.field7001 = arg1;
        this.field6993 = arg3;
        this.method2845(2);
        this.method2847(true);
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(Z)V", line = 273)
    private final void method2847(boolean arg0) {
        field6996++;
        if (!arg0) {
            this.method2846(false, -115, 22, -64);
        }
        Random var2 = new Random((long) this.field6992);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field6998[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class392.method2360(Integer.MIN_VALUE, var2, var5);
            short var7 = this.field6998[var6];
            this.field6998[var6] = this.field6998[var5];
            this.field6998[var5] = this.field6998[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
    public abstract void method1848(int arg0);

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V")
    public abstract void method1853(int arg0);

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(III)V")
    public abstract void method1850(int arg0, int arg1, int arg2);
}
