import java.awt.Canvas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class714 extends class486 {

    @OriginalMember(owner = "client!ag", name = "N", descriptor = "[Ljava/lang/String;")
    private static final String[] field10345 = new String[] { method5179(method5178("\tm@\u0003e@")), method5179(method5178("\tm@\u0005f@")), method5179(method5178("\u0006\u007f\u0002+")), method5179(method5178("\tm@\u0006\u000f")), method5179(method5178("\u0013$@iZ")), method5179(method5178("\tm@\u0005e@")), method5179(method5178("\tm@\u000f\u000f")), method5179(method5178("\tm@{N\u0006c\u001ay\u000f")), method5179(method5178("\tm@\n\u000f")), method5179(method5178("\tm@\u0013f@")), method5179(method5178("HvN")), method5179(method5178("\u0014*")), method5179(method5178("F`\u000f1FR")), method5179(method5178("\tm@\u0006e@")), method5179(method5178("\tm@\b\u000f")), method5179(method5178("\tm@\u0004e@")), method5179(method5178("\tm@\u000b\u000f")), method5179(method5178("\tm@\u0002\u000f")), method5179(method5178("\tm@\rf@")), method5179(method5178("\tm@\u0000f@")), method5179(method5178("\tm@\u0010f@")), method5179(method5178("\tm@\u0003\u000f")), method5179(method5178("\tm@\u0000\u000f")), method5179(method5178("\tm@\u0005\u000f")) };

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "Z")
    public static boolean field10332 = false;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "F")
    public float field10315;

    @OriginalMember(owner = "client!ag", name = "D", descriptor = "F")
    public float field10319;

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "F")
    public float field10327;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "F")
    public float field10328;

    @OriginalMember(owner = "client!ag", name = "t", descriptor = "F")
    public float field10330;

    @OriginalMember(owner = "client!ag", name = "G", descriptor = "F")
    public float field10331;

    @OriginalMember(owner = "client!ag", name = "v", descriptor = "F")
    public float field10333;

    @OriginalMember(owner = "client!ag", name = "y", descriptor = "F")
    public float field10334;

    @OriginalMember(owner = "client!ag", name = "J", descriptor = "F")
    public float field10338;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "F")
    public float field10339;

    @OriginalMember(owner = "client!ag", name = "x", descriptor = "F")
    public float field10340;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "F")
    public float field10343;

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "I")
    public static int field10311;

    @OriginalMember(owner = "client!ag", name = "A", descriptor = "I")
    public static int field10312;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "I")
    public static int field10313;

    @OriginalMember(owner = "client!ag", name = "B", descriptor = "I")
    public static int field10314;

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field10316;

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
    public static int field10317;

    @OriginalMember(owner = "client!ag", name = "F", descriptor = "I")
    public static int field10318;

    @OriginalMember(owner = "client!ag", name = "I", descriptor = "I")
    public static int field10320;

    @OriginalMember(owner = "client!ag", name = "r", descriptor = "I")
    public static int field10321;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field10322;

    @OriginalMember(owner = "client!ag", name = "H", descriptor = "I")
    public static int field10324;

    @OriginalMember(owner = "client!ag", name = "C", descriptor = "I")
    public static int field10325;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field10326;

    @OriginalMember(owner = "client!ag", name = "w", descriptor = "I")
    public static int field10329;

    @OriginalMember(owner = "client!ag", name = "E", descriptor = "I")
    public static int field10335;

    @OriginalMember(owner = "client!ag", name = "L", descriptor = "I")
    public static int field10336;

    @OriginalMember(owner = "client!ag", name = "s", descriptor = "I")
    public static int field10337;

    @OriginalMember(owner = "client!ag", name = "M", descriptor = "I")
    public static int field10341;

    @OriginalMember(owner = "client!ag", name = "K", descriptor = "I")
    public static int field10342;

    @OriginalMember(owner = "client!ag", name = "u", descriptor = "I")
    public static int field10344;

    @OriginalMember(owner = "client!ag", name = "q", descriptor = "[I")
    public static int[] field10323;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method5175(byte arg0, Throwable arg1) throws IOException {
        field10325++;
        String var2;
        if ((arg1 instanceof class681)) {
            class681 var3 = (class681) arg1;
            arg1 = var3.field9709;
            var2 = var3.field9710 + field10345[10];
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        if (arg0 <= 30) {
            field10317 = -124;
        }
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + field10345[11] + var8;
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
                int var17 = var9.indexOf(field10345[12], var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "(I)V")
    public final void method2467(int arg0) {
        try {
            field10318++;
            float var2 = class579.field8338[arg0 & 0x3FFF];
            float var3 = class579.field8340[arg0 & 0x3FFF];
            float var4 = this.field10339;
            float var5 = this.field10338;
            float var6 = this.field10340;
            this.field10339 = this.field10328 * var3 + var2 * var4;
            float var7 = this.field10331;
            this.field10328 = this.field10328 * var2 - (var3 * var4);
            this.field10338 = this.field10334 * var3 + var2 * var5;
            this.field10340 = this.field10330 * var3 + var2 * var6;
            this.field10334 = this.field10334 * var2 - (var3 * var5);
            this.field10330 = this.field10330 * var2 - var3 * var6;
            this.field10331 = this.field10319 * var3 + var2 * var7;
            this.field10319 = this.field10319 * var2 - (var3 * var7);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field10345[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "()V")
    public final void method2471() {
        try {
            this.field10315 = this.field10328 = this.field10338 = this.field10334 = this.field10340 = this.field10343 = this.field10331 = this.field10327 = this.field10319 = 0.0F;
            field10326++;
            this.field10339 = this.field10333 = this.field10330 = 1.0F;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10345[8] + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V")
    public final void method2455(int arg0) {
        try {
            this.field10339 = 1.0F;
            field10324++;
            this.field10333 = this.field10330 = class579.field8338[arg0 & 0x3FFF];
            this.field10334 = class579.field8340[arg0 & 0x3FFF];
            this.field10338 = this.field10340 = this.field10331 = this.field10315 = this.field10327 = this.field10328 = this.field10319 = 0.0F;
            this.field10343 = -this.field10334;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10345[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "(I)V")
    public final void method2464(int arg0) {
        try {
            field10312++;
            float var2 = class579.field8338[arg0 & 0x3FFF];
            float var3 = class579.field8340[arg0 & 0x3FFF];
            float var4 = this.field10339;
            float var5 = this.field10338;
            float var6 = this.field10340;
            float var7 = this.field10331;
            this.field10339 = var2 * var4 - this.field10315 * var3;
            this.field10315 = this.field10315 * var2 + var3 * var4;
            this.field10338 = var2 * var5 - (this.field10333 * var3);
            this.field10333 = this.field10333 * var2 + var3 * var5;
            this.field10340 = var2 * var6 - this.field10343 * var3;
            this.field10331 = var2 * var7 - this.field10327 * var3;
            this.field10343 = this.field10343 * var2 + var3 * var6;
            this.field10327 = this.field10327 * var2 + var3 * var7;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field10345[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(III[I)V")
    public final void method2462(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            field10313++;
            int var7 = (int) ((float) arg0 - this.field10331);
            int var8 = (int) ((float) arg1 - this.field10327);
            int var9 = (int) ((float) arg2 - this.field10319);
            arg3[2] = (int) ((float) var9 * this.field10330 + (float) var7 * this.field10340 + (float) var8 * this.field10343);
            arg3[1] = (int) ((float) var9 * this.field10334 + (float) var7 * this.field10338 + (float) var8 * this.field10333);
            arg3[0] = (int) ((float) var9 * this.field10328 + (float) var7 * this.field10339 + (float) var8 * this.field10315);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field10345[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field10345[2] : field10345[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(I)V")
    public final void method2458(int arg0) {
        try {
            this.field10333 = 1.0F;
            field10337++;
            this.field10339 = this.field10330 = class579.field8338[arg0 & 0x3FFF];
            this.field10340 = class579.field8340[arg0 & 0x3FFF];
            this.field10328 = -this.field10340;
            this.field10338 = this.field10331 = this.field10315 = this.field10343 = this.field10327 = this.field10334 = this.field10319 = 0.0F;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10345[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III[I)V")
    public final void method2457(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            arg3[2] = (int) ((float) arg2 * this.field10330 + (float) arg0 * this.field10328 + (float) arg1 * this.field10334 + this.field10319);
            arg3[0] = (int) ((float) arg2 * this.field10340 + (float) arg0 * this.field10339 + (float) arg1 * this.field10338 + this.field10331);
            arg3[1] = (int) ((float) arg2 * this.field10343 + (float) arg0 * this.field10315 + (float) arg1 * this.field10333 + this.field10327);
            field10329++;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field10345[21] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field10345[2] : field10345[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIII)V")
    public final void method2478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field10335++;
            float var7 = class579.field8338[arg3 & 0x3FFF];
            float var8 = class579.field8340[arg3 & 0x3FFF];
            float var9 = class579.field8338[arg4 & 0x3FFF];
            float var10 = class579.field8340[arg4 & 0x3FFF];
            float var11 = class579.field8338[arg5 & 0x3FFF];
            float var12 = class579.field8340[arg5 & 0x3FFF];
            float var13 = var8 * var11;
            float var14 = var8 * var12;
            this.field10340 = -var10 * var11 + var9 * var14;
            this.field10328 = var7 * var10;
            this.field10330 = var7 * var9;
            this.field10339 = var9 * var11 + var10 * var14;
            this.field10334 = -var8;
            this.field10333 = var7 * var11;
            this.field10343 = var9 * var13 + var10 * var12;
            this.field10315 = -var9 * var12 + var10 * var13;
            this.field10338 = var7 * var12;
            this.field10319 = (float) (-arg0) * this.field10328 - (float) arg1 * this.field10334 - (float) arg2 * this.field10330;
            this.field10331 = (float) (-arg0) * this.field10339 - (float) arg1 * this.field10338 - (float) arg2 * this.field10340;
            this.field10327 = (float) (-arg0) * this.field10315 - ((float) arg1 * this.field10333) - (float) arg2 * this.field10343;
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field10345[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(III)V")
    public final void method2465(int arg0, int arg1, int arg2) {
        try {
            this.field10327 = arg1;
            this.field10315 = this.field10328 = this.field10338 = this.field10334 = this.field10340 = this.field10343 = 0.0F;
            this.field10319 = arg2;
            field10314++;
            this.field10331 = arg0;
            this.field10339 = this.field10333 = this.field10330 = 1.0F;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10345[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(III)V")
    public final void method2480(int arg0, int arg1, int arg2) {
        try {
            this.field10319 += arg2;
            field10336++;
            this.field10327 += arg1;
            this.field10331 += arg0;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field10345[18] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Ld;BILjava/awt/Canvas;I)Lha;")
    public static final class63 method5176(class158 arg0, byte arg1, int arg2, Canvas arg3, int arg4) {
        try {
            int var5 = -7 % ((-arg1 - 29) / 45);
            field10321++;
            return new class24(arg3, arg0, arg4, arg2);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field10345[3] + (arg0 == null ? field10345[2] : field10345[4]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field10345[2] : field10345[4]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)V")
    public final void method2459(int arg0) {
        try {
            field10320++;
            float var2 = class579.field8338[arg0 & 0x3FFF];
            float var3 = class579.field8340[arg0 & 0x3FFF];
            float var4 = this.field10315;
            float var5 = this.field10333;
            float var6 = this.field10343;
            this.field10315 = var2 * var4 - (this.field10328 * var3);
            float var7 = this.field10327;
            this.field10328 = this.field10328 * var2 + var3 * var4;
            this.field10333 = var2 * var5 - this.field10334 * var3;
            this.field10343 = var2 * var6 - this.field10330 * var3;
            this.field10334 = this.field10334 * var2 + var3 * var5;
            this.field10330 = this.field10330 * var2 + var3 * var6;
            this.field10327 = var2 * var7 - this.field10319 * var3;
            this.field10319 = this.field10319 * var2 + var3 * var7;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field10345[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(III[I)V")
    public final void method2466(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            field10344++;
            arg3[0] = (int) ((float) arg2 * this.field10340 + (float) arg0 * this.field10339 + (float) arg1 * this.field10338);
            arg3[2] = (int) ((float) arg2 * this.field10330 + (float) arg0 * this.field10328 + (float) arg1 * this.field10334);
            arg3[1] = (int) ((float) arg2 * this.field10343 + (float) arg0 * this.field10315 + (float) arg1 * this.field10333);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field10345[17] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field10345[2] : field10345[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()Lsj;")
    public final class486 method2472() {
        try {
            field10322++;
            class714 var1 = new class714();
            var1.field10338 = this.field10338;
            var1.field10333 = this.field10333;
            var1.field10334 = this.field10334;
            var1.field10343 = this.field10343;
            var1.field10315 = this.field10315;
            var1.field10330 = this.field10330;
            var1.field10327 = this.field10327;
            var1.field10339 = this.field10339;
            var1.field10328 = this.field10328;
            var1.field10319 = this.field10319;
            var1.field10340 = this.field10340;
            var1.field10331 = this.field10331;
            return var1;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10345[13] + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "([I)V")
    public final void method2479(int[] arg0) {
        try {
            field10342++;
            float var2 = (float) arg0[0] - this.field10331;
            float var3 = (float) arg0[1] - this.field10327;
            float var4 = (float) arg0[2] - this.field10319;
            arg0[1] = (int) (this.field10334 * var4 + this.field10338 * var2 + this.field10333 * var3);
            arg0[0] = (int) (this.field10328 * var4 + this.field10339 * var2 + this.field10315 * var3);
            arg0[2] = (int) (this.field10330 * var4 + this.field10343 * var3 + this.field10340 * var2);
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field10345[19] + (arg0 == null ? field10345[2] : field10345[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "(I)V")
    public static void method5177(int arg0) {
        try {
            int var1 = -74 / ((27 - arg0) / 49);
            field10323 = null;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10345[23] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lsj;)V")
    public final void method2461(class486 arg0) {
        try {
            field10316++;
            class714 var2 = (class714) arg0;
            this.field10319 = var2.field10319;
            this.field10338 = var2.field10338;
            this.field10330 = var2.field10330;
            this.field10327 = var2.field10327;
            this.field10315 = var2.field10315;
            this.field10334 = var2.field10334;
            this.field10339 = var2.field10339;
            this.field10328 = var2.field10328;
            this.field10340 = var2.field10340;
            this.field10331 = var2.field10331;
            this.field10333 = var2.field10333;
            this.field10343 = var2.field10343;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field10345[22] + (arg0 == null ? field10345[2] : field10345[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
    public final void method2475(int arg0) {
        try {
            field10311++;
            this.field10330 = 1.0F;
            this.field10339 = this.field10333 = class579.field8338[arg0 & 0x3FFF];
            this.field10315 = class579.field8340[arg0 & 0x3FFF];
            this.field10338 = -this.field10315;
            this.field10340 = this.field10331 = this.field10343 = this.field10327 = this.field10328 = this.field10334 = this.field10319 = 0.0F;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field10345[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class714() {
        try {
            this.method2471();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10345[7] + ')');
        }
    }

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5178(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x27);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ag", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5179(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 104;
                    break;
                case 1:
                    var10005 = 10;
                    break;
                case 2:
                    var10005 = 110;
                    break;
                case 3:
                    var10005 = 71;
                    break;
                default:
                    var10005 = 39;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
