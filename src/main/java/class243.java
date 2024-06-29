import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class243 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "Lhh;")
    public static class163 field4294 = class137.method1065(" zuerst von Ihrer Freunde)2Liste(Q", 17);

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "Lhh;")
    public static class163 field4299 = class137.method1065("cookiehost", 17);

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "Lhh;")
    public static class163 field4300 = class137.method1065("Spieler", 17);

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Lhh;")
    public static class163 field4304 = class137.method1065("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", 17);

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "[Lvf;")
    public static class71[] field4303;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "[Lne;")
    public static class94[] field4301;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)V")
    public static final void method1677(int arg0, boolean arg1) {
        class235.method1637(class193.field3521, arg1, class205.field3706, 50, class233.field4160);
        field4296++;
        if (arg0 <= 57) {
            field4304 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIB)V")
    public static final void method1678(int arg0, int arg1, byte arg2) {
        if (arg2 < -112) {
            field4297++;
            class113 var3 = class126.method1001(-118, 1, arg1);
            var3.method898(-128);
            var3.field2127 = arg0;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(IZ)V")
    public static final void method1679(int arg0, boolean arg1) {
        field4305++;
        class114.field2149 = arg1;
        class254.field4444 = !class177.method1310(4643);
        if (arg0 != -1) {
            method1682((byte) -12);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public static final void method1680(byte arg0) {
        int var1 = 115 % ((arg0 + 15) / 34);
        class250.field4400.method111((byte) -52);
        field4298++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)J")
    public static final long method1681(int arg0, int arg1, int arg2) {
        class144 var3 = class259.field4542[arg0][arg1][arg2];
        return var3 == null || var3.field2731 == null ? 0L : var3.field2731.field2920;
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
    public static void method1682(byte arg0) {
        field4299 = null;
        field4304 = null;
        field4300 = null;
        field4294 = null;
        field4301 = null;
        if (arg0 == -47) {
            field4303 = null;
        }
    }
}
