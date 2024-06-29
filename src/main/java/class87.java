import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class87 extends class182 {

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "[I")
    public int[] field1597 = new int[] { -1 };

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "[I")
    public int[] field1599 = new int[1];

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    public static volatile int field1593 = -1;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "Lsg;")
    public static class169 field1592 = class165.method1060("title_mute", 1536);

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "Lsg;")
    public static class169 field1600 = class165.method1060("0(U", 1536);

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "Lsg;")
    public static class169 field1595 = class165.method1060("Schlie-8en", 1536);

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "Lcb;")
    public static class22 field1601 = new class22();

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "Lbg;")
    public static class18 field1598;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "Lke;")
    public static class95 field1594;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
    public static final void method516(int arg0) {
        field1596++;
        if (class105.field1925 && class61.field1132 != class26.field537) {
            class81.method494(class61.field1132, class93.field1745, class6.field131, class4.field79.field3734[0], -22725, class4.field79.field3729[0]);
            return;
        }
        if (class61.field1132 != class15.field324) {
            class15.field324 = class61.field1132;
            class144.method951(2092976880, class61.field1132);
        }
        if (arg0 > -29) {
            method518(-76, -45, null, 35, 103);
        }
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
    public static void method517(int arg0) {
        field1592 = null;
        field1595 = null;
        field1598 = null;
        field1600 = null;
        if (arg0 > -55) {
            method518(13, -115, null, -116, -44);
        }
        field1601 = null;
        field1594 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IILsg;II)V")
    public static final void method518(int arg0, int arg1, class169 arg2, int arg3, int arg4) {
        field1591++;
        class150 var5 = class121.method755(arg3, -5207, arg1);
        if (var5 == null || arg0 < 17) {
            return;
        }
        if (var5.field2786 != null) {
            class200 var6 = new class200();
            var6.field3903 = arg2;
            var6.field3907 = var5;
            var6.field3906 = arg4;
            var6.field3911 = var5.field2786;
            class172.method1147(-19955, var6);
        }
        boolean var7 = true;
        if (var5.field2872 > 0) {
            var7 = class142.method943((byte) 32, var5);
        }
        if (!var7 || !class199.method1305(class70.method436(var5, 106), arg4 - 1, 2)) {
            return;
        }
        if (arg4 == 1) {
            class37.field730++;
            class141.field2621.method1024(73, (byte) -94);
            class141.field2621.method802((byte) 64, arg3);
            class141.field2621.method801(arg1, (byte) 87);
        }
        if (arg4 == 2) {
            class141.field2621.method1024(38, (byte) -94);
            class127.field2314++;
            class141.field2621.method802((byte) 64, arg3);
            class141.field2621.method801(arg1, (byte) 87);
        }
        if (arg4 == 3) {
            class141.field2621.method1024(31, (byte) -94);
            class141.field2621.method802((byte) 64, arg3);
            class141.field2621.method801(arg1, (byte) 87);
            class77.field1451++;
        }
        if (arg4 == 4) {
            class141.field2621.method1024(106, (byte) -94);
            class27.field555++;
            class141.field2621.method802((byte) 64, arg3);
            class141.field2621.method801(arg1, (byte) 87);
        }
        if (arg4 == 5) {
            class141.field2621.method1024(0, (byte) -94);
            class141.field2621.method802((byte) 64, arg3);
            class54.field987++;
            class141.field2621.method801(arg1, (byte) 87);
        }
        if (arg4 == 6) {
            class204.field3984++;
            class141.field2621.method1024(243, (byte) -94);
            class141.field2621.method802((byte) 64, arg3);
            class141.field2621.method801(arg1, (byte) 87);
        }
        if (arg4 == 7) {
            class141.field2621.method1024(154, (byte) -94);
            class127.field2342++;
            class141.field2621.method802((byte) 64, arg3);
            class141.field2621.method801(arg1, (byte) 87);
        }
        if (arg4 == 8) {
            class6.field117++;
            class141.field2621.method1024(128, (byte) -94);
            class141.field2621.method802((byte) 64, arg3);
            class141.field2621.method801(arg1, (byte) 87);
        }
        if (arg4 == 9) {
            class141.field2621.method1024(212, (byte) -94);
            class178.field3471++;
            class141.field2621.method802((byte) 64, arg3);
            class141.field2621.method801(arg1, (byte) 87);
        }
        if (arg4 == 10) {
            class141.field2621.method1024(162, (byte) -94);
            class141.field2621.method802((byte) 64, arg3);
            class187.field3634++;
            class141.field2621.method801(arg1, (byte) 87);
        }
    }
}
