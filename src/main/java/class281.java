import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class281 {

    @OriginalMember(owner = "client!pda", name = "d", descriptor = "I")
    public int field3675 = 2048;

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "I")
    public int field3680 = 2048;

    @OriginalMember(owner = "client!pda", name = "f", descriptor = "I")
    public int field3677 = 0;

    @OriginalMember(owner = "client!pda", name = "h", descriptor = "I")
    public int field3679 = 0;

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "I")
    public static int field3673 = -1;

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "Lim;")
    public static class353 field3674 = new class353(111, -1);

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!pda", name = "e", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!pda", name = "g", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!pda", name = "j", descriptor = "I")
    public static int field3681;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pda", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field3682;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)V")
    public static void method1751(byte arg0) {
        field3674 = null;
        int var1 = -11 / ((-arg0 - 22) / 60);
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(ZILge;)V")
    private final void method1752(boolean arg0, int arg1, class551 arg2) {
        if (arg1 == 1) {
            this.field3679 = arg2.method3045(-126);
        } else if (arg1 == 2) {
            this.field3680 = arg2.method3090(-101);
        } else if (arg1 == 3) {
            this.field3675 = arg2.method3090(-110);
        } else if (arg1 == 4) {
            this.field3677 = arg2.method3087(true);
        }
        if (arg0) {
            this.method1752(true, 52, null);
        }
        field3672++;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(ZILjava/awt/Component;)Lvn;")
    public static final class330 method1753(boolean arg0, int arg1, Component arg2) {
        field3678++;
        try {
            Constructor var3 = Class.forName("vf").getDeclaredConstructor(field3682 == null ? (field3682 = method1756("java.awt.Component")) : field3682, Boolean.TYPE);
            return arg1 == 2 ? (class330) var3.newInstance(arg2, Boolean.valueOf(arg0)) : null;
        } catch (Throwable var4) {
            return new class19(arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Lgaa;B)[Lvw;")
    public static final class492[] method1754(class279 arg0, byte arg1) {
        field3681++;
        if (!arg0.method1738(false)) {
            return new class492[0];
        }
        class441 var2 = arg0.method1746(21690);
        while (var2.field6001 == 0) {
            class353.method2204(10L, 7806);
        }
        if (var2.field6001 == 2) {
            return new class492[0];
        }
        int[] var3 = (int[]) var2.field6000;
        class492[] var4 = new class492[var3.length >> 2];
        int var5 = 126 / ((arg1 + 2) / 58);
        for (int var6 = 0; var6 < var4.length; var6++) {
            class492 var7 = new class492();
            var4[var6] = var7;
            var7.field6871 = var3[var6 << 2];
            var7.field6870 = var3[(var6 << 2) + 1];
            var7.field6873 = var3[(var6 << 2) + 2];
            var7.field6875 = var3[(var6 << 2) + 3];
        }
        return var4;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILge;)V")
    public final void method1755(int arg0, class551 arg1) {
        if (arg0 != -1) {
            method1751((byte) 24);
        }
        field3676++;
        while (true) {
            int var3 = arg1.method3045(-125);
            if (var3 == 0) {
                return;
            }
            this.method1752(false, var3, arg1);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1756(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
