import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class321 implements class420 {

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public int field4439;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "Lvt;")
    public static class344 field4436 = new class344("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field4442 = new String[100];

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "Luv;")
    public static class3 field4441 = new class3(1, 15);

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field4438;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "Lov;")
    public static class346 field4440;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(FIFIIII[FBII)V")
    public static final void method2000(float arg0, int arg1, float arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, byte arg8, int arg9, int arg10) {
        int var11 = -104 % ((arg8 + 78) / 46);
        int var12 = arg4 - arg5;
        field4438++;
        int var13 = arg9 - arg1;
        int var14 = arg10 - arg6;
        float var15 = arg7[2] * (float) var14 + arg7[0] * (float) var13 + arg7[1] * (float) var12;
        float var16 = arg7[5] * (float) var14 + arg7[4] * (float) var12 + arg7[3] * (float) var13;
        float var17 = arg7[8] * (float) var14 + arg7[6] * (float) var13 + arg7[7] * (float) var12;
        float var18 = (float) Math.atan2((double) var15, (double) var17) / 6.2831855F + 0.5F;
        if (arg2 != 1.0F) {
            var18 = arg2 * var18;
        }
        float var19 = var16 + arg0 + 0.5F;
        if (arg3 == 1) {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        } else if (arg3 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg3 == 3) {
            float var20 = var18;
            var18 = var19;
            var19 = -var20;
        }
        class331.field4580 = var18;
        class125.field1557 = var19;
    }

    @OriginalMember(owner = "client!dh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4437++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)V")
    public static void method2001(boolean arg0) {
        field4442 = null;
        field4441 = null;
        field4436 = null;
        if (!arg0) {
            field4442 = null;
        }
        field4440 = null;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class321(String arg0, int arg1) {
        this.field4439 = arg1;
    }
}
