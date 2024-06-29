import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class247 extends class32 {

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Lda;")
    public static class275 field4361 = class255.method1672(99, "l");

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field4362 = 0;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static void method1623(byte arg0) {
        field4361 = null;
        if (arg0 >= -2) {
            field4359 = -23;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILda;)Lkk;")
    public static final class225 method1624(int arg0, class275 arg1) {
        field4360++;
        for (class225 var2 = (class225) class93.field1590.method550(arg0 - 42); var2 != null; var2 = (class225) class93.field1590.method545(104)) {
            if (var2.field3814.method1828(true, arg1)) {
                return var2;
            }
        }
        return arg0 == -1 ? null : null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)V")
    public static final void method1625(boolean arg0) {
        field4358++;
        if (arg0) {
            method1624(75, (class275) null);
        }
        int var1 = class196.field3351.method525((byte) -38, 8);
        if (var1 < class32.field486) {
            for (int var2 = var1; var2 < class32.field486; var2++) {
                class38.field633[class26.field424++] = class149.field2595[var2];
            }
        }
        if (var1 > class32.field486) {
            throw new RuntimeException("gppov1");
        }
        class32.field486 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class149.field2595[var3];
            class109 var5 = class16.field238[var4];
            int var6 = class196.field3351.method525((byte) -44, 1);
            if (var6 == 0) {
                class149.field2595[class32.field486++] = var4;
                var5.field1739 = class35.field576;
            } else {
                int var7 = class196.field3351.method525((byte) -82, 2);
                if (var7 == 0) {
                    class149.field2595[class32.field486++] = var4;
                    var5.field1739 = class35.field576;
                    class181.field3117[class184.field3154++] = var4;
                } else if (var7 == 1) {
                    class149.field2595[class32.field486++] = var4;
                    var5.field1739 = class35.field576;
                    int var8 = class196.field3351.method525((byte) -61, 3);
                    var5.method742(false, -62, var8);
                    int var9 = class196.field3351.method525((byte) -76, 1);
                    if (var9 == 1) {
                        class181.field3117[class184.field3154++] = var4;
                    }
                } else if (var7 == 2) {
                    class149.field2595[class32.field486++] = var4;
                    var5.field1739 = class35.field576;
                    int var10 = class196.field3351.method525((byte) -77, 3);
                    var5.method742(true, -105, var10);
                    int var11 = class196.field3351.method525((byte) -94, 3);
                    var5.method742(true, -94, var11);
                    int var12 = class196.field3351.method525((byte) -89, 1);
                    if (var12 == 1) {
                        class181.field3117[class184.field3154++] = var4;
                    }
                } else if (var7 == 3) {
                    class38.field633[class26.field424++] = var4;
                }
            }
        }
    }
}
