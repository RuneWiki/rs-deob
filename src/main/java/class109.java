import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public abstract class class109 {

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "I")
    private int field1525 = 4;

    @OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
    private int field1531 = 4;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "[S")
    private short[] field1542 = new short[512];

    @OriginalMember(owner = "client!bf", name = "s", descriptor = "I")
    public int field1538 = 4;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
    private int field1522 = 0;

    @OriginalMember(owner = "client!bf", name = "n", descriptor = "I")
    private int field1533 = 4;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "Lok;")
    public static class41 field1527 = class137.method956("Speicher wird zugewiesen)3", 45);

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "[I")
    public static int[] field1521 = new int[200];

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "Lbc;")
    public static class302 field1526 = null;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!bf", name = "o", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!bf", name = "r", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!bf", name = "t", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!bf", name = "u", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "Lmh;")
    public static class65 field1523;

    @OriginalMember(owner = "client!bf", name = "k", descriptor = "[Ls;")
    public static class99[] field1530;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "[S")
    private short[] field1520;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 8)
    public static final void method732(String arg0, int arg1) {
        field1524++;
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        int var2 = -51 % ((arg1 - 62) / 42);
        System.exit(1);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIBI)I", line = 25)
    public static final int method733(int arg0, int arg1, byte arg2, int arg3) {
        field1539++;
        if (arg2 != 16) {
            field1521 = (int[]) null;
        }
        return arg0 > arg3 ? arg0 : (arg3 <= arg1 ? arg3 : arg1);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IBII)I", line = 46)
    public static final int method734(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -121) {
            method733(-38, -16, (byte) -7, -21);
        }
        if (arg2 > 243) {
            arg0 >>= 0x4;
        } else if (arg2 > 217) {
            arg0 >>= 0x3;
        } else if (arg2 > 192) {
            arg0 >>= 0x2;
        } else if (arg2 > 179) {
            arg0 >>= 0x1;
        }
        field1529++;
        return (arg2 >> 1) + (arg0 >> 5 << 7) + (arg3 >> 2 << 10);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)V", line = 74)
    public static void method735(int arg0) {
        field1521 = null;
        field1526 = null;
        field1530 = null;
        field1527 = null;
        if (arg0 != 4095) {
            field1530 = (class99[]) null;
        }
        field1523 = null;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V", line = 90)
    public static final void method736(int arg0) {
        field1537++;
        if (arg0 != -416295001) {
            field1530 = (class99[]) null;
        }
        int var1 = (class62.field913.field4280 >> 7) + class88.field1300;
        class194.field3136 = 0;
        int var2 = (class62.field913.field4311 >> 7) + class55.field809;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class194.field3136 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class194.field3136 = 1;
        }
        if (class194.field3136 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class194.field3136 = 0;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(IIIII)V", line = 488)
    public class109(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1525 = arg2;
        this.field1538 = arg1;
        this.field1531 = arg3;
        this.field1533 = arg4;
        this.field1522 = arg0;
        this.method738(false);
        this.method740(9026);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I[B)[B", line = 131)
    public static final byte[] method737(int arg0, byte[] arg1) {
        field1543++;
        if (arg0 != 9492) {
            return (byte[]) null;
        } else if (arg1 == null) {
            return null;
        } else {
            byte[] var2 = new byte[arg1.length];
            class21.method144(arg1, 0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V", line = 161)
    private final void method738(boolean arg0) {
        field1540++;
        this.field1520 = new short[this.field1538];
        if (arg0) {
            this.field1533 = -37;
        }
        for (int var2 = 0; var2 < this.field1538; var2++) {
            this.field1520[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIII)V", line = 193)
    public final void method739(int arg0, int arg1, int arg2, int arg3) {
        field1536++;
        if (arg1 != 4) {
            method735(-59);
        }
        int[] var5 = new int[arg3];
        int[] var6 = new int[arg2];
        for (int var7 = 0; var7 < arg2; var7++) {
            var6[var7] = (var7 << 12) / arg2;
        }
        for (int var8 = 0; var8 < arg3; var8++) {
            var5[var8] = (var8 << 12) / arg3;
        }
        int[] var9 = new int[arg0];
        for (int var10 = 0; var10 < arg0; var10++) {
            var9[var10] = (var10 << 12) / arg0;
        }
        this.method344((byte) -77);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg3; var12++) {
                for (int var13 = 0; var13 < arg2; var13++) {
                    for (int var14 = 0; var14 < this.field1538; var14++) {
                        int var15 = this.field1520[var14] << 12;
                        int var16 = this.field1533 * var15 >> 12;
                        int var17 = this.field1525 * var15 >> 12;
                        int var18 = var5[var12] * var15 >> 12;
                        int var19 = var6[var13] * var15 >> 12;
                        int var20 = var9[var11] * var15 >> 12;
                        int var21 = this.field1533 * var20;
                        int var22 = var21 >> 12;
                        int var23 = var21 & 0xFFF;
                        int var24 = class75.field1117[var23];
                        int var25 = this.field1531 * var18;
                        int var26 = var23 - 4096;
                        int var27 = this.field1531 * var15 >> 12;
                        int var28 = this.field1525 * var19;
                        int var29 = var25 >> 12;
                        int var30 = var25 & 0xFFF;
                        int var31 = var29 + 1;
                        int var32;
                        if (var27 <= var31) {
                            var32 = 0;
                        } else {
                            var32 = var31 & 0xFF;
                        }
                        int var33 = class75.field1117[var30];
                        int var34 = var30 - 4096;
                        int var35 = var28 >> 12;
                        int var36 = var22 + 1;
                        int var37 = var35 + 1;
                        int var38;
                        if (var17 > var37) {
                            var38 = var37 & 0xFF;
                        } else {
                            var38 = 0;
                        }
                        int var39;
                        if (var36 < var16) {
                            var39 = var36 & 0xFF;
                        } else {
                            var39 = 0;
                        }
                        int var40 = var22 & 0xFF;
                        short var41 = this.field1542[var40];
                        int var42 = var35 & 0xFF;
                        short var43 = this.field1542[var32 + var41];
                        short var44 = this.field1542[var39];
                        int var45 = var29 & 0xFF;
                        int var46 = var28 & 0xFFF;
                        short var47 = this.field1542[var32 + var44];
                        int var48 = var46 - 4096;
                        short var49 = this.field1542[var45 + var44];
                        int var50 = class75.field1117[var46];
                        short var51 = this.field1542[var41 + var45];
                        int var52 = class120.method857(var23, (byte) 94, this.field1542[var42 + var51], var46, var30);
                        int var53 = class120.method857(var23, (byte) 94, this.field1542[var38 + var51], var48, var30);
                        int var54 = ((var53 - var52) * var50 >> 12) + var52;
                        int var55 = class120.method857(var23, (byte) 94, this.field1542[var42 + var43], var46, var34);
                        int var56 = class120.method857(var23, (byte) 94, this.field1542[var38 + var43], var48, var34);
                        int var57 = ((var56 - var55) * var50 >> 12) + var55;
                        int var58 = ((var57 - var54) * var33 >> 12) + var54;
                        int var59 = class120.method857(var26, (byte) 94, this.field1542[var42 + var49], var46, var30);
                        int var60 = class120.method857(var26, (byte) 94, this.field1542[var38 + var49], var48, var30);
                        int var61 = var59 + ((var60 - var59) * var50 >> 12);
                        int var62 = class120.method857(var26, (byte) 94, this.field1542[var42 + var47], var46, var34);
                        int var63 = class120.method857(var26, (byte) 94, this.field1542[var38 + var47], var48, var34);
                        int var64 = ((var63 - var62) * var50 >> 12) + var62;
                        int var65 = ((var64 - var61) * var33 >> 12) + var61;
                        this.method341(false, var14, ((var65 - var58) * var24 >> 12) + var58);
                    }
                    this.method342(23101);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V", line = 365)
    private final void method740(int arg0) {
        if (arg0 != 9026) {
            this.field1531 = 12;
        }
        field1541++;
        Random var2 = new Random((long) this.field1522);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field1542[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class91.method640(114, var5, var2);
            short var7 = this.field1542[var6];
            this.field1542[var6] = this.field1542[var5];
            this.field1542[var5] = this.field1542[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(B)V", line = 407)
    public static final void method741(byte arg0) {
        class70.field1060.method131(-2);
        if (arg0 >= -14) {
            method737(39, (byte[]) null);
        }
        field1532++;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIJI)Z", line = 432)
    public static final boolean method742(int arg0, int arg1, long arg2, int arg3) {
        field1534++;
        int var5 = ((int) arg2 & 0x3F947C) >> 20;
        if (arg3 != 1) {
            field1535 = 104;
        }
        int var6 = Integer.MAX_VALUE & (int) (arg2 >>> 32);
        int var7 = (int) arg2 >> 14 & 0x1F;
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class171 var8 = class234.method1684(arg3 ^ 0xFFFFF676, var6);
            int var9;
            int var10;
            if (var5 == 0 || var5 == 2) {
                var10 = var8.field2752;
                var9 = var8.field2784;
            } else {
                var9 = var8.field2752;
                var10 = var8.field2784;
            }
            int var11 = var8.field2797;
            if (var5 != 0) {
                var11 = (var11 << var5 & 0xF) + (var11 >> 4 - var5);
            }
            class145.method1004(var11, true, var9, 0, arg0, 2, var10, class62.field913.field4341[0], class62.field913.field4306[0], 0, arg3 ^ 0xFFFFFF84, arg1);
        } else {
            class145.method1004(0, true, 0, var7 + 1, arg0, 2, 0, class62.field913.field4341[0], class62.field913.field4306[0], var5, arg3 - 123, arg1);
        }
        class167.field2661 = 2;
        class282.field4583 = class151.field2358;
        class301.field4878 = 0;
        class148.field2299 = class245.field3941;
        return true;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZII)V")
    public abstract void method341(boolean arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
    public abstract void method342(int arg0);

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public abstract void method344(byte arg0);
}
