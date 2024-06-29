import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class612 {

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "I")
    public int field8609;

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "Loea;")
    public static class612 field8613 = new class612(1);

    @OriginalMember(owner = "client!oea", name = "g", descriptor = "Loea;")
    public static class612 field8614 = new class612(2);

    @OriginalMember(owner = "client!oea", name = "h", descriptor = "Loea;")
    public static class612 field8615 = new class612(4);

    @OriginalMember(owner = "client!oea", name = "i", descriptor = "Loea;")
    public static class612 field8616 = new class612(1);

    @OriginalMember(owner = "client!oea", name = "j", descriptor = "Loea;")
    public static class612 field8617 = new class612(2);

    @OriginalMember(owner = "client!oea", name = "k", descriptor = "Loea;")
    public static class612 field8618 = new class612(4);

    @OriginalMember(owner = "client!oea", name = "l", descriptor = "Loea;")
    public static class612 field8619 = new class612(2);

    @OriginalMember(owner = "client!oea", name = "m", descriptor = "Loea;")
    public static class612 field8620 = new class612(4);

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "I")
    public static int field8608;

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "I")
    public static int field8610;

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "I")
    public static int field8611;

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "I")
    public static int field8612;

    @OriginalMember(owner = "client!oea", name = "n", descriptor = "I")
    public static int field8621;

    @OriginalMember(owner = "client!oea", name = "p", descriptor = "I")
    public static int field8623;

    // $FF: synthetic field
    @OriginalMember(owner = "client!oea", name = "q", descriptor = "Ljava/lang/Class;")
    public static Class field8624;

    @OriginalMember(owner = "client!oea", name = "o", descriptor = "[Lho;")
    public static class318[] field8622;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method3539(long arg0, byte arg1) {
        field8608++;
        if (arg1 <= 17) {
            return null;
        } else if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg0; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg0 != 0L) {
                long var7 = arg0;
                arg0 /= 37L;
                char var9 = class743.field10244[(int) (var7 - (arg0 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    var9 = ' ';
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(ZIIII)V")
    public static final void method3540(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field8611++;
        class17 var5 = class245.method1634(1, (long) arg3, 8);
        var5.method66((byte) 32);
        var5.field107 = arg4;
        var5.field105 = arg2;
        var5.field104 = arg1;
        if (arg0) {
            field8622 = null;
        }
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "(I)V")
    private class612(int arg0) {
        this.field8609 = arg0;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V")
    public static void method3541(int arg0) {
        field8620 = null;
        field8614 = null;
        field8618 = null;
        field8619 = null;
        field8613 = null;
        field8615 = null;
        field8617 = null;
        field8622 = null;
        if (arg0 != 0) {
            field8621 = 96;
        }
        field8616 = null;
    }

    @OriginalMember(owner = "client!oea", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8612++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(ZZLjava/awt/Component;)Lrja;")
    public static final class45 method3542(boolean arg0, boolean arg1, Component arg2) {
        field8610++;
        try {
            Constructor var3 = Class.forName("maa").getDeclaredConstructor(field8624 == null ? (field8624 = method3543("java.awt.Component")) : field8624, Boolean.TYPE);
            return (class45) var3.newInstance(arg2, Boolean.valueOf(arg0));
        } catch (Throwable var4) {
            if (!arg1) {
                method3542(false, true, null);
            }
            return new class205(arg2, arg0);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3543(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
