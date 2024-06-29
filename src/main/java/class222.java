import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public abstract class class222 extends class108 {

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "Lcb;")
    public static class318 field2872 = new class318(49, -2);

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field2874 = 0;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field2871;

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "Luo;")
    public static class207 field2875;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 7)
    public static final int method1360(String arg0, byte arg1) {
        field2873++;
        if (!class596.field8163.field1356) {
            return -1;
        } else if (class285.field3858.containsKey(arg0)) {
            return 100;
        } else {
            String var2 = class139.method960(false, arg0);
            int var3 = 122 % ((-arg1 - 13) / 43);
            if (var2 == null) {
                return -1;
            }
            String var4 = class518.field7140 + var2;
            if (!class448.field6139.method1064("", var4, (byte) -120)) {
                return -1;
            } else if (class448.field6139.method1083(-76, var4)) {
                byte[] var5 = class448.field6139.method1063(var4, "", -127);
                File var6 = class583.method3268(-3, var2);
                if (var5 == null || var6 == null) {
                    return -1;
                }
                boolean var7 = true;
                byte[] var8 = class519.method2958((byte) 101, var6);
                if (var8 != null && var5.length == var8.length) {
                    for (int var9 = 0; var9 < var8.length; var9++) {
                        if (var5[var9] != var8[var9]) {
                            var7 = false;
                            break;
                        }
                    }
                } else {
                    var7 = false;
                }
                try {
                    if (!var7) {
                        class596.field8163.method618(var5, var6, 8239);
                    }
                } catch (Throwable var10) {
                    return -1;
                }
                class668.method3707(arg0, 2, var6);
                return 100;
            } else {
                return class448.field6139.method1073(0, var4);
            }
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V", line = 94)
    public static void method1361(byte arg0) {
        field2872 = null;
        field2875 = null;
        if (arg0 >= -67) {
            method1360(null, (byte) 39);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IBIIIII)V", line = 105)
    public static final void method1362(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class563.field7704 = arg3;
        if (arg1 > -125) {
            method1362(93, (byte) -97, 124, 25, -103, 12, 3);
        }
        class352.field5143 = arg4;
        field2871++;
        class615.field8390 = arg0;
        class575.field7946 = arg5;
        class322.field4719 = arg6;
        class380.field5456 = arg2;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)Lvea;")
    public abstract class64 method765(int arg0);
}
