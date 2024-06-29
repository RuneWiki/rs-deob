import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public abstract class class89 extends class443 {

    @OriginalMember(owner = "client!ow", name = "w", descriptor = "I")
    public int field1600;

    @OriginalMember(owner = "client!ow", name = "v", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1599 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ow", name = "x", descriptor = "Lbv;")
    public static class567 field1601;

    @OriginalMember(owner = "client!ow", name = "t", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!ow", name = "u", descriptor = "I")
    public static int field1598;

    static {
        new class567("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
        field1601 = new class567("Loaded HW3D", "HW3D geladen", "HW3D chargé", "HW3D carregado");
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(IIIIIZ)V", line = 3)
    public static final void method797(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1597++;
        long var6 = (long) ((arg5 ? Integer.MIN_VALUE : 0) | arg4);
        class217 var8 = (class217) class117.field1898.method740(arg0, var6);
        if (var8 == null) {
            var8 = new class217();
            class117.field1898.method737(var6, (byte) 92, var8);
        }
        if (var8.field3280.length <= arg3) {
            int[] var9 = new int[arg3 + 1];
            int[] var10 = new int[arg3 + 1];
            for (int var11 = 0; var11 < var8.field3280.length; var11++) {
                var9[var11] = var8.field3280[var11];
                var10[var11] = var8.field3277[var11];
            }
            for (int var12 = var8.field3280.length; var12 < arg3; var12++) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field3277 = var10;
            var8.field3280 = var9;
        }
        var8.field3280[arg3] = arg2;
        var8.field3277[arg3] = arg1;
    }

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "(Z)V", line = 56)
    public static void method799(boolean arg0) {
        field1599 = null;
        if (arg0) {
            field1601 = null;
        }
        field1601 = null;
    }

    @OriginalMember(owner = "client!ow", name = "c", descriptor = "(I)V", line = 68)
    public static final void method801(int arg0) {
        if (arg0 < 119) {
            method801(-2);
        }
        field1598++;
        class193.field2780.method178(false);
        class376.field5531 = 1;
        class69.field1309 = null;
    }

    @OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(I)V", line = 93)
    public class89(int arg0) {
        this.field1600 = arg0;
    }

    @OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method798(int arg0);

    @OriginalMember(owner = "client!ow", name = "b", descriptor = "(B)Z")
    public abstract boolean method800(byte arg0);
}
