import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class287 {

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public int field4109;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "I")
    public int field4108;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public int field4110;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "I")
    public int field4115;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field4106 = new String[200];

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "Lki;")
    public static class498 field4105 = new class498(78, 15);

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "Lri;")
    public static class73 field4113 = new class73(43, 8);

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "Ls;")
    public static class183 field4116;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)Lmf;", line = 3)
    public final class287 method1849(int arg0, int arg1) {
        if (arg0 == 78) {
            field4107++;
            return new class287(this.field4115, arg1, this.field4110, this.field4108);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V", line = 17)
    public static void method1850(int arg0) {
        if (arg0 != 15) {
            field4116 = null;
        }
        field4113 = null;
        field4106 = null;
        field4105 = null;
        field4116 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIILkn;I)V", line = 43)
    public static final void method1851(int arg0, int arg1, int arg2, class519 arg3, int arg4) {
        field4112++;
        for (class404 var5 = (class404) class46.field732.method816(arg0 ^ 0x2F); var5 != null; var5 = (class404) class46.field732.method812(97)) {
            if (var5.field6101 == arg2 && arg4 << 7 == var5.field6104 && (arg1 << 7) == var5.field6102 && var5.field6083.field7580 == arg3.field7580) {
                if (var5.field6085 != null) {
                    class366.field5591.method1794(var5.field6085);
                    var5.field6085 = null;
                }
                if (var5.field6093 != null) {
                    class366.field5591.method1794(var5.field6093);
                    var5.field6093 = null;
                }
                var5.method2049(-81);
                return;
            }
        }
        if (arg0 != 78) {
            method1853(112L, (byte) -81, null);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIZLvg;)V", line = 86)
    public static final void method1852(int arg0, int arg1, boolean arg2, class38 arg3) {
        if (!arg2) {
            field4113 = null;
        }
        class142.field2124 = arg1;
        class304.field4293 = arg0;
        field4114++;
        class192.field2814 = arg3;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(JBLqa;)V", line = 99)
    public static final void method1853(long arg0, byte arg1, class162 arg2) {
        field4111++;
        class151.field2256 = 0;
        class473.field6969 = class204.field2945;
        class204.field2945 = 0;
        long var4 = class256.method1708((byte) 118);
        for (class201 var6 = (class201) class190.field2802.method1873((byte) -127); var6 != null; var6 = (class201) class190.field2802.method1880(-61)) {
            if (var6.method1368(arg2, arg0)) {
                class151.field2256++;
            }
        }
        if (arg1 < 72) {
            method1850(-16);
        }
        if (class376.field5740 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + class190.field2802.method1876(-12569) + ", running: " + class151.field2256 + ". Particles: " + class204.field2945 + ". Time taken: " + (class256.method1708((byte) 118) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(IIII)V", line = 132)
    public class287(int arg0, int arg1, int arg2, int arg3) {
        this.field4109 = arg1;
        this.field4108 = arg3;
        this.field4110 = arg2;
        this.field4115 = arg0;
    }
}
