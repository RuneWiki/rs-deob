import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public abstract class class112 extends class125 {

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIII)Lcd;", line = 6)
    public static final class86 method664(int arg0, int arg1, int arg2, int arg3) {
        field1414++;
        class415 var4 = class526.field7777[arg3][arg1][arg2];
        if (arg0 != -19950) {
            field1413 = -107;
        }
        if (var4 == null) {
            return null;
        }
        class86 var5 = null;
        int var6 = -1;
        for (class639 var7 = var4.field5981; var7 != null; var7 = var7.field9291) {
            class237 var8 = var7.field9288;
            if (var8 instanceof class86) {
                class86 var9 = (class86) var8;
                int var10 = (var9.method514(0) * 64 - 64) + 60;
                int var11 = var9.field3464 - var10 >> 7;
                int var12 = var9.field3463 - var10 >> 7;
                int var13 = var9.field3464 + var10 >> 7;
                int var14 = var9.field3463 + var10 >> 7;
                if (var11 <= arg1 && arg2 >= var12 && arg1 <= var13 && var14 >= arg2) {
                    int var15 = (var13 + 1 - arg1) * (var14 + 1 - arg2);
                    if (var6 < var15) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)Lbo;")
    public abstract class227 method665(byte arg0);
}
