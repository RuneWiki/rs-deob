import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public abstract class class142 {

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public int field1832 = 4;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
    private int field1840 = 4;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    private int field1838 = 4;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    private int field1833 = 4;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "[S")
    private short[] field1842 = new short[512];

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    private int field1839 = 0;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
    public static int field1841;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "Leaa;")
    public static class43 field1837;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "[S")
    private short[] field1831;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V")
    private final void method830(byte arg0) {
        if (arg0 <= 14) {
            this.method838((byte) 36, 80, 119);
        }
        field1836++;
        Random var2 = new Random((long) this.field1839);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field1842[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class517.method2801(var2, var5, 124);
            short var7 = this.field1842[var6];
            this.field1842[var6] = this.field1842[var5];
            this.field1842[var5] = this.field1842[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BIII)V")
    public final void method831(byte arg0, int arg1, int arg2, int arg3) {
        field1835++;
        if (arg0 < 112) {
            this.method832((byte) 102);
        }
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg2];
        int[] var7 = new int[arg1];
        for (int var8 = 0; var8 < arg3; var8++) {
            var5[var8] = (var8 << 12) / arg3;
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var6[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg1; var10++) {
            var7[var10] = (var10 << 12) / arg1;
        }
        this.method836(22);
        for (int var11 = 0; var11 < arg1; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg3; var13++) {
                    for (int var14 = 0; var14 < this.field1832; var14++) {
                        int var15 = this.field1831[var14] << 12;
                        int var16 = var5[var13] * var15 >> 12;
                        int var17 = var6[var12] * var15 >> 12;
                        int var18 = this.field1840 * var15 >> 12;
                        int var19 = this.field1838 * var15 >> 12;
                        int var20 = this.field1833 * var15 >> 12;
                        int var21 = var7[var11] * var15 >> 12;
                        int var22 = this.field1840 * var17;
                        int var23 = this.field1838 * var21;
                        int var24 = this.field1833 * var16;
                        int var25 = var24 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var22 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var28 & 0xFF;
                        int var31 = var23 >> 12;
                        int var32 = var31 + 1;
                        int var33;
                        if (var26 < var20) {
                            var33 = var26 & 0xFF;
                        } else {
                            var33 = 0;
                        }
                        int var34 = var24 & 0xFFF;
                        int var35;
                        if (var29 >= var18) {
                            var35 = 0;
                        } else {
                            var35 = var29 & 0xFF;
                        }
                        int var36 = var31 & 0xFF;
                        int var37;
                        if (var19 > var32) {
                            var37 = var32 & 0xFF;
                        } else {
                            var37 = 0;
                        }
                        int var38 = var22 & 0xFFF;
                        int var39 = var23 & 0xFFF;
                        int var40 = class85.field1195[var38];
                        int var41 = var38 - 4096;
                        int var42 = var39 - 4096;
                        int var43 = class85.field1195[var34];
                        int var44 = var34 - 4096;
                        short var45 = this.field1842[var36];
                        int var46 = class85.field1195[var39];
                        short var47 = this.field1842[var37];
                        short var48 = this.field1842[var30 + var45];
                        short var49 = this.field1842[var30 + var47];
                        short var50 = this.field1842[var35 + var45];
                        short var51 = this.field1842[var35 + var47];
                        int var52 = class343.method1913(this.field1842[var27 + var48], (byte) 116, var38, var39, var34);
                        int var53 = class343.method1913(this.field1842[var33 + var48], (byte) 116, var38, var39, var44);
                        int var54 = ((var53 - var52) * var43 >> 12) + var52;
                        int var55 = class343.method1913(this.field1842[var27 + var50], (byte) 116, var41, var39, var34);
                        int var56 = class343.method1913(this.field1842[var33 + var50], (byte) 116, var41, var39, var44);
                        int var57 = ((var56 - var55) * var43 >> 12) + var55;
                        int var58 = ((var57 - var54) * var40 >> 12) + var54;
                        int var59 = class343.method1913(this.field1842[var27 + var49], (byte) 116, var38, var42, var34);
                        int var60 = class343.method1913(this.field1842[var33 + var49], (byte) 116, var38, var42, var44);
                        int var61 = var59 + ((var60 - var59) * var43 >> 12);
                        int var62 = class343.method1913(this.field1842[var27 + var51], (byte) 116, var41, var42, var34);
                        int var63 = class343.method1913(this.field1842[var33 + var51], (byte) 116, var41, var42, var44);
                        int var64 = var62 + ((var63 - var62) * var43 >> 12);
                        int var65 = ((var64 - var61) * var40 >> 12) + var61;
                        this.method838((byte) 127, var14, var58 + ((var65 - var58) * var46 >> 12));
                    }
                    this.method835(1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(B)V")
    private final void method832(byte arg0) {
        int var2 = -95 / ((64 - arg0) / 49);
        field1843++;
        this.field1831 = new short[this.field1832];
        for (int var3 = 0; var3 < this.field1832; var3++) {
            this.field1831[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)Lue;")
    public static final class496 method833(int arg0) {
        if (arg0 != -1) {
            method834((byte) 110);
        }
        field1841++;
        try {
            return (class496) Class.forName("vl").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(B)V")
    public static void method834(byte arg0) {
        if (arg0 >= -84) {
            field1837 = null;
        }
        field1837 = null;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)V")
    public abstract void method835(int arg0);

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)V")
    public abstract void method836(int arg0);

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZIZIIII)V")
    public static final void method837(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field1834++;
        if (arg1 > arg5) {
            int var7 = (arg1 + arg5) / 2;
            int var8 = arg5;
            class532 var9 = class68.field930[var7];
            class68.field930[var7] = class68.field930[arg1];
            class68.field930[arg1] = var9;
            for (int var10 = arg5; var10 < arg1; var10++) {
                if (class460.method2453(arg4, var9, -30991, arg0, arg6, class68.field930[var10], arg2) <= 0) {
                    class532 var11 = class68.field930[var10];
                    class68.field930[var10] = class68.field930[var8];
                    class68.field930[var8++] = var11;
                }
            }
            class68.field930[arg1] = class68.field930[var8];
            class68.field930[var8] = var9;
            method837(arg0, var8 - 1, arg2, arg3, arg4, arg5, arg6);
            method837(arg0, arg1, arg2, 2, arg4, var8 + 1, arg6);
        }
        if (arg3 != 2) {
            method833(25);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BII)V")
    public abstract void method838(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mp", name = "<init>", descriptor = "(IIIII)V")
    public class142(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1832 = arg1;
        this.field1838 = arg4;
        this.field1839 = arg0;
        this.field1833 = arg2;
        this.field1840 = arg3;
        this.method832((byte) 124);
        this.method830((byte) 68);
    }
}
