import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public abstract class class7 {

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public int field86 = 4;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    private int field90 = 4;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    private int field89 = 4;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    private int field98 = 0;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    private int field87 = 4;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "[S")
    private short[] field96 = new short[512];

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field85 = -1;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "[S")
    private short[] field88;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V", line = 10)
    private final void method49(byte arg0) {
        field94++;
        this.field88 = new short[this.field86];
        if (arg0 != 114) {
            method51(78);
        }
        for (int var2 = 0; var2 < this.field86; var2++) {
            this.field88[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V", line = 37)
    private final void method50(boolean arg0) {
        Random var2 = new Random((long) this.field98);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field96[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class4.method33(false, var2, var5);
            short var7 = this.field96[var6];
            this.field96[var6] = this.field96[var5];
            this.field96[var5] = this.field96[var5 + 256] = var7;
        }
        field83++;
        if (arg0) {
            this.field98 = -15;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V", line = 76)
    public static final void method51(int arg0) {
        field93++;
        class186.field2895.method452((byte) 105);
        for (int var1 = 0; var1 < 32; var1++) {
            class84.field1207[var1] = 0L;
        }
        if (arg0 >= -82) {
            field85 = 3;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class44.field645[var2] = 0L;
        }
        class60.field904 = 0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIZ)V", line = 105)
    public static final void method53(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field85 = 79;
        }
        field91++;
        if (arg0 == 8) {
            arg0 = 4;
        }
        if (arg0 == 4 && !class347.field5557) {
            arg0 = 2;
            arg1 = 2;
        }
        if (class58.field873 != arg0) {
            if (class308.field5022) {
                return;
            }
            if (class58.field873 != 0) {
                class207.field3153[class58.field873].method117();
            }
            if (arg0 != 0) {
                class62 var3 = class207.field3153[arg0];
                var3.method120();
                var3.method119(arg1);
            }
            class92.field1362 = arg1;
            class58.field873 = arg0;
        } else if (arg0 != 0 && class92.field1362 != arg1) {
            class207.field3153[arg0].method119(arg1);
            class92.field1362 = arg1;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)I", line = 153)
    public static final int method54(int arg0, byte arg1) {
        field84++;
        if (arg0 < 0) {
            return 0;
        }
        class220 var2 = (class220) class294.field4888.method29((long) arg0, 103);
        if (arg1 != -15) {
            method53(-32, 106, false);
        }
        if (var2 == null) {
            return class25.method216(-17626, arg0).field100;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field3377.length; var4++) {
            if (var2.field3377[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class25.method216(-17626, arg0).field100 - var2.field3377.length);
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "(IIIII)V", line = 394)
    public class7(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field86 = arg1;
        this.field89 = arg2;
        this.field87 = arg4;
        this.field98 = arg0;
        this.field90 = arg3;
        this.method49((byte) 114);
        this.method50(false);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IILjava/lang/String;)I", line = 197)
    public static final int method56(int arg0, int arg1, String arg2) {
        if (arg0 != 0) {
            field85 = 60;
        }
        field92++;
        return class139.method973(-18364, arg1, arg2, true);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIBI)V", line = 210)
    public final void method58(int arg0, int arg1, byte arg2, int arg3) {
        field97++;
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg3];
        if (arg2 != 74) {
            this.method50(true);
        }
        int[] var7 = new int[arg0];
        for (int var8 = 0; var8 < arg1; var8++) {
            var5[var8] = (var8 << 12) / arg1;
        }
        for (int var9 = 0; var9 < arg3; var9++) {
            var6[var9] = (var9 << 12) / arg3;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var7[var10] = (var10 << 12) / arg0;
        }
        this.method52(105);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field86; var14++) {
                        int var15 = this.field88[var14] << 12;
                        int var16 = this.field90 * var15 >> 12;
                        int var17 = this.field87 * var15 >> 12;
                        int var18 = var5[var13] * var15 >> 12;
                        int var19 = this.field89 * var15 >> 12;
                        int var20 = this.field89 * var18;
                        int var21 = var7[var11] * var15 >> 12;
                        int var22 = var6[var12] * var15 >> 12;
                        int var23 = this.field90 * var22;
                        int var24 = var20 >> 12;
                        int var25 = var20 & 0xFFF;
                        int var26 = var25 - 4096;
                        int var27 = class243.field3835[var25];
                        int var28 = var24 + 1;
                        int var29;
                        if (var28 >= var19) {
                            var29 = 0;
                        } else {
                            var29 = var28 & 0xFF;
                        }
                        int var30 = this.field87 * var21;
                        int var31 = var24 & 0xFF;
                        int var32 = var23 >> 12;
                        int var33 = var23 & 0xFFF;
                        int var34 = class243.field3835[var33];
                        int var35 = var30 >> 12;
                        int var36 = var35 + 1;
                        int var37;
                        if (var17 > var36) {
                            var37 = var36 & 0xFF;
                        } else {
                            var37 = 0;
                        }
                        int var38 = var35 & 0xFF;
                        int var39 = var32 + 1;
                        short var40 = this.field96[var38];
                        short var41 = this.field96[var37];
                        int var42 = var30 & 0xFFF;
                        int var43 = class243.field3835[var42];
                        int var44;
                        if (var39 >= var16) {
                            var44 = 0;
                        } else {
                            var44 = var39 & 0xFF;
                        }
                        int var45 = var33 - 4096;
                        short var46 = this.field96[var41 + var44];
                        int var47 = var32 & 0xFF;
                        short var48 = this.field96[var47 + var41];
                        int var49 = var42 - 4096;
                        short var50 = this.field96[var40 + var47];
                        short var51 = this.field96[var44 + var40];
                        int var52 = class3.method21(var25, 1, var42, var33, this.field96[var31 + var50]);
                        int var53 = class3.method21(var26, 1, var42, var33, this.field96[var29 + var50]);
                        int var54 = var52 + ((var53 - var52) * var27 >> 12);
                        int var55 = class3.method21(var25, arg2 ^ 0x4B, var42, var45, this.field96[var31 + var51]);
                        int var56 = class3.method21(var26, arg2 ^ 0x4B, var42, var45, this.field96[var29 + var51]);
                        int var57 = var55 + ((var56 - var55) * var27 >> 12);
                        int var58 = class3.method21(var25, 1, var49, var33, this.field96[var31 + var48]);
                        int var59 = var54 + ((var57 - var54) * var34 >> 12);
                        int var60 = class3.method21(var26, 1, var49, var33, this.field96[var29 + var48]);
                        int var61 = var58 + ((var60 - var58) * var27 >> 12);
                        int var62 = class3.method21(var25, arg2 - 73, var49, var45, this.field96[var31 + var46]);
                        int var63 = class3.method21(var26, 1, var49, var45, this.field96[var29 + var46]);
                        int var64 = ((var63 - var62) * var27 >> 12) + var62;
                        int var65 = ((var64 - var61) * var34 >> 12) + var61;
                        this.method55(((var65 - var59) * var43 >> 12) + var59, var14, (byte) -94);
                    }
                    this.method57(4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)V")
    public abstract void method52(int arg0);

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIB)V")
    public abstract void method55(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
    public abstract void method57(int arg0);
}
