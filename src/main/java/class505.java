import java.awt.Color;
import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public abstract class class505 {

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "[Ljava/awt/Color;")
    public static Color[] field7506 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "F")
    public static float field7510;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field7503;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public static int field7505;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    public static int field7507;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "I")
    public static int field7508;

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
    public int field7509;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "I")
    public int field7511;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "I")
    public int field7512;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
    public static int field7513;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "I")
    public static int field7514;

    // $FF: synthetic field
    @OriginalMember(owner = "client!mp", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field7515;

    // $FF: synthetic method
    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3019(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Z", line = 5)
    public static final boolean method3011(Class arg0, byte arg1, String arg2) {
        field7508++;
        Class var3 = (Class) class372.field5157.get(arg2);
        if (var3 != null) {
            return var3.getClassLoader() == arg0.getClassLoader();
        }
        int var4 = 7 / ((arg1 - 66) / 54);
        File var5 = null;
        if (var5 == null) {
            var5 = (File) class31.field456.get(arg2);
        }
        if (var5 != null) {
            try {
                var5 = new File(var5.getCanonicalPath());
                Class var6 = Class.forName("java.lang.Runtime");
                Class var7 = Class.forName("java.lang.reflect.AccessibleObject");
                Method var8 = var7.getDeclaredMethod("setAccessible", Boolean.TYPE);
                Method var9 = var6.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                var8.invoke(var9, Boolean.TRUE);
                var9.invoke(Runtime.getRuntime(), arg0, var5.getPath());
                var8.invoke(var9, Boolean.FALSE);
                class372.field5157.put(arg2, arg0);
                return true;
            } catch (NoSuchMethodException var10) {
                System.load(var5.getPath());
                class372.field5157.put(arg2, field7515 == null ? (field7515 = method3019("ofa")) : field7515);
                return true;
            } catch (Throwable var11) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IBILis;)V", line = 73)
    public static final void method3012(int arg0, byte arg1, int arg2, class101 arg3) {
        field7513++;
        if (arg3 == null) {
            return;
        }
        if (arg3.field1633 != null) {
            class400 var4 = new class400();
            var4.field5783 = arg3;
            var4.field5790 = arg3.field1633;
            class362.method2171(var4);
        }
        class700.field9918 = arg2;
        class510.field7581 = arg0;
        class324.field4521 = arg3.field1505;
        class595.field8622 = arg3.field1565;
        class25.field346 = arg3.field1497;
        class41.field555 = true;
        class395.field5705 = arg3.field1577;
        int var5 = -46 / ((-arg1 - 12) / 58);
        class199.field3091 = arg3.field1528;
        class326.method1948(1, arg3);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V", line = 105)
    public static void method3013(int arg0) {
        field7506 = null;
        if (arg0 != 0) {
            field7510 = 1.6878508F;
        }
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(I)Z", line = 121)
    public final boolean method3014(int arg0) {
        if (arg0 <= 6) {
            method3012(47, (byte) -109, 28, null);
        }
        field7505++;
        return (this.field7509 & 0x8) != 0;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)Z", line = 136)
    public final boolean method3015(byte arg0) {
        if (arg0 >= -8) {
            this.method3016(false);
        }
        field7507++;
        return (this.field7509 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Z)Z", line = 150)
    public final boolean method3016(boolean arg0) {
        field7504++;
        if (!arg0) {
            field7506 = null;
        }
        return (this.field7509 & 0x4) != 0;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(IB)V", line = 164)
    public static final void method3017(int arg0, byte arg1) {
        int var2 = 115 / ((arg1 - 19) / 38);
        class34.field480 = -1;
        field7514++;
        class371.field5147 = -1;
        class404.field5808 = arg0;
        class105.method881((byte) -37);
    }

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "(I)Z", line = 184)
    public final boolean method3018(int arg0) {
        if (arg0 <= 31) {
            field7506 = null;
        }
        field7503++;
        return (this.field7509 & 0x1) != 0;
    }
}
