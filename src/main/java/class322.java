import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dda")
public class class322 extends class454 {

    @OriginalMember(owner = "client!dda", name = "G", descriptor = "[I")
    public static int[] field4656 = new int[50];

    @OriginalMember(owner = "client!dda", name = "J", descriptor = "Lea;")
    public static class474 field4659 = new class474(" from your friends list first.", " zuerst von deiner Freunde-Liste!", " de votre liste d'amis.", " da sua lista de amigos primeiro.");

    @OriginalMember(owner = "client!dda", name = "M", descriptor = "Lkca;")
    public static class73 field4662 = new class73(74, 1);

    @OriginalMember(owner = "client!dda", name = "C", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!dda", name = "E", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!dda", name = "F", descriptor = "I")
    public static int field4655;

    @OriginalMember(owner = "client!dda", name = "H", descriptor = "I")
    public static int field4657;

    @OriginalMember(owner = "client!dda", name = "K", descriptor = "I")
    public static int field4660;

    @OriginalMember(owner = "client!dda", name = "L", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!dda", name = "N", descriptor = "I")
    public static int field4663;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dda", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field4664;

    @OriginalMember(owner = "client!dda", name = "I", descriptor = "[B")
    private byte[] field4658;

    // $FF: synthetic method
    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2105(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!dda", name = "<init>", descriptor = "()V", line = 3)
    public class322() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IIII)[B", line = 7)
    public final byte[] method2099(int arg0, int arg1, int arg2, int arg3) {
        this.field4658 = new byte[arg0 * arg1 * arg3 * 2];
        field4655++;
        this.method2905(arg0, arg1, (byte) -89, arg3);
        return arg2 == 1 ? this.field4658 : null;
    }

    @OriginalMember(owner = "client!dda", name = "f", descriptor = "(I)V", line = 23)
    public static final void method2100(int arg0) {
        if (arg0 != 96) {
            method2104(true);
        }
        field4657++;
        if (class20.field197.field7802) {
            class362.field5189 = 96;
            return;
        }
        try {
            Method var1 = (field4664 == null ? (field4664 = method2105("java.lang.Runtime")) : field4664).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class362.field5189 = (int) (var3 / 1048576L) + 1;
                    return;
                } catch (Throwable var4) {
                    return;
                }
            }
        } catch (Exception var5) {
            return;
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(BII)V", line = 56)
    public final void method2101(byte arg0, int arg1, int arg2) {
        field4663++;
        int var4 = arg1 * 2;
        if (arg2 != 2074826817) {
            method2103(-97, true, 71);
        }
        byte var5 = (byte) (((arg0 & 0xFF) >> 1) + 127);
        this.field4658[var4++] = var5;
        this.field4658[var4] = var5;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(II)I", line = 71)
    public static final int method2102(int arg0, int arg1) {
        field4653++;
        if (arg1 != 127) {
            method2100(-47);
        }
        return arg0 & 0x7F;
    }

    @OriginalMember(owner = "client!dda", name = "a", descriptor = "(IZI)Lqf;", line = 84)
    public static final class593 method2103(int arg0, boolean arg1, int arg2) {
        field4654++;
        if (arg1) {
            return null;
        }
        class593 var3 = class259.method1728(40, arg2);
        if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field8512 == null || var3.field8512.length <= arg0) {
            return null;
        } else {
            return var3.field8512[arg0];
        }
    }

    @OriginalMember(owner = "client!dda", name = "b", descriptor = "(Z)V", line = 113)
    public static void method2104(boolean arg0) {
        field4656 = null;
        if (arg0) {
            method2102(-29, -27);
        }
        field4662 = null;
        field4659 = null;
    }
}
