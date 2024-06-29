import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class332 {

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "[Lfa;")
    private class312[] field5140;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5137 = " from your ignore list first.";

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5141 = "Started 3d Library";

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "Lng;")
    public static class245 field5133;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V", line = 4)
    public static void method2275(byte arg0) {
        if (arg0 == 84) {
            field5137 = null;
            field5133 = null;
            field5141 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V", line = 17)
    public static final void method2276(byte arg0) {
        int var1 = -121 % ((-arg0 - 21) / 60);
        field5134++;
        class174.method1179(0, 0, (byte) 73);
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(B)V", line = 34)
    public static final void method2277(byte arg0) {
        class154.method1075();
        class230.field3714 = null;
        field5136++;
        class34.field445 = -1;
        class205.method1376(0);
        class137.field2125.method351(0);
        class166.field2556 = new class118();
        ((class97) class12.field126).method672(-119);
        int var1 = -107 / ((-arg0 - 59) / 57);
        class67.method485();
        class147.field2321 = 0;
        class147.field2326 = new class310[255];
        class340.method2384();
        class11.method81();
        class116.method802(false);
        class43.method309(-8977, false);
        class59.method404((byte) -65);
        class93.method639(255);
        for (int var2 = 0; var2 < 2048; var2++) {
            class82 var3 = class64.field966[var2];
            if (var3 != null) {
                var3.field463 = null;
            }
        }
        if (class333.field5166) {
            class11.method72(104, 104);
            class128.method870(0, class268.field4135);
            class243.method1651();
        }
        class52.method352(class121.field1859, (byte) -66, class143.field2275);
        class187.method1283(class121.field1859, 0);
        class271.field4164 = null;
        class128.field2001 = null;
        class343.field5343 = null;
        class259.field4021 = null;
        class177.field2719 = null;
        if (class304.field4758 == 5) {
            class164.method1123(2, class121.field1859);
        }
        if (class304.field4758 == 10) {
            class345.method2395(true, false);
        }
        if (class304.field4758 == 30) {
            class231.method1583(25, (byte) 109);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIII)V", line = 110)
    public static final void method2278(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5135++;
        for (class229 var5 = (class229) class240.field3812.method10((byte) 119); var5 != null; var5 = (class229) class240.field3812.method13((byte) -32)) {
            class19.method147(arg1, 114, arg4, var5, arg2, arg0);
        }
        if (arg3 > -35) {
            field5139 = 6;
        }
        for (class229 var6 = (class229) class203.field3066.method10((byte) 64); var6 != null; var6 = (class229) class203.field3066.method13((byte) -32)) {
            byte var7 = 1;
            class309 var8 = var6.field3674.method280(-26);
            if (var6.field3674.field474 == var8.field4876) {
                var7 = 0;
            } else if (var6.field3674.field474 == var8.field4872 || var6.field3674.field474 == var8.field4864 || var6.field3674.field474 == var8.field4867 || var6.field3674.field474 == var8.field4858) {
                var7 = 2;
            } else if (var6.field3674.field474 == var8.field4855 || var6.field3674.field474 == var8.field4862 || var6.field3674.field474 == var8.field4890 || var6.field3674.field474 == var8.field4882) {
                var7 = 3;
            }
            if (var6.field3689 != var7) {
                int var9 = class61.method409(0, var6.field3674);
                if (var6.field3681 != var9) {
                    if (var6.field3690 != null) {
                        class74.field1102.method221(var6.field3690);
                        var6.field3690 = null;
                    }
                    var6.field3681 = var9;
                }
                var6.field3689 = var7;
            }
            var6.field3675 = var6.field3674.field537;
            var6.field3685 = var6.field3674.field537 + (var6.field3674.method271((byte) 80) * 64);
            var6.field3672 = var6.field3674.field519;
            var6.field3693 = var6.field3674.field519 + (var6.field3674.method271((byte) 127) * 64);
            class19.method147(arg1, 106, arg4, var6, arg2, arg0);
        }
        for (class229 var10 = (class229) class175.field2681.method1549((byte) 89); var10 != null; var10 = (class229) class175.field2681.method1546(-1)) {
            byte var11 = 1;
            class309 var12 = var10.field3698.method280(-42);
            if (var10.field3698.field474 == var12.field4876) {
                var11 = 0;
            } else if (var10.field3698.field474 == var12.field4872 || var10.field3698.field474 == var12.field4864 || var10.field3698.field474 == var12.field4867 || var10.field3698.field474 == var12.field4858) {
                var11 = 2;
            } else if (var10.field3698.field474 == var12.field4855 || var10.field3698.field474 == var12.field4862 || var10.field3698.field474 == var12.field4890 || var10.field3698.field474 == var12.field4882) {
                var11 = 3;
            }
            if (var10.field3689 != var11) {
                int var13 = class247.method1667(var10.field3698, false);
                if (var10.field3681 != var13) {
                    if (var10.field3690 != null) {
                        class74.field1102.method221(var10.field3690);
                        var10.field3690 = null;
                    }
                    var10.field3681 = var13;
                }
                var10.field3689 = var11;
            }
            var10.field3675 = var10.field3698.field537;
            var10.field3685 = var10.field3698.field537 + var10.field3698.method271((byte) 49) * 64;
            var10.field3672 = var10.field3698.field519;
            var10.field3693 = var10.field3698.field519 + (var10.field3698.method271((byte) 106) * 64);
            class19.method147(arg1, 103, arg4, var10, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/String;)I", line = 230)
    public static final int method2279(int arg0, String arg1) {
        if (arg0 < 8) {
            method2276((byte) -127);
        }
        field5138++;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(I)V", line = 247)
    public class332(int arg0) {
        this.field5140 = new class312[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class312 var3 = this.field5140[var2] = new class312();
            var3.field4944 = var3;
            var3.field4936 = var3;
        }
    }
}
