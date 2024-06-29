import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class40 {

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "Lqk;")
    private class202 field907 = new class202();

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "Loh;")
    public static class263 field906 = class253.method1681(-118, "");

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "Z")
    public static boolean field897 = false;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "Lqk;")
    private class202 field908;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)Lqk;")
    public final class202 method250(int arg0) {
        field899++;
        class202 var2 = this.field907.field3644;
        if (this.field907 == var2) {
            this.field908 = null;
            return null;
        }
        this.field908 = var2.field3644;
        if (arg0 != 0) {
            field897 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)Lqk;")
    public final class202 method251(byte arg0) {
        field903++;
        class202 var2 = this.field908;
        int var3 = 126 % ((60 - arg0) / 54);
        if (this.field907 == var2) {
            this.field908 = null;
            return null;
        } else {
            this.field908 = var2.field3644;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIBI)V")
    public static final void method252(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 < 110) {
            method258(true);
        }
        field902++;
        if (class51.field1099 <= arg0 && arg1 <= class198.field3587 && class11.field249 <= arg3 && class276.field4831 >= arg2) {
            class3.method13(arg2, 128, arg3, arg0, arg1, arg5);
        } else {
            class232.method1560(arg2, arg1, arg3, arg5, arg0, 5);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lqk;B)V")
    public final void method253(class202 arg0, byte arg1) {
        field901++;
        if (arg0.field3652 != null) {
            arg0.method1401((byte) 27);
        }
        arg0.field3644 = this.field907;
        arg0.field3652 = this.field907.field3652;
        if (arg1 != 13) {
            field897 = true;
        }
        arg0.field3652.field3644 = arg0;
        arg0.field3644.field3652 = arg0;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method254(byte arg0, Component arg1) {
        arg1.addMouseListener(class13.field346);
        arg1.addMouseMotionListener(class13.field346);
        arg1.addFocusListener(class13.field346);
        field900++;
        if (arg0 != -54) {
            field906 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)Lqk;")
    public final class202 method255(int arg0) {
        class202 var2 = this.field907.field3644;
        if (arg0 != 0) {
            return null;
        }
        field898++;
        if (this.field907 == var2) {
            return null;
        } else {
            var2.method1401((byte) 27);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)I")
    public final int method256(int arg0) {
        field904++;
        int var2 = 0;
        for (class202 var3 = this.field907.field3644; var3 != this.field907; var3 = var3.field3644) {
            var2++;
        }
        return arg0 == 27635 ? var2 : 46;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
    public final void method257(boolean arg0) {
        field896++;
        if (!arg0) {
            this.method250(13);
        }
        while (true) {
            class202 var2 = this.field907.field3644;
            if (this.field907 == var2) {
                this.field908 = null;
                return;
            }
            var2.method1401((byte) 27);
        }
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(Z)V")
    public static void method258(boolean arg0) {
        if (arg0) {
            field906 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
    public class40() {
        this.field907.field3652 = this.field907;
        this.field907.field3644 = this.field907;
    }
}
