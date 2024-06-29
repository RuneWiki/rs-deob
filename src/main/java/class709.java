import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class709 {

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "F")
    public static float field9832;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public static int field9833;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B[[F[[S)[[S")
    public static final short[][] method3993(byte arg0, float[][] arg1, short[][] arg2) {
        field9833++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            for (int var4 = 0; var4 < arg2[var3].length; var4++) {
                arg2[var3][var4] = (short) ((int) (arg1[var3][var4] * 16383.0F));
            }
        }
        if (arg0 > -47) {
            field9832 = 0.88127095F;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method3994(int arg0, int arg1, int arg2, Class arg3) {
        class472 var4 = class59.field688[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class44 var5 = var4.field6551; var5 != null; var5 = var5.field466) {
            class253 var6 = var5.field465;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field3745 == arg1 && var6.field3758 == arg2) {
                class783.method4304(var6, false);
                return;
            }
        }
    }
}
