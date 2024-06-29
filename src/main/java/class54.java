import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class54 extends IOException {

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "Ldc;")
    public static class302 field827 = new class302();

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!gea", name = "d", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 3)
    public class54(String arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIBI)V", line = 6)
    public static final void method323(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = -83 % ((-arg2 - 23) / 37);
        field826++;
        class453 var5 = class20.field383[arg0][arg1];
        class468.method2697(var5 == null ? class641.field9195 : var5, arg3, 125);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "([FII)[F", line = 18)
    public static final float[] method324(float[] arg0, int arg1, int arg2) {
        if (arg1 >= -18) {
            return null;
        } else {
            field829++;
            float[] var3 = new float[arg2];
            class667.method3741(arg0, 0, var3, 0, arg2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V", line = 39)
    public static final void method325(int arg0) {
        field828++;
        int var1 = class416.field6150;
        int[] var2 = class35.field554;
        if (arg0 != 828) {
            method324(null, 106, 90);
        }
        for (int var3 = 0; var3 < var1; var3++) {
            class71 var4 = class35.field551[var2[var3]];
            if (var4 != null) {
                class154.method1098(var4.method422((byte) -82), var4, (byte) 51);
            }
        }
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)V", line = 67)
    public static void method326(int arg0) {
        field827 = null;
        if (arg0 != 0) {
            method326(125);
        }
    }
}
