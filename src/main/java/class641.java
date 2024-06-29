import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class641 extends class113 {

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "Ljava/lang/Object;")
    private Object field8856;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "[I")
    public static int[] field8855 = new int[1];

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "Lkh;")
    public static class354 field8858 = new class354();

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    public static int field8851;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "I")
    public static int field8852;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
    public static int field8853;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "I")
    public static int field8854;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "I")
    public static int field8857;

    @OriginalMember(owner = "client!ii", name = "H", descriptor = "Lwp;")
    public static class435 field8859;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ii", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field8861;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ii", name = "K", descriptor = "Ljava/lang/Class;")
    public static Class field8862;

    @OriginalMember(owner = "client!ii", name = "I", descriptor = "[Lmk;")
    public static class344[] field8860;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3489(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(B)I", line = 4)
    public static final int method3485(byte arg0) {
        field8852++;
        int var1 = 0;
        Field[] var2 = (field8861 == null ? (field8861 = method3489("ts")) : field8861).getDeclaredFields();
        Field[] var3 = var2;
        if (arg0 <= 88) {
            return 95;
        }
        for (int var4 = 0; var4 < var3.length; var4++) {
            Field var5 = var3[var4];
            if ((field8862 == null ? (field8862 = method3489("fe")) : field8862).isAssignableFrom(var5.getType())) {
                var1++;
            }
        }
        return var1 + 1;
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)Lwl;", line = 38)
    public static final class142 method3486(int arg0) {
        field8853++;
        try {
            return (class142) Class.forName("vw").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            int var1 = 110 % ((16 - arg0) / 50);
            return new class76();
        }
    }

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)V", line = 53)
    public static final void method3487(int arg0) {
        for (class303 var1 = (class303) class274.field3460.method3245(false); var1 != null; var1 = (class303) class274.field3460.method3252(12938)) {
            class623.method3410(var1.field3899, -127);
        }
        int var2 = -25 / ((arg0 + 22) / 41);
        field8854++;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)Z", line = 72)
    public final boolean method767(boolean arg0) {
        if (!arg0) {
            field8859 = null;
        }
        field8851++;
        return false;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I)Ljava/lang/Object;", line = 86)
    public final Object method764(int arg0) {
        field8857++;
        int var2 = 72 / ((arg0 - 52) / 63);
        return this.field8856;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lqq;Ljava/lang/Object;I)V", line = 100)
    public class641(class75 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field8856 = arg1;
    }

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)V", line = 108)
    public static void method3488(int arg0) {
        int var1 = -105 / ((-arg0 - 43) / 49);
        field8855 = null;
        field8860 = null;
        field8859 = null;
        field8858 = null;
    }
}
