import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class227 {

    @OriginalMember(owner = "client!te", name = "i", descriptor = "Le;")
    public static class191 field4088 = class54.method368("overlay", 2047);

    @OriginalMember(owner = "client!te", name = "c", descriptor = "[S")
    public static short[] field4082 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!te", name = "b", descriptor = "Le;")
    public static class191 field4081 = class54.method368("<col=ffff00>", 2047);

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field4084 = 0;

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public static int field4091 = 0;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "Le;")
    public static class191 field4099 = class54.method368("leuchten1:", 2047);

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "I")
    public int field4083;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public int field4085;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "I")
    public int field4086;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public int field4087;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "I")
    public int field4092;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public int field4094;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "I")
    public int field4098;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "[B")
    public byte[] field4096;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "[B")
    public byte[] field4097;

    @OriginalMember(owner = "client!te", name = "k", descriptor = "[Lli;")
    public static class155[] field4090;

    @OriginalMember(owner = "client!te", name = "j", descriptor = "[Le;")
    public static class191[] field4089;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)V")
    public static final void method1622(int arg0, int arg1) {
        class88.field1436.method990(arg1 + 10036, arg0);
        field4080++;
        if (arg1 != -9919) {
            method1623(83);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
    public static void method1623(int arg0) {
        field4082 = null;
        field4089 = null;
        field4090 = null;
        field4088 = null;
        if (arg0 != -8256) {
            method1622(-121, 100);
        }
        field4081 = null;
        field4099 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lng;ILng;Lsi;)V")
    public static final void method1624(class121 arg0, int arg1, class121 arg2, class204 arg3) {
        class17.field233 = arg0;
        class9.field99 = arg3;
        class91.field1496 = arg2;
        field4095++;
        if (arg1 != -4163) {
            field4099 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BI)I")
    public static final int method1625(byte arg0, int arg1) {
        int var2 = 86 / ((55 - arg0) / 60);
        field4093++;
        return arg1 & 0xFF;
    }
}
