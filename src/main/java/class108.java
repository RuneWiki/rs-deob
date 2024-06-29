import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class108 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1696 = "glow3:";

    @OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
    public static int field1699 = 0;

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "[Lad;")
    public static class326[] field1701 = new class326[29];

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field1692 = 0;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!pl", name = "h", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V", line = 13)
    public static final void method792(byte arg0) {
        field1694++;
        if (class295.field4568 != null) {
            class295.field4568.method365(1);
            class295.field4568 = null;
        }
        class171.method1235((byte) -127);
        class77.method568();
        for (int var1 = 0; var1 < 4; var1++) {
            class224.field3570[var1].method2068((byte) -50);
        }
        class257.method1766(110, false);
        System.gc();
        class218.method1535(2, (byte) -92);
        class186.field2783 = false;
        class43.field694 = -1;
        class12.method89((byte) -106, true);
        class213.field3249 = 0;
        class81.field1272 = 0;
        class342.field5328 = 0;
        class315.field4887 = 0;
        class92.field1463 = false;
        for (int var2 = 0; var2 < class75.field1216.length; var2++) {
            class75.field1216[var2] = null;
        }
        class312.field4839 = 0;
        class310.field4816 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class254.field3992[var3] = null;
            class254.field3998[var3] = null;
        }
        if (arg0 != 6) {
            return;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class254.field3989[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class280.field4315[var5][var6][var7] = null;
                }
            }
        }
        class18.method141((byte) -56);
        class304.field4753 = 0;
        class235.method1653(-99);
        class203.method1441(1, true);
        try {
            class3.method16("loggedout", class32.field471.field2721, arg0 - 132);
        } catch (Throwable var9) {
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)V", line = 120)
    public static void method793(byte arg0) {
        int var1 = -90 / ((80 - arg0) / 43);
        field1701 = null;
        field1696 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lwb;IIIII)V", line = 159)
    public static final void method794(class253 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class273.field4226 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class50.field817) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class267.field4171 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class142 var14 = class256.field4013[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class218.field3321[var11][var12 + 1][var13] + class218.field3321[var11][var12][var13] + class218.field3321[var11][var12][var13 + 1] + class218.field3321[var11][var12 + 1][var13 + 1]) / 4 - (class218.field3321[arg1][arg2 + 1][arg3] + class218.field3321[arg1][arg2][arg3] + class218.field3321[arg1][arg2][arg3 + 1] + class218.field3321[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class103 var16 = var14.field2213;
                                    if (var16 != null) {
                                        if (var16.field1598.method162()) {
                                            arg0.method184(var16.field1598, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field1600 != null && var16.field1600.method162()) {
                                            arg0.method184(var16.field1600, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field2204; var17++) {
                                        class26 var18 = var14.field2197[var17];
                                        if (var18 != null && var18.field406.method162() && (var18.field411 == var12 || var7 == var12) && (var18.field410 == var13 || var9 == var13)) {
                                            int var19 = var18.field405 + 1 - var18.field411;
                                            int var20 = var18.field396 + 1 - var18.field410;
                                            arg0.method184(var18.field406, (var18.field411 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field410 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(B)V", line = 268)
    public static final void method795(byte arg0) {
        field1693++;
        if (class30.field443 < 128.0F) {
            class30.field443 = 128.0F;
        }
        while (class259.field4063 >= 2048.0F) {
            class259.field4063 -= 2048.0F;
        }
        while (class259.field4063 < 0.0F) {
            class259.field4063 += 2048.0F;
        }
        int var1 = class239.field3807 >> 7;
        if (class30.field443 > 383.0F) {
            class30.field443 = 383.0F;
        }
        int var2 = class106.field1647 >> 7;
        int var3 = class320.method2181(class239.field3807, class106.field1647, -59, class205.field3101);
        int var4 = 0;
        int var5 = 5 / ((arg0 - 59) / 54);
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var6 = var1 - 4; var6 <= var1 + 4; var6++) {
                for (int var7 = var2 - 4; var7 <= (var2 + 4); var7++) {
                    int var8 = class205.field3101;
                    if (var8 < 3 && (class92.field1468[1][var6][var7] & 0x2) == 2) {
                        var8++;
                    }
                    int var9 = (class143.field2220[var8][var6][var7] & 0xFF) * 8 + var3 - class218.field3321[var8][var6][var7];
                    if (var9 > var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = var4 * 192;
        if (var10 > 98048) {
            var10 = 98048;
        }
        if (var10 < 32768) {
            var10 = 32768;
        }
        if (var10 > class182.field2743) {
            class182.field2743 += (var10 - class182.field2743) / 24;
        } else if (var10 < class182.field2743) {
            class182.field2743 += (var10 - class182.field2743) / 80;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ll;Ll;I)V", line = 344)
    public static final void method796(class133 arg0, class133 arg1, int arg2) {
        class315.field4888 = arg0;
        class117.field1786 = arg1;
        field1695++;
        if (arg2 != -6869) {
            field1701 = (class326[]) null;
        }
    }
}
