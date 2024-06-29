import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class713 extends class411 {

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "I")
    public int field9398 = (int) (class502.method2786(-7114) / 1000L);

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "Ljava/lang/String;")
    public String field9401;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "S")
    public short field9399;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "J")
    public static long field9400 = 0L;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "Luw;")
    public static class208 field9396 = new class208(109, 7);

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field9397;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V", line = 15)
    public static void method3841(int arg0) {
        if (arg0 != 20705) {
            field9400 = -22L;
        }
        field9396 = null;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 24)
    public class713(String arg0, int arg1) {
        this.field9401 = arg0;
        this.field9399 = (short) arg1;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIIIIII)V", line = 38)
    public static final void method3842(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9397++;
        int var8 = class774.method4226(class80.field1131, (byte) -43, class405.field5375, arg5);
        int var9 = class774.method4226(class80.field1131, (byte) -106, class405.field5375, arg2);
        int var10 = class774.method4226(class498.field6390, (byte) -71, class30.field274, arg7);
        if (arg1 != 7) {
            return;
        }
        int var11 = class774.method4226(class498.field6390, (byte) -111, class30.field274, arg4);
        int var12 = class774.method4226(class80.field1131, (byte) -68, class405.field5375, arg0 + arg5);
        int var13 = class774.method4226(class80.field1131, (byte) -27, class405.field5375, arg2 - arg0);
        for (int var14 = var8; var14 < var12; var14++) {
            class54.method333(var11, class207.field2840[var14], 7, var10, arg3);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class54.method333(var11, class207.field2840[var15], 7, var10, arg3);
        }
        int var16 = class774.method4226(class498.field6390, (byte) -49, class30.field274, arg0 + arg7);
        int var17 = class774.method4226(class498.field6390, (byte) -43, class30.field274, arg4 - arg0);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class207.field2840[var18];
            class54.method333(var16, var19, 7, var10, arg3);
            class54.method333(var17, var19, arg1, var16, arg6);
            class54.method333(var11, var19, 7, var17, arg3);
        }
    }
}
