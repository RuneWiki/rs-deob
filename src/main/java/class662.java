import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class662 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "Lqe;")
    public static class465 field9309 = new class465(38, 2);

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "Lqaa;")
    public static class27 field9318 = new class27(56, -1);

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public int field9310;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field9311;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public int field9312;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field9314;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field9315;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field9316;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public int field9319;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lg;")
    public static class154 field9313;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "Leq;")
    public static class209 field9317;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field9320;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field9321;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3727(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 5)
    public static void method3723(int arg0) {
        field9318 = null;
        field9313 = null;
        field9309 = null;
        if (arg0 != 0) {
            field9317 = null;
        }
        field9317 = null;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)I", line = 18)
    public static final int method3724(int arg0) {
        field9311++;
        int var1 = 0;
        Field[] var2 = (field9320 == null ? (field9320 = method3727("cq")) : field9320).getDeclaredFields();
        Field[] var3 = var2;
        for (int var4 = arg0; var4 < var3.length; var4++) {
            Field var5 = var3[var4];
            if ((field9321 == null ? (field9321 = method3727("oi")) : field9321).isAssignableFrom(var5.getType())) {
                var1++;
            }
        }
        return var1 + 1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILud;)V", line = 48)
    public final void method3725(int arg0, class35 arg1) {
        while (true) {
            int var3 = arg1.method273(255);
            if (var3 == 0) {
                int var4 = -108 / ((51 - arg0) / 53);
                field9314++;
                return;
            }
            this.method3726(var3, arg1, (byte) 75);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILud;B)V", line = 80)
    private final void method3726(int arg0, class35 arg1, byte arg2) {
        if (arg2 != 75) {
            this.method3726(35, null, (byte) 21);
        }
        field9315++;
        if (arg0 == 1) {
            this.field9319 = arg1.method253(arg2 - 13975);
            this.field9310 = arg1.method273(255);
            this.field9312 = arg1.method273(255);
        }
    }
}
