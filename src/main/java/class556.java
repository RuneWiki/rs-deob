import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class556 implements class104 {

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "Lpp;")
    private class358 field7490;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field7485;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field7486;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!ai", name = "g", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!ai", name = "h", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Z")
    public static boolean field7487;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZZ)V")
    public final void method647(boolean arg0, boolean arg1) {
        if (arg1) {
            if (arg0) {
                class334.field4506.method110(0, 0, class222.field3096, class340.field4553, this.field7490.field4747, 0);
            }
            field7488++;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)Z")
    public static final boolean method3115(int arg0, int arg1) {
        if (arg0 != 30916) {
            field7487 = false;
        }
        field7485++;
        if (arg1 == 46 || arg1 == 30 || arg1 == 50 || arg1 == 11 || arg1 == 1003) {
            return true;
        } else {
            return arg1 == 59 || arg1 == 1010;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public final void method476(int arg0) {
        if (arg0 != -12935) {
            this.field7490 = null;
        }
        field7492++;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(ZLjava/lang/String;ZZLlaa;)V")
    public static final void method3116(boolean arg0, String arg1, boolean arg2, boolean arg3, class105 arg4) {
        field7486++;
        if (arg0) {
            if (class105.field1466.startsWith("win") && arg4.field1456) {
                String var5 = null;
                if (class59.field668 != null) {
                    var5 = class59.field668.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class70 var6 = class316.method1911(arg4, arg1, 32445, 0);
                    class704.field9958 = var6;
                    class77.field1014 = arg4;
                    class136.field1923 = arg1;
                    return;
                }
            }
            if (class105.field1466.startsWith("mac")) {
                String var7 = null;
                if (class59.field668 != null) {
                    var7 = class59.field668.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg3) {
                    class316.method1911(arg4, arg1, 32445, 1);
                    return;
                }
            }
            class316.method1911(arg4, arg1, 32445, 2);
        } else {
            class316.method1911(arg4, arg1, 32445, 3);
        }
        if (arg2) {
            method3116(false, null, false, true, null);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(B)Z")
    public final boolean method475(byte arg0) {
        field7489++;
        if (arg0 != -90) {
            this.method476(-8);
        }
        return true;
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(ZZ)Z")
    public static boolean method3117(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3118(String arg0, int arg1) {
        System.exit(1);
        field7491++;
        if (arg1 != 0) {
            field7487 = true;
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lpp;)V")
    public class556(class358 arg0) {
        this.field7490 = arg0;
    }
}
