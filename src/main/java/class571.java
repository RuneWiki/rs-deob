import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dca")
public class class571 {

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "Ldca;")
    public static class571 field7216 = new class571();

    @OriginalMember(owner = "client!dca", name = "e", descriptor = "Ldca;")
    public static class571 field7220 = new class571();

    @OriginalMember(owner = "client!dca", name = "f", descriptor = "Ldca;")
    public static class571 field7221 = new class571();

    @OriginalMember(owner = "client!dca", name = "g", descriptor = "Ldca;")
    public static class571 field7222 = new class571();

    @OriginalMember(owner = "client!dca", name = "i", descriptor = "Luw;")
    public static class208 field7224 = new class208(23, -2);

    @OriginalMember(owner = "client!dca", name = "k", descriptor = "I")
    public static int field7226 = 0;

    @OriginalMember(owner = "client!dca", name = "j", descriptor = "I")
    public static int field7225 = -1;

    @OriginalMember(owner = "client!dca", name = "b", descriptor = "I")
    public static int field7217;

    @OriginalMember(owner = "client!dca", name = "c", descriptor = "I")
    public static int field7218;

    @OriginalMember(owner = "client!dca", name = "d", descriptor = "I")
    public static int field7219;

    @OriginalMember(owner = "client!dca", name = "h", descriptor = "Lvg;")
    public static class199 field7223;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dca", name = "l", descriptor = "Ljava/lang/Class;")
    public static Class field7227;

    // $FF: synthetic method
    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3083(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(Z)V", line = 7)
    public static void method3080(boolean arg0) {
        field7220 = null;
        field7224 = null;
        field7216 = null;
        field7223 = null;
        field7221 = null;
        field7222 = null;
        if (arg0) {
            field7220 = null;
        }
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(ILwm;)I", line = 23)
    public static final int method3081(int arg0, class30 arg1) {
        field7217++;
        int var2 = 0;
        if (arg1.method130(-2, class570.field7195)) {
            var2++;
        }
        if (arg1.method130(-2, class674.field8728)) {
            var2++;
        }
        if (arg1.method130(-2, class547.field6840)) {
            var2++;
        }
        if (arg1.method130(-2, class567.field7178)) {
            var2++;
        }
        if (arg1.method130(-2, class195.field2704)) {
            var2++;
        }
        if (arg1.method130(-2, class562.field7148)) {
            var2++;
        }
        if (arg1.method130(-2, class545.field6823)) {
            var2++;
        }
        if (arg1.method130(-2, class63.field828)) {
            var2++;
        }
        if (arg1.method130(-2, class122.field1643)) {
            var2++;
        }
        if (arg1.method130(-2, class755.field10292)) {
            var2++;
        }
        if (arg1.method130(-2, class659.field8611)) {
            var2++;
        }
        if (arg1.method130(-2, class322.field3987)) {
            var2++;
        }
        if (arg1.method130(-2, class264.field3520)) {
            var2++;
        }
        if (arg1.method130(-2, class369.field4529)) {
            var2++;
        }
        if (arg1.method130(arg0 + arg0, class297.field3763)) {
            var2++;
        }
        if (arg1.method130(-2, class655.field8446)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dca", name = "toString", descriptor = "()Ljava/lang/String;", line = 98)
    public final String toString() {
        field7218++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dca", name = "a", descriptor = "(I)V", line = 112)
    public static final void method3082(int arg0) {
        if (arg0 != 0) {
            method3081(-103, null);
        }
        field7219++;
        if (class740.field10014.field10581) {
            class91.field1248 = 96;
            return;
        }
        try {
            Method var1 = (field7227 == null ? (field7227 = method3083("java.lang.Runtime")) : field7227).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class91.field1248 = (int) (var3 / 1048576L) + 1;
                    return;
                } catch (Throwable var4) {
                    return;
                }
            }
        } catch (Exception var5) {
            return;
        }
    }
}
