import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class711 {

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field9936 = 0;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field9933;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field9934;

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field9935;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "Z")
    public static boolean field9932;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 7)
    public static final void method3961(int arg0) {
        if (~class760.field10527 <= arg0) {
            long var1 = class337.method2062(false);
            class760.field10527 = (int) ((long) class760.field10527 - (var1 - class24.field271));
            if (class760.field10527 <= 0) {
                class747.field10386 = class174.field2634.field4845;
                class271.field3810 = class174.field2634.field4853;
                class33.field405 = class174.field2634.field4847;
                class515.field7099 = class174.field2634.field4850;
                class762.field10564 = class174.field2634.field4842;
                class397.field5482 = class174.field2634.field4855;
                class469.field6391 = class174.field2634.field4846;
                class379.field5319 = class174.field2634.field4859;
                class681.field9660 = class174.field2634.field4858;
                class163.field2506 = class174.field2634.field4848;
                class760.field10527 = -1;
            } else {
                int var3 = (class760.field10527 << 8) / class277.field3998;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                class379.field5319 = ((class609.field8656 & 0xFF00) * var3 + (class174.field2634.field4859 & 0xFF00) * var4 & 0xFF0000) + ((class609.field8656 & 0xFF00FF) * var3 + (class174.field2634.field4859 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                float var6 = 1.0F - var5;
                class762.field10564 = (class174.field2634.field4842 - class544.field7551) * var6 + class544.field7551;
                class271.field3810 = (class174.field2634.field4853 - class27.field289) * var6 + class27.field289;
                class747.field10386 = (class174.field2634.field4845 - class359.field5082) * var6 + class359.field5082;
                class469.field6391 = ((class393.field5462 & 0xFF00FF) * var3 + ((class174.field2634.field4846 & 0xFF00FF) * var4) & 0xFF00FF00) + ((class393.field5462 & 0xFF00) * var3 + (class174.field2634.field4846 & 0xFF00) * var4 & 0xFF0000) >>> 8;
                class681.field9660 = (class174.field2634.field4858 - class659.field9289) * var6 + class659.field9289;
                class515.field7099 = class742.field10275 * var3 + (class174.field2634.field4850 * var4) >> 8;
                class397.field5482 = (class174.field2634.field4855 - class346.field4932) * var6 + class346.field4932;
                class33.field405 = (class174.field2634.field4847 - class176.field2655) * var6 + class176.field2655;
                if (class184.field2800 != class174.field2634.field4848) {
                    class163.field2506 = class321.field4568.method94(class184.field2800, class174.field2634.field4848, var6, class163.field2506);
                }
            }
            class24.field271 = var1;
        }
        field9934++;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IBI[Ljava/lang/String;)Ljava/lang/String;", line = 65)
    public static final String method3962(int arg0, byte arg1, int arg2, String[] arg3) {
        if (arg1 > -69) {
            method3962(118, (byte) 107, 5, null);
        }
        field9933++;
        if (arg0 == 0) {
            return "";
        } else if (arg0 == 1) {
            String var4 = arg3[arg2];
            return var4 == null ? "null" : var4.toString();
        } else {
            int var5 = arg0 + arg2;
            int var6 = 0;
            for (int var7 = arg2; var7 < var5; var7++) {
                String var11 = arg3[var7];
                if (var11 == null) {
                    var6 += 4;
                } else {
                    var6 += var11.length();
                }
            }
            StringBuffer var8 = new StringBuffer(var6);
            for (int var9 = arg2; var9 < var5; var9++) {
                String var10 = arg3[var9];
                if (var10 == null) {
                    var8.append("null");
                } else {
                    var8.append(var10);
                }
            }
            return var8.toString();
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)V", line = 129)
    public static final void method3963(int arg0) {
        field9935++;
        int var1 = class789.field10791.length;
        if (arg0 != -9198) {
            return;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class789.field10791[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class587.field8439; var4++) {
                    if (class293.field4286[var4] == class12.field156[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class293.field4286[class587.field8439] = class12.field156[var2];
                    var3 = class587.field8439++;
                }
                class431 var5 = new class431(class789.field10791[var2]);
                int var6 = 0;
                while (var5.field5983 < class789.field10791[var2].length && var6 < 511 && class657.field9270 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method2565((byte) -86);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class12.field156[var2] >> 8) * 64 + var10 - class222.field3266;
                    int var13 = (class12.field156[var2] & 0xFF) * 64 + var11 - class697.field9798;
                    class179 var14 = class677.field9511.method3700(arg0 ^ 0xFFFFA2E7, var5.method2565((byte) -83));
                    class647 var15 = (class647) class486.field6697.method4253((long) var7, -1);
                    if (var15 == null && (var14.field2690 & 0x1) > 0 && class112.field1620 == var9 && var12 >= 0 && class192.field2891 > (var14.field2737 + var12) && var13 >= 0 && var14.field2737 + var13 < class456.field6225) {
                        class506 var16 = new class506();
                        var16.field4051 = var7;
                        class647 var17 = new class647(var16);
                        class486.field6697.method4252(false, var17, (long) var7);
                        class654.field9252[class51.field731++] = var17;
                        class350.field4963[class657.field9270++] = var7;
                        var16.field4087 = class594.field8494;
                        var16.method2965(524288, var14);
                        var16.method1798(var16.field6964.field2737, false);
                        var16.field4117 = var16.field6964.field2676 << 3;
                        var16.method1795(var16.field6964.field2710 + 4 << 11 & 0x3898, arg0 ^ 0xFFFFDC12, true);
                        var16.method2962(var9, var12, var13, var16.method209(true), -570433240, true);
                    }
                }
            }
        }
    }
}
