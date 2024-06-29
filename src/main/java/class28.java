import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public abstract class class28 {

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    private int field450 = 4;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    private int field452 = 4;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    private int field457 = 4;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public int field453 = 4;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    private int field458 = 0;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "[S")
    private short[] field460 = new short[512];

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Z")
    public static boolean field455 = false;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "Z")
    public static volatile boolean field459 = true;

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "[Z")
    public static boolean[] field461 = new boolean[200];

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field454;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "[S")
    private short[] field464;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIZ)V", line = 10)
    public final void method180(int arg0, int arg1, int arg2, boolean arg3) {
        field454++;
        if (!arg3) {
            return;
        }
        int[] var5 = new int[arg2];
        int[] var6 = new int[arg1];
        for (int var7 = 0; var7 < arg1; var7++) {
            var6[var7] = (var7 << 12) / arg1;
        }
        int[] var8 = new int[arg0];
        for (int var9 = 0; var9 < arg2; var9++) {
            var5[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var8[var10] = (var10 << 12) / arg0;
        }
        this.method188(200);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field453; var14++) {
                        int var15 = this.field464[var14] << 12;
                        int var16 = this.field450 * var15 >> 12;
                        int var17 = var6[var13] * var15 >> 12;
                        int var18 = var5[var12] * var15 >> 12;
                        int var19 = this.field450 * var18;
                        int var20 = var8[var11] * var15 >> 12;
                        int var21 = var19 >> 12;
                        int var22 = this.field452 * var15 >> 12;
                        int var23 = var19 & 0xFFF;
                        int var24 = this.field457 * var17;
                        int var25 = var23 - 4096;
                        int var26 = var21 + 1;
                        int var27 = var21 & 0xFF;
                        int var28 = this.field457 * var15 >> 12;
                        int var29 = class264.field4088[var23];
                        int var30;
                        if (var26 >= var16) {
                            var30 = 0;
                        } else {
                            var30 = var26 & 0xFF;
                        }
                        int var31 = var24 >> 12;
                        int var32 = var24 & 0xFFF;
                        int var33 = this.field452 * var20;
                        int var34 = class264.field4088[var32];
                        int var35 = var31 + 1;
                        int var36;
                        if (var28 <= var35) {
                            var36 = 0;
                        } else {
                            var36 = var35 & 0xFF;
                        }
                        int var37 = var32 - 4096;
                        int var38 = var33 >> 12;
                        int var39 = var31 & 0xFF;
                        int var40 = var33 & 0xFFF;
                        int var41 = class264.field4088[var40];
                        int var42 = var40 - 4096;
                        int var43 = var38 + 1;
                        int var44;
                        if (var43 < var22) {
                            var44 = var43 & 0xFF;
                        } else {
                            var44 = 0;
                        }
                        short var45 = this.field460[var44];
                        short var46 = this.field460[var30 + var45];
                        int var47 = var38 & 0xFF;
                        short var48 = this.field460[var47];
                        short var49 = this.field460[var27 + var48];
                        short var50 = this.field460[var27 + var45];
                        short var51 = this.field460[var30 + var48];
                        int var52 = class11.method86(this.field460[var39 + var49], var23, 4836, var40, var32);
                        int var53 = class11.method86(this.field460[var36 + var49], var23, 4836, var40, var37);
                        int var54 = ((var53 - var52) * var34 >> 12) + var52;
                        int var55 = class11.method86(this.field460[var39 + var51], var25, 4836, var40, var32);
                        int var56 = class11.method86(this.field460[var36 + var51], var25, 4836, var40, var37);
                        int var57 = ((var56 - var55) * var34 >> 12) + var55;
                        int var58 = ((var57 - var54) * var29 >> 12) + var54;
                        int var59 = class11.method86(this.field460[var39 + var50], var23, 4836, var42, var32);
                        int var60 = class11.method86(this.field460[var36 + var50], var23, 4836, var42, var37);
                        int var61 = ((var60 - var59) * var34 >> 12) + var59;
                        int var62 = class11.method86(this.field460[var39 + var46], var25, 4836, var42, var32);
                        int var63 = class11.method86(this.field460[var36 + var46], var25, 4836, var42, var37);
                        int var64 = var62 + ((var63 - var62) * var34 >> 12);
                        int var65 = var61 + ((var64 - var61) * var29 >> 12);
                        this.method189(((var65 - var58) * var41 >> 12) + var58, -2097549204, var14);
                    }
                    this.method187((byte) 112);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V", line = 186)
    private final void method181(byte arg0) {
        this.field464 = new short[this.field453];
        field465++;
        int var2 = -121 % ((arg0 - 84) / 36);
        for (int var3 = 0; var3 < this.field453; var3++) {
            this.field464[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)Lbh;", line = 207)
    public static final class274 method182(byte arg0) {
        class274 var1;
        if (class265.field4126) {
            var1 = new class209(class326.field5064, class52.field820, class246.field3811[0], class62.field962[0], class108.field1797[0], class3.field14[0], class270.field4198[0], class251.field3871);
        } else {
            var1 = new class315(class326.field5064, class52.field820, class246.field3811[0], class62.field962[0], class108.field1797[0], class3.field14[0], class270.field4198[0], class251.field3871);
        }
        class233.method1680((byte) -12);
        field451++;
        if (arg0 <= 37) {
            method186((byte) -2);
        }
        return var1;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 226)
    public static void method183(int arg0) {
        if (arg0 > 80) {
            field461 = null;
        }
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V", line = 240)
    public static final void method184(int arg0) {
        int var1 = 0;
        field462++;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class102.method788(true, var2, class60.field946, var3, var1, false)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (arg0 != 1) {
            field459 = false;
        }
    }

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(IIIII)V", line = 419)
    public class28(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field457 = arg2;
        this.field453 = arg1;
        this.field458 = arg0;
        this.field452 = arg4;
        this.field450 = arg3;
        this.method181((byte) 124);
        this.method185(62);
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V", line = 282)
    private final void method185(int arg0) {
        field463++;
        if (arg0 <= 57) {
            method190(36, -44);
        }
        Random var2 = new Random((long) this.field458);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field460[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class86.method621((byte) -38, var2, var5);
            short var7 = this.field460[var6];
            this.field460[var6] = this.field460[var5];
            this.field460[var5] = this.field460[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "(B)V", line = 321)
    public static final void method186(byte arg0) {
        field449++;
        class124 var1 = new class124();
        int var2 = 0;
        if (arg0 < 125) {
            field459 = false;
        }
        while (var2 < 13) {
            for (int var3 = 0; var3 < 13; var3++) {
                class259.field4026[var2][var3] = var1;
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Lvi;", line = 377)
    public static final class6 method190(int arg0, int arg1) {
        field456++;
        class6 var2 = (class6) class183.field2922.method1830((long) arg1, (byte) 52);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = client.field3911.method467(class82.method591(arg1, -3480), 85, class183.method1378(arg1, (byte) 127));
        class6 var4 = new class6();
        var4.field106 = arg1;
        int var5 = 35 % ((-arg0 - 53) / 55);
        if (var3 != null) {
            var4.method26(new class101(var3), (byte) -63);
        }
        var4.method29(0);
        if (!class136.field2160 && var4.field88) {
            var4.field114 = null;
        }
        if (var4.field111) {
            var4.field86 = 0;
            var4.field105 = false;
        }
        class183.field2922.method1831((long) arg1, var4, -13897);
        return var4;
    }

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(B)V")
    public abstract void method187(byte arg0);

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
    public abstract void method188(int arg0);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
    public abstract void method189(int arg0, int arg1, int arg2);
}
