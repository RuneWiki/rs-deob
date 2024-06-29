import java.io.FileOutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class26 extends class262 {

    @OriginalMember(owner = "client!qaa", name = "n", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!qaa", name = "o", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!qaa", name = "p", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!qaa", name = "q", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!qaa", name = "r", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!qaa", name = "s", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!qaa", name = "t", descriptor = "Ljava/io/FileOutputStream;")
    public static FileOutputStream field602;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILoa;B)V", line = 4)
    public final void method371(int arg0, class644 arg1, byte arg2) {
        ++field597;
        super.field3601.method2316((byte) 122, arg1);
        if (arg2 >= 80) {
            super.field3601.method2362(arg0, false);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "<init>", descriptor = "(Lifa;)V", line = 16)
    public class26(class393 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZI)V", line = 23)
    public final void method372(boolean arg0, int arg1) {
        if (arg1 == 0) {
            ++field596;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IZI)V", line = 33)
    public final void method373(int arg0, boolean arg1, int arg2) {
        ++field598;
        if (!arg1) {
            field602 = null;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "(I)V", line = 43)
    public final void method374(int arg0) {
        super.field3601.method2370(false, -57);
        ++field601;
        if (arg0 < 42) {
            field602 = null;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)Z", line = 54)
    public final boolean method375(int arg0) {
        ++field600;
        if (arg0 != -18095) {
            this.method377(-34, false);
        }
        return true;
    }

    @OriginalMember(owner = "client!qaa", name = "h", descriptor = "(I)V", line = 65)
    public static void method376(int arg0) {
        field602 = null;
        int var1 = -77 % ((arg0 - 60) / 55);
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(IZ)V", line = 75)
    public final void method377(int arg0, boolean arg1) {
        super.field3601.method2370(true, -58);
        ++field599;
        if (arg0 < 37) {
            field602 = null;
        }
    }
}
