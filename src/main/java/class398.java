import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public abstract class class398 {

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "I")
    public int field5864;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public int field5857;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public int field5863;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "I")
    public static int field5855 = 0;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5860 = "cyan:";

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "Lfg;")
    public static class18 field5858 = new class18(50);

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "I")
    public static int field5862;

    // $FF: synthetic field
    @OriginalMember(owner = "client!fa", name = "k", descriptor = "Ljava/lang/Class;")
    public static Class field5865;

    // $FF: synthetic method
    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2542(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 4)
    public static void method2538(byte arg0) {
        if (arg0 != -75) {
            method2541(-11);
        }
        field5858 = null;
        field5860 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lvj;B)V", line = 24)
    public static final void method2539(class177 arg0, byte arg1) {
        field5859++;
        class354.field5039 = 3;
        class58.method453(true, arg1 + 43);
        class151.field2315 = 127;
        class360.field5139 = 0;
        class319.field4614 = 0;
        class321.field4641 = 255;
        class322.field4645 = true;
        class169.field2515 = true;
        class59.field946 = true;
        class242.field3530 = 127;
        class428.field6199 = true;
        class7.field99 = 0;
        class280.field4196 = true;
        class47.field758 = true;
        if (arg1 != 7) {
            method2539((class177) null, (byte) 116);
        }
        class303.field4424 = true;
        class331.field4757 = 0;
        class451.field6550 = true;
        class110.field1793 = true;
        class339.field4830 = 1;
        class310.field4525 = true;
        class238.field3438 = 2;
        if (class75.field1288 < 96) {
            class447.method2796(0, arg1 - 100);
        } else {
            class447.method2796(2, -102);
        }
        class230.field3364 = 2;
        class33.field476 = true;
        class200.field2919 = 0;
        class436.field6356 = 0;
        class282.field4224 = true;
        class12.field197 = false;
        class62.field1007 = 2;
        class324.field4673 = false;
        class13.field220 = false;
        class184 var2 = null;
        try {
            class131 var3 = arg0.method1375((byte) 117);
            while (var3.field2121 == 0) {
                class134.method1106(1L, 10);
            }
            if (var3.field2121 == 1) {
                var2 = (class184) var3.field2125;
                byte[] var4 = new byte[(int) var2.method1435(-1)];
                int var6;
                for (int var5 = 0; var5 < var4.length; var5 += var6) {
                    var6 = var2.method1434(var4.length - var5, 99, var4, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class66.method506(false, new class37(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1431(-1);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZB)I", line = 110)
    public static final int method2540(boolean arg0, byte arg1) {
        field5861++;
        long var2 = class10.method63(-21149);
        int var4 = -26 / ((arg1 + 68) / 43);
        for (class79 var5 = arg0 ? (class79) class190.field2821.method1222(5656) : (class79) class190.field2821.method1224((byte) -101); var5 != null; var5 = (class79) class190.field2821.method1224((byte) -123)) {
            if ((var5.field1341 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var5.field1341 & 0x4000000000000000L) != 0L) {
                    int var6 = (int) var5.field499;
                    class351.field4988[var6] = class351.field4987[var6];
                    var5.method251(121);
                    return var6;
                }
                var5.method251(41);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 148)
    public static final void method2541(int arg0) {
        field5856++;
        try {
            Method var1 = (field5865 == null ? (field5865 = method2542("java.lang.Runtime")) : field5865).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class75.field1288 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(III)V", line = 180)
    public class398(int arg0, int arg1, int arg2) {
        this.field5864 = arg2;
        this.field5857 = arg0;
        this.field5863 = arg1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIB)V")
    public abstract void method23(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(III)V")
    public abstract void method28(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(III)V")
    public abstract void method25(int arg0, int arg1, int arg2);
}
