import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class505 extends OutputStream {

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "Ljava/util/Calendar;")
    public static Calendar field7045 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "I")
    public static int field7046;

    @OriginalMember(owner = "client!eba", name = "f", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!eba", name = "g", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!eba", name = "h", descriptor = "Lan;")
    public static class21 field7049;

    // $FF: synthetic field
    @OriginalMember(owner = "client!eba", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field7050;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(BLgq;)V")
    public static final void method2920(byte arg0, class438 arg1) {
        field7048++;
        if (arg0 != 1) {
            field7049 = null;
        }
        if (class356.field4807 == null) {
            return;
        }
        class115 var2 = null;
        if (arg1.field6222 == 0) {
            var2 = (class115) class265.method1739(arg1.field6224, arg1.field6220, arg1.field6213);
        }
        if (arg1.field6222 == 1) {
            var2 = (class115) class548.method3127(arg1.field6224, arg1.field6220, arg1.field6213);
        }
        if (arg1.field6222 == 2) {
            var2 = (class115) class582.method3324(arg1.field6224, arg1.field6220, arg1.field6213, field7050 == null ? (field7050 = method2925("wf")) : field7050);
        }
        if (arg1.field6222 == 3) {
            var2 = (class115) class404.method2411(arg1.field6224, arg1.field6220, arg1.field6213);
        }
        if (var2 == null) {
            arg1.field6215 = -1;
            arg1.field6211 = 0;
            arg1.field6219 = 0;
        } else {
            arg1.field6215 = var2.method748(false);
            arg1.field6211 = var2.method752(true);
            arg1.field6219 = var2.method749(arg0 ^ 0x5E83);
        }
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Z)V")
    public static void method2921(boolean arg0) {
        field7045 = null;
        if (arg0) {
            method2924(-111, (byte) -19, true, 121, 121, -105, null);
        }
        field7049 = null;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)[Laf;")
    public static final class368[] method2922(int arg0) {
        if (arg0 != 1) {
            field7049 = null;
        }
        if (class428.field6071 == null) {
            class368[] var1 = class97.method692(class500.field6968, (byte) 105);
            class368[] var2 = new class368[var1.length];
            int var3 = 0;
            label66: for (int var4 = 0; var4 < var1.length; var4++) {
                class368 var8 = var1[var4];
                if ((var8.field5004 <= 0 || var8.field5004 >= 24) && var8.field5008 >= 800 && var8.field5009 >= 600 && (class366.field4987 >= 96 || class103.field1570 != 0 || var8.field5008 <= 1024 && var8.field5009 <= 768)) {
                    for (int var9 = 0; var9 < var3; var9++) {
                        class368 var10 = var2[var9];
                        if (var8.field5008 == var10.field5008 && var8.field5009 == var10.field5009) {
                            if (var10.field5004 < var8.field5004) {
                                var2[var9] = var8;
                            }
                            continue label66;
                        }
                    }
                    var2[var3] = var8;
                    var3++;
                }
            }
            class428.field6071 = new class368[var3];
            class416.method2497(var2, 0, class428.field6071, 0, var3);
            int[] var5 = new int[class428.field6071.length];
            for (int var6 = 0; var6 < class428.field6071.length; var6++) {
                class368 var7 = class428.field6071[var6];
                var5[var6] = var7.field5009 * var7.field5008;
            }
            class352.method2112(var5, class428.field6071, (byte) -55);
        }
        field7047++;
        return class428.field6071;
    }

    @OriginalMember(owner = "client!eba", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field7042++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(III)Z")
    public static final boolean method2923(int arg0, int arg1, int arg2) {
        field7044++;
        if (arg1 != 262144) {
            method2920((byte) -24, null);
        }
        return (arg2 & 0x40000) != 0 | class26.method295(false, arg2, arg0) || class191.method1190((byte) -25, arg2, arg0);
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(IBZIIILan;)V")
    public static final void method2924(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5, class21 arg6) {
        class47.field903 = arg4;
        class112.field1726 = 1;
        class291.field4011 = arg6;
        field7046++;
        class5.field70 = arg0;
        if (arg1 != -98) {
            return;
        }
        class503.field6996 = arg2;
        class467.field6585 = arg5;
        class587.field8397 = class218.field3105.method3491(75) / arg3;
        if (class587.field8397 < 1) {
            class587.field8397 = 1;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2925(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
