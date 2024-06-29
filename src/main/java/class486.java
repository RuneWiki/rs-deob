import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public abstract class class486 extends class454 {

    @OriginalMember(owner = "client!vfa", name = "G", descriptor = "I")
    public int field6698;

    @OriginalMember(owner = "client!vfa", name = "A", descriptor = "I")
    public static int field6692 = 0;

    @OriginalMember(owner = "client!vfa", name = "D", descriptor = "[I")
    public static int[] field6695 = new int[2];

    @OriginalMember(owner = "client!vfa", name = "E", descriptor = "I")
    public static int field6696 = 0;

    @OriginalMember(owner = "client!vfa", name = "F", descriptor = "Lsi;")
    public static class769 field6697 = new class769(64);

    @OriginalMember(owner = "client!vfa", name = "B", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!vfa", name = "C", descriptor = "I")
    public static int field6694;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIIIIIIZII)Z", line = 13)
    public static final boolean method2855(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        field6693++;
        if (!class639.method3632(arg6, arg4, (byte) 110, arg1)) {
            return false;
        }
        int var10 = class426.field5916[2];
        int var11 = class426.field5916[1];
        int var12 = class426.field5916[0];
        if (!class639.method3632(arg0, arg9, (byte) 94, arg8)) {
            return false;
        }
        int var13 = class426.field5916[2];
        int var14 = class426.field5916[1];
        int var15 = class426.field5916[0];
        if (!class639.method3632(arg5, arg2, (byte) 92, arg3)) {
            return false;
        } else if (arg7) {
            return true;
        } else {
            int var16 = class426.field5916[0];
            int var17 = class426.field5916[2];
            int var18 = class426.field5916[1];
            return class460.method2688(var13, var14, true, var18, var16, var17, var11, var15, var10, var12);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)V", line = 47)
    public static void method2856(int arg0) {
        field6697 = null;
        field6695 = null;
        if (arg0 != 0) {
            method2855(-60, -67, -2, -125, 110, 3, 47, false, 18, 68);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 61)
    public static final String method2857(byte arg0, String arg1, String arg2, String arg3) {
        field6694++;
        for (int var4 = arg3.indexOf(arg1); var4 != -1; var4 = arg3.indexOf(arg1, arg2.length() + var4)) {
            arg3 = arg3.substring(0, var4) + arg2 + arg3.substring(var4 + arg1.length());
        }
        if (arg0 > -68) {
            method2856(-109);
        }
        return arg3;
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(I)V", line = 87)
    public class486(int arg0) {
        this.field6698 = arg0;
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method2642(byte arg0);

    @OriginalMember(owner = "client!vfa", name = "h", descriptor = "(I)Z")
    public abstract boolean method2643(int arg0);
}
