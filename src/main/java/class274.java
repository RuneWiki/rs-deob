import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class274 extends class45 {

    @OriginalMember(owner = "client!ada", name = "l", descriptor = "Lfv;")
    public static class690 field3642 = new class690();

    @OriginalMember(owner = "client!ada", name = "j", descriptor = "I")
    public int field3640;

    @OriginalMember(owner = "client!ada", name = "k", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!ada", name = "m", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!ada", name = "o", descriptor = "I")
    public int field3645;

    @OriginalMember(owner = "client!ada", name = "q", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!ada", name = "r", descriptor = "I")
    public int field3648;

    @OriginalMember(owner = "client!ada", name = "s", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!ada", name = "u", descriptor = "I")
    public int field3651;

    @OriginalMember(owner = "client!ada", name = "v", descriptor = "I")
    public int field3652;

    @OriginalMember(owner = "client!ada", name = "w", descriptor = "I")
    public int field3653;

    @OriginalMember(owner = "client!ada", name = "n", descriptor = "Lwv;")
    public class423 field3644;

    @OriginalMember(owner = "client!ada", name = "t", descriptor = "Lwv;")
    public class423 field3650;

    @OriginalMember(owner = "client!ada", name = "y", descriptor = "Lf;")
    public static class532 field3655;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ada", name = "z", descriptor = "Ljava/lang/Class;")
    public static Class field3656;

    @OriginalMember(owner = "client!ada", name = "p", descriptor = "Ljava/lang/String;")
    public String field3646;

    @OriginalMember(owner = "client!ada", name = "x", descriptor = "Z")
    public boolean field3654;

    @OriginalMember(owner = "client!ada", name = "i", descriptor = "[Ljava/lang/Object;")
    public Object[] field3639;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1653(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 6)
    public static final void method1648(int arg0, int arg1, int arg2, Class arg3) {
        class207 var4 = class153.field2168[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class634 var5 = var4.field2774; var5 != null; var5 = var5.field8764) {
            class29 var6 = var5.field8767;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field423 == arg1 && var6.field419 == arg2) {
                class327.method1903(var6, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(B)V", line = 37)
    public static void method1649(byte arg0) {
        field3655 = null;
        if (arg0 != 114) {
            method1650(-38);
        }
        field3642 = null;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)Z", line = 52)
    public static final boolean method1650(int arg0) {
        field3641++;
        class45 var1 = class101.field1211.field5887.field547;
        if (var1 == null || class101.field1211.field5887 == var1) {
            return false;
        } else if (arg0 == 0) {
            class354 var2 = (class354) var1;
            if (var2.field4729 >= 2000) {
                var2.field4729 -= 2000;
            }
            return var2.field4729 == 1001;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(Ljava/io/File;ZB)V", line = 79)
    public static final void method1651(File arg0, boolean arg1, byte arg2) {
        field3649++;
        if (class582.field7961 == null) {
            class94.method534((byte) -102);
        }
        try {
            if (arg2 <= 49) {
                method1650(41);
            }
            Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
            Method var4 = var3.getDeclaredMethod("dumpHeap", field3656 == null ? (field3656 = method1653("java.lang.String")) : field3656, Boolean.TYPE);
            var4.invoke(class582.field7961, arg0.getAbsolutePath(), Boolean.valueOf(arg1));
        } catch (Exception var6) {
            System.out.println("HeapDump error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(IIIIZIIF)[I", line = 103)
    public static final int[] method1652(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, float arg7) {
        field3643++;
        int[] var8 = new int[arg2];
        if (arg3 != 27800) {
            return null;
        }
        class693 var9 = new class693();
        var9.field9770 = arg4;
        var9.field9771 = arg0;
        var9.field9775 = arg5;
        var9.field9776 = arg1;
        var9.field9773 = (int) (arg7 * 4096.0F);
        var9.field9762 = arg6;
        var9.method317((byte) 127);
        class239.method1483(1, 0, arg2);
        var9.method3912(var8, -1, 0);
        return var8;
    }
}
