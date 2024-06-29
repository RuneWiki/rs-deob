import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class658 extends class601 {

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "I")
    public static int field9398;

    @OriginalMember(owner = "client!lw", name = "e", descriptor = "I")
    public static int field9399;

    @OriginalMember(owner = "client!lw", name = "f", descriptor = "I")
    public static int field9400;

    @OriginalMember(owner = "client!lw", name = "g", descriptor = "I")
    public static int field9401;

    @OriginalMember(owner = "client!lw", name = "h", descriptor = "I")
    public static int field9402;

    @OriginalMember(owner = "client!lw", name = "i", descriptor = "I")
    public static int field9403;

    @OriginalMember(owner = "client!lw", name = "j", descriptor = "I")
    public static int field9404;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lw", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field9405;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)I")
    public final int method3748(int arg0) {
        ++field9401;
        int var2 = 118 / ((arg0 - -59) / 61);
        return super.field8565;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(B)V")
    public final void method35(byte arg0) {
        if (super.field8563.method3926(30) == class15.field130) {
            super.field8565 = 2;
        }
        if (arg0 > -37) {
            this.method3748(-2);
        }
        ++field9399;
        if (~super.field8565 > -1 || super.field8565 > 2) {
            super.field8565 = this.method39((byte) -17);
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IZ)V")
    public final void method40(int arg0, boolean arg1) {
        ++field9403;
        if (!arg1) {
            super.field8565 = arg0;
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)V")
    public static final void method3749(int arg0) {
        class655.method3719();
        ++field9404;
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class205.field2430[var1].method1809(false);
        }
        class8.method33(-31239);
        class38.method185(true);
        class326.method1943((byte) 107);
        System.gc();
        class275.field3370.method319();
        if (arg0 <= -25) {
            ;
        }
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(ILgn;)V")
    public class658(int arg0, class699 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)I")
    public final int method39(byte arg0) {
        ++field9398;
        if (arg0 != -17) {
            this.method35((byte) -7);
        }
        return 1;
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(II)I")
    public final int method34(int arg0, int arg1) {
        ++field9400;
        return arg1 != 15706 ? 84 : 1;
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lgn;)V")
    public class658(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZLjava/io/File;Z)V")
    public static final void method3750(boolean arg0, File arg1, boolean arg2) {
        if (arg0) {
            if (class741.field10360 == null) {
                class64.method485(13711);
            }
            ++field9402;
            try {
                Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
                Method var4 = var3.getDeclaredMethod("dumpHeap", field9405 != null ? field9405 : (field9405 = method3751("java.lang.String")), Boolean.TYPE);
                var4.invoke(class741.field10360, arg1.getAbsolutePath(), new Boolean(arg2));
            } catch (Exception var6) {
                System.out.println("HeapDump error:");
                var6.printStackTrace();
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3751(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
