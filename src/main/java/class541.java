import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class541 {

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "[I")
    private int[] field7024;

    @OriginalMember(owner = "client!caa", name = "m", descriptor = "[I")
    private int[] field7034;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "[Z")
    public static boolean[] field7022 = new boolean[100];

    @OriginalMember(owner = "client!caa", name = "i", descriptor = "Z")
    public static boolean field7030 = false;

    @OriginalMember(owner = "client!caa", name = "p", descriptor = "J")
    public static long field7037 = -1L;

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "I")
    public static int field7023;

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "I")
    public static int field7025;

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "I")
    private int field7026;

    @OriginalMember(owner = "client!caa", name = "f", descriptor = "I")
    public static int field7027;

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "I")
    public static int field7028;

    @OriginalMember(owner = "client!caa", name = "h", descriptor = "I")
    private int field7029;

    @OriginalMember(owner = "client!caa", name = "j", descriptor = "I")
    private int field7031;

    @OriginalMember(owner = "client!caa", name = "k", descriptor = "I")
    private int field7032;

    @OriginalMember(owner = "client!caa", name = "l", descriptor = "I")
    public static int field7033;

    @OriginalMember(owner = "client!caa", name = "o", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!caa", name = "q", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!caa", name = "n", descriptor = "Lffa;")
    public static class562 field7035;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Z)I", line = 8)
    public final int method2868(boolean arg0) {
        field7027++;
        if (arg0) {
            this.field7024 = null;
        }
        if (this.field7029 == 0) {
            this.method2871(27);
            this.field7029 = 256;
        }
        return this.field7034[--this.field7029];
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)I", line = 32)
    public final int method2869(int arg0) {
        if (arg0 < 98) {
            field7030 = false;
        }
        field7023++;
        if (this.field7029 == 0) {
            this.method2871(20);
            this.field7029 = 256;
        }
        return this.field7034[this.field7029 - 1];
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 52)
    public static final String method2870(Throwable arg0, int arg1) throws IOException {
        field7028++;
        String var2;
        if ((arg0 instanceof class172)) {
            class172 var3 = (class172) arg0;
            arg0 = var3.field2125;
            var2 = var3.field2126 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        if (arg1 >= -17) {
            return null;
        }
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(I)V", line = 124)
    private final void method2871(int arg0) {
        field7033++;
        this.field7026 += ++this.field7032;
        if (arg0 < 7) {
            method2875(-104, -52);
        }
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field7024[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field7031 ^= this.field7031 << 13;
                } else {
                    this.field7031 ^= this.field7031 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field7031 ^= this.field7031 << 2;
            } else {
                this.field7031 ^= this.field7031 >>> 16;
            }
            this.field7031 += this.field7024[var2 + 128 & 0xFF];
            int var4;
            this.field7024[var2] = var4 = this.field7024[class597.method3238(var3, 1020) >> 2] + this.field7031 + this.field7026;
            this.field7034[var2] = this.field7026 = this.field7024[class597.method3238(255, var4 >> 8 >> 2)] + var3;
        }
    }

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "(I)V", line = 176)
    private final void method2872(int arg0) {
        field7036++;
        if (arg0 != -25909) {
            field7022 = null;
        }
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var4 + var67;
            int var69 = var63 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var65 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var68 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var4 + var61;
            int var75 = var71 + var73;
            var3 = var75 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var74;
            var2 = var76 ^ var74 >>> 9;
            var9 = var8 + var74;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field7034[var11 + 2] + var7;
            int var38 = this.field7034[var11 + 1] + var8;
            int var39 = this.field7034[var11 + 5] + var4;
            int var40 = this.field7034[var11 + 3] + var6;
            int var41 = this.field7034[var11 + 7] + var2;
            int var42 = this.field7034[var11 + 6] + var3;
            int var43 = this.field7034[var11 + 4] + var5;
            int var44 = this.field7034[var11] + var9;
            int var45 = var44 ^ var38 << 11;
            int var46 = var37 + var38;
            int var47 = var40 + var45;
            int var48 = var46 ^ var37 >>> 2;
            int var49 = var43 + var48;
            int var50 = var37 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var47 + var49;
            int var53 = var39 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var6 + var42;
            int var55 = var49 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var53 + var54;
            int var57 = var5 + var41;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var4 + var45;
            int var59 = var54 + var57;
            var3 = var59 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var58;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field7024[var11] = var9;
            this.field7024[var11 + 1] = var8;
            this.field7024[var11 + 2] = var7;
            this.field7024[var11 + 3] = var6;
            this.field7024[var11 + 4] = var5;
            this.field7024[var11 + 5] = var4;
            this.field7024[var11 + 6] = var3;
            this.field7024[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field7024[var12 + 7] + var2;
            int var14 = this.field7024[var12 + 4] + var5;
            int var15 = this.field7024[var12 + 1] + var8;
            int var16 = this.field7024[var12 + 3] + var6;
            int var17 = this.field7024[var12] + var9;
            int var18 = this.field7024[var12 + 5] + var4;
            int var19 = this.field7024[var12 + 2] + var7;
            int var20 = this.field7024[var12 + 6] + var3;
            int var21 = var17 ^ var15 << 11;
            int var22 = var16 + var21;
            int var23 = var15 + var19;
            int var24 = var23 ^ var19 >>> 2;
            int var25 = var19 + var22;
            int var26 = var14 + var24;
            int var27 = var25 ^ var22 << 8;
            int var28 = var22 + var26;
            int var29 = var18 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var6 + var20;
            int var31 = var26 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var5 + var13;
            int var33 = var29 + var30;
            var4 = var33 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var32;
            var3 = var35 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var34;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field7024[var12] = var9;
            this.field7024[var12 + 1] = var8;
            this.field7024[var12 + 2] = var7;
            this.field7024[var12 + 3] = var6;
            this.field7024[var12 + 4] = var5;
            this.field7024[var12 + 5] = var4;
            this.field7024[var12 + 6] = var3;
            this.field7024[var12 + 7] = var2;
        }
        this.method2871(114);
        this.field7029 = 256;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(II)Ljba;", line = 329)
    public static final class138 method2873(int arg0, int arg1) {
        field7038++;
        if (arg0 >= -52) {
            field7030 = false;
        }
        return class256.field3468 && arg1 >= class188.field2416 && class49.field686 >= arg1 ? class26.field324[arg1 - class188.field2416] : null;
    }

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "(I)V", line = 344)
    public static void method2874(int arg0) {
        if (arg0 <= -99) {
            field7022 = null;
            field7035 = null;
        }
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "()V", line = 361)
    private class541() {
    }

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "(II)I", line = 364)
    public static final int method2875(int arg0, int arg1) {
        if (arg0 != 127) {
            method2873(10, 18);
        }
        field7025++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!caa", name = "<init>", descriptor = "([I)V", line = 375)
    public class541(int[] arg0) {
        this.field7024 = new int[256];
        this.field7034 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field7034[var2] = arg0[var2];
        }
        this.method2872(-25909);
    }
}
