import java.awt.Canvas;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sea")
public class class646 implements class46 {

    @OriginalMember(owner = "client!sea", name = "i", descriptor = "Lpe;")
    public class564 field9196;

    @OriginalMember(owner = "client!sea", name = "f", descriptor = "I")
    public int field9193;

    @OriginalMember(owner = "client!sea", name = "e", descriptor = "I")
    public int field9192;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "Lop;")
    public class172 field9188;

    @OriginalMember(owner = "client!sea", name = "k", descriptor = "I")
    public int field9198;

    @OriginalMember(owner = "client!sea", name = "h", descriptor = "Z")
    public static boolean field9195 = false;

    @OriginalMember(owner = "client!sea", name = "d", descriptor = "I")
    public static int field9191;

    @OriginalMember(owner = "client!sea", name = "g", descriptor = "I")
    public static int field9194;

    @OriginalMember(owner = "client!sea", name = "j", descriptor = "I")
    public static int field9197;

    @OriginalMember(owner = "client!sea", name = "c", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field9190;

    @OriginalMember(owner = "client!sea", name = "b", descriptor = "Ljava/awt/Frame;")
    public static Frame field9189;

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(I)V")
    public static void method3659(int arg0) {
        field9189 = null;
        field9190 = null;
        if (arg0 != 0) {
            field9195 = true;
        }
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "(B)Lsq;")
    public class161 method448(byte arg0) {
        field9194++;
        if (arg0 != 25) {
            method3659(116);
        }
        return class299.field4031;
    }

    @OriginalMember(owner = "client!sea", name = "a", descriptor = "([JB[I)V")
    public static final void method3660(long[] arg0, byte arg1, int[] arg2) {
        field9197++;
        class163.method1031(arg0, 0, arg2, arg0.length - 1, 1);
        if (arg1 > -104) {
            method3659(-1);
        }
    }

    @OriginalMember(owner = "client!sea", name = "<init>", descriptor = "(ILpe;Lop;II)V")
    public class646(int arg0, class564 arg1, class172 arg2, int arg3, int arg4) {
        this.field9196 = arg1;
        this.field9193 = arg0;
        this.field9192 = arg3;
        this.field9188 = arg2;
        this.field9198 = arg4;
    }
}
