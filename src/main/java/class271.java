import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class271 {

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field3791 = 0;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Z")
    public static boolean field3792 = false;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "Lcja;")
    public static class46 field3794 = new class46(16);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field3795;

    // $FF: synthetic field
    @OriginalMember(owner = "client!se", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field3796;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static void method1755(int arg0) {
        if (arg0 != -8166) {
            field3795 = 72;
        }
        field3794 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILfca;)Llp;")
    public static final class414 method1756(int arg0, class93 arg1) {
        field3788++;
        int var2 = arg1.method793((byte) 115);
        class528 var3 = class405.method2421((byte) 69)[arg1.method793((byte) 21)];
        class494 var4 = class74.method638(-112)[arg1.method793((byte) 34)];
        int var5 = arg1.method774(-4);
        int var6 = arg1.method774(-4);
        int var7 = arg1.method763(111);
        int var8 = arg1.method763(-7);
        int var9 = arg1.method773(3);
        int var10 = arg1.method773(3);
        int var11 = arg1.method773(3);
        boolean var12 = arg1.method793((byte) 108) == arg0;
        return new class414(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BLjda;)I")
    public static final int method1757(byte arg0, class240 arg1) {
        field3790++;
        if (arg0 != -38) {
            method1755(-90);
        }
        if (class327.field4459 == arg1) {
            return 5890;
        } else if (class620.field8626 == arg1) {
            return 34167;
        } else if (class606.field8459 == arg1) {
            return 34168;
        } else if (class633.field8767 == arg1) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/awt/Component;BZ)Ltba;")
    public static final class174 method1758(Component arg0, byte arg1, boolean arg2) {
        field3789++;
        try {
            if (arg1 != -111) {
                field3792 = true;
            }
            Constructor var3 = Class.forName("vja").getDeclaredConstructor(field3796 == null ? (field3796 = method1759("java.awt.Component")) : field3796, Boolean.TYPE);
            return (class174) var3.newInstance(arg0, Boolean.valueOf(arg2));
        } catch (Throwable var4) {
            return new class404(arg0, arg2);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1759(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
