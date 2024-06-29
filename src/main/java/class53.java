import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class53 {

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field749 = 0;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "[S")
    public static short[] field748 = new short[500];

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field751 = 0;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "[Lph;")
    public static class229[] field752 = new class229[100];

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V", line = 6)
    public static void method361(boolean arg0) {
        field748 = null;
        field752 = null;
        if (arg0) {
            method361(false);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)Lwa;", line = 23)
    public static final class312 method362(byte arg0, int arg1) {
        field755++;
        class312 var2 = (class312) class294.field4803.method1413((long) arg1, true);
        int var3 = -47 % ((arg0 - 58) / 41);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class219.field3602.method523(-18, class296.method2003((byte) 106, arg1), class304.method2054((byte) 126, arg1));
        class312 var5 = new class312();
        if (var4 != null) {
            var5.method2110(104, new class164(var4));
        }
        var5.method2115(true);
        class294.field4803.method1419((long) arg1, 5216, var5);
        return var5;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIIII)V", line = 59)
    public static final void method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field753++;
        int var8 = -85 / ((45 - arg4) / 58);
        if (arg2 == arg3) {
            class93.method699(arg1, -22594, arg3, arg7, arg5, arg0, arg6);
        } else if (arg6 - arg3 >= class192.field3172 && (arg3 + arg6) <= class77.field1289 && class206.field3398 <= (arg0 - arg2) && class214.field3533 >= arg0 + arg2) {
            class203.method1421(arg2, -126, arg7, arg5, arg0, arg3, arg6, arg1);
        } else {
            class69.method541(arg6, arg7, arg0, arg3, arg2, arg5, arg1, 112);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 91)
    public static final void method364(int arg0) {
        field756++;
        if (class110.field1870 != null) {
            class110.field1870.method668(0);
        }
        if (arg0 != 14874) {
            field748 = (short[]) null;
        }
        if (class307.field5177 != null) {
            class307.field5177.method668(arg0 - 14874);
        }
    }
}
