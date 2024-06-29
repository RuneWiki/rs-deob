import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class232 {

    @OriginalMember(owner = "client!id", name = "j", descriptor = "[I")
    public static int[] field4054 = new int[99];

    @OriginalMember(owner = "client!id", name = "r", descriptor = "Lda;")
    public static class275 field4062;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "Z")
    public static boolean field4065;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "[I")
    public static int[] field4064;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "Lda;")
    public static class275 field4067;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "Lda;")
    public static class275 field4068;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field4045;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field4046;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!id", name = "k", descriptor = "I")
    public int field4055;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field4061;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "J")
    private long field4053;

    @OriginalMember(owner = "client!id", name = "y", descriptor = "J")
    private long field4069;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "Z")
    public boolean field4063;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "[I")
    private int[] field4056;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "[I")
    private int[] field4059;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static final void method1501(int arg0) {
        field4050++;
        if (arg0 > -82) {
            method1510(12);
        }
        class261.field4538.method993(110);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III[Lcg;ZIIIII[B)V")
    public static final void method1502(int arg0, int arg1, int arg2, class118[] arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte[] arg10) {
        field4061++;
        class85 var11 = new class85(arg10);
        if (arg8 != -24591) {
            return;
        }
        int var12 = -1;
        while (true) {
            int var13 = var11.method587(22277);
            if (var13 == 0) {
                return;
            }
            var12 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var11.method593((byte) -106);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = (var14 & 0xFE1) >> 6;
                int var17 = var14 >> 12;
                int var18 = var11.method564((byte) 115);
                int var19 = var14 & 0x3F;
                int var20 = var18 >> 2;
                int var21 = var18 & 0x3;
                if (arg2 == var17 && var16 >= arg9 && var16 < arg9 + 8 && arg1 <= var19 && var19 < (arg1 + 8)) {
                    class34 var22 = class146.method1040(93, var12);
                    int var23 = arg7 + class210.method1347(var16 & 0x7, var19 & 0x7, var22.field526, arg5, arg8 ^ 0x6072, var22.field559, var21);
                    int var24 = class92.method663(var22.field526, arg5, var16 & 0x7, true, var19 & 0x7, var22.field559, var21) + arg6;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class118 var25 = null;
                        if (!arg4) {
                            int var26 = arg0;
                            if ((class72.field1168[1][var23][var24] & 0x2) == 2) {
                                var26 = arg0 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg3[var26];
                            }
                        }
                        class46.method275(arg0, var12, arg0, var23, !arg4, var20, var24, arg4, arg5 + var21 & 0x3, var25, -235390930);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)I")
    public final int method1503(byte arg0) {
        if (arg0 >= -116) {
            method1511(-29, (byte) -16);
        }
        field4066++;
        return this.field4055 == -1 ? (this.field4059[11] << 5) + this.field4059[1] + (this.field4059[8] << 10) + ((this.field4056[0] << 25) - (-(this.field4056[4] << 20) - (this.field4059[0] << 15))) : class30.method176(-3, this.field4055).field392 + 305419896;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IBILk;I)Lhh;")
    public final class176 method1504(int arg0, byte arg1, int arg2, class215 arg3, int arg4) {
        field4047++;
        if (arg1 <= 42) {
            method1501(-105);
        }
        long var6 = (long) arg4 << 32 | (long) (arg2 << 16) | (long) arg4;
        class176 var8 = (class176) class113.field1989.method990(var6, (byte) 37);
        if (var8 == null) {
            int var9 = 0;
            class263[] var10 = new class263[2];
            if (!class234.method1520(3, arg4).method1621(true) || !class234.method1520(3, arg2).method1621(true)) {
                return null;
            }
            class263 var11 = class234.method1520(3, arg4).method1617((byte) -93);
            if (var11 != null) {
                var10[var9++] = var11;
            }
            class263 var12 = class234.method1520(3, arg2).method1617((byte) 106);
            if (var12 != null) {
                var10[var9++] = var12;
            }
            class263 var13 = new class263(var10, var9);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field4056[var14] < class152.field2672[var14].length) {
                    var13.method1723(class125.field2226[var14], class152.field2672[var14][this.field4056[var14]]);
                }
                if (this.field4056[var14] < class5.field75[var14].length) {
                    var13.method1723(class178.field3050[var14], class5.field75[var14][this.field4056[var14]]);
                }
            }
            var8 = var13.method1744(64, 768, -50, -10, -50);
            class113.field1989.method986(0, var6, var8);
        }
        if (arg3 != null) {
            var8 = arg3.method1382(125, var8, arg0);
        }
        return var8;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
    public final void method1505(int arg0, int arg1, int arg2) {
        field4048++;
        this.field4056[arg0] = arg1;
        this.method1513(arg2 ^ 0x7);
        if (arg2 != 0) {
            field4065 = true;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lk;II)Lhh;")
    public final class176 method1506(class215 arg0, int arg1, int arg2) {
        field4058++;
        if (~this.field4055 != arg2) {
            return class30.method176(-3, this.field4055).method141(arg1, arg0, arg2 ^ 0x5F);
        }
        class176 var4 = (class176) class113.field1989.method990(this.field4069, (byte) -110);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field4059[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var15) != 0 && !class234.method1520(3, var15 & 0x3FFFFFFF).method1621(true)) {
                        var5 = true;
                    }
                } else if (!class210.method1352(90, var15 & 0x3FFFFFFF).method1609(-14301, this.field4063)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class263[] var7 = new class263[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field4059[var9];
                if ((var12 & 0x40000000) != 0) {
                    class263 var14 = class210.method1352(26, var12 & 0x3FFFFFFF).method1603(-48, this.field4063);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                } else if ((Integer.MIN_VALUE & var12) != 0) {
                    class263 var13 = class234.method1520(3, var12 & 0x3FFFFFFF).method1617((byte) -113);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                }
            }
            class263 var10 = new class263(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (this.field4056[var11] < class152.field2672[var11].length) {
                    var10.method1723(class125.field2226[var11], class152.field2672[var11][this.field4056[var11]]);
                }
                if (class5.field75[var11].length > this.field4056[var11]) {
                    var10.method1723(class178.field3050[var11], class5.field75[var11][this.field4056[var11]]);
                }
            }
            var4 = var10.method1744(64, 768, -50, -10, -50);
            class113.field1989.method986(0, this.field4069, var4);
        }
        if (arg0 != null) {
            var4 = arg0.method1382(125, var4, arg1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIB)V")
    public final void method1507(int arg0, int arg1, byte arg2) {
        field4057++;
        if (arg2 > -42) {
            return;
        }
        int var4 = class275.field4773[arg1];
        if (this.field4059[var4] != 0 && class234.method1520(3, arg0) != null) {
            this.field4059[var4] = class246.method1612(Integer.MIN_VALUE, arg0);
            this.method1513(7);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BZI[I[I)V")
    public final void method1508(byte arg0, boolean arg1, int arg2, int[] arg3, int[] arg4) {
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class277.field4836; var7++) {
                    class246 var8 = class234.method1520(3, var7);
                    if (var8 != null && !var8.field4352 && ((arg1 ? 7 : 0) + var6) == var8.field4349) {
                        arg4[class275.field4773[var6]] = class246.method1612(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        field4052++;
        if (arg0 >= -8) {
            this.field4059 = null;
        }
        this.field4063 = arg1;
        this.field4059 = arg4;
        this.field4055 = arg2;
        this.field4056 = arg3;
        this.method1513(7);
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLk;IILk;)Lhh;")
    public final class176 method1509(byte arg0, class215 arg1, int arg2, int arg3, class215 arg4) {
        field4060++;
        int var6 = -60 / ((-arg0 - 41) / 61);
        if (this.field4055 != -1) {
            return class30.method176(-3, this.field4055).method152(arg1, arg3, arg2, arg4, (byte) 113);
        }
        int[] var7 = this.field4059;
        long var8 = this.field4069;
        if (arg1 != null && (arg1.field3687 >= 0 || arg1.field3676 >= 0)) {
            var7 = new int[12];
            for (int var10 = 0; var10 < 12; var10++) {
                var7[var10] = this.field4059[var10];
            }
            if (arg1.field3687 >= 0) {
                if (arg1.field3687 == 65535) {
                    var8 ^= 0xFFFFFFFF00000000L;
                    var7[5] = 0;
                } else {
                    var7[5] = class246.method1612(arg1.field3687, 1073741824);
                    var8 ^= (long) var7[5] << 32;
                }
            }
            if (arg1.field3676 >= 0) {
                if (arg1.field3676 == 65535) {
                    var8 ^= 0xFFFFFFFFL;
                    var7[3] = 0;
                } else {
                    var7[3] = class246.method1612(1073741824, arg1.field3676);
                    var8 ^= (long) var7[3];
                }
            }
        }
        class176 var11 = (class176) class41.field685.method990(var8, (byte) 53);
        if (var11 == null) {
            boolean var12 = false;
            for (int var13 = 0; var13 < 12; var13++) {
                int var31 = var7[var13];
                if ((var31 & 0x40000000) == 0) {
                    if ((var31 & Integer.MIN_VALUE) != 0 && !class234.method1520(3, var31 & 0x3FFFFFFF).method1622((byte) -57)) {
                        var12 = true;
                    }
                } else if (!class210.method1352(29, var31 & 0x3FFFFFFF).method1599(0, this.field4063)) {
                    var12 = true;
                }
            }
            if (var12) {
                if (this.field4053 != -1L) {
                    var11 = (class176) class41.field685.method990(this.field4053, (byte) 12);
                }
                if (var11 == null) {
                    return null;
                }
            }
            if (var11 == null) {
                class263[] var14 = new class263[12];
                int var15 = 0;
                for (int var16 = 0; var16 < 12; var16++) {
                    int var28 = var7[var16];
                    if ((var28 & 0x40000000) != 0) {
                        class263 var29 = class210.method1352(68, var28 & 0x3FFFFFFF).method1597(0, this.field4063);
                        if (var29 != null) {
                            var14[var15++] = var29;
                        }
                    } else if ((Integer.MIN_VALUE & var28) != 0) {
                        class263 var30 = class234.method1520(3, var28 & 0x3FFFFFFF).method1620(106);
                        if (var30 != null) {
                            var14[var15++] = var30;
                        }
                    }
                }
                int var17 = var7[0];
                if ((var17 & 0x40000000) != 0) {
                    class245 var18 = class210.method1352(115, var17 & 0x3FFFFFFF);
                    if (var18.field4328 != null) {
                        for (int var19 = 0; var19 < var18.field4328.length; var19++) {
                            if (var18.field4328[var19] != null && var14[var19 + 1] != null) {
                                int var20 = var18.field4328[var19][0];
                                int var21 = var18.field4328[var19][2];
                                int var22 = var18.field4328[var19][1];
                                int var23 = var18.field4328[var19][4];
                                int var24 = var18.field4328[var19][3];
                                int var25 = var18.field4328[var19][5];
                                var14[var19 + 1].method1730(var20, var22, var21);
                                var14[var19 + 1].method1728(var24, var23, var25);
                            }
                        }
                    }
                }
                class263 var26 = new class263(var14, var15);
                for (int var27 = 0; var27 < 5; var27++) {
                    if (this.field4056[var27] < class152.field2672[var27].length) {
                        var26.method1723(class125.field2226[var27], class152.field2672[var27][this.field4056[var27]]);
                    }
                    if (class5.field75[var27].length > this.field4056[var27]) {
                        var26.method1723(class178.field3050[var27], class5.field75[var27][this.field4056[var27]]);
                    }
                }
                var11 = var26.method1744(64, 850, -30, -50, -30);
                class41.field685.method986(0, var8, var11);
                this.field4053 = var8;
            }
        }
        if (arg1 == null && arg4 == null) {
            return var11;
        }
        class176 var32;
        if (arg1 != null && arg4 != null) {
            var32 = arg1.method1389(arg4, arg3, 111, var11, arg2);
        } else if (arg1 == null) {
            var32 = arg4.method1385(2096189072, arg3, var11);
        } else {
            var32 = arg1.method1385(2096189072, arg2, var11);
        }
        return var32;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public static void method1510(int arg0) {
        field4062 = null;
        if (arg0 >= 87) {
            field4054 = null;
            field4064 = null;
            field4067 = null;
            field4068 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)I")
    public static final int method1511(int arg0, byte arg1) {
        field4045++;
        if (arg1 <= 8) {
            field4054 = null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1512(int arg0, Throwable arg1) throws IOException {
        field4049++;
        String var2;
        if ((arg1 instanceof class1)) {
            class1 var3 = (class1) arg1;
            arg1 = var3.field14;
            var2 = var3.field3 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    if (arg0 != -25930) {
                        field4067 = null;
                    }
                    return var2 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var2 = var2 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var2 = var2 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
    private final void method1513(int arg0) {
        field4046++;
        long var2 = this.field4069;
        this.field4069 = -1L;
        long[] var4 = class227.field3844;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field4069 = this.field4069 >>> 8 ^ var4[(int) ((this.field4069 ^ (long) (this.field4059[var5] >> 24)) & 0xFFL)];
            this.field4069 = this.field4069 >>> 8 ^ var4[(int) (((long) (this.field4059[var5] >> 16) ^ this.field4069) & 0xFFL)];
            this.field4069 = var4[(int) (((long) (this.field4059[var5] >> 8) ^ this.field4069) & 0xFFL)] ^ this.field4069 >>> 8;
            this.field4069 = var4[(int) ((this.field4069 ^ (long) this.field4059[var5]) & 0xFFL)] ^ this.field4069 >>> 8;
        }
        if (arg0 != 7) {
            return;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field4069 = this.field4069 >>> 8 ^ var4[(int) ((this.field4069 ^ (long) this.field4056[var6]) & 0xFFL)];
        }
        this.field4069 = var4[(int) (((long) (this.field4063 ? 1 : 0) ^ this.field4069) & 0xFFL)] ^ this.field4069 >>> 8;
        if (var2 != 0L && this.field4069 != var2) {
            class41.field685.method991(5, var2);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZI)V")
    public final void method1514(boolean arg0, int arg1) {
        this.field4063 = arg0;
        this.method1513(7);
        int var3 = 82 / ((-arg1 - 23) / 59);
        field4051++;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field4054[var1] = var0 / 4;
        }
        field4062 = class255.method1672(114, "<col=ffb000>");
        field4065 = false;
        field4064 = new int[] { 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 2, 1, -1, 0, 0, 0, 0, 0, -2, 6, 0, -1, 0, 0, 0, 15, 6, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, -1, 0, -1, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, -2, 0, 10, -2, 0, 1, 0, 1, 1, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 6, 0, 0, 0, 0, 4, 0, 4, 5, -1, 1, 0, 6, 10, 0, 0, 0, -1, 0, -1, 0, 0, 0, 0, 5, 0, 0, 0, 0, 3, 0, 0, -2, 0, -1, 0, -2, 0, 10, 3, 0, 0, 0, 0, 0, 3, 0, 0, 8, -1, 7, 0, 0, 0, 0, 0, 0, -2, 0, 2, 0, 5, 0, 20, 6, 0, -1, 0, 0, 0, 0, 0, 10, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, -2, 0, 4, 0, 0, 0, 0, 14, 5, 0, 0, 0, 0, 0, 0, 0, 5, 0, 15, 0, 0, 0, 0, 2, 0, 0, 4, 0, -1, 6, 2, 12, 0, 0, -2, 10, 5, 2, 2, 0, 6, 8, 0, -1, 0, 0, 0, 12, 0, 6, 8, 9, 0, 0, 0, 4, 6, 0, 8, 0, -2, 0, 0, -2, 9, 7, -1, 0, -2, 0, 7, 5, 0, -2, 14, 6, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 24, 0 };
        field4067 = class255.method1672(111, "Speicher wird zugewiesen)3");
        field4068 = class255.method1672(116, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");
    }
}
