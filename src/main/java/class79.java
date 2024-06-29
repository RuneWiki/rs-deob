import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class79 {

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "Lof;")
    private class620 field827 = new class620(64);

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "Lof;")
    public class620 field832 = new class620(2);

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "Loh;")
    private class404 field830;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "Loh;")
    public class404 field822;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "I")
    public static int field824;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
    public static int field826;

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "I")
    public static int field831;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jv", name = "m", descriptor = "Ljava/lang/Class;")
    public static Class field833;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method555(int arg0, String arg1) {
        if (arg0 != 33) {
            method559((byte) 92, null, null);
        }
        field823++;
        return class736.method4102(field833 == null ? (field833 = method562("mi")) : field833, arg1, -3);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(II)Ljw;")
    public final class552 method556(int arg0, int arg1) {
        field829++;
        class620 var3 = this.field827;
        class552 var4;
        synchronized (this.field827) {
            var4 = (class552) this.field827.method3538((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class404 var5 = this.field830;
        byte[] var6;
        synchronized (this.field830) {
            var6 = this.field830.method2481(33, arg0, (byte) 115);
        }
        class552 var7 = new class552();
        var7.field7914 = this;
        if (arg1 != 15563) {
            this.field827 = null;
        }
        if (var6 != null) {
            var7.method3234(new class244(var6), arg1 ^ 0xFFFFC36E);
        }
        class620 var8 = this.field827;
        synchronized (this.field827) {
            this.field827.method3537(76, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public static final void method557(int arg0, int arg1, int arg2, String arg3, int arg4) {
        if (arg1 >= -118) {
            field828 = 52;
        }
        field821++;
        class532 var5 = class689.method3895((byte) 127, arg0, arg4);
        if (var5 == null) {
            return;
        }
        if (var5.field7588 != null) {
            class622 var6 = new class622();
            var6.field8908 = var5;
            var6.field8915 = arg3;
            var6.field8904 = var5.field7588;
            var6.field8913 = arg2;
            class133.method859(var6);
        }
        if (class392.field5397 != 10 || !client.method1779(var5).method4187(arg2 - 1, -99)) {
            return;
        }
        if (arg2 == 1) {
            class391.field5393++;
            class249 var7 = class289.method1715(class503.field7071, 52, class41.field470);
            class304.method1828(var5.field7691, arg4, 0, arg0, var7);
            class510.method3017(var7, 57);
        }
        if (arg2 == 2) {
            class450.field6493++;
            class249 var8 = class289.method1715(class503.field7068, 63, class41.field470);
            class304.method1828(var5.field7691, arg4, 0, arg0, var8);
            class510.method3017(var8, 53);
        }
        if (arg2 == 3) {
            class249.field3018++;
            class249 var9 = class289.method1715(class359.field4590, 107, class41.field470);
            class304.method1828(var5.field7691, arg4, 0, arg0, var9);
            class510.method3017(var9, 67);
        }
        if (arg2 == 4) {
            class225.field2579++;
            class249 var10 = class289.method1715(class311.field3858, 53, class41.field470);
            class304.method1828(var5.field7691, arg4, 0, arg0, var10);
            class510.method3017(var10, 80);
        }
        if (arg2 == 5) {
            class14.field127++;
            class249 var11 = class289.method1715(class293.field3612, 70, class41.field470);
            class304.method1828(var5.field7691, arg4, 0, arg0, var11);
            class510.method3017(var11, 83);
        }
        if (arg2 == 6) {
            class588.field8299++;
            class249 var12 = class289.method1715(class370.field4727, 91, class41.field470);
            class304.method1828(var5.field7691, arg4, 0, arg0, var12);
            class510.method3017(var12, 50);
        }
        if (arg2 == 7) {
            class232.field2710++;
            class249 var13 = class289.method1715(class374.field4812, 74, class41.field470);
            class304.method1828(var5.field7691, arg4, 0, arg0, var13);
            class510.method3017(var13, 118);
        }
        if (arg2 == 8) {
            class542.field7798++;
            class249 var14 = class289.method1715(class627.field8996, 57, class41.field470);
            class304.method1828(var5.field7691, arg4, 0, arg0, var14);
            class510.method3017(var14, 112);
        }
        if (arg2 == 9) {
            class414.field5639++;
            class249 var15 = class289.method1715(class229.field2661, 92, class41.field470);
            class304.method1828(var5.field7691, arg4, 0, arg0, var15);
            class510.method3017(var15, 126);
        }
        if (arg2 == 10) {
            class564.field8033++;
            class249 var16 = class289.method1715(class258.field3150, 81, class41.field470);
            class304.method1828(var5.field7691, arg4, 0, arg0, var16);
            class510.method3017(var16, 101);
        }
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(II)V")
    public final void method558(int arg0, int arg1) {
        class620 var3 = this.field827;
        synchronized (this.field827) {
            if (arg0 > -81) {
                return;
            }
            this.field827.method3539((byte) 124, arg1);
        }
        field826++;
        class620 var4 = this.field832;
        synchronized (this.field832) {
            this.field832.method3539((byte) 115, arg1);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(BLjava/lang/String;Ljava/io/File;)V")
    public static final void method559(byte arg0, String arg1, File arg2) {
        if (arg0 != 125) {
            field828 = 8;
        }
        class326.field4234.put(arg1, arg2);
        field825++;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V")
    public final void method560(byte arg0) {
        class620 var2 = this.field827;
        synchronized (this.field827) {
            this.field827.method3541(-647);
        }
        field831++;
        class620 var3 = this.field832;
        synchronized (this.field832) {
            this.field832.method3541(-647);
        }
        if (arg0 >= -79) {
            method555(45, null);
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
    public final void method561(int arg0) {
        field824++;
        class620 var2 = this.field827;
        synchronized (this.field827) {
            this.field827.method3549(0);
        }
        class620 var3 = this.field832;
        synchronized (this.field832) {
            int var4 = 11 / ((arg0 - 44) / 39);
            this.field832.method3549(0);
        }
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Lnb;ILoh;Loh;)V")
    public class79(class301 arg0, int arg1, class404 arg2, class404 arg3) {
        this.field830 = arg2;
        this.field822 = arg3;
        this.field830.method2482(0, 33);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method562(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
