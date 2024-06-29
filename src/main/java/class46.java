import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class46 {

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Lti;")
    public static class147 field771 = null;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field775 = 0;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "I")
    public static int field779 = 0;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field778 = 0;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public int field769;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "I")
    public int field782;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "I")
    public int field783;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "Lkj;")
    public static class120 field774;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "Lqi;")
    public static class232 field780;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Ldk;")
    public static class251 field772;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "Ldk;")
    public static class251 field785;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "Z")
    public static boolean field768;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
    public static final void method329(int arg0) {
        class310.method2073(true);
        field777++;
        class266.method1790((byte) 98);
        class139.method971(false);
        class111.method779(-104);
        class155.method1062((byte) 80);
        class313.method2088(17970);
        if (arg0 != 30771) {
            return;
        }
        class60.method409((byte) -111);
        class273.method1825((byte) 35);
        class221.method1521(-15719);
        class292.method1946((byte) -99);
        class70.method481(-65536);
        class144.method1005(2);
        class216.method1499((byte) -77);
        class61.method414(-4096);
        class265.method1786((byte) -67);
        class176.method1287(arg0 ^ 0x7866);
        class279.method1880(false);
        class71.method489(100000);
        class180.method1308((byte) 115);
        class177.method1291((byte) -33);
        class109.method770((byte) 14);
        class189.field3059.method1255(-95);
        class119.field1904.method1255(arg0 - 30876);
        class75.field1245.method1255(-91);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BI)Lwe;")
    public static final class87 method330(byte arg0, int arg1) {
        if (arg0 < 31) {
            return null;
        }
        class87 var2 = (class87) class269.field4338.method694((long) arg1, false);
        field770++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class19.field234.method1680(arg1 & 0x7FFF, 1, -108);
        } else {
            var3 = field772.method1680(arg1, 1, -122);
        }
        class87 var4 = new class87();
        if (var3 != null) {
            var4.method595((byte) -10, new class162(var3));
        }
        if (arg1 >= 32768) {
            var4.method589(false);
        }
        class269.field4338.method693((long) arg1, 105, var4);
        return var4;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static void method331(byte arg0) {
        field785 = null;
        if (arg0 == -41) {
            field772 = null;
            field771 = null;
            field774 = null;
            field780 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIII)V")
    public static final void method332(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class229 var7 = new class229();
        var7.field3702 = arg1 / 128;
        var7.field3698 = arg2 / 128;
        var7.field3715 = arg3 / 128;
        var7.field3695 = arg4 / 128;
        var7.field3714 = arg0;
        var7.field3716 = arg1;
        var7.field3706 = arg2;
        var7.field3693 = arg3;
        var7.field3703 = arg4;
        var7.field3707 = arg5;
        var7.field3711 = arg6;
        class13.field133[class261.field4200++] = var7;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ldk;B)V")
    public static final void method333(class251 arg0, byte arg1) {
        field781++;
        if (arg1 != 40) {
            field778 = -41;
        }
    }
}
