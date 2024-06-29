import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class161 extends class12 {

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "Ltg;")
    public static class184 field2902 = class135.method812(")4l", 3);

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "Ltg;")
    public static class184 field2898 = class135.method812("", 3);

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "Ltg;")
    public static class184 field2904 = class135.method812("au", 3);

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "Ltg;")
    public static class184 field2897 = class135.method812("sl_button", 3);

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "I")
    public static int field2903 = 0;

    @OriginalMember(owner = "client!rb", name = "bb", descriptor = "Ltg;")
    public static class184 field2907 = class135.method812("Benutzername: ", 3);

    @OriginalMember(owner = "client!rb", name = "N", descriptor = "I")
    public static int field2894;

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "I")
    private int field2895;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "I")
    private int field2901;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "I")
    public static int field2905;

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "I")
    public static int field2906;

    @OriginalMember(owner = "client!rb", name = "cb", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!rb", name = "db", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!rb", name = "eb", descriptor = "I")
    private int field2910;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(II)V")
    private final void method970(int arg0, int arg1) {
        if (arg1 != 0) {
            field2904 = null;
        }
        this.field2901 = (arg0 & 16711680) >> 12;
        this.field2895 = arg0 << 4 & 4080;
        this.field2910 = (arg0 & 65280) >> 4;
        ++field2900;
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)V")
    public static void method971(int arg0) {
        field2907 = null;
        field2897 = null;
        if (arg0 != 0) {
            method973(72, 47, (Component) null, -37);
        }
        field2898 = null;
        field2904 = null;
        field2902 = null;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        int var3 = -83 % ((arg1 - -58) / 34);
        int[][] var4 = super.field232.method673(arg0, 122);
        if (super.field232.field1962) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; ~var8 > ~class201.field3889; ++var8) {
                var5[var8] = this.field2901;
                var6[var8] = this.field2910;
                var7[var8] = this.field2895;
            }
        }
        ++field2906;
        return var4;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(IB)V")
    public static final void method972(int arg0, byte arg1) {
        if (arg1 >= 107) {
            ++field2909;
            if (class127.field2281 != arg0) {
                if (~class127.field2281 == -1) {
                    class128.method780(115);
                }
                if (arg0 == 20 || arg0 == 40) {
                    class136.field2472 = 0;
                    class41.field790 = 0;
                    class127.field2277 = 0;
                }
                if (arg0 != 20 && arg0 != 40 && class128.field2319 != null) {
                    class128.field2319.method515(-126);
                    class128.field2319 = null;
                }
                if (class127.field2281 == 25) {
                    class122.field2224 = 0;
                    class117.field2120 = 0;
                    class143.field2587 = 1;
                    class135.field2459 = 1;
                    class195.field3789 = 0;
                }
                if (~arg0 != -6 && arg0 != 10 && ~arg0 != -21) {
                    class74.method436((byte) -11);
                } else {
                    class31.method197(class117.field2124, class129.field2344, class126.field2270, (byte) 58);
                }
                class127.field2281 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "()V")
    public class161() {
        this(0);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILjava/awt/Component;I)Lnf;")
    public static final class129 method973(int arg0, int arg1, Component arg2, int arg3) {
        ++field2908;
        try {
            Class var4 = Class.forName("hf");
            if (arg0 != 4080) {
                return null;
            } else {
                class129 var5 = (class129) var4.newInstance();
                var5.method442(arg1, arg2, arg3, arg0 + -4080);
                return var5;
            }
        } catch (Throwable var7) {
            class111 var6 = new class111();
            var6.method442(arg1, arg2, arg3, 0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(I)V")
    private class161(int arg0) {
        super(0, false);
        this.method970(arg0, 0);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        if (arg2) {
            field2902 = null;
        }
        if (arg1 == 0) {
            this.method970(arg0.method568((byte) -108), 0);
        }
        ++field2905;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(II)Z")
    public static final boolean method974(int arg0, int arg1) {
        int var2 = 57 % ((64 - arg1) / 57);
        ++field2894;
        return ~(1 & arg0 >> 21) != -1;
    }
}
