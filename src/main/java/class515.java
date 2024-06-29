import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class515 {

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    public static int field7581 = 0;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "Lbg;")
    public static class324 field7576 = new class324(68, 5);

    @OriginalMember(owner = "client!ql", name = "k", descriptor = "I")
    public static int field7585 = 1400;

    @OriginalMember(owner = "client!ql", name = "n", descriptor = "[I")
    public static int[] field7588 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public int field7575;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field7577;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field7578;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public int field7579;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field7580;

    @OriginalMember(owner = "client!ql", name = "h", descriptor = "I")
    public static int field7582;

    @OriginalMember(owner = "client!ql", name = "i", descriptor = "I")
    public int field7583;

    @OriginalMember(owner = "client!ql", name = "j", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!ql", name = "l", descriptor = "I")
    public int field7586;

    @OriginalMember(owner = "client!ql", name = "m", descriptor = "Luk;")
    public static class171 field7587;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IB)I")
    public static final int method3055(int arg0, byte arg1) {
        field7578++;
        int var2 = 0;
        if (arg1 != -14) {
            method3055(9, (byte) 22);
        }
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V")
    public static final void method3056(byte arg0) {
        if (arg0 <= 63) {
            method3056((byte) 83);
        }
        field7584++;
        if (class305.field4338 != null) {
            class305.field4338.method1657((byte) -118);
        }
        if (class440.field6544 != null) {
            class440.field6544.method1657((byte) 2);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Z)V")
    public static void method3057(boolean arg0) {
        field7576 = null;
        field7588 = null;
        field7587 = null;
        if (!arg0) {
            field7581 = -108;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method3058(Throwable arg0, int arg1) throws IOException {
        field7577++;
        if (arg1 != -24565) {
            field7576 = null;
        }
        String var3;
        if (arg0 instanceof class247) {
            class247 var2 = (class247) arg0;
            arg0 = var2.field3667;
            var3 = var2.field3664 + " | ";
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
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
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
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
    public static final void method3059(int arg0) {
        field7582++;
        int var1 = class85.field1158 * 128 + 64;
        int var2 = class76.field1039 * 128 + 64;
        int var3 = class66.method643(var1, 99, class525.field7714, var2) - class318.field4514;
        if (class258.field3805 < 100) {
            if (class161.field2268 < var1) {
                class161.field2268 += class283.field4121 + ((var1 - class161.field2268) * class258.field3805 / 1000);
                if (class161.field2268 > var1) {
                    class161.field2268 = var1;
                }
            }
            if (class487.field7162 < var3) {
                class487.field7162 += (var3 - class487.field7162) * class258.field3805 / 1000 + class283.field4121;
                if (var3 < class487.field7162) {
                    class487.field7162 = var3;
                }
            }
            if (var1 < class161.field2268) {
                class161.field2268 -= (class161.field2268 - var1) * class258.field3805 / 1000 + class283.field4121;
                if (var1 > class161.field2268) {
                    class161.field2268 = var1;
                }
            }
            if (var2 > class486.field7138) {
                class486.field7138 += (var2 - class486.field7138) * class258.field3805 / 1000 + class283.field4121;
                if (var2 < class486.field7138) {
                    class486.field7138 = var2;
                }
            }
            if (class487.field7162 > var3) {
                class487.field7162 -= (class487.field7162 - var3) * class258.field3805 / 1000 + class283.field4121;
                if (class487.field7162 < var3) {
                    class487.field7162 = var3;
                }
            }
            if (var2 < class486.field7138) {
                class486.field7138 -= class283.field4121 + ((class486.field7138 - var2) * class258.field3805 / 1000);
                if (class486.field7138 < var2) {
                    class486.field7138 = var2;
                }
            }
        } else {
            class161.field2268 = class85.field1158 * 128 + 64;
            class486.field7138 = class76.field1039 * 128 + 64;
            class487.field7162 = class66.method643(class161.field2268, 44, class525.field7714, class486.field7138) - class318.field4514;
        }
        int var4 = class346.field4805 * 128 + 64;
        int var5 = class462.field6791 * 128 + 64;
        int var6 = class66.method643(var5, -86, class525.field7714, var4) - class172.field2447;
        int var7 = var5 - class161.field2268;
        int var8 = var6 - class487.field7162;
        int var9 = var4 - class486.field7138;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class321.field4529) {
            class321.field4529 += (var11 - class321.field4529 >> 3) * class193.field2810 / 1000 + class284.field4129 << 3;
            if (var11 < class321.field4529) {
                class321.field4529 = var11;
            }
        }
        if (class321.field4529 > var11) {
            class321.field4529 -= (class321.field4529 - var11 >> 3) * class193.field2810 / 1000 + class284.field4129 << 3;
            if (class321.field4529 < var11) {
                class321.field4529 = var11;
            }
        }
        int var13 = var12 - class316.field4503;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class316.field4503 += class193.field2810 * var14 / 1000 + class284.field4129 << 3;
            class316.field4503 &= 0x3FFF;
        }
        if (var14 < 0) {
            class316.field4503 -= -var14 * class193.field2810 / 1000 + class284.field4129 << 3;
            class316.field4503 &= 0x3FFF;
        }
        if (arg0 != 488012003) {
            return;
        }
        int var15 = var12 - class316.field4503;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class170.field2418 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class316.field4503 = var12;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Luu;B)Ljava/lang/String;")
    public static final String method3060(class188 arg0, byte arg1) {
        field7580++;
        if (client.method1380(arg0).method1789(16693) == 0) {
            return null;
        }
        if (arg1 != 120) {
            method3055(-5, (byte) -2);
        }
        if (arg0.field2753 == null || arg0.field2753.trim().length() == 0) {
            return class407.field6069 ? "Hidden-use" : null;
        } else {
            return arg0.field2753;
        }
    }
}
