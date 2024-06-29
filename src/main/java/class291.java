import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class291 {

    @OriginalMember(owner = "client!es", name = "c", descriptor = "[S")
    public static short[] field3955 = new short[256];

    @OriginalMember(owner = "client!es", name = "d", descriptor = "Lph;")
    public static class114 field3956 = new class114(50);

    @OriginalMember(owner = "client!es", name = "g", descriptor = "Lbq;")
    public static class51 field3959 = new class51();

    @OriginalMember(owner = "client!es", name = "a", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!es", name = "h", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!es", name = "i", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!es", name = "e", descriptor = "Lwm;")
    public static class298 field3957;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "Llh;")
    public static class450 field3958;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IZ)V")
    public static final void method1717(int arg0, boolean arg1) {
        field3953++;
        for (class319 var2 = (class319) class98.field1158.method814((byte) 90); var2 != null; var2 = (class319) class98.field1158.method827(31)) {
            if (var2.field4246 != null) {
                class374.field5265.method2213(var2.field4246);
                var2.field4246 = null;
            }
            if (var2.field4265 != null) {
                class374.field5265.method2213(var2.field4265);
                var2.field4265 = null;
            }
            var2.method1967(-1);
        }
        if (arg0 >= -95 || !arg1) {
            return;
        }
        for (class319 var3 = (class319) class296.field4034.method814((byte) 90); var3 != null; var3 = (class319) class296.field4034.method827(-127)) {
            if (var3.field4246 != null) {
                class374.field5265.method2213(var3.field4246);
                var3.field4246 = null;
            }
            var3.method1967(-1);
        }
        for (class319 var4 = (class319) class420.field6128.method315((byte) -88); var4 != null; var4 = (class319) class420.field6128.method310(-70)) {
            if (var4.field4246 != null) {
                class374.field5265.method2213(var4.field4246);
                var4.field4246 = null;
            }
            var4.method1967(-1);
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V")
    public static void method1718(int arg0) {
        field3959 = null;
        field3955 = null;
        field3956 = null;
        field3957 = null;
        field3958 = null;
        if (arg0 != 1) {
            field3956 = null;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "([IIII[Ljava/lang/Object;)V")
    public static final void method1719(int[] arg0, int arg1, int arg2, int arg3, Object[] arg4) {
        if (arg2 < arg3) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg2;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var7;
            Object var8 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var8;
            for (int var9 = arg2; var9 < arg3; var9++) {
                if (((var9 & 0x1) + var7) > arg0[var9]) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    Object var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg0[arg3] = arg0[var6];
            arg0[var6] = var7;
            arg4[arg3] = arg4[var6];
            arg4[var6] = var8;
            method1719(arg0, -10382, arg2, var6 - 1, arg4);
            method1719(arg0, -10382, var6 + 1, arg3, arg4);
        }
        if (arg1 == -10382) {
            field3954++;
        }
    }
}
