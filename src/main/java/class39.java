import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class39 extends class165 {

    @OriginalMember(owner = "client!mm", name = "D", descriptor = "Ljava/lang/String;")
    public static String field508 = "yellow:";

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "I")
    public static int field502 = 0;

    @OriginalMember(owner = "client!mm", name = "A", descriptor = "Ljava/lang/String;")
    public static String field506 = "green:";

    @OriginalMember(owner = "client!mm", name = "J", descriptor = "I")
    public static int field514 = -2;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "I")
    public int field498;

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!mm", name = "y", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!mm", name = "B", descriptor = "I")
    public int field507;

    @OriginalMember(owner = "client!mm", name = "F", descriptor = "I")
    public int field510;

    @OriginalMember(owner = "client!mm", name = "H", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!mm", name = "I", descriptor = "I")
    public int field513;

    @OriginalMember(owner = "client!mm", name = "L", descriptor = "I")
    public int field516;

    @OriginalMember(owner = "client!mm", name = "M", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "Log;")
    public class157 field499;

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "Log;")
    public class157 field500;

    @OriginalMember(owner = "client!mm", name = "E", descriptor = "Lak;")
    public static class172 field509;

    @OriginalMember(owner = "client!mm", name = "K", descriptor = "Ljava/lang/String;")
    public String field515;

    @OriginalMember(owner = "client!mm", name = "G", descriptor = "Z")
    public boolean field511;

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "[Ljava/lang/Object;")
    public Object[] field501;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)V", line = 10)
    public static final void method205(int arg0) {
        field505++;
        if (arg0 < 6) {
            field502 = -7;
        }
        class157.field2529.method707(0);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(JI)V", line = 30)
    public static final void method206(long arg0, int arg1) {
        field517++;
        if (arg0 == 0L) {
            return;
        }
        if (!(class61.field875 < 100 || class2.field33) || class61.field875 >= 200) {
            class155.method1109(class246.field3895, 0, "", (byte) -47);
            return;
        }
        if (arg1 != -14736) {
            method208((class172) null, (byte) 28, (class172) null, (class172) null);
        }
        String var3 = class13.method74(arg1 + 14614, arg0);
        for (int var4 = 0; var4 < class61.field875; var4++) {
            if (class105.field1550[var4] == arg0) {
                class155.method1109(var3 + class94.field1289, 0, "", (byte) -47);
                return;
            }
        }
        for (int var5 = 0; var5 < class207.field3412; var5++) {
            if (class54.field769[var5] == arg0) {
                class155.method1109(class23.field315 + var3 + class316.field4887, 0, "", (byte) -47);
                return;
            }
        }
        if (var3.equals(class191.field3129.field5216)) {
            class155.method1109(class284.field4547, 0, "", (byte) -47);
            return;
        }
        class61.field858[class61.field875] = var3;
        class153.field2356++;
        class105.field1550[class61.field875] = arg0;
        class58.field824[class61.field875] = 0;
        class121.field1838[class61.field875] = "";
        class301.field4731[class61.field875] = 0;
        class191.field3130[class61.field875] = false;
        class61.field875++;
        class133.field2092 = class186.field3074;
        class194.field3175.method2375(50, 0);
        class194.field3175.method255(false, arg0);
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(I)Lqd;", line = 103)
    public static final class195 method207(int arg0) {
        field497++;
        if (arg0 != 0) {
            method207(-55);
        }
        try {
            return (class195) Class.forName("tc").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lak;BLak;Lak;)V", line = 121)
    public static final void method208(class172 arg0, byte arg1, class172 arg2, class172 arg3) {
        class277.field4465 = arg0;
        field503++;
        class126.field1969 = arg2;
        class165.field2756 = arg3;
        if (arg1 >= -20) {
            method209(32);
        }
    }

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)V", line = 150)
    public static void method209(int arg0) {
        field506 = null;
        field509 = null;
        field508 = null;
        if (arg0 != 0) {
            field502 = -74;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(III)V", line = 164)
    public static final void method210(int arg0, int arg1, int arg2) {
        class344 var3 = class110.method759(6, arg0, false);
        var3.method2390((byte) -70);
        var3.field5354 = arg2;
        if (arg1 == 50) {
            field512++;
        }
    }
}
