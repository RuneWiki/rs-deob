import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class226 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "Lea;")
    public static class474 field3178 = new class474("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    public static void method1472(int arg0) {
        if (arg0 != -20691) {
            field3178 = null;
        }
        field3178 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIILjava/lang/Class;)Lada;")
    public static final class144 method1473(int arg0, int arg1, int arg2, Class arg3) {
        class99 var4 = class431.field6408[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class104 var5 = var4.field1167; var5 != null; var5 = var5.field1251) {
            class144 var6 = var5.field1253;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field1773 == arg1 && var6.field1758 == arg2) {
                return var6;
            }
        }
        return null;
    }
}
