import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class285 extends class172 {

    @OriginalMember(owner = "client!di", name = "Q", descriptor = "Ljava/lang/Object;")
    private Object field3818;

    @OriginalMember(owner = "client!di", name = "M", descriptor = "I")
    public static int field3814 = 0;

    @OriginalMember(owner = "client!di", name = "O", descriptor = "[I")
    public static int[] field3816 = new int[4096];

    @OriginalMember(owner = "client!di", name = "P", descriptor = "C")
    public static char field3817;

    @OriginalMember(owner = "client!di", name = "I", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!di", name = "K", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!di", name = "L", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!di", name = "N", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!di", name = "R", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "(B)Z", line = 3)
    public final boolean method1081(byte arg0) {
        if (arg0 > -68) {
            method1795(-48);
        }
        field3819++;
        return false;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Ljava/lang/String;ZZLbd;I)V", line = 14)
    public static final void method1794(String arg0, boolean arg1, boolean arg2, class304 arg3, int arg4) {
        field3813++;
        if (arg4 != 3) {
            return;
        }
        if (!arg1) {
            class67.method585(-52, 3, arg0, arg3);
            return;
        }
        if (class304.field4113.startsWith("win") && class304.field4109 != 3) {
            String var5 = null;
            if (arg3.field4117 != null) {
                var5 = arg3.field4117.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class242 var6 = class67.method585(arg4 - 53, 0, arg0, arg3);
                class60.field938 = var6;
                class395.field5534 = arg0;
                class192.field2754 = arg3;
                return;
            }
        }
        if (class304.field4113.startsWith("mac")) {
            String var7 = null;
            if (arg3.field4117 != null) {
                var7 = arg3.field4117.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg2) {
                class67.method585(-75, 1, arg0, arg3);
                return;
            }
        }
        class67.method585(-62, 2, arg0, arg3);
    }

    @OriginalMember(owner = "client!di", name = "f", descriptor = "(I)V", line = 79)
    public static void method1795(int arg0) {
        field3816 = null;
        if (arg0 < 16) {
            field3814 = 65;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILjava/lang/String;)V", line = 94)
    public static final void method1796(int arg0, String arg1) {
        if (class77.field1161 == null) {
            class295.method1897(false);
        }
        field3811++;
        String[] var2 = class156.method1192(arg0 ^ arg0, '\n', arg1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class77.field1161.length - 1; var4 > 0; var4--) {
                class77.field1161[var4] = class77.field1161[var4 - 1];
            }
            class77.field1161[0] = var2[var3];
        }
    }

    @OriginalMember(owner = "client!di", name = "h", descriptor = "(B)V", line = 130)
    public static final void method1797(byte arg0) {
        field3812++;
        class438.field6268.method2539(38);
        if (arg0 != -119) {
            method1794((String) null, false, true, (class304) null, -15);
        }
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(I)Ljava/lang/Object;", line = 141)
    public final Object method1080(int arg0) {
        field3815++;
        if (arg0 != 0) {
            method1796(29, (String) null);
        }
        return this.field3818;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 162)
    public class285(Object arg0) {
        this.field3818 = arg0;
    }
}
