import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class236 {

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "I")
    private int field4287 = -1;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    private int field4289 = 0;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "Lsg;")
    private class203 field4301 = new class203();

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "Z")
    public boolean field4303 = false;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    private int field4285;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
    private int field4291;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "[Lqf;")
    private class180[] field4293;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "[[[I")
    private int[][][] field4286;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "Ldc;")
    public static class37 field4290 = class185.method1233((byte) 86, "Spieler");

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field4294 = 0;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public static int field4298 = 0;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "Ldc;")
    public static class37 field4295 = class185.method1233((byte) 86, " loggt sich aus)3");

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "Ldc;")
    public static class37 field4296 = class185.method1233((byte) 86, " <col=00ff80>");

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field4288;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)I")
    public static final int method1521(int arg0, int arg1) {
        if (arg0 > -40) {
            field4298 = -97;
        }
        field4288++;
        class152 var2 = class229.method1487(arg1, false);
        int var3 = var2.field2885;
        int var4 = var2.field2880;
        int var5 = class113.field2024[var4 - var3];
        int var6 = var2.field2881;
        return var5 & class159.field3011[var6] >> var3;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(II)[[I")
    public final int[][] method1522(int arg0, int arg1) {
        field4292++;
        if (arg0 != -29659) {
            this.field4291 = 64;
        }
        if (this.field4291 == this.field4285) {
            this.field4303 = this.field4293[arg1] == null;
            this.field4293[arg1] = class91.field1561;
            return this.field4286[arg1];
        } else if (this.field4291 == 1) {
            this.field4303 = this.field4287 != arg1;
            this.field4287 = arg1;
            return this.field4286[0];
        } else {
            class180 var3 = this.field4293[arg1];
            if (var3 == null) {
                this.field4303 = true;
                if (this.field4291 <= this.field4289) {
                    class180 var4 = (class180) this.field4301.method1341(14);
                    var3 = new class180(arg1, var4.field3356);
                    this.field4293[var4.field3364] = null;
                    var4.method433(arg0 ^ 0xFFFF8C25);
                } else {
                    var3 = new class180(arg1, this.field4289);
                    this.field4289++;
                }
                this.field4293[arg1] = var3;
            } else {
                this.field4303 = false;
            }
            this.field4301.method1335(var3, -1);
            return this.field4286[var3.field3356];
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
    public final void method1523(int arg0) {
        for (int var2 = 0; var2 < this.field4291; var2++) {
            this.field4286[var2][0] = null;
            this.field4286[var2][1] = null;
            this.field4286[var2][2] = null;
            this.field4286[var2] = null;
        }
        this.field4293 = null;
        this.field4286 = null;
        int var3 = 119 % ((arg0 + 2) / 55);
        this.field4301.method1336(26);
        this.field4301 = null;
        field4297++;
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)[[[I")
    public final int[][][] method1524(int arg0) {
        field4300++;
        if (this.field4291 != this.field4285) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field4291; var2++) {
            this.field4293[var2] = class91.field1561;
        }
        int var3 = -114 % ((70 - arg0) / 47);
        return this.field4286;
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(II)V")
    public static final void method1525(int arg0, int arg1) {
        field4299++;
        if (class109.field1891 == arg0) {
            return;
        }
        if (class109.field1891 == 0) {
            class69.method507((byte) 11);
        }
        if (arg1 != 27172) {
            field4296 = null;
        }
        if (arg0 == 20 || arg0 == 40) {
            class28.field467 = 0;
            class30.field589 = 0;
            class44.field927 = 0;
        }
        if (arg0 != 20 && arg0 != 40 && class206.field3828 != null) {
            class206.field3828.method557(false);
            class206.field3828 = null;
        }
        if (class109.field1891 == 25) {
            class92.field1588 = 0;
            class157.field2986 = 0;
            class6.field65 = 1;
            class61.field1123 = 0;
            class75.field1330 = 1;
        }
        if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
            class196.method1304(class161.field3047, class212.field3958, class225.field4158, -128);
        } else {
            class67.method488(2);
        }
        class109.field1891 = arg0;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method1526(byte arg0, Throwable arg1) throws IOException {
        field4302++;
        String var2;
        if (arg1 instanceof class241) {
            class241 var3 = (class241) arg1;
            var2 = var3.field4421 + " | ";
            arg1 = var3.field4419;
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        int var6 = -43 / ((-arg0 - 11) / 36);
        String var7 = var4.toString();
        BufferedReader var8 = new BufferedReader(new StringReader(var7));
        String var9 = var8.readLine();
        while (true) {
            while (true) {
                String var10 = var8.readLine();
                if (var10 == null) {
                    return var2 + "| " + var9;
                }
                int var11 = var10.indexOf(40);
                int var12 = var10.indexOf(41, var11 + 1);
                if (var11 >= 0 && var12 >= 0) {
                    String var13 = var10.substring(var11 + 1, var12);
                    int var14 = var13.indexOf(".java:");
                    if (var14 >= 0) {
                        String var15 = var13.substring(0, var14) + var13.substring(var14 + 5);
                        var2 = var2 + var15 + ' ';
                        continue;
                    }
                    var10 = var10.substring(0, var11);
                }
                String var16 = var10.trim();
                String var17 = var16.substring(var16.lastIndexOf(32) + 1);
                String var18 = var17.substring(var17.lastIndexOf(9) + 1);
                var2 = var2 + var18 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V")
    public static void method1527(int arg0) {
        if (arg0 >= 72) {
            field4296 = null;
            field4290 = null;
            field4295 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(III)V")
    public class236(int arg0, int arg1, int arg2) {
        this.field4285 = arg1;
        this.field4291 = arg0;
        this.field4293 = new class180[this.field4285];
        this.field4286 = new int[this.field4291][3][arg2];
    }
}
