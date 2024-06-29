import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public abstract class class77 {

    @OriginalMember(owner = "client!vp", name = "g", descriptor = "I")
    public static int field1030 = 0;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "[I")
    public static int[] field1025;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(B)Z")
    public abstract boolean method497(byte arg0);

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(ILiq;Liq;Liq;Le;)Z")
    public static final boolean method498(int arg0, class134 arg1, class134 arg2, class134 arg3, class255 arg4) {
        class145.field1986 = arg3;
        if (arg0 != 0) {
            method498(-93, (class134) null, (class134) null, (class134) null, (class255) null);
        }
        class187.field2799 = arg2;
        class192.field2900 = arg1;
        class311.field4685 = arg4;
        field1028++;
        return true;
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)Z")
    public final boolean method499(int arg0) {
        if (arg0 < 20) {
            field1025 = null;
        }
        field1024++;
        return this.method497((byte) 97) || this.method507(32768) || this.method503(0);
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(B)V")
    public static void method500(byte arg0) {
        if (arg0 != -24) {
            method506(true);
        }
        field1025 = null;
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)I")
    public abstract int method501(int arg0);

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(B)Lhc;")
    public abstract class281 method502(byte arg0);

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "(I)Z")
    public abstract boolean method503(int arg0);

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "(B)V")
    public static final void method504(byte arg0) {
        if (class301.field4543 != null) {
            class301.field4543.method2163(true);
            class301.field4543 = null;
        }
        field1027++;
        class196.method1170(68);
        class375.method2250();
        for (int var1 = 0; var1 < 4; var1++) {
            class449.field6599[var1].method2257(9116);
        }
        class302.method1860(-98, false);
        System.gc();
        class119.method711(2, (byte) -63);
        class437.field6428 = false;
        class195.field2944 = -1;
        class465.method2865(127, true);
        class53.field718 = 0;
        class137.field1860 = 0;
        class17.field250 = 0;
        class112.field1487 = 0;
        class151.field2088 = false;
        for (int var2 = 0; var2 < class55.field744.length; var2++) {
            class55.field744[var2] = null;
        }
        class142.method889(-10753);
        for (int var3 = 0; var3 < 2048; var3++) {
            class140.field1883[var3] = null;
        }
        if (arg0 < 11) {
            method500((byte) -57);
        }
        class38.field458 = 0;
        for (int var4 = 0; var4 < 32768; var4++) {
            class170.field2626[var4] = null;
        }
        class45.field557.method2307(5142);
        class265.method1645((byte) 117);
        class28.field361 = 0;
        class333.method2038(-1);
        class326.method2012((byte) -5);
        class318.method1945((byte) -91);
        class378.method2275(true, 106);
        try {
            class232.method1404(class79.field1043.field3583, 80, "loggedout");
        } catch (Throwable var5) {
        }
        class174.field2663 = 0L;
        class303.field4580 = null;
    }

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "(B)I")
    public abstract int method505(byte arg0);

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(Z)V")
    public static final void method506(boolean arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class79.field1038[var1] = false;
        }
        field1029++;
        class80.field1054 = 5;
        class391.field5769 = -1;
        class414.field6156 = class26.field332;
        class451.field6652 = 0;
        class363.field5348 = class185.field2790;
        class75.field1014 = class196.field2967;
        class341.field5109 = class201.field3037;
        class176.field2674 = 0;
        class374.field5449 = class127.field1626;
        class411.field6114 = class350.field5204;
        if (!arg0) {
            field1025 = null;
        }
        class284.field4337 = -1;
    }

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "(I)Z")
    public abstract boolean method507(int arg0);

    @OriginalMember(owner = "client!vp", name = "f", descriptor = "(B)V")
    public abstract void method508(byte arg0);

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "(I)V")
    public static final void method509(int arg0) {
        class353.field5221 = null;
        class314.field4754 = null;
        class265.field4049 = null;
        class62.field788 = null;
        field1026++;
        class115.field1524 = false;
        class213.field3204 = null;
        if (arg0 == 0) {
            class141.method887((byte) -108);
        }
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(Z)V")
    public abstract void method510(boolean arg0);
}
