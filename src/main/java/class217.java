import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class217 extends class321 {

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "Lcca;")
    public class644 field2895;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "Liba;")
    public static class211 field2896 = new class211(59, 7);

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "I")
    public static int field2899 = 0;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "I")
    public static int field2897;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)V", line = 5)
    public static void method1370(int arg0) {
        field2896 = null;
        if (arg0 != 50) {
            field2899 = 61;
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "(Lcca;)V", line = 15)
    public class217(class644 arg0) {
        this.field2895 = arg0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)Z", line = 24)
    public static final boolean method1371(byte arg0) {
        field2897++;
        try {
            return arg0 >= -39 ? false : class502.method2865(-65536);
        } catch (IOException var4) {
            class102.method728((byte) -106);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class617.field8919 == null ? -1 : class617.field8919.method3585((byte) 54)) + "," + (class160.field2275 == null ? -1 : class160.field2275.method3585((byte) 66)) + "," + (class334.field4862 == null ? -1 : class334.field4862.method3585((byte) 111)) + " - " + class297.field4376 + "," + (class321.field4681.field7430[0] + class397.field6005) + "," + (class321.field4681.field7429[0] + class403.field6049) + " - ";
            for (int var3 = 0; var3 < class297.field4376 && var3 < 50; var3++) {
                var2 = var2 + class389.field5816.field7952[var3] + ",";
            }
            class118.method869(var5, (byte) -128, var2);
            class65.method395(false, -58);
            return true;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IBIII)V", line = 59)
    public static final void method1372(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field2894++;
        class654 var5 = class149.method1067(93);
        var5.field9358.method3110(class196.field2683.field9823, 60);
        var5.field9358.method3110(arg4, 33);
        var5.field9358.method3110(arg2, 34);
        var5.field9358.method3162(-2003712696, arg0);
        if (arg1 <= 33) {
            method1372(108, (byte) -126, -77, 113, -57);
        }
        var5.field9358.method3162(-2003712696, arg3);
        class444.method2623(116, var5);
        class43.field622 = -3;
        class622.field8997 = 0;
        class399.field6018 = 0;
        class175.field2458 = 1;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BII)Z", line = 83)
    public static final boolean method1373(byte arg0, int arg1, int arg2) {
        field2898++;
        if (arg0 == -69) {
            return (arg2 & 0x400) != 0;
        } else {
            return false;
        }
    }
}
