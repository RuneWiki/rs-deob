import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class58 extends class69 {

    @OriginalMember(owner = "client!jh", name = "G", descriptor = "I")
    private final int field939;

    @OriginalMember(owner = "client!jh", name = "E", descriptor = "I")
    private final int field937;

    @OriginalMember(owner = "client!jh", name = "F", descriptor = "I")
    private final int field938;

    @OriginalMember(owner = "client!jh", name = "B", descriptor = "I")
    private final int field934;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "[J")
    public static long[] field941 = new long[200];

    @OriginalMember(owner = "client!jh", name = "x", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!jh", name = "z", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!jh", name = "A", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!jh", name = "C", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!jh", name = "D", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!jh", name = "H", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!jh", name = "y", descriptor = "Lja;")
    public static class105 field931;

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(IIIIIII)V")
    public class58(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field939 = arg2;
        this.field937 = arg1;
        this.field938 = arg0;
        this.field934 = arg3;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)V")
    public static final void method413(int arg0, boolean arg1) {
        class81.method549(class249.field4479, class199.field3390, class234.field4044, arg0 ^ 1025659987, arg1);
        if (arg0 == -1025659988) {
            ++field935;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)V")
    public final void method414(int arg0, int arg1, int arg2) {
        ++field936;
        if (arg2 != 31712) {
            field930 = 116;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
    public static void method415(boolean arg0) {
        field931 = null;
        if (arg0) {
            field931 = null;
        }
        field941 = null;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(III)V")
    public final void method416(int arg0, int arg1, int arg2) {
        if (arg0 >= -49) {
            this.method418(83, 125, 87);
        }
        ++field933;
        int var4 = this.field939 * arg2 >> 12;
        int var5 = this.field938 * arg2 >> 12;
        int var6 = this.field937 * arg1 >> 12;
        int var7 = this.field934 * arg1 >> 12;
        class86.method573(1, var5, var4, super.field1090, var6, var7);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method417(byte arg0, Component arg1) {
        ++field940;
        Method var2 = class207.field3516;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        if (arg0 != -37) {
            field930 = 105;
        }
        arg1.addKeyListener(class4.field71);
        arg1.addFocusListener(class4.field71);
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(III)V")
    public final void method418(int arg0, int arg1, int arg2) {
        ++field932;
        int var4 = this.field938 * arg2 >> 12;
        int var5 = this.field937 * arg0 >> 12;
        int var6 = this.field939 * arg2 >> 12;
        int var7 = this.field934 * arg0 >> 12;
        if (arg1 != 28440) {
            method415(false);
        }
        class31.method180(var4, var6, arg1 + -4568, super.field1110, var7, super.field1090, super.field1111, var5);
    }
}
