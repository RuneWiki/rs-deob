import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class23 {

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    private int field333 = -1;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    private int field334 = 0;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "Lwe;")
    private class15 field322 = new class15();

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "Z")
    public boolean field338 = false;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "[Lwc;")
    private class220[] field321;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "[[[I")
    private int[][][] field332;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field325 = 0;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "Lve;")
    public static class184 field330 = new class184(64);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "Lee;")
    public static class266 field335;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILmf;Lmf;ILjb;IBI)V")
    public static final void method151(int arg0, class10 arg1, class10 arg2, int arg3, class255 arg4, int arg5, byte arg6, int arg7) {
        class13.field201 = arg7;
        class127.field2217 = arg4;
        class122.field2171 = arg5;
        class132.field2307 = arg3;
        field323++;
        class273.field4827 = arg0;
        if (class39.field615 != null) {
            return;
        }
        class129.field2266 = true;
        if (class57.field999 == null) {
            class57.field999 = class269.method1848((byte) -128, class161.field2773, 0, class77.field1430);
        }
        if (class65.field1196 == null) {
            class65.field1196 = class151.method986(0, class161.field2773, -125, class97.field1753);
        }
        if (class261.field4613 == null) {
            class261.field4613 = class151.method986(0, class161.field2773, -112, class236.field4077);
        }
        if (class180.field3094 == null) {
            class180.field3094 = class151.method986(0, class161.field2773, -124, class182.field3110);
        }
        int var8 = class122.field2171 / 5;
        if (arg6 != 22) {
            method151(-67, (class10) null, (class10) null, 52, (class255) null, -25, (byte) 48, 62);
        }
        int var9 = class122.field2171 / 5 * 4;
        class179.method1210(class13.field201, class273.field4827, class122.field2171, class132.field2307, 0, 168);
        class179.method1226(class13.field201, class273.field4827, var8, 23, 12425273, 9135624);
        class179.method1226(class13.field201 + var8, class273.field4827, var9, 23, 5197647, 2697513);
        arg1.method71(class184.field3141, var8 / 2 + class13.field201, class273.field4827 - -15, 0, -1);
        if (class180.field3094 != null) {
            class180.field3094[1].method713(class13.field201 + var8 + 2, class273.field4827 - -1);
            arg2.method67(class83.field1521, var8 + class13.field201 + 12, class273.field4827 + 10, 16777215, -1);
            class180.field3094[0].method713(class13.field201 + var8 + 2, class273.field4827 + 12);
            arg2.method67(class93.field1703, var8 + class13.field201 + 12, class273.field4827 + 21, 16777215, -1);
        }
        if (class261.field4613 != null) {
            int var10 = class13.field201 + var8 + 140;
            if (class153.field2655[0] == 0 && class204.field3560[0] == 0) {
                class261.field4613[2].method713(var10, class273.field4827 + 4);
            } else {
                class261.field4613[0].method713(var10, class273.field4827 + 4);
            }
            if (class153.field2655[0] == 0 && class204.field3560[0] == 1) {
                class261.field4613[3].method713(var10 + 15, class273.field4827 + 4);
            } else {
                class261.field4613[1].method713(var10 + 15, class273.field4827 + 4);
            }
            arg1.method67(class273.field4829, var10 + 32, class273.field4827 - -17, 16777215, -1);
            int var11 = class13.field201 + var8 + 250;
            if (class153.field2655[0] == 1 && class204.field3560[0] == 0) {
                class261.field4613[2].method713(var11, class273.field4827 + 4);
            } else {
                class261.field4613[0].method713(var11, class273.field4827 + 4);
            }
            if (class153.field2655[0] == 1 && class204.field3560[0] == 1) {
                class261.field4613[3].method713(var11 + 15, class273.field4827 - -4);
            } else {
                class261.field4613[1].method713(var11 + 15, class273.field4827 + 4);
            }
            arg1.method67(class163.field2799, var11 + 32, class273.field4827 + 17, 16777215, -1);
            int var12 = class13.field201 + var8 + 360;
            if (class153.field2655[0] == 2 && class204.field3560[0] == 0) {
                class261.field4613[2].method713(var12, class273.field4827 + 4);
            } else {
                class261.field4613[0].method713(var12, class273.field4827 + 4);
            }
            if (class153.field2655[0] == 2 && class204.field3560[0] == 1) {
                class261.field4613[3].method713(var12 + 15, class273.field4827 + 4);
            } else {
                class261.field4613[1].method713(var12 + 15, class273.field4827 - -4);
            }
            arg1.method67(class272.field4815, var12 + 32, class273.field4827 + 17, 16777215, -1);
            int var13 = class13.field201 + var8 + 470;
            if (class153.field2655[0] == 3 && class204.field3560[0] == 0) {
                class261.field4613[2].method713(var13, class273.field4827 + 4);
            } else {
                class261.field4613[0].method713(var13, class273.field4827 + 4);
            }
            if (class153.field2655[0] == 3 && class204.field3560[0] == 1) {
                class261.field4613[3].method713(var13 + 15, class273.field4827 + 4);
            } else {
                class261.field4613[1].method713(var13 + 15, class273.field4827 + 4);
            }
            arg1.method67(class59.field1074, var13 + 32, class273.field4827 + 17, 16777215, -1);
        }
        class179.method1222(class122.field2171 - 58 - 10, class273.field4827 + 4, 58, 16, 0);
        class93.field1699 = -1;
        if (class57.field999 == null) {
            return;
        }
        byte var14 = 88;
        byte var15 = 19;
        int var16 = (class132.field2307 - 23) / (var15 + 1);
        int var17 = class122.field2171 / (var14 + 1);
        int var18;
        int var19;
        do {
            var18 = var17;
            if (((var17 - 1) * var16) >= class230.field3971) {
                var17--;
            }
            var19 = var16;
            if (class230.field3971 <= (var16 - 1) * var17) {
                var16--;
            }
            if ((var16 - 1) * var17 >= class230.field3971) {
                var16--;
            }
        } while (var16 != var19 || var17 != var18);
        int var20 = (class122.field2171 - (var14 * var17)) / (var17 + 1);
        if (var20 > 5) {
            var20 = 5;
        }
        int var21 = (class122.field2171 - (var14 * var17) - ((var17 + -1) * var20)) / 2;
        int var22 = (class132.field2307 - var15 * var16 - 23) / (var16 + 1);
        int var23 = var21;
        int var24 = 0;
        if (var22 > 5) {
            var22 = 5;
        }
        int var25 = (class132.field2307 - ((var16 - 1) * var22) - var15 * var16 - 23) / 2;
        int var26 = var25 + 23;
        for (int var27 = 0; var27 < class230.field3971; var27++) {
            class112 var28 = class178.field3051[var27];
            boolean var29 = true;
            class85 var30 = class68.method451(var28.field1964, -12572);
            if (var28.field1964 == -1) {
                var30 = class28.field425;
                var29 = false;
            } else if (var28.field1964 > 1980) {
                var30 = class64.field1176;
                var29 = false;
            }
            if (class245.field4195 >= var23 && class106.field1851 >= var26 && class245.field4195 < var14 + var23 && class106.field1851 < var15 + var26 && var29) {
                class93.field1699 = var27;
                class57.field999[var28.field1962 ? 1 : 0].method98(class13.field201 + var23, class273.field4827 + var26, 128, 16777215);
            } else {
                class57.field999[var28.field1962 ? 1 : 0].method56(class13.field201 + var23, class273.field4827 + var26);
            }
            if (class65.field1196 != null) {
                class65.field1196[(var28.field1962 ? class65.field1196.length / 2 : 0) + var28.field1961].method713(class13.field201 + var23 + 29, class273.field4827 + var26);
            }
            arg1.method71(class68.method451(var28.field1951, -12572), class13.field201 + var23 + 15, var15 / 2 + var26 + class273.field4827 + 5, 0, -1);
            arg2.method71(var30, class13.field201 + var23 + 60, class273.field4827 + var26 + 5 - -(var15 / 2), 268435455, -1);
            var26 += var15 + var22;
            var24++;
            if (var16 <= var24) {
                var24 = 0;
                var26 = var25 + 23;
                var23 += var14 + var20;
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/lang/Throwable;B)Ljava/lang/String;")
    public static final String method152(Throwable arg0, byte arg1) throws IOException {
        field326++;
        String var3;
        if (arg0 instanceof class86) {
            class86 var2 = (class86) arg0;
            var3 = var2.field1610 + " | ";
            arg0 = var2.field1612;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        if (arg1 >= -11) {
            field325 = 2;
        }
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)[[[I")
    public final int[][][] method153(int arg0) {
        field336++;
        if (this.field329 != this.field328) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field328; var2++) {
            this.field321[var2] = class135.field2362;
        }
        return this.field332;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)V")
    public static final void method154(byte arg0, int arg1) {
        class94.field1715.method1267(arg1, (byte) -88);
        field331++;
        int var2 = -66 / ((arg0 + 22) / 59);
        class178.field3039.method1267(arg1, (byte) -11);
        class6.field74.method1267(arg1, (byte) -58);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method155(int arg0, boolean arg1) {
        field327++;
        if (arg1) {
            this.field334 = -37;
        }
        if (this.field329 == this.field328) {
            this.field338 = this.field321[arg0] == null;
            this.field321[arg0] = class135.field2362;
            return this.field332[arg0];
        } else if (this.field328 == 1) {
            this.field338 = this.field333 != arg0;
            this.field333 = arg0;
            return this.field332[0];
        } else {
            class220 var3 = this.field321[arg0];
            if (var3 == null) {
                this.field338 = true;
                if (this.field328 > this.field334) {
                    var3 = new class220(arg0, this.field334);
                    this.field334++;
                } else {
                    class220 var4 = (class220) this.field322.method113(84);
                    var3 = new class220(arg0, var4.field3868);
                    this.field321[var4.field3866] = null;
                    var4.method1753(137);
                }
                this.field321[arg0] = var3;
            } else {
                this.field338 = false;
            }
            this.field322.method108(var3, 6266);
            return this.field332[var3.field3868];
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
    public static void method156(int arg0) {
        field330 = null;
        field335 = null;
        if (arg0 > -94) {
            method158(37, -62);
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
    public final void method157(int arg0) {
        for (int var2 = arg0; var2 < this.field328; var2++) {
            this.field332[var2][0] = null;
            this.field332[var2][1] = null;
            this.field332[var2][2] = null;
            this.field332[var2] = null;
        }
        field337++;
        this.field332 = null;
        this.field321 = null;
        this.field322.method112(arg0 - 64);
        this.field322 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I")
    public static final int method158(int arg0, int arg1) {
        field320++;
        double var2 = (double) ((arg0 & 0xFF22) >> 8) / 256.0D;
        double var4 = (double) ((arg0 & 0xFF32F5) >> 16) / 256.0D;
        if (arg1 != 3609) {
            field325 = -90;
        }
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var4;
        double var10 = var4;
        if (var2 > var4) {
            var10 = var2;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        if (var2 < var4) {
            var8 = var2;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var4 == var10) {
                var12 = (var2 - var6) / (var10 - var8);
            } else if (var2 == var10) {
                var12 = (var6 - var4) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var4 - var2) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return (var20 >> 2 << 10) + (var22 >> 1) + (var21 >> 5 << 7);
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(III)V")
    public class23(int arg0, int arg1, int arg2) {
        this.field329 = arg1;
        this.field328 = arg0;
        this.field321 = new class220[this.field329];
        this.field332 = new int[this.field328][3][arg2];
    }
}
