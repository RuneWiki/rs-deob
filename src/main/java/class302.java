import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class302 {

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field5162 = -1;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "Lok;")
    public static class146 field5185 = class235.method1724(-12908, "mapscene");

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "Lok;")
    private static class146 field5188 = class235.method1724(-12908, "red:");

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Lok;")
    public static class146 field5168 = field5188;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Lok;")
    public static class146 field5171 = field5188;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "Lok;")
    public static class146 field5189 = class235.method1724(-12908, " GMT");

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "Lok;")
    public static class146 field5192 = class235.method1724(-12908, "hint_headicons");

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public int field5163;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public int field5164;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public int field5165;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public int field5166;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public int field5167;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public int field5169;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public int field5170;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public int field5173;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public int field5174;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public int field5175;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public int field5176;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public int field5177;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public int field5178;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public int field5180;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    public int field5181;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    public static int field5182;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    public int field5183;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public int field5187;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public int field5191;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "Lrb;")
    public static class215 field5179;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)Lok;", line = 21)
    public static final class146 method2136(int arg0, int arg1) {
        field5186++;
        if (arg1 <= 0 || arg1 > 255) {
            throw new IllegalArgumentException();
        }
        class146 var2 = new class146();
        if (arg0 == 25162) {
            var2.field2461 = 1;
            var2.field2462 = new byte[1];
            var2.field2462[0] = (byte) arg1;
            return var2;
        } else {
            return (class146) null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 46)
    public static final void method2137(int arg0) {
        field5182++;
        int var1 = class116.field1864;
        int var2 = class113.field1821;
        int var3 = class283.field4851;
        if (arg0 != 18) {
            method2139(-35);
        }
        int var4 = class171.field2889;
        int var5 = 6116423;
        if (class271.field4640) {
            class131.method978(var2, var1, var3, var4, var5);
            class131.method978(var2 + 1, var1 + 1, var3 - 2, 16, 0);
            class131.method965(var2 + 1, var1 - -18, var3 - 2, var4 + -19, 0);
        } else {
            class181.method1416(var2, var1, var3, var4, var5);
            class181.method1416(var2 + 1, var1 - -1, var3 - 2, 16, 0);
            class181.method1435(var2 + 1, var1 + 18, var3 - 2, var4 + -19, 0);
        }
        class39.field695.method210(class261.field4334, var2 + 3, var1 + 14, var5, -1);
        int var6 = class232.field3875;
        int var7 = class316.field5368;
        for (int var8 = 0; var8 < class45.field763; var8++) {
            int var9 = (class45.field763 - var8 - 1) * 15 + var1 + 31;
            int var10 = 16777215;
            if (var6 > var2 && var2 + var3 > var6 && var9 - 13 < var7 && var9 + 3 > var7) {
                var10 = 16776960;
            }
            class39.field695.method210(class45.method311(var8, (byte) 110), var2 + 3, var9, var10, 0);
        }
        class133.method984(class171.field2889, class116.field1864, 122, class283.field4851, class113.field1821);
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V", line = 104)
    public static final void method2138(int arg0) {
        field5184++;
        if (arg0 != 25) {
            return;
        }
        if (class238.field3973 == 10 && class271.field4640) {
            class1.method4(-41, 28);
        }
        if (class238.field3973 == 30) {
            class1.method4(-41, 25);
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V", line = 126)
    public static void method2139(int arg0) {
        field5189 = null;
        field5168 = null;
        field5188 = null;
        field5179 = null;
        field5171 = null;
        field5192 = null;
        field5185 = null;
        if (arg0 != -1) {
            method2138(-103);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLok;)V", line = 159)
    public static final void method2140(byte arg0, class146 arg1) {
        field5190++;
        if (arg0 == 124) {
            int var2 = class17.method131((byte) -41, arg1);
            if (var2 != -1) {
                class296.method2104(class135.field2255.field4793[var2], class135.field2255.field4792[var2], true);
            }
        }
    }
}
