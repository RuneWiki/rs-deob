import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public abstract class class364 extends class22 {

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
    public int field4942;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
    public int field4940;

    @OriginalMember(owner = "client!qo", name = "z", descriptor = "I")
    public int field4953;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
    public int field4948;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "I")
    public int field4938;

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "I")
    public int field4949;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    public int field4944;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4945 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!qo", name = "y", descriptor = "Lkb;")
    public static class122 field4952 = class281.method1771(-51);

    @OriginalMember(owner = "client!qo", name = "B", descriptor = "I")
    public static int field4955 = 0;

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!qo", name = "A", descriptor = "I")
    public static int field4954;

    @OriginalMember(owner = "client!qo", name = "w", descriptor = "Lwo;")
    public static class285 field4950;

    @OriginalMember(owner = "client!qo", name = "x", descriptor = "Lwo;")
    public static class285 field4951;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILbg;B)Ljava/lang/String;")
    public static final String method2283(int arg0, class242 arg1, byte arg2) {
        field4947++;
        try {
            int var3 = arg1.method1559((byte) -126);
            if (arg0 < var3) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg1.field3211 += class146.field1722.method1003(true, arg1.field3211, var4, 0, var3, arg1.field3188);
            String var5 = class296.method1883(-125, var4, var3, 0);
            if (arg2 < 62) {
                method2283(-102, (class242) null, (byte) -59);
            }
            return var5;
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZIIFIIZ)[I")
    public static final int[] method2284(int arg0, boolean arg1, int arg2, int arg3, float arg4, int arg5, int arg6, boolean arg7) {
        field4946++;
        int[] var8 = new int[arg2];
        class421 var9 = new class421();
        var9.field5760 = (int) (arg4 * 4096.0F);
        if (arg7) {
            return null;
        }
        var9.field5768 = arg0;
        var9.field5772 = arg1;
        var9.field5774 = arg3;
        var9.field5771 = arg6;
        var9.field5765 = arg5;
        var9.method280(96);
        class32.method210((byte) 62, arg2, 1);
        var9.method2580(var8, (byte) 71, 0);
        return var8;
    }

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "(I)V")
    public final void method140(int arg0) {
        if (arg0 < -24) {
            field4941++;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Luo;IIIZBLpc;)V")
    public final void method137(class118 arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, class22 arg6) {
        field4943++;
        if (arg5 > -115) {
            this.field4940 = -72;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "(I)Z")
    public final boolean method129(int arg0) {
        field4939++;
        if (arg0 != 3652) {
            method2285(true);
        }
        return false;
    }

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "(I)I")
    public abstract int method414(int arg0);

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)V")
    public static void method2285(boolean arg0) {
        field4951 = null;
        field4950 = null;
        field4945 = null;
        field4952 = null;
        if (!arg0) {
            field4951 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(IIIIIII)V")
    public class364(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4942 = arg5;
        this.field4940 = arg6;
        this.field4953 = arg2;
        this.field4948 = arg0;
        this.field4938 = arg3;
        this.field4949 = arg4;
        this.field4944 = arg1;
    }

    static {
        new class72("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
    }
}
