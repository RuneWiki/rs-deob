import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class260 {

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public int field3697;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Lgf;")
    private class234 field3696;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "Lkca;")
    public static class73 field3701 = new class73(66, 7);

    @OriginalMember(owner = "client!le", name = "j", descriptor = "I")
    public static int field3703 = 0;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "Lks;")
    public static class375 field3704 = new class375(16);

    @OriginalMember(owner = "client!le", name = "m", descriptor = "Loo;")
    public static class543 field3706 = new class543("LIVE", 0);

    @OriginalMember(owner = "client!le", name = "n", descriptor = "[Ltp;")
    public static class463[] field3707 = new class463[100];

    @OriginalMember(owner = "client!le", name = "o", descriptor = "B")
    public static byte field3708;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "I")
    public static int field3700;

    // $FF: synthetic field
    @OriginalMember(owner = "client!le", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field3709;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "Z")
    public static boolean field3702;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "[I")
    public static int[] field3705;

    // $FF: synthetic method
    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1735(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ZBLjava/awt/Component;)Lmo;", line = 4)
    public static final class647 method1731(boolean arg0, byte arg1, Component arg2) {
        int var3 = -15 % ((-arg1 - 78) / 39);
        field3695++;
        try {
            Constructor var4 = Class.forName("ct").getDeclaredConstructor(field3709 == null ? (field3709 = method1735("java.awt.Component")) : field3709, Boolean.TYPE);
            return (class647) var4.newInstance(arg2, Boolean.valueOf(arg0));
        } catch (Throwable var5) {
            return new class531(arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIII)V", line = 22)
    public static final void method1732(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class595.field8694.field6532 != 0 && arg4 != 0 && class220.field3015 < 50 && arg3 != -1) {
            class526.field7632[class220.field3015++] = new class85((byte) 1, arg3, arg4, arg1, arg2, 0);
        }
        field3699++;
        if (arg0 != 16) {
            method1732(120, 43, 84, -83, 74);
        }
    }

    @OriginalMember(owner = "client!le", name = "finalize", descriptor = "()V", line = 42)
    protected final void finalize() throws Throwable {
        field3694++;
        this.field3696.method1564(this.field3697, (byte) -119);
        super.finalize();
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V", line = 52)
    public static final void method1733(byte arg0) {
        int var1 = -121 % ((-arg0 - 31) / 55);
        field3700++;
        if (class524.field7615) {
            return;
        }
        class524.field7615 = true;
        class421.field6304 = true;
        if (class595.field8694.field6547) {
            class388.field5967 = ((int) class388.field5967 + 191 & 0xFFFFFF80);
        } else {
            class65.field719 += (24.0F - class65.field719) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 76)
    public static void method1734(int arg0) {
        field3707 = null;
        field3705 = null;
        field3701 = null;
        field3706 = null;
        field3704 = null;
        if (arg0 >= 0) {
            method1734(-63);
        }
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lgf;II)V", line = 91)
    public class260(class234 arg0, int arg1, int arg2) {
        this.field3697 = arg2;
        this.field3696 = arg0;
    }
}
