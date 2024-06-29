import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class class299 {

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    private int field4520 = 4;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    private int field4526 = 4;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "[S")
    private short[] field4527 = new short[512];

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    private int field4531 = 0;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    private int field4529 = 4;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public int field4522 = 4;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "Lwl;")
    public static class452 field4532;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "[Lkr;")
    public static class234[] field4534;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "[Lon;")
    public static class432[] field4519;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "[S")
    private short[] field4530;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public abstract void method75(int arg0);

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    private final void method1844(int arg0) {
        if (arg0 != 255) {
            this.method71(26, -68, 106);
        }
        field4524++;
        Random var2 = new Random((long) this.field4531);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field4527[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class330.method2028(-123, var5, var2);
            short var7 = this.field4527[var6];
            this.field4527[var6] = this.field4527[var5];
            this.field4527[var5] = this.field4527[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
    private final void method1845(int arg0) {
        this.field4530 = new short[this.field4522];
        field4528++;
        for (int var2 = arg0; var2 < this.field4522; var2++) {
            this.field4530[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static void method1846(byte arg0) {
        field4532 = null;
        field4534 = null;
        field4519 = null;
        if (arg0 < 51) {
            field4534 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Liq;II)Loq;")
    public static final class438 method1847(class134 arg0, int arg1, int arg2) {
        field4533++;
        byte[] var3 = arg0.method825(arg1, 0);
        if (var3 == null) {
            return null;
        } else {
            if (arg2 != -19325) {
                method1850((class45) null, 122, 80, -27, -74);
            }
            return new class438(var3);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIBI)V")
    public final void method1848(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 >= -42) {
            field4519 = null;
        }
        field4521++;
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg0];
        int[] var7 = new int[arg1];
        for (int var8 = 0; var8 < arg3; var8++) {
            var5[var8] = (var8 << 12) / arg3;
        }
        for (int var9 = 0; var9 < arg0; var9++) {
            var6[var9] = (var9 << 12) / arg0;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var7[var10] = (var10 << 12) / arg1;
        }
        this.method75(0);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg0; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field4522; var14++) {
                        int var15 = this.field4530[var14] << 12;
                        int var16 = var5[var13] * var15 >> 12;
                        int var17 = this.field4526 * var15 >> 12;
                        int var18 = this.field4529 * var15 >> 12;
                        int var19 = this.field4520 * var15 >> 12;
                        int var20 = var7[var11] * var15 >> 12;
                        int var21 = var6[var12] * var15 >> 12;
                        int var22 = this.field4529 * var21;
                        int var23 = this.field4526 * var20;
                        int var24 = this.field4520 * var16;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var22 >> 12;
                        int var28 = var25 & 0xFF;
                        int var29 = var27 + 1;
                        int var30 = var27 & 0xFF;
                        int var31 = var23 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var23 & 0xFFF;
                        int var34;
                        if (var29 >= var18) {
                            var34 = 0;
                        } else {
                            var34 = var29 & 0xFF;
                        }
                        int var35 = var22 & 0xFFF;
                        int var36 = var24 & 0xFFF;
                        int var37;
                        if (var19 <= var26) {
                            var37 = 0;
                        } else {
                            var37 = var26 & 0xFF;
                        }
                        int var38;
                        if (var32 < var17) {
                            var38 = var32 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        int var39 = var31 & 0xFF;
                        short var40 = this.field4527[var39];
                        int var41 = class459.field6797[var36];
                        int var42 = class459.field6797[var35];
                        int var43 = var33 - 4096;
                        short var44 = this.field4527[var38];
                        int var45 = class459.field6797[var33];
                        int var46 = var35 - 4096;
                        int var47 = var36 - 4096;
                        short var48 = this.field4527[var34 + var40];
                        short var49 = this.field4527[var30 + var40];
                        short var50 = this.field4527[var30 + var44];
                        short var51 = this.field4527[var34 + var44];
                        int var52 = class153.method943(var36, this.field4527[var28 + var49], var33, 99, var35);
                        int var53 = class153.method943(var47, this.field4527[var37 + var49], var33, 126, var35);
                        int var54 = var52 + ((var53 - var52) * var41 >> 12);
                        int var55 = class153.method943(var36, this.field4527[var28 + var48], var33, 123, var46);
                        int var56 = class153.method943(var47, this.field4527[var37 + var48], var33, 110, var46);
                        int var57 = ((var56 - var55) * var41 >> 12) + var55;
                        int var58 = var54 + ((var57 - var54) * var42 >> 12);
                        int var59 = class153.method943(var36, this.field4527[var28 + var50], var43, 127, var35);
                        int var60 = class153.method943(var47, this.field4527[var37 + var50], var43, 98, var35);
                        int var61 = ((var60 - var59) * var41 >> 12) + var59;
                        int var62 = class153.method943(var36, this.field4527[var28 + var51], var43, 110, var46);
                        int var63 = class153.method943(var47, this.field4527[var37 + var51], var43, 106, var46);
                        int var64 = ((var63 - var62) * var41 >> 12) + var62;
                        int var65 = ((var64 - var61) * var42 >> 12) + var61;
                        this.method71(((var65 - var58) * var45 >> 12) + var58, 0, var14);
                    }
                    this.method74(15535);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Liq;B)V")
    public static final void method1849(class134 arg0, byte arg1) {
        class14.field177 = arg0;
        if (arg1 <= 32) {
            field4519 = null;
        }
        field4525++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lmf;IIII)V")
    public static final void method1850(class45 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class42.method235(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class275.field4206) {
            class42.method235(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class42.method235(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class265.field4044) {
            class42.method235(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class265.field4044) {
            class42.method235(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class275.field4206 && arg4 <= class265.field4044) {
            class42.method235(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class42.method235(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class275.field4206 && arg4 > 0) {
            class42.method235(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
    public abstract void method74(int arg0);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIILkp;Lkp;)V")
    public static final void method1851(int arg0, int arg1, int arg2, class337 arg3, class337 arg4) {
        class13 var5 = class230.method1395(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field164 = arg3;
            var5.field149 = arg4;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)V")
    public abstract void method71(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZIZZI)Liq;")
    public static final class134 method1852(boolean arg0, int arg1, boolean arg2, boolean arg3, int arg4) {
        field4523++;
        if (arg3) {
            method1851(-54, 27, 33, (class337) null, (class337) null);
        }
        class415 var5 = null;
        if (class81.field1068 != null) {
            var5 = new class415(arg1, class81.field1068, class137.field1852[arg1], 1000000);
        }
        class151.field2087[arg1] = class132.field1690.method1767(class282.field4307, (byte) -93, arg1, var5);
        if (arg0) {
            class151.field2087[arg1].method2814(-612);
        }
        return new class134(class151.field2087[arg1], arg2, arg4);
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(IIIII)V")
    public class299(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4522 = arg1;
        this.field4526 = arg4;
        this.field4529 = arg3;
        this.field4520 = arg2;
        this.field4531 = arg0;
        this.method1845(0);
        this.method1844(255);
    }

    static {
        new class151("You can spot a Jagex moderator by the gold crown next to their name.", "Jagex-Mitarbeiter haben eine goldene Krone neben ihrem Namen.", "Vous pouvez reconnaître les modérateurs Jagex à la couronne dorée en regard de leur nom.", "Os moderadores da Jagex são identificados por uma coroa dourada próxima ao \u007fnome.");
    }
}
