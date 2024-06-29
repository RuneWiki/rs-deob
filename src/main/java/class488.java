import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class488 {

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "Z")
    public static boolean field6975 = false;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)V", line = 6)
    public static final void method2941(int arg0, int arg1) {
        class691 var2 = class638.field9170[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class691 var4 = class638.field9170[var3][arg0][arg1] = class638.field9170[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class398 var5 = var4.field9739; var5 != null; var5 = var5.field5451) {
                    class340 var6 = var5.field5449;
                    if (var6.field4395 == arg0 && var6.field4387 == arg1) {
                        var6.field4628--;
                    }
                }
                if (var4.field9736 != null) {
                    var4.field9736.field4628--;
                }
                if (var4.field9728 != null) {
                    var4.field9728.field4628--;
                }
                if (var4.field9725 != null) {
                    var4.field9725.field4628--;
                }
                if (var4.field9731 != null) {
                    var4.field9731.field4628--;
                }
                if (var4.field9735 != null) {
                    var4.field9735.field4628--;
                }
            }
        }
        if (class638.field9170[0][arg0][arg1] == null) {
            class638.field9170[0][arg0][arg1] = new class691(0);
            class638.field9170[0][arg0][arg1].field9727 = 1;
        }
        class638.field9170[0][arg0][arg1].field9737 = var2;
        class638.field9170[3][arg0][arg1] = null;
    }
}
