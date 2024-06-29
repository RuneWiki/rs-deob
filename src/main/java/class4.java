import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public abstract class class4 extends class225 {

    @OriginalMember(owner = "client!vd", name = "G", descriptor = "Z")
    public volatile boolean field50 = true;

    @OriginalMember(owner = "client!vd", name = "z", descriptor = "I")
    public static int field43 = 0;

    @OriginalMember(owner = "client!vd", name = "x", descriptor = "[I")
    public static int[] field41 = new int[2500];

    @OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
    public static int field45 = -60;

    @OriginalMember(owner = "client!vd", name = "C", descriptor = "[I")
    public static int[] field46 = new int[14];

    @OriginalMember(owner = "client!vd", name = "H", descriptor = "[I")
    public static int[] field51 = new int[500];

    @OriginalMember(owner = "client!vd", name = "y", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!vd", name = "D", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!vd", name = "w", descriptor = "Z")
    public boolean field40;

    @OriginalMember(owner = "client!vd", name = "F", descriptor = "Z")
    public boolean field49;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(B)V", line = 4)
    public static final void method26(byte arg0) {
        field48++;
        class363.field5246 = new class212(class218.field2884, "", class71.field995, 1009, 0L, 0, 0);
        if (arg0 != 82) {
            method28((byte) -14);
        }
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(B)V", line = 19)
    public static void method28(byte arg0) {
        field51 = null;
        field41 = null;
        field46 = null;
        if (arg0 > -116) {
            field41 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZLlm;)V", line = 36)
    public static final void method29(boolean arg0, class347 arg1) {
        class17.field250 = arg1;
        if (!arg0) {
            method31(16, 62);
        }
        field42++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 60)
    public static final void method30(int arg0, Component arg1) {
        field44++;
        if (arg0 != -28172) {
            return;
        }
        Method var2 = class36.field522;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class445.field6523);
        arg1.addFocusListener(class445.field6523);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V", line = 83)
    public static final void method31(int arg0, int arg1) {
        class189 var2 = class263.field3816;
        synchronized (class263.field3816) {
            class263.field3816.method1142((byte) -82, arg0);
        }
        if (arg1 != 0) {
            field45 = 54;
        }
        field47++;
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)[B")
    public abstract byte[] method25(int arg0);

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(B)I")
    public abstract int method27(byte arg0);
}
