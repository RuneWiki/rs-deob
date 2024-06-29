import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class689 {

    @OriginalMember(owner = "client!rda", name = "e", descriptor = "Ljava/lang/String;")
    public String field9751;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "J")
    public long field9747;

    @OriginalMember(owner = "client!rda", name = "d", descriptor = "Ljava/lang/String;")
    public String field9750;

    @OriginalMember(owner = "client!rda", name = "g", descriptor = "I")
    public int field9753;

    @OriginalMember(owner = "client!rda", name = "b", descriptor = "I")
    public int field9748;

    @OriginalMember(owner = "client!rda", name = "h", descriptor = "Lke;")
    public static class622 field9754 = new class622(114, 17);

    @OriginalMember(owner = "client!rda", name = "c", descriptor = "I")
    public static int field9749;

    @OriginalMember(owner = "client!rda", name = "f", descriptor = "I")
    public static int field9752;

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "I")
    public static int field9757;

    @OriginalMember(owner = "client!rda", name = "j", descriptor = "Lcb;")
    public static class544 field9756;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rda", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field9758;

    @OriginalMember(owner = "client!rda", name = "i", descriptor = "[[I")
    public static int[][] field9755;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(IZLjava/awt/Component;)Lsfa;")
    public static final class723 method3881(int arg0, boolean arg1, Component arg2) {
        field9752++;
        try {
            if (arg0 != 17) {
                method3882((byte) -4);
            }
            Constructor var3 = Class.forName("wo").getDeclaredConstructor(field9758 == null ? (field9758 = method3883("java.awt.Component")) : field9758, Boolean.TYPE);
            return (class723) var3.newInstance(arg2, Boolean.valueOf(arg1));
        } catch (Throwable var4) {
            return new class551(arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V")
    public class689(int arg0, String arg1, int arg2, String arg3, long arg4) {
        this.field9751 = arg3;
        this.field9747 = arg4;
        this.field9750 = arg1;
        this.field9753 = arg0;
        this.field9748 = arg2;
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(B)V")
    public static void method3882(byte arg0) {
        field9756 = null;
        field9755 = null;
        field9754 = null;
        if (arg0 > -113) {
            field9757 = 44;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3883(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
