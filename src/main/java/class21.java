import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class21 {

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Lpn;")
    public static class49 field238 = new class49(48, 7);

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "[S")
    public static short[] field243;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public int field237;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "I")
    public static int field242;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Ljf;")
    public class21 field235;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "Laa;")
    public class76 field240;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jf", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field244;

    // $FF: synthetic method
    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method134(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class179("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field243 = new short[256];
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ltt;[III[II)Lof;", line = 4)
    public static final class415 method129(class249 arg0, int[] arg1, int arg2, int arg3, int[] arg4, int arg5) {
        field231++;
        byte[] var6 = new byte[arg2 * arg3];
        for (int var7 = 0; var7 < arg3; var7++) {
            int var8 = arg2 * var7 + arg1[var7];
            for (int var9 = 0; var9 < arg4[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        if (arg5 != -3) {
            method133(false);
        }
        return new class415(arg0, arg2, arg3, var6);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ljava/awt/Component;ZZ)Lhd;", line = 34)
    public static final class215 method130(Component arg0, boolean arg1, boolean arg2) {
        field239++;
        if (!arg2) {
            field241 = 44;
        }
        try {
            Constructor var3 = Class.forName("wo").getDeclaredConstructor(field244 == null ? (field244 = method134("java.awt.Component")) : field244, Boolean.TYPE);
            return (class215) var3.newInstance(arg0, Boolean.valueOf(arg1));
        } catch (Throwable var4) {
            return new class431(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 51)
    public static final void method131(byte arg0) {
        field232++;
        if (class178.field2740 != null) {
            if (class178.field2740.field4974 == 1) {
                class178.field2740 = null;
                return;
            }
            if (class178.field2740.field4974 == 2) {
                class232.method1564(2, arg0 ^ 0xFFFFFFBB, class274.field4303, class485.field7101);
                class178.field2740 = null;
                return;
            }
        }
        if (arg0 != -69) {
            method130(null, false, true);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V", line = 83)
    public final void method132(int arg0) {
        field233++;
        if (class300.field4610 >= 500) {
            return;
        }
        this.field237 = 0;
        this.field240 = null;
        this.field235 = class43.field685;
        if (arg0 != 7) {
            this.field240 = null;
        }
        class43.field685 = this;
        class300.field4610++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)V", line = 103)
    public static void method133(boolean arg0) {
        if (!arg0) {
            method131((byte) -67);
        }
        field238 = null;
        field243 = null;
    }
}
