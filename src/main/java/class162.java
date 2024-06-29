import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public abstract class class162 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Z")
    public static boolean field2246 = false;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Lnn;")
    public static class151 field2249 = new class151("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public static int field2253 = 16777215;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field2254 = 0;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public static int field2255 = 0;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "[I")
    public static int[] field2256 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "Liq;")
    public static class134 field2247;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lje;B)V")
    public static final void method980(class169 arg0, byte arg1) {
        field2250++;
        int var2 = -59 % ((50 - arg1) / 58);
        class71 var3 = (class71) class466.field6858.method2302((long) arg0.field1929, 23576);
        if (var3 == null) {
            class113.method685(0, arg0, arg0.field1902, (class85) null, arg0.field2018[0], arg0.field2019[0], (byte) -116, (class155) null);
        } else {
            var3.method473((byte) 41);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)Lol;")
    public abstract class174 method576(byte arg0);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public abstract void method583(int arg0);

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public static final void method981(int arg0) {
        if (arg0 != 4) {
            field2247 = null;
        }
        class359.field5313.method1482((byte) 92);
        field2251++;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
    public static void method982(boolean arg0) {
        field2256 = null;
        field2249 = null;
        if (arg0) {
            field2247 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZI)Z")
    public abstract boolean method578(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
    public abstract void method580(int arg0);
}
