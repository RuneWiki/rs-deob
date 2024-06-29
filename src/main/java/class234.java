import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class234 {

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "Ljp;")
    public static class55 field3510 = new class55(83, -2);

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "Lpu;")
    public static class179 field3512 = new class179("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "[I")
    public static int[] field3513 = new int[1024];

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "Ljp;")
    public static class55 field3514 = new class55(73, 8);

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "[[I")
    public static int[][] field3517 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3516 = null;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "Ld;")
    public static class242 field3515 = new class242(64);

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field3511;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ki", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field3518;

    // $FF: synthetic method
    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1588(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)Lli;", line = 3)
    public static final class389 method1583(byte arg0) {
        field3509++;
        if (arg0 != -7) {
            return null;
        }
        try {
            return new class204();
        } catch (Throwable var2) {
            try {
                return (class389) Class.forName("bi").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class239();
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V", line = 31)
    public static void method1584(byte arg0) {
        field3513 = null;
        field3510 = null;
        field3512 = null;
        field3517 = null;
        field3514 = null;
        if (arg0 != 22) {
            field3517 = null;
        }
        field3516 = null;
        field3515 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIBI)Z", line = 49)
    public static final boolean method1585(int arg0, int arg1, byte arg2, int arg3) {
        field3511++;
        int var4 = 79 / (arg2 / 33);
        boolean var5 = true;
        class161 var6 = (class161) class454.method2781(arg0, arg1, arg3);
        if (var6 != null) {
            var5 &= class68.method493(var6, -1);
        }
        class161 var7 = (class161) class35.method217(arg0, arg1, arg3, field3518 == null ? (field3518 = method1588("bs")) : field3518);
        if (var7 != null) {
            var5 &= class68.method493(var7, -1);
        }
        class161 var8 = (class161) class404.method2542(arg0, arg1, arg3);
        if (var8 != null) {
            var5 &= class68.method493(var8, -1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(BII)Z", line = 79)
    public static final boolean method1586(byte arg0, int arg1, int arg2) {
        field3507++;
        if ((class181.method1269(false, arg1, arg2) | (arg2 & 0x10000) != 0) || class262.method1833(30000, arg1, arg2)) {
            return true;
        } else {
            if (arg0 != -66) {
                field3516 = null;
            }
            return (arg1 & 0x37) == 0 && class229.method1555(arg2, arg1, (byte) 121);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lgt;ILjava/awt/Frame;)V", line = 94)
    public static final void method1587(class66 arg0, int arg1, Frame arg2) {
        if (arg1 < 6) {
            field3517 = null;
        }
        field3508++;
        while (true) {
            class329 var3 = arg0.method453(arg2, (byte) -21);
            while (var3.field4974 == 0) {
                class468.method2848(10L, (byte) 65);
            }
            if (var3.field4974 == 1) {
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class468.method2848(100L, (byte) -55);
        }
    }
}
