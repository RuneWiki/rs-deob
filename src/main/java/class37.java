import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public abstract class class37 extends class54 {

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "[Lwl;")
    public static class258[] field483 = new class258[16];

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
    public static int field487 = 1403;

    @OriginalMember(owner = "client!vg", name = "n", descriptor = "Lus;")
    public static class1 field486 = new class1(97, -2);

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "I")
    public static int field491 = 0;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public int field485;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
    public int field490;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "Lqb;")
    public static class135 field488;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vg", name = "t", descriptor = "Ljava/lang/Class;")
    public static Class field492;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "Z")
    public boolean field489;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)V")
    public static final void method244(byte arg0) {
        field484++;
        if (arg0 != -110) {
            return;
        }
        if (class430.field6023 == 2) {
            class347.field5026 = 96;
            return;
        }
        try {
            Method var1 = (field492 == null ? (field492 = method250("java.lang.Runtime")) : field492).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class347.field5026 = (int) (var3 / 1048576L) + 1;
                    return;
                } catch (Throwable var4) {
                    return;
                }
            }
        } catch (Exception var5) {
            return;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)V")
    public static final void method245(int arg0, int arg1) {
        field479++;
        class489 var2 = class116.method731(-625541408, 2, arg1);
        var2.method2861(-229012000);
        int var3 = 15 % ((-arg0 - 36) / 59);
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)V")
    public final void method246(int arg0) {
        if (arg0 != -1) {
            field491 = 6;
        }
        field480++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILin;ILnp;BZI)V")
    public final void method247(int arg0, class54 arg1, int arg2, class313 arg3, byte arg4, boolean arg5, int arg6) {
        int var8 = -20 / ((arg4 - 20) / 38);
        field482++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(Z)V")
    public static void method248(boolean arg0) {
        field483 = null;
        field488 = null;
        if (!arg0) {
            method248(true);
        }
        field486 = null;
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)Z")
    public final boolean method249(int arg0) {
        field478++;
        if (arg0 >= -105) {
            field486 = null;
        }
        return false;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method250(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
