import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class160 extends class203 {

    @OriginalMember(owner = "client!j", name = "E", descriptor = "I")
    private final int field2753;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    private final int field2746;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "I")
    private final int field2756;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    private final int field2748;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    public static int field2747 = 0;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public static int field2745 = 0;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    public static int field2749;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!j", name = "G", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V")
    public final void method739(int arg0, int arg1, int arg2) {
        ++field2751;
        if (arg0 != 20241) {
            field2745 = 78;
        }
        int var4 = this.field2753 * arg2 >> 12;
        int var5 = this.field2748 * arg1 >> 12;
        int var6 = this.field2756 * arg1 >> 12;
        int var7 = this.field2746 * arg2 >> 12;
        class175.method1182(64, var7, super.field3539, var4, var6, var5);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([BZ)Lmf;")
    public static final class10 method1048(byte[] arg0, boolean arg1) {
        ++field2744;
        if (arg0 == null) {
            return null;
        } else {
            if (arg1) {
                field2750 = -108;
            }
            class138 var2 = new class138(arg0, class246.field4200, class121.field2134, class30.field443, class244.field4165, class178.field3060);
            class47.method322(-29493);
            return var2;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(ZII)V")
    public final void method744(boolean arg0, int arg1, int arg2) {
        ++field2755;
        if (!arg0) {
            method1048((byte[]) null, false);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()V")
    public static final void method1049() {
        for (int var0 = 0; var0 < class272.field4811; ++var0) {
            for (int var4 = 0; var4 < class122.field2140; ++var4) {
                for (int var5 = 0; var5 < class202.field3521; ++var5) {
                    class99.field1780[var0][var4][var5] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class223.field3902; ++var1) {
            class203.field3534[var1] = null;
        }
        class223.field3902 = 0;
        for (int var2 = 0; var2 < class123.field2177; ++var2) {
            class111.field1946[var2] = null;
        }
        class123.field2177 = 0;
        for (int var3 = 0; var3 < class151.field2553.length; ++var3) {
            class151.field2553[var3] = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IBI)V")
    public final void method742(int arg0, byte arg1, int arg2) {
        if (arg1 != -53) {
            this.method744(true, -120, 45);
        }
        ++field2752;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BLjb;)V")
    public static final void method1050(byte arg0, class255 arg1) {
        class255 var2 = class51.method342(true, arg1);
        ++field2743;
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class154.field2664;
            var4 = class154.field2662;
        } else {
            var3 = var2.field4513;
            var4 = var2.field4482;
        }
        class8.method41(var4, var3, false, 42, arg1);
        class71.method500(89, var4, var3, arg1);
        int var5 = 64 % ((-24 - arg0) / 60);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(IIIIII)V")
    public class160(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field2753 = arg1;
        this.field2746 = arg3;
        this.field2756 = arg2;
        this.field2748 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V")
    public static final void method1051(int arg0) {
        for (int var1 = arg0; ~var1 > ~class196.field3375; ++var1) {
            int var2;
            if (~var1 != 0) {
                var2 = class151.field2556[var1];
            } else {
                var2 = 2047;
            }
            class44 var3 = class249.field4291[var2];
            if (var3 != null) {
                class191.method1312(var3.method311((byte) 117), (byte) 115, var3);
            }
        }
        ++field2749;
    }
}
