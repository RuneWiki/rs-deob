import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class189 {

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "[Z")
    public static boolean[] field3324 = new boolean[100];

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field3325 = 0;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field3326;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static final void method1299(int arg0) {
        class107.field1776.method1093((byte) 54);
        int var1 = class107.field1776.method1099((byte) 116, 8);
        field3322++;
        if (class197.field3514 > var1) {
            for (int var2 = var1; var2 < class197.field3514; var2++) {
                class54.field1012[class79.field1350++] = class256.field4542[var2];
            }
        }
        if (class197.field3514 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class197.field3514 = 0;
        for (int var3 = arg0; var3 < var1; var3++) {
            int var4 = class256.field4542[var3];
            class156 var5 = class115.field1901[var4];
            int var6 = class107.field1776.method1099((byte) 119, 1);
            if (var6 == 0) {
                class256.field4542[class197.field3514++] = var4;
                var5.field2992 = class135.field2267;
            } else {
                int var7 = class107.field1776.method1099((byte) 120, 2);
                if (var7 == 0) {
                    class256.field4542[class197.field3514++] = var4;
                    var5.field2992 = class135.field2267;
                    class18.field247[class90.field1460++] = var4;
                } else if (var7 == 1) {
                    class256.field4542[class197.field3514++] = var4;
                    var5.field2992 = class135.field2267;
                    int var8 = class107.field1776.method1099((byte) 125, 3);
                    var5.method1190(true, false, var8);
                    int var9 = class107.field1776.method1099((byte) 125, 1);
                    if (var9 == 1) {
                        class18.field247[class90.field1460++] = var4;
                    }
                } else if (var7 == 2) {
                    class256.field4542[class197.field3514++] = var4;
                    var5.field2992 = class135.field2267;
                    int var10 = class107.field1776.method1099((byte) 118, 3);
                    var5.method1190(true, true, var10);
                    int var11 = class107.field1776.method1099((byte) 115, 3);
                    var5.method1190(true, true, var11);
                    int var12 = class107.field1776.method1099((byte) 117, 1);
                    if (var12 == 1) {
                        class18.field247[class90.field1460++] = var4;
                    }
                } else if (var7 == 3) {
                    class54.field1012[class79.field1350++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
    public static void method1300(int arg0) {
        field3324 = null;
        int var1 = -18 % ((arg0 - 38) / 34);
    }
}
