import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public abstract class class181 {

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "I")
    public static int field2222 = 0;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field2220;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)[Log;", line = 3)
    public static final class599[] method1123(int arg0) {
        field2219++;
        if (arg0 >= -24) {
            field2220 = null;
        }
        return new class599[] { class435.field6237, class591.field8561, class337.field4473 };
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(BLjn;)V", line = 14)
    public static final void method1124(byte arg0, class668 arg1) {
        field2221++;
        class589.field8540 = arg1.method3804((byte) 104, "hitmarks");
        class7.field75 = arg1.method3804((byte) 117, "hitbar_default");
        class630.field9023 = arg1.method3804((byte) 83, "timerbar_default");
        class244.field3332 = arg1.method3804((byte) 106, "headicons_pk");
        class499.field6978 = arg1.method3804((byte) 116, "headicons_prayer");
        if (arg0 >= -70) {
            return;
        }
        class359.field4785 = arg1.method3804((byte) 115, "hint_headicons");
        class137.field1739 = arg1.method3804((byte) 114, "hint_mapmarkers");
        class320.field4214 = arg1.method3804((byte) 78, "mapflag");
        class427.field6131 = arg1.method3804((byte) 105, "cross");
        class512.field7511 = arg1.method3804((byte) 73, "mapdots");
        class533.field7784 = arg1.method3804((byte) 98, "scrollbar");
        class610.field8748 = arg1.method3804((byte) 125, "name_icons");
        class182.field2224 = arg1.method3804((byte) 109, "floorshadows");
        class66.field1030 = arg1.method3804((byte) 91, "compass");
        class357.field4764 = arg1.method3804((byte) 102, "otherlevel");
        class155.field1897 = arg1.method3804((byte) 109, "hint_mapedge");
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIIIIIIII)V", line = 41)
    public static final void method1125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -70 % ((arg5 - 37) / 46);
        class658.method3726(arg3, (byte) 113, arg8, arg6, arg4, arg7, arg0, 0, arg2, arg1);
        field2223++;
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)V", line = 52)
    public static void method1126(int arg0) {
        if (arg0 < 126) {
            field2220 = null;
        }
        field2220 = null;
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(FFIIFIIIFI[F)V")
    public abstract void method800(float arg0, float arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7, float arg8, int arg9, float[] arg10);
}
