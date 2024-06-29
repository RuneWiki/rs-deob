import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class683 extends class446 implements class448 {

    @OriginalMember(owner = "client!cm", name = "C", descriptor = "Ldb;")
    public static class298 field9611 = new class298(19, -1);

    @OriginalMember(owner = "client!cm", name = "F", descriptor = "Lcu;")
    public static class206 field9613 = new class206(49, 3);

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "I")
    public static int field9616 = -1;

    @OriginalMember(owner = "client!cm", name = "x", descriptor = "I")
    public static int field9606;

    @OriginalMember(owner = "client!cm", name = "y", descriptor = "I")
    public static int field9607;

    @OriginalMember(owner = "client!cm", name = "z", descriptor = "I")
    public static int field9608;

    @OriginalMember(owner = "client!cm", name = "A", descriptor = "I")
    public static int field9609;

    @OriginalMember(owner = "client!cm", name = "B", descriptor = "I")
    public static int field9610;

    @OriginalMember(owner = "client!cm", name = "D", descriptor = "I")
    public static int field9612;

    @OriginalMember(owner = "client!cm", name = "G", descriptor = "I")
    public static int field9614;

    @OriginalMember(owner = "client!cm", name = "H", descriptor = "I")
    public static int field9615;

    @OriginalMember(owner = "client!cm", name = "J", descriptor = "[Lxa;")
    public static class468[] field9617;

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(I)I")
    public final int method1656(int arg0) {
        if (arg0 != -15151) {
            this.method24((byte) 122);
        }
        field9610++;
        return super.method1656(arg0);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BIILjaclib/memory/Source;)Z")
    public final boolean method2521(byte arg0, int arg1, int arg2, Source arg3) {
        field9606++;
        if (arg0 != -61) {
            field9611 = null;
        }
        super.method2513(arg2, arg3, 126);
        return true;
    }

    @OriginalMember(owner = "client!cm", name = "b", descriptor = "(B)Lrq;")
    public static final class325 method3805(byte arg0) {
        if (arg0 >= -76) {
            method3805((byte) -2);
        }
        field9614++;
        try {
            return (class325) Class.forName("dh").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(I)Z")
    public final boolean method28(int arg0) {
        field9608++;
        return arg0 == 11390 ? super.method28(arg0) : false;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V")
    public final void method24(byte arg0) {
        super.method24(arg0);
        field9612++;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILoa;)V")
    public static final void method3806(int arg0, class651 arg1) {
        field9615++;
        int var2 = -102 / ((arg0 - 82) / 41);
        if (class664.field9427) {
            class458.method2612(arg1, (byte) 115);
        } else {
            class101.method774(16, arg1);
        }
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(III)Z")
    public final boolean method2520(int arg0, int arg1, int arg2) {
        if (arg0 == -5368) {
            field9609++;
            super.method26(-24955, arg2);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cm", name = "c", descriptor = "(Z)V")
    public static void method3807(boolean arg0) {
        field9617 = null;
        field9613 = null;
        field9611 = null;
        if (!arg0) {
            field9617 = null;
        }
    }

    @OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Ldc;Z)V")
    public class683(class5 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;")
    public final Buffer method27(byte arg0, boolean arg1) {
        if (arg0 != -64) {
            field9611 = null;
        }
        field9607++;
        return super.method27((byte) -64, arg1);
    }
}
