import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class197 extends class287 {

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public int field3142 = -1;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    public int field3153 = 0;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "Lrm;")
    public static class184 field3154 = new class184(64);

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "Lsb;")
    public static class127 field3159 = new class127(0, -1);

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public int field3141;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "I")
    public int field3143;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    public int field3144;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public int field3147;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public int field3148;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    public int field3149;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    public int field3150;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public static int field3151;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    public int field3152;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    public int field3155;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
    public int field3158;

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "Lug;")
    public static class253 field3160;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)Lha;", line = 9)
    public static final class26 method1458(boolean arg0) {
        field3145++;
        try {
            if (!arg0) {
                field3159 = (class127) null;
            }
            return (class26) Class.forName("mf").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class125();
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V", line = 34)
    public static final void method1459(byte arg0) {
        if (arg0 > 0) {
            class271.field4200.method1359(106);
            field3157++;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)V", line = 51)
    public static final void method1460(int arg0, int arg1) {
        class138.field2204 = arg1;
        field3156++;
        int var2 = -88 % ((arg0 + 42) / 40);
        class293.method2042(0, 3);
        class293.method2042(0, 4);
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)V", line = 73)
    public static void method1461(byte arg0) {
        int var1 = -69 % ((arg0 + 6) / 62);
        field3160 = null;
        field3154 = null;
        field3159 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZB)V", line = 95)
    public static final void method1462(boolean arg0, byte arg1) {
        if (arg1 != -50) {
            field3159 = (class127) null;
        }
        field3151++;
        class170.method1276(class95.field1258, class147.field2321, 3993, class127.field1841, arg0);
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V", line = 107)
    public static final void method1463(int arg0) {
        if (arg0 != -2547) {
            method1463(-73);
        }
        if (class105.field1388 == 10 && class109.field1458) {
            class68.method538(-116, 28);
        }
        field3146++;
        if (class105.field1388 == 30) {
            class68.method538(-118, 25);
        }
    }
}
