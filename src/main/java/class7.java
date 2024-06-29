import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class7 {

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field72 = 0;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "Z")
    public static boolean field77 = true;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "Lnha;")
    public static class501 field76 = new class501("", 16);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public int field70;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public int field74;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public int field75;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method31(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class518.field7293 = arg3;
        class185.field2425 = arg4;
        class223.field2943 = arg5;
        class692.field9814 = arg6;
        field71++;
        class274.field3466 = arg2;
        if (arg0 && class185.field2425 >= 100) {
            class505.field7134 = class274.field3466 * 512 + 256;
            class407.field5744 = class692.field9814 * 512 + 256;
            class524.field7412 = class592.method3287(false, class407.field5744, class223.field2946, class505.field7134) - class518.field7293;
        }
        class276.field3497 = 2;
        if (arg1 == 256) {
            class335.field4311 = -1;
            class147.field1783 = -1;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method32(int arg0, String arg1) {
        field73++;
        if (arg0 != 28497) {
            return null;
        }
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg1.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg1.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
    public static void method33(boolean arg0) {
        if (arg0) {
            field76 = null;
        }
    }
}
