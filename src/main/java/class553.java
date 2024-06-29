import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class class553 extends class205 {

    @OriginalMember(owner = "client!pha", name = "v", descriptor = "Z")
    public boolean field7871 = true;

    @OriginalMember(owner = "client!pha", name = "A", descriptor = "I")
    public int field7876 = 12800;

    @OriginalMember(owner = "client!pha", name = "C", descriptor = "I")
    public int field7878 = 0;

    @OriginalMember(owner = "client!pha", name = "N", descriptor = "I")
    public int field7889 = 0;

    @OriginalMember(owner = "client!pha", name = "J", descriptor = "I")
    public int field7885 = -1;

    @OriginalMember(owner = "client!pha", name = "F", descriptor = "I")
    public int field7881 = 12800;

    @OriginalMember(owner = "client!pha", name = "y", descriptor = "I")
    public int field7874 = -1;

    @OriginalMember(owner = "client!pha", name = "B", descriptor = "Ljava/lang/String;")
    public String field7877;

    @OriginalMember(owner = "client!pha", name = "I", descriptor = "I")
    public int field7884;

    @OriginalMember(owner = "client!pha", name = "w", descriptor = "I")
    public int field7872;

    @OriginalMember(owner = "client!pha", name = "G", descriptor = "Ljava/lang/String;")
    public String field7882;

    @OriginalMember(owner = "client!pha", name = "M", descriptor = "Ltg;")
    public class605 field7888;

    @OriginalMember(owner = "client!pha", name = "P", descriptor = "Lcb;")
    public static class631 field7891 = new class631(36, 7);

    @OriginalMember(owner = "client!pha", name = "Q", descriptor = "Ljava/lang/Object;")
    public static volatile Object field7892 = null;

    @OriginalMember(owner = "client!pha", name = "R", descriptor = "Lcb;")
    public static class631 field7893 = new class631(0, 7);

    @OriginalMember(owner = "client!pha", name = "t", descriptor = "I")
    public static int field7869;

    @OriginalMember(owner = "client!pha", name = "u", descriptor = "I")
    public static int field7870;

    @OriginalMember(owner = "client!pha", name = "x", descriptor = "I")
    public static int field7873;

    @OriginalMember(owner = "client!pha", name = "z", descriptor = "I")
    public static int field7875;

    @OriginalMember(owner = "client!pha", name = "D", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!pha", name = "K", descriptor = "I")
    public static int field7886;

    @OriginalMember(owner = "client!pha", name = "L", descriptor = "I")
    public static int field7887;

    @OriginalMember(owner = "client!pha", name = "O", descriptor = "I")
    public static int field7890;

    @OriginalMember(owner = "client!pha", name = "S", descriptor = "I")
    public static int field7894;

    @OriginalMember(owner = "client!pha", name = "E", descriptor = "Lla;")
    public static class422 field7880;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pha", name = "T", descriptor = "Ljava/lang/Class;")
    public static Class field7895;

    @OriginalMember(owner = "client!pha", name = "H", descriptor = "[Lov;")
    public static class668[] field7883;

    // $FF: synthetic method
    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3230(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(I[IZI)Z", line = 5)
    public final boolean method3222(int arg0, int[] arg1, boolean arg2, int arg3) {
        field7873++;
        for (class59 var5 = (class59) this.field7888.method3463((byte) -50); var5 != null; var5 = (class59) this.field7888.method3469((byte) 107)) {
            if (var5.method580(arg3, arg0, (byte) 122)) {
                var5.method585((byte) 18, arg3, arg0, arg1);
                return true;
            }
        }
        if (arg2) {
            method3225(-90);
        }
        return false;
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "([IBIII)Z", line = 32)
    public final boolean method3223(int[] arg0, byte arg1, int arg2, int arg3, int arg4) {
        field7886++;
        for (class59 var6 = (class59) this.field7888.method3463((byte) -50); var6 != null; var6 = (class59) this.field7888.method3469((byte) 107)) {
            if (var6.method579(arg3, arg4, -86, arg2)) {
                var6.method583(arg2, arg4, arg0, (byte) -88);
                return true;
            }
        }
        if (arg1 >= -71) {
            method3227(-98);
        }
        return false;
    }

    @OriginalMember(owner = "client!pha", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V", line = 280)
    public class553(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field7877 = arg2;
        this.field7884 = arg0;
        this.field7872 = arg3;
        this.field7874 = arg4;
        this.field7885 = arg6;
        this.field7882 = arg1;
        this.field7871 = arg5;
        if (this.field7885 == 255) {
            this.field7885 = 0;
        }
        this.field7888 = new class605();
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(IIZZ)I", line = 61)
    public static final int method3224(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            return -86;
        }
        field7894++;
        class33 var4 = class446.method2724(arg0, 9, arg3);
        if (var4 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field310.length; var6++) {
                if (var4.field311[var6] == arg1) {
                    var5 += var4.field310[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!pha", name = "b", descriptor = "(I)V", line = 98)
    public static void method3225(int arg0) {
        field7883 = null;
        field7892 = null;
        field7893 = null;
        field7891 = null;
        if (arg0 != -1) {
            method3224(-57, -66, true, false);
        }
        field7880 = null;
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(ZII)Z", line = 121)
    public final boolean method3226(boolean arg0, int arg1, int arg2) {
        field7870++;
        class59 var4 = (class59) this.field7888.method3463((byte) -50);
        if (arg0) {
            method3227(25);
        }
        while (var4 != null) {
            if (var4.method582(15218, arg1, arg2)) {
                return true;
            }
            var4 = (class59) this.field7888.method3469((byte) 107);
        }
        return false;
    }

    @OriginalMember(owner = "client!pha", name = "c", descriptor = "(I)V", line = 153)
    public static final void method3227(int arg0) {
        field7887++;
        if (arg0 <= 53) {
            field7875 = 39;
        }
        if (class706.field9962.field10262) {
            class84.field1246 = 96;
            return;
        }
        try {
            Method var1 = (field7895 == null ? (field7895 = method3230("java.lang.Runtime")) : field7895).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class84.field1246 = (int) (var3 / 1048576L) + 1;
                    return;
                } catch (Throwable var4) {
                    return;
                }
            }
        } catch (Exception var5) {
            return;
        }
    }

    @OriginalMember(owner = "client!pha", name = "a", descriptor = "(III[I)Z", line = 192)
    public final boolean method3228(int arg0, int arg1, int arg2, int[] arg3) {
        field7879++;
        if (arg0 != 14918) {
            method3224(61, 77, false, false);
        }
        for (class59 var5 = (class59) this.field7888.method3463((byte) -50); var5 != null; var5 = (class59) this.field7888.method3469((byte) 107)) {
            if (var5.method582(15218, arg2, arg1)) {
                var5.method583(arg1, arg2, arg3, (byte) -88);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pha", name = "f", descriptor = "(I)V", line = 221)
    public final void method3229(int arg0) {
        this.field7878 = 0;
        this.field7881 = arg0;
        this.field7876 = 12800;
        this.field7889 = 0;
        field7890++;
        for (class59 var2 = (class59) this.field7888.method3463((byte) -50); var2 != null; var2 = (class59) this.field7888.method3469((byte) 107)) {
            if (var2.field926 < this.field7881) {
                this.field7881 = var2.field926;
            }
            if (var2.field925 > this.field7878) {
                this.field7878 = var2.field925;
            }
            if (var2.field911 > this.field7889) {
                this.field7889 = var2.field911;
            }
            if (var2.field918 < this.field7876) {
                this.field7876 = var2.field918;
            }
        }
    }
}
