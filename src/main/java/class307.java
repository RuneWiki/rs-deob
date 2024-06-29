import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class307 {

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Ltl;")
    public static class59 field5199 = class85.method639(")4a=", 9588);

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Ltl;")
    public static class59 field5201 = class85.method639("floorshadows", 9588);

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Ltl;")
    public static class59 field5202 = class85.method639("(U0a )2 in: ", 9588);

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "[Llj;")
    public static class5[] field5204;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V", line = 13)
    public static void method2127(int arg0) {
        field5199 = null;
        field5201 = null;
        field5202 = null;
        if (arg0 == 0) {
            field5204 = null;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V", line = 49)
    public static final void method2128(boolean arg0) {
        field5200++;
        int var1 = class1.field4;
        int var2 = class247.field4117;
        int var3 = class162.field2640;
        int var4 = 6116423;
        int var5 = class105.field1736;
        if (class55.field815) {
            class240.method1688(var1, var2, var5, var3, var4);
            class240.method1688(var1 + 1, var2 - -1, var5 - 2, 16, 0);
            class240.method1680(var1 + 1, var2 + 18, var5 - 2, var3 + -19, 0);
        } else {
            class272.method1892(var1, var2, var5, var3, var4);
            class272.method1892(var1 + 1, var2 + 1, var5 - 2, 16, 0);
            class272.method1899(var1 + 1, var2 + 18, var5 - 2, var3 + -19, 0);
        }
        if (arg0) {
            field5204 = (class5[]) null;
        }
        class251.field4187.method720(class275.field4741, var1 + 3, var2 - -14, var4, -1);
        int var6 = class254.field4213;
        int var7 = class184.field3079;
        for (int var8 = 0; var8 < class231.field3803; var8++) {
            int var9 = (class231.field3803 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var1 < var6 && var6 < (var1 + var5) && var7 > (var9 - 13) && var9 + 3 > var7) {
                var10 = 16776960;
            }
            class251.field4187.method720(class224.method1546(var8, (byte) 110), var1 + 3, var9, var10, 0);
        }
        class167.method1182((byte) -4, class105.field1736, class1.field4, class162.field2640, class247.field4117);
    }
}
