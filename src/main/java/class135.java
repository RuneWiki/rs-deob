import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class135 {

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field1874 = -1;

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "[S")
    public static short[] field1883 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "Lgq;")
    public static class418 field1877 = new class418(64);

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IIIIB)V")
    public static final void method845(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg2 >= class379.field5521 && arg2 <= class125.field1751) {
            int var5 = class304.method2068(class87.field1227, arg3, -95, class299.field4382);
            int var6 = class304.method2068(class87.field1227, arg1, -120, class299.field4382);
            class201.method1190(arg0, var5, arg2, var6, 32767);
        }
        if (arg4 == -127) {
            field1876++;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I[Ljava/lang/String;[S)V")
    public static final void method846(int arg0, String[] arg1, short[] arg2) {
        class45.method324(124, arg1, arg2, arg1.length - 1, 0);
        if (arg0 != 8851) {
            field1877 = null;
        }
        field1879++;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "([[IZ)V")
    public static final void method847(int[][] arg0, boolean arg1) {
        if (arg1) {
            class384.field5560 = arg0;
            field1880++;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)I")
    public static final int method848(int arg0, int arg1, int arg2) {
        if (arg2 == -13496) {
            field1878++;
            int var3 = arg1 >>> 31;
            return (arg1 + var3) / arg0 - var3;
        } else {
            return 83;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V")
    public static final void method849(byte arg0) {
        if (arg0 >= -110) {
            field1877 = null;
        }
        field1875++;
        if (class207.field2787) {
            return;
        }
        class172.field2303 = true;
        if (class184.field2496) {
            class317.field4647 = (float) ((int) class317.field4647 - 17 & 0xFFFFFFF0);
        } else {
            class191.field2559 += (-class191.field2559 - 12.0F) / 2.0F;
        }
        class207.field2787 = true;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method850(byte arg0, String arg1, String arg2, String arg3) {
        field1881++;
        int var4 = 118 % ((-arg0 - 37) / 55);
        for (int var5 = arg3.indexOf(arg1); var5 != -1; var5 = arg3.indexOf(arg1, var5 + arg2.length())) {
            arg3 = arg3.substring(0, var5) + arg2 + arg3.substring(var5 + arg1.length());
        }
        return arg3;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V")
    public static void method851(int arg0) {
        field1877 = null;
        if (arg0 != -17) {
            field1877 = null;
        }
        field1883 = null;
    }
}
