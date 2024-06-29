import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class236 {

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "Z")
    public boolean field3797;

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "[I")
    public static int[] field3790 = new int[1000];

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!vk", name = "i", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "Lda;")
    public static class400 field3788;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "Lla;")
    public static class422 field3799;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "Lfb;")
    public class669 field3792;

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "Lfb;")
    public class669 field3795;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vk", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field3800;

    // $FF: synthetic field
    @OriginalMember(owner = "client!vk", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field3801;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "Z")
    public boolean field3791;

    // $FF: synthetic method
    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1628(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Z)V", line = 4)
    public final void method1623(boolean arg0) {
        if (this.field3792 != null) {
            this.field3792.method697(-18934);
        }
        field3796++;
        this.field3791 = arg0;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)I", line = 15)
    public static final int method1624(int arg0) {
        field3794++;
        int var1 = 0;
        Field[] var2 = (field3800 == null ? (field3800 = method1628("hs")) : field3800).getDeclaredFields();
        Field[] var3 = var2;
        for (int var4 = arg0; var4 < var3.length; var4++) {
            Field var5 = var3[var4];
            if ((field3801 == null ? (field3801 = method1628("sga")) : field3801).isAssignableFrom(var5.getType())) {
                var1++;
            }
        }
        return var1 + 1;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(I)Z", line = 43)
    public final boolean method1625(int arg0) {
        field3798++;
        if (arg0 != 1) {
            method1626(-101);
        }
        return this.field3791 && !this.field3797;
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)V", line = 59)
    public static void method1626(int arg0) {
        if (arg0 == 1) {
            field3788 = null;
            field3799 = null;
            field3790 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)I", line = 74)
    public static final int method1627(int arg0) {
        if (arg0 != 1) {
            method1626(74);
        }
        field3793++;
        return class346.field5112.method3989((byte) -99);
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Z)V", line = 89)
    public class236(boolean arg0) {
        this.field3797 = arg0;
    }
}
