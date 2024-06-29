import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class697 extends class186 {

    @OriginalMember(owner = "client!gfa", name = "F", descriptor = "I")
    public static int field9900 = 0;

    @OriginalMember(owner = "client!gfa", name = "B", descriptor = "I")
    public static int field9896;

    @OriginalMember(owner = "client!gfa", name = "C", descriptor = "I")
    public static int field9897;

    @OriginalMember(owner = "client!gfa", name = "D", descriptor = "I")
    public static int field9898;

    @OriginalMember(owner = "client!gfa", name = "E", descriptor = "Lsea;")
    public static class648 field9899;

    @OriginalMember(owner = "client!gfa", name = "i", descriptor = "(I)V")
    public static void method3911(int arg0) {
        field9899 = null;
        if (arg0 != 0) {
            field9900 = 97;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
    public static final Object method3912(byte[] arg0, int arg1, boolean arg2) {
        ++field9896;
        if (arg0 == null) {
            return null;
        } else {
            if (arg0.length > 136 && !class416.field5869) {
                try {
                    class59 var3 = (class59) Class.forName("kca").newInstance();
                    var3.method492(arg0, -7435);
                    return var3;
                } catch (Throwable var4) {
                    class416.field5869 = true;
                }
            }
            if (arg1 != 0) {
                method3911(43);
            }
            return !arg2 ? arg0 : class611.method3425(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(IIIIIF)V")
    public class697(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIIB)V")
    public final void method74(int arg0, int arg1, int arg2, byte arg3) {
        ++field9897;
        int var5 = -51 / ((arg3 - 20) / 57);
        super.field2708 = arg1;
        super.field2701 = arg0;
        super.field2699 = arg2;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(FB)V")
    public final void method73(float arg0, byte arg1) {
        if (arg1 == -111) {
            super.field2703 = arg0;
            ++field9898;
        }
    }
}
