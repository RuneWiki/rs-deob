import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public abstract class class11 {

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Z")
    private boolean field371;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "Z")
    private boolean field384;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "J")
    public static long field370 = 0L;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "[I")
    public static int[] field376 = new int[1000];

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "Lcb;")
    public static class15 field380 = new class15(260);

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "La;")
    public static class1 field407 = class113.method934(-11538, "backbase2");

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "La;")
    private static class1 field408 = class113.method934(-11538, "Please try again)3");

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "La;")
    public static class1 field409 = field408;

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "Z")
    public static boolean field411 = false;

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "La;")
    public static class1 field410 = class113.method934(-11538, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public int field367;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    private int field372;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
    public static int field383;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!bd", name = "y", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!bd", name = "A", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!bd", name = "B", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!bd", name = "D", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!bd", name = "N", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!bd", name = "O", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!bd", name = "ab", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "Loa;")
    private class85 field405;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "[I")
    public int[] field375;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "[I")
    private int[] field378;

    @OriginalMember(owner = "client!bd", name = "C", descriptor = "[I")
    private int[] field390;

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "[I")
    public int[] field403;

    @OriginalMember(owner = "client!bd", name = "Y", descriptor = "[I")
    public int[] field412;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "[Le;")
    public static class25[] field366;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "[Loa;")
    private class85[] field368;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "[[B")
    public byte[][] field363;

    @OriginalMember(owner = "client!bd", name = "z", descriptor = "[[I")
    private int[][] field387;

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "[[I")
    private int[][] field394;

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "[[[B")
    private byte[][][] field400;

    @OriginalMember(owner = "client!bd", name = "Z", descriptor = "[[[I")
    public static int[][][] field413;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/Throwable;)V", line = 10)
    public static final void method215(String arg0, byte arg1, Throwable arg2) {
        field399++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class108.method899(0, arg2);
            }
            if (arg0 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            if (arg1 > -119) {
                method235(true);
            }
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            class29 var8 = class80.field2029.method653(false, new URL(class80.field2029.field1722.getCodeBase(), "clienterror.ws?c=" + class81.field2041 + "&u=" + class74.field1846 + "&v1=" + class69.field1717 + "&v2=" + class69.field1721 + "&e=" + var7));
            while (var8.field816 == 0) {
                class86.method756(1L, -74);
            }
            if (var8.field816 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field819;
                var9.read();
                var9.close();
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(La;La;I)[B", line = 58)
    public final byte[] method216(class1 arg0, class1 arg1, int arg2) {
        if (arg2 != 1) {
            this.method232(-26, 53);
        }
        class1 var4 = arg1.method30(arg2 ^ 0xFFFFFF81);
        field382++;
        class1 var5 = arg0.method30(-128);
        int var6 = this.field405.method748(var4.method27((byte) 41), arg2 - 126);
        int var7 = this.field368[var6].method748(var5.method27((byte) 41), -112);
        return this.method218(var7, 114, var6);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V", line = 75)
    public final void method217(int arg0, int arg1) {
        field393++;
        int var3 = 0;
        if (arg0 == 1) {
            while (var3 < this.field400[arg1].length) {
                this.field400[arg1][var3] = null;
                var3++;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)[B", line = 93)
    public final byte[] method218(int arg0, int arg1, int arg2) {
        field364++;
        if (arg1 <= 110) {
            this.field390 = null;
        }
        return this.method222(arg2, arg0, null, 20582);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IBI)Z", line = 113)
    public final boolean method219(int arg0, byte arg1, int arg2) {
        field385++;
        if (arg0 < 0 || this.field400.length <= arg0 || this.field400[arg0] == null || arg2 < 0 || arg2 >= this.field400[arg0].length) {
            return false;
        }
        if (arg1 != -10) {
            this.method229(-98, null);
        }
        if (this.field400[arg0][arg2] != null) {
            return true;
        } else if (this.field363[arg0] == null) {
            this.method223(122, arg0);
            return this.field363[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)V", line = 140)
    public void method220(int arg0, byte arg1) {
        if (arg1 == 2) {
            field379++;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)I", line = 150)
    public final int method221(int arg0) {
        if (arg0 > -7) {
            field411 = true;
        }
        field383++;
        return this.field400.length;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II[II)[B", line = 164)
    public final byte[] method222(int arg0, int arg1, int[] arg2, int arg3) {
        field397++;
        if (arg3 != 20582) {
            return null;
        } else if (arg0 < 0 || this.field400.length <= arg0 || this.field400[arg0] == null || arg1 < 0 || arg1 >= this.field400[arg0].length) {
            return null;
        } else {
            if (this.field400[arg0][arg1] == null) {
                boolean var5 = this.method227(arg0, 20824, arg2);
                if (!var5) {
                    this.method223(33, arg0);
                    boolean var6 = this.method227(arg0, arg3 + 242, arg2);
                    if (!var6) {
                        return null;
                    }
                }
            }
            byte[] var7 = this.field400[arg0][arg1];
            if (this.field371) {
                this.field400[arg0][arg1] = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)V", line = 216)
    public void method223(int arg0, int arg1) {
        if (arg0 < 1) {
            this.method227(22, -64, null);
        }
        field391++;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[B)V", line = 226)
    public final void method224(int arg0, byte[] arg1) {
        this.field367 = class12.method245(arg1, arg1.length, (byte) -68);
        class8 var3 = new class8(class102.method866(arg1, 9));
        int var4 = var3.method145(false);
        field389++;
        if (var4 != 5) {
            return;
        }
        int var5 = 0;
        int var6 = var3.method145(false);
        this.field372 = var3.method146(65280);
        this.field378 = new int[this.field372];
        if (arg0 != -21071) {
            this.method219(-78, (byte) 73, -64);
        }
        int var7 = -1;
        for (int var8 = 0; var8 < this.field372; var8++) {
            this.field378[var8] = var5 += var3.method146(65280);
            if (this.field378[var8] > var7) {
                var7 = this.field378[var8];
            }
        }
        this.field394 = new int[var7 + 1][];
        this.field375 = new int[var7 + 1];
        this.field403 = new int[var7 + 1];
        this.field400 = new byte[var7 + 1][][];
        this.field412 = new int[var7 + 1];
        this.field363 = new byte[var7 + 1][];
        if (var6 != 0) {
            this.field390 = new int[var7 + 1];
            for (int var9 = 0; var9 < this.field372; var9++) {
                this.field390[this.field378[var9]] = var3.method168(-4750);
            }
            this.field405 = new class85(this.field390);
        }
        for (int var10 = 0; var10 < this.field372; var10++) {
            this.field403[this.field378[var10]] = var3.method168(-4750);
        }
        for (int var11 = 0; var11 < this.field372; var11++) {
            this.field375[this.field378[var11]] = var3.method168(-4750);
        }
        for (int var12 = 0; var12 < this.field372; var12++) {
            this.field412[this.field378[var12]] = var3.method146(class64.method626(arg0, -44367));
        }
        for (int var13 = 0; var13 < this.field372; var13++) {
            int var18 = 0;
            int var19 = this.field378[var13];
            int var20 = -1;
            int var21 = this.field412[var19];
            this.field394[var19] = new int[var21];
            for (int var22 = 0; var22 < var21; var22++) {
                int var23 = this.field394[var19][var22] = var18 += var3.method146(class64.method626(arg0, -44367));
                if (var23 > var20) {
                    var20 = var23;
                }
            }
            this.field400[var19] = new byte[var20 + 1][];
        }
        if (var6 == 0) {
            return;
        }
        this.field368 = new class85[var7 + 1];
        this.field387 = new int[var7 + 1][];
        for (int var14 = 0; var14 < this.field372; var14++) {
            int var15 = this.field378[var14];
            int var16 = this.field412[var15];
            this.field387[var15] = new int[this.field400[var15].length];
            for (int var17 = 0; var17 < var16; var17++) {
                this.field387[var15][this.field394[var15][var17]] = var3.method168(arg0 + 16321);
            }
            this.field368[var15] = new class85(this.field387[var15]);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IILa;)I", line = 364)
    public final int method225(int arg0, int arg1, class1 arg2) {
        int var4 = 107 % ((-arg0 - 47) / 56);
        class1 var5 = arg2.method30(-128);
        field365++;
        return this.field368[arg1].method748(var5.method27((byte) 41), -70);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V", line = 375)
    public static void method226(int arg0) {
        field410 = null;
        field366 = null;
        field407 = null;
        if (arg0 != 0) {
            field376 = null;
        }
        field380 = null;
        field408 = null;
        field376 = null;
        field413 = null;
        field409 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II[I)Z", line = 392)
    private final boolean method227(int arg0, int arg1, int[] arg2) {
        field373++;
        if (this.field363[arg0] == null) {
            return false;
        }
        int var4 = this.field412[arg0];
        byte[][] var5 = this.field400[arg0];
        int[] var6 = this.field394[arg0];
        boolean var7 = true;
        for (int var8 = 0; var8 < var4; var8++) {
            if (var5[var6[var8]] == null) {
                var7 = false;
                break;
            }
        }
        if (arg1 != 20824) {
            field380 = null;
        }
        if (var7) {
            return true;
        }
        byte[] var9;
        if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
            var9 = this.field363[arg0];
        } else {
            var9 = new byte[this.field363[arg0].length];
            class33.method393(this.field363[arg0], 0, var9, 0, var9.length);
            class8 var10 = new class8(var9);
            var10.method160(arg2, false, var10.field285.length, 5);
        }
        byte[] var11;
        try {
            var11 = class102.method866(var9, arg1 - 20815);
        } catch (RuntimeException var26) {
            throw class14.method260(var26, "T3 - " + (arg2 != null) + "," + arg0 + "," + var9.length + "," + class12.method245(var9, var9.length, (byte) -68) + "," + class12.method245(var9, var9.length - 2, (byte) -68) + "," + this.field403[arg0] + "," + this.field367);
        }
        if (this.field384) {
            this.field363[arg0] = null;
        }
        if (var4 > 1) {
            int var13 = var11.length;
            int var27 = var13 - 1;
            int var14 = var11[var27] & 0xFF;
            class8 var15 = new class8(var11);
            int var16 = var27 - var4 * var14 * 4;
            var15.field268 = var16;
            int[] var17 = new int[var4];
            for (int var18 = 0; var18 < var14; var18++) {
                int var19 = 0;
                for (int var20 = 0; var20 < var4; var20++) {
                    var19 += var15.method168(arg1 - 25574);
                    var17[var20] += var19;
                }
            }
            for (int var21 = 0; var21 < var4; var21++) {
                if (var5[var6[var21]] == null) {
                    var5[var6[var21]] = new byte[var17[var21]];
                }
                var17[var21] = 0;
            }
            var15.field268 = var16;
            int var22 = 0;
            for (int var23 = 0; var23 < var14; var23++) {
                int var24 = 0;
                for (int var25 = 0; var25 < var4; var25++) {
                    var24 += var15.method168(-4750);
                    class33.method393(var11, var22, var5[var6[var25]], var17[var25], var24);
                    var17[var25] += var24;
                    var22 += var24;
                }
            }
        } else {
            var5[var6[0]] = var11;
        }
        return true;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(III)[B", line = 542)
    public final byte[] method228(int arg0, int arg1, int arg2) {
        field377++;
        if (arg2 < 0 || this.field400.length <= arg2 || this.field400[arg2] == null || arg0 < 0 || this.field400[arg2].length <= arg0) {
            return null;
        }
        if (this.field400[arg2][arg0] == null) {
            boolean var4 = this.method227(arg2, 20824, null);
            if (!var4) {
                this.method223(45, arg2);
                boolean var5 = this.method227(arg2, 20824, null);
                if (!var5) {
                    return null;
                }
            }
        }
        int var6 = 44 % ((-arg1 - 59) / 42);
        return this.field400[arg2][arg0];
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILa;)I", line = 579)
    public final int method229(int arg0, class1 arg1) {
        if (arg0 != 0) {
            this.method229(58, null);
        }
        field388++;
        class1 var3 = arg1.method30(arg0 ^ 0xFFFFFF80);
        return this.field405.method748(var3.method27((byte) 41), arg0 - 80);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "([BI)V", line = 593)
    public static final void method230(byte[] arg0, int arg1) {
        field398++;
        class8 var2 = new class8(arg0);
        var2.field268 = arg0.length - 2;
        class76.field1903 = var2.method146(65280);
        class80.field1988 = new int[class76.field1903];
        class113.field2797 = new byte[class76.field1903][];
        class31.field838 = new int[class76.field1903];
        class130.field3197 = new int[class76.field1903];
        class112.field2774 = new int[class76.field1903];
        var2.field268 = arg0.length - class76.field1903 * 8 - 7;
        class115.field2880 = var2.method146(65280);
        class64.field1631 = var2.method146(65280);
        int var3 = (var2.method145(false) & 0xFF) + 1;
        for (int var4 = 0; var4 < class76.field1903; var4++) {
            class112.field2774[var4] = var2.method146(65280);
        }
        for (int var5 = arg1; var5 < class76.field1903; var5++) {
            class80.field1988[var5] = var2.method146(arg1 + 65280);
        }
        for (int var6 = 0; var6 < class76.field1903; var6++) {
            class31.field838[var6] = var2.method146(65280);
        }
        for (int var7 = 0; var7 < class76.field1903; var7++) {
            class130.field3197[var7] = var2.method146(65280);
        }
        var2.field268 = arg0.length + 3 - class76.field1903 * 8 - var3 * 3 - 7;
        class8.field293 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class8.field293[var8] = var2.method165(true);
            if (class8.field293[var8] == 0) {
                class8.field293[var8] = 1;
            }
        }
        var2.field268 = 0;
        for (int var9 = 0; var9 < class76.field1903; var9++) {
            int var10 = class130.field3197[var9];
            int var11 = class31.field838[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class113.field2797[var9] = var13;
            int var14 = var2.method145(false);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method185(109);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var11; var15++) {
                    for (int var16 = 0; var16 < var10; var16++) {
                        var13[var11 * var16 + var15] = var2.method185(94);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)Z", line = 711)
    public final boolean method231(byte arg0) {
        field381++;
        boolean var2 = true;
        if (arg0 < 11) {
            return true;
        }
        for (int var3 = 0; var3 < this.field378.length; var3++) {
            int var4 = this.field378[var3];
            if (this.field363[var4] == null) {
                this.method223(59, var4);
                if (this.field363[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(II)Z", line = 743)
    public final boolean method232(int arg0, int arg1) {
        field404++;
        if (this.field363[arg1] != null) {
            return true;
        }
        this.method223(74, arg1);
        if (this.field363[arg1] == null) {
            if (arg0 < 102) {
                field370 = 119L;
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(IB)[B", line = 768)
    public final byte[] method233(int arg0, byte arg1) {
        if (arg1 >= -74) {
            this.method219(-8, (byte) 107, 12);
        }
        field414++;
        if (this.field400.length == 1) {
            return this.method218(arg0, 115, 0);
        } else if (this.field400[arg0].length == 1) {
            return this.method218(0, 120, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V", line = 787)
    public static final void method234(boolean arg0) {
        class46.field1198.method268((byte) 95);
        class85.field2139.method268((byte) -90);
        if (arg0) {
            field362++;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(Z)V", line = 802)
    public static final void method235(boolean arg0) {
        field401++;
        if (arg0) {
            field376 = null;
        }
        class106.field2666.method268((byte) 59);
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(IB)I", line = 814)
    public final int method236(int arg0, byte arg1) {
        field386++;
        return arg1 < 4 ? 17 : this.field400[arg0].length;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V", line = 833)
    public final void method237(int arg0) {
        field369++;
        for (int var2 = 0; var2 < this.field400.length; var2++) {
            if (this.field400[var2] != null) {
                for (int var3 = 0; var3 < this.field400[var2].length; var3++) {
                    this.field400[var2][var3] = null;
                }
            }
        }
        if (arg0 != 1120) {
            this.method232(-112, 82);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZ)[I", line = 874)
    public final int[] method238(int arg0, boolean arg1) {
        if (arg1) {
            field392++;
            return this.field394[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BI)[B", line = 885)
    public final byte[] method239(byte arg0, int arg1) {
        field395++;
        if (this.field400.length == 1) {
            return this.method228(arg1, -116, 0);
        } else if (this.field400[arg1].length == 1) {
            return this.method228(0, -124, arg1);
        } else {
            if (arg0 < 17) {
                field408 = null;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(La;La;I)Z", line = 910)
    public final boolean method240(class1 arg0, class1 arg1, int arg2) {
        field402++;
        if (arg2 != -1234) {
            this.field412 = null;
        }
        class1 var4 = arg0.method30(-128);
        class1 var5 = arg1.method30(-128);
        int var6 = this.field405.method748(var4.method27((byte) 41), -66);
        int var7 = this.field368[var6].method748(var5.method27((byte) 41), arg2 ^ 0x483);
        return this.method219(var6, (byte) -10, var7);
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(ILa;)V", line = 928)
    public final void method241(int arg0, class1 arg1) {
        class1 var3 = arg1.method30(-128);
        int var4 = this.field405.method748(var3.method27((byte) 41), -69);
        field374++;
        if (arg0 == 0 && var4 >= 0) {
            this.method220(var4, (byte) 2);
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(ZZ)V", line = 966)
    public class11(boolean arg0, boolean arg1) {
        this.field371 = arg1;
        this.field384 = arg0;
    }
}
