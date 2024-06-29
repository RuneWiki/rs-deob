import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class32 {

    @OriginalMember(owner = "client!na", name = "c", descriptor = "Z")
    public static boolean field464 = true;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "Ljava/lang/String;")
    public static String field465 = "Hidden";

    @OriginalMember(owner = "client!na", name = "a", descriptor = "[Z")
    public static boolean[] field462 = new boolean[200];

    @OriginalMember(owner = "client!na", name = "g", descriptor = "Ltk;")
    public static class53 field468 = new class53();

    @OriginalMember(owner = "client!na", name = "j", descriptor = "[I")
    public static int[] field471 = new int[100];

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILrf;III)V")
    public static final void method208(int arg0, class289 arg1, int arg2, int arg3, int arg4) {
        if (class214.field3211 >= 3) {
            class111.method712(arg2, arg0, 0, arg1.field4417, arg1.field4427);
        } else {
            ((class201) class79.field1270).method1281(arg2, arg0, arg1.field4478, arg1.field4444, class79.field1270.field3473 / 2, class79.field1270.field3464 / 2, (int) class84.field1336, 256, arg1.field4417, arg1.field4427);
        }
        field466++;
        int var5 = -105 % ((-arg3 - 27) / 56);
        class1.field16[arg4] = true;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ZI)V")
    public static final void method209(boolean arg0, int arg1) {
        class203.field3064.method1780(arg1, true);
        field463++;
        class210.field3160.method1780(arg1, arg0);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V")
    public static void method210(int arg0) {
        field462 = null;
        field465 = null;
        field471 = null;
        field468 = null;
        if (arg0 != -4) {
            method208(80, (class289) null, 18, 61, 72);
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public static final void method211(int arg0) {
        field469++;
        if (arg0 > 118) {
            class97.field1526.method1775(27147);
            class46.field751.method1775(27147);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(III)Lmb;")
    public static final class162 method212(int arg0, int arg1, int arg2) {
        class270 var3 = class33.field487[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class162 var4 = var3.field4084;
            var3.field4084 = null;
            return var4;
        }
    }
}
