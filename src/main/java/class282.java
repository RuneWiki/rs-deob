import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class282 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public int field4486;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Ljava/lang/String;")
    public String field4485;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4488;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)Lv;")
    public static final class152 method1927(int arg0) {
        class152 var1 = new class152(34);
        var1.method1074(11, arg0 ^ 0x7C);
        if (arg0 != 1) {
            field4488 = null;
        }
        var1.method1074(class213.field3408, 53);
        var1.method1074(class3.field29 ? 1 : 0, 115);
        var1.method1074(class5.field40 ? 1 : 0, 123);
        var1.method1074(class207.field3334 ? 1 : 0, 115);
        var1.method1074(class206.field3314 ? 1 : 0, 67);
        field4483++;
        var1.method1074(class144.field2328 ? 1 : 0, 101);
        var1.method1074(class84.field1224 ? 1 : 0, 67);
        var1.method1074(class42.field595 ? 1 : 0, 98);
        var1.method1074(class25.field287 ? 1 : 0, 115);
        var1.method1074(class184.field2953, 61);
        var1.method1074(class269.field4338 ? 1 : 0, 126);
        var1.method1074(class188.field3039 ? 1 : 0, arg0 + 82);
        var1.method1074(class23.field264 ? 1 : 0, 89);
        var1.method1074(class112.field1619, 116);
        var1.method1074(class139.field2246 ? 1 : 0, 125);
        var1.method1074(class171.field2757, 85);
        var1.method1074(class241.field3845, 118);
        var1.method1074(class212.field3402, 57);
        var1.method1094(arg0 ^ 0xD639B1E9, class198.field3196);
        var1.method1094(-700861976, class265.field4301);
        var1.method1074(class157.method1161(), 127);
        var1.method1119(class215.field3418, (byte) -110);
        var1.method1074(class2.field8, 67);
        var1.method1074(class96.field1421 ? 1 : 0, 122);
        var1.method1074(class113.field1640 ? 1 : 0, arg0 + 86);
        var1.method1074(class256.field4221, 115);
        var1.method1074(class264.field4286 ? 1 : 0, arg0 ^ 0x34);
        var1.method1074(class102.field1502 ? 1 : 0, arg0 ^ 0x78);
        return var1;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1928(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 != 4) {
            field4488 = null;
        }
        field4482++;
        if (arg3 < 0 || arg1 < 0 || arg3 >= 103 || arg1 >= 103) {
            return;
        }
        if (arg0 == 0) {
            class99 var8 = class73.method538(arg6, arg3, arg1);
            if (var8 != null) {
                int var9 = (int) (var8.field1464 >>> 32) & Integer.MAX_VALUE;
                if (arg5 == 2) {
                    var8.field1466 = new class43(var9, 2, arg2 + 4, arg6, arg3, arg1, arg4, false, var8.field1466);
                    var8.field1458 = new class43(var9, 2, arg2 + 1 & 0x3, arg6, arg3, arg1, arg4, false, var8.field1458);
                } else {
                    var8.field1466 = new class43(var9, arg5, arg2, arg6, arg3, arg1, arg4, false, var8.field1466);
                }
            }
        }
        if (arg0 == 1) {
            class156 var10 = class272.method1882(arg6, arg3, arg1);
            if (var10 != null) {
                int var11 = (int) (var10.field2565 >>> 32) & Integer.MAX_VALUE;
                if (arg5 == 4 || arg5 == 5) {
                    var10.field2560 = new class43(var11, 4, arg2, arg6, arg3, arg1, arg4, false, var10.field2560);
                } else if (arg5 == 6) {
                    var10.field2560 = new class43(var11, 4, arg2 + 4, arg6, arg3, arg1, arg4, false, var10.field2560);
                } else if (arg5 == 7) {
                    var10.field2560 = new class43(var11, 4, (arg2 + 2 & 0x3) + 4, arg6, arg3, arg1, arg4, false, var10.field2560);
                } else if (arg5 == 8) {
                    var10.field2560 = new class43(var11, 4, arg2 + 4, arg6, arg3, arg1, arg4, false, var10.field2560);
                    var10.field2569 = new class43(var11, 4, (arg2 + 2 & 0x3) + 4, arg6, arg3, arg1, arg4, false, var10.field2569);
                }
            }
        }
        if (arg0 == 2) {
            if (arg5 == 11) {
                arg5 = 10;
            }
            class166 var12 = class105.method782(arg6, arg3, arg1);
            if (var12 != null) {
                var12.field2681 = new class43(Integer.MAX_VALUE & (int) (var12.field2683 >>> 32), arg5, arg2, arg6, arg3, arg1, arg4, false, var12.field2681);
            }
        }
        if (arg0 != 3) {
            return;
        }
        class159 var13 = class78.method571(arg6, arg3, arg1);
        if (var13 != null) {
            var13.field2601 = new class43((int) (var13.field2600 >>> 32) & Integer.MAX_VALUE, 22, arg2, arg6, arg3, arg1, arg4, false, var13.field2601);
            return;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
    public static void method1929(int arg0) {
        field4488 = null;
        if (arg0 != 503) {
            method1929(-74);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILlc;)V")
    public static final void method1930(int arg0, class86 arg1) {
        field4484++;
        if (class202.field3234) {
            return;
        }
        class70.method496();
        class98.field1443 = class67.method480(arg1, class19.field212, -129);
        int var2 = class154.field2543;
        int var3 = var2 * 956 / 503;
        class98.field1443.method74((class23.field265 - var3) / 2, 0, var3, var2);
        class260.field4254 = class5.method27((byte) 68, class6.field46, arg1);
        class260.field4254.method20(class23.field265 / 2 - (class260.field4254.field1656 / 2), 18);
        class202.field3234 = true;
        if (arg0 != 4) {
            field4488 = null;
        }
    }
}
