import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class233 {

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field3813 = 0;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "I")
    public static int field3816 = 0;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field3814 = -1;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field3811 = -1;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Z")
    public static boolean field3812 = false;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static final void method1630(int arg0) {
        field3815++;
        int var1 = class279.field4404;
        int var2 = class23.field386;
        int var3 = class68.field1134;
        int var4 = class145.field2322;
        int var5 = 6116423;
        class2.method25(var1, var2, var3, var4, var5);
        class2.method25(var1 + 1, var2 - -1, var3 - 2, 16, 0);
        class2.method24(var1 + 1, var2 + 18, var3 - 2, var4 - 19, 0);
        class262.field4165.method1811(class47.field849, var1 + 3, var2 + 14, var5, -1);
        int var6 = class241.field3898;
        int var7 = class109.field1801;
        if (arg0 >= -100) {
            method1630(33);
        }
        for (int var8 = 0; var8 < class205.field3291; var8++) {
            int var9 = (class205.field3291 - var8 - 1) * 15 + (var2 + 31);
            int var10 = 16777215;
            if (var1 < var6 && var6 < (var1 + var3) && var7 > (var9 - 13) && (var9 + 3) > var7) {
                var10 = 16776960;
            }
            class262.field4165.method1811(class141.method978(-124, var8), var1 + 3, var9, var10, 0);
        }
        class274.method1849((byte) 78, class68.field1134, class279.field4404, class145.field2322, class23.field386);
    }
}
