import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class313 {

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field4476 = 0;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Lcga;")
    public static class485 field4474 = new class485();

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "[Ljn;")
    public static class720[] field4477;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V", line = 11)
    public static final void method1916(String arg0, byte arg1, String arg2) {
        class758.field10539 = -1;
        if (arg1 != 26) {
            method1917(90);
        }
        field4473++;
        class120.field1919 = 1;
        class121.method976(false, arg2, (byte) 16, arg0);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 24)
    public static void method1917(int arg0) {
        field4474 = null;
        field4477 = null;
        if (arg0 != 0) {
            field4476 = -114;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIILd;Lwu;Ljava/awt/Canvas;)Lha;", line = 36)
    public static final class59 method1918(int arg0, int arg1, int arg2, class152 arg3, class376 arg4, Canvas arg5) {
        field4472++;
        int var6 = arg1;
        int var7 = 0;
        if (arg5 != null) {
            Dimension var8 = arg5.getSize();
            var6 = var8.width;
            var7 = var8.height;
        }
        return class59.method422(var6, var7, arg2, (byte) -107, arg3, arg4, arg0, arg5);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIILwu;)Lrc;", line = 58)
    public static final class539 method1919(int arg0, int arg1, int arg2, class376 arg3) {
        field4475++;
        if (arg1 >= -126) {
            return null;
        } else {
            byte[] var4 = arg3.method2218((byte) 116, arg2, arg0);
            return var4 == null ? null : new class539(var4);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V", line = 75)
    public static final void method1920(boolean arg0) {
        if (!arg0) {
            field4476 = 42;
        }
        field4471++;
        int var1 = 0;
        if (class411.field5711 != null) {
            var1 = class411.field5711.field3874.method1838(true);
        }
        if (var1 == 2) {
            int var2 = class201.field3018 > 800 ? 800 : class201.field3018;
            int var3 = class749.field10428 <= 600 ? class749.field10428 : 600;
            class228.field3251 = var2;
            class348.field4882 = (class201.field3018 - var2) / 2;
            class733.field10148 = 0;
            class199.field2993 = var3;
        } else if (var1 == 1) {
            int var4 = class201.field3018 <= 1024 ? class201.field3018 : 1024;
            class348.field4882 = (class201.field3018 - var4) / 2;
            int var5 = class749.field10428 > 768 ? 768 : class749.field10428;
            class228.field3251 = var4;
            class733.field10148 = 0;
            class199.field2993 = var5;
        } else {
            class733.field10148 = 0;
            class348.field4882 = 0;
            class228.field3251 = class201.field3018;
            class199.field2993 = class749.field10428;
        }
    }
}
