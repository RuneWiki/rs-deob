import java.awt.Canvas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class228 extends class398 {

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    private int field3337;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    private int field3341;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
    private int field3347;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "I")
    private int field3343;

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public static int field3334 = 0;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "Z")
    public static boolean field3333 = false;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
    public static int field3345 = 0;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public static volatile int field3338 = -1;

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "[I")
    public static int[] field3349 = new int[32];

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public static int field3342;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
    public static int field3346;

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(Ljava/awt/Canvas;Lcj;II)Lja;")
    public static final class90 method1702(Canvas arg0, class181 arg1, int arg2, int arg3) {
        ++field3344;
        if (arg3 != 32) {
            method1702((Canvas) null, (class181) null, 103, -1);
        }
        return new class396(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIB)V")
    public final void method23(int arg0, int arg1, byte arg2) {
        ++field3336;
        int var4 = 84 % ((arg2 - -62) / 37);
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1703(int arg0, Throwable arg1) throws IOException {
        ++field3335;
        String var3;
        if (arg1 instanceof class428) {
            class428 var2 = (class428) arg1;
            arg1 = var2.field6203;
            var3 = var2.field6201 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                String var18 = var3 + "| " + var8;
                if (arg0 != -1) {
                    field3349 = null;
                }
                return var18;
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
            String var14 = var13.substring(1 + var13.lastIndexOf(32));
            String var15 = var14.substring(1 + var14.lastIndexOf(9));
            String var16 = var3 + var15;
            if (~var10 != 0 && ~var11 != 0) {
                int var17 = var9.indexOf(".java:", var10);
                if (~var17 <= -1) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(III)V")
    public final void method25(int arg0, int arg1, int arg2) {
        ++field3339;
        if (arg1 > -46) {
            field3346 = 98;
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(III)V")
    public final void method28(int arg0, int arg1, int arg2) {
        ++field3342;
        int var4 = this.field3337 * arg1 >> 12;
        int var5 = this.field3341 * arg1 >> 12;
        int var6 = this.field3347 * arg0 >> 12;
        int var7 = this.field3343 * arg0 >> 12;
        if (arg2 != 0) {
            this.method25(38, -3, 29);
        }
        class128.method1080(var6, var7, var4, super.field5863, var5, -2261);
    }

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "(I)V")
    public static void method1704(int arg0) {
        field3349 = null;
        if (arg0 != -1) {
            field3333 = false;
        }
    }

    @OriginalMember(owner = "client!nj", name = "<init>", descriptor = "(IIIIII)V")
    public class228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3337 = arg0;
        this.field3341 = arg2;
        this.field3347 = arg1;
        this.field3343 = arg3;
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(BI)Lgi;")
    public static final class253 method1705(byte arg0, int arg1) {
        ++field3348;
        class253 var2 = (class253) class219.field3253.method103(0, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class281.field4218.method1355(arg1, -12607, 26);
            class253 var4 = new class253();
            if (var3 != null) {
                var4.method1832(54, new class37(var3));
            }
            if (arg0 >= -16) {
                field3333 = true;
            }
            class219.field3253.method113(var4, 0, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "(I)V")
    public static final void method1706(int arg0) {
        ++field3340;
        class13.field216.field565 = 0;
        class234.field3387 = 0;
        class79.field1335 = 0;
        if (arg0 != 32) {
            field3333 = false;
        }
        class11.field142 = -1;
        class51.field824 = 0;
        class322.field4649 = -1;
        class393.field5740 = -1;
        class197.field2876 = -1;
        class268.field4020.field565 = 0;
        class245.method1780(35);
        class254.method1840(true);
        for (int var1 = 0; class367.field5225.length > var1; ++var1) {
            if (class367.field5225[var1] != null) {
                class367.field5225[var1].field5625 = -1;
            }
        }
        for (int var2 = 0; var2 < class447.field6512.length; ++var2) {
            if (class447.field6512[var2] != null) {
                class447.field6512[var2].field5625 = -1;
            }
        }
        class115.method983((byte) -97);
        class322.field4643 = 1;
        class168.method1288(arg0 ^ -38, 30);
        for (int var3 = 0; ~var3 > -101; ++var3) {
            class254.field3685[var3] = true;
        }
        class8.method57(arg0 + 12);
    }
}
