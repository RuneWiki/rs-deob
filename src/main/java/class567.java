import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gm")
public class class567 extends class172 {

    @OriginalMember(owner = "client!gm", name = "t", descriptor = "I")
    private int field7993 = -1;

    @OriginalMember(owner = "client!gm", name = "s", descriptor = "I")
    public static int field7992 = 0;

    @OriginalMember(owner = "client!gm", name = "o", descriptor = "I")
    public static int field7988;

    @OriginalMember(owner = "client!gm", name = "p", descriptor = "I")
    public static int field7989;

    @OriginalMember(owner = "client!gm", name = "q", descriptor = "I")
    public static int field7990;

    @OriginalMember(owner = "client!gm", name = "r", descriptor = "I")
    private int field7991;

    @OriginalMember(owner = "client!gm", name = "u", descriptor = "I")
    public static int field7994;

    @OriginalMember(owner = "client!gm", name = "v", descriptor = "I")
    public static int field7995;

    @OriginalMember(owner = "client!gm", name = "w", descriptor = "I")
    private int field7996;

    @OriginalMember(owner = "client!gm", name = "x", descriptor = "I")
    private int field7997;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gm", name = "y", descriptor = "Ljava/lang/Class;")
    public static Class field7998;

    // $FF: synthetic method
    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3342(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(ILgga;)V", line = 7)
    public final void method102(int arg0, class511 arg1) {
        if (arg0 != 2048) {
            return;
        }
        this.field7993 = arg1.method3002(-1);
        field7990++;
        this.field7991 = arg1.method3008(64);
        this.field7997 = arg1.method3013(arg0 ^ 0xFFFFF79C);
        this.field7996 = arg1.method3013(-127);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Lha;Z)V", line = 22)
    public static final void method3339(class473 arg0, boolean arg1) {
        field7994++;
        int var2 = 0;
        int var3 = 0;
        if (class55.field651) {
            var2 = class236.method1611(-5110);
            var3 = class339.method2149((byte) 63);
        }
        int var4 = -10660793;
        class122.method860(class788.field10819, class221.field3026 + var3, -16777216, var4, class689.field9609 + var2, arg0, -1, class625.field8753);
        if (!arg1) {
            method3339(null, true);
        }
        class386.field5515.method2653(class221.field3026 + var3 + 14, 103, var4, -1, class689.field9609 + var2 + 3, class712.field9877.method3999(class553.field7667, (byte) -39));
        int var5 = var2 + class205.field2881.method354((byte) -20);
        int var6 = var3 + class205.field2881.method351(-25269);
        if (class48.field577) {
            int var7 = 0;
            for (class498 var8 = (class498) class362.field5218.method1140(-107); var8 != null; var8 = (class498) class362.field5218.method1138(126)) {
                int var12 = class221.field3026 + var3 + (var7 * 16) + 31;
                if (var8.field6833 == 1) {
                    class550.method3248(class689.field9609 + var2, var6, (class171) var8.field6826.field2266.field591, var12, -1, -256, class625.field8753, (byte) -125, var5, class788.field10819, arg0, class221.field3026 + var3);
                } else {
                    class226.method1520(var6, class221.field3026 + var3, class689.field9609 + var2, arg0, var12, var5, -256, class788.field10819, -1, class625.field8753, 20279, var8);
                }
                var7++;
            }
            if (class694.field9684 != null) {
                class122.method860(class339.field4914, class79.field894, -16777216, var4, class49.field587, arg0, -1, class78.field874);
                int var9 = 0;
                class386.field5515.method2653(class79.field894 + 14, 111, var4, -1, class49.field587 + 3, class694.field9684.field6827);
                for (class171 var10 = (class171) class694.field9684.field6826.method1140(-123); var10 != null; var10 = (class171) class694.field9684.field6826.method1138(127)) {
                    int var11 = var9 * 16 + class79.field894 + 31;
                    var9++;
                    class550.method3248(class49.field587, var6, var10, var11, -1, -256, class78.field874, (byte) -120, var5, class339.field4914, arg0, class79.field894);
                }
                class298.method1946(class339.field4914, 12589, class78.field874, class79.field894, class49.field587);
            }
        } else {
            int var13 = 0;
            for (class171 var14 = (class171) class646.field9038.method1041(1048832); var14 != null; var14 = (class171) class646.field9038.method1033(-1)) {
                int var15 = class221.field3026 + var3 - (-31 - (-var13 + class640.field8992 + -1) * 16);
                var13++;
                class550.method3248(class689.field9609 + var2, var6, var14, var15, -1, -256, class625.field8753, (byte) 92, var5, class788.field10819, arg0, class221.field3026 + var3);
            }
        }
        class298.method1946(class788.field10819, 12589, class625.field8753, class221.field3026 + var3, class689.field9609 - -var2);
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(BLhia;)V", line = 116)
    public final void method100(byte arg0, class48 arg1) {
        arg1.method394((byte) -27, this.field7991, this.field7996, this.field7993, this.field7997);
        if (arg0 != 71) {
            field7992 = 3;
        }
        field7988++;
    }

    @OriginalMember(owner = "client!gm", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)Z", line = 129)
    public static final boolean method3340(Class arg0, int arg1, String arg2) {
        if (arg1 != -13930) {
            method3341(-84);
        }
        field7989++;
        Class var3 = (Class) class644.field9022.get(arg2);
        if (var3 != null) {
            return var3.getClassLoader() == arg0.getClassLoader();
        }
        File var4 = null;
        if (var4 == null) {
            var4 = (File) class722.field9959.get(arg2);
        }
        if (var4 != null) {
            try {
                var4 = new File(var4.getCanonicalPath());
                Class var5 = Class.forName("java.lang.Runtime");
                Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
                Method var7 = var6.getDeclaredMethod("setAccessible", Boolean.TYPE);
                Method var8 = var5.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                var7.invoke(var8, Boolean.TRUE);
                var8.invoke(Runtime.getRuntime(), arg0, var4.getPath());
                var7.invoke(var8, Boolean.FALSE);
                class644.field9022.put(arg2, arg0);
                return true;
            } catch (NoSuchMethodException var9) {
                System.load(var4.getPath());
                class644.field9022.put(arg2, field7998 == null ? (field7998 = method3342("dv")) : field7998);
                return true;
            } catch (Throwable var10) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gm", name = "b", descriptor = "(I)V", line = 206)
    public static final void method3341(int arg0) {
        field7995++;
        if (arg0 <= 111) {
            method3339(null, false);
        }
        class39 var1 = class4.field26;
        synchronized (class4.field26) {
            class4.field26.method314(-2);
        }
    }
}
