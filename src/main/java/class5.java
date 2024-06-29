import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public abstract class class5 {

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Lup;")
    public static class181 field49 = new class181(3, 15);

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "Lcw;")
    public static class121 field47;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Ll;")
    public static class16 field50;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)V", line = 4)
    public static final void method27(byte arg0, int arg1) {
        field51++;
        class285.field3642 = arg1;
        class449 var2 = class161.field2047;
        synchronized (class161.field2047) {
            class161.field2047.method2642(0);
        }
        if (arg0 > -18) {
            method31(-120, true, (byte) -37, 60, null, null);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V", line = 18)
    public static void method28(boolean arg0) {
        field47 = null;
        field50 = null;
        field49 = null;
        if (!arg0) {
            method31(82, false, (byte) 41, 1, null, null);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZBI[ILug;)Lnq;", line = 34)
    public static final class322 method31(int arg0, boolean arg1, byte arg2, int arg3, int[] arg4, class395 arg5) {
        if (arg2 >= -70) {
            return null;
        }
        field48++;
        if (!arg5.field5591 && (!class351.method2014(10, arg0) || !class351.method2014(10, arg3))) {
            return arg5.field5624 ? new class322(arg5, 34037, arg0, arg3, arg1, arg4) : new class322(arg5, arg0, arg3, class60.method550(111, arg0), class60.method550(113, arg3), arg4);
        } else {
            return new class322(arg5, 3553, arg0, arg3, arg1, arg4);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method29(Component arg0, int arg1);

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method30(Component arg0, int arg1);

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)I")
    public abstract int method32(int arg0);
}
