import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class134 extends class115 {

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
    public int field2451 = 0;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "Lud;")
    public static class279 field2452 = class130.method1024("<img=1>", 255);

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "Lud;")
    public static class279 field2450 = class130.method1024(")1", 255);

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "Lud;")
    public static class279 field2445 = class130.method1024("mapdots", 255);

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "[I")
    public static int[] field2448;

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "[Lqf;")
    public static class147[] field2444;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1049(int arg0) {
        field2442++;
        if (class199.field3560 || class124.field2261 == 2) {
            return;
        }
        try {
            class92.field1748.method1983(class124.field2252, 7308);
            if (arg0 != -3) {
                field2452 = (class279) null;
            }
        } catch (Throwable var2) {
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(I)V", line = 42)
    public static void method1050(int arg0) {
        field2444 = null;
        if (arg0 <= 85) {
            field2452 = (class279) null;
        }
        field2445 = null;
        field2450 = null;
        field2452 = null;
        field2448 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IILvh;)V", line = 58)
    private final void method1051(int arg0, int arg1, class53 arg2) {
        field2449++;
        if (arg1 == 2) {
            this.field2451 = arg2.method468(28214);
        }
        int var4 = -77 / ((-arg0 - 68) / 58);
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(B)V", line = 76)
    public static final void method1052(byte arg0) {
        class238.field4171.method1338((byte) -109);
        class153.field2771.method1338((byte) -118);
        class119.field2141.method1338((byte) -122);
        if (arg0 == -127) {
            class231.field4040.method1338((byte) -109);
            field2447++;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILqg;)V", line = 92)
    public static final void method1053(int arg0, class239 arg1) {
        field2446++;
        class52 var2 = (class52) class15.field438.method610(arg1.field4197.method2013(114), -1);
        if (arg0 >= -9) {
            field2452 = (class279) null;
        }
        if (var2 == null) {
            class311.method2212(arg1.field11[0], (byte) -82, arg1, class287.field5134, 0, arg1.field34[0], (class102) null, (class264) null);
        } else {
            var2.method434((byte) 30);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILvh;)V", line = 111)
    public final void method1054(int arg0, class53 arg1) {
        field2443++;
        while (true) {
            int var3 = arg1.method483(-118);
            if (var3 == 0) {
                if (arg0 != 2) {
                    field2450 = (class279) null;
                }
                return;
            }
            this.method1051(-126, var3, arg1);
        }
    }
}
