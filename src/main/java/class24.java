import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class24 implements Runnable {

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "Z")
    public boolean field408 = true;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Ljava/lang/Object;")
    public Object field411 = new Object();

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public int field412 = 0;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "[I")
    public int[] field414 = new int[500];

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "[I")
    public int[] field416 = new int[500];

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "Luc;")
    public static class11 field405 = new class11(50);

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    public static int field415 = 0;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "Lmb;")
    private static class96 field413 = class243.method1708("Loading)3)3)3", (byte) 104);

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "Lmb;")
    public static class96 field417 = field413;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
    public static void method166(byte arg0) {
        field405 = null;
        if (arg0 != -113) {
            method166((byte) -87);
        }
        field413 = null;
        field417 = null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)V")
    public static final void method167(byte arg0, int arg1) {
        field410++;
        if (arg0 != 59) {
            method167((byte) -56, 47);
        }
        class43 var2 = class270.method1847(arg1, -10277, 11);
        var2.method339(true);
    }

    @OriginalMember(owner = "client!dl", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field408) {
            Object var1 = this.field411;
            synchronized (this.field411) {
                if (this.field412 < 500) {
                    this.field416[this.field412] = class17.field244;
                    this.field414[this.field412] = class214.field3684;
                    this.field412++;
                }
            }
            class226.method1543(50L, -738);
        }
        field406++;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lrg;B)Lgk;")
    public static final class175 method168(class239 arg0, byte arg1) {
        arg0.method1651(4139);
        field407++;
        int var2 = arg0.method1651(4139);
        class175 var3 = class149.method1094(var2, (byte) -90);
        var3.field3028 = arg0.method1651(4139);
        int var4 = arg0.method1651(4139);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method1651(4139);
            var3.method115((byte) -127, var6, arg0);
        }
        var3.method150(2);
        return arg1 < 125 ? null : var3;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)V")
    public static final void method169(int arg0, int arg1) {
        int var2 = 14 % ((28 - arg0) / 46);
        field409++;
        short var3 = 256;
        if (arg1 > var3) {
            arg1 = var3;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class169.field2962 += arg1 * 128;
        if (class192.field3325.length < class169.field2962) {
            class169.field2962 -= class192.field3325.length;
            int var4 = (int) (Math.random() * 12.0D);
            class150.method1100(class33.field587[var4], -71);
        }
        int var5 = arg1 * 128;
        int var6 = 0;
        int var7 = (var3 - arg1) * 128;
        for (int var8 = 0; var8 < var7; var8++) {
            int var27 = class27.field454[var5 + var6] - (class192.field3325[class169.field2962 + var6 & class192.field3325.length + -1] * arg1 / 6);
            if (var27 < 0) {
                var27 = 0;
            }
            class27.field454[var6++] = var27;
        }
        for (int var9 = var3 - arg1; var9 < var3; var9++) {
            int var24 = var9 * 128;
            for (int var25 = 0; var25 < 128; var25++) {
                int var26 = (int) (Math.random() * 100.0D);
                if (var26 < 50 && var25 > 10 && var25 < 118) {
                    class27.field454[var24 + var25] = 255;
                } else {
                    class27.field454[var24 + var25] = 0;
                }
            }
        }
        for (int var10 = 0; var10 < var3 - arg1; var10++) {
            class222.field3796[var10] = class222.field3796[arg1 + var10];
        }
        for (int var11 = var3 - arg1; var11 < var3; var11++) {
            class222.field3796[var11] = (int) (Math.sin((double) class149.field2627 / 14.0D) * 16.0D + Math.sin((double) class149.field2627 / 15.0D) * 14.0D + Math.sin((double) class149.field2627 / 16.0D) * 12.0D);
            class149.field2627++;
        }
        class21.field349 += arg1;
        int var12 = ((class236.field4053 & 0x1) + arg1) / 2;
        if (var12 <= 0) {
            return;
        }
        for (int var13 = 0; var13 < class21.field349; var13++) {
            int var22 = (int) (Math.random() * 124.0D) + 2;
            int var23 = (int) (Math.random() * 128.0D) + 128;
            class27.field454[(var23 << 7) + var22] = 192;
        }
        class21.field349 = 0;
        for (int var14 = 0; var14 < var3; var14++) {
            int var19 = 0;
            int var20 = var14 * 128;
            for (int var21 = -var12; var21 < 128; var21++) {
                if ((var21 + var12) < 128) {
                    var19 += class27.field454[var12 + var21 + var20];
                }
                if (var21 - var12 - 1 >= 0) {
                    var19 -= class27.field454[var20 + var21 - (var12 - -1)];
                }
                if (var21 >= 0) {
                    class183.field3166[var20 + var21] = var19 / (var12 * 2 + 1);
                }
            }
        }
        for (int var15 = 0; var15 < 128; var15++) {
            int var16 = 0;
            for (int var17 = -var12; var17 < var3; var17++) {
                int var18 = var17 * 128;
                if (var3 > var12 + var17) {
                    var16 += class183.field3166[var18 + (var12 * 128) + var15];
                }
                if ((var17 - var12 - 1) >= 0) {
                    var16 -= class183.field3166[var18 + var15 - ((var12 + 1) * 128)];
                }
                if (var17 >= 0) {
                    class27.field454[var15 + var18] = var16 / (var12 * 2 + 1);
                }
            }
        }
    }
}
