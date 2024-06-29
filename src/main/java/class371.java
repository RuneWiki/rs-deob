import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public class class371 extends class468 {

    @OriginalMember(owner = "client!rp", name = "S", descriptor = "I")
    public int field5099;

    @OriginalMember(owner = "client!rp", name = "Q", descriptor = "Z")
    public boolean field5097;

    @OriginalMember(owner = "client!rp", name = "U", descriptor = "F")
    public float field5101;

    @OriginalMember(owner = "client!rp", name = "T", descriptor = "F")
    public float field5100;

    @OriginalMember(owner = "client!rp", name = "O", descriptor = "I")
    public int field5095;

    @OriginalMember(owner = "client!rp", name = "P", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!rp", name = "V", descriptor = "Lkda;")
    public static class328 field5102;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rp", name = "W", descriptor = "Ljava/lang/Class;")
    public static Class field5103;

    @OriginalMember(owner = "client!rp", name = "R", descriptor = "[I")
    public static int[] field5098;

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lte;IIIIZ[BI)V")
    public class371(class527 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        this.field5099 = arg4;
        if (~super.field3333 != -34038) {
            this.field5097 = true;
            this.field5100 = this.field5101 = 1.0F;
        } else {
            this.field5100 = (float) arg3;
            this.field5097 = false;
            this.field5101 = (float) arg4;
        }
        this.field5095 = arg3;
    }

    @OriginalMember(owner = "client!rp", name = "e", descriptor = "(B)V")
    public static void method2214(byte arg0) {
        field5102 = null;
        field5098 = null;
        if (arg0 != -3) {
            field5102 = null;
        }
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lte;IIIZ[I)V")
    public class371(class527 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field5095 = arg2;
        this.field5099 = arg3;
        if (super.field3333 != 34037) {
            this.field5100 = this.field5101 = 1.0F;
            this.field5097 = true;
        } else {
            this.field5101 = (float) arg3;
            this.field5100 = (float) arg2;
            this.field5097 = false;
        }
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lte;IIIIIIZ)V")
    public class371(class527 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field5100 = (float) arg3 / (float) arg5;
        this.field5095 = arg3;
        this.field5099 = arg4;
        this.field5097 = false;
        this.field5101 = (float) arg4 / (float) arg6;
        this.method2824((byte) -79, false, false);
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lte;IIII[I)V")
    public class371(class527 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field5099 = arg2;
        this.field5095 = arg1;
        this.method2819(arg5, true, 6789, 0, 0, arg2, 0, 0, arg1);
        this.field5097 = false;
        this.field5100 = (float) arg1 / (float) arg3;
        this.field5101 = (float) arg2 / (float) arg4;
        this.method2824((byte) -70, false, false);
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lte;IIIII[BI)V")
    public class371(class527 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field5095 = arg2;
        this.field5099 = arg3;
        this.method2821(arg3, arg2, 10242, 0, 0, true, 0, 0, arg6, arg7);
        this.field5097 = false;
        this.field5101 = (float) arg3 / (float) arg5;
        this.field5100 = (float) arg2 / (float) arg4;
        this.method2824((byte) -103, false, false);
    }

    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/awt/Component;IZ)Lsj;")
    public static final class392 method2215(Component arg0, int arg1, boolean arg2) {
        ++field5096;
        if (arg1 != 3553) {
            method2214((byte) 42);
        }
        try {
            Constructor var3 = Class.forName("mf").getDeclaredConstructor(field5103 != null ? field5103 : (field5103 = method2216("java.awt.Component")), Boolean.TYPE);
            return (class392) var3.newInstance(arg0, new Boolean(arg2));
        } catch (Throwable var4) {
            return new class251(arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lte;IIIIIZ)V")
    public class371(class527 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field5095 = arg4;
        this.field5099 = arg5;
        if (super.field3333 == 34037) {
            this.field5097 = false;
            this.field5101 = (float) arg5;
            this.field5100 = (float) arg4;
        } else {
            this.field5100 = this.field5101 = 1.0F;
            this.field5097 = true;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2216(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
